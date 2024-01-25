import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static80 {

	@OriginalMember(owner = "client!dv", name = "I", descriptor = "F")
	public static float aFloat46;

	@OriginalMember(owner = "client!dv", name = "M", descriptor = "Lclient!ok;")
	public static Class178 aClass178_22;

	@OriginalMember(owner = "client!dv", name = "G", descriptor = "[I")
	public static final int[] anIntArray109 = new int[13];

	@OriginalMember(owner = "client!dv", name = "H", descriptor = "I")
	public static int anInt1631 = 0;

	@OriginalMember(owner = "client!dv", name = "L", descriptor = "Lclient!dp;")
	public static final Class55 aClass55_37 = new Class55("yellow:", "gelb:", "jaune:", "amarelo:");

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "(IIIB)V")
	public static void method1411(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(13) Class7_Sub4_Sub14 local13 = Static54.method750(arg1, 11);
		local13.method4716();
		local13.anInt5867 = arg0;
		local13.anInt5868 = arg2;
	}
}
