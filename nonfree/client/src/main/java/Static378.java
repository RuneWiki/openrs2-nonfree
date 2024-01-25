import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static378 {

	@OriginalMember(owner = "client!ni", name = "n", descriptor = "F")
	public static float aFloat215;

	@OriginalMember(owner = "client!ni", name = "c", descriptor = "I")
	public static int anInt9721 = 2;

	@OriginalMember(owner = "client!ni", name = "m", descriptor = "Lclient!fha;")
	public static final Class109 aClass109_71 = new Class109();

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(B)V")
	private static void method8121() {
		Static28.aClass32_7.method632();
		Static489.aClass32_18.method632();
		Static154.aClass32_23.method632();
		Static589.aClass32_84.method632();
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(IB)Z")
	public static boolean method8122(@OriginalArg(0) int arg0) {
		return arg0 == 3 || arg0 == 5 || arg0 == 6;
	}

	@OriginalMember(owner = "client!ni", name = "b", descriptor = "(B)V")
	public static void method8123() {
		Static18.aClass96_1.method2120();
		Static244.aClass242_7.method5371();
		Static502.aClass23_2.method547();
		Static319.aClass141_4.method2968();
		Static409.aClass107_2.method2289();
		Static72.aClass225_2.method4791();
		Static540.aClass173_2.method3794();
		Static460.aClass155_2.method3360();
		Static89.aClass330_3.method7449();
		Static361.aClass106_1.method2245();
		Static43.aClass283_1.method6259();
		Static264.aClass207_3.method4284();
		Static599.aClass197_4.method4162();
		Static71.aClass345_1.method7727();
		Static339.aClass66_1.method1436();
		Static355.aClass157_1.method3388();
		Static263.aClass224_1.method4712();
		Static516.aClass43_3.method890();
		Static537.aClass308_2.method6912();
		Static105.aClass339_1.method7581();
		Static498.method6888();
		method8121();
		Static145.method2194();
		Static644.method8648();
		Static255.method3526();
		Static352.aClass32_57.method632();
		Static247.aClass32_43.method632();
		Static84.aClass32_14.method632();
		Static234.aClass32_87.method632();
		Static300.aClass32_48.method632();
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(IZLjava/lang/String;Z)Z")
	public static boolean method8132(@OriginalArg(2) String arg0) {
		@Pc(28) boolean local28 = false;
		@Pc(30) boolean local30 = false;
		@Pc(32) int local32 = 0;
		@Pc(35) int local35 = arg0.length();
		for (@Pc(37) int local37 = 0; local37 < local35; local37++) {
			@Pc(43) char local43 = arg0.charAt(local37);
			if (local37 == 0) {
				if (local43 == '-') {
					local28 = true;
					continue;
				}
				if (local43 == '+') {
					continue;
				}
			}
			@Pc(80) int local80;
			if (local43 >= '0' && local43 <= '9') {
				local80 = local43 - '0';
			} else if (local43 >= 'A' && local43 <= 'Z') {
				local80 = local43 - '7';
			} else if (local43 >= 'a' && local43 <= 'z') {
				local80 = local43 - 'W';
			} else {
				return false;
			}
			if (local80 >= 10) {
				return false;
			}
			if (local28) {
				local80 = -local80;
			}
			@Pc(116) int local116 = local80 + local32 * 10;
			if (local32 != local116 / 10) {
				return false;
			}
			local32 = local116;
			local30 = true;
		}
		return local30;
	}
}
