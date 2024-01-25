import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static36 {

	@OriginalMember(owner = "client!bo", name = "r", descriptor = "Lclient!mc;")
	public static Class152 aClass152_1;

	@OriginalMember(owner = "client!bo", name = "x", descriptor = "[Lclient!oh;")
	public static Class1_Sub3[] aClass1_Sub3Array1;

	@OriginalMember(owner = "client!bo", name = "o", descriptor = "Lclient!hb;")
	public static final Class92 aClass92_33 = new Class92(33, 11);

	@OriginalMember(owner = "client!bo", name = "v", descriptor = "Lclient!jd;")
	public static final Class119 aClass119_3 = new Class119(7, 0, 1, 1);

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(III)V")
	public static void method847(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static390.anInt6740 == 1) {
			Static421.method3680(Static419.aClass3_Sub38_2, arg0, arg1);
		} else if (Static390.anInt6740 == 2) {
			Static438.method5861(arg1, arg0);
		}
		Static419.aClass3_Sub38_2 = null;
		Static390.anInt6740 = 0;
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(ILjava/util/Random;I)I")
	public static int method851(@OriginalArg(1) Random arg0, @OriginalArg(2) int arg1) {
		if (arg1 <= 0) {
			throw new IllegalArgumentException();
		} else if (Static39.method920(arg1)) {
			return (int) ((long) arg1 * ((long) arg0.nextInt() & 0xFFFFFFFFL) >> 32);
		} else {
			@Pc(34) int local34 = Integer.MIN_VALUE - (int) (4294967296L % (long) arg1);
			@Pc(37) int local37;
			do {
				local37 = arg0.nextInt();
			} while (local34 <= local37);
			return Static81.method1413(local37, arg1);
		}
	}

	@OriginalMember(owner = "client!bo", name = "b", descriptor = "(B)V")
	public static void method853() {
		Static408.aClass3_Sub5_Sub1_118.method3621();
		Static27.aClass56_11 = null;
		Static347.anInt6319 = 1;
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(ZLclient!bt;)Lclient!sd;")
	public static Class82_Sub3 method854(@OriginalArg(1) Class3_Sub2 arg0) {
		return new Class82_Sub3(arg0.method6039(), arg0.method6039(), arg0.method6039(), arg0.method6039(), arg0.method6039(), arg0.method6039(), arg0.method6039(), arg0.method6039(), arg0.method6020(), arg0.method6053());
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(ILclient!dn;Lclient!m;)V")
	public static void method858(@OriginalArg(1) Class56 arg0, @OriginalArg(2) Interface7 arg1) {
		Static61.aClass56_17 = arg0;
		Static60.anInterface7_2 = arg1;
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(BI)I")
	public static int method860(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}
}
