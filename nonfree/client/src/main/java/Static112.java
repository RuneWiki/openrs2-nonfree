import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static112 {

	@OriginalMember(owner = "client!ma", name = "ob", descriptor = "I")
	public static int anInt2736;

	@OriginalMember(owner = "client!ma", name = "fb", descriptor = "Lclient!v;")
	public static final Class91 aClass91_10 = new Class91();

	@OriginalMember(owner = "client!ma", name = "ib", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_1583 = Static118.method2249("<col=c0ff00>");

	@OriginalMember(owner = "client!ma", name = "vb", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_1584 = Static118.method2249("scrollbar");

	@OriginalMember(owner = "client!ma", name = "Fb", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_1585 = Static118.method2249("cross");

	@OriginalMember(owner = "client!ma", name = "Gb", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_1586 = Static118.method2249(" Sekunde(Xn(Y -Ubertragen)3");

	@OriginalMember(owner = "client!ma", name = "Ib", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_1587 = Static118.method2249("; Max)2Age=");

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(ZIIII)V")
	public static void method2066(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(16) int local16 = arg3; local16 <= arg0 + arg3; local16++) {
			for (@Pc(20) int local20 = arg1; local20 <= arg1 + arg2; local20++) {
				if (local20 >= 0 && local20 < 104 && local16 >= 0 && local16 < 104) {
					Static70.aByteArrayArrayArray38[0][local20][local16] = 127;
					if (local20 == arg1 && local20 > 0) {
						Static89.anIntArrayArrayArray3[0][local20][local16] = Static89.anIntArrayArrayArray3[0][local20 - 1][local16];
					}
					if (local20 == arg2 + arg1 && local20 < 103) {
						Static89.anIntArrayArrayArray3[0][local20][local16] = Static89.anIntArrayArrayArray3[0][local20 + 1][local16];
					}
					if (arg3 == local16 && local16 > 0) {
						Static89.anIntArrayArrayArray3[0][local20][local16] = Static89.anIntArrayArrayArray3[0][local20][local16 - 1];
					}
					if (arg3 + arg0 == local16 && local16 < 103) {
						Static89.anIntArrayArrayArray3[0][local20][local16] = Static89.anIntArrayArrayArray3[0][local20][local16 + 1];
					}
				}
			}
		}
	}
}
