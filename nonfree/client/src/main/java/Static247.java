import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static247 {

	@OriginalMember(owner = "client!po", name = "a", descriptor = "[I")
	public static int[] anIntArray485 = new int[2];

	@OriginalMember(owner = "client!po", name = "f", descriptor = "I")
	public static int anInt4265 = 0;

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(II)I")
	public static int method4066(@OriginalArg(0) int arg0) {
		@Pc(0) int local0 = arg0 - 1;
		@Pc(10) int local10 = local0 | local0 >>> 1;
		@Pc(16) int local16 = local10 | local10 >>> 2;
		@Pc(22) int local22 = local16 | local16 >>> 4;
		@Pc(28) int local28 = local22 | local22 >>> 8;
		@Pc(39) int local39 = local28 | local28 >>> 16;
		return local39 + 1;
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(IZ)V")
	public static void method4073(@OriginalArg(0) int arg0) {
		Static192.anInt3645 = -1;
		Static17.anInt6198 = -1;
		Static61.anInt1126 = arg0;
		Static323.method5376();
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(B)V")
	public static void method4076() {
		for (@Pc(18) Class6_Sub2_Sub20 local18 = (Class6_Sub2_Sub20) Static62.aClass211_5.method5594(); local18 != null; local18 = (Class6_Sub2_Sub20) Static62.aClass211_5.method5582()) {
			@Pc(23) Class44_Sub4_Sub3 local23 = local18.aClass44_Sub4_Sub3_1;
			if (Static343.anInt6225 != local23.aByte90 || local23.anInt4382 < Static76.anInt2853) {
				local18.method5756();
				local23.method4173();
			} else if (local23.anInt4377 <= Static76.anInt2853) {
				if (local23.anInt4381 > 0) {
					@Pc(45) Class44_Sub4_Sub4_Sub2 local45 = Static239.aClass44_Sub4_Sub4_Sub2Array8[local23.anInt4381 - 1];
					if (local45 != null && local45.anInt6340 >= 0 && Static153.anInt2883 * 128 > local45.anInt6340 && local45.anInt6339 >= 0 && Static246.anInt4606 * 128 > local45.anInt6339) {
						local23.method4172(Static306.method5249(local45.anInt6339, local45.anInt6340, local23.aByte90) - local23.anInt4374, local45.anInt6340, Static76.anInt2853, local45.anInt6339);
					}
				}
				if (local23.anInt4381 < 0) {
					@Pc(101) int local101 = -local23.anInt4381 - 1;
					@Pc(108) Class44_Sub4_Sub4_Sub1 local108;
					if (local101 == Static44.anInt879) {
						local108 = Static253.aClass44_Sub4_Sub4_Sub1_1;
					} else {
						local108 = Static343.aClass44_Sub4_Sub4_Sub1Array1[local101];
					}
					if (local108 != null && local108.anInt6340 >= 0 && local108.anInt6340 < Static153.anInt2883 * 128 && local108.anInt6339 >= 0 && Static246.anInt4606 * 128 > local108.anInt6339) {
						local23.method4172(Static306.method5249(local108.anInt6339, local108.anInt6340, local23.aByte90) - local23.anInt4374, local108.anInt6340, Static76.anInt2853, local108.anInt6339);
					}
				}
				local23.method4171(Static133.anInt2448);
				Static73.method1271(local23, true);
			}
		}
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(IIIII)Z")
	public static boolean method4078(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if ((Static265.aByteArrayArrayArray11[0][arg0][arg1] & 0x2) != 0) {
			return true;
		} else if ((Static265.aByteArrayArrayArray11[arg3][arg0][arg1] & 0x10) == 0) {
			return arg2 == Static172.method3367(arg0, arg3, arg1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;ZLjava/lang/String;I)V")
	public static void method4080(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(4) String arg3, @OriginalArg(5) int arg4) {
		Static156.method5548(null, arg3, arg0, -1, arg4, arg2, arg1);
	}
}
