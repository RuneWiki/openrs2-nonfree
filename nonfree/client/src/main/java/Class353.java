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

@OriginalClass("client!tea")
public final class Class353 implements Interface23 {

	@OriginalMember(owner = "client!tea", name = "e", descriptor = "Ljava/awt/Image;")
	private Image anImage4;

	@OriginalMember(owner = "client!tea", name = "w", descriptor = "I")
	private int anInt9863;

	@OriginalMember(owner = "client!tea", name = "J", descriptor = "Ljava/awt/Image;")
	private Image anImage5;

	@OriginalMember(owner = "client!tea", name = "b", descriptor = "I")
	private int anInt9869;

	@OriginalMember(owner = "client!tea", name = "t", descriptor = "Z")
	private boolean aBoolean716;

	@OriginalMember(owner = "client!tea", name = "K", descriptor = "Ljava/awt/Image;")
	private Image anImage6;

	@OriginalMember(owner = "client!tea", name = "h", descriptor = "Z")
	private boolean aBoolean717;

	@OriginalMember(owner = "client!tea", name = "F", descriptor = "Ljava/awt/Image;")
	private Image anImage7;

	@OriginalMember(owner = "client!tea", name = "I", descriptor = "I")
	private int anInt9872;

	@OriginalMember(owner = "client!tea", name = "j", descriptor = "Ljava/awt/Color;")
	private Color aColor1;

	@OriginalMember(owner = "client!tea", name = "L", descriptor = "Ljava/awt/Image;")
	private Image anImage8;

	@OriginalMember(owner = "client!tea", name = "i", descriptor = "Ljava/awt/FontMetrics;")
	private FontMetrics aFontMetrics1;

	@OriginalMember(owner = "client!tea", name = "o", descriptor = "I")
	private int anInt9878;

	@OriginalMember(owner = "client!tea", name = "u", descriptor = "Ljava/awt/Image;")
	private Image anImage9;

	@OriginalMember(owner = "client!tea", name = "A", descriptor = "Ljava/awt/Image;")
	private Image anImage10;

	@OriginalMember(owner = "client!tea", name = "f", descriptor = "I")
	private int anInt9881;

	@OriginalMember(owner = "client!tea", name = "d", descriptor = "Ljava/awt/Image;")
	private Image anImage11;

	@OriginalMember(owner = "client!tea", name = "m", descriptor = "I")
	private int anInt9882;

	@OriginalMember(owner = "client!tea", name = "C", descriptor = "I")
	private int anInt9883;

	@OriginalMember(owner = "client!tea", name = "H", descriptor = "I")
	private int anInt9885;

	@OriginalMember(owner = "client!tea", name = "n", descriptor = "Z")
	private boolean aBoolean718;

	@OriginalMember(owner = "client!tea", name = "g", descriptor = "I")
	private int anInt9886;

	@OriginalMember(owner = "client!tea", name = "v", descriptor = "Ljava/awt/Image;")
	private Image anImage12;

	@OriginalMember(owner = "client!tea", name = "q", descriptor = "Ljava/awt/Image;")
	private Image anImage13;

	@OriginalMember(owner = "client!tea", name = "O", descriptor = "Ljava/awt/Font;")
	private Font aFont2;

	@OriginalMember(owner = "client!tea", name = "c", descriptor = "(I)V")
	@Override
	public void method8327() {
	}

