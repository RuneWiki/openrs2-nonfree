import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static184 {

	@OriginalMember(owner = "client!jf", name = "g", descriptor = "Lclient!hh;")
	public static Class109 aClass109_48;

	@OriginalMember(owner = "client!jf", name = "i", descriptor = "I")
	public static int anInt3445;

	@OriginalMember(owner = "client!jf", name = "d", descriptor = "Lclient!ao;")
	public static final Class12 aClass12_179 = new Class12(80, 12);

	@OriginalMember(owner = "client!jf", name = "f", descriptor = "Lclient!gf;")
	public static final Class96 aClass96_52 = new Class96("Loading additional fonts - ", "Lade Zusatzschriftarten - ", "Chargement de polices secondaires - ", "Carregando fontes principais - ");

	@OriginalMember(owner = "client!jf", name = "h", descriptor = "Lclient!vp;")
	public static final Class254 aClass254_75 = new Class254(36, 11);

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(ILclient!ti;)Lclient!ie;")
	public static Class9_Sub2 method2955(@OriginalArg(1) Class1_Sub14 arg0) {
		return new Class9_Sub2(arg0.method4531(), arg0.method4531(), arg0.method4531(), arg0.method4531(), arg0.method4496(), arg0.method4496(), arg0.method4548());
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(II)V")
	public static void method2956(@OriginalArg(0) int arg0) {
		if (-1 != arg0 && Static65.aBooleanArray5[arg0]) {
			Static2.aClass109_1.method2336(arg0);
			Static276.aClass229ArrayArray1[arg0] = null;
			Static423.aClass229ArrayArray2[arg0] = null;
			Static65.aBooleanArray5[arg0] = false;
		}
	}
}
