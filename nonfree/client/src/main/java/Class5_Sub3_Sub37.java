import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!v")
public final class Class5_Sub3_Sub37 extends Class5_Sub3 {

	static {
		new Class85(" days.", " Tage.", " jours.", " dias.");
	}

	@OriginalMember(owner = "client!v", name = "<init>", descriptor = "()V")
	public Class5_Sub3_Sub37() {
		super(1, false);
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(Lclient!rg;BI)V")
	@Override
	public void method6017(@OriginalArg(0) Class5_Sub12 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			super.aBoolean592 = arg0.method5115() == 1;
		}
	}

	@OriginalMember(owner = "client!v", name = "c", descriptor = "(III)V")
	private void method5723(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) int local9 = Static164.anIntArray337[arg0];
		@Pc(13) int local13 = Static345.anIntArray627[arg1];
		@Pc(24) float local24 = (float) Math.atan2((double) (local9 - 2048), (double) (local13 - 2048));
		if ((double) local24 >= -3.141592653589793D && (double) local24 <= -2.356194490192345D) {
			Static37.anInt674 = arg1;
			Static293.anInt5685 = arg0;
		} else if ((double) local24 <= -1.5707963267948966D && (double) local24 >= -2.356194490192345D) {
			Static293.anInt5685 = arg1;
			Static37.anInt674 = arg0;
		} else if ((double) local24 <= -0.7853981633974483D && (double) local24 >= -1.5707963267948966D) {
			Static37.anInt674 = arg0;
			Static293.anInt5685 = Static7.anInt129 - arg1;
		} else if (local24 <= 0.0F && (double) local24 >= -0.7853981633974483D) {
			Static37.anInt674 = Static227.anInt4557 - arg1;
			Static293.anInt5685 = arg0;
		} else if (local24 >= 0.0F && (double) local24 <= 0.7853981633974483D) {
			Static37.anInt674 = Static227.anInt4557 - arg1;
			Static293.anInt5685 = Static7.anInt129 - arg0;
		} else if ((double) local24 >= 0.7853981633974483D && (double) local24 <= 1.5707963267948966D) {
			Static37.anInt674 = Static227.anInt4557 - arg0;
			Static293.anInt5685 = Static7.anInt129 - arg1;
		} else if ((double) local24 >= 1.5707963267948966D && (double) local24 <= 2.356194490192345D) {
			Static37.anInt674 = Static227.anInt4557 - arg0;
			Static293.anInt5685 = arg1;
		} else if ((double) local24 >= 2.356194490192345D && (double) local24 <= 3.141592653589793D) {
			Static293.anInt5685 = Static7.anInt129 - arg0;
			Static37.anInt674 = arg1;
		}
		Static37.anInt674 &= Static221.anInt4359;
		Static293.anInt5685 &= Static177.anInt3515;
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(IZ)[[I")
	@Override
	public int[][] method6016(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass53_41.method969(arg0);
		if (super.aClass53_41.aBoolean83) {
			@Pc(19) int[] local19 = local11[0];
			@Pc(23) int[] local23 = local11[1];
			@Pc(27) int[] local27 = local11[2];
			for (@Pc(29) int local29 = 0; local29 < Static7.anInt129; local29++) {
				this.method5723(local29, arg0);
				@Pc(42) int[][] local42 = this.method6023(0, Static37.anInt674);
				local19[local29] = local42[0][Static293.anInt5685];
				local23[local29] = local42[1][Static293.anInt5685];
				local27[local29] = local42[2][Static293.anInt5685];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!v", name = "b", descriptor = "(IB)[I")
	@Override
	public int[] method6011(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass188_41.method5318(arg0);
		if (super.aClass188_41.aBoolean490) {
			for (@Pc(25) int local25 = 0; local25 < Static7.anInt129; local25++) {
				this.method5723(local25, arg0);
				@Pc(42) int[] local42 = this.method6020(0, Static37.anInt674);
				local11[local25] = local42[Static293.anInt5685];
			}
		}
		return local11;
	}
}
