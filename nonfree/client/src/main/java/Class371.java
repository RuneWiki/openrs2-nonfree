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

@OriginalClass("client!wba")
public final class Class371 implements Interface2 {

	@OriginalMember(owner = "client!wba", name = "a", descriptor = "Ljava/awt/Font;")
	private Font aFont2;

	@OriginalMember(owner = "client!wba", name = "b", descriptor = "I")
	private int anInt10322;

	@OriginalMember(owner = "client!wba", name = "d", descriptor = "Ljava/awt/Image;")
	private Image anImage4;

	@OriginalMember(owner = "client!wba", name = "e", descriptor = "I")
	private int anInt10324;

	@OriginalMember(owner = "client!wba", name = "f", descriptor = "I")
	private int anInt10325;

	@OriginalMember(owner = "client!wba", name = "g", descriptor = "Ljava/awt/Image;")
	private Image anImage5;

	@OriginalMember(owner = "client!wba", name = "h", descriptor = "Ljava/awt/Image;")
	private Image anImage6;

	@OriginalMember(owner = "client!wba", name = "i", descriptor = "Ljava/awt/Image;")
	private Image anImage7;

	@OriginalMember(owner = "client!wba", name = "k", descriptor = "Z")
	private boolean aBoolean735;

	@OriginalMember(owner = "client!wba", name = "l", descriptor = "Ljava/awt/Color;")
	private Color aColor1;

	@OriginalMember(owner = "client!wba", name = "m", descriptor = "I")
	private int anInt10327;

	@OriginalMember(owner = "client!wba", name = "o", descriptor = "Ljava/awt/Image;")
	private Image anImage8;

	@OriginalMember(owner = "client!wba", name = "q", descriptor = "Ljava/awt/Image;")
	private Image anImage9;

	@OriginalMember(owner = "client!wba", name = "t", descriptor = "Ljava/awt/FontMetrics;")
	private FontMetrics aFontMetrics1;

	@OriginalMember(owner = "client!wba", name = "x", descriptor = "Z")
	private boolean aBoolean736;

	@OriginalMember(owner = "client!wba", name = "y", descriptor = "Ljava/awt/Image;")
	private Image anImage10;

	@OriginalMember(owner = "client!wba", name = "z", descriptor = "Ljava/awt/Image;")
	private Image anImage11;

	@OriginalMember(owner = "client!wba", name = "A", descriptor = "I")
	private int anInt10334;

	@OriginalMember(owner = "client!wba", name = "B", descriptor = "Ljava/awt/Image;")
	private Image anImage12;

	@OriginalMember(owner = "client!wba", name = "C", descriptor = "I")
	private int anInt10335;

	@OriginalMember(owner = "client!wba", name = "F", descriptor = "I")
	private int anInt10337;

	@OriginalMember(owner = "client!wba", name = "G", descriptor = "Ljava/awt/Image;")
	private Image anImage13;

	@OriginalMember(owner = "client!wba", name = "I", descriptor = "I")
	private int anInt10339;

	@OriginalMember(owner = "client!wba", name = "J", descriptor = "I")
	private int anInt10340;

	@OriginalMember(owner = "client!wba", name = "O", descriptor = "Z")
	private boolean aBoolean737;

	@OriginalMember(owner = "client!wba", name = "a", descriptor = "(Z)I")
	@Override
	public int method8796() {
		return 0;
	}

	@OriginalMember(owner = "client!wba", name = "a", descriptor = "(B)I")
	@Override
	public int method8793() {
		return 100;
	}

	@OriginalMember(owner = "client!wba", name = "b", descriptor = "(B)V")
	@Override
	public void method8794() {
	}

	@OriginalMember(owner = "client!wba", name = "b", descriptor = "(I)V")
	private void method8799() throws IllegalAccessException, NoSuchFieldException {
		@Pc(6) Class local6 = Static7.anApplet1.getClass();
		this.anImage8 = (Image) this.method8802(local6, "bar");
		this.anImage7 = (Image) this.method8802(local6, "background");
		this.anImage4 = (Image) this.method8802(local6, "left");
		this.anImage6 = (Image) this.method8802(local6, "right");
		this.anImage10 = (Image) this.method8802(local6, "top");
		this.anImage11 = (Image) this.method8802(local6, "bottom");
		this.anImage5 = (Image) this.method8802(local6, "bodyLeft");
		this.anImage9 = (Image) this.method8802(local6, "bodyRight");
		this.anImage12 = (Image) this.method8802(local6, "bodyFill");
		this.aFont2 = (Font) this.method8802(local6, "bf");
		this.aFontMetrics1 = (FontMetrics) this.method8802(local6, "bfm");
		this.aColor1 = (Color) this.method8802(local6, "colourtext");
		@Pc(108) Object local108 = this.method8802(local6, "lb");
		@Pc(111) Class local111 = local108.getClass();
		this.aBoolean735 = this.method8805("xMiddle", local108, local111);
		this.aBoolean737 = this.method8805("yMiddle", local108, local111);
		this.anInt10340 = this.method8803("xOffset", local108, local111);
		this.anInt10337 = this.method8803("yOffset", local108, local111);
		this.anInt10327 = this.method8803("width", local108, local111);
		this.anInt10322 = this.method8803("height", local108, local111);
		this.anInt10334 = this.method8803("boxXOffset", local108, local111);
		this.anInt10324 = this.method8803("boxYOffset", local108, local111);
		this.anInt10325 = this.method8803("boxWidth", local108, local111);
		this.anInt10335 = this.method8803("textYOffset", local108, local111);
		this.anInt10339 = this.method8803("offsetPerTenCycles", local108, local111);
	}

