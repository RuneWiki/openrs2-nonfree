import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static248 {

	@OriginalMember(owner = "client!jm", name = "r", descriptor = "I")
	public static int anInt4546;

	@OriginalMember(owner = "client!jm", name = "s", descriptor = "F")
	public static float aFloat114;

	@OriginalMember(owner = "client!jm", name = "k", descriptor = "Lclient!dg;")
	public static final Class70 aClass70_50 = new Class70(9, 3);

	@OriginalMember(owner = "client!jm", name = "q", descriptor = "[I")
	public static final int[] anIntArray358 = new int[4];

	@OriginalMember(owner = "client!jm", name = "t", descriptor = "[I")
	public static final int[] anIntArray359 = new int[14];

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(Ljava/lang/String;BILclient!ft;)Lclient!pga;")
	public static Class260 method3684(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class109 arg2) {
		if (arg1 == 0) {
			return arg2.method2168(arg0);
		}
		@Pc(44) Class260 local44;
		if (arg1 == 1) {
			try {
				Static602.method2416(Static590.anApplet2, "openjs", new Object[] { (new URL(Static590.anApplet2.getCodeBase(), arg0)).toString() });
				local44 = new Class260();
				local44.anInt7041 = 1;
				return local44;
			} catch (@Pc(50) Throwable local50) {
				local44 = new Class260();
				local44.anInt7041 = 2;
				return local44;
			}
		} else if (arg1 == 2) {
			try {
				Static590.anApplet2.getAppletContext().showDocument(new URL(Static590.anApplet2.getCodeBase(), arg0), "_blank");
				local44 = new Class260();
				local44.anInt7041 = 1;
				return local44;
			} catch (@Pc(84) Exception local84) {
				local44 = new Class260();
				local44.anInt7041 = 2;
				return local44;
			}
		} else if (arg1 == 3) {
			try {
				Static602.method2417(Static590.anApplet2, "loggedout");
			} catch (@Pc(103) Throwable local103) {
			}
			try {
				Static590.anApplet2.getAppletContext().showDocument(new URL(Static590.anApplet2.getCodeBase(), arg0), "_top");
				local44 = new Class260();
				local44.anInt7041 = 1;
				return local44;
			} catch (@Pc(123) Exception local123) {
				local44 = new Class260();
				local44.anInt7041 = 2;
				return local44;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(BLclient!mo;)Lclient!ci;")
	public static Class54_Sub1 method3686(@OriginalArg(1) Class1_Sub35 arg0) {
		@Pc(7) Class54 local7 = Static536.method7335(arg0);
		@Pc(11) int local11 = arg0.method5804();
		@Pc(15) int local15 = arg0.method5804();
		@Pc(26) int local26 = arg0.method5771();
		return new Class54_Sub1(local7.aClass335_10, local7.aClass122_9, local7.anInt4146, local7.anInt4142, local7.anInt4145, local7.anInt4141, local7.anInt4143, local7.anInt4144, local7.anInt4139, local11, local15, local26);
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method3687(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg3 == arg0 && arg1 == arg6 && arg2 == arg7 && arg5 == arg4) {
			Static95.method1634(arg4, arg6, arg2, arg0, arg8);
			return;
		}
		@Pc(32) int local32 = arg0;
		@Pc(34) int local34 = arg6;
		@Pc(38) int local38 = arg0 * 3;
		@Pc(42) int local42 = arg6 * 3;
		@Pc(46) int local46 = arg3 * 3;
		@Pc(50) int local50 = arg1 * 3;
		@Pc(54) int local54 = arg7 * 3;
		@Pc(58) int local58 = arg5 * 3;
		@Pc(68) int local68 = arg2 + local46 - arg0 - local54;
		@Pc(78) int local78 = arg4 + local50 - local58 - arg6;
		@Pc(89) int local89 = local54 + local38 - local46 - local46;
		@Pc(99) int local99 = local58 + local42 - local50 - local50;
		@Pc(104) int local104 = local46 - local38;
		@Pc(109) int local109 = local50 - local42;
		for (@Pc(111) int local111 = 128; local111 <= 4096; local111 += 128) {
			@Pc(119) int local119 = local111 * local111 >> 12;
			@Pc(125) int local125 = local111 * local119 >> 12;
			@Pc(129) int local129 = local68 * local125;
			@Pc(133) int local133 = local78 * local125;
			@Pc(137) int local137 = local89 * local119;
			@Pc(141) int local141 = local99 * local119;
			@Pc(145) int local145 = local104 * local111;
			@Pc(149) int local149 = local109 * local111;
			@Pc(160) int local160 = (local137 + local129 + local145 >> 12) + arg0;
			@Pc(172) int local172 = arg6 + (local133 + local141 + local149 >> 12);
			Static95.method1634(local172, local34, local160, local32, arg8);
			local32 = local160;
			local34 = local172;
		}
	}

	@OriginalMember(owner = "client!jm", name = "b", descriptor = "(I)V")
	public static void method3688() {
		@Pc(15) Class1_Sub6_Sub16 local15 = Static212.method3332(15, 0);
		local15.method6593();
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(II)I")
	public static int method3689(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static548.aByteArrayArray32 == null ? 0 : Static548.aByteArrayArray32[arg0][arg1] & 0xFF;
	}

	@OriginalMember(owner = "client!jm", name = "b", descriptor = "(II)V")
	public static void method3690(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class39 local7 = Static292.aClass39ArrayArrayArray2[0][arg0][arg1];
		for (@Pc(9) int local9 = 0; local9 < 3; local9++) {
			@Pc(28) Class39 local28 = Static292.aClass39ArrayArrayArray2[local9][arg0][arg1] = Static292.aClass39ArrayArrayArray2[local9 + 1][arg0][arg1];
			if (local28 != null) {
				for (@Pc(33) Class111 local33 = local28.aClass111_1; local33 != null; local33 = local33.aClass111_2) {
					@Pc(37) Class8_Sub3_Sub3 local37 = local33.aClass8_Sub3_Sub3_1;
					if (local37.aShort132 == arg0 && local37.aShort131 == arg1) {
						local37.aByte123--;
					}
				}
				if (local28.aClass8_Sub3_Sub1_1 != null) {
					local28.aClass8_Sub3_Sub1_1.aByte123--;
				}
				if (local28.aClass8_Sub3_Sub4_1 != null) {
					local28.aClass8_Sub3_Sub4_1.aByte123--;
				}
				if (local28.aClass8_Sub3_Sub4_2 != null) {
					local28.aClass8_Sub3_Sub4_2.aByte123--;
				}
				if (local28.aClass8_Sub3_Sub2_2 != null) {
					local28.aClass8_Sub3_Sub2_2.aByte123--;
				}
				if (local28.aClass8_Sub3_Sub2_1 != null) {
					local28.aClass8_Sub3_Sub2_1.aByte123--;
				}
			}
		}
		if (Static292.aClass39ArrayArrayArray2[0][arg0][arg1] == null) {
			Static292.aClass39ArrayArrayArray2[0][arg0][arg1] = new Class39(0);
			Static292.aClass39ArrayArrayArray2[0][arg0][arg1].aByte21 = 1;
		}
		Static292.aClass39ArrayArrayArray2[0][arg0][arg1].aClass39_1 = local7;
		Static292.aClass39ArrayArrayArray2[3][arg0][arg1] = null;
	}
}
