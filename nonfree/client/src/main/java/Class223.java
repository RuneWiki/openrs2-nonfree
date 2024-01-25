import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tn")
public final class Class223 {

	@OriginalMember(owner = "client!tn", name = "d", descriptor = "I")
	private int anInt6705;

	@OriginalMember(owner = "client!tn", name = "l", descriptor = "Lclient!jr;")
	private Class127 aClass127_31;

	@OriginalMember(owner = "client!tn", name = "m", descriptor = "I")
	public int anInt6711;

	@OriginalMember(owner = "client!tn", name = "p", descriptor = "Lclient!dt;")
	public Class61 aClass61_2;

	@OriginalMember(owner = "client!tn", name = "t", descriptor = "I")
	public int anInt6715;

	@OriginalMember(owner = "client!tn", name = "A", descriptor = "[I")
	public int[] anIntArray484;

	@OriginalMember(owner = "client!tn", name = "C", descriptor = "I")
	private int anInt6721;

	@OriginalMember(owner = "client!tn", name = "I", descriptor = "I")
	public int anInt6727;

	@OriginalMember(owner = "client!tn", name = "J", descriptor = "I")
	public int anInt6728;

	@OriginalMember(owner = "client!tn", name = "N", descriptor = "I")
	private int anInt6732;

	@OriginalMember(owner = "client!tn", name = "P", descriptor = "Ljava/lang/String;")
	public String aString61;

	@OriginalMember(owner = "client!tn", name = "Q", descriptor = "I")
	public int anInt6734;

	@OriginalMember(owner = "client!tn", name = "R", descriptor = "Ljava/lang/String;")
	public String aString62;

	@OriginalMember(owner = "client!tn", name = "T", descriptor = "I")
	public int anInt6736;

	@OriginalMember(owner = "client!tn", name = "V", descriptor = "I")
	private int anInt6738;

	@OriginalMember(owner = "client!tn", name = "e", descriptor = "[Ljava/lang/String;")
	public final String[] aStringArray158 = new String[5];

	@OriginalMember(owner = "client!tn", name = "g", descriptor = "I")
	public int anInt6707 = -1;

	@OriginalMember(owner = "client!tn", name = "n", descriptor = "I")
	public int anInt6712 = -1;

	@OriginalMember(owner = "client!tn", name = "q", descriptor = "Z")
	public boolean aBoolean469 = true;

	@OriginalMember(owner = "client!tn", name = "c", descriptor = "I")
	private int anInt6704 = -1;

