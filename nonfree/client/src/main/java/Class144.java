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

@OriginalClass("client!hc")
public final class Class144 implements Interface5 {

	@OriginalMember(owner = "client!hc", name = "g", descriptor = "Ljava/awt/Image;")
	private Image anImage1;

	@OriginalMember(owner = "client!hc", name = "h", descriptor = "I")
	private int anInt4073;

	@OriginalMember(owner = "client!hc", name = "j", descriptor = "Ljava/awt/Image;")
	private Image anImage2;

	@OriginalMember(owner = "client!hc", name = "k", descriptor = "Ljava/awt/Image;")
	private Image anImage3;

	@OriginalMember(owner = "client!hc", name = "l", descriptor = "Ljava/awt/Image;")
	private Image anImage4;

	@OriginalMember(owner = "client!hc", name = "m", descriptor = "I")
	private int anInt4075;

	@OriginalMember(owner = "client!hc", name = "o", descriptor = "Ljava/awt/Color;")
	private Color aColor1;

	@OriginalMember(owner = "client!hc", name = "p", descriptor = "I")
	private int anInt4077;

	@OriginalMember(owner = "client!hc", name = "q", descriptor = "Z")
	private boolean aBoolean334;

	@OriginalMember(owner = "client!hc", name = "r", descriptor = "Ljava/awt/Image;")
	private Image anImage5;

	@OriginalMember(owner = "client!hc", name = "s", descriptor = "I")
	private int anInt4078;

	@OriginalMember(owner = "client!hc", name = "t", descriptor = "I")
	private int anInt4079;

	@OriginalMember(owner = "client!hc", name = "w", descriptor = "Z")
	private boolean aBoolean335;

	@OriginalMember(owner = "client!hc", name = "y", descriptor = "I")
	private int anInt4082;

	@OriginalMember(owner = "client!hc", name = "A", descriptor = "Ljava/awt/Image;")
	private Image anImage6;

	@OriginalMember(owner = "client!hc", name = "B", descriptor = "I")
	private int anInt4084;

	@OriginalMember(owner = "client!hc", name = "C", descriptor = "Ljava/awt/Image;")
	private Image anImage7;

	@OriginalMember(owner = "client!hc", name = "E", descriptor = "Ljava/awt/Image;")
	private Image anImage8;

	@OriginalMember(owner = "client!hc", name = "F", descriptor = "Ljava/awt/Font;")
	private Font aFont2;

	@OriginalMember(owner = "client!hc", name = "G", descriptor = "I")
	private int anInt4086;

	@OriginalMember(owner = "client!hc", name = "H", descriptor = "Ljava/awt/Image;")
	private Image anImage9;

	@OriginalMember(owner = "client!hc", name = "I", descriptor = "Ljava/awt/FontMetrics;")
	private FontMetrics aFontMetrics1;

	@OriginalMember(owner = "client!hc", name = "J", descriptor = "Ljava/awt/Image;")
	private Image anImage10;

	@OriginalMember(owner = "client!hc", name = "N", descriptor = "I")
	private int anInt4090;

