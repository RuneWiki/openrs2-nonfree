import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static442 {

	@OriginalMember(owner = "client!qr", name = "d", descriptor = "I")
	public static int anInt7414 = 2;

	@OriginalMember(owner = "client!qr", name = "g", descriptor = "[I")
	public static final int[] anIntArray463 = new int[8];

	@OriginalMember(owner = "client!qr", name = "l", descriptor = "I")
	public static int anInt7419 = 0;

	@OriginalMember(owner = "client!qr", name = "n", descriptor = "Z")
	public static boolean aBoolean562 = false;

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(IIILjava/lang/Object;)[B")
	public static byte[] method6191(@OriginalArg(1) int arg0, @OriginalArg(3) Object arg1) {
		if (arg1 == null) {
			return null;
		} else if (arg1 instanceof byte[]) {
			@Pc(18) byte[] local18 = (byte[]) arg1;
			return Static143.method2768(local18, arg0);
		} else if (arg1 instanceof Class175) {
			@Pc(30) Class175 local30 = (Class175) arg1;
			return local30.method4130(arg0);
		} else {
			throw new IllegalArgumentException();
		}
	}
}
