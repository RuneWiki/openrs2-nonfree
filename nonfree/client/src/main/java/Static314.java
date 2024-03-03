import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static314 {

	@OriginalMember(owner = "client!tk", name = "e", descriptor = "Lclient!jd;")
	public static Class13 aClass13_17;

	@OriginalMember(owner = "client!tk", name = "f", descriptor = "Lclient!kp;")
	public static Class131 aClass131_1;

	@OriginalMember(owner = "client!tk", name = "g", descriptor = "I")
	public static int anInt6305;

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(IILclient!jc;III)V", line = 9)
	public static void method5707(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class2_Sub19 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg2.anInt2891 == -1 && arg2.anIntArray181 == null) {
			return;
		}
		@Pc(16) int local16 = 0;
		@Pc(24) int local24 = Static203.aClass177_Sub1_2.anInt4872 * arg2.anInt2903 >> 8;
		if (arg2.anInt2893 < arg4) {
			local16 = arg4 - arg2.anInt2893;
		} else if (arg4 < arg2.anInt2896) {
			local16 = arg2.anInt2896 - arg4;
		}
		if (arg3 > arg2.anInt2901) {
			local16 += arg3 - arg2.anInt2901;
		} else if (arg3 < arg2.anInt2907) {
			local16 += arg2.anInt2907 - arg3;
		}
		if (arg2.anInt2898 == 0 || arg2.anInt2898 < local16 - 64 || Static203.aClass177_Sub1_2.anInt4872 == 0 || arg2.anInt2902 != arg1) {
			if (arg2.aClass2_Sub12_Sub4_3 != null) {
				Static211.aClass2_Sub12_Sub2_2.method2083(arg2.aClass2_Sub12_Sub4_3);
				arg2.aClass2_Sub12_Sub4_3 = null;
			}
			if (arg2.aClass2_Sub12_Sub4_2 != null) {
				Static211.aClass2_Sub12_Sub2_2.method2083(arg2.aClass2_Sub12_Sub4_2);
				arg2.aClass2_Sub12_Sub4_2 = null;
			}
			return;
		}
		local16 -= 64;
		if (local16 < 0) {
			local16 = 0;
		}
		@Pc(140) int local140 = local24 * (arg2.anInt2898 - local16) / arg2.anInt2898;
		if (arg2.aClass2_Sub12_Sub4_3 != null) {
			arg2.aClass2_Sub12_Sub4_3.method4980(local140);
		} else if (arg2.anInt2891 >= 0) {
			@Pc(155) Class247 local155 = Static395.method6436(Static81.aClass197_21, arg2.anInt2891, 0);
			if (local155 != null) {
				@Pc(162) Class2_Sub21_Sub1 local162 = local155.method6435().method3180(Static277.aClass249_1);
				@Pc(167) Class2_Sub12_Sub4 local167 = Static392.method5007(local162, local140);
				local167.method4985(-1);
				Static211.aClass2_Sub12_Sub2_2.method2085(local167);
				arg2.aClass2_Sub12_Sub4_3 = local167;
			}
		}
		if (arg2.aClass2_Sub12_Sub4_2 != null) {
			arg2.aClass2_Sub12_Sub4_2.method4980(local140);
			if (arg2.aClass2_Sub12_Sub4_2.method6463()) {
				return;
			}
			arg2.aClass2_Sub12_Sub4_2 = null;
		} else if (arg2.anIntArray181 != null && (arg2.anInt2904 -= arg0) <= 0) {
			@Pc(204) int local204 = (int) ((double) arg2.anIntArray181.length * Math.random());
			@Pc(212) Class247 local212 = Static395.method6436(Static81.aClass197_21, arg2.anIntArray181[local204], 0);
			if (local212 != null) {
				@Pc(219) Class2_Sub21_Sub1 local219 = local212.method6435().method3180(Static277.aClass249_1);
				@Pc(224) Class2_Sub12_Sub4 local224 = Static392.method5007(local219, local140);
				local224.method4985(0);
				Static211.aClass2_Sub12_Sub2_2.method2085(local224);
				arg2.anInt2904 = (int) ((double) (arg2.anInt2894 - arg2.anInt2900) * Math.random()) + arg2.anInt2900;
				arg2.aClass2_Sub12_Sub4_2 = local224;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(ILclient!nh;II)V", line = 136)
	public static void method5708(@OriginalArg(1) Class11_Sub5_Sub2_Sub1 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg0.anInt4589 == arg2 && arg2 != -1) {
			@Pc(18) Class157 local18 = Static37.aClass85_1.method2373(arg2);
			@Pc(21) int local21 = local18.anInt4017;
			if (local21 == 1) {
				arg0.anInt4582 = arg1;
				arg0.anInt4599 = 0;
				arg0.anInt4584 = 1;
				arg0.anInt4590 = 0;
				arg0.anInt4615 = 0;
				Static1.method4(local18, arg0 == Static17.aClass11_Sub5_Sub2_Sub1_3, arg0.aByte78, arg0.anInt6768, arg0.anInt6770, arg0.anInt4599);
			}
			if (local21 == 2) {
				arg0.anInt4590 = 0;
			}
		} else if (arg2 == -1 || arg0.anInt4589 == -1 || Static37.aClass85_1.method2373(arg2).anInt4018 >= Static37.aClass85_1.method2373(arg0.anInt4589).anInt4018) {
			arg0.anInt4589 = arg2;
			arg0.anInt4590 = 0;
			arg0.anInt4615 = 0;
			arg0.anInt4633 = arg0.anInt4634;
			arg0.anInt4582 = arg1;
			arg0.anInt4584 = 1;
			arg0.anInt4599 = 0;
			if (arg0.anInt4589 != -1) {
				Static1.method4(Static37.aClass85_1.method2373(arg0.anInt4589), arg0 == Static17.aClass11_Sub5_Sub2_Sub1_3, arg0.aByte78, arg0.anInt6768, arg0.anInt6770, arg0.anInt4599);
			}
		}
	}

	@OriginalMember(owner = "client!tk", name = "b", descriptor = "(I)V", line = 199)
	public static void method5710() {
		Static346.method6258((long) Class83.anInt2345, Static177.aClass19_8);
		if (Class97.anInt2592 != -1) {
			Static215.method4029(Class97.anInt2592);
		}
		for (@Pc(19) int local19 = 0; local19 < Class109.anInt2803; local19++) {
			if (Class2_Sub3_Sub10_Sub1.aBooleanArray59[local19]) {
				Class243.aBooleanArray64[local19] = true;
			}
			Class17.aBooleanArray6[local19] = Class2_Sub3_Sub10_Sub1.aBooleanArray59[local19];
			Class2_Sub3_Sub10_Sub1.aBooleanArray59[local19] = false;
		}
		RuntimeException_Sub1.anInt2465 = Class83.anInt2345;
		if (Static177.aClass19_8.method2873()) {
			Class2_Sub3_Sub12.aBoolean164 = true;
		}
		if (Class97.anInt2592 != -1) {
			Class109.anInt2803 = 0;
			Static43.method1423();
		}
		Static177.aClass19_8.method2900();
		Static284.method5256(Class2_Sub3_Sub39.anInt7250);
		Class116.anInt3144 = 0;
	}
}
