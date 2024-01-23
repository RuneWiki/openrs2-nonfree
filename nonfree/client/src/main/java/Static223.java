import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static223 {

	@OriginalMember(owner = "client!qf", name = "k", descriptor = "[Z")
	public static boolean[] aBooleanArray22;

	@OriginalMember(owner = "client!qf", name = "l", descriptor = "I")
	public static int anInt4303;

	@OriginalMember(owner = "client!qf", name = "m", descriptor = "I")
	public static int anInt4304;

	@OriginalMember(owner = "client!qf", name = "f", descriptor = "Lclient!cc;")
	public static Class26 aClass26_45 = new Class26(64);

	@OriginalMember(owner = "client!qf", name = "n", descriptor = "I")
	public static int anInt4305 = 0;

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(I)V")
	public static void method3584() {
		@Pc(8) Class164 local8 = Static275.aClass164_1;
		synchronized (Static275.aClass164_1) {
			anInt4305 = Static278.anInt5312;
			Static221.anInt4280++;
			@Pc(25) int local25;
			if (Static241.anInt4596 >= 0) {
				while (Static241.anInt4596 != Static171.anInt3314) {
					local25 = Static278.anIntArray596[Static171.anInt3314];
					Static171.anInt3314 = Static171.anInt3314 + 1 & 0x7F;
					if (local25 >= 0) {
						Static54.aBooleanArray4[local25] = true;
					} else {
						Static54.aBooleanArray4[~local25] = false;
					}
				}
			} else {
				for (local25 = 0; local25 < 112; local25++) {
					Static54.aBooleanArray4[local25] = false;
				}
				Static241.anInt4596 = Static171.anInt3314;
			}
			Static278.anInt5312 = Static255.anInt4862;
		}
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(Lclient!fd;I)Lclient!jo;")
	public static Class4_Sub1 method3586(@OriginalArg(0) Class4_Sub10 arg0) {
		arg0.method4666();
		@Pc(13) int local13 = arg0.method4666();
		@Pc(17) Class4_Sub1 local17 = Static21.method897(local13);
		local17.anInt5836 = arg0.method4666();
		@Pc(26) int local26 = arg0.method4666();
		for (@Pc(28) int local28 = 0; local28 < local26; local28++) {
			@Pc(35) int local35 = arg0.method4666();
			local17.method4724(arg0, local35);
		}
		local17.method4737();
		return local17;
	}
}
