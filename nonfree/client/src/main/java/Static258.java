import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static258 {

	@OriginalMember(owner = "client!ju", name = "o", descriptor = "I")
	public static int anInt5217;

	@OriginalMember(owner = "client!ju", name = "s", descriptor = "I")
	public static int anInt5219;

	@OriginalMember(owner = "client!ju", name = "w", descriptor = "Lclient!co;")
	public static Class6_Sub10_Sub1 aClass6_Sub10_Sub1_2;

	@OriginalMember(owner = "client!ju", name = "z", descriptor = "Lclient!q;")
	public static Class8 aClass8_6;

	@OriginalMember(owner = "client!ju", name = "v", descriptor = "Lclient!pr;")
	public static final Class254 aClass254_95 = new Class254(66, -1);

	@OriginalMember(owner = "client!ju", name = "y", descriptor = "I")
	public static int anInt5222 = 0;

	@OriginalMember(owner = "client!ju", name = "A", descriptor = "[B")
	public static final byte[] aByteArray60 = new byte[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "(BI)Ljava/lang/String;")
	public static String method4481(@OriginalArg(1) int arg0) {
		return (arg0 >> 24 & 0xFF) + "." + (arg0 >> 16 & 0xFF) + "." + (arg0 >> 8 & 0xFF) + "." + (arg0 & 0xFF);
	}

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "(IIIIII)V")
	public static void method4483(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(19) int local19 = Static501.method4264(arg1, Static289.anInt5545, Static96.anInt2302);
		@Pc(25) int local25 = Static501.method4264(arg0, Static289.anInt5545, Static96.anInt2302);
		@Pc(31) int local31 = Static501.method4264(arg3, Class179_Sub2.lb, Static376.anInt7071);
		@Pc(37) int local37 = Static501.method4264(arg4, Class179_Sub2.lb, Static376.anInt7071);
		for (@Pc(39) int local39 = local19; local39 <= local25; local39++) {
			Static115.method2332(local31, local37, arg2, Static183.anIntArrayArray26[local39]);
		}
	}
}
