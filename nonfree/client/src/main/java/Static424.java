import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static424 {

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(Lclient!qe;ILclient!ha;Lclient!br;)V")
	public static void method6263(@OriginalArg(0) Class14_Sub46 arg0, @OriginalArg(2) Class137 arg1, @OriginalArg(3) Class42 arg2) {
		@Pc(10) Class20 local10 = arg2.method1110(arg1);
		if (local10 == null) {
			return;
		}
		@Pc(16) int local16 = local10.method7412();
		if (local16 < local10.method7393()) {
			local16 = local10.method7393();
		}
		@Pc(32) int local32 = arg0.anInt8310;
		@Pc(35) int local35 = arg0.anInt8312;
		@Pc(37) int local37 = 0;
		@Pc(39) int local39 = 0;
		@Pc(41) int local41 = 0;
		@Pc(55) int local55;
		@Pc(78) int local78;
		if (arg2.aString12 != null) {
			local37 = Static254.aClass158_7.method3596((int[]) null, Static135.aStringArray8, (Class20[]) null, arg2.aString12);
			for (local55 = 0; local55 < local37; local55++) {
				@Pc(61) String local61 = Static135.aStringArray8[local55];
				if (local37 - 1 > local55) {
					local61 = local61.substring(0, local61.length() - 4);
				}
				local78 = Static218.aClass124_5.method2950(local61);
				if (local39 < local78) {
					local39 = local78;
				}
			}
			local41 = local37 * Static218.aClass124_5.method2947() + Static218.aClass124_5.method2948() / 2;
		}
		local55 = local16 / 2 + arg0.anInt8310;
		if (local16 + Static498.anInt8802 > local32) {
			local55 = local16 / 2 + Static498.anInt8802 + local39 / 2 + 10 + 5;
			local32 = Static498.anInt8802;
		} else if (Static498.anInt8803 - local16 < local32) {
			local32 = Static498.anInt8803 - local16;
			local55 = Static498.anInt8803 - local16 / 2 - local39 / 2 - 10 - 5;
		}
		@Pc(168) int local168 = arg0.anInt8312;
		if (Static498.anInt8805 + local16 > local35) {
			local35 = Static498.anInt8805;
			local168 = Static498.anInt8805 + local16 / 2 + 10;
		} else if (Static498.anInt8804 - local16 < local35) {
			local168 = Static498.anInt8804 - local41 - local16 / 2 - 10;
			local35 = Static498.anInt8804 - local16;
		}
		local78 = (int) (Math.atan2((double) (local32 - arg0.anInt8310), (double) (local35 - arg0.anInt8312)) / 3.141592653589793D * 32767.0D) & 0xFFFF;
		local10.method7416((float) local32 + (float) local16 / 2.0F, (float) local35 + (float) local16 / 2.0F, 4096, local78);
		@Pc(255) int local255 = -2;
		@Pc(257) int local257 = -2;
		@Pc(259) int local259 = -2;
		@Pc(261) int local261 = -2;
		if (arg2.aString12 != null) {
			local257 = local168;
			local255 = local55 - local39 / 2 - 5;
			local259 = local255 + local39 + 10;
			local261 = local168 + Static218.aClass124_5.method2947() * local37 + 3;
			if (arg2.anInt1300 != 0) {
				arg1.method7869(local255, local259 - local255, arg2.anInt1300, local168, local261 - local168);
			}
			if (arg2.anInt1295 != 0) {
				arg1.method7941(local261 - local168, local255, arg2.anInt1295, local168, local259 - local255);
			}
			for (@Pc(328) int local328 = 0; local328 < local37; local328++) {
				@Pc(334) String local334 = Static135.aStringArray8[local328];
				if (local328 < local37 - 1) {
					local334 = local334.substring(0, local334.length() - 4);
				}
				Static218.aClass124_5.method2945(arg1, local334, local55, local168, arg2.anInt1293);
				local168 += Static218.aClass124_5.method2947();
			}
		}
		if (arg2.anInt1281 == -1 && arg2.aString12 == null) {
			return;
		}
		local16 >>= 0x1;
		@Pc(386) Class14_Sub54 local386 = new Class14_Sub54(arg0);
		local386.anInt10889 = local35 - local16;
		local386.anInt10892 = local32 - local16;
		local386.anInt10888 = local255;
		local386.anInt10887 = local261;
		local386.anInt10880 = local259;
		local386.anInt10881 = local16 + local35;
		local386.anInt10891 = local257;
		local386.anInt10882 = local32 + local16;
		Static461.aClass262_48.method6314(local386);
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(I)V")
	public static void method6264() {
		Static56.aClass14_Sub22_5.method3012(Static56.aClass14_Sub22_5.aClass21_Sub13_1, 1);
		Static56.aClass14_Sub22_5.method3012(Static56.aClass14_Sub22_5.aClass21_Sub13_2, 1);
		Static56.aClass14_Sub22_5.method3012(Static56.aClass14_Sub22_5.aClass21_Sub25_1, 2);
		Static56.aClass14_Sub22_5.method3012(Static56.aClass14_Sub22_5.aClass21_Sub25_2, 2);
		Static56.aClass14_Sub22_5.method3012(Static56.aClass14_Sub22_5.aClass21_Sub27_1, 1);
		Static56.aClass14_Sub22_5.method3012(Static56.aClass14_Sub22_5.aClass21_Sub22_1, 1);
		Static56.aClass14_Sub22_5.method3012(Static56.aClass14_Sub22_5.aClass21_Sub4_1, 1);
		Static56.aClass14_Sub22_5.method3012(Static56.aClass14_Sub22_5.aClass21_Sub19_1, 1);
		Static56.aClass14_Sub22_5.method3012(Static56.aClass14_Sub22_5.aClass21_Sub10_1, 1);
		Static56.aClass14_Sub22_5.method3012(Static56.aClass14_Sub22_5.aClass21_Sub28_1, 1);
		Static56.aClass14_Sub22_5.method3012(Static56.aClass14_Sub22_5.aClass21_Sub1_1, 1);
		Static56.aClass14_Sub22_5.method3012(Static56.aClass14_Sub22_5.aClass21_Sub18_1, 1);
		Static56.aClass14_Sub22_5.method3012(Static56.aClass14_Sub22_5.aClass21_Sub8_1, 0);
		Static56.aClass14_Sub22_5.method3012(Static56.aClass14_Sub22_5.aClass21_Sub17_1, 1);
		Static56.aClass14_Sub22_5.method3012(Static56.aClass14_Sub22_5.aClass21_Sub9_2, 0);
		Static56.aClass14_Sub22_5.method3012(Static56.aClass14_Sub22_5.aClass21_Sub9_1, 0);
		Static56.aClass14_Sub22_5.method3012(Static56.aClass14_Sub22_5.aClass21_Sub16_1, 1);
		Static56.aClass14_Sub22_5.method3012(Static56.aClass14_Sub22_5.aClass21_Sub3_1, 0);
		Static56.aClass14_Sub22_5.method3012(Static56.aClass14_Sub22_5.aClass21_Sub29_1, 0);
		Static61.method1233();
		Static56.aClass14_Sub22_5.method3012(Static56.aClass14_Sub22_5.aClass21_Sub23_1, 1);
		Static56.aClass14_Sub22_5.method3012(Static56.aClass14_Sub22_5.aClass21_Sub11_1, 3);
		Static221.method6306();
		Static677.method9300();
		Static6.aBoolean3 = true;
	}
}
