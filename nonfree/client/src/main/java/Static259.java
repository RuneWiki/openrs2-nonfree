import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static259 {

	@OriginalMember(owner = "client!mk", name = "z", descriptor = "Ljava/lang/String;")
	public static String aString48;

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(Lclient!za;ILclient!jt;)I")
	public static int method3337(@OriginalArg(0) Class200 arg0, @OriginalArg(2) Class130 arg1) {
		if (arg1.anInt3452 != -1) {
			return arg1.anInt3452;
		}
		if (arg1.anInt3445 != -1) {
			@Pc(28) Class178 local28 = arg0.anInterface8_134.method4125(arg0.method5832() ? arg1.anInt3445 : arg1.anInt3440);
			if (!local28.aBoolean321) {
				return local28.aShort54;
			}
		}
		return arg1.anInt3450;
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(IB)I")
	public static int method3338(@OriginalArg(0) int arg0) {
		return arg0 & 0xFF;
	}
}
