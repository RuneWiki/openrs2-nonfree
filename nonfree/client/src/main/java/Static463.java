import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static463 {

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(I)V")
	public static void method6786() {
		Static321.aClass167_30.method3961();
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(IIIILclient!rj;Z)V")
	public static void method6787(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class4_Sub43 arg4) {
		if (arg4.anInt8723 == -1 && arg4.anIntArray513 == null) {
			return;
		}
		@Pc(16) int local16 = 0;
		@Pc(24) int local24 = Static455.aClass4_Sub35_Sub1_1.anInt9929 * arg4.anInt8725 >> 8;
		if (arg4.anInt8722 < arg0) {
			local16 = arg0 - arg4.anInt8722;
		} else if (arg0 < arg4.anInt8735) {
			local16 = arg4.anInt8735 - arg0;
		}
		if (arg1 > arg4.anInt8733) {
			local16 += arg1 - arg4.anInt8733;
		} else if (arg1 < arg4.anInt8726) {
			local16 += arg4.anInt8726 - arg1;
		}
		if (arg4.anInt8724 == 0 || local16 - 256 > arg4.anInt8724 || Static455.aClass4_Sub35_Sub1_1.anInt9929 == 0 || arg2 != arg4.anInt8721) {
			if (arg4.aClass4_Sub21_Sub2_3 != null) {
				Static472.aClass4_Sub21_Sub3_2.method5931(arg4.aClass4_Sub21_Sub2_3);
				arg4.aClass4_Sub12_2 = null;
				arg4.aClass4_Sub21_Sub2_3 = null;
				arg4.aClass4_Sub42_Sub1_3 = null;
			}
			if (arg4.aClass4_Sub21_Sub2_2 != null) {
				Static472.aClass4_Sub21_Sub3_2.method5931(arg4.aClass4_Sub21_Sub2_2);
				arg4.aClass4_Sub21_Sub2_2 = null;
				arg4.aClass4_Sub12_3 = null;
				arg4.aClass4_Sub42_Sub1_2 = null;
			}
			return;
		}
		local16 -= 256;
		if (local16 < 0) {
			local16 = 0;
		}
		@Pc(143) int local143 = (arg4.anInt8724 - local16) * local24 / arg4.anInt8724;
		Static167.aClass21_Sub1_Sub1_Sub1_Sub2_2.method3339();
		@Pc(149) int local149 = 8192;
		@Pc(159) int local159 = (arg4.anInt8735 + arg4.anInt8722) / 2 - arg0;
		@Pc(170) int local170 = (arg4.anInt8726 + arg4.anInt8733) / 2 - arg1;
		@Pc(191) int local191;
		@Pc(205) int local205;
		if (local159 != 0 || local170 != 0) {
			local191 = -Static353.anInt6831 - (int) (Math.atan2((double) local159, (double) local170) * 2607.5945876176133D) - 4096 & 0x3FFF;
			if (local191 > 8192) {
				local191 = 16384 - local191;
			}
			if (local16 <= 0) {
				local205 = 8192;
			} else if (local16 >= 4096) {
				local205 = 16384;
			} else {
				local205 = local16 * 8192 / 4096 + 8192;
			}
			local149 = local191 * local205 / 8192 + (16384 - local205 >> 1);
		}
		@Pc(349) Class4_Sub21_Sub2 local349;
		if (arg4.aClass4_Sub21_Sub2_3 != null) {
			arg4.aClass4_Sub21_Sub2_3.method4630(local143);
			arg4.aClass4_Sub21_Sub2_3.method4638(local149);
		} else if (arg4.anInt8723 >= 0) {
			local191 = arg4.anInt8728 == 256 && arg4.anInt8731 == 256 ? 256 : Static566.method8000(arg4.anInt8731, arg4.anInt8728);
			if (arg4.aBoolean613) {
				if (arg4.aClass4_Sub12_2 == null) {
					arg4.aClass4_Sub12_2 = Static116.method2118(Static19.aClass348_11, arg4.anInt8723);
				}
				if (arg4.aClass4_Sub12_2 != null) {
					if (arg4.aClass4_Sub42_Sub1_3 == null) {
						arg4.aClass4_Sub42_Sub1_3 = arg4.aClass4_Sub12_2.method2116(new int[] { 22050 });
					}
					if (arg4.aClass4_Sub42_Sub1_3 != null) {
						local349 = Static601.method4643(arg4.aClass4_Sub42_Sub1_3, local191, local143 << 6, local149);
						local349.method4624(-1);
						Static472.aClass4_Sub21_Sub3_2.method5927(local349);
						arg4.aClass4_Sub21_Sub2_3 = local349;
					}
				}
			} else {
				@Pc(285) Class323 local285 = Static605.method7397(Static518.aClass348_118, arg4.anInt8723, 0);
				if (local285 != null) {
					@Pc(292) Class4_Sub42_Sub1 local292 = local285.method7396().method7307(Static209.aClass285_1);
					@Pc(300) Class4_Sub21_Sub2 local300 = Static601.method4643(local292, local191, local143 << 6, local149);
					local300.method4624(-1);
					Static472.aClass4_Sub21_Sub3_2.method5927(local300);
					arg4.aClass4_Sub21_Sub2_3 = local300;
				}
			}
		}
		if (arg4.aClass4_Sub21_Sub2_2 != null) {
			arg4.aClass4_Sub21_Sub2_2.method4630(local143);
			arg4.aClass4_Sub21_Sub2_2.method4638(local149);
			if (!arg4.aClass4_Sub21_Sub2_2.method8199()) {
				arg4.aClass4_Sub12_3 = null;
				arg4.aClass4_Sub42_Sub1_2 = null;
				arg4.aClass4_Sub21_Sub2_2 = null;
			}
		} else if (arg4.anIntArray513 != null && (arg4.anInt8732 -= arg3) <= 0) {
			local191 = arg4.anInt8728 == 256 && arg4.anInt8731 == 256 ? 256 : (int) ((double) (arg4.anInt8728 - arg4.anInt8731) * Math.random()) + arg4.anInt8731;
			if (!arg4.aBoolean614) {
				local205 = (int) ((double) arg4.anIntArray513.length * Math.random());
				@Pc(441) Class323 local441 = Static605.method7397(Static518.aClass348_118, arg4.anIntArray513[local205], 0);
				if (local441 != null) {
					@Pc(448) Class4_Sub42_Sub1 local448 = local441.method7396().method7307(Static209.aClass285_1);
					@Pc(456) Class4_Sub21_Sub2 local456 = Static601.method4643(local448, local191, local143 << 6, local149);
					local456.method4624(0);
					Static472.aClass4_Sub21_Sub3_2.method5927(local456);
					arg4.anInt8732 = arg4.anInt8727 + (int) (Math.random() * (double) (arg4.anInt8736 - arg4.anInt8727));
					arg4.aClass4_Sub21_Sub2_2 = local456;
					return;
				}
				return;
			}
			if (arg4.aClass4_Sub12_3 == null) {
				local205 = (int) (Math.random() * (double) arg4.anIntArray513.length);
				arg4.aClass4_Sub12_3 = Static116.method2118(Static19.aClass348_11, arg4.anIntArray513[local205]);
			}
			if (arg4.aClass4_Sub12_3 != null) {
				if (arg4.aClass4_Sub42_Sub1_2 == null) {
					arg4.aClass4_Sub42_Sub1_2 = arg4.aClass4_Sub12_3.method2116(new int[] { 22050 });
				}
				if (arg4.aClass4_Sub42_Sub1_2 != null) {
					local349 = Static601.method4643(arg4.aClass4_Sub42_Sub1_2, local191, local143 << 6, local149);
					local349.method4624(0);
					Static472.aClass4_Sub21_Sub3_2.method5927(local349);
					arg4.anInt8732 = (int) ((double) (arg4.anInt8736 - arg4.anInt8727) * Math.random()) + arg4.anInt8727;
					arg4.aClass4_Sub21_Sub2_2 = local349;
					return;
				}
			}
		}
	}
}
