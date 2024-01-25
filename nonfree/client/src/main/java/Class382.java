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

@OriginalClass("client!wg")
public final class Class382 implements Interface17 {

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "I")
	private int anInt10952;

	@OriginalMember(owner = "client!wg", name = "g", descriptor = "Z")
	private boolean aBoolean748;

	@OriginalMember(owner = "client!wg", name = "h", descriptor = "Ljava/awt/Color;")
	private Color aColor1;

	@OriginalMember(owner = "client!wg", name = "i", descriptor = "Ljava/awt/Image;")
	private Image anImage5;

	@OriginalMember(owner = "client!wg", name = "k", descriptor = "Ljava/awt/Image;")
	private Image anImage6;

	@OriginalMember(owner = "client!wg", name = "m", descriptor = "I")
	private int anInt10960;

	@OriginalMember(owner = "client!wg", name = "n", descriptor = "I")
	private int anInt10961;

	@OriginalMember(owner = "client!wg", name = "o", descriptor = "Ljava/awt/Image;")
	private Image anImage7;

	@OriginalMember(owner = "client!wg", name = "p", descriptor = "I")
	private int anInt10962;

	@OriginalMember(owner = "client!wg", name = "q", descriptor = "I")
	private int anInt10963;

	@OriginalMember(owner = "client!wg", name = "r", descriptor = "Ljava/awt/Image;")
	private Image anImage8;

	@OriginalMember(owner = "client!wg", name = "s", descriptor = "I")
	private int anInt10964;

	@OriginalMember(owner = "client!wg", name = "t", descriptor = "Ljava/awt/Image;")
	private Image anImage9;

	@OriginalMember(owner = "client!wg", name = "v", descriptor = "Ljava/awt/Image;")
	private Image anImage10;

	@OriginalMember(owner = "client!wg", name = "w", descriptor = "Ljava/awt/Font;")
	private Font aFont2;

	@OriginalMember(owner = "client!wg", name = "x", descriptor = "I")
	private int anInt10966;

	@OriginalMember(owner = "client!wg", name = "y", descriptor = "Ljava/awt/Image;")
	private Image anImage11;

	@OriginalMember(owner = "client!wg", name = "B", descriptor = "Z")
	private boolean aBoolean749;

	@OriginalMember(owner = "client!wg", name = "E", descriptor = "I")
	private int anInt10971;

	@OriginalMember(owner = "client!wg", name = "F", descriptor = "I")
	private int anInt10972;

	@OriginalMember(owner = "client!wg", name = "H", descriptor = "Z")
	private boolean aBoolean750;

	@OriginalMember(owner = "client!wg", name = "K", descriptor = "Ljava/awt/Image;")
	private Image anImage12;

	@OriginalMember(owner = "client!wg", name = "L", descriptor = "Ljava/awt/Image;")
	private Image anImage13;

	@OriginalMember(owner = "client!wg", name = "M", descriptor = "Ljava/awt/Image;")
	private Image anImage14;

	@OriginalMember(owner = "client!wg", name = "N", descriptor = "Ljava/awt/FontMetrics;")
	private FontMetrics aFontMetrics1;

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(ZB)V")
	@Override
	public void method9113(@OriginalArg(0) boolean arg0) {
		if (!this.aBoolean750) {
			if (Static645.anApplet2 == null) {
				this.aBoolean750 = true;
			} else if (this.aFont2 == null) {
				try {
					this.method9122();
				} catch (@Pc(23) Exception local23) {
					this.aBoolean750 = true;
				}
			}
		}
		if (this.aBoolean750) {
			this.method9123();
			return;
		}
		@Pc(39) Graphics local39 = Static68.aCanvas2.getGraphics();
		if (local39 == null) {
			Static68.aCanvas2.repaint();
			return;
		}
		try {
			@Pc(58) int local58 = Static292.aClass360_1.method8674();
			@Pc(62) String local62 = Static292.aClass360_1.method8675();
			if (Static350.anImage3 == null) {
				Static350.anImage3 = Static68.aCanvas2.createImage(Static561.anInt9759, Static639.anInt10685);
			}
			@Pc(72) Graphics local72 = Static350.anImage3.getGraphics();
			local72.clearRect(0, 0, Static561.anInt9759, Static639.anInt10685);
			@Pc(83) int local83 = this.anImage8.getWidth((ImageObserver) null);
			@Pc(88) int local88 = this.anImage12.getWidth((ImageObserver) null);
			@Pc(93) int local93 = this.anImage5.getWidth((ImageObserver) null);
			@Pc(98) int local98 = this.anImage8.getHeight((ImageObserver) null);
			@Pc(103) int local103 = this.anImage12.getHeight((ImageObserver) null);
			@Pc(108) int local108 = this.anImage5.getHeight((ImageObserver) null);
			local72.drawImage(this.anImage8, this.method9118(local83) + this.anInt10964 - this.anInt10963 / 2, this.method9124(local98) - -this.anInt10962, (ImageObserver) null);
			@Pc(145) int local145 = local83 + this.anInt10964 - this.anInt10963 / 2;
			@Pc(153) int local153 = this.anInt10963 / 2 + this.anInt10964;
			for (@Pc(155) int local155 = local145; local155 <= local153; local155 += local93) {
				local72.drawImage(this.anImage5, local155 + this.method9118(local83) + this.anInt10964, this.method9124(local108) - -this.anInt10962, (ImageObserver) null);
			}
			local72.drawImage(this.anImage12, this.method9118(local88) + this.anInt10964 + this.anInt10963 / 2, this.method9124(local103) + this.anInt10962, (ImageObserver) null);
			@Pc(224) int local224 = this.anImage6.getWidth((ImageObserver) null);
			@Pc(229) int local229 = this.anImage6.getHeight((ImageObserver) null);
			@Pc(234) int local234 = this.anImage10.getWidth((ImageObserver) null);
			@Pc(239) int local239 = this.anImage10.getHeight((ImageObserver) null);
			@Pc(244) int local244 = this.anImage7.getHeight((ImageObserver) null);
			@Pc(249) int local249 = this.anImage9.getWidth((ImageObserver) null);
			@Pc(254) int local254 = this.anImage9.getHeight((ImageObserver) null);
			@Pc(259) int local259 = this.anImage7.getWidth((ImageObserver) null);
			@Pc(264) int local264 = this.anImage14.getWidth((ImageObserver) null);
			@Pc(269) int local269 = this.anImage11.getWidth((ImageObserver) null);
			@Pc(279) int local279 = this.method9118(this.anInt10972) + this.anInt10971;
			@Pc(288) int local288 = this.method9124(this.anInt10952) + this.anInt10960;
			local72.drawImage(this.anImage6, local279, local288 + (this.anInt10952 - local229) / 2, (ImageObserver) null);
			local72.drawImage(this.anImage10, local279 + this.anInt10972 - local234, local288 - -((this.anInt10952 - local239) / 2), (ImageObserver) null);
			if (this.anImage13 == null) {
				this.anImage13 = Static68.aCanvas2.createImage(this.anInt10972 - local234 - local224, this.anInt10952);
			}
			@Pc(346) Graphics local346 = this.anImage13.getGraphics();
			for (@Pc(348) int local348 = 0; local348 < this.anInt10972 - local224 - local234; local348 += local249) {
				local346.drawImage(this.anImage9, local348, 0, (ImageObserver) null);
			}
			for (@Pc(373) int local373 = 0; local373 < this.anInt10972 - local224 - local234; local373 += local259) {
				local346.drawImage(this.anImage7, local373, this.anInt10952 - local244, (ImageObserver) null);
			}
			@Pc(417) int local417 = local58 * (this.anInt10972 - local224 - local234) / 100;
			@Pc(453) int local453;
			if (local417 > 0) {
				@Pc(431) Image local431 = Static68.aCanvas2.createImage(local417, this.anInt10952 - local244 - local254);
				@Pc(435) int local435 = local431.getWidth((ImageObserver) null);
				@Pc(438) Graphics local438 = local431.getGraphics();
				@Pc(448) int local448 = this.anInt10966 * Static121.method2073() / 10 % local264;
				for (local453 = local448 - local264; local453 < local435; local453 += local264) {
					local438.drawImage(this.anImage14, local453, 0, (ImageObserver) null);
				}
				local346.drawImage(local431, 0, local254, (ImageObserver) null);
			}
			@Pc(483) int local483 = local417;
			local417 = this.anInt10972 - local224 - local234 - local417;
			if (local417 > 0) {
				@Pc(511) Image local511 = Static68.aCanvas2.createImage(local417, this.anInt10952 - local254 - local244);
				@Pc(515) int local515 = local511.getWidth((ImageObserver) null);
				@Pc(518) Graphics local518 = local511.getGraphics();
				for (local453 = 0; local453 < local515; local453 += local269) {
					local518.drawImage(this.anImage11, local453, 0, (ImageObserver) null);
				}
				local346.drawImage(local511, local483, local254, (ImageObserver) null);
			}
			local72.drawImage(this.anImage13, local224 + local279, local288, (ImageObserver) null);
			local72.setFont(this.aFont2);
			local72.setColor(this.aColor1);
			local72.drawString(local62, local279 + (this.anInt10972 - this.aFontMetrics1.stringWidth(local62)) / 2, this.anInt10952 / 2 + 4 + (local288 - -this.anInt10961));
			local39.drawImage(Static350.anImage3, 0, 0, (ImageObserver) null);
		} catch (@Pc(601) Exception local601) {
			this.aBoolean750 = true;
		}
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(II)I")
	private int method9118(@OriginalArg(0) int arg0) {
		return this.aBoolean749 ? (Static561.anInt9759 - arg0) / 2 : 0;
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Class;B)Z")
	private boolean method9119(@OriginalArg(0) Object arg0, @OriginalArg(1) String arg1, @OriginalArg(2) Class arg2) throws IllegalAccessException, NoSuchFieldException {
		@Pc(7) Field local7 = arg2.getDeclaredField(arg1);
		return local7.getBoolean(arg0);
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/Class;)Ljava/lang/Object;")
	private Object method9120(@OriginalArg(0) String arg0, @OriginalArg(2) Class arg1) throws IllegalAccessException, NoSuchFieldException {
		@Pc(7) Field local7 = arg1.getDeclaredField(arg0);
		@Pc(11) Object local11 = local7.get(Static645.anApplet2);
		local7.set(Static645.anApplet2, (Object) null);
		return local11;
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(Z)I")
	@Override
	public int method9115() {
		return 100;
	}

	@OriginalMember(owner = "client!wg", name = "c", descriptor = "(I)V")
	private void method9122() throws IllegalAccessException, NoSuchFieldException {
		@Pc(6) Class local6 = Static645.anApplet2.getClass();
		this.anImage14 = (Image) this.method9120("bar", local6);
		this.anImage11 = (Image) this.method9120("background", local6);
		this.anImage6 = (Image) this.method9120("left", local6);
		this.anImage10 = (Image) this.method9120("right", local6);
		this.anImage9 = (Image) this.method9120("top", local6);
		this.anImage7 = (Image) this.method9120("bottom", local6);
		this.anImage8 = (Image) this.method9120("bodyLeft", local6);
		this.anImage12 = (Image) this.method9120("bodyRight", local6);
		this.anImage5 = (Image) this.method9120("bodyFill", local6);
		this.aFont2 = (Font) this.method9120("bf", local6);
		this.aFontMetrics1 = (FontMetrics) this.method9120("bfm", local6);
		this.aColor1 = (Color) this.method9120("colourtext", local6);
		@Pc(108) Object local108 = this.method9120("lb", local6);
		@Pc(111) Class local111 = local108.getClass();
		this.aBoolean749 = this.method9119(local108, "xMiddle", local111);
		this.aBoolean748 = this.method9119(local108, "yMiddle", local111);
		this.anInt10971 = this.method9125(local111, local108, "xOffset");
		this.anInt10960 = this.method9125(local111, local108, "yOffset");
		this.anInt10972 = this.method9125(local111, local108, "width");
		this.anInt10952 = this.method9125(local111, local108, "height");
		this.anInt10964 = this.method9125(local111, local108, "boxXOffset");
		this.anInt10962 = this.method9125(local111, local108, "boxYOffset");
		this.anInt10963 = this.method9125(local111, local108, "boxWidth");
		this.anInt10961 = this.method9125(local111, local108, "textYOffset");
		this.anInt10966 = this.method9125(local111, local108, "offsetPerTenCycles");
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(B)V")
	@Override
	public void method9114() {
	}

	@OriginalMember(owner = "client!wg", name = "b", descriptor = "(I)V")
	@Override
	public void method9116() {
		Static271.method3955();
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(IJ)Z")
	@Override
	public boolean method9112(@OriginalArg(1) long arg0) {
		return true;
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(I)I")
	@Override
	public int method9111() {
		return 0;
	}

	@OriginalMember(owner = "client!wg", name = "d", descriptor = "(I)V")
	private void method9123() {
		Static448.method6505(Static292.aClass360_1.method8675(), Static292.aClass360_1.method8674(), Static282.aColorArray3[Static557.anInt9476], Static237.aColorArray2[Static557.anInt9476], Static17.aColorArray1[Static557.anInt9476]);
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(BI)I")
	private int method9124(@OriginalArg(1) int arg0) {
		return this.aBoolean748 ? (Static639.anInt10685 - arg0) / 2 : 0;
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(ILjava/lang/Class;Ljava/lang/Object;Ljava/lang/String;)I")
	private int method9125(@OriginalArg(1) Class arg0, @OriginalArg(2) Object arg1, @OriginalArg(3) String arg2) throws IllegalAccessException, NoSuchFieldException {
		@Pc(7) Field local7 = arg0.getDeclaredField(arg2);
		return local7.getInt(arg1);
	}
}
