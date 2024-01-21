import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static115 {

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "Lclient!mb;")
	public static Class45 aClass45_1316 = Static63.method1251("Bitte warten Sie eine Minute");

	@OriginalMember(owner = "client!vc", name = "g", descriptor = "Lclient!mb;")
	private static Class45 aClass45_1317 = Static63.method1251("Continue");

	@OriginalMember(owner = "client!vc", name = "l", descriptor = "Lclient!mb;")
	public static Class45 aClass45_1318 = aClass45_1317;

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(IIIIIII)V")
	public static void method2087(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(16) int local16 = 2048 - arg5 & 0x7FF;
		@Pc(23) int local23 = 2048 - arg4 & 0x7FF;
		@Pc(25) int local25 = 0;
		@Pc(27) int local27 = 0;
		@Pc(29) int local29 = arg1;
		@Pc(38) int local38;
		@Pc(42) int local42;
		@Pc(53) int local53;
		if (local16 != 0) {
			local38 = Class5_Sub2_Sub6_Sub2.anIntArray360[local16];
			local42 = Class5_Sub2_Sub6_Sub2.anIntArray362[local16];
			local53 = local42 * 0 - local38 * arg1 >> 16;
			local29 = local38 * 0 + local42 * arg1 >> 16;
			local27 = local53;
		}
		if (local23 != 0) {
			local38 = Class5_Sub2_Sub6_Sub2.anIntArray360[local23];
			local42 = Class5_Sub2_Sub6_Sub2.anIntArray362[local23];
			local53 = local29 * local38 + local42 * 0 >> 16;
			local29 = local42 * local29 - local38 * 0 >> 16;
			local25 = local53;
		}
		Static46.anInt1334 = arg3 - local29;
		Static38.anInt1089 = arg5;
		Static50.anInt1602 = arg2 - local27;
		Static25.anInt791 = arg0 - local25;
		Static56.anInt1690 = arg4;
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(I)V")
	public static void method2088() {
		aClass45_1317 = null;
		aClass45_1318 = null;
		aClass45_1316 = null;
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(II)I")
	public static int method2089(@OriginalArg(1) int arg0) {
		@Pc(9) int local9 = (arg0 >>> 1 & 0x55555555) + (arg0 & 0x55555555);
		@Pc(19) int local19 = (local9 & 0x33333333) + (local9 >>> -492595358 & 0x33333333);
		@Pc(31) int local31 = local19 + (local19 >>> 4) & 0xF0F0F0F;
		@Pc(37) int local37 = local31 + (local31 >>> 8);
		@Pc(43) int local43 = local37 + (local37 >>> 16);
		return local43 & 0xFF;
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(Lclient!ia;I)V")
	public static void method2090(@OriginalArg(0) Class5_Sub2_Sub8 arg0) {
		@Pc(16) int local16 = arg0.anInt1262 >> 16;
		if (local16 == Static67.anInt1909 || local16 == Static100.anInt2693) {
			Static51.aBoolean81 = true;
		}
		if (local16 == Static72.anInt2162 || local16 == Static57.anIntArray262[Static53.anInt2372]) {
			Static72.aBoolean99 = true;
		}
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(Ljava/awt/Color;Lclient!mb;II)V")
	public static void method2091(@OriginalArg(0) Color arg0, @OriginalArg(1) Class45 arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(2) Graphics local2 = Static75.aCanvas1.getGraphics();
			if (Static10.aFont1 == null) {
				Static10.aFont1 = new Font("Helvetica", 1, 13);
				Static42.aFontMetrics2 = Static75.aCanvas1.getFontMetrics(Static10.aFont1);
			}
			if (Static19.aBoolean26) {
				Static19.aBoolean26 = false;
				local2.setColor(Color.black);
				local2.fillRect(0, 0, Static57.anInt1704, Static16.anInt513);
			}
			if (arg0 == null) {
				arg0 = new Color(140, 17, 17);
			}
			try {
				if (Static4.anImage1 == null) {
					Static4.anImage1 = Static75.aCanvas1.createImage(304, 34);
				}
				@Pc(52) Graphics local52 = Static4.anImage1.getGraphics();
				local52.setColor(arg0);
				local52.drawRect(0, 0, 303, 33);
				local52.fillRect(2, 2, arg2 * 3, 30);
				local52.setColor(Color.black);
				local52.drawRect(1, 1, 301, 31);
				local52.fillRect(arg2 * 3 + 2, 2, 300 - arg2 * 3, 30);
				local52.setFont(Static10.aFont1);
				local52.setColor(Color.white);
				arg1.method1314(local52, 22, (304 - arg1.method1313(Static42.aFontMetrics2)) / 2);
				local2.drawImage(Static4.anImage1, Static57.anInt1704 / 2 - 152, Static16.anInt513 / 2 - 18, null);
			} catch (@Pc(129) Exception local129) {
				@Pc(135) int local135 = Static57.anInt1704 / 2 - 152;
				@Pc(141) int local141 = Static16.anInt513 / 2 - 18;
				local2.setColor(arg0);
				local2.drawRect(local135, local141, 303, 33);
				local2.fillRect(local135 + 2, local141 - -2, arg2 * 3, 30);
				local2.setColor(Color.black);
				local2.drawRect(local135 + 1, local141 + 1, 301, 31);
				local2.fillRect(arg2 * 3 + local135 + 2, local141 + 2, 300 - arg2 * 3, 30);
				local2.setFont(Static10.aFont1);
				local2.setColor(Color.white);
				arg1.method1314(local2, local141 + 22, local135 + (-arg1.method1313(Static42.aFontMetrics2) + 304) / 2);
			}
		} catch (@Pc(220) Exception local220) {
			Static75.aCanvas1.repaint();
		}
	}
}
