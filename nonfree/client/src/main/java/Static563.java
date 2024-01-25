import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static563 {

	@OriginalMember(owner = "client!vo", name = "P", descriptor = "I")
	public static int anInt10263;

	@OriginalMember(owner = "client!vo", name = "Q", descriptor = "F")
	public static float aFloat204;

	@OriginalMember(owner = "client!vo", name = "z", descriptor = "Lclient!el;")
	public static final Class95 aClass95_5 = new Class95();

	@OriginalMember(owner = "client!vo", name = "S", descriptor = "I")
	public static int anInt10265 = 0;

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(BILclient!r;IIILclient!fa;)V")
	public static void method7954(@OriginalArg(1) int arg0, @OriginalArg(2) Class7 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Interface7 arg5) {
		if (Static142.anInt3092 < 100) {
			Static144.method2509(arg1, arg5);
		}
		arg1.da(arg3, arg0, arg4 + arg3, arg0 - -arg2);
		@Pc(37) int local37;
		@Pc(57) int local57;
		if (Static142.anInt3092 < 100) {
			local37 = arg3 + arg4 / 2;
			arg1.J(arg3, arg0, arg4, arg2, -16777216, 0);
			local57 = arg0 + arg2 / 2 - 20 - 18;
			arg1.method7824(local37 - 152, local57, 304, 34, Static283.aColorArray1[Static484.anInt9199].getRGB(), 0);
			arg1.J(local37 - 150, local57 - -2, Static142.anInt3092 * 3, 30, Static331.aColorArray3[Static484.anInt9199].getRGB(), 0);
			Static306.aClass45_4.method4849(Static590.aColorArray4[Static484.anInt9199].getRGB(), local37, local57 + 20, -1, Static223.aClass152_22.method3624(Static142.anInt3088));
			return;
		}
		@Pc(112) int local112 = Static43.anInt2490 - (int) ((float) arg4 / Static572.aFloat202);
		local37 = Static555.anInt10135 + (int) ((float) arg2 / Static572.aFloat202);
		local57 = (int) ((float) arg4 / Static572.aFloat202) + Static43.anInt2490;
		@Pc(143) int local143 = Static555.anInt10135 - (int) ((float) arg2 / Static572.aFloat202);
		Static366.anInt7070 = (int) ((float) (arg4 * 2) / Static572.aFloat202);
		Static4.anInt1828 = Static43.anInt2490 - (int) ((float) arg4 / Static572.aFloat202);
		Static72.anInt1882 = Static555.anInt10135 - (int) ((float) arg2 / Static572.aFloat202);
		Static481.anInt9094 = (int) ((float) (arg2 * 2) / Static572.aFloat202);
		Static572.method7753(Static572.anInt10056 + local112, Static572.anInt10059 + local37, local57 + Static572.anInt10056, Static572.anInt10059 + local143, arg3, arg0, arg4 + arg3, arg0 - (-arg2 + -1));
		Static572.method7751(arg1);
		@Pc(206) Class22 local206 = Static572.method7769(arg1);
		Static173.method2886(arg1, local206);
		if (Static536.anInt9797 > 0) {
			Static44.anInt1296--;
			if (Static44.anInt1296 == 0) {
				Static44.anInt1296 = 20;
				Static536.anInt9797--;
			}
		}
		if (!Static370.aBoolean508) {
			return;
		}
		@Pc(240) int local240 = arg3 + arg4 - 5;
		@Pc(247) int local247 = arg0 + arg2 - 8;
		Static127.aClass45_1.method4853(16776960, local247, local240, -1, "Fps:" + Static90.anInt2299);
		@Pc(262) int local262 = local247 - 15;
		@Pc(264) Runtime local264 = Runtime.getRuntime();
		@Pc(274) int local274 = (int) ((local264.totalMemory() - local264.freeMemory()) / 1024L);
		@Pc(276) int local276 = 16776960;
		if (local274 > 65536) {
			local276 = 16711680;
		}
		Static127.aClass45_1.method4853(local276, local262, local240, -1, "Mem:" + local274 + "k");
		local247 = local262 - 15;
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(IIIIB)V")
	public static void method7978(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		for (@Pc(14) int local14 = 0; local14 < Static365.anInt7047; local14++) {
			@Pc(20) Rectangle local20 = Class5.aRectangleArray5[local14];
			if (local20.x + local20.width > arg0 && arg2 + arg0 > local20.x && arg1 < local20.y + local20.height && arg3 + arg1 > local20.y) {
				Static322.aBooleanArray15[local14] = true;
			}
		}
	}
}
