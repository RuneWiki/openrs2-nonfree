import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static170 {

	@OriginalMember(owner = "client!vb", name = "u", descriptor = "Lclient!c;")
	public static Class10 aClass10_138;

	@OriginalMember(owner = "client!vb", name = "w", descriptor = "Lclient!mb;")
	public static Class10_Sub1 aClass10_Sub1_18;

	@OriginalMember(owner = "client!vb", name = "i", descriptor = "Ljava/util/zip/CRC32;")
	public static CRC32 aCRC32_2 = new CRC32();

	@OriginalMember(owner = "client!vb", name = "s", descriptor = "Lclient!dd;")
	public static Class17 aClass17_28 = new Class17(260);

	@OriginalMember(owner = "client!vb", name = "t", descriptor = "Lclient!ai;")
	private static Class6 aClass6_1183 = Static38.method685("Too many incorrect logins from your address)3");

	@OriginalMember(owner = "client!vb", name = "v", descriptor = "Lclient!ai;")
	public static Class6 aClass6_1184 = Static38.method685("Benutzeroberfl-=che geladen)3");

	@OriginalMember(owner = "client!vb", name = "x", descriptor = "Lclient!ai;")
	public static Class6 aClass6_1185 = Static38.method685("runes");

	@OriginalMember(owner = "client!vb", name = "y", descriptor = "Lclient!ai;")
	public static Class6 aClass6_1186 = aClass6_1183;

	@OriginalMember(owner = "client!vb", name = "E", descriptor = "Lclient!ai;")
	private static Class6 aClass6_1192 = Static38.method685("World");

	@OriginalMember(owner = "client!vb", name = "z", descriptor = "Lclient!ai;")
	public static Class6 aClass6_1187 = aClass6_1192;

	@OriginalMember(owner = "client!vb", name = "A", descriptor = "Lclient!ai;")
	private static Class6 aClass6_1188 = Static38.method685("Loading)3)3)3");

	@OriginalMember(owner = "client!vb", name = "B", descriptor = "Lclient!ai;")
	public static Class6 aClass6_1189 = Static38.method685("::errortest");

	@OriginalMember(owner = "client!vb", name = "C", descriptor = "Lclient!ai;")
	public static Class6 aClass6_1190 = aClass6_1188;

	@OriginalMember(owner = "client!vb", name = "D", descriptor = "Lclient!ai;")
	public static Class6 aClass6_1191 = aClass6_1192;

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(ZZ)V")
	public static void method2689(@OriginalArg(0) boolean arg0) {
		@Pc(7) int local7 = Static167.anInt3925;
		if (arg0) {
			local7 = 1;
		}
		if (Static152.anInt3513 == Static131.aClass2_Sub3_Sub5_Sub1_Sub1_1.anInt2674 >> 7 && Static107.anInt2564 == Static131.aClass2_Sub3_Sub5_Sub1_Sub1_1.anInt2672 >> 7) {
			Static152.anInt3513 = 0;
		}
		for (@Pc(35) int local35 = 0; local35 < local7; local35++) {
			@Pc(45) Class2_Sub3_Sub5_Sub1_Sub1 local45;
			@Pc(51) int local51;
			if (arg0) {
				local45 = Static131.aClass2_Sub3_Sub5_Sub1_Sub1_1;
				local51 = 33538048;
			} else {
				local45 = Static2.aClass2_Sub3_Sub5_Sub1_Sub1Array1[Static156.anIntArray358[local35]];
				local51 = Static156.anIntArray358[local35] << 14;
			}
			if (local45 != null && local45.method1806()) {
				@Pc(68) int local68 = local45.anInt2674 >> 7;
				@Pc(73) int local73 = local45.anInt2672 >> 7;
				local45.aBoolean35 = false;
				if ((Static113.aBoolean112 && Static167.anInt3925 > 50 || Static167.anInt3925 > 200) && !arg0 && local45.anInt2668 == local45.anInt2657) {
					local45.aBoolean35 = true;
				}
				if (local68 >= 0 && local68 < 104 && local73 >= 0 && local73 < 104) {
					if (local45.aClass2_Sub3_Sub5_Sub7_1 == null || local45.anInt957 > Static107.anInt2559 || local45.anInt950 <= Static107.anInt2559) {
						if ((local45.anInt2674 & 0x7F) == 64 && (local45.anInt2672 & 0x7F) == 64) {
							if (Static51.anIntArrayArray24[local68][local73] == Static106.anInt4182) {
								continue;
							}
							Static51.anIntArrayArray24[local68][local73] = Static106.anInt4182;
						}
						local45.anInt2697 = Static131.method2041(local45.anInt2674, local45.anInt2672, Static36.anInt1020);
						Static30.aClass44_1.method1267(Static36.anInt1020, local45.anInt2674, local45.anInt2672, local45.anInt2697, 60, local45, local45.anInt2681, local51, local45.aBoolean110);
					} else {
						local45.aBoolean35 = false;
						local45.anInt2697 = Static131.method2041(local45.anInt2674, local45.anInt2672, Static36.anInt1020);
						Static30.aClass44_1.method1289(Static36.anInt1020, local45.anInt2674, local45.anInt2672, local45.anInt2697, local45, local45.anInt2681, local51, local45.anInt952, local45.anInt947, local45.anInt940, local45.anInt945);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(II)V")
	public static void method2691(@OriginalArg(1) int arg0) {
		@Pc(12) Class2_Sub17 local12 = (Class2_Sub17) Static89.aClass16_7.method479((long) arg0);
		if (local12 != null) {
			for (@Pc(17) int local17 = 0; local17 < local12.anIntArray240.length; local17++) {
				local12.anIntArray240[local17] = -1;
				local12.anIntArray239[local17] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(ZLclient!c;)V")
	public static void method2696(@OriginalArg(1) Class10 arg0) {
		Static179.aClass10_143 = arg0;
	}

	@OriginalMember(owner = "client!vb", name = "d", descriptor = "(B)V")
	public static void method2698() {
		aClass6_1185 = null;
		aClass6_1188 = null;
		aClass6_1187 = null;
		aClass6_1192 = null;
		aClass6_1184 = null;
		aClass6_1190 = null;
		aCRC32_2 = null;
		aClass6_1183 = null;
		aClass6_1186 = null;
		aClass6_1191 = null;
		aClass6_1189 = null;
		aClass10_138 = null;
		aClass10_Sub1_18 = null;
		aClass17_28 = null;
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(III)Z")
	public static boolean method2699(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 == 11) {
			arg0 = 10;
		}
		if (arg0 >= 5 && arg0 <= 8) {
			arg0 = 4;
		}
		@Pc(34) Class2_Sub3_Sub6 local34 = Static163.method2609(arg1);
		return local34.method739(arg0);
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(Lclient!bf;IIIII)V")
	public static void method2700(@OriginalArg(0) Class2_Sub3_Sub2_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(15) int local15 = arg4 * arg4 + arg2 * arg2;
		if (local15 <= 4225 || local15 >= 90000) {
			Static160.method426(arg0, arg3, arg2, arg4, arg1);
			return;
		}
		@Pc(39) int local39 = Static46.anInt1324 + Static154.anInt3559 & 0x7FF;
		@Pc(43) int local43 = Class2_Sub3_Sub2_Sub2.anIntArray208[local39];
		@Pc(47) int local47 = Class2_Sub3_Sub2_Sub2.anIntArray207[local39];
		@Pc(55) int local55 = local47 * 256 / (Static36.anInt1028 + 256);
		@Pc(63) int local63 = local43 * 256 / (Static36.anInt1028 + 256);
		@Pc(74) int local74 = arg4 * local55 - local63 * arg2 >> 16;
		@Pc(84) int local84 = local63 * arg4 + arg2 * local55 >> 16;
		@Pc(90) double local90 = Math.atan2((double) local84, (double) local74);
		@Pc(96) int local96 = (int) (Math.sin(local90) * 63.0D);
		@Pc(102) int local102 = (int) (Math.cos(local90) * 57.0D);
		Static130.aClass2_Sub3_Sub2_Sub1_5.method278(local96 + arg3 + 94 + 4 - 10, -local102 + (arg1 - -83) - 20, local90);
	}
}
