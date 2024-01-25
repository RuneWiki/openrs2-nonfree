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

@OriginalClass("client!gfa")
public final class Class124 implements Interface1 {

	@OriginalMember(owner = "client!gfa", name = "a", descriptor = "I")
	private int anInt3537;

	@OriginalMember(owner = "client!gfa", name = "b", descriptor = "Ljava/awt/Font;")
	private Font aFont2;

	@OriginalMember(owner = "client!gfa", name = "c", descriptor = "I")
	private int anInt3538;

	@OriginalMember(owner = "client!gfa", name = "d", descriptor = "I")
	private int anInt3539;

	@OriginalMember(owner = "client!gfa", name = "e", descriptor = "I")
	private int anInt3540;

	@OriginalMember(owner = "client!gfa", name = "h", descriptor = "Z")
	private boolean aBoolean293;

	@OriginalMember(owner = "client!gfa", name = "i", descriptor = "I")
	private int anInt3543;

	@OriginalMember(owner = "client!gfa", name = "m", descriptor = "Ljava/awt/Color;")
	private Color aColor1;

	@OriginalMember(owner = "client!gfa", name = "o", descriptor = "Ljava/awt/Image;")
	private Image anImage3;

	@OriginalMember(owner = "client!gfa", name = "r", descriptor = "Ljava/awt/Image;")
	private Image anImage4;

	@OriginalMember(owner = "client!gfa", name = "s", descriptor = "I")
	private int anInt3549;

	@OriginalMember(owner = "client!gfa", name = "t", descriptor = "Ljava/awt/Image;")
	private Image anImage5;

	@OriginalMember(owner = "client!gfa", name = "u", descriptor = "Ljava/awt/FontMetrics;")
	private FontMetrics aFontMetrics1;

	@OriginalMember(owner = "client!gfa", name = "v", descriptor = "Ljava/awt/Image;")
	private Image anImage6;

	@OriginalMember(owner = "client!gfa", name = "w", descriptor = "Ljava/awt/Image;")
	private Image anImage7;

	@OriginalMember(owner = "client!gfa", name = "A", descriptor = "I")
	private int anInt3552;

	@OriginalMember(owner = "client!gfa", name = "B", descriptor = "Ljava/awt/Image;")
	private Image anImage8;

	@OriginalMember(owner = "client!gfa", name = "D", descriptor = "Ljava/awt/Image;")
	private Image anImage9;

	@OriginalMember(owner = "client!gfa", name = "E", descriptor = "Z")
	private boolean aBoolean294;

	@OriginalMember(owner = "client!gfa", name = "F", descriptor = "I")
	private int anInt3554;

	@OriginalMember(owner = "client!gfa", name = "H", descriptor = "I")
	private int anInt3555;

	@OriginalMember(owner = "client!gfa", name = "J", descriptor = "Ljava/awt/Image;")
	private Image anImage10;

	@OriginalMember(owner = "client!gfa", name = "L", descriptor = "Z")
	private boolean aBoolean295;

	@OriginalMember(owner = "client!gfa", name = "O", descriptor = "Ljava/awt/Image;")
	private Image anImage11;

	@OriginalMember(owner = "client!gfa", name = "P", descriptor = "Ljava/awt/Image;")
	private Image anImage12;

	@OriginalMember(owner = "client!gfa", name = "a", descriptor = "(JI)Z")
	@Override
	public boolean method5717(@OriginalArg(0) long arg0) {
		return true;
	}

	@OriginalMember(owner = "client!gfa", name = "a", descriptor = "(II)I")
	private int method2927(@OriginalArg(1) int arg0) {
		return this.aBoolean295 ? (Static140.anInt2937 - arg0) / 2 : 0;
	}

	@OriginalMember(owner = "client!gfa", name = "b", descriptor = "(I)V")
	private void method2928() throws IllegalAccessException, NoSuchFieldException {
		@Pc(6) Class local6 = Static562.anApplet2.getClass();
		this.anImage6 = (Image) this.method2935("bar", local6);
		this.anImage8 = (Image) this.method2935("background", local6);
		this.anImage12 = (Image) this.method2935("left", local6);
		this.anImage3 = (Image) this.method2935("right", local6);
		this.anImage9 = (Image) this.method2935("top", local6);
		this.anImage5 = (Image) this.method2935("bottom", local6);
		this.anImage7 = (Image) this.method2935("bodyLeft", local6);
		this.anImage4 = (Image) this.method2935("bodyRight", local6);
		this.anImage10 = (Image) this.method2935("bodyFill", local6);
		this.aFont2 = (Font) this.method2935("bf", local6);
		this.aFontMetrics1 = (FontMetrics) this.method2935("bfm", local6);
		this.aColor1 = (Color) this.method2935("colourtext", local6);
		@Pc(108) Object local108 = this.method2935("lb", local6);
		@Pc(111) Class local111 = local108.getClass();
		this.aBoolean295 = this.method2934(local111, local108, "xMiddle");
		this.aBoolean294 = this.method2934(local111, local108, "yMiddle");
		this.anInt3555 = this.method2932(local111, local108, "xOffset");
		this.anInt3537 = this.method2932(local111, local108, "yOffset");
		this.anInt3543 = this.method2932(local111, local108, "width");
		this.anInt3554 = this.method2932(local111, local108, "height");
		this.anInt3540 = this.method2932(local111, local108, "boxXOffset");
		this.anInt3552 = this.method2932(local111, local108, "boxYOffset");
		this.anInt3539 = this.method2932(local111, local108, "boxWidth");
		this.anInt3538 = this.method2932(local111, local108, "textYOffset");
		this.anInt3549 = this.method2932(local111, local108, "offsetPerTenCycles");
	}

