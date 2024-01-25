import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static508 {

	@OriginalMember(owner = "client!tg", name = "f", descriptor = "Lclient!eba;")
	public static final Class81 aClass81_36 = new Class81(24, -1);

	@OriginalMember(owner = "client!tg", name = "g", descriptor = "I")
	public static int anInt1420 = -1;

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(Lclient!r;I)V")
	public static void method1299(@OriginalArg(0) Class12 arg0) {
		if (Static135.anInt2684 < 2 && !Static22.aBoolean43 || Static363.aClass365_14 != null) {
			return;
		}
		@Pc(38) String local38;
		if (Static22.aBoolean43 && Static135.anInt2684 < 2) {
			local38 = Static559.aString92 + Static103.aClass77_34.method1864(Static562.anInt9127) + Static264.aString51 + " ->";
		} else if (Static490.aBoolean598 && Static595.aClass31_1.method985(81) && Static135.anInt2684 > 2) {
			local38 = Static209.method3524((Class1_Sub23) Static3.aClass361_1.aClass1_281.aClass1_285.aClass1_285);
		} else {
			@Pc(67) Class1_Sub23 local67 = (Class1_Sub23) Static3.aClass361_1.aClass1_281.aClass1_285;
			local38 = Static209.method3524(local67);
			@Pc(73) int[] local73 = null;
			if (Static228.method3763(local67.anInt5147)) {
				local73 = Static46.aClass234_1.method5390((int) local67.aLong215).anIntArray592;
			} else if (local67.anInt5143 != -1) {
				local73 = Static46.aClass234_1.method5390(local67.anInt5143).anIntArray592;
			} else if (Static83.method1702(local67.anInt5147)) {
				@Pc(151) Class1_Sub39 local151 = (Class1_Sub39) Static131.aClass356_32.method7796((long) local67.aLong215);
				if (local151 != null) {
					@Pc(156) Class20_Sub2_Sub4_Sub1_Sub2 local156 = local151.aClass20_Sub2_Sub4_Sub1_Sub2_2;
					@Pc(159) Class162 local159 = local156.aClass162_1;
					if (local159.anIntArray267 != null) {
						local159 = local159.method3802(Static121.aClass148_1);
					}
					if (local159 != null) {
						local73 = local159.anIntArray266;
					}
				}
			} else if (Static376.method5467(local67.anInt5147)) {
				@Pc(120) Class306 local120;
				if (local67.anInt5147 == 1011) {
					local120 = Static146.aClass214_1.method4897((int) local67.aLong215);
				} else {
					local120 = Static146.aClass214_1.method4897((int) (local67.aLong215 >>> 32 & 0x7FFFFFFFL));
				}
				if (local120.anIntArray570 != null) {
					local120 = local120.method6966(Static121.aClass148_1);
				}
				if (local120 != null) {
					local73 = local120.anIntArray573;
				}
			}
			if (local73 != null) {
				local38 = local38 + Static311.method4774(local73);
			}
		}
		if (Static135.anInt2684 > 2) {
			local38 = local38 + "<col=ffffff> / " + (Static135.anInt2684 - 2) + Static103.aClass77_27.method1864(Static562.anInt9127);
		}
		if (Static476.aClass365_15 != null) {
			@Pc(261) Class35 local261 = Static476.aClass365_15.method7918(arg0);
			if (local261 == null) {
				local261 = Static260.aClass35_7;
			}
			local261.method4937(Static476.aClass365_15.anInt9633, Static206.aClass10Array13, Static476.aClass365_15.anInt9636, Static476.aClass365_15.anInt9585, Static476.aClass365_15.anInt9638, Static476.aClass365_15.anInt9578, anInt1420, Static415.anIntArray486, local38, Static527.anInt8735, Static526.anInt8693, Static476.aClass365_15.anInt9637, Static76.anIntArray106, Static535.aRandom1);
			Static177.method1858(Static76.anIntArray106[1], Static76.anIntArray106[2], Static76.anIntArray106[0], Static76.anIntArray106[3]);
		} else if (Static193.aClass365_7 != null && Static433.aClass230_4 == Static275.aClass230_2) {
			@Pc(242) int local242 = Static260.aClass35_7.method4947(Static206.aClass10Array13, Static415.anIntArray486, local38, Static89.anInt1988 + 16, Static535.aRandom1, Static539.anInt8888 + 4, Static526.anInt8693);
			Static177.method1858(Static89.anInt1988, Static566.aClass13_15.method463(local38) + local242, Static539.anInt8888 + 4, 16);
			return;
		}
	}
}
