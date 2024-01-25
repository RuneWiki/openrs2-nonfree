import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static159 {

	@OriginalMember(owner = "client!hn", name = "v", descriptor = "[I")
	public static int[] anIntArray151;

	@OriginalMember(owner = "client!hn", name = "z", descriptor = "Lclient!pn;")
	public static final Class194 aClass194_41 = new Class194(14, 3);

	@OriginalMember(owner = "client!hn", name = "I", descriptor = "Z")
	public static boolean aBoolean178 = true;

	@OriginalMember(owner = "client!hn", name = "Q", descriptor = "[[I")
	public static final int[][] anIntArrayArray16 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 4, 6 }, { 0, 2, 4 }, { 4, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 4, 7, 6 }, { 4, 7, 6, 0 }, { 0, 8, 6, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 4, 6, 10, 0 }, { 2, 4, 6, 0 } };

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(IB[JI[Ljava/lang/Object;)V")
	public static void method2244(@OriginalArg(0) int arg0, @OriginalArg(2) long[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Object[] arg3) {
		if (arg2 <= arg0) {
			return;
		}
		@Pc(19) int local19 = (arg2 + arg0) / 2;
		@Pc(21) int local21 = arg0;
		@Pc(25) long local25 = arg1[local19];
		arg1[local19] = arg1[arg2];
		arg1[arg2] = local25;
		@Pc(39) Object local39 = arg3[local19];
		arg3[local19] = arg3[arg2];
		arg3[arg2] = local39;
		@Pc(57) int local57 = local25 == Long.MAX_VALUE ? 0 : 1;
		for (@Pc(59) int local59 = arg0; local59 < arg2; local59++) {
			if (arg1[local59] < local25 + (long) (local59 & local57)) {
				@Pc(81) long local81 = arg1[local59];
				arg1[local59] = arg1[local21];
				arg1[local21] = local81;
				@Pc(95) Object local95 = arg3[local59];
				arg3[local59] = arg3[local21];
				arg3[local21++] = local95;
			}
		}
		arg1[arg2] = arg1[local21];
		arg1[local21] = local25;
		arg3[arg2] = arg3[local21];
		arg3[local21] = local39;
		method2244(arg0, arg1, local21 - 1, arg3);
		method2244(local21 + 1, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(IIBIIIZII)Z")
	public static boolean method2246(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(8) int local8 = Static220.aClass2_Sub1_Sub3_Sub2_1.anIntArray434[0];
		@Pc(13) int local13 = Static220.aClass2_Sub1_Sub3_Sub2_1.anIntArray433[0];
		if (local8 < 0 || Static433.anInt7210 <= local8 || local13 < 0 || local13 >= Static418.anInt6969) {
			return false;
		} else if (arg3 >= 0 && Static433.anInt7210 > arg3 && arg6 >= 0 && arg6 < Static418.anInt6969) {
			@Pc(78) int local78 = Static351.method4563(arg0, local13, arg3, arg6, Static41.anIntArray36, local8, arg7, arg4, arg5, arg2, arg1, Static163.aClass240Array1[Static220.aClass2_Sub1_Sub3_Sub2_1.aByte105], Static433.anIntArray487, Static220.aClass2_Sub1_Sub3_Sub2_1.method4913());
			if (local78 < 1) {
				return false;
			}
			Static453.anInt6195 = Static433.anIntArray487[local78 - 1];
			Static209.anInt3498 = Static41.anIntArray36[local78 - 1];
			Static375.aBoolean416 = false;
			Static143.method2068();
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!hn", name = "c", descriptor = "(I)V")
	public static void method2247() {
		Static104.aClass117_2.method2466();
		Static179.aClass116_3.method2455();
		Static391.aClass120_2.method2535();
		Static398.aClass256_4.method5783();
		Static196.aClass180_1.method3716();
		Static306.aClass67_3.method1447();
		Static271.aClass219_4.method4749();
		Static3.aClass203_1.method4365();
		Static275.aClass254_1.method5701();
		Static309.aClass46_1.method1075();
		Static27.aClass149_1.method3041();
		Static203.aClass51_4.method1142();
		Static404.aClass28_4.method671();
		Static237.aClass249_4.method5646();
		Static1.aClass33_3.method792();
		Static42.aClass235_1.method5356();
		Static420.aClass175_2.method3557();
		Static227.aClass265_1.method5914();
		Static272.aClass171_2.method3453();
		Static294.aClass58_1.method1320();
		Static8.method149();
		Static32.method547();
		Static228.method2998();
		if (Static289.aClass170_8 != Static350.aClass170_10) {
			for (@Pc(76) int local76 = 0; local76 < Static165.aByteArrayArray8.length; local76++) {
				Static165.aByteArrayArray8[local76] = null;
			}
			Static63.anInt1197 = 0;
		}
		Static457.method5989();
		Static419.method5519();
		Static462.method6051();
		Static225.method2955();
		Static251.method3221();
		Static181.aClass44_30.method1031();
		Static407.aClass200_9.method5883();
		Static347.aClass261_3.method5896();
		Static352.method4976();
		Static242.aClass243_133.method5452();
		Static297.aClass243_162.method5452();
		Static322.aClass243_181.method5452();
		Static324.aClass243_183.method5452();
		Static318.aClass243_176.method5452();
		Static71.aClass243_255.method5452();
		Static451.aClass243_252.method5452();
		Static265.aClass243_145.method5452();
		Static344.aClass243_196.method5452();
		Static191.aClass243_108.method5452();
		Static110.aClass243_64.method5452();
		Static183.aClass243_101.method5452();
		Static29.aClass243_24.method5452();
		Static281.aClass243_250.method5452();
		Static448.aClass243_248.method5452();
		Static107.aClass243_62.method5452();
		Static136.aClass243_256.method5452();
		Static373.aClass243_217.method5452();
		Static415.aClass243_237.method5452();
		Static125.aClass243_70.method5452();
		Static204.aClass243_115.method5452();
		Static5.aClass243_4.method5452();
		Static183.aClass243_102.method5452();
		Static129.aClass243_72.method5452();
		Static366.aClass243_209.method5452();
		Static353.aClass243_201.method5452();
		Static228.aClass243_124.method5452();
		Static291.aClass243_159.method5452();
		Static125.aClass243_69.method5452();
		Static73.aClass243_45.method5452();
		Static60.aClass44_7.method1031();
		Static129.aClass44_22.method1031();
		Static92.aClass44_16.method1031();
		Static117.aClass44_67.method1031();
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(ZLjava/lang/String;)J")
	public static long method2249(@OriginalArg(1) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(15) long local15 = 0L;
		for (@Pc(17) int local17 = 0; local17 < local8; local17++) {
			local15 = (long) arg0.charAt(local17) + (local15 << 5) - local15;
		}
		return local15;
	}
}
