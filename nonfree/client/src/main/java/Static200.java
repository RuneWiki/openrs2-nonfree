import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static200 {

	@OriginalMember(owner = "client!gq", name = "b", descriptor = "Lclient!es;")
	public static Class4_Sub11 aClass4_Sub11_6;

	@OriginalMember(owner = "client!gq", name = "d", descriptor = "I")
	public static int anInt3300;

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(Lclient!iaa;IBIB)V")
	public static void method3056(@OriginalArg(0) Class3_Sub1_Sub2_Sub2_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(10) int local10 = arg0.anIntArray693[0];
		@Pc(15) int local15 = arg0.anIntArray694[0];
		if (local10 < 0 || local10 >= Static224.anInt3557 || local15 < 0 || local15 >= Static267.anInt4309 || (arg1 < 0 || Static224.anInt3557 <= arg1 || arg2 < 0 || Static267.anInt4309 <= arg2)) {
			return;
		}
		@Pc(71) int local71 = Static250.method3668(arg2, Static263.aClass389Array1[arg0.aByte141], 0, true, local15, local10, 0, -4, Static640.anIntArray699, arg1, 0, arg0.method8514(), 0, Static155.anIntArray206);
		if (local71 >= 1 && local71 <= 3) {
			for (@Pc(87) int local87 = 0; local87 < local71 - 1; local87++) {
				arg0.method3536(Static640.anIntArray699[local87], Static155.anIntArray206[local87], (byte) 2);
			}
		}
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method3057(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return;
		}
		if (arg0.startsWith("*")) {
			arg0 = arg0.substring(1);
		}
		@Pc(20) String local20 = Static317.method4379(arg0);
		if (local20 == null) {
			return;
		}
		for (@Pc(33) int local33 = 0; local33 < Static450.anInt7035; local33++) {
			@Pc(39) String local39 = Static289.aStringArray20[local33];
			if (local39.startsWith("*")) {
				local39 = local39.substring(1);
			}
			local39 = Static317.method4379(local39);
			if (local39 != null && local39.equals(local20)) {
				Static450.anInt7035--;
				for (@Pc(63) int local63 = local33; local63 < Static450.anInt7035; local63++) {
					Static289.aStringArray20[local63] = Static289.aStringArray20[local63 + 1];
					Static496.aStringArray41[local63] = Static496.aStringArray41[local63 + 1];
					Static151.anIntArray198[local63] = Static151.anIntArray198[local63 + 1];
					Static368.aStringArray27[local63] = Static368.aStringArray27[local63 + 1];
					Static536.anIntArray566[local63] = Static536.anIntArray566[local63 + 1];
					Static226.aBooleanArray9[local63] = Static226.aBooleanArray9[local63 + 1];
				}
				Static261.anInt4244 = Static317.anInt4914;
				@Pc(132) Class4_Sub48 local132 = Static335.method4615(Static521.aClass216_129, Static669.aClass196_2);
				local132.aClass4_Sub11_Sub1_2.method8822(Static115.method2143(arg0));
				local132.aClass4_Sub11_Sub1_2.method8857(arg0);
				Static410.method5170(local132);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(IIILclient!kq;)V")
	public static void method3058(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class199 arg2) {
		if (arg2 == null) {
			return;
		}
		if (arg2.anObjectArray8 != null) {
			@Pc(13) Class4_Sub25 local13 = new Class4_Sub25();
			local13.anObjectArray2 = arg2.anObjectArray8;
			local13.aClass199_6 = arg2;
			Static237.method3393(local13);
		}
		Static25.anInt576 = arg1;
		Static111.anInt2192 = arg2.anInt4995;
		Static463.aBoolean582 = true;
		Static530.anInt8205 = arg2.anInt5020;
		Static169.anInt3012 = arg2.anInt5041;
		Static292.anInt4612 = arg2.anInt5005;
		Static270.anInt4357 = arg2.anInt5002;
		Static231.anInt8415 = arg0;
		Static331.method4565(arg2);
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(ZLclient!kq;Lclient!kq;)V")
	public static void method3059(@OriginalArg(1) Class199 arg0, @OriginalArg(2) Class199 arg1) {
		@Pc(12) Class4_Sub48 local12 = Static335.method4615(Static282.aClass216_82, Static669.aClass196_2);
		local12.aClass4_Sub11_Sub1_2.method8860(arg1.anInt5041);
		local12.aClass4_Sub11_Sub1_2.method8893(arg0.anInt5041);
		local12.aClass4_Sub11_Sub1_2.method8838(arg1.anInt5005);
		local12.aClass4_Sub11_Sub1_2.method8838(arg0.anInt5002);
		local12.aClass4_Sub11_Sub1_2.method8876(arg0.anInt5005);
		local12.aClass4_Sub11_Sub1_2.method8891(arg1.anInt5002);
		Static410.method5170(local12);
	}
}
