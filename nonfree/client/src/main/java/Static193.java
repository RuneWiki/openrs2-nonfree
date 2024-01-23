import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static193 {

	@OriginalMember(owner = "client!oj", name = "b", descriptor = "F")
	public static float aFloat34;

	@OriginalMember(owner = "client!oj", name = "d", descriptor = "Lclient!lc;")
	public static Class98 aClass98_111;

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "I")
	public static int anInt3800 = 64;

	@OriginalMember(owner = "client!oj", name = "g", descriptor = "[I")
	public static int[] anIntArray319 = new int[14];

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(B)V")
	public static void method3017() {
		anIntArray319 = null;
		aClass98_111 = null;
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(IZ)V")
	public static void method3018(@OriginalArg(1) boolean arg0) {
		Static291.method4313(Static158.anInt3163, Static125.aFloat24, Static201.aFloat35, Static11.aFloat2);
		Static291.method4312(Static230.anInt4512, Static241.anInt4628, arg0);
		Static291.method4317((float) Static6.anInt161, (float) Static65.anInt1219, (float) Static266.anInt5004);
		Static291.method4311();
		Static56.aFloat6 = Static17.aFloat5;
		Static56.aFloat8 = Static67.aFloat9;
		Static56.aFloat7 = Static68.aFloat10;
		Static92.aClass4_Sub2_Sub15_1 = Static206.aClass4_Sub2_Sub15_5;
	}

	@OriginalMember(owner = "client!oj", name = "b", descriptor = "(IZ)V")
	public static void method3019(@OriginalArg(1) boolean arg0) {
		@Pc(4) int local4 = Static249.aByteArrayArray19.length;
		@Pc(10) byte[][] local10;
		if (Static178.aBoolean216 && arg0) {
			local10 = Static90.aByteArrayArray9;
		} else {
			local10 = Static81.aByteArrayArray16;
		}
		for (@Pc(16) int local16 = 0; local16 < local4; local16++) {
			@Pc(27) byte[] local27 = local10[local16];
			if (local27 != null) {
				@Pc(41) int local41 = (Static262.anIntArray442[local16] >> 8) * 64 - Static170.anInt3385;
				@Pc(52) int local52 = (Static262.anIntArray442[local16] & 0xFF) * 64 - Static239.anInt4613;
				Static81.method3275();
				Static214.method3426(local27, local41, arg0, Static121.aClass63Array1, local52);
			}
		}
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(IFIIIBIZ)[I")
	public static int[] method3020(@OriginalArg(1) float arg0) {
		@Pc(2) int[] local2 = new int[2048];
		@Pc(10) Class4_Sub6_Sub2 local10 = new Class4_Sub6_Sub2();
		local10.anInt411 = (int) (arg0 * 4096.0F);
		local10.anInt417 = 8;
		local10.aBoolean27 = true;
		local10.anInt413 = 4;
		local10.anInt408 = 8;
		local10.anInt412 = 35;
		local10.method4370();
		Static147.method2365(1, 2048);
		local10.method354(0, local2);
		return local2;
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(BI)[B")
	public static synchronized byte[] method3021(@OriginalArg(1) int arg0) {
		@Pc(16) byte[] local16;
		if (arg0 == 100 && Static257.anInt4854 > 0) {
			local16 = Static267.aByteArrayArray15[--Static257.anInt4854];
			Static267.aByteArrayArray15[Static257.anInt4854] = null;
			return local16;
		} else if (arg0 == 5000 && Static289.anInt5418 > 0) {
			local16 = Static14.aByteArrayArray10[--Static289.anInt5418];
			Static14.aByteArrayArray10[Static289.anInt5418] = null;
			return local16;
		} else if (arg0 == 30000 && Static68.anInt1270 > 0) {
			local16 = Static65.aByteArrayArray6[--Static68.anInt1270];
			Static65.aByteArrayArray6[Static68.anInt1270] = null;
			return local16;
		} else {
			return new byte[arg0];
		}
	}
}
