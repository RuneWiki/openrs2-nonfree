import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static484 {

	@OriginalMember(owner = "client!uh", name = "i", descriptor = "I")
	public static int anInt8591;

	@OriginalMember(owner = "client!uh", name = "g", descriptor = "Lclient!nj;")
	public static final Class202 aClass202_244 = new Class202("Loading textures - ", "Lade Texturen - ", "Chargement des textures - ", "Carregando texturas - ");

	@OriginalMember(owner = "client!uh", name = "j", descriptor = "Lclient!nj;")
	public static final Class202 aClass202_245 = new Class202("Stellar Dawn is loading - please wait...", "Mechscape wird geladen - bitte warten...", "Chargement de Mechscape en cours - veuillez patienter...", "Mechscape carregando. Aguarde...");

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(Lclient!haa;IIIII)V")
	public static void method7206(@OriginalArg(0) Class109 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		arg0.anInt6354 = 0;
		@Pc(7) int local7;
		label56: for (@Pc(4) int local4 = arg2; local4 <= arg4; local4++) {
			label54: for (local7 = arg3; local7 <= arg5; local7++) {
				@Pc(16) long local16 = Static139.aLongArrayArrayArray1[arg1][local4][local7];
				@Pc(18) long local18 = 0L;
				while (true) {
					label49: while (true) {
						if (local18 > 48L) {
							continue label54;
						}
						@Pc(27) int local27 = (int) (local16 >>> (int) local18 & 0xFFFFL);
						if (local27 <= 0) {
							continue label54;
						}
						@Pc(35) Class83 local35 = Static410.aClass83Array1[local27 - 1];
						for (@Pc(37) int local37 = 0; local37 < arg0.anInt6354; local37++) {
							if (arg0.aClass2_Sub5Array4[local37] == local35.aClass2_Sub5_1) {
								local18 += 16L;
								continue label49;
							}
						}
						arg0.aClass2_Sub5Array4[arg0.anInt6354++] = local35.aClass2_Sub5_1;
						if (arg0.anInt6354 == 4) {
							break label56;
						}
						local18 += 16L;
					}
				}
			}
		}
		for (local7 = arg0.anInt6354; local7 < 4; local7++) {
			arg0.aClass2_Sub5Array4[local7] = null;
		}
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(IIIII)V")
	public static void method7208(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static281.aClass2_Sub19_Sub1_1.anInt2187 != 0 && arg0 != 0 && Static374.anInt6954 < 50 && arg3 != -1) {
			Static469.aClass141Array1[Static374.anInt6954++] = new Class141((byte) 1, arg3, arg0, arg2, arg1, 0);
		}
	}
}
