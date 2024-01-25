import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static419 {

	@OriginalMember(owner = "client!qba", name = "e", descriptor = "Lclient!me;")
	public static final Class211 aClass211_51 = new Class211(32);

	@OriginalMember(owner = "client!qba", name = "a", descriptor = "(Z)Z")
	public static boolean method6738(@OriginalArg(0) boolean arg0) {
		for (@Pc(1) int local1 = Static216.anInt4414; local1 < Static264.anInt8587; local1++) {
			@Pc(6) Class125[][] local6 = Static580.aClass125ArrayArrayArray3[local1];
			for (@Pc(9) int local9 = -Static403.anInt7929; local9 <= 0; local9++) {
				@Pc(14) int local14 = Static342.anInt6991 + local9;
				@Pc(18) int local18 = Static342.anInt6991 - local9;
				if (local14 >= Static10.anInt363 || local18 < Static251.anInt5429) {
					for (@Pc(27) int local27 = -Static403.anInt7929; local27 <= 0; local27++) {
						@Pc(32) int local32 = Static484.anInt9030 + local27;
						@Pc(36) int local36 = Static484.anInt9030 - local27;
						@Pc(48) Class125 local48;
						if (local14 >= Static10.anInt363) {
							if (local32 >= Static123.anInt2876) {
								local48 = local6[local14][local32];
								if (local48 != null && local48.aBoolean273) {
									Static141.aBoolean254 = arg0;
									Static415.aClass89_1.method3870(local48);
									Static415.aClass89_1.method3864();
								}
							}
							if (local36 < Static341.anInt6986) {
								local48 = local6[local14][local36];
								if (local48 != null && local48.aBoolean273) {
									Static141.aBoolean254 = arg0;
									Static415.aClass89_1.method3870(local48);
									Static415.aClass89_1.method3864();
								}
							}
						}
						if (local18 < Static251.anInt5429) {
							if (local32 >= Static123.anInt2876) {
								local48 = local6[local18][local32];
								if (local48 != null && local48.aBoolean273) {
									Static141.aBoolean254 = arg0;
									Static415.aClass89_1.method3870(local48);
									Static415.aClass89_1.method3864();
								}
							}
							if (local36 < Static341.anInt6986) {
								local48 = local6[local18][local36];
								if (local48 != null && local48.aBoolean273) {
									Static141.aBoolean254 = arg0;
									Static415.aClass89_1.method3870(local48);
									Static415.aClass89_1.method3864();
								}
							}
						}
						if (Static257.anInt5517 == 0) {
							if (Static392.aBoolean641) {
								Static415.aClass89_1.method3862(24);
							}
							return true;
						}
					}
				}
			}
		}
		return false;
	}
}
