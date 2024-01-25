import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static218 {

	@OriginalMember(owner = "client!ns", name = "c", descriptor = "Ljava/lang/String;")
	public static String aString173 = "Ok";

	@OriginalMember(owner = "client!ns", name = "d", descriptor = "[Lclient!kf;")
	public static final Class6_Sub2_Sub9[] aClass6_Sub2_Sub9Array6 = new Class6_Sub2_Sub9[14];

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(IIIII)I")
	public static int method3882(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(24) int local24 = 65536 - Class207.anIntArray698[arg2 * 8192 / arg0] >> 1;
		return ((65536 - local24) * arg3 >> 16) + (local24 * arg1 >> 16);
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(IIIJ)V")
	public static void method3883(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) long arg2) {
		@Pc(18) int local18 = (int) arg2 >> 14 & 0x1F;
		@Pc(25) int local25 = (int) arg2 >> 20 & 0x3;
		@Pc(32) int local32 = Integer.MAX_VALUE & (int) (arg2 >>> 32);
		if (local18 != 10 && local18 != 11 && local18 != 22) {
			Static343.method5639(true, Static253.aClass44_Sub4_Sub4_Sub1_1.anIntArray560[0], Static253.aClass44_Sub4_Sub4_Sub1_1.anIntArray561[0], local18, 0, 0, 0, arg0, local25, arg1);
			return;
		}
		@Pc(69) Class66 local69 = Static196.method3622(local32);
		@Pc(77) int local77;
		@Pc(80) int local80;
		if (local25 == 0 || local25 == 2) {
			local77 = local69.anInt1489;
			local80 = local69.lb;
		} else {
			local80 = local69.anInt1489;
			local77 = local69.lb;
		}
		@Pc(91) int local91 = local69.anInt1477;
		if (local25 != 0) {
			local91 = (local91 << local25 & 0xF) + (local91 >> 4 - local25);
		}
		Static343.method5639(true, Static253.aClass44_Sub4_Sub4_Sub1_1.anIntArray560[0], Static253.aClass44_Sub4_Sub4_Sub1_1.anIntArray561[0], 0, local77, local91, local80, arg0, 0, arg1);
	}
}
