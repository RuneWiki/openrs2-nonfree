import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!re")
public final class Class299 {

	@OriginalMember(owner = "client!re", name = "a", descriptor = "Lclient!bt;")
	public Class42 aClass42_2;

	@OriginalMember(owner = "client!re", name = "d", descriptor = "[I")
	public int[] anIntArray458;

	@OriginalMember(owner = "client!re", name = "j", descriptor = "I")
	private int anInt8117;

	@OriginalMember(owner = "client!re", name = "k", descriptor = "Lclient!pl;")
	private Class273 aClass273_32;

	@OriginalMember(owner = "client!re", name = "m", descriptor = "I")
	public int anInt8119;

	@OriginalMember(owner = "client!re", name = "n", descriptor = "I")
	public int anInt8120;

	@OriginalMember(owner = "client!re", name = "p", descriptor = "I")
	private int anInt8122;

	@OriginalMember(owner = "client!re", name = "t", descriptor = "Ljava/lang/String;")
	public String aString93;

	@OriginalMember(owner = "client!re", name = "z", descriptor = "I")
	public int anInt8129;

	@OriginalMember(owner = "client!re", name = "A", descriptor = "[B")
	public byte[] aByteArray78;

	@OriginalMember(owner = "client!re", name = "B", descriptor = "I")
	public int anInt8130;

	@OriginalMember(owner = "client!re", name = "I", descriptor = "I")
	private int anInt8135;

	@OriginalMember(owner = "client!re", name = "L", descriptor = "[I")
	public int[] anIntArray459;

	@OriginalMember(owner = "client!re", name = "N", descriptor = "I")
	private int anInt8139;

	@OriginalMember(owner = "client!re", name = "P", descriptor = "I")
	public int anInt8141;

	@OriginalMember(owner = "client!re", name = "R", descriptor = "Ljava/lang/String;")
	public String aString94;

	@OriginalMember(owner = "client!re", name = "T", descriptor = "I")
	public int anInt8144;

	@OriginalMember(owner = "client!re", name = "V", descriptor = "I")
	public int anInt8146;

	@OriginalMember(owner = "client!re", name = "h", descriptor = "I")
	public int anInt8115 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!re", name = "c", descriptor = "I")
	public int anInt8113 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!re", name = "v", descriptor = "I")
	public int anInt8125 = -1;

	@OriginalMember(owner = "client!re", name = "y", descriptor = "I")
	public int anInt8128 = -1;

	@OriginalMember(owner = "client!re", name = "D", descriptor = "I")
	private int anInt8132 = -1;

	@OriginalMember(owner = "client!re", name = "f", descriptor = "I")
	public int anInt8114 = 0;

	@OriginalMember(owner = "client!re", name = "C", descriptor = "I")
	private int anInt8131 = -1;

	@OriginalMember(owner = "client!re", name = "o", descriptor = "I")
	public int anInt8121 = -1;

	@OriginalMember(owner = "client!re", name = "F", descriptor = "I")
	public int anInt8134 = -1;

	@OriginalMember(owner = "client!re", name = "q", descriptor = "[Ljava/lang/String;")
	public final String[] aStringArray66 = new String[5];

	@OriginalMember(owner = "client!re", name = "K", descriptor = "I")
	private int anInt8137 = -1;

	@OriginalMember(owner = "client!re", name = "O", descriptor = "I")
	public int anInt8140 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!re", name = "l", descriptor = "I")
	private int anInt8118 = -1;

	@OriginalMember(owner = "client!re", name = "M", descriptor = "I")
	public int anInt8138 = -1;

	@OriginalMember(owner = "client!re", name = "H", descriptor = "Z")
	public boolean aBoolean591 = false;

	@OriginalMember(owner = "client!re", name = "e", descriptor = "Z")
	public boolean aBoolean587 = true;

	@OriginalMember(owner = "client!re", name = "b", descriptor = "I")
	private int anInt8112 = -1;

	@OriginalMember(owner = "client!re", name = "u", descriptor = "Z")
	public boolean aBoolean589 = true;

	@OriginalMember(owner = "client!re", name = "i", descriptor = "I")
	public int anInt8116 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!re", name = "G", descriptor = "Z")
	public boolean aBoolean590 = true;

