import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static141 {

	@OriginalMember(owner = "client!kd", name = "d", descriptor = "Lclient!jl;")
	public static Class89 aClass89_46 = new Class89(30);

	@OriginalMember(owner = "client!kd", name = "i", descriptor = "[Z")
	public static boolean[] aBooleanArray26 = new boolean[100];

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(ZLjava/lang/String;Ljava/lang/String;I)I")
	public static int method4423(@OriginalArg(1) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2) {
		@Pc(4) int local4 = arg0.length();
		@Pc(22) int local22 = arg1.length();
		@Pc(24) int local24 = 0;
		@Pc(26) int local26 = 0;
		@Pc(28) char local28 = 0;
		@Pc(30) char local30 = 0;
		while (local4 > local26 - local28 || local22 > local24 - local30) {
			if (local26 - local28 >= local4) {
				return -1;
			}
			if (local24 - local30 >= local22) {
				return 1;
			}
			@Pc(78) char local78;
			if (local28 == '\u0000') {
				local78 = arg0.charAt(local26++);
			} else {
				local78 = local28;
			}
			@Pc(88) char local88;
			if (local30 == '\u0000') {
				local88 = arg1.charAt(local24++);
			} else {
				local88 = local30;
			}
			local28 = Static104.method1734(local78);
			local30 = Static104.method1734(local88);
			local78 = Static265.method4018(local78, arg2);
			local88 = Static265.method4018(local88, arg2);
			if (local78 != local88 && Character.toUpperCase(local78) != Character.toUpperCase(local88)) {
				local78 = Character.toLowerCase(local78);
				local88 = Character.toLowerCase(local88);
				if (local78 != local88) {
					return Static273.method4134(arg2, local78) - Static273.method4134(arg2, local88);
				}
			}
		}
		@Pc(158) int local158 = Math.min(local4, local22);
		@Pc(200) char local200;
		@Pc(160) int local160;
		for (local160 = 0; local160 < local158; local160++) {
			if (arg2 == 2) {
				local24 = local22 - local160 - 1;
				local26 = local4 - local160 - 1;
			} else {
				local24 = local160;
				local26 = local160;
			}
			@Pc(196) char local196 = arg0.charAt(local26);
			local200 = arg1.charAt(local24);
			if (local200 != local196 && Character.toUpperCase(local196) != Character.toUpperCase(local200)) {
				local196 = Character.toLowerCase(local196);
				local200 = Character.toLowerCase(local200);
				if (local196 != local200) {
					return Static273.method4134(arg2, local196) - Static273.method4134(arg2, local200);
				}
			}
		}
		local160 = local4 - local22;
		if (local160 != 0) {
			return local160;
		}
		for (@Pc(256) int local256 = 0; local256 < local158; local256++) {
			local200 = arg0.charAt(local256);
			@Pc(267) char local267 = arg1.charAt(local256);
			if (local200 != local267) {
				return Static273.method4134(arg2, local200) - Static273.method4134(arg2, local267);
			}
		}
		return 0;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "([BLjava/lang/String;IIII)I")
	public static int method4425(@OriginalArg(0) byte[] arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(10) int local10 = arg2;
		for (@Pc(20) int local20 = 0; local20 < local10; local20++) {
			@Pc(33) char local33 = arg1.charAt(local20);
			if (local33 > '\u0000' && local33 < '\u0080' || !(local33 < ' ' || local33 > 'ÿ')) {
				arg0[local20 + arg3] = (byte) local33;
			} else if (local33 == '€') {
				arg0[arg3 + local20] = -128;
			} else if (local33 == '‚') {
				arg0[local20 + arg3] = -126;
			} else if (local33 == 'ƒ') {
				arg0[arg3 + local20] = -125;
			} else if (local33 == '„') {
				arg0[arg3 + local20] = -124;
			} else if (local33 == '…') {
				arg0[arg3 + local20] = -123;
			} else if (local33 == '†') {
				arg0[local20 + arg3] = -122;
			} else if (local33 == '‡') {
				arg0[arg3 + local20] = -121;
			} else if (local33 == 'ˆ') {
				arg0[arg3 + local20] = -120;
			} else if (local33 == '‰') {
				arg0[arg3 + local20] = -119;
			} else if (local33 == 'Š') {
				arg0[local20 + arg3] = -118;
			} else if (local33 == '‹') {
				arg0[local20 + arg3] = -117;
			} else if (local33 == 'Œ') {
				arg0[local20 + arg3] = -116;
			} else if (local33 == 'Ž') {
				arg0[arg3 + local20] = -114;
			} else if (local33 == '‘') {
				arg0[arg3 + local20] = -111;
			} else if (local33 == '’') {
				arg0[local20 + arg3] = -110;
			} else if (local33 == '“') {
				arg0[arg3 + local20] = -109;
			} else if (local33 == '”') {
				arg0[local20 + arg3] = -108;
			} else if (local33 == '•') {
				arg0[local20 + arg3] = -107;
			} else if (local33 == '–') {
				arg0[arg3 + local20] = -106;
			} else if (local33 == '—') {
				arg0[arg3 + local20] = -105;
			} else if (local33 == '˜') {
				arg0[arg3 + local20] = -104;
			} else if (local33 == '™') {
				arg0[local20 + arg3] = -103;
			} else if (local33 == 'š') {
				arg0[local20 + arg3] = -102;
			} else if (local33 == '›') {
				arg0[local20 + arg3] = -101;
			} else if (local33 == 'œ') {
				arg0[local20 + arg3] = -100;
			} else if (local33 == 'ž') {
				arg0[local20 + arg3] = -98;
			} else if (local33 == 'Ÿ') {
				arg0[arg3 + local20] = -97;
			} else {
				arg0[arg3 + local20] = 63;
			}
		}
		return local10;
	}

	@OriginalMember(owner = "client!kd", name = "b", descriptor = "(I)V")
	public static void method4427() {
		if (Static148.aBoolean217) {
			return;
		}
		Static148.aBoolean217 = true;
		if (Static211.aBoolean285) {
			Static62.aFloat16 = (int) Static62.aFloat16 - 65 & 0xFFFFFF80;
		} else {
			Static96.aFloat30 += (-Static96.aFloat30 - 24.0F) / 2.0F;
		}
		Static136.aBoolean193 = true;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lclient!th;IB)Lclient!ml;")
	public static Class1_Sub3_Sub13 method4429(@OriginalArg(0) Class168 arg0, @OriginalArg(1) int arg1) {
		return Static57.method4770(arg0, arg1) ? Static210.method3368() : null;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(II)V")
	public static void method4430() {
		Static166.aClass89_23.method2273(5);
	}
}
