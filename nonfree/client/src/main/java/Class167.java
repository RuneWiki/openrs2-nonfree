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

@OriginalClass("client!jfa")
public final class Class167 implements Interface22 {

	@OriginalMember(owner = "client!jfa", name = "a", descriptor = "Ljava/awt/Color;")
	private Color aColor1;

	@OriginalMember(owner = "client!jfa", name = "f", descriptor = "I")
	private int anInt4320;

	@OriginalMember(owner = "client!jfa", name = "g", descriptor = "Ljava/awt/Image;")
	private Image anImage3;

	@OriginalMember(owner = "client!jfa", name = "h", descriptor = "I")
	private int anInt4321;

	@OriginalMember(owner = "client!jfa", name = "i", descriptor = "I")
	private int anInt4322;

	@OriginalMember(owner = "client!jfa", name = "j", descriptor = "Ljava/awt/Image;")
	private Image anImage4;

	@OriginalMember(owner = "client!jfa", name = "k", descriptor = "Ljava/awt/Image;")
	private Image anImage5;

	@OriginalMember(owner = "client!jfa", name = "l", descriptor = "I")
	private int anInt4323;

	@OriginalMember(owner = "client!jfa", name = "m", descriptor = "I")
	private int anInt4324;

	@OriginalMember(owner = "client!jfa", name = "n", descriptor = "Ljava/awt/Image;")
	private Image anImage6;

	@OriginalMember(owner = "client!jfa", name = "o", descriptor = "Z")
	private boolean aBoolean350;

	@OriginalMember(owner = "client!jfa", name = "t", descriptor = "Ljava/awt/Image;")
	private Image anImage7;

	@OriginalMember(owner = "client!jfa", name = "u", descriptor = "I")
	private int anInt4328;

	@OriginalMember(owner = "client!jfa", name = "v", descriptor = "Ljava/awt/Font;")
	private Font aFont1;

	@OriginalMember(owner = "client!jfa", name = "w", descriptor = "Ljava/awt/Image;")
	private Image anImage8;

	@OriginalMember(owner = "client!jfa", name = "y", descriptor = "I")
	private int anInt4330;

	@OriginalMember(owner = "client!jfa", name = "z", descriptor = "I")
	private int anInt4331;

	@OriginalMember(owner = "client!jfa", name = "A", descriptor = "Ljava/awt/Image;")
	private Image anImage9;

	@OriginalMember(owner = "client!jfa", name = "D", descriptor = "Z")
	private boolean aBoolean351;

	@OriginalMember(owner = "client!jfa", name = "E", descriptor = "I")
	private int anInt4333;

	@OriginalMember(owner = "client!jfa", name = "I", descriptor = "Z")
	private boolean aBoolean352;

	@OriginalMember(owner = "client!jfa", name = "J", descriptor = "Ljava/awt/Image;")
	private Image anImage10;

	@OriginalMember(owner = "client!jfa", name = "L", descriptor = "Ljava/awt/FontMetrics;")
	private FontMetrics aFontMetrics1;

	@OriginalMember(owner = "client!jfa", name = "N", descriptor = "Ljava/awt/Image;")
	private Image anImage11;

	@OriginalMember(owner = "client!jfa", name = "O", descriptor = "Ljava/awt/Image;")
	private Image anImage12;

	@OriginalMember(owner = "client!jfa", name = "c", descriptor = "(I)V")
	@Override
	public void method6466() {
		Static157.method2385();
	}

	@OriginalMember(owner = "client!jfa", name = "a", descriptor = "(BLjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;)Z")
	private boolean method3971(@OriginalArg(1) Object arg0, @OriginalArg(2) Class arg1, @OriginalArg(3) String arg2) throws IllegalAccessException, NoSuchFieldException {
		@Pc(13) Field local13 = arg1.getDeclaredField(arg2);
		return local13.getBoolean(arg0);
	}

	@OriginalMember(owner = "client!jfa", name = "a", descriptor = "(BI)I")
	private int method3972(@OriginalArg(1) int arg0) {
		return this.aBoolean352 ? (Static438.anInt7403 - arg0) / 2 : 0;
	}

	@OriginalMember(owner = "client!jfa", name = "a", descriptor = "(II)I")
	private int method3973(@OriginalArg(1) int arg0) {
		return this.aBoolean351 ? (Static254.anInt4283 - arg0) / 2 : 0;
	}

	@OriginalMember(owner = "client!jfa", name = "a", descriptor = "(B)V")
	@Override
	public void method6463() {
	}

