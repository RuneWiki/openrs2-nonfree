import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static225 {

	@OriginalMember(owner = "client!od", name = "b", descriptor = "I")
	public static int anInt4338;

	@OriginalMember(owner = "client!od", name = "e", descriptor = "Lclient!iq;")
	public static final Class93 aClass93_87 = new Class93(" from your friend list first.", " zuerst von deiner Freunde-Liste!", " de votre liste d'amis.", " da sua lista de amigos primeiro.");

	@OriginalMember(owner = "client!od", name = "g", descriptor = "[I")
	public static final int[] anIntArray342 = new int[] { 2, 2, 4, 2, 1, 8, 4, 1, 4, 4, 2, 1, 1, 1, 4, 1 };

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(B)V")
	public static void method3964() {
		Static110.aClass119_72.method3304();
		Static250.aClass119_154.method3304();
		Static29.aClass119_16.method3304();
		Static98.aClass119_58.method3304();
		Static126.aClass119_83.method3304();
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(I)I")
	public static int method3965() {
		return 15;
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(Lclient!li;Lclient!nd;ILclient!ae;)V")
	public static void method3967(@OriginalArg(0) Class120 arg0, @OriginalArg(1) Class2_Sub31 arg1, @OriginalArg(3) Class4 arg2) {
		@Pc(10) Class31 local10 = arg0.method3339(arg2);
		if (local10 == null) {
			return;
		}
		@Pc(16) int local16 = local10.method4392();
		if (local16 < local10.method4393()) {
			local16 = local10.method4393();
		}
		@Pc(32) int local32 = arg1.anInt4060;
		@Pc(35) int local35 = arg1.anInt4064;
		@Pc(37) int local37 = 0;
		@Pc(39) int local39 = 0;
		@Pc(41) int local41 = 0;
		@Pc(55) int local55;
		@Pc(82) int local82;
		if (arg0.aString32 != null) {
			local37 = Static203.aClass188_7.method5316(arg0.aString32, null, null, Static6.aStringArray1);
			for (local55 = 0; local55 < local37; local55++) {
				@Pc(61) String local61 = Static6.aStringArray1[local55];
				if (local55 < local37 - 1) {
					local61 = local61.substring(0, local61.length() - 4);
				}
				local82 = Static262.aClass98_7.method2964(local61);
				if (local39 < local82) {
					local39 = local82;
				}
			}
			local41 = local37 * Static262.aClass98_7.method2965() + Static262.aClass98_7.method2967() / 2;
		}
		local55 = arg1.anInt4060 + local16 / 2;
		if (local16 + Static127.anInt1563 > local32) {
			local55 = local39 / 2 + local16 / 2 + Static127.anInt1563 + 5 + 10;
			local32 = Static127.anInt1563;
		} else if (Static127.anInt1571 - local16 < local32) {
			local55 = Static127.anInt1571 - local39 / 2 - local16 / 2 - 10 - 5;
			local32 = Static127.anInt1571 - local16;
		}
		@Pc(171) int local171 = arg1.anInt4064;
		if (local16 + Static127.anInt1572 > local35) {
			local171 = Static127.anInt1572 + local16 / 2 + 10;
			local35 = Static127.anInt1572;
		} else if (Static127.anInt1570 - local16 < local35) {
			local35 = Static127.anInt1570 - local16;
			local171 = Static127.anInt1570 - local41 - local16 / 2 - 10;
		}
		local82 = (int) (Math.atan2((double) (local32 - arg1.anInt4060), (double) (local35 - arg1.anInt4064)) / 3.141592653589793D * 32767.0D) & 0xFFFF;
		local10.method4384((float) local32 + (float) local16 / 2.0F, (float) local35 + (float) local16 / 2.0F, 4096, local82);
		@Pc(256) int local256 = -2;
		@Pc(258) int local258 = -2;
		@Pc(265) int local265 = -2;
		@Pc(267) int local267 = -2;
		if (arg0.aString32 != null) {
			local258 = local171;
			local256 = local55 - local39 / 2 - 5;
			local265 = local256 + local39 + 10;
			local267 = local37 * Static262.aClass98_7.method2965() + local171 + 3;
			if (arg0.anInt3653 != 0) {
				arg2.method4261(local171, local256, local267 - local171, local265 - local256, arg0.anInt3653);
			}
			if (arg0.anInt3643 != 0) {
				arg2.method4300(arg0.anInt3643, local267 - local171, -local256 + local265, local171, local256);
			}
			for (@Pc(338) int local338 = 0; local338 < local37; local338++) {
				@Pc(344) String local344 = Static6.aStringArray1[local338];
				if (local37 - 1 > local338) {
					local344 = local344.substring(0, local344.length() - 4);
				}
				Static262.aClass98_7.method2963(arg2, local344, local55, local171, arg0.anInt3663);
				local171 += Static262.aClass98_7.method2965();
			}
		}
		if (arg0.anInt3646 == -1 && arg0.aString32 == null) {
			return;
		}
		local16 >>= 0x1;
		@Pc(395) Class2_Sub38 local395 = new Class2_Sub38(arg1);
		local395.anInt5872 = local16 + local35;
		local395.anInt5873 = local35 - local16;
		local395.anInt5874 = local258;
		local395.anInt5877 = local265;
		local395.anInt5871 = local32 - local16;
		local395.anInt5880 = local32 + local16;
		local395.anInt5881 = local267;
		local395.anInt5875 = local256;
		Static56.aClass216_19.method5995(local395);
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(Z)V")
	public static void method3968() {
		Static116.anInt2576 = -1;
		Static260.anInt5271 = 0;
		Static201.anInt3909 = -1;
	}
}
