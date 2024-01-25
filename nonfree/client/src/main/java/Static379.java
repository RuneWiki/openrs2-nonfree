import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static379 {

	@OriginalMember(owner = "client!wc", name = "o", descriptor = "Lclient!cs;")
	public static final Class41 aClass41_26 = new Class41(68, 8);

	@OriginalMember(owner = "client!wc", name = "q", descriptor = "I")
	public static int anInt1192 = 0;

	@OriginalMember(owner = "client!wc", name = "v", descriptor = "I")
	public static int anInt1197 = 0;

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public static int method1117(@OriginalArg(0) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < local8; local12++) {
			local10 = (local10 << 5) + arg0.charAt(local12) - local10;
		}
		return local10;
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIII[[[BIIIBIIILclient!km;)V")
	public static void method1118(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[][][] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) Class82 arg11) {
		if (arg7 == 0 || arg10 == 0) {
			return;
		}
		if (arg7 == 9) {
			arg7 = 1;
			arg0 = arg0 + 1 & 0x3;
		}
		if (arg7 == 10) {
			arg7 = 1;
			arg0 = arg0 + 3 & 0x3;
		}
		if (arg7 == 11) {
			arg7 = 8;
			arg0 = arg0 + 3 & 0x3;
		}
		arg11.method4492(arg2, arg5, arg3, arg1, arg9, arg8, arg4[arg7 - 1][arg0], arg10, arg6);
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(BC)B")
	public static byte method1121(@OriginalArg(1) char arg0) {
		@Pc(29) byte local29;
		if (arg0 > '\u0000' && arg0 < '\u0080' || !(arg0 < ' ' || arg0 > 'ÿ')) {
			local29 = (byte) arg0;
		} else if (arg0 == '€') {
			local29 = -128;
		} else if (arg0 == '‚') {
			local29 = -126;
		} else if (arg0 == 'ƒ') {
			local29 = -125;
		} else if (arg0 == '„') {
			local29 = -124;
		} else if (arg0 == '…') {
			local29 = -123;
		} else if (arg0 == '†') {
			local29 = -122;
		} else if (arg0 == '‡') {
			local29 = -121;
		} else if (arg0 == 'ˆ') {
			local29 = -120;
		} else if (arg0 == '‰') {
			local29 = -119;
		} else if (arg0 == 'Š') {
			local29 = -118;
		} else if (arg0 == '‹') {
			local29 = -117;
		} else if (arg0 == 'Œ') {
			local29 = -116;
		} else if (arg0 == 'Ž') {
			local29 = -114;
		} else if (arg0 == '‘') {
			local29 = -111;
		} else if (arg0 == '’') {
			local29 = -110;
		} else if (arg0 == '“') {
			local29 = -109;
		} else if (arg0 == '”') {
			local29 = -108;
		} else if (arg0 == '•') {
			local29 = -107;
		} else if (arg0 == '–') {
			local29 = -106;
		} else if (arg0 == '—') {
			local29 = -105;
		} else if (arg0 == '˜') {
			local29 = -104;
		} else if (arg0 == '™') {
			local29 = -103;
		} else if (arg0 == 'š') {
			local29 = -102;
		} else if (arg0 == '›') {
			local29 = -101;
		} else if (arg0 == 'œ') {
			local29 = -100;
		} else if (arg0 == 'ž') {
			local29 = -98;
		} else if (arg0 == 'Ÿ') {
			local29 = -97;
		} else {
			local29 = 63;
		}
		return local29;
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(ZI)I")
	public static int method1123(@OriginalArg(1) int arg0) {
		return arg0 >> 11 & 0x7F;
	}

	@OriginalMember(owner = "client!wc", name = "f", descriptor = "(I)V")
	public static void method1125() {
		for (@Pc(13) Class2_Sub22 local13 = (Class2_Sub22) Static230.aClass210_30.method5035(); local13 != null; local13 = (Class2_Sub22) Static230.aClass210_30.method5037()) {
			if (local13.anInt3083 == -1) {
				local13.anInt3077 = 0;
				Static228.method3796(local13);
			} else {
				local13.method5745();
			}
		}
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(ZC)C")
	public static char method1126(@OriginalArg(1) char arg0) {
		return arg0 == 'µ' || arg0 == 'ƒ' ? arg0 : Character.toTitleCase(arg0);
	}
}
