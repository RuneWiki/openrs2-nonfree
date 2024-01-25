import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gf")
public final class Class119 {

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "[I")
	private int[] anIntArray164;

	@OriginalMember(owner = "client!gf", name = "b", descriptor = "Lclient!pd;")
	public Class268 aClass268_1;

	@OriginalMember(owner = "client!gf", name = "m", descriptor = "[I")
	public int[] anIntArray165;

	@OriginalMember(owner = "client!gf", name = "n", descriptor = "[Z")
	public boolean[] aBooleanArray7;

	@OriginalMember(owner = "client!gf", name = "v", descriptor = "[I")
	public int[] anIntArray166;

	@OriginalMember(owner = "client!gf", name = "w", descriptor = "[I")
	public int[] anIntArray167;

	@OriginalMember(owner = "client!gf", name = "x", descriptor = "[I")
	public int[] anIntArray168;

	@OriginalMember(owner = "client!gf", name = "A", descriptor = "[[I")
	public int[][] anIntArrayArray16;

	@OriginalMember(owner = "client!gf", name = "C", descriptor = "[I")
	public int[] anIntArray169;

	@OriginalMember(owner = "client!gf", name = "E", descriptor = "I")
	public int anInt3015;

	@OriginalMember(owner = "client!gf", name = "f", descriptor = "I")
	public int anInt3002 = -1;

	@OriginalMember(owner = "client!gf", name = "d", descriptor = "I")
	public int anInt3000 = -1;

	@OriginalMember(owner = "client!gf", name = "j", descriptor = "Z")
	public boolean aBoolean186 = false;

	@OriginalMember(owner = "client!gf", name = "i", descriptor = "I")
	public int anInt3004 = 5;

	@OriginalMember(owner = "client!gf", name = "l", descriptor = "I")
	public int anInt3005 = -1;

	@OriginalMember(owner = "client!gf", name = "y", descriptor = "I")
	public int anInt3012 = 2;

	@OriginalMember(owner = "client!gf", name = "p", descriptor = "I")
	public int anInt3007 = -1;

	@OriginalMember(owner = "client!gf", name = "k", descriptor = "Z")
	public boolean aBoolean187 = false;

	@OriginalMember(owner = "client!gf", name = "h", descriptor = "Z")
	public boolean aBoolean185 = false;

	@OriginalMember(owner = "client!gf", name = "z", descriptor = "Z")
	public boolean aBoolean189 = false;

	@OriginalMember(owner = "client!gf", name = "D", descriptor = "I")
	public int anInt3014 = 99;

	@OriginalMember(owner = "client!gf", name = "F", descriptor = "I")
	public int anInt3016 = -1;

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(IBIIILclient!ka;II)Lclient!ka;")
	public Class184 method2501(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Class184 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(14) int local14 = this.anIntArray168[arg2];
		@Pc(19) int local19 = this.anIntArray167[arg2];
		@Pc(27) Class6_Sub4_Sub4 local27 = this.aClass268_1.method6468(local19 >> 16);
		@Pc(31) int local31 = local19 & 0xFFFF;
		if (local27 == null) {
			return arg4.method8660(arg1, arg5, true);
		}
		@Pc(41) Class6_Sub4_Sub4 local41 = null;
		if ((this.aBoolean187 || Static386.aBoolean433) && arg3 != -1 && this.anIntArray167.length > arg3) {
			@Pc(64) int local64 = this.anIntArray167[arg3];
			local41 = this.aClass268_1.method6468(local64 >> 16);
			arg3 = local64 & 0xFFFF;
		}
		if (this.aBoolean189) {
			arg5 |= 0x200;
		}
		if (local27.method2427(local31)) {
			arg5 |= 0x80;
		}
		if (local27.method2430(local31)) {
			arg5 |= 0x100;
		}
		if (local27.method2428(local31)) {
			arg5 |= 0x400;
		}
		if (local41 != null) {
			if (local41.method2427(arg3)) {
				arg5 |= 0x80;
			}
			if (local41.method2430(arg3)) {
				arg5 |= 0x100;
			}
			if (local41.method2428(arg3)) {
				arg5 |= 0x400;
			}
		}
		arg5 |= 0x20;
		@Pc(153) Class184 local153 = arg4.method8660(arg1, arg5, true);
		local153.method8641(arg0, local31, local14, arg3, local27, arg6 - 1, local41, this.aBoolean189);
		return local153;
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(IZIB)I")
	public int method2502(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		@Pc(5) int local5 = 0;
		@Pc(7) int local7 = 0;
		@Pc(12) int local12 = this.anIntArray167[arg2];
		@Pc(26) Class6_Sub4_Sub4 local26 = null;
		@Pc(34) Class6_Sub4_Sub4 local34 = this.aClass268_1.method6468(local12 >> 16);
		@Pc(38) int local38 = local12 & 0xFFFF;
		if (local34 == null) {
			return 0;
		}
		if ((this.aBoolean187 || Static386.aBoolean433) && arg0 != -1 && arg0 < this.anIntArray167.length) {
			local7 = this.anIntArray167[arg0];
			local26 = this.aClass268_1.method6468(local7 >> 16);
			local7 &= 0xFFFF;
		}
		if (this.aBoolean189) {
			local5 = 512;
		}
		if (local34.method2427(local38)) {
			local5 |= 0x80;
		}
		if (local34.method2430(local38)) {
			local5 |= 0x100;
		}
		if (local34.method2428(local38)) {
			local5 |= 0x400;
		}
		if (local26 != null) {
			if (local26.method2427(local7)) {
				local5 |= 0x80;
			}
			if (local26.method2430(local7)) {
				local5 |= 0x100;
			}
			if (local26.method2428(local7)) {
				local5 |= 0x400;
			}
		}
		if (this.anIntArray164 != null && arg1) {
			@Pc(155) int local155;
			@Pc(166) Class6_Sub4_Sub4 local166;
			if (arg2 < this.anIntArray164.length) {
				local155 = this.anIntArray164[arg2];
				if (local155 != 65535) {
					local166 = this.aClass268_1.method6468(local155 >> 16);
					local155 &= 0xFFFF;
					if (local166 != null) {
						if (local166.method2427(local155)) {
							local5 |= 0x80;
						}
						if (local166.method2430(local155)) {
							local5 |= 0x100;
						}
						if (local166.method2428(local155)) {
							local5 |= 0x400;
						}
					}
				}
			}
			if ((this.aBoolean187 || Static386.aBoolean433) && arg0 != -1 && this.anIntArray164.length > arg0) {
				local155 = this.anIntArray164[arg0];
				if (local155 != 65535) {
					local166 = this.aClass268_1.method6468(local155 >> 16);
					local155 &= 0xFFFF;
					if (local166 != null) {
						if (local166.method2427(local155)) {
							local5 |= 0x80;
						}
						if (local166.method2430(local155)) {
							local5 |= 0x100;
						}
						if (local166.method2428(local155)) {
							local5 |= 0x400;
						}
					}
				}
			}
		}
		return local5 | 0x20;
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(IIIILclient!ka;I)Lclient!ka;")
	public Class184 method2503(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class184 arg4) {
		@Pc(8) int local8 = this.anIntArray168[arg2];
		@Pc(13) int local13 = this.anIntArray167[arg2];
		@Pc(21) Class6_Sub4_Sub4 local21 = this.aClass268_1.method6468(local13 >> 16);
		@Pc(25) int local25 = local13 & 0xFFFF;
		if (local21 == null) {
			return arg4.method8660((byte) 1, arg3, true);
		}
		@Pc(35) Class6_Sub4_Sub4 local35 = null;
		if ((this.aBoolean187 || Static386.aBoolean433) && arg0 != -1 && this.anIntArray167.length > arg0) {
			@Pc(58) int local58 = this.anIntArray167[arg0];
			local35 = this.aClass268_1.method6468(local58 >> 16);
			arg0 = local58 & 0xFFFF;
		}
		@Pc(72) Class6_Sub4_Sub4 local72 = null;
		@Pc(74) Class6_Sub4_Sub4 local74 = null;
		@Pc(76) int local76 = 0;
		@Pc(78) int local78 = 0;
		if (this.anIntArray164 != null) {
			if (arg2 < this.anIntArray164.length) {
				local76 = this.anIntArray164[arg2];
				if (local76 != 65535) {
					local72 = this.aClass268_1.method6468(local76 >> 16);
					local76 &= 0xFFFF;
				}
			}
			if ((this.aBoolean187 || Static386.aBoolean433) && arg0 != -1 && arg0 < this.anIntArray164.length) {
				local78 = this.anIntArray164[arg0];
				if (local78 != 65535) {
					local74 = this.aClass268_1.method6468(local78 >> 16);
					local78 &= 0xFFFF;
				}
			}
		}
		if (this.aBoolean189) {
			arg3 |= 0x200;
		}
		if (local21.method2427(local25)) {
			arg3 |= 0x80;
		}
		if (local21.method2430(local25)) {
			arg3 |= 0x100;
		}
		if (local21.method2428(local25)) {
			arg3 |= 0x400;
		}
		if (local72 != null) {
			if (local72.method2427(local76)) {
				arg3 |= 0x80;
			}
			if (local72.method2430(local76)) {
				arg3 |= 0x100;
			}
			if (local72.method2428(local76)) {
				arg3 |= 0x400;
			}
		}
		if (local35 != null) {
			if (local35.method2427(arg0)) {
				arg3 |= 0x80;
			}
			if (local35.method2430(arg0)) {
				arg3 |= 0x100;
			}
			if (local35.method2428(arg0)) {
				arg3 |= 0x400;
			}
		}
		if (local74 != null) {
			if (local74.method2427(local78)) {
				arg3 |= 0x80;
			}
			if (local74.method2430(local78)) {
				arg3 |= 0x100;
			}
			if (local74.method2428(local78)) {
				arg3 |= 0x400;
			}
		}
		arg3 |= 0x20;
		@Pc(285) Class184 local285 = arg4.method8660((byte) 1, arg3, true);
		local285.method8641(0, local25, local8, arg0, local21, arg1 - 1, local35, this.aBoolean189);
		if (local72 != null) {
			local285.method8641(0, local76, local8, local78, local72, arg1 - 1, local74, this.aBoolean189);
		}
		return local285;
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(ILclient!gga;I)V")
	private void method2504(@OriginalArg(1) Class6_Sub23 arg0, @OriginalArg(2) int arg1) {
		@Pc(70) int local70;
		@Pc(76) int local76;
		@Pc(84) int local84;
		@Pc(103) int local103;
		if (arg1 == 1) {
			local70 = arg0.method8363();
			this.anIntArray168 = new int[local70];
			for (local76 = 0; local76 < local70; local76++) {
				this.anIntArray168[local76] = arg0.method8363();
			}
			this.anIntArray167 = new int[local70];
			for (local84 = 0; local84 < local70; local84++) {
				this.anIntArray167[local84] = arg0.method8363();
			}
			for (local103 = 0; local103 < local70; local103++) {
				this.anIntArray167[local103] = (arg0.method8363() << 16) + this.anIntArray167[local103];
			}
		} else if (arg1 == 2) {
			this.anInt3005 = arg0.method8363();
		} else if (arg1 == 3) {
			this.aBooleanArray7 = new boolean[256];
			local70 = arg0.method8374();
			for (local76 = 0; local76 < local70; local76++) {
				this.aBooleanArray7[arg0.method8374()] = true;
			}
		} else if (arg1 == 5) {
			this.anInt3004 = arg0.method8374();
		} else if (arg1 == 6) {
			this.anInt3000 = arg0.method8363();
		} else if (arg1 == 7) {
			this.anInt3002 = arg0.method8363();
		} else if (arg1 == 8) {
			this.anInt3014 = arg0.method8374();
		} else if (arg1 == 9) {
			this.anInt3007 = arg0.method8374();
		} else if (arg1 == 10) {
			this.anInt3016 = arg0.method8374();
		} else if (arg1 == 11) {
			this.anInt3012 = arg0.method8374();
		} else if (arg1 == 12) {
			local70 = arg0.method8374();
			this.anIntArray164 = new int[local70];
			for (local76 = 0; local76 < local70; local76++) {
				this.anIntArray164[local76] = arg0.method8363();
			}
			for (local84 = 0; local84 < local70; local84++) {
				this.anIntArray164[local84] = (arg0.method8363() << 16) + this.anIntArray164[local84];
			}
		} else if (arg1 == 13) {
			local70 = arg0.method8363();
			this.anIntArrayArray16 = new int[local70][];
			for (local76 = 0; local76 < local70; local76++) {
				local84 = arg0.method8374();
				if (local84 > 0) {
					this.anIntArrayArray16[local76] = new int[local84];
					this.anIntArrayArray16[local76][0] = arg0.method8344();
					for (local103 = 1; local103 < local84; local103++) {
						this.anIntArrayArray16[local76][local103] = arg0.method8363();
					}
				}
			}
		} else if (arg1 == 14) {
			this.aBoolean189 = true;
		} else if (arg1 == 15) {
			this.aBoolean187 = true;
		} else if (arg1 == 16) {
			this.aBoolean185 = true;
		} else if (arg1 == 18) {
			this.aBoolean186 = true;
		} else if (arg1 == 19) {
			if (this.anIntArray169 == null) {
				this.anIntArray169 = new int[this.anIntArrayArray16.length];
				for (local70 = 0; local70 < this.anIntArrayArray16.length; local70++) {
					this.anIntArray169[local70] = 255;
				}
			}
			this.anIntArray169[arg0.method8374()] = arg0.method8374();
		} else if (arg1 == 20) {
			if (this.anIntArray166 == null || this.anIntArray165 == null) {
				this.anIntArray166 = new int[this.anIntArrayArray16.length];
				this.anIntArray165 = new int[this.anIntArrayArray16.length];
				for (local70 = 0; local70 < this.anIntArrayArray16.length; local70++) {
					this.anIntArray166[local70] = 256;
					this.anIntArray165[local70] = 256;
				}
			}
			local70 = arg0.method8374();
			this.anIntArray166[local70] = arg0.method8363();
			this.anIntArray165[local70] = arg0.method8363();
		}
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(Lclient!gga;B)V")
	public void method2505(@OriginalArg(0) Class6_Sub23 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method8374();
			if (local9 == 0) {
				return;
			}
			this.method2504(arg0, local9);
		}
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(I)V")
	public void method2506() {
		if (this.anInt3007 == -1) {
			if (this.aBooleanArray7 == null) {
				this.anInt3007 = 0;
			} else {
				this.anInt3007 = 2;
			}
		}
		if (this.anInt3016 != -1) {
			return;
		}
		if (this.aBooleanArray7 == null) {
			this.anInt3016 = 0;
		} else {
			this.anInt3016 = 2;
		}
	}
}
