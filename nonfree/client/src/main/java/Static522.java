import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static522 {

	@OriginalMember(owner = "client!rea", name = "Pb", descriptor = "I")
	public static int anInt8991 = 0;

	@OriginalMember(owner = "client!rea", name = "i", descriptor = "(B)V")
	public static void method7762() {
		Static89.aClass207_3.method5066();
		Static656.aClass118_1.method7592();
		Static105.aClient4.method1347();
		Static626.aCanvas12.setBackground(Color.black);
		Static582.anInt9621 = -1;
		Static89.aClass207_3 = Static289.method4814(Static626.aCanvas12);
		Static656.aClass118_1 = Static540.method7941(Static626.aCanvas12);
	}

	@OriginalMember(owner = "client!rea", name = "a", descriptor = "(IILclient!d;ILclient!ha;II)V")
	public static void method7763(@OriginalArg(0) int arg0, @OriginalArg(2) Interface4 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class144 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (Static120.anInt1937 < 100) {
			Static88.method1476(arg3, arg1);
		}
		arg3.KA(arg2, arg4, arg2 + arg0, arg4 - -arg5);
		@Pc(37) int local37;
		@Pc(56) int local56;
		if (Static120.anInt1937 < 100) {
			local37 = arg2 + arg0 / 2;
			arg3.aa(arg2, arg4, arg0, arg5, -16777216, 0);
			local56 = arg4 + arg5 / 2 - 18 - 20;
			arg3.method6923(local37 - 152, local56, 304, 34, Static590.aColorArray2[Static510.anInt8857].getRGB(), 0);
			arg3.aa(local37 - 150, local56 + 2, Static120.anInt1937 * 3, 30, Static537.aColorArray1[Static510.anInt8857].getRGB(), 0);
			Static255.aClass68_4.method9441(-1, Static667.aColorArray3[Static510.anInt8857].getRGB(), Static21.aClass21_17.method324(Static26.anInt352), local56 + 20, local37);
			return;
		}
		@Pc(112) int local112 = Static97.anInt1683 - (int) ((float) arg0 / Static224.aFloat10);
		local37 = (int) ((float) arg5 / Static224.aFloat10) + Static381.anInt6704;
		local56 = (int) ((float) arg0 / Static224.aFloat10) + Static97.anInt1683;
		@Pc(144) int local144 = Static381.anInt6704 - (int) ((float) arg5 / Static224.aFloat10);
		Static176.anInt2886 = (int) ((float) (arg5 * 2) / Static224.aFloat10);
		Static297.anInt5327 = Static381.anInt6704 - (int) ((float) arg5 / Static224.aFloat10);
		Static674.anInt11001 = Static97.anInt1683 - (int) ((float) arg0 / Static224.aFloat10);
		Static661.anInt10786 = (int) ((float) (arg0 * 2) / Static224.aFloat10);
		Static224.method1302(local112 + Static224.anInt1291, Static224.anInt1292 + local37, Static224.anInt1291 + local56, local144 - -Static224.anInt1292, arg2, arg4, arg0 + arg2, arg4 + 1 + arg5);
		Static224.method1308(arg3);
		@Pc(207) Class32 local207 = Static224.method1307(arg3);
		Static328.method5112(local207, arg3);
		if (Static70.anInt1087 > 0) {
			Static349.anInt5983--;
			if (Static349.anInt5983 == 0) {
				Static70.anInt1087--;
				Static349.anInt5983 = 20;
			}
		}
		if (!Static432.aBoolean511) {
			return;
		}
		@Pc(239) int local239 = arg0 + arg2 - 5;
		@Pc(245) int local245 = arg5 + arg4 - 8;
		Static446.aClass68_8.method9429(16776960, local239, local245, -1, "Fps:" + Static485.anInt8396);
		@Pc(262) int local262 = local245 - 15;
		@Pc(264) Runtime local264 = Runtime.getRuntime();
		@Pc(273) int local273 = (int) ((local264.totalMemory() - local264.freeMemory()) / 1024L);
		@Pc(275) int local275 = 16776960;
		if (local273 > 65536) {
			local275 = 16711680;
		}
		Static446.aClass68_8.method9429(local275, local239, local262, -1, "Mem:" + local273 + "k");
		local245 = local262 - 15;
	}
}
