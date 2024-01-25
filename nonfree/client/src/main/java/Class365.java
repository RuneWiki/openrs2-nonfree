import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wt")
public final class Class365 {

	@OriginalMember(owner = "client!wt", name = "c", descriptor = "I")
	public int anInt10214;

	@OriginalMember(owner = "client!wt", name = "h", descriptor = "Lclient!cf;")
	public Class48 aClass48_2;

	@OriginalMember(owner = "client!wt", name = "j", descriptor = "[I")
	private int[] anIntArray550;

	@OriginalMember(owner = "client!wt", name = "m", descriptor = "[I")
	public int[] anIntArray551;

	@OriginalMember(owner = "client!wt", name = "r", descriptor = "[[I")
	public int[][] anIntArrayArray59;

	@OriginalMember(owner = "client!wt", name = "x", descriptor = "[Z")
	public boolean[] aBooleanArray27;

	@OriginalMember(owner = "client!wt", name = "z", descriptor = "[I")
	public int[] anIntArray552;

	@OriginalMember(owner = "client!wt", name = "A", descriptor = "[I")
	public int[] anIntArray553;

	@OriginalMember(owner = "client!wt", name = "B", descriptor = "[I")
	public int[] anIntArray554;

	@OriginalMember(owner = "client!wt", name = "F", descriptor = "[I")
	public int[] anIntArray555;

	@OriginalMember(owner = "client!wt", name = "b", descriptor = "Z")
	public boolean aBoolean721 = false;

	@OriginalMember(owner = "client!wt", name = "k", descriptor = "I")
	public int anInt10219 = -1;

	@OriginalMember(owner = "client!wt", name = "o", descriptor = "I")
	public int anInt10222 = 99;

	@OriginalMember(owner = "client!wt", name = "n", descriptor = "I")
	public int anInt10221 = 2;

	@OriginalMember(owner = "client!wt", name = "d", descriptor = "Z")
	public boolean aBoolean722 = false;

	@OriginalMember(owner = "client!wt", name = "g", descriptor = "I")
	public int anInt10217 = -1;

	@OriginalMember(owner = "client!wt", name = "i", descriptor = "I")
	public int anInt10218 = 5;

	@OriginalMember(owner = "client!wt", name = "p", descriptor = "Z")
	public boolean aBoolean723 = false;

	@OriginalMember(owner = "client!wt", name = "s", descriptor = "Z")
	public boolean aBoolean724 = false;

	@OriginalMember(owner = "client!wt", name = "w", descriptor = "I")
	public int anInt10227 = -1;

	@OriginalMember(owner = "client!wt", name = "t", descriptor = "I")
	public int anInt10224 = -1;

