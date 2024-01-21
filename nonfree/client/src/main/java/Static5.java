import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static5 {

	@OriginalMember(owner = "client!ae", name = "U", descriptor = "I")
	public static int anInt173;

	@OriginalMember(owner = "client!ae", name = "ab", descriptor = "Lclient!ad;")
	public static Class5_Sub1 aClass5_Sub1_1;

	@OriginalMember(owner = "client!ae", name = "P", descriptor = "Lclient!od;")
	public static Class44 aClass44_1 = new Class44();

	@OriginalMember(owner = "client!ae", name = "Q", descriptor = "J")
	public static long aLong12 = 0L;

	@OriginalMember(owner = "client!ae", name = "T", descriptor = "Lclient!o;")
	public static Class40 aClass40_43 = Static13.method257("@red@Offline");

	@OriginalMember(owner = "client!ae", name = "cb", descriptor = "I")
	public static int anInt180 = 0;

	@OriginalMember(owner = "client!ae", name = "eb", descriptor = "Lclient!o;")
	public static Class40 aClass40_44 = Static13.method257("Mem:");

	@OriginalMember(owner = "client!ae", name = "fb", descriptor = "[I")
	public static int[] anIntArray36 = new int[50];

	@OriginalMember(owner = "client!ae", name = "gb", descriptor = "Lclient!o;")
	private static Class40 aClass40_45 = Static13.method257("@whi@ )4 ");

	@OriginalMember(owner = "client!ae", name = "hb", descriptor = "Z")
	public static boolean aBoolean13 = false;

	@OriginalMember(owner = "client!ae", name = "ib", descriptor = "Lclient!o;")
	public static Class40 aClass40_46 = Static13.method257("Hide");

	@OriginalMember(owner = "client!ae", name = "jb", descriptor = "Lclient!o;")
	public static Class40 aClass40_47 = Static13.method257("Loading fonts )2 ");

	@OriginalMember(owner = "client!ae", name = "kb", descriptor = "Lclient!qc;")
	public static Class47 aClass47_3 = new Class47(64);

	@OriginalMember(owner = "client!ae", name = "lb", descriptor = "[I")
	public static int[] anIntArray37 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!ae", name = "mb", descriptor = "I")
	public static int anInt182 = 0;

	@OriginalMember(owner = "client!ae", name = "f", descriptor = "(I)V")
	public static void method115() {
		if (Static34.anInt797 < 2 && Static79.anInt1874 == 0 && Static24.anInt641 == 0) {
			return;
		}
		@Pc(47) Class40 local47;
		if (Static79.anInt1874 == 1 && Static34.anInt797 < 2) {
			local47 = Static80.method1334(new Class40[] { Static27.aClass40_193, Static87.aClass40_601, Static44.aClass40_333 });
		} else if (Static24.anInt641 == 1 && Static34.anInt797 < 2) {
			local47 = Static80.method1334(new Class40[] { Static83.aClass40_567, Static7.aClass40_61 });
		} else {
			local47 = Static18.aClass40Array8[Static34.anInt797 - 1];
		}
		if (Static34.anInt797 > 2) {
			local47 = Static80.method1334(new Class40[] { local47, aClass40_45, Static53.method859(Static34.anInt797 - 2), Static62.aClass40_455 });
		}
		Static14.aClass2_Sub2_Sub2_Sub2_1.method580(local47, 4, 16777215, Static107.anInt2511 / 1000);
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(BI)Lclient!ee;")
	public static Class2_Sub2_Sub5 method116(@OriginalArg(1) int arg0) {
		@Pc(15) Class2_Sub2_Sub5 local15 = (Class2_Sub2_Sub5) aClass47_3.method1325((long) arg0);
		if (local15 != null) {
			return local15;
		}
		@Pc(25) byte[] local25 = Static54.aClass5_18.method68(arg0, 13);
		local15 = new Class2_Sub2_Sub5();
		local15.anInt634 = arg0;
		if (local25 != null) {
			local15.method504(new Class2_Sub3(local25));
		}
		aClass47_3.method1332((long) arg0, local15);
		return local15;
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(Lclient!ud;B)V")
	public static void method117(@OriginalArg(0) Class5 arg0) {
		Static43.aClass5_25 = arg0;
	}

	@OriginalMember(owner = "client!ae", name = "g", descriptor = "(I)V")
	public static void method118() {
		anIntArray36 = null;
		aClass40_47 = null;
		aClass40_43 = null;
		aClass44_1 = null;
		aClass47_3 = null;
		aClass5_Sub1_1 = null;
		anIntArray37 = null;
		aClass40_46 = null;
		aClass40_44 = null;
		aClass40_45 = null;
	}

	@OriginalMember(owner = "client!ae", name = "h", descriptor = "(I)I")
	public static int method120() {
		return 5;
	}
}
