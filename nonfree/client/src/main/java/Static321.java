import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static321 {

	@OriginalMember(owner = "client!lha", name = "b", descriptor = "[Lclient!ta;")
	public static Class327[] aClass327Array3;

	@OriginalMember(owner = "client!lha", name = "a", descriptor = "(Lclient!ig;[Lclient!kb;)V")
	public static void method4297(@OriginalArg(0) Class13_Sub1 arg0, @OriginalArg(1) Class2_Sub24[] arg1) {
		@Pc(6) int local6;
		if (Static218.aBoolean734) {
			local6 = arg0.method8401(arg1);
			Static207.aClass95_6.method7004(local6, arg1);
		}
		if (Static313.aClass76Array1 == Static314.aClass76Array2) {
			@Pc(28) int local28;
			if (arg0 instanceof Class13_Sub1_Sub1) {
				local6 = ((Class13_Sub1_Sub1) arg0).aShort117;
				local28 = ((Class13_Sub1_Sub1) arg0).aShort119;
			} else {
				local6 = arg0.anInt10090 >> Static609.anInt9827;
				local28 = arg0.anInt10089 >> Static609.anInt9827;
			}
			Static207.aClass95_6.EA(Static462.aClass76Array3[0].method7398(arg0.anInt10090, arg0.anInt10089), Static624.method8354(local6, local28), Static106.method1594(local6, local28), Static186.method4310(local6, local28));
		}
		@Pc(64) Class13_Sub6 local64 = arg0.method8399(Static207.aClass95_6);
		if (local64 == null) {
			return;
		}
		if (arg0.aBoolean738) {
			@Pc(72) Class13_Sub2[] local72 = local64.aClass13_Sub2Array1;
			for (@Pc(74) int local74 = 0; local74 < local72.length; local74++) {
				@Pc(79) Class13_Sub2 local79 = local72[local74];
				if (local79.aBoolean48) {
					Static170.method7976(local79.anInt605 + local79.anInt606, local79.anInt607 + local79.anInt606, local79.anInt603 - local79.anInt606, local79.anInt604 - local79.anInt606);
				}
			}
		}
		if (local64.aBoolean298) {
			local64.aClass13_Sub1_2 = arg0;
			if (Static268.aBoolean293) {
				@Pc(119) Class94 local119 = Static219.aClass94_4;
				synchronized (Static219.aClass94_4) {
					Static219.aClass94_4.method1861(local64);
					return;
				}
			}
			Static219.aClass94_4.method1861(local64);
			return;
		}
		Static448.method6100(local64);
	}

	@OriginalMember(owner = "client!lha", name = "a", descriptor = "(IIIILclient!ha;BLclient!d;)V")
	public static void method4298(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class95 arg4, @OriginalArg(6) Interface6 arg5) {
		if (Static619.anInt9953 < 100) {
			Static39.method625(arg4, arg5);
		}
		arg4.KA(arg3, arg2, arg3 + arg0, arg1 + arg2);
		@Pc(36) int local36;
		@Pc(47) int local47;
		if (Static619.anInt9953 < 100) {
			local36 = arg3 + arg0 / 2;
			local47 = arg1 / 2 + arg2 - 18 - 20;
			arg4.aa(arg3, arg2, arg0, arg1, -16777216, 0);
			arg4.method6997(local36 - 152, local47, 304, 34, Static514.aColorArray3[Static295.anInt4833].getRGB(), 0);
			arg4.aa(local36 - 150, local47 + 2, Static619.anInt9953 * 3, 30, Static292.aColorArray1[Static295.anInt4833].getRGB(), 0);
			Static194.aClass62_22.method5691(local36, Static457.aColorArray2[Static295.anInt4833].getRGB(), Static434.aClass271_18.method5972(Static483.anInt7694), -1, local47 + 20);
			return;
		}
		@Pc(111) int local111 = Static40.anInt794 - (int) ((float) arg0 / Static193.aFloat15);
		local36 = Static347.anInt5452 + (int) ((float) arg1 / Static193.aFloat15);
		local47 = (int) ((float) arg0 / Static193.aFloat15) + Static40.anInt794;
		Static634.anInt10184 = Static347.anInt5452 - (int) ((float) arg1 / Static193.aFloat15);
		Static122.anInt2173 = (int) ((float) (arg1 * 2) / Static193.aFloat15);
		Static632.anInt10143 = Static40.anInt794 - (int) ((float) arg0 / Static193.aFloat15);
		@Pc(168) int local168 = Static347.anInt5452 - (int) ((float) arg1 / Static193.aFloat15);
		Static540.anInt8852 = (int) ((float) (arg0 * 2) / Static193.aFloat15);
		Static193.method1284(Static193.anInt1548 + local111, Static193.anInt1551 + local36, Static193.anInt1548 + local47, Static193.anInt1551 + local168, arg3, arg2, arg0 + arg3, arg2 + arg1 + 1);
		Static193.method1300(arg4);
		@Pc(204) Class109 local204 = Static193.method1282(arg4);
		Static392.method5363(local204, arg4);
		if (Static95.anInt1808 > 0) {
			Static20.anInt544--;
			if (Static20.anInt544 == 0) {
				Static95.anInt1808--;
				Static20.anInt544 = 20;
			}
		}
		if (!Static80.aBoolean117) {
			return;
		}
		@Pc(236) int local236 = arg3 + arg0 - 5;
		@Pc(242) int local242 = arg1 + arg2 - 8;
		Static505.aClass62_21.method5679(16776960, local236, -1, local242, "Fps:" + Static70.anInt1230);
		@Pc(257) int local257 = local242 - 15;
		@Pc(259) Runtime local259 = Runtime.getRuntime();
		@Pc(269) int local269 = (int) ((local259.totalMemory() - local259.freeMemory()) / 1024L);
		@Pc(271) int local271 = 16776960;
		if (local269 > 65536) {
			local271 = 16711680;
		}
		Static505.aClass62_21.method5679(local271, local236, -1, local257, "Mem:" + local269 + "k");
		local242 = local257 - 15;
	}
}
