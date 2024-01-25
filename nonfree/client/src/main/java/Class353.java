import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!up")
public final class Class353 {

	@OriginalMember(owner = "client!up", name = "a", descriptor = "[I")
	public int[] anIntArray691;

	@OriginalMember(owner = "client!up", name = "b", descriptor = "I")
	public int anInt9786;

	@OriginalMember(owner = "client!up", name = "e", descriptor = "I")
	private int anInt9788;

	@OriginalMember(owner = "client!up", name = "i", descriptor = "I")
	private int anInt9791;

	@OriginalMember(owner = "client!up", name = "l", descriptor = "[I")
	public int[] anIntArray692;

	@OriginalMember(owner = "client!up", name = "t", descriptor = "I")
	public int anInt9800;

	@OriginalMember(owner = "client!up", name = "w", descriptor = "[B")
	public byte[] aByteArray101;

	@OriginalMember(owner = "client!up", name = "z", descriptor = "I")
	private int anInt9805;

	@OriginalMember(owner = "client!up", name = "B", descriptor = "I")
	public int anInt9807;

	@OriginalMember(owner = "client!up", name = "D", descriptor = "I")
	public int anInt9809;

	@OriginalMember(owner = "client!up", name = "F", descriptor = "I")
	public int anInt9811;

	@OriginalMember(owner = "client!up", name = "K", descriptor = "Ljava/lang/String;")
	public String aString100;

	@OriginalMember(owner = "client!up", name = "L", descriptor = "Lclient!tba;")
	private Class323 aClass323_40;

	@OriginalMember(owner = "client!up", name = "N", descriptor = "I")
	public int anInt9814;

	@OriginalMember(owner = "client!up", name = "R", descriptor = "Lclient!tp;")
	public Class336 aClass336_6;

	@OriginalMember(owner = "client!up", name = "W", descriptor = "I")
	public int anInt9822;

	@OriginalMember(owner = "client!up", name = "X", descriptor = "I")
	private int anInt9823;

	@OriginalMember(owner = "client!up", name = "Z", descriptor = "Ljava/lang/String;")
	public String aString101;

	@OriginalMember(owner = "client!up", name = "g", descriptor = "Z")
	public boolean aBoolean709 = true;

	@OriginalMember(owner = "client!up", name = "k", descriptor = "I")
	public int anInt9793 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!up", name = "h", descriptor = "I")
	public int anInt9790 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!up", name = "x", descriptor = "I")
	private int anInt9803 = -1;

	@OriginalMember(owner = "client!up", name = "s", descriptor = "I")
	public int anInt9799 = -1;

	@OriginalMember(owner = "client!up", name = "E", descriptor = "I")
	private int anInt9810 = -1;

	@OriginalMember(owner = "client!up", name = "o", descriptor = "Z")
	public boolean aBoolean710 = true;

	@OriginalMember(owner = "client!up", name = "C", descriptor = "I")
	public int anInt9808 = -1;

	@OriginalMember(owner = "client!up", name = "M", descriptor = "[Ljava/lang/String;")
	public final String[] aStringArray52 = new String[5];

	@OriginalMember(owner = "client!up", name = "m", descriptor = "I")
	private int anInt9794 = -1;

	@OriginalMember(owner = "client!up", name = "n", descriptor = "I")
	public int anInt9795 = 0;

	@OriginalMember(owner = "client!up", name = "I", descriptor = "I")
	public int anInt9813 = -1;

	@OriginalMember(owner = "client!up", name = "J", descriptor = "Z")
	public boolean aBoolean711 = true;

	@OriginalMember(owner = "client!up", name = "d", descriptor = "Z")
	public boolean aBoolean708 = false;

	@OriginalMember(owner = "client!up", name = "q", descriptor = "I")
	public int anInt9797 = -1;

	@OriginalMember(owner = "client!up", name = "Q", descriptor = "I")
	private int anInt9817 = -1;

	@OriginalMember(owner = "client!up", name = "U", descriptor = "I")
	public int anInt9820 = -1;

	@OriginalMember(owner = "client!up", name = "Y", descriptor = "I")
	public int anInt9824 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!up", name = "S", descriptor = "I")
	public int anInt9818 = -1;

