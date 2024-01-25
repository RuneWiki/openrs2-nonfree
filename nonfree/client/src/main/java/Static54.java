import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static54 {

	@OriginalMember(owner = "client!bt", name = "M", descriptor = "[I")
	public static int[] anIntArray98;

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(II)V")
	public static void method1198(@OriginalArg(1) int arg0) {
		@Pc(15) Class3_Sub40 local15 = (Class3_Sub40) Static244.aClass83_11.method2368((long) arg0);
		if (local15 != null) {
			local15.aBoolean416 = !local15.aBoolean416;
			local15.aClass121_Sub1_1.method3605(local15.aBoolean416);
		}
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(BIIII)V")
	public static void method1199(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(9) Class3_Sub11_Sub4 local9 = Static583.method8201(8, (long) arg1);
		local9.method2195();
		local9.anInt2400 = arg3;
		local9.anInt2401 = arg2;
		local9.anInt2394 = arg0;
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method1200(@OriginalArg(0) String arg0) {
		if (!arg0.equals("")) {
			@Pc(17) Class3_Sub34 local17 = Static172.method3123(Static163.aClass375_1, Static204.aClass218_55);
			local17.aClass3_Sub25_Sub1_2.method8614(Static440.method6269(arg0));
			local17.aClass3_Sub25_Sub1_2.method8583(arg0);
			Static441.method6275(local17);
		}
	}

	@OriginalMember(owner = "client!bt", name = "b", descriptor = "(Z)Z")
	public static boolean method1202() {
		try {
			@Pc(12) Class169 local12 = new Class169();
			@Pc(17) byte[] local17 = local12.method4458(Static109.aByteArray14);
			Static321.method4918(local17);
			return true;
		} catch (@Pc(24) Exception local24) {
			return false;
		}
	}

	@OriginalMember(owner = "client!bt", name = "b", descriptor = "(I)V")
	public static void method1204() {
		Static441.aClass165_50.method4400();
	}

	@OriginalMember(owner = "client!bt", name = "d", descriptor = "(I)Lclient!kf;")
	public static Class3_Sub34 method1205() {
		return Static449.anInt7436 == 0 ? new Class3_Sub34() : Static652.aClass3_Sub34Array1[--Static449.anInt7436];
	}
}
