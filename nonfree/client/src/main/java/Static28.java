import java.awt.Font;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static28 {

	@OriginalMember(owner = "client!fe", name = "h", descriptor = "Ljava/awt/Font;")
	public static Font aFont1;

	@OriginalMember(owner = "client!fe", name = "j", descriptor = "Lclient!oa;")
	public static Class9 aClass9_11;

	@OriginalMember(owner = "client!fe", name = "v", descriptor = "Lclient!kc;")
	public static Class11 aClass11_7;

	@OriginalMember(owner = "client!fe", name = "w", descriptor = "Lclient!hc;")
	public static Class2_Sub1_Sub3_Sub3 aClass2_Sub1_Sub3_Sub3_3;

	@OriginalMember(owner = "client!fe", name = "A", descriptor = "Lclient!cb;")
	public static Class2_Sub1_Sub3_Sub1 aClass2_Sub1_Sub3_Sub1_6;

	@OriginalMember(owner = "client!fe", name = "b", descriptor = "Lclient!nb;")
	public static Class36 aClass36_3 = new Class36();

	@OriginalMember(owner = "client!fe", name = "d", descriptor = "Lclient!lc;")
	public static Class31 aClass31_385 = Static56.method1206("backhmid1");

	@OriginalMember(owner = "client!fe", name = "k", descriptor = "Lclient!lc;")
	public static Class31 aClass31_386 = Static56.method1206("Moderator option: Mute player for 48 hours: <ON>");

	@OriginalMember(owner = "client!fe", name = "l", descriptor = "[Lclient!lc;")
	public static Class31[] aClass31Array6 = new Class31[100];

	@OriginalMember(owner = "client!fe", name = "m", descriptor = "I")
	public static int anInt1168 = 0;

	@OriginalMember(owner = "client!fe", name = "p", descriptor = "[I")
	public static int[] anIntArray141 = new int[128];

	@OriginalMember(owner = "client!fe", name = "u", descriptor = "Lclient!lc;")
	public static Class31 aClass31_387 = Static56.method1206("Please try again)3");

	@OriginalMember(owner = "client!fe", name = "y", descriptor = "[Lclient!w;")
	public static Class61[] aClass61Array1 = new Class61[12];

	@OriginalMember(owner = "client!fe", name = "C", descriptor = "Lclient!lc;")
	private static Class31 aClass31_389 = Static56.method1206("Login to a members(W server to use this object)3");

	@OriginalMember(owner = "client!fe", name = "B", descriptor = "Lclient!lc;")
	public static Class31 aClass31_388 = aClass31_389;

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(Lclient!ib;I)V")
	public static void method780(@OriginalArg(0) Class2_Sub1_Sub4_Sub6 arg0) {
		if (arg0.anInt2027 == Static49.anInt2694 || arg0.anInt2014 == -1 || arg0.anInt1986 != 0 || arg0.anInt1977 + 1 > Static54.method1158(arg0.anInt2014).anIntArray293[arg0.anInt1987]) {
			@Pc(29) int local29 = Static49.anInt2694 - arg0.anInt2018;
			@Pc(39) int local39 = arg0.anInt1994 * 64 + arg0.anInt1998 * 128;
			@Pc(49) int local49 = arg0.anInt1994 * 64 + arg0.anInt2031 * 128;
			@Pc(56) int local56 = arg0.anInt2027 - arg0.anInt2018;
			arg0.anInt2006 = (local29 * local49 + (local56 - local29) * local39) / local56;
			@Pc(79) int local79 = arg0.anInt1994 * 64 + arg0.anInt1999 * 128;
			@Pc(89) int local89 = arg0.anInt2037 * 128 + arg0.anInt1994 * 64;
			arg0.anInt2011 = (local79 * local29 + local89 * (local56 - local29)) / local56;
		}
		arg0.anInt1989 = 0;
		if (arg0.anInt1992 == 0) {
			arg0.anInt2023 = 1024;
		}
		if (arg0.anInt1992 == 1) {
			arg0.anInt2023 = 1536;
		}
		if (arg0.anInt1992 == 2) {
			arg0.anInt2023 = 0;
		}
		if (arg0.anInt1992 == 3) {
			arg0.anInt2023 = 512;
		}
		arg0.anInt1991 = arg0.anInt2023;
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(B)V")
	public static void method781() {
		aClass31_386 = null;
		aFont1 = null;
		aClass2_Sub1_Sub3_Sub3_3 = null;
		aClass9_11 = null;
		aClass61Array1 = null;
		aClass31_387 = null;
		aClass11_7 = null;
		aClass36_3 = null;
		aClass31Array6 = null;
		aClass31_388 = null;
		aClass2_Sub1_Sub3_Sub1_6 = null;
		aClass31_385 = null;
		aClass31_389 = null;
		anIntArray141 = null;
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(I)V")
	public static void method784() {
		Static16.aClass17_30.method782();
		Static5.aClass17_9.method782();
		Static27.aClass17_44.method782();
		Static50.aClass17_21.method782();
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(IIIIIII)I")
	public static int method787(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(3) int local3 = arg4 & 0x3;
		if ((arg3 & 0x1) == 1) {
			@Pc(12) int local12 = arg2;
			arg2 = arg1;
			arg1 = local12;
		}
		if (local3 == 0) {
			return arg0;
		} else if (local3 == 1) {
			return arg5;
		} else if (local3 == 2) {
			return 7 + 1 - arg0 - arg2;
		} else {
			return 8 - arg1 - arg5;
		}
	}

	@OriginalMember(owner = "client!fe", name = "b", descriptor = "(I)V")
	public static void method788() {
		if (Static84.aString3.toLowerCase().indexOf("microsoft") != -1) {
			Static65.anIntArray300[186] = 57;
			Static65.anIntArray300[187] = 27;
			Static65.anIntArray300[188] = 71;
			Static65.anIntArray300[189] = 26;
			Static65.anIntArray300[190] = 72;
			Static65.anIntArray300[191] = 73;
			Static65.anIntArray300[192] = 58;
			Static65.anIntArray300[219] = 42;
			Static65.anIntArray300[220] = 74;
			Static65.anIntArray300[221] = 43;
			Static65.anIntArray300[222] = 59;
			Static65.anIntArray300[223] = 28;
			return;
		}
		Static65.anIntArray300[44] = 71;
		Static65.anIntArray300[45] = 26;
		Static65.anIntArray300[46] = 72;
		Static65.anIntArray300[47] = 73;
		Static65.anIntArray300[59] = 57;
		Static65.anIntArray300[61] = 27;
		Static65.anIntArray300[91] = 42;
		Static65.anIntArray300[92] = 74;
		Static65.anIntArray300[93] = 43;
		if (Static84.aMethod1 == null) {
			Static65.anIntArray300[192] = 58;
			Static65.anIntArray300[222] = 59;
		} else {
			Static65.anIntArray300[192] = 28;
			Static65.anIntArray300[222] = 58;
			Static65.anIntArray300[520] = 59;
		}
	}
}
