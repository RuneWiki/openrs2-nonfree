import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static491 {

	@OriginalMember(owner = "client!sk", name = "p", descriptor = "I")
	public static int anInt7778;

	@OriginalMember(owner = "client!sk", name = "q", descriptor = "[I")
	public static int[] anIntArray519;

	@OriginalMember(owner = "client!sk", name = "e", descriptor = "I")
	public static int anInt7770 = -1;

	@OriginalMember(owner = "client!sk", name = "g", descriptor = "Lclient!pca;")
	public static final Class263 aClass263_3 = new Class263();

	@OriginalMember(owner = "client!sk", name = "r", descriptor = "Lclient!iba;")
	public static final Class154 aClass154_105 = new Class154(13, 3);

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(Lclient!jw;I)Ljava/lang/String;")
	public static String method6283(@OriginalArg(0) Class2_Sub27 arg0) {
		return arg0.aString53 == null || arg0.aString53.length() <= 0 ? arg0.aString52 : arg0.aString52 + Static229.aClass159_34.method2776(Static261.anInt4297) + arg0.aString53;
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(IILclient!po;II)Z")
	public static boolean method6285(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class12_Sub2_Sub5 arg2, @OriginalArg(3) int arg3) {
		if (!Static431.aBoolean567) {
			return false;
		} else if (Static427.anInt6937 < 100) {
			return false;
		} else if (Static158.method6599(arg1, arg0, arg3)) {
			@Pc(26) int local26 = arg3 << Static562.anInt9207;
			@Pc(30) int local30 = arg1 << Static562.anInt9207;
			@Pc(40) int local40 = Static114.aClass151Array1[arg0].method7676(arg1, arg3) - 1;
			@Pc(46) int local46 = arg2.method7501() + local40;
			if (arg2.aShort116 == 1) {
				if (!Static523.method6730(local30, local26, Static481.anInt7681 + local30, local26, local26, local46, local46, local40, local30)) {
					return false;
				} else if (Static523.method6730(local30, local26, Static481.anInt7681 + local30, local26, local26, local40, local46, local40, local30 + Static481.anInt7681)) {
					Static583.anInt9471++;
					return true;
				} else {
					return false;
				}
			} else if (arg2.aShort116 == 2) {
				if (!Static523.method6730(local30 + Static481.anInt7681, Static481.anInt7681 + local26, Static481.anInt7681 + local30, local26, local26, local46, local46, local40, local30 + Static481.anInt7681)) {
					return false;
				} else if (Static523.method6730(local30 + Static481.anInt7681, local26 + Static481.anInt7681, local30 + Static481.anInt7681, local26 + Static481.anInt7681, local26, local46, local40, local40, Static481.anInt7681 + local30)) {
					Static583.anInt9471++;
					return true;
				} else {
					return false;
				}
			} else if (arg2.aShort116 == 4) {
				if (!Static523.method6730(local30, Static481.anInt7681 + local26, Static481.anInt7681 + local30, Static481.anInt7681 + local26, local26 + Static481.anInt7681, local46, local46, local40, local30)) {
					return false;
				} else if (Static523.method6730(local30, Static481.anInt7681 + local26, local30 - -Static481.anInt7681, local26 + Static481.anInt7681, Static481.anInt7681 + local26, local40, local46, local40, Static481.anInt7681 + local30)) {
					Static583.anInt9471++;
					return true;
				} else {
					return false;
				}
			} else if (arg2.aShort116 == 8) {
				if (!Static523.method6730(local30, local26 + Static481.anInt7681, local30, local26, local26, local46, local46, local40, local30)) {
					return false;
				} else if (Static523.method6730(local30, Static481.anInt7681 + local26, local30, Static481.anInt7681 + local26, local26, local46, local40, local40, local30)) {
					Static583.anInt9471++;
					return true;
				} else {
					return false;
				}
			} else if (arg2.aShort116 == 16) {
				if (Static216.method7683(Static437.anInt7021 + local30, local40, Static437.anInt7021, local46, Static437.anInt7021, local26)) {
					Static583.anInt9471++;
					return true;
				} else {
					return false;
				}
			} else if (arg2.aShort116 == 32) {
				if (Static216.method7683(Static437.anInt7021 + local30, local40, Static437.anInt7021, local46, Static437.anInt7021, Static437.anInt7021 + local26)) {
					Static583.anInt9471++;
					return true;
				} else {
					return false;
				}
			} else if (arg2.aShort116 == 64) {
				if (Static216.method7683(local30, local40, Static437.anInt7021, local46, Static437.anInt7021, Static437.anInt7021 + local26)) {
					Static583.anInt9471++;
					return true;
				} else {
					return false;
				}
			} else if (arg2.aShort116 != 128) {
				return true;
			} else if (Static216.method7683(local30, local40, Static437.anInt7021, local46, Static437.anInt7021, local26)) {
				Static583.anInt9471++;
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}
}
