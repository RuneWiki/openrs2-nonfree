import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static150 {

	@OriginalMember(owner = "client!gba", name = "r", descriptor = "Ljava/lang/String;")
	public static String aString62 = "";

	@OriginalMember(owner = "client!gba", name = "w", descriptor = "I")
	public static int anInt2984 = 0;

	@OriginalMember(owner = "client!gba", name = "a", descriptor = "(II)V")
	public static void method2791(@OriginalArg(0) int arg0) {
		@Pc(10) Class1_Sub2_Sub16 local10 = Static422.method6588(2, arg0);
		local10.method6700();
	}
}
