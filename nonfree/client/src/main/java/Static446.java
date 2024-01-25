import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static446 {

	@OriginalMember(owner = "client!pca", name = "p", descriptor = "Lclient!gda;")
	public static Class126 aClass126_207;

	@OriginalMember(owner = "client!pca", name = "A", descriptor = "Lclient!eb;")
	public static Class36 aClass36_1;

	@OriginalMember(owner = "client!pca", name = "u", descriptor = "I")
	public static int anInt7317;

	@OriginalMember(owner = "client!pca", name = "t", descriptor = "I")
	public static int anInt7312 = 0;

	@OriginalMember(owner = "client!pca", name = "y", descriptor = "Lclient!hl;")
	public static final Class156 aClass156_140 = new Class156(28, 6);

	@OriginalMember(owner = "client!pca", name = "r", descriptor = "Ljava/lang/String;")
	public static String aString85 = "";

	@OriginalMember(owner = "client!pca", name = "v", descriptor = "I")
	public static int anInt7316 = 0;

	@OriginalMember(owner = "client!pca", name = "x", descriptor = "J")
	public static long aLong213 = 0L;

	@OriginalMember(owner = "client!pca", name = "c", descriptor = "(I)Lclient!wq;")
	public static Class5_Sub36 method6374() {
		@Pc(6) Class5_Sub36 local6 = Static346.method4443();
		local6.method7329(0L);
		local6.method7327(Static357.aString67);
		local6.method7329(aLong213);
		local6.method7329(Static584.aLong270);
		local6.method7305(Static283.aBigInteger1, Static489.aBigInteger5);
		return local6;
	}

	@OriginalMember(owner = "client!pca", name = "b", descriptor = "(II)Z")
	public static boolean method6376(@OriginalArg(1) int arg0) {
		return arg0 == 7 || arg0 == 9;
	}
}
