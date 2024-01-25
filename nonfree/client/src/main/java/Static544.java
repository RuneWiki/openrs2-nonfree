import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static544 {

	@OriginalMember(owner = "client!si", name = "b", descriptor = "Lclient!fba;")
	public static final Class100 aClass100_116 = new Class100(80, -1);

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(II)V")
	public static void method7681(@OriginalArg(1) int arg0) {
		if (arg0 != -1 && Static44.aBooleanArray3[arg0]) {
			Static561.aClass386_120.method9186(arg0);
			Static559.aClass230ArrayArray2[arg0] = null;
			Static46.aClass230ArrayArray1[arg0] = null;
			Static44.aBooleanArray3[arg0] = false;
		}
	}
}
