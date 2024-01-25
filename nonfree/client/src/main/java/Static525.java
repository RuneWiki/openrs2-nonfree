import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static525 {

	@OriginalMember(owner = "client!ur", name = "F", descriptor = "I")
	public static int anInt9113;

	@OriginalMember(owner = "client!ur", name = "C", descriptor = "D")
	public static double aDouble8 = -1.0D;

	@OriginalMember(owner = "client!ur", name = "H", descriptor = "[I")
	public static final int[] anIntArray799 = new int[13];

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(IILclient!oa;IBILclient!e;)V")
	public static void method7652(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class9 arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Interface2 arg5) {
		if (Static297.anInt4703 < 100) {
			Static151.method2924(arg2, arg5);
		}
		arg2.ca(arg1, arg4, arg1 + arg0, arg3 + arg4);
		@Pc(35) int local35;
		@Pc(46) int local46;
		if (Static297.anInt4703 < 100) {
			local35 = arg0 / 2 + arg1;
			local46 = arg4 + arg3 / 2 - 18 - 20;
			arg2.C(arg1, arg4, arg0, arg3, -16777216, 0);
			arg2.method5436(local35 - 152, local46, 304, 34, Static431.aColorArray4[Static287.anInt5471].getRGB(), 0);
			arg2.C(local35 - 150, local46 + 2, Static297.anInt4703 * 3, 30, Static459.aColorArray3[Static287.anInt5471].getRGB(), 0);
			Static489.aClass73_5.method7892(local35, local46 + 20, Static222.aClass152_63.method4002(Static286.anInt5468), Static17.aColorArray1[Static287.anInt5471].getRGB(), -1);
			return;
		}
		@Pc(115) int local115 = Static556.anInt9488 - (int) ((float) arg0 / Static461.aFloat3);
		local35 = (int) ((float) arg3 / Static461.aFloat3) + Static567.anInt7671;
		local46 = (int) ((float) arg0 / Static461.aFloat3) + Static556.anInt9488;
		Static183.anInt4068 = (int) ((float) (arg3 * 2) / Static461.aFloat3);
		Static409.anInt7647 = Static556.anInt9488 - (int) ((float) arg0 / Static461.aFloat3);
		Static473.anInt8687 = Static567.anInt7671 - (int) ((float) arg3 / Static461.aFloat3);
		@Pc(165) int local165 = Static567.anInt7671 - (int) ((float) arg3 / Static461.aFloat3);
		Static288.anInt5497 = (int) ((float) (arg0 * 2) / Static461.aFloat3);
		Static461.method87(Static461.anInt57 + local115, local35 + Static461.anInt58, local46 + Static461.anInt57, Static461.anInt58 + local165, arg1, arg4, arg1 + arg0, arg3 + arg4 - -1);
		Static461.method100(arg2);
		@Pc(201) Class211 local201 = Static461.method86(arg2);
		Static444.method6824(local201, arg2);
		if (Static137.anInt2914 > 0) {
			Static447.anInt8208--;
			if (Static447.anInt8208 == 0) {
				Static137.anInt2914--;
				Static447.anInt8208 = 20;
			}
		}
		if (!Static266.aBoolean375) {
			return;
		}
		@Pc(232) int local232 = arg1 + arg0 - 5;
		@Pc(238) int local238 = arg3 + arg4 - 8;
		Static42.aClass73_1.method7893(local232, -1, "Fps:" + Static56.anInt9395, 16776960, local238);
		@Pc(253) int local253 = local238 - 15;
		@Pc(255) Runtime local255 = Runtime.getRuntime();
		@Pc(264) int local264 = (int) ((local255.totalMemory() - local255.freeMemory()) / 1024L);
		@Pc(266) int local266 = 16776960;
		if (local264 > 65536) {
			local266 = 16711680;
		}
		Static42.aClass73_1.method7893(local232, -1, "Mem:" + local264 + "k", local266, local253);
		local238 = local253 - 15;
	}
}
