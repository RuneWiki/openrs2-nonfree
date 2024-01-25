import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gs")
public final class Class4_Sub6_Sub11 extends Class4_Sub6 {

	@OriginalMember(owner = "client!gs", name = "<init>", descriptor = "()V")
	public Class4_Sub6_Sub11() {
		super(1, false);
	}

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5510(@OriginalArg(1) int arg0) {
		@Pc(19) int[] local19 = super.aClass82_41.method2265(arg0);
		if (super.aClass82_41.aBoolean243) {
			for (@Pc(25) int local25 = 0; local25 < Static80.anInt1616; local25++) {
				this.method2338(local25, arg0);
				@Pc(38) int[] local38 = this.method5508(Static337.anInt5794, 0);
				local19[local25] = local38[Static411.anInt6739];
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method5514(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass153_41.method3679(arg0);
		if (super.aClass153_41.aBoolean437) {
			@Pc(24) int[] local24 = local16[0];
			@Pc(28) int[] local28 = local16[1];
			@Pc(32) int[] local32 = local16[2];
			for (@Pc(34) int local34 = 0; local34 < Static80.anInt1616; local34++) {
				this.method2338(local34, arg0);
				@Pc(47) int[][] local47 = this.method5516(0, Static337.anInt5794);
				local24[local34] = local47[0][Static411.anInt6739];
				local28[local34] = local47[1][Static411.anInt6739];
				local32[local34] = local47[2][Static411.anInt6739];
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(IILclient!iv;)V")
	@Override
	public void method5518(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub12 arg1) {
		if (arg0 == 0) {
			super.aBoolean665 = arg1.method2490() == 1;
		}
	}

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(IIB)V")
	private void method2338(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) int local9 = Static341.anIntArray504[arg0];
		@Pc(13) int local13 = Static165.anIntArray209[arg1];
		@Pc(28) float local28 = (float) Math.atan2((double) (local9 - 2048), (double) (local13 - 2048));
		if ((double) local28 >= -3.141592653589793D && (double) local28 <= -2.356194490192345D) {
			Static411.anInt6739 = arg0;
			Static337.anInt5794 = arg1;
		} else if ((double) local28 <= -1.5707963267948966D && (double) local28 >= -2.356194490192345D) {
			Static337.anInt5794 = arg0;
			Static411.anInt6739 = arg1;
		} else if ((double) local28 <= -0.7853981633974483D && (double) local28 >= -1.5707963267948966D) {
			Static411.anInt6739 = Static80.anInt1616 - arg1;
			Static337.anInt5794 = arg0;
		} else if (local28 <= 0.0F && (double) local28 >= -0.7853981633974483D) {
			Static337.anInt5794 = Static262.anInt4939 - arg1;
			Static411.anInt6739 = arg0;
		} else if (local28 >= 0.0F && (double) local28 <= 0.7853981633974483D) {
			Static337.anInt5794 = Static262.anInt4939 - arg1;
			Static411.anInt6739 = Static80.anInt1616 - arg0;
		} else if ((double) local28 >= 0.7853981633974483D && (double) local28 <= 1.5707963267948966D) {
			Static411.anInt6739 = Static80.anInt1616 - arg1;
			Static337.anInt5794 = Static262.anInt4939 - arg0;
		} else if ((double) local28 >= 1.5707963267948966D && (double) local28 <= 2.356194490192345D) {
			Static411.anInt6739 = arg1;
			Static337.anInt5794 = Static262.anInt4939 - arg0;
		} else if ((double) local28 >= 2.356194490192345D && (double) local28 <= 3.141592653589793D) {
			Static337.anInt5794 = arg1;
			Static411.anInt6739 = Static80.anInt1616 - arg0;
		}
		Static411.anInt6739 &= Static203.anInt3883;
		Static337.anInt5794 &= Static211.anInt3929;
	}
}
