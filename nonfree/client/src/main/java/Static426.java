import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static426 {

	@OriginalMember(owner = "client!pd", name = "n", descriptor = "[[F")
	public static final float[][] aFloatArrayArray15 = new float[][] { { -0.333333F, -0.333333F, -0.333333F }, { 0.333333F, -0.333333F, -0.333333F }, { -0.333333F, 0.333333F, -0.333333F }, { 0.333333F, 0.333333F, -0.333333F }, { -0.333333F, -0.333333F, 0.333333F }, { 0.333333F, -0.333333F, 0.333333F }, { -0.333333F, 0.333333F, 0.333333F }, { 0.333333F, 0.333333F, 0.333333F } };

	@OriginalMember(owner = "client!pd", name = "g", descriptor = "(I)V")
	public static void method5677() {
		Static537.method7410();
		for (@Pc(8) int local8 = 0; local8 < 4; local8++) {
			Static230.aClass240Array1[local8].method5187();
		}
		Static174.method2588();
		Static88.method1312();
		Static620.method8303();
		System.gc();
		Static192.aClass95_4.ya();
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(BII)I")
	public static int method5678(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return arg1 == 1 || arg1 == 3 ? Static634.anIntArray691[arg0 & 0x3] : Static513.anIntArray577[arg0 & 0x3];
	}
}
