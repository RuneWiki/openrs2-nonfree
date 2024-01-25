import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static454 {

	@OriginalMember(owner = "client!qf", name = "c", descriptor = "I")
	public static int anInt8397;

	@OriginalMember(owner = "client!qf", name = "d", descriptor = "I")
	public static int anInt8398;

	@OriginalMember(owner = "client!qf", name = "e", descriptor = "Lclient!mu;")
	public static final Class215 aClass215_193 = new Class215(47, 6);

	@OriginalMember(owner = "client!qf", name = "j", descriptor = "[C")
	public static final char[] aCharArray5 = new char[] { ' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß' };

	@OriginalMember(owner = "client!qf", name = "k", descriptor = "Lclient!ad;")
	public static final Class6 aClass6_8 = new Class6(3, 2);

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(III)V")
	public static void method7117(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(20) boolean local20 = Static395.aClass100ArrayArrayArray3[0][arg1][arg2] != null && Static395.aClass100ArrayArrayArray3[0][arg1][arg2].aClass100_1 != null;
		for (@Pc(22) int local22 = arg0; local22 >= 0; local22--) {
			if (Static395.aClass100ArrayArrayArray3[local22][arg1][arg2] == null) {
				@Pc(44) Class100 local44 = Static395.aClass100ArrayArrayArray3[local22][arg1][arg2] = new Class100(local22);
				if (local20) {
					local44.aByte41++;
				}
			}
		}
	}
}
