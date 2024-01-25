import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static428 {

	@OriginalMember(owner = "client!saa", name = "a", descriptor = "([I[I[IBLclient!ks;)V")
	public static void method2375(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(4) Class47_Sub2_Sub3_Sub2 arg3) {
		for (@Pc(5) int local5 = 0; local5 < arg2.length; local5++) {
			@Pc(10) int local10 = arg2[local5];
			@Pc(14) int local14 = arg1[local5];
			@Pc(18) int local18 = arg0[local5];
			@Pc(20) int local20 = 0;
			while (local14 != 0 && local20 < arg3.aClass8Array3.length) {
				if ((local14 & 0x1) != 0) {
					if (local10 == -1) {
						arg3.aClass8Array3[local20] = null;
					} else {
						@Pc(34) Class280 local34 = Static6.aClass126_1.method3574(local10);
						@Pc(37) int local37 = local34.anInt8110;
						@Pc(42) Class8 local42 = arg3.aClass8Array3[local20];
						if (local42 != null) {
							if (local10 == local42.anInt127) {
								if (local37 == 0) {
									local42 = arg3.aClass8Array3[local20] = null;
								} else if (local37 == 1) {
									local42.anInt123 = local18;
									local42.anInt121 = 1;
									local42.anInt125 = 0;
									local42.anInt124 = 0;
									local42.anInt129 = 0;
									Static351.method5589(arg3.anInt8189, local34, Static16.aClass47_Sub2_Sub3_Sub2_1 == arg3, arg3.aByte94, arg3.anInt8191, 0);
								} else if (local37 == 2) {
									local42.anInt125 = 0;
								}
							} else if (local34.anInt8103 >= Static6.aClass126_1.method3574(local42.anInt127).anInt8103) {
								local42 = arg3.aClass8Array3[local20] = null;
							}
						}
						if (local42 == null) {
							local42 = arg3.aClass8Array3[local20] = new Class8();
							local42.anInt127 = local10;
							local42.anInt121 = 1;
							local42.anInt125 = 0;
							local42.anInt129 = 0;
							local42.anInt123 = local18;
							local42.anInt124 = 0;
							Static351.method5589(arg3.anInt8189, local34, Static16.aClass47_Sub2_Sub3_Sub2_1 == arg3, arg3.aByte94, arg3.anInt8191, 0);
						}
					}
				}
				local20++;
				local14 >>>= 0x1;
			}
		}
	}

	@OriginalMember(owner = "client!saa", name = "a", descriptor = "(IIIBI[B[BII)V")
	public static void method2376(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) byte[] arg4, @OriginalArg(6) byte[] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(16) int local16 = -(arg3 >> 2);
		@Pc(21) int local21 = -(arg3 & 0x3);
		for (@Pc(24) int local24 = -arg7; local24 < 0; local24++) {
			@Pc(30) int local30;
			for (@Pc(27) int local27 = local16; local27 < 0; local27++) {
				local30 = arg6++;
				arg4[local30] += arg5[arg0++];
				@Pc(42) int local42 = arg6++;
				arg4[local42] += arg5[arg0++];
				@Pc(54) int local54 = arg6++;
				arg4[local54] += arg5[arg0++];
				@Pc(66) int local66 = arg6++;
				arg4[local66] += arg5[arg0++];
			}
			for (@Pc(81) int local81 = local21; local81 < 0; local81++) {
				local30 = arg6++;
				arg4[local30] += arg5[arg0++];
			}
			arg0 += arg1;
			arg6 += arg2;
		}
	}

	@OriginalMember(owner = "client!saa", name = "a", descriptor = "(ZLclient!gw;)V")
	public static void method2377(@OriginalArg(1) Class1_Sub13 arg0) {
		@Pc(7) int local7 = arg0.method3066();
		Static126.aClass195Array1 = new Class195[local7];
		for (@Pc(12) int local12 = 0; local12 < local7; local12++) {
			Static126.aClass195Array1[local12] = new Class195();
			Static126.aClass195Array1[local12].anInt5885 = arg0.method3066();
			Static126.aClass195Array1[local12].aString58 = arg0.method3050();
		}
		Static503.anInt8544 = arg0.method3066();
		Static137.anInt3222 = arg0.method3066();
		Static265.anInt5151 = arg0.method3066();
		Static437.aClass50_Sub1Array1 = new Class50_Sub1[Static137.anInt3222 + 1 - Static503.anInt8544];
		for (@Pc(75) int local75 = 0; local75 < Static265.anInt5151; local75++) {
			@Pc(80) int local80 = arg0.method3066();
			@Pc(88) Class50_Sub1 local88 = Static437.aClass50_Sub1Array1[local80] = new Class50_Sub1();
			local88.anInt1976 = arg0.method3043();
			local88.anInt1985 = arg0.method3037();
			local88.anInt1988 = local80 + Static503.anInt8544;
			local88.aString12 = arg0.method3050();
			local88.aString11 = arg0.method3050();
		}
		Static78.anInt2082 = arg0.method3037();
		Static416.aBoolean479 = true;
	}
}
