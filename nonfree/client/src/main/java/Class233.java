import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tq")
public final class Class233 {

	@OriginalMember(owner = "client!tq", name = "g", descriptor = "[I")
	private int[] anIntArray590;

	@OriginalMember(owner = "client!tq", name = "i", descriptor = "[[I")
	public int[][] anIntArrayArray61;

	@OriginalMember(owner = "client!tq", name = "m", descriptor = "[I")
	public int[] anIntArray591;

	@OriginalMember(owner = "client!tq", name = "t", descriptor = "Lclient!aj;")
	public Class10 aClass10_2;

	@OriginalMember(owner = "client!tq", name = "x", descriptor = "I")
	public int anInt6755;

	@OriginalMember(owner = "client!tq", name = "z", descriptor = "[Z")
	public boolean[] aBooleanArray26;

	@OriginalMember(owner = "client!tq", name = "F", descriptor = "[I")
	public int[] anIntArray593;

	@OriginalMember(owner = "client!tq", name = "d", descriptor = "I")
	public int anInt6743 = -1;

	@OriginalMember(owner = "client!tq", name = "j", descriptor = "I")
	public int anInt6746 = -1;

	@OriginalMember(owner = "client!tq", name = "c", descriptor = "Z")
	public boolean aBoolean449 = false;

	@OriginalMember(owner = "client!tq", name = "k", descriptor = "Z")
	public boolean aBoolean450 = false;

	@OriginalMember(owner = "client!tq", name = "u", descriptor = "I")
	public int anInt6752 = -1;

	@OriginalMember(owner = "client!tq", name = "w", descriptor = "I")
	public int anInt6754 = 5;

	@OriginalMember(owner = "client!tq", name = "b", descriptor = "I")
	public int anInt6742 = 2;

	@OriginalMember(owner = "client!tq", name = "f", descriptor = "I")
	public int anInt6744 = -1;

	@OriginalMember(owner = "client!tq", name = "y", descriptor = "I")
	public int anInt6756 = 99;

	@OriginalMember(owner = "client!tq", name = "r", descriptor = "Z")
	public boolean aBoolean451 = false;

	@OriginalMember(owner = "client!tq", name = "C", descriptor = "I")
	public int anInt6757 = -1;

