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

@OriginalClass("client!ob")
public final class Class234 implements Interface15 {

	@OriginalMember(owner = "client!ob", name = "b", descriptor = "Ljava/awt/Font;")
	private Font aFont1;

	@OriginalMember(owner = "client!ob", name = "c", descriptor = "Z")
	private boolean aBoolean466;

	@OriginalMember(owner = "client!ob", name = "d", descriptor = "Ljava/awt/Image;")
	private Image anImage3;

	@OriginalMember(owner = "client!ob", name = "f", descriptor = "I")
	private int anInt6395;

	@OriginalMember(owner = "client!ob", name = "g", descriptor = "Ljava/awt/Image;")
	private Image anImage4;

	@OriginalMember(owner = "client!ob", name = "h", descriptor = "I")
	private int anInt6396;

	@OriginalMember(owner = "client!ob", name = "i", descriptor = "Ljava/awt/Color;")
	private Color aColor1;

	@OriginalMember(owner = "client!ob", name = "k", descriptor = "I")
	private int anInt6397;

	@OriginalMember(owner = "client!ob", name = "l", descriptor = "Ljava/awt/Image;")
	private Image anImage5;

	@OriginalMember(owner = "client!ob", name = "p", descriptor = "Ljava/awt/Image;")
	private Image anImage6;

	@OriginalMember(owner = "client!ob", name = "q", descriptor = "I")
	private int anInt6400;

	@OriginalMember(owner = "client!ob", name = "s", descriptor = "I")
	private int anInt6402;

	@OriginalMember(owner = "client!ob", name = "v", descriptor = "Ljava/awt/FontMetrics;")
	private FontMetrics aFontMetrics1;

	@OriginalMember(owner = "client!ob", name = "w", descriptor = "Z")
	private boolean aBoolean467;

	@OriginalMember(owner = "client!ob", name = "x", descriptor = "Ljava/awt/Image;")
	private Image anImage7;

	@OriginalMember(owner = "client!ob", name = "z", descriptor = "I")
	private int anInt6406;

	@OriginalMember(owner = "client!ob", name = "D", descriptor = "Ljava/awt/Image;")
	private Image anImage8;

	@OriginalMember(owner = "client!ob", name = "E", descriptor = "Ljava/awt/Image;")
	private Image anImage9;

	@OriginalMember(owner = "client!ob", name = "G", descriptor = "Ljava/awt/Image;")
	private Image anImage10;

	@OriginalMember(owner = "client!ob", name = "K", descriptor = "Ljava/awt/Image;")
	private Image anImage11;

	@OriginalMember(owner = "client!ob", name = "L", descriptor = "I")
	private int anInt6411;

	@OriginalMember(owner = "client!ob", name = "N", descriptor = "I")
	private int anInt6412;

	@OriginalMember(owner = "client!ob", name = "O", descriptor = "I")
	private int anInt6413;

	@OriginalMember(owner = "client!ob", name = "Q", descriptor = "Z")
	private boolean aBoolean468;

	@OriginalMember(owner = "client!ob", name = "T", descriptor = "Ljava/awt/Image;")
	private Image anImage12;

