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
public final class Class367 implements Interface5 {

	@OriginalMember(owner = "client!wba", name = "a", descriptor = "Z")
	private boolean aBoolean734;

	@OriginalMember(owner = "client!wba", name = "b", descriptor = "I")
	private int anInt10804;

	@OriginalMember(owner = "client!wba", name = "c", descriptor = "Z")
	private boolean aBoolean735;

	@OriginalMember(owner = "client!wba", name = "d", descriptor = "I")
	private int anInt10805;

	@OriginalMember(owner = "client!wba", name = "e", descriptor = "Ljava/awt/FontMetrics;")
	private FontMetrics aFontMetrics1;

	@OriginalMember(owner = "client!wba", name = "g", descriptor = "Ljava/awt/Image;")
	private Image anImage4;

	@OriginalMember(owner = "client!wba", name = "j", descriptor = "I")
	private int anInt10809;

	@OriginalMember(owner = "client!wba", name = "k", descriptor = "Ljava/awt/Image;")
	private Image anImage5;

	@OriginalMember(owner = "client!wba", name = "m", descriptor = "Ljava/awt/Image;")
	private Image anImage6;

	@OriginalMember(owner = "client!wba", name = "o", descriptor = "Ljava/awt/Color;")
	private Color aColor1;

	@OriginalMember(owner = "client!wba", name = "p", descriptor = "Ljava/awt/Image;")
	private Image anImage7;

	@OriginalMember(owner = "client!wba", name = "q", descriptor = "I")
	private int anInt10812;

	@OriginalMember(owner = "client!wba", name = "r", descriptor = "Ljava/awt/Image;")
	private Image anImage8;

	@OriginalMember(owner = "client!wba", name = "u", descriptor = "I")
	private int anInt10815;

	@OriginalMember(owner = "client!wba", name = "v", descriptor = "Ljava/awt/Image;")
	private Image anImage9;

	@OriginalMember(owner = "client!wba", name = "w", descriptor = "I")
	private int anInt10816;

	@OriginalMember(owner = "client!wba", name = "z", descriptor = "Z")
	private boolean aBoolean736;

	@OriginalMember(owner = "client!wba", name = "A", descriptor = "I")
	private int anInt10819;

	@OriginalMember(owner = "client!wba", name = "B", descriptor = "Ljava/awt/Image;")
	private Image anImage10;

	@OriginalMember(owner = "client!wba", name = "E", descriptor = "I")
	private int anInt10822;

	@OriginalMember(owner = "client!wba", name = "F", descriptor = "I")
	private int anInt10823;

	@OriginalMember(owner = "client!wba", name = "H", descriptor = "Ljava/awt/Font;")
	private Font aFont2;

	@OriginalMember(owner = "client!wba", name = "I", descriptor = "Ljava/awt/Image;")
	private Image anImage11;

	@OriginalMember(owner = "client!wba", name = "K", descriptor = "Ljava/awt/Image;")
	private Image anImage12;

	@OriginalMember(owner = "client!wba", name = "N", descriptor = "Ljava/awt/Image;")
	private Image anImage13;

	@OriginalMember(owner = "client!wba", name = "a", descriptor = "(Z)V")
	private void method9015() throws IllegalAccessException, NoSuchFieldException {
		@Pc(6) Class local6 = Static334.anApplet2.getClass();
		this.anImage10 = (Image) this.method9017(local6, "bar");
		this.anImage7 = (Image) this.method9017(local6, "background");
		this.anImage6 = (Image) this.method9017(local6, "left");
		this.anImage8 = (Image) this.method9017(local6, "right");
		this.anImage11 = (Image) this.method9017(local6, "top");
		this.anImage9 = (Image) this.method9017(local6, "bottom");
		this.anImage5 = (Image) this.method9017(local6, "bodyLeft");
		this.anImage4 = (Image) this.method9017(local6, "bodyRight");
		this.anImage12 = (Image) this.method9017(local6, "bodyFill");
		this.aFont2 = (Font) this.method9017(local6, "bf");
		this.aFontMetrics1 = (FontMetrics) this.method9017(local6, "bfm");
		this.aColor1 = (Color) this.method9017(local6, "colourtext");
		@Pc(108) Object local108 = this.method9017(local6, "lb");
		@Pc(111) Class local111 = local108.getClass();
		this.aBoolean734 = this.method9020(local108, local111, "xMiddle");
		this.aBoolean736 = this.method9020(local108, local111, "yMiddle");
		this.anInt10804 = this.method9016(local108, local111, "xOffset");
		this.anInt10823 = this.method9016(local108, local111, "yOffset");
		this.anInt10805 = this.method9016(local108, local111, "width");
		this.anInt10812 = this.method9016(local108, local111, "height");
		this.anInt10809 = this.method9016(local108, local111, "boxXOffset");
		this.anInt10815 = this.method9016(local108, local111, "boxYOffset");
		this.anInt10822 = this.method9016(local108, local111, "boxWidth");
		this.anInt10819 = this.method9016(local108, local111, "textYOffset");
		this.anInt10816 = this.method9016(local108, local111, "offsetPerTenCycles");
	}

