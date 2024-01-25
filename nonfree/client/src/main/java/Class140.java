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

@OriginalClass("client!hfa")
public final class Class140 implements Interface12 {

	@OriginalMember(owner = "client!hfa", name = "b", descriptor = "Ljava/awt/Image;")
	private Image anImage1;

	@OriginalMember(owner = "client!hfa", name = "c", descriptor = "Ljava/awt/FontMetrics;")
	private FontMetrics aFontMetrics1;

	@OriginalMember(owner = "client!hfa", name = "d", descriptor = "Ljava/awt/Color;")
	private Color aColor1;

	@OriginalMember(owner = "client!hfa", name = "e", descriptor = "Ljava/awt/Image;")
	private Image anImage2;

	@OriginalMember(owner = "client!hfa", name = "g", descriptor = "Ljava/awt/Image;")
	private Image anImage3;

	@OriginalMember(owner = "client!hfa", name = "h", descriptor = "Ljava/awt/Image;")
	private Image anImage4;

	@OriginalMember(owner = "client!hfa", name = "i", descriptor = "I")
	private int anInt2879;

	@OriginalMember(owner = "client!hfa", name = "k", descriptor = "Ljava/awt/Image;")
	private Image anImage5;

	@OriginalMember(owner = "client!hfa", name = "l", descriptor = "I")
	private int anInt2881;

	@OriginalMember(owner = "client!hfa", name = "n", descriptor = "I")
	private int anInt2883;

	@OriginalMember(owner = "client!hfa", name = "p", descriptor = "I")
	private int anInt2885;

	@OriginalMember(owner = "client!hfa", name = "s", descriptor = "Ljava/awt/Font;")
	private Font aFont1;

	@OriginalMember(owner = "client!hfa", name = "v", descriptor = "I")
	private int anInt2889;

	@OriginalMember(owner = "client!hfa", name = "x", descriptor = "I")
	private int anInt2891;

	@OriginalMember(owner = "client!hfa", name = "z", descriptor = "Ljava/awt/Image;")
	private Image anImage6;

	@OriginalMember(owner = "client!hfa", name = "A", descriptor = "I")
	private int anInt2893;

	@OriginalMember(owner = "client!hfa", name = "D", descriptor = "I")
	private int anInt2895;

	@OriginalMember(owner = "client!hfa", name = "E", descriptor = "Z")
	private boolean aBoolean203;

	@OriginalMember(owner = "client!hfa", name = "G", descriptor = "Z")
	private boolean aBoolean204;

	@OriginalMember(owner = "client!hfa", name = "J", descriptor = "Z")
	private boolean aBoolean205;

	@OriginalMember(owner = "client!hfa", name = "K", descriptor = "Ljava/awt/Image;")
	private Image anImage7;

	@OriginalMember(owner = "client!hfa", name = "L", descriptor = "Ljava/awt/Image;")
	private Image anImage8;

	@OriginalMember(owner = "client!hfa", name = "M", descriptor = "Ljava/awt/Image;")
	private Image anImage9;

	@OriginalMember(owner = "client!hfa", name = "O", descriptor = "Ljava/awt/Image;")
	private Image anImage10;

	@OriginalMember(owner = "client!hfa", name = "R", descriptor = "I")
	private int anInt2901;

	@OriginalMember(owner = "client!hfa", name = "b", descriptor = "(I)V")
	private void method2488() throws IllegalAccessException, NoSuchFieldException {
		@Pc(6) Class local6 = Static195.anApplet4.getClass();
		this.anImage6 = (Image) this.method2492(local6, "bar");
		this.anImage9 = (Image) this.method2492(local6, "background");
		this.anImage5 = (Image) this.method2492(local6, "left");
		this.anImage2 = (Image) this.method2492(local6, "right");
		this.anImage8 = (Image) this.method2492(local6, "top");
		this.anImage1 = (Image) this.method2492(local6, "bottom");
		this.anImage10 = (Image) this.method2492(local6, "bodyLeft");
		this.anImage7 = (Image) this.method2492(local6, "bodyRight");
		this.anImage3 = (Image) this.method2492(local6, "bodyFill");
		this.aFont1 = (Font) this.method2492(local6, "bf");
		this.aFontMetrics1 = (FontMetrics) this.method2492(local6, "bfm");
		this.aColor1 = (Color) this.method2492(local6, "colourtext");
		@Pc(108) Object local108 = this.method2492(local6, "lb");
		@Pc(111) Class local111 = local108.getClass();
		this.aBoolean205 = this.method2499(local111, "xMiddle", local108);
		this.aBoolean204 = this.method2499(local111, "yMiddle", local108);
		this.anInt2893 = this.method2494(local108, "xOffset", local111);
		this.anInt2895 = this.method2494(local108, "yOffset", local111);
		this.anInt2889 = this.method2494(local108, "width", local111);
		this.anInt2891 = this.method2494(local108, "height", local111);
		this.anInt2883 = this.method2494(local108, "boxXOffset", local111);
		this.anInt2879 = this.method2494(local108, "boxYOffset", local111);
		this.anInt2881 = this.method2494(local108, "boxWidth", local111);
		this.anInt2901 = this.method2494(local108, "textYOffset", local111);
		this.anInt2885 = this.method2494(local108, "offsetPerTenCycles", local111);
	}

