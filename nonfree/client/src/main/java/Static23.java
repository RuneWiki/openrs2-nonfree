import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static23 {

	@OriginalMember(owner = "client!db", name = "g", descriptor = "Lclient!ff;")
	public static Class11 aClass11_15;

	@OriginalMember(owner = "client!db", name = "n", descriptor = "[[I")
	public static int[][] anIntArrayArray11;

	@OriginalMember(owner = "client!db", name = "J", descriptor = "I")
	public static int anInt886;

	@OriginalMember(owner = "client!db", name = "V", descriptor = "[Lclient!hb;")
	public static Class2_Sub1_Sub9_Sub1[] aClass2_Sub1_Sub9_Sub1Array4;

	@OriginalMember(owner = "client!db", name = "c", descriptor = "I")
	public static int anInt860 = -1;

	@OriginalMember(owner = "client!db", name = "d", descriptor = "Lclient!wd;")
	public static Class80 aClass80_282 = Static2.method59("::qa_op_test");

	@OriginalMember(owner = "client!db", name = "O", descriptor = "Lclient!wd;")
	private static Class80 aClass80_285 = Static2.method59("Enter name of player to delete from list");

	@OriginalMember(owner = "client!db", name = "j", descriptor = "Lclient!wd;")
	public static Class80 aClass80_283 = aClass80_285;

	@OriginalMember(owner = "client!db", name = "m", descriptor = "Lclient!wd;")
	public static Class80 aClass80_284 = Static2.method59(")4lang)4de");

	@OriginalMember(owner = "client!db", name = "o", descriptor = "[I")
	public static int[] anIntArray101 = new int[50];

	@OriginalMember(owner = "client!db", name = "q", descriptor = "I")
	public static int anInt868 = 0;

	@OriginalMember(owner = "client!db", name = "x", descriptor = "I")
	public static int anInt875 = 3;

	@OriginalMember(owner = "client!db", name = "R", descriptor = "I")
	public static int anInt893 = 1;

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(I)V")
	public static void method459() {
		Static101.aBoolean198 = false;
		Static18.aBoolean51 = false;
	}

	@OriginalMember(owner = "client!db", name = "b", descriptor = "(I)V")
	public static void method460() {
		aClass11_15 = null;
		aClass80_283 = null;
		anIntArrayArray11 = null;
		anIntArray101 = null;
		aClass80_284 = null;
		aClass2_Sub1_Sub9_Sub1Array4 = null;
		aClass80_282 = null;
		aClass80_285 = null;
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(IB)Lclient!rb;")
	public static Class2_Sub1_Sub13 method462(@OriginalArg(0) int arg0) {
		@Pc(10) Class2_Sub1_Sub13 local10 = (Class2_Sub1_Sub13) Static111.aClass32_54.method887((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static113.aClass11_42.method383(arg0, 9);
		local10 = new Class2_Sub1_Sub13();
		local10.anInt2570 = arg0;
		if (local20 != null) {
			local10.method1581(new Class2_Sub17(local20));
		}
		local10.method1577();
		Static111.aClass32_54.method880(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(ZLclient!wd;Lclient!wd;Z)V")
	public static void method467(@OriginalArg(1) Class80 arg0, @OriginalArg(2) Class80 arg1, @OriginalArg(3) boolean arg2) {
		if (Static82.aBoolean236) {
			Static38.method657();
			Static82.aBoolean236 = false;
			Static124.method1980();
			Static71.method1137();
			Static92.method1397();
			Static113.method1857();
			Static36.method631(Static111.anInt2993, Static112.anInt2924, Static6.anInt172, Static21.aClass2_Sub1_Sub9_Sub4_12);
			Static79.method1232(-1, anInt875, Static97.anInt2559 == -1, Static39.anIntArray89);
			Static77.aBoolean145 = true;
			Static112.aBoolean216 = true;
			Static17.aBoolean44 = true;
		}
		Static20.method487();
		@Pc(45) short local45 = 151;
		@Pc(54) int local54 = local45 - 3;
		Static21.aClass2_Sub1_Sub9_Sub4_12.method1924(arg0, 257, 148, 0);
		Static21.aClass2_Sub1_Sub9_Sub4_12.method1924(arg0, 256, 147, 16777215);
		if (arg1 != null) {
			local54 += 15;
			if (arg2) {
				@Pc(79) int local79 = Static21.aClass2_Sub1_Sub9_Sub4_12.method1910(arg1) + 4;
				Static99.method1894(257 - local79 / 2, 152, local79, 11, 0);
			}
			Static21.aClass2_Sub1_Sub9_Sub4_12.method1924(arg1, 257, 163, 0);
			Static21.aClass2_Sub1_Sub9_Sub4_12.method1924(arg1, 256, 162, 16777215);
		}
		Static11.method178();
	}

	@OriginalMember(owner = "client!db", name = "e", descriptor = "(I)V")
	public static void method472() {
		for (@Pc(11) Class2_Sub6 local11 = (Class2_Sub6) Static107.aClass58_14.method1285(); local11 != null; local11 = (Class2_Sub6) Static107.aClass58_14.method1281()) {
			if (local11.aClass2_Sub2_Sub4_1 != null) {
				Static123.aClass2_Sub2_Sub2_2.method1229(local11.aClass2_Sub2_Sub4_1);
				local11.aClass2_Sub2_Sub4_1 = null;
			}
			if (local11.aClass2_Sub2_Sub4_2 != null) {
				Static123.aClass2_Sub2_Sub2_2.method1229(local11.aClass2_Sub2_Sub4_2);
				local11.aClass2_Sub2_Sub4_2 = null;
			}
		}
		Static107.aClass58_14.method1292();
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(IBI[Lclient!wd;)Lclient!wd;")
	public static Class80 method478(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class80[] arg2) {
		@Pc(7) int local7 = 0;
		for (@Pc(14) int local14 = 0; local14 < arg1; local14++) {
			if (arg2[arg0 + local14] == null) {
				arg2[local14 + arg0] = Static92.aClass80_888;
			}
			local7 += arg2[local14 + arg0].anInt3200;
		}
		@Pc(49) byte[] local49 = new byte[local7];
		@Pc(51) int local51 = 0;
		@Pc(61) Class80 local61;
		for (@Pc(53) int local53 = 0; local53 < arg1; local53++) {
			local61 = arg2[local53 + arg0];
			Static131.method1114(local61.aByteArray40, 0, local49, local51, local61.anInt3200);
			local51 += local61.anInt3200;
		}
		local61 = new Class80();
		local61.aByteArray40 = local49;
		local61.anInt3200 = local7;
		return local61;
	}
}
