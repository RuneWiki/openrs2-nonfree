import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static148 {

	@OriginalMember(owner = "client!fr", name = "c", descriptor = "F")
	public static float aFloat25;

	@OriginalMember(owner = "client!fr", name = "d", descriptor = "I")
	public static int anInt2605 = 2;

	@OriginalMember(owner = "client!fr", name = "f", descriptor = "I")
	public static int anInt2606 = 0;

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(IIILclient!pq;)Lclient!il;")
	public static Class146 method2192(@OriginalArg(0) int arg0, @OriginalArg(3) Class251 arg1) {
		@Pc(18) byte[] local18 = arg1.method5860(arg0, 0);
		return local18 == null ? null : new Class146(local18);
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "([I[Ljava/lang/Object;B)V")
	public static void method2193(@OriginalArg(0) int[] arg0, @OriginalArg(1) Object[] arg1) {
		Static406.method5928(arg1, arg0, arg0.length - 1, 0);
	}
}
