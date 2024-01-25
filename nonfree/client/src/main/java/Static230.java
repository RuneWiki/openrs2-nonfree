import java.awt.Container;
import java.awt.Insets;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static230 {

	@OriginalMember(owner = "client!nk", name = "c", descriptor = "I")
	public static int anInt4054;

	@OriginalMember(owner = "client!nk", name = "g", descriptor = "[Lclient!rn;")
	public static Class18[] aClass18Array10;

	@OriginalMember(owner = "client!nk", name = "o", descriptor = "[J")
	public static final long[] aLongArray5 = new long[32];

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(Lclient!fo;I)V")
	public static void method3729(@OriginalArg(0) Class1_Sub5_Sub1 arg0) {
		if (arg0 instanceof Class1_Sub5_Sub1_Sub2) {
			@Pc(5) Class1_Sub5_Sub1_Sub2 local5 = (Class1_Sub5_Sub1_Sub2) arg0;
			if (local5.aClass133_1 != null) {
				Static390.method5662(local5, Static206.aClass1_Sub5_Sub1_Sub1_1.aByte69 != local5.aByte69);
			}
		} else if (arg0 instanceof Class1_Sub5_Sub1_Sub1) {
			@Pc(27) Class1_Sub5_Sub1_Sub1 local27 = (Class1_Sub5_Sub1_Sub1) arg0;
			Static260.method4023(local27.aByte69 != Static206.aClass1_Sub5_Sub1_Sub1_1.aByte69, local27);
		}
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(IILclient!nl;I)Lclient!kg;")
	public static Class136 method3732(@OriginalArg(1) int arg0, @OriginalArg(2) Class171 arg1) {
		@Pc(15) byte[] local15 = arg1.method3745(arg0, 0);
		return local15 == null ? null : new Class136(local15);
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(IIIII)V")
	public static void method3733(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(3) int local3 = 0; local3 < Static86.anInt1651; local3++) {
			@Pc(9) Rectangle local9 = Class148.aRectangleArray2[local3];
			if (local9.x + local9.width > arg3 && arg3 + arg0 > local9.x && local9.height + local9.y > arg1 && local9.y < arg1 + arg2) {
				Static51.aBooleanArray7[local3] = true;
			}
		}
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(IIIIZI)V")
	public static void method3735(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4) {
		if (arg3) {
			Static234.method3798();
		}
		if (Static385.aFrame2 != null && (arg4 != 3 || Static364.anInt6192 != arg1 || arg0 != Static132.anInt2711)) {
			Static17.method318(Static385.aFrame2, Static359.aClass111_5);
			Static385.aFrame2 = null;
		}
		if (arg4 == 3 && Static385.aFrame2 == null) {
			Static385.aFrame2 = Static121.method2480(0, arg1, arg0, Static359.aClass111_5);
			if (Static385.aFrame2 != null) {
				Static364.anInt6192 = arg1;
				Static132.anInt2711 = arg0;
				Static164.method2916(Static359.aClass111_5);
			}
		}
		if (arg4 == 3 && Static385.aFrame2 == null) {
			method3735(-1, -1, arg2, true, Static213.anInt3866);
			return;
		}
		@Pc(100) Container local100;
		@Pc(76) Insets local76;
		if (Static385.aFrame2 != null) {
			anInt4054 = arg0;
			Static70.anInt1246 = arg1;
			local100 = Static385.aFrame2;
		} else if (Static8.aFrame1 == null) {
			local100 = Static359.aClass111_5.anApplet1;
			Static70.anInt1246 = local100.getSize().width;
			anInt4054 = local100.getSize().height;
		} else {
			local76 = Static8.aFrame1.getInsets();
			Static70.anInt1246 = Static8.aFrame1.getSize().width - local76.left - local76.right;
			@Pc(96) int local96 = local76.top + local76.bottom;
			anInt4054 = Static8.aFrame1.getSize().height - local96;
			local100 = Static8.aFrame1;
		}
		@Pc(164) int local164;
		if (arg4 == 1) {
			Static88.anInt1685 = 0;
			Static341.anInt5819 = (Static70.anInt1246 - Static237.anInt4228) / 2;
			Static362.anInt6102 = Static253.anInt4466;
			Static253.anInt4467 = Static237.anInt4228;
		} else if (Static253.anInt4468 < 96 && Static62.anInt1261 == 0) {
			local164 = Static70.anInt1246 <= 1024 ? Static70.anInt1246 : 1024;
			Static253.anInt4467 = local164;
			Static341.anInt5819 = (Static70.anInt1246 - local164) / 2;
			@Pc(180) int local180 = anInt4054 <= 768 ? anInt4054 : 768;
			Static362.anInt6102 = local180;
			Static88.anInt1685 = 0;
		} else {
			Static88.anInt1685 = 0;
			Static341.anInt5819 = 0;
			Static253.anInt4467 = Static70.anInt1246;
			Static362.anInt6102 = anInt4054;
		}
		if (Static141.aClass117_7 != Static17.aClass117_1) {
			@Pc(196) boolean local196;
			if (Static253.anInt4467 < 1024 && Static362.anInt6102 < 768) {
				local196 = true;
			} else {
				local196 = false;
			}
		}
		if (arg3) {
			Static150.method2787(Static62.anInt1261);
		} else {
			Static257.aCanvas4.setSize(Static253.anInt4467, Static362.anInt6102);
			if (Static111.aClass63_3 != null) {
				Static111.aClass63_3.method1956();
			}
			if (local100 == Static8.aFrame1) {
				local76 = Static8.aFrame1.getInsets();
				Static257.aCanvas4.setLocation(local76.left + Static341.anInt5819, local76.top - -Static88.anInt1685);
			} else {
				Static257.aCanvas4.setLocation(Static341.anInt5819, Static88.anInt1685);
			}
		}
		if (arg4 < 2) {
			Static344.aBoolean359 = false;
		} else {
			Static344.aBoolean359 = true;
		}
		if (Static234.anInt4158 != -1) {
			Static242.method4238(true);
		}
		if (Static88.aClass221_1 != null && (Static391.anInt6627 == 30 || Static391.anInt6627 == 25)) {
			Static169.method2967();
		}
		for (local164 = 0; local164 < 100; local164++) {
			Static331.aBooleanArray30[local164] = true;
		}
		Static242.aBoolean363 = true;
	}
}
