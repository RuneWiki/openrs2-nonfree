import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static223 {

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "[[B")
	public static byte[][] aByteArrayArray14;

	@OriginalMember(owner = "client!qa", name = "h", descriptor = "Lclient!ne;")
	public static Class2_Sub8_Sub14 aClass2_Sub8_Sub14_6;

	@OriginalMember(owner = "client!qa", name = "k", descriptor = "I")
	public static int anInt4545;

	@OriginalMember(owner = "client!qa", name = "l", descriptor = "I")
	public static int anInt4546 = 0;

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(III)Lclient!tk;")
	public static Class170 method3678(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg1 < 0 || arg1 >= Static38.anInt954 || arg2 < 0 || arg2 >= Static232.anInt4680) {
			return null;
		}
		@Pc(19) Class2_Sub13 local19 = Static52.aClass2_Sub13ArrayArrayArray1[arg0][arg1][arg2];
		if (local19 == null) {
			return null;
		}
		@Pc(25) Class170 local25 = null;
		@Pc(27) int local27 = -1;
		@Pc(29) int local29 = -1;
		for (@Pc(31) int local31 = 0; local31 < local19.anInt1544; local31++) {
			@Pc(40) Class170 local40 = local19.aClass170Array1[local31];
			if ((local40.aLong195 >> 29 & 0x3L) <= 1L && local40.anInt5433 == arg1 && local40.anInt5437 == arg2 && (local40.anInt5435 > local27 || local40.anInt5448 > local29)) {
				local25 = local40;
				local27 = local40.anInt5435;
				local29 = local40.anInt5448;
			}
		}
		return local25;
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIZI[BII[Lclient!rm;II)V")
	public static void method3679(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(5) byte[] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class154[] arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(17) Class2_Sub16 local17 = new Class2_Sub16(arg4);
		@Pc(19) int local19 = -1;
		while (true) {
			@Pc(23) int local23 = local17.method2157();
			if (local23 == 0) {
				return;
			}
			local19 += local23;
			@Pc(36) int local36 = 0;
			while (true) {
				@Pc(40) int local40 = local17.method2161();
				if (local40 == 0) {
					break;
				}
				local36 += local40 - 1;
				@Pc(57) int local57 = local36 & 0x3F;
				@Pc(63) int local63 = local36 >> 6 & 0x3F;
				@Pc(67) int local67 = local36 >> 12;
				@Pc(71) int local71 = local17.method2146();
				@Pc(75) int local75 = local71 & 0x3;
				@Pc(79) int local79 = local71 >> 2;
				if (local67 == arg0 && arg1 <= local63 && arg1 + 8 > local63 && arg6 <= local57 && local57 < arg6 + 8) {
					@Pc(102) Class146 local102 = Static10.method158(local19);
					@Pc(119) int local119 = arg8 + Static105.method794(local63 & 0x7, arg2, local75, local102.anInt4749, local57 & 0x7, local102.anInt4721);
					@Pc(136) int local136 = Static123.method2197(local57 & 0x7, local63 & 0x7, local102.anInt4749, local102.anInt4721, arg2, local75) + arg9;
					if (local119 > 0 && local136 > 0 && local119 < 103 && local136 < 103) {
						@Pc(159) Class154 local159 = null;
						if (!arg3) {
							@Pc(164) int local164 = arg5;
							if ((Static13.aByteArrayArrayArray2[1][local119][local136] & 0x2) == 2) {
								local164 = arg5 - 1;
							}
							if (local164 >= 0) {
								local159 = arg7[local164];
							}
						}
						Static59.method1138(arg5, local119, !arg3, arg2 + local75 & 0x3, local136, local79, local19, arg3, local159, arg5);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IZII[[F[[FZ[[FI[[I[ILclient!wl;IZ[ZI[[IBIZZI)V")
	public static void method3681(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float[][] arg4, @OriginalArg(5) float[][] arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) float[][] arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int[][] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) Class2_Sub32 arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13, @OriginalArg(14) boolean[] arg14, @OriginalArg(15) int arg15, @OriginalArg(16) int[][] arg16, @OriginalArg(17) byte arg17, @OriginalArg(18) int arg18, @OriginalArg(20) boolean arg19, @OriginalArg(21) int arg20) {
		@Pc(15) int local15 = (arg1 ? 255 : 0) + (arg12 << 8);
		@Pc(25) int local25 = (arg0 << 8) + (arg13 ? 255 : 0);
		@Pc(35) int local35 = (arg2 << 8) + (arg19 ? 255 : 0);
		@Pc(45) int local45 = (arg20 << 8) + (arg6 ? 255 : 0);
		@Pc(51) int[] local51 = new int[arg10.length / 2];
		for (@Pc(53) int local53 = 0; local53 < local51.length; local53++) {
			@Pc(87) int local87 = arg10[local53 + local53 + 1];
			@Pc(94) int local94 = arg10[local53 + local53];
			@Pc(107) int[][] local107 = arg16 == null || arg14 == null || !arg14[local53] ? arg9 : arg16;
			local51[local53] = Static218.method3617(arg16, arg4, false, (float) arg18, local25, local87, arg5, arg15, local35, local107, local15, arg17, arg8, local94, arg11, local45, arg7);
		}
		arg11.method4749(arg3, arg15, arg8, local51, null, false);
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IZIJI)Ljava/lang/String;")
	public static String method3682(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) long arg3) {
		@Pc(7) char local7 = '.';
		@Pc(9) char local9 = ',';
		@Pc(11) boolean local11 = false;
		@Pc(16) StringBuffer local16 = new StringBuffer(26);
		if (arg2 == 0) {
			local7 = ',';
			local9 = '.';
		}
		if (arg2 == 2) {
			local7 = ' ';
		}
		if (arg3 < 0L) {
			local11 = true;
			arg3 = -arg3;
		}
		@Pc(49) int local49;
		@Pc(59) int local59;
		if (arg0 > 0) {
			for (local49 = 0; local49 < arg0; local49++) {
				local59 = (int) arg3;
				arg3 /= 10L;
				local16.append((char) (local59 + 48 - (int) arg3 * 10));
			}
			local16.append(local9);
		}
		local49 = 0;
		while (true) {
			local59 = (int) arg3;
			arg3 /= 10L;
			local16.append((char) (local59 + 48 - (int) arg3 * 10));
			if (arg3 == 0L) {
				if (local11) {
					local16.append('-');
				}
				return local16.reverse().toString();
			}
			if (arg1) {
				local49++;
				if (local49 % 3 == 0) {
					local16.append(local7);
				}
			}
		}
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(CI)B")
	public static byte method3683(@OriginalArg(0) char arg0) {
		@Pc(57) byte local57;
		if (arg0 > '\u0000' && arg0 < '\u0080' || arg0 >= ' ' && arg0 <= 'ÿ') {
			local57 = (byte) arg0;
		} else if (arg0 == '€') {
			local57 = -128;
		} else if (arg0 == '‚') {
			local57 = -126;
		} else if (arg0 == 'ƒ') {
			local57 = -125;
		} else if (arg0 == '„') {
			local57 = -124;
		} else if (arg0 == '…') {
			local57 = -123;
		} else if (arg0 == '†') {
			local57 = -122;
		} else if (arg0 == '‡') {
			local57 = -121;
		} else if (arg0 == 'ˆ') {
			local57 = -120;
		} else if (arg0 == '‰') {
			local57 = -119;
		} else if (arg0 == 'Š') {
			local57 = -118;
		} else if (arg0 == '‹') {
			local57 = -117;
		} else if (arg0 == 'Œ') {
			local57 = -116;
		} else if (arg0 == 'Ž') {
			local57 = -114;
		} else if (arg0 == '‘') {
			local57 = -111;
		} else if (arg0 == '’') {
			local57 = -110;
		} else if (arg0 == '“') {
			local57 = -109;
		} else if (arg0 == '”') {
			local57 = -108;
		} else if (arg0 == '•') {
			local57 = -107;
		} else if (arg0 == '–') {
			local57 = -106;
		} else if (arg0 == '—') {
			local57 = -105;
		} else if (arg0 == '˜') {
			local57 = -104;
		} else if (arg0 == '™') {
			local57 = -103;
		} else if (arg0 == 'š') {
			local57 = -102;
		} else if (arg0 == '›') {
			local57 = -101;
		} else if (arg0 == 'œ') {
			local57 = -100;
		} else if (arg0 == 'ž') {
			local57 = -98;
		} else if (arg0 == 'Ÿ') {
			local57 = -97;
		} else {
			local57 = 63;
		}
		return local57;
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Ljava/lang/String;B)I")
	public static int method3684(@OriginalArg(0) String arg0) {
		return arg0.length() + 1;
	}
}
