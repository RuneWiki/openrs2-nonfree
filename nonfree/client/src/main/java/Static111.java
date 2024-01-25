import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static111 {

	@OriginalMember(owner = "client!fn", name = "y", descriptor = "I")
	public static int anInt1996;

	@OriginalMember(owner = "client!fn", name = "p", descriptor = "Lclient!oe;")
	public static final Class186 aClass186_26 = new Class186(68, -1);

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(B[Lclient!ig;)V")
	public static void method1828(@OriginalArg(1) Class12[] arg0) {
		Static274.anInt4686 = arg0.length;
		Static136.aClass12Array7 = new Class12[Static274.anInt4686 + 10];
		Static320.anIntArray466 = new int[Static274.anInt4686 + 10];
		Static459.method5353(arg0, 0, Static136.aClass12Array7, 0, Static274.anInt4686);
		for (@Pc(26) int local26 = 0; local26 < Static274.anInt4686; local26++) {
			Static320.anIntArray466[local26] = Static136.aClass12Array7[local26].method5655();
		}
		for (@Pc(52) int local52 = Static274.anInt4686; local52 < Static136.aClass12Array7.length; local52++) {
			Static320.anIntArray466[local52] = 12;
		}
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(ILclient!bl;I[I[II)Lclient!gn;")
	public static Class24_Sub2 method1830(@OriginalArg(1) Class28_Sub1 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) int arg4) {
		@Pc(10) byte[] local10 = new byte[arg1 * arg4];
		for (@Pc(12) int local12 = 0; local12 < arg4; local12++) {
			@Pc(22) int local22 = local12 * arg1 + arg2[local12];
			for (@Pc(24) int local24 = 0; local24 < arg3[local12]; local24++) {
				local10[local22++] = -1;
			}
		}
		return new Class24_Sub2(arg0, arg1, arg4, local10);
	}
}
