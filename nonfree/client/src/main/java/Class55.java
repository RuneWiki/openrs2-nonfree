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

@OriginalClass("client!cea")
public final class Class55 implements Interface7 {

	@OriginalMember(owner = "client!cea", name = "b", descriptor = "I")
	private int anInt1049;

	@OriginalMember(owner = "client!cea", name = "f", descriptor = "Ljava/awt/Image;")
	private Image anImage3;

	@OriginalMember(owner = "client!cea", name = "h", descriptor = "I")
	private int anInt1054;

	@OriginalMember(owner = "client!cea", name = "j", descriptor = "I")
	private int anInt1056;

	@OriginalMember(owner = "client!cea", name = "l", descriptor = "Z")
	private boolean aBoolean66;

	@OriginalMember(owner = "client!cea", name = "m", descriptor = "Z")
	private boolean aBoolean67;

	@OriginalMember(owner = "client!cea", name = "o", descriptor = "Ljava/awt/Image;")
	private Image anImage4;

	@OriginalMember(owner = "client!cea", name = "q", descriptor = "Ljava/awt/FontMetrics;")
	private FontMetrics aFontMetrics1;

	@OriginalMember(owner = "client!cea", name = "r", descriptor = "Ljava/awt/Image;")
	private Image anImage5;

	@OriginalMember(owner = "client!cea", name = "s", descriptor = "Ljava/awt/Image;")
	private Image anImage6;

	@OriginalMember(owner = "client!cea", name = "t", descriptor = "Ljava/awt/Image;")
	private Image anImage7;

	@OriginalMember(owner = "client!cea", name = "v", descriptor = "Ljava/awt/Image;")
	private Image anImage8;

	@OriginalMember(owner = "client!cea", name = "w", descriptor = "I")
	private int anInt1061;

	@OriginalMember(owner = "client!cea", name = "x", descriptor = "Z")
	private boolean aBoolean68;

	@OriginalMember(owner = "client!cea", name = "A", descriptor = "I")
	private int anInt1064;

	@OriginalMember(owner = "client!cea", name = "C", descriptor = "Ljava/awt/Image;")
	private Image anImage9;

	@OriginalMember(owner = "client!cea", name = "H", descriptor = "Ljava/awt/Image;")
	private Image anImage10;

	@OriginalMember(owner = "client!cea", name = "K", descriptor = "Ljava/awt/Image;")
	private Image anImage11;

	@OriginalMember(owner = "client!cea", name = "L", descriptor = "Ljava/awt/Font;")
	private Font aFont1;

	@OriginalMember(owner = "client!cea", name = "M", descriptor = "I")
	private int anInt1070;

	@OriginalMember(owner = "client!cea", name = "O", descriptor = "I")
	private int anInt1071;

	@OriginalMember(owner = "client!cea", name = "P", descriptor = "Ljava/awt/Color;")
	private Color aColor1;

	@OriginalMember(owner = "client!cea", name = "Q", descriptor = "I")
	private int anInt1072;

	@OriginalMember(owner = "client!cea", name = "R", descriptor = "I")
	private int anInt1073;

	@OriginalMember(owner = "client!cea", name = "S", descriptor = "Ljava/awt/Image;")
	private Image anImage12;

