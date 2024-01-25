import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static293 {

	@OriginalMember(owner = "client!oq", name = "c", descriptor = "I")
	public static int anInt5390;

	@OriginalMember(owner = "client!oq", name = "b", descriptor = "Z")
	public static boolean aBoolean387 = true;

	@OriginalMember(owner = "client!oq", name = "d", descriptor = "Lclient!bd;")
	public static final Class21 aClass21_85 = new Class21("Please wait - attempting to reestablish.", "Bitte warte - es wird versucht, die Verbindung wiederherzustellen.", "Veuillez patienter - tentative de rétablissement.", "Tentando reestabelecer conexão. Aguarde.");

	@OriginalMember(owner = "client!oq", name = "e", descriptor = "I")
	public static int anInt5391 = 0;

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(II)V")
	public static void method4486(@OriginalArg(1) int arg0) {
		@Pc(1) Class4_Sub1_Sub6 local1 = null;
		for (@Pc(3) int local3 = 1; local3 < arg0; local3++) {
			@Pc(8) Class14 local8 = Static267.aClass14Array2[local3];
			if (local8 != null) {
				for (@Pc(12) int local12 = 0; local12 < Static268.anInt5106; local12++) {
					for (@Pc(15) int local15 = 0; local15 < Static230.anInt4581; local15++) {
						local1 = local8.q(local15, local12, local1);
						if (local1 != null) {
							@Pc(28) int local28 = local15 << Static391.anInt6797;
							@Pc(32) int local32 = local12 << Static391.anInt6797;
							for (@Pc(36) int local36 = local3 - 1; local36 >= 0; local36--) {
								@Pc(41) Class14 local41 = Static267.aClass14Array2[local36];
								if (local41 != null) {
									@Pc(53) int local53 = local8.oa(local15, local12) - local41.oa(local15, local12);
									@Pc(67) int local67 = local8.oa(local15 + 1, local12) - local41.oa(local15 + 1, local12);
									@Pc(85) int local85 = local8.oa(local15 + 1, local12 + 1) - local41.oa(local15 + 1, local12 + 1);
									@Pc(99) int local99 = local8.oa(local15, local12 + 1) - local41.oa(local15, local12 + 1);
									local41.H(local1, local28, (local53 + local67 + local85 + local99) / 4, local32, 0, false);
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(IZII)I")
	public static int method4488(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg0 == arg1) {
			return arg0;
		}
		@Pc(22) int local22 = 128 - arg2;
		@Pc(36) int local36 = (arg1 & 0x7F) * arg2 + local22 * (arg0 & 0x7F) >> 7;
		@Pc(50) int local50 = (arg0 & 0x380) * local22 + arg2 * (arg1 & 0x380) >> 7;
		@Pc(64) int local64 = (arg1 & 0xFC00) * arg2 + local22 * (arg0 & 0xFC00) >> 7;
		return local36 & 0x7F | local64 & 0xFC00 | local50 & 0x380;
	}

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(ILjava/lang/String;)I")
	public static int method4489(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return -1;
		}
		for (@Pc(11) int local11 = 0; local11 < Static65.anInt1626; local11++) {
			if (arg0.equalsIgnoreCase(Static75.aStringArray9[local11])) {
				return local11;
			}
		}
		return -1;
	}
}
