import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static299 {

	@OriginalMember(owner = "client!wn", name = "A", descriptor = "I")
	public static int anInt5560;

	@OriginalMember(owner = "client!wn", name = "r", descriptor = "[S")
	public static short[] aShortArray93 = new short[500];

	@OriginalMember(owner = "client!wn", name = "C", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray38 = new String[1000];

	@OriginalMember(owner = "client!wn", name = "D", descriptor = "I")
	public static int anInt5561 = -1;

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(Lclient!ge;IZBIZLclient!ge;)I")
	public static int method4397(@OriginalArg(0) Class53_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) Class53_Sub1 arg5) {
		@Pc(10) int local10 = Static3.method43(arg1, arg5, arg0, arg4);
		if (local10 != 0) {
			return arg4 ? -local10 : local10;
		} else if (arg3 == -1) {
			return 0;
		} else {
			@Pc(37) int local37 = Static3.method43(arg3, arg5, arg0, arg2);
			return arg2 ? -local37 : local37;
		}
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(II)Z")
	public static boolean method4399(@OriginalArg(1) int arg0) {
		return arg0 == (-arg0 & arg0);
	}

	@OriginalMember(owner = "client!wn", name = "e", descriptor = "(I)V")
	public static void method4400() {
		Static76.aClass22Array2 = null;
		Static298.method4386(Static216.anInt4287, 0, -1, 0, Static111.anInt2450, Static25.anInt448, 0, 0);
		if (Static76.aClass22Array2 != null) {
			Static152.method2436(Static6.anInt156, 0, Static216.anInt4287, -1412584499, Static111.anInt2450, 0, Static207.aClass22_17.anInt586, Static76.aClass22Array2, Static156.anInt3143);
			Static76.aClass22Array2 = null;
		}
	}

	@OriginalMember(owner = "client!wn", name = "b", descriptor = "(B)V")
	public static void method4402() {
		aShortArray93 = null;
		aStringArray38 = null;
	}
}
