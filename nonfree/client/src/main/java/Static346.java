import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static346 {

	@OriginalMember(owner = "client!ln", name = "c", descriptor = "I")
	public static int anInt6094;

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(Lclient!la;ZLclient!mca;)V")
	public static void method5219(@OriginalArg(0) Class208 arg0, @OriginalArg(2) Class230 arg1) {
		Static357.aClass208_80 = arg0;
		Static580.aClass230_5 = arg1;
		Static114.aString32 = "";
		if (Class99_Sub7.aString107.startsWith("win")) {
			Static114.aString32 = Static114.aString32 + "windows/";
		} else if (Class99_Sub7.aString107.startsWith("linux")) {
			Static114.aString32 = Static114.aString32 + "linux/";
		} else if (Class99_Sub7.aString107.startsWith("mac")) {
			Static114.aString32 = Static114.aString32 + "macos/";
		}
		if (Static580.aClass230_5.aBoolean472) {
			Static114.aString32 = Static114.aString32 + "msjava/";
		} else if (Class99_Sub7.aString108.startsWith("amd64") || Class99_Sub7.aString108.startsWith("x86_64")) {
			Static114.aString32 = Static114.aString32 + "x86_64/";
		} else if (Class99_Sub7.aString108.startsWith("i386") || Class99_Sub7.aString108.startsWith("i486") || Class99_Sub7.aString108.startsWith("i586") || Class99_Sub7.aString108.startsWith("x86")) {
			Static114.aString32 = Static114.aString32 + "x86/";
		} else if (Class99_Sub7.aString108.startsWith("ppc")) {
			Static114.aString32 = Static114.aString32 + "ppc/";
		} else {
			Static114.aString32 = Static114.aString32 + "universal/";
		}
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(IILclient!d;IIILclient!ha;)V")
	public static void method5220(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Interface1 arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class57 arg5) {
		if (Static270.anInt4694 < 100) {
			Static200.method2868(arg2, arg5);
		}
		arg5.KA(arg0, arg4, arg1 + arg0, arg4 - -arg3);
		@Pc(46) int local46;
		@Pc(65) int local65;
		if (Static270.anInt4694 < 100) {
			local46 = arg0 + arg1 / 2;
			arg5.aa(arg0, arg4, arg1, arg3, -16777216, 0);
			local65 = arg3 / 2 + arg4 - 18 - 20;
			arg5.method7681(local46 - 152, local65, 304, 34, Static11.aColorArray1[Static530.anInt8943].getRGB(), 0);
			arg5.aa(local46 - 150, local65 + 2, Static270.anInt4694 * 3, 30, Static134.aColorArray2[Static530.anInt8943].getRGB(), 0);
			Static533.aClass80_10.method8792(local46, local65 + 20, Static523.aColorArray3[Static530.anInt8943].getRGB(), -1, Static582.aClass335_19.method8349(Static323.anInt5795));
			return;
		}
		@Pc(121) int local121 = Static622.anInt10186 - (int) ((float) arg1 / Static629.aFloat203);
		local46 = Static448.anInt7716 + (int) ((float) arg3 / Static629.aFloat203);
		local65 = Static622.anInt10186 + (int) ((float) arg1 / Static629.aFloat203);
		Static645.anInt10500 = (int) ((float) (arg3 * 2) / Static629.aFloat203);
		@Pc(156) int local156 = Static448.anInt7716 - (int) ((float) arg3 / Static629.aFloat203);
		Static242.anInt4082 = Static622.anInt10186 - (int) ((float) arg1 / Static629.aFloat203);
		Static72.anInt1150 = Static448.anInt7716 - (int) ((float) arg3 / Static629.aFloat203);
		Static267.anInt4662 = (int) ((float) (arg1 * 2) / Static629.aFloat203);
		Static629.method8375(local121 + Static629.anInt9765, Static629.anInt9763 + local46, Static629.anInt9765 + local65, Static629.anInt9763 + local156, arg0, arg4, arg0 + arg1, arg3 + 1 + arg4);
		Static629.method8393(arg5);
		@Pc(211) Class102 local211 = Static629.method8378(arg5);
		Static548.method7973(arg5, local211);
		if (Static31.anInt506 > 0) {
			Static333.anInt5936--;
			if (Static333.anInt5936 == 0) {
				Static31.anInt506--;
				Static333.anInt5936 = 20;
			}
		}
		if (!Static443.aBoolean588) {
			return;
		}
		@Pc(244) int local244 = arg0 + arg1 - 5;
		@Pc(250) int local250 = arg3 + arg4 - 8;
		Static582.aClass80_12.method8796(local244, "Fps:" + Static57.anInt866, 16776960, -1, local250);
		@Pc(267) int local267 = local250 - 15;
		@Pc(269) Runtime local269 = Runtime.getRuntime();
		@Pc(279) int local279 = (int) ((local269.totalMemory() - local269.freeMemory()) / 1024L);
		@Pc(281) int local281 = 16776960;
		if (local279 > 65536) {
			local281 = 16711680;
		}
		Static582.aClass80_12.method8796(local244, "Mem:" + local279 + "k", local281, -1, local267);
		local250 = local267 - 15;
	}
}
