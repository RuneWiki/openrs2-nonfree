import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static76 {

	@OriginalMember(owner = "client!er", name = "e", descriptor = "I")
	public static int anInt1981 = 0;

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(ZILclient!po;)V")
	public static void method1725(@OriginalArg(1) int arg0, @OriginalArg(2) Class165 arg1) {
		if (Static140.aBoolean292) {
			arg0 = 0;
			Static140.aBoolean292 = false;
		}
		if (Static340.aClass165_2 != null && Static340.aClass165_2.method4379(arg1)) {
			return;
		}
		Static340.aClass165_2 = arg1;
		Static35.aLong38 = Static162.method3252();
		Static175.anInt3788 = arg0;
		Static182.anInt3945 = arg0;
		if (Static182.anInt3945 == 0) {
			Static339.method5476();
			return;
		}
		Static33.aFloat4 = Static33.aFloat3;
		Static285.aFloat65 = Static146.aFloat41;
		Static275.anInt5614 = Static171.anInt3677;
		Static198.anInt1218 = Static303.anInt2314;
		Static335.anInt6433 = Static157.anInt4858;
		Static74.aFloat12 = Static107.aFloat38;
		Static77.aFloat14 = Static168.aFloat48;
		Static131.aFloat39 = Static249.aFloat72;
		Static273.aFloat75 = Static29.aFloat2;
		Static307.aClass114_4 = Static153.aClass114_1;
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(Lclient!ol;Z)Z")
	public static boolean method1726(@OriginalArg(0) Interface5 arg0) {
		@Pc(14) Class141 local14 = Static119.method2548(arg0.method4799());
		if (local14.anInt4287 == -1) {
			return true;
		} else {
			@Pc(25) Class151 local25 = Static195.method3774(local14.anInt4287);
			return local25.anInt4613 == -1 ? true : local25.method4149();
		}
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lclient!pq;")
	public static RuntimeException_Sub1 method1727(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(9) RuntimeException_Sub1 local9;
		if (arg0 instanceof RuntimeException_Sub1) {
			local9 = (RuntimeException_Sub1) arg0;
			local9.aString53 = local9.aString53 + ' ' + arg1;
		} else {
			local9 = new RuntimeException_Sub1(arg0, arg1);
		}
		return local9;
	}
}
