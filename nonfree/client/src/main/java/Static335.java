import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static335 {

	@OriginalMember(owner = "client!nn", name = "d", descriptor = "I")
	public static int anInt6316;

	@OriginalMember(owner = "client!nn", name = "f", descriptor = "Lclient!ha;")
	public static Class25 aClass25_18;

	@OriginalMember(owner = "client!nn", name = "g", descriptor = "Lclient!bv;")
	public static final Class40 aClass40_97 = new Class40("scroll:", "scrollen:", "déroulement:", "rolagem:");

	@OriginalMember(owner = "client!nn", name = "h", descriptor = "Lclient!faa;")
	public static final Class95 aClass95_6 = new Class95();

	@OriginalMember(owner = "client!nn", name = "i", descriptor = "[Ljava/awt/Rectangle;")
	public static final Rectangle[] aRectangleArray2 = new Rectangle[100];

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(III)Z")
	public static boolean method5241(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static293.method4903(arg1, arg0) | (arg0 & 0x70000) != 0 || Static150.method2772(arg1, arg0);
	}

	@OriginalMember(owner = "client!nn", name = "b", descriptor = "(III)V")
	public static void method5242(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class37 local7 = Static152.aClass37ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		if (local7.aClass15_Sub3_3 != null) {
			local7.aClass15_Sub3_3 = null;
		}
		if (local7.aClass15_Sub3_2 != null) {
			local7.aClass15_Sub3_2 = null;
		}
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(II)Lclient!ah;")
	public static Class5_Sub2_Sub1 method5243(@OriginalArg(1) int arg0) {
		@Pc(12) Class5_Sub2_Sub1 local12 = (Class5_Sub2_Sub1) Static58.aClass291_1.method6850((long) arg0);
		if (local12 != null) {
			return local12;
		}
		@Pc(22) byte[] local22 = Static497.aClass117_234.method2962(0, arg0);
		if (local22 == null || local22.length <= 1) {
			return null;
		} else {
			local12 = Static409.method5946(local22);
			Static58.aClass291_1.method6851((long) arg0, local12);
			return local12;
		}
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(IILclient!n;BLclient!qa;II)V")
	public static void method5245(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Interface8 arg2, @OriginalArg(4) Class62 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (Static213.anInt4055 < 100) {
			Static79.method1402(arg3, arg2);
		}
		arg3.N(arg1, arg0, arg5 + arg1, arg4 + arg0);
		@Pc(40) int local40;
		@Pc(52) int local52;
		if (Static213.anInt4055 < 100) {
			local40 = arg5 / 2 + arg1;
			local52 = arg0 + arg4 / 2 - 38;
			arg3.f(arg1, arg0, arg5, arg4, -16777216, 0);
			arg3.method7009(local40 - 152, local52, 304, 34, Static23.aColorArray1[Static165.anInt3315].getRGB(), 0);
			arg3.f(local40 - 150, local52 + 2, Static213.anInt4055 * 3, 30, Static373.aColorArray2[Static165.anInt3315].getRGB(), 0);
			Static130.aClass13_2.method7204(Static314.aClass40_69.method1063(Static194.anInt3737), local40, -1, local52 + 20, Static470.aColorArray3[Static165.anInt3315].getRGB());
			return;
		}
		@Pc(116) int local116 = Static435.anInt7668 - (int) ((float) arg5 / Static245.aFloat312);
		local40 = Static489.anInt8411 + (int) ((float) arg4 / Static245.aFloat312);
		local52 = (int) ((float) arg5 / Static245.aFloat312) + Static435.anInt7668;
		Static469.anInt8088 = (int) ((float) (arg5 * 2) / Static245.aFloat312);
		Static286.anInt5825 = Static435.anInt7668 - (int) ((float) arg5 / Static245.aFloat312);
		Static214.anInt4061 = (int) ((float) (arg4 * 2) / Static245.aFloat312);
		@Pc(165) int local165 = Static489.anInt8411 - (int) ((float) arg4 / Static245.aFloat312);
		Static475.anInt8220 = Static489.anInt8411 - (int) ((float) arg4 / Static245.aFloat312);
		Static245.method5966(local116 + Static245.anInt7314, local40 + Static245.anInt7315, Static245.anInt7314 + local52, Static245.anInt7315 + local165, arg1, arg0, arg1 + arg5, arg0 + arg4 - -1);
		Static245.method5959(arg3);
		@Pc(203) Class99 local203 = Static245.method5948(arg3);
		Static544.method2109(local203, arg3);
		if (Static224.anInt4176 > 0) {
			Static183.anInt4083--;
			if (Static183.anInt4083 == 0) {
				Static224.anInt4176--;
				Static183.anInt4083 = 20;
			}
		}
		if (!Static399.aBoolean506) {
			return;
		}
		@Pc(239) int local239 = arg1 + arg5 - 5;
		@Pc(245) int local245 = arg4 + arg0 - 8;
		Static492.aClass13_3.method7201(local245, local239, "Fps:" + Static115.anInt2500, 16776960);
		@Pc(262) int local262 = local245 - 15;
		@Pc(264) Runtime local264 = Runtime.getRuntime();
		@Pc(274) int local274 = (int) ((local264.totalMemory() - local264.freeMemory()) / 1024L);
		@Pc(276) int local276 = 16776960;
		if (local274 > 65536) {
			local276 = 16711680;
		}
		Static492.aClass13_3.method7201(local262, local239, "Mem:" + local274 + "k", local276);
		local245 = local262 - 15;
	}
}
