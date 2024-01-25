import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static397 {

	@OriginalMember(owner = "client!oca", name = "C", descriptor = "Lclient!tl;")
	public static Class325 aClass325_2;

	@OriginalMember(owner = "client!oca", name = "w", descriptor = "[S")
	public static short[] aShortArray93 = new short[256];

	@OriginalMember(owner = "client!oca", name = "x", descriptor = "Z")
	public static volatile boolean aBoolean529 = true;

	@OriginalMember(owner = "client!oca", name = "y", descriptor = "J")
	public static volatile long aLong203 = 0L;

	@OriginalMember(owner = "client!oca", name = "D", descriptor = "I")
	public static final int anInt7109 = 0;

	@OriginalMember(owner = "client!oca", name = "J", descriptor = "[I")
	public static final int[] anIntArray492 = new int[1000];

	@OriginalMember(owner = "client!oca", name = "c", descriptor = "(B)Lclient!jj;")
	public static Class178 method6020() {
		try {
			return (Class178) Class.forName("Class178_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return null;
		}
	}

	@OriginalMember(owner = "client!oca", name = "a", descriptor = "(ILclient!dm;)V")
	public static void method6022(@OriginalArg(1) Class78 arg0) {
		if (Static507.anInt8545 == arg0.anInt1965) {
			Static618.aBooleanArray50[arg0.anInt1969] = true;
		}
	}
}