	@OriginalMember(owner = "client!jfa", name = "c", descriptor = "(B)V")
	private void method3975() throws IllegalAccessException, NoSuchFieldException {
		@Pc(6) Class local6 = Static270.anApplet5.getClass();
		this.anImage10 = (Image) this.method3976(local6, "bar");
		this.anImage9 = (Image) this.method3976(local6, "background");
		this.anImage6 = (Image) this.method3976(local6, "left");
		this.anImage12 = (Image) this.method3976(local6, "right");
		this.anImage11 = (Image) this.method3976(local6, "top");
		this.anImage3 = (Image) this.method3976(local6, "bottom");
		this.anImage5 = (Image) this.method3976(local6, "bodyLeft");
		this.anImage7 = (Image) this.method3976(local6, "bodyRight");
		this.anImage4 = (Image) this.method3976(local6, "bodyFill");
		this.aFont1 = (Font) this.method3976(local6, "bf");
		this.aFontMetrics1 = (FontMetrics) this.method3976(local6, "bfm");
		this.aColor1 = (Color) this.method3976(local6, "colourtext");
		@Pc(114) Object local114 = this.method3976(local6, "lb");
		@Pc(117) Class local117 = local114.getClass();
		this.aBoolean351 = this.method3971(local114, local117, "xMiddle");
		this.aBoolean352 = this.method3971(local114, local117, "yMiddle");
		this.anInt4324 = this.method3977(local117, "xOffset", local114);
		this.anInt4321 = this.method3977(local117, "yOffset", local114);
		this.anInt4330 = this.method3977(local117, "width", local114);
		this.anInt4331 = this.method3977(local117, "height", local114);
		this.anInt4322 = this.method3977(local117, "boxXOffset", local114);
		this.anInt4320 = this.method3977(local117, "boxYOffset", local114);
		this.anInt4328 = this.method3977(local117, "boxWidth", local114);
		this.anInt4323 = this.method3977(local117, "textYOffset", local114);
		this.anInt4333 = this.method3977(local117, "offsetPerTenCycles", local114);
	}

	@OriginalMember(owner = "client!jfa", name = "b", descriptor = "(I)I")
	@Override
	public int method6465() {
		return 0;
	}

