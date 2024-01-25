import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vo")
public final class Class361 {

	@OriginalMember(owner = "client!vo", name = "c", descriptor = "[I")
	public int[] anIntArray637;

	@OriginalMember(owner = "client!vo", name = "j", descriptor = "[I")
	public int[] anIntArray638;

	@OriginalMember(owner = "client!vo", name = "k", descriptor = "[I")
	private int[] anIntArray639;

	@OriginalMember(owner = "client!vo", name = "o", descriptor = "[[I")
	public int[][] anIntArrayArray62;

	@OriginalMember(owner = "client!vo", name = "q", descriptor = "I")
	public int anInt9862;

	@OriginalMember(owner = "client!vo", name = "u", descriptor = "[Z")
	public boolean[] aBooleanArray28;

	@OriginalMember(owner = "client!vo", name = "v", descriptor = "[I")
	public int[] anIntArray640;

	@OriginalMember(owner = "client!vo", name = "z", descriptor = "[I")
	public int[] anIntArray641;

	@OriginalMember(owner = "client!vo", name = "A", descriptor = "Lclient!nc;")
	public Class227 aClass227_2;

	@OriginalMember(owner = "client!vo", name = "D", descriptor = "[I")
	public int[] anIntArray642;

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "Z")
	public boolean aBoolean707 = false;

	@OriginalMember(owner = "client!vo", name = "b", descriptor = "I")
	public int anInt9855 = 5;

	@OriginalMember(owner = "client!vo", name = "g", descriptor = "I")
	public int anInt9857 = -1;

	@OriginalMember(owner = "client!vo", name = "f", descriptor = "I")
	public int anInt9856 = -1;

	@OriginalMember(owner = "client!vo", name = "l", descriptor = "Z")
	public boolean aBoolean710 = false;

	@OriginalMember(owner = "client!vo", name = "m", descriptor = "I")
	public int anInt9859 = -1;

	@OriginalMember(owner = "client!vo", name = "i", descriptor = "Z")
	public boolean aBoolean709 = false;

	@OriginalMember(owner = "client!vo", name = "e", descriptor = "Z")
	public boolean aBoolean708 = false;

	@OriginalMember(owner = "client!vo", name = "t", descriptor = "I")
	public int anInt9865 = 99;

	@OriginalMember(owner = "client!vo", name = "r", descriptor = "I")
	public int anInt9863 = -1;

	@OriginalMember(owner = "client!vo", name = "x", descriptor = "I")
	public int anInt9867 = 2;

	@OriginalMember(owner = "client!vo", name = "E", descriptor = "I")
	public int anInt9870 = -1;

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(ILclient!sl;I)V")
	private void method8445(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub3 arg1) {
		@Pc(111) int local111;
		@Pc(117) int local117;
		@Pc(123) int local123;
		@Pc(145) int local145;
		if (arg0 == 1) {
			local111 = arg1.method4221();
			this.anIntArray642 = new int[local111];
			for (local117 = 0; local117 < local111; local117++) {
				this.anIntArray642[local117] = arg1.method4221();
			}
			this.anIntArray638 = new int[local111];
			for (local123 = 0; local123 < local111; local123++) {
				this.anIntArray638[local123] = arg1.method4221();
			}
			for (local145 = 0; local145 < local111; local145++) {
				this.anIntArray638[local145] = (arg1.method4221() << 16) + this.anIntArray638[local145];
			}
		} else if (arg0 == 2) {
			this.anInt9863 = arg1.method4221();
		} else if (arg0 == 3) {
			this.aBooleanArray28 = new boolean[256];
			local111 = arg1.method4225();
			for (local117 = 0; local117 < local111; local117++) {
				this.aBooleanArray28[arg1.method4225()] = true;
			}
		} else if (arg0 == 5) {
			this.anInt9855 = arg1.method4225();
		} else if (arg0 == 6) {
			this.anInt9857 = arg1.method4221();
		} else if (arg0 == 7) {
			this.anInt9870 = arg1.method4221();
		} else if (arg0 == 8) {
			this.anInt9865 = arg1.method4225();
		} else if (arg0 == 9) {
			this.anInt9859 = arg1.method4225();
		} else if (arg0 == 10) {
			this.anInt9856 = arg1.method4225();
		} else if (arg0 == 11) {
			this.anInt9867 = arg1.method4225();
		} else if (arg0 == 12) {
			local111 = arg1.method4225();
			this.anIntArray639 = new int[local111];
			for (local117 = 0; local117 < local111; local117++) {
				this.anIntArray639[local117] = arg1.method4221();
			}
			for (local123 = 0; local123 < local111; local123++) {
				this.anIntArray639[local123] += arg1.method4221() << 16;
			}
		} else if (arg0 == 13) {
			local111 = arg1.method4221();
			this.anIntArrayArray62 = new int[local111][];
			for (local117 = 0; local117 < local111; local117++) {
				local123 = arg1.method4225();
				if (local123 > 0) {
					this.anIntArrayArray62[local117] = new int[local123];
					this.anIntArrayArray62[local117][0] = arg1.method4204();
					for (local145 = 1; local145 < local123; local145++) {
						this.anIntArrayArray62[local117][local145] = arg1.method4221();
					}
				}
			}
		} else if (arg0 == 14) {
			this.aBoolean710 = true;
		} else if (arg0 == 15) {
			this.aBoolean707 = true;
		} else if (arg0 == 16) {
			this.aBoolean709 = true;
		} else if (arg0 == 18) {
			this.aBoolean708 = true;
		} else if (arg0 == 19) {
			if (this.anIntArray641 == null) {
				this.anIntArray641 = new int[this.anIntArrayArray62.length];
				for (local111 = 0; local111 < this.anIntArrayArray62.length; local111++) {
					this.anIntArray641[local111] = 255;
				}
			}
			this.anIntArray641[arg1.method4225()] = arg1.method4225();
		} else if (arg0 == 20) {
			if (this.anIntArray640 == null || this.anIntArray637 == null) {
				this.anIntArray640 = new int[this.anIntArrayArray62.length];
				this.anIntArray637 = new int[this.anIntArrayArray62.length];
				for (local111 = 0; local111 < this.anIntArrayArray62.length; local111++) {
					this.anIntArray640[local111] = 256;
					this.anIntArray637[local111] = 256;
				}
			}
			local111 = arg1.method4225();
			this.anIntArray640[local111] = arg1.method4221();
			this.anIntArray637[local111] = arg1.method4221();
		}
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(I)V")
	public void method8446() {
		if (this.anInt9859 == -1) {
			if (this.aBooleanArray28 == null) {
				this.anInt9859 = 0;
			} else {
				this.anInt9859 = 2;
			}
		}
		if (this.anInt9856 != -1) {
			return;
		}
		if (this.aBooleanArray28 == null) {
			this.anInt9856 = 0;
		} else {
			this.anInt9856 = 2;
		}
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(BIIILclient!ka;IBI)Lclient!ka;")
	public Class17 method8447(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class17 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) byte arg5, @OriginalArg(7) int arg6) {
		@Pc(8) int local8 = this.anIntArray642[arg0];
		@Pc(13) int local13 = this.anIntArray638[arg0];
		@Pc(21) Class3_Sub4_Sub8 local21 = this.aClass227_2.method5974(local13 >> 16);
		@Pc(25) int local25 = local13 & 0xFFFF;
		if (local21 == null) {
			return arg3.method5409(arg5, arg6, true);
		}
		@Pc(35) Class3_Sub4_Sub8 local35 = null;
		if ((this.aBoolean707 || Static583.aBoolean687) && arg1 != -1 && this.anIntArray638.length > arg1) {
			@Pc(54) int local54 = this.anIntArray638[arg1];
			local35 = this.aClass227_2.method5974(local54 >> 16);
			arg1 = local54 & 0xFFFF;
		}
		if (this.aBoolean710) {
			arg6 |= 0x200;
		}
		if (local21.method3037(local25)) {
			arg6 |= 0x80;
		}
		if (local21.method3036(local25)) {
			arg6 |= 0x100;
		}
		if (local21.method3040(local25)) {
			arg6 |= 0x400;
		}
		if (local35 != null) {
			if (local35.method3037(arg1)) {
				arg6 |= 0x80;
			}
			if (local35.method3036(arg1)) {
				arg6 |= 0x100;
			}
			if (local35.method3040(arg1)) {
				arg6 |= 0x400;
			}
		}
		arg6 |= 0x20;
		@Pc(145) Class17 local145 = arg3.method5409(arg5, arg6, true);
		local145.method5421(this.aBoolean710, local21, arg4, local25, local35, arg2 - 1, local8, arg1);
		return local145;
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(IIBIILclient!ka;)Lclient!ka;")
	public Class17 method8448(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class17 arg4) {
		@Pc(8) int local8 = this.anIntArray642[arg2];
		@Pc(13) int local13 = this.anIntArray638[arg2];
		@Pc(21) Class3_Sub4_Sub8 local21 = this.aClass227_2.method5974(local13 >> 16);
		@Pc(25) int local25 = local13 & 0xFFFF;
		if (local21 == null) {
			return arg4.method5409((byte) 1, arg0, true);
		}
		@Pc(40) Class3_Sub4_Sub8 local40 = null;
		if ((this.aBoolean707 || Static583.aBoolean687) && arg1 != -1 && arg1 < this.anIntArray638.length) {
			@Pc(63) int local63 = this.anIntArray638[arg1];
			local40 = this.aClass227_2.method5974(local63 >> 16);
			arg1 = local63 & 0xFFFF;
		}
		@Pc(77) Class3_Sub4_Sub8 local77 = null;
		@Pc(79) Class3_Sub4_Sub8 local79 = null;
		@Pc(81) int local81 = 0;
		@Pc(83) int local83 = 0;
		if (this.anIntArray639 != null) {
			if (this.anIntArray639.length > arg2) {
				local81 = this.anIntArray639[arg2];
				if (local81 != 65535) {
					local77 = this.aClass227_2.method5974(local81 >> 16);
					local81 &= 0xFFFF;
				}
			}
			if ((this.aBoolean707 || Static583.aBoolean687) && arg1 != -1 && arg1 < this.anIntArray639.length) {
				local83 = this.anIntArray639[arg1];
				if (local83 != 65535) {
					local79 = this.aClass227_2.method5974(local83 >> 16);
					local83 &= 0xFFFF;
				}
			}
		}
		if (this.aBoolean710) {
			arg0 |= 0x200;
		}
		if (local21.method3037(local25)) {
			arg0 |= 0x80;
		}
		if (local21.method3036(local25)) {
			arg0 |= 0x100;
		}
		if (local21.method3040(local25)) {
			arg0 |= 0x400;
		}
		if (local77 != null) {
			if (local77.method3037(local81)) {
				arg0 |= 0x80;
			}
			if (local77.method3036(local81)) {
				arg0 |= 0x100;
			}
			if (local77.method3040(local81)) {
				arg0 |= 0x400;
			}
		}
		if (local40 != null) {
			if (local40.method3037(arg1)) {
				arg0 |= 0x80;
			}
			if (local40.method3036(arg1)) {
				arg0 |= 0x100;
			}
			if (local40.method3040(arg1)) {
				arg0 |= 0x400;
			}
		}
		if (local79 != null) {
			if (local79.method3037(local83)) {
				arg0 |= 0x80;
			}
			if (local79.method3036(local83)) {
				arg0 |= 0x100;
			}
			if (local79.method3040(local83)) {
				arg0 |= 0x400;
			}
		}
		arg0 |= 0x20;
		@Pc(284) Class17 local284 = arg4.method5409((byte) 1, arg0, true);
		local284.method5421(this.aBoolean710, local21, 0, local25, local40, arg3 - 1, local8, arg1);
		if (local77 != null) {
			local284.method5421(this.aBoolean710, local77, 0, local81, local79, arg3 - 1, local8, local83);
		}
		return local284;
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(Lclient!sl;I)V")
	public void method8450(@OriginalArg(0) Class3_Sub3 arg0) {
		while (true) {
			@Pc(17) int local17 = arg0.method4225();
			if (local17 == 0) {
				return;
			}
			this.method8445(local17, arg0);
		}
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(IIZI)I")
	public int method8452(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2) {
		@Pc(5) int local5 = 0;
		@Pc(7) int local7 = 0;
		@Pc(17) int local17 = this.anIntArray638[arg2];
		@Pc(19) Class3_Sub4_Sub8 local19 = null;
		@Pc(27) Class3_Sub4_Sub8 local27 = this.aClass227_2.method5974(local17 >> 16);
		@Pc(31) int local31 = local17 & 0xFFFF;
		if (local27 == null) {
			return 0;
		}
		if ((this.aBoolean707 || Static583.aBoolean687) && arg0 != -1 && arg0 < this.anIntArray638.length) {
			local7 = this.anIntArray638[arg0];
			local19 = this.aClass227_2.method5974(local7 >> 16);
			local7 &= 0xFFFF;
		}
		if (this.aBoolean710) {
			local5 = 512;
		}
		if (local27.method3037(local31)) {
			local5 |= 0x80;
		}
		if (local27.method3036(local31)) {
			local5 |= 0x100;
		}
		if (local27.method3040(local31)) {
			local5 |= 0x400;
		}
		if (local19 != null) {
			if (local19.method3037(local7)) {
				local5 |= 0x80;
			}
			if (local19.method3036(local7)) {
				local5 |= 0x100;
			}
			if (local19.method3040(local7)) {
				local5 |= 0x400;
			}
		}
		if (this.anIntArray639 != null && arg1) {
			@Pc(147) int local147;
			@Pc(158) Class3_Sub4_Sub8 local158;
			if (arg2 < this.anIntArray639.length) {
				local147 = this.anIntArray639[arg2];
				if (local147 != 65535) {
					local158 = this.aClass227_2.method5974(local147 >> 16);
					local147 &= 0xFFFF;
					if (local158 != null) {
						if (local158.method3037(local147)) {
							local5 |= 0x80;
						}
						if (local158.method3036(local147)) {
							local5 |= 0x100;
						}
						if (local158.method3040(local147)) {
							local5 |= 0x400;
						}
					}
				}
			}
			if ((this.aBoolean707 || Static583.aBoolean687) && arg0 != -1 && arg0 < this.anIntArray639.length) {
				local147 = this.anIntArray639[arg0];
				if (local147 != 65535) {
					local158 = this.aClass227_2.method5974(local147 >> 16);
					local147 &= 0xFFFF;
					if (local158 != null) {
						if (local158.method3037(local147)) {
							local5 |= 0x80;
						}
						if (local158.method3036(local147)) {
							local5 |= 0x100;
						}
						if (local158.method3040(local147)) {
							local5 |= 0x400;
						}
					}
				}
			}
		}
		return local5 | 0x20;
	}
}
