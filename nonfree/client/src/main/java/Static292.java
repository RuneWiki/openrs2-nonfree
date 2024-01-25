import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static292 {

	@OriginalMember(owner = "client!r", name = "b", descriptor = "Lclient!cp;")
	public static final Class44 aClass44_31 = new Class44(16);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Lclient!hc;BLclient!np;)I")
	public static int method4838(@OriginalArg(0) Class100 arg0, @OriginalArg(2) Class155 arg1) {
		if (arg0.anInt2429 != -1) {
			return arg0.anInt2429;
		}
		if (arg0.anInt2437 != -1) {
			@Pc(30) Class121 local30 = arg1.anInterface10_7.method192(arg1.method4882() ? arg0.anInt2437 : arg0.anInt2439);
			if (!local30.aBoolean223) {
				return local30.aShort32;
			}
		}
		return arg0.anInt2431;
	}
}
