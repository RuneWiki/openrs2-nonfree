import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lo")
public final class Class121 {

	@OriginalMember(owner = "client!lo", name = "d", descriptor = "[Z")
	public boolean[] aBooleanArray20;

	@OriginalMember(owner = "client!lo", name = "i", descriptor = "I")
	public int anInt3771;

	@OriginalMember(owner = "client!lo", name = "l", descriptor = "[I")
	public int[] anIntArray444;

	@OriginalMember(owner = "client!lo", name = "p", descriptor = "[I")
	private int[] anIntArray445;

	@OriginalMember(owner = "client!lo", name = "t", descriptor = "[[I")
	public int[][] anIntArrayArray37;

	@OriginalMember(owner = "client!lo", name = "A", descriptor = "[I")
	public int[] anIntArray446;

	@OriginalMember(owner = "client!lo", name = "n", descriptor = "Z")
	public boolean aBoolean320 = false;

	@OriginalMember(owner = "client!lo", name = "j", descriptor = "I")
	public int anInt3772 = 5;

	@OriginalMember(owner = "client!lo", name = "q", descriptor = "I")
	public int anInt3776 = -1;

	@OriginalMember(owner = "client!lo", name = "k", descriptor = "I")
	public int anInt3773 = 99;

	@OriginalMember(owner = "client!lo", name = "s", descriptor = "I")
	public int anInt3778 = -1;

	@OriginalMember(owner = "client!lo", name = "r", descriptor = "I")
	public int anInt3777 = -1;

	@OriginalMember(owner = "client!lo", name = "e", descriptor = "Z")
	public boolean aBoolean319 = false;

	@OriginalMember(owner = "client!lo", name = "g", descriptor = "I")
	public int anInt3769 = -1;

