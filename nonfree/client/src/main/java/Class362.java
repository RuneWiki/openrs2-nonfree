import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vga")
public final class Class362 {

	@OriginalMember(owner = "client!vga", name = "c", descriptor = "Lclient!rca;")
	public Class298 aClass298_2;

	@OriginalMember(owner = "client!vga", name = "j", descriptor = "[I")
	public int[] anIntArray568;

	@OriginalMember(owner = "client!vga", name = "k", descriptor = "[I")
	private int[] anIntArray569;

	@OriginalMember(owner = "client!vga", name = "m", descriptor = "[I")
	public int[] anIntArray570;

	@OriginalMember(owner = "client!vga", name = "o", descriptor = "[[I")
	public int[][] anIntArrayArray70;

	@OriginalMember(owner = "client!vga", name = "t", descriptor = "[I")
	public int[] anIntArray571;

	@OriginalMember(owner = "client!vga", name = "u", descriptor = "I")
	public int anInt10004;

	@OriginalMember(owner = "client!vga", name = "y", descriptor = "[I")
	public int[] anIntArray572;

	@OriginalMember(owner = "client!vga", name = "H", descriptor = "[I")
	public int[] anIntArray573;

	@OriginalMember(owner = "client!vga", name = "I", descriptor = "[Z")
	public boolean[] aBooleanArray28;

	@OriginalMember(owner = "client!vga", name = "i", descriptor = "Z")
	public boolean aBoolean719 = false;

	@OriginalMember(owner = "client!vga", name = "l", descriptor = "I")
	public int anInt10000 = 99;

	@OriginalMember(owner = "client!vga", name = "b", descriptor = "I")
	public int anInt9996 = -1;

	@OriginalMember(owner = "client!vga", name = "v", descriptor = "I")
	public int anInt10005 = 5;

	@OriginalMember(owner = "client!vga", name = "f", descriptor = "I")
	public int anInt9999 = -1;

	@OriginalMember(owner = "client!vga", name = "p", descriptor = "Z")
	public boolean aBoolean720 = false;

	@OriginalMember(owner = "client!vga", name = "g", descriptor = "Z")
	public boolean aBoolean718 = false;

	@OriginalMember(owner = "client!vga", name = "r", descriptor = "I")
	public int anInt10002 = 2;

	@OriginalMember(owner = "client!vga", name = "x", descriptor = "I")
	public int anInt10007 = -1;

	@OriginalMember(owner = "client!vga", name = "D", descriptor = "I")
	public int anInt10011 = -1;

	@OriginalMember(owner = "client!vga", name = "A", descriptor = "I")
	public int anInt10009 = -1;

	@OriginalMember(owner = "client!vga", name = "C", descriptor = "Z")
	public boolean aBoolean721 = false;

