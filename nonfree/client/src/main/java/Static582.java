import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static582 {

	@OriginalMember(owner = "client!wfa", name = "e", descriptor = "I")
	public static int anInt9300;

	@OriginalMember(owner = "client!wfa", name = "d", descriptor = "Z")
	public static volatile boolean aBoolean724 = false;

	@OriginalMember(owner = "client!wfa", name = "f", descriptor = "I")
	public static int anInt9301 = 0;

	@OriginalMember(owner = "client!wfa", name = "g", descriptor = "Lclient!aj;")
	public static final Class10 aClass10_67 = new Class10(4);

	@OriginalMember(owner = "client!wfa", name = "a", descriptor = "(IBI)Lclient!lk;")
	public static Class203 method7699(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) Class203 local7 = Static414.method5954(arg0);
		if (arg1 == -1) {
			return local7;
		} else if (local7 == null || local7.aClass203Array2 == null || local7.aClass203Array2.length <= arg1) {
			return null;
		} else {
			return local7.aClass203Array2[arg1];
		}
	}

	@OriginalMember(owner = "client!wfa", name = "a", descriptor = "(III)Z")
	public static boolean method7700(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x84080) != 0;
	}

	@OriginalMember(owner = "client!wfa", name = "a", descriptor = "(B)V")
	public static void method7701() {
		Static307.aClass46_12 = null;
		Static147.aClass46_7 = null;
		Static351.aClass46_14 = null;
		Static475.aClass46_30 = null;
		Static468.aClass46_29 = null;
		Static221.aClass46_13 = null;
		Static570.aClass46_34 = null;
		Static212.aClass46_9 = null;
		Static187.aClass46Array6 = null;
	}
}
