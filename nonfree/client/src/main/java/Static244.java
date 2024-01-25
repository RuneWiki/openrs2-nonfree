import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static244 {

	@OriginalMember(owner = "client!pi", name = "b", descriptor = "[Lclient!lg;")
	public static Class60[] aClass60Array15;

	@OriginalMember(owner = "client!pi", name = "r", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray14;

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(BI)Lclient!pj;")
	public static Class156 method4224(@OriginalArg(1) int arg0) {
		@Pc(5) Class154 local5 = Static148.aClass154_75;
		@Pc(16) Class156 local16;
		synchronized (Static148.aClass154_75) {
			local16 = (Class156) Static148.aClass154_75.method4222((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(40) byte[] local40 = Static68.aClass11_33.method288(Static17.method353(arg0), Static170.method3194(arg0));
		local16 = new Class156();
		local16.anInt5142 = arg0;
		if (local40 != null) {
			local16.method4238(new Class4_Sub7(local40));
		}
		@Pc(63) Class154 local63 = Static148.aClass154_75;
		synchronized (Static148.aClass154_75) {
			Static148.aClass154_75.method4221((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(Lclient!ds;IZII)V")
	public static void method4229(@OriginalArg(0) Class56 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(15) Class4_Sub37 local15 = (Class4_Sub37) Static307.aClass130_81.method3499(); local15 != null; local15 = (Class4_Sub37) Static307.aClass130_81.method3512()) {
			if (arg3 == local15.anInt6019 && arg2 * 128 == local15.anInt6033 && local15.anInt6024 == arg1 * 128 && local15.aClass56_1.anInt1346 == arg0.anInt1346) {
				if (local15.aClass4_Sub13_Sub1_2 != null) {
					Static337.aClass4_Sub13_Sub2_2.method2499(local15.aClass4_Sub13_Sub1_2);
					local15.aClass4_Sub13_Sub1_2 = null;
				}
				if (local15.aClass4_Sub13_Sub1_3 != null) {
					Static337.aClass4_Sub13_Sub2_2.method2499(local15.aClass4_Sub13_Sub1_3);
					local15.aClass4_Sub13_Sub1_3 = null;
				}
				local15.method5667();
				return;
			}
		}
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(IIIII)V")
	public static void method4230(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		Static320.aClass4_Sub7_Sub1_3.anInt2667 = 0;
		Static320.aClass4_Sub7_Sub1_3.method2416(20);
		Static320.aClass4_Sub7_Sub1_3.method2416(arg0);
		Static320.aClass4_Sub7_Sub1_3.method2416(arg3);
		Static320.aClass4_Sub7_Sub1_3.method2376(arg1);
		Static320.aClass4_Sub7_Sub1_3.method2376(arg2);
		Static45.anInt5671 = 1;
		Static352.anInt6601 = 0;
		Static335.anInt6657 = 0;
		Static52.anInt1173 = -3;
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(I)V")
	public static void method4231() {
		Static155.aClass154_56.method4219();
		Static60.aClass154_18.method4219();
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(IZ)I")
	public static int method4232(@OriginalArg(0) int arg0) {
		@Pc(5) int local5 = 0;
		if (arg0 < 0 || arg0 >= 65536) {
			arg0 >>>= 0x10;
			local5 += 16;
		}
		if (arg0 >= 256) {
			arg0 >>>= 0x8;
			local5 += 8;
		}
		if (arg0 >= 16) {
			local5 += 4;
			arg0 >>>= 0x4;
		}
		if (arg0 >= 4) {
			arg0 >>>= 0x2;
			local5 += 2;
		}
		if (arg0 >= 1) {
			arg0 >>>= 0x1;
			local5++;
		}
		return arg0 + local5;
	}
}
