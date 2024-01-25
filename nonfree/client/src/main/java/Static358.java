import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static358 {

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "Lclient!wd;")
	public static Class354 aClass354_3;

	@OriginalMember(owner = "client!nr", name = "h", descriptor = "I")
	public static int anInt6975;

	@OriginalMember(owner = "client!nr", name = "g", descriptor = "I")
	public static int anInt6974 = 500;

	@OriginalMember(owner = "client!nr", name = "m", descriptor = "[[B")
	public static final byte[][] aByteArrayArray20 = new byte[50][];

	@OriginalMember(owner = "client!nr", name = "q", descriptor = "I")
	public static int anInt6981 = 0;

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(ZLjava/lang/String;)I")
	public static int method5788(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return -1;
		}
		for (@Pc(11) int local11 = 0; local11 < Static493.anInt8959; local11++) {
			if (arg0.equalsIgnoreCase(Static220.aStringArray22[local11])) {
				return local11;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!nr", name = "b", descriptor = "(I)V")
	public static void method5795() {
		Static365.aClass4_Sub39_2 = new Class4_Sub39(Static590.aClass364_8.method8334(Static154.anInt3181), "", Static180.anInt3622, 1003, -1, 0L, 0, 0, true, false);
	}
}
