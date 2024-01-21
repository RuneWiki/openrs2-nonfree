import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static55 {

	@OriginalMember(owner = "client!fg", name = "i", descriptor = "I")
	public static int anInt1366;

	@OriginalMember(owner = "client!fg", name = "c", descriptor = "Lclient!qe;")
	private static final Class83 aClass83_414 = Static181.method2795("World");

	@OriginalMember(owner = "client!fg", name = "d", descriptor = "[I")
	public static final int[] anIntArray108 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

	@OriginalMember(owner = "client!fg", name = "f", descriptor = "Lclient!qe;")
	public static Class83 aClass83_415 = aClass83_414;

	@OriginalMember(owner = "client!fg", name = "h", descriptor = "Lclient!qe;")
	public static Class83 aClass83_416 = aClass83_414;

	@OriginalMember(owner = "client!fg", name = "k", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger1 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

	@OriginalMember(owner = "client!fg", name = "m", descriptor = "[I")
	public static final int[] anIntArray109 = new int[128];

	@OriginalMember(owner = "client!fg", name = "n", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_417 = Static181.method2795(" (X");

	@OriginalMember(owner = "client!fg", name = "o", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_418 = Static181.method2795("weiss:");

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(IIIIIIII)V")
	public static void method1048(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg5 >= Static209.anInt4155 && Static36.anInt940 >= arg6 && arg0 >= Static147.anInt4074 && Static61.anInt1501 >= arg1) {
			Static177.method2714(arg6, arg0, arg3, arg4, arg2, arg1, arg5);
		} else {
			Static206.method3110(arg4, arg6, arg1, arg2, arg0, arg3, arg5);
		}
	}
}