	@OriginalMember(owner = "client!vga", name = "a", descriptor = "(ILclient!ka;IZII)Lclient!ka;")
	public Class187 method8556(@OriginalArg(0) int arg0, @OriginalArg(1) Class187 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(8) int local8 = this.anIntArray573[arg2];
		@Pc(13) int local13 = this.anIntArray571[arg2];
		@Pc(21) Class5_Sub5_Sub12 local21 = this.aClass298_2.method7026(local13 >> 16);
		@Pc(25) int local25 = local13 & 0xFFFF;
		if (local21 == null) {
			return arg1.method8656((byte) 1, arg0, true);
		}
		@Pc(35) Class5_Sub5_Sub12 local35 = null;
		if ((this.aBoolean718 || Static23.aBoolean14) && arg4 != -1 && arg4 < this.anIntArray571.length) {
			@Pc(53) int local53 = this.anIntArray571[arg4];
			local35 = this.aClass298_2.method7026(local53 >> 16);
			arg4 = local53 & 0xFFFF;
		}
		@Pc(67) Class5_Sub5_Sub12 local67 = null;
		@Pc(69) Class5_Sub5_Sub12 local69 = null;
		@Pc(71) int local71 = 0;
		@Pc(73) int local73 = 0;
		if (this.anIntArray569 != null) {
			if (this.anIntArray569.length > arg2) {
				local71 = this.anIntArray569[arg2];
				if (local71 != 65535) {
					local67 = this.aClass298_2.method7026(local71 >> 16);
					local71 &= 0xFFFF;
				}
			}
			if ((this.aBoolean718 || Static23.aBoolean14) && arg4 != -1 && arg4 < this.anIntArray569.length) {
				local73 = this.anIntArray569[arg4];
				if (local73 != 65535) {
					local69 = this.aClass298_2.method7026(local73 >> 16);
					local73 &= 0xFFFF;
				}
			}
		}
		if (this.aBoolean719) {
			arg0 |= 0x200;
		}
		if (local21.method4852(local25)) {
			arg0 |= 0x80;
		}
		if (local21.method4850(local25)) {
			arg0 |= 0x100;
		}
		if (local21.method4848(local25)) {
			arg0 |= 0x400;
		}
		if (local67 != null) {
			if (local67.method4852(local71)) {
				arg0 |= 0x80;
			}
			if (local67.method4850(local71)) {
				arg0 |= 0x100;
			}
			if (local67.method4848(local71)) {
				arg0 |= 0x400;
			}
		}
		if (local35 != null) {
			if (local35.method4852(arg4)) {
				arg0 |= 0x80;
			}
			if (local35.method4850(arg4)) {
				arg0 |= 0x100;
			}
			if (local35.method4848(arg4)) {
				arg0 |= 0x400;
			}
		}
		if (local69 != null) {
			if (local69.method4852(local73)) {
				arg0 |= 0x80;
			}
			if (local69.method4850(local73)) {
				arg0 |= 0x100;
			}
			if (local69.method4848(local73)) {
				arg0 |= 0x400;
			}
		}
		arg0 |= 0x20;
		@Pc(277) Class187 local277 = arg1.method8656((byte) 1, arg0, true);
		local277.method8639(arg4, local25, local21, this.aBoolean719, local35, 0, arg3 - 1, local8);
		if (local67 != null) {
			local277.method8639(local73, local71, local67, this.aBoolean719, local69, 0, arg3 - 1, local8);
		}
		return local277;
	}

