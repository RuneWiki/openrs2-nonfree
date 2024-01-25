import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fm")
public final class Class101 {

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "Ljava/lang/String;")
	public String aString33;

	@OriginalMember(owner = "client!fm", name = "c", descriptor = "I")
	public int anInt2859;

	@OriginalMember(owner = "client!fm", name = "f", descriptor = "[I")
	public int[] anIntArray235;

	@OriginalMember(owner = "client!fm", name = "i", descriptor = "I")
	private int anInt2862;

	@OriginalMember(owner = "client!fm", name = "j", descriptor = "I")
	public int anInt2863;

	@OriginalMember(owner = "client!fm", name = "r", descriptor = "I")
	public int anInt2869;

	@OriginalMember(owner = "client!fm", name = "u", descriptor = "I")
	private int anInt2872;

	@OriginalMember(owner = "client!fm", name = "v", descriptor = "Ljava/lang/String;")
	public String aString34;

	@OriginalMember(owner = "client!fm", name = "x", descriptor = "I")
	private int anInt2874;

	@OriginalMember(owner = "client!fm", name = "C", descriptor = "I")
	public int anInt2879;

	@OriginalMember(owner = "client!fm", name = "E", descriptor = "I")
	private int anInt2881;

	@OriginalMember(owner = "client!fm", name = "H", descriptor = "Lclient!cb;")
	private Class42 aClass42_8;

	@OriginalMember(owner = "client!fm", name = "J", descriptor = "I")
	public int anInt2884;

	@OriginalMember(owner = "client!fm", name = "N", descriptor = "Lclient!qk;")
	public Class246 aClass246_1;

	@OriginalMember(owner = "client!fm", name = "R", descriptor = "I")
	public int anInt2889;

	@OriginalMember(owner = "client!fm", name = "d", descriptor = "Z")
	public boolean aBoolean186 = false;

	@OriginalMember(owner = "client!fm", name = "h", descriptor = "I")
	public int anInt2861 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!fm", name = "m", descriptor = "Z")
	public boolean aBoolean187 = true;

	@OriginalMember(owner = "client!fm", name = "n", descriptor = "Z")
	public boolean aBoolean188 = true;

	@OriginalMember(owner = "client!fm", name = "w", descriptor = "I")
	public int anInt2873 = -1;

	@OriginalMember(owner = "client!fm", name = "y", descriptor = "I")
	private int anInt2875 = -1;

	@OriginalMember(owner = "client!fm", name = "A", descriptor = "I")
	public int anInt2877 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!fm", name = "B", descriptor = "I")
	public int anInt2878 = 0;

	@OriginalMember(owner = "client!fm", name = "I", descriptor = "I")
	public int anInt2883 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!fm", name = "O", descriptor = "Z")
	public boolean aBoolean189 = true;

	@OriginalMember(owner = "client!fm", name = "G", descriptor = "I")
	private int anInt2882 = -1;

	@OriginalMember(owner = "client!fm", name = "Q", descriptor = "I")
	public int anInt2888 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!fm", name = "p", descriptor = "I")
	public int anInt2867 = -1;

	@OriginalMember(owner = "client!fm", name = "s", descriptor = "I")
	private int anInt2870 = -1;

	@OriginalMember(owner = "client!fm", name = "D", descriptor = "I")
	private int anInt2880 = -1;

	@OriginalMember(owner = "client!fm", name = "M", descriptor = "I")
	public int anInt2886 = -1;

	@OriginalMember(owner = "client!fm", name = "q", descriptor = "I")
	private int anInt2868 = -1;

	@OriginalMember(owner = "client!fm", name = "F", descriptor = "[Ljava/lang/String;")
	public final String[] aStringArray17 = new String[5];

	@OriginalMember(owner = "client!fm", name = "U", descriptor = "I")
	public int anInt2892 = -1;

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(BLjava/lang/String;I)Ljava/lang/String;")
	public String method2601(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1) {
		if (this.aClass42_8 == null) {
			return arg0;
		} else {
			@Pc(23) Class5_Sub50 local23 = (Class5_Sub50) this.aClass42_8.method1109((long) arg1);
			return local23 == null ? arg0 : local23.aString83;
		}
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(ILclient!qa;)Lclient!ha;")
	public Class25 method2602(@OriginalArg(1) Class62 arg0) {
		@Pc(20) Class25 local20 = (Class25) this.aClass246_1.aClass288_53.method6745((long) (this.anInt2868 | 0x20000 | arg0.anInt8664 << 29));
		if (local20 != null) {
			return local20;
		}
		this.aClass246_1.aClass117_170.method2973(this.anInt2868);
		@Pc(40) Class96 local40 = Static551.method2427(this.aClass246_1.aClass117_170, this.anInt2868, 0);
		if (local40 != null) {
			local20 = arg0.method6998(local40);
			this.aClass246_1.aClass288_53.method6746(local20, (long) (arg0.anInt8664 << 29 | 0x20000 | this.anInt2868));
		}
		return local20;
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(ILclient!ms;)Z")
	public boolean method2603(@OriginalArg(1) Interface7 arg0) {
		@Pc(21) int local21;
		if (this.anInt2870 == -1) {
			if (this.anInt2880 == -1) {
				return true;
			}
			local21 = arg0.method5717(this.anInt2880);
		} else {
			local21 = arg0.method5716(this.anInt2870);
		}
		if (local21 < this.anInt2881 || this.anInt2874 < local21) {
			return false;
		}
		@Pc(51) int local51;
		if (this.anInt2875 == -1) {
			if (this.anInt2882 == -1) {
				return true;
			}
			local51 = arg0.method5717(this.anInt2882);
		} else {
			local51 = arg0.method5716(this.anInt2875);
		}
		return local51 >= this.anInt2862 && this.anInt2872 >= local51;
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(ZBLclient!qa;)Lclient!ha;")
	public Class25 method2604(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class62 arg1) {
		@Pc(11) int local11 = arg0 ? this.anInt2873 : this.anInt2867;
		@Pc(24) int local24 = arg1.anInt8664 << 29 | local11;
		@Pc(33) Class25 local33 = (Class25) this.aClass246_1.aClass288_53.method6745((long) local24);
		if (local33 != null) {
			return local33;
		} else if (this.aClass246_1.aClass117_170.method2973(local11)) {
			@Pc(53) Class96 local53 = Static551.method2427(this.aClass246_1.aClass117_170, local11, 0);
			if (local53 != null) {
				local33 = arg1.method6998(local53);
				this.aClass246_1.aClass288_53.method6746(local33, (long) local24);
			}
			return local33;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(III)I")
	public int method2605(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass42_8 == null) {
			return arg0;
		} else {
			@Pc(22) Class5_Sub27 local22 = (Class5_Sub27) this.aClass42_8.method1109((long) arg1);
			return local22 == null ? arg0 : local22.anInt4812;
		}
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(B)V")
	public void method2606() {
		if (this.anIntArray235 == null) {
			return;
		}
		for (@Pc(12) int local12 = 0; local12 < this.anIntArray235.length; local12 += 2) {
			if (this.anInt2877 > this.anIntArray235[local12]) {
				this.anInt2877 = this.anIntArray235[local12];
			} else if (this.anIntArray235[local12] > this.anInt2888) {
				this.anInt2888 = this.anIntArray235[local12];
			}
			if (this.anIntArray235[local12 + 1] < this.anInt2883) {
				this.anInt2883 = this.anIntArray235[local12 + 1];
			} else if (this.anInt2861 < this.anIntArray235[local12 + 1]) {
				this.anInt2861 = this.anIntArray235[local12 + 1];
			}
		}
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(ILclient!co;)V")
	public void method2607(@OriginalArg(1) Class5_Sub3 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method4220();
			if (local5 == 0) {
				return;
			}
			this.method2608(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(IILclient!co;)V")
	private void method2608(@OriginalArg(1) int arg0, @OriginalArg(2) Class5_Sub3 arg1) {
		if (arg0 == 1) {
			this.anInt2867 = arg1.method4227();
		} else if (arg0 == 2) {
			this.anInt2873 = arg1.method4227();
		} else if (arg0 == 3) {
			this.aString34 = arg1.method4234();
		} else if (arg0 == 4) {
			this.anInt2879 = arg1.method4182();
		} else if (arg0 == 5) {
			this.anInt2892 = arg1.method4182();
			return;
		} else if (arg0 == 6) {
			this.anInt2878 = arg1.method4220();
			return;
		} else {
			@Pc(94) int local94;
			if (arg0 != 7) {
				if (arg0 == 8) {
					this.aBoolean189 = arg1.method4220() == 1;
					return;
				}
				if (arg0 == 9) {
					this.anInt2880 = arg1.method4227();
					if (this.anInt2880 == 65535) {
						this.anInt2880 = -1;
					}
					this.anInt2870 = arg1.method4227();
					if (this.anInt2870 == 65535) {
						this.anInt2870 = -1;
					}
					this.anInt2881 = arg1.method4230();
					this.anInt2874 = arg1.method4230();
					return;
				}
				if (arg0 >= 10 && arg0 <= 14) {
					this.aStringArray17[arg0 - 10] = arg1.method4234();
					return;
				}
				@Pc(102) int local102;
				if (arg0 != 15) {
					if (arg0 != 16) {
						if (arg0 == 17) {
							this.aString33 = arg1.method4234();
							return;
						}
						if (arg0 != 18) {
							if (arg0 == 19) {
								this.anInt2886 = arg1.method4227();
								return;
							}
							if (arg0 == 20) {
								this.anInt2882 = arg1.method4227();
								if (this.anInt2882 == 65535) {
									this.anInt2882 = -1;
								}
								this.anInt2875 = arg1.method4227();
								if (this.anInt2875 == 65535) {
									this.anInt2875 = -1;
								}
								this.anInt2862 = arg1.method4230();
								this.anInt2872 = arg1.method4230();
							} else if (arg0 == 21) {
								this.anInt2889 = arg1.method4230();
								return;
							} else if (arg0 == 22) {
								this.anInt2869 = arg1.method4230();
								return;
							} else if (arg0 == 249) {
								local94 = arg1.method4220();
								if (this.aClass42_8 == null) {
									local102 = Static179.method3071(local94);
									this.aClass42_8 = new Class42(local102);
								}
								for (local102 = 0; local102 < local94; local102++) {
									@Pc(226) boolean local226 = arg1.method4220() == 1;
									@Pc(230) int local230 = arg1.method4182();
									@Pc(239) Class5 local239;
									if (local226) {
										local239 = new Class5_Sub50(arg1.method4234());
									} else {
										local239 = new Class5_Sub27(arg1.method4230());
									}
									this.aClass42_8.method1106((long) local230, local239);
								}
								return;
							}
							return;
						}
						this.anInt2868 = arg1.method4227();
						return;
					}
					this.aBoolean187 = false;
					return;
				}
				local94 = arg1.method4220();
				this.anIntArray235 = new int[local94 * 2];
				for (local102 = 0; local102 < local94 * 2; local102++) {
					this.anIntArray235[local102] = arg1.method4212();
				}
				this.anInt2884 = arg1.method4230();
				this.anInt2863 = arg1.method4230();
				return;
			}
			local94 = arg1.method4220();
			if ((local94 & 0x1) == 0) {
				this.aBoolean188 = false;
			}
			if ((local94 & 0x2) == 2) {
				this.aBoolean186 = true;
				return;
			}
		}
	}
}
