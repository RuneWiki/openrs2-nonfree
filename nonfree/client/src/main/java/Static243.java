import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static243 {

	@OriginalMember(owner = "client!of", name = "q", descriptor = "[[B")
	public static byte[][] aByteArrayArray13;

	@OriginalMember(owner = "client!of", name = "u", descriptor = "[I")
	public static int[] anIntArray842;

	@OriginalMember(owner = "client!of", name = "a", descriptor = "I")
	public static int anInt4326 = 0;

	@OriginalMember(owner = "client!of", name = "g", descriptor = "Ljava/lang/String;")
	public static String aString50 = "";

	@OriginalMember(owner = "client!of", name = "h", descriptor = "I")
	public static int anInt4331 = 0;

	@OriginalMember(owner = "client!of", name = "m", descriptor = "Z")
	public static boolean aBoolean331 = false;

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(III)V")
	public static void method3905(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class2_Sub10_Sub2 local8 = Static217.method3611(0, 15);
		local8.method864();
		local8.anInt1027 = arg1;
		local8.anInt1037 = arg0;
	}
}
