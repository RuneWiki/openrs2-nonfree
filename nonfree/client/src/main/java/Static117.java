import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static117 {

	@OriginalMember(owner = "client!uc", name = "h", descriptor = "Lclient!c;")
	public static Class10 aClass10_30;

	@OriginalMember(owner = "client!uc", name = "r", descriptor = "Lclient!tf;")
	public static Class4_Sub9 aClass4_Sub9_5;

	@OriginalMember(owner = "client!uc", name = "s", descriptor = "I")
	public static int anInt2727;

	@OriginalMember(owner = "client!uc", name = "d", descriptor = "Lclient!od;")
	public static Class60 aClass60_1056 = Static41.method597("auf der Hautpseite)3");

	@OriginalMember(owner = "client!uc", name = "e", descriptor = "Lclient!od;")
	public static Class60 aClass60_1057 = Static41.method597("<img=0>");

	@OriginalMember(owner = "client!uc", name = "g", descriptor = "Lclient!od;")
	private static Class60 aClass60_1058 = Static41.method597("Error loading your profile)3");

	@OriginalMember(owner = "client!uc", name = "i", descriptor = "Lclient!od;")
	public static Class60 aClass60_1059 = Static41.method597("(U1");

	@OriginalMember(owner = "client!uc", name = "t", descriptor = "Lclient!od;")
	private static Class60 aClass60_1063 = Static41.method597("skill)2");

	@OriginalMember(owner = "client!uc", name = "j", descriptor = "Lclient!od;")
	public static Class60 aClass60_1060 = aClass60_1063;

	@OriginalMember(owner = "client!uc", name = "k", descriptor = "I")
	public static int anInt2722 = 0;

	@OriginalMember(owner = "client!uc", name = "l", descriptor = "I")
	public static int anInt2723 = 0;

	@OriginalMember(owner = "client!uc", name = "m", descriptor = "Lclient!od;")
	public static Class60 aClass60_1061 = Static41.method597("(Y<)4col>");

	@OriginalMember(owner = "client!uc", name = "o", descriptor = "I")
	public static int anInt2725 = -1;

	@OriginalMember(owner = "client!uc", name = "p", descriptor = "Lclient!od;")
	public static Class60 aClass60_1062 = aClass60_1058;

	@OriginalMember(owner = "client!uc", name = "q", descriptor = "I")
	public static int anInt2726 = 0;

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Throwable;I)V")
	public static void method1885(@OriginalArg(0) String arg0, @OriginalArg(1) Throwable arg1) {
		try {
			@Pc(7) String local7 = "";
			if (arg1 != null) {
				local7 = Static60.method1994(arg1);
			}
			if (arg0 != null) {
				if (arg1 != null) {
					local7 = local7 + " | ";
				}
				local7 = local7 + arg0;
			}
			System.out.println("Error: " + local7);
			local7 = local7.replace(':', '.');
			local7 = local7.replace('@', '_');
			local7 = local7.replace('&', '_');
			local7 = local7.replace('#', '_');
			if (Static16.aClass81_1.anApplet1 != null) {
				@Pc(103) Class43 local103 = Static16.aClass81_1.method1940(new URL(Static16.aClass81_1.anApplet1.getCodeBase(), "clienterror.ws?c=" + Static11.anInt427 + "&u=" + Static21.aLong24 + "&v1=" + Static126.aString5 + "&v2=" + Static126.aString3 + "&e=" + local7));
				while (local103.anInt1565 == 0) {
					Static103.method1711(1L);
				}
				if (local103.anInt1565 == 1) {
					@Pc(127) DataInputStream local127 = (DataInputStream) local103.anObject2;
					local127.read();
					local127.close();
				}
			}
		} catch (@Pc(134) Exception local134) {
		}
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(I[Lclient!od;IB)Lclient!od;")
	public static Class60 method1886(@OriginalArg(0) int arg0, @OriginalArg(1) Class60[] arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = 0;
		for (@Pc(17) int local17 = 0; local17 < arg0; local17++) {
			if (arg1[local17 + arg2] == null) {
				arg1[local17 + arg2] = Static45.aClass60_419;
			}
			local7 += arg1[arg2 + local17].anInt1991;
		}
		@Pc(52) byte[] local52 = new byte[local7];
		@Pc(54) int local54 = 0;
		@Pc(64) Class60 local64;
		for (@Pc(56) int local56 = 0; local56 < arg0; local56++) {
			local64 = arg1[local56 + arg2];
			Static136.method700(local64.aByteArray21, 0, local52, local54, local64.anInt1991);
			local54 += local64.anInt1991;
		}
		local64 = new Class60();
		local64.anInt1991 = local7;
		local64.aByteArray21 = local52;
		return local64;
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(I)V")
	public static void method1887() {
		aClass60_1058 = null;
		aClass4_Sub9_5 = null;
		aClass60_1059 = null;
		aClass60_1060 = null;
		aClass60_1063 = null;
		aClass60_1057 = null;
		aClass60_1062 = null;
		aClass10_30 = null;
		aClass60_1061 = null;
		aClass60_1056 = null;
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(IIIIIII)I")
	public static int method1888(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if ((arg4 & 0x1) == 1) {
			@Pc(10) int local10 = arg0;
			arg0 = arg1;
			arg1 = local10;
		}
		@Pc(18) int local18 = arg2 & 0x3;
		if (local18 == 0) {
			return arg3;
		} else if (local18 == 1) {
			return 7 + 1 - arg5 - arg0;
		} else if (local18 == 2) {
			return 1 + 7 - arg1 - arg3;
		} else {
			return arg5;
		}
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(IIIBIIIII)V")
	public static void method1889(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (Static118.method1894(arg1)) {
			Static129.aClass4_Sub14Array2 = null;
			Static102.method1693(arg4, -1, Static82.aClass4_Sub14ArrayArray1[arg1], arg5, arg3, arg6, arg0, arg2, arg7);
			if (Static129.aClass4_Sub14Array2 != null) {
				Static102.method1693(arg4, -1412584499, Static129.aClass4_Sub14Array2, Static60.anInt2965, arg3, arg6, Static131.anInt2918, arg2, arg7);
				Static129.aClass4_Sub14Array2 = null;
			}
		} else if (arg4 == -1) {
			for (@Pc(19) int local19 = 0; local19 < 100; local19++) {
				Static105.aBooleanArray15[local19] = true;
			}
		} else {
			Static105.aBooleanArray15[arg4] = true;
		}
	}
}
