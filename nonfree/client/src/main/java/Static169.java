import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static169 {

	@OriginalMember(owner = "client!gea", name = "b", descriptor = "Z")
	public static boolean aBoolean263 = false;

	@OriginalMember(owner = "client!gea", name = "c", descriptor = "[I")
	public static final int[] anIntArray152 = new int[8];

	@OriginalMember(owner = "client!gea", name = "b", descriptor = "(I)V")
	public static void method3023() {
		Static250.aClass297_20.method6535();
		Static4.aClass49_1.method1450();
		Static477.aClass49_9.method1450();
	}

	@OriginalMember(owner = "client!gea", name = "a", descriptor = "(ILclient!pca;)Ljava/lang/String;")
	public static String method3024(@OriginalArg(1) Class251 arg0) {
		if (Static70.method1716(arg0).method3242() == 0) {
			return null;
		} else if (arg0.aString185 == null || arg0.aString185.trim().length() == 0) {
			return Static355.aBoolean446 ? "Hidden-use" : null;
		} else {
			return arg0.aString185;
		}
	}

	@OriginalMember(owner = "client!gea", name = "a", descriptor = "([Ljava/lang/String;I)[Ljava/lang/String;")
	public static String[] method3025(@OriginalArg(0) String[] arg0) {
		@Pc(8) String[] local8 = new String[5];
		for (@Pc(10) int local10 = 0; local10 < 5; local10++) {
			local8[local10] = local10 + ": ";
			if (arg0 != null && arg0[local10] != null) {
				local8[local10] = local8[local10] + arg0[local10];
			}
		}
		return local8;
	}
}
