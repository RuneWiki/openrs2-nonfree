import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static232 {

	@OriginalMember(owner = "client!ji", name = "V", descriptor = "Lclient!ffa;")
	public static final Class94 aClass94_5 = new Class94(16);

	@OriginalMember(owner = "client!ji", name = "fb", descriptor = "Lclient!sv;")
	public static final Class311 aClass311_6 = new Class311();

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(Lclient!wda;)V")
	public static void method6006(@OriginalArg(0) Class4_Sub1 arg0) {
		for (@Pc(2) int local2 = arg0.aShort126; local2 <= arg0.aShort123; local2++) {
			for (@Pc(6) int local6 = arg0.aShort125; local6 <= arg0.aShort124; local6++) {
				@Pc(16) Class276 local16 = Static270.aClass276ArrayArrayArray2[arg0.aByte108][local2][local6];
				if (local16 != null) {
					@Pc(21) Class267 local21 = local16.aClass267_3;
					@Pc(23) Class267 local23 = null;
					while (local21 != null) {
						if (local21.aClass4_Sub1_2 == arg0) {
							if (local23 == null) {
								local16.aClass267_3 = local21.aClass267_2;
							} else {
								local23.aClass267_2 = local21.aClass267_2;
							}
							local21.method5991();
							break;
						}
						local23 = local21;
						local21 = local21.aClass267_2;
					}
					local16.aByte86 = 0;
					for (@Pc(56) Class267 local56 = local16.aClass267_3; local56 != null; local56 = local56.aClass267_2) {
						local16.aByte86 = (byte) (local16.aByte86 | local56.anInt7270);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(Lclient!oa;IIIILclient!e;I)V")
	public static void method6051(@OriginalArg(0) Class14 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Interface4 arg4, @OriginalArg(6) int arg5) {
		if (Static585.anInt9508 < 100) {
			Static102.method1826(arg4, arg0);
		}
		arg0.ca(arg5, arg3, arg2 + arg5, arg1 + arg3);
		@Pc(31) int local31;
		@Pc(42) int local42;
		if (Static585.anInt9508 < 100) {
			local31 = arg2 / 2 + arg5;
			local42 = arg1 / 2 + arg3 - 38;
			arg0.C(arg5, arg3, arg2, arg1, -16777216, 0);
			arg0.method6875(local31 - 152, local42, 304, 34, Static377.aColorArray3[Static178.anInt3725].getRGB(), 0);
			arg0.C(local31 - 150, local42 + 2, Static585.anInt9508 * 3, 30, Static95.aColorArray1[Static178.anInt3725].getRGB(), 0);
			Static114.aClass92_4.method6387(local31, Static230.aClass156_17.method4065(Static25.anInt769), Static170.aColorArray2[Static178.anInt3725].getRGB(), -1, local42 + 20);
			return;
		}
		@Pc(105) int local105 = Static39.anInt4953 - (int) ((float) arg2 / Static217.aFloat73);
		local31 = Static538.anInt8915 + (int) ((float) arg1 / Static217.aFloat73);
		local42 = Static39.anInt4953 + (int) ((float) arg2 / Static217.aFloat73);
		Static91.anInt1775 = (int) ((float) (arg2 * 2) / Static217.aFloat73);
		Static491.anInt8273 = Static39.anInt4953 - (int) ((float) arg2 / Static217.aFloat73);
		@Pc(145) int local145 = Static538.anInt8915 - (int) ((float) arg1 / Static217.aFloat73);
		Static350.anInt6235 = Static538.anInt8915 - (int) ((float) arg1 / Static217.aFloat73);
		Static66.anInt1326 = (int) ((float) (arg1 * 2) / Static217.aFloat73);
		Static217.method3373(Static217.anInt3835 + local105, local31 + Static217.anInt3841, local42 + Static217.anInt3835, Static217.anInt3841 + local145, arg5, arg3, arg2 + arg5, arg1 + arg3 + 1);
		Static217.method3356(arg0);
		@Pc(190) Class361 local190 = Static217.method3360(arg0);
		Static486.method6665(arg0, local190);
		if (Static186.anInt3869 > 0) {
			Static230.anInt4710--;
			if (Static230.anInt4710 == 0) {
				Static230.anInt4710 = 20;
				Static186.anInt3869--;
			}
		}
		if (!Static43.aBoolean62) {
			return;
		}
		@Pc(227) int local227 = arg5 + arg2 - 5;
		@Pc(233) int local233 = arg1 + arg3 - 8;
		Static101.aClass92_9.method6388(16776960, local233, "Fps:" + Static367.anInt6478, local227);
		@Pc(248) int local248 = local233 - 15;
		@Pc(250) Runtime local250 = Runtime.getRuntime();
		@Pc(259) int local259 = (int) ((local250.totalMemory() - local250.freeMemory()) / 1024L);
		@Pc(261) int local261 = 16776960;
		if (local259 > 65536) {
			local261 = 16711680;
		}
		Static101.aClass92_9.method6388(local261, local248, "Mem:" + local259 + "k", local227);
		local233 = local248 - 15;
	}
}
