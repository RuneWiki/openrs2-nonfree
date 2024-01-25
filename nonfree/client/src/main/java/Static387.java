import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static387 {

	@OriginalMember(owner = "client!oq", name = "t", descriptor = "[I")
	public static int[] anIntArray522 = new int[1];

	@OriginalMember(owner = "client!oq", name = "y", descriptor = "[I")
	public static final int[] anIntArray523 = new int[3];

	@OriginalMember(owner = "client!oq", name = "A", descriptor = "[I")
	public static final int[] anIntArray524 = new int[] { 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 120 };

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(BLclient!ua;ILclient!vg;IIILclient!f;)V")
	public static void method5334(@OriginalArg(1) Class204 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class341 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class22 arg6) {
		if (arg6 == null) {
			return;
		}
		@Pc(19) int local19;
		if (Static340.anInt5707 == 4) {
			local19 = (int) Static167.aFloat59 & 0x3FFF;
		} else {
			local19 = (int) Static167.aFloat59 + Static548.anInt8574 & 0x3FFF;
		}
		@Pc(41) int local41 = Math.max(arg2.anInt9300 / 2, arg2.anInt9248 / 2) + 10;
		@Pc(49) int local49 = arg1 * arg1 + arg5 * arg5;
		if (local49 > local41 * local41) {
			return;
		}
		@Pc(63) int local63 = Class1_Sub6_Sub2.anIntArray675[local19];
		@Pc(67) int local67 = Class1_Sub6_Sub2.anIntArray676[local19];
		if (Static340.anInt5707 != 4) {
			local63 = local63 * 256 / (Static348.anInt5786 + 256);
			local67 = local67 * 256 / (Static348.anInt5786 + 256);
		}
		@Pc(98) int local98 = local67 * arg1 + arg5 * local63 >> 14;
		@Pc(108) int local108 = arg5 * local67 - local63 * arg1 >> 14;
		arg6.method7663(local98 + arg4 + arg2.anInt9300 / 2 - arg6.A() / 2, -local108 + arg3 - -(arg2.anInt9248 / 2) + -(arg6.ca() / 2), arg0, arg4, arg3);
	}

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(Lclient!vq;I)V")
	public static void method5337(@OriginalArg(0) Class8_Sub3_Sub3_Sub1 arg0) {
		@Pc(13) Class290 local13;
		if (arg0.anInt6829 != -1) {
			local13 = Static192.aClass211_1.method4277(arg0.anInt6829);
			if (local13 == null || local13.anIntArray604 == null) {
				arg0.aBoolean553 = false;
				arg0.anInt6829 = -1;
			} else {
				label390: {
					arg0.anInt6826++;
					if (arg0.anInt6800 < local13.anIntArray604.length && local13.anIntArray603[arg0.anInt6800] < arg0.anInt6826) {
						arg0.anInt6800++;
						arg0.anInt6826 = 1;
						arg0.anInt6814++;
						Static137.method2090(local13, arg0.anInt9365, arg0.anInt6800, arg0 == Static93.aClass8_Sub3_Sub3_Sub1_Sub1_1, arg0.anInt9370, arg0.aByte123);
					}
					if (arg0.anInt6800 >= local13.anIntArray604.length) {
						arg0.anInt6826 = 0;
						arg0.anInt6800 = 0;
						if (arg0.aBoolean553) {
							arg0.anInt6829 = arg0.method5425().method2953();
							if (arg0.anInt6829 == -1) {
								arg0.aBoolean553 = false;
								break label390;
							}
							local13 = Static192.aClass211_1.method4277(arg0.anInt6829);
						}
						Static137.method2090(local13, arg0.anInt9365, arg0.anInt6800, arg0 == Static93.aClass8_Sub3_Sub3_Sub1_Sub1_1, arg0.anInt9370, arg0.aByte123);
					}
					arg0.anInt6814 = arg0.anInt6800 + 1;
					if (local13.anIntArray604.length <= arg0.anInt6814) {
						arg0.anInt6814 = 0;
					}
				}
			}
		}
		@Pc(178) int local178;
		@Pc(187) Class290 local187;
		@Pc(175) Class60 local175;
		if (arg0.anInt6830 != -1 && arg0.anInt6797 <= Static301.anInt5197) {
			local175 = Static107.aClass200_3.method3956(arg0.anInt6830);
			local178 = local175.anInt1383;
			if (local178 == -1) {
				arg0.anInt6830 = -1;
			} else {
				label392: {
					local187 = Static192.aClass211_1.method4277(local178);
					if (local175.aBoolean111) {
						if (local187.anInt7805 == 3) {
							if (arg0.anInt6858 > 0 && arg0.anInt6779 <= Static301.anInt5197 && arg0.anInt6810 < Static301.anInt5197) {
								arg0.anInt6830 = -1;
								break label392;
							}
						} else if (local187.anInt7805 == 1 && arg0.anInt6858 > 0 && Static301.anInt5197 >= arg0.anInt6779 && arg0.anInt6810 < Static301.anInt5197) {
							arg0.anInt6797 = Static301.anInt5197 + 1;
							break label392;
						}
					}
					if (local187 == null || local187.anIntArray604 == null) {
						arg0.anInt6830 = -1;
					} else {
						if (arg0.anInt6801 < 0) {
							arg0.anInt6801 = 0;
							Static137.method2090(local187, arg0.anInt9365, 0, Static93.aClass8_Sub3_Sub3_Sub1_Sub1_1 == arg0, arg0.anInt9370, arg0.aByte123);
						}
						arg0.anInt6802++;
						if (arg0.anInt6801 < local187.anIntArray604.length && local187.anIntArray603[arg0.anInt6801] < arg0.anInt6802) {
							arg0.anInt6802 = 1;
							arg0.anInt6801++;
							Static137.method2090(local187, arg0.anInt9365, arg0.anInt6801, arg0 == Static93.aClass8_Sub3_Sub3_Sub1_Sub1_1, arg0.anInt9370, arg0.aByte123);
						}
						if (local187.anIntArray604.length <= arg0.anInt6801) {
							if (local175.aBoolean111) {
								arg0.anInt6823++;
								arg0.anInt6801 -= local187.anInt7806;
								if (arg0.anInt6823 >= local187.anInt7800) {
									arg0.anInt6830 = -1;
								} else if (arg0.anInt6801 >= 0 && arg0.anInt6801 < local187.anIntArray604.length) {
									Static137.method2090(local187, arg0.anInt9365, arg0.anInt6801, Static93.aClass8_Sub3_Sub3_Sub1_Sub1_1 == arg0, arg0.anInt9370, arg0.aByte123);
								} else {
									arg0.anInt6830 = -1;
								}
							} else {
								arg0.anInt6830 = -1;
							}
						}
						arg0.anInt6775 = arg0.anInt6801 + 1;
						if (local187.anIntArray604.length <= arg0.anInt6775) {
							if (local175.aBoolean111) {
								arg0.anInt6775 -= local187.anInt7806;
								if (local187.anInt7800 <= arg0.anInt6823 + 1) {
									arg0.anInt6775 = -1;
								} else if (arg0.anInt6775 < 0 || arg0.anInt6775 >= local187.anIntArray604.length) {
									arg0.anInt6775 = -1;
								}
							} else {
								arg0.anInt6775 = -1;
							}
						}
					}
				}
			}
		}
		if (arg0.anInt6782 != -1 && Static301.anInt5197 >= arg0.anInt6784) {
			local175 = Static107.aClass200_3.method3956(arg0.anInt6782);
			local178 = local175.anInt1383;
			if (local178 == -1) {
				arg0.anInt6782 = -1;
			} else {
				label396: {
					local187 = Static192.aClass211_1.method4277(local178);
					if (local175.aBoolean111) {
						if (local187.anInt7805 == 3) {
							if (arg0.anInt6858 > 0 && Static301.anInt5197 >= arg0.anInt6779 && arg0.anInt6810 < Static301.anInt5197) {
								arg0.anInt6782 = -1;
								break label396;
							}
						} else if (local187.anInt7805 == 1 && arg0.anInt6858 > 0 && Static301.anInt5197 >= arg0.anInt6779 && Static301.anInt5197 > arg0.anInt6810) {
							arg0.anInt6784 = Static301.anInt5197 + 1;
							break label396;
						}
					}
					if (local187 == null || local187.anIntArray604 == null) {
						arg0.anInt6782 = -1;
					} else {
						if (arg0.anInt6807 < 0) {
							arg0.anInt6807 = 0;
							Static137.method2090(local187, arg0.anInt9365, 0, arg0 == Static93.aClass8_Sub3_Sub3_Sub1_Sub1_1, arg0.anInt9370, arg0.aByte123);
						}
						arg0.anInt6838++;
						if (arg0.anInt6807 < local187.anIntArray604.length && local187.anIntArray603[arg0.anInt6807] < arg0.anInt6838) {
							arg0.anInt6807++;
							arg0.anInt6838 = 1;
							Static137.method2090(local187, arg0.anInt9365, arg0.anInt6807, Static93.aClass8_Sub3_Sub3_Sub1_Sub1_1 == arg0, arg0.anInt9370, arg0.aByte123);
						}
						if (local187.anIntArray604.length <= arg0.anInt6807) {
							if (local175.aBoolean111) {
								arg0.anInt6807 -= local187.anInt7806;
								arg0.anInt6783++;
								if (local187.anInt7800 <= arg0.anInt6783) {
									arg0.anInt6782 = -1;
								} else if (arg0.anInt6807 >= 0 && arg0.anInt6807 < local187.anIntArray604.length) {
									Static137.method2090(local187, arg0.anInt9365, arg0.anInt6807, Static93.aClass8_Sub3_Sub3_Sub1_Sub1_1 == arg0, arg0.anInt9370, arg0.aByte123);
								} else {
									arg0.anInt6782 = -1;
								}
							} else {
								arg0.anInt6782 = -1;
							}
						}
						arg0.anInt6848 = arg0.anInt6807 + 1;
						if (arg0.anInt6848 >= local187.anIntArray604.length) {
							if (local175.aBoolean111) {
								arg0.anInt6848 -= local187.anInt7806;
								if (local187.anInt7800 <= arg0.anInt6783 + 1) {
									arg0.anInt6848 = -1;
								} else if (arg0.anInt6848 < 0 || arg0.anInt6848 >= local187.anIntArray604.length) {
									arg0.anInt6848 = -1;
								}
							} else {
								arg0.anInt6848 = -1;
							}
						}
					}
				}
			}
		}
		if (arg0.anInt6822 != -1 && arg0.anInt6785 <= 1) {
			local13 = Static192.aClass211_1.method4277(arg0.anInt6822);
			if (local13.anInt7805 == 3) {
				if (arg0.anInt6858 > 0 && Static301.anInt5197 >= arg0.anInt6779 && arg0.anInt6810 < Static301.anInt5197) {
					arg0.anIntArray532 = null;
					arg0.anInt6822 = -1;
				}
			} else if (local13.anInt7805 == 1 && arg0.anInt6858 > 0 && Static301.anInt5197 >= arg0.anInt6779 && arg0.anInt6810 < Static301.anInt5197) {
				arg0.anInt6785 = 2;
			}
		}
		if (arg0.anInt6822 != -1 && arg0.anInt6785 == 0) {
			local13 = Static192.aClass211_1.method4277(arg0.anInt6822);
			if (local13 == null || local13.anIntArray604 == null) {
				arg0.anInt6822 = -1;
				arg0.anIntArray532 = null;
			} else {
				arg0.anInt6849++;
				if (local13.anIntArray604.length > arg0.anInt6803 && arg0.anInt6849 > local13.anIntArray603[arg0.anInt6803]) {
					arg0.anInt6803++;
					arg0.anInt6849 = 1;
					Static137.method2090(local13, arg0.anInt9365, arg0.anInt6803, Static93.aClass8_Sub3_Sub3_Sub1_Sub1_1 == arg0, arg0.anInt9370, arg0.aByte123);
				}
				if (local13.anIntArray604.length <= arg0.anInt6803) {
					arg0.anInt6803 -= local13.anInt7806;
					arg0.anInt6850++;
					if (arg0.anInt6850 >= local13.anInt7800) {
						arg0.anInt6822 = -1;
						arg0.anIntArray532 = null;
					} else if (arg0.anInt6803 >= 0 && local13.anIntArray604.length > arg0.anInt6803) {
						Static137.method2090(local13, arg0.anInt9365, arg0.anInt6803, Static93.aClass8_Sub3_Sub3_Sub1_Sub1_1 == arg0, arg0.anInt9370, arg0.aByte123);
					} else {
						arg0.anInt6822 = -1;
						arg0.anIntArray532 = null;
					}
				}
				arg0.anInt6825 = arg0.anInt6803 + 1;
				if (arg0.anInt6825 >= local13.anIntArray604.length) {
					arg0.anInt6825 -= local13.anInt7806;
					if (arg0.anInt6850 + 1 >= local13.anInt7800) {
						arg0.anInt6825 = -1;
					} else if (arg0.anInt6825 < 0 || local13.anIntArray604.length <= arg0.anInt6825) {
						arg0.anInt6825 = -1;
					}
				}
			}
		}
		if (arg0.anInt6785 > 0) {
			arg0.anInt6785--;
		}
		for (@Pc(1081) int local1081 = 0; local1081 < arg0.aClass255Array3.length; local1081++) {
			@Pc(1088) Class255 local1088 = arg0.aClass255Array3[local1081];
			if (local1088 != null) {
				if (local1088.anInt6887 > 0) {
					local1088.anInt6887--;
				} else {
					local187 = Static192.aClass211_1.method4277(local1088.anInt6889);
					if (local187 == null || local187.anIntArray604 == null) {
						arg0.aClass255Array3[local1081] = null;
					} else {
						local1088.anInt6893++;
						if (local187.anIntArray604.length > local1088.anInt6888 && local1088.anInt6893 > local187.anIntArray603[local1088.anInt6888]) {
							local1088.anInt6888++;
							local1088.anInt6893 = 1;
							Static137.method2090(local187, arg0.anInt9365, local1088.anInt6888, arg0 == Static93.aClass8_Sub3_Sub3_Sub1_Sub1_1, arg0.anInt9370, arg0.aByte123);
						}
						if (local187.anIntArray604.length <= local1088.anInt6888) {
							local1088.anInt6896++;
							local1088.anInt6888 -= local187.anInt7806;
							if (local187.anInt7800 <= local1088.anInt6896) {
								arg0.aClass255Array3[local1081] = null;
							} else if (local1088.anInt6888 >= 0 && local187.anIntArray604.length > local1088.anInt6888) {
								Static137.method2090(local187, arg0.anInt9365, local1088.anInt6888, arg0 == Static93.aClass8_Sub3_Sub3_Sub1_Sub1_1, arg0.anInt9370, arg0.aByte123);
							} else {
								arg0.aClass255Array3[local1081] = null;
							}
						}
						local1088.anInt6897 = local1088.anInt6888 + 1;
						if (local187.anIntArray604.length <= local1088.anInt6897) {
							local1088.anInt6897 -= local187.anInt7806;
							if (local1088.anInt6896 + 1 >= local187.anInt7800) {
								local1088.anInt6897 = -1;
							} else if (local1088.anInt6897 < 0 || local187.anIntArray604.length <= local1088.anInt6897) {
								local1088.anInt6897 = -1;
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(BLclient!vg;)V")
	public static void method5342(@OriginalArg(1) Class341 arg0) {
		if (Static367.anInt6096 != arg0.anInt9297) {
			return;
		}
		if (Static93.aClass8_Sub3_Sub3_Sub1_Sub1_1.aString16 == null) {
			arg0.anInt9261 = 0;
			arg0.anInt9322 = 0;
			return;
		}
		arg0.anInt9269 = 150;
		arg0.anInt9323 = (int) (Math.sin((double) Static301.anInt5197 / 40.0D) * 256.0D) & 0x7FF;
		arg0.anInt9280 = 5;
		arg0.anInt9322 = Static296.anInt5113;
		arg0.anInt9261 = Static61.method1095(Static93.aClass8_Sub3_Sub3_Sub1_Sub1_1.aString16);
		arg0.anInt9288 = Static93.aClass8_Sub3_Sub3_Sub1_Sub1_1.anInt6814;
		arg0.anInt9253 = Static93.aClass8_Sub3_Sub3_Sub1_Sub1_1.anInt6800;
		arg0.anInt9259 = Static93.aClass8_Sub3_Sub3_Sub1_Sub1_1.anInt6829;
		arg0.anInt9246 = 0;
		@Pc(77) Class290 local77 = arg0.anInt9259 == -1 ? null : Static192.aClass211_1.method4277(arg0.anInt9259);
		if (local77 != null) {
			Static236.method3580(local77, arg0.anInt9253);
		}
	}

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method5343(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (Static270.anInt4759 <= arg3 && Static162.anInt2935 >= arg3 && Static270.anInt4759 <= arg0 && Static162.anInt2935 >= arg0 && arg2 >= Static270.anInt4759 && arg2 <= Static162.anInt2935 && arg7 >= Static270.anInt4759 && arg7 <= Static162.anInt2935 && arg1 >= Static514.anInt8722 && arg1 <= Static451.anInt7775 && arg4 >= Static514.anInt8722 && Static451.anInt7775 >= arg4 && arg8 >= Static514.anInt8722 && arg8 <= Static451.anInt7775 && Static514.anInt8722 <= arg6 && Static451.anInt7775 >= arg6) {
			Static248.method3687(arg3, arg4, arg7, arg0, arg6, arg8, arg1, arg2, arg5);
		} else {
			Static513.method7127(arg8, arg1, arg7, arg4, arg5, arg6, arg3, arg0, arg2);
		}
	}
}
