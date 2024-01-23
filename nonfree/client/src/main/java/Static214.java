import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static214 {

	@OriginalMember(owner = "client!pe", name = "d", descriptor = "I")
	public static int anInt4371;

	@OriginalMember(owner = "client!pe", name = "g", descriptor = "Lclient!ek;")
	public static Class42 aClass42_65;

	@OriginalMember(owner = "client!pe", name = "b", descriptor = "I")
	public static int anInt4370 = 0;

	@OriginalMember(owner = "client!pe", name = "c", descriptor = "[Z")
	public static boolean[] aBooleanArray19 = new boolean[100];

	@OriginalMember(owner = "client!pe", name = "f", descriptor = "I")
	public static int anInt4373 = 0;

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(IZ)V")
	public static void method3569(@OriginalArg(0) int arg0) {
		@Pc(8) Class2_Sub8_Sub10 local8 = Static92.method1633(5, arg0);
		local8.method2043();
	}
}
