import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static55 {

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "Lclient!se;")
	public static Class2_Sub2_Sub15 aClass2_Sub2_Sub15_2;

	@OriginalMember(owner = "client!jc", name = "e", descriptor = "Lclient!pe;")
	public static Class26_Sub1 aClass26_Sub1_20;

	@OriginalMember(owner = "client!jc", name = "l", descriptor = "[I")
	public static int[] anIntArray52;

	@OriginalMember(owner = "client!jc", name = "A", descriptor = "[Lclient!bc;")
	public static Class2_Sub2_Sub1_Sub2[] aClass2_Sub2_Sub1_Sub2Array3;

	@OriginalMember(owner = "client!jc", name = "W", descriptor = "Lclient!vc;")
	public static Class2_Sub16_Sub3 aClass2_Sub16_Sub3_2;

	@OriginalMember(owner = "client!jc", name = "k", descriptor = "Lclient!u;")
	public static Class74 aClass74_426 = Static72.method1077("RuneScape wird geladen )2 bitte warten)3)3)3");

	@OriginalMember(owner = "client!jc", name = "q", descriptor = "Lclient!u;")
	private static Class74 aClass74_427 = Static72.method1077("Service unavailable)3");

	@OriginalMember(owner = "client!jc", name = "r", descriptor = "I")
	public static int anInt513 = -1;

	@OriginalMember(owner = "client!jc", name = "t", descriptor = "Lclient!u;")
	private static Class74 aClass74_428 = Static72.method1077("Error connecting to server)3");

	@OriginalMember(owner = "client!jc", name = "u", descriptor = "Lclient!u;")
	public static Class74 aClass74_429 = Static72.method1077(":0");

	@OriginalMember(owner = "client!jc", name = "z", descriptor = "Lclient!u;")
	public static Class74 aClass74_430 = aClass74_428;

	@OriginalMember(owner = "client!jc", name = "B", descriptor = "[[I")
	public static int[][] anIntArrayArray4 = new int[104][104];

	@OriginalMember(owner = "client!jc", name = "G", descriptor = "Lclient!u;")
	public static Class74 aClass74_431 = Static72.method1077(" steht bereits auf Ihrer Freunde)2Liste(Q");

	@OriginalMember(owner = "client!jc", name = "H", descriptor = "Lclient!u;")
	public static Class74 aClass74_432 = Static72.method1077("@lre@");

	@OriginalMember(owner = "client!jc", name = "J", descriptor = "[I")
	public static int[] anIntArray53 = new int[500];

	@OriginalMember(owner = "client!jc", name = "L", descriptor = "Z")
	public static boolean aBoolean16 = false;

	@OriginalMember(owner = "client!jc", name = "S", descriptor = "Lclient!u;")
	public static Class74 aClass74_433 = Static72.method1077("(U4");

	@OriginalMember(owner = "client!jc", name = "Y", descriptor = "Lclient!u;")
	public static Class74 aClass74_434 = aClass74_427;

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(B)V")
	public static void method382() {
		Static104.aClass16_91.method485();
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(Lclient!de;IIILjava/awt/Component;)Lclient!kf;")
	public static Class22 method386(@OriginalArg(0) Class15 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Component arg3) {
		if (Static119.anInt2551 == 0) {
			throw new IllegalStateException();
		}
		try {
			@Pc(33) Class22 local33 = (Class22) Class.forName("Class22_Sub1").getDeclaredConstructor().newInstance();
			local33.anIntArray210 = new int[(Static106.aBoolean99 ? 2 : 1) * 256];
			local33.anInt1586 = arg2;
			local33.method1096(arg3);
			local33.anInt1584 = (arg2 & 0xFFFFFC00) + 1024;
			if (local33.anInt1584 > 16384) {
				local33.anInt1584 = 16384;
			}
			local33.method1085(local33.anInt1584);
			if (Static79.anInt1769 > 0 && Static18.aClass30_1 == null) {
				Static18.aClass30_1 = new Class30();
				arg0.method463(Static79.anInt1769, Static18.aClass30_1);
			}
			if (Static18.aClass30_1 != null) {
				if (Static18.aClass30_1.aClass22Array1[arg1] != null) {
					throw new IllegalArgumentException();
				}
				Static18.aClass30_1.aClass22Array1[arg1] = local33;
			}
			return local33;
		} catch (@Pc(105) Throwable local105) {
			try {
				@Pc(111) Class22_Sub2 local111 = new Class22_Sub2(arg0, arg1);
				local111.anIntArray210 = new int[(Static106.aBoolean99 ? 2 : 1) * 256];
				local111.anInt1586 = arg2;
				local111.method1096(arg3);
				local111.anInt1584 = 16384;
				local111.method1085(local111.anInt1584);
				if (Static79.anInt1769 > 0 && Static18.aClass30_1 == null) {
					Static18.aClass30_1 = new Class30();
					arg0.method463(Static79.anInt1769, Static18.aClass30_1);
				}
				if (Static18.aClass30_1 != null) {
					if (Static18.aClass30_1.aClass22Array1[arg1] != null) {
						throw new IllegalArgumentException();
					}
					Static18.aClass30_1.aClass22Array1[arg1] = local111;
				}
				return local111;
			} catch (@Pc(170) Throwable local170) {
				return new Class22();
			}
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(Lclient!ve;I)Z")
	public static boolean method389(@OriginalArg(0) Class2_Sub2_Sub17 arg0) {
		if (arg0.anIntArray400 == null) {
			return false;
		}
		for (@Pc(12) int local12 = 0; local12 < arg0.anIntArray400.length; local12++) {
			@Pc(19) int local19 = Static121.method1793(arg0, local12);
			@Pc(24) int local24 = arg0.anIntArray405[local12];
			if (arg0.anIntArray400[local12] == 2) {
				if (local24 <= local19) {
					return false;
				}
			} else if (arg0.anIntArray400[local12] == 3) {
				if (local19 <= local24) {
					return false;
				}
			} else if (arg0.anIntArray400[local12] == 4) {
				if (local19 == local24) {
					return false;
				}
			} else if (local19 != local24) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!jc", name = "d", descriptor = "(I)V")
	public static void method394() {
		System.out.println("Usage: worldid, [live/office/local], [live/rc/wip], [lowmem/highmem], [free/members], [english/german]");
		System.exit(1);
	}

	@OriginalMember(owner = "client!jc", name = "e", descriptor = "(I)V")
	public static void method396() {
		aClass74_428 = null;
		aClass2_Sub2_Sub15_2 = null;
		aClass2_Sub16_Sub3_2 = null;
		anIntArray52 = null;
		aClass74_434 = null;
		aClass74_429 = null;
		aClass74_426 = null;
		aClass74_432 = null;
		aClass26_Sub1_20 = null;
		aClass74_427 = null;
		aClass74_431 = null;
		anIntArrayArray4 = null;
		aClass74_430 = null;
		anIntArray53 = null;
		aClass74_433 = null;
		aClass2_Sub2_Sub1_Sub2Array3 = null;
	}
}
