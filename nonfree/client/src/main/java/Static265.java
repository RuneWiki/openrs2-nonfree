import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static265 {

	@OriginalMember(owner = "client!kn", name = "v", descriptor = "Z")
	public static boolean aBoolean364 = false;

	@OriginalMember(owner = "client!kn", name = "w", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray3 = new boolean[][] { new boolean[4], new boolean[4], { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, new boolean[4], new boolean[4], new boolean[4], new boolean[4] };

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(IB[B)[B")
	public static byte[] method4441(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1) {
		@Pc(11) byte[] local11 = new byte[arg0];
		Static601.method2938(arg1, 0, local11, 0, arg0);
		return local11;
	}

	@OriginalMember(owner = "client!kn", name = "d", descriptor = "(B)V")
	public static void method4443() {
		if (Static367.anInt6493 == 1 || Static367.anInt6493 == 3 || Static367.anInt6493 != Static304.anInt5589 && (Static367.anInt6493 == 0 || Static304.anInt5589 == 0)) {
			Static535.anInt8885 = 0;
			Static464.anInt7995 = 0;
			Static593.aClass128_43.method3274();
		}
		Static304.anInt5589 = Static367.anInt6493;
	}
}
