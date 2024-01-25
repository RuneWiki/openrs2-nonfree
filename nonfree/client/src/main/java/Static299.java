import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static299 {

	@OriginalMember(owner = "client!or", name = "k", descriptor = "I")
	public static int anInt4635;

	@OriginalMember(owner = "client!or", name = "m", descriptor = "Lclient!vp;")
	public static Class262 aClass262_7;

	@OriginalMember(owner = "client!or", name = "b", descriptor = "Lclient!bj;")
	public static final Class27 aClass27_73 = new Class27(44, 3);

	@OriginalMember(owner = "client!or", name = "h", descriptor = "Z")
	public static boolean aBoolean313 = true;

	@OriginalMember(owner = "client!or", name = "j", descriptor = "Lclient!os;")
	public static final Class182 aClass182_155 = new Class182("Unable to find ", "Spieler kann nicht gefunden werden: ", "Impossible de trouver ", "Não é possível encontrar ");

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(IIIZII)V")
	public static void method3747(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static361.aClass85_Sub1_1.anInt2481 != 0 && arg3 != 0 && Static443.anInt7418 < 50 && arg2 != -1) {
			Static383.aClass68Array1[Static443.anInt7418++] = new Class68((byte) 1, arg2, arg3, arg1, arg0, arg4);
		}
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(II)V")
	public static void method3748(@OriginalArg(1) int arg0) {
		@Pc(1) Class10_Sub1_Sub7 local1 = null;
		for (@Pc(3) int local3 = 1; local3 < arg0; local3++) {
			@Pc(8) Class154 local8 = Static256.aClass154Array2[local3];
			if (local8 != null) {
				for (@Pc(12) int local12 = 0; local12 < Static24.anInt401; local12++) {
					for (@Pc(15) int local15 = 0; local15 < Static54.anInt998; local15++) {
						local1 = local8.OA(local15, local12, local1);
						if (local1 != null) {
							@Pc(28) int local28 = local15 << Static286.anInt5018;
							@Pc(32) int local32 = local12 << Static286.anInt5018;
							for (@Pc(36) int local36 = local3 - 1; local36 >= 0; local36--) {
								@Pc(41) Class154 local41 = Static256.aClass154Array2[local36];
								if (local41 != null) {
									@Pc(53) int local53 = local8.ua(local15, local12) - local41.ua(local15, local12);
									@Pc(67) int local67 = local8.ua(local15 + 1, local12) - local41.ua(local15 + 1, local12);
									@Pc(85) int local85 = local8.ua(local15 + 1, local12 + 1) - local41.ua(local15 + 1, local12 + 1);
									@Pc(99) int local99 = local8.ua(local15, local12 + 1) - local41.ua(local15, local12 + 1);
									local41.H(local1, local28, (local53 + local67 + local85 + local99) / 4, local32, 0, false);
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(IIIIIIZ)V")
	public static void method3756(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3) {
		@Pc(12) Class65[] local12 = Static362.aClass65Array1;
		for (@Pc(14) int local14 = 0; local14 < local12.length; local14++) {
			@Pc(20) Class65 local20 = local12[local14];
			if (local20 != null && local20.anInt1850 == 2) {
				Static444.method5933(local20.anInt1851, local20.anInt1855, local20.anInt1859 * 2, arg2 >> 1, arg1 >> 1, local20.anInt1860);
				if (Static394.anIntArray650[0] > -1 && Static400.anInt6752 % 20 < 10) {
					Static320.aClass80Array18[local20.anInt1854].method5558(Static394.anIntArray650[0] + arg0 - 12, arg3 - -Static394.anIntArray650[1] + -28);
				}
			}
		}
	}
}
