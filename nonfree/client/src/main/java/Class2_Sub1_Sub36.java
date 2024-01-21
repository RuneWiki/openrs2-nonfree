import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ub")
public final class Class2_Sub1_Sub36 extends Class2_Sub1 {

	@OriginalMember(owner = "client!ub", name = "X", descriptor = "I")
	private int anInt3825;

	@OriginalMember(owner = "client!ub", name = "Z", descriptor = "I")
	private int anInt3827;

	@OriginalMember(owner = "client!ub", name = "ab", descriptor = "I")
	private int anInt3828;

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(Lclient!me;IB)V")
	@Override
	public void method2799(@OriginalArg(0) Class2_Sub13 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt3827 = arg0.method1397();
		} else if (arg1 == 1) {
			this.anInt3825 = arg0.method1397();
		} else if (arg1 == 2) {
			this.anInt3828 = arg0.method1397();
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(IZ)[[I")
	@Override
	public int[][] method2792(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass66_39.method1971(arg0);
		if (super.aClass66_39.aBoolean123) {
			@Pc(28) int[][] local28 = this.method2794(0, arg0);
			@Pc(32) int[] local32 = local28[0];
			@Pc(36) int[] local36 = local28[2];
			@Pc(40) int[] local40 = local28[1];
			@Pc(44) int[] local44 = local11[1];
			@Pc(48) int[] local48 = local11[0];
			@Pc(52) int[] local52 = local11[2];
			for (@Pc(54) int local54 = 0; local54 < Static120.anInt2812; local54++) {
				@Pc(60) int local60 = local32[local54];
				@Pc(64) int local64 = local36[local54];
				@Pc(68) int local68 = local40[local54];
				if (local64 == local60 && local64 == local68) {
					local48[local54] = this.anInt3827 * local60 >> 12;
					local44[local54] = local64 * this.anInt3825 >> 12;
					local52[local54] = this.anInt3828 * local68 >> 12;
				} else {
					local48[local54] = this.anInt3827;
					local44[local54] = this.anInt3825;
					local52[local54] = this.anInt3828;
				}
			}
		}
		return local11;
	}
}
