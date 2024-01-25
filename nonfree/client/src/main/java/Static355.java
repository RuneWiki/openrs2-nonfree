import java.awt.Rectangle;
import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static355 {

	@OriginalMember(owner = "client!un", name = "T", descriptor = "I")
	public static int anInt5980;

	@OriginalMember(owner = "client!un", name = "R", descriptor = "Lclient!us;")
	public static final Class234 aClass234_122 = new Class234(62, -2);

	@OriginalMember(owner = "client!un", name = "U", descriptor = "Lclient!dk;")
	public static final Class57 aClass57_91 = new Class57("flash1:", "blinken1:", "clignotant1:", "flash1:");

	@OriginalMember(owner = "client!un", name = "W", descriptor = "I")
	public static int anInt5982 = -1;

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(IIIIB)V")
	public static void method5327(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		for (@Pc(8) int local8 = 0; local8 < Static298.anInt5150; local8++) {
			@Pc(14) Rectangle local14 = Class3_Sub1_Sub15.aRectangleArray4[local8];
			if (local14.x + local14.width > arg0 && arg3 + arg0 > local14.x && local14.y + local14.height > arg2 && local14.y < arg1 + arg2) {
				Static160.aBooleanArray129[local8] = true;
			}
		}
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Throwable;B)V")
	public static void method5328(@OriginalArg(0) String arg0, @OriginalArg(1) Throwable arg1) {
		try {
			@Pc(7) String local7 = "";
			if (arg1 != null) {
				local7 = Static350.method5274(arg1);
			}
			if (arg0 != null) {
				if (arg1 != null) {
					local7 = local7 + " | ";
				}
				local7 = local7 + arg0;
			}
			Static69.method1180(local7);
			local7 = Static197.method3101(local7, ":", "%3a");
			local7 = Static197.method3101(local7, "@", "%40");
			local7 = Static197.method3101(local7, "&", "%26");
			local7 = Static197.method3101(local7, "#", "%23");
			if (Static275.aClass156_4.anApplet1 != null) {
				@Pc(110) Class133 local110 = Static275.aClass156_4.method3638(new URL(Static275.aClass156_4.anApplet1.getCodeBase(), "clienterror.ws?c=" + Static266.anInt4709 + "&u=" + Static304.aLong124 + "&v1=" + Static218.aString47 + "&v2=" + Static218.aString42 + "&e=" + local7));
				while (local110.anInt3257 == 0) {
					Static37.method613(1L);
				}
				if (local110.anInt3257 == 1) {
					@Pc(131) DataInputStream local131 = (DataInputStream) local110.anObject3;
					local131.read();
					local131.close();
				}
			}
		} catch (@Pc(138) Exception local138) {
		}
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(IIBII)V")
	public static void method5329(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(9) float local9 = (float) Static42.anInt539 / (float) Static42.anInt536;
		@Pc(11) int local11 = arg0;
		@Pc(17) int local17 = arg3;
		if (local9 < 1.0F) {
			local17 = (int) (local9 * (float) arg0);
		} else {
			local11 = (int) ((float) arg3 / local9);
		}
		@Pc(44) int local44 = arg2 - (arg3 - local17) / 2;
		@Pc(52) int local52 = arg1 - (arg0 - local11) / 2;
		Static253.anInt4565 = -1;
		Static325.anInt5538 = Static42.anInt536 * local52 / local11;
		Static125.anInt2380 = -1;
		Static257.anInt4618 = Static42.anInt539 - local44 * Static42.anInt539 / local17;
		Static43.method691();
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(ZIIIII)V")
	public static void method5331(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(19) long local19 = (long) (arg4 | (arg0 ? Integer.MIN_VALUE : 0));
		@Pc(25) Class3_Sub18 local25 = (Class3_Sub18) Static390.aClass44_37.method942(local19);
		if (local25 == null) {
			local25 = new Class3_Sub18();
			Static390.aClass44_37.method948(local19, local25);
		}
		if (local25.anIntArray226.length <= arg1) {
			@Pc(46) int[] local46 = new int[arg1 + 1];
			@Pc(51) int[] local51 = new int[arg1 + 1];
			for (@Pc(53) int local53 = 0; local53 < local25.anIntArray226.length; local53++) {
				local46[local53] = local25.anIntArray226[local53];
				local51[local53] = local25.anIntArray227[local53];
			}
			for (@Pc(83) int local83 = local25.anIntArray226.length; local83 < arg1; local83++) {
				local46[local83] = -1;
				local51[local83] = 0;
			}
			local25.anIntArray226 = local46;
			local25.anIntArray227 = local51;
		}
		local25.anIntArray226[arg1] = arg3;
		local25.anIntArray227[arg1] = arg2;
	}
}
