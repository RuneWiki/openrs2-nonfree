import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static183 {

	@OriginalMember(owner = "client!ll", name = "e", descriptor = "[Lclient!sk;")
	public static Class183[] aClass183Array2;

	@OriginalMember(owner = "client!ll", name = "h", descriptor = "Lclient!tj;")
	public static Class193 aClass193_67;

	@OriginalMember(owner = "client!ll", name = "k", descriptor = "[I")
	public static int[] anIntArray326;

	@OriginalMember(owner = "client!ll", name = "p", descriptor = "Lclient!up;")
	public static Class205 aClass205_1;

	@OriginalMember(owner = "client!ll", name = "l", descriptor = "Lclient!pm;")
	public static final Class159 aClass159_201 = new Class159("Examine", "Untersuchen", "Examiner", "Examinar");

	@OriginalMember(owner = "client!ll", name = "o", descriptor = "[S")
	public static final short[] aShortArray48 = new short[] { 20, 19, 5, 21, 4, 58, 3, 8 };

	@OriginalMember(owner = "client!ll", name = "q", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray47 = new String[100];

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(ILclient!vq;[[ILclient!uh;[[BILclient!uh;[[BZI[[B[[BI)V")
	public static void method3512(@OriginalArg(1) Class47 arg0, @OriginalArg(2) int[][] arg1, @OriginalArg(3) Class60 arg2, @OriginalArg(4) byte[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class60 arg5, @OriginalArg(7) byte[][] arg6, @OriginalArg(8) boolean arg7, @OriginalArg(9) int arg8, @OriginalArg(10) byte[][] arg9, @OriginalArg(11) byte[][] arg10, @OriginalArg(12) int arg11) {
		if (Static225.anInt4568 == 0 && !Static209.aBoolean333) {
			Static346.method5514(arg7, arg9, arg11, arg10, arg1, arg6, arg4, arg5, arg8, arg0, arg2, arg3);
		} else {
			Static39.method758(arg10, arg7, arg1, arg8, arg4, arg2, arg3, arg6, arg11, arg0, arg5, arg9);
		}
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(Z)V")
	public static void method3513() {
		for (@Pc(3) int local3 = 0; local3 < Static187.anInt3921; local3++) {
			@Pc(13) int local13 = Static63.anIntArray95[local3]--;
			if (Static63.anIntArray95[local3] >= -10) {
				@Pc(90) Class152 local90 = Static249.aClass152Array1[local3];
				if (local90 == null) {
					local90 = Static365.method4183(Static146.aClass193_43, Static318.anIntArray482[local3], 0);
					if (local90 == null) {
						continue;
					}
					Static63.anIntArray95[local3] += local90.method4186();
					Static249.aClass152Array1[local3] = local90;
				}
				if (Static63.anIntArray95[local3] < 0) {
					@Pc(134) int local134;
					if (Static276.anIntArray448[local3] == 0) {
						local134 = Static37.anIntArray45[local3] * Static292.anInt5680 >> 8;
					} else {
						@Pc(144) int local144 = (Static276.anIntArray448[local3] & 0xFF) * 128;
						@Pc(152) int local152 = Static276.anIntArray448[local3] >> 16 & 0xFF;
						@Pc(162) int local162 = local152 * 128 + 64 - Static158.aClass8_Sub1_Sub2_Sub1_1.anInt6701;
						if (local162 < 0) {
							local162 = -local162;
						}
						@Pc(175) int local175 = Static276.anIntArray448[local3] >> 8 & 0xFF;
						@Pc(185) int local185 = local175 * 128 + 64 - Static158.aClass8_Sub1_Sub2_Sub1_1.anInt6702;
						if (local185 < 0) {
							local185 = -local185;
						}
						@Pc(200) int local200 = local162 + local185 - 128;
						if (local200 > local144) {
							Static63.anIntArray95[local3] = -100;
							continue;
						}
						if (local200 < 0) {
							local200 = 0;
						}
						local134 = Static37.anIntArray45[local3] * (local144 - local200) * Static8.anInt192 / local144 >> 8;
					}
					if (local134 > 0) {
						@Pc(237) Class4_Sub7_Sub1 local237 = local90.method4185().method394(Static37.aClass150_1);
						@Pc(242) Class4_Sub1_Sub1 local242 = Static358.method110(local237, local134);
						local242.method108(Static357.anIntArray514[local3] - 1);
						Static196.aClass4_Sub1_Sub3_3.method3505(local242);
					}
					Static63.anIntArray95[local3] = -100;
				}
			} else {
				Static187.anInt3921--;
				for (@Pc(29) int local29 = local3; local29 < Static187.anInt3921; local29++) {
					Static318.anIntArray482[local29] = Static318.anIntArray482[local29 + 1];
					Static249.aClass152Array1[local29] = Static249.aClass152Array1[local29 + 1];
					Static357.anIntArray514[local29] = Static357.anIntArray514[local29 + 1];
					Static63.anIntArray95[local29] = Static63.anIntArray95[local29 + 1];
					Static276.anIntArray448[local29] = Static276.anIntArray448[local29 + 1];
					Static37.anIntArray45[local29] = Static37.anIntArray45[local29 + 1];
				}
				local3--;
			}
		}
		if (Static74.aBoolean135 && !Static290.method4877()) {
			if (Static26.anInt577 != 0 && Static206.anInt4321 != -1) {
				Static32.method558(Static206.anInt4321, Static39.aClass193_11, Static26.anInt577);
			}
			Static74.aBoolean135 = false;
		} else if (Static26.anInt577 != 0 && Static206.anInt4321 != -1 && !Static290.method4877()) {
			Static15.aClass4_Sub11_Sub1_2.method706(79);
			Static15.aClass4_Sub11_Sub1_2.method3452(Static206.anInt4321);
			Static206.anInt4321 = -1;
		}
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(II)Lclient!ph;")
	public static Class156 method3514(@OriginalArg(1) int arg0) {
		@Pc(10) Class156 local10 = (Class156) Static171.aClass198_132.method5210((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static354.aClass193_111.method5047(1, arg0);
		local10 = new Class156();
		if (local20 != null) {
			local10.method4261(new Class4_Sub11(local20), arg0);
		}
		Static171.aClass198_132.method5201(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(Lclient!sf;II)Lclient!kq;")
	public static Class117 method3515(@OriginalArg(0) Class8_Sub1 arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class117 local7;
		if (Static303.aClass117_3 == null) {
			local7 = new Class117();
		} else {
			local7 = Static303.aClass117_3;
			Static303.aClass117_3 = Static303.aClass117_3.aClass117_1;
			local7.aClass117_1 = null;
			Static348.anInt6589--;
		}
		local7.aClass8_Sub1_1 = arg0;
		local7.anInt3669 = arg1;
		return local7;
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(BI)V")
	public static void method3516() {
		@Pc(5) Class198 local5 = Static32.aClass198_32;
		synchronized (Static32.aClass198_32) {
			Static32.aClass198_32.method5202(5);
		}
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(I)V")
	public static void method3517() {
		if (Static135.anInt3159 < 102) {
			Static135.anInt3159 += 6;
		}
		if (Static310.anInt6021 != 0) {
			Static25.anInt501 -= Static310.anInt6021 * 5;
			if (Static169.anInt3605 <= Static25.anInt501) {
				Static25.anInt501 = Static169.anInt3605 - 1;
			}
			if (Static25.anInt501 < 0) {
				Static25.anInt501 = 0;
			}
			Static310.anInt6021 = 0;
		}
		@Pc(46) int local46;
		for (@Pc(38) int local38 = 0; local38 < Static11.anInt241; local38++) {
			local46 = Static88.aClass157Array1[local38].method5193();
			@Pc(52) char local52 = Static88.aClass157Array1[local38].method5190();
			if (local46 == 84) {
				Static120.method2526();
			} else if (Static264.aClass92_3.method2620(82) && local46 == 66) {
				if (Static238.aClipboard2 != null) {
					@Pc(335) String local335 = "";
					for (@Pc(340) int local340 = Static278.aStringArray85.length - 1; local340 >= 0; local340--) {
						if (Static278.aStringArray85[local340] != null && Static278.aStringArray85[local340].length() > 0) {
							local335 = local335 + Static278.aStringArray85[local340] + '\n';
						}
					}
					Static238.aClipboard2.setContents(new StringSelection(local335), null);
				}
			} else if (Static264.aClass92_3.method2620(82) && local46 == 67) {
				if (Static238.aClipboard2 != null) {
					@Pc(283) Transferable local283 = Static238.aClipboard2.getContents(null);
					if (local283 != null) {
						try {
							@Pc(290) String local290 = (String) local283.getTransferData(DataFlavor.stringFlavor);
							if (local290 != null) {
								@Pc(297) String[] local297 = Static212.method2554(local290, '\n');
								if (local297.length <= 1) {
									Static72.aString15 = Static72.aString15 + local290;
								} else {
									for (@Pc(314) int local314 = 0; local314 < local297.length; local314++) {
										Static72.aString15 = local297[local314];
										Static120.method2526();
									}
								}
							}
						} catch (@Pc(329) Exception local329) {
						}
					}
				}
			} else if (local46 == 85 && Static168.anInt6695 > 0) {
				Static72.aString15 = Static72.aString15.substring(0, Static168.anInt6695 - 1) + Static72.aString15.substring(Static168.anInt6695);
				Static168.anInt6695--;
			} else if (local46 == 101 && Static168.anInt6695 < Static72.aString15.length()) {
				Static72.aString15 = Static72.aString15.substring(0, Static168.anInt6695) + Static72.aString15.substring(Static168.anInt6695 + 1);
			} else if (local46 == 96 && Static168.anInt6695 > 0) {
				Static168.anInt6695--;
			} else if (local46 == 97 && Static168.anInt6695 < Static72.aString15.length()) {
				Static168.anInt6695++;
			} else if (local46 == 102) {
				Static168.anInt6695 = 0;
			} else if (local46 == 103) {
				Static168.anInt6695 = Static72.aString15.length();
			} else if (local46 == 104 && Static278.aStringArray85.length > Static161.anInt3459) {
				Static161.anInt3459++;
				Static97.method2228();
				Static168.anInt6695 = Static72.aString15.length();
			} else if (local46 == 105 && Static161.anInt3459 > 0) {
				Static161.anInt3459--;
				Static97.method2228();
				Static168.anInt6695 = Static72.aString15.length();
			} else if (Static271.method4638(local52) || local52 == ':' || local52 == ',' || local52 == ' ' || local52 == '_' || local52 == '-' || local52 == '+') {
				Static72.aString15 = Static72.aString15.substring(0, Static168.anInt6695) + Static88.aClass157Array1[local38].method5190() + Static72.aString15.substring(Static168.anInt6695);
				Static168.anInt6695++;
			}
		}
		Static11.anInt241 = 0;
		for (local46 = 0; local46 < 100; local46++) {
			@Pc(395) int local395;
			if (Static287.aBooleanArray22[local46]) {
				local395 = Class192.lb[local46]++;
				if (Class192.lb[local46] > 102) {
					Static287.aBooleanArray22[local46] = false;
				}
			} else {
				local395 = Class192.lb[local46]--;
				if (Class192.lb[local46] < 0) {
					Static340.anIntArray497[local46] = (int) (Math.random() * (double) Static24.anInt496);
					anIntArray326[local46] = (int) (Math.random() * 350.0D);
					Class192.lb[local46] = 0;
					Static287.aBooleanArray22[local46] = true;
				}
			}
		}
		Static12.method242();
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(IZ)Z")
	public static boolean method3518(@OriginalArg(0) int arg0) {
		if (arg0 == 51 || arg0 == 50 || arg0 == 17 || arg0 == 13 || arg0 == 1002) {
			return true;
		} else {
			return arg0 == 59 || arg0 == 1004;
		}
	}

	@OriginalMember(owner = "client!ll", name = "b", descriptor = "(II)I")
	public static int method3520(@OriginalArg(0) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(B)V")
	public static void method3521() {
		Static244.anInt4894 = 0;
		Static212.anInt2908 = 0;
		Static263.method5696();
		Static309.method5102();
		Static45.method915();
		Static176.method1866();
		@Pc(25) int local25;
		for (@Pc(19) int local19 = 0; local19 < Static212.anInt2908; local19++) {
			local25 = Static227.anIntArray51[local19];
			if (Static199.anInt4137 != Static327.aClass8_Sub1_Sub2_Sub1Array1[local25].anInt4940) {
				if (Static327.aClass8_Sub1_Sub2_Sub1Array1[local25].anInt2365 > 0) {
					Static262.method4566(Static327.aClass8_Sub1_Sub2_Sub1Array1[local25]);
				}
				Static327.aClass8_Sub1_Sub2_Sub1Array1[local25] = null;
			}
		}
		if (Static133.anInt3104 != Static127.aClass4_Sub11_Sub1_3.anInt3768) {
			throw new RuntimeException("gpp1 pos:" + Static127.aClass4_Sub11_Sub1_3.anInt3768 + " psize:" + Static133.anInt3104);
		}
		for (local25 = 0; local25 < Static289.anInt5643; local25++) {
			if (Static327.aClass8_Sub1_Sub2_Sub1Array1[Static333.anIntArray494[local25]] == null) {
				throw new RuntimeException("gpp2 pos:" + local25 + " size:" + Static289.anInt5643);
			}
		}
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "()V")
	public static void method3522() {
		@Pc(3) int local3;
		@Pc(6) int local6;
		@Pc(9) int local9;
		if (Static1.aClass128ArrayArrayArray3 != null) {
			for (local3 = 0; local3 < Static1.aClass128ArrayArrayArray3.length; local3++) {
				for (local6 = 0; local6 < Static198.anInt4128; local6++) {
					for (local9 = 0; local9 < Static15.anInt1162; local9++) {
						if (Static1.aClass128ArrayArrayArray3[local3][local6][local9] != null) {
							Static1.aClass128ArrayArrayArray3[local3][local6][local9].method3610();
						}
						Static1.aClass128ArrayArrayArray3[local3][local6][local9] = null;
					}
				}
			}
		}
		Static1.aClass128ArrayArrayArray3 = null;
		Static304.aClass60Array3 = null;
		if (Static24.aClass128ArrayArrayArray2 != null) {
			for (local3 = 0; local3 < Static24.aClass128ArrayArrayArray2.length; local3++) {
				for (local6 = 0; local6 < Static198.anInt4128; local6++) {
					for (local9 = 0; local9 < Static15.anInt1162; local9++) {
						if (Static24.aClass128ArrayArrayArray2[local3][local6][local9] != null) {
							Static24.aClass128ArrayArrayArray2[local3][local6][local9].method3610();
						}
						Static24.aClass128ArrayArrayArray2[local3][local6][local9] = null;
					}
				}
			}
		}
		Static24.aClass128ArrayArrayArray2 = null;
		Static77.aClass60Array1 = null;
		Static273.aClass128ArrayArrayArray4 = null;
		Static261.aClass60Array2 = null;
		Static67.anInt1776 = 0;
		if (aClass183Array2 != null) {
			for (local3 = 0; local3 < Static67.anInt1776; local3++) {
				aClass183Array2[local3] = null;
			}
		}
		if (Static213.aClass8_Sub1Array1 != null) {
			for (local3 = 0; local3 < Static329.anInt3942; local3++) {
				Static213.aClass8_Sub1Array1[local3] = null;
			}
			Static329.anInt3942 = 0;
		}
		if (Static25.aClass4_Sub33_Sub1Array1 != null) {
			for (local3 = 0; local3 < Static201.anInt4146; local3++) {
				Static25.aClass4_Sub33_Sub1Array1[local3] = null;
			}
			for (local6 = 0; local6 < Static327.anInt6252; local6++) {
				for (local9 = 0; local9 < Static198.anInt4128; local9++) {
					for (@Pc(160) int local160 = 0; local160 < Static15.anInt1162; local160++) {
						Static134.anIntArrayArrayArray17[local6][local9][local160] = 0;
					}
				}
			}
			Static201.anInt4146 = 0;
		}
		Static180.anIntArrayArrayArray21 = null;
		Static105.method2335();
		Static151.aClass32_5.method851();
		Static57.aClass45_1 = null;
		Static22.anIntArrayArray12 = null;
		Static264.aClass57_7 = null;
		Static170.aClass47_5 = null;
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(ZLclient!tj;)V")
	public static void method3523(@OriginalArg(1) Class193 arg0) {
		Static171.aClass193_62 = arg0;
		Static103.anInt2590 = Static171.aClass193_62.method5055(19);
	}
}
