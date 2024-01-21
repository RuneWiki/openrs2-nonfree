import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static42 {

	@OriginalMember(owner = "client!id", name = "f", descriptor = "Lclient!kb;")
	public static Class9 aClass9_23;

	@OriginalMember(owner = "client!id", name = "a", descriptor = "I")
	public static int anInt1214 = 0;

	@OriginalMember(owner = "client!id", name = "b", descriptor = "Lclient!v;")
	private static Class62 aClass62_533 = Static45.method753("This world is full)3");

	@OriginalMember(owner = "client!id", name = "c", descriptor = "I")
	public static int anInt1215 = 0;

	@OriginalMember(owner = "client!id", name = "h", descriptor = "Lclient!v;")
	private static Class62 aClass62_535 = Static45.method753("Login server offline)3");

	@OriginalMember(owner = "client!id", name = "d", descriptor = "Lclient!v;")
	public static Class62 aClass62_534 = aClass62_535;

	@OriginalMember(owner = "client!id", name = "o", descriptor = "Lclient!v;")
	private static Class62 aClass62_537 = Static45.method753("green:");

	@OriginalMember(owner = "client!id", name = "j", descriptor = "Lclient!v;")
	public static Class62 aClass62_536 = aClass62_537;

	@OriginalMember(owner = "client!id", name = "k", descriptor = "I")
	public static int anInt1218 = 0;

	@OriginalMember(owner = "client!id", name = "n", descriptor = "I")
	public static int anInt1220 = 0;

	@OriginalMember(owner = "client!id", name = "p", descriptor = "Lclient!v;")
	public static Class62 aClass62_538 = aClass62_533;

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(I)V")
	public static void method712() {
		aClass62_534 = null;
		aClass62_536 = null;
		aClass9_23 = null;
		aClass62_538 = null;
		aClass62_537 = null;
		aClass62_533 = null;
		aClass62_535 = null;
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(B)V")
	public static void method713() {
		for (@Pc(15) Class3_Sub1_Sub3_Sub4 local15 = (Class3_Sub1_Sub3_Sub4) Static20.aClass24_22.method534(); local15 != null; local15 = (Class3_Sub1_Sub3_Sub4) Static20.aClass24_22.method525()) {
			if (Static27.anInt818 != local15.anInt2158 || local15.aBoolean127) {
				local15.method1852();
			} else if (Static12.anInt451 >= local15.anInt2162) {
				local15.method1305(Static54.anInt2739);
				if (local15.aBoolean127) {
					local15.method1852();
				} else {
					Static76.aClass1_1.method39(local15.anInt2158, local15.anInt2149, local15.anInt2159, local15.anInt2146, 60, local15, 0, -1, false);
				}
			}
		}
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(II)V")
	public static void method714(@OriginalArg(0) int arg0) {
		if (arg0 == -1 || !Static92.aBooleanArray11[arg0]) {
			return;
		}
		Static64.aClass42_48.method1502(arg0);
		if (Static65.aClass3_Sub1_Sub6ArrayArray1[arg0] == null) {
			return;
		}
		@Pc(29) boolean local29 = true;
		for (@Pc(31) int local31 = 0; local31 < Static65.aClass3_Sub1_Sub6ArrayArray1[arg0].length; local31++) {
			if (Static65.aClass3_Sub1_Sub6ArrayArray1[arg0][local31] != null) {
				if (Static65.aClass3_Sub1_Sub6ArrayArray1[arg0][local31].anInt924 == 2) {
					local29 = false;
				} else {
					Static65.aClass3_Sub1_Sub6ArrayArray1[arg0][local31] = null;
				}
			}
		}
		if (local29) {
			Static65.aClass3_Sub1_Sub6ArrayArray1[arg0] = null;
		}
		Static92.aBooleanArray11[arg0] = false;
	}

	@OriginalMember(owner = "client!id", name = "b", descriptor = "(I)V")
	public static void method715() {
		Static59.anIntArray168 = null;
		Static93.anIntArray273 = null;
		Static40.anIntArrayArray7 = null;
		Static100.aByteArrayArrayArray15 = null;
		Static16.aByteArrayArrayArray3 = null;
		Static10.aByteArrayArrayArray11 = null;
		Static27.aByteArrayArrayArray5 = null;
		Static20.anIntArray55 = null;
		Static109.anIntArray319 = null;
		Static72.anIntArrayArrayArray3 = null;
		Static20.aByteArrayArrayArray4 = null;
		Static83.anIntArray45 = null;
	}
}
