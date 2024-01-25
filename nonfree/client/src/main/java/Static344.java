import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static344 {

	@OriginalMember(owner = "client!oi", name = "y", descriptor = "[I")
	public static final int[] anIntArray616 = new int[250];

	@OriginalMember(owner = "client!oi", name = "A", descriptor = "I")
	public static int anInt6169 = 0;

	@OriginalMember(owner = "client!oi", name = "B", descriptor = "[S")
	public static short[] aShortArray115 = new short[256];

	@OriginalMember(owner = "client!oi", name = "e", descriptor = "(I)V")
	public static void method5214() {
		Static386.aClass17_30.method734();
		Static256.aClass17_21.method734();
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(ILclient!cl;IIII)V")
	public static void method5215(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub10 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (arg1.anInt1214 == -1 && arg1.anIntArray150 == null) {
			return;
		}
		@Pc(15) int local15 = 0;
		if (arg1.anInt1215 < arg3) {
			local15 = arg3 - arg1.anInt1215;
		} else if (arg1.anInt1203 > arg3) {
			local15 = arg1.anInt1203 - arg3;
		}
		@Pc(48) int local48 = Static544.aClass1_Sub22_Sub1_1.anInt5431 * arg1.anInt1211 >> 8;
		if (arg0 > arg1.anInt1208) {
			local15 += arg0 - arg1.anInt1208;
		} else if (arg1.anInt1210 > arg0) {
			local15 += arg1.anInt1210 - arg0;
		}
		if (arg1.anInt1199 == 0 || arg1.anInt1199 < local15 - 256 || Static544.aClass1_Sub22_Sub1_1.anInt5431 == 0 || arg1.anInt1205 != arg4) {
			if (arg1.aClass1_Sub16_Sub2_2 != null) {
				Static411.aClass1_Sub16_Sub1_2.method2231(arg1.aClass1_Sub16_Sub2_2);
				arg1.aClass1_Sub16_Sub2_2 = null;
			}
			if (arg1.aClass1_Sub16_Sub2_3 != null) {
				Static411.aClass1_Sub16_Sub1_2.method2231(arg1.aClass1_Sub16_Sub2_3);
				arg1.aClass1_Sub16_Sub2_3 = null;
			}
			return;
		}
		local15 -= 256;
		if (local15 < 0) {
			local15 = 0;
		}
		@Pc(145) int local145 = (arg1.anInt1199 - local15) * local48 / arg1.anInt1199;
		if (arg1.aClass1_Sub16_Sub2_2 != null) {
			arg1.aClass1_Sub16_Sub2_2.method4084(local145);
		} else if (arg1.anInt1214 >= 0) {
			@Pc(160) Class159 local160 = Static554.method4066(Static361.aClass171_109, arg1.anInt1214, 0);
			if (local160 != null) {
				@Pc(167) Class1_Sub37_Sub1 local167 = local160.method4069().method6539(Static473.aClass28_1);
				@Pc(172) Class1_Sub16_Sub2 local172 = Static555.method4088(local167, local145);
				local172.method4083(-1);
				Static411.aClass1_Sub16_Sub1_2.method2236(local172);
				arg1.aClass1_Sub16_Sub2_2 = local172;
			}
		}
		if (arg1.aClass1_Sub16_Sub2_3 != null) {
			arg1.aClass1_Sub16_Sub2_3.method4084(local145);
			if (arg1.aClass1_Sub16_Sub2_3.method7527()) {
				return;
			}
			arg1.aClass1_Sub16_Sub2_3 = null;
		} else if (arg1.anIntArray150 != null && (arg1.anInt1202 -= arg2) <= 0) {
			@Pc(209) int local209 = (int) (Math.random() * (double) arg1.anIntArray150.length);
			@Pc(217) Class159 local217 = Static554.method4066(Static361.aClass171_109, arg1.anIntArray150[local209], 0);
			if (local217 != null) {
				@Pc(224) Class1_Sub37_Sub1 local224 = local217.method4069().method6539(Static473.aClass28_1);
				@Pc(229) Class1_Sub16_Sub2 local229 = Static555.method4088(local224, local145);
				local229.method4083(0);
				Static411.aClass1_Sub16_Sub1_2.method2236(local229);
				arg1.anInt1202 = (int) (Math.random() * (double) (arg1.anInt1213 - arg1.anInt1200)) + arg1.anInt1200;
				arg1.aClass1_Sub16_Sub2_3 = local229;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(Lclient!j;IFIIFI[BBFFIF)V")
	public static void method5216(@OriginalArg(0) Class147 arg0, @OriginalArg(2) float arg1, @OriginalArg(3) int arg2, @OriginalArg(5) float arg3, @OriginalArg(7) byte[] arg4, @OriginalArg(9) float arg5, @OriginalArg(10) float arg6, @OriginalArg(12) float arg7) {
		for (@Pc(3) int local3 = 0; local3 < 16; local3++) {
			Static55.method1088(local3, arg1, arg4, arg5, arg3, arg2, arg0, arg6, arg7);
			arg2 += 16384;
		}
	}
}
