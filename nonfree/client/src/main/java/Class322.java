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

@OriginalClass("client!sga")
public final class Class322 implements Interface13 {

	@OriginalMember(owner = "client!sga", name = "a", descriptor = "Z")
	private boolean aBoolean590;

	@OriginalMember(owner = "client!sga", name = "b", descriptor = "I")
	private int anInt8571;

	@OriginalMember(owner = "client!sga", name = "d", descriptor = "Ljava/awt/Image;")
	private Image anImage4;

	@OriginalMember(owner = "client!sga", name = "e", descriptor = "Ljava/awt/Color;")
	private Color aColor1;

	@OriginalMember(owner = "client!sga", name = "f", descriptor = "Ljava/awt/Image;")
	private Image anImage5;

	@OriginalMember(owner = "client!sga", name = "g", descriptor = "I")
	private int anInt8573;

	@OriginalMember(owner = "client!sga", name = "h", descriptor = "Ljava/awt/Image;")
	private Image anImage6;

	@OriginalMember(owner = "client!sga", name = "j", descriptor = "I")
	private int anInt8575;

	@OriginalMember(owner = "client!sga", name = "m", descriptor = "Ljava/awt/Image;")
	private Image anImage7;

	@OriginalMember(owner = "client!sga", name = "p", descriptor = "Ljava/awt/Image;")
	private Image anImage8;

	@OriginalMember(owner = "client!sga", name = "q", descriptor = "Ljava/awt/FontMetrics;")
	private FontMetrics aFontMetrics1;

	@OriginalMember(owner = "client!sga", name = "r", descriptor = "Ljava/awt/Image;")
	private Image anImage9;

	@OriginalMember(owner = "client!sga", name = "s", descriptor = "I")
	private int anInt8580;

	@OriginalMember(owner = "client!sga", name = "t", descriptor = "I")
	private int anInt8581;

	@OriginalMember(owner = "client!sga", name = "w", descriptor = "I")
	private int anInt8584;

	@OriginalMember(owner = "client!sga", name = "z", descriptor = "Z")
	private boolean aBoolean591;

	@OriginalMember(owner = "client!sga", name = "A", descriptor = "Ljava/awt/Font;")
	private Font aFont2;

	@OriginalMember(owner = "client!sga", name = "C", descriptor = "Ljava/awt/Image;")
	private Image anImage10;

	@OriginalMember(owner = "client!sga", name = "F", descriptor = "I")
	private int anInt8589;

	@OriginalMember(owner = "client!sga", name = "G", descriptor = "Ljava/awt/Image;")
	private Image anImage11;

	@OriginalMember(owner = "client!sga", name = "H", descriptor = "Z")
	private boolean aBoolean592;

	@OriginalMember(owner = "client!sga", name = "I", descriptor = "Ljava/awt/Image;")
	private Image anImage12;

	@OriginalMember(owner = "client!sga", name = "K", descriptor = "I")
	private int anInt8591;

	@OriginalMember(owner = "client!sga", name = "L", descriptor = "I")
	private int anInt8592;

	@OriginalMember(owner = "client!sga", name = "M", descriptor = "Ljava/awt/Image;")
	private Image anImage13;

	@OriginalMember(owner = "client!sga", name = "a", descriptor = "(I)I")
	@Override
	public int method7040() {
		return 100;
	}

	@OriginalMember(owner = "client!sga", name = "a", descriptor = "(BJ)Z")
	@Override
	public boolean method7041(@OriginalArg(1) long arg0) {
		return true;
	}

	@OriginalMember(owner = "client!sga", name = "a", descriptor = "(B)I")
	@Override
	public int method7038() {
		return 0;
	}

	@OriginalMember(owner = "client!sga", name = "d", descriptor = "(I)V")
	private void method7045() throws IllegalAccessException, NoSuchFieldException {
		@Pc(6) Class local6 = Static339.anApplet2.getClass();
		this.anImage12 = (Image) this.method7047(local6, "bar");
		this.anImage9 = (Image) this.method7047(local6, "background");
		this.anImage11 = (Image) this.method7047(local6, "left");
		this.anImage13 = (Image) this.method7047(local6, "right");
		this.anImage7 = (Image) this.method7047(local6, "top");
		this.anImage5 = (Image) this.method7047(local6, "bottom");
		this.anImage8 = (Image) this.method7047(local6, "bodyLeft");
		this.anImage10 = (Image) this.method7047(local6, "bodyRight");
		this.anImage6 = (Image) this.method7047(local6, "bodyFill");
		this.aFont2 = (Font) this.method7047(local6, "bf");
		this.aFontMetrics1 = (FontMetrics) this.method7047(local6, "bfm");
		this.aColor1 = (Color) this.method7047(local6, "colourtext");
		@Pc(108) Object local108 = this.method7047(local6, "lb");
		@Pc(111) Class local111 = local108.getClass();
		this.aBoolean591 = this.method7049("xMiddle", local111, local108);
		this.aBoolean590 = this.method7049("yMiddle", local111, local108);
		this.anInt8584 = this.method7051(local111, local108, "xOffset");
		this.anInt8580 = this.method7051(local111, local108, "yOffset");
		this.anInt8592 = this.method7051(local111, local108, "width");
		this.anInt8581 = this.method7051(local111, local108, "height");
		this.anInt8573 = this.method7051(local111, local108, "boxXOffset");
		this.anInt8589 = this.method7051(local111, local108, "boxYOffset");
		this.anInt8575 = this.method7051(local111, local108, "boxWidth");
		this.anInt8571 = this.method7051(local111, local108, "textYOffset");
		this.anInt8591 = this.method7051(local111, local108, "offsetPerTenCycles");
	}

