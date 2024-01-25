import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jl")
public final class Class131 {

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "I")
	public int anInt3694;

	@OriginalMember(owner = "client!jl", name = "d", descriptor = "[I")
	public int[] anIntArray233;

	@OriginalMember(owner = "client!jl", name = "l", descriptor = "Lclient!rs;")
	public Class217 aClass217_2;

	@OriginalMember(owner = "client!jl", name = "n", descriptor = "[I")
	private int[] anIntArray234;

	@OriginalMember(owner = "client!jl", name = "q", descriptor = "[Z")
	public boolean[] aBooleanArray9;

	@OriginalMember(owner = "client!jl", name = "r", descriptor = "[I")
	public int[] anIntArray235;

	@OriginalMember(owner = "client!jl", name = "A", descriptor = "[[I")
	public int[][] anIntArrayArray21;

	@OriginalMember(owner = "client!jl", name = "i", descriptor = "I")
	public int anInt3698 = -1;

	@OriginalMember(owner = "client!jl", name = "e", descriptor = "Z")
	public boolean aBoolean244 = false;

	@OriginalMember(owner = "client!jl", name = "p", descriptor = "I")
	public int anInt3701 = 5;

	@OriginalMember(owner = "client!jl", name = "k", descriptor = "Z")
	public boolean aBoolean246 = false;

	@OriginalMember(owner = "client!jl", name = "c", descriptor = "Z")
	public boolean aBoolean243 = false;

	@OriginalMember(owner = "client!jl", name = "t", descriptor = "I")
	public int anInt3702 = 2;

	@OriginalMember(owner = "client!jl", name = "h", descriptor = "Z")
	public boolean aBoolean245 = false;

	@OriginalMember(owner = "client!jl", name = "u", descriptor = "I")
	public int anInt3703 = -1;

	@OriginalMember(owner = "client!jl", name = "j", descriptor = "I")
	public int anInt3699 = 99;

	@OriginalMember(owner = "client!jl", name = "z", descriptor = "I")
	public int anInt3708 = -1;

	@OriginalMember(owner = "client!jl", name = "B", descriptor = "I")
	public int anInt3709 = -1;

	@OriginalMember(owner = "client!jl", name = "x", descriptor = "I")
	public int anInt3706 = -1;

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(Lclient!va;IIIII)Lclient!va;")
	public Class224 method3043(@OriginalArg(0) Class224 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(8) int local8 = this.anIntArray233[arg4];
		@Pc(13) int local13 = this.anIntArray235[arg4];
		@Pc(23) Class6_Sub2_Sub8 local23 = this.aClass217_2.method5235(local13 >> 16);
		@Pc(27) int local27 = local13 & 0xFFFF;
		if (local23 == null) {
			return arg0.method5808((byte) 1, arg3, true);
		}
		@Pc(37) Class6_Sub2_Sub8 local37 = null;
		if ((this.aBoolean244 || Static421.aBoolean474) && arg1 != -1 && arg1 < this.anIntArray235.length) {
			@Pc(60) int local60 = this.anIntArray235[arg1];
			local37 = this.aClass217_2.method5235(local60 >> 16);
			arg1 = local60 & 0xFFFF;
		}
		@Pc(74) Class6_Sub2_Sub8 local74 = null;
		@Pc(76) Class6_Sub2_Sub8 local76 = null;
		@Pc(78) int local78 = 0;
		@Pc(80) int local80 = 0;
		if (this.anIntArray234 != null) {
			if (arg4 < this.anIntArray234.length) {
				local78 = this.anIntArray234[arg4];
				if (local78 != 65535) {
					local74 = this.aClass217_2.method5235(local78 >> 16);
					local78 &= 0xFFFF;
				}
			}
			if ((this.aBoolean244 || Static421.aBoolean474) && arg1 != -1 && this.anIntArray234.length > arg1) {
				local80 = this.anIntArray234[arg1];
				if (local80 != 65535) {
					local76 = this.aClass217_2.method5235(local80 >> 16);
					local80 &= 0xFFFF;
				}
			}
		}
		if (this.aBoolean243) {
			arg3 |= 0x200;
		}
		if (local23.method3332(local27)) {
			arg3 |= 0x80;
		}
		if (local23.method3330(local27)) {
			arg3 |= 0x100;
		}
		if (local23.method3329(local27)) {
			arg3 |= 0x400;
		}
		if (local74 != null) {
			if (local74.method3332(local78)) {
				arg3 |= 0x80;
			}
			if (local74.method3330(local78)) {
				arg3 |= 0x100;
			}
			if (local74.method3329(local78)) {
				arg3 |= 0x400;
			}
		}
		if (local37 != null) {
			if (local37.method3332(arg1)) {
				arg3 |= 0x80;
			}
			if (local37.method3330(arg1)) {
				arg3 |= 0x100;
			}
			if (local37.method3329(arg1)) {
				arg3 |= 0x400;
			}
		}
		if (local76 != null) {
			if (local76.method3332(local80)) {
				arg3 |= 0x80;
			}
			if (local76.method3330(local80)) {
				arg3 |= 0x100;
			}
			if (local76.method3329(local80)) {
				arg3 |= 0x400;
			}
		}
		arg3 |= 0x20;
		@Pc(280) Class224 local280 = arg0.method5808((byte) 1, arg3, true);
		local280.method5793(0, this.aBoolean243, local23, local27, arg1, local37, arg2 - 1, local8);
		if (local74 != null) {
			local280.method5793(0, this.aBoolean243, local74, local78, local80, local76, arg2 - 1, local8);
		}
		return local280;
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(Z)V")
	public void method3044() {
		if (this.anInt3706 == -1) {
			if (this.aBooleanArray9 == null) {
				this.anInt3706 = 0;
			} else {
				this.anInt3706 = 2;
			}
		}
		if (this.anInt3708 != -1) {
			return;
		}
		if (this.aBooleanArray9 == null) {
			this.anInt3708 = 0;
		} else {
			this.anInt3708 = 2;
		}
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(BLclient!ae;)V")
	public void method3045(@OriginalArg(1) Class6_Sub1 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method6433();
			if (local5 == 0) {
				return;
			}
			this.method3046(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(IILclient!ae;)V")
	private void method3046(@OriginalArg(1) int arg0, @OriginalArg(2) Class6_Sub1 arg1) {
		@Pc(88) int local88;
		@Pc(94) int local94;
		@Pc(100) int local100;
		@Pc(119) int local119;
		if (arg0 == 1) {
			local88 = arg1.method6485();
			this.anIntArray233 = new int[local88];
			for (local94 = 0; local94 < local88; local94++) {
				this.anIntArray233[local94] = arg1.method6485();
			}
			this.anIntArray235 = new int[local88];
			for (local100 = 0; local100 < local88; local100++) {
				this.anIntArray235[local100] = arg1.method6485();
			}
			for (local119 = 0; local119 < local88; local119++) {
				this.anIntArray235[local119] = (arg1.method6485() << 16) + this.anIntArray235[local119];
			}
		} else if (arg0 == 2) {
			this.anInt3698 = arg1.method6485();
		} else if (arg0 == 3) {
			this.aBooleanArray9 = new boolean[256];
			local88 = arg1.method6433();
			for (local94 = 0; local94 < local88; local94++) {
				this.aBooleanArray9[arg1.method6433()] = true;
			}
		} else if (arg0 == 4) {
			this.aBoolean245 = true;
		} else if (arg0 == 5) {
			this.anInt3701 = arg1.method6433();
		} else if (arg0 == 6) {
			this.anInt3703 = arg1.method6485();
		} else if (arg0 == 7) {
			this.anInt3709 = arg1.method6485();
		} else if (arg0 == 8) {
			this.anInt3699 = arg1.method6433();
		} else if (arg0 == 9) {
			this.anInt3708 = arg1.method6433();
		} else if (arg0 == 10) {
			this.anInt3706 = arg1.method6433();
		} else if (arg0 == 11) {
			this.anInt3702 = arg1.method6433();
		} else if (arg0 == 12) {
			local88 = arg1.method6433();
			this.anIntArray234 = new int[local88];
			for (local94 = 0; local94 < local88; local94++) {
				this.anIntArray234[local94] = arg1.method6485();
			}
			for (local100 = 0; local100 < local88; local100++) {
				this.anIntArray234[local100] = (arg1.method6485() << 16) + this.anIntArray234[local100];
			}
		} else if (arg0 == 13) {
			local88 = arg1.method6485();
			this.anIntArrayArray21 = new int[local88][];
			for (local94 = 0; local94 < local88; local94++) {
				local100 = arg1.method6433();
				if (local100 > 0) {
					this.anIntArrayArray21[local94] = new int[local100];
					this.anIntArrayArray21[local94][0] = arg1.method6435();
					for (local119 = 1; local119 < local100; local119++) {
						this.anIntArrayArray21[local94][local119] = arg1.method6485();
					}
				}
			}
		} else if (arg0 == 14) {
			this.aBoolean243 = true;
		} else if (arg0 == 15) {
			this.aBoolean244 = true;
		} else if (arg0 == 16) {
			this.aBoolean246 = true;
		}
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(IIIZ)I")
	public int method3049(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2) {
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(18) int local18 = this.anIntArray235[arg0];
		@Pc(20) Class6_Sub2_Sub8 local20 = null;
		@Pc(30) Class6_Sub2_Sub8 local30 = this.aClass217_2.method5235(local18 >> 16);
		@Pc(34) int local34 = local18 & 0xFFFF;
		if (local30 == null) {
			return 0;
		}
		if ((this.aBoolean244 || Static421.aBoolean474) && arg1 != -1 && arg1 < this.anIntArray235.length) {
			local13 = this.anIntArray235[arg1];
			local20 = this.aClass217_2.method5235(local13 >> 16);
			local13 &= 0xFFFF;
		}
		if (this.aBoolean243) {
			local11 = 512;
		}
		if (local30.method3332(local34)) {
			local11 |= 0x80;
		}
		if (local30.method3330(local34)) {
			local11 |= 0x100;
		}
		if (local30.method3329(local34)) {
			local11 |= 0x400;
		}
		if (local20 != null) {
			if (local20.method3332(local13)) {
				local11 |= 0x80;
			}
			if (local20.method3330(local13)) {
				local11 |= 0x100;
			}
			if (local20.method3329(local13)) {
				local11 |= 0x400;
			}
		}
		if (this.anIntArray234 != null && arg2) {
			@Pc(154) int local154;
			@Pc(167) Class6_Sub2_Sub8 local167;
			if (arg0 < this.anIntArray234.length) {
				local154 = this.anIntArray234[arg0];
				if (local154 != 65535) {
					local167 = this.aClass217_2.method5235(local154 >> 16);
					local154 &= 0xFFFF;
					if (local167 != null) {
						if (local167.method3332(local154)) {
							local11 |= 0x80;
						}
						if (local167.method3330(local154)) {
							local11 |= 0x100;
						}
						if (local167.method3329(local154)) {
							local11 |= 0x400;
						}
					}
				}
			}
			if ((this.aBoolean244 || Static421.aBoolean474) && arg1 != -1 && this.anIntArray234.length > arg1) {
				local154 = this.anIntArray234[arg1];
				if (local154 != 65535) {
					local167 = this.aClass217_2.method5235(local154 >> 16);
					local154 &= 0xFFFF;
					if (local167 != null) {
						if (local167.method3332(local154)) {
							local11 |= 0x80;
						}
						if (local167.method3330(local154)) {
							local11 |= 0x100;
						}
						if (local167.method3329(local154)) {
							local11 |= 0x400;
						}
					}
				}
			}
		}
		return local11 | 0x20;
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(IBIIIIBLclient!va;)Lclient!va;")
	public Class224 method3050(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) byte arg5, @OriginalArg(7) Class224 arg6) {
		@Pc(8) int local8 = this.anIntArray233[arg3];
		@Pc(13) int local13 = this.anIntArray235[arg3];
		@Pc(21) Class6_Sub2_Sub8 local21 = this.aClass217_2.method5235(local13 >> 16);
		@Pc(25) int local25 = local13 & 0xFFFF;
		if (local21 == null) {
			return arg6.method5808(arg5, arg4, true);
		}
		@Pc(45) Class6_Sub2_Sub8 local45 = null;
		if ((this.aBoolean244 || Static421.aBoolean474) && arg1 != -1 && this.anIntArray235.length > arg1) {
			@Pc(64) int local64 = this.anIntArray235[arg1];
			local45 = this.aClass217_2.method5235(local64 >> 16);
			arg1 = local64 & 0xFFFF;
		}
		if (this.aBoolean243) {
			arg4 |= 0x200;
		}
		if (local21.method3332(local25)) {
			arg4 |= 0x80;
		}
		if (local21.method3330(local25)) {
			arg4 |= 0x100;
		}
		if (local21.method3329(local25)) {
			arg4 |= 0x400;
		}
		if (local45 != null) {
			if (local45.method3332(arg1)) {
				arg4 |= 0x80;
			}
			if (local45.method3330(arg1)) {
				arg4 |= 0x100;
			}
			if (local45.method3329(arg1)) {
				arg4 |= 0x400;
			}
		}
		arg4 |= 0x20;
		@Pc(149) Class224 local149 = arg6.method5808(arg5, arg4, true);
		local149.method5793(arg2, this.aBoolean243, local21, local25, arg1, local45, arg0 - 1, local8);
		return local149;
	}
}
