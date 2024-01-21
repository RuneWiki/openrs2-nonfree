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

@OriginalClass("client!wc")
public final class Class1_Sub2_Sub8_Sub5 extends Class1_Sub2_Sub8 {

	@OriginalMember(owner = "client!wc", name = "U", descriptor = "Ljava/lang/String;")
	public static final String aString6 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| " + String.valueOf('Ä') + 'Ë' + 'Ï' + 'Ö' + 'Ü' + 'ä' + 'ë' + 'ï' + 'ö' + 'ü' + 'ÿ' + 'ß';

	@OriginalMember(owner = "client!wc", name = "W", descriptor = "[I")
	private static final int[] anIntArray407 = new int[256];

	@OriginalMember(owner = "client!wc", name = "R", descriptor = "I")
	private int anInt4606 = 0;

	@OriginalMember(owner = "client!wc", name = "T", descriptor = "Z")
	private boolean aBoolean228 = false;

	@OriginalMember(owner = "client!wc", name = "S", descriptor = "[B")
	private byte[] aByteArray56 = new byte[100000];

	static {
		for (@Pc(49) int local49 = 0; local49 < 256; local49++) {
			@Pc(54) int local54 = aString6.indexOf(local49);
			if (local54 == -1) {
				local54 = 74;
			}
			anIntArray407[local49] = local54 * 9;
		}
	}

