import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kca")
public final class Class174 {

	@OriginalMember(owner = "client!kca", name = "a", descriptor = "I")
	public int anInt4756;

	@OriginalMember(owner = "client!kca", name = "b", descriptor = "I")
	private int anInt4757;

	@OriginalMember(owner = "client!kca", name = "c", descriptor = "Lclient!fq;")
	public Class102 aClass102_3;

	@OriginalMember(owner = "client!kca", name = "e", descriptor = "I")
	public int anInt4758;

	@OriginalMember(owner = "client!kca", name = "f", descriptor = "I")
	private int anInt4759;

	@OriginalMember(owner = "client!kca", name = "i", descriptor = "I")
	private int anInt4762;

	@OriginalMember(owner = "client!kca", name = "j", descriptor = "I")
	private int anInt4763;

	@OriginalMember(owner = "client!kca", name = "p", descriptor = "I")
	public int anInt4768;

	@OriginalMember(owner = "client!kca", name = "x", descriptor = "I")
	public int anInt4775;

	@OriginalMember(owner = "client!kca", name = "y", descriptor = "I")
	public int anInt4776;

	@OriginalMember(owner = "client!kca", name = "B", descriptor = "Ljava/lang/String;")
	public String aString30;

	@OriginalMember(owner = "client!kca", name = "F", descriptor = "[I")
	public int[] anIntArray257;

	@OriginalMember(owner = "client!kca", name = "G", descriptor = "I")
	public int anInt4780;

	@OriginalMember(owner = "client!kca", name = "H", descriptor = "Ljava/lang/String;")
	public String aString31;

	@OriginalMember(owner = "client!kca", name = "L", descriptor = "Lclient!wa;")
	private Class354 aClass354_22;

	@OriginalMember(owner = "client!kca", name = "d", descriptor = "Z")
	public boolean aBoolean349 = true;

	@OriginalMember(owner = "client!kca", name = "m", descriptor = "I")
	public int anInt4766 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!kca", name = "t", descriptor = "I")
	public int anInt4772 = -1;

	@OriginalMember(owner = "client!kca", name = "v", descriptor = "I")
	private int anInt4773 = -1;

	@OriginalMember(owner = "client!kca", name = "g", descriptor = "I")
	public int anInt4760 = -1;

	@OriginalMember(owner = "client!kca", name = "C", descriptor = "I")
	public int anInt4778 = -1;

	@OriginalMember(owner = "client!kca", name = "l", descriptor = "I")
	public int anInt4765 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!kca", name = "D", descriptor = "I")
	private int anInt4779 = -1;

	@OriginalMember(owner = "client!kca", name = "M", descriptor = "Z")
	public boolean aBoolean352 = true;

	@OriginalMember(owner = "client!kca", name = "I", descriptor = "Z")
	public boolean aBoolean350 = true;

	@OriginalMember(owner = "client!kca", name = "o", descriptor = "[Ljava/lang/String;")
	public final String[] aStringArray18 = new String[5];

	@OriginalMember(owner = "client!kca", name = "O", descriptor = "I")
	public int anInt4783 = -1;

	@OriginalMember(owner = "client!kca", name = "K", descriptor = "Z")
	public boolean aBoolean351 = false;

	@OriginalMember(owner = "client!kca", name = "N", descriptor = "I")
	private int anInt4782 = -1;

	@OriginalMember(owner = "client!kca", name = "R", descriptor = "I")
	public int anInt4786 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!kca", name = "q", descriptor = "I")
	private int anInt4769 = -1;

	@OriginalMember(owner = "client!kca", name = "r", descriptor = "I")
	public int anInt4770 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!kca", name = "Q", descriptor = "I")
	private int anInt4785 = -1;

	@OriginalMember(owner = "client!kca", name = "S", descriptor = "I")
	public int anInt4787 = 0;

