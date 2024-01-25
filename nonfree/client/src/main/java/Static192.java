import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static192 {

	@OriginalMember(owner = "client!jn", name = "i", descriptor = "I")
	public static int anInt3847;

	@OriginalMember(owner = "client!jn", name = "e", descriptor = "Lclient!ef;")
	public static final Class61 aClass61_4 = new Class61(12, 0, 1, 0);

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(B)V")
	public static void method3070() {
		Static105.anImage2 = null;
		Static407.aFont1 = null;
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(BI)V")
	public static void method3072(@OriginalArg(1) int arg0) {
		if (arg0 != -1 && Static414.aBooleanArray22[arg0]) {
			Static369.aClass32_79.method799(arg0);
			Static178.aClass156ArrayArray2[arg0] = null;
			Static111.aClass156ArrayArray1[arg0] = null;
			Static414.aBooleanArray22[arg0] = false;
		}
	}
}
