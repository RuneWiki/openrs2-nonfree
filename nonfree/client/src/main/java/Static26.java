import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static26 {

	@OriginalMember(owner = "client!c", name = "p", descriptor = "[I")
	public static int[] anIntArray42 = new int[1000];

	@OriginalMember(owner = "client!c", name = "q", descriptor = "I")
	public static int anInt498 = 0;

	@OriginalMember(owner = "client!c", name = "r", descriptor = "Z")
	public static boolean aBoolean32 = false;

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIIBLjava/lang/String;)V")
	public static void method479(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) String arg6) {
		for (@Pc(3) int local3 = 99; local3 > 0; local3--) {
			Static162.anIntArray274[local3] = Static162.anIntArray274[local3 - 1];
			Static189.anIntArray312[local3] = Static189.anIntArray312[local3 - 1];
			Static178.aStringArray31[local3] = Static178.aStringArray31[local3 - 1];
			Static97.aStringArray16[local3] = Static97.aStringArray16[local3 - 1];
			Static45.aStringArray6[local3] = Static45.aStringArray6[local3 - 1];
			Static108.aStringArray20[local3] = Static108.aStringArray20[local3 - 1];
			Static299.anIntArray520[local3] = Static299.anIntArray520[local3 - 1];
		}
		Static178.aStringArray31[0] = arg2;
		Static162.anIntArray274[0] = arg5;
		Static189.anIntArray312[0] = arg4;
		Static299.anIntArray520[0] = arg3;
		Static315.anInt5920 = Static314.anInt5908;
		Static97.aStringArray16[0] = arg6;
		Static251.anInt4927++;
		Static45.aStringArray6[0] = arg1;
		Static108.aStringArray20[0] = arg0;
	}
}