	@OriginalMember(owner = "client!kca", name = "a", descriptor = "(ILjava/lang/String;Z)Ljava/lang/String;")
	public String method4112(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		if (this.aClass354_22 == null) {
			return arg1;
		} else {
			@Pc(16) Class3_Sub29 local16 = (Class3_Sub29) this.aClass354_22.method7689((long) arg0);
			return local16 == null ? arg1 : local16.aString27;
		}
	}

	@OriginalMember(owner = "client!kca", name = "a", descriptor = "(Lclient!r;I)Lclient!f;")
	public Class14 method4113(@OriginalArg(0) Class45 arg0) {
		@Pc(20) Class14 local20 = (Class14) this.aClass102_3.aClass6_17.method92((long) (this.anInt4779 | 0x20000 | arg0.anInt8843 << 29));
		if (local20 != null) {
			return local20;
		}
		this.aClass102_3.aClass322_63.method6797(this.anInt4779);
		@Pc(45) Class279 local45 = Static604.method6161(this.aClass102_3.aClass322_63, this.anInt4779, 0);
		if (local45 != null) {
			local20 = arg0.method7398(local45, true);
			this.aClass102_3.aClass6_17.method106((long) (arg0.anInt8843 << 29 | 0x20000 | this.anInt4779), local20);
		}
		return local20;
	}

