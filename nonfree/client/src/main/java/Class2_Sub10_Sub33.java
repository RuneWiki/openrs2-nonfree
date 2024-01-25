import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uda")
public final class Class2_Sub10_Sub33 extends Class2_Sub10 {

	@OriginalMember(owner = "client!uda", name = "<init>", descriptor = "()V")
	public Class2_Sub10_Sub33() {
		super(1, false);
	}

	@OriginalMember(owner = "client!uda", name = "a", descriptor = "(ZI)[[I")
	@Override
	public int[][] method8411(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass250_41.method6392(arg0);
		if (super.aClass250_41.aBoolean573) {
			@Pc(24) int[] local24 = local16[0];
			@Pc(28) int[] local28 = local16[1];
			@Pc(32) int[] local32 = local16[2];
			for (@Pc(34) int local34 = 0; local34 < Static93.anInt1862; local34++) {
				this.method7813(arg0, local34);
				@Pc(47) int[][] local47 = this.method8408(Static289.anInt5431, 0);
				local24[local34] = local47[0][Static371.anInt6618];
				local28[local34] = local47[1][Static371.anInt6618];
				local32[local34] = local47[2][Static371.anInt6618];
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!uda", name = "a", descriptor = "(Lclient!ud;II)V")
	@Override
	public void method8410(@OriginalArg(0) Class2_Sub34 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			super.aBoolean741 = arg0.method6904() == 1;
		}
	}

	@OriginalMember(owner = "client!uda", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method8403(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass304_41.method7208(arg0);
		if (super.aClass304_41.aBoolean638) {
			for (@Pc(22) int local22 = 0; local22 < Static93.anInt1862; local22++) {
				this.method7813(arg0, local22);
				@Pc(35) int[] local35 = this.method8402(Static289.anInt5431, 0);
				local11[local22] = local35[Static371.anInt6618];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!uda", name = "a", descriptor = "(BII)V")
	private void method7813(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) int local9 = Static561.anIntArray649[arg1];
		@Pc(17) int local17 = Static353.anIntArray424[arg0];
		@Pc(28) float local28 = (float) Math.atan2((double) (local9 - 2048), (double) (local17 - 2048));
		if ((double) local28 >= -3.141592653589793D && (double) local28 <= -2.356194490192345D) {
			Static371.anInt6618 = arg1;
			Static289.anInt5431 = arg0;
		} else if ((double) local28 <= -1.5707963267948966D && (double) local28 >= -2.356194490192345D) {
			Static289.anInt5431 = arg1;
			Static371.anInt6618 = arg0;
		} else if ((double) local28 <= -0.7853981633974483D && (double) local28 >= -1.5707963267948966D) {
			Static289.anInt5431 = arg1;
			Static371.anInt6618 = Static93.anInt1862 - arg0;
		} else if (local28 <= 0.0F && (double) local28 >= -0.7853981633974483D) {
			Static371.anInt6618 = arg1;
			Static289.anInt5431 = Static512.anInt8591 - arg0;
		} else if (local28 >= 0.0F && (double) local28 <= 0.7853981633974483D) {
			Static289.anInt5431 = Static512.anInt8591 - arg0;
			Static371.anInt6618 = Static93.anInt1862 - arg1;
		} else if ((double) local28 >= 0.7853981633974483D && (double) local28 <= 1.5707963267948966D) {
			Static289.anInt5431 = Static512.anInt8591 - arg1;
			Static371.anInt6618 = Static93.anInt1862 - arg0;
		} else if ((double) local28 >= 1.5707963267948966D && (double) local28 <= 2.356194490192345D) {
			Static371.anInt6618 = arg0;
			Static289.anInt5431 = Static512.anInt8591 - arg1;
		} else if ((double) local28 >= 2.356194490192345D && (double) local28 <= 3.141592653589793D) {
			Static371.anInt6618 = Static93.anInt1862 - arg1;
			Static289.anInt5431 = arg0;
		}
		Static371.anInt6618 &= Static603.anInt9994;
		Static289.anInt5431 &= Static93.anInt1860;
	}
}
