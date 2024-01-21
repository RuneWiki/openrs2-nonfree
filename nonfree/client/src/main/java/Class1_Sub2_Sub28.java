import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pa")
public final class Class1_Sub2_Sub28 extends Class1_Sub2 {

	@OriginalMember(owner = "client!pa", name = "V", descriptor = "I")
	private int anInt3422;

	@OriginalMember(owner = "client!pa", name = "eb", descriptor = "I")
	private int anInt3429;

	@OriginalMember(owner = "client!pa", name = "gb", descriptor = "[I")
	private int[] anIntArray329;

	@OriginalMember(owner = "client!pa", name = "db", descriptor = "I")
	private int anInt3428;

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(IILclient!fa;)V")
	@Override
	public void method3393(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub9 arg1) {
		if (arg0 == 0) {
			this.anInt3428 = arg1.method1280();
		}
	}

	@OriginalMember(owner = "client!pa", name = "f", descriptor = "(B)Z")
	private boolean method2562() {
		if (this.anIntArray329 != null) {
			return true;
		} else if (this.anInt3428 >= 0) {
			@Pc(29) int local29 = Static20.anInterface2_2.method3422(this.anInt3428) ? 64 : 128;
			this.anIntArray329 = Static20.anInterface2_2.method3421(this.anInt3428);
			this.anInt3429 = local29;
			this.anInt3422 = local29;
			return this.anIntArray329 != null;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!pa", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method3391(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass19_41.method1028(arg0);
		if (super.aClass19_41.aBoolean54 && this.method2562()) {
			@Pc(35) int local35 = this.anInt3422 * (Static181.anInt4508 == this.anInt3429 ? arg0 : this.anInt3429 * arg0 / Static181.anInt4508);
			@Pc(39) int[] local39 = local11[0];
			@Pc(43) int[] local43 = local11[1];
			@Pc(47) int[] local47 = local11[2];
			@Pc(53) int local53;
			@Pc(61) int local61;
			if (this.anInt3422 == Static22.anInt596) {
				for (local53 = 0; local53 < Static22.anInt596; local53++) {
					local61 = this.anIntArray329[local35++];
					local47[local53] = (local61 & 0xFF) << 4;
					local43[local53] = local61 >> 4 & 0xFF0;
					local39[local53] = local61 >> 12 & 0xFF0;
				}
			} else {
				for (local53 = 0; local53 < Static22.anInt596; local53++) {
					local61 = this.anInt3422 * local53 / Static22.anInt596;
					@Pc(109) int local109 = this.anIntArray329[local61 + local35];
					local47[local53] = (local109 & 0xFF) << 4;
					local43[local53] = local109 >> 4 & 0xFF0;
					local39[local53] = local109 >> 12 & 0xFF0;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!pa", name = "b", descriptor = "(Z)I")
	@Override
	public int method3403() {
		return this.anInt3428;
	}
}
