import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!be")
public final class Class3_Sub4_Sub3 extends Class3_Sub4 {

	@OriginalMember(owner = "client!be", name = "<init>", descriptor = "()V")
	public Class3_Sub4_Sub3() {
		super(1, false);
	}

	@OriginalMember(owner = "client!be", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method5966(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass146_41.method3700(arg0);
		if (super.aClass146_41.aBoolean342) {
			for (@Pc(22) int local22 = 0; local22 < Static106.anInt2356; local22++) {
				this.method715(arg0, local22);
				@Pc(35) int[] local35 = this.method5960(0, Static441.anInt7510);
				local16[local22] = local35[Static286.anInt6052];
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(IILclient!bt;)V")
	@Override
	public void method5958(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub2 arg1) {
		if (arg0 == 0) {
			super.aBoolean524 = arg1.method6053() == 1;
		}
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method5955(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass214_41.method5177(arg0);
		if (super.aClass214_41.aBoolean455) {
			@Pc(24) int[] local24 = local16[0];
			@Pc(28) int[] local28 = local16[1];
			@Pc(32) int[] local32 = local16[2];
			for (@Pc(34) int local34 = 0; local34 < Static106.anInt2356; local34++) {
				this.method715(arg0, local34);
				@Pc(49) int[][] local49 = this.method5962(0, Static441.anInt7510);
				local24[local34] = local49[0][Static286.anInt6052];
				local28[local34] = local49[1][Static286.anInt6052];
				local32[local34] = local49[2][Static286.anInt6052];
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(IBI)V")
	private void method715(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) int local9 = Static382.anIntArray476[arg1];
		@Pc(17) int local17 = Static285.anIntArray401[arg0];
		@Pc(28) float local28 = (float) Math.atan2((double) (local9 - 2048), (double) (local17 - 2048));
		if ((double) local28 >= -3.141592653589793D && (double) local28 <= -2.356194490192345D) {
			Static286.anInt6052 = arg1;
			Static441.anInt7510 = arg0;
		} else if ((double) local28 <= -1.5707963267948966D && (double) local28 >= -2.356194490192345D) {
			Static286.anInt6052 = arg0;
			Static441.anInt7510 = arg1;
		} else if ((double) local28 <= -0.7853981633974483D && (double) local28 >= -1.5707963267948966D) {
			Static286.anInt6052 = Static106.anInt2356 - arg0;
			Static441.anInt7510 = arg1;
		} else if (local28 <= 0.0F && (double) local28 >= -0.7853981633974483D) {
			Static441.anInt7510 = Static340.anInt6286 - arg0;
			Static286.anInt6052 = arg1;
		} else if (local28 >= 0.0F && (double) local28 <= 0.7853981633974483D) {
			Static286.anInt6052 = Static106.anInt2356 - arg1;
			Static441.anInt7510 = Static340.anInt6286 - arg0;
		} else if ((double) local28 >= 0.7853981633974483D && (double) local28 <= 1.5707963267948966D) {
			Static286.anInt6052 = Static106.anInt2356 - arg0;
			Static441.anInt7510 = Static340.anInt6286 - arg1;
		} else if ((double) local28 >= 1.5707963267948966D && (double) local28 <= 2.356194490192345D) {
			Static441.anInt7510 = Static340.anInt6286 - arg1;
			Static286.anInt6052 = arg0;
		} else if ((double) local28 >= 2.356194490192345D && (double) local28 <= 3.141592653589793D) {
			Static286.anInt6052 = Static106.anInt2356 - arg1;
			Static441.anInt7510 = arg0;
		}
		Static286.anInt6052 &= Static396.anInt6840;
		Static441.anInt7510 &= Static311.anInt5681;
	}
}
