import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static212 {

	@OriginalMember(owner = "client!hia", name = "a", descriptor = "(IZ)V")
	public static void method3537(@OriginalArg(1) boolean arg0) {
		if (arg0 && Static371.aClass2_Sub7_Sub3_3 != null) {
			Static242.anInt4691 = Static371.aClass2_Sub7_Sub3_3.anInt2691;
		} else {
			Static242.anInt4691 = -1;
		}
		Static60.anInt1449 = 0;
		Static422.aClass303_15 = null;
		Static371.aClass2_Sub7_Sub3_3 = null;
		Static435.aClass114_38 = null;
		Static371.method7980();
		Static371.aClass114_54.method2768();
		Static371.aClass129_5 = null;
		Static630.aClass63_8 = null;
		Static546.aClass63_5 = null;
		Static285.anInt5179 = -1;
		Static562.aClass63_6 = null;
		Static594.aClass63_7 = null;
		Static15.aClass63_1 = null;
		Static418.aClass63_3 = null;
		Static517.aClass63_4 = null;
		Static125.aClass63_2 = null;
		Static432.aClass31_24 = null;
		Static280.anInt5122 = -1;
		if (Static371.aClass336_4 != null) {
			Static371.aClass336_4.method7856();
			Static371.aClass336_4.method7850(64, 128);
		}
		if (Static371.aClass79_4 != null) {
			Static371.aClass79_4.method1970(64, 64);
		}
		if (Static371.aClass304_4 != null) {
			Static371.aClass304_4.method6957(64);
		}
		Static502.aClass199_2.method4581(64);
	}

	@OriginalMember(owner = "client!hia", name = "a", descriptor = "(IIBLclient!aa;IJIILclient!ria;)V")
	public static void method3539(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class1 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) long arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class303 arg7) {
		@Pc(15) int local15 = arg5 * arg5 + arg0 * arg0;
		if ((long) local15 > arg4) {
			return;
		}
		@Pc(35) int local35 = Math.min(arg7.anInt7914 / 2, arg7.anInt7971 / 2);
		if (local15 <= local35 * local35) {
			Static579.method8033(arg0, arg2, Static639.aClass31Array19[arg6], arg3, arg5, arg7, arg1);
			return;
		}
		local35 -= 10;
		@Pc(67) int local67;
		if (Static407.anInt6909 == 4) {
			local67 = (int) Static225.aFloat85 & 0x3FFF;
		} else {
			local67 = (int) Static225.aFloat85 + Static463.anInt7491 & 0x3FFF;
		}
		@Pc(81) int local81 = Class290.anIntArray546[local67];
		@Pc(85) int local85 = Class290.anIntArray547[local67];
		if (Static407.anInt6909 != 4) {
			local81 = local81 * 256 / (Static594.anInt9866 + 256);
			local85 = local85 * 256 / (Static594.anInt9866 + 256);
		}
		@Pc(114) int local114 = arg0 * local85 + arg5 * local81 >> 14;
		@Pc(125) int local125 = local85 * arg5 - arg0 * local81 >> 14;
		@Pc(131) double local131 = Math.atan2((double) local114, (double) local125);
		@Pc(138) int local138 = (int) (Math.sin(local131) * (double) local35);
		@Pc(145) int local145 = (int) ((double) local35 * Math.cos(local131));
		Static186.aClass31Array6[arg6].method8809((float) local138 + (float) arg3 + (float) arg7.anInt7914 / 2.0F, (float) -local145 + (float) arg1 + (float) arg7.anInt7971 / 2.0F, 4096, (int) (-local131 / 6.283185307179586D * 65535.0D));
	}

	@OriginalMember(owner = "client!hia", name = "a", descriptor = "(III)Lclient!im;")
	public static Class16_Sub1_Sub4 method3540(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class84 local7 = Static348.aClass84ArrayArrayArray5[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass16_Sub1_Sub4_1;
	}
}
