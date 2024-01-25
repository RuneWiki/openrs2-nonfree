import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static226 {

	@OriginalMember(owner = "client!og", name = "n", descriptor = "I")
	public static int anInt4573;

	@OriginalMember(owner = "client!og", name = "q", descriptor = "Lclient!gi;")
	public static Class11_Sub4_Sub7 aClass11_Sub4_Sub7_3;

	@OriginalMember(owner = "client!og", name = "s", descriptor = "Z")
	public static boolean aBoolean305;

	@OriginalMember(owner = "client!og", name = "r", descriptor = "Lclient!bj;")
	public static final Class26 aClass26_44 = new Class26(8);

	@OriginalMember(owner = "client!og", name = "t", descriptor = "Z")
	public static boolean aBoolean306 = false;

	@OriginalMember(owner = "client!og", name = "a", descriptor = "([Ljava/lang/String;I[SBI)V")
	public static void method4026(@OriginalArg(0) String[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) short[] arg2, @OriginalArg(4) int arg3) {
		if (arg1 <= arg3) {
			return;
		}
		@Pc(18) int local18 = (arg3 + arg1) / 2;
		@Pc(20) int local20 = arg3;
		@Pc(24) String local24 = arg0[local18];
		arg0[local18] = arg0[arg1];
		arg0[arg1] = local24;
		@Pc(38) short local38 = arg2[local18];
		arg2[local18] = arg2[arg1];
		arg2[arg1] = local38;
		for (@Pc(50) int local50 = arg3; local50 < arg1; local50++) {
			if (local24 == null || arg0[local50] != null && (local50 & 0x1) > arg0[local50].compareTo(local24)) {
				@Pc(75) String local75 = arg0[local50];
				arg0[local50] = arg0[local20];
				arg0[local20] = local75;
				@Pc(89) short local89 = arg2[local50];
				arg2[local50] = arg2[local20];
				arg2[local20++] = local89;
			}
		}
		arg0[arg1] = arg0[local20];
		arg0[local20] = local24;
		arg2[arg1] = arg2[local20];
		arg2[local20] = local38;
		method4026(arg0, local20 - 1, arg2, arg3);
		method4026(arg0, arg1, arg2, local20 + 1);
	}

	@OriginalMember(owner = "client!og", name = "c", descriptor = "(I)V")
	public static void method4028() {
		if (Static75.aBoolean86) {
			return;
		}
		Static75.aBoolean86 = true;
		if (Static210.aBoolean290) {
			Static246.aFloat51 = (int) Static246.aFloat51 + 191 & 0xFFFFFF80;
		} else {
			Static209.aFloat44 += (24.0F - Static209.aFloat44) / 2.0F;
		}
		Static81.aBoolean92 = true;
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "([III)V")
	public static void method4029(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1) {
		for (@Pc(3) int local3 = 31; local3 > 0; local3--) {
			@Pc(9) int local9 = local3 * 36;
			for (@Pc(11) int local11 = 35; local11 > 0; local11--) {
				if (arg0[local11 + local9] == 0 && arg0[local9 + local11 - 1 - 36] != 0) {
					arg0[local9 + local11] = arg1;
				}
			}
		}
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(IIZII)V")
	public static void method4030(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		Static115.aLong76 = 0L;
		@Pc(13) int local13 = Static104.method1587();
		if (arg2 == 3 || local13 == 3) {
			arg1 = true;
		}
		if (!Static107.aClass129_4.method4987()) {
			arg1 = true;
		}
		Static32.method462(arg2, arg1, arg3, arg0, local13);
	}
}
