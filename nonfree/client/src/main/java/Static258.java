import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static258 {

	@OriginalMember(owner = "client!k", name = "e", descriptor = "I")
	public static int anInt4718;

	@OriginalMember(owner = "client!k", name = "l", descriptor = "I")
	public static int anInt4723;

	@OriginalMember(owner = "client!k", name = "k", descriptor = "Lclient!lh;")
	public static final Class208 aClass208_59 = new Class208(62, 7);

	@OriginalMember(owner = "client!k", name = "m", descriptor = "I")
	public static int anInt4724 = -1;

	@OriginalMember(owner = "client!k", name = "n", descriptor = "I")
	public static int anInt4725 = 0;

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(JJ)J")
	public static long method3753(@OriginalArg(0) long arg0, @OriginalArg(1) long arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(IIZI)V")
	public static void method3754(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(13) Class130 local13 = Static366.aClass130ArrayArray1[arg1][arg0];
		Static176.method2782(local13 == null ? Static485.aClass130_1 : local13, arg2);
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(Z[B)[B")
	public static byte[] method3756(@OriginalArg(1) byte[] arg0) {
		@Pc(8) Class1_Sub3 local8 = new Class1_Sub3(arg0);
		@Pc(12) int local12 = local8.method7974();
		@Pc(16) int local16 = local8.method7940();
		if (local16 < 0 || Static412.anInt7297 != 0 && Static412.anInt7297 < local16) {
			throw new RuntimeException();
		} else if (local12 == 0) {
			@Pc(106) byte[] local106 = new byte[local16];
			local8.method7957(local106, local16);
			return local106;
		} else {
			@Pc(52) int local52 = local8.method7940();
			if (local52 < 0 || Static412.anInt7297 != 0 && Static412.anInt7297 < local52) {
				throw new RuntimeException();
			}
			@Pc(72) byte[] local72 = new byte[local52];
			if (local12 == 1) {
				Static530.method7274(local72, local52, arg0, local16);
			} else {
				@Pc(88) Class200 local88 = Static516.aClass200_1;
				synchronized (Static516.aClass200_1) {
					Static516.aClass200_1.method4334(local8, local72);
				}
			}
			return local72;
		}
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(Lclient!qh;[IZ[I[I)V")
	public static void method3757(@OriginalArg(0) Class11_Sub1_Sub1_Sub3_Sub2 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int[] arg3) {
		for (@Pc(8) int local8 = 0; local8 < arg1.length; local8++) {
			@Pc(14) int local14 = arg1[local8];
			@Pc(18) int local18 = arg2[local8];
			@Pc(22) int local22 = arg3[local8];
			for (@Pc(24) int local24 = 0; local18 != 0 && arg0.aClass221Array3.length > local24; local24++) {
				if ((local18 & 0x1) != 0) {
					if (local14 == -1) {
						arg0.aClass221Array3[local24] = null;
					} else {
						@Pc(42) Class197 local42 = Static223.aClass245_1.method5312(local14);
						@Pc(45) int local45 = local42.anInt5072;
						@Pc(50) Class221 local50 = arg0.aClass221Array3[local24];
						if (local50 != null) {
							if (local14 == local50.anInt5858) {
								if (local45 == 0) {
									local50 = arg0.aClass221Array3[local24] = null;
								} else if (local45 == 1) {
									local50.anInt5859 = 0;
									local50.anInt5854 = 0;
									local50.anInt5860 = 0;
									local50.anInt5856 = local22;
									local50.anInt5857 = 1;
									if (!arg0.aBoolean577) {
										Static473.method6515(arg0, local42, 0);
									}
								} else if (local45 == 2) {
									local50.anInt5859 = 0;
								}
							} else if (local42.anInt5076 >= Static223.aClass245_1.method5312(local50.anInt5858).anInt5076) {
								local50 = arg0.aClass221Array3[local24] = null;
							}
						}
						if (local50 == null) {
							local50 = arg0.aClass221Array3[local24] = new Class221();
							local50.anInt5860 = 0;
							local50.anInt5859 = 0;
							local50.anInt5856 = local22;
							local50.anInt5858 = local14;
							local50.anInt5857 = 1;
							local50.anInt5854 = 0;
							if (!arg0.aBoolean577) {
								Static473.method6515(arg0, local42, 0);
							}
						}
					}
				}
				local18 >>>= 0x1;
			}
		}
	}
}
