import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static460 {

	@OriginalMember(owner = "client!tk", name = "m", descriptor = "Lclient!rm;")
	public static Class250 aClass250_41;

	@OriginalMember(owner = "client!tk", name = "v", descriptor = "Lclient!dda;")
	public static Class53 aClass53_147;

	@OriginalMember(owner = "client!tk", name = "i", descriptor = "[I")
	public static final int[] anIntArray697 = new int[] { -1, -1, 1, 1 };

	@OriginalMember(owner = "client!tk", name = "s", descriptor = "I")
	public static int anInt9074 = 0;

	@OriginalMember(owner = "client!tk", name = "y", descriptor = "[I")
	public static final int[] anIntArray698 = new int[13];

	@OriginalMember(owner = "client!tk", name = "C", descriptor = "S")
	public static short aShort153 = 32767;

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(Lclient!wca;I)V")
	public static void method7580(@OriginalArg(0) Class310 arg0) {
		if (arg0.anInt9220 == 5 && arg0.anInt9224 != -1) {
			Static363.method1123(arg0, Static103.aClass39_3);
		}
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(IIB)Z")
	public static boolean method7584(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(Z)V")
	public static void method7590() {
		Static367.aClass314_1 = new Class314(8);
		Static293.anInt5392 = 0;
		for (@Pc(17) Class6_Sub7 local17 = (Class6_Sub7) Static218.aClass107_3.method2832(); local17 != null; local17 = (Class6_Sub7) Static218.aClass107_3.method2835()) {
			local17.method6405();
		}
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(IIZ)V")
	public static void method7592(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class2_Sub13_Sub15 local8 = Static370.method5893(arg1, 5);
		local8.method6968();
		local8.anInt8318 = arg0;
	}
}
