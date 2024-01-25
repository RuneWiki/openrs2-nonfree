import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static280 {

	@OriginalMember(owner = "client!rl", name = "b", descriptor = "[S")
	public static short[] aShortArray122 = new short[256];

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(I[BII)I")
	public static int method5741(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = -1;
		for (@Pc(9) int local9 = arg1; local9 < arg2; local9++) {
			local7 = Class156_Sub2.anIntArray397[(local7 ^ arg0[local9]) & 0xFF] ^ local7 >>> 8;
		}
		return ~local7;
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(Ljava/lang/String;Z)Ljava/lang/String;")
	public static String method5743(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return null;
		}
		@Pc(11) int local11 = 0;
		@Pc(14) int local14 = arg0.length();
		while (local14 > local11 && Static49.method1191(arg0.charAt(local11))) {
			local11++;
		}
		while (local14 > local11 && Static49.method1191(arg0.charAt(local14 - 1))) {
			local14--;
		}
		@Pc(48) int local48 = local14 - local11;
		if (local48 < 1 || local48 > 12) {
			return null;
		}
		@Pc(65) StringBuffer local65 = new StringBuffer(local48);
		for (@Pc(67) int local67 = local11; local67 < local14; local67++) {
			@Pc(73) char local73 = arg0.charAt(local67);
			if (Static156.method5348(local73)) {
				@Pc(81) char local81 = Static223.method5289(local73);
				if (local81 != '\u0000') {
					local65.append(local81);
				}
			}
		}
		if (local65.length() == 0) {
			return null;
		} else {
			return local65.toString();
		}
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(Lclient!he;Lclient!e;IIIIII)Lclient!gl;")
	public static Class2 method5744(@OriginalArg(0) Class83 arg0, @OriginalArg(1) Class46 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		Static288.aClass73_1.aBoolean155 = arg0 != null;
		Static288.aClass73_1.anInt2229 = arg6;
		Static288.aClass73_1.anInt2221 = arg3;
		Static288.aClass73_1.anInt2228 = arg4;
		Static288.aClass73_1.anInt2232 = arg5;
		Static288.aClass73_1.anInt2227 = arg1.anInt5722;
		Static288.aClass73_1.anInt2220 = arg2;
		return (Class2) Static92.aClass139_1.method3699(Static288.aClass73_1);
	}
}
