import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static290 {

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray17;

	@OriginalMember(owner = "client!vb", name = "c", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray45 = new String[8];

	@OriginalMember(owner = "client!vb", name = "e", descriptor = "Lclient!jl;")
	public static Class89 aClass89_48 = new Class89(64);

	@OriginalMember(owner = "client!vb", name = "g", descriptor = "Lclient!wf;")
	public static Class191 aClass191_16 = null;

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(B)V")
	public static void method4442() {
		if (Static148.aBoolean217) {
			return;
		}
		if (Static211.aBoolean285) {
			Static62.aFloat16 = (int) Static62.aFloat16 + 191 & 0xFFFFFF80;
		} else {
			Static96.aFloat30 += (24.0F - Static96.aFloat30) / 2.0F;
		}
		Static148.aBoolean217 = true;
		Static136.aBoolean193 = true;
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "()V")
	public static void method4444() {
		@Pc(3) int local3;
		@Pc(9) int local9;
		@Pc(14) int local14;
		if (Static151.aClass1_Sub2ArrayArrayArray4 != null) {
			for (local3 = 0; local3 < Static151.aClass1_Sub2ArrayArrayArray4.length; local3++) {
				for (local9 = 0; local9 < Static90.anInt2091; local9++) {
					for (local14 = 0; local14 < Static77.anInt1766; local14++) {
						Static151.aClass1_Sub2ArrayArrayArray4[local3][local9][local14] = null;
					}
				}
			}
		}
		Static261.aClass1_Sub28ArrayArray3 = null;
		if (Static86.aClass1_Sub2ArrayArrayArray3 != null) {
			for (local3 = 0; local3 < Static86.aClass1_Sub2ArrayArrayArray3.length; local3++) {
				for (local9 = 0; local9 < Static90.anInt2091; local9++) {
					for (local14 = 0; local14 < Static77.anInt1766; local14++) {
						Static86.aClass1_Sub2ArrayArrayArray3[local3][local9][local14] = null;
					}
				}
			}
		}
		Static183.aClass1_Sub28ArrayArray2 = null;
		Static13.anInt357 = 0;
		if (Static41.aClass9Array1 != null) {
			for (local3 = 0; local3 < Static13.anInt357; local3++) {
				Static41.aClass9Array1[local3] = null;
			}
		}
		if (Static259.aClass7Array3 != null) {
			for (local3 = 0; local3 < Static165.anInt3670; local3++) {
				Static259.aClass7Array3[local3] = null;
			}
			Static165.anInt3670 = 0;
		}
		if (Static29.aClass7Array2 != null) {
			for (local3 = 0; local3 < Static29.aClass7Array2.length; local3++) {
				Static29.aClass7Array2[local3] = null;
			}
		}
	}
}
