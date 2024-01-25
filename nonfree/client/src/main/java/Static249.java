import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static249 {

	@OriginalMember(owner = "client!iv", name = "F", descriptor = "Lclient!vd;")
	public static Class353 aClass353_45;

	@OriginalMember(owner = "client!iv", name = "x", descriptor = "Lclient!qe;")
	public static final Class268 aClass268_79 = new Class268(80, 6);

	@OriginalMember(owner = "client!iv", name = "L", descriptor = "Lclient!qe;")
	public static final Class268 aClass268_80 = new Class268(8, 7);

	@OriginalMember(owner = "client!iv", name = "M", descriptor = "I")
	public static int anInt4972 = 0;

	@OriginalMember(owner = "client!iv", name = "c", descriptor = "(III)Z")
	public static boolean method4328(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x10) != 0;
	}

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "(BII)Z")
	public static boolean method4329(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static67.method1172(arg1, arg0) | (arg0 & 0x800) != 0 || Static420.method6612(arg0, arg1);
	}

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "([[BILclient!jda;)V")
	public static void method4331(@OriginalArg(0) byte[][] arg0, @OriginalArg(2) Class96_Sub1 arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg1.anInt5123; local3++) {
			Static54.method911();
			for (@Pc(9) int local9 = 0; local9 < Static442.anInt7975 >> 3; local9++) {
				for (@Pc(13) int local13 = 0; local13 < Static284.anInt7916 >> 3; local13++) {
					@Pc(23) int local23 = Static246.anIntArrayArrayArray2[local3][local9][local13];
					if (local23 != -1) {
						@Pc(33) int local33 = local23 >> 24 & 0x3;
						if (!arg1.aBoolean353 || local33 == 0) {
							@Pc(44) int local44 = local23 >> 1 & 0x3;
							@Pc(50) int local50 = local23 >> 14 & 0x3FF;
							@Pc(56) int local56 = local23 >> 3 & 0x7FF;
							@Pc(66) int local66 = local56 / 8 + (local50 / 8 << 8);
							for (@Pc(68) int local68 = 0; local68 < Static480.anIntArray523.length; local68++) {
								if (local66 == Static480.anIntArray523[local68] && arg0[local68] != null) {
									arg1.method4585(local9 * 8, local3, arg0[local68], local13 * 8, (local56 & 0x7) * 8, local33, local44, Static619.aClass319Array1, Static162.aClass100_7, (local50 & 0x7) * 8);
									break;
								}
							}
						}
					}
				}
			}
		}
	}
}