	@OriginalMember(owner = "client!wba", name = "a", descriptor = "(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;I)I")
	private int method9016(@OriginalArg(0) Object arg0, @OriginalArg(1) Class arg1, @OriginalArg(2) String arg2) throws IllegalAccessException, NoSuchFieldException {
		@Pc(15) Field local15 = arg1.getDeclaredField(arg2);
		return local15.getInt(arg0);
	}

	@OriginalMember(owner = "client!wba", name = "a", descriptor = "(Ljava/lang/Class;ILjava/lang/String;)Ljava/lang/Object;")
	private Object method9017(@OriginalArg(0) Class arg0, @OriginalArg(2) String arg1) throws IllegalAccessException, NoSuchFieldException {
		@Pc(12) Field local12 = arg0.getDeclaredField(arg1);
		@Pc(16) Object local16 = local12.get(Static334.anApplet2);
		local12.set(Static334.anApplet2, null);
		return local16;
	}

	@OriginalMember(owner = "client!wba", name = "a", descriptor = "(B)I")
	@Override
	public int method9009() {
		return 0;
	}

	@OriginalMember(owner = "client!wba", name = "a", descriptor = "(BJ)Z")
	@Override
	public boolean method9010(@OriginalArg(1) long arg0) {
		return true;
	}

	@OriginalMember(owner = "client!wba", name = "c", descriptor = "(I)I")
	@Override
	public int method9014() {
		return 100;
	}

	@OriginalMember(owner = "client!wba", name = "a", descriptor = "(BI)I")
	private int method9019(@OriginalArg(1) int arg0) {
		return this.aBoolean734 ? (Static81.anInt2497 - arg0) / 2 : 0;
	}

	@OriginalMember(owner = "client!wba", name = "a", descriptor = "(I)V")
	@Override
	public void method9011() {
	}

	@OriginalMember(owner = "client!wba", name = "b", descriptor = "(I)V")
	@Override
	public void method9013() {
		Static463.method7184();
	}

	@OriginalMember(owner = "client!wba", name = "a", descriptor = "(Ljava/lang/Object;ZLjava/lang/Class;Ljava/lang/String;)Z")
	private boolean method9020(@OriginalArg(0) Object arg0, @OriginalArg(2) Class arg1, @OriginalArg(3) String arg2) throws IllegalAccessException, NoSuchFieldException {
		@Pc(15) Field local15 = arg1.getDeclaredField(arg2);
		return local15.getBoolean(arg0);
	}

