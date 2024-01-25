import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static197 {

	@OriginalMember(owner = "client!gja", name = "h", descriptor = "Lclient!iga;")
	public static Class173 aClass173_32;

	@OriginalMember(owner = "client!gja", name = "l", descriptor = "Lclient!bu;")
	public static Class54 aClass54_35;

	@OriginalMember(owner = "client!gja", name = "b", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray73 = new String[100];

	@OriginalMember(owner = "client!gja", name = "b", descriptor = "(I)V")
	public static void method8873() {
		Static33.anInt568 = 200;
		Static253.anInt4356 = (int) ((double) Static544.anInt9261 * 34.46D);
		Static253.anInt4356 <<= 0x2;
		if (Static457.aClass57_11.method7719()) {
			Static253.anInt4356 += 512;
		}
		Static281.method4144(false);
	}

	@OriginalMember(owner = "client!gja", name = "a", descriptor = "(I)V")
	public static void method8875() {
		Static10.aBoolean18 = true;
	}

	@OriginalMember(owner = "client!gja", name = "a", descriptor = "(BLjava/lang/String;I)V")
	public static void method8876(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = Static116.anInt3318;
		@Pc(17) int[] local17 = Static88.anIntArray464;
		@Pc(19) boolean local19 = false;
		for (@Pc(21) int local21 = 0; local21 < local7; local21++) {
			@Pc(29) Class8_Sub1_Sub3_Sub2_Sub1 local29 = Static165.aClass8_Sub1_Sub3_Sub2_Sub1Array1[local17[local21]];
			if (local29 != null && local29 != Static68.aClass8_Sub1_Sub3_Sub2_Sub1_1 && local29.aString62 != null && local29.aString62.equalsIgnoreCase(arg0)) {
				@Pc(64) Class5_Sub50 local64;
				if (arg1 == 1) {
					local64 = Static457.method6722(Static499.aClass387_92, Static80.aClass313_1);
					local64.aClass5_Sub23_Sub2_2.method8504(0);
					local64.aClass5_Sub23_Sub2_2.method8480(local17[local21]);
					Static494.method7120(local64);
				} else if (arg1 == 4) {
					local64 = Static457.method6722(Static382.aClass387_112, Static80.aClass313_1);
					local64.aClass5_Sub23_Sub2_2.method8502(0);
					local64.aClass5_Sub23_Sub2_2.method8520(local17[local21]);
					Static494.method7120(local64);
				} else if (arg1 == 5) {
					local64 = Static457.method6722(Static106.aClass387_25, Static80.aClass313_1);
					local64.aClass5_Sub23_Sub2_2.method8492(local17[local21]);
					local64.aClass5_Sub23_Sub2_2.method8531(0);
					Static494.method7120(local64);
				} else if (arg1 == 6) {
					local64 = Static457.method6722(Static474.aClass387_85, Static80.aClass313_1);
					local64.aClass5_Sub23_Sub2_2.method8520(local17[local21]);
					local64.aClass5_Sub23_Sub2_2.method8502(0);
					Static494.method7120(local64);
				} else if (arg1 == 7) {
					local64 = Static457.method6722(Static258.aClass387_47, Static80.aClass313_1);
					local64.aClass5_Sub23_Sub2_2.method8520(local17[local21]);
					local64.aClass5_Sub23_Sub2_2.method8484(0);
					Static494.method7120(local64);
				} else if (arg1 == 9) {
					local64 = Static457.method6722(Static453.aClass387_81, Static80.aClass313_1);
					local64.aClass5_Sub23_Sub2_2.method8520(local17[local21]);
					local64.aClass5_Sub23_Sub2_2.method8502(0);
					Static494.method7120(local64);
				}
				local19 = true;
				break;
			}
		}
		if (!local19) {
			Static111.method1603(Static582.aClass335_22.method8349(Static323.anInt5795) + arg0);
		}
	}

	@OriginalMember(owner = "client!gja", name = "a", descriptor = "(IIILclient!lk;IIIILclient!vea;III)V")
	public static void method8879(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class219 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class368 arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		Static422.aClass219_9 = arg2;
		Static526.aClass173_28 = null;
		Static581.anInt9737 = arg5;
		Static622.aClass368_13 = arg7;
		Static609.anInt10104 = arg3;
		Static385.anInt6579 = arg10;
		Static27.anInt464 = arg1;
		Static155.anInt2441 = arg8;
		Static97.aClass173_4 = null;
		Static150.anInt2409 = arg6;
		Static30.anInt495 = arg0;
		Static618.anInt10170 = arg9;
		aClass173_32 = null;
		Static179.anInt2993 = arg4;
		Static431.method6358();
		Static634.aBoolean767 = true;
	}

	@OriginalMember(owner = "client!gja", name = "a", descriptor = "(BI)I")
	public static int method8882(@OriginalArg(1) int arg0) {
		@Pc(13) int local13 = 0;
		if (arg0 < 0 || arg0 >= 65536) {
			local13 += 16;
			arg0 >>>= 0x10;
		}
		if (arg0 >= 256) {
			arg0 >>>= 0x8;
			local13 += 8;
		}
		if (arg0 >= 16) {
			arg0 >>>= 0x4;
			local13 += 4;
		}
		if (arg0 >= 4) {
			arg0 >>>= 0x2;
			local13 += 2;
		}
		if (arg0 >= 1) {
			local13++;
			arg0 >>>= 0x1;
		}
		return arg0 + local13;
	}

	@OriginalMember(owner = "client!gja", name = "b", descriptor = "(II)V")
	public static void method8883(@OriginalArg(1) int arg0) {
		Static31.anInt506 = 3;
		Static496.anInt8292 = arg0;
		Static87.anInt1456 = -1;
		Static333.anInt5936 = 100;
	}
}
