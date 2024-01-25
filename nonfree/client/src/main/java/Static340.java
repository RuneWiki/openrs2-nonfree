import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static340 {

	@OriginalMember(owner = "client!mba", name = "D", descriptor = "Lclient!ea;")
	public static Class73 aClass73_118;

	@OriginalMember(owner = "client!mba", name = "G", descriptor = "I")
	public static int anInt6769;

	@OriginalMember(owner = "client!mba", name = "F", descriptor = "[B")
	public static final byte[] aByteArray57 = new byte[2048];

	@OriginalMember(owner = "client!mba", name = "L", descriptor = "Z")
	public static boolean aBoolean543 = false;

	@OriginalMember(owner = "client!mba", name = "e", descriptor = "(B)V")
	public static void method5666() {
		@Pc(5) Class94 local5 = Static521.aClass94_62;
		synchronized (Static521.aClass94_62) {
			Static521.aClass94_62.method2952();
		}
	}

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "(IZ)Z")
	public static boolean method5667(@OriginalArg(0) int arg0) {
		if (arg0 == 15 || arg0 == 4 || arg0 == 8 || arg0 == 16 || arg0 == 1007) {
			return true;
		} else {
			return arg0 == 50 || arg0 == 1009;
		}
	}

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "(ILclient!sba;)V")
	public static void method5669(@OriginalArg(1) Class302 arg0) {
		if (arg0.anInt8936 == 5 && arg0.anInt8899 != -1) {
			Static634.method8698(Static467.aClass5_13, arg0);
		}
	}
}
