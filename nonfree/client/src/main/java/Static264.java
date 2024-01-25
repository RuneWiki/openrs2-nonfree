import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static264 {

	@OriginalMember(owner = "client!ms", name = "j", descriptor = "Lclient!vn;")
	public static Class2_Sub44 aClass2_Sub44_1;

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "Lclient!of;")
	public static final Class188 aClass188_39 = new Class188(20);

	@OriginalMember(owner = "client!ms", name = "g", descriptor = "I")
	public static int anInt4626 = 0;

	@OriginalMember(owner = "client!ms", name = "i", descriptor = "Lclient!ss;")
	public static final Class231 aClass231_81 = new Class231("You can't add yourself to your own friends list.", "Du kannst dich nicht auf deine eigene Freunde-Liste setzen!", "Vous ne pouvez pas ajouter votre nom à votre liste d'amis.", "Você não pode adicionar a si próprio à sua lista de amigos.");

	@OriginalMember(owner = "client!ms", name = "k", descriptor = "I")
	public static final int anInt4628 = 4;

	@OriginalMember(owner = "client!ms", name = "l", descriptor = "[I")
	public static final int[] anIntArray398 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!ms", name = "n", descriptor = "[S")
	public static final short[] aShortArray78 = new short[] { 960, 957, -21568, -21571, 22464 };

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(ILjava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;II)V")
	public static void method3702(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(3) String arg2, @OriginalArg(4) String arg3, @OriginalArg(5) String arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		for (@Pc(7) int local7 = 99; local7 > 0; local7--) {
			Static12.anIntArray24[local7] = Static12.anIntArray24[local7 - 1];
			Static297.anIntArray454[local7] = Static297.anIntArray454[local7 - 1];
			Static191.aStringArray40[local7] = Static191.aStringArray40[local7 - 1];
			Static174.aStringArray36[local7] = Static174.aStringArray36[local7 - 1];
			Static283.aStringArray48[local7] = Static283.aStringArray48[local7 - 1];
			Static156.aStringArray35[local7] = Static156.aStringArray35[local7 - 1];
			Static415.anIntArray578[local7] = Static415.anIntArray578[local7 - 1];
		}
		Static12.anIntArray24[0] = arg5;
		Static191.aStringArray40[0] = arg4;
		Static297.anIntArray454[0] = arg6;
		Static174.aStringArray36[0] = arg3;
		Static283.aStringArray48[0] = arg1;
		Static156.aStringArray35[0] = arg2;
		Static171.anInt5503 = Static144.anInt2663;
		Static415.anIntArray578[0] = arg0;
		Static122.anInt2065++;
	}
}
