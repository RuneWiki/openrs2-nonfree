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

@OriginalClass("client!kca")
public final class Class184 implements Interface10 {

	@OriginalMember(owner = "client!kca", name = "a", descriptor = "Ljava/awt/Image;")
	private Image anImage2;

	@OriginalMember(owner = "client!kca", name = "b", descriptor = "I")
	private int anInt4658;

	@OriginalMember(owner = "client!kca", name = "c", descriptor = "Ljava/awt/Image;")
	private Image anImage3;

	@OriginalMember(owner = "client!kca", name = "d", descriptor = "Ljava/awt/Image;")
	private Image anImage4;

	@OriginalMember(owner = "client!kca", name = "e", descriptor = "Ljava/awt/Image;")
	private Image anImage5;

	@OriginalMember(owner = "client!kca", name = "f", descriptor = "I")
	private int anInt4659;

	@OriginalMember(owner = "client!kca", name = "g", descriptor = "I")
	private int anInt4660;

	@OriginalMember(owner = "client!kca", name = "h", descriptor = "Ljava/awt/Font;")
	private Font aFont2;

	@OriginalMember(owner = "client!kca", name = "i", descriptor = "Ljava/awt/Image;")
	private Image anImage6;

	@OriginalMember(owner = "client!kca", name = "j", descriptor = "Ljava/awt/Color;")
	private Color aColor1;

	@OriginalMember(owner = "client!kca", name = "l", descriptor = "Ljava/awt/Image;")
	private Image anImage7;

	@OriginalMember(owner = "client!kca", name = "m", descriptor = "I")
	private int anInt4662;

	@OriginalMember(owner = "client!kca", name = "n", descriptor = "Ljava/awt/Image;")
	private Image anImage8;

	@OriginalMember(owner = "client!kca", name = "p", descriptor = "I")
	private int anInt4664;

	@OriginalMember(owner = "client!kca", name = "t", descriptor = "Ljava/awt/FontMetrics;")
	private FontMetrics aFontMetrics1;

	@OriginalMember(owner = "client!kca", name = "v", descriptor = "I")
	private int anInt4669;

	@OriginalMember(owner = "client!kca", name = "w", descriptor = "Ljava/awt/Image;")
	private Image anImage9;

	@OriginalMember(owner = "client!kca", name = "x", descriptor = "Ljava/awt/Image;")
	private Image anImage10;

	@OriginalMember(owner = "client!kca", name = "y", descriptor = "Ljava/awt/Image;")
	private Image anImage11;

	@OriginalMember(owner = "client!kca", name = "z", descriptor = "I")
	private int anInt4670;

	@OriginalMember(owner = "client!kca", name = "C", descriptor = "Z")
	private boolean aBoolean352;

	@OriginalMember(owner = "client!kca", name = "D", descriptor = "I")
	private int anInt4672;

	@OriginalMember(owner = "client!kca", name = "E", descriptor = "I")
	private int anInt4673;

	@OriginalMember(owner = "client!kca", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Object;BLjava/lang/Class;)I")
	private int method3782(@OriginalArg(0) String arg0, @OriginalArg(1) Object arg1, @OriginalArg(3) Class arg2) throws IllegalAccessException, NoSuchFieldException {
		@Pc(7) Field local7 = arg2.getDeclaredField(arg0);
		return local7.getInt(arg1);
	}

	@OriginalMember(owner = "client!kca", name = "a", descriptor = "(B)V")
	private void method3783() throws IllegalAccessException, NoSuchFieldException {
		@Pc(6) Class local6 = Static590.anApplet2.getClass();
		this.anImage6 = (Image) this.method3785(local6, "bar");
		this.anImage4 = (Image) this.method3785(local6, "background");
		this.anImage7 = (Image) this.method3785(local6, "left");
		this.anImage11 = (Image) this.method3785(local6, "right");
		this.anImage10 = (Image) this.method3785(local6, "top");
		this.anImage8 = (Image) this.method3785(local6, "bottom");
		this.anImage3 = (Image) this.method3785(local6, "bodyLeft");
		this.anImage2 = (Image) this.method3785(local6, "bodyRight");
		this.anImage5 = (Image) this.method3785(local6, "bodyFill");
		this.aFont2 = (Font) this.method3785(local6, "bf");
		this.aFontMetrics1 = (FontMetrics) this.method3785(local6, "bfm");
		this.aColor1 = (Color) this.method3785(local6, "colourtext");
		@Pc(112) Object local112 = this.method3785(local6, "lb");
		@Pc(115) Class local115 = local112.getClass();
		this.anInt4669 = this.method3782("xOffset", local112, local115);
		this.anInt4660 = this.method3782("yOffset", local112, local115);
		this.anInt4673 = this.method3782("width", local112, local115);
		this.anInt4662 = this.method3782("height", local112, local115);
		this.anInt4658 = this.method3782("boxXOffset", local112, local115);
		this.anInt4664 = this.method3782("boxYOffset", local112, local115);
		this.anInt4659 = this.method3782("boxWidth", local112, local115);
		this.anInt4670 = this.method3782("textYOffset", local112, local115);
		this.anInt4672 = this.method3782("offsetPerTenCycles", local112, local115);
	}

