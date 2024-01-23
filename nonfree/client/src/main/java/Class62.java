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

@OriginalClass("client!gf")
public final class Class62 {

	@OriginalMember(owner = "client!gf", name = "d", descriptor = "[I")
	private static int[] anIntArray220 = new int[256];

	@OriginalMember(owner = "client!gf", name = "c", descriptor = "Z")
	private boolean aBoolean125 = false;

	@OriginalMember(owner = "client!gf", name = "b", descriptor = "I")
	private int anInt1647 = 0;

	@OriginalMember(owner = "client!gf", name = "e", descriptor = "[B")
	private byte[] aByteArray35 = new byte[100000];

	static {
		for (@Pc(7) int local7 = 0; local7 < 256; local7++) {
			@Pc(14) int local14 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ÄËÏÖÜäëïöüÿßÁÀÉÈÍÌÓÒÚÙáàéèíìóòúùÂÊÎÔÛâêîôûÆæ".indexOf(local7);
			if (local14 == -1) {
				local14 = 74;
			}
			anIntArray220[local7] = local14 * 9;
		}
	}

	@OriginalMember(owner = "client!gf", name = "<init>", descriptor = "(IZLjava/awt/Component;)V")
	public Class62(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Component arg2) {
		this.anInt1647 = Static87.anInt1646 * 9;
		this.aBoolean125 = false;
		@Pc(30) Font local30 = new Font("Helvetica", 1, arg0);
		@Pc(34) FontMetrics local34 = arg2.getFontMetrics(local30);
		@Pc(36) int local36;
		for (local36 = 0; local36 < Static87.anInt1646; local36++) {
			this.method1451(local30, local34, "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ÄËÏÖÜäëïöüÿßÁÀÉÈÍÌÓÒÚÙáàéèíìóòúùÂÊÎÔÛâêîôûÆæ".charAt(local36), local36, false);
		}
		if (this.aBoolean125) {
			this.anInt1647 = Static87.anInt1646 * 9;
			this.aBoolean125 = false;
			local30 = new Font("Helvetica", 0, arg0);
			local34 = arg2.getFontMetrics(local30);
			for (local36 = 0; local36 < Static87.anInt1646; local36++) {
				this.method1451(local30, local34, "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ÄËÏÖÜäëïöüÿßÁÀÉÈÍÌÓÒÚÙáàéèíìóòúùÂÊÎÔÛâêîôûÆæ".charAt(local36), local36, false);
			}
			if (!this.aBoolean125) {
				this.anInt1647 = Static87.anInt1646 * 9;
				this.aBoolean125 = false;
				for (local36 = 0; local36 < Static87.anInt1646; local36++) {
					this.method1451(local30, local34, "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ÄËÏÖÜäëïöüÿßÁÀÉÈÍÌÓÒÚÙáàéèíìóòúùÂÊÎÔÛâêîôûÆæ".charAt(local36), local36, true);
				}
			}
		}
		@Pc(121) byte[] local121 = new byte[this.anInt1647];
		for (@Pc(123) int local123 = 0; local123 < this.anInt1647; local123++) {
			local121[local123] = this.aByteArray35[local123];
		}
		this.aByteArray35 = local121;
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "([I[BIIIIIII)V")
	private void method1445(@OriginalArg(0) int[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		for (@Pc(2) int local2 = -arg6; local2 < 0; local2++) {
			for (@Pc(7) int local7 = -arg5; local7 < 0; local7++) {
				@Pc(16) int local16 = arg1[arg3++] & 0xFF;
				if (local16 <= 30) {
					arg4++;
				} else if (local16 >= 230) {
					arg0[arg4++] = arg2;
				} else {
					@Pc(32) int local32 = arg0[arg4];
					arg0[arg4++] = ((arg2 & 0xFF00FF) * local16 + (local32 & 0xFF00FF) * (256 - local16) & 0xFF00FF00) + ((arg2 & 0xFF00) * local16 + (local32 & 0xFF00) * (256 - local16) & 0xFF0000) >> 8;
				}
			}
			arg4 += arg7;
			arg3 += arg8;
		}
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(Ljava/lang/String;)I")
	private int method1447(@OriginalArg(0) String arg0) {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < arg0.length(); local3++) {
			if (arg0.charAt(local3) == '@' && local3 + 4 < arg0.length() && arg0.charAt(local3 + 4) == '@') {
				local3 += 4;
			} else if (arg0.charAt(local3) == '~' && local3 + 4 < arg0.length() && arg0.charAt(local3 + 4) == '~') {
				local3 += 4;
			} else {
				local1 += this.aByteArray35[anIntArray220[arg0.charAt(local3)] + 7];
			}
		}
		return local1;
	}

	@OriginalMember(owner = "client!gf", name = "b", descriptor = "([I[BIIIIIII)V")
	private void method1448(@OriginalArg(0) int[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(4) int local4 = -(arg5 >> 2);
		@Pc(9) int local9 = -(arg5 & 0x3);
		for (@Pc(12) int local12 = -arg6; local12 < 0; local12++) {
			@Pc(16) int local16;
			for (local16 = local4; local16 < 0; local16++) {
				if (arg1[arg3++] == 0) {
					arg4++;
				} else {
					arg0[arg4++] = arg2;
				}
				if (arg1[arg3++] == 0) {
					arg4++;
				} else {
					arg0[arg4++] = arg2;
				}
				if (arg1[arg3++] == 0) {
					arg4++;
				} else {
					arg0[arg4++] = arg2;
				}
				if (arg1[arg3++] == 0) {
					arg4++;
				} else {
					arg0[arg4++] = arg2;
				}
			}
			for (local16 = local9; local16 < 0; local16++) {
				if (arg1[arg3++] == 0) {
					arg4++;
				} else {
					arg0[arg4++] = arg2;
				}
			}
			arg4 += arg7;
			arg3 += arg8;
		}
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(IIII[B)V")
	private void method1449(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[] arg4) {
		@Pc(7) int local7 = arg1 + arg4[arg0 + 5];
		@Pc(15) int local15 = arg2 - arg4[arg0 + 6];
		@Pc(21) int local21 = arg4[arg0 + 3];
		@Pc(27) int local27 = arg4[arg0 + 4];
		@Pc(47) int local47 = arg4[arg0] * 16384 + arg4[arg0 + 1] * 128 + arg4[arg0 + 2];
		@Pc(53) int local53 = local7 + local15 * Static213.anInt4239;
		@Pc(57) int local57 = Static213.anInt4239 - local21;
		@Pc(59) int local59 = 0;
		@Pc(66) int local66;
		if (local15 < Static213.anInt4242) {
			local66 = Static213.anInt4242 - local15;
			local27 -= local66;
			local15 = Static213.anInt4242;
			local47 += local66 * local21;
			local53 += local66 * Static213.anInt4239;
		}
		if (local15 + local27 >= Static213.anInt4238) {
			local27 -= local15 + local27 + 1 - Static213.anInt4238;
		}
		if (local7 < Static213.anInt4243) {
			local66 = Static213.anInt4243 - local7;
			local21 -= local66;
			local7 = Static213.anInt4243;
			local47 += local66;
			local53 += local66;
			local59 = local66;
			local57 += local66;
		}
		if (local7 + local21 >= Static213.anInt4241) {
			local66 = local7 + local21 + 1 - Static213.anInt4241;
			local21 -= local66;
			local59 += local66;
			local57 += local66;
		}
		if (local21 <= 0 || local27 <= 0) {
			return;
		}
		if (this.aBoolean125) {
			this.method1445(Static213.anIntArray495, arg4, arg3, local47, local53, local21, local27, local57, local59);
		} else {
			this.method1448(Static213.anIntArray495, arg4, arg3, local47, local53, local21, local27, local57, local59);
		}
	}

	@OriginalMember(owner = "client!gf", name = "b", descriptor = "()I")
	public int method1450() {
		return this.aByteArray35[6];
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(Ljava/awt/Font;Ljava/awt/FontMetrics;CIZ)V")
	private void method1451(@OriginalArg(0) Font arg0, @OriginalArg(1) FontMetrics arg1, @OriginalArg(2) char arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(3) int local3 = arg1.charWidth(arg2);
		@Pc(5) int local5 = local3;
		if (arg4) {
			try {
				if (arg2 == '/') {
					arg4 = false;
				}
				if (arg2 == 'f' || arg2 == 't' || arg2 == 'w' || arg2 == 'v' || arg2 == 'k' || arg2 == 'x' || arg2 == 'y' || arg2 == 'A' || arg2 == 'V' || arg2 == 'W') {
					local3++;
				}
			} catch (@Pc(45) Exception local45) {
			}
		}
		@Pc(48) int local48 = arg1.getMaxAscent();
		@Pc(54) int local54 = arg1.getMaxAscent() + arg1.getMaxDescent();
		@Pc(57) int local57 = arg1.getHeight();
		@Pc(62) Image local62 = Static189.aCanvas1.createImage(local3, local54);
		@Pc(65) Graphics local65 = local62.getGraphics();
		local65.setColor(Color.black);
		local65.fillRect(0, 0, local3, local54);
		local65.setColor(Color.white);
		local65.setFont(arg0);
		local65.drawString(arg2 + "", 0, local48);
		if (arg4) {
			local65.drawString(arg2 + "", 1, local48);
		}
		@Pc(111) int[] local111 = new int[local3 * local54];
		@Pc(123) PixelGrabber local123 = new PixelGrabber(local62, 0, 0, local3, local54, local111, 0, local3);
		try {
			local123.grabPixels();
		} catch (@Pc(128) Exception local128) {
		}
		local62.flush();
		@Pc(134) int local134 = 0;
		@Pc(136) int local136 = 0;
		@Pc(138) int local138 = local3;
		@Pc(140) int local140 = local54;
		@Pc(142) int local142;
		@Pc(147) int local147;
		@Pc(158) int local158;
		label135: for (local142 = 0; local142 < local54; local142++) {
			for (local147 = 0; local147 < local3; local147++) {
				local158 = local111[local147 + local142 * local3];
				if ((local158 & 0xFFFFFF) != 0) {
					local136 = local142;
					break label135;
				}
			}
		}
		label123: for (local142 = 0; local142 < local3; local142++) {
			for (local147 = 0; local147 < local54; local147++) {
				local158 = local111[local142 + local147 * local3];
				if ((local158 & 0xFFFFFF) != 0) {
					local134 = local142;
					break label123;
				}
			}
		}
		label111: for (local142 = local54 - 1; local142 >= 0; local142--) {
			for (local147 = 0; local147 < local3; local147++) {
				local158 = local111[local147 + local142 * local3];
				if ((local158 & 0xFFFFFF) != 0) {
					local140 = local142 + 1;
					break label111;
				}
			}
		}
		label99: for (local142 = local3 - 1; local142 >= 0; local142--) {
			for (local147 = 0; local147 < local54; local147++) {
				local158 = local111[local142 + local147 * local3];
				if ((local158 & 0xFFFFFF) != 0) {
					local138 = local142 + 1;
					break label99;
				}
			}
		}
		this.aByteArray35[arg3 * 9] = (byte) (this.anInt1647 / 16384);
		this.aByteArray35[arg3 * 9 + 1] = (byte) (this.anInt1647 / 128 & 0x7F);
		this.aByteArray35[arg3 * 9 + 2] = (byte) (this.anInt1647 & 0x7F);
		this.aByteArray35[arg3 * 9 + 3] = (byte) (local138 - local134);
		this.aByteArray35[arg3 * 9 + 4] = (byte) (local140 - local136);
		this.aByteArray35[arg3 * 9 + 5] = (byte) local134;
		this.aByteArray35[arg3 * 9 + 6] = (byte) (local48 - local136);
		this.aByteArray35[arg3 * 9 + 7] = (byte) local5;
		this.aByteArray35[arg3 * 9 + 8] = (byte) local57;
		for (local142 = local136; local142 < local140; local142++) {
			for (local147 = local134; local147 < local138; local147++) {
				local158 = local111[local147 + local142 * local3] & 0xFF;
				if (local158 > 30 && local158 < 230) {
					this.aBoolean125 = true;
				}
				this.aByteArray35[this.anInt1647++] = (byte) local158;
			}
		}
	}

	@OriginalMember(owner = "client!gf", name = "c", descriptor = "()I")
	public int method1452() {
		return this.aByteArray35[8] - 1;
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(Ljava/lang/String;IIIZ)V")
	public void method1453(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(5) int local5 = this.method1447(arg0) / 2;
		@Pc(8) int local8 = this.method1450();
		if (arg1 - local5 <= Static213.anInt4241 && (arg1 + local5 >= Static213.anInt4243 && (arg2 - local8 <= Static213.anInt4238 && arg2 >= 0))) {
			this.method1454(arg0, arg1 - local5, arg2, arg3, true);
		}
	}

	@OriginalMember(owner = "client!gf", name = "b", descriptor = "(Ljava/lang/String;IIIZ)V")
	private void method1454(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		if (this.aBoolean125 || arg3 == 0) {
			arg4 = false;
		}
		for (@Pc(8) int local8 = 0; local8 < arg0.length(); local8++) {
			@Pc(18) int local18 = anIntArray220[arg0.charAt(local8)];
			if (arg4) {
				this.method1449(local18, arg1 + 1, arg2, 1, this.aByteArray35);
				this.method1449(local18, arg1, arg2 + 1, 1, this.aByteArray35);
			}
			this.method1449(local18, arg1, arg2, arg3, this.aByteArray35);
			arg1 += this.aByteArray35[local18 + 7];
		}
	}
}
