import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bk")
public final class Class5_Sub2_Sub4 extends Class5_Sub2 {

	@OriginalMember(owner = "client!bk", name = "<init>", descriptor = "()V")
	public Class5_Sub2_Sub4() {
		super(1, false);
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(ILclient!ofa;I)V")
	@Override
	public void method9040(@OriginalArg(1) Class5_Sub22 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			super.aBoolean762 = arg0.method5966() == 1;
		}
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(IIB)V")
	private void method822(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(15) int local15 = Static352.anIntArray331[arg1];
		@Pc(19) int local19 = Static493.anIntArray476[arg0];
		@Pc(30) float local30 = (float) Math.atan2((double) (local15 - 2048), (double) (local19 - 2048));
		if ((double) local30 >= -3.141592653589793D && (double) local30 <= -2.356194490192345D) {
			Static440.anInt7533 = arg0;
			Static391.anInt6474 = arg1;
		} else if ((double) local30 <= -1.5707963267948966D && (double) local30 >= -2.356194490192345D) {
			Static440.anInt7533 = arg1;
			Static391.anInt6474 = arg0;
		} else if ((double) local30 <= -0.7853981633974483D && (double) local30 >= -1.5707963267948966D) {
			Static440.anInt7533 = arg1;
			Static391.anInt6474 = Static597.anInt10025 - arg0;
		} else if (local30 <= 0.0F && (double) local30 >= -0.7853981633974483D) {
			Static391.anInt6474 = arg1;
			Static440.anInt7533 = Static591.anInt9907 - arg0;
		} else if (local30 >= 0.0F && (double) local30 <= 0.7853981633974483D) {
			Static391.anInt6474 = Static597.anInt10025 - arg1;
			Static440.anInt7533 = Static591.anInt9907 - arg0;
		} else if ((double) local30 >= 0.7853981633974483D && (double) local30 <= 1.5707963267948966D) {
			Static440.anInt7533 = Static591.anInt9907 - arg1;
			Static391.anInt6474 = Static597.anInt10025 - arg0;
		} else if ((double) local30 >= 1.5707963267948966D && (double) local30 <= 2.356194490192345D) {
			Static391.anInt6474 = arg0;
			Static440.anInt7533 = Static591.anInt9907 - arg1;
		} else if ((double) local30 >= 2.356194490192345D && (double) local30 <= 3.141592653589793D) {
			Static391.anInt6474 = Static597.anInt10025 - arg1;
			Static440.anInt7533 = arg0;
		}
		Static391.anInt6474 &= Static28.anInt365;
		Static440.anInt7533 &= Static273.anInt4903;
	}

	@OriginalMember(owner = "client!bk", name = "c", descriptor = "(II)[[I")
	@Override
	public int[][] method9037(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass160_41.method3854(arg0);
		if (super.aClass160_41.aBoolean310) {
			@Pc(24) int[] local24 = local11[0];
			@Pc(28) int[] local28 = local11[1];
			@Pc(32) int[] local32 = local11[2];
			for (@Pc(34) int local34 = 0; local34 < Static597.anInt10025; local34++) {
				this.method822(arg0, local34);
				@Pc(47) int[][] local47 = this.method9033(0, Static440.anInt7533);
				local24[local34] = local47[0][Static391.anInt6474];
				local28[local34] = local47[1][Static391.anInt6474];
				local32[local34] = local47[2][Static391.anInt6474];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method9034(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass379_41.method9012(arg0);
		if (super.aClass379_41.aBoolean761) {
			for (@Pc(22) int local22 = 0; local22 < Static597.anInt10025; local22++) {
				this.method822(arg0, local22);
				@Pc(37) int[] local37 = this.method9042(Static440.anInt7533, 0);
				local11[local22] = local37[Static391.anInt6474];
			}
		}
		return local11;
	}
}