	@OriginalMember(owner = "client!kca", name = "a", descriptor = "(IJ)Z")
	@Override
	public boolean method6294(@OriginalArg(1) long arg0) {
		return true;
	}

	@OriginalMember(owner = "client!kca", name = "a", descriptor = "(Ljava/lang/Class;BLjava/lang/String;)Ljava/lang/Object;")
	private Object method3785(@OriginalArg(0) Class arg0, @OriginalArg(2) String arg1) throws IllegalAccessException, NoSuchFieldException {
		@Pc(7) Field local7 = arg0.getDeclaredField(arg1);
		@Pc(11) Object local11 = local7.get(Static590.anApplet2);
		local7.set(Static590.anApplet2, null);
		return local11;
	}

	@OriginalMember(owner = "client!kca", name = "e", descriptor = "(I)V")
	private void method3786() {
		Static44.method702(Static549.aColorArray5[Static337.anInt8003], Static521.aClass163_1.method3471(), Static341.aColorArray2[Static337.anInt8003], Static556.aColorArray6[Static337.anInt8003], Static521.aClass163_1.method3470());
	}

	@OriginalMember(owner = "client!kca", name = "a", descriptor = "(Z)I")
	@Override
	public int method6291() {
		return 0;
	}

	@OriginalMember(owner = "client!kca", name = "a", descriptor = "(I)I")
	@Override
	public int method6289() {
		return 100;
	}

	@OriginalMember(owner = "client!kca", name = "b", descriptor = "(I)V")
	@Override
	public void method6290() {
	}

	@OriginalMember(owner = "client!kca", name = "c", descriptor = "(I)V")
	@Override
	public void method6293() {
		Static135.method2065();
	}

