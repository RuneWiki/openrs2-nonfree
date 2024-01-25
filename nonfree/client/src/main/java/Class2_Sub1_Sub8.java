import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ge")
public class Class2_Sub1_Sub8 extends Class2_Sub1 {

	@OriginalMember(owner = "client!ge", name = "M", descriptor = "[I")
	protected int[] anIntArray169;

	@OriginalMember(owner = "client!ge", name = "P", descriptor = "I")
	protected int anInt2125;

	@OriginalMember(owner = "client!ge", name = "T", descriptor = "I")
	protected int anInt2129;

	@OriginalMember(owner = "client!ge", name = "V", descriptor = "I")
	private int anInt2131 = -1;

	@OriginalMember(owner = "client!ge", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub8() {
		super(0, false);
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method6060(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass26_41.method350(arg0);
		if (super.aClass26_41.aBoolean41 && this.method1695()) {
			@Pc(28) int[] local28 = local16[0];
			@Pc(32) int[] local32 = local16[1];
			@Pc(36) int[] local36 = local16[2];
			@Pc(52) int local52 = this.anInt2125 * (this.anInt2129 == Static299.anInt5583 ? arg0 : arg0 * this.anInt2129 / Static299.anInt5583);
			@Pc(58) int local58;
			@Pc(67) int local67;
			if (Static391.anInt7118 == this.anInt2125) {
				for (local58 = 0; local58 < Static391.anInt7118; local58++) {
					local67 = this.anIntArray169[local52++];
					local36[local58] = (local67 & 0xFF) << 4;
					local32[local58] = local67 >> 4 & 0xFF0;
					local28[local58] = local67 >> 12 & 0xFF0;
				}
			} else {
				for (local58 = 0; local58 < Static391.anInt7118; local58++) {
					local67 = this.anInt2125 * local58 / Static391.anInt7118;
					@Pc(74) int local74 = this.anIntArray169[local67 + local52];
					local36[local58] = (local74 & 0xFF) << 4;
					local32[local58] = local74 >> 4 & 0xFF0;
					local28[local58] = local74 >> 12 & 0xFF0;
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!ge", name = "d", descriptor = "(B)I")
	@Override
	public final int method6066() {
		return this.anInt2131;
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(IILclient!vt;)V")
	@Override
	public final void method6064(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub24 arg1) {
		if (arg0 == 0) {
			this.anInt2131 = arg1.method5753();
		}
	}

	@OriginalMember(owner = "client!ge", name = "d", descriptor = "(I)Z")
	protected final boolean method1695() {
		if (this.anIntArray169 != null) {
			return true;
		} else if (this.anInt2131 >= 0) {
			@Pc(33) Class128 local33 = Static113.anInt5763 < 0 ? Static399.method3372(Static160.aClass83_65, this.anInt2131) : Static399.method3370(Static160.aClass83_65, Static113.anInt5763, this.anInt2131);
			local33.method3364();
			this.anIntArray169 = local33.method3376();
			this.anInt2129 = local33.anInt3863;
			this.anInt2125 = local33.anInt3865;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ge", name = "c", descriptor = "(Z)V")
	@Override
	public final void method6065() {
		super.method6065();
		this.anIntArray169 = null;
	}
}
