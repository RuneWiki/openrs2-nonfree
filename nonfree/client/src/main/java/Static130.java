import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static130 {

	@OriginalMember(owner = "client!gf", name = "h", descriptor = "[Lclient!o;")
	public static Class137[] aClass137Array5;

	@OriginalMember(owner = "client!gf", name = "m", descriptor = "Z")
	public static boolean aBoolean180;

	@OriginalMember(owner = "client!gf", name = "p", descriptor = "F")
	public static float aFloat21 = 0.25F;

	@OriginalMember(owner = "client!gf", name = "s", descriptor = "Lclient!lo;")
	public static final Class158 aClass158_76 = new Class158("Walk here", "Hierhin gehen", "Atteindre", "Caminhar para cá");

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(ILclient!ou;IIB)V")
	public static void method2136(@OriginalArg(0) int arg0, @OriginalArg(1) Class30_Sub1_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(16) Class212 local16 = arg1.method948();
		@Pc(26) int local26 = arg1.anInt1277 - arg1.aClass15_7.anInt391 & 0x3FFF;
		if (arg3 == -1) {
			if (local26 != 0 || arg1.anInt1301 > 25) {
				arg1.aBoolean81 = false;
				if (arg0 < 0 && local16.anInt6257 != -1) {
					arg1.anInt1255 = local16.anInt6257;
				} else if (arg0 <= 0 || local16.anInt6288 == -1) {
					arg1.anInt1255 = local16.anInt6282;
				} else {
					arg1.anInt1255 = local16.anInt6288;
				}
			} else if (!arg1.aBoolean81 || !local16.method4812(arg1.anInt1255)) {
				arg1.anInt1255 = local16.method4811();
				arg1.aBoolean81 = arg1.anInt1255 != -1;
			}
		} else if (arg1.anInt1243 != -1 && (local26 >= 10240 || local26 <= 2048)) {
			@Pc(282) int local282 = Static55.anIntArray134[arg2] - arg1.aClass15_7.anInt391 & 0x3FFF;
			arg1.aBoolean81 = false;
			if (arg3 == 2 && local16.anInt6253 != -1) {
				if (local282 > 2048 && local282 <= 6144 && local16.anInt6291 != -1) {
					arg1.anInt1255 = local16.anInt6291;
				} else if (local282 >= 10240 && local282 < 14336 && local16.anInt6278 != -1) {
					arg1.anInt1255 = local16.anInt6278;
				} else if (local282 <= 6144 || local282 >= 10240 || local16.anInt6267 == -1) {
					arg1.anInt1255 = local16.anInt6253;
				} else {
					arg1.anInt1255 = local16.anInt6267;
				}
			} else if (arg3 == 0 && local16.anInt6275 != -1) {
				if (local282 > 2048 && local282 <= 6144 && local16.anInt6280 != -1) {
					arg1.anInt1255 = local16.anInt6280;
				} else if (local282 >= 10240 && local282 < 14336 && local16.anInt6245 != -1) {
					arg1.anInt1255 = local16.anInt6245;
				} else if (local282 <= 6144 || local282 >= 10240 || local16.anInt6259 == -1) {
					arg1.anInt1255 = local16.anInt6275;
				} else {
					arg1.anInt1255 = local16.anInt6259;
				}
			} else if (local282 > 2048 && local282 <= 6144 && local16.anInt6287 != -1) {
				arg1.anInt1255 = local16.anInt6287;
			} else if (local282 >= 10240 && local282 < 14336 && local16.anInt6260 != -1) {
				arg1.anInt1255 = local16.anInt6260;
			} else if (local282 <= 6144 || local282 >= 10240 || local16.anInt6248 == -1) {
				arg1.anInt1255 = local16.anInt6282;
			} else {
				arg1.anInt1255 = local16.anInt6248;
			}
		} else if (local26 == 0 && arg1.anInt1301 <= 25) {
			if (arg3 == 2 && local16.anInt6253 != -1) {
				arg1.anInt1255 = local16.anInt6253;
			} else if (arg3 == 0 && local16.anInt6275 != -1) {
				arg1.anInt1255 = local16.anInt6275;
			} else {
				arg1.anInt1255 = local16.anInt6282;
			}
			arg1.aBoolean81 = false;
		} else {
			if (arg3 == 2 && local16.anInt6253 != -1) {
				if (arg0 < 0 && local16.anInt6251 != -1) {
					arg1.anInt1255 = local16.anInt6251;
				} else if (arg0 <= 0 || local16.anInt6293 == -1) {
					arg1.anInt1255 = local16.anInt6253;
				} else {
					arg1.anInt1255 = local16.anInt6293;
				}
			} else if (arg3 == 0 && local16.anInt6275 != -1) {
				if (arg0 < 0 && local16.anInt6276 != -1) {
					arg1.anInt1255 = local16.anInt6276;
				} else if (arg0 <= 0 || local16.anInt6254 == -1) {
					arg1.anInt1255 = local16.anInt6275;
				} else {
					arg1.anInt1255 = local16.anInt6254;
				}
			} else if (arg0 < 0 && local16.anInt6250 != -1) {
				arg1.anInt1255 = local16.anInt6250;
			} else if (arg0 <= 0 || local16.anInt6270 == -1) {
				arg1.anInt1255 = local16.anInt6282;
			} else {
				arg1.anInt1255 = local16.anInt6270;
			}
			arg1.aBoolean81 = false;
		}
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(B[Lclient!ec;I)V")
	public static void method2137(@OriginalArg(1) Class68[] arg0, @OriginalArg(2) int arg1) {
		for (@Pc(6) int local6 = 0; local6 < arg0.length; local6++) {
			@Pc(11) Class68 local11 = arg0[local6];
			if (local11 != null) {
				if (local11.anInt2153 == 0) {
					if (local11.aClass68Array2 != null) {
						method2137(local11.aClass68Array2, arg1);
					}
					@Pc(35) Class1_Sub39 local35 = (Class1_Sub39) Static177.aClass38_18.method765((long) local11.anInt2135);
					if (local35 != null) {
						Static434.method5793(local35.anInt6172, arg1);
					}
				}
				@Pc(54) Class1_Sub10 local54;
				if (arg1 == 0 && local11.anObjectArray6 != null) {
					local54 = new Class1_Sub10();
					local54.anObjectArray2 = local11.anObjectArray6;
					local54.aClass68_3 = local11;
					Static178.method3000(local54);
				}
				if (arg1 == 1 && local11.anObjectArray18 != null) {
					if (local11.anInt2188 >= 0) {
						@Pc(80) Class68 local80 = Static300.method4351(local11.anInt2135);
						if (local80 == null || local80.aClass68Array2 == null || local11.anInt2188 >= local80.aClass68Array2.length || local80.aClass68Array2[local11.anInt2188] != local11) {
							continue;
						}
					}
					local54 = new Class1_Sub10();
					local54.anObjectArray2 = local11.anObjectArray18;
					local54.aClass68_3 = local11;
					Static178.method3000(local54);
				}
			}
		}
	}

	@OriginalMember(owner = "client!gf", name = "c", descriptor = "(I)V")
	public static void method2138() {
		Static210.aClass204_1 = new Class204(8);
		Static332.anInt6403 = 0;
		for (@Pc(19) Class41_Sub1 local19 = (Class41_Sub1) Static30.aClass117_1.method2967(); local19 != null; local19 = (Class41_Sub1) Static30.aClass117_1.method2970()) {
			local19.method879();
		}
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(ILclient!hn;I)V")
	public static void method2139(@OriginalArg(1) Class108 arg0, @OriginalArg(2) int arg1) {
		if (Static293.aBoolean301) {
			arg1 = 0;
			Static293.aBoolean301 = false;
		}
		if (Static192.aClass108_1 != null && Static192.aClass108_1.method2631(arg0)) {
			return;
		}
		Static192.aClass108_1 = arg0;
		Static192.aLong110 = Static250.method3737();
		Static134.anInt2989 = arg1;
		Static100.anInt2369 = arg1;
		if (Static100.anInt2369 == 0) {
			Static218.method3406();
			return;
		}
		Static382.aFloat99 = Static139.aFloat22;
		Static372.aFloat96 = Static162.aFloat39;
		Static146.aFloat27 = Static438.aFloat102;
		Static249.aFloat65 = Static285.aFloat85;
		Static358.anInt6606 = Static389.anInt7108;
		Static296.anInt5568 = Static222.anInt4443;
		Static189.aClass86_2 = Static388.aClass86_3;
		Static204.aFloat63 = Static114.aFloat15;
		Static414.anInt7373 = Static47.anInt7026;
		Static373.aFloat97 = Static269.aFloat84;
	}
}
