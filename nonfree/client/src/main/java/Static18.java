import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static18 {

	@OriginalMember(owner = "client!aja", name = "f", descriptor = "I")
	public static int anInt438;

	@OriginalMember(owner = "client!aja", name = "r", descriptor = "I")
	public static int anInt450 = 0;

	@OriginalMember(owner = "client!aja", name = "E", descriptor = "Z")
	public static boolean aBoolean36 = false;

	@OriginalMember(owner = "client!aja", name = "a", descriptor = "(IIZBI)Lclient!qb;")
	public static Class3_Sub46 method568(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) int arg3) {
		@Pc(7) Class3_Sub46 local7 = new Class3_Sub46();
		local7.anInt7855 = arg0;
		local7.anInt7850 = arg3;
		Static455.aClass83_31.method2377((long) arg1, local7);
		Static411.method5865(arg0);
		@Pc(35) Class260 local35 = Static383.method5492(arg1);
		if (local35 != null) {
			Static456.method8151(local35);
		}
		if (Static95.aClass260_7 != null) {
			Static456.method8151(Static95.aClass260_7);
			Static95.aClass260_7 = null;
		}
		Static611.method8671();
		if (local35 != null) {
			Static249.method4132(!arg2, local35);
		}
		if (!arg2) {
			Static565.method8006(arg0);
		}
		if (!arg2 && Static110.anInt2265 != -1) {
			Static610.method8667(1, Static110.anInt2265);
		}
		return local7;
	}

	@OriginalMember(owner = "client!aja", name = "a", descriptor = "(IB)Z")
	public static boolean method569(@OriginalArg(0) int arg0) {
		return arg0 == 30 || arg0 == 8 || arg0 == 1001 || arg0 == 18 || arg0 == 19;
	}
}
