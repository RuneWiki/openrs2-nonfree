import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static128 {

	@OriginalMember(owner = "client!w", name = "a", descriptor = "I")
	public static int anInt3016;

	@OriginalMember(owner = "client!w", name = "c", descriptor = "Lclient!fd;")
	public static Class25 aClass25_5;

	@OriginalMember(owner = "client!w", name = "d", descriptor = "Lclient!ic;")
	private static Class34 aClass34_1383 = Static56.method816("Your account is already logged in)3");

	@OriginalMember(owner = "client!w", name = "b", descriptor = "Lclient!ic;")
	public static Class34 aClass34_1382 = aClass34_1383;

	@OriginalMember(owner = "client!w", name = "g", descriptor = "I")
	public static int anInt3019 = 0;

	@OriginalMember(owner = "client!w", name = "h", descriptor = "Lclient!m;")
	public static Class49 aClass49_15 = new Class49();

	@OriginalMember(owner = "client!w", name = "i", descriptor = "I")
	public static int anInt3020 = 0;

	@OriginalMember(owner = "client!w", name = "k", descriptor = "Lclient!ic;")
	private static Class34 aClass34_1384 = Static56.method816("Players");

	@OriginalMember(owner = "client!w", name = "l", descriptor = "Lclient!ic;")
	private static Class34 aClass34_1385 = Static56.method816("Please subscribe)1 or use a different world)3");

	@OriginalMember(owner = "client!w", name = "m", descriptor = "Lclient!ic;")
	public static Class34 aClass34_1386 = aClass34_1385;

	@OriginalMember(owner = "client!w", name = "n", descriptor = "Lclient!ic;")
	public static Class34 aClass34_1387 = aClass34_1384;

	@OriginalMember(owner = "client!w", name = "o", descriptor = "[Lclient!uc;")
	public static Class77[] aClass77Array1 = new Class77[50];

	@OriginalMember(owner = "client!w", name = "p", descriptor = "I")
	public static volatile int anInt3022 = 0;

	@OriginalMember(owner = "client!w", name = "q", descriptor = "Ljava/util/Random;")
	public static Random aRandom1 = new Random();

	@OriginalMember(owner = "client!w", name = "r", descriptor = "Lclient!ic;")
	public static Class34 aClass34_1388 = Static56.method816("<br>(X100(U(Y");

	@OriginalMember(owner = "client!w", name = "s", descriptor = "I")
	public static int anInt3023 = 0;

	@OriginalMember(owner = "client!w", name = "t", descriptor = "Lclient!ic;")
	public static Class34 aClass34_1389 = Static56.method816("W-=hlen Sie eine Welt");

	@OriginalMember(owner = "client!w", name = "v", descriptor = "Lclient!ic;")
	private static Class34 aClass34_1391 = Static56.method816("Prepared sound engine");

	@OriginalMember(owner = "client!w", name = "u", descriptor = "Lclient!ic;")
	public static Class34 aClass34_1390 = aClass34_1391;

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(I)V")
	public static void method1985() {
		aClass77Array1 = null;
		aClass34_1389 = null;
		aClass34_1388 = null;
		aClass25_5 = null;
		aClass34_1385 = null;
		aClass34_1391 = null;
		aClass34_1384 = null;
		aClass34_1382 = null;
		aClass34_1383 = null;
		aClass34_1387 = null;
		aClass34_1386 = null;
		aClass34_1390 = null;
		aRandom1 = null;
		aClass49_15 = null;
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(III)I")
	public static int method1986(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 == -1) {
			return 12345678;
		}
		arg0 = (arg1 & 0x7F) * arg0 / 128;
		if (arg0 < 2) {
			arg0 = 2;
		} else if (arg0 > 126) {
			arg0 = 126;
		}
		return (arg1 & 0xFF80) + arg0;
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(ZLjava/lang/Object;I)[B")
	public static byte[] method1987(@OriginalArg(0) boolean arg0, @OriginalArg(1) Object arg1) {
		if (arg1 == null) {
			return null;
		} else if (arg1 instanceof byte[]) {
			@Pc(18) byte[] local18 = (byte[]) arg1;
			return arg0 ? Static100.method1455(local18) : local18;
		} else if (arg1 instanceof Class54) {
			@Pc(32) Class54 local32 = (Class54) arg1;
			return local32.method1454();
		} else {
			throw new IllegalArgumentException();
		}
	}
}
