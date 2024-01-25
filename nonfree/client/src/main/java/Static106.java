import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static106 {

	@OriginalMember(owner = "client!gb", name = "o", descriptor = "Lclient!pf;")
	public static final Class157 aClass157_77 = new Class157(81, 2);

	@OriginalMember(owner = "client!gb", name = "t", descriptor = "[I")
	public static final int[] anIntArray174 = new int[] { 0, 4, 3, 3, 1, 1, 3, 5, 1, 5, 3, 6, 4 };

	@OriginalMember(owner = "client!gb", name = "u", descriptor = "Lclient!nn;")
	public static final Class140 aClass140_56 = new Class140("Loading title screen - ", "Lade Titelbild - ", "Chargement de l'écran-titre - ", "Carregando tela título - ");

	@OriginalMember(owner = "client!gb", name = "v", descriptor = "[I")
	public static final int[] anIntArray175 = new int[] { 0, 1, 2, 3, 4, 5, 6, 14 };

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(B[I)Ljava/lang/String;")
	public static String method2086(@OriginalArg(1) int[] arg0) {
		@Pc(16) StringBuffer local16 = new StringBuffer();
		@Pc(18) int local18 = Static231.anInt4996;
		for (@Pc(20) int local20 = 0; local20 < arg0.length; local20++) {
			@Pc(28) Class21 local28 = Static13.method189(arg0[local20]);
			if (local28.anInt394 != -1) {
				@Pc(40) Class46 local40 = (Class46) Static345.aClass107_56.method3021((long) local28.anInt394);
				if (local40 == null) {
					@Pc(48) Class40 local48 = Static368.method843(Static338.aClass104_184, local28.anInt394, 0);
					if (local48 != null) {
						local40 = Static51.aClass37_1.method3708(local48);
						Static345.aClass107_56.method3018((long) local28.anInt394, local40);
					}
				}
				if (local40 != null) {
					Static65.aClass46Array24[local18] = local40;
					local16.append(" <img=").append(local18).append(">");
					local18++;
				}
			}
		}
		return local16.toString();
	}

	@OriginalMember(owner = "client!gb", name = "b", descriptor = "(B)Z")
	public static boolean method2087() {
		return Static225.anInt4918 > 0;
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(ILclient!ef;)V")
	public static void method2088(@OriginalArg(1) Class2_Sub12 arg0) {
		if (arg0.aByteArray30.length - arg0.anInt3606 < 1) {
			return;
		}
		@Pc(20) int local20 = arg0.method3124();
		if (local20 < 0 || local20 > 15) {
			return;
		}
		@Pc(46) byte local46;
		if (local20 == 15) {
			local46 = 37;
		} else if (local20 == 14) {
			local46 = 36;
		} else if (local20 == 13) {
			local46 = 35;
		} else if (local20 == 12) {
			local46 = 34;
		} else if (local20 == 11) {
			local46 = 33;
		} else if (local20 == 10) {
			local46 = 32;
		} else if (local20 == 9) {
			local46 = 31;
		} else if (local20 == 8) {
			local46 = 30;
		} else if (local20 == 7) {
			local46 = 29;
		} else if (local20 == 6) {
			local46 = 28;
		} else if (local20 == 5) {
			local46 = 28;
		} else if (local20 == 4) {
			local46 = 24;
		} else if (local20 == 3) {
			local46 = 23;
		} else if (local20 == 2) {
			local46 = 22;
		} else if (local20 == 1) {
			local46 = 23;
		} else {
			local46 = 19;
		}
		if (arg0.aByteArray30.length - arg0.anInt3606 < local46) {
			return;
		}
		Static333.anInt6458 = arg0.method3124();
		if (Static333.anInt6458 < 1) {
			Static333.anInt6458 = 1;
		} else if (Static333.anInt6458 > 4) {
			Static333.anInt6458 = 4;
		}
		Static243.method4364(arg0.method3124() == 1);
		Static346.aBoolean526 = arg0.method3124() == 1;
		Static146.aBoolean287 = arg0.method3124() == 1;
		Static205.aBoolean391 = arg0.method3124() == 1;
		Static360.anInt6856 = arg0.method3124() == 1 ? 1 : 0;
		Static273.aBoolean494 = arg0.method3124() == 1;
		Static219.aBoolean425 = arg0.method3124() == 1;
		Static39.aBoolean48 = arg0.method3124() == 1;
		Static222.anInt6836 = arg0.method3124();
		if (Static222.anInt6836 > 2) {
			Static222.anInt6836 = 2;
		}
		if (local20 >= 2) {
			Static309.aBoolean544 = arg0.method3124() == 1;
		} else {
			Static309.aBoolean544 = arg0.method3124() == 1;
			arg0.method3124();
		}
		Static134.aBoolean271 = arg0.method3124() == 1;
		Static245.aBoolean453 = arg0.method3124() == 1;
		Static207.anInt4534 = arg0.method3124();
		if (Static207.anInt4534 > 2) {
			Static207.anInt4534 = 2;
		}
		Static181.anInt4031 = Static207.anInt4534;
		Static145.aBoolean285 = arg0.method3124() == 1;
		Static17.anInt277 = arg0.method3124();
		if (Static17.anInt277 > 127) {
			Static17.anInt277 = 127;
		}
		Static241.anInt5136 = arg0.method3124();
		Static46.anInt752 = arg0.method3124();
		if (Static46.anInt752 > 127) {
			Static46.anInt752 = 127;
		}
		if (local20 >= 1) {
			Static128.anInt2762 = arg0.method3104();
			Static218.anInt4842 = arg0.method3104();
		}
		if (local20 >= 3 && local20 < 6) {
			arg0.method3124();
		}
		@Pc(413) int local413;
		if (local20 >= 4) {
			local413 = arg0.method3124();
			if (local413 < 0 || local413 > 2) {
				local413 = 0;
			}
			if (Static147.anInt3175 < 96) {
				local413 = 0;
			}
			Static24.method873(local413);
		}
		if (local20 >= 5) {
			Static352.anInt6763 = arg0.method3135();
		}
		local413 = 0;
		if (local20 >= 6) {
			Static313.anInt6146 = local413 = arg0.method3124();
		}
		if (Static313.anInt6146 != 1 && Static313.anInt6146 != 2) {
			Static313.anInt6146 = 2;
		}
		if (local20 >= 7) {
			Static353.aBoolean525 = arg0.method3124() == 1;
		}
		if (local20 >= 8) {
			Static311.aBoolean549 = arg0.method3124() == 1;
		}
		if (local20 >= 9) {
			Static248.anInt5206 = arg0.method3124();
		}
		if (Static248.anInt5206 < 0 || Static248.anInt5206 > Static130.method2513(Static147.anInt3175)) {
			Static248.anInt5206 = 0;
		}
		if (local20 >= 10) {
			Static363.aBoolean618 = arg0.method3124() != 0;
		}
		if (local20 >= 11) {
			Static204.aBoolean384 = arg0.method3124() != 0;
		}
		if (local20 >= 12) {
			Static360.anInt6856 = arg0.method3124();
		}
		if (Static360.anInt6856 < 0 || Static360.anInt6856 > 2) {
			Static360.anInt6856 = 1;
		}
		if (local20 >= 13) {
			Static243.aBoolean451 = arg0.method3124() == 1;
		}
		if (local20 >= 14) {
			Static18.anInt304 = arg0.method3124();
		} else if (local413 == 0) {
			Static18.anInt304 = 2;
		} else {
			Static18.anInt304 = 1;
		}
		if (Static18.anInt304 < 0 || Static18.anInt304 > 3) {
			Static18.anInt304 = 2;
		}
		if (local20 >= 15) {
			Static168.anInt3821 = arg0.method3124();
			if (Static168.anInt3821 < 0 || Static168.anInt3821 > 4) {
				Static168.anInt3821 = Static190.anInt6229 == 1 ? 2 : 4;
			}
		}
	}
}
