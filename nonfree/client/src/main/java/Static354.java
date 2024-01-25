import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static354 {

	@OriginalMember(owner = "client!wn", name = "F", descriptor = "I")
	public static int anInt6757;

	@OriginalMember(owner = "client!wn", name = "x", descriptor = "J")
	public static long aLong215 = -1L;

	@OriginalMember(owner = "client!wn", name = "b", descriptor = "(BI)I")
	public static int method5634(@OriginalArg(1) int arg0) {
		@Pc(9) int local9 = (arg0 & 0x55555555) + (arg0 >>> 1 & 0xD5555555);
		@Pc(23) int local23 = (local9 & 0x33333333) + ((local9 & 0xCCCCCCCD) >>> 2);
		@Pc(36) int local36 = (local23 >>> 4) + local23 & 0xF0F0F0F;
		@Pc(42) int local42 = local36 + (local36 >>> 8);
		@Pc(48) int local48 = local42 + (local42 >>> 16);
		return local48 & 0xFF;
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(Lclient!uo;B)V")
	public static void method5637(@OriginalArg(0) Class32 arg0) {
		@Pc(7) int local7 = Static210.anInt4473;
		@Pc(17) int local17 = Static339.anInt6506;
		@Pc(19) int local19 = Static198.anInt1219;
		@Pc(23) int local23 = Static282.anInt6601 - 3;
		if (Static135.aClass5_14 == null || Static277.aClass5_26 == null) {
			if (Static193.aClass216_64.method5651(Static285.anInt4455) && Static193.aClass216_64.method5651(Static239.anInt4956)) {
				Static135.aClass5_14 = arg0.method2149(Static366.method2655(Static193.aClass216_64, Static285.anInt4455, 0));
				@Pc(52) Class99 local52 = Static366.method2655(Static193.aClass216_64, Static239.anInt4956, 0);
				Static277.aClass5_26 = arg0.method2149(local52);
				local52.method2660();
				Static224.aClass5_24 = arg0.method2149(local52);
			} else {
				arg0.method2241(local7, local17, local19, 20, Static239.anInt4959 | 255 - Static117.anInt2664 << 24, 1);
			}
		}
		@Pc(97) int local97;
		@Pc(95) int local95;
		if (Static135.aClass5_14 != null && Static277.aClass5_26 != null) {
			local95 = (local19 - Static277.aClass5_26.method3629() * 2) / Static135.aClass5_14.method3629();
			for (local97 = 0; local97 < local95; local97++) {
				Static135.aClass5_14.method3621(Static277.aClass5_26.method3629() + local7 + Static135.aClass5_14.method3629() * local97, local17);
			}
			Static277.aClass5_26.method3621(local7, local17);
			Static224.aClass5_24.method3621(local7 + local19 - Static224.aClass5_24.method3629(), local17);
		}
		Static49.aClass9_1.method5021(Static322.anInt6183 | 0xFF000000, local7 + 3, local17 + 14, -1, Static345.aClass34_190.method1285(Static259.anInt2907));
		arg0.method2241(local7, local17 + 20, local19, local23 - 20, Static239.anInt4959 | -Static117.anInt2664 + 255 << 24, 1);
		local95 = Static222.aClass84_1.method5408();
		local97 = Static222.aClass84_1.method5406();
		@Pc(192) int local192;
		for (@Pc(175) int local175 = 0; local175 < Static115.anInt2635; local175++) {
			local192 = local17 + (Static115.anInt2635 + -1 + -local175) * 16 + 20 + 13;
			if (local95 > local7 && local19 + local7 > local95 && local192 - 13 < local97 && local97 < local192 + 4) {
				arg0.method2241(local7, local192 - 12, local19, 16, Static91.anInt2288 | 255 - Static263.anInt5361 << 24, 1);
			}
		}
		if ((Static188.aClass5_20 == null || Static324.aClass5_28 == null || Class141.lb == null) && Static193.aClass216_64.method5651(Static64.anInt1798) && Static193.aClass216_64.method5651(Static336.anInt6434) && Static193.aClass216_64.method5651(Static17.anInt543)) {
			@Pc(273) Class99 local273 = Static366.method2655(Static193.aClass216_64, Static336.anInt6434, 0);
			Static324.aClass5_28 = arg0.method2149(local273);
			local273.method2660();
			Static18.aClass5_3 = arg0.method2149(local273);
			Static188.aClass5_20 = arg0.method2149(Static366.method2655(Static193.aClass216_64, Static64.anInt1798, 0));
			@Pc(298) Class99 local298 = Static366.method2655(Static193.aClass216_64, Static17.anInt543, 0);
			Class141.lb = arg0.method2149(local298);
			local298.method2660();
			Static285.aClass5_23 = arg0.method2149(local298);
		}
		@Pc(369) int local369;
		@Pc(371) int local371;
		if (Static188.aClass5_20 != null && Static324.aClass5_28 != null && Class141.lb != null) {
			local192 = (local19 - Class141.lb.method3629() * 2) / Static188.aClass5_20.method3629();
			for (@Pc(329) int local329 = 0; local329 < local192; local329++) {
				Static188.aClass5_20.method3621(Class141.lb.method3629() + local7 + Static188.aClass5_20.method3629() * local329, -Static188.aClass5_20.method3623() + local23 + local17);
			}
			local369 = (local23 - Class141.lb.method3623() - 20) / Static324.aClass5_28.method3623();
			for (local371 = 0; local371 < local369; local371++) {
				Static324.aClass5_28.method3621(local7, Static324.aClass5_28.method3623() * local371 + local17 + 20);
				Static18.aClass5_3.method3621(local19 + local7 - Static18.aClass5_3.method3629(), local17 - -20 - -(Static324.aClass5_28.method3623() * local371));
			}
			Class141.lb.method3621(local7, local17 + local23 - Class141.lb.method3623());
			Static285.aClass5_23.method3621(local7 + local19 - Class141.lb.method3629(), -Class141.lb.method3623() + local23 + local17);
		}
		local192 = 0;
		for (@Pc(447) Class1_Sub23 local447 = (Class1_Sub23) Static188.aClass16_22.method410(); local447 != null; local447 = (Class1_Sub23) Static188.aClass16_22.method419()) {
			local369 = (Static115.anInt2635 - local192 - 1) * 16 + local17 + 13 + 20;
			local371 = Static322.anInt6183 | 0xFF000000;
			if (local95 > local7 && local95 < local7 + local19 && local97 > local369 - 13 && local369 + 4 > local97) {
				local371 = Static266.anInt5405 | 0xFF000000;
			}
			@Pc(508) int[] local508 = null;
			if (Static63.method4864(local447.anInt3588)) {
				local508 = Static20.method561((int) local447.aLong121).anIntArray273;
			} else if (Static90.method1960(local447.anInt3588)) {
				@Pc(555) Class17_Sub1_Sub1_Sub2 local555 = Static140.aClass17_Sub1_Sub1_Sub2Array1[(int) local447.aLong121];
				if (local555 != null) {
					local508 = local555.aClass213_1.anIntArray520;
				}
			} else if (Static324.method5276(local447.anInt3588)) {
				if (local447.anInt3588 == 1011) {
					local508 = Static119.method2548((int) local447.aLong121).anIntArray390;
				} else {
					local508 = Static119.method2548((int) (local447.aLong121 >>> 32 & 0x7FFFFFFFL)).anIntArray390;
				}
			}
			@Pc(573) String local573 = Static247.method4448(local447);
			if (local508 != null) {
				local573 = local573 + Static229.method757(local508);
			}
			local192++;
			Static49.aClass9_1.method5002(local7 + 3, local369, local573, Static197.aClass5Array16, Static279.anIntArray476, local371);
		}
		Static255.method4604(Static210.anInt4473, Static339.anInt6506, Static198.anInt1219, Static282.anInt6601);
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(Lclient!wo;B)V")
	public static void method5640(@OriginalArg(0) Class216 arg0) {
		Static14.aClass216_2 = arg0;
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(ZI)V")
	public static void method5641(@OriginalArg(0) boolean arg0) {
		if (Static357.aBoolean413 != arg0) {
			Static357.aBoolean413 = arg0;
			Static322.method5247();
		}
	}

	@OriginalMember(owner = "client!wn", name = "b", descriptor = "(III)V")
	public static void method5643(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class194 local7 = Static77.aClass194ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		if (local7.aClass17_Sub4_1 != null) {
			local7.aClass17_Sub4_1 = null;
		}
		if (local7.aClass17_Sub4_2 != null) {
			local7.aClass17_Sub4_2 = null;
		}
	}
}