	@OriginalMember(owner = "client!sga", name = "b", descriptor = "(B)V")
	private void method7046() {
		Static128.method1923(Static292.aColorArray4[Static520.anInt8219], Static111.aColorArray1[Static520.anInt8219], Static74.aClass191_1.method4361(), Static514.aColorArray5[Static520.anInt8219], Static74.aClass191_1.method4352());
	}

	@OriginalMember(owner = "client!sga", name = "a", descriptor = "(Ljava/lang/Class;ILjava/lang/String;)Ljava/lang/Object;")
	private Object method7047(@OriginalArg(0) Class arg0, @OriginalArg(2) String arg1) throws IllegalAccessException, NoSuchFieldException {
		@Pc(7) Field local7 = arg0.getDeclaredField(arg1);
		@Pc(11) Object local11 = local7.get(Static339.anApplet2);
		local7.set(Static339.anApplet2, (Object) null);
		return local11;
	}

	@OriginalMember(owner = "client!sga", name = "c", descriptor = "(I)V")
	@Override
	public void method7043() {
		Static306.method4426();
	}

	@OriginalMember(owner = "client!sga", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/Class;Ljava/lang/Object;)Z")
	private boolean method7049(@OriginalArg(1) String arg0, @OriginalArg(2) Class arg1, @OriginalArg(3) Object arg2) throws IllegalAccessException, NoSuchFieldException {
		@Pc(13) Field local13 = arg1.getDeclaredField(arg0);
		return local13.getBoolean(arg2);
	}

	@OriginalMember(owner = "client!sga", name = "a", descriptor = "(BI)I")
	private int method7050(@OriginalArg(1) int arg0) {
		return this.aBoolean591 ? (Static531.anInt8327 - arg0) / 2 : 0;
	}

