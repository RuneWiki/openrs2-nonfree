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

@OriginalClass("client!ce")
public final class Class53 implements Interface18 {

	@OriginalMember(owner = "client!ce", name = "C", descriptor = "I")
	private int anInt1023;

	@OriginalMember(owner = "client!ce", name = "b", descriptor = "Ljava/awt/Image;")
	private Image anImage1;

	@OriginalMember(owner = "client!ce", name = "i", descriptor = "I")
	private int anInt1026;

	@OriginalMember(owner = "client!ce", name = "R", descriptor = "I")
	private int anInt1027;

	@OriginalMember(owner = "client!ce", name = "K", descriptor = "Ljava/awt/Image;")
	private Image anImage2;

	@OriginalMember(owner = "client!ce", name = "B", descriptor = "Ljava/awt/Image;")
	private Image anImage3;

	@OriginalMember(owner = "client!ce", name = "h", descriptor = "I")
	private int anInt1028;

	@OriginalMember(owner = "client!ce", name = "l", descriptor = "Z")
	private boolean aBoolean81;

	@OriginalMember(owner = "client!ce", name = "e", descriptor = "Ljava/awt/Image;")
	private Image anImage4;

	@OriginalMember(owner = "client!ce", name = "p", descriptor = "Ljava/awt/Image;")
	private Image anImage5;

	@OriginalMember(owner = "client!ce", name = "x", descriptor = "Z")
	private boolean aBoolean82;

	@OriginalMember(owner = "client!ce", name = "M", descriptor = "I")
	private int anInt1032;

	@OriginalMember(owner = "client!ce", name = "E", descriptor = "Ljava/awt/FontMetrics;")
	private FontMetrics aFontMetrics1;

	@OriginalMember(owner = "client!ce", name = "z", descriptor = "Ljava/awt/Image;")
	private Image anImage6;

	@OriginalMember(owner = "client!ce", name = "J", descriptor = "I")
	private int anInt1034;

	@OriginalMember(owner = "client!ce", name = "f", descriptor = "Ljava/awt/Color;")
	private Color aColor1;

	@OriginalMember(owner = "client!ce", name = "D", descriptor = "I")
	private int anInt1035;

