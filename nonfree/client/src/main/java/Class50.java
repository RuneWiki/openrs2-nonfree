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

@OriginalClass("client!cca")
public final class Class50 implements Interface14 {

	@OriginalMember(owner = "client!cca", name = "a", descriptor = "Ljava/awt/Image;")
	private Image anImage1;

	@OriginalMember(owner = "client!cca", name = "c", descriptor = "I")
	private int anInt1171;

	@OriginalMember(owner = "client!cca", name = "d", descriptor = "Ljava/awt/Image;")
	private Image anImage2;

	@OriginalMember(owner = "client!cca", name = "e", descriptor = "I")
	private int anInt1172;

	@OriginalMember(owner = "client!cca", name = "m", descriptor = "I")
	private int anInt1179;

	@OriginalMember(owner = "client!cca", name = "n", descriptor = "Ljava/awt/Image;")
	private Image anImage3;

	@OriginalMember(owner = "client!cca", name = "o", descriptor = "Ljava/awt/Image;")
	private Image anImage4;

	@OriginalMember(owner = "client!cca", name = "p", descriptor = "Ljava/awt/FontMetrics;")
	private FontMetrics aFontMetrics1;

	@OriginalMember(owner = "client!cca", name = "q", descriptor = "Ljava/awt/Image;")
	private Image anImage5;

	@OriginalMember(owner = "client!cca", name = "r", descriptor = "I")
	private int anInt1180;

	@OriginalMember(owner = "client!cca", name = "s", descriptor = "Z")
	private boolean aBoolean81;

	@OriginalMember(owner = "client!cca", name = "t", descriptor = "Ljava/awt/Font;")
	private Font aFont1;

	@OriginalMember(owner = "client!cca", name = "v", descriptor = "Ljava/awt/Image;")
	private Image anImage6;

	@OriginalMember(owner = "client!cca", name = "x", descriptor = "Ljava/awt/Image;")
	private Image anImage7;

	@OriginalMember(owner = "client!cca", name = "z", descriptor = "I")
	private int anInt1183;

	@OriginalMember(owner = "client!cca", name = "A", descriptor = "Ljava/awt/Image;")
	private Image anImage8;

	@OriginalMember(owner = "client!cca", name = "D", descriptor = "Z")
	private boolean aBoolean83;

	@OriginalMember(owner = "client!cca", name = "G", descriptor = "I")
	private int anInt1188;

	@OriginalMember(owner = "client!cca", name = "I", descriptor = "Ljava/awt/Image;")
	private Image anImage9;

	@OriginalMember(owner = "client!cca", name = "K", descriptor = "Ljava/awt/Image;")
	private Image anImage10;

	@OriginalMember(owner = "client!cca", name = "L", descriptor = "I")
	private int anInt1191;

	@OriginalMember(owner = "client!cca", name = "M", descriptor = "Z")
	private boolean aBoolean84;

	@OriginalMember(owner = "client!cca", name = "P", descriptor = "I")
	private int anInt1194;

	@OriginalMember(owner = "client!cca", name = "R", descriptor = "I")
	private int anInt1195;

	@OriginalMember(owner = "client!cca", name = "U", descriptor = "Ljava/awt/Color;")
	private Color aColor1;

	@OriginalMember(owner = "client!cca", name = "a", descriptor = "(II)I")
	private int method1059(@OriginalArg(1) int arg0) {
		return this.aBoolean84 ? (Static585.anInt9606 - arg0) / 2 : 0;
	}

	@OriginalMember(owner = "client!cca", name = "a", descriptor = "(IB)I")
	private int method1060(@OriginalArg(0) int arg0) {
		return this.aBoolean83 ? (Static571.anInt9399 - arg0) / 2 : 0;
	}

	@OriginalMember(owner = "client!cca", name = "a", descriptor = "(Z)V")
	@Override
	public void method6248() {
	}

	@OriginalMember(owner = "client!cca", name = "a", descriptor = "(B)I")
	@Override
	public int method6245() {
		return 100;
	}

