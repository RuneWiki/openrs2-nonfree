import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static431 {

	@OriginalMember(owner = "client!oda", name = "i", descriptor = "Lclient!aka;")
	public static Class18 aClass18_1;

	@OriginalMember(owner = "client!oda", name = "g", descriptor = "Lclient!rg;")
	public static Class310 aClass310_93;

	@OriginalMember(owner = "client!oda", name = "f", descriptor = "F")
	public static float aFloat134;

	@OriginalMember(owner = "client!oda", name = "a", descriptor = "(ID)V")
	public static void method6451(@OriginalArg(1) double arg0) {
		if (Static662.aDouble24 == arg0) {
			return;
		}
		for (@Pc(14) int local14 = 0; local14 < 256; local14++) {
			@Pc(28) int local28 = (int) (Math.pow((double) local14 / 255.0D, arg0) * 255.0D);
			Static353.anIntArray572[local14] = local28 <= 255 ? local28 : 255;
		}
		Static662.aDouble24 = arg0;
	}

	@OriginalMember(owner = "client!oda", name = "a", descriptor = "(BLclient!ha;)V")
	public static void method6453(@OriginalArg(1) Class144 arg0) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = 0;
		if (Static656.aBoolean741) {
			local7 = Static532.method7876();
			local9 = Static276.method4674();
		}
		Static297.method4855(arg0, Static501.anInt8738, Static78.anInt1261 + local9, Static189.anInt3199 - -local7, Static252.anInt4767);
		Static255.aClass68_4.method9422(Static21.aClass21_23.method324(Static26.anInt352), local9 + Static78.anInt1261 + 14, -1, local7 + 3 + Static189.anInt3199, -10660793);
		@Pc(59) int local59 = Static656.aClass118_1.method7586() + local7;
		@Pc(73) int local73 = local9 + Static656.aClass118_1.method7590();
		@Pc(77) int local77;
		@Pc(98) int local98;
		if (Static35.aBoolean45) {
			local77 = 0;
			for (@Pc(135) Class14_Sub2_Sub17 local135 = (Class14_Sub2_Sub17) Static440.aClass269_60.method6494(); local135 != null; local135 = (Class14_Sub2_Sub17) Static440.aClass269_60.method6491()) {
				local98 = local77 * 16 + Static78.anInt1261 + local9 + 31;
				local77++;
				if (local135.anInt9298 == 1) {
					Static23.method346(Static501.anInt8738, -1, local59, local98, local73, (Class14_Sub2_Sub20) local135.aClass269_142.aClass14_Sub2_42.aClass14_Sub2_67, Static252.anInt4767, arg0, -256, Static78.anInt1261 + local9, local7 + Static189.anInt3199);
				} else {
					Static321.method5056(Static501.anInt8738, 23448, -1, Static78.anInt1261 + local9, arg0, local59, local135, local98, Static252.anInt4767, local73, local7 + Static189.anInt3199, -256);
				}
			}
			if (Static52.aClass14_Sub2_Sub17_1 != null) {
				Static297.method4855(arg0, Static91.anInt1595, Static381.anInt6705, Static406.anInt7035, Static345.anInt5864);
				Static255.aClass68_4.method9422(Static52.aClass14_Sub2_Sub17_1.aString104, Static381.anInt6705 + 14, -1, Static406.anInt7035 + 3, -10660793);
				local77 = 0;
				for (@Pc(240) Class14_Sub2_Sub20 local240 = (Class14_Sub2_Sub20) Static52.aClass14_Sub2_Sub17_1.aClass269_142.method6494(); local240 != null; local240 = (Class14_Sub2_Sub20) Static52.aClass14_Sub2_Sub17_1.aClass269_142.method6491()) {
					@Pc(252) int local252 = local77 * 16 + Static381.anInt6705 + 31;
					local77++;
					Static23.method346(Static91.anInt1595, -1, local59, local252, local73, local240, Static345.anInt5864, arg0, -256, Static381.anInt6705, Static406.anInt7035);
				}
				Static317.method5021(Static381.anInt6705, Static345.anInt5864, Static406.anInt7035, Static91.anInt1595);
			}
		} else {
			local77 = 0;
			for (@Pc(82) Class14_Sub2_Sub20 local82 = (Class14_Sub2_Sub20) Static111.aClass32_7.method584(); local82 != null; local82 = (Class14_Sub2_Sub20) Static111.aClass32_7.method577()) {
				local98 = Static78.anInt1261 + local9 + (Static638.anInt10454 - local77 + -1) * 16 + 31;
				Static23.method346(Static501.anInt8738, -1, local59, local98, local73, local82, Static252.anInt4767, arg0, -256, local9 + Static78.anInt1261, Static189.anInt3199 - -local7);
				local77++;
			}
		}
		Static317.method5021(Static78.anInt1261 + local9, Static252.anInt4767, local7 + Static189.anInt3199, Static501.anInt8738);
	}

	@OriginalMember(owner = "client!oda", name = "a", descriptor = "(IB)Lclient!raa;")
	public static Class305 method6454(@OriginalArg(0) int arg0) {
		@Pc(13) Class305[] local13 = Static286.method4786();
		for (@Pc(15) int local15 = 0; local15 < local13.length; local15++) {
			@Pc(20) Class305 local20 = local13[local15];
			if (local20.anInt8872 == arg0) {
				return local20;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!oda", name = "a", descriptor = "([BB)Lclient!fia;")
	public static Class45 method6455(@OriginalArg(0) byte[] arg0) {
		if (arg0 == null) {
			throw new RuntimeException("");
		}
		while (true) {
			try {
				@Pc(21) Image local21 = Toolkit.getDefaultToolkit().createImage(arg0);
				@Pc(26) MediaTracker local26 = new MediaTracker(Static105.aClient4);
				local26.addImage(local21, 0);
				local26.waitForAll();
				@Pc(36) int local36 = local21.getWidth(Static105.aClient4);
				@Pc(40) int local40 = local21.getHeight(Static105.aClient4);
				if (!local26.isErrorAny() && local36 >= 0 && local40 >= 0) {
					@Pc(65) int[] local65 = new int[local36 * local40];
					@Pc(77) PixelGrabber local77 = new PixelGrabber(local21, 0, 0, local36, local40, local65, 0, local36);
					local77.grabPixels();
					return Static103.aClass144_3.method6941(local40, local36, local65, local36);
				}
				throw new RuntimeException("");
			} catch (@Pc(90) InterruptedException local90) {
			}
		}
	}

	@OriginalMember(owner = "client!oda", name = "a", descriptor = "(ILclient!uda;)Ljava/lang/String;")
	public static String method6456(@OriginalArg(1) Class14_Sub2_Sub20 arg0) {
		if (arg0.aString112 == null || arg0.aString112.length() == 0) {
			return arg0.aString113 == null || arg0.aString113.length() <= 0 ? arg0.aString114 : arg0.aString114 + Static21.aClass21_31.method324(Static26.anInt352) + arg0.aString113;
		} else if (arg0.aString113 == null || arg0.aString113.length() <= 0) {
			return arg0.aString114 + Static21.aClass21_31.method324(Static26.anInt352) + arg0.aString112;
		} else {
			return arg0.aString114 + Static21.aClass21_31.method324(Static26.anInt352) + arg0.aString113 + Static21.aClass21_31.method324(Static26.anInt352) + arg0.aString112;
		}
	}

	@OriginalMember(owner = "client!oda", name = "a", descriptor = "(IIIIIII)J")
	public static long method6457(@OriginalArg(0) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2) {
		Static183.aCalendar3.clear();
		Static183.aCalendar3.set(arg0, arg2, arg1, 12, 0, 0);
		return Static183.aCalendar3.getTime().getTime();
	}
}
