import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static235 {

	@OriginalMember(owner = "client!ok", name = "j", descriptor = "Lclient!kr;")
	public static Class46 aClass46_16;

	@OriginalMember(owner = "client!ok", name = "l", descriptor = "[S")
	public static short[] aShortArray92;

	@OriginalMember(owner = "client!ok", name = "c", descriptor = "Lclient!wl;")
	public static final Class221 aClass221_166 = new Class221(6, -2);

	@OriginalMember(owner = "client!ok", name = "m", descriptor = "Z")
	public static boolean aBoolean440 = false;

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(ILclient!iq;Lclient!iq;ZB)V")
	public static void method4286(@OriginalArg(0) int arg0, @OriginalArg(1) Class104 arg1, @OriginalArg(2) Class104 arg2) {
		Static353.aClass104_152 = arg2;
		Static210.aClass104_117 = arg1;
		Static222.aBoolean607 = true;
		Static26.anInt3836 = arg0;
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(B)V")
	public static void method4288() {
		@Pc(6) Class107 local6 = Static196.aClass107_21;
		synchronized (Static196.aClass107_21) {
			Static196.aClass107_21.method3012();
		}
	}

	@OriginalMember(owner = "client!ok", name = "b", descriptor = "(B)V")
	public static void method4290() {
		Static204.aClass107_25.method3012();
		Static354.aClass107_57.method3012();
		Static364.aClass107_61.method3012();
		Static274.aClass107_42.method3012();
		Static355.aClass107_58.method3012();
	}
}
