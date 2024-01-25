import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static457 {

	@OriginalMember(owner = "client!wm", name = "d", descriptor = "[[B")
	public static byte[][] aByteArrayArray34;

	@OriginalMember(owner = "client!wm", name = "e", descriptor = "Lclient!of;")
	public static final Class174 aClass174_214 = new Class174("Loaded textures", "Texturen geladen.", "Textures chargées", "Texturas carregadas");

	@OriginalMember(owner = "client!wm", name = "g", descriptor = "I")
	public static int anInt7712 = 0;

	@OriginalMember(owner = "client!wm", name = "h", descriptor = "I")
	public static int anInt7713 = 0;

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(FFFII)F")
	public static float method6230(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(4) int arg3) {
		@Pc(15) float[] local15 = Static13.aFloatArrayArray1[arg3];
		return arg2 * local15[0] + arg1 * local15[1] + local15[2] * arg0;
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(ZBI)Lclient!ls;")
	public static Class3_Sub32 method6232(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1) {
		@Pc(17) long local17 = (long) (arg1 | (arg0 ? Integer.MIN_VALUE : 0));
		return (Class3_Sub32) Static96.aClass140_16.method3490(local17);
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(III)V")
	public static void method6233(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class3_Sub3_Sub4 local8 = Static281.method3883(1, arg0);
		local8.method1003();
		local8.anInt972 = arg1;
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(Z)V")
	public static void method6234() {
		Static132.aClass167_4.method5998(Static366.aFloat94, Static410.aFloat98, Static258.aFloat60);
	}
}
