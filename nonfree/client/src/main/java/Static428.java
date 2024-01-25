import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static428 {

	@OriginalMember(owner = "client!nba", name = "j", descriptor = "Lclient!sr;")
	public static final Class347 aClass347_1 = new Class347();

	@OriginalMember(owner = "client!nba", name = "e", descriptor = "I")
	public static int anInt6544 = 0;

	@OriginalMember(owner = "client!nba", name = "a", descriptor = "I")
	public static int anInt6549 = 0;

	@OriginalMember(owner = "client!nba", name = "a", descriptor = "(ILclient!aba;)V")
	public static void method5692(@OriginalArg(1) Class3_Sub2_Sub1 arg0) {
		@Pc(7) int local7 = 0;
		arg0.method225();
		@Pc(20) int local20;
		@Pc(52) int local52;
		for (@Pc(12) int local12 = 0; local12 < Static607.anInt9201; local12++) {
			local20 = Static384.anIntArray436[local12];
			if ((Static257.aByteArray39[local20] & 0x1) == 0) {
				if (local7 > 0) {
					local7--;
					Static257.aByteArray39[local20] = (byte) (Static257.aByteArray39[local20] | 0x2);
				} else {
					local52 = arg0.method216(1);
					if (local52 == 0) {
						local7 = Static524.method7013(arg0);
						Static257.aByteArray39[local20] = (byte) (Static257.aByteArray39[local20] | 0x2);
					} else {
						Static56.method1315(local20, arg0);
					}
				}
			}
		}
		arg0.method219();
		if (local7 != 0) {
			throw new RuntimeException("nsn0");
		}
		arg0.method225();
		@Pc(148) int local148;
		for (local20 = 0; local20 < Static607.anInt9201; local20++) {
			local52 = Static384.anIntArray436[local20];
			if ((Static257.aByteArray39[local52] & 0x1) != 0) {
				if (local7 > 0) {
					Static257.aByteArray39[local52] = (byte) (Static257.aByteArray39[local52] | 0x2);
					local7--;
				} else {
					local148 = arg0.method216(1);
					if (local148 == 0) {
						local7 = Static524.method7013(arg0);
						Static257.aByteArray39[local52] = (byte) (Static257.aByteArray39[local52] | 0x2);
					} else {
						Static56.method1315(local52, arg0);
					}
				}
			}
		}
		arg0.method219();
		if (local7 != 0) {
			throw new RuntimeException("nsn1");
		}
		arg0.method225();
		@Pc(248) int local248;
		for (local52 = 0; local52 < Static431.anInt6571; local52++) {
			local148 = Static374.anIntArray423[local52];
			if ((Static257.aByteArray39[local148] & 0x1) != 0) {
				if (local7 > 0) {
					local7--;
					Static257.aByteArray39[local148] = (byte) (Static257.aByteArray39[local148] | 0x2);
				} else {
					local248 = arg0.method216(1);
					if (local248 == 0) {
						local7 = Static524.method7013(arg0);
						Static257.aByteArray39[local148] = (byte) (Static257.aByteArray39[local148] | 0x2);
					} else if (Static664.method8656(local148, arg0)) {
						Static257.aByteArray39[local148] = (byte) (Static257.aByteArray39[local148] | 0x2);
					}
				}
			}
		}
		arg0.method219();
		if (local7 != 0) {
			throw new RuntimeException("nsn2");
		}
		arg0.method225();
		for (local148 = 0; local148 < Static431.anInt6571; local148++) {
			local248 = Static374.anIntArray423[local148];
			if ((Static257.aByteArray39[local248] & 0x1) == 0) {
				if (local7 > 0) {
					local7--;
					Static257.aByteArray39[local248] = (byte) (Static257.aByteArray39[local248] | 0x2);
				} else {
					@Pc(352) int local352 = arg0.method216(1);
					if (local352 == 0) {
						local7 = Static524.method7013(arg0);
						Static257.aByteArray39[local248] = (byte) (Static257.aByteArray39[local248] | 0x2);
					} else if (Static664.method8656(local248, arg0)) {
						Static257.aByteArray39[local248] = (byte) (Static257.aByteArray39[local248] | 0x2);
					}
				}
			}
		}
		arg0.method219();
		if (local7 != 0) {
			throw new RuntimeException("nsn3");
		}
		Static607.anInt9201 = 0;
		Static431.anInt6571 = 0;
		for (local248 = 1; local248 < 2048; local248++) {
			Static257.aByteArray39[local248] = (byte) (Static257.aByteArray39[local248] >> 1);
			@Pc(433) Class9_Sub1_Sub1_Sub2_Sub1 local433 = Static19.aClass9_Sub1_Sub1_Sub2_Sub1Array1[local248];
			if (local433 == null) {
				Static374.anIntArray423[Static431.anInt6571++] = local248;
			} else {
				Static384.anIntArray436[Static607.anInt9201++] = local248;
			}
		}
	}
}
