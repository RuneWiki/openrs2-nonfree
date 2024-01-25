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

@OriginalClass("client!wfa")
public final class Class370 implements Interface18 {

	@OriginalMember(owner = "client!wfa", name = "c", descriptor = "I")
	private int anInt10424;

	@OriginalMember(owner = "client!wfa", name = "e", descriptor = "I")
	private int anInt10426;

	@OriginalMember(owner = "client!wfa", name = "g", descriptor = "Ljava/awt/Image;")
	private Image anImage11;

	@OriginalMember(owner = "client!wfa", name = "h", descriptor = "I")
	private int anInt10428;

	@OriginalMember(owner = "client!wfa", name = "i", descriptor = "Ljava/awt/Font;")
	private Font aFont2;

	@OriginalMember(owner = "client!wfa", name = "k", descriptor = "Ljava/awt/Image;")
	private Image anImage12;

	@OriginalMember(owner = "client!wfa", name = "l", descriptor = "Ljava/awt/Image;")
	private Image anImage13;

	@OriginalMember(owner = "client!wfa", name = "o", descriptor = "I")
	private int anInt10432;

	@OriginalMember(owner = "client!wfa", name = "p", descriptor = "Ljava/awt/Color;")
	private Color aColor1;

	@OriginalMember(owner = "client!wfa", name = "r", descriptor = "Ljava/awt/Image;")
	private Image anImage14;

	@OriginalMember(owner = "client!wfa", name = "t", descriptor = "Z")
	private boolean aBoolean748;

	@OriginalMember(owner = "client!wfa", name = "v", descriptor = "Z")
	private boolean aBoolean749;

	@OriginalMember(owner = "client!wfa", name = "w", descriptor = "Z")
	private boolean aBoolean750;

	@OriginalMember(owner = "client!wfa", name = "A", descriptor = "I")
	private int anInt10439;

	@OriginalMember(owner = "client!wfa", name = "C", descriptor = "I")
	private int anInt10440;

	@OriginalMember(owner = "client!wfa", name = "D", descriptor = "I")
	private int anInt10441;

	@OriginalMember(owner = "client!wfa", name = "F", descriptor = "Ljava/awt/Image;")
	private Image anImage15;

	@OriginalMember(owner = "client!wfa", name = "H", descriptor = "Ljava/awt/Image;")
	private Image anImage16;

	@OriginalMember(owner = "client!wfa", name = "I", descriptor = "Ljava/awt/Image;")
	private Image anImage17;

	@OriginalMember(owner = "client!wfa", name = "J", descriptor = "I")
	private int anInt10443;

	@OriginalMember(owner = "client!wfa", name = "K", descriptor = "Ljava/awt/Image;")
	private Image anImage18;

	@OriginalMember(owner = "client!wfa", name = "N", descriptor = "Ljava/awt/Image;")
	private Image anImage19;

	@OriginalMember(owner = "client!wfa", name = "O", descriptor = "I")
	private int anInt10446;

	@OriginalMember(owner = "client!wfa", name = "P", descriptor = "Ljava/awt/FontMetrics;")
	private FontMetrics aFontMetrics1;

	@OriginalMember(owner = "client!wfa", name = "R", descriptor = "Ljava/awt/Image;")
	private Image anImage20;

	@OriginalMember(owner = "client!wfa", name = "c", descriptor = "(I)V")
	private void method8418() {
		Static587.method8334(Static7.aColorArray5[Static59.anInt1905], Static11.aColorArray2[Static59.anInt1905], Static609.aClass42_3.method1406(), Static609.aClass42_3.method1399(), Static384.aColorArray6[Static59.anInt1905]);
	}

	@OriginalMember(owner = "client!wfa", name = "a", descriptor = "(I)I")
	@Override
	public int method8413() {
		return 100;
	}

	@OriginalMember(owner = "client!wfa", name = "a", descriptor = "(Ljava/lang/Class;Ljava/lang/String;Z)Ljava/lang/Object;")
	private Object method8419(@OriginalArg(0) Class arg0, @OriginalArg(1) String arg1) throws IllegalAccessException, NoSuchFieldException {
		@Pc(12) Field local12 = arg0.getDeclaredField(arg1);
		@Pc(16) Object local16 = local12.get(Static152.anApplet1);
		local12.set(Static152.anApplet1, null);
		return local16;
	}

