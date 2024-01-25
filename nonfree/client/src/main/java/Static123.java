import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static123 {

	@OriginalMember(owner = "client!eca", name = "a", descriptor = "[I")
	public static int[] anIntArray179;

	@OriginalMember(owner = "client!eca", name = "a", descriptor = "(IIILclient!ha;II)V")
	public static void method2205(@OriginalArg(0) int arg0, @OriginalArg(3) Class13 arg1, @OriginalArg(5) int arg2) {
		Static613.aClass13_82 = arg1;
		Static605.aClass51_10 = Static613.aClass13_82.method8137();
		Static432.aClass51_9 = Static613.aClass13_82.method8137();
		Static626.aClass51_11 = Static613.aClass13_82.method8137();
		Static4.anInt49 = 100;
		Static65.anInterface18Array1 = null;
		Static518.anInt8368 = 0;
		Static514.anInt8278 = 100;
		Static18.anIntArray38 = null;
		Static492.method6903(arg0, arg2);
		Static612.anInt8415 = -1;
		Static595.anInt9885 = -1;
		Static129.anInt2698 = -1;
	}

	@OriginalMember(owner = "client!eca", name = "a", descriptor = "(III)I")
	public static int method2207(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(16) int local16 = arg1 - 1 & arg0 >> 31;
		return local16 + (arg0 + (arg0 >>> 31)) % arg1;
	}

	@OriginalMember(owner = "client!eca", name = "a", descriptor = "(I)V")
	public static void method2208() {
		if (Static18.aFrame1 != null) {
			return;
		}
		@Pc(8) int local8 = Static1.anInt8341;
		@Pc(10) int local10 = Static500.anInt8002;
		@Pc(17) int local17 = Static334.anInt5861 - Class16_Sub1_Sub5_Sub1.lb - local8;
		@Pc(25) int local25 = Static16.anInt323 - Static71.anInt1925 - local10;
		if (local8 <= 0 && local17 <= 0 && local10 <= 0 && local25 <= 0) {
			return;
		}
		try {
			@Pc(46) Container local46;
			if (Static80.aFrame2 != null) {
				local46 = Static80.aFrame2;
			} else if (Static107.anApplet1 == null) {
				local46 = Static253.anApplet_Sub1_1;
			} else {
				local46 = Static107.anApplet1;
			}
			@Pc(54) int local54 = 0;
			@Pc(56) int local56 = 0;
			if (local46 == Static80.aFrame2) {
				@Pc(62) Insets local62 = Static80.aFrame2.getInsets();
				local54 = local62.left;
				local56 = local62.top;
			}
			@Pc(71) Graphics local71 = local46.getGraphics();
			local71.setColor(Color.black);
			if (local8 > 0) {
				local71.fillRect(local54, local56, local8, Static16.anInt323);
			}
			if (local10 > 0) {
				local71.fillRect(local54, local56, Static334.anInt5861, local10);
			}
			if (local17 > 0) {
				local71.fillRect(Static334.anInt5861 + local54 - local17, local56, local17, Static16.anInt323);
			}
			if (local25 > 0) {
				local71.fillRect(local54, Static16.anInt323 + local56 - local25, Static334.anInt5861, local25);
				return;
			}
		} catch (@Pc(122) Exception local122) {
			return;
		}
	}
}
