import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!am")
public final class Class16 {

	@OriginalMember(owner = "client!am", name = "a", descriptor = "[I")
	public int[] anIntArray46;

	@OriginalMember(owner = "client!am", name = "i", descriptor = "[I")
	public int[] anIntArray47;

	@OriginalMember(owner = "client!am", name = "m", descriptor = "[I")
	private int[] anIntArray48;

	@OriginalMember(owner = "client!am", name = "u", descriptor = "[Z")
	public boolean[] aBooleanArray3;

	@OriginalMember(owner = "client!am", name = "v", descriptor = "I")
	public int anInt588;

	@OriginalMember(owner = "client!am", name = "x", descriptor = "[[I")
	public int[][] anIntArrayArray2;

	@OriginalMember(owner = "client!am", name = "C", descriptor = "Lclient!ir;")
	public Class156 aClass156_1;

	@OriginalMember(owner = "client!am", name = "f", descriptor = "Z")
	public boolean aBoolean38 = false;

	@OriginalMember(owner = "client!am", name = "b", descriptor = "I")
	public int anInt575 = -1;

	@OriginalMember(owner = "client!am", name = "c", descriptor = "I")
	public int anInt576 = 99;

	@OriginalMember(owner = "client!am", name = "p", descriptor = "I")
	public int anInt583 = -1;

	@OriginalMember(owner = "client!am", name = "l", descriptor = "Z")
	public boolean aBoolean40 = false;

	@OriginalMember(owner = "client!am", name = "s", descriptor = "I")
	public int anInt586 = 0;

	@OriginalMember(owner = "client!am", name = "w", descriptor = "Z")
	public boolean aBoolean41 = false;

	@OriginalMember(owner = "client!am", name = "t", descriptor = "I")
	public int anInt587 = -1;

	@OriginalMember(owner = "client!am", name = "k", descriptor = "Z")
	public boolean aBoolean39 = false;

	@OriginalMember(owner = "client!am", name = "r", descriptor = "I")
	public int anInt585 = -1;

	@OriginalMember(owner = "client!am", name = "o", descriptor = "I")
	public int anInt582 = 5;

	@OriginalMember(owner = "client!am", name = "j", descriptor = "I")
	public int anInt581 = 2;

