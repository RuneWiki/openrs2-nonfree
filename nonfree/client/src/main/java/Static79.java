import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static79 {

	@OriginalMember(owner = "client!daa", name = "Z", descriptor = "I")
	public static int anInt1725;

	@OriginalMember(owner = "client!daa", name = "ab", descriptor = "Lclient!ah;")
	public static Class14 aClass14_1;

	@OriginalMember(owner = "client!daa", name = "I", descriptor = "Lclient!wp;")
	public static final Class363 aClass363_49 = new Class363(25, 7);

	@OriginalMember(owner = "client!daa", name = "Y", descriptor = "Lclient!baa;")
	public static final Class28 aClass28_4 = new Class28(8, 0, 4, 1);

	@OriginalMember(owner = "client!daa", name = "cb", descriptor = "I")
	public static int anInt1726 = 0;

	@OriginalMember(owner = "client!daa", name = "a", descriptor = "(Lclient!kp;Lclient!r;III)V")
	public static void method1251(@OriginalArg(0) Class196 arg0, @OriginalArg(1) Class100 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(10) Class20 local10 = arg0.method4250(arg1);
		if (local10 == null) {
			return;
		}
		arg1.da(arg2, arg3, arg0.anInt5130 + arg2, arg3 + arg0.anInt5078);
		if (Static422.anInt7227 == 2 || Static422.anInt7227 == 5 || Static513.aClass39_35 == null) {
			arg1.FA(-16777216, local10, arg2, arg3);
			return;
		}
		@Pc(61) int local61;
		@Pc(63) int local63;
		@Pc(57) int local57;
		@Pc(59) int local59;
		if (Static311.anInt5570 == 4) {
			local57 = (int) -Static447.aFloat233 & 0x3FFF;
			local59 = 4096;
			local61 = Static156.anInt8481;
			local63 = Static433.anInt7318;
		} else {
			local59 = 4096 - Static557.anInt9152 * 16;
			local57 = Static417.anInt7188 + (int) -Static447.aFloat233 & 0x3FFF;
			local61 = Static545.aClass6_Sub1_Sub1_Sub1_Sub2_2.anInt8761;
			local63 = Static545.aClass6_Sub1_Sub1_Sub1_Sub2_2.anInt8764;
		}
		@Pc(99) int local99 = local61 / 128 + 48 - (Static188.anInt3850 - 104) * 2;
		@Pc(117) int local117 = Static49.anInt1174 * 4 + 208 + 48 - Static49.anInt1174 * 2 - local63 / 128;
		Static513.aClass39_35.method7852((float) arg0.anInt5130 / 2.0F + (float) arg2, (float) arg3 + (float) arg0.anInt5078 / 2.0F, (float) local99, (float) local117, local59, local57 << 2, local10, arg2, arg3);
		@Pc(167) int local167;
		@Pc(176) int local176;
		@Pc(187) int local187;
		@Pc(198) int local198;
		for (@Pc(151) Class2_Sub22 local151 = (Class2_Sub22) Static388.aClass8_40.method210(); local151 != null; local151 = (Class2_Sub22) Static388.aClass8_40.method218()) {
			@Pc(156) int local156 = local151.anInt3866;
			local167 = (Static382.aClass288_3.anIntArray530[local156] >> 14 & 0x3FFF) - Static35.anInt906;
			local176 = (Static382.aClass288_3.anIntArray530[local156] & 0x3FFF) - Static130.anInt5246;
			local187 = local167 * 4 + 2 - local61 / 128;
			local198 = local176 * 4 + 2 - local63 / 128;
			Static290.method4367(arg3, local10, local198, arg0, local187, Static382.aClass288_3.anIntArray528[local156], arg2, arg1);
		}
		for (local167 = 0; local167 < Static391.anInt6845; local167++) {
			local176 = Static514.anIntArray31[local167] * 4 + 2 - local61 / 128;
			local187 = Static560.anIntArray666[local167] * 4 + 2 - local63 / 128;
			@Pc(254) Class32 local254 = Static541.aClass97_4.method1794(Static537.anIntArray636[local167]);
			if (local254.anIntArray50 != null) {
				local254 = local254.method552(Static70.aClass78_1);
				if (local254 == null || local254.anInt798 == -1) {
					continue;
				}
			}
			Static290.method4367(arg3, local10, local187, arg0, local176, local254.anInt798, arg2, arg1);
		}
		@Pc(338) int local338;
		@Pc(349) int local349;
		for (@Pc(294) Class2_Sub40 local294 = (Class2_Sub40) Static261.aClass162_35.method3527(); local294 != null; local294 = (Class2_Sub40) Static261.aClass162_35.method3523()) {
			local187 = (int) (local294.aLong268 >> 28 & 0x3L);
			if (local187 == Static90.anInt1949) {
				local198 = (int) (local294.aLong268 & 0x3FFFL) - Static35.anInt906;
				@Pc(327) int local327 = (int) (local294.aLong268 >> 14 & 0x3FFFL) - Static130.anInt5246;
				local338 = local198 * 4 + 2 - local61 / 128;
				local349 = local327 * 4 + 2 - local63 / 128;
				Static267.method4087(arg3, local349, local338, arg0, Static308.aClass39Array10[0], arg2, local10);
			}
		}
		@Pc(438) int local438;
		for (local187 = 0; local187 < Static416.anInt7186; local187++) {
			@Pc(380) Class2_Sub32 local380 = (Class2_Sub32) Static544.aClass162_40.method3519((long) Static169.anIntArray198[local187]);
			if (local380 != null) {
				@Pc(385) Class6_Sub1_Sub1_Sub1_Sub1 local385 = local380.aClass6_Sub1_Sub1_Sub1_Sub1_1;
				if (local385.method155() && local385.aByte112 == Static545.aClass6_Sub1_Sub1_Sub1_Sub2_2.aByte112) {
					@Pc(401) Class86 local401 = local385.aClass86_1;
					if (local401 != null && local401.anIntArray136 != null) {
						local401 = local401.method1567(Static70.aClass78_1);
					}
					if (local401 != null && local401.aBoolean197 && local401.aBoolean192) {
						local349 = local385.anInt8761 / 128 - local61 / 128;
						local438 = local385.anInt8764 / 128 - local63 / 128;
						if (local401.anInt2142 == -1) {
							Static267.method4087(arg3, local438, local349, arg0, Static308.aClass39Array10[1], arg2, local10);
						} else {
							Static290.method4367(arg3, local10, local438, arg0, local349, local401.anInt2142, arg2, arg1);
						}
					}
				}
			}
		}
		local198 = Static376.anInt6647;
		@Pc(478) int[] local478 = Static557.anIntArray665;
		@Pc(526) int local526;
		@Pc(530) int local530;
		@Pc(562) int local562;
		for (local338 = 0; local338 < local198; local338++) {
			@Pc(488) Class6_Sub1_Sub1_Sub1_Sub2 local488 = Static136.aClass6_Sub1_Sub1_Sub1_Sub2Array1[local478[local338]];
			if (local488 != null && local488.method6175() && local488 != Static545.aClass6_Sub1_Sub1_Sub1_Sub2_2 && Static545.aClass6_Sub1_Sub1_Sub1_Sub2_2.aByte112 == local488.aByte112) {
				local438 = local488.anInt8761 / 128 - local61 / 128;
				local526 = local488.anInt8764 / 128 - local63 / 128;
				@Pc(528) boolean local528 = false;
				for (local530 = 0; local530 < Static451.anInt487; local530++) {
					if (local488.aString67.equals(Static306.aStringArray92[local530]) && Static103.anIntArray134[local530] != 0) {
						local528 = true;
						break;
					}
				}
				@Pc(560) boolean local560 = false;
				for (local562 = 0; local562 < Static584.anInt9522; local562++) {
					if (local488.aString67.equals(Static350.aClass150Array1[local562].aString29)) {
						local560 = true;
						break;
					}
				}
				@Pc(582) boolean local582 = false;
				if (Static545.aClass6_Sub1_Sub1_Sub1_Sub2_2.anInt7458 != 0 && local488.anInt7458 != 0 && local488.anInt7458 == Static545.aClass6_Sub1_Sub1_Sub1_Sub2_2.anInt7458) {
					local582 = true;
				}
				if (local488.aBoolean575) {
					Static267.method4087(arg3, local526, local438, arg0, Static308.aClass39Array10[6], arg2, local10);
				} else if (local528) {
					Static267.method4087(arg3, local526, local438, arg0, Static308.aClass39Array10[3], arg2, local10);
				} else if (local560) {
					Static267.method4087(arg3, local526, local438, arg0, Static308.aClass39Array10[5], arg2, local10);
				} else if (local582) {
					Static267.method4087(arg3, local526, local438, arg0, Static308.aClass39Array10[4], arg2, local10);
				} else {
					Static267.method4087(arg3, local526, local438, arg0, Static308.aClass39Array10[2], arg2, local10);
				}
			}
		}
		@Pc(677) Class246[] local677 = Static134.aClass246Array1;
		@Pc(757) int local757;
		for (local438 = 0; local438 < local677.length; local438++) {
			@Pc(685) Class246 local685 = local677[local438];
			if (local685 != null && local685.anInt6838 != 0 && Static412.anInt575 % 20 < 10) {
				@Pc(722) int local722;
				if (local685.anInt6838 == 1) {
					@Pc(707) Class2_Sub32 local707 = (Class2_Sub32) Static544.aClass162_40.method3519((long) local685.anInt6841);
					if (local707 != null) {
						@Pc(712) Class6_Sub1_Sub1_Sub1_Sub1 local712 = local707.aClass6_Sub1_Sub1_Sub1_Sub1_1;
						local722 = local712.anInt8761 / 128 - local61 / 128;
						local562 = local712.anInt8764 / 128 - local63 / 128;
						Static417.method6033(local722, arg0, local685.anInt6839, arg2, local10, local562, 360000L, arg3);
					}
				}
				if (local685.anInt6838 == 2) {
					local757 = local685.anInt6849 / 128 - local61 / 128;
					local530 = local685.anInt6844 / 128 - local63 / 128;
					@Pc(773) long local773 = (long) (local685.anInt6842 << 7);
					@Pc(777) long local777 = local773 * local773;
					Static417.method6033(local757, arg0, local685.anInt6839, arg2, local10, local530, local777, arg3);
				}
				if (local685.anInt6838 == 10 && local685.anInt6841 >= 0 && Static136.aClass6_Sub1_Sub1_Sub1_Sub2Array1.length > local685.anInt6841) {
					@Pc(805) Class6_Sub1_Sub1_Sub1_Sub2 local805 = Static136.aClass6_Sub1_Sub1_Sub1_Sub2Array1[local685.anInt6841];
					if (local805 != null) {
						local530 = local805.anInt8761 / 128 - local61 / 128;
						local722 = local805.anInt8764 / 128 - local63 / 128;
						Static417.method6033(local530, arg0, local685.anInt6839, arg2, local10, local722, 360000L, arg3);
					}
				}
			}
		}
		if (Static311.anInt5570 == 4) {
			return;
		}
		if (Static29.anInt761 != 0) {
			local526 = Static29.anInt761 * 4 + Static545.aClass6_Sub1_Sub1_Sub1_Sub2_2.method6165() * 2 + 2 - local61 / 128 - 2;
			local757 = Static526.anInt8657 * 4 + Static545.aClass6_Sub1_Sub1_Sub1_Sub2_2.method6165() * 2 - local63 / 128;
			Static267.method4087(arg3, local757, local526, arg0, Static432.aClass39Array17[Static413.aBoolean554 ? 1 : 0], arg2, local10);
		}
		arg1.method6261(-1, arg2 + arg0.anInt5130 / 2 - 1, arg3 - -(arg0.anInt5078 / 2) + -1, 3, 3);
	}
}
