import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fs")
public final class Class124 {

	@OriginalMember(owner = "client!fs", name = "f", descriptor = "[I")
	private int[] anIntArray220;

	@OriginalMember(owner = "client!fs", name = "g", descriptor = "[I")
	public int[] anIntArray221;

	@OriginalMember(owner = "client!fs", name = "i", descriptor = "[[I")
	public int[][] anIntArrayArray16;

	@OriginalMember(owner = "client!fs", name = "j", descriptor = "Lclient!aaa;")
	public Class2 aClass2_2;

	@OriginalMember(owner = "client!fs", name = "s", descriptor = "[I")
	public int[] anIntArray222;

	@OriginalMember(owner = "client!fs", name = "t", descriptor = "[I")
	public int[] anIntArray223;

	@OriginalMember(owner = "client!fs", name = "v", descriptor = "[Z")
	public boolean[] aBooleanArray7;

	@OriginalMember(owner = "client!fs", name = "w", descriptor = "I")
	public int anInt3031;

	@OriginalMember(owner = "client!fs", name = "z", descriptor = "[I")
	public int[] anIntArray224;

	@OriginalMember(owner = "client!fs", name = "D", descriptor = "[I")
	public int[] anIntArray225;

	@OriginalMember(owner = "client!fs", name = "m", descriptor = "I")
	public int anInt3025 = -1;

	@OriginalMember(owner = "client!fs", name = "n", descriptor = "I")
	public int anInt3026 = -1;

	@OriginalMember(owner = "client!fs", name = "k", descriptor = "Z")
	public boolean aBoolean221 = false;

	@OriginalMember(owner = "client!fs", name = "o", descriptor = "Z")
	public boolean aBoolean222 = false;

	@OriginalMember(owner = "client!fs", name = "e", descriptor = "I")
	public int anInt3022 = -1;

	@OriginalMember(owner = "client!fs", name = "l", descriptor = "I")
	public int anInt3024 = 2;

	@OriginalMember(owner = "client!fs", name = "c", descriptor = "Z")
	public boolean aBoolean219 = false;

	@OriginalMember(owner = "client!fs", name = "d", descriptor = "Z")
	public boolean aBoolean220 = false;

	@OriginalMember(owner = "client!fs", name = "r", descriptor = "I")
	public int anInt3029 = 5;

	@OriginalMember(owner = "client!fs", name = "u", descriptor = "I")
	public int anInt3030 = -1;

	@OriginalMember(owner = "client!fs", name = "p", descriptor = "I")
	public int anInt3027 = 99;

