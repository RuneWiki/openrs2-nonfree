import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static207 {

	@OriginalMember(owner = "client!pn", name = "w", descriptor = "I")
	public static int anInt4867;

	@OriginalMember(owner = "client!pn", name = "B", descriptor = "I")
	public static int anInt4872 = -2;

	@OriginalMember(owner = "client!pn", name = "C", descriptor = "[Lclient!gk;")
	public static Class1_Sub2_Sub10[] aClass1_Sub2_Sub10Array8 = new Class1_Sub2_Sub10[14];

	@OriginalMember(owner = "client!pn", name = "F", descriptor = "Ljava/lang/String;")
	public static String aString285 = "scroll:";

	@OriginalMember(owner = "client!pn", name = "I", descriptor = "[I")
	public static int[] anIntArray425 = new int[1000];

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(Lclient!sc;I)I")
	public static int method3769(@OriginalArg(0) Class14_Sub2_Sub2 arg0) {
		@Pc(16) Class46 local16 = arg0.aClass46_1;
		if (local16.anIntArray148 != null) {
			local16 = local16.method1283();
			if (local16 == null) {
				return -1;
			}
		}
		@Pc(32) int local32 = local16.anInt1547;
		@Pc(36) Class164 local36 = arg0.method3650();
		if (local36.anInt5190 == arg0.anInt4658) {
			local32 = local16.anInt1545;
		} else if (arg0.anInt4658 == local36.anInt5207 || local36.anInt5215 == arg0.anInt4658 || local36.anInt5205 == arg0.anInt4658 || local36.anInt5222 == arg0.anInt4658) {
			local32 = local16.anInt1543;
		} else if (local36.anInt5221 == arg0.anInt4658 || local36.anInt5192 == arg0.anInt4658 || local36.anInt5195 == arg0.anInt4658 || arg0.anInt4658 == local36.anInt5209) {
			local32 = local16.anInt1530;
		}
		return local32;
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(B[B)[B")
	public static byte[] method3771(@OriginalArg(1) byte[] arg0) {
		@Pc(16) Class1_Sub11 local16 = new Class1_Sub11(arg0);
		@Pc(20) int local20 = local16.method2690();
		@Pc(24) int local24 = local16.method2643();
		if (local24 < 0 || Static291.anInt5526 != 0 && Static291.anInt5526 < local24) {
			throw new RuntimeException();
		} else if (local20 == 0) {
			@Pc(93) byte[] local93 = new byte[local24];
			local16.method2678(local93, local24);
			return local93;
		} else {
			@Pc(51) int local51 = local16.method2643();
			if (local51 < 0 || Static291.anInt5526 != 0 && Static291.anInt5526 < local51) {
				throw new RuntimeException();
			}
			@Pc(71) byte[] local71 = new byte[local51];
			if (local20 == 1) {
				Static12.method267(local71, local51, arg0, local24);
			} else {
				Static193.aClass48_1.method1360(local71, local16);
			}
			return local71;
		}
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;")
	public static String method3772(@OriginalArg(1) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2) {
		@Pc(4) int local4 = arg1.length();
		@Pc(11) int local11 = arg2.length();
		@Pc(14) int local14 = arg0.length();
		if (local11 == 0) {
			throw new IllegalArgumentException("Key cannot have zero length");
		}
		@Pc(24) int local24 = local4;
		@Pc(28) int local28 = local14 - local11;
		if (local28 != 0) {
			@Pc(35) int local35 = 0;
			while (true) {
				local35 = arg1.indexOf(arg2, local35);
				if (local35 < 0) {
					break;
				}
				local35 += local11;
				local24 += local28;
			}
		}
		@Pc(59) StringBuffer local59 = new StringBuffer(local24);
		@Pc(67) int local67 = 0;
		while (true) {
			@Pc(72) int local72 = arg1.indexOf(arg2, local67);
			if (local72 < 0) {
				local59.append(arg1.substring(local67));
				return local59.toString();
			}
			local59.append(arg1.substring(local67, local72));
			local59.append(arg0);
			local67 = local72 + local11;
		}
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(BII)Ljava/lang/String;")
	public static String method3774(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = arg1 - arg0;
		if (local8 < -9) {
			return "<col=ff0000>";
		} else if (local8 < -6) {
			return "<col=ff3000>";
		} else if (local8 < -3) {
			return "<col=ff7000>";
		} else if (local8 < 0) {
			return "<col=ffb000>";
		} else if (local8 > 9) {
			return "<col=00ff00>";
		} else if (local8 > 6) {
			return "<col=40ff00>";
		} else if (local8 > 3) {
			return "<col=80ff00>";
		} else if (local8 <= 0) {
			return "<col=ffff00>";
		} else {
			return "<col=c0ff00>";
		}
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(Lclient!dn;IIIII)V")
	public static void method3777(@OriginalArg(0) Class14 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(1) boolean local1 = true;
		@Pc(3) int local3 = arg2;
		@Pc(7) int local7 = arg2 + arg4;
		@Pc(11) int local11 = arg3 - 1;
		@Pc(15) int local15 = arg3 + arg5;
		for (@Pc(17) int local17 = arg1; local17 <= arg1 + 1; local17++) {
			if (local17 != Static169.anInt3625) {
				for (@Pc(28) int local28 = local3; local28 <= local7; local28++) {
					if (local28 >= 0 && local28 < Static158.anInt3404) {
						for (@Pc(39) int local39 = local11; local39 <= local15; local39++) {
							if (local39 >= 0 && local39 < Static209.anInt4179 && (!local1 || local28 >= local7 || local39 >= local15 || local39 < arg3 && local28 != arg2)) {
								@Pc(71) Class1_Sub26 local71 = Static74.aClass1_Sub26ArrayArrayArray1[local17][local28][local39];
								if (local71 != null) {
									@Pc(158) int local158 = (Static55.anIntArrayArrayArray3[local17][local28][local39] + Static55.anIntArrayArrayArray3[local17][local28 + 1][local39] + Static55.anIntArrayArrayArray3[local17][local28][local39 + 1] + Static55.anIntArrayArrayArray3[local17][local28 + 1][local39 + 1]) / 4 - (Static55.anIntArrayArrayArray3[arg1][arg2][arg3] + Static55.anIntArrayArrayArray3[arg1][arg2 + 1][arg3] + Static55.anIntArrayArrayArray3[arg1][arg2][arg3 + 1] + Static55.anIntArrayArrayArray3[arg1][arg2 + 1][arg3 + 1]) / 4;
									@Pc(161) Class72 local161 = local71.aClass72_1;
									if (local161 != null) {
										if (local161.aClass14_10.method4093()) {
											arg0.method4090(local161.aClass14_10, (local28 - arg2) * 128 + (1 - arg4) * 64, local158, (local39 - arg3) * 128 + (1 - arg5) * 64, local1);
										}
										if (local161.aClass14_9 != null && local161.aClass14_9.method4093()) {
											arg0.method4090(local161.aClass14_9, (local28 - arg2) * 128 + (1 - arg4) * 64, local158, (local39 - arg3) * 128 + (1 - arg5) * 64, local1);
										}
									}
									for (@Pc(232) int local232 = 0; local232 < local71.anInt4090; local232++) {
										@Pc(241) Class25 local241 = local71.aClass25Array4[local232];
										if (local241 != null && local241.aClass14_1.method4093() && (local28 == local241.anInt1003 || local28 == local3) && (local39 == local241.anInt1000 || local39 == local11)) {
											@Pc(270) int local270 = local241.anInt1004 + 1 - local241.anInt1003;
											@Pc(278) int local278 = local241.anInt999 + 1 - local241.anInt1000;
											arg0.method4090(local241.aClass14_1, (local241.anInt1003 - arg2) * 128 + (local270 - arg4) * 64, local158, (local241.anInt1000 - arg3) * 128 + (local278 - arg5) * 64, local1);
										}
									}
								}
							}
						}
					}
				}
				local3--;
				local1 = false;
			}
		}
	}
}
