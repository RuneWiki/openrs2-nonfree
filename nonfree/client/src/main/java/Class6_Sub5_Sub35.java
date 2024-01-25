import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vj")
public final class Class6_Sub5_Sub35 extends Class6_Sub5 {

	@OriginalMember(owner = "client!vj", name = "<init>", descriptor = "()V")
	public Class6_Sub5_Sub35() {
		super(1, false);
	}

	@OriginalMember(owner = "client!vj", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method6537(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass61_41.method1611(arg0);
		if (super.aClass61_41.aBoolean142) {
			for (@Pc(22) int local22 = 0; local22 < Static240.anInt4386; local22++) {
				this.method6194(arg0, local22);
				@Pc(35) int[] local35 = this.method6543(0, Static206.anInt3834);
				local16[local22] = local35[Static304.anInt5380];
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method6545(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass162_41.method3811(arg0);
		if (super.aClass162_41.aBoolean291) {
			@Pc(24) int[] local24 = local11[0];
			@Pc(28) int[] local28 = local11[1];
			@Pc(32) int[] local32 = local11[2];
			for (@Pc(34) int local34 = 0; local34 < Static240.anInt4386; local34++) {
				this.method6194(arg0, local34);
				@Pc(47) int[][] local47 = this.method6544(Static206.anInt3834, 0);
				local24[local34] = local47[0][Static304.anInt5380];
				local28[local34] = local47[1][Static304.anInt5380];
				local32[local34] = local47[2][Static304.anInt5380];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!vj", name = "f", descriptor = "(III)V")
	private void method6194(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) int local13 = Static80.anIntArray117[arg1];
		@Pc(17) int local17 = Static247.anIntArray318[arg0];
		@Pc(28) float local28 = (float) Math.atan2((double) (local13 - 2048), (double) (local17 - 2048));
		if ((double) local28 >= -3.141592653589793D && (double) local28 <= -2.356194490192345D) {
			Static206.anInt3834 = arg0;
			Static304.anInt5380 = arg1;
		} else if ((double) local28 <= -1.5707963267948966D && (double) local28 >= -2.356194490192345D) {
			Static206.anInt3834 = arg1;
			Static304.anInt5380 = arg0;
		} else if ((double) local28 <= -0.7853981633974483D && (double) local28 >= -1.5707963267948966D) {
			Static304.anInt5380 = Static240.anInt4386 - arg0;
			Static206.anInt3834 = arg1;
		} else if (local28 <= 0.0F && (double) local28 >= -0.7853981633974483D) {
			Static206.anInt3834 = Static235.anInt4304 - arg0;
			Static304.anInt5380 = arg1;
		} else if (local28 >= 0.0F && (double) local28 <= 0.7853981633974483D) {
			Static206.anInt3834 = Static235.anInt4304 - arg0;
			Static304.anInt5380 = Static240.anInt4386 - arg1;
		} else if ((double) local28 >= 0.7853981633974483D && (double) local28 <= 1.5707963267948966D) {
			Static206.anInt3834 = Static235.anInt4304 - arg1;
			Static304.anInt5380 = Static240.anInt4386 - arg0;
		} else if ((double) local28 >= 1.5707963267948966D && (double) local28 <= 2.356194490192345D) {
			Static206.anInt3834 = Static235.anInt4304 - arg1;
			Static304.anInt5380 = arg0;
		} else if ((double) local28 >= 2.356194490192345D && (double) local28 <= 3.141592653589793D) {
			Static206.anInt3834 = arg0;
			Static304.anInt5380 = Static240.anInt4386 - arg1;
		}
		Static304.anInt5380 &= Static408.anInt7338;
		Static206.anInt3834 &= Static52.anInt1464;
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(IBLclient!ae;)V")
	@Override
	public void method6540(@OriginalArg(0) int arg0, @OriginalArg(2) Class6_Sub1 arg1) {
		if (arg0 == 0) {
			super.aBoolean495 = arg1.method6433() == 1;
		}
	}
}
