import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static193 {

	@OriginalMember(owner = "client!ft", name = "J", descriptor = "D")
	public static double aDouble13;

	@OriginalMember(owner = "client!ft", name = "S", descriptor = "Lclient!jia;")
	public static final Class186 aClass186_61 = new Class186(87, 6);

	@OriginalMember(owner = "client!ft", name = "H", descriptor = "Lclient!pi;")
	public static final Class286 aClass286_34 = new Class286(15, -1);

	@OriginalMember(owner = "client!ft", name = "W", descriptor = "Lclient!nl;")
	public static final Class258 aClass258_5 = new Class258("", 21);

	@OriginalMember(owner = "client!ft", name = "C", descriptor = "[I")
	public static final int[] anIntArray174 = new int[3];

	@OriginalMember(owner = "client!ft", name = "L", descriptor = "I")
	public static int anInt3390 = 0;

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(BLclient!av;Lclient!ha;)V")
	public static void method2927(@OriginalArg(1) Class20 arg0, @OriginalArg(2) Class67 arg1) {
		@Pc(41) boolean local41 = Static243.aClass406_2.method9390(arg1, arg0.anInt593, arg0.anInt578 | 0xFF000000, arg0.anInt595, arg0.anInt584, arg0.anInt596, arg0.aBoolean34 ? Static251.aClass19_Sub1_Sub3_Sub2_Sub2_2.aClass236_1 : null) == null;
		if (local41) {
			Static192.aClass357_10.method8401(new Class3_Sub37(arg0.anInt595, arg0.anInt593, arg0.anInt584, arg0.anInt578 | 0xFF000000, arg0.anInt596, arg0.aBoolean34));
			Static391.method5905(arg0);
		}
	}

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(IB)Z")
	public static boolean method2928(@OriginalArg(0) int arg0) {
		return arg0 == 20 || arg0 == 22 || arg0 == 46 || arg0 == 15 || arg0 == 5 || arg0 == 9 || arg0 == 13 || arg0 == 8 || arg0 == 18 || arg0 == 58 || arg0 == 47;
	}
}
