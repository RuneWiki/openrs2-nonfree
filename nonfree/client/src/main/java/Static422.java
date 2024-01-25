import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static422 {

	@OriginalMember(owner = "client!vh", name = "h", descriptor = "Lclient!lt;")
	public static Class158 aClass158_88;

	@OriginalMember(owner = "client!vh", name = "i", descriptor = "I")
	public static int anInt7022;

	@OriginalMember(owner = "client!vh", name = "c", descriptor = "Lclient!sk;")
	public static final Class231 aClass231_108 = new Class231("You can't add yourself to your own friend list.", "Du kannst dich nicht auf deine eigene Freunde-Liste setzen!", "Vous ne pouvez pas ajouter votre nom à votre liste d'amis.", "Você não pode adicionar a si próprio à sua lista de amigos.");

	@OriginalMember(owner = "client!vh", name = "d", descriptor = "[I")
	public static final int[] anIntArray604 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!vh", name = "j", descriptor = "Lclient!sk;")
	public static final Class231 aClass231_109 = new Class231("Loading interfaces - ", "Lade Benutzeroberfläche - ", "Chargement des interfaces - ", "Carregando interfaces - ");

	@OriginalMember(owner = "client!vh", name = "k", descriptor = "Z")
	public static volatile boolean aBoolean477 = false;

	@OriginalMember(owner = "client!vh", name = "l", descriptor = "[I")
	public static final int[] anIntArray605 = new int[25];

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(Z[FI)[F")
	public static float[] method5698(@OriginalArg(1) float[] arg0, @OriginalArg(2) int arg1) {
		@Pc(11) float[] local11 = new float[arg1];
		Static459.method5355(arg0, 0, local11, 0, arg1);
		return local11;
	}

	@OriginalMember(owner = "client!vh", name = "b", descriptor = "(I)Z")
	public static boolean method5699() {
		return Static228.anInt3878 > 0;
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(III)Z")
	public static boolean method5700(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!Static206.aBoolean239) {
			return false;
		}
		@Pc(13) int local13 = arg0 >> 16;
		@Pc(17) int local17 = arg0 & 0xFFFF;
		if (Static129.aClass239ArrayArray1[local13] == null || Static129.aClass239ArrayArray1[local13][local17] == null) {
			return false;
		}
		@Pc(35) Class239 local35 = Static129.aClass239ArrayArray1[local13][local17];
		@Pc(55) Class6_Sub33 local55;
		if (arg1 == -1 && local35.anInt6447 == 0) {
			for (local55 = (Class6_Sub33) Static307.aClass88_23.method1882(); local55 != null; local55 = (Class6_Sub33) Static307.aClass88_23.method1891()) {
				if (local55.anInt5954 == 48 || local55.anInt5954 == 1007 || local55.anInt5954 == 15 || local55.anInt5954 == 18 || local55.anInt5954 == 3) {
					for (@Pc(88) Class239 local88 = Static299.method4387(local55.anInt5956); local88 != null; local88 = Static257.method3954(local88)) {
						if (local35.anInt6423 == local88.anInt6423) {
							return true;
						}
					}
				}
			}
		} else {
			for (local55 = (Class6_Sub33) Static307.aClass88_23.method1882(); local55 != null; local55 = (Class6_Sub33) Static307.aClass88_23.method1891()) {
				if (arg1 == local55.anInt5951 && local55.anInt5956 == local35.anInt6423 && (local55.anInt5954 == 48 || local55.anInt5954 == 1007 || local55.anInt5954 == 15 || local55.anInt5954 == 18 || local55.anInt5954 == 3)) {
					return true;
				}
			}
		}
		return false;
	}
}
