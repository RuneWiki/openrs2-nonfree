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

@OriginalClass("client!ria")
public final class Class289 implements Interface15 {

	@OriginalMember(owner = "client!ria", name = "a", descriptor = "Ljava/awt/FontMetrics;")
	private FontMetrics aFontMetrics1;

	@OriginalMember(owner = "client!ria", name = "b", descriptor = "Ljava/awt/Image;")
	private Image anImage3;

	@OriginalMember(owner = "client!ria", name = "e", descriptor = "Ljava/awt/Color;")
	private Color aColor1;

	@OriginalMember(owner = "client!ria", name = "i", descriptor = "I")
	private int anInt8661;

	@OriginalMember(owner = "client!ria", name = "j", descriptor = "Z")
	private boolean aBoolean733;

	@OriginalMember(owner = "client!ria", name = "k", descriptor = "I")
	private int anInt8662;

	@OriginalMember(owner = "client!ria", name = "l", descriptor = "Ljava/awt/Image;")
	private Image anImage4;

	@OriginalMember(owner = "client!ria", name = "m", descriptor = "Ljava/awt/Image;")
	private Image anImage5;

	@OriginalMember(owner = "client!ria", name = "o", descriptor = "Z")
	private boolean aBoolean734;

	@OriginalMember(owner = "client!ria", name = "p", descriptor = "Z")
	private boolean aBoolean735;

	@OriginalMember(owner = "client!ria", name = "q", descriptor = "I")
	private int anInt8664;

	@OriginalMember(owner = "client!ria", name = "r", descriptor = "Ljava/awt/Image;")
	private Image anImage6;

	@OriginalMember(owner = "client!ria", name = "v", descriptor = "Ljava/awt/Image;")
	private Image anImage7;

	@OriginalMember(owner = "client!ria", name = "x", descriptor = "I")
	private int anInt8669;

	@OriginalMember(owner = "client!ria", name = "B", descriptor = "Ljava/awt/Image;")
	private Image anImage8;

	@OriginalMember(owner = "client!ria", name = "C", descriptor = "Ljava/awt/Image;")
	private Image anImage9;

	@OriginalMember(owner = "client!ria", name = "D", descriptor = "Ljava/awt/Image;")
	private Image anImage10;

	@OriginalMember(owner = "client!ria", name = "E", descriptor = "I")
	private int anInt8672;

	@OriginalMember(owner = "client!ria", name = "G", descriptor = "Ljava/awt/Image;")
	private Image anImage11;

	@OriginalMember(owner = "client!ria", name = "I", descriptor = "I")
	private int anInt8674;

	@OriginalMember(owner = "client!ria", name = "L", descriptor = "I")
	private int anInt8676;

	@OriginalMember(owner = "client!ria", name = "M", descriptor = "Ljava/awt/Image;")
	private Image anImage12;

	@OriginalMember(owner = "client!ria", name = "N", descriptor = "Ljava/awt/Font;")
	private Font aFont1;

	@OriginalMember(owner = "client!ria", name = "P", descriptor = "I")
	private int anInt8678;

	@OriginalMember(owner = "client!ria", name = "Q", descriptor = "I")
	private int anInt8679;

	@OriginalMember(owner = "client!ria", name = "a", descriptor = "(Ljava/lang/String;BLjava/lang/Class;)Ljava/lang/Object;")
	private Object method7160(@OriginalArg(0) String arg0, @OriginalArg(2) Class arg1) throws IllegalAccessException, NoSuchFieldException {
		@Pc(12) Field local12 = arg1.getDeclaredField(arg0);
		@Pc(16) Object local16 = local12.get(Static632.anApplet2);
		local12.set(Static632.anApplet2, null);
		return local16;
	}

	@OriginalMember(owner = "client!ria", name = "a", descriptor = "(B)V")
	private void method7161() {
		Static243.method4641(Static515.aColorArray5[Static191.anInt4461], Static99.aClass348_1.method8104(), Static99.aClass348_1.method8111(), Static628.aColorArray6[Static191.anInt4461], Static436.aColorArray4[Static191.anInt4461]);
	}

