import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static233 {

	@OriginalMember(owner = "client!oi", name = "b", descriptor = "[I")
	public static int[] anIntArray394;

	@OriginalMember(owner = "client!oi", name = "c", descriptor = "F")
	public static float aFloat51;

	@OriginalMember(owner = "client!oi", name = "d", descriptor = "[[I")
	public static final int[][] anIntArrayArray47 = new int[128][128];

	@OriginalMember(owner = "client!oi", name = "f", descriptor = "Lclient!wl;")
	public static final Class221 aClass221_165 = new Class221(3, 2);

	@OriginalMember(owner = "client!oi", name = "g", descriptor = "I")
	public static final int anInt5025 = 12;

	@OriginalMember(owner = "client!oi", name = "i", descriptor = "[S")
	public static final short[] aShortArray91 = new short[] { 57, 49, 11, 5, 10, 18, 58, 15 };

	@OriginalMember(owner = "client!oi", name = "j", descriptor = "[I")
	public static int[] anIntArray395 = new int[2];

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(IIZIIIZ)V")
	public static void method4279(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		Static132.anInt2841 = arg2;
		Static20.anInt317 = arg4;
		Static354.anInt6770 = arg3;
		Static243.anInt5174 = arg0;
		Static241.anInt5137 = arg1;
		if (arg5 && Static241.anInt5137 >= 100) {
			Static51.anInt879 = Static243.anInt5174 * 128 + 64;
			Static166.anInt3804 = Static132.anInt2841 * 128 + 64;
			Static23.anInt356 = Static97.method1899(Static291.anInt5263, Static51.anInt879, Static166.anInt3804) - Static20.anInt317;
		}
		Static135.anInt2910 = 2;
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(I)V")
	public static void method4280() {
		Static251.aClass107_32.method3012();
	}

	@OriginalMember(owner = "client!oi", name = "b", descriptor = "(I)V")
	public static void method4281() {
		Static176.aClass65_1 = new Class65(8);
		Static38.anInt555 = 0;
		for (@Pc(17) Class57_Sub6 local17 = (Class57_Sub6) Static67.aClass193_5.method5224(); local17 != null; local17 = (Class57_Sub6) Static67.aClass193_5.method5223()) {
			local17.method3850();
		}
	}
}
