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

@OriginalClass("client!qq")
public final class Class316 implements Interface24 {

	@OriginalMember(owner = "client!qq", name = "s", descriptor = "I")
	private int anInt8343;

	@OriginalMember(owner = "client!qq", name = "P", descriptor = "Ljava/awt/FontMetrics;")
	private FontMetrics aFontMetrics1;

	@OriginalMember(owner = "client!qq", name = "U", descriptor = "Ljava/awt/Image;")
	private Image anImage3;

	@OriginalMember(owner = "client!qq", name = "n", descriptor = "Ljava/awt/Image;")
	private Image anImage4;

	@OriginalMember(owner = "client!qq", name = "i", descriptor = "I")
	private int anInt8345;

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "I")
	private int anInt8346;

	@OriginalMember(owner = "client!qq", name = "g", descriptor = "Ljava/awt/Image;")
	private Image anImage5;

	@OriginalMember(owner = "client!qq", name = "R", descriptor = "Ljava/awt/Image;")
	private Image anImage6;

	@OriginalMember(owner = "client!qq", name = "B", descriptor = "I")
	private int anInt8351;

	@OriginalMember(owner = "client!qq", name = "F", descriptor = "Ljava/awt/Color;")
	private Color aColor1;

	@OriginalMember(owner = "client!qq", name = "x", descriptor = "Z")
	private boolean aBoolean560;

	@OriginalMember(owner = "client!qq", name = "Q", descriptor = "Z")
	private boolean aBoolean561;

	@OriginalMember(owner = "client!qq", name = "k", descriptor = "I")
	private int anInt8353;

	@OriginalMember(owner = "client!qq", name = "w", descriptor = "I")
	private int anInt8355;

	@OriginalMember(owner = "client!qq", name = "L", descriptor = "Ljava/awt/Image;")
	private Image anImage7;

	@OriginalMember(owner = "client!qq", name = "z", descriptor = "Z")
	private boolean aBoolean562;

	@OriginalMember(owner = "client!qq", name = "K", descriptor = "Ljava/awt/Font;")
	private Font aFont3;

	@OriginalMember(owner = "client!qq", name = "h", descriptor = "I")
	private int anInt8359;

	@OriginalMember(owner = "client!qq", name = "S", descriptor = "Ljava/awt/Image;")
	private Image anImage8;

	@OriginalMember(owner = "client!qq", name = "d", descriptor = "Ljava/awt/Image;")
	private Image anImage9;

	@OriginalMember(owner = "client!qq", name = "u", descriptor = "Ljava/awt/Image;")
	private Image anImage10;

	@OriginalMember(owner = "client!qq", name = "m", descriptor = "I")
	private int anInt8361;

	@OriginalMember(owner = "client!qq", name = "t", descriptor = "Ljava/awt/Image;")
	private Image anImage11;

	@OriginalMember(owner = "client!qq", name = "A", descriptor = "Ljava/awt/Image;")
	private Image anImage12;

	@OriginalMember(owner = "client!qq", name = "e", descriptor = "I")
	private int anInt8363;

	@OriginalMember(owner = "client!qq", name = "c", descriptor = "(I)V")
	@Override
	public void method7123() {
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(BI)I")
	private int method7126(@OriginalArg(1) int arg0) {
		return this.aBoolean560 ? (Static76.anInt1720 - arg0) / 2 : 0;
	}

	@OriginalMember(owner = "client!qq", name = "b", descriptor = "(B)V")
	private void method7127() {
		Static369.method5075(Static397.aClass325_1.method7282(), Static166.aColorArray2[Static667.anInt10219], Static48.aColorArray1[Static667.anInt10219], Static397.aClass325_1.method7284(), Static581.aColorArray3[Static667.anInt10219]);
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(B)I")
	@Override
	public int method7122() {
		return 0;
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(II)I")
	private int method7129(@OriginalArg(0) int arg0) {
		return this.aBoolean562 ? (Static681.anInt10652 - arg0) / 2 : 0;
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(I)V")
	@Override
	public void method7121() {
		Static133.method2363();
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(Ljava/lang/Object;BLjava/lang/String;Ljava/lang/Class;)I")
	private int method7130(@OriginalArg(0) Object arg0, @OriginalArg(2) String arg1, @OriginalArg(3) Class arg2) throws IllegalAccessException, NoSuchFieldException {
		@Pc(15) Field local15 = arg2.getDeclaredField(arg1);
		return local15.getInt(arg0);
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(BZ)V")
	@Override
	public void method7119(@OriginalArg(1) boolean arg0) {
		if (!this.aBoolean561) {
			if (Static41.anApplet1 == null) {
				this.aBoolean561 = true;
			} else if (this.aFont3 == null) {
				try {
					this.method7133();
				} catch (@Pc(29) Exception local29) {
					this.aBoolean561 = true;
				}
			}
		}
		if (this.aBoolean561) {
			this.method7127();
			return;
		}
		@Pc(49) Graphics local49 = Static508.aCanvas8.getGraphics();
		if (local49 == null) {
			Static508.aCanvas8.repaint();
			return;
		}
		try {
			@Pc(55) int local55 = Static397.aClass325_1.method7284();
			@Pc(59) String local59 = Static397.aClass325_1.method7282();
			if (Static565.anImage13 == null) {
				Static565.anImage13 = Static508.aCanvas8.createImage(Static681.anInt10652, Static76.anInt1720);
			}
			@Pc(71) Graphics local71 = Static565.anImage13.getGraphics();
			local71.clearRect(0, 0, Static681.anInt10652, Static76.anInt1720);
			@Pc(82) int local82 = this.anImage5.getWidth((ImageObserver) null);
			@Pc(87) int local87 = this.anImage7.getWidth((ImageObserver) null);
			@Pc(92) int local92 = this.anImage10.getWidth((ImageObserver) null);
			@Pc(97) int local97 = this.anImage5.getHeight((ImageObserver) null);
			@Pc(102) int local102 = this.anImage7.getHeight((ImageObserver) null);
			@Pc(107) int local107 = this.anImage10.getHeight((ImageObserver) null);
			local71.drawImage(this.anImage5, this.method7129(local82) + this.anInt8345 - this.anInt8353 / 2, this.method7126(local97) - -this.anInt8351, (ImageObserver) null);
			@Pc(145) int local145 = this.anInt8345 + local82 - this.anInt8353 / 2;
			@Pc(154) int local154 = this.anInt8345 + this.anInt8353 / 2;
			for (@Pc(156) int local156 = local145; local156 <= local154; local156 += local92) {
				local71.drawImage(this.anImage10, this.method7129(local82) + this.anInt8345 + local156, this.method7126(local107) - -this.anInt8351, (ImageObserver) null);
			}
			local71.drawImage(this.anImage7, this.method7129(local87) + this.anInt8345 + this.anInt8353 / 2, this.method7126(local102) + this.anInt8351, (ImageObserver) null);
			@Pc(226) int local226 = this.anImage3.getWidth((ImageObserver) null);
			@Pc(231) int local231 = this.anImage3.getHeight((ImageObserver) null);
			@Pc(236) int local236 = this.anImage11.getWidth((ImageObserver) null);
			@Pc(241) int local241 = this.anImage11.getHeight((ImageObserver) null);
			@Pc(246) int local246 = this.anImage12.getHeight((ImageObserver) null);
			@Pc(251) int local251 = this.anImage4.getWidth((ImageObserver) null);
			@Pc(256) int local256 = this.anImage4.getHeight((ImageObserver) null);
			@Pc(261) int local261 = this.anImage12.getWidth((ImageObserver) null);
			@Pc(266) int local266 = this.anImage9.getWidth((ImageObserver) null);
			@Pc(271) int local271 = this.anImage6.getWidth((ImageObserver) null);
			@Pc(281) int local281 = this.method7129(this.anInt8343) + this.anInt8363;
			@Pc(290) int local290 = this.method7126(this.anInt8361) + this.anInt8346;
			local71.drawImage(this.anImage3, local281, local290 + (this.anInt8361 - local231) / 2, (ImageObserver) null);
			local71.drawImage(this.anImage11, local281 + this.anInt8343 - local236, local290 - -((-local241 + this.anInt8361) / 2), (ImageObserver) null);
			if (this.anImage8 == null) {
				this.anImage8 = Static508.aCanvas8.createImage(this.anInt8343 - local226 - local236, this.anInt8361);
			}
			@Pc(352) Graphics local352 = this.anImage8.getGraphics();
			for (@Pc(354) int local354 = 0; local354 < this.anInt8343 - local236 - local226; local354 += local251) {
				local352.drawImage(this.anImage4, local354, 0, (ImageObserver) null);
			}
			for (@Pc(381) int local381 = 0; local381 < this.anInt8343 - local236 - local226; local381 += local261) {
				local352.drawImage(this.anImage12, local381, this.anInt8361 - local246, (ImageObserver) null);
			}
			@Pc(430) int local430 = (this.anInt8343 - local236 - local226) * local55 / 100;
			@Pc(468) int local468;
			if (local430 > 0) {
				@Pc(446) Image local446 = Static508.aCanvas8.createImage(local430, this.anInt8361 - local246 - local256);
				@Pc(450) int local450 = local446.getWidth((ImageObserver) null);
				@Pc(453) Graphics local453 = local446.getGraphics();
				@Pc(463) int local463 = this.anInt8355 * Static355.method9492() / 10 % local266;
				for (local468 = local463 - local266; local468 < local450; local468 += local266) {
					local453.drawImage(this.anImage9, local468, 0, (ImageObserver) null);
				}
				local352.drawImage(local446, 0, local256, (ImageObserver) null);
			}
			@Pc(504) int local504 = local430;
			local430 = this.anInt8343 - local226 - local236 - local430;
			if (local430 > 0) {
				@Pc(529) Image local529 = Static508.aCanvas8.createImage(local430, this.anInt8361 - local256 - local246);
				@Pc(533) int local533 = local529.getWidth((ImageObserver) null);
				@Pc(536) Graphics local536 = local529.getGraphics();
				for (local468 = 0; local468 < local533; local468 += local271) {
					local536.drawImage(this.anImage6, local468, 0, (ImageObserver) null);
				}
				local352.drawImage(local529, local504, local256, (ImageObserver) null);
			}
			local71.drawImage(this.anImage8, local226 + local281, local290, (ImageObserver) null);
			local71.setFont(this.aFont3);
			local71.setColor(this.aColor1);
			local71.drawString(local59, local281 + (this.anInt8343 - this.aFontMetrics1.stringWidth(local59)) / 2, local290 - (-(this.anInt8361 / 2) - (this.anInt8359 + 4)));
			local49.drawImage(Static565.anImage13, 0, 0, (ImageObserver) null);
		} catch (@Pc(622) Exception local622) {
			this.aBoolean561 = true;
		}
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(ZJ)Z")
	@Override
	public boolean method7120(@OriginalArg(1) long arg0) {
		return true;
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;")
	private Object method7131(@OriginalArg(1) String arg0, @OriginalArg(2) Class arg1) throws IllegalAccessException, NoSuchFieldException {
		@Pc(7) Field local7 = arg1.getDeclaredField(arg0);
		@Pc(20) Object local20 = local7.get(Static41.anApplet1);
		local7.set(Static41.anApplet1, (Object) null);
		return local20;
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/Object;Ljava/lang/Class;)Z")
	private boolean method7132(@OriginalArg(1) String arg0, @OriginalArg(2) Object arg1, @OriginalArg(3) Class arg2) throws IllegalAccessException, NoSuchFieldException {
		@Pc(14) Field local14 = arg2.getDeclaredField(arg0);
		return local14.getBoolean(arg1);
	}

	@OriginalMember(owner = "client!qq", name = "e", descriptor = "(I)V")
	private void method7133() throws IllegalAccessException, NoSuchFieldException {
		@Pc(6) Class local6 = Static41.anApplet1.getClass();
		this.anImage9 = (Image) this.method7131("bar", local6);
		this.anImage6 = (Image) this.method7131("background", local6);
		this.anImage3 = (Image) this.method7131("left", local6);
		this.anImage11 = (Image) this.method7131("right", local6);
		this.anImage4 = (Image) this.method7131("top", local6);
		this.anImage12 = (Image) this.method7131("bottom", local6);
		this.anImage5 = (Image) this.method7131("bodyLeft", local6);
		this.anImage7 = (Image) this.method7131("bodyRight", local6);
		this.anImage10 = (Image) this.method7131("bodyFill", local6);
		this.aFont3 = (Font) this.method7131("bf", local6);
		this.aFontMetrics1 = (FontMetrics) this.method7131("bfm", local6);
		this.aColor1 = (Color) this.method7131("colourtext", local6);
		@Pc(134) Object local134 = this.method7131("lb", local6);
		@Pc(137) Class local137 = local134.getClass();
		this.aBoolean562 = this.method7132("xMiddle", local134, local137);
		this.aBoolean560 = this.method7132("yMiddle", local134, local137);
		this.anInt8363 = this.method7130(local134, "xOffset", local137);
		this.anInt8346 = this.method7130(local134, "yOffset", local137);
		this.anInt8343 = this.method7130(local134, "width", local137);
		this.anInt8361 = this.method7130(local134, "height", local137);
		this.anInt8345 = this.method7130(local134, "boxXOffset", local137);
		this.anInt8351 = this.method7130(local134, "boxYOffset", local137);
		this.anInt8353 = this.method7130(local134, "boxWidth", local137);
		this.anInt8359 = this.method7130(local134, "textYOffset", local137);
		this.anInt8355 = this.method7130(local134, "offsetPerTenCycles", local137);
	}

	@OriginalMember(owner = "client!qq", name = "b", descriptor = "(I)I")
	@Override
	public int method7124() {
		return 100;
	}
}
