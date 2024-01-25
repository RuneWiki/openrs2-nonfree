import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static323 {

	@OriginalMember(owner = "client!kn", name = "g", descriptor = "I")
	public static int anInt5596;

	@OriginalMember(owner = "client!kn", name = "w", descriptor = "I")
	public static int anInt5607;

	@OriginalMember(owner = "client!kn", name = "v", descriptor = "Lclient!av;")
	public static final Class27 aClass27_8 = new Class27(6, 2);

	@OriginalMember(owner = "client!kn", name = "h", descriptor = "Lclient!ke;")
	public static final Class199 aClass199_7 = new Class199();

	@OriginalMember(owner = "client!kn", name = "A", descriptor = "I")
	public static int anInt5614 = 0;

	@OriginalMember(owner = "client!kn", name = "n", descriptor = "I")
	public static int anInt5615 = 0;

	@OriginalMember(owner = "client!kn", name = "r", descriptor = "Z")
	public static boolean aBoolean404 = false;

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(BILclient!rea;)Z")
	public static boolean method5070(@OriginalArg(1) int arg0, @OriginalArg(2) Class14_Sub21_Sub2 arg1) {
		@Pc(17) int local17 = arg1.method7764(2);
		@Pc(41) int local41;
		@Pc(46) int local46;
		@Pc(121) int local121;
		@Pc(125) int local125;
		@Pc(131) int local131;
		if (local17 == 0) {
			if (arg1.method7764(1) != 0) {
				method5070(arg0, arg1);
			}
			local41 = arg1.method7764(6);
			local46 = arg1.method7764(6);
			@Pc(57) boolean local57 = arg1.method7764(1) == 1;
			if (local57) {
				Static429.anIntArray385[Static134.anInt2097++] = arg0;
			}
			if (Static269.aClass4_Sub3_Sub3_Sub3_Sub2Array4[arg0] != null) {
				throw new RuntimeException("hr:lr");
			}
			@Pc(85) Class245 local85 = Static671.aClass245Array1[arg0];
			@Pc(93) Class4_Sub3_Sub3_Sub3_Sub2 local93 = Static269.aClass4_Sub3_Sub3_Sub3_Sub2Array4[arg0] = new Class4_Sub3_Sub3_Sub3_Sub2();
			local93.anInt3238 = arg0;
			if (Static260.aClass14_Sub21Array1[arg0] != null) {
				local93.method2885(Static260.aClass14_Sub21Array1[arg0], 0);
			}
			local93.method2873(local85.anInt6984, true);
			local93.anInt3256 = local85.anInt6979;
			local121 = local85.anInt6983;
			local125 = local121 >> 28;
			local131 = local121 >> 14 & 0xFF;
			@Pc(135) int local135 = local121 & 0xFF;
			@Pc(145) int local145 = (local131 << 6) + local41 - Static36.anInt617;
			local93.aBoolean242 = local85.aBoolean492;
			local93.aBoolean246 = local85.aBoolean491;
			@Pc(161) int local161 = (local135 << 6) + local46 - Static550.anInt9242;
			local93.aByteArray50[0] = Static98.aByteArray25[arg0];
			local93.aByte146 = local93.aByte147 = (byte) local125;
			if (Static551.method7974(local145, local161)) {
				local93.aByte147++;
			}
			local93.method2897(local145, local161);
			local93.aBoolean241 = false;
			Static671.aClass245Array1[arg0] = null;
			return true;
		} else if (local17 == 1) {
			local41 = arg1.method7764(2);
			local46 = Static671.aClass245Array1[arg0].anInt6983;
			Static671.aClass245Array1[arg0].anInt6983 = ((local41 + (local46 >> 28) & 0x3) << 28) + (local46 & 0xFFFFFFF);
			return false;
		} else {
			@Pc(256) int local256;
			@Pc(261) int local261;
			@Pc(269) int local269;
			if (local17 != 2) {
				local41 = arg1.method7764(18);
				local46 = local41 >> 16;
				local256 = local41 >> 8 & 0xFF;
				local261 = local41 & 0xFF;
				local269 = Static671.aClass245Array1[arg0].anInt6983;
				local121 = (local269 >> 28) + local46 & 0x3;
				local125 = local256 + (local269 >> 14) & 0xFF;
				local131 = local269 + local261 & 0xFF;
				Static671.aClass245Array1[arg0].anInt6983 = (local121 << 28) + ((local125 << 14) + local131);
				return false;
			}
			local41 = arg1.method7764(5);
			local46 = local41 >> 3;
			local256 = local41 & 0x7;
			local261 = Static671.aClass245Array1[arg0].anInt6983;
			local269 = local46 + (local261 >> 28) & 0x3;
			local121 = local261 >> 14 & 0xFF;
			local125 = local261 & 0xFF;
			if (local256 == 0) {
				local125--;
				local121--;
			}
			if (local256 == 1) {
				local125--;
			}
			if (local256 == 2) {
				local125--;
				local121++;
			}
			if (local256 == 3) {
				local121--;
			}
			if (local256 == 4) {
				local121++;
			}
			if (local256 == 5) {
				local121--;
				local125++;
			}
			if (local256 == 6) {
				local125++;
			}
			if (local256 == 7) {
				local125++;
				local121++;
			}
			Static671.aClass245Array1[arg0].anInt6983 = local125 + (local269 << 28) + (local121 << 14);
			return false;
		}
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(ILclient!uda;)I")
	public static int method5076(@OriginalArg(1) Class14_Sub2_Sub20 arg0) {
		@Pc(15) String local15 = Static431.method6456(arg0);
		@Pc(17) int[] local17 = null;
		if (Static291.method7605(arg0.anInt10001)) {
			local17 = Static252.aClass56_1.method1052((int) arg0.aLong281).anIntArray409;
		} else if (arg0.anInt10007 != -1) {
			local17 = Static252.aClass56_1.method1052(arg0.anInt10007).anIntArray409;
		} else if (Static621.method8720(arg0.anInt10001)) {
			@Pc(89) Class14_Sub44 local89 = (Class14_Sub44) Static100.aClass125_9.method2630((long) (int) arg0.aLong281);
			if (local89 != null) {
				@Pc(94) Class4_Sub3_Sub3_Sub3_Sub1 local94 = local89.aClass4_Sub3_Sub3_Sub3_Sub1_2;
				@Pc(97) Class362 local97 = local94.aClass362_1;
				if (local97.lb != null) {
					local97 = local97.method8641(Static188.aClass238_1);
				}
				if (local97 != null) {
					local17 = local97.anIntArray550;
				}
			}
		} else if (Static392.method5967(arg0.anInt10001)) {
			@Pc(66) Class128 local66 = Static212.aClass249_4.method6119((int) (arg0.aLong281 >>> 32 & 0x7FFFFFFFL));
			if (local66.anIntArray179 != null) {
				local66 = local66.method2685(Static188.aClass238_1);
			}
			if (local66 != null) {
				local17 = local66.anIntArray182;
			}
		}
		if (local17 != null) {
			local15 = local15 + Static355.method5400(local17);
		}
		@Pc(129) int local129 = Static497.aClass350_9.method8357(Static399.aClass45Array24, local15);
		if (arg0.aBoolean690) {
			local129 += Static594.aClass45_24.method7510() + 4;
		}
		return local129;
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(III)V")
	public static void method5078(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static558.method8063(arg0)) {
			Static489.method7381(Static339.aClass299ArrayArray1[arg0], arg1);
		}
	}
}
