import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ck")
public final class Class3_Sub3_Sub3 extends Class3_Sub3 {

	@OriginalMember(owner = "client!ck", name = "<init>", descriptor = "()V")
	public Class3_Sub3_Sub3() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ck", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method5727(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass217_41.method5701(arg0);
		if (super.aClass217_41.aBoolean451) {
			for (@Pc(22) int local22 = 0; local22 < Static131.anInt2755; local22++) {
				this.method758(local22, arg0);
				@Pc(35) int[] local35 = this.method5733(Static123.anInt2647, 0);
				local16[local22] = local35[Static198.anInt4063];
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(Lclient!fb;ZI)V")
	@Override
	public void method5731(@OriginalArg(0) Class3_Sub4 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			super.aBoolean454 = arg0.method3643() == 1;
		}
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(IBI)V")
	private void method758(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) int local9 = Static151.anIntArray211[arg0];
		@Pc(13) int local13 = Static269.anIntArray433[arg1];
		@Pc(24) float local24 = (float) Math.atan2((double) (local9 - 2048), (double) (local13 - 2048));
		if ((double) local24 >= -3.141592653589793D && (double) local24 <= -2.356194490192345D) {
			Static123.anInt2647 = arg1;
			Static198.anInt4063 = arg0;
		} else if ((double) local24 <= -1.5707963267948966D && (double) local24 >= -2.356194490192345D) {
			Static198.anInt4063 = arg1;
			Static123.anInt2647 = arg0;
		} else if ((double) local24 <= -0.7853981633974483D && (double) local24 >= -1.5707963267948966D) {
			Static123.anInt2647 = arg0;
			Static198.anInt4063 = Static131.anInt2755 - arg1;
		} else if (local24 <= 0.0F && (double) local24 >= -0.7853981633974483D) {
			Static198.anInt4063 = arg0;
			Static123.anInt2647 = Static182.anInt3888 - arg1;
		} else if (local24 >= 0.0F && (double) local24 <= 0.7853981633974483D) {
			Static198.anInt4063 = Static131.anInt2755 - arg0;
			Static123.anInt2647 = Static182.anInt3888 - arg1;
		} else if ((double) local24 >= 0.7853981633974483D && (double) local24 <= 1.5707963267948966D) {
			Static123.anInt2647 = Static182.anInt3888 - arg0;
			Static198.anInt4063 = Static131.anInt2755 - arg1;
		} else if ((double) local24 >= 1.5707963267948966D && (double) local24 <= 2.356194490192345D) {
			Static198.anInt4063 = arg1;
			Static123.anInt2647 = Static182.anInt3888 - arg0;
		} else if ((double) local24 >= 2.356194490192345D && (double) local24 <= 3.141592653589793D) {
			Static123.anInt2647 = arg1;
			Static198.anInt4063 = Static131.anInt2755 - arg0;
		}
		Static123.anInt2647 &= Static351.anInt6821;
		Static198.anInt4063 &= Static167.anInt3460;
	}

	@OriginalMember(owner = "client!ck", name = "c", descriptor = "(II)[[I")
	@Override
	public int[][] method5734(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass84_41.method2091(arg0);
		if (super.aClass84_41.aBoolean144) {
			@Pc(24) int[] local24 = local11[0];
			@Pc(28) int[] local28 = local11[1];
			@Pc(32) int[] local32 = local11[2];
			for (@Pc(34) int local34 = 0; local34 < Static131.anInt2755; local34++) {
				this.method758(local34, arg0);
				@Pc(47) int[][] local47 = this.method5729(0, Static123.anInt2647);
				local24[local34] = local47[0][Static198.anInt4063];
				local28[local34] = local47[1][Static198.anInt4063];
				local32[local34] = local47[2][Static198.anInt4063];
			}
		}
		return local11;
	}
}
