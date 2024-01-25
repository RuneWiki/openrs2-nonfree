import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static330 {

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "I")
	public static int anInt5396;

	@OriginalMember(owner = "client!qk", name = "d", descriptor = "Lclient!hc;")
	public static Class101 aClass101_3;

	@OriginalMember(owner = "client!qk", name = "i", descriptor = "[Z")
	public static boolean[] aBooleanArray25;

	@OriginalMember(owner = "client!qk", name = "h", descriptor = "Lclient!lt;")
	public static final Class151 aClass151_170 = new Class151("Loaded config", "Konfig geladen.", "Fichiers config chargés", "Config carregada");

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(Z)I")
	public static int method4209() {
		if (Static70.aFrame1 == null) {
			return Static32.aBoolean49 ? 2 : 1;
		} else {
			return 3;
		}
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(BI)V")
	public static void method4211(@OriginalArg(1) int arg0) {
		Static391.method4951();
		Static283.method3696();
		Static442.method5552(true, arg0);
		Static280.method3525(Static213.aClass128_22, Static169.aClass113_55, Static166.aClass113_59);
		Static225.method3000(Static169.aClass113_55, Static213.aClass128_22);
		Static92.method1318(Static361.aClass49Array120);
		Static236.method3113();
		Static183.method4174();
		if (Static98.anInt1721 == 10) {
			Static239.method3125(false);
		} else if (Static98.anInt1721 == 30) {
			Static430.method5422(25);
		} else if (Static98.anInt1721 == 5) {
			Static284.method3706(Static213.aClass128_22, Static169.aClass113_55);
		}
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(III)Z")
	public static boolean method4212(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x580) != 0;
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
	public static String method4213(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return null;
		}
		@Pc(11) int local11 = 0;
		@Pc(19) int local19 = arg0.length();
		while (local11 < local19 && Static127.method1749(arg0.charAt(local11))) {
			local11++;
		}
		while (local11 < local19 && Static127.method1749(arg0.charAt(local19 - 1))) {
			local19--;
		}
		@Pc(56) int local56 = local19 - local11;
		if (local56 < 1 || local56 > 12) {
			return null;
		}
		@Pc(73) StringBuffer local73 = new StringBuffer(local56);
		for (@Pc(75) int local75 = local11; local75 < local19; local75++) {
			@Pc(81) char local81 = arg0.charAt(local75);
			if (Static360.method4662(local81)) {
				@Pc(91) char local91 = Static389.method1529(local81);
				if (local91 != '\u0000') {
					local73.append(local91);
				}
			}
		}
		if (local73.length() == 0) {
			return null;
		} else {
			return local73.toString();
		}
	}

	@OriginalMember(owner = "client!qk", name = "b", descriptor = "(III)Z")
	public static boolean method4214(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x20) != 0;
	}
}
