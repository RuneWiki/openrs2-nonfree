import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static58 {

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "I")
	public static int anInt1091 = -1;

	@OriginalMember(owner = "client!dk", name = "c", descriptor = "Lclient!kn;")
	public static final Class117 aClass117_21 = new Class117("Face here", "Hierhin drehen", "Regarder dans cette direction", "Virar para cá");

	@OriginalMember(owner = "client!dk", name = "e", descriptor = "[[I")
	public static final int[][] anIntArrayArray2 = new int[][] { { 2, 4 }, { 2, 4 }, { 5, 2, 4 }, { 4, 5, 2 }, { 2, 4, 5 }, { 5, 2, 4 }, { 1, 6, 2, 5 }, { 1, 6, 7, 1 }, { 6, 7, 1, 1 }, { 0, 8, 9, 8, 9, 4 }, { 8, 9, 4, 0, 8, 9 }, { 2, 10, 0, 10, 11, 11 }, { 2, 4 }, { 1, 6, 7, 1 }, { 1, 6, 7, 1 } };

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(Z)Z")
	public static boolean method871(@OriginalArg(0) boolean arg0) {
		for (@Pc(1) int local1 = Static104.anInt1933; local1 < Static279.anInt5583; local1++) {
			@Pc(6) Class106[][] local6 = Static212.aClass106ArrayArrayArray2[local1];
			for (@Pc(9) int local9 = -Static209.anInt4263; local9 <= 0; local9++) {
				@Pc(14) int local14 = Static6.anInt4021 + local9;
				@Pc(18) int local18 = Static6.anInt4021 - local9;
				if (local14 >= Static54.anInt1025 || local18 < Static199.anInt4037) {
					for (@Pc(27) int local27 = -Static209.anInt4263; local27 <= 0; local27++) {
						@Pc(32) int local32 = Static104.anInt1932 + local27;
						@Pc(36) int local36 = Static104.anInt1932 - local27;
						@Pc(48) Class106 local48;
						if (local14 >= Static54.anInt1025) {
							if (local32 >= Static305.anInt5983) {
								local48 = local6[local14][local32];
								if (local48 != null && local48.aBoolean175) {
									Static144.aBoolean178 = arg0;
									Static74.aClass38_1.method4163(local48);
									Static74.aClass38_1.method4170();
								}
							}
							if (local36 < Static108.anInt2044) {
								local48 = local6[local14][local36];
								if (local48 != null && local48.aBoolean175) {
									Static144.aBoolean178 = arg0;
									Static74.aClass38_1.method4163(local48);
									Static74.aClass38_1.method4170();
								}
							}
						}
						if (local18 < Static199.anInt4037) {
							if (local32 >= Static305.anInt5983) {
								local48 = local6[local18][local32];
								if (local48 != null && local48.aBoolean175) {
									Static144.aBoolean178 = arg0;
									Static74.aClass38_1.method4163(local48);
									Static74.aClass38_1.method4170();
								}
							}
							if (local36 < Static108.anInt2044) {
								local48 = local6[local18][local36];
								if (local48 != null && local48.aBoolean175) {
									Static144.aBoolean178 = arg0;
									Static74.aClass38_1.method4163(local48);
									Static74.aClass38_1.method4170();
								}
							}
						}
						if (Static202.anInt4130 == 0) {
							if (Static216.aBoolean369) {
								Static74.aClass38_1.method4167(24);
							}
							return true;
						}
					}
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(Lclient!uo;I)V")
	public static void method872(@OriginalArg(0) Class129 arg0) {
		if (Static206.aBoolean282) {
			Static13.method179(arg0);
		} else {
			Static118.method1786(arg0);
		}
	}
}