	@OriginalMember(owner = "client!wba", name = "a", descriptor = "(IB)I")
	private int method8800(@OriginalArg(0) int arg0) {
		return this.aBoolean735 ? (Static345.anInt5827 - arg0) / 2 : 0;
	}

	@OriginalMember(owner = "client!wba", name = "a", descriptor = "(Ljava/lang/Class;Ljava/lang/String;I)Ljava/lang/Object;")
	private Object method8802(@OriginalArg(0) Class arg0, @OriginalArg(1) String arg1) throws IllegalAccessException, NoSuchFieldException {
		@Pc(7) Field local7 = arg0.getDeclaredField(arg1);
		@Pc(11) Object local11 = local7.get(Static7.anApplet1);
		local7.set(Static7.anApplet1, null);
		return local11;
	}

	@OriginalMember(owner = "client!wba", name = "a", descriptor = "(IJ)Z")
	@Override
	public boolean method8792(@OriginalArg(1) long arg0) {
		return true;
	}

	@OriginalMember(owner = "client!wba", name = "c", descriptor = "(B)V")
	@Override
	public void method8795() {
		Static170.method2654();
	}

	@OriginalMember(owner = "client!wba", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Class;)I")
	private int method8803(@OriginalArg(0) String arg0, @OriginalArg(1) Object arg1, @OriginalArg(3) Class arg2) throws IllegalAccessException, NoSuchFieldException {
		@Pc(12) Field local12 = arg2.getDeclaredField(arg0);
		return local12.getInt(arg1);
	}

	@OriginalMember(owner = "client!wba", name = "b", descriptor = "(IB)I")
	private int method8804(@OriginalArg(0) int arg0) {
		return this.aBoolean737 ? (Static408.anInt7118 - arg0) / 2 : 0;
	}

	@OriginalMember(owner = "client!wba", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Object;ZLjava/lang/Class;)Z")
	private boolean method8805(@OriginalArg(0) String arg0, @OriginalArg(1) Object arg1, @OriginalArg(3) Class arg2) throws IllegalAccessException, NoSuchFieldException {
		@Pc(7) Field local7 = arg2.getDeclaredField(arg0);
		return local7.getBoolean(arg1);
	}