	@OriginalMember(owner = "client!sga", name = "a", descriptor = "(ZB)V")
	@Override
	public void method7039(@OriginalArg(0) boolean arg0) {
		if (!this.aBoolean592) {
			if (Static339.anApplet2 == null) {
				this.aBoolean592 = true;
			} else if (this.aFont2 == null) {
				try {
					this.method7045();
				} catch (@Pc(21) Exception local21) {
					this.aBoolean592 = true;
				}
			}
		}
		if (this.aBoolean592) {
			this.method7046();
			return;
		}
		@Pc(43) Graphics local43 = Static330.aCanvas5.getGraphics();
		if (local43 == null) {
			Static330.aCanvas5.repaint();
			return;
		}
		try {
			@Pc(52) int local52 = Static74.aClass191_1.method4352();
			@Pc(56) String local56 = Static74.aClass191_1.method4361();
			if (Static312.anImage2 == null) {
				Static312.anImage2 = Static330.aCanvas5.createImage(Static531.anInt8327, Static13.anInt306);
			}
			@Pc(66) Graphics local66 = Static312.anImage2.getGraphics();
			local66.clearRect(0, 0, Static531.anInt8327, Static13.anInt306);
			@Pc(77) int local77 = this.anImage8.getWidth((ImageObserver) null);
			@Pc(82) int local82 = this.anImage10.getWidth((ImageObserver) null);
			@Pc(87) int local87 = this.anImage6.getWidth((ImageObserver) null);
			@Pc(92) int local92 = this.anImage8.getHeight((ImageObserver) null);
			@Pc(97) int local97 = this.anImage10.getHeight((ImageObserver) null);
			@Pc(102) int local102 = this.anImage6.getHeight((ImageObserver) null);
			local66.drawImage(this.anImage8, this.method7050(local77) + this.anInt8573 - this.anInt8575 / 2, this.method7052(local92) + this.anInt8589, (ImageObserver) null);
			@Pc(137) int local137 = local77 + this.anInt8573 - this.anInt8575 / 2;
			@Pc(145) int local145 = this.anInt8575 / 2 + this.anInt8573;
			for (@Pc(147) int local147 = local137; local147 <= local145; local147 += local87) {
				local66.drawImage(this.anImage6, this.method7050(local77) + this.anInt8573 + local147, this.method7052(local102) - -this.anInt8589, (ImageObserver) null);
			}
			local66.drawImage(this.anImage10, this.method7050(local82) + this.anInt8573 + this.anInt8575 / 2, this.method7052(local97) + this.anInt8589, (ImageObserver) null);
			@Pc(216) int local216 = this.anImage11.getWidth((ImageObserver) null);
			@Pc(221) int local221 = this.anImage11.getHeight((ImageObserver) null);
			@Pc(226) int local226 = this.anImage13.getWidth((ImageObserver) null);
			@Pc(231) int local231 = this.anImage13.getHeight((ImageObserver) null);
			@Pc(236) int local236 = this.anImage5.getHeight((ImageObserver) null);
			@Pc(241) int local241 = this.anImage7.getWidth((ImageObserver) null);
			@Pc(246) int local246 = this.anImage7.getHeight((ImageObserver) null);
			@Pc(251) int local251 = this.anImage5.getWidth((ImageObserver) null);
			@Pc(256) int local256 = this.anImage12.getWidth((ImageObserver) null);
			@Pc(261) int local261 = this.anImage9.getWidth((ImageObserver) null);
			@Pc(270) int local270 = this.method7050(this.anInt8592) + this.anInt8584;
			@Pc(280) int local280 = this.method7052(this.anInt8581) + this.anInt8580;
			local66.drawImage(this.anImage11, local270, (this.anInt8581 - local221) / 2 + local280, (ImageObserver) null);
			local66.drawImage(this.anImage13, this.anInt8592 + local270 - local226, local280 - -((this.anInt8581 - local231) / 2), (ImageObserver) null);
			if (this.anImage4 == null) {
				this.anImage4 = Static330.aCanvas5.createImage(this.anInt8592 - local226 - local216, this.anInt8581);
			}
			@Pc(338) Graphics local338 = this.anImage4.getGraphics();
			for (@Pc(340) int local340 = 0; local340 < this.anInt8592 - local216 - local226; local340 += local241) {
				local338.drawImage(this.anImage7, local340, 0, (ImageObserver) null);
			}
			for (@Pc(366) int local366 = 0; local366 < this.anInt8592 - local216 - local226; local366 += local251) {
				local338.drawImage(this.anImage5, local366, this.anInt8581 - local236, (ImageObserver) null);
			}
			@Pc(409) int local409 = local52 * (this.anInt8592 - local216 - local226) / 100;
			@Pc(448) int local448;
			if (local409 > 0) {
				@Pc(426) Image local426 = Static330.aCanvas5.createImage(local409, this.anInt8581 - local246 - local236);
				@Pc(430) int local430 = local426.getWidth((ImageObserver) null);
				@Pc(433) Graphics local433 = local426.getGraphics();
				@Pc(443) int local443 = this.anInt8591 * Static474.method6315() / 10 % local256;
				for (local448 = local443 - local256; local448 < local430; local448 += local256) {
					local433.drawImage(this.anImage12, local448, 0, (ImageObserver) null);
				}
				local338.drawImage(local426, 0, local246, (ImageObserver) null);
			}
			@Pc(478) int local478 = local409;
			local409 = this.anInt8592 - local409 - local216 - local226;
			if (local409 > 0) {
				@Pc(507) Image local507 = Static330.aCanvas5.createImage(local409, this.anInt8581 - local246 - local236);
				@Pc(511) int local511 = local507.getWidth((ImageObserver) null);
				@Pc(514) Graphics local514 = local507.getGraphics();
				for (local448 = 0; local448 < local511; local448 += local261) {
					local514.drawImage(this.anImage9, local448, 0, (ImageObserver) null);
				}
				local338.drawImage(local507, local478, local246, (ImageObserver) null);
			}
			local66.drawImage(this.anImage4, local216 + local270, local280, (ImageObserver) null);
			local66.setFont(this.aFont2);
			local66.setColor(this.aColor1);
			local66.drawString(local56, local270 + (this.anInt8592 - this.aFontMetrics1.stringWidth(local56)) / 2, local280 - (-(this.anInt8581 / 2) - 4 + -this.anInt8571));
			local43.drawImage(Static312.anImage2, 0, 0, (ImageObserver) null);
		} catch (@Pc(598) Exception local598) {
			this.aBoolean592 = true;
		}
	}

	@OriginalMember(owner = "client!sga", name = "a", descriptor = "(Ljava/lang/Class;Ljava/lang/Object;Ljava/lang/String;B)I")
	private int method7051(@OriginalArg(0) Class arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) String arg2) throws IllegalAccessException, NoSuchFieldException {
		@Pc(7) Field local7 = arg0.getDeclaredField(arg2);
		return local7.getInt(arg1);
	}

	@OriginalMember(owner = "client!sga", name = "b", descriptor = "(BI)I")
	private int method7052(@OriginalArg(1) int arg0) {
		return this.aBoolean590 ? (Static13.anInt306 - arg0) / 2 : 0;
	}

	@OriginalMember(owner = "client!sga", name = "b", descriptor = "(I)V")
	@Override
	public void method7042() {
	}
}
