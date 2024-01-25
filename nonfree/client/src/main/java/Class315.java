import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sb")
public final class Class315 {

	@OriginalMember(owner = "client!sb", name = "Z", descriptor = "I")
	private int anInt8865;

	@OriginalMember(owner = "client!sb", name = "y", descriptor = "Lclient!bd;")
	public Class33 aClass33_2;

	@OriginalMember(owner = "client!sb", name = "o", descriptor = "[I")
	public int[] anIntArray514;

	@OriginalMember(owner = "client!sb", name = "x", descriptor = "I")
	public int anInt8868;

	@OriginalMember(owner = "client!sb", name = "k", descriptor = "I")
	private int anInt8879;

	@OriginalMember(owner = "client!sb", name = "W", descriptor = "I")
	public int anInt8880;

	@OriginalMember(owner = "client!sb", name = "R", descriptor = "I")
	public int anInt8881;

	@OriginalMember(owner = "client!sb", name = "U", descriptor = "Ljava/lang/String;")
	public String aString116;

	@OriginalMember(owner = "client!sb", name = "w", descriptor = "I")
	private int anInt8884;

	@OriginalMember(owner = "client!sb", name = "i", descriptor = "I")
	public int anInt8886;

	@OriginalMember(owner = "client!sb", name = "D", descriptor = "[I")
	public int[] anIntArray515;

