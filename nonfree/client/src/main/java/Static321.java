import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static321 {

	@OriginalMember(owner = "client!mea", name = "e", descriptor = "[I")
	public static int[] anIntArray448;

	@OriginalMember(owner = "client!mea", name = "i", descriptor = "I")
	public static int anInt5796;

	@OriginalMember(owner = "client!mea", name = "a", descriptor = "I")
	public static int anInt5791 = 0;

	@OriginalMember(owner = "client!mea", name = "c", descriptor = "[I")
	public static final int[] anIntArray447 = new int[1];

	@OriginalMember(owner = "client!mea", name = "f", descriptor = "I")
	public static int anInt5794 = -1;

	@OriginalMember(owner = "client!mea", name = "a", descriptor = "(ILclient!pl;B)V")
	public static void method4999(@OriginalArg(0) int arg0, @OriginalArg(1) Class9_Sub1_Sub1_Sub2 arg1) {
		@Pc(11) int local11 = -1;
		@Pc(13) int local13 = 0;
		if (Static305.anInt5560 < arg1.anInt6430) {
			Static80.method7512(arg1);
		} else if (Static305.anInt5560 <= arg1.anInt6421) {
			Static31.method564(arg1);
		} else {
			Static316.method7579(false, arg1);
			local13 = Static203.anInt4110;
			local11 = Static582.anInt9300;
		}
		if (arg1.anInt8975 < 512 || arg1.anInt8980 < 512 || Static400.anInt6818 * 512 - 512 <= arg1.anInt8975 || arg1.anInt8980 >= Static271.anInt5050 * 512 - 512) {
			arg1.anIntArray515 = null;
			arg1.anInt6430 = 0;
			arg1.anInt6453 = -1;
			arg1.anInt6421 = 0;
			arg1.anInt6384 = -1;
			local13 = 0;
			arg1.anInt6424 = -1;
			local11 = -1;
			arg1.anInt8975 = arg1.anIntArray518[0] * 512 + arg1.method5569() * 256;
			arg1.anInt8980 = arg1.anIntArray517[0] * 512 + arg1.method5569() * 256;
			arg1.method5572();
		}
		if (Static226.aClass9_Sub1_Sub1_Sub2_Sub2_2 == arg1 && (arg1.anInt8975 < 6144 || arg1.anInt8980 < 6144 || arg1.anInt8975 >= (Static400.anInt6818 - 12) * 512 || arg1.anInt8980 >= (Static271.anInt5050 - 12) * 512)) {
			arg1.anInt6421 = 0;
			arg1.anInt6430 = 0;
			arg1.anIntArray515 = null;
			arg1.anInt6384 = -1;
			local13 = 0;
			local11 = -1;
			arg1.anInt6424 = -1;
			arg1.anInt6453 = -1;
			arg1.anInt8975 = arg1.anIntArray518[0] * 512 + arg1.method5569() * 256;
			arg1.anInt8980 = arg1.anIntArray517[0] * 512 + arg1.method5569() * 256;
			arg1.method5572();
		}
		@Pc(220) int local220 = Static550.method6448(arg1);
		Static32.method566(arg1, local13, local220, local11);
		Static217.method3785(local11, arg1);
		Static408.method5902(arg1);
	}

	@OriginalMember(owner = "client!mea", name = "a", descriptor = "(BII)Z")
	public static boolean method5001(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x8000) != 0;
	}

	@OriginalMember(owner = "client!mea", name = "a", descriptor = "(Lclient!an;B)V")
	public static void method5002(@OriginalArg(0) Class9_Sub1_Sub1_Sub2_Sub1 arg0) {
		for (@Pc(16) Class3_Sub17 local16 = (Class3_Sub17) Static312.aClass130_37.method3543(); local16 != null; local16 = (Class3_Sub17) Static312.aClass130_37.method3551()) {
			if (local16.aClass9_Sub1_Sub1_Sub2_Sub1_1 == arg0) {
				if (local16.aClass3_Sub6_Sub2_2 != null) {
					Static164.aClass3_Sub6_Sub1_1.method291(local16.aClass3_Sub6_Sub2_2);
					local16.aClass3_Sub6_Sub2_2 = null;
				}
				local16.method7812();
				return;
			}
		}
	}
}
