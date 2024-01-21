import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ua")
public final class Class2_Sub1_Sub35 extends Class2_Sub1 {

	@OriginalMember(owner = "client!ua", name = "W", descriptor = "I")
	private int anInt3789;

	@OriginalMember(owner = "client!ua", name = "eb", descriptor = "I")
	private int anInt3795;

	@OriginalMember(owner = "client!ua", name = "U", descriptor = "I")
	private int anInt3787;

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method2801(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass81_39.method2606(arg0);
		if (super.aClass81_39.aBoolean153) {
			@Pc(26) int[] local26 = this.method2796(0, arg0);
			for (@Pc(28) int local28 = 0; local28 < Static120.anInt2812; local28++) {
				local16[local28] = (this.anInt3789 * local26[local28] >> 12) + this.anInt3795;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(Lclient!me;IB)V")
	@Override
	public void method2799(@OriginalArg(0) Class2_Sub13 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt3795 = arg0.method1397();
		} else if (arg1 == 1) {
			this.anInt3787 = arg0.method1397();
		} else if (arg1 == 2) {
			super.aBoolean175 = arg0.method1402() == 1;
		}
	}

	@OriginalMember(owner = "client!ua", name = "c", descriptor = "(I)V")
	@Override
	public void method2789() {
		this.anInt3789 = this.anInt3787 - this.anInt3795;
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(IZ)[[I")
	@Override
	public int[][] method2792(@OriginalArg(0) int arg0) {
		@Pc(20) int[][] local20 = super.aClass66_39.method1971(arg0);
		if (super.aClass66_39.aBoolean123) {
			@Pc(30) int[][] local30 = this.method2794(0, arg0);
			@Pc(34) int[] local34 = local30[0];
			@Pc(38) int[] local38 = local30[1];
			@Pc(42) int[] local42 = local20[0];
			@Pc(46) int[] local46 = local30[2];
			@Pc(50) int[] local50 = local20[1];
			@Pc(54) int[] local54 = local20[2];
			for (@Pc(56) int local56 = 0; local56 < Static120.anInt2812; local56++) {
				local42[local56] = (this.anInt3789 * local34[local56] >> 12) + this.anInt3795;
				local50[local56] = (local38[local56] * this.anInt3789 >> 12) + this.anInt3795;
				local54[local56] = this.anInt3795 + (local46[local56] * this.anInt3789 >> 12);
			}
		}
		return local20;
	}
}
