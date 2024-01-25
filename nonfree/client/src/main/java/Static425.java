import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static425 {

	@OriginalMember(owner = "client!pca", name = "a", descriptor = "Lclient!ju;")
	public static final Class179 aClass179_92 = new Class179(67, -1);

	@OriginalMember(owner = "client!pca", name = "d", descriptor = "Z")
	public static boolean aBoolean495 = false;

	@OriginalMember(owner = "client!pca", name = "e", descriptor = "I")
	public static int anInt6682 = 0;

	@OriginalMember(owner = "client!pca", name = "a", descriptor = "(ILclient!jm;)Ljava/lang/String;")
	public static String method5665(@OriginalArg(1) Class2_Sub2_Sub11 arg0) {
		if (arg0.aString45 == null || arg0.aString45.length() == 0) {
			return arg0.aString43 == null || arg0.aString43.length() <= 0 ? arg0.aString44 : arg0.aString44 + Static434.aClass271_32.method5972(Static483.anInt7694) + arg0.aString43;
		} else if (arg0.aString43 == null || arg0.aString43.length() <= 0) {
			return arg0.aString44 + Static434.aClass271_32.method5972(Static483.anInt7694) + arg0.aString45;
		} else {
			return arg0.aString44 + Static434.aClass271_32.method5972(Static483.anInt7694) + arg0.aString43 + Static434.aClass271_32.method5972(Static483.anInt7694) + arg0.aString45;
		}
	}

	@OriginalMember(owner = "client!pca", name = "a", descriptor = "(IIZI)V")
	public static void method5667(@OriginalArg(2) boolean arg0) {
		Static452.aBoolean540 = arg0;
		Static283.anInt7446 = 22050;
		Static92.anInt1710 = 2;
	}
}
