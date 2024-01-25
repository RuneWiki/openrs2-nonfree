import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rc")
public final class Class14_Sub3_Sub32 extends Class14_Sub3 {

	@OriginalMember(owner = "client!rc", name = "<init>", descriptor = "()V")
	public Class14_Sub3_Sub32() {
		super(1, false);
	}

	@OriginalMember(owner = "client!rc", name = "b", descriptor = "(III)V")
	private void method4657(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) int local9 = Static346.anIntArray638[arg1];
		@Pc(18) int local18 = Static213.anIntArray381[arg0];
		@Pc(29) float local29 = (float) Math.atan2((double) (local9 - 2048), (double) (local18 - 2048));
		if ((double) local29 >= -3.141592653589793D && (double) local29 <= -2.356194490192345D) {
			Static191.anInt3905 = arg1;
			Static171.anInt3549 = arg0;
		} else if ((double) local29 <= -1.5707963267948966D && (double) local29 >= -2.356194490192345D) {
			Static171.anInt3549 = arg1;
			Static191.anInt3905 = arg0;
		} else if ((double) local29 <= -0.7853981633974483D && (double) local29 >= -1.5707963267948966D) {
			Static171.anInt3549 = arg1;
			Static191.anInt3905 = Static294.anInt5657 - arg0;
		} else if (local29 <= 0.0F && (double) local29 >= -0.7853981633974483D) {
			Static171.anInt3549 = Static65.anInt5731 - arg0;
			Static191.anInt3905 = arg1;
		} else if (local29 >= 0.0F && (double) local29 <= 0.7853981633974483D) {
			Static171.anInt3549 = Static65.anInt5731 - arg0;
			Static191.anInt3905 = Static294.anInt5657 - arg1;
		} else if ((double) local29 >= 0.7853981633974483D && (double) local29 <= 1.5707963267948966D) {
			Static191.anInt3905 = Static294.anInt5657 - arg0;
			Static171.anInt3549 = Static65.anInt5731 - arg1;
		} else if ((double) local29 >= 1.5707963267948966D && (double) local29 <= 2.356194490192345D) {
			Static171.anInt3549 = Static65.anInt5731 - arg1;
			Static191.anInt3905 = arg0;
		} else if ((double) local29 >= 2.356194490192345D && (double) local29 <= 3.141592653589793D) {
			Static191.anInt3905 = Static294.anInt5657 - arg1;
			Static171.anInt3549 = arg0;
		}
		Static171.anInt3549 &= Static179.anInt3689;
		Static191.anInt3905 &= Static329.anInt6352;
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(Lclient!jg;II)V")
	@Override
	public void method6000(@OriginalArg(0) Class14_Sub4 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			super.aBoolean446 = arg0.method2548() == 1;
		}
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method6003(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass157_41.method4026(arg0);
		if (super.aClass157_41.aBoolean296) {
			for (@Pc(17) int local17 = 0; local17 < Static294.anInt5657; local17++) {
				this.method4657(arg0, local17);
				@Pc(30) int[] local30 = this.method6004(0, Static171.anInt3549);
				local11[local17] = local30[Static191.anInt3905];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method5994(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass58_41.method1955(arg0);
		if (super.aClass58_41.aBoolean126) {
			@Pc(24) int[] local24 = local16[0];
			@Pc(28) int[] local28 = local16[1];
			@Pc(32) int[] local32 = local16[2];
			for (@Pc(34) int local34 = 0; local34 < Static294.anInt5657; local34++) {
				this.method4657(arg0, local34);
				@Pc(49) int[][] local49 = this.method5997(Static171.anInt3549, 0);
				local24[local34] = local49[0][Static191.anInt3905];
				local28[local34] = local49[1][Static191.anInt3905];
				local32[local34] = local49[2][Static191.anInt3905];
			}
		}
		return local16;
	}
}
