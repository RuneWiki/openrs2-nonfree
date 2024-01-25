import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static77 {

	@OriginalMember(owner = "client!cha", name = "r", descriptor = "Lclient!in;")
	public static final Class169 aClass169_43 = new Class169(116, 12);

	@OriginalMember(owner = "client!cha", name = "s", descriptor = "I")
	public static final int anInt1433 = 0;

	@OriginalMember(owner = "client!cha", name = "t", descriptor = "Lclient!hk;")
	public static final Class146 aClass146_3 = new Class146(7, 0, 1, 1);

	@OriginalMember(owner = "client!cha", name = "a", descriptor = "(ILjava/lang/String;IZI[B)I")
	public static int method1381(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) byte[] arg3) {
		@Pc(7) int local7 = arg2;
		for (@Pc(9) int local9 = 0; local9 < local7; local9++) {
			@Pc(16) char local16 = arg0.charAt(local9);
			if (local16 > '\u0000' && local16 < '\u0080' || !(local16 < ' ' || local16 > 'ÿ')) {
				arg3[local9 + arg1] = (byte) local16;
			} else if (local16 == '€') {
				arg3[arg1 + local9] = -128;
			} else if (local16 == '‚') {
				arg3[arg1 + local9] = -126;
			} else if (local16 == 'ƒ') {
				arg3[local9 + arg1] = -125;
			} else if (local16 == '„') {
				arg3[local9 + arg1] = -124;
			} else if (local16 == '…') {
				arg3[arg1 + local9] = -123;
			} else if (local16 == '†') {
				arg3[arg1 + local9] = -122;
			} else if (local16 == '‡') {
				arg3[arg1 + local9] = -121;
			} else if (local16 == 'ˆ') {
				arg3[arg1 + local9] = -120;
			} else if (local16 == '‰') {
				arg3[local9 + arg1] = -119;
			} else if (local16 == 'Š') {
				arg3[arg1 + local9] = -118;
			} else if (local16 == '‹') {
				arg3[arg1 + local9] = -117;
			} else if (local16 == 'Œ') {
				arg3[arg1 + local9] = -116;
			} else if (local16 == 'Ž') {
				arg3[local9 + arg1] = -114;
			} else if (local16 == '‘') {
				arg3[arg1 + local9] = -111;
			} else if (local16 == '’') {
				arg3[local9 + arg1] = -110;
			} else if (local16 == '“') {
				arg3[local9 + arg1] = -109;
			} else if (local16 == '”') {
				arg3[local9 + arg1] = -108;
			} else if (local16 == '•') {
				arg3[local9 + arg1] = -107;
			} else if (local16 == '–') {
				arg3[local9 + arg1] = -106;
			} else if (local16 == '—') {
				arg3[arg1 + local9] = -105;
			} else if (local16 == '˜') {
				arg3[local9 + arg1] = -104;
			} else if (local16 == '™') {
				arg3[local9 + arg1] = -103;
			} else if (local16 == 'š') {
				arg3[arg1 + local9] = -102;
			} else if (local16 == '›') {
				arg3[arg1 + local9] = -101;
			} else if (local16 == 'œ') {
				arg3[local9 + arg1] = -100;
			} else if (local16 == 'ž') {
				arg3[arg1 + local9] = -98;
			} else if (local16 == 'Ÿ') {
				arg3[local9 + arg1] = -97;
			} else {
				arg3[local9 + arg1] = 63;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!cha", name = "a", descriptor = "([Ljava/lang/Object;I[J)V")
	public static void method1382(@OriginalArg(0) Object[] arg0, @OriginalArg(2) long[] arg1) {
		Static431.method2323(arg1.length - 1, arg1, arg0, 0);
	}

	@OriginalMember(owner = "client!cha", name = "a", descriptor = "(III)V")
	public static void method1384(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class291 local7 = Static193.aClass291ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		Static353.method6087(local7.aClass15_Sub3_Sub4_1);
		Static353.method6087(local7.aClass15_Sub3_Sub4_2);
		if (local7.aClass15_Sub3_Sub4_1 != null) {
			local7.aClass15_Sub3_Sub4_1 = null;
		}
		if (local7.aClass15_Sub3_Sub4_2 != null) {
			local7.aClass15_Sub3_Sub4_2 = null;
		}
	}

	@OriginalMember(owner = "client!cha", name = "a", descriptor = "(Ljava/lang/String;B)I")
	public static int method1385(@OriginalArg(0) String arg0) {
		return Static260.method4508(arg0, 10);
	}
}
