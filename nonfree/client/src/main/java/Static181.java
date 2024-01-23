import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static181 {

	@OriginalMember(owner = "client!nl", name = "m", descriptor = "Lclient!rf;")
	public static Interface4 anInterface4_1;

	@OriginalMember(owner = "client!nl", name = "p", descriptor = "I")
	public static int anInt3792;

	@OriginalMember(owner = "client!nl", name = "q", descriptor = "Lclient!km;")
	public static Class91 aClass91_145;

	@OriginalMember(owner = "client!nl", name = "f", descriptor = "Ljava/lang/String;")
	public static String aString223 = "purple:";

	@OriginalMember(owner = "client!nl", name = "k", descriptor = "Ljava/lang/String;")
	public static String aString224 = "Loading interfaces - ";

	@OriginalMember(owner = "client!nl", name = "l", descriptor = "[I")
	public static int[] anIntArray339 = new int[5];

	@OriginalMember(owner = "client!nl", name = "o", descriptor = "[I")
	public static int[] anIntArray340 = new int[25];

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(B)V")
	public static void method3035() {
		Static160.aClass70_9 = new Class70(32);
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(Ljava/lang/String;II)V")
	public static void method3036(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1) {
		@Pc(12) Class1_Sub2_Sub18 local12 = Static130.method2227(arg1, 2);
		local12.method3905();
		local12.aString296 = arg0;
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(Z[I[Ljava/lang/Object;)V")
	public static void method3037(@OriginalArg(1) int[] arg0, @OriginalArg(2) Object[] arg1) {
		Static130.method2226(0, arg0.length - 1, arg0, arg1);
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(ZI)V")
	public static void method3038(@OriginalArg(0) boolean arg0) {
		@Pc(13) byte local13;
		@Pc(11) byte[][] local11;
		if (Static277.aBoolean412 && arg0) {
			local13 = 1;
			local11 = Static143.aByteArrayArray8;
		} else {
			local11 = Static39.aByteArrayArray5;
			local13 = 4;
		}
		@Pc(22) int local22 = local11.length;
		@Pc(30) int local30;
		@Pc(51) int local51;
		for (local30 = 0; local30 < local22; local30++) {
			@Pc(37) byte[] local37 = local11[local30];
			@Pc(43) int local43 = Static24.anIntArray414[local30] >> 8;
			@Pc(45) int[] local45 = null;
			local51 = Static24.anIntArray414[local30] & 0xFF;
			@Pc(58) int local58 = local51 * 64 - Static83.anInt1875;
			@Pc(65) int local65 = local43 * 64 - Static53.anInt5288;
			if (local37 != null) {
				Static105.method1947();
				local45 = Static9.method248(local37, local58, Static88.aClass92Array1, Static83.anInt1875, Static53.anInt5288, arg0, local65);
			}
			if (!arg0 && anInt3792 / 8 == local43 && local51 == Static153.anInt3329 / 8) {
				if (local45 == null) {
					Static170.anInt3639 = -1;
				} else {
					Static203.anInt4126 = local45[3];
					Static103.anInt2428 = local45[4];
					Static143.anInt3072 = local45[2];
					Static170.anInt3639 = local45[0];
					Static128.anInt2844 = local45[1];
				}
			}
		}
		for (local30 = 0; local30 < local22; local30++) {
			@Pc(143) int local143 = (Static24.anIntArray414[local30] >> 8) * 64 - Static53.anInt5288;
			@Pc(154) int local154 = (Static24.anIntArray414[local30] & 0xFF) * 64 - Static83.anInt1875;
			@Pc(158) byte[] local158 = local11[local30];
			if (local158 == null && Static153.anInt3329 < 800) {
				Static105.method1947();
				for (local51 = 0; local51 < local13; local51++) {
					Static246.method3816(local51, 64, 64, local143, local154);
				}
			}
		}
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(SILjava/lang/String;IJILjava/lang/String;I)V")
	public static void method3039(@OriginalArg(0) short arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) long arg4, @OriginalArg(6) String arg5, @OriginalArg(7) int arg6) {
		if (Static14.aBoolean23 || Static134.anInt2945 >= 500) {
			return;
		}
		Static92.aStringArray26[Static134.anInt2945] = arg2;
		Static266.aStringArray50[Static134.anInt2945] = arg5;
		Static20.anIntArray44[Static134.anInt2945] = arg1 == -1 ? Static254.anInt4981 : arg1;
		Static61.aShortArray23[Static134.anInt2945] = arg0;
		Static152.aLongArray7[Static134.anInt2945] = arg4;
		Static219.anIntArray387[Static134.anInt2945] = arg6;
		Static164.anIntArray311[Static134.anInt2945] = arg3;
		Static134.anInt2945++;
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(Lclient!co;)V")
	public static void method3040(@OriginalArg(0) Class25 arg0) {
		for (@Pc(2) int local2 = arg0.anInt1003; local2 <= arg0.anInt1004; local2++) {
			for (@Pc(9) int local9 = arg0.anInt1000; local9 <= arg0.anInt999; local9++) {
				@Pc(22) Class1_Sub26 local22 = Static74.aClass1_Sub26ArrayArrayArray1[arg0.anInt1007][local2][local9];
				if (local22 != null) {
					@Pc(26) int local26;
					for (local26 = 0; local26 < local22.anInt4090; local26++) {
						if (local22.aClass25Array4[local26] == arg0) {
							local22.anInt4090--;
							for (@Pc(44) int local44 = local26; local44 < local22.anInt4090; local44++) {
								local22.aClass25Array4[local44] = local22.aClass25Array4[local44 + 1];
								local22.anIntArray366[local44] = local22.anIntArray366[local44 + 1];
							}
							local22.aClass25Array4[local22.anInt4090] = null;
							break;
						}
					}
					local22.anInt4088 = 0;
					for (local26 = 0; local26 < local22.anInt4090; local26++) {
						local22.anInt4088 |= local22.anIntArray366[local26];
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(ZII)Ljava/lang/String;")
	public static String method3041(@OriginalArg(2) int arg0) {
		return arg0 < 0 ? Integer.toString(arg0) : Static99.method1847(arg0);
	}

	@OriginalMember(owner = "client!nl", name = "b", descriptor = "(B)V")
	public static void method3043() {
		@Pc(3) int local3 = Static279.anInt5379;
		@Pc(9) int local9 = Static88.anInt1955;
		@Pc(11) int local11 = Static116.anInt5594;
		@Pc(13) int local13 = Static276.anInt2924;
		if (Static277.aBoolean412) {
			Static41.method832(local3, local9, local11, local13, 6116423);
			Static41.method832(local3 + 1, local9 + 1, local11 - 2, 16, 0);
			Static41.method844(local3 + 1, local9 + 18, local11 - 2, local13 - 19, 0);
		} else {
			Static50.method954(local3, local9, local11, local13, 6116423);
			Static50.method954(local3 + 1, local9 + 1, local11 - 2, 16, 0);
			Static50.method946(local3 + 1, local9 - -18, local11 - 2, local13 + -19, 0);
		}
		Static134.aClass1_Sub2_Sub1_3.method458(Static185.aString226, local3 + 3, local9 - -14, 6116423, -1);
		@Pc(96) int local96 = Static224.anInt4445;
		@Pc(98) int local98 = Static8.anInt226;
		for (@Pc(106) int local106 = 0; local106 < Static134.anInt2945; local106++) {
			@Pc(122) int local122 = local9 + (-local106 + (Static134.anInt2945 - 1)) * 15 + 31;
			@Pc(124) int local124 = 16777215;
			if (local3 < local96 && local96 < local3 + local11 && local98 > local122 - 13 && local122 + 3 > local98) {
				local124 = 16776960;
			}
			Static134.aClass1_Sub2_Sub1_3.method458(Static132.method2239(local106), local3 + 3, local122, local124, 0);
		}
		Static282.method4247(Static88.anInt1955, Static276.anInt2924, Static279.anInt5379, Static116.anInt5594);
	}
}
