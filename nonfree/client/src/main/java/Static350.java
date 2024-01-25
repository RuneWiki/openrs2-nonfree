import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static350 {

	@OriginalMember(owner = "client!nn", name = "t", descriptor = "F")
	public static float aFloat124;

	@OriginalMember(owner = "client!nn", name = "w", descriptor = "I")
	public static int anInt5888;

	@OriginalMember(owner = "client!nn", name = "O", descriptor = "Lclient!pi;")
	public static Class11_Sub1_Sub1_Sub2 aClass11_Sub1_Sub1_Sub2_4;

	@OriginalMember(owner = "client!nn", name = "x", descriptor = "I")
	public static int anInt5889 = -1;

	@OriginalMember(owner = "client!nn", name = "y", descriptor = "I")
	public static int anInt5890 = -2;

	@OriginalMember(owner = "client!nn", name = "A", descriptor = "Lclient!kfa;")
	public static final Class181 aClass181_67 = new Class181(37, 7);

	@OriginalMember(owner = "client!nn", name = "B", descriptor = "Z")
	public static boolean aBoolean441 = false;

	@OriginalMember(owner = "client!nn", name = "H", descriptor = "[I")
	public static final int[] anIntArray430 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

	@OriginalMember(owner = "client!nn", name = "N", descriptor = "[I")
	public static final int[] anIntArray431 = new int[3];

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "([BB)[B")
	public static byte[] method5057(@OriginalArg(0) byte[] arg0) {
		@Pc(14) int local14 = arg0.length;
		@Pc(17) byte[] local17 = new byte[local14];
		Static589.method5382(arg0, 0, local17, 0, local14);
		return local17;
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(IIIIIIZ)V")
	public static void method5060(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		Static503.anInt8950 = arg0;
		Static353.anInt6809 = arg3;
		Static378.anInt7106 = arg4;
		Static169.anInt3872 = arg1;
		Static252.anInt5118 = arg2;
		if (arg5 && Static353.anInt6809 >= 100) {
			Static86.anInt2132 = Static252.anInt5118 * 512 + 256;
			Static390.anInt7318 = Static503.anInt8950 * 512 + 256;
			Static5.anInt142 = Static482.method7333(Static493.anInt8836, Static390.anInt7318, Static86.anInt2132) - Static378.anInt7106;
		}
		Static84.anInt1994 = 2;
	}
}
