import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static202 {

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(Ljava/lang/Object;IZ)[B")
	public static byte[] method3816(@OriginalArg(0) Object arg0, @OriginalArg(2) boolean arg1) {
		if (arg0 == null) {
			return null;
		} else if (arg0 instanceof byte[]) {
			@Pc(20) byte[] local20 = (byte[]) arg0;
			return arg1 ? Static374.method5763(local20) : local20;
		} else if (arg0 instanceof Class208) {
			@Pc(34) Class208 local34 = (Class208) arg0;
			return local34.method5037();
		} else {
			throw new IllegalArgumentException();
		}
	}
}
