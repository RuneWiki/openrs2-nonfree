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

@OriginalClass("client!lp")
public final class Class224 implements Interface11 {

	@OriginalMember(owner = "client!lp", name = "g", descriptor = "I")
	private int anInt6090;

	@OriginalMember(owner = "client!lp", name = "Q", descriptor = "I")
	private int anInt6091;

	@OriginalMember(owner = "client!lp", name = "O", descriptor = "Z")
	private boolean aBoolean432;

	@OriginalMember(owner = "client!lp", name = "J", descriptor = "Ljava/awt/FontMetrics;")
	private FontMetrics aFontMetrics1;

	@OriginalMember(owner = "client!lp", name = "I", descriptor = "I")
	private int anInt6093;

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "Z")
	private boolean aBoolean433;

	@OriginalMember(owner = "client!lp", name = "G", descriptor = "I")
	private int anInt6096;

	@OriginalMember(owner = "client!lp", name = "r", descriptor = "Ljava/awt/Image;")
	private Image anImage4;

	@OriginalMember(owner = "client!lp", name = "E", descriptor = "Ljava/awt/Image;")
	private Image anImage5;

	@OriginalMember(owner = "client!lp", name = "s", descriptor = "Ljava/awt/Image;")
	private Image anImage6;

	@OriginalMember(owner = "client!lp", name = "q", descriptor = "I")
	private int anInt6101;

	@OriginalMember(owner = "client!lp", name = "k", descriptor = "Ljava/awt/Color;")
	private Color aColor1;

	@OriginalMember(owner = "client!lp", name = "A", descriptor = "Ljava/awt/Font;")
	private Font aFont1;

	@OriginalMember(owner = "client!lp", name = "F", descriptor = "I")
	private int anInt6102;

	@OriginalMember(owner = "client!lp", name = "n", descriptor = "Ljava/awt/Image;")
	private Image anImage7;

	@OriginalMember(owner = "client!lp", name = "N", descriptor = "Z")
	private boolean aBoolean434;

	@OriginalMember(owner = "client!lp", name = "t", descriptor = "Ljava/awt/Image;")
	private Image anImage8;

	@OriginalMember(owner = "client!lp", name = "w", descriptor = "Ljava/awt/Image;")
	private Image anImage9;

	@OriginalMember(owner = "client!lp", name = "L", descriptor = "Ljava/awt/Image;")
	private Image anImage10;

	@OriginalMember(owner = "client!lp", name = "i", descriptor = "I")
	private int anInt6109;

	@OriginalMember(owner = "client!lp", name = "P", descriptor = "Ljava/awt/Image;")
	private Image anImage11;

	@OriginalMember(owner = "client!lp", name = "u", descriptor = "I")
	private int anInt6113;

	@OriginalMember(owner = "client!lp", name = "z", descriptor = "Ljava/awt/Image;")
	private Image anImage12;

	@OriginalMember(owner = "client!lp", name = "o", descriptor = "Ljava/awt/Image;")
	private Image anImage13;

	@OriginalMember(owner = "client!lp", name = "b", descriptor = "I")
	private int anInt6115;

	@OriginalMember(owner = "client!lp", name = "b", descriptor = "(I)I")
	@Override
	public int method5416() {
		return 100;
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(B)V")
	@Override
	public void method5417() {
		Static393.method5983();
	}

	@OriginalMember(owner = "client!lp", name = "b", descriptor = "(ZI)I")
	private int method5419(@OriginalArg(1) int arg0) {
		return this.aBoolean433 ? (Static563.anInt4939 - arg0) / 2 : 0;
	}

	@OriginalMember(owner = "client!lp", name = "b", descriptor = "(B)V")
	private void method5420() {
		Static350.method5346(Static161.aClass329_3.method8064(), Static161.aClass329_3.method8067(), Static537.aColorArray1[Static510.anInt8857], Static667.aColorArray3[Static510.anInt8857], Static590.aColorArray2[Static510.anInt8857]);
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(Ljava/lang/Class;ILjava/lang/Object;Ljava/lang/String;)Z")
	private boolean method5421(@OriginalArg(0) Class arg0, @OriginalArg(2) Object arg1, @OriginalArg(3) String arg2) throws IllegalAccessException, NoSuchFieldException {
		@Pc(15) Field local15 = arg0.getDeclaredField(arg2);
		return local15.getBoolean(arg1);
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(II)I")
	private int method5422(@OriginalArg(0) int arg0) {
		return this.aBoolean432 ? (Static506.anInt8791 - arg0) / 2 : 0;
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/Class;)Ljava/lang/Object;")
	private Object method5424(@OriginalArg(0) String arg0, @OriginalArg(2) Class arg1) throws IllegalAccessException, NoSuchFieldException {
		@Pc(7) Field local7 = arg1.getDeclaredField(arg0);
		@Pc(11) Object local11 = local7.get(Static531.anApplet2);
		local7.set(Static531.anApplet2, (Object) null);
		return local11;
	}

	@OriginalMember(owner = "client!lp", name = "c", descriptor = "(I)I")
	@Override
	public int method5413() {
		return 0;
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(BJ)Z")
	@Override
	public boolean method5415(@OriginalArg(1) long arg0) {
		return true;
	}

	@OriginalMember(owner = "client!lp", name = "e", descriptor = "(I)V")
	private void method5428() throws IllegalAccessException, NoSuchFieldException {
		@Pc(6) Class local6 = Static531.anApplet2.getClass();
		this.anImage6 = (Image) this.method5424("bar", local6);
		this.anImage11 = (Image) this.method5424("background", local6);
		this.anImage7 = (Image) this.method5424("left", local6);
		this.anImage5 = (Image) this.method5424("right", local6);
		this.anImage4 = (Image) this.method5424("top", local6);
		this.anImage12 = (Image) this.method5424("bottom", local6);
		this.anImage9 = (Image) this.method5424("bodyLeft", local6);
		this.anImage10 = (Image) this.method5424("bodyRight", local6);
		this.anImage8 = (Image) this.method5424("bodyFill", local6);
		this.aFont1 = (Font) this.method5424("bf", local6);
		this.aFontMetrics1 = (FontMetrics) this.method5424("bfm", local6);
		this.aColor1 = (Color) this.method5424("colourtext", local6);
		@Pc(136) Object local136 = this.method5424("lb", local6);
		@Pc(139) Class local139 = local136.getClass();
		this.aBoolean433 = this.method5421(local139, local136, "xMiddle");
		this.aBoolean432 = this.method5421(local139, local136, "yMiddle");
		this.anInt6115 = this.method5430(local139, local136, "xOffset");
		this.anInt6101 = this.method5430(local139, local136, "yOffset");
		this.anInt6113 = this.method5430(local139, local136, "width");
		this.anInt6093 = this.method5430(local139, local136, "height");
		this.anInt6109 = this.method5430(local139, local136, "boxXOffset");
		this.anInt6090 = this.method5430(local139, local136, "boxYOffset");
		this.anInt6096 = this.method5430(local139, local136, "boxWidth");
		this.anInt6091 = this.method5430(local139, local136, "textYOffset");
		this.anInt6102 = this.method5430(local139, local136, "offsetPerTenCycles");
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(ILjava/lang/Class;Ljava/lang/Object;Ljava/lang/String;)I")
	private int method5430(@OriginalArg(1) Class arg0, @OriginalArg(2) Object arg1, @OriginalArg(3) String arg2) throws IllegalAccessException, NoSuchFieldException {
		@Pc(7) Field local7 = arg0.getDeclaredField(arg2);
		return local7.getInt(arg1);
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(I)V")
	@Override
	public void method5414() {
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(IZ)V")
	@Override
	public void method5418(@OriginalArg(1) boolean arg0) {
		if (!this.aBoolean434) {
			if (Static531.anApplet2 == null) {
				this.aBoolean434 = true;
			} else if (this.aFont1 == null) {
				try {
					this.method5428();
				} catch (@Pc(29) Exception local29) {
					this.aBoolean434 = true;
				}
			}
		}
		if (this.aBoolean434) {
			this.method5420();
			return;
		}
		@Pc(52) Graphics local52 = Static626.aCanvas12.getGraphics();
		if (local52 == null) {
			Static626.aCanvas12.repaint();
			return;
		}
		try {
			@Pc(58) int local58 = Static161.aClass329_3.method8067();
			@Pc(62) String local62 = Static161.aClass329_3.method8064();
			if (Static563.anImage3 == null) {
				Static563.anImage3 = Static626.aCanvas12.createImage(Static563.anInt4939, Static506.anInt8791);
			}
			@Pc(74) Graphics local74 = Static563.anImage3.getGraphics();
			local74.clearRect(0, 0, Static563.anInt4939, Static506.anInt8791);
			@Pc(85) int local85 = this.anImage9.getWidth((ImageObserver) null);
			@Pc(90) int local90 = this.anImage10.getWidth((ImageObserver) null);
			@Pc(95) int local95 = this.anImage8.getWidth((ImageObserver) null);
			@Pc(100) int local100 = this.anImage9.getHeight((ImageObserver) null);
			@Pc(105) int local105 = this.anImage10.getHeight((ImageObserver) null);
			@Pc(110) int local110 = this.anImage8.getHeight((ImageObserver) null);
			local74.drawImage(this.anImage9, this.method5419(local85) + this.anInt6109 - this.anInt6096 / 2, this.method5422(local100) - -this.anInt6090, (ImageObserver) null);
			@Pc(146) int local146 = this.anInt6109 + local85 - this.anInt6096 / 2;
			@Pc(154) int local154 = this.anInt6096 / 2 + this.anInt6109;
			for (@Pc(156) int local156 = local146; local156 <= local154; local156 += local95) {
				local74.drawImage(this.anImage8, local156 + this.method5419(local85) + this.anInt6109, this.method5422(local110) + this.anInt6090, (ImageObserver) null);
			}
			local74.drawImage(this.anImage10, this.method5419(local90) + this.anInt6109 + this.anInt6096 / 2, this.method5422(local105) - -this.anInt6090, (ImageObserver) null);
			@Pc(227) int local227 = this.anImage7.getWidth((ImageObserver) null);
			@Pc(232) int local232 = this.anImage7.getHeight((ImageObserver) null);
			@Pc(237) int local237 = this.anImage5.getWidth((ImageObserver) null);
			@Pc(242) int local242 = this.anImage5.getHeight((ImageObserver) null);
			@Pc(247) int local247 = this.anImage12.getHeight((ImageObserver) null);
			@Pc(252) int local252 = this.anImage4.getWidth((ImageObserver) null);
			@Pc(257) int local257 = this.anImage4.getHeight((ImageObserver) null);
			@Pc(262) int local262 = this.anImage12.getWidth((ImageObserver) null);
			@Pc(267) int local267 = this.anImage6.getWidth((ImageObserver) null);
			@Pc(272) int local272 = this.anImage11.getWidth((ImageObserver) null);
			@Pc(282) int local282 = this.method5419(this.anInt6113) + this.anInt6115;
			@Pc(293) int local293 = this.method5422(this.anInt6093) + this.anInt6101;
			local74.drawImage(this.anImage7, local282, local293 + (this.anInt6093 - local232) / 2, (ImageObserver) null);
			local74.drawImage(this.anImage5, local282 + this.anInt6113 - local237, (this.anInt6093 - local242) / 2 + local293, (ImageObserver) null);
			if (this.anImage13 == null) {
				this.anImage13 = Static626.aCanvas12.createImage(this.anInt6113 - local237 - local227, this.anInt6093);
			}
			@Pc(356) Graphics local356 = this.anImage13.getGraphics();
			for (@Pc(358) int local358 = 0; local358 < this.anInt6113 - local237 - local227; local358 += local252) {
				local356.drawImage(this.anImage4, local358, 0, (ImageObserver) null);
			}
			for (@Pc(390) int local390 = 0; local390 < this.anInt6113 - local227 - local237; local390 += local262) {
				local356.drawImage(this.anImage12, local390, this.anInt6093 - local247, (ImageObserver) null);
			}
			@Pc(432) int local432 = local58 * (this.anInt6113 - local227 - local237) / 100;
			@Pc(473) int local473;
			if (local432 > 0) {
				@Pc(449) Image local449 = Static626.aCanvas12.createImage(local432, this.anInt6093 - local257 - local247);
				@Pc(453) int local453 = local449.getWidth((ImageObserver) null);
				@Pc(456) Graphics local456 = local449.getGraphics();
				@Pc(468) int local468 = this.anInt6102 * Static33.method571() / 10 % local267;
				for (local473 = local468 - local267; local473 < local453; local473 += local267) {
					local456.drawImage(this.anImage6, local473, 0, (ImageObserver) null);
				}
				local356.drawImage(local449, 0, local257, (ImageObserver) null);
			}
			@Pc(509) int local509 = local432;
			local432 = this.anInt6113 - local432 - local227 - local237;
			if (local432 > 0) {
				@Pc(534) Image local534 = Static626.aCanvas12.createImage(local432, this.anInt6093 - local257 - local247);
				@Pc(538) int local538 = local534.getWidth((ImageObserver) null);
				@Pc(541) Graphics local541 = local534.getGraphics();
				for (local473 = 0; local473 < local538; local473 += local272) {
					local541.drawImage(this.anImage11, local473, 0, (ImageObserver) null);
				}
				local356.drawImage(local534, local509, local257, (ImageObserver) null);
			}
			local74.drawImage(this.anImage13, local282 + local227, local293, (ImageObserver) null);
			local74.setFont(this.aFont1);
			local74.setColor(this.aColor1);
			local74.drawString(local62, (this.anInt6113 - this.aFontMetrics1.stringWidth(local62)) / 2 + local282, this.anInt6091 + this.anInt6093 / 2 + local293 + 4);
			local52.drawImage(Static563.anImage3, 0, 0, (ImageObserver) null);
		} catch (@Pc(626) Exception local626) {
			this.aBoolean434 = true;
		}
	}
}
