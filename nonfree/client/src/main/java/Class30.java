import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!la")
public final class Class30 {

	@OriginalMember(owner = "client!la", name = "j", descriptor = "J")
	private long aLong49;

	@OriginalMember(owner = "client!la", name = "w", descriptor = "Lclient!na;")
	private Class35 aClass35_2;

	@OriginalMember(owner = "client!la", name = "R", descriptor = "Z")
	private boolean aBoolean92;

	@OriginalMember(owner = "client!la", name = "U", descriptor = "Lclient!u;")
	private Class2_Sub1_Sub15 aClass2_Sub1_Sub15_1;

	@OriginalMember(owner = "client!la", name = "V", descriptor = "Lclient!pd;")
	private Class2_Sub6 aClass2_Sub6_6;

	@OriginalMember(owner = "client!la", name = "y", descriptor = "I")
	private int anInt1811 = 0;

	@OriginalMember(owner = "client!la", name = "A", descriptor = "Lclient!qc;")
	private final Class50 aClass50_3 = new Class50(4096);

	@OriginalMember(owner = "client!la", name = "K", descriptor = "I")
	private int anInt1818 = 0;

	@OriginalMember(owner = "client!la", name = "L", descriptor = "Lclient!qc;")
	private final Class50 aClass50_4 = new Class50(32);

	@OriginalMember(owner = "client!la", name = "M", descriptor = "I")
	private int anInt1819 = 0;

	@OriginalMember(owner = "client!la", name = "N", descriptor = "Lclient!wc;")
	private final Class63 aClass63_2 = new Class63();

	@OriginalMember(owner = "client!la", name = "O", descriptor = "Lclient!qc;")
	private final Class50 aClass50_5 = new Class50(4096);

	@OriginalMember(owner = "client!la", name = "P", descriptor = "I")
	private int anInt1820 = 0;

	@OriginalMember(owner = "client!la", name = "Q", descriptor = "Lclient!qc;")
	private final Class50 aClass50_6 = new Class50(4096);

	@OriginalMember(owner = "client!la", name = "T", descriptor = "I")
	private int anInt1821 = 0;

	@OriginalMember(owner = "client!la", name = "S", descriptor = "Lclient!pd;")
	private final Class2_Sub6 aClass2_Sub6_5 = new Class2_Sub6(8);

