import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gaa")
public final class Class113 {

	@OriginalMember(owner = "client!gaa", name = "d", descriptor = "[I")
	public int[] anIntArray174;

	@OriginalMember(owner = "client!gaa", name = "g", descriptor = "[I")
	public int[] anIntArray175;

	@OriginalMember(owner = "client!gaa", name = "i", descriptor = "[I")
	public int[] anIntArray176;

	@OriginalMember(owner = "client!gaa", name = "k", descriptor = "[Z")
	public boolean[] aBooleanArray9;

	@OriginalMember(owner = "client!gaa", name = "n", descriptor = "[I")
	public int[] anIntArray177;

	@OriginalMember(owner = "client!gaa", name = "r", descriptor = "[I")
	public int[] anIntArray178;

	@OriginalMember(owner = "client!gaa", name = "v", descriptor = "[[I")
	public int[][] anIntArrayArray16;

	@OriginalMember(owner = "client!gaa", name = "z", descriptor = "Lclient!me;")
	public Class198 aClass198_1;

	@OriginalMember(owner = "client!gaa", name = "C", descriptor = "I")
	public int anInt3854;

	@OriginalMember(owner = "client!gaa", name = "E", descriptor = "[I")
	private int[] anIntArray179;

	@OriginalMember(owner = "client!gaa", name = "e", descriptor = "I")
	public int anInt3843 = -1;

	@OriginalMember(owner = "client!gaa", name = "j", descriptor = "Z")
	public boolean aBoolean307 = false;

	@OriginalMember(owner = "client!gaa", name = "b", descriptor = "I")
	public int anInt3841 = 99;

	@OriginalMember(owner = "client!gaa", name = "u", descriptor = "I")
	public int anInt3851 = -1;

	@OriginalMember(owner = "client!gaa", name = "s", descriptor = "I")
	public int anInt3849 = 2;

	@OriginalMember(owner = "client!gaa", name = "t", descriptor = "I")
	public int anInt3850 = -1;

	@OriginalMember(owner = "client!gaa", name = "o", descriptor = "I")
	public int anInt3847 = -1;

	@OriginalMember(owner = "client!gaa", name = "p", descriptor = "Z")
	public boolean aBoolean308 = false;

	@OriginalMember(owner = "client!gaa", name = "x", descriptor = "Z")
	public boolean aBoolean309 = false;

	@OriginalMember(owner = "client!gaa", name = "A", descriptor = "Z")
	public boolean aBoolean310 = false;

	@OriginalMember(owner = "client!gaa", name = "G", descriptor = "I")
	public int anInt3857 = 5;

	@OriginalMember(owner = "client!gaa", name = "F", descriptor = "I")
	public int anInt3856 = -1;

	@OriginalMember(owner = "client!gaa", name = "a", descriptor = "(BIIIIBLclient!ka;I)Lclient!ka;")
	public Class92 method3261(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class92 arg5, @OriginalArg(7) int arg6) {
		@Pc(13) int local13 = this.anIntArray176[arg2];
		@Pc(18) int local18 = this.anIntArray178[arg2];
		@Pc(26) Class6_Sub5_Sub18 local26 = this.aClass198_1.method5707(local18 >> 16);
		@Pc(30) int local30 = local18 & 0xFFFF;
		if (local26 == null) {
			return arg5.method7069(arg0, arg3, true);
		}
		@Pc(40) Class6_Sub5_Sub18 local40 = null;
		if ((this.aBoolean310 || Static609.aBoolean809) && arg4 != -1 && arg4 < this.anIntArray178.length) {
			@Pc(63) int local63 = this.anIntArray178[arg4];
			local40 = this.aClass198_1.method5707(local63 >> 16);
			arg4 = local63 & 0xFFFF;
		}
		if (this.aBoolean308) {
			arg3 |= 0x200;
		}
		if (local26.method4650(local30)) {
			arg3 |= 0x80;
		}
		if (local26.method4648(local30)) {
			arg3 |= 0x100;
		}
		if (local26.method4646(local30)) {
			arg3 |= 0x400;
		}
		if (local40 != null) {
			if (local40.method4650(arg4)) {
				arg3 |= 0x80;
			}
			if (local40.method4648(arg4)) {
				arg3 |= 0x100;
			}
			if (local40.method4646(arg4)) {
				arg3 |= 0x400;
			}
		}
		arg3 |= 0x20;
		@Pc(148) Class92 local148 = arg5.method7069(arg0, arg3, true);
		local148.method7066(arg6 - 1, local26, local30, local40, this.aBoolean308, arg1, local13, arg4);
		return local148;
	}

