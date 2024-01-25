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

@OriginalClass("client!sa")
public final class Class301 implements Interface12 {

	@OriginalMember(owner = "client!sa", name = "b", descriptor = "I")
	private int anInt8783;

	@OriginalMember(owner = "client!sa", name = "c", descriptor = "I")
	private int anInt8784;

	@OriginalMember(owner = "client!sa", name = "e", descriptor = "Ljava/awt/Image;")
	private Image anImage3;

	@OriginalMember(owner = "client!sa", name = "f", descriptor = "I")
	private int anInt8786;

	@OriginalMember(owner = "client!sa", name = "g", descriptor = "Ljava/awt/Image;")
	private Image anImage4;

	@OriginalMember(owner = "client!sa", name = "k", descriptor = "Ljava/awt/Color;")
	private Color aColor1;

	@OriginalMember(owner = "client!sa", name = "m", descriptor = "I")
	private int anInt8791;

	@OriginalMember(owner = "client!sa", name = "o", descriptor = "I")
	private int anInt8792;

	@OriginalMember(owner = "client!sa", name = "q", descriptor = "Ljava/awt/Image;")
	private Image anImage5;

	@OriginalMember(owner = "client!sa", name = "r", descriptor = "Ljava/awt/Image;")
	private Image anImage6;

	@OriginalMember(owner = "client!sa", name = "s", descriptor = "I")
	private int anInt8794;

	@OriginalMember(owner = "client!sa", name = "u", descriptor = "Ljava/awt/Image;")
	private Image anImage7;

	@OriginalMember(owner = "client!sa", name = "v", descriptor = "Ljava/awt/Image;")
	private Image anImage8;

	@OriginalMember(owner = "client!sa", name = "w", descriptor = "Ljava/awt/Image;")
	private Image anImage9;

	@OriginalMember(owner = "client!sa", name = "x", descriptor = "Z")
	private boolean aBoolean701;

	@OriginalMember(owner = "client!sa", name = "A", descriptor = "Ljava/awt/Font;")
	private Font aFont2;

	@OriginalMember(owner = "client!sa", name = "B", descriptor = "I")
	private int anInt8798;

	@OriginalMember(owner = "client!sa", name = "C", descriptor = "I")
	private int anInt8799;

	@OriginalMember(owner = "client!sa", name = "D", descriptor = "Ljava/awt/Image;")
	private Image anImage10;

	@OriginalMember(owner = "client!sa", name = "E", descriptor = "Ljava/awt/Image;")
	private Image anImage11;

	@OriginalMember(owner = "client!sa", name = "F", descriptor = "Ljava/awt/Image;")
	private Image anImage12;

	@OriginalMember(owner = "client!sa", name = "G", descriptor = "I")
	private int anInt8800;

	@OriginalMember(owner = "client!sa", name = "N", descriptor = "Z")
	private boolean aBoolean702;

	@OriginalMember(owner = "client!sa", name = "O", descriptor = "Z")
	private boolean aBoolean703;

