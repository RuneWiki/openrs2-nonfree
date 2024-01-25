import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static371 {

	@OriginalMember(owner = "client!ns", name = "b", descriptor = "Ljava/lang/String;")
	public static String aString169;

	@OriginalMember(owner = "client!ns", name = "g", descriptor = "I")
	public static int anInt6488;

	@OriginalMember(owner = "client!ns", name = "d", descriptor = "I")
	public static final int anInt6485 = 1403;

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(III)V")
	public static void method5232(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) Class3_Sub7_Sub19 local10 = Static73.method5992(12, arg1);
		local10.method7363();
		local10.anInt9381 = arg0;
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(BF)F")
	public static float method5233(@OriginalArg(1) float arg0) {
		return arg0 * arg0 * arg0 * ((arg0 * 6.0F - 15.0F) * arg0 + 10.0F);
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(Lclient!ie;I)Lclient!vs;")
	public static Class110_Sub4 method5234(@OriginalArg(0) Class3_Sub26 arg0) {
		return new Class110_Sub4(arg0.method6789(), arg0.method6789(), arg0.method6789(), arg0.method6789(), arg0.method6830(), arg0.method6830(), arg0.method6814());
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(IIIIB)V")
	public static void method5235(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(10) Class3_Sub10 local10 = Static271.method4111();
		local10.aClass3_Sub26_Sub1_1.method6809(Static556.aClass126_35.anInt4274);
		local10.aClass3_Sub26_Sub1_1.method6809(arg0);
		local10.aClass3_Sub26_Sub1_1.method6809(arg3);
		local10.aClass3_Sub26_Sub1_1.method6769(arg2);
		local10.aClass3_Sub26_Sub1_1.method6769(arg1);
		Static193.method3398(local10);
		Static36.anInt1076 = -3;
		Static79.anInt2120 = 0;
		Static318.anInt5854 = 1;
		Static560.anInt9754 = 0;
	}
}
