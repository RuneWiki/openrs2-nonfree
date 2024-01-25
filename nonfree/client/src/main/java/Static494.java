import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static494 {

	@OriginalMember(owner = "client!rf", name = "c", descriptor = "[I")
	public static final int[] anIntArray565 = new int[2048];

	@OriginalMember(owner = "client!rf", name = "h", descriptor = "I")
	public static int anInt7890 = -1;

	@OriginalMember(owner = "client!rf", name = "m", descriptor = "[Lclient!lk;")
	public static final Class2_Sub31[] aClass2_Sub31Array1 = new Class2_Sub31[300];

	@OriginalMember(owner = "client!rf", name = "r", descriptor = "[I")
	public static int[] anIntArray569 = new int[2];

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(Lclient!nfa;ILclient!nfa;)V")
	public static void method6914(@OriginalArg(0) Class16 arg0, @OriginalArg(2) Class16 arg1) {
		if (arg1.aClass16_68 != null) {
			arg1.method8874();
		}
		arg1.aClass16_67 = arg0;
		arg1.aClass16_68 = arg0.aClass16_68;
		arg1.aClass16_68.aClass16_67 = arg1;
		arg1.aClass16_67.aClass16_68 = arg1;
	}
}
