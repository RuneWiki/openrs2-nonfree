import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static26 {

	@OriginalMember(owner = "client!ed", name = "wc", descriptor = "I")
	public static int anInt698;

	@OriginalMember(owner = "client!ed", name = "md", descriptor = "I")
	public static int anInt723;

	@OriginalMember(owner = "client!ed", name = "pd", descriptor = "[I")
	public static int[] anIntArray58;

	@OriginalMember(owner = "client!ed", name = "Fb", descriptor = "Lclient!kc;")
	public static Class36 aClass36_367 = Static14.method2017("Lade Titelbild )2 ");

	@OriginalMember(owner = "client!ed", name = "bc", descriptor = "Lclient!kc;")
	public static Class36 aClass36_371 = Static14.method2017("Ihr Spielkonto wird bereits benutzt)3");

	@OriginalMember(owner = "client!ed", name = "ec", descriptor = "Lclient!gd;")
	public static Class22 aClass22_7 = new Class22(260);

	@OriginalMember(owner = "client!ed", name = "ld", descriptor = "Lclient!gd;")
	public static Class22 aClass22_8 = new Class22(30);

	@OriginalMember(owner = "client!ed", name = "nd", descriptor = "Lclient!kc;")
	public static Class36 aClass36_374 = Static14.method2017("blinken1:");

	@OriginalMember(owner = "client!ed", name = "od", descriptor = "Lclient!kc;")
	public static Class36 aClass36_375 = Static14.method2017("sind fehlgeschlagen)3 Bitte warten Sie 5 Minuten)1");

	@OriginalMember(owner = "client!ed", name = "g", descriptor = "(I)V")
	public static void method539() {
		Static34.aClass22_9.method716();
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(Lclient!ed;B)V")
	public static void method544(@OriginalArg(0) Class2_Sub1_Sub6 arg0) {
		@Pc(8) int local8 = arg0.anInt694;
		@Pc(97) int local97;
		if (local8 >= 1 && local8 <= 100 || !(local8 < 701 || local8 > 800)) {
			if (Static106.anInt2726 == 0) {
				if (local8 == 1) {
					arg0.aClass36_369 = Static41.aClass36_539;
					arg0.anInt665 = 0;
					return;
				}
				if (local8 == 2) {
					arg0.anInt665 = 0;
					arg0.aClass36_369 = Static111.aClass36_1408;
					return;
				}
			}
			if (Static106.anInt2726 == 1) {
				if (local8 == 1) {
					arg0.anInt665 = 0;
					arg0.aClass36_369 = Static48.aClass36_638;
					return;
				}
				if (local8 == 2) {
					arg0.anInt665 = 0;
					arg0.aClass36_369 = Static111.aClass36_1410;
					return;
				}
				if (local8 == 3) {
					arg0.anInt665 = 0;
					arg0.aClass36_369 = Static90.aClass36_1118;
					return;
				}
			}
			if (local8 <= 700) {
				local8--;
			} else {
				local8 -= 601;
			}
			local97 = Static7.anInt189;
			if (Static106.anInt2726 != 2) {
				local97 = 0;
			}
			if (local97 <= local8) {
				arg0.anInt665 = 0;
				arg0.aClass36_369 = Static105.aClass36_1352;
			} else {
				arg0.aClass36_369 = Static43.aClass36Array21[local8];
				arg0.anInt665 = 1;
			}
		} else if (local8 >= 101 && local8 <= 200 || local8 >= 801 && local8 <= 900) {
			if (local8 > 800) {
				local8 -= 701;
			} else {
				local8 -= 101;
			}
			local97 = Static7.anInt189;
			if (Static106.anInt2726 != 2) {
				local97 = 0;
			}
			if (local8 >= local97) {
				arg0.aClass36_369 = Static105.aClass36_1352;
				arg0.anInt665 = 0;
			} else {
				if (Static36.anIntArray130[local8] == 0) {
					arg0.aClass36_369 = Static49.method949(new Class36[] { Static38.aClass36_493, Static38.aClass36_496 });
				} else if (Static36.anIntArray130[local8] < 5000) {
					if (Static62.anInt1620 == Static36.anIntArray130[local8]) {
						arg0.aClass36_369 = Static49.method949(new Class36[] { Static20.aClass36_261, Static4.aClass36_61, Static57.method1055(Static36.anIntArray130[local8]) });
					} else {
						arg0.aClass36_369 = Static49.method949(new Class36[] { Static50.aClass36_658, Static4.aClass36_61, Static57.method1055(Static36.anIntArray130[local8]) });
					}
				} else if (Static36.anIntArray130[local8] == Static62.anInt1620) {
					arg0.aClass36_369 = Static49.method949(new Class36[] { Static20.aClass36_261, Static19.aClass36_1429, Static57.method1055(Static36.anIntArray130[local8] - 5000) });
				} else {
					arg0.aClass36_369 = Static49.method949(new Class36[] { Static50.aClass36_658, Static19.aClass36_1429, Static57.method1055(Static36.anIntArray130[local8] - 5000) });
				}
				arg0.anInt665 = 1;
			}
		} else if (local8 == 203) {
			local97 = Static7.anInt189;
			if (Static106.anInt2726 != 2) {
				local97 = 0;
			}
			arg0.anInt686 = local97 * 15 + 20;
			if (arg0.anInt686 <= arg0.anInt660) {
				arg0.anInt686 = arg0.anInt660 + 1;
			}
		} else if (local8 >= 401 && local8 <= 500) {
			local8 -= 401;
			if (local8 == 0 && Static106.anInt2726 == 0) {
				arg0.aClass36_369 = Static9.aClass36_140;
				arg0.anInt665 = 0;
			} else if (local8 == 1 && Static106.anInt2726 == 0) {
				arg0.anInt665 = 0;
				arg0.aClass36_369 = Static111.aClass36_1408;
			} else {
				local97 = Static106.anInt2724;
				if (Static106.anInt2726 == 0) {
					local97 = 0;
				}
				if (local8 >= local97) {
					arg0.anInt665 = 0;
					arg0.aClass36_369 = Static105.aClass36_1352;
				} else {
					arg0.aClass36_369 = Static114.method2077(Static4.aLongArray1[local8]).method1017();
					arg0.anInt665 = 1;
				}
			}
		} else if (local8 == 503) {
			arg0.anInt686 = Static106.anInt2724 * 15 + 20;
			if (arg0.anInt686 <= arg0.anInt660) {
				arg0.anInt686 = arg0.anInt660 + 1;
			}
		} else if (local8 == 324) {
			if (Static60.anInt1601 == -1) {
				Static112.anInt2939 = arg0.anInt656;
				Static60.anInt1601 = arg0.anInt697;
			}
			if (Static47.aClass67_1.aBoolean134) {
				arg0.anInt697 = Static60.anInt1601;
			} else {
				arg0.anInt697 = Static112.anInt2939;
			}
		} else if (local8 == 325) {
			if (Static60.anInt1601 == -1) {
				Static60.anInt1601 = arg0.anInt697;
				Static112.anInt2939 = arg0.anInt656;
			}
			if (Static47.aClass67_1.aBoolean134) {
				arg0.anInt697 = Static112.anInt2939;
			} else {
				arg0.anInt697 = Static60.anInt1601;
			}
		} else if (local8 == 327) {
			arg0.anInt672 = 150;
			arg0.anInt681 = (int) (Math.sin((double) Static113.anInt2952 / 40.0D) * 256.0D) & 0x7FF;
			arg0.anInt655 = 0;
			arg0.anInt700 = 5;
		} else if (local8 == 328) {
			arg0.anInt672 = 150;
			arg0.anInt681 = (int) (Math.sin((double) Static113.anInt2952 / 40.0D) * 256.0D) & 0x7FF;
			arg0.anInt700 = 5;
			arg0.anInt655 = 1;
		} else if (local8 == 600) {
			arg0.aClass36_369 = Static49.method949(new Class36[] { Static105.aClass36_1348, Static29.aClass36_420 });
		} else if (local8 == 620) {
			if (Static79.anInt2052 < 1) {
				arg0.aClass36_369 = Static105.aClass36_1352;
			} else if (Static66.aBoolean75) {
				arg0.anInt687 = 16711680;
				arg0.aClass36_369 = Static112.aClass36_1440;
			} else {
				arg0.aClass36_369 = Static13.aClass36_173;
				arg0.anInt687 = 16777215;
			}
		}
	}

	@OriginalMember(owner = "client!ed", name = "b", descriptor = "(Z)V")
	public static void method547() {
		aClass36_375 = null;
		aClass36_371 = null;
		aClass36_367 = null;
		aClass22_7 = null;
		anIntArray58 = null;
		aClass36_374 = null;
		aClass22_8 = null;
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(Lclient!kc;I)Z")
	public static boolean method549(@OriginalArg(0) Class36 arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(9) int local9 = 0; local9 < Static7.anInt189; local9++) {
			if (arg0.method1024(Static43.aClass36Array21[local9])) {
				return true;
			}
		}
		return arg0.method1024(Static55.aClass2_Sub1_Sub4_Sub2_Sub2_3.aClass36_1027);
	}
}
