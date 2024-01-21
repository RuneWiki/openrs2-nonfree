import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static37 {

	@OriginalMember(owner = "client!de", name = "c", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_254 = Static158.method3034("leuchten2:");

	@OriginalMember(owner = "client!de", name = "d", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_255 = Static158.method3034(":duelfriend:");

	@OriginalMember(owner = "client!de", name = "e", descriptor = "Lclient!ob;")
	private static final Class60 aClass60_256 = Static158.method3034("Please try again)3");

	@OriginalMember(owner = "client!de", name = "g", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_257 = Static158.method3034(":assist:");

	@OriginalMember(owner = "client!de", name = "h", descriptor = "Lclient!ob;")
	public static Class60 aClass60_258 = aClass60_256;

	@OriginalMember(owner = "client!de", name = "j", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_259 = Static158.method3034("::qa_op_test");

	@OriginalMember(owner = "client!de", name = "k", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_260 = Static158.method3034("Fertigkeit)2");

	@OriginalMember(owner = "client!de", name = "n", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_261 = Static158.method3034(":trade:");

	@OriginalMember(owner = "client!de", name = "p", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_262 = Static158.method3034("Ihre Ignorieren)2Liste ist voll)1 Sie k-Onnen nur 100 Spieler darauf eintragen)3");

	@OriginalMember(owner = "client!de", name = "r", descriptor = "[I")
	public static final int[] anIntArray100 = new int[25];

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(II)V")
	public static void method831(@OriginalArg(1) int arg0) {
		if (arg0 == -1 || !Static65.aBooleanArray9[arg0]) {
			return;
		}
		Static151.aClass13_18.method528(arg0);
		if (Static197.aClass72ArrayArray1[arg0] == null) {
			return;
		}
		@Pc(33) boolean local33 = true;
		for (@Pc(35) int local35 = 0; local35 < Static197.aClass72ArrayArray1[arg0].length; local35++) {
			if (Static197.aClass72ArrayArray1[arg0][local35] != null) {
				if (Static197.aClass72ArrayArray1[arg0][local35].anInt3932 == 2) {
					local33 = false;
				} else {
					Static197.aClass72ArrayArray1[arg0][local35] = null;
				}
			}
		}
		if (local33) {
			Static197.aClass72ArrayArray1[arg0] = null;
		}
		Static65.aBooleanArray9[arg0] = false;
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "([[II)V")
	public static void method833(@OriginalArg(0) int[][] arg0) {
		Static42.anIntArrayArray8 = arg0;
	}
}
