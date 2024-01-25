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

@OriginalClass("client!ff")
public final class Class101 implements Interface19 {

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "Ljava/awt/Color;")
	private Color aColor1;

	@OriginalMember(owner = "client!ff", name = "b", descriptor = "I")
	private int anInt3123;

	@OriginalMember(owner = "client!ff", name = "c", descriptor = "I")
	private int anInt3124;

	@OriginalMember(owner = "client!ff", name = "e", descriptor = "Ljava/awt/Image;")
	private Image anImage2;

	@OriginalMember(owner = "client!ff", name = "f", descriptor = "Ljava/awt/Image;")
	private Image anImage3;

	@OriginalMember(owner = "client!ff", name = "h", descriptor = "Ljava/awt/Image;")
	private Image anImage4;

	@OriginalMember(owner = "client!ff", name = "l", descriptor = "Ljava/awt/Image;")
	private Image anImage5;

	@OriginalMember(owner = "client!ff", name = "n", descriptor = "I")
	private int anInt3130;

	@OriginalMember(owner = "client!ff", name = "o", descriptor = "Ljava/awt/Image;")
	private Image anImage6;

	@OriginalMember(owner = "client!ff", name = "p", descriptor = "Ljava/awt/FontMetrics;")
	private FontMetrics aFontMetrics1;

	@OriginalMember(owner = "client!ff", name = "q", descriptor = "Ljava/awt/Image;")
	private Image anImage7;

	@OriginalMember(owner = "client!ff", name = "t", descriptor = "Ljava/awt/Image;")
	private Image anImage8;

	@OriginalMember(owner = "client!ff", name = "u", descriptor = "I")
	private int anInt3133;

	@OriginalMember(owner = "client!ff", name = "w", descriptor = "I")
	private int anInt3135;

	@OriginalMember(owner = "client!ff", name = "z", descriptor = "Z")
	private boolean aBoolean241;

	@OriginalMember(owner = "client!ff", name = "B", descriptor = "I")
	private int anInt3137;

	@OriginalMember(owner = "client!ff", name = "E", descriptor = "Ljava/awt/Image;")
	private Image anImage9;

	@OriginalMember(owner = "client!ff", name = "F", descriptor = "Ljava/awt/Image;")
	private Image anImage10;

	@OriginalMember(owner = "client!ff", name = "G", descriptor = "I")
	private int anInt3140;

	@OriginalMember(owner = "client!ff", name = "H", descriptor = "I")
	private int anInt3141;

	@OriginalMember(owner = "client!ff", name = "I", descriptor = "Z")
	private boolean aBoolean242;

	@OriginalMember(owner = "client!ff", name = "L", descriptor = "Ljava/awt/Image;")
	private Image anImage11;

	@OriginalMember(owner = "client!ff", name = "M", descriptor = "Z")
	private boolean aBoolean243;

	@OriginalMember(owner = "client!ff", name = "N", descriptor = "Ljava/awt/Font;")
	private Font aFont1;

	@OriginalMember(owner = "client!ff", name = "O", descriptor = "I")
	private int anInt3144;

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Class;I)Z")
	private boolean method2902(@OriginalArg(0) String arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) Class arg2) throws IllegalAccessException, NoSuchFieldException {
		@Pc(13) Field local13 = arg2.getDeclaredField(arg0);
		return local13.getBoolean(arg1);
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(Z)V")
	@Override
	public void method2897() {
		Static461.method6719();
	}

	@OriginalMember(owner = "client!ff", name = "b", descriptor = "(I)I")
	@Override
	public int method2899() {
		return 100;
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(II)I")
	private int method2905(@OriginalArg(0) int arg0) {
		return this.aBoolean242 ? (Static312.anInt5191 - arg0) / 2 : 0;
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Object;B)I")
	private int method2906(@OriginalArg(0) String arg0, @OriginalArg(1) Class arg1, @OriginalArg(2) Object arg2) throws IllegalAccessException, NoSuchFieldException {
		@Pc(15) Field local15 = arg1.getDeclaredField(arg0);
		return local15.getInt(arg2);
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(Ljava/lang/Class;Ljava/lang/String;I)Ljava/lang/Object;")
	private Object method2907(@OriginalArg(0) Class arg0, @OriginalArg(1) String arg1) throws IllegalAccessException, NoSuchFieldException {
		@Pc(7) Field local7 = arg0.getDeclaredField(arg1);
		@Pc(11) Object local11 = local7.get(Static124.anApplet1);
		local7.set(Static124.anApplet1, (Object) null);
		return local11;
	}

	@OriginalMember(owner = "client!ff", name = "d", descriptor = "(I)V")
	private void method2908() {
		Static38.method1026(Static535.aColorArray2[Static567.anInt5912], Static13.aColorArray1[Static567.anInt5912], Static578.aClass193_1.method4862(), Static578.aClass193_1.method4856(), Static634.aColorArray3[Static567.anInt5912]);
	}

	@OriginalMember(owner = "client!ff", name = "b", descriptor = "(Z)V")
	@Override
	public void method2900() {
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(IB)I")
	private int method2909(@OriginalArg(0) int arg0) {
		return this.aBoolean241 ? (Static222.anInt4196 - arg0) / 2 : 0;
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(IJ)Z")
	@Override
	public boolean method2898(@OriginalArg(1) long arg0) {
		return true;
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(I)I")
	@Override
	public int method2896() {
		return 0;
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method2901(@OriginalArg(1) boolean arg0) {
		if (!this.aBoolean243) {
			if (Static124.anApplet1 == null) {
				this.aBoolean243 = true;
			} else if (this.aFont1 == null) {
				try {
					this.method2910();
				} catch (@Pc(18) Exception local18) {
					this.aBoolean243 = true;
				}
			}
		}
		if (this.aBoolean243) {
			this.method2908();
			return;
		}
		@Pc(40) Graphics local40 = Static126.aCanvas6.getGraphics();
		if (local40 == null) {
			Static126.aCanvas6.repaint();
			return;
		}
		try {
			@Pc(49) int local49 = Static578.aClass193_1.method4856();
			@Pc(53) String local53 = Static578.aClass193_1.method4862();
			if (Static174.anImage12 == null) {
				Static174.anImage12 = Static126.aCanvas6.createImage(Static312.anInt5191, Static222.anInt4196);
			}
			@Pc(63) Graphics local63 = Static174.anImage12.getGraphics();
			local63.clearRect(0, 0, Static312.anInt5191, Static222.anInt4196);
			@Pc(74) int local74 = this.anImage11.getWidth((ImageObserver) null);
			@Pc(79) int local79 = this.anImage5.getWidth((ImageObserver) null);
			@Pc(84) int local84 = this.anImage8.getWidth((ImageObserver) null);
			@Pc(89) int local89 = this.anImage11.getHeight((ImageObserver) null);
			@Pc(94) int local94 = this.anImage5.getHeight((ImageObserver) null);
			@Pc(99) int local99 = this.anImage8.getHeight((ImageObserver) null);
			local63.drawImage(this.anImage11, this.method2905(local74) + this.anInt3141 - this.anInt3133 / 2, this.method2909(local89) - -this.anInt3140, (ImageObserver) null);
			@Pc(137) int local137 = this.anInt3141 + local74 - this.anInt3133 / 2;
			@Pc(145) int local145 = this.anInt3133 / 2 + this.anInt3141;
			for (@Pc(147) int local147 = local137; local147 <= local145; local147 += local84) {
				local63.drawImage(this.anImage8, local147 + this.method2905(local74) + this.anInt3141, this.method2909(local99) + this.anInt3140, (ImageObserver) null);
			}
			local63.drawImage(this.anImage5, this.method2905(local79) + this.anInt3141 + this.anInt3133 / 2, this.method2909(local94) - -this.anInt3140, (ImageObserver) null);
			@Pc(215) int local215 = this.anImage10.getWidth((ImageObserver) null);
			@Pc(220) int local220 = this.anImage10.getHeight((ImageObserver) null);
			@Pc(225) int local225 = this.anImage4.getWidth((ImageObserver) null);
			@Pc(230) int local230 = this.anImage4.getHeight((ImageObserver) null);
			@Pc(235) int local235 = this.anImage2.getHeight((ImageObserver) null);
			@Pc(240) int local240 = this.anImage9.getWidth((ImageObserver) null);
			@Pc(245) int local245 = this.anImage9.getHeight((ImageObserver) null);
			@Pc(250) int local250 = this.anImage2.getWidth((ImageObserver) null);
			@Pc(255) int local255 = this.anImage3.getWidth((ImageObserver) null);
			@Pc(260) int local260 = this.anImage7.getWidth((ImageObserver) null);
			@Pc(269) int local269 = this.method2905(this.anInt3137) + this.anInt3135;
			@Pc(279) int local279 = this.method2909(this.anInt3124) + this.anInt3123;
			local63.drawImage(this.anImage10, local269, (this.anInt3124 - local220) / 2 + local279, (ImageObserver) null);
			local63.drawImage(this.anImage4, local269 + this.anInt3137 - local225, (-local230 + this.anInt3124) / 2 + local279, (ImageObserver) null);
			if (this.anImage6 == null) {
				this.anImage6 = Static126.aCanvas6.createImage(this.anInt3137 - local215 - local225, this.anInt3124);
			}
			@Pc(335) Graphics local335 = this.anImage6.getGraphics();
			for (@Pc(337) int local337 = 0; local337 < this.anInt3137 - local215 - local225; local337 += local240) {
				local335.drawImage(this.anImage9, local337, 0, (ImageObserver) null);
			}
			for (@Pc(366) int local366 = 0; local366 < this.anInt3137 - local215 - local225; local366 += local250) {
				local335.drawImage(this.anImage2, local366, this.anInt3124 - local235, (ImageObserver) null);
			}
			@Pc(409) int local409 = local49 * (this.anInt3137 - local215 - local225) / 100;
			@Pc(445) int local445;
			if (local409 > 0) {
				@Pc(423) Image local423 = Static126.aCanvas6.createImage(local409, this.anInt3124 - local235 - local245);
				@Pc(427) int local427 = local423.getWidth((ImageObserver) null);
				@Pc(430) Graphics local430 = local423.getGraphics();
				@Pc(440) int local440 = this.anInt3130 * Static373.method5405() / 10 % local255;
				for (local445 = local440 - local255; local445 < local427; local445 += local255) {
					local430.drawImage(this.anImage3, local445, 0, (ImageObserver) null);
				}
				local335.drawImage(local423, 0, local245, (ImageObserver) null);
			}
			@Pc(475) int local475 = local409;
			local409 = this.anInt3137 - local225 - local215 - local409;
			if (local409 > 0) {
				@Pc(504) Image local504 = Static126.aCanvas6.createImage(local409, this.anInt3124 - local235 - local245);
				@Pc(508) int local508 = local504.getWidth((ImageObserver) null);
				@Pc(511) Graphics local511 = local504.getGraphics();
				for (local445 = 0; local445 < local508; local445 += local260) {
					local511.drawImage(this.anImage7, local445, 0, (ImageObserver) null);
				}
				local335.drawImage(local504, local475, local245, (ImageObserver) null);
			}
			local63.drawImage(this.anImage6, local215 + local269, local279, (ImageObserver) null);
			local63.setFont(this.aFont1);
			local63.setColor(this.aColor1);
			local63.drawString(local53, local269 + (this.anInt3137 - this.aFontMetrics1.stringWidth(local53)) / 2, this.anInt3144 + 4 + local279 + this.anInt3124 / 2);
			local40.drawImage(Static174.anImage12, 0, 0, (ImageObserver) null);
		} catch (@Pc(591) Exception local591) {
			this.aBoolean243 = true;
		}
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(B)V")
	private void method2910() throws IllegalAccessException, NoSuchFieldException {
		@Pc(6) Class local6 = Static124.anApplet1.getClass();
		this.anImage3 = (Image) this.method2907(local6, "bar");
		this.anImage7 = (Image) this.method2907(local6, "background");
		this.anImage10 = (Image) this.method2907(local6, "left");
		this.anImage4 = (Image) this.method2907(local6, "right");
		this.anImage9 = (Image) this.method2907(local6, "top");
		this.anImage2 = (Image) this.method2907(local6, "bottom");
		this.anImage11 = (Image) this.method2907(local6, "bodyLeft");
		this.anImage5 = (Image) this.method2907(local6, "bodyRight");
		this.anImage8 = (Image) this.method2907(local6, "bodyFill");
		this.aFont1 = (Font) this.method2907(local6, "bf");
		this.aFontMetrics1 = (FontMetrics) this.method2907(local6, "bfm");
		this.aColor1 = (Color) this.method2907(local6, "colourtext");
		@Pc(112) Object local112 = this.method2907(local6, "lb");
		@Pc(115) Class local115 = local112.getClass();
		this.aBoolean242 = this.method2902("xMiddle", local112, local115);
		this.aBoolean241 = this.method2902("yMiddle", local112, local115);
		this.anInt3135 = this.method2906("xOffset", local115, local112);
		this.anInt3123 = this.method2906("yOffset", local115, local112);
		this.anInt3137 = this.method2906("width", local115, local112);
		this.anInt3124 = this.method2906("height", local115, local112);
		this.anInt3141 = this.method2906("boxXOffset", local115, local112);
		this.anInt3140 = this.method2906("boxYOffset", local115, local112);
		this.anInt3133 = this.method2906("boxWidth", local115, local112);
		this.anInt3144 = this.method2906("textYOffset", local115, local112);
		this.anInt3130 = this.method2906("offsetPerTenCycles", local115, local112);
	}
}
