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

@OriginalClass("client!v")
public final class Class346 implements Interface21 {

	@OriginalMember(owner = "client!v", name = "a", descriptor = "I")
	private int anInt9646;

	@OriginalMember(owner = "client!v", name = "b", descriptor = "Ljava/awt/Image;")
	private Image anImage4;

	@OriginalMember(owner = "client!v", name = "c", descriptor = "Ljava/awt/Image;")
	private Image anImage5;

	@OriginalMember(owner = "client!v", name = "e", descriptor = "Ljava/awt/Image;")
	private Image anImage6;

	@OriginalMember(owner = "client!v", name = "f", descriptor = "I")
	private int anInt9647;

	@OriginalMember(owner = "client!v", name = "h", descriptor = "I")
	private int anInt9649;

	@OriginalMember(owner = "client!v", name = "i", descriptor = "Ljava/awt/Color;")
	private Color aColor1;

	@OriginalMember(owner = "client!v", name = "j", descriptor = "Ljava/awt/Image;")
	private Image anImage7;

	@OriginalMember(owner = "client!v", name = "q", descriptor = "Ljava/awt/Font;")
	private Font aFont2;

	@OriginalMember(owner = "client!v", name = "r", descriptor = "I")
	private int anInt9656;

	@OriginalMember(owner = "client!v", name = "t", descriptor = "Ljava/awt/Image;")
	private Image anImage8;

	@OriginalMember(owner = "client!v", name = "u", descriptor = "Ljava/awt/Image;")
	private Image anImage9;

	@OriginalMember(owner = "client!v", name = "v", descriptor = "Z")
	private boolean aBoolean732;

	@OriginalMember(owner = "client!v", name = "w", descriptor = "I")
	private int anInt9658;

	@OriginalMember(owner = "client!v", name = "x", descriptor = "I")
	private int anInt9659;

	@OriginalMember(owner = "client!v", name = "z", descriptor = "Ljava/awt/Image;")
	private Image anImage10;

	@OriginalMember(owner = "client!v", name = "A", descriptor = "Z")
	private boolean aBoolean733;

	@OriginalMember(owner = "client!v", name = "C", descriptor = "I")
	private int anInt9662;

	@OriginalMember(owner = "client!v", name = "D", descriptor = "Ljava/awt/Image;")
	private Image anImage11;

	@OriginalMember(owner = "client!v", name = "G", descriptor = "Z")
	private boolean aBoolean734;

	@OriginalMember(owner = "client!v", name = "H", descriptor = "I")
	private int anInt9664;

	@OriginalMember(owner = "client!v", name = "I", descriptor = "Ljava/awt/Image;")
	private Image anImage12;

	@OriginalMember(owner = "client!v", name = "M", descriptor = "I")
	private int anInt9667;

	@OriginalMember(owner = "client!v", name = "Q", descriptor = "Ljava/awt/FontMetrics;")
	private FontMetrics aFontMetrics1;

	@OriginalMember(owner = "client!v", name = "U", descriptor = "Ljava/awt/Image;")
	private Image anImage13;