	@OriginalMember(owner = "client!tn", name = "u", descriptor = "I")
	public int anInt6716 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!tn", name = "w", descriptor = "Z")
	public boolean aBoolean470 = true;

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "I")
	public int anInt6703 = -1;

	@OriginalMember(owner = "client!tn", name = "h", descriptor = "I")
	private int anInt6708 = -1;

	@OriginalMember(owner = "client!tn", name = "D", descriptor = "I")
	private int anInt6722 = -1;

	@OriginalMember(owner = "client!tn", name = "G", descriptor = "I")
	private int anInt6725 = -1;

	@OriginalMember(owner = "client!tn", name = "B", descriptor = "Z")
	public boolean aBoolean471 = true;

	@OriginalMember(owner = "client!tn", name = "o", descriptor = "Z")
	public boolean aBoolean468 = false;

	@OriginalMember(owner = "client!tn", name = "H", descriptor = "I")
	public int anInt6726 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!tn", name = "L", descriptor = "I")
	public int anInt6730 = -1;

	@OriginalMember(owner = "client!tn", name = "y", descriptor = "I")
	public int anInt6719 = 0;

	@OriginalMember(owner = "client!tn", name = "M", descriptor = "I")
	private int anInt6731 = -1;

	@OriginalMember(owner = "client!tn", name = "O", descriptor = "I")
	public int anInt6733 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!tn", name = "U", descriptor = "I")
	public int anInt6737 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(ILclient!bt;)V")
	public void method5276(@OriginalArg(1) Class3_Sub2 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method6053();
			if (local9 == 0) {
				return;
			}
			this.method5284(arg0, local9);
		}
	}

	@OriginalMember(owner = "client!tn", name = "b", descriptor = "(B)V")
	public void method5278() {
		if (this.anIntArray484 == null) {
			return;
		}
		for (@Pc(17) int local17 = 0; local17 < this.anIntArray484.length; local17 += 2) {
			if (this.anIntArray484[local17] < this.anInt6716) {
				this.anInt6716 = this.anIntArray484[local17];
			} else if (this.anIntArray484[local17] > this.anInt6726) {
				this.anInt6726 = this.anIntArray484[local17];
			}
			if (this.anIntArray484[local17 + 1] < this.anInt6733) {
				this.anInt6733 = this.anIntArray484[local17 + 1];
			} else if (this.anIntArray484[local17 + 1] > this.anInt6737) {
				this.anInt6737 = this.anIntArray484[local17 + 1];
			}
		}
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(ZBLclient!qa;)Lclient!f;")
	public Class22 method5279(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class75 arg1) {
		@Pc(11) int local11 = arg0 ? this.anInt6712 : this.anInt6703;
		@Pc(18) int local18 = arg1.anInt3233 << 29 | local11;
		@Pc(27) Class22 local27 = (Class22) this.aClass61_2.aClass5_12.method104((long) local18);
		if (local27 != null) {
			return local27;
		} else if (this.aClass61_2.aClass56_21.method1365(local11)) {
			@Pc(53) Class166 local53 = Static460.method3975(this.aClass61_2.aClass56_21, local11, 0);
			if (local53 != null) {
				local27 = arg1.method2590(local53);
				this.aClass61_2.aClass5_12.method114((long) local18, local27);
			}
			return local27;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(Ljava/lang/String;BI)Ljava/lang/String;")
	public String method5281(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1) {
		if (this.aClass127_31 == null) {
			return arg0;
		} else {
			@Pc(16) Class3_Sub37 local16 = (Class3_Sub37) this.aClass127_31.method3246((long) arg1);
			return local16 == null ? arg0 : local16.aString58;
		}
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(IIB)I")
	public int method5282(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass127_31 == null) {
			return arg0;
		} else {
			@Pc(16) Class3_Sub25 local16 = (Class3_Sub25) this.aClass127_31.method3246((long) arg1);
			return local16 == null ? arg0 : local16.anInt4134;
		}
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(Lclient!mi;I)Z")
	public boolean method5283(@OriginalArg(0) Interface8 arg0) {
		@Pc(14) int local14;
		if (this.anInt6731 == -1) {
			if (this.anInt6722 == -1) {
				return true;
			}
			local14 = arg0.method455(this.anInt6722);
		} else {
			local14 = arg0.method456(this.anInt6731);
		}
		if (local14 < this.anInt6721 || local14 > this.anInt6732) {
			return false;
		}
		@Pc(61) int local61;
		if (this.anInt6725 == -1) {
			if (this.anInt6708 == -1) {
				return true;
			}
			local61 = arg0.method455(this.anInt6708);
		} else {
			local61 = arg0.method456(this.anInt6725);
		}
		return this.anInt6705 <= local61 && local61 <= this.anInt6738;
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(ILclient!bt;I)V")
	private void method5284(@OriginalArg(1) Class3_Sub2 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt6703 = arg0.method6004();
		} else if (arg1 == 2) {
			this.anInt6712 = arg0.method6004();
		} else if (arg1 == 3) {
			this.aString61 = arg0.method6027();
		} else if (arg1 == 4) {
			this.anInt6715 = arg0.method6020();
			return;
		} else if (arg1 == 5) {
			this.anInt6707 = arg0.method6020();
			return;
		} else if (arg1 == 6) {
			this.anInt6719 = arg0.method6053();
			return;
		} else {
			@Pc(95) int local95;
			if (arg1 != 7) {
				if (arg1 == 8) {
					this.aBoolean469 = arg0.method6053() == 1;
					return;
				}
				if (arg1 == 9) {
					this.anInt6722 = arg0.method6004();
					if (this.anInt6722 == 65535) {
						this.anInt6722 = -1;
					}
					this.anInt6731 = arg0.method6004();
					if (this.anInt6731 == 65535) {
						this.anInt6731 = -1;
					}
					this.anInt6721 = arg0.method6014();
					this.anInt6732 = arg0.method6014();
					return;
				}
				if (arg1 >= 10 && arg1 <= 14) {
					this.aStringArray158[arg1 - 10] = arg0.method6027();
					return;
				}
				@Pc(103) int local103;
				if (arg1 != 15) {
					if (arg1 != 16) {
						if (arg1 == 17) {
							this.aString62 = arg0.method6027();
							return;
						}
						if (arg1 == 18) {
							this.anInt6704 = arg0.method6004();
							return;
						}
						if (arg1 == 19) {
							this.anInt6730 = arg0.method6004();
						} else if (arg1 == 20) {
							this.anInt6708 = arg0.method6004();
							if (this.anInt6708 == 65535) {
								this.anInt6708 = -1;
							}
							this.anInt6725 = arg0.method6004();
							if (this.anInt6725 == 65535) {
								this.anInt6725 = -1;
							}
							this.anInt6705 = arg0.method6014();
							this.anInt6738 = arg0.method6014();
							return;
						} else if (arg1 == 21) {
							this.anInt6736 = arg0.method6014();
							return;
						} else if (arg1 == 22) {
							this.anInt6711 = arg0.method6014();
							return;
						} else if (arg1 == 249) {
							local95 = arg0.method6053();
							if (this.aClass127_31 == null) {
								local103 = Static350.method4984(local95);
								this.aClass127_31 = new Class127(local103);
							}
							for (local103 = 0; local103 < local95; local103++) {
								@Pc(256) boolean local256 = arg0.method6053() == 1;
								@Pc(260) int local260 = arg0.method6020();
								@Pc(269) Class3 local269;
								if (local256) {
									local269 = new Class3_Sub37(arg0.method6027());
								} else {
									local269 = new Class3_Sub25(arg0.method6014());
								}
								this.aClass127_31.method3257((long) local260, local269);
							}
							return;
						}
						return;
					}
					this.aBoolean471 = false;
					return;
				}
				local95 = arg0.method6053();
				this.anIntArray484 = new int[local95 * 2];
				for (local103 = 0; local103 < local95 * 2; local103++) {
					this.anIntArray484[local103] = arg0.method6039();
				}
				this.anInt6727 = arg0.method6014();
				this.anInt6734 = arg0.method6014();
				return;
			}
			local95 = arg0.method6053();
			if ((local95 & 0x1) == 0) {
				this.aBoolean470 = false;
			}
			if ((local95 & 0x2) == 2) {
				this.aBoolean468 = true;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(Lclient!qa;B)Lclient!f;")
	public Class22 method5285(@OriginalArg(0) Class75 arg0) {
		@Pc(26) Class22 local26 = (Class22) this.aClass61_2.aClass5_12.method104((long) (this.anInt6704 | 0x20000 | arg0.anInt3233 << 29));
		if (local26 != null) {
			return local26;
		}
		this.aClass61_2.aClass56_21.method1365(this.anInt6704);
		@Pc(46) Class166 local46 = Static460.method3975(this.aClass61_2.aClass56_21, this.anInt6704, 0);
		if (local46 != null) {
			local26 = arg0.method2590(local46);
			this.aClass61_2.aClass5_12.method114((long) (this.anInt6704 | 0x20000 | arg0.anInt3233 << 29), local26);
		}
		return local26;
	}
}
