import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qea")
public final class Class269 {

	@OriginalMember(owner = "client!qea", name = "a", descriptor = "Lclient!paa;")
	public Class20_Sub8 aClass20_Sub8_6;

	@OriginalMember(owner = "client!qea", name = "b", descriptor = "Lclient!r;")
	private Class6_Sub2_Sub16 aClass6_Sub2_Sub16_3;

	@OriginalMember(owner = "client!qea", name = "e", descriptor = "I")
	private int anInt8126;

	@OriginalMember(owner = "client!qea", name = "j", descriptor = "I")
	private int anInt8131;

	@OriginalMember(owner = "client!qea", name = "s", descriptor = "I")
	private int anInt8138;

	@OriginalMember(owner = "client!qea", name = "u", descriptor = "Lclient!ka;")
	private Class24 aClass24_3;

	@OriginalMember(owner = "client!qea", name = "y", descriptor = "I")
	private int anInt8142;

	@OriginalMember(owner = "client!qea", name = "K", descriptor = "Lclient!ao;")
	private Class21 aClass21_2;

	@OriginalMember(owner = "client!qea", name = "L", descriptor = "[Z")
	private boolean[] aBooleanArray44;

	@OriginalMember(owner = "client!qea", name = "M", descriptor = "Lclient!fe;")
	private Class94 aClass94_2;

	@OriginalMember(owner = "client!qea", name = "c", descriptor = "I")
	private int anInt8124 = 0;

	@OriginalMember(owner = "client!qea", name = "r", descriptor = "I")
	private int anInt8137 = 0;

	@OriginalMember(owner = "client!qea", name = "l", descriptor = "I")
	private int anInt8133 = -1;

	@OriginalMember(owner = "client!qea", name = "D", descriptor = "I")
	private int anInt8146 = -1;

	@OriginalMember(owner = "client!qea", name = "F", descriptor = "I")
	private int anInt8147 = -1;

	@OriginalMember(owner = "client!qea", name = "H", descriptor = "Z")
	private boolean aBoolean554 = false;

	@OriginalMember(owner = "client!qea", name = "z", descriptor = "Z")
	private boolean aBoolean553 = false;

	@OriginalMember(owner = "client!qea", name = "t", descriptor = "I")
	public final int anInt8139;

	@OriginalMember(owner = "client!qea", name = "g", descriptor = "I")
	public final int anInt8128;

	@OriginalMember(owner = "client!qea", name = "h", descriptor = "I")
	public final int anInt8129;

	@OriginalMember(owner = "client!qea", name = "o", descriptor = "B")
	private final byte aByte93;

	@OriginalMember(owner = "client!qea", name = "O", descriptor = "Lclient!vs;")
	private final Class20_Sub2 aClass20_Sub2_19;

	@OriginalMember(owner = "client!qea", name = "I", descriptor = "B")
	private final byte aByte94;

	@OriginalMember(owner = "client!qea", name = "m", descriptor = "Z")
	private final boolean aBoolean552;

	@OriginalMember(owner = "client!qea", name = "<init>", descriptor = "(Lclient!ha;Lclient!su;IIIILclient!vs;ZI)V")
	public Class269(@OriginalArg(0) Class100 arg0, @OriginalArg(1) Class312 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class20_Sub2 arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8) {
		this.anInt8139 = arg1.anInt9241;
		this.anInt8128 = arg3;
		this.anInt8129 = arg2;
		this.aByte93 = (byte) arg5;
		this.aClass20_Sub2_19 = arg6;
		this.aByte94 = (byte) arg4;
		this.aBoolean553 = arg7;
		this.aBoolean552 = arg0.method8798() && arg1.aBoolean629 && !this.aBoolean553;
		if (arg8 != -1) {
			this.aBoolean554 = true;
		}
		this.method7013(arg8);
	}

	@OriginalMember(owner = "client!qea", name = "a", descriptor = "(Lclient!fe;I)V")
	public void method7012(@OriginalArg(0) Class94 arg0) {
		this.aClass24_3 = null;
		this.aClass94_2 = arg0;
	}

