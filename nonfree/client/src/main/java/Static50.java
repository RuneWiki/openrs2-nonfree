import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static50 {

	@OriginalMember(owner = "client!bt", name = "u", descriptor = "I")
	public static int anInt1092;

	@OriginalMember(owner = "client!bt", name = "o", descriptor = "I")
	public static int anInt1086 = 1;

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(B)Lclient!ca;")
	public static Class38 method1151() {
		try {
			return (Class38) Class.forName("Class38_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(15) Throwable local15) {
			return null;
		}
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(BLclient!ew;)I")
	public static int method1154(@OriginalArg(1) Class89 arg0) {
		if (arg0 == Static137.aClass89_5) {
			return 5120;
		} else if (arg0 == Static137.aClass89_6) {
			return 5122;
		} else if (Static137.aClass89_7 == arg0) {
			return 5124;
		} else if (Static137.aClass89_8 == arg0) {
			return 5121;
		} else if (arg0 == Static137.aClass89_9) {
			return 5123;
		} else if (arg0 == Static137.aClass89_10) {
			return 5125;
		} else if (arg0 == Static137.aClass89_11) {
			return 5131;
		} else if (Static137.aClass89_12 == arg0) {
			return 5126;
		} else {
			throw new IllegalArgumentException("");
		}
	}
}
