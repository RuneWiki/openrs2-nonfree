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

@OriginalClass("client!ie")
public final class Class152 implements Interface21 {

	@OriginalMember(owner = "client!ie", name = "d", descriptor = "I")
	private int anInt4434;

	@OriginalMember(owner = "client!ie", name = "e", descriptor = "I")
	private int anInt4435;

	@OriginalMember(owner = "client!ie", name = "f", descriptor = "Ljava/awt/Image;")
	private Image anImage7;

	@OriginalMember(owner = "client!ie", name = "h", descriptor = "Ljava/awt/Image;")
	private Image anImage8;

	@OriginalMember(owner = "client!ie", name = "i", descriptor = "Ljava/awt/Image;")
	private Image anImage9;

	@OriginalMember(owner = "client!ie", name = "j", descriptor = "Z")
	private boolean aBoolean296;

	@OriginalMember(owner = "client!ie", name = "k", descriptor = "I")
	private int anInt4437;

	@OriginalMember(owner = "client!ie", name = "l", descriptor = "Ljava/awt/Image;")
	private Image anImage10;

	@OriginalMember(owner = "client!ie", name = "n", descriptor = "Ljava/awt/Image;")
	private Image anImage11;

	@OriginalMember(owner = "client!ie", name = "o", descriptor = "Ljava/awt/Font;")
	private Font aFont2;

	@OriginalMember(owner = "client!ie", name = "q", descriptor = "I")
	private int anInt4440;

	@OriginalMember(owner = "client!ie", name = "r", descriptor = "I")
	private int anInt4441;

	@OriginalMember(owner = "client!ie", name = "s", descriptor = "Ljava/awt/Image;")
	private Image anImage12;

	@OriginalMember(owner = "client!ie", name = "t", descriptor = "I")
	private int anInt4442;

	@OriginalMember(owner = "client!ie", name = "u", descriptor = "Z")
	private boolean aBoolean297;

	@OriginalMember(owner = "client!ie", name = "w", descriptor = "Ljava/awt/Image;")
	private Image anImage13;

	@OriginalMember(owner = "client!ie", name = "z", descriptor = "Ljava/awt/Color;")
	private Color aColor1;

	@OriginalMember(owner = "client!ie", name = "D", descriptor = "Ljava/awt/FontMetrics;")
	private FontMetrics aFontMetrics1;

	@OriginalMember(owner = "client!ie", name = "E", descriptor = "I")
	private int anInt4448;

	@OriginalMember(owner = "client!ie", name = "G", descriptor = "Ljava/awt/Image;")
	private Image anImage14;

	@OriginalMember(owner = "client!ie", name = "H", descriptor = "Z")
	private boolean aBoolean298;

	@OriginalMember(owner = "client!ie", name = "I", descriptor = "Ljava/awt/Image;")
	private Image anImage15;

	@OriginalMember(owner = "client!ie", name = "J", descriptor = "I")
	private int anInt4450;

	@OriginalMember(owner = "client!ie", name = "K", descriptor = "I")
	private int anInt4451;

	@OriginalMember(owner = "client!ie", name = "P", descriptor = "Ljava/awt/Image;")
	private Image anImage16;

