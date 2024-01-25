import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static265 {

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "Lclient!qg;")
	public static Class286 aClass286_3;

	@OriginalMember(owner = "client!jh", name = "c", descriptor = "I")
	public static int anInt4973 = 0;

	@OriginalMember(owner = "client!jh", name = "d", descriptor = "I")
	public static int anInt4974 = 0;

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(II)Z")
	public static boolean method4367(@OriginalArg(0) int arg0) {
		return arg0 != 1 && arg0 != 7;
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(B)I")
	public static int method4369() {
		@Pc(10) Class69 local10 = Static570.aClass69_60;
		synchronized (Static570.aClass69_60) {
			return Static570.aClass69_60.method1913();
		}
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(IIBLclient!ria;)V")
	public static void method4370(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class303 arg2) {
		if (arg2 == null) {
			return;
		}
		if (arg2.anObjectArray24 != null) {
			@Pc(13) Class2_Sub18 local13 = new Class2_Sub18();
			local13.aClass303_4 = arg2;
			local13.anObjectArray1 = arg2.anObjectArray24;
			Static156.method2728(local13);
		}
		Static557.aBoolean660 = true;
		Static398.anInt6843 = arg2.anInt7976;
		Static237.anInt4365 = arg2.anInt7952;
		Static252.anInt4804 = arg2.anInt7983;
		Static454.anInt7419 = arg2.anInt7962;
		Static264.anInt4966 = arg2.anInt7964;
		Static404.anInt6894 = arg0;
		Static613.anInt10082 = arg1;
		Static514.method7103(arg2);
	}
}
