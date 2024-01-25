import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static248 {

	@OriginalMember(owner = "client!qn", name = "c", descriptor = "Lclient!bc;")
	public static final Class19 aClass19_2 = new Class19();

	@OriginalMember(owner = "client!qn", name = "e", descriptor = "I")
	public static int anInt26 = 2;

	@OriginalMember(owner = "client!qn", name = "f", descriptor = "Lclient!gq;")
	public static final Class88 aClass88_2 = new Class88(64);

	@OriginalMember(owner = "client!qn", name = "g", descriptor = "I")
	public static int anInt27 = 0;

	@OriginalMember(owner = "client!qn", name = "h", descriptor = "Z")
	public static boolean aBoolean4 = false;

	@OriginalMember(owner = "client!qn", name = "i", descriptor = "I")
	public static int anInt28 = -1;

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(BI)Lclient!ps;")
	public static Class163 method22(@OriginalArg(1) int arg0) {
		@Pc(14) int local14 = arg0 >> 16;
		@Pc(18) int local18 = arg0 & 0xFFFF;
		if (Static313.aClass163ArrayArray1[local14] == null || Static313.aClass163ArrayArray1[local14][local18] == null) {
			@Pc(32) boolean local32 = Static274.method4904(local14);
			if (!local32) {
				return null;
			}
		}
		return Static313.aClass163ArrayArray1[local14][local18];
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(Lclient!h;ILclient!ii;ILclient!ni;Lclient!fp;II)V")
	public static void method23(@OriginalArg(0) Class90 arg0, @OriginalArg(2) Class105 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class1_Sub29 arg3, @OriginalArg(5) Class74 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(15) int local15 = arg3.anInt4240 - arg2 / 2 - 5;
		@Pc(19) int local19 = arg5 + 2;
		if (arg4.anInt1751 != 0) {
			arg1.method4225(arg6 * arg0.method1717() + arg5 + 1 - local19, arg4.anInt1751, arg2 + 10, local15, local19);
		}
		if (arg4.anInt1733 != 0) {
			arg1.method4293(arg5 + arg0.method1717() * arg6 + 1 - local19, local15, arg2 + 10, arg4.anInt1733, local19);
		}
		@Pc(73) int local73 = arg4.anInt1723;
		if (arg3.aBoolean339 && arg4.anInt1754 != -1) {
			local73 = arg4.anInt1754;
		}
		for (@Pc(86) int local86 = 0; local86 < arg6; local86++) {
			@Pc(92) String local92 = Static200.aStringArray29[local86];
			if (local86 < arg6 - 1) {
				local92 = local92.substring(0, local92.length() - 4);
			}
			arg0.method1720(arg1, local92, arg3.anInt4240, arg5, local73);
			arg5 += arg0.method1717();
		}
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(II)I")
	public static int method24(@OriginalArg(0) int arg0) {
		return arg0 >>> 10;
	}
}