	@OriginalMember(owner = "client!kca", name = "a", descriptor = "(III)I")
	public int method4114(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass354_22 == null) {
			return arg1;
		} else {
			@Pc(25) Class3_Sub17 local25 = (Class3_Sub17) this.aClass354_22.method7689((long) arg0);
			return local25 == null ? arg1 : local25.anInt3217;
		}
	}

	@OriginalMember(owner = "client!kca", name = "a", descriptor = "(ILclient!np;)V")
	public void method4115(@OriginalArg(1) Class3_Sub11 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method5175();
			if (local9 == 0) {
				return;
			}
			this.method4120(arg0, local9);
		}
	}

	@OriginalMember(owner = "client!kca", name = "a", descriptor = "(ILclient!ks;)Z")
	public boolean method4116(@OriginalArg(1) Interface9 arg0) {
		@Pc(16) int local16;
		if (this.anInt4785 == -1) {
			if (this.anInt4782 == -1) {
				return true;
			}
			local16 = arg0.method6736(this.anInt4782);
		} else {
			local16 = arg0.method6735(this.anInt4785);
		}
		if (local16 < this.anInt4759 || local16 > this.anInt4763) {
			return false;
		}
		@Pc(67) int local67;
		if (this.anInt4773 == -1) {
			if (this.anInt4769 == -1) {
				return true;
			}
			local67 = arg0.method6736(this.anInt4769);
		} else {
			local67 = arg0.method6735(this.anInt4773);
		}
		return this.anInt4762 <= local67 && this.anInt4757 >= local67;
	}

	@OriginalMember(owner = "client!kca", name = "a", descriptor = "(I)V")
	public void method4117() {
		if (this.anIntArray257 == null) {
			return;
		}
		for (@Pc(16) int local16 = 0; local16 < this.anIntArray257.length; local16 += 2) {
			if (this.anIntArray257[local16] < this.anInt4766) {
				this.anInt4766 = this.anIntArray257[local16];
			} else if (this.anIntArray257[local16] > this.anInt4765) {
				this.anInt4765 = this.anIntArray257[local16];
			}
			if (this.anIntArray257[local16 + 1] < this.anInt4786) {
				this.anInt4786 = this.anIntArray257[local16 + 1];
			} else if (this.anIntArray257[local16 + 1] > this.anInt4770) {
				this.anInt4770 = this.anIntArray257[local16 + 1];
			}
		}
	}

	@OriginalMember(owner = "client!kca", name = "a", descriptor = "(ZZLclient!r;)Lclient!f;")
	public Class14 method4118(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class45 arg1) {
		@Pc(11) int local11 = arg0 ? this.anInt4783 : this.anInt4772;
		@Pc(18) int local18 = arg1.anInt8843 << 29 | local11;
		@Pc(27) Class14 local27 = (Class14) this.aClass102_3.aClass6_17.method92((long) local18);
		if (local27 != null) {
			return local27;
		} else if (this.aClass102_3.aClass322_63.method6797(local11)) {
			@Pc(47) Class279 local47 = Static604.method6161(this.aClass102_3.aClass322_63, local11, 0);
			if (local47 != null) {
				local27 = arg1.method7398(local47, true);
				this.aClass102_3.aClass6_17.method106((long) local18, local27);
			}
			return local27;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!kca", name = "a", descriptor = "(Lclient!np;IB)V")
	private void method4120(@OriginalArg(0) Class3_Sub11 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt4772 = arg0.method5198();
		} else if (arg1 == 2) {
			this.anInt4783 = arg0.method5198();
		} else if (arg1 == 3) {
			this.aString30 = arg0.method5181();
		} else if (arg1 == 4) {
			this.anInt4768 = arg0.method5230();
		} else if (arg1 == 5) {
			this.anInt4778 = arg0.method5230();
		} else if (arg1 == 6) {
			this.anInt4787 = arg0.method5175();
		} else {
			@Pc(51) int local51;
			if (arg1 == 7) {
				local51 = arg0.method5175();
				if ((local51 & 0x1) == 0) {
					this.aBoolean349 = false;
				}
				if ((local51 & 0x2) == 2) {
					this.aBoolean351 = true;
				}
			} else if (arg1 == 8) {
				this.aBoolean350 = arg0.method5175() == 1;
			} else if (arg1 == 9) {
				this.anInt4782 = arg0.method5198();
				if (this.anInt4782 == 65535) {
					this.anInt4782 = -1;
				}
				this.anInt4785 = arg0.method5198();
				if (this.anInt4785 == 65535) {
					this.anInt4785 = -1;
				}
				this.anInt4759 = arg0.method5186();
				this.anInt4763 = arg0.method5186();
			} else if (arg1 >= 10 && arg1 <= 14) {
				this.aStringArray18[arg1 - 10] = arg0.method5181();
			} else {
				@Pc(157) int local157;
				if (arg1 == 15) {
					local51 = arg0.method5175();
					this.anIntArray257 = new int[local51 * 2];
					for (local157 = 0; local157 < local51 * 2; local157++) {
						this.anIntArray257[local157] = arg0.method5231();
					}
					this.anInt4776 = arg0.method5186();
					this.anInt4758 = arg0.method5186();
				} else if (arg1 == 16) {
					this.aBoolean352 = false;
				} else if (arg1 == 17) {
					this.aString31 = arg0.method5181();
				} else if (arg1 == 18) {
					this.anInt4779 = arg0.method5198();
				} else if (arg1 == 19) {
					this.anInt4760 = arg0.method5198();
				} else if (arg1 == 20) {
					this.anInt4769 = arg0.method5198();
					if (this.anInt4769 == 65535) {
						this.anInt4769 = -1;
					}
					this.anInt4773 = arg0.method5198();
					if (this.anInt4773 == 65535) {
						this.anInt4773 = -1;
					}
					this.anInt4762 = arg0.method5186();
					this.anInt4757 = arg0.method5186();
				} else if (arg1 == 21) {
					this.anInt4780 = arg0.method5186();
				} else if (arg1 == 22) {
					this.anInt4775 = arg0.method5186();
				} else if (arg1 == 249) {
					local51 = arg0.method5175();
					if (this.aClass354_22 == null) {
						local157 = Static371.method5424(local51);
						this.aClass354_22 = new Class354(local157);
					}
					for (local157 = 0; local157 < local51; local157++) {
						@Pc(317) boolean local317 = arg0.method5175() == 1;
						@Pc(321) int local321 = arg0.method5230();
						@Pc(330) Class3 local330;
						if (local317) {
							local330 = new Class3_Sub29(arg0.method5181());
						} else {
							local330 = new Class3_Sub17(arg0.method5186());
						}
						this.aClass354_22.method7691(local330, (long) local321);
					}
				}
			}
		}
	}
}
