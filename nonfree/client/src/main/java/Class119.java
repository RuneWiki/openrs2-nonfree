import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!id")
public final class Class119 {

	@OriginalMember(owner = "client!id", name = "b", descriptor = "I")
	public int anInt2993;

	@OriginalMember(owner = "client!id", name = "c", descriptor = "[I")
	private int[] anIntArray241;

	@OriginalMember(owner = "client!id", name = "d", descriptor = "[[I")
	public int[][] anIntArrayArray36;

	@OriginalMember(owner = "client!id", name = "f", descriptor = "Lclient!in;")
	public Class125 aClass125_1;

	@OriginalMember(owner = "client!id", name = "g", descriptor = "[Z")
	public boolean[] aBooleanArray16;

	@OriginalMember(owner = "client!id", name = "p", descriptor = "[I")
	public int[] anIntArray242;

	@OriginalMember(owner = "client!id", name = "B", descriptor = "[I")
	public int[] anIntArray244;

	@OriginalMember(owner = "client!id", name = "n", descriptor = "I")
	public int anInt2999 = 5;

	@OriginalMember(owner = "client!id", name = "j", descriptor = "I")
	public int anInt2995 = -1;

	@OriginalMember(owner = "client!id", name = "k", descriptor = "I")
	public int anInt2996 = -1;

	@OriginalMember(owner = "client!id", name = "h", descriptor = "Z")
	public boolean aBoolean220 = false;

	@OriginalMember(owner = "client!id", name = "x", descriptor = "I")
	public int anInt3005 = -1;

	@OriginalMember(owner = "client!id", name = "w", descriptor = "I")
	public int anInt3004 = 99;

	@OriginalMember(owner = "client!id", name = "q", descriptor = "Z")
	public boolean aBoolean223 = false;

	@OriginalMember(owner = "client!id", name = "o", descriptor = "Z")
	public boolean aBoolean222 = false;

	@OriginalMember(owner = "client!id", name = "i", descriptor = "Z")
	public boolean aBoolean221 = false;

	@OriginalMember(owner = "client!id", name = "D", descriptor = "I")
	public int anInt3010 = -1;

	@OriginalMember(owner = "client!id", name = "z", descriptor = "I")
	public int anInt3007 = -1;