	@OriginalMember(owner = "client!fs", name = "B", descriptor = "I")
	public int anInt3035 = -1;

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(Lclient!es;B)V")
	public void method2832(@OriginalArg(0) Class4_Sub11 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method8865();
			if (local9 == 0) {
				return;
			}
			this.method2836(local9, arg0);
		}
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(IIILclient!ka;IB)Lclient!ka;")
	public Class62 method2833(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class62 arg3, @OriginalArg(4) int arg4) {
		@Pc(8) int local8 = this.anIntArray221[arg1];
		@Pc(13) int local13 = this.anIntArray224[arg1];
		@Pc(21) Class4_Sub5_Sub15 local21 = this.aClass2_2.method24(local13 >> 16);
		@Pc(25) int local25 = local13 & 0xFFFF;
		if (local21 == null) {
			return arg3.method7329((byte) 1, arg0, true);
		}
		@Pc(35) Class4_Sub5_Sub15 local35 = null;
		if ((this.aBoolean219 || Static562.aBoolean673) && arg4 != -1 && this.anIntArray224.length > arg4) {
			@Pc(58) int local58 = this.anIntArray224[arg4];
			local35 = this.aClass2_2.method24(local58 >> 16);
			arg4 = local58 & 0xFFFF;
		}
		@Pc(72) Class4_Sub5_Sub15 local72 = null;
		@Pc(74) Class4_Sub5_Sub15 local74 = null;
		@Pc(76) int local76 = 0;
		@Pc(78) int local78 = 0;
		if (this.anIntArray220 != null) {
			if (arg1 < this.anIntArray220.length) {
				local76 = this.anIntArray220[arg1];
				if (local76 != 65535) {
					local72 = this.aClass2_2.method24(local76 >> 16);
					local76 &= 0xFFFF;
				}
			}
			if ((this.aBoolean219 || Static562.aBoolean673) && arg4 != -1 && this.anIntArray220.length > arg4) {
				local78 = this.anIntArray220[arg4];
				if (local78 != 65535) {
					local74 = this.aClass2_2.method24(local78 >> 16);
					local78 &= 0xFFFF;
				}
			}
		}
		if (this.aBoolean221) {
			arg0 |= 0x200;
		}
		if (local21.method5086(local25)) {
			arg0 |= 0x80;
		}
		if (local21.method5089(local25)) {
			arg0 |= 0x100;
		}
		if (local21.method5085(local25)) {
			arg0 |= 0x400;
		}
		if (local72 != null) {
			if (local72.method5086(local76)) {
				arg0 |= 0x80;
			}
			if (local72.method5089(local76)) {
				arg0 |= 0x100;
			}
			if (local72.method5085(local76)) {
				arg0 |= 0x400;
			}
		}
		if (local35 != null) {
			if (local35.method5086(arg4)) {
				arg0 |= 0x80;
			}
			if (local35.method5089(arg4)) {
				arg0 |= 0x100;
			}
			if (local35.method5085(arg4)) {
				arg0 |= 0x400;
			}
		}
		if (local74 != null) {
			if (local74.method5086(local78)) {
				arg0 |= 0x80;
			}
			if (local74.method5089(local78)) {
				arg0 |= 0x100;
			}
			if (local74.method5085(local78)) {
				arg0 |= 0x400;
			}
		}
		arg0 |= 0x20;
		@Pc(276) Class62 local276 = arg3.method7329((byte) 1, arg0, true);
		local276.method7346(local25, local8, local35, this.aBoolean221, arg2 - 1, local21, 0, arg4);
		if (local72 != null) {
			local276.method7346(local76, local8, local74, this.aBoolean221, arg2 - 1, local72, 0, local78);
		}
		return local276;
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(IZIZ)I")
	public int method2834(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		@Pc(5) int local5 = 0;
		@Pc(7) int local7 = 0;
		@Pc(12) int local12 = this.anIntArray224[arg2];
		@Pc(14) Class4_Sub5_Sub15 local14 = null;
		@Pc(28) Class4_Sub5_Sub15 local28 = this.aClass2_2.method24(local12 >> 16);
		@Pc(32) int local32 = local12 & 0xFFFF;
		if (local28 == null) {
			return 0;
		}
		if ((this.aBoolean219 || Static562.aBoolean673) && arg0 != -1 && this.anIntArray224.length > arg0) {
			local7 = this.anIntArray224[arg0];
			local14 = this.aClass2_2.method24(local7 >> 16);
			local7 &= 0xFFFF;
		}
		if (this.aBoolean221) {
			local5 = 512;
		}
		if (local28.method5086(local32)) {
			local5 |= 0x80;
		}
		if (local28.method5089(local32)) {
			local5 |= 0x100;
		}
		if (local28.method5085(local32)) {
			local5 |= 0x400;
		}
		if (local14 != null) {
			if (local14.method5086(local7)) {
				local5 |= 0x80;
			}
			if (local14.method5089(local7)) {
				local5 |= 0x100;
			}
			if (local14.method5085(local7)) {
				local5 |= 0x400;
			}
		}
		if (this.anIntArray220 != null && arg1) {
			@Pc(149) int local149;
			@Pc(162) Class4_Sub5_Sub15 local162;
			if (this.anIntArray220.length > arg2) {
				local149 = this.anIntArray220[arg2];
				if (local149 != 65535) {
					local162 = this.aClass2_2.method24(local149 >> 16);
					local149 &= 0xFFFF;
					if (local162 != null) {
						if (local162.method5086(local149)) {
							local5 |= 0x80;
						}
						if (local162.method5089(local149)) {
							local5 |= 0x100;
						}
						if (local162.method5085(local149)) {
							local5 |= 0x400;
						}
					}
				}
			}
			if ((this.aBoolean219 || Static562.aBoolean673) && arg0 != -1 && arg0 < this.anIntArray220.length) {
				local149 = this.anIntArray220[arg0];
				if (local149 != 65535) {
					local162 = this.aClass2_2.method24(local149 >> 16);
					local149 &= 0xFFFF;
					if (local162 != null) {
						if (local162.method5086(local149)) {
							local5 |= 0x80;
						}
						if (local162.method5089(local149)) {
							local5 |= 0x100;
						}
						if (local162.method5085(local149)) {
							local5 |= 0x400;
						}
					}
				}
			}
		}
		return local5 | 0x20;
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(IIIBIILclient!ka;Z)Lclient!ka;")
	public Class62 method2835(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class62 arg6) {
		@Pc(8) int local8 = this.anIntArray221[arg2];
		@Pc(13) int local13 = this.anIntArray224[arg2];
		@Pc(21) Class4_Sub5_Sub15 local21 = this.aClass2_2.method24(local13 >> 16);
		@Pc(25) int local25 = local13 & 0xFFFF;
		if (local21 == null) {
			return arg6.method7329(arg3, arg1, true);
		}
		@Pc(35) Class4_Sub5_Sub15 local35 = null;
		if ((this.aBoolean219 || Static562.aBoolean673) && arg0 != -1 && arg0 < this.anIntArray224.length) {
			@Pc(54) int local54 = this.anIntArray224[arg0];
			local35 = this.aClass2_2.method24(local54 >> 16);
			arg0 = local54 & 0xFFFF;
		}
		if (this.aBoolean221) {
			arg1 |= 0x200;
		}
		if (local21.method5086(local25)) {
			arg1 |= 0x80;
		}
		if (local21.method5089(local25)) {
			arg1 |= 0x100;
		}
		if (local21.method5085(local25)) {
			arg1 |= 0x400;
		}
		if (local35 != null) {
			if (local35.method5086(arg0)) {
				arg1 |= 0x80;
			}
			if (local35.method5089(arg0)) {
				arg1 |= 0x100;
			}
			if (local35.method5085(arg0)) {
				arg1 |= 0x400;
			}
		}
		arg1 |= 0x20;
		@Pc(139) Class62 local139 = arg6.method7329(arg3, arg1, true);
		local139.method7346(local25, local8, local35, this.aBoolean221, arg5 - 1, local21, arg4, arg0);
		return local139;
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(IZLclient!es;)V")
	private void method2836(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub11 arg1) {
		@Pc(22) int local22;
		@Pc(24) int local24;
		@Pc(123) int local123;
		@Pc(188) int local188;
		if (arg0 == 1) {
			local22 = arg1.method8859();
			this.anIntArray221 = new int[local22];
			for (local24 = 0; local24 < local22; local24++) {
				this.anIntArray221[local24] = arg1.method8859();
			}
			this.anIntArray224 = new int[local22];
			for (local123 = 0; local123 < local22; local123++) {
				this.anIntArray224[local123] = arg1.method8859();
			}
			for (local188 = 0; local188 < local22; local188++) {
				this.anIntArray224[local188] += arg1.method8859() << 16;
			}
		} else if (arg0 == 2) {
			this.anInt3035 = arg1.method8859();
		} else if (arg0 == 3) {
			this.aBooleanArray7 = new boolean[256];
			local22 = arg1.method8865();
			for (local24 = 0; local24 < local22; local24++) {
				this.aBooleanArray7[arg1.method8865()] = true;
			}
		} else if (arg0 == 5) {
			this.anInt3029 = arg1.method8865();
		} else if (arg0 == 6) {
			this.anInt3022 = arg1.method8859();
		} else if (arg0 == 7) {
			this.anInt3025 = arg1.method8859();
		} else if (arg0 == 8) {
			this.anInt3027 = arg1.method8865();
		} else if (arg0 == 9) {
			this.anInt3026 = arg1.method8865();
		} else if (arg0 == 10) {
			this.anInt3030 = arg1.method8865();
		} else if (arg0 == 11) {
			this.anInt3024 = arg1.method8865();
		} else if (arg0 == 12) {
			local22 = arg1.method8865();
			this.anIntArray220 = new int[local22];
			for (local24 = 0; local24 < local22; local24++) {
				this.anIntArray220[local24] = arg1.method8859();
			}
			for (local123 = 0; local123 < local22; local123++) {
				this.anIntArray220[local123] = (arg1.method8859() << 16) + this.anIntArray220[local123];
			}
		} else if (arg0 == 13) {
			local22 = arg1.method8859();
			this.anIntArrayArray16 = new int[local22][];
			for (local24 = 0; local24 < local22; local24++) {
				local123 = arg1.method8865();
				if (local123 > 0) {
					this.anIntArrayArray16[local24] = new int[local123];
					this.anIntArrayArray16[local24][0] = arg1.method8827();
					for (local188 = 1; local188 < local123; local188++) {
						this.anIntArrayArray16[local24][local188] = arg1.method8859();
					}
				}
			}
		} else if (arg0 == 14) {
			this.aBoolean221 = true;
		} else if (arg0 == 15) {
			this.aBoolean219 = true;
		} else if (arg0 == 16) {
			this.aBoolean222 = true;
		} else if (arg0 == 18) {
			this.aBoolean220 = true;
		} else if (arg0 == 19) {
			if (this.anIntArray223 == null) {
				this.anIntArray223 = new int[this.anIntArrayArray16.length];
				for (local22 = 0; local22 < this.anIntArrayArray16.length; local22++) {
					this.anIntArray223[local22] = 255;
				}
			}
			this.anIntArray223[arg1.method8865()] = arg1.method8865();
		} else if (arg0 == 20) {
			if (this.anIntArray222 == null || this.anIntArray225 == null) {
				this.anIntArray222 = new int[this.anIntArrayArray16.length];
				this.anIntArray225 = new int[this.anIntArrayArray16.length];
				for (local22 = 0; local22 < this.anIntArrayArray16.length; local22++) {
					this.anIntArray222[local22] = 256;
					this.anIntArray225[local22] = 256;
				}
			}
			local22 = arg1.method8865();
			this.anIntArray222[local22] = arg1.method8859();
			this.anIntArray225[local22] = arg1.method8859();
		}
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(B)V")
	public void method2838() {
		if (this.anInt3026 == -1) {
			if (this.aBooleanArray7 == null) {
				this.anInt3026 = 0;
			} else {
				this.anInt3026 = 2;
			}
		}
		if (this.anInt3030 != -1) {
			return;
		}
		if (this.aBooleanArray7 == null) {
			this.anInt3030 = 0;
		} else {
			this.anInt3030 = 2;
		}
	}
}
