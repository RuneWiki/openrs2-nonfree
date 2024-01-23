import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static242 {

	@OriginalMember(owner = "client!sg", name = "n", descriptor = "I")
	public static int anInt4842 = 0;

	@OriginalMember(owner = "client!sg", name = "o", descriptor = "[I")
	public static int[] anIntArray366 = new int[4096];

	@OriginalMember(owner = "client!sg", name = "r", descriptor = "I")
	public static int anInt4844 = 0;

	@OriginalMember(owner = "client!sg", name = "E", descriptor = "I")
	public static int anInt4854 = -2;

	@OriginalMember(owner = "client!sg", name = "b", descriptor = "(B)J")
	public static long method3645() {
		return Static219.aClass25_1.method1357();
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "()V")
	public static void method3646() {
		@Pc(3) int local3;
		@Pc(9) int local9;
		@Pc(14) int local14;
		if (Static188.aClass8_Sub27ArrayArrayArray2 != null) {
			for (local3 = 0; local3 < Static188.aClass8_Sub27ArrayArrayArray2.length; local3++) {
				for (local9 = 0; local9 < Static24.anInt639; local9++) {
					for (local14 = 0; local14 < Static27.anInt665; local14++) {
						Static188.aClass8_Sub27ArrayArrayArray2[local3][local9][local14] = null;
					}
				}
			}
		}
		Static69.aClass8_Sub29ArrayArray3 = null;
		if (Static228.aClass8_Sub27ArrayArrayArray3 != null) {
			for (local3 = 0; local3 < Static228.aClass8_Sub27ArrayArrayArray3.length; local3++) {
				for (local9 = 0; local9 < Static24.anInt639; local9++) {
					for (local14 = 0; local14 < Static27.anInt665; local14++) {
						Static228.aClass8_Sub27ArrayArrayArray3[local3][local9][local14] = null;
					}
				}
			}
		}
		Static37.aClass8_Sub29ArrayArray5 = null;
		Static153.anInt3126 = 0;
		if (Static236.aClass50Array2 != null) {
			for (local3 = 0; local3 < Static153.anInt3126; local3++) {
				Static236.aClass50Array2[local3] = null;
			}
		}
		if (Static174.aClass170Array1 != null) {
			for (local3 = 0; local3 < Static295.anInt3736; local3++) {
				Static174.aClass170Array1[local3] = null;
			}
			Static295.anInt3736 = 0;
		}
		if (Static197.aClass170Array2 != null) {
			for (local3 = 0; local3 < Static197.aClass170Array2.length; local3++) {
				Static197.aClass170Array2[local3] = null;
			}
		}
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(II)Lclient!b;")
	public static Class12 method3648(@OriginalArg(1) int arg0) {
		@Pc(10) Class12 local10 = (Class12) Static190.aClass61_33.method1384((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(23) byte[] local23 = Static108.aClass132_40.method3194(32, arg0);
		local10 = new Class12();
		if (local23 != null) {
			local10.method285(new Class8_Sub2(local23));
		}
		local10.method281();
		Static190.aClass61_33.method1377((long) arg0, local10);
		return local10;
	}
}
