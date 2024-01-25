import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static55 {

	@OriginalMember(owner = "client!dk", name = "j", descriptor = "Lclient!lm;")
	public static Class134 aClass134_29;

	@OriginalMember(owner = "client!dk", name = "v", descriptor = "I")
	public static int anInt1333;

	@OriginalMember(owner = "client!dk", name = "d", descriptor = "Ljava/lang/String;")
	public static String aString46 = "Loading world list data";

	@OriginalMember(owner = "client!dk", name = "b", descriptor = "(I)V")
	public static void method1100() {
		@Pc(7) int local7 = 0;
		for (@Pc(14) int local14 = 0; local14 < Static43.anInt1151; local14++) {
			for (@Pc(18) int local18 = 0; local18 < Static260.anInt5348; local18++) {
				if (Static321.method5490(Static347.aClass83ArrayArrayArray3, local14, local7, local18, true)) {
					local7++;
				}
				if (local7 >= 512) {
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(II)V")
	public static void method1101(@OriginalArg(1) int arg0) {
		Static59.anInt1395 = arg0;
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(B)Lclient!ak;")
	public static Class11 method1102() {
		try {
			return new Class11_Sub2();
		} catch (@Pc(16) Throwable local16) {
			try {
				return (Class11) Class.forName("Class11_Sub3").getDeclaredConstructor().newInstance();
			} catch (@Pc(22) Throwable local22) {
				return new Class11_Sub1();
			}
		}
	}
}
