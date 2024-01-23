import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ib")
public final class Class1_Sub4_Sub18 extends Class1_Sub4 {

	@OriginalMember(owner = "client!ib", name = "O", descriptor = "[I")
	public static int[] anIntArray212 = new int[32];

	static {
		@Pc(6) int local6 = 2;
		for (@Pc(8) int local8 = 0; local8 < 32; local8++) {
			anIntArray212[local8] = local6 - 1;
			local6 += local6;
		}
	}

	@OriginalMember(owner = "client!ib", name = "<init>", descriptor = "()V")
	public Class1_Sub4_Sub18() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(III)V")
	private void method2064(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(5) int local5 = Static279.anIntArray454[arg1];
		@Pc(13) int local13 = Static250.anIntArray398[arg0];
		@Pc(28) float local28 = (float) Math.atan2((double) (local5 - 2048), (double) (local13 - 2048));
		if (-3.141592653589793D <= (double) local28 && (double) local28 <= -2.356194490192345D) {
			Static19.anInt338 = arg1;
			Static171.anInt3363 = arg0;
		} else if (-1.5707963267948966D >= (double) local28 && (double) local28 >= -2.356194490192345D) {
			Static19.anInt338 = arg0;
			Static171.anInt3363 = arg1;
		} else if (-0.7853981633974483D >= (double) local28 && (double) local28 >= -1.5707963267948966D) {
			Static19.anInt338 = Static182.anInt3492 - arg0;
			Static171.anInt3363 = arg1;
		} else if (local28 <= 0.0F && -0.7853981633974483D <= (double) local28) {
			Static171.anInt3363 = Static117.anInt2472 - arg0;
			Static19.anInt338 = arg1;
		} else if (local28 >= 0.0F && (double) local28 <= 0.7853981633974483D) {
			Static19.anInt338 = Static182.anInt3492 - arg1;
			Static171.anInt3363 = Static117.anInt2472 - arg0;
		} else if ((double) local28 >= 0.7853981633974483D && (double) local28 <= 1.5707963267948966D) {
			Static19.anInt338 = Static182.anInt3492 - arg0;
			Static171.anInt3363 = Static117.anInt2472 - arg1;
		} else if ((double) local28 >= 1.5707963267948966D && (double) local28 <= 2.356194490192345D) {
			Static171.anInt3363 = Static117.anInt2472 - arg1;
			Static19.anInt338 = arg0;
		} else if ((double) local28 >= 2.356194490192345D && (double) local28 <= 3.141592653589793D) {
			Static171.anInt3363 = arg0;
			Static19.anInt338 = Static182.anInt3492 - arg1;
		}
		Static171.anInt3363 &= Static171.anInt3359;
		Static19.anInt338 &= Static61.anInt1166;
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method4756(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = this.aClass85_41.method2339(arg0);
		if (this.aClass85_41.aBoolean171) {
			@Pc(24) int[] local24 = local16[0];
			@Pc(28) int[] local28 = local16[2];
			@Pc(32) int[] local32 = local16[1];
			for (@Pc(34) int local34 = 0; local34 < Static182.anInt3492; local34++) {
				this.method2064(arg0, local34);
				@Pc(52) int[][] local52 = this.method4749(0, Static171.anInt3363);
				local24[local34] = local52[0][Static19.anInt338];
				local32[local34] = local52[1][Static19.anInt338];
				local28[local34] = local52[2][Static19.anInt338];
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(ILclient!lf;I)V")
	@Override
	public void method4747(@OriginalArg(1) Class1_Sub14 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.aBoolean383 = arg0.method1378() == 1;
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method4746(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = this.aClass7_41.method116(arg0);
		if (this.aClass7_41.aBoolean4) {
			for (@Pc(18) int local18 = 0; local18 < Static182.anInt3492; local18++) {
				this.method2064(arg0, local18);
				@Pc(36) int[] local36 = this.method4750(Static171.anInt3363, 0);
				local11[local18] = local36[Static19.anInt338];
			}
		}
		return local11;
	}
}
