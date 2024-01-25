import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ek")
public final class Class103 {

	@OriginalMember(owner = "client!ek", name = "b", descriptor = "Lclient!eaa;")
	public Class93 aClass93_4;

	@OriginalMember(owner = "client!ek", name = "c", descriptor = "I")
	private int anInt2784;

	@OriginalMember(owner = "client!ek", name = "l", descriptor = "Lclient!rda;")
	private Class300 aClass300_12;

	@OriginalMember(owner = "client!ek", name = "p", descriptor = "I")
	public int anInt2793;

	@OriginalMember(owner = "client!ek", name = "t", descriptor = "I")
	public int anInt2797;

	@OriginalMember(owner = "client!ek", name = "u", descriptor = "Ljava/lang/String;")
	public String aString16;

	@OriginalMember(owner = "client!ek", name = "A", descriptor = "I")
	public int anInt2802;

	@OriginalMember(owner = "client!ek", name = "G", descriptor = "I")
	private int anInt2807;

	@OriginalMember(owner = "client!ek", name = "I", descriptor = "I")
	public int anInt2809;

	@OriginalMember(owner = "client!ek", name = "L", descriptor = "I")
	private int anInt2811;

	@OriginalMember(owner = "client!ek", name = "N", descriptor = "[I")
	public int[] anIntArray104;

	@OriginalMember(owner = "client!ek", name = "P", descriptor = "Ljava/lang/String;")
	public String aString17;

	@OriginalMember(owner = "client!ek", name = "T", descriptor = "I")
	private int anInt2816;

	@OriginalMember(owner = "client!ek", name = "U", descriptor = "I")
	public int anInt2817;

	@OriginalMember(owner = "client!ek", name = "W", descriptor = "[I")
	public int[] anIntArray105;

	@OriginalMember(owner = "client!ek", name = "X", descriptor = "I")
	public int anInt2818;

	@OriginalMember(owner = "client!ek", name = "Y", descriptor = "I")
	public int anInt2819;

	@OriginalMember(owner = "client!ek", name = "Z", descriptor = "[B")
	public byte[] aByteArray19;

	@OriginalMember(owner = "client!ek", name = "k", descriptor = "Z")
	public boolean aBoolean236 = false;

	@OriginalMember(owner = "client!ek", name = "m", descriptor = "I")
	private int anInt2790 = -1;

	@OriginalMember(owner = "client!ek", name = "r", descriptor = "I")
	public int anInt2795 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!ek", name = "s", descriptor = "I")
	private int anInt2796 = -1;

	@OriginalMember(owner = "client!ek", name = "w", descriptor = "I")
	public int anInt2799 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!ek", name = "i", descriptor = "[Ljava/lang/String;")
	public final String[] aStringArray18 = new String[5];

	@OriginalMember(owner = "client!ek", name = "C", descriptor = "Z")
	public boolean aBoolean237 = true;

	@OriginalMember(owner = "client!ek", name = "n", descriptor = "I")
	public int anInt2791 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!ek", name = "q", descriptor = "I")
	public int anInt2794 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!ek", name = "F", descriptor = "I")
	private int anInt2806 = -1;

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "I")
	public int anInt2783 = -1;

	@OriginalMember(owner = "client!ek", name = "M", descriptor = "I")
	public int anInt2812 = -1;

	@OriginalMember(owner = "client!ek", name = "H", descriptor = "I")
	public int anInt2808 = 0;

	@OriginalMember(owner = "client!ek", name = "B", descriptor = "I")
	public int anInt2803 = -1;

	@OriginalMember(owner = "client!ek", name = "j", descriptor = "Z")
	public boolean aBoolean235 = true;

	@OriginalMember(owner = "client!ek", name = "z", descriptor = "I")
	public int anInt2801 = -1;

	@OriginalMember(owner = "client!ek", name = "Q", descriptor = "I")
	private int anInt2814 = -1;

	@OriginalMember(owner = "client!ek", name = "o", descriptor = "I")
	public int anInt2792 = -1;

	@OriginalMember(owner = "client!ek", name = "V", descriptor = "Z")
	public boolean aBoolean238 = true;

	@OriginalMember(owner = "client!ek", name = "K", descriptor = "I")
	public int anInt2810 = -1;