	@OriginalMember(owner = "client!gfa", name = "a", descriptor = "(B)V")
	@Override
	public void method5715() {
		Static515.method7137();
	}

	@OriginalMember(owner = "client!gfa", name = "b", descriptor = "(B)I")
	@Override
	public int method5716() {
		return 100;
	}

	@OriginalMember(owner = "client!gfa", name = "c", descriptor = "(I)V")
	private void method2930() {
		Static223.method3501(Static527.aClass175_1.method3945(), Static527.aClass175_1.method3947(), Static530.aColorArray4[Static259.anInt4808], Static144.aColorArray1[Static259.anInt4808], Static394.aColorArray3[Static259.anInt4808]);
	}

	@OriginalMember(owner = "client!gfa", name = "a", descriptor = "(I)V")
	@Override
	public void method5714() {
	}

	@OriginalMember(owner = "client!gfa", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method5713(@OriginalArg(1) boolean arg0) {
		if (!this.aBoolean293) {
			if (Static562.anApplet2 == null) {
				this.aBoolean293 = true;
			} else if (this.aFont2 == null) {
				try {
					this.method2928();
				} catch (@Pc(18) Exception local18) {
					this.aBoolean293 = true;
				}
			}
		}
		if (this.aBoolean293) {
			this.method2930();
			return;
		}
		@Pc(42) Graphics local42 = Static471.aCanvas12.getGraphics();
		if (local42 == null) {
			Static471.aCanvas12.repaint();
			return;
		}
		try {
			@Pc(51) int local51 = Static527.aClass175_1.method3947();
			@Pc(55) String local55 = Static527.aClass175_1.method3945();
			if (Static82.anImage1 == null) {
				Static82.anImage1 = Static471.aCanvas12.createImage(Static140.anInt2937, Static120.anInt2371);
			}
			@Pc(65) Graphics local65 = Static82.anImage1.getGraphics();
			@Pc(70) int local70 = this.anImage7.getWidth(null);
			@Pc(75) int local75 = this.anImage4.getWidth(null);
			@Pc(80) int local80 = this.anImage10.getWidth(null);
			@Pc(85) int local85 = this.anImage7.getHeight(null);
			@Pc(90) int local90 = this.anImage4.getHeight(null);
			@Pc(95) int local95 = this.anImage10.getHeight(null);
			local65.drawImage(this.anImage7, this.method2927(local70) + this.anInt3540 - this.anInt3539 / 2, this.method2933(local85) + this.anInt3552, null);
			@Pc(130) int local130 = this.anInt3540 + local70 - this.anInt3539 / 2;
			@Pc(141) int local141 = this.anInt3540 + this.anInt3539 / 2 - local75;
			for (@Pc(143) int local143 = local130; local143 <= local141; local143 += local80) {
				local65.drawImage(this.anImage10, this.method2927(local70) + this.anInt3540 + local143, this.method2933(local95) + this.anInt3552, null);
			}
			local65.drawImage(this.anImage4, this.method2927(local75) + this.anInt3540 + this.anInt3539 / 2, this.method2933(local90) + this.anInt3552, null);
			@Pc(210) int local210 = this.anImage12.getWidth(null);
			@Pc(215) int local215 = this.anImage12.getHeight(null);
			@Pc(220) int local220 = this.anImage3.getWidth(null);
			@Pc(225) int local225 = this.anImage3.getHeight(null);
			@Pc(230) int local230 = this.anImage5.getHeight(null);
			@Pc(235) int local235 = this.anImage9.getWidth(null);
			@Pc(240) int local240 = this.anImage9.getHeight(null);
			@Pc(245) int local245 = this.anImage5.getWidth(null);
			@Pc(250) int local250 = this.anImage6.getWidth(null);
			@Pc(255) int local255 = this.anImage8.getWidth(null);
			@Pc(265) int local265 = this.method2927(this.anInt3543) + this.anInt3555;
			@Pc(274) int local274 = this.method2933(this.anInt3554) + this.anInt3537;
			local65.drawImage(this.anImage12, local265, local274 + (this.anInt3554 - local215) / 2, null);
			local65.drawImage(this.anImage3, this.anInt3543 + local265 - local220, (this.anInt3554 + -local225) / 2 + local274, null);
			if (this.anImage11 == null) {
				this.anImage11 = Static471.aCanvas12.createImage(this.anInt3543 - local210 - local220, this.anInt3554);
			}
			@Pc(332) Graphics local332 = this.anImage11.getGraphics();
			for (@Pc(334) int local334 = 0; local334 < this.anInt3543 - local220 - local210; local334 += local235) {
				local332.drawImage(this.anImage9, local334, 0, null);
			}
			for (@Pc(363) int local363 = 0; local363 < this.anInt3543 - local210 - local220; local363 += local245) {
				local332.drawImage(this.anImage5, local363, this.anInt3554 - local230, null);
			}
			@Pc(406) int local406 = local51 * (this.anInt3543 - local210 - local220) / 100;
			@Pc(444) int local444;
			if (local406 > 0) {
				@Pc(423) Image local423 = Static471.aCanvas12.createImage(local406, this.anInt3554 - local230 - local240);
				@Pc(427) int local427 = local423.getWidth(null);
				@Pc(430) Graphics local430 = local423.getGraphics();
				@Pc(440) int local440 = this.anInt3549 * Static504.method7010() / 10 % local250;
				for (local444 = local440 - local250; local444 < local427; local444 += local250) {
					local430.drawImage(this.anImage6, local444, 0, null);
				}
				local332.drawImage(local423, 0, local240, null);
			}
			@Pc(474) int local474 = local406;
			local406 = this.anInt3543 - local220 - local210 - local406;
			if (local406 > 0) {
				@Pc(500) Image local500 = Static471.aCanvas12.createImage(local406, this.anInt3554 - local230 - local240);
				@Pc(504) int local504 = local500.getWidth(null);
				@Pc(507) Graphics local507 = local500.getGraphics();
				for (local444 = 0; local444 < local504; local444 += local255) {
					local507.drawImage(this.anImage8, local444, 0, null);
				}
				local332.drawImage(local500, local474, local240, null);
			}
			local65.drawImage(this.anImage11, local210 + local265, local274, null);
			local65.setFont(this.aFont2);
			local65.setColor(this.aColor1);
			local65.drawString(local55, (this.anInt3543 - this.aFontMetrics1.stringWidth(local55)) / 2 + local265, this.anInt3554 / 2 + local274 - -this.anInt3538 + 4);
			local42.drawImage(Static82.anImage1, 0, 0, null);
		} catch (@Pc(587) Exception local587) {
			this.aBoolean293 = true;
		}
	}

	@OriginalMember(owner = "client!gfa", name = "a", descriptor = "(Ljava/lang/Class;Ljava/lang/Object;Ljava/lang/String;I)I")
	private int method2932(@OriginalArg(0) Class arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) String arg2) throws IllegalAccessException, NoSuchFieldException {
		@Pc(13) Field local13 = arg0.getDeclaredField(arg2);
		return local13.getInt(arg1);
	}

