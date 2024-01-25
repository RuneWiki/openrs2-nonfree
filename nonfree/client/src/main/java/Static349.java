import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static349 {

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "Lclient!ip;")
	public static Class115 aClass115_4;

	@OriginalMember(owner = "client!rl", name = "c", descriptor = "I")
	public static int anInt5828 = 0;

	@OriginalMember(owner = "client!rl", name = "d", descriptor = "[I")
	public static final int[] anIntArray539 = new int[] { 0, 1, 2, 3, 4, 5, 6, 14 };

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(BII)V")
	public static void method4853(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class1_Sub2_Sub6 local8 = Static371.method5808(1, arg1);
		local8.method1778();
		local8.anInt2056 = arg0;
	}
}
