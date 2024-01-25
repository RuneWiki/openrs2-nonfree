import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static217 {

	@OriginalMember(owner = "client!ok", name = "i", descriptor = "Lclient!cq;")
	public static Class8 aClass8_11;

	@OriginalMember(owner = "client!ok", name = "n", descriptor = "Lclient!ii;")
	public static Class105 aClass105_5;

	@OriginalMember(owner = "client!ok", name = "j", descriptor = "I")
	public static int anInt951 = 0;

	@OriginalMember(owner = "client!ok", name = "o", descriptor = "[I")
	public static final int[] anIntArray57 = new int[32];

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(IIIBI)Z")
	public static boolean method739(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if ((Static291.aByteArrayArrayArray11[0][arg2][arg1] & 0x2) != 0) {
			return true;
		} else if ((Static291.aByteArrayArrayArray11[arg0][arg2][arg1] & 0x10) == 0) {
			return Static120.method1954(arg2, arg1, arg0) == arg3;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ok", name = "d", descriptor = "(I)V")
	public static void method741() {
		for (@Pc(7) int local7 = 0; local7 < Static62.anInt6674; local7++) {
			@Pc(13) int local13 = Static312.anIntArray623[local7];
			@Pc(17) Class10_Sub1_Sub2_Sub1 local17 = Static178.aClass10_Sub1_Sub2_Sub1Array1[local13];
			@Pc(21) int local21 = Static142.aClass1_Sub21_Sub2_1.method5720();
			if ((local21 & 0x40) != 0) {
				local21 += Static142.aClass1_Sub21_Sub2_1.method5720() << 8;
			}
			@Pc(47) int local47;
			@Pc(58) int local58;
			if ((local21 & 0x4) != 0) {
				local47 = Static142.aClass1_Sub21_Sub2_1.method5712();
				if (local47 == 65535) {
					local47 = -1;
				}
				local58 = Static142.aClass1_Sub21_Sub2_1.method5743();
				Static305.method5288(local17, local58, local47);
			}
			if ((local21 & 0x2) != 0) {
				local17.anInt4061 = Static142.aClass1_Sub21_Sub2_1.method5728();
				if (local17.anInt4061 == 65535) {
					local17.anInt4061 = -1;
				}
			}
			if ((local21 & 0x400) != 0) {
				local17.anInt4015 = Static142.aClass1_Sub21_Sub2_1.method5712();
				local17.anInt4053 = Static142.aClass1_Sub21_Sub2_1.method5712();
			}
			if ((local21 & 0x20) != 0) {
				local47 = Static142.aClass1_Sub21_Sub2_1.method5699();
				local58 = Static142.aClass1_Sub21_Sub2_1.method5727();
				local17.method3405(local58, local47, Static282.anInt3516);
			}
			if ((local21 & 0x100) != 0) {
				local47 = Static142.aClass1_Sub21_Sub2_1.method5728();
				local17.anInt4017 = Static142.aClass1_Sub21_Sub2_1.method5720();
				local17.anInt4025 = Static142.aClass1_Sub21_Sub2_1.method5743();
				local17.aBoolean309 = (local47 & 0x8000) != 0;
				local17.anInt4065 = local47 & 0x7FFF;
				local17.anInt4045 = local17.anInt4017 + local17.anInt4065 + Static282.anInt3516;
			}
			@Pc(259) int local259;
			if ((local21 & 0x80) != 0) {
				local47 = Static142.aClass1_Sub21_Sub2_1.method5712();
				if (local47 == 65535) {
					local47 = -1;
				}
				local58 = Static142.aClass1_Sub21_Sub2_1.method5716();
				@Pc(185) boolean local185 = true;
				@Pc(256) Class177 local256;
				if (local47 != -1 && local17.anInt4058 != -1) {
					@Pc(205) Class162 local205;
					if (local17.anInt4058 == local47) {
						local205 = Static264.method4763(local47);
						if (local205.aBoolean394 && local205.anInt4910 != -1) {
							local256 = Static354.method5863(local205.anInt4910);
							local259 = local256.anInt5420;
							if (local259 == 0) {
								local185 = false;
							} else if (local259 == 1) {
								local185 = true;
							} else if (local259 == 2) {
								local185 = false;
								local17.anInt4010 = 0;
							}
						}
					} else {
						local205 = Static264.method4763(local47);
						@Pc(210) Class162 local210 = Static264.method4763(local17.anInt4058);
						if (local205.anInt4910 != -1 && local210.anInt4910 != -1) {
							@Pc(225) Class177 local225 = Static354.method5863(local205.anInt4910);
							@Pc(230) Class177 local230 = Static354.method5863(local210.anInt4910);
							if (local230.anInt5417 > local225.anInt5417) {
								local185 = false;
							}
						}
					}
				}
				if (local185) {
					local17.anInt4070 = local58 >> 16;
					local17.anInt4058 = local47;
					local17.anInt4076 = (local58 & 0xFFFF) + Static282.anInt3516;
					local17.anInt4018 = 1;
					local17.anInt4038 = 0;
					local17.anInt4013 = 0;
					if (Static282.anInt3516 < local17.anInt4076) {
						local17.anInt4038 = -1;
					}
					if (local17.anInt4058 != -1 && Static282.anInt3516 == local17.anInt4076) {
						@Pc(341) int local341 = Static264.method4763(local17.anInt4058).anInt4910;
						if (local341 != -1) {
							local256 = Static354.method5863(local341);
							if (local256 != null && local256.anIntArray529 != null) {
								Static351.method3417(local17.anInt6726, false, local17.anInt6728, 0, local256);
							}
						}
					}
				}
			}
			if ((local21 & 0x10) != 0) {
				if (local17.aClass60_1.method1272()) {
					Static60.method1145(local17);
				}
				local17.method677(Static68.method1219(Static142.aClass1_Sub21_Sub2_1.method5728()));
				local17.method3404(local17.aClass60_1.anInt1504);
				local17.anInt4011 = local17.aClass60_1.anInt1531 << 3;
				if (local17.aClass60_1.method1272()) {
					Static147.method2608(Static127.anInt2487, local17.anIntArray388[0], 0, local17.anIntArray387[0], null, null, local17);
				}
			}
			if ((local21 & 0x200) != 0) {
				local47 = Static142.aClass1_Sub21_Sub2_1.method5743();
				@Pc(432) int[] local432 = new int[local47];
				@Pc(435) int[] local435 = new int[local47];
				@Pc(438) int[] local438 = new int[local47];
				for (@Pc(440) int local440 = 0; local440 < local47; local440++) {
					local259 = Static142.aClass1_Sub21_Sub2_1.method5712();
					if (local259 == 65535) {
						local259 = -1;
					}
					local432[local440] = local259;
					local435[local440] = Static142.aClass1_Sub21_Sub2_1.method5746();
					local438[local440] = Static142.aClass1_Sub21_Sub2_1.method5728();
				}
				Static238.method4331(local17, local438, local432, local435);
			}
			if ((local21 & 0x8) != 0) {
				local17.aString150 = Static142.aClass1_Sub21_Sub2_1.method5701();
				local17.anInt4043 = 100;
			}
			if ((local21 & 0x1) != 0) {
				local47 = Static142.aClass1_Sub21_Sub2_1.method5699();
				local58 = Static142.aClass1_Sub21_Sub2_1.method5727();
				local17.method3405(local58, local47, Static282.anInt3516);
				local17.anInt4048 = Static282.anInt3516 + 300;
				local17.anInt4007 = Static142.aClass1_Sub21_Sub2_1.method5746();
			}
		}
	}
}
