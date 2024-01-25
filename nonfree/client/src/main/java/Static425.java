import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static425 {

	@OriginalMember(owner = "client!oj", name = "j", descriptor = "Lclient!cb;")
	public static Class50 aClass50_121;

	@OriginalMember(owner = "client!oj", name = "t", descriptor = "F")
	public static float aFloat145;

	@OriginalMember(owner = "client!oj", name = "F", descriptor = "I")
	public static int anInt7565;

	@OriginalMember(owner = "client!oj", name = "n", descriptor = "Lclient!iv;")
	public static final Class174 aClass174_5 = new Class174("game4", 3);

	@OriginalMember(owner = "client!oj", name = "E", descriptor = "[I")
	public static final int[] anIntArray418 = new int[] { 0, 1, 2, 2, 1, 1, 2, 3, 1, 3, 3, 4, 2, 0, 4 };

	@OriginalMember(owner = "client!oj", name = "G", descriptor = "[Z")
	public static final boolean[] aBooleanArray18 = new boolean[100];

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(BLclient!ha;Lclient!oga;Lclient!or;)V")
	public static void method6448(@OriginalArg(1) Class143 arg0, @OriginalArg(2) Class5_Sub40 arg1, @OriginalArg(3) Class262 arg2) {
		@Pc(16) Class59 local16 = arg2.method6487(arg0);
		if (local16 == null) {
			return;
		}
		@Pc(22) int local22 = local16.method8049();
		if (local16.method8061() > local22) {
			local22 = local16.method8061();
		}
		@Pc(34) int local34 = arg1.anInt7519;
		@Pc(37) int local37 = arg1.anInt7517;
		@Pc(39) int local39 = 0;
		@Pc(41) int local41 = 0;
		@Pc(43) int local43 = 0;
		@Pc(57) int local57;
		@Pc(79) int local79;
		if (arg2.aString72 != null) {
			local39 = Static172.aClass198_4.method4085(Static444.aStringArray29, (Class59[]) null, arg2.aString72, (int[]) null);
			for (local57 = 0; local57 < local39; local57++) {
				@Pc(62) String local62 = Static444.aStringArray29[local57];
				if (local39 - 1 > local57) {
					local62 = local62.substring(0, local62.length() - 4);
				}
				local79 = Static120.aClass170_10.method3593(local62);
				if (local41 < local79) {
					local41 = local79;
				}
			}
			local43 = local39 * Static120.aClass170_10.method3590() + Static120.aClass170_10.method3596() / 2;
		}
		local57 = local22 / 2 + arg1.anInt7519;
		@Pc(112) int local112 = arg1.anInt7517;
		if (local34 < local22 + Static407.anInt6535) {
			local57 = Static407.anInt6535 + local22 / 2 + local41 / 2 + 10 + 5;
			local34 = Static407.anInt6535;
		} else if (Static407.anInt6545 - local22 < local34) {
			local34 = Static407.anInt6545 - local22;
			local57 = Static407.anInt6545 - local41 / 2 - local22 / 2 - 5 - 10;
		}
		if (local22 + Static407.anInt6538 > local37) {
			local37 = Static407.anInt6538;
			local112 = local22 / 2 + Static407.anInt6538 + 10;
		} else if (Static407.anInt6544 - local22 < local37) {
			local112 = Static407.anInt6544 - local43 - local22 / 2 - 10;
			local37 = Static407.anInt6544 - local22;
		}
		local79 = (int) (Math.atan2((double) (local34 - arg1.anInt7519), (double) (local37 - arg1.anInt7517)) / 3.141592653589793D * 32767.0D) & 0xFFFF;
		local16.method8071((float) local34 + (float) local22 / 2.0F, (float) local22 / 2.0F + (float) local37, 4096, local79);
		@Pc(255) int local255 = -2;
		@Pc(257) int local257 = -2;
		@Pc(259) int local259 = -2;
		@Pc(261) int local261 = -2;
		if (arg2.aString72 != null) {
			local257 = local112;
			local255 = local57 - local41 / 2 - 5;
			local261 = local112 + Static120.aClass170_10.method3590() * local39 + 3;
			local259 = local255 + local41 + 10;
			if (arg2.anInt7645 != 0) {
				arg0.method6252(local112, local255, arg2.anInt7645, local261 - local112, -local255 + local259);
			}
			if (arg2.anInt7631 != 0) {
				arg0.method6235(local112, local259 - local255, local261 + -local112, arg2.anInt7631, local255);
			}
			for (@Pc(331) int local331 = 0; local331 < local39; local331++) {
				@Pc(336) String local336 = Static444.aStringArray29[local331];
				if (local331 < local39 - 1) {
					local336 = local336.substring(0, local336.length() - 4);
				}
				Static120.aClass170_10.method3595(arg0, local336, local57, local112, arg2.anInt7619);
				local112 += Static120.aClass170_10.method3590();
			}
		}
		if (arg2.anInt7628 == -1 && arg2.aString72 == null) {
			return;
		}
		@Pc(387) Class5_Sub45 local387 = new Class5_Sub45(arg1);
		local22 >>= 0x1;
		local387.anInt8802 = local37 - local22;
		local387.anInt8797 = local259;
		local387.anInt8803 = local34 - local22;
		local387.anInt8795 = local261;
		local387.anInt8801 = local255;
		local387.anInt8796 = local22 + local37;
		local387.anInt8804 = local34 + local22;
		local387.anInt8799 = local257;
		Static653.aClass124_104.method2574(local387);
	}
}