	@OriginalMember(owner = "client!qea", name = "a", descriptor = "(ZI)V")
	private void method7013(@OriginalArg(1) int arg0) {
		@Pc(7) int local7 = arg0;
		@Pc(9) boolean local9 = false;
		if (arg0 == -1) {
			@Pc(19) Class312 local19 = Static283.aClass210_2.method5629(this.anInt8139);
			@Pc(21) Class312 local21 = local19;
			if (local19.anIntArray565 != null) {
				local19 = local19.method7866(Static279.aClass294_1);
			}
			if (local19 == null) {
				return;
			}
			if (local21 == local19) {
				local21 = null;
			}
			if (local19.anIntArray566 != null) {
				if (this.aClass21_2 != null && local19.method7854(this.aClass21_2.anInt358)) {
					return;
				}
				local7 = local19.method7865();
				if (this.anInt8133 != local19.anInt9241) {
					local9 = local19.aBoolean621;
				}
			} else if (local19.anInt9196 == -1) {
				if (local21 != null && local21.anIntArray566 != null) {
					if (this.aClass21_2 != null && local21.method7854(this.aClass21_2.anInt358)) {
						return;
					}
					local7 = local21.method7865();
					if (this.anInt8133 != local21.anInt9241) {
						local9 = local21.aBoolean621;
					}
				} else if (local21 != null && local21.anInt9196 != -1 && this.anInt8133 != local21.anInt9241) {
					local9 = local21.aBoolean621;
					local7 = local21.anInt9196;
				}
			} else if (local19.anInt9241 != this.anInt8133) {
				local7 = local19.anInt9196;
				local9 = local19.aBoolean621;
			}
		}
		if (local7 == -1) {
			this.aClass21_2 = null;
			return;
		}
		this.aClass24_3 = null;
		if (this.aClass21_2 == null || local7 != this.aClass21_2.anInt358) {
			this.aClass21_2 = Static294.aClass373_2.method8738(local7);
		} else if (this.aClass21_2.anInt351 == 0) {
			return;
		}
		if (this.aClass21_2.anIntArray15 == null) {
			this.aClass21_2 = null;
			return;
		}
		if (local9) {
			this.anInt8142 = (int) ((double) this.aClass21_2.anIntArray15.length * Math.random());
			this.anInt8126 = (int) ((double) this.aClass21_2.anIntArray17[this.anInt8142] * Math.random()) + 1;
		} else {
			this.anInt8126 = 1;
			this.anInt8142 = 0;
		}
		this.anInt8131 = this.anInt8142 + 1;
		if (this.anInt8131 < 0 || this.aClass21_2.anIntArray15.length <= this.anInt8131) {
			this.anInt8131 = -1;
		}
		this.anInt8138 = Static113.anInt2243 - this.anInt8126;
	}