	@OriginalMember(owner = "client!wfa", name = "d", descriptor = "(I)V")
	private void method8420() throws IllegalAccessException, NoSuchFieldException {
		@Pc(6) Class local6 = Static152.anApplet1.getClass();
		this.anImage20 = (Image) this.method8419(local6, "bar");
		this.anImage11 = (Image) this.method8419(local6, "background");
		this.anImage19 = (Image) this.method8419(local6, "left");
		this.anImage16 = (Image) this.method8419(local6, "right");
		this.anImage17 = (Image) this.method8419(local6, "top");
		this.anImage15 = (Image) this.method8419(local6, "bottom");
		this.anImage18 = (Image) this.method8419(local6, "bodyLeft");
		this.anImage12 = (Image) this.method8419(local6, "bodyRight");
		this.anImage13 = (Image) this.method8419(local6, "bodyFill");
		this.aFont2 = (Font) this.method8419(local6, "bf");
		this.aFontMetrics1 = (FontMetrics) this.method8419(local6, "bfm");
		this.aColor1 = (Color) this.method8419(local6, "colourtext");
		@Pc(108) Object local108 = this.method8419(local6, "lb");
		@Pc(111) Class local111 = local108.getClass();
		this.aBoolean748 = this.method8424(local108, "xMiddle", local111);
		this.aBoolean750 = this.method8424(local108, "yMiddle", local111);
		this.anInt10424 = this.method8423(local108, "xOffset", local111);
		this.anInt10426 = this.method8423(local108, "yOffset", local111);
		this.anInt10443 = this.method8423(local108, "width", local111);
		this.anInt10441 = this.method8423(local108, "height", local111);
		this.anInt10440 = this.method8423(local108, "boxXOffset", local111);
		this.anInt10432 = this.method8423(local108, "boxYOffset", local111);
		this.anInt10439 = this.method8423(local108, "boxWidth", local111);
		this.anInt10446 = this.method8423(local108, "textYOffset", local111);
		this.anInt10428 = this.method8423(local108, "offsetPerTenCycles", local111);
	}

	@OriginalMember(owner = "client!wfa", name = "b", descriptor = "(I)V")
	@Override
	public void method8414() {
		Static64.method1715();
	}

	@OriginalMember(owner = "client!wfa", name = "a", descriptor = "(II)I")
	private int method8422(@OriginalArg(0) int arg0) {
		return this.aBoolean750 ? (Static313.anInt6355 - arg0) / 2 : 0;
	}

	@OriginalMember(owner = "client!wfa", name = "a", descriptor = "(JI)Z")
	@Override
	public boolean method8415(@OriginalArg(0) long arg0) {
		return true;
	}

