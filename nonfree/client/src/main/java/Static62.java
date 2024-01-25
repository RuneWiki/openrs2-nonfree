import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static62 {

	@OriginalMember(owner = "client!ds", name = "n", descriptor = "Lclient!lm;")
	public static Class134 aClass134_148;

	@OriginalMember(owner = "client!ds", name = "r", descriptor = "Ljava/lang/String;")
	public static String aString271 = "Walk here";

	@OriginalMember(owner = "client!ds", name = "v", descriptor = "I")
	public static int anInt6674 = 0;

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(III)Z")
	public static boolean method5782(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < Static327.anInt6424; local1++) {
			@Pc(6) Class46 local6 = Static42.aClass46Array1[local1];
			@Pc(15) int local15;
			@Pc(27) int local27;
			@Pc(37) int local37;
			@Pc(47) int local47;
			@Pc(57) int local57;
			if (local6.anInt1324 == 1) {
				local15 = local6.anInt1329 - arg0;
				if (local15 > 0) {
					local27 = local6.anInt1326 + (local6.anInt1318 * local15 >> 8);
					local37 = local6.anInt1334 + (local6.anInt1335 * local15 >> 8);
					local47 = local6.anInt1330 + (local6.anInt1316 * local15 >> 8);
					local57 = local6.anInt1317 + (local6.anInt1314 * local15 >> 8);
					if (arg2 >= local27 && arg2 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt1324 == 2) {
				local15 = arg0 - local6.anInt1329;
				if (local15 > 0) {
					local27 = local6.anInt1326 + (local6.anInt1318 * local15 >> 8);
					local37 = local6.anInt1334 + (local6.anInt1335 * local15 >> 8);
					local47 = local6.anInt1330 + (local6.anInt1316 * local15 >> 8);
					local57 = local6.anInt1317 + (local6.anInt1314 * local15 >> 8);
					if (arg2 >= local27 && arg2 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt1324 == 3) {
				local15 = local6.anInt1326 - arg2;
				if (local15 > 0) {
					local27 = local6.anInt1329 + (local6.anInt1327 * local15 >> 8);
					local37 = local6.anInt1328 + (local6.anInt1321 * local15 >> 8);
					local47 = local6.anInt1330 + (local6.anInt1316 * local15 >> 8);
					local57 = local6.anInt1317 + (local6.anInt1314 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt1324 == 4) {
				local15 = arg2 - local6.anInt1326;
				if (local15 > 0) {
					local27 = local6.anInt1329 + (local6.anInt1327 * local15 >> 8);
					local37 = local6.anInt1328 + (local6.anInt1321 * local15 >> 8);
					local47 = local6.anInt1330 + (local6.anInt1316 * local15 >> 8);
					local57 = local6.anInt1317 + (local6.anInt1314 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt1324 == 5) {
				local15 = arg1 - local6.anInt1330;
				if (local15 > 0) {
					local27 = local6.anInt1329 + (local6.anInt1327 * local15 >> 8);
					local37 = local6.anInt1328 + (local6.anInt1321 * local15 >> 8);
					local47 = local6.anInt1326 + (local6.anInt1318 * local15 >> 8);
					local57 = local6.anInt1334 + (local6.anInt1335 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg2 >= local47 && arg2 <= local57) {
						return true;
					}
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(Lclient!qs;BI)V")
	public static void method5785(@OriginalArg(0) Class172 arg0, @OriginalArg(2) int arg1) {
		if (Static352.aBoolean555) {
			arg1 = 0;
			Static352.aBoolean555 = false;
		}
		if (Static109.aClass172_2 != null && Static109.aClass172_2.method4538(arg0)) {
			return;
		}
		Static109.aClass172_2 = arg0;
		Static256.aLong158 = Static292.method5114();
		Static286.anInt5734 = arg1;
		Static89.anInt1702 = arg1;
		if (Static89.anInt1702 == 0) {
			Static16.method299();
			return;
		}
		Static304.aFloat76 = Static37.aFloat1;
		Static280.aFloat74 = Static266.aFloat71;
		Static153.anInt3150 = Static97.anInt1883;
		Static37.aFloat2 = Static266.aFloat72;
		Static273.aFloat73 = Static127.aFloat16;
		Static50.aFloat4 = Static295.aFloat75;
		Static197.anInt4153 = Static64.anInt1438;
		Static121.aFloat56 = Static41.aFloat3;
		Static272.aClass78_5 = Static183.aClass78_4;
		Static257.anInt5266 = Static251.anInt5192;
	}

	@OriginalMember(owner = "client!ds", name = "d", descriptor = "(I)V")
	public static void method5786() {
		Static250.aClass207_31.method5562();
		Static51.aClass169_2.method4481();
		Static100.aClass169_4.method4481();
	}

	@OriginalMember(owner = "client!ds", name = "c", descriptor = "(B)[Lclient!vi;")
	public static Class206[] method5788() {
		if (Static195.aClass206Array20 == null) {
			@Pc(18) Class206[] local18 = Static250.method4495(Static197.aClass215_5);
			@Pc(22) Class206[] local22 = new Class206[local18.length];
			@Pc(24) int local24 = 0;
			@Pc(70) int local70;
			@Pc(76) Class206 local76;
			label63: for (@Pc(26) int local26 = 0; local26 < local18.length; local26++) {
				@Pc(32) Class206 local32 = local18[local26];
				if ((local32.anInt6441 <= 0 || local32.anInt6441 >= 24) && local32.anInt6440 >= 800 && local32.anInt6444 >= 600 && (Static267.anInt5492 >= 96 || Static24.anInt437 != 0 || local32.anInt6440 <= 1024 && local32.anInt6444 <= 768)) {
					for (local70 = 0; local70 < local24; local70++) {
						local76 = local22[local70];
						if (local76.anInt6440 == local32.anInt6440 && local32.anInt6444 == local76.anInt6444) {
							if (local76.anInt6441 < local32.anInt6441) {
								local22[local70] = local32;
							}
							continue label63;
						}
					}
					local22[local24] = local32;
					local24++;
				}
			}
			Static195.aClass206Array20 = new Class206[local24];
			Static361.method1850(local22, 0, Static195.aClass206Array20, 0, local24);
			@Pc(136) int[] local136 = new int[Static195.aClass206Array20.length];
			for (local70 = 0; local70 < Static195.aClass206Array20.length; local70++) {
				local76 = Static195.aClass206Array20[local70];
				local136[local70] = local76.anInt6440 * local76.anInt6444;
			}
			Static44.method905(Static195.aClass206Array20, local136);
		}
		return Static195.aClass206Array20;
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(BI)V")
	public static void method5789() {
		@Pc(5) Class37 local5 = Static129.aClass37_44;
		synchronized (Static129.aClass37_44) {
			Static129.aClass37_44.method920(5);
		}
		local5 = Static50.aClass37_23;
		synchronized (Static50.aClass37_23) {
			Static50.aClass37_23.method920(5);
		}
	}
}