	@OriginalMember(owner = "client!ob", name = "b", descriptor = "(B)V")
	private void method5435() {
		Static354.method5257(Static143.aClass275_1.method6095(), Static143.aClass275_1.method6094(), Static77.aColorArray1[Static546.anInt8712], Static473.aColorArray3[Static546.anInt8712], Static109.aColorArray2[Static546.anInt8712]);
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(B)I")
	@Override
	public int method7604() {
		return 0;
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(Ljava/lang/Class;Ljava/lang/String;I)Ljava/lang/Object;")
	private Object method5437(@OriginalArg(0) Class arg0, @OriginalArg(1) String arg1) throws IllegalAccessException, NoSuchFieldException {
		@Pc(13) Field local13 = arg0.getDeclaredField(arg1);
		@Pc(17) Object local17 = local13.get(Static31.anApplet1);
		local13.set(Static31.anApplet1, null);
		return local17;
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(II)I")
	private int method5438(@OriginalArg(1) int arg0) {
		return this.aBoolean466 ? (Static40.anInt758 - arg0) / 2 : 0;
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(I)V")
	@Override
	public void method7600() {
		Static135.method2645();
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(IJ)Z")
	@Override
	public boolean method7605(@OriginalArg(1) long arg0) {
		return true;
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(ZB)V")
	@Override
	public void method7602(@OriginalArg(0) boolean arg0) {
		if (!this.aBoolean467) {
			if (Static31.anApplet1 == null) {
				this.aBoolean467 = true;
			} else if (this.aFont1 == null) {
				try {
					this.method5442();
				} catch (@Pc(19) Exception local19) {
					this.aBoolean467 = true;
				}
			}
		}
		if (this.aBoolean467) {
			this.method5435();
			return;
		}
		@Pc(37) Graphics local37 = Static387.aCanvas9.getGraphics();
		if (local37 == null) {
			Static387.aCanvas9.repaint();
			return;
		}
		try {
			@Pc(43) int local43 = Static143.aClass275_1.method6094();
			@Pc(47) String local47 = Static143.aClass275_1.method6095();
			if (Static50.anImage1 == null) {
				Static50.anImage1 = Static387.aCanvas9.createImage(Static40.anInt758, Static308.anInt5171);
			}
			@Pc(57) Graphics local57 = Static50.anImage1.getGraphics();
			@Pc(62) int local62 = this.anImage10.getWidth(null);
			@Pc(67) int local67 = this.anImage4.getWidth(null);
			@Pc(72) int local72 = this.anImage9.getWidth(null);
			@Pc(77) int local77 = this.anImage10.getHeight(null);
			@Pc(82) int local82 = this.anImage4.getHeight(null);
			@Pc(87) int local87 = this.anImage9.getHeight(null);
			local57.drawImage(this.anImage10, this.method5438(local62) + this.anInt6412 - this.anInt6396 / 2, this.method5439(local77) - -this.anInt6406, null);
			@Pc(124) int local124 = local62 + this.anInt6412 - this.anInt6396 / 2;
			@Pc(135) int local135 = this.anInt6396 / 2 + this.anInt6412 - local67;
			for (@Pc(137) int local137 = local124; local137 <= local135; local137 += local72) {
				local57.drawImage(this.anImage9, this.method5438(local62) + this.anInt6412 + local137, this.method5439(local87) + this.anInt6406, null);
			}
			local57.drawImage(this.anImage4, this.method5438(local67) + this.anInt6412 + this.anInt6396 / 2, this.method5439(local82) - -this.anInt6406, null);
			@Pc(201) int local201 = this.anImage8.getWidth(null);
			@Pc(206) int local206 = this.anImage8.getHeight(null);
			@Pc(211) int local211 = this.anImage11.getWidth(null);
			@Pc(216) int local216 = this.anImage11.getHeight(null);
			@Pc(221) int local221 = this.anImage5.getHeight(null);
			@Pc(226) int local226 = this.anImage6.getWidth(null);
			@Pc(231) int local231 = this.anImage6.getHeight(null);
			@Pc(236) int local236 = this.anImage5.getWidth(null);
			@Pc(241) int local241 = this.anImage3.getWidth(null);
			@Pc(246) int local246 = this.anImage7.getWidth(null);
			@Pc(255) int local255 = this.method5438(this.anInt6413) + this.anInt6402;
			@Pc(265) int local265 = this.method5439(this.anInt6395) + this.anInt6411;
			local57.drawImage(this.anImage8, local255, (this.anInt6395 - local206) / 2 + local265, null);
			local57.drawImage(this.anImage11, local255 + this.anInt6413 - local211, (-local216 + this.anInt6395) / 2 + local265, null);
			if (this.anImage12 == null) {
				this.anImage12 = Static387.aCanvas9.createImage(this.anInt6413 - local201 - local211, this.anInt6395);
			}
			@Pc(324) Graphics local324 = this.anImage12.getGraphics();
			for (@Pc(326) int local326 = 0; local326 < this.anInt6413 - local211 - local201; local326 += local226) {
				local324.drawImage(this.anImage6, local326, 0, null);
			}
			for (@Pc(352) int local352 = 0; local352 < this.anInt6413 - local211 - local201; local352 += local236) {
				local324.drawImage(this.anImage5, local352, this.anInt6395 - local221, null);
			}
			@Pc(397) int local397 = local43 * (this.anInt6413 - local211 - local201) / 100;
			@Pc(432) int local432;
			if (local397 > 0) {
				@Pc(410) Image local410 = Static387.aCanvas9.createImage(local397, this.anInt6395 - local231 - local221);
				@Pc(414) int local414 = local410.getWidth(null);
				@Pc(417) Graphics local417 = local410.getGraphics();
				@Pc(427) int local427 = this.anInt6397 * Static505.method6820() / 10 % local241;
				for (local432 = local427 - local241; local432 < local414; local432 += local241) {
					local417.drawImage(this.anImage3, local432, 0, null);
				}
				local324.drawImage(local410, 0, local231, null);
			}
			@Pc(458) int local458 = local397;
			local397 = this.anInt6413 - local397 - local211 - local201;
			if (local397 > 0) {
				@Pc(487) Image local487 = Static387.aCanvas9.createImage(local397, this.anInt6395 - local231 - local221);
				@Pc(491) int local491 = local487.getWidth(null);
				@Pc(494) Graphics local494 = local487.getGraphics();
				for (local432 = 0; local432 < local491; local432 += local246) {
					local494.drawImage(this.anImage7, local432, 0, null);
				}
				local324.drawImage(local487, local458, local231, null);
			}
			local57.drawImage(this.anImage12, local255 + local201, local265, null);
			local57.setFont(this.aFont1);
			local57.setColor(this.aColor1);
			local57.drawString(local47, (this.anInt6413 - this.aFontMetrics1.stringWidth(local47)) / 2 + local255, local265 + this.anInt6395 / 2 - (-this.anInt6400 + -4));
			local37.drawImage(Static50.anImage1, 0, 0, null);
		} catch (@Pc(577) Exception local577) {
			this.aBoolean467 = true;
		}
	}

	@OriginalMember(owner = "client!ob", name = "b", descriptor = "(II)I")
	private int method5439(@OriginalArg(0) int arg0) {
		return this.aBoolean468 ? (Static308.anInt5171 - arg0) / 2 : 0;
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Class;B)I")
	private int method5440(@OriginalArg(0) Object arg0, @OriginalArg(1) String arg1, @OriginalArg(2) Class arg2) throws IllegalAccessException, NoSuchFieldException {
		@Pc(15) Field local15 = arg2.getDeclaredField(arg1);
		return local15.getInt(arg0);
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(Z)I")
	@Override
	public int method7603() {
		return 100;
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(Ljava/lang/Class;Ljava/lang/String;ILjava/lang/Object;)Z")
	private boolean method5441(@OriginalArg(0) Class arg0, @OriginalArg(1) String arg1, @OriginalArg(3) Object arg2) throws IllegalAccessException, NoSuchFieldException {
		@Pc(15) Field local15 = arg0.getDeclaredField(arg1);
		return local15.getBoolean(arg2);
	}

	@OriginalMember(owner = "client!ob", name = "c", descriptor = "(B)V")
	private void method5442() throws IllegalAccessException, NoSuchFieldException {
		@Pc(10) Class local10 = Static31.anApplet1.getClass();
		this.anImage3 = (Image) this.method5437(local10, "bar");
		this.anImage7 = (Image) this.method5437(local10, "background");
		this.anImage8 = (Image) this.method5437(local10, "left");
		this.anImage11 = (Image) this.method5437(local10, "right");
		this.anImage6 = (Image) this.method5437(local10, "top");
		this.anImage5 = (Image) this.method5437(local10, "bottom");
		this.anImage10 = (Image) this.method5437(local10, "bodyLeft");
		this.anImage4 = (Image) this.method5437(local10, "bodyRight");
		this.anImage9 = (Image) this.method5437(local10, "bodyFill");
		this.aFont1 = (Font) this.method5437(local10, "bf");
		this.aFontMetrics1 = (FontMetrics) this.method5437(local10, "bfm");
		this.aColor1 = (Color) this.method5437(local10, "colourtext");
		@Pc(112) Object local112 = this.method5437(local10, "lb");
		@Pc(115) Class local115 = local112.getClass();
		this.aBoolean466 = this.method5441(local115, "xMiddle", local112);
		this.aBoolean468 = this.method5441(local115, "yMiddle", local112);
		this.anInt6402 = this.method5440(local112, "xOffset", local115);
		this.anInt6411 = this.method5440(local112, "yOffset", local115);
		this.anInt6413 = this.method5440(local112, "width", local115);
		this.anInt6395 = this.method5440(local112, "height", local115);
		this.anInt6412 = this.method5440(local112, "boxXOffset", local115);
		this.anInt6406 = this.method5440(local112, "boxYOffset", local115);
		this.anInt6396 = this.method5440(local112, "boxWidth", local115);
		this.anInt6400 = this.method5440(local112, "textYOffset", local115);
		this.anInt6397 = this.method5440(local112, "offsetPerTenCycles", local115);
	}

	@OriginalMember(owner = "client!ob", name = "b", descriptor = "(I)V")
	@Override
	public void method7601() {
	}
}