	@OriginalMember(owner = "client!wfa", name = "a", descriptor = "(ZI)V")
	@Override
	public void method8417(@OriginalArg(0) boolean arg0) {
		if (!this.aBoolean749) {
			if (Static152.anApplet1 == null) {
				this.aBoolean749 = true;
			} else if (this.aFont2 == null) {
				try {
					this.method8420();
				} catch (@Pc(23) Exception local23) {
					this.aBoolean749 = true;
				}
			}
		}
		if (this.aBoolean749) {
			this.method8418();
			return;
		}
		@Pc(43) Graphics local43 = Static549.aCanvas13.getGraphics();
		if (local43 == null) {
			Static549.aCanvas13.repaint();
			return;
		}
		try {
			@Pc(49) int local49 = Static609.aClass42_3.method1399();
			@Pc(53) String local53 = Static609.aClass42_3.method1406();
			if (Static80.anImage10 == null) {
				Static80.anImage10 = Static549.aCanvas13.createImage(Static235.anInt5298, Static313.anInt6355);
			}
			@Pc(63) Graphics local63 = Static80.anImage10.getGraphics();
			local63.clearRect(0, 0, Static235.anInt5298, Static313.anInt6355);
			@Pc(74) int local74 = this.anImage18.getWidth(null);
			@Pc(79) int local79 = this.anImage12.getWidth(null);
			@Pc(84) int local84 = this.anImage13.getWidth(null);
			@Pc(89) int local89 = this.anImage18.getHeight(null);
			@Pc(94) int local94 = this.anImage12.getHeight(null);
			@Pc(99) int local99 = this.anImage13.getHeight(null);
			local63.drawImage(this.anImage18, this.method8425(local74) + this.anInt10440 - this.anInt10439 / 2, this.method8422(local89) - -this.anInt10432, null);
			@Pc(140) int local140 = this.anInt10440 + local74 - this.anInt10439 / 2;
			@Pc(149) int local149 = this.anInt10440 + this.anInt10439 / 2;
			for (@Pc(151) int local151 = local140; local151 <= local149; local151 += local84) {
				local63.drawImage(this.anImage13, local151 + this.method8425(local74) + this.anInt10440, this.method8422(local99) + this.anInt10432, null);
			}
			local63.drawImage(this.anImage12, this.method8425(local79) + this.anInt10440 + this.anInt10439 / 2, this.method8422(local94) + this.anInt10432, null);
			@Pc(218) int local218 = this.anImage19.getWidth(null);
			@Pc(223) int local223 = this.anImage19.getHeight(null);
			@Pc(228) int local228 = this.anImage16.getWidth(null);
			@Pc(233) int local233 = this.anImage16.getHeight(null);
			@Pc(238) int local238 = this.anImage15.getHeight(null);
			@Pc(243) int local243 = this.anImage17.getWidth(null);
			@Pc(248) int local248 = this.anImage17.getHeight(null);
			@Pc(253) int local253 = this.anImage15.getWidth(null);
			@Pc(258) int local258 = this.anImage20.getWidth(null);
			@Pc(263) int local263 = this.anImage11.getWidth(null);
			@Pc(272) int local272 = this.method8425(this.anInt10443) + this.anInt10424;
			@Pc(283) int local283 = this.method8422(this.anInt10441) + this.anInt10426;
			local63.drawImage(this.anImage19, local272, local283 + (this.anInt10441 - local223) / 2, null);
			local63.drawImage(this.anImage16, this.anInt10443 + local272 - local228, (this.anInt10441 - local233) / 2 + local283, null);
			if (this.anImage14 == null) {
				this.anImage14 = Static549.aCanvas13.createImage(this.anInt10443 - local228 - local218, this.anInt10441);
			}
			@Pc(341) Graphics local341 = this.anImage14.getGraphics();
			for (@Pc(343) int local343 = 0; local343 < this.anInt10443 - local218 - local228; local343 += local243) {
				local341.drawImage(this.anImage17, local343, 0, null);
			}
			for (@Pc(369) int local369 = 0; local369 < this.anInt10443 - local228 - local218; local369 += local253) {
				local341.drawImage(this.anImage15, local369, this.anInt10441 - local238, null);
			}
			@Pc(409) int local409 = local49 * (this.anInt10443 - local218 - local228) / 100;
			@Pc(447) int local447;
			if (local409 > 0) {
				@Pc(423) Image local423 = Static549.aCanvas13.createImage(local409, this.anInt10441 - local238 - local248);
				@Pc(427) int local427 = local423.getWidth(null);
				@Pc(430) Graphics local430 = local423.getGraphics();
				@Pc(442) int local442 = this.anInt10428 * Static415.method6519() / 10 % local258;
				for (local447 = local442 - local258; local447 < local427; local447 += local258) {
					local430.drawImage(this.anImage20, local447, 0, null);
				}
				local341.drawImage(local423, 0, local248, null);
			}
			@Pc(473) int local473 = local409;
			local409 = this.anInt10443 - local228 - local218 - local409;
			if (local409 > 0) {
				@Pc(498) Image local498 = Static549.aCanvas13.createImage(local409, this.anInt10441 - local238 - local248);
				@Pc(502) int local502 = local498.getWidth(null);
				@Pc(505) Graphics local505 = local498.getGraphics();
				for (local447 = 0; local447 < local502; local447 += local263) {
					local505.drawImage(this.anImage11, local447, 0, null);
				}
				local341.drawImage(local498, local473, local248, null);
			}
			local63.drawImage(this.anImage14, local272 + local218, local283, null);
			local63.setFont(this.aFont2);
			local63.setColor(this.aColor1);
			local63.drawString(local53, (this.anInt10443 - this.aFontMetrics1.stringWidth(local53)) / 2 + local272, this.anInt10446 + 4 + this.anInt10441 / 2 + local283);
			local43.drawImage(Static80.anImage10, 0, 0, null);
		} catch (@Pc(588) Exception local588) {
			this.aBoolean749 = true;
		}
	}

	@OriginalMember(owner = "client!wfa", name = "a", descriptor = "(Ljava/lang/Object;ILjava/lang/String;Ljava/lang/Class;)I")
	private int method8423(@OriginalArg(0) Object arg0, @OriginalArg(2) String arg1, @OriginalArg(3) Class arg2) throws IllegalAccessException, NoSuchFieldException {
		@Pc(12) Field local12 = arg2.getDeclaredField(arg1);
		return local12.getInt(arg0);
	}

	@OriginalMember(owner = "client!wfa", name = "a", descriptor = "(ILjava/lang/Object;Ljava/lang/String;Ljava/lang/Class;)Z")
	private boolean method8424(@OriginalArg(1) Object arg0, @OriginalArg(2) String arg1, @OriginalArg(3) Class arg2) throws IllegalAccessException, NoSuchFieldException {
		@Pc(13) Field local13 = arg2.getDeclaredField(arg1);
		return local13.getBoolean(arg0);
	}

	@OriginalMember(owner = "client!wfa", name = "b", descriptor = "(B)I")
	@Override
	public int method8416() {
		return 0;
	}

	@OriginalMember(owner = "client!wfa", name = "a", descriptor = "(B)V")
	@Override
	public void method8412() {
	}

	@OriginalMember(owner = "client!wfa", name = "b", descriptor = "(II)I")
	private int method8425(@OriginalArg(1) int arg0) {
		return this.aBoolean748 ? (Static235.anInt5298 - arg0) / 2 : 0;
	}
}
