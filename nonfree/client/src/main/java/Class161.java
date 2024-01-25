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

@OriginalClass("client!ij")
public final class Class161 implements Interface24 {

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "Ljava/awt/Image;")
	private Image anImage2;

	@OriginalMember(owner = "client!ij", name = "d", descriptor = "I")
	private int anInt4485;

	@OriginalMember(owner = "client!ij", name = "h", descriptor = "Ljava/awt/Image;")
	private Image anImage3;

	@OriginalMember(owner = "client!ij", name = "i", descriptor = "Ljava/awt/Image;")
	private Image anImage4;

	@OriginalMember(owner = "client!ij", name = "j", descriptor = "Ljava/awt/Image;")
	private Image anImage5;

	@OriginalMember(owner = "client!ij", name = "k", descriptor = "I")
	private int anInt4489;

	@OriginalMember(owner = "client!ij", name = "l", descriptor = "Ljava/awt/Image;")
	private Image anImage6;

	@OriginalMember(owner = "client!ij", name = "m", descriptor = "Ljava/awt/FontMetrics;")
	private FontMetrics aFontMetrics1;

	@OriginalMember(owner = "client!ij", name = "q", descriptor = "Ljava/awt/Image;")
	private Image anImage7;

	@OriginalMember(owner = "client!ij", name = "r", descriptor = "Ljava/awt/Image;")
	private Image anImage8;

	@OriginalMember(owner = "client!ij", name = "s", descriptor = "I")
	private int anInt4493;

	@OriginalMember(owner = "client!ij", name = "t", descriptor = "I")
	private int anInt4494;

	@OriginalMember(owner = "client!ij", name = "u", descriptor = "I")
	private int anInt4495;

	@OriginalMember(owner = "client!ij", name = "v", descriptor = "Ljava/awt/Image;")
	private Image anImage9;

	@OriginalMember(owner = "client!ij", name = "w", descriptor = "Ljava/awt/Image;")
	private Image anImage10;

	@OriginalMember(owner = "client!ij", name = "z", descriptor = "Z")
	private boolean aBoolean344;

	@OriginalMember(owner = "client!ij", name = "A", descriptor = "Ljava/awt/Font;")
	private Font aFont2;

	@OriginalMember(owner = "client!ij", name = "B", descriptor = "I")
	private int anInt4498;

	@OriginalMember(owner = "client!ij", name = "C", descriptor = "Ljava/awt/Color;")
	private Color aColor1;

	@OriginalMember(owner = "client!ij", name = "G", descriptor = "Ljava/awt/Image;")
	private Image anImage11;

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Class;I)Ljava/lang/Object;")
	private Object method3800(@OriginalArg(0) String arg0, @OriginalArg(1) Class arg1) throws IllegalAccessException, NoSuchFieldException {
		@Pc(12) Field local12 = arg1.getDeclaredField(arg0);
		@Pc(16) Object local16 = local12.get(Static253.anApplet3);
		local12.set(Static253.anApplet3, null);
		return local16;
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(ZJ)Z")
	@Override
	public boolean method6801(@OriginalArg(1) long arg0) {
		return true;
	}

	@OriginalMember(owner = "client!ij", name = "b", descriptor = "(I)V")
	@Override
	public void method6803() {
		Static240.method4169();
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(I)V")
	@Override
	public void method6802() {
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(ZI)V")
	@Override
	public void method6799(@OriginalArg(0) boolean arg0) {
		if (!this.aBoolean344) {
			if (Static253.anApplet3 == null) {
				this.aBoolean344 = true;
			} else if (this.aFont2 == null) {
				try {
					this.method3801();
				} catch (@Pc(19) Exception local19) {
					this.aBoolean344 = true;
				}
			}
		}
		if (this.aBoolean344) {
			this.method3803();
			return;
		}
		@Pc(39) Graphics local39 = Static545.aCanvas14.getGraphics();
		if (local39 == null) {
			Static545.aCanvas14.repaint();
			return;
		}
		try {
			@Pc(49) int local49 = Static313.aClass163_1.method3926();
			@Pc(53) String local53 = Static313.aClass163_1.method3923();
			if (Static350.anImage12 == null) {
				Static350.anImage12 = Static545.aCanvas14.createImage(Static582.anInt10234, Static294.anInt10217);
			}
			@Pc(63) Graphics local63 = Static350.anImage12.getGraphics();
			@Pc(68) int local68 = this.anImage5.getWidth(null);
			@Pc(73) int local73 = this.anImage4.getWidth(null);
			@Pc(78) int local78 = this.anImage9.getWidth(null);
			@Pc(83) int local83 = this.anImage5.getHeight(null);
			@Pc(88) int local88 = this.anImage4.getHeight(null);
			@Pc(93) int local93 = this.anImage9.getHeight(null);
			local63.drawImage(this.anImage5, (Static582.anInt10234 - local68) / 2 - 161, (Static294.anInt10217 + -local83) / 2 + 214, null);
			for (@Pc(117) int local117 = -144; local117 <= 144; local117 += 32) {
				local63.drawImage(this.anImage9, (Static582.anInt10234 - local78) / 2 - local117, (Static294.anInt10217 - local93) / 2 + 214, null);
			}
			local63.drawImage(this.anImage4, (Static582.anInt10234 - local73) / 2 + 161, (Static294.anInt10217 - local88) / 2 + 214, null);
			@Pc(172) int local172 = this.anImage3.getWidth(null);
			@Pc(177) int local177 = this.anImage3.getHeight(null);
			@Pc(182) int local182 = this.anImage6.getWidth(null);
			@Pc(187) int local187 = this.anImage6.getHeight(null);
			@Pc(192) int local192 = this.anImage7.getHeight(null);
			@Pc(197) int local197 = this.anImage11.getWidth(null);
			@Pc(202) int local202 = this.anImage11.getHeight(null);
			@Pc(207) int local207 = this.anImage7.getWidth(null);
			@Pc(212) int local212 = this.anImage2.getWidth(null);
			@Pc(217) int local217 = this.anImage10.getWidth(null);
			@Pc(229) int local229 = (Static582.anInt10234 - this.anInt4489) / 2 + this.anInt4493;
			@Pc(240) int local240 = this.anInt4495 + (Static294.anInt10217 - this.anInt4485) / 2;
			local63.drawImage(this.anImage3, local229, (this.anInt4485 - local177) / 2 + local240, null);
			local63.drawImage(this.anImage6, local229 + this.anInt4489 - local182, local240 - -((-local187 + this.anInt4485) / 2), null);
			if (this.anImage8 == null) {
				this.anImage8 = Static545.aCanvas14.createImage(this.anInt4489 - local182 - local172, this.anInt4485);
			}
			@Pc(300) Graphics local300 = this.anImage8.getGraphics();
			for (@Pc(302) int local302 = 0; local302 < this.anInt4489 - local182 - local172; local302 += local197) {
				local300.drawImage(this.anImage11, local302, 0, null);
			}
			for (@Pc(327) int local327 = 0; local327 < this.anInt4489 - local182 - local172; local327 += local207) {
				local300.drawImage(this.anImage7, local327, this.anInt4485 - local192, null);
			}
			@Pc(367) int local367 = local49 * (this.anInt4489 - local172 - local182) / 100;
			@Pc(406) int local406;
			if (local367 > 0) {
				@Pc(384) Image local384 = Static545.aCanvas14.createImage(local367, this.anInt4485 - local192 - local202);
				@Pc(388) int local388 = local384.getWidth(null);
				@Pc(391) Graphics local391 = local384.getGraphics();
				@Pc(401) int local401 = this.anInt4498 * Static594.method8380() / 10 % local212;
				for (local406 = local401 - local212; local406 < local388; local406 += local212) {
					local391.drawImage(this.anImage2, local406, 0, null);
				}
				local300.drawImage(local384, 0, local202, null);
			}
			@Pc(436) int local436 = local367;
			local367 = this.anInt4489 - local367 - local182 - local172;
			if (local367 > 0) {
				@Pc(465) Image local465 = Static545.aCanvas14.createImage(local367, this.anInt4485 - local202 - local192);
				@Pc(469) int local469 = local465.getWidth(null);
				@Pc(472) Graphics local472 = local465.getGraphics();
				for (local406 = 0; local406 < local469; local406 += local217) {
					local472.drawImage(this.anImage10, local406, 0, null);
				}
				local300.drawImage(local465, local436, local202, null);
			}
			local63.drawImage(this.anImage8, local229 + local172, local240, null);
			local63.setFont(this.aFont2);
			local63.setColor(this.aColor1);
			local63.drawString(local53, (this.anInt4489 - this.aFontMetrics1.stringWidth(local53)) / 2 + local229, this.anInt4494 + 4 + local240 + this.anInt4485 / 2);
			local39.drawImage(Static350.anImage12, 0, 0, null);
		} catch (@Pc(551) Exception local551) {
			this.aBoolean344 = true;
		}
	}

	@OriginalMember(owner = "client!ij", name = "d", descriptor = "(I)V")
	private void method3801() throws IllegalAccessException, NoSuchFieldException {
		@Pc(6) Class local6 = Static253.anApplet3.getClass();
		this.anImage2 = (Image) this.method3800("bar", local6);
		this.anImage10 = (Image) this.method3800("background", local6);
		this.anImage3 = (Image) this.method3800("left", local6);
		this.anImage6 = (Image) this.method3800("right", local6);
		this.anImage11 = (Image) this.method3800("top", local6);
		this.anImage7 = (Image) this.method3800("bottom", local6);
		this.anImage5 = (Image) this.method3800("bodyLeft", local6);
		this.anImage4 = (Image) this.method3800("bodyRight", local6);
		this.anImage9 = (Image) this.method3800("bodyFill", local6);
		this.aFont2 = (Font) this.method3800("bf", local6);
		this.aFontMetrics1 = (FontMetrics) this.method3800("bfm", local6);
		this.aColor1 = (Color) this.method3800("colourtext", local6);
		@Pc(120) Object local120 = this.method3800("lb", local6);
		@Pc(123) Class local123 = local120.getClass();
		this.anInt4493 = this.method3805("xOffset", local123, local120);
		this.anInt4495 = this.method3805("yOffset", local123, local120);
		this.anInt4489 = this.method3805("width", local123, local120);
		this.anInt4485 = this.method3805("height", local123, local120);
		this.anInt4494 = this.method3805("textYOffset", local123, local120);
		this.anInt4498 = this.method3805("offsetPerTenCycles", local123, local120);
	}

	@OriginalMember(owner = "client!ij", name = "c", descriptor = "(I)I")
	@Override
	public int method6804() {
		return 0;
	}

	@OriginalMember(owner = "client!ij", name = "f", descriptor = "(I)V")
	private void method3803() {
		Static275.method4788(Static553.aColorArray6[Static4.anInt227], Static300.aColorArray5[Static4.anInt227], Static144.aColorArray1[Static4.anInt227], Static313.aClass163_1.method3926(), Static313.aClass163_1.method3923());
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/Class;Ljava/lang/Object;)I")
	private int method3805(@OriginalArg(1) String arg0, @OriginalArg(2) Class arg1, @OriginalArg(3) Object arg2) throws IllegalAccessException, NoSuchFieldException {
		@Pc(7) Field local7 = arg1.getDeclaredField(arg0);
		return local7.getInt(arg2);
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(B)I")
	@Override
	public int method6800() {
		return 100;
	}
}
