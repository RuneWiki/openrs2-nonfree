import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static120 {

	@OriginalMember(owner = "client!eb", name = "c", descriptor = "Lclient!ip;")
	public static Class170 aClass170_10;

	@OriginalMember(owner = "client!eb", name = "g", descriptor = "Z")
	public static boolean aBoolean146 = false;

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(IIIII)V")
	public static void method1910(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg3 >= Static128.anInt2200 && arg3 <= Static380.anInt6585) {
			@Pc(19) int local19 = Static439.method6578(arg0, Static361.anInt6317, Static651.anInt10267);
			@Pc(27) int local27 = Static439.method6578(arg2, Static361.anInt6317, Static651.anInt10267);
			Static222.method3158(arg3, local27, local19, arg1);
		}
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(ZBLjava/lang/Object;)[B")
	public static byte[] method1911(@OriginalArg(0) boolean arg0, @OriginalArg(2) Object arg1) {
		if (arg1 == null) {
			return null;
		} else if (arg1 instanceof byte[]) {
			@Pc(13) byte[] local13 = (byte[]) arg1;
			return arg0 ? Static591.method8027(local13) : local13;
		} else if (arg1 instanceof Class35) {
			@Pc(27) Class35 local27 = (Class35) arg1;
			return local27.method569();
		} else {
			throw new IllegalArgumentException();
		}
	}
}
