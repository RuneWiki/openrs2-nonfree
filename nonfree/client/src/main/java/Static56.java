import java.awt.Component;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static56 {

	@OriginalMember(owner = "client!e", name = "l", descriptor = "[I")
	public static int[] anIntArray65;

	@OriginalMember(owner = "client!e", name = "o", descriptor = "Lclient!qb;")
	public static Class142 aClass142_4;

	@OriginalMember(owner = "client!e", name = "t", descriptor = "Lclient!pa;")
	public static Class1_Sub2_Sub1 aClass1_Sub2_Sub1_12;

	@OriginalMember(owner = "client!e", name = "p", descriptor = "Ljava/lang/String;")
	public static String aString64 = " is already on your friend list.";

	@OriginalMember(owner = "client!e", name = "B", descriptor = "Ljava/lang/String;")
	public static String aString65 = "Loaded fonts";

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(Ljava/lang/String;IZ)V")
	public static void method983(@OriginalArg(0) String arg0, @OriginalArg(2) boolean arg1) {
		if (!arg1) {
			try {
				Static321.method2506("loggedout", Static26.aClass154_1.anApplet1);
			} catch (@Pc(17) Throwable local17) {
			}
			try {
				Static107.anApplet_Sub1_1.getAppletContext().showDocument(new URL(Static107.anApplet_Sub1_1.getCodeBase(), arg0), "_top");
			} catch (@Pc(29) Exception local29) {
			}
			return;
		}
		if (Static156.aBoolean211 && Static64.aBoolean77) {
			try {
				Static321.method2504(new Object[] { (new URL(Static107.anApplet_Sub1_1.getCodeBase(), arg0)).toString() }, Static26.aClass154_1.anApplet1, "openjs");
				return;
			} catch (@Pc(56) Throwable local56) {
			}
		}
		try {
			Static107.anApplet_Sub1_1.getAppletContext().showDocument(new URL(Static107.anApplet_Sub1_1.getCodeBase(), arg0), "_blank");
		} catch (@Pc(68) Exception local68) {
		}
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(IIIJ)Z")
	public static boolean method985(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) long arg3) {
		@Pc(7) Class1_Sub33 local7 = Static105.aClass1_Sub33ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 == null) {
			return false;
		} else if (local7.aClass160_1 != null && local7.aClass160_1.aLong170 == arg3) {
			return true;
		} else if (local7.aClass52_1 != null && local7.aClass52_1.aLong63 == arg3) {
			return true;
		} else if (local7.aClass36_1 != null && local7.aClass36_1.aLong44 == arg3) {
			return true;
		} else {
			for (@Pc(46) int local46 = 0; local46 < local7.anInt5733; local46++) {
				if (local7.aClass161Array3[local46].aLong171 == arg3) {
					return true;
				}
			}
			return false;
		}
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(ILjava/awt/Component;)V")
	public static void method987(@OriginalArg(1) Component arg0) {
		arg0.removeKeyListener(Static16.aClass111_115);
		arg0.removeFocusListener(Static16.aClass111_115);
		Static221.anInt4095 = -1;
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(III)V")
	public static void method988(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class1_Sub2_Sub11 local8 = Static5.method35(arg0, 13);
		local8.method2866();
		local8.anInt3315 = arg1;
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(IIIIZI)V")
	public static void method989(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4) {
		if (arg1 < 1) {
			arg1 = 1;
		}
		if (arg2 < 1) {
			arg2 = 1;
		}
		if (Static156.aBoolean211) {
			@Pc(24) int local24 = arg1 - 334;
			if (local24 < 0) {
				local24 = 0;
			} else if (local24 > 100) {
				local24 = 100;
			}
			@Pc(51) int local51 = Static2.aShort1 + (Static301.aShort54 - Static2.aShort1) * local24 / 100;
			if (local51 < Static269.aShort19) {
				local51 = Static269.aShort19;
			} else if (local51 > Static285.aShort47) {
				local51 = Static285.aShort47;
			}
			@Pc(77) int local77 = arg1 * local51 * 512 / (arg2 * 334);
			@Pc(123) int local123;
			@Pc(130) int local130;
			@Pc(93) short local93;
			if (local77 < Static249.aShort34) {
				local93 = Static249.aShort34;
				local51 = arg2 * local93 * 334 / (arg1 * 512);
				if (local51 > Static285.aShort47) {
					local51 = Static285.aShort47;
					local123 = arg1 * local51 * 512 / (local93 * 334);
					local130 = (arg2 - local123) / 2;
					if (arg3) {
						Static119.method2126();
						Static119.method2129(arg4, arg0, local130, arg1, 0);
						Static119.method2129(arg2 + arg4 - local130, arg0, local130, arg1, 0);
					}
					arg4 += local130;
					arg2 -= local130 * 2;
				}
			} else if (Static38.aShort25 < local77) {
				local93 = Static38.aShort25;
				local51 = local93 * arg2 * 334 / (arg1 * 512);
				if (Static269.aShort19 > local51) {
					local51 = Static269.aShort19;
					local123 = local93 * 334 * arg2 / (local51 * 512);
					local130 = (arg1 - local123) / 2;
					if (arg3) {
						Static119.method2126();
						Static119.method2129(arg4, arg0, arg2, local130, 0);
						Static119.method2129(arg4, arg0 + arg1 - local130, arg2, local130, 0);
					}
					arg0 += local130;
					arg1 -= local130 * 2;
				}
			}
			Static188.anInt3592 = arg1 * local51 / 334;
		}
		Static41.anInt848 = (short) arg1;
		Static206.anInt3930 = arg4;
		Static207.anInt3955 = arg0;
		Static57.anInt1086 = (short) arg2;
	}

	@OriginalMember(owner = "client!e", name = "c", descriptor = "(I)V")
	public static void method990() {
		Static55.aClass187_34.method4525();
		Static191.aClass187_101.method4525();
		Static116.aClass187_68.method4525();
	}
}
