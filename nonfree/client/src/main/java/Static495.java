import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static495 {

	@OriginalMember(owner = "client!ql", name = "i", descriptor = "[[S")
	public static short[][] aShortArrayArray28;

	@OriginalMember(owner = "client!ql", name = "o", descriptor = "I")
	public static int anInt8144;

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(Ljava/lang/String;BLjava/lang/String;)V")
	public static void method7115(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1) {
		if (arg1.length() > 320 || !Static524.method7315()) {
			return;
		}
		if (Static559.aClass269_1 != null) {
			Static559.aClass269_1.method6697();
			Static559.aClass269_1 = null;
		}
		Static370.method5390();
		Static492.aString90 = arg0;
		Static506.aString86 = arg1;
		Static553.method7892(5);
	}
}
