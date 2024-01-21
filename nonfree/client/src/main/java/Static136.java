import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static136 {

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "I")
	public static int anInt3087 = 0;

	@OriginalMember(owner = "client!qg", name = "c", descriptor = "I")
	public static int anInt3089 = 127;

	@OriginalMember(owner = "client!qg", name = "d", descriptor = "Lclient!sd;")
	public static Class73 aClass73_1715 = Static122.method531(":trade:");

	@OriginalMember(owner = "client!qg", name = "e", descriptor = "[I")
	public static int[] anIntArray321 = new int[128];

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(B)V")
	public static void method2236() {
		for (@Pc(6) Class3_Sub3 local6 = (Class3_Sub3) Static158.aClass72_48.method2401(); local6 != null; local6 = (Class3_Sub3) Static158.aClass72_48.method2407()) {
			if (local6.aClass3_Sub9_Sub1_2 != null) {
				Static11.aClass3_Sub9_Sub4_1.method2221(local6.aClass3_Sub9_Sub1_2);
				local6.aClass3_Sub9_Sub1_2 = null;
			}
			if (local6.aClass3_Sub9_Sub1_1 != null) {
				Static11.aClass3_Sub9_Sub4_1.method2221(local6.aClass3_Sub9_Sub1_1);
				local6.aClass3_Sub9_Sub1_1 = null;
			}
		}
		Static158.aClass72_48.method2396();
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(BI)V")
	public static void method2237(@OriginalArg(1) int arg0) {
		Static150.method2601();
		Static122.method534();
		@Pc(14) int local14 = Static62.method1120(arg0).anInt1934;
		if (local14 == 0) {
			return;
		}
		@Pc(24) int local24 = Static81.anIntArray186[arg0];
		if (local14 == 1) {
			if (local24 == 1) {
				Static36.method663(0.9F);
			}
			if (local24 == 2) {
				Static36.method663(0.8F);
			}
			if (local24 == 3) {
				Static36.method663(0.7F);
			}
			if (local24 == 4) {
				Static36.method663(0.6F);
			}
			Static17.method2683();
		}
		if (local14 == 3) {
			@Pc(63) short local63 = 0;
			if (local24 == 0) {
				local63 = 255;
			}
			if (local24 == 1) {
				local63 = 192;
			}
			if (local24 == 2) {
				local63 = 128;
			}
			if (local24 == 3) {
				local63 = 64;
			}
			if (local24 == 4) {
				local63 = 0;
			}
			if (local63 != Static69.anInt1602) {
				if (Static69.anInt1602 == 0 && Static164.anInt3564 != -1) {
					Static69.method1224(0, Static11.aClass13_Sub1_4, Static164.anInt3564, local63);
					Static44.aBoolean70 = false;
				} else if (local63 == 0) {
					Static24.method502();
					Static44.aBoolean70 = false;
				} else {
					Static175.method2703(local63);
				}
				Static69.anInt1602 = local63;
			}
		}
		if (local14 == 10) {
			if (local24 == 0) {
				Static51.anInt1201 = 127;
			}
			if (local24 == 1) {
				Static51.anInt1201 = 96;
			}
			if (local24 == 2) {
				Static51.anInt1201 = 64;
			}
			if (local24 == 3) {
				Static51.anInt1201 = 32;
			}
			if (local24 == 4) {
				Static51.anInt1201 = 0;
			}
		}
		if (local14 == 6) {
			Static118.anInt3947 = local24;
		}
		if (local14 == 4) {
			if (local24 == 0) {
				anInt3089 = 127;
			}
			if (local24 == 1) {
				anInt3089 = 96;
			}
			if (local24 == 2) {
				anInt3089 = 64;
			}
			if (local24 == 3) {
				anInt3089 = 32;
			}
			if (local24 == 4) {
				anInt3089 = 0;
			}
		}
		if (local14 == 9) {
			Static176.anInt3860 = local24;
		}
		if (local14 == 5) {
			Static127.anInt605 = local24;
		}
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(I)V")
	public static void method2238() {
		aClass73_1715 = null;
		anIntArray321 = null;
	}
}
