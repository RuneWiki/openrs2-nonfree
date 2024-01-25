import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static301 {

	@OriginalMember(owner = "client!tc", name = "v", descriptor = "Lclient!kh;")
	public static Class54 aClass54_21;

	@OriginalMember(owner = "client!tc", name = "w", descriptor = "I")
	public static int anInt5983;

	@OriginalMember(owner = "client!tc", name = "h", descriptor = "Z")
	public static boolean aBoolean447 = true;

	@OriginalMember(owner = "client!tc", name = "r", descriptor = "[I")
	public static final int[] anIntArray504 = new int[] { 6144, 8192, 10240, 4096, 12288, 2048, 0, 14336 };

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(I)V")
	public static void method5304() {
		@Pc(15) Class5_Sub9_Sub16 local15 = Static239.method4052(15, 0);
		local15.method4138();
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(II)Lclient!ng;")
	public static Class135 method5317(@OriginalArg(0) int arg0) {
		@Pc(10) Class135 local10 = (Class135) Static279.aClass66_93.method1939((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static88.aClass170_22.method4584(4, arg0);
		local10 = new Class135();
		if (local20 != null) {
			local10.method3632(arg0, new Class5_Sub1(local20));
		}
		local10.method3631(arg0);
		Static279.aClass66_93.method1936((long) arg0, local10);
		return local10;
	}
}
