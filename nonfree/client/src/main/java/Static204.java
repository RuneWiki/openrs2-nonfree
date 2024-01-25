import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static204 {

	@OriginalMember(owner = "client!ll", name = "y", descriptor = "I")
	public static int anInt4957 = 0;

	@OriginalMember(owner = "client!ll", name = "z", descriptor = "[[I")
	public static final int[][] anIntArrayArray44 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 4 }, { 6, 0, 2 }, { 2, 6, 0 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 2, 4, 4 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 2, 2 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 4, 6, 6 }, { 0, 2, 4, 6 } };

	@OriginalMember(owner = "client!ll", name = "C", descriptor = "Lclient!us;")
	public static final Class234 aClass234_98 = new Class234(68, -2);

	@OriginalMember(owner = "client!ll", name = "G", descriptor = "Ljava/lang/String;")
	public static String aString52 = "";

	@OriginalMember(owner = "client!ll", name = "d", descriptor = "(B)V")
	public static void method4472() {
		if (Static347.aClass155_9.method4861()) {
			Static245.method4026();
			Static347.aClass155_9.method4874(Static173.aCanvas2);
			Static71.method1197();
		} else {
			Static186.method2929(Static2.anInt68);
		}
	}

	@OriginalMember(owner = "client!ll", name = "d", descriptor = "(I)V")
	public static void method4476() {
		if (Static167.anIntArray309 != null && Static81.anIntArray164 != null) {
			return;
		}
		Static81.anIntArray164 = new int[256];
		Static167.anIntArray309 = new int[256];
		for (@Pc(13) int local13 = 0; local13 < 256; local13++) {
			@Pc(22) double local22 = (double) local13 / 255.0D * 6.283185307179586D;
			Static167.anIntArray309[local13] = (int) (Math.sin(local22) * 4096.0D);
			Static81.anIntArray164[local13] = (int) (Math.cos(local22) * 4096.0D);
		}
	}
}