	@OriginalMember(owner = "client!cea", name = "b", descriptor = "(I)V")
	@Override
	public void method8441() {
		Static662.method8640();
	}

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8443(@OriginalArg(1) boolean arg0) {
		if (!this.aBoolean66) {
			if (Static285.anApplet5 == null) {
				this.aBoolean66 = true;
			} else if (this.aFont1 == null) {
				try {
					this.method984();
				} catch (@Pc(21) Exception local21) {
					this.aBoolean66 = true;
				}
			}
		}
		if (this.aBoolean66) {
			this.method987();
			return;
		}
		@Pc(39) Graphics local39 = Static105.aCanvas2.getGraphics();
		if (local39 == null) {
			Static105.aCanvas2.repaint();
			return;
		}
		try {
			@Pc(45) int local45 = Static459.aClass204_1.method4778();
			@Pc(49) String local49 = Static459.aClass204_1.method4784();
			if (Static64.anImage2 == null) {
				Static64.anImage2 = Static105.aCanvas2.createImage(Static563.anInt9176, Static316.anInt8165);
			}
			@Pc(59) Graphics local59 = Static64.anImage2.getGraphics();
			local59.clearRect(0, 0, Static563.anInt9176, Static316.anInt8165);
			@Pc(70) int local70 = this.anImage12.getWidth((ImageObserver) null);
			@Pc(75) int local75 = this.anImage6.getWidth((ImageObserver) null);
			@Pc(80) int local80 = this.anImage10.getWidth((ImageObserver) null);
			@Pc(85) int local85 = this.anImage12.getHeight((ImageObserver) null);
			@Pc(90) int local90 = this.anImage6.getHeight((ImageObserver) null);
			@Pc(95) int local95 = this.anImage10.getHeight((ImageObserver) null);
			local59.drawImage(this.anImage12, this.method990(local70) + this.anInt1070 - this.anInt1061 / 2, this.method992(local85) - -this.anInt1073, (ImageObserver) null);
			@Pc(133) int local133 = this.anInt1070 + local70 - this.anInt1061 / 2;
			@Pc(141) int local141 = this.anInt1070 + this.anInt1061 / 2;
			for (@Pc(143) int local143 = local133; local143 <= local141; local143 += local80) {
				local59.drawImage(this.anImage10, local143 + this.method990(local70) + this.anInt1070, this.method992(local95) + this.anInt1073, (ImageObserver) null);
			}
			local59.drawImage(this.anImage6, this.method990(local75) + this.anInt1070 + this.anInt1061 / 2, this.method992(local90) + this.anInt1073, (ImageObserver) null);
			@Pc(209) int local209 = this.anImage9.getWidth((ImageObserver) null);
			@Pc(214) int local214 = this.anImage9.getHeight((ImageObserver) null);
			@Pc(219) int local219 = this.anImage4.getWidth((ImageObserver) null);
			@Pc(224) int local224 = this.anImage4.getHeight((ImageObserver) null);
			@Pc(229) int local229 = this.anImage5.getHeight((ImageObserver) null);
			@Pc(234) int local234 = this.anImage3.getWidth((ImageObserver) null);
			@Pc(239) int local239 = this.anImage3.getHeight((ImageObserver) null);
			@Pc(244) int local244 = this.anImage5.getWidth((ImageObserver) null);
			@Pc(249) int local249 = this.anImage8.getWidth((ImageObserver) null);
			@Pc(254) int local254 = this.anImage7.getWidth((ImageObserver) null);
			@Pc(264) int local264 = this.method990(this.anInt1056) + this.anInt1072;
			@Pc(273) int local273 = this.method992(this.anInt1049) + this.anInt1071;
			local59.drawImage(this.anImage9, local264, local273 + (this.anInt1049 - local214) / 2, (ImageObserver) null);
			local59.drawImage(this.anImage4, local264 + this.anInt1056 - local219, (-local224 + this.anInt1049) / 2 + local273, (ImageObserver) null);
			if (this.anImage11 == null) {
				this.anImage11 = Static105.aCanvas2.createImage(this.anInt1056 - local219 - local209, this.anInt1049);
			}
			@Pc(332) Graphics local332 = this.anImage11.getGraphics();
			for (@Pc(334) int local334 = 0; local334 < this.anInt1056 - local209 - local219; local334 += local234) {
				local332.drawImage(this.anImage3, local334, 0, (ImageObserver) null);
			}
			for (@Pc(360) int local360 = 0; local360 < this.anInt1056 - local219 - local209; local360 += local244) {
				local332.drawImage(this.anImage5, local360, this.anInt1049 - local229, (ImageObserver) null);
			}
			@Pc(404) int local404 = local45 * (this.anInt1056 - local209 - local219) / 100;
			@Pc(439) int local439;
			if (local404 > 0) {
				@Pc(417) Image local417 = Static105.aCanvas2.createImage(local404, this.anInt1049 - local229 - local239);
				@Pc(421) int local421 = local417.getWidth((ImageObserver) null);
				@Pc(424) Graphics local424 = local417.getGraphics();
				@Pc(434) int local434 = this.anInt1064 * Static265.method3767() / 10 % local249;
				for (local439 = local434 - local249; local439 < local421; local439 += local249) {
					local424.drawImage(this.anImage8, local439, 0, (ImageObserver) null);
				}
				local332.drawImage(local417, 0, local239, (ImageObserver) null);
			}
			@Pc(469) int local469 = local404;
			local404 = this.anInt1056 - local404 - local209 - local219;
			if (local404 > 0) {
				@Pc(493) Image local493 = Static105.aCanvas2.createImage(local404, this.anInt1049 - local239 - local229);
				@Pc(497) int local497 = local493.getWidth((ImageObserver) null);
				@Pc(500) Graphics local500 = local493.getGraphics();
				for (local439 = 0; local439 < local497; local439 += local254) {
					local500.drawImage(this.anImage7, local439, 0, (ImageObserver) null);
				}
				local332.drawImage(local493, local469, local239, (ImageObserver) null);
			}
			local59.drawImage(this.anImage11, local264 + local209, local273, (ImageObserver) null);
			local59.setFont(this.aFont1);
			local59.setColor(this.aColor1);
			local59.drawString(local49, local264 + (this.anInt1056 - this.aFontMetrics1.stringWidth(local49)) / 2, this.anInt1054 + (local273 + 4 - -(this.anInt1049 / 2)));
			local39.drawImage(Static64.anImage2, 0, 0, (ImageObserver) null);
		} catch (@Pc(585) Exception local585) {
			this.aBoolean66 = true;
		}
	}

