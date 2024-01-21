import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static100 {

	@OriginalMember(owner = "client!ma", name = "q", descriptor = "Lclient!aa;")
	public static Interface1 anInterface1_1;

	@OriginalMember(owner = "client!ma", name = "g", descriptor = "Lclient!lf;")
	private static Class49 aClass49_1013 = Static32.method683("shake:");

	@OriginalMember(owner = "client!ma", name = "d", descriptor = "Lclient!lf;")
	public static Class49 aClass49_1012 = aClass49_1013;

	@OriginalMember(owner = "client!ma", name = "e", descriptor = "Lclient!eh;")
	public static Class25 aClass25_7 = new Class25(8);

	@OriginalMember(owner = "client!ma", name = "h", descriptor = "I")
	public static int anInt2133 = 0;

	@OriginalMember(owner = "client!ma", name = "l", descriptor = "Lclient!lf;")
	public static Class49 aClass49_1014 = aClass49_1013;

	@OriginalMember(owner = "client!ma", name = "r", descriptor = "Lclient!lf;")
	public static Class49 aClass49_1015 = Static32.method683("Wordpack geladen)3");

	@OriginalMember(owner = "client!ma", name = "t", descriptor = "Lclient!lf;")
	private static Class49 aClass49_1017 = Static32.method683("Please contact customer support)3");

	@OriginalMember(owner = "client!ma", name = "s", descriptor = "Lclient!lf;")
	public static Class49 aClass49_1016 = aClass49_1017;

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(BLclient!vg;)Z")
	public static boolean method1729(@OriginalArg(1) Class85 arg0) {
		if (Static140.aBoolean127) {
			if (Static111.method1895(arg0) != 0) {
				return false;
			}
			if (arg0.anInt3855 == 0) {
				return false;
			}
		}
		return arg0.aBoolean161;
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(I)V")
	public static void method1731() {
		anInterface1_1 = null;
		aClass49_1013 = null;
		aClass49_1016 = null;
		aClass49_1014 = null;
		aClass49_1015 = null;
		aClass25_7 = null;
		aClass49_1012 = null;
		aClass49_1017 = null;
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(Lclient!vg;B)Z")
	public static boolean method1733(@OriginalArg(0) Class85 arg0) {
		@Pc(6) int local6 = arg0.anInt3876;
		if (local6 == 205) {
			Static12.anInt220 = 250;
			return true;
		}
		@Pc(38) int local38;
		@Pc(32) int local32;
		if (local6 >= 300 && local6 <= 313) {
			local32 = local6 & 0x1;
			local38 = (local6 - 300) / 2;
			Static128.aClass10_1.method209(local38, local32 == 1);
		}
		if (local6 >= 314 && local6 <= 323) {
			local38 = (local6 - 314) / 2;
			local32 = local6 & 0x1;
			Static128.aClass10_1.method215(local38, local32 == 1);
		}
		if (local6 == 324) {
			Static128.aClass10_1.method221(false);
		}
		if (local6 == 325) {
			Static128.aClass10_1.method221(true);
		}
		if (local6 == 326) {
			Static176.aClass2_Sub13_Sub1_14.method2976(253);
			Static128.aClass10_1.method216(Static176.aClass2_Sub13_Sub1_14);
			return true;
		} else {
			return false;
		}
	}
}
