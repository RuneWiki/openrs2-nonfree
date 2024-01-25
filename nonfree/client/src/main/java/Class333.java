import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.PixelGrabber;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uaa")
public final class Class333 {

	@OriginalMember(owner = "client!uaa", name = "c", descriptor = "[I")
	private static final int[] anIntArray509 = new int[256];

	@OriginalMember(owner = "client!uaa", name = "e", descriptor = "I")
	private int anInt9693;

	@OriginalMember(owner = "client!uaa", name = "f", descriptor = "I")
	private int anInt9694;

	@OriginalMember(owner = "client!uaa", name = "d", descriptor = "[I")
	private final int[] anIntArray510 = new int[4];

	@OriginalMember(owner = "client!uaa", name = "g", descriptor = "Z")
	private boolean aBoolean772 = false;

	@OriginalMember(owner = "client!uaa", name = "a", descriptor = "[Lclient!ufa;")
	private final Class4[] aClass4Array16;

	@OriginalMember(owner = "client!uaa", name = "h", descriptor = "[I")
	private final int[] anIntArray511;

	static {
		for (@Pc(7) int local7 = 0; local7 < 256; local7++) {
			@Pc(12) int local12 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ÄËÏÖÜäëïöüÿßÁÀÉÈÍÌÓÒÚÙáàéèíìóòúùÂÊÎÔÛâêîôûÆæãÃõÕçÇ".indexOf(local7);
			if (local12 == -1) {
				local12 = 74;
			}
			anIntArray509[local7] = local12;
		}
	}

	@OriginalMember(owner = "client!uaa", name = "<init>", descriptor = "(Lclient!ha;IZLjava/awt/Component;)V")
	public Class333(@OriginalArg(0) Class5 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Component arg3) {
		this.aBoolean772 = false;
		this.aClass4Array16 = new Class4[256];
		this.anIntArray511 = new int[256];
		@Pc(30) Font local30 = new Font("Helvetica", 1, arg1);
		@Pc(34) FontMetrics local34 = arg3.getFontMetrics(local30);
		for (@Pc(36) int local36 = 0; local36 < Static563.anInt9692; local36++) {
			this.method7929(arg0, local30, local34, "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ÄËÏÖÜäëïöüÿßÁÀÉÈÍÌÓÒÚÙáàéèíìóòúùÂÊÎÔÛâêîôûÆæãÃõÕçÇ".charAt(local36), local36, false);
		}
		if (this.aBoolean772) {
			this.aBoolean772 = false;
			local30 = new Font("Helvetica", 0, arg1);
			local34 = arg3.getFontMetrics(local30);
			for (@Pc(72) int local72 = 0; local72 < Static563.anInt9692; local72++) {
				this.method7929(arg0, local30, local34, "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ÄËÏÖÜäëïöüÿßÁÀÉÈÍÌÓÒÚÙáàéèíìóòúùÂÊÎÔÛâêîôûÆæãÃõÕçÇ".charAt(local72), local72, false);
			}
			if (!this.aBoolean772) {
				this.aBoolean772 = false;
				for (@Pc(95) int local95 = 0; local95 < Static563.anInt9692; local95++) {
					this.method7929(arg0, local30, local34, "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ÄËÏÖÜäëïöüÿßÁÀÉÈÍÌÓÒÚÙáàéèíìóòúùÂÊÎÔÛâêîôûÆæãÃõÕçÇ".charAt(local95), local95, true);
				}
			}
		}
	}

