import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static316 {

	@OriginalMember(owner = "client!ud", name = "z", descriptor = "I")
	public static int anInt6393;

	@OriginalMember(owner = "client!ud", name = "i", descriptor = "[S")
	public static short[] aShortArray100 = new short[256];

	@OriginalMember(owner = "client!ud", name = "m", descriptor = "Lclient!ek;")
	public static final Class54 aClass54_10 = new Class54();

	@OriginalMember(owner = "client!ud", name = "o", descriptor = "I")
	public static int anInt6385 = 3;

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(III)V")
	public static void method5555(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) Class199 local15 = new Class199(16);
		for (@Pc(20) Class2_Sub1 local20 = (Class2_Sub1) Static136.aClass199_12.method5747(); local20 != null; local20 = (Class2_Sub1) Static136.aClass199_12.method5753()) {
			local20.method5945();
			@Pc(31) int local31 = (int) (local20.aLong213 >> 28);
			@Pc(41) int local41 = (int) (local20.aLong213 >> 14 & 0x3FFFL) - arg1;
			@Pc(50) int local50 = (int) (local20.aLong213 & 0x3FFFL) - arg0;
			if (local50 >= 0 && local41 >= 0 && Static95.anInt6381 > local50 && local41 < Static237.anInt4532) {
				local15.method5749(local20, (long) (local50 | local31 << 28 | local41 << 14));
			}
		}
		Static136.aClass199_12 = local15;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(Lclient!ae;I)V")
	public static void method5556(@OriginalArg(0) Class4 arg0) {
		@Pc(12) int local12 = Static194.anInt3816;
		@Pc(14) int local14 = Static11.anInt293;
		@Pc(16) int local16 = Static120.anInt2599;
		@Pc(20) int local20 = Static60.anInt1316 - 3;
		if (Static39.aClass31_23 == null || Static237.aClass31_98 == null) {
			if (Static59.aClass191_35.method5440(Static236.anInt4520) && Static59.aClass191_35.method5440(Static88.anInt1906)) {
				Static39.aClass31_23 = arg0.method4214(Static361.method2368(Static59.aClass191_35, Static236.anInt4520, 0));
				@Pc(49) Class76 local49 = Static361.method2368(Static59.aClass191_35, Static88.anInt1906, 0);
				Static237.aClass31_98 = arg0.method4214(local49);
				local49.method2356();
				Static255.aClass31_108 = arg0.method4214(local49);
			} else {
				arg0.method4246(local12, local14, local16, 20, 255 - Static134.anInt2799 << 24 | Static188.anInt4006, 1);
			}
		}
		@Pc(94) int local94;
		@Pc(92) int local92;
		if (Static39.aClass31_23 != null && Static237.aClass31_98 != null) {
			local92 = (local16 - Static237.aClass31_98.method4392() * 2) / Static39.aClass31_23.method4392();
			for (local94 = 0; local94 < local92; local94++) {
				Static39.aClass31_23.method4377(local12 + Static237.aClass31_98.method4392() + local94 * Static39.aClass31_23.method4392(), local14);
			}
			Static237.aClass31_98.method4377(local12, local14);
			Static255.aClass31_108.method4377(local12 + local16 - Static255.aClass31_108.method4392(), local14);
		}
		Static56.aClass37_1.method5254(-1, local12 + 3, Static295.anInt5974 | 0xFF000000, Static10.aClass93_4.method2819(Static21.anInt455), local14 + 14);
		arg0.method4246(local12, local14 + 20, local16, local20 - 20, Static188.anInt4006 | -Static134.anInt2799 + 255 << 24, 1);
		local92 = Static284.aClass61_1.method2658();
		local94 = Static284.aClass61_1.method2659();
		@Pc(193) int local193;
		for (@Pc(175) int local175 = 0; local175 < Static117.anInt2590; local175++) {
			local193 = local14 + (-1 + Static117.anInt2590 + -local175) * 16 + 20 + 13;
			if (local92 > local12 && local16 + local12 > local92 && local193 - 13 < local94 && local193 + 4 > local94) {
				arg0.method4246(local12, local193 - 12, local16, 16, 255 - Static228.anInt936 << 24 | Static271.anInt5507, 1);
			}
		}
		if ((Static117.aClass31_61 == null || Static193.aClass31_84 == null || Static82.aClass31_65 == null) && Static59.aClass191_35.method5440(Static253.anInt6903) && Static59.aClass191_35.method5440(Static259.anInt5249) && Static59.aClass191_35.method5440(Static198.anInt3879)) {
			@Pc(270) Class76 local270 = Static361.method2368(Static59.aClass191_35, Static259.anInt5249, 0);
			Static193.aClass31_84 = arg0.method4214(local270);
			local270.method2356();
			Static52.aClass31_29 = arg0.method4214(local270);
			Static117.aClass31_61 = arg0.method4214(Static361.method2368(Static59.aClass191_35, Static253.anInt6903, 0));
			@Pc(295) Class76 local295 = Static361.method2368(Static59.aClass191_35, Static198.anInt3879, 0);
			Static82.aClass31_65 = arg0.method4214(local295);
			local295.method2356();
			Static21.aClass31_13 = arg0.method4214(local295);
		}
		@Pc(362) int local362;
		@Pc(364) int local364;
		if (Static117.aClass31_61 != null && Static193.aClass31_84 != null && Static82.aClass31_65 != null) {
			local193 = (local16 - Static82.aClass31_65.method4392() * 2) / Static117.aClass31_61.method4392();
			for (@Pc(325) int local325 = 0; local325 < local193; local325++) {
				Static117.aClass31_61.method4377(local12 + Static82.aClass31_65.method4392() + Static117.aClass31_61.method4392() * local325, local20 + local14 - Static117.aClass31_61.method4393());
			}
			local362 = (local20 - Static82.aClass31_65.method4393() - 20) / Static193.aClass31_84.method4393();
			for (local364 = 0; local364 < local362; local364++) {
				Static193.aClass31_84.method4377(local12, local364 * Static193.aClass31_84.method4393() + local14 + 20);
				Static52.aClass31_29.method4377(local16 + local12 - Static52.aClass31_29.method4392(), local14 + 20 + Static193.aClass31_84.method4393() * local364);
			}
			Static82.aClass31_65.method4377(local12, local20 + local14 - Static82.aClass31_65.method4393());
			Static21.aClass31_13.method4377(local16 + local12 - Static82.aClass31_65.method4392(), -Static82.aClass31_65.method4393() + local14 + local20);
		}
		local193 = 0;
		for (@Pc(435) Class2_Sub13 local435 = (Class2_Sub13) Static91.aClass216_22.method5992(); local435 != null; local435 = (Class2_Sub13) Static91.aClass216_22.method6000()) {
			local362 = local14 + (Static117.anInt2590 - 1 - local193) * 16 + 20 + 13;
			local364 = Static295.anInt5974 | 0xFF000000;
			if (local92 > local12 && local92 < local16 + local12 && local94 > local362 - 13 && local94 < local362 + 4) {
				local364 = Static308.anInt5058 | 0xFF000000;
			}
			@Pc(492) int[] local492 = null;
			if (Static56.method1308(local435.anInt1317)) {
				local492 = Static282.method5080((int) local435.aLong38).anIntArray506;
			} else if (Static69.method1569(local435.anInt1317)) {
				@Pc(508) Class62_Sub1_Sub2_Sub1 local508 = Static37.aClass62_Sub1_Sub2_Sub1Array1[(int) local435.aLong38];
				if (local508 != null) {
					local492 = local508.aClass186_1.anIntArray431;
				}
			} else if (Static104.method4926(local435.anInt1317)) {
				if (local435.anInt1317 == 1009) {
					local492 = Static234.method4051((int) local435.aLong38).anIntArray258;
				} else {
					local492 = Static234.method4051((int) (local435.aLong38 >>> 32 & 0x7FFFFFFFL)).anIntArray258;
				}
			}
			@Pc(557) String local557 = Static269.method4875(local435);
			if (local492 != null) {
				local557 = local557 + Static184.method3328(local492);
			}
			Static56.aClass37_1.method5258(Static32.anIntArray40, local362, local12 + 3, local557, local364, Static36.aClass31Array1);
			local193++;
		}
		Static304.method5348(Static120.anInt2599, Static60.anInt1316, Static194.anInt3816, Static11.anInt293);
	}
}
