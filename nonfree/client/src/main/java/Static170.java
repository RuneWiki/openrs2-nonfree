import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static170 {

	@OriginalMember(owner = "client!is", name = "a", descriptor = "I")
	public static int anInt3362 = -1;

	@OriginalMember(owner = "client!is", name = "d", descriptor = "Ljava/lang/String;")
	public static String aString39 = null;

	@OriginalMember(owner = "client!is", name = "e", descriptor = "[F")
	public static final float[] aFloatArray27 = new float[4];

	@OriginalMember(owner = "client!is", name = "f", descriptor = "[I")
	public static final int[] anIntArray301 = new int[32];

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(IZIIIB)V")
	public static void method2746(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (Static150.aFrame5 != null && (arg4 != 3 || arg3 != Static12.aClass79_Sub1_1.anInt4916 || arg2 != Static12.aClass79_Sub1_1.anInt4914)) {
			Static20.method453(Static150.aFrame5, Static43.aClass59_5);
			Static150.aFrame5 = null;
		}
		if (arg4 == 3 && Static150.aFrame5 == null) {
			Static150.aFrame5 = Static424.method5607(0, arg2, Static43.aClass59_5, arg3);
			if (Static150.aFrame5 != null) {
				Static12.aClass79_Sub1_1.anInt4916 = arg3;
				Static12.aClass79_Sub1_1.anInt4914 = arg2;
				Static12.aClass79_Sub1_1.method3969(Static43.aClass59_5);
			}
		}
		if (arg4 == 3 && Static150.aFrame5 == null) {
			method2746(arg0, true, -1, -1, Static12.aClass79_Sub1_1.anInt4917);
			return;
		}
		@Pc(71) Container local71;
		@Pc(82) Insets local82;
		if (Static150.aFrame5 != null) {
			local71 = Static150.aFrame5;
			Static6.anInt215 = arg2;
			Static15.anInt349 = arg3;
		} else if (Static149.aFrame4 == null) {
			local71 = Static43.aClass59_5.anApplet1;
			Static15.anInt349 = local71.getSize().width;
			Static6.anInt215 = local71.getSize().height;
		} else {
			local82 = Static149.aFrame4.getInsets();
			@Pc(90) int local90 = local82.right + local82.left;
			Static15.anInt349 = Static149.aFrame4.getSize().width - local90;
			@Pc(98) int local98 = -local82.bottom;
			Static6.anInt215 = Static149.aFrame4.getSize().height + local98 - local82.top;
			local71 = Static149.aFrame4;
		}
		@Pc(149) int local149;
		if (arg4 == 1) {
			Static434.anInt7172 = (Static15.anInt349 - Static361.anInt6116) / 2;
			Static86.anInt4394 = Static361.anInt6116;
			Static395.anInt6582 = Static41.anInt771;
			Static11.anInt287 = 0;
		} else if (Static7.anInt219 < 96 && Static399.anInt6653 == 0) {
			@Pc(138) int local138 = Static15.anInt349 > 1024 ? 1024 : Static15.anInt349;
			Static86.anInt4394 = local138;
			local149 = Static6.anInt215 > 768 ? 768 : Static6.anInt215;
			Static434.anInt7172 = (Static15.anInt349 - local138) / 2;
			Static395.anInt6582 = local149;
			Static11.anInt287 = 0;
		} else {
			Static86.anInt4394 = Static15.anInt349;
			Static11.anInt287 = 0;
			Static434.anInt7172 = 0;
			Static395.anInt6582 = Static6.anInt215;
		}
		if (Static23.aClass56_1 != Static53.aClass56_2) {
			@Pc(196) boolean local196;
			if (Static86.anInt4394 < 1024 && Static395.anInt6582 < 768) {
				local196 = true;
			} else {
				local196 = false;
			}
		}
		if (arg1) {
			Static85.method1696();
		} else {
			Static339.aCanvas7.setSize(Static86.anInt4394, Static395.anInt6582);
			Static33.aClass49_1.method4419(Static339.aCanvas7);
			if (Static149.aFrame4 == local71) {
				local82 = Static149.aFrame4.getInsets();
				Static339.aCanvas7.setLocation(local82.left + Static434.anInt7172, local82.top + Static11.anInt287);
			} else {
				Static339.aCanvas7.setLocation(Static434.anInt7172, Static11.anInt287);
			}
		}
		if (arg4 >= 2) {
			Static234.aBoolean327 = true;
		} else {
			Static234.aBoolean327 = false;
		}
		if (Static410.anInt6841 != -1) {
			Static64.method1245(true);
		}
		if (Static34.aClass34_2 != null && (Static162.anInt3250 == 30 || Static162.anInt3250 == 25)) {
			Static344.method4736();
		}
		for (local149 = 0; local149 < 100; local149++) {
			Static243.aBooleanArray19[local149] = true;
		}
		Static404.aBoolean456 = true;
	}

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(IIIIIIIII)Z")
	public static boolean method2747(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7) {
		if (arg5 < arg6 + arg1 && arg6 < arg5 + arg7) {
			return arg3 < arg2 + arg4 && arg4 < arg3 + arg0;
		} else {
			return false;
		}
	}
}
