import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hw")
public final class Class157 {

	@OriginalMember(owner = "client!hw", name = "d", descriptor = "I")
	private int anInt4477;

	@OriginalMember(owner = "client!hw", name = "h", descriptor = "Lclient!r;")
	private Class5_Sub3_Sub7 aClass5_Sub3_Sub7_1;

	@OriginalMember(owner = "client!hw", name = "p", descriptor = "I")
	private int anInt4484;

	@OriginalMember(owner = "client!hw", name = "r", descriptor = "Lclient!jba;")
	private Class175 aClass175_1;

	@OriginalMember(owner = "client!hw", name = "u", descriptor = "I")
	private int anInt4487;

	@OriginalMember(owner = "client!hw", name = "w", descriptor = "[Z")
	private boolean[] aBooleanArray20;

	@OriginalMember(owner = "client!hw", name = "A", descriptor = "Lclient!ka;")
	private Class153 aClass153_2;

	@OriginalMember(owner = "client!hw", name = "E", descriptor = "I")
	private int anInt4494;

	@OriginalMember(owner = "client!hw", name = "I", descriptor = "Lclient!nia;")
	public Class28_Sub5 aClass28_Sub5_3;

	@OriginalMember(owner = "client!hw", name = "M", descriptor = "Lclient!mea;")
	private Class225 aClass225_2;

	@OriginalMember(owner = "client!hw", name = "q", descriptor = "Z")
	private boolean aBoolean364 = false;