	@OriginalMember(owner = "client!ce", name = "S", descriptor = "Ljava/awt/Image;")
	private Image anImage7;

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "Ljava/awt/Image;")
	private Image anImage8;

	@OriginalMember(owner = "client!ce", name = "g", descriptor = "I")
	private int anInt1039;

	@OriginalMember(owner = "client!ce", name = "P", descriptor = "Ljava/awt/Image;")
	private Image anImage9;

	@OriginalMember(owner = "client!ce", name = "d", descriptor = "Ljava/awt/Image;")
	private Image anImage10;

	@OriginalMember(owner = "client!ce", name = "y", descriptor = "Ljava/awt/Font;")
	private Font aFont1;

	@OriginalMember(owner = "client!ce", name = "o", descriptor = "I")
	private int anInt1046;

	@OriginalMember(owner = "client!ce", name = "j", descriptor = "Z")
	private boolean aBoolean84;

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/Object;Ljava/lang/Class;)Z")
	private boolean method1050(@OriginalArg(0) String arg0, @OriginalArg(2) Object arg1, @OriginalArg(3) Class arg2) throws IllegalAccessException, NoSuchFieldException {
		@Pc(15) Field local15 = arg2.getDeclaredField(arg0);
		return local15.getBoolean(arg1);
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(ZB)V")
	@Override
	public void method5205(@OriginalArg(0) boolean arg0) {
		if (!this.aBoolean81) {
			if (Static265.anApplet2 == null) {
				this.aBoolean81 = true;
			} else if (this.aFont1 == null) {
				try {
					this.method1054();
				} catch (@Pc(25) Exception local25) {
					this.aBoolean81 = true;
				}
			}
		}
		if (this.aBoolean81) {
			this.method1051();
			return;
		}
		@Pc(51) Graphics local51 = Static357.aCanvas8.getGraphics();
		if (local51 == null) {
			Static357.aCanvas8.repaint();
			return;
		}
		try {
			@Pc(61) int local61 = Static510.aClass216_1.method4931();
			@Pc(65) String local65 = Static510.aClass216_1.method4936();
			if (Static655.anImage13 == null) {
				Static655.anImage13 = Static357.aCanvas8.createImage(Static85.anInt9921, Static256.anInt4629);
			}
			@Pc(77) Graphics local77 = Static655.anImage13.getGraphics();
			local77.clearRect(0, 0, Static85.anInt9921, Static256.anInt4629);
			@Pc(88) int local88 = this.anImage9.getWidth((ImageObserver) null);
			@Pc(93) int local93 = this.anImage2.getWidth((ImageObserver) null);
			@Pc(98) int local98 = this.anImage7.getWidth((ImageObserver) null);
			@Pc(103) int local103 = this.anImage9.getHeight((ImageObserver) null);
			@Pc(108) int local108 = this.anImage2.getHeight((ImageObserver) null);
			@Pc(113) int local113 = this.anImage7.getHeight((ImageObserver) null);
			local77.drawImage(this.anImage9, this.method1053(local88) + this.anInt1034 - this.anInt1023 / 2, this.method1055(local103) - -this.anInt1032, (ImageObserver) null);
			@Pc(151) int local151 = local88 + this.anInt1034 - this.anInt1023 / 2;
			@Pc(160) int local160 = this.anInt1034 + this.anInt1023 / 2;
			for (@Pc(162) int local162 = local151; local162 <= local160; local162 += local98) {
				local77.drawImage(this.anImage7, local162 + this.method1053(local88) + this.anInt1034, this.method1055(local113) + this.anInt1032, (ImageObserver) null);
			}
			local77.drawImage(this.anImage2, this.method1053(local93) + this.anInt1034 + this.anInt1023 / 2, this.method1055(local108) + this.anInt1032, (ImageObserver) null);
			@Pc(232) int local232 = this.anImage10.getWidth((ImageObserver) null);
			@Pc(237) int local237 = this.anImage10.getHeight((ImageObserver) null);
			@Pc(242) int local242 = this.anImage6.getWidth((ImageObserver) null);
			@Pc(247) int local247 = this.anImage6.getHeight((ImageObserver) null);
			@Pc(252) int local252 = this.anImage4.getHeight((ImageObserver) null);
			@Pc(257) int local257 = this.anImage8.getWidth((ImageObserver) null);
			@Pc(262) int local262 = this.anImage8.getHeight((ImageObserver) null);
			@Pc(267) int local267 = this.anImage4.getWidth((ImageObserver) null);
			@Pc(272) int local272 = this.anImage5.getWidth((ImageObserver) null);
			@Pc(277) int local277 = this.anImage1.getWidth((ImageObserver) null);
			@Pc(286) int local286 = this.method1053(this.anInt1046) + this.anInt1028;
			@Pc(295) int local295 = this.method1055(this.anInt1039) + this.anInt1026;
			local77.drawImage(this.anImage10, local286, local295 + (this.anInt1039 - local237) / 2, (ImageObserver) null);
			local77.drawImage(this.anImage6, local286 + this.anInt1046 - local242, local295 + (this.anInt1039 - local247) / 2, (ImageObserver) null);
			if (this.anImage3 == null) {
				this.anImage3 = Static357.aCanvas8.createImage(this.anInt1046 - local242 - local232, this.anInt1039);
			}
			@Pc(356) Graphics local356 = this.anImage3.getGraphics();
			for (@Pc(358) int local358 = 0; local358 < this.anInt1046 - local242 - local232; local358 += local257) {
				local356.drawImage(this.anImage8, local358, 0, (ImageObserver) null);
			}
			for (@Pc(386) int local386 = 0; local386 < this.anInt1046 - local232 - local242; local386 += local267) {
				local356.drawImage(this.anImage4, local386, this.anInt1039 - local252, (ImageObserver) null);
			}
			@Pc(434) int local434 = (this.anInt1046 - local232 - local242) * local61 / 100;
			@Pc(473) int local473;
			if (local434 > 0) {
				@Pc(452) Image local452 = Static357.aCanvas8.createImage(local434, this.anInt1039 - local262 - local252);
				@Pc(456) int local456 = local452.getWidth((ImageObserver) null);
				@Pc(459) Graphics local459 = local452.getGraphics();
				@Pc(469) int local469 = this.anInt1027 * Static616.method8458() / 10 % local272;
				for (local473 = local469 - local272; local473 < local456; local473 += local272) {
					local459.drawImage(this.anImage5, local473, 0, (ImageObserver) null);
				}
				local356.drawImage(local452, 0, local262, (ImageObserver) null);
			}
			@Pc(509) int local509 = local434;
			local434 = this.anInt1046 - local232 - local242 - local434;
			if (local434 > 0) {
				@Pc(538) Image local538 = Static357.aCanvas8.createImage(local434, this.anInt1039 - local252 - local262);
				@Pc(542) int local542 = local538.getWidth((ImageObserver) null);
				@Pc(545) Graphics local545 = local538.getGraphics();
				for (local473 = 0; local473 < local542; local473 += local277) {
					local545.drawImage(this.anImage1, local473, 0, (ImageObserver) null);
				}
				local356.drawImage(local538, local509, local262, (ImageObserver) null);
			}
			local77.drawImage(this.anImage3, local286 + local232, local295, (ImageObserver) null);
			local77.setFont(this.aFont1);
			local77.setColor(this.aColor1);
			local77.drawString(local65, (this.anInt1046 - this.aFontMetrics1.stringWidth(local65)) / 2 + local286, local295 + 4 + this.anInt1039 / 2 + this.anInt1035);
			local51.drawImage(Static655.anImage13, 0, 0, (ImageObserver) null);
		} catch (@Pc(633) Exception local633) {
			this.aBoolean81 = true;
		}
	}

	@OriginalMember(owner = "client!ce", name = "c", descriptor = "(I)V")
	private void method1051() {
		Static541.method7418(Static78.aColorArray4[Static681.anInt10911], Static510.aClass216_1.method4936(), Static153.aColorArray6[Static681.anInt10911], Static475.aColorArray14[Static681.anInt10911], Static510.aClass216_1.method4931());
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(Ljava/lang/Class;Ljava/lang/String;B)Ljava/lang/Object;")
	private Object method1052(@OriginalArg(0) Class arg0, @OriginalArg(1) String arg1) throws IllegalAccessException, NoSuchFieldException {
		@Pc(7) Field local7 = arg0.getDeclaredField(arg1);
		@Pc(11) Object local11 = local7.get(Static265.anApplet2);
		local7.set(Static265.anApplet2, (Object) null);
		return local11;
	}

	@OriginalMember(owner = "client!ce", name = "b", descriptor = "(IZ)I")
	private int method1053(@OriginalArg(0) int arg0) {
		return this.aBoolean84 ? (Static85.anInt9921 - arg0) / 2 : 0;
	}

	@OriginalMember(owner = "client!ce", name = "b", descriptor = "(Z)V")
	private void method1054() throws IllegalAccessException, NoSuchFieldException {
		@Pc(6) Class local6 = Static265.anApplet2.getClass();
		this.anImage5 = (Image) this.method1052(local6, "bar");
		this.anImage1 = (Image) this.method1052(local6, "background");
		this.anImage10 = (Image) this.method1052(local6, "left");
		this.anImage6 = (Image) this.method1052(local6, "right");
		this.anImage8 = (Image) this.method1052(local6, "top");
		this.anImage4 = (Image) this.method1052(local6, "bottom");
		this.anImage9 = (Image) this.method1052(local6, "bodyLeft");
		this.anImage2 = (Image) this.method1052(local6, "bodyRight");
		this.anImage7 = (Image) this.method1052(local6, "bodyFill");
		this.aFont1 = (Font) this.method1052(local6, "bf");
		this.aFontMetrics1 = (FontMetrics) this.method1052(local6, "bfm");
		this.aColor1 = (Color) this.method1052(local6, "colourtext");
		@Pc(134) Object local134 = this.method1052(local6, "lb");
		@Pc(137) Class local137 = local134.getClass();
		this.aBoolean84 = this.method1050("xMiddle", local134, local137);
		this.aBoolean82 = this.method1050("yMiddle", local134, local137);
		this.anInt1028 = this.method1057(local137, "xOffset", local134);
		this.anInt1026 = this.method1057(local137, "yOffset", local134);
		this.anInt1046 = this.method1057(local137, "width", local134);
		this.anInt1039 = this.method1057(local137, "height", local134);
		this.anInt1034 = this.method1057(local137, "boxXOffset", local134);
		this.anInt1032 = this.method1057(local137, "boxYOffset", local134);
		this.anInt1023 = this.method1057(local137, "boxWidth", local134);
		this.anInt1035 = this.method1057(local137, "textYOffset", local134);
		this.anInt1027 = this.method1057(local137, "offsetPerTenCycles", local134);
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(B)V")
	@Override
	public void method5201() {
		Static681.method9214();
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(IZ)I")
	private int method1055(@OriginalArg(0) int arg0) {
		return this.aBoolean82 ? (Static256.anInt4629 - arg0) / 2 : 0;
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(Ljava/lang/Class;Ljava/lang/String;ILjava/lang/Object;)I")
	private int method1057(@OriginalArg(0) Class arg0, @OriginalArg(1) String arg1, @OriginalArg(3) Object arg2) throws IllegalAccessException, NoSuchFieldException {
		@Pc(7) Field local7 = arg0.getDeclaredField(arg1);
		return local7.getInt(arg2);
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(I)V")
	@Override
	public void method5204() {
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(Z)I")
	@Override
	public int method5202() {
		return 0;
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(JI)Z")
	@Override
	public boolean method5200(@OriginalArg(0) long arg0) {
		return true;
	}

	@OriginalMember(owner = "client!ce", name = "b", descriptor = "(I)I")
	@Override
	public int method5203() {
		return 100;
	}
}
