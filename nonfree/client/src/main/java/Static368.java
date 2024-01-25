import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static368 {

	@OriginalMember(owner = "client!nd", name = "b", descriptor = "Lclient!hba;")
	public static Class115 aClass115_4;

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(I)I")
	public static int method5887(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = -1;
		for (@Pc(3) int local3 = 0; local3 < Static40.anInt1428 - 1; local3++) {
			if (arg0 < Static509.anIntArray482[local3] + Static30.anIntArray31[local3]) {
				local1 = local3;
				break;
			}
		}
		if (local1 == -1) {
			local1 = Static40.anInt1428 - 1;
		}
		return local1;
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(IBLclient!ha;)Lclient!ufa;")
	public static Class4 method5888(@OriginalArg(0) int arg0, @OriginalArg(2) Class5 arg1) {
		@Pc(15) Class6_Sub39 local15 = (Class6_Sub39) Static475.aClass380_36.method8747((long) arg0);
		if (local15 != null) {
			@Pc(22) Class6_Sub13_Sub3 local22 = local15.aClass62_Sub1_1.method2412();
			local15.aBoolean638 = true;
			if (local22 != null) {
				return local22.method7340(arg1);
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(Ljava/lang/String;III[BI)I")
	public static int method5889(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) byte[] arg3) {
		@Pc(10) int local10 = arg1;
		for (@Pc(12) int local12 = 0; local12 < local10; local12++) {
			@Pc(20) char local20 = arg0.charAt(local12);
			if (local20 > '\u0000' && local20 < '\u0080' || !(local20 < ' ' || local20 > 'ÿ')) {
				arg3[arg2 + local12] = (byte) local20;
			} else if (local20 == '€') {
				arg3[local12 + arg2] = -128;
			} else if (local20 == '‚') {
				arg3[local12 + arg2] = -126;
			} else if (local20 == 'ƒ') {
				arg3[arg2 + local12] = -125;
			} else if (local20 == '„') {
				arg3[arg2 + local12] = -124;
			} else if (local20 == '…') {
				arg3[local12 + arg2] = -123;
			} else if (local20 == '†') {
				arg3[arg2 + local12] = -122;
			} else if (local20 == '‡') {
				arg3[local12 + arg2] = -121;
			} else if (local20 == 'ˆ') {
				arg3[arg2 + local12] = -120;
			} else if (local20 == '‰') {
				arg3[local12 + arg2] = -119;
			} else if (local20 == 'Š') {
				arg3[arg2 + local12] = -118;
			} else if (local20 == '‹') {
				arg3[local12 + arg2] = -117;
			} else if (local20 == 'Œ') {
				arg3[local12 + arg2] = -116;
			} else if (local20 == 'Ž') {
				arg3[local12 + arg2] = -114;
			} else if (local20 == '‘') {
				arg3[arg2 + local12] = -111;
			} else if (local20 == '’') {
				arg3[local12 + arg2] = -110;
			} else if (local20 == '“') {
				arg3[arg2 + local12] = -109;
			} else if (local20 == '”') {
				arg3[arg2 + local12] = -108;
			} else if (local20 == '•') {
				arg3[arg2 + local12] = -107;
			} else if (local20 == '–') {
				arg3[local12 + arg2] = -106;
			} else if (local20 == '—') {
				arg3[local12 + arg2] = -105;
			} else if (local20 == '˜') {
				arg3[arg2 + local12] = -104;
			} else if (local20 == '™') {
				arg3[local12 + arg2] = -103;
			} else if (local20 == 'š') {
				arg3[local12 + arg2] = -102;
			} else if (local20 == '›') {
				arg3[local12 + arg2] = -101;
			} else if (local20 == 'œ') {
				arg3[local12 + arg2] = -100;
			} else if (local20 == 'ž') {
				arg3[local12 + arg2] = -98;
			} else if (local20 == 'Ÿ') {
				arg3[local12 + arg2] = -97;
			} else {
				arg3[arg2 + local12] = 63;
			}
		}
		return local10;
	}
}
