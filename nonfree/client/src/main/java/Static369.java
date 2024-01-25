import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static369 {

	@OriginalMember(owner = "client!st", name = "i", descriptor = "I")
	public static int anInt6559;

	@OriginalMember(owner = "client!st", name = "r", descriptor = "I")
	public static int anInt6566;

	@OriginalMember(owner = "client!st", name = "s", descriptor = "I")
	public static int anInt6567;

	@OriginalMember(owner = "client!st", name = "k", descriptor = "Lclient!vj;")
	public static final Class256 aClass256_132 = new Class256("Created gameworld", "Spielwelt erstellt.", "Monde de jeu créé", "Universo de jogo criado");

	@OriginalMember(owner = "client!st", name = "m", descriptor = "Lclient!vj;")
	public static final Class256 aClass256_133 = new Class256(" has logged out.", " loggt sich aus.", " s'est déconnecté.", " saiu do jogo.");

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(III)I")
	public static int method5166(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) int local14 = arg1 * 57 + arg0;
		@Pc(20) int local20 = local14 ^ local14 << 13;
		@Pc(34) int local34 = Integer.MAX_VALUE & (local20 * local20 * 15731 + 789221) * local20 + 1376312589;
		return local34 >> 19 & 0xFF;
	}

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method5167(@OriginalArg(0) String arg0) {
		if (Static125.aClass255Array1 != null) {
			Static448.method6059(Static249.aClass44_60);
			Static98.aClass2_Sub20_Sub1_1.method3699(Static209.method3225(arg0));
			Static98.aClass2_Sub20_Sub1_1.method3715(arg0);
		}
	}
}
