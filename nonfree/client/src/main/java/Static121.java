import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static121 {

	@OriginalMember(owner = "client!fa", name = "f", descriptor = "Lclient!tn;")
	public static Class273 aClass273_1;

	@OriginalMember(owner = "client!fa", name = "n", descriptor = "[I")
	public static final int[] anIntArray313 = new int[25];

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(III)V")
	public static void method2323(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class2_Sub13_Sub15 local8 = Static370.method5893(arg0, 13);
		local8.method6968();
		local8.anInt8318 = arg1;
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(II)Lclient!to;")
	public static Class274 method2325(@OriginalArg(0) int arg0) {
		@Pc(10) Class274 local10 = (Class274) Static416.aClass231_58.method6228((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static301.aClass53_86.method1616(arg0, 1);
		local10 = new Class274();
		local10.anInt8367 = arg0;
		if (local20 != null) {
			local10.method7007(new Class2_Sub29(local20));
		}
		local10.method7005();
		if (local10.anInt8378 == 2 && Static21.aClass127_8.method3205((long) arg0) == null) {
			Static21.aClass127_8.method3213(new Class2_Sub32(Static517.anInt8999), (long) arg0);
			Static184.aClass274Array1[Static517.anInt8999++] = local10;
		}
		Static416.aClass231_58.method6232(local10, (long) arg0);
		return local10;
	}
}
