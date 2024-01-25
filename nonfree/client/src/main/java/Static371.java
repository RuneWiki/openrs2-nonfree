import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static371 {

	@OriginalMember(owner = "client!pca", name = "r", descriptor = "Lclient!an;")
	public static Class16 aClass16_90;

	@OriginalMember(owner = "client!pca", name = "p", descriptor = "Lclient!vf;")
	public static final Class302 aClass302_2 = new Class302();

	@OriginalMember(owner = "client!pca", name = "s", descriptor = "[F")
	public static final float[] aFloatArray56 = new float[4];

	@OriginalMember(owner = "client!pca", name = "u", descriptor = "Lclient!ju;")
	public static final Class166 aClass166_1 = new Class166();

	@OriginalMember(owner = "client!pca", name = "x", descriptor = "S")
	public static short aShort88 = 205;

	@OriginalMember(owner = "client!pca", name = "B", descriptor = "[C")
	public static final char[] aCharArray5 = new char[] { ' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß' };

	@OriginalMember(owner = "client!pca", name = "e", descriptor = "(I)V")
	public static void method5749() {
		Static15.method363();
	}

	@OriginalMember(owner = "client!pca", name = "a", descriptor = "(II)V")
	public static void method5750(@OriginalArg(1) int arg0) {
		@Pc(1) Class12_Sub4_Sub10 local1 = null;
		for (@Pc(3) int local3 = 1; local3 < arg0; local3++) {
			@Pc(8) Class215 local8 = Static155.aClass215Array5[local3];
			if (local8 != null) {
				for (@Pc(12) int local12 = 0; local12 < Static509.anInt9164; local12++) {
					for (@Pc(15) int local15 = 0; local15 < Static537.anInt9566; local15++) {
						local1 = local8.X(local15, local12, local1);
						if (local1 != null) {
							@Pc(28) int local28 = local15 << Static193.anInt4311;
							@Pc(32) int local32 = local12 << Static193.anInt4311;
							for (@Pc(36) int local36 = local3 - 1; local36 >= 0; local36--) {
								@Pc(41) Class215 local41 = Static155.aClass215Array5[local36];
								if (local41 != null) {
									@Pc(53) int local53 = local8.ba(local15, local12) - local41.ba(local15, local12);
									@Pc(67) int local67 = local8.ba(local15 + 1, local12) - local41.ba(local15 + 1, local12);
									@Pc(85) int local85 = local8.ba(local15 + 1, local12 + 1) - local41.ba(local15 + 1, local12 + 1);
									@Pc(99) int local99 = local8.ba(local15, local12 + 1) - local41.ba(local15, local12 + 1);
									local41.ya(local1, local28, (local53 + local67 + local85 + local99) / 4, local32, 0, false);
								}
							}
						}
					}
				}
			}
		}
	}
}
