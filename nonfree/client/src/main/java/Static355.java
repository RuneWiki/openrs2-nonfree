import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static355 {

	@OriginalMember(owner = "client!ma", name = "u", descriptor = "I")
	public static int anInt6219;

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(II)V")
	public static void method5318() {
		Static280.aClass391_25.method9274(50);
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(ZLjava/lang/Object;I)[B")
	public static byte[] method5319(@OriginalArg(0) boolean arg0, @OriginalArg(1) Object arg1) {
		if (arg1 == null) {
			return null;
		} else if (arg1 instanceof byte[]) {
			@Pc(14) byte[] local14 = (byte[]) arg1;
			return arg0 ? Static110.method1593(local14) : local14;
		} else if (arg1 instanceof Class143) {
			@Pc(29) Class143 local29 = (Class143) arg1;
			return local29.method3810();
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(IB)V")
	public static void method5320(@OriginalArg(0) int arg0) {
		Static333.anInt5936 = 100;
		Static496.anInt8292 = -1;
		Static87.anInt1456 = arg0;
		Static31.anInt506 = 3;
	}
}
