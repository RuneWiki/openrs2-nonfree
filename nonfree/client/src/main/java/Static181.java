import java.net.URL;
import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static181 {

	@OriginalMember(owner = "client!nh", name = "v", descriptor = "[Lclient!li;")
	public static Class99[] aClass99Array36;

	@OriginalMember(owner = "client!nh", name = "t", descriptor = "Ljava/util/zip/CRC32;")
	public static CRC32 aCRC32_34 = new CRC32();

	@OriginalMember(owner = "client!nh", name = "x", descriptor = "I")
	public static int anInt5855 = 0;

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(BIIZZ)V")
	public static void method4696(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) boolean arg3) {
		Static118.method1998(arg0, Static214.aClass64_Sub1Array3.length - 1, 0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(ZLjava/lang/String;Z)V")
	public static void method4698(@OriginalArg(0) boolean arg0, @OriginalArg(1) String arg1) {
		if (!arg0) {
			try {
				Static311.method1064("loggedout", Static95.aClass184_3.anApplet1);
			} catch (@Pc(19) Throwable local19) {
			}
			try {
				Static81.anApplet_Sub1_1.getAppletContext().showDocument(new URL(Static81.anApplet_Sub1_1.getCodeBase(), arg1), "_top");
			} catch (@Pc(31) Exception local31) {
			}
			return;
		}
		if (Static251.aBoolean330 && Static293.aBoolean393) {
			try {
				Static311.method1065(Static95.aClass184_3.anApplet1, "openjs", new Object[] { (new URL(Static81.anApplet_Sub1_1.getCodeBase(), arg1)).toString() });
				return;
			} catch (@Pc(57) Throwable local57) {
			}
		}
		try {
			Static81.anApplet_Sub1_1.getAppletContext().showDocument(new URL(Static81.anApplet_Sub1_1.getCodeBase(), arg1), "_blank");
		} catch (@Pc(69) Exception local69) {
		}
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(II)I")
	public static int method4699(@OriginalArg(0) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!nh", name = "b", descriptor = "(II)Z")
	public static boolean method4700(@OriginalArg(1) int arg0) {
		@Pc(7) Class64_Sub1 local7 = Static272.method4322(arg0);
		if (local7 == null) {
			return false;
		} else if (Static300.anInt5735 == 1 || Static300.anInt5735 == 2 || Static74.anInt1511 == 2) {
			Static250.anInt4906 = local7.anInt4596;
			Static253.aString168 = local7.aString154;
			if (Static74.anInt1511 != 0) {
				Static9.anInt185 = Static250.anInt4906 + 50000;
				Static17.anInt387 = Static250.anInt4906 + 40000;
				Static140.anInt2772 = Static17.anInt387;
			}
			return true;
		} else {
			@Pc(55) String local55 = "";
			@Pc(57) String local57 = "";
			if (Static147.aString99 != null) {
				local57 = "/p=" + Static147.aString99;
			}
			if (Static74.anInt1511 != 0) {
				local55 = ":" + (local7.anInt4596 + 7000);
			}
			@Pc(133) String local133 = "http://" + local7.aString154 + local55 + "/l=" + Static187.anInt3840 + "/a=" + Static212.anInt4120 + local57 + "/j" + (Static76.aBoolean90 ? "1" : "0") + ",o" + (Static102.aBoolean118 ? "1" : "0") + ",a2,m" + (Static230.aBoolean290 ? "1" : "0");
			try {
				Static191.aClient1.getAppletContext().showDocument(new URL(local133), "_self");
				return true;
			} catch (@Pc(143) Exception local143) {
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(IIZIIIIIII)V")
	public static void method4701(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg2 == arg4 && arg5 == arg3 && arg0 == arg1 && arg8 == arg7) {
			Static57.method1074(arg7, arg6, arg0, arg4, arg3);
			return;
		}
		@Pc(47) int local47 = arg3;
		@Pc(49) int local49 = arg4;
		@Pc(53) int local53 = arg4 * 3;
		@Pc(57) int local57 = arg3 * 3;
		@Pc(61) int local61 = arg2 * 3;
		@Pc(65) int local65 = arg5 * 3;
		@Pc(69) int local69 = arg1 * 3;
		@Pc(73) int local73 = arg8 * 3;
		@Pc(82) int local82 = local61 + arg0 - arg4 - local69;
		@Pc(91) int local91 = local53 + local69 - local61 - local61;
		@Pc(101) int local101 = local73 + local57 - local65 - local65;
		@Pc(111) int local111 = arg7 + local65 - local73 - arg3;
		@Pc(116) int local116 = local61 - local53;
		@Pc(121) int local121 = local65 - local57;
		for (@Pc(123) int local123 = 128; local123 <= 4096; local123 += 128) {
			@Pc(132) int local132 = local123 * local123 >> 12;
			@Pc(138) int local138 = local132 * local123 >> 12;
			@Pc(142) int local142 = local111 * local138;
			@Pc(146) int local146 = local138 * local82;
			@Pc(150) int local150 = local91 * local132;
			@Pc(154) int local154 = local116 * local123;
			@Pc(158) int local158 = local123 * local121;
			@Pc(162) int local162 = local132 * local101;
			@Pc(174) int local174 = arg4 + (local150 + local146 + local154 >> 12);
			@Pc(184) int local184 = (local162 + local142 + local158 >> 12) + arg3;
			Static57.method1074(local184, arg6, local174, local49, local47);
			local49 = local174;
			local47 = local184;
		}
	}
}
