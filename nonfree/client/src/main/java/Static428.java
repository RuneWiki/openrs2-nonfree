import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static428 {

	@OriginalMember(owner = "client!pea", name = "d", descriptor = "Lclient!hr;")
	public static final Class146 aClass146_4 = new Class146(1, 2);

	@OriginalMember(owner = "client!pea", name = "a", descriptor = "(B)V")
	public static void method4107() {
		if (Static4.aFrame1 != null) {
			return;
		}
		@Pc(10) int local10 = Static349.anInt6748;
		@Pc(17) int local17 = Static603.anInt9836;
		@Pc(25) int local25 = Static463.anInt7087 - local10 - Static109.anInt2357;
		@Pc(32) int local32 = Static73.anInt1757 - Static330.anInt6165 - local17;
		if (local10 <= 0 && local25 <= 0 && local17 <= 0 && local32 <= 0) {
			return;
		}
		try {
			@Pc(53) Container local53;
			if (Static209.aFrame3 != null) {
				local53 = Static209.aFrame3;
			} else if (Static504.anApplet2 == null) {
				local53 = Static128.anApplet_Sub1_1;
			} else {
				local53 = Static504.anApplet2;
			}
			@Pc(65) int local65 = 0;
			@Pc(67) int local67 = 0;
			if (Static209.aFrame3 == local53) {
				@Pc(73) Insets local73 = Static209.aFrame3.getInsets();
				local65 = local73.left;
				local67 = local73.top;
			}
			@Pc(82) Graphics local82 = local53.getGraphics();
			local82.setColor(Color.black);
			if (local10 > 0) {
				local82.fillRect(local65, local67, local10, Static73.anInt1757);
			}
			if (local17 > 0) {
				local82.fillRect(local65, local67, Static463.anInt7087, local17);
			}
			if (local25 > 0) {
				local82.fillRect(local65 + Static463.anInt7087 - local25, local67, local25, Static73.anInt1757);
			}
			if (local32 > 0) {
				local82.fillRect(local65, local67 + Static73.anInt1757 - local32, Static463.anInt7087, local32);
				return;
			}
		} catch (@Pc(136) Exception local136) {
			return;
		}
	}

	@OriginalMember(owner = "client!pea", name = "a", descriptor = "(BLclient!l;Z)V")
	public static void method4110(@OriginalArg(1) Class4_Sub1_Sub2_Sub1_Sub2 arg0, @OriginalArg(2) boolean arg1) {
		if (Static160.anInt3142 >= 400) {
			return;
		}
		if (Static477.aClass4_Sub1_Sub2_Sub1_Sub2_2 != arg0) {
			@Pc(175) String local175;
			@Pc(107) int local107;
			if (arg0.anInt5796 == 0) {
				@Pc(61) boolean local61 = true;
				if (Static477.aClass4_Sub1_Sub2_Sub1_Sub2_2.anInt5826 != -1 && arg0.anInt5826 != -1) {
					@Pc(86) int local86 = arg0.anInt5812 >= Static477.aClass4_Sub1_Sub2_Sub1_Sub2_2.anInt5812 ? arg0.anInt5812 : Static477.aClass4_Sub1_Sub2_Sub1_Sub2_2.anInt5812;
					@Pc(97) int local97 = Static477.aClass4_Sub1_Sub2_Sub1_Sub2_2.anInt5826 < arg0.anInt5826 ? Static477.aClass4_Sub1_Sub2_Sub1_Sub2_2.anInt5826 : arg0.anInt5826;
					local107 = local86 * 10 / 100 + local97 + 5;
					@Pc(113) int local113 = Static477.aClass4_Sub1_Sub2_Sub1_Sub2_2.anInt5812 - arg0.anInt5812;
					if (local113 < 0) {
						local113 = -local113;
					}
					if (local113 > local107) {
						local61 = false;
					}
				}
				@Pc(136) String local136 = Static212.aClass222_2 == Static542.aClass222_7 ? Static59.aClass43_30.method1598(Static325.anInt6083) : Static59.aClass43_28.method1598(Static325.anInt6083);
				if (arg0.anInt5812 >= arg0.anInt5823) {
					local175 = arg0.method5089() + (local61 ? Static372.method3460(arg0.anInt5812, Static477.aClass4_Sub1_Sub2_Sub1_Sub2_2.anInt5812) : "<col=ffffff>") + " (" + local136 + arg0.anInt5812 + ")";
				} else {
					local175 = arg0.method5089() + (local61 ? Static372.method3460(arg0.anInt5812, Static477.aClass4_Sub1_Sub2_Sub1_Sub2_2.anInt5812) : "<col=ffffff>") + " (" + local136 + arg0.anInt5812 + "+" + (arg0.anInt5823 - arg0.anInt5812) + ")";
				}
			} else if (arg0.anInt5796 == -1) {
				local175 = arg0.method5089();
			} else {
				local175 = arg0.method5089() + " (" + Static59.aClass43_29.method1598(Static325.anInt6083) + arg0.anInt5796 + ")";
			}
			if (Static190.aBoolean232 && !arg1 && (Static37.anInt1189 & 0x8) != 0) {
				Static582.method8234(Static136.aString18, true, 0, false, Static11.aString107 + " -> <col=ffffff>" + local175, 0, (long) arg0.anInt5759, Static262.anInt4805, (long) arg0.anInt5759, 22, -1, false);
			}
			if (arg1) {
				Static582.method8234("<col=cccccc>" + local175, false, 0, false, "", 0, (long) arg0.anInt5759, -1, 0L, -1, 0, true);
			} else {
				for (@Pc(294) int local294 = 7; local294 >= 0; local294--) {
					if (Static602.aStringArray37[local294] != null) {
						@Pc(302) short local302 = 0;
						if (Static232.aClass222_3 == Static212.aClass222_2 && Static602.aStringArray37[local294].equalsIgnoreCase(Static59.aClass43_23.method1598(Static325.anInt6083))) {
							if (Static477.aClass4_Sub1_Sub2_Sub1_Sub2_2.anInt5812 < arg0.anInt5812) {
								local302 = 2000;
							}
							if (Static477.aClass4_Sub1_Sub2_Sub1_Sub2_2.anInt5809 != 0 && arg0.anInt5809 != 0) {
								if (arg0.anInt5809 == Static477.aClass4_Sub1_Sub2_Sub1_Sub2_2.anInt5809) {
									local302 = 2000;
								} else {
									local302 = 0;
								}
							}
						} else if (Static225.aBooleanArray22[local294]) {
							local302 = 2000;
						}
						@Pc(367) short local367 = (short) (local302 + Static253.aShortArray70[local294]);
						local107 = Static429.anIntArray473[local294] == -1 ? Static523.anInt8986 : Static429.anIntArray473[local294];
						Static582.method8234(Static602.aStringArray37[local294], true, 0, false, "<col=ffffff>" + local175, 0, (long) arg0.anInt5759, local107, (long) arg0.anInt5759, local367, -1, false);
					}
				}
			}
			if (!arg1) {
				for (@Pc(451) Class3_Sub4_Sub13 local451 = (Class3_Sub4_Sub13) Static464.aClass223_49.method5874(); local451 != null; local451 = (Class3_Sub4_Sub13) Static464.aClass223_49.method5870()) {
					if (local451.anInt4577 == 5) {
						local451.aString56 = "<col=ffffff>" + local175;
						return;
					}
				}
			}
		} else if (Static190.aBoolean232 && (Static37.anInt1189 & 0x10) != 0) {
			Static582.method8234(Static136.aString18, true, 0, false, Static11.aString107 + " -> <col=ffffff>" + Static59.aClass43_37.method1598(Static325.anInt6083), 0, (long) arg0.anInt5759, Static262.anInt4805, 0L, 23, -1, false);
		}
	}
}