	@OriginalMember(owner = "client!gaa", name = "a", descriptor = "(ZIZI)I")
	public int method3263(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(5) int local5 = 0;
		@Pc(7) int local7 = 0;
		@Pc(12) int local12 = this.anIntArray178[arg1];
		@Pc(14) Class6_Sub5_Sub18 local14 = null;
		@Pc(22) Class6_Sub5_Sub18 local22 = this.aClass198_1.method5707(local12 >> 16);
		@Pc(26) int local26 = local12 & 0xFFFF;
		if (local22 == null) {
			return 0;
		}
		if ((this.aBoolean310 || Static609.aBoolean809) && arg2 != -1 && this.anIntArray178.length > arg2) {
			local7 = this.anIntArray178[arg2];
			local14 = this.aClass198_1.method5707(local7 >> 16);
			local7 &= 0xFFFF;
		}
		if (this.aBoolean308) {
			local5 = 512;
		}
		if (local22.method4650(local26)) {
			local5 |= 0x80;
		}
		if (local22.method4648(local26)) {
			local5 |= 0x100;
		}
		if (local22.method4646(local26)) {
			local5 |= 0x400;
		}
		if (local14 != null) {
			if (local14.method4650(local7)) {
				local5 |= 0x80;
			}
			if (local14.method4648(local7)) {
				local5 |= 0x100;
			}
			if (local14.method4646(local7)) {
				local5 |= 0x400;
			}
		}
		if (this.anIntArray179 != null && arg0) {
			@Pc(147) int local147;
			@Pc(160) Class6_Sub5_Sub18 local160;
			if (arg1 < this.anIntArray179.length) {
				local147 = this.anIntArray179[arg1];
				if (local147 != 65535) {
					local160 = this.aClass198_1.method5707(local147 >> 16);
					local147 &= 0xFFFF;
					if (local160 != null) {
						if (local160.method4650(local147)) {
							local5 |= 0x80;
						}
						if (local160.method4648(local147)) {
							local5 |= 0x100;
						}
						if (local160.method4646(local147)) {
							local5 |= 0x400;
						}
					}
				}
			}
			if ((this.aBoolean310 || Static609.aBoolean809) && arg2 != -1 && arg2 < this.anIntArray179.length) {
				local147 = this.anIntArray179[arg2];
				if (local147 != 65535) {
					local160 = this.aClass198_1.method5707(local147 >> 16);
					local147 &= 0xFFFF;
					if (local160 != null) {
						if (local160.method4650(local147)) {
							local5 |= 0x80;
						}
						if (local160.method4648(local147)) {
							local5 |= 0x100;
						}
						if (local160.method4646(local147)) {
							local5 |= 0x400;
						}
					}
				}
			}
		}
		return local5 | 0x20;
	}

