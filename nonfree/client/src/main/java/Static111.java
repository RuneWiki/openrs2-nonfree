import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static111 {

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "I")
	public static int anInt2680;

	@OriginalMember(owner = "client!sf", name = "g", descriptor = "I")
	public static int anInt2685;

	@OriginalMember(owner = "client!sf", name = "b", descriptor = "Lclient!sb;")
	public static Class66 aClass66_12 = new Class66(8);

	@OriginalMember(owner = "client!sf", name = "d", descriptor = "I")
	public static int anInt2682 = 0;

	@OriginalMember(owner = "client!sf", name = "j", descriptor = "I")
	public static volatile int anInt2688 = 0;

	@OriginalMember(owner = "client!sf", name = "m", descriptor = "Lclient!sb;")
	public static Class66 aClass66_13 = new Class66(32);

	@OriginalMember(owner = "client!sf", name = "n", descriptor = "I")
	public static int anInt2691 = 10;

	@OriginalMember(owner = "client!sf", name = "o", descriptor = "I")
	public static int anInt2692 = 0;

	@OriginalMember(owner = "client!sf", name = "p", descriptor = "Lclient!qc;")
	public static Class60 aClass60_1078 = Static121.method2047("Keine Antwort vom Anmelde)2Server)3");

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(Z)V")
	public static void method1896() {
		if (Static102.aClass64_1 != null) {
			@Pc(14) Class64 local14 = Static102.aClass64_1;
			synchronized (Static102.aClass64_1) {
				Static102.aClass64_1 = null;
			}
		}
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(ILclient!q;)Lclient!q;")
	public static Class4_Sub17 method1897(@OriginalArg(1) Class4_Sub17 arg0) {
		@Pc(11) Class4_Sub17 local11 = Static113.method1926(arg0);
		if (local11 == null) {
			local11 = arg0.aClass4_Sub17_11;
		}
		return local11;
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(II)Z")
	public static boolean method1898(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			return false;
		}
		@Pc(16) int local16 = Static36.anIntArray71[arg0];
		if (local16 >= 2000) {
			local16 -= 2000;
		}
		return local16 == 1002;
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(B)V")
	public static void method1899() {
		aClass60_1078 = null;
		aClass66_13 = null;
		aClass66_12 = null;
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(BLclient!wa;)V")
	public static void method1900(@OriginalArg(1) Class4_Sub4_Sub1_Sub2 arg0) {
		if (Static81.anInt1944 == arg0.anInt2618 || arg0.anInt2633 == -1 || arg0.anInt2645 != 0 || arg0.anInt2639 + 1 > Static127.method2102(arg0.anInt2633).anIntArray294[arg0.anInt2595]) {
			@Pc(37) int local37 = arg0.anInt2618 - arg0.anInt2597;
			@Pc(43) int local43 = Static81.anInt1944 - arg0.anInt2597;
			@Pc(53) int local53 = arg0.anInt2612 * 64 + arg0.anInt2604 * 128;
			@Pc(64) int local64 = arg0.anInt2586 * 128 + arg0.anInt2612 * 64;
			@Pc(74) int local74 = arg0.anInt2612 * 64 + arg0.anInt2638 * 128;
			@Pc(84) int local84 = arg0.anInt2589 * 128 + arg0.anInt2612 * 64;
			arg0.anInt2601 = (local74 * local43 + local64 * (local37 - local43)) / local37;
			arg0.anInt2620 = (local84 * local43 + local53 * (local37 - local43)) / local37;
		}
		if (arg0.anInt2621 == 0) {
			arg0.anInt2634 = 1024;
		}
		if (arg0.anInt2621 == 1) {
			arg0.anInt2634 = 1536;
		}
		arg0.anInt2587 = 0;
		if (arg0.anInt2621 == 2) {
			arg0.anInt2634 = 0;
		}
		if (arg0.anInt2621 == 3) {
			arg0.anInt2634 = 512;
		}
		arg0.anInt2591 = arg0.anInt2634;
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(I)V")
	public static void method1901() {
		if (Static53.aString1.toLowerCase().indexOf("microsoft") != -1) {
			Static5.anIntArray6[187] = 27;
			Static5.anIntArray6[220] = 74;
			Static5.anIntArray6[189] = 26;
			Static5.anIntArray6[190] = 72;
			Static5.anIntArray6[188] = 71;
			Static5.anIntArray6[192] = 58;
			Static5.anIntArray6[191] = 73;
			Static5.anIntArray6[222] = 59;
			Static5.anIntArray6[221] = 43;
			Static5.anIntArray6[223] = 28;
			Static5.anIntArray6[219] = 42;
			Static5.anIntArray6[186] = 57;
			return;
		}
		Static5.anIntArray6[92] = 74;
		Static5.anIntArray6[59] = 57;
		Static5.anIntArray6[46] = 72;
		Static5.anIntArray6[91] = 42;
		Static5.anIntArray6[61] = 27;
		if (Static53.aMethod2 == null) {
			Static5.anIntArray6[222] = 59;
			Static5.anIntArray6[192] = 58;
		} else {
			Static5.anIntArray6[192] = 28;
			Static5.anIntArray6[222] = 58;
			Static5.anIntArray6[520] = 59;
		}
		Static5.anIntArray6[45] = 26;
		Static5.anIntArray6[47] = 73;
		Static5.anIntArray6[44] = 71;
		Static5.anIntArray6[93] = 43;
	}
}
