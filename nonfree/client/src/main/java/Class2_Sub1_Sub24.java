import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ne")
public final class Class2_Sub1_Sub24 extends Class2_Sub1 {

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method2801(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass81_39.method2606(arg0);
		if (super.aClass81_39.aBoolean153) {
			for (@Pc(22) int local22 = 0; local22 < Static120.anInt2812; local22++) {
				this.method1763(local22, arg0);
				@Pc(35) int[] local35 = this.method2796(0, Static158.anInt3649);
				local16[local22] = local35[Static40.anInt1161];
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!ne", name = "b", descriptor = "(III)V")
	private void method1763(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(13) int local13 = Static11.anIntArray8[arg1];
		@Pc(17) int local17 = Static69.anIntArray117[arg0];
		@Pc(28) float local28 = (float) Math.atan2((double) (local17 - 2048), (double) (local13 - 2048));
		if ((double) local28 >= -3.141592653589793D && (double) local28 <= -2.356194490192345D) {
			Static158.anInt3649 = arg1;
			Static40.anInt1161 = arg0;
		} else if ((double) local28 <= -1.5707963267948966D && (double) local28 >= -2.356194490192345D) {
			Static40.anInt1161 = arg1;
			Static158.anInt3649 = arg0;
		} else if ((double) local28 <= -0.7853981633974483D && (double) local28 >= -1.5707963267948966D) {
			Static158.anInt3649 = arg0;
			Static40.anInt1161 = Static120.anInt2812 - arg1;
		} else if (local28 <= 0.0F && (double) local28 >= -0.7853981633974483D) {
			Static40.anInt1161 = arg0;
			Static158.anInt3649 = Static11.anInt283 - arg1;
		} else if (local28 >= 0.0F && (double) local28 <= 0.7853981633974483D) {
			Static158.anInt3649 = Static11.anInt283 - arg1;
			Static40.anInt1161 = Static120.anInt2812 - arg0;
		} else if ((double) local28 >= 0.7853981633974483D && (double) local28 <= 1.5707963267948966D) {
			Static40.anInt1161 = Static120.anInt2812 - arg1;
			Static158.anInt3649 = Static11.anInt283 - arg0;
		} else if ((double) local28 >= 1.5707963267948966D && (double) local28 <= 2.356194490192345D) {
			Static40.anInt1161 = arg1;
			Static158.anInt3649 = Static11.anInt283 - arg0;
		} else if ((double) local28 >= 2.356194490192345D && (double) local28 <= 3.141592653589793D) {
			Static40.anInt1161 = Static120.anInt2812 - arg0;
			Static158.anInt3649 = arg1;
		}
		Static40.anInt1161 &= Static49.anInt1370;
		Static158.anInt3649 &= Static180.anInt4192;
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(Lclient!me;IB)V")
	@Override
	public void method2799(@OriginalArg(0) Class2_Sub13 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			super.aBoolean175 = arg0.method1402() == 1;
		}
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(IZ)[[I")
	@Override
	public int[][] method2792(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = super.aClass66_39.method1971(arg0);
		@Pc(20) int[] local20 = local16[1];
		@Pc(24) int[] local24 = local16[2];
		@Pc(28) int[] local28 = local16[0];
		if (super.aClass66_39.aBoolean123) {
			for (@Pc(34) int local34 = 0; local34 < Static120.anInt2812; local34++) {
				this.method1763(local34, arg0);
				@Pc(47) int[][] local47 = this.method2794(0, Static158.anInt3649);
				local28[local34] = local47[0][Static40.anInt1161];
				local20[local34] = local47[1][Static40.anInt1161];
				local24[local34] = local47[2][Static40.anInt1161];
			}
		}
		return local16;
	}
}
