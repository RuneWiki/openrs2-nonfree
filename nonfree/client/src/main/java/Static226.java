import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static226 {

	@OriginalMember(owner = "client!hba", name = "A", descriptor = "I")
	public static int anInt3596;

	@OriginalMember(owner = "client!hba", name = "a", descriptor = "(Ljava/lang/Object;IZI)[B")
	public static byte[] method3244(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1) {
		if (arg0 == null) {
			return null;
		} else if (arg0 instanceof byte[]) {
			@Pc(21) byte[] local21 = (byte[]) arg0;
			return Static488.method7014(local21, arg1);
		} else if (arg0 instanceof Class148) {
			@Pc(33) Class148 local33 = (Class148) arg0;
			return local33.method6551(arg1);
		} else {
			throw new IllegalArgumentException();
		}
	}
}
