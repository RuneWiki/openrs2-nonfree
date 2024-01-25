import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static440 {

	@OriginalMember(owner = "client!wh", name = "b", descriptor = "Lclient!jk;")
	public static Class128 aClass128_8;

	@OriginalMember(owner = "client!wh", name = "c", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray17;

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(ILclient!js;ZLjava/awt/Component;I)Lclient!ou;")
	public static Class141 method5945(@OriginalArg(0) int arg0, @OriginalArg(1) Class131 arg1, @OriginalArg(3) Component arg2, @OriginalArg(4) int arg3) {
		if (Static369.anInt6566 == 0) {
			throw new IllegalStateException();
		}
		try {
			@Pc(30) Class141 local30 = (Class141) Class.forName("Class141_Sub2").getDeclaredConstructor().newInstance();
			local30.anInt6626 = arg3;
			local30.anIntArray440 = new int[(Static451.aBoolean125 ? 2 : 1) * 256];
			local30.method5189(arg2);
			local30.anInt6628 = (arg3 & 0xFFFFFC00) + 1024;
			if (local30.anInt6628 > 16384) {
				local30.anInt6628 = 16384;
			}
			local30.method5191(local30.anInt6628);
			if (Static288.anInt5229 > 0 && Static4.aClass48_1 == null) {
				Static4.aClass48_1 = new Class48();
				Static4.aClass48_1.aClass131_2 = arg1;
				arg1.method3045(Static288.anInt5229, Static4.aClass48_1);
			}
			if (Static4.aClass48_1 != null) {
				if (Static4.aClass48_1.aClass141Array1[arg0] != null) {
					throw new IllegalArgumentException();
				}
				Static4.aClass48_1.aClass141Array1[arg0] = local30;
			}
			return local30;
		} catch (@Pc(105) Throwable local105) {
			try {
				@Pc(111) Class141_Sub1 local111 = new Class141_Sub1(arg1, arg0);
				local111.anInt6626 = arg3;
				local111.anIntArray440 = new int[(Static451.aBoolean125 ? 2 : 1) * 256];
				local111.method5189(arg2);
				local111.anInt6628 = 16384;
				local111.method5191(local111.anInt6628);
				if (Static288.anInt5229 > 0 && Static4.aClass48_1 == null) {
					Static4.aClass48_1 = new Class48();
					Static4.aClass48_1.aClass131_2 = arg1;
					arg1.method3045(Static288.anInt5229, Static4.aClass48_1);
				}
				if (Static4.aClass48_1 != null) {
					if (Static4.aClass48_1.aClass141Array1[arg0] != null) {
						throw new IllegalArgumentException();
					}
					Static4.aClass48_1.aClass141Array1[arg0] = local111;
				}
				return local111;
			} catch (@Pc(175) Throwable local175) {
				return new Class141();
			}
		}
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(B)V")
	public static void method5946() {
		Static91.anInt2066 = 0;
		Static296.anInt5335 = 0;
		Static282.anInt5151 = -1;
		Static33.anInt668 = -3;
		Static414.aBoolean377 = false;
		Static95.anInt2154 = 0;
		Static398.anInt5978 = 1;
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(IIILclient!qa;)V")
	public static void method5947(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class26 arg2) {
		Static184.aClass26_4 = arg2;
		Static404.aClass68ArrayArray1 = new Class68[arg1][arg0];
		if (Static336.anIntArray384 != null) {
			Static376.aClass21_3 = Static256.method3901(Static336.anIntArray384[0], Static336.anIntArray384[4], Static336.anIntArray384[1], Static336.anIntArray384[2], Static336.anIntArray384[3], Static336.anIntArray384[5]);
		}
		Static221.aClass68_1 = new Class68();
		Static131.method1913();
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "()V")
	public static void method5948() {
		@Pc(3) int local3;
		@Pc(6) int local6;
		@Pc(9) int local9;
		if (Static79.aClass113ArrayArrayArray2 != null) {
			for (local3 = 0; local3 < Static79.aClass113ArrayArrayArray2.length; local3++) {
				for (local6 = 0; local6 < Static86.anInt2009; local6++) {
					for (local9 = 0; local9 < Static360.anInt6340; local9++) {
						if (Static79.aClass113ArrayArrayArray2[local3][local6][local9] != null) {
							Static79.aClass113ArrayArrayArray2[local3][local6][local9].method2567();
						}
						Static79.aClass113ArrayArrayArray2[local3][local6][local9] = null;
					}
				}
			}
		}
		Static79.aClass113ArrayArrayArray2 = null;
		Static72.aClass106Array4 = null;
		if (Static3.aClass113ArrayArrayArray1 != null) {
			for (local3 = 0; local3 < Static3.aClass113ArrayArrayArray1.length; local3++) {
				for (local6 = 0; local6 < Static86.anInt2009; local6++) {
					for (local9 = 0; local9 < Static360.anInt6340; local9++) {
						if (Static3.aClass113ArrayArrayArray1[local3][local6][local9] != null) {
							Static3.aClass113ArrayArrayArray1[local3][local6][local9].method2567();
						}
						Static3.aClass113ArrayArrayArray1[local3][local6][local9] = null;
					}
				}
			}
		}
		Static3.aClass113ArrayArrayArray1 = null;
		Static77.aClass106Array12 = null;
		Static176.aClass113ArrayArrayArray3 = null;
		Static372.aClass106Array11 = null;
		Static334.anInt5941 = 0;
		if (Static325.aClass1Array2 != null) {
			for (local3 = 0; local3 < Static334.anInt5941; local3++) {
				Static325.aClass1Array2[local3] = null;
			}
		}
		if (Static428.aClass4_Sub2Array3 != null) {
			for (local3 = 0; local3 < Static450.anInt7838; local3++) {
				Static428.aClass4_Sub2Array3[local3] = null;
			}
			Static450.anInt7838 = 0;
		}
		if (Static77.aClass168Array9 != null) {
			for (local3 = 0; local3 < Static149.anInt2847; local3++) {
				Static77.aClass168Array9[local3] = null;
			}
			for (local6 = 0; local6 < Static58.anInt1578; local6++) {
				for (local9 = 0; local9 < Static86.anInt2009; local9++) {
					for (@Pc(160) int local160 = 0; local160 < Static360.anInt6340; local160++) {
						Static427.aLongArrayArrayArray1[local6][local9][local160] = 0L;
					}
				}
			}
			Static149.anInt2847 = 0;
		}
		Static162.anIntArrayArrayArray5 = null;
		Static190.method3001();
		Static346.aClass184_6.method4216();
		Static87.aByteArrayArray6 = null;
		Static72.anIntArrayArray29 = null;
		Static280.aByteArrayArray15 = null;
		Static151.aClass125_1 = null;
		Static181.aClass102_3 = null;
		Static444.aClass26_11 = null;
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(IBII)I")
	public static int method5950(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg0 >= arg2) {
			return arg0 <= arg1 ? arg0 : arg1;
		} else {
			return arg2;
		}
	}
}
