import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static140 {

	@OriginalMember(owner = "client!faa", name = "d", descriptor = "I")
	public static int anInt3097;

	@OriginalMember(owner = "client!faa", name = "i", descriptor = "Lclient!dm;")
	public static Class78 aClass78_6;

	@OriginalMember(owner = "client!faa", name = "m", descriptor = "F")
	public static float aFloat70;

	@OriginalMember(owner = "client!faa", name = "c", descriptor = "(B)V")
	public static void method2665() {
		@Pc(11) int local11;
		if (Static527.aClass10Array4 != null) {
			for (local11 = 0; local11 < Static509.anInt8568; local11++) {
				Static527.aClass10Array4[local11] = null;
			}
			Static527.aClass10Array4 = null;
		}
		if (Static526.aClass10Array3 != null) {
			for (local11 = 0; local11 < Static220.anInt4569; local11++) {
				Static526.aClass10Array3[local11] = null;
			}
			Static526.aClass10Array3 = null;
		}
		if (Static448.aClass10Array2 != null) {
			for (local11 = 0; local11 < Static156.anInt3553; local11++) {
				Static448.aClass10Array2[local11] = null;
			}
			Static448.aClass10Array2 = null;
		}
		Static76.aClass10Array1 = null;
		Static16.anInt299 = -1;
		Static64.anInt1374 = -1;
		Static385.anIntArray465 = null;
		Static22.anIntArrayArrayArray21 = null;
	}

	@OriginalMember(owner = "client!faa", name = "a", descriptor = "(IIBZ)V")
	public static void method2666(@OriginalArg(3) boolean arg0) {
		Static288.anInt5416 = 2;
		Static440.aBoolean586 = arg0;
		Static66.anInt1396 = 22050;
	}

	@OriginalMember(owner = "client!faa", name = "a", descriptor = "(ILclient!ud;)Lclient!pd;")
	public static Class8 method2667(@OriginalArg(1) Class2_Sub34 arg0) {
		@Pc(10) Class174 local10 = Static534.method7469()[arg0.method6904()];
		@Pc(21) Class176 local21 = Static85.method1548()[arg0.method6904()];
		@Pc(25) int local25 = arg0.method6856();
		@Pc(29) int local29 = arg0.method6856();
		@Pc(35) int local35 = arg0.method6884();
		@Pc(39) int local39 = arg0.method6884();
		@Pc(48) int local48 = arg0.method6856();
		@Pc(52) int local52 = arg0.method6865();
		@Pc(56) int local56 = arg0.method6865();
		return new Class8(local10, local21, local25, local29, local35, local39, local48, local52, local56);
	}

	@OriginalMember(owner = "client!faa", name = "a", descriptor = "(ILclient!vg;)V")
	public static void method2668(@OriginalArg(1) Class11_Sub1_Sub1_Sub2 arg0) {
		if (arg0 instanceof Class11_Sub1_Sub1_Sub2_Sub2) {
			@Pc(29) Class11_Sub1_Sub1_Sub2_Sub2 local29 = (Class11_Sub1_Sub1_Sub2_Sub2) arg0;
			if (local29.aClass236_1 != null) {
				Static41.method839(local29, Static338.aClass11_Sub1_Sub1_Sub2_Sub1_2.aByte124 != local29.aByte124);
			}
		} else if (arg0 instanceof Class11_Sub1_Sub1_Sub2_Sub1) {
			@Pc(13) Class11_Sub1_Sub1_Sub2_Sub1 local13 = (Class11_Sub1_Sub1_Sub2_Sub1) arg0;
			Static335.method4774(Static338.aClass11_Sub1_Sub1_Sub2_Sub1_2.aByte124 != local13.aByte124, local13);
		}
	}
}
