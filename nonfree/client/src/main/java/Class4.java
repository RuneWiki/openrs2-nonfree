import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aba")
public final class Class4 {

	@OriginalMember(owner = "client!aba", name = "z", descriptor = "[C")
	private static final char[] aCharArray1;

	@OriginalMember(owner = "client!aba", name = "g", descriptor = "[I")
	public int[] anIntArray11;

	@OriginalMember(owner = "client!aba", name = "h", descriptor = "[Z")
	public boolean[] aBooleanArray1;

	@OriginalMember(owner = "client!aba", name = "i", descriptor = "Lclient!kca;")
	public Class157 aClass157_1;

	@OriginalMember(owner = "client!aba", name = "p", descriptor = "[[I")
	public int[][] anIntArrayArray1;

	@OriginalMember(owner = "client!aba", name = "r", descriptor = "[I")
	public int[] anIntArray12;

	@OriginalMember(owner = "client!aba", name = "w", descriptor = "I")
	public int anInt130;

	@OriginalMember(owner = "client!aba", name = "y", descriptor = "[I")
	private int[] anIntArray13;

	@OriginalMember(owner = "client!aba", name = "c", descriptor = "Z")
	public boolean aBoolean8 = false;

	@OriginalMember(owner = "client!aba", name = "l", descriptor = "I")
	public int anInt123 = 2;

	@OriginalMember(owner = "client!aba", name = "n", descriptor = "I")
	public int anInt125 = 0;

	@OriginalMember(owner = "client!aba", name = "a", descriptor = "I")
	public int anInt116 = -1;

	@OriginalMember(owner = "client!aba", name = "o", descriptor = "I")
	public int anInt126 = -1;

	@OriginalMember(owner = "client!aba", name = "j", descriptor = "I")
	public int anInt121 = -1;

	@OriginalMember(owner = "client!aba", name = "q", descriptor = "I")
	public int anInt127 = 99;

	@OriginalMember(owner = "client!aba", name = "t", descriptor = "Z")
	public boolean aBoolean9 = false;

	@OriginalMember(owner = "client!aba", name = "d", descriptor = "I")
	public int anInt118 = -1;

	@OriginalMember(owner = "client!aba", name = "v", descriptor = "Z")
	public boolean aBoolean10 = false;

	@OriginalMember(owner = "client!aba", name = "s", descriptor = "I")
	public int anInt128 = 5;

	@OriginalMember(owner = "client!aba", name = "e", descriptor = "I")
	public int anInt119 = -1;

	static {
		new Class202("Error joining clan channel - please try again later!", "Fehler beim Betreten des Chatraums - bitte versuch es später erneut.", "Erreur lors de la connexion au canal de clan - veuillez réessayer ultérieurement.", "Erro ao entrar no canal do clã. Tente de novo depois!");
		aCharArray1 = new char[64];
		for (@Pc(10) int local10 = 0; local10 < 26; local10++) {
			aCharArray1[local10] = (char) (local10 + 65);
		}
		for (@Pc(26) int local26 = 26; local26 < 52; local26++) {
			aCharArray1[local26] = (char) (local26 + 97 - 26);
		}
		for (@Pc(44) int local44 = 52; local44 < 62; local44++) {
			aCharArray1[local44] = (char) (local44 + 48 - 52);
		}
		aCharArray1[62] = '+';
		aCharArray1[63] = '/';
	}

	@OriginalMember(owner = "client!aba", name = "a", descriptor = "(ILclient!ps;I)V")
	private void method269(@OriginalArg(1) Class2_Sub29 arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12;
		@Pc(18) int local18;
		@Pc(41) int local41;
		@Pc(56) int local56;
		if (arg1 == 1) {
			local12 = arg0.method5229();
			this.anIntArray12 = new int[local12];
			for (local18 = 0; local18 < local12; local18++) {
				this.anIntArray12[local18] = arg0.method5229();
			}
			this.anIntArray11 = new int[local12];
			for (local41 = 0; local41 < local12; local41++) {
				this.anIntArray11[local41] = arg0.method5229();
			}
			for (local56 = 0; local56 < local12; local56++) {
				this.anIntArray11[local56] = (arg0.method5229() << 16) + this.anIntArray11[local56];
			}
		} else if (arg1 == 2) {
			this.anInt116 = arg0.method5229();
		} else if (arg1 == 3) {
			this.aBooleanArray1 = new boolean[256];
			local12 = arg0.method5170();
			for (local18 = 0; local18 < local12; local18++) {
				this.aBooleanArray1[arg0.method5170()] = true;
			}
		} else if (arg1 == 5) {
			this.anInt128 = arg0.method5170();
		} else if (arg1 == 6) {
			this.anInt118 = arg0.method5229();
		} else if (arg1 == 7) {
			this.anInt119 = arg0.method5229();
		} else if (arg1 == 8) {
			this.anInt127 = arg0.method5170();
		} else if (arg1 == 9) {
			this.anInt121 = arg0.method5170();
		} else if (arg1 == 10) {
			this.anInt126 = arg0.method5170();
		} else if (arg1 == 11) {
			this.anInt123 = arg0.method5170();
		} else if (arg1 == 12) {
			local12 = arg0.method5170();
			this.anIntArray13 = new int[local12];
			for (local18 = 0; local18 < local12; local18++) {
				this.anIntArray13[local18] = arg0.method5229();
			}
			for (local41 = 0; local41 < local12; local41++) {
				this.anIntArray13[local41] += arg0.method5229() << 16;
			}
		} else if (arg1 == 13) {
			local12 = arg0.method5229();
			this.anIntArrayArray1 = new int[local12][];
			for (local18 = 0; local18 < local12; local18++) {
				local41 = arg0.method5170();
				if (local41 > 0) {
					this.anIntArrayArray1[local18] = new int[local41];
					this.anIntArrayArray1[local18][0] = arg0.method5210();
					for (local56 = 1; local56 < local41; local56++) {
						this.anIntArrayArray1[local18][local56] = arg0.method5229();
					}
				}
			}
		} else if (arg1 == 14) {
			this.aBoolean10 = true;
		} else if (arg1 == 15) {
			this.aBoolean9 = true;
		} else if (arg1 == 16) {
			this.aBoolean8 = true;
		} else if (arg1 == 17) {
			this.anInt125 = arg0.method5170();
		}
	}

