import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static243 {

	@OriginalMember(owner = "client!rf", name = "A", descriptor = "Lclient!pa;")
	public static Class1_Sub2_Sub1 aClass1_Sub2_Sub1_50;

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(ILjava/lang/String;B[BII)I")
	public static int method4740(@OriginalArg(1) String arg0, @OriginalArg(3) byte[] arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3) {
		@Pc(18) int local18 = arg2;
		for (@Pc(20) int local20 = 0; local20 < local18; local20++) {
			@Pc(29) char local29 = arg0.charAt(local20);
			if (local29 > '\u0000' && local29 < '\u0080' || !(local29 < ' ' || local29 > 'ÿ')) {
				arg1[local20 + arg3] = (byte) local29;
			} else if (local29 == '€') {
				arg1[local20 + arg3] = -128;
			} else if (local29 == '‚') {
				arg1[arg3 + local20] = -126;
			} else if (local29 == 'ƒ') {
				arg1[arg3 + local20] = -125;
			} else if (local29 == '„') {
				arg1[arg3 + local20] = -124;
			} else if (local29 == '…') {
				arg1[arg3 + local20] = -123;
			} else if (local29 == '†') {
				arg1[local20 + arg3] = -122;
			} else if (local29 == '‡') {
				arg1[arg3 + local20] = -121;
			} else if (local29 == 'ˆ') {
				arg1[local20 + arg3] = -120;
			} else if (local29 == '‰') {
				arg1[arg3 + local20] = -119;
			} else if (local29 == 'Š') {
				arg1[arg3 + local20] = -118;
			} else if (local29 == '‹') {
				arg1[local20 + arg3] = -117;
			} else if (local29 == 'Œ') {
				arg1[arg3 + local20] = -116;
			} else if (local29 == 'Ž') {
				arg1[local20 + arg3] = -114;
			} else if (local29 == '‘') {
				arg1[local20 + arg3] = -111;
			} else if (local29 == '’') {
				arg1[arg3 + local20] = -110;
			} else if (local29 == '“') {
				arg1[local20 + arg3] = -109;
			} else if (local29 == '”') {
				arg1[local20 + arg3] = -108;
			} else if (local29 == '•') {
				arg1[arg3 + local20] = -107;
			} else if (local29 == '–') {
				arg1[arg3 + local20] = -106;
			} else if (local29 == '—') {
				arg1[local20 + arg3] = -105;
			} else if (local29 == '˜') {
				arg1[arg3 + local20] = -104;
			} else if (local29 == '™') {
				arg1[local20 + arg3] = -103;
			} else if (local29 == 'š') {
				arg1[local20 + arg3] = -102;
			} else if (local29 == '›') {
				arg1[local20 + arg3] = -101;
			} else if (local29 == 'œ') {
				arg1[local20 + arg3] = -100;
			} else if (local29 == 'ž') {
				arg1[arg3 + local20] = -98;
			} else if (local29 == 'Ÿ') {
				arg1[arg3 + local20] = -97;
			} else {
				arg1[local20 + arg3] = 63;
			}
		}
		return local18;
	}

	@OriginalMember(owner = "client!rf", name = "b", descriptor = "(B)V")
	public static void method4742() {
		Static29.aBoolean21 = true;
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(Ljava/lang/String;ZILjava/lang/String;)V")
	public static void method4744(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2) {
		Static45.method885(-1, arg2, null, arg1, arg0);
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(IIII)Lclient!qn;")
	public static Class1_Sub25 method4745(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(9) Class1_Sub25 local9 = new Class1_Sub25();
		local9.anInt4294 = arg2;
		local9.anInt4289 = arg1;
		Static302.aClass142_26.method3537(local9, (long) arg0);
		Static295.method4495(arg1);
		@Pc(28) Class66 local28 = Static53.method968(arg0);
		if (local28 != null) {
			Static103.method1865(local28);
		}
		if (Static310.aClass66_51 != null) {
			Static103.method1865(Static310.aClass66_51);
			Static310.aClass66_51 = null;
		}
		@Pc(46) int local46 = Static110.anInt2281;
		@Pc(48) int local48;
		for (local48 = 0; local48 < local46; local48++) {
			if (Static88.method1624(Static17.aShortArray2[local48])) {
				Static115.method2063(local48);
			}
		}
		if (Static110.anInt2281 == 1) {
			Static249.aBoolean307 = false;
			Static86.method1605(Static36.anInt685, Static207.anInt3960, Static93.anInt1898, Static83.anInt1650);
		} else {
			Static86.method1605(Static36.anInt685, Static207.anInt3960, Static93.anInt1898, Static83.anInt1650);
			local48 = Static307.aClass1_Sub2_Sub6_4.method4023(Static244.aString255);
			for (@Pc(90) int local90 = 0; local90 < Static110.anInt2281; local90++) {
				@Pc(103) int local103 = Static307.aClass1_Sub2_Sub6_4.method4023(Static213.method3842(local90));
				if (local48 < local103) {
					local48 = local103;
				}
			}
			Static93.anInt1898 = local48 + 8;
			Static83.anInt1650 = Static110.anInt2281 * 15 + (Static41.aBoolean46 ? 26 : 22);
		}
		if (local28 != null) {
			Static6.method38(false, local28);
		}
		Static244.method3822(arg1);
		if (Static270.anInt4897 != -1) {
			Static290.method4438(1, Static270.anInt4897);
		}
		return local9;
	}

	@OriginalMember(owner = "client!rf", name = "b", descriptor = "(II)Ljava/lang/String;")
	public static String method4748(@OriginalArg(0) int arg0) {
		@Pc(13) String local13 = Integer.toString(arg0);
		for (@Pc(18) int local18 = local13.length() - 3; local18 > 0; local18 -= 3) {
			local13 = local13.substring(0, local18) + "," + local13.substring(local18);
		}
		if (local13.length() <= 9) {
			return local13.length() <= 6 ? " <col=ffff00>" + local13 + "</col>" : " <col=ffffff>" + local13.substring(0, local13.length() - 4) + Static110.aString130 + " (" + local13 + ")</col>";
		} else {
			return " <col=00ff80>" + local13.substring(0, local13.length() - 8) + Static266.aString285 + " (" + local13 + ")</col>";
		}
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(ILjava/awt/Component;)V")
	public static void method4752(@OriginalArg(1) Component arg0) {
		arg0.addMouseListener(Static133.aClass54_1);
		arg0.addMouseMotionListener(Static133.aClass54_1);
		arg0.addFocusListener(Static133.aClass54_1);
	}
}
