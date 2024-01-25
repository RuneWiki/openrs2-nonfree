import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static225 {

	@OriginalMember(owner = "client!oa", name = "o", descriptor = "[I")
	public static int[] anIntArray360;

	@OriginalMember(owner = "client!oa", name = "p", descriptor = "I")
	public static int anInt4917;

	@OriginalMember(owner = "client!oa", name = "l", descriptor = "Lclient!nn;")
	public static final Class140 aClass140_117 = new Class140("Drop", "Fallen lassen", "Poser", "Largar");

	@OriginalMember(owner = "client!oa", name = "m", descriptor = "Lclient!wl;")
	public static final Class221 aClass221_161 = new Class221(29, 6);

	@OriginalMember(owner = "client!oa", name = "q", descriptor = "I")
	public static int anInt4918 = 0;

	@OriginalMember(owner = "client!oa", name = "r", descriptor = "Lclient!pf;")
	public static final Class157 aClass157_148 = new Class157(72, -1);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(II)V")
	public static void method4185() {
		@Pc(5) Class107 local5 = Static258.aClass107_36;
		synchronized (Static258.aClass107_36) {
			Static258.aClass107_36.method3011(5);
		}
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIII)V")
	public static void method4187(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(13) Class68 local13 = Static50.method942(arg2, arg1);
		if (local13 == null) {
			return;
		}
		if (local13.anObjectArray16 != null) {
			@Pc(23) Class2_Sub41 local23 = new Class2_Sub41();
			local23.aClass68_35 = local13;
			local23.anObjectArray35 = local13.anObjectArray16;
			Static367.method5890(local23);
		}
		Static7.anInt142 = arg0;
		Static134.anInt2876 = arg3;
		Static310.anInt6128 = arg1;
		Static71.anInt1272 = arg2;
		Static60.aBoolean109 = true;
		Static145.anInt3131 = arg5;
		Static333.anInt6459 = arg4;
		Static292.anInt5818 = local13.anInt1890;
		Static114.method2241(local13);
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(B)V")
	public static void method4189() {
		Static67.aBoolean359 = true;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method4191(@OriginalArg(0) String arg0) {
		Static67.method3711(0, "", 0, arg0, "");
	}
}
