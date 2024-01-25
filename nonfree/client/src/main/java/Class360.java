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

@OriginalClass("client!uc")
public final class Class360 implements Interface22 {

	@OriginalMember(owner = "client!uc", name = "b", descriptor = "Z")
	private boolean aBoolean720;

	@OriginalMember(owner = "client!uc", name = "e", descriptor = "Ljava/awt/Image;")
	private Image anImage3;

	@OriginalMember(owner = "client!uc", name = "f", descriptor = "Ljava/awt/Image;")
	private Image anImage4;

	@OriginalMember(owner = "client!uc", name = "g", descriptor = "Z")
	private boolean aBoolean721;

	@OriginalMember(owner = "client!uc", name = "h", descriptor = "Ljava/awt/Image;")
	private Image anImage5;

	@OriginalMember(owner = "client!uc", name = "j", descriptor = "Ljava/awt/FontMetrics;")
	private FontMetrics aFontMetrics1;

	@OriginalMember(owner = "client!uc", name = "k", descriptor = "Ljava/awt/Image;")
	private Image anImage6;

	@OriginalMember(owner = "client!uc", name = "n", descriptor = "I")
	private int anInt9166;

	@OriginalMember(owner = "client!uc", name = "p", descriptor = "Ljava/awt/Image;")
	private Image anImage7;

	@OriginalMember(owner = "client!uc", name = "q", descriptor = "I")
	private int anInt9168;

	@OriginalMember(owner = "client!uc", name = "s", descriptor = "Ljava/awt/Image;")
	private Image anImage8;

	@OriginalMember(owner = "client!uc", name = "t", descriptor = "I")
	private int anInt9170;

	@OriginalMember(owner = "client!uc", name = "w", descriptor = "I")
	private int anInt9173;

	@OriginalMember(owner = "client!uc", name = "A", descriptor = "I")
	private int anInt9177;

	@OriginalMember(owner = "client!uc", name = "B", descriptor = "Ljava/awt/Font;")
	private Font aFont2;

	@OriginalMember(owner = "client!uc", name = "D", descriptor = "I")
	private int anInt9179;

	@OriginalMember(owner = "client!uc", name = "F", descriptor = "Ljava/awt/Color;")
	private Color aColor1;

	@OriginalMember(owner = "client!uc", name = "G", descriptor = "I")
	private int anInt9181;

	@OriginalMember(owner = "client!uc", name = "I", descriptor = "I")
	private int anInt9183;

	@OriginalMember(owner = "client!uc", name = "L", descriptor = "I")
	private int anInt9185;

	@OriginalMember(owner = "client!uc", name = "N", descriptor = "Ljava/awt/Image;")
	private Image anImage9;

	@OriginalMember(owner = "client!uc", name = "O", descriptor = "Ljava/awt/Image;")
	private Image anImage10;

	@OriginalMember(owner = "client!uc", name = "P", descriptor = "Ljava/awt/Image;")
	private Image anImage11;

	@OriginalMember(owner = "client!uc", name = "Q", descriptor = "Z")
	private boolean aBoolean722;

	@OriginalMember(owner = "client!uc", name = "R", descriptor = "Ljava/awt/Image;")
	private Image anImage12;

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(IB)I")
	private int method7830(@OriginalArg(0) int arg0) {
		return this.aBoolean720 ? (Static357.anInt5421 - arg0) / 2 : 0;
	}