	@OriginalMember(owner = "client!vga", name = "a", descriptor = "(BLclient!ofa;I)V")
	private void method8560(@OriginalArg(1) Class5_Sub22 arg0, @OriginalArg(2) int arg1) {
		@Pc(16) int local16;
		@Pc(22) int local22;
		@Pc(40) int local40;
		@Pc(58) int local58;
		if (arg1 == 1) {
			local16 = arg0.method5968();
			this.anIntArray573 = new int[local16];
			for (local22 = 0; local22 < local16; local22++) {
				this.anIntArray573[local22] = arg0.method5968();
			}
			this.anIntArray571 = new int[local16];
			for (local40 = 0; local40 < local16; local40++) {
				this.anIntArray571[local40] = arg0.method5968();
			}
			for (local58 = 0; local58 < local16; local58++) {
				this.anIntArray571[local58] = (arg0.method5968() << 16) + this.anIntArray571[local58];
			}
		} else if (arg1 == 2) {
			this.anInt9996 = arg0.method5968();
		} else if (arg1 == 3) {
			this.aBooleanArray28 = new boolean[256];
			local16 = arg0.method5966();
			for (local22 = 0; local22 < local16; local22++) {
				this.aBooleanArray28[arg0.method5966()] = true;
			}
		} else if (arg1 == 5) {
			this.anInt10005 = arg0.method5966();
		} else if (arg1 == 6) {
			this.anInt10007 = arg0.method5968();
		} else if (arg1 == 7) {
			this.anInt10009 = arg0.method5968();
		} else if (arg1 == 8) {
			this.anInt10000 = arg0.method5966();
		} else if (arg1 == 9) {
			this.anInt9999 = arg0.method5966();
		} else if (arg1 == 10) {
			this.anInt10011 = arg0.method5966();
		} else if (arg1 == 11) {
			this.anInt10002 = arg0.method5966();
		} else if (arg1 == 12) {
			local16 = arg0.method5966();
			this.anIntArray569 = new int[local16];
			for (local22 = 0; local22 < local16; local22++) {
				this.anIntArray569[local22] = arg0.method5968();
			}
			for (local40 = 0; local40 < local16; local40++) {
				this.anIntArray569[local40] = (arg0.method5968() << 16) + this.anIntArray569[local40];
			}
		} else if (arg1 == 13) {
			local16 = arg0.method5968();
			this.anIntArrayArray70 = new int[local16][];
			for (local22 = 0; local22 < local16; local22++) {
				local40 = arg0.method5966();
				if (local40 > 0) {
					this.anIntArrayArray70[local22] = new int[local40];
					this.anIntArrayArray70[local22][0] = arg0.method5931();
					for (local58 = 1; local58 < local40; local58++) {
						this.anIntArrayArray70[local22][local58] = arg0.method5968();
					}
				}
			}
		} else if (arg1 == 14) {
			this.aBoolean719 = true;
		} else if (arg1 == 15) {
			this.aBoolean718 = true;
		} else if (arg1 == 16) {
			this.aBoolean721 = true;
		} else if (arg1 == 18) {
			this.aBoolean720 = true;
		} else if (arg1 == 19) {
			if (this.anIntArray570 == null) {
				this.anIntArray570 = new int[this.anIntArrayArray70.length];
				for (local16 = 0; local16 < this.anIntArrayArray70.length; local16++) {
					this.anIntArray570[local16] = 255;
				}
			}
			this.anIntArray570[arg0.method5966()] = arg0.method5966();
			return;
		} else if (arg1 == 20) {
			if (this.anIntArray568 == null || this.anIntArray572 == null) {
				this.anIntArray568 = new int[this.anIntArrayArray70.length];
				this.anIntArray572 = new int[this.anIntArrayArray70.length];
				for (local16 = 0; local16 < this.anIntArrayArray70.length; local16++) {
					this.anIntArray568[local16] = 256;
					this.anIntArray572[local16] = 256;
				}
			}
			local16 = arg0.method5966();
			this.anIntArray568[local16] = arg0.method5968();
			this.anIntArray572[local16] = arg0.method5968();
			return;
		}
	}

