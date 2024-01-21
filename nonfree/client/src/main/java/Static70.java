import java.util.Calendar;
import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static70 {

	@OriginalMember(owner = "client!lf", name = "k", descriptor = "Lclient!pd;")
	public static Class20 aClass20_34;

	@OriginalMember(owner = "client!lf", name = "l", descriptor = "Lclient!ib;")
	public static Class26 aClass26_1;

	@OriginalMember(owner = "client!lf", name = "r", descriptor = "[[B")
	public static byte[][] aByteArrayArray6;

	@OriginalMember(owner = "client!lf", name = "c", descriptor = "I")
	public static int anInt1726 = 0;

	@OriginalMember(owner = "client!lf", name = "f", descriptor = "Ljava/util/zip/CRC32;")
	public static CRC32 aCRC32_2 = new CRC32();

	@OriginalMember(owner = "client!lf", name = "i", descriptor = "I")
	public static int anInt1731 = 127;

	@OriginalMember(owner = "client!lf", name = "j", descriptor = "I")
	public static int anInt1732 = 0;

	@OriginalMember(owner = "client!lf", name = "m", descriptor = "I")
	public static int anInt1733 = 0;

	@OriginalMember(owner = "client!lf", name = "n", descriptor = "Lclient!ja;")
	public static Class39 aClass39_915 = Static28.method504("Script error in: ");

	@OriginalMember(owner = "client!lf", name = "o", descriptor = "Lclient!ja;")
	public static Class39 aClass39_916 = Static28.method504("<)4col>");

	@OriginalMember(owner = "client!lf", name = "p", descriptor = "Z")
	public static boolean aBoolean98 = false;

	@OriginalMember(owner = "client!lf", name = "q", descriptor = "Ljava/util/Calendar;")
	public static Calendar aCalendar1 = Calendar.getInstance();

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(Z)V")
	public static void method1186() {
		Static113.anImage4 = null;
		Static83.aFontMetrics1 = null;
		Static47.aFont1 = null;
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(I)V")
	public static void method1187() {
		aClass26_1 = null;
		aCalendar1 = null;
		aClass39_915 = null;
		aClass39_916 = null;
		aByteArrayArray6 = null;
		aCRC32_2 = null;
		aClass20_34 = null;
	}

	@OriginalMember(owner = "client!lf", name = "b", descriptor = "(I)V")
	public static void method1188() {
		Static96.aClass55_1.method2208();
		for (@Pc(14) int local14 = 0; local14 < 32; local14++) {
			Static7.aLongArray1[local14] = 0L;
		}
		for (@Pc(26) int local26 = 0; local26 < 32; local26++) {
			Static96.aLongArray6[local26] = 0L;
		}
		Static131.anInt3187 = 0;
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(IZ)Z")
	public static boolean method1189(@OriginalArg(0) int arg0) {
		return (arg0 >> 29 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(IB)V")
	public static void method1190(@OriginalArg(0) int arg0) {
		if (Static27.method502(arg0)) {
			Static19.method338(Static109.aClass4_Sub5ArrayArray1[arg0], -1);
		}
	}
}
