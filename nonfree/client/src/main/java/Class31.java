import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bj")
public final class Class31 {

	@OriginalMember(owner = "client!bj", name = "b", descriptor = "I")
	public int anInt918;

	@OriginalMember(owner = "client!bj", name = "i", descriptor = "[I")
	private int[] anIntArray67;

	@OriginalMember(owner = "client!bj", name = "l", descriptor = "[[I")
	public int[][] anIntArrayArray4;

	@OriginalMember(owner = "client!bj", name = "w", descriptor = "Lclient!eca;")
	public Class76 aClass76_1;

	@OriginalMember(owner = "client!bj", name = "x", descriptor = "[Z")
	public boolean[] aBooleanArray4;

	@OriginalMember(owner = "client!bj", name = "y", descriptor = "[I")
	public int[] anIntArray68;

	@OriginalMember(owner = "client!bj", name = "B", descriptor = "[I")
	public int[] anIntArray69;

	@OriginalMember(owner = "client!bj", name = "g", descriptor = "Z")
	public boolean aBoolean37 = false;

	@OriginalMember(owner = "client!bj", name = "e", descriptor = "I")
	public int anInt921 = 99;

	@OriginalMember(owner = "client!bj", name = "n", descriptor = "I")
	public int anInt927 = -1;

	@OriginalMember(owner = "client!bj", name = "h", descriptor = "I")
	public int anInt923 = 2;