	@OriginalMember(owner = "client!vga", name = "a", descriptor = "(ZIII)I")
	public int method8561(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) int local5 = 0;
		@Pc(7) int local7 = 0;
		@Pc(12) int local12 = this.anIntArray571[arg1];
		@Pc(14) Class5_Sub5_Sub12 local14 = null;
		@Pc(22) Class5_Sub5_Sub12 local22 = this.aClass298_2.method7026(local12 >> 16);
		@Pc(26) int local26 = local12 & 0xFFFF;
		if (local22 == null) {
			return 0;
		}
		if ((this.aBoolean718 || Static23.aBoolean14) && arg2 != -1 && arg2 < this.anIntArray571.length) {
			local7 = this.anIntArray571[arg2];
			local14 = this.aClass298_2.method7026(local7 >> 16);
			local7 &= 0xFFFF;
		}
		if (this.aBoolean719) {
			local5 = 512;
		}
		if (local22.method4852(local26)) {
			local5 |= 0x80;
		}
		if (local22.method4850(local26)) {
			local5 |= 0x100;
		}
		if (local22.method4848(local26)) {
			local5 |= 0x400;
		}
		if (local14 != null) {
			if (local14.method4852(local7)) {
				local5 |= 0x80;
			}
			if (local14.method4850(local7)) {
				local5 |= 0x100;
			}
			if (local14.method4848(local7)) {
				local5 |= 0x400;
			}
		}
		if (this.anIntArray569 != null && arg0) {
			@Pc(151) int local151;
			@Pc(162) Class5_Sub5_Sub12 local162;
			if (arg1 < this.anIntArray569.length) {
				local151 = this.anIntArray569[arg1];
				if (local151 != 65535) {
					local162 = this.aClass298_2.method7026(local151 >> 16);
					local151 &= 0xFFFF;
					if (local162 != null) {
						if (local162.method4852(local151)) {
							local5 |= 0x80;
						}
						if (local162.method4850(local151)) {
							local5 |= 0x100;
						}
						if (local162.method4848(local151)) {
							local5 |= 0x400;
						}
					}
				}
			}
			if ((this.aBoolean718 || Static23.aBoolean14) && arg2 != -1 && arg2 < this.anIntArray569.length) {
				local151 = this.anIntArray569[arg2];
				if (local151 != 65535) {
					local162 = this.aClass298_2.method7026(local151 >> 16);
					local151 &= 0xFFFF;
					if (local162 != null) {
						if (local162.method4852(local151)) {
							local5 |= 0x80;
						}
						if (local162.method4850(local151)) {
							local5 |= 0x100;
						}
						if (local162.method4848(local151)) {
							local5 |= 0x400;
						}
					}
				}
			}
		}
		return local5 | 0x20;
	}

	@OriginalMember(owner = "client!vga", name = "a", descriptor = "(Lclient!ofa;B)V")
	public void method8563(@OriginalArg(0) Class5_Sub22 arg0) {
		while (true) {
			@Pc(15) int local15 = arg0.method5966();
			if (local15 == 0) {
				return;
			}
			this.method8560(arg0, local15);
		}
	}

	@OriginalMember(owner = "client!vga", name = "a", descriptor = "(BIIIIILclient!ka;I)Lclient!ka;")
	public Class187 method8564(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class187 arg5, @OriginalArg(7) int arg6) {
		@Pc(8) int local8 = this.anIntArray573[arg3];
		@Pc(13) int local13 = this.anIntArray571[arg3];
		@Pc(21) Class5_Sub5_Sub12 local21 = this.aClass298_2.method7026(local13 >> 16);
		@Pc(25) int local25 = local13 & 0xFFFF;
		if (local21 == null) {
			return arg5.method8656(arg0, arg4, true);
		}
		@Pc(35) Class5_Sub5_Sub12 local35 = null;
		if ((this.aBoolean718 || Static23.aBoolean14) && arg6 != -1 && arg6 < this.anIntArray571.length) {
			@Pc(57) int local57 = this.anIntArray571[arg6];
			local35 = this.aClass298_2.method7026(local57 >> 16);
			arg6 = local57 & 0xFFFF;
		}
		if (this.aBoolean719) {
			arg4 |= 0x200;
		}
		if (local21.method4852(local25)) {
			arg4 |= 0x80;
		}
		if (local21.method4850(local25)) {
			arg4 |= 0x100;
		}
		if (local21.method4848(local25)) {
			arg4 |= 0x400;
		}
		if (local35 != null) {
			if (local35.method4852(arg6)) {
				arg4 |= 0x80;
			}
			if (local35.method4850(arg6)) {
				arg4 |= 0x100;
			}
			if (local35.method4848(arg6)) {
				arg4 |= 0x400;
			}
		}
		arg4 |= 0x20;
		@Pc(142) Class187 local142 = arg5.method8656(arg0, arg4, true);
		local142.method8639(arg6, local25, local21, this.aBoolean719, local35, arg1, arg2 - 1, local8);
		return local142;
	}

	@OriginalMember(owner = "client!vga", name = "b", descriptor = "(I)V")
	public void method8565() {
		if (this.anInt9999 == -1) {
			if (this.aBooleanArray28 == null) {
				this.anInt9999 = 0;
			} else {
				this.anInt9999 = 2;
			}
		}
		if (this.anInt10011 != -1) {
			return;
		}
		if (this.aBooleanArray28 == null) {
			this.anInt10011 = 0;
		} else {
			this.anInt10011 = 2;
		}
	}
}
