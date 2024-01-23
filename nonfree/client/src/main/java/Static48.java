import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static48 {

	@OriginalMember(owner = "client!eg", name = "ic", descriptor = "[Lclient!kh;")
	public static Class60[] aClass60Array7;

	@OriginalMember(owner = "client!eg", name = "Tb", descriptor = "Lclient!kh;")
	private static Class60 aClass60_381 = Static200.method3116("cyan:");

	@OriginalMember(owner = "client!eg", name = "Vb", descriptor = "Lclient!kh;")
	public static Class60 aClass60_382 = Static200.method3116("sind fehlgeschlagen)3 Bitte warten Sie 5 Minuten)1");

	@OriginalMember(owner = "client!eg", name = "Yb", descriptor = "Lclient!kh;")
	public static Class60 aClass60_383 = aClass60_381;

	@OriginalMember(owner = "client!eg", name = "dc", descriptor = "Lclient!kh;")
	public static Class60 aClass60_384 = Static200.method3116("Einloggen");

	@OriginalMember(owner = "client!eg", name = "kc", descriptor = "Lclient!kh;")
	public static Class60 aClass60_385 = aClass60_381;

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(IIBIIIII)V")
	public static void method947(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(10) int local10 = 2048 - arg4 & 0x7FF;
		@Pc(17) int local17 = 2048 - arg6 & 0x7FF;
		@Pc(19) int local19 = 0;
		@Pc(21) int local21 = 0;
		@Pc(28) int local28 = arg3;
		@Pc(37) int local37;
		@Pc(48) int local48;
		if (local10 != 0) {
			local37 = Class46.anIntArray226[local10];
			local21 = local37 * -arg3 >> 16;
			local48 = Class46.anIntArray225[local10];
			local28 = arg3 * local48 >> 16;
		}
		if (local17 != 0) {
			local37 = Class46.anIntArray226[local17];
			local19 = local37 * local28 >> 16;
			local48 = Class46.anIntArray225[local17];
			local28 = local28 * local48 >> 16;
		}
		Static134.anInt2897 = arg4;
		Static17.anInt438 = arg1 - local19;
		Static165.anInt2958 = arg0 - local28;
		Static28.anInt2840 = arg2 - local21;
		Static79.anInt1908 = arg6;
	}

	@OriginalMember(owner = "client!eg", name = "q", descriptor = "(B)V")
	public static void method952() {
		Static172.aClass27_100.method963();
	}
}