	@OriginalMember(owner = "client!cea", name = "e", descriptor = "(I)V")
	private void method984() throws IllegalAccessException, NoSuchFieldException {
		@Pc(6) Class local6 = Static285.anApplet5.getClass();
		this.anImage8 = (Image) this.method989("bar", local6);
		this.anImage7 = (Image) this.method989("background", local6);
		this.anImage9 = (Image) this.method989("left", local6);
		this.anImage4 = (Image) this.method989("right", local6);
		this.anImage3 = (Image) this.method989("top", local6);
		this.anImage5 = (Image) this.method989("bottom", local6);
		this.anImage12 = (Image) this.method989("bodyLeft", local6);
		this.anImage6 = (Image) this.method989("bodyRight", local6);
		this.anImage10 = (Image) this.method989("bodyFill", local6);
		this.aFont1 = (Font) this.method989("bf", local6);
		this.aFontMetrics1 = (FontMetrics) this.method989("bfm", local6);
		this.aColor1 = (Color) this.method989("colourtext", local6);
		@Pc(116) Object local116 = this.method989("lb", local6);
		@Pc(119) Class local119 = local116.getClass();
		this.aBoolean68 = this.method988(local119, "xMiddle", local116);
		this.aBoolean67 = this.method988(local119, "yMiddle", local116);
		this.anInt1072 = this.method986(local116, local119, "xOffset");
		this.anInt1071 = this.method986(local116, local119, "yOffset");
		this.anInt1056 = this.method986(local116, local119, "width");
		this.anInt1049 = this.method986(local116, local119, "height");
		this.anInt1070 = this.method986(local116, local119, "boxXOffset");
		this.anInt1073 = this.method986(local116, local119, "boxYOffset");
		this.anInt1061 = this.method986(local116, local119, "boxWidth");
		this.anInt1054 = this.method986(local116, local119, "textYOffset");
		this.anInt1064 = this.method986(local116, local119, "offsetPerTenCycles");
	}

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "(JB)Z")
	@Override
	public boolean method8444(@OriginalArg(0) long arg0) {
		return true;
	}

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "(Ljava/lang/Object;BLjava/lang/Class;Ljava/lang/String;)I")
	private int method986(@OriginalArg(0) Object arg0, @OriginalArg(2) Class arg1, @OriginalArg(3) String arg2) throws IllegalAccessException, NoSuchFieldException {
		@Pc(7) Field local7 = arg1.getDeclaredField(arg2);
		return local7.getInt(arg0);
	}

	@OriginalMember(owner = "client!cea", name = "f", descriptor = "(I)V")
	private void method987() {
		Static399.method5871(Static521.aColorArray4[Static21.anInt150], Static459.aClass204_1.method4784(), Static4.aColorArray1[Static21.anInt150], Static392.aColorArray5[Static21.anInt150], Static459.aClass204_1.method4778());
	}

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "(I)I")
	@Override
	public int method8440() {
		return 100;
	}

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "(B)I")
	@Override
	public int method8439() {
		return 0;
	}

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "(BLjava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)Z")
	private boolean method988(@OriginalArg(1) Class arg0, @OriginalArg(2) String arg1, @OriginalArg(3) Object arg2) throws IllegalAccessException, NoSuchFieldException {
		@Pc(12) Field local12 = arg0.getDeclaredField(arg1);
		return local12.getBoolean(arg2);
	}

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Class;I)Ljava/lang/Object;")
	private Object method989(@OriginalArg(0) String arg0, @OriginalArg(1) Class arg1) throws IllegalAccessException, NoSuchFieldException {
		@Pc(12) Field local12 = arg1.getDeclaredField(arg0);
		@Pc(16) Object local16 = local12.get(Static285.anApplet5);
		local12.set(Static285.anApplet5, (Object) null);
		return local16;
	}

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "(II)I")
	private int method990(@OriginalArg(0) int arg0) {
		return this.aBoolean68 ? (Static563.anInt9176 - arg0) / 2 : 0;
	}

	@OriginalMember(owner = "client!cea", name = "c", descriptor = "(I)V")
	@Override
	public void method8442() {
	}

	@OriginalMember(owner = "client!cea", name = "b", descriptor = "(II)I")
	private int method992(@OriginalArg(1) int arg0) {
		return this.aBoolean67 ? (Static316.anInt8165 - arg0) / 2 : 0;
	}
}
