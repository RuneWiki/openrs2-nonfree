import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static281 {

	@OriginalMember(owner = "client!od", name = "M", descriptor = "Lclient!cm;")
	public static final Class36 aClass36_89 = new Class36(9, -1);

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(I[BILjava/lang/String;II)I")
	public static int method3756(@OriginalArg(1) byte[] arg0, @OriginalArg(3) String arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3) {
		@Pc(15) int local15 = arg2;
		for (@Pc(17) int local17 = 0; local17 < local15; local17++) {
			@Pc(25) char local25 = arg1.charAt(local17);
			if (local25 > '\u0000' && local25 < '\u0080' || !(local25 < ' ' || local25 > 'ÿ')) {
				arg0[local17 + arg3] = (byte) local25;
			} else if (local25 == '€') {
				arg0[arg3 + local17] = -128;
			} else if (local25 == '‚') {
				arg0[local17 + arg3] = -126;
			} else if (local25 == 'ƒ') {
				arg0[local17 + arg3] = -125;
			} else if (local25 == '„') {
				arg0[local17 + arg3] = -124;
			} else if (local25 == '…') {
				arg0[arg3 + local17] = -123;
			} else if (local25 == '†') {
				arg0[arg3 + local17] = -122;
			} else if (local25 == '‡') {
				arg0[arg3 + local17] = -121;
			} else if (local25 == 'ˆ') {
				arg0[arg3 + local17] = -120;
			} else if (local25 == '‰') {
				arg0[arg3 + local17] = -119;
			} else if (local25 == 'Š') {
				arg0[arg3 + local17] = -118;
			} else if (local25 == '‹') {
				arg0[local17 + arg3] = -117;
			} else if (local25 == 'Œ') {
				arg0[arg3 + local17] = -116;
			} else if (local25 == 'Ž') {
				arg0[arg3 + local17] = -114;
			} else if (local25 == '‘') {
				arg0[local17 + arg3] = -111;
			} else if (local25 == '’') {
				arg0[arg3 + local17] = -110;
			} else if (local25 == '“') {
				arg0[arg3 + local17] = -109;
			} else if (local25 == '”') {
				arg0[local17 + arg3] = -108;
			} else if (local25 == '•') {
				arg0[arg3 + local17] = -107;
			} else if (local25 == '–') {
				arg0[local17 + arg3] = -106;
			} else if (local25 == '—') {
				arg0[local17 + arg3] = -105;
			} else if (local25 == '˜') {
				arg0[arg3 + local17] = -104;
			} else if (local25 == '™') {
				arg0[local17 + arg3] = -103;
			} else if (local25 == 'š') {
				arg0[arg3 + local17] = -102;
			} else if (local25 == '›') {
				arg0[local17 + arg3] = -101;
			} else if (local25 == 'œ') {
				arg0[local17 + arg3] = -100;
			} else if (local25 == 'ž') {
				arg0[local17 + arg3] = -98;
			} else if (local25 == 'Ÿ') {
				arg0[arg3 + local17] = -97;
			} else {
				arg0[arg3 + local17] = 63;
			}
		}
		return local15;
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(IIIIIBI)V")
	public static void method3758(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		Static95.method1548(arg0);
		@Pc(18) int local18 = 0;
		@Pc(23) int local23 = arg0 - arg2;
		if (local23 < 0) {
			local23 = 0;
		}
		@Pc(29) int local29 = arg0;
		@Pc(32) int local32 = -arg0;
		@Pc(34) int local34 = local23;
		@Pc(37) int local37 = -local23;
		@Pc(39) int local39 = -1;
		@Pc(62) int local62;
		@Pc(70) int local70;
		@Pc(79) int local79;
		@Pc(87) int local87;
		if (arg1 >= Static388.anInt6740 && arg1 <= Static387.anInt6727) {
			@Pc(53) int[] local53 = Static162.anIntArrayArray58[arg1];
			local62 = Static360.method5003(Static198.anInt3778, Static414.anInt7043, arg4 - arg0);
			local70 = Static360.method5003(Static198.anInt3778, Static414.anInt7043, arg4 + arg0);
			local79 = Static360.method5003(Static198.anInt3778, Static414.anInt7043, arg4 - local23);
			local87 = Static360.method5003(Static198.anInt3778, Static414.anInt7043, local23 + arg4);
			Static335.method4533(local79, arg5, local62, local53);
			Static335.method4533(local87, arg3, local79, local53);
			Static335.method4533(local70, arg5, local87, local53);
		}
		@Pc(107) int local107 = -1;
		while (local18 < local29) {
			local107 += 2;
			local39 += 2;
			local32 += local39;
			local37 += local107;
			if (local37 >= 0 && local34 >= 1) {
				local34--;
				local37 -= local34 << 1;
				Static312.anIntArray480[local34] = local18;
			}
			local18++;
			@Pc(243) int local243;
			@Pc(252) int local252;
			@Pc(263) int[] local263;
			@Pc(153) int local153;
			if (local32 >= 0) {
				local29--;
				local32 -= local29 << 1;
				local153 = arg1 - local29;
				local62 = local29 + arg1;
				if (local62 >= Static388.anInt6740 && Static387.anInt6727 >= local153) {
					if (local29 >= local23) {
						local70 = Static360.method5003(Static198.anInt3778, Static414.anInt7043, arg4 + local18);
						local79 = Static360.method5003(Static198.anInt3778, Static414.anInt7043, arg4 - local18);
						if (local62 <= Static387.anInt6727) {
							Static335.method4533(local70, arg5, local79, Static162.anIntArrayArray58[local62]);
						}
						if (local153 >= Static388.anInt6740) {
							Static335.method4533(local70, arg5, local79, Static162.anIntArrayArray58[local153]);
						}
					} else {
						local70 = Static312.anIntArray480[local29];
						local79 = Static360.method5003(Static198.anInt3778, Static414.anInt7043, arg4 + local18);
						local87 = Static360.method5003(Static198.anInt3778, Static414.anInt7043, arg4 - local18);
						local243 = Static360.method5003(Static198.anInt3778, Static414.anInt7043, arg4 + local70);
						local252 = Static360.method5003(Static198.anInt3778, Static414.anInt7043, arg4 - local70);
						if (local62 <= Static387.anInt6727) {
							local263 = Static162.anIntArrayArray58[local62];
							Static335.method4533(local252, arg5, local87, local263);
							Static335.method4533(local243, arg3, local252, local263);
							Static335.method4533(local79, arg5, local243, local263);
						}
						if (local153 >= Static388.anInt6740) {
							local263 = Static162.anIntArrayArray58[local153];
							Static335.method4533(local252, arg5, local87, local263);
							Static335.method4533(local243, arg3, local252, local263);
							Static335.method4533(local79, arg5, local243, local263);
						}
					}
				}
			}
			local153 = arg1 - local18;
			local62 = arg1 + local18;
			if (local62 >= Static388.anInt6740 && Static387.anInt6727 >= local153) {
				local70 = arg4 + local29;
				local79 = arg4 - local29;
				if (Static414.anInt7043 <= local70 && Static198.anInt3778 >= local79) {
					local70 = Static360.method5003(Static198.anInt3778, Static414.anInt7043, local70);
					local79 = Static360.method5003(Static198.anInt3778, Static414.anInt7043, local79);
					if (local18 >= local23) {
						if (Static387.anInt6727 >= local62) {
							Static335.method4533(local70, arg5, local79, Static162.anIntArrayArray58[local62]);
						}
						if (local153 >= Static388.anInt6740) {
							Static335.method4533(local70, arg5, local79, Static162.anIntArrayArray58[local153]);
						}
					} else {
						local87 = local34 >= local18 ? local34 : Static312.anIntArray480[local18];
						local243 = Static360.method5003(Static198.anInt3778, Static414.anInt7043, local87 + arg4);
						local252 = Static360.method5003(Static198.anInt3778, Static414.anInt7043, arg4 - local87);
						if (local62 <= Static387.anInt6727) {
							local263 = Static162.anIntArrayArray58[local62];
							Static335.method4533(local252, arg5, local79, local263);
							Static335.method4533(local243, arg3, local252, local263);
							Static335.method4533(local70, arg5, local243, local263);
						}
						if (local153 >= Static388.anInt6740) {
							local263 = Static162.anIntArrayArray58[local153];
							Static335.method4533(local252, arg5, local79, local263);
							Static335.method4533(local243, arg3, local252, local263);
							Static335.method4533(local70, arg5, local243, local263);
						}
					}
				}
			}
		}
	}
}
