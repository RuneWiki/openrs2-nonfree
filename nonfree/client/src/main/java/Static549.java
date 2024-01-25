import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static549 {

	@OriginalMember(owner = "client!tq", name = "N", descriptor = "Lclient!fe;")
	public static Class103 aClass103_4;

	@OriginalMember(owner = "client!tq", name = "E", descriptor = "[F")
	public static final float[] aFloatArray71 = new float[4];

	@OriginalMember(owner = "client!tq", name = "G", descriptor = "[Lclient!an;")
	public static final Class20[] aClass20Array1 = new Class20[100];

	@OriginalMember(owner = "client!tq", name = "I", descriptor = "[I")
	public static final int[] anIntArray509 = new int[] { 1, 0, -1, 0 };

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(Ljava/lang/Object;IZ)[B")
	public static byte[] method8014(@OriginalArg(0) Object arg0, @OriginalArg(2) boolean arg1) {
		if (arg0 == null) {
			return null;
		} else if (arg0 instanceof byte[]) {
			@Pc(13) byte[] local13 = (byte[]) arg0;
			return arg1 ? Static466.method6904(local13) : local13;
		} else if (arg0 instanceof Class37) {
			@Pc(32) Class37 local32 = (Class37) arg0;
			return local32.method765();
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!tq", name = "b", descriptor = "(III)Z")
	public static boolean method8015(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x800) != 0;
	}
}