	@OriginalMember(owner = "client!lo", name = "m", descriptor = "I")
	public int anInt3774 = -1;

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "Z")
	public boolean aBoolean318 = false;

	@OriginalMember(owner = "client!lo", name = "v", descriptor = "I")
	public int anInt3780 = 2;

	@OriginalMember(owner = "client!lo", name = "z", descriptor = "Z")
	public boolean aBoolean321 = false;

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(Z)V")
	public void method3555() {
		if (this.anInt3778 == -1) {
			if (this.aBooleanArray20 == null) {
				this.anInt3778 = 0;
			} else {
				this.anInt3778 = 2;
			}
		}
		if (this.anInt3776 != -1) {
			return;
		}
		if (this.aBooleanArray20 == null) {
			this.anInt3776 = 0;
		} else {
			this.anInt3776 = 2;
		}
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(Lclient!eb;II)V")
	private void method3556(@OriginalArg(0) Class1_Sub7 arg0, @OriginalArg(2) int arg1) {
		@Pc(17) int local17;
		@Pc(23) int local23;
		@Pc(46) int local46;
		@Pc(65) int local65;
		if (arg1 == 1) {
			local17 = arg0.method3115();
			this.anIntArray444 = new int[local17];
			for (local23 = 0; local23 < local17; local23++) {
				this.anIntArray444[local23] = arg0.method3115();
			}
			this.anIntArray446 = new int[local17];
			for (local46 = 0; local46 < local17; local46++) {
				this.anIntArray446[local46] = arg0.method3115();
			}
			for (local65 = 0; local65 < local17; local65++) {
				this.anIntArray446[local65] = (arg0.method3115() << 16) + this.anIntArray446[local65];
			}
		} else if (arg1 == 2) {
			this.anInt3769 = arg0.method3115();
		} else if (arg1 == 3) {
			this.aBooleanArray20 = new boolean[256];
			local17 = arg0.method3141();
			for (local23 = 0; local23 < local17; local23++) {
				this.aBooleanArray20[arg0.method3141()] = true;
			}
		} else if (arg1 == 4) {
			this.aBoolean319 = true;
		} else if (arg1 == 5) {
			this.anInt3772 = arg0.method3141();
		} else if (arg1 == 6) {
			this.anInt3777 = arg0.method3115();
		} else if (arg1 == 7) {
			this.anInt3774 = arg0.method3115();
		} else if (arg1 == 8) {
			this.anInt3773 = arg0.method3141();
		} else if (arg1 == 9) {
			this.anInt3776 = arg0.method3141();
		} else if (arg1 == 10) {
			this.anInt3778 = arg0.method3141();
		} else if (arg1 == 11) {
			this.anInt3780 = arg0.method3141();
		} else if (arg1 == 12) {
			local17 = arg0.method3141();
			this.anIntArray445 = new int[local17];
			for (local23 = 0; local23 < local17; local23++) {
				this.anIntArray445[local23] = arg0.method3115();
			}
			for (local46 = 0; local46 < local17; local46++) {
				this.anIntArray445[local46] += arg0.method3115() << 16;
			}
		} else if (arg1 == 13) {
			local17 = arg0.method3115();
			this.anIntArrayArray37 = new int[local17][];
			for (local23 = 0; local23 < local17; local23++) {
				local46 = arg0.method3141();
				if (local46 > 0) {
					this.anIntArrayArray37[local23] = new int[local46];
					this.anIntArrayArray37[local23][0] = arg0.method3137();
					for (local65 = 1; local65 < local46; local65++) {
						this.anIntArrayArray37[local23][local65] = arg0.method3115();
					}
				}
			}
		} else if (arg1 == 14) {
			this.aBoolean318 = true;
		} else if (arg1 == 15) {
			this.aBoolean321 = true;
		} else if (arg1 == 16) {
			this.aBoolean320 = true;
			return;
		}
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(BLclient!eb;)V")
	public void method3557(@OriginalArg(1) Class1_Sub7 arg0) {
		while (true) {
			@Pc(17) int local17 = arg0.method3141();
			if (local17 == 0) {
				return;
			}
			this.method3556(arg0, local17);
		}
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(BIIIILclient!hc;II)Lclient!hc;")
	public Class78 method3558(@OriginalArg(0) byte arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class78 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(8) int local8 = this.anIntArray444[arg5];
		@Pc(13) int local13 = this.anIntArray446[arg5];
		@Pc(19) Class1_Sub1_Sub3 local19 = Static210.method3849(local13 >> 16);
		@Pc(31) int local31 = local13 & 0xFFFF;
		if (local19 == null) {
			return arg4.method4394((byte) 1, arg3, true);
		}
		@Pc(41) Class1_Sub1_Sub3 local41 = null;
		if ((this.aBoolean321 || Static334.aBoolean559) && arg6 != -1 && arg6 < this.anIntArray446.length) {
			@Pc(64) int local64 = this.anIntArray446[arg6];
			local41 = Static210.method3849(local64 >> 16);
			arg6 = local64 & 0xFFFF;
		}
		if (this.aBoolean318) {
			arg3 |= 0x200;
		}
		if (local19.method818(local31)) {
			arg3 |= 0x80;
		}
		if (local19.method824(local31)) {
			arg3 |= 0x100;
		}
		if (local41 != null) {
			if (local41.method818(arg6)) {
				arg3 |= 0x80;
			}
			if (local41.method824(arg6)) {
				arg3 |= 0x100;
			}
		}
		arg3 |= 0x20;
		@Pc(131) Class78 local131 = arg4.method4394(arg0, arg3, true);
		local131.method4382(arg6, local31, local8, this.aBoolean318, local19, arg2, arg1 - 1, local41);
		return local131;
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(IBZI)I")
	public int method3559(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2) {
		@Pc(10) int local10 = 0;
		@Pc(12) int local12 = 0;
		@Pc(17) int local17 = this.anIntArray446[arg2];
		@Pc(19) Class1_Sub1_Sub3 local19 = null;
		@Pc(27) Class1_Sub1_Sub3 local27 = Static210.method3849(local17 >> 16);
		@Pc(31) int local31 = local17 & 0xFFFF;
		if (local27 == null) {
			return 0;
		}
		if ((this.aBoolean321 || Static334.aBoolean559) && arg0 != -1 && this.anIntArray446.length > arg0) {
			local12 = this.anIntArray446[arg0];
			local19 = Static210.method3849(local12 >> 16);
			local12 &= 0xFFFF;
		}
		if (this.aBoolean318) {
			local10 = 512;
		}
		if (local27.method818(local31)) {
			local10 |= 0x80;
		}
		if (local27.method824(local31)) {
			local10 |= 0x100;
		}
		if (local19 != null) {
			if (local19.method818(local12)) {
				local10 |= 0x80;
			}
			if (local19.method824(local12)) {
				local10 |= 0x100;
			}
		}
		if (this.anIntArray445 != null && arg1) {
			@Pc(130) int local130;
			@Pc(141) Class1_Sub1_Sub3 local141;
			if (arg2 < this.anIntArray445.length) {
				local130 = this.anIntArray445[arg2];
				if (local130 != 65535) {
					local141 = Static210.method3849(local130 >> 16);
					local130 &= 0xFFFF;
					if (local141 != null) {
						if (local141.method818(local130)) {
							local10 |= 0x80;
						}
						if (local141.method824(local130)) {
							local10 |= 0x100;
						}
					}
				}
			}
			if ((this.aBoolean321 || Static334.aBoolean559) && arg0 != -1 && arg0 < this.anIntArray445.length) {
				local130 = this.anIntArray445[arg0];
				if (local130 != 65535) {
					local141 = Static210.method3849(local130 >> 16);
					local130 &= 0xFFFF;
					if (local141 != null) {
						if (local141.method818(local130)) {
							local10 |= 0x80;
						}
						if (local141.method824(local130)) {
							local10 |= 0x100;
						}
					}
				}
			}
		}
		return local10 | 0x20;
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(Lclient!hc;IIIBI)Lclient!hc;")
	public Class78 method3560(@OriginalArg(0) Class78 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(8) int local8 = this.anIntArray444[arg4];
		@Pc(13) int local13 = this.anIntArray446[arg4];
		@Pc(19) Class1_Sub1_Sub3 local19 = Static210.method3849(local13 >> 16);
		@Pc(23) int local23 = local13 & 0xFFFF;
		if (local19 == null) {
			return arg0.method4394((byte) 1, arg1, true);
		}
		@Pc(33) Class1_Sub1_Sub3 local33 = null;
		if ((this.aBoolean321 || Static334.aBoolean559) && arg2 != -1 && arg2 < this.anIntArray446.length) {
			@Pc(56) int local56 = this.anIntArray446[arg2];
			local33 = Static210.method3849(local56 >> 16);
			arg2 = local56 & 0xFFFF;
		}
		@Pc(76) Class1_Sub1_Sub3 local76 = null;
		@Pc(78) Class1_Sub1_Sub3 local78 = null;
		@Pc(80) int local80 = 0;
		@Pc(82) int local82 = 0;
		if (this.anIntArray445 != null) {
			if (this.anIntArray445.length > arg4) {
				local80 = this.anIntArray445[arg4];
				if (local80 != 65535) {
					local76 = Static210.method3849(local80 >> 16);
					local80 &= 0xFFFF;
				}
			}
			if ((this.aBoolean321 || Static334.aBoolean559) && arg2 != -1 && arg2 < this.anIntArray445.length) {
				local82 = this.anIntArray445[arg2];
				if (local82 != 65535) {
					local78 = Static210.method3849(local82 >> 16);
					local82 &= 0xFFFF;
				}
			}
		}
		if (this.aBoolean318) {
			arg1 |= 0x200;
		}
		if (local19.method818(local23)) {
			arg1 |= 0x80;
		}
		if (local19.method824(local23)) {
			arg1 |= 0x100;
		}
		if (local76 != null) {
			if (local76.method818(local80)) {
				arg1 |= 0x80;
			}
			if (local76.method824(local80)) {
				arg1 |= 0x100;
			}
		}
		if (local33 != null) {
			if (local33.method818(arg2)) {
				arg1 |= 0x80;
			}
			if (local33.method824(arg2)) {
				arg1 |= 0x100;
			}
		}
		if (local78 != null) {
			if (local78.method818(local82)) {
				arg1 |= 0x80;
			}
			if (local78.method824(local82)) {
				arg1 |= 0x100;
			}
		}
		arg1 |= 0x20;
		@Pc(246) Class78 local246 = arg0.method4394((byte) 1, arg1, true);
		local246.method4382(arg2, local23, local8, this.aBoolean318, local19, 0, arg3 - 1, local33);
		if (local76 != null) {
			local246.method4382(local82, local80, local8, this.aBoolean318, local76, 0, arg3 - 1, local78);
		}
		return local246;
	}
}
