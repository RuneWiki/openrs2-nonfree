import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static207 {

	@OriginalMember(owner = "client!np", name = "d", descriptor = "Ljava/lang/String;")
	public static String aString165 = "Created gameworld";

	@OriginalMember(owner = "client!np", name = "e", descriptor = "Z")
	public static boolean aBoolean341 = false;

	@OriginalMember(owner = "client!np", name = "g", descriptor = "[I")
	public static int[] anIntArray398 = new int[2];

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;I)I")
	public static int method3707(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2) {
		@Pc(8) int local8 = arg1.length();
		@Pc(11) int local11 = arg0.length();
		@Pc(13) int local13 = 0;
		@Pc(15) int local15 = 0;
		@Pc(17) char local17 = 0;
		@Pc(19) char local19 = 0;
		while (local13 - local17 < local8 || local15 - local19 < local11) {
			if (local8 <= local13 - local17) {
				return -1;
			}
			if (local11 <= local15 - local19) {
				return 1;
			}
			@Pc(63) char local63;
			if (local17 == '\u0000') {
				local63 = arg1.charAt(local13++);
			} else {
				local63 = local17;
			}
			@Pc(82) char local82;
			if (local19 == '\u0000') {
				local82 = arg0.charAt(local15++);
			} else {
				local82 = local19;
			}
			local17 = Static77.method1307(local63);
			local19 = Static77.method1307(local82);
			local63 = Static263.method4747(arg2, local63);
			local82 = Static263.method4747(arg2, local82);
			if (local63 != local82 && Character.toUpperCase(local63) != Character.toUpperCase(local82)) {
				local63 = Character.toLowerCase(local63);
				local82 = Character.toLowerCase(local82);
				if (local82 != local63) {
					return Static14.method205(arg2, local63) - Static14.method205(arg2, local82);
				}
			}
		}
		@Pc(141) int local141 = Math.min(local8, local11);
		for (@Pc(143) int local143 = 0; local143 < local141; local143++) {
			if (arg2 == 2) {
				local13 = local8 - local143 - 1;
				local15 = local11 - local143 - 1;
			} else {
				local15 = local143;
				local13 = local143;
			}
			@Pc(172) char local172 = arg1.charAt(local13);
			@Pc(176) char local176 = arg0.charAt(local15);
			if (local172 != local176 && Character.toUpperCase(local172) != Character.toUpperCase(local176)) {
				local172 = Character.toLowerCase(local172);
				local176 = Character.toLowerCase(local176);
				if (local172 != local176) {
					return Static14.method205(arg2, local172) - Static14.method205(arg2, local176);
				}
			}
		}
		@Pc(228) int local228 = local8 - local11;
		if (local228 != 0) {
			return local228;
		}
		for (@Pc(234) int local234 = 0; local234 < local141; local234++) {
			@Pc(240) char local240 = arg1.charAt(local234);
			@Pc(244) char local244 = arg0.charAt(local234);
			if (local244 != local240) {
				return Static14.method205(arg2, local240) - Static14.method205(arg2, local244);
			}
		}
		return 0;
	}

	@OriginalMember(owner = "client!np", name = "b", descriptor = "(I)Z")
	public static boolean method3708() {
		try {
			if (Static49.anInt5279 == 2) {
				if (Static161.aClass1_Sub30_1 == null) {
					Static161.aClass1_Sub30_1 = Static364.method3775(Static9.aClass134_3, Static204.anInt6779, Static78.anInt1582);
					if (Static161.aClass1_Sub30_1 == null) {
						return false;
					}
				}
				if (Static201.aClass36_3 == null) {
					Static201.aClass36_3 = new Class36(Static260.aClass134_121, Static46.aClass134_26);
				}
				if (Static58.aClass1_Sub31_Sub3_1.method4717(Static201.aClass36_3, Static161.aClass1_Sub30_1, Static87.aClass134_37)) {
					Static58.aClass1_Sub31_Sub3_1.method4699();
					Static58.aClass1_Sub31_Sub3_1.method4719(Static204.anInt6780);
					Static58.aClass1_Sub31_Sub3_1.method4707(Static93.aBoolean127, Static161.aClass1_Sub30_1);
					Static161.aClass1_Sub30_1 = null;
					Static201.aClass36_3 = null;
					Static9.aClass134_3 = null;
					Static49.anInt5279 = 0;
					return true;
				}
			}
		} catch (@Pc(61) Exception local61) {
			local61.printStackTrace();
			Static58.aClass1_Sub31_Sub3_1.method4731();
			Static201.aClass36_3 = null;
			Static161.aClass1_Sub30_1 = null;
			Static49.anInt5279 = 0;
			Static9.aClass134_3 = null;
		}
		return false;
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(IIIIII)I")
	public static int method3709(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static263.aClass12Array2 == null) {
			return 0;
		} else if (arg3 < 3) {
			@Pc(24) int local24 = arg0 >> 7;
			@Pc(28) int local28 = arg4 >> 7;
			if (arg1 < 0 || arg2 < 0 || arg1 > Static43.anInt1151 - 1 || Static260.anInt5348 - 1 < arg2) {
				return 0;
			} else if (local24 >= 1 && local28 >= 1 && Static43.anInt1151 - 1 >= local24 && Static260.anInt5348 - 1 >= local28) {
				@Pc(98) boolean local98 = (Static291.aByteArrayArrayArray11[1][arg0 >> 7][arg4 >> 7] & 0x2) != 0;
				@Pc(123) boolean local123;
				@Pc(139) boolean local139;
				if ((arg0 & 0x7F) == 0) {
					local123 = (Static291.aByteArrayArrayArray11[1][local24 - 1][arg4 >> 7] & 0x2) != 0;
					local139 = (Static291.aByteArrayArrayArray11[1][local24][arg4 >> 7] & 0x2) != 0;
					if (local123 != local139) {
						local98 = (Static291.aByteArrayArrayArray11[1][arg1][arg2] & 0x2) != 0;
					}
				}
				if ((arg4 & 0x7F) == 0) {
					local123 = (Static291.aByteArrayArrayArray11[1][arg0 >> 7][local28 - 1] & 0x2) != 0;
					local139 = (Static291.aByteArrayArrayArray11[1][arg0 >> 7][local28] & 0x2) != 0;
					if (local139 != local123) {
						local98 = (Static291.aByteArrayArrayArray11[1][arg1][arg2] & 0x2) != 0;
					}
				}
				if (local98) {
					arg3++;
				}
				return Static263.aClass12Array2[arg3].method2698(arg0, arg4);
			} else {
				return 0;
			}
		} else {
			return Static263.aClass12Array2[arg3].method2698(arg0, arg4);
		}
	}
}
