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

@OriginalClass("client!fm")
public final class Class107 implements Interface7 {

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "Ljava/awt/Image;")
	private Image anImage2;

	@OriginalMember(owner = "client!fm", name = "b", descriptor = "Ljava/awt/Image;")
	private Image anImage3;

	@OriginalMember(owner = "client!fm", name = "e", descriptor = "I")
	private int anInt3280;

	@OriginalMember(owner = "client!fm", name = "f", descriptor = "Ljava/awt/Image;")
	private Image anImage4;

	@OriginalMember(owner = "client!fm", name = "h", descriptor = "Ljava/awt/Color;")
	private Color aColor1;

	@OriginalMember(owner = "client!fm", name = "j", descriptor = "Z")
	private boolean aBoolean260;

	@OriginalMember(owner = "client!fm", name = "m", descriptor = "I")
	private int anInt3284;

	@OriginalMember(owner = "client!fm", name = "o", descriptor = "I")
	private int anInt3286;

	@OriginalMember(owner = "client!fm", name = "p", descriptor = "Ljava/awt/Image;")
	private Image anImage5;

	@OriginalMember(owner = "client!fm", name = "q", descriptor = "I")
	private int anInt3287;

	@OriginalMember(owner = "client!fm", name = "s", descriptor = "I")
	private int anInt3289;

	@OriginalMember(owner = "client!fm", name = "t", descriptor = "Ljava/awt/Font;")
	private Font aFont1;

	@OriginalMember(owner = "client!fm", name = "u", descriptor = "Ljava/awt/Image;")
	private Image anImage6;

	@OriginalMember(owner = "client!fm", name = "x", descriptor = "Ljava/awt/Image;")
	private Image anImage7;

	@OriginalMember(owner = "client!fm", name = "y", descriptor = "Ljava/awt/Image;")
	private Image anImage8;

	@OriginalMember(owner = "client!fm", name = "z", descriptor = "Ljava/awt/Image;")
	private Image anImage9;

	@OriginalMember(owner = "client!fm", name = "A", descriptor = "I")
	private int anInt3292;

	@OriginalMember(owner = "client!fm", name = "B", descriptor = "Ljava/awt/Image;")
	private Image anImage10;

	@OriginalMember(owner = "client!fm", name = "D", descriptor = "Ljava/awt/FontMetrics;")
	private FontMetrics aFontMetrics1;

	@OriginalMember(owner = "client!fm", name = "G", descriptor = "I")
	private int anInt3296;

	@OriginalMember(owner = "client!fm", name = "H", descriptor = "I")
	private int anInt3297;

	@OriginalMember(owner = "client!fm", name = "K", descriptor = "Ljava/awt/Image;")
	private Image anImage11;

	@OriginalMember(owner = "client!fm", name = "M", descriptor = "I")
	private int anInt3301;

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/Object;Ljava/lang/Class;)I")
	private int method3026(@OriginalArg(1) String arg0, @OriginalArg(2) Object arg1, @OriginalArg(3) Class arg2) throws IllegalAccessException, NoSuchFieldException {
		@Pc(12) Field local12 = arg2.getDeclaredField(arg0);
		return local12.getInt(arg1);
	}

	@OriginalMember(owner = "client!fm", name = "c", descriptor = "(I)V")
	private void method3027() throws IllegalAccessException, NoSuchFieldException {
		@Pc(6) Class local6 = Static55.anApplet1.getClass();
		this.anImage10 = (Image) this.method3030("bar", local6);
		this.anImage3 = (Image) this.method3030("background", local6);
		this.anImage5 = (Image) this.method3030("left", local6);
		this.anImage6 = (Image) this.method3030("right", local6);
		this.anImage11 = (Image) this.method3030("top", local6);
		this.anImage2 = (Image) this.method3030("bottom", local6);
		this.anImage4 = (Image) this.method3030("bodyLeft", local6);
		this.anImage9 = (Image) this.method3030("bodyRight", local6);
		this.anImage7 = (Image) this.method3030("bodyFill", local6);
		this.aFont1 = (Font) this.method3030("bf", local6);
		this.aFontMetrics1 = (FontMetrics) this.method3030("bfm", local6);
		this.aColor1 = (Color) this.method3030("colourtext", local6);
		@Pc(115) Object local115 = this.method3030("lb", local6);
		@Pc(118) Class local118 = local115.getClass();
		this.anInt3284 = this.method3026("xOffset", local115, local118);
		this.anInt3280 = this.method3026("yOffset", local115, local118);
		this.anInt3301 = this.method3026("width", local115, local118);
		this.anInt3287 = this.method3026("height", local115, local118);
		this.anInt3297 = this.method3026("boxXOffset", local115, local118);
		this.anInt3286 = this.method3026("boxYOffset", local115, local118);
		this.anInt3296 = this.method3026("boxWidth", local115, local118);
		this.anInt3289 = this.method3026("textYOffset", local115, local118);
		this.anInt3292 = this.method3026("offsetPerTenCycles", local115, local118);
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Class;Z)Ljava/lang/Object;")
	private Object method3030(@OriginalArg(0) String arg0, @OriginalArg(1) Class arg1) throws IllegalAccessException, NoSuchFieldException {
		@Pc(13) Field local13 = arg1.getDeclaredField(arg0);
		@Pc(17) Object local17 = local13.get(Static55.anApplet1);
		local13.set(Static55.anApplet1, null);
		return local17;
	}

	@OriginalMember(owner = "client!fm", name = "b", descriptor = "(I)I")
	@Override
	public int method7203() {
		return 0;
	}

	@OriginalMember(owner = "client!fm", name = "d", descriptor = "(I)V")
	private void method3031() {
		Static260.method4299(Static466.aClass276_1.method6058(), Static466.aClass276_1.method6056(), Static92.aColorArray2[Static509.anInt8774], Static317.aColorArray3[Static509.anInt8774], Static17.aColorArray1[Static509.anInt8774]);
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(IJ)Z")
	@Override
	public boolean method7199(@OriginalArg(1) long arg0) {
		return true;
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(B)V")
	@Override
	public void method7201() {
		Static67.method1120();
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(ZB)V")
	@Override
	public void method7200(@OriginalArg(0) boolean arg0) {
		if (!this.aBoolean260) {
			if (Static55.anApplet1 == null) {
				this.aBoolean260 = true;
			} else if (this.aFont1 == null) {
				try {
					this.method3027();
				} catch (@Pc(23) Exception local23) {
					this.aBoolean260 = true;
				}
			}
		}
		if (this.aBoolean260) {
			this.method3031();
			return;
		}
		@Pc(37) Graphics local37 = Static379.aCanvas13.getGraphics();
		if (local37 == null) {
			Static379.aCanvas13.repaint();
			return;
		}
		try {
			@Pc(51) int local51 = Static466.aClass276_1.method6056();
			@Pc(55) String local55 = Static466.aClass276_1.method6058();
			if (Static314.anImage16 == null) {
				Static314.anImage16 = Static379.aCanvas13.createImage(Static2.anInt29, Static19.anInt390);
			}
			@Pc(65) Graphics local65 = Static314.anImage16.getGraphics();
			@Pc(70) int local70 = this.anImage4.getWidth(null);
			@Pc(75) int local75 = this.anImage9.getWidth(null);
			@Pc(80) int local80 = this.anImage7.getWidth(null);
			@Pc(85) int local85 = this.anImage4.getHeight(null);
			@Pc(90) int local90 = this.anImage9.getHeight(null);
			@Pc(95) int local95 = this.anImage7.getHeight(null);
			local65.drawImage(this.anImage4, (Static2.anInt29 - local70) / 2 + this.anInt3297 - this.anInt3296 / 2, this.anInt3286 + (-local85 + Static19.anInt390) / 2, null);
			@Pc(136) int local136 = this.anInt3297 + local70 - this.anInt3296 / 2;
			@Pc(147) int local147 = this.anInt3296 / 2 + this.anInt3297 - local75;
			for (@Pc(149) int local149 = local136; local149 <= local147; local149 += local80) {
				local65.drawImage(this.anImage7, local149 + this.anInt3297 + (Static2.anInt29 - local70) / 2, (Static19.anInt390 + -local95) / 2 - -this.anInt3286, null);
			}
			local65.drawImage(this.anImage9, this.anInt3296 / 2 + (Static2.anInt29 - local75) / 2 + this.anInt3297, this.anInt3286 + (Static19.anInt390 - local90) / 2, null);
			@Pc(221) int local221 = this.anImage5.getWidth(null);
			@Pc(226) int local226 = this.anImage5.getHeight(null);
			@Pc(231) int local231 = this.anImage6.getWidth(null);
			@Pc(236) int local236 = this.anImage6.getHeight(null);
			@Pc(241) int local241 = this.anImage2.getHeight(null);
			@Pc(246) int local246 = this.anImage11.getWidth(null);
			@Pc(251) int local251 = this.anImage11.getHeight(null);
			@Pc(256) int local256 = this.anImage2.getWidth(null);
			@Pc(261) int local261 = this.anImage10.getWidth(null);
			@Pc(266) int local266 = this.anImage3.getWidth(null);
			@Pc(277) int local277 = (Static2.anInt29 - this.anInt3301) / 2 + this.anInt3284;
			@Pc(288) int local288 = (Static19.anInt390 - this.anInt3287) / 2 + this.anInt3280;
			local65.drawImage(this.anImage5, local277, (this.anInt3287 - local226) / 2 + local288, null);
			local65.drawImage(this.anImage6, local277 + this.anInt3301 - local231, (this.anInt3287 - local236) / 2 + local288, null);
			if (this.anImage8 == null) {
				this.anImage8 = Static379.aCanvas13.createImage(this.anInt3301 - local221 - local231, this.anInt3287);
			}
			@Pc(346) Graphics local346 = this.anImage8.getGraphics();
			for (@Pc(348) int local348 = 0; local348 < this.anInt3301 - local221 - local231; local348 += local246) {
				local346.drawImage(this.anImage11, local348, 0, null);
			}
			for (@Pc(373) int local373 = 0; local373 < this.anInt3301 - local221 - local231; local373 += local256) {
				local346.drawImage(this.anImage2, local373, this.anInt3287 - local241, null);
			}
			@Pc(416) int local416 = (this.anInt3301 - local221 - local231) * local51 / 100;
			@Pc(453) int local453;
			if (local416 > 0) {
				@Pc(432) Image local432 = Static379.aCanvas13.createImage(local416, this.anInt3287 - local251 - local241);
				@Pc(436) int local436 = local432.getWidth(null);
				@Pc(439) Graphics local439 = local432.getGraphics();
				@Pc(449) int local449 = this.anInt3292 * Static44.method727() / 10 % local261;
				for (local453 = local449 - local261; local453 < local436; local453 += local261) {
					local439.drawImage(this.anImage10, local453, 0, null);
				}
				local346.drawImage(local432, 0, local251, null);
			}
			@Pc(483) int local483 = local416;
			local416 = this.anInt3301 - local221 - local231 - local416;
			if (local416 > 0) {
				@Pc(508) Image local508 = Static379.aCanvas13.createImage(local416, this.anInt3287 - local251 - local241);
				@Pc(512) int local512 = local508.getWidth(null);
				@Pc(515) Graphics local515 = local508.getGraphics();
				for (local453 = 0; local453 < local512; local453 += local266) {
					local515.drawImage(this.anImage3, local453, 0, null);
				}
				local346.drawImage(local508, local483, local251, null);
			}
			local65.drawImage(this.anImage8, local221 + local277, local288, null);
			local65.setFont(this.aFont1);
			local65.setColor(this.aColor1);
			local65.drawString(local55, (this.anInt3301 - this.aFontMetrics1.stringWidth(local55)) / 2 + local277, this.anInt3287 / 2 + (local288 - (-4 - this.anInt3289)));
			local37.drawImage(Static314.anImage16, 0, 0, null);
		} catch (@Pc(594) Exception local594) {
			this.aBoolean260 = true;
		}
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(I)I")
	@Override
	public int method7202() {
		return 100;
	}

	@OriginalMember(owner = "client!fm", name = "b", descriptor = "(B)V")
	@Override
	public void method7204() {
	}
}
