import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static246 {

	@OriginalMember(owner = "client!pr", name = "e", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray29;

	@OriginalMember(owner = "client!pr", name = "f", descriptor = "Lclient!ir;")
	public static Class100 aClass100_99;

	@OriginalMember(owner = "client!pr", name = "d", descriptor = "I")
	public static int anInt4860 = 0;

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(II)V")
	public static void method4180() {
		Static296.aClass198_54.method5243(5);
	}

	@OriginalMember(owner = "client!pr", name = "b", descriptor = "(I)V")
	public static void method4182() {
		Static323.method5290();
		for (@Pc(13) int local13 = 0; local13 < 4; local13++) {
			Static34.aClass13Array1[local13].method241();
		}
		Static80.method1269();
		Static333.method5471();
		System.gc();
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(IBILclient!sj;)V")
	public static void method4183(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class181 arg2) {
		Static29.anInt728 = arg0;
		Static91.aClass181_16 = arg2;
		Static273.anInt5484 = arg1;
	}
}
