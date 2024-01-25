import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static512 {

	@OriginalMember(owner = "client!sca", name = "t", descriptor = "[Lclient!up;")
	public static final Interface26[] anInterface26Array1 = new Interface26[128];

	@OriginalMember(owner = "client!sca", name = "B", descriptor = "J")
	public static long aLong232 = 0L;

	@OriginalMember(owner = "client!sca", name = "a", descriptor = "(ILjava/util/Random;B)I")
	public static int method7419(@OriginalArg(0) int arg0, @OriginalArg(1) Random arg1) {
		if (arg0 <= 0) {
			throw new IllegalArgumentException();
		} else if (Static112.method1840(arg0)) {
			return (int) ((long) arg0 * ((long) arg1.nextInt() & 0xFFFFFFFFL) >> 32);
		} else {
			@Pc(39) int local39 = Integer.MIN_VALUE - (int) (4294967296L % (long) arg0);
			@Pc(42) int local42;
			do {
				local42 = arg1.nextInt();
			} while (local42 >= local39);
			return Static459.method6825(arg0, local42);
		}
	}

	@OriginalMember(owner = "client!sca", name = "d", descriptor = "(I)V")
	public static void method7420() {
		if (Static266.aClass82_8 == null) {
			return;
		}
		if (Static80.aBoolean118) {
			Static129.method2281();
		}
		Static460.aClass47_3.method1162();
		Static56.method1016();
		Static218.method3802();
		Static473.method7003();
		Static474.method7011();
		Static113.method2082();
		if (Static626.aClass137_1 != null) {
			Static626.aClass137_1.method3191();
		}
		Static108.method1802();
		Static393.method7906();
		Static154.method2734();
		Static424.method6725();
		Static412.method6389(false);
		for (@Pc(43) int local43 = 0; local43 < 2048; local43++) {
			@Pc(49) Class9_Sub2_Sub1_Sub2_Sub1 local49 = Static507.aClass9_Sub2_Sub1_Sub2_Sub1Array1[local43];
			if (local49 != null) {
				for (@Pc(53) int local53 = 0; local53 < local49.aClass75Array3.length; local53++) {
					local49.aClass75Array3[local53] = null;
				}
			}
		}
		for (@Pc(78) int local78 = 0; local78 < Static73.anInt1445; local78++) {
			@Pc(85) Class9_Sub2_Sub1_Sub2_Sub2 local85 = Static179.aClass3_Sub43Array1[local78].aClass9_Sub2_Sub1_Sub2_Sub2_2;
			if (local85 != null) {
				for (@Pc(89) int local89 = 0; local89 < local85.aClass75Array3.length; local89++) {
					local85.aClass75Array3[local89] = null;
				}
			}
		}
		Static292.aClass31_20 = null;
		Static570.aClass31_14 = null;
		Static266.aClass82_8.method6133();
		Static266.aClass82_8 = null;
	}

	@OriginalMember(owner = "client!sca", name = "a", descriptor = "(ZI)I")
	public static int method7421(@OriginalArg(1) int arg0) {
		if (arg0 == 6407 || arg0 == 34843 || arg0 == 34837) {
			return 6407;
		} else if (arg0 == 6408 || arg0 == 34842 || arg0 == 34836) {
			return 6408;
		} else if (arg0 == 6406 || arg0 == 34844) {
			return 6406;
		} else if (arg0 == 6409 || arg0 == 34846) {
			return 6409;
		} else if (arg0 == 6410 || arg0 == 34847) {
			return 6410;
		} else if (arg0 == 6402) {
			return 6402;
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!sca", name = "a", descriptor = "(IIII)V")
	public static void method7422(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1) {
		@Pc(7) int local7 = arg0 << 3;
		@Pc(15) int local15 = arg1 << 3;
		Static170.aFloat71 = (float) local15;
		Static509.aFloat152 = (float) local7;
		if (Static471.anInt8064 == 2) {
			Static35.anInt545 = local15;
			Static330.anInt6250 = 0;
			Static253.anInt4961 = local7;
		}
		Static549.method7848();
		Static66.aBoolean84 = true;
	}
}
