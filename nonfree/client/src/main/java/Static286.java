import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static286 {

	@OriginalMember(owner = "client!li", name = "t", descriptor = "I")
	public static int anInt5387;

	@OriginalMember(owner = "client!li", name = "u", descriptor = "I")
	public static int anInt5388;

	@OriginalMember(owner = "client!li", name = "b", descriptor = "(B)V")
	public static void method4665() {
		Static528.method7220(Static140.aClass6_Sub48_Sub1_1.aBoolean687);
		Static96.aClass6_Sub18_Sub2_1 = new Class6_Sub18_Sub2();
		Static96.aClass6_Sub18_Sub2_1.method3318();
		Static3.aClass11_1 = Static244.method4236(Static32.aCanvas3, Static352.aClass272_2, 22050, 0);
		Static3.aClass11_1.method6285(Static96.aClass6_Sub18_Sub2_1);
		Static492.method6723(Static58.aClass251_18, Static423.aClass251_97, Static96.aClass6_Sub18_Sub2_1, Static13.aClass251_101);
		Static35.aClass11_3 = Static244.method4236(Static32.aCanvas3, Static352.aClass272_2, 2048, 1);
		Static374.aClass6_Sub18_Sub4_2 = new Class6_Sub18_Sub4();
		Static35.aClass11_3.method6285(Static374.aClass6_Sub18_Sub4_2);
		Static23.aClass250_5 = new Class250(22050, Static330.anInt6003);
		Static384.anInt6755 = Static370.aClass251_89.method5764("scape main");
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(II[S)[S")
	public static short[] method4666(@OriginalArg(0) int arg0, @OriginalArg(2) short[] arg1) {
		@Pc(6) short[] local6 = new short[arg0];
		Static601.method2933(arg1, 0, local6, 0, arg0);
		return local6;
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(BI)I")
	public static int method4667(@OriginalArg(1) int arg0) {
		return arg0 >>> 8;
	}
}
