import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eb")
public final class Class64 {

	@OriginalMember(owner = "client!eb", name = "c", descriptor = "[I")
	public int[] anIntArray126;

	@OriginalMember(owner = "client!eb", name = "m", descriptor = "[[I")
	public int[][] anIntArrayArray16;

	@OriginalMember(owner = "client!eb", name = "n", descriptor = "I")
	public int anInt1195;

	@OriginalMember(owner = "client!eb", name = "t", descriptor = "Lclient!cf;")
	public Class37 aClass37_1;

	@OriginalMember(owner = "client!eb", name = "u", descriptor = "[I")
	public int[] anIntArray127;

	@OriginalMember(owner = "client!eb", name = "v", descriptor = "[Z")
	public boolean[] aBooleanArray36;

	@OriginalMember(owner = "client!eb", name = "y", descriptor = "[I")
	private int[] anIntArray128;

	@OriginalMember(owner = "client!eb", name = "g", descriptor = "I")
	public int anInt1189 = -1;

	@OriginalMember(owner = "client!eb", name = "k", descriptor = "I")
	public int anInt1193 = 99;

	@OriginalMember(owner = "client!eb", name = "i", descriptor = "I")
	public int anInt1191 = -1;

	@OriginalMember(owner = "client!eb", name = "h", descriptor = "I")
	public int anInt1190 = -1;

	@OriginalMember(owner = "client!eb", name = "s", descriptor = "I")
	public int anInt1199 = 5;

	@OriginalMember(owner = "client!eb", name = "q", descriptor = "I")
	public int anInt1197 = -1;

	@OriginalMember(owner = "client!eb", name = "e", descriptor = "Z")
	public boolean aBoolean141 = false;

	@OriginalMember(owner = "client!eb", name = "o", descriptor = "Z")
	public boolean aBoolean142 = false;

	@OriginalMember(owner = "client!eb", name = "r", descriptor = "I")
	public int anInt1198 = 0;

	@OriginalMember(owner = "client!eb", name = "x", descriptor = "Z")
	public boolean aBoolean143 = false;

	@OriginalMember(owner = "client!eb", name = "A", descriptor = "I")
	public int anInt1202 = -1;

	@OriginalMember(owner = "client!eb", name = "E", descriptor = "I")
	public int anInt1204 = 2;

