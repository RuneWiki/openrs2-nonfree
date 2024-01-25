import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static456 {

	@OriginalMember(owner = "client!rea", name = "n", descriptor = "I")
	public static int anInt7972;

	@OriginalMember(owner = "client!rea", name = "p", descriptor = "I")
	public static int anInt7973;

	@OriginalMember(owner = "client!rea", name = "q", descriptor = "I")
	public static int anInt7974;

	@OriginalMember(owner = "client!rea", name = "f", descriptor = "Lclient!rl;")
	public static final Class287 aClass287_130 = new Class287(46, 3);

	@OriginalMember(owner = "client!rea", name = "h", descriptor = "I")
	public static int anInt7967 = 2;

	@OriginalMember(owner = "client!rea", name = "o", descriptor = "Lclient!tr;")
	public static final Class321 aClass321_2 = new Class321(128);

	@OriginalMember(owner = "client!rea", name = "r", descriptor = "I")
	public static int anInt7975 = 0;

	@OriginalMember(owner = "client!rea", name = "s", descriptor = "J")
	public static long aLong217 = 0L;

	@OriginalMember(owner = "client!rea", name = "t", descriptor = "[F")
	public static final float[] aFloatArray57 = new float[4];

	@OriginalMember(owner = "client!rea", name = "u", descriptor = "[S")
	public static short[] aShortArray114 = new short[256];

	@OriginalMember(owner = "client!rea", name = "a", descriptor = "(B)V")
	public static void method6282() {
		Static492.method6624();
		for (@Pc(8) int local8 = 0; local8 < 4; local8++) {
			Static187.aClass220Array1[local8].method5072();
		}
		Static253.method3969();
		Static527.method8126();
		System.gc();
		Static319.aClass31_11.ya();
	}
}
