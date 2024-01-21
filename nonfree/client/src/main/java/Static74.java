import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static74 {

	@OriginalMember(owner = "client!me", name = "b", descriptor = "I")
	public static volatile int anInt1938 = 0;

	@OriginalMember(owner = "client!me", name = "d", descriptor = "Lclient!wd;")
	private static Class80 aClass80_748 = Static2.method59("Press (Wrecover a locked account(W on front page)3");

	@OriginalMember(owner = "client!me", name = "m", descriptor = "Lclient!wd;")
	public static Class80 aClass80_749 = Static2.method59("Anmelde)2Zeitlimit -Uberschritten)3");

	@OriginalMember(owner = "client!me", name = "n", descriptor = "J")
	public static long aLong59 = 0L;

	@OriginalMember(owner = "client!me", name = "q", descriptor = "[I")
	public static int[] anIntArray257 = new int[4000];

	@OriginalMember(owner = "client!me", name = "s", descriptor = "I")
	public static int anInt1950 = -1;

	@OriginalMember(owner = "client!me", name = "t", descriptor = "Lclient!wd;")
	public static Class80 aClass80_750 = Static2.method59("(U1");

	@OriginalMember(owner = "client!me", name = "u", descriptor = "I")
	public static int anInt1951 = 0;

	@OriginalMember(owner = "client!me", name = "E", descriptor = "Lclient!i;")
	public static Class32 aClass32_37 = new Class32(50);

	@OriginalMember(owner = "client!me", name = "F", descriptor = "Lclient!wd;")
	public static Class80 aClass80_751 = aClass80_748;

	@OriginalMember(owner = "client!me", name = "G", descriptor = "I")
	public static int anInt1961 = 128;

	@OriginalMember(owner = "client!me", name = "H", descriptor = "I")
	public static int anInt1962 = 0;

	@OriginalMember(owner = "client!me", name = "I", descriptor = "Lclient!wd;")
	private static Class80 aClass80_752 = Static2.method59("and choose the (Wcreate account(W");

	@OriginalMember(owner = "client!me", name = "J", descriptor = "I")
	public static int anInt1963 = 1;

	@OriginalMember(owner = "client!me", name = "K", descriptor = "Lclient!wd;")
	public static Class80 aClass80_753 = aClass80_752;

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(IIIIILclient!va;IIB)V")
	public static void method1167(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class2_Sub1_Sub17 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (Static59.aBoolean122) {
			Static39.anInt721 = 32;
		} else {
			Static39.anInt721 = 0;
		}
		Static59.aBoolean122 = false;
		@Pc(198) int local198;
		if (arg6 <= arg2 && arg2 < arg6 + 16 && arg4 >= arg0 && arg0 + 16 > arg4) {
			if (arg1 == 1) {
				Static70.aBoolean131 = true;
			}
			if (arg1 == 2 || arg1 == 3) {
				Static37.aBoolean77 = true;
			}
			arg5.anInt3015 -= Static85.anInt2061 * 4;
		} else if (arg6 <= arg2 && arg2 < arg6 + 16 && arg0 + arg3 - 16 <= arg4 && arg3 + arg0 > arg4) {
			arg5.anInt3015 += Static85.anInt2061 * 4;
			if (arg1 == 2 || arg1 == 3) {
				Static37.aBoolean77 = true;
			}
			if (arg1 == 1) {
				Static70.aBoolean131 = true;
			}
		} else if (arg6 - Static39.anInt721 <= arg2 && Static39.anInt721 + arg6 + 16 > arg2 && arg0 + 16 <= arg4 && arg3 + arg0 - 16 > arg4 && Static85.anInt2061 > 0) {
			if (arg1 == 1) {
				Static70.aBoolean131 = true;
			}
			Static59.aBoolean122 = true;
			if (arg1 == 2 || arg1 == 3) {
				Static37.aBoolean77 = true;
			}
			local198 = (arg3 - 32) * arg3 / arg7;
			if (local198 < 8) {
				local198 = 8;
			}
			@Pc(214) int local214 = arg4 - local198 / 2 - arg0 - 16;
			@Pc(220) int local220 = arg3 - local198 - 32;
			arg5.anInt3015 = (arg7 - arg3) * local214 / local220;
		}
		if (Static7.anInt185 == 0) {
			return;
		}
		local198 = arg5.anInt3020;
		if (arg1 == -1) {
			local198 = 479;
		}
		if (arg6 - local198 > arg2 || arg0 > arg4 || arg6 + 16 <= arg2 || arg3 + arg0 < arg4) {
			return;
		}
		if (arg1 == 1) {
			Static70.aBoolean131 = true;
		}
		arg5.anInt3015 += Static7.anInt185 * 45;
		if (arg1 == 2 || arg1 == 3) {
			Static37.aBoolean77 = true;
		}
		return;
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(I)V")
	public static void method1168() {
		aClass80_749 = null;
		aClass32_37 = null;
		aClass80_751 = null;
		aClass80_753 = null;
		anIntArray257 = null;
		aClass80_748 = null;
		aClass80_752 = null;
		aClass80_750 = null;
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(Lclient!va;B)[I")
	public static int[] method1178(@OriginalArg(0) Class2_Sub1_Sub17 arg0) {
		@Pc(18) int local18 = arg0.anInt3022 >> 16;
		if (!Static122.method1969(local18)) {
			return null;
		}
		@Pc(27) int local27 = arg0.anInt3012;
		@Pc(30) int local30 = arg0.anInt3037;
		@Pc(43) Class2_Sub1_Sub17 local43;
		for (@Pc(33) int local33 = arg0.anInt3008; local33 != -1; local33 = local43.anInt3008) {
			local43 = Static51.aClass2_Sub1_Sub17ArrayArray1[local18][local33 & 0xFFFF];
			local30 += local43.anInt3037 - local43.anInt3015;
			local27 += local43.anInt3012 - local43.anInt3055;
		}
		return new int[] { local27, local30 };
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(Lclient!ff;I)V")
	public static void method1180(@OriginalArg(0) Class11 arg0) {
		Static90.aClass11_35 = arg0;
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(Lclient!ff;BLclient!ff;Lclient!ff;)V")
	public static void method1183(@OriginalArg(0) Class11 arg0, @OriginalArg(2) Class11 arg1, @OriginalArg(3) Class11 arg2) {
		Static113.aClass11_41 = arg2;
		Static43.aClass11_23 = arg0;
		Static100.aClass11_40 = arg1;
		Static51.aClass2_Sub1_Sub17ArrayArray1 = new Class2_Sub1_Sub17[Static43.aClass11_23.method382()][];
		Static25.aBooleanArray10 = new boolean[Static43.aClass11_23.method382()];
	}
}
