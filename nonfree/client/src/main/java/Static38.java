import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static38 {

	@OriginalMember(owner = "client!eb", name = "x", descriptor = "Lclient!ba;")
	public static Class1_Sub2_Sub1_Sub3 aClass1_Sub2_Sub1_Sub3_2;

	@OriginalMember(owner = "client!eb", name = "B", descriptor = "Lclient!ba;")
	public static Class1_Sub2_Sub1_Sub3 aClass1_Sub2_Sub1_Sub3_3;

	@OriginalMember(owner = "client!eb", name = "K", descriptor = "[Lclient!ba;")
	public static Class1_Sub2_Sub1_Sub3[] aClass1_Sub2_Sub1_Sub3Array6;

	@OriginalMember(owner = "client!eb", name = "A", descriptor = "Lclient!dd;")
	private static Class13 aClass13_430 = Static161.method2971("To play on this world move to a free area first)3");

	@OriginalMember(owner = "client!eb", name = "n", descriptor = "Lclient!dd;")
	public static Class13 aClass13_423 = aClass13_430;

	@OriginalMember(owner = "client!eb", name = "r", descriptor = "Lclient!dd;")
	public static Class13 aClass13_424 = Static161.method2971("rot:");

	@OriginalMember(owner = "client!eb", name = "y", descriptor = "Lclient!dd;")
	private static Class13 aClass13_428 = Static161.method2971(" from your ignore list first)3");

	@OriginalMember(owner = "client!eb", name = "s", descriptor = "Lclient!dd;")
	public static Class13 aClass13_425 = aClass13_428;

	@OriginalMember(owner = "client!eb", name = "t", descriptor = "Lclient!dd;")
	public static Class13 aClass13_426 = Static161.method2971("Anmelde)2Zeitlimit -Uberschritten)3");

	@OriginalMember(owner = "client!eb", name = "w", descriptor = "Lclient!dd;")
	public static Class13 aClass13_427 = Static161.method2971("jolt");

	@OriginalMember(owner = "client!eb", name = "z", descriptor = "Lclient!dd;")
	public static Class13 aClass13_429 = Static161.method2971("hint_headicons");

	@OriginalMember(owner = "client!eb", name = "F", descriptor = "Z")
	public static boolean aBoolean80 = false;

	@OriginalMember(owner = "client!eb", name = "I", descriptor = "Lclient!dd;")
	public static Class13 aClass13_431 = Static161.method2971("<img=1>");

	@OriginalMember(owner = "client!eb", name = "J", descriptor = "Lclient!dd;")
	public static Class13 aClass13_432 = Static161.method2971("::noclip");

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(ILclient!dd;Ljava/awt/Color;I)V")
	public static void method1002(@OriginalArg(0) int arg0, @OriginalArg(1) Class13 arg1, @OriginalArg(2) Color arg2) {
		try {
			@Pc(6) Graphics local6 = Static106.aCanvas1.getGraphics();
			if (Static95.aFont1 == null) {
				Static95.aFont1 = new Font("Helvetica", 1, 13);
				Static61.aFontMetrics1 = Static106.aCanvas1.getFontMetrics(Static95.aFont1);
			}
			if (Static14.aBoolean44) {
				Static14.aBoolean44 = false;
				local6.setColor(Color.black);
				local6.fillRect(0, 0, Static49.anInt1605, Static175.anInt3997);
			}
			if (arg2 == null) {
				arg2 = new Color(140, 17, 17);
			}
			try {
				if (Static175.anImage3 == null) {
					Static175.anImage3 = Static106.aCanvas1.createImage(304, 34);
				}
				@Pc(51) Graphics local51 = Static175.anImage3.getGraphics();
				local51.setColor(arg2);
				local51.drawRect(0, 0, 303, 33);
				local51.fillRect(2, 2, arg0 * 3, 30);
				local51.setColor(Color.black);
				local51.drawRect(1, 1, 301, 31);
				local51.fillRect(arg0 * 3 + 2, 2, 300 - arg0 * 3, 30);
				local51.setFont(Static95.aFont1);
				local51.setColor(Color.white);
				arg1.method888(local51, 22, (304 - arg1.method902(Static61.aFontMetrics1)) / 2);
				local6.drawImage(Static175.anImage3, Static49.anInt1605 / 2 - 152, Static175.anInt3997 / 2 + -18, null);
			} catch (@Pc(128) Exception local128) {
				@Pc(134) int local134 = Static49.anInt1605 / 2 - 152;
				@Pc(140) int local140 = Static175.anInt3997 / 2 - 18;
				local6.setColor(arg2);
				local6.drawRect(local134, local140, 303, 33);
				local6.fillRect(local134 + 2, local140 - -2, arg0 * 3, 30);
				local6.setColor(Color.black);
				local6.drawRect(local134 + 1, local140 + 1, 301, 31);
				local6.fillRect(arg0 * 3 + local134 + 2, local140 + 2, 300 - arg0 * 3, 30);
				local6.setFont(Static95.aFont1);
				local6.setColor(Color.white);
				arg1.method888(local6, local140 + 22, local134 + (-arg1.method902(Static61.aFontMetrics1) + 304) / 2);
			}
		} catch (@Pc(219) Exception local219) {
			Static106.aCanvas1.repaint();
		}
	}

	@OriginalMember(owner = "client!eb", name = "b", descriptor = "(B)V")
	public static void method1003() {
		aClass13_428 = null;
		aClass13_426 = null;
		aClass1_Sub2_Sub1_Sub3Array6 = null;
		aClass1_Sub2_Sub1_Sub3_2 = null;
		aClass13_429 = null;
		aClass13_432 = null;
		aClass13_430 = null;
		aClass13_425 = null;
		aClass13_423 = null;
		aClass13_427 = null;
		aClass1_Sub2_Sub1_Sub3_3 = null;
		aClass13_431 = null;
		aClass13_424 = null;
	}

	@OriginalMember(owner = "client!eb", name = "b", descriptor = "(IIII)Z")
	public static boolean method1004(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static1.method49(arg0, arg1, arg2)) {
			@Pc(10) int local10 = arg1 << 7;
			@Pc(14) int local14 = arg2 << 7;
			return Static108.method2114(local10 + 1, Static114.anIntArrayArrayArray4[arg0][arg1][arg2] + arg3, local14 + 1) && Static108.method2114(local10 + 128 - 1, Static114.anIntArrayArrayArray4[arg0][arg1 + 1][arg2] + arg3, local14 + 1) && Static108.method2114(local10 + 128 - 1, Static114.anIntArrayArrayArray4[arg0][arg1 + 1][arg2 + 1] + arg3, local14 + 128 - 1) && Static108.method2114(local10 + 1, Static114.anIntArrayArrayArray4[arg0][arg1][arg2 + 1] + arg3, local14 + 128 - 1);
		} else {
			return false;
		}
	}
}
