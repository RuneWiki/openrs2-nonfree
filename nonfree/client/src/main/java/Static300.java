import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static300 {

	@OriginalMember(owner = "client!lca", name = "w", descriptor = "I")
	public static int anInt4989;

	@OriginalMember(owner = "client!lca", name = "D", descriptor = "[[B")
	public static byte[][] aByteArrayArray24;

	@OriginalMember(owner = "client!lca", name = "a", descriptor = "(II)V")
	public static void method4179(@OriginalArg(0) int arg0) {
		Static402.anInt7015 = arg0;
		Static253.anInt4705 = 2;
		if (Static544.aString96 == null) {
			Static139.method2346(35);
		} else {
			@Pc(23) Class2_Sub15 local23 = new Class2_Sub15(Static534.method7307(Static156.method7058(Static544.aString96)));
			@Pc(27) long local27 = local23.method4351();
			Static27.aLong23 = local23.method4351();
			Static100.method1501(true, "", Static268.method7982(local27));
		}
	}
}
