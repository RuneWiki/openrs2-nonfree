import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!na")
public final class Class3_Sub2_Sub21 extends Class3_Sub2 {

	@OriginalMember(owner = "client!na", name = "ab", descriptor = "I")
	private int anInt2674 = 4096;

	@OriginalMember(owner = "client!na", name = "hb", descriptor = "I")
	private int anInt2678 = 4096;

	@OriginalMember(owner = "client!na", name = "jb", descriptor = "I")
	private int anInt2680 = 4096;

	@OriginalMember(owner = "client!na", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub21() {
		super(1, false);
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method3326(@OriginalArg(1) int arg0) {
		@Pc(17) int[][] local17 = super.aClass67_41.method1940(arg0);
		if (super.aClass67_41.aBoolean135) {
			@Pc(27) int[][] local27 = this.method3332(0, arg0);
			@Pc(31) int[] local31 = local27[1];
			@Pc(35) int[] local35 = local27[0];
			@Pc(39) int[] local39 = local17[2];
			@Pc(43) int[] local43 = local17[0];
			@Pc(47) int[] local47 = local27[2];
			@Pc(51) int[] local51 = local17[1];
			for (@Pc(53) int local53 = 0; local53 < Static190.anInt3865; local53++) {
				@Pc(59) int local59 = local35[local53];
				@Pc(63) int local63 = local31[local53];
				@Pc(67) int local67 = local47[local53];
				if (local67 == local59 && local63 == local67) {
					local43[local53] = local59 * this.anInt2678 >> 12;
					local51[local53] = this.anInt2674 * local67 >> 12;
					local39[local53] = this.anInt2680 * local63 >> 12;
				} else {
					local43[local53] = this.anInt2678;
					local51[local53] = this.anInt2674;
					local39[local53] = this.anInt2680;
				}
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(Lclient!ce;II)V")
	@Override
	public void method3337(@OriginalArg(0) Class3_Sub4 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt2678 = arg0.method1270();
		} else if (arg1 == 1) {
			this.anInt2674 = arg0.method1270();
		} else if (arg1 == 2) {
			this.anInt2680 = arg0.method1270();
		}
	}
}
