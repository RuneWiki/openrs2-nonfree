import java.awt.Point;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static129 {

	@OriginalMember(owner = "client!hp", name = "c", descriptor = "Lclient!qj;")
	public static Class165 aClass165_48;

	@OriginalMember(owner = "client!hp", name = "g", descriptor = "I")
	public static int anInt2513;

	@OriginalMember(owner = "client!hp", name = "i", descriptor = "I")
	public static int anInt2515 = -1;

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(I)Lclient!gp;")
	public static Class74_Sub1 method2435() {
		return Static352.anInt6535 < Static296.aClass74_Sub1Array2.length ? Static296.aClass74_Sub1Array2[Static352.anInt6535++] : null;
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(II)V")
	public static void method2436(@OriginalArg(0) int arg0) {
		if (!Static268.aBoolean429) {
			arg0 = -1;
		}
		if (arg0 == Static218.anInt4269) {
			return;
		}
		if (arg0 != -1) {
			@Pc(23) Class201 local23 = Static31.method866(arg0);
			@Pc(27) Class138 local27 = local23.method5163();
			if (local27 == null) {
				arg0 = -1;
			} else {
				Static180.aClass110_6.method3378(local27.method3777(), local27.method3772(), new Point(local23.anInt5881, local23.anInt5872), Static261.aCanvas4, local27.method3779());
				Static218.anInt4269 = arg0;
			}
		}
		if (arg0 == -1 && Static218.anInt4269 != -1) {
			Static180.aClass110_6.method3378(-1, -1, new Point(), Static261.aCanvas4, null);
			Static218.anInt4269 = -1;
		}
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(IZ)V")
	public static void method2438() {
		@Pc(7) Class140 local7 = Static135.aClass140_73;
		synchronized (Static135.aClass140_73) {
			Static135.aClass140_73.method3824(5);
		}
	}
}
