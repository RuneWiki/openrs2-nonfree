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

@OriginalClass("client!b")
public final class Class22 implements Interface8 {

	@OriginalMember(owner = "client!b", name = "a", descriptor = "Ljava/awt/Image;")
	private Image anImage2;

	@OriginalMember(owner = "client!b", name = "b", descriptor = "Ljava/awt/Font;")
	private Font aFont3;

	@OriginalMember(owner = "client!b", name = "c", descriptor = "I")
	private int anInt644;

	@OriginalMember(owner = "client!b", name = "d", descriptor = "Ljava/awt/Image;")
	private Image anImage3;

	@OriginalMember(owner = "client!b", name = "h", descriptor = "Ljava/awt/Image;")
	private Image anImage4;

	@OriginalMember(owner = "client!b", name = "i", descriptor = "Ljava/awt/Image;")
	private Image anImage5;

	@OriginalMember(owner = "client!b", name = "k", descriptor = "Z")
	private boolean aBoolean50;

	@OriginalMember(owner = "client!b", name = "l", descriptor = "Ljava/awt/Color;")
	private Color aColor1;

	@OriginalMember(owner = "client!b", name = "p", descriptor = "I")
	private int anInt652;

	@OriginalMember(owner = "client!b", name = "r", descriptor = "I")
	private int anInt653;

	@OriginalMember(owner = "client!b", name = "s", descriptor = "Z")
	private boolean aBoolean51;

	@OriginalMember(owner = "client!b", name = "t", descriptor = "Ljava/awt/FontMetrics;")
	private FontMetrics aFontMetrics1;

	@OriginalMember(owner = "client!b", name = "u", descriptor = "I")
	private int anInt654;

	@OriginalMember(owner = "client!b", name = "x", descriptor = "I")
	private int anInt657;

	@OriginalMember(owner = "client!b", name = "y", descriptor = "Ljava/awt/Image;")
	private Image anImage6;

	@OriginalMember(owner = "client!b", name = "z", descriptor = "Ljava/awt/Image;")
	private Image anImage7;

	@OriginalMember(owner = "client!b", name = "A", descriptor = "Ljava/awt/Image;")
	private Image anImage8;

	@OriginalMember(owner = "client!b", name = "B", descriptor = "Z")
	private boolean aBoolean52;

	@OriginalMember(owner = "client!b", name = "E", descriptor = "I")
	private int anInt660;

	@OriginalMember(owner = "client!b", name = "F", descriptor = "Ljava/awt/Image;")
	private Image anImage9;

	@OriginalMember(owner = "client!b", name = "G", descriptor = "I")
	private int anInt661;

	@OriginalMember(owner = "client!b", name = "H", descriptor = "I")
	private int anInt662;

	@OriginalMember(owner = "client!b", name = "J", descriptor = "I")
	private int anInt664;

	@OriginalMember(owner = "client!b", name = "L", descriptor = "Ljava/awt/Image;")
	private Image anImage10;

	@OriginalMember(owner = "client!b", name = "M", descriptor = "Ljava/awt/Image;")
	private Image anImage11;

	@OriginalMember(owner = "client!b", name = "b", descriptor = "(I)V")
	private void method517() throws IllegalAccessException, NoSuchFieldException {
		@Pc(6) Class local6 = Static617.anApplet2.getClass();
		this.anImage3 = (Image) this.method523(local6, "bar");
		this.anImage5 = (Image) this.method523(local6, "background");
		this.anImage7 = (Image) this.method523(local6, "left");
		this.anImage4 = (Image) this.method523(local6, "right");
		this.anImage9 = (Image) this.method523(local6, "top");
		this.anImage2 = (Image) this.method523(local6, "bottom");
		this.anImage6 = (Image) this.method523(local6, "bodyLeft");
		this.anImage10 = (Image) this.method523(local6, "bodyRight");
		this.anImage11 = (Image) this.method523(local6, "bodyFill");
		this.aFont3 = (Font) this.method523(local6, "bf");
		this.aFontMetrics1 = (FontMetrics) this.method523(local6, "bfm");
		this.aColor1 = (Color) this.method523(local6, "colourtext");
		@Pc(108) Object local108 = this.method523(local6, "lb");
		@Pc(117) Class local117 = local108.getClass();
		this.aBoolean50 = this.method524("xMiddle", local108, local117);
		this.aBoolean51 = this.method524("yMiddle", local108, local117);
		this.anInt652 = this.method519(local108, local117, "xOffset");
		this.anInt644 = this.method519(local108, local117, "yOffset");
		this.anInt657 = this.method519(local108, local117, "width");
		this.anInt660 = this.method519(local108, local117, "height");
		this.anInt661 = this.method519(local108, local117, "boxXOffset");
		this.anInt664 = this.method519(local108, local117, "boxYOffset");
		this.anInt662 = this.method519(local108, local117, "boxWidth");
		this.anInt653 = this.method519(local108, local117, "textYOffset");
		this.anInt654 = this.method519(local108, local117, "offsetPerTenCycles");
	}

