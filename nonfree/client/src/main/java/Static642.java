import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static642 {

	@OriginalMember(owner = "client!ub", name = "p", descriptor = "I")
	public static int anInt9924;

	@OriginalMember(owner = "client!ub", name = "l", descriptor = "Lclient!tka;")
	public static Class358 aClass358_1;

	@OriginalMember(owner = "client!ub", name = "m", descriptor = "[I")
	public static int[] anIntArray715;

	@OriginalMember(owner = "client!ub", name = "q", descriptor = "I")
	public static int anInt9932;

	@OriginalMember(owner = "client!ub", name = "d", descriptor = "(I)V")
	public static void method8452() {
		Static164.aClass307_40.method7006();
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(ILclient!bc;)V")
	public static void method8453(@OriginalArg(1) Class3_Sub8 arg0) {
		Static708.aClass3_Sub33_Sub3_4.method7911(arg0, false);
		if (Static294.aClass107_2 != null) {
			Static294.aClass107_2.method5377(Static708.aClass3_Sub33_Sub3_4);
		}
		Static243.aClass3_Sub33_Sub3_1 = null;
		Static27.aClass3_Sub8_1 = null;
		Static224.aClass182_61 = null;
		Static599.anInt9088 = 0;
		Static46.aClass138_1 = null;
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(IBI)I")
	public static int method8454(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) int local9 = arg0 + arg1 * 57;
		@Pc(15) int local15 = local9 << 13 ^ local9;
		@Pc(29) int local29 = local15 * (local15 * local15 * 15731 + 789221) + 1376312589 & Integer.MAX_VALUE;
		return local29 >> 19 & 0xFF;
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(III)Lclient!oaa;")
	public static Class9_Sub1_Sub5 method8455(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class364 local7 = Static448.aClass364ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		} else {
			@Pc(15) Class9_Sub1_Sub5 local15 = local7.aClass9_Sub1_Sub5_1;
			local7.aClass9_Sub1_Sub5_1 = null;
			Static219.method3261(local15);
			return local15;
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(Lclient!rw;I)I")
	public static int method8456(@OriginalArg(0) Class9_Sub1_Sub1_Sub2_Sub2 arg0) {
		@Pc(8) Class219 local8 = arg0.aClass219_1;
		if (local8.anIntArray405 != null) {
			local8 = local8.method5035(Static380.aClass127_1);
			if (local8 == null) {
				return -1;
			}
		}
		@Pc(24) int local24 = local8.anInt5678;
		@Pc(34) Class226 local34 = arg0.method7489();
		@Pc(39) int local39 = arg0.aClass45_9.method6577();
		if (local39 == -1 || arg0.aBoolean593) {
			local24 = local8.anInt5711;
		} else if (local34.anInt5787 == local39 || local39 == local34.anInt5819 || local34.anInt5815 == local39 || local34.anInt5780 == local39) {
			local24 = local8.anInt5692;
		} else if (local39 == local34.anInt5793 || local39 == local34.anInt5812 || local34.anInt5802 == local39 || local34.anInt5800 == local39) {
			local24 = local8.anInt5718;
		}
		return local24;
	}

	@OriginalMember(owner = "client!ub", name = "c", descriptor = "(I)V")
	public static void method8457() {
		if (Static589.anInt8959 == -1) {
			return;
		}
		@Pc(12) int local12 = Static334.aClass18_1.method4192();
		@Pc(16) int local16 = Static334.aClass18_1.method4196();
		@Pc(21) Class3_Sub23 local21 = (Class3_Sub23) Static114.aClass342_21.method7644();
		if (local21 != null) {
			local12 = local21.method3197();
			local16 = local21.method3196();
		}
		@Pc(40) int local40 = 0;
		@Pc(42) int local42 = 0;
		if (Static347.aBoolean360) {
			local40 = Static308.method4570();
			local42 = Static541.method7180();
		}
		Static628.method8260(local42 + local16, Static589.anInt8959, local42 + Static76.anInt1720, local16, local40 + Static681.anInt10652, local12, local40, local42, local12 + local40, local42, local40);
		if (Static140.aClass270_6 != null) {
			Static223.method3285(local40 + local12, local16 - -local42);
		}
	}
}
