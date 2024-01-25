import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static390 {

	@OriginalMember(owner = "client!qf", name = "b", descriptor = "Lclient!kda;")
	public static Class160 aClass160_80;

	@OriginalMember(owner = "client!qf", name = "c", descriptor = "I")
	public static int anInt6801 = 0;

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(ILjava/lang/Object;Z)[B")
	public static byte[] method5877(@OriginalArg(1) Object arg0, @OriginalArg(2) boolean arg1) {
		if (arg0 == null) {
			return null;
		} else if (arg0 instanceof byte[]) {
			@Pc(13) byte[] local13 = (byte[]) arg0;
			return arg1 ? Static138.method7947(local13) : local13;
		} else if (arg0 instanceof Class68) {
			@Pc(27) Class68 local27 = (Class68) arg0;
			return local27.method2197();
		} else {
			throw new IllegalArgumentException();
		}
	}
}
