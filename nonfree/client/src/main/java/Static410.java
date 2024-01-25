import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static410 {

	@OriginalMember(owner = "client!on", name = "d", descriptor = "[Z")
	public static boolean[] aBooleanArray116;

	@OriginalMember(owner = "client!on", name = "s", descriptor = "F")
	public static float aFloat117;

	@OriginalMember(owner = "client!on", name = "y", descriptor = "I")
	public static int anInt6384;

	@OriginalMember(owner = "client!on", name = "k", descriptor = "I")
	public static int anInt6377 = -1;

	@OriginalMember(owner = "client!on", name = "B", descriptor = "[I")
	public static int[] anIntArray471 = new int[2];

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(IIIIII)I")
	public static int method5503(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static314.aClass76Array2 == null) {
			return 0;
		}
		if (arg4 < 3) {
			@Pc(25) int local25 = arg1 >> 9;
			@Pc(29) int local29 = arg3 >> 9;
			if (arg2 < 0 || arg0 < 0 || arg2 > Static228.anInt3704 - 1 || arg0 > Static162.anInt2911 - 1) {
				return 0;
			}
			if (local25 < 1 || local29 < 1 || local25 > Static228.anInt3704 - 1 || local29 > Static162.anInt2911 - 1) {
				return 0;
			}
			@Pc(93) boolean local93 = (Static27.aByteArrayArrayArray1[1][arg1 >> 9][arg3 >> 9] & 0x2) != 0;
			@Pc(118) boolean local118;
			@Pc(137) boolean local137;
			if ((arg1 & 0x1FF) == 0) {
				local118 = (Static27.aByteArrayArrayArray1[1][local25 - 1][arg3 >> 9] & 0x2) != 0;
				local137 = (Static27.aByteArrayArrayArray1[1][local25][arg3 >> 9] & 0x2) != 0;
				if (local118 != local137) {
					local93 = (Static27.aByteArrayArrayArray1[1][arg2][arg0] & 0x2) != 0;
				}
			}
			if ((arg3 & 0x1FF) == 0) {
				local118 = (Static27.aByteArrayArrayArray1[1][arg1 >> 9][local29 - 1] & 0x2) != 0;
				local137 = (Static27.aByteArrayArrayArray1[1][arg1 >> 9][local29] & 0x2) != 0;
				if (local118 != local137) {
					local93 = (Static27.aByteArrayArrayArray1[1][arg2][arg0] & 0x2) != 0;
				}
			}
			if (local93) {
				arg4++;
			}
		}
		return Static314.aClass76Array2[arg4].method7398(arg1, arg3);
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "([BI[BIIBIII)V")
	public static void method5505(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(10) int local10 = -(arg6 >> 2);
		@Pc(15) int local15 = -(arg6 & 0x3);
		for (@Pc(22) int local22 = -arg1; local22 < 0; local22++) {
			@Pc(30) int local30;
			for (@Pc(26) int local26 = local10; local26 < 0; local26++) {
				local30 = arg7++;
				arg0[local30] += arg2[arg4++];
				@Pc(42) int local42 = arg7++;
				arg0[local42] += arg2[arg4++];
				@Pc(54) int local54 = arg7++;
				arg0[local54] += arg2[arg4++];
				@Pc(66) int local66 = arg7++;
				arg0[local66] += arg2[arg4++];
			}
			for (@Pc(81) int local81 = local15; local81 < 0; local81++) {
				local30 = arg7++;
				arg0[local30] += arg2[arg4++];
			}
			arg7 += arg3;
			arg4 += arg5;
		}
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(II)V")
	public static void method5506(@OriginalArg(1) int arg0) {
		Static525.anInt5960 = -1;
		Static20.anInt544 = 100;
		Static249.anInt3980 = arg0;
		Static95.anInt1808 = 3;
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(IILjava/lang/String;Ljava/lang/String;)I")
	public static int method5511(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2) {
		@Pc(8) int local8 = arg2.length();
		@Pc(11) int local11 = arg1.length();
		@Pc(13) int local13 = 0;
		@Pc(15) int local15 = 0;
		@Pc(17) char local17 = 0;
		@Pc(19) char local19 = 0;
		while (local8 > local13 - local17 || local15 - local19 < local11) {
			if (local8 <= local13 - local17) {
				return -1;
			}
			if (local11 <= local15 - local19) {
				return 1;
			}
			@Pc(55) char local55;
			if (local17 == '\u0000') {
				local55 = arg2.charAt(local13++);
			} else {
				local55 = local17;
			}
			@Pc(71) char local71;
			if (local19 == '\u0000') {
				local71 = arg1.charAt(local15++);
			} else {
				local71 = local19;
			}
			local17 = Static592.method8039(local55);
			local19 = Static592.method8039(local71);
			local55 = Static396.method5408(arg0, local55);
			local71 = Static396.method5408(arg0, local71);
			if (local71 != local55 && Character.toUpperCase(local55) != Character.toUpperCase(local71)) {
				local55 = Character.toLowerCase(local55);
				local71 = Character.toLowerCase(local71);
				if (local55 != local71) {
					return Static190.method2761(local55, arg0) - Static190.method2761(local71, arg0);
				}
			}
		}
		@Pc(138) int local138 = Math.min(local8, local11);
		for (@Pc(140) int local140 = 0; local140 < local138; local140++) {
			if (arg0 == 2) {
				local15 = local11 - local140 - 1;
				local13 = local8 - local140 - 1;
			} else {
				local15 = local140;
				local13 = local140;
			}
			@Pc(169) char local169 = arg2.charAt(local13);
			@Pc(173) char local173 = arg1.charAt(local15);
			if (local169 != local173 && Character.toUpperCase(local169) != Character.toUpperCase(local173)) {
				local169 = Character.toLowerCase(local169);
				local173 = Character.toLowerCase(local173);
				if (local169 != local173) {
					return Static190.method2761(local169, arg0) - Static190.method2761(local173, arg0);
				}
			}
		}
		@Pc(218) int local218 = local8 - local11;
		if (local218 != 0) {
			return local218;
		}
		for (@Pc(224) int local224 = 0; local224 < local138; local224++) {
			@Pc(230) char local230 = arg2.charAt(local224);
			@Pc(234) char local234 = arg1.charAt(local224);
			if (local234 != local230) {
				return Static190.method2761(local230, arg0) - Static190.method2761(local234, arg0);
			}
		}
		return 0;
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(IIZ)V")
	public static void method5512(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1) {
		@Pc(10) Class2_Sub8 local10 = Static384.method5147(arg0, arg1);
		if (local10 != null) {
			for (@Pc(15) int local15 = 0; local15 < local10.anIntArray123.length; local15++) {
				local10.anIntArray123[local15] = -1;
				local10.anIntArray122[local15] = 0;
			}
		}
	}
}
