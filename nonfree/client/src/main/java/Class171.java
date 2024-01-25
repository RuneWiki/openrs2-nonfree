import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nm")
public final class Class171 {

	@OriginalMember(owner = "client!nm", name = "c", descriptor = "I")
	public int anInt4250;

	@OriginalMember(owner = "client!nm", name = "h", descriptor = "[I")
	private int[] anIntArray233;

	@OriginalMember(owner = "client!nm", name = "j", descriptor = "[[I")
	public int[][] anIntArrayArray105;

	@OriginalMember(owner = "client!nm", name = "l", descriptor = "[I")
	public int[] anIntArray234;

	@OriginalMember(owner = "client!nm", name = "q", descriptor = "[I")
	public int[] anIntArray235;

	@OriginalMember(owner = "client!nm", name = "r", descriptor = "[Z")
	public boolean[] aBooleanArray19;

	@OriginalMember(owner = "client!nm", name = "t", descriptor = "Lclient!rh;")
	public Class213 aClass213_2;

	@OriginalMember(owner = "client!nm", name = "d", descriptor = "Z")
	public boolean aBoolean332 = false;

	@OriginalMember(owner = "client!nm", name = "b", descriptor = "I")
	public int anInt4249 = -1;

	@OriginalMember(owner = "client!nm", name = "f", descriptor = "Z")
	public boolean aBoolean333 = false;

	@OriginalMember(owner = "client!nm", name = "e", descriptor = "I")
	public int anInt4251 = -1;

	@OriginalMember(owner = "client!nm", name = "g", descriptor = "I")
	public int anInt4252 = 99;

	@OriginalMember(owner = "client!nm", name = "v", descriptor = "Z")
	public boolean aBoolean335 = false;

	@OriginalMember(owner = "client!nm", name = "o", descriptor = "I")
	public int anInt4256 = 2;

	@OriginalMember(owner = "client!nm", name = "w", descriptor = "I")
	public int anInt4259 = -1;

	@OriginalMember(owner = "client!nm", name = "m", descriptor = "Z")
	public boolean aBoolean334 = false;

	@OriginalMember(owner = "client!nm", name = "n", descriptor = "I")
	public int anInt4255 = -1;

	@OriginalMember(owner = "client!nm", name = "x", descriptor = "I")
	public int anInt4260 = -1;

	@OriginalMember(owner = "client!nm", name = "A", descriptor = "I")
	public int anInt4262 = 5;