	@OriginalMember(owner = "client!jfa", name = "a", descriptor = "(ZB)V")
	@Override
	public void method6467(@OriginalArg(0) boolean arg0) {
		if (!this.aBoolean350) {
			if (Static270.anApplet5 == null) {
				this.aBoolean350 = true;
			} else if (this.aFont1 == null) {
				try {
					this.method3975();
				} catch (@Pc(23) Exception local23) {
					this.aBoolean350 = true;
				}
			}
		}
		if (this.aBoolean350) {
			this.method3978();
			return;
		}
		@Pc(37) Graphics local37 = Static181.aCanvas3.getGraphics();
		if (local37 == null) {
			Static181.aCanvas3.repaint();
			return;
		}
		try {
			@Pc(43) int local43 = Static182.aClass90_1.method1823();
			@Pc(47) String local47 = Static182.aClass90_1.method1833();
			if (Static357.anImage13 == null) {
				Static357.anImage13 = Static181.aCanvas3.createImage(Static254.anInt4283, Static438.anInt7403);
			}
			@Pc(57) Graphics local57 = Static357.anImage13.getGraphics();
			local57.clearRect(0, 0, Static254.anInt4283, Static438.anInt7403);
			@Pc(68) int local68 = this.anImage5.getWidth((ImageObserver) null);
			@Pc(73) int local73 = this.anImage7.getWidth((ImageObserver) null);
			@Pc(78) int local78 = this.anImage4.getWidth((ImageObserver) null);
			@Pc(83) int local83 = this.anImage5.getHeight((ImageObserver) null);
			@Pc(88) int local88 = this.anImage7.getHeight((ImageObserver) null);
			@Pc(93) int local93 = this.anImage4.getHeight((ImageObserver) null);
			local57.drawImage(this.anImage5, this.method3973(local68) + this.anInt4322 - this.anInt4328 / 2, this.method3972(local83) - -this.anInt4320, (ImageObserver) null);
			@Pc(131) int local131 = local68 + this.anInt4322 - this.anInt4328 / 2;
			@Pc(140) int local140 = this.anInt4322 + this.anInt4328 / 2;
			for (@Pc(142) int local142 = local131; local142 <= local140; local142 += local78) {
				local57.drawImage(this.anImage4, this.method3973(local68) + this.anInt4322 + local142, this.method3972(local93) + this.anInt4320, (ImageObserver) null);
			}
			local57.drawImage(this.anImage7, this.method3973(local73) + this.anInt4322 + this.anInt4328 / 2, this.method3972(local88) - -this.anInt4320, (ImageObserver) null);
			@Pc(205) int local205 = this.anImage6.getWidth((ImageObserver) null);
			@Pc(210) int local210 = this.anImage6.getHeight((ImageObserver) null);
			@Pc(215) int local215 = this.anImage12.getWidth((ImageObserver) null);
			@Pc(220) int local220 = this.anImage12.getHeight((ImageObserver) null);
			@Pc(225) int local225 = this.anImage3.getHeight((ImageObserver) null);
			@Pc(230) int local230 = this.anImage11.getWidth((ImageObserver) null);
			@Pc(235) int local235 = this.anImage11.getHeight((ImageObserver) null);
			@Pc(240) int local240 = this.anImage3.getWidth((ImageObserver) null);
			@Pc(245) int local245 = this.anImage10.getWidth((ImageObserver) null);
			@Pc(250) int local250 = this.anImage9.getWidth((ImageObserver) null);
			@Pc(259) int local259 = this.method3973(this.anInt4330) + this.anInt4324;
			@Pc(268) int local268 = this.method3972(this.anInt4331) + this.anInt4321;
			local57.drawImage(this.anImage6, local259, (this.anInt4331 - local210) / 2 + local268, (ImageObserver) null);
			local57.drawImage(this.anImage12, this.anInt4330 + local259 - local215, (this.anInt4331 + -local220) / 2 + local268, (ImageObserver) null);
			if (this.anImage8 == null) {
				this.anImage8 = Static181.aCanvas3.createImage(this.anInt4330 - local205 - local215, this.anInt4331);
			}
			@Pc(327) Graphics local327 = this.anImage8.getGraphics();
			for (@Pc(329) int local329 = 0; local329 < this.anInt4330 - local205 - local215; local329 += local230) {
				local327.drawImage(this.anImage11, local329, 0, (ImageObserver) null);
			}
			for (@Pc(355) int local355 = 0; local355 < this.anInt4330 - local205 - local215; local355 += local240) {
				local327.drawImage(this.anImage3, local355, this.anInt4331 - local225, (ImageObserver) null);
			}
			@Pc(395) int local395 = (this.anInt4330 - local215 - local205) * local43 / 100;
			@Pc(430) int local430;
			if (local395 > 0) {
				@Pc(409) Image local409 = Static181.aCanvas3.createImage(local395, this.anInt4331 - local225 - local235);
				@Pc(413) int local413 = local409.getWidth((ImageObserver) null);
				@Pc(416) Graphics local416 = local409.getGraphics();
				@Pc(426) int local426 = this.anInt4333 * Static450.method6699() / 10 % local245;
				for (local430 = local426 - local245; local430 < local413; local430 += local245) {
					local416.drawImage(this.anImage10, local430, 0, (ImageObserver) null);
				}
				local327.drawImage(local409, 0, local235, (ImageObserver) null);
			}
			@Pc(456) int local456 = local395;
			local395 = this.anInt4330 - local395 - local205 - local215;
			if (local395 > 0) {
				@Pc(484) Image local484 = Static181.aCanvas3.createImage(local395, this.anInt4331 - local235 - local225);
				@Pc(488) int local488 = local484.getWidth((ImageObserver) null);
				@Pc(491) Graphics local491 = local484.getGraphics();
				for (local430 = 0; local430 < local488; local430 += local250) {
					local491.drawImage(this.anImage9, local430, 0, (ImageObserver) null);
				}
				local327.drawImage(local484, local456, local235, (ImageObserver) null);
			}
			local57.drawImage(this.anImage8, local259 + local205, local268, (ImageObserver) null);
			local57.setFont(this.aFont1);
			local57.setColor(this.aColor1);
			local57.drawString(local47, (this.anInt4330 - this.aFontMetrics1.stringWidth(local47)) / 2 + local259, this.anInt4331 / 2 + local268 + 4 - -this.anInt4323);
			local37.drawImage(Static357.anImage13, 0, 0, (ImageObserver) null);
		} catch (@Pc(572) Exception local572) {
			this.aBoolean350 = true;
		}
	}

	@OriginalMember(owner = "client!jfa", name = "a", descriptor = "(Ljava/lang/Class;ILjava/lang/String;)Ljava/lang/Object;")
	private Object method3976(@OriginalArg(0) Class arg0, @OriginalArg(2) String arg1) throws IllegalAccessException, NoSuchFieldException {
		@Pc(7) Field local7 = arg0.getDeclaredField(arg1);
		@Pc(11) Object local11 = local7.get(Static270.anApplet5);
		local7.set(Static270.anApplet5, (Object) null);
		return local11;
	}

	@OriginalMember(owner = "client!jfa", name = "a", descriptor = "(I)I")
	@Override
	public int method6464() {
		return 100;
	}

	@OriginalMember(owner = "client!jfa", name = "a", descriptor = "(JI)Z")
	@Override
	public boolean method6468(@OriginalArg(0) long arg0) {
		return true;
	}

	@OriginalMember(owner = "client!jfa", name = "a", descriptor = "(BLjava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)I")
	private int method3977(@OriginalArg(1) Class arg0, @OriginalArg(2) String arg1, @OriginalArg(3) Object arg2) throws IllegalAccessException, NoSuchFieldException {
		@Pc(7) Field local7 = arg0.getDeclaredField(arg1);
		return local7.getInt(arg2);
	}

	@OriginalMember(owner = "client!jfa", name = "d", descriptor = "(B)V")
	private void method3978() {
		Static451.method6703(Static182.aClass90_1.method1823(), Static564.aColorArray3[Static409.anInt7033], Static229.aColorArray1[Static409.anInt7033], Static182.aClass90_1.method1833(), Static294.aColorArray2[Static409.anInt7033]);
	}
}
