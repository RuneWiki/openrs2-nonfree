import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static2 {

	@OriginalMember(owner = "client!aa", name = "F", descriptor = "I")
	public static int anInt4174 = 0;

	@OriginalMember(owner = "client!aa", name = "H", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_1151 = Static158.method3034(" )2> <col=00ffff>");

	@OriginalMember(owner = "client!aa", name = "K", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_1152 = Static158.method3034("document)3cookie=(R");

	@OriginalMember(owner = "client!aa", name = "M", descriptor = "I")
	public static int anInt4179 = 0;

	@OriginalMember(owner = "client!aa", name = "N", descriptor = "I")
	public static int anInt4180 = (int) (Math.random() * 33.0D) - 16;

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(BI)I")
	public static int method3174(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(BIILclient!fc;II)V")
	public static void method3175(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class2_Sub1_Sub9 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) Class2_Sub19 local7 = new Class2_Sub19();
		local7.anInt3839 = arg2.anInt1676 * 128;
		local7.anIntArray422 = arg2.anIntArray165;
		local7.anInt3842 = arg2.anInt1680;
		local7.anInt3834 = arg1;
		local7.anInt3841 = arg4 * 128;
		local7.anInt3845 = arg0 * 128;
		local7.anInt3835 = arg2.anInt1684;
		local7.anInt3838 = arg2.anInt1672;
		@Pc(50) int local50 = arg2.anInt1688;
		@Pc(53) int local53 = arg2.anInt1683;
		if (arg3 == 1 || arg3 == 3) {
			local50 = arg2.anInt1683;
			local53 = arg2.anInt1688;
		}
		local7.anInt3840 = (local50 + arg4) * 128;
		local7.anInt3833 = (arg0 + local53) * 128;
		if (arg2.anIntArray162 != null) {
			local7.aClass2_Sub1_Sub9_1 = arg2;
			local7.method2957();
		}
		Static184.aClass67_12.method2843(local7);
		if (local7.anIntArray422 != null) {
			local7.anInt3843 = local7.anInt3842 + (int) (Math.random() * (double) (local7.anInt3838 - local7.anInt3842));
		}
	}
}
