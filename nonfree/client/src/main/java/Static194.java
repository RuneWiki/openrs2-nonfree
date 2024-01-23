import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static194 {

	@OriginalMember(owner = "client!ol", name = "j", descriptor = "Ljava/lang/String;")
	public static String aString136;

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "Ljava/lang/String;")
	public static String aString135 = "flash1:";

	@OriginalMember(owner = "client!ol", name = "b", descriptor = "Lclient!tl;")
	public static Class155 aClass155_36 = new Class155(30);

	@OriginalMember(owner = "client!ol", name = "f", descriptor = "I")
	public static int anInt4389 = -1;

	@OriginalMember(owner = "client!ol", name = "s", descriptor = "[C")
	public static char[] aCharArray5 = new char[] { '€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ' };

	@OriginalMember(owner = "client!ol", name = "u", descriptor = "Ljava/lang/String;")
	public static String aString137 = "glow1:";

	@OriginalMember(owner = "client!ol", name = "e", descriptor = "(I)V")
	public static void method3446() {
		Static55.method1119();
		Static253.aClass1_Sub2_Sub14_9 = null;
		Static33.anInt870 = -1;
		Static91.method1596();
		Static276.aClass125_12.method3666();
		Static9.aClass98_1 = new Class98();
		((Class2_Sub1) Static151.anInterface2_1).method4428();
		Static248.method4250();
		Static67.aClass103Array1 = new Class103[255];
		Static67.anInt1749 = 0;
		Static29.method635();
		Static124.method2116();
		Static81.method1457();
		Static240.method4148(false);
		Static247.method4245();
		Static159.method2996();
		for (@Pc(48) int local48 = 0; local48 < 2048; local48++) {
			@Pc(57) Class25_Sub1_Sub1 local57 = Static271.aClass25_Sub1_Sub1Array1[local48];
			if (local57 != null) {
				local57.anObject5 = null;
			}
		}
		if (Static296.aBoolean335) {
			Static124.method2115();
			Static115.method1896(Static28.aBoolean42);
			Static155.method2874();
		}
		Static28.method537(Static259.aClass83_179, Static33.aClass83_20);
		Static130.method2199(Static33.aClass83_20);
		Static188.aClass1_Sub2_Sub14_4 = null;
		Static156.aClass1_Sub2_Sub14_3 = null;
		Static270.aClass1_Sub2_Sub14_10 = null;
		Static38.aClass1_Sub2_Sub14_1 = null;
		Static217.aClass1_Sub2_Sub14_6 = null;
		if (Static279.anInt5968 == 5) {
			Static23.method396(Static33.aClass83_20);
		}
		if (Static279.anInt5968 == 10) {
			Static102.method1683(false);
		}
		if (Static279.anInt5968 == 30) {
			Static140.method2511(25);
		}
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(ILclient!lg;)V")
	public static void method3448(@OriginalArg(1) Class25_Sub1 arg0) {
		arg0.aBoolean86 = false;
		@Pc(16) Class163 local16;
		if (arg0.anInt1646 != -1) {
			local16 = Static115.method1895(arg0.anInt1646);
			if (local16 == null || local16.anIntArray587 == null) {
				arg0.anInt1646 = -1;
			} else {
				arg0.anInt1648++;
				if (arg0.anInt1640 < local16.anIntArray587.length && local16.anIntArray589[arg0.anInt1640] < arg0.anInt1648) {
					arg0.anInt1648 = 1;
					arg0.anInt1640++;
					arg0.anInt1677++;
					Static188.method3369(arg0.anInt1604, local16, arg0.anInt1640, arg0.anInt1635, Static239.aClass25_Sub1_Sub1_2 == arg0);
				}
				if (arg0.anInt1640 >= local16.anIntArray587.length) {
					arg0.anInt1648 = 0;
					arg0.anInt1640 = 0;
					Static188.method3369(arg0.anInt1604, local16, arg0.anInt1640, arg0.anInt1635, Static239.aClass25_Sub1_Sub1_2 == arg0);
				}
				arg0.anInt1677 = arg0.anInt1640 + 1;
				if (local16.anIntArray587.length <= arg0.anInt1677) {
					arg0.anInt1677 = 0;
				}
			}
		}
		@Pc(154) Class163 local154;
		if (arg0.anInt1669 != -1 && Static32.anInt809 >= arg0.anInt1605) {
			@Pc(142) Class139 local142 = Static43.method942(arg0.anInt1669);
			@Pc(145) int local145 = local142.anInt5107;
			if (local145 == -1) {
				arg0.anInt1669 = -1;
			} else {
				label307: {
					local154 = Static115.method1895(local145);
					if (local142.aBoolean277) {
						if (local154.anInt5908 == 3) {
							if (arg0.anInt1652 > 0 && arg0.anInt1633 <= Static32.anInt809 && Static32.anInt809 > arg0.anInt1630) {
								arg0.anInt1669 = -1;
								break label307;
							}
						} else if (local154.anInt5908 == 1 && arg0.anInt1652 > 0 && Static32.anInt809 >= arg0.anInt1633 && Static32.anInt809 > arg0.anInt1630) {
							arg0.anInt1605 = Static32.anInt809 + 1;
							break label307;
						}
					}
					if (local154 == null || local154.anIntArray587 == null) {
						arg0.anInt1669 = -1;
					} else {
						if (arg0.anInt1616 < 0) {
							arg0.anInt1616 = 0;
							Static188.method3369(arg0.anInt1604, local154, 0, arg0.anInt1635, Static239.aClass25_Sub1_Sub1_2 == arg0);
						}
						arg0.anInt1645++;
						if (local154.anIntArray587.length > arg0.anInt1616 && local154.anIntArray589[arg0.anInt1616] < arg0.anInt1645) {
							arg0.anInt1645 = 1;
							arg0.anInt1616++;
							Static188.method3369(arg0.anInt1604, local154, arg0.anInt1616, arg0.anInt1635, Static239.aClass25_Sub1_Sub1_2 == arg0);
						}
						if (local154.anIntArray587.length <= arg0.anInt1616) {
							if (local142.aBoolean277) {
								arg0.anInt1616 -= local154.anInt5904;
								arg0.anInt1636++;
								if (local154.anInt5903 <= arg0.anInt1636) {
									arg0.anInt1669 = -1;
								} else if (arg0.anInt1616 >= 0 && arg0.anInt1616 < local154.anIntArray587.length) {
									Static188.method3369(arg0.anInt1604, local154, arg0.anInt1616, arg0.anInt1635, Static239.aClass25_Sub1_Sub1_2 == arg0);
								} else {
									arg0.anInt1669 = -1;
								}
							} else {
								arg0.anInt1669 = -1;
							}
						}
						arg0.anInt1671 = arg0.anInt1616 + 1;
						if (local154.anIntArray587.length <= arg0.anInt1671) {
							if (local142.aBoolean277) {
								arg0.anInt1671 -= local154.anInt5904;
								if (arg0.anInt1636 + 1 >= local154.anInt5903) {
									arg0.anInt1671 = -1;
								} else if (arg0.anInt1671 < 0 || local154.anIntArray587.length <= arg0.anInt1671) {
									arg0.anInt1671 = -1;
								}
							} else {
								arg0.anInt1671 = -1;
							}
						}
					}
				}
			}
		}
		if (arg0.anInt1625 != -1 && arg0.anInt1653 <= 1) {
			local16 = Static115.method1895(arg0.anInt1625);
			if (local16.anInt5908 == 3) {
				if (arg0.anInt1652 > 0 && arg0.anInt1633 <= Static32.anInt809 && arg0.anInt1630 < Static32.anInt809) {
					arg0.anInt1625 = -1;
				}
			} else if (local16.anInt5908 == 1 && arg0.anInt1652 > 0 && arg0.anInt1633 <= Static32.anInt809 && arg0.anInt1630 < Static32.anInt809) {
				arg0.anInt1653 = 1;
			}
		}
		if (arg0.anInt1625 != -1 && arg0.anInt1653 == 0) {
			local16 = Static115.method1895(arg0.anInt1625);
			if (local16 == null || local16.anIntArray587 == null) {
				arg0.anInt1625 = -1;
			} else {
				arg0.anInt1614++;
				if (local16.anIntArray587.length > arg0.anInt1608 && arg0.anInt1614 > local16.anIntArray589[arg0.anInt1608]) {
					arg0.anInt1614 = 1;
					arg0.anInt1608++;
					Static188.method3369(arg0.anInt1604, local16, arg0.anInt1608, arg0.anInt1635, arg0 == Static239.aClass25_Sub1_Sub1_2);
				}
				if (local16.anIntArray587.length <= arg0.anInt1608) {
					arg0.anInt1608 -= local16.anInt5904;
					arg0.anInt1670++;
					if (local16.anInt5903 <= arg0.anInt1670) {
						arg0.anInt1625 = -1;
					} else if (arg0.anInt1608 >= 0 && local16.anIntArray587.length > arg0.anInt1608) {
						Static188.method3369(arg0.anInt1604, local16, arg0.anInt1608, arg0.anInt1635, arg0 == Static239.aClass25_Sub1_Sub1_2);
					} else {
						arg0.anInt1625 = -1;
					}
				}
				arg0.anInt1619 = arg0.anInt1608 + 1;
				if (arg0.anInt1619 >= local16.anIntArray587.length) {
					arg0.anInt1619 -= local16.anInt5904;
					if (arg0.anInt1670 + 1 >= local16.anInt5903) {
						arg0.anInt1619 = -1;
					} else if (arg0.anInt1619 < 0 || arg0.anInt1619 >= local16.anIntArray587.length) {
						arg0.anInt1619 = -1;
					}
				}
				arg0.aBoolean86 = local16.aBoolean315;
			}
		}
		if (arg0.anInt1653 > 0) {
			arg0.anInt1653--;
		}
		for (@Pc(734) int local734 = 0; local734 < arg0.aClass86Array3.length; local734++) {
			@Pc(748) Class86 local748 = arg0.aClass86Array3[local734];
			if (local748 != null) {
				if (local748.anInt3232 > 0) {
					local748.anInt3232--;
				} else {
					local154 = Static115.method1895(local748.anInt3241);
					if (local154 == null || local154.anIntArray587 == null) {
						arg0.aClass86Array3[local734] = null;
					} else {
						local748.anInt3239++;
						if (local748.anInt3242 < local154.anIntArray587.length && local748.anInt3239 > local154.anIntArray589[local748.anInt3242]) {
							local748.anInt3239 = 1;
							local748.anInt3242++;
							Static188.method3369(arg0.anInt1604, local154, local748.anInt3242, arg0.anInt1635, arg0 == Static239.aClass25_Sub1_Sub1_2);
						}
						if (local748.anInt3242 >= local154.anIntArray587.length) {
							local748.anInt3240++;
							local748.anInt3242 -= local154.anInt5904;
							if (local748.anInt3240 >= local154.anInt5903) {
								arg0.aClass86Array3[local734] = null;
							} else if (local748.anInt3242 >= 0 && local748.anInt3242 < local154.anIntArray587.length) {
								Static188.method3369(arg0.anInt1604, local154, local748.anInt3242, arg0.anInt1635, arg0 == Static239.aClass25_Sub1_Sub1_2);
							} else {
								arg0.aClass86Array3[local734] = null;
							}
						}
						local748.anInt3236 = local748.anInt3242 + 1;
						if (local154.anIntArray587.length <= local748.anInt3236) {
							local748.anInt3236 -= local154.anInt5904;
							if (local154.anInt5903 <= local748.anInt3240 + 1) {
								local748.anInt3236 = -1;
							} else if (local748.anInt3236 < 0 || local154.anIntArray587.length <= local748.anInt3236) {
								local748.anInt3236 = -1;
							}
						}
					}
				}
			}
		}
	}
}