	@OriginalMember(owner = "client!qea", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass20_Sub8_6 != null) {
			this.aClass20_Sub8_6.method6633();
		}
	}

	@OriginalMember(owner = "client!qea", name = "a", descriptor = "(I)I")
	public int method7014() {
		return this.anInt8137;
	}

	@OriginalMember(owner = "client!qea", name = "b", descriptor = "(I)I")
	public int method7015(@OriginalArg(0) int arg0) {
		if (arg0 < 104) {
			this.finalize();
		}
		return this.anInt8124;
	}

	@OriginalMember(owner = "client!qea", name = "c", descriptor = "(I)Z")
	public boolean method7016() {
		return this.aBoolean552;
	}

	@OriginalMember(owner = "client!qea", name = "a", descriptor = "(IB)V")
	public void method7018(@OriginalArg(0) int arg0) {
		this.aBoolean554 = true;
		this.method7013(arg0);
	}

	@OriginalMember(owner = "client!qea", name = "a", descriptor = "(Lclient!ha;IIZZ)Lclient!ka;")
	public Class24 method7019(@OriginalArg(0) Class100 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) boolean arg3) {
		@Pc(11) Class312 local11 = Static283.aClass210_2.method5629(this.anInt8139);
		if (local11.anIntArray565 != null) {
			local11 = local11.method7866(Static279.aClass294_1);
		}
		if (local11 == null) {
			this.method7023(arg0);
			this.anInt8147 = -1;
			this.anInt8133 = -1;
			this.anInt8146 = -1;
			return null;
		}
		if (!this.aBoolean554 && local11.anInt9241 != this.anInt8133) {
			this.aClass24_3 = null;
			this.method7013(-1);
		}
		this.method7020(this.aClass20_Sub2_19);
		if (arg3) {
			@Pc(75) boolean local75 = arg3 & this.aBoolean552 & Static348.aClass6_Sub22_19.aClass15_Sub26_1.method8642() != 0;
			arg3 = local75 & (this.anInt8146 != local11.anInt9241 || this.aClass21_2 != null && Static348.aClass6_Sub22_19.aClass15_Sub26_1.method8642() >= 2 && (this.anInt8147 != this.anInt8142 || (this.aClass21_2.aBoolean10 || Static43.aBoolean46) && this.anInt8142 != this.anInt8131));
		}
		if (arg2 && !arg3) {
			this.anInt8133 = local11.anInt9241;
			return null;
		}
		if (arg3) {
			Static546.method7957(this.aClass6_Sub2_Sub16_3, this.aByte93, this.aClass20_Sub2_19.anInt10725, this.aClass20_Sub2_19.anInt10729, this.aBooleanArray44);
			this.anInt8147 = -1;
			this.anInt8146 = -1;
		}
		@Pc(155) Class199 local155 = Static195.aClass199Array1[this.aByte93];
		@Pc(162) Class199 local162;
		if (this.aBoolean553) {
			local162 = Static228.aClass199Array2[0];
		} else {
			local162 = this.aByte93 >= 3 ? null : Static195.aClass199Array1[this.aByte93 + 1];
		}
		@Pc(181) Class24 local181 = null;
		if (this.aClass21_2 != null) {
			if (arg3) {
				arg1 |= 0x40000;
			}
			local181 = local11.method7864(this.aClass20_Sub2_19.anInt10725, this.anInt8131, this.anInt8129 == 11 ? 10 : this.anInt8129, this.aClass20_Sub2_19.anInt10729, arg1, this.anInt8126, local155.method8531(this.aClass20_Sub2_19.anInt10729, this.aClass20_Sub2_19.anInt10725), this.aClass21_2, local155, this.anInt8142, local162, this.anInt8129 == 11 ? this.anInt8128 + 4 : this.anInt8128, arg0, this.aClass94_2);
			if (local181 == null) {
				this.aClass6_Sub2_Sub16_3 = null;
				this.anInt8124 = 0;
				this.aBooleanArray44 = null;
				this.anInt8137 = 0;
			} else {
				if (arg3) {
					if (this.aBooleanArray44 == null) {
						this.aBooleanArray44 = new boolean[4];
					}
					this.aClass6_Sub2_Sub16_3 = local181.ba(this.aClass6_Sub2_Sub16_3);
					Static635.method8386(this.aClass6_Sub2_Sub16_3, this.aByte93, this.aClass20_Sub2_19.anInt10725, this.aClass20_Sub2_19.anInt10729, this.aBooleanArray44);
					this.anInt8147 = this.anInt8142;
					this.anInt8146 = local11.anInt9241;
				}
				this.anInt8137 = local181.fa();
				this.anInt8124 = local181.ma();
			}
			this.aClass24_3 = null;
		} else if (this.aClass24_3 != null && (arg1 & this.aClass24_3.ua()) == arg1 && this.anInt8133 == local11.anInt9241) {
			local181 = this.aClass24_3;
		} else {
			if (this.aClass24_3 != null) {
				arg1 |= this.aClass24_3.ua();
			}
			@Pc(268) Class280 local268 = local11.method7867(arg3, local162, this.anInt8129 == 11 ? this.anInt8128 + 4 : this.anInt8128, local155.method8531(this.aClass20_Sub2_19.anInt10729, this.aClass20_Sub2_19.anInt10725), arg1, this.aClass94_2, this.anInt8129 == 11 ? 10 : this.anInt8129, arg0, this.aClass20_Sub2_19.anInt10725, this.aClass20_Sub2_19.anInt10729, local155);
			if (local268 == null) {
				this.aBooleanArray44 = null;
				this.aClass24_3 = null;
				this.anInt8124 = 0;
				this.anInt8137 = 0;
				this.aClass6_Sub2_Sub16_3 = null;
			} else {
				local181 = local268.aClass24_4;
				this.aClass24_3 = local268.aClass24_4;
				if (arg3) {
					this.aBooleanArray44 = null;
					this.aClass6_Sub2_Sub16_3 = local268.aClass6_Sub2_Sub16_4;
					Static635.method8386(this.aClass6_Sub2_Sub16_3, this.aByte93, this.aClass20_Sub2_19.anInt10725, this.aClass20_Sub2_19.anInt10729, (boolean[]) null);
					this.anInt8146 = local11.anInt9241;
					this.anInt8147 = -1;
				}
				this.anInt8137 = local181.fa();
				this.anInt8124 = local181.ma();
			}
		}
		this.anInt8133 = local11.anInt9241;
		return local181;
	}

	@OriginalMember(owner = "client!qea", name = "a", descriptor = "(ILclient!vs;)V")
	private void method7020(@OriginalArg(1) Class20_Sub2 arg0) {
		label80: while (true) {
			if (this.aClass21_2 == null) {
				if (this.aBoolean554) {
					return;
				}
				this.method7013(-1);
				if (this.aClass21_2 == null) {
					return;
				}
			}
			@Pc(33) int local33 = Static113.anInt2243 - this.anInt8138;
			if (local33 > 100 && this.aClass21_2.anInt346 > 0) {
				@Pc(52) int local52 = this.aClass21_2.anIntArray15.length - this.aClass21_2.anInt346;
				while (local52 > this.anInt8142 && local33 > this.aClass21_2.anIntArray17[this.anInt8142]) {
					local33 -= this.aClass21_2.anIntArray17[this.anInt8142];
					this.anInt8142++;
				}
				if (local52 <= this.anInt8142) {
					@Pc(91) int local91 = 0;
					for (@Pc(93) int local93 = local52; local93 < this.aClass21_2.anIntArray15.length; local93++) {
						local91 += this.aClass21_2.anIntArray17[local93];
					}
					local33 %= local91;
				}
				this.anInt8131 = this.anInt8142 + 1;
				if (this.anInt8131 >= this.aClass21_2.anIntArray15.length) {
					this.anInt8131 -= this.aClass21_2.anInt346;
					if (this.anInt8131 < 0 || this.anInt8131 >= this.aClass21_2.anIntArray15.length) {
						this.anInt8131 = -1;
					}
				}
			}
			while (local33 > this.aClass21_2.anIntArray17[this.anInt8142]) {
				Static558.method8052(this.anInt8142, arg0, this.aClass21_2);
				local33 -= this.aClass21_2.anIntArray17[this.anInt8142];
				this.anInt8142++;
				if (this.anInt8142 >= this.aClass21_2.anIntArray15.length) {
					this.anInt8142 -= this.aClass21_2.anInt346;
					if (this.anInt8142 < 0 || this.anInt8142 >= this.aClass21_2.anIntArray15.length) {
						this.aClass21_2 = null;
						continue label80;
					}
				}
				this.anInt8131 = this.anInt8142 + 1;
				if (this.anInt8131 >= this.aClass21_2.anIntArray15.length) {
					this.anInt8131 -= this.aClass21_2.anInt346;
					if (this.anInt8131 < 0 || this.aClass21_2.anIntArray15.length <= this.anInt8131) {
						this.anInt8131 = -1;
					}
				}
			}
			this.anInt8138 = Static113.anInt2243 - local33;
			this.anInt8126 = local33;
			return;
		}
	}

	@OriginalMember(owner = "client!qea", name = "a", descriptor = "(ILclient!ha;)V")
	public void method7021(@OriginalArg(1) Class100 arg0) {
		this.method7019(arg0, 262144, true, true);
	}

	@OriginalMember(owner = "client!qea", name = "a", descriptor = "(IZILclient!ql;ILclient!ha;ILclient!ka;I)V")
	public void method7022(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class154 arg3, @OriginalArg(5) Class100 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class24 arg6, @OriginalArg(8) int arg7) {
		@Pc(17) Class382[] local17 = arg6.method6853();
		@Pc(20) Class243[] local20 = arg6.method6865();
		if ((this.aClass20_Sub8_6 == null || this.aClass20_Sub8_6.aBoolean519) && (local17 != null || local20 != null)) {
			@Pc(37) Class312 local37 = Static283.aClass210_2.method5629(this.anInt8139);
			if (local37.anIntArray565 != null) {
				local37 = local37.method7866(Static279.aClass294_1);
			}
			if (local37 != null) {
				this.aClass20_Sub8_6 = Static423.method6632(Static113.anInt2243, true);
			}
		}
		if (this.aClass20_Sub8_6 == null) {
			return;
		}
		arg6.method6861(arg3);
		if (arg1) {
			this.aClass20_Sub8_6.method6634(arg4, (long) Static113.anInt2243, local17, local20);
		} else {
			this.aClass20_Sub8_6.method6645((long) Static113.anInt2243);
		}
		this.aClass20_Sub8_6.method6636(this.aByte94, arg5, arg7, arg2, arg0);
	}

	@OriginalMember(owner = "client!qea", name = "b", descriptor = "(ILclient!ha;)V")
	public void method7023(@OriginalArg(1) Class100 arg0) {
		if (this.aClass6_Sub2_Sub16_3 != null) {
			Static546.method7957(this.aClass6_Sub2_Sub16_3, this.aByte93, this.aClass20_Sub2_19.anInt10725, this.aClass20_Sub2_19.anInt10729, this.aBooleanArray44);
			this.aBooleanArray44 = null;
			this.aClass6_Sub2_Sub16_3 = null;
		}
	}
}
