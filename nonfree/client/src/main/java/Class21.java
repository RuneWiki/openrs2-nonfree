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

@OriginalClass("client!as")
public final class Class21 implements Interface22 {

	@OriginalMember(owner = "client!as", name = "a", descriptor = "Ljava/awt/Image;")
	private Image anImage1;

	@OriginalMember(owner = "client!as", name = "b", descriptor = "I")
	private int anInt686;

	@OriginalMember(owner = "client!as", name = "c", descriptor = "I")
	private int anInt687;

	@OriginalMember(owner = "client!as", name = "d", descriptor = "I")
	private int anInt688;

	@OriginalMember(owner = "client!as", name = "g", descriptor = "Ljava/awt/Image;")
	private Image anImage2;

	@OriginalMember(owner = "client!as", name = "h", descriptor = "I")
	private int anInt691;

	@OriginalMember(owner = "client!as", name = "i", descriptor = "Ljava/awt/Image;")
	private Image anImage3;

	@OriginalMember(owner = "client!as", name = "k", descriptor = "Ljava/awt/Image;")
	private Image anImage4;

	@OriginalMember(owner = "client!as", name = "l", descriptor = "I")
	private int anInt693;

	@OriginalMember(owner = "client!as", name = "n", descriptor = "I")
	private int anInt695;

	@OriginalMember(owner = "client!as", name = "o", descriptor = "Ljava/awt/Image;")
	private Image anImage5;

	@OriginalMember(owner = "client!as", name = "p", descriptor = "Ljava/awt/Color;")
	private Color aColor1;

	@OriginalMember(owner = "client!as", name = "t", descriptor = "Z")
	private boolean aBoolean44;

	@OriginalMember(owner = "client!as", name = "u", descriptor = "I")
	private int anInt699;

	@OriginalMember(owner = "client!as", name = "v", descriptor = "Ljava/awt/Image;")
	private Image anImage6;

	@OriginalMember(owner = "client!as", name = "x", descriptor = "I")
	private int anInt701;

	@OriginalMember(owner = "client!as", name = "y", descriptor = "Ljava/awt/Image;")
	private Image anImage7;

	@OriginalMember(owner = "client!as", name = "z", descriptor = "I")
	private int anInt702;

	@OriginalMember(owner = "client!as", name = "B", descriptor = "Ljava/awt/Font;")
	private Font aFont1;

	@OriginalMember(owner = "client!as", name = "C", descriptor = "Ljava/awt/FontMetrics;")
	private FontMetrics aFontMetrics1;

	@OriginalMember(owner = "client!as", name = "D", descriptor = "Ljava/awt/Image;")
	private Image anImage8;

	@OriginalMember(owner = "client!as", name = "E", descriptor = "Z")
	private boolean aBoolean45;

	@OriginalMember(owner = "client!as", name = "I", descriptor = "Z")
	private boolean aBoolean46;

	@OriginalMember(owner = "client!as", name = "N", descriptor = "Ljava/awt/Image;")
	private Image anImage9;