	@OriginalMember(owner = "client!uc", name = "b", descriptor = "(Z)V")
	private void method7831() throws IllegalAccessException, NoSuchFieldException {
		@Pc(6) Class local6 = Static649.anApplet2.getClass();
		this.anImage12 = (Image) this.method7832("bar", local6);
		this.anImage3 = (Image) this.method7832("background", local6);
		this.anImage11 = (Image) this.method7832("left", local6);
		this.anImage10 = (Image) this.method7832("right", local6);
		this.anImage6 = (Image) this.method7832("top", local6);
		this.anImage4 = (Image) this.method7832("bottom", local6);
		this.anImage8 = (Image) this.method7832("bodyLeft", local6);
		this.anImage7 = (Image) this.method7832("bodyRight", local6);
		this.anImage5 = (Image) this.method7832("bodyFill", local6);
		this.aFont2 = (Font) this.method7832("bf", local6);
		this.aFontMetrics1 = (FontMetrics) this.method7832("bfm", local6);
		this.aColor1 = (Color) this.method7832("colourtext", local6);
		@Pc(108) Object local108 = this.method7832("lb", local6);
		@Pc(111) Class local111 = local108.getClass();
		this.aBoolean721 = this.method7839(local111, "xMiddle", local108);
		this.aBoolean720 = this.method7839(local111, "yMiddle", local108);
		this.anInt9166 = this.method7835("xOffset", local108, local111);
		this.anInt9173 = this.method7835("yOffset", local108, local111);
		this.anInt9185 = this.method7835("width", local108, local111);
		this.anInt9168 = this.method7835("height", local108, local111);
		this.anInt9170 = this.method7835("boxXOffset", local108, local111);
		this.anInt9181 = this.method7835("boxYOffset", local108, local111);
		this.anInt9179 = this.method7835("boxWidth", local108, local111);
		this.anInt9183 = this.method7835("textYOffset", local108, local111);
		this.anInt9177 = this.method7835("offsetPerTenCycles", local108, local111);
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Class;I)Ljava/lang/Object;")
	private Object method7832(@OriginalArg(0) String arg0, @OriginalArg(1) Class arg1) throws IllegalAccessException, NoSuchFieldException {
		@Pc(13) Field local13 = arg1.getDeclaredField(arg0);
		@Pc(17) Object local17 = local13.get(Static649.anApplet2);
		local13.set(Static649.anApplet2, (Object) null);
		return local17;
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(Z)I")
	@Override
	public int method8777() {
		return 100;
	}

	@OriginalMember(owner = "client!uc", name = "d", descriptor = "(I)V")
	private void method7833() {
		Static674.method8952(Static31.aClass353_3.method7675(), Static657.aColorArray5[Static16.anInt306], Static197.aColorArray3[Static16.anInt306], Static31.aClass353_3.method7688(), Static582.aColorArray4[Static16.anInt306]);
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/Object;Ljava/lang/Class;)I")
	private int method7835(@OriginalArg(0) String arg0, @OriginalArg(2) Object arg1, @OriginalArg(3) Class arg2) throws IllegalAccessException, NoSuchFieldException {
		@Pc(12) Field local12 = arg2.getDeclaredField(arg0);
		return local12.getInt(arg1);
	}

	@OriginalMember(owner = "client!uc", name = "b", descriptor = "(I)V")
	@Override
	public void method8781() {
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(JI)Z")
	@Override
	public boolean method8780(@OriginalArg(0) long arg0) {
		return true;
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(BI)I")
	private int method7837(@OriginalArg(1) int arg0) {
		return this.aBoolean721 ? (Static632.anInt9867 - arg0) / 2 : 0;
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(I)V")
	@Override
	public void method8779() {
		Static284.method4098();
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(B)I")
	@Override
	public int method8776() {
		return 0;
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(Ljava/lang/Class;Ljava/lang/String;BLjava/lang/Object;)Z")
	private boolean method7839(@OriginalArg(0) Class arg0, @OriginalArg(1) String arg1, @OriginalArg(3) Object arg2) throws IllegalAccessException, NoSuchFieldException {
		@Pc(12) Field local12 = arg0.getDeclaredField(arg1);
		return local12.getBoolean(arg2);
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method8778(@OriginalArg(0) boolean arg0) {
		if (!this.aBoolean722) {
			if (Static649.anApplet2 == null) {
				this.aBoolean722 = true;
			} else if (this.aFont2 == null) {
				try {
					this.method7831();
				} catch (@Pc(18) Exception local18) {
					this.aBoolean722 = true;
				}
			}
		}
		if (this.aBoolean722) {
			this.method7833();
			return;
		}
		@Pc(41) Graphics local41 = Static17.aCanvas1.getGraphics();
		if (local41 == null) {
			Static17.aCanvas1.repaint();
			return;
		}
		try {
			@Pc(50) int local50 = Static31.aClass353_3.method7688();
			@Pc(54) String local54 = Static31.aClass353_3.method7675();
			if (Static89.anImage2 == null) {
				Static89.anImage2 = Static17.aCanvas1.createImage(Static632.anInt9867, Static357.anInt5421);
			}
			@Pc(64) Graphics local64 = Static89.anImage2.getGraphics();
			local64.clearRect(0, 0, Static632.anInt9867, Static357.anInt5421);
			@Pc(75) int local75 = this.anImage8.getWidth((ImageObserver) null);
			@Pc(80) int local80 = this.anImage7.getWidth((ImageObserver) null);
			@Pc(85) int local85 = this.anImage5.getWidth((ImageObserver) null);
			@Pc(90) int local90 = this.anImage8.getHeight((ImageObserver) null);
			@Pc(95) int local95 = this.anImage7.getHeight((ImageObserver) null);
			@Pc(100) int local100 = this.anImage5.getHeight((ImageObserver) null);
			local64.drawImage(this.anImage8, this.method7837(local75) + this.anInt9170 - this.anInt9179 / 2, this.method7830(local90) - -this.anInt9181, (ImageObserver) null);
			@Pc(139) int local139 = local75 + this.anInt9170 - this.anInt9179 / 2;
			@Pc(147) int local147 = this.anInt9179 / 2 + this.anInt9170;
			for (@Pc(149) int local149 = local139; local149 <= local147; local149 += local85) {
				local64.drawImage(this.anImage5, this.method7837(local75) + this.anInt9170 + local149, this.method7830(local100) - -this.anInt9181, (ImageObserver) null);
			}
			local64.drawImage(this.anImage7, this.method7837(local80) + this.anInt9170 + this.anInt9179 / 2, this.method7830(local95) - -this.anInt9181, (ImageObserver) null);
			@Pc(214) int local214 = this.anImage11.getWidth((ImageObserver) null);
			@Pc(219) int local219 = this.anImage11.getHeight((ImageObserver) null);
			@Pc(224) int local224 = this.anImage10.getWidth((ImageObserver) null);
			@Pc(229) int local229 = this.anImage10.getHeight((ImageObserver) null);
			@Pc(234) int local234 = this.anImage4.getHeight((ImageObserver) null);
			@Pc(239) int local239 = this.anImage6.getWidth((ImageObserver) null);
			@Pc(244) int local244 = this.anImage6.getHeight((ImageObserver) null);
			@Pc(249) int local249 = this.anImage4.getWidth((ImageObserver) null);
			@Pc(254) int local254 = this.anImage12.getWidth((ImageObserver) null);
			@Pc(259) int local259 = this.anImage3.getWidth((ImageObserver) null);
			@Pc(268) int local268 = this.method7837(this.anInt9185) + this.anInt9166;
			@Pc(277) int local277 = this.method7830(this.anInt9168) + this.anInt9173;
			local64.drawImage(this.anImage11, local268, (this.anInt9168 - local219) / 2 + local277, (ImageObserver) null);
			local64.drawImage(this.anImage10, this.anInt9185 + local268 - local224, (this.anInt9168 + -local229) / 2 + local277, (ImageObserver) null);
			if (this.anImage9 == null) {
				this.anImage9 = Static17.aCanvas1.createImage(this.anInt9185 - local224 - local214, this.anInt9168);
			}
			@Pc(336) Graphics local336 = this.anImage9.getGraphics();
			for (@Pc(338) int local338 = 0; local338 < this.anInt9185 - local214 - local224; local338 += local239) {
				local336.drawImage(this.anImage6, local338, 0, (ImageObserver) null);
			}
			for (@Pc(363) int local363 = 0; local363 < this.anInt9185 - local224 - local214; local363 += local249) {
				local336.drawImage(this.anImage4, local363, this.anInt9168 - local234, (ImageObserver) null);
			}
			@Pc(405) int local405 = (this.anInt9185 - local214 - local224) * local50 / 100;
			@Pc(441) int local441;
			if (local405 > 0) {
				@Pc(419) Image local419 = Static17.aCanvas1.createImage(local405, this.anInt9168 - local244 - local234);
				@Pc(423) int local423 = local419.getWidth((ImageObserver) null);
				@Pc(426) Graphics local426 = local419.getGraphics();
				@Pc(436) int local436 = this.anInt9177 * Static617.method8312() / 10 % local254;
				for (local441 = local436 - local254; local441 < local423; local441 += local254) {
					local426.drawImage(this.anImage12, local441, 0, (ImageObserver) null);
				}
				local336.drawImage(local419, 0, local244, (ImageObserver) null);
			}
			@Pc(471) int local471 = local405;
			local405 = this.anInt9185 - local405 - local214 - local224;
			if (local405 > 0) {
				@Pc(498) Image local498 = Static17.aCanvas1.createImage(local405, this.anInt9168 - local234 - local244);
				@Pc(502) int local502 = local498.getWidth((ImageObserver) null);
				@Pc(505) Graphics local505 = local498.getGraphics();
				for (local441 = 0; local441 < local502; local441 += local259) {
					local505.drawImage(this.anImage3, local441, 0, (ImageObserver) null);
				}
				local336.drawImage(local498, local471, local244, (ImageObserver) null);
			}
			local64.drawImage(this.anImage9, local268 + local214, local277, (ImageObserver) null);
			local64.setFont(this.aFont2);
			local64.setColor(this.aColor1);
			local64.drawString(local54, local268 + (this.anInt9185 - this.aFontMetrics1.stringWidth(local54)) / 2, this.anInt9183 + this.anInt9168 / 2 + local277 + 4);
			local41.drawImage(Static89.anImage2, 0, 0, (ImageObserver) null);
		} catch (@Pc(589) Exception local589) {
			this.aBoolean722 = true;
		}
	}
}
