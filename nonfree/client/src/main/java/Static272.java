import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static272 {

	@OriginalMember(owner = "client!le", name = "F", descriptor = "Lclient!qu;")
	public static final Class243 aClass243_57 = new Class243(51, 4);

	@OriginalMember(owner = "client!le", name = "V", descriptor = "[[I")
	public static final int[][] anIntArrayArray53 = new int[][] { { 0, 1, 2, 3 }, { 1, -1, -1, 0 }, { -1, 2, -1, 0 }, { -1, 0, -1, 2 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 3, 4, -1 }, { -1, 0, 2, -1 }, { -1, -1, 2, 0 }, { 0, 2, 5, 3 }, { 0, -1, 6, -1 }, { 0, 1, 2, 3 } };

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(IIILclient!laa;Lclient!laa;)V")
	public static void method4333(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class1_Sub2 arg3, @OriginalArg(4) Class1_Sub2 arg4) {
		@Pc(4) Class262 local4 = Static519.method7540(arg0, arg1, arg2);
		if (local4 != null) {
			local4.aClass1_Sub2_3 = arg3;
			local4.aClass1_Sub2_2 = arg4;
		}
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(IIIZ)Ljava/lang/String;")
	public static String method4336(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			return Integer.toString(arg0, 10);
		}
		@Pc(39) int local39 = 2;
		@Pc(43) int local43 = arg0 / 10;
		while (local43 != 0) {
			local43 /= 10;
			local39++;
		}
		@Pc(58) char[] local58 = new char[local39];
		local58[0] = '+';
		for (@Pc(66) int local66 = local39 - 1; local66 > 0; local66--) {
			@Pc(70) int local70 = arg0;
			arg0 /= 10;
			@Pc(81) int local81 = local70 - arg0 * 10;
			if (local81 < 10) {
				local58[local66] = (char) (local81 + 48);
			} else {
				local58[local66] = (char) (local81 + 87);
			}
		}
		return new String(local58);
	}
}
