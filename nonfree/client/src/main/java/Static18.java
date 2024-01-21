import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static18 {

	@OriginalMember(owner = "client!cc", name = "g", descriptor = "[[S")
	public static short[][] aShortArrayArray1;

	@OriginalMember(owner = "client!cc", name = "m", descriptor = "[[B")
	public static byte[][] aByteArrayArray1;

	@OriginalMember(owner = "client!cc", name = "e", descriptor = "I")
	public static final int anInt474 = 5063219;

	@OriginalMember(owner = "client!cc", name = "f", descriptor = "Lclient!ai;")
	public static Class6 aClass6_134 = Static38.method685("Bitte warten Sie )2 es wird versucht)1 die Verbindung wiederherzustellen)3");

	@OriginalMember(owner = "client!cc", name = "l", descriptor = "Lclient!ai;")
	public static Class6 aClass6_135 = Static38.method685("sch-Utteln:");

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "([SB[Lclient!ai;)V")
	public static void method347(@OriginalArg(0) short[] arg0, @OriginalArg(2) Class6[] arg1) {
		Static68.method1098(arg1.length - 1, arg0, 0, arg1);
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(Z)V")
	public static void method351() {
		aClass6_134 = null;
		aShortArrayArray1 = null;
		aClass6_135 = null;
		aByteArrayArray1 = null;
	}
}
