import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static39 {

	@OriginalMember(owner = "client!br", name = "d", descriptor = "[Lclient!le;")
	public static Class147[] aClass147Array1;

	@OriginalMember(owner = "client!br", name = "a", descriptor = "[Z")
	public static final boolean[] aBooleanArray3 = new boolean[100];

	@OriginalMember(owner = "client!br", name = "b", descriptor = "I")
	public static final int anInt737 = 0;

	@OriginalMember(owner = "client!br", name = "a", descriptor = "([BLjava/lang/String;BI)I")
	public static int method633(@OriginalArg(0) byte[] arg0, @OriginalArg(1) String arg1, @OriginalArg(3) int arg2) {
		@Pc(8) int local8 = arg1.length();
		@Pc(10) int local10 = arg2;
		for (@Pc(12) int local12 = 0; local12 < local8; local12++) {
			@Pc(23) char local23 = arg1.charAt(local12);
			if (local23 <= '\u007f') {
				arg0[local10++] = (byte) local23;
			} else if (local23 <= '\u07ff') {
				arg0[local10++] = (byte) (local23 >> 6 | 0xC0);
				arg0[local10++] = (byte) (local23 & 0x3F | 0x80);
			} else {
				arg0[local10++] = (byte) (local23 >> 12 | 0xE0);
				arg0[local10++] = (byte) (local23 >> 6 & 0x3F | 0x80);
				arg0[local10++] = (byte) (local23 & 0x3F | 0x80);
			}
		}
		return local10 - arg2;
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(III)V")
	public static void method634(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class258 local7 = Static319.aClass258ArrayArrayArray3[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		if (local7.aClass2_Sub4_2 != null) {
			local7.aClass2_Sub4_2 = null;
		}
		if (local7.aClass2_Sub4_3 != null) {
			local7.aClass2_Sub4_3 = null;
		}
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(CII)C")
	public static char method635(@OriginalArg(0) char arg0, @OriginalArg(2) int arg1) {
		if (arg0 >= 'À' && arg0 <= 'ÿ') {
			if (arg0 >= 'À' && arg0 <= 'Æ') {
				return 'A';
			}
			if (arg0 == 'Ç') {
				return 'C';
			}
			if (arg0 >= 'È' && arg0 <= 'Ë') {
				return 'E';
			}
			if (arg0 >= 'Ì' && arg0 <= 'Ï') {
				return 'I';
			}
			if (arg0 == 'Ñ' && arg1 != 0) {
				return 'N';
			}
			if (arg0 >= 'Ò' && arg0 <= 'Ö') {
				return 'O';
			}
			if (arg0 >= 'Ù' && arg0 <= 'Ü') {
				return 'U';
			}
			if (arg0 == 'Ý') {
				return 'Y';
			}
			if (arg0 == 'ß') {
				return 's';
			}
			if (arg0 >= 'à' && arg0 <= 'æ') {
				return 'a';
			}
			if (arg0 == 'ç') {
				return 'c';
			}
			if (arg0 >= 'è' && arg0 <= 'ë') {
				return 'e';
			}
			if (arg0 >= 'ì' && arg0 <= 'ï') {
				return 'i';
			}
			if (arg0 == 'ñ' && arg1 != 0) {
				return 'n';
			}
			if (arg0 >= 'ò' && arg0 <= 'ö') {
				return 'o';
			}
			if (arg0 >= 'ù' && arg0 <= 'ü') {
				return 'u';
			}
			if (arg0 == 'ý' || arg0 == 'ÿ') {
				return 'y';
			}
		}
		if (arg0 == 'Œ') {
			return 'O';
		} else if (arg0 == 'œ') {
			return 'o';
		} else if (arg0 == 'Ÿ') {
			return 'Y';
		} else {
			return arg0;
		}
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(IIBII)I")
	public static int method636(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(20) int local20 = 65536 - Class30.anIntArray37[arg2 * 8192 / arg3] >> 1;
		return (arg0 * local20 >> 16) + (arg1 * (65536 - local20) >> 16);
	}
}