	@OriginalMember(owner = "client!tea", name = "a", descriptor = "(ZB)V")
	@Override
	public void method8326(@OriginalArg(0) boolean arg0) {
		if (!this.aBoolean716) {
			if (Static395.anApplet1 == null) {
				this.aBoolean716 = true;
			} else if (this.aFont2 == null) {
				try {
					this.method8335();
				} catch (@Pc(33) Exception local33) {
					this.aBoolean716 = true;
				}
			}
		}
		if (this.aBoolean716) {
			this.method8341();
			return;
		}
		@Pc(52) Graphics local52 = Static67.aCanvas1.getGraphics();
		if (local52 == null) {
			Static67.aCanvas1.repaint();
			return;
		}
		try {
			@Pc(62) int local62 = Static720.aClass264_1.method6406();
			@Pc(66) String local66 = Static720.aClass264_1.method6407();
			if (Static156.anImage1 == null) {
				Static156.anImage1 = Static67.aCanvas1.createImage(Static575.anInt9435, Static272.anInt5005);
			}
			@Pc(78) Graphics local78 = Static156.anImage1.getGraphics();
			local78.clearRect(0, 0, Static575.anInt9435, Static272.anInt5005);
			@Pc(89) int local89 = this.anImage9.getWidth((ImageObserver) null);
			@Pc(94) int local94 = this.anImage12.getWidth((ImageObserver) null);
			@Pc(99) int local99 = this.anImage11.getWidth((ImageObserver) null);
			@Pc(104) int local104 = this.anImage9.getHeight((ImageObserver) null);
			@Pc(109) int local109 = this.anImage12.getHeight((ImageObserver) null);
			@Pc(114) int local114 = this.anImage11.getHeight((ImageObserver) null);
			local78.drawImage(this.anImage9, this.method8334(local89) + this.anInt9886 - this.anInt9878 / 2, this.method8340(local104) - -this.anInt9882, (ImageObserver) null);
			@Pc(153) int local153 = this.anInt9886 + local89 - this.anInt9878 / 2;
			@Pc(162) int local162 = this.anInt9886 + this.anInt9878 / 2;
			for (@Pc(164) int local164 = local153; local164 <= local162; local164 += local99) {
				local78.drawImage(this.anImage11, this.method8334(local89) + this.anInt9886 + local164, this.method8340(local114) - -this.anInt9882, (ImageObserver) null);
			}
			local78.drawImage(this.anImage12, this.method8334(local94) + this.anInt9886 + this.anInt9878 / 2, this.method8340(local109) + this.anInt9882, (ImageObserver) null);
			@Pc(234) int local234 = this.anImage8.getWidth((ImageObserver) null);
			@Pc(239) int local239 = this.anImage8.getHeight((ImageObserver) null);
			@Pc(244) int local244 = this.anImage5.getWidth((ImageObserver) null);
			@Pc(249) int local249 = this.anImage5.getHeight((ImageObserver) null);
			@Pc(254) int local254 = this.anImage7.getHeight((ImageObserver) null);
			@Pc(259) int local259 = this.anImage4.getWidth((ImageObserver) null);
			@Pc(264) int local264 = this.anImage4.getHeight((ImageObserver) null);
			@Pc(269) int local269 = this.anImage7.getWidth((ImageObserver) null);
			@Pc(274) int local274 = this.anImage6.getWidth((ImageObserver) null);
			@Pc(279) int local279 = this.anImage10.getWidth((ImageObserver) null);
			@Pc(288) int local288 = this.method8334(this.anInt9869) + this.anInt9863;
			@Pc(298) int local298 = this.method8340(this.anInt9885) + this.anInt9883;
			local78.drawImage(this.anImage8, local288, (this.anInt9885 - local239) / 2 + local298, (ImageObserver) null);
			local78.drawImage(this.anImage5, local288 + this.anInt9869 - local244, local298 + (this.anInt9885 + -local249) / 2, (ImageObserver) null);
			if (this.anImage13 == null) {
				this.anImage13 = Static67.aCanvas1.createImage(this.anInt9869 - local234 - local244, this.anInt9885);
			}
			@Pc(359) Graphics local359 = this.anImage13.getGraphics();
			for (@Pc(361) int local361 = 0; local361 < this.anInt9869 - local234 - local244; local361 += local259) {
				local359.drawImage(this.anImage4, local361, 0, (ImageObserver) null);
			}
			for (@Pc(393) int local393 = 0; local393 < this.anInt9869 - local244 - local234; local393 += local269) {
				local359.drawImage(this.anImage7, local393, this.anInt9885 - local254, (ImageObserver) null);
			}
			@Pc(440) int local440 = local62 * (this.anInt9869 - local244 - local234) / 100;
			@Pc(477) int local477;
			if (local440 > 0) {
				@Pc(456) Image local456 = Static67.aCanvas1.createImage(local440, this.anInt9885 - local254 - local264);
				@Pc(460) int local460 = local456.getWidth((ImageObserver) null);
				@Pc(463) Graphics local463 = local456.getGraphics();
				@Pc(473) int local473 = this.anInt9872 * Static365.method5206() / 10 % local274;
				for (local477 = local473 - local274; local477 < local460; local477 += local274) {
					local463.drawImage(this.anImage6, local477, 0, (ImageObserver) null);
				}
				local359.drawImage(local456, 0, local264, (ImageObserver) null);
			}
			@Pc(513) int local513 = local440;
			local440 = this.anInt9869 - local440 - local234 - local244;
			if (local440 > 0) {
				@Pc(539) Image local539 = Static67.aCanvas1.createImage(local440, this.anInt9885 - local264 - local254);
				@Pc(543) int local543 = local539.getWidth((ImageObserver) null);
				@Pc(546) Graphics local546 = local539.getGraphics();
				for (local477 = 0; local477 < local543; local477 += local279) {
					local546.drawImage(this.anImage10, local477, 0, (ImageObserver) null);
				}
				local359.drawImage(local539, local513, local264, (ImageObserver) null);
			}
			local78.drawImage(this.anImage13, local234 + local288, local298, (ImageObserver) null);
			local78.setFont(this.aFont2);
			local78.setColor(this.aColor1);
			local78.drawString(local66, local288 + (this.anInt9869 - this.aFontMetrics1.stringWidth(local66)) / 2, this.anInt9881 + 4 + (local298 - -(this.anInt9885 / 2)));
			local52.drawImage(Static156.anImage1, 0, 0, (ImageObserver) null);
		} catch (@Pc(636) Exception local636) {
			this.aBoolean716 = true;
		}
	}

