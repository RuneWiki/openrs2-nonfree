import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static514 {

	@OriginalMember(owner = "client!rda", name = "f", descriptor = "I")
	public static int anInt8261 = -1;

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(IIILclient!ha;IIII)V")
	public static void method7237(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class13 arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4) {
		Static316.aClass13_10 = arg2;
		Static300.aClass239_4 = Static316.aClass13_10.method8461();
		Static161.aClass239_3 = Static316.aClass13_10.method8461();
		Static638.aClass239_10 = Static316.aClass13_10.method8461();
		Static76.anInt1404 = 1;
		Static218.anInt4139 = 0;
		Static146.anInt2953 = 0;
		Static336.anInt5533 = arg1;
		Static278.anInt3283 = 2;
		Static9.anInt105 = arg3;
		Static163.anInterface26_1 = null;
		Static8.anInt97 = 2;
		Static14.method198(arg0, arg4);
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(III)Z")
	public static boolean method7238(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(22) boolean local22 = (arg0 & 0x37) == 0 ? Static581.method7252(arg1, arg0) : Static257.method4214(arg0, arg1);
		return (arg1 & 0x10000) != 0 | Static154.method2816(arg1, arg0) | local22;
	}
}