	@OriginalMember(owner = "client!v", name = "c", descriptor = "(I)I")
	@Override
	public int method8192() {
		return 100;
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(I)V")
	@Override
	public void method8190() {
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(II)I")
	private int method8194(@OriginalArg(0) int arg0) {
		return this.aBoolean734 ? (Static330.anInt6254 - arg0) / 2 : 0;
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(IB)I")
	private int method8197(@OriginalArg(0) int arg0) {
		return this.aBoolean733 ? (Static190.anInt3576 - arg0) / 2 : 0;
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/Class;Ljava/lang/Object;)Z")
	private boolean method8198(@OriginalArg(0) String arg0, @OriginalArg(2) Class arg1, @OriginalArg(3) Object arg2) throws IllegalAccessException, NoSuchFieldException {
		@Pc(12) Field local12 = arg1.getDeclaredField(arg0);
		return local12.getBoolean(arg2);
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(JI)Z")
	@Override
	public boolean method8188(@OriginalArg(0) long arg0) {
		return true;
	}

	@OriginalMember(owner = "client!v", name = "d", descriptor = "(I)V")
	private void method8199() {
		Static508.method7715(Static369.aClass302_1.method7396(), Static369.aClass302_1.method7398(), Static158.aColorArray1[Static192.anInt3598], Static521.aColorArray3[Static192.anInt3598], Static210.aColorArray2[Static192.anInt3598]);
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(Z)I")
	@Override
	public int method8189() {
		return 0;
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(ZB)V")
	@Override
	public void method8187(@OriginalArg(0) boolean arg0) {
		if (!this.aBoolean732) {
			if (Static303.anApplet3 == null) {
				this.aBoolean732 = true;
			} else if (this.aFont2 == null) {
				try {
					this.method8203();
				} catch (@Pc(23) Exception local23) {
					this.aBoolean732 = true;
				}
			}
		}
		if (this.aBoolean732) {
			this.method8199();
			return;
		}
		@Pc(37) Graphics local37 = Static617.aCanvas13.getGraphics();
		if (local37 == null) {
			Static617.aCanvas13.repaint();
			return;
		}
		try {
			@Pc(50) int local50 = Static369.aClass302_1.method7398();
			@Pc(56) String local56 = Static369.aClass302_1.method7396();
			if (Static103.anImage1 == null) {
				Static103.anImage1 = Static617.aCanvas13.createImage(Static330.anInt6254, Static190.anInt3576);
			}
			@Pc(66) Graphics local66 = Static103.anImage1.getGraphics();
			local66.clearRect(0, 0, Static330.anInt6254, Static190.anInt3576);
			@Pc(77) int local77 = this.anImage10.getWidth((ImageObserver) null);
			@Pc(82) int local82 = this.anImage5.getWidth((ImageObserver) null);
			@Pc(87) int local87 = this.anImage12.getWidth((ImageObserver) null);
			@Pc(92) int local92 = this.anImage10.getHeight((ImageObserver) null);
			@Pc(97) int local97 = this.anImage5.getHeight((ImageObserver) null);
			@Pc(102) int local102 = this.anImage12.getHeight((ImageObserver) null);
			local66.drawImage(this.anImage10, this.method8194(local77) + this.anInt9658 - this.anInt9646 / 2, this.method8197(local92) + this.anInt9649, (ImageObserver) null);
			@Pc(141) int local141 = local77 + this.anInt9658 - this.anInt9646 / 2;
			@Pc(149) int local149 = this.anInt9646 / 2 + this.anInt9658;
			for (@Pc(151) int local151 = local141; local151 <= local149; local151 += local87) {
				local66.drawImage(this.anImage12, this.method8194(local77) + this.anInt9658 + local151, this.method8197(local102) - -this.anInt9649, (ImageObserver) null);
			}
			local66.drawImage(this.anImage5, this.method8194(local82) + this.anInt9658 + this.anInt9646 / 2, this.method8197(local97) - -this.anInt9649, (ImageObserver) null);
			@Pc(218) int local218 = this.anImage6.getWidth((ImageObserver) null);
			@Pc(223) int local223 = this.anImage6.getHeight((ImageObserver) null);
			@Pc(228) int local228 = this.anImage4.getWidth((ImageObserver) null);
			@Pc(233) int local233 = this.anImage4.getHeight((ImageObserver) null);
			@Pc(238) int local238 = this.anImage7.getHeight((ImageObserver) null);
			@Pc(243) int local243 = this.anImage9.getWidth((ImageObserver) null);
			@Pc(248) int local248 = this.anImage9.getHeight((ImageObserver) null);
			@Pc(253) int local253 = this.anImage7.getWidth((ImageObserver) null);
			@Pc(258) int local258 = this.anImage13.getWidth((ImageObserver) null);
			@Pc(263) int local263 = this.anImage8.getWidth((ImageObserver) null);
			@Pc(272) int local272 = this.method8194(this.anInt9667) + this.anInt9647;
			@Pc(281) int local281 = this.method8197(this.anInt9662) + this.anInt9656;
			local66.drawImage(this.anImage6, local272, (this.anInt9662 - local223) / 2 + local281, (ImageObserver) null);
			local66.drawImage(this.anImage4, local272 + this.anInt9667 - local228, local281 + (-local233 + this.anInt9662) / 2, (ImageObserver) null);
			if (this.anImage11 == null) {
				this.anImage11 = Static617.aCanvas13.createImage(this.anInt9667 - local228 - local218, this.anInt9662);
			}
			@Pc(340) Graphics local340 = this.anImage11.getGraphics();
			for (@Pc(342) int local342 = 0; local342 < this.anInt9667 - local218 - local228; local342 += local243) {
				local340.drawImage(this.anImage9, local342, 0, (ImageObserver) null);
			}
			for (@Pc(367) int local367 = 0; local367 < this.anInt9667 - local218 - local228; local367 += local253) {
				local340.drawImage(this.anImage7, local367, this.anInt9662 - local238, (ImageObserver) null);
			}
			@Pc(411) int local411 = local50 * (this.anInt9667 - local228 - local218) / 100;
			@Pc(447) int local447;
			if (local411 > 0) {
				@Pc(425) Image local425 = Static617.aCanvas13.createImage(local411, this.anInt9662 - local238 - local248);
				@Pc(429) int local429 = local425.getWidth((ImageObserver) null);
				@Pc(432) Graphics local432 = local425.getGraphics();
				@Pc(442) int local442 = this.anInt9664 * Static89.method5578() / 10 % local258;
				for (local447 = local442 - local258; local447 < local429; local447 += local258) {
					local432.drawImage(this.anImage13, local447, 0, (ImageObserver) null);
				}
				local340.drawImage(local425, 0, local248, (ImageObserver) null);
			}
			@Pc(473) int local473 = local411;
			local411 = this.anInt9667 - local411 - local228 - local218;
			if (local411 > 0) {
				@Pc(498) Image local498 = Static617.aCanvas13.createImage(local411, this.anInt9662 - local238 - local248);
				@Pc(502) int local502 = local498.getWidth((ImageObserver) null);
				@Pc(505) Graphics local505 = local498.getGraphics();
				for (local447 = 0; local447 < local502; local447 += local263) {
					local505.drawImage(this.anImage8, local447, 0, (ImageObserver) null);
				}
				local340.drawImage(local498, local473, local248, (ImageObserver) null);
			}
			local66.drawImage(this.anImage11, local218 + local272, local281, (ImageObserver) null);
			local66.setFont(this.aFont2);
			local66.setColor(this.aColor1);
			local66.drawString(local56, (this.anInt9667 - this.aFontMetrics1.stringWidth(local56)) / 2 + local272, this.anInt9659 + 4 + this.anInt9662 / 2 + local281);
			local37.drawImage(Static103.anImage1, 0, 0, (ImageObserver) null);
		} catch (@Pc(587) Exception local587) {
			this.aBoolean732 = true;
		}
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(BLjava/lang/Object;Ljava/lang/String;Ljava/lang/Class;)I")
	private int method8201(@OriginalArg(1) Object arg0, @OriginalArg(2) String arg1, @OriginalArg(3) Class arg2) throws IllegalAccessException, NoSuchFieldException {
		@Pc(13) Field local13 = arg2.getDeclaredField(arg1);
		return local13.getInt(arg0);
	}

	@OriginalMember(owner = "client!v", name = "b", descriptor = "(I)V")
	@Override
	public void method8191() {
		Static349.method8596();
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(BLjava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;")
	private Object method8202(@OriginalArg(1) Class arg0, @OriginalArg(2) String arg1) throws IllegalAccessException, NoSuchFieldException {
		@Pc(15) Field local15 = arg0.getDeclaredField(arg1);
		@Pc(19) Object local19 = local15.get(Static303.anApplet3);
		local15.set(Static303.anApplet3, (Object) null);
		return local19;
	}

	@OriginalMember(owner = "client!v", name = "b", descriptor = "(B)V")
	private void method8203() throws IllegalAccessException, NoSuchFieldException {
		@Pc(6) Class local6 = Static303.anApplet3.getClass();
		this.anImage13 = (Image) this.method8202(local6, "bar");
		this.anImage8 = (Image) this.method8202(local6, "background");
		this.anImage6 = (Image) this.method8202(local6, "left");
		this.anImage4 = (Image) this.method8202(local6, "right");
		this.anImage9 = (Image) this.method8202(local6, "top");
		this.anImage7 = (Image) this.method8202(local6, "bottom");
		this.anImage10 = (Image) this.method8202(local6, "bodyLeft");
		this.anImage5 = (Image) this.method8202(local6, "bodyRight");
		this.anImage12 = (Image) this.method8202(local6, "bodyFill");
		this.aFont2 = (Font) this.method8202(local6, "bf");
		this.aFontMetrics1 = (FontMetrics) this.method8202(local6, "bfm");
		this.aColor1 = (Color) this.method8202(local6, "colourtext");
		@Pc(108) Object local108 = this.method8202(local6, "lb");
		@Pc(111) Class local111 = local108.getClass();
		this.aBoolean734 = this.method8198("xMiddle", local111, local108);
		this.aBoolean733 = this.method8198("yMiddle", local111, local108);
		this.anInt9647 = this.method8201(local108, "xOffset", local111);
		this.anInt9656 = this.method8201(local108, "yOffset", local111);
		this.anInt9667 = this.method8201(local108, "width", local111);
		this.anInt9662 = this.method8201(local108, "height", local111);
		this.anInt9658 = this.method8201(local108, "boxXOffset", local111);
		this.anInt9649 = this.method8201(local108, "boxYOffset", local111);
		this.anInt9646 = this.method8201(local108, "boxWidth", local111);
		this.anInt9659 = this.method8201(local108, "textYOffset", local111);
		this.anInt9664 = this.method8201(local108, "offsetPerTenCycles", local111);
	}
}
