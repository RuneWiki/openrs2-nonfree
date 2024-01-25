import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static270 {

	@OriginalMember(owner = "client!jb", name = "N", descriptor = "Lclient!qd;")
	public static Class299 aClass299_1;

	@OriginalMember(owner = "client!jb", name = "P", descriptor = "D")
	public static double aDouble17;

	@OriginalMember(owner = "client!jb", name = "M", descriptor = "Lclient!tja;")
	public static final Class352 aClass352_38 = new Class352(10);

	@OriginalMember(owner = "client!jb", name = "O", descriptor = "I")
	public static int anInt4357 = -1;

	@OriginalMember(owner = "client!jb", name = "d", descriptor = "(Z)V")
	public static void method3888() {
		if (Static656.anInt10356 == 3) {
			Static53.method1256(4);
		} else if (Static656.anInt10356 == 7) {
			Static53.method1256(8);
		} else if (Static656.anInt10356 == 10) {
			Static53.method1256(11);
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(IZII)Ljava/lang/String;")
	public static String method3889(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1) {
		if (!arg0 || arg1 < 0) {
			return Integer.toString(arg1, 10);
		}
		@Pc(39) int local39 = 2;
		@Pc(43) int local43 = arg1 / 10;
		while (local43 != 0) {
			local43 /= 10;
			local39++;
		}
		@Pc(58) char[] local58 = new char[local39];
		local58[0] = '+';
		for (@Pc(66) int local66 = local39 - 1; local66 > 0; local66--) {
			@Pc(70) int local70 = arg1;
			arg1 /= 10;
			@Pc(81) int local81 = local70 - arg1 * 10;
			if (local81 < 10) {
				local58[local66] = (char) (local81 + 48);
			} else {
				local58[local66] = (char) (local81 + 87);
			}
		}
		return new String(local58);
	}
}
