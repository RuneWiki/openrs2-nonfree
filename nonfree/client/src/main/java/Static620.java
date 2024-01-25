import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static620 {

	@OriginalMember(owner = "client!vb", name = "p", descriptor = "[[B")
	public static byte[][] aByteArrayArray22;

	@OriginalMember(owner = "client!vb", name = "r", descriptor = "I")
	public static int anInt9983;

	@OriginalMember(owner = "client!vb", name = "i", descriptor = "Lclient!ke;")
	public static final Class196 aClass196_316 = new Class196(79, -2);

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(Lclient!ha;JI)V")
	public static void method8294(@OriginalArg(0) Class143 arg0, @OriginalArg(1) long arg1) {
		Static124.anInt2151 = 0;
		Static456.anInt7923 = Static512.anInt8632;
		Static303.anInt4679 = 0;
		Static512.anInt8632 = 0;
		@Pc(16) long local16 = Static124.method1947();
		for (@Pc(21) Class41_Sub7 local21 = (Class41_Sub7) Static422.aClass102_5.method2062(); local21 != null; local21 = (Class41_Sub7) Static422.aClass102_5.method2054()) {
			if (local21.method7089(arg0, arg1)) {
				Static303.anInt4679++;
			}
		}
		if (Static71.aBoolean69 && arg1 % 100L == 0L) {
			System.out.println("Particle system count: " + Static422.aClass102_5.method2056() + ", running: " + Static303.anInt4679);
			System.out.println("Emitters: " + Static124.anInt2151 + " Particles: " + Static512.anInt8632 + ". Time taken: " + (Static124.method1947() - local16) + "ms");
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(IB)Z")
	public static boolean method8297(@OriginalArg(0) int arg0) {
		return arg0 == 0 || arg0 == 2;
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(IIB)Z")
	public static boolean method8303(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static480.method3955(arg0, arg1) & Static537.method8643(arg1, arg0);
	}
}
