import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static413 {

	@OriginalMember(owner = "client!ur", name = "i", descriptor = "Lclient!ok;")
	public static Class178 aClass178_124;

	@OriginalMember(owner = "client!ur", name = "m", descriptor = "I")
	public static int anInt6557;

	@OriginalMember(owner = "client!ur", name = "j", descriptor = "[S")
	public static short[] aShortArray114 = new short[256];

	@OriginalMember(owner = "client!ur", name = "l", descriptor = "I")
	public static int anInt6556 = -1;

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(I)V")
	public static void method5187() {
		Static226.aClass126_26.method2827();
		Static303.aClass126_42.method2827();
		Static364.aClass126_18.method2827();
		Static68.aClass126_11.method2827();
		Static57.aClass126_8.method2827();
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(ILclient!go;)V")
	public static void method5189(@OriginalArg(1) Class95 arg0) {
		if (Static370.anInt5910 == arg0.anInt2608) {
			Static69.aBooleanArray2[arg0.anInt2611] = true;
		}
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(IIIILclient!vd;IZ[B)Lclient!wq;")
	public static Class59_Sub3_Sub1 method5191(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) Class51_Sub2 arg2, @OriginalArg(7) byte[] arg3) {
		if (arg2.aBoolean467 || Static217.method3066(arg0) && Static217.method3066(arg1)) {
			return new Class59_Sub3_Sub1(arg2, 3553, 6406, arg0, arg1, false, arg3, 6406);
		} else if (arg2.aBoolean442) {
			return new Class59_Sub3_Sub1(arg2, 34037, 6406, arg0, arg1, false, arg3, 6406);
		} else {
			return new Class59_Sub3_Sub1(arg2, 6406, arg0, arg1, Static444.method5654(arg0), Static444.method5654(arg1), arg3, 6406);
		}
	}
}
