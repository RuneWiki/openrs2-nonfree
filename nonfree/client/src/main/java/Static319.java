import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static319 {

	@OriginalMember(owner = "client!pt", name = "j", descriptor = "I")
	public static int anInt5750;

	@OriginalMember(owner = "client!pt", name = "c", descriptor = "Lclient!qv;")
	public static final Class214 aClass214_177 = new Class214(82, 4);

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "([SI[Ljava/lang/String;)V")
	public static void method4776(@OriginalArg(0) short[] arg0, @OriginalArg(2) String[] arg1) {
		Static260.method4227(0, arg1, arg1.length - 1, arg0);
	}

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(IBIII)V")
	public static void method4777(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class4_Sub1_Sub5 local8 = Static431.method5935(8, arg0);
		local8.method521();
		local8.anInt616 = arg2;
		local8.anInt621 = arg3;
		local8.anInt614 = arg1;
	}

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(BLclient!qa;Lclient!ci;)V")
	public static void method4779(@OriginalArg(1) Class30 arg0, @OriginalArg(2) Class38 arg1) {
		if (Static456.aBoolean571) {
			return;
		}
		arg0.l(0);
		Static218.aClass2_23 = arg0.method2031(Static472.method2846(arg1, Static245.anInt4782));
		Static218.aClass2_23.method5921((Static374.anInt6595 - Static218.aClass2_23.d()) / 2, (Static30.anInt518 - Static218.aClass2_23.ga()) / 2);
		Static15.aClass2_3 = arg0.method2031(Static472.method2846(arg1, Static391.anInt6799));
		Static15.aClass2_3.method5921((Static374.anInt6595 - Static15.aClass2_3.d()) / 2, 18);
		Static456.aBoolean571 = true;
	}
}
