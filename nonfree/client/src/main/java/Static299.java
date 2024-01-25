import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static299 {

	@OriginalMember(owner = "client!on", name = "p", descriptor = "Lclient!ss;")
	public static final Class231 aClass231_92 = new Class231(" is already on your ignore list.", " steht bereits auf deiner Ignorieren-Liste!", " est déjà dans votre liste noire.", " já está na sua lista de ignorados.");

	@OriginalMember(owner = "client!on", name = "q", descriptor = "[[I")
	public static final int[][] anIntArrayArray128 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 3, 5, 6, 4 }, { 0, 1, 4, 5 }, { 4, 6, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 1, 2, 4, 6, 7 }, { 4, 7, 6, 0 }, { 0, 8, 6, 1, 9, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 3, 7, 10, 10, 6, 6 }, { 2, 4, 6, 0 } };

	@OriginalMember(owner = "client!on", name = "t", descriptor = "Lclient!ss;")
	public static final Class231 aClass231_93 = new Class231("Please remove ", "Bitte entferne ", "Veuillez commencer par supprimer ", "Remova ");

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(II)V")
	public static void method4282(@OriginalArg(1) int arg0) {
		Static304.anInt5495 = arg0;
		Static316.aClass188_43.method4156();
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(BIBILclient!gh;)V")
	public static void method4283(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) Class11_Sub5_Sub2_Sub1 arg2) {
		@Pc(8) int local8 = arg2.anIntArray632[0];
		@Pc(13) int local13 = arg2.anIntArray633[0];
		if (local8 < 0 || Static234.anInt3949 <= local8 || local13 < 0 || Static371.anInt6492 <= local13 || (arg0 < 0 || arg0 >= Static234.anInt3949 || arg1 < 0 || arg1 >= Static371.anInt6492)) {
			return;
		}
		@Pc(66) int local66 = Static396.method5468(-4, Static235.anIntArray356, arg0, 0, 0, local13, Static430.anIntArray596, arg2.method6215(), true, local8, 0, Static89.aClass225Array2[arg2.aByte101], arg1, 0);
		if (local66 >= 1 && local66 <= 3) {
			for (@Pc(81) int local81 = 0; local81 < local66 - 1; local81++) {
				arg2.method2103(Static235.anIntArray356[local81], (byte) 2, Static430.anIntArray596[local81]);
			}
		}
	}
}
