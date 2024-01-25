import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static217 {

	@OriginalMember(owner = "client!gm", name = "s", descriptor = "I")
	public static int anInt3585;

	@OriginalMember(owner = "client!gm", name = "n", descriptor = "I")
	public static int anInt3586;

	@OriginalMember(owner = "client!gm", name = "o", descriptor = "Lclient!wc;")
	public static final Class397 aClass397_58 = new Class397(80, -2);

	@OriginalMember(owner = "client!gm", name = "l", descriptor = "Lclient!wc;")
	public static final Class397 aClass397_59 = new Class397(29, 4);

	@OriginalMember(owner = "client!gm", name = "q", descriptor = "Z")
	public static boolean aBoolean224 = false;

	@OriginalMember(owner = "client!gm", name = "c", descriptor = "(Z)V")
	public static void method3246() {
		Static592.method7648(-1, 255);
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(IIZII)Lclient!dq;")
	public static Class3_Sub20 method3247(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) int arg3) {
		@Pc(13) Class3_Sub20 local13 = new Class3_Sub20();
		local13.anInt2491 = arg0;
		local13.anInt2493 = arg3;
		Static432.aClass313_34.method7107((long) arg1, local13);
		Static273.method3855(arg3);
		@Pc(32) Class270 local32 = Static254.method3544(arg1);
		if (local32 != null) {
			Static539.method7146(local32);
		}
		if (Static710.aClass270_11 != null) {
			Static539.method7146(Static710.aClass270_11);
			Static710.aClass270_11 = null;
		}
		Static168.method2728();
		if (local32 != null) {
			Static145.method2463(local32, !arg2);
		}
		if (!arg2) {
			Static540.method7159(arg3);
		}
		if (!arg2 && Static589.anInt8959 != -1) {
			Static682.method9051(1, Static589.anInt8959);
		}
		return local13;
	}
}
