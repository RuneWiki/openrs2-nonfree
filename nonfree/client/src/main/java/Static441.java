import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static441 {

	@OriginalMember(owner = "client!rb", name = "c", descriptor = "Lclient!fb;")
	public static Class92 aClass92_4;

	@OriginalMember(owner = "client!rb", name = "l", descriptor = "Lclient!em;")
	public static final Class83 aClass83_167 = new Class83(75, 3);

	@OriginalMember(owner = "client!rb", name = "n", descriptor = "Lclient!faa;")
	public static final Class91 aClass91_34 = new Class91(512);

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(IIIII)V")
	public static void method6228(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class1_Sub8_Sub9 local8 = Static465.method6470(arg2, 4);
		local8.method4833();
		local8.anInt5970 = arg1;
		local8.anInt5969 = arg0;
		local8.anInt5968 = arg3;
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(II)V")
	public static void method6230(@OriginalArg(0) int arg0) {
		@Pc(17) Class1_Sub8_Sub9 local17 = Static465.method6470(arg0, 16);
		local17.method4835();
	}
}
