import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static169 {

	@OriginalMember(owner = "client!ki", name = "m", descriptor = "[I")
	public static int[] anIntArray203;

	@OriginalMember(owner = "client!ki", name = "p", descriptor = "[I")
	public static int[] anIntArray204;

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(IIIIIIIB)V", line = 3)
	public static void method3373(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (arg4 >= Class25_Sub1.anInt675 && Class61.anInt1835 >= arg5 && Class2_Sub40.anInt6819 <= arg2 && Class2_Sub20.anInt2951 >= arg1) {
			Static33.method4821(arg1, arg4, arg0, arg5, arg6, arg2, arg3);
		} else {
			Static357.method6381(arg5, arg3, arg2, arg0, arg4, arg1, arg6);
		}
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(ZI)V", line = 54)
	public static void method3376(@OriginalArg(0) boolean arg0) {
		Class154.aBoolean252 = arg0;
		@Pc(13) int local13;
		@Pc(17) int local17;
		@Pc(23) int local23;
		@Pc(36) boolean local36;
		@Pc(44) int local44;
		@Pc(48) int local48;
		@Pc(52) int local52;
		@Pc(59) int local59;
		if (!Class154.aBoolean252) {
			local13 = Class150.aClass2_Sub4_Sub2_3.method4804();
			local17 = Class150.aClass2_Sub4_Sub2_3.method4830();
			local23 = Class150.aClass2_Sub4_Sub2_3.method4816();
			local36 = Class150.aClass2_Sub4_Sub2_3.method4805() == 1;
			Static202.method3796(local23);
			local44 = (Class61.anInt1834 - Class150.aClass2_Sub4_Sub2_3.anInt5289) / 16;
			Static254.anIntArrayArray43 = new int[local44][4];
			for (local48 = 0; local48 < local44; local48++) {
				for (local52 = 0; local52 < 4; local52++) {
					Static254.anIntArrayArray43[local48][local52] = Class150.aClass2_Sub4_Sub2_3.method4837();
				}
			}
			Static99.aByteArrayArray6 = new byte[local44][];
			Static48.anIntArray98 = new int[local44];
			Static78.aByteArrayArray5 = new byte[local44][];
			Static215.aByteArrayArray9 = new byte[local44][];
			Static349.anIntArray480 = new int[local44];
			Static206.anIntArray314 = new int[local44];
			Static268.anIntArray372 = new int[local44];
			Static58.anIntArray155 = new int[local44];
			Static248.aByteArrayArray15 = new byte[local44][];
			Static196.aByteArrayArray7 = null;
			Static177.anIntArray208 = null;
			local44 = 0;
			for (local52 = (local13 - (Class241.anInt7020 >> 4)) / 8; local52 <= (local13 + (Class241.anInt7020 >> 4)) / 8; local52++) {
				for (local59 = (local17 - (OutputStream_Sub1.anInt4442 >> 4)) / 8; local59 <= (local17 + (OutputStream_Sub1.anInt4442 >> 4)) / 8; local59++) {
					Static268.anIntArray372[local44] = (local52 << 8) + local59;
					Static206.anIntArray314[local44] = Static265.aClass197_70.method5076("m" + local52 + "_" + local59);
					Static349.anIntArray480[local44] = Static265.aClass197_70.method5076("l" + local52 + "_" + local59);
					Static48.anIntArray98[local44] = Static265.aClass197_70.method5076("um" + local52 + "_" + local59);
					Static58.anIntArray155[local44] = Static265.aClass197_70.method5076("ul" + local52 + "_" + local59);
					local44++;
				}
			}
			Static348.method6268(false, local13, local36, local17);
			return;
		}
		local13 = Class150.aClass2_Sub4_Sub2_3.method4830();
		local17 = Class150.aClass2_Sub4_Sub2_3.method4804();
		local23 = Class150.aClass2_Sub4_Sub2_3.method4805();
		local36 = Class150.aClass2_Sub4_Sub2_3.method4805() == 1;
		Static202.method3796(local23);
		Class150.aClass2_Sub4_Sub2_3.method4870();
		for (local44 = 0; local44 < 4; local44++) {
			for (local48 = 0; local48 < Class241.anInt7020 >> 3; local48++) {
				for (local52 = 0; local52 < OutputStream_Sub1.anInt4442 >> 3; local52++) {
					local59 = Class150.aClass2_Sub4_Sub2_3.method4869(1);
					if (local59 == 1) {
						Static287.anIntArrayArrayArray12[local44][local48][local52] = Class150.aClass2_Sub4_Sub2_3.method4869(26);
					} else {
						Static287.anIntArrayArrayArray12[local44][local48][local52] = -1;
					}
				}
			}
		}
		Class150.aClass2_Sub4_Sub2_3.method4866();
		local48 = (Class61.anInt1834 - Class150.aClass2_Sub4_Sub2_3.anInt5289) / 16;
		Static254.anIntArrayArray43 = new int[local48][4];
		for (local52 = 0; local52 < local48; local52++) {
			for (local59 = 0; local59 < 4; local59++) {
				Static254.anIntArrayArray43[local52][local59] = Class150.aClass2_Sub4_Sub2_3.method4837();
			}
		}
		Static349.anIntArray480 = new int[local48];
		Static58.anIntArray155 = new int[local48];
		Static215.aByteArrayArray9 = new byte[local48][];
		Static248.aByteArrayArray15 = new byte[local48][];
		Static99.aByteArrayArray6 = new byte[local48][];
		Static177.anIntArray208 = null;
		Static206.anIntArray314 = new int[local48];
		Static196.aByteArrayArray7 = null;
		Static48.anIntArray98 = new int[local48];
		Static268.anIntArray372 = new int[local48];
		Static78.aByteArrayArray5 = new byte[local48][];
		local48 = 0;
		for (local59 = 0; local59 < 4; local59++) {
			for (@Pc(195) int local195 = 0; local195 < Class241.anInt7020 >> 3; local195++) {
				for (@Pc(199) int local199 = 0; local199 < OutputStream_Sub1.anInt4442 >> 3; local199++) {
					@Pc(209) int local209 = Static287.anIntArrayArrayArray12[local59][local195][local199];
					if (local209 != -1) {
						@Pc(219) int local219 = local209 >> 14 & 0x3FF;
						@Pc(225) int local225 = local209 >> 3 & 0x7FF;
						@Pc(235) int local235 = local225 / 8 + (local219 / 8 << 8);
						for (@Pc(237) int local237 = 0; local237 < local48; local237++) {
							if (local235 == Static268.anIntArray372[local237]) {
								local235 = -1;
								break;
							}
						}
						if (local235 != -1) {
							Static268.anIntArray372[local48] = local235;
							@Pc(270) int local270 = local235 >> 8 & 0xFF;
							@Pc(274) int local274 = local235 & 0xFF;
							Static206.anIntArray314[local48] = Static265.aClass197_70.method5076("m" + local270 + "_" + local274);
							Static349.anIntArray480[local48] = Static265.aClass197_70.method5076("l" + local270 + "_" + local274);
							Static48.anIntArray98[local48] = Static265.aClass197_70.method5076("um" + local270 + "_" + local274);
							Static58.anIntArray155[local48] = Static265.aClass197_70.method5076("ul" + local270 + "_" + local274);
							local48++;
						}
					}
				}
			}
		}
		Static348.method6268(false, local13, local36, local17);
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "([Lclient!nk;II)V", line = 302)
	public static void method3379(@OriginalArg(0) Class161[] arg0, @OriginalArg(1) int arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0.length; local7++) {
			@Pc(13) Class161 local13 = arg0[local7];
			if (local13 != null && arg1 == local13.anInt4268 && !Static42.method1405(local13)) {
				if (local13.anInt4265 == 0) {
					method3379(arg0, local13.anInt4310);
					if (local13.aClass161Array2 != null) {
						method3379(local13.aClass161Array2, local13.anInt4310);
					}
					@Pc(51) Class2_Sub7 local51 = (Class2_Sub7) Class2_Sub3_Sub34.aClass4_130.method90((long) local13.anInt4310);
					if (local51 != null) {
						Static215.method4029(local51.anInt1368);
					}
				}
				if (local13.anInt4265 == 6 && local13.anInt4292 != -1) {
					@Pc(71) Class157 local71 = Static37.aClass85_1.method2373(local13.anInt4292);
					if (local71 != null) {
						local13.anInt4276 += Class116.anInt3144;
						while (local71.anIntArray261[local13.anInt4241] < local13.anInt4276) {
							local13.anInt4276 -= local71.anIntArray261[local13.anInt4241];
							local13.anInt4241++;
							if (local71.anIntArray262.length <= local13.anInt4241) {
								local13.anInt4241 -= local71.anInt4027;
								if (local13.anInt4241 < 0 || local13.anInt4241 >= local71.anIntArray262.length) {
									local13.anInt4241 = 0;
								}
							}
							local13.anInt4309 = local13.anInt4241 + 1;
							if (local71.anIntArray262.length <= local13.anInt4309) {
								local13.anInt4309 -= local71.anInt4027;
								if (local13.anInt4309 < 0 || local13.anInt4309 >= local71.anIntArray262.length) {
									local13.anInt4309 = -1;
								}
							}
							Static187.method3646(local13);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(IIII)I", line = 441)
	public static int method3382(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 > 243) {
			arg2 >>= 0x4;
		} else if (arg1 > 217) {
			arg2 >>= 0x3;
		} else if (arg1 > 192) {
			arg2 >>= 0x2;
		} else if (arg1 > 179) {
			arg2 >>= 0x1;
		}
		return ((arg0 >> 2 & 0x3F) << 10) + (arg2 >> 5 << 7) + (arg1 >> 1);
	}
}