	@OriginalMember(owner = "client!id", name = "F", descriptor = "I")
	public int anInt3012 = 2;

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(ILclient!t;IIII)Lclient!t;")
	public Class116 method2288(@OriginalArg(0) int arg0, @OriginalArg(1) Class116 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(8) int local8 = this.anIntArray242[arg3];
		@Pc(13) int local13 = this.anIntArray244[arg3];
		@Pc(21) Class4_Sub2_Sub6 local21 = this.aClass125_1.method2383(local13 >> 16);
		@Pc(25) int local25 = local13 & 0xFFFF;
		if (local21 == null) {
			return arg1.method3123((byte) 1, arg4, true);
		}
		@Pc(35) Class4_Sub2_Sub6 local35 = null;
		if ((this.aBoolean223 || Static272.aBoolean335) && arg0 != -1 && arg0 < this.anIntArray244.length) {
			@Pc(64) int local64 = this.anIntArray244[arg0];
			local35 = this.aClass125_1.method2383(local64 >> 16);
			arg0 = local64 & 0xFFFF;
		}
		@Pc(80) Class4_Sub2_Sub6 local80 = null;
		@Pc(82) Class4_Sub2_Sub6 local82 = null;
		@Pc(84) int local84 = 0;
		@Pc(86) int local86 = 0;
		if (this.anIntArray241 != null) {
			if (this.anIntArray241.length > arg3) {
				local84 = this.anIntArray241[arg3];
				if (local84 != 65535) {
					local80 = this.aClass125_1.method2383(local84 >> 16);
					local84 &= 0xFFFF;
				}
			}
			if ((this.aBoolean223 || Static272.aBoolean335) && arg0 != -1 && this.anIntArray241.length > arg0) {
				local86 = this.anIntArray241[arg0];
				if (local86 != 65535) {
					local82 = this.aClass125_1.method2383(local86 >> 16);
					local86 &= 0xFFFF;
				}
			}
		}
		if (this.aBoolean222) {
			arg4 |= 0x200;
		}
		if (local21.method783(local25)) {
			arg4 |= 0x80;
		}
		if (local21.method781(local25)) {
			arg4 |= 0x100;
		}
		if (local21.method780(local25)) {
			arg4 |= 0x400;
		}
		if (local80 != null) {
			if (local80.method783(local84)) {
				arg4 |= 0x80;
			}
			if (local80.method781(local84)) {
				arg4 |= 0x100;
			}
			if (local80.method780(local84)) {
				arg4 |= 0x400;
			}
		}
		if (local35 != null) {
			if (local35.method783(arg0)) {
				arg4 |= 0x80;
			}
			if (local35.method781(arg0)) {
				arg4 |= 0x100;
			}
			if (local35.method780(arg0)) {
				arg4 |= 0x400;
			}
		}
		if (local82 != null) {
			if (local82.method783(local86)) {
				arg4 |= 0x80;
			}
			if (local82.method781(local86)) {
				arg4 |= 0x100;
			}
			if (local82.method780(local86)) {
				arg4 |= 0x400;
			}
		}
		arg4 |= 0x20;
		@Pc(284) Class116 local284 = arg1.method3123((byte) 1, arg4, true);
		local284.method3109(this.aBoolean222, local21, arg2 - 1, local35, arg0, 0, local25, local8);
		if (local80 != null) {
			local284.method3109(this.aBoolean222, local80, arg2 - 1, local82, local86, 0, local84, local8);
		}
		return local284;
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(ILclient!fh;)V")
	public void method2291(@OriginalArg(1) Class4_Sub9 arg0) {
		while (true) {
			@Pc(15) int local15 = arg0.method5007();
			if (local15 == 0) {
				return;
			}
			this.method2292(arg0, local15);
		}
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(ILclient!fh;I)V")
	private void method2292(@OriginalArg(1) Class4_Sub9 arg0, @OriginalArg(2) int arg1) {
		@Pc(32) int local32;
		@Pc(34) int local34;
		@Pc(157) int local157;
		@Pc(176) int local176;
		if (arg1 == 1) {
			local32 = arg0.method5028();
			this.anIntArray242 = new int[local32];
			for (local34 = 0; local34 < local32; local34++) {
				this.anIntArray242[local34] = arg0.method5028();
			}
			this.anIntArray244 = new int[local32];
			for (local157 = 0; local157 < local32; local157++) {
				this.anIntArray244[local157] = arg0.method5028();
			}
			for (local176 = 0; local176 < local32; local176++) {
				this.anIntArray244[local176] = (arg0.method5028() << 16) + this.anIntArray244[local176];
			}
		} else if (arg1 == 2) {
			this.anInt2995 = arg0.method5028();
		} else if (arg1 == 3) {
			this.aBooleanArray16 = new boolean[256];
			local32 = arg0.method5007();
			for (local34 = 0; local34 < local32; local34++) {
				this.aBooleanArray16[arg0.method5007()] = true;
			}
		} else if (arg1 == 4) {
			this.aBoolean221 = true;
		} else if (arg1 == 5) {
			this.anInt2999 = arg0.method5007();
		} else if (arg1 == 6) {
			this.anInt3005 = arg0.method5028();
		} else if (arg1 == 7) {
			this.anInt2996 = arg0.method5028();
		} else if (arg1 == 8) {
			this.anInt3004 = arg0.method5007();
		} else if (arg1 == 9) {
			this.anInt3010 = arg0.method5007();
		} else if (arg1 == 10) {
			this.anInt3007 = arg0.method5007();
		} else if (arg1 == 11) {
			this.anInt3012 = arg0.method5007();
		} else if (arg1 == 12) {
			local32 = arg0.method5007();
			this.anIntArray241 = new int[local32];
			for (local34 = 0; local34 < local32; local34++) {
				this.anIntArray241[local34] = arg0.method5028();
			}
			for (local157 = 0; local157 < local32; local157++) {
				this.anIntArray241[local157] = (arg0.method5028() << 16) + this.anIntArray241[local157];
			}
		} else if (arg1 == 13) {
			local32 = arg0.method5028();
			this.anIntArrayArray36 = new int[local32][];
			for (local34 = 0; local34 < local32; local34++) {
				local157 = arg0.method5007();
				if (local157 > 0) {
					this.anIntArrayArray36[local34] = new int[local157];
					this.anIntArrayArray36[local34][0] = arg0.method5008();
					for (local176 = 1; local176 < local157; local176++) {
						this.anIntArrayArray36[local34][local176] = arg0.method5028();
					}
				}
			}
		} else if (arg1 == 14) {
			this.aBoolean222 = true;
			return;
		} else if (arg1 == 15) {
			this.aBoolean223 = true;
			return;
		} else if (arg1 == 16) {
			this.aBoolean220 = true;
			return;
		}
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(ZIII)I")
	public int method2293(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(5) int local5 = 0;
		@Pc(7) int local7 = 0;
		@Pc(18) int local18 = this.anIntArray244[arg1];
		@Pc(20) Class4_Sub2_Sub6 local20 = null;
		@Pc(28) Class4_Sub2_Sub6 local28 = this.aClass125_1.method2383(local18 >> 16);
		@Pc(32) int local32 = local18 & 0xFFFF;
		if (local28 == null) {
			return 0;
		}
		if ((this.aBoolean223 || Static272.aBoolean335) && arg2 != -1 && this.anIntArray244.length > arg2) {
			local7 = this.anIntArray244[arg2];
			local20 = this.aClass125_1.method2383(local7 >> 16);
			local7 &= 0xFFFF;
		}
		if (this.aBoolean222) {
			local5 = 512;
		}
		if (local28.method783(local32)) {
			local5 |= 0x80;
		}
		if (local28.method781(local32)) {
			local5 |= 0x100;
		}
		if (local28.method780(local32)) {
			local5 |= 0x400;
		}
		if (local20 != null) {
			if (local20.method783(local7)) {
				local5 |= 0x80;
			}
			if (local20.method781(local7)) {
				local5 |= 0x100;
			}
			if (local20.method780(local7)) {
				local5 |= 0x400;
			}
		}
		if (this.anIntArray241 != null && arg0) {
			@Pc(156) int local156;
			@Pc(169) Class4_Sub2_Sub6 local169;
			if (arg1 < this.anIntArray241.length) {
				local156 = this.anIntArray241[arg1];
				if (local156 != 65535) {
					local169 = this.aClass125_1.method2383(local156 >> 16);
					local156 &= 0xFFFF;
					if (local169 != null) {
						if (local169.method783(local156)) {
							local5 |= 0x80;
						}
						if (local169.method781(local156)) {
							local5 |= 0x100;
						}
						if (local169.method780(local156)) {
							local5 |= 0x400;
						}
					}
				}
			}
			if ((this.aBoolean223 || Static272.aBoolean335) && arg2 != -1 && this.anIntArray241.length > arg2) {
				local156 = this.anIntArray241[arg2];
				if (local156 != 65535) {
					local169 = this.aClass125_1.method2383(local156 >> 16);
					local156 &= 0xFFFF;
					if (local169 != null) {
						if (local169.method783(local156)) {
							local5 |= 0x80;
						}
						if (local169.method781(local156)) {
							local5 |= 0x100;
						}
						if (local169.method780(local156)) {
							local5 |= 0x400;
						}
					}
				}
			}
		}
		return local5 | 0x20;
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(BIIBIIILclient!t;)Lclient!t;")
	public Class116 method2295(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class116 arg6) {
		@Pc(16) int local16 = this.anIntArray242[arg4];
		@Pc(21) int local21 = this.anIntArray244[arg4];
		@Pc(29) Class4_Sub2_Sub6 local29 = this.aClass125_1.method2383(local21 >> 16);
		@Pc(33) int local33 = local21 & 0xFFFF;
		if (local29 == null) {
			return arg6.method3123(arg2, arg1, true);
		}
		@Pc(43) Class4_Sub2_Sub6 local43 = null;
		if ((this.aBoolean223 || Static272.aBoolean335) && arg3 != -1 && this.anIntArray244.length > arg3) {
			@Pc(65) int local65 = this.anIntArray244[arg3];
			local43 = this.aClass125_1.method2383(local65 >> 16);
			arg3 = local65 & 0xFFFF;
		}
		if (this.aBoolean222) {
			arg1 |= 0x200;
		}
		if (local29.method783(local33)) {
			arg1 |= 0x80;
		}
		if (local29.method781(local33)) {
			arg1 |= 0x100;
		}
		if (local29.method780(local33)) {
			arg1 |= 0x400;
		}
		if (local43 != null) {
			if (local43.method783(arg3)) {
				arg1 |= 0x80;
			}
			if (local43.method781(arg3)) {
				arg1 |= 0x100;
			}
			if (local43.method780(arg3)) {
				arg1 |= 0x400;
			}
		}
		arg1 |= 0x20;
		@Pc(150) Class116 local150 = arg6.method3123(arg2, arg1, true);
		local150.method3109(this.aBoolean222, local29, arg5 - 1, local43, arg3, arg0, local33, local16);
		return local150;
	}

	@OriginalMember(owner = "client!id", name = "b", descriptor = "(I)V")
	public void method2296() {
		if (this.anInt3007 == -1) {
			if (this.aBooleanArray16 == null) {
				this.anInt3007 = 0;
			} else {
				this.anInt3007 = 2;
			}
		}
		if (this.anInt3010 != -1) {
			return;
		}
		if (this.aBooleanArray16 == null) {
			this.anInt3010 = 0;
		} else {
			this.anInt3010 = 2;
		}
	}
}
