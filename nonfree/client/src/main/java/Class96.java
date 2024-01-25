import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hi")
public final class Class96 {

	@OriginalMember(owner = "client!hi", name = "b", descriptor = "Lclient!bw;")
	public Class30 aClass30_1;

	@OriginalMember(owner = "client!hi", name = "e", descriptor = "[I")
	public int[] anIntArray253;

	@OriginalMember(owner = "client!hi", name = "l", descriptor = "[I")
	public int[] anIntArray254;

	@OriginalMember(owner = "client!hi", name = "o", descriptor = "I")
	public int anInt3325;

	@OriginalMember(owner = "client!hi", name = "A", descriptor = "[I")
	private int[] anIntArray255;

	@OriginalMember(owner = "client!hi", name = "E", descriptor = "[[I")
	public int[][] anIntArrayArray29;

	@OriginalMember(owner = "client!hi", name = "F", descriptor = "[Z")
	public boolean[] aBooleanArray12;

	@OriginalMember(owner = "client!hi", name = "c", descriptor = "I")
	public int anInt3317 = -1;

	@OriginalMember(owner = "client!hi", name = "m", descriptor = "I")
	public int anInt3323 = 5;

	@OriginalMember(owner = "client!hi", name = "p", descriptor = "I")
	public int anInt3326 = -1;

	@OriginalMember(owner = "client!hi", name = "t", descriptor = "Z")
	public boolean aBoolean257 = false;

	@OriginalMember(owner = "client!hi", name = "r", descriptor = "Z")
	public boolean aBoolean256 = false;

	@OriginalMember(owner = "client!hi", name = "s", descriptor = "I")
	public int anInt3328 = -1;

	@OriginalMember(owner = "client!hi", name = "v", descriptor = "I")
	public int anInt3329 = -1;

	@OriginalMember(owner = "client!hi", name = "h", descriptor = "I")
	public int anInt3320 = 2;

	@OriginalMember(owner = "client!hi", name = "k", descriptor = "Z")
	public boolean aBoolean255 = false;

	@OriginalMember(owner = "client!hi", name = "y", descriptor = "Z")
	public boolean aBoolean258 = false;

	@OriginalMember(owner = "client!hi", name = "n", descriptor = "I")
	public int anInt3324 = -1;

