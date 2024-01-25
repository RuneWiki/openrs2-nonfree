import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static227 {

	@OriginalMember(owner = "client!hk", name = "he", descriptor = "Lclient!eka;")
	public static Class3_Sub15 aClass3_Sub15_11;

	@OriginalMember(owner = "client!hk", name = "qe", descriptor = "I")
	public static int anInt4358;

	@OriginalMember(owner = "client!hk", name = "te", descriptor = "F")
	public static float aFloat85;

	@OriginalMember(owner = "client!hk", name = "N", descriptor = "[I")
	public static final int[] anIntArray286 = new int[6];

	@OriginalMember(owner = "client!hk", name = "Wc", descriptor = "Lclient!ui;")
	public static Class358 aClass358_1 = new Class358();

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(CI)Z")
	public static boolean method3626(@OriginalArg(0) char arg0) {
		return arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(BLclient!gn;Lclient!fca;)Lclient!uga;")
	public static Class356 method3652(@OriginalArg(1) Class146 arg0, @OriginalArg(2) Class3_Sub17 arg1) {
		@Pc(10) Class356 local10 = new Class356(arg0);
		@Pc(21) int local21 = arg1.method4888();
		@Pc(32) boolean local32 = (local21 & 0x1) != 0;
		@Pc(40) boolean local40 = (local21 & 0x2) != 0;
		@Pc(51) boolean local51 = (local21 & 0x4) != 0;
		@Pc(62) boolean local62 = (local21 & 0x8) != 0;
		if (local32) {
			local10.anIntArray618[0] = arg1.method4858();
			local10.anIntArray617[0] = arg1.method4858();
			if (arg0.anInt3719 != -1 || arg0.anInt3672 != -1) {
				local10.anIntArray618[1] = arg1.method4858();
				local10.anIntArray617[1] = arg1.method4858();
			}
			if (arg0.anInt3721 != -1 || arg0.anInt3716 != -1) {
				local10.anIntArray618[2] = arg1.method4858();
				local10.anIntArray617[2] = arg1.method4858();
			}
		}
		if (local40) {
			local10.anIntArray616[0] = arg1.method4858();
			local10.anIntArray619[0] = arg1.method4858();
			if (arg0.anInt3678 != -1 || arg0.anInt3679 != -1) {
				local10.anIntArray616[1] = arg1.method4858();
				local10.anIntArray619[1] = arg1.method4858();
			}
		}
		@Pc(169) int local169;
		@Pc(172) int[] local172;
		@Pc(204) int local204;
		if (local51) {
			local169 = arg1.method4858();
			local172 = new int[] { local169 & 0xF, local169 >> 4 & 0xF, local169 >> 8 & 0xF, (local169 & 0xFE93) >> 12 };
			for (local204 = 0; local204 < 4; local204++) {
				if (local172[local204] != 15) {
					local10.aShortArray175[local172[local204]] = (short) arg1.method4858();
				}
			}
		}
		if (local62) {
			local169 = arg1.method4888();
			local172 = new int[] { local169 & 0xF, local169 >> 4 & 0xF };
			for (local204 = 0; local204 < 2; local204++) {
				if (local172[local204] != 15) {
					local10.aShortArray176[local172[local204]] = (short) arg1.method4858();
				}
			}
		}
		return local10;
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(BLclient!fca;)Lclient!dl;")
	public static Class84 method3653(@OriginalArg(1) Class3_Sub17 arg0) {
		@Pc(10) Class92 local10 = Static146.method2531()[arg0.method4888()];
		@Pc(17) Class65 local17 = Static657.method8561()[arg0.method4888()];
		@Pc(21) int local21 = arg0.method4869();
		@Pc(25) int local25 = arg0.method4869();
		@Pc(29) int local29 = arg0.method4858();
		@Pc(33) int local33 = arg0.method4858();
		@Pc(37) int local37 = arg0.method4869();
		@Pc(41) int local41 = arg0.method4868();
		@Pc(45) int local45 = arg0.method4868();
		return new Class84(local10, local17, local21, local25, local29, local33, local37, local41, local45);
	}
}
