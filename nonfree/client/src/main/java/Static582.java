import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static582 {

	@OriginalMember(owner = "client!we", name = "J", descriptor = "Z")
	public static boolean aBoolean788;

	@OriginalMember(owner = "client!we", name = "M", descriptor = "I")
	public static int anInt9451;

	@OriginalMember(owner = "client!we", name = "B", descriptor = "[[F")
	public static final float[][] aFloatArrayArray15 = new float[][] { { -0.333333F, -0.333333F, -0.333333F }, { 0.333333F, -0.333333F, -0.333333F }, { -0.333333F, 0.333333F, -0.333333F }, { 0.333333F, 0.333333F, -0.333333F }, { -0.333333F, -0.333333F, 0.333333F }, { 0.333333F, -0.333333F, 0.333333F }, { -0.333333F, 0.333333F, 0.333333F }, { 0.333333F, 0.333333F, 0.333333F } };

	@OriginalMember(owner = "client!we", name = "C", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray44 = new String[100];

	@OriginalMember(owner = "client!we", name = "D", descriptor = "Z")
	public static boolean aBoolean787 = false;

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(Lclient!bk;B)I")
	public static int method7549(@OriginalArg(0) Class35 arg0) {
		if (Static42.aClass35_1 == arg0) {
			return 5120;
		} else if (Static42.aClass35_2 == arg0) {
			return 5122;
		} else if (arg0 == Static42.aClass35_3) {
			return 5124;
		} else if (arg0 == Static42.aClass35_4) {
			return 5121;
		} else if (Static42.aClass35_5 == arg0) {
			return 5123;
		} else if (Static42.aClass35_6 == arg0) {
			return 5125;
		} else if (Static42.aClass35_7 == arg0) {
			return 5131;
		} else if (Static42.aClass35_8 == arg0) {
			return 5126;
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(III)Z")
	public static boolean method7550(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static543.method7105(arg1, arg0)) {
			return Static176.method2283(arg1, arg0) | (arg1 & 0x9000) != 0 | Static220.method2684(arg0, arg1) ? true : (Static503.method6531(arg0, arg1) | (arg1 & 0x2000) != 0 | Static416.method2252(arg1, arg0)) & (arg0 & 0x37) == 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(IIB)Z")
	public static boolean method7551(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return false;
	}

	@OriginalMember(owner = "client!we", name = "b", descriptor = "(III)Z")
	public static boolean method7552(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x20) != 0;
	}
}
