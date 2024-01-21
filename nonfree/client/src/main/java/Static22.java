import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static22 {

	@OriginalMember(owner = "client!ce", name = "P", descriptor = "[I")
	public static int[] anIntArray152;

	@OriginalMember(owner = "client!ce", name = "db", descriptor = "Lclient!ah;")
	public static Class7 aClass7_14;

	@OriginalMember(owner = "client!ce", name = "X", descriptor = "Lclient!eh;")
	private static Class28 aClass28_243 = Static170.method3101(" ");

	@OriginalMember(owner = "client!ce", name = "H", descriptor = "Lclient!eh;")
	public static Class28 aClass28_242 = aClass28_243;

	@OriginalMember(owner = "client!ce", name = "I", descriptor = "I")
	public static int anInt588 = 2;

	@OriginalMember(owner = "client!ce", name = "M", descriptor = "I")
	public static int anInt590 = 0;

	@OriginalMember(owner = "client!ce", name = "bb", descriptor = "I")
	public static int anInt598 = 0;

	@OriginalMember(owner = "client!ce", name = "cb", descriptor = "Lclient!gf;")
	public static Class33 aClass33_2 = null;

	@OriginalMember(owner = "client!ce", name = "fb", descriptor = "Lclient!eh;")
	public static Class28 aClass28_244 = Static170.method3101("(U");

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(B)V")
	public static void method607() {
		aClass33_2 = null;
		aClass28_242 = null;
		aClass28_243 = null;
		anIntArray152 = null;
		aClass7_14 = null;
		aClass28_244 = null;
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(III[S[Lclient!eh;)V")
	public static void method609(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) short[] arg2, @OriginalArg(4) Class28[] arg3) {
		if (arg0 >= arg1) {
			return;
		}
		@Pc(13) int local13 = arg0;
		@Pc(20) int local20 = (arg0 + arg1) / 2;
		@Pc(24) Class28 local24 = arg3[local20];
		arg3[local20] = arg3[arg1];
		arg3[arg1] = local24;
		@Pc(38) short local38 = arg2[local20];
		arg2[local20] = arg2[arg1];
		arg2[arg1] = local38;
		for (@Pc(50) int local50 = arg0; local50 < arg1; local50++) {
			if (local24 == null || arg3[local50] != null && arg3[local50].method921(local24) < (local50 & 0x1)) {
				@Pc(75) Class28 local75 = arg3[local50];
				arg3[local50] = arg3[local13];
				arg3[local13] = local75;
				@Pc(89) short local89 = arg2[local50];
				arg2[local50] = arg2[local13];
				arg2[local13++] = local89;
			}
		}
		arg3[arg1] = arg3[local13];
		arg3[local13] = local24;
		arg2[arg1] = arg2[local13];
		arg2[local13] = local38;
		method609(arg0, local13 - 1, arg2, arg3);
		method609(local13 + 1, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(IJ)V")
	public static void method613(@OriginalArg(1) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		for (@Pc(21) int local21 = 0; local21 < Static66.anInt2068; local21++) {
			if (Static26.aLongArray4[local21] == arg0) {
				Static66.anInt2068--;
				for (@Pc(38) int local38 = local21; local38 < Static66.anInt2068; local38++) {
					Static37.aClass28Array4[local38] = Static37.aClass28Array4[local38 + 1];
					Static114.anIntArray509[local38] = Static114.anIntArray509[local38 + 1];
					Static26.aLongArray4[local38] = Static26.aLongArray4[local38 + 1];
					Static165.anIntArray669[local38] = Static165.anIntArray669[local38 + 1];
				}
				Static31.anInt968 = Static90.anInt2570;
				Static51.aClass3_Sub8_Sub1_2.method1559(202);
				Static51.aClass3_Sub8_Sub1_2.method1541(arg0);
				return;
			}
		}
	}
}
