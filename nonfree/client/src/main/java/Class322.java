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

@OriginalClass("client!tv")
public final class Class322 implements Interface14 {

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "Ljava/awt/Font;")
	private Font aFont2;

	@OriginalMember(owner = "client!tv", name = "b", descriptor = "I")
	private int anInt9313;

	@OriginalMember(owner = "client!tv", name = "d", descriptor = "Ljava/awt/Image;")
	private Image anImage4;

	@OriginalMember(owner = "client!tv", name = "e", descriptor = "I")
	private int anInt9315;

	@OriginalMember(owner = "client!tv", name = "f", descriptor = "I")
	private int anInt9316;

	@OriginalMember(owner = "client!tv", name = "g", descriptor = "Ljava/awt/Image;")
	private Image anImage5;

	@OriginalMember(owner = "client!tv", name = "h", descriptor = "I")
	private int anInt9317;

	@OriginalMember(owner = "client!tv", name = "i", descriptor = "Ljava/awt/Image;")
	private Image anImage6;

	@OriginalMember(owner = "client!tv", name = "j", descriptor = "Ljava/awt/Image;")
	private Image anImage7;

	@OriginalMember(owner = "client!tv", name = "k", descriptor = "Z")
	private boolean aBoolean650;

	@OriginalMember(owner = "client!tv", name = "p", descriptor = "Z")
	private boolean aBoolean651;

	@OriginalMember(owner = "client!tv", name = "q", descriptor = "I")
	private int anInt9322;

	@OriginalMember(owner = "client!tv", name = "r", descriptor = "Ljava/awt/Image;")
	private Image anImage8;

	@OriginalMember(owner = "client!tv", name = "s", descriptor = "Z")
	private boolean aBoolean652;

	@OriginalMember(owner = "client!tv", name = "v", descriptor = "Ljava/awt/Image;")
	private Image anImage9;

	@OriginalMember(owner = "client!tv", name = "y", descriptor = "Ljava/awt/Image;")
	private Image anImage10;

	@OriginalMember(owner = "client!tv", name = "z", descriptor = "Ljava/awt/Color;")
	private Color aColor1;

	@OriginalMember(owner = "client!tv", name = "A", descriptor = "I")
	private int anInt9327;

	@OriginalMember(owner = "client!tv", name = "B", descriptor = "I")
	private int anInt9328;

	@OriginalMember(owner = "client!tv", name = "C", descriptor = "Ljava/awt/FontMetrics;")
	private FontMetrics aFontMetrics1;

	@OriginalMember(owner = "client!tv", name = "D", descriptor = "Ljava/awt/Image;")
	private Image anImage11;

	@OriginalMember(owner = "client!tv", name = "H", descriptor = "I")
	private int anInt9331;

	@OriginalMember(owner = "client!tv", name = "K", descriptor = "Ljava/awt/Image;")
	private Image anImage12;

	@OriginalMember(owner = "client!tv", name = "M", descriptor = "I")
	private int anInt9334;

	@OriginalMember(owner = "client!tv", name = "Q", descriptor = "Ljava/awt/Image;")
	private Image anImage13;

	@OriginalMember(owner = "client!tv", name = "d", descriptor = "(I)V")
	private void method7599() throws IllegalAccessException, NoSuchFieldException {
		@Pc(6) Class local6 = Static110.anApplet1.getClass();
		this.anImage7 = (Image) this.method7602(local6, "bar");
		this.anImage6 = (Image) this.method7602(local6, "background");
		this.anImage10 = (Image) this.method7602(local6, "left");
		this.anImage13 = (Image) this.method7602(local6, "right");
		this.anImage9 = (Image) this.method7602(local6, "top");
		this.anImage11 = (Image) this.method7602(local6, "bottom");
		this.anImage5 = (Image) this.method7602(local6, "bodyLeft");
		this.anImage4 = (Image) this.method7602(local6, "bodyRight");
		this.anImage12 = (Image) this.method7602(local6, "bodyFill");
		this.aFont2 = (Font) this.method7602(local6, "bf");
		this.aFontMetrics1 = (FontMetrics) this.method7602(local6, "bfm");
		this.aColor1 = (Color) this.method7602(local6, "colourtext");
		@Pc(122) Object local122 = this.method7602(local6, "lb");
		@Pc(125) Class local125 = local122.getClass();
		this.aBoolean650 = this.method7607(local122, local125, "xMiddle");
		this.aBoolean651 = this.method7607(local122, local125, "yMiddle");
		this.anInt9317 = this.method7605(local122, local125, "xOffset");
		this.anInt9315 = this.method7605(local122, local125, "yOffset");
		this.anInt9327 = this.method7605(local122, local125, "width");
		this.anInt9331 = this.method7605(local122, local125, "height");
		this.anInt9334 = this.method7605(local122, local125, "boxXOffset");
		this.anInt9316 = this.method7605(local122, local125, "boxYOffset");
		this.anInt9313 = this.method7605(local122, local125, "boxWidth");
		this.anInt9328 = this.method7605(local122, local125, "textYOffset");
		this.anInt9322 = this.method7605(local122, local125, "offsetPerTenCycles");
	}

	@OriginalMember(owner = "client!tv", name = "c", descriptor = "(I)V")
	@Override
	public void method7598() {
		Static466.method7866();
	}

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(BJ)Z")
	@Override
	public boolean method7596(@OriginalArg(1) long arg0) {
		return true;
	}

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(ILjava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;")
	private Object method7602(@OriginalArg(1) Class arg0, @OriginalArg(2) String arg1) throws IllegalAccessException, NoSuchFieldException {
		@Pc(7) Field local7 = arg0.getDeclaredField(arg1);
		@Pc(11) Object local11 = local7.get(Static110.anApplet1);
		local7.set(Static110.anApplet1, null);
		return local11;
	}

	@OriginalMember(owner = "client!tv", name = "f", descriptor = "(I)V")
	private void method7603() {
		Static196.method3381(Static188.aColorArray3[Static179.anInt3619], Static113.aClass282_1.method6821(), Static113.aClass282_1.method6814(), Static46.aColorArray1[Static179.anInt3619], Static128.aColorArray2[Static179.anInt3619]);
	}

	@OriginalMember(owner = "client!tv", name = "b", descriptor = "(I)I")
	@Override
	public int method7594() {
		return 100;
	}

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(BI)I")
	private int method7604(@OriginalArg(1) int arg0) {
		return this.aBoolean650 ? (Static554.anInt9828 - arg0) / 2 : 0;
	}

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;I)I")
	private int method7605(@OriginalArg(0) Object arg0, @OriginalArg(1) Class arg1, @OriginalArg(2) String arg2) throws IllegalAccessException, NoSuchFieldException {
		@Pc(7) Field local7 = arg1.getDeclaredField(arg2);
		return local7.getInt(arg0);
	}

	@OriginalMember(owner = "client!tv", name = "b", descriptor = "(BI)I")
	private int method7606(@OriginalArg(1) int arg0) {
		return this.aBoolean651 ? (Static375.anInt7256 - arg0) / 2 : 0;
	}

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(Z)I")
	@Override
	public int method7597() {
		return 0;
	}

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;B)Z")
	private boolean method7607(@OriginalArg(0) Object arg0, @OriginalArg(1) Class arg1, @OriginalArg(2) String arg2) throws IllegalAccessException, NoSuchFieldException {
		@Pc(15) Field local15 = arg1.getDeclaredField(arg2);
		return local15.getBoolean(arg0);
	}

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(BZ)V")
	@Override
	public void method7595(@OriginalArg(1) boolean arg0) {
		if (!this.aBoolean652) {
			if (Static110.anApplet1 == null) {
				this.aBoolean652 = true;
			} else if (this.aFont2 == null) {
				try {
					this.method7599();
				} catch (@Pc(14) Exception local14) {
					this.aBoolean652 = true;
				}
			}
		}
		if (this.aBoolean652) {
			this.method7603();
			return;
		}
		@Pc(42) Graphics local42 = Static475.aCanvas12.getGraphics();
		if (local42 == null) {
			Static475.aCanvas12.repaint();
			return;
		}
		try {
			@Pc(51) int local51 = Static113.aClass282_1.method6814();
			@Pc(55) String local55 = Static113.aClass282_1.method6821();
			if (Static9.anImage1 == null) {
				Static9.anImage1 = Static475.aCanvas12.createImage(Static554.anInt9828, Static375.anInt7256);
			}
			@Pc(65) Graphics local65 = Static9.anImage1.getGraphics();
			@Pc(70) int local70 = this.anImage5.getWidth(null);
			@Pc(75) int local75 = this.anImage4.getWidth(null);
			@Pc(80) int local80 = this.anImage12.getWidth(null);
			@Pc(85) int local85 = this.anImage5.getHeight(null);
			@Pc(90) int local90 = this.anImage4.getHeight(null);
			@Pc(95) int local95 = this.anImage12.getHeight(null);
			local65.drawImage(this.anImage5, this.method7604(local70) + this.anInt9334 - this.anInt9313 / 2, this.method7606(local85) - -this.anInt9316, null);
			@Pc(134) int local134 = this.anInt9334 + local70 - this.anInt9313 / 2;
			@Pc(142) int local142 = this.anInt9334 + this.anInt9313 / 2;
			for (@Pc(144) int local144 = local134; local144 <= local142; local144 += local80) {
				local65.drawImage(this.anImage12, local144 + this.method7604(local70) + this.anInt9334, this.method7606(local95) + this.anInt9316, null);
			}
			local65.drawImage(this.anImage4, this.method7604(local75) + this.anInt9334 + this.anInt9313 / 2, this.method7606(local90) + this.anInt9316, null);
			@Pc(209) int local209 = this.anImage10.getWidth(null);
			@Pc(214) int local214 = this.anImage10.getHeight(null);
			@Pc(219) int local219 = this.anImage13.getWidth(null);
			@Pc(224) int local224 = this.anImage13.getHeight(null);
			@Pc(229) int local229 = this.anImage11.getHeight(null);
			@Pc(234) int local234 = this.anImage9.getWidth(null);
			@Pc(239) int local239 = this.anImage9.getHeight(null);
			@Pc(244) int local244 = this.anImage11.getWidth(null);
			@Pc(249) int local249 = this.anImage7.getWidth(null);
			@Pc(254) int local254 = this.anImage6.getWidth(null);
			@Pc(263) int local263 = this.method7604(this.anInt9327) + this.anInt9317;
			@Pc(272) int local272 = this.method7606(this.anInt9331) + this.anInt9315;
			local65.drawImage(this.anImage10, local263, local272 + (this.anInt9331 - local214) / 2, null);
			local65.drawImage(this.anImage13, this.anInt9327 + local263 - local219, (this.anInt9331 - local224) / 2 + local272, null);
			if (this.anImage8 == null) {
				this.anImage8 = Static475.aCanvas12.createImage(this.anInt9327 - local219 - local209, this.anInt9331);
			}
			@Pc(331) Graphics local331 = this.anImage8.getGraphics();
			for (@Pc(333) int local333 = 0; local333 < this.anInt9327 - local209 - local219; local333 += local234) {
				local331.drawImage(this.anImage9, local333, 0, null);
			}
			for (@Pc(359) int local359 = 0; local359 < this.anInt9327 - local219 - local209; local359 += local244) {
				local331.drawImage(this.anImage11, local359, this.anInt9331 - local229, null);
			}
			@Pc(399) int local399 = local51 * (this.anInt9327 - local209 - local219) / 100;
			@Pc(434) int local434;
			if (local399 > 0) {
				@Pc(413) Image local413 = Static475.aCanvas12.createImage(local399, this.anInt9331 - local229 - local239);
				@Pc(417) int local417 = local413.getWidth(null);
				@Pc(420) Graphics local420 = local413.getGraphics();
				@Pc(430) int local430 = this.anInt9322 * Static95.method2113() / 10 % local249;
				for (local434 = local430 - local249; local434 < local417; local434 += local249) {
					local420.drawImage(this.anImage7, local434, 0, null);
				}
				local331.drawImage(local413, 0, local239, null);
			}
			@Pc(464) int local464 = local399;
			local399 = this.anInt9327 - local209 - local219 - local399;
			if (local399 > 0) {
				@Pc(493) Image local493 = Static475.aCanvas12.createImage(local399, this.anInt9331 - local229 - local239);
				@Pc(497) int local497 = local493.getWidth(null);
				@Pc(500) Graphics local500 = local493.getGraphics();
				for (local434 = 0; local434 < local497; local434 += local254) {
					local500.drawImage(this.anImage6, local434, 0, null);
				}
				local331.drawImage(local493, local464, local239, null);
			}
			local65.drawImage(this.anImage8, local263 + local209, local272, null);
			local65.setFont(this.aFont2);
			local65.setColor(this.aColor1);
			local65.drawString(local55, local263 + (this.anInt9327 - this.aFontMetrics1.stringWidth(local55)) / 2, this.anInt9328 + local272 - -(this.anInt9331 / 2) + 4);
			local42.drawImage(Static9.anImage1, 0, 0, null);
		} catch (@Pc(581) Exception local581) {
			this.aBoolean652 = true;
		}
	}

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(I)V")
	@Override
	public void method7593() {
	}
}
