import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static317 {

	@OriginalMember(owner = "client!um", name = "K", descriptor = "I")
	public static int anInt6310;

	@OriginalMember(owner = "client!um", name = "Q", descriptor = "Lclient!lm;")
	public static Class134 aClass134_140;

	@OriginalMember(owner = "client!um", name = "S", descriptor = "I")
	public static int anInt6315;

	@OriginalMember(owner = "client!um", name = "U", descriptor = "Z")
	public static boolean aBoolean521;

	@OriginalMember(owner = "client!um", name = "O", descriptor = "Ljava/lang/String;")
	public static String aString247 = "yellow:";

	@OriginalMember(owner = "client!um", name = "V", descriptor = "D")
	public static double aDouble9 = -1.0D;

	@OriginalMember(owner = "client!um", name = "c", descriptor = "(Z)Z")
	public static boolean method5430(@OriginalArg(0) boolean arg0) {
		for (@Pc(1) int local1 = Static275.anInt5621; local1 < Static132.anInt6773; local1++) {
			@Pc(6) Class83[][] local6 = Static347.aClass83ArrayArrayArray3[local1];
			for (@Pc(9) int local9 = -Static131.anInt2605; local9 <= 0; local9++) {
				@Pc(14) int local14 = Static97.anInt1886 + local9;
				@Pc(18) int local18 = Static97.anInt1886 - local9;
				if (local14 >= Static226.anInt5592 || local18 < Static254.anInt5237) {
					for (@Pc(27) int local27 = -Static131.anInt2605; local27 <= 0; local27++) {
						@Pc(32) int local32 = Static349.anInt6708 + local27;
						@Pc(36) int local36 = Static349.anInt6708 - local27;
						@Pc(48) Class83 local48;
						if (local14 >= Static226.anInt5592) {
							if (local32 >= Static285.anInt5730) {
								local48 = local6[local14][local32];
								if (local48 != null && local48.aBoolean157) {
									Static256.aBoolean434 = arg0;
									Static71.aClass135_1.method5045(local48);
									Static71.aClass135_1.method5043();
								}
							}
							if (local36 < Static296.anInt5981) {
								local48 = local6[local14][local36];
								if (local48 != null && local48.aBoolean157) {
									Static256.aBoolean434 = arg0;
									Static71.aClass135_1.method5045(local48);
									Static71.aClass135_1.method5043();
								}
							}
						}
						if (local18 < Static254.anInt5237) {
							if (local32 >= Static285.anInt5730) {
								local48 = local6[local18][local32];
								if (local48 != null && local48.aBoolean157) {
									Static256.aBoolean434 = arg0;
									Static71.aClass135_1.method5045(local48);
									Static71.aClass135_1.method5043();
								}
							}
							if (local36 < Static296.anInt5981) {
								local48 = local6[local18][local36];
								if (local48 != null && local48.aBoolean157) {
									Static256.aBoolean434 = arg0;
									Static71.aClass135_1.method5045(local48);
									Static71.aClass135_1.method5043();
								}
							}
						}
						if (Static49.anInt5286 == 0) {
							if (Static165.aBoolean263) {
								Static71.aClass135_1.method5047(24);
							}
							return true;
						}
					}
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!um", name = "d", descriptor = "(Z)I")
	public static int method5432() {
		return 6;
	}
}
