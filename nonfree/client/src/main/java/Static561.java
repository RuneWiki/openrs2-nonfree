import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static561 {

	@OriginalMember(owner = "client!vn", name = "c", descriptor = "Z")
	public static boolean aBoolean225 = false;

	@OriginalMember(owner = "client!vn", name = "d", descriptor = "I")
	public static int anInt2703 = 100;

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(IIB)Z")
	public static boolean method2425(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static313.method4597(arg1, arg0) || Static227.method3537(arg1, arg0);
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(FIFI[BFFFLclient!vaa;IIIII)V")
	public static void method2426(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1, @OriginalArg(4) byte[] arg2, @OriginalArg(5) float arg3, @OriginalArg(6) float arg4, @OriginalArg(7) float arg5, @OriginalArg(8) Class182 arg6, @OriginalArg(10) int arg7, @OriginalArg(12) int arg8) {
		@Pc(12) float[] local12 = new float[16384];
		@Pc(44) int local44;
		@Pc(54) int local54;
		for (@Pc(14) int local14 = 0; local14 < 8; local14++) {
			arg6.method4207(0, arg4 / (float) 128, arg0 / (float) 128, local12, arg3 / (float) 16, arg5 * 127.0F, arg8);
			local44 = arg7;
			arg0 *= 2.0F;
			arg4 *= 2.0F;
			for (local54 = 0; local54 < 16384; local54++) {
				arg2[local44] = (byte) ((float) arg2[local44] + local12[local54]);
				local44++;
			}
			arg3 *= 2.0F;
			arg5 *= arg1;
		}
		local44 = arg7;
		for (local54 = 0; local54 < 16384; local54++) {
			arg2[local44] -= -127;
			local44++;
		}
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(ILjava/lang/String;I)I")
	public static int method2427(@OriginalArg(1) String arg0) {
		return Static57.method1007(arg0, 16);
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(B)[Lclient!wd;")
	public static Class358[] method2428() {
		return new Class358[] { Static15.aClass358_1, Static60.aClass358_5, Static494.aClass358_18, Static339.aClass358_11, Static94.aClass358_8, Static522.aClass358_20, Static346.aClass358_12, Static64.aClass358_6, Static336.aClass358_10, Static47.aClass358_21, Static443.aClass358_16, Static480.aClass358_17, Static31.aClass358_2, Static122.aClass358_9 };
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(II)Lclient!qg;")
	public static Class272 method2429(@OriginalArg(0) int arg0) {
		@Pc(15) Class272[] local15 = Static254.method3915();
		for (@Pc(17) int local17 = 0; local17 < local15.length; local17++) {
			@Pc(23) Class272 local23 = local15[local17];
			if (local23.anInt7257 == arg0) {
				return local23;
			}
		}
		return null;
	}
}
