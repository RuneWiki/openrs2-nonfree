import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static442 {

	@OriginalMember(owner = "client!vv", name = "a", descriptor = "I")
	public static int anInt7326;

	@OriginalMember(owner = "client!vv", name = "e", descriptor = "I")
	public static int anInt7328;

	@OriginalMember(owner = "client!vv", name = "c", descriptor = "Lclient!pu;")
	public static final Class198 aClass198_125 = new Class198("Please remove ", "Bitte entferne ", "Veuillez commencer par supprimer ", "Remova ");

	@OriginalMember(owner = "client!vv", name = "d", descriptor = "Lclient!fi;")
	public static Class76 aClass76_15 = null;

	@OriginalMember(owner = "client!vv", name = "f", descriptor = "[I")
	public static final int[] anIntArray492 = new int[1000];

	@OriginalMember(owner = "client!vv", name = "a", descriptor = "(Lclient!dd;ILclient!dd;)V")
	public static void method5809(@OriginalArg(0) Class5 arg0, @OriginalArg(2) Class5 arg1) {
		if (arg0.aClass5_268 != null) {
			arg0.method6003();
		}
		arg0.aClass5_267 = arg1;
		arg0.aClass5_268 = arg1.aClass5_268;
		arg0.aClass5_268.aClass5_267 = arg0;
		arg0.aClass5_267.aClass5_268 = arg0;
	}

	@OriginalMember(owner = "client!vv", name = "a", descriptor = "()V")
	public static void method5810() {
		Static20.anInt423 = 0;
		label208: for (@Pc(3) int local3 = 0; local3 < Static188.anInt3158; local3++) {
			@Pc(8) Class247 local8 = Static243.aClass247Array1[local3];
			@Pc(12) int local12;
			if (Static428.anIntArray484 != null) {
				for (local12 = 0; local12 < Static428.anIntArray484.length; local12++) {
					if (Static428.anIntArray484[local12] != -1000000 && (local8.anInt7109 <= Static428.anIntArray484[local12] || local8.anInt7103 <= Static428.anIntArray484[local12]) && (local8.anInt7102 <= Static170.anIntArray161[local12] || local8.anInt7108 <= Static170.anIntArray161[local12]) && (local8.anInt7102 >= Static454.anIntArray502[local12] || local8.anInt7108 >= Static454.anIntArray502[local12]) && (local8.anInt7098 <= Static111.anIntArray89[local12] || local8.anInt7112 <= Static111.anIntArray89[local12]) && (local8.anInt7098 >= Static457.anIntArray512[local12] || local8.anInt7112 >= Static457.anIntArray512[local12])) {
						continue label208;
					}
				}
			}
			@Pc(110) int local110;
			@Pc(128) int local128;
			@Pc(164) int local164;
			@Pc(143) boolean local143;
			if (local8.anInt7106 == 1) {
				local12 = local8.anInt7101 + Static70.anInt1271 - Static448.anInt7370;
				if (local12 >= 0 && local12 <= Static70.anInt1271 + Static70.anInt1271) {
					local110 = local8.anInt7097 + Static70.anInt1271 - Static17.anInt369;
					if (local110 < 0) {
						local110 = 0;
					} else if (local110 > Static70.anInt1271 + Static70.anInt1271) {
						continue;
					}
					local128 = local8.anInt7113 + Static70.anInt1271 - Static17.anInt369;
					if (local128 > Static70.anInt1271 + Static70.anInt1271) {
						local128 = Static70.anInt1271 + Static70.anInt1271;
					} else if (local128 < 0) {
						continue;
					}
					local143 = false;
					while (local110 <= local128) {
						if (Static309.aBooleanArrayArray6[local12][local110++]) {
							local143 = true;
							break;
						}
					}
					if (local143) {
						local164 = Static267.anInt4663 - local8.anInt7102;
						if (local164 > Static134.anInt2381) {
							local8.anInt7105 = 1;
						} else {
							if (local164 >= -Static134.anInt2381) {
								continue;
							}
							local8.anInt7105 = 2;
							local164 = -local164;
						}
						local8.anInt7099 = (local8.anInt7098 - Static109.anInt1835 << 8) / local164;
						local8.anInt7110 = (local8.anInt7112 - Static109.anInt1835 << 8) / local164;
						local8.anInt7100 = (local8.anInt7109 - Static379.anInt4380 << 8) / local164;
						local8.anInt7111 = (local8.anInt7103 - Static379.anInt4380 << 8) / local164;
						Static323.aClass247Array2[Static20.anInt423++] = local8;
					}
				}
			} else if (local8.anInt7106 == 2) {
				local12 = local8.anInt7097 + Static70.anInt1271 - Static17.anInt369;
				if (local12 >= 0 && local12 <= Static70.anInt1271 + Static70.anInt1271) {
					local110 = local8.anInt7101 + Static70.anInt1271 - Static448.anInt7370;
					if (local110 < 0) {
						local110 = 0;
					} else if (local110 > Static70.anInt1271 + Static70.anInt1271) {
						continue;
					}
					local128 = local8.anInt7096 + Static70.anInt1271 - Static448.anInt7370;
					if (local128 > Static70.anInt1271 + Static70.anInt1271) {
						local128 = Static70.anInt1271 + Static70.anInt1271;
					} else if (local128 < 0) {
						continue;
					}
					local143 = false;
					while (local110 <= local128) {
						if (Static309.aBooleanArrayArray6[local110++][local12]) {
							local143 = true;
							break;
						}
					}
					if (local143) {
						local164 = Static109.anInt1835 - local8.anInt7098;
						if (local164 > Static134.anInt2381) {
							local8.anInt7105 = 3;
						} else {
							if (local164 >= -Static134.anInt2381) {
								continue;
							}
							local8.anInt7105 = 4;
							local164 = -local164;
						}
						local8.anInt7104 = (local8.anInt7102 - Static267.anInt4663 << 8) / local164;
						local8.anInt7107 = (local8.anInt7108 - Static267.anInt4663 << 8) / local164;
						local8.anInt7100 = (local8.anInt7109 - Static379.anInt4380 << 8) / local164;
						local8.anInt7111 = (local8.anInt7103 - Static379.anInt4380 << 8) / local164;
						Static323.aClass247Array2[Static20.anInt423++] = local8;
					}
				}
			} else if (local8.anInt7106 == 4) {
				local12 = local8.anInt7109 - Static379.anInt4380;
				if (local12 > Static124.anInt2196) {
					local110 = local8.anInt7097 + Static70.anInt1271 - Static17.anInt369;
					if (local110 < 0) {
						local110 = 0;
					} else if (local110 > Static70.anInt1271 + Static70.anInt1271) {
						continue;
					}
					local128 = local8.anInt7113 + Static70.anInt1271 - Static17.anInt369;
					if (local128 > Static70.anInt1271 + Static70.anInt1271) {
						local128 = Static70.anInt1271 + Static70.anInt1271;
					} else if (local128 < 0) {
						continue;
					}
					@Pc(435) int local435 = local8.anInt7101 + Static70.anInt1271 - Static448.anInt7370;
					if (local435 < 0) {
						local435 = 0;
					} else if (local435 > Static70.anInt1271 + Static70.anInt1271) {
						continue;
					}
					local164 = local8.anInt7096 + Static70.anInt1271 - Static448.anInt7370;
					if (local164 > Static70.anInt1271 + Static70.anInt1271) {
						local164 = Static70.anInt1271 + Static70.anInt1271;
					} else if (local164 < 0) {
						continue;
					}
					@Pc(468) boolean local468 = false;
					label180: for (@Pc(470) int local470 = local435; local470 <= local164; local470++) {
						for (@Pc(473) int local473 = local110; local473 <= local128; local473++) {
							if (Static309.aBooleanArrayArray6[local470][local473]) {
								local468 = true;
								break label180;
							}
						}
					}
					if (local468) {
						local8.anInt7105 = 5;
						local8.anInt7104 = (local8.anInt7102 - Static267.anInt4663 << 8) / local12;
						local8.anInt7107 = (local8.anInt7108 - Static267.anInt4663 << 8) / local12;
						local8.anInt7099 = (local8.anInt7098 - Static109.anInt1835 << 8) / local12;
						local8.anInt7110 = (local8.anInt7112 - Static109.anInt1835 << 8) / local12;
						Static323.aClass247Array2[Static20.anInt423++] = local8;
					}
				}
			}
		}
	}
}
