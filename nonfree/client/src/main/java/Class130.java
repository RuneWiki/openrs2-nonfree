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

@OriginalClass("client!gu")
public final class Class130 implements Interface15 {

	@OriginalMember(owner = "client!gu", name = "b", descriptor = "Ljava/awt/Image;")
	private Image anImage3;

	@OriginalMember(owner = "client!gu", name = "c", descriptor = "Ljava/awt/Image;")
	private Image anImage4;

	@OriginalMember(owner = "client!gu", name = "f", descriptor = "Ljava/awt/Image;")
	private Image anImage5;

	@OriginalMember(owner = "client!gu", name = "g", descriptor = "Ljava/awt/Image;")
	private Image anImage6;

	@OriginalMember(owner = "client!gu", name = "h", descriptor = "I")
	private int anInt3721;

	@OriginalMember(owner = "client!gu", name = "i", descriptor = "Z")
	private boolean aBoolean273;

	@OriginalMember(owner = "client!gu", name = "k", descriptor = "Ljava/awt/Image;")
	private Image anImage7;

	@OriginalMember(owner = "client!gu", name = "l", descriptor = "Ljava/awt/Image;")
	private Image anImage8;

	@OriginalMember(owner = "client!gu", name = "m", descriptor = "I")
	private int anInt3723;

	@OriginalMember(owner = "client!gu", name = "n", descriptor = "Ljava/awt/FontMetrics;")
	private FontMetrics aFontMetrics1;

	@OriginalMember(owner = "client!gu", name = "o", descriptor = "Ljava/awt/Image;")
	private Image anImage9;

	@OriginalMember(owner = "client!gu", name = "p", descriptor = "I")
	private int anInt3724;

	@OriginalMember(owner = "client!gu", name = "r", descriptor = "Ljava/awt/Font;")
	private Font aFont3;

	@OriginalMember(owner = "client!gu", name = "s", descriptor = "Z")
	private boolean aBoolean274;

	@OriginalMember(owner = "client!gu", name = "u", descriptor = "I")
	private int anInt3727;

	@OriginalMember(owner = "client!gu", name = "w", descriptor = "I")
	private int anInt3729;

	@OriginalMember(owner = "client!gu", name = "A", descriptor = "Ljava/awt/Image;")
	private Image anImage10;

	@OriginalMember(owner = "client!gu", name = "C", descriptor = "I")
	private int anInt3734;

	@OriginalMember(owner = "client!gu", name = "D", descriptor = "I")
	private int anInt3735;

	@OriginalMember(owner = "client!gu", name = "E", descriptor = "I")
	private int anInt3736;

	@OriginalMember(owner = "client!gu", name = "I", descriptor = "Ljava/awt/Image;")
	private Image anImage11;

	@OriginalMember(owner = "client!gu", name = "J", descriptor = "I")
	private int anInt3740;

	@OriginalMember(owner = "client!gu", name = "M", descriptor = "Ljava/awt/Color;")
	private Color aColor1;

	@OriginalMember(owner = "client!gu", name = "N", descriptor = "Ljava/awt/Image;")
	private Image anImage12;

