import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static151 {

	@OriginalMember(owner = "client!jo", name = "q", descriptor = "I")
	public static int anInt2862;

	@OriginalMember(owner = "client!jo", name = "y", descriptor = "Lclient!dj;")
	public static Class49 aClass49_4;

	@OriginalMember(owner = "client!jo", name = "r", descriptor = "[Lclient!rs;")
	public static final Class179[] aClass179Array1 = new Class179[16];

	@OriginalMember(owner = "client!jo", name = "v", descriptor = "[I")
	public static final int[] anIntArray352 = new int[250];

	@OriginalMember(owner = "client!jo", name = "A", descriptor = "I")
	public static int anInt2868 = -1;

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(BI)I")
	public static int method3068(@OriginalArg(1) int arg0) {
		@Pc(5) int local5 = 0;
		if (arg0 < 0 || arg0 >= 65536) {
			local5 += 16;
			arg0 >>>= 0x10;
		}
		if (arg0 >= 256) {
			arg0 >>>= 0x8;
			local5 += 8;
		}
		if (arg0 >= 16) {
			arg0 >>>= 0x4;
			local5 += 4;
		}
		if (arg0 >= 4) {
			local5 += 2;
			arg0 >>>= 0x2;
		}
		if (arg0 >= 1) {
			local5++;
			arg0 >>>= 0x1;
		}
		return arg0 + local5;
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(III)Z")
	public static boolean method3070(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < Static235.anInt4393; local1++) {
			@Pc(6) Class151 local6 = Static351.aClass151Array2[local1];
			@Pc(15) int local15;
			@Pc(27) int local27;
			@Pc(37) int local37;
			@Pc(47) int local47;
			@Pc(57) int local57;
			if (local6.anInt4105 == 1) {
				local15 = local6.anInt4117 - arg0;
				if (local15 > 0) {
					local27 = local6.anInt4103 + (local6.anInt4110 * local15 >> 8);
					local37 = local6.anInt4116 + (local6.anInt4124 * local15 >> 8);
					local47 = local6.anInt4113 + (local6.anInt4123 * local15 >> 8);
					local57 = local6.anInt4118 + (local6.anInt4111 * local15 >> 8);
					if (arg2 >= local27 && arg2 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt4105 == 2) {
				local15 = arg0 - local6.anInt4117;
				if (local15 > 0) {
					local27 = local6.anInt4103 + (local6.anInt4110 * local15 >> 8);
					local37 = local6.anInt4116 + (local6.anInt4124 * local15 >> 8);
					local47 = local6.anInt4113 + (local6.anInt4123 * local15 >> 8);
					local57 = local6.anInt4118 + (local6.anInt4111 * local15 >> 8);
					if (arg2 >= local27 && arg2 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt4105 == 3) {
				local15 = local6.anInt4103 - arg2;
				if (local15 > 0) {
					local27 = local6.anInt4117 + (local6.anInt4106 * local15 >> 8);
					local37 = local6.anInt4112 + (local6.anInt4119 * local15 >> 8);
					local47 = local6.anInt4113 + (local6.anInt4123 * local15 >> 8);
					local57 = local6.anInt4118 + (local6.anInt4111 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt4105 == 4) {
				local15 = arg2 - local6.anInt4103;
				if (local15 > 0) {
					local27 = local6.anInt4117 + (local6.anInt4106 * local15 >> 8);
					local37 = local6.anInt4112 + (local6.anInt4119 * local15 >> 8);
					local47 = local6.anInt4113 + (local6.anInt4123 * local15 >> 8);
					local57 = local6.anInt4118 + (local6.anInt4111 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt4105 == 5) {
				local15 = arg1 - local6.anInt4113;
				if (local15 > 0) {
					local27 = local6.anInt4117 + (local6.anInt4106 * local15 >> 8);
					local37 = local6.anInt4112 + (local6.anInt4119 * local15 >> 8);
					local47 = local6.anInt4103 + (local6.anInt4110 * local15 >> 8);
					local57 = local6.anInt4116 + (local6.anInt4124 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg2 >= local47 && arg2 <= local57) {
						return true;
					}
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(Lclient!ja;Lclient!nf;IIIII)V")
	public static void method3072(@OriginalArg(0) Class81 arg0, @OriginalArg(1) Class44 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(1) boolean local1 = true;
		@Pc(3) int local3 = arg3;
		@Pc(7) int local7 = arg3 + arg5;
		@Pc(11) int local11 = arg4 - 1;
		@Pc(15) int local15 = arg4 + arg6;
		for (@Pc(17) int local17 = arg2; local17 <= arg2 + 1; local17++) {
			if (local17 != Static131.anInt2392) {
				for (@Pc(23) int local23 = local3; local23 <= local7; local23++) {
					if (local23 >= 0 && local23 < Static310.anInt5828) {
						for (@Pc(32) int local32 = local11; local32 <= local15; local32++) {
							if (local32 >= 0 && local32 < Static163.anInt3084 && (!local1 || local23 >= local7 || local32 >= local15 || local32 < arg4 && local23 != arg3)) {
								@Pc(62) Class187 local62 = Static39.aClass187ArrayArrayArray1[local17][local23][local32];
								if (local62 != null) {
									@Pc(140) int local140 = (Static203.aClass106Array3[local17].method5720(local23, local32) + Static203.aClass106Array3[local17].method5720(local23 + 1, local32) + Static203.aClass106Array3[local17].method5720(local23, local32 + 1) + Static203.aClass106Array3[local17].method5720(local23 + 1, local32 + 1)) / 4 - (Static203.aClass106Array3[arg2].method5720(arg3, arg4) + Static203.aClass106Array3[arg2].method5720(arg3 + 1, arg4) + Static203.aClass106Array3[arg2].method5720(arg3, arg4 + 1) + Static203.aClass106Array3[arg2].method5720(arg3 + 1, arg4 + 1)) / 4;
									@Pc(143) Class44_Sub5 local143 = local62.aClass44_Sub5_1;
									@Pc(146) Class44_Sub5 local146 = local62.aClass44_Sub5_2;
									if (local143 != null && local143.method5783()) {
										arg1.method5780(local140, local1, (local23 - arg3) * 128 + (1 - arg5) * 64, (local32 - arg4) * 128 + (1 - arg6) * 64, local143, arg0);
									}
									if (local146 != null && local146.method5783()) {
										arg1.method5780(local140, local1, (local23 - arg3) * 128 + (1 - arg5) * 64, (local32 - arg4) * 128 + (1 - arg6) * 64, local146, arg0);
									}
									for (@Pc(219) Class214 local219 = local62.aClass214_19; local219 != null; local219 = local219.aClass214_21) {
										@Pc(223) Class44_Sub4 local223 = local219.aClass44_Sub4_1;
										if (local223 != null && local223.method5783() && (local23 == local223.aShort90 || local23 == local3) && (local32 == local223.aShort89 || local32 == local11)) {
											@Pc(252) int local252 = local223.aShort87 + 1 - local223.aShort90;
											@Pc(260) int local260 = local223.aShort88 + 1 - local223.aShort89;
											arg1.method5780(local140, local1, (local223.aShort90 - arg3) * 128 + (local252 - arg5) * 64, (local223.aShort89 - arg4) * 128 + (local260 - arg6) * 64, local223, arg0);
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

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(IIILclient!js;Lclient!js;)V")
	public static void method3073(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class44_Sub5 arg3, @OriginalArg(4) Class44_Sub5 arg4) {
		if (Static39.aClass187ArrayArrayArray1[arg0][arg1][arg2] == null) {
			Static101.method2079(arg0, arg1, arg2);
		}
		Static39.aClass187ArrayArrayArray1[arg0][arg1][arg2].aClass44_Sub5_1 = arg3;
		Static39.aClass187ArrayArrayArray1[arg0][arg1][arg2].aClass44_Sub5_2 = arg4;
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(ZLclient!ja;)V")
	public static void method3074(@OriginalArg(1) Class81 arg0) {
		if (Static122.aClass211_20.method5583() == 0) {
			return;
		}
		@Pc(20) Class6_Sub40 local20;
		if (Static13.anInt232 == 0 || Static13.anInt232 == 2) {
			for (local20 = (Class6_Sub40) Static122.aClass211_20.method5594(); local20 != null; local20 = (Class6_Sub40) Static122.aClass211_20.method5582()) {
				Static53.method885(local20.aBoolean399 ? Static253.aClass44_Sub4_Sub4_Sub1_1.aClass21_2 : null, local20.anInt5955, false, local20.anInt5948, local20.anInt5953, Static350.aClass30_6, arg0, local20.anInt5950, arg0, false, local20.anInt5954);
				local20.method5756();
			}
			Static205.method5709();
			return;
		}
		if (Static320.aClass81_9 == null) {
			@Pc(71) Canvas local71 = new Canvas();
			local71.setSize(36, 32);
			Static320.aClass81_9 = Static220.method3909(Static308.aClass206_5, local71, Static263.anInterface2_5, 0, 0);
			Static238.aClass30_3 = Static320.aClass81_9.method3046(Static61.method994(Static53.anInt1015, Static5.aClass53_8), Static363.method2249(Static269.aClass53_124, Static53.anInt1015));
		}
		for (local20 = (Class6_Sub40) Static122.aClass211_20.method5594(); local20 != null; local20 = (Class6_Sub40) Static122.aClass211_20.method5582()) {
			Static53.method885(local20.aBoolean399 ? Static253.aClass44_Sub4_Sub4_Sub1_1.aClass21_2 : null, local20.anInt5955, false, local20.anInt5948, local20.anInt5953, Static238.aClass30_3, Static320.aClass81_9, local20.anInt5950, arg0, false, local20.anInt5954);
			local20.method5756();
		}
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(ILclient!dp;)V")
	public static void method3075(@OriginalArg(1) Class53 arg0) {
		Static345.aClass53_158 = arg0;
	}
}
