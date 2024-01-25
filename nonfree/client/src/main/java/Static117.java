import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static117 {

	@OriginalMember(owner = "client!ee", name = "c", descriptor = "Lclient!f;")
	public static Class14 aClass14_8;

	@OriginalMember(owner = "client!ee", name = "d", descriptor = "I")
	public static int anInt2694;

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "Lclient!sb;")
	public static final Class303 aClass303_33 = new Class303(61, 2);

	@OriginalMember(owner = "client!ee", name = "e", descriptor = "[[B")
	public static final byte[][] aByteArrayArray7 = new byte[250][];

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(I)V")
	public static void method2415() {
		Static596.anInt9773 = 0;
		Static212.anInt3826 = 0;
		Static573.method7702();
		Static498.method6711();
		Static515.method2747();
		@Pc(22) boolean local22 = false;
		@Pc(30) int local30;
		for (@Pc(24) int local24 = 0; local24 < Static212.anInt3826; local24++) {
			local30 = Static471.anIntArray498[local24];
			@Pc(39) Class3_Sub34 local39 = (Class3_Sub34) Static213.aClass354_37.method7689((long) local30);
			@Pc(42) Class41_Sub2_Sub1_Sub4_Sub1 local42 = local39.aClass41_Sub2_Sub1_Sub4_Sub1_2;
			if (Static150.aBoolean254 && Static39.method654(local30)) {
				Static242.method3771();
			}
			if (Static506.anInt8251 != local42.anInt9487) {
				if (local42.aClass264_1.method6002()) {
					Static184.method3145(local42);
				}
				local42.method5661(null);
				local22 = true;
				local39.method7825();
			}
		}
		if (local22) {
			Static137.anInt2977 = Static213.aClass354_37.method7688();
			Static213.aClass354_37.method7695(Static441.aClass3_Sub34Array1);
		}
		if (Static532.aClass3_Sub11_Sub1_2.anInt6128 != Static292.anInt4974) {
			throw new RuntimeException("gnp1 pos:" + Static532.aClass3_Sub11_Sub1_2.anInt6128 + " psize:" + Static292.anInt4974);
		}
		for (local30 = 0; local30 < Static88.anInt1884; local30++) {
			if (Static213.aClass354_37.method7689((long) Static445.anIntArray470[local30]) == null) {
				throw new RuntimeException("gnp2 pos:" + local30 + " size:" + Static88.anInt1884);
			}
		}
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(IIILclient!tn;)V")
	public static void method2417(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class41_Sub2_Sub5 arg3) {
		@Pc(4) Class299 local4 = Static12.method6301(arg0, arg1, arg2);
		if (local4 == null) {
			return;
		}
		local4.aClass41_Sub2_Sub5_1 = arg3;
		@Pc(16) int local16 = Static68.aClass34Array1 == Static426.aClass34Array5 ? 1 : 0;
		if (arg3.method7847()) {
			if (arg3.method7851()) {
				Static548.aClass41_Sub2ArrayArray3[local16][Static462.anIntArray496[local16]++] = arg3;
				return;
			}
			Static417.aClass41_Sub2ArrayArray1[local16][Static279.anIntArray622[local16]++] = arg3;
			return;
		}
		Static533.aClass41_Sub2ArrayArray2[local16][Static505.anIntArray524[local16]++] = arg3;
	}
}
