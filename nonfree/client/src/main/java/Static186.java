import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static186 {

	@OriginalMember(owner = "client!gi", name = "c", descriptor = "I")
	public static int anInt4075;

	@OriginalMember(owner = "client!gi", name = "e", descriptor = "I")
	public static int anInt4076;

	@OriginalMember(owner = "client!gi", name = "j", descriptor = "I")
	public static int anInt4078 = 0;

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(Lclient!ha;BLclient!uca;Lclient!bq;)V")
	public static void method3464(@OriginalArg(0) Class5 arg0, @OriginalArg(2) Class6_Sub48 arg1, @OriginalArg(3) Class36 arg2) {
		@Pc(10) Class4 local10 = arg2.method1625(arg0);
		if (local10 == null) {
			return;
		}
		@Pc(16) int local16 = local10.method7697();
		if (local16 < local10.method7694()) {
			local16 = local10.method7694();
		}
		@Pc(32) int local32 = arg1.anInt9720;
		@Pc(40) int local40 = arg1.anInt9724;
		@Pc(42) int local42 = 0;
		@Pc(44) int local44 = 0;
		@Pc(46) int local46 = 0;
		@Pc(60) int local60;
		@Pc(83) int local83;
		if (arg2.aString9 != null) {
			local42 = Static150.aClass213_4.method5832(arg2.aString9, Static72.aStringArray8, (int[]) null, (Class4[]) null);
			for (local60 = 0; local60 < local42; local60++) {
				@Pc(66) String local66 = Static72.aStringArray8[local60];
				if (local60 < local42 - 1) {
					local66 = local66.substring(0, local66.length() - 4);
				}
				local83 = Static335.aClass333_6.method7928(local66);
				if (local44 < local83) {
					local44 = local83;
				}
			}
			local46 = Static335.aClass333_6.method7932() * local42 + Static335.aClass333_6.method7931() / 2;
		}
		local60 = local16 / 2 + arg1.anInt9720;
		if (Static491.anInt7788 + local16 > local32) {
			local60 = local44 / 2 + local16 / 2 + Static491.anInt7788 + 10 + 5;
			local32 = Static491.anInt7788;
		} else if (local32 > Static491.anInt7792 - local16) {
			local60 = Static491.anInt7792 - local16 / 2 - local44 / 2 - 10 - 5;
			local32 = Static491.anInt7792 - local16;
		}
		@Pc(166) int local166 = arg1.anInt9724;
		if (Static491.anInt7784 + local16 > local40) {
			local166 = local16 / 2 + Static491.anInt7784 + 10;
			local40 = Static491.anInt7784;
		} else if (Static491.anInt7793 - local16 < local40) {
			local166 = Static491.anInt7793 - local46 - local16 / 2 - 10;
			local40 = Static491.anInt7793 - local16;
		}
		local83 = (int) (Math.atan2((double) (local32 - arg1.anInt9720), (double) (local40 - arg1.anInt9724)) / 3.141592653589793D * 32767.0D) & 0xFFFF;
		local10.method7693((float) local32 + (float) local16 / 2.0F, (float) local16 / 2.0F + (float) local40, 4096, local83);
		@Pc(255) int local255 = -2;
		@Pc(257) int local257 = -2;
		@Pc(259) int local259 = -2;
		@Pc(261) int local261 = -2;
		if (arg2.aString9 != null) {
			local257 = local166;
			local255 = local60 - local44 / 2 - 5;
			local261 = local42 * Static335.aClass333_6.method7932() + local166 + 3;
			local259 = local255 + local44 + 10;
			if (arg2.anInt1740 != 0) {
				arg0.method6123(local259 - local255, local261 + -local166, local166, arg2.anInt1740, local255);
			}
			if (arg2.anInt1747 != 0) {
				arg0.method6144(local261 - local166, local259 - local255, arg2.anInt1747, local255, local166);
			}
			for (@Pc(333) int local333 = 0; local333 < local42; local333++) {
				@Pc(339) String local339 = Static72.aStringArray8[local333];
				if (local333 < local42 - 1) {
					local339 = local339.substring(0, local339.length() - 4);
				}
				Static335.aClass333_6.method7933(arg0, local339, local60, local166, arg2.anInt1767);
				local166 += Static335.aClass333_6.method7932();
			}
		}
		if (arg2.anInt1753 == -1 && arg2.aString9 == null) {
			return;
		}
		@Pc(386) Class6_Sub30 local386 = new Class6_Sub30(arg1);
		local16 >>= 0x1;
		local386.anInt5793 = local261;
		local386.anInt5794 = local257;
		local386.anInt5790 = local259;
		local386.anInt5792 = local255;
		local386.anInt5788 = local40 + local16;
		local386.anInt5795 = local32 + local16;
		local386.anInt5785 = local32 - local16;
		local386.anInt5787 = local40 - local16;
		Static15.aClass163_8.method4967(local386);
	}
}
