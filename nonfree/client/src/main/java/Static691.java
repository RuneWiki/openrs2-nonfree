import java.awt.Frame;
import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static691 {

	@OriginalMember(owner = "client!vo", name = "l", descriptor = "Ljava/awt/Frame;")
	public static Frame aFrame2;

	@OriginalMember(owner = "client!vo", name = "k", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger5 = new BigInteger("10001", 16);

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(IIZ)Z")
	public static boolean method9067(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x34) != 0;
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(ZI)V")
	public static void method9068(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			if (Static633.anInt3426 != -1) {
				Static47.method637(Static633.anInt3426);
			}
			for (@Pc(22) Class3_Sub52 local22 = (Class3_Sub52) Static170.aClass136_19.method3509(); local22 != null; local22 = (Class3_Sub52) Static170.aClass136_19.method3506()) {
				if (!local22.method9443()) {
					local22 = (Class3_Sub52) Static170.aClass136_19.method3509();
					if (local22 == null) {
						break;
					}
				}
				Static65.method813(true, false, local22);
			}
			Static633.anInt3426 = -1;
			Static170.aClass136_19 = new Class136(8);
			Static300.method4615();
			Static633.anInt3426 = Static224.aClass84_1.anInt2475;
			Static401.method6009(false);
			Static693.method9085();
			Static185.method2812(Static633.anInt3426);
		}
		Static284.aBoolean447 = true;
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(IILclient!ha;IBI)V")
	public static void method9072(@OriginalArg(2) Class67 arg0, @OriginalArg(3) int arg1, @OriginalArg(5) int arg2) {
		Static622.aClass67_15 = arg0;
		Static640.aClass181_14 = Static622.aClass67_15.method7646();
		Static30.aClass181_1 = Static622.aClass67_15.method7646();
		Static437.aClass181_8 = Static622.aClass67_15.method7646();
		Static76.anInterface20Array1 = null;
		Static351.anInt5981 = 100;
		Static293.anInt5243 = 0;
		Static61.anInt946 = 100;
		Static277.anIntArray289 = null;
		Static271.method4143(arg2, arg1);
		Static175.anInt10578 = -1;
		Static553.anInt9241 = -1;
		Static587.anInt9597 = -1;
	}

	@OriginalMember(owner = "client!vo", name = "b", descriptor = "(B)V")
	public static void method9073() {
		@Pc(15) Class3_Sub28_Sub2 local15 = Static532.aClass400_3.aClass3_Sub28_Sub2_2;
		while (local15.method5338(Static532.aClass400_3.anInt11061) >= 15) {
			@Pc(27) int local27 = local15.method5344(15);
			if (local27 == 32767) {
				break;
			}
			@Pc(34) boolean local34 = false;
			@Pc(41) Class3_Sub13 local41 = (Class3_Sub13) Static612.aClass136_44.method3503((long) local27);
			@Pc(47) Class19_Sub1_Sub3_Sub2_Sub1 local47;
			if (local41 == null) {
				local47 = new Class19_Sub1_Sub3_Sub2_Sub1();
				local47.anInt7796 = local27;
				local41 = new Class3_Sub13(local47);
				Static612.aClass136_44.method3508((long) local27, local41);
				Static95.aClass3_Sub13Array1[Static32.anInt518++] = local41;
				local34 = true;
			}
			local47 = local41.aClass19_Sub1_Sub3_Sub2_Sub1_2;
			Static101.anIntArray95[Static337.anInt5854++] = local27;
			local47.anInt7815 = Static517.anInt8809;
			if (local47.aClass18_1 != null && local47.aClass18_1.method411()) {
				Static46.method629(local47);
			}
			local47.method3434(Static631.aClass85_2.method2214(local15.method5344(15)));
			@Pc(115) int local115 = local15.method5344(5);
			if (local115 > 15) {
				local115 -= 32;
			}
			@Pc(126) int local126 = local15.method5344(2);
			@Pc(131) int local131 = local15.method5344(1);
			@Pc(136) int local136 = local15.method5344(1);
			if (local136 == 1) {
				Static6.anIntArray3[Static48.anInt822++] = local27;
			}
			@Pc(160) int local160 = (local15.method5344(3) + 4 & 0xE00007) << 11;
			@Pc(165) int local165 = local15.method5344(5);
			local47.method6599(local47.aClass18_1.anInt437);
			if (local165 > 15) {
				local165 -= 32;
			}
			local47.anInt7818 = local47.aClass18_1.anInt464 << 3;
			if (local34) {
				local47.method6597(local160, true);
			}
			local47.method3441(Static251.aClass19_Sub1_Sub3_Sub2_Sub2_2.anIntArray430[0] + local115, local126, local165 + Static251.aClass19_Sub1_Sub3_Sub2_Sub2_2.lb[0], local47.method6592(), local131 == 1);
			if (local47.aClass18_1.method411()) {
				Static119.method2062((Class19_Sub1_Sub3_Sub2_Sub2) null, local47.anIntArray430[0], (Class144) null, local47.lb[0], local47, 0, local47.aByte146);
			}
		}
		local15.method5346();
	}
}
