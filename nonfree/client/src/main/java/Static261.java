import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static261 {

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "Lclient!laa;")
	public static final Class179 aClass179_4 = new Class179(8, 0, 4, 1);

	@OriginalMember(owner = "client!kc", name = "c", descriptor = "Lclient!fc;")
	public static final Class98 aClass98_67 = new Class98(105, 2);

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(I)[Lclient!cc;")
	public static Class45[] method3995() {
		return new Class45[] { Static101.aClass45_4, Static89.aClass45_2, Static336.aClass45_5, Static575.aClass45_8, Static9.aClass45_1, Static409.aClass45_7 };
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(IIIBLclient!e;Lclient!oa;I)V")
	public static void method3997(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Interface2 arg3, @OriginalArg(5) Class90 arg4, @OriginalArg(6) int arg5) {
		if (Static91.anInt1503 < 100) {
			Static226.method3554(arg4, arg3);
		}
		arg4.ca(arg5, arg2, arg1 + arg5, arg0 + arg2);
		@Pc(33) int local33;
		@Pc(45) int local45;
		if (Static91.anInt1503 < 100) {
			local33 = arg5 + arg1 / 2;
			local45 = arg2 + arg0 / 2 - 20 - 18;
			arg4.C(arg5, arg2, arg1, arg0, -16777216, 0);
			arg4.method7494(local33 - 152, local45, 304, 34, Static240.aColorArray1[Static187.anInt3680].getRGB(), 0);
			arg4.C(local33 - 150, local45 - -2, Static91.anInt1503 * 3, 30, Static379.aColorArray3[Static187.anInt3680].getRGB(), 0);
			Static264.aClass82_3.method7873(Static271.aColorArray2[Static187.anInt3680].getRGB(), local45 + 20, Static146.aClass103_65.method2355(Static188.anInt28), local33, -1);
			return;
		}
		@Pc(111) int local111 = Static441.anInt3925 - (int) ((float) arg1 / Static490.aFloat34);
		local33 = (int) ((float) arg0 / Static490.aFloat34) + Static30.anInt535;
		local45 = Static441.anInt3925 + (int) ((float) arg1 / Static490.aFloat34);
		@Pc(136) int local136 = Static30.anInt535 - (int) ((float) arg0 / Static490.aFloat34);
		Static426.anInt7573 = (int) ((float) (arg0 * 2) / Static490.aFloat34);
		Static192.anInt3742 = Static441.anInt3925 - (int) ((float) arg1 / Static490.aFloat34);
		Static577.anInt9918 = Static30.anInt535 - (int) ((float) arg0 / Static490.aFloat34);
		Static501.anInt8701 = (int) ((float) (arg1 * 2) / Static490.aFloat34);
		Static490.method1735(Static490.anInt1918 + local111, Static490.anInt1917 + local33, local45 + Static490.anInt1918, local136 - -Static490.anInt1917, arg5, arg2, arg1 + arg5, arg0 + 1 + arg2);
		Static490.method1740(arg4);
		@Pc(200) Class298 local200 = Static490.method1741(arg4);
		Static244.method3823(arg4, local200);
		if (Static49.anInt883 > 0) {
			Static190.anInt7946--;
			if (Static190.anInt7946 == 0) {
				Static190.anInt7946 = 20;
				Static49.anInt883--;
			}
		}
		if (!Static32.aBoolean33) {
			return;
		}
		@Pc(238) int local238 = arg1 + arg5 - 5;
		@Pc(244) int local244 = arg0 + arg2 - 8;
		Static75.aClass82_1.method7868(local244, local238, 16776960, "Fps:" + Static236.anInt4289, -1);
		@Pc(259) int local259 = local244 - 15;
		@Pc(261) Runtime local261 = Runtime.getRuntime();
		@Pc(271) int local271 = (int) ((local261.totalMemory() - local261.freeMemory()) / 1024L);
		@Pc(273) int local273 = 16776960;
		if (local271 > 65536) {
			local273 = 16711680;
		}
		Static75.aClass82_1.method7868(local259, local238, local273, "Mem:" + local271 + "k", -1);
		local244 = local259 - 15;
	}
}
