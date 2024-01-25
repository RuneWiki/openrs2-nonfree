import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static230 {

	@OriginalMember(owner = "client!ht", name = "B", descriptor = "[I")
	public static int[] anIntArray333;

	@OriginalMember(owner = "client!ht", name = "C", descriptor = "[I")
	public static int[] anIntArray334;

	@OriginalMember(owner = "client!ht", name = "A", descriptor = "[F")
	public static final float[] aFloatArray27 = new float[4];

	@OriginalMember(owner = "client!ht", name = "D", descriptor = "[I")
	public static int[] anIntArray335 = new int[2];

	@OriginalMember(owner = "client!ht", name = "E", descriptor = "Lclient!wv;")
	public static final Class395 aClass395_9 = new Class395(3, -1);

	@OriginalMember(owner = "client!ht", name = "c", descriptor = "(I)V")
	public static void method3499() {
		@Pc(7) client local7 = Static243.aClient1;
		synchronized (Static243.aClient1) {
			if (Static628.aFrame3 == null) {
				@Pc(23) Container local23;
				if (Static339.aFrame2 != null) {
					local23 = Static339.aFrame2;
				} else if (Static645.anApplet2 == null) {
					local23 = Static164.anApplet_Sub1_1;
				} else {
					local23 = Static645.anApplet2;
				}
				Static69.anInt1570 = local23.getSize().width;
				Static572.anInt9840 = local23.getSize().height;
				@Pc(47) Insets local47;
				if (Static339.aFrame2 == local23) {
					local47 = Static339.aFrame2.getInsets();
					Static572.anInt9840 -= local47.top + local47.bottom;
					Static69.anInt1570 -= local47.right + local47.left;
				}
				if (Static482.method7137() == 1) {
					Static406.anInt7435 = 0;
					Static639.anInt10685 = Static297.anInt5240;
					Static561.anInt9759 = Static258.anInt4461;
					Static535.anInt9235 = (Static69.anInt1570 - Static258.anInt4461) / 2;
				} else {
					Static437.method6437();
				}
				if (Static513.aClass240_7 != Static420.aClass240_5) {
					@Pc(96) boolean local96;
					if (Static561.anInt9759 < 1024 && Static639.anInt10685 < 768) {
						local96 = true;
					} else {
						local96 = false;
					}
				}
				Static68.aCanvas2.setSize(Static561.anInt9759, Static639.anInt10685);
				if (Static677.aClass137_47 != null) {
					if (Static128.aBoolean202) {
						Static127.method2103(Static68.aCanvas2);
					} else {
						Static677.aClass137_47.method7898(Static68.aCanvas2, Static561.anInt9759, Static639.anInt10685);
					}
				}
				if (Static339.aFrame2 == local23) {
					local47 = Static339.aFrame2.getInsets();
					Static68.aCanvas2.setLocation(local47.left + Static535.anInt9235, local47.top + Static406.anInt7435);
				} else {
					Static68.aCanvas2.setLocation(Static535.anInt9235, Static406.anInt7435);
				}
				if (Static563.anInt9769 != -1) {
					Static552.method7778(true);
				}
				Static357.method5405();
			}
		}
	}

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(FFBF)I")
	public static int method3500(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(3) float arg2) {
		@Pc(17) float local17 = arg2 < 0.0F ? -arg2 : arg2;
		@Pc(26) float local26 = arg0 < 0.0F ? -arg0 : arg0;
		@Pc(35) float local35 = arg1 < 0.0F ? -arg1 : arg1;
		if (local17 < local26 && local35 < local26) {
			return arg0 > 0.0F ? 0 : 1;
		} else if (local35 > local17 && local26 < local35) {
			return arg1 > 0.0F ? 2 : 3;
		} else if (arg2 > 0.0F) {
			return 4;
		} else {
			return 5;
		}
	}
}
