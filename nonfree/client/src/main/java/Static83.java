import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static83 {

	@OriginalMember(owner = "client!fa", name = "b", descriptor = "Lclient!ct;")
	public static Class30 aClass30_21;

	@OriginalMember(owner = "client!fa", name = "i", descriptor = "Lclient!ct;")
	public static Class30 aClass30_22;

	@OriginalMember(owner = "client!fa", name = "m", descriptor = "I")
	public static int anInt1863;

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray3 = new boolean[][] { new boolean[4], new boolean[4], { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, new boolean[4], new boolean[4], new boolean[4], new boolean[4] };

	@OriginalMember(owner = "client!fa", name = "c", descriptor = "[Lclient!fs;")
	public static final Class65[] aClass65Array1 = new Class65[50];

	@OriginalMember(owner = "client!fa", name = "p", descriptor = "[B")
	public static final byte[] aByteArray39 = new byte[2048];

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(IILclient!kg;Lclient!ae;ILclient!tm;II)V")
	public static void method1772(@OriginalArg(1) int arg0, @OriginalArg(2) Class112 arg1, @OriginalArg(3) Class4 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class92 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg2 == null) {
			return;
		}
		@Pc(16) int local16;
		if (Static50.anInt1273 == 4) {
			local16 = (int) Static357.aFloat76 & 0x3FFF;
		} else {
			local16 = Static163.anInt3359 + (int) Static357.aFloat76 & 0x3FFF;
		}
		@Pc(37) int local37 = Math.max(arg1.anInt3381 / 2, arg1.anInt3444 / 2) + 10;
		@Pc(45) int local45 = arg3 * arg3 + arg0 * arg0;
		if (local37 * local37 < local45) {
			return;
		}
		@Pc(55) int local55 = Class208.anIntArray479[local16];
		@Pc(63) int local63 = Class208.anIntArray478[local16];
		if (Static50.anInt1273 != 4) {
			local55 = local55 * 256 / (Static293.anInt4951 + 256);
			local63 = local63 * 256 / (Static293.anInt4951 + 256);
		}
		@Pc(95) int local95 = local55 * arg3 + local63 * arg0 >> 15;
		@Pc(106) int local106 = arg3 * local63 - local55 * arg0 >> 15;
		arg2.method5960(arg5 + arg1.anInt3381 / 2 + local95 - arg2.method5961() / 2, arg6 + arg1.anInt3444 / 2 + -local106 - arg2.method5963() / 2, arg4, arg5, arg6);
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(Lclient!wc;I)V")
	public static void method1774(@OriginalArg(0) Class11_Sub2_Sub6_Sub1 arg0) {
		@Pc(16) Class1_Sub40 local16 = (Class1_Sub40) Static367.aClass38_33.method1475((long) arg0.anInt6792);
		if (local16 == null) {
			return;
		}
		if (local16.aClass1_Sub6_Sub2_2 != null) {
			Static324.aClass1_Sub6_Sub3_2.method3786(local16.aClass1_Sub6_Sub2_2);
			local16.aClass1_Sub6_Sub2_2 = null;
		}
		local16.method6045();
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(II)Z")
	public static boolean method1776(@OriginalArg(1) int arg0) {
		if (arg0 == 30 || arg0 == 5 || arg0 == 19 || arg0 == 58 || arg0 == 46) {
			return true;
		} else {
			return arg0 == 59 || arg0 == 1010;
		}
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(Lclient!ge;II)Z")
	public static boolean method1777(@OriginalArg(0) Class1_Sub7_Sub2 arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = arg0.method2169(2);
		@Pc(25) int local25;
		@Pc(30) int local30;
		@Pc(95) int local95;
		@Pc(99) int local99;
		@Pc(105) int local105;
		@Pc(116) int local116;
		if (local8 == 0) {
			if (arg0.method2169(1) != 0) {
				method1777(arg0, arg1);
			}
			local25 = arg0.method2169(6);
			local30 = arg0.method2169(6);
			@Pc(40) boolean local40 = arg0.method2169(1) == 1;
			if (local40) {
				Static105.anIntArray179[Static30.anInt698++] = arg1;
			}
			if (Static275.aClass11_Sub2_Sub6_Sub1Array1[arg1] != null) {
				throw new RuntimeException("hr:lr");
			}
			@Pc(67) Class11_Sub2_Sub6_Sub1 local67 = Static275.aClass11_Sub2_Sub6_Sub1Array1[arg1] = new Class11_Sub2_Sub6_Sub1();
			local67.anInt6792 = arg1;
			if (Static242.aClass1_Sub7Array1[arg1] != null) {
				local67.method5859(Static242.aClass1_Sub7Array1[arg1]);
			}
			local67.method5883(Static201.anIntArray312[arg1]);
			local67.anInt6736 = Static168.anIntArray260[arg1];
			local95 = Static283.anIntArray422[arg1];
			local99 = local95 >> 28;
			local105 = local95 >> 14 & 0xFF;
			local67.aByteArray97[0] = aByteArray39[arg1];
			local116 = local95 & 0xFF;
			local67.aByte79 = (byte) local99;
			local67.method5860(local25 + (local105 << 6) - Static50.anInt1271, (local116 << 6) + (local30 - Static299.anInt4036));
			local67.anInt6691 = -1;
			return true;
		} else if (local8 == 1) {
			local25 = arg0.method2169(2);
			local30 = Static283.anIntArray422[arg1];
			Static283.anIntArray422[arg1] = (((local30 >> 28) + local25 & 0x3) << 28) + (local30 & 0xFFFFFFF);
			return false;
		} else {
			@Pc(192) int local192;
			@Pc(196) int local196;
			if (local8 != 2) {
				local25 = arg0.method2169(18);
				local30 = local25 >> 16;
				local192 = local25 >> 8 & 0xFF;
				local196 = local25 & 0xFF;
				local95 = Static283.anIntArray422[arg1];
				local99 = (local95 >> 28) + local30 & 0x3;
				local105 = (local95 >> 14) + local192 & 0xFF;
				local116 = local95 + local196 & 0xFF;
				Static283.anIntArray422[arg1] = local116 + (local99 << 28) + (local105 << 14);
				return false;
			}
			local25 = arg0.method2169(5);
			local30 = local25 >> 3;
			local192 = local25 & 0x7;
			local196 = Static283.anIntArray422[arg1];
			local95 = local30 + (local196 >> 28) & 0x3;
			local99 = local196 >> 14 & 0xFF;
			local105 = local196 & 0xFF;
			if (local192 == 0) {
				local105--;
				local99--;
			}
			if (local192 == 1) {
				local105--;
			}
			if (local192 == 2) {
				local99++;
				local105--;
			}
			if (local192 == 3) {
				local99--;
			}
			if (local192 == 4) {
				local99++;
			}
			if (local192 == 5) {
				local105++;
				local99--;
			}
			if (local192 == 6) {
				local105++;
			}
			if (local192 == 7) {
				local99++;
				local105++;
			}
			Static283.anIntArray422[arg1] = (local99 << 14) + (local95 << 28) + local105;
			return false;
		}
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(IB)V")
	public static void method1778(@OriginalArg(0) int arg0) {
		@Pc(8) Class1_Sub4_Sub17 local8 = Static132.method2717(arg0, 10);
		local8.method3481();
	}
}
