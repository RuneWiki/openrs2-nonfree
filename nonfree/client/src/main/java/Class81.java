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

@OriginalClass("client!eo")
public final class Class81 implements Interface13 {

	@OriginalMember(owner = "client!eo", name = "d", descriptor = "Ljava/awt/Image;")
	private Image anImage2;

	@OriginalMember(owner = "client!eo", name = "g", descriptor = "Ljava/awt/Image;")
	private Image anImage3;

	@OriginalMember(owner = "client!eo", name = "i", descriptor = "Ljava/awt/Image;")
	private Image anImage4;

	@OriginalMember(owner = "client!eo", name = "j", descriptor = "I")
	private int anInt2763;

	@OriginalMember(owner = "client!eo", name = "k", descriptor = "I")
	private int anInt2764;

	@OriginalMember(owner = "client!eo", name = "l", descriptor = "Z")
	private boolean aBoolean231;

	@OriginalMember(owner = "client!eo", name = "m", descriptor = "Z")
	private boolean aBoolean232;

	@OriginalMember(owner = "client!eo", name = "n", descriptor = "Ljava/awt/Image;")
	private Image anImage5;

	@OriginalMember(owner = "client!eo", name = "p", descriptor = "I")
	private int anInt2766;

	@OriginalMember(owner = "client!eo", name = "q", descriptor = "Ljava/awt/Image;")
	private Image anImage6;

	@OriginalMember(owner = "client!eo", name = "r", descriptor = "Ljava/awt/Image;")
	private Image anImage7;

	@OriginalMember(owner = "client!eo", name = "s", descriptor = "Ljava/awt/Image;")
	private Image anImage8;

	@OriginalMember(owner = "client!eo", name = "t", descriptor = "Ljava/awt/Font;")
	private Font aFont1;

	@OriginalMember(owner = "client!eo", name = "u", descriptor = "Ljava/awt/Image;")
	private Image anImage9;

	@OriginalMember(owner = "client!eo", name = "v", descriptor = "I")
	private int anInt2767;

	@OriginalMember(owner = "client!eo", name = "x", descriptor = "I")
	private int anInt2769;

	@OriginalMember(owner = "client!eo", name = "y", descriptor = "I")
	private int anInt2770;

	@OriginalMember(owner = "client!eo", name = "A", descriptor = "I")
	private int anInt2772;

	@OriginalMember(owner = "client!eo", name = "C", descriptor = "Ljava/awt/Image;")
	private Image anImage10;

	@OriginalMember(owner = "client!eo", name = "E", descriptor = "Ljava/awt/FontMetrics;")
	private FontMetrics aFontMetrics1;

	@OriginalMember(owner = "client!eo", name = "I", descriptor = "I")
	private int anInt2777;

	@OriginalMember(owner = "client!eo", name = "J", descriptor = "Z")
	private boolean aBoolean233;

	@OriginalMember(owner = "client!eo", name = "K", descriptor = "Ljava/awt/Color;")
	private Color aColor1;

	@OriginalMember(owner = "client!eo", name = "N", descriptor = "I")
	private int anInt2779;

	@OriginalMember(owner = "client!eo", name = "P", descriptor = "Ljava/awt/Image;")
	private Image anImage11;

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(Ljava/lang/Object;ILjava/lang/String;Ljava/lang/Class;)I")
	private int method2525(@OriginalArg(0) Object arg0, @OriginalArg(2) String arg1, @OriginalArg(3) Class arg2) throws IllegalAccessException, NoSuchFieldException {
		@Pc(12) Field local12 = arg2.getDeclaredField(arg1);
		return local12.getInt(arg0);
	}

