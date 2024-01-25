import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static352 {

	@OriginalMember(owner = "client!wo", name = "d", descriptor = "I")
	public static int anInt6825;

	@OriginalMember(owner = "client!wo", name = "h", descriptor = "I")
	public static int anInt6828;

	@OriginalMember(owner = "client!wo", name = "b", descriptor = "F")
	public static float aFloat78 = 0.0F;

	@OriginalMember(owner = "client!wo", name = "e", descriptor = "Z")
	public static boolean aBoolean452 = false;

	@OriginalMember(owner = "client!wo", name = "g", descriptor = "I")
	public static int anInt6827 = 0;

	@OriginalMember(owner = "client!wo", name = "i", descriptor = "Ljava/lang/String;")
	public static String aString259 = "Checking for updates - ";

	@OriginalMember(owner = "client!wo", name = "j", descriptor = "Z")
	public static boolean aBoolean453 = true;

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(Lclient!sj;B)V")
	public static void method5708(@OriginalArg(0) Class181 arg0) {
		@Pc(7) Class181 local7 = Static268.method4552(arg0);
		@Pc(18) int local18;
		@Pc(16) int local16;
		if (local7 == null) {
			local16 = Static171.anInt3583;
			local18 = Static298.anInt5944;
		} else {
			local18 = local7.anInt5704;
			local16 = local7.anInt5721;
		}
		Static222.method3879(false, local16, arg0, local18);
		Static254.method4264(arg0, local18, local16);
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(I)V")
	public static void method5709() {
		if (Static323.aBoolean424) {
			return;
		}
		if (Static165.aBoolean173) {
			Static57.aFloat3 = (int) Static57.aFloat3 - 65 & 0xFFFFFF80;
		} else {
			Static128.aFloat21 += (-Static128.aFloat21 - 24.0F) / 2.0F;
		}
		Static323.aBoolean424 = true;
		Static105.aBoolean110 = true;
	}
}