	@OriginalMember(owner = "client!uaa", name = "a", descriptor = "(Ljava/lang/String;)I")
	public int method7928(@OriginalArg(0) String arg0) {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < arg0.length(); local3++) {
			@Pc(10) int local10 = anIntArray509[arg0.charAt(local3)];
			local1 += this.anIntArray511[local10];
		}
		return local1;
	}

	@OriginalMember(owner = "client!uaa", name = "a", descriptor = "(Lclient!ha;Ljava/awt/Font;Ljava/awt/FontMetrics;CIZ)V")
	private void method7929(@OriginalArg(0) Class5 arg0, @OriginalArg(1) Font arg1, @OriginalArg(2) FontMetrics arg2, @OriginalArg(3) char arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		@Pc(3) int local3 = arg2.charWidth(arg3);
		@Pc(5) int local5 = local3;
		if (arg5) {
			try {
				if (arg3 == '/') {
					arg5 = false;
				}
				if (arg3 == 'f' || arg3 == 't' || arg3 == 'w' || arg3 == 'v' || arg3 == 'k' || arg3 == 'x' || arg3 == 'y' || arg3 == 'A' || arg3 == 'V' || arg3 == 'W') {
					local3++;
				}
			} catch (@Pc(45) Exception local45) {
			}
		}
		@Pc(49) int local49 = arg2.getMaxAscent();
		@Pc(55) int local55 = arg2.getMaxAscent() + arg2.getMaxDescent();
		@Pc(58) int local58 = arg2.getHeight();
		@Pc(63) Image local63 = Static428.aCanvas12.createImage(local3, local55);
		@Pc(66) Graphics local66 = local63.getGraphics();
		local66.setColor(Color.black);
		local66.fillRect(0, 0, local3, local55);
		local66.setColor(Color.white);
		local66.setFont(arg1);
		local66.drawString(String.valueOf(arg3), 0, local49);
		if (arg5) {
			local66.drawString(String.valueOf(arg3), 1, local49);
		}
		@Pc(100) int[] local100 = new int[local3 * local55];
		@Pc(112) PixelGrabber local112 = new PixelGrabber(local63, 0, 0, local3, local55, local100, 0, local3);
		try {
			local112.grabPixels();
		} catch (@Pc(117) Exception local117) {
		}
		local63.flush();
		@Pc(123) int local123 = 0;
		@Pc(128) int local128;
		label66: for (@Pc(125) int local125 = 0; local125 < local55; local125++) {
			for (local128 = 0; local128 < local3; local128++) {
				@Pc(137) int local137 = local100[local128 + local125 * local3];
				if ((local137 & 0xFFFFFF) != 0) {
					local123 = local125;
					break label66;
				}
			}
		}
		for (local128 = 0; local128 < local100.length; local128++) {
			if ((local100[local128] & 0xFFFFFF) == 0) {
				local100[local128] = 0;
			}
		}
		this.anInt9694 = local49 - local123;
		this.anInt9693 = local58;
		this.anIntArray511[arg4] = local5;
		this.aClass4Array16[arg4] = arg0.method6111(local3, local55, local100, local3);
	}

	@OriginalMember(owner = "client!uaa", name = "b", descriptor = "()I")
	public int method7931() {
		return this.anInt9694;
	}

	@OriginalMember(owner = "client!uaa", name = "c", descriptor = "()I")
	public int method7932() {
		return this.anInt9693 - 1;
	}

	@OriginalMember(owner = "client!uaa", name = "a", descriptor = "(Lclient!ha;Ljava/lang/String;IIIZ)V")
	public void method7933(@OriginalArg(0) Class5 arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(5) int local5 = this.method7928(arg1) / 2;
		arg0.K(this.anIntArray510);
		if (arg2 - local5 <= this.anIntArray510[2] && (arg2 + local5 >= this.anIntArray510[0] && (arg3 - this.anInt9694 <= this.anIntArray510[3] && arg3 + this.anInt9693 >= this.anIntArray510[1]))) {
			this.method7934(arg0, arg1, this.anIntArray510, arg2 - local5, arg3, arg4, true);
		}
	}

	@OriginalMember(owner = "client!uaa", name = "a", descriptor = "(Lclient!ha;Ljava/lang/String;[IIIIZ)V")
	private void method7934(@OriginalArg(0) Class5 arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		if (arg5 == 0) {
			arg6 = false;
		}
		@Pc(7) int local7 = arg5 | 0xFF000000;
		for (@Pc(9) int local9 = 0; local9 < arg1.length(); local9++) {
			@Pc(16) int local16 = anIntArray509[arg1.charAt(local9)];
			if (arg6) {
				this.aClass4Array16[local16].method7711(arg3 + 1, arg4 + 1, 0, -16777216, 1);
			}
			this.aClass4Array16[local16].method7711(arg3, arg4, 0, local7, 1);
			arg3 += this.anIntArray511[local16];
		}
	}
}
