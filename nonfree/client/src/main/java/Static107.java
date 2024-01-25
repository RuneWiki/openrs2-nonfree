import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static107 {

	@OriginalMember(owner = "client!dk", name = "n", descriptor = "Lclient!ks;")
	public static final Class209 aClass209_1 = new Class209("", 19);

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(ILclient!rv;)Lclient!fba;")
	public static Class47_Sub2 method1768(@OriginalArg(1) Class5_Sub15 arg0) {
		return new Class47_Sub2(arg0.method3638(), arg0.method3638(), arg0.method3638(), arg0.method3638(), arg0.method3633(), arg0.method3633(), arg0.method3642());
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(IIBI)V")
	public static void method1769(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) int local8 = Static655.aClass5_Sub36_29.aClass2_Sub6_3.method3364() * arg0 >> 8;
		if (arg2 == -1 && !Static26.aBoolean13) {
			Static191.method2755();
		} else if (arg2 != -1 && (arg2 != Static367.anInt6416 || !Static70.method1031()) && local8 != 0 && !Static26.aBoolean13) {
			Static591.method8028(local8, arg2, arg1, Static449.aClass50_129);
			Static516.method3871();
		}
		if (arg2 != Static367.anInt6416) {
			Static409.aClass5_Sub14_Sub4_22 = null;
		}
		Static367.anInt6416 = arg2;
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(IIIILclient!kv;)Lclient!bo;")
	public static Class44_Sub1_Sub1 method1771(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class143_Sub2 arg3) {
		if (arg3.aBoolean406 || Static384.method5636(arg1) && Static384.method5636(arg2)) {
			return new Class44_Sub1_Sub1(arg3, 3553, arg0, arg1, arg2);
		} else if (arg3.aBoolean424) {
			return new Class44_Sub1_Sub1(arg3, 34037, arg0, arg1, arg2);
		} else {
			return new Class44_Sub1_Sub1(arg3, arg0, arg1, arg2, Static209.method2991(arg1), Static209.method2991(arg2));
		}
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(Lclient!li;B)V")
	public static void method1772(@OriginalArg(0) Class41_Sub1_Sub1_Sub3 arg0) {
		@Pc(5) boolean local5 = false;
		if (arg0.anInt9455 == Static421.anInt7434 || arg0.anInt9503 == -1 || arg0.anInt9463 != 0) {
			local5 = true;
		} else {
			@Pc(27) Class65 local27 = Static459.aClass128_2.method2686(arg0.anInt9503);
			if (local27.aBoolean107 || arg0.anInt9459 + 1 > local27.anIntArray71[arg0.anInt9507]) {
				local5 = true;
			}
		}
		if (local5) {
			@Pc(54) int local54 = arg0.anInt9455 - arg0.anInt9491;
			@Pc(60) int local60 = Static421.anInt7434 - arg0.anInt9491;
			@Pc(72) int local72 = arg0.anInt9468 * 512 + arg0.method7917() * 256;
			@Pc(84) int local84 = arg0.anInt9505 * 512 + arg0.method7917() * 256;
			@Pc(95) int local95 = arg0.anInt9490 * 512 + arg0.method7917() * 256;
			@Pc(106) int local106 = arg0.anInt9489 * 512 + arg0.method7917() * 256;
			arg0.anInt10367 = (local106 * local60 + (local54 - local60) * local84) / local54;
			arg0.anInt10366 = (local60 * local95 + (local54 - local60) * local72) / local54;
		}
		arg0.anInt9523 = 0;
		if (arg0.anInt9515 == 0) {
			arg0.method7925(false, 8192);
		}
		if (arg0.anInt9515 == 1) {
			arg0.method7925(false, 12288);
		}
		if (arg0.anInt9515 == 2) {
			arg0.method7925(false, 0);
		}
		if (arg0.anInt9515 == 3) {
			arg0.method7925(false, 4096);
		}
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(IIII)I")
	public static int method1773(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (Static8.anInt166 < 100) {
			return -2;
		}
		@Pc(12) int local12 = -2;
		@Pc(20) int local20 = Integer.MAX_VALUE;
		@Pc(25) int local25 = arg1 - Static407.anInt6543;
		@Pc(30) int local30 = arg0 - Static407.anInt6539;
		for (@Pc(35) Class5_Sub40 local35 = (Class5_Sub40) Static407.aClass124_66.method2572(); local35 != null; local35 = (Class5_Sub40) Static407.aClass124_66.method2569()) {
			if (local35.anInt7515 == arg2) {
				@Pc(47) int local47 = local35.anInt7521;
				@Pc(50) int local50 = local35.anInt7516;
				@Pc(60) int local60 = Static407.anInt6539 + local50 | Static407.anInt6543 + local47 << 14;
				@Pc(80) int local80 = (local30 - local50) * (-local50 + local30) + (local25 - local47) * (-local47 + local25);
				if (local12 < 0 || local20 > local80) {
					local12 = local60;
					local20 = local80;
				}
			}
		}
		return local12;
	}
}
