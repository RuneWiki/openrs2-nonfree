import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uf")
public final class Class1_Sub1_Sub36 extends Class1_Sub1 {

	@OriginalMember(owner = "client!uf", name = "gb", descriptor = "I")
	private int anInt4427;

	@OriginalMember(owner = "client!uf", name = "jb", descriptor = "I")
	private int anInt4430;

	@OriginalMember(owner = "client!uf", name = "mb", descriptor = "[I")
	private int[] anIntArray331;

	@OriginalMember(owner = "client!uf", name = "rb", descriptor = "I")
	private int anInt4436 = -1;

	@OriginalMember(owner = "client!uf", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub36() {
		super(0, false);
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(Lclient!k;BI)V")
	@Override
	public void method3738(@OriginalArg(0) Class1_Sub16 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt4436 = arg0.method3805();
		}
	}

	@OriginalMember(owner = "client!uf", name = "h", descriptor = "(I)I")
	@Override
	public int method3736() {
		return this.anInt4436;
	}

	@OriginalMember(owner = "client!uf", name = "e", descriptor = "(I)V")
	@Override
	public void method3727() {
		super.method3727();
		this.anIntArray331 = null;
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method3735(@OriginalArg(0) int arg0) {
		@Pc(12) int[][] local12 = super.aClass75_41.method2410(arg0);
		if (super.aClass75_41.aBoolean134 && this.method3441()) {
			@Pc(24) int[] local24 = local12[0];
			@Pc(44) int local44 = (Static187.anInt4033 == this.anInt4427 ? arg0 : this.anInt4427 * arg0 / Static187.anInt4033) * this.anInt4430;
			@Pc(48) int[] local48 = local12[2];
			@Pc(52) int[] local52 = local12[1];
			@Pc(58) int local58;
			@Pc(66) int local66;
			if (this.anInt4430 == Static157.anInt3431) {
				for (local58 = 0; local58 < Static157.anInt3431; local58++) {
					local66 = this.anIntArray331[local44++];
					local48[local58] = (local66 & 0xFF) << 4;
					local52[local58] = local66 >> 4 & 0xFF0;
					local24[local58] = local66 >> 12 & 0xFF0;
				}
			} else {
				for (local58 = 0; local58 < Static157.anInt3431; local58++) {
					local66 = this.anInt4430 * local58 / Static157.anInt3431;
					@Pc(119) int local119 = this.anIntArray331[local44 + local66];
					local48[local58] = (local119 & 0xFF) << 4;
					local52[local58] = local119 >> 4 & 0xFF0;
					local24[local58] = local119 >> 12 & 0xFF0;
				}
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!uf", name = "i", descriptor = "(I)Z")
	private boolean method3441() {
		if (this.anIntArray331 != null) {
			return true;
		} else if (this.anInt4436 >= 0) {
			@Pc(21) int local21 = Static157.anInt3431;
			@Pc(23) int local23 = Static187.anInt4033;
			@Pc(33) int local33 = Static41.anInterface3_1.method124(this.anInt4436) ? 64 : 128;
			this.anIntArray331 = Static41.anInterface3_1.method126(this.anInt4436);
			this.anInt4427 = local33;
			this.anInt4430 = local33;
			Static78.method1353(local23, local21);
			return this.anIntArray331 != null;
		} else {
			return false;
		}
	}
}
