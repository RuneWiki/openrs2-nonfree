import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static621 {

	@OriginalMember(owner = "client!wd", name = "L", descriptor = "[I")
	public static int[] anIntArray704;

	@OriginalMember(owner = "client!wd", name = "M", descriptor = "I")
	public static int anInt10870;

	@OriginalMember(owner = "client!wd", name = "F", descriptor = "Lclient!eq;")
	public static final Class99 aClass99_82 = new Class99(16);

	@OriginalMember(owner = "client!wd", name = "K", descriptor = "Lclient!mu;")
	public static final Class215 aClass215_253 = new Class215(100, -1);

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(BLclient!cea;)V")
	public static void method9053(@OriginalArg(1) Class2_Sub11 arg0) {
		@Pc(9) int local9 = arg0.method8378();
		Static34.aClass359Array1 = new Class359[local9];
		for (@Pc(14) int local14 = 0; local14 < local9; local14++) {
			Static34.aClass359Array1[local14] = new Class359();
			Static34.aClass359Array1[local14].anInt10557 = arg0.method8378();
			Static34.aClass359Array1[local14].aString105 = arg0.method8367();
		}
		Static154.anInt7074 = arg0.method8378();
		Static167.anInt4124 = arg0.method8378();
		Static513.anInt9421 = arg0.method8378();
		Static507.aClass206_Sub1Array2 = new Class206_Sub1[Static167.anInt4124 + 1 - Static154.anInt7074];
		for (@Pc(66) int local66 = 0; local66 < Static513.anInt9421; local66++) {
			@Pc(72) int local72 = arg0.method8378();
			@Pc(80) Class206_Sub1 local80 = Static507.aClass206_Sub1Array2[local72] = new Class206_Sub1();
			local80.anInt6905 = arg0.method8383();
			local80.anInt6902 = arg0.method8381();
			local80.anInt6906 = Static154.anInt7074 + local72;
			local80.aString74 = arg0.method8367();
			local80.aString75 = arg0.method8367();
		}
		Static65.anInt11081 = arg0.method8381();
		Static471.aBoolean644 = true;
	}

	@OriginalMember(owner = "client!wd", name = "b", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
	public static String method9056(@OriginalArg(0) String arg0) {
		@Pc(13) int local13 = arg0.length();
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < local13; local17++) {
			@Pc(23) char local23 = arg0.charAt(local17);
			if (local23 == '<' || local23 == '>') {
				local15 += 3;
			}
		}
		@Pc(41) StringBuffer local41 = new StringBuffer(local15 + local13);
		for (@Pc(43) int local43 = 0; local43 < local13; local43++) {
			@Pc(49) char local49 = arg0.charAt(local43);
			if (local49 == '<') {
				local41.append("<lt>");
			} else if (local49 == '>') {
				local41.append("<gt>");
			} else {
				local41.append(local49);
			}
		}
		return local41.toString();
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(Lclient!vl;Lclient!vl;B)V")
	public static void method9057(@OriginalArg(0) Class2_Sub6 arg0, @OriginalArg(1) Class2_Sub6 arg1) {
		if (arg0.aClass2_Sub6_65 != null) {
			arg0.method8933();
		}
		arg0.aClass2_Sub6_65 = arg1;
		arg0.aClass2_Sub6_66 = arg1.aClass2_Sub6_66;
		arg0.aClass2_Sub6_65.aClass2_Sub6_66 = arg0;
		arg0.aClass2_Sub6_66.aClass2_Sub6_65 = arg0;
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(III[IZBIII[IILclient!fe;III)I")
	public static int method9058(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int[] arg8, @OriginalArg(10) int arg9, @OriginalArg(11) Class104 arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12, @OriginalArg(14) int arg13) {
		for (@Pc(3) int local3 = 0; local3 < 128; local3++) {
			for (@Pc(7) int local7 = 0; local7 < 128; local7++) {
				Static475.anIntArrayArray57[local3][local7] = 0;
				Static5.anIntArrayArray1[local3][local7] = 99999999;
			}
		}
		@Pc(58) boolean local58;
		if (arg1 == 1) {
			local58 = Static65.method9243(arg0, arg9, arg7, arg13, arg12, arg11, arg10, arg5, arg2, arg6);
		} else if (arg1 == 2) {
			local58 = Static572.method8536(arg5, arg9, arg10, arg0, arg7, arg11, arg2, arg12, arg6, arg13);
		} else {
			local58 = Static462.method7181(arg11, arg13, arg7, arg2, arg0, arg6, arg12, arg1, arg10, arg5, arg9);
		}
		@Pc(93) int local93 = arg6 - 64;
		@Pc(97) int local97 = arg7 - 64;
		@Pc(99) int local99 = Static604.anInt10625;
		@Pc(101) int local101 = Static359.anInt7117;
		@Pc(109) int local109;
		@Pc(111) int local111;
		@Pc(118) int local118;
		if (!local58) {
			if (!arg4) {
				return -1;
			}
			local109 = Integer.MAX_VALUE;
			local111 = Integer.MAX_VALUE;
			for (local118 = arg0 - 10; local118 <= arg0 + 10; local118++) {
				for (@Pc(124) int local124 = arg9 - 10; local124 <= arg9 + 10; local124++) {
					@Pc(130) int local130 = local118 - local93;
					@Pc(135) int local135 = local124 - local97;
					if (local130 >= 0 && local135 >= 0 && local130 < 128 && local135 < 128 && Static5.anIntArrayArray1[local130][local135] < 100) {
						@Pc(157) int local157 = 0;
						if (local118 < arg0) {
							local157 = arg0 - local118;
						} else if (arg11 + arg0 - 1 < local118) {
							local157 = local118 + 1 - arg0 - arg11;
						}
						@Pc(188) int local188 = 0;
						if (local124 < arg9) {
							local188 = arg9 - local124;
						} else if (local124 > arg2 + arg9 - 1) {
							local188 = local124 + 1 - arg2 - arg9;
						}
						@Pc(226) int local226 = local157 * local157 + local188 * local188;
						if (local109 > local226 || local109 == local226 && local111 > Static5.anIntArrayArray1[local130][local135]) {
							local109 = local226;
							local99 = local118;
							local111 = Static5.anIntArrayArray1[local130][local135];
							local101 = local124;
						}
					}
				}
			}
			if (local109 == Integer.MAX_VALUE) {
				return -1;
			}
		}
		if (local99 == arg6 && arg7 == local101) {
			return 0;
		}
		@Pc(300) byte local300 = 0;
		Static407.anIntArray495[0] = local99;
		local109 = local300 + 1;
		Static485.anIntArray581[0] = local101;
		@Pc(327) int local327;
		local111 = local327 = Static475.anIntArrayArray57[local99 - local93][local101 - local97];
		while (arg6 != local99 || local101 != arg7) {
			if (local111 != local327) {
				Static407.anIntArray495[local109] = local99;
				local327 = local111;
				Static485.anIntArray581[local109++] = local101;
			}
			if ((local111 & 0x2) != 0) {
				local99++;
			} else if ((local111 & 0x8) != 0) {
				local99--;
			}
			if ((local111 & 0x1) != 0) {
				local101++;
			} else if ((local111 & 0x4) != 0) {
				local101--;
			}
			local111 = Static475.anIntArrayArray57[local99 - local93][local101 - local97];
		}
		local118 = 0;
		while (local109-- > 0) {
			arg8[local118] = Static407.anIntArray495[local109];
			arg3[local118++] = Static485.anIntArray581[local109];
			if (arg8.length <= local118) {
				break;
			}
		}
		return local118;
	}
}
