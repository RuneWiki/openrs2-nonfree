import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static52 {

	@OriginalMember(owner = "client!dd", name = "x", descriptor = "Lclient!rb;")
	public static Class199 aClass199_1;

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(B)V", line = 7)
	public static void method1613() {
		if (Class2_Sub3_Sub35.anInt6430 == 10 || Class2_Sub3_Sub35.anInt6430 == 28) {
			Static361.method2837(5000, Static127.anInt6765 >> 10, Static197.anInt3773 >> 10);
		} else {
			@Pc(31) int local31 = Static17.aClass11_Sub5_Sub2_Sub1_3.anIntArray316[0] >> 3;
			@Pc(38) int local38 = Static17.aClass11_Sub5_Sub2_Sub1_3.anIntArray317[0] >> 3;
			if (local31 >= 0 && local31 < Class241.anInt7020 >> 3 && local38 >= 0 && OutputStream_Sub1.anInt4442 >> 3 > local38) {
				Static361.method2837(5000, local31, local38);
			} else {
				Static361.method2837(0, Class241.anInt7020 >> 4, OutputStream_Sub1.anInt4442 >> 4);
			}
		}
		Static131.method2625();
		Static268.method5030();
		Static229.method4342();
		Static47.method1532();
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(ILclient!ll;)V", line = 126)
	public static void method1615(@OriginalArg(1) Class2_Sub12 arg0) {
		arg0.aBoolean389 = false;
		if (arg0.aClass2_Sub21_5 != null) {
			arg0.aClass2_Sub21_5.anInt3171 = 0;
		}
		for (@Pc(23) Class2_Sub12 local23 = arg0.method4979(); local23 != null; local23 = arg0.method4973()) {
			method1615(local23);
		}
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(I)V", line = 151)
	public static void method1616() {
		if (Static18.aClass32_2 == null) {
			return;
		}
		if (Static18.aClass32_2.anInt992 == 1) {
			Static18.aClass32_2 = null;
			return;
		}
		if (Static18.aClass32_2.anInt992 == 2) {
			Static217.method4096(Static17.aClass152_4, 2, Static237.aString39);
			Static18.aClass32_2 = null;
			return;
		}
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(IIIII)V", line = 197)
	public static void method1618(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(10) Class2_Sub19 local10 = (Class2_Sub19) Class62.aClass135_14.method3552(); local10 != null; local10 = (Class2_Sub19) Class62.aClass135_14.method3553()) {
			Static314.method5707(arg2, arg3, local10, arg1, arg0);
		}
		for (@Pc(33) Class2_Sub19 local33 = (Class2_Sub19) Class11_Sub5_Sub6.aClass135_39.method3552(); local33 != null; local33 = (Class2_Sub19) Class11_Sub5_Sub6.aClass135_39.method3553()) {
			@Pc(37) byte local37 = 1;
			@Pc(42) Class222 local42 = local33.aClass11_Sub5_Sub2_Sub2_1.method4333();
			if (local33.aClass11_Sub5_Sub2_Sub2_1.aBoolean317) {
				local37 = 0;
			} else if (local42.anInt6251 == local33.aClass11_Sub5_Sub2_Sub2_1.anInt4577 || local42.anInt6280 == local33.aClass11_Sub5_Sub2_Sub2_1.anInt4577 || local42.anInt6289 == local33.aClass11_Sub5_Sub2_Sub2_1.anInt4577 || local42.anInt6259 == local33.aClass11_Sub5_Sub2_Sub2_1.anInt4577) {
				local37 = 2;
			} else if (local42.anInt6253 == local33.aClass11_Sub5_Sub2_Sub2_1.anInt4577 || local33.aClass11_Sub5_Sub2_Sub2_1.anInt4577 == local42.anInt6287 || local42.anInt6255 == local33.aClass11_Sub5_Sub2_Sub2_1.anInt4577 || local42.anInt6272 == local33.aClass11_Sub5_Sub2_Sub2_1.anInt4577) {
				local37 = 3;
			}
			if (local37 != local33.anInt2897) {
				@Pc(133) int local133 = Static317.method5765(local33.aClass11_Sub5_Sub2_Sub2_1);
				if (local133 != local33.anInt2891) {
					if (local33.aClass2_Sub12_Sub4_3 != null) {
						Static211.aClass2_Sub12_Sub2_2.method2083(local33.aClass2_Sub12_Sub4_3);
						local33.aClass2_Sub12_Sub4_3 = null;
					}
					local33.anInt2891 = local133;
				}
				local33.anInt2897 = local37;
			}
			local33.anInt2896 = local33.aClass11_Sub5_Sub2_Sub2_1.anInt6768;
			local33.anInt2893 = local33.aClass11_Sub5_Sub2_Sub2_1.anInt6768 + local33.aClass11_Sub5_Sub2_Sub2_1.method4329() * 64;
			local33.anInt2907 = local33.aClass11_Sub5_Sub2_Sub2_1.anInt6770;
			local33.anInt2901 = local33.aClass11_Sub5_Sub2_Sub2_1.anInt6770 + local33.aClass11_Sub5_Sub2_Sub2_1.method4329() * 64;
			Static314.method5707(arg2, arg3, local33, arg1, arg0);
		}
		for (@Pc(208) Class2_Sub19 local208 = (Class2_Sub19) Class160.aClass4_86.method80(); local208 != null; local208 = (Class2_Sub19) Class160.aClass4_86.method79()) {
			@Pc(212) byte local212 = 1;
			@Pc(217) Class222 local217 = local208.aClass11_Sub5_Sub2_Sub1_2.method4333();
			if (local208.aClass11_Sub5_Sub2_Sub1_2.aBoolean317) {
				local212 = 0;
			} else if (local208.aClass11_Sub5_Sub2_Sub1_2.anInt4577 == local217.anInt6251 || local208.aClass11_Sub5_Sub2_Sub1_2.anInt4577 == local217.anInt6280 || local208.aClass11_Sub5_Sub2_Sub1_2.anInt4577 == local217.anInt6289 || local217.anInt6259 == local208.aClass11_Sub5_Sub2_Sub1_2.anInt4577) {
				local212 = 2;
			} else if (local217.anInt6253 == local208.aClass11_Sub5_Sub2_Sub1_2.anInt4577 || local217.anInt6287 == local208.aClass11_Sub5_Sub2_Sub1_2.anInt4577 || local208.aClass11_Sub5_Sub2_Sub1_2.anInt4577 == local217.anInt6255 || local217.anInt6272 == local208.aClass11_Sub5_Sub2_Sub1_2.anInt4577) {
				local212 = 3;
			}
			if (local212 != local208.anInt2897) {
				@Pc(300) int local300 = Static358.method6416(local208.aClass11_Sub5_Sub2_Sub1_2);
				if (local300 != local208.anInt2891) {
					if (local208.aClass2_Sub12_Sub4_3 != null) {
						Static211.aClass2_Sub12_Sub2_2.method2083(local208.aClass2_Sub12_Sub4_3);
						local208.aClass2_Sub12_Sub4_3 = null;
					}
					local208.anInt2891 = local300;
				}
				local208.anInt2897 = local212;
			}
			local208.anInt2896 = local208.aClass11_Sub5_Sub2_Sub1_2.anInt6768;
			local208.anInt2893 = local208.aClass11_Sub5_Sub2_Sub1_2.anInt6768 + local208.aClass11_Sub5_Sub2_Sub1_2.method4329() * 64;
			local208.anInt2907 = local208.aClass11_Sub5_Sub2_Sub1_2.anInt6770;
			local208.anInt2901 = local208.aClass11_Sub5_Sub2_Sub1_2.anInt6770 + local208.aClass11_Sub5_Sub2_Sub1_2.method4329() * 64;
			Static314.method5707(arg2, arg3, local208, arg1, arg0);
		}
	}
}
