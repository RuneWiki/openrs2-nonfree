import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static206 {

	@OriginalMember(owner = "client!ke", name = "f", descriptor = "[I")
	public static final int[] anIntArray312 = new int[] { 1, -1, -1, 1 };

	@OriginalMember(owner = "client!ke", name = "o", descriptor = "Lclient!hb;")
	public static final Class92 aClass92_128 = new Class92(49, 7);

	@OriginalMember(owner = "client!ke", name = "p", descriptor = "[B")
	public static final byte[] aByteArray45 = new byte[2048];

	@OriginalMember(owner = "client!ke", name = "q", descriptor = "Z")
	public static boolean aBoolean328 = false;

	@OriginalMember(owner = "client!ke", name = "r", descriptor = "Lclient!oi;")
	public static final Class175 aClass175_134 = new Class175("M", "M", "M", "M");

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(I)I")
	public static int method3377() {
		return 2;
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(Ljava/lang/Object;BZ)[B")
	public static byte[] method3379(@OriginalArg(0) Object arg0, @OriginalArg(2) boolean arg1) {
		if (arg0 == null) {
			return null;
		} else if (arg0 instanceof byte[]) {
			@Pc(21) byte[] local21 = (byte[]) arg0;
			return arg1 ? Static421.method3676(local21) : local21;
		} else if (arg0 instanceof Class43) {
			@Pc(35) Class43 local35 = (Class43) arg0;
			return local35.method5201();
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method3380(@OriginalArg(0) String arg0) {
		Static304.method4490("", "", 0, 0, arg0);
	}
}
