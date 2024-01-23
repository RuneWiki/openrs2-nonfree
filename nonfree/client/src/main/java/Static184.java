import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static184 {

	@OriginalMember(owner = "client!nf", name = "d", descriptor = "I")
	public static int anInt3648;

	@OriginalMember(owner = "client!nf", name = "b", descriptor = "[Z")
	public static boolean[] aBooleanArray86 = new boolean[100];

	@OriginalMember(owner = "client!nf", name = "c", descriptor = "[Lclient!v;")
	public static Class181[] aClass181Array1 = new Class181[8];

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(Lclient!rn;Lclient!rn;B)I")
	public static int method3091(@OriginalArg(0) Class155 arg0, @OriginalArg(1) Class155 arg1) {
		@Pc(10) int local10 = 0;
		if (arg1.method4133(Static15.anInt4211)) {
			local10++;
		}
		if (arg1.method4133(Static269.anInt5495)) {
			local10++;
		}
		if (arg1.method4133(Static145.anInt2764)) {
			local10++;
		}
		if (arg0.method4133(Static15.anInt4211)) {
			local10++;
		}
		if (arg0.method4133(Static269.anInt5495)) {
			local10++;
		}
		if (arg0.method4133(Static145.anInt2764)) {
			local10++;
		}
		return local10;
	}
}