	@OriginalMember(owner = "client!ria", name = "d", descriptor = "(I)V")
	private void method7162() throws IllegalAccessException, NoSuchFieldException {
		@Pc(6) Class local6 = Static632.anApplet2.getClass();
		this.anImage8 = (Image) this.method7160("bar", local6);
		this.anImage12 = (Image) this.method7160("background", local6);
		this.anImage9 = (Image) this.method7160("left", local6);
		this.anImage10 = (Image) this.method7160("right", local6);
		this.anImage5 = (Image) this.method7160("top", local6);
		this.anImage4 = (Image) this.method7160("bottom", local6);
		this.anImage6 = (Image) this.method7160("bodyLeft", local6);
		this.anImage3 = (Image) this.method7160("bodyRight", local6);
		this.anImage7 = (Image) this.method7160("bodyFill", local6);
		this.aFont1 = (Font) this.method7160("bf", local6);
		this.aFontMetrics1 = (FontMetrics) this.method7160("bfm", local6);
		this.aColor1 = (Color) this.method7160("colourtext", local6);
		@Pc(108) Object local108 = this.method7160("lb", local6);
		@Pc(111) Class local111 = local108.getClass();
		this.aBoolean734 = this.method7163("xMiddle", local108, local111);
		this.aBoolean733 = this.method7163("yMiddle", local108, local111);
		this.anInt8676 = this.method7167("xOffset", local111, local108);
		this.anInt8669 = this.method7167("yOffset", local111, local108);
		this.anInt8678 = this.method7167("width", local111, local108);
		this.anInt8662 = this.method7167("height", local111, local108);
		this.anInt8672 = this.method7167("boxXOffset", local111, local108);
		this.anInt8664 = this.method7167("boxYOffset", local111, local108);
		this.anInt8661 = this.method7167("boxWidth", local111, local108);
		this.anInt8674 = this.method7167("textYOffset", local111, local108);
		this.anInt8679 = this.method7167("offsetPerTenCycles", local111, local108);
	}

	@OriginalMember(owner = "client!ria", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Class;)Z")
	private boolean method7163(@OriginalArg(0) String arg0, @OriginalArg(1) Object arg1, @OriginalArg(3) Class arg2) throws IllegalAccessException, NoSuchFieldException {
		@Pc(13) Field local13 = arg2.getDeclaredField(arg0);
		return local13.getBoolean(arg1);
	}

