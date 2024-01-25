import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gs")
public final class Class6_Sub1_Sub12 extends Class6_Sub1 {

	@OriginalMember(owner = "client!gs", name = "<init>", descriptor = "()V")
	public Class6_Sub1_Sub12() {
		super(1, false);
	}

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method5616(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass140_41.method3664(arg0);
		if (super.aClass140_41.aBoolean287) {
			for (@Pc(22) int local22 = 0; local22 < Static299.anInt5659; local22++) {
				this.method2223(arg0, local22);
				@Pc(35) int[] local35 = this.method5609(0, Static193.anInt3658);
				local11[local22] = local35[Static281.anInt5319];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(ZI)[[I")
	@Override
	public int[][] method5608(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass220_41.method5816(arg0);
		if (super.aClass220_41.aBoolean429) {
			@Pc(24) int[] local24 = local11[0];
			@Pc(28) int[] local28 = local11[1];
			@Pc(32) int[] local32 = local11[2];
			for (@Pc(34) int local34 = 0; local34 < Static299.anInt5659; local34++) {
				this.method2223(arg0, local34);
				@Pc(47) int[][] local47 = this.method5618(Static193.anInt3658, 0);
				local24[local34] = local47[0][Static281.anInt5319];
				local28[local34] = local47[1][Static281.anInt5319];
				local32[local34] = local47[2][Static281.anInt5319];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(BLclient!ec;I)V")
	@Override
	public void method5617(@OriginalArg(1) Class6_Sub10 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			super.aBoolean411 = arg0.method3972() == 1;
		}
	}

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(BII)V")
	private void method2223(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) int local15 = Static18.anIntArray32[arg1];
		@Pc(19) int local19 = Static273.anIntArray703[arg0];
		@Pc(30) float local30 = (float) Math.atan2((double) (local15 - 2048), (double) (local19 - 2048));
		if ((double) local30 >= -3.141592653589793D && (double) local30 <= -2.356194490192345D) {
			Static281.anInt5319 = arg1;
			Static193.anInt3658 = arg0;
		} else if ((double) local30 <= -1.5707963267948966D && (double) local30 >= -2.356194490192345D) {
			Static281.anInt5319 = arg0;
			Static193.anInt3658 = arg1;
		} else if ((double) local30 <= -0.7853981633974483D && (double) local30 >= -1.5707963267948966D) {
			Static281.anInt5319 = Static299.anInt5659 - arg0;
			Static193.anInt3658 = arg1;
		} else if (local30 <= 0.0F && (double) local30 >= -0.7853981633974483D) {
			Static281.anInt5319 = arg1;
			Static193.anInt3658 = Static273.anInt6145 - arg0;
		} else if (local30 >= 0.0F && (double) local30 <= 0.7853981633974483D) {
			Static193.anInt3658 = Static273.anInt6145 - arg0;
			Static281.anInt5319 = Static299.anInt5659 - arg1;
		} else if ((double) local30 >= 0.7853981633974483D && (double) local30 <= 1.5707963267948966D) {
			Static281.anInt5319 = Static299.anInt5659 - arg0;
			Static193.anInt3658 = Static273.anInt6145 - arg1;
		} else if ((double) local30 >= 1.5707963267948966D && (double) local30 <= 2.356194490192345D) {
			Static281.anInt5319 = arg0;
			Static193.anInt3658 = Static273.anInt6145 - arg1;
		} else if ((double) local30 >= 2.356194490192345D && (double) local30 <= 3.141592653589793D) {
			Static193.anInt3658 = arg0;
			Static281.anInt5319 = Static299.anInt5659 - arg1;
		}
		Static193.anInt3658 &= Static113.anInt2099;
		Static281.anInt5319 &= Static76.anInt2850;
	}
}