	@OriginalMember(owner = "client!cca", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method6247(@OriginalArg(1) boolean arg0) {
		if (!this.aBoolean81) {
			if (Static234.anApplet2 == null) {
				this.aBoolean81 = true;
			} else if (this.aFont1 == null) {
				try {
					this.method1067();
				} catch (@Pc(23) Exception local23) {
					this.aBoolean81 = true;
				}
			}
		}
		if (this.aBoolean81) {
			this.method1065();
			return;
		}
		@Pc(37) Graphics local37 = Static147.aCanvas5.getGraphics();
		if (local37 == null) {
			Static147.aCanvas5.repaint();
			return;
		}
		try {
			@Pc(47) int local47 = Static368.aClass349_2.method8064();
			@Pc(51) String local51 = Static368.aClass349_2.method8063();
			if (Static263.anImage12 == null) {
				Static263.anImage12 = Static147.aCanvas5.createImage(Static571.anInt9399, Static585.anInt9606);
			}
			@Pc(61) Graphics local61 = Static263.anImage12.getGraphics();
			@Pc(66) int local66 = this.anImage6.getWidth(null);
			@Pc(71) int local71 = this.anImage9.getWidth(null);
			@Pc(76) int local76 = this.anImage7.getWidth(null);
			@Pc(81) int local81 = this.anImage6.getHeight(null);
			@Pc(86) int local86 = this.anImage9.getHeight(null);
			@Pc(91) int local91 = this.anImage7.getHeight(null);
			local61.drawImage(this.anImage6, this.method1060(local66) + this.anInt1179 - this.anInt1195 / 2, this.method1059(local81) + this.anInt1191, null);
			@Pc(127) int local127 = local66 + this.anInt1179 - this.anInt1195 / 2;
			@Pc(135) int local135 = this.anInt1179 + this.anInt1195 / 2;
			for (@Pc(137) int local137 = local127; local137 <= local135; local137 += local76) {
				local61.drawImage(this.anImage7, this.method1060(local66) + this.anInt1179 + local137, this.method1059(local91) + this.anInt1191, null);
			}
			local61.drawImage(this.anImage9, this.method1060(local71) + this.anInt1179 + this.anInt1195 / 2, this.method1059(local86) + this.anInt1191, null);
			@Pc(200) int local200 = this.anImage1.getWidth(null);
			@Pc(205) int local205 = this.anImage1.getHeight(null);
			@Pc(210) int local210 = this.anImage10.getWidth(null);
			@Pc(215) int local215 = this.anImage10.getHeight(null);
			@Pc(220) int local220 = this.anImage2.getHeight(null);
			@Pc(225) int local225 = this.anImage4.getWidth(null);
			@Pc(230) int local230 = this.anImage4.getHeight(null);
			@Pc(235) int local235 = this.anImage2.getWidth(null);
			@Pc(240) int local240 = this.anImage3.getWidth(null);
			@Pc(245) int local245 = this.anImage8.getWidth(null);
			@Pc(254) int local254 = this.method1060(this.anInt1171) + this.anInt1180;
			@Pc(264) int local264 = this.method1059(this.anInt1183) + this.anInt1172;
			local61.drawImage(this.anImage1, local254, local264 + (this.anInt1183 - local205) / 2, null);
			local61.drawImage(this.anImage10, local254 + this.anInt1171 - local210, local264 - -((this.anInt1183 - local215) / 2), null);
			if (this.anImage5 == null) {
				this.anImage5 = Static147.aCanvas5.createImage(this.anInt1171 - local200 - local210, this.anInt1183);
			}
			@Pc(325) Graphics local325 = this.anImage5.getGraphics();
			for (@Pc(327) int local327 = 0; local327 < this.anInt1171 - local200 - local210; local327 += local225) {
				local325.drawImage(this.anImage4, local327, 0, null);
			}
			for (@Pc(355) int local355 = 0; local355 < this.anInt1171 - local200 - local210; local355 += local235) {
				local325.drawImage(this.anImage2, local355, this.anInt1183 - local220, null);
			}
			@Pc(396) int local396 = (this.anInt1171 - local210 - local200) * local47 / 100;
			@Pc(434) int local434;
			if (local396 > 0) {
				@Pc(413) Image local413 = Static147.aCanvas5.createImage(local396, this.anInt1183 - local230 - local220);
				@Pc(417) int local417 = local413.getWidth(null);
				@Pc(420) Graphics local420 = local413.getGraphics();
				@Pc(430) int local430 = this.anInt1188 * Static438.method6518() / 10 % local240;
				for (local434 = local430 - local240; local434 < local417; local434 += local240) {
					local420.drawImage(this.anImage3, local434, 0, null);
				}
				local325.drawImage(local413, 0, local230, null);
			}
			@Pc(460) int local460 = local396;
			local396 = this.anInt1171 - local200 - local210 - local396;
			if (local396 > 0) {
				@Pc(488) Image local488 = Static147.aCanvas5.createImage(local396, this.anInt1183 - local220 - local230);
				@Pc(492) int local492 = local488.getWidth(null);
				@Pc(495) Graphics local495 = local488.getGraphics();
				for (local434 = 0; local434 < local492; local434 += local245) {
					local495.drawImage(this.anImage8, local434, 0, null);
				}
				local325.drawImage(local488, local460, local230, null);
			}
			local61.drawImage(this.anImage5, local254 + local200, local264, null);
			local61.setFont(this.aFont1);
			local61.setColor(this.aColor1);
			local61.drawString(local51, local254 + (this.anInt1171 - this.aFontMetrics1.stringWidth(local51)) / 2, local264 + (this.anInt1183 / 2 - -4) + this.anInt1194);
			local37.drawImage(Static263.anImage12, 0, 0, null);
		} catch (@Pc(578) Exception local578) {
			this.aBoolean81 = true;
		}
	}

	@OriginalMember(owner = "client!cca", name = "a", descriptor = "(JI)Z")
	@Override
	public boolean method6249(@OriginalArg(0) long arg0) {
		return true;
	}

	@OriginalMember(owner = "client!cca", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Object;I)I")
	private int method1061(@OriginalArg(0) String arg0, @OriginalArg(1) Class arg1, @OriginalArg(2) Object arg2) throws IllegalAccessException, NoSuchFieldException {
		@Pc(7) Field local7 = arg1.getDeclaredField(arg0);
		return local7.getInt(arg2);
	}

	@OriginalMember(owner = "client!cca", name = "a", descriptor = "(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;)Z")
	private boolean method1064(@OriginalArg(1) Object arg0, @OriginalArg(2) Class arg1, @OriginalArg(3) String arg2) throws IllegalAccessException, NoSuchFieldException {
		@Pc(7) Field local7 = arg1.getDeclaredField(arg2);
		return local7.getBoolean(arg0);
	}

	@OriginalMember(owner = "client!cca", name = "a", descriptor = "(I)V")
	@Override
	public void method6244() {
		Static47.method937();
	}

	@OriginalMember(owner = "client!cca", name = "c", descriptor = "(I)V")
	private void method1065() {
		Static345.method5394(Static597.aColorArray2[Static352.anInt6476], Static419.aColorArray1[Static352.anInt6476], Static368.aClass349_2.method8064(), Static368.aClass349_2.method8063(), Static642.aColorArray3[Static352.anInt6476]);
	}

	@OriginalMember(owner = "client!cca", name = "c", descriptor = "(B)V")
	private void method1067() throws IllegalAccessException, NoSuchFieldException {
		@Pc(6) Class local6 = Static234.anApplet2.getClass();
		this.anImage3 = (Image) this.method1068("bar", local6);
		this.anImage8 = (Image) this.method1068("background", local6);
		this.anImage1 = (Image) this.method1068("left", local6);
		this.anImage10 = (Image) this.method1068("right", local6);
		this.anImage4 = (Image) this.method1068("top", local6);
		this.anImage2 = (Image) this.method1068("bottom", local6);
		this.anImage6 = (Image) this.method1068("bodyLeft", local6);
		this.anImage9 = (Image) this.method1068("bodyRight", local6);
		this.anImage7 = (Image) this.method1068("bodyFill", local6);
		this.aFont1 = (Font) this.method1068("bf", local6);
		this.aFontMetrics1 = (FontMetrics) this.method1068("bfm", local6);
		this.aColor1 = (Color) this.method1068("colourtext", local6);
		@Pc(108) Object local108 = this.method1068("lb", local6);
		@Pc(111) Class local111 = local108.getClass();
		this.aBoolean83 = this.method1064(local108, local111, "xMiddle");
		this.aBoolean84 = this.method1064(local108, local111, "yMiddle");
		this.anInt1180 = this.method1061("xOffset", local111, local108);
		this.anInt1172 = this.method1061("yOffset", local111, local108);
		this.anInt1171 = this.method1061("width", local111, local108);
		this.anInt1183 = this.method1061("height", local111, local108);
		this.anInt1179 = this.method1061("boxXOffset", local111, local108);
		this.anInt1191 = this.method1061("boxYOffset", local111, local108);
		this.anInt1195 = this.method1061("boxWidth", local111, local108);
		this.anInt1194 = this.method1061("textYOffset", local111, local108);
		this.anInt1188 = this.method1061("offsetPerTenCycles", local111, local108);
	}

	@OriginalMember(owner = "client!cca", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Class;Z)Ljava/lang/Object;")
	private Object method1068(@OriginalArg(0) String arg0, @OriginalArg(1) Class arg1) throws IllegalAccessException, NoSuchFieldException {
		@Pc(7) Field local7 = arg1.getDeclaredField(arg0);
		@Pc(11) Object local11 = local7.get(Static234.anApplet2);
		local7.set(Static234.anApplet2, null);
		return local11;
	}

	@OriginalMember(owner = "client!cca", name = "b", descriptor = "(I)I")
	@Override
	public int method6246() {
		return 0;
	}
}
