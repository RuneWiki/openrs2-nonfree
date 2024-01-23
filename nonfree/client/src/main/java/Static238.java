import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static238 {

	@OriginalMember(owner = "client!r", name = "g", descriptor = "[Lclient!sg;")
	public static Class161[] aClass161Array2;

	@OriginalMember(owner = "client!r", name = "b", descriptor = "I")
	public static int anInt4321 = 0;

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(B)V")
	public static void method3675() {
		Static37.aClass187_23.method4525();
		Static227.aClass187_116.method4525();
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIILclient!io;JLclient!io;Lclient!io;)V")
	public static void method3677(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class15 arg4, @OriginalArg(5) long arg5, @OriginalArg(6) Class15 arg6, @OriginalArg(7) Class15 arg7) {
		@Pc(3) Class151 local3 = new Class151();
		local3.aClass15_5 = arg4;
		local3.anInt4328 = arg1 * 128 + 64;
		local3.anInt4329 = arg2 * 128 + 64;
		local3.anInt4331 = arg3;
		local3.aLong155 = arg5;
		local3.aClass15_6 = arg6;
		local3.aClass15_4 = arg7;
		@Pc(34) int local34 = 0;
		@Pc(42) Class1_Sub33 local42 = Static105.aClass1_Sub33ArrayArrayArray2[arg0][arg1][arg2];
		if (local42 != null) {
			for (@Pc(46) int local46 = 0; local46 < local42.anInt5733; local46++) {
				@Pc(55) Class161 local55 = local42.aClass161Array3[local46];
				if ((local55.aLong171 & 0x400000L) == 4194304L) {
					@Pc(66) int local66 = local55.aClass15_9.method4676();
					if (local66 != -32768 && local66 < local34) {
						local34 = local66;
					}
				}
			}
		}
		local3.anInt4335 = -local34;
		if (Static105.aClass1_Sub33ArrayArrayArray2[arg0][arg1][arg2] == null) {
			Static105.aClass1_Sub33ArrayArrayArray2[arg0][arg1][arg2] = new Class1_Sub33(arg0, arg1, arg2);
		}
		Static105.aClass1_Sub33ArrayArrayArray2[arg0][arg1][arg2].aClass151_1 = local3;
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(ILjava/lang/String;)[B")
	public static byte[] method3678(@OriginalArg(1) String arg0) {
		@Pc(4) int local4 = arg0.length();
		@Pc(7) byte[] local7 = new byte[local4];
		for (@Pc(9) int local9 = 0; local9 < local4; local9++) {
			@Pc(20) char local20 = arg0.charAt(local9);
			if (local20 > '\u0000' && local20 < '\u0080' || !(local20 < ' ' || local20 > 'ÿ')) {
				local7[local9] = (byte) local20;
			} else if (local20 == '€') {
				local7[local9] = -128;
			} else if (local20 == '‚') {
				local7[local9] = -126;
			} else if (local20 == 'ƒ') {
				local7[local9] = -125;
			} else if (local20 == '„') {
				local7[local9] = -124;
			} else if (local20 == '…') {
				local7[local9] = -123;
			} else if (local20 == '†') {
				local7[local9] = -122;
			} else if (local20 == '‡') {
				local7[local9] = -121;
			} else if (local20 == 'ˆ') {
				local7[local9] = -120;
			} else if (local20 == '‰') {
				local7[local9] = -119;
			} else if (local20 == 'Š') {
				local7[local9] = -118;
			} else if (local20 == '‹') {
				local7[local9] = -117;
			} else if (local20 == 'Œ') {
				local7[local9] = -116;
			} else if (local20 == 'Ž') {
				local7[local9] = -114;
			} else if (local20 == '‘') {
				local7[local9] = -111;
			} else if (local20 == '’') {
				local7[local9] = -110;
			} else if (local20 == '“') {
				local7[local9] = -109;
			} else if (local20 == '”') {
				local7[local9] = -108;
			} else if (local20 == '•') {
				local7[local9] = -107;
			} else if (local20 == '–') {
				local7[local9] = -106;
			} else if (local20 == '—') {
				local7[local9] = -105;
			} else if (local20 == '˜') {
				local7[local9] = -104;
			} else if (local20 == '™') {
				local7[local9] = -103;
			} else if (local20 == 'š') {
				local7[local9] = -102;
			} else if (local20 == '›') {
				local7[local9] = -101;
			} else if (local20 == 'œ') {
				local7[local9] = -100;
			} else if (local20 == 'ž') {
				local7[local9] = -98;
			} else if (local20 == 'Ÿ') {
				local7[local9] = -97;
			} else {
				local7[local9] = 63;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(I[B)Z")
	public static boolean method3679(@OriginalArg(1) byte[] arg0) {
		@Pc(15) Class1_Sub14 local15 = new Class1_Sub14(arg0);
		@Pc(19) int local19 = local15.method1378();
		if (local19 != 1) {
			return false;
		}
		@Pc(35) boolean local35 = local15.method1378() == 1;
		if (local35) {
			Static257.method4072(local15);
		}
		Static284.method4370(local15);
		return true;
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Lclient!nk;I)V")
	public static void method3680(@OriginalArg(0) Class121 arg0) {
		Static270.aClass121_120 = arg0;
		Static64.anInt1227 = Static270.aClass121_120.method3125(16);
	}
}
