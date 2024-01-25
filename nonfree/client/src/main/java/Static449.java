import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static449 {

	@OriginalMember(owner = "client!tb", name = "g", descriptor = "(I)V")
	public static void method6864() {
		Static178.anInt3302 = 0;
		@Pc(12) int local12 = (Static266.aClass1_Sub1_Sub2_Sub1_1.anInt7660 >> 7) + Static238.anInt4280;
		@Pc(20) int local20 = (Static266.aClass1_Sub1_Sub2_Sub1_1.anInt7659 >> 7) + Static371.anInt6936;
		if (local12 >= 3053 && local12 <= 3156 && local20 >= 3056 && local20 <= 3136) {
			Static178.anInt3302 = 1;
		}
		if (local12 >= 3072 && local12 <= 3118 && local20 >= 9492 && local20 <= 9535) {
			Static178.anInt3302 = 1;
		}
		if (Static178.anInt3302 == 1 && local12 >= 3139 && local12 <= 3199 && local20 >= 3008 && local20 <= 3062) {
			Static178.anInt3302 = 0;
		}
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lclient!qa;Lclient!ob;ILclient!maa;)V")
	public static void method6865(@OriginalArg(0) Class39 arg0, @OriginalArg(1) Class2_Sub35 arg1, @OriginalArg(3) Class182 arg2) {
		@Pc(10) Class35 local10 = arg2.method4603(arg0);
		if (local10 == null) {
			return;
		}
		@Pc(16) int local16 = local10.c();
		if (local16 < local10.la()) {
			local16 = local10.la();
		}
		@Pc(32) int local32 = arg1.anInt6265;
		@Pc(35) int local35 = arg1.anInt6262;
		@Pc(37) int local37 = 0;
		@Pc(39) int local39 = 0;
		@Pc(41) int local41 = 0;
		@Pc(60) int local60;
		@Pc(83) int local83;
		if (arg2.aString118 != null) {
			local37 = Static182.aClass52_7.method1581(Static33.aStringArray4, null, null, arg2.aString118);
			for (local60 = 0; local60 < local37; local60++) {
				@Pc(66) String local66 = Static33.aStringArray4[local60];
				if (local37 - 1 > local60) {
					local66 = local66.substring(0, local66.length() - 4);
				}
				local83 = Static115.aClass25_2.method766(local66);
				if (local83 > local39) {
					local39 = local83;
				}
			}
			local41 = local37 * Static115.aClass25_2.method762() + Static115.aClass25_2.method768() / 2;
		}
		local60 = arg1.anInt6265 + local16 / 2;
		@Pc(113) int local113 = arg1.anInt6262;
		if (local32 < Static201.anInt200 + local16) {
			local32 = Static201.anInt200;
			local60 = Static201.anInt200 + local16 / 2 + local39 / 2 + 10 + 5;
		} else if (Static201.anInt209 - local16 < local32) {
			local60 = Static201.anInt209 - local39 / 2 - local16 / 2 - 15;
			local32 = Static201.anInt209 - local16;
		}
		if (Static201.anInt203 + local16 > local35) {
			local35 = Static201.anInt203;
			local113 = local16 / 2 + Static201.anInt203 + 10;
		} else if (Static201.anInt208 - local16 < local35) {
			local113 = Static201.anInt208 - local16 / 2 - local41 - 10;
			local35 = Static201.anInt208 - local16;
		}
		local83 = (int) (Math.atan2((double) (local32 - arg1.anInt6265), (double) (local35 - arg1.anInt6262)) / 3.141592653589793D * 32767.0D) & 0xFFFF;
		local10.method7348((float) local16 / 2.0F + (float) local32, (float) local35 + (float) local16 / 2.0F, 4096, local83);
		@Pc(262) int local262 = -2;
		@Pc(264) int local264 = -2;
		@Pc(266) int local266 = -2;
		@Pc(268) int local268 = -2;
		if (arg2.aString118 != null) {
			local264 = local113;
			local262 = local60 - local39 / 2 - 5;
			local266 = local39 + local262 + 10;
			local268 = local113 + local37 * Static115.aClass25_2.method762() + 3;
			if (arg2.anInt5337 != 0) {
				arg0.method6052(local113, arg2.anInt5337, local262, local268 - local113, -local262 + local266);
			}
			if (arg2.anInt5329 != 0) {
				arg0.method6061(local266 - local262, arg2.anInt5329, local268 - local113, local113, local262);
			}
			for (@Pc(339) int local339 = 0; local339 < local37; local339++) {
				@Pc(345) String local345 = Static33.aStringArray4[local339];
				if (local37 - 1 > local339) {
					local345 = local345.substring(0, local345.length() - 4);
				}
				Static115.aClass25_2.method767(arg0, local345, local60, local113, arg2.anInt5351);
				local113 += Static115.aClass25_2.method762();
			}
		}
		if (arg2.anInt5350 == -1 && arg2.aString118 == null) {
			return;
		}
		local16 >>= 0x1;
		@Pc(397) Class2_Sub48 local397 = new Class2_Sub48(arg1);
		local397.anInt9249 = local264;
		local397.anInt9245 = local32 - local16;
		local397.anInt9246 = local16 + local32;
		local397.anInt9241 = local16 + local35;
		local397.anInt9251 = local35 - local16;
		local397.anInt9243 = local266;
		local397.anInt9248 = local262;
		local397.anInt9247 = local268;
		Static411.aClass249_59.method6523(local397);
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(IIII)V")
	public static void method6866(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		Static267.aByteArrayArrayArray19 = new byte[4][arg1][arg0];
	}

	@OriginalMember(owner = "client!tb", name = "h", descriptor = "(I)V")
	public static void method6867() {
		if (Static269.aClass39_7 != null) {
			Static269.aClass39_7.method6021();
			Static228.aClass47_2 = null;
			Static269.aClass39_7 = null;
		}
	}
}
