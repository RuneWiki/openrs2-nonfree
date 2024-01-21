import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static122 {

	@OriginalMember(owner = "client!p", name = "h", descriptor = "[I")
	public static int[] anIntArray71;

	@OriginalMember(owner = "client!p", name = "H", descriptor = "[I")
	public static int[] anIntArray72;

	@OriginalMember(owner = "client!p", name = "a", descriptor = "[I")
	public static int[] anIntArray70 = new int[25];

	@OriginalMember(owner = "client!p", name = "l", descriptor = "Lclient!sd;")
	private static Class73 aClass73_390 = method531("Login");

	@OriginalMember(owner = "client!p", name = "n", descriptor = "Lclient!sd;")
	private static Class73 aClass73_391 = method531("Error connecting to server)3");

	@OriginalMember(owner = "client!p", name = "K", descriptor = "Lclient!sd;")
	private static Class73 aClass73_396 = method531("Please remove ");

	@OriginalMember(owner = "client!p", name = "q", descriptor = "Lclient!sd;")
	public static Class73 aClass73_392 = aClass73_396;

	@OriginalMember(owner = "client!p", name = "C", descriptor = "Lclient!sd;")
	public static Class73 aClass73_393 = aClass73_390;

	@OriginalMember(owner = "client!p", name = "I", descriptor = "Lclient!sd;")
	public static Class73 aClass73_394 = aClass73_396;

	@OriginalMember(owner = "client!p", name = "J", descriptor = "Lclient!sd;")
	public static Class73 aClass73_395 = aClass73_391;

	@OriginalMember(owner = "client!p", name = "Q", descriptor = "Lclient!sd;")
	public static Class73 aClass73_397 = null;

	@OriginalMember(owner = "client!p", name = "c", descriptor = "(I)V")
	public static void method529() {
		aClass73_390 = null;
		aClass73_395 = null;
		anIntArray70 = null;
		aClass73_392 = null;
		anIntArray71 = null;
		aClass73_397 = null;
		aClass73_393 = null;
		anIntArray72 = null;
		aClass73_391 = null;
		aClass73_396 = null;
		aClass73_394 = null;
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(ILclient!vd;)Z")
	public static boolean method530(@OriginalArg(1) Class83 arg0) {
		@Pc(6) int local6 = arg0.anInt3735;
		if (local6 == 205) {
			Static43.anInt1007 = 250;
			return true;
		}
		@Pc(36) int local36;
		@Pc(40) int local40;
		if (local6 >= 300 && local6 <= 313) {
			local36 = (local6 - 300) / 2;
			local40 = local6 & 0x1;
			Static30.aClass52_1.method1706(local40 == 1, local36);
		}
		if (local6 >= 314 && local6 <= 323) {
			local40 = local6 & 0x1;
			local36 = (local6 - 314) / 2;
			Static30.aClass52_1.method1701(local40 == 1, local36);
		}
		if (local6 == 324) {
			Static30.aClass52_1.method1705(false);
		}
		if (local6 == 325) {
			Static30.aClass52_1.method1705(true);
		}
		if (local6 == 326) {
			Static139.aClass3_Sub12_Sub1_3.method1400(90);
			Static30.aClass52_1.method1703(Static139.aClass3_Sub12_Sub1_3);
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(Ljava/lang/String;I)Lclient!sd;")
	public static Class73 method531(@OriginalArg(0) String arg0) {
		@Pc(2) byte[] local2 = arg0.getBytes();
		@Pc(9) int local9 = local2.length;
		@Pc(11) int local11 = 0;
		@Pc(15) Class73 local15 = new Class73();
		local15.aByteArray36 = new byte[local9];
		while (local11 < local9) {
			@Pc(27) int local27 = local2[local11++] & 0xFF;
			if (local27 <= 45 && local27 >= 40) {
				if (local11 >= local9) {
					break;
				}
				@Pc(45) int local45 = local2[local11++] & 0xFF;
				local15.aByteArray36[local15.anInt3356++] = (byte) (local45 + (local27 + -40) * 43 - 48);
			} else if (local27 != 0) {
				local15.aByteArray36[local15.anInt3356++] = (byte) local27;
			}
		}
		local15.method2409();
		return local15.method2423();
	}

	@OriginalMember(owner = "client!p", name = "b", descriptor = "(Z)V")
	public static void method534() {
		for (@Pc(15) Class3_Sub3 local15 = (Class3_Sub3) Static158.aClass72_48.method2401(); local15 != null; local15 = (Class3_Sub3) Static158.aClass72_48.method2407()) {
			if (local15.aClass3_Sub1_Sub15_1 != null) {
				local15.method156();
			}
		}
	}
}
