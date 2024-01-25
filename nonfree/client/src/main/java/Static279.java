import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static279 {

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "Lclient!td;")
	public static Class148_Sub1 aClass148_Sub1_8;

	@OriginalMember(owner = "client!oa", name = "n", descriptor = "Lclient!so;")
	public static final Class224 aClass224_27 = new Class224(12, 4);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(BLclient!qa;Lclient!dt;Lclient!cn;)V")
	public static void method5484(@OriginalArg(1) Class128 arg0, @OriginalArg(2) Class56 arg1, @OriginalArg(3) Class1_Sub7 arg2) {
		@Pc(10) Class49 local10 = arg1.method1228(arg0);
		if (local10 == null) {
			return;
		}
		@Pc(16) int local16 = local10.UA();
		if (local16 < local10.qa()) {
			local16 = local10.qa();
		}
		@Pc(28) int local28 = arg2.anInt974;
		@Pc(31) int local31 = arg2.anInt971;
		@Pc(33) int local33 = 0;
		@Pc(40) int local40 = 0;
		@Pc(42) int local42 = 0;
		@Pc(56) int local56;
		@Pc(79) int local79;
		if (arg1.aString10 != null) {
			local33 = Static308.aClass122_6.method2472(null, arg1.aString10, null, Static144.aStringArray21);
			for (local56 = 0; local56 < local33; local56++) {
				@Pc(62) String local62 = Static144.aStringArray21[local56];
				if (local56 < local33 - 1) {
					local62 = local62.substring(0, local62.length() - 4);
				}
				local79 = Static433.aClass244_10.method5145(local62);
				if (local40 < local79) {
					local40 = local79;
				}
			}
			local42 = Static433.aClass244_10.method5142() * local33 + Static433.aClass244_10.method5144() / 2;
		}
		local56 = arg2.anInt974 + local16 / 2;
		@Pc(118) int local118 = arg2.anInt971;
		if (Static114.anInt6807 + local16 > local28) {
			local56 = local40 / 2 + local16 / 2 + Static114.anInt6807 + 5 + 10;
			local28 = Static114.anInt6807;
		} else if (Static114.anInt6799 - local16 < local28) {
			local28 = Static114.anInt6799 - local16;
			local56 = Static114.anInt6799 - local40 / 2 - local16 / 2 - 10 - 5;
		}
		if (Static114.anInt6802 + local16 > local31) {
			local31 = Static114.anInt6802;
			local118 = Static114.anInt6802 + local16 / 2 + 10;
		} else if (local31 > Static114.anInt6801 - local16) {
			local118 = Static114.anInt6801 - local42 - local16 / 2 - 10;
			local31 = Static114.anInt6801 - local16;
		}
		local79 = (int) (Math.atan2((double) (local28 - arg2.anInt974), (double) (local31 - arg2.anInt971)) / 3.141592653589793D * 32767.0D) & 0xFFFF;
		local10.method5641((float) local16 / 2.0F + (float) local28, (float) local31 + (float) local16 / 2.0F, 4096, local79);
		@Pc(260) int local260 = -2;
		@Pc(262) int local262 = -2;
		@Pc(264) int local264 = -2;
		@Pc(266) int local266 = -2;
		if (arg1.aString10 != null) {
			local262 = local118;
			local260 = local56 - local40 / 2 - 5;
			local266 = local118 + local33 * Static433.aClass244_10.method5142() + 3;
			local264 = local260 + local40 + 10;
			if (arg1.anInt1466 != 0) {
				arg0.method3580(local118, local260, local266 - local118, arg1.anInt1466, local264 - local260);
			}
			if (arg1.anInt1488 != 0) {
				arg0.method3551(local260, local118, local266 - local118, local264 + -local260, arg1.anInt1488);
			}
			for (@Pc(337) int local337 = 0; local337 < local33; local337++) {
				@Pc(343) String local343 = Static144.aStringArray21[local337];
				if (local337 < local33 - 1) {
					local343 = local343.substring(0, local343.length() - 4);
				}
				Static433.aClass244_10.method5141(arg0, local343, local56, local118, arg1.anInt1484);
				local118 += Static433.aClass244_10.method5142();
			}
		}
		if (arg1.anInt1476 == -1 && arg1.aString10 == null) {
			return;
		}
		@Pc(386) Class1_Sub8 local386 = new Class1_Sub8(arg2);
		local16 >>= 0x1;
		local386.anInt1024 = local260;
		local386.anInt1022 = local28 - local16;
		local386.anInt1028 = local262;
		local386.anInt1021 = local266;
		local386.anInt1030 = local264;
		local386.anInt1023 = local16 + local31;
		local386.anInt1031 = local16 + local28;
		local386.anInt1029 = local31 - local16;
		Static110.aClass254_11.method5430(local386);
	}
}
