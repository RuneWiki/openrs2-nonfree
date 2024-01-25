import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static54 {

	@OriginalMember(owner = "client!cs", name = "w", descriptor = "I")
	public static int anInt3489;

	@OriginalMember(owner = "client!cs", name = "B", descriptor = "I")
	public static int anInt3491;

	@OriginalMember(owner = "client!cs", name = "G", descriptor = "I")
	public static int anInt3494;

	@OriginalMember(owner = "client!cs", name = "u", descriptor = "I")
	public static int anInt3487 = 0;

	@OriginalMember(owner = "client!cs", name = "x", descriptor = "Ljava/lang/String;")
	public static String aString137 = "Started 3d Library";

	@OriginalMember(owner = "client!cs", name = "z", descriptor = "Ljava/lang/String;")
	public static String aString138 = "Checking for updates - ";

	@OriginalMember(owner = "client!cs", name = "C", descriptor = "I")
	public static int anInt3492 = 0;

	@OriginalMember(owner = "client!cs", name = "F", descriptor = "[I")
	public static final int[] anIntArray415 = new int[4096];

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(BD)V")
	public static void method3230(@OriginalArg(1) double arg0) {
		if (Static205.aDouble9 == arg0) {
			return;
		}
		for (@Pc(15) int local15 = 0; local15 < 256; local15++) {
			@Pc(27) int local27 = (int) (Math.pow((double) local15 / 255.0D, arg0) * 255.0D);
			Static188.anIntArray463[local15] = local27 > 255 ? 255 : local27;
		}
		Static205.aDouble9 = arg0;
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(BIIIZ)V")
	public static void method3231(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		if (Static198.method3725(arg0)) {
			Static73.method1435(arg1, Static314.aClass177ArrayArray1[arg0], -1, arg2, arg3);
		}
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(Lclient!po;Z)V")
	public static void method3233(@OriginalArg(0) Class15_Sub7 arg0) {
		arg0.aClass5_Sub3_Sub3_1 = null;
		if (Static110.anInt2235 < 20) {
			Static149.aClass175_3.method4672(arg0);
			Static110.anInt2235++;
		}
	}
}