	@OriginalMember(owner = "client!hfa", name = "a", descriptor = "(B)I")
	@Override
	public int method2482() {
		return 100;
	}

	@OriginalMember(owner = "client!hfa", name = "a", descriptor = "(I)I")
	@Override
	public int method2485() {
		return 0;
	}

	@OriginalMember(owner = "client!hfa", name = "b", descriptor = "(B)V")
	@Override
	public void method2484() {
	}

	@OriginalMember(owner = "client!hfa", name = "a", descriptor = "(II)I")
	private int method2491(@OriginalArg(1) int arg0) {
		return this.aBoolean204 ? (Static187.anInt8962 - arg0) / 2 : 0;
	}

	@OriginalMember(owner = "client!hfa", name = "a", descriptor = "(BLjava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;")
	private Object method2492(@OriginalArg(1) Class arg0, @OriginalArg(2) String arg1) throws IllegalAccessException, NoSuchFieldException {
		@Pc(7) Field local7 = arg0.getDeclaredField(arg1);
		@Pc(11) Object local11 = local7.get(Static195.anApplet4);
		local7.set(Static195.anApplet4, null);
		return local11;
	}

	@OriginalMember(owner = "client!hfa", name = "a", descriptor = "(Z)V")
	@Override
	public void method2487() {
		Static414.method5577();
	}

	@OriginalMember(owner = "client!hfa", name = "b", descriptor = "(II)I")
	private int method2493(@OriginalArg(0) int arg0) {
		return this.aBoolean205 ? (Static172.anInt2621 - arg0) / 2 : 0;
	}

	@OriginalMember(owner = "client!hfa", name = "a", descriptor = "(Ljava/lang/Object;Ljava/lang/String;ILjava/lang/Class;)I")
	private int method2494(@OriginalArg(0) Object arg0, @OriginalArg(1) String arg1, @OriginalArg(3) Class arg2) throws IllegalAccessException, NoSuchFieldException {
		@Pc(12) Field local12 = arg2.getDeclaredField(arg1);
		return local12.getInt(arg0);
	}

