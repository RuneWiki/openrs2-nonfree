import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!g")
public final class Class4_Sub2_Sub11 extends Class4_Sub2 {

	@OriginalMember(owner = "client!g", name = "<init>", descriptor = "()V")
	public Class4_Sub2_Sub11() {
		super(1, false);
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method5842(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass207_41.method4800(arg0);
		if (super.aClass207_41.aBoolean426) {
			@Pc(24) int[] local24 = local16[0];
			@Pc(28) int[] local28 = local16[1];
			@Pc(32) int[] local32 = local16[2];
			for (@Pc(34) int local34 = 0; local34 < Static350.anInt6330; local34++) {
				this.method1904(local34, arg0);
				@Pc(47) int[][] local47 = this.method5848(0, Static291.anInt5270);
				local24[local34] = local47[0][Static126.anInt2568];
				local28[local34] = local47[1][Static126.anInt2568];
				local32[local34] = local47[2][Static126.anInt2568];
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(IBLclient!tl;)V")
	@Override
	public void method5843(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub30 arg1) {
		if (arg0 == 0) {
			super.aBoolean501 = arg1.method4864() == 1;
		}
	}

	@OriginalMember(owner = "client!g", name = "c", descriptor = "(III)V")
	private void method1904(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) int local9 = Static197.anIntArray566[arg0];
		@Pc(13) int local13 = Static293.anIntArray461[arg1];
		@Pc(24) float local24 = (float) Math.atan2((double) (local9 - 2048), (double) (local13 - 2048));
		if ((double) local24 >= -3.141592653589793D && (double) local24 <= -2.356194490192345D) {
			Static291.anInt5270 = arg1;
			Static126.anInt2568 = arg0;
		} else if ((double) local24 <= -1.5707963267948966D && (double) local24 >= -2.356194490192345D) {
			Static291.anInt5270 = arg0;
			Static126.anInt2568 = arg1;
		} else if ((double) local24 <= -0.7853981633974483D && (double) local24 >= -1.5707963267948966D) {
			Static291.anInt5270 = arg0;
			Static126.anInt2568 = Static350.anInt6330 - arg1;
		} else if (local24 <= 0.0F && (double) local24 >= -0.7853981633974483D) {
			Static126.anInt2568 = arg0;
			Static291.anInt5270 = Static160.anInt3006 - arg1;
		} else if (local24 >= 0.0F && (double) local24 <= 0.7853981633974483D) {
			Static126.anInt2568 = Static350.anInt6330 - arg0;
			Static291.anInt5270 = Static160.anInt3006 - arg1;
		} else if ((double) local24 >= 0.7853981633974483D && (double) local24 <= 1.5707963267948966D) {
			Static126.anInt2568 = Static350.anInt6330 - arg1;
			Static291.anInt5270 = Static160.anInt3006 - arg0;
		} else if ((double) local24 >= 1.5707963267948966D && (double) local24 <= 2.356194490192345D) {
			Static126.anInt2568 = arg1;
			Static291.anInt5270 = Static160.anInt3006 - arg0;
		} else if ((double) local24 >= 2.356194490192345D && (double) local24 <= 3.141592653589793D) {
			Static291.anInt5270 = arg1;
			Static126.anInt2568 = Static350.anInt6330 - arg0;
		}
		Static291.anInt5270 &= Static323.anInt5763;
		Static126.anInt2568 &= Static144.anInt2707;
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5838(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass9_41.method279(arg0);
		if (super.aClass9_41.aBoolean15) {
			for (@Pc(22) int local22 = 0; local22 < Static350.anInt6330; local22++) {
				this.method1904(local22, arg0);
				@Pc(35) int[] local35 = this.method5847(0, Static291.anInt5270);
				local16[local22] = local35[Static126.anInt2568];
			}
		}
		return local16;
	}
}
