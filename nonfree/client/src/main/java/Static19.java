import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static19 {

	@OriginalMember(owner = "client!bd", name = "Q", descriptor = "Lclient!pk;")
	public static Class132 aClass132_5;

	@OriginalMember(owner = "client!bd", name = "R", descriptor = "I")
	public static int anInt518;

	@OriginalMember(owner = "client!bd", name = "W", descriptor = "I")
	public static int anInt523;

	@OriginalMember(owner = "client!bd", name = "X", descriptor = "[I")
	public static int[] anIntArray36;

	@OriginalMember(owner = "client!bd", name = "N", descriptor = "[I")
	public static int[] anIntArray35 = new int[] { 1, 1, 1, 1, 4, 1, 1, 5, 6, 1, 5, 0, 7, 0, 4, 1, 7, 2, 1, 1, 6, 1, 1, 3, 6, 1, 7, 0, 0, 6, 7, 0, 1, 7, 6, 1, 1, 1, 5, 4, 3, 2, 1, 1, 0, 4, 1, 5 };

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(II[III)V")
	public static void method343(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3) {
		arg0--;
		@Pc(9) int local9 = arg3 - 1;
		@Pc(13) int local13 = local9 - 7;
		while (local13 > arg0) {
			@Pc(22) int local22 = arg0 + 1;
			arg2[local22] = arg1;
			@Pc(27) int local27 = local22 + 1;
			arg2[local27] = arg1;
			@Pc(32) int local32 = local27 + 1;
			arg2[local32] = arg1;
			@Pc(37) int local37 = local32 + 1;
			arg2[local37] = arg1;
			@Pc(42) int local42 = local37 + 1;
			arg2[local42] = arg1;
			@Pc(47) int local47 = local42 + 1;
			arg2[local47] = arg1;
			@Pc(52) int local52 = local47 + 1;
			arg2[local52] = arg1;
			arg0 = local52 + 1;
			arg2[arg0] = arg1;
		}
		while (local9 > arg0) {
			arg0++;
			arg2[arg0] = arg1;
		}
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
	public static String method344(@OriginalArg(1) String arg0) {
		@Pc(7) String local7 = Static121.method1945(Static31.method513(arg0));
		if (local7 == null) {
			local7 = "";
		}
		return local7;
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "([BI)Lclient!jj;")
	public static Class8_Sub1_Sub5_Sub2 method345(@OriginalArg(0) byte[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(26) Class8_Sub1_Sub5_Sub2 local26 = new Class8_Sub1_Sub5_Sub2(arg0, Static25.anIntArray45, Static225.anIntArray345, Static92.anIntArray130, Static135.anIntArray225, Static232.aByteArrayArray15);
			Static147.method2386();
			return local26;
		}
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(II)V")
	public static void method346(@OriginalArg(1) int arg0) {
		@Pc(14) Class8_Sub1_Sub6 local14 = Static181.method2779(12, arg0);
		local14.method929();
	}
}
