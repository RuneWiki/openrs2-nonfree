import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static396 {

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "[I")
	public static int[] anIntArray467;

	@OriginalMember(owner = "client!pc", name = "c", descriptor = "Lclient!cq;")
	public static Class56 aClass56_4;

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(I)V")
	public static void method5611() {
		Static531.aClass33_1 = new Class33(8);
		Static152.anInt2859 = 0;
		for (@Pc(17) Class20_Sub5 local17 = (Class20_Sub5) Static290.aClass349_7.method7653(); local17 != null; local17 = (Class20_Sub5) Static290.aClass349_7.method7660()) {
			local17.method3667();
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(BI)Lclient!efa;")
	public static Class86 method5612(@OriginalArg(1) int arg0) {
		@Pc(15) Class86 local15 = (Class86) Static577.aClass326_57.method7238((long) arg0);
		if (local15 != null) {
			return local15;
		}
		@Pc(25) byte[] local25 = Static50.aClass111_8.method2441(arg0, 0);
		local15 = new Class86();
		if (local25 != null) {
			local15.method2024(new Class1_Sub20(local25));
		}
		local15.method2025();
		Static577.aClass326_57.method7236(local15, (long) arg0);
		return local15;
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(Lclient!r;B)V")
	public static void method5613(@OriginalArg(0) Class12 arg0) {
		@Pc(7) int local7 = Static215.anInt4176;
		@Pc(13) int local13 = Static2.anInt57;
		@Pc(15) int local15 = Static86.anInt1957;
		@Pc(17) int local17 = Static100.anInt2087;
		arg0.method6418(local17, local7, local13, local15, -10660793);
		arg0.method6418(16, local7 + 1, local13 + 1, local15 - 2, -16777216);
		arg0.method6456(local13 + 18, local7 + 1, local17 - 19, local15 + -2, -16777216);
		Static260.aClass35_7.method4935(local7 + 3, -10660793, local13 + 14, Static103.aClass77_26.method1864(Static562.anInt9127), -1);
		@Pc(78) int local78 = Static287.aClass256_8.method7558();
		@Pc(82) int local82 = Static287.aClass256_8.method7561();
		@Pc(84) int local84 = 0;
		for (@Pc(91) Class1_Sub23 local91 = (Class1_Sub23) Static3.aClass361_1.method7854(); local91 != null; local91 = (Class1_Sub23) Static3.aClass361_1.method7853()) {
			@Pc(105) int local105 = (Static135.anInt2684 - local84 - 1) * 16 + local13 + 31;
			@Pc(107) short local107 = -1;
			if (local7 < local78 && local7 + local15 > local78 && local82 > local105 - 13 && local82 < local105 + 3 && local91.aBoolean389) {
				local107 = -256;
			}
			@Pc(145) int[] local145 = null;
			if (Static228.method3763(local91.anInt5147)) {
				local145 = Static46.aClass234_1.method5390((int) local91.aLong215).anIntArray592;
			} else if (local91.anInt5143 != -1) {
				local145 = Static46.aClass234_1.method5390(local91.anInt5143).anIntArray592;
			} else if (Static83.method1702(local91.anInt5147)) {
				@Pc(223) Class1_Sub39 local223 = (Class1_Sub39) Static131.aClass356_32.method7796((long) local91.aLong215);
				if (local223 != null) {
					@Pc(228) Class20_Sub2_Sub4_Sub1_Sub2 local228 = local223.aClass20_Sub2_Sub4_Sub1_Sub2_2;
					@Pc(231) Class162 local231 = local228.aClass162_1;
					if (local231.anIntArray267 != null) {
						local231 = local231.method3802(Static121.aClass148_1);
					}
					if (local231 != null) {
						local145 = local231.anIntArray266;
					}
				}
			} else if (Static376.method5467(local91.anInt5147)) {
				@Pc(190) Class306 local190;
				if (local91.anInt5147 == 1011) {
					local190 = Static146.aClass214_1.method4897((int) local91.aLong215);
				} else {
					local190 = Static146.aClass214_1.method4897((int) (local91.aLong215 >>> 32 & 0x7FFFFFFFL));
				}
				if (local190.anIntArray570 != null) {
					local190 = local190.method6966(Static121.aClass148_1);
				}
				if (local190 != null) {
					local145 = local190.anIntArray573;
				}
			}
			@Pc(258) String local258 = Static209.method3524(local91);
			if (local145 != null) {
				local258 = local258 + Static311.method4774(local145);
			}
			Static260.aClass35_7.method4936(local105, local7 + 3, Static415.anIntArray486, Static206.aClass10Array13, local107, local258);
			local84++;
			if (local91.aBoolean390) {
				Static276.aClass10_18.method7679(local7 + Static566.aClass13_15.method463(local258) + 5, local105 + -12);
			}
		}
		Static330.method4975(Static2.anInt57, Static86.anInt1957, Static215.anInt4176, Static100.anInt2087);
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(IIIIB)I")
	public static int method5614(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(12) int local12 = arg1 & 0xF;
		@Pc(21) int local21 = local12 >= 8 ? arg3 : arg2;
		@Pc(40) int local40 = local12 >= 4 ? (local12 == 12 || local12 == 14 ? arg2 : arg0) : arg3;
		return ((local12 & 0x1) == 0 ? local21 : -local21) + ((local12 & 0x2) == 0 ? local40 : -local40);
	}
}