	@OriginalMember(owner = "client!ek", name = "v", descriptor = "I")
	private int anInt2798 = -1;

	@OriginalMember(owner = "client!ek", name = "ab", descriptor = "I")
	public int anInt2820 = -1;

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(BLclient!mc;)V")
	public void method2493(@OriginalArg(1) Class5_Sub41 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method7816();
			if (local3 == 0) {
				return;
			}
			this.method2502(arg0, local3);
		}
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(IILjava/lang/String;)Ljava/lang/String;")
	public String method2494(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		if (this.aClass300_12 == null) {
			return arg1;
		} else {
			@Pc(23) Class5_Sub11 local23 = (Class5_Sub11) this.aClass300_12.method7188((long) arg0);
			return local23 == null ? arg1 : local23.aString8;
		}
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(III)I")
	public int method2495(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass300_12 == null) {
			return arg1;
		} else {
			@Pc(20) Class5_Sub47 local20 = (Class5_Sub47) this.aClass300_12.method7188((long) arg0);
			return local20 == null ? arg1 : local20.anInt8308;
		}
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(I)V")
	public void method2496() {
		if (this.anIntArray105 == null) {
			return;
		}
		for (@Pc(4) int local4 = 0; local4 < this.anIntArray105.length; local4 += 2) {
			if (this.anIntArray105[local4] < this.anInt2794) {
				this.anInt2794 = this.anIntArray105[local4];
			} else if (this.anIntArray105[local4] > this.anInt2791) {
				this.anInt2791 = this.anIntArray105[local4];
			}
			if (this.anInt2799 > this.anIntArray105[local4 + 1]) {
				this.anInt2799 = this.anIntArray105[local4 + 1];
			} else if (this.anIntArray105[local4 + 1] > this.anInt2795) {
				this.anInt2795 = this.anIntArray105[local4 + 1];
			}
		}
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(ILclient!ha;)Lclient!pu;")
	public Class50 method2497(@OriginalArg(1) Class65 arg0) {
		@Pc(20) Class50 local20 = (Class50) this.aClass93_4.aClass340_13.method7999((long) (this.anInt2796 | 0x20000 | arg0.anInt8116 << 29));
		if (local20 != null) {
			return local20;
		}
		this.aClass93_4.aClass390_25.method8905(this.anInt2796);
		@Pc(40) Class369 local40 = Static689.method8541(this.aClass93_4.aClass390_25, this.anInt2796, 0);
		if (local40 != null) {
			local20 = arg0.method6898(local40, true);
			this.aClass93_4.aClass340_13.method7986((long) (arg0.anInt8116 << 29 | 0x20000 | this.anInt2796), local20);
		}
		return local20;
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(ZILclient!ha;)Lclient!pu;")
	public Class50 method2498(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class65 arg1) {
		@Pc(19) int local19 = arg0 ? this.anInt2820 : this.anInt2810;
		@Pc(26) int local26 = arg1.anInt8116 << 29 | local19;
		@Pc(35) Class50 local35 = (Class50) this.aClass93_4.aClass340_13.method7999((long) local26);
		if (local35 != null) {
			return local35;
		} else if (this.aClass93_4.aClass390_25.method8905(local19)) {
			@Pc(55) Class369 local55 = Static689.method8541(this.aClass93_4.aClass390_25, local19, 0);
			if (local55 != null) {
				local35 = arg1.method6898(local55, true);
				this.aClass93_4.aClass340_13.method7986((long) local26, local35);
			}
			return local35;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(ILclient!bd;)Z")
	public boolean method2499(@OriginalArg(1) Interface2 arg0) {
		@Pc(13) int local13;
		if (this.anInt2806 == -1) {
			if (this.anInt2814 == -1) {
				return true;
			}
			local13 = arg0.method5678(this.anInt2814);
		} else {
			local13 = arg0.method5679(this.anInt2806);
		}
		if (local13 < this.anInt2811 || local13 > this.anInt2784) {
			return false;
		}
		@Pc(56) int local56;
		if (this.anInt2798 == -1) {
			if (this.anInt2790 == -1) {
				return true;
			}
			local56 = arg0.method5678(this.anInt2790);
		} else {
			local56 = arg0.method5679(this.anInt2798);
		}
		return this.anInt2816 <= local56 && this.anInt2807 >= local56;
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(Lclient!mc;BI)V")
	private void method2502(@OriginalArg(0) Class5_Sub41 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt2810 = arg0.method7860();
		} else if (arg1 == 2) {
			this.anInt2820 = arg0.method7860();
		} else if (arg1 == 3) {
			this.aString17 = arg0.method7847();
		} else if (arg1 == 4) {
			this.anInt2797 = arg0.method7807();
		} else if (arg1 == 5) {
			this.anInt2803 = arg0.method7807();
		} else if (arg1 == 6) {
			this.anInt2808 = arg0.method7816();
		} else {
			@Pc(42) int local42;
			if (arg1 == 7) {
				local42 = arg0.method7816();
				if ((local42 & 0x1) == 0) {
					this.aBoolean238 = false;
				}
				if ((local42 & 0x2) == 2) {
					this.aBoolean236 = true;
				}
			} else if (arg1 == 8) {
				this.aBoolean237 = arg0.method7816() == 1;
			} else if (arg1 == 9) {
				this.anInt2814 = arg0.method7860();
				if (this.anInt2814 == 65535) {
					this.anInt2814 = -1;
				}
				this.anInt2806 = arg0.method7860();
				if (this.anInt2806 == 65535) {
					this.anInt2806 = -1;
				}
				this.anInt2811 = arg0.method7804();
				this.anInt2784 = arg0.method7804();
			} else if (arg1 >= 10 && arg1 <= 14) {
				this.aStringArray18[arg1 - 10] = arg0.method7847();
			} else {
				@Pc(149) int local149;
				@Pc(178) int local178;
				if (arg1 == 15) {
					local42 = arg0.method7816();
					this.anIntArray105 = new int[local42 * 2];
					for (local149 = 0; local149 < local42 * 2; local149++) {
						this.anIntArray105[local149] = arg0.method7849();
					}
					this.anInt2819 = arg0.method7804();
					@Pc(172) int local172 = arg0.method7816();
					this.anIntArray104 = new int[local172];
					for (local178 = 0; local178 < this.anIntArray104.length; local178++) {
						this.anIntArray104[local178] = arg0.method7804();
					}
					this.aByteArray19 = new byte[local42];
					for (@Pc(198) int local198 = 0; local198 < local42; local198++) {
						this.aByteArray19[local198] = arg0.method7861();
					}
				} else if (arg1 == 16) {
					this.aBoolean235 = false;
				} else if (arg1 == 17) {
					this.aString16 = arg0.method7847();
				} else if (arg1 == 18) {
					this.anInt2796 = arg0.method7860();
				} else if (arg1 == 19) {
					this.anInt2801 = arg0.method7860();
				} else if (arg1 == 20) {
					this.anInt2790 = arg0.method7860();
					if (this.anInt2790 == 65535) {
						this.anInt2790 = -1;
					}
					this.anInt2798 = arg0.method7860();
					if (this.anInt2798 == 65535) {
						this.anInt2798 = -1;
					}
					this.anInt2816 = arg0.method7804();
					this.anInt2807 = arg0.method7804();
				} else if (arg1 == 21) {
					this.anInt2809 = arg0.method7804();
				} else if (arg1 == 22) {
					this.anInt2793 = arg0.method7804();
				} else if (arg1 == 23) {
					this.anInt2812 = arg0.method7816();
					this.anInt2792 = arg0.method7816();
					this.anInt2783 = arg0.method7816();
				} else if (arg1 == 24) {
					this.anInt2817 = arg0.method7849();
					this.anInt2802 = arg0.method7849();
				} else if (arg1 == 249) {
					local42 = arg0.method7816();
					if (this.aClass300_12 == null) {
						local149 = Static67.method917(local42);
						this.aClass300_12 = new Class300(local149);
					}
					for (local149 = 0; local149 < local42; local149++) {
						@Pc(325) boolean local325 = arg0.method7816() == 1;
						local178 = arg0.method7807();
						@Pc(338) Class5 local338;
						if (local325) {
							local338 = new Class5_Sub11(arg0.method7847());
						} else {
							local338 = new Class5_Sub47(arg0.method7804());
						}
						this.aClass300_12.method7191(local338, (long) local178);
					}
				}
			}
		}
	}
}
