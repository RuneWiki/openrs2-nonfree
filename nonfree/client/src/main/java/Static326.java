import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static326 {

	@OriginalMember(owner = "client!pq", name = "f", descriptor = "[I")
	public static final int[] anIntArray374 = new int[8];

	@OriginalMember(owner = "client!pq", name = "o", descriptor = "Lclient!jp;")
	public static final Class129 aClass129_138 = new Class129(80, -2);

	@OriginalMember(owner = "client!pq", name = "w", descriptor = "Lclient!jp;")
	public static final Class129 aClass129_139 = new Class129(43, 7);

	@OriginalMember(owner = "client!pq", name = "b", descriptor = "(I)V")
	public static void method4002() {
		Static104.aClass117_2.method2467();
		Static179.aClass116_3.method2457();
		Static391.aClass120_2.method2538();
		Static398.aClass256_4.method5777();
		Static196.aClass180_1.method3712();
		Static306.aClass67_3.method1453();
		Static271.aClass219_4.method4753();
		Static3.aClass203_1.method4362();
		Static275.aClass254_1.method5704();
		Static309.aClass46_1.method1078();
		Static27.aClass149_1.method3044();
		Static203.aClass51_4.method1141();
		Static404.aClass28_4.method673();
		Static237.aClass249_4.method5645();
		Static1.aClass33_3.method793();
		Static42.aClass235_1.method5353();
		Static420.aClass175_2.method3552();
		Static227.aClass265_1.method5916();
		Static272.aClass171_2.method3457();
		Static294.aClass58_1.method1322();
		Static223.method2949();
		Static322.method3972();
		Static60.method955();
		Static22.method377();
		Static60.aClass44_7.method1024();
		Static129.aClass44_22.method1024();
		Static92.aClass44_16.method1024();
		Static117.aClass44_67.method1024();
		Static181.aClass44_30.method1024();
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(II)V")
	public static void method4003(@OriginalArg(1) int arg0) {
		if (arg0 != -1 && Static371.aBooleanArray22[arg0]) {
			Static149.aClass243_88.method5468(arg0);
			Static34.aClass76ArrayArray1[arg0] = null;
			Static184.aClass76ArrayArray2[arg0] = null;
			Static371.aBooleanArray22[arg0] = false;
		}
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(ZIIIZIZ)V")
	public static void method4004(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		if (arg3 >= arg1) {
			return;
		}
		@Pc(16) int local16 = (arg1 + arg3) / 2;
		@Pc(18) int local18 = arg3;
		@Pc(22) Class50_Sub1 local22 = Static79.aClass50_Sub1Array1[local16];
		Static79.aClass50_Sub1Array1[local16] = Static79.aClass50_Sub1Array1[arg1];
		Static79.aClass50_Sub1Array1[arg1] = local22;
		for (@Pc(34) int local34 = arg3; local34 < arg1; local34++) {
			if (Static431.method5698(local22, arg5, arg4, Static79.aClass50_Sub1Array1[local34], arg2, arg0) <= 0) {
				@Pc(51) Class50_Sub1 local51 = Static79.aClass50_Sub1Array1[local34];
				Static79.aClass50_Sub1Array1[local34] = Static79.aClass50_Sub1Array1[local18];
				Static79.aClass50_Sub1Array1[local18++] = local51;
			}
		}
		Static79.aClass50_Sub1Array1[arg1] = Static79.aClass50_Sub1Array1[local18];
		Static79.aClass50_Sub1Array1[local18] = local22;
		method4004(arg0, local18 - 1, arg2, arg3, arg4, arg5);
		method4004(arg0, arg1, arg2, local18 + 1, arg4, arg5);
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(IJ)V")
	public static void method4006(@OriginalArg(1) long arg0) {
		@Pc(18) int local18 = Static417.anInt6956 + Static220.aClass2_Sub1_Sub3_Sub2_1.anInt7500;
		@Pc(23) int local23 = Static220.aClass2_Sub1_Sub3_Sub2_1.anInt7502 + Static288.anInt4500;
		if (Static300.anInt4681 - local18 < -500 || Static300.anInt4681 - local18 > 500 || Static45.anInt41 - local23 < -500 || Static45.anInt41 - local23 > 500) {
			Static45.anInt41 = local23;
			Static300.anInt4681 = local18;
		}
		@Pc(63) int local63;
		@Pc(71) int local71;
		if (Static300.anInt4681 != local18) {
			local63 = local18 - Static300.anInt4681;
			local71 = (int) (arg0 * (long) local63 / 320L);
			if (local63 <= 0) {
				if (local71 == 0) {
					local71 = -1;
				} else if (local71 < local63) {
					local71 = local63;
				}
			} else if (local71 == 0) {
				local71 = 1;
			} else if (local71 > local63) {
				local71 = local63;
			}
			Static300.anInt4681 += local71;
		}
		if (Static45.anInt41 != local23) {
			local63 = local23 - Static45.anInt41;
			local71 = (int) ((long) local63 * arg0 / 320L);
			if (local63 <= 0) {
				if (local71 == 0) {
					local71 = -1;
				} else if (local63 > local71) {
					local71 = local63;
				}
			} else if (local71 == 0) {
				local71 = 1;
			} else if (local71 > local63) {
				local71 = local63;
			}
			Static45.anInt41 += local71;
		}
		if (!Static216.aClass1_Sub1_1.aBoolean297) {
			Static99.aFloat33 += Static405.aFloat177 * (float) arg0 / 6.0F;
			Static10.aFloat7 += (float) arg0 * Static346.aFloat136 / 6.0F;
		}
		Static135.method1952();
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(III)I")
	public static int method4008(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = 0;
		while (arg0 > 0) {
			local12 = local12 << 1 | arg1 & 0x1;
			arg0--;
			arg1 >>>= 0x1;
		}
		return local12;
	}
}
