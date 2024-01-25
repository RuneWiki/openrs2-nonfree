import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static542 {

	@OriginalMember(owner = "client!tea", name = "l", descriptor = "I")
	public static int anInt9328;

	@OriginalMember(owner = "client!tea", name = "q", descriptor = "[Lclient!nn;")
	public static Class226[] aClass226Array4;

	@OriginalMember(owner = "client!tea", name = "a", descriptor = "(ILclient!vd;)V")
	public static void method7926(@OriginalArg(1) Class353 arg0) {
		Static249.aClass353_45 = arg0;
	}

	@OriginalMember(owner = "client!tea", name = "a", descriptor = "(IIII)Z")
	public static boolean method7927(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		Static171.aClass154_2.method6573(arg1, arg0, arg2, Static540.anIntArray571);
		@Pc(18) int local18 = Static540.anIntArray571[2];
		if (local18 < 50) {
			return false;
		} else {
			Static540.anIntArray571[0] = Static101.anInt1981 * Static540.anIntArray571[0] / local18 + Static552.anInt9420;
			Static540.anIntArray571[1] = Static191.anInt3856 + Static540.anIntArray571[1] * Static116.anInt2277 / local18;
			Static540.anIntArray571[2] = local18;
			return true;
		}
	}

	@OriginalMember(owner = "client!tea", name = "a", descriptor = "(Ljava/lang/String;IBZJIZIIIZJLjava/lang/String;)V")
	public static void method7932(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) long arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) boolean arg9, @OriginalArg(11) long arg10, @OriginalArg(12) String arg11) {
		if (!Static71.aBoolean94 && Static462.anInt8179 < 500) {
			@Pc(26) int local26 = arg4 == -1 ? Static351.anInt6586 : arg4;
			@Pc(42) Class6_Sub2_Sub4 local42 = new Class6_Sub2_Sub4(arg0, arg11, local26, arg7, arg6, arg3, arg1, arg8, arg9, arg2, arg10, arg5);
			Static620.method8988(local42);
		}
	}

	@OriginalMember(owner = "client!tea", name = "a", descriptor = "(Z)V")
	public static void method7933() {
		Static106.anInt2100 = -1;
		Static273.anInt5414 = 0;
		Static51.anInt935 = -1;
	}

	@OriginalMember(owner = "client!tea", name = "a", descriptor = "(ILclient!ka;IZLclient!ria;I)V")
	public static void method7943(@OriginalArg(0) int arg0, @OriginalArg(1) Class24 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class290 arg3, @OriginalArg(5) int arg4) {
		if (arg1 != null) {
			arg3.method7386(arg1.na(), arg1.EA(), arg4, arg1.RA(), arg1.G(), arg1.V(), arg1.fa(), arg1.HA(), arg2, arg0);
		}
	}
}
