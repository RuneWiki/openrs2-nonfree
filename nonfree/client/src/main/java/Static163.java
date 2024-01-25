import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static163 {

	@OriginalMember(owner = "client!ib", name = "n", descriptor = "Lclient!cm;")
	public static final Class36 aClass36_67 = new Class36(22, -1);

	@OriginalMember(owner = "client!ib", name = "p", descriptor = "[[I")
	public static final int[][] anIntArrayArray30 = new int[][] { { 0, 2 }, { 0, 2 }, { 0, 0, 2 }, { 2, 0, 0 }, { 0, 2, 0 }, { 0, 0, 2 }, { 0, 5, 1, 4 }, { 0, 4, 4, 4 }, { 4, 4, 4, 0 }, { 6, 6, 6, 2, 2, 2 }, { 2, 2, 2, 6, 6, 6 }, { 0, 11, 6, 6, 6, 4 }, { 0, 2 }, { 0, 4, 4, 4 }, { 0, 4, 4, 4 } };

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(I[S[Ljava/lang/String;II)V")
	public static void method2389(@OriginalArg(0) int arg0, @OriginalArg(1) short[] arg1, @OriginalArg(2) String[] arg2, @OriginalArg(4) int arg3) {
		if (arg0 >= arg3) {
			return;
		}
		@Pc(15) int local15 = (arg0 + arg3) / 2;
		@Pc(17) int local17 = arg0;
		@Pc(21) String local21 = arg2[local15];
		arg2[local15] = arg2[arg3];
		arg2[arg3] = local21;
		@Pc(35) short local35 = arg1[local15];
		arg1[local15] = arg1[arg3];
		arg1[arg3] = local35;
		for (@Pc(47) int local47 = arg0; local47 < arg3; local47++) {
			if (local21 == null || arg2[local47] != null && (local47 & 0x1) > arg2[local47].compareTo(local21)) {
				@Pc(68) String local68 = arg2[local47];
				arg2[local47] = arg2[local17];
				arg2[local17] = local68;
				@Pc(82) short local82 = arg1[local47];
				arg1[local47] = arg1[local17];
				arg1[local17++] = local82;
			}
		}
		arg2[arg3] = arg2[local17];
		arg2[local17] = local21;
		arg1[arg3] = arg1[local17];
		arg1[local17] = local35;
		method2389(arg0, arg1, arg2, local17 - 1);
		method2389(local17 + 1, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(III)V")
	public static void method2390(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class4_Sub1_Sub8 local8 = Static416.method5456(arg1, 16);
		local8.method2762();
		local8.anInt3611 = arg0;
	}

	@OriginalMember(owner = "client!ib", name = "c", descriptor = "(B)I")
	public static int method2391() {
		return 2;
	}

	@OriginalMember(owner = "client!ib", name = "b", descriptor = "(I)V")
	public static void method2392() {
		Static323.anInt5755 = Static349.aClass4_Sub30_Sub1_2.method4829();
		@Pc(20) int local20 = Static349.aClass4_Sub30_Sub1_2.method4882();
		@Pc(24) int local24 = Static349.aClass4_Sub30_Sub1_2.method4877();
		@Pc(35) boolean local35 = Static349.aClass4_Sub30_Sub1_2.method4864() == 1;
		@Pc(39) int local39 = Static349.aClass4_Sub30_Sub1_2.method4877();
		Static310.method4278(local20);
		Static349.aClass4_Sub30_Sub1_2.method3917();
		@Pc(51) int local51;
		@Pc(55) int local55;
		@Pc(62) int local62;
		for (@Pc(47) int local47 = 0; local47 < 4; local47++) {
			for (local51 = 0; local51 < Static126.anInt2569 >> 3; local51++) {
				for (local55 = 0; local55 < Static190.anInt3697 >> 3; local55++) {
					local62 = Static349.aClass4_Sub30_Sub1_2.method3924(1);
					if (local62 == 1) {
						Static4.anIntArrayArrayArray1[local47][local51][local55] = Static349.aClass4_Sub30_Sub1_2.method3924(26);
					} else {
						Static4.anIntArrayArrayArray1[local47][local51][local55] = -1;
					}
				}
			}
		}
		Static349.aClass4_Sub30_Sub1_2.method3925();
		local51 = (Static106.anInt2242 - Static349.aClass4_Sub30_Sub1_2.anInt6244) / 16;
		Static205.anIntArrayArray33 = new int[local51][4];
		for (local55 = 0; local55 < local51; local55++) {
			for (local62 = 0; local62 < 4; local62++) {
				Static205.anIntArrayArray33[local55][local62] = Static349.aClass4_Sub30_Sub1_2.method4872();
			}
		}
		Static196.aByteArrayArray6 = new byte[local51][];
		Static70.anIntArray647 = new int[local51];
		Static80.anIntArray115 = new int[local51];
		Static100.anIntArray134 = new int[local51];
		Static310.anIntArray475 = new int[local51];
		Static66.anIntArray102 = new int[local51];
		Static389.anIntArray592 = null;
		Static104.aByteArrayArray1 = new byte[local51][];
		Static288.aByteArrayArray13 = null;
		Static325.aByteArrayArray16 = new byte[local51][];
		Static435.aByteArrayArray20 = new byte[local51][];
		local51 = 0;
		for (local62 = 0; local62 < 4; local62++) {
			for (@Pc(188) int local188 = 0; local188 < Static126.anInt2569 >> 3; local188++) {
				for (@Pc(192) int local192 = 0; local192 < Static190.anInt3697 >> 3; local192++) {
					@Pc(202) int local202 = Static4.anIntArrayArrayArray1[local62][local188][local192];
					if (local202 != -1) {
						@Pc(211) int local211 = local202 >> 14 & 0x3FF;
						@Pc(217) int local217 = local202 >> 3 & 0x7FF;
						@Pc(227) int local227 = local217 / 8 + (local211 / 8 << 8);
						for (@Pc(229) int local229 = 0; local229 < local51; local229++) {
							if (Static100.anIntArray134[local229] == local227) {
								local227 = -1;
								break;
							}
						}
						if (local227 != -1) {
							Static100.anIntArray134[local51] = local227;
							@Pc(258) int local258 = local227 >> 8 & 0xFF;
							@Pc(262) int local262 = local227 & 0xFF;
							Static70.anIntArray647[local51] = Static193.aClass166_291.method3698("m" + local258 + "_" + local262);
							Static66.anIntArray102[local51] = Static193.aClass166_291.method3698("l" + local258 + "_" + local262);
							Static310.anIntArray475[local51] = Static193.aClass166_291.method3698("um" + local258 + "_" + local262);
							Static80.anIntArray115[local51] = Static193.aClass166_291.method3698("ul" + local258 + "_" + local262);
							local51++;
						}
					}
				}
			}
		}
		Static5.method158(local24, false, local35, local39);
	}
}
