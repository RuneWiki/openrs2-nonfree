import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static192 {

	@OriginalMember(owner = "client!ue", name = "H", descriptor = "I")
	public static int anInt3907;

	@OriginalMember(owner = "client!ue", name = "F", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_1906 = Static193.method3027("Bitte starten Sie eine Mitgliedschaft");

	@OriginalMember(owner = "client!ue", name = "I", descriptor = "I")
	public static int anInt3908 = 0;

	@OriginalMember(owner = "client!ue", name = "Q", descriptor = "Lclient!oc;")
	private static final Class70 aClass70_1908 = Static193.method3027("Loaded textures");

	@OriginalMember(owner = "client!ue", name = "J", descriptor = "Lclient!oc;")
	public static Class70 aClass70_1907 = aClass70_1908;

	@OriginalMember(owner = "client!ue", name = "K", descriptor = "Lclient!cf;")
	public static final Class17 aClass17_1 = new Class17();

	@OriginalMember(owner = "client!ue", name = "M", descriptor = "Z")
	public static boolean aBoolean174 = false;

	@OriginalMember(owner = "client!ue", name = "R", descriptor = "[Lclient!hh;")
	public static final Class42[] aClass42Array1 = new Class42[4];

	@OriginalMember(owner = "client!ue", name = "T", descriptor = "I")
	public static int anInt3914 = 0;

	@OriginalMember(owner = "client!ue", name = "Y", descriptor = "Lclient!vc;")
	public static final Class94 aClass94_12 = new Class94(260);

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(IILclient!ke;B)[Lclient!ah;")
	public static Class3_Sub3_Sub2_Sub1[] method3012(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class52 arg2) {
		return Static141.method2009(arg2, arg1, arg0) ? Static69.method1015() : null;
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(IIIIIILclient!m;IJ)Z")
	public static boolean method3014(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class26 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8) {
		if (arg6 == null) {
			return true;
		} else {
			@Pc(11) int local11 = arg1 * 128 + arg4 * 64;
			@Pc(19) int local19 = arg2 * 128 + arg5 * 64;
			return Static200.method3178(arg0, arg1, arg2, arg4, arg5, local11, local19, arg3, arg6, arg7, false, arg8);
		}
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(ILclient!ke;Z)Lclient!qc;")
	public static Class3_Sub3_Sub2_Sub2 method3018(@OriginalArg(0) int arg0, @OriginalArg(1) Class52 arg1) {
		return Static212.method3340(arg1, arg0) ? Static185.method2902() : null;
	}
}
