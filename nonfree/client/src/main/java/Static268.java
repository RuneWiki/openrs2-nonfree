import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static268 {

	@OriginalMember(owner = "client!nm", name = "b", descriptor = "[I")
	public static int[] anIntArray411;

	@OriginalMember(owner = "client!nm", name = "d", descriptor = "I")
	public static int anInt4749 = 0;

	@OriginalMember(owner = "client!nm", name = "l", descriptor = "I")
	public static int anInt4756 = 13156520;

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(I)V")
	public static void method3946() {
		Static266.method5703();
		for (@Pc(8) int local8 = 0; local8 < 4; local8++) {
			Static125.aClass188Array1[local8].method4320();
		}
		Static185.method2913();
		Static67.method1324();
		System.gc();
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(B)Lclient!qr;")
	public static Class1_Sub2_Sub11 method3947() {
		return Static168.aClass1_Sub2_Sub11_2;
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(IIIII)V")
	public static void method3949(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(15) Class1_Sub35 local15 = (Class1_Sub35) Static298.aClass181_57.method4112(); local15 != null; local15 = (Class1_Sub35) Static298.aClass181_57.method4104()) {
			Static143.method2389(arg2, arg3, arg1, local15, arg0);
		}
		for (@Pc(38) Class1_Sub35 local38 = (Class1_Sub35) Static77.aClass181_15.method4112(); local38 != null; local38 = (Class1_Sub35) Static77.aClass181_15.method4104()) {
			@Pc(42) byte local42 = 1;
			@Pc(47) Class21 local47 = local38.aClass31_Sub2_Sub1_Sub2_1.method5982();
			if (local38.aClass31_Sub2_Sub1_Sub2_1.aBoolean505) {
				local42 = 0;
			} else if (local47.anInt620 == local38.aClass31_Sub2_Sub1_Sub2_1.anInt7338 || local38.aClass31_Sub2_Sub1_Sub2_1.anInt7338 == local47.anInt628 || local38.aClass31_Sub2_Sub1_Sub2_1.anInt7338 == local47.anInt629 || local47.anInt609 == local38.aClass31_Sub2_Sub1_Sub2_1.anInt7338) {
				local42 = 2;
			} else if (local47.anInt611 == local38.aClass31_Sub2_Sub1_Sub2_1.anInt7338 || local47.anInt603 == local38.aClass31_Sub2_Sub1_Sub2_1.anInt7338 || local38.aClass31_Sub2_Sub1_Sub2_1.anInt7338 == local47.anInt607 || local38.aClass31_Sub2_Sub1_Sub2_1.anInt7338 == local47.anInt599) {
				local42 = 3;
			}
			if (local42 != local38.anInt5288) {
				@Pc(134) int local134 = Static43.method810(local38.aClass31_Sub2_Sub1_Sub2_1);
				if (local134 != local38.anInt5281) {
					if (local38.aClass1_Sub19_Sub1_3 != null) {
						Static59.aClass1_Sub19_Sub2_1.method2185(local38.aClass1_Sub19_Sub1_3);
						local38.aClass1_Sub19_Sub1_3 = null;
					}
					local38.anInt5281 = local134;
				}
				local38.anInt5288 = local42;
			}
			local38.anInt5290 = local38.aClass31_Sub2_Sub1_Sub2_1.anInt7300;
			local38.anInt5286 = local38.aClass31_Sub2_Sub1_Sub2_1.anInt7300 + (local38.aClass31_Sub2_Sub1_Sub2_1.method5989() << 6);
			local38.anInt5279 = local38.aClass31_Sub2_Sub1_Sub2_1.anInt7298;
			local38.anInt5289 = local38.aClass31_Sub2_Sub1_Sub2_1.anInt7298 + (local38.aClass31_Sub2_Sub1_Sub2_1.method5989() << 6);
			Static143.method2389(arg2, arg3, arg1, local38, arg0);
		}
		for (@Pc(217) Class1_Sub35 local217 = (Class1_Sub35) Static348.aClass96_36.method2342(); local217 != null; local217 = (Class1_Sub35) Static348.aClass96_36.method2339()) {
			@Pc(221) byte local221 = 1;
			@Pc(226) Class21 local226 = local217.aClass31_Sub2_Sub1_Sub1_1.method5982();
			if (local217.aClass31_Sub2_Sub1_Sub1_1.aBoolean505) {
				local221 = 0;
			} else if (local217.aClass31_Sub2_Sub1_Sub1_1.anInt7338 == local226.anInt620 || local217.aClass31_Sub2_Sub1_Sub1_1.anInt7338 == local226.anInt628 || local226.anInt629 == local217.aClass31_Sub2_Sub1_Sub1_1.anInt7338 || local217.aClass31_Sub2_Sub1_Sub1_1.anInt7338 == local226.anInt609) {
				local221 = 2;
			} else if (local226.anInt611 == local217.aClass31_Sub2_Sub1_Sub1_1.anInt7338 || local217.aClass31_Sub2_Sub1_Sub1_1.anInt7338 == local226.anInt603 || local226.anInt607 == local217.aClass31_Sub2_Sub1_Sub1_1.anInt7338 || local226.anInt599 == local217.aClass31_Sub2_Sub1_Sub1_1.anInt7338) {
				local221 = 3;
			}
			if (local221 != local217.anInt5288) {
				@Pc(313) int local313 = Static269.method3957(local217.aClass31_Sub2_Sub1_Sub1_1);
				if (local313 != local217.anInt5281) {
					if (local217.aClass1_Sub19_Sub1_3 != null) {
						Static59.aClass1_Sub19_Sub2_1.method2185(local217.aClass1_Sub19_Sub1_3);
						local217.aClass1_Sub19_Sub1_3 = null;
					}
					local217.anInt5281 = local313;
				}
				local217.anInt5288 = local221;
			}
			local217.anInt5290 = local217.aClass31_Sub2_Sub1_Sub1_1.anInt7300;
			local217.anInt5286 = local217.aClass31_Sub2_Sub1_Sub1_1.anInt7300 + (local217.aClass31_Sub2_Sub1_Sub1_1.method5989() << 6);
			local217.anInt5279 = local217.aClass31_Sub2_Sub1_Sub1_1.anInt7298;
			local217.anInt5289 = local217.aClass31_Sub2_Sub1_Sub1_1.anInt7298 + (local217.aClass31_Sub2_Sub1_Sub1_1.method5989() << 6);
			Static143.method2389(arg2, arg3, arg1, local217, arg0);
		}
	}
}
