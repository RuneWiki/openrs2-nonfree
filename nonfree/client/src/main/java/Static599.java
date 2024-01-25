import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static599 {

	@OriginalMember(owner = "client!sw", name = "l", descriptor = "I")
	public static int anInt9311 = 0;

	@OriginalMember(owner = "client!sw", name = "j", descriptor = "I")
	public static int anInt9313 = 0;

	@OriginalMember(owner = "client!sw", name = "a", descriptor = "(IZIILclient!d;Lclient!ha;I)V")
	public static void method8210(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Interface3 arg3, @OriginalArg(5) Class145 arg4, @OriginalArg(6) int arg5) {
		if (Static424.anInt6882 < 100) {
			Static89.method1325(arg3, arg4);
		}
		arg4.KA(arg1, arg2, arg5 + arg1, arg2 - -arg0);
		@Pc(38) int local38;
		@Pc(57) int local57;
		if (Static424.anInt6882 < 100) {
			local38 = arg5 / 2 + arg1;
			arg4.aa(arg1, arg2, arg5, arg0, -16777216, 0);
			local57 = arg2 + arg0 / 2 - 18 - 20;
			arg4.method9713(local38 - 152, local57, 304, 34, Static450.aColorArray3[Static667.anInt10369].getRGB(), 0);
			arg4.aa(local38 - 150, local57 + 2, Static424.anInt6882 * 3, 30, Static333.aColorArray2[Static667.anInt10369].getRGB(), 0);
			Static387.aClass68_12.method7888(Static289.aClass191_18.method4067(Static414.anInt9485), local38, -1, local57 + 20, Static49.aColorArray1[Static667.anInt10369].getRGB());
			return;
		}
		@Pc(112) int local112 = Static681.anInt10509 - (int) ((float) arg5 / Static90.aFloat43);
		local38 = (int) ((float) arg0 / Static90.aFloat43) + Static704.anInt10775;
		local57 = (int) ((float) arg5 / Static90.aFloat43) + Static681.anInt10509;
		Static359.anInt5743 = Static704.anInt10775 - (int) ((float) arg0 / Static90.aFloat43);
		Static220.anInt3515 = Static681.anInt10509 - (int) ((float) arg5 / Static90.aFloat43);
		@Pc(153) int local153 = Static704.anInt10775 - (int) ((float) arg0 / Static90.aFloat43);
		Static687.anInt10575 = (int) ((float) (arg0 * 2) / Static90.aFloat43);
		Static247.anInt3838 = (int) ((float) (arg5 * 2) / Static90.aFloat43);
		Static90.method2921(local112 + Static90.anInt3353, local38 + Static90.anInt3348, Static90.anInt3353 + local57, Static90.anInt3348 + local153, arg1, arg2, arg1 + arg5, arg0 + 1 + arg2);
		Static90.method2925(arg4);
		@Pc(203) Class60 local203 = Static90.method2912(arg4);
		Static170.method2538(arg4, local203);
		if (Static181.anInt3030 > 0) {
			Static482.anInt7725--;
			if (Static482.anInt7725 == 0) {
				Static181.anInt3030--;
				Static482.anInt7725 = 20;
			}
		}
		if (!Static66.aBoolean131) {
			return;
		}
		@Pc(238) int local238 = arg5 + arg1 - 5;
		@Pc(244) int local244 = arg0 + arg2 - 8;
		Static61.aClass68_1.method7884(local238, "Fps:" + Static162.anInt2752, 16776960, local244, -1);
		@Pc(261) int local261 = local244 - 15;
		@Pc(263) Runtime local263 = Runtime.getRuntime();
		@Pc(273) int local273 = (int) ((local263.totalMemory() - local263.freeMemory()) / 1024L);
		@Pc(275) int local275 = 16776960;
		if (local273 > 65536) {
			local275 = 16711680;
		}
		Static61.aClass68_1.method7884(local238, "Mem:" + local273 + "k", local275, local261, -1);
		local244 = local261 - 15;
	}

	@OriginalMember(owner = "client!sw", name = "a", descriptor = "(Lclient!tw;IB)Z")
	public static boolean method8211(@OriginalArg(0) Class2_Sub20_Sub2 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = arg0.method8608(2);
		@Pc(40) int local40;
		@Pc(45) int local45;
		@Pc(120) int local120;
		@Pc(124) int local124;
		@Pc(130) int local130;
		if (local8 == 0) {
			if (arg0.method8608(1) != 0) {
				method8211(arg0, arg1);
			}
			local40 = arg0.method8608(6);
			local45 = arg0.method8608(6);
			@Pc(56) boolean local56 = arg0.method8608(1) == 1;
			if (local56) {
				Static668.anIntArray730[Static559.anInt8813++] = arg1;
			}
			if (Static157.aClass4_Sub2_Sub1_Sub2_Sub1Array1[arg1] != null) {
				throw new RuntimeException("hr:lr");
			}
			@Pc(84) Class361 local84 = Static701.aClass361Array2[arg1];
			@Pc(92) Class4_Sub2_Sub1_Sub2_Sub1 local92 = Static157.aClass4_Sub2_Sub1_Sub2_Sub1Array1[arg1] = new Class4_Sub2_Sub1_Sub2_Sub1();
			local92.anInt2320 = arg1;
			if (Static388.aClass2_Sub20Array1[arg1] != null) {
				local92.method730(Static388.aClass2_Sub20Array1[arg1]);
			}
			local92.method2054(true, local84.anInt9762);
			local92.anInt2348 = local84.anInt9763;
			local120 = local84.anInt9765;
			local124 = local120 >> 28;
			local130 = local120 >> 14 & 0xFF;
			@Pc(134) int local134 = local120 & 0xFF;
			@Pc(143) int local143 = local40 + (local130 << 6) - Static243.anInt3820;
			local92.aBoolean99 = local84.aBoolean834;
			@Pc(155) int local155 = local45 + (local134 << 6) - Static224.anInt11062;
			local92.aBoolean102 = local84.aBoolean835;
			local92.aByteArray27[0] = Static192.aByteArray37[arg1];
			local92.aByte133 = local92.aByte134 = (byte) local124;
			if (Static83.method1237(local143, local155)) {
				local92.aByte134++;
			}
			local92.method736(local155, local143);
			local92.aBoolean101 = false;
			Static701.aClass361Array2[arg1] = null;
			return true;
		} else if (local8 == 1) {
			local40 = arg0.method8608(2);
			local45 = Static701.aClass361Array2[arg1].anInt9765;
			Static701.aClass361Array2[arg1].anInt9765 = (local45 & 0xFFFFFFF) + (((local45 >> 28) + local40 & 0x3) << 28);
			return false;
		} else {
			@Pc(250) int local250;
			@Pc(255) int local255;
			@Pc(264) int local264;
			if (local8 != 2) {
				local40 = arg0.method8608(18);
				local45 = local40 >> 16;
				local250 = local40 >> 8 & 0xFF;
				local255 = local40 & 0xFF;
				local264 = Static701.aClass361Array2[arg1].anInt9765;
				local120 = (local264 >> 28) + local45 & 0x3;
				local124 = (local264 >> 14) + local250 & 0xFF;
				local130 = local255 + local264 & 0xFF;
				Static701.aClass361Array2[arg1].anInt9765 = local130 + (local124 << 14) + (local120 << 28);
				return false;
			}
			local40 = arg0.method8608(5);
			local45 = local40 >> 3;
			local250 = local40 & 0x7;
			local255 = Static701.aClass361Array2[arg1].anInt9765;
			local264 = (local255 >> 28) + local45 & 0x3;
			local120 = local255 >> 14 & 0xFF;
			local124 = local255 & 0xFF;
			if (local250 == 0) {
				local124--;
				local120--;
			}
			if (local250 == 1) {
				local124--;
			}
			if (local250 == 2) {
				local120++;
				local124--;
			}
			if (local250 == 3) {
				local120--;
			}
			if (local250 == 4) {
				local120++;
			}
			if (local250 == 5) {
				local120--;
				local124++;
			}
			if (local250 == 6) {
				local124++;
			}
			if (local250 == 7) {
				local124++;
				local120++;
			}
			Static701.aClass361Array2[arg1].anInt9765 = local124 + (local264 << 28) + (local120 << 14);
			return false;
		}
	}
}
