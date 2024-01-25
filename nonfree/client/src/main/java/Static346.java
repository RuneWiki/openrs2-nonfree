import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static346 {

	@OriginalMember(owner = "client!ln", name = "n", descriptor = "Lclient!qw;")
	public static Class302 aClass302_39 = new Class302();

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(IIIIZI)V")
	public static void method5028(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4) {
		if (Static438.aFrame1 != null && (arg0 != 3 || arg4 != Static320.anInt5361 || Static463.anInt7388 != arg1)) {
			Static28.method626(Static438.aFrame1, Static566.aClass92_6);
			Static438.aFrame1 = null;
		}
		if (arg0 == 3 && Static438.aFrame1 == null) {
			Static438.aFrame1 = Static131.method2237(0, arg4, Static566.aClass92_6, arg1);
			if (Static438.aFrame1 != null) {
				Static320.anInt5361 = arg4;
				Static463.anInt7388 = arg1;
				Static219.method3247();
			}
		}
		if (arg0 == 3 && Static438.aFrame1 == null) {
			method5028(Static336.aClass3_Sub41_18.aClass14_Sub13_2.method4048(), -1, arg2, true, -1);
			return;
		}
		@Pc(67) Container local67;
		@Pc(96) Insets local96;
		if (Static438.aFrame1 != null) {
			local67 = Static438.aFrame1;
			Static190.anInt3438 = arg4;
			Static674.anInt10898 = arg1;
		} else if (Static572.aFrame2 == null) {
			if (Static339.anApplet2 == null) {
				local67 = Static353.anApplet_Sub1_1;
			} else {
				local67 = Static339.anApplet2;
			}
			Static190.anInt3438 = local67.getSize().width;
			Static674.anInt10898 = local67.getSize().height;
		} else {
			local96 = Static572.aFrame2.getInsets();
			@Pc(102) int local102 = -local96.right;
			Static190.anInt3438 = Static572.aFrame2.getSize().width + local102 - local96.left;
			@Pc(114) int local114 = -local96.bottom;
			Static674.anInt10898 = Static572.aFrame2.getSize().height + local114 - local96.top;
			local67 = Static572.aFrame2;
		}
		if (arg0 == 1) {
			Static640.anInt10686 = 0;
			Static13.anInt306 = Static195.anInt3525;
			Static531.anInt8327 = Static95.anInt9415;
			Static462.anInt7379 = (Static190.anInt3438 - Static95.anInt9415) / 2;
		} else {
			Static39.method753();
		}
		if (Static256.aClass135_4 != Static228.aClass135_3) {
			@Pc(154) boolean local154;
			if (Static531.anInt8327 < 1024 && Static13.anInt306 < 768) {
				local154 = true;
			} else {
				local154 = false;
			}
		}
		if (arg3) {
			Static442.method6035();
		} else {
			Static330.aCanvas5.setSize(Static531.anInt8327, Static13.anInt306);
			if (Static498.aBoolean757) {
				Static22.method527(Static330.aCanvas5);
			} else {
				Static119.aClass95_4.method8067(Static330.aCanvas5, Static531.anInt8327, Static13.anInt306);
			}
			if (local67 == Static572.aFrame2) {
				local96 = Static572.aFrame2.getInsets();
				Static330.aCanvas5.setLocation(Static462.anInt7379 + local96.left, local96.top + Static640.anInt10686);
			} else {
				Static330.aCanvas5.setLocation(Static462.anInt7379, Static640.anInt10686);
			}
		}
		if (arg0 >= 2) {
			Static396.aBoolean454 = true;
		} else {
			Static396.aBoolean454 = false;
		}
		if (Static187.anInt3418 != -1) {
			Static630.method8507(true);
		}
		if (Static12.aClass26_1 != null && Static487.method6425(Static221.anInt3831)) {
			Static407.method5604();
		}
		for (@Pc(232) int local232 = 0; local232 < 100; local232++) {
			Static89.aBooleanArray7[local232] = true;
		}
		Static384.aBoolean449 = true;
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(BLjava/lang/String;)Z")
	public static boolean method5030(@OriginalArg(1) String arg0) {
		return Static141.method2325(arg0);
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(B)V")
	public static void method5032() {
		@Pc(21) byte[] local21;
		if (Static414.anObject13 == null) {
			@Pc(14) Class18_Sub1_Sub1 local14 = new Class18_Sub1_Sub1();
			local21 = local14.method530();
			Static414.anObject13 = Static360.method5206(local21);
		}
		if (Static138.anObject10 == null) {
			@Pc(34) Class18_Sub2_Sub1 local34 = new Class18_Sub2_Sub1();
			local21 = local34.method7019();
			Static138.anObject10 = Static360.method5206(local21);
		}
	}
}