	@OriginalMember(owner = "client!la", name = "W", descriptor = "I")
	private int anInt1822 = 0;

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(ZZLclient!na;)V")
	public void method1159(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class35 arg1) {
		if (this.aClass35_2 != null) {
			try {
				this.aClass35_2.method1349();
				this.aClass35_2 = null;
			} catch (@Pc(17) Exception local17) {
			}
		}
		this.aClass35_2 = arg1;
		this.method1164(arg0);
		this.anInt1822 = 0;
		this.aClass2_Sub6_6 = null;
		this.aClass2_Sub6_5.anInt952 = 0;
		this.aClass2_Sub1_Sub15_1 = null;
		while (true) {
			@Pc(53) Class2_Sub1_Sub15 local53 = (Class2_Sub1_Sub15) this.aClass50_4.method1458();
			if (local53 == null) {
				while (true) {
					local53 = (Class2_Sub1_Sub15) this.aClass50_6.method1458();
					if (local53 == null) {
						this.anInt1811 = 0;
						this.aLong49 = System.currentTimeMillis();
						return;
					}
					this.aClass63_2.method1749(local53);
					this.aClass50_5.method1461(local53, local53.aLong72);
					this.anInt1820++;
					this.anInt1821--;
				}
			}
			this.aClass50_3.method1461(local53, local53.aLong72);
			this.anInt1819--;
			this.anInt1818++;
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(I)Z")
	public boolean method1160() {
		@Pc(7) long local7 = System.currentTimeMillis();
		@Pc(14) int local14 = (int) (local7 - this.aLong49);
		this.aLong49 = local7;
		if (local14 > 200) {
			local14 = 200;
		}
		this.anInt1811 += local14;
		if (this.anInt1821 == 0 && this.anInt1819 == 0 && this.anInt1820 == 0 && this.anInt1818 == 0) {
			return true;
		} else if (this.aClass35_2 == null) {
			return false;
		} else {
			try {
				if (this.anInt1811 > 30000) {
					throw new IOException();
				}
				@Pc(69) Class2_Sub1_Sub15 local69;
				@Pc(74) Class2_Sub6 local74;
				while (this.anInt1819 < 20 && this.anInt1818 > 0) {
					local69 = (Class2_Sub1_Sub15) this.aClass50_3.method1458();
					local74 = new Class2_Sub6(4);
					local74.method637(1);
					local74.method637(local69.aClass11_Sub1_16.anInt523);
					local74.method648(local69.anInt2601);
					this.aClass35_2.method1347(4, local74.aByteArray11);
					this.aClass50_4.method1461(local69, local69.aLong72);
					this.anInt1818--;
					this.anInt1819++;
				}
				while (this.anInt1821 < 20 && this.anInt1820 > 0) {
					local69 = (Class2_Sub1_Sub15) this.aClass63_2.method1751();
					local74 = new Class2_Sub6(4);
					local74.method637(0);
					local74.method637(local69.aClass11_Sub1_16.anInt523);
					local74.method648(local69.anInt2601);
					this.aClass35_2.method1347(4, local74.aByteArray11);
					local69.method1702();
					this.aClass50_6.method1461(local69, local69.aLong72);
					this.anInt1821++;
					this.anInt1820--;
				}
				for (@Pc(197) int local197 = 0; local197 < 100; local197++) {
					@Pc(204) int local204 = this.aClass35_2.method1350();
					if (local204 < 0) {
						throw new IOException();
					}
					if (local204 == 0) {
						break;
					}
					this.anInt1811 = 0;
					@Pc(223) byte local223 = 0;
					if (this.aClass2_Sub1_Sub15_1 == null) {
						local223 = 8;
					} else if (this.anInt1822 == 0) {
						local223 = 1;
					}
					@Pc(256) int local256;
					@Pc(261) int local261;
					if (local223 <= 0) {
						local256 = this.aClass2_Sub6_6.aByteArray11.length - (this.aClass2_Sub1_Sub15_1.anInt2601 == 0 ? 0 : 2);
						local261 = 512 - this.anInt1822;
						if (local256 - this.aClass2_Sub6_6.anInt952 < local261) {
							local261 = local256 - this.aClass2_Sub6_6.anInt952;
						}
						if (local261 > local204) {
							local261 = local204;
						}
						this.aClass35_2.method1352(local261, this.aClass2_Sub6_6.anInt952, this.aClass2_Sub6_6.aByteArray11);
						this.aClass2_Sub6_6.anInt952 += local261;
						this.anInt1822 += local261;
						if (local256 == this.aClass2_Sub6_6.anInt952) {
							this.aClass2_Sub1_Sub15_1.aClass11_Sub1_16.method363(this.aBoolean92, this.aClass2_Sub6_6.aByteArray11, this.aClass2_Sub1_Sub15_1.anInt2601);
							this.aClass2_Sub1_Sub15_1.method1695();
							this.aClass2_Sub1_Sub15_1 = null;
							this.anInt1822 = 0;
							if (this.aBoolean92) {
								this.anInt1819--;
							} else {
								this.anInt1821--;
							}
							this.aClass2_Sub6_6 = null;
						} else {
							if (this.anInt1822 != 512) {
								break;
							}
							this.anInt1822 = 0;
						}
					} else {
						local256 = local223 - this.aClass2_Sub6_5.anInt952;
						if (local256 > local204) {
							local256 = local204;
						}
						this.aClass35_2.method1352(local256, this.aClass2_Sub6_5.anInt952, this.aClass2_Sub6_5.aByteArray11);
						this.aClass2_Sub6_5.anInt952 += local256;
						if (this.aClass2_Sub6_5.anInt952 < local223) {
							break;
						}
						if (this.aClass2_Sub1_Sub15_1 == null) {
							this.aClass2_Sub6_5.anInt952 = 0;
							local261 = this.aClass2_Sub6_5.method665();
							@Pc(439) int local439 = this.aClass2_Sub6_5.method627();
							@Pc(444) int local444 = this.aClass2_Sub6_5.method665();
							@Pc(449) int local449 = this.aClass2_Sub6_5.method629();
							@Pc(456) long local456 = (long) (local439 + (local261 << 24));
							@Pc(463) Class2_Sub1_Sub15 local463 = (Class2_Sub1_Sub15) this.aClass50_4.method1460(local456);
							this.aBoolean92 = true;
							if (local463 == null) {
								local463 = (Class2_Sub1_Sub15) this.aClass50_6.method1460(local456);
								this.aBoolean92 = false;
							}
							if (local463 == null) {
								throw new IOException();
							}
							this.aClass2_Sub1_Sub15_1 = local463;
							@Pc(498) int local498 = local444 == 0 ? 5 : 9;
							this.aClass2_Sub6_6 = new Class2_Sub6(local498 + local449 + (this.aClass2_Sub1_Sub15_1.anInt2601 == 0 ? 0 : 2));
							this.aClass2_Sub6_6.method637(local444);
							this.aClass2_Sub6_6.method666(local449);
							if (this.aClass2_Sub1_Sub15_1.anInt2601 != 0) {
								this.aClass2_Sub6_6.anInt952 = local498 + local449;
								this.aClass2_Sub6_6.method648(this.aClass2_Sub1_Sub15_1.aClass11_Sub1_16.anIntArray70[this.aClass2_Sub1_Sub15_1.anInt2601 - 1]);
								this.aClass2_Sub6_6.anInt952 = 5;
							}
							this.anInt1822 = 8;
							this.aClass2_Sub6_5.anInt952 = 0;
						} else if (this.anInt1822 == 0) {
							if (this.aClass2_Sub6_5.aByteArray11[0] == -1) {
								this.anInt1822 = 1;
								this.aClass2_Sub6_5.anInt952 = 0;
							} else {
								this.aClass2_Sub1_Sub15_1 = null;
							}
						}
					}
				}
				return true;
			} catch (@Pc(599) IOException local599) {
				try {
					this.aClass35_2.method1349();
				} catch (@Pc(605) Exception local605) {
				}
				this.aClass35_2 = null;
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(B)V")
	public void method1161() {
		if (this.aClass35_2 != null) {
			this.aClass35_2.method1349();
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(ZZB)I")
	public int method1163() {
		return this.anInt1818 + this.anInt1819;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(BZ)V")
	public void method1164(@OriginalArg(1) boolean arg0) {
		if (this.aClass35_2 == null) {
			return;
		}
		try {
			@Pc(12) Class2_Sub6 local12 = new Class2_Sub6(4);
			local12.method637(arg0 ? 2 : 3);
			local12.method677(0);
			this.aClass35_2.method1347(4, local12.aByteArray11);
		} catch (@Pc(42) IOException local42) {
			try {
				this.aClass35_2.method1349();
			} catch (@Pc(48) Exception local48) {
			}
			this.aClass35_2 = null;
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IILclient!cc;)V")
	public void method1166(@OriginalArg(0) int arg0, @OriginalArg(2) Class11_Sub1 arg1) {
		@Pc(16) long local16 = (long) (arg0 + (arg1.anInt523 << 24));
		@Pc(23) Class2_Sub1_Sub15 local23 = (Class2_Sub1_Sub15) this.aClass50_5.method1460(local16);
		if (local23 != null) {
			this.aClass63_2.method1749(local23);
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IILclient!cc;Z)V")
	public void method1169(@OriginalArg(1) int arg0, @OriginalArg(2) Class11_Sub1 arg1, @OriginalArg(3) boolean arg2) {
		@Pc(11) long local11 = (long) ((arg1.anInt523 << 24) + arg0);
		@Pc(18) Class2_Sub1_Sub15 local18 = (Class2_Sub1_Sub15) this.aClass50_3.method1460(local11);
		if (local18 != null) {
			return;
		}
		local18 = (Class2_Sub1_Sub15) this.aClass50_4.method1460(local11);
		if (local18 != null) {
			return;
		}
		local18 = (Class2_Sub1_Sub15) this.aClass50_5.method1460(local11);
		if (local18 == null) {
			if (!arg2) {
				local18 = (Class2_Sub1_Sub15) this.aClass50_6.method1460(local11);
				if (local18 != null) {
					return;
				}
			}
			local18 = new Class2_Sub1_Sub15();
			local18.anInt2601 = arg0;
			local18.aClass11_Sub1_16 = arg1;
			if (arg2) {
				this.aClass50_3.method1461(local18, local11);
				this.anInt1818++;
			} else {
				this.aClass63_2.method1748(local18);
				this.aClass50_5.method1461(local18, local11);
				this.anInt1820++;
			}
		} else if (arg2) {
			local18.method1702();
			this.aClass50_3.method1461(local18, local11);
			this.anInt1820--;
			this.anInt1818++;
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(ILclient!cc;I)I")
	public int method1170(@OriginalArg(0) int arg0, @OriginalArg(1) Class11_Sub1 arg1) {
		return this.aClass2_Sub1_Sub15_1 != null && arg1 == this.aClass2_Sub1_Sub15_1.aClass11_Sub1_16 && arg0 + 1 == this.aClass2_Sub1_Sub15_1.anInt2601 ? this.aClass2_Sub6_6.anInt952 * 99 / (this.aClass2_Sub6_6.aByteArray11.length - (this.aClass2_Sub1_Sub15_1.anInt2601 == 0 ? 0 : 2)) + 1 : 0;
	}
}
