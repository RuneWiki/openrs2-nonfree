import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static198 {

	@OriginalMember(owner = "client!va", name = "eb", descriptor = "I")
	public static int anInt4147;

	@OriginalMember(owner = "client!va", name = "cb", descriptor = "Lclient!mb;")
	private static final Class62 aClass62_1441 = Static151.method2243("OFF");

	@OriginalMember(owner = "client!va", name = "W", descriptor = "Lclient!mb;")
	public static Class62 aClass62_1440 = aClass62_1441;

	@OriginalMember(owner = "client!va", name = "X", descriptor = "Ljava/util/Random;")
	public static final Random aRandom1 = new Random();

	@OriginalMember(owner = "client!va", name = "db", descriptor = "I")
	public static int anInt4146 = 0;

	@OriginalMember(owner = "client!va", name = "fb", descriptor = "Lclient!mb;")
	private static final Class62 aClass62_1442 = Static151.method2243("Connecting to update server");

	@OriginalMember(owner = "client!va", name = "gb", descriptor = "Lclient!mb;")
	public static Class62 aClass62_1443 = aClass62_1442;

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(IIIIII)V")
	public static void method2916(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg0 >= Static122.anInt2718 && Static153.anInt3279 >= arg1 && Static154.anInt3307 <= arg2 && Static15.anInt353 >= arg3) {
			Static73.method1017(arg1, arg3, arg0, arg2, arg4);
		} else {
			Static42.method3001(arg4, arg1, arg3, arg0, arg2);
		}
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(IB)I")
	public static int method2917(@OriginalArg(0) int arg0) {
		return arg0 >>> 10;
	}
}
