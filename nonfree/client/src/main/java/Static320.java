import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static320 {

	@OriginalMember(owner = "client!qb", name = "M", descriptor = "Lclient!lh;")
	public static final Class151 aClass151_136 = new Class151(8);

	@OriginalMember(owner = "client!qb", name = "jb", descriptor = "J")
	public static long aLong161 = 0L;

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIBII)V")
	public static void method4413(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(22) int local22;
		if (arg2 <= arg0) {
			for (local22 = arg2; local22 < arg0; local22++) {
				Static283.anIntArrayArray30[local22][arg1] = arg3;
			}
		} else {
			for (local22 = arg0; local22 < arg2; local22++) {
				Static283.anIntArrayArray30[local22][arg1] = arg3;
			}
		}
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(Z)Z")
	public static boolean method4414(@OriginalArg(0) boolean arg0) {
		for (@Pc(1) int local1 = Static360.anInt6590; local1 < Static29.anInt482; local1++) {
			@Pc(6) Class137[][] local6 = Static131.aClass137ArrayArrayArray2[local1];
			for (@Pc(9) int local9 = -Static370.anInt7659; local9 <= 0; local9++) {
				@Pc(14) int local14 = Static59.anInt1066 + local9;
				@Pc(18) int local18 = Static59.anInt1066 - local9;
				if (local14 >= Static210.anInt3764 || local18 < Static72.anInt1361) {
					for (@Pc(27) int local27 = -Static370.anInt7659; local27 <= 0; local27++) {
						@Pc(32) int local32 = Static161.anInt2868 + local27;
						@Pc(36) int local36 = Static161.anInt2868 - local27;
						@Pc(48) Class137 local48;
						if (local14 >= Static210.anInt3764) {
							if (local32 >= Static194.anInt7614) {
								local48 = local6[local14][local32];
								if (local48 != null && local48.aBoolean294) {
									Static44.aBoolean63 = arg0;
									Static68.aClass143_1.method5050(local48);
									Static68.aClass143_1.method5054();
								}
							}
							if (local36 < Static345.anInt6297) {
								local48 = local6[local14][local36];
								if (local48 != null && local48.aBoolean294) {
									Static44.aBoolean63 = arg0;
									Static68.aClass143_1.method5050(local48);
									Static68.aClass143_1.method5054();
								}
							}
						}
						if (local18 < Static72.anInt1361) {
							if (local32 >= Static194.anInt7614) {
								local48 = local6[local18][local32];
								if (local48 != null && local48.aBoolean294) {
									Static44.aBoolean63 = arg0;
									Static68.aClass143_1.method5050(local48);
									Static68.aClass143_1.method5054();
								}
							}
							if (local36 < Static345.anInt6297) {
								local48 = local6[local18][local36];
								if (local48 != null && local48.aBoolean294) {
									Static44.aBoolean63 = arg0;
									Static68.aClass143_1.method5050(local48);
									Static68.aClass143_1.method5054();
								}
							}
						}
						if (Static311.anInt6533 == 0) {
							if (Static144.aBoolean211) {
								Static68.aClass143_1.method5053(24);
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
