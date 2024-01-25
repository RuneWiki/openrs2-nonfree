import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static352 {

	@OriginalMember(owner = "client!np", name = "m", descriptor = "F")
	public static float aFloat152;

	@OriginalMember(owner = "client!np", name = "p", descriptor = "Lclient!np;")
	public static Class228 aClass228_3;

	@OriginalMember(owner = "client!np", name = "i", descriptor = "I")
	public static int anInt6780 = 0;

	@OriginalMember(owner = "client!np", name = "s", descriptor = "[I")
	public static final int[] anIntArray478 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

	@OriginalMember(owner = "client!np", name = "c", descriptor = "(B)V")
	public static void method5715() {
		Static81.anInt1953 = 0;
		for (@Pc(14) int local14 = 0; local14 < 2048; local14++) {
			Static125.aClass6_Sub26Array1[local14] = null;
			Static425.aByteArray94[local14] = 1;
			Static510.aClass153Array6[local14] = null;
		}
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(I[B)[B")
	public static byte[] method5720(@OriginalArg(1) byte[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(16) byte[] local16 = new byte[arg0.length];
			Static589.method5382(arg0, 0, local16, 0, arg0.length);
			return local16;
		}
	}
}
