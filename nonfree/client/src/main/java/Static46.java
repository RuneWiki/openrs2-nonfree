import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static46 {

	@OriginalMember(owner = "client!bja", name = "g", descriptor = "Lclient!mu;")
	public static final Class215 aClass215_15 = new Class215(74, 28);

	@OriginalMember(owner = "client!bja", name = "b", descriptor = "(B)Ljava/lang/String;")
	public static String method1669() {
		if (Static65.aBoolean754 || Static74.aClass2_Sub6_Sub3_1 == null) {
			return "";
		} else if ((Static74.aClass2_Sub6_Sub3_1.aString21 == null || Static74.aClass2_Sub6_Sub3_1.aString21.length() == 0) && Static74.aClass2_Sub6_Sub3_1.aString20 != null && Static74.aClass2_Sub6_Sub3_1.aString20.length() > 0) {
			return Static74.aClass2_Sub6_Sub3_1.aString20;
		} else {
			return Static74.aClass2_Sub6_Sub3_1.aString21;
		}
	}

	@OriginalMember(owner = "client!bja", name = "g", descriptor = "(I)I")
	public static int method1670() {
		@Pc(21) byte local21;
		if (Static514.anInt9425 < 96) {
			Static27.method681();
			local21 = 1;
		} else {
			@Pc(26) int local26 = Static602.method8804();
			if (local26 <= 100) {
				local21 = 4;
				Static381.method6295();
			} else if (local26 <= 500) {
				local21 = 3;
				Static247.method6231();
			} else if (local26 <= 1000) {
				local21 = 2;
				Static418.method6758();
			} else {
				Static27.method681();
				local21 = 1;
			}
		}
		if (Static74.aClass2_Sub13_5.aClass14_Sub5_2.method2945() != 0) {
			Static74.aClass2_Sub13_5.method2607(Static74.aClass2_Sub13_5.aClass14_Sub5_1, 0);
			Static316.method5509(false, 0);
		}
		Static318.method5531();
		return local21;
	}

	@OriginalMember(owner = "client!bja", name = "a", descriptor = "(III)Z")
	public static boolean method1674(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x10) != 0;
	}
}
