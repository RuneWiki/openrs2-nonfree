import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static308 {

	@OriginalMember(owner = "client!lt", name = "c", descriptor = "J")
	public static long aLong139;

	@OriginalMember(owner = "client!lt", name = "g", descriptor = "Lclient!f;")
	public static Class5 aClass5_21;

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "Lclient!eg;")
	public static final Class77 aClass77_2 = new Class77();

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(I)V")
	public static void method4623() {
		Static233.aClass207_23.method4392();
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(Ljava/lang/String;IIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V")
	public static void method4624(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) String arg3, @OriginalArg(5) String arg4, @OriginalArg(6) String arg5) {
		Static489.method6727(arg4, arg0, arg2, arg5, -1, null, arg3, arg1);
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(B)V")
	public static void method4625() {
		@Pc(5) int local5 = 0;
		if (Static86.aClass1_Sub30_Sub1_1.method5019(Static286.anInt5239)) {
			local5 = 55;
		}
		if (!Static86.aClass1_Sub30_Sub1_1.aBoolean475) {
			local5 |= 0x40;
		}
		Static143.method2430(local5);
		Static347.aClass122_4.method2769(local5);
		Static230.aClass225_1.method4859(local5);
		Static84.aClass242_1.method5276(local5);
		Static583.aClass256_2.method5470(local5);
		Static523.method6295(local5);
		Static249.method3637(local5);
		Static80.method1332(local5);
		Static384.method5550(local5);
		Static207.method3172();
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(III)Z")
	public static boolean method4627(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static98.method1465(arg0, arg1) & Static115.method1622(arg0, arg1);
	}

	@OriginalMember(owner = "client!lt", name = "b", descriptor = "(IB)Z")
	public static boolean method4628(@OriginalArg(0) int arg0) {
		if (arg0 == 6 || arg0 == 57 || arg0 == 10 || arg0 == 47 || arg0 == 49) {
			return true;
		} else {
			return arg0 == 22 || arg0 == 1012;
		}
	}
}