	@OriginalMember(owner = "client!am", name = "y", descriptor = "I")
	public int anInt589 = -1;

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(IIILclient!ba;II)Lclient!ba;")
	public Class23 method644(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class23 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(8) int local8 = this.anIntArray46[arg1];
		@Pc(18) int local18 = this.anIntArray47[arg1];
		@Pc(26) Class6_Sub4_Sub15 local26 = this.aClass156_1.method4108(local18 >> 16);
		@Pc(30) int local30 = local18 & 0xFFFF;
		if (local26 == null) {
			return arg2.method7068((byte) 1, arg3, true);
		}
		@Pc(40) Class6_Sub4_Sub15 local40 = null;
		if ((this.aBoolean39 || Static305.aBoolean438) && arg0 != -1 && this.anIntArray47.length > arg0) {
			@Pc(63) int local63 = this.anIntArray47[arg0];
			local40 = this.aClass156_1.method4108(local63 >> 16);
			arg0 = local63 & 0xFFFF;
		}
		@Pc(77) Class6_Sub4_Sub15 local77 = null;
		@Pc(79) Class6_Sub4_Sub15 local79 = null;
		@Pc(81) int local81 = 0;
		@Pc(83) int local83 = 0;
		if (this.anIntArray48 != null) {
			if (arg1 < this.anIntArray48.length) {
				local81 = this.anIntArray48[arg1];
				if (local81 != 65535) {
					local77 = this.aClass156_1.method4108(local81 >> 16);
					local81 &= 0xFFFF;
				}
			}
			if ((this.aBoolean39 || Static305.aBoolean438) && arg0 != -1 && arg0 < this.anIntArray48.length) {
				local83 = this.anIntArray48[arg0];
				if (local83 != 65535) {
					local79 = this.aClass156_1.method4108(local83 >> 16);
					local83 &= 0xFFFF;
				}
			}
		}
		if (this.aBoolean41) {
			arg3 |= 0x200;
		}
		if (local26.method6848(local30)) {
			arg3 |= 0x80;
		}
		if (local26.method6851(local30)) {
			arg3 |= 0x100;
		}
		if (local26.method6847(local30)) {
			arg3 |= 0x400;
		}
		if (local77 != null) {
			if (local77.method6848(local81)) {
				arg3 |= 0x80;
			}
			if (local77.method6851(local81)) {
				arg3 |= 0x100;
			}
			if (local77.method6847(local81)) {
				arg3 |= 0x400;
			}
		}
		if (local40 != null) {
			if (local40.method6848(arg0)) {
				arg3 |= 0x80;
			}
			if (local40.method6851(arg0)) {
				arg3 |= 0x100;
			}
			if (local40.method6847(arg0)) {
				arg3 |= 0x400;
			}
		}
		if (local79 != null) {
			if (local79.method6848(local83)) {
				arg3 |= 0x80;
			}
			if (local79.method6851(local83)) {
				arg3 |= 0x100;
			}
			if (local79.method6847(local83)) {
				arg3 |= 0x400;
			}
		}
		arg3 |= 0x20;
		@Pc(288) Class23 local288 = arg2.method7068((byte) 1, arg3, true);
		local288.method7065(local26, local40, this.aBoolean41, local8, arg4 - 1, arg0, local30, 0);
		if (local77 != null) {
			local288.method7065(local77, local79, this.aBoolean41, local8, arg4 - 1, local83, local81, 0);
		}
		return local288;
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(IIZI)I")
	public int method645(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2) {
		@Pc(5) int local5 = 0;
		@Pc(7) int local7 = 0;
		@Pc(12) int local12 = this.anIntArray47[arg0];
		@Pc(14) Class6_Sub4_Sub15 local14 = null;
		@Pc(22) Class6_Sub4_Sub15 local22 = this.aClass156_1.method4108(local12 >> 16);
		@Pc(26) int local26 = local12 & 0xFFFF;
		if (local22 == null) {
			return 0;
		}
		if ((this.aBoolean39 || Static305.aBoolean438) && arg2 != -1 && arg2 < this.anIntArray47.length) {
			local7 = this.anIntArray47[arg2];
			local14 = this.aClass156_1.method4108(local7 >> 16);
			local7 &= 0xFFFF;
		}
		if (this.aBoolean41) {
			local5 = 512;
		}
		if (local22.method6848(local26)) {
			local5 |= 0x80;
		}
		if (local22.method6851(local26)) {
			local5 |= 0x100;
		}
		if (local22.method6847(local26)) {
			local5 |= 0x400;
		}
		if (local14 != null) {
			if (local14.method6848(local7)) {
				local5 |= 0x80;
			}
			if (local14.method6851(local7)) {
				local5 |= 0x100;
			}
			if (local14.method6847(local7)) {
				local5 |= 0x400;
			}
		}
		if (this.anIntArray48 != null && arg1) {
			@Pc(152) int local152;
			@Pc(165) Class6_Sub4_Sub15 local165;
			if (arg0 < this.anIntArray48.length) {
				local152 = this.anIntArray48[arg0];
				if (local152 != 65535) {
					local165 = this.aClass156_1.method4108(local152 >> 16);
					local152 &= 0xFFFF;
					if (local165 != null) {
						if (local165.method6848(local152)) {
							local5 |= 0x80;
						}
						if (local165.method6851(local152)) {
							local5 |= 0x100;
						}
						if (local165.method6847(local152)) {
							local5 |= 0x400;
						}
					}
				}
			}
			if ((this.aBoolean39 || Static305.aBoolean438) && arg2 != -1 && arg2 < this.anIntArray48.length) {
				local152 = this.anIntArray48[arg2];
				if (local152 != 65535) {
					local165 = this.aClass156_1.method4108(local152 >> 16);
					local152 &= 0xFFFF;
					if (local165 != null) {
						if (local165.method6848(local152)) {
							local5 |= 0x80;
						}
						if (local165.method6851(local152)) {
							local5 |= 0x100;
						}
						if (local165.method6847(local152)) {
							local5 |= 0x400;
						}
					}
				}
			}
		}
		return local5 | 0x20;
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(BLclient!ba;IIIIII)Lclient!ba;")
	public Class23 method648(@OriginalArg(0) byte arg0, @OriginalArg(1) Class23 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(8) int local8 = this.anIntArray46[arg6];
		@Pc(13) int local13 = this.anIntArray47[arg6];
		@Pc(21) Class6_Sub4_Sub15 local21 = this.aClass156_1.method4108(local13 >> 16);
		@Pc(25) int local25 = local13 & 0xFFFF;
		if (local21 == null) {
			return arg1.method7068(arg0, arg4, true);
		}
		@Pc(35) Class6_Sub4_Sub15 local35 = null;
		if ((this.aBoolean39 || Static305.aBoolean438) && arg5 != -1 && arg5 < this.anIntArray47.length) {
			@Pc(54) int local54 = this.anIntArray47[arg5];
			local35 = this.aClass156_1.method4108(local54 >> 16);
			arg5 = local54 & 0xFFFF;
		}
		if (this.aBoolean41) {
			arg4 |= 0x200;
		}
		if (local21.method6848(local25)) {
			arg4 |= 0x80;
		}
		if (local21.method6851(local25)) {
			arg4 |= 0x100;
		}
		if (local21.method6847(local25)) {
			arg4 |= 0x400;
		}
		if (local35 != null) {
			if (local35.method6848(arg5)) {
				arg4 |= 0x80;
			}
			if (local35.method6851(arg5)) {
				arg4 |= 0x100;
			}
			if (local35.method6847(arg5)) {
				arg4 |= 0x400;
			}
		}
		arg4 |= 0x20;
		@Pc(141) Class23 local141 = arg1.method7068(arg0, arg4, true);
		local141.method7065(local21, local35, this.aBoolean41, local8, arg3 - 1, arg5, local25, arg2);
		return local141;
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(Z)V")
	public void method649() {
		if (this.anInt589 == -1) {
			if (this.aBooleanArray3 == null) {
				this.anInt589 = 0;
			} else {
				this.anInt589 = 2;
			}
		}
		if (this.anInt583 != -1) {
			return;
		}
		if (this.aBooleanArray3 == null) {
			this.anInt583 = 0;
		} else {
			this.anInt583 = 2;
		}
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(IILclient!iaa;)V")
	private void method650(@OriginalArg(1) int arg0, @OriginalArg(2) Class6_Sub26 arg1) {
		@Pc(35) int local35;
		@Pc(37) int local37;
		@Pc(159) int local159;
		@Pc(178) int local178;
		if (arg0 == 1) {
			local35 = arg1.method4999();
			this.anIntArray46 = new int[local35];
			for (local37 = 0; local37 < local35; local37++) {
				this.anIntArray46[local37] = arg1.method4999();
			}
			this.anIntArray47 = new int[local35];
			for (local159 = 0; local159 < local35; local159++) {
				this.anIntArray47[local159] = arg1.method4999();
			}
			for (local178 = 0; local178 < local35; local178++) {
				this.anIntArray47[local178] = (arg1.method4999() << 16) + this.anIntArray47[local178];
			}
		} else if (arg0 == 2) {
			this.anInt587 = arg1.method4999();
		} else if (arg0 == 3) {
			this.aBooleanArray3 = new boolean[256];
			local35 = arg1.method4966();
			for (local37 = 0; local37 < local35; local37++) {
				this.aBooleanArray3[arg1.method4966()] = true;
			}
		} else if (arg0 == 5) {
			this.anInt582 = arg1.method4966();
		} else if (arg0 == 6) {
			this.anInt585 = arg1.method4999();
		} else if (arg0 == 7) {
			this.anInt575 = arg1.method4999();
		} else if (arg0 == 8) {
			this.anInt576 = arg1.method4966();
		} else if (arg0 == 9) {
			this.anInt589 = arg1.method4966();
		} else if (arg0 == 10) {
			this.anInt583 = arg1.method4966();
		} else if (arg0 == 11) {
			this.anInt581 = arg1.method4966();
		} else if (arg0 == 12) {
			local35 = arg1.method4966();
			this.anIntArray48 = new int[local35];
			for (local37 = 0; local37 < local35; local37++) {
				this.anIntArray48[local37] = arg1.method4999();
			}
			for (local159 = 0; local159 < local35; local159++) {
				this.anIntArray48[local159] = (arg1.method4999() << 16) + this.anIntArray48[local159];
			}
		} else if (arg0 == 13) {
			local35 = arg1.method4999();
			this.anIntArrayArray2 = new int[local35][];
			for (local37 = 0; local37 < local35; local37++) {
				local159 = arg1.method4966();
				if (local159 > 0) {
					this.anIntArrayArray2[local37] = new int[local159];
					this.anIntArrayArray2[local37][0] = arg1.method4949();
					for (local178 = 1; local178 < local159; local178++) {
						this.anIntArrayArray2[local37][local178] = arg1.method4999();
					}
				}
			}
		} else if (arg0 == 14) {
			this.aBoolean41 = true;
		} else if (arg0 == 15) {
			this.aBoolean39 = true;
		} else if (arg0 == 16) {
			this.aBoolean40 = true;
		} else if (arg0 == 17) {
			this.anInt586 = arg1.method4966();
		} else if (arg0 == 18) {
			this.aBoolean38 = true;
			return;
		}
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(ILclient!iaa;)V")
	public void method651(@OriginalArg(1) Class6_Sub26 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method4966();
			if (local5 == 0) {
				return;
			}
			this.method650(local5, arg0);
		}
	}
}
