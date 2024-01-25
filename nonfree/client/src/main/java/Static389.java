import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static389 {

	@OriginalMember(owner = "client!pa", name = "c", descriptor = "I")
	public static int anInt6927;

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "[I")
	public static int[] anIntArray408 = new int[2];

	@OriginalMember(owner = "client!pa", name = "k", descriptor = "I")
	public static int anInt6933 = -1;

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
	public static String method5593(@OriginalArg(0) String arg0) {
		@Pc(11) String local11 = null;
		@Pc(15) int local15 = arg0.indexOf("--> ");
		if (local15 >= 0) {
			local11 = arg0.substring(0, local15 + 4);
			arg0 = arg0.substring(local15 + 4);
		}
		if (arg0.startsWith("directlogin ")) {
			@Pc(43) int local43 = arg0.indexOf(" ", "directlogin ".length());
			if (local43 >= 0) {
				@Pc(48) int local48 = arg0.length();
				arg0 = arg0.substring(0, local43) + " ";
				for (@Pc(64) int local64 = local43 + 1; local64 < local48; local64++) {
					arg0 = arg0 + "*";
				}
			}
		}
		return local11 == null ? arg0 : local11 + arg0;
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(Z)Z")
	public static boolean method5594() {
		return Static2.anInt71 == 0 ? Static54.aClass1_Sub6_Sub2_2.method3531() : true;
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(IBI)I")
	public static int method5596(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return arg0 == 1 || arg0 == 3 ? Static394.anIntArray411[arg1 & 0x3] : Static568.anIntArray548[arg1 & 0x3];
	}
}
