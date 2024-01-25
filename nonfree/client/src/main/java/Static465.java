import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static465 {

	@OriginalMember(owner = "client!tca", name = "a", descriptor = "Lclient!kk;")
	public static Class92 aClass92_4;

	@OriginalMember(owner = "client!tca", name = "f", descriptor = "Ljava/lang/Object;")
	public static Object anObject18;

	@OriginalMember(owner = "client!tca", name = "d", descriptor = "Lclient!bv;")
	public static final Class40 aClass40_135 = new Class40("Starting 3D Library", "Starte 3D-Softwarebibliothek.", "Démarrage de la librairie 3D", "Iniciando biblioteca 3D");

	@OriginalMember(owner = "client!tca", name = "e", descriptor = "I")
	public static int anInt7976 = -1;

	@OriginalMember(owner = "client!tca", name = "g", descriptor = "Lclient!pp;")
	public static final Class236 aClass236_81 = new Class236(11, -1);

	@OriginalMember(owner = "client!tca", name = "h", descriptor = "Z")
	public static final boolean aBoolean570 = false;

	@OriginalMember(owner = "client!tca", name = "i", descriptor = "I")
	public static int anInt7977 = 500;

	@OriginalMember(owner = "client!tca", name = "a", descriptor = "(Lclient!hn;II)V")
	public static void method6479(@OriginalArg(0) Class15_Sub2_Sub1 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = -1;
		@Pc(14) int local14 = 0;
		if (Static481.anInt8318 < arg0.anInt4721) {
			Static278.method4545(arg0);
		} else if (arg0.anInt4718 < Static481.anInt8318) {
			Static477.method6652(arg0, false);
			local12 = Static514.anInt8747;
			local14 = Static448.anInt7815;
		} else {
			Static422.method6057(arg0);
		}
		if (arg0.anInt8492 < 128 || arg0.anInt8493 < 128 || Static460.anInt7894 * 128 - 128 <= arg0.anInt8492 || Static235.anInt4493 * 128 - 128 <= arg0.anInt8493) {
			arg0.anInt4689 = -1;
			local14 = 0;
			arg0.anInt4721 = 0;
			local12 = -1;
			arg0.anInt4718 = 0;
			arg0.anInt4715 = -1;
			arg0.anInt4711 = -1;
			arg0.anInt8492 = arg0.anIntArray306[0] * 128 + arg0.method4035() * 64;
			arg0.anInt8493 = arg0.anIntArray307[0] * 128 + arg0.method4035() * 64;
			arg0.method4040();
		}
		if (arg0 == Static35.aClass15_Sub2_Sub1_Sub1_1 && (arg0.anInt8492 < 1536 || arg0.anInt8493 < 1536 || (Static460.anInt7894 - 12) * 128 <= arg0.anInt8492 || arg0.anInt8493 >= Static235.anInt4493 * 128 - 1536)) {
			arg0.anInt4689 = -1;
			arg0.anInt4715 = -1;
			arg0.anInt4721 = 0;
			local12 = -1;
			local14 = 0;
			arg0.anInt4718 = 0;
			arg0.anInt4711 = -1;
			arg0.anInt8492 = arg0.anIntArray306[0] * 128 + arg0.method4035() * 64;
			arg0.anInt8493 = arg0.anIntArray307[0] * 128 + arg0.method4035() * 64;
			arg0.method4040();
		}
		@Pc(213) int local213 = Static28.method680(arg0);
		Static240.method4083(arg0, local213, local14, local12);
		Static305.method5013(arg0);
	}

	@OriginalMember(owner = "client!tca", name = "a", descriptor = "(ZLjava/lang/String;)I")
	public static int method6480(@OriginalArg(1) String arg0) {
		for (@Pc(7) int local7 = 0; local7 < Static6.aStringArray4.length; local7++) {
			if (Static6.aStringArray4[local7].equalsIgnoreCase(arg0)) {
				return local7;
			}
		}
		return -1;
	}
}
