import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static220 {

	@OriginalMember(owner = "client!hga", name = "A", descriptor = "I")
	public static int anInt4304;

	@OriginalMember(owner = "client!hga", name = "a", descriptor = "(IIIIBZ)V")
	public static void method3799(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) boolean arg4) {
		if (Static12.aFrame1 != null && (arg3 != 3 || arg2 != Static69.anInt1061 || arg0 != Static621.anInt10188)) {
			Static452.method6682(Static12.aFrame1, Static344.aClass173_5);
			Static12.aFrame1 = null;
		}
		if (arg3 == 3 && Static12.aFrame1 == null) {
			Static12.aFrame1 = Static194.method2928(0, Static344.aClass173_5, arg2, arg0);
			if (Static12.aFrame1 != null) {
				Static69.anInt1061 = arg2;
				Static621.anInt10188 = arg0;
				Static574.method8188();
			}
		}
		if (arg3 == 3 && Static12.aFrame1 == null) {
			method3799(-1, arg1, -1, Static181.aClass14_Sub26_9.aClass43_Sub15_1.method4526(), true);
			return;
		}
		@Pc(90) Container local90;
		@Pc(114) Insets local114;
		if (Static12.aFrame1 != null) {
			Static235.anInt4561 = arg0;
			Static34.anInt543 = arg2;
			local90 = Static12.aFrame1;
		} else if (Static613.aFrame2 == null) {
			if (Static531.anApplet2 == null) {
				local90 = Static267.anApplet_Sub1_1;
			} else {
				local90 = Static531.anApplet2;
			}
			Static34.anInt543 = local90.getSize().width;
			Static235.anInt4561 = local90.getSize().height;
		} else {
			local114 = Static613.aFrame2.getInsets();
			@Pc(120) int local120 = -local114.right;
			Static34.anInt543 = Static613.aFrame2.getSize().width + local120 - local114.left;
			Static235.anInt4561 = Static613.aFrame2.getSize().height - local114.bottom - local114.top;
			local90 = Static613.aFrame2;
		}
		if (arg3 == 1) {
			Static663.anInt10806 = 0;
			Static506.anInt8791 = Static380.anInt6697;
			Static365.anInt6233 = (Static34.anInt543 - Static380.anInt6690) / 2;
			Static563.anInt4939 = Static380.anInt6690;
		} else {
			Static181.method2652();
		}
		if (Static115.aClass59_4 != Static548.aClass59_10) {
			@Pc(178) boolean local178;
			if (Static563.anInt4939 < 1024 && Static506.anInt8791 < 768) {
				local178 = true;
			} else {
				local178 = false;
			}
		}
		if (arg4) {
			Static589.method8394();
		} else {
			Static626.aCanvas12.setSize(Static563.anInt4939, Static506.anInt8791);
			if (Static656.aBoolean741) {
				Static170.method2466(Static626.aCanvas12);
			} else {
				Static103.aClass144_3.method6888(Static626.aCanvas12, Static563.anInt4939, Static506.anInt8791);
			}
			if (local90 == Static613.aFrame2) {
				local114 = Static613.aFrame2.getInsets();
				Static626.aCanvas12.setLocation(local114.left + Static365.anInt6233, Static663.anInt10806 + local114.top);
			} else {
				Static626.aCanvas12.setLocation(Static365.anInt6233, Static663.anInt10806);
			}
		}
		if (arg3 >= 2) {
			Static637.aBoolean730 = true;
		} else {
			Static637.aBoolean730 = false;
		}
		if (Static358.anInt6145 != -1) {
			Static379.method5835(true);
		}
		if (Static277.aClass347_2.aClass278_2 != null && Static111.method1779(Static387.anInt9114)) {
			Static411.method6198();
		}
		for (@Pc(270) int local270 = 0; local270 < 100; local270++) {
			Static415.aBooleanArray17[local270] = true;
		}
		Static467.aBoolean547 = true;
	}

	@OriginalMember(owner = "client!hga", name = "a", descriptor = "(II)I")
	public static int method3803(@OriginalArg(1) int arg0) {
		@Pc(5) int local5 = 0;
		if (arg0 < 0 || arg0 >= 65536) {
			arg0 >>>= 0x10;
			local5 += 16;
		}
		if (arg0 >= 256) {
			arg0 >>>= 0x8;
			local5 += 8;
		}
		if (arg0 >= 16) {
			arg0 >>>= 0x4;
			local5 += 4;
		}
		if (arg0 >= 4) {
			arg0 >>>= 0x2;
			local5 += 2;
		}
		if (arg0 >= 1) {
			arg0 >>>= 0x1;
			local5++;
		}
		return arg0 + local5;
	}
}
