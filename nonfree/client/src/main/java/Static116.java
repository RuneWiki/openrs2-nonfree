import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static116 {

	@OriginalMember(owner = "client!eca", name = "B", descriptor = "I")
	public static int anInt8663;

	@OriginalMember(owner = "client!eca", name = "K", descriptor = "F")
	public static float aFloat166;

	@OriginalMember(owner = "client!eca", name = "g", descriptor = "Lclient!mga;")
	public static Class237 aClass237_3;

	@OriginalMember(owner = "client!eca", name = "r", descriptor = "Lclient!gda;")
	public static Class126 aClass126_248;

	@OriginalMember(owner = "client!eca", name = "G", descriptor = "Lclient!vn;")
	public static final Class381 aClass381_228 = new Class381(43, 3);

	@OriginalMember(owner = "client!eca", name = "s", descriptor = "[S")
	private static final short[] aShortArray133 = new short[] { 6798, 8741, 25238, 4626, 4550 };

	@OriginalMember(owner = "client!eca", name = "I", descriptor = "[S")
	private static final short[] aShortArray132 = new short[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!eca", name = "o", descriptor = "[S")
	private static final short[] aShortArray131 = new short[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!eca", name = "f", descriptor = "[[S")
	public static final short[][] aShortArrayArray25 = new short[][] { aShortArray133, aShortArray132, aShortArray131 };

	@OriginalMember(owner = "client!eca", name = "v", descriptor = "Z")
	public static boolean aBoolean570 = false;

	@OriginalMember(owner = "client!eca", name = "b", descriptor = "(II)V")
	public static void method7453(@OriginalArg(1) int arg0) {
		Static120.anInt1966 = 2;
		Static365.aClass389_9 = Static4.aClass389_17;
		Static623.anInt9970 = arg0;
		@Pc(11) String local11 = null;
		if (Static417.aByteArray79 != null) {
			@Pc(18) Class5_Sub36 local18 = new Class5_Sub36(Static417.aByteArray79);
			local11 = Static508.method7013(local18.method7304());
			Static446.aLong213 = local18.method7304();
		}
		if (local11 == null) {
			Static126.method1895(35);
		} else {
			Static357.method5231(true, "", false, local11);
		}
	}
}
