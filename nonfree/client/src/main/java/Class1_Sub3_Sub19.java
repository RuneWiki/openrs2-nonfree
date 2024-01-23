import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jd")
public final class Class1_Sub3_Sub19 extends Class1_Sub3 {

	@OriginalMember(owner = "client!jd", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub19() {
		super(1, false);
	}

	@OriginalMember(owner = "client!jd", name = "c", descriptor = "(III)V")
	private void method1548(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(5) int local5 = Static106.anIntArray202[arg1];
		@Pc(9) int local9 = Static23.anIntArray47[arg0];
		@Pc(20) float local20 = (float) Math.atan2((double) (local5 - 2048), (double) (local9 - 2048));
		if ((double) local20 >= -3.141592653589793D && (double) local20 <= -2.356194490192345D) {
			Static32.anInt604 = arg0;
			Static138.anInt2806 = arg1;
		} else if ((double) local20 <= -1.5707963267948966D && (double) local20 >= -2.356194490192345D) {
			Static138.anInt2806 = arg0;
			Static32.anInt604 = arg1;
		} else if ((double) local20 <= -0.7853981633974483D && (double) local20 >= -1.5707963267948966D) {
			Static32.anInt604 = arg1;
			Static138.anInt2806 = Static76.anInt1531 - arg0;
		} else if (local20 <= 0.0F && (double) local20 >= -0.7853981633974483D) {
			Static138.anInt2806 = arg1;
			Static32.anInt604 = Static30.anInt572 - arg0;
		} else if (local20 >= 0.0F && (double) local20 <= 0.7853981633974483D) {
			Static138.anInt2806 = Static76.anInt1531 - arg1;
			Static32.anInt604 = Static30.anInt572 - arg0;
		} else if ((double) local20 >= 0.7853981633974483D && (double) local20 <= 1.5707963267948966D) {
			Static138.anInt2806 = Static76.anInt1531 - arg0;
			Static32.anInt604 = Static30.anInt572 - arg1;
		} else if ((double) local20 >= 1.5707963267948966D && (double) local20 <= 2.356194490192345D) {
			Static32.anInt604 = Static30.anInt572 - arg1;
			Static138.anInt2806 = arg0;
		} else if ((double) local20 >= 2.356194490192345D && (double) local20 <= 3.141592653589793D) {
			Static32.anInt604 = arg0;
			Static138.anInt2806 = Static76.anInt1531 - arg1;
		}
		Static32.anInt604 &= Static171.anInt3496;
		Static138.anInt2806 &= Static121.anInt2385;
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(IILclient!pg;)V")
	@Override
	public void method3466(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub17 arg1) {
		if (arg0 == 0) {
			super.aBoolean213 = arg1.method2142() == 1;
		}
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(IZ)[[I")
	@Override
	public int[][] method3467(@OriginalArg(0) int arg0) {
		@Pc(7) int[][] local7 = super.aClass56_41.method1552(arg0);
		if (super.aClass56_41.aBoolean90) {
			@Pc(26) int[] local26 = local7[0];
			@Pc(30) int[] local30 = local7[1];
			@Pc(34) int[] local34 = local7[2];
			for (@Pc(36) int local36 = 0; local36 < Static76.anInt1531; local36++) {
				this.method1548(arg0, local36);
				@Pc(49) int[][] local49 = this.method3465(Static32.anInt604, 0);
				local26[local36] = local49[0][Static138.anInt2806];
				local30[local36] = local49[1][Static138.anInt2806];
				local34[local36] = local49[2][Static138.anInt2806];
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method3475(@OriginalArg(1) int arg0) {
		@Pc(12) int[] local12 = super.aClass79_41.method2341(arg0);
		if (super.aClass79_41.aBoolean125) {
			for (@Pc(22) int local22 = 0; local22 < Static76.anInt1531; local22++) {
				this.method1548(arg0, local22);
				@Pc(35) int[] local35 = this.method3468(Static32.anInt604, 0);
				local12[local22] = local35[Static138.anInt2806];
			}
		}
		return local12;
	}
}