	@OriginalMember(owner = "client!bj", name = "q", descriptor = "I")
	public int anInt930 = -1;

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "I")
	public int anInt917 = -1;

	@OriginalMember(owner = "client!bj", name = "p", descriptor = "I")
	public int anInt929 = 0;

	@OriginalMember(owner = "client!bj", name = "u", descriptor = "I")
	public int anInt934 = -1;

	@OriginalMember(owner = "client!bj", name = "s", descriptor = "I")
	public int anInt932 = -1;

	@OriginalMember(owner = "client!bj", name = "v", descriptor = "Z")
	public boolean aBoolean38 = false;

	@OriginalMember(owner = "client!bj", name = "t", descriptor = "I")
	public int anInt933 = 5;

	@OriginalMember(owner = "client!bj", name = "A", descriptor = "Z")
	public boolean aBoolean39 = false;

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(Lclient!r;IIBII)Lclient!r;")
	public Class36 method852(@OriginalArg(0) Class36 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(8) int local8 = this.anIntArray68[arg2];
		@Pc(13) int local13 = this.anIntArray69[arg2];
		@Pc(21) Class5_Sub2_Sub16 local21 = this.aClass76_1.method2153(local13 >> 16);
		@Pc(25) int local25 = local13 & 0xFFFF;
		if (local21 == null) {
			return arg0.method7356((byte) 1, arg4, true);
		}
		@Pc(35) Class5_Sub2_Sub16 local35 = null;
		if ((this.aBoolean37 || Static457.aBoolean567) && arg3 != -1 && this.anIntArray69.length > arg3) {
			@Pc(54) int local54 = this.anIntArray69[arg3];
			local35 = this.aClass76_1.method2153(local54 >> 16);
			arg3 = local54 & 0xFFFF;
		}
		@Pc(70) Class5_Sub2_Sub16 local70 = null;
		@Pc(72) Class5_Sub2_Sub16 local72 = null;
		@Pc(74) int local74 = 0;
		@Pc(76) int local76 = 0;
		if (this.anIntArray67 != null) {
			if (this.anIntArray67.length > arg2) {
				local74 = this.anIntArray67[arg2];
				if (local74 != 65535) {
					local70 = this.aClass76_1.method2153(local74 >> 16);
					local74 &= 0xFFFF;
				}
			}
			if ((this.aBoolean37 || Static457.aBoolean567) && arg3 != -1 && arg3 < this.anIntArray67.length) {
				local76 = this.anIntArray67[arg3];
				if (local76 != 65535) {
					local72 = this.aClass76_1.method2153(local76 >> 16);
					local76 &= 0xFFFF;
				}
			}
		}
		if (this.aBoolean39) {
			arg4 |= 0x200;
		}
		if (local21.method4953(local25)) {
			arg4 |= 0x80;
		}
		if (local21.method4957(local25)) {
			arg4 |= 0x100;
		}
		if (local21.method4954(local25)) {
			arg4 |= 0x400;
		}
		if (local70 != null) {
			if (local70.method4953(local74)) {
				arg4 |= 0x80;
			}
			if (local70.method4957(local74)) {
				arg4 |= 0x100;
			}
			if (local70.method4954(local74)) {
				arg4 |= 0x400;
			}
		}
		if (local35 != null) {
			if (local35.method4953(arg3)) {
				arg4 |= 0x80;
			}
			if (local35.method4957(arg3)) {
				arg4 |= 0x100;
			}
			if (local35.method4954(arg3)) {
				arg4 |= 0x400;
			}
		}
		if (local72 != null) {
			if (local72.method4953(local76)) {
				arg4 |= 0x80;
			}
			if (local72.method4957(local76)) {
				arg4 |= 0x100;
			}
			if (local72.method4954(local76)) {
				arg4 |= 0x400;
			}
		}
		arg4 |= 0x20;
		@Pc(283) Class36 local283 = arg0.method7356((byte) 1, arg4, true);
		local283.method7348(0, arg3, local35, local25, arg1 - 1, local21, this.aBoolean39, local8);
		if (local70 != null) {
			local283.method7348(0, local76, local72, local74, arg1 - 1, local70, this.aBoolean39, local8);
		}
		return local283;
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(IZII)I")
	public int method853(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(5) int local5 = 0;
		@Pc(7) int local7 = 0;
		@Pc(12) int local12 = this.anIntArray69[arg1];
		@Pc(14) Class5_Sub2_Sub16 local14 = null;
		@Pc(22) Class5_Sub2_Sub16 local22 = this.aClass76_1.method2153(local12 >> 16);
		@Pc(26) int local26 = local12 & 0xFFFF;
		if (local22 == null) {
			return 0;
		}
		if ((this.aBoolean37 || Static457.aBoolean567) && arg2 != -1 && this.anIntArray69.length > arg2) {
			local7 = this.anIntArray69[arg2];
			local14 = this.aClass76_1.method2153(local7 >> 16);
			local7 &= 0xFFFF;
		}
		if (this.aBoolean39) {
			local5 = 512;
		}
		if (local22.method4953(local26)) {
			local5 |= 0x80;
		}
		if (local22.method4957(local26)) {
			local5 |= 0x100;
		}
		if (local22.method4954(local26)) {
			local5 |= 0x400;
		}
		if (local14 != null) {
			if (local14.method4953(local7)) {
				local5 |= 0x80;
			}
			if (local14.method4957(local7)) {
				local5 |= 0x100;
			}
			if (local14.method4954(local7)) {
				local5 |= 0x400;
			}
		}
		if (this.anIntArray67 != null && arg0) {
			@Pc(153) int local153;
			@Pc(168) Class5_Sub2_Sub16 local168;
			if (this.anIntArray67.length > arg1) {
				local153 = this.anIntArray67[arg1];
				if (local153 != 65535) {
					local168 = this.aClass76_1.method2153(local153 >> 16);
					local153 &= 0xFFFF;
					if (local168 != null) {
						if (local168.method4953(local153)) {
							local5 |= 0x80;
						}
						if (local168.method4957(local153)) {
							local5 |= 0x100;
						}
						if (local168.method4954(local153)) {
							local5 |= 0x400;
						}
					}
				}
			}
			if ((this.aBoolean37 || Static457.aBoolean567) && arg2 != -1 && arg2 < this.anIntArray67.length) {
				local153 = this.anIntArray67[arg2];
				if (local153 != 65535) {
					local168 = this.aClass76_1.method2153(local153 >> 16);
					local153 &= 0xFFFF;
					if (local168 != null) {
						if (local168.method4953(local153)) {
							local5 |= 0x80;
						}
						if (local168.method4957(local153)) {
							local5 |= 0x100;
						}
						if (local168.method4954(local153)) {
							local5 |= 0x400;
						}
					}
				}
			}
		}
		return local5 | 0x20;
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(Lclient!co;I)V")
	public void method854(@OriginalArg(0) Class5_Sub3 arg0) {
		while (true) {
			@Pc(15) int local15 = arg0.method4220();
			if (local15 == 0) {
				return;
			}
			this.method857(local15, arg0);
		}
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(BIILclient!r;BIII)Lclient!r;")
	public Class36 method856(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class36 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(8) int local8 = this.anIntArray68[arg2];
		@Pc(13) int local13 = this.anIntArray69[arg2];
		@Pc(21) Class5_Sub2_Sub16 local21 = this.aClass76_1.method2153(local13 >> 16);
		@Pc(25) int local25 = local13 & 0xFFFF;
		if (local21 == null) {
			return arg3.method7356(arg0, arg4, true);
		}
		@Pc(35) Class5_Sub2_Sub16 local35 = null;
		if ((this.aBoolean37 || Static457.aBoolean567) && arg1 != -1 && this.anIntArray69.length > arg1) {
			@Pc(58) int local58 = this.anIntArray69[arg1];
			local35 = this.aClass76_1.method2153(local58 >> 16);
			arg1 = local58 & 0xFFFF;
		}
		if (this.aBoolean39) {
			arg4 |= 0x200;
		}
		if (local21.method4953(local25)) {
			arg4 |= 0x80;
		}
		if (local21.method4957(local25)) {
			arg4 |= 0x100;
		}
		if (local21.method4954(local25)) {
			arg4 |= 0x400;
		}
		if (local35 != null) {
			if (local35.method4953(arg1)) {
				arg4 |= 0x80;
			}
			if (local35.method4957(arg1)) {
				arg4 |= 0x100;
			}
			if (local35.method4954(arg1)) {
				arg4 |= 0x400;
			}
		}
		arg4 |= 0x20;
		@Pc(153) Class36 local153 = arg3.method7356(arg0, arg4, true);
		local153.method7348(arg6, arg1, local35, local25, arg5 - 1, local21, this.aBoolean39, local8);
		return local153;
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(ILclient!co;I)V")
	private void method857(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub3 arg1) {
		@Pc(16) int local16;
		@Pc(22) int local22;
		@Pc(41) int local41;
		@Pc(62) int local62;
		if (arg0 == 1) {
			local16 = arg1.method4227();
			this.anIntArray68 = new int[local16];
			for (local22 = 0; local22 < local16; local22++) {
				this.anIntArray68[local22] = arg1.method4227();
			}
			this.anIntArray69 = new int[local16];
			for (local41 = 0; local41 < local16; local41++) {
				this.anIntArray69[local41] = arg1.method4227();
			}
			for (local62 = 0; local62 < local16; local62++) {
				this.anIntArray69[local62] += arg1.method4227() << 16;
			}
		} else if (arg0 == 2) {
			this.anInt927 = arg1.method4227();
		} else if (arg0 == 3) {
			this.aBooleanArray4 = new boolean[256];
			local16 = arg1.method4220();
			for (local22 = 0; local22 < local16; local22++) {
				this.aBooleanArray4[arg1.method4220()] = true;
			}
		} else if (arg0 == 5) {
			this.anInt933 = arg1.method4220();
		} else if (arg0 == 6) {
			this.anInt930 = arg1.method4227();
		} else if (arg0 == 7) {
			this.anInt917 = arg1.method4227();
		} else if (arg0 == 8) {
			this.anInt921 = arg1.method4220();
		} else if (arg0 == 9) {
			this.anInt934 = arg1.method4220();
		} else if (arg0 == 10) {
			this.anInt932 = arg1.method4220();
		} else if (arg0 == 11) {
			this.anInt923 = arg1.method4220();
		} else if (arg0 == 12) {
			local16 = arg1.method4220();
			this.anIntArray67 = new int[local16];
			for (local22 = 0; local22 < local16; local22++) {
				this.anIntArray67[local22] = arg1.method4227();
			}
			for (local41 = 0; local41 < local16; local41++) {
				this.anIntArray67[local41] = (arg1.method4227() << 16) + this.anIntArray67[local41];
			}
		} else if (arg0 == 13) {
			local16 = arg1.method4227();
			this.anIntArrayArray4 = new int[local16][];
			for (local22 = 0; local22 < local16; local22++) {
				local41 = arg1.method4220();
				if (local41 > 0) {
					this.anIntArrayArray4[local22] = new int[local41];
					this.anIntArrayArray4[local22][0] = arg1.method4182();
					for (local62 = 1; local62 < local41; local62++) {
						this.anIntArrayArray4[local22][local62] = arg1.method4227();
					}
				}
			}
		} else if (arg0 == 14) {
			this.aBoolean39 = true;
		} else if (arg0 == 15) {
			this.aBoolean37 = true;
		} else if (arg0 == 16) {
			this.aBoolean38 = true;
		} else if (arg0 == 17) {
			this.anInt929 = arg1.method4220();
		}
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(I)V")
	public void method858() {
		if (this.anInt932 == -1) {
			if (this.aBooleanArray4 == null) {
				this.anInt932 = 0;
			} else {
				this.anInt932 = 2;
			}
		}
		if (this.anInt934 != -1) {
			return;
		}
		if (this.aBooleanArray4 == null) {
			this.anInt934 = 0;
		} else {
			this.anInt934 = 2;
		}
	}
}