	@OriginalMember(owner = "client!tq", name = "A", descriptor = "Z")
	public boolean aBoolean452 = false;

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(IIBILclient!c;I)Lclient!c;")
	public Class7 method5242(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class7 arg3, @OriginalArg(5) int arg4) {
		@Pc(8) int local8 = this.anIntArray591[arg4];
		@Pc(13) int local13 = this.anIntArray593[arg4];
		@Pc(21) Class4_Sub1_Sub12 local21 = this.aClass10_2.method288(local13 >> 16);
		@Pc(25) int local25 = local13 & 0xFFFF;
		if (local21 == null) {
			return arg3.method4077((byte) 1, arg1, true);
		}
		@Pc(35) Class4_Sub1_Sub12 local35 = null;
		if ((this.aBoolean450 || Static218.aBoolean291) && arg0 != -1 && this.anIntArray593.length > arg0) {
			@Pc(57) int local57 = this.anIntArray593[arg0];
			local35 = this.aClass10_2.method288(local57 >> 16);
			arg0 = local57 & 0xFFFF;
		}
		@Pc(71) Class4_Sub1_Sub12 local71 = null;
		@Pc(79) Class4_Sub1_Sub12 local79 = null;
		@Pc(81) int local81 = 0;
		@Pc(83) int local83 = 0;
		if (this.anIntArray590 != null) {
			if (arg4 < this.anIntArray590.length) {
				local81 = this.anIntArray590[arg4];
				if (local81 != 65535) {
					local71 = this.aClass10_2.method288(local81 >> 16);
					local81 &= 0xFFFF;
				}
			}
			if ((this.aBoolean450 || Static218.aBoolean291) && arg0 != -1 && this.anIntArray590.length > arg0) {
				local83 = this.anIntArray590[arg0];
				if (local83 != 65535) {
					local79 = this.aClass10_2.method288(local83 >> 16);
					local83 &= 0xFFFF;
				}
			}
		}
		if (this.aBoolean452) {
			arg1 |= 0x200;
		}
		if (local21.method3628(local25)) {
			arg1 |= 0x80;
		}
		if (local21.method3625(local25)) {
			arg1 |= 0x100;
		}
		if (local21.method3627(local25)) {
			arg1 |= 0x400;
		}
		if (local71 != null) {
			if (local71.method3628(local81)) {
				arg1 |= 0x80;
			}
			if (local71.method3625(local81)) {
				arg1 |= 0x100;
			}
			if (local71.method3627(local81)) {
				arg1 |= 0x400;
			}
		}
		if (local35 != null) {
			if (local35.method3628(arg0)) {
				arg1 |= 0x80;
			}
			if (local35.method3625(arg0)) {
				arg1 |= 0x100;
			}
			if (local35.method3627(arg0)) {
				arg1 |= 0x400;
			}
		}
		if (local79 != null) {
			if (local79.method3628(local83)) {
				arg1 |= 0x80;
			}
			if (local79.method3625(local83)) {
				arg1 |= 0x100;
			}
			if (local79.method3627(local83)) {
				arg1 |= 0x400;
			}
		}
		arg1 |= 0x20;
		@Pc(284) Class7 local284 = arg3.method4077((byte) 1, arg1, true);
		local284.method4080(local8, 0, arg0, local25, this.aBoolean452, local21, arg2 - 1, local35);
		if (local71 != null) {
			local284.method4080(local8, 0, local83, local81, this.aBoolean452, local71, arg2 - 1, local79);
		}
		return local284;
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(Lclient!tl;II)V")
	private void method5244(@OriginalArg(0) Class4_Sub30 arg0, @OriginalArg(2) int arg1) {
		@Pc(30) int local30;
		@Pc(32) int local32;
		@Pc(134) int local134;
		@Pc(199) int local199;
		if (arg1 == 1) {
			local30 = arg0.method4877();
			this.anIntArray591 = new int[local30];
			for (local32 = 0; local32 < local30; local32++) {
				this.anIntArray591[local32] = arg0.method4877();
			}
			this.anIntArray593 = new int[local30];
			for (local134 = 0; local134 < local30; local134++) {
				this.anIntArray593[local134] = arg0.method4877();
			}
			for (local199 = 0; local199 < local30; local199++) {
				this.anIntArray593[local199] = (arg0.method4877() << 16) + this.anIntArray593[local199];
			}
		} else if (arg1 == 2) {
			this.anInt6743 = arg0.method4877();
		} else if (arg1 == 3) {
			this.aBooleanArray26 = new boolean[256];
			local30 = arg0.method4864();
			for (local32 = 0; local32 < local30; local32++) {
				this.aBooleanArray26[arg0.method4864()] = true;
			}
		} else if (arg1 == 4) {
			this.aBoolean449 = true;
		} else if (arg1 == 5) {
			this.anInt6754 = arg0.method4864();
		} else if (arg1 == 6) {
			this.anInt6746 = arg0.method4877();
		} else if (arg1 == 7) {
			this.anInt6757 = arg0.method4877();
		} else if (arg1 == 8) {
			this.anInt6756 = arg0.method4864();
		} else if (arg1 == 9) {
			this.anInt6752 = arg0.method4864();
		} else if (arg1 == 10) {
			this.anInt6744 = arg0.method4864();
		} else if (arg1 == 11) {
			this.anInt6742 = arg0.method4864();
		} else if (arg1 == 12) {
			local30 = arg0.method4864();
			this.anIntArray590 = new int[local30];
			for (local32 = 0; local32 < local30; local32++) {
				this.anIntArray590[local32] = arg0.method4877();
			}
			for (local134 = 0; local134 < local30; local134++) {
				this.anIntArray590[local134] += arg0.method4877() << 16;
			}
			return;
		} else if (arg1 == 13) {
			local30 = arg0.method4877();
			this.anIntArrayArray61 = new int[local30][];
			for (local32 = 0; local32 < local30; local32++) {
				local134 = arg0.method4864();
				if (local134 > 0) {
					this.anIntArrayArray61[local32] = new int[local134];
					this.anIntArrayArray61[local32][0] = arg0.method4887();
					for (local199 = 1; local199 < local134; local199++) {
						this.anIntArrayArray61[local32][local199] = arg0.method4877();
					}
				}
			}
			return;
		} else if (arg1 == 14) {
			this.aBoolean452 = true;
			return;
		} else if (arg1 == 15) {
			this.aBoolean450 = true;
			return;
		} else if (arg1 == 16) {
			this.aBoolean451 = true;
			return;
		}
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(BZII)I")
	public int method5246(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(5) int local5 = 0;
		@Pc(7) int local7 = 0;
		@Pc(12) int local12 = this.anIntArray593[arg1];
		@Pc(22) Class4_Sub1_Sub12 local22 = null;
		@Pc(30) Class4_Sub1_Sub12 local30 = this.aClass10_2.method288(local12 >> 16);
		@Pc(34) int local34 = local12 & 0xFFFF;
		if (local30 == null) {
			return 0;
		}
		if ((this.aBoolean450 || Static218.aBoolean291) && arg2 != -1 && arg2 < this.anIntArray593.length) {
			local7 = this.anIntArray593[arg2];
			local22 = this.aClass10_2.method288(local7 >> 16);
			local7 &= 0xFFFF;
		}
		if (this.aBoolean452) {
			local5 = 512;
		}
		if (local30.method3628(local34)) {
			local5 |= 0x80;
		}
		if (local30.method3625(local34)) {
			local5 |= 0x100;
		}
		if (local30.method3627(local34)) {
			local5 |= 0x400;
		}
		if (local22 != null) {
			if (local22.method3628(local7)) {
				local5 |= 0x80;
			}
			if (local22.method3625(local7)) {
				local5 |= 0x100;
			}
			if (local22.method3627(local7)) {
				local5 |= 0x400;
			}
		}
		if (this.anIntArray590 != null && arg0) {
			@Pc(146) int local146;
			@Pc(159) Class4_Sub1_Sub12 local159;
			if (this.anIntArray590.length > arg1) {
				local146 = this.anIntArray590[arg1];
				if (local146 != 65535) {
					local159 = this.aClass10_2.method288(local146 >> 16);
					local146 &= 0xFFFF;
					if (local159 != null) {
						if (local159.method3628(local146)) {
							local5 |= 0x80;
						}
						if (local159.method3625(local146)) {
							local5 |= 0x100;
						}
						if (local159.method3627(local146)) {
							local5 |= 0x400;
						}
					}
				}
			}
			if ((this.aBoolean450 || Static218.aBoolean291) && arg2 != -1 && this.anIntArray590.length > arg2) {
				local146 = this.anIntArray590[arg2];
				if (local146 != 65535) {
					local159 = this.aClass10_2.method288(local146 >> 16);
					local146 &= 0xFFFF;
					if (local159 != null) {
						if (local159.method3628(local146)) {
							local5 |= 0x80;
						}
						if (local159.method3625(local146)) {
							local5 |= 0x100;
						}
						if (local159.method3627(local146)) {
							local5 |= 0x400;
						}
					}
				}
			}
		}
		return local5 | 0x20;
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(I)V")
	public void method5247() {
		if (this.anInt6744 == -1) {
			if (this.aBooleanArray26 == null) {
				this.anInt6744 = 0;
			} else {
				this.anInt6744 = 2;
			}
		}
		if (this.anInt6752 != -1) {
			return;
		}
		if (this.aBooleanArray26 == null) {
			this.anInt6752 = 0;
		} else {
			this.anInt6752 = 2;
		}
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(ILclient!tl;)V")
	public void method5248(@OriginalArg(1) Class4_Sub30 arg0) {
		while (true) {
			@Pc(21) int local21 = arg0.method4864();
			if (local21 == 0) {
				return;
			}
			this.method5244(arg0, local21);
		}
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(Lclient!c;IIIIBII)Lclient!c;")
	public Class7 method5249(@OriginalArg(0) Class7 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) byte arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(8) int local8 = this.anIntArray591[arg6];
		@Pc(13) int local13 = this.anIntArray593[arg6];
		@Pc(21) Class4_Sub1_Sub12 local21 = this.aClass10_2.method288(local13 >> 16);
		@Pc(25) int local25 = local13 & 0xFFFF;
		if (local21 == null) {
			return arg0.method4077(arg4, arg5, true);
		}
		@Pc(35) Class4_Sub1_Sub12 local35 = null;
		if ((this.aBoolean450 || Static218.aBoolean291) && arg3 != -1 && arg3 < this.anIntArray593.length) {
			@Pc(57) int local57 = this.anIntArray593[arg3];
			local35 = this.aClass10_2.method288(local57 >> 16);
			arg3 = local57 & 0xFFFF;
		}
		if (this.aBoolean452) {
			arg5 |= 0x200;
		}
		if (local21.method3628(local25)) {
			arg5 |= 0x80;
		}
		if (local21.method3625(local25)) {
			arg5 |= 0x100;
		}
		if (local21.method3627(local25)) {
			arg5 |= 0x400;
		}
		if (local35 != null) {
			if (local35.method3628(arg3)) {
				arg5 |= 0x80;
			}
			if (local35.method3625(arg3)) {
				arg5 |= 0x100;
			}
			if (local35.method3627(arg3)) {
				arg5 |= 0x400;
			}
		}
		arg5 |= 0x20;
		@Pc(151) Class7 local151 = arg0.method4077(arg4, arg5, true);
		local151.method4080(local8, arg1, arg3, local25, this.aBoolean452, local21, arg2 - 1, local35);
		return local151;
	}
}
