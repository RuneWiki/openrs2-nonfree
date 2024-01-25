import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static242 {

	@OriginalMember(owner = "client!hja", name = "d", descriptor = "I")
	public static int anInt8798;

	@OriginalMember(owner = "client!hja", name = "a", descriptor = "(III)V")
	public static void method7777(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(13) int local13 = Static277.aClass289_8.method6935(Static289.aClass191_24.method4067(Static414.anInt9485));
		@Pc(65) int local65;
		@Pc(28) int local28;
		if (Static721.aBoolean939) {
			for (@Pc(73) Class2_Sub6_Sub7 local73 = (Class2_Sub6_Sub7) Static416.aClass388_6.method9213(); local73 != null; local73 = (Class2_Sub6_Sub7) Static416.aClass388_6.method9212()) {
				if (local73.anInt4448 == 1) {
					local28 = Static281.method3945((Class2_Sub6_Sub20) local73.aClass388_4.aClass2_Sub6_66.aClass2_Sub6_64);
				} else {
					local28 = Static155.method2223(local73);
				}
				if (local13 < local28) {
					local13 = local28;
				}
			}
			Static442.anInt7174 = (Static437.aBoolean603 ? 26 : 22) + Static7.anInt82 * 16;
			local13 += 8;
			local65 = Static7.anInt82 * 16 + 21;
		} else {
			for (@Pc(20) Class2_Sub6_Sub20 local20 = (Class2_Sub6_Sub20) Static273.aClass60_88.method1226(7); local20 != null; local20 = (Class2_Sub6_Sub20) Static273.aClass60_88.method1228()) {
				local28 = Static281.method3945(local20);
				if (local28 > local13) {
					local13 = local28;
				}
			}
			Static442.anInt7174 = Static535.anInt8486 * 16 + (Static437.aBoolean603 ? 26 : 22);
			local65 = Static535.anInt8486 * 16 + 21;
			local13 += 8;
		}
		@Pc(136) int local136 = arg1 - local13 / 2;
		if (Static151.anInt7983 < local136 + local13) {
			local136 = Static151.anInt7983 - local13;
		}
		if (local136 < 0) {
			local136 = 0;
		}
		local28 = arg0;
		if (local65 + arg0 > Static295.anInt4558) {
			local28 = Static295.anInt4558 - local65;
		}
		if (local28 < 0) {
			local28 = 0;
		}
		Static216.anInt3440 = local136;
		Static699.anInt10734 = local13;
		Static189.aBoolean301 = true;
		Static215.anInt3422 = local28;
	}

	@OriginalMember(owner = "client!hja", name = "a", descriptor = "([BZZ)V")
	public static void method7778(@OriginalArg(0) byte[] arg0, @OriginalArg(2) boolean arg1) {
		if (Static11.aClass2_Sub20_1 == null) {
			Static11.aClass2_Sub20_1 = new Class2_Sub20(20000);
		}
		Static11.aClass2_Sub20_1.method8565(arg0, 0, arg0.length);
		if (!arg1) {
			return;
		}
		Static308.method4291(Static11.aClass2_Sub20_1.aByteArray111);
		Static313.aClass88_Sub1Array2 = new Class88_Sub1[Static446.anInt7232];
		@Pc(33) int local33 = 0;
		for (@Pc(35) int local35 = Static532.anInt8451; local35 <= Static578.anInt9142; local35++) {
			@Pc(43) Class88_Sub1 local43 = Static621.method8394(local35);
			if (local43 != null) {
				Static313.aClass88_Sub1Array2[local33++] = local43;
			}
		}
		Static10.aBoolean25 = false;
		Static483.aLong242 = Static567.method7863();
		Static11.aClass2_Sub20_1 = null;
	}

	@OriginalMember(owner = "client!hja", name = "a", descriptor = "(IIIIII)V")
	public static void method7780(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(10) int local10 = arg1 - arg0;
		@Pc(15) int local15 = arg4 - arg2;
		if (local15 == 0) {
			if (local10 != 0) {
				Static544.method7598(arg2, arg1, arg3, arg0);
			}
		} else if (local10 == 0) {
			Static96.method1494(arg2, arg3, arg4, arg0);
		} else {
			if (local10 < 0) {
				local10 = -local10;
			}
			if (local15 < 0) {
				local15 = -local15;
			}
			@Pc(68) boolean local68 = local10 > local15;
			@Pc(72) int local72;
			@Pc(76) int local76;
			if (local68) {
				local72 = arg2;
				arg2 = arg0;
				local76 = arg4;
				arg0 = local72;
				arg4 = arg1;
				arg1 = local76;
			}
			if (arg4 < arg2) {
				local72 = arg2;
				arg2 = arg4;
				local76 = arg0;
				arg0 = arg1;
				arg4 = local72;
				arg1 = local76;
			}
			local72 = arg0;
			local76 = arg4 - arg2;
			@Pc(116) int local116 = arg1 - arg0;
			@Pc(121) int local121 = -(local76 >> 1);
			@Pc(129) int local129 = arg1 <= arg0 ? -1 : 1;
			if (local116 < 0) {
				local116 = -local116;
			}
			@Pc(141) int local141;
			if (local68) {
				for (local141 = arg2; local141 <= arg4; local141++) {
					Static449.anIntArrayArray48[local141][local72] = arg3;
					local121 += local116;
					if (local121 > 0) {
						local72 += local129;
						local121 -= local76;
					}
				}
			} else {
				for (local141 = arg2; local141 <= arg4; local141++) {
					local121 += local116;
					Static449.anIntArrayArray48[local72][local141] = arg3;
					if (local121 > 0) {
						local121 -= local76;
						local72 += local129;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!hja", name = "a", descriptor = "(I)V")
	public static void method7781() {
		Static497.aClass173Array1 = null;
	}
}
