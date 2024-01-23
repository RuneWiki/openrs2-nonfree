import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static164 {

	@OriginalMember(owner = "client!mc", name = "v", descriptor = "I")
	public static int anInt3445;

	@OriginalMember(owner = "client!mc", name = "m", descriptor = "Ljava/math/BigInteger;")
	public static BigInteger aBigInteger1 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

	@OriginalMember(owner = "client!mc", name = "P", descriptor = "Lclient!th;")
	public static Class169 aClass169_94 = new Class169(50);

	@OriginalMember(owner = "client!mc", name = "S", descriptor = "I")
	public static int anInt3456 = 0;

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(IIIIB)V")
	public static void method2786(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(10) Class1_Sub10 local10;
		for (local10 = (Class1_Sub10) Static232.aClass24_20.method460(); local10 != null; local10 = (Class1_Sub10) Static232.aClass24_20.method464()) {
			Static54.method935(arg2, arg1, local10, arg3, arg0);
		}
		@Pc(43) byte local43;
		@Pc(48) Class78 local48;
		@Pc(150) int local150;
		for (local10 = (Class1_Sub10) Static213.aClass24_22.method460(); local10 != null; local10 = (Class1_Sub10) Static213.aClass24_22.method464()) {
			local43 = 1;
			local48 = local10.aClass22_Sub3_Sub1_1.method3659();
			if (local10.aClass22_Sub3_Sub1_1.anInt4566 == local48.anInt2171) {
				local43 = 0;
			} else if (local48.anInt2143 == local10.aClass22_Sub3_Sub1_1.anInt4566 || local48.anInt2162 == local10.aClass22_Sub3_Sub1_1.anInt4566 || local48.anInt2150 == local10.aClass22_Sub3_Sub1_1.anInt4566 || local10.aClass22_Sub3_Sub1_1.anInt4566 == local48.anInt2132) {
				local43 = 2;
			} else if (local48.anInt2151 == local10.aClass22_Sub3_Sub1_1.anInt4566 || local10.aClass22_Sub3_Sub1_1.anInt4566 == local48.anInt2148 || local48.anInt2166 == local10.aClass22_Sub3_Sub1_1.anInt4566 || local10.aClass22_Sub3_Sub1_1.anInt4566 == local48.anInt2161) {
				local43 = 3;
			}
			if (local10.anInt970 != local43) {
				local150 = Static274.method4068(local10.aClass22_Sub3_Sub1_1);
				if (local150 != local10.anInt971) {
					if (local10.aClass1_Sub4_Sub1_2 != null) {
						Static303.aClass1_Sub4_Sub2_2.method774(local10.aClass1_Sub4_Sub1_2);
						local10.aClass1_Sub4_Sub1_2 = null;
					}
					local10.anInt971 = local150;
				}
				local10.anInt970 = local43;
			}
			local10.anInt962 = local10.aClass22_Sub3_Sub1_1.anInt4601;
			local10.anInt969 = local10.aClass22_Sub3_Sub1_1.anInt4601 + local10.aClass22_Sub3_Sub1_1.method3660() * 64;
			local10.anInt974 = local10.aClass22_Sub3_Sub1_1.anInt4623;
			local10.anInt964 = local10.aClass22_Sub3_Sub1_1.anInt4623 + local10.aClass22_Sub3_Sub1_1.method3660() * 64;
			Static54.method935(arg2, arg1, local10, arg3, arg0);
		}
		for (local10 = (Class1_Sub10) Static263.aClass156_24.method3822(); local10 != null; local10 = (Class1_Sub10) Static263.aClass156_24.method3820()) {
			local43 = 1;
			local48 = local10.aClass22_Sub3_Sub2_1.method3659();
			if (local10.aClass22_Sub3_Sub2_1.anInt4566 == local48.anInt2171) {
				local43 = 0;
			} else if (local10.aClass22_Sub3_Sub2_1.anInt4566 == local48.anInt2143 || local48.anInt2162 == local10.aClass22_Sub3_Sub2_1.anInt4566 || local48.anInt2150 == local10.aClass22_Sub3_Sub2_1.anInt4566 || local48.anInt2132 == local10.aClass22_Sub3_Sub2_1.anInt4566) {
				local43 = 2;
			} else if (local48.anInt2151 == local10.aClass22_Sub3_Sub2_1.anInt4566 || local10.aClass22_Sub3_Sub2_1.anInt4566 == local48.anInt2148 || local10.aClass22_Sub3_Sub2_1.anInt4566 == local48.anInt2166 || local10.aClass22_Sub3_Sub2_1.anInt4566 == local48.anInt2161) {
				local43 = 3;
			}
			if (local10.anInt970 != local43) {
				local150 = Static84.method1250(local10.aClass22_Sub3_Sub2_1);
				if (local10.anInt971 != local150) {
					if (local10.aClass1_Sub4_Sub1_2 != null) {
						Static303.aClass1_Sub4_Sub2_2.method774(local10.aClass1_Sub4_Sub1_2);
						local10.aClass1_Sub4_Sub1_2 = null;
					}
					local10.anInt971 = local150;
				}
				local10.anInt970 = local43;
			}
			local10.anInt962 = local10.aClass22_Sub3_Sub2_1.anInt4601;
			local10.anInt969 = local10.aClass22_Sub3_Sub2_1.anInt4601 + local10.aClass22_Sub3_Sub2_1.method3660() * 64;
			local10.anInt974 = local10.aClass22_Sub3_Sub2_1.anInt4623;
			local10.anInt964 = local10.aClass22_Sub3_Sub2_1.anInt4623 + local10.aClass22_Sub3_Sub2_1.method3660() * 64;
			Static54.method935(arg2, arg1, local10, arg3, arg0);
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(IIIIIII)V")
	public static void method2787(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(11) int local11 = Static310.method1126(Static59.anInt1155, Static240.anInt1319, arg5);
		@Pc(17) int local17 = Static310.method1126(Static59.anInt1155, Static240.anInt1319, arg2);
		@Pc(23) int local23 = Static310.method1126(Static214.anInt4216, Static312.anInt5850, arg1);
		@Pc(29) int local29 = Static310.method1126(Static214.anInt4216, Static312.anInt5850, arg4);
		@Pc(37) int local37 = Static310.method1126(Static59.anInt1155, Static240.anInt1319, arg5 + arg0);
		@Pc(46) int local46 = Static310.method1126(Static59.anInt1155, Static240.anInt1319, arg2 - arg0);
		@Pc(48) int local48;
		for (local48 = local11; local48 < local37; local48++) {
			Static109.method1795(local23, Static51.anIntArrayArray1[local48], local29, arg3);
		}
		for (local48 = local17; local48 > local46; local48--) {
			Static109.method1795(local23, Static51.anIntArrayArray1[local48], local29, arg3);
		}
		@Pc(94) int local94 = Static310.method1126(Static214.anInt4216, Static312.anInt5850, arg0 + arg1);
		@Pc(103) int local103 = Static310.method1126(Static214.anInt4216, Static312.anInt5850, arg4 - arg0);
		for (local48 = local37; local48 <= local46; local48++) {
			@Pc(112) int[] local112 = Static51.anIntArrayArray1[local48];
			Static109.method1795(local23, local112, local94, arg3);
			Static109.method1795(local103, local112, local29, arg3);
		}
	}

	@OriginalMember(owner = "client!mc", name = "c", descriptor = "(B)V")
	public static void method2789() {
		Static72.aClass146Array1 = null;
		Static50.method875(0, Static159.anInt3348, 0, 0, Static136.anInt2696, 0, Static287.anInt5450, -1);
		if (Static72.aClass146Array1 != null) {
			Static210.method3327(Static72.aClass146Array1, Static159.anInt3348, Static173.anInt3608, 0, Static136.anInt2696, 0, -1412584499, Static87.aClass146_6.anInt4339, Static112.anInt2220);
			Static72.aClass146Array1 = null;
		}
	}
}
