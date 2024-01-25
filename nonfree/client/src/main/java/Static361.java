import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static361 {

	@OriginalMember(owner = "client!se", name = "Qc", descriptor = "[Lclient!f;")
	public static Class49[] aClass49Array120;

	@OriginalMember(owner = "client!se", name = "yc", descriptor = "J")
	public static long aLong187 = 0L;

	@OriginalMember(owner = "client!se", name = "Ic", descriptor = "[S")
	public static final short[] aShortArray76 = new short[] { -4160, -4163, -8256, -8259, 22461 };

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(Lclient!mq;I)Z")
	public static boolean method4696(@OriginalArg(0) Interface9 arg0) {
		@Pc(10) Class141 local10 = Static259.aClass95_3.method1821(arg0.method5124());
		if (local10.anInt3401 == -1) {
			return true;
		} else {
			@Pc(27) Class188 local27 = Static346.aClass135_3.method2791(local10.anInt3401);
			return local27.anInt5032 == -1 ? true : local27.method3941();
		}
	}
}
