import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static198 {

	@OriginalMember(owner = "client!oh", name = "d", descriptor = "Lclient!nm;")
	public static Class119 aClass119_65;

	@OriginalMember(owner = "client!oh", name = "h", descriptor = "Ljava/lang/String;")
	public static String aString129 = "Connected to update server";

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(III[BILjava/lang/String;)I")
	public static int method3327(@OriginalArg(1) int arg0, @OriginalArg(3) byte[] arg1, @OriginalArg(4) int arg2, @OriginalArg(5) String arg3) {
		@Pc(6) int local6 = arg0;
		for (@Pc(25) int local25 = 0; local25 < local6; local25++) {
			@Pc(34) char local34 = arg3.charAt(local25);
			if (local34 > '\u0000' && local34 < '\u0080' || !(local34 < ' ' || local34 > 'ÿ')) {
				arg1[arg2 + local25] = (byte) local34;
			} else if (local34 == '€') {
				arg1[arg2 + local25] = -128;
			} else if (local34 == '‚') {
				arg1[local25 + arg2] = -126;
			} else if (local34 == 'ƒ') {
				arg1[arg2 + local25] = -125;
			} else if (local34 == '„') {
				arg1[arg2 + local25] = -124;
			} else if (local34 == '…') {
				arg1[local25 + arg2] = -123;
			} else if (local34 == '†') {
				arg1[arg2 + local25] = -122;
			} else if (local34 == '‡') {
				arg1[local25 + arg2] = -121;
			} else if (local34 == 'ˆ') {
				arg1[local25 + arg2] = -120;
			} else if (local34 == '‰') {
				arg1[arg2 + local25] = -119;
			} else if (local34 == 'Š') {
				arg1[arg2 + local25] = -118;
			} else if (local34 == '‹') {
				arg1[arg2 + local25] = -117;
			} else if (local34 == 'Œ') {
				arg1[local25 + arg2] = -116;
			} else if (local34 == 'Ž') {
				arg1[arg2 + local25] = -114;
			} else if (local34 == '‘') {
				arg1[arg2 + local25] = -111;
			} else if (local34 == '’') {
				arg1[local25 + arg2] = -110;
			} else if (local34 == '“') {
				arg1[local25 + arg2] = -109;
			} else if (local34 == '”') {
				arg1[local25 + arg2] = -108;
			} else if (local34 == '•') {
				arg1[local25 + arg2] = -107;
			} else if (local34 == '–') {
				arg1[local25 + arg2] = -106;
			} else if (local34 == '—') {
				arg1[local25 + arg2] = -105;
			} else if (local34 == '˜') {
				arg1[local25 + arg2] = -104;
			} else if (local34 == '™') {
				arg1[local25 + arg2] = -103;
			} else if (local34 == 'š') {
				arg1[local25 + arg2] = -102;
			} else if (local34 == '›') {
				arg1[local25 + arg2] = -101;
			} else if (local34 == 'œ') {
				arg1[arg2 + local25] = -100;
			} else if (local34 == 'ž') {
				arg1[arg2 + local25] = -98;
			} else if (local34 == 'Ÿ') {
				arg1[local25 + arg2] = -97;
			} else {
				arg1[arg2 + local25] = 63;
			}
		}
		return local6;
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(II)Lclient!pd;")
	public static Class132 method3329(@OriginalArg(1) int arg0) {
		@Pc(16) Class132 local16 = (Class132) Static183.aClass175_28.method4295((long) arg0);
		if (local16 != null) {
			return local16;
		}
		@Pc(27) byte[] local27 = Static130.aClass119_50.method3235(arg0, 16);
		local16 = new Class132();
		if (local27 != null) {
			local16.method3470(new Class1_Sub13(local27));
		}
		Static183.aClass175_28.method4285(local16, (long) arg0);
		return local16;
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(Lclient!fh;I)Lclient!ie;")
	public static Class1_Sub1 method3331(@OriginalArg(0) Class1_Sub13 arg0) {
		arg0.method1853();
		@Pc(15) int local15 = arg0.method1853();
		@Pc(19) Class1_Sub1 local19 = Static145.method2522(local15);
		local19.anInt5353 = arg0.method1853();
		@Pc(28) int local28 = arg0.method1853();
		for (@Pc(30) int local30 = 0; local30 < local28; local30++) {
			@Pc(37) int local37 = arg0.method1853();
			local19.method4454(arg0, local37);
		}
		local19.method4460();
		return local19;
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(ZI[B[Lclient!gd;BI)V")
	public static void method3332(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) Class60[] arg3, @OriginalArg(5) int arg4) {
		@Pc(14) Class1_Sub13 local14 = new Class1_Sub13(arg2);
		@Pc(16) int local16 = -1;
		while (true) {
			@Pc(20) int local20 = local14.method1846();
			if (local20 == 0) {
				return;
			}
			local16 += local20;
			@Pc(28) int local28 = 0;
			while (true) {
				@Pc(32) int local32 = local14.method1830();
				if (local32 == 0) {
					break;
				}
				local28 += local32 - 1;
				@Pc(46) int local46 = local28 & 0x3F;
				@Pc(52) int local52 = local28 >> 6 & 0x3F;
				@Pc(56) int local56 = local28 >> 12;
				@Pc(60) int local60 = local14.method1853();
				@Pc(64) int local64 = local60 >> 2;
				@Pc(68) int local68 = local52 + arg1;
				@Pc(72) int local72 = local46 + arg4;
				@Pc(76) int local76 = local60 & 0x3;
				if (local68 > 0 && local72 > 0 && local68 < 103 && local72 < 103) {
					@Pc(94) Class60 local94 = null;
					if (!arg0) {
						@Pc(99) int local99 = local56;
						if ((Static17.aByteArrayArrayArray1[1][local68][local72] & 0x2) == 2) {
							local99 = local56 - 1;
						}
						if (local99 >= 0) {
							local94 = arg3[local99];
						}
					}
					Static42.method778(!arg0, local76, local16, local56, local64, arg0, local68, local56, local72, local94);
				}
			}
		}
	}
}
