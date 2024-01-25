import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static410 {

	@OriginalMember(owner = "client!oaa", name = "yi", descriptor = "I")
	public static int anInt7178;

	@OriginalMember(owner = "client!oaa", name = "si", descriptor = "Lclient!o;")
	public static final Class246 aClass246_26 = new Class246(4, 1, 1, 1);

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "(IZII)Ljava/lang/String;")
	public static String method6167(@OriginalArg(1) boolean arg0, @OriginalArg(3) int arg1) {
		if (!arg0 || arg1 < 0) {
			return Integer.toString(arg1, 10);
		}
		@Pc(37) int local37 = 2;
		@Pc(41) int local41 = arg1 / 10;
		while (local41 != 0) {
			local41 /= 10;
			local37++;
		}
		@Pc(53) char[] local53 = new char[local37];
		local53[0] = '+';
		for (@Pc(61) int local61 = local37 - 1; local61 > 0; local61--) {
			@Pc(65) int local65 = arg1;
			arg1 /= 10;
			@Pc(76) int local76 = local65 - arg1 * 10;
			if (local76 >= 10) {
				local53[local61] = (char) (local76 + 87);
			} else {
				local53[local61] = (char) (local76 + 48);
			}
		}
		return new String(local53);
	}

	@OriginalMember(owner = "client!oaa", name = "b", descriptor = "(IIII)Z")
	public static boolean method6168(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		Static7.aClass207_1.method8195(arg0, arg1, arg2, Static631.anIntArray680);
		@Pc(13) int local13 = Static631.anIntArray680[2];
		if (local13 < 50) {
			return false;
		} else {
			Static631.anIntArray680[0] = Static631.anIntArray680[0] * Static153.anInt2553 / local13 + Static613.anInt10037;
			Static631.anIntArray680[1] = Static399.anInt6714 * Static631.anIntArray680[1] / local13 + Static492.anInt6134;
			Static631.anIntArray680[2] = local13;
			return true;
		}
	}
}