	static {
		new Class151("Please wait until you are logged out of your previous channel.", "Bitte warte, bis du den vorherigen Chatraum verlassen hast.", "Veuillez attendre d'être déconnecté(e) de votre canal précédent.", "Aguarde até se desconectar do canal anterior.");
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(IILclient!c;III)Lclient!c;")
	public Class33 method3427(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class33 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(8) int local8 = this.anIntArray234[arg4];
		@Pc(13) int local13 = this.anIntArray235[arg4];
		@Pc(21) Class1_Sub3_Sub11 local21 = this.aClass213_2.method4412(local13 >> 16);
		@Pc(25) int local25 = local13 & 0xFFFF;
		if (local21 == null) {
			return arg2.method5383((byte) 1, arg0, true);
		}
		@Pc(35) Class1_Sub3_Sub11 local35 = null;
		if ((this.aBoolean334 || Static240.aBoolean304) && arg3 != -1 && this.anIntArray235.length > arg3) {
			@Pc(54) int local54 = this.anIntArray235[arg3];
			local35 = this.aClass213_2.method4412(local54 >> 16);
			arg3 = local54 & 0xFFFF;
		}
		@Pc(68) Class1_Sub3_Sub11 local68 = null;
		@Pc(76) Class1_Sub3_Sub11 local76 = null;
		@Pc(78) int local78 = 0;
		@Pc(80) int local80 = 0;
		if (this.anIntArray233 != null) {
			if (arg4 < this.anIntArray233.length) {
				local78 = this.anIntArray233[arg4];
				if (local78 != 65535) {
					local68 = this.aClass213_2.method4412(local78 >> 16);
					local78 &= 0xFFFF;
				}
			}
			if ((this.aBoolean334 || Static240.aBoolean304) && arg3 != -1 && this.anIntArray233.length > arg3) {
				local80 = this.anIntArray233[arg3];
				if (local80 != 65535) {
					local76 = this.aClass213_2.method4412(local80 >> 16);
					local80 &= 0xFFFF;
				}
			}
		}
		if (this.aBoolean335) {
			arg0 |= 0x200;
		}
		if (local21.method3068(local25)) {
			arg0 |= 0x80;
		}
		if (local21.method3067(local25)) {
			arg0 |= 0x100;
		}
		if (local21.method3070(local25)) {
			arg0 |= 0x400;
		}
		if (local68 != null) {
			if (local68.method3068(local78)) {
				arg0 |= 0x80;
			}
			if (local68.method3067(local78)) {
				arg0 |= 0x100;
			}
			if (local68.method3070(local78)) {
				arg0 |= 0x400;
			}
		}
		if (local35 != null) {
			if (local35.method3068(arg3)) {
				arg0 |= 0x80;
			}
			if (local35.method3067(arg3)) {
				arg0 |= 0x100;
			}
			if (local35.method3070(arg3)) {
				arg0 |= 0x400;
			}
		}
		if (local76 != null) {
			if (local76.method3068(local80)) {
				arg0 |= 0x80;
			}
			if (local76.method3067(local80)) {
				arg0 |= 0x100;
			}
			if (local76.method3070(local80)) {
				arg0 |= 0x400;
			}
		}
		arg0 |= 0x20;
		@Pc(286) Class33 local286 = arg2.method5383((byte) 1, arg0, true);
		local286.method5392(local21, 0, this.aBoolean335, arg1 - 1, local8, local35, local25, arg3);
		if (local68 != null) {
			local286.method5392(local68, 0, this.aBoolean335, arg1 - 1, local8, local76, local78, local80);
		}
		return local286;
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(IIZI)I")
	public int method3428(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(5) int local5 = 0;
		@Pc(7) int local7 = 0;
		@Pc(12) int local12 = this.anIntArray235[arg0];
		@Pc(19) Class1_Sub3_Sub11 local19 = null;
		@Pc(27) Class1_Sub3_Sub11 local27 = this.aClass213_2.method4412(local12 >> 16);
		@Pc(31) int local31 = local12 & 0xFFFF;
		if (local27 == null) {
			return 0;
		}
		if ((this.aBoolean334 || Static240.aBoolean304) && arg1 != -1 && arg1 < this.anIntArray235.length) {
			local7 = this.anIntArray235[arg1];
			local19 = this.aClass213_2.method4412(local7 >> 16);
			local7 &= 0xFFFF;
		}
		if (this.aBoolean335) {
			local5 = 512;
		}
		if (local27.method3068(local31)) {
			local5 |= 0x80;
		}
		if (local27.method3067(local31)) {
			local5 |= 0x100;
		}
		if (local27.method3070(local31)) {
			local5 |= 0x400;
		}
		if (local19 != null) {
			if (local19.method3068(local7)) {
				local5 |= 0x80;
			}
			if (local19.method3067(local7)) {
				local5 |= 0x100;
			}
			if (local19.method3070(local7)) {
				local5 |= 0x400;
			}
		}
		if (this.anIntArray233 != null && arg2) {
			@Pc(153) int local153;
			@Pc(166) Class1_Sub3_Sub11 local166;
			if (arg0 < this.anIntArray233.length) {
				local153 = this.anIntArray233[arg0];
				if (local153 != 65535) {
					local166 = this.aClass213_2.method4412(local153 >> 16);
					local153 &= 0xFFFF;
					if (local166 != null) {
						if (local166.method3068(local153)) {
							local5 |= 0x80;
						}
						if (local166.method3067(local153)) {
							local5 |= 0x100;
						}
						if (local166.method3070(local153)) {
							local5 |= 0x400;
						}
					}
				}
			}
			if ((this.aBoolean334 || Static240.aBoolean304) && arg1 != -1 && arg1 < this.anIntArray233.length) {
				local153 = this.anIntArray233[arg1];
				if (local153 != 65535) {
					local166 = this.aClass213_2.method4412(local153 >> 16);
					local153 &= 0xFFFF;
					if (local166 != null) {
						if (local166.method3068(local153)) {
							local5 |= 0x80;
						}
						if (local166.method3067(local153)) {
							local5 |= 0x100;
						}
						if (local166.method3070(local153)) {
							local5 |= 0x400;
						}
					}
				}
			}
		}
		return local5 | 0x20;
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(Lclient!dh;I)V")
	public void method3429(@OriginalArg(0) Class1_Sub11 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method4463();
			if (local5 == 0) {
				return;
			}
			this.method3430(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(Lclient!dh;II)V")
	private void method3430(@OriginalArg(0) Class1_Sub11 arg0, @OriginalArg(1) int arg1) {
		@Pc(89) int local89;
		@Pc(95) int local95;
		@Pc(114) int local114;
		@Pc(203) int local203;
		if (arg1 == 1) {
			local89 = arg0.method4485();
			this.anIntArray234 = new int[local89];
			for (local95 = 0; local95 < local89; local95++) {
				this.anIntArray234[local95] = arg0.method4485();
			}
			this.anIntArray235 = new int[local89];
			for (local114 = 0; local114 < local89; local114++) {
				this.anIntArray235[local114] = arg0.method4485();
			}
			for (local203 = 0; local203 < local89; local203++) {
				this.anIntArray235[local203] = (arg0.method4485() << 16) + this.anIntArray235[local203];
			}
		} else if (arg1 == 2) {
			this.anInt4251 = arg0.method4485();
		} else if (arg1 == 3) {
			this.aBooleanArray19 = new boolean[256];
			local89 = arg0.method4463();
			for (local95 = 0; local95 < local89; local95++) {
				this.aBooleanArray19[arg0.method4463()] = true;
			}
		} else if (arg1 == 4) {
			this.aBoolean333 = true;
		} else if (arg1 == 5) {
			this.anInt4262 = arg0.method4463();
		} else if (arg1 == 6) {
			this.anInt4249 = arg0.method4485();
		} else if (arg1 == 7) {
			this.anInt4255 = arg0.method4485();
		} else if (arg1 == 8) {
			this.anInt4252 = arg0.method4463();
		} else if (arg1 == 9) {
			this.anInt4260 = arg0.method4463();
		} else if (arg1 == 10) {
			this.anInt4259 = arg0.method4463();
		} else if (arg1 == 11) {
			this.anInt4256 = arg0.method4463();
		} else if (arg1 == 12) {
			local89 = arg0.method4463();
			this.anIntArray233 = new int[local89];
			for (local95 = 0; local95 < local89; local95++) {
				this.anIntArray233[local95] = arg0.method4485();
			}
			for (local114 = 0; local114 < local89; local114++) {
				this.anIntArray233[local114] += arg0.method4485() << 16;
			}
		} else if (arg1 == 13) {
			local89 = arg0.method4485();
			this.anIntArrayArray105 = new int[local89][];
			for (local95 = 0; local95 < local89; local95++) {
				local114 = arg0.method4463();
				if (local114 > 0) {
					this.anIntArrayArray105[local95] = new int[local114];
					this.anIntArrayArray105[local95][0] = arg0.method4493();
					for (local203 = 1; local203 < local114; local203++) {
						this.anIntArrayArray105[local95][local203] = arg0.method4485();
					}
				}
			}
		} else if (arg1 == 14) {
			this.aBoolean335 = true;
		} else if (arg1 == 15) {
			this.aBoolean334 = true;
		} else if (arg1 == 16) {
			this.aBoolean332 = true;
		}
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(IIIBIILclient!c;I)Lclient!c;")
	public Class33 method3431(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class33 arg5, @OriginalArg(7) int arg6) {
		@Pc(8) int local8 = this.anIntArray234[arg6];
		@Pc(13) int local13 = this.anIntArray235[arg6];
		@Pc(29) Class1_Sub3_Sub11 local29 = this.aClass213_2.method4412(local13 >> 16);
		@Pc(33) int local33 = local13 & 0xFFFF;
		if (local29 == null) {
			return arg5.method5383(arg2, arg1, true);
		}
		@Pc(43) Class1_Sub3_Sub11 local43 = null;
		if ((this.aBoolean334 || Static240.aBoolean304) && arg0 != -1 && arg0 < this.anIntArray235.length) {
			@Pc(65) int local65 = this.anIntArray235[arg0];
			local43 = this.aClass213_2.method4412(local65 >> 16);
			arg0 = local65 & 0xFFFF;
		}
		if (this.aBoolean335) {
			arg1 |= 0x200;
		}
		if (local29.method3068(local33)) {
			arg1 |= 0x80;
		}
		if (local29.method3067(local33)) {
			arg1 |= 0x100;
		}
		if (local29.method3070(local33)) {
			arg1 |= 0x400;
		}
		if (local43 != null) {
			if (local43.method3068(arg0)) {
				arg1 |= 0x80;
			}
			if (local43.method3067(arg0)) {
				arg1 |= 0x100;
			}
			if (local43.method3070(arg0)) {
				arg1 |= 0x400;
			}
		}
		arg1 |= 0x20;
		@Pc(150) Class33 local150 = arg5.method5383(arg2, arg1, true);
		local150.method5392(local29, arg3, this.aBoolean335, arg4 - 1, local8, local43, local33, arg0);
		return local150;
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(I)V")
	public void method3433() {
		if (this.anInt4259 == -1) {
			if (this.aBooleanArray19 == null) {
				this.anInt4259 = 0;
			} else {
				this.anInt4259 = 2;
			}
		}
		if (this.anInt4260 != -1) {
			return;
		}
		if (this.aBooleanArray19 == null) {
			this.anInt4260 = 0;
		} else {
			this.anInt4260 = 2;
		}
	}
}
