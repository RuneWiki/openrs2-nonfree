import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static68 {

	@OriginalMember(owner = "client!db", name = "m", descriptor = "I")
	public static int anInt1553;

	@OriginalMember(owner = "client!db", name = "B", descriptor = "I")
	public static int anInt1560;

	@OriginalMember(owner = "client!db", name = "t", descriptor = "I")
	public static int anInt1555 = 2;

	@OriginalMember(owner = "client!db", name = "w", descriptor = "I")
	public static final int anInt1557 = -1;

	@OriginalMember(owner = "client!db", name = "z", descriptor = "Lclient!ob;")
	public static final Class179 aClass179_12 = new Class179(78, -1);

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(Lclient!ya;Z)V")
	public static void method1378(@OriginalArg(0) Class39 arg0) {
		@Pc(7) int local7 = Static280.anInt4913;
		@Pc(9) int local9 = Static315.anInt5432;
		@Pc(11) int local11 = Static270.anInt4802;
		@Pc(13) int local13 = Static389.anInt6274;
		arg0.method4563(local9, -10660793, local11, local7, local13);
		arg0.method4563(local9 + 1, -16777216, local11 - 2, local7 + 1, 16);
		arg0.method4499(-16777216, local7 + 1, local11 + -2, local9 + 18, local13 + -19);
		Static178.aClass71_5.method5454(local7 + 3, -1, -10660793, local9 + 14, Static39.aClass7_17.method331(Static341.anInt5770));
		@Pc(72) int local72 = Static125.aClass114_1.method2701();
		@Pc(76) int local76 = Static125.aClass114_1.method2698();
		@Pc(78) int local78 = 0;
		for (@Pc(87) Class1_Sub3 local87 = (Class1_Sub3) Static55.aClass181_63.method4112(); local87 != null; local87 = (Class1_Sub3) Static55.aClass181_63.method4104()) {
			@Pc(102) int local102 = (Static217.anInt4004 - local78 - 1) * 16 + local9 + 31;
			@Pc(104) short local104 = -1;
			if (local72 > local7 && local72 < local11 + local7 && local102 - 13 < local76 && local102 + 3 > local76 && local87.aBoolean5) {
				local104 = -256;
			}
			@Pc(137) int[] local137 = null;
			if (Static423.method5615(local87.anInt117)) {
				local137 = Static165.aClass19_1.method560((int) local87.aLong10).anIntArray340;
			} else if (local87.anInt120 != -1) {
				local137 = Static165.aClass19_1.method560(local87.anInt120).anIntArray340;
			} else if (Static112.method2066(local87.anInt117)) {
				@Pc(166) Class31_Sub2_Sub1_Sub2 local166 = Static98.aClass31_Sub2_Sub1_Sub2Array1[(int) local87.aLong10];
				if (local166 != null) {
					@Pc(171) Class53 local171 = local166.aClass53_1;
					if (local171.anIntArray131 != null) {
						local171 = local171.method1508(Static394.aClass23_1);
					}
					if (local171 != null) {
						local137 = local171.anIntArray132;
					}
				}
			} else if (Static262.method3883(local87.anInt117)) {
				@Pc(205) Class129 local205;
				if (local87.anInt117 == 1004) {
					local205 = Static349.aClass115_4.method2766((int) local87.aLong10);
				} else {
					local205 = Static349.aClass115_4.method2766((int) (local87.aLong10 >>> 32 & 0x7FFFFFFFL));
				}
				if (local205.anIntArray310 != null) {
					local205 = local205.method3031(Static394.aClass23_1);
				}
				if (local205 != null) {
					local137 = local205.anIntArray308;
				}
			}
			@Pc(243) String local243 = Static74.method1493(local87);
			if (local137 != null) {
				local243 = local243 + Static254.method3806(local137);
			}
			Static178.aClass71_5.method5453(Static212.aClass143Array6, Static134.anIntArray208, local7 + 3, local104, local243, local102);
			if (local87.aBoolean6) {
				Static57.aClass143_9.method5723(Static3.aClass151_6.method3475(local243) + local7 + 5, local102 + -12);
			}
			local78++;
		}
		Static433.method5752(Static315.anInt5432, Static389.anInt6274, Static270.anInt4802, Static280.anInt4913);
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(II[Ljava/lang/Object;I[J)V")
	public static void method1380(@OriginalArg(0) int arg0, @OriginalArg(2) Object[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) long[] arg3) {
		if (arg2 <= arg0) {
			return;
		}
		@Pc(14) int local14 = (arg0 + arg2) / 2;
		@Pc(16) int local16 = arg0;
		@Pc(20) long local20 = arg3[local14];
		arg3[local14] = arg3[arg2];
		arg3[arg2] = local20;
		@Pc(34) Object local34 = arg1[local14];
		arg1[local14] = arg1[arg2];
		arg1[arg2] = local34;
		@Pc(54) int local54 = ~local20 == Long.MIN_VALUE ? 0 : 1;
		for (@Pc(56) int local56 = arg0; local56 < arg2; local56++) {
			if (arg3[local56] < local20 + (long) (local54 & local56)) {
				@Pc(78) long local78 = arg3[local56];
				arg3[local56] = arg3[local16];
				arg3[local16] = local78;
				@Pc(92) Object local92 = arg1[local56];
				arg1[local56] = arg1[local16];
				arg1[local16++] = local92;
			}
		}
		arg3[arg2] = arg3[local16];
		arg3[local16] = local20;
		arg1[arg2] = arg1[local16];
		arg1[local16] = local34;
		method1380(arg0, arg1, local16 - 1, arg3);
		method1380(local16 + 1, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!db", name = "g", descriptor = "(I)V")
	public static void method1381() {
		Static239.method3613();
	}
}
