import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static2 {

	@OriginalMember(owner = "client!ab", name = "lb", descriptor = "I")
	public static int anInt89;

	@OriginalMember(owner = "client!ab", name = "Cb", descriptor = "I")
	public static int anInt101;

	@OriginalMember(owner = "client!ab", name = "tb", descriptor = "Lclient!je;")
	public static Class40 aClass40_70 = Static69.method1231("<col=ffffff> )4 ");

	@OriginalMember(owner = "client!ab", name = "zb", descriptor = "Ljava/util/Calendar;")
	public static Calendar aCalendar1 = Calendar.getInstance();

	@OriginalMember(owner = "client!ab", name = "Ab", descriptor = "Lclient!je;")
	public static Class40 aClass40_71 = Static69.method1231("<img=0>");

	@OriginalMember(owner = "client!ab", name = "Bb", descriptor = "Lclient!je;")
	public static Class40 aClass40_72 = null;

	@OriginalMember(owner = "client!ab", name = "Db", descriptor = "Lclient!je;")
	public static Class40 aClass40_73 = Static69.method1231("headicons_pk");

	@OriginalMember(owner = "client!ab", name = "Eb", descriptor = "I")
	public static int anInt102 = 0;

	@OriginalMember(owner = "client!ab", name = "f", descriptor = "(B)V")
	public static void method69() {
		@Pc(19) int local19;
		for (@Pc(11) int local11 = -1; local11 < Static130.anInt3007; local11++) {
			if (local11 == -1) {
				local19 = 2047;
			} else {
				local19 = Static126.anIntArray347[local11];
			}
			@Pc(29) Class2_Sub1_Sub1_Sub3_Sub2 local29 = Static69.aClass2_Sub1_Sub1_Sub3_Sub2Array2[local19];
			if (local29 != null && local29.anInt1780 > 0) {
				local29.anInt1780--;
				if (local29.anInt1780 == 0) {
					local29.aClass40_884 = null;
				}
			}
		}
		for (local19 = 0; local19 < Static102.anInt2484; local19++) {
			@Pc(61) int local61 = Static37.anIntArray97[local19];
			@Pc(65) Class2_Sub1_Sub1_Sub3_Sub1 local65 = Static127.aClass2_Sub1_Sub1_Sub3_Sub1Array1[local61];
			if (local65 != null && local65.anInt1780 > 0) {
				local65.anInt1780--;
				if (local65.anInt1780 == 0) {
					local65.aClass40_884 = null;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(ZZ)V")
	public static void method70(@OriginalArg(0) boolean arg0) {
		if (Static30.aClass2_Sub1_Sub1_Sub3_Sub2_1.anInt1788 >> 7 == Static66.anInt1743 && Static30.aClass2_Sub1_Sub1_Sub3_Sub2_1.anInt1792 >> 7 == Static58.anInt1517) {
			Static66.anInt1743 = 0;
		}
		@Pc(29) int local29 = Static130.anInt3007;
		if (arg0) {
			local29 = 1;
		}
		for (@Pc(40) int local40 = 0; local40 < local29; local40++) {
			@Pc(46) Class2_Sub1_Sub1_Sub3_Sub2 local46;
			@Pc(48) int local48;
			if (arg0) {
				local46 = Static30.aClass2_Sub1_Sub1_Sub3_Sub2_1;
				local48 = 33538048;
			} else {
				local46 = Static69.aClass2_Sub1_Sub1_Sub3_Sub2Array2[Static126.anIntArray347[local40]];
				local48 = Static126.anIntArray347[local40] << 14;
			}
			if (local46 != null && local46.method1174()) {
				local46.aBoolean135 = false;
				if ((Static34.aBoolean60 && Static130.anInt3007 > 50 || Static130.anInt3007 > 200) && !arg0 && local46.anInt1786 == local46.anInt1790) {
					local46.aBoolean135 = true;
				}
				@Pc(94) int local94 = local46.anInt1792 >> 7;
				@Pc(99) int local99 = local46.anInt1788 >> 7;
				if (local99 >= 0 && local99 < 104 && local94 >= 0 && local94 < 104) {
					if (local46.aClass2_Sub1_Sub1_Sub2_3 == null || local46.anInt1830 > Static28.anInt704 || Static28.anInt704 >= local46.anInt1837) {
						if ((local46.anInt1788 & 0x7F) == 64 && (local46.anInt1792 & 0x7F) == 64) {
							if (Static108.anIntArrayArray24[local99][local94] == Static96.anInt2435) {
								continue;
							}
							Static108.anIntArrayArray24[local99][local94] = Static96.anInt2435;
						}
						local46.anInt1839 = Static93.method1730(local46.anInt1788, Static105.anInt2531, local46.anInt1792);
						Static111.aClass30_1.method768(Static105.anInt2531, local46.anInt1788, local46.anInt1792, local46.anInt1839, 60, local46, local46.anInt1818, local48, local46.aBoolean134);
					} else {
						local46.aBoolean135 = false;
						local46.anInt1839 = Static93.method1730(local46.anInt1788, Static105.anInt2531, local46.anInt1792);
						Static111.aClass30_1.method777(Static105.anInt2531, local46.anInt1788, local46.anInt1792, local46.anInt1839, local46, local46.anInt1818, local48, local46.anInt1843, local46.anInt1833, local46.anInt1845, local46.anInt1844);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ab", name = "f", descriptor = "(I)V")
	public static void method71() {
		aClass40_70 = null;
		aClass40_72 = null;
		aClass40_71 = null;
		aCalendar1 = null;
		aClass40_73 = null;
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(IBIII)V")
	public static void method72(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static74.anInt920 == 1) {
			Static109.aClass2_Sub1_Sub2_Sub4Array13[Static124.anInt2881 / 100].method1722(Static12.anInt3049 - 8, Static65.anInt1730 - 8);
		}
		if (Static74.anInt920 == 2) {
			Static109.aClass2_Sub1_Sub2_Sub4Array13[Static124.anInt2881 / 100 + 4].method1722(Static12.anInt3049 - 8, Static65.anInt1730 + -8);
		}
		Static122.method2062();
		if (!Static38.aBoolean68) {
			return;
		}
		@Pc(50) int local50 = arg3 + 512 - 5;
		@Pc(54) int local54 = arg1 + 20;
		Static33.aClass2_Sub1_Sub2_Sub3_Sub1_5.method1531(Static40.method722(new Class40[] { Static56.aClass40_731, Static49.method886(Static63.anInt399) }), local50, local54, 16776960, -1);
		@Pc(77) int local77 = local54 + 15;
		@Pc(79) Runtime local79 = Runtime.getRuntime();
		@Pc(81) int local81 = 16776960;
		@Pc(91) int local91 = (int) ((local79.totalMemory() - local79.freeMemory()) / 1024L);
		if (local91 > 32768 && Static34.aBoolean60) {
			local81 = 16711680;
		}
		if (local91 > 65536 && !Static34.aBoolean60) {
			local81 = 16711680;
		}
		Static33.aClass2_Sub1_Sub2_Sub3_Sub1_5.method1531(Static40.method722(new Class40[] { Static107.aClass40_1367, Static49.method886(local91), Static48.aClass40_633 }), local50, local77, local81, -1);
		local54 = local77 + 15;
	}
}
