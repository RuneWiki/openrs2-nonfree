import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static41 {

	@OriginalMember(owner = "client!df", name = "Y", descriptor = "[Lclient!qg;")
	public static Class79_Sub1[] aClass79_Sub1Array1;

	@OriginalMember(owner = "client!df", name = "ab", descriptor = "Lclient!oe;")
	public static Class72 aClass72_52;

	@OriginalMember(owner = "client!df", name = "T", descriptor = "Lclient!wc;")
	public static Class110 aClass110_6 = new Class110(64);

	@OriginalMember(owner = "client!df", name = "X", descriptor = "Z")
	public static boolean aBoolean31 = true;

	@OriginalMember(owner = "client!df", name = "Z", descriptor = "[I")
	public static int[] anIntArray129 = new int[25];

	@OriginalMember(owner = "client!df", name = "d", descriptor = "(I)V")
	public static void method565() {
		if (Static53.aClass40_2 != null) {
			Static53.aClass40_2.method3707();
		}
		if (Static220.aClass40_3 != null) {
			Static220.aClass40_3.method3707();
		}
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(IIIII)Z")
	public static boolean method566(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(9) int local9 = arg3 * Static132.anInt3060 + arg0 * Static160.anInt3702 >> 16;
		@Pc(19) int local19 = arg3 * Static160.anInt3702 - arg0 * Static132.anInt3060 >> 16;
		@Pc(29) int local29 = arg1 * Static224.anInt4840 + local19 * Static72.anInt4675 >> 16;
		@Pc(39) int local39 = arg1 * Static72.anInt4675 - local19 * Static224.anInt4840 >> 16;
		if (local29 < 1) {
			local29 = 1;
		}
		@Pc(50) int local50 = (local9 << 9) / local29;
		@Pc(56) int local56 = (local39 << 9) / local29;
		@Pc(66) int local66 = arg2 * Static224.anInt4840 + local19 * Static72.anInt4675 >> 16;
		@Pc(76) int local76 = arg2 * Static72.anInt4675 - local19 * Static224.anInt4840 >> 16;
		if (local66 < 1) {
			local66 = 1;
		}
		@Pc(87) int local87 = (local9 << 9) / local66;
		@Pc(93) int local93 = (local76 << 9) / local66;
		if (local29 < 50 && local66 < 50) {
			return false;
		} else if (local29 > 3500 && local66 > 3500) {
			return false;
		} else if (local50 < Static226.anInt4902 && local87 < Static226.anInt4902) {
			return false;
		} else if (local50 > Static210.anInt4638 && local87 > Static210.anInt4638) {
			return false;
		} else if (local56 < Static14.anInt3440 && local93 < Static14.anInt3440) {
			return false;
		} else {
			return local56 <= Static149.anInt1846 || local93 <= Static149.anInt1846;
		}
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(IILclient!qe;Ljava/awt/Color;Z)V")
	public static void method568(@OriginalArg(0) int arg0, @OriginalArg(2) Class78 arg1, @OriginalArg(3) Color arg2, @OriginalArg(4) boolean arg3) {
		try {
			@Pc(2) Graphics local2 = Static79.aCanvas2.getGraphics();
			if (Static30.aFont1 == null) {
				Static30.aFont1 = new Font("Helvetica", 1, 13);
				Static211.aFontMetrics1 = Static79.aCanvas2.getFontMetrics(Static30.aFont1);
			}
			if (arg3) {
				local2.setColor(Color.black);
				local2.fillRect(0, 0, Static134.anInt3131, Static30.anInt546);
			}
			if (arg2 == null) {
				arg2 = new Color(140, 17, 17);
			}
			try {
				if (Static123.anImage3 == null) {
					Static123.anImage3 = Static79.aCanvas2.createImage(304, 34);
				}
				@Pc(45) Graphics local45 = Static123.anImage3.getGraphics();
				local45.setColor(arg2);
				local45.drawRect(0, 0, 303, 33);
				local45.fillRect(2, 2, arg0 * 3, 30);
				local45.setColor(Color.black);
				local45.drawRect(1, 1, 301, 31);
				local45.fillRect(arg0 * 3 + 2, 2, 300 - arg0 * 3, 30);
				local45.setFont(Static30.aFont1);
				local45.setColor(Color.white);
				arg1.method3014((304 - arg1.method3034(Static211.aFontMetrics1)) / 2, 22, local45);
				local2.drawImage(Static123.anImage3, Static134.anInt3131 / 2 - 152, Static30.anInt546 / 2 - 18, null);
			} catch (@Pc(123) Exception local123) {
				@Pc(129) int local129 = Static30.anInt546 / 2 - 18;
				@Pc(135) int local135 = Static134.anInt3131 / 2 - 152;
				local2.setColor(arg2);
				local2.drawRect(local135, local129, 303, 33);
				local2.fillRect(local135 + 2, local129 + 2, arg0 * 3, 30);
				local2.setColor(Color.black);
				local2.drawRect(local135 + 1, local129 + 1, 301, 31);
				local2.fillRect(local135 + arg0 * 3 + 2, local129 + 2, 300 - arg0 * 3, 30);
				local2.setFont(Static30.aFont1);
				local2.setColor(Color.white);
				arg1.method3014((304 - arg1.method3034(Static211.aFontMetrics1)) / 2 + local135, local129 + 22, local2);
			}
			if (Static132.aClass78_588 != null) {
				local2.setFont(Static30.aFont1);
				local2.setColor(Color.white);
				Static132.aClass78_588.method3014(Static134.anInt3131 / 2 - Static132.aClass78_588.method3034(Static211.aFontMetrics1) / 2, Static30.anInt546 / 2 + -26, local2);
			}
		} catch (@Pc(243) Exception local243) {
			Static79.aCanvas2.repaint();
		}
	}

	@OriginalMember(owner = "client!df", name = "b", descriptor = "(II)Z")
	public static boolean method569(@OriginalArg(0) int arg0) {
		return (arg0 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(IIII)V")
	public static void method570(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) Class2_Sub12 local7 = Static226.aClass2_Sub12ArrayArrayArray3[arg0][arg1][arg2];
		if (local7 != null) {
			Static226.aClass2_Sub12ArrayArrayArray3[arg0][arg1][arg2].anInt764 = arg3;
		}
	}
}
