import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static298 {

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "[Z")
	public static final boolean[] aBooleanArray26 = new boolean[5];

	@OriginalMember(owner = "client!ss", name = "b", descriptor = "Lclient!cb;")
	public static final Class4_Sub11_Sub1 aClass4_Sub11_Sub1_4 = new Class4_Sub11_Sub1(5000);

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(II)V")
	public static void method4927(@OriginalArg(1) int arg0) {
		if (arg0 == -1 || !Static51.aBooleanArray2[arg0]) {
			return;
		}
		Static92.aClass193_10.method5054(arg0);
		if (Static271.aClass21ArrayArray1[arg0] == null) {
			return;
		}
		@Pc(26) boolean local26 = true;
		for (@Pc(28) int local28 = 0; local28 < Static271.aClass21ArrayArray1[arg0].length; local28++) {
			if (Static271.aClass21ArrayArray1[arg0][local28] != null) {
				if (Static271.aClass21ArrayArray1[arg0][local28].anInt722 == 2) {
					local26 = false;
				} else {
					Static271.aClass21ArrayArray1[arg0][local28] = null;
				}
			}
		}
		if (local26) {
			Static271.aClass21ArrayArray1[arg0] = null;
		}
		Static51.aBooleanArray2[arg0] = false;
	}
}