	@OriginalMember(owner = "client!re", name = "U", descriptor = "I")
	public int anInt8145 = -1;

	@OriginalMember(owner = "client!re", name = "S", descriptor = "I")
	public int anInt8143 = -1;

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(ILclient!ofa;I)V")
	private void method7059(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub22 arg1) {
		if (arg0 == 1) {
			this.anInt8134 = arg1.method5968();
		} else if (arg0 == 2) {
			this.anInt8128 = arg1.method5968();
		} else if (arg0 == 3) {
			this.aString93 = arg1.method5937();
		} else if (arg0 == 4) {
			this.anInt8141 = arg1.method5931();
		} else if (arg0 == 5) {
			this.anInt8145 = arg1.method5931();
		} else if (arg0 == 6) {
			this.anInt8114 = arg1.method5966();
		} else {
			@Pc(90) int local90;
			if (arg0 == 7) {
				local90 = arg1.method5966();
				if ((local90 & 0x1) == 0) {
					this.aBoolean589 = false;
				}
				if ((local90 & 0x2) == 2) {
					this.aBoolean591 = true;
				}
			} else if (arg0 == 8) {
				this.aBoolean590 = arg1.method5966() == 1;
			} else if (arg0 == 9) {
				this.anInt8137 = arg1.method5968();
				if (this.anInt8137 == 65535) {
					this.anInt8137 = -1;
				}
				this.anInt8132 = arg1.method5968();
				if (this.anInt8132 == 65535) {
					this.anInt8132 = -1;
				}
				this.anInt8117 = arg1.method5913();
				this.anInt8135 = arg1.method5913();
			} else if (arg0 >= 10 && arg0 <= 14) {
				this.aStringArray66[arg0 - 10] = arg1.method5937();
			} else {
				@Pc(98) int local98;
				@Pc(132) int local132;
				if (arg0 == 15) {
					local90 = arg1.method5966();
					this.anIntArray458 = new int[local90 * 2];
					for (local98 = 0; local98 < local90 * 2; local98++) {
						this.anIntArray458[local98] = arg1.method5956();
					}
					this.anInt8120 = arg1.method5913();
					@Pc(126) int local126 = arg1.method5966();
					this.anIntArray459 = new int[local126];
					for (local132 = 0; local132 < this.anIntArray459.length; local132++) {
						this.anIntArray459[local132] = arg1.method5913();
					}
					this.aByteArray78 = new byte[local90];
					for (@Pc(153) int local153 = 0; local153 < local90; local153++) {
						this.aByteArray78[local153] = arg1.method5963();
					}
				} else if (arg0 == 16) {
					this.aBoolean587 = false;
				} else if (arg0 == 17) {
					this.aString94 = arg1.method5937();
				} else if (arg0 == 18) {
					this.anInt8118 = arg1.method5968();
				} else if (arg0 == 19) {
					this.anInt8121 = arg1.method5968();
				} else if (arg0 == 20) {
					this.anInt8112 = arg1.method5968();
					if (this.anInt8112 == 65535) {
						this.anInt8112 = -1;
					}
					this.anInt8131 = arg1.method5968();
					if (this.anInt8131 == 65535) {
						this.anInt8131 = -1;
					}
					this.anInt8122 = arg1.method5913();
					this.anInt8139 = arg1.method5913();
				} else if (arg0 == 21) {
					this.anInt8119 = arg1.method5913();
				} else if (arg0 == 22) {
					this.anInt8130 = arg1.method5913();
				} else if (arg0 == 23) {
					this.anInt8143 = arg1.method5966();
					this.anInt8138 = arg1.method5966();
					this.anInt8125 = arg1.method5966();
				} else if (arg0 == 24) {
					this.anInt8146 = arg1.method5956();
					this.anInt8129 = arg1.method5956();
				} else if (arg0 == 249) {
					local90 = arg1.method5966();
					if (this.aClass273_32 == null) {
						local98 = Static613.method8740(local90);
						this.aClass273_32 = new Class273(local98);
					}
					for (local98 = 0; local98 < local90; local98++) {
						@Pc(307) boolean local307 = arg1.method5966() == 1;
						local132 = arg1.method5931();
						@Pc(320) Class5 local320;
						if (local307) {
							local320 = new Class5_Sub7(arg1.method5937());
						} else {
							local320 = new Class5_Sub41(arg1.method5913());
						}
						this.aClass273_32.method6585((long) local132, local320);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(BLclient!ofa;)V")
	public void method7060(@OriginalArg(1) Class5_Sub22 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method5966();
			if (local9 == 0) {
				return;
			}
			this.method7059(local9, arg0);
		}
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(B)V")
	public void method7061() {
		if (this.anIntArray458 == null) {
			return;
		}
		for (@Pc(10) int local10 = 0; local10 < this.anIntArray458.length; local10 += 2) {
			if (this.anIntArray458[local10] < this.anInt8115) {
				this.anInt8115 = this.anIntArray458[local10];
			} else if (this.anIntArray458[local10] > this.anInt8140) {
				this.anInt8140 = this.anIntArray458[local10];
			}
			if (this.anInt8116 > this.anIntArray458[local10 + 1]) {
				this.anInt8116 = this.anIntArray458[local10 + 1];
			} else if (this.anInt8113 < this.anIntArray458[local10 + 1]) {
				this.anInt8113 = this.anIntArray458[local10 + 1];
			}
		}
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(ZLclient!ha;I)Lclient!it;")
	public Class28 method7062(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class133 arg1) {
		@Pc(11) int local11 = arg0 ? this.anInt8128 : this.anInt8134;
		@Pc(18) int local18 = arg1.anInt8326 << 29 | local11;
		@Pc(36) Class28 local36 = (Class28) this.aClass42_2.aClass87_37.method1805((long) local18);
		if (local36 != null) {
			return local36;
		} else if (this.aClass42_2.aClass207_14.method4678(local11)) {
			@Pc(56) Class131 local56 = Static649.method2888(this.aClass42_2.aClass207_14, local11, 0);
			if (local56 != null) {
				local36 = arg1.method7297(local56, true);
				this.aClass42_2.aClass87_37.method1792((long) local18, local36);
			}
			return local36;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(IILjava/lang/String;)Ljava/lang/String;")
	public String method7063(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1) {
		if (this.aClass273_32 == null) {
			return arg1;
		} else {
			@Pc(25) Class5_Sub7 local25 = (Class5_Sub7) this.aClass273_32.method6581((long) arg0);
			return local25 == null ? arg1 : local25.aString19;
		}
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(BLclient!ko;)Z")
	public boolean method7064(@OriginalArg(1) Interface12 arg0) {
		@Pc(22) int local22;
		if (this.anInt8132 == -1) {
			if (this.anInt8137 == -1) {
				return true;
			}
			local22 = arg0.method1303(this.anInt8137);
		} else {
			local22 = arg0.method1304(this.anInt8132);
		}
		if (this.anInt8117 > local22 || this.anInt8135 < local22) {
			return false;
		}
		@Pc(68) int local68;
		if (this.anInt8131 == -1) {
			if (this.anInt8112 == -1) {
				return true;
			}
			local68 = arg0.method1303(this.anInt8112);
		} else {
			local68 = arg0.method1304(this.anInt8131);
		}
		return this.anInt8122 <= local68 && this.anInt8139 >= local68;
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(ILclient!ha;)Lclient!it;")
	public Class28 method7065(@OriginalArg(1) Class133 arg0) {
		@Pc(20) Class28 local20 = (Class28) this.aClass42_2.aClass87_37.method1805((long) (arg0.anInt8326 << 29 | 0x20000 | this.anInt8118));
		if (local20 != null) {
			return local20;
		}
		this.aClass42_2.aClass207_14.method4678(this.anInt8118);
		@Pc(46) Class131 local46 = Static649.method2888(this.aClass42_2.aClass207_14, this.anInt8118, 0);
		if (local46 != null) {
			local20 = arg0.method7297(local46, true);
			this.aClass42_2.aClass87_37.method1792((long) (arg0.anInt8326 << 29 | 0x20000 | this.anInt8118), local20);
		}
		return local20;
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(IBI)I")
	public int method7066(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass273_32 == null) {
			return arg1;
		} else {
			@Pc(16) Class5_Sub41 local16 = (Class5_Sub41) this.aClass273_32.method6581((long) arg0);
			return local16 == null ? arg1 : local16.anInt7600;
		}
	}
}
