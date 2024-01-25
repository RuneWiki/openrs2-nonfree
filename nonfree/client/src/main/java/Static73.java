import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static73 {

	@OriginalMember(owner = "client!eo", name = "d", descriptor = "Lclient!wo;")
	public static Class216 aClass216_27;

	@OriginalMember(owner = "client!eo", name = "g", descriptor = "Lclient!wo;")
	public static Class216 aClass216_28;

	@OriginalMember(owner = "client!eo", name = "k", descriptor = "Lclient!d;")
	public static Class37 aClass37_1;

	@OriginalMember(owner = "client!eo", name = "c", descriptor = "I")
	public static int anInt1934 = 0;

	@OriginalMember(owner = "client!eo", name = "l", descriptor = "I")
	public static int anInt1940 = 0;

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(BLclient!wo;Lclient!wo;)V")
	public static void method1689(@OriginalArg(1) Class216 arg0, @OriginalArg(2) Class216 arg1) {
		aClass216_28 = arg1;
		Static259.aClass216_47 = arg0;
	}

	@OriginalMember(owner = "client!eo", name = "b", descriptor = "(I)V")
	public static void method1690() {
		@Pc(1) Class87 local1 = Static190.aClass87_35;
		synchronized (Static190.aClass87_35) {
			Static190.aClass87_35.method2477();
		}
		local1 = Static5.aClass87_1;
		synchronized (Static5.aClass87_1) {
			Static5.aClass87_1.method2477();
		}
		local1 = Static56.aClass87_14;
		synchronized (Static56.aClass87_14) {
			Static56.aClass87_14.method2477();
		}
		local1 = Static101.aClass87_19;
		synchronized (Static101.aClass87_19) {
			Static101.aClass87_19.method2477();
		}
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(IILclient!wo;ZIII)V")
	public static void method1692(@OriginalArg(1) int arg0, @OriginalArg(2) Class216 arg1, @OriginalArg(6) int arg2) {
		Static70.aClass216_23 = arg1;
		Static103.anInt2461 = 0;
		Static175.anInt3790 = 2;
		Static285.aBoolean421 = false;
		Static188.anInt4068 = arg2;
		Static28.anInt1014 = arg0;
		Static33.anInt1108 = 1;
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(IIIII)V")
	public static void method1693(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1) {
		Static268.anInt5477 = 0;
		Static197.anInt4211 = 0;
		Static326.anInt2469 = arg0;
		Static342.anInt3000 = arg1;
	}
}