	static {
		new Class142("You have been permanently muted due to breaking a rule.", "Du wurdest permanent stumm geschaltet, da du gegen eine Regel verstoßen hast.", "L'accès à la messagerie instantanée vous a définitivement été retiré suite à une infraction.", "Você foi permanentemente vetado por ter violado uma regra.");
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(IILclient!e;IIBIB)Lclient!e;")
	public Class8 method1052(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class8 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) byte arg6) {
		@Pc(8) int local8 = this.anIntArray126[arg4];
		@Pc(13) int local13 = this.anIntArray127[arg4];
		@Pc(21) Class1_Sub3_Sub14 local21 = this.aClass37_1.method671(local13 >> 16);
		@Pc(25) int local25 = local13 & 0xFFFF;
		if (local21 == null) {
			return arg2.method5983(arg6, arg1, true);
		}
		@Pc(35) Class1_Sub3_Sub14 local35 = null;
		if ((this.aBoolean142 || Static463.aBoolean651) && arg0 != -1 && arg0 < this.anIntArray127.length) {
			@Pc(54) int local54 = this.anIntArray127[arg0];
			local35 = this.aClass37_1.method671(local54 >> 16);
			arg0 = local54 & 0xFFFF;
		}
		if (this.aBoolean141) {
			arg1 |= 0x200;
		}
		if (local21.method3588(local25)) {
			arg1 |= 0x80;
		}
		if (local21.method3591(local25)) {
			arg1 |= 0x100;
		}
		if (local21.method3589(local25)) {
			arg1 |= 0x400;
		}
		if (local35 != null) {
			if (local35.method3588(arg0)) {
				arg1 |= 0x80;
			}
			if (local35.method3591(arg0)) {
				arg1 |= 0x100;
			}
			if (local35.method3589(arg0)) {
				arg1 |= 0x400;
			}
		}
		arg1 |= 0x20;
		@Pc(141) Class8 local141 = arg2.method5983(arg6, arg1, true);
		local141.method5998(local25, arg0, local35, arg5, arg3 - 1, local8, this.aBoolean141, local21);
		return local141;
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(Lclient!wm;II)V")
	private void method1053(@OriginalArg(0) Class1_Sub19 arg0, @OriginalArg(2) int arg1) {
		@Pc(77) int local77;
		@Pc(83) int local83;
		@Pc(98) int local98;
		@Pc(161) int local161;
		if (arg1 == 1) {
			local77 = arg0.method2896();
			this.anIntArray126 = new int[local77];
			for (local83 = 0; local83 < local77; local83++) {
				this.anIntArray126[local83] = arg0.method2896();
			}
			this.anIntArray127 = new int[local77];
			for (local98 = 0; local98 < local77; local98++) {
				this.anIntArray127[local98] = arg0.method2896();
			}
			for (local161 = 0; local161 < local77; local161++) {
				this.anIntArray127[local161] = (arg0.method2896() << 16) + this.anIntArray127[local161];
			}
		} else if (arg1 == 2) {
			this.anInt1191 = arg0.method2896();
		} else if (arg1 == 3) {
			this.aBooleanArray36 = new boolean[256];
			local77 = arg0.method2915();
			for (local83 = 0; local83 < local77; local83++) {
				this.aBooleanArray36[arg0.method2915()] = true;
			}
		} else if (arg1 == 5) {
			this.anInt1199 = arg0.method2915();
		} else if (arg1 == 6) {
			this.anInt1202 = arg0.method2896();
		} else if (arg1 == 7) {
			this.anInt1190 = arg0.method2896();
		} else if (arg1 == 8) {
			this.anInt1193 = arg0.method2915();
		} else if (arg1 == 9) {
			this.anInt1197 = arg0.method2915();
		} else if (arg1 == 10) {
			this.anInt1189 = arg0.method2915();
		} else if (arg1 == 11) {
			this.anInt1204 = arg0.method2915();
		} else if (arg1 == 12) {
			local77 = arg0.method2915();
			this.anIntArray128 = new int[local77];
			for (local83 = 0; local83 < local77; local83++) {
				this.anIntArray128[local83] = arg0.method2896();
			}
			for (local98 = 0; local98 < local77; local98++) {
				this.anIntArray128[local98] = (arg0.method2896() << 16) + this.anIntArray128[local98];
			}
		} else if (arg1 == 13) {
			local77 = arg0.method2896();
			this.anIntArrayArray16 = new int[local77][];
			for (local83 = 0; local83 < local77; local83++) {
				local98 = arg0.method2915();
				if (local98 > 0) {
					this.anIntArrayArray16[local83] = new int[local98];
					this.anIntArrayArray16[local83][0] = arg0.method2881();
					for (local161 = 1; local161 < local98; local161++) {
						this.anIntArrayArray16[local83][local161] = arg0.method2896();
					}
				}
			}
		} else if (arg1 == 14) {
			this.aBoolean141 = true;
		} else if (arg1 == 15) {
			this.aBoolean142 = true;
		} else if (arg1 == 16) {
			this.aBoolean143 = true;
		} else if (arg1 == 17) {
			this.anInt1198 = arg0.method2915();
		}
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(IILclient!e;III)Lclient!e;")
	public Class8 method1056(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class8 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(8) int local8 = this.anIntArray126[arg3];
		@Pc(13) int local13 = this.anIntArray127[arg3];
		@Pc(21) Class1_Sub3_Sub14 local21 = this.aClass37_1.method671(local13 >> 16);
		@Pc(25) int local25 = local13 & 0xFFFF;
		if (local21 == null) {
			return arg2.method5983((byte) 1, arg4, true);
		}
		@Pc(35) Class1_Sub3_Sub14 local35 = null;
		if ((this.aBoolean142 || Static463.aBoolean651) && arg1 != -1 && arg1 < this.anIntArray127.length) {
			@Pc(58) int local58 = this.anIntArray127[arg1];
			local35 = this.aClass37_1.method671(local58 >> 16);
			arg1 = local58 & 0xFFFF;
		}
		@Pc(72) Class1_Sub3_Sub14 local72 = null;
		@Pc(74) Class1_Sub3_Sub14 local74 = null;
		@Pc(76) int local76 = 0;
		@Pc(78) int local78 = 0;
		if (this.anIntArray128 != null) {
			if (this.anIntArray128.length > arg3) {
				local76 = this.anIntArray128[arg3];
				if (local76 != 65535) {
					local72 = this.aClass37_1.method671(local76 >> 16);
					local76 &= 0xFFFF;
				}
			}
			if ((this.aBoolean142 || Static463.aBoolean651) && arg1 != -1 && this.anIntArray128.length > arg1) {
				local78 = this.anIntArray128[arg1];
				if (local78 != 65535) {
					local74 = this.aClass37_1.method671(local78 >> 16);
					local78 &= 0xFFFF;
				}
			}
		}
		if (this.aBoolean141) {
			arg4 |= 0x200;
		}
		if (local21.method3588(local25)) {
			arg4 |= 0x80;
		}
		if (local21.method3591(local25)) {
			arg4 |= 0x100;
		}
		if (local21.method3589(local25)) {
			arg4 |= 0x400;
		}
		if (local72 != null) {
			if (local72.method3588(local76)) {
				arg4 |= 0x80;
			}
			if (local72.method3591(local76)) {
				arg4 |= 0x100;
			}
			if (local72.method3589(local76)) {
				arg4 |= 0x400;
			}
		}
		if (local35 != null) {
			if (local35.method3588(arg1)) {
				arg4 |= 0x80;
			}
			if (local35.method3591(arg1)) {
				arg4 |= 0x100;
			}
			if (local35.method3589(arg1)) {
				arg4 |= 0x400;
			}
		}
		if (local74 != null) {
			if (local74.method3588(local78)) {
				arg4 |= 0x80;
			}
			if (local74.method3591(local78)) {
				arg4 |= 0x100;
			}
			if (local74.method3589(local78)) {
				arg4 |= 0x400;
			}
		}
		arg4 |= 0x20;
		@Pc(288) Class8 local288 = arg2.method5983((byte) 1, arg4, true);
		local288.method5998(local25, arg1, local35, 0, arg0 - 1, local8, this.aBoolean141, local21);
		if (local72 != null) {
			local288.method5998(local76, local78, local74, 0, arg0 - 1, local8, this.aBoolean141, local72);
		}
		return local288;
	}

	@OriginalMember(owner = "client!eb", name = "b", descriptor = "(I)V")
	public void method1057() {
		if (this.anInt1189 == -1) {
			if (this.aBooleanArray36 == null) {
				this.anInt1189 = 0;
			} else {
				this.anInt1189 = 2;
			}
		}
		if (this.anInt1197 != -1) {
			return;
		}
		if (this.aBooleanArray36 == null) {
			this.anInt1197 = 0;
		} else {
			this.anInt1197 = 2;
		}
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(Lclient!wm;B)V")
	public void method1058(@OriginalArg(0) Class1_Sub19 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method2915();
			if (local9 == 0) {
				return;
			}
			this.method1053(arg0, local9);
		}
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(IZIB)I")
	public int method1059(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		@Pc(5) int local5 = 0;
		@Pc(7) int local7 = 0;
		@Pc(12) int local12 = this.anIntArray127[arg2];
		@Pc(19) Class1_Sub3_Sub14 local19 = null;
		@Pc(27) Class1_Sub3_Sub14 local27 = this.aClass37_1.method671(local12 >> 16);
		@Pc(31) int local31 = local12 & 0xFFFF;
		if (local27 == null) {
			return 0;
		}
		if ((this.aBoolean142 || Static463.aBoolean651) && arg0 != -1 && this.anIntArray127.length > arg0) {
			local7 = this.anIntArray127[arg0];
			local19 = this.aClass37_1.method671(local7 >> 16);
			local7 &= 0xFFFF;
		}
		if (this.aBoolean141) {
			local5 = 512;
		}
		if (local27.method3588(local31)) {
			local5 |= 0x80;
		}
		if (local27.method3591(local31)) {
			local5 |= 0x100;
		}
		if (local27.method3589(local31)) {
			local5 |= 0x400;
		}
		if (local19 != null) {
			if (local19.method3588(local7)) {
				local5 |= 0x80;
			}
			if (local19.method3591(local7)) {
				local5 |= 0x100;
			}
			if (local19.method3589(local7)) {
				local5 |= 0x400;
			}
		}
		if (this.anIntArray128 != null && arg1) {
			@Pc(156) int local156;
			@Pc(169) Class1_Sub3_Sub14 local169;
			if (arg2 < this.anIntArray128.length) {
				local156 = this.anIntArray128[arg2];
				if (local156 != 65535) {
					local169 = this.aClass37_1.method671(local156 >> 16);
					local156 &= 0xFFFF;
					if (local169 != null) {
						if (local169.method3588(local156)) {
							local5 |= 0x80;
						}
						if (local169.method3591(local156)) {
							local5 |= 0x100;
						}
						if (local169.method3589(local156)) {
							local5 |= 0x400;
						}
					}
				}
			}
			if ((this.aBoolean142 || Static463.aBoolean651) && arg0 != -1 && arg0 < this.anIntArray128.length) {
				local156 = this.anIntArray128[arg0];
				if (local156 != 65535) {
					local169 = this.aClass37_1.method671(local156 >> 16);
					local156 &= 0xFFFF;
					if (local169 != null) {
						if (local169.method3588(local156)) {
							local5 |= 0x80;
						}
						if (local169.method3591(local156)) {
							local5 |= 0x100;
						}
						if (local169.method3589(local156)) {
							local5 |= 0x400;
						}
					}
				}
			}
		}
		return local5 | 0x20;
	}
}
