import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static283 {

	@OriginalMember(owner = "client!of", name = "c", descriptor = "Lclient!uf;")
	public static final Class237 aClass237_86 = new Class237(21, 2);

	@OriginalMember(owner = "client!of", name = "f", descriptor = "S")
	public static short aShort54 = 256;

	@OriginalMember(owner = "client!of", name = "g", descriptor = "I")
	public static int anInt4985 = 0;

	@OriginalMember(owner = "client!of", name = "h", descriptor = "F")
	public static float aFloat79 = 1.0F;

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method4036(@OriginalArg(1) String arg0) {
		if (Static413.aClass254Array27 != null) {
			Static55.method989(Static439.aClass131_190);
			Static232.aClass1_Sub1_Sub1_2.method4115(Static43.method4229(arg0));
			Static232.aClass1_Sub1_Sub1_2.method4104(arg0);
		}
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(ILclient!ls;IIILclient!tr;Lclient!qa;Lclient!rs;)V")
	public static void method4038(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub28 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Class231 arg4, @OriginalArg(6) Class109 arg5, @OriginalArg(7) Class207 arg6) {
		@Pc(14) int local14 = arg1.anInt4273 - arg2 / 2 - 5;
		@Pc(18) int local18 = arg3 + 2;
		if (arg4.anInt6829 != 0) {
			arg5.method4743(local14, arg4.anInt6829, local18, arg3 + arg0 * arg6.method4889() + 1 - local18, arg2 + 10);
		}
		if (arg4.anInt6834 != 0) {
			arg5.method4723(arg4.anInt6834, arg6.method4889() * arg0 + arg3 + 1 - local18, local14, local18, arg2 + 10);
		}
		@Pc(70) int local70 = arg4.anInt6853;
		if (arg1.aBoolean284 && arg4.anInt6855 != -1) {
			local70 = arg4.anInt6855;
		}
		for (@Pc(86) int local86 = 0; local86 < arg0; local86++) {
			@Pc(92) String local92 = Static387.aStringArray51[local86];
			if (arg0 - 1 > local86) {
				local92 = local92.substring(0, local92.length() - 4);
			}
			arg6.method4886(arg5, local92, arg1.anInt4273, arg3, local70);
			arg3 += arg6.method4889();
		}
	}
}
