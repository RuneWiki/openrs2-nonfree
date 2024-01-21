import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static54 {

	@OriginalMember(owner = "client!kd", name = "g", descriptor = "[I")
	public static int[] anIntArray158;

	@OriginalMember(owner = "client!kd", name = "v", descriptor = "Z")
	public static boolean aBoolean72;

	@OriginalMember(owner = "client!kd", name = "d", descriptor = "Lclient!va;")
	public static Class61 aClass61_611 = null;

	@OriginalMember(owner = "client!kd", name = "f", descriptor = "Lclient!va;")
	public static Class61 aClass61_612 = Static88.method1421("null");

	@OriginalMember(owner = "client!kd", name = "z", descriptor = "Lclient!va;")
	private static Class61 aClass61_615 = Static88.method1421("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789(Q(R\u001c1(T(U^(V(Z(X(Y)2_=)0[*U]*W;:(W@(S*X)1<)3>)4?*6*V ");

	@OriginalMember(owner = "client!kd", name = "h", descriptor = "Lclient!va;")
	public static Class61 aClass61_613 = aClass61_615;

	@OriginalMember(owner = "client!kd", name = "i", descriptor = "[Lclient!bc;")
	public static Class10_Sub1_Sub1_Sub1[] aClass10_Sub1_Sub1_Sub1Array7 = new Class10_Sub1_Sub1_Sub1[1000];

	@OriginalMember(owner = "client!kd", name = "k", descriptor = "Lclient!i;")
	public static Class29 aClass29_39 = new Class29(64);

	@OriginalMember(owner = "client!kd", name = "n", descriptor = "Z")
	public static boolean aBoolean71 = true;

	@OriginalMember(owner = "client!kd", name = "r", descriptor = "[I")
	public static int[] anIntArray159 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!kd", name = "w", descriptor = "Lclient!va;")
	public static Class61 aClass61_614 = Static88.method1421("(Y");

	@OriginalMember(owner = "client!kd", name = "F", descriptor = "Lclient!va;")
	private static Class61 aClass61_617 = Static88.method1421("Examine");

	@OriginalMember(owner = "client!kd", name = "D", descriptor = "Lclient!va;")
	public static Class61 aClass61_616 = aClass61_617;

	@OriginalMember(owner = "client!kd", name = "E", descriptor = "I")
	public static volatile int anInt1473 = 0;

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(ZI)V")
	public static void method803(@OriginalArg(1) int arg0) {
		if (Static5.aClass13_1 == null) {
			return;
		}
		if (Static80.anInt2152 != 0) {
			if (Static40.aByteArray4 == null) {
				return;
			}
			Static78.anInt2114 = arg0;
		} else if (Static55.anInt1488 >= 0) {
			Static55.anInt1488 = arg0;
			Static5.aClass13_1.method1503(arg0, 0);
			return;
		}
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(Z)V")
	public static void method804() {
		while (Static79.method1246()) {
			if (Static23.anInt752 != -1 && Static39.anInt276 == Static23.anInt752) {
				if (Static35.anInt1022 == 85 && Static15.aClass61_144.method1596() > 0) {
					Static15.aClass61_144 = Static15.aClass61_144.method1611(Static15.aClass61_144.method1596() - 1, 0);
				}
				if ((Static41.method680(Static100.anInt2667) || Static100.anInt2667 == 32) && Static15.aClass61_144.method1596() < 12) {
					Static15.aClass61_144 = Static15.aClass61_144.method1612(Static100.anInt2667);
				}
			} else {
				@Pc(150) int local150;
				if (Static32.aBoolean44) {
					if (Static35.anInt1022 == 85 && Static15.aClass61_154.method1596() > 0) {
						Static15.aClass61_154 = Static15.aClass61_154.method1611(Static15.aClass61_154.method1596() - 1, 0);
						Static7.aBoolean1 = true;
					}
					if (Static74.method1044(Static100.anInt2667) && Static15.aClass61_154.method1596() < 80) {
						Static15.aClass61_154 = Static15.aClass61_154.method1612(Static100.anInt2667);
						Static7.aBoolean1 = true;
					}
					if (Static35.anInt1022 == 84) {
						Static32.aBoolean44 = false;
						Static7.aBoolean1 = true;
						@Pc(110) long local110;
						if (Static10.anInt310 == 1) {
							local110 = Static15.aClass61_154.method1586();
							Static78.method1243(local110);
						}
						if (Static10.anInt310 == 2 && Static6.anInt70 > 0) {
							local110 = Static15.aClass61_154.method1586();
							Static65.method952(local110);
						}
						if (Static10.anInt310 == 3 && Static15.aClass61_154.method1596() > 0) {
							Static50.aClass10_Sub10_Sub1_3.method1167(125);
							Static50.aClass10_Sub10_Sub1_3.method1126(0);
							local150 = Static50.aClass10_Sub10_Sub1_3.anInt1957;
							Static50.aClass10_Sub10_Sub1_3.method1125(Static89.aLong72);
							Static17.method394(Static15.aClass61_154, Static50.aClass10_Sub10_Sub1_3);
							Static50.aClass10_Sub10_Sub1_3.method1147(Static50.aClass10_Sub10_Sub1_3.anInt1957 - local150);
							if (Static17.anInt584 == 2) {
								Static17.anInt584 = 1;
								Static75.aBoolean91 = true;
								Static50.aClass10_Sub10_Sub1_3.method1167(251);
								Static50.aClass10_Sub10_Sub1_3.method1126(Static53.anInt1449);
								Static50.aClass10_Sub10_Sub1_3.method1126(Static17.anInt584);
								Static50.aClass10_Sub10_Sub1_3.method1126(Static4.anInt25);
							}
						}
						if (Static10.anInt310 == 4 && Static80.anInt2155 < 100) {
							local110 = Static15.aClass61_154.method1586();
							Static52.method795(local110);
						}
						if (Static10.anInt310 == 5 && Static80.anInt2155 > 0) {
							local110 = Static15.aClass61_154.method1586();
							Static103.method593(local110);
						}
					}
				} else if (Static1.anInt6 == 1) {
					if (Static35.anInt1022 == 85 && Static15.aClass61_132.method1596() > 0) {
						Static15.aClass61_132 = Static15.aClass61_132.method1611(Static15.aClass61_132.method1596() - 1, 0);
						Static7.aBoolean1 = true;
					}
					if (Static106.method1671(Static100.anInt2667) && Static15.aClass61_132.method1596() < 10) {
						Static15.aClass61_132 = Static15.aClass61_132.method1612(Static100.anInt2667);
						Static7.aBoolean1 = true;
					}
					if (Static35.anInt1022 == 84) {
						if (Static15.aClass61_132.method1596() > 0) {
							local150 = 0;
							if (Static15.aClass61_132.method1621()) {
								local150 = Static15.aClass61_132.method1622();
							}
							Static50.aClass10_Sub10_Sub1_3.method1167(119);
							Static50.aClass10_Sub10_Sub1_3.method1157(local150);
						}
						Static7.aBoolean1 = true;
						Static1.anInt6 = 0;
					}
				} else if (Static1.anInt6 == 2) {
					if (Static35.anInt1022 == 85 && Static15.aClass61_132.method1596() > 0) {
						Static15.aClass61_132 = Static15.aClass61_132.method1611(Static15.aClass61_132.method1596() - 1, 0);
						Static7.aBoolean1 = true;
					}
					if ((Static41.method680(Static100.anInt2667) || Static100.anInt2667 == 32) && Static15.aClass61_132.method1596() < 12) {
						Static15.aClass61_132 = Static15.aClass61_132.method1612(Static100.anInt2667);
						Static7.aBoolean1 = true;
					}
					if (Static35.anInt1022 == 84) {
						if (Static15.aClass61_132.method1596() > 0) {
							Static50.aClass10_Sub10_Sub1_3.method1167(238);
							Static50.aClass10_Sub10_Sub1_3.method1125(Static15.aClass61_132.method1586());
						}
						Static1.anInt6 = 0;
						Static7.aBoolean1 = true;
					}
				} else if (Static1.anInt6 == 3) {
					if (Static35.anInt1022 == 85 && Static15.aClass61_132.method1596() > 0) {
						Static15.aClass61_132 = Static15.aClass61_132.method1611(Static15.aClass61_132.method1596() - 1, 0);
						Static7.aBoolean1 = true;
					}
					if (Static74.method1044(Static100.anInt2667) && Static15.aClass61_132.method1596() < 40) {
						Static15.aClass61_132 = Static15.aClass61_132.method1612(Static100.anInt2667);
						Static7.aBoolean1 = true;
					}
				} else if (Static74.anInt1871 == -1 && Static53.anInt1448 == -1) {
					if (Static35.anInt1022 == 85 && Static15.aClass61_163.method1596() > 0) {
						Static15.aClass61_163 = Static15.aClass61_163.method1611(Static15.aClass61_163.method1596() - 1, 0);
						Static7.aBoolean1 = true;
					}
					if (Static74.method1044(Static100.anInt2667) && Static15.aClass61_163.method1596() < 80) {
						Static15.aClass61_163 = Static15.aClass61_163.method1612(Static100.anInt2667);
						Static7.aBoolean1 = true;
					}
					if (Static35.anInt1022 == 84 && Static15.aClass61_163.method1596() > 0) {
						if (Static44.anInt1242 == 2) {
							if (Static15.aClass61_163.method1608(Static80.aClass61_866)) {
								Static19.method413();
							}
							if (Static15.aClass61_163.method1608(Static21.aClass61_262)) {
								Static69.aBoolean87 = true;
							}
							if (Static15.aClass61_163.method1608(Static15.aClass61_124)) {
								Static69.aBoolean87 = false;
							}
							if (Static15.aClass61_163.method1608(Static11.aClass61_86)) {
								for (local150 = 0; local150 < 4; local150++) {
									for (@Pc(409) int local409 = 1; local409 < 103; local409++) {
										for (@Pc(413) int local413 = 1; local413 < 103; local413++) {
											Static15.aClass12Array1[local150].anIntArrayArray6[local409][local413] = 0;
										}
									}
								}
							}
							if (Static15.aClass61_163.method1608(Static105.aClass61_1065) && Static30.anInt923 == 2) {
								throw new RuntimeException();
							}
							if (Static15.aClass61_163.method1608(Static46.aClass61_537)) {
								Static58.aBoolean75 = true;
							}
						}
						if (Static15.aClass61_163.method1602(Static105.aClass61_1066)) {
							Static50.aClass10_Sub10_Sub1_3.method1167(55);
							Static50.aClass10_Sub10_Sub1_3.method1126(Static15.aClass61_163.method1596() - 1);
							Static50.aClass10_Sub10_Sub1_3.method1116(Static15.aClass61_163.method1619(2));
						} else {
							@Pc(468) Class61 local468 = Static15.aClass61_163.method1613();
							@Pc(474) byte local474 = 0;
							if (local468.method1602(Static44.aClass61_513)) {
								local474 = 0;
								Static15.aClass61_163 = Static15.aClass61_163.method1619(Static44.aClass61_513.method1596());
							} else if (local468.method1602(Static41.aClass61_485)) {
								local474 = 1;
								Static15.aClass61_163 = Static15.aClass61_163.method1619(Static41.aClass61_485.method1596());
							} else if (local468.method1602(Static36.aClass61_420)) {
								local474 = 2;
								Static15.aClass61_163 = Static15.aClass61_163.method1619(Static36.aClass61_420.method1596());
							} else if (local468.method1602(Static51.aClass61_579)) {
								local474 = 3;
								Static15.aClass61_163 = Static15.aClass61_163.method1619(Static51.aClass61_579.method1596());
							} else if (local468.method1602(Static44.aClass61_516)) {
								local474 = 4;
								Static15.aClass61_163 = Static15.aClass61_163.method1619(Static44.aClass61_516.method1596());
							} else if (local468.method1602(Static47.aClass61_543)) {
								Static15.aClass61_163 = Static15.aClass61_163.method1619(Static47.aClass61_543.method1596());
								local474 = 5;
							} else if (local468.method1602(Static94.aClass61_960)) {
								Static15.aClass61_163 = Static15.aClass61_163.method1619(Static94.aClass61_960.method1596());
								local474 = 6;
							} else if (local468.method1602(Static4.aClass61_7)) {
								local474 = 7;
								Static15.aClass61_163 = Static15.aClass61_163.method1619(Static4.aClass61_7.method1596());
							} else if (local468.method1602(Static26.aClass61_697)) {
								Static15.aClass61_163 = Static15.aClass61_163.method1619(Static26.aClass61_697.method1596());
								local474 = 8;
							} else if (local468.method1602(Static57.aClass61_634)) {
								local474 = 9;
								Static15.aClass61_163 = Static15.aClass61_163.method1619(Static57.aClass61_634.method1596());
							} else if (local468.method1602(Static19.aClass61_223)) {
								local474 = 10;
								Static15.aClass61_163 = Static15.aClass61_163.method1619(Static19.aClass61_223.method1596());
							} else if (local468.method1602(Static103.aClass61_401)) {
								local474 = 11;
								Static15.aClass61_163 = Static15.aClass61_163.method1619(Static103.aClass61_401.method1596());
							}
							local468 = Static15.aClass61_163.method1613();
							@Pc(670) byte local670 = 0;
							if (local468.method1602(Static41.aClass61_486)) {
								local670 = 1;
								Static15.aClass61_163 = Static15.aClass61_163.method1619(Static41.aClass61_486.method1596());
							} else if (local468.method1602(Static70.aClass61_1079)) {
								Static15.aClass61_163 = Static15.aClass61_163.method1619(Static70.aClass61_1079.method1596());
								local670 = 2;
							} else if (local468.method1602(Static4.aClass61_3)) {
								local670 = 3;
								Static15.aClass61_163 = Static15.aClass61_163.method1619(Static4.aClass61_3.method1596());
							} else if (local468.method1602(Static80.aClass61_863)) {
								Static15.aClass61_163 = Static15.aClass61_163.method1619(Static80.aClass61_863.method1596());
								local670 = 4;
							} else if (local468.method1602(Static41.aClass61_481)) {
								local670 = 5;
								Static15.aClass61_163 = Static15.aClass61_163.method1619(Static41.aClass61_481.method1596());
							}
							Static50.aClass10_Sub10_Sub1_3.method1167(103);
							Static50.aClass10_Sub10_Sub1_3.method1126(0);
							@Pc(759) int local759 = Static50.aClass10_Sub10_Sub1_3.anInt1957;
							Static50.aClass10_Sub10_Sub1_3.method1126(local474);
							Static50.aClass10_Sub10_Sub1_3.method1126(local670);
							Static17.method394(Static15.aClass61_163, Static50.aClass10_Sub10_Sub1_3);
							Static50.aClass10_Sub10_Sub1_3.method1147(Static50.aClass10_Sub10_Sub1_3.anInt1957 - local759);
							if (Static53.anInt1449 == 2) {
								Static75.aBoolean91 = true;
								Static53.anInt1449 = 3;
								Static50.aClass10_Sub10_Sub1_3.method1167(251);
								Static50.aClass10_Sub10_Sub1_3.method1126(Static53.anInt1449);
								Static50.aClass10_Sub10_Sub1_3.method1126(Static17.anInt584);
								Static50.aClass10_Sub10_Sub1_3.method1126(Static4.anInt25);
							}
						}
						Static7.aBoolean1 = true;
						Static15.aClass61_163 = Static15.aClass61_166;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(II)Lclient!va;")
	public static Class61 method805(@OriginalArg(0) int arg0) {
		if (arg0 < 100000) {
			return Static29.method529(arg0);
		} else if (arg0 < 10000000) {
			return Static93.method1156(new Class61[] { Static29.method529(arg0 / 1000), Static52.aClass61_604 });
		} else {
			return Static93.method1156(new Class61[] { Static29.method529(arg0 / 1000000), Static37.aClass61_433 });
		}
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(I)V")
	public static void method806() {
		aClass61_614 = null;
		anIntArray159 = null;
		aClass61_611 = null;
		aClass61_617 = null;
		aClass61_615 = null;
		aClass61_613 = null;
		aClass61_616 = null;
		aClass61_612 = null;
		anIntArray158 = null;
		aClass29_39 = null;
		aClass10_Sub1_Sub1_Sub1Array7 = null;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lclient!he;Lclient!he;ILclient!he;)V")
	public static void method807(@OriginalArg(0) Class11 arg0, @OriginalArg(1) Class11 arg1, @OriginalArg(3) Class11 arg2) {
		Static70.aClass11_65 = arg2;
		Static43.aClass11_31 = arg0;
		Static93.aClass11_49 = arg1;
	}
}
