import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static106 {

	@OriginalMember(owner = "client!gk", name = "p", descriptor = "I")
	public static int anInt2392;

	@OriginalMember(owner = "client!gk", name = "o", descriptor = "Z")
	public static boolean aBoolean205 = false;

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "([Ljava/lang/String;I)[Ljava/lang/String;")
	public static String[] method2334(@OriginalArg(0) String[] arg0) {
		@Pc(8) String[] local8 = new String[5];
		for (@Pc(10) int local10 = 0; local10 < 5; local10++) {
			local8[local10] = local10 + ": ";
			if (arg0 != null && arg0[local10] != null) {
				local8[local10] = local8[local10] + arg0[local10];
			}
		}
		return local8;
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(Ljava/lang/String;B)[B")
	public static byte[] method2335(@OriginalArg(0) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(11) byte[] local11 = new byte[local8];
		for (@Pc(13) int local13 = 0; local13 < local8; local13++) {
			@Pc(19) char local19 = arg0.charAt(local13);
			if (local19 > '\u0000' && local19 < '\u0080' || !(local19 < ' ' || local19 > 'ÿ')) {
				local11[local13] = (byte) local19;
			} else if (local19 == '€') {
				local11[local13] = -128;
			} else if (local19 == '‚') {
				local11[local13] = -126;
			} else if (local19 == 'ƒ') {
				local11[local13] = -125;
			} else if (local19 == '„') {
				local11[local13] = -124;
			} else if (local19 == '…') {
				local11[local13] = -123;
			} else if (local19 == '†') {
				local11[local13] = -122;
			} else if (local19 == '‡') {
				local11[local13] = -121;
			} else if (local19 == 'ˆ') {
				local11[local13] = -120;
			} else if (local19 == '‰') {
				local11[local13] = -119;
			} else if (local19 == 'Š') {
				local11[local13] = -118;
			} else if (local19 == '‹') {
				local11[local13] = -117;
			} else if (local19 == 'Œ') {
				local11[local13] = -116;
			} else if (local19 == 'Ž') {
				local11[local13] = -114;
			} else if (local19 == '‘') {
				local11[local13] = -111;
			} else if (local19 == '’') {
				local11[local13] = -110;
			} else if (local19 == '“') {
				local11[local13] = -109;
			} else if (local19 == '”') {
				local11[local13] = -108;
			} else if (local19 == '•') {
				local11[local13] = -107;
			} else if (local19 == '–') {
				local11[local13] = -106;
			} else if (local19 == '—') {
				local11[local13] = -105;
			} else if (local19 == '˜') {
				local11[local13] = -104;
			} else if (local19 == '™') {
				local11[local13] = -103;
			} else if (local19 == 'š') {
				local11[local13] = -102;
			} else if (local19 == '›') {
				local11[local13] = -101;
			} else if (local19 == 'œ') {
				local11[local13] = -100;
			} else if (local19 == 'ž') {
				local11[local13] = -98;
			} else if (local19 == 'Ÿ') {
				local11[local13] = -97;
			} else {
				local11[local13] = 63;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(BLclient!ae;)V")
	public static void method2336(@OriginalArg(1) Class4 arg0) {
		if (Static29.aBoolean66) {
			Static188.method3704(arg0);
		} else {
			Static111.method2401(arg0);
		}
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(Lclient!rd;B)V")
	public static void method2337(@OriginalArg(0) Class168 arg0) {
		@Pc(7) Class130 local7 = null;
		try {
			@Pc(15) Class193 local15 = arg0.method4836();
			while (local15.anInt6293 == 0) {
				Static102.method2276(1L);
			}
			if (local15.anInt6293 == 1) {
				local7 = (Class130) local15.anObject7;
				@Pc(39) Class2_Sub10 local39 = method2339();
				local7.method3570(local39.aByteArray57, local39.anInt4807, 0);
			}
		} catch (@Pc(49) Exception local49) {
		}
		try {
			if (local7 != null) {
				local7.method3574();
			}
		} catch (@Pc(56) Exception local56) {
		}
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(IIIIII)Z")
	public static boolean method2338(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(16) int local16;
		@Pc(20) int local20;
		if (arg1 != arg2 || arg3 != arg4) {
			for (local16 = arg1; local16 <= arg2; local16++) {
				for (local20 = arg3; local20 <= arg4; local20++) {
					if (Static26.anIntArrayArrayArray1[arg0][local16][local20] == -Static90.anInt5360) {
						return false;
					}
				}
			}
			local20 = (arg1 << 7) + 1;
			@Pc(142) int local142 = (arg3 << 7) + 2;
			@Pc(151) int local151 = Static301.aClass73Array31[arg0].method4931(arg1, arg3) + arg5;
			if (!Static97.method5912(local20, local151, local142)) {
				return false;
			}
			@Pc(164) int local164 = (arg2 << 7) - 1;
			if (!Static97.method5912(local164, local151, local142)) {
				return false;
			}
			@Pc(177) int local177 = (arg4 << 7) - 1;
			if (!Static97.method5912(local20, local151, local177)) {
				return false;
			} else if (Static97.method5912(local164, local151, local177)) {
				return true;
			} else {
				return false;
			}
		} else if (Static39.method938(arg0, arg1, arg3)) {
			local16 = arg1 << 7;
			local20 = arg3 << 7;
			return Static97.method5912(local16 + 1, Static301.aClass73Array31[arg0].method4931(arg1, arg3) + arg5, local20 + 1) && Static97.method5912(local16 + 128 - 1, Static301.aClass73Array31[arg0].method4931(arg1 + 1, arg3) + arg5, local20 + 1) && Static97.method5912(local16 + 128 - 1, Static301.aClass73Array31[arg0].method4931(arg1 + 1, arg3 + 1) + arg5, local20 + 128 - 1) && Static97.method5912(local16 + 1, Static301.aClass73Array31[arg0].method4931(arg1, arg3 + 1) + arg5, local20 + 128 - 1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(B)Lclient!dg;")
	private static Class2_Sub10 method2339() {
		@Pc(8) Class2_Sub10 local8 = new Class2_Sub10(38);
		local8.method4430(15);
		local8.method4430(Static316.anInt6385);
		local8.method4430(Static25.aBoolean123 ? 1 : 0);
		local8.method4430(Static148.aBoolean262 ? 1 : 0);
		local8.method4430(Static89.aBoolean169 ? 1 : 0);
		local8.method4430(Static21.aBoolean59 ? 1 : 0);
		local8.method4430(0);
		local8.method4430(Static40.aBoolean79 ? 1 : 0);
		local8.method4430(Static315.aBoolean563 ? 1 : 0);
		local8.method4430(Static201.aBoolean337 ? 1 : 0);
		local8.method4430(Static322.anInt6490);
		local8.method4430(Static348.aBoolean606 ? 1 : 0);
		local8.method4430(Static304.aBoolean545 ? 1 : 0);
		local8.method4430(Static209.aBoolean435 ? 1 : 0);
		local8.method4430(Static343.anInt6875);
		local8.method4430(Static103.aBoolean202 ? 1 : 0);
		local8.method4430(Static2.anInt65);
		local8.method4430(Static287.anInt5818);
		local8.method4430(Static303.anInt6082);
		local8.method4452(Static234.anInt4499);
		local8.method4452(Static228.anInt934);
		local8.method4430(Static185.method3335());
		local8.method4450(Static84.anInt1828);
		local8.method4430(Static6.anInt150);
		local8.method4430(Static259.aBoolean475 ? 1 : 0);
		local8.method4430(Static234.aBoolean412 ? 1 : 0);
		local8.method4430(Static114.anInt6585);
		local8.method4430(Static229.aBoolean222 ? 1 : 0);
		local8.method4430(Static231.aBoolean537 ? 1 : 0);
		local8.method4430(Static326.anInt6624);
		local8.method4430(Static32.aBoolean70 ? 1 : 0);
		local8.method4430(Static84.anInt1829);
		local8.method4430(Static349.anInt6923);
		return local8;
	}

	@OriginalMember(owner = "client!gk", name = "b", descriptor = "(B)V")
	public static void method2340() {
		Static92.aClass97_2.method5670();
		Static284.aClass61_1.method2652();
		if (Static22.aClass123_1 != null) {
			Static22.aClass123_1.method3698(Static240.aCanvas4);
		}
		Static293.aClient1.method1025();
		Static240.aCanvas4.setBackground(Color.black);
		Static160.anInt3243 = -1;
		Static92.aClass97_2 = Static146.method2860(Static240.aCanvas4);
		Static284.aClass61_1 = Static308.method4632(Static240.aCanvas4);
		if (Static22.aClass123_1 != null) {
			Static22.aClass123_1.method3696(Static240.aCanvas4);
		}
	}
}
