import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static5 {

	@OriginalMember(owner = "client!af", name = "vb", descriptor = "I")
	public static int anInt228 = 0;

	@OriginalMember(owner = "client!af", name = "zb", descriptor = "Lclient!sc;")
	public static Class66 aClass66_158 = Static106.method1849("mapscene");

	@OriginalMember(owner = "client!af", name = "Db", descriptor = "[Z")
	public static boolean[] aBooleanArray2 = new boolean[100];

	@OriginalMember(owner = "client!af", name = "d", descriptor = "(B)V")
	public static void method159() {
		if (Static101.aClass24_2 != null) {
			Static101.aClass24_2.method1457();
		}
		if (Static20.aClass24_1 != null) {
			Static20.aClass24_1.method1457();
		}
	}

	@OriginalMember(owner = "client!af", name = "f", descriptor = "(I)V")
	public static void method160() {
		@Pc(13) int local13 = Static77.aClass1_Sub1_Sub2_Sub2_Sub1_1.method791(Static98.aClass66_1381);
		@Pc(23) int local23;
		for (@Pc(15) int local15 = 0; local15 < anInt228; local15++) {
			local23 = Static77.aClass1_Sub1_Sub2_Sub2_Sub1_1.method791(Static32.method621(local15));
			if (local23 > local13) {
				local13 = local23;
			}
		}
		Static73.anInt2120 = anInt228 * 15 + 22;
		Static112.aBoolean113 = true;
		local13 += 8;
		Static124.anInt2863 = local13;
		@Pc(58) int local58 = Static35.anInt866 - local13 / 2;
		@Pc(60) int local60 = Static6.anInt308;
		local23 = anInt228 * 15 + 21;
		if (local60 + local23 > 503) {
			local60 = 503 - local23;
		}
		if (local60 < 0) {
			local60 = 0;
		}
		Static80.anInt2176 = local60;
		if (local13 + local58 > 765) {
			local58 = 765 - local13;
		}
		if (local58 < 0) {
			local58 = 0;
		}
		Static79.anInt2166 = local58;
	}

	@OriginalMember(owner = "client!af", name = "e", descriptor = "(B)V")
	public static void method161() {
		for (@Pc(12) int local12 = 0; local12 < Static101.anInt2503; local12++) {
			@Pc(18) int local18 = Static44.anIntArray207[local12];
			@Pc(22) Class1_Sub1_Sub1_Sub5_Sub1 local22 = Static73.aClass1_Sub1_Sub1_Sub5_Sub1Array3[local18];
			@Pc(26) int local26 = Static133.aClass1_Sub12_Sub1_3.method1190();
			@Pc(37) int local37;
			@Pc(41) int local41;
			if ((local26 & 0x80) != 0) {
				local37 = Static133.aClass1_Sub12_Sub1_3.method1203();
				local41 = Static133.aClass1_Sub12_Sub1_3.method1212();
				local22.method930(local41, Static22.anInt636, local37);
				local22.anInt1264 = Static22.anInt636 + 300;
				local22.anInt1242 = Static133.aClass1_Sub12_Sub1_3.method1190();
				local22.anInt1275 = Static133.aClass1_Sub12_Sub1_3.method1190();
			}
			if ((local26 & 0x1) != 0) {
				local22.anInt1255 = Static133.aClass1_Sub12_Sub1_3.method1183();
				local37 = Static133.aClass1_Sub12_Sub1_3.method1189();
				local22.anInt1249 = local37 >> 16;
				local22.anInt1279 = 0;
				local22.anInt1253 = 0;
				local22.anInt1281 = (local37 & 0xFFFF) + Static22.anInt636;
				if (local22.anInt1255 == 65535) {
					local22.anInt1255 = -1;
				}
				if (Static22.anInt636 < local22.anInt1281) {
					local22.anInt1279 = -1;
				}
			}
			if ((local26 & 0x8) != 0) {
				local37 = Static133.aClass1_Sub12_Sub1_3.method1203();
				local41 = Static133.aClass1_Sub12_Sub1_3.method1190();
				local22.method930(local41, Static22.anInt636, local37);
				local22.anInt1264 = Static22.anInt636 + 300;
				local22.anInt1242 = Static133.aClass1_Sub12_Sub1_3.method1203();
				local22.anInt1275 = Static133.aClass1_Sub12_Sub1_3.method1202();
			}
			if ((local26 & 0x40) != 0) {
				local22.aClass66_702 = Static133.aClass1_Sub12_Sub1_3.method1214();
				local22.anInt1283 = 100;
			}
			if ((local26 & 0x10) != 0) {
				local22.anInt1241 = Static133.aClass1_Sub12_Sub1_3.method1176();
				if (local22.anInt1241 == 65535) {
					local22.anInt1241 = -1;
				}
			}
			if ((local26 & 0x4) != 0) {
				local22.aClass1_Sub1_Sub5_1 = Static55.method1238(Static133.aClass1_Sub12_Sub1_3.method1194());
				local22.anInt1276 = local22.aClass1_Sub1_Sub5_1.anInt1486;
				local22.anInt1250 = local22.aClass1_Sub1_Sub5_1.anInt1479;
				local22.anInt1289 = local22.aClass1_Sub1_Sub5_1.anInt1477;
				local22.anInt1296 = local22.aClass1_Sub1_Sub5_1.anInt1468;
				local22.anInt1291 = local22.aClass1_Sub1_Sub5_1.anInt1484;
				local22.anInt1262 = local22.aClass1_Sub1_Sub5_1.anInt1463;
				local22.anInt1243 = local22.aClass1_Sub1_Sub5_1.anInt1471;
				local22.anInt1248 = local22.aClass1_Sub1_Sub5_1.anInt1474;
				local22.anInt1288 = local22.aClass1_Sub1_Sub5_1.anInt1470;
			}
			if ((local26 & 0x20) != 0) {
				local37 = Static133.aClass1_Sub12_Sub1_3.method1222();
				if (local37 == 65535) {
					local37 = -1;
				}
				local41 = Static133.aClass1_Sub12_Sub1_3.method1202();
				if (local37 == local22.anInt1266 && local37 != -1) {
					@Pc(313) int local313 = Static56.method1247(local37).anInt2658;
					if (local313 == 1) {
						local22.anInt1246 = 0;
						local22.anInt1293 = 0;
						local22.anInt1259 = 0;
						local22.anInt1257 = local41;
					}
					if (local313 == 2) {
						local22.anInt1293 = 0;
					}
				} else if (local37 == -1 || local22.anInt1266 == -1 || Static56.method1247(local37).anInt2659 >= Static56.method1247(local22.anInt1266).anInt2659) {
					local22.anInt1266 = local37;
					local22.anInt1259 = 0;
					local22.anInt1284 = local22.anInt1237;
					local22.anInt1293 = 0;
					local22.anInt1257 = local41;
					local22.anInt1246 = 0;
				}
			}
			if ((local26 & 0x2) != 0) {
				local22.anInt1265 = Static133.aClass1_Sub12_Sub1_3.method1176();
				local22.anInt1280 = Static133.aClass1_Sub12_Sub1_3.method1194();
			}
		}
	}

	@OriginalMember(owner = "client!af", name = "b", descriptor = "(II)I")
	public static int method162(@OriginalArg(0) int arg0) {
		return arg0 >> 11 & 0x3F;
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(Z)V")
	public static void method163() {
		aBooleanArray2 = null;
		aClass66_158 = null;
	}

	@OriginalMember(owner = "client!af", name = "g", descriptor = "(I)V")
	public static void method164() {
		for (@Pc(15) Class1_Sub13 local15 = (Class1_Sub13) Static1.aClass61_1.method1748(); local15 != null; local15 = (Class1_Sub13) Static1.aClass61_1.method1760()) {
			if (local15.aClass1_Sub9_Sub4_2 != null) {
				Static73.aClass1_Sub9_Sub2_3.method1012(local15.aClass1_Sub9_Sub4_2);
				local15.aClass1_Sub9_Sub4_2 = null;
			}
			if (local15.aClass1_Sub9_Sub4_1 != null) {
				Static73.aClass1_Sub9_Sub2_3.method1012(local15.aClass1_Sub9_Sub4_1);
				local15.aClass1_Sub9_Sub4_1 = null;
			}
		}
		Static1.aClass61_1.method1761();
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(Lclient!sc;Lclient!sc;Lclient!sf;IIIZ)V")
	public static void method166(@OriginalArg(0) Class66 arg0, @OriginalArg(1) Class66 arg1, @OriginalArg(2) Class5 arg2) {
		@Pc(8) int local8 = arg2.method122(arg1);
		@Pc(22) int local22 = arg2.method116(local8, arg0);
		Static33.method627(local22, local8, arg2, 255);
	}
}