	@OriginalMember(owner = "client!ria", name = "a", descriptor = "(IZ)V")
	@Override
	public void method7156(@OriginalArg(1) boolean arg0) {
		if (!this.aBoolean735) {
			if (Static632.anApplet2 == null) {
				this.aBoolean735 = true;
			} else if (this.aFont1 == null) {
				try {
					this.method7162();
				} catch (@Pc(14) Exception local14) {
					this.aBoolean735 = true;
				}
			}
		}
		if (this.aBoolean735) {
			this.method7161();
			return;
		}
		@Pc(42) Graphics local42 = Static177.aCanvas10.getGraphics();
		if (local42 == null) {
			Static177.aCanvas10.repaint();
			return;
		}
		try {
			@Pc(51) int local51 = Static99.aClass348_1.method8104();
			@Pc(55) String local55 = Static99.aClass348_1.method8111();
			if (Static411.anImage1 == null) {
				Static411.anImage1 = Static177.aCanvas10.createImage(Static114.anInt2970, Static256.anInt5669);
			}
			@Pc(65) Graphics local65 = Static411.anImage1.getGraphics();
			local65.clearRect(0, 0, Static114.anInt2970, Static256.anInt5669);
			@Pc(76) int local76 = this.anImage6.getWidth(null);
			@Pc(81) int local81 = this.anImage3.getWidth(null);
			@Pc(86) int local86 = this.anImage7.getWidth(null);
			@Pc(91) int local91 = this.anImage6.getHeight(null);
			@Pc(96) int local96 = this.anImage3.getHeight(null);
			@Pc(101) int local101 = this.anImage7.getHeight(null);
			local65.drawImage(this.anImage6, this.method7165(local76) + this.anInt8672 - this.anInt8661 / 2, this.method7166(local91) + this.anInt8664, null);
			@Pc(138) int local138 = local76 + this.anInt8672 - this.anInt8661 / 2;
			@Pc(146) int local146 = this.anInt8661 / 2 + this.anInt8672;
			for (@Pc(148) int local148 = local138; local148 <= local146; local148 += local86) {
				local65.drawImage(this.anImage7, this.method7165(local76) + this.anInt8672 + local148, this.method7166(local101) + this.anInt8664, null);
			}
			local65.drawImage(this.anImage3, this.method7165(local81) + this.anInt8672 + this.anInt8661 / 2, this.method7166(local96) - -this.anInt8664, null);
			@Pc(217) int local217 = this.anImage9.getWidth(null);
			@Pc(222) int local222 = this.anImage9.getHeight(null);
			@Pc(227) int local227 = this.anImage10.getWidth(null);
			@Pc(232) int local232 = this.anImage10.getHeight(null);
			@Pc(237) int local237 = this.anImage4.getHeight(null);
			@Pc(242) int local242 = this.anImage5.getWidth(null);
			@Pc(247) int local247 = this.anImage5.getHeight(null);
			@Pc(252) int local252 = this.anImage4.getWidth(null);
			@Pc(257) int local257 = this.anImage8.getWidth(null);
			@Pc(262) int local262 = this.anImage12.getWidth(null);
			@Pc(272) int local272 = this.method7165(this.anInt8678) + this.anInt8676;
			@Pc(282) int local282 = this.method7166(this.anInt8662) + this.anInt8669;
			local65.drawImage(this.anImage9, local272, (this.anInt8662 - local222) / 2 + local282, null);
			local65.drawImage(this.anImage10, this.anInt8678 + local272 - local227, (-local232 + this.anInt8662) / 2 + local282, null);
			if (this.anImage11 == null) {
				this.anImage11 = Static177.aCanvas10.createImage(this.anInt8678 - local217 - local227, this.anInt8662);
			}
			@Pc(340) Graphics local340 = this.anImage11.getGraphics();
			for (@Pc(342) int local342 = 0; local342 < this.anInt8678 - local227 - local217; local342 += local242) {
				local340.drawImage(this.anImage5, local342, 0, null);
			}
			for (@Pc(372) int local372 = 0; local372 < this.anInt8678 - local217 - local227; local372 += local252) {
				local340.drawImage(this.anImage4, local372, this.anInt8662 - local237, null);
			}
			@Pc(410) int local410 = local51 * (this.anInt8678 - local217 - local227) / 100;
			@Pc(446) int local446;
			if (local410 > 0) {
				@Pc(424) Image local424 = Static177.aCanvas10.createImage(local410, this.anInt8662 - local247 - local237);
				@Pc(428) int local428 = local424.getWidth(null);
				@Pc(431) Graphics local431 = local424.getGraphics();
				@Pc(441) int local441 = this.anInt8679 * Static280.method4954() / 10 % local257;
				for (local446 = local441 - local257; local446 < local428; local446 += local257) {
					local431.drawImage(this.anImage8, local446, 0, null);
				}
				local340.drawImage(local424, 0, local247, null);
			}
			@Pc(476) int local476 = local410;
			local410 = this.anInt8678 - local410 - local217 - local227;
			if (local410 > 0) {
				@Pc(505) Image local505 = Static177.aCanvas10.createImage(local410, this.anInt8662 - local247 - local237);
				@Pc(509) int local509 = local505.getWidth(null);
				@Pc(512) Graphics local512 = local505.getGraphics();
				for (local446 = 0; local446 < local509; local446 += local262) {
					local512.drawImage(this.anImage12, local446, 0, null);
				}
				local340.drawImage(local505, local476, local247, null);
			}
			local65.drawImage(this.anImage11, local272 + local217, local282, null);
			local65.setFont(this.aFont1);
			local65.setColor(this.aColor1);
			local65.drawString(local55, local272 + (this.anInt8678 - this.aFontMetrics1.stringWidth(local55)) / 2, local282 - (-(this.anInt8662 / 2) - 4 - this.anInt8674));
			local42.drawImage(Static411.anImage1, 0, 0, null);
		} catch (@Pc(597) Exception local597) {
			this.aBoolean735 = true;
		}
	}

	@OriginalMember(owner = "client!ria", name = "a", descriptor = "(II)I")
	private int method7165(@OriginalArg(0) int arg0) {
		return this.aBoolean734 ? (Static114.anInt2970 - arg0) / 2 : 0;
	}

	@OriginalMember(owner = "client!ria", name = "c", descriptor = "(I)I")
	@Override
	public int method7159() {
		return 100;
	}

	@OriginalMember(owner = "client!ria", name = "a", descriptor = "(IB)I")
	private int method7166(@OriginalArg(0) int arg0) {
		return this.aBoolean733 ? (Static256.anInt5669 - arg0) / 2 : 0;
	}

	@OriginalMember(owner = "client!ria", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Object;I)I")
	private int method7167(@OriginalArg(0) String arg0, @OriginalArg(1) Class arg1, @OriginalArg(2) Object arg2) throws IllegalAccessException, NoSuchFieldException {
		@Pc(11) Field local11 = arg1.getDeclaredField(arg0);
		return local11.getInt(arg2);
	}

	@OriginalMember(owner = "client!ria", name = "a", descriptor = "(Z)I")
	@Override
	public int method7155() {
		return 0;
	}

	@OriginalMember(owner = "client!ria", name = "a", descriptor = "(IJ)Z")
	@Override
	public boolean method7154(@OriginalArg(1) long arg0) {
		return true;
	}

	@OriginalMember(owner = "client!ria", name = "b", descriptor = "(I)V")
	@Override
	public void method7158() {
	}

	@OriginalMember(owner = "client!ria", name = "a", descriptor = "(I)V")
	@Override
	public void method7157() {
		Static74.method1852();
	}
}
