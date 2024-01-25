import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static537 {

	@OriginalMember(owner = "client!uo", name = "H", descriptor = "F")
	public static float aFloat158;

	@OriginalMember(owner = "client!uo", name = "B", descriptor = "Lclient!cq;")
	public static final Class56 aClass56_168 = new Class56(107, 3);

	@OriginalMember(owner = "client!uo", name = "J", descriptor = "I")
	public static int anInt8622 = 0;

	@OriginalMember(owner = "client!uo", name = "K", descriptor = "[I")
	public static final int[] anIntArray567 = new int[14];

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(Lclient!ce;BI)Z")
	public static boolean method7174(@OriginalArg(0) Class3_Sub11_Sub1 arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = arg0.method1383(2);
		@Pc(25) int local25;
		@Pc(30) int local30;
		@Pc(99) int local99;
		@Pc(103) int local103;
		@Pc(109) int local109;
		@Pc(113) int local113;
		if (local8 == 0) {
			if (arg0.method1383(1) != 0) {
				method7174(arg0, arg1);
			}
			local25 = arg0.method1383(6);
			local30 = arg0.method1383(6);
			@Pc(42) boolean local42 = arg0.method1383(1) == 1;
			if (local42) {
				Static29.anIntArray560[Static485.anInt7939++] = arg1;
			}
			if (Static220.aClass41_Sub2_Sub1_Sub4_Sub2Array1[arg1] != null) {
				throw new RuntimeException("hr:lr");
			}
			@Pc(65) Class252 local65 = Static352.aClass252Array1[arg1];
			@Pc(73) Class41_Sub2_Sub1_Sub4_Sub2 local73 = Static220.aClass41_Sub2_Sub1_Sub4_Sub2Array1[arg1] = new Class41_Sub2_Sub1_Sub4_Sub2();
			local73.anInt9472 = arg1;
			if (Static164.aClass3_Sub11Array1[arg1] != null) {
				local73.method7873(Static164.aClass3_Sub11Array1[arg1]);
			}
			local73.method7855(local65.anInt6970, true);
			local73.anInt9483 = local65.anInt6965;
			local99 = local65.anInt6967;
			local103 = local99 >> 28;
			local109 = local99 >> 14 & 0xFF;
			local113 = local99 & 0xFF;
			@Pc(122) int local122 = local25 + (local109 << 6) - Static335.anInt5608;
			@Pc(130) int local130 = local30 + (local113 << 6) - Static246.anInt4344;
			local73.aBoolean743 = local65.aBoolean522;
			local73.aByteArray102[0] = Static477.aByteArray89[arg1];
			local73.aByte117 = local73.aByte118 = (byte) local103;
			if (Static511.method6886(local130, local122)) {
				local73.aByte118++;
			}
			local73.method7871(local122, local130);
			local73.aBoolean747 = false;
			Static352.aClass252Array1[arg1] = null;
			return true;
		} else if (local8 == 1) {
			local25 = arg0.method1383(2);
			local30 = Static352.aClass252Array1[arg1].anInt6967;
			Static352.aClass252Array1[arg1].anInt6967 = (local30 & 0xFFFFFFF) + ((local25 + (local30 >> 28) & 0x3) << 28);
			return false;
		} else {
			@Pc(227) int local227;
			@Pc(235) int local235;
			if (local8 != 2) {
				local25 = arg0.method1383(18);
				local30 = local25 >> 16;
				local227 = local25 >> 8 & 0xFF;
				local235 = local25 & 0xFF;
				local99 = Static352.aClass252Array1[arg1].anInt6967;
				local103 = local30 + (local99 >> 28) & 0x3;
				local109 = (local99 >> 14) + local227 & 0xFF;
				local113 = local99 + local235 & 0xFF;
				Static352.aClass252Array1[arg1].anInt6967 = (local103 << 28) - (-(local109 << 14) - local113);
				return false;
			}
			local25 = arg0.method1383(5);
			local30 = local25 >> 3;
			@Pc(222) int local222 = local25 & 0x7;
			local227 = Static352.aClass252Array1[arg1].anInt6967;
			local235 = local30 + (local227 >> 28) & 0x3;
			local99 = local227 >> 14 & 0xFF;
			local103 = local227 & 0xFF;
			if (local222 == 0) {
				local99--;
				local103--;
			}
			if (local222 == 1) {
				local103--;
			}
			if (local222 == 2) {
				local99++;
				local103--;
			}
			if (local222 == 3) {
				local99--;
			}
			if (local222 == 4) {
				local99++;
			}
			if (local222 == 5) {
				local103++;
				local99--;
			}
			if (local222 == 6) {
				local103++;
			}
			if (local222 == 7) {
				local103++;
				local99++;
			}
			Static352.aClass252Array1[arg1].anInt6967 = (local99 << 14) + ((local235 << 28) + local103);
			return false;
		}
	}

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(IIIIIIIII)V")
	public static void method7175(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(8) int arg6) {
		Static182.aClass308Array3[Static118.anInt2726++] = new Class308(4, arg0, arg3, arg5, arg5, arg3, arg2, arg6, arg6, arg2, arg4, arg4, arg1, arg1);
	}

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(Lclient!sq;B)I")
	public static int method7176(@OriginalArg(0) Class314 arg0) {
		if (Static485.aClass314_20 == arg0) {
			return 6407;
		} else if (arg0 == Static469.aClass314_11) {
			return 6408;
		} else if (Static213.aClass314_19 == arg0) {
			return 6406;
		} else if (arg0 == Static394.aClass314_17) {
			return 6409;
		} else if (Static386.aClass314_16 == arg0) {
			return 6410;
		} else if (Static366.aClass314_15 == arg0) {
			return 6145;
		} else {
			throw new IllegalStateException();
		}
	}
}