	@OriginalMember(owner = "client!up", name = "A", descriptor = "I")
	public int anInt9806 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!up", name = "T", descriptor = "I")
	public int anInt9819 = -1;

	@OriginalMember(owner = "client!up", name = "ab", descriptor = "I")
	private int anInt9825 = -1;

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(B)V")
	public void method8335() {
		if (this.anIntArray691 == null) {
			return;
		}
		for (@Pc(4) int local4 = 0; local4 < this.anIntArray691.length; local4 += 2) {
			if (this.anInt9790 > this.anIntArray691[local4]) {
				this.anInt9790 = this.anIntArray691[local4];
			} else if (this.anIntArray691[local4] > this.anInt9824) {
				this.anInt9824 = this.anIntArray691[local4];
			}
			if (this.anInt9806 > this.anIntArray691[local4 + 1]) {
				this.anInt9806 = this.anIntArray691[local4 + 1];
			} else if (this.anIntArray691[local4 + 1] > this.anInt9793) {
				this.anInt9793 = this.anIntArray691[local4 + 1];
			}
		}
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(ZLclient!ha;I)Lclient!iea;")
	public Class31 method8338(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class13 arg1) {
		@Pc(11) int local11 = arg0 ? this.anInt9819 : this.anInt9818;
		@Pc(18) int local18 = local11 | arg1.anInt9527 << 29;
		@Pc(27) Class31 local27 = (Class31) this.aClass336_6.aClass69_59.method1919((long) local18);
		if (local27 != null) {
			return local27;
		} else if (this.aClass336_6.aClass238_254.method5568(local11)) {
			@Pc(47) Class139 local47 = Static654.method3455(this.aClass336_6.aClass238_254, local11, 0);
			if (local47 != null) {
				local27 = arg1.method8141(local47, true);
				this.aClass336_6.aClass69_59.method1917((long) local18, local27);
			}
			return local27;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(ILclient!sl;)V")
	public void method8339(@OriginalArg(1) Class2_Sub17 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method2859();
			if (local3 == 0) {
				return;
			}
			this.method8345(local3, arg0);
		}
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(Lclient!eia;Z)Z")
	public boolean method8340(@OriginalArg(0) Interface5 arg0) {
		@Pc(18) int local18;
		if (this.anInt9825 == -1) {
			if (this.anInt9817 == -1) {
				return true;
			}
			local18 = arg0.method6472(this.anInt9817);
		} else {
			local18 = arg0.method6473(this.anInt9825);
		}
		if (this.anInt9788 > local18 || local18 > this.anInt9791) {
			return false;
		}
		@Pc(64) int local64;
		if (this.anInt9810 == -1) {
			if (this.anInt9794 == -1) {
				return true;
			}
			local64 = arg0.method6472(this.anInt9794);
		} else {
			local64 = arg0.method6473(this.anInt9810);
		}
		return this.anInt9805 <= local64 && local64 <= this.anInt9823;
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(IILjava/lang/String;)Ljava/lang/String;")
	public String method8342(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		if (this.aClass323_40 == null) {
			return arg1;
		} else {
			@Pc(25) Class2_Sub33 local25 = (Class2_Sub33) this.aClass323_40.method7484((long) arg0);
			return local25 == null ? arg1 : local25.aString60;
		}
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(Lclient!ha;B)Lclient!iea;")
	public Class31 method8343(@OriginalArg(0) Class13 arg0) {
		@Pc(20) Class31 local20 = (Class31) this.aClass336_6.aClass69_59.method1919((long) (this.anInt9803 | 0x20000 | arg0.anInt9527 << 29));
		if (local20 != null) {
			return local20;
		}
		this.aClass336_6.aClass238_254.method5568(this.anInt9803);
		@Pc(48) Class139 local48 = Static654.method3455(this.aClass336_6.aClass238_254, this.anInt9803, 0);
		if (local48 != null) {
			local20 = arg0.method8141(local48, true);
			this.aClass336_6.aClass69_59.method1917((long) (this.anInt9803 | 0x20000 | arg0.anInt9527 << 29), local20);
		}
		return local20;
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(IIB)I")
	public int method8344(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass323_40 == null) {
			return arg0;
		} else {
			@Pc(21) Class2_Sub41 local21 = (Class2_Sub41) this.aClass323_40.method7484((long) arg1);
			return local21 == null ? arg0 : local21.anInt9197;
		}
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(IBLclient!sl;)V")
	private void method8345(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub17 arg1) {
		if (arg0 == 1) {
			this.anInt9818 = arg1.method2825();
		} else if (arg0 == 2) {
			this.anInt9819 = arg1.method2825();
		} else if (arg0 == 3) {
			this.aString100 = arg1.method2833();
		} else if (arg0 == 4) {
			this.anInt9822 = arg1.method2835();
		} else if (arg0 == 5) {
			this.anInt9820 = arg1.method2835();
		} else if (arg0 == 6) {
			this.anInt9795 = arg1.method2859();
		} else {
			@Pc(58) int local58;
			if (arg0 == 7) {
				local58 = arg1.method2859();
				if ((local58 & 0x1) == 0) {
					this.aBoolean710 = false;
				}
				if ((local58 & 0x2) == 2) {
					this.aBoolean708 = true;
				}
			} else if (arg0 == 8) {
				this.aBoolean711 = arg1.method2859() == 1;
			} else if (arg0 == 9) {
				this.anInt9817 = arg1.method2825();
				if (this.anInt9817 == 65535) {
					this.anInt9817 = -1;
				}
				this.anInt9825 = arg1.method2825();
				if (this.anInt9825 == 65535) {
					this.anInt9825 = -1;
				}
				this.anInt9788 = arg1.method2881();
				this.anInt9791 = arg1.method2881();
			} else if (arg0 >= 10 && arg0 <= 14) {
				this.aStringArray52[arg0 - 10] = arg1.method2833();
			} else {
				@Pc(157) int local157;
				@Pc(190) int local190;
				if (arg0 == 15) {
					local58 = arg1.method2859();
					this.anIntArray691 = new int[local58 * 2];
					for (local157 = 0; local157 < local58 * 2; local157++) {
						this.anIntArray691[local157] = arg1.method2836();
					}
					this.anInt9800 = arg1.method2881();
					@Pc(184) int local184 = arg1.method2859();
					this.anIntArray692 = new int[local184];
					for (local190 = 0; local190 < this.anIntArray692.length; local190++) {
						this.anIntArray692[local190] = arg1.method2881();
					}
					this.aByteArray101 = new byte[local58];
					for (@Pc(214) int local214 = 0; local214 < local58; local214++) {
						this.aByteArray101[local214] = arg1.method2860();
					}
				} else if (arg0 == 16) {
					this.aBoolean709 = false;
				} else if (arg0 == 17) {
					this.aString101 = arg1.method2833();
				} else if (arg0 == 18) {
					this.anInt9803 = arg1.method2825();
				} else if (arg0 == 19) {
					this.anInt9797 = arg1.method2825();
				} else if (arg0 == 20) {
					this.anInt9794 = arg1.method2825();
					if (this.anInt9794 == 65535) {
						this.anInt9794 = -1;
					}
					this.anInt9810 = arg1.method2825();
					if (this.anInt9810 == 65535) {
						this.anInt9810 = -1;
					}
					this.anInt9805 = arg1.method2881();
					this.anInt9823 = arg1.method2881();
				} else if (arg0 == 21) {
					this.anInt9814 = arg1.method2881();
				} else if (arg0 == 22) {
					this.anInt9809 = arg1.method2881();
				} else if (arg0 == 23) {
					this.anInt9799 = arg1.method2859();
					this.anInt9808 = arg1.method2859();
					this.anInt9813 = arg1.method2859();
				} else if (arg0 == 24) {
					this.anInt9807 = arg1.method2836();
					this.anInt9786 = arg1.method2836();
				} else if (arg0 == 249) {
					local58 = arg1.method2859();
					if (this.aClass323_40 == null) {
						local157 = Static613.method8565(local58);
						this.aClass323_40 = new Class323(local157);
					}
					for (local157 = 0; local157 < local58; local157++) {
						@Pc(319) boolean local319 = arg1.method2859() == 1;
						local190 = arg1.method2835();
						@Pc(332) Class2 local332;
						if (local319) {
							local332 = new Class2_Sub33(arg1.method2833());
						} else {
							local332 = new Class2_Sub41(arg1.method2881());
						}
						this.aClass323_40.method7477(local332, (long) local190);
					}
				}
			}
		}
	}
}
