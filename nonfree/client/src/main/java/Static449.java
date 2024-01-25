import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static449 {

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(ILclient!r;)V")
	public static void method6369(@OriginalArg(1) Class12 arg0) {
		@Pc(7) int local7 = Static215.anInt4176;
		@Pc(9) int local9 = Static2.anInt57;
		@Pc(11) int local11 = Static86.anInt1957;
		@Pc(15) int local15 = Static100.anInt2087 - 3;
		if (Static428.aClass10_17 == null || Static425.aClass10_35 == null) {
			if (Static141.aClass111_32.method2434(Static84.anInt1945) && Static141.aClass111_32.method2434(Static30.anInt871)) {
				Static428.aClass10_17 = arg0.method6434(Static604.method7062(Static141.aClass111_32, Static84.anInt1945, 0), true);
				@Pc(63) Class318 local63 = Static604.method7062(Static141.aClass111_32, Static30.anInt871, 0);
				Static425.aClass10_35 = arg0.method6434(local63, true);
				local63.method7071();
				Static356.aClass10_33 = arg0.method6434(local63, true);
			} else {
				arg0.J(local7, local9, local11, 20, 255 - Static276.anInt5094 << 24 | Static417.anInt7085, 1);
			}
		}
		@Pc(92) int local92;
		@Pc(90) int local90;
		if (Static428.aClass10_17 != null && Static425.aClass10_35 != null) {
			local90 = (local11 - Static425.aClass10_35.E() * 2) / Static428.aClass10_17.E();
			for (local92 = 0; local92 < local90; local92++) {
				Static428.aClass10_17.method7679(local7 + Static425.aClass10_35.E() + Static428.aClass10_17.E() * local92, local9);
			}
			Static425.aClass10_35.method7679(local7, local9);
			Static356.aClass10_33.method7679(local11 + local7 - Static356.aClass10_33.E(), local9);
		}
		Static260.aClass35_7.method4935(local7 + 3, Static61.anInt1524 | 0xFF000000, local9 + 14, Static103.aClass77_26.method1864(Static562.anInt9127), -1);
		arg0.J(local7, local9 + 20, local11, local15 - 20, Static417.anInt7085 | 255 - Static276.anInt5094 << 24, 1);
		local90 = Static287.aClass256_8.method7558();
		local92 = Static287.aClass256_8.method7561();
		@Pc(183) int local183 = 0;
		@Pc(204) int local204;
		for (@Pc(188) Class1_Sub23 local188 = (Class1_Sub23) Static3.aClass361_1.method7854(); local188 != null; local188 = (Class1_Sub23) Static3.aClass361_1.method7853()) {
			local204 = (Static135.anInt2684 - local183 - 1) * 16 + local9 + 33;
			local183++;
			if (local7 < local90 && local90 < local11 + local7 && local204 - 13 < local92 && local204 + 4 > local92 && local188.aBoolean389) {
				arg0.J(local7, local204 - 12, local11, 16, Static432.anInt7313 | 255 - Static84.anInt1947 << 24, 1);
			}
		}
		if ((Static371.aClass10_28 == null || Static402.aClass10_31 == null || Static244.aClass10_16 == null) && Static141.aClass111_32.method2434(Static189.anInt3884) && Static141.aClass111_32.method2434(Static21.anInt619) && Static141.aClass111_32.method2434(Static507.anInt8451)) {
			@Pc(280) Class318 local280 = Static604.method7062(Static141.aClass111_32, Static21.anInt619, 0);
			Static402.aClass10_31 = arg0.method6434(local280, true);
			local280.method7071();
			Static382.aClass10_29 = arg0.method6434(local280, true);
			Static371.aClass10_28 = arg0.method6434(Static604.method7062(Static141.aClass111_32, Static189.anInt3884, 0), true);
			@Pc(305) Class318 local305 = Static604.method7062(Static141.aClass111_32, Static507.anInt8451, 0);
			Static244.aClass10_16 = arg0.method6434(local305, true);
			local305.method7071();
			Static404.aClass10_32 = arg0.method6434(local305, true);
		}
		local183 = 0;
		@Pc(378) int local378;
		@Pc(338) int local338;
		if (Static371.aClass10_28 != null && Static402.aClass10_31 != null && Static244.aClass10_16 != null) {
			local204 = (local11 - Static244.aClass10_16.E() * 2) / Static371.aClass10_28.E();
			for (local338 = 0; local338 < local204; local338++) {
				Static371.aClass10_28.method7679(Static244.aClass10_16.E() + local7 + Static371.aClass10_28.E() * local338, local9 - (-local15 - -Static371.aClass10_28.u()));
			}
			local378 = (local15 - Static244.aClass10_16.u() - 20) / Static402.aClass10_31.u();
			for (@Pc(380) int local380 = 0; local380 < local378; local380++) {
				Static402.aClass10_31.method7679(local7, local9 + local380 * Static402.aClass10_31.u() + 20);
				Static382.aClass10_29.method7679(local11 + local7 - Static382.aClass10_29.E(), Static402.aClass10_31.u() * local380 + 20 + local9);
			}
			Static244.aClass10_16.method7679(local7, local9 + local15 - Static244.aClass10_16.u());
			Static404.aClass10_32.method7679(local11 + local7 - Static244.aClass10_16.E(), local15 + (local9 - Static244.aClass10_16.u()));
		}
		for (@Pc(445) Class1_Sub23 local445 = (Class1_Sub23) Static3.aClass361_1.method7854(); local445 != null; local445 = (Class1_Sub23) Static3.aClass361_1.method7853()) {
			local338 = (Static135.anInt2684 - local183 - 1) * 16 + local9 + 20 + 13;
			local378 = Static61.anInt1524 | 0xFF000000;
			if (local90 > local7 && local11 + local7 > local90 && local92 > local338 - 13 && local338 + 4 > local92 && local445.aBoolean389) {
				local378 = Static249.anInt4652 | 0xFF000000;
			}
			@Pc(496) int[] local496 = null;
			if (Static228.method3763(local445.anInt5147)) {
				local496 = Static46.aClass234_1.method5390((int) local445.aLong215).anIntArray592;
			} else if (local445.anInt5143 != -1) {
				local496 = Static46.aClass234_1.method5390(local445.anInt5143).anIntArray592;
			} else if (Static83.method1702(local445.anInt5147)) {
				@Pc(532) Class1_Sub39 local532 = (Class1_Sub39) Static131.aClass356_32.method7796((long) local445.aLong215);
				if (local532 != null) {
					@Pc(537) Class20_Sub2_Sub4_Sub1_Sub2 local537 = local532.aClass20_Sub2_Sub4_Sub1_Sub2_2;
					@Pc(540) Class162 local540 = local537.aClass162_1;
					if (local540.anIntArray267 != null) {
						local540 = local540.method3802(Static121.aClass148_1);
					}
					if (local540 != null) {
						local496 = local540.anIntArray266;
					}
				}
			} else if (Static376.method5467(local445.anInt5147)) {
				@Pc(578) Class306 local578;
				if (local445.anInt5147 == 1011) {
					local578 = Static146.aClass214_1.method4897((int) local445.aLong215);
				} else {
					local578 = Static146.aClass214_1.method4897((int) (local445.aLong215 >>> 32 & 0x7FFFFFFFL));
				}
				if (local578.anIntArray570 != null) {
					local578 = local578.method6966(Static121.aClass148_1);
				}
				if (local578 != null) {
					local496 = local578.anIntArray573;
				}
			}
			@Pc(613) String local613 = Static209.method3524(local445);
			if (local496 != null) {
				local613 = local613 + Static311.method4774(local496);
			}
			Static260.aClass35_7.method4936(local338, local7 + 3, Static415.anIntArray486, Static206.aClass10Array13, local378, local613);
			if (local445.aBoolean390) {
				Static276.aClass10_18.method7679(Static566.aClass13_15.method463(local613) + local7 + 5, local338 + -12);
			}
			local183++;
		}
		Static330.method4975(Static2.anInt57, Static86.anInt1957, Static215.anInt4176, Static100.anInt2087);
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(ZC)Z")
	public static boolean method6370(@OriginalArg(1) char arg0) {
		if (arg0 >= ' ' && arg0 <= '~') {
			return true;
		} else if (arg0 >= ' ' && arg0 <= 'ÿ') {
			return true;
		} else {
			return arg0 == '€' || arg0 == 'Œ' || arg0 == '—' || arg0 == 'œ' || arg0 == 'Ÿ';
		}
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(IFBFLclient!hc;IIFFFI)[B")
	public static byte[] method6371(@OriginalArg(1) float arg0, @OriginalArg(3) float arg1, @OriginalArg(4) Class130 arg2, @OriginalArg(7) float arg3, @OriginalArg(8) float arg4, @OriginalArg(9) float arg5) {
		@Pc(10) byte[] local10 = new byte[262144];
		Static478.method6715(arg0, arg3, arg5, arg1, local10, arg2, 0, arg4);
		return local10;
	}
}