	@OriginalMember(owner = "client!sb", name = "G", descriptor = "Lclient!qha;")
	private Class291 aClass291_35;

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "I")
	public int anInt8889;

	@OriginalMember(owner = "client!sb", name = "J", descriptor = "I")
	public int anInt8894;

	@OriginalMember(owner = "client!sb", name = "t", descriptor = "[B")
	public byte[] aByteArray83;

	@OriginalMember(owner = "client!sb", name = "P", descriptor = "Ljava/lang/String;")
	public String aString117;

	@OriginalMember(owner = "client!sb", name = "g", descriptor = "I")
	private int anInt8898;

	@OriginalMember(owner = "client!sb", name = "O", descriptor = "I")
	public int anInt8899;

	@OriginalMember(owner = "client!sb", name = "m", descriptor = "Z")
	public boolean aBoolean672 = true;

	@OriginalMember(owner = "client!sb", name = "F", descriptor = "[Ljava/lang/String;")
	public final String[] aStringArray64 = new String[5];

	@OriginalMember(owner = "client!sb", name = "l", descriptor = "I")
	private int anInt8872 = -1;

	@OriginalMember(owner = "client!sb", name = "q", descriptor = "Z")
	public boolean aBoolean671 = true;

	@OriginalMember(owner = "client!sb", name = "T", descriptor = "Z")
	public boolean aBoolean673 = true;

	@OriginalMember(owner = "client!sb", name = "ab", descriptor = "I")
	public int anInt8882 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!sb", name = "bb", descriptor = "I")
	private int anInt8869 = -1;

	@OriginalMember(owner = "client!sb", name = "X", descriptor = "I")
	private int anInt8892 = -1;

	@OriginalMember(owner = "client!sb", name = "z", descriptor = "I")
	public int anInt8891 = -1;

	@OriginalMember(owner = "client!sb", name = "N", descriptor = "Z")
	public boolean aBoolean675 = false;

	@OriginalMember(owner = "client!sb", name = "S", descriptor = "I")
	public int anInt8895 = -1;

	@OriginalMember(owner = "client!sb", name = "B", descriptor = "I")
	public int anInt8888 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!sb", name = "Q", descriptor = "I")
	public int anInt8897 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!sb", name = "u", descriptor = "I")
	public int anInt8870 = -1;

	@OriginalMember(owner = "client!sb", name = "K", descriptor = "I")
	public int anInt8875 = -1;

	@OriginalMember(owner = "client!sb", name = "H", descriptor = "I")
	private int anInt8890 = -1;

	@OriginalMember(owner = "client!sb", name = "c", descriptor = "I")
	public int anInt8873 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!sb", name = "e", descriptor = "I")
	private int anInt8887 = -1;

	@OriginalMember(owner = "client!sb", name = "v", descriptor = "I")
	public int anInt8902 = -1;

	@OriginalMember(owner = "client!sb", name = "I", descriptor = "I")
	public int anInt8903 = 0;

	@OriginalMember(owner = "client!sb", name = "Y", descriptor = "I")
	public int anInt8900 = -1;

	@OriginalMember(owner = "client!sb", name = "b", descriptor = "I")
	public int anInt8901 = -1;

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(BII)I")
	public int method7597(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass291_35 == null) {
			return arg0;
		} else {
			@Pc(25) Class5_Sub29 local25 = (Class5_Sub29) this.aClass291_35.method6993((long) arg1, 1);
			return local25 == null ? arg0 : local25.anInt5492;
		}
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(Lclient!gm;Z)Z")
	public boolean method7598(@OriginalArg(0) Interface7 arg0) {
		@Pc(23) int local23;
		if (this.anInt8892 == -1) {
			if (this.anInt8887 == -1) {
				return true;
			}
			local23 = arg0.method2141(this.anInt8887);
		} else {
			local23 = arg0.method2140(this.anInt8892);
		}
		if (local23 < this.anInt8865 || local23 > this.anInt8884) {
			return false;
		}
		@Pc(76) int local76;
		if (this.anInt8869 == -1) {
			if (this.anInt8890 == -1) {
				return true;
			}
			local76 = arg0.method2141(this.anInt8890);
		} else {
			local76 = arg0.method2140(this.anInt8869);
		}
		return local76 >= this.anInt8898 && local76 <= this.anInt8879;
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(Lclient!ha;I)Lclient!fs;")
	public Class134 method7599(@OriginalArg(0) Class57 arg0) {
		@Pc(20) Class134 local20 = (Class134) this.aClass33_2.aClass391_7.method9275((long) (this.anInt8872 | 0x20000 | arg0.anInt8956 << 29));
		if (local20 != null) {
			return local20;
		}
		this.aClass33_2.aClass208_7.method4977(this.anInt8872);
		@Pc(51) Class173 local51 = Static684.method3655(this.aClass33_2.aClass208_7, this.anInt8872, 0);
		if (local51 != null) {
			local20 = arg0.method7654(local51, true);
			this.aClass33_2.aClass391_7.method9273((long) (arg0.anInt8956 << 29 | 0x20000 | this.anInt8872), local20, 1);
		}
		return local20;
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(ILclient!ib;I)V")
	private void method7600(@OriginalArg(1) Class5_Sub23 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt8895 = arg0.method8519();
		} else if (arg1 == 2) {
			this.anInt8875 = arg0.method8519();
		} else if (arg1 == 3) {
			this.aString116 = arg0.method8497();
		} else if (arg1 == 4) {
			this.anInt8886 = arg0.method8510();
		} else if (arg1 == 5) {
			this.anInt8902 = arg0.method8510();
		} else if (arg1 == 6) {
			this.anInt8903 = arg0.method8529();
		} else {
			@Pc(75) int local75;
			if (arg1 == 7) {
				local75 = arg0.method8529();
				if ((local75 & 0x1) == 0) {
					this.aBoolean673 = false;
				}
				if ((local75 & 0x2) == 2) {
					this.aBoolean675 = true;
					return;
				}
			} else if (arg1 == 8) {
				this.aBoolean672 = arg0.method8529() == 1;
				return;
			} else if (arg1 == 9) {
				this.anInt8887 = arg0.method8519();
				if (this.anInt8887 == 65535) {
					this.anInt8887 = -1;
				}
				this.anInt8892 = arg0.method8519();
				if (this.anInt8892 == 65535) {
					this.anInt8892 = -1;
				}
				this.anInt8865 = arg0.method8527();
				this.anInt8884 = arg0.method8527();
				return;
			} else if (arg1 >= 10 && arg1 <= 14) {
				this.aStringArray64[arg1 - 10] = arg0.method8497();
			} else {
				@Pc(190) int local190;
				@Pc(226) int local226;
				if (arg1 != 15) {
					if (arg1 != 16) {
						if (arg1 != 17) {
							if (arg1 == 18) {
								this.anInt8872 = arg0.method8519();
								return;
							}
							if (arg1 == 19) {
								this.anInt8900 = arg0.method8519();
								return;
							}
							if (arg1 == 20) {
								this.anInt8890 = arg0.method8519();
								if (this.anInt8890 == 65535) {
									this.anInt8890 = -1;
								}
								this.anInt8869 = arg0.method8519();
								if (this.anInt8869 == 65535) {
									this.anInt8869 = -1;
								}
								this.anInt8898 = arg0.method8527();
								this.anInt8879 = arg0.method8527();
								return;
							}
							if (arg1 == 21) {
								this.anInt8894 = arg0.method8527();
								return;
							}
							if (arg1 == 22) {
								this.anInt8889 = arg0.method8527();
								return;
							}
							if (arg1 == 23) {
								this.anInt8891 = arg0.method8529();
								this.anInt8901 = arg0.method8529();
								this.anInt8870 = arg0.method8529();
							} else if (arg1 == 24) {
								this.anInt8899 = arg0.method8516();
								this.anInt8880 = arg0.method8516();
								return;
							} else if (arg1 == 249) {
								local75 = arg0.method8529();
								if (this.aClass291_35 == null) {
									local190 = Static94.method1393(local75);
									this.aClass291_35 = new Class291(local190);
								}
								for (local190 = 0; local190 < local75; local190++) {
									@Pc(433) boolean local433 = arg0.method8529() == 1;
									local226 = arg0.method8510();
									@Pc(446) Class5 local446;
									if (local433) {
										local446 = new Class5_Sub42(arg0.method8497());
									} else {
										local446 = new Class5_Sub29(arg0.method8527());
									}
									this.aClass291_35.method6984((long) local226, local446);
								}
								return;
							}
							return;
						}
						this.aString117 = arg0.method8497();
						return;
					}
					this.aBoolean671 = false;
					return;
				}
				local75 = arg0.method8529();
				this.anIntArray514 = new int[local75 * 2];
				for (local190 = 0; local190 < local75 * 2; local190++) {
					this.anIntArray514[local190] = arg0.method8516();
				}
				this.anInt8881 = arg0.method8527();
				@Pc(220) int local220 = arg0.method8529();
				this.anIntArray515 = new int[local220];
				for (local226 = 0; local226 < this.anIntArray515.length; local226++) {
					this.anIntArray515[local226] = arg0.method8527();
				}
				this.aByteArray83 = new byte[local75];
				for (@Pc(251) int local251 = 0; local251 < local75; local251++) {
					this.aByteArray83[local251] = arg0.method8488();
				}
				return;
			}
		}
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(Z)V")
	public void method7601() {
		if (this.anIntArray514 == null) {
			return;
		}
		for (@Pc(6) int local6 = 0; local6 < this.anIntArray514.length; local6 += 2) {
			if (this.anInt8897 > this.anIntArray514[local6]) {
				this.anInt8897 = this.anIntArray514[local6];
			} else if (this.anInt8873 < this.anIntArray514[local6]) {
				this.anInt8873 = this.anIntArray514[local6];
			}
			if (this.anIntArray514[local6 + 1] < this.anInt8888) {
				this.anInt8888 = this.anIntArray514[local6 + 1];
			} else if (this.anIntArray514[local6 + 1] > this.anInt8882) {
				this.anInt8882 = this.anIntArray514[local6 + 1];
			}
		}
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(BLclient!ib;)V")
	public void method7603(@OriginalArg(1) Class5_Sub23 arg0) {
		while (true) {
			@Pc(14) int local14 = arg0.method8529();
			if (local14 == 0) {
				return;
			}
			this.method7600(arg0, local14);
		}
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(BLjava/lang/String;I)Ljava/lang/String;")
	public String method7604(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1) {
		if (this.aClass291_35 == null) {
			return arg0;
		} else {
			@Pc(25) Class5_Sub42 local25 = (Class5_Sub42) this.aClass291_35.method6993((long) arg1, 1);
			return local25 == null ? arg0 : local25.aString105;
		}
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(ZILclient!ha;)Lclient!fs;")
	public Class134 method7606(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class57 arg1) {
		@Pc(23) int local23 = arg0 ? this.anInt8875 : this.anInt8895;
		@Pc(30) int local30 = arg1.anInt8956 << 29 | local23;
		@Pc(39) Class134 local39 = (Class134) this.aClass33_2.aClass391_7.method9275((long) local30);
		if (local39 != null) {
			return local39;
		} else if (this.aClass33_2.aClass208_7.method4977(local23)) {
			@Pc(61) Class173 local61 = Static684.method3655(this.aClass33_2.aClass208_7, local23, 0);
			if (local61 != null) {
				local39 = arg1.method7654(local61, true);
				this.aClass33_2.aClass391_7.method9273((long) local30, local39, 1);
			}
			return local39;
		} else {
			return null;
		}
	}
}
