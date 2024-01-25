import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static361 {

	@OriginalMember(owner = "client!paa", name = "G", descriptor = "[I")
	public static int[] anIntArray522;

	@OriginalMember(owner = "client!paa", name = "J", descriptor = "I")
	public static int anInt6824;

	@OriginalMember(owner = "client!paa", name = "I", descriptor = "Z")
	public static boolean aBoolean517 = false;

	@OriginalMember(owner = "client!paa", name = "a", descriptor = "(III)V")
	public static void method5813(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(13) int local13 = Static188.aClass52_2.method1582(Static239.aClass202_253.method5139(Static172.anInt6352));
		@Pc(24) int local24;
		for (@Pc(18) Class2_Sub44 local18 = (Class2_Sub44) Static448.aClass249_63.method6527(); local18 != null; local18 = (Class2_Sub44) Static448.aClass249_63.method6525()) {
			local24 = Static329.method3403(local18);
			if (local13 < local24) {
				local13 = local24;
			}
		}
		local13 += 8;
		local24 = Static323.anInt6016 * 16 + 21;
		@Pc(52) int local52 = arg1 - local13 / 2;
		if (local13 + local52 > Static461.anInt8348) {
			local52 = Static461.anInt8348 - local13;
		}
		if (local52 < 0) {
			local52 = 0;
		}
		@Pc(75) int local75 = arg0;
		if (Static223.anInt3996 < local24 + arg0) {
			local75 = Static223.anInt3996 - local24;
		}
		Static536.anInt9313 = local52;
		if (local75 < 0) {
			local75 = 0;
		}
		Static178.anInt3307 = local75;
		Static193.anInt3519 = (Static254.aBoolean340 ? 26 : 22) + Static323.anInt6016 * 16;
		Static452.aBoolean600 = true;
		Static529.anInt9144 = local13;
	}
}
