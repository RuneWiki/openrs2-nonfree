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

@OriginalClass("client!hd")
public final class Class149 implements Interface8 {

	@OriginalMember(owner = "client!hd", name = "w", descriptor = "I")
	private int anInt3627;

	@OriginalMember(owner = "client!hd", name = "f", descriptor = "Ljava/awt/Image;")
	private Image anImage2;

	@OriginalMember(owner = "client!hd", name = "D", descriptor = "Ljava/awt/Image;")
	private Image anImage3;

	@OriginalMember(owner = "client!hd", name = "z", descriptor = "Z")
	private boolean aBoolean325;

	@OriginalMember(owner = "client!hd", name = "e", descriptor = "I")
	private int anInt3630;

	@OriginalMember(owner = "client!hd", name = "k", descriptor = "Ljava/awt/Image;")
	private Image anImage4;

	@OriginalMember(owner = "client!hd", name = "o", descriptor = "Ljava/awt/Image;")
	private Image anImage5;

	@OriginalMember(owner = "client!hd", name = "r", descriptor = "Ljava/awt/Image;")
	private Image anImage6;

	@OriginalMember(owner = "client!hd", name = "i", descriptor = "I")
	private int anInt3631;

	@OriginalMember(owner = "client!hd", name = "J", descriptor = "Ljava/awt/Color;")
	private Color aColor1;

