import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static60 {

	@OriginalMember(owner = "client!cr", name = "b", descriptor = "Lclient!m;")
	public static Interface7 anInterface7_2;

	@OriginalMember(owner = "client!cr", name = "n", descriptor = "I")
	public static int anInt1437;

	@OriginalMember(owner = "client!cr", name = "k", descriptor = "Lclient!oi;")
	public static final Class175 aClass175_49 = new Class175("red:", "rot:", "rouge:", "vermelho:");

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(IBIZLclient!dn;I)V")
	public static void method1187(@OriginalArg(0) int arg0, @OriginalArg(4) Class56 arg1, @OriginalArg(5) int arg2) {
		Static290.anInt5320 = arg2;
		Static76.anInt1664 = 0;
		Static80.anInt1719 = 10000;
		Static437.aBoolean516 = false;
		Static27.aClass56_11 = arg1;
		Static454.anInt7690 = arg0;
		Static347.anInt6319 = 1;
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(ILclient!as;B)V")
	public static void method1197(@OriginalArg(0) int arg0, @OriginalArg(1) Class14 arg1) {
		if (Static139.aBoolean248) {
			arg0 = 0;
			Static139.aBoolean248 = false;
		}
		if (Static97.aClass14_1 != null && Static97.aClass14_1.method540(arg1)) {
			return;
		}
		Static97.aClass14_1 = arg1;
		Static119.aLong79 = Static150.method2672();
		Static348.anInt7447 = arg0;
		Static183.anInt4103 = arg0;
		if (Static183.anInt4103 != 0) {
			Static392.aClass7_3 = Static158.aClass7_2;
			Static376.aFloat96 = Static122.aFloat25;
			Static404.aFloat93 = Static213.aFloat57;
			Static400.anInt6963 = Static248.anInt4664;
			Static79.anInt1713 = Static354.anInt6359;
			Static31.aFloat12 = Static63.aFloat91;
			Static367.aFloat88 = Static338.aFloat15;
			Static73.aFloat20 = Static325.aFloat72;
			Static52.aFloat13 = Static21.aFloat10;
			Static3.anInt5987 = Static177.anInt3620;
			return;
		}
		Static127.method2219();
	}
}
