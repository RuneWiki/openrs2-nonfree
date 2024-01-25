import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static314 {

	@OriginalMember(owner = "client!ju", name = "m", descriptor = "[I")
	public static int[] anIntArray345;

	@OriginalMember(owner = "client!ju", name = "n", descriptor = "[Lclient!mv;")
	public static Class252[] aClass252Array1;

	@OriginalMember(owner = "client!ju", name = "C", descriptor = "[[B")
	public static byte[][] aByteArrayArray9;

	@OriginalMember(owner = "client!ju", name = "q", descriptor = "Lclient!aea;")
	public static Class6 aClass6_1;

	@OriginalMember(owner = "client!ju", name = "w", descriptor = "Lclient!hda;")
	public static final Class150 aClass150_7 = new Class150("game4", "Game 4", 3);

	@OriginalMember(owner = "client!ju", name = "u", descriptor = "[I")
	public static final int[] anIntArray346 = new int[13];

	@OriginalMember(owner = "client!ju", name = "d", descriptor = "(I)V")
	public static void method4376() {
		if (!Static189.aBoolean301) {
			Static721.aBoolean939 = Static455.anInt7442 != -1 && Static535.anInt8486 >= Static455.anInt7442 || Static295.anInt4558 < Static535.anInt8486 * 16 + (Static437.aBoolean603 ? 26 : 22);
		}
		Static179.aClass60_59.method1223();
		Static16.aClass60_5.method1223();
		@Pc(70) int local70;
		for (@Pc(63) Class2_Sub6_Sub20 local63 = (Class2_Sub6_Sub20) Static273.aClass60_88.method1226(7); local63 != null; local63 = (Class2_Sub6_Sub20) Static273.aClass60_88.method1228()) {
			local70 = local63.anInt9603;
			if (local70 < 1000) {
				local63.method9872();
				if (local70 == 49 || local70 == 30 || local70 == 2 || local70 == 46 || local70 == 22 || local70 == 60 || local70 == 9) {
					Static16.aClass60_5.method1233(local63);
				} else {
					Static179.aClass60_59.method1233(local63);
				}
			}
		}
		Static179.aClass60_59.method1232(Static273.aClass60_88);
		Static16.aClass60_5.method1232(Static273.aClass60_88);
		if (Static535.anInt8486 <= 1) {
			Static91.aClass2_Sub6_Sub20_2 = null;
			Static122.aClass2_Sub6_Sub20_3 = null;
		} else {
			if (Static129.aBoolean238 && Static102.aClass184_1.method6058(81) && Static535.anInt8486 > 2) {
				Static91.aClass2_Sub6_Sub20_2 = (Class2_Sub6_Sub20) Static273.aClass60_88.aClass2_47.aClass2_346.aClass2_346;
			} else {
				Static91.aClass2_Sub6_Sub20_2 = (Class2_Sub6_Sub20) Static273.aClass60_88.aClass2_47.aClass2_346;
			}
			Static122.aClass2_Sub6_Sub20_3 = (Class2_Sub6_Sub20) Static273.aClass60_88.aClass2_47.aClass2_346;
		}
		local70 = -1;
		@Pc(204) Class2_Sub18 local204 = (Class2_Sub18) Static171.aClass60_55.method1226(7);
		if (local204 != null) {
			local70 = local204.method7126();
		}
		if (!Static189.aBoolean301) {
			if (local70 == 0 && (Static410.anInt6714 == 1 && Static535.anInt8486 > 2 || Static174.method2605())) {
				local70 = 2;
			}
			if (local70 == 2 && Static535.anInt8486 > 0 && local204 != null) {
				if (Static650.aClass273_17 == null && Static230.anInt3651 == 0) {
					Static242.method7777(local204.method7124(), local204.method7122());
				} else {
					Static187.anInt3065 = 2;
				}
			}
			if (local70 == 0) {
				if (Static91.aClass2_Sub6_Sub20_2 != null) {
					Static40.method555();
				} else if (Static581.aBoolean787) {
					Static643.method8704();
				}
			}
			if (Static650.aClass273_17 != null || Static230.anInt3651 != 0) {
				return;
			}
			Static187.anInt3065 = 0;
			Static40.aClass2_Sub6_Sub20_1 = null;
			return;
		}
		@Pc(222) int local222;
		@Pc(226) int local226;
		@Pc(329) int local329;
		@Pc(331) int local331;
		if (local70 == -1) {
			local222 = Static402.aClass138_1.method4767();
			local226 = Static402.aClass138_1.method4771();
			@Pc(228) boolean local228 = false;
			if (Static671.aClass2_Sub6_Sub7_1 != null) {
				if (local222 >= Static261.anInt10711 - 10 && local222 <= Static261.anInt10711 + Static18.anInt242 + 10 && Static555.anInt8749 - 10 <= local226 && local226 <= Static563.anInt8853 + Static555.anInt8749 + 10) {
					local228 = true;
				} else {
					Static541.method7566();
				}
			}
			if (!local228) {
				if (local222 < Static216.anInt3440 - 10 || Static216.anInt3440 + Static699.anInt10734 + 10 < local222 || Static215.anInt3422 - 10 > local226 || Static442.anInt7174 + Static215.anInt3422 + 10 < local226) {
					Static640.method8677();
				} else if (Static721.aBoolean939) {
					local329 = -1;
					local331 = -1;
					@Pc(347) int local347;
					for (@Pc(333) int local333 = 0; local333 < Static7.anInt82; local333++) {
						if (Static437.aBoolean603) {
							local347 = Static215.anInt3422 + local333 * 16 + 33;
							if (local226 > local347 - 13 && local226 < local347 + 4) {
								local331 = local347 - 13;
								local329 = local333;
								break;
							}
						} else {
							local347 = local333 * 16 + Static215.anInt3422 + 31;
							if (local347 - 13 < local226 && local226 < local347 + 3) {
								local329 = local333;
								local331 = local347 - 13;
								break;
							}
						}
					}
					if (local329 != -1) {
						local347 = 0;
						@Pc(416) Class59 local416 = new Class59(Static416.aClass388_6);
						for (@Pc(421) Class2_Sub6_Sub7 local421 = (Class2_Sub6_Sub7) local416.method1202(); local421 != null; local421 = (Class2_Sub6_Sub7) local416.method1201()) {
							if (local347 == local329) {
								if (local421.anInt4448 > 1) {
									Static632.method8620(local226, local331, local421);
								}
								break;
							}
							local347++;
						}
					}
				}
			}
		}
		if (local70 != 0) {
			return;
		}
		local222 = local204.method7122();
		local226 = local204.method7124();
		@Pc(545) int local545;
		@Pc(765) Class59 local765;
		@Pc(644) Class2_Sub6_Sub20 local644;
		if (Static671.aClass2_Sub6_Sub7_1 != null && Static261.anInt10711 <= local222 && Static18.anInt242 + Static261.anInt10711 >= local222 && Static555.anInt8749 <= local226 && Static563.anInt8853 + Static555.anInt8749 >= local226) {
			local545 = -1;
			for (local329 = 0; local329 < Static671.aClass2_Sub6_Sub7_1.anInt4448; local329++) {
				if (Static437.aBoolean603) {
					local331 = local329 * 16 + Static555.anInt8749 + 33;
					if (local226 > local331 - 13 && local226 < local331 + 4) {
						local545 = local329;
					}
				} else {
					local331 = Static555.anInt8749 + local329 * 16 + 31;
					if (local331 - 13 < local226 && local331 + 3 > local226) {
						local545 = local329;
					}
				}
			}
			if (local545 != -1) {
				local331 = 0;
				local765 = new Class59(Static671.aClass2_Sub6_Sub7_1.aClass388_4);
				for (local644 = (Class2_Sub6_Sub20) local765.method1202(); local644 != null; local644 = (Class2_Sub6_Sub20) local765.method1201()) {
					if (local331 == local545) {
						Static594.method8179(local644, local222, local226);
						break;
					}
					local331++;
				}
			}
			Static640.method8677();
			return;
		}
		if (local222 < Static216.anInt3440 || local222 > Static699.anInt10734 + Static216.anInt3440 || Static215.anInt3422 > local226 || local226 > Static442.anInt7174 + Static215.anInt3422) {
			return;
		}
		if (!Static721.aBoolean939) {
			local545 = -1;
			for (local329 = 0; local329 < Static535.anInt8486; local329++) {
				if (Static437.aBoolean603) {
					local331 = (Static535.anInt8486 - local329 - 1) * 16 + Static215.anInt3422 + 33;
					if (local331 - 13 < local226 && local226 < local331 + 4) {
						local545 = local329;
					}
				} else {
					local331 = (Static535.anInt8486 - local329 - 1) * 16 + Static215.anInt3422 + 31;
					if (local226 > local331 - 13 && local331 + 3 > local226) {
						local545 = local329;
					}
				}
			}
			if (local545 != -1) {
				local331 = 0;
				@Pc(639) Class190 local639 = new Class190(Static273.aClass60_88);
				for (local644 = (Class2_Sub6_Sub20) local639.method4065(); local644 != null; local644 = (Class2_Sub6_Sub20) local639.method4062()) {
					if (local545 == local331) {
						Static594.method8179(local644, local222, local226);
						break;
					}
					local331++;
				}
			}
			Static640.method8677();
			return;
		}
		local545 = -1;
		for (local329 = 0; local329 < Static7.anInt82; local329++) {
			if (Static437.aBoolean603) {
				local331 = local329 * 16 + Static215.anInt3422 + 33;
				if (local226 > local331 - 13 && local331 + 4 > local226) {
					local545 = local329;
					break;
				}
			} else {
				local331 = local329 * 16 + Static215.anInt3422 + 31;
				if (local331 - 13 < local226 && local226 < local331 + 3) {
					local545 = local329;
					break;
				}
			}
		}
		if (local545 == -1) {
			return;
		}
		local331 = 0;
		local765 = new Class59(Static416.aClass388_6);
		for (@Pc(770) Class2_Sub6_Sub7 local770 = (Class2_Sub6_Sub7) local765.method1202(); local770 != null; local770 = (Class2_Sub6_Sub7) local765.method1201()) {
			if (local545 == local331) {
				Static594.method8179((Class2_Sub6_Sub20) local770.aClass388_4.aClass2_Sub6_66.aClass2_Sub6_64, local222, local226);
				Static640.method8677();
				return;
			}
			local331++;
		}
		return;
	}
}