	@OriginalMember(owner = "client!hfa", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method2483(@OriginalArg(0) boolean arg0) {
		if (!this.aBoolean203) {
			if (Static195.anApplet4 == null) {
				this.aBoolean203 = true;
			} else if (this.aFont1 == null) {
				try {
					this.method2488();
				} catch (@Pc(18) Exception local18) {
					this.aBoolean203 = true;
				}
			}
		}
		if (this.aBoolean203) {
			this.method2496();
			return;
		}
		@Pc(42) Graphics local42 = Static9.aCanvas1.getGraphics();
		if (local42 == null) {
			Static9.aCanvas1.repaint();
			return;
		}
		try {
			@Pc(51) int local51 = Static573.aClass264_1.method5515();
			@Pc(55) String local55 = Static573.aClass264_1.method5513();
			if (Static290.anImage12 == null) {
				Static290.anImage12 = Static9.aCanvas1.createImage(Static172.anInt2621, Static187.anInt8962);
			}
			@Pc(65) Graphics local65 = Static290.anImage12.getGraphics();
			@Pc(70) int local70 = this.anImage10.getWidth(null);
			@Pc(75) int local75 = this.anImage7.getWidth(null);
			@Pc(80) int local80 = this.anImage3.getWidth(null);
			@Pc(85) int local85 = this.anImage10.getHeight(null);
			@Pc(90) int local90 = this.anImage7.getHeight(null);
			@Pc(95) int local95 = this.anImage3.getHeight(null);
			local65.drawImage(this.anImage10, this.method2493(local70) + this.anInt2883 - this.anInt2881 / 2, this.method2491(local85) + this.anInt2879, null);
			@Pc(130) int local130 = local70 + this.anInt2883 - this.anInt2881 / 2;
			@Pc(138) int local138 = this.anInt2881 / 2 + this.anInt2883;
			for (@Pc(140) int local140 = local130; local140 <= local138; local140 += local80) {
				local65.drawImage(this.anImage3, local140 + this.method2493(local70) + this.anInt2883, this.method2491(local95) - -this.anInt2879, null);
			}
			local65.drawImage(this.anImage7, this.method2493(local75) + this.anInt2883 + this.anInt2881 / 2, this.method2491(local90) - -this.anInt2879, null);
			@Pc(209) int local209 = this.anImage5.getWidth(null);
			@Pc(214) int local214 = this.anImage5.getHeight(null);
			@Pc(219) int local219 = this.anImage2.getWidth(null);
			@Pc(224) int local224 = this.anImage2.getHeight(null);
			@Pc(229) int local229 = this.anImage1.getHeight(null);
			@Pc(234) int local234 = this.anImage8.getWidth(null);
			@Pc(239) int local239 = this.anImage8.getHeight(null);
			@Pc(244) int local244 = this.anImage1.getWidth(null);
			@Pc(249) int local249 = this.anImage6.getWidth(null);
			@Pc(254) int local254 = this.anImage9.getWidth(null);
			@Pc(263) int local263 = this.method2493(this.anInt2889) + this.anInt2893;
			@Pc(273) int local273 = this.method2491(this.anInt2891) + this.anInt2895;
			local65.drawImage(this.anImage5, local263, local273 + (this.anInt2891 - local214) / 2, null);
			local65.drawImage(this.anImage2, local263 + this.anInt2889 - local219, (-local224 + this.anInt2891) / 2 + local273, null);
			if (this.anImage4 == null) {
				this.anImage4 = Static9.aCanvas1.createImage(this.anInt2889 - local219 - local209, this.anInt2891);
			}
			@Pc(332) Graphics local332 = this.anImage4.getGraphics();
			for (@Pc(334) int local334 = 0; local334 < this.anInt2889 - local219 - local209; local334 += local234) {
				local332.drawImage(this.anImage8, local334, 0, null);
			}
			for (@Pc(360) int local360 = 0; local360 < this.anInt2889 - local219 - local209; local360 += local244) {
				local332.drawImage(this.anImage1, local360, this.anInt2891 - local229, null);
			}
			@Pc(400) int local400 = (this.anInt2889 - local209 - local219) * local51 / 100;
			@Pc(435) int local435;
			if (local400 > 0) {
				@Pc(413) Image local413 = Static9.aCanvas1.createImage(local400, this.anInt2891 - local239 - local229);
				@Pc(417) int local417 = local413.getWidth(null);
				@Pc(420) Graphics local420 = local413.getGraphics();
				@Pc(430) int local430 = this.anInt2885 * Static494.method6327() / 10 % local249;
				for (local435 = local430 - local249; local435 < local417; local435 += local249) {
					local420.drawImage(this.anImage6, local435, 0, null);
				}
				local332.drawImage(local413, 0, local239, null);
			}
			@Pc(465) int local465 = local400;
			local400 = this.anInt2889 - local219 - local209 - local400;
			if (local400 > 0) {
				@Pc(493) Image local493 = Static9.aCanvas1.createImage(local400, this.anInt2891 - local229 - local239);
				@Pc(497) int local497 = local493.getWidth(null);
				@Pc(500) Graphics local500 = local493.getGraphics();
				for (local435 = 0; local435 < local497; local435 += local254) {
					local500.drawImage(this.anImage9, local435, 0, null);
				}
				local332.drawImage(local493, local465, local239, null);
			}
			local65.drawImage(this.anImage4, local263 + local209, local273, null);
			local65.setFont(this.aFont1);
			local65.setColor(this.aColor1);
			local65.drawString(local55, (this.anInt2889 - this.aFontMetrics1.stringWidth(local55)) / 2 + local263, local273 + 4 - (-(this.anInt2891 / 2) + -this.anInt2901));
			local42.drawImage(Static290.anImage12, 0, 0, null);
		} catch (@Pc(586) Exception local586) {
			this.aBoolean203 = true;
		}
	}

	@OriginalMember(owner = "client!hfa", name = "d", descriptor = "(B)V")
	private void method2496() {
		Static251.method3588(Static573.aClass264_1.method5513(), Static333.aColorArray1[Static401.anInt6601], Static400.aColorArray2[Static401.anInt6601], Static573.aClass264_1.method5515(), Static560.aColorArray3[Static401.anInt6601]);
	}

	@OriginalMember(owner = "client!hfa", name = "a", descriptor = "(ZJ)Z")
	@Override
	public boolean method2486(@OriginalArg(1) long arg0) {
		return true;
	}

	@OriginalMember(owner = "client!hfa", name = "a", descriptor = "(BLjava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)Z")
	private boolean method2499(@OriginalArg(1) Class arg0, @OriginalArg(2) String arg1, @OriginalArg(3) Object arg2) throws IllegalAccessException, NoSuchFieldException {
		@Pc(13) Field local13 = arg0.getDeclaredField(arg1);
		return local13.getBoolean(arg2);
	}
}