	@OriginalMember(owner = "client!sa", name = "R", descriptor = "Ljava/awt/FontMetrics;")
	private FontMetrics aFontMetrics1;

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/Object;Ljava/lang/Class;)I")
	private int method7301(@OriginalArg(0) String arg0, @OriginalArg(2) Object arg1, @OriginalArg(3) Class arg2) throws IllegalAccessException, NoSuchFieldException {
		@Pc(7) Field local7 = arg2.getDeclaredField(arg0);
		return local7.getInt(arg1);
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(IJ)Z")
	@Override
	public boolean method7300(@OriginalArg(1) long arg0) {
		return true;
	}

	@OriginalMember(owner = "client!sa", name = "f", descriptor = "(I)V")
	private void method7303() {
		Static499.method7241(Static272.aClass61_1.method2357(), Static85.aColorArray1[Static87.anInt2632], Static523.aColorArray3[Static87.anInt2632], Static157.aColorArray2[Static87.anInt2632], Static272.aClass61_1.method2360());
	}

	@OriginalMember(owner = "client!sa", name = "h", descriptor = "(I)V")
	private void method7305() throws IllegalAccessException, NoSuchFieldException {
		@Pc(6) Class local6 = Static635.anApplet2.getClass();
		this.anImage11 = (Image) this.method7310(local6, "bar");
		this.anImage3 = (Image) this.method7310(local6, "background");
		this.anImage8 = (Image) this.method7310(local6, "left");
		this.anImage10 = (Image) this.method7310(local6, "right");
		this.anImage4 = (Image) this.method7310(local6, "top");
		this.anImage12 = (Image) this.method7310(local6, "bottom");
		this.anImage7 = (Image) this.method7310(local6, "bodyLeft");
		this.anImage5 = (Image) this.method7310(local6, "bodyRight");
		this.anImage6 = (Image) this.method7310(local6, "bodyFill");
		this.aFont2 = (Font) this.method7310(local6, "bf");
		this.aFontMetrics1 = (FontMetrics) this.method7310(local6, "bfm");
		this.aColor1 = (Color) this.method7310(local6, "colourtext");
		@Pc(112) Object local112 = this.method7310(local6, "lb");
		@Pc(115) Class local115 = local112.getClass();
		this.aBoolean702 = this.method7308(local115, "xMiddle", local112);
		this.aBoolean701 = this.method7308(local115, "yMiddle", local112);
		this.anInt8799 = this.method7301("xOffset", local112, local115);
		this.anInt8792 = this.method7301("yOffset", local112, local115);
		this.anInt8784 = this.method7301("width", local112, local115);
		this.anInt8786 = this.method7301("height", local112, local115);
		this.anInt8783 = this.method7301("boxXOffset", local112, local115);
		this.anInt8800 = this.method7301("boxYOffset", local112, local115);
		this.anInt8794 = this.method7301("boxWidth", local112, local115);
		this.anInt8798 = this.method7301("textYOffset", local112, local115);
		this.anInt8791 = this.method7301("offsetPerTenCycles", local112, local115);
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(II)I")
	private int method7306(@OriginalArg(0) int arg0) {
		return this.aBoolean701 ? (Static277.anInt5899 - arg0) / 2 : 0;
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(I)V")
	@Override
	public void method7296() {
		Static457.method6894();
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(Ljava/lang/Class;BLjava/lang/String;Ljava/lang/Object;)Z")
	private boolean method7308(@OriginalArg(0) Class arg0, @OriginalArg(2) String arg1, @OriginalArg(3) Object arg2) throws IllegalAccessException, NoSuchFieldException {
		@Pc(15) Field local15 = arg0.getDeclaredField(arg1);
		return local15.getBoolean(arg2);
	}

	@OriginalMember(owner = "client!sa", name = "d", descriptor = "(I)V")
	@Override
	public void method7299() {
	}

	@OriginalMember(owner = "client!sa", name = "c", descriptor = "(I)I")
	@Override
	public int method7298() {
		return 100;
	}

	@OriginalMember(owner = "client!sa", name = "b", descriptor = "(I)I")
	@Override
	public int method7297() {
		return 0;
	}

	@OriginalMember(owner = "client!sa", name = "b", descriptor = "(II)I")
	private int method7309(@OriginalArg(0) int arg0) {
		return this.aBoolean702 ? (Static294.anInt6026 - arg0) / 2 : 0;
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(Ljava/lang/Class;Ljava/lang/String;B)Ljava/lang/Object;")
	private Object method7310(@OriginalArg(0) Class arg0, @OriginalArg(1) String arg1) throws IllegalAccessException, NoSuchFieldException {
		@Pc(15) Field local15 = arg0.getDeclaredField(arg1);
		@Pc(19) Object local19 = local15.get(Static635.anApplet2);
		local15.set(Static635.anApplet2, (Object) null);
		return local19;
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(IZ)V")
	@Override
	public void method7295(@OriginalArg(1) boolean arg0) {
		if (!this.aBoolean703) {
			if (Static635.anApplet2 == null) {
				this.aBoolean703 = true;
			} else if (this.aFont2 == null) {
				try {
					this.method7305();
				} catch (@Pc(16) Exception local16) {
					this.aBoolean703 = true;
				}
			}
		}
		if (this.aBoolean703) {
			this.method7303();
			return;
		}
		@Pc(45) Graphics local45 = Static428.aCanvas12.getGraphics();
		if (local45 == null) {
			Static428.aCanvas12.repaint();
			return;
		}
		try {
			@Pc(51) int local51 = Static272.aClass61_1.method2357();
			@Pc(55) String local55 = Static272.aClass61_1.method2360();
			if (Static7.anImage1 == null) {
				Static7.anImage1 = Static428.aCanvas12.createImage(Static294.anInt6026, Static277.anInt5899);
			}
			@Pc(65) Graphics local65 = Static7.anImage1.getGraphics();
			local65.clearRect(0, 0, Static294.anInt6026, Static277.anInt5899);
			@Pc(76) int local76 = this.anImage7.getWidth((ImageObserver) null);
			@Pc(81) int local81 = this.anImage5.getWidth((ImageObserver) null);
			@Pc(86) int local86 = this.anImage6.getWidth((ImageObserver) null);
			@Pc(91) int local91 = this.anImage7.getHeight((ImageObserver) null);
			@Pc(96) int local96 = this.anImage5.getHeight((ImageObserver) null);
			@Pc(101) int local101 = this.anImage6.getHeight((ImageObserver) null);
			local65.drawImage(this.anImage7, this.method7309(local76) + this.anInt8783 - this.anInt8794 / 2, this.method7306(local91) + this.anInt8800, (ImageObserver) null);
			@Pc(139) int local139 = local76 + this.anInt8783 - this.anInt8794 / 2;
			@Pc(147) int local147 = this.anInt8783 + this.anInt8794 / 2;
			for (@Pc(149) int local149 = local139; local149 <= local147; local149 += local86) {
				local65.drawImage(this.anImage6, this.method7309(local76) + this.anInt8783 + local149, this.method7306(local101) + this.anInt8800, (ImageObserver) null);
			}
			local65.drawImage(this.anImage5, this.method7309(local81) + this.anInt8783 + this.anInt8794 / 2, this.method7306(local96) + this.anInt8800, (ImageObserver) null);
			@Pc(217) int local217 = this.anImage8.getWidth((ImageObserver) null);
			@Pc(222) int local222 = this.anImage8.getHeight((ImageObserver) null);
			@Pc(227) int local227 = this.anImage10.getWidth((ImageObserver) null);
			@Pc(232) int local232 = this.anImage10.getHeight((ImageObserver) null);
			@Pc(237) int local237 = this.anImage12.getHeight((ImageObserver) null);
			@Pc(242) int local242 = this.anImage4.getWidth((ImageObserver) null);
			@Pc(247) int local247 = this.anImage4.getHeight((ImageObserver) null);
			@Pc(252) int local252 = this.anImage12.getWidth((ImageObserver) null);
			@Pc(257) int local257 = this.anImage11.getWidth((ImageObserver) null);
			@Pc(262) int local262 = this.anImage3.getWidth((ImageObserver) null);
			@Pc(273) int local273 = this.method7309(this.anInt8784) + this.anInt8799;
			@Pc(282) int local282 = this.method7306(this.anInt8786) + this.anInt8792;
			local65.drawImage(this.anImage8, local273, local282 + (this.anInt8786 - local222) / 2, (ImageObserver) null);
			local65.drawImage(this.anImage10, local273 + this.anInt8784 - local227, (-local232 + this.anInt8786) / 2 + local282, (ImageObserver) null);
			if (this.anImage9 == null) {
				this.anImage9 = Static428.aCanvas12.createImage(this.anInt8784 - local227 - local217, this.anInt8786);
			}
			@Pc(340) Graphics local340 = this.anImage9.getGraphics();
			for (@Pc(342) int local342 = 0; local342 < this.anInt8784 - local227 - local217; local342 += local242) {
				local340.drawImage(this.anImage4, local342, 0, (ImageObserver) null);
			}
			for (@Pc(368) int local368 = 0; local368 < this.anInt8784 - local227 - local217; local368 += local252) {
				local340.drawImage(this.anImage12, local368, this.anInt8786 - local237, (ImageObserver) null);
			}
			@Pc(413) int local413 = local51 * (this.anInt8784 - local227 - local217) / 100;
			@Pc(449) int local449;
			if (local413 > 0) {
				@Pc(427) Image local427 = Static428.aCanvas12.createImage(local413, this.anInt8786 - local237 - local247);
				@Pc(431) int local431 = local427.getWidth((ImageObserver) null);
				@Pc(434) Graphics local434 = local427.getGraphics();
				@Pc(444) int local444 = this.anInt8791 * Static506.method7278() / 10 % local257;
				for (local449 = local444 - local257; local449 < local431; local449 += local257) {
					local434.drawImage(this.anImage11, local449, 0, (ImageObserver) null);
				}
				local340.drawImage(local427, 0, local247, (ImageObserver) null);
			}
			@Pc(479) int local479 = local413;
			local413 = this.anInt8784 - local413 - local227 - local217;
			if (local413 > 0) {
				@Pc(507) Image local507 = Static428.aCanvas12.createImage(local413, this.anInt8786 - local237 - local247);
				@Pc(511) int local511 = local507.getWidth((ImageObserver) null);
				@Pc(514) Graphics local514 = local507.getGraphics();
				for (local449 = 0; local449 < local511; local449 += local262) {
					local514.drawImage(this.anImage3, local449, 0, (ImageObserver) null);
				}
				local340.drawImage(local507, local479, local247, (ImageObserver) null);
			}
			local65.drawImage(this.anImage9, local217 + local273, local282, (ImageObserver) null);
			local65.setFont(this.aFont2);
			local65.setColor(this.aColor1);
			local65.drawString(local55, (this.anInt8784 - this.aFontMetrics1.stringWidth(local55)) / 2 + local273, this.anInt8798 + local282 + this.anInt8786 / 2 - -4);
			local45.drawImage(Static7.anImage1, 0, 0, (ImageObserver) null);
		} catch (@Pc(592) Exception local592) {
			this.aBoolean703 = true;
		}
	}
}
