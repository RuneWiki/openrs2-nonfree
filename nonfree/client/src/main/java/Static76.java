import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static76 {

	@OriginalMember(owner = "client!ct", name = "I", descriptor = "I")
	public static int anInt1269;

	@OriginalMember(owner = "client!ct", name = "F", descriptor = "Lclient!mq;")
	public static final Class223 aClass223_13 = new Class223(4);

	@OriginalMember(owner = "client!ct", name = "e", descriptor = "(I)V")
	public static void method1235() {
		Static464.aClass350_36.method8203();
		Static277.aClass350_21.method8203();
	}

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(IIB)Z")
	public static boolean method1237(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!Static49.aBoolean36) {
			return false;
		}
		@Pc(18) int local18 = arg1 >> 16;
		@Pc(22) int local22 = arg1 & 0xFFFF;
		if (Static343.aClass225ArrayArray1[local18] == null || Static343.aClass225ArrayArray1[local18][local22] == null) {
			return false;
		}
		@Pc(40) Class225 local40 = Static343.aClass225ArrayArray1[local18][local22];
		@Pc(52) Class4_Sub39 local52;
		if (arg0 == -1 && local40.anInt6508 == 0) {
			for (local52 = (Class4_Sub39) Static40.aClass244_4.method5963(); local52 != null; local52 = (Class4_Sub39) Static40.aClass244_4.method5965()) {
				if (local52.anInt8541 == 3 || local52.anInt8541 == 1007 || local52.anInt8541 == 19 || local52.anInt8541 == 59 || local52.anInt8541 == 11) {
					for (@Pc(83) Class225 local83 = Static490.method7272(local52.anInt8543); local83 != null; local83 = Static541.method7832(local83)) {
						if (local83.anInt6555 == local40.anInt6555) {
							return true;
						}
					}
				}
			}
		} else {
			for (local52 = (Class4_Sub39) Static40.aClass244_4.method5963(); local52 != null; local52 = (Class4_Sub39) Static40.aClass244_4.method5965()) {
				if (local52.anInt8542 == arg0 && local40.anInt6555 == local52.anInt8543 && (local52.anInt8541 == 3 || local52.anInt8541 == 1007 || local52.anInt8541 == 19 || local52.anInt8541 == 59 || local52.anInt8541 == 11)) {
					return true;
				}
			}
		}
		return false;
	}
}
