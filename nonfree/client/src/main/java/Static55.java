import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static55 {

	@OriginalMember(owner = "client!cc", name = "O", descriptor = "[I")
	public static int[] anIntArray91;

	@OriginalMember(owner = "client!cc", name = "n", descriptor = "I")
	public static int anInt970 = -1;

	@OriginalMember(owner = "client!cc", name = "s", descriptor = "I")
	public static int anInt972 = -2;

	@OriginalMember(owner = "client!cc", name = "I", descriptor = "Lclient!qp;")
	public static final Class239 aClass239_27 = new Class239(3, 5);

	@OriginalMember(owner = "client!cc", name = "ob", descriptor = "[J")
	public static final long[] aLongArray6 = new long[100];

	@OriginalMember(owner = "client!cc", name = "g", descriptor = "(I)V")
	public static void method1020() {
		if (Static490.method6649(Static271.anInt8654) || Static14.method452(Static271.anInt8654)) {
			Static47.method856(5000, Static353.anInt5258 >> 10, Static187.anInt3432 >> 10);
		} else {
			@Pc(16) int local16 = Static266.aClass1_Sub1_Sub2_Sub1_1.anIntArray450[0] >> 3;
			@Pc(23) int local23 = Static266.aClass1_Sub1_Sub2_Sub1_1.anIntArray449[0] >> 3;
			if (local16 >= 0 && Static363.anInt1158 >> 3 > local16 && local23 >= 0 && Static511.anInt8889 >> 3 > local23) {
				Static47.method856(5000, local23, local16);
			} else {
				Static47.method856(0, Static511.anInt8889 >> 4, Static363.anInt1158 >> 4);
			}
		}
		Static494.method7274();
		Static510.method7460();
		Static93.method1723();
		Static214.method3905();
	}

	@OriginalMember(owner = "client!cc", name = "h", descriptor = "(I)V")
	public static void method1025() {
		if (Static18.anInt431 < 102) {
			Static18.anInt431 += 6;
		}
		if (Static101.anInt8474 != 0) {
			Static62.anInt1194 -= Static101.anInt8474 * 5;
			if (Static62.anInt1194 >= Static262.anInt7160) {
				Static62.anInt1194 = Static262.anInt7160 - 1;
			}
			Static101.anInt8474 = 0;
			if (Static62.anInt1194 < 0) {
				Static62.anInt1194 = 0;
			}
		}
		for (@Pc(41) int local41 = 0; local41 < Static33.anInt600; local41++) {
			@Pc(47) Interface13 local47 = Static394.anInterface13Array2[local41];
			@Pc(51) int local51 = local47.method5854();
			@Pc(57) char local57 = local47.method5852();
			@Pc(61) int local61 = local47.method5850();
			if (local51 == 84) {
				Static528.method7627(false);
			}
			if (local51 == 80) {
				Static528.method7627(true);
			} else if (local51 == 66 && (local61 & 0x4) != 0) {
				if (Static167.aClipboard1 != null) {
					@Pc(85) String local85 = "";
					for (@Pc(90) int local90 = Static277.aStringArray27.length - 1; local90 >= 0; local90--) {
						if (Static277.aStringArray27[local90] != null && Static277.aStringArray27[local90].length() > 0) {
							local85 = local85 + Static277.aStringArray27[local90] + '\n';
						}
					}
					Static167.aClipboard1.setContents(new StringSelection(local85), null);
				}
			} else if (local51 == 67 && (local61 & 0x4) != 0) {
				if (Static167.aClipboard1 != null) {
					@Pc(144) Transferable local144 = Static167.aClipboard1.getContents(null);
					if (local144 != null) {
						try {
							@Pc(151) String local151 = (String) local144.getTransferData(DataFlavor.stringFlavor);
							if (local151 != null) {
								@Pc(158) String[] local158 = Static225.method3542('\n', local151);
								if (local158.length > 1) {
									for (@Pc(164) int local164 = 0; local164 < local158.length; local164++) {
										Static118.aString57 = local158[local164];
										Static528.method7627(false);
									}
								} else {
									Static118.aString57 = Static118.aString57 + local151;
								}
							}
						} catch (@Pc(197) Exception local197) {
						}
					}
				}
			} else if (local51 == 85 && Static210.anInt3785 > 0) {
				Static118.aString57 = Static118.aString57.substring(0, Static210.anInt3785 - 1) + Static118.aString57.substring(Static210.anInt3785);
				Static210.anInt3785--;
			} else if (local51 == 101 && Static210.anInt3785 < Static118.aString57.length()) {
				Static118.aString57 = Static118.aString57.substring(0, Static210.anInt3785) + Static118.aString57.substring(Static210.anInt3785 + 1);
			} else if (local51 == 96 && Static210.anInt3785 > 0) {
				Static210.anInt3785--;
			} else if (local51 == 97 && Static210.anInt3785 < Static118.aString57.length()) {
				Static210.anInt3785++;
			} else if (local51 == 102) {
				Static210.anInt3785 = 0;
			} else if (local51 == 103) {
				Static210.anInt3785 = Static118.aString57.length();
			} else if (local51 == 104 && Static319.anInt5968 < Static277.aStringArray27.length) {
				Static319.anInt5968++;
				Static131.method2409();
				Static210.anInt3785 = Static118.aString57.length();
			} else if (local51 == 105 && Static319.anInt5968 > 0) {
				Static319.anInt5968--;
				Static131.method2409();
				Static210.anInt3785 = Static118.aString57.length();
			} else if (Static76.method1565(local57) || local57 == ':' || local57 == ',' || local57 == ' ' || local57 == '_' || local57 == '-' || local57 == '+' || local57 == '[' || local57 == ']') {
				Static118.aString57 = Static118.aString57.substring(0, Static210.anInt3785) + Static394.anInterface13Array2[local41].method5852() + Static118.aString57.substring(Static210.anInt3785);
				Static210.anInt3785++;
			}
		}
		Static33.anInt600 = 0;
		Static190.method3102();
	}

	@OriginalMember(owner = "client!cc", name = "i", descriptor = "(I)[Lclient!qp;")
	public static Class239[] method1026() {
		return new Class239[] { Static459.aClass239_168, Static333.aClass239_127, Static293.aClass239_108, aClass239_27, Static454.aClass239_166, Static392.aClass239_144, Static91.aClass239_37, Static220.aClass239_91, Static26.aClass239_17, Static213.aClass239_89, Static94.aClass239_41, Static168.aClass239_79, Static525.aClass239_183, Static403.aClass239_149, Static125.aClass239_59, Static119.aClass239_57, Static11.aClass239_99, Static162.aClass239_76, Static312.aClass239_119, Static502.aClass239_178, Static299.aClass239_111, Static26.aClass239_16, Static31.aClass239_117, Static99.aClass239_49, Static150.aClass239_67, Static52.aClass239_26, Static48.aClass239_25, Static160.aClass239_74, Static413.aClass239_153, Static391.aClass239_143, Static321.aClass239_179, Static271.aClass239_176, Static251.aClass239_100, Static40.aClass239_170, Static275.aClass239_169, Static430.aClass239_157, Static11.aClass239_98, Static502.aClass239_177, Static97.aClass239_42, Static31.aClass239_118, Static32.aClass239_20, Static3.aClass239_4, Static532.aClass239_186, Static445.aClass239_161, Static486.aClass239_175, Static240.aClass239_97, Static102.aClass239_174, Static515.aClass239_88, Static270.aClass239_172, Static299.aClass239_110, Static124.aClass239_58, Static189.aClass239_84, Static518.aClass239_182, Static451.aClass239_165, Static351.aClass239_131, Static144.aClass239_64, Static423.aClass239_156, Static265.aClass239_141, Static65.aClass239_28, Static343.aClass239_128, Static69.aClass239_32, Static439.aClass239_160, Static437.aClass239_159, Static239.aClass239_180, Static139.aClass239_62, Static425.aClass239_137, Static365.aClass239_136, Static324.aClass239_125, Static435.aClass239_158, Static194.aClass239_48, Static225.aClass239_94, Static316.aClass239_120, Static401.aClass239_148, Static511.aClass239_181, Static480.aClass239_173, Static346.aClass239_154, Static161.aClass239_75, Static265.aClass239_140, Static368.aClass239_138, Static42.aClass239_21, Static384.aClass239_142, Static525.aClass239_184, Static323.aClass239_124, Static67.aClass239_29, Static349.aClass239_130, Static17.aClass239_13, Static196.aClass239_86, Static469.aClass239_171, Static213.aClass239_90, Static536.aClass239_187, Static318.aClass239_122, Static215.aClass239_163, Static417.aClass239_155, Static109.aClass239_54, Static78.aClass239_34, Static169.aClass239_80, Static142.aClass239_63, Static412.aClass239_151, Static455.aClass239_167, Static228.aClass239_96, Static308.aClass239_116, Static302.aClass239_113, Static3.aClass239_3, Static330.aClass239_102, Static392.aClass239_145, Static355.aClass239_133, Static357.aClass239_135, Static127.aClass239_61, Static296.aClass239_109, Static531.aClass239_185, Static19.aClass239_14, Static157.aClass239_73, Static394.aClass239_146, Static178.aClass239_81 };
	}

	@OriginalMember(owner = "client!cc", name = "d", descriptor = "(III)Lclient!vf;")
	public static Class1_Sub3 method1029(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class262 local7 = Static399.aClass262ArrayArrayArray2[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass1_Sub3_2;
	}
}
