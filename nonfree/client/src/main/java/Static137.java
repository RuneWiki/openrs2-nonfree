import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static137 {

	@OriginalMember(owner = "client!et", name = "bb", descriptor = "I")
	public static int anInt2275;

	@OriginalMember(owner = "client!et", name = "mb", descriptor = "Lclient!hda;")
	public static final Class136 aClass136_64 = new Class136(66, 6);

	@OriginalMember(owner = "client!et", name = "qb", descriptor = "[I")
	public static int[] anIntArray180 = null;

	@OriginalMember(owner = "client!et", name = "rb", descriptor = "I")
	public static int anInt2284 = 1;

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(BII)V")
	public static void method2066(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) Class5_Sub4_Sub13 local15 = Static506.method2916(arg1, 5);
		local15.method4140();
		local15.anInt4508 = arg0;
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(IIIIZI)V")
	public static void method2067(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4) {
		if (Static630.aFrame3 != null && (arg4 != 3 || arg2 != Static650.anInt10508 || Static53.anInt810 != arg1)) {
			Static373.method5812(Static214.aClass192_1, Static630.aFrame3);
			Static630.aFrame3 = null;
		}
		if (arg4 == 3 && Static630.aFrame3 == null) {
			Static630.aFrame3 = Static21.method483(arg2, 0, Static214.aClass192_1, arg1);
			if (Static630.aFrame3 != null) {
				Static650.anInt10508 = arg2;
				Static53.anInt810 = arg1;
				Static499.method7307();
			}
		}
		if (arg4 == 3 && Static630.aFrame3 == null) {
			method2067(arg0, -1, -1, true, Static627.aClass5_Sub46_31.aClass11_Sub1_1.method191());
			return;
		}
		@Pc(83) Container local83;
		@Pc(90) Insets local90;
		if (Static630.aFrame3 != null) {
			Static489.anInt8353 = arg2;
			Static374.anInt6594 = arg1;
			local83 = Static630.aFrame3;
		} else if (Static510.aFrame2 == null) {
			if (Static270.anApplet5 == null) {
				local83 = Static3.anApplet_Sub1_1;
			} else {
				local83 = Static270.anApplet5;
			}
			Static489.anInt8353 = local83.getSize().width;
			Static374.anInt6594 = local83.getSize().height;
		} else {
			local90 = Static510.aFrame2.getInsets();
			@Pc(96) int local96 = -local90.right;
			Static489.anInt8353 = Static510.aFrame2.getSize().width + local96 - local90.left;
			Static374.anInt6594 = Static510.aFrame2.getSize().height - local90.top - local90.bottom;
			local83 = Static510.aFrame2;
		}
		if (arg4 == 1) {
			Static552.anInt9135 = (Static489.anInt8353 - Static519.anInt7022) / 2;
			Static254.anInt4283 = Static519.anInt7022;
			Static438.anInt7403 = Static363.anInt6413;
			Static649.anInt10495 = 0;
		} else {
			Static64.method1080();
		}
		if (Static34.aClass346_2 != Static363.aClass346_4) {
			@Pc(167) boolean local167;
			if (Static254.anInt4283 < 1024 && Static438.anInt7403 < 768) {
				local167 = true;
			} else {
				local167 = false;
			}
		}
		if (arg3) {
			Static243.method3689();
		} else {
			Static181.aCanvas3.setSize(Static254.anInt4283, Static438.anInt7403);
			if (Static144.aBoolean196) {
				Static249.method3873(Static181.aCanvas3);
			} else {
				Static485.aClass126_17.method7042(Static181.aCanvas3, Static254.anInt4283, Static438.anInt7403);
			}
			if (Static510.aFrame2 == local83) {
				local90 = Static510.aFrame2.getInsets();
				Static181.aCanvas3.setLocation(local90.left + Static552.anInt9135, local90.top + Static649.anInt10495);
			} else {
				Static181.aCanvas3.setLocation(Static552.anInt9135, Static649.anInt10495);
			}
		}
		if (arg4 < 2) {
			Static396.aBoolean569 = false;
		} else {
			Static396.aBoolean569 = true;
		}
		if (Static302.anInt4813 != -1) {
			Static627.method8697(true);
		}
		if (Static487.aClass30_2 != null && Static80.method1260(Static469.anInt7883)) {
			Static172.method2651();
		}
		for (@Pc(239) int local239 = 0; local239 < 100; local239++) {
			Static609.aBooleanArray58[local239] = true;
		}
		Static267.aBoolean362 = true;
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(Lclient!d;Lclient!wu;B)V")
	public static void method2068(@OriginalArg(0) Interface8 arg0, @OriginalArg(1) Class384 arg1) {
		Static102.anInterface8_2 = arg0;
		Static65.aClass384_24 = arg1;
	}
}
