import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static594 {

	@OriginalMember(owner = "client!vaa", name = "p", descriptor = "Lclient!pea;")
	public static Class253 aClass253_1;

	@OriginalMember(owner = "client!vaa", name = "r", descriptor = "Lclient!d;")
	public static Interface4 anInterface4_11;

	@OriginalMember(owner = "client!vaa", name = "k", descriptor = "Ljava/lang/String;")
	public static String aString110 = null;

	@OriginalMember(owner = "client!vaa", name = "n", descriptor = "[Lclient!rg;")
	public static final Class6_Sub40[] aClass6_Sub40Array1 = new Class6_Sub40[2048];

	@OriginalMember(owner = "client!vaa", name = "e", descriptor = "(II)V")
	public static void method8353(@OriginalArg(0) int arg0) {
		Static291.anInt5751 = arg0;
		@Pc(11) Class166 local11 = Static201.aClass166_20;
		synchronized (Static201.aClass166_20) {
			Static201.aClass166_20.method4811();
		}
	}
}
