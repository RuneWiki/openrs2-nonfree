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

@OriginalClass("client!jj")
public final class Class193 {

	@OriginalMember(owner = "client!jj", name = "h", descriptor = "[I")
	private static final int[] anIntArray372 = new int[256];

	@OriginalMember(owner = "client!jj", name = "d", descriptor = "I")
	private int anInt5001;

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "I")
	private int anInt5003;

	@OriginalMember(owner = "client!jj", name = "f", descriptor = "Z")
	private boolean aBoolean326 = false;

	@OriginalMember(owner = "client!jj", name = "c", descriptor = "[I")
	private final int[] anIntArray370 = new int[4];

	@OriginalMember(owner = "client!jj", name = "g", descriptor = "[Lclient!kw;")
	private final Class178[] aClass178Array11;

	@OriginalMember(owner = "client!jj", name = "e", descriptor = "[I")
	private final int[] anIntArray371;

	static {
		for (@Pc(24) int local24 = 0; local24 < 256; local24++) {
			@Pc(31) int local31 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ÄËÏÖÜäëïöüÿßÁÀÉÈÍÌÓÒÚÙáàéèíìóòúùÂÊÎÔÛâêîôûÆæãÃõÕçÇ".indexOf(local24);
			if (local31 == -1) {
				local31 = 74;
			}
			anIntArray372[local24] = local31;
		}
	}

	@OriginalMember(owner = "client!jj", name = "<init>", descriptor = "(Lclient!ha;IZLjava/awt/Component;)V")
	public Class193(@OriginalArg(0) Class22 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Component arg3) {
		this.aBoolean326 = false;
		this.aClass178Array11 = new Class178[256];
		this.anIntArray371 = new int[256];
		@Pc(32) Font local32 = new Font("Helvetica", 1, arg1);
		@Pc(36) FontMetrics local36 = arg3.getFontMetrics(local32);
		for (@Pc(38) int local38 = 0; local38 < Static311.anInt5002; local38++) {
			this.method4593(arg0, local32, local36, "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ÄËÏÖÜäëïöüÿßÁÀÉÈÍÌÓÒÚÙáàéèíìóòúùÂÊÎÔÛâêîôûÆæãÃõÕçÇ".charAt(local38), local38, false);
		}
		if (this.aBoolean326) {
			this.aBoolean326 = false;
			local32 = new Font("Helvetica", 0, arg1);
			local36 = arg3.getFontMetrics(local32);
			for (@Pc(78) int local78 = 0; local78 < Static311.anInt5002; local78++) {
				this.method4593(arg0, local32, local36, "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ÄËÏÖÜäëïöüÿßÁÀÉÈÍÌÓÒÚÙáàéèíìóòúùÂÊÎÔÛâêîôûÆæãÃõÕçÇ".charAt(local78), local78, false);
			}
			if (!this.aBoolean326) {
				this.aBoolean326 = false;
				for (@Pc(103) int local103 = 0; local103 < Static311.anInt5002; local103++) {
					this.method4593(arg0, local32, local36, "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ÄËÏÖÜäëïöüÿßÁÀÉÈÍÌÓÒÚÙáàéèíìóòúùÂÊÎÔÛâêîôûÆæãÃõÕçÇ".charAt(local103), local103, true);
				}
			}
		}
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(Lclient!ha;Ljava/lang/String;IIIZ)V")
	public void method4588(@OriginalArg(0) Class22 arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(5) int local5 = this.method4589(arg1) / 2;
		arg0.K(this.anIntArray370);
		if (arg2 - local5 <= this.anIntArray370[2] && (arg2 + local5 >= this.anIntArray370[0] && (arg3 - this.anInt5001 <= this.anIntArray370[3] && arg3 + this.anInt5003 >= this.anIntArray370[1]))) {
			this.method4591(arg0, arg1, this.anIntArray370, arg2 - local5, arg3, arg4, true);
		}
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(Ljava/lang/String;)I")
	public int method4589(@OriginalArg(0) String arg0) {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < arg0.length(); local3++) {
			@Pc(10) int local10 = anIntArray372[arg0.charAt(local3)];
			local1 += this.anIntArray371[local10];
		}
		return local1;
	}

	@OriginalMember(owner = "client!jj", name = "c", descriptor = "()I")
	public int method4590() {
		return this.anInt5003 - 1;
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(Lclient!ha;Ljava/lang/String;[IIIIZ)V")
	private void method4591(@OriginalArg(0) Class22 arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		if (arg5 == 0) {
			arg6 = false;
		}
		@Pc(7) int local7 = arg5 | 0xFF000000;
		for (@Pc(9) int local9 = 0; local9 < arg1.length(); local9++) {
			@Pc(16) int local16 = anIntArray372[arg1.charAt(local9)];
			if (arg6) {
				this.aClass178Array11[local16].method7616(arg3 + 1, arg4 + 1, 0, -16777216, 1);
			}
			this.aClass178Array11[local16].method7616(arg3, arg4, 0, local7, 1);
			arg3 += this.anIntArray371[local16];
		}
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "()I")
	public int method4592() {
		return this.anInt5001;
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(Lclient!ha;Ljava/awt/Font;Ljava/awt/FontMetrics;CIZ)V")
	private void method4593(@OriginalArg(0) Class22 arg0, @OriginalArg(1) Font arg1, @OriginalArg(2) FontMetrics arg2, @OriginalArg(3) char arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
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
			} catch (@Pc(63) Exception local63) {
			}
		}
		@Pc(67) int local67 = arg2.getMaxAscent();
		@Pc(73) int local73 = arg2.getMaxAscent() + arg2.getMaxDescent();
		@Pc(76) int local76 = arg2.getHeight();
		@Pc(81) Image local81 = Static508.aCanvas8.createImage(local3, local73);
		@Pc(84) Graphics local84 = local81.getGraphics();
		local84.setColor(Color.black);
		local84.fillRect(0, 0, local3, local73);
		local84.setColor(Color.white);
		local84.setFont(arg1);
		local84.drawString(String.valueOf(arg3), 0, local67);
		if (arg5) {
			local84.drawString(String.valueOf(arg3), 1, local67);
		}
		@Pc(120) int[] local120 = new int[local3 * local73];
		@Pc(132) PixelGrabber local132 = new PixelGrabber(local81, 0, 0, local3, local73, local120, 0, local3);
		try {
			local132.grabPixels();
		} catch (@Pc(137) Exception local137) {
		}
		local81.flush();
		@Pc(143) int local143 = 0;
		@Pc(148) int local148;
		label66: for (@Pc(145) int local145 = 0; local145 < local73; local145++) {
			for (local148 = 0; local148 < local3; local148++) {
				@Pc(157) int local157 = local120[local148 + local145 * local3];
				if ((local157 & 0xFFFFFF) != 0) {
					local143 = local145;
					break label66;
				}
			}
		}
		for (local148 = 0; local148 < local120.length; local148++) {
			if ((local120[local148] & 0xFFFFFF) == 0) {
				local120[local148] = 0;
			}
		}
		this.anInt5001 = local67 - local143;
		this.anInt5003 = local76;
		this.anIntArray371[arg4] = local5;
		this.aClass178Array11[arg4] = arg0.method9367(local120, local3, local73, local3);
	}
}
