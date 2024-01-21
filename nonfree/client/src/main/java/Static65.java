import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static65 {

	@OriginalMember(owner = "client!lc", name = "j", descriptor = "Lclient!r;")
	public static Class3_Sub1_Sub2_Sub4 aClass3_Sub1_Sub2_Sub4_6;

	@OriginalMember(owner = "client!lc", name = "D", descriptor = "Lclient!ma;")
	public static Class3_Sub1_Sub2_Sub3 aClass3_Sub1_Sub2_Sub3_3;

	@OriginalMember(owner = "client!lc", name = "E", descriptor = "Lclient!jb;")
	public static Class25 aClass25_19;

	@OriginalMember(owner = "client!lc", name = "G", descriptor = "Lclient!jb;")
	public static Class25 aClass25_20;

	@OriginalMember(owner = "client!lc", name = "f", descriptor = "I")
	public static int anInt2053 = -1;

	@OriginalMember(owner = "client!lc", name = "g", descriptor = "Lclient!ob;")
	public static Class50 aClass50_2 = new Class50();

	@OriginalMember(owner = "client!lc", name = "F", descriptor = "I")
	public static int anInt2069 = 0;

	@OriginalMember(owner = "client!lc", name = "H", descriptor = "Lclient!qf;")
	public static Class60 aClass60_894 = Static59.method1195(" <col=ffffff>");

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(IIII)I")
	public static int method1338(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg2 / arg0;
		@Pc(11) int local11 = arg1 / arg0;
		@Pc(17) int local17 = arg0 - 1 & arg2;
		@Pc(22) int local22 = Static46.method992(local11, local7);
		@Pc(28) int local28 = arg0 - 1 & arg1;
		@Pc(40) int local40 = Static46.method992(local11, local7 + 1);
		@Pc(47) int local47 = Static46.method992(local11 + 1, local7);
		@Pc(56) int local56 = Static46.method992(local11 + 1, local7 + 1);
		@Pc(63) int local63 = Static69.method1399(local22, local40, arg0, local17);
		@Pc(70) int local70 = Static69.method1399(local47, local56, arg0, local17);
		return Static69.method1399(local63, local70, arg0, local28);
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(BLclient!fd;)V")
	public static void method1340(@OriginalArg(1) Class21 arg0) {
		Static73.aClass21_1 = arg0;
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(II)Lclient!qf;")
	public static Class60 method1341(@OriginalArg(1) int arg0) {
		return Static39.method879(false, arg0);
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(Z)V")
	public static void method1342() {
		aClass25_20 = null;
		aClass50_2 = null;
		aClass60_894 = null;
		aClass3_Sub1_Sub2_Sub3_3 = null;
		aClass3_Sub1_Sub2_Sub4_6 = null;
		aClass25_19 = null;
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(III)I")
	public static int method1344(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 == -2) {
			return 12345678;
		} else if (arg0 == -1) {
			if (arg1 < 0) {
				arg1 = 0;
			} else if (arg1 > 127) {
				arg1 = 127;
			}
			return 127 - arg1;
		} else {
			arg1 = (arg0 & 0x7F) * arg1 / 128;
			if (arg1 < 2) {
				arg1 = 2;
			} else if (arg1 > 126) {
				arg1 = 126;
			}
			return arg1 + (arg0 & 0xFF80);
		}
	}

	@OriginalMember(owner = "client!lc", name = "b", descriptor = "(Z)V")
	public static void method1346() {
		if (Static6.aClass26_1 != null) {
			@Pc(8) Class26 local8 = Static6.aClass26_1;
			synchronized (Static6.aClass26_1) {
				Static6.aClass26_1 = null;
			}
		}
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(III[B)Z")
	public static boolean method1350(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(7) boolean local7 = true;
		@Pc(17) Class3_Sub12 local17 = new Class3_Sub12(arg2);
		@Pc(19) int local19 = -1;
		label54: while (true) {
			@Pc(23) int local23 = local17.method1948();
			if (local23 == 0) {
				return local7;
			}
			local19 += local23;
			@Pc(31) int local31 = 0;
			@Pc(33) boolean local33 = false;
			while (true) {
				@Pc(41) int local41;
				while (!local33) {
					local41 = local17.method1948();
					if (local41 == 0) {
						continue label54;
					}
					local31 += local41 - 1;
					@Pc(68) int local68 = local31 & 0x3F;
					@Pc(74) int local74 = local31 >> 6 & 0x3F;
					@Pc(80) int local80 = local17.method1936() >> 2;
					@Pc(85) int local85 = local74 + arg0;
					@Pc(90) int local90 = local68 + arg1;
					if (local85 > 0 && local90 > 0 && local85 < 103 && local90 < 103) {
						@Pc(109) Class3_Sub1_Sub17 local109 = Static18.method517(local19);
						if (local80 != 22 || !Static14.aBoolean15 || local109.anInt3424 != 0 || local109.anInt3436 == 1 || local109.aBoolean125) {
							local33 = true;
							if (!local109.method2281()) {
								Static79.anInt2485++;
								local7 = false;
							}
						}
					}
				}
				local41 = local17.method1948();
				if (local41 == 0) {
					break;
				}
				local17.method1936();
			}
		}
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(IIBLclient!gd;I)V")
	public static void method1351(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class3_Sub1_Sub2_Sub2 arg2, @OriginalArg(4) int arg3) {
		Static62.aClass16_47.method1668();
		Static63.aClass3_Sub1_Sub2_Sub4_13.method1903(0, 0);
		arg2.method842(Static55.aClass60_777, 55, 28, 16777215, 0);
		if (arg1 == 0) {
			arg2.method842(Static21.aClass60_328, 55, 41, 65280, 0);
		}
		if (arg1 == 1) {
			arg2.method842(Static18.aClass60_296, 55, 41, 16776960, 0);
		}
		if (arg1 == 2) {
			arg2.method842(Static83.aClass60_1098, 55, 41, 16711680, 0);
		}
		if (arg1 == 3) {
			arg2.method842(Static114.aClass60_1331, 55, 41, 65535, 0);
		}
		arg2.method842(Static2.aClass60_54, 184, 28, 16777215, 0);
		if (arg3 == 0) {
			arg2.method842(Static21.aClass60_328, 184, 41, 65280, 0);
		}
		if (arg3 == 1) {
			arg2.method842(Static18.aClass60_296, 184, 41, 16776960, 0);
		}
		if (arg3 == 2) {
			arg2.method842(Static83.aClass60_1098, 184, 41, 16711680, 0);
		}
		arg2.method842(Static89.aClass60_1141, 324, 28, 16777215, 0);
		if (arg0 == 0) {
			arg2.method842(Static21.aClass60_328, 324, 41, 65280, 0);
		}
		if (arg0 == 1) {
			arg2.method842(Static18.aClass60_296, 324, 41, 16776960, 0);
		}
		if (arg0 == 2) {
			arg2.method842(Static83.aClass60_1098, 324, 41, 16711680, 0);
		}
		arg2.method836(Static86.aClass60_719, 417, 17, 85, 25, 16777215, 0, 1, 1, 0);
		try {
			@Pc(149) Graphics local149 = Static2.aCanvas1.getGraphics();
			Static62.aClass16_47.method1664(0, 453, local149);
		} catch (@Pc(157) Exception local157) {
			Static2.aCanvas1.repaint();
		}
	}
}
