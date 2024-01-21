import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static119 {

	@OriginalMember(owner = "client!wc", name = "O", descriptor = "Lclient!eb;")
	public static Class5_Sub2 aClass5_Sub2_4;

	@OriginalMember(owner = "client!wc", name = "T", descriptor = "J")
	public static long aLong115;

	@OriginalMember(owner = "client!wc", name = "U", descriptor = "Lclient!re;")
	public static Class11 aClass11_1;

	@OriginalMember(owner = "client!wc", name = "gb", descriptor = "Lclient!cf;")
	public static Class14 aClass14_4;

	@OriginalMember(owner = "client!wc", name = "Q", descriptor = "Lclient!vc;")
	public static Class71 aClass71_1396 = Static38.method736("Lade Sprites )2 ");

	@OriginalMember(owner = "client!wc", name = "hb", descriptor = "Lclient!vc;")
	private static Class71 aClass71_1399 = Static38.method736("Enter name of player to add to list");

	@OriginalMember(owner = "client!wc", name = "W", descriptor = "Lclient!vc;")
	public static Class71 aClass71_1397 = aClass71_1399;

	@OriginalMember(owner = "client!wc", name = "Z", descriptor = "I")
	public static int anInt2943 = 0;

	@OriginalMember(owner = "client!wc", name = "db", descriptor = "Lclient!vc;")
	public static Class71 aClass71_1398 = Static38.method736("Welt");

	@OriginalMember(owner = "client!wc", name = "qb", descriptor = "Lclient!vc;")
	public static Class71 aClass71_1400 = Static38.method736("Bitte schlie-8en Sie die momentan ge-Offnete Benutzeroberfl-=che)1");

	@OriginalMember(owner = "client!wc", name = "sb", descriptor = "I")
	public static int anInt2956 = 1;

	@OriginalMember(owner = "client!wc", name = "vb", descriptor = "Lclient!vc;")
	public static Class71 aClass71_1401 = Static38.method736("Registrierter Benutzer");

	@OriginalMember(owner = "client!wc", name = "wb", descriptor = "I")
	public static int anInt2958 = 0;

	@OriginalMember(owner = "client!wc", name = "zb", descriptor = "Lclient!vc;")
	public static Class71 aClass71_1402 = Static38.method736("");

	@OriginalMember(owner = "client!wc", name = "Db", descriptor = "I")
	public static int anInt2961 = 0;

	@OriginalMember(owner = "client!wc", name = "d", descriptor = "(B)V")
	public static void method1952() {
		aClass71_1400 = null;
		aClass71_1396 = null;
		aClass71_1397 = null;
		aClass14_4 = null;
		aClass11_1 = null;
		aClass71_1401 = null;
		aClass71_1402 = null;
		aClass71_1398 = null;
		aClass71_1399 = null;
		aClass5_Sub2_4 = null;
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(II[Lclient!me;IIIIIIB)V")
	public static void method1955(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class5_Sub1_Sub11[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		for (@Pc(7) int local7 = 0; local7 < arg2.length; local7++) {
			@Pc(19) Class5_Sub1_Sub11 local19 = arg2[local7];
			if (local19 != null && (local19.anInt1790 == 0 || local19.aBoolean85) && local19 != null && arg5 == local19.anInt1785 && !Static6.method159(local19)) {
				@Pc(49) int local49 = arg8 + local19.anInt1804 - arg3;
				@Pc(58) int local58 = local19.anInt1817 + arg6 - arg0;
				@Pc(63) int local63 = local19.anInt1776 + local49;
				@Pc(74) int local74 = local49 <= arg8 ? arg8 : local49;
				@Pc(81) int local81 = arg6 < local58 ? local58 : arg6;
				@Pc(86) int local86 = local19.anInt1801 + local58;
				@Pc(93) int local93 = local86 < arg7 ? local86 : arg7;
				@Pc(104) int local104 = local63 >= arg1 ? arg1 : local63;
				if (local19.anInt1790 == 0) {
					method1955(local81 + local19.anInt1774 - local58, local104, arg2, local19.anInt1778 + local74 - local49, arg4, local19.anInt1760, local81, local93, local74);
					if (local19.aClass5_Sub1_Sub11Array2 != null) {
						method1955(local19.anInt1774 + local81 - local58, local104, local19.aClass5_Sub1_Sub11Array2, local19.anInt1778 + local74 - local49, arg4, local19.anInt1760, local81, local93, local74);
					}
				}
				if (local19.aBoolean85) {
					@Pc(191) boolean local191;
					if (Static107.anInt2563 >= local74 && Static26.anInt1440 >= local81 && local104 > Static107.anInt2563 && Static26.anInt1440 < local93) {
						local191 = true;
					} else {
						local191 = false;
					}
					@Pc(197) boolean local197 = false;
					@Pc(199) boolean local199 = false;
					if (Static66.anInt1652 == 1 && Static30.anInt800 >= local74 && Static32.anInt847 >= local81 && Static30.anInt800 < local104 && local93 > Static32.anInt847) {
						local199 = true;
					}
					if (Static111.anInt975 == 1 && local191) {
						local197 = true;
					}
					if (local199 && Static81.aClass5_Sub1_Sub11_4 == null && (arg4 & 0x200) != 0 && !Static65.aBoolean71 && Static73.method1218(local19) != null) {
						Static81.aClass5_Sub1_Sub11_4 = local19;
						Static106.aBoolean107 = false;
						Static91.anInt2113 = 0;
						Static46.anInt1116 = Static26.anInt1440;
						Static69.anInt1697 = Static107.anInt2563;
					}
					if (Static81.aClass5_Sub1_Sub11_4 != null || Static65.aBoolean71) {
						local191 = false;
						local197 = false;
						local199 = false;
					}
					if (!local19.aBoolean84 && local199 && (arg4 & 0x1) != 0) {
						local19.aBoolean84 = true;
						if (local19.anObjectArray14 != null) {
							Static53.method972(Static32.anInt847 - local58, null, local19.anObjectArray14, 0, Static30.anInt800 - local49, local19);
						}
					}
					if (local19.aBoolean84 && local197 && (arg4 & 0x4) != 0 && local19.anObjectArray3 != null) {
						Static53.method972(Static26.anInt1440 - local58, null, local19.anObjectArray3, 0, Static107.anInt2563 - local49, local19);
					}
					if (local19.aBoolean84 && !local197 && (arg4 & 0x2) != 0) {
						local19.aBoolean84 = false;
						if (local19.anObjectArray17 != null) {
							Static53.method972(Static26.anInt1440 - local58, null, local19.anObjectArray17, 0, Static107.anInt2563 - local49, local19);
						}
					}
					if (local197 && (arg4 & 0x8) != 0 && local19.anObjectArray21 != null) {
						Static53.method972(Static26.anInt1440 - local58, null, local19.anObjectArray21, 0, Static107.anInt2563 - local49, local19);
					}
					if (!local19.aBoolean80 && local191 && (arg4 & 0x10) != 0) {
						local19.aBoolean80 = true;
						if (local19.anObjectArray15 != null) {
							Static53.method972(Static26.anInt1440 - local58, null, local19.anObjectArray15, 0, Static107.anInt2563 - local49, local19);
						}
					}
					if (local19.aBoolean80 && local191 && (arg4 & 0x40) != 0 && local19.anObjectArray6 != null) {
						Static53.method972(Static26.anInt1440 - local58, null, local19.anObjectArray6, 0, Static107.anInt2563 - local49, local19);
					}
					if (local19.aBoolean80 && !local191 && (arg4 & 0x20) != 0) {
						local19.aBoolean80 = false;
						if (local19.anObjectArray10 != null) {
							Static53.method972(Static26.anInt1440 - local58, null, local19.anObjectArray10, 0, Static107.anInt2563 - local49, local19);
						}
					}
					if (local19.anObjectArray5 != null && (arg4 & 0x80) != 0) {
						Static53.method972(0, null, local19.anObjectArray5, 0, 0, local19);
					}
					if (local191 && Static97.anInt2320 != 0 && local19.anObjectArray18 != null && (arg4 & 0x400) != 0) {
						Static53.method972(Static97.anInt2320, null, local19.anObjectArray18, 0, 0, local19);
					}
					if ((arg4 & 0x100) != 0) {
						if (Static8.anInt282 > local19.anInt1816 && local19.anObjectArray19 != null) {
							Static53.method972(0, null, local19.anObjectArray19, 0, 0, local19);
						}
						if (local19.anInt1816 < Static14.anInt485 && local19.anObjectArray16 != null) {
							Static53.method972(0, null, local19.anObjectArray16, 0, 0, local19);
						}
						if (local19.anInt1816 < Static116.anInt2816 && local19.anObjectArray11 != null) {
							Static53.method972(0, null, local19.anObjectArray11, 0, 0, local19);
						}
						local19.anInt1816 = Static95.anInt2285;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!wc", name = "b", descriptor = "(II)Z")
	public static boolean method1956(@OriginalArg(1) int arg0) {
		return (arg0 >> 31 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!wc", name = "d", descriptor = "(I)I")
	public static int method1962() {
		return Static95.anInt2293++;
	}
}