	@OriginalMember(owner = "client!ie", name = "d", descriptor = "(B)V")
	private void method3925() {
		Static643.method8766(Static128.aColorArray10[Static459.anInt8079], Static101.aClass59_1.method1961(), Static281.aColorArray22[Static459.anInt8079], Static131.aColorArray11[Static459.anInt8079], Static101.aClass59_1.method1965());
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(BJ)Z")
	@Override
	public boolean method3919(@OriginalArg(1) long arg0) {
		return true;
	}

	@OriginalMember(owner = "client!ie", name = "b", descriptor = "(B)V")
	@Override
	public void method3922() {
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/Class;)Ljava/lang/Object;")
	private Object method3926(@OriginalArg(0) String arg0, @OriginalArg(2) Class arg1) throws IllegalAccessException, NoSuchFieldException {
		@Pc(12) Field local12 = arg1.getDeclaredField(arg0);
		@Pc(16) Object local16 = local12.get(Static504.anApplet2);
		local12.set(Static504.anApplet2, null);
		return local16;
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method3921(@OriginalArg(1) boolean arg0) {
		if (!this.aBoolean297) {
			if (Static504.anApplet2 == null) {
				this.aBoolean297 = true;
			} else if (this.aFont2 == null) {
				try {
					this.method3930();
				} catch (@Pc(23) Exception local23) {
					this.aBoolean297 = true;
				}
			}
		}
		if (this.aBoolean297) {
			this.method3925();
			return;
		}
		@Pc(41) Graphics local41 = Static364.aCanvas13.getGraphics();
		if (local41 == null) {
			Static364.aCanvas13.repaint();
			return;
		}
		try {
			@Pc(50) int local50 = Static101.aClass59_1.method1961();
			@Pc(54) String local54 = Static101.aClass59_1.method1965();
			if (Static7.anImage6 == null) {
				Static7.anImage6 = Static364.aCanvas13.createImage(Static109.anInt2357, Static330.anInt6165);
			}
			@Pc(64) Graphics local64 = Static7.anImage6.getGraphics();
			@Pc(69) int local69 = this.anImage13.getWidth(null);
			@Pc(74) int local74 = this.anImage7.getWidth(null);
			@Pc(79) int local79 = this.anImage15.getWidth(null);
			@Pc(84) int local84 = this.anImage13.getHeight(null);
			@Pc(89) int local89 = this.anImage7.getHeight(null);
			@Pc(94) int local94 = this.anImage15.getHeight(null);
			local64.drawImage(this.anImage13, this.method3928(local69) + this.anInt4442 - this.anInt4440 / 2, this.method3932(local84) + this.anInt4450, null);
			@Pc(131) int local131 = local69 + this.anInt4442 - this.anInt4440 / 2;
			@Pc(139) int local139 = this.anInt4440 / 2 + this.anInt4442;
			for (@Pc(141) int local141 = local131; local141 <= local139; local141 += local79) {
				local64.drawImage(this.anImage15, local141 + this.method3928(local69) + this.anInt4442, this.method3932(local94) - -this.anInt4450, null);
			}
			local64.drawImage(this.anImage7, this.method3928(local74) + this.anInt4442 + this.anInt4440 / 2, this.method3932(local89) - -this.anInt4450, null);
			@Pc(211) int local211 = this.anImage9.getWidth(null);
			@Pc(216) int local216 = this.anImage9.getHeight(null);
			@Pc(221) int local221 = this.anImage10.getWidth(null);
			@Pc(226) int local226 = this.anImage10.getHeight(null);
			@Pc(231) int local231 = this.anImage14.getHeight(null);
			@Pc(236) int local236 = this.anImage11.getWidth(null);
			@Pc(241) int local241 = this.anImage11.getHeight(null);
			@Pc(246) int local246 = this.anImage14.getWidth(null);
			@Pc(251) int local251 = this.anImage16.getWidth(null);
			@Pc(256) int local256 = this.anImage12.getWidth(null);
			@Pc(266) int local266 = this.method3928(this.anInt4437) + this.anInt4441;
			@Pc(276) int local276 = this.method3932(this.anInt4451) + this.anInt4448;
			local64.drawImage(this.anImage9, local266, (this.anInt4451 - local216) / 2 + local276, null);
			local64.drawImage(this.anImage10, this.anInt4437 + local266 - local221, local276 + (this.anInt4451 + -local226) / 2, null);
			if (this.anImage8 == null) {
				this.anImage8 = Static364.aCanvas13.createImage(this.anInt4437 - local211 - local221, this.anInt4451);
			}
			@Pc(334) Graphics local334 = this.anImage8.getGraphics();
			for (@Pc(336) int local336 = 0; local336 < this.anInt4437 - local221 - local211; local336 += local236) {
				local334.drawImage(this.anImage11, local336, 0, null);
			}
			for (@Pc(361) int local361 = 0; local361 < this.anInt4437 - local211 - local221; local361 += local246) {
				local334.drawImage(this.anImage14, local361, this.anInt4451 - local231, null);
			}
			@Pc(401) int local401 = (this.anInt4437 - local221 - local211) * local50 / 100;
			@Pc(437) int local437;
			if (local401 > 0) {
				@Pc(415) Image local415 = Static364.aCanvas13.createImage(local401, this.anInt4451 - local231 - local241);
				@Pc(419) int local419 = local415.getWidth(null);
				@Pc(422) Graphics local422 = local415.getGraphics();
				@Pc(432) int local432 = this.anInt4434 * Static623.method8625() / 10 % local251;
				for (local437 = local432 - local251; local437 < local419; local437 += local251) {
					local422.drawImage(this.anImage16, local437, 0, null);
				}
				local334.drawImage(local415, 0, local241, null);
			}
			@Pc(463) int local463 = local401;
			local401 = this.anInt4437 - local401 - local211 - local221;
			if (local401 > 0) {
				@Pc(487) Image local487 = Static364.aCanvas13.createImage(local401, this.anInt4451 - local241 - local231);
				@Pc(491) int local491 = local487.getWidth(null);
				@Pc(494) Graphics local494 = local487.getGraphics();
				for (local437 = 0; local437 < local491; local437 += local256) {
					local494.drawImage(this.anImage12, local437, 0, null);
				}
				local334.drawImage(local487, local463, local241, null);
			}
			local64.drawImage(this.anImage8, local211 + local266, local276, null);
			local64.setFont(this.aFont2);
			local64.setColor(this.aColor1);
			local64.drawString(local54, local266 + (this.anInt4437 - this.aFontMetrics1.stringWidth(local54)) / 2, this.anInt4451 / 2 + 4 + local276 + this.anInt4435);
			local41.drawImage(Static7.anImage6, 0, 0, null);
		} catch (@Pc(572) Exception local572) {
			this.aBoolean297 = true;
		}
	}

	@OriginalMember(owner = "client!ie", name = "c", descriptor = "(B)I")
	@Override
	public int method3923() {
		return 100;
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(B)I")
	@Override
	public int method3920() {
		return 0;
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(I)V")
	@Override
	public void method3924() {
		Static618.method8552();
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(II)I")
	private int method3928(@OriginalArg(0) int arg0) {
		return this.aBoolean298 ? (Static109.anInt2357 - arg0) / 2 : 0;
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Class;ILjava/lang/Object;)I")
	private int method3929(@OriginalArg(0) String arg0, @OriginalArg(1) Class arg1, @OriginalArg(3) Object arg2) throws IllegalAccessException, NoSuchFieldException {
		@Pc(13) Field local13 = arg1.getDeclaredField(arg0);
		return local13.getInt(arg2);
	}

	@OriginalMember(owner = "client!ie", name = "e", descriptor = "(B)V")
	private void method3930() throws IllegalAccessException, NoSuchFieldException {
		@Pc(6) Class local6 = Static504.anApplet2.getClass();
		this.anImage16 = (Image) this.method3926("bar", local6);
		this.anImage12 = (Image) this.method3926("background", local6);
		this.anImage9 = (Image) this.method3926("left", local6);
		this.anImage10 = (Image) this.method3926("right", local6);
		this.anImage11 = (Image) this.method3926("top", local6);
		this.anImage14 = (Image) this.method3926("bottom", local6);
		this.anImage13 = (Image) this.method3926("bodyLeft", local6);
		this.anImage7 = (Image) this.method3926("bodyRight", local6);
		this.anImage15 = (Image) this.method3926("bodyFill", local6);
		this.aFont2 = (Font) this.method3926("bf", local6);
		this.aFontMetrics1 = (FontMetrics) this.method3926("bfm", local6);
		this.aColor1 = (Color) this.method3926("colourtext", local6);
		@Pc(113) Object local113 = this.method3926("lb", local6);
		@Pc(116) Class local116 = local113.getClass();
		this.aBoolean298 = this.method3931("xMiddle", local116, local113);
		this.aBoolean296 = this.method3931("yMiddle", local116, local113);
		this.anInt4441 = this.method3929("xOffset", local116, local113);
		this.anInt4448 = this.method3929("yOffset", local116, local113);
		this.anInt4437 = this.method3929("width", local116, local113);
		this.anInt4451 = this.method3929("height", local116, local113);
		this.anInt4442 = this.method3929("boxXOffset", local116, local113);
		this.anInt4450 = this.method3929("boxYOffset", local116, local113);
		this.anInt4440 = this.method3929("boxWidth", local116, local113);
		this.anInt4435 = this.method3929("textYOffset", local116, local113);
		this.anInt4434 = this.method3929("offsetPerTenCycles", local116, local113);
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/Class;Ljava/lang/Object;)Z")
	private boolean method3931(@OriginalArg(1) String arg0, @OriginalArg(2) Class arg1, @OriginalArg(3) Object arg2) throws IllegalAccessException, NoSuchFieldException {
		@Pc(13) Field local13 = arg1.getDeclaredField(arg0);
		return local13.getBoolean(arg2);
	}

	@OriginalMember(owner = "client!ie", name = "b", descriptor = "(II)I")
	private int method3932(@OriginalArg(1) int arg0) {
		return this.aBoolean296 ? (Static330.anInt6165 - arg0) / 2 : 0;
	}
}
