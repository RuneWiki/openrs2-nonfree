import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static538 {

	@OriginalMember(owner = "client!vd", name = "h", descriptor = "[I")
	public static int[] anIntArray807;

	@OriginalMember(owner = "client!vd", name = "i", descriptor = "I")
	public static int anInt9264;

	@OriginalMember(owner = "client!vd", name = "j", descriptor = "I")
	public static int anInt9265;

	@OriginalMember(owner = "client!vd", name = "d", descriptor = "Lclient!kfa;")
	public static final Class181 aClass181_109 = new Class181(73, -1);

	@OriginalMember(owner = "client!vd", name = "g", descriptor = "Lclient!kfa;")
	public static final Class181 aClass181_110 = new Class181(61, 7);

	@OriginalMember(owner = "client!vd", name = "k", descriptor = "I")
	public static int anInt9266 = -1;

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(III)Z")
	public static boolean method7765(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static370.method5898(arg0, arg1) & Static174.method3505(arg1, arg0);
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(IIIII)V")
	public static void method7766(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		Static547.aClass6_Sub26_Sub2_2.anInt5769 = 0;
		Static547.aClass6_Sub26_Sub2_2.method4950(Static562.aClass219_7.anInt6222, -81849);
		Static547.aClass6_Sub26_Sub2_2.method4950(arg1, -81849);
		Static547.aClass6_Sub26_Sub2_2.method4950(arg2, -81849);
		Static547.aClass6_Sub26_Sub2_2.method4962(arg3);
		Static547.aClass6_Sub26_Sub2_2.method4962(arg0);
		Static443.anInt8142 = 0;
		Static159.anInt3401 = 1;
		Static70.anInt1692 = 0;
		Static350.anInt5890 = -3;
	}

	@OriginalMember(owner = "client!vd", name = "b", descriptor = "(III)I")
	public static int method7767(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = arg1 >>> 31;
		return (local12 + arg1) / arg0 - local12;
	}
}
