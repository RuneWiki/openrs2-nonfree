import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static422 {

	@OriginalMember(owner = "client!oia", name = "k", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray3;

	@OriginalMember(owner = "client!oia", name = "n", descriptor = "Lclient!uw;")
	public static final Class359 aClass359_151 = new Class359(105, 5);

	@OriginalMember(owner = "client!oia", name = "a", descriptor = "(BI)[I")
	public static int[] method6267(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = new int[3];
		Static493.method7070(Static644.method8661(arg0));
		local11[0] = Static158.aCalendar2.get(5);
		local11[1] = Static158.aCalendar2.get(2);
		local11[2] = Static158.aCalendar2.get(1);
		return local11;
	}

	@OriginalMember(owner = "client!oia", name = "a", descriptor = "(I)Ljava/lang/String;")
	public static String method6268() {
		return Static493.aBoolean702 || Static355.aClass5_Sub3_Sub20_3 == null ? "" : Static355.aClass5_Sub3_Sub20_3.aString100;
	}

	@OriginalMember(owner = "client!oia", name = "a", descriptor = "(II)V")
	public static void method6270(@OriginalArg(0) int arg0) {
		if (Static470.anIntArray446 == null || Static470.anIntArray446.length < arg0) {
			Static470.anIntArray446 = new int[arg0];
		}
	}
}
