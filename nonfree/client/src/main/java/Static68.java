import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static68 {

	@OriginalMember(owner = "client!cm", name = "O", descriptor = "Lclient!ej;")
	public static final Class88 aClass88_39 = new Class88("Loading wordpack - ", "Lade Wordpack - ", "Chargement du module texte - ", "Carregando pacote de palavras - ");

	@OriginalMember(owner = "client!cm", name = "bb", descriptor = "J")
	public static long aLong28 = -1L;

	@OriginalMember(owner = "client!cm", name = "yb", descriptor = "Lclient!ej;")
	public static final Class88 aClass88_40 = new Class88("purple:", "lila:", "violet:", "roxo:");

	@OriginalMember(owner = "client!cm", name = "Ab", descriptor = "Lclient!cba;")
	public static final Class45 aClass45_26 = new Class45(34, -2);

	@OriginalMember(owner = "client!cm", name = "Gb", descriptor = "Ljava/util/zip/CRC32;")
	public static final CRC32 aCRC32_1 = new CRC32();

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(I)V")
	public static void method1557() {
		Static394.aClass12_Sub8_Sub2_2.method5241();
		@Pc(13) int local13 = Static394.aClass12_Sub8_Sub2_2.method5238(8);
		@Pc(18) int local18;
		if (Static451.anInt4553 > local13) {
			for (local18 = local13; local18 < Static451.anInt4553; local18++) {
				Static81.anIntArray183[Static82.anInt1957++] = Static11.anIntArray16[local18];
			}
		}
		if (local13 > Static451.anInt4553) {
			throw new RuntimeException("gnpov1");
		}
		Static451.anInt4553 = 0;
		for (local18 = 0; local18 < local13; local18++) {
			@Pc(60) int local60 = Static11.anIntArray16[local18];
			@Pc(68) Class30_Sub1_Sub1_Sub2 local68 = ((Class12_Sub41) Static29.aClass68_7.method1917((long) local60)).aClass30_Sub1_Sub1_Sub2_2;
			@Pc(75) int local75 = Static394.aClass12_Sub8_Sub2_2.method5238(1);
			if (local75 == 0) {
				Static11.anIntArray16[Static451.anInt4553++] = local60;
				local68.anInt4151 = Static409.anInt7683;
			} else {
				@Pc(98) int local98 = Static394.aClass12_Sub8_Sub2_2.method5238(2);
				if (local98 == 0) {
					Static11.anIntArray16[Static451.anInt4553++] = local60;
					local68.anInt4151 = Static409.anInt7683;
					Static188.anIntArray320[Static34.anInt757++] = local60;
				} else {
					@Pc(143) int local143;
					@Pc(153) int local153;
					if (local98 == 1) {
						Static11.anIntArray16[Static451.anInt4553++] = local60;
						local68.anInt4151 = Static409.anInt7683;
						local143 = Static394.aClass12_Sub8_Sub2_2.method5238(3);
						local68.method3607(1, local143);
						local153 = Static394.aClass12_Sub8_Sub2_2.method5238(1);
						if (local153 == 1) {
							Static188.anIntArray320[Static34.anInt757++] = local60;
						}
					} else if (local98 == 2) {
						Static11.anIntArray16[Static451.anInt4553++] = local60;
						local68.anInt4151 = Static409.anInt7683;
						if (Static394.aClass12_Sub8_Sub2_2.method5238(1) == 1) {
							local143 = Static394.aClass12_Sub8_Sub2_2.method5238(3);
							local68.method3607(2, local143);
							local153 = Static394.aClass12_Sub8_Sub2_2.method5238(3);
							local68.method3607(2, local153);
						} else {
							local143 = Static394.aClass12_Sub8_Sub2_2.method5238(3);
							local68.method3607(0, local143);
						}
						local143 = Static394.aClass12_Sub8_Sub2_2.method5238(1);
						if (local143 == 1) {
							Static188.anIntArray320[Static34.anInt757++] = local60;
						}
					} else if (local98 == 3) {
						Static81.anIntArray183[Static82.anInt1957++] = local60;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(Ljava/lang/String;I)Z")
	public static boolean method1558(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(11) int local11 = 0; local11 < Static167.anInt3850; local11++) {
			if (arg0.equalsIgnoreCase(Static205.aStringArray24[local11])) {
				return true;
			}
		}
		return arg0.equalsIgnoreCase(Static440.aClass30_Sub1_Sub1_Sub1_2.aString6);
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(ILclient!daa;)Ljava/lang/String;")
	public static String method1561(@OriginalArg(1) Class12_Sub8 arg0) {
		return Static102.method2111(arg0);
	}
}
