import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static18 {

	@OriginalMember(owner = "client!client", name = "gb", descriptor = "Lclient!nf;")
	public static Class4_Sub1_Sub2_Sub4_Sub1 aClass4_Sub1_Sub2_Sub4_Sub1_1;

	@OriginalMember(owner = "client!client", name = "R", descriptor = "I")
	public static int anInt500 = 0;

	@OriginalMember(owner = "client!client", name = "T", descriptor = "Lclient!ec;")
	public static Class22 aClass22_147 = Static60.method1113("Startseite auf (WSpielkonto wiederherstellen(W)3");

	@OriginalMember(owner = "client!client", name = "W", descriptor = "Lclient!ja;")
	public static Class33 aClass33_9 = new Class33(64);

	@OriginalMember(owner = "client!client", name = "cb", descriptor = "I")
	public static int anInt509 = 0;

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Z)V")
	public static void method353() {
		aClass33_9 = null;
		aClass22_147 = null;
		aClass4_Sub1_Sub2_Sub4_Sub1_1 = null;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIBIIII)V")
	public static void method355(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg2 < 1 || arg6 < 1 || arg2 > 102 || arg6 > 102) {
			return;
		}
		if (Static130.aBoolean279 && Static37.anInt895 != arg5) {
			return;
		}
		@Pc(27) int local27 = 0;
		if (arg1 == 0) {
			local27 = Static134.aClass77_1.method1957(arg5, arg2, arg6);
		}
		if (arg1 == 1) {
			local27 = Static134.aClass77_1.method1935(arg5, arg2, arg6);
		}
		if (arg1 == 2) {
			local27 = Static134.aClass77_1.method1937(arg5, arg2, arg6);
		}
		if (arg1 == 3) {
			local27 = Static134.aClass77_1.method1938(arg5, arg2, arg6);
		}
		@Pc(90) int local90;
		if (local27 != 0) {
			@Pc(83) int local83 = local27 >> 14 & 0x7FFF;
			local90 = Static134.aClass77_1.method1925(arg5, arg2, arg6, local27);
			@Pc(96) int local96 = local90 >> 6 & 0x3;
			@Pc(100) int local100 = local90 & 0x1F;
			@Pc(114) Class4_Sub1_Sub5 local114;
			if (arg1 == 0) {
				Static134.aClass77_1.method1952(arg5, arg2, arg6);
				local114 = Static5.method45(local83);
				if (local114.anInt1268 != 0) {
					Static87.aClass60Array1[arg5].method1656(arg2, local96, local100, arg6, local114.aBoolean119);
				}
			}
			if (arg1 == 1) {
				Static134.aClass77_1.method1928(arg5, arg2, arg6);
			}
			if (arg1 == 2) {
				Static134.aClass77_1.method1932(arg5, arg2, arg6);
				local114 = Static5.method45(local83);
				if (local114.anInt1256 + arg2 > 103 || arg6 + local114.anInt1256 > 103 || local114.anInt1267 + arg2 > 103 || arg6 + local114.anInt1267 > 103) {
					return;
				}
				if (local114.anInt1268 != 0) {
					Static87.aClass60Array1[arg5].method1660(arg2, local114.anInt1256, arg6, local114.aBoolean119, local96, local114.anInt1267);
				}
			}
			if (arg1 == 3) {
				Static134.aClass77_1.method1940(arg5, arg2, arg6);
				local114 = Static5.method45(local83);
				if (local114.anInt1268 == 1) {
					Static87.aClass60Array1[arg5].method1651(arg6, arg2);
				}
			}
		}
		if (arg3 < 0) {
			return;
		}
		local90 = arg5;
		if (arg5 < 3 && (Static3.aByteArrayArrayArray1[1][arg2][arg6] & 0x2) == 2) {
			local90 = arg5 + 1;
		}
		Static55.method724(arg3, arg0, Static134.aClass77_1, arg6, local90, arg2, Static87.aClass60Array1[arg5], arg5, arg4);
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!f;)Z")
	public static boolean method357(@OriginalArg(1) Class4_Sub7 arg0) {
		@Pc(6) int local6 = arg0.anInt793;
		if (local6 == 205) {
			Static4.anInt77 = 250;
			return true;
		}
		@Pc(29) int local29;
		@Pc(23) int local23;
		if (local6 >= 300 && local6 <= 313) {
			local23 = local6 & 0x1;
			local29 = (local6 - 300) / 2;
			Static50.aClass21_1.method438(local29, local23 == 1);
		}
		if (local6 >= 314 && local6 <= 323) {
			local23 = local6 & 0x1;
			local29 = (local6 - 314) / 2;
			Static50.aClass21_1.method440(local23 == 1, local29);
		}
		if (local6 == 324) {
			Static50.aClass21_1.method433(false);
		}
		if (local6 == 325) {
			Static50.aClass21_1.method433(true);
		}
		if (local6 == 326) {
			Static38.aClass4_Sub11_Sub1_1.method752(78);
			Static50.aClass21_1.method431(Static38.aClass4_Sub11_Sub1_1);
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(II)V")
	public static void method359(@OriginalArg(1) int arg0) {
		if (!Static24.method396(arg0)) {
			return;
		}
		@Pc(14) Class4_Sub7[] local14 = Static65.aClass4_Sub7ArrayArray1[arg0];
		for (@Pc(16) int local16 = 0; local16 < local14.length; local16++) {
			@Pc(22) Class4_Sub7 local22 = local14[local16];
			if (local22 != null) {
				local22.anInt747 = 0;
				local22.anInt788 = 0;
			}
		}
	}
}
