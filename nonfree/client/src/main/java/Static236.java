import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static236 {

	@OriginalMember(owner = "client!lh", name = "m", descriptor = "[I")
	public static int[] anIntArray248;

	@OriginalMember(owner = "client!lh", name = "r", descriptor = "I")
	public static int anInt3873;

	@OriginalMember(owner = "client!lh", name = "k", descriptor = "Lclient!pn;")
	public static final Class194 aClass194_65 = new Class194(76, 4);

	@OriginalMember(owner = "client!lh", name = "q", descriptor = "I")
	public static int anInt3872 = -1;

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(Lclient!wl;B)V")
	public static void method3054(@OriginalArg(0) Class2_Sub1_Sub3 arg0) {
		@Pc(13) boolean local13 = false;
		if (arg0.anInt6144 == Static85.anInt1536 || arg0.anInt6193 == -1 || arg0.anInt6147 != 0) {
			local13 = true;
		} else {
			@Pc(38) Class143 local38 = Static271.aClass219_4.method4752(arg0.anInt6193);
			if (local38.aBoolean245 || arg0.anInt6143 + 1 > local38.anIntArray239[arg0.anInt6117]) {
				local13 = true;
			}
		}
		if (local13) {
			@Pc(62) int local62 = arg0.anInt6144 - arg0.anInt6148;
			@Pc(68) int local68 = Static85.anInt1536 - arg0.anInt6148;
			@Pc(80) int local80 = arg0.anInt6129 * 128 + arg0.method4913() * 64;
			@Pc(91) int local91 = arg0.anInt6169 * 128 + arg0.method4913() * 64;
			@Pc(103) int local103 = arg0.anInt6179 * 128 + arg0.method4913() * 64;
			@Pc(115) int local115 = arg0.anInt6167 * 128 + arg0.method4913() * 64;
			arg0.anInt7502 = (local68 * local115 + local91 * (local62 - local68)) / local62;
			arg0.anInt7500 = (local68 * local103 + local80 * (local62 - local68)) / local62;
		}
		arg0.anInt6197 = 0;
		if (arg0.anInt6172 == 0) {
			arg0.method4909(8192, false);
		}
		if (arg0.anInt6172 == 1) {
			arg0.method4909(12288, false);
		}
		if (arg0.anInt6172 == 2) {
			arg0.method4909(0, false);
		}
		if (arg0.anInt6172 == 3) {
			arg0.method4909(4096, false);
		}
	}
}
