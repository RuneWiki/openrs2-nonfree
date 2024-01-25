import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static290 {

	@OriginalMember(owner = "client!nt", name = "y", descriptor = "Lclient!hd;")
	public static Class66 aClass66_1;

	@OriginalMember(owner = "client!nt", name = "l", descriptor = "Ljava/lang/String;")
	public static String aString52 = null;

	@OriginalMember(owner = "client!nt", name = "v", descriptor = "[F")
	public static final float[] aFloatArray12 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

	@OriginalMember(owner = "client!nt", name = "z", descriptor = "Lclient!jp;")
	public static final Class129 aClass129_116 = new Class129(22, 8);

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(ZII)V")
	public static void method3600(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class5_Sub26 local8 = Static176.method2415(arg0, arg1);
		if (local8 != null) {
			local8.method6003();
		}
	}

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(IIII)V")
	public static void method3603(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(14) Class196 local14 = Static277.aClass196ArrayArray1[arg0][arg2];
		Static336.method4358(arg1, local14 == null ? Static66.aClass196_1 : local14);
	}
}
