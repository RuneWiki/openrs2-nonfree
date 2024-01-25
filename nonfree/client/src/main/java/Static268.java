import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static268 {

	@OriginalMember(owner = "client!mv", name = "k", descriptor = "I")
	public static int anInt4676;

	@OriginalMember(owner = "client!mv", name = "e", descriptor = "Lclient!nh;")
	public static final Class170 aClass170_5 = new Class170("LIVE", 0);

	@OriginalMember(owner = "client!mv", name = "i", descriptor = "Lclient!kn;")
	public static final Class142 aClass142_67 = new Class142("Attack", "Angreifen", "Attaquer", "Atacar");

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "(Lclient!za;B)V")
	public static void method3692(@OriginalArg(0) Class117 arg0) {
		arg0.ba(0, 0, Static192.anInt3532, 350);
		arg0.P(0, 0, Static192.anInt3532, 350, Static173.anInt2851 << 24 | 0x332277, 1);
		@Pc(27) int local27 = 350 / Static364.anInt5935;
		@Pc(36) int local36;
		if (Static180.anInt3219 > 0) {
			local36 = 346 - Static364.anInt5935 - 4;
			@Pc(46) int local46 = local36 * local27 / (local27 + Static180.anInt3219 - 1);
			@Pc(48) int local48 = 4;
			if (Static180.anInt3219 > 1) {
				local48 = (local36 - local46) * (-Static156.anInt2547 + Static180.anInt3219 - 1) / (Static180.anInt3219 - 1) + 4;
			}
			arg0.P(Static192.anInt3532 - 16, local48, 12, local46, Static173.anInt2851 << 24 | 0x332277, 2);
			for (@Pc(87) int local87 = Static156.anInt2547; local87 < Static156.anInt2547 + local27 && Static180.anInt3219 > local87; local87++) {
				@Pc(96) String[] local96 = Static354.method4612('\b', Static253.aStringArray34[local87]);
				@Pc(103) int local103 = (Static192.anInt3532 - 24) / local96.length;
				for (@Pc(105) int local105 = 0; local105 < local96.length; local105++) {
					@Pc(113) int local113 = local105 * local103 + 8;
					arg0.ba(local113, 0, local103 + local113 - 8, 350);
					Static464.aClass137_8.method4587(350 - (local87 - Static156.anInt2547) * Static364.anInt5935 - Static377.anInt6066 - Static392.aClass252_121.anInt6663 - 2, local113, local96[local105], -1, -16777216);
				}
			}
		}
		arg0.ba(0, 0, Static192.anInt3532, 350);
		arg0.method5658(0, -1, Static192.anInt3532, 350 - Static377.anInt6066);
		Static17.aClass137_5.method4587(350 - Static15.aClass252_5.anInt6663 - 1, 10, "--> " + Static2.aString1, -1, -16777216);
		local36 = -1;
		if (Static98.anInt1304 % 30 > 15) {
			local36 = 16777215;
		}
		arg0.method5656(Static15.aClass252_5.method5291("--> " + Static2.aString1.substring(0, Static247.anInt4420)) + 10, 12, local36, 350 - Static15.aClass252_5.anInt6663 - 11);
	}
}
