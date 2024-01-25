import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static306 {

	@OriginalMember(owner = "client!kv", name = "u", descriptor = "Lclient!la;")
	public static Class196 aClass196_60;

	@OriginalMember(owner = "client!kv", name = "r", descriptor = "Lclient!lc;")
	public static final Class200 aClass200_81 = new Class200(114, 4);

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(III)Z")
	public static boolean method4861(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x84080) != 0;
	}

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(I)V")
	public static void method4862() {
		for (@Pc(12) int local12 = 0; local12 < Static605.anInt9850; local12++) {
			@Pc(18) int local18 = Static131.anIntArray128[local12];
			@Pc(26) Class4_Sub1_Sub2_Sub1_Sub1 local26 = ((Class3_Sub28) Static551.aClass280_43.method7107((long) local18)).aClass4_Sub1_Sub2_Sub1_Sub1_2;
			@Pc(30) int local30 = Static30.aClass3_Sub3_Sub2_1.method4225();
			if ((local30 & 0x1) != 0) {
				local30 += Static30.aClass3_Sub3_Sub2_1.method4225() << 8;
			}
			if ((local30 & 0x10) != 0) {
				local26.aString62 = Static30.aClass3_Sub3_Sub2_1.method4233();
				local26.anInt5747 = 100;
			}
			if ((local30 & 0x1000) != 0) {
				local26.aByte88 = Static30.aClass3_Sub3_Sub2_1.method4250();
				local26.aByte90 = Static30.aClass3_Sub3_Sub2_1.method4245();
				local26.aByte89 = Static30.aClass3_Sub3_Sub2_1.method4254();
				local26.aByte91 = (byte) Static30.aClass3_Sub3_Sub2_1.method4259();
				local26.anInt5749 = Static101.anInt2262 + Static30.aClass3_Sub3_Sub2_1.method4236();
				local26.anInt5779 = Static101.anInt2262 + Static30.aClass3_Sub3_Sub2_1.method4231();
			}
			@Pc(116) int local116;
			@Pc(122) int local122;
			if ((local30 & 0x40) != 0) {
				local116 = Static30.aClass3_Sub3_Sub2_1.method4228();
				local122 = Static30.aClass3_Sub3_Sub2_1.method4259();
				local26.method5060(local116, local122, Static101.anInt2262);
				local26.anInt5757 = Static101.anInt2262 + 300;
				local26.anInt5722 = Static30.aClass3_Sub3_Sub2_1.method4243();
			}
			@Pc(159) int[] local159;
			@Pc(161) int local161;
			@Pc(167) int local167;
			@Pc(184) int local184;
			@Pc(156) int[] local156;
			if ((local30 & 0x2000) != 0) {
				local116 = Static30.aClass3_Sub3_Sub2_1.method4259();
				local156 = new int[local116];
				local159 = new int[local116];
				for (local161 = 0; local161 < local116; local161++) {
					local167 = Static30.aClass3_Sub3_Sub2_1.method4221();
					if ((local167 & 0xC000) == 49152) {
						local184 = Static30.aClass3_Sub3_Sub2_1.method4236();
						local156[local161] = local167 << 16 | local184;
					} else {
						local156[local161] = local167;
					}
					local159[local161] = Static30.aClass3_Sub3_Sub2_1.method4236();
				}
				local26.method5071(local159, local156);
			}
			if ((local30 & 0x2) != 0) {
				local26.anInt3767 = Static30.aClass3_Sub3_Sub2_1.method4222();
				local26.anInt3779 = Static30.aClass3_Sub3_Sub2_1.method4236();
			}
			@Pc(249) int local249;
			if ((local30 & 0x8) != 0) {
				local116 = Static30.aClass3_Sub3_Sub2_1.method4221();
				if (local116 == 65535) {
					local116 = -1;
				}
				local122 = Static30.aClass3_Sub3_Sub2_1.method4223();
				local249 = Static30.aClass3_Sub3_Sub2_1.method4259();
				local161 = local249 & 0x7;
				local167 = local249 >> 3 & 0xF;
				if (local167 == 15) {
					local167 = -1;
				}
				local26.method5062(local122, false, local161, local116, local167);
			}
			if ((local30 & 0x4) != 0) {
				if (local26.aClass109_1.method2811()) {
					Static325.method5300(local26);
				}
				local26.method3334(Static547.aClass177_2.method4471(Static30.aClass3_Sub3_Sub2_1.method4236()));
				local26.method5072(local26.aClass109_1.anInt3032);
				local26.anInt5739 = local26.aClass109_1.anInt3036 << 3;
				if (local26.aClass109_1.method2811()) {
					Static380.method6113(local26.anIntArray309[0], local26, local26.anIntArray310[0], null, null, local26.aByte123, 0);
				}
			}
			if ((local30 & 0x80) != 0) {
				@Pc(336) int[] local336 = new int[4];
				for (local122 = 0; local122 < 4; local122++) {
					local336[local122] = Static30.aClass3_Sub3_Sub2_1.method4222();
					if (local336[local122] == 65535) {
						local336[local122] = -1;
					}
				}
				local249 = Static30.aClass3_Sub3_Sub2_1.method4243();
				Static276.method4494(local249, local26, local336);
			}
			if ((local30 & 0x100) != 0) {
				local116 = Static30.aClass3_Sub3_Sub2_1.method4228();
				local122 = Static30.aClass3_Sub3_Sub2_1.method4225();
				local26.method5060(local116, local122, Static101.anInt2262);
			}
			if ((local30 & 0x800) != 0) {
				local116 = Static30.aClass3_Sub3_Sub2_1.method4221();
				if (local116 == 65535) {
					local116 = -1;
				}
				local122 = Static30.aClass3_Sub3_Sub2_1.method4224();
				local249 = Static30.aClass3_Sub3_Sub2_1.method4259();
				local161 = local249 & 0x7;
				local167 = local249 >> 3 & 0xF;
				if (local167 == 15) {
					local167 = -1;
				}
				local26.method5062(local122, true, local161, local116, local167);
			}
			if ((local30 & 0x20) != 0) {
				local26.anInt5744 = Static30.aClass3_Sub3_Sub2_1.method4231();
				if (local26.anInt5744 == 65535) {
					local26.anInt5744 = -1;
				}
			}
			if ((local30 & 0x200) != 0) {
				local116 = Static30.aClass3_Sub3_Sub2_1.method4236();
				local26.anInt5711 = Static30.aClass3_Sub3_Sub2_1.method4225();
				local26.anInt5740 = Static30.aClass3_Sub3_Sub2_1.method4259();
				local26.anInt5741 = local116 & 0x7FFF;
				local26.aBoolean403 = (local116 & 0x8000) != 0;
				local26.anInt5746 = local26.anInt5711 + Static101.anInt2262 + local26.anInt5741;
			}
			if ((local30 & 0x400) != 0) {
				local116 = Static30.aClass3_Sub3_Sub2_1.method4243();
				local156 = new int[local116];
				local159 = new int[local116];
				@Pc(516) int[] local516 = new int[local116];
				for (local167 = 0; local167 < local116; local167++) {
					local184 = Static30.aClass3_Sub3_Sub2_1.method4231();
					if (local184 == 65535) {
						local184 = -1;
					}
					local156[local167] = local184;
					local159[local167] = Static30.aClass3_Sub3_Sub2_1.method4243();
					local516[local167] = Static30.aClass3_Sub3_Sub2_1.method4221();
				}
				Static39.method1333(local516, local159, local156, local26);
			}
			if ((local30 & 0x4000) != 0) {
				local26.anInt5750 = Static30.aClass3_Sub3_Sub2_1.method4239();
				local26.anInt5729 = Static30.aClass3_Sub3_Sub2_1.method4250();
				local26.anInt5748 = Static30.aClass3_Sub3_Sub2_1.method4254();
				local26.anInt5786 = Static30.aClass3_Sub3_Sub2_1.method4245();
				local26.anInt5788 = Static30.aClass3_Sub3_Sub2_1.method4231() + Static101.anInt2262;
				local26.anInt5754 = Static30.aClass3_Sub3_Sub2_1.method4231() + Static101.anInt2262;
				local26.anInt5758 = Static30.aClass3_Sub3_Sub2_1.method4263();
				local26.anInt5750 += local26.anIntArray310[0];
				local26.anInt5786 += local26.anIntArray309[0];
				local26.anInt5793 = 0;
				local26.anInt5748 += local26.anIntArray310[0];
				local26.anInt5792 = 1;
				local26.anInt5729 += local26.anIntArray309[0];
			}
		}
	}
}
