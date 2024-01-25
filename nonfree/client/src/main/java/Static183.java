import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static183 {

	@OriginalMember(owner = "client!go", name = "J", descriptor = "I")
	public static int anInt4307;

	@OriginalMember(owner = "client!go", name = "E", descriptor = "[J")
	public static final long[] aLongArray4 = new long[10];

	@OriginalMember(owner = "client!go", name = "F", descriptor = "I")
	public static int anInt4304 = 0;

	@OriginalMember(owner = "client!go", name = "L", descriptor = "Z")
	public static boolean aBoolean308 = false;

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(IZ)Z")
	public static boolean method3494(@OriginalArg(0) int arg0) {
		return arg0 == 3 || arg0 == 7 || arg0 == 10;
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(ZI)V")
	public static void method3495(@OriginalArg(1) int arg0) {
		Static611.anInt10290 = 3;
		Static182.anInt4253 = -1;
		Static100.anInt2681 = 100;
		Static464.anInt8440 = arg0;
	}
}
