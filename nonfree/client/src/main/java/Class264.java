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

@OriginalClass("client!pu")
public final class Class264 implements Interface23 {

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "I")
	private int anInt7486;

	@OriginalMember(owner = "client!pu", name = "f", descriptor = "I")
	private int anInt7491;

	@OriginalMember(owner = "client!pu", name = "g", descriptor = "Ljava/awt/Image;")
	private Image anImage4;

	@OriginalMember(owner = "client!pu", name = "h", descriptor = "I")
	private int anInt7492;

	@OriginalMember(owner = "client!pu", name = "j", descriptor = "Ljava/awt/Font;")
	private Font aFont2;

	@OriginalMember(owner = "client!pu", name = "k", descriptor = "Ljava/awt/Image;")
	private Image anImage5;

	@OriginalMember(owner = "client!pu", name = "l", descriptor = "Z")
	private boolean aBoolean523;

	@OriginalMember(owner = "client!pu", name = "n", descriptor = "I")
	private int anInt7495;

	@OriginalMember(owner = "client!pu", name = "o", descriptor = "Ljava/awt/Image;")
	private Image anImage6;

	@OriginalMember(owner = "client!pu", name = "p", descriptor = "I")
	private int anInt7496;

	@OriginalMember(owner = "client!pu", name = "q", descriptor = "Ljava/awt/FontMetrics;")
	private FontMetrics aFontMetrics1;

	@OriginalMember(owner = "client!pu", name = "r", descriptor = "Ljava/awt/Image;")
	private Image anImage7;

	@OriginalMember(owner = "client!pu", name = "s", descriptor = "Z")
	private boolean aBoolean524;

	@OriginalMember(owner = "client!pu", name = "w", descriptor = "Ljava/awt/Image;")
	private Image anImage8;

	@OriginalMember(owner = "client!pu", name = "y", descriptor = "I")
	private int anInt7501;

	@OriginalMember(owner = "client!pu", name = "z", descriptor = "Ljava/awt/Image;")
	private Image anImage9;

	@OriginalMember(owner = "client!pu", name = "A", descriptor = "Ljava/awt/Image;")
	private Image anImage10;

	@OriginalMember(owner = "client!pu", name = "B", descriptor = "Z")
	private boolean aBoolean525;

	@OriginalMember(owner = "client!pu", name = "C", descriptor = "Ljava/awt/Image;")
	private Image anImage11;

	@OriginalMember(owner = "client!pu", name = "G", descriptor = "I")
	private int anInt7502;

	@OriginalMember(owner = "client!pu", name = "H", descriptor = "Ljava/awt/Color;")
	private Color aColor1;

	@OriginalMember(owner = "client!pu", name = "J", descriptor = "I")
	private int anInt7504;

	@OriginalMember(owner = "client!pu", name = "K", descriptor = "I")
	private int anInt7505;

	@OriginalMember(owner = "client!pu", name = "M", descriptor = "Ljava/awt/Image;")
	private Image anImage12;

	@OriginalMember(owner = "client!pu", name = "P", descriptor = "Ljava/awt/Image;")
	private Image anImage13;

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(Ljava/lang/Class;ILjava/lang/Object;Ljava/lang/String;)Z")
	private boolean method5855(@OriginalArg(0) Class arg0, @OriginalArg(2) Object arg1, @OriginalArg(3) String arg2) throws IllegalAccessException, NoSuchFieldException {
		@Pc(13) Field local13 = arg0.getDeclaredField(arg2);
		return local13.getBoolean(arg1);
	}

	@OriginalMember(owner = "client!pu", name = "b", descriptor = "(I)V")
	@Override
	public void method8169() {
	}

	@OriginalMember(owner = "client!pu", name = "e", descriptor = "(I)V")
	private void method5856() {
		Static484.method6587(Static330.aColorArray3[Static6.anInt44], Static372.aClass163_1.method4024(), Static17.aColorArray4[Static6.anInt44], Static538.aColorArray5[Static6.anInt44], Static372.aClass163_1.method4022());
	}

	@OriginalMember(owner = "client!pu", name = "c", descriptor = "(I)I")
	@Override
	public int method8170() {
		return 0;
	}

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(I)I")
	@Override
	public int method8167() {
		return 100;
	}

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(Ljava/lang/Class;Ljava/lang/String;B)Ljava/lang/Object;")
	private Object method5857(@OriginalArg(0) Class arg0, @OriginalArg(1) String arg1) throws IllegalAccessException, NoSuchFieldException {
		@Pc(7) Field local7 = arg0.getDeclaredField(arg1);
		@Pc(16) Object local16 = local7.get(Static304.anApplet1);
		local7.set(Static304.anApplet1, null);
		return local16;
	}

	@OriginalMember(owner = "client!pu", name = "b", descriptor = "(Ljava/lang/Class;ILjava/lang/Object;Ljava/lang/String;)I")
	private int method5858(@OriginalArg(0) Class arg0, @OriginalArg(2) Object arg1, @OriginalArg(3) String arg2) throws IllegalAccessException, NoSuchFieldException {
		@Pc(12) Field local12 = arg0.getDeclaredField(arg2);
		return local12.getInt(arg1);
	}

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method8172(@OriginalArg(1) boolean arg0) {
		if (!this.aBoolean524) {
			if (Static304.anApplet1 == null) {
				this.aBoolean524 = true;
			} else if (this.aFont2 == null) {
				try {
					this.method5862();
				} catch (@Pc(19) Exception local19) {
					this.aBoolean524 = true;
				}
			}
		}
		if (this.aBoolean524) {
			this.method5856();
			return;
		}
		@Pc(41) Graphics local41 = Static129.aCanvas6.getGraphics();
		if (local41 == null) {
			Static129.aCanvas6.repaint();
			return;
		}
		try {
			@Pc(50) int local50 = Static372.aClass163_1.method4024();
			@Pc(54) String local54 = Static372.aClass163_1.method4022();
			if (Static355.anImage3 == null) {
				Static355.anImage3 = Static129.aCanvas6.createImage(Static34.anInt3201, Static492.anInt8445);
			}
			@Pc(64) Graphics local64 = Static355.anImage3.getGraphics();
			@Pc(69) int local69 = this.anImage13.getWidth(null);
			@Pc(74) int local74 = this.anImage12.getWidth(null);
			@Pc(79) int local79 = this.anImage9.getWidth(null);
			@Pc(84) int local84 = this.anImage13.getHeight(null);
			@Pc(89) int local89 = this.anImage12.getHeight(null);
			@Pc(94) int local94 = this.anImage9.getHeight(null);
			local64.drawImage(this.anImage13, this.method5859(local69) + this.anInt7492 - this.anInt7502 / 2, this.method5860(local84) - -this.anInt7496, null);
			@Pc(132) int local132 = local69 + this.anInt7492 - this.anInt7502 / 2;
			@Pc(141) int local141 = this.anInt7492 + this.anInt7502 / 2;
			for (@Pc(143) int local143 = local132; local143 <= local141; local143 += local79) {
				local64.drawImage(this.anImage9, this.method5859(local69) + this.anInt7492 + local143, this.method5860(local94) - -this.anInt7496, null);
			}
			local64.drawImage(this.anImage12, this.method5859(local74) + this.anInt7492 + this.anInt7502 / 2, this.method5860(local89) + this.anInt7496, null);
			@Pc(211) int local211 = this.anImage11.getWidth(null);
			@Pc(216) int local216 = this.anImage11.getHeight(null);
			@Pc(221) int local221 = this.anImage4.getWidth(null);
			@Pc(226) int local226 = this.anImage4.getHeight(null);
			@Pc(231) int local231 = this.anImage7.getHeight(null);
			@Pc(236) int local236 = this.anImage6.getWidth(null);
			@Pc(241) int local241 = this.anImage6.getHeight(null);
			@Pc(246) int local246 = this.anImage7.getWidth(null);
			@Pc(251) int local251 = this.anImage5.getWidth(null);
			@Pc(256) int local256 = this.anImage8.getWidth(null);
			@Pc(265) int local265 = this.method5859(this.anInt7486) + this.anInt7491;
			@Pc(274) int local274 = this.method5860(this.anInt7495) + this.anInt7505;
			local64.drawImage(this.anImage11, local265, (this.anInt7495 - local216) / 2 + local274, null);
			local64.drawImage(this.anImage4, this.anInt7486 + local265 - local221, local274 + (-local226 + this.anInt7495) / 2, null);
			if (this.anImage10 == null) {
				this.anImage10 = Static129.aCanvas6.createImage(this.anInt7486 - local211 - local221, this.anInt7495);
			}
			@Pc(333) Graphics local333 = this.anImage10.getGraphics();
			for (@Pc(335) int local335 = 0; local335 < this.anInt7486 - local221 - local211; local335 += local236) {
				local333.drawImage(this.anImage6, local335, 0, null);
			}
			for (@Pc(361) int local361 = 0; local361 < this.anInt7486 - local221 - local211; local361 += local246) {
				local333.drawImage(this.anImage7, local361, this.anInt7495 - local231, null);
			}
			@Pc(402) int local402 = (this.anInt7486 - local221 - local211) * local50 / 100;
			@Pc(439) int local439;
			if (local402 > 0) {
				@Pc(418) Image local418 = Static129.aCanvas6.createImage(local402, this.anInt7495 - local241 - local231);
				@Pc(422) int local422 = local418.getWidth(null);
				@Pc(425) Graphics local425 = local418.getGraphics();
				@Pc(435) int local435 = this.anInt7504 * Static585.method7968() / 10 % local251;
				for (local439 = local435 - local251; local439 < local422; local439 += local251) {
					local425.drawImage(this.anImage5, local439, 0, null);
				}
				local333.drawImage(local418, 0, local241, null);
			}
			@Pc(469) int local469 = local402;
			local402 = this.anInt7486 - local402 - local211 - local221;
			if (local402 > 0) {
				@Pc(498) Image local498 = Static129.aCanvas6.createImage(local402, this.anInt7495 - local231 - local241);
				@Pc(502) int local502 = local498.getWidth(null);
				@Pc(505) Graphics local505 = local498.getGraphics();
				for (local439 = 0; local439 < local502; local439 += local256) {
					local505.drawImage(this.anImage8, local439, 0, null);
				}
				local333.drawImage(local498, local469, local241, null);
			}
			local64.drawImage(this.anImage10, local265 + local211, local274, null);
			local64.setFont(this.aFont2);
			local64.setColor(this.aColor1);
			local64.drawString(local54, local265 + (this.anInt7486 - this.aFontMetrics1.stringWidth(local54)) / 2, this.anInt7501 + local274 - (-(this.anInt7495 / 2) + -4));
			local41.drawImage(Static355.anImage3, 0, 0, null);
		} catch (@Pc(589) Exception local589) {
			this.aBoolean524 = true;
		}
	}

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(II)I")
	private int method5859(@OriginalArg(0) int arg0) {
		return this.aBoolean525 ? (Static34.anInt3201 - arg0) / 2 : 0;
	}

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(IJ)Z")
	@Override
	public boolean method8168(@OriginalArg(1) long arg0) {
		return true;
	}

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(IB)I")
	private int method5860(@OriginalArg(0) int arg0) {
		return this.aBoolean523 ? (Static492.anInt8445 - arg0) / 2 : 0;
	}

	@OriginalMember(owner = "client!pu", name = "d", descriptor = "(I)V")
	@Override
	public void method8171() {
		Static544.method7465();
	}

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(B)V")
	private void method5862() throws IllegalAccessException, NoSuchFieldException {
		@Pc(6) Class local6 = Static304.anApplet1.getClass();
		this.anImage5 = (Image) this.method5857(local6, "bar");
		this.anImage8 = (Image) this.method5857(local6, "background");
		this.anImage11 = (Image) this.method5857(local6, "left");
		this.anImage4 = (Image) this.method5857(local6, "right");
		this.anImage6 = (Image) this.method5857(local6, "top");
		this.anImage7 = (Image) this.method5857(local6, "bottom");
		this.anImage13 = (Image) this.method5857(local6, "bodyLeft");
		this.anImage12 = (Image) this.method5857(local6, "bodyRight");
		this.anImage9 = (Image) this.method5857(local6, "bodyFill");
		this.aFont2 = (Font) this.method5857(local6, "bf");
		this.aFontMetrics1 = (FontMetrics) this.method5857(local6, "bfm");
		this.aColor1 = (Color) this.method5857(local6, "colourtext");
		@Pc(108) Object local108 = this.method5857(local6, "lb");
		@Pc(111) Class local111 = local108.getClass();
		this.aBoolean525 = this.method5855(local111, local108, "xMiddle");
		this.aBoolean523 = this.method5855(local111, local108, "yMiddle");
		this.anInt7491 = this.method5858(local111, local108, "xOffset");
		this.anInt7505 = this.method5858(local111, local108, "yOffset");
		this.anInt7486 = this.method5858(local111, local108, "width");
		this.anInt7495 = this.method5858(local111, local108, "height");
		this.anInt7492 = this.method5858(local111, local108, "boxXOffset");
		this.anInt7496 = this.method5858(local111, local108, "boxYOffset");
		this.anInt7502 = this.method5858(local111, local108, "boxWidth");
		this.anInt7501 = this.method5858(local111, local108, "textYOffset");
		this.anInt7504 = this.method5858(local111, local108, "offsetPerTenCycles");
	}
}
