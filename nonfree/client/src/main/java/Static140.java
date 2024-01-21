import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static140 {

	@OriginalMember(owner = "client!qf", name = "r", descriptor = "I")
	public static int anInt3474;

	@OriginalMember(owner = "client!qf", name = "c", descriptor = "Lclient!jf;")
	public static Class42 aClass42_1 = new Class42();

	@OriginalMember(owner = "client!qf", name = "d", descriptor = "Lclient!dd;")
	private static Class13 aClass13_1188 = Static161.method2971("Too many incorrect logins from your address)3");

	@OriginalMember(owner = "client!qf", name = "e", descriptor = "J")
	public static long aLong122 = 0L;

	@OriginalMember(owner = "client!qf", name = "f", descriptor = "Lclient!dd;")
	public static Class13 aClass13_1189 = Static161.method2971("jlv");

	@OriginalMember(owner = "client!qf", name = "g", descriptor = "I")
	public static int anInt3467 = 0;

	@OriginalMember(owner = "client!qf", name = "j", descriptor = "Lclient!dd;")
	public static Class13 aClass13_1190 = aClass13_1188;

	@OriginalMember(owner = "client!qf", name = "k", descriptor = "Lclient!dd;")
	public static Class13 aClass13_1191 = Static161.method2971("Lade Schrifts-=tze )2 ");

	@OriginalMember(owner = "client!qf", name = "s", descriptor = "Lclient!dd;")
	public static Class13 aClass13_1192 = Static161.method2971("huffman");

	@OriginalMember(owner = "client!qf", name = "u", descriptor = "[Z")
	public static boolean[] aBooleanArray45 = new boolean[100];

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(IIZ)Lclient!dd;")
	public static Class13 method2506(@OriginalArg(0) int arg0) {
		return Static84.method1799(arg0, true);
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(I)V")
	public static void method2508() {
		aClass13_1190 = null;
		aBooleanArray45 = null;
		aClass13_1191 = null;
		aClass13_1189 = null;
		aClass42_1 = null;
		aClass13_1192 = null;
		aClass13_1188 = null;
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(IBILclient!fd;)V")
	public static void method2509(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class20 arg2) {
		if (Static162.aClass20_11 != null || Static46.aBoolean106 || (arg2 == null || Static169.method2889(arg2) == null)) {
			return;
		}
		Static162.aClass20_11 = arg2;
		Static83.aClass20_6 = Static169.method2889(arg2);
		Static148.anInt3590 = arg1;
		Static159.anInt3767 = 0;
		Static143.anInt3530 = arg0;
		Static12.aBoolean39 = false;
	}
}
