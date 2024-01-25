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

@OriginalClass("client!ae")
public final class Class9 implements Interface9 {

	@OriginalMember(owner = "client!ae", name = "F", descriptor = "Ljava/awt/Image;")
	private Image anImage1;

	@OriginalMember(owner = "client!ae", name = "w", descriptor = "Ljava/awt/Image;")
	private Image anImage2;

	@OriginalMember(owner = "client!ae", name = "h", descriptor = "Z")
	private boolean aBoolean6;

	@OriginalMember(owner = "client!ae", name = "U", descriptor = "Ljava/awt/Image;")
	private Image anImage3;

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "I")
	private int anInt115;

	@OriginalMember(owner = "client!ae", name = "s", descriptor = "I")
	private int anInt119;

	@OriginalMember(owner = "client!ae", name = "K", descriptor = "Z")
	private boolean aBoolean7;

	@OriginalMember(owner = "client!ae", name = "d", descriptor = "I")
	private int anInt121;

	@OriginalMember(owner = "client!ae", name = "m", descriptor = "I")
	private int anInt122;

	@OriginalMember(owner = "client!ae", name = "p", descriptor = "Ljava/awt/Font;")
	private Font aFont1;

	@OriginalMember(owner = "client!ae", name = "C", descriptor = "Ljava/awt/Image;")
	private Image anImage4;

	@OriginalMember(owner = "client!ae", name = "c", descriptor = "I")
	private int anInt123;

	@OriginalMember(owner = "client!ae", name = "k", descriptor = "Ljava/awt/FontMetrics;")
	private FontMetrics aFontMetrics1;

	@OriginalMember(owner = "client!ae", name = "E", descriptor = "Ljava/awt/Image;")
	private Image anImage5;

	@OriginalMember(owner = "client!ae", name = "r", descriptor = "Ljava/awt/Color;")
	private Color aColor1;

	@OriginalMember(owner = "client!ae", name = "P", descriptor = "I")
	private int anInt126;

	@OriginalMember(owner = "client!ae", name = "I", descriptor = "Ljava/awt/Image;")
	private Image anImage6;

	@OriginalMember(owner = "client!ae", name = "u", descriptor = "Ljava/awt/Image;")
	private Image anImage7;

	@OriginalMember(owner = "client!ae", name = "R", descriptor = "I")
	private int anInt130;

	@OriginalMember(owner = "client!ae", name = "S", descriptor = "Ljava/awt/Image;")
	private Image anImage8;

	@OriginalMember(owner = "client!ae", name = "n", descriptor = "I")
	private int anInt133;

	@OriginalMember(owner = "client!ae", name = "i", descriptor = "Ljava/awt/Image;")
	private Image anImage9;

	@OriginalMember(owner = "client!ae", name = "o", descriptor = "Z")
	private boolean aBoolean8;

	@OriginalMember(owner = "client!ae", name = "l", descriptor = "Ljava/awt/Image;")
	private Image anImage10;

	@OriginalMember(owner = "client!ae", name = "q", descriptor = "I")
	private int anInt134;

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(Z)V")
	@Override
	public void method3094() {
		Static681.method8959();
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(II)I")
	private int method106(@OriginalArg(0) int arg0) {
		return this.aBoolean6 ? (Static535.anInt4128 - arg0) / 2 : 0;
	}

	@OriginalMember(owner = "client!ae", name = "c", descriptor = "(I)V")
	private void method107() throws IllegalAccessException, NoSuchFieldException {
		@Pc(6) Class local6 = Static371.anApplet1.getClass();
		this.anImage3 = (Image) this.method109(local6, "bar");
		this.anImage1 = (Image) this.method109(local6, "background");
		this.anImage6 = (Image) this.method109(local6, "left");
		this.anImage2 = (Image) this.method109(local6, "right");
		this.anImage10 = (Image) this.method109(local6, "top");
		this.anImage4 = (Image) this.method109(local6, "bottom");
		this.anImage9 = (Image) this.method109(local6, "bodyLeft");
		this.anImage7 = (Image) this.method109(local6, "bodyRight");
		this.anImage5 = (Image) this.method109(local6, "bodyFill");
		this.aFont1 = (Font) this.method109(local6, "bf");
		this.aFontMetrics1 = (FontMetrics) this.method109(local6, "bfm");
		this.aColor1 = (Color) this.method109(local6, "colourtext");
		@Pc(134) Object local134 = this.method109(local6, "lb");
		@Pc(137) Class local137 = local134.getClass();
		this.aBoolean6 = this.method108("xMiddle", local137, local134);
		this.aBoolean7 = this.method108("yMiddle", local137, local134);
		this.anInt130 = this.method112(local134, "xOffset", local137);
		this.anInt119 = this.method112(local134, "yOffset", local137);
		this.anInt115 = this.method112(local134, "width", local137);
		this.anInt121 = this.method112(local134, "height", local137);
		this.anInt126 = this.method112(local134, "boxXOffset", local137);
		this.anInt134 = this.method112(local134, "boxYOffset", local137);
		this.anInt133 = this.method112(local134, "boxWidth", local137);
		this.anInt123 = this.method112(local134, "textYOffset", local137);
		this.anInt122 = this.method112(local134, "offsetPerTenCycles", local137);
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Class;ZLjava/lang/Object;)Z")
	private boolean method108(@OriginalArg(0) String arg0, @OriginalArg(1) Class arg1, @OriginalArg(3) Object arg2) throws IllegalAccessException, NoSuchFieldException {
		@Pc(16) Field local16 = arg1.getDeclaredField(arg0);
		return local16.getBoolean(arg2);
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(B)I")
	@Override
	public int method3091() {
		return 0;
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(Ljava/lang/Class;ILjava/lang/String;)Ljava/lang/Object;")
	private Object method109(@OriginalArg(0) Class arg0, @OriginalArg(2) String arg1) throws IllegalAccessException, NoSuchFieldException {
		@Pc(15) Field local15 = arg0.getDeclaredField(arg1);
		@Pc(19) Object local19 = local15.get(Static371.anApplet1);
		local15.set(Static371.anApplet1, (Object) null);
		return local19;
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(ZJ)Z")
	@Override
	public boolean method3093(@OriginalArg(1) long arg0) {
		return true;
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(IB)I")
	private int method110(@OriginalArg(0) int arg0) {
		return this.aBoolean7 ? (Static274.anInt3226 - arg0) / 2 : 0;
	}

	@OriginalMember(owner = "client!ae", name = "b", descriptor = "(B)I")
	@Override
	public int method3096() {
		return 100;
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(BZ)V")
	@Override
	public void method3092(@OriginalArg(1) boolean arg0) {
		if (!this.aBoolean8) {
			if (Static371.anApplet1 == null) {
				this.aBoolean8 = true;
			} else if (this.aFont1 == null) {
				try {
					this.method107();
				} catch (@Pc(22) Exception local22) {
					this.aBoolean8 = true;
				}
			}
		}
		if (this.aBoolean8) {
			this.method114();
			return;
		}
		@Pc(43) Graphics local43 = Static4.aCanvas1.getGraphics();
		if (local43 == null) {
			Static4.aCanvas1.repaint();
			return;
		}
		try {
			@Pc(49) int local49 = Static616.aClass339_1.method8116();
			@Pc(53) String local53 = Static616.aClass339_1.method8110();
			if (Static599.anImage12 == null) {
				Static599.anImage12 = Static4.aCanvas1.createImage(Static535.anInt4128, Static274.anInt3226);
			}
			@Pc(65) Graphics local65 = Static599.anImage12.getGraphics();
			local65.clearRect(0, 0, Static535.anInt4128, Static274.anInt3226);
			@Pc(76) int local76 = this.anImage9.getWidth((ImageObserver) null);
			@Pc(81) int local81 = this.anImage7.getWidth((ImageObserver) null);
			@Pc(86) int local86 = this.anImage5.getWidth((ImageObserver) null);
			@Pc(91) int local91 = this.anImage9.getHeight((ImageObserver) null);
			@Pc(96) int local96 = this.anImage7.getHeight((ImageObserver) null);
			@Pc(101) int local101 = this.anImage5.getHeight((ImageObserver) null);
			local65.drawImage(this.anImage9, this.method106(local76) + this.anInt126 - this.anInt133 / 2, this.method110(local91) - -this.anInt134, (ImageObserver) null);
			@Pc(138) int local138 = local76 + this.anInt126 - this.anInt133 / 2;
			@Pc(146) int local146 = this.anInt133 / 2 + this.anInt126;
			for (@Pc(148) int local148 = local138; local148 <= local146; local148 += local86) {
				local65.drawImage(this.anImage5, local148 + this.method106(local76) + this.anInt126, this.method110(local101) - -this.anInt134, (ImageObserver) null);
			}
			local65.drawImage(this.anImage7, this.method106(local81) + this.anInt126 + this.anInt133 / 2, this.method110(local96) - -this.anInt134, (ImageObserver) null);
			@Pc(215) int local215 = this.anImage6.getWidth((ImageObserver) null);
			@Pc(220) int local220 = this.anImage6.getHeight((ImageObserver) null);
			@Pc(225) int local225 = this.anImage2.getWidth((ImageObserver) null);
			@Pc(230) int local230 = this.anImage2.getHeight((ImageObserver) null);
			@Pc(235) int local235 = this.anImage4.getHeight((ImageObserver) null);
			@Pc(240) int local240 = this.anImage10.getWidth((ImageObserver) null);
			@Pc(245) int local245 = this.anImage10.getHeight((ImageObserver) null);
			@Pc(250) int local250 = this.anImage4.getWidth((ImageObserver) null);
			@Pc(255) int local255 = this.anImage3.getWidth((ImageObserver) null);
			@Pc(260) int local260 = this.anImage1.getWidth((ImageObserver) null);
			@Pc(269) int local269 = this.method106(this.anInt115) + this.anInt130;
			@Pc(278) int local278 = this.method110(this.anInt121) + this.anInt119;
			local65.drawImage(this.anImage6, local269, local278 + (this.anInt121 - local220) / 2, (ImageObserver) null);
			local65.drawImage(this.anImage2, local269 + this.anInt115 - local225, (this.anInt121 + -local230) / 2 + local278, (ImageObserver) null);
			if (this.anImage8 == null) {
				this.anImage8 = Static4.aCanvas1.createImage(this.anInt115 - local225 - local215, this.anInt121);
			}
			@Pc(342) Graphics local342 = this.anImage8.getGraphics();
			for (@Pc(344) int local344 = 0; local344 < this.anInt115 - local225 - local215; local344 += local240) {
				local342.drawImage(this.anImage10, local344, 0, (ImageObserver) null);
			}
			for (@Pc(376) int local376 = 0; local376 < this.anInt115 - local225 - local215; local376 += local250) {
				local342.drawImage(this.anImage4, local376, this.anInt121 - local235, (ImageObserver) null);
			}
			@Pc(419) int local419 = (this.anInt115 - local215 - local225) * local49 / 100;
			@Pc(459) int local459;
			if (local419 > 0) {
				@Pc(437) Image local437 = Static4.aCanvas1.createImage(local419, this.anInt121 - local235 - local245);
				@Pc(441) int local441 = local437.getWidth((ImageObserver) null);
				@Pc(444) Graphics local444 = local437.getGraphics();
				@Pc(454) int local454 = this.anInt122 * Static336.method5188() / 10 % local255;
				for (local459 = local454 - local255; local459 < local441; local459 += local255) {
					local444.drawImage(this.anImage3, local459, 0, (ImageObserver) null);
				}
				local342.drawImage(local437, 0, local245, (ImageObserver) null);
			}
			@Pc(495) int local495 = local419;
			local419 = this.anInt115 - local419 - local225 - local215;
			if (local419 > 0) {
				@Pc(523) Image local523 = Static4.aCanvas1.createImage(local419, this.anInt121 - local235 - local245);
				@Pc(527) int local527 = local523.getWidth((ImageObserver) null);
				@Pc(530) Graphics local530 = local523.getGraphics();
				for (local459 = 0; local459 < local527; local459 += local260) {
					local530.drawImage(this.anImage1, local459, 0, (ImageObserver) null);
				}
				local342.drawImage(local523, local495, local245, (ImageObserver) null);
			}
			local65.drawImage(this.anImage8, local269 + local215, local278, (ImageObserver) null);
			local65.setFont(this.aFont1);
			local65.setColor(this.aColor1);
			local65.drawString(local53, (this.anInt115 - this.aFontMetrics1.stringWidth(local53)) / 2 + local269, this.anInt121 / 2 + 4 + (local278 - -this.anInt123));
			local43.drawImage(Static599.anImage12, 0, 0, (ImageObserver) null);
		} catch (@Pc(619) Exception local619) {
			this.aBoolean8 = true;
		}
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Class;I)I")
	private int method112(@OriginalArg(0) Object arg0, @OriginalArg(1) String arg1, @OriginalArg(2) Class arg2) throws IllegalAccessException, NoSuchFieldException {
		@Pc(15) Field local15 = arg2.getDeclaredField(arg1);
		return local15.getInt(arg0);
	}

	@OriginalMember(owner = "client!ae", name = "b", descriptor = "(I)V")
	private void method114() {
		Static13.method180(Static616.aClass339_1.method8116(), Static193.aColorArray7[Static24.anInt316], Static616.aClass339_1.method8110(), Static36.aColorArray1[Static24.anInt316], Static357.aColorArray4[Static24.anInt316]);
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(I)V")
	@Override
	public void method3095() {
	}
}
