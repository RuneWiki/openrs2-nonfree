import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static342 {

	@OriginalMember(owner = "client!wa", name = "w", descriptor = "Lclient!fc;")
	public static Class69 aClass69_6;

	@OriginalMember(owner = "client!wa", name = "A", descriptor = "[Lclient!sg;")
	public static Class97[] aClass97Array27;

	@OriginalMember(owner = "client!wa", name = "B", descriptor = "[Lclient!sg;")
	public static Class97[] aClass97Array28;

	@OriginalMember(owner = "client!wa", name = "C", descriptor = "Lclient!nq;")
	public static Class144 aClass144_111;

	@OriginalMember(owner = "client!wa", name = "F", descriptor = "Ljava/lang/String;")
	public static String aString65;

	@OriginalMember(owner = "client!wa", name = "x", descriptor = "Lclient!bj;")
	public static final Class26 aClass26_60 = new Class26(64);

	@OriginalMember(owner = "client!wa", name = "d", descriptor = "(B)V")
	public static void method5582() {
		if (Static164.anInt3087 != -1) {
			Static277.method4679(-1, Static164.anInt3087, -1, false);
			Static164.anInt3087 = -1;
		}
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(ZI)I")
	public static int method5583(@OriginalArg(1) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(BLclient!nq;)V")
	public static void method5585(@OriginalArg(1) Class144 arg0) {
		Static318.anInt6177 = 0;
		Static245.anInt6563 = 0;
		Static220.aClass210_11 = new Class210();
		Static190.aClass10_Sub3_Sub1_Sub1Array2 = new Class10_Sub3_Sub1_Sub1[1024];
		Static56.method846(arg0);
		Static265.method4603(arg0);
	}
}
