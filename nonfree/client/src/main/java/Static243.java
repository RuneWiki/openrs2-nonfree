import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static243 {

	@OriginalMember(owner = "client!kca", name = "u", descriptor = "I")
	public static int anInt4851;

	@OriginalMember(owner = "client!kca", name = "n", descriptor = "Lclient!vt;")
	public static final Class306 aClass306_57 = new Class306("rating: ", "Kampfstufe: ", "classement ", "qualificação: ");

	@OriginalMember(owner = "client!kca", name = "r", descriptor = "[Lclient!ge;")
	public static final Class1_Sub6[] aClass1_Sub6Array1 = new Class1_Sub6[2048];

	@OriginalMember(owner = "client!kca", name = "a", descriptor = "(IBI)Z")
	public static boolean method4182(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 == 11) {
			arg0 = 10;
		}
		@Pc(18) Class36 local18 = Static308.aClass96_4.method2274(arg1);
		if (arg0 >= 5 && arg0 <= 8) {
			arg0 = 4;
		}
		return local18.method953(arg0);
	}
}