	@OriginalMember(owner = "client!hc", name = "O", descriptor = "Z")
	private boolean aBoolean336;

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(Ljava/lang/Class;ZLjava/lang/Object;Ljava/lang/String;)I")
	private int method3464(@OriginalArg(0) Class arg0, @OriginalArg(2) Object arg1, @OriginalArg(3) String arg2) throws IllegalAccessException, NoSuchFieldException {
		@Pc(7) Field local7 = arg0.getDeclaredField(arg2);
		return local7.getInt(arg1);
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(BJ)Z")
	@Override
	public boolean method8490(@OriginalArg(1) long arg0) {
		return true;
	}

	@OriginalMember(owner = "client!hc", name = "c", descriptor = "(I)V")
	@Override
	public void method8494() {
	}

	@OriginalMember(owner = "client!hc", name = "d", descriptor = "(I)V")
	private void method3465() {
		Static356.method5357(Static471.aClass352_41.method8265(), Static471.aClass352_41.method8257(), Static169.aColorArray1[Static362.anInt4830], Static220.aColorArray4[Static362.anInt4830], Static544.aColorArray5[Static362.anInt4830]);
	}

	@OriginalMember(owner = "client!hc", name = "e", descriptor = "(I)V")
	private void method3466() throws IllegalAccessException, NoSuchFieldException {
		@Pc(6) Class local6 = Static639.anApplet2.getClass();
		this.anImage10 = (Image) this.method3472(local6, "bar");
		this.anImage2 = (Image) this.method3472(local6, "background");
		this.anImage4 = (Image) this.method3472(local6, "left");
		this.anImage6 = (Image) this.method3472(local6, "right");
		this.anImage8 = (Image) this.method3472(local6, "top");
		this.anImage1 = (Image) this.method3472(local6, "bottom");
		this.anImage5 = (Image) this.method3472(local6, "bodyLeft");
		this.anImage9 = (Image) this.method3472(local6, "bodyRight");
		this.anImage3 = (Image) this.method3472(local6, "bodyFill");
		this.aFont2 = (Font) this.method3472(local6, "bf");
		this.aFontMetrics1 = (FontMetrics) this.method3472(local6, "bfm");
		this.aColor1 = (Color) this.method3472(local6, "colourtext");
		@Pc(115) Object local115 = this.method3472(local6, "lb");
		@Pc(118) Class local118 = local115.getClass();
		this.aBoolean335 = this.method3473(local118, "xMiddle", local115);
		this.aBoolean336 = this.method3473(local118, "yMiddle", local115);
		this.anInt4086 = this.method3464(local118, local115, "xOffset");
		this.anInt4084 = this.method3464(local118, local115, "yOffset");
		this.anInt4090 = this.method3464(local118, local115, "width");
		this.anInt4079 = this.method3464(local118, local115, "height");
		this.anInt4082 = this.method3464(local118, local115, "boxXOffset");
		this.anInt4078 = this.method3464(local118, local115, "boxYOffset");
		this.anInt4073 = this.method3464(local118, local115, "boxWidth");
		this.anInt4075 = this.method3464(local118, local115, "textYOffset");
		this.anInt4077 = this.method3464(local118, local115, "offsetPerTenCycles");
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(ZI)I")
	private int method3468(@OriginalArg(1) int arg0) {
		return this.aBoolean336 ? (Static79.anInt1140 - arg0) / 2 : 0;
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(II)I")
	private int method3470(@OriginalArg(1) int arg0) {
		return this.aBoolean335 ? (Static32.anInt510 - arg0) / 2 : 0;
	}

	@OriginalMember(owner = "client!hc", name = "b", descriptor = "(I)V")
	@Override
	public void method8493() {
		Static79.method1037();
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(B)I")
	@Override
	public int method8489() {
		return 100;
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8491(@OriginalArg(1) boolean arg0) {
		if (!this.aBoolean334) {
			if (Static639.anApplet2 == null) {
				this.aBoolean334 = true;
			} else if (this.aFont2 == null) {
				try {
					this.method3466();
				} catch (@Pc(23) Exception local23) {
					this.aBoolean334 = true;
				}
			}
		}
		if (this.aBoolean334) {
			this.method3465();
			return;
		}
		@Pc(45) Graphics local45 = Static141.aCanvas7.getGraphics();
		if (local45 == null) {
			Static141.aCanvas7.repaint();
			return;
		}
		try {
			@Pc(51) int local51 = Static471.aClass352_41.method8257();
			@Pc(55) String local55 = Static471.aClass352_41.method8265();
			if (Static336.anImage13 == null) {
				Static336.anImage13 = Static141.aCanvas7.createImage(Static32.anInt510, Static79.anInt1140);
			}
			@Pc(65) Graphics local65 = Static336.anImage13.getGraphics();
			local65.clearRect(0, 0, Static32.anInt510, Static79.anInt1140);
			@Pc(76) int local76 = this.anImage5.getWidth((ImageObserver) null);
			@Pc(81) int local81 = this.anImage9.getWidth((ImageObserver) null);
			@Pc(86) int local86 = this.anImage3.getWidth((ImageObserver) null);
			@Pc(91) int local91 = this.anImage5.getHeight((ImageObserver) null);
			@Pc(96) int local96 = this.anImage9.getHeight((ImageObserver) null);
			@Pc(101) int local101 = this.anImage3.getHeight((ImageObserver) null);
			local65.drawImage(this.anImage5, this.method3470(local76) + this.anInt4082 - this.anInt4073 / 2, this.method3468(local91) + this.anInt4078, (ImageObserver) null);
			@Pc(137) int local137 = local76 + this.anInt4082 - this.anInt4073 / 2;
			@Pc(145) int local145 = this.anInt4082 + this.anInt4073 / 2;
			for (@Pc(147) int local147 = local137; local147 <= local145; local147 += local86) {
				local65.drawImage(this.anImage3, this.method3470(local76) + this.anInt4082 + local147, this.method3468(local101) - -this.anInt4078, (ImageObserver) null);
			}
			local65.drawImage(this.anImage9, this.method3470(local81) + this.anInt4082 + this.anInt4073 / 2, this.method3468(local96) - -this.anInt4078, (ImageObserver) null);
			@Pc(212) int local212 = this.anImage4.getWidth((ImageObserver) null);
			@Pc(217) int local217 = this.anImage4.getHeight((ImageObserver) null);
			@Pc(222) int local222 = this.anImage6.getWidth((ImageObserver) null);
			@Pc(227) int local227 = this.anImage6.getHeight((ImageObserver) null);
			@Pc(232) int local232 = this.anImage1.getHeight((ImageObserver) null);
			@Pc(237) int local237 = this.anImage8.getWidth((ImageObserver) null);
			@Pc(242) int local242 = this.anImage8.getHeight((ImageObserver) null);
			@Pc(247) int local247 = this.anImage1.getWidth((ImageObserver) null);
			@Pc(252) int local252 = this.anImage10.getWidth((ImageObserver) null);
			@Pc(257) int local257 = this.anImage2.getWidth((ImageObserver) null);
			@Pc(267) int local267 = this.method3470(this.anInt4090) + this.anInt4086;
			@Pc(276) int local276 = this.method3468(this.anInt4079) + this.anInt4084;
			local65.drawImage(this.anImage4, local267, local276 + (this.anInt4079 - local217) / 2, (ImageObserver) null);
			local65.drawImage(this.anImage6, local267 + this.anInt4090 - local222, (this.anInt4079 - local227) / 2 + local276, (ImageObserver) null);
			if (this.anImage7 == null) {
				this.anImage7 = Static141.aCanvas7.createImage(this.anInt4090 - local222 - local212, this.anInt4079);
			}
			@Pc(335) Graphics local335 = this.anImage7.getGraphics();
			for (@Pc(337) int local337 = 0; local337 < this.anInt4090 - local222 - local212; local337 += local237) {
				local335.drawImage(this.anImage8, local337, 0, (ImageObserver) null);
			}
			for (@Pc(367) int local367 = 0; local367 < this.anInt4090 - local212 - local222; local367 += local247) {
				local335.drawImage(this.anImage1, local367, this.anInt4079 - local232, (ImageObserver) null);
			}
			@Pc(405) int local405 = (this.anInt4090 - local212 - local222) * local51 / 100;
			@Pc(440) int local440;
			if (local405 > 0) {
				@Pc(418) Image local418 = Static141.aCanvas7.createImage(local405, this.anInt4079 - local242 - local232);
				@Pc(422) int local422 = local418.getWidth((ImageObserver) null);
				@Pc(425) Graphics local425 = local418.getGraphics();
				@Pc(435) int local435 = this.anInt4077 * Static653.method8766() / 10 % local252;
				for (local440 = local435 - local252; local440 < local422; local440 += local252) {
					local425.drawImage(this.anImage10, local440, 0, (ImageObserver) null);
				}
				local335.drawImage(local418, 0, local242, (ImageObserver) null);
			}
			@Pc(470) int local470 = local405;
			local405 = this.anInt4090 - local212 - local222 - local405;
			if (local405 > 0) {
				@Pc(495) Image local495 = Static141.aCanvas7.createImage(local405, this.anInt4079 - local232 - local242);
				@Pc(499) int local499 = local495.getWidth((ImageObserver) null);
				@Pc(502) Graphics local502 = local495.getGraphics();
				for (local440 = 0; local440 < local499; local440 += local257) {
					local502.drawImage(this.anImage2, local440, 0, (ImageObserver) null);
				}
				local335.drawImage(local495, local470, local242, (ImageObserver) null);
			}
			local65.drawImage(this.anImage7, local212 + local267, local276, (ImageObserver) null);
			local65.setFont(this.aFont2);
			local65.setColor(this.aColor1);
			local65.drawString(local55, local267 + (this.anInt4090 - this.aFontMetrics1.stringWidth(local55)) / 2, this.anInt4075 + 4 + this.anInt4079 / 2 + local276);
			local45.drawImage(Static336.anImage13, 0, 0, (ImageObserver) null);
		} catch (@Pc(582) Exception local582) {
			this.aBoolean334 = true;
		}
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(Ljava/lang/Class;Ljava/lang/String;Z)Ljava/lang/Object;")
	private Object method3472(@OriginalArg(0) Class arg0, @OriginalArg(1) String arg1) throws IllegalAccessException, NoSuchFieldException {
		@Pc(13) Field local13 = arg0.getDeclaredField(arg1);
		@Pc(17) Object local17 = local13.get(Static639.anApplet2);
		local13.set(Static639.anApplet2, (Object) null);
		return local17;
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(BLjava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)Z")
	private boolean method3473(@OriginalArg(1) Class arg0, @OriginalArg(2) String arg1, @OriginalArg(3) Object arg2) throws IllegalAccessException, NoSuchFieldException {
		@Pc(11) Field local11 = arg0.getDeclaredField(arg1);
		return local11.getBoolean(arg2);
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(I)I")
	@Override
	public int method8492() {
		return 0;
	}
}
