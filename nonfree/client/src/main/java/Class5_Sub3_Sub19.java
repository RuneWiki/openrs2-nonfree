import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jh")
public final class Class5_Sub3_Sub19 extends Class5_Sub3 {

	@OriginalMember(owner = "client!jh", name = "<init>", descriptor = "()V")
	public Class5_Sub3_Sub19() {
		super(1, false);
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(ILclient!wq;I)V")
	@Override
	public void method9211(@OriginalArg(1) Class5_Sub36 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			super.aBoolean769 = arg0.method7291() == 1;
		}
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method9208(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass234_41.method5232(arg0);
		if (super.aClass234_41.aBoolean392) {
			for (@Pc(17) int local17 = 0; local17 < Static7.anInt102; local17++) {
				this.method4356(arg0, local17);
				@Pc(30) int[] local30 = this.method9205(Static677.anInt8469, 0);
				local11[local17] = local30[Static35.anInt525];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!jh", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method9206(@OriginalArg(1) int arg0) {
		@Pc(21) int[][] local21 = super.aClass343_41.method7661(arg0);
		if (super.aClass343_41.aBoolean592) {
			@Pc(29) int[] local29 = local21[0];
			@Pc(33) int[] local33 = local21[1];
			@Pc(37) int[] local37 = local21[2];
			for (@Pc(39) int local39 = 0; local39 < Static7.anInt102; local39++) {
				this.method4356(arg0, local39);
				@Pc(52) int[][] local52 = this.method9207(Static677.anInt8469, 0);
				local29[local39] = local52[0][Static35.anInt525];
				local33[local39] = local52[1][Static35.anInt525];
				local37[local39] = local52[2][Static35.anInt525];
			}
		}
		return local21;
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(IBI)V")
	private void method4356(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) int local9 = Static382.anIntArray368[arg1];
		@Pc(13) int local13 = Static458.anIntArray438[arg0];
		@Pc(24) float local24 = (float) Math.atan2((double) (local9 - 2048), (double) (local13 - 2048));
		if ((double) local24 >= -3.141592653589793D && (double) local24 <= -2.356194490192345D) {
			Static677.anInt8469 = arg0;
			Static35.anInt525 = arg1;
		} else if ((double) local24 <= -1.5707963267948966D && (double) local24 >= -2.356194490192345D) {
			Static677.anInt8469 = arg1;
			Static35.anInt525 = arg0;
		} else if ((double) local24 <= -0.7853981633974483D && (double) local24 >= -1.5707963267948966D) {
			Static35.anInt525 = Static7.anInt102 - arg0;
			Static677.anInt8469 = arg1;
		} else if (local24 <= 0.0F && (double) local24 >= -0.7853981633974483D) {
			Static677.anInt8469 = Static122.anInt2020 - arg0;
			Static35.anInt525 = arg1;
		} else if (local24 >= 0.0F && (double) local24 <= 0.7853981633974483D) {
			Static677.anInt8469 = Static122.anInt2020 - arg0;
			Static35.anInt525 = Static7.anInt102 - arg1;
		} else if ((double) local24 >= 0.7853981633974483D && (double) local24 <= 1.5707963267948966D) {
			Static677.anInt8469 = Static122.anInt2020 - arg1;
			Static35.anInt525 = Static7.anInt102 - arg0;
		} else if ((double) local24 >= 1.5707963267948966D && (double) local24 <= 2.356194490192345D) {
			Static35.anInt525 = arg0;
			Static677.anInt8469 = Static122.anInt2020 - arg1;
		} else if ((double) local24 >= 2.356194490192345D && (double) local24 <= 3.141592653589793D) {
			Static677.anInt8469 = arg0;
			Static35.anInt525 = Static7.anInt102 - arg1;
		}
		Static35.anInt525 &= Static517.anInt8205;
		Static677.anInt8469 &= Static652.anInt10663;
	}
}
