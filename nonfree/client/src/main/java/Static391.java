import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static391 {

	@OriginalMember(owner = "client!o", name = "h", descriptor = "Lclient!hd;")
	public static Class126 aClass126_1;

	@OriginalMember(owner = "client!o", name = "a", descriptor = "I")
	public static int anInt7325 = 0;

	@OriginalMember(owner = "client!o", name = "b", descriptor = "Ljava/lang/String;")
	public static String aString87 = null;

	@OriginalMember(owner = "client!o", name = "g", descriptor = "[F")
	public static final float[] aFloatArray65 = new float[] { 0.0F, -1.0F, 0.0F, 0.0F };

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(III)V")
	public static void method6237(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) Class6_Sub2_Sub9 local13 = Static144.method2332(7, arg1);
		local13.method3723();
		local13.anInt4294 = arg0;
	}
}
