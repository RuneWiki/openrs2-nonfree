import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static8 {

	@OriginalMember(owner = "client!ai", name = "G", descriptor = "I")
	public static int anInt235;

	@OriginalMember(owner = "client!ai", name = "I", descriptor = "Lclient!nm;")
	public static Class119 aClass119_1;

	@OriginalMember(owner = "client!ai", name = "K", descriptor = "[I")
	public static int[] anIntArray20;

	@OriginalMember(owner = "client!ai", name = "N", descriptor = "F")
	public static float aFloat4 = 128.0F;

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(ILclient!nm;)V")
	public static void method141(@OriginalArg(1) Class119 arg0) {
		if (Static46.aBoolean98) {
			return;
		}
		if (Static71.aBoolean165) {
			Static93.method1761();
		} else {
			Static77.method1597();
		}
		Static13.aClass1_Sub5_Sub6_1 = Static53.method983(arg0, Static210.anInt4012);
		@Pc(19) int local19 = Static288.anInt5232;
		@Pc(25) int local25 = local19 * 956 / 503;
		Static13.aClass1_Sub5_Sub6_1.method3200((Static194.anInt3876 - local25) / 2, 0, local25, local19);
		Static277.aClass57_1 = Static217.method3525(arg0, Static188.anInt3604);
		Static277.aClass57_1.method3330(Static194.anInt3876 / 2 - Static277.aClass57_1.anInt3768 / 2, 18);
		Static46.aBoolean98 = true;
	}

	@OriginalMember(owner = "client!ai", name = "e", descriptor = "(I)V")
	public static void method142() {
		if (Static17.anInt371 == 2) {
			if (Static187.anInt3575 == Static35.anInt659 && Static136.anInt2668 == Static146.anInt3019) {
				Static17.anInt371 = 0;
				if (Static17.aBoolean36 && Static1.aBooleanArray1[81] && Static241.anInt4470 > 2) {
					Static222.method3594(Static241.anInt4470 - 2);
				} else {
					Static222.method3594(Static241.anInt4470 - 1);
				}
			}
		} else if (Static35.anInt659 == Static186.anInt3549 && Static45.anInt1043 == Static146.anInt3019) {
			Static17.anInt371 = 0;
			if (Static17.aBoolean36 && Static1.aBooleanArray1[81] && Static241.anInt4470 > 2) {
				Static222.method3594(Static241.anInt4470 - 2);
			} else {
				Static222.method3594(Static241.anInt4470 - 1);
			}
		} else {
			Static187.anInt3575 = Static186.anInt3549;
			Static136.anInt2668 = Static45.anInt1043;
			Static17.anInt371 = 2;
		}
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(Lclient!re;I)V")
	public static void method143(@OriginalArg(0) Class11_Sub4 arg0) {
		arg0.aBoolean338 = false;
		@Pc(19) Class152 local19;
		if (arg0.anInt3828 != -1) {
			local19 = Static107.method2016(arg0.anInt3828);
			if (local19 == null || local19.anIntArray509 == null) {
				arg0.anInt3828 = -1;
			} else {
				arg0.anInt3794++;
				if (local19.anIntArray509.length > arg0.anInt3799 && arg0.anInt3794 > local19.anIntArray512[arg0.anInt3799]) {
					arg0.anInt3799++;
					arg0.anInt3826++;
					arg0.anInt3794 = 1;
					Static291.method4385(local19, arg0 == Static138.aClass11_Sub4_Sub1_3, arg0.anInt3856, arg0.anInt3865, arg0.anInt3799);
				}
				if (arg0.anInt3799 >= local19.anIntArray509.length) {
					arg0.anInt3799 = 0;
					arg0.anInt3794 = 0;
					Static291.method4385(local19, arg0 == Static138.aClass11_Sub4_Sub1_3, arg0.anInt3856, arg0.anInt3865, arg0.anInt3799);
				}
				arg0.anInt3826 = arg0.anInt3799 + 1;
				if (local19.anIntArray509.length <= arg0.anInt3826) {
					arg0.anInt3826 = 0;
				}
			}
		}
		@Pc(150) Class152 local150;
		if (arg0.anInt3857 != -1 && Static167.anInt637 >= arg0.anInt3851) {
			@Pc(140) Class15 local140 = Static226.method3632(arg0.anInt3857);
			@Pc(143) int local143 = local140.anInt518;
			if (local143 == -1) {
				arg0.anInt3857 = -1;
			} else {
				label304: {
					local150 = Static107.method2016(local143);
					if (local140.aBoolean53) {
						if (local150.anInt4600 == 3) {
							if (arg0.anInt3783 > 0 && Static167.anInt637 >= arg0.anInt3867 && arg0.anInt3807 < Static167.anInt637) {
								arg0.anInt3857 = -1;
								break label304;
							}
						} else if (local150.anInt4600 == 1 && arg0.anInt3783 > 0 && arg0.anInt3867 <= Static167.anInt637 && arg0.anInt3807 < Static167.anInt637) {
							arg0.anInt3851 = Static167.anInt637 + 1;
							break label304;
						}
					}
					if (local150 == null || local150.anIntArray509 == null) {
						arg0.anInt3857 = -1;
					} else {
						if (arg0.anInt3788 < 0) {
							arg0.anInt3788 = 0;
							Static291.method4385(local150, Static138.aClass11_Sub4_Sub1_3 == arg0, arg0.anInt3856, arg0.anInt3865, 0);
						}
						arg0.anInt3795++;
						if (arg0.anInt3788 < local150.anIntArray509.length && arg0.anInt3795 > local150.anIntArray512[arg0.anInt3788]) {
							arg0.anInt3795 = 1;
							arg0.anInt3788++;
							Static291.method4385(local150, Static138.aClass11_Sub4_Sub1_3 == arg0, arg0.anInt3856, arg0.anInt3865, arg0.anInt3788);
						}
						if (arg0.anInt3788 >= local150.anIntArray509.length) {
							if (local140.aBoolean53) {
								arg0.anInt3802++;
								arg0.anInt3788 -= local150.anInt4594;
								if (arg0.anInt3802 >= local150.anInt4606) {
									arg0.anInt3857 = -1;
								} else if (arg0.anInt3788 >= 0 && arg0.anInt3788 < local150.anIntArray509.length) {
									Static291.method4385(local150, Static138.aClass11_Sub4_Sub1_3 == arg0, arg0.anInt3856, arg0.anInt3865, arg0.anInt3788);
								} else {
									arg0.anInt3857 = -1;
								}
							} else {
								arg0.anInt3857 = -1;
							}
						}
						arg0.anInt3801 = arg0.anInt3788 + 1;
						if (local150.anIntArray509.length <= arg0.anInt3801) {
							if (local140.aBoolean53) {
								arg0.anInt3801 -= local150.anInt4594;
								if (local150.anInt4606 <= arg0.anInt3802 + 1) {
									arg0.anInt3801 = -1;
								} else if (arg0.anInt3801 < 0 || local150.anIntArray509.length <= arg0.anInt3801) {
									arg0.anInt3801 = -1;
								}
							} else {
								arg0.anInt3801 = -1;
							}
						}
					}
				}
			}
		}
		if (arg0.anInt3864 != -1 && arg0.anInt3798 <= 1) {
			local19 = Static107.method2016(arg0.anInt3864);
			if (local19.anInt4600 == 3) {
				if (arg0.anInt3783 > 0 && Static167.anInt637 >= arg0.anInt3867 && Static167.anInt637 > arg0.anInt3807) {
					arg0.anInt3864 = -1;
				}
			} else if (local19.anInt4600 == 1 && arg0.anInt3783 > 0 && Static167.anInt637 >= arg0.anInt3867 && arg0.anInt3807 < Static167.anInt637) {
				arg0.anInt3798 = 2;
			}
		}
		if (arg0.anInt3864 != -1 && arg0.anInt3798 == 0) {
			local19 = Static107.method2016(arg0.anInt3864);
			if (local19 == null || local19.anIntArray509 == null) {
				arg0.anInt3864 = -1;
			} else {
				arg0.anInt3850++;
				if (local19.anIntArray509.length > arg0.anInt3847 && arg0.anInt3850 > local19.anIntArray512[arg0.anInt3847]) {
					arg0.anInt3850 = 1;
					arg0.anInt3847++;
					Static291.method4385(local19, arg0 == Static138.aClass11_Sub4_Sub1_3, arg0.anInt3856, arg0.anInt3865, arg0.anInt3847);
				}
				if (arg0.anInt3847 >= local19.anIntArray509.length) {
					arg0.anInt3789++;
					arg0.anInt3847 -= local19.anInt4594;
					if (arg0.anInt3789 >= local19.anInt4606) {
						arg0.anInt3864 = -1;
					} else if (arg0.anInt3847 >= 0 && local19.anIntArray509.length > arg0.anInt3847) {
						Static291.method4385(local19, Static138.aClass11_Sub4_Sub1_3 == arg0, arg0.anInt3856, arg0.anInt3865, arg0.anInt3847);
					} else {
						arg0.anInt3864 = -1;
					}
				}
				arg0.anInt3842 = arg0.anInt3847 + 1;
				if (local19.anIntArray509.length <= arg0.anInt3842) {
					arg0.anInt3842 -= local19.anInt4594;
					if (local19.anInt4606 <= arg0.anInt3789 + 1) {
						arg0.anInt3842 = -1;
					} else if (arg0.anInt3842 < 0 || local19.anIntArray509.length <= arg0.anInt3842) {
						arg0.anInt3842 = -1;
					}
				}
				arg0.aBoolean338 = local19.aBoolean427;
			}
		}
		if (arg0.anInt3798 > 0) {
			arg0.anInt3798--;
		}
		for (@Pc(712) int local712 = 0; local712 < arg0.aClass14Array3.length; local712++) {
			@Pc(726) Class14 local726 = arg0.aClass14Array3[local712];
			if (local726 != null) {
				if (local726.anInt489 > 0) {
					local726.anInt489--;
				} else {
					local150 = Static107.method2016(local726.anInt496);
					if (local150 == null || local150.anIntArray509 == null) {
						arg0.aClass14Array3[local712] = null;
					} else {
						local726.anInt494++;
						if (local726.anInt497 < local150.anIntArray509.length && local150.anIntArray512[local726.anInt497] < local726.anInt494) {
							local726.anInt497++;
							local726.anInt494 = 1;
							Static291.method4385(local150, Static138.aClass11_Sub4_Sub1_3 == arg0, arg0.anInt3856, arg0.anInt3865, local726.anInt497);
						}
						if (local150.anIntArray509.length <= local726.anInt497) {
							local726.anInt497 -= local150.anInt4594;
							local726.anInt501++;
							if (local726.anInt501 >= local150.anInt4606) {
								arg0.aClass14Array3[local712] = null;
							} else if (local726.anInt497 >= 0 && local726.anInt497 < local150.anIntArray509.length) {
								Static291.method4385(local150, Static138.aClass11_Sub4_Sub1_3 == arg0, arg0.anInt3856, arg0.anInt3865, local726.anInt497);
							} else {
								arg0.aClass14Array3[local712] = null;
							}
						}
						local726.anInt498 = local726.anInt497 + 1;
						if (local150.anIntArray509.length <= local726.anInt498) {
							local726.anInt498 -= local150.anInt4594;
							if (local726.anInt501 + 1 >= local150.anInt4606) {
								local726.anInt498 = -1;
							} else if (local726.anInt498 < 0 || local726.anInt498 >= local150.anIntArray509.length) {
								local726.anInt498 = -1;
							}
						}
					}
				}
			}
		}
	}
}
