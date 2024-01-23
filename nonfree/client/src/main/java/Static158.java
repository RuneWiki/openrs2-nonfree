import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static158 {

	@OriginalMember(owner = "client!ng", name = "e", descriptor = "Lclient!lc;")
	public static Class79 aClass79_21 = new Class79(4);

	@OriginalMember(owner = "client!ng", name = "f", descriptor = "F")
	public static float aFloat32 = 128.0F;

	@OriginalMember(owner = "client!ng", name = "g", descriptor = "Ljava/lang/String;")
	public static String aString241 = "rating: ";

	@OriginalMember(owner = "client!ng", name = "h", descriptor = "[I")
	public static int[] anIntArray277 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(Z)I")
	public static int method2803() {
		return Static227.anInt4989;
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(CI)B")
	public static byte method2804(@OriginalArg(0) char arg0) {
		@Pc(35) byte local35;
		if (arg0 > '\u0000' && arg0 < '\u0080' || arg0 >= ' ' && arg0 <= 'ÿ') {
			local35 = (byte) arg0;
		} else if (arg0 == '€') {
			local35 = -128;
		} else if (arg0 == '‚') {
			local35 = -126;
		} else if (arg0 == 'ƒ') {
			local35 = -125;
		} else if (arg0 == '„') {
			local35 = -124;
		} else if (arg0 == '…') {
			local35 = -123;
		} else if (arg0 == '†') {
			local35 = -122;
		} else if (arg0 == '‡') {
			local35 = -121;
		} else if (arg0 == 'ˆ') {
			local35 = -120;
		} else if (arg0 == '‰') {
			local35 = -119;
		} else if (arg0 == 'Š') {
			local35 = -118;
		} else if (arg0 == '‹') {
			local35 = -117;
		} else if (arg0 == 'Œ') {
			local35 = -116;
		} else if (arg0 == 'Ž') {
			local35 = -114;
		} else if (arg0 == '‘') {
			local35 = -111;
		} else if (arg0 == '’') {
			local35 = -110;
		} else if (arg0 == '“') {
			local35 = -109;
		} else if (arg0 == '”') {
			local35 = -108;
		} else if (arg0 == '•') {
			local35 = -107;
		} else if (arg0 == '–') {
			local35 = -106;
		} else if (arg0 == '—') {
			local35 = -105;
		} else if (arg0 == '˜') {
			local35 = -104;
		} else if (arg0 == '™') {
			local35 = -103;
		} else if (arg0 == 'š') {
			local35 = -102;
		} else if (arg0 == '›') {
			local35 = -101;
		} else if (arg0 == 'œ') {
			local35 = -100;
		} else if (arg0 == 'ž') {
			local35 = -98;
		} else if (arg0 == 'Ÿ') {
			local35 = -97;
		} else {
			local35 = 63;
		}
		return local35;
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(IIIILclient!sa;JLclient!sa;Lclient!sa;)V")
	public static void method2805(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class9 arg4, @OriginalArg(5) long arg5, @OriginalArg(6) Class9 arg6, @OriginalArg(7) Class9 arg7) {
		@Pc(3) Class127 local3 = new Class127();
		local3.aClass9_6 = arg4;
		local3.anInt4928 = arg1 * 128 + 64;
		local3.anInt4926 = arg2 * 128 + 64;
		local3.anInt4930 = arg3;
		local3.aLong162 = arg5;
		local3.aClass9_5 = arg6;
		local3.aClass9_7 = arg7;
		@Pc(34) int local34 = 0;
		@Pc(42) Class1_Sub16 local42 = Static142.aClass1_Sub16ArrayArrayArray4[arg0][arg1][arg2];
		if (local42 != null) {
			for (@Pc(46) int local46 = 0; local46 < local42.anInt2929; local46++) {
				@Pc(52) Class47 local52 = local42.aClass47Array1[local46];
				if ((local52.aLong73 & 0x400000L) == 4194304L) {
					@Pc(63) int local63 = local52.aClass9_1.method3587();
					if (local63 != -32768 && local63 < local34) {
						local34 = local63;
					}
				}
			}
		}
		local3.anInt4927 = -local34;
		if (Static142.aClass1_Sub16ArrayArrayArray4[arg0][arg1][arg2] == null) {
			Static142.aClass1_Sub16ArrayArrayArray4[arg0][arg1][arg2] = new Class1_Sub16(arg0, arg1, arg2);
		}
		Static142.aClass1_Sub16ArrayArrayArray4[arg0][arg1][arg2].aClass127_1 = local3;
	}
}
