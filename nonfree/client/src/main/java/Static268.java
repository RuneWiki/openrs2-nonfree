import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static268 {

	@OriginalMember(owner = "client!nr", name = "b", descriptor = "F")
	public static float aFloat159;

	@OriginalMember(owner = "client!nr", name = "c", descriptor = "I")
	public static int anInt4956;

	@OriginalMember(owner = "client!nr", name = "d", descriptor = "I")
	public static int anInt4957 = 0;

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(III)Z")
	public static boolean method4008(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static445.method6017(arg1, arg0) || Static33.method440(arg1, arg0);
	}

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(IBII)I")
	public static int method4009(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) int local12 = arg1 & 0x3;
		if (local12 == 0) {
			return arg0;
		} else if (local12 == 1) {
			return 7 - arg2;
		} else if (local12 == 2) {
			return 7 - arg0;
		} else {
			return arg2;
		}
	}

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(IIIBI)V")
	public static void method4010(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (Static243.anInt4531 == 1) {
			Static23.aClass76Array1[Static342.anInt6039 / 100].method6088(Static201.anInt3900 - 8, Static19.anInt422 + -8);
		}
		if (Static243.anInt4531 == 2) {
			Static23.aClass76Array1[Static342.anInt6039 / 100 + 4].method6088(Static201.anInt3900 - 8, Static19.anInt422 + -8);
		}
		Static155.method2343();
	}

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(BLclient!hq;)V")
	public static void method4011(@OriginalArg(1) Class2_Sub20_Sub1 arg0) {
		arg0.method2499();
		@Pc(10) int local10 = Static393.anInt6881;
		@Pc(20) Class4_Sub2_Sub2_Sub1 local20 = Static231.aClass4_Sub2_Sub2_Sub1_2 = Static129.aClass4_Sub2_Sub2_Sub1Array27[local10] = new Class4_Sub2_Sub2_Sub1();
		local20.anInt6456 = local10;
		@Pc(28) int local28 = arg0.method2505(30);
		@Pc(33) byte local33 = (byte) (local28 >> 28);
		@Pc(39) int local39 = local28 >> 14 & 0x3FFF;
		local20.anIntArray436[0] = local39 - Static173.anInt3340;
		@Pc(51) int local51 = local28 & 0x3FFF;
		local20.anInt7117 = (local20.anIntArray436[0] << 7) + (local20.method5118() << 6);
		local20.anIntArray437[0] = local51 - Static379.anInt6721;
		local20.anInt7111 = (local20.anIntArray437[0] << 7) + (local20.method5118() << 6);
		Static301.anInt5383 = local20.aByte92 = local33;
		if (Static180.aClass2_Sub20Array1[local10] != null) {
			local20.method4596(Static180.aClass2_Sub20Array1[local10]);
		}
		Static348.anInt6137 = 0;
		Static348.anIntArray412[Static348.anInt6137++] = local10;
		Static152.aByteArray81[local10] = 0;
		Static98.anInt2181 = 0;
		for (@Pc(125) int local125 = 1; local125 < 2048; local125++) {
			if (local10 != local125) {
				@Pc(135) int local135 = arg0.method2505(18);
				@Pc(139) int local139 = local135 >> 16;
				@Pc(145) int local145 = local135 >> 8 & 0xFF;
				@Pc(149) int local149 = local135 & 0xFF;
				@Pc(157) Class260 local157 = Static329.aClass260Array1[local125] = new Class260();
				local157.anInt7527 = -1;
				local157.anInt7531 = local149 + (local145 << 14) + (local139 << 28);
				local157.aBoolean643 = false;
				local157.anInt7526 = 0;
				Static231.anIntArray306[Static98.anInt2181++] = local125;
				Static152.aByteArray81[local125] = 0;
			}
		}
		arg0.method2506();
	}
}
