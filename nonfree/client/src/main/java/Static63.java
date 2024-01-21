import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static63 {

	@OriginalMember(owner = "client!ia", name = "Z", descriptor = "I")
	public static final int anInt1932 = 7759444;

	@OriginalMember(owner = "client!ia", name = "bb", descriptor = "Lclient!eh;")
	public static Class28 aClass28_580 = Static170.method3101("p12_full");

	@OriginalMember(owner = "client!ia", name = "cb", descriptor = "Lclient!eh;")
	public static Class28 aClass28_581 = Static170.method3101("Um ein neues Spielkonto zu erstellen)1 m-Ussen Sie");

	@OriginalMember(owner = "client!ia", name = "fb", descriptor = "Lclient!pa;")
	public static Class63 aClass63_9 = new Class63(64);

	@OriginalMember(owner = "client!ia", name = "gb", descriptor = "I")
	public static int anInt1936 = 0;

	@OriginalMember(owner = "client!ia", name = "hb", descriptor = "Lclient!eh;")
	public static Class28 aClass28_582 = Static170.method3101("Abbrechen");

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(Lclient!eh;I)Z")
	public static boolean method1491(@OriginalArg(0) Class28 arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(18) int local18 = 0; local18 < Static66.anInt2068; local18++) {
			if (arg0.method936(Static37.aClass28Array4[local18])) {
				return true;
			}
		}
		return arg0.method936(Static107.aClass3_Sub2_Sub1_Sub2_Sub1_1.aClass28_296);
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(IB[Lclient!eh;I)Lclient!eh;")
	public static Class28 method1492(@OriginalArg(0) int arg0, @OriginalArg(2) Class28[] arg1, @OriginalArg(3) int arg2) {
		@Pc(5) int local5 = 0;
		for (@Pc(7) int local7 = 0; local7 < arg2; local7++) {
			if (arg1[local7 + arg0] == null) {
				arg1[local7 + arg0] = Static51.aClass28_442;
			}
			local5 += arg1[local7 + arg0].anInt1118;
		}
		@Pc(35) int local35 = 0;
		@Pc(38) byte[] local38 = new byte[local5];
		@Pc(55) Class28 local55;
		for (@Pc(48) int local48 = 0; local48 < arg2; local48++) {
			local55 = arg1[local48 + arg0];
			Static188.method2240(local55.aByteArray15, 0, local38, local35, local55.anInt1118);
			local35 += local55.anInt1118;
		}
		local55 = new Class28();
		local55.aByteArray15 = local38;
		local55.anInt1118 = local5;
		return local55;
	}

	@OriginalMember(owner = "client!ia", name = "f", descriptor = "(I)V")
	public static void method1493() {
		aClass28_582 = null;
		aClass63_9 = null;
		aClass28_580 = null;
		aClass28_581 = null;
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(IIIIILclient!kb;IJZ)Z")
	public static boolean method1494(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class3_Sub2_Sub1 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) long arg7, @OriginalArg(8) boolean arg8) {
		if (arg5 == null) {
			return true;
		}
		@Pc(7) int local7 = arg1 - arg4;
		@Pc(11) int local11 = arg2 - arg4;
		@Pc(15) int local15 = arg1 + arg4;
		@Pc(19) int local19 = arg2 + arg4;
		if (arg8) {
			if (arg6 > 640 && arg6 < 1408) {
				local19 += 128;
			}
			if (arg6 > 1152 && arg6 < 1920) {
				local15 += 128;
			}
			if (arg6 > 1664 || arg6 < 384) {
				local11 -= 128;
			}
			if (arg6 > 128 && arg6 < 896) {
				local7 -= 128;
			}
		}
		local7 /= 128;
		local11 /= 128;
		local15 /= 128;
		local19 /= 128;
		return Static92.method3173(arg0, local7, local11, local15 + 1 - local7, local19 - local11 + 1, arg1, arg2, arg3, arg5, arg6, true, arg7);
	}
}
