import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static657 {

	@OriginalMember(owner = "client!un", name = "e", descriptor = "I")
	public static int anInt10509;

	@OriginalMember(owner = "client!un", name = "b", descriptor = "Z")
	public static boolean aBoolean758 = false;

	@OriginalMember(owner = "client!un", name = "d", descriptor = "Ljava/lang/String;")
	public static String aString127 = null;

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(IB)V")
	public static void method8788(@OriginalArg(0) int arg0) {
		@Pc(17) Class3_Sub4_Sub2 local17 = Static502.method7211(3, (long) arg0);
		local17.method627();
	}
}
