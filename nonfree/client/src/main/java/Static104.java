import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static104 {

	@OriginalMember(owner = "client!v", name = "r", descriptor = "I")
	public static int anInt2827;

	@OriginalMember(owner = "client!v", name = "s", descriptor = "Lclient!mc;")
	public static Class33_Sub1 aClass33_Sub1_48;

	@OriginalMember(owner = "client!v", name = "a", descriptor = "J")
	public static long aLong81 = 0L;

	@OriginalMember(owner = "client!v", name = "c", descriptor = "Lclient!wb;")
	private static Class65 aClass65_1277 = Static24.method441("Could not complete login)3");

	@OriginalMember(owner = "client!v", name = "b", descriptor = "Lclient!wb;")
	public static Class65 aClass65_1276 = aClass65_1277;

	@OriginalMember(owner = "client!v", name = "f", descriptor = "Lclient!wb;")
	private static Class65 aClass65_1278 = Static24.method441("Malformed login packet)3");

	@OriginalMember(owner = "client!v", name = "g", descriptor = "I")
	public static int anInt2823 = 0;

	@OriginalMember(owner = "client!v", name = "h", descriptor = "Lclient!ge;")
	public static Class21 aClass21_35 = new Class21(64);

	@OriginalMember(owner = "client!v", name = "k", descriptor = "Lclient!wb;")
	public static Class65 aClass65_1279 = Static24.method441("Der Anmelde)2Server ist offline)3");

	@OriginalMember(owner = "client!v", name = "m", descriptor = "Lclient!wb;")
	public static Class65 aClass65_1280 = aClass65_1278;

	@OriginalMember(owner = "client!v", name = "n", descriptor = "[I")
	public static int[] anIntArray409 = new int[50];

	@OriginalMember(owner = "client!v", name = "o", descriptor = "Lclient!ge;")
	public static Class21 aClass21_36 = new Class21(64);

	@OriginalMember(owner = "client!v", name = "p", descriptor = "Lclient!wb;")
	public static Class65 aClass65_1281 = Static24.method441(" hat sich eingeloggt)3");

	@OriginalMember(owner = "client!v", name = "q", descriptor = "Lclient!wb;")
	public static Class65 aClass65_1282 = Static24.method441(" )2>");

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(I)V")
	public static void method1736() {
		aClass65_1278 = null;
		aClass21_36 = null;
		aClass65_1280 = null;
		aClass65_1279 = null;
		aClass65_1277 = null;
		aClass65_1276 = null;
		anIntArray409 = null;
		aClass33_Sub1_48 = null;
		aClass21_35 = null;
		aClass65_1281 = null;
		aClass65_1282 = null;
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "([BIIIIIIII[Lclient!uc;)V")
	public static void method1737(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class58[] arg8) {
		for (@Pc(3) int local3 = 0; local3 < 8; local3++) {
			for (@Pc(7) int local7 = 0; local7 < 8; local7++) {
				if (arg3 + local3 > 0 && local3 + arg3 < 103 && arg4 + local7 > 0 && arg4 + local7 < 103) {
					arg8[arg1].anIntArrayArray25[arg3 + local3][arg4 + local7] &= 0xFEFFFFFF;
				}
			}
		}
		@Pc(84) Class2_Sub8 local84 = new Class2_Sub8(arg0);
		for (@Pc(86) int local86 = 0; local86 < 4; local86++) {
			for (@Pc(90) int local90 = 0; local90 < 64; local90++) {
				for (@Pc(94) int local94 = 0; local94 < 64; local94++) {
					if (arg6 == local86 && local90 >= arg5 && local90 < arg5 + 8 && local94 >= arg7 && arg7 + 8 > local94) {
						Static35.method737(arg4 + Static34.method699(arg2, local94 & 0x7, local90 & 0x7), 0, arg1, 0, local84, arg2, arg3 + Static47.method823(local90 & 0x7, local94 & 0x7, arg2));
					} else {
						Static35.method737(-1, 0, 0, 0, local84, 0, -1);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(II)[B")
	public static synchronized byte[] method1738(@OriginalArg(0) int arg0) {
		@Pc(28) byte[] local28;
		if (arg0 == 100 && Static36.anInt1210 > 0) {
			local28 = Static36.aByteArrayArray3[--Static36.anInt1210];
			Static36.aByteArrayArray3[Static36.anInt1210] = null;
			return local28;
		} else if (arg0 == 5000 && Static2.anInt120 > 0) {
			local28 = Static57.aByteArrayArray5[--Static2.anInt120];
			Static57.aByteArrayArray5[Static2.anInt120] = null;
			return local28;
		} else if (arg0 == 30000 && Static23.anInt678 > 0) {
			local28 = Static77.aByteArrayArray8[--Static23.anInt678];
			Static77.aByteArrayArray8[Static23.anInt678] = null;
			return local28;
		} else {
			return new byte[arg0];
		}
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(Lclient!wb;B)V")
	public static void method1739(@OriginalArg(0) Class65 arg0) {
		if (arg0 == null || arg0.method1760() == 0) {
			Static82.anInt2368 = 0;
			return;
		}
		@Pc(23) Class65 local23 = arg0;
		@Pc(26) Class65[] local26 = new Class65[100];
		@Pc(28) int local28 = 0;
		while (true) {
			@Pc(33) int local33 = local23.method1767();
			if (local33 == -1) {
				local23 = local23.method1769();
				if (local23.method1760() > 0) {
					local26[local28++] = local23.method1776();
				}
				Static82.anInt2368 = 0;
				label46: for (local33 = 0; local33 < Static51.anInt1480; local33++) {
					@Pc(98) Class2_Sub1_Sub8 local98 = Static70.method1263(local33);
					if (local98.anInt1809 == -1 && local98.aClass65_820 != null) {
						@Pc(111) Class65 local111 = local98.aClass65_820.method1776();
						for (@Pc(113) int local113 = 0; local113 < local28; local113++) {
							if (local111.method1775(local26[local113]) == -1) {
								continue label46;
							}
						}
						Static79.aClass65Array11[Static82.anInt2368] = local111;
						Static2.anIntArray15[Static82.anInt2368] = local33;
						Static82.anInt2368++;
						if (Static82.anInt2368 >= Static79.aClass65Array11.length) {
							return;
						}
					}
				}
				return;
			}
			@Pc(65) Class65 local65 = local23.method1772(local33, 0).method1769();
			if (local65.method1760() > 0) {
				local26[local28++] = local65.method1776();
			}
			local23 = local23.method1779(local33 + 1);
		}
	}
}
