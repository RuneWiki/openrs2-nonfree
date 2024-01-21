import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static8 {

	@OriginalMember(owner = "client!ah", name = "H", descriptor = "[Lclient!hd;")
	public static Class1_Sub10[] aClass1_Sub10Array1;

	@OriginalMember(owner = "client!ah", name = "t", descriptor = "Lclient!vd;")
	private static final Class92 aClass92_67 = Static187.method3089("Ok");

	@OriginalMember(owner = "client!ah", name = "y", descriptor = "Lclient!vd;")
	private static final Class92 aClass92_68 = Static187.method3089("This world is full)3");

	@OriginalMember(owner = "client!ah", name = "z", descriptor = "Lclient!vd;")
	private static final Class92 aClass92_69 = Static187.method3089("Loaded config");

	@OriginalMember(owner = "client!ah", name = "D", descriptor = "Lclient!vd;")
	public static Class92 aClass92_70 = aClass92_67;

	@OriginalMember(owner = "client!ah", name = "E", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_71 = Static187.method3089(" loggt sich ein)3");

	@OriginalMember(owner = "client!ah", name = "F", descriptor = "Lclient!vd;")
	public static Class92 aClass92_72 = aClass92_68;

	@OriginalMember(owner = "client!ah", name = "K", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_73 = Static187.method3089("null");

	@OriginalMember(owner = "client!ah", name = "M", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_74 = Static187.method3089("und loggen sich dann erneut ein)3");

	@OriginalMember(owner = "client!ah", name = "Q", descriptor = "Lclient!vd;")
	public static Class92 aClass92_75 = aClass92_69;

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(IIIII)V")
	public static void method158(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1) {
		Static118.anInt2521 = 0;
		Static116.anInt2488 = arg1;
		Static204.anInt2389 = arg0;
		Static102.anInt2207 = 0;
	}

	@OriginalMember(owner = "client!ah", name = "c", descriptor = "()V")
	public static void method160() {
		for (@Pc(1) int local1 = 0; local1 < Static60.anInt1454; local1++) {
			@Pc(6) Class16 local6 = Static26.aClass16Array1[local1];
			Static172.method2715(local6);
			Static26.aClass16Array1[local1] = null;
		}
		Static60.anInt1454 = 0;
	}

	@OriginalMember(owner = "client!ah", name = "c", descriptor = "(I)V")
	public static void method162() {
		for (@Pc(14) Class1_Sub19 local14 = (Class1_Sub19) Static49.aClass20_3.method467(); local14 != null; local14 = (Class1_Sub19) Static49.aClass20_3.method468()) {
			if (local14.aClass1_Sub3_Sub5_1 != null) {
				local14.method1862();
			}
		}
	}
}