	@OriginalMember(owner = "client!gfa", name = "a", descriptor = "(IB)I")
	private int method2933(@OriginalArg(0) int arg0) {
		return this.aBoolean294 ? (Static120.anInt2371 - arg0) / 2 : 0;
	}

	@OriginalMember(owner = "client!gfa", name = "a", descriptor = "(Ljava/lang/Class;Ljava/lang/Object;ZLjava/lang/String;)Z")
	private boolean method2934(@OriginalArg(0) Class arg0, @OriginalArg(1) Object arg1, @OriginalArg(3) String arg2) throws IllegalAccessException, NoSuchFieldException {
		@Pc(12) Field local12 = arg0.getDeclaredField(arg2);
		return local12.getBoolean(arg1);
	}

	@OriginalMember(owner = "client!gfa", name = "a", descriptor = "(BLjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;")
	private Object method2935(@OriginalArg(1) String arg0, @OriginalArg(2) Class arg1) throws IllegalAccessException, NoSuchFieldException {
		@Pc(12) Field local12 = arg1.getDeclaredField(arg0);
		@Pc(16) Object local16 = local12.get(Static562.anApplet2);
		local12.set(Static562.anApplet2, null);
		return local16;
	}

	@OriginalMember(owner = "client!gfa", name = "c", descriptor = "(B)I")
	@Override
	public int method5718() {
		return 0;
	}
}
