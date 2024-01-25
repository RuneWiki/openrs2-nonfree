import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static190 {

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "I")
	public static int anInt4010;

	@OriginalMember(owner = "client!ht", name = "g", descriptor = "Ljava/lang/String;")
	public static String aString25 = null;

	@OriginalMember(owner = "client!ht", name = "b", descriptor = "(II)V")
	public static void method3570(@OriginalArg(0) int arg0) {
		@Pc(12) Class1_Sub1_Sub13 local12 = Static476.method6225(1, arg0);
		local12.method4925();
	}
}
