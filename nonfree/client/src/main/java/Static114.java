import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static114 {

	@OriginalMember(owner = "client!ea", name = "n", descriptor = "D")
	public static double aDouble3;

	@OriginalMember(owner = "client!ea", name = "q", descriptor = "Lclient!dea;")
	public static Class67 aClass67_1;

	@OriginalMember(owner = "client!ea", name = "j", descriptor = "I")
	public static int anInt2516 = 0;

	@OriginalMember(owner = "client!ea", name = "l", descriptor = "[I")
	public static final int[] anIntArray160 = new int[25];

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(ILclient!dc;I)Ljava/lang/String;")
	public static String method2108(@OriginalArg(1) Class3_Sub9 arg0) {
		try {
			@Pc(7) int local7 = arg0.method5606();
			if (local7 > 32767) {
				local7 = 32767;
			}
			@Pc(19) byte[] local19 = new byte[local7];
			arg0.anInt6453 += Static79.aClass236_1.method5894(local7, arg0.aByteArray51, 0, local19, arg0.anInt6453);
			return Static284.method4606(local7, local19, 0);
		} catch (@Pc(51) Exception local51) {
			return "Cabbage";
		}
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(IIIILclient!kea;I)V")
	public static void method2109(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class187 arg3, @OriginalArg(5) int arg4) {
		if (arg4 < 1 || arg0 < 1 || Static399.anInt7121 - 2 < arg4 || Static24.anInt345 - 2 < arg0) {
			return;
		}
		if (Static567.aClass351ArrayArrayArray4 == null) {
			return;
		}
		@Pc(41) Interface2 local41 = Static206.aClass83_Sub1_2.method7816(arg1, arg4, arg0, arg2);
		if (local41 == null) {
			return;
		}
		if (!(local41 instanceof Class9_Sub2_Sub1_Sub1)) {
			if (!(local41 instanceof Class9_Sub2_Sub4_Sub1)) {
				if (local41 instanceof Class9_Sub2_Sub3_Sub2) {
					((Class9_Sub2_Sub3_Sub2) local41).method6434(arg3);
				} else if (local41 instanceof Class9_Sub2_Sub5_Sub1) {
					((Class9_Sub2_Sub5_Sub1) local41).method7192(arg3);
					return;
				}
				return;
			}
			((Class9_Sub2_Sub4_Sub1) local41).method4463(arg3);
			return;
		}
		((Class9_Sub2_Sub1_Sub1) local41).method898(arg3);
		return;
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(IZIIIILjava/lang/String;I)V")
	public static void method2110(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) String arg5, @OriginalArg(7) int arg6) {
		@Pc(7) Class9_Sub6 local7 = new Class9_Sub6();
		local7.anInt6074 = arg3 + Static304.anInt8391;
		local7.anInt6069 = arg4;
		local7.aString45 = arg5;
		local7.anInt6076 = arg1;
		local7.anInt6072 = arg0;
		local7.anInt6071 = arg2;
		local7.anInt6070 = arg6;
		Static169.aClass139_4.method3203(local7);
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(I)V")
	public static void method2111() {
		if (Static82.anInt1653 == 7) {
			Static416.method6442(false);
		} else {
			Static589.aClass197_2 = Static547.aClass197_1;
			Static547.aClass197_1 = null;
			Static206.method3226(13);
		}
	}
}
