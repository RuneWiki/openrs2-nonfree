import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static2 {

	@OriginalMember(owner = "client!aa", name = "d", descriptor = "Lclient!fd;")
	public static Class74 aClass74_13;

	@OriginalMember(owner = "client!aa", name = "e", descriptor = "I")
	public static int anInt6973;

	@OriginalMember(owner = "client!aa", name = "g", descriptor = "[Lclient!sm;")
	public static Class219[] aClass219Array10;

	@OriginalMember(owner = "client!aa", name = "c", descriptor = "Z")
	public static final boolean aBoolean470 = false;

	@OriginalMember(owner = "client!aa", name = "f", descriptor = "Lclient!cm;")
	public static final Class36 aClass36_128 = new Class36(41, 3);

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "()V")
	public static void method5381() {
		@Pc(3) int local3;
		@Pc(6) int local6;
		@Pc(9) int local9;
		if (Static301.aClass53ArrayArrayArray4 != null) {
			for (local3 = 0; local3 < Static301.aClass53ArrayArrayArray4.length; local3++) {
				for (local6 = 0; local6 < Static301.anInt5434; local6++) {
					for (local9 = 0; local9 < Static241.anInt4414; local9++) {
						if (Static301.aClass53ArrayArrayArray4[local3][local6][local9] != null) {
							Static301.aClass53ArrayArrayArray4[local3][local6][local9].method1418();
						}
						Static301.aClass53ArrayArrayArray4[local3][local6][local9] = null;
					}
				}
			}
		}
		Static301.aClass53ArrayArrayArray4 = null;
		Static422.aClass146Array3 = null;
		if (Static39.aClass53ArrayArrayArray3 != null) {
			for (local3 = 0; local3 < Static39.aClass53ArrayArrayArray3.length; local3++) {
				for (local6 = 0; local6 < Static301.anInt5434; local6++) {
					for (local9 = 0; local9 < Static241.anInt4414; local9++) {
						if (Static39.aClass53ArrayArrayArray3[local3][local6][local9] != null) {
							Static39.aClass53ArrayArrayArray3[local3][local6][local9].method1418();
						}
						Static39.aClass53ArrayArrayArray3[local3][local6][local9] = null;
					}
				}
			}
		}
		Static39.aClass53ArrayArrayArray3 = null;
		Static117.aClass146Array1 = null;
		Static40.aClass53ArrayArrayArray2 = null;
		Static346.aClass146Array2 = null;
		Static18.anInt561 = 0;
		if (Static108.aClass224Array2 != null) {
			for (local3 = 0; local3 < Static18.anInt561; local3++) {
				Static108.aClass224Array2[local3] = null;
			}
		}
		if (Static69.aClass6_Sub2Array2 != null) {
			for (local3 = 0; local3 < Static332.anInt5825; local3++) {
				Static69.aClass6_Sub2Array2[local3] = null;
			}
			Static332.anInt5825 = 0;
		}
		if (Static200.aClass169Array1 != null) {
			for (local3 = 0; local3 < Static340.anInt6033; local3++) {
				Static200.aClass169Array1[local3] = null;
			}
			for (local6 = 0; local6 < Static338.anInt5952; local6++) {
				for (local9 = 0; local9 < Static301.anInt5434; local9++) {
					for (@Pc(160) int local160 = 0; local160 < Static241.anInt4414; local160++) {
						Static420.aLongArrayArrayArray128[local6][local9][local160] = 0L;
					}
				}
			}
			Static340.anInt6033 = 0;
		}
		Static370.anIntArrayArrayArray14 = null;
		Static427.method5502();
		Static43.aClass27_2.method734();
		Static146.aByteArrayArray3 = null;
		Static74.anIntArrayArray14 = null;
		Static442.aByteArrayArray21 = null;
		Static275.aClass16_1 = null;
		Static398.aClass116_5 = null;
		Static42.aClass30_3 = null;
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(Ljava/awt/Component;Lclient!hu;III)Lclient!fe;")
	public static Class75 method5388(@OriginalArg(0) Component arg0, @OriginalArg(1) Class114 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static410.anInt6810 == 0) {
			throw new IllegalStateException();
		}
		try {
			@Pc(31) Class75 local31 = (Class75) Class.forName("Class75_Sub2").getDeclaredConstructor().newInstance();
			local31.anInt6946 = arg2;
			local31.anIntArray615 = new int[(Static394.aBoolean454 ? 2 : 1) * 256];
			local31.method5352(arg0);
			local31.anInt6943 = (arg2 & 0xFFFFFC00) + 1024;
			if (local31.anInt6943 > 16384) {
				local31.anInt6943 = 16384;
			}
			local31.method5353(local31.anInt6943);
			if (Static277.anInt4890 > 0 && Static362.aClass230_1 == null) {
				Static362.aClass230_1 = new Class230();
				Static362.aClass230_1.aClass114_5 = arg1;
				arg1.method2342(Static277.anInt4890, Static362.aClass230_1);
			}
			if (Static362.aClass230_1 != null) {
				if (Static362.aClass230_1.aClass75Array1[arg3] != null) {
					throw new IllegalArgumentException();
				}
				Static362.aClass230_1.aClass75Array1[arg3] = local31;
			}
			return local31;
		} catch (@Pc(106) Throwable local106) {
			try {
				@Pc(112) Class75_Sub1 local112 = new Class75_Sub1(arg1, arg3);
				local112.anIntArray615 = new int[(Static394.aBoolean454 ? 2 : 1) * 256];
				local112.anInt6946 = arg2;
				local112.method5352(arg0);
				local112.anInt6943 = 16384;
				local112.method5353(local112.anInt6943);
				if (Static277.anInt4890 > 0 && Static362.aClass230_1 == null) {
					Static362.aClass230_1 = new Class230();
					Static362.aClass230_1.aClass114_5 = arg1;
					arg1.method2342(Static277.anInt4890, Static362.aClass230_1);
				}
				if (Static362.aClass230_1 != null) {
					if (Static362.aClass230_1.aClass75Array1[arg3] != null) {
						throw new IllegalArgumentException();
					}
					Static362.aClass230_1.aClass75Array1[arg3] = local112;
				}
				return local112;
			} catch (@Pc(171) Throwable local171) {
				return new Class75();
			}
		}
	}
}
