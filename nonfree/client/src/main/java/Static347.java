import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static347 {

	@OriginalMember(owner = "client!uj", name = "T", descriptor = "Lclient!nl;")
	public static Class171 aClass171_93;

	@OriginalMember(owner = "client!uj", name = "U", descriptor = "[I")
	public static int[] anIntArray1193;

	@OriginalMember(owner = "client!uj", name = "V", descriptor = "Lclient!de;")
	public static Class44 aClass44_4;

	@OriginalMember(owner = "client!uj", name = "H", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray149 = new String[100];

	@OriginalMember(owner = "client!uj", name = "P", descriptor = "Lclient!rc;")
	public static final Class205 aClass205_130 = new Class205(81, 15);

	@OriginalMember(owner = "client!uj", name = "Q", descriptor = "I")
	public static int anInt5864 = -1;

	@OriginalMember(owner = "client!uj", name = "S", descriptor = "Lclient!ch;")
	public static final Class32 aClass32_92 = new Class32("You can't add yourself to your own ignore list.", "Du kannst dich nicht auf deine eigene Ignorieren-Liste setzen!", "Vous ne pouvez pas ajouter votre nom à votre liste noire.", "Você não pode adicionar a si próprio à sua lista de ignorados.");

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(IIIII)V")
	public static void method5039(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(9) float local9 = (float) Static338.anInt3296 / (float) Static338.anInt3306;
		@Pc(11) int local11 = arg3;
		@Pc(13) int local13 = arg1;
		if (local9 < 1.0F) {
			local13 = (int) (local9 * (float) arg3);
		} else {
			local11 = (int) ((float) arg1 / local9);
		}
		@Pc(45) int local45 = arg0 - (arg3 - local11) / 2;
		@Pc(54) int local54 = arg2 - (arg1 - local13) / 2;
		Static24.anInt533 = -1;
		Static82.anInt1484 = local45 * Static338.anInt3306 / local11;
		Static308.anInt5181 = Static338.anInt3296 - local54 * Static338.anInt3296 / local13;
		Static280.anInt4835 = -1;
		Static52.method874();
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(Lclient!gf;I)V")
	public static void method5041(@OriginalArg(0) Class1_Sub5_Sub1_Sub1 arg0) {
		@Pc(16) Class2_Sub29 local16 = (Class2_Sub29) Static367.aClass246_32.method5613((long) arg0.anInt6413);
		if (local16 == null) {
			Static185.method3197(null, arg0.anIntArray1324[0], 0, arg0.anIntArray1323[0], arg0.aByte69, arg0, null);
		} else {
			local16.method3586();
		}
	}
}
