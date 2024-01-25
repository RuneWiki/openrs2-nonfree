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

@OriginalClass("client!pi")
public final class Class272 implements Interface16 {

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "Z")
	private boolean aBoolean518;

	@OriginalMember(owner = "client!pi", name = "b", descriptor = "I")
	private int anInt7184;

	@OriginalMember(owner = "client!pi", name = "c", descriptor = "Ljava/awt/Image;")
	private Image anImage3;

	@OriginalMember(owner = "client!pi", name = "d", descriptor = "I")
	private int anInt7185;

	@OriginalMember(owner = "client!pi", name = "e", descriptor = "Ljava/awt/Image;")
	private Image anImage4;

	@OriginalMember(owner = "client!pi", name = "f", descriptor = "Ljava/awt/Image;")
	private Image anImage5;

	@OriginalMember(owner = "client!pi", name = "h", descriptor = "I")
	private int anInt7187;

	@OriginalMember(owner = "client!pi", name = "i", descriptor = "Ljava/awt/Image;")
	private Image anImage6;

	@OriginalMember(owner = "client!pi", name = "m", descriptor = "Ljava/awt/Image;")
	private Image anImage7;

	@OriginalMember(owner = "client!pi", name = "n", descriptor = "Ljava/awt/Image;")
	private Image anImage8;

	@OriginalMember(owner = "client!pi", name = "o", descriptor = "Ljava/awt/Image;")
	private Image anImage9;

	@OriginalMember(owner = "client!pi", name = "p", descriptor = "Ljava/awt/Image;")
	private Image anImage10;

	@OriginalMember(owner = "client!pi", name = "q", descriptor = "Ljava/awt/Color;")
	private Color aColor1;

	@OriginalMember(owner = "client!pi", name = "s", descriptor = "Z")
	private boolean aBoolean519;

	@OriginalMember(owner = "client!pi", name = "t", descriptor = "Ljava/awt/FontMetrics;")
	private FontMetrics aFontMetrics1;

	@OriginalMember(owner = "client!pi", name = "u", descriptor = "I")
	private int anInt7192;

	@OriginalMember(owner = "client!pi", name = "w", descriptor = "I")
	private int anInt7194;

	@OriginalMember(owner = "client!pi", name = "y", descriptor = "I")
	private int anInt7196;

	@OriginalMember(owner = "client!pi", name = "z", descriptor = "Ljava/awt/Font;")
	private Font aFont2;

	@OriginalMember(owner = "client!pi", name = "A", descriptor = "I")
	private int anInt7197;

	@OriginalMember(owner = "client!pi", name = "B", descriptor = "Ljava/awt/Image;")
	private Image anImage11;

	@OriginalMember(owner = "client!pi", name = "D", descriptor = "I")
	private int anInt7199;

	@OriginalMember(owner = "client!pi", name = "E", descriptor = "I")
	private int anInt7200;

	@OriginalMember(owner = "client!pi", name = "J", descriptor = "Ljava/awt/Image;")
	private Image anImage12;

	@OriginalMember(owner = "client!pi", name = "M", descriptor = "Z")
	private boolean aBoolean520;

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;")
	private Object method6304(@OriginalArg(1) String arg0, @OriginalArg(2) Class arg1) throws IllegalAccessException, NoSuchFieldException {
		@Pc(7) Field local7 = arg1.getDeclaredField(arg0);
		@Pc(16) Object local16 = local7.get(Static107.anApplet1);
		local7.set(Static107.anApplet1, (Object) null);
		return local16;
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(Z)V")
	private void method6305() {
		Static43.method1104(Static113.aClass23_1.method616(), Static587.aColorArray7[Static145.anInt3032], Static113.aClass23_1.method622(), Static472.aColorArray6[Static145.anInt3032], Static467.aColorArray8[Static145.anInt3032]);
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(II)I")
	private int method6306(@OriginalArg(0) int arg0) {
		return this.aBoolean519 ? (Class16_Sub1_Sub5_Sub1.lb - arg0) / 2 : 0;
	}

	@OriginalMember(owner = "client!pi", name = "d", descriptor = "(I)I")
	@Override
	public int method6302() {
		return 100;
	}

	@OriginalMember(owner = "client!pi", name = "b", descriptor = "(I)V")
	@Override
	public void method6299() {
		Static630.method8716();
	}

	@OriginalMember(owner = "client!pi", name = "e", descriptor = "(I)V")
	private void method6307() throws IllegalAccessException, NoSuchFieldException {
		@Pc(6) Class local6 = Static107.anApplet1.getClass();
		this.anImage9 = (Image) this.method6304("bar", local6);
		this.anImage11 = (Image) this.method6304("background", local6);
		this.anImage4 = (Image) this.method6304("left", local6);
		this.anImage12 = (Image) this.method6304("right", local6);
		this.anImage6 = (Image) this.method6304("top", local6);
		this.anImage7 = (Image) this.method6304("bottom", local6);
		this.anImage3 = (Image) this.method6304("bodyLeft", local6);
		this.anImage8 = (Image) this.method6304("bodyRight", local6);
		this.anImage10 = (Image) this.method6304("bodyFill", local6);
		this.aFont2 = (Font) this.method6304("bf", local6);
		this.aFontMetrics1 = (FontMetrics) this.method6304("bfm", local6);
		this.aColor1 = (Color) this.method6304("colourtext", local6);
		@Pc(114) Object local114 = this.method6304("lb", local6);
		@Pc(117) Class local117 = local114.getClass();
		this.aBoolean519 = this.method6308(local117, "xMiddle", local114);
		this.aBoolean520 = this.method6308(local117, "yMiddle", local114);
		this.anInt7194 = this.method6309(local114, local117, "xOffset");
		this.anInt7199 = this.method6309(local114, local117, "yOffset");
		this.anInt7187 = this.method6309(local114, local117, "width");
		this.anInt7184 = this.method6309(local114, local117, "height");
		this.anInt7192 = this.method6309(local114, local117, "boxXOffset");
		this.anInt7200 = this.method6309(local114, local117, "boxYOffset");
		this.anInt7196 = this.method6309(local114, local117, "boxWidth");
		this.anInt7197 = this.method6309(local114, local117, "textYOffset");
		this.anInt7185 = this.method6309(local114, local117, "offsetPerTenCycles");
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;I)Z")
	private boolean method6308(@OriginalArg(0) Class arg0, @OriginalArg(1) String arg1, @OriginalArg(2) Object arg2) throws IllegalAccessException, NoSuchFieldException {
		@Pc(15) Field local15 = arg0.getDeclaredField(arg1);
		return local15.getBoolean(arg2);
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(Ljava/lang/Object;BLjava/lang/Class;Ljava/lang/String;)I")
	private int method6309(@OriginalArg(0) Object arg0, @OriginalArg(2) Class arg1, @OriginalArg(3) String arg2) throws IllegalAccessException, NoSuchFieldException {
		@Pc(12) Field local12 = arg1.getDeclaredField(arg2);
		return local12.getInt(arg0);
	}

	@OriginalMember(owner = "client!pi", name = "c", descriptor = "(I)I")
	@Override
	public int method6300() {
		return 0;
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(I)V")
	@Override
	public void method6298() {
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(IJ)Z")
	@Override
	public boolean method6303(@OriginalArg(1) long arg0) {
		return true;
	}

	@OriginalMember(owner = "client!pi", name = "b", descriptor = "(II)I")
	private int method6310(@OriginalArg(0) int arg0) {
		return this.aBoolean520 ? (Static71.anInt1925 - arg0) / 2 : 0;
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(IZ)V")
	@Override
	public void method6301(@OriginalArg(1) boolean arg0) {
		if (!this.aBoolean518) {
			if (Static107.anApplet1 == null) {
				this.aBoolean518 = true;
			} else if (this.aFont2 == null) {
				try {
					this.method6307();
				} catch (@Pc(23) Exception local23) {
					this.aBoolean518 = true;
				}
			}
		}
		if (this.aBoolean518) {
			this.method6305();
			return;
		}
		@Pc(41) Graphics local41 = Static150.aCanvas4.getGraphics();
		if (local41 == null) {
			Static150.aCanvas4.repaint();
			return;
		}
		try {
			@Pc(50) int local50 = Static113.aClass23_1.method616();
			@Pc(54) String local54 = Static113.aClass23_1.method622();
			if (Static304.anImage2 == null) {
				Static304.anImage2 = Static150.aCanvas4.createImage(Class16_Sub1_Sub5_Sub1.lb, Static71.anInt1925);
			}
			@Pc(64) Graphics local64 = Static304.anImage2.getGraphics();
			local64.clearRect(0, 0, Class16_Sub1_Sub5_Sub1.lb, Static71.anInt1925);
			@Pc(75) int local75 = this.anImage3.getWidth((ImageObserver) null);
			@Pc(80) int local80 = this.anImage8.getWidth((ImageObserver) null);
			@Pc(85) int local85 = this.anImage10.getWidth((ImageObserver) null);
			@Pc(90) int local90 = this.anImage3.getHeight((ImageObserver) null);
			@Pc(95) int local95 = this.anImage8.getHeight((ImageObserver) null);
			@Pc(100) int local100 = this.anImage10.getHeight((ImageObserver) null);
			local64.drawImage(this.anImage3, this.method6306(local75) + this.anInt7192 - this.anInt7196 / 2, this.method6310(local90) - -this.anInt7200, (ImageObserver) null);
			@Pc(140) int local140 = this.anInt7192 + local75 - this.anInt7196 / 2;
			@Pc(148) int local148 = this.anInt7196 / 2 + this.anInt7192;
			for (@Pc(150) int local150 = local140; local150 <= local148; local150 += local85) {
				local64.drawImage(this.anImage10, local150 + this.method6306(local75) + this.anInt7192, this.method6310(local100) - -this.anInt7200, (ImageObserver) null);
			}
			local64.drawImage(this.anImage8, this.method6306(local80) + this.anInt7192 + this.anInt7196 / 2, this.method6310(local95) - -this.anInt7200, (ImageObserver) null);
			@Pc(215) int local215 = this.anImage4.getWidth((ImageObserver) null);
			@Pc(220) int local220 = this.anImage4.getHeight((ImageObserver) null);
			@Pc(225) int local225 = this.anImage12.getWidth((ImageObserver) null);
			@Pc(230) int local230 = this.anImage12.getHeight((ImageObserver) null);
			@Pc(235) int local235 = this.anImage7.getHeight((ImageObserver) null);
			@Pc(240) int local240 = this.anImage6.getWidth((ImageObserver) null);
			@Pc(245) int local245 = this.anImage6.getHeight((ImageObserver) null);
			@Pc(250) int local250 = this.anImage7.getWidth((ImageObserver) null);
			@Pc(255) int local255 = this.anImage9.getWidth((ImageObserver) null);
			@Pc(260) int local260 = this.anImage11.getWidth((ImageObserver) null);
			@Pc(269) int local269 = this.method6306(this.anInt7187) + this.anInt7194;
			@Pc(279) int local279 = this.method6310(this.anInt7184) + this.anInt7199;
			local64.drawImage(this.anImage4, local269, local279 + (this.anInt7184 - local220) / 2, (ImageObserver) null);
			local64.drawImage(this.anImage12, this.anInt7187 + local269 - local225, local279 + (-local230 + this.anInt7184) / 2, (ImageObserver) null);
			if (this.anImage5 == null) {
				this.anImage5 = Static150.aCanvas4.createImage(this.anInt7187 - local215 - local225, this.anInt7184);
			}
			@Pc(339) Graphics local339 = this.anImage5.getGraphics();
			for (@Pc(341) int local341 = 0; local341 < this.anInt7187 - local225 - local215; local341 += local240) {
				local339.drawImage(this.anImage6, local341, 0, (ImageObserver) null);
			}
			for (@Pc(371) int local371 = 0; local371 < this.anInt7187 - local225 - local215; local371 += local250) {
				local339.drawImage(this.anImage7, local371, this.anInt7184 - local235, (ImageObserver) null);
			}
			@Pc(416) int local416 = (this.anInt7187 - local225 - local215) * local50 / 100;
			@Pc(453) int local453;
			if (local416 > 0) {
				@Pc(431) Image local431 = Static150.aCanvas4.createImage(local416, this.anInt7184 - local245 - local235);
				@Pc(435) int local435 = local431.getWidth((ImageObserver) null);
				@Pc(438) Graphics local438 = local431.getGraphics();
				@Pc(448) int local448 = this.anInt7185 * Static415.method6261() / 10 % local255;
				for (local453 = local448 - local255; local453 < local435; local453 += local255) {
					local438.drawImage(this.anImage9, local453, 0, (ImageObserver) null);
				}
				local339.drawImage(local431, 0, local245, (ImageObserver) null);
			}
			@Pc(479) int local479 = local416;
			local416 = this.anInt7187 - local416 - local215 - local225;
			if (local416 > 0) {
				@Pc(507) Image local507 = Static150.aCanvas4.createImage(local416, this.anInt7184 - local235 - local245);
				@Pc(511) int local511 = local507.getWidth((ImageObserver) null);
				@Pc(514) Graphics local514 = local507.getGraphics();
				for (local453 = 0; local453 < local511; local453 += local260) {
					local514.drawImage(this.anImage11, local453, 0, (ImageObserver) null);
				}
				local339.drawImage(local507, local479, local245, (ImageObserver) null);
			}
			local64.drawImage(this.anImage5, local269 + local215, local279, (ImageObserver) null);
			local64.setFont(this.aFont2);
			local64.setColor(this.aColor1);
			local64.drawString(local54, local269 + (this.anInt7187 - this.aFontMetrics1.stringWidth(local54)) / 2, this.anInt7197 + 4 + this.anInt7184 / 2 + local279);
			local41.drawImage(Static304.anImage2, 0, 0, (ImageObserver) null);
		} catch (@Pc(594) Exception local594) {
			this.aBoolean518 = true;
		}
	}
}
