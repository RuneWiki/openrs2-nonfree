import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ll")
public final class Class218 {

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "I")
	private int anInt6681;

	@OriginalMember(owner = "client!ll", name = "d", descriptor = "I")
	private int anInt6684;

	@OriginalMember(owner = "client!ll", name = "e", descriptor = "Ljava/lang/String;")
	public String aString76;

	@OriginalMember(owner = "client!ll", name = "h", descriptor = "I")
	public int anInt6687;

	@OriginalMember(owner = "client!ll", name = "j", descriptor = "I")
	public int anInt6688;

	@OriginalMember(owner = "client!ll", name = "l", descriptor = "I")
	private int anInt6689;

	@OriginalMember(owner = "client!ll", name = "o", descriptor = "[I")
	public int[] anIntArray319;

	@OriginalMember(owner = "client!ll", name = "q", descriptor = "I")
	private int anInt6693;

	@OriginalMember(owner = "client!ll", name = "r", descriptor = "Lclient!si;")
	private Class335 aClass335_21;

	@OriginalMember(owner = "client!ll", name = "x", descriptor = "I")
	public int anInt6699;

	@OriginalMember(owner = "client!ll", name = "y", descriptor = "[I")
	public int[] anIntArray320;

	@OriginalMember(owner = "client!ll", name = "D", descriptor = "I")
	public int anInt6700;

	@OriginalMember(owner = "client!ll", name = "K", descriptor = "Lclient!ac;")
	public Class5 aClass5_2;

	@OriginalMember(owner = "client!ll", name = "L", descriptor = "I")
	public int anInt6706;

	@OriginalMember(owner = "client!ll", name = "S", descriptor = "Ljava/lang/String;")
	public String aString77;

	@OriginalMember(owner = "client!ll", name = "T", descriptor = "I")
	public int anInt6713;

	@OriginalMember(owner = "client!ll", name = "V", descriptor = "I")
	public int anInt6715;

	@OriginalMember(owner = "client!ll", name = "ab", descriptor = "[B")
	public byte[] aByteArray64;

	@OriginalMember(owner = "client!ll", name = "g", descriptor = "I")
	public int anInt6686 = -1;

	@OriginalMember(owner = "client!ll", name = "i", descriptor = "Z")
	public boolean aBoolean505 = true;

	@OriginalMember(owner = "client!ll", name = "b", descriptor = "I")
	public int anInt6682 = -1;

	@OriginalMember(owner = "client!ll", name = "s", descriptor = "I")
	public int anInt6694 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!ll", name = "n", descriptor = "I")
	public int anInt6691 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!ll", name = "c", descriptor = "I")
	public int anInt6683 = -1;

	@OriginalMember(owner = "client!ll", name = "m", descriptor = "I")
	public int anInt6690 = -1;

	@OriginalMember(owner = "client!ll", name = "C", descriptor = "Z")
	public boolean aBoolean508 = false;

	@OriginalMember(owner = "client!ll", name = "P", descriptor = "I")
	private int anInt6710 = -1;

	@OriginalMember(owner = "client!ll", name = "N", descriptor = "I")
	private int anInt6708 = -1;

	@OriginalMember(owner = "client!ll", name = "F", descriptor = "I")
	public int anInt6702 = -1;

	@OriginalMember(owner = "client!ll", name = "z", descriptor = "Z")
	public boolean aBoolean506 = true;

	@OriginalMember(owner = "client!ll", name = "O", descriptor = "I")
	public int anInt6709 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!ll", name = "G", descriptor = "I")
	public int anInt6703 = 0;

	@OriginalMember(owner = "client!ll", name = "B", descriptor = "Z")
	public boolean aBoolean507 = true;

	@OriginalMember(owner = "client!ll", name = "H", descriptor = "[Ljava/lang/String;")
	public final String[] aStringArray35 = new String[5];

	@OriginalMember(owner = "client!ll", name = "I", descriptor = "I")
	public int anInt6704 = -1;

	@OriginalMember(owner = "client!ll", name = "Q", descriptor = "I")
	public int anInt6711 = -1;

	@OriginalMember(owner = "client!ll", name = "X", descriptor = "I")
	public int anInt6717 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!ll", name = "W", descriptor = "I")
	private int anInt6716 = -1;

	@OriginalMember(owner = "client!ll", name = "M", descriptor = "I")
	private int anInt6707 = -1;

	@OriginalMember(owner = "client!ll", name = "p", descriptor = "I")
	private int anInt6692 = -1;

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(III)I")
	public int method6000(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass335_21 == null) {
			return arg0;
		} else {
			@Pc(16) Class2_Sub14 local16 = (Class2_Sub14) this.aClass335_21.method8357((long) arg1);
			return local16 == null ? arg0 : local16.anInt1303;
		}
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(B)V")
	public void method6001() {
		if (this.anIntArray319 == null) {
			return;
		}
		for (@Pc(14) int local14 = 0; local14 < this.anIntArray319.length; local14 += 2) {
			if (this.anIntArray319[local14] < this.anInt6691) {
				this.anInt6691 = this.anIntArray319[local14];
			} else if (this.anIntArray319[local14] > this.anInt6717) {
				this.anInt6717 = this.anIntArray319[local14];
			}
			if (this.anInt6694 > this.anIntArray319[local14 + 1]) {
				this.anInt6694 = this.anIntArray319[local14 + 1];
			} else if (this.anInt6709 < this.anIntArray319[local14 + 1]) {
				this.anInt6709 = this.anIntArray319[local14 + 1];
			}
		}
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(BLclient!qp;)Z")
	public boolean method6003(@OriginalArg(1) Interface15 arg0) {
		@Pc(16) int local16;
		if (this.anInt6716 == -1) {
			if (this.anInt6708 == -1) {
				return true;
			}
			local16 = arg0.method7360(this.anInt6708);
		} else {
			local16 = arg0.method7361(this.anInt6716);
		}
		if (this.anInt6684 > local16 || local16 > this.anInt6693) {
			return false;
		}
		@Pc(68) int local68;
		if (this.anInt6710 == -1) {
			if (this.anInt6692 == -1) {
				return true;
			}
			local68 = arg0.method7360(this.anInt6692);
		} else {
			local68 = arg0.method7361(this.anInt6710);
		}
		return this.anInt6681 <= local68 && local68 <= this.anInt6689;
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(IZLclient!ha;)Lclient!mq;")
	public Class71 method6005(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class101 arg1) {
		@Pc(19) int local19 = arg0 ? this.anInt6702 : this.anInt6690;
		@Pc(26) int local26 = local19 | arg1.anInt9210 << 29;
		@Pc(35) Class71 local35 = (Class71) this.aClass5_2.aClass22_2.method462((long) local26);
		if (local35 != null) {
			return local35;
		} else if (this.aClass5_2.aClass124_1.method3627(local19)) {
			@Pc(55) Class67 local55 = Static676.method1693(this.aClass5_2.aClass124_1, local19, 0);
			if (local55 != null) {
				local35 = arg1.method8063(local55, true);
				this.aClass5_2.aClass22_2.method470((long) local26, local35);
			}
			return local35;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(BLclient!ha;)Lclient!mq;")
	public Class71 method6006(@OriginalArg(1) Class101 arg0) {
		@Pc(20) Class71 local20 = (Class71) this.aClass5_2.aClass22_2.method462((long) (this.anInt6707 | 0x20000 | arg0.anInt9210 << 29));
		if (local20 != null) {
			return local20;
		}
		this.aClass5_2.aClass124_1.method3627(this.anInt6707);
		@Pc(46) Class67 local46 = Static676.method1693(this.aClass5_2.aClass124_1, this.anInt6707, 0);
		if (local46 != null) {
			local20 = arg0.method8063(local46, true);
			this.aClass5_2.aClass22_2.method470((long) (arg0.anInt9210 << 29 | this.anInt6707 | 0x20000), local20);
		}
		return local20;
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(Lclient!ol;I)V")
	public void method6007(@OriginalArg(0) Class2_Sub8 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method5203();
			if (local5 == 0) {
				return;
			}
			this.method6009(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(ILjava/lang/String;I)Ljava/lang/String;")
	public String method6008(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1) {
		if (this.aClass335_21 == null) {
			return arg0;
		} else {
			@Pc(18) Class2_Sub19 local18 = (Class2_Sub19) this.aClass335_21.method8357((long) arg1);
			return local18 == null ? arg0 : local18.aString21;
		}
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(ILclient!ol;I)V")
	private void method6009(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub8 arg1) {
		if (arg0 == 1) {
			this.anInt6690 = arg1.method5211();
		} else if (arg0 == 2) {
			this.anInt6702 = arg1.method5211();
		} else if (arg0 == 3) {
			this.aString76 = arg1.method5178();
		} else if (arg0 == 4) {
			this.anInt6706 = arg1.method5161();
		} else if (arg0 == 5) {
			this.anInt6682 = arg1.method5161();
		} else if (arg0 == 6) {
			this.anInt6703 = arg1.method5203();
		} else {
			@Pc(50) int local50;
			if (arg0 == 7) {
				local50 = arg1.method5203();
				if ((local50 & 0x1) == 0) {
					this.aBoolean505 = false;
				}
				if ((local50 & 0x2) == 2) {
					this.aBoolean508 = true;
					return;
				}
			} else if (arg0 == 8) {
				this.aBoolean507 = arg1.method5203() == 1;
				return;
			} else if (arg0 == 9) {
				this.anInt6708 = arg1.method5211();
				if (this.anInt6708 == 65535) {
					this.anInt6708 = -1;
				}
				this.anInt6716 = arg1.method5211();
				if (this.anInt6716 == 65535) {
					this.anInt6716 = -1;
				}
				this.anInt6684 = arg1.method5172();
				this.anInt6693 = arg1.method5172();
				return;
			} else if (arg0 < 10 || arg0 > 14) {
				@Pc(160) int local160;
				@Pc(190) int local190;
				if (arg0 == 15) {
					local50 = arg1.method5203();
					this.anIntArray319 = new int[local50 * 2];
					for (local160 = 0; local160 < local50 * 2; local160++) {
						this.anIntArray319[local160] = arg1.method5174();
					}
					this.anInt6715 = arg1.method5172();
					@Pc(184) int local184 = arg1.method5203();
					this.anIntArray320 = new int[local184];
					for (local190 = 0; local190 < this.anIntArray320.length; local190++) {
						this.anIntArray320[local190] = arg1.method5172();
					}
					this.aByteArray64 = new byte[local50];
					for (@Pc(215) int local215 = 0; local215 < local50; local215++) {
						this.aByteArray64[local215] = arg1.method5175();
					}
					return;
				}
				if (arg0 == 16) {
					this.aBoolean506 = false;
					return;
				}
				if (arg0 == 17) {
					this.aString77 = arg1.method5178();
					return;
				}
				if (arg0 == 18) {
					this.anInt6707 = arg1.method5211();
					return;
				}
				if (arg0 != 19) {
					if (arg0 != 20) {
						if (arg0 == 21) {
							this.anInt6700 = arg1.method5172();
							return;
						}
						if (arg0 == 22) {
							this.anInt6687 = arg1.method5172();
							return;
						}
						if (arg0 == 23) {
							this.anInt6686 = arg1.method5203();
							this.anInt6704 = arg1.method5203();
							this.anInt6711 = arg1.method5203();
							return;
						}
						if (arg0 == 24) {
							this.anInt6713 = arg1.method5174();
							this.anInt6699 = arg1.method5174();
						} else if (arg0 == 249) {
							local50 = arg1.method5203();
							if (this.aClass335_21 == null) {
								local160 = Static432.method7064(local50);
								this.aClass335_21 = new Class335(local160);
							}
							for (local160 = 0; local160 < local50; local160++) {
								@Pc(341) boolean local341 = arg1.method5203() == 1;
								local190 = arg1.method5161();
								@Pc(356) Class2 local356;
								if (local341) {
									local356 = new Class2_Sub19(arg1.method5178());
								} else {
									local356 = new Class2_Sub14(arg1.method5172());
								}
								this.aClass335_21.method8356(local356, (long) local190);
							}
							return;
						}
						return;
					}
					this.anInt6692 = arg1.method5211();
					if (this.anInt6692 == 65535) {
						this.anInt6692 = -1;
					}
					this.anInt6710 = arg1.method5211();
					if (this.anInt6710 == 65535) {
						this.anInt6710 = -1;
					}
					this.anInt6681 = arg1.method5172();
					this.anInt6689 = arg1.method5172();
					return;
				}
				this.anInt6683 = arg1.method5211();
			} else {
				this.aStringArray35[arg0 - 10] = arg1.method5178();
				return;
			}
		}
	}
}
