import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static128 {

	@OriginalMember(owner = "client!od", name = "U", descriptor = "Lclient!a;")
	public static Class1_Sub1 aClass1_Sub1_20;

	@OriginalMember(owner = "client!od", name = "c", descriptor = "(B)V")
	public static void method1940() {
		@Pc(1) Class83 local1 = Static183.aClass83_1;
		synchronized (Static183.aClass83_1) {
			Static129.anInt2784 = Static83.anInt1745;
			Static190.anInt4379 = Static180.anInt4017;
			Static3.anInt153 = Static20.anInt507;
			Static107.anInt2370 = Static20.anInt502;
			Static37.anInt855 = Static67.anInt1477;
			Static20.anInt497 = Static36.anInt823;
			Static38.aLong29 = Static42.aLong33;
			Static20.anInt502 = 0;
		}
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(IIII)V")
	public static void method1941(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) Class3_Sub15 local7 = Static185.aClass3_Sub15ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 != null) {
			Static185.aClass3_Sub15ArrayArrayArray1[arg0][arg1][arg2].anInt1999 = arg3;
		}
	}

	@OriginalMember(owner = "client!od", name = "c", descriptor = "(II)V")
	public static void method1942() {
		Static121.anInt2648 = -1;
		Static171.aBoolean153 = false;
		Static49.anInt1089 = 1;
		Static172.anInt3855 = -1;
		Static25.anInt573 = 0;
		Static10.aClass1_1 = null;
		Static52.anInt1143 = 2;
	}
}
