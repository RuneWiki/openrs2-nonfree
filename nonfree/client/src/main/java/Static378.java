import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static378 {

	@OriginalMember(owner = "client!mq", name = "v", descriptor = "F")
	public static float aFloat153;

	@OriginalMember(owner = "client!mq", name = "z", descriptor = "I")
	public static int anInt6662;

	@OriginalMember(owner = "client!mq", name = "A", descriptor = "I")
	public static int anInt6663;

	@OriginalMember(owner = "client!mq", name = "w", descriptor = "Lclient!fja;")
	public static final Class126 aClass126_131 = new Class126(69, 0);

	@OriginalMember(owner = "client!mq", name = "y", descriptor = "Lclient!fja;")
	public static final Class126 aClass126_132 = new Class126(38, -1);

	@OriginalMember(owner = "client!mq", name = "C", descriptor = "Lclient!jia;")
	public static final Class193 aClass193_33 = new Class193();

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(IILclient!nf;Lclient!aa;BIILclient!kh;)V")
	public static void method5558(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class102 arg2, @OriginalArg(3) Class1 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class208 arg6) {
		if (arg2 == null) {
			return;
		}
		@Pc(16) int local16;
		if (anInt6662 == 4) {
			local16 = (int) Static204.aFloat82 & 0x3FFF;
		} else {
			local16 = (int) Static204.aFloat82 + Static56.anInt1426 & 0x3FFF;
		}
		@Pc(38) int local38 = Math.max(arg6.anInt5639 / 2, arg6.anInt5630 / 2) + 10;
		@Pc(47) int local47 = arg5 * arg5 + arg0 * arg0;
		if (local38 * local38 < local47) {
			return;
		}
		@Pc(61) int local61 = Class3_Sub7_Sub2.anIntArray171[local16];
		@Pc(65) int local65 = Class3_Sub7_Sub2.anIntArray170[local16];
		if (anInt6662 != 4) {
			local65 = local65 * 256 / (Static433.anInt7606 + 256);
			local61 = local61 * 256 / (Static433.anInt7606 + 256);
		}
		@Pc(101) int local101 = arg5 * local65 + local61 * arg0 >> 14;
		@Pc(112) int local112 = arg0 * local65 - local61 * arg5 >> 14;
		arg2.method6966(arg1 + arg6.anInt5639 / 2 + local101 - arg2.method6951() / 2, -local112 + arg4 + arg6.anInt5630 / 2 + -(arg2.method6958() / 2), arg3, arg1, arg4);
	}
}
