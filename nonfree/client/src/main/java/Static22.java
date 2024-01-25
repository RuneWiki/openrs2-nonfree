import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static22 {

	@OriginalMember(owner = "client!ao", name = "eb", descriptor = "Lclient!ho;")
	public static Class9 aClass9_2;

	@OriginalMember(owner = "client!ao", name = "e", descriptor = "Lclient!jn;")
	public static final Class179 aClass179_19 = new Class179(51, 6);

	@OriginalMember(owner = "client!ao", name = "Y", descriptor = "I")
	public static int anInt521 = 0;

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(III)Lclient!wc;")
	public static Class2_Sub1_Sub2 method528(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class351 local7 = Static441.aClass351ArrayArrayArray1[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass2_Sub1_Sub2_1;
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(IIB)Z")
	public static boolean method529(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x20) != 0;
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(IIILclient!d;Lclient!ha;II)V")
	public static void method543(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Interface6 arg2, @OriginalArg(4) Class132 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (Static115.anInt2066 < 100) {
			Static423.method6281(arg2, arg3);
		}
		arg3.KA(arg5, arg1, arg5 + arg4, arg0 + arg1);
		@Pc(35) int local35;
		@Pc(53) int local53;
		if (Static115.anInt2066 < 100) {
			local35 = arg4 / 2 + arg5;
			arg3.aa(arg5, arg1, arg4, arg0, -16777216, 0);
			local53 = arg0 / 2 + arg1 - 38;
			arg3.method7481(local35 - 152, local53, 304, 34, Static83.aColorArray1[Static654.anInt2126].getRGB(), 0);
			arg3.aa(local35 - 150, local53 + 2, Static115.anInt2066 * 3, 30, Static333.aColorArray3[Static654.anInt2126].getRGB(), 0);
			Static51.aClass19_4.method6328(local53 + 20, Static327.aColorArray2[Static654.anInt2126].getRGB(), Static52.aClass41_18.method1007(Static616.anInt10077), -1, local35);
			return;
		}
		@Pc(108) int local108 = Static417.anInt7258 - (int) ((float) arg4 / Static528.aFloat39);
		local35 = (int) ((float) arg0 / Static528.aFloat39) + Static490.anInt8337;
		local53 = Static417.anInt7258 + (int) ((float) arg4 / Static528.aFloat39);
		Static71.anInt1358 = Static490.anInt8337 - (int) ((float) arg0 / Static528.aFloat39);
		Static630.anInt6216 = (int) ((float) (arg0 * 2) / Static528.aFloat39);
		@Pc(155) int local155 = Static490.anInt8337 - (int) ((float) arg0 / Static528.aFloat39);
		Static340.anInt5881 = (int) ((float) (arg4 * 2) / Static528.aFloat39);
		Static262.anInt6203 = Static417.anInt7258 - (int) ((float) arg4 / Static528.aFloat39);
		Static528.method4530(local108 + Static528.anInt5361, local35 - -Static528.anInt5366, local53 + Static528.anInt5361, Static528.anInt5366 + local155, arg5, arg1, arg5 + arg4, arg1 - -arg0 + 1);
		Static528.method4535(arg3);
		@Pc(205) Class362 local205 = Static528.method4537(arg3);
		Static95.method1561(arg3, local205);
		if (Static30.anInt677 > 0) {
			Static600.anInt9797--;
			if (Static600.anInt9797 == 0) {
				Static600.anInt9797 = 20;
				Static30.anInt677--;
			}
		}
		if (!Static544.aBoolean667) {
			return;
		}
		@Pc(240) int local240 = arg5 + arg4 - 5;
		@Pc(246) int local246 = arg0 + arg1 - 8;
		Static423.aClass19_9.method6319(local246, 16776960, "Fps:" + Static490.anInt8338, local240, -1);
		@Pc(261) int local261 = local246 - 15;
		@Pc(263) Runtime local263 = Runtime.getRuntime();
		@Pc(273) int local273 = (int) ((local263.totalMemory() - local263.freeMemory()) / 1024L);
		@Pc(275) int local275 = 16776960;
		if (local273 > 65536) {
			local275 = 16711680;
		}
		Static423.aClass19_9.method6319(local261, local275, "Mem:" + local273 + "k", local240, -1);
		local246 = local261 - 15;
	}
}
