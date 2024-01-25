import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static547 {

	@OriginalMember(owner = "client!vk", name = "G", descriptor = "Lclient!lt;")
	public static final Class6_Sub26_Sub2 aClass6_Sub26_Sub2_2 = new Class6_Sub26_Sub2(5000);

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(IC)Z")
	public static boolean method7828(@OriginalArg(1) char arg0) {
		return arg0 >= '0' && arg0 <= '9';
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(ILclient!pi;)V")
	public static void method7829(@OriginalArg(1) Class11_Sub1_Sub1_Sub2 arg0) {
		@Pc(17) Class6_Sub2 local17 = (Class6_Sub2) Static580.aClass305_42.method7447((long) arg0.anInt7392);
		if (local17 == null) {
			Static503.method7509(0, arg0.anIntArray527[0], null, arg0.anIntArray526[0], arg0.aByte77, arg0, null);
		} else {
			local17.method636();
		}
	}

	@OriginalMember(owner = "client!vk", name = "i", descriptor = "(I)V")
	public static void method7830() {
		if (!Static316.aBoolean443) {
			return;
		}
		while (true) {
			while (Static24.anInt8439 < Static199.aClass116_Sub1Array1.length) {
				@Pc(25) Class116_Sub1 local25 = Static199.aClass116_Sub1Array1[Static24.anInt8439];
				if (local25 != null && local25.anInt3900 == -1) {
					if (Static109.aClass6_Sub47_1 == null) {
						Static109.aClass6_Sub47_1 = Static98.aClass236_1.method5844(local25.aString39);
					}
					@Pc(49) int local49 = Static109.aClass6_Sub47_1.anInt8980;
					if (local49 == -1) {
						return;
					}
					Static24.anInt8439++;
					local25.anInt3900 = local49;
					Static109.aClass6_Sub47_1 = null;
				} else {
					Static24.anInt8439++;
				}
			}
			return;
		}
	}
}
