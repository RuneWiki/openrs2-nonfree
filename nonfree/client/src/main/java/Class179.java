import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lm")
public final class Class179 {

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "I")
	public int anInt5713;

	@OriginalMember(owner = "client!lm", name = "b", descriptor = "I")
	public int anInt5714;

	@OriginalMember(owner = "client!lm", name = "g", descriptor = "I")
	public int anInt5719;

	@OriginalMember(owner = "client!lm", name = "h", descriptor = "I")
	private int anInt5720;

	@OriginalMember(owner = "client!lm", name = "n", descriptor = "I")
	public int anInt5725;

	@OriginalMember(owner = "client!lm", name = "s", descriptor = "Lclient!sd;")
	private Class267 aClass267_26;

	@OriginalMember(owner = "client!lm", name = "u", descriptor = "Ljava/lang/String;")
	public String aString40;

	@OriginalMember(owner = "client!lm", name = "z", descriptor = "I")
	public int anInt5733;

	@OriginalMember(owner = "client!lm", name = "B", descriptor = "I")
	private int anInt5735;

	@OriginalMember(owner = "client!lm", name = "D", descriptor = "I")
	private int anInt5737;

	@OriginalMember(owner = "client!lm", name = "E", descriptor = "I")
	public int anInt5738;

	@OriginalMember(owner = "client!lm", name = "G", descriptor = "Ljava/lang/String;")
	public String aString41;

	@OriginalMember(owner = "client!lm", name = "I", descriptor = "I")
	private int anInt5740;

	@OriginalMember(owner = "client!lm", name = "J", descriptor = "Lclient!ik;")
	public Class135 aClass135_3;

	@OriginalMember(owner = "client!lm", name = "Q", descriptor = "[I")
	public int[] anIntArray509;

	@OriginalMember(owner = "client!lm", name = "e", descriptor = "I")
	private int anInt5717 = -1;

	@OriginalMember(owner = "client!lm", name = "k", descriptor = "I")
	private int anInt5723 = -1;

	@OriginalMember(owner = "client!lm", name = "l", descriptor = "I")
	public int anInt5724 = -1;

	@OriginalMember(owner = "client!lm", name = "o", descriptor = "I")
	public int anInt5726 = 0;

	@OriginalMember(owner = "client!lm", name = "d", descriptor = "I")
	private int anInt5716 = -1;

	@OriginalMember(owner = "client!lm", name = "m", descriptor = "Z")
	public boolean aBoolean368 = true;

	@OriginalMember(owner = "client!lm", name = "r", descriptor = "I")
	public int anInt5728 = -1;

	@OriginalMember(owner = "client!lm", name = "v", descriptor = "I")
	public int anInt5730 = -1;

	@OriginalMember(owner = "client!lm", name = "f", descriptor = "I")
	public int anInt5718 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!lm", name = "y", descriptor = "I")
	public int anInt5732 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!lm", name = "i", descriptor = "I")
	private int anInt5721 = -1;

	@OriginalMember(owner = "client!lm", name = "C", descriptor = "I")
	private int anInt5736 = -1;

	@OriginalMember(owner = "client!lm", name = "p", descriptor = "Z")
	public boolean aBoolean369 = false;

	@OriginalMember(owner = "client!lm", name = "A", descriptor = "I")
	public int anInt5734 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!lm", name = "K", descriptor = "[Ljava/lang/String;")
	public final String[] aStringArray32 = new String[5];

	@OriginalMember(owner = "client!lm", name = "H", descriptor = "Z")
	public boolean aBoolean370 = true;

	@OriginalMember(owner = "client!lm", name = "N", descriptor = "Z")
	public boolean aBoolean371 = true;

	@OriginalMember(owner = "client!lm", name = "O", descriptor = "I")
	public int anInt5743 = -1;

	@OriginalMember(owner = "client!lm", name = "q", descriptor = "I")
	public int anInt5727 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(ILclient!rt;)V")
	public void method4794(@OriginalArg(1) Class3_Sub27 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method7548();
			if (local5 == 0) {
				return;
			}
			this.method4799(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(Ljava/lang/String;II)Ljava/lang/String;")
	public String method4795(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		if (this.aClass267_26 == null) {
			return arg0;
		} else {
			@Pc(16) Class3_Sub35 local16 = (Class3_Sub35) this.aClass267_26.method6644((long) arg1);
			return local16 == null ? arg0 : local16.aString45;
		}
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(ZLclient!sp;)Z")
	public boolean method4796(@OriginalArg(1) Interface17 arg0) {
		@Pc(22) int local22;
		if (this.anInt5723 == -1) {
			if (this.anInt5716 == -1) {
				return true;
			}
			local22 = arg0.method5534(this.anInt5716);
		} else {
			local22 = arg0.method5535(this.anInt5723);
		}
		if (this.anInt5737 > local22 || this.anInt5735 < local22) {
			return false;
		}
		@Pc(69) int local69;
		if (this.anInt5721 == -1) {
			if (this.anInt5736 == -1) {
				return true;
			}
			local69 = arg0.method5534(this.anInt5736);
		} else {
			local69 = arg0.method5535(this.anInt5721);
		}
		return local69 >= this.anInt5720 && this.anInt5740 >= local69;
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(Lclient!oa;I)Lclient!xa;")
	public Class119 method4797(@OriginalArg(0) Class5 arg0) {
		@Pc(20) Class119 local20 = (Class119) this.aClass135_3.aClass125_32.method3512((long) (arg0.anInt9037 << 29 | this.anInt5717 | 0x20000));
		if (local20 != null) {
			return local20;
		}
		this.aClass135_3.aClass161_48.method4268(this.anInt5717);
		@Pc(40) Class9 local40 = Static551.method531(this.aClass135_3.aClass161_48, this.anInt5717, 0);
		if (local40 != null) {
			local20 = arg0.method7425(local40);
			this.aClass135_3.aClass125_32.method3519((long) (this.anInt5717 | 0x20000 | arg0.anInt9037 << 29), local20);
		}
		return local20;
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(ZLclient!oa;I)Lclient!xa;")
	public Class119 method4798(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class5 arg1) {
		@Pc(11) int local11 = arg0 ? this.anInt5724 : this.anInt5730;
		@Pc(18) int local18 = local11 | arg1.anInt9037 << 29;
		@Pc(27) Class119 local27 = (Class119) this.aClass135_3.aClass125_32.method3512((long) local18);
		if (local27 != null) {
			return local27;
		} else if (this.aClass135_3.aClass161_48.method4268(local11)) {
			@Pc(52) Class9 local52 = Static551.method531(this.aClass135_3.aClass161_48, local11, 0);
			if (local52 != null) {
				local27 = arg1.method7425(local52);
				this.aClass135_3.aClass125_32.method3519((long) local18, local27);
			}
			return local27;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(ILclient!rt;I)V")
	private void method4799(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub27 arg1) {
		if (arg0 == 1) {
			this.anInt5730 = arg1.method7591();
		} else if (arg0 == 2) {
			this.anInt5724 = arg1.method7591();
		} else if (arg0 == 3) {
			this.aString41 = arg1.method7589();
		} else if (arg0 == 4) {
			this.anInt5719 = arg1.method7551();
		} else if (arg0 == 5) {
			this.anInt5743 = arg1.method7551();
		} else if (arg0 == 6) {
			this.anInt5726 = arg1.method7548();
		} else {
			@Pc(55) int local55;
			if (arg0 == 7) {
				local55 = arg1.method7548();
				if ((local55 & 0x1) == 0) {
					this.aBoolean371 = false;
				}
				if ((local55 & 0x2) == 2) {
					this.aBoolean369 = true;
				}
			} else if (arg0 == 8) {
				this.aBoolean368 = arg1.method7548() == 1;
			} else if (arg0 == 9) {
				this.anInt5716 = arg1.method7591();
				if (this.anInt5716 == 65535) {
					this.anInt5716 = -1;
				}
				this.anInt5723 = arg1.method7591();
				if (this.anInt5723 == 65535) {
					this.anInt5723 = -1;
				}
				this.anInt5737 = arg1.method7549();
				this.anInt5735 = arg1.method7549();
			} else if (arg0 >= 10 && arg0 <= 14) {
				this.aStringArray32[arg0 - 10] = arg1.method7589();
			} else {
				@Pc(175) int local175;
				if (arg0 == 15) {
					local55 = arg1.method7548();
					this.anIntArray509 = new int[local55 * 2];
					for (local175 = 0; local175 < local55 * 2; local175++) {
						this.anIntArray509[local175] = arg1.method7604();
					}
					this.anInt5725 = arg1.method7549();
					this.anInt5714 = arg1.method7549();
				} else if (arg0 == 16) {
					this.aBoolean370 = false;
				} else if (arg0 == 17) {
					this.aString40 = arg1.method7589();
				} else if (arg0 == 18) {
					this.anInt5717 = arg1.method7591();
				} else if (arg0 == 19) {
					this.anInt5728 = arg1.method7591();
				} else if (arg0 == 20) {
					this.anInt5736 = arg1.method7591();
					if (this.anInt5736 == 65535) {
						this.anInt5736 = -1;
					}
					this.anInt5721 = arg1.method7591();
					if (this.anInt5721 == 65535) {
						this.anInt5721 = -1;
					}
					this.anInt5720 = arg1.method7549();
					this.anInt5740 = arg1.method7549();
				} else if (arg0 == 21) {
					this.anInt5733 = arg1.method7549();
				} else if (arg0 == 22) {
					this.anInt5738 = arg1.method7549();
				} else if (arg0 == 249) {
					local55 = arg1.method7548();
					if (this.aClass267_26 == null) {
						local175 = Static483.method7134(local55);
						this.aClass267_26 = new Class267(local175);
					}
					for (local175 = 0; local175 < local55; local175++) {
						@Pc(311) boolean local311 = arg1.method7548() == 1;
						@Pc(315) int local315 = arg1.method7551();
						@Pc(324) Class3 local324;
						if (local311) {
							local324 = new Class3_Sub35(arg1.method7589());
						} else {
							local324 = new Class3_Sub47(arg1.method7549());
						}
						this.aClass267_26.method6640(local324, (long) local315);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(III)I")
	public int method4800(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass267_26 == null) {
			return arg1;
		} else {
			@Pc(16) Class3_Sub47 local16 = (Class3_Sub47) this.aClass267_26.method6644((long) arg0);
			return local16 == null ? arg1 : local16.anInt8701;
		}
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(Z)V")
	public void method4802() {
		if (this.anIntArray509 == null) {
			return;
		}
		for (@Pc(16) int local16 = 0; local16 < this.anIntArray509.length; local16 += 2) {
			if (this.anIntArray509[local16] < this.anInt5718) {
				this.anInt5718 = this.anIntArray509[local16];
			} else if (this.anIntArray509[local16] > this.anInt5732) {
				this.anInt5732 = this.anIntArray509[local16];
			}
			if (this.anIntArray509[local16 + 1] < this.anInt5727) {
				this.anInt5727 = this.anIntArray509[local16 + 1];
			} else if (this.anIntArray509[local16 + 1] > this.anInt5734) {
				this.anInt5734 = this.anIntArray509[local16 + 1];
			}
		}
	}
}
