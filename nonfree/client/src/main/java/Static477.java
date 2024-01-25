import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static477 {

	@OriginalMember(owner = "client!sv", name = "Rd", descriptor = "Lclient!cb;")
	public static final Class40 aClass40_182 = new Class40(108, 19);

	@OriginalMember(owner = "client!sv", name = "Ud", descriptor = "Lclient!cb;")
	public static final Class40 aClass40_183 = new Class40(116, 6);

	@OriginalMember(owner = "client!sv", name = "Yd", descriptor = "J")
	public static long aLong221 = 0L;

	@OriginalMember(owner = "client!sv", name = "be", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger6 = new BigInteger("938f489d6b47d109e5ca8b95355b381ef51a34b800b930da1b134082a3c84bee417b5d0715604da90f013d2a5b3092a8d062956f8b3c457df7d33fb6c38aeac18006f89a79f182ada3f39b278d3714a1bcf5289b432558725ac55edb9a12f47bf390b3721f5eb403f537206694567c7e5dbe8713320e1de852cf53a8fbe0796b4957576342e002e8cd556160bc6d4ae6dea0ebd78812f27a9a117f3605a8ad55704cc48fce3cf4300187fd43057ebfd6c26b3f19fdca1bb149b148349b4c0c609c0988542ab1086a37c9439399727a9046e5b0181f3ee4d2740201fa71c29a338cf97c859aaf1862b6a09d2ac5494ad54de001450ca1eb7627116affc08121b437374f1bbc87c4adeb9f2b78cf27db57d30864f5345195b0c47e4f09de03ba221f32ac65ca11d6bfc5af63be5fc3eba7a4a7684463366d4503e2d720e0eb9b8edd2e6ccd825f090101237fbcc9966288152d072576ad9cefcba92fd4ce85645f454fc5002add0c47e518e58d376f5660dccf4d453275c88af1c442451aac0ecca94d02bcd19745ebb679f7b78b448607da1500356223afe2660fbfd8d81953161dbf7180c1875936b62e048f0c136aae5885d5595bf21dc8715f529d0c9925bc02401745e6cbaebb4da62ac141bb8ff40385a379b508eab5a91642a55f61c64559a6222118b3ed6abf9ce43df2b1f63e5c85b135c34ba8f9320e16ac6e8c1a41", 16);

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(IIB)V")
	public static void method7180(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static349.aFloat169 > Static349.aFloat170) {
			Static349.aFloat170 = (float) ((double) Static349.aFloat170 + (double) Static349.aFloat170 / 30.0D);
			if (Static349.aFloat169 < Static349.aFloat170) {
				Static349.aFloat170 = Static349.aFloat169;
			}
			Static155.method2279();
			Static349.anInt7455 = (int) Static349.aFloat170 >> 1;
			Static349.aByteArrayArrayArray17 = Static84.method1341(Static349.anInt7455);
		} else if (Static349.aFloat170 > Static349.aFloat169) {
			Static349.aFloat170 = (float) ((double) Static349.aFloat170 - (double) Static349.aFloat170 / 30.0D);
			if (Static349.aFloat170 < Static349.aFloat169) {
				Static349.aFloat170 = Static349.aFloat169;
			}
			Static155.method2279();
			Static349.anInt7455 = (int) Static349.aFloat170 >> 1;
			Static349.aByteArrayArrayArray17 = Static84.method1341(Static349.anInt7455);
		}
		if (Static331.anInt6297 != -1 && Static230.anInt3922 != -1) {
			@Pc(79) int local79 = Static331.anInt6297 - Static95.anInt1576;
			if (local79 < 2 || local79 > 2) {
				local79 /= 8;
			}
			@Pc(96) int local96 = Static230.anInt3922 - Static387.anInt6906;
			Static95.anInt1576 += local79;
			if (local96 < 2 || local96 > 2) {
				local96 /= 8;
			}
			Static387.anInt6906 += local96;
			if (local79 == 0 && local96 == 0) {
				Static331.anInt6297 = -1;
				Static230.anInt3922 = -1;
			}
			Static155.method2279();
		}
		if (Static102.anInt1883 > 0) {
			Static104.anInt1939--;
			if (Static104.anInt1939 == 0) {
				Static102.anInt1883--;
				Static104.anInt1939 = 100;
			}
		} else {
			Static492.anInt8232 = -1;
			Static20.anInt364 = -1;
		}
		if (!Static402.aBoolean494 || Static553.aClass275_194 == null) {
			return;
		}
		for (@Pc(167) Class6_Sub17 local167 = (Class6_Sub17) Static553.aClass275_194.method6366(); local167 != null; local167 = (Class6_Sub17) Static553.aClass275_194.method6364()) {
			@Pc(176) Class179 local176 = Static349.aClass276_3.method6396(local167.aClass6_Sub34_1.anInt4907);
			if (local167.method1647(arg1, arg0)) {
				if (local176.aStringArray18 != null) {
					if (local176.aStringArray18[4] != null) {
						Static246.method3528(0, (long) local167.aClass6_Sub34_1.anInt4907, local176.anInt4584, local176.aStringArray18[4], -1, 1007, local176.aString64, -1, true, false);
					}
					if (local176.aStringArray18[3] != null) {
						Static246.method3528(0, (long) local167.aClass6_Sub34_1.anInt4907, local176.anInt4584, local176.aStringArray18[3], -1, 1008, local176.aString64, -1, true, false);
					}
					if (local176.aStringArray18[2] != null) {
						Static246.method3528(0, (long) local167.aClass6_Sub34_1.anInt4907, local176.anInt4584, local176.aStringArray18[2], -1, 1001, local176.aString64, -1, true, false);
					}
					if (local176.aStringArray18[1] != null) {
						Static246.method3528(0, (long) local167.aClass6_Sub34_1.anInt4907, local176.anInt4584, local176.aStringArray18[1], -1, 1011, local176.aString64, -1, true, false);
					}
					if (local176.aStringArray18[0] != null) {
						Static246.method3528(0, (long) local167.aClass6_Sub34_1.anInt4907, local176.anInt4584, local176.aStringArray18[0], -1, 1003, local176.aString64, -1, true, false);
					}
				}
				if (!local167.aClass6_Sub34_1.aBoolean294) {
					local167.aClass6_Sub34_1.aBoolean294 = true;
					Static100.method1631(Static121.aClass84_6, local167.aClass6_Sub34_1.anInt4907, local176.anInt4584);
				}
				if (local167.aClass6_Sub34_1.aBoolean294) {
					Static100.method1631(Static121.aClass84_5, local167.aClass6_Sub34_1.anInt4907, local176.anInt4584);
				}
			} else if (local167.aClass6_Sub34_1.aBoolean294) {
				local167.aClass6_Sub34_1.aBoolean294 = false;
				Static100.method1631(Static273.aClass84_9, local167.aClass6_Sub34_1.anInt4907, local176.anInt4584);
			}
		}
	}

	@OriginalMember(owner = "client!sv", name = "d", descriptor = "(IIIII)V")
	public static void method7202(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(9) float local9 = (float) Static349.anInt7463 / (float) Static349.anInt7466;
		@Pc(11) int local11 = arg1;
		@Pc(13) int local13 = arg2;
		if (local9 < 1.0F) {
			local13 = (int) ((float) arg1 * local9);
		} else {
			local11 = (int) ((float) arg2 / local9);
		}
		@Pc(40) int local40 = arg0 - (arg2 - local13) / 2;
		@Pc(49) int local49 = arg3 - (arg1 - local11) / 2;
		Static230.anInt3922 = -1;
		Static95.anInt1576 = local49 * Static349.anInt7466 / local11;
		Static387.anInt6906 = Static349.anInt7463 - Static349.anInt7463 * local40 / local13;
		Static331.anInt6297 = -1;
		Static155.method2279();
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(IBI)Z")
	public static boolean method7208(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static137.method2057(arg1, arg0) & Static392.method5806(arg0, arg1);
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(FFFIIIII)[F")
	public static float[] method7225(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(6) float[] local6 = new float[9];
		@Pc(9) float[] local9 = new float[9];
		@Pc(17) float local17 = (float) Math.cos((double) ((float) arg6 * 0.024543693F));
		@Pc(25) float local25 = (float) Math.sin((double) ((float) arg6 * 0.024543693F));
		local6[4] = 1.0F;
		local6[3] = 0.0F;
		local6[6] = -local25;
		local6[5] = 0.0F;
		local6[2] = local25;
		local6[0] = local17;
		local6[7] = 0.0F;
		local6[8] = local17;
		local6[1] = 0.0F;
		@Pc(71) float[] local71 = new float[9];
		@Pc(73) float local73 = 1.0F;
		@Pc(78) float local78 = (float) arg5 / 32767.0F;
		@Pc(80) float local80 = 0.0F;
		@Pc(85) float local85 = 1.0F - local78;
		@Pc(95) float local95 = -((float) Math.sqrt((double) (1.0F - local78 * local78)));
		@Pc(106) float local106 = (float) Math.sqrt((double) (arg3 * arg3 + arg4 * arg4));
		if (local106 == 0.0F && local78 == 0.0F) {
			local9 = local6;
		} else {
			if (local106 != 0.0F) {
				local73 = (float) -arg3 / local106;
				local80 = (float) arg4 / local106;
			}
			local71[8] = local78 + local85 * local80 * local80;
			local71[6] = local85 * local73 * local80;
			local71[1] = local80 * local95;
			local71[2] = local85 * local80 * local73;
			local71[5] = local95 * local73;
			local71[3] = local95 * -local80;
			local71[4] = local78;
			local71[7] = -local73 * local95;
			local71[0] = local73 * local73 * local85 + local78;
			local9[0] = local6[0] * local71[0] + local71[3] * local6[1] + local6[2] * local71[6];
			local9[1] = local71[4] * local6[1] + local6[0] * local71[1] + local71[7] * local6[2];
			local9[2] = local6[1] * local71[5] + local6[0] * local71[2] + local71[8] * local6[2];
			local9[3] = local6[4] * local71[3] + local6[3] * local71[0] + local6[5] * local71[6];
			local9[4] = local71[4] * local6[4] + local6[3] * local71[1] + local6[5] * local71[7];
			local9[6] = local71[6] * local6[8] + local6[6] * local71[0] + local71[3] * local6[7];
			local9[5] = local6[4] * local71[5] + local71[2] * local6[3] + local71[8] * local6[5];
			local9[7] = local71[1] * local6[6] + local71[4] * local6[7] + local71[7] * local6[8];
			local9[8] = local71[8] * local6[8] + local6[7] * local71[5] + local71[2] * local6[6];
		}
		local9[4] *= arg0;
		local9[3] *= arg0;
		local9[1] *= arg2;
		local9[6] *= arg1;
		local9[8] *= arg1;
		local9[2] *= arg2;
		local9[7] *= arg1;
		local9[5] *= arg0;
		local9[0] *= arg2;
		return local9;
	}
}
