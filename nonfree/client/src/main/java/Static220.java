import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static220 {

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(Lclient!ah;IIZLclient!ch;II)V")
	public static void method3531(@OriginalArg(0) Class6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class1_Sub1_Sub6 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg3 == null) {
			return;
		}
		@Pc(12) int local12 = Static12.anInt352 + Static31.anInt799 & 0x7FF;
		@Pc(24) int local24 = Math.max(arg0.anInt251 / 2, arg0.anInt221 / 2) + 10;
		@Pc(32) int local32 = arg4 * arg4 + arg2 * arg2;
		if (local32 > local24 * local24) {
			return;
		}
		@Pc(46) int local46 = Class46.anIntArray226[local12];
		@Pc(50) int local50 = Class46.anIntArray225[local12];
		@Pc(58) int local58 = local50 * 256 / (Static154.anInt3449 + 256);
		@Pc(66) int local66 = local46 * 256 / (Static154.anInt3449 + 256);
		@Pc(81) int local81 = arg2 * local58 - arg4 * local66 >> 16;
		@Pc(91) int local91 = local58 * arg4 + arg2 * local66 >> 16;
		((Class1_Sub1_Sub6_Sub1) arg3).method2176(arg5 + arg0.anInt251 / 2 + local91 - arg3.anInt2843 / 2, -(arg3.anInt2835 / 2) + arg0.anInt221 / 2 + arg1 + -local81, arg0.anIntArray35, arg0.anIntArray33);
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(Z)V")
	public static void method3532() {
		Static37.aClass1_Sub7_Sub3_2.method3404();
		Static186.anInt3973 = 1;
		Static190.aClass7_35 = null;
	}
}