	@OriginalMember(owner = "client!eo", name = "c", descriptor = "(B)V")
	private void method2526() throws IllegalAccessException, NoSuchFieldException {
		@Pc(6) Class local6 = Static533.anApplet4.getClass();
		this.anImage9 = (Image) this.method2531("bar", local6);
		this.anImage8 = (Image) this.method2531("background", local6);
		this.anImage10 = (Image) this.method2531("left", local6);
		this.anImage3 = (Image) this.method2531("right", local6);
		this.anImage7 = (Image) this.method2531("top", local6);
		this.anImage6 = (Image) this.method2531("bottom", local6);
		this.anImage5 = (Image) this.method2531("bodyLeft", local6);
		this.anImage11 = (Image) this.method2531("bodyRight", local6);
		this.anImage2 = (Image) this.method2531("bodyFill", local6);
		this.aFont1 = (Font) this.method2531("bf", local6);
		this.aFontMetrics1 = (FontMetrics) this.method2531("bfm", local6);
		this.aColor1 = (Color) this.method2531("colourtext", local6);
		@Pc(122) Object local122 = this.method2531("lb", local6);
		@Pc(125) Class local125 = local122.getClass();
		this.aBoolean233 = this.method2532(local125, local122, "xMiddle");
		this.aBoolean231 = this.method2532(local125, local122, "yMiddle");
		this.anInt2777 = this.method2525(local122, "xOffset", local125);
		this.anInt2763 = this.method2525(local122, "yOffset", local125);
		this.anInt2767 = this.method2525(local122, "width", local125);
		this.anInt2769 = this.method2525(local122, "height", local125);
		this.anInt2770 = this.method2525(local122, "boxXOffset", local125);
		this.anInt2772 = this.method2525(local122, "boxYOffset", local125);
		this.anInt2779 = this.method2525(local122, "boxWidth", local125);
		this.anInt2766 = this.method2525(local122, "textYOffset", local125);
		this.anInt2764 = this.method2525(local122, "offsetPerTenCycles", local125);
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(II)I")
	private int method2527(@OriginalArg(0) int arg0) {
		return this.aBoolean233 ? (Static318.anInt5754 - arg0) / 2 : 0;
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(ZB)V")
	@Override
	public void method5345(@OriginalArg(0) boolean arg0) {
		if (!this.aBoolean232) {
			if (Static533.anApplet4 == null) {
				this.aBoolean232 = true;
			} else if (this.aFont1 == null) {
				try {
					this.method2526();
				} catch (@Pc(19) Exception local19) {
					this.aBoolean232 = true;
				}
			}
		}
		if (this.aBoolean232) {
			this.method2533();
			return;
		}
		@Pc(37) Graphics local37 = Static347.aCanvas9.getGraphics();
		if (local37 == null) {
			Static347.aCanvas9.repaint();
			return;
		}
		try {
			@Pc(45) int local45 = Static268.aClass366_1.method7804();
			@Pc(49) String local49 = Static268.aClass366_1.method7794();
			if (Static583.anImage13 == null) {
				Static583.anImage13 = Static347.aCanvas9.createImage(Static318.anInt5754, Static447.anInt7372);
			}
			@Pc(59) Graphics local59 = Static583.anImage13.getGraphics();
			@Pc(64) int local64 = this.anImage5.getWidth(null);
			@Pc(69) int local69 = this.anImage11.getWidth(null);
			@Pc(74) int local74 = this.anImage2.getWidth(null);
			@Pc(79) int local79 = this.anImage5.getHeight(null);
			@Pc(84) int local84 = this.anImage11.getHeight(null);
			@Pc(89) int local89 = this.anImage2.getHeight(null);
			local59.drawImage(this.anImage5, this.method2527(local64) + this.anInt2770 - this.anInt2779 / 2, this.method2530(local79) - -this.anInt2772, null);
			@Pc(128) int local128 = local64 + this.anInt2770 - this.anInt2779 / 2;
			@Pc(139) int local139 = this.anInt2779 / 2 + this.anInt2770 - local69;
			for (@Pc(141) int local141 = local128; local141 <= local139; local141 += local74) {
				local59.drawImage(this.anImage2, this.method2527(local64) + this.anInt2770 + local141, this.method2530(local89) + this.anInt2772, null);
			}
			local59.drawImage(this.anImage11, this.method2527(local69) + this.anInt2770 + this.anInt2779 / 2, this.method2530(local84) - -this.anInt2772, null);
			@Pc(206) int local206 = this.anImage10.getWidth(null);
			@Pc(211) int local211 = this.anImage10.getHeight(null);
			@Pc(216) int local216 = this.anImage3.getWidth(null);
			@Pc(221) int local221 = this.anImage3.getHeight(null);
			@Pc(226) int local226 = this.anImage6.getHeight(null);
			@Pc(231) int local231 = this.anImage7.getWidth(null);
			@Pc(236) int local236 = this.anImage7.getHeight(null);
			@Pc(241) int local241 = this.anImage6.getWidth(null);
			@Pc(246) int local246 = this.anImage9.getWidth(null);
			@Pc(251) int local251 = this.anImage8.getWidth(null);
			@Pc(260) int local260 = this.method2527(this.anInt2767) + this.anInt2777;
			@Pc(269) int local269 = this.method2530(this.anInt2769) + this.anInt2763;
			local59.drawImage(this.anImage10, local260, (this.anInt2769 - local211) / 2 + local269, null);
			local59.drawImage(this.anImage3, this.anInt2767 + local260 - local216, local269 + (-local221 + this.anInt2769) / 2, null);
			if (this.anImage4 == null) {
				this.anImage4 = Static347.aCanvas9.createImage(this.anInt2767 - local206 - local216, this.anInt2769);
			}
			@Pc(326) Graphics local326 = this.anImage4.getGraphics();
			for (@Pc(328) int local328 = 0; local328 < this.anInt2767 - local216 - local206; local328 += local231) {
				local326.drawImage(this.anImage7, local328, 0, null);
			}
			for (@Pc(358) int local358 = 0; local358 < this.anInt2767 - local216 - local206; local358 += local241) {
				local326.drawImage(this.anImage6, local358, this.anInt2769 - local226, null);
			}
			@Pc(403) int local403 = (this.anInt2767 - local216 - local206) * local45 / 100;
			@Pc(437) int local437;
			if (local403 > 0) {
				@Pc(416) Image local416 = Static347.aCanvas9.createImage(local403, this.anInt2769 - local236 - local226);
				@Pc(420) int local420 = local416.getWidth(null);
				@Pc(423) Graphics local423 = local416.getGraphics();
				@Pc(433) int local433 = this.anInt2764 * Static100.method2161() / 10 % local246;
				for (local437 = local433 - local246; local437 < local420; local437 += local246) {
					local423.drawImage(this.anImage9, local437, 0, null);
				}
				local326.drawImage(local416, 0, local236, null);
			}
			@Pc(463) int local463 = local403;
			local403 = this.anInt2767 - local216 - local206 - local403;
			if (local403 > 0) {
				@Pc(492) Image local492 = Static347.aCanvas9.createImage(local403, this.anInt2769 - local236 - local226);
				@Pc(496) int local496 = local492.getWidth(null);
				@Pc(499) Graphics local499 = local492.getGraphics();
				for (local437 = 0; local437 < local496; local437 += local251) {
					local499.drawImage(this.anImage8, local437, 0, null);
				}
				local326.drawImage(local492, local463, local236, null);
			}
			local59.drawImage(this.anImage4, local206 + local260, local269, null);
			local59.setFont(this.aFont1);
			local59.setColor(this.aColor1);
			local59.drawString(local49, (this.anInt2767 - this.aFontMetrics1.stringWidth(local49)) / 2 + local260, this.anInt2769 / 2 + local269 - -4 + this.anInt2766);
			local37.drawImage(Static583.anImage13, 0, 0, null);
		} catch (@Pc(581) Exception local581) {
			this.aBoolean232 = true;
		}
	}

	@OriginalMember(owner = "client!eo", name = "b", descriptor = "(II)I")
	private int method2530(@OriginalArg(0) int arg0) {
		return this.aBoolean231 ? (Static447.anInt7372 - arg0) / 2 : 0;
	}

	@OriginalMember(owner = "client!eo", name = "b", descriptor = "(B)V")
	@Override
	public void method5348() {
		Static499.method6733();
	}

	@OriginalMember(owner = "client!eo", name = "b", descriptor = "(I)V")
	@Override
	public void method5349() {
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(I)I")
	@Override
	public int method5346() {
		return 100;
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(JI)Z")
	@Override
	public boolean method5344(@OriginalArg(0) long arg0) {
		return true;
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;")
	private Object method2531(@OriginalArg(1) String arg0, @OriginalArg(2) Class arg1) throws IllegalAccessException, NoSuchFieldException {
		@Pc(13) Field local13 = arg1.getDeclaredField(arg0);
		@Pc(17) Object local17 = local13.get(Static533.anApplet4);
		local13.set(Static533.anApplet4, null);
		return local17;
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(B)I")
	@Override
	public int method5347() {
		return 0;
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(Ljava/lang/Class;Ljava/lang/Object;ILjava/lang/String;)Z")
	private boolean method2532(@OriginalArg(0) Class arg0, @OriginalArg(1) Object arg1, @OriginalArg(3) String arg2) throws IllegalAccessException, NoSuchFieldException {
		@Pc(7) Field local7 = arg0.getDeclaredField(arg2);
		return local7.getBoolean(arg1);
	}

	@OriginalMember(owner = "client!eo", name = "d", descriptor = "(B)V")
	private void method2533() {
		Static269.method4384(Static268.aClass366_1.method7804(), Static122.aColorArray2[Static250.anInt4577], Static359.aColorArray3[Static250.anInt4577], Static122.aColorArray1[Static250.anInt4577], Static268.aClass366_1.method7794());
	}
}
