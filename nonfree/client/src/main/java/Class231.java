import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tr")
public final class Class231 {

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "Ljava/lang/String;")
	public String aString53;

	@OriginalMember(owner = "client!tr", name = "b", descriptor = "Lclient!tj;")
	public Class224 aClass224_4;

	@OriginalMember(owner = "client!tr", name = "e", descriptor = "I")
	public int anInt6829;

	@OriginalMember(owner = "client!tr", name = "f", descriptor = "I")
	private int anInt6830;

	@OriginalMember(owner = "client!tr", name = "j", descriptor = "I")
	public int anInt6834;

	@OriginalMember(owner = "client!tr", name = "k", descriptor = "I")
	private int anInt6835;

	@OriginalMember(owner = "client!tr", name = "o", descriptor = "I")
	private int anInt6839;

	@OriginalMember(owner = "client!tr", name = "p", descriptor = "I")
	public int anInt6840;

	@OriginalMember(owner = "client!tr", name = "q", descriptor = "Ljava/lang/String;")
	public String aString54;

	@OriginalMember(owner = "client!tr", name = "s", descriptor = "I")
	public int anInt6842;

	@OriginalMember(owner = "client!tr", name = "B", descriptor = "I")
	private int anInt6850;

	@OriginalMember(owner = "client!tr", name = "C", descriptor = "I")
	public int anInt6851;

	@OriginalMember(owner = "client!tr", name = "E", descriptor = "I")
	public int anInt6853;

	@OriginalMember(owner = "client!tr", name = "J", descriptor = "Lclient!bj;")
	private Class27 aClass27_37;

	@OriginalMember(owner = "client!tr", name = "L", descriptor = "[I")
	public int[] anIntArray568;

	@OriginalMember(owner = "client!tr", name = "c", descriptor = "Z")
	public boolean aBoolean443 = true;

	@OriginalMember(owner = "client!tr", name = "d", descriptor = "I")
	public int anInt6828 = -1;

	@OriginalMember(owner = "client!tr", name = "h", descriptor = "I")
	private int anInt6832 = -1;

	@OriginalMember(owner = "client!tr", name = "m", descriptor = "I")
	private int anInt6837 = -1;

	@OriginalMember(owner = "client!tr", name = "n", descriptor = "I")
	public int anInt6838 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!tr", name = "r", descriptor = "I")
	public int anInt6841 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!tr", name = "g", descriptor = "I")
	private int anInt6831 = -1;

	@OriginalMember(owner = "client!tr", name = "A", descriptor = "Z")
	public boolean aBoolean444 = true;

	@OriginalMember(owner = "client!tr", name = "G", descriptor = "I")
	public int anInt6855 = -1;

	@OriginalMember(owner = "client!tr", name = "K", descriptor = "I")
	public int anInt6858 = -1;

	@OriginalMember(owner = "client!tr", name = "x", descriptor = "I")
	public int anInt6847 = -1;

	@OriginalMember(owner = "client!tr", name = "w", descriptor = "I")
	public int anInt6846 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!tr", name = "l", descriptor = "I")
	private int anInt6836 = -1;

	@OriginalMember(owner = "client!tr", name = "y", descriptor = "I")
	public int anInt6848 = 0;

	@OriginalMember(owner = "client!tr", name = "N", descriptor = "Z")
	public boolean aBoolean445 = false;

	@OriginalMember(owner = "client!tr", name = "i", descriptor = "I")
	private int anInt6833 = -1;

	@OriginalMember(owner = "client!tr", name = "P", descriptor = "Z")
	public boolean aBoolean446 = true;

	@OriginalMember(owner = "client!tr", name = "R", descriptor = "[Ljava/lang/String;")
	public final String[] aStringArray52 = new String[5];

	@OriginalMember(owner = "client!tr", name = "O", descriptor = "I")
	public int anInt6859 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(Lclient!lh;I)V")
	public void method5356(@OriginalArg(0) Class1_Sub1 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method4130();
			if (local5 == 0) {
				return;
			}
			this.method5359(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(III)I")
	public int method5357(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass27_37 == null) {
			return arg0;
		} else {
			@Pc(21) Class1_Sub13 local21 = (Class1_Sub13) this.aClass27_37.method553((long) arg1);
			return local21 == null ? arg0 : local21.anInt2277;
		}
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(ILclient!vd;)Z")
	public boolean method5358(@OriginalArg(1) Interface12 arg0) {
		@Pc(20) int local20;
		if (this.anInt6836 == -1) {
			if (this.anInt6837 == -1) {
				return true;
			}
			local20 = arg0.method1571(this.anInt6837);
		} else {
			local20 = arg0.method1570(this.anInt6836);
		}
		if (this.anInt6830 > local20 || local20 > this.anInt6850) {
			return false;
		}
		@Pc(60) int local60;
		if (this.anInt6832 == -1) {
			if (this.anInt6831 == -1) {
				return true;
			}
			local60 = arg0.method1571(this.anInt6831);
		} else {
			local60 = arg0.method1570(this.anInt6832);
		}
		return local60 >= this.anInt6835 && local60 <= this.anInt6839;
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(Lclient!lh;II)V")
	private void method5359(@OriginalArg(0) Class1_Sub1 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt6847 = arg0.method4093();
		} else if (arg1 == 2) {
			this.anInt6828 = arg0.method4093();
		} else if (arg1 == 3) {
			this.aString54 = arg0.method4137();
		} else if (arg1 == 4) {
			this.anInt6853 = arg0.method4142();
		} else if (arg1 == 5) {
			this.anInt6855 = arg0.method4142();
		} else if (arg1 == 6) {
			this.anInt6848 = arg0.method4130();
			return;
		} else {
			@Pc(190) int local190;
			if (arg1 != 7) {
				if (arg1 == 8) {
					this.aBoolean444 = arg0.method4130() == 1;
					return;
				}
				if (arg1 == 9) {
					this.anInt6837 = arg0.method4093();
					if (this.anInt6837 == 65535) {
						this.anInt6837 = -1;
					}
					this.anInt6836 = arg0.method4093();
					if (this.anInt6836 == 65535) {
						this.anInt6836 = -1;
					}
					this.anInt6830 = arg0.method4087();
					this.anInt6850 = arg0.method4087();
					return;
				}
				if (arg1 >= 10 && arg1 <= 14) {
					this.aStringArray52[arg1 - 10] = arg0.method4137();
					return;
				}
				@Pc(197) int local197;
				if (arg1 != 15) {
					if (arg1 == 16) {
						this.aBoolean446 = false;
						return;
					}
					if (arg1 == 17) {
						this.aString53 = arg0.method4137();
					} else if (arg1 == 18) {
						this.anInt6833 = arg0.method4093();
						return;
					} else if (arg1 == 19) {
						this.anInt6858 = arg0.method4093();
						return;
					} else if (arg1 == 20) {
						this.anInt6831 = arg0.method4093();
						if (this.anInt6831 == 65535) {
							this.anInt6831 = -1;
						}
						this.anInt6832 = arg0.method4093();
						if (this.anInt6832 == 65535) {
							this.anInt6832 = -1;
						}
						this.anInt6835 = arg0.method4087();
						this.anInt6839 = arg0.method4087();
						return;
					} else if (arg1 == 21) {
						this.anInt6834 = arg0.method4087();
						return;
					} else if (arg1 == 22) {
						this.anInt6829 = arg0.method4087();
						return;
					} else if (arg1 == 249) {
						local190 = arg0.method4130();
						if (this.aClass27_37 == null) {
							local197 = Static100.method1552(local190);
							this.aClass27_37 = new Class27(local197);
						}
						for (local197 = 0; local197 < local190; local197++) {
							@Pc(218) boolean local218 = arg0.method4130() == 1;
							@Pc(222) int local222 = arg0.method4142();
							@Pc(231) Class1 local231;
							if (local218) {
								local231 = new Class1_Sub35(arg0.method4137());
							} else {
								local231 = new Class1_Sub13(arg0.method4087());
							}
							this.aClass27_37.method564((long) local222, local231);
						}
						return;
					}
					return;
				}
				local190 = arg0.method4130();
				this.anIntArray568 = new int[local190 * 2];
				for (local197 = 0; local197 < local190 * 2; local197++) {
					this.anIntArray568[local197] = arg0.method4100();
				}
				this.anInt6851 = arg0.method4087();
				this.anInt6842 = arg0.method4087();
				return;
			}
			local190 = arg0.method4130();
			if ((local190 & 0x2) == 2) {
				this.aBoolean445 = true;
			}
			if ((local190 & 0x1) == 0) {
				this.aBoolean443 = false;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(ILclient!qa;)Lclient!f;")
	public Class80 method5360(@OriginalArg(1) Class109 arg0) {
		@Pc(20) Class80 local20 = (Class80) this.aClass224_4.aClass83_55.method1658((long) (arg0.anInt5850 << 29 | 0x20000 | this.anInt6833));
		if (local20 != null) {
			return local20;
		}
		this.aClass224_4.aClass250_77.method5668(this.anInt6833);
		@Pc(47) Class159 local47 = Static459.method3755(this.aClass224_4.aClass250_77, this.anInt6833, 0);
		if (local47 != null) {
			local20 = arg0.method4684(local47);
			this.aClass224_4.aClass83_55.method1675((long) (this.anInt6833 | 0x20000 | arg0.anInt5850 << 29), local20);
		}
		return local20;
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(Ljava/lang/String;ZI)Ljava/lang/String;")
	public String method5361(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1) {
		if (this.aClass27_37 == null) {
			return arg0;
		} else {
			@Pc(21) Class1_Sub35 local21 = (Class1_Sub35) this.aClass27_37.method553((long) arg1);
			return local21 == null ? arg0 : local21.aString41;
		}
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(I)V")
	public void method5363() {
		if (this.anIntArray568 == null) {
			return;
		}
		for (@Pc(14) int local14 = 0; local14 < this.anIntArray568.length; local14 += 2) {
			if (this.anIntArray568[local14] < this.anInt6838) {
				this.anInt6838 = this.anIntArray568[local14];
			} else if (this.anInt6846 < this.anIntArray568[local14]) {
				this.anInt6846 = this.anIntArray568[local14];
			}
			if (this.anIntArray568[local14 + 1] < this.anInt6841) {
				this.anInt6841 = this.anIntArray568[local14 + 1];
			} else if (this.anInt6859 < this.anIntArray568[local14 + 1]) {
				this.anInt6859 = this.anIntArray568[local14 + 1];
			}
		}
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(ZBLclient!qa;)Lclient!f;")
	public Class80 method5364(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class109 arg1) {
		@Pc(19) int local19 = arg0 ? this.anInt6828 : this.anInt6847;
		@Pc(26) int local26 = arg1.anInt5850 << 29 | local19;
		@Pc(35) Class80 local35 = (Class80) this.aClass224_4.aClass83_55.method1658((long) local26);
		if (local35 != null) {
			return local35;
		} else if (this.aClass224_4.aClass250_77.method5668(local19)) {
			@Pc(55) Class159 local55 = Static459.method3755(this.aClass224_4.aClass250_77, local19, 0);
			if (local55 != null) {
				local35 = arg1.method4684(local55);
				this.aClass224_4.aClass83_55.method1675((long) local26, local35);
			}
			return local35;
		} else {
			return null;
		}
	}
}