	@OriginalMember(owner = "client!b", name = "d", descriptor = "(B)V")
	private void method518() {
		Static507.method7151(Static514.aColorArray3[Static295.anInt4833], Static77.aClass252_2.method5491(), Static77.aClass252_2.method5485(), Static457.aColorArray2[Static295.anInt4833], Static292.aColorArray1[Static295.anInt4833]);
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(Ljava/lang/Object;BLjava/lang/Class;Ljava/lang/String;)I")
	private int method519(@OriginalArg(0) Object arg0, @OriginalArg(2) Class arg1, @OriginalArg(3) String arg2) throws IllegalAccessException, NoSuchFieldException {
		@Pc(15) Field local15 = arg1.getDeclaredField(arg2);
		return local15.getInt(arg0);
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(ZI)V")
	@Override
	public void method8061(@OriginalArg(0) boolean arg0) {
		if (!this.aBoolean52) {
			if (Static617.anApplet2 == null) {
				this.aBoolean52 = true;
			} else if (this.aFont3 == null) {
				try {
					this.method517();
				} catch (@Pc(14) Exception local14) {
					this.aBoolean52 = true;
				}
			}
		}
		if (this.aBoolean52) {
			this.method518();
			return;
		}
		@Pc(44) Graphics local44 = Static504.aCanvas11.getGraphics();
		if (local44 == null) {
			Static504.aCanvas11.repaint();
			return;
		}
		try {
			@Pc(53) int local53 = Static77.aClass252_2.method5485();
			@Pc(57) String local57 = Static77.aClass252_2.method5491();
			if (Static3.anImage17 == null) {
				Static3.anImage17 = Static504.aCanvas11.createImage(Static511.anInt8548, Static153.anInt2747);
			}
			@Pc(67) Graphics local67 = Static3.anImage17.getGraphics();
			@Pc(72) int local72 = this.anImage6.getWidth(null);
			@Pc(77) int local77 = this.anImage10.getWidth(null);
			@Pc(82) int local82 = this.anImage11.getWidth(null);
			@Pc(87) int local87 = this.anImage6.getHeight(null);
			@Pc(92) int local92 = this.anImage10.getHeight(null);
			@Pc(97) int local97 = this.anImage11.getHeight(null);
			local67.drawImage(this.anImage6, this.method522(local72) + this.anInt661 - this.anInt662 / 2, this.method521(local87) + this.anInt664, null);
			@Pc(135) int local135 = this.anInt661 + local72 - this.anInt662 / 2;
			@Pc(143) int local143 = this.anInt662 / 2 + this.anInt661;
			for (@Pc(145) int local145 = local135; local145 <= local143; local145 += local82) {
				local67.drawImage(this.anImage11, this.method522(local72) + this.anInt661 + local145, this.method521(local97) - -this.anInt664, null);
			}
			local67.drawImage(this.anImage10, this.method522(local77) + this.anInt661 + this.anInt662 / 2, this.method521(local92) + this.anInt664, null);
			@Pc(209) int local209 = this.anImage7.getWidth(null);
			@Pc(214) int local214 = this.anImage7.getHeight(null);
			@Pc(219) int local219 = this.anImage4.getWidth(null);
			@Pc(224) int local224 = this.anImage4.getHeight(null);
			@Pc(229) int local229 = this.anImage2.getHeight(null);
			@Pc(234) int local234 = this.anImage9.getWidth(null);
			@Pc(239) int local239 = this.anImage9.getHeight(null);
			@Pc(244) int local244 = this.anImage2.getWidth(null);
			@Pc(249) int local249 = this.anImage3.getWidth(null);
			@Pc(254) int local254 = this.anImage5.getWidth(null);
			@Pc(263) int local263 = this.method522(this.anInt657) + this.anInt652;
			@Pc(272) int local272 = this.method521(this.anInt660) + this.anInt644;
			local67.drawImage(this.anImage7, local263, local272 + (this.anInt660 - local214) / 2, null);
			local67.drawImage(this.anImage4, this.anInt657 + local263 - local219, (this.anInt660 + -local224) / 2 + local272, null);
			if (this.anImage8 == null) {
				this.anImage8 = Static504.aCanvas11.createImage(this.anInt657 - local219 - local209, this.anInt660);
			}
			@Pc(332) Graphics local332 = this.anImage8.getGraphics();
			for (@Pc(334) int local334 = 0; local334 < this.anInt657 - local219 - local209; local334 += local234) {
				local332.drawImage(this.anImage9, local334, 0, null);
			}
			for (@Pc(360) int local360 = 0; local360 < this.anInt657 - local209 - local219; local360 += local244) {
				local332.drawImage(this.anImage2, local360, this.anInt660 - local229, null);
			}
			@Pc(396) int local396 = (this.anInt657 - local209 - local219) * local53 / 100;
			@Pc(432) int local432;
			if (local396 > 0) {
				@Pc(410) Image local410 = Static504.aCanvas11.createImage(local396, this.anInt660 - local239 - local229);
				@Pc(414) int local414 = local410.getWidth(null);
				@Pc(417) Graphics local417 = local410.getGraphics();
				@Pc(427) int local427 = this.anInt654 * Static513.method7196() / 10 % local249;
				for (local432 = local427 - local249; local432 < local414; local432 += local249) {
					local417.drawImage(this.anImage3, local432, 0, null);
				}
				local332.drawImage(local410, 0, local239, null);
			}
			@Pc(462) int local462 = local396;
			local396 = this.anInt657 - local209 - local219 - local396;
			if (local396 > 0) {
				@Pc(485) Image local485 = Static504.aCanvas11.createImage(local396, this.anInt660 - local229 - local239);
				@Pc(489) int local489 = local485.getWidth(null);
				@Pc(492) Graphics local492 = local485.getGraphics();
				for (local432 = 0; local432 < local489; local432 += local254) {
					local492.drawImage(this.anImage5, local432, 0, null);
				}
				local332.drawImage(local485, local462, local239, null);
			}
			local67.drawImage(this.anImage8, local263 + local209, local272, null);
			local67.setFont(this.aFont3);
			local67.setColor(this.aColor1);
			local67.drawString(local57, local263 + (this.anInt657 - this.aFontMetrics1.stringWidth(local57)) / 2, local272 + this.anInt660 / 2 + 4 + this.anInt653);
			local44.drawImage(Static3.anImage17, 0, 0, null);
		} catch (@Pc(572) Exception local572) {
			this.aBoolean52 = true;
		}
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(I)I")
	@Override
	public int method8058() {
		return 0;
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(BI)I")
	private int method521(@OriginalArg(1) int arg0) {
		return this.aBoolean51 ? (Static153.anInt2747 - arg0) / 2 : 0;
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(II)I")
	private int method522(@OriginalArg(1) int arg0) {
		return this.aBoolean50 ? (Static511.anInt8548 - arg0) / 2 : 0;
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(BLjava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;")
	private Object method523(@OriginalArg(1) Class arg0, @OriginalArg(2) String arg1) throws IllegalAccessException, NoSuchFieldException {
		@Pc(12) Field local12 = arg0.getDeclaredField(arg1);
		@Pc(16) Object local16 = local12.get(Static617.anApplet2);
		local12.set(Static617.anApplet2, null);
		return local16;
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/Object;Ljava/lang/Class;)Z")
	private boolean method524(@OriginalArg(0) String arg0, @OriginalArg(2) Object arg1, @OriginalArg(3) Class arg2) throws IllegalAccessException, NoSuchFieldException {
		@Pc(12) Field local12 = arg2.getDeclaredField(arg0);
		return local12.getBoolean(arg1);
	}

	@OriginalMember(owner = "client!b", name = "b", descriptor = "(B)V")
	@Override
	public void method8059() {
		Static127.method1799();
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(B)I")
	@Override
	public int method8057() {
		return 100;
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(JI)Z")
	@Override
	public boolean method8056(@OriginalArg(0) long arg0) {
		return true;
	}

	@OriginalMember(owner = "client!b", name = "c", descriptor = "(B)V")
	@Override
	public void method8060() {
	}
}
