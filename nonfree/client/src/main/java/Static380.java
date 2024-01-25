import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static380 {

	@OriginalMember(owner = "client!pk", name = "M", descriptor = "Lclient!cda;")
	public static Class49 aClass49_2;

	@OriginalMember(owner = "client!pk", name = "N", descriptor = "F")
	public static float aFloat176;

	@OriginalMember(owner = "client!pk", name = "L", descriptor = "I")
	public static int anInt7651 = 0;

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(IIILjava/lang/Object;)[B")
	public static byte[] method6370(@OriginalArg(1) int arg0, @OriginalArg(3) Object arg1) {
		if (arg1 == null) {
			return null;
		} else if (arg1 instanceof byte[]) {
			@Pc(13) byte[] local13 = (byte[]) arg1;
			return Static361.method5627(local13, arg0);
		} else if (arg1 instanceof Class208) {
			@Pc(30) Class208 local30 = (Class208) arg1;
			return local30.method5035(arg0);
		} else {
			throw new IllegalArgumentException();
		}
	}
}
