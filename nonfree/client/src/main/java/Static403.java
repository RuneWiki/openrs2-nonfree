import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static403 {

	@OriginalMember(owner = "client!ud", name = "b", descriptor = "Lclient!bh;")
	public static Class22 aClass22_2;

	@OriginalMember(owner = "client!ud", name = "d", descriptor = "I")
	public static int anInt6530;

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "Lclient!lt;")
	public static final Class151 aClass151_204 = new Class151("You can't add yourself to your own ignore list.", "Du kannst dich nicht auf deine eigene Ignorieren-Liste setzen!", "Vous ne pouvez pas ajouter votre nom à votre liste noire.", "Você não pode adicionar a si próprio à sua lista de ignorados.");

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(IIIIIII)V")
	public static void method5022(@OriginalArg(0) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3) {
		for (@Pc(18) Class13_Sub3 local18 = (Class13_Sub3) Static78.aClass227_4.method4827(); local18 != null; local18 = (Class13_Sub3) Static78.aClass227_4.method4834()) {
			if (Static368.anInt6250 >= local18.anInt2890) {
				local18.method5413();
			} else {
				Static79.method1220((local18.anInt2891 << 7) + 64, (local18.anInt2888 << 7) + 64, arg2 >> 1, local18.anInt2887 * 2, local18.anInt2885, arg3 >> 1);
				Static227.aClass16_1.method5495(local18.anInt2883 | 0xFF000000, 0, Static80.anIntArray72[0] + arg1, arg0 + Static80.anIntArray72[1], local18.aString26);
			}
		}
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(IIIBI)V")
	public static void method5024(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg0;
		@Pc(12) int local12 = -arg0;
		@Pc(14) int local14 = -1;
		@Pc(22) int local22 = Static63.method971(Static271.anInt4271, arg2 + arg0, Static13.anInt263);
		@Pc(30) int local30 = Static63.method971(Static271.anInt4271, arg2 - arg0, Static13.anInt263);
		Static298.method3891(local22, local30, Static106.anIntArrayArray46[arg1], arg3);
		while (local7 < local9) {
			local14 += 2;
			local12 += local14;
			@Pc(70) int local70;
			@Pc(74) int local74;
			@Pc(92) int local92;
			@Pc(100) int local100;
			if (local12 > 0) {
				local9--;
				local12 -= local9 << 1;
				local70 = arg1 - local9;
				local74 = local9 + arg1;
				if (Static74.anInt1413 <= local74 && Static149.anInt7384 >= local70) {
					local92 = Static63.method971(Static271.anInt4271, local7 + arg2, Static13.anInt263);
					local100 = Static63.method971(Static271.anInt4271, arg2 - local7, Static13.anInt263);
					if (Static149.anInt7384 >= local74) {
						Static298.method3891(local92, local100, Static106.anIntArrayArray46[local74], arg3);
					}
					if (Static74.anInt1413 <= local70) {
						Static298.method3891(local92, local100, Static106.anIntArrayArray46[local70], arg3);
					}
				}
			}
			local7++;
			local70 = arg1 - local7;
			local74 = local7 + arg1;
			if (Static74.anInt1413 <= local74 && Static149.anInt7384 >= local70) {
				local92 = Static63.method971(Static271.anInt4271, local9 + arg2, Static13.anInt263);
				local100 = Static63.method971(Static271.anInt4271, arg2 - local9, Static13.anInt263);
				if (local74 <= Static149.anInt7384) {
					Static298.method3891(local92, local100, Static106.anIntArrayArray46[local74], arg3);
				}
				if (Static74.anInt1413 <= local70) {
					Static298.method3891(local92, local100, Static106.anIntArrayArray46[local70], arg3);
				}
			}
		}
	}
}