	@OriginalMember(owner = "client!aba", name = "a", descriptor = "(BILclient!r;IBIII)Lclient!r;")
	public Class63 method270(@OriginalArg(1) int arg0, @OriginalArg(2) Class63 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) byte arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(8) int local8 = this.anIntArray12[arg6];
		@Pc(13) int local13 = this.anIntArray11[arg6];
		@Pc(21) Class2_Sub13_Sub18 local21 = this.aClass157_1.method3747(local13 >> 16);
		@Pc(25) int local25 = local13 & 0xFFFF;
		if (local21 == null) {
			return arg1.method7706(arg3, arg2, true);
		}
		@Pc(35) Class2_Sub13_Sub18 local35 = null;
		if ((this.aBoolean9 || Static112.aBoolean204) && arg4 != -1 && this.anIntArray11.length > arg4) {
			@Pc(54) int local54 = this.anIntArray11[arg4];
			local35 = this.aClass157_1.method3747(local54 >> 16);
			arg4 = local54 & 0xFFFF;
		}
		if (this.aBoolean10) {
			arg2 |= 0x200;
		}
		if (local21.method7536(local25)) {
			arg2 |= 0x80;
		}
		if (local21.method7534(local25)) {
			arg2 |= 0x100;
		}
		if (local21.method7533(local25)) {
			arg2 |= 0x400;
		}
		if (local35 != null) {
			if (local35.method7536(arg4)) {
				arg2 |= 0x80;
			}
			if (local35.method7534(arg4)) {
				arg2 |= 0x100;
			}
			if (local35.method7533(arg4)) {
				arg2 |= 0x400;
			}
		}
		arg2 |= 0x20;
		@Pc(144) Class63 local144 = arg1.method7706(arg3, arg2, true);
		local144.method7698(local21, this.aBoolean10, local25, arg5, local35, local8, arg0 - 1, arg4);
		return local144;
	}

	@OriginalMember(owner = "client!aba", name = "a", descriptor = "(IIIILclient!r;Z)Lclient!r;")
	public Class63 method271(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class63 arg4) {
		@Pc(8) int local8 = this.anIntArray12[arg3];
		@Pc(13) int local13 = this.anIntArray11[arg3];
		@Pc(21) Class2_Sub13_Sub18 local21 = this.aClass157_1.method3747(local13 >> 16);
		@Pc(25) int local25 = local13 & 0xFFFF;
		if (local21 == null) {
			return arg4.method7706((byte) 1, arg0, true);
		}
		@Pc(35) Class2_Sub13_Sub18 local35 = null;
		if ((this.aBoolean9 || Static112.aBoolean204) && arg1 != -1 && this.anIntArray11.length > arg1) {
			@Pc(53) int local53 = this.anIntArray11[arg1];
			local35 = this.aClass157_1.method3747(local53 >> 16);
			arg1 = local53 & 0xFFFF;
		}
		@Pc(67) Class2_Sub13_Sub18 local67 = null;
		@Pc(69) Class2_Sub13_Sub18 local69 = null;
		@Pc(71) int local71 = 0;
		@Pc(73) int local73 = 0;
		if (this.anIntArray13 != null) {
			if (this.anIntArray13.length > arg3) {
				local71 = this.anIntArray13[arg3];
				if (local71 != 65535) {
					local67 = this.aClass157_1.method3747(local71 >> 16);
					local71 &= 0xFFFF;
				}
			}
			if ((this.aBoolean9 || Static112.aBoolean204) && arg1 != -1 && arg1 < this.anIntArray13.length) {
				local73 = this.anIntArray13[arg1];
				if (local73 != 65535) {
					local69 = this.aClass157_1.method3747(local73 >> 16);
					local73 &= 0xFFFF;
				}
			}
		}
		if (this.aBoolean10) {
			arg0 |= 0x200;
		}
		if (local21.method7536(local25)) {
			arg0 |= 0x80;
		}
		if (local21.method7534(local25)) {
			arg0 |= 0x100;
		}
		if (local21.method7533(local25)) {
			arg0 |= 0x400;
		}
		if (local67 != null) {
			if (local67.method7536(local71)) {
				arg0 |= 0x80;
			}
			if (local67.method7534(local71)) {
				arg0 |= 0x100;
			}
			if (local67.method7533(local71)) {
				arg0 |= 0x400;
			}
		}
		if (local35 != null) {
			if (local35.method7536(arg1)) {
				arg0 |= 0x80;
			}
			if (local35.method7534(arg1)) {
				arg0 |= 0x100;
			}
			if (local35.method7533(arg1)) {
				arg0 |= 0x400;
			}
		}
		if (local69 != null) {
			if (local69.method7536(local73)) {
				arg0 |= 0x80;
			}
			if (local69.method7534(local73)) {
				arg0 |= 0x100;
			}
			if (local69.method7533(local73)) {
				arg0 |= 0x400;
			}
		}
		arg0 |= 0x20;
		@Pc(275) Class63 local275 = arg4.method7706((byte) 1, arg0, true);
		local275.method7698(local21, this.aBoolean10, local25, 0, local35, local8, arg2 - 1, arg1);
		if (local67 != null) {
			local275.method7698(local67, this.aBoolean10, local71, 0, local69, local8, arg2 - 1, local73);
		}
		return local275;
	}

	@OriginalMember(owner = "client!aba", name = "a", descriptor = "(I)V")
	public void method272() {
		if (this.anInt121 == -1) {
			if (this.aBooleanArray1 == null) {
				this.anInt121 = 0;
			} else {
				this.anInt121 = 2;
			}
		}
		if (this.anInt126 != -1) {
			return;
		}
		if (this.aBooleanArray1 == null) {
			this.anInt126 = 0;
		} else {
			this.anInt126 = 2;
		}
	}

	@OriginalMember(owner = "client!aba", name = "a", descriptor = "(BLclient!ps;)V")
	public void method274(@OriginalArg(1) Class2_Sub29 arg0) {
		while (true) {
			@Pc(10) int local10 = arg0.method5170();
			if (local10 == 0) {
				return;
			}
			this.method269(arg0, local10);
		}
	}

	@OriginalMember(owner = "client!aba", name = "a", descriptor = "(BZII)I")
	public int method275(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(5) int local5 = 0;
		@Pc(7) int local7 = 0;
		@Pc(12) int local12 = this.anIntArray11[arg1];
		@Pc(14) Class2_Sub13_Sub18 local14 = null;
		@Pc(22) Class2_Sub13_Sub18 local22 = this.aClass157_1.method3747(local12 >> 16);
		@Pc(26) int local26 = local12 & 0xFFFF;
		if (local22 == null) {
			return 0;
		}
		if ((this.aBoolean9 || Static112.aBoolean204) && arg2 != -1 && arg2 < this.anIntArray11.length) {
			local7 = this.anIntArray11[arg2];
			local14 = this.aClass157_1.method3747(local7 >> 16);
			local7 &= 0xFFFF;
		}
		if (this.aBoolean10) {
			local5 = 512;
		}
		if (local22.method7536(local26)) {
			local5 |= 0x80;
		}
		if (local22.method7534(local26)) {
			local5 |= 0x100;
		}
		if (local22.method7533(local26)) {
			local5 |= 0x400;
		}
		if (local14 != null) {
			if (local14.method7536(local7)) {
				local5 |= 0x80;
			}
			if (local14.method7534(local7)) {
				local5 |= 0x100;
			}
			if (local14.method7533(local7)) {
				local5 |= 0x400;
			}
		}
		if (this.anIntArray13 != null && arg0) {
			@Pc(155) int local155;
			@Pc(168) Class2_Sub13_Sub18 local168;
			if (this.anIntArray13.length > arg1) {
				local155 = this.anIntArray13[arg1];
				if (local155 != 65535) {
					local168 = this.aClass157_1.method3747(local155 >> 16);
					local155 &= 0xFFFF;
					if (local168 != null) {
						if (local168.method7536(local155)) {
							local5 |= 0x80;
						}
						if (local168.method7534(local155)) {
							local5 |= 0x100;
						}
						if (local168.method7533(local155)) {
							local5 |= 0x400;
						}
					}
				}
			}
			if ((this.aBoolean9 || Static112.aBoolean204) && arg2 != -1 && arg2 < this.anIntArray13.length) {
				local155 = this.anIntArray13[arg2];
				if (local155 != 65535) {
					local168 = this.aClass157_1.method3747(local155 >> 16);
					local155 &= 0xFFFF;
					if (local168 != null) {
						if (local168.method7536(local155)) {
							local5 |= 0x80;
						}
						if (local168.method7534(local155)) {
							local5 |= 0x100;
						}
						if (local168.method7533(local155)) {
							local5 |= 0x400;
						}
					}
				}
			}
		}
		return local5 | 0x20;
	}
}
