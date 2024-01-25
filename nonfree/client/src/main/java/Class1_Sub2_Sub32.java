import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!te")
public final class Class1_Sub2_Sub32 extends Class1_Sub2 {

	@OriginalMember(owner = "client!te", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub32() {
		super(1, false);
	}

	@OriginalMember(owner = "client!te", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method5664(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass129_41.method3671(arg0);
		if (super.aClass129_41.aBoolean338) {
			@Pc(24) int[] local24 = local16[0];
			@Pc(28) int[] local28 = local16[1];
			@Pc(32) int[] local32 = local16[2];
			for (@Pc(34) int local34 = 0; local34 < Static251.anInt6509; local34++) {
				this.method5057(arg0, local34);
				@Pc(47) int[][] local47 = this.method5659(Static56.anInt1244, 0);
				local24[local34] = local47[0][Static85.anInt1672];
				local28[local34] = local47[1][Static85.anInt1672];
				local32[local34] = local47[2][Static85.anInt1672];
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5662(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass84_41.method2422(arg0);
		if (super.aClass84_41.aBoolean227) {
			for (@Pc(22) int local22 = 0; local22 < Static251.anInt6509; local22++) {
				this.method5057(arg0, local22);
				@Pc(35) int[] local35 = this.method5654(0, Static56.anInt1244);
				local11[local22] = local35[Static85.anInt1672];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(ZII)V")
	private void method5057(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) int local13 = Static7.anIntArray23[arg1];
		@Pc(17) int local17 = Static66.anIntArray158[arg0];
		@Pc(28) float local28 = (float) Math.atan2((double) (local13 - 2048), (double) (local17 - 2048));
		if ((double) local28 >= -3.141592653589793D && (double) local28 <= -2.356194490192345D) {
			Static85.anInt1672 = arg1;
			Static56.anInt1244 = arg0;
		} else if ((double) local28 <= -1.5707963267948966D && (double) local28 >= -2.356194490192345D) {
			Static56.anInt1244 = arg1;
			Static85.anInt1672 = arg0;
		} else if ((double) local28 <= -0.7853981633974483D && (double) local28 >= -1.5707963267948966D) {
			Static85.anInt1672 = Static251.anInt6509 - arg0;
			Static56.anInt1244 = arg1;
		} else if (local28 <= 0.0F && (double) local28 >= -0.7853981633974483D) {
			Static56.anInt1244 = Static81.anInt1606 - arg0;
			Static85.anInt1672 = arg1;
		} else if (local28 >= 0.0F && (double) local28 <= 0.7853981633974483D) {
			Static56.anInt1244 = Static81.anInt1606 - arg0;
			Static85.anInt1672 = Static251.anInt6509 - arg1;
		} else if ((double) local28 >= 0.7853981633974483D && (double) local28 <= 1.5707963267948966D) {
			Static56.anInt1244 = Static81.anInt1606 - arg1;
			Static85.anInt1672 = Static251.anInt6509 - arg0;
		} else if ((double) local28 >= 1.5707963267948966D && (double) local28 <= 2.356194490192345D) {
			Static56.anInt1244 = Static81.anInt1606 - arg1;
			Static85.anInt1672 = arg0;
		} else if ((double) local28 >= 2.356194490192345D && (double) local28 <= 3.141592653589793D) {
			Static56.anInt1244 = arg0;
			Static85.anInt1672 = Static251.anInt6509 - arg1;
		}
		Static56.anInt1244 &= Static206.anInt4136;
		Static85.anInt1672 &= Static260.anInt5056;
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(IILclient!eb;)V")
	@Override
	public void method5660(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub7 arg1) {
		if (arg0 == 0) {
			super.aBoolean583 = arg1.method3141() == 1;
		}
	}
}
