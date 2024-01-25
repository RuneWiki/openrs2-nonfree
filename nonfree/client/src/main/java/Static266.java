import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static266 {

	@OriginalMember(owner = "client!mu", name = "c", descriptor = "Lclient!ss;")
	public static final Class231 aClass231_82 = new Class231("Loading wordpack - ", "Lade Wordpack - ", "Chargement du module texte - ", "Carregando pacote de palavras - ");

	@OriginalMember(owner = "client!mu", name = "f", descriptor = "Lclient!cg;")
	public static final Class37 aClass37_14 = new Class37(11, 0, 1, 2);

	@OriginalMember(owner = "client!mu", name = "g", descriptor = "Lclient!bi;")
	public static final Class25 aClass25_110 = new Class25(25, 8);

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(Lclient!ot;IIIII)V")
	public static void method3703(@OriginalArg(0) Class12 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		arg0.anInt164 = 0;
		@Pc(7) int local7;
		label56: for (@Pc(4) int local4 = arg2; local4 <= arg4; local4++) {
			label54: for (local7 = arg3; local7 <= arg5; local7++) {
				@Pc(16) long local16 = Static254.aLongArrayArrayArray1[arg1][local4][local7];
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
						@Pc(35) Class38 local35 = Static330.aClass38Array1[local27 - 1];
						for (@Pc(37) int local37 = 0; local37 < arg0.anInt164; local37++) {
							if (arg0.aClass2_Sub4Array2[local37] == local35.aClass2_Sub4_1) {
								local18 += 16L;
								continue label49;
							}
						}
						arg0.aClass2_Sub4Array2[arg0.anInt164++] = local35.aClass2_Sub4_1;
						if (arg0.anInt164 == 4) {
							break label56;
						}
						local18 += 16L;
					}
				}
			}
		}
		for (local7 = arg0.anInt164; local7 < 4; local7++) {
			arg0.aClass2_Sub4Array2[local7] = null;
		}
	}
}
