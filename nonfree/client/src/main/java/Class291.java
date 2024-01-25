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

@OriginalClass("client!qn")
public final class Class291 implements Interface5 {

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "I")
	private int anInt8291;

	@OriginalMember(owner = "client!qn", name = "b", descriptor = "Ljava/awt/Image;")
	private Image anImage3;

	@OriginalMember(owner = "client!qn", name = "e", descriptor = "I")
	private int anInt8293;

	@OriginalMember(owner = "client!qn", name = "f", descriptor = "Ljava/awt/Image;")
	private Image anImage4;

	@OriginalMember(owner = "client!qn", name = "g", descriptor = "I")
	private int anInt8294;

	@OriginalMember(owner = "client!qn", name = "i", descriptor = "I")
	private int anInt8296;

	@OriginalMember(owner = "client!qn", name = "m", descriptor = "Z")
	private boolean aBoolean563;

	@OriginalMember(owner = "client!qn", name = "q", descriptor = "Ljava/awt/Image;")
	private Image anImage5;

	@OriginalMember(owner = "client!qn", name = "r", descriptor = "I")
	private int anInt8303;

	@OriginalMember(owner = "client!qn", name = "s", descriptor = "I")
	private int anInt8304;

	@OriginalMember(owner = "client!qn", name = "t", descriptor = "Ljava/awt/Image;")
	private Image anImage6;

	@OriginalMember(owner = "client!qn", name = "v", descriptor = "Ljava/awt/Image;")
	private Image anImage7;

	@OriginalMember(owner = "client!qn", name = "w", descriptor = "Ljava/awt/Image;")
	private Image anImage8;

	@OriginalMember(owner = "client!qn", name = "x", descriptor = "Ljava/awt/Image;")
	private Image anImage9;

	@OriginalMember(owner = "client!qn", name = "z", descriptor = "Ljava/awt/Font;")
	private Font aFont1;

	@OriginalMember(owner = "client!qn", name = "B", descriptor = "I")
	private int anInt8307;

	@OriginalMember(owner = "client!qn", name = "C", descriptor = "Z")
	private boolean aBoolean564;

	@OriginalMember(owner = "client!qn", name = "E", descriptor = "I")
	private int anInt8308;

	@OriginalMember(owner = "client!qn", name = "H", descriptor = "Ljava/awt/FontMetrics;")
	private FontMetrics aFontMetrics1;

	@OriginalMember(owner = "client!qn", name = "J", descriptor = "Ljava/awt/Image;")
	private Image anImage10;

	@OriginalMember(owner = "client!qn", name = "L", descriptor = "I")
	private int anInt8313;

	@OriginalMember(owner = "client!qn", name = "M", descriptor = "Z")
	private boolean aBoolean566;

	@OriginalMember(owner = "client!qn", name = "N", descriptor = "Ljava/awt/Image;")
	private Image anImage11;

	@OriginalMember(owner = "client!qn", name = "Q", descriptor = "Ljava/awt/Image;")
	private Image anImage12;

	@OriginalMember(owner = "client!qn", name = "R", descriptor = "Ljava/awt/Color;")
	private Color aColor1;

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(B)V")
	private void method7073() {
		Static517.method7333(Static83.aColorArray1[Static654.anInt2126], Static42.aClass252_1.method6249(), Static333.aColorArray3[Static654.anInt2126], Static42.aClass252_1.method6259(), Static327.aColorArray2[Static654.anInt2126]);
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(Ljava/lang/Object;ZLjava/lang/Class;Ljava/lang/String;)I")
	private int method7075(@OriginalArg(0) Object arg0, @OriginalArg(2) Class arg1, @OriginalArg(3) String arg2) throws IllegalAccessException, NoSuchFieldException {
		@Pc(15) Field local15 = arg1.getDeclaredField(arg2);
		return local15.getInt(arg0);
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(I)V")
	@Override
	public void method7067() {
		Static118.method1838();
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(Ljava/lang/Class;Ljava/lang/String;I)Ljava/lang/Object;")
	private Object method7077(@OriginalArg(0) Class arg0, @OriginalArg(1) String arg1) throws IllegalAccessException, NoSuchFieldException {
		@Pc(15) Field local15 = arg0.getDeclaredField(arg1);
		@Pc(19) Object local19 = local15.get(Static180.anApplet6);
		local15.set(Static180.anApplet6, (Object) null);
		return local19;
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(BI)I")
	private int method7078(@OriginalArg(1) int arg0) {
		return this.aBoolean566 ? (Static449.anInt7506 - arg0) / 2 : 0;
	}

	@OriginalMember(owner = "client!qn", name = "b", descriptor = "(I)I")
	@Override
	public int method7069() {
		return 0;
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Class;)Z")
	private boolean method7079(@OriginalArg(0) String arg0, @OriginalArg(1) Object arg1, @OriginalArg(3) Class arg2) throws IllegalAccessException, NoSuchFieldException {
		@Pc(12) Field local12 = arg2.getDeclaredField(arg0);
		return local12.getBoolean(arg1);
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7072(@OriginalArg(0) boolean arg0) {
		if (!this.aBoolean563) {
			if (Static180.anApplet6 == null) {
				this.aBoolean563 = true;
			} else if (this.aFont1 == null) {
				try {
					this.method7081();
				} catch (@Pc(23) Exception local23) {
					this.aBoolean563 = true;
				}
			}
		}
		if (this.aBoolean563) {
			this.method7073();
			return;
		}
		@Pc(41) Graphics local41 = Static140.aCanvas1.getGraphics();
		if (local41 == null) {
			Static140.aCanvas1.repaint();
			return;
		}
		try {
			@Pc(49) int local49 = Static42.aClass252_1.method6259();
			@Pc(53) String local53 = Static42.aClass252_1.method6249();
			if (Static559.anImage13 == null) {
				Static559.anImage13 = Static140.aCanvas1.createImage(Static449.anInt7506, Static348.anInt5935);
			}
			@Pc(63) Graphics local63 = Static559.anImage13.getGraphics();
			local63.clearRect(0, 0, Static449.anInt7506, Static348.anInt5935);
			@Pc(74) int local74 = this.anImage7.getWidth((ImageObserver) null);
			@Pc(79) int local79 = this.anImage10.getWidth((ImageObserver) null);
			@Pc(84) int local84 = this.anImage9.getWidth((ImageObserver) null);
			@Pc(89) int local89 = this.anImage7.getHeight((ImageObserver) null);
			@Pc(94) int local94 = this.anImage10.getHeight((ImageObserver) null);
			@Pc(99) int local99 = this.anImage9.getHeight((ImageObserver) null);
			local63.drawImage(this.anImage7, this.method7078(local74) + this.anInt8293 - this.anInt8296 / 2, this.method7080(local89) + this.anInt8304, (ImageObserver) null);
			@Pc(134) int local134 = this.anInt8293 + local74 - this.anInt8296 / 2;
			@Pc(142) int local142 = this.anInt8293 + this.anInt8296 / 2;
			for (@Pc(144) int local144 = local134; local144 <= local142; local144 += local84) {
				local63.drawImage(this.anImage9, local144 + this.method7078(local74) + this.anInt8293, this.method7080(local99) - -this.anInt8304, (ImageObserver) null);
			}
			local63.drawImage(this.anImage10, this.method7078(local79) + this.anInt8293 + this.anInt8296 / 2, this.method7080(local94) + this.anInt8304, (ImageObserver) null);
			@Pc(207) int local207 = this.anImage11.getWidth((ImageObserver) null);
			@Pc(212) int local212 = this.anImage11.getHeight((ImageObserver) null);
			@Pc(217) int local217 = this.anImage5.getWidth((ImageObserver) null);
			@Pc(222) int local222 = this.anImage5.getHeight((ImageObserver) null);
			@Pc(227) int local227 = this.anImage6.getHeight((ImageObserver) null);
			@Pc(232) int local232 = this.anImage8.getWidth((ImageObserver) null);
			@Pc(237) int local237 = this.anImage8.getHeight((ImageObserver) null);
			@Pc(242) int local242 = this.anImage6.getWidth((ImageObserver) null);
			@Pc(247) int local247 = this.anImage12.getWidth((ImageObserver) null);
			@Pc(252) int local252 = this.anImage4.getWidth((ImageObserver) null);
			@Pc(262) int local262 = this.method7078(this.anInt8308) + this.anInt8303;
			@Pc(272) int local272 = this.method7080(this.anInt8307) + this.anInt8294;
			local63.drawImage(this.anImage11, local262, local272 + (this.anInt8307 - local212) / 2, (ImageObserver) null);
			local63.drawImage(this.anImage5, local262 + this.anInt8308 - local217, local272 - -((this.anInt8307 - local222) / 2), (ImageObserver) null);
			if (this.anImage3 == null) {
				this.anImage3 = Static140.aCanvas1.createImage(this.anInt8308 - local217 - local207, this.anInt8307);
			}
			@Pc(331) Graphics local331 = this.anImage3.getGraphics();
			for (@Pc(333) int local333 = 0; local333 < this.anInt8308 - local217 - local207; local333 += local232) {
				local331.drawImage(this.anImage8, local333, 0, (ImageObserver) null);
			}
			for (@Pc(358) int local358 = 0; local358 < this.anInt8308 - local217 - local207; local358 += local242) {
				local331.drawImage(this.anImage6, local358, this.anInt8307 - local227, (ImageObserver) null);
			}
			@Pc(401) int local401 = local49 * (this.anInt8308 - local217 - local207) / 100;
			@Pc(436) int local436;
			if (local401 > 0) {
				@Pc(415) Image local415 = Static140.aCanvas1.createImage(local401, this.anInt8307 - local237 - local227);
				@Pc(419) int local419 = local415.getWidth((ImageObserver) null);
				@Pc(422) Graphics local422 = local415.getGraphics();
				@Pc(432) int local432 = this.anInt8291 * Static268.method3983() / 10 % local247;
				for (local436 = local432 - local247; local436 < local419; local436 += local247) {
					local422.drawImage(this.anImage12, local436, 0, (ImageObserver) null);
				}
				local331.drawImage(local415, 0, local237, (ImageObserver) null);
			}
			@Pc(462) int local462 = local401;
			local401 = this.anInt8308 - local401 - local207 - local217;
			if (local401 > 0) {
				@Pc(487) Image local487 = Static140.aCanvas1.createImage(local401, this.anInt8307 - local227 - local237);
				@Pc(491) int local491 = local487.getWidth((ImageObserver) null);
				@Pc(494) Graphics local494 = local487.getGraphics();
				for (local436 = 0; local436 < local491; local436 += local252) {
					local494.drawImage(this.anImage4, local436, 0, (ImageObserver) null);
				}
				local331.drawImage(local487, local462, local237, (ImageObserver) null);
			}
			local63.drawImage(this.anImage3, local207 + local262, local272, (ImageObserver) null);
			local63.setFont(this.aFont1);
			local63.setColor(this.aColor1);
			local63.drawString(local53, (this.anInt8308 - this.aFontMetrics1.stringWidth(local53)) / 2 + local262, this.anInt8313 + (this.anInt8307 / 2 + local272 - -4));
			local41.drawImage(Static559.anImage13, 0, 0, (ImageObserver) null);
		} catch (@Pc(576) Exception local576) {
			this.aBoolean563 = true;
		}
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(BJ)Z")
	@Override
	public boolean method7068(@OriginalArg(1) long arg0) {
		return true;
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(Z)V")
	@Override
	public void method7070() {
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(IB)I")
	private int method7080(@OriginalArg(0) int arg0) {
		return this.aBoolean564 ? (Static348.anInt5935 - arg0) / 2 : 0;
	}

	@OriginalMember(owner = "client!qn", name = "b", descriptor = "(Z)V")
	private void method7081() throws IllegalAccessException, NoSuchFieldException {
		@Pc(6) Class local6 = Static180.anApplet6.getClass();
		this.anImage12 = (Image) this.method7077(local6, "bar");
		this.anImage4 = (Image) this.method7077(local6, "background");
		this.anImage11 = (Image) this.method7077(local6, "left");
		this.anImage5 = (Image) this.method7077(local6, "right");
		this.anImage8 = (Image) this.method7077(local6, "top");
		this.anImage6 = (Image) this.method7077(local6, "bottom");
		this.anImage7 = (Image) this.method7077(local6, "bodyLeft");
		this.anImage10 = (Image) this.method7077(local6, "bodyRight");
		this.anImage9 = (Image) this.method7077(local6, "bodyFill");
		this.aFont1 = (Font) this.method7077(local6, "bf");
		this.aFontMetrics1 = (FontMetrics) this.method7077(local6, "bfm");
		this.aColor1 = (Color) this.method7077(local6, "colourtext");
		@Pc(112) Object local112 = this.method7077(local6, "lb");
		@Pc(115) Class local115 = local112.getClass();
		this.aBoolean566 = this.method7079("xMiddle", local112, local115);
		this.aBoolean564 = this.method7079("yMiddle", local112, local115);
		this.anInt8303 = this.method7075(local112, local115, "xOffset");
		this.anInt8294 = this.method7075(local112, local115, "yOffset");
		this.anInt8308 = this.method7075(local112, local115, "width");
		this.anInt8307 = this.method7075(local112, local115, "height");
		this.anInt8293 = this.method7075(local112, local115, "boxXOffset");
		this.anInt8304 = this.method7075(local112, local115, "boxYOffset");
		this.anInt8296 = this.method7075(local112, local115, "boxWidth");
		this.anInt8313 = this.method7075(local112, local115, "textYOffset");
		this.anInt8291 = this.method7075(local112, local115, "offsetPerTenCycles");
	}

	@OriginalMember(owner = "client!qn", name = "c", descriptor = "(I)I")
	@Override
	public int method7071() {
		return 100;
	}
}
