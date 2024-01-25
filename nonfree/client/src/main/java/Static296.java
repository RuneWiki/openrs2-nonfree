import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static296 {

	@OriginalMember(owner = "client!ss", name = "c", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray48 = new String[] { "en", "de", "fr", "pt", "nl" };

	@OriginalMember(owner = "client!ss", name = "e", descriptor = "Z")
	public static boolean aBoolean432 = true;

	@OriginalMember(owner = "client!ss", name = "h", descriptor = "I")
	public static volatile int anInt5941 = 0;

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(BIILclient!bi;)V")
	public static void method5032(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class26 arg2) {
		Static347.anInt6549 = arg1;
		Static271.anInt5362 = arg0;
		Static91.aClass26_29 = arg2;
	}

	@OriginalMember(owner = "client!ss", name = "c", descriptor = "(I)Lclient!ls;")
	public static Class66 method5033() {
		try {
			return (Class66) Class.forName("Class66_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(15) Throwable local15) {
			return null;
		}
	}

	@OriginalMember(owner = "client!ss", name = "b", descriptor = "(B)V")
	public static void method5034() {
		@Pc(1) Class103 local1 = Static103.aClass103_22;
		synchronized (Static103.aClass103_22) {
			Static103.aClass103_22.method2678();
		}
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(II)I")
	public static int method5035(@OriginalArg(0) int arg0) {
		@Pc(5) int local5 = 0;
		if (arg0 < 0 || arg0 >= 65536) {
			local5 += 16;
			arg0 >>>= 0x10;
		}
		if (arg0 >= 256) {
			arg0 >>>= 0x8;
			local5 += 8;
		}
		if (arg0 >= 16) {
			arg0 >>>= 0x4;
			local5 += 4;
		}
		if (arg0 >= 4) {
			arg0 >>>= 0x2;
			local5 += 2;
		}
		if (arg0 >= 1) {
			arg0 >>>= 0x1;
			local5++;
		}
		return arg0 + local5;
	}

	@OriginalMember(owner = "client!ss", name = "f", descriptor = "(I)V")
	public static void method5038() {
		for (@Pc(6) Class36_Sub3 local6 = (Class36_Sub3) Static111.aClass191_2.method4862(); local6 != null; local6 = (Class36_Sub3) Static111.aClass191_2.method4869()) {
			local6.method2178();
		}
	}
}