	@OriginalMember(owner = "client!tea", name = "a", descriptor = "(IB)I")
	private int method8334(@OriginalArg(0) int arg0) {
		return this.aBoolean717 ? (Static575.anInt9435 - arg0) / 2 : 0;
	}

	@OriginalMember(owner = "client!tea", name = "c", descriptor = "(B)V")
	private void method8335() throws IllegalAccessException, NoSuchFieldException {
		@Pc(6) Class local6 = Static395.anApplet1.getClass();
		this.anImage6 = (Image) this.method8336(local6, "bar");
		this.anImage10 = (Image) this.method8336(local6, "background");
		this.anImage8 = (Image) this.method8336(local6, "left");
		this.anImage5 = (Image) this.method8336(local6, "right");
		this.anImage4 = (Image) this.method8336(local6, "top");
		this.anImage7 = (Image) this.method8336(local6, "bottom");
		this.anImage9 = (Image) this.method8336(local6, "bodyLeft");
		this.anImage12 = (Image) this.method8336(local6, "bodyRight");
		this.anImage11 = (Image) this.method8336(local6, "bodyFill");
		this.aFont2 = (Font) this.method8336(local6, "bf");
		this.aFontMetrics1 = (FontMetrics) this.method8336(local6, "bfm");
		this.aColor1 = (Color) this.method8336(local6, "colourtext");
		@Pc(134) Object local134 = this.method8336(local6, "lb");
		@Pc(137) Class local137 = local134.getClass();
		this.aBoolean717 = this.method8338(local134, "xMiddle", local137);
		this.aBoolean718 = this.method8338(local134, "yMiddle", local137);
		this.anInt9863 = this.method8339(local134, "xOffset", local137);
		this.anInt9883 = this.method8339(local134, "yOffset", local137);
		this.anInt9869 = this.method8339(local134, "width", local137);
		this.anInt9885 = this.method8339(local134, "height", local137);
		this.anInt9886 = this.method8339(local134, "boxXOffset", local137);
		this.anInt9882 = this.method8339(local134, "boxYOffset", local137);
		this.anInt9878 = this.method8339(local134, "boxWidth", local137);
		this.anInt9881 = this.method8339(local134, "textYOffset", local137);
		this.anInt9872 = this.method8339(local134, "offsetPerTenCycles", local137);
	}

	@OriginalMember(owner = "client!tea", name = "a", descriptor = "(Ljava/lang/Class;Ljava/lang/String;B)Ljava/lang/Object;")
	private Object method8336(@OriginalArg(0) Class arg0, @OriginalArg(1) String arg1) throws IllegalAccessException, NoSuchFieldException {
		@Pc(7) Field local7 = arg0.getDeclaredField(arg1);
		@Pc(11) Object local11 = local7.get(Static395.anApplet1);
		local7.set(Static395.anApplet1, (Object) null);
		return local11;
	}

	@OriginalMember(owner = "client!tea", name = "a", descriptor = "(JI)Z")
	@Override
	public boolean method8328(@OriginalArg(0) long arg0) {
		return true;
	}

	@OriginalMember(owner = "client!tea", name = "a", descriptor = "(I)V")
	@Override
	public void method8329() {
		Static301.method4630();
	}

	@OriginalMember(owner = "client!tea", name = "a", descriptor = "(BLjava/lang/Object;Ljava/lang/String;Ljava/lang/Class;)Z")
	private boolean method8338(@OriginalArg(1) Object arg0, @OriginalArg(2) String arg1, @OriginalArg(3) Class arg2) throws IllegalAccessException, NoSuchFieldException {
		@Pc(15) Field local15 = arg2.getDeclaredField(arg1);
		return local15.getBoolean(arg0);
	}

	@OriginalMember(owner = "client!tea", name = "a", descriptor = "(ILjava/lang/Object;Ljava/lang/String;Ljava/lang/Class;)I")
	private int method8339(@OriginalArg(1) Object arg0, @OriginalArg(2) String arg1, @OriginalArg(3) Class arg2) throws IllegalAccessException, NoSuchFieldException {
		@Pc(14) Field local14 = arg2.getDeclaredField(arg1);
		return local14.getInt(arg0);
	}

	@OriginalMember(owner = "client!tea", name = "a", descriptor = "(B)I")
	@Override
	public int method8331() {
		return 100;
	}

	@OriginalMember(owner = "client!tea", name = "b", descriptor = "(IB)I")
	private int method8340(@OriginalArg(0) int arg0) {
		return this.aBoolean718 ? (Static272.anInt5005 - arg0) / 2 : 0;
	}

	@OriginalMember(owner = "client!tea", name = "d", descriptor = "(I)V")
	private void method8341() {
		Static17.method292(Static601.aColorArray3[Static48.anInt821], Static720.aClass264_1.method6406(), Static720.aClass264_1.method6407(), Static15.aColorArray1[Static48.anInt821], Static294.aColorArray2[Static48.anInt821]);
	}

	@OriginalMember(owner = "client!tea", name = "b", descriptor = "(I)I")
	@Override
	public int method8330() {
		return 0;
	}
}
