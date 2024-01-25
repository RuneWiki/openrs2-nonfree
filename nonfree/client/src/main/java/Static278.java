import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static278 {

	@OriginalMember(owner = "client!o", name = "i", descriptor = "I")
	public static int anInt4391;

	@OriginalMember(owner = "client!o", name = "j", descriptor = "I")
	public static int anInt4392;

	@OriginalMember(owner = "client!o", name = "e", descriptor = "Lclient!ki;")
	public static final Class137 aClass137_183 = new Class137(58, -1);

	@OriginalMember(owner = "client!o", name = "g", descriptor = "Lclient!lt;")
	public static final Class151 aClass151_143 = new Class151("Loading config - ", "Lade Konfiguration - ", "Chargement des fichiers config - ", "Carregando config - ");

	@OriginalMember(owner = "client!o", name = "k", descriptor = "[B")
	public static final byte[] aByteArray49 = new byte[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

	@OriginalMember(owner = "client!o", name = "l", descriptor = "[I")
	public static final int[] anIntArray237 = new int[14];

	@OriginalMember(owner = "client!o", name = "m", descriptor = "F")
	public static float aFloat52 = 1024.0F;

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(II)V")
	public static void method3521(@OriginalArg(1) int arg0) {
		if (!Static266.method2725(arg0)) {
			return;
		}
		@Pc(22) Class250[] local22 = Static369.aClass250ArrayArray5[arg0];
		for (@Pc(24) int local24 = 0; local24 < local22.length; local24++) {
			@Pc(30) Class250 local30 = local22[local24];
			if (local30 != null) {
				local30.anInt6988 = 0;
				local30.anInt7023 = 0;
				local30.anInt6980 = 1;
			}
		}
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(IIZ)Z")
	public static boolean method3523(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static6.method102(arg1, arg0) || Static55.method855(arg1, arg0);
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(Lclient!td;I[[B)V")
	public static void method3524(@OriginalArg(0) Class148_Sub1 arg0, @OriginalArg(2) byte[][] arg1) {
		@Pc(17) int[] local17 = new int[] { -1, 0, 0, 0, 0 };
		for (@Pc(19) int local19 = 0; local19 < arg0.anInt6342; local19++) {
			Static15.method239();
			for (@Pc(27) int local27 = 0; local27 < Static425.anInt6922 >> 3; local27++) {
				for (@Pc(31) int local31 = 0; local31 < Static251.anInt4072 >> 3; local31++) {
					@Pc(35) boolean local35 = false;
					@Pc(43) int local43 = Static303.anIntArrayArrayArray13[local19][local27][local31];
					if (local43 != -1) {
						@Pc(53) int local53 = local43 >> 24 & 0x3;
						if (!arg0.aBoolean521 || local53 == 0) {
							@Pc(64) int local64 = local43 >> 1 & 0x3;
							@Pc(70) int local70 = local43 >> 14 & 0x3FF;
							@Pc(76) int local76 = local43 >> 3 & 0x7FF;
							@Pc(86) int local86 = (local70 / 8 << 8) + local76 / 8;
							for (@Pc(88) int local88 = 0; local88 < Static334.anIntArray331.length; local88++) {
								if (Static334.anIntArray331[local88] == local86 && arg1[local88] != null) {
									@Pc(106) Class1_Sub11 local106 = new Class1_Sub11(arg1[local88]);
									arg0.method4875(local76, local53, local106, Static383.aClass247Array1, local64, local19, local70, local27 * 8, local31 * 8);
									local35 = true;
									arg0.method4885(local106, local27 * 8, local70, local19, local17[0] == -1 ? local17 : null, local64, Static213.aClass128_22, local31 * 8, local53, local76);
									break;
								}
							}
						}
					}
					if (!local35) {
						arg0.method4869(local19, local27 * 8, 8, local31 * 8, 8);
					}
				}
			}
		}
		if (local17[0] != -1) {
			Static25.aClass256_1 = Static128.aClass66_1.method1365(local17[3], Static331.aClass238_1, local17[2], local17[1], local17[0]);
			Static366.anInt6203 = local17[4];
		}
	}
}
