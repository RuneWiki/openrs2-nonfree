import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static356 {

	@OriginalMember(owner = "client!we", name = "E", descriptor = "I")
	public static int anInt7127;

	@OriginalMember(owner = "client!we", name = "I", descriptor = "I")
	public static int anInt7128;

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(IILjava/util/Random;)I", line = 240)
	public static int method6362(@OriginalArg(1) int arg0, @OriginalArg(2) Random arg1) {
		if (arg0 <= 0) {
			throw new IllegalArgumentException();
		} else if (Static227.method4252(arg0)) {
			return (int) (((long) arg1.nextInt() & 0xFFFFFFFFL) * (long) arg0 >> 32);
		} else {
			@Pc(42) int local42 = Integer.MIN_VALUE - (int) (4294967296L % (long) arg0);
			@Pc(45) int local45;
			do {
				local45 = arg1.nextInt();
			} while (local45 >= local42);
			return Static11.method244(arg0, local45);
		}
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(Lclient!r;I)V", line = 270)
	public static void method6363(@OriginalArg(0) Class197 arg0) {
		Class103.anInt2703 = 0;
		Class61.anInt1833 = 0;
		Static122.aClass36_4 = new Class36();
		Static91.aClass12_Sub1_Sub1_Sub1Array1 = new Class12_Sub1_Sub1_Sub1[1024];
		Static262.method4896(arg0);
		Static143.method2770(arg0);
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lclient!hk;", line = 328)
	public static RuntimeException_Sub1 method6365(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(9) RuntimeException_Sub1 local9;
		if (arg0 instanceof RuntimeException_Sub1) {
			local9 = (RuntimeException_Sub1) arg0;
			local9.aString23 = local9.aString23 + ' ' + arg1;
		} else {
			local9 = new RuntimeException_Sub1(arg0, arg1);
		}
		return local9;
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(IIIZI)Lclient!cu;", line = 345)
	public static Class2_Sub7 method6366(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3) {
		@Pc(7) Class2_Sub7 local7 = new Class2_Sub7();
		local7.anInt1368 = arg3;
		local7.anInt1371 = arg1;
		Class2_Sub3_Sub34.aClass4_130.method87(local7, (long) arg0);
		Static150.method2958(arg3);
		@Pc(26) Class161 local26 = Static6.method140(arg0);
		if (local26 != null) {
			Static187.method3646(local26);
		}
		if (Class133.aClass161_8 != null) {
			Static187.method3646(Class133.aClass161_8);
			Class133.aClass161_8 = null;
		}
		Static211.method3990();
		if (local26 != null) {
			Static81.method1913(!arg2, local26);
		}
		if (!arg2) {
			Static185.method3599(arg3);
		}
		if (!arg2 && Class97.anInt2592 != -1) {
			Static366.method6461(Class97.anInt2592, 1);
		}
		return local7;
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(IIII)I", line = 403)
	public static int method6368(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(3) int local3 = arg0 & 0x3;
		if (local3 == 0) {
			return arg1;
		} else if (local3 == 1) {
			return arg2;
		} else if (local3 == 2) {
			return 1023 - arg1;
		} else {
			return 1023 - arg2;
		}
	}
}
