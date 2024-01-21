import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static61 {

	@OriginalMember(owner = "client!hf", name = "o", descriptor = "I")
	public static int anInt1524;

	@OriginalMember(owner = "client!hf", name = "p", descriptor = "[I")
	public static int[] anIntArray99;

	@OriginalMember(owner = "client!hf", name = "b", descriptor = "Ljava/util/Calendar;")
	public static Calendar aCalendar1 = Calendar.getInstance();

	@OriginalMember(owner = "client!hf", name = "d", descriptor = "Lclient!ai;")
	public static Class6 aClass6_435 = Static38.method685("gr-Un:");

	@OriginalMember(owner = "client!hf", name = "i", descriptor = "Lclient!ai;")
	public static Class6 aClass6_436 = Static38.method685("<img=1>");

	@OriginalMember(owner = "client!hf", name = "j", descriptor = "[I")
	public static int[] anIntArray98 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!hf", name = "q", descriptor = "I")
	public static int anInt1525 = 0;

	@OriginalMember(owner = "client!hf", name = "r", descriptor = "I")
	public static int anInt1526 = 0;

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(I)V")
	public static void method983() {
		anIntArray98 = null;
		aClass6_436 = null;
		anIntArray99 = null;
		aCalendar1 = null;
		aClass6_435 = null;
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(B)V")
	public static void method984() {
		Static31.anInt772 = 0;
		Static145.anInt3425 = -1;
		Static31.anInt773 = 0;
		Static66.aClass2_Sub13_Sub1_2.anInt2154 = 0;
		Static89.anInt2261 = -1;
		Static46.anInt1322 = 0;
		Static86.anInt2213 = -1;
		Static113.anInt2752 = 0;
		Static141.anInt3312 = -1;
		Static152.anInt3513 = 0;
		Static139.anInt3252 = 0;
		Static64.aClass2_Sub13_Sub1_1.anInt2154 = 0;
		Static160.aBoolean24 = false;
		for (@Pc(35) int local35 = 0; local35 < Static2.aClass2_Sub3_Sub5_Sub1_Sub1Array1.length; local35++) {
			if (Static2.aClass2_Sub3_Sub5_Sub1_Sub1Array1[local35] != null) {
				Static2.aClass2_Sub3_Sub5_Sub1_Sub1Array1[local35].anInt2699 = -1;
			}
		}
		for (@Pc(53) int local53 = 0; local53 < Static151.aClass2_Sub3_Sub5_Sub1_Sub2Array1.length; local53++) {
			if (Static151.aClass2_Sub3_Sub5_Sub1_Sub2Array1[local53] != null) {
				Static151.aClass2_Sub3_Sub5_Sub1_Sub2Array1[local53].anInt2699 = -1;
			}
		}
		Static38.method683();
		Static98.method1607(30);
		for (@Pc(88) int local88 = 0; local88 < 100; local88++) {
			Static86.aBooleanArray5[local88] = true;
		}
	}
}
