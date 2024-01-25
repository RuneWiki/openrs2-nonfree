import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static331 {

	@OriginalMember(owner = "client!qp", name = "C", descriptor = "I")
	public static int anInt6034;

	@OriginalMember(owner = "client!qp", name = "v", descriptor = "[I")
	public static final int[] anIntArray446 = new int[13];

	@OriginalMember(owner = "client!qp", name = "x", descriptor = "Lclient!lh;")
	public static final Class151 aClass151_143 = new Class151(50);

	@OriginalMember(owner = "client!qp", name = "B", descriptor = "Lclient!ao;")
	public static final Class12 aClass12_291 = new Class12(40, -2);

	@OriginalMember(owner = "client!qp", name = "c", descriptor = "(III)Z")
	public static boolean method4781(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x800) != 0;
	}
}
