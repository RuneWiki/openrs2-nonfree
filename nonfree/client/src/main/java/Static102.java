import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static102 {

	@OriginalMember(owner = "client!na", name = "e", descriptor = "Lclient!eh;")
	private static Class28 aClass28_848 = Static170.method3101("Loading sprites )2 ");

	@OriginalMember(owner = "client!na", name = "a", descriptor = "Lclient!eh;")
	public static Class28 aClass28_847 = aClass28_848;

	@OriginalMember(owner = "client!na", name = "d", descriptor = "I")
	public static int anInt2668 = -1;

	@OriginalMember(owner = "client!na", name = "g", descriptor = "Lclient!eh;")
	private static Class28 aClass28_849 = Static170.method3101("Could not complete login)3");

	@OriginalMember(owner = "client!na", name = "i", descriptor = "Lclient!eh;")
	public static Class28 aClass28_850 = aClass28_849;

	@OriginalMember(owner = "client!na", name = "k", descriptor = "[I")
	public static int[] anIntArray467 = new int[] { 1, 0, -1, 0 };

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(Z)V")
	public static void method2116() {
		aClass28_850 = null;
		anIntArray467 = null;
		Canvas_Sub1.anIntArray466 = null;
		aClass28_849 = null;
		aClass28_847 = null;
		aClass28_848 = null;
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(I[II[I[Lclient!qe;Z)V")
	public static void method2117(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) Class67[] arg4) {
		if (arg0 <= arg2) {
			return;
		}
		@Pc(21) int local21 = arg0 + 1;
		@Pc(27) int local27 = (arg0 + arg2) / 2;
		@Pc(31) int local31 = arg2 - 1;
		@Pc(35) Class67 local35 = arg4[local27];
		arg4[local27] = arg4[arg2];
		arg4[arg2] = local35;
		while (local31 < local21) {
			@Pc(49) boolean local49 = true;
			@Pc(52) int local52;
			@Pc(67) int local67;
			@Pc(62) int local62;
			do {
				local21--;
				for (local52 = 0; local52 < 4; local52++) {
					if (arg1[local52] == 2) {
						local62 = local35.anInt3281;
						local67 = arg4[local21].anInt3281;
					} else if (arg1[local52] == 1) {
						local67 = arg4[local21].anInt3286;
						local62 = local35.anInt3286;
						if (local67 == -1 && arg3[local52] == 1) {
							local67 = 2001;
						}
						if (local62 == -1 && arg3[local52] == 1) {
							local62 = 2001;
						}
					} else if (arg1[local52] == 3) {
						local62 = local35.aBoolean155 ? 1 : 0;
						local67 = arg4[local21].aBoolean155 ? 1 : 0;
					} else {
						local62 = local35.anInt3279;
						local67 = arg4[local21].anInt3279;
					}
					if (local62 != local67) {
						if ((arg3[local52] != 1 || local62 >= local67) && (arg3[local52] != 0 || local67 >= local62)) {
							local49 = false;
						}
						break;
					}
					if (local52 == 3) {
						local49 = false;
					}
				}
			} while (local49);
			local49 = true;
			do {
				local31++;
				for (local52 = 0; local52 < 4; local52++) {
					if (arg1[local52] == 2) {
						local67 = arg4[local31].anInt3281;
						local62 = local35.anInt3281;
					} else if (arg1[local52] == 1) {
						local62 = local35.anInt3286;
						if (local62 == -1 && arg3[local52] == 1) {
							local62 = 2001;
						}
						local67 = arg4[local31].anInt3286;
						if (local67 == -1 && arg3[local52] == 1) {
							local67 = 2001;
						}
					} else if (arg1[local52] == 3) {
						local67 = arg4[local31].aBoolean155 ? 1 : 0;
						local62 = local35.aBoolean155 ? 1 : 0;
					} else {
						local67 = arg4[local31].anInt3279;
						local62 = local35.anInt3279;
					}
					if (local62 != local67) {
						if ((arg3[local52] != 1 || local67 >= local62) && (arg3[local52] != 0 || local67 <= local62)) {
							local49 = false;
						}
						break;
					}
					if (local52 == 3) {
						local49 = false;
					}
				}
			} while (local49);
			if (local21 > local31) {
				@Pc(332) Class67 local332 = arg4[local31];
				arg4[local31] = arg4[local21];
				arg4[local21] = local332;
			}
		}
		method2117(local21, arg1, arg2, arg3, arg4);
		method2117(arg0, arg1, local21 + 1, arg3, arg4);
	}
}
