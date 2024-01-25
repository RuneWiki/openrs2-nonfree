import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static302 {

	@OriginalMember(owner = "client!pb", name = "i", descriptor = "Lclient!sk;")
	public static final Class231 aClass231_89 = new Class231("Connection lost.", "Verbindung abgebrochen.", "Connexion perdue.", "Conexão perdida.");

	@OriginalMember(owner = "client!pb", name = "o", descriptor = "Lclient!nd;")
	public static final Class175 aClass175_15 = new Class175(11, 3);

	@OriginalMember(owner = "client!pb", name = "p", descriptor = "I")
	public static int anInt4975 = 0;

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(IIB)Ljava/lang/String;")
	public static String method4394(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg1 - arg0;
		if (local12 < -9) {
			return "<col=ff0000>";
		} else if (local12 < -6) {
			return "<col=ff3000>";
		} else if (local12 < -3) {
			return "<col=ff7000>";
		} else if (local12 < 0) {
			return "<col=ffb000>";
		} else if (local12 > 9) {
			return "<col=00ff00>";
		} else if (local12 > 6) {
			return "<col=40ff00>";
		} else if (local12 > 3) {
			return "<col=80ff00>";
		} else if (local12 > 0) {
			return "<col=c0ff00>";
		} else {
			return "<col=ffff00>";
		}
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(II)Z")
	public static boolean method4398(@OriginalArg(1) int arg0) {
		if (arg0 == 30 || arg0 == 44 || arg0 == 10 || arg0 == 22 || arg0 == 45) {
			return true;
		} else {
			return arg0 == 5 || arg0 == 1011;
		}
	}

	@OriginalMember(owner = "client!pb", name = "b", descriptor = "(I)V")
	public static void method4399() {
		@Pc(7) int local7 = 0;
		for (@Pc(9) int local9 = 0; local9 < Static84.anInt1632; local9++) {
			for (@Pc(13) int local13 = 0; local13 < Static261.anInt4480; local13++) {
				if (Static252.method3889(Static30.aClass189ArrayArrayArray2, local13, local7, local9, true)) {
					local7++;
				}
				if (local7 >= 512) {
					return;
				}
			}
		}
	}
}