	@OriginalMember(owner = "client!kca", name = "a", descriptor = "(ZB)V")
	@Override
	public void method6292(@OriginalArg(0) boolean arg0) {
		if (!this.aBoolean352) {
			if (Static590.anApplet2 == null) {
				this.aBoolean352 = true;
			} else if (this.aFont2 == null) {
				try {
					this.method3783();
				} catch (@Pc(14) Exception local14) {
					this.aBoolean352 = true;
				}
			}
		}
		if (this.aBoolean352) {
			this.method3786();
			return;
		}
		@Pc(43) Graphics local43 = Static499.aCanvas9.getGraphics();
		if (local43 == null) {
			Static499.aCanvas9.repaint();
			return;
		}
		try {
			@Pc(52) int local52 = Static521.aClass163_1.method3470();
			@Pc(56) String local56 = Static521.aClass163_1.method3471();
			if (Static383.anImage12 == null) {
				Static383.anImage12 = Static499.aCanvas9.createImage(Static130.anInt2566, Static499.anInt4149);
			}
			@Pc(66) Graphics local66 = Static383.anImage12.getGraphics();
			@Pc(71) int local71 = this.anImage3.getWidth(null);
			@Pc(76) int local76 = this.anImage2.getWidth(null);
			@Pc(81) int local81 = this.anImage5.getWidth(null);
			@Pc(86) int local86 = this.anImage3.getHeight(null);
			@Pc(91) int local91 = this.anImage2.getHeight(null);
			@Pc(96) int local96 = this.anImage5.getHeight(null);
			local66.drawImage(this.anImage3, this.anInt4658 + (Static130.anInt2566 - local71) / 2 - this.anInt4659 / 2, (-local86 + Static499.anInt4149) / 2 - -this.anInt4664, null);
			@Pc(138) int local138 = local71 + this.anInt4658 - this.anInt4659 / 2;
			@Pc(149) int local149 = this.anInt4658 + this.anInt4659 / 2 - local76;
			for (@Pc(151) int local151 = local138; local151 <= local149; local151 += local81) {
				local66.drawImage(this.anImage5, local151 + (Static130.anInt2566 - local71) / 2 + this.anInt4658, (Static499.anInt4149 + -local96) / 2 + this.anInt4664, null);
			}
			local66.drawImage(this.anImage2, (Static130.anInt2566 - local76) / 2 + this.anInt4658 + this.anInt4659 / 2, this.anInt4664 + (-local91 + Static499.anInt4149) / 2, null);
			@Pc(220) int local220 = this.anImage7.getWidth(null);
			@Pc(225) int local225 = this.anImage7.getHeight(null);
			@Pc(230) int local230 = this.anImage11.getWidth(null);
			@Pc(235) int local235 = this.anImage11.getHeight(null);
			@Pc(240) int local240 = this.anImage8.getHeight(null);
			@Pc(245) int local245 = this.anImage10.getWidth(null);
			@Pc(250) int local250 = this.anImage10.getHeight(null);
			@Pc(255) int local255 = this.anImage8.getWidth(null);
			@Pc(260) int local260 = this.anImage6.getWidth(null);
			@Pc(265) int local265 = this.anImage4.getWidth(null);
			@Pc(275) int local275 = (Static130.anInt2566 - this.anInt4673) / 2 + this.anInt4669;
			@Pc(286) int local286 = (Static499.anInt4149 - this.anInt4662) / 2 + this.anInt4660;
			local66.drawImage(this.anImage7, local275, (this.anInt4662 - local225) / 2 + local286, null);
			local66.drawImage(this.anImage11, local275 + this.anInt4673 - local230, local286 + (this.anInt4662 + -local235) / 2, null);
			if (this.anImage9 == null) {
				this.anImage9 = Static499.aCanvas9.createImage(this.anInt4673 - local230 - local220, this.anInt4662);
			}
			@Pc(344) Graphics local344 = this.anImage9.getGraphics();
			for (@Pc(346) int local346 = 0; local346 < this.anInt4673 - local230 - local220; local346 += local245) {
				local344.drawImage(this.anImage10, local346, 0, null);
			}
			for (@Pc(375) int local375 = 0; local375 < this.anInt4673 - local220 - local230; local375 += local255) {
				local344.drawImage(this.anImage8, local375, this.anInt4662 - local240, null);
			}
			@Pc(413) int local413 = (this.anInt4673 - local220 - local230) * local52 / 100;
			@Pc(451) int local451;
			if (local413 > 0) {
				@Pc(430) Image local430 = Static499.aCanvas9.createImage(local413, this.anInt4662 - local240 - local250);
				@Pc(434) int local434 = local430.getWidth(null);
				@Pc(437) Graphics local437 = local430.getGraphics();
				@Pc(447) int local447 = this.anInt4672 * Static490.method6641() / 10 % local260;
				for (local451 = local447 - local260; local451 < local434; local451 += local260) {
					local437.drawImage(this.anImage6, local451, 0, null);
				}
				local344.drawImage(local430, 0, local250, null);
			}
			@Pc(481) int local481 = local413;
			local413 = this.anInt4673 - local230 - local220 - local413;
			if (local413 > 0) {
				@Pc(509) Image local509 = Static499.aCanvas9.createImage(local413, this.anInt4662 - local250 - local240);
				@Pc(513) int local513 = local509.getWidth(null);
				@Pc(516) Graphics local516 = local509.getGraphics();
				for (local451 = 0; local451 < local513; local451 += local265) {
					local516.drawImage(this.anImage4, local451, 0, null);
				}
				local344.drawImage(local509, local481, local250, null);
			}
			local66.drawImage(this.anImage9, local220 + local275, local286, null);
			local66.setFont(this.aFont2);
			local66.setColor(this.aColor1);
			local66.drawString(local56, local275 + (this.anInt4673 - this.aFontMetrics1.stringWidth(local56)) / 2, this.anInt4670 + (local286 - -(this.anInt4662 / 2) - -4));
			local43.drawImage(Static383.anImage12, 0, 0, null);
		} catch (@Pc(596) Exception local596) {
			this.aBoolean352 = true;
		}
	}
}