	@OriginalMember(owner = "client!as", name = "O", descriptor = "Ljava/awt/Image;")
	private Image anImage10;

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(IB)I")
	private int method615(@OriginalArg(0) int arg0) {
		return this.aBoolean46 ? (Static443.anInt7718 - arg0) / 2 : 0;
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(IZ)V")
	@Override
	public void method1805(@OriginalArg(1) boolean arg0) {
		if (!this.aBoolean44) {
			if (Static412.anApplet1 == null) {
				this.aBoolean44 = true;
			} else if (this.aFont1 == null) {
				try {
					this.method623();
				} catch (@Pc(29) Exception local29) {
					this.aBoolean44 = true;
				}
			}
		}
		if (this.aBoolean44) {
			this.method622();
			return;
		}
		@Pc(43) Graphics local43 = Static26.aCanvas3.getGraphics();
		if (local43 == null) {
			Static26.aCanvas3.repaint();
			return;
		}
		try {
			@Pc(52) int local52 = Static137.aClass260_1.method5800();
			@Pc(56) String local56 = Static137.aClass260_1.method5789();
			if (Static197.anImage11 == null) {
				Static197.anImage11 = Static26.aCanvas3.createImage(Static443.anInt7718, Static300.anInt5516);
			}
			@Pc(66) Graphics local66 = Static197.anImage11.getGraphics();
			@Pc(71) int local71 = this.anImage2.getWidth(null);
			@Pc(76) int local76 = this.anImage8.getWidth(null);
			@Pc(81) int local81 = this.anImage4.getWidth(null);
			@Pc(86) int local86 = this.anImage2.getHeight(null);
			@Pc(91) int local91 = this.anImage8.getHeight(null);
			@Pc(96) int local96 = this.anImage4.getHeight(null);
			local66.drawImage(this.anImage2, this.method615(local71) + this.anInt691 - this.anInt687 / 2, this.method616(local86) - -this.anInt693, null);
			@Pc(135) int local135 = local71 + this.anInt691 - this.anInt687 / 2;
			@Pc(147) int local147 = this.anInt691 + this.anInt687 / 2 - local76;
			for (@Pc(149) int local149 = local135; local149 <= local147; local149 += local81) {
				local66.drawImage(this.anImage4, this.method615(local71) + this.anInt691 + local149, this.method616(local96) + this.anInt693, null);
			}
			local66.drawImage(this.anImage8, this.method615(local76) + this.anInt691 + this.anInt687 / 2, this.method616(local91) - -this.anInt693, null);
			@Pc(214) int local214 = this.anImage10.getWidth(null);
			@Pc(219) int local219 = this.anImage10.getHeight(null);
			@Pc(224) int local224 = this.anImage6.getWidth(null);
			@Pc(229) int local229 = this.anImage6.getHeight(null);
			@Pc(234) int local234 = this.anImage3.getHeight(null);
			@Pc(239) int local239 = this.anImage7.getWidth(null);
			@Pc(244) int local244 = this.anImage7.getHeight(null);
			@Pc(249) int local249 = this.anImage3.getWidth(null);
			@Pc(254) int local254 = this.anImage5.getWidth(null);
			@Pc(259) int local259 = this.anImage9.getWidth(null);
			@Pc(268) int local268 = this.method615(this.anInt695) + this.anInt686;
			@Pc(278) int local278 = this.method616(this.anInt701) + this.anInt688;
			local66.drawImage(this.anImage10, local268, local278 + (this.anInt701 - local219) / 2, null);
			local66.drawImage(this.anImage6, this.anInt695 + local268 - local224, local278 - -((-local229 + this.anInt701) / 2), null);
			if (this.anImage1 == null) {
				this.anImage1 = Static26.aCanvas3.createImage(this.anInt695 - local224 - local214, this.anInt701);
			}
			@Pc(335) Graphics local335 = this.anImage1.getGraphics();
			for (@Pc(337) int local337 = 0; local337 < this.anInt695 - local224 - local214; local337 += local239) {
				local335.drawImage(this.anImage7, local337, 0, null);
			}
			for (@Pc(366) int local366 = 0; local366 < this.anInt695 - local224 - local214; local366 += local249) {
				local335.drawImage(this.anImage3, local366, this.anInt701 - local234, null);
			}
			@Pc(410) int local410 = local52 * (this.anInt695 - local224 - local214) / 100;
			@Pc(448) int local448;
			if (local410 > 0) {
				@Pc(427) Image local427 = Static26.aCanvas3.createImage(local410, this.anInt701 - local234 - local244);
				@Pc(431) int local431 = local427.getWidth(null);
				@Pc(434) Graphics local434 = local427.getGraphics();
				@Pc(444) int local444 = this.anInt699 * Static550.method7487() / 10 % local254;
				for (local448 = local444 - local254; local448 < local431; local448 += local254) {
					local434.drawImage(this.anImage5, local448, 0, null);
				}
				local335.drawImage(local427, 0, local244, null);
			}
			@Pc(474) int local474 = local410;
			local410 = this.anInt695 - local224 - local214 - local410;
			if (local410 > 0) {
				@Pc(498) Image local498 = Static26.aCanvas3.createImage(local410, this.anInt701 - local234 - local244);
				@Pc(502) int local502 = local498.getWidth(null);
				@Pc(505) Graphics local505 = local498.getGraphics();
				for (local448 = 0; local448 < local502; local448 += local259) {
					local505.drawImage(this.anImage9, local448, 0, null);
				}
				local335.drawImage(local498, local474, local244, null);
			}
			local66.drawImage(this.anImage1, local268 + local214, local278, null);
			local66.setFont(this.aFont1);
			local66.setColor(this.aColor1);
			local66.drawString(local56, local268 + (this.anInt695 - this.aFontMetrics1.stringWidth(local56)) / 2, this.anInt702 + 4 + this.anInt701 / 2 + local278);
			local43.drawImage(Static197.anImage11, 0, 0, null);
		} catch (@Pc(589) Exception local589) {
			this.aBoolean44 = true;
		}
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(II)I")
	private int method616(@OriginalArg(0) int arg0) {
		return this.aBoolean45 ? (Static300.anInt5516 - arg0) / 2 : 0;
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(I)V")
	@Override
	public void method1804() {
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/Class;Ljava/lang/Object;)Z")
	private boolean method619(@OriginalArg(0) String arg0, @OriginalArg(2) Class arg1, @OriginalArg(3) Object arg2) throws IllegalAccessException, NoSuchFieldException {
		@Pc(14) Field local14 = arg1.getDeclaredField(arg0);
		return local14.getBoolean(arg2);
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(BLjava/lang/String;Ljava/lang/Object;Ljava/lang/Class;)I")
	private int method620(@OriginalArg(1) String arg0, @OriginalArg(2) Object arg1, @OriginalArg(3) Class arg2) throws IllegalAccessException, NoSuchFieldException {
		@Pc(13) Field local13 = arg2.getDeclaredField(arg0);
		return local13.getInt(arg1);
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(JI)Z")
	@Override
	public boolean method1803(@OriginalArg(0) long arg0) {
		return true;
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(Z)V")
	@Override
	public void method1806() {
		Static45.method1032();
	}

	@OriginalMember(owner = "client!as", name = "b", descriptor = "(I)I")
	@Override
	public int method1807() {
		return 0;
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(Ljava/lang/Class;BLjava/lang/String;)Ljava/lang/Object;")
	private Object method621(@OriginalArg(0) Class arg0, @OriginalArg(2) String arg1) throws IllegalAccessException, NoSuchFieldException {
		@Pc(7) Field local7 = arg0.getDeclaredField(arg1);
		@Pc(11) Object local11 = local7.get(Static412.anApplet1);
		local7.set(Static412.anApplet1, null);
		return local11;
	}

	@OriginalMember(owner = "client!as", name = "c", descriptor = "(I)I")
	@Override
	public int method1808() {
		return 100;
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(B)V")
	private void method622() {
		Static29.method754(Static141.aColorArray2[Static490.anInt8273], Static83.aColorArray1[Static490.anInt8273], Static510.aColorArray5[Static490.anInt8273], Static137.aClass260_1.method5800(), Static137.aClass260_1.method5789());
	}

	@OriginalMember(owner = "client!as", name = "c", descriptor = "(Z)V")
	private void method623() throws IllegalAccessException, NoSuchFieldException {
		@Pc(6) Class local6 = Static412.anApplet1.getClass();
		this.anImage5 = (Image) this.method621(local6, "bar");
		this.anImage9 = (Image) this.method621(local6, "background");
		this.anImage10 = (Image) this.method621(local6, "left");
		this.anImage6 = (Image) this.method621(local6, "right");
		this.anImage7 = (Image) this.method621(local6, "top");
		this.anImage3 = (Image) this.method621(local6, "bottom");
		this.anImage2 = (Image) this.method621(local6, "bodyLeft");
		this.anImage8 = (Image) this.method621(local6, "bodyRight");
		this.anImage4 = (Image) this.method621(local6, "bodyFill");
		this.aFont1 = (Font) this.method621(local6, "bf");
		this.aFontMetrics1 = (FontMetrics) this.method621(local6, "bfm");
		this.aColor1 = (Color) this.method621(local6, "colourtext");
		@Pc(108) Object local108 = this.method621(local6, "lb");
		@Pc(111) Class local111 = local108.getClass();
		this.aBoolean46 = this.method619("xMiddle", local111, local108);
		this.aBoolean45 = this.method619("yMiddle", local111, local108);
		this.anInt686 = this.method620("xOffset", local108, local111);
		this.anInt688 = this.method620("yOffset", local108, local111);
		this.anInt695 = this.method620("width", local108, local111);
		this.anInt701 = this.method620("height", local108, local111);
		this.anInt691 = this.method620("boxXOffset", local108, local111);
		this.anInt693 = this.method620("boxYOffset", local108, local111);
		this.anInt687 = this.method620("boxWidth", local108, local111);
		this.anInt702 = this.method620("textYOffset", local108, local111);
		this.anInt699 = this.method620("offsetPerTenCycles", local108, local111);
	}
}
