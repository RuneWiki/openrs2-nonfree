import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static266 {

	@OriginalMember(owner = "client!pj", name = "i", descriptor = "I")
	public static int anInt5034;

	@OriginalMember(owner = "client!pj", name = "j", descriptor = "I")
	public static int anInt5035;

	@OriginalMember(owner = "client!pj", name = "t", descriptor = "Lclient!eg;")
	public static Interface3 anInterface3_6;

	@OriginalMember(owner = "client!pj", name = "v", descriptor = "[Lclient!pi;")
	public static Class35_Sub1[] aClass35_Sub1Array2;

	@OriginalMember(owner = "client!pj", name = "r", descriptor = "[I")
	public static final int[] anIntArray409 = new int[] { 1, 0, -1, 0 };

	@OriginalMember(owner = "client!pj", name = "u", descriptor = "[B")
	public static final byte[] aByteArray75 = new byte[520];

	@OriginalMember(owner = "client!pj", name = "D", descriptor = "I")
	public static int anInt5047 = 2;

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(III)Lclient!va;")
	public static Class1_Sub1 method4518(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class188 local7 = Static45.aClass188ArrayArrayArray5[arg0][arg1][arg2];
		return local7 == null || local7.aClass1_Sub1_2 == null ? null : local7.aClass1_Sub1_2;
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(ZIBIZ)I")
	public static int method4522(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) boolean arg2) {
		@Pc(10) Class2_Sub32 local10 = Static76.method1317(false, arg0);
		if (local10 == null) {
			return 0;
		}
		@Pc(16) int local16 = 0;
		for (@Pc(23) int local23 = 0; local23 < local10.anIntArray470.length; local23++) {
			if (local10.anIntArray470[local23] >= 0 && local10.anIntArray470[local23] < Static57.aClass196_1.anInt5461) {
				@Pc(52) Class152 local52 = Static57.aClass196_1.method4827(local10.anIntArray470[local23]);
				@Pc(62) int local62 = local52.method3845(arg1, Static57.aClass79_1.method1851(arg1).anInt369);
				if (arg2) {
					local16 += local62 * local10.anIntArray471[local23];
				} else {
					local16 += local62;
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
	public static String method4525(@OriginalArg(1) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(11) char[] local11 = new char[local8];
		@Pc(13) byte local13 = 2;
		for (@Pc(15) int local15 = 0; local15 < local8; local15++) {
			@Pc(21) char local21 = arg0.charAt(local15);
			if (local13 == 0) {
				local21 = Character.toLowerCase(local21);
			} else if (local13 == 2 || Character.isUpperCase(local21)) {
				local21 = Static249.method4334(local21);
			}
			if (Character.isLetter(local21)) {
				local13 = 0;
			} else if (local21 == '.' || local21 == '?' || local21 == '!') {
				local13 = 2;
			} else if (!Character.isSpaceChar(local21)) {
				local13 = 1;
			} else if (local13 != 2) {
				local13 = 1;
			}
			local11[local15] = local21;
		}
		return new String(local11);
	}
}
