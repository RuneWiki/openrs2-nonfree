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

@OriginalClass("client!ek")
public final class Class81 implements Interface24 {

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "I")
	private int anInt2476;

	@OriginalMember(owner = "client!ek", name = "c", descriptor = "I")
	private int anInt2477;

	@OriginalMember(owner = "client!ek", name = "d", descriptor = "I")
	private int anInt2478;

	@OriginalMember(owner = "client!ek", name = "f", descriptor = "Ljava/awt/Image;")
	private Image anImage2;

	@OriginalMember(owner = "client!ek", name = "g", descriptor = "Ljava/awt/Image;")
	private Image anImage3;

	@OriginalMember(owner = "client!ek", name = "i", descriptor = "Z")
	private boolean aBoolean188;

	@OriginalMember(owner = "client!ek", name = "k", descriptor = "I")
	private int anInt2482;

	@OriginalMember(owner = "client!ek", name = "m", descriptor = "I")
	private int anInt2484;

	@OriginalMember(owner = "client!ek", name = "p", descriptor = "Ljava/awt/Image;")
	private Image anImage4;

	@OriginalMember(owner = "client!ek", name = "q", descriptor = "Ljava/awt/Image;")
	private Image anImage5;

	@OriginalMember(owner = "client!ek", name = "r", descriptor = "Ljava/awt/Image;")
	private Image anImage6;

	@OriginalMember(owner = "client!ek", name = "s", descriptor = "Ljava/awt/Image;")
	private Image anImage7;

	@OriginalMember(owner = "client!ek", name = "t", descriptor = "I")
	private int anInt2487;

	@OriginalMember(owner = "client!ek", name = "v", descriptor = "I")
	private int anInt2489;

	@OriginalMember(owner = "client!ek", name = "w", descriptor = "Ljava/awt/Image;")
	private Image anImage8;

	@OriginalMember(owner = "client!ek", name = "x", descriptor = "Ljava/awt/Image;")
	private Image anImage9;

	@OriginalMember(owner = "client!ek", name = "y", descriptor = "Ljava/awt/FontMetrics;")
	private FontMetrics aFontMetrics1;

	@OriginalMember(owner = "client!ek", name = "C", descriptor = "Ljava/awt/Font;")
	private Font aFont1;

	@OriginalMember(owner = "client!ek", name = "D", descriptor = "I")
	private int anInt2493;

	@OriginalMember(owner = "client!ek", name = "E", descriptor = "Ljava/awt/Image;")
	private Image anImage10;

	@OriginalMember(owner = "client!ek", name = "K", descriptor = "I")
	private int anInt2497;

	@OriginalMember(owner = "client!ek", name = "O", descriptor = "Z")
	private boolean aBoolean189;

	@OriginalMember(owner = "client!ek", name = "P", descriptor = "Ljava/awt/Image;")
	private Image anImage11;

	@OriginalMember(owner = "client!ek", name = "Q", descriptor = "Z")
	private boolean aBoolean190;

	@OriginalMember(owner = "client!ek", name = "S", descriptor = "Ljava/awt/Color;")
	private Color aColor1;

	@OriginalMember(owner = "client!ek", name = "b", descriptor = "(Z)V")
	private void method2174() throws IllegalAccessException, NoSuchFieldException {
		@Pc(6) Class local6 = Static433.anApplet2.getClass();
		this.anImage9 = (Image) this.method2176("bar", local6);
		this.anImage10 = (Image) this.method2176("background", local6);
		this.anImage11 = (Image) this.method2176("left", local6);
		this.anImage2 = (Image) this.method2176("right", local6);
		this.anImage7 = (Image) this.method2176("top", local6);
		this.anImage5 = (Image) this.method2176("bottom", local6);
		this.anImage8 = (Image) this.method2176("bodyLeft", local6);
		this.anImage3 = (Image) this.method2176("bodyRight", local6);
		this.anImage4 = (Image) this.method2176("bodyFill", local6);
		this.aFont1 = (Font) this.method2176("bf", local6);
		this.aFontMetrics1 = (FontMetrics) this.method2176("bfm", local6);
		this.aColor1 = (Color) this.method2176("colourtext", local6);
		@Pc(108) Object local108 = this.method2176("lb", local6);
		@Pc(111) Class local111 = local108.getClass();
		this.aBoolean188 = this.method2179(local108, local111, "xMiddle");
		this.aBoolean189 = this.method2179(local108, local111, "yMiddle");
		this.anInt2476 = this.method2177(local111, "xOffset", local108);
		this.anInt2484 = this.method2177(local111, "yOffset", local108);
		this.anInt2497 = this.method2177(local111, "width", local108);
		this.anInt2493 = this.method2177(local111, "height", local108);
		this.anInt2489 = this.method2177(local111, "boxXOffset", local108);
		this.anInt2487 = this.method2177(local111, "boxYOffset", local108);
		this.anInt2482 = this.method2177(local111, "boxWidth", local108);
		this.anInt2478 = this.method2177(local111, "textYOffset", local108);
		this.anInt2477 = this.method2177(local111, "offsetPerTenCycles", local108);
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(I)V")
	@Override
	public void method2169() {
		Static218.method3263();
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Class;I)Ljava/lang/Object;")
	private Object method2176(@OriginalArg(0) String arg0, @OriginalArg(1) Class arg1) throws IllegalAccessException, NoSuchFieldException {
		@Pc(12) Field local12 = arg1.getDeclaredField(arg0);
		@Pc(16) Object local16 = local12.get(Static433.anApplet2);
		local12.set(Static433.anApplet2, null);
		return local16;
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(Ljava/lang/Class;ILjava/lang/String;Ljava/lang/Object;)I")
	private int method2177(@OriginalArg(0) Class arg0, @OriginalArg(2) String arg1, @OriginalArg(3) Object arg2) throws IllegalAccessException, NoSuchFieldException {
		@Pc(13) Field local13 = arg0.getDeclaredField(arg1);
		return local13.getInt(arg2);
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(B)V")
	@Override
	public void method2170() {
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;I)Z")
	private boolean method2179(@OriginalArg(0) Object arg0, @OriginalArg(1) Class arg1, @OriginalArg(2) String arg2) throws IllegalAccessException, NoSuchFieldException {
		@Pc(7) Field local7 = arg1.getDeclaredField(arg2);
		return local7.getBoolean(arg0);
	}

	@OriginalMember(owner = "client!ek", name = "b", descriptor = "(IZ)I")
	private int method2180(@OriginalArg(0) int arg0) {
		return this.aBoolean188 ? (Static349.anInt6422 - arg0) / 2 : 0;
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(ZI)I")
	private int method2182(@OriginalArg(1) int arg0) {
		return this.aBoolean189 ? (Static594.anInt9806 - arg0) / 2 : 0;
	}

	@OriginalMember(owner = "client!ek", name = "d", descriptor = "(I)V")
	private void method2183() {
		Static392.method5627(Static520.aClass247_5.method5326(), Static490.aColorArray2[Static150.anInt2840], Static560.aColorArray3[Static150.anInt2840], Static520.aClass247_5.method5330(), Static416.aColorArray1[Static150.anInt2840]);
	}

	@OriginalMember(owner = "client!ek", name = "b", descriptor = "(I)I")
	@Override
	public int method2172() {
		return 0;
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(ZJ)Z")
	@Override
	public boolean method2173(@OriginalArg(1) long arg0) {
		return true;
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(IZ)V")
	@Override
	public void method2168(@OriginalArg(1) boolean arg0) {
		if (!this.aBoolean190) {
			if (Static433.anApplet2 == null) {
				this.aBoolean190 = true;
			} else if (this.aFont1 == null) {
				try {
					this.method2174();
				} catch (@Pc(19) Exception local19) {
					this.aBoolean190 = true;
				}
			}
		}
		if (this.aBoolean190) {
			this.method2183();
			return;
		}
		@Pc(44) Graphics local44 = Static103.aCanvas2.getGraphics();
		if (local44 == null) {
			Static103.aCanvas2.repaint();
			return;
		}
		try {
			@Pc(50) int local50 = Static520.aClass247_5.method5326();
			@Pc(54) String local54 = Static520.aClass247_5.method5330();
			if (Static242.anImage12 == null) {
				Static242.anImage12 = Static103.aCanvas2.createImage(Static349.anInt6422, Static594.anInt9806);
			}
			@Pc(64) Graphics local64 = Static242.anImage12.getGraphics();
			@Pc(69) int local69 = this.anImage8.getWidth(null);
			@Pc(74) int local74 = this.anImage3.getWidth(null);
			@Pc(79) int local79 = this.anImage4.getWidth(null);
			@Pc(84) int local84 = this.anImage8.getHeight(null);
			@Pc(89) int local89 = this.anImage3.getHeight(null);
			@Pc(94) int local94 = this.anImage4.getHeight(null);
			local64.drawImage(this.anImage8, this.method2180(local69) + this.anInt2489 - this.anInt2482 / 2, this.method2182(local84) + this.anInt2487, null);
			@Pc(129) int local129 = local69 + this.anInt2489 - this.anInt2482 / 2;
			@Pc(137) int local137 = this.anInt2482 / 2 + this.anInt2489;
			for (@Pc(139) int local139 = local129; local139 <= local137; local139 += local79) {
				local64.drawImage(this.anImage4, local139 + this.method2180(local69) + this.anInt2489, this.method2182(local94) - -this.anInt2487, null);
			}
			local64.drawImage(this.anImage3, this.method2180(local74) + this.anInt2489 + this.anInt2482 / 2, this.method2182(local89) + this.anInt2487, null);
			@Pc(206) int local206 = this.anImage11.getWidth(null);
			@Pc(211) int local211 = this.anImage11.getHeight(null);
			@Pc(216) int local216 = this.anImage2.getWidth(null);
			@Pc(221) int local221 = this.anImage2.getHeight(null);
			@Pc(226) int local226 = this.anImage5.getHeight(null);
			@Pc(231) int local231 = this.anImage7.getWidth(null);
			@Pc(236) int local236 = this.anImage7.getHeight(null);
			@Pc(241) int local241 = this.anImage5.getWidth(null);
			@Pc(246) int local246 = this.anImage9.getWidth(null);
			@Pc(251) int local251 = this.anImage10.getWidth(null);
			@Pc(260) int local260 = this.method2180(this.anInt2497) + this.anInt2476;
			@Pc(270) int local270 = this.method2182(this.anInt2493) + this.anInt2484;
			local64.drawImage(this.anImage11, local260, local270 + (this.anInt2493 - local211) / 2, null);
			local64.drawImage(this.anImage2, this.anInt2497 + local260 - local216, (-local221 + this.anInt2493) / 2 + local270, null);
			if (this.anImage6 == null) {
				this.anImage6 = Static103.aCanvas2.createImage(this.anInt2497 - local206 - local216, this.anInt2493);
			}
			@Pc(328) Graphics local328 = this.anImage6.getGraphics();
			for (@Pc(330) int local330 = 0; local330 < this.anInt2497 - local216 - local206; local330 += local231) {
				local328.drawImage(this.anImage7, local330, 0, null);
			}
			for (@Pc(360) int local360 = 0; local360 < this.anInt2497 - local216 - local206; local360 += local241) {
				local328.drawImage(this.anImage5, local360, this.anInt2493 - local226, null);
			}
			@Pc(405) int local405 = local50 * (this.anInt2497 - local206 - local216) / 100;
			@Pc(444) int local444;
			if (local405 > 0) {
				@Pc(422) Image local422 = Static103.aCanvas2.createImage(local405, this.anInt2493 - local226 - local236);
				@Pc(426) int local426 = local422.getWidth(null);
				@Pc(429) Graphics local429 = local422.getGraphics();
				@Pc(439) int local439 = this.anInt2477 * Static201.method3096() / 10 % local246;
				for (local444 = local439 - local246; local444 < local426; local444 += local246) {
					local429.drawImage(this.anImage9, local444, 0, null);
				}
				local328.drawImage(local422, 0, local236, null);
			}
			@Pc(474) int local474 = local405;
			local405 = this.anInt2497 - local206 - local216 - local405;
			if (local405 > 0) {
				@Pc(498) Image local498 = Static103.aCanvas2.createImage(local405, this.anInt2493 - local226 - local236);
				@Pc(502) int local502 = local498.getWidth(null);
				@Pc(505) Graphics local505 = local498.getGraphics();
				for (local444 = 0; local444 < local502; local444 += local251) {
					local505.drawImage(this.anImage10, local444, 0, null);
				}
				local328.drawImage(local498, local474, local236, null);
			}
			local64.drawImage(this.anImage6, local260 + local206, local270, null);
			local64.setFont(this.aFont1);
			local64.setColor(this.aColor1);
			local64.drawString(local54, local260 + (this.anInt2497 - this.aFontMetrics1.stringWidth(local54)) / 2, this.anInt2478 + 4 + this.anInt2493 / 2 + local270);
			local44.drawImage(Static242.anImage12, 0, 0, null);
		} catch (@Pc(585) Exception local585) {
			this.aBoolean190 = true;
		}
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(Z)I")
	@Override
	public int method2171() {
		return 100;
	}
}
