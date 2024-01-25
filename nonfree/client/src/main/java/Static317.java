import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static317 {

	@OriginalMember(owner = "client!qd", name = "o", descriptor = "I")
	public static int anInt2329 = -1;

	@OriginalMember(owner = "client!qd", name = "p", descriptor = "I")
	public static int anInt2330 = 0;

	@OriginalMember(owner = "client!qd", name = "q", descriptor = "I")
	public static int anInt2331 = -1;

	@OriginalMember(owner = "client!qd", name = "s", descriptor = "[I")
	public static final int[] anIntArray137 = new int[] { 28, 35, 40, 44 };

	@OriginalMember(owner = "client!qd", name = "d", descriptor = "(B)I")
	public static int method1911() {
		if ((double) Static7.aFloat7 == 3.0D) {
			return 37;
		} else if ((double) Static7.aFloat7 == 4.0D) {
			return 50;
		} else if ((double) Static7.aFloat7 == 6.0D) {
			return 75;
		} else if ((double) Static7.aFloat7 == 8.0D) {
			return 100;
		} else {
			return 200;
		}
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(ILclient!qs;Lclient!eq;Lclient!wd;)V")
	public static void method1912(@OriginalArg(1) Class6_Sub32 arg0, @OriginalArg(2) Class66 arg1, @OriginalArg(3) Class260 arg2) {
		@Pc(10) Class87 local10 = arg2.method6333(arg1);
		if (local10 == null) {
			return;
		}
		@Pc(16) int local16 = local10.method6555();
		if (local16 < local10.method6554()) {
			local16 = local10.method6554();
		}
		@Pc(28) int local28 = arg0.anInt5702;
		@Pc(31) int local31 = arg0.anInt5703;
		@Pc(33) int local33 = 0;
		@Pc(35) int local35 = 0;
		@Pc(37) int local37 = 0;
		@Pc(53) int local53;
		@Pc(80) int local80;
		if (arg2.aString70 != null) {
			local33 = Static8.aClass166_1.method3883(null, arg2.aString70, Static301.aStringArray31, null);
			for (local53 = 0; local53 < local33; local53++) {
				@Pc(59) String local59 = Static301.aStringArray31[local53];
				if (local33 - 1 > local53) {
					local59 = local59.substring(0, local59.length() - 4);
				}
				local80 = Static44.aClass116_7.method2797(local59);
				if (local80 > local35) {
					local35 = local80;
				}
			}
			local37 = local33 * Static44.aClass116_7.method2799() + Static44.aClass116_7.method2800() / 2;
		}
		local53 = arg0.anInt5702 + local16 / 2;
		if (Static7.anInt1145 + local16 > local28) {
			local53 = local16 / 2 + Static7.anInt1145 + local35 / 2 + 5 + 10;
			local28 = Static7.anInt1145;
		} else if (Static7.anInt1142 - local16 < local28) {
			local28 = Static7.anInt1142 - local16;
			local53 = Static7.anInt1142 - local16 / 2 - local35 / 2 - 5 - 10;
		}
		@Pc(164) int local164 = arg0.anInt5703;
		if (local16 + Static7.anInt1143 > local31) {
			local31 = Static7.anInt1143;
			local164 = Static7.anInt1143 + local16 / 2 + 10;
		} else if (Static7.anInt1148 - local16 < local31) {
			local31 = Static7.anInt1148 - local16;
			local164 = Static7.anInt1148 - local16 / 2 - local37 - 10;
		}
		local80 = (int) (Math.atan2((double) (local28 - arg0.anInt5702), (double) (local31 - arg0.anInt5703)) / 3.141592653589793D * 32767.0D) & 0xFFFF;
		local10.method6568((float) local16 / 2.0F + (float) local28, (float) local31 + (float) local16 / 2.0F, 4096, local80);
		@Pc(254) int local254 = -2;
		@Pc(256) int local256 = -2;
		@Pc(258) int local258 = -2;
		@Pc(260) int local260 = -2;
		if (arg2.aString70 != null) {
			local254 = local53 - local35 / 2 - 5;
			local256 = local164;
			local260 = Static44.aClass116_7.method2799() * local33 + local164 + 3;
			local258 = local35 + local254 + 10;
			if (arg2.anInt7750 != 0) {
				arg1.method5035(local258 - local254, local164, arg2.anInt7750, local254, local260 - local164);
			}
			if (arg2.anInt7759 != 0) {
				arg1.method5040(arg2.anInt7759, local258 - local254, local164, local254, local260 - local164);
			}
			for (@Pc(332) int local332 = 0; local332 < local33; local332++) {
				@Pc(338) String local338 = Static301.aStringArray31[local332];
				if (local33 - 1 > local332) {
					local338 = local338.substring(0, local338.length() - 4);
				}
				Static44.aClass116_7.method2802(arg1, local338, local53, local164, arg2.anInt7729);
				local164 += Static44.aClass116_7.method2799();
			}
		}
		if (arg2.anInt7745 == -1 && arg2.aString70 == null) {
			return;
		}
		@Pc(386) Class6_Sub31 local386 = new Class6_Sub31(arg0);
		local16 >>= 0x1;
		local386.anInt5684 = local258;
		local386.anInt5681 = local31 - local16;
		local386.anInt5690 = local16 + local31;
		local386.anInt5688 = local28 - local16;
		local386.anInt5680 = local254;
		local386.anInt5685 = local260;
		local386.anInt5691 = local16 + local28;
		local386.anInt5683 = local256;
		Static173.aClass244_15.method5966(local386);
	}
}
