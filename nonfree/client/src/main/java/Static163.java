import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static163 {

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray15;

	@OriginalMember(owner = "client!fq", name = "d", descriptor = "Lclient!la;")
	public static Class196 aClass196_35;

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(I)V")
	public static void method2897() {
		if (Static307.anInt5465 == -1) {
			return;
		}
		@Pc(11) int local11 = Static483.aClass191_1.method6989();
		@Pc(17) int local17 = Static483.aClass191_1.method6982();
		@Pc(24) Class3_Sub31 local24 = (Class3_Sub31) Static537.aClass223_58.method5874();
		if (local24 != null) {
			local11 = local24.method6921();
			local17 = local24.method6924();
		}
		@Pc(38) int local38 = 0;
		@Pc(40) int local40 = 0;
		if (Static219.aBoolean285) {
			local38 = Static30.method1089();
			local40 = Static166.method2921();
		}
		Static455.method6990(local17, Static330.anInt6165 + local40, local17 - -local40, local38 + local11, local11, Static307.anInt5465, local40, local38, local40, local38, Static109.anInt2357 + local38);
		if (Static87.aClass279_3 != null) {
			Static596.method8349(local38 + local11, local17 + local40);
		}
	}

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(B[B)[B")
	public static byte[] method2898(@OriginalArg(1) byte[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(16) byte[] local16 = new byte[arg0.length];
			Static653.method6858(arg0, 0, local16, 0, arg0.length);
			return local16;
		}
	}

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(IZ)Z")
	public static boolean method2899(@OriginalArg(1) boolean arg0) {
		@Pc(11) boolean local11 = Static323.aClass5_9.method7516();
		if (local11 == arg0) {
			return true;
		}
		if (!arg0) {
			Static323.aClass5_9.method7555();
		} else if (!Static323.aClass5_9.method7534()) {
			arg0 = false;
		}
		if (local11 == arg0) {
			return false;
		} else {
			Static262.aClass3_Sub27_12.method3234(arg0 ? 1 : 0, Static262.aClass3_Sub27_12.aClass21_Sub29_1);
			Static108.method2177();
			return true;
		}
	}

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(III)I")
	public static int method2900(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		arg0 = (arg1 & 0x7F) * arg0 >> 7;
		if (arg0 < 2) {
			arg0 = 2;
		} else if (arg0 > 126) {
			arg0 = 126;
		}
		return arg0 + (arg1 & 0xFF80);
	}
}