	@OriginalMember(owner = "client!hi", name = "j", descriptor = "I")
	public int anInt3322 = 99;

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(ILclient!bt;)V")
	public void method2711(@OriginalArg(1) Class3_Sub2 arg0) {
		while (true) {
			@Pc(7) int local7 = arg0.method6053();
			if (local7 == 0) {
				return;
			}
			this.method2720(local7, arg0);
		}
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(IZIZ)I")
	public int method2712(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		@Pc(5) int local5 = 0;
		@Pc(7) int local7 = 0;
		@Pc(12) int local12 = this.anIntArray253[arg0];
		@Pc(14) Class3_Sub3_Sub13 local14 = null;
		@Pc(22) Class3_Sub3_Sub13 local22 = this.aClass30_1.method934(local12 >> 16);
		@Pc(26) int local26 = local12 & 0xFFFF;
		if (local22 == null) {
			return 0;
		}
		if ((this.aBoolean258 || Static426.aBoolean504) && arg2 != -1 && this.anIntArray253.length > arg2) {
			local7 = this.anIntArray253[arg2];
			local14 = this.aClass30_1.method934(local7 >> 16);
			local7 &= 0xFFFF;
		}
		if (this.aBoolean255) {
			local5 = 512;
		}
		if (local22.method3084(local26)) {
			local5 |= 0x80;
		}
		if (local22.method3081(local26)) {
			local5 |= 0x100;
		}
		if (local22.method3082(local26)) {
			local5 |= 0x400;
		}
		if (local14 != null) {
			if (local14.method3084(local7)) {
				local5 |= 0x80;
			}
			if (local14.method3081(local7)) {
				local5 |= 0x100;
			}
			if (local14.method3082(local7)) {
				local5 |= 0x400;
			}
		}
		if (this.anIntArray255 != null && arg1) {
			@Pc(147) int local147;
			@Pc(160) Class3_Sub3_Sub13 local160;
			if (this.anIntArray255.length > arg0) {
				local147 = this.anIntArray255[arg0];
				if (local147 != 65535) {
					local160 = this.aClass30_1.method934(local147 >> 16);
					local147 &= 0xFFFF;
					if (local160 != null) {
						if (local160.method3084(local147)) {
							local5 |= 0x80;
						}
						if (local160.method3081(local147)) {
							local5 |= 0x100;
						}
						if (local160.method3082(local147)) {
							local5 |= 0x400;
						}
					}
				}
			}
			if ((this.aBoolean258 || Static426.aBoolean504) && arg2 != -1 && this.anIntArray255.length > arg2) {
				local147 = this.anIntArray255[arg2];
				if (local147 != 65535) {
					local160 = this.aClass30_1.method934(local147 >> 16);
					local147 &= 0xFFFF;
					if (local160 != null) {
						if (local160.method3084(local147)) {
							local5 |= 0x80;
						}
						if (local160.method3081(local147)) {
							local5 |= 0x100;
						}
						if (local160.method3082(local147)) {
							local5 |= 0x400;
						}
					}
				}
			}
		}
		return local5 | 0x20;
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(Z)V")
	public void method2713() {
		if (this.anInt3324 == -1) {
			if (this.aBooleanArray12 == null) {
				this.anInt3324 = 0;
			} else {
				this.anInt3324 = 2;
			}
		}
		if (this.anInt3328 != -1) {
			return;
		}
		if (this.aBooleanArray12 == null) {
			this.anInt3328 = 0;
		} else {
			this.anInt3328 = 2;
		}
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(IIIILclient!c;I)Lclient!c;")
	public Class31 method2716(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class31 arg3, @OriginalArg(5) int arg4) {
		@Pc(8) int local8 = this.anIntArray254[arg0];
		@Pc(13) int local13 = this.anIntArray253[arg0];
		@Pc(26) Class3_Sub3_Sub13 local26 = this.aClass30_1.method934(local13 >> 16);
		@Pc(30) int local30 = local13 & 0xFFFF;
		if (local26 == null) {
			return arg3.method5710((byte) 1, arg1, true);
		}
		@Pc(40) Class3_Sub3_Sub13 local40 = null;
		if ((this.aBoolean258 || Static426.aBoolean504) && arg4 != -1 && this.anIntArray253.length > arg4) {
			@Pc(63) int local63 = this.anIntArray253[arg4];
			local40 = this.aClass30_1.method934(local63 >> 16);
			arg4 = local63 & 0xFFFF;
		}
		@Pc(77) Class3_Sub3_Sub13 local77 = null;
		@Pc(79) Class3_Sub3_Sub13 local79 = null;
		@Pc(81) int local81 = 0;
		@Pc(83) int local83 = 0;
		if (this.anIntArray255 != null) {
			if (this.anIntArray255.length > arg0) {
				local81 = this.anIntArray255[arg0];
				if (local81 != 65535) {
					local77 = this.aClass30_1.method934(local81 >> 16);
					local81 &= 0xFFFF;
				}
			}
			if ((this.aBoolean258 || Static426.aBoolean504) && arg4 != -1 && this.anIntArray255.length > arg4) {
				local83 = this.anIntArray255[arg4];
				if (local83 != 65535) {
					local79 = this.aClass30_1.method934(local83 >> 16);
					local83 &= 0xFFFF;
				}
			}
		}
		if (this.aBoolean255) {
			arg1 |= 0x200;
		}
		if (local26.method3084(local30)) {
			arg1 |= 0x80;
		}
		if (local26.method3081(local30)) {
			arg1 |= 0x100;
		}
		if (local26.method3082(local30)) {
			arg1 |= 0x400;
		}
		if (local77 != null) {
			if (local77.method3084(local81)) {
				arg1 |= 0x80;
			}
			if (local77.method3081(local81)) {
				arg1 |= 0x100;
			}
			if (local77.method3082(local81)) {
				arg1 |= 0x400;
			}
		}
		if (local40 != null) {
			if (local40.method3084(arg4)) {
				arg1 |= 0x80;
			}
			if (local40.method3081(arg4)) {
				arg1 |= 0x100;
			}
			if (local40.method3082(arg4)) {
				arg1 |= 0x400;
			}
		}
		if (local79 != null) {
			if (local79.method3084(local83)) {
				arg1 |= 0x80;
			}
			if (local79.method3081(local83)) {
				arg1 |= 0x100;
			}
			if (local79.method3082(local83)) {
				arg1 |= 0x400;
			}
		}
		arg1 |= 0x20;
		@Pc(281) Class31 local281 = arg3.method5710((byte) 1, arg1, true);
		local281.method5717(local30, local26, local8, arg2 - 1, 0, arg4, local40, this.aBoolean255);
		if (local77 != null) {
			local281.method5717(local81, local77, local8, arg2 - 1, 0, local83, local79, this.aBoolean255);
		}
		return local281;
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(ILclient!c;IIIIIB)Lclient!c;")
	public Class31 method2719(@OriginalArg(1) Class31 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) byte arg6) {
		@Pc(14) int local14 = this.anIntArray254[arg5];
		@Pc(19) int local19 = this.anIntArray253[arg5];
		@Pc(27) Class3_Sub3_Sub13 local27 = this.aClass30_1.method934(local19 >> 16);
		@Pc(31) int local31 = local19 & 0xFFFF;
		if (local27 == null) {
			return arg0.method5710(arg6, arg3, true);
		}
		@Pc(41) Class3_Sub3_Sub13 local41 = null;
		if ((this.aBoolean258 || Static426.aBoolean504) && arg1 != -1 && this.anIntArray253.length > arg1) {
			@Pc(60) int local60 = this.anIntArray253[arg1];
			local41 = this.aClass30_1.method934(local60 >> 16);
			arg1 = local60 & 0xFFFF;
		}
		if (this.aBoolean255) {
			arg3 |= 0x200;
		}
		if (local27.method3084(local31)) {
			arg3 |= 0x80;
		}
		if (local27.method3081(local31)) {
			arg3 |= 0x100;
		}
		if (local27.method3082(local31)) {
			arg3 |= 0x400;
		}
		if (local41 != null) {
			if (local41.method3084(arg1)) {
				arg3 |= 0x80;
			}
			if (local41.method3081(arg1)) {
				arg3 |= 0x100;
			}
			if (local41.method3082(arg1)) {
				arg3 |= 0x400;
			}
		}
		arg3 |= 0x20;
		@Pc(145) Class31 local145 = arg0.method5710(arg6, arg3, true);
		local145.method5717(local31, local27, local14, arg4 - 1, arg2, arg1, local41, this.aBoolean255);
		return local145;
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(IZLclient!bt;)V")
	private void method2720(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub2 arg1) {
		@Pc(8) int local8;
		@Pc(14) int local14;
		@Pc(36) int local36;
		@Pc(50) int local50;
		if (arg0 == 1) {
			local8 = arg1.method6004();
			this.anIntArray254 = new int[local8];
			for (local14 = 0; local14 < local8; local14++) {
				this.anIntArray254[local14] = arg1.method6004();
			}
			this.anIntArray253 = new int[local8];
			for (local36 = 0; local36 < local8; local36++) {
				this.anIntArray253[local36] = arg1.method6004();
			}
			for (local50 = 0; local50 < local8; local50++) {
				this.anIntArray253[local50] += arg1.method6004() << 16;
			}
		} else if (arg0 == 2) {
			this.anInt3329 = arg1.method6004();
		} else if (arg0 == 3) {
			this.aBooleanArray12 = new boolean[256];
			local8 = arg1.method6053();
			for (local14 = 0; local14 < local8; local14++) {
				this.aBooleanArray12[arg1.method6053()] = true;
			}
		} else if (arg0 == 4) {
			this.aBoolean256 = true;
		} else if (arg0 == 5) {
			this.anInt3323 = arg1.method6053();
		} else if (arg0 == 6) {
			this.anInt3317 = arg1.method6004();
		} else if (arg0 == 7) {
			this.anInt3326 = arg1.method6004();
		} else if (arg0 == 8) {
			this.anInt3322 = arg1.method6053();
		} else if (arg0 == 9) {
			this.anInt3328 = arg1.method6053();
		} else if (arg0 == 10) {
			this.anInt3324 = arg1.method6053();
		} else if (arg0 == 11) {
			this.anInt3320 = arg1.method6053();
		} else if (arg0 == 12) {
			local8 = arg1.method6053();
			this.anIntArray255 = new int[local8];
			for (local14 = 0; local14 < local8; local14++) {
				this.anIntArray255[local14] = arg1.method6004();
			}
			for (local36 = 0; local36 < local8; local36++) {
				this.anIntArray255[local36] = (arg1.method6004() << 16) + this.anIntArray255[local36];
			}
		} else if (arg0 == 13) {
			local8 = arg1.method6004();
			this.anIntArrayArray29 = new int[local8][];
			for (local14 = 0; local14 < local8; local14++) {
				local36 = arg1.method6053();
				if (local36 > 0) {
					this.anIntArrayArray29[local14] = new int[local36];
					this.anIntArrayArray29[local14][0] = arg1.method6020();
					for (local50 = 1; local50 < local36; local50++) {
						this.anIntArrayArray29[local14][local50] = arg1.method6004();
					}
				}
			}
		} else if (arg0 == 14) {
			this.aBoolean255 = true;
		} else if (arg0 == 15) {
			this.aBoolean258 = true;
		} else if (arg0 == 16) {
			this.aBoolean257 = true;
		}
	}
}