	@OriginalMember(owner = "client!wt", name = "v", descriptor = "I")
	public int anInt10226 = -1;

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(ILclient!da;IZII)Lclient!da;")
	public Class57 method8357(@OriginalArg(0) int arg0, @OriginalArg(1) Class57 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(13) int local13 = this.anIntArray552[arg3];
		@Pc(18) int local18 = this.anIntArray551[arg3];
		@Pc(26) Class4_Sub5_Sub2 local26 = this.aClass48_2.method1013(local18 >> 16);
		@Pc(30) int local30 = local18 & 0xFFFF;
		if (local26 == null) {
			return arg1.method7912((byte) 1, arg0, true);
		}
		@Pc(40) Class4_Sub5_Sub2 local40 = null;
		if ((this.aBoolean721 || Static115.aBoolean196) && arg4 != -1 && this.anIntArray551.length > arg4) {
			@Pc(62) int local62 = this.anIntArray551[arg4];
			local40 = this.aClass48_2.method1013(local62 >> 16);
			arg4 = local62 & 0xFFFF;
		}
		@Pc(76) Class4_Sub5_Sub2 local76 = null;
		@Pc(78) Class4_Sub5_Sub2 local78 = null;
		@Pc(80) int local80 = 0;
		@Pc(82) int local82 = 0;
		if (this.anIntArray550 != null) {
			if (arg3 < this.anIntArray550.length) {
				local80 = this.anIntArray550[arg3];
				if (local80 != 65535) {
					local76 = this.aClass48_2.method1013(local80 >> 16);
					local80 &= 0xFFFF;
				}
			}
			if ((this.aBoolean721 || Static115.aBoolean196) && arg4 != -1 && this.anIntArray550.length > arg4) {
				local82 = this.anIntArray550[arg4];
				if (local82 != 65535) {
					local78 = this.aClass48_2.method1013(local82 >> 16);
					local82 &= 0xFFFF;
				}
			}
		}
		if (this.aBoolean723) {
			arg0 |= 0x200;
		}
		if (local26.method446(local30)) {
			arg0 |= 0x80;
		}
		if (local26.method445(local30)) {
			arg0 |= 0x100;
		}
		if (local26.method442(local30)) {
			arg0 |= 0x400;
		}
		if (local76 != null) {
			if (local76.method446(local80)) {
				arg0 |= 0x80;
			}
			if (local76.method445(local80)) {
				arg0 |= 0x100;
			}
			if (local76.method442(local80)) {
				arg0 |= 0x400;
			}
		}
		if (local40 != null) {
			if (local40.method446(arg4)) {
				arg0 |= 0x80;
			}
			if (local40.method445(arg4)) {
				arg0 |= 0x100;
			}
			if (local40.method442(arg4)) {
				arg0 |= 0x400;
			}
		}
		if (local78 != null) {
			if (local78.method446(local82)) {
				arg0 |= 0x80;
			}
			if (local78.method445(local82)) {
				arg0 |= 0x100;
			}
			if (local78.method442(local82)) {
				arg0 |= 0x400;
			}
		}
		arg0 |= 0x20;
		@Pc(281) Class57 local281 = arg1.method7912((byte) 1, arg0, true);
		local281.method7925(this.aBoolean723, arg4, 0, local30, local26, local13, arg2 - 1, local40);
		if (local76 != null) {
			local281.method7925(this.aBoolean723, local82, 0, local80, local76, local13, arg2 - 1, local78);
		}
		return local281;
	}

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(ZIII)I")
	public int method8358(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(5) int local5 = 0;
		@Pc(7) int local7 = 0;
		@Pc(12) int local12 = this.anIntArray551[arg1];
		@Pc(14) Class4_Sub5_Sub2 local14 = null;
		@Pc(22) Class4_Sub5_Sub2 local22 = this.aClass48_2.method1013(local12 >> 16);
		@Pc(34) int local34 = local12 & 0xFFFF;
		if (local22 == null) {
			return 0;
		}
		if ((this.aBoolean721 || Static115.aBoolean196) && arg2 != -1 && this.anIntArray551.length > arg2) {
			local7 = this.anIntArray551[arg2];
			local14 = this.aClass48_2.method1013(local7 >> 16);
			local7 &= 0xFFFF;
		}
		if (this.aBoolean723) {
			local5 = 512;
		}
		if (local22.method446(local34)) {
			local5 |= 0x80;
		}
		if (local22.method445(local34)) {
			local5 |= 0x100;
		}
		if (local22.method442(local34)) {
			local5 |= 0x400;
		}
		if (local14 != null) {
			if (local14.method446(local7)) {
				local5 |= 0x80;
			}
			if (local14.method445(local7)) {
				local5 |= 0x100;
			}
			if (local14.method442(local7)) {
				local5 |= 0x400;
			}
		}
		if (this.anIntArray550 != null && arg0) {
			@Pc(151) int local151;
			@Pc(162) Class4_Sub5_Sub2 local162;
			if (this.anIntArray550.length > arg1) {
				local151 = this.anIntArray550[arg1];
				if (local151 != 65535) {
					local162 = this.aClass48_2.method1013(local151 >> 16);
					local151 &= 0xFFFF;
					if (local162 != null) {
						if (local162.method446(local151)) {
							local5 |= 0x80;
						}
						if (local162.method445(local151)) {
							local5 |= 0x100;
						}
						if (local162.method442(local151)) {
							local5 |= 0x400;
						}
					}
				}
			}
			if ((this.aBoolean721 || Static115.aBoolean196) && arg2 != -1 && this.anIntArray550.length > arg2) {
				local151 = this.anIntArray550[arg2];
				if (local151 != 65535) {
					local162 = this.aClass48_2.method1013(local151 >> 16);
					local151 &= 0xFFFF;
					if (local162 != null) {
						if (local162.method446(local151)) {
							local5 |= 0x80;
						}
						if (local162.method445(local151)) {
							local5 |= 0x100;
						}
						if (local162.method442(local151)) {
							local5 |= 0x400;
						}
					}
				}
			}
		}
		return local5 | 0x20;
	}

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(Lclient!un;I)V")
	public void method8359(@OriginalArg(0) Class4_Sub11 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method4905();
			if (local9 == 0) {
				return;
			}
			this.method8360(local9, arg0);
		}
	}

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(IBLclient!un;)V")
	private void method8360(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub11 arg1) {
		@Pc(12) int local12;
		@Pc(18) int local18;
		@Pc(41) int local41;
		@Pc(56) int local56;
		if (arg0 == 1) {
			local12 = arg1.method4936();
			this.anIntArray552 = new int[local12];
			for (local18 = 0; local18 < local12; local18++) {
				this.anIntArray552[local18] = arg1.method4936();
			}
			this.anIntArray551 = new int[local12];
			for (local41 = 0; local41 < local12; local41++) {
				this.anIntArray551[local41] = arg1.method4936();
			}
			for (local56 = 0; local56 < local12; local56++) {
				this.anIntArray551[local56] = (arg1.method4936() << 16) + this.anIntArray551[local56];
			}
		} else if (arg0 == 2) {
			this.anInt10217 = arg1.method4936();
		} else if (arg0 == 3) {
			this.aBooleanArray27 = new boolean[256];
			local12 = arg1.method4905();
			for (local18 = 0; local18 < local12; local18++) {
				this.aBooleanArray27[arg1.method4905()] = true;
			}
		} else if (arg0 == 5) {
			this.anInt10218 = arg1.method4905();
		} else if (arg0 == 6) {
			this.anInt10227 = arg1.method4936();
		} else if (arg0 == 7) {
			this.anInt10224 = arg1.method4936();
		} else if (arg0 == 8) {
			this.anInt10222 = arg1.method4905();
		} else if (arg0 == 9) {
			this.anInt10219 = arg1.method4905();
		} else if (arg0 == 10) {
			this.anInt10226 = arg1.method4905();
		} else if (arg0 == 11) {
			this.anInt10221 = arg1.method4905();
		} else if (arg0 == 12) {
			local12 = arg1.method4905();
			this.anIntArray550 = new int[local12];
			for (local18 = 0; local18 < local12; local18++) {
				this.anIntArray550[local18] = arg1.method4936();
			}
			for (local41 = 0; local41 < local12; local41++) {
				this.anIntArray550[local41] = (arg1.method4936() << 16) + this.anIntArray550[local41];
			}
		} else if (arg0 == 13) {
			local12 = arg1.method4936();
			this.anIntArrayArray59 = new int[local12][];
			for (local18 = 0; local18 < local12; local18++) {
				local41 = arg1.method4905();
				if (local41 > 0) {
					this.anIntArrayArray59[local18] = new int[local41];
					this.anIntArrayArray59[local18][0] = arg1.method4934();
					for (local56 = 1; local56 < local41; local56++) {
						this.anIntArrayArray59[local18][local56] = arg1.method4936();
					}
				}
			}
		} else if (arg0 == 14) {
			this.aBoolean723 = true;
		} else if (arg0 == 15) {
			this.aBoolean721 = true;
		} else if (arg0 == 16) {
			this.aBoolean724 = true;
		} else if (arg0 == 18) {
			this.aBoolean722 = true;
		} else if (arg0 == 19) {
			if (this.anIntArray555 == null) {
				this.anIntArray555 = new int[this.anIntArrayArray59.length];
				for (local12 = 0; local12 < this.anIntArrayArray59.length; local12++) {
					this.anIntArray555[local12] = 255;
				}
			}
			this.anIntArray555[arg1.method4905()] = arg1.method4905();
		} else if (arg0 == 20) {
			if (this.anIntArray554 == null || this.anIntArray553 == null) {
				this.anIntArray554 = new int[this.anIntArrayArray59.length];
				this.anIntArray553 = new int[this.anIntArrayArray59.length];
				for (local12 = 0; local12 < this.anIntArrayArray59.length; local12++) {
					this.anIntArray554[local12] = 256;
					this.anIntArray553[local12] = 256;
				}
			}
			local12 = arg1.method4905();
			this.anIntArray554[local12] = arg1.method4936();
			this.anIntArray553[local12] = arg1.method4936();
		}
	}

	@OriginalMember(owner = "client!wt", name = "b", descriptor = "(I)V")
	public void method8363() {
		if (this.anInt10226 == -1) {
			if (this.aBooleanArray27 == null) {
				this.anInt10226 = 0;
			} else {
				this.anInt10226 = 2;
			}
		}
		if (this.anInt10219 != -1) {
			return;
		}
		if (this.aBooleanArray27 == null) {
			this.anInt10219 = 0;
		} else {
			this.anInt10219 = 2;
		}
	}

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(IIIZLclient!da;IBI)Lclient!da;")
	public Class57 method8364(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class57 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) byte arg5, @OriginalArg(7) int arg6) {
		@Pc(8) int local8 = this.anIntArray552[arg6];
		@Pc(13) int local13 = this.anIntArray551[arg6];
		@Pc(21) Class4_Sub5_Sub2 local21 = this.aClass48_2.method1013(local13 >> 16);
		@Pc(25) int local25 = local13 & 0xFFFF;
		if (local21 == null) {
			return arg3.method7912(arg5, arg2, true);
		}
		@Pc(35) Class4_Sub5_Sub2 local35 = null;
		if ((this.aBoolean721 || Static115.aBoolean196) && arg1 != -1 && arg1 < this.anIntArray551.length) {
			@Pc(53) int local53 = this.anIntArray551[arg1];
			local35 = this.aClass48_2.method1013(local53 >> 16);
			arg1 = local53 & 0xFFFF;
		}
		if (this.aBoolean723) {
			arg2 |= 0x200;
		}
		if (local21.method446(local25)) {
			arg2 |= 0x80;
		}
		if (local21.method445(local25)) {
			arg2 |= 0x100;
		}
		if (local21.method442(local25)) {
			arg2 |= 0x400;
		}
		if (local35 != null) {
			if (local35.method446(arg1)) {
				arg2 |= 0x80;
			}
			if (local35.method445(arg1)) {
				arg2 |= 0x100;
			}
			if (local35.method442(arg1)) {
				arg2 |= 0x400;
			}
		}
		arg2 |= 0x20;
		@Pc(145) Class57 local145 = arg3.method7912(arg5, arg2, true);
		local145.method7925(this.aBoolean723, arg1, arg0, local25, local21, local8, arg4 - 1, local35);
		return local145;
	}
}
