import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static372 {

	@OriginalMember(owner = "client!vm", name = "N", descriptor = "Lclient!se;")
	public static Class211 aClass211_1;

	@OriginalMember(owner = "client!vm", name = "K", descriptor = "Lclient!wf;")
	public static final Class244 aClass244_91 = new Class244(14, 3);

	@OriginalMember(owner = "client!vm", name = "L", descriptor = "Ljava/lang/String;")
	public static String aString64 = null;

	@OriginalMember(owner = "client!vm", name = "P", descriptor = "Lclient!us;")
	public static final Class234 aClass234_128 = new Class234(49, 3);

	@OriginalMember(owner = "client!vm", name = "c", descriptor = "(Z)Z")
	public static boolean method5556(@OriginalArg(0) boolean arg0) {
		for (@Pc(1) int local1 = Static294.anInt5083; local1 < Static164.anInt2901; local1++) {
			@Pc(6) Class48[][] local6 = Static69.aClass48ArrayArrayArray1[local1];
			for (@Pc(9) int local9 = -Static68.anInt1339; local9 <= 0; local9++) {
				@Pc(14) int local14 = Static12.anInt167 + local9;
				@Pc(18) int local18 = Static12.anInt167 - local9;
				if (local14 >= Static264.anInt4700 || local18 < Static70.anInt1378) {
					for (@Pc(27) int local27 = -Static68.anInt1339; local27 <= 0; local27++) {
						@Pc(32) int local32 = Static327.anInt5555 + local27;
						@Pc(36) int local36 = Static327.anInt5555 - local27;
						@Pc(48) Class48 local48;
						if (local14 >= Static264.anInt4700) {
							if (local32 >= Static270.anInt5903) {
								local48 = local6[local14][local32];
								if (local48 != null && local48.aBoolean61) {
									Static102.aBoolean152 = arg0;
									Static317.aClass137_4.method4823(local48);
									Static317.aClass137_4.method4820();
								}
							}
							if (local36 < Static72.anInt1458) {
								local48 = local6[local14][local36];
								if (local48 != null && local48.aBoolean61) {
									Static102.aBoolean152 = arg0;
									Static317.aClass137_4.method4823(local48);
									Static317.aClass137_4.method4820();
								}
							}
						}
						if (local18 < Static70.anInt1378) {
							if (local32 >= Static270.anInt5903) {
								local48 = local6[local18][local32];
								if (local48 != null && local48.aBoolean61) {
									Static102.aBoolean152 = arg0;
									Static317.aClass137_4.method4823(local48);
									Static317.aClass137_4.method4820();
								}
							}
							if (local36 < Static72.anInt1458) {
								local48 = local6[local18][local36];
								if (local48 != null && local48.aBoolean61) {
									Static102.aBoolean152 = arg0;
									Static317.aClass137_4.method4823(local48);
									Static317.aClass137_4.method4820();
								}
							}
						}
						if (Static373.anInt6224 == 0) {
							if (Static145.aBoolean206) {
								Static317.aClass137_4.method4825(24);
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
