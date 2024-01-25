import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static121 {

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "J")
	public static long aLong190;

	@OriginalMember(owner = "client!ho", name = "c", descriptor = "Lclient!dp;")
	public static Class53 aClass53_138;

	@OriginalMember(owner = "client!ho", name = "d", descriptor = "[Lclient!os;")
	public static final Class98_Sub1[] aClass98_Sub1Array3 = new Class98_Sub1[29];

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(Lclient!br;III)V")
	public static void method5165(@OriginalArg(0) Class25 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) int local7 = Static174.anIntArrayArrayArray4[arg1][arg2][arg3];
		@Pc(9) int local9 = 0;
		arg0.anInt4728 = 0;
		@Pc(19) int local19;
		while (local9 <= 24) {
			local19 = local7 >> local9 & 0xFF;
			if (local19 <= 0) {
				break;
			}
			arg0.aClass6_Sub17_Sub1Array5[arg0.anInt4728++] = Static240.aClass6_Sub17_Sub1Array4[local19 - 1];
			local9 += 8;
		}
		for (local19 = arg0.anInt4728; local19 < 4; local19++) {
			arg0.aClass6_Sub17_Sub1Array5[local19] = null;
		}
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(IILjava/lang/String;)V")
	public static void method5167(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		Static131.aClass6_Sub10_Sub1_2.method2886(93);
		Static131.aClass6_Sub10_Sub1_2.method3968(Static302.method5198(arg1) + 1);
		Static131.aClass6_Sub10_Sub1_2.method3968(arg0);
		Static131.aClass6_Sub10_Sub1_2.method3966(arg1);
	}
}
