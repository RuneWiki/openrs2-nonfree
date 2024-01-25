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

@OriginalClass("client!pe")
public final class Class249 implements Interface12 {

	@OriginalMember(owner = "client!pe", name = "c", descriptor = "Ljava/awt/Color;")
	private Color aColor1;

	@OriginalMember(owner = "client!pe", name = "e", descriptor = "I")
	private int anInt6824;

	@OriginalMember(owner = "client!pe", name = "g", descriptor = "I")
	private int anInt6826;

	@OriginalMember(owner = "client!pe", name = "h", descriptor = "Ljava/awt/Image;")
	private Image anImage3;

	@OriginalMember(owner = "client!pe", name = "i", descriptor = "Ljava/awt/Image;")
	private Image anImage4;

	@OriginalMember(owner = "client!pe", name = "q", descriptor = "Ljava/awt/Image;")
	private Image anImage5;

	@OriginalMember(owner = "client!pe", name = "s", descriptor = "Ljava/awt/Image;")
	private Image anImage6;

	@OriginalMember(owner = "client!pe", name = "t", descriptor = "I")
	private int anInt6834;

	@OriginalMember(owner = "client!pe", name = "v", descriptor = "I")
	private int anInt6836;

	@OriginalMember(owner = "client!pe", name = "w", descriptor = "Ljava/awt/Image;")
	private Image anImage7;

	@OriginalMember(owner = "client!pe", name = "x", descriptor = "Ljava/awt/Font;")
	private Font aFont1;

	@OriginalMember(owner = "client!pe", name = "y", descriptor = "Ljava/awt/Image;")
	private Image anImage8;

	@OriginalMember(owner = "client!pe", name = "z", descriptor = "I")
	private int anInt6837;

	@OriginalMember(owner = "client!pe", name = "A", descriptor = "Ljava/awt/FontMetrics;")
	private FontMetrics aFontMetrics1;

	@OriginalMember(owner = "client!pe", name = "B", descriptor = "Z")
	private boolean aBoolean467;

	@OriginalMember(owner = "client!pe", name = "D", descriptor = "Ljava/awt/Image;")
	private Image anImage9;

	@OriginalMember(owner = "client!pe", name = "E", descriptor = "Ljava/awt/Image;")
	private Image anImage10;

	@OriginalMember(owner = "client!pe", name = "F", descriptor = "Ljava/awt/Image;")
	private Image anImage11;

	@OriginalMember(owner = "client!pe", name = "G", descriptor = "Ljava/awt/Image;")
	private Image anImage12;

	@OriginalMember(owner = "client!pe", name = "H", descriptor = "I")
	private int anInt6839;