	@OriginalMember(owner = "client!hw", name = "f", descriptor = "I")
	private int anInt4479 = 0;

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "I")
	private int anInt4474 = -1;

	@OriginalMember(owner = "client!hw", name = "x", descriptor = "I")
	private int anInt4488 = -1;

	@OriginalMember(owner = "client!hw", name = "H", descriptor = "I")
	private int anInt4497 = -1;

	@OriginalMember(owner = "client!hw", name = "v", descriptor = "Z")
	private boolean aBoolean365 = false;

	@OriginalMember(owner = "client!hw", name = "C", descriptor = "I")
	private int anInt4492 = 0;

	@OriginalMember(owner = "client!hw", name = "o", descriptor = "Lclient!lq;")
	private final Class28_Sub1 aClass28_Sub1_11;

	@OriginalMember(owner = "client!hw", name = "D", descriptor = "I")
	public final int anInt4493;

	@OriginalMember(owner = "client!hw", name = "y", descriptor = "I")
	public final int anInt4489;

	@OriginalMember(owner = "client!hw", name = "m", descriptor = "B")
	private final byte aByte63;

	@OriginalMember(owner = "client!hw", name = "i", descriptor = "I")
	public final int anInt4480;

	@OriginalMember(owner = "client!hw", name = "g", descriptor = "B")
	private final byte aByte62;

	@OriginalMember(owner = "client!hw", name = "O", descriptor = "Z")
	private final boolean aBoolean366;

	@OriginalMember(owner = "client!hw", name = "<init>", descriptor = "(Lclient!ha;Lclient!ih;IIIILclient!lq;ZI)V")
	public Class157(@OriginalArg(0) Class65 arg0, @OriginalArg(1) Class164 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class28_Sub1 arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8) {
		this.aClass28_Sub1_11 = arg6;
		this.aBoolean365 = arg7;
		this.anInt4493 = arg1.anInt4670;
		this.anInt4489 = arg3;
		this.aByte63 = (byte) arg4;
		this.anInt4480 = arg2;
		this.aByte62 = (byte) arg5;
		this.aBoolean366 = arg0.method6917() && arg1.aBoolean383 && !this.aBoolean365;
		if (arg8 != -1) {
			this.aBoolean364 = true;
		}
		this.method3784(arg8);
	}

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "(BI)V")
	private void method3784(@OriginalArg(1) int arg0) {
		@Pc(5) int local5 = arg0;
		@Pc(7) boolean local7 = false;
		if (arg0 == -1) {
			@Pc(16) Class164 local16 = Static568.aClass315_5.method7511(this.anInt4493);
			@Pc(18) Class164 local18 = local16;
			if (local16.anIntArray247 != null) {
				local16 = local16.method3908(Static161.aClass237_3);
			}
			if (local16 == null) {
				return;
			}
			if (local16 == local18) {
				local18 = null;
			}
			if (local16.anIntArray246 != null) {
				if (this.aClass175_1 != null && local16.method3913(this.aClass175_1.anInt5031)) {
					return;
				}
				local5 = local16.method3910();
				if (this.anInt4474 != local16.anInt4670) {
					local7 = local16.aBoolean374;
				}
			} else if (local16.anInt4678 == -1) {
				if (local18 != null && local18.anIntArray246 != null) {
					if (this.aClass175_1 != null && local18.method3913(this.aClass175_1.anInt5031)) {
						return;
					}
					local5 = local18.method3910();
					if (this.anInt4474 != local18.anInt4670) {
						local7 = local18.aBoolean374;
					}
				} else if (local18 != null && local18.anInt4678 != -1 && this.anInt4474 != local18.anInt4670) {
					local7 = local18.aBoolean374;
					local5 = local18.anInt4678;
				}
			} else if (this.anInt4474 != local16.anInt4670) {
				local5 = local16.anInt4678;
				local7 = local16.aBoolean374;
			}
		}
		if (local5 == -1) {
			this.aClass175_1 = null;
			return;
		}
		this.aClass153_2 = null;
		if (this.aClass175_1 == null || this.aClass175_1.anInt5031 != local5) {
			this.aClass175_1 = Static591.aClass66_2.method1768(local5);
		} else if (this.aClass175_1.anInt5022 == 0) {
			return;
		}
		if (this.aClass175_1.anIntArray288 == null) {
			this.aClass175_1 = null;
			return;
		}
		if (local7) {
			this.anInt4477 = (int) (Math.random() * (double) this.aClass175_1.anIntArray288.length);
			this.anInt4484 = (int) (Math.random() * (double) this.aClass175_1.anIntArray291[this.anInt4477]) + 1;
		} else {
			this.anInt4477 = 0;
			this.anInt4484 = 1;
		}
		this.anInt4487 = this.anInt4477 + 1;
		if (this.anInt4487 < 0 || this.anInt4487 >= this.aClass175_1.anIntArray288.length) {
			this.anInt4487 = -1;
		}
		this.anInt4494 = Static26.anInt350 - this.anInt4484;
	}

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "(I)I")
	public int method3786(@OriginalArg(0) int arg0) {
		return arg0 == 0 ? this.anInt4492 : -104;
	}

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "(ILclient!ka;IZILclient!oha;Lclient!ha;II)V")
	public void method3787(@OriginalArg(0) int arg0, @OriginalArg(1) Class153 arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class254 arg4, @OriginalArg(6) Class65 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(6) Class313[] local6 = arg1.method8575();
		@Pc(9) Class209[] local9 = arg1.method8587();
		if ((this.aClass28_Sub5_3 == null || this.aClass28_Sub5_3.aBoolean608) && (local6 != null || local9 != null)) {
			@Pc(31) Class164 local31 = Static568.aClass315_5.method7511(this.anInt4493);
			if (local31.anIntArray247 != null) {
				local31 = local31.method3908(Static161.aClass237_3);
			}
			if (local31 != null) {
				this.aClass28_Sub5_3 = Static398.method5855(Static26.anInt350, true);
			}
		}
		if (this.aClass28_Sub5_3 == null) {
			return;
		}
		arg1.method8589(arg4);
		if (arg2) {
			this.aClass28_Sub5_3.method5852(arg5, (long) Static26.anInt350, local6, local9);
		} else {
			this.aClass28_Sub5_3.method5848((long) Static26.anInt350);
		}
		this.aClass28_Sub5_3.method5845(this.aByte63, arg3, arg6, arg7, arg0);
	}

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "(Lclient!ha;I)V")
	public void method3788(@OriginalArg(0) Class65 arg0) {
		this.method3789(262144, true, arg0, true);
	}

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "(IIZLclient!ha;Z)Lclient!ka;")
	public Class153 method3789(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Class65 arg2, @OriginalArg(4) boolean arg3) {
		@Pc(9) Class164 local9 = Static568.aClass315_5.method7511(this.anInt4493);
		if (local9.anIntArray247 != null) {
			local9 = local9.method3908(Static161.aClass237_3);
		}
		if (local9 == null) {
			this.method3790(arg2);
			this.anInt4474 = -1;
			this.anInt4488 = -1;
			this.anInt4497 = -1;
			return null;
		}
		if (!this.aBoolean364 && local9.anInt4670 != this.anInt4474) {
			this.aClass153_2 = null;
			this.method3784(-1);
		}
		this.method3795(this.aClass28_Sub1_11);
		if (arg1) {
			@Pc(77) boolean local77 = arg1 & this.aBoolean366 & Static172.aClass5_Sub50_14.aClass12_Sub25_1.method6990() != 0;
			arg1 = local77 & (this.anInt4497 != local9.anInt4670 || this.aClass175_1 != null && Static172.aClass5_Sub50_14.aClass12_Sub25_1.method6990() >= 2 && (this.anInt4488 != this.anInt4477 || (this.aClass175_1.aBoolean423 || Static31.aBoolean30) && this.anInt4487 != this.anInt4477));
		}
		if (arg3 && !arg1) {
			this.anInt4474 = local9.anInt4670;
			return null;
		}
		if (arg1) {
			Static548.method7637(this.aClass5_Sub3_Sub7_1, this.aByte62, this.aClass28_Sub1_11.anInt10781, this.aClass28_Sub1_11.anInt10784, this.aBooleanArray20);
			this.anInt4497 = -1;
			this.anInt4488 = -1;
		}
		@Pc(153) Class109 local153 = Static495.aClass109Array4[this.aByte62];
		@Pc(165) Class109 local165;
		if (this.aBoolean365) {
			local165 = Static605.aClass109Array5[0];
		} else {
			local165 = this.aByte62 >= 3 ? null : Static495.aClass109Array4[this.aByte62 + 1];
		}
		@Pc(181) Class153 local181 = null;
		if (this.aClass175_1 != null) {
			if (arg1) {
				arg0 |= 0x40000;
			}
			local181 = local9.method3916(this.anInt4480 == 11 ? this.anInt4489 + 4 : this.anInt4489, this.aClass28_Sub1_11.anInt10784, local165, this.anInt4477, local153, this.aClass28_Sub1_11.anInt10781, arg0, local153.method7702(this.aClass28_Sub1_11.anInt10781, this.aClass28_Sub1_11.anInt10784), arg2, this.anInt4480 == 11 ? 10 : this.anInt4480, this.aClass225_2, this.anInt4484, this.aClass175_1, this.anInt4487);
			if (local181 == null) {
				this.aClass5_Sub3_Sub7_1 = null;
				this.aBooleanArray20 = null;
				this.anInt4492 = 0;
				this.anInt4479 = 0;
			} else {
				if (arg1) {
					if (this.aBooleanArray20 == null) {
						this.aBooleanArray20 = new boolean[4];
					}
					this.aClass5_Sub3_Sub7_1 = local181.ba(this.aClass5_Sub3_Sub7_1);
					Static491.method7050(this.aClass5_Sub3_Sub7_1, this.aByte62, this.aClass28_Sub1_11.anInt10781, this.aClass28_Sub1_11.anInt10784, this.aBooleanArray20);
					this.anInt4497 = local9.anInt4670;
					this.anInt4488 = this.anInt4477;
				}
				this.anInt4479 = local181.fa();
				this.anInt4492 = local181.ma();
			}
			this.aClass153_2 = null;
		} else if (this.aClass153_2 != null && (arg0 & this.aClass153_2.ua()) == arg0 && local9.anInt4670 == this.anInt4474) {
			local181 = this.aClass153_2;
		} else {
			if (this.aClass153_2 != null) {
				arg0 |= this.aClass153_2.ua();
			}
			@Pc(385) Class311 local385 = local9.method3905(arg0, this.anInt4480 == 11 ? this.anInt4489 + 4 : this.anInt4489, local153, arg2, this.aClass28_Sub1_11.anInt10784, this.anInt4480 == 11 ? 10 : this.anInt4480, local153.method7702(this.aClass28_Sub1_11.anInt10781, this.aClass28_Sub1_11.anInt10784), this.aClass28_Sub1_11.anInt10781, local165, this.aClass225_2, arg1);
			if (local385 == null) {
				this.aBooleanArray20 = null;
				this.aClass153_2 = null;
				this.anInt4479 = 0;
				this.aClass5_Sub3_Sub7_1 = null;
				this.anInt4492 = 0;
			} else {
				local181 = local385.aClass153_4;
				this.aClass153_2 = local385.aClass153_4;
				if (arg1) {
					this.aBooleanArray20 = null;
					this.aClass5_Sub3_Sub7_1 = local385.aClass5_Sub3_Sub7_3;
					Static491.method7050(this.aClass5_Sub3_Sub7_1, this.aByte62, this.aClass28_Sub1_11.anInt10781, this.aClass28_Sub1_11.anInt10784, (boolean[]) null);
					this.anInt4497 = local9.anInt4670;
					this.anInt4488 = -1;
				}
				this.anInt4479 = local181.fa();
				this.anInt4492 = local181.ma();
			}
		}
		this.anInt4474 = local9.anInt4670;
		return local181;
	}

	@OriginalMember(owner = "client!hw", name = "b", descriptor = "(Lclient!ha;I)V")
	public void method3790(@OriginalArg(0) Class65 arg0) {
		if (this.aClass5_Sub3_Sub7_1 != null) {
			Static548.method7637(this.aClass5_Sub3_Sub7_1, this.aByte62, this.aClass28_Sub1_11.anInt10781, this.aClass28_Sub1_11.anInt10784, this.aBooleanArray20);
			this.aBooleanArray20 = null;
			this.aClass5_Sub3_Sub7_1 = null;
		}
	}

	@OriginalMember(owner = "client!hw", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass28_Sub5_3 != null) {
			this.aClass28_Sub5_3.method5858();
		}
	}

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "(Lclient!mea;B)V")
	public void method3791(@OriginalArg(0) Class225 arg0) {
		this.aClass153_2 = null;
		this.aClass225_2 = arg0;
	}

	@OriginalMember(owner = "client!hw", name = "b", descriptor = "(I)I")
	public int method3792() {
		return this.anInt4479;
	}

	@OriginalMember(owner = "client!hw", name = "c", descriptor = "(I)Z")
	public boolean method3793() {
		return this.aBoolean366;
	}

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "(ILclient!lq;)V")
	private void method3795(@OriginalArg(1) Class28_Sub1 arg0) {
		label80: while (true) {
			if (this.aClass175_1 == null) {
				if (this.aBoolean364) {
					return;
				}
				this.method3784(-1);
				if (this.aClass175_1 == null) {
					return;
				}
			}
			@Pc(30) int local30 = Static26.anInt350 - this.anInt4494;
			if (local30 > 100 && this.aClass175_1.anInt5029 > 0) {
				@Pc(49) int local49 = this.aClass175_1.anIntArray288.length - this.aClass175_1.anInt5029;
				while (this.anInt4477 < local49 && this.aClass175_1.anIntArray291[this.anInt4477] < local30) {
					local30 -= this.aClass175_1.anIntArray291[this.anInt4477];
					this.anInt4477++;
				}
				if (local49 <= this.anInt4477) {
					@Pc(91) int local91 = 0;
					for (@Pc(93) int local93 = local49; local93 < this.aClass175_1.anIntArray288.length; local93++) {
						local91 += this.aClass175_1.anIntArray291[local93];
					}
					local30 %= local91;
				}
				this.anInt4487 = this.anInt4477 + 1;
				if (this.aClass175_1.anIntArray288.length <= this.anInt4487) {
					this.anInt4487 -= this.aClass175_1.anInt5029;
					if (this.anInt4487 < 0 || this.aClass175_1.anIntArray288.length <= this.anInt4487) {
						this.anInt4487 = -1;
					}
				}
			}
			while (local30 > this.aClass175_1.anIntArray291[this.anInt4477]) {
				Static146.method2653(this.anInt4477, this.aClass175_1, arg0);
				local30 -= this.aClass175_1.anIntArray291[this.anInt4477];
				this.anInt4477++;
				if (this.anInt4477 >= this.aClass175_1.anIntArray288.length) {
					this.anInt4477 -= this.aClass175_1.anInt5029;
					if (this.anInt4477 < 0 || this.anInt4477 >= this.aClass175_1.anIntArray288.length) {
						this.aClass175_1 = null;
						continue label80;
					}
				}
				this.anInt4487 = this.anInt4477 + 1;
				if (this.anInt4487 >= this.aClass175_1.anIntArray288.length) {
					this.anInt4487 -= this.aClass175_1.anInt5029;
					if (this.anInt4487 < 0 || this.aClass175_1.anIntArray288.length <= this.anInt4487) {
						this.anInt4487 = -1;
					}
				}
			}
			this.anInt4484 = local30;
			this.anInt4494 = Static26.anInt350 - local30;
			return;
		}
	}

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "(ZI)V")
	public void method3797(@OriginalArg(1) int arg0) {
		this.aBoolean364 = true;
		this.method3784(arg0);
	}
}
