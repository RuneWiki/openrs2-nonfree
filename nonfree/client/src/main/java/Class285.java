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

@OriginalClass("client!rda")
public final class Class285 implements Interface6 {

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "Ljava/awt/Image;")
	private Image anImage4;

	@OriginalMember(owner = "client!rda", name = "b", descriptor = "Z")
	private boolean aBoolean568;

	@OriginalMember(owner = "client!rda", name = "c", descriptor = "I")
	private int anInt8375;

	@OriginalMember(owner = "client!rda", name = "d", descriptor = "Ljava/awt/Image;")
	private Image anImage5;

	@OriginalMember(owner = "client!rda", name = "h", descriptor = "I")
	private int anInt8379;

	@OriginalMember(owner = "client!rda", name = "i", descriptor = "I")
	private int anInt8380;

	@OriginalMember(owner = "client!rda", name = "j", descriptor = "Ljava/awt/Image;")
	private Image anImage6;

	@OriginalMember(owner = "client!rda", name = "k", descriptor = "Z")
	private boolean aBoolean569;

	@OriginalMember(owner = "client!rda", name = "l", descriptor = "Ljava/awt/FontMetrics;")
	private FontMetrics aFontMetrics1;

	@OriginalMember(owner = "client!rda", name = "n", descriptor = "Ljava/awt/Image;")
	private Image anImage7;

	@OriginalMember(owner = "client!rda", name = "o", descriptor = "I")
	private int anInt8382;

	@OriginalMember(owner = "client!rda", name = "s", descriptor = "I")
	private int anInt8386;

	@OriginalMember(owner = "client!rda", name = "B", descriptor = "I")
	private int anInt8393;

	@OriginalMember(owner = "client!rda", name = "C", descriptor = "Ljava/awt/Image;")
	private Image anImage8;

	@OriginalMember(owner = "client!rda", name = "D", descriptor = "Ljava/awt/Color;")
	private Color aColor1;

	@OriginalMember(owner = "client!rda", name = "F", descriptor = "Z")
	private boolean aBoolean570;

	@OriginalMember(owner = "client!rda", name = "G", descriptor = "Ljava/awt/Image;")
	private Image anImage9;

	@OriginalMember(owner = "client!rda", name = "H", descriptor = "I")
	private int anInt8395;

	@OriginalMember(owner = "client!rda", name = "I", descriptor = "Ljava/awt/Font;")
	private Font aFont4;

	@OriginalMember(owner = "client!rda", name = "K", descriptor = "Ljava/awt/Image;")
	private Image anImage10;

	@OriginalMember(owner = "client!rda", name = "L", descriptor = "I")
	private int anInt8397;

	@OriginalMember(owner = "client!rda", name = "M", descriptor = "Ljava/awt/Image;")
	private Image anImage11;

	@OriginalMember(owner = "client!rda", name = "N", descriptor = "Ljava/awt/Image;")
	private Image anImage12;

	@OriginalMember(owner = "client!rda", name = "O", descriptor = "I")
	private int anInt8398;

	@OriginalMember(owner = "client!rda", name = "P", descriptor = "Ljava/awt/Image;")
	private Image anImage13;

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(IJ)Z")
	@Override
	public boolean method7222(@OriginalArg(1) long arg0) {
		return true;
	}

	@OriginalMember(owner = "client!rda", name = "b", descriptor = "(I)I")
	@Override
	public int method7227() {
		return 100;
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(I)V")
	@Override
	public void method7224() {
		Static4.method7046();
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(II)I")
	private int method7228(@OriginalArg(1) int arg0) {
		return this.aBoolean569 ? (Static356.anInt6630 - arg0) / 2 : 0;
	}

	@OriginalMember(owner = "client!rda", name = "c", descriptor = "(I)V")
	private void method7229() throws IllegalAccessException, NoSuchFieldException {
		@Pc(6) Class local6 = Static42.anApplet1.getClass();
		this.anImage8 = (Image) this.method7231(local6, "bar");
		this.anImage11 = (Image) this.method7231(local6, "background");
		this.anImage9 = (Image) this.method7231(local6, "left");
		this.anImage13 = (Image) this.method7231(local6, "right");
		this.anImage7 = (Image) this.method7231(local6, "top");
		this.anImage4 = (Image) this.method7231(local6, "bottom");
		this.anImage12 = (Image) this.method7231(local6, "bodyLeft");
		this.anImage6 = (Image) this.method7231(local6, "bodyRight");
		this.anImage5 = (Image) this.method7231(local6, "bodyFill");
		this.aFont4 = (Font) this.method7231(local6, "bf");
		this.aFontMetrics1 = (FontMetrics) this.method7231(local6, "bfm");
		this.aColor1 = (Color) this.method7231(local6, "colourtext");
		@Pc(122) Object local122 = this.method7231(local6, "lb");
		@Pc(125) Class local125 = local122.getClass();
		this.aBoolean568 = this.method7234(local125, local122, "xMiddle");
		this.aBoolean569 = this.method7234(local125, local122, "yMiddle");
		this.anInt8382 = this.method7233("xOffset", local122, local125);
		this.anInt8375 = this.method7233("yOffset", local122, local125);
		this.anInt8398 = this.method7233("width", local122, local125);
		this.anInt8397 = this.method7233("height", local122, local125);
		this.anInt8395 = this.method7233("boxXOffset", local122, local125);
		this.anInt8386 = this.method7233("boxYOffset", local122, local125);
		this.anInt8393 = this.method7233("boxWidth", local122, local125);
		this.anInt8380 = this.method7233("textYOffset", local122, local125);
		this.anInt8379 = this.method7233("offsetPerTenCycles", local122, local125);
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(Z)V")
	@Override
	public void method7226() {
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(IB)I")
	private int method7230(@OriginalArg(0) int arg0) {
		return this.aBoolean568 ? (Static321.anInt6137 - arg0) / 2 : 0;
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(Ljava/lang/Class;Ljava/lang/String;I)Ljava/lang/Object;")
	private Object method7231(@OriginalArg(0) Class arg0, @OriginalArg(1) String arg1) throws IllegalAccessException, NoSuchFieldException {
		@Pc(7) Field local7 = arg0.getDeclaredField(arg1);
		@Pc(18) Object local18 = local7.get(Static42.anApplet1);
		local7.set(Static42.anApplet1, (Object) null);
		return local18;
	}

	@OriginalMember(owner = "client!rda", name = "b", descriptor = "(Z)V")
	private void method7232() {
		Static647.method9002(Static645.aClass121_1.method3456(), Static138.aColorArray1[Static406.anInt7525], Static645.aClass121_1.method3468(), Static294.aColorArray2[Static406.anInt7525], Static611.aColorArray3[Static406.anInt7525]);
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(B)I")
	@Override
	public int method7225() {
		return 0;
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(BZ)V")
	@Override
	public void method7223(@OriginalArg(1) boolean arg0) {
		if (!this.aBoolean570) {
			if (Static42.anApplet1 == null) {
				this.aBoolean570 = true;
			} else if (this.aFont4 == null) {
				try {
					this.method7229();
				} catch (@Pc(14) Exception local14) {
					this.aBoolean570 = true;
				}
			}
		}
		if (this.aBoolean570) {
			this.method7232();
			return;
		}
		@Pc(36) Graphics local36 = Static271.aCanvas6.getGraphics();
		if (local36 == null) {
			Static271.aCanvas6.repaint();
			return;
		}
		try {
			@Pc(42) int local42 = Static645.aClass121_1.method3456();
			@Pc(48) String local48 = Static645.aClass121_1.method3468();
			if (Static194.anImage1 == null) {
				Static194.anImage1 = Static271.aCanvas6.createImage(Static321.anInt6137, Static356.anInt6630);
			}
			@Pc(58) Graphics local58 = Static194.anImage1.getGraphics();
			local58.clearRect(0, 0, Static321.anInt6137, Static356.anInt6630);
			@Pc(69) int local69 = this.anImage12.getWidth((ImageObserver) null);
			@Pc(74) int local74 = this.anImage6.getWidth((ImageObserver) null);
			@Pc(79) int local79 = this.anImage5.getWidth((ImageObserver) null);
			@Pc(84) int local84 = this.anImage12.getHeight((ImageObserver) null);
			@Pc(89) int local89 = this.anImage6.getHeight((ImageObserver) null);
			@Pc(94) int local94 = this.anImage5.getHeight((ImageObserver) null);
			local58.drawImage(this.anImage12, this.method7230(local69) + this.anInt8395 - this.anInt8393 / 2, this.method7228(local84) + this.anInt8386, (ImageObserver) null);
			@Pc(131) int local131 = this.anInt8395 + local69 - this.anInt8393 / 2;
			@Pc(139) int local139 = this.anInt8393 / 2 + this.anInt8395;
			for (@Pc(141) int local141 = local131; local141 <= local139; local141 += local79) {
				local58.drawImage(this.anImage5, local141 + this.method7230(local69) + this.anInt8395, this.method7228(local94) + this.anInt8386, (ImageObserver) null);
			}
			local58.drawImage(this.anImage6, this.method7230(local74) + this.anInt8395 + this.anInt8393 / 2, this.method7228(local89) - -this.anInt8386, (ImageObserver) null);
			@Pc(205) int local205 = this.anImage9.getWidth((ImageObserver) null);
			@Pc(210) int local210 = this.anImage9.getHeight((ImageObserver) null);
			@Pc(215) int local215 = this.anImage13.getWidth((ImageObserver) null);
			@Pc(220) int local220 = this.anImage13.getHeight((ImageObserver) null);
			@Pc(225) int local225 = this.anImage4.getHeight((ImageObserver) null);
			@Pc(230) int local230 = this.anImage7.getWidth((ImageObserver) null);
			@Pc(235) int local235 = this.anImage7.getHeight((ImageObserver) null);
			@Pc(240) int local240 = this.anImage4.getWidth((ImageObserver) null);
			@Pc(245) int local245 = this.anImage8.getWidth((ImageObserver) null);
			@Pc(250) int local250 = this.anImage11.getWidth((ImageObserver) null);
			@Pc(260) int local260 = this.method7230(this.anInt8398) + this.anInt8382;
			@Pc(269) int local269 = this.method7228(this.anInt8397) + this.anInt8375;
			local58.drawImage(this.anImage9, local260, local269 + (this.anInt8397 - local210) / 2, (ImageObserver) null);
			local58.drawImage(this.anImage13, this.anInt8398 + local260 - local215, (this.anInt8397 + -local220) / 2 + local269, (ImageObserver) null);
			if (this.anImage10 == null) {
				this.anImage10 = Static271.aCanvas6.createImage(this.anInt8398 - local205 - local215, this.anInt8397);
			}
			@Pc(327) Graphics local327 = this.anImage10.getGraphics();
			for (@Pc(329) int local329 = 0; local329 < this.anInt8398 - local205 - local215; local329 += local230) {
				local327.drawImage(this.anImage7, local329, 0, (ImageObserver) null);
			}
			for (@Pc(354) int local354 = 0; local354 < this.anInt8398 - local215 - local205; local354 += local240) {
				local327.drawImage(this.anImage4, local354, this.anInt8397 - local225, (ImageObserver) null);
			}
			@Pc(398) int local398 = (this.anInt8398 - local215 - local205) * local42 / 100;
			@Pc(436) int local436;
			if (local398 > 0) {
				@Pc(415) Image local415 = Static271.aCanvas6.createImage(local398, this.anInt8397 - local225 - local235);
				@Pc(419) int local419 = local415.getWidth((ImageObserver) null);
				@Pc(422) Graphics local422 = local415.getGraphics();
				@Pc(432) int local432 = this.anInt8379 * Static56.method1020() / 10 % local245;
				for (local436 = local432 - local245; local436 < local419; local436 += local245) {
					local422.drawImage(this.anImage8, local436, 0, (ImageObserver) null);
				}
				local327.drawImage(local415, 0, local235, (ImageObserver) null);
			}
			@Pc(462) int local462 = local398;
			local398 = this.anInt8398 - local205 - local215 - local398;
			if (local398 > 0) {
				@Pc(490) Image local490 = Static271.aCanvas6.createImage(local398, this.anInt8397 - local225 - local235);
				@Pc(494) int local494 = local490.getWidth((ImageObserver) null);
				@Pc(497) Graphics local497 = local490.getGraphics();
				for (local436 = 0; local436 < local494; local436 += local250) {
					local497.drawImage(this.anImage11, local436, 0, (ImageObserver) null);
				}
				local327.drawImage(local490, local462, local235, (ImageObserver) null);
			}
			local58.drawImage(this.anImage10, local260 + local205, local269, (ImageObserver) null);
			local58.setFont(this.aFont4);
			local58.setColor(this.aColor1);
			local58.drawString(local48, local260 + (this.anInt8398 - this.aFontMetrics1.stringWidth(local48)) / 2, local269 + this.anInt8397 / 2 + 4 + this.anInt8380);
			local36.drawImage(Static194.anImage1, 0, 0, (ImageObserver) null);
		} catch (@Pc(576) Exception local576) {
			this.aBoolean570 = true;
		}
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/Object;Ljava/lang/Class;)I")
	private int method7233(@OriginalArg(1) String arg0, @OriginalArg(2) Object arg1, @OriginalArg(3) Class arg2) throws IllegalAccessException, NoSuchFieldException {
		@Pc(12) Field local12 = arg2.getDeclaredField(arg0);
		return local12.getInt(arg1);
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(Ljava/lang/Class;Ljava/lang/Object;Ljava/lang/String;I)Z")
	private boolean method7234(@OriginalArg(0) Class arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) String arg2) throws IllegalAccessException, NoSuchFieldException {
		@Pc(14) Field local14 = arg0.getDeclaredField(arg2);
		return local14.getBoolean(arg1);
	}
}
