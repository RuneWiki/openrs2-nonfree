import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static494 {

	@OriginalMember(owner = "client!qj", name = "k", descriptor = "D")
	public static double aDouble18;

	@OriginalMember(owner = "client!qj", name = "i", descriptor = "I")
	public static int anInt4031 = 0;

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "I")
	public static int anInt4033 = -1;

	@OriginalMember(owner = "client!qj", name = "e", descriptor = "Lclient!sb;")
	public static final Class322 aClass322_61 = new Class322(38, -2);

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(ILclient!d;ILclient!ha;III)V")
	public static void method3706(@OriginalArg(0) int arg0, @OriginalArg(1) Interface11 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class75 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (Static98.anInt1457 < 100) {
			Static366.method5550(arg1, arg3);
		}
		arg3.KA(arg4, arg0, arg2 + arg4, arg5 + arg0);
		@Pc(35) int local35;
		@Pc(54) int local54;
		if (Static98.anInt1457 < 100) {
			local35 = arg4 + arg2 / 2;
			arg3.aa(arg4, arg0, arg2, arg5, -16777216, 0);
			local54 = arg0 + arg5 / 2 - 18 - 20;
			arg3.method6701(local35 - 152, local54, 304, 34, Static36.aColorArray1[Static24.anInt316].getRGB(), 0);
			arg3.aa(local35 - 150, local54 - -2, Static98.anInt1457 * 3, 30, Static193.aColorArray7[Static24.anInt316].getRGB(), 0);
			Static205.aClass67_6.method8291(local54 + 20, local35, Static357.aColorArray4[Static24.anInt316].getRGB(), -1, Static50.aClass43_18.method596(Static601.anInt9518));
			return;
		}
		@Pc(117) int local117 = Static91.anInt1364 - (int) ((float) arg2 / Static627.aFloat139);
		local35 = Static488.anInt8263 + (int) ((float) arg5 / Static627.aFloat139);
		local54 = Static91.anInt1364 + (int) ((float) arg2 / Static627.aFloat139);
		Static223.anInt4376 = Static488.anInt8263 - (int) ((float) arg5 / Static627.aFloat139);
		Static56.anInt690 = (int) ((float) (arg2 * 2) / Static627.aFloat139);
		Static543.anInt8805 = (int) ((float) (arg5 * 2) / Static627.aFloat139);
		Static442.anInt7704 = Static91.anInt1364 - (int) ((float) arg2 / Static627.aFloat139);
		@Pc(176) int local176 = Static488.anInt8263 - (int) ((float) arg5 / Static627.aFloat139);
		Static627.method6484(local117 + Static627.anInt7264, Static627.anInt7268 + local35, local54 + Static627.anInt7264, Static627.anInt7268 + local176, arg4, arg0, arg2 + arg4, arg5 + 1 + arg0);
		Static627.method6472(arg3);
		@Pc(205) Class340 local205 = Static627.method6467(arg3);
		Static607.method8341(local205, arg3);
		if (Static626.anInt9859 > 0) {
			Static344.anInt5861--;
			if (Static344.anInt5861 == 0) {
				Static344.anInt5861 = 20;
				Static626.anInt9859--;
			}
		}
		if (!Static46.aBoolean42) {
			return;
		}
		@Pc(240) int local240 = arg2 + arg4 - 5;
		@Pc(246) int local246 = arg5 + arg0 - 8;
		Static180.aClass67_5.method8285("Fps:" + Static467.anInt8014, local240, 16776960, local246, -1);
		@Pc(263) int local263 = local246 - 15;
		@Pc(265) Runtime local265 = Runtime.getRuntime();
		@Pc(274) int local274 = (int) ((local265.totalMemory() - local265.freeMemory()) / 1024L);
		@Pc(276) int local276 = 16776960;
		if (local274 > 65536) {
			local276 = 16711680;
		}
		Static180.aClass67_5.method8285("Mem:" + local274 + "k", local240, local276, local263, -1);
		local246 = local263 - 15;
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(IIIIB)V")
	public static void method3707(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static290.anInt10204 != 1) {
			return;
		}
		@Pc(14) int local14 = arg1 / Static662.anInt10244;
		@Pc(18) int local18 = arg3 / Static662.anInt10244;
		@Pc(22) int local22 = arg0 / Static682.anInt10442;
		@Pc(26) int local26 = arg2 / Static682.anInt10442;
		if (local14 >= Static585.anInt9330 || local18 < 0 || Static37.anInt497 <= local22 || local26 < 0) {
			return;
		}
		if (Static585.anInt9330 <= local18) {
			local18 = Static585.anInt9330 - 1;
		}
		if (local14 < 0) {
			local14 = 0;
		}
		if (local22 < 0) {
			local22 = 0;
		}
		if (local26 >= Static37.anInt497) {
			local26 = Static37.anInt497 - 1;
		}
		for (@Pc(86) int local86 = local22; local86 <= local26; local86++) {
			@Pc(98) int local98 = Static667.method8846(Static37.anInt497, local86 + Static188.anInt3787) * Static585.anInt9330;
			for (@Pc(100) int local100 = local14; local100 <= local18; local100++) {
				@Pc(111) int local111 = Static667.method8846(Static585.anInt9330, Static6.anInt60 + local100) + local98;
				Static273.anIntArray276[local111] = Static20.anInt271;
			}
		}
	}
}