	@OriginalMember(owner = "client!gaa", name = "a", descriptor = "(Lclient!ji;I)V")
	public void method3264(@OriginalArg(0) Class6_Sub8 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method8246();
			if (local5 == 0) {
				return;
			}
			this.method3270(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!gaa", name = "a", descriptor = "(IIIILclient!ka;I)Lclient!ka;")
	public Class92 method3268(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class92 arg3, @OriginalArg(5) int arg4) {
		@Pc(8) int local8 = this.anIntArray176[arg4];
		@Pc(13) int local13 = this.anIntArray178[arg4];
		@Pc(21) Class6_Sub5_Sub18 local21 = this.aClass198_1.method5707(local13 >> 16);
		@Pc(25) int local25 = local13 & 0xFFFF;
		if (local21 == null) {
			return arg3.method7069((byte) 1, arg2, true);
		}
		@Pc(35) Class6_Sub5_Sub18 local35 = null;
		if ((this.aBoolean310 || Static609.aBoolean809) && arg0 != -1 && this.anIntArray178.length > arg0) {
			@Pc(57) int local57 = this.anIntArray178[arg0];
			local35 = this.aClass198_1.method5707(local57 >> 16);
			arg0 = local57 & 0xFFFF;
		}
		@Pc(71) Class6_Sub5_Sub18 local71 = null;
		@Pc(73) Class6_Sub5_Sub18 local73 = null;
		@Pc(75) int local75 = 0;
		@Pc(77) int local77 = 0;
		if (this.anIntArray179 != null) {
			if (this.anIntArray179.length > arg4) {
				local75 = this.anIntArray179[arg4];
				if (local75 != 65535) {
					local71 = this.aClass198_1.method5707(local75 >> 16);
					local75 &= 0xFFFF;
				}
			}
			if ((this.aBoolean310 || Static609.aBoolean809) && arg0 != -1 && arg0 < this.anIntArray179.length) {
				local77 = this.anIntArray179[arg0];
				if (local77 != 65535) {
					local73 = this.aClass198_1.method5707(local77 >> 16);
					local77 &= 0xFFFF;
				}
			}
		}
		if (this.aBoolean308) {
			arg2 |= 0x200;
		}
		if (local21.method4650(local25)) {
			arg2 |= 0x80;
		}
		if (local21.method4648(local25)) {
			arg2 |= 0x100;
		}
		if (local21.method4646(local25)) {
			arg2 |= 0x400;
		}
		if (local71 != null) {
			if (local71.method4650(local75)) {
				arg2 |= 0x80;
			}
			if (local71.method4648(local75)) {
				arg2 |= 0x100;
			}
			if (local71.method4646(local75)) {
				arg2 |= 0x400;
			}
		}
		if (local35 != null) {
			if (local35.method4650(arg0)) {
				arg2 |= 0x80;
			}
			if (local35.method4648(arg0)) {
				arg2 |= 0x100;
			}
			if (local35.method4646(arg0)) {
				arg2 |= 0x400;
			}
		}
		if (local73 != null) {
			if (local73.method4650(local77)) {
				arg2 |= 0x80;
			}
			if (local73.method4648(local77)) {
				arg2 |= 0x100;
			}
			if (local73.method4646(local77)) {
				arg2 |= 0x400;
			}
		}
		arg2 |= 0x20;
		@Pc(281) Class92 local281 = arg3.method7069((byte) 1, arg2, true);
		local281.method7066(arg1 - 1, local21, local25, local35, this.aBoolean308, 0, local8, arg0);
		if (local71 != null) {
			local281.method7066(arg1 - 1, local71, local75, local73, this.aBoolean308, 0, local8, local77);
		}
		return local281;
	}

	@OriginalMember(owner = "client!gaa", name = "a", descriptor = "(I)V")
	public void method3269() {
		if (this.anInt3851 == -1) {
			if (this.aBooleanArray9 == null) {
				this.anInt3851 = 0;
			} else {
				this.anInt3851 = 2;
			}
		}
		if (this.anInt3847 != -1) {
			return;
		}
		if (this.aBooleanArray9 == null) {
			this.anInt3847 = 0;
		} else {
			this.anInt3847 = 2;
		}
	}

	@OriginalMember(owner = "client!gaa", name = "a", descriptor = "(ILclient!ji;I)V")
	private void method3270(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub8 arg1) {
		@Pc(8) int local8;
		@Pc(14) int local14;
		@Pc(33) int local33;
		@Pc(52) int local52;
		if (arg0 == 1) {
			local8 = arg1.method8220();
			this.anIntArray176 = new int[local8];
			for (local14 = 0; local14 < local8; local14++) {
				this.anIntArray176[local14] = arg1.method8220();
			}
			this.anIntArray178 = new int[local8];
			for (local33 = 0; local33 < local8; local33++) {
				this.anIntArray178[local33] = arg1.method8220();
			}
			for (local52 = 0; local52 < local8; local52++) {
				this.anIntArray178[local52] = (arg1.method8220() << 16) + this.anIntArray178[local52];
			}
		} else if (arg0 == 2) {
			this.anInt3856 = arg1.method8220();
		} else if (arg0 == 3) {
			this.aBooleanArray9 = new boolean[256];
			local8 = arg1.method8246();
			for (local14 = 0; local14 < local8; local14++) {
				this.aBooleanArray9[arg1.method8246()] = true;
			}
		} else if (arg0 == 5) {
			this.anInt3857 = arg1.method8246();
		} else if (arg0 == 6) {
			this.anInt3850 = arg1.method8220();
		} else if (arg0 == 7) {
			this.anInt3843 = arg1.method8220();
		} else if (arg0 == 8) {
			this.anInt3841 = arg1.method8246();
		} else if (arg0 == 9) {
			this.anInt3851 = arg1.method8246();
		} else if (arg0 == 10) {
			this.anInt3847 = arg1.method8246();
		} else if (arg0 == 11) {
			this.anInt3849 = arg1.method8246();
		} else if (arg0 == 12) {
			local8 = arg1.method8246();
			this.anIntArray179 = new int[local8];
			for (local14 = 0; local14 < local8; local14++) {
				this.anIntArray179[local14] = arg1.method8220();
			}
			for (local33 = 0; local33 < local8; local33++) {
				this.anIntArray179[local33] = (arg1.method8220() << 16) + this.anIntArray179[local33];
			}
		} else if (arg0 == 13) {
			local8 = arg1.method8220();
			this.anIntArrayArray16 = new int[local8][];
			for (local14 = 0; local14 < local8; local14++) {
				local33 = arg1.method8246();
				if (local33 > 0) {
					this.anIntArrayArray16[local14] = new int[local33];
					this.anIntArrayArray16[local14][0] = arg1.method8203();
					for (local52 = 1; local52 < local33; local52++) {
						this.anIntArrayArray16[local14][local52] = arg1.method8220();
					}
				}
			}
		} else if (arg0 == 14) {
			this.aBoolean308 = true;
		} else if (arg0 == 15) {
			this.aBoolean310 = true;
		} else if (arg0 == 16) {
			this.aBoolean309 = true;
		} else if (arg0 == 18) {
			this.aBoolean307 = true;
		} else if (arg0 == 19) {
			if (this.anIntArray174 == null) {
				this.anIntArray174 = new int[this.anIntArrayArray16.length];
				for (local8 = 0; local8 < this.anIntArrayArray16.length; local8++) {
					this.anIntArray174[local8] = 255;
				}
			}
			this.anIntArray174[arg1.method8246()] = arg1.method8246();
		} else if (arg0 == 20) {
			if (this.anIntArray175 == null || this.anIntArray177 == null) {
				this.anIntArray175 = new int[this.anIntArrayArray16.length];
				this.anIntArray177 = new int[this.anIntArrayArray16.length];
				for (local8 = 0; local8 < this.anIntArrayArray16.length; local8++) {
					this.anIntArray175[local8] = 256;
					this.anIntArray177[local8] = 256;
				}
			}
			local8 = arg1.method8246();
			this.anIntArray175[local8] = arg1.method8220();
			this.anIntArray177[local8] = arg1.method8220();
		}
	}
}
