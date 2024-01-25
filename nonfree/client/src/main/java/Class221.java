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

@OriginalClass("client!lp")
public final class Class221 implements Interface1 {

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "Ljava/awt/Image;")
	private Image anImage2;

	@OriginalMember(owner = "client!lp", name = "c", descriptor = "Ljava/awt/Image;")
	private Image anImage3;

	@OriginalMember(owner = "client!lp", name = "d", descriptor = "Ljava/awt/FontMetrics;")
	private FontMetrics aFontMetrics1;

	@OriginalMember(owner = "client!lp", name = "e", descriptor = "Ljava/awt/Color;")
	private Color aColor1;

	@OriginalMember(owner = "client!lp", name = "h", descriptor = "I")
	private int anInt6771;

	@OriginalMember(owner = "client!lp", name = "i", descriptor = "I")
	private int anInt6772;

	@OriginalMember(owner = "client!lp", name = "k", descriptor = "I")
	private int anInt6774;

	@OriginalMember(owner = "client!lp", name = "l", descriptor = "Ljava/awt/Font;")
	private Font aFont1;

	@OriginalMember(owner = "client!lp", name = "m", descriptor = "Ljava/awt/Image;")
	private Image anImage4;

	@OriginalMember(owner = "client!lp", name = "n", descriptor = "I")
	private int anInt6775;

	@OriginalMember(owner = "client!lp", name = "o", descriptor = "Ljava/awt/Image;")
	private Image anImage5;

	@OriginalMember(owner = "client!lp", name = "p", descriptor = "I")
	private int anInt6776;

	@OriginalMember(owner = "client!lp", name = "q", descriptor = "Ljava/awt/Image;")
	private Image anImage6;

	@OriginalMember(owner = "client!lp", name = "r", descriptor = "I")
	private int anInt6777;

	@OriginalMember(owner = "client!lp", name = "s", descriptor = "Ljava/awt/Image;")
	private Image anImage7;

	@OriginalMember(owner = "client!lp", name = "t", descriptor = "Z")
	private boolean aBoolean513;

	@OriginalMember(owner = "client!lp", name = "v", descriptor = "Ljava/awt/Image;")
	private Image anImage8;

	@OriginalMember(owner = "client!lp", name = "w", descriptor = "I")
	private int anInt6779;

	@OriginalMember(owner = "client!lp", name = "z", descriptor = "I")
	private int anInt6782;

	@OriginalMember(owner = "client!lp", name = "A", descriptor = "Ljava/awt/Image;")
	private Image anImage9;

	@OriginalMember(owner = "client!lp", name = "B", descriptor = "Z")
	private boolean aBoolean514;

	@OriginalMember(owner = "client!lp", name = "C", descriptor = "Ljava/awt/Image;")
	private Image anImage10;

	@OriginalMember(owner = "client!lp", name = "F", descriptor = "Ljava/awt/Image;")
	private Image anImage11;

	@OriginalMember(owner = "client!lp", name = "G", descriptor = "Z")
	private boolean aBoolean515;

	@OriginalMember(owner = "client!lp", name = "M", descriptor = "I")
	private int anInt6787;

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(JZ)Z")
	@Override
	public boolean method7817(@OriginalArg(0) long arg0) {
		return true;
	}

	@OriginalMember(owner = "client!lp", name = "d", descriptor = "(I)V")
	private void method6063() {
		Static158.method3195(Static61.aColorArray1[Static587.anInt10244], Static396.aClass249_1.method6623(), Static173.aColorArray2[Static587.anInt10244], Static408.aColorArray3[Static587.anInt10244], Static396.aClass249_1.method6635());
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(Z)I")
	@Override
	public int method7816() {
		return 100;
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(Ljava/lang/String;BLjava/lang/Class;Ljava/lang/Object;)Z")
	private boolean method6064(@OriginalArg(0) String arg0, @OriginalArg(2) Class arg1, @OriginalArg(3) Object arg2) throws IllegalAccessException, NoSuchFieldException {
		@Pc(12) Field local12 = arg1.getDeclaredField(arg0);
		return local12.getBoolean(arg2);
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(B)V")
	@Override
	public void method7814() {
		Static52.method1056();
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(I)I")
	@Override
	public int method7812() {
		return 0;
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(BI)I")
	private int method6065(@OriginalArg(1) int arg0) {
		return this.aBoolean513 ? (Static19.anInt352 - arg0) / 2 : 0;
	}

	@OriginalMember(owner = "client!lp", name = "b", descriptor = "(I)V")
	@Override
	public void method7815() {
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(II)I")
	private int method6066(@OriginalArg(0) int arg0) {
		return this.aBoolean514 ? (Static406.anInt7570 - arg0) / 2 : 0;
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(IZ)V")
	@Override
	public void method7813(@OriginalArg(1) boolean arg0) {
		if (!this.aBoolean515) {
			if (Static637.anApplet2 == null) {
				this.aBoolean515 = true;
			} else if (this.aFont1 == null) {
				try {
					this.method6069();
				} catch (@Pc(18) Exception local18) {
					this.aBoolean515 = true;
				}
			}
		}
		if (this.aBoolean515) {
			this.method6063();
			return;
		}
		@Pc(38) Graphics local38 = Static641.aCanvas13.getGraphics();
		if (local38 == null) {
			Static641.aCanvas13.repaint();
			return;
		}
		try {
			@Pc(48) int local48 = Static396.aClass249_1.method6623();
			@Pc(52) String local52 = Static396.aClass249_1.method6635();
			if (Static458.anImage12 == null) {
				Static458.anImage12 = Static641.aCanvas13.createImage(Static406.anInt7570, Static19.anInt352);
			}
			@Pc(62) Graphics local62 = Static458.anImage12.getGraphics();
			local62.clearRect(0, 0, Static406.anInt7570, Static19.anInt352);
			@Pc(73) int local73 = this.anImage2.getWidth((ImageObserver) null);
			@Pc(78) int local78 = this.anImage7.getWidth((ImageObserver) null);
			@Pc(83) int local83 = this.anImage10.getWidth((ImageObserver) null);
			@Pc(88) int local88 = this.anImage2.getHeight((ImageObserver) null);
			@Pc(93) int local93 = this.anImage7.getHeight((ImageObserver) null);
			@Pc(98) int local98 = this.anImage10.getHeight((ImageObserver) null);
			local62.drawImage(this.anImage2, this.method6066(local73) + this.anInt6772 - this.anInt6775 / 2, this.method6065(local88) - -this.anInt6774, (ImageObserver) null);
			@Pc(135) int local135 = this.anInt6772 + local73 - this.anInt6775 / 2;
			@Pc(143) int local143 = this.anInt6775 / 2 + this.anInt6772;
			for (@Pc(145) int local145 = local135; local145 <= local143; local145 += local83) {
				local62.drawImage(this.anImage10, local145 + this.method6066(local73) + this.anInt6772, this.method6065(local98) + this.anInt6774, (ImageObserver) null);
			}
			local62.drawImage(this.anImage7, this.method6066(local78) + this.anInt6772 + this.anInt6775 / 2, this.method6065(local93) + this.anInt6774, (ImageObserver) null);
			@Pc(208) int local208 = this.anImage11.getWidth((ImageObserver) null);
			@Pc(213) int local213 = this.anImage11.getHeight((ImageObserver) null);
			@Pc(218) int local218 = this.anImage3.getWidth((ImageObserver) null);
			@Pc(223) int local223 = this.anImage3.getHeight((ImageObserver) null);
			@Pc(228) int local228 = this.anImage9.getHeight((ImageObserver) null);
			@Pc(233) int local233 = this.anImage8.getWidth((ImageObserver) null);
			@Pc(238) int local238 = this.anImage8.getHeight((ImageObserver) null);
			@Pc(243) int local243 = this.anImage9.getWidth((ImageObserver) null);
			@Pc(248) int local248 = this.anImage6.getWidth((ImageObserver) null);
			@Pc(253) int local253 = this.anImage5.getWidth((ImageObserver) null);
			@Pc(263) int local263 = this.method6066(this.anInt6782) + this.anInt6777;
			@Pc(273) int local273 = this.method6065(this.anInt6771) + this.anInt6779;
			local62.drawImage(this.anImage11, local263, (this.anInt6771 - local213) / 2 + local273, (ImageObserver) null);
			local62.drawImage(this.anImage3, local263 + this.anInt6782 - local218, (this.anInt6771 - local223) / 2 + local273, (ImageObserver) null);
			if (this.anImage4 == null) {
				this.anImage4 = Static641.aCanvas13.createImage(this.anInt6782 - local208 - local218, this.anInt6771);
			}
			@Pc(329) Graphics local329 = this.anImage4.getGraphics();
			for (@Pc(331) int local331 = 0; local331 < this.anInt6782 - local208 - local218; local331 += local233) {
				local329.drawImage(this.anImage8, local331, 0, (ImageObserver) null);
			}
			for (@Pc(357) int local357 = 0; local357 < this.anInt6782 - local218 - local208; local357 += local243) {
				local329.drawImage(this.anImage9, local357, this.anInt6771 - local228, (ImageObserver) null);
			}
			@Pc(397) int local397 = local48 * (this.anInt6782 - local218 - local208) / 100;
			@Pc(436) int local436;
			if (local397 > 0) {
				@Pc(414) Image local414 = Static641.aCanvas13.createImage(local397, this.anInt6771 - local238 - local228);
				@Pc(418) int local418 = local414.getWidth((ImageObserver) null);
				@Pc(421) Graphics local421 = local414.getGraphics();
				@Pc(431) int local431 = this.anInt6776 * Static335.method5522() / 10 % local248;
				for (local436 = local431 - local248; local436 < local418; local436 += local248) {
					local421.drawImage(this.anImage6, local436, 0, (ImageObserver) null);
				}
				local329.drawImage(local414, 0, local238, (ImageObserver) null);
			}
			@Pc(462) int local462 = local397;
			local397 = this.anInt6782 - local208 - local218 - local397;
			if (local397 > 0) {
				@Pc(484) Image local484 = Static641.aCanvas13.createImage(local397, this.anInt6771 - local238 - local228);
				@Pc(488) int local488 = local484.getWidth((ImageObserver) null);
				@Pc(491) Graphics local491 = local484.getGraphics();
				for (local436 = 0; local436 < local488; local436 += local253) {
					local491.drawImage(this.anImage5, local436, 0, (ImageObserver) null);
				}
				local329.drawImage(local484, local462, local238, (ImageObserver) null);
			}
			local62.drawImage(this.anImage4, local263 + local208, local273, (ImageObserver) null);
			local62.setFont(this.aFont1);
			local62.setColor(this.aColor1);
			local62.drawString(local52, local263 + (this.anInt6782 - this.aFontMetrics1.stringWidth(local52)) / 2, this.anInt6771 / 2 + local273 - (-4 - this.anInt6787));
			local38.drawImage(Static458.anImage12, 0, 0, (ImageObserver) null);
		} catch (@Pc(573) Exception local573) {
			this.aBoolean515 = true;
		}
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(Ljava/lang/Class;Ljava/lang/String;I)Ljava/lang/Object;")
	private Object method6067(@OriginalArg(0) Class arg0, @OriginalArg(1) String arg1) throws IllegalAccessException, NoSuchFieldException {
		@Pc(13) Field local13 = arg0.getDeclaredField(arg1);
		@Pc(17) Object local17 = local13.get(Static637.anApplet2);
		local13.set(Static637.anApplet2, (Object) null);
		return local17;
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)I")
	private int method6068(@OriginalArg(1) Class arg0, @OriginalArg(2) String arg1, @OriginalArg(3) Object arg2) throws IllegalAccessException, NoSuchFieldException {
		@Pc(7) Field local7 = arg0.getDeclaredField(arg1);
		return local7.getInt(arg2);
	}

	@OriginalMember(owner = "client!lp", name = "b", descriptor = "(B)V")
	private void method6069() throws IllegalAccessException, NoSuchFieldException {
		@Pc(14) Class local14 = Static637.anApplet2.getClass();
		this.anImage6 = (Image) this.method6067(local14, "bar");
		this.anImage5 = (Image) this.method6067(local14, "background");
		this.anImage11 = (Image) this.method6067(local14, "left");
		this.anImage3 = (Image) this.method6067(local14, "right");
		this.anImage8 = (Image) this.method6067(local14, "top");
		this.anImage9 = (Image) this.method6067(local14, "bottom");
		this.anImage2 = (Image) this.method6067(local14, "bodyLeft");
		this.anImage7 = (Image) this.method6067(local14, "bodyRight");
		this.anImage10 = (Image) this.method6067(local14, "bodyFill");
		this.aFont1 = (Font) this.method6067(local14, "bf");
		this.aFontMetrics1 = (FontMetrics) this.method6067(local14, "bfm");
		this.aColor1 = (Color) this.method6067(local14, "colourtext");
		@Pc(122) Object local122 = this.method6067(local14, "lb");
		@Pc(125) Class local125 = local122.getClass();
		this.aBoolean514 = this.method6064("xMiddle", local125, local122);
		this.aBoolean513 = this.method6064("yMiddle", local125, local122);
		this.anInt6777 = this.method6068(local125, "xOffset", local122);
		this.anInt6779 = this.method6068(local125, "yOffset", local122);
		this.anInt6782 = this.method6068(local125, "width", local122);
		this.anInt6771 = this.method6068(local125, "height", local122);
		this.anInt6772 = this.method6068(local125, "boxXOffset", local122);
		this.anInt6774 = this.method6068(local125, "boxYOffset", local122);
		this.anInt6775 = this.method6068(local125, "boxWidth", local122);
		this.anInt6787 = this.method6068(local125, "textYOffset", local122);
		this.anInt6776 = this.method6068(local125, "offsetPerTenCycles", local122);
	}
}