	@OriginalMember(owner = "client!pe", name = "b", descriptor = "(I)I")
	@Override
	public int method5733() {
		return 100;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(Z)V")
	@Override
	public void method5729() {
	}

	@OriginalMember(owner = "client!pe", name = "c", descriptor = "(I)V")
	private void method5734() {
		Static488.method4437(Static509.aClass236_6.method5509(), Static170.aColorArray2[Static178.anInt3725], Static95.aColorArray1[Static178.anInt3725], Static509.aClass236_6.method5513(), Static377.aColorArray3[Static178.anInt3725]);
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(I)I")
	@Override
	public int method5732() {
		return 0;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Class;Z)Ljava/lang/Object;")
	private Object method5737(@OriginalArg(0) String arg0, @OriginalArg(1) Class arg1) throws IllegalAccessException, NoSuchFieldException {
		@Pc(13) Field local13 = arg1.getDeclaredField(arg0);
		@Pc(17) Object local17 = local13.get(Static249.anApplet1);
		local13.set(Static249.anApplet1, null);
		return local17;
	}

	@OriginalMember(owner = "client!pe", name = "d", descriptor = "(I)V")
	private void method5739() throws IllegalAccessException, NoSuchFieldException {
		@Pc(6) Class local6 = Static249.anApplet1.getClass();
		this.anImage8 = (Image) this.method5737("bar", local6);
		this.anImage10 = (Image) this.method5737("background", local6);
		this.anImage9 = (Image) this.method5737("left", local6);
		this.anImage11 = (Image) this.method5737("right", local6);
		this.anImage12 = (Image) this.method5737("top", local6);
		this.anImage7 = (Image) this.method5737("bottom", local6);
		this.anImage6 = (Image) this.method5737("bodyLeft", local6);
		this.anImage3 = (Image) this.method5737("bodyRight", local6);
		this.anImage5 = (Image) this.method5737("bodyFill", local6);
		this.aFont1 = (Font) this.method5737("bf", local6);
		this.aFontMetrics1 = (FontMetrics) this.method5737("bfm", local6);
		this.aColor1 = (Color) this.method5737("colourtext", local6);
		@Pc(108) Object local108 = this.method5737("lb", local6);
		@Pc(119) Class local119 = local108.getClass();
		this.anInt6824 = this.method5741(local108, "xOffset", local119);
		this.anInt6834 = this.method5741(local108, "yOffset", local119);
		this.anInt6839 = this.method5741(local108, "width", local119);
		this.anInt6837 = this.method5741(local108, "height", local119);
		this.anInt6836 = this.method5741(local108, "textYOffset", local119);
		this.anInt6826 = this.method5741(local108, "offsetPerTenCycles", local119);
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(ILjava/lang/Object;Ljava/lang/String;Ljava/lang/Class;)I")
	private int method5741(@OriginalArg(1) Object arg0, @OriginalArg(2) String arg1, @OriginalArg(3) Class arg2) throws IllegalAccessException, NoSuchFieldException {
		@Pc(13) Field local13 = arg2.getDeclaredField(arg1);
		return local13.getInt(arg0);
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(JI)Z")
	@Override
	public boolean method5730(@OriginalArg(0) long arg0) {
		return true;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(B)V")
	@Override
	public void method5731() {
		Static512.method7104();
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method5728(@OriginalArg(0) boolean arg0) {
		if (!this.aBoolean467) {
			if (Static249.anApplet1 == null) {
				this.aBoolean467 = true;
			} else if (this.aFont1 == null) {
				try {
					this.method5739();
				} catch (@Pc(14) Exception local14) {
					this.aBoolean467 = true;
				}
			}
		}
		if (this.aBoolean467) {
			this.method5734();
			return;
		}
		@Pc(36) Graphics local36 = Static32.aCanvas3.getGraphics();
		if (local36 == null) {
			Static32.aCanvas3.repaint();
			return;
		}
		try {
			@Pc(51) int local51 = Static509.aClass236_6.method5509();
			@Pc(55) String local55 = Static509.aClass236_6.method5513();
			if (Static34.anImage1 == null) {
				Static34.anImage1 = Static32.aCanvas3.createImage(Static240.anInt4852, Static196.anInt4059);
			}
			@Pc(65) Graphics local65 = Static34.anImage1.getGraphics();
			@Pc(70) int local70 = this.anImage6.getWidth(null);
			@Pc(75) int local75 = this.anImage3.getWidth(null);
			@Pc(80) int local80 = this.anImage5.getWidth(null);
			@Pc(85) int local85 = this.anImage6.getHeight(null);
			@Pc(90) int local90 = this.anImage3.getHeight(null);
			@Pc(95) int local95 = this.anImage5.getHeight(null);
			local65.drawImage(this.anImage6, (Static240.anInt4852 - local70) / 2 - 161, (-local85 + Static196.anInt4059) / 2 - -214, null);
			for (@Pc(119) int local119 = -144; local119 <= 144; local119 += 32) {
				local65.drawImage(this.anImage5, (Static240.anInt4852 - local80) / 2 - local119, (Static196.anInt4059 + -local95) / 2 + 214, null);
			}
			local65.drawImage(this.anImage3, (Static240.anInt4852 - local75) / 2 + 161, (-local90 + Static196.anInt4059) / 2 + 214, null);
			@Pc(175) int local175 = this.anImage9.getWidth(null);
			@Pc(180) int local180 = this.anImage9.getHeight(null);
			@Pc(185) int local185 = this.anImage11.getWidth(null);
			@Pc(190) int local190 = this.anImage11.getHeight(null);
			@Pc(195) int local195 = this.anImage7.getHeight(null);
			@Pc(200) int local200 = this.anImage12.getWidth(null);
			@Pc(205) int local205 = this.anImage12.getHeight(null);
			@Pc(210) int local210 = this.anImage7.getWidth(null);
			@Pc(215) int local215 = this.anImage8.getWidth(null);
			@Pc(220) int local220 = this.anImage10.getWidth(null);
			@Pc(230) int local230 = this.anInt6824 + (Static240.anInt4852 - this.anInt6839) / 2;
			@Pc(240) int local240 = (Static196.anInt4059 - this.anInt6837) / 2 + this.anInt6834;
			local65.drawImage(this.anImage9, local230, (this.anInt6837 - local180) / 2 + local240, null);
			local65.drawImage(this.anImage11, this.anInt6839 + local230 - local185, (this.anInt6837 - local190) / 2 + local240, null);
			if (this.anImage4 == null) {
				this.anImage4 = Static32.aCanvas3.createImage(this.anInt6839 - local175 - local185, this.anInt6837);
			}
			@Pc(297) Graphics local297 = this.anImage4.getGraphics();
			for (@Pc(299) int local299 = 0; local299 < this.anInt6839 - local185 - local175; local299 += local200) {
				local297.drawImage(this.anImage12, local299, 0, null);
			}
			for (@Pc(325) int local325 = 0; local325 < this.anInt6839 - local185 - local175; local325 += local210) {
				local297.drawImage(this.anImage7, local325, this.anInt6837 - local195, null);
			}
			@Pc(365) int local365 = (this.anInt6839 - local175 - local185) * local51 / 100;
			@Pc(401) int local401;
			if (local365 > 0) {
				@Pc(379) Image local379 = Static32.aCanvas3.createImage(local365, this.anInt6837 - local195 - local205);
				@Pc(383) int local383 = local379.getWidth(null);
				@Pc(386) Graphics local386 = local379.getGraphics();
				@Pc(396) int local396 = this.anInt6826 * Static532.method7232() / 10 % local215;
				for (local401 = local396 - local215; local401 < local383; local401 += local215) {
					local386.drawImage(this.anImage8, local401, 0, null);
				}
				local297.drawImage(local379, 0, local205, null);
			}
			@Pc(427) int local427 = local365;
			local365 = this.anInt6839 - local175 - local185 - local365;
			if (local365 > 0) {
				@Pc(452) Image local452 = Static32.aCanvas3.createImage(local365, this.anInt6837 - local195 - local205);
				@Pc(456) int local456 = local452.getWidth(null);
				@Pc(459) Graphics local459 = local452.getGraphics();
				for (local401 = 0; local401 < local456; local401 += local220) {
					local459.drawImage(this.anImage10, local401, 0, null);
				}
				local297.drawImage(local452, local427, local205, null);
			}
			local65.drawImage(this.anImage4, local230 + local175, local240, null);
			local65.setFont(this.aFont1);
			local65.setColor(this.aColor1);
			local65.drawString(local55, (this.anInt6839 - this.aFontMetrics1.stringWidth(local55)) / 2 + local230, this.anInt6837 / 2 + 4 + local240 + this.anInt6836);
			local36.drawImage(Static34.anImage1, 0, 0, null);
		} catch (@Pc(542) Exception local542) {
			this.aBoolean467 = true;
		}
	}
}