	@OriginalMember(owner = "client!wba", name = "a", descriptor = "(ZI)V")
	@Override
	public void method8797(@OriginalArg(0) boolean arg0) {
		if (!this.aBoolean736) {
			if (Static7.anApplet1 == null) {
				this.aBoolean736 = true;
			} else if (this.aFont2 == null) {
				try {
					this.method8799();
				} catch (@Pc(24) Exception local24) {
					this.aBoolean736 = true;
				}
			}
		}
		if (this.aBoolean736) {
			this.method8806();
			return;
		}
		@Pc(42) Graphics local42 = Static83.aCanvas14.getGraphics();
		if (local42 == null) {
			Static83.aCanvas14.repaint();
			return;
		}
		try {
			@Pc(51) int local51 = Static299.aClass347_1.method8229();
			@Pc(55) String local55 = Static299.aClass347_1.method8226();
			if (Static538.anImage3 == null) {
				Static538.anImage3 = Static83.aCanvas14.createImage(Static345.anInt5827, Static408.anInt7118);
			}
			@Pc(65) Graphics local65 = Static538.anImage3.getGraphics();
			local65.clearRect(0, 0, Static345.anInt5827, Static408.anInt7118);
			@Pc(76) int local76 = this.anImage5.getWidth(null);
			@Pc(81) int local81 = this.anImage9.getWidth(null);
			@Pc(86) int local86 = this.anImage12.getWidth(null);
			@Pc(91) int local91 = this.anImage5.getHeight(null);
			@Pc(96) int local96 = this.anImage9.getHeight(null);
			@Pc(101) int local101 = this.anImage12.getHeight(null);
			local65.drawImage(this.anImage5, this.method8800(local76) + this.anInt10334 - this.anInt10325 / 2, this.method8804(local91) - -this.anInt10324, null);
			@Pc(140) int local140 = local76 + this.anInt10334 - this.anInt10325 / 2;
			@Pc(148) int local148 = this.anInt10325 / 2 + this.anInt10334;
			for (@Pc(150) int local150 = local140; local150 <= local148; local150 += local86) {
				local65.drawImage(this.anImage12, this.method8800(local76) + this.anInt10334 + local150, this.method8804(local101) - -this.anInt10324, null);
			}
			local65.drawImage(this.anImage9, this.method8800(local81) + this.anInt10334 + this.anInt10325 / 2, this.method8804(local96) - -this.anInt10324, null);
			@Pc(216) int local216 = this.anImage4.getWidth(null);
			@Pc(221) int local221 = this.anImage4.getHeight(null);
			@Pc(226) int local226 = this.anImage6.getWidth(null);
			@Pc(231) int local231 = this.anImage6.getHeight(null);
			@Pc(236) int local236 = this.anImage11.getHeight(null);
			@Pc(241) int local241 = this.anImage10.getWidth(null);
			@Pc(246) int local246 = this.anImage10.getHeight(null);
			@Pc(251) int local251 = this.anImage11.getWidth(null);
			@Pc(256) int local256 = this.anImage8.getWidth(null);
			@Pc(261) int local261 = this.anImage7.getWidth(null);
			@Pc(271) int local271 = this.method8800(this.anInt10327) + this.anInt10340;
			@Pc(280) int local280 = this.method8804(this.anInt10322) + this.anInt10337;
			local65.drawImage(this.anImage4, local271, local280 + (this.anInt10322 - local221) / 2, null);
			local65.drawImage(this.anImage6, this.anInt10327 + local271 - local226, (-local231 + this.anInt10322) / 2 + local280, null);
			if (this.anImage13 == null) {
				this.anImage13 = Static83.aCanvas14.createImage(this.anInt10327 - local216 - local226, this.anInt10322);
			}
			@Pc(338) Graphics local338 = this.anImage13.getGraphics();
			for (@Pc(340) int local340 = 0; local340 < this.anInt10327 - local216 - local226; local340 += local241) {
				local338.drawImage(this.anImage10, local340, 0, null);
			}
			for (@Pc(368) int local368 = 0; local368 < this.anInt10327 - local216 - local226; local368 += local251) {
				local338.drawImage(this.anImage11, local368, this.anInt10322 - local236, null);
			}
			@Pc(406) int local406 = (this.anInt10327 - local216 - local226) * local51 / 100;
			@Pc(440) int local440;
			if (local406 > 0) {
				@Pc(419) Image local419 = Static83.aCanvas14.createImage(local406, this.anInt10322 - local246 - local236);
				@Pc(423) int local423 = local419.getWidth(null);
				@Pc(426) Graphics local426 = local419.getGraphics();
				@Pc(436) int local436 = this.anInt10339 * Static602.method8620() / 10 % local256;
				for (local440 = local436 - local256; local440 < local423; local440 += local256) {
					local426.drawImage(this.anImage8, local440, 0, null);
				}
				local338.drawImage(local419, 0, local246, null);
			}
			@Pc(470) int local470 = local406;
			local406 = this.anInt10327 - local216 - local226 - local406;
			if (local406 > 0) {
				@Pc(497) Image local497 = Static83.aCanvas14.createImage(local406, this.anInt10322 - local246 - local236);
				@Pc(501) int local501 = local497.getWidth(null);
				@Pc(504) Graphics local504 = local497.getGraphics();
				for (local440 = 0; local440 < local501; local440 += local261) {
					local504.drawImage(this.anImage7, local440, 0, null);
				}
				local338.drawImage(local497, local470, local246, null);
			}
			local65.drawImage(this.anImage13, local271 + local216, local280, null);
			local65.setFont(this.aFont2);
			local65.setColor(this.aColor1);
			local65.drawString(local55, (this.anInt10327 - this.aFontMetrics1.stringWidth(local55)) / 2 + local271, this.anInt10322 / 2 + 4 + (local280 - -this.anInt10335));
			local42.drawImage(Static538.anImage3, 0, 0, null);
		} catch (@Pc(588) Exception local588) {
			this.aBoolean736 = true;
		}
	}

	@OriginalMember(owner = "client!wba", name = "d", descriptor = "(B)V")
	private void method8806() {
		Static218.method3712(Static257.aColorArray2[Static320.anInt5438], Static390.aColorArray3[Static320.anInt5438], Static187.aColorArray1[Static320.anInt5438], Static299.aClass347_1.method8226(), Static299.aClass347_1.method8229());
	}
}
