import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static136 {

	@OriginalMember(owner = "client!q", name = "p", descriptor = "J")
	public static long aLong116;

	@OriginalMember(owner = "client!q", name = "u", descriptor = "Ljava/lang/String;")
	public static String aString4;

	@OriginalMember(owner = "client!q", name = "o", descriptor = "Lclient!dd;")
	private static Class13 aClass13_1155 = Static161.method2971("May");

	@OriginalMember(owner = "client!q", name = "q", descriptor = "Lclient!dd;")
	private static Class13 aClass13_1156 = Static161.method2971("Jan");

	@OriginalMember(owner = "client!q", name = "r", descriptor = "Lclient!dd;")
	private static Class13 aClass13_1157 = Static161.method2971("Aug");

	@OriginalMember(owner = "client!q", name = "s", descriptor = "Lclient!dd;")
	private static Class13 aClass13_1158 = Static161.method2971("Mar");

	@OriginalMember(owner = "client!q", name = "v", descriptor = "Lclient!dd;")
	private static Class13 aClass13_1159 = Static161.method2971("Dec");

	@OriginalMember(owner = "client!q", name = "w", descriptor = "Lclient!dd;")
	private static Class13 aClass13_1160 = Static161.method2971("Jun");

	@OriginalMember(owner = "client!q", name = "x", descriptor = "Z")
	public static volatile boolean aBoolean260 = true;

	@OriginalMember(owner = "client!q", name = "y", descriptor = "Lclient!dd;")
	private static Class13 aClass13_1161 = Static161.method2971("Oct");

	@OriginalMember(owner = "client!q", name = "z", descriptor = "Lclient!dd;")
	private static Class13 aClass13_1162 = Static161.method2971("Sep");

	@OriginalMember(owner = "client!q", name = "A", descriptor = "Lclient!dd;")
	private static Class13 aClass13_1163 = Static161.method2971("Jul");

	@OriginalMember(owner = "client!q", name = "G", descriptor = "Lclient!dd;")
	private static Class13 aClass13_1165 = Static161.method2971("Feb");

	@OriginalMember(owner = "client!q", name = "H", descriptor = "Lclient!dd;")
	private static Class13 aClass13_1166 = Static161.method2971("Apr");

	@OriginalMember(owner = "client!q", name = "F", descriptor = "Lclient!dd;")
	private static Class13 aClass13_1164 = Static161.method2971("Nov");

	@OriginalMember(owner = "client!q", name = "D", descriptor = "[Lclient!dd;")
	public static Class13[] aClass13Array24 = new Class13[] { aClass13_1156, aClass13_1165, aClass13_1158, aClass13_1166, aClass13_1155, aClass13_1160, aClass13_1163, aClass13_1157, aClass13_1162, aClass13_1161, aClass13_1164, aClass13_1159 };

	@OriginalMember(owner = "client!q", name = "E", descriptor = "I")
	public static int anInt3397 = 0;

	@OriginalMember(owner = "client!q", name = "c", descriptor = "(I)V")
	public static void method2433() {
		Static109.aClass47_23.method1995();
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(BI)Z")
	public static boolean method2434(@OriginalArg(1) int arg0) {
		return arg0 >= 48 && arg0 <= 57;
	}

	@OriginalMember(owner = "client!q", name = "d", descriptor = "(I)V")
	public static void method2435() {
		aClass13_1164 = null;
		aString4 = null;
		aClass13Array24 = null;
		aClass13_1158 = null;
		aClass13_1159 = null;
		aClass13_1162 = null;
		aClass13_1166 = null;
		aClass13_1165 = null;
		aClass13_1163 = null;
		aClass13_1160 = null;
		aClass13_1155 = null;
		aClass13_1157 = null;
		aClass13_1156 = null;
		aClass13_1161 = null;
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(JI)V")
	public static void method2437(@OriginalArg(0) long arg0) {
		try {
			Thread.sleep(arg0);
		} catch (@Pc(12) InterruptedException local12) {
		}
	}
}