	@OriginalMember(owner = "client!wc", name = "<init>", descriptor = "(IZLjava/awt/Component;)V")
	public Class1_Sub2_Sub8_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Component arg2) {
		this.anInt4606 = Static206.anInt4607 * 9;
		this.aBoolean228 = false;
		@Pc(30) Font local30 = new Font("Helvetica", 1, arg0);
		@Pc(34) FontMetrics local34 = arg2.getFontMetrics(local30);
		for (@Pc(36) int local36 = 0; local36 < Static206.anInt4607; local36++) {
			this.method3505(local30, local34, aString6.charAt(local36), local36, false);
		}
		@Pc(103) int local103;
		if (this.aBoolean228) {
			this.anInt4606 = Static206.anInt4607 * 9;
			this.aBoolean228 = false;
			local30 = new Font("Helvetica", 0, arg0);
			local34 = arg2.getFontMetrics(local30);
			for (@Pc(76) int local76 = 0; local76 < Static206.anInt4607; local76++) {
				this.method3505(local30, local34, aString6.charAt(local76), local76, false);
			}
			if (!this.aBoolean228) {
				this.anInt4606 = Static206.anInt4607 * 9;
				this.aBoolean228 = false;
				for (local103 = 0; local103 < Static206.anInt4607; local103++) {
					this.method3505(local30, local34, aString6.charAt(local103), local103, true);
				}
			}
		}
		@Pc(121) byte[] local121 = new byte[this.anInt4606];
		for (local103 = 0; local103 < this.anInt4606; local103++) {
			local121[local103] = this.aByteArray56[local103];
		}
		this.aByteArray56 = local121;
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(Lclient!dj;IIIZ)V")
	public void method3502(@OriginalArg(0) Class24 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(5) int local5 = this.method3510(arg0) / 2;
		@Pc(8) int local8 = this.method3508();
		if (arg1 - local5 <= Static90.anInt4600 && (arg1 + local5 >= Static90.anInt4602 && (arg2 - local8 <= Static90.anInt4603 && arg2 >= 0))) {
			this.method3507(arg0, arg1 - local5, arg2, arg3, true);
		}
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIII[B)V")
	private void method3503(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[] arg4) {
		@Pc(7) int local7 = arg1 + arg4[arg0 + 5];
		@Pc(15) int local15 = arg2 - arg4[arg0 + 6];
		@Pc(21) int local21 = arg4[arg0 + 3];
		@Pc(27) int local27 = arg4[arg0 + 4];
		@Pc(47) int local47 = arg4[arg0] * 16384 + arg4[arg0 + 1] * 128 + arg4[arg0 + 2];
		@Pc(53) int local53 = local7 + local15 * Static90.anInt4601;
		@Pc(57) int local57 = Static90.anInt4601 - local21;
		@Pc(59) int local59 = 0;
		@Pc(66) int local66;
		if (local15 < Static90.anInt4604) {
			local66 = Static90.anInt4604 - local15;
			local27 -= local66;
			local15 = Static90.anInt4604;
			local47 += local66 * local21;
			local53 += local66 * Static90.anInt4601;
		}
		if (local15 + local27 >= Static90.anInt4603) {
			local27 -= local15 + local27 + 1 - Static90.anInt4603;
		}
		if (local7 < Static90.anInt4602) {
			local66 = Static90.anInt4602 - local7;
			local21 -= local66;
			local7 = Static90.anInt4602;
			local47 += local66;
			local53 += local66;
			local59 = local66;
			local57 += local66;
		}
		if (local7 + local21 >= Static90.anInt4600) {
			local66 = local7 + local21 + 1 - Static90.anInt4600;
			local21 -= local66;
			local59 += local66;
			local57 += local66;
		}
		if (local21 <= 0 || local27 <= 0) {
			return;
		}
		if (this.aBoolean228) {
			this.method3506(Static90.anIntArray406, arg4, arg3, local47, local53, local21, local27, local57, local59);
			return;
		}
		this.method3511(Static90.anIntArray406, arg4, arg3, local47, local53, local21, local27, local57, local59);
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(Ljava/awt/Font;Ljava/awt/FontMetrics;CIZ)V")
	private void method3505(@OriginalArg(0) Font arg0, @OriginalArg(1) FontMetrics arg1, @OriginalArg(2) char arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
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
		@Pc(49) int local49 = arg1.getMaxAscent();
		@Pc(55) int local55 = arg1.getMaxAscent() + arg1.getMaxDescent();
		@Pc(58) int local58 = arg1.getHeight();
		@Pc(63) Image local63 = Static8.aCanvas1.createImage(local3, local55);
		@Pc(66) Graphics local66 = local63.getGraphics();
		local66.setColor(Color.black);
		local66.fillRect(0, 0, local3, local55);
		local66.setColor(Color.white);
		local66.setFont(arg0);
		local66.drawString(String.valueOf(arg2), 0, local49);
		if (arg4) {
			local66.drawString(String.valueOf(arg2), 1, local49);
		}
		@Pc(100) int[] local100 = new int[local3 * local55];
		@Pc(112) PixelGrabber local112 = new PixelGrabber(local63, 0, 0, local3, local55, local100, 0, local3);
		try {
			local112.grabPixels();
		} catch (@Pc(117) Exception local117) {
		}
		local63.flush();
		@Pc(123) int local123 = 0;
		@Pc(125) int local125 = 0;
		@Pc(127) int local127 = local3;
		@Pc(129) int local129 = local55;
		@Pc(134) int local134;
		@Pc(143) int local143;
		label143: for (@Pc(131) int local131 = 0; local131 < local55; local131++) {
			for (local134 = 0; local134 < local3; local134++) {
				local143 = local100[local134 + local131 * local3];
				if ((local143 & 0xFFFFFF) != 0) {
					local125 = local131;
					break label143;
				}
			}
		}
		@Pc(172) int local172;
		label129: for (local134 = 0; local134 < local3; local134++) {
			for (local143 = 0; local143 < local55; local143++) {
				local172 = local100[local134 + local143 * local3];
				if ((local172 & 0xFFFFFF) != 0) {
					local123 = local134;
					break label129;
				}
			}
		}
		@Pc(203) int local203;
		label115: for (local143 = local55 - 1; local143 >= 0; local143--) {
			for (local172 = 0; local172 < local3; local172++) {
				local203 = local100[local172 + local143 * local3];
				if ((local203 & 0xFFFFFF) != 0) {
					local129 = local143 + 1;
					break label115;
				}
			}
		}
		@Pc(235) int local235;
		label101: for (local172 = local3 - 1; local172 >= 0; local172--) {
			for (local203 = 0; local203 < local55; local203++) {
				local235 = local100[local172 + local203 * local3];
				if ((local235 & 0xFFFFFF) != 0) {
					local127 = local172 + 1;
					break label101;
				}
			}
		}
		this.aByteArray56[arg3 * 9] = (byte) (this.anInt4606 / 16384);
		this.aByteArray56[arg3 * 9 + 1] = (byte) (this.anInt4606 / 128 & 0x7F);
		this.aByteArray56[arg3 * 9 + 2] = (byte) (this.anInt4606 & 0x7F);
		this.aByteArray56[arg3 * 9 + 3] = (byte) (local127 - local123);
		this.aByteArray56[arg3 * 9 + 4] = (byte) (local129 - local125);
		this.aByteArray56[arg3 * 9 + 5] = (byte) local123;
		this.aByteArray56[arg3 * 9 + 6] = (byte) (local49 - local125);
		this.aByteArray56[arg3 * 9 + 7] = (byte) local5;
		this.aByteArray56[arg3 * 9 + 8] = (byte) local58;
		for (local203 = local125; local203 < local129; local203++) {
			for (local235 = local123; local235 < local127; local235++) {
				@Pc(372) int local372 = local100[local235 + local203 * local3] & 0xFF;
				if (local372 > 30 && local372 < 230) {
					this.aBoolean228 = true;
				}
				this.aByteArray56[this.anInt4606++] = (byte) local372;
			}
		}
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "([I[BIIIIIII)V")
	private void method3506(@OriginalArg(0) int[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		for (@Pc(2) int local2 = -arg6; local2 < 0; local2++) {
			for (@Pc(6) int local6 = -arg5; local6 < 0; local6++) {
				@Pc(14) int local14 = arg1[arg3++] & 0xFF;
				if (local14 <= 30) {
					arg4++;
				} else if (local14 >= 230) {
					arg0[arg4++] = arg2;
				} else {
					@Pc(30) int local30 = arg0[arg4];
					arg0[arg4++] = ((arg2 & 0xFF00FF) * local14 + (local30 & 0xFF00FF) * (256 - local14) & 0xFF00FF00) + ((arg2 & 0xFF00) * local14 + (local30 & 0xFF00) * (256 - local14) & 0xFF0000) >> 8;
				}
			}
			arg4 += arg7;
			arg3 += arg8;
		}
	}

	@OriginalMember(owner = "client!wc", name = "b", descriptor = "(Lclient!dj;IIIZ)V")
	private void method3507(@OriginalArg(0) Class24 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		if (this.aBoolean228 || arg3 == 0) {
			arg4 = false;
		}
		for (@Pc(8) int local8 = 0; local8 < arg0.method781(); local8++) {
			@Pc(16) int local16 = anIntArray407[arg0.method743(local8)];
			if (arg4) {
				this.method3503(local16, arg1 + 1, arg2, 0, this.aByteArray56);
				this.method3503(local16, arg1, arg2 + 1, 0, this.aByteArray56);
			}
			this.method3503(local16, arg1, arg2, arg3, this.aByteArray56);
			arg1 += this.aByteArray56[local16 + 7];
		}
	}

	@OriginalMember(owner = "client!wc", name = "e", descriptor = "()I")
	public int method3508() {
		return this.aByteArray56[6];
	}

	@OriginalMember(owner = "client!wc", name = "f", descriptor = "()I")
	public int method3509() {
		return this.aByteArray56[8] - 1;
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(Lclient!dj;)I")
	private int method3510(@OriginalArg(0) Class24 arg0) {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < arg0.method781(); local3++) {
			if (arg0.method743(local3) == 64 && local3 + 4 < arg0.method781() && arg0.method743(local3 + 4) == 64) {
				local3 += 4;
			} else if (arg0.method743(local3) == 126 && local3 + 4 < arg0.method781() && arg0.method743(local3 + 4) == 126) {
				local3 += 4;
			} else {
				local1 += this.aByteArray56[anIntArray407[arg0.method743(local3)] + 7];
			}
		}
		return local1;
	}

	@OriginalMember(owner = "client!wc", name = "b", descriptor = "([I[BIIIIIII)V")
	private void method3511(@OriginalArg(0) int[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(4) int local4 = -(arg5 >> 2);
		@Pc(9) int local9 = -(arg5 & 0x3);
		for (@Pc(12) int local12 = -arg6; local12 < 0; local12++) {
			for (@Pc(15) int local15 = local4; local15 < 0; local15++) {
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
			for (@Pc(69) int local69 = local9; local69 < 0; local69++) {
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
}
