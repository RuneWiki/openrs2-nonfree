import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static324 {

	@OriginalMember(owner = "client!mh", name = "f", descriptor = "Z")
	public static boolean aBoolean435;

	@OriginalMember(owner = "client!mh", name = "c", descriptor = "Lclient!vh;")
	public static final Class344 aClass344_52 = new Class344(55, 6);

	@OriginalMember(owner = "client!mh", name = "d", descriptor = "Lclient!vh;")
	public static final Class344 aClass344_53 = new Class344(81, 2);

	@OriginalMember(owner = "client!mh", name = "e", descriptor = "I")
	public static int anInt6377 = 0;

	@OriginalMember(owner = "client!mh", name = "g", descriptor = "Lclient!gca;")
	public static final Class119 aClass119_4 = new Class119();

	@OriginalMember(owner = "client!mh", name = "h", descriptor = "I")
	public static int anInt6378 = 503;

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(IIIIIII)V")
	public static void method5021(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3) {
		@Pc(15) Class292[] local15 = Static553.aClass292Array1;
		for (@Pc(17) int local17 = 0; local17 < local15.length; local17++) {
			@Pc(23) Class292 local23 = local15[local17];
			if (local23 != null && local23.anInt8837 == 2) {
				Static46.method1131(local23.anInt8831 * 2, local23.anInt8833, local23.anInt8829, arg3 >> 1, arg2 >> 1, local23.anInt8828);
				if (Static509.anIntArray540[0] > -1 && Static306.anInt6122 % 20 < 10) {
					Static50.aClass88Array1[local23.anInt8830].method8051(arg1 + Static509.anIntArray540[0] - 12, arg0 + Static509.anIntArray540[1] + -28);
				}
			}
		}
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(II)Z")
	public static boolean method5022(@OriginalArg(0) int arg0) {
		if (arg0 == 12 || arg0 == 30 || arg0 == 50 || arg0 == 22 || arg0 == 1003) {
			return true;
		} else {
			return arg0 == 57 || arg0 == 1008;
		}
	}
}
