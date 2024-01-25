import java.awt.Canvas;
import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static315 {

	@OriginalMember(owner = "client!qa", name = "p", descriptor = "I")
	public static int anInt5855;

	@OriginalMember(owner = "client!qa", name = "s", descriptor = "[[I")
	public static int[][] anIntArrayArray171;

	@OriginalMember(owner = "client!qa", name = "e", descriptor = "Lclient!fg;")
	public static final Class84 aClass84_77 = new Class84("M", "M", "M", "M");

	@OriginalMember(owner = "client!qa", name = "m", descriptor = "I")
	public static final int anInt5852 = 1338;

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(BLjava/lang/String;)J")
	public static long method4683(@OriginalArg(1) String arg0) {
		@Pc(7) long local7 = 0L;
		@Pc(15) int local15 = arg0.length();
		for (@Pc(17) int local17 = 0; local17 < local15; local17++) {
			local7 *= 37L;
			@Pc(27) char local27 = arg0.charAt(local17);
			if (local27 >= 'A' && local27 <= 'Z') {
				local7 += local27 - 64;
			} else if (local27 >= 'a' && local27 <= 'z') {
				local7 += local27 - 96;
			} else if (local27 >= '0' && local27 <= '9') {
				local7 += local27 - 21;
			}
			if (local7 >= 177917621779460413L) {
				break;
			}
		}
		while (local7 % 37L == 0L && local7 != 0L) {
			local7 /= 37L;
		}
		return local7;
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(BLjava/lang/Throwable;Ljava/lang/String;)V")
	public static void method4700(@OriginalArg(1) Throwable arg0, @OriginalArg(2) String arg1) {
		try {
			@Pc(7) String local7 = "";
			if (arg0 != null) {
				local7 = Static43.method4231(arg0);
			}
			if (arg1 != null) {
				if (arg0 != null) {
					local7 = local7 + " | ";
				}
				local7 = local7 + arg1;
			}
			Static95.method1510(local7);
			local7 = Static276.method4001(":", local7, "%3a");
			local7 = Static276.method4001("@", local7, "%40");
			local7 = Static276.method4001("&", local7, "%26");
			local7 = Static276.method4001("#", local7, "%23");
			if (Static293.aClass138_4.anApplet1 != null) {
				@Pc(99) Class100 local99 = Static293.aClass138_4.method3197(new URL(Static293.aClass138_4.anApplet1.getCodeBase(), "clienterror.ws?c=" + Static452.anInt7811 + "&u=" + Static141.aLong76 + "&v1=" + Static210.aString27 + "&v2=" + Static210.aString31 + "&e=" + local7));
				while (local99.anInt2365 == 0) {
					Static67.method1189(1L);
				}
				if (local99.anInt2365 == 1) {
					@Pc(123) DataInputStream local123 = (DataInputStream) local99.anObject4;
					local123.read();
					local123.close();
				}
			}
		} catch (@Pc(130) Exception local130) {
		}
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(ILclient!kj;ILjava/awt/Canvas;ILclient!m;)Lclient!qa;")
	public static synchronized Class109 method4727(@OriginalArg(1) Class138 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Canvas arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Interface7 arg4) {
		@Pc(7) int local7 = -1;
		for (@Pc(9) int local9 = 0; local9 < 8; local9++) {
			if (!Static357.aBooleanArray23[local9]) {
				local7 = local9;
				break;
			}
		}
		if (local7 == -1) {
			throw new IllegalStateException("NFTI");
		}
		@Pc(47) Class109 local47;
		if (arg3 == 0) {
			local47 = Static160.method2429(arg4, local7, arg2);
		} else if (arg3 == 1) {
			local47 = Static192.method2933(arg0, local7, arg4, arg2, arg1);
		} else if (arg3 == 2) {
			local47 = Static78.method1350(arg4, local7, arg0, arg2);
		} else {
			throw new IllegalArgumentException("UM");
		}
		Static357.aBooleanArray23[local7] = true;
		return local47;
	}

	@OriginalMember(owner = "client!qa", name = "c", descriptor = "(II)I")
	public static int method4741(@OriginalArg(0) int arg0) {
		if (arg0 == 6407 || arg0 == 34843 || arg0 == 34837) {
			return 6407;
		} else if (arg0 == 6408 || arg0 == 34842 || arg0 == 34836) {
			return 6408;
		} else if (arg0 == 6406 || arg0 == 34844) {
			return 6406;
		} else if (arg0 == 6409 || arg0 == 34846) {
			return 6409;
		} else if (arg0 == 6410 || arg0 == 34847) {
			return 6410;
		} else if (arg0 == 6402) {
			return 6402;
		} else {
			throw new IllegalArgumentException("");
		}
	}
}