	@OriginalMember(owner = "client!hd", name = "u", descriptor = "Ljava/awt/Image;")
	private Image anImage7;

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "Ljava/awt/Image;")
	private Image anImage8;

	@OriginalMember(owner = "client!hd", name = "s", descriptor = "Z")
	private boolean aBoolean326;

	@OriginalMember(owner = "client!hd", name = "v", descriptor = "Ljava/awt/FontMetrics;")
	private FontMetrics aFontMetrics1;

	@OriginalMember(owner = "client!hd", name = "t", descriptor = "I")
	private int anInt3635;

	@OriginalMember(owner = "client!hd", name = "C", descriptor = "Ljava/awt/Image;")
	private Image anImage9;

	@OriginalMember(owner = "client!hd", name = "H", descriptor = "I")
	private int anInt3637;

	@OriginalMember(owner = "client!hd", name = "G", descriptor = "I")
	private int anInt3638;

	@OriginalMember(owner = "client!hd", name = "K", descriptor = "I")
	private int anInt3639;

	@OriginalMember(owner = "client!hd", name = "j", descriptor = "Ljava/awt/Font;")
	private Font aFont1;

	@OriginalMember(owner = "client!hd", name = "M", descriptor = "Ljava/awt/Image;")
	private Image anImage10;

	@OriginalMember(owner = "client!hd", name = "I", descriptor = "Z")
	private boolean aBoolean327;

	@OriginalMember(owner = "client!hd", name = "L", descriptor = "I")
	private int anInt3645;

	@OriginalMember(owner = "client!hd", name = "l", descriptor = "Ljava/awt/Image;")
	private Image anImage11;

	@OriginalMember(owner = "client!hd", name = "F", descriptor = "I")
	private int anInt3646;

	@OriginalMember(owner = "client!hd", name = "b", descriptor = "(I)I")
	@Override
	public int method7191() {
		return 0;
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(II)I")
	private int method3276(@OriginalArg(0) int arg0) {
		return this.aBoolean325 ? (Static151.anInt7983 - arg0) / 2 : 0;
	}

	@OriginalMember(owner = "client!hd", name = "b", descriptor = "(Z)V")
	@Override
	public void method7190() {
	}

	@OriginalMember(owner = "client!hd", name = "b", descriptor = "(II)I")
	private int method3277(@OriginalArg(1) int arg0) {
		return this.aBoolean327 ? (Static295.anInt4558 - arg0) / 2 : 0;
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(ILjava/lang/Class;Ljava/lang/Object;Ljava/lang/String;)I")
	private int method3278(@OriginalArg(1) Class arg0, @OriginalArg(2) Object arg1, @OriginalArg(3) String arg2) throws IllegalAccessException, NoSuchFieldException {
		@Pc(13) Field local13 = arg0.getDeclaredField(arg2);
		return local13.getInt(arg1);
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(BJ)Z")
	@Override
	public boolean method7189(@OriginalArg(1) long arg0) {
		return true;
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(Ljava/lang/String;BLjava/lang/Class;Ljava/lang/Object;)Z")
	private boolean method3279(@OriginalArg(0) String arg0, @OriginalArg(2) Class arg1, @OriginalArg(3) Object arg2) throws IllegalAccessException, NoSuchFieldException {
		@Pc(13) Field local13 = arg1.getDeclaredField(arg0);
		return local13.getBoolean(arg2);
	}

	@OriginalMember(owner = "client!hd", name = "c", descriptor = "(I)V")
	private void method3280() {
		Static8.method113(Static333.aColorArray2[Static667.anInt10369], Static450.aColorArray3[Static667.anInt10369], Static49.aColorArray1[Static667.anInt10369], Static591.aClass337_3.method8101(), Static591.aClass337_3.method8102());
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(Z)V")
	@Override
	public void method7188() {
		Static290.method4541();
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;")
	private Object method3281(@OriginalArg(1) String arg0, @OriginalArg(2) Class arg1) throws IllegalAccessException, NoSuchFieldException {
		@Pc(16) Field local16 = arg1.getDeclaredField(arg0);
		@Pc(20) Object local20 = local16.get(Static214.anApplet1);
		local16.set(Static214.anApplet1, (Object) null);
		return local20;
	}

	@OriginalMember(owner = "client!hd", name = "c", descriptor = "(Z)V")
	private void method3282() throws IllegalAccessException, NoSuchFieldException {
		@Pc(6) Class local6 = Static214.anApplet1.getClass();
		this.anImage8 = (Image) this.method3281("bar", local6);
		this.anImage4 = (Image) this.method3281("background", local6);
		this.anImage10 = (Image) this.method3281("left", local6);
		this.anImage5 = (Image) this.method3281("right", local6);
		this.anImage3 = (Image) this.method3281("top", local6);
		this.anImage9 = (Image) this.method3281("bottom", local6);
		this.anImage11 = (Image) this.method3281("bodyLeft", local6);
		this.anImage6 = (Image) this.method3281("bodyRight", local6);
		this.anImage2 = (Image) this.method3281("bodyFill", local6);
		this.aFont1 = (Font) this.method3281("bf", local6);
		this.aFontMetrics1 = (FontMetrics) this.method3281("bfm", local6);
		this.aColor1 = (Color) this.method3281("colourtext", local6);
		@Pc(142) Object local142 = this.method3281("lb", local6);
		@Pc(145) Class local145 = local142.getClass();
		this.aBoolean325 = this.method3279("xMiddle", local145, local142);
		this.aBoolean327 = this.method3279("yMiddle", local145, local142);
		this.anInt3646 = this.method3278(local145, local142, "xOffset");
		this.anInt3635 = this.method3278(local145, local142, "yOffset");
		this.anInt3639 = this.method3278(local145, local142, "width");
		this.anInt3638 = this.method3278(local145, local142, "height");
		this.anInt3631 = this.method3278(local145, local142, "boxXOffset");
		this.anInt3630 = this.method3278(local145, local142, "boxYOffset");
		this.anInt3627 = this.method3278(local145, local142, "boxWidth");
		this.anInt3637 = this.method3278(local145, local142, "textYOffset");
		this.anInt3645 = this.method3278(local145, local142, "offsetPerTenCycles");
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(IZ)V")
	@Override
	public void method7192(@OriginalArg(1) boolean arg0) {
		if (!this.aBoolean326) {
			if (Static214.anApplet1 == null) {
				this.aBoolean326 = true;
			} else if (this.aFont1 == null) {
				try {
					this.method3282();
				} catch (@Pc(22) Exception local22) {
					this.aBoolean326 = true;
				}
			}
		}
		if (this.aBoolean326) {
			this.method3280();
			return;
		}
		@Pc(51) Graphics local51 = Static316.aCanvas1.getGraphics();
		if (local51 == null) {
			Static316.aCanvas1.repaint();
			return;
		}
		try {
			@Pc(61) int local61 = Static591.aClass337_3.method8102();
			@Pc(65) String local65 = Static591.aClass337_3.method8101();
			if (Static8.anImage1 == null) {
				Static8.anImage1 = Static316.aCanvas1.createImage(Static151.anInt7983, Static295.anInt4558);
			}
			@Pc(77) Graphics local77 = Static8.anImage1.getGraphics();
			local77.clearRect(0, 0, Static151.anInt7983, Static295.anInt4558);
			@Pc(88) int local88 = this.anImage11.getWidth((ImageObserver) null);
			@Pc(93) int local93 = this.anImage6.getWidth((ImageObserver) null);
			@Pc(98) int local98 = this.anImage2.getWidth((ImageObserver) null);
			@Pc(103) int local103 = this.anImage11.getHeight((ImageObserver) null);
			@Pc(108) int local108 = this.anImage6.getHeight((ImageObserver) null);
			@Pc(113) int local113 = this.anImage2.getHeight((ImageObserver) null);
			local77.drawImage(this.anImage11, this.method3276(local88) + this.anInt3631 - this.anInt3627 / 2, this.method3277(local103) + this.anInt3630, (ImageObserver) null);
			@Pc(152) int local152 = local88 + this.anInt3631 - this.anInt3627 / 2;
			@Pc(160) int local160 = this.anInt3627 / 2 + this.anInt3631;
			for (@Pc(162) int local162 = local152; local162 <= local160; local162 += local98) {
				local77.drawImage(this.anImage2, local162 + this.method3276(local88) + this.anInt3631, this.method3277(local113) + this.anInt3630, (ImageObserver) null);
			}
			local77.drawImage(this.anImage6, this.method3276(local93) + this.anInt3631 + this.anInt3627 / 2, this.method3277(local108) + this.anInt3630, (ImageObserver) null);
			@Pc(236) int local236 = this.anImage10.getWidth((ImageObserver) null);
			@Pc(241) int local241 = this.anImage10.getHeight((ImageObserver) null);
			@Pc(246) int local246 = this.anImage5.getWidth((ImageObserver) null);
			@Pc(251) int local251 = this.anImage5.getHeight((ImageObserver) null);
			@Pc(256) int local256 = this.anImage9.getHeight((ImageObserver) null);
			@Pc(261) int local261 = this.anImage3.getWidth((ImageObserver) null);
			@Pc(266) int local266 = this.anImage3.getHeight((ImageObserver) null);
			@Pc(271) int local271 = this.anImage9.getWidth((ImageObserver) null);
			@Pc(276) int local276 = this.anImage8.getWidth((ImageObserver) null);
			@Pc(281) int local281 = this.anImage4.getWidth((ImageObserver) null);
			@Pc(290) int local290 = this.method3276(this.anInt3639) + this.anInt3646;
			@Pc(299) int local299 = this.method3277(this.anInt3638) + this.anInt3635;
			local77.drawImage(this.anImage10, local290, local299 + (this.anInt3638 - local241) / 2, (ImageObserver) null);
			local77.drawImage(this.anImage5, this.anInt3639 + local290 - local246, local299 + (-local251 + this.anInt3638) / 2, (ImageObserver) null);
			if (this.anImage7 == null) {
				this.anImage7 = Static316.aCanvas1.createImage(this.anInt3639 - local236 - local246, this.anInt3638);
			}
			@Pc(362) Graphics local362 = this.anImage7.getGraphics();
			for (@Pc(364) int local364 = 0; local364 < this.anInt3639 - local236 - local246; local364 += local261) {
				local362.drawImage(this.anImage3, local364, 0, (ImageObserver) null);
			}
			for (@Pc(395) int local395 = 0; local395 < this.anInt3639 - local236 - local246; local395 += local271) {
				local362.drawImage(this.anImage9, local395, this.anInt3638 - local256, (ImageObserver) null);
			}
			@Pc(440) int local440 = local61 * (this.anInt3639 - local246 - local236) / 100;
			@Pc(480) int local480;
			if (local440 > 0) {
				@Pc(459) Image local459 = Static316.aCanvas1.createImage(local440, this.anInt3638 - local256 - local266);
				@Pc(463) int local463 = local459.getWidth((ImageObserver) null);
				@Pc(466) Graphics local466 = local459.getGraphics();
				@Pc(476) int local476 = this.anInt3645 * Static281.method3944() / 10 % local276;
				for (local480 = local476 - local276; local480 < local463; local480 += local276) {
					local466.drawImage(this.anImage8, local480, 0, (ImageObserver) null);
				}
				local362.drawImage(local459, 0, local266, (ImageObserver) null);
			}
			@Pc(516) int local516 = local440;
			local440 = this.anInt3639 - local246 - local236 - local440;
			if (local440 > 0) {
				@Pc(540) Image local540 = Static316.aCanvas1.createImage(local440, this.anInt3638 - local256 - local266);
				@Pc(544) int local544 = local540.getWidth((ImageObserver) null);
				@Pc(547) Graphics local547 = local540.getGraphics();
				for (local480 = 0; local480 < local544; local480 += local281) {
					local547.drawImage(this.anImage4, local480, 0, (ImageObserver) null);
				}
				local362.drawImage(local540, local516, local266, (ImageObserver) null);
			}
			local77.drawImage(this.anImage7, local290 + local236, local299, (ImageObserver) null);
			local77.setFont(this.aFont1);
			local77.setColor(this.aColor1);
			local77.drawString(local65, local290 + (this.anInt3639 - this.aFontMetrics1.stringWidth(local65)) / 2, this.anInt3637 + (local299 - -(this.anInt3638 / 2) - -4));
			local51.drawImage(Static8.anImage1, 0, 0, (ImageObserver) null);
		} catch (@Pc(634) Exception local634) {
			this.aBoolean326 = true;
		}
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(I)I")
	@Override
	public int method7193() {
		return 100;
	}
}
