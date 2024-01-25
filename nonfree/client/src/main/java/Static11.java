import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static11 {

	@OriginalMember(owner = "client!ak", name = "D", descriptor = "I")
	public static int anInt231;

	@OriginalMember(owner = "client!ak", name = "o", descriptor = "Lclient!lh;")
	public static final Class151 aClass151_9 = new Class151(64);

	@OriginalMember(owner = "client!ak", name = "A", descriptor = "Lclient!sv;")
	public static final Class222 aClass222_2 = new Class222(8, 0, 4, 1);

	@OriginalMember(owner = "client!ak", name = "B", descriptor = "Lclient!sv;")
	public static final Class222 aClass222_3 = new Class222(9, 0, 4, 1);

	@OriginalMember(owner = "client!ak", name = "C", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray2 = new String[100];

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(Lclient!at;IIII)V")
	public static void method188(@OriginalArg(0) Class17 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg1 == 1 && arg3 > 0) {
			Static322.method3369(arg0, arg2, arg3 - 1, arg4);
		} else if (arg1 == 4 && arg3 <= Static251.anInt4344) {
			Static322.method3369(arg0, arg2, arg3 + 1, arg4);
		} else if (arg1 == 8 && arg4 > 0) {
			Static322.method3369(arg0, arg2, arg3, arg4 - 1);
		} else if (arg1 == 2 && arg4 <= Static219.anInt3872) {
			Static322.method3369(arg0, arg2, arg3, arg4 + 1);
		} else if (arg1 == 16 && arg3 > 0 && arg4 <= Static219.anInt3872) {
			Static322.method3369(arg0, arg2, arg3 - 1, arg4 + 1);
		} else if (arg1 == 32 && arg3 <= Static251.anInt4344 && arg4 <= Static219.anInt3872) {
			Static322.method3369(arg0, arg2, arg3 + 1, arg4 + 1);
		} else if (arg1 == 128 && arg3 > 0 && arg4 > 0) {
			Static322.method3369(arg0, arg2, arg3 - 1, arg4 - 1);
		} else if (arg1 == 64 && arg3 <= Static251.anInt4344 && arg4 > 0) {
			Static322.method3369(arg0, arg2, arg3 + 1, arg4 - 1);
		} else {
			throw new RuntimeException("Unsupported wall shape " + arg1 + " in world2.setclosestlights_wall");
		}
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(II)V")
	public static void method189(@OriginalArg(0) int arg0) {
		@Pc(13) Class1_Sub1_Sub1 local13 = Static190.method3007(arg0, 5);
		local13.method28();
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "()V")
	public static void method190() {
		@Pc(3) int local3;
		@Pc(6) int local6;
		@Pc(9) int local9;
		if (Static346.aClass137ArrayArrayArray3 != null) {
			for (local3 = 0; local3 < Static346.aClass137ArrayArrayArray3.length; local3++) {
				for (local6 = 0; local6 < Static251.anInt4344; local6++) {
					for (local9 = 0; local9 < Static219.anInt3872; local9++) {
						if (Static346.aClass137ArrayArrayArray3[local3][local6][local9] != null) {
							Static346.aClass137ArrayArrayArray3[local3][local6][local9].method3111();
						}
						Static346.aClass137ArrayArrayArray3[local3][local6][local9] = null;
					}
				}
			}
		}
		Static346.aClass137ArrayArrayArray3 = null;
		Static60.aClass70Array1 = null;
		if (Static33.aClass137ArrayArrayArray1 != null) {
			for (local3 = 0; local3 < Static33.aClass137ArrayArrayArray1.length; local3++) {
				for (local6 = 0; local6 < Static251.anInt4344; local6++) {
					for (local9 = 0; local9 < Static219.anInt3872; local9++) {
						if (Static33.aClass137ArrayArrayArray1[local3][local6][local9] != null) {
							Static33.aClass137ArrayArrayArray1[local3][local6][local9].method3111();
						}
						Static33.aClass137ArrayArrayArray1[local3][local6][local9] = null;
					}
				}
			}
		}
		Static33.aClass137ArrayArrayArray1 = null;
		Static315.aClass70Array3 = null;
		Static131.aClass137ArrayArrayArray2 = null;
		Static256.aClass70Array2 = null;
		Static208.anInt3763 = 0;
		if (Static264.aClass41Array2 != null) {
			for (local3 = 0; local3 < Static208.anInt3763; local3++) {
				Static264.aClass41Array2[local3] = null;
			}
		}
		if (Static83.aClass47_Sub1Array6 != null) {
			for (local3 = 0; local3 < Static93.anInt1805; local3++) {
				Static83.aClass47_Sub1Array6[local3] = null;
			}
			Static93.anInt1805 = 0;
		}
		if (Static352.aClass253Array1 != null) {
			for (local3 = 0; local3 < Static121.anInt2306; local3++) {
				Static352.aClass253Array1[local3] = null;
			}
			for (local6 = 0; local6 < Static29.anInt482; local6++) {
				for (local9 = 0; local9 < Static251.anInt4344; local9++) {
					for (@Pc(160) int local160 = 0; local160 < Static219.anInt3872; local160++) {
						Static392.aLongArrayArrayArray1[local6][local9][local160] = 0L;
					}
				}
			}
			Static121.anInt2306 = 0;
		}
		Static291.anIntArrayArrayArray141 = null;
		Static428.method5775();
		Static249.aClass242_3.method5505();
		Static152.aByteArrayArray13 = null;
		Static283.anIntArrayArray32 = null;
		Static376.aByteArrayArray26 = null;
		Static68.aClass143_1 = null;
		Static323.aClass43_3 = null;
		Static74.aClass121_3 = null;
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(IBIIII)V")
	public static void method191(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		for (@Pc(7) int local7 = arg0; local7 <= arg1; local7++) {
			Static23.method323(Static283.anIntArrayArray30[local7], arg3, arg2, arg4);
		}
	}
}
