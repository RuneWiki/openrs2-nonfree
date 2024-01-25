import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static264 {

	@OriginalMember(owner = "client!nc", name = "u", descriptor = "Lclient!ok;")
	public static Class178 aClass178_80;

	@OriginalMember(owner = "client!nc", name = "I", descriptor = "I")
	public static int anInt4480;

	@OriginalMember(owner = "client!nc", name = "J", descriptor = "I")
	public static final int anInt4481 = 52;

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(Lclient!sh;FFIIIBFIFF)[B")
	public static byte[] method3567(@OriginalArg(0) Class72 arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(7) float arg3, @OriginalArg(9) float arg4, @OriginalArg(10) float arg5) {
		@Pc(15) byte[] local15 = new byte[262144];
		Static415.method5220(0, arg0, arg4, arg1, arg3, local15, arg5, arg2);
		return local15;
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(IBII)I")
	public static int method3568(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(13) int local13 = 255 - arg1;
		@Pc(31) int local31 = (arg1 * (arg2 & 0xFF00) & 0xFF0000 | arg1 * (arg2 & 0xFF00FF) & 0xFF00FF00) >>> 8;
		return (((arg0 & 0xFF00FF) * local13 & 0xFF00FF00 | (arg0 & 0xFF00) * local13 & 0xFF0000) >>> 8) + local31;
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(IIIBZI)V")
	public static void method3569(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4) {
		if (Static145.aFrame4 != null && (arg2 != 3 || arg1 != Static130.aClass153_Sub1_1.anInt5241 || Static130.aClass153_Sub1_1.anInt5239 != arg4)) {
			Static39.method562(Static230.aClass61_4, Static145.aFrame4);
			Static145.aFrame4 = null;
		}
		if (arg2 == 3 && Static145.aFrame4 == null) {
			Static145.aFrame4 = Static124.method2023(Static230.aClass61_4, 0, arg4, arg1);
			if (Static145.aFrame4 != null) {
				Static130.aClass153_Sub1_1.anInt5239 = arg4;
				Static130.aClass153_Sub1_1.anInt5241 = arg1;
				Static130.aClass153_Sub1_1.method4228(Static230.aClass61_4);
			}
		}
		if (arg2 == 3 && Static145.aFrame4 == null) {
			method3569(arg0, -1, Static130.aClass153_Sub1_1.anInt5233, true, -1);
			return;
		}
		@Pc(107) Container local107;
		if (Static145.aFrame4 != null) {
			local107 = Static145.aFrame4;
			Static439.anInt7322 = arg4;
			Static382.anInt6127 = arg1;
		} else if (Static452.aFrame5 == null) {
			local107 = Static230.aClass61_4.anApplet1;
			Static382.anInt6127 = local107.getSize().width;
			Static439.anInt7322 = local107.getSize().height;
		} else {
			@Pc(82) Insets local82 = Static452.aFrame5.getInsets();
			@Pc(88) int local88 = -local82.left;
			Static382.anInt6127 = Static452.aFrame5.getSize().width + local88 - local82.right;
			Static439.anInt7322 = Static452.aFrame5.getSize().height - local82.top - local82.bottom;
			local107 = Static452.aFrame5;
		}
		@Pc(166) int local166;
		if (arg2 == 1) {
			Static445.anInt1110 = 0;
			Static286.anInt4051 = Static81.anInt1634;
			Static148.anInt2796 = (Static382.anInt6127 - Static448.anInt7377) / 2;
			Static251.anInt4258 = Static448.anInt7377;
		} else if (Static268.anInt4537 < 96 && Static377.anInt6113 == 0) {
			@Pc(157) int local157 = Static382.anInt6127 <= 1024 ? Static382.anInt6127 : 1024;
			local166 = Static439.anInt7322 <= 768 ? Static439.anInt7322 : 768;
			Static251.anInt4258 = local157;
			Static148.anInt2796 = (Static382.anInt6127 - local157) / 2;
			Static286.anInt4051 = local166;
			Static445.anInt1110 = 0;
		} else {
			Static251.anInt4258 = Static382.anInt6127;
			Static286.anInt4051 = Static439.anInt7322;
			Static445.anInt1110 = 0;
			Static148.anInt2796 = 0;
		}
		if (Static313.aClass136_7 != Static167.aClass136_5) {
			@Pc(206) boolean local206;
			if (Static251.anInt4258 < 1024 && Static286.anInt4051 < 768) {
				local206 = true;
			} else {
				local206 = false;
			}
		}
		if (arg3) {
			Static357.method4567();
		} else {
			Static95.aCanvas3.setSize(Static251.anInt4258, Static286.anInt4051);
			Static269.aClass51_9.method5309(Static95.aCanvas3);
			if (Static452.aFrame5 == local107) {
				@Pc(236) Insets local236 = Static452.aFrame5.getInsets();
				Static95.aCanvas3.setLocation(Static148.anInt2796 + local236.left, Static445.anInt1110 + local236.top);
			} else {
				Static95.aCanvas3.setLocation(Static148.anInt2796, Static445.anInt1110);
			}
		}
		if (arg2 < 2) {
			Static75.aBoolean88 = false;
		} else {
			Static75.aBoolean88 = true;
		}
		if (Static183.anInt3293 != -1) {
			Static301.method4014(true);
		}
		if (Static211.aClass247_4 != null && Static252.method3357(Static206.anInt3642)) {
			Static154.method2304();
		}
		for (local166 = 0; local166 < 100; local166++) {
			Static69.aBooleanArray2[local166] = true;
		}
		Static124.aBoolean135 = true;
	}
}
