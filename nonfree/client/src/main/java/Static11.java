import java.awt.Canvas;
import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static11 {

	@OriginalMember(owner = "client!ah", name = "F", descriptor = "I")
	public static int anInt173;

	@OriginalMember(owner = "client!ah", name = "A", descriptor = "I")
	public static int anInt179 = 1;

	@OriginalMember(owner = "client!ah", name = "h", descriptor = "(I)V")
	public static void method234() {
		@Pc(8) Class14_Sub21_Sub2 local8 = Static277.aClass347_2.aClass14_Sub21_Sub2_1;
		local8.method7766();
		@Pc(16) int local16 = local8.method7764(8);
		@Pc(25) int local25;
		if (local16 < Static662.anInt10795) {
			for (local25 = local16; local25 < Static662.anInt10795; local25++) {
				Static575.anIntArray496[Static24.anInt329++] = Static253.anIntArray241[local25];
			}
		}
		if (local16 > Static662.anInt10795) {
			throw new RuntimeException("gnpov1");
		}
		Static662.anInt10795 = 0;
		for (local25 = 0; local25 < local16; local25++) {
			@Pc(77) int local77 = Static253.anIntArray241[local25];
			@Pc(85) Class4_Sub3_Sub3_Sub3_Sub1 local85 = ((Class14_Sub44) Static100.aClass125_9.method2630((long) local77)).aClass4_Sub3_Sub3_Sub3_Sub1_2;
			@Pc(90) int local90 = local8.method7764(1);
			if (local90 == 0) {
				Static253.anIntArray241[Static662.anInt10795++] = local77;
				local85.anInt3285 = Static522.anInt8991;
			} else {
				@Pc(112) int local112 = local8.method7764(2);
				if (local112 == 0) {
					Static253.anIntArray241[Static662.anInt10795++] = local77;
					local85.anInt3285 = Static522.anInt8991;
					Static551.anIntArray477[Static185.anInt3047++] = local77;
				} else {
					@Pc(160) int local160;
					@Pc(170) int local170;
					if (local112 == 1) {
						Static253.anIntArray241[Static662.anInt10795++] = local77;
						local85.anInt3285 = Static522.anInt8991;
						local160 = local8.method7764(3);
						local85.method2570(1, local160);
						local170 = local8.method7764(1);
						if (local170 == 1) {
							Static551.anIntArray477[Static185.anInt3047++] = local77;
						}
					} else if (local112 == 2) {
						Static253.anIntArray241[Static662.anInt10795++] = local77;
						local85.anInt3285 = Static522.anInt8991;
						if (local8.method7764(1) == 1) {
							local160 = local8.method7764(3);
							local85.method2570(2, local160);
							local170 = local8.method7764(3);
							local85.method2570(2, local170);
						} else {
							local160 = local8.method7764(3);
							local85.method2570(0, local160);
						}
						local160 = local8.method7764(1);
						if (local160 == 1) {
							Static551.anIntArray477[Static185.anInt3047++] = local77;
						}
					} else if (local112 == 3) {
						Static575.anIntArray496[Static24.anInt329++] = local77;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "([IIII[F[II[FIIIII)V")
	public static void method235(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) float[] arg3, @OriginalArg(5) int[] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) float[] arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11) {
		@Pc(17) int local17 = arg11 + arg9 * arg2;
		@Pc(24) int local24 = arg7 * arg10 + arg1;
		@Pc(29) int local29 = arg2 - arg8;
		@Pc(33) int local33 = arg10 - arg8;
		@Pc(37) int local37;
		@Pc(43) int local43;
		if (arg0 == null) {
			for (local37 = 0; local37 < arg5; local37++) {
				local43 = arg8 + local17;
				while (local43 > local17) {
					arg3[local24++] = arg6[local17++];
				}
				local24 += local33;
				local17 += local29;
			}
		} else if (arg6 == null) {
			for (local37 = 0; local37 < arg5; local37++) {
				local43 = local17 + arg8;
				while (local43 > local17) {
					arg4[local24++] = arg0[local17++];
				}
				local24 += local33;
				local17 += local29;
			}
		} else {
			for (local37 = 0; local37 < arg5; local37++) {
				local43 = arg8 + local17;
				while (local43 > local17) {
					arg4[local24] = arg0[local17];
					arg3[local24++] = arg6[local17++];
				}
				local24 += local33;
				local17 += local29;
			}
		}
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(IZILjava/lang/String;)V")
	public static void method236(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) String arg2) {
		Static320.method5048();
		Static483.method7288();
		Static522.method7762();
		Static602.method8507(arg1, arg0, arg2);
		Static349.method5330();
		Static86.method1436(Static103.aClass144_3);
		Static544.method8201(Static103.aClass144_3);
		Static202.method3018(Static103.aClass144_3, Static99.aClass310_23);
		Static249.method4223();
		Static326.method5101(Static610.aClass45Array31);
		Static438.method6532();
		Static38.method661();
		if (Static387.anInt9114 == 3) {
			Static160.method2323(4);
		} else if (Static387.anInt9114 == 7) {
			Static160.method2323(8);
		} else if (Static387.anInt9114 == 9) {
			Static160.method2323(10);
		} else if (Static387.anInt9114 == 11) {
			Static160.method2323(12);
		} else if (Static387.anInt9114 == 1 || Static387.anInt9114 == 2) {
			Static165.method2379();
		}
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(Ljava/awt/Canvas;ILclient!d;Lclient!rg;II)Lclient!ha;")
	public static Class144 method237(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Interface4 arg2, @OriginalArg(3) Class310 arg3, @OriginalArg(4) int arg4) {
		@Pc(5) int local5 = 0;
		@Pc(7) int local7 = 0;
		if (arg0 != null) {
			@Pc(12) Dimension local12 = arg0.getSize();
			local5 = local12.width;
			local7 = local12.height;
		}
		return Static208.method6919(arg1, arg4, arg3, local5, local7, arg2, arg0);
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(IZ)I")
	public static int method238(@OriginalArg(0) int arg0) {
		return arg0 & 0xFF;
	}
}
