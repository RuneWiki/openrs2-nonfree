import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ImageObserver;
import java.lang.reflect.Field;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tu")
public final class Class344 implements Interface27 {

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "Ljava/awt/Image;")
	private Image anImage4;

	@OriginalMember(owner = "client!tu", name = "b", descriptor = "I")
	private int anInt9309;

	@OriginalMember(owner = "client!tu", name = "d", descriptor = "Ljava/awt/Image;")
	private Image anImage5;

	@OriginalMember(owner = "client!tu", name = "f", descriptor = "Ljava/awt/Image;")
	private Image anImage6;

	@OriginalMember(owner = "client!tu", name = "g", descriptor = "Z")
	private boolean aBoolean698;

	@OriginalMember(owner = "client!tu", name = "h", descriptor = "Ljava/awt/Font;")
	private Font aFont2;

	@OriginalMember(owner = "client!tu", name = "i", descriptor = "Ljava/awt/FontMetrics;")
	private FontMetrics aFontMetrics1;

	@OriginalMember(owner = "client!tu", name = "j", descriptor = "Z")
	private boolean aBoolean699;

	@OriginalMember(owner = "client!tu", name = "m", descriptor = "I")
	private int anInt9314;

	@OriginalMember(owner = "client!tu", name = "n", descriptor = "Ljava/awt/Image;")
	private Image anImage7;

	@OriginalMember(owner = "client!tu", name = "o", descriptor = "Ljava/awt/Image;")
	private Image anImage8;

	@OriginalMember(owner = "client!tu", name = "p", descriptor = "Ljava/awt/Image;")
	private Image anImage9;

	@OriginalMember(owner = "client!tu", name = "s", descriptor = "Ljava/awt/Image;")
	private Image anImage10;

	@OriginalMember(owner = "client!tu", name = "t", descriptor = "I")
	private int anInt9317;

	@OriginalMember(owner = "client!tu", name = "u", descriptor = "Ljava/awt/Image;")
	private Image anImage11;

	@OriginalMember(owner = "client!tu", name = "y", descriptor = "I")
	private int anInt9320;

	@OriginalMember(owner = "client!tu", name = "A", descriptor = "Z")
	private boolean aBoolean700;

	@OriginalMember(owner = "client!tu", name = "C", descriptor = "I")
	private int anInt9323;

	@OriginalMember(owner = "client!tu", name = "E", descriptor = "I")
	private int anInt9325;

	@OriginalMember(owner = "client!tu", name = "G", descriptor = "Ljava/awt/Image;")
	private Image anImage12;

	@OriginalMember(owner = "client!tu", name = "H", descriptor = "I")
	private int anInt9327;

	@OriginalMember(owner = "client!tu", name = "I", descriptor = "Ljava/awt/Image;")
	private Image anImage13;

	@OriginalMember(owner = "client!tu", name = "K", descriptor = "I")
	private int anInt9329;

	@OriginalMember(owner = "client!tu", name = "M", descriptor = "Ljava/awt/Color;")
	private Color aColor1;

	@OriginalMember(owner = "client!tu", name = "O", descriptor = "I")
	private int anInt9332;

	@OriginalMember(owner = "client!tu", name = "c", descriptor = "(I)V")
	@Override
	public void method7912() {
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method7914(@OriginalArg(1) boolean arg0) {
		if (!this.aBoolean700) {
			if (Static287.anApplet2 == null) {
				this.aBoolean700 = true;
			} else if (this.aFont2 == null) {
				try {
					this.method7918();
				} catch (@Pc(18) Exception local18) {
					this.aBoolean700 = true;
				}
			}
		}
		if (this.aBoolean700) {
			this.method7921();
			return;
		}
		@Pc(41) Graphics local41 = Static469.aCanvas11.getGraphics();
		if (local41 == null) {
			Static469.aCanvas11.repaint();
			return;
		}
		try {
			@Pc(47) int local47 = Static12.aClass124_1.method2780();
			@Pc(51) String local51 = Static12.aClass124_1.method2774();
			if (Static582.anImage3 == null) {
				Static582.anImage3 = Static469.aCanvas11.createImage(Static654.anInt10064, Static483.anInt8181);
			}
			@Pc(61) Graphics local61 = Static582.anImage3.getGraphics();
			local61.clearRect(0, 0, Static654.anInt10064, Static483.anInt8181);
			@Pc(72) int local72 = this.anImage10.getWidth((ImageObserver) null);
			@Pc(77) int local77 = this.anImage12.getWidth((ImageObserver) null);
			@Pc(82) int local82 = this.anImage9.getWidth((ImageObserver) null);
			@Pc(87) int local87 = this.anImage10.getHeight((ImageObserver) null);
			@Pc(92) int local92 = this.anImage12.getHeight((ImageObserver) null);
			@Pc(97) int local97 = this.anImage9.getHeight((ImageObserver) null);
			local61.drawImage(this.anImage10, this.method7923(local72) + this.anInt9320 - this.anInt9332 / 2, this.method7915(local87) - -this.anInt9329, (ImageObserver) null);
			@Pc(134) int local134 = local72 + this.anInt9320 - this.anInt9332 / 2;
			@Pc(142) int local142 = this.anInt9332 / 2 + this.anInt9320;
			for (@Pc(144) int local144 = local134; local144 <= local142; local144 += local82) {
				local61.drawImage(this.anImage9, local144 + this.method7923(local72) + this.anInt9320, this.method7915(local97) + this.anInt9329, (ImageObserver) null);
			}
			local61.drawImage(this.anImage12, this.method7923(local77) + this.anInt9320 + this.anInt9332 / 2, this.method7915(local92) + this.anInt9329, (ImageObserver) null);
			@Pc(210) int local210 = this.anImage7.getWidth((ImageObserver) null);
			@Pc(215) int local215 = this.anImage7.getHeight((ImageObserver) null);
			@Pc(220) int local220 = this.anImage8.getWidth((ImageObserver) null);
			@Pc(225) int local225 = this.anImage8.getHeight((ImageObserver) null);
			@Pc(230) int local230 = this.anImage6.getHeight((ImageObserver) null);
			@Pc(235) int local235 = this.anImage4.getWidth((ImageObserver) null);
			@Pc(240) int local240 = this.anImage4.getHeight((ImageObserver) null);
			@Pc(245) int local245 = this.anImage6.getWidth((ImageObserver) null);
			@Pc(250) int local250 = this.anImage5.getWidth((ImageObserver) null);
			@Pc(255) int local255 = this.anImage11.getWidth((ImageObserver) null);
			@Pc(264) int local264 = this.method7923(this.anInt9309) + this.anInt9325;
			@Pc(274) int local274 = this.method7915(this.anInt9314) + this.anInt9317;
			local61.drawImage(this.anImage7, local264, (this.anInt9314 - local215) / 2 + local274, (ImageObserver) null);
			local61.drawImage(this.anImage8, this.anInt9309 + local264 - local220, local274 + (-local225 + this.anInt9314) / 2, (ImageObserver) null);
			if (this.anImage13 == null) {
				this.anImage13 = Static469.aCanvas11.createImage(this.anInt9309 - local210 - local220, this.anInt9314);
			}
			@Pc(332) Graphics local332 = this.anImage13.getGraphics();
			for (@Pc(334) int local334 = 0; local334 < this.anInt9309 - local220 - local210; local334 += local235) {
				local332.drawImage(this.anImage4, local334, 0, (ImageObserver) null);
			}
			for (@Pc(363) int local363 = 0; local363 < this.anInt9309 - local220 - local210; local363 += local245) {
				local332.drawImage(this.anImage6, local363, this.anInt9314 - local230, (ImageObserver) null);
			}
			@Pc(406) int local406 = (this.anInt9309 - local210 - local220) * local47 / 100;
			@Pc(442) int local442;
			if (local406 > 0) {
				@Pc(420) Image local420 = Static469.aCanvas11.createImage(local406, this.anInt9314 - local230 - local240);
				@Pc(424) int local424 = local420.getWidth((ImageObserver) null);
				@Pc(427) Graphics local427 = local420.getGraphics();
				@Pc(437) int local437 = this.anInt9327 * Static555.method7592() / 10 % local250;
				for (local442 = local437 - local250; local442 < local424; local442 += local250) {
					local427.drawImage(this.anImage5, local442, 0, (ImageObserver) null);
				}
				local332.drawImage(local420, 0, local240, (ImageObserver) null);
			}
			@Pc(468) int local468 = local406;
			local406 = this.anInt9309 - local210 - local220 - local406;
			if (local406 > 0) {
				@Pc(492) Image local492 = Static469.aCanvas11.createImage(local406, this.anInt9314 - local240 - local230);
				@Pc(496) int local496 = local492.getWidth((ImageObserver) null);
				@Pc(499) Graphics local499 = local492.getGraphics();
				for (local442 = 0; local442 < local496; local442 += local255) {
					local499.drawImage(this.anImage11, local442, 0, (ImageObserver) null);
				}
				local332.drawImage(local492, local468, local240, (ImageObserver) null);
			}
			local61.drawImage(this.anImage13, local210 + local264, local274, (ImageObserver) null);
			local61.setFont(this.aFont2);
			local61.setColor(this.aColor1);
			local61.drawString(local51, (this.anInt9309 - this.aFontMetrics1.stringWidth(local51)) / 2 + local264, this.anInt9314 / 2 + (local274 - -4) - -this.anInt9323);
			local41.drawImage(Static582.anImage3, 0, 0, (ImageObserver) null);
		} catch (@Pc(578) Exception local578) {
			this.aBoolean700 = true;
		}
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(JB)Z")
	@Override
	public boolean method7913(@OriginalArg(0) long arg0) {
		return true;
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(II)I")
	private int method7915(@OriginalArg(1) int arg0) {
		return this.aBoolean699 ? (Static483.anInt8181 - arg0) / 2 : 0;
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(Ljava/lang/Class;Ljava/lang/String;B)Ljava/lang/Object;")
	private Object method7917(@OriginalArg(0) Class arg0, @OriginalArg(1) String arg1) throws IllegalAccessException, NoSuchFieldException {
		@Pc(7) Field local7 = arg0.getDeclaredField(arg1);
		@Pc(11) Object local11 = local7.get(Static287.anApplet2);
		local7.set(Static287.anApplet2, (Object) null);
		return local11;
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(B)V")
	private void method7918() throws IllegalAccessException, NoSuchFieldException {
		@Pc(6) Class local6 = Static287.anApplet2.getClass();
		this.anImage5 = (Image) this.method7917(local6, "bar");
		this.anImage11 = (Image) this.method7917(local6, "background");
		this.anImage7 = (Image) this.method7917(local6, "left");
		this.anImage8 = (Image) this.method7917(local6, "right");
		this.anImage4 = (Image) this.method7917(local6, "top");
		this.anImage6 = (Image) this.method7917(local6, "bottom");
		this.anImage10 = (Image) this.method7917(local6, "bodyLeft");
		this.anImage12 = (Image) this.method7917(local6, "bodyRight");
		this.anImage9 = (Image) this.method7917(local6, "bodyFill");
		this.aFont2 = (Font) this.method7917(local6, "bf");
		this.aFontMetrics1 = (FontMetrics) this.method7917(local6, "bfm");
		this.aColor1 = (Color) this.method7917(local6, "colourtext");
		@Pc(108) Object local108 = this.method7917(local6, "lb");
		@Pc(117) Class local117 = local108.getClass();
		this.aBoolean698 = this.method7919(local108, "xMiddle", local117);
		this.aBoolean699 = this.method7919(local108, "yMiddle", local117);
		this.anInt9325 = this.method7922(local108, "xOffset", local117);
		this.anInt9317 = this.method7922(local108, "yOffset", local117);
		this.anInt9309 = this.method7922(local108, "width", local117);
		this.anInt9314 = this.method7922(local108, "height", local117);
		this.anInt9320 = this.method7922(local108, "boxXOffset", local117);
		this.anInt9329 = this.method7922(local108, "boxYOffset", local117);
		this.anInt9332 = this.method7922(local108, "boxWidth", local117);
		this.anInt9323 = this.method7922(local108, "textYOffset", local117);
		this.anInt9327 = this.method7922(local108, "offsetPerTenCycles", local117);
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(Z)I")
	@Override
	public int method7909() {
		return 100;
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Class;Z)Z")
	private boolean method7919(@OriginalArg(0) Object arg0, @OriginalArg(1) String arg1, @OriginalArg(2) Class arg2) throws IllegalAccessException, NoSuchFieldException {
		@Pc(12) Field local12 = arg2.getDeclaredField(arg1);
		return local12.getBoolean(arg0);
	}

	@OriginalMember(owner = "client!tu", name = "b", descriptor = "(I)V")
	@Override
	public void method7911() {
		Static132.method2274();
	}

	@OriginalMember(owner = "client!tu", name = "b", descriptor = "(B)V")
	private void method7921() {
		Static251.method3971(Static12.aClass124_1.method2780(), Static520.aColorArray6[Static659.anInt10093], Static125.aColorArray3[Static659.anInt10093], Static12.aClass124_1.method2774(), Static408.aColorArray7[Static659.anInt10093]);
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(ZLjava/lang/Object;Ljava/lang/String;Ljava/lang/Class;)I")
	private int method7922(@OriginalArg(1) Object arg0, @OriginalArg(2) String arg1, @OriginalArg(3) Class arg2) throws IllegalAccessException, NoSuchFieldException {
		@Pc(7) Field local7 = arg2.getDeclaredField(arg1);
		return local7.getInt(arg0);
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(I)I")
	@Override
	public int method7910() {
		return 0;
	}

	@OriginalMember(owner = "client!tu", name = "b", descriptor = "(II)I")
	private int method7923(@OriginalArg(1) int arg0) {
		return this.aBoolean698 ? (Static654.anInt10064 - arg0) / 2 : 0;
	}
}
