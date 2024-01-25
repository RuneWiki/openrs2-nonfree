import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static47 {

	@OriginalMember(owner = "client!cq", name = "Y", descriptor = "I")
	public static int anInt1032;

	@OriginalMember(owner = "client!cq", name = "X", descriptor = "Lclient!wq;")
	public static final Class216 aClass216_17 = new Class216();

	@OriginalMember(owner = "client!cq", name = "Z", descriptor = "[I")
	public static int[] anIntArray90 = new int[2];

	@OriginalMember(owner = "client!cq", name = "cb", descriptor = "[C")
	public static final char[] aCharArray3 = new char[] { '€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ' };

	@OriginalMember(owner = "client!cq", name = "eb", descriptor = "Lclient!lg;")
	public static Class119 aClass119_29 = new Class119(128);

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(Lclient!ol;IIII)V")
	public static void method1119(@OriginalArg(0) Class145 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg1 == 1 && arg3 > 0) {
			Static308.method4629(arg0, arg2, arg3 - 1, arg4);
		} else if (arg1 == 4 && arg3 <= Static223.anInt4280) {
			Static308.method4629(arg0, arg2, arg3 + 1, arg4);
		} else if (arg1 == 8 && arg4 > 0) {
			Static308.method4629(arg0, arg2, arg3, arg4 - 1);
		} else if (arg1 == 2 && arg4 <= Static160.anInt3244) {
			Static308.method4629(arg0, arg2, arg3, arg4 + 1);
		} else if (arg1 == 16 && arg3 > 0 && arg4 <= Static160.anInt3244) {
			Static308.method4629(arg0, arg2, arg3 - 1, arg4 + 1);
		} else if (arg1 == 32 && arg3 <= Static223.anInt4280 && arg4 <= Static160.anInt3244) {
			Static308.method4629(arg0, arg2, arg3 + 1, arg4 + 1);
		} else if (arg1 == 128 && arg3 > 0 && arg4 > 0) {
			Static308.method4629(arg0, arg2, arg3 - 1, arg4 - 1);
		} else if (arg1 == 64 && arg3 <= Static223.anInt4280 && arg4 > 0) {
			Static308.method4629(arg0, arg2, arg3 + 1, arg4 - 1);
		} else {
			throw new RuntimeException("Unsupported wall shape " + arg1 + " in world2.setclosestlights_wall");
		}
	}

	@OriginalMember(owner = "client!cq", name = "f", descriptor = "(B)V")
	public static void method1120() {
		Static256.aClass119_157.method3304();
	}

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(I[Ljava/lang/String;[S)V")
	public static void method1121(@OriginalArg(1) String[] arg0, @OriginalArg(2) short[] arg1) {
		Static136.method2711(arg0, arg0.length - 1, arg1, 0);
	}
}
