import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bca")
public final class Class4_Sub4_Sub3 extends Class4_Sub4 {

	@OriginalMember(owner = "client!bca", name = "<init>", descriptor = "()V")
	public Class4_Sub4_Sub3() {
		super(1, false);
	}

	@OriginalMember(owner = "client!bca", name = "a", descriptor = "(BILclient!eh;)V")
	@Override
	public void method7886(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub9 arg1) {
		if (arg0 == 0) {
			super.aBoolean679 = arg1.method6015() == 1;
		}
	}

	@OriginalMember(owner = "client!bca", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method7883(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass343_41.method7596(arg0);
		if (super.aClass343_41.aBoolean638) {
			for (@Pc(22) int local22 = 0; local22 < Static560.anInt9394; local22++) {
				this.method558(arg0, local22);
				@Pc(39) int[] local39 = this.method7890(0, Static560.anInt9393);
				local16[local22] = local39[Static40.anInt789];
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!bca", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method7887(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass201_41.method4419(arg0);
		if (super.aClass201_41.aBoolean392) {
			@Pc(24) int[] local24 = local16[0];
			@Pc(28) int[] local28 = local16[1];
			@Pc(32) int[] local32 = local16[2];
			for (@Pc(34) int local34 = 0; local34 < Static560.anInt9394; local34++) {
				this.method558(arg0, local34);
				@Pc(47) int[][] local47 = this.method7892(0, Static560.anInt9393);
				local24[local34] = local47[0][Static40.anInt789];
				local28[local34] = local47[1][Static40.anInt789];
				local32[local34] = local47[2][Static40.anInt789];
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!bca", name = "c", descriptor = "(III)V")
	private void method558(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(17) int local17 = Static80.anIntArray212[arg1];
		@Pc(21) int local21 = Static450.anIntArray619[arg0];
		@Pc(32) float local32 = (float) Math.atan2((double) (local17 - 2048), (double) (local21 - 2048));
		if ((double) local32 >= -3.141592653589793D && (double) local32 <= -2.356194490192345D) {
			Static560.anInt9393 = arg0;
			Static40.anInt789 = arg1;
		} else if ((double) local32 <= -1.5707963267948966D && (double) local32 >= -2.356194490192345D) {
			Static560.anInt9393 = arg1;
			Static40.anInt789 = arg0;
		} else if ((double) local32 <= -0.7853981633974483D && (double) local32 >= -1.5707963267948966D) {
			Static40.anInt789 = Static560.anInt9394 - arg0;
			Static560.anInt9393 = arg1;
		} else if (local32 <= 0.0F && (double) local32 >= -0.7853981633974483D) {
			Static560.anInt9393 = Static278.anInt5214 - arg0;
			Static40.anInt789 = arg1;
		} else if (local32 >= 0.0F && (double) local32 <= 0.7853981633974483D) {
			Static40.anInt789 = Static560.anInt9394 - arg1;
			Static560.anInt9393 = Static278.anInt5214 - arg0;
		} else if ((double) local32 >= 0.7853981633974483D && (double) local32 <= 1.5707963267948966D) {
			Static40.anInt789 = Static560.anInt9394 - arg0;
			Static560.anInt9393 = Static278.anInt5214 - arg1;
		} else if ((double) local32 >= 1.5707963267948966D && (double) local32 <= 2.356194490192345D) {
			Static40.anInt789 = arg0;
			Static560.anInt9393 = Static278.anInt5214 - arg1;
		} else if ((double) local32 >= 2.356194490192345D && (double) local32 <= 3.141592653589793D) {
			Static560.anInt9393 = arg0;
			Static40.anInt789 = Static560.anInt9394 - arg1;
		}
		Static40.anInt789 &= Static571.anInt9405;
		Static560.anInt9393 &= Static360.anInt6375;
	}
}