	@OriginalMember(owner = "client!wba", name = "a", descriptor = "(ZI)V")
	@Override
	public void method9012(@OriginalArg(0) boolean arg0) {
		if (!this.aBoolean735) {
			if (Static334.anApplet2 == null) {
				this.aBoolean735 = true;
			} else if (this.aFont2 == null) {
				try {
					this.method9015();
				} catch (@Pc(31) Exception local31) {
					this.aBoolean735 = true;
				}
			}
		}
		if (this.aBoolean735) {
			this.method9023();
			return;
		}
		@Pc(45) Graphics local45 = Static639.aCanvas10.getGraphics();
		if (local45 == null) {
			Static639.aCanvas10.repaint();
			return;
		}
		try {
			@Pc(51) int local51 = Static251.aClass8_1.method173();
			@Pc(55) String local55 = Static251.aClass8_1.method171();
			if (Static118.anImage1 == null) {
				Static118.anImage1 = Static639.aCanvas10.createImage(Static81.anInt2497, Static423.anInt7984);
			}
			@Pc(65) Graphics local65 = Static118.anImage1.getGraphics();
			local65.clearRect(0, 0, Static81.anInt2497, Static423.anInt7984);
			@Pc(76) int local76 = this.anImage5.getWidth(null);
			@Pc(81) int local81 = this.anImage4.getWidth(null);
			@Pc(86) int local86 = this.anImage12.getWidth(null);
			@Pc(91) int local91 = this.anImage5.getHeight(null);
			@Pc(96) int local96 = this.anImage4.getHeight(null);
			@Pc(101) int local101 = this.anImage12.getHeight(null);
			local65.drawImage(this.anImage5, this.method9019(local76) + this.anInt10809 - this.anInt10822 / 2, this.method9022(local91) + this.anInt10815, null);
			@Pc(138) int local138 = local76 + this.anInt10809 - this.anInt10822 / 2;
			@Pc(146) int local146 = this.anInt10809 + this.anInt10822 / 2;
			for (@Pc(148) int local148 = local138; local148 <= local146; local148 += local86) {
				local65.drawImage(this.anImage12, local148 + this.method9019(local76) + this.anInt10809, this.method9022(local101) + this.anInt10815, null);
			}
			local65.drawImage(this.anImage4, this.method9019(local81) + this.anInt10809 + this.anInt10822 / 2, this.method9022(local96) - -this.anInt10815, null);
			@Pc(216) int local216 = this.anImage6.getWidth(null);
			@Pc(221) int local221 = this.anImage6.getHeight(null);
			@Pc(226) int local226 = this.anImage8.getWidth(null);
			@Pc(231) int local231 = this.anImage8.getHeight(null);
			@Pc(236) int local236 = this.anImage9.getHeight(null);
			@Pc(241) int local241 = this.anImage11.getWidth(null);
			@Pc(246) int local246 = this.anImage11.getHeight(null);
			@Pc(251) int local251 = this.anImage9.getWidth(null);
			@Pc(256) int local256 = this.anImage10.getWidth(null);
			@Pc(261) int local261 = this.anImage7.getWidth(null);
			@Pc(270) int local270 = this.method9019(this.anInt10805) + this.anInt10804;
			@Pc(280) int local280 = this.method9022(this.anInt10812) + this.anInt10823;
			local65.drawImage(this.anImage6, local270, local280 + (this.anInt10812 - local221) / 2, null);
			local65.drawImage(this.anImage8, this.anInt10805 + local270 - local226, (this.anInt10812 - local231) / 2 + local280, null);
			if (this.anImage13 == null) {
				this.anImage13 = Static639.aCanvas10.createImage(this.anInt10805 - local226 - local216, this.anInt10812);
			}
			@Pc(338) Graphics local338 = this.anImage13.getGraphics();
			for (@Pc(340) int local340 = 0; local340 < this.anInt10805 - local226 - local216; local340 += local241) {
				local338.drawImage(this.anImage11, local340, 0, null);
			}
			for (@Pc(370) int local370 = 0; local370 < this.anInt10805 - local216 - local226; local370 += local251) {
				local338.drawImage(this.anImage9, local370, this.anInt10812 - local236, null);
			}
			@Pc(413) int local413 = local51 * (this.anInt10805 - local226 - local216) / 100;
			@Pc(452) int local452;
			if (local413 > 0) {
				@Pc(430) Image local430 = Static639.aCanvas10.createImage(local413, this.anInt10812 - local246 - local236);
				@Pc(434) int local434 = local430.getWidth(null);
				@Pc(437) Graphics local437 = local430.getGraphics();
				@Pc(447) int local447 = this.anInt10816 * Static331.method5701() / 10 % local256;
				for (local452 = local447 - local256; local452 < local434; local452 += local256) {
					local437.drawImage(this.anImage10, local452, 0, null);
				}
				local338.drawImage(local430, 0, local246, null);
			}
			@Pc(482) int local482 = local413;
			local413 = this.anInt10805 - local413 - local226 - local216;
			if (local413 > 0) {
				@Pc(508) Image local508 = Static639.aCanvas10.createImage(local413, this.anInt10812 - local246 - local236);
				@Pc(512) int local512 = local508.getWidth(null);
				@Pc(515) Graphics local515 = local508.getGraphics();
				for (local452 = 0; local452 < local512; local452 += local261) {
					local515.drawImage(this.anImage7, local452, 0, null);
				}
				local338.drawImage(local508, local482, local246, null);
			}
			local65.drawImage(this.anImage13, local216 + local270, local280, null);
			local65.setFont(this.aFont2);
			local65.setColor(this.aColor1);
			local65.drawString(local55, local270 + (this.anInt10805 - this.aFontMetrics1.stringWidth(local55)) / 2, this.anInt10819 + 4 + this.anInt10812 / 2 + local280);
			local45.drawImage(Static118.anImage1, 0, 0, null);
		} catch (@Pc(594) Exception local594) {
			this.aBoolean735 = true;
		}
	}

	@OriginalMember(owner = "client!wba", name = "a", descriptor = "(II)I")
	private int method9022(@OriginalArg(0) int arg0) {
		return this.aBoolean736 ? (Static423.anInt7984 - arg0) / 2 : 0;
	}

	@OriginalMember(owner = "client!wba", name = "e", descriptor = "(I)V")
	private void method9023() {
		Static478.method7483(Static251.aClass8_1.method173(), Static43.aColorArray5[Static510.anInt9347], Static251.aClass8_1.method171(), Static272.aColorArray3[Static510.anInt9347], Static202.aColorArray2[Static510.anInt9347]);
	}
}
