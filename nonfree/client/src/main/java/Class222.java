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

@OriginalClass("client!lo")
public final class Class222 implements Interface14 {

	@OriginalMember(owner = "client!lo", name = "A", descriptor = "Ljava/awt/Color;")
	private Color aColor1;

	@OriginalMember(owner = "client!lo", name = "M", descriptor = "Ljava/awt/Image;")
	private Image anImage2;

	@OriginalMember(owner = "client!lo", name = "x", descriptor = "Ljava/awt/Image;")
	private Image anImage3;

	@OriginalMember(owner = "client!lo", name = "i", descriptor = "Ljava/awt/Image;")
	private Image anImage4;

	@OriginalMember(owner = "client!lo", name = "P", descriptor = "Ljava/awt/Image;")
	private Image anImage5;

	@OriginalMember(owner = "client!lo", name = "r", descriptor = "I")
	private int anInt6105;

	@OriginalMember(owner = "client!lo", name = "t", descriptor = "Z")
	private boolean aBoolean453;

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "I")
	private int anInt6109;

	@OriginalMember(owner = "client!lo", name = "f", descriptor = "Z")
	private boolean aBoolean454;

	@OriginalMember(owner = "client!lo", name = "l", descriptor = "I")
	private int anInt6110;

	@OriginalMember(owner = "client!lo", name = "j", descriptor = "I")
	private int anInt6111;

	@OriginalMember(owner = "client!lo", name = "c", descriptor = "Ljava/awt/Font;")
	private Font aFont2;

	@OriginalMember(owner = "client!lo", name = "d", descriptor = "Ljava/awt/Image;")
	private Image anImage6;

	@OriginalMember(owner = "client!lo", name = "O", descriptor = "I")
	private int anInt6113;

	@OriginalMember(owner = "client!lo", name = "e", descriptor = "Ljava/awt/Image;")
	private Image anImage7;

	@OriginalMember(owner = "client!lo", name = "q", descriptor = "Ljava/awt/FontMetrics;")
	private FontMetrics aFontMetrics1;

	@OriginalMember(owner = "client!lo", name = "J", descriptor = "Ljava/awt/Image;")
	private Image anImage8;

	@OriginalMember(owner = "client!lo", name = "h", descriptor = "Ljava/awt/Image;")
	private Image anImage9;

	@OriginalMember(owner = "client!lo", name = "u", descriptor = "I")
	private int anInt6116;

	@OriginalMember(owner = "client!lo", name = "o", descriptor = "Ljava/awt/Image;")
	private Image anImage10;

	@OriginalMember(owner = "client!lo", name = "I", descriptor = "Ljava/awt/Image;")
	private Image anImage11;

	@OriginalMember(owner = "client!lo", name = "z", descriptor = "I")
	private int anInt6118;

	@OriginalMember(owner = "client!lo", name = "Q", descriptor = "I")
	private int anInt6119;

	@OriginalMember(owner = "client!lo", name = "C", descriptor = "Z")
	private boolean aBoolean455;

	@OriginalMember(owner = "client!lo", name = "E", descriptor = "I")
	private int anInt6121;

	@OriginalMember(owner = "client!lo", name = "e", descriptor = "(I)V")
	private void method5234() {
		Static48.method768(Static410.aClass194_1.method4394(), Static11.aColorArray1[Static530.anInt8943], Static134.aColorArray2[Static530.anInt8943], Static523.aColorArray3[Static530.anInt8943], Static410.aClass194_1.method4392());
	}

	@OriginalMember(owner = "client!lo", name = "b", descriptor = "(I)I")
	@Override
	public int method7951() {
		return 0;
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(II)I")
	private int method5237(@OriginalArg(0) int arg0) {
		return this.aBoolean453 ? (Static631.anInt10283 - arg0) / 2 : 0;
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;B)I")
	private int method5238(@OriginalArg(0) Class arg0, @OriginalArg(1) String arg1, @OriginalArg(2) Object arg2) throws IllegalAccessException, NoSuchFieldException {
		@Pc(7) Field local7 = arg0.getDeclaredField(arg1);
		return local7.getInt(arg2);
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(I)I")
	@Override
	public int method7949() {
		return 100;
	}

	@OriginalMember(owner = "client!lo", name = "d", descriptor = "(I)V")
	private void method5239() throws IllegalAccessException, NoSuchFieldException {
		@Pc(11) Class local11 = Static492.anApplet2.getClass();
		this.anImage3 = (Image) this.method5241(local11, "bar");
		this.anImage8 = (Image) this.method5241(local11, "background");
		this.anImage2 = (Image) this.method5241(local11, "left");
		this.anImage5 = (Image) this.method5241(local11, "right");
		this.anImage10 = (Image) this.method5241(local11, "top");
		this.anImage7 = (Image) this.method5241(local11, "bottom");
		this.anImage11 = (Image) this.method5241(local11, "bodyLeft");
		this.anImage9 = (Image) this.method5241(local11, "bodyRight");
		this.anImage4 = (Image) this.method5241(local11, "bodyFill");
		this.aFont2 = (Font) this.method5241(local11, "bf");
		this.aFontMetrics1 = (FontMetrics) this.method5241(local11, "bfm");
		this.aColor1 = (Color) this.method5241(local11, "colourtext");
		@Pc(147) Object local147 = this.method5241(local11, "lb");
		@Pc(150) Class local150 = local147.getClass();
		this.aBoolean454 = this.method5242("xMiddle", local150, local147);
		this.aBoolean453 = this.method5242("yMiddle", local150, local147);
		this.anInt6119 = this.method5238(local150, "xOffset", local147);
		this.anInt6113 = this.method5238(local150, "yOffset", local147);
		this.anInt6105 = this.method5238(local150, "width", local147);
		this.anInt6110 = this.method5238(local150, "height", local147);
		this.anInt6109 = this.method5238(local150, "boxXOffset", local147);
		this.anInt6111 = this.method5238(local150, "boxYOffset", local147);
		this.anInt6118 = this.method5238(local150, "boxWidth", local147);
		this.anInt6121 = this.method5238(local150, "textYOffset", local147);
		this.anInt6116 = this.method5238(local150, "offsetPerTenCycles", local147);
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(ILjava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;")
	private Object method5241(@OriginalArg(1) Class arg0, @OriginalArg(2) String arg1) throws IllegalAccessException, NoSuchFieldException {
		@Pc(13) Field local13 = arg0.getDeclaredField(arg1);
		@Pc(17) Object local17 = local13.get(Static492.anApplet2);
		local13.set(Static492.anApplet2, (Object) null);
		return local17;
	}

	@OriginalMember(owner = "client!lo", name = "b", descriptor = "(B)V")
	@Override
	public void method7950() {
		Static400.method5893();
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(ZJ)Z")
	@Override
	public boolean method7953(@OriginalArg(1) long arg0) {
		return true;
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(IZ)V")
	@Override
	public void method7952(@OriginalArg(1) boolean arg0) {
		if (!this.aBoolean455) {
			if (Static492.anApplet2 == null) {
				this.aBoolean455 = true;
			} else if (this.aFont2 == null) {
				try {
					this.method5239();
				} catch (@Pc(18) Exception local18) {
					this.aBoolean455 = true;
				}
			}
		}
		if (this.aBoolean455) {
			this.method5234();
			return;
		}
		@Pc(43) Graphics local43 = Static24.aCanvas1.getGraphics();
		if (local43 == null) {
			Static24.aCanvas1.repaint();
			return;
		}
		try {
			@Pc(55) int local55 = Static410.aClass194_1.method4392();
			@Pc(59) String local59 = Static410.aClass194_1.method4394();
			if (Static640.anImage13 == null) {
				Static640.anImage13 = Static24.aCanvas1.createImage(Static70.anInt1125, Static631.anInt10283);
			}
			@Pc(71) Graphics local71 = Static640.anImage13.getGraphics();
			local71.clearRect(0, 0, Static70.anInt1125, Static631.anInt10283);
			@Pc(82) int local82 = this.anImage11.getWidth((ImageObserver) null);
			@Pc(87) int local87 = this.anImage9.getWidth((ImageObserver) null);
			@Pc(92) int local92 = this.anImage4.getWidth((ImageObserver) null);
			@Pc(97) int local97 = this.anImage11.getHeight((ImageObserver) null);
			@Pc(102) int local102 = this.anImage9.getHeight((ImageObserver) null);
			@Pc(107) int local107 = this.anImage4.getHeight((ImageObserver) null);
			local71.drawImage(this.anImage11, this.method5243(local82) + this.anInt6109 - this.anInt6118 / 2, this.method5237(local97) - -this.anInt6111, (ImageObserver) null);
			@Pc(144) int local144 = this.anInt6109 + local82 - this.anInt6118 / 2;
			@Pc(152) int local152 = this.anInt6118 / 2 + this.anInt6109;
			for (@Pc(154) int local154 = local144; local154 <= local152; local154 += local92) {
				local71.drawImage(this.anImage4, local154 + this.method5243(local82) + this.anInt6109, this.method5237(local107) - -this.anInt6111, (ImageObserver) null);
			}
			local71.drawImage(this.anImage9, this.method5243(local87) + this.anInt6109 + this.anInt6118 / 2, this.method5237(local102) + this.anInt6111, (ImageObserver) null);
			@Pc(219) int local219 = this.anImage2.getWidth((ImageObserver) null);
			@Pc(224) int local224 = this.anImage2.getHeight((ImageObserver) null);
			@Pc(229) int local229 = this.anImage5.getWidth((ImageObserver) null);
			@Pc(234) int local234 = this.anImage5.getHeight((ImageObserver) null);
			@Pc(239) int local239 = this.anImage7.getHeight((ImageObserver) null);
			@Pc(244) int local244 = this.anImage10.getWidth((ImageObserver) null);
			@Pc(249) int local249 = this.anImage10.getHeight((ImageObserver) null);
			@Pc(254) int local254 = this.anImage7.getWidth((ImageObserver) null);
			@Pc(259) int local259 = this.anImage3.getWidth((ImageObserver) null);
			@Pc(264) int local264 = this.anImage8.getWidth((ImageObserver) null);
			@Pc(273) int local273 = this.method5243(this.anInt6105) + this.anInt6119;
			@Pc(282) int local282 = this.method5237(this.anInt6110) + this.anInt6113;
			local71.drawImage(this.anImage2, local273, local282 + (this.anInt6110 - local224) / 2, (ImageObserver) null);
			local71.drawImage(this.anImage5, local273 + this.anInt6105 - local229, local282 + (-local234 + this.anInt6110) / 2, (ImageObserver) null);
			if (this.anImage6 == null) {
				this.anImage6 = Static24.aCanvas1.createImage(this.anInt6105 - local219 - local229, this.anInt6110);
			}
			@Pc(344) Graphics local344 = this.anImage6.getGraphics();
			for (@Pc(346) int local346 = 0; local346 < this.anInt6105 - local219 - local229; local346 += local244) {
				local344.drawImage(this.anImage10, local346, 0, (ImageObserver) null);
			}
			for (@Pc(374) int local374 = 0; local374 < this.anInt6105 - local219 - local229; local374 += local254) {
				local344.drawImage(this.anImage7, local374, this.anInt6110 - local239, (ImageObserver) null);
			}
			@Pc(422) int local422 = local55 * (this.anInt6105 - local229 - local219) / 100;
			@Pc(460) int local460;
			if (local422 > 0) {
				@Pc(438) Image local438 = Static24.aCanvas1.createImage(local422, this.anInt6110 - local239 - local249);
				@Pc(442) int local442 = local438.getWidth((ImageObserver) null);
				@Pc(445) Graphics local445 = local438.getGraphics();
				@Pc(455) int local455 = this.anInt6116 * Static201.method2892() / 10 % local259;
				for (local460 = local455 - local259; local460 < local442; local460 += local259) {
					local445.drawImage(this.anImage3, local460, 0, (ImageObserver) null);
				}
				local344.drawImage(local438, 0, local249, (ImageObserver) null);
			}
			@Pc(492) int local492 = local422;
			local422 = this.anInt6105 - local422 - local229 - local219;
			if (local422 > 0) {
				@Pc(517) Image local517 = Static24.aCanvas1.createImage(local422, this.anInt6110 - local239 - local249);
				@Pc(521) int local521 = local517.getWidth((ImageObserver) null);
				@Pc(524) Graphics local524 = local517.getGraphics();
				for (local460 = 0; local460 < local521; local460 += local264) {
					local524.drawImage(this.anImage8, local460, 0, (ImageObserver) null);
				}
				local344.drawImage(local517, local492, local249, (ImageObserver) null);
			}
			local71.drawImage(this.anImage6, local273 + local219, local282, (ImageObserver) null);
			local71.setFont(this.aFont2);
			local71.setColor(this.aColor1);
			local71.drawString(local59, (this.anInt6105 - this.aFontMetrics1.stringWidth(local59)) / 2 + local273, this.anInt6121 + 4 + local282 + this.anInt6110 / 2);
			local43.drawImage(Static640.anImage13, 0, 0, (ImageObserver) null);
		} catch (@Pc(610) Exception local610) {
			this.aBoolean455 = true;
		}
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Object;I)Z")
	private boolean method5242(@OriginalArg(0) String arg0, @OriginalArg(1) Class arg1, @OriginalArg(2) Object arg2) throws IllegalAccessException, NoSuchFieldException {
		@Pc(13) Field local13 = arg1.getDeclaredField(arg0);
		return local13.getBoolean(arg2);
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(B)V")
	@Override
	public void method7948() {
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(ZI)I")
	private int method5243(@OriginalArg(1) int arg0) {
		return this.aBoolean454 ? (Static70.anInt1125 - arg0) / 2 : 0;
	}
}