	@OriginalMember(owner = "client!gu", name = "P", descriptor = "Z")
	private boolean aBoolean275;

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(Ljava/lang/Object;Ljava/lang/Class;ILjava/lang/String;)Z")
	private boolean method2937(@OriginalArg(0) Object arg0, @OriginalArg(1) Class arg1, @OriginalArg(3) String arg2) throws IllegalAccessException, NoSuchFieldException {
		@Pc(7) Field local7 = arg1.getDeclaredField(arg2);
		return local7.getBoolean(arg0);
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(Z)I")
	@Override
	public int method8255() {
		return 0;
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(BZ)V")
	@Override
	public void method8256(@OriginalArg(1) boolean arg0) {
		if (!this.aBoolean274) {
			if (Static589.anApplet2 == null) {
				this.aBoolean274 = true;
			} else if (this.aFont3 == null) {
				try {
					this.method2943();
				} catch (@Pc(23) Exception local23) {
					this.aBoolean274 = true;
				}
			}
		}
		if (this.aBoolean274) {
			this.method2944();
			return;
		}
		@Pc(45) Graphics local45 = Static201.aCanvas7.getGraphics();
		if (local45 == null) {
			Static201.aCanvas7.repaint();
			return;
		}
		try {
			@Pc(51) int local51 = Static521.aClass258_1.method5983();
			@Pc(55) String local55 = Static521.aClass258_1.method5978();
			if (Static279.anImage13 == null) {
				Static279.anImage13 = Static201.aCanvas7.createImage(Static123.anInt9150, Static71.anInt1872);
			}
			@Pc(65) Graphics local65 = Static279.anImage13.getGraphics();
			@Pc(70) int local70 = this.anImage3.getWidth(null);
			@Pc(75) int local75 = this.anImage12.getWidth(null);
			@Pc(80) int local80 = this.anImage7.getWidth(null);
			@Pc(85) int local85 = this.anImage3.getHeight(null);
			@Pc(90) int local90 = this.anImage12.getHeight(null);
			@Pc(95) int local95 = this.anImage7.getHeight(null);
			local65.drawImage(this.anImage3, this.method2945(local70) + this.anInt3735 - this.anInt3724 / 2, this.method2941(local85) + this.anInt3734, null);
			@Pc(133) int local133 = this.anInt3735 + local70 - this.anInt3724 / 2;
			@Pc(142) int local142 = this.anInt3735 + this.anInt3724 / 2;
			for (@Pc(144) int local144 = local133; local144 <= local142; local144 += local80) {
				local65.drawImage(this.anImage7, this.method2945(local70) + this.anInt3735 + local144, this.method2941(local95) + this.anInt3734, null);
			}
			local65.drawImage(this.anImage12, this.method2945(local75) + this.anInt3735 + this.anInt3724 / 2, this.method2941(local90) - -this.anInt3734, null);
			@Pc(213) int local213 = this.anImage10.getWidth(null);
			@Pc(218) int local218 = this.anImage10.getHeight(null);
			@Pc(223) int local223 = this.anImage11.getWidth(null);
			@Pc(228) int local228 = this.anImage11.getHeight(null);
			@Pc(233) int local233 = this.anImage6.getHeight(null);
			@Pc(238) int local238 = this.anImage5.getWidth(null);
			@Pc(243) int local243 = this.anImage5.getHeight(null);
			@Pc(248) int local248 = this.anImage6.getWidth(null);
			@Pc(253) int local253 = this.anImage4.getWidth(null);
			@Pc(258) int local258 = this.anImage8.getWidth(null);
			@Pc(267) int local267 = this.method2945(this.anInt3740) + this.anInt3727;
			@Pc(277) int local277 = this.method2941(this.anInt3721) + this.anInt3729;
			local65.drawImage(this.anImage10, local267, (this.anInt3721 - local218) / 2 + local277, null);
			local65.drawImage(this.anImage11, this.anInt3740 + local267 - local223, local277 - -((-local228 + this.anInt3721) / 2), null);
			if (this.anImage9 == null) {
				this.anImage9 = Static201.aCanvas7.createImage(this.anInt3740 - local223 - local213, this.anInt3721);
			}
			@Pc(337) Graphics local337 = this.anImage9.getGraphics();
			for (@Pc(339) int local339 = 0; local339 < this.anInt3740 - local223 - local213; local339 += local238) {
				local337.drawImage(this.anImage5, local339, 0, null);
			}
			for (@Pc(368) int local368 = 0; local368 < this.anInt3740 - local213 - local223; local368 += local248) {
				local337.drawImage(this.anImage6, local368, this.anInt3721 - local233, null);
			}
			@Pc(412) int local412 = local51 * (this.anInt3740 - local223 - local213) / 100;
			@Pc(449) int local449;
			if (local412 > 0) {
				@Pc(427) Image local427 = Static201.aCanvas7.createImage(local412, this.anInt3721 - local243 - local233);
				@Pc(431) int local431 = local427.getWidth(null);
				@Pc(434) Graphics local434 = local427.getGraphics();
				@Pc(444) int local444 = this.anInt3723 * Static67.method1486() / 10 % local253;
				for (local449 = local444 - local253; local449 < local431; local449 += local253) {
					local434.drawImage(this.anImage4, local449, 0, null);
				}
				local337.drawImage(local427, 0, local243, null);
			}
			@Pc(475) int local475 = local412;
			local412 = this.anInt3740 - local223 - local213 - local412;
			if (local412 > 0) {
				@Pc(500) Image local500 = Static201.aCanvas7.createImage(local412, this.anInt3721 - local233 - local243);
				@Pc(504) int local504 = local500.getWidth(null);
				@Pc(507) Graphics local507 = local500.getGraphics();
				for (local449 = 0; local449 < local504; local449 += local258) {
					local507.drawImage(this.anImage8, local449, 0, null);
				}
				local337.drawImage(local500, local475, local243, null);
			}
			local65.drawImage(this.anImage9, local267 + local213, local277, null);
			local65.setFont(this.aFont3);
			local65.setColor(this.aColor1);
			local65.drawString(local55, local267 + (this.anInt3740 - this.aFontMetrics1.stringWidth(local55)) / 2, this.anInt3736 + this.anInt3721 / 2 + local277 + 4);
			local45.drawImage(Static279.anImage13, 0, 0, null);
		} catch (@Pc(586) Exception local586) {
			this.aBoolean274 = true;
		}
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(B)V")
	@Override
	public void method8258() {
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(I)I")
	@Override
	public int method8259() {
		return 100;
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Object;BLjava/lang/Class;)I")
	private int method2940(@OriginalArg(0) String arg0, @OriginalArg(1) Object arg1, @OriginalArg(3) Class arg2) throws IllegalAccessException, NoSuchFieldException {
		@Pc(13) Field local13 = arg2.getDeclaredField(arg0);
		return local13.getInt(arg1);
	}

	@OriginalMember(owner = "client!gu", name = "b", descriptor = "(I)V")
	@Override
	public void method8260() {
		Static250.method3979();
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(II)I")
	private int method2941(@OriginalArg(0) int arg0) {
		return this.aBoolean275 ? (Static71.anInt1872 - arg0) / 2 : 0;
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;")
	private Object method2942(@OriginalArg(1) String arg0, @OriginalArg(2) Class arg1) throws IllegalAccessException, NoSuchFieldException {
		@Pc(13) Field local13 = arg1.getDeclaredField(arg0);
		@Pc(17) Object local17 = local13.get(Static589.anApplet2);
		local13.set(Static589.anApplet2, null);
		return local17;
	}

	@OriginalMember(owner = "client!gu", name = "c", descriptor = "(I)V")
	private void method2943() throws IllegalAccessException, NoSuchFieldException {
		@Pc(6) Class local6 = Static589.anApplet2.getClass();
		this.anImage4 = (Image) this.method2942("bar", local6);
		this.anImage8 = (Image) this.method2942("background", local6);
		this.anImage10 = (Image) this.method2942("left", local6);
		this.anImage11 = (Image) this.method2942("right", local6);
		this.anImage5 = (Image) this.method2942("top", local6);
		this.anImage6 = (Image) this.method2942("bottom", local6);
		this.anImage3 = (Image) this.method2942("bodyLeft", local6);
		this.anImage12 = (Image) this.method2942("bodyRight", local6);
		this.anImage7 = (Image) this.method2942("bodyFill", local6);
		this.aFont3 = (Font) this.method2942("bf", local6);
		this.aFontMetrics1 = (FontMetrics) this.method2942("bfm", local6);
		this.aColor1 = (Color) this.method2942("colourtext", local6);
		@Pc(116) Object local116 = this.method2942("lb", local6);
		@Pc(119) Class local119 = local116.getClass();
		this.aBoolean273 = this.method2937(local116, local119, "xMiddle");
		this.aBoolean275 = this.method2937(local116, local119, "yMiddle");
		this.anInt3727 = this.method2940("xOffset", local116, local119);
		this.anInt3729 = this.method2940("yOffset", local116, local119);
		this.anInt3740 = this.method2940("width", local116, local119);
		this.anInt3721 = this.method2940("height", local116, local119);
		this.anInt3735 = this.method2940("boxXOffset", local116, local119);
		this.anInt3734 = this.method2940("boxYOffset", local116, local119);
		this.anInt3724 = this.method2940("boxWidth", local116, local119);
		this.anInt3736 = this.method2940("textYOffset", local116, local119);
		this.anInt3723 = this.method2940("offsetPerTenCycles", local116, local119);
	}

	@OriginalMember(owner = "client!gu", name = "d", descriptor = "(I)V")
	private void method2944() {
		Static520.method8290(Static590.aColorArray4[Static484.anInt9199], Static331.aColorArray3[Static484.anInt9199], Static283.aColorArray1[Static484.anInt9199], Static521.aClass258_1.method5983(), Static521.aClass258_1.method5978());
	}

	@OriginalMember(owner = "client!gu", name = "b", descriptor = "(II)I")
	private int method2945(@OriginalArg(1) int arg0) {
		return this.aBoolean273 ? (Static123.anInt9150 - arg0) / 2 : 0;
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(JB)Z")
	@Override
	public boolean method8257(@OriginalArg(0) long arg0) {
		return true;
	}
}
