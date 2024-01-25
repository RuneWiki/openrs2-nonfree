import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static210 {

	@OriginalMember(owner = "client!hw", name = "W", descriptor = "I")
	public static int anInt3998;

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "(Ljava/lang/Object;ZZ)[B")
	public static byte[] method3435(@OriginalArg(0) Object arg0, @OriginalArg(1) boolean arg1) {
		if (arg0 == null) {
			return null;
		} else if (arg0 instanceof byte[]) {
			@Pc(13) byte[] local13 = (byte[]) arg0;
			return arg1 ? Static34.method542(local13) : local13;
		} else if (arg0 instanceof Class251) {
			@Pc(27) Class251 local27 = (Class251) arg0;
			return local27.method5844();
		} else {
			throw new IllegalArgumentException();
		}
	}
}
