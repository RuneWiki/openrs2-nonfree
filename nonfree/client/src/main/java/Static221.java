import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static221 {

	@OriginalMember(owner = "client!ns", name = "h", descriptor = "Lclient!ir;")
	public static Class94 aClass94_3;

	@OriginalMember(owner = "client!ns", name = "d", descriptor = "Lclient!lg;")
	public static final Class119 aClass119_132 = new Class119(64);

	@OriginalMember(owner = "client!ns", name = "g", descriptor = "[I")
	public static final int[] anIntArray336 = new int[32];

	@OriginalMember(owner = "client!ns", name = "i", descriptor = "Lclient!se;")
	public static final Class179 aClass179_7 = new Class179(64);

	@OriginalMember(owner = "client!ns", name = "k", descriptor = "Ljava/lang/String;")
	public static String aString35 = null;

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(B)V")
	public static void method3901() {
		@Pc(1) Class119 local1 = Static304.aClass119_185;
		synchronized (Static304.aClass119_185) {
			Static304.aClass119_185.method3304();
		}
		local1 = Static286.aClass119_172;
		synchronized (Static286.aClass119_172) {
			Static286.aClass119_172.method3304();
		}
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(Lclient!tq;Lclient!tq;I)V")
	public static void method3902(@OriginalArg(0) Class191 arg0, @OriginalArg(1) Class191 arg1) {
		Static29.aClass191_17 = arg1;
		Static162.aClass191_101 = arg0;
	}
}
