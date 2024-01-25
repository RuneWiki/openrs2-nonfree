import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static439 {

	@OriginalMember(owner = "client!pca", name = "i", descriptor = "Lclient!eka;")
	public static Class5_Sub17_Sub1 aClass5_Sub17_Sub1_3;

	@OriginalMember(owner = "client!pca", name = "b", descriptor = "Lclient!uw;")
	public static final Class359 aClass359_157 = new Class359(80, 7);

	@OriginalMember(owner = "client!pca", name = "d", descriptor = "Lclient!hv;")
	public static final Class156 aClass156_7 = new Class156();

	@OriginalMember(owner = "client!pca", name = "g", descriptor = "F")
	public static float aFloat159 = 1.0F;

	@OriginalMember(owner = "client!pca", name = "a", descriptor = "(BLclient!ds;)I")
	public static int method6408(@OriginalArg(1) Class89 arg0) {
		if (arg0 == Static120.aClass89_4) {
			return 5120;
		} else if (Static120.aClass89_5 == arg0) {
			return 5122;
		} else if (Static120.aClass89_6 == arg0) {
			return 5124;
		} else if (arg0 == Static120.aClass89_7) {
			return 5121;
		} else if (arg0 == Static120.aClass89_8) {
			return 5123;
		} else if (arg0 == Static120.aClass89_9) {
			return 5125;
		} else if (arg0 == Static120.aClass89_10) {
			return 5131;
		} else if (arg0 == Static120.aClass89_11) {
			return 5126;
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!pca", name = "a", descriptor = "(IIB)Z")
	public static boolean method6409(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x10) != 0;
	}

	@OriginalMember(owner = "client!pca", name = "a", descriptor = "(III)Z")
	public static boolean method6410(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!pca", name = "b", descriptor = "(I)Lclient!ap;")
	public static Class23 method6411() {
		try {
			return new Class23_Sub2();
		} catch (@Pc(8) Throwable local8) {
			try {
				return (Class23) Class.forName("Class23_Sub3").getDeclaredConstructor().newInstance();
			} catch (@Pc(20) Throwable local20) {
				return new Class23_Sub1();
			}
		}
	}
}
