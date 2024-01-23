import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!te")
public final class Class164 {

	@OriginalMember(owner = "client!te", name = "B", descriptor = "I")
	private int anInt4890;

	@OriginalMember(owner = "client!te", name = "D", descriptor = "J")
	private long aLong188;

	@OriginalMember(owner = "client!te", name = "E", descriptor = "Lclient!fa;")
	private Class49 aClass49_3;

	@OriginalMember(owner = "client!te", name = "J", descriptor = "Lclient!nd;")
	private Class1_Sub5_Sub3_Sub1 aClass1_Sub5_Sub3_Sub1_2;

	@OriginalMember(owner = "client!te", name = "n", descriptor = "Lclient!wg;")
	private Class189 aClass189_7 = new Class189();

	@OriginalMember(owner = "client!te", name = "t", descriptor = "Lclient!wg;")
	private Class189 aClass189_8 = new Class189();

	@OriginalMember(owner = "client!te", name = "x", descriptor = "Lclient!wg;")
	private Class189 aClass189_9 = new Class189();

	@OriginalMember(owner = "client!te", name = "A", descriptor = "Lclient!wg;")
	private Class189 aClass189_10 = new Class189();

	@OriginalMember(owner = "client!te", name = "C", descriptor = "Lclient!fh;")
	private Class1_Sub13 aClass1_Sub13_8 = new Class1_Sub13(4);

	@OriginalMember(owner = "client!te", name = "F", descriptor = "B")
	private byte aByte18 = 0;

	@OriginalMember(owner = "client!te", name = "H", descriptor = "I")
	public volatile int anInt4892 = 0;

	@OriginalMember(owner = "client!te", name = "G", descriptor = "I")
	public volatile int anInt4891 = 0;

	@OriginalMember(owner = "client!te", name = "I", descriptor = "Lclient!fh;")
	private Class1_Sub13 aClass1_Sub13_9 = new Class1_Sub13(8);

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(ZB)V")
	public void method4070(@OriginalArg(0) boolean arg0) {
		if (this.aClass49_3 == null) {
			return;
		}
		try {
			this.aClass1_Sub13_8.anInt2018 = 0;
			this.aClass1_Sub13_8.method1822(arg0 ? 2 : 3);
			this.aClass1_Sub13_8.method1880(0);
			this.aClass49_3.method1302(this.aClass1_Sub13_8.aByteArray63, 4);
		} catch (@Pc(37) IOException local37) {
			try {
				this.aClass49_3.method1307();
			} catch (@Pc(43) Exception local43) {
			}
			this.anInt4891 = -2;
			this.anInt4892++;
			this.aClass49_3 = null;
		}
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(I)V")
	public void method4071() {
		if (this.aClass49_3 != null) {
			this.aClass49_3.method1305();
		}
	}

	@OriginalMember(owner = "client!te", name = "b", descriptor = "(I)V")
	public void method4072() {
		try {
			this.aClass49_3.method1307();
		} catch (@Pc(5) Exception local5) {
		}
		this.anInt4892++;
		this.aClass49_3 = null;
		this.anInt4891 = -1;
		this.aByte18 = (byte) (Math.random() * 255.0D + 1.0D);
	}

	@OriginalMember(owner = "client!te", name = "c", descriptor = "(I)V")
	public void method4073() {
		if (this.aClass49_3 == null) {
			return;
		}
		try {
			this.aClass1_Sub13_8.anInt2018 = 0;
			this.aClass1_Sub13_8.method1822(7);
			this.aClass1_Sub13_8.method1880(0);
			this.aClass49_3.method1302(this.aClass1_Sub13_8.aByteArray63, 4);
		} catch (@Pc(33) IOException local33) {
			try {
				this.aClass49_3.method1307();
			} catch (@Pc(39) Exception local39) {
			}
			this.aClass49_3 = null;
			this.anInt4892++;
			this.anInt4891 = -2;
		}
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(BIIBZ)Lclient!nd;")
	public Class1_Sub5_Sub3_Sub1 method4074(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte arg2, @OriginalArg(4) boolean arg3) {
		@Pc(16) long local16 = (long) ((arg1 << 16) + arg0);
		@Pc(20) Class1_Sub5_Sub3_Sub1 local20 = new Class1_Sub5_Sub3_Sub1();
		local20.aByte11 = arg2;
		local20.aBoolean462 = arg3;
		local20.aLong211 = local16;
		if (arg3) {
			if (this.method4079() >= 20) {
				throw new RuntimeException();
			}
			this.aClass189_7.method4603(local20);
		} else if (this.method4085() < 20) {
			this.aClass189_9.method4603(local20);
		} else {
			throw new RuntimeException();
		}
		return local20;
	}

	@OriginalMember(owner = "client!te", name = "d", descriptor = "(I)Z")
	public boolean method4075() {
		if (this.aClass49_3 != null) {
			@Pc(12) long local12 = Static244.method3859();
			@Pc(18) int local18 = (int) (local12 - this.aLong188);
			this.aLong188 = local12;
			if (local18 > 200) {
				local18 = 200;
			}
			this.anInt4890 += local18;
			if (this.anInt4890 > 30000) {
				try {
					this.aClass49_3.method1307();
				} catch (@Pc(46) Exception local46) {
				}
				this.aClass49_3 = null;
			}
		}
		if (this.aClass49_3 == null) {
			return this.method4079() == 0 && this.method4085() == 0;
		}
		try {
			this.aClass49_3.method1304();
			@Pc(79) Class1_Sub5_Sub3_Sub1 local79;
			for (local79 = (Class1_Sub5_Sub3_Sub1) this.aClass189_7.method4600(); local79 != null; local79 = (Class1_Sub5_Sub3_Sub1) this.aClass189_7.method4601()) {
				this.aClass1_Sub13_8.anInt2018 = 0;
				this.aClass1_Sub13_8.method1822(1);
				this.aClass1_Sub13_8.method1880((int) local79.aLong211);
				this.aClass49_3.method1302(this.aClass1_Sub13_8.aByteArray63, 4);
				this.aClass189_8.method4603(local79);
			}
			for (local79 = (Class1_Sub5_Sub3_Sub1) this.aClass189_9.method4600(); local79 != null; local79 = (Class1_Sub5_Sub3_Sub1) this.aClass189_9.method4601()) {
				this.aClass1_Sub13_8.anInt2018 = 0;
				this.aClass1_Sub13_8.method1822(0);
				this.aClass1_Sub13_8.method1880((int) local79.aLong211);
				this.aClass49_3.method1302(this.aClass1_Sub13_8.aByteArray63, 4);
				this.aClass189_10.method4603(local79);
			}
			for (@Pc(174) int local174 = 0; local174 < 100; local174++) {
				@Pc(184) int local184 = this.aClass49_3.method1300();
				if (local184 < 0) {
					throw new IOException();
				}
				if (local184 == 0) {
					break;
				}
				this.anInt4890 = 0;
				@Pc(205) byte local205 = 0;
				if (this.aClass1_Sub5_Sub3_Sub1_2 == null) {
					local205 = 8;
				} else if (this.aClass1_Sub5_Sub3_Sub1_2.anInt3500 == 0) {
					local205 = 1;
				}
				@Pc(235) int local235;
				@Pc(241) int local241;
				@Pc(285) int local285;
				if (local205 <= 0) {
					local235 = this.aClass1_Sub5_Sub3_Sub1_2.aClass1_Sub13_6.aByteArray63.length - this.aClass1_Sub5_Sub3_Sub1_2.aByte11;
					local241 = 512 - this.aClass1_Sub5_Sub3_Sub1_2.anInt3500;
					if (local235 - this.aClass1_Sub5_Sub3_Sub1_2.aClass1_Sub13_6.anInt2018 < local241) {
						local241 = local235 - this.aClass1_Sub5_Sub3_Sub1_2.aClass1_Sub13_6.anInt2018;
					}
					if (local184 < local241) {
						local241 = local184;
					}
					this.aClass49_3.method1303(this.aClass1_Sub5_Sub3_Sub1_2.aClass1_Sub13_6.anInt2018, this.aClass1_Sub5_Sub3_Sub1_2.aClass1_Sub13_6.aByteArray63, local241);
					if (this.aByte18 != 0) {
						for (local285 = 0; local285 < local241; local285++) {
							this.aClass1_Sub5_Sub3_Sub1_2.aClass1_Sub13_6.aByteArray63[this.aClass1_Sub5_Sub3_Sub1_2.aClass1_Sub13_6.anInt2018 + local285] ^= this.aByte18;
						}
					}
					this.aClass1_Sub5_Sub3_Sub1_2.aClass1_Sub13_6.anInt2018 += local241;
					this.aClass1_Sub5_Sub3_Sub1_2.anInt3500 += local241;
					if (this.aClass1_Sub5_Sub3_Sub1_2.aClass1_Sub13_6.anInt2018 == local235) {
						this.aClass1_Sub5_Sub3_Sub1_2.method4577();
						this.aClass1_Sub5_Sub3_Sub1_2.aBoolean460 = false;
						this.aClass1_Sub5_Sub3_Sub1_2 = null;
					} else if (this.aClass1_Sub5_Sub3_Sub1_2.anInt3500 == 512) {
						this.aClass1_Sub5_Sub3_Sub1_2.anInt3500 = 0;
					}
				} else {
					local235 = local205 - this.aClass1_Sub13_9.anInt2018;
					if (local184 < local235) {
						local235 = local184;
					}
					this.aClass49_3.method1303(this.aClass1_Sub13_9.anInt2018, this.aClass1_Sub13_9.aByteArray63, local235);
					if (this.aByte18 != 0) {
						for (local241 = 0; local241 < local235; local241++) {
							this.aClass1_Sub13_9.aByteArray63[local241 + this.aClass1_Sub13_9.anInt2018] ^= this.aByte18;
						}
					}
					this.aClass1_Sub13_9.anInt2018 += local235;
					if (this.aClass1_Sub13_9.anInt2018 >= local205) {
						if (this.aClass1_Sub5_Sub3_Sub1_2 == null) {
							this.aClass1_Sub13_9.anInt2018 = 0;
							local241 = this.aClass1_Sub13_9.method1853();
							local285 = this.aClass1_Sub13_9.method1879();
							@Pc(458) int local458 = this.aClass1_Sub13_9.method1853();
							@Pc(462) int local462 = local458 & 0x7F;
							@Pc(467) int local467 = this.aClass1_Sub13_9.method1860();
							@Pc(474) long local474 = (long) (local285 + (local241 << 16));
							@Pc(485) boolean local485 = (local458 & 0x80) != 0;
							@Pc(495) Class1_Sub5_Sub3_Sub1 local495;
							if (local485) {
								for (local495 = (Class1_Sub5_Sub3_Sub1) this.aClass189_10.method4600(); local495 != null && local495.aLong211 != local474; local495 = (Class1_Sub5_Sub3_Sub1) this.aClass189_10.method4601()) {
								}
							} else {
								for (local495 = (Class1_Sub5_Sub3_Sub1) this.aClass189_8.method4600(); local495 != null && local474 != local495.aLong211; local495 = (Class1_Sub5_Sub3_Sub1) this.aClass189_8.method4601()) {
								}
							}
							if (local495 == null) {
								throw new IOException();
							}
							this.aClass1_Sub5_Sub3_Sub1_2 = local495;
							@Pc(556) int local556 = local462 == 0 ? 5 : 9;
							this.aClass1_Sub5_Sub3_Sub1_2.aClass1_Sub13_6 = new Class1_Sub13(local467 + local556 + this.aClass1_Sub5_Sub3_Sub1_2.aByte11);
							this.aClass1_Sub5_Sub3_Sub1_2.aClass1_Sub13_6.method1822(local462);
							this.aClass1_Sub5_Sub3_Sub1_2.aClass1_Sub13_6.method1851(local467);
							this.aClass1_Sub5_Sub3_Sub1_2.anInt3500 = 8;
							this.aClass1_Sub13_9.anInt2018 = 0;
						} else if (this.aClass1_Sub5_Sub3_Sub1_2.anInt3500 != 0) {
							throw new IOException();
						} else if (this.aClass1_Sub13_9.aByteArray63[0] == -1) {
							this.aClass1_Sub13_9.anInt2018 = 0;
							this.aClass1_Sub5_Sub3_Sub1_2.anInt3500 = 1;
						} else {
							this.aClass1_Sub5_Sub3_Sub1_2 = null;
						}
					}
				}
			}
			return true;
		} catch (@Pc(633) IOException local633) {
			try {
				this.aClass49_3.method1307();
			} catch (@Pc(639) Exception local639) {
			}
			this.anInt4891 = -2;
			this.aClass49_3 = null;
			this.anInt4892++;
			return this.method4079() == 0 && this.method4085() == 0;
		}
	}

	@OriginalMember(owner = "client!te", name = "e", descriptor = "(I)Z")
	public boolean method4076() {
		return this.method4085() >= 20;
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(Lclient!fa;IZ)V")
	public void method4077(@OriginalArg(0) Class49 arg0, @OriginalArg(2) boolean arg1) {
		if (this.aClass49_3 != null) {
			try {
				this.aClass49_3.method1307();
			} catch (@Pc(19) Exception local19) {
			}
			this.aClass49_3 = null;
		}
		this.aClass49_3 = arg0;
		this.method4080();
		this.method4070(arg1);
		this.aClass1_Sub13_9.anInt2018 = 0;
		this.aClass1_Sub5_Sub3_Sub1_2 = null;
		while (true) {
			@Pc(51) Class1_Sub5_Sub3_Sub1 local51 = (Class1_Sub5_Sub3_Sub1) this.aClass189_8.method4602();
			if (local51 == null) {
				while (true) {
					local51 = (Class1_Sub5_Sub3_Sub1) this.aClass189_10.method4602();
					if (local51 == null) {
						if (this.aByte18 != 0) {
							try {
								this.aClass1_Sub13_8.anInt2018 = 0;
								this.aClass1_Sub13_8.method1822(4);
								this.aClass1_Sub13_8.method1822(this.aByte18);
								this.aClass1_Sub13_8.method1835(0);
								this.aClass49_3.method1302(this.aClass1_Sub13_8.aByteArray63, 4);
							} catch (@Pc(117) IOException local117) {
								try {
									this.aClass49_3.method1307();
								} catch (@Pc(123) Exception local123) {
								}
								this.anInt4891 = -2;
								this.aClass49_3 = null;
								this.anInt4892++;
							}
						}
						this.anInt4890 = 0;
						this.aLong188 = Static244.method3859();
						return;
					}
					this.aClass189_9.method4603(local51);
				}
			}
			this.aClass189_7.method4603(local51);
		}
	}

	@OriginalMember(owner = "client!te", name = "f", descriptor = "(I)I")
	public int method4079() {
		return this.aClass189_7.method4605() + this.aClass189_8.method4605();
	}

	@OriginalMember(owner = "client!te", name = "g", descriptor = "(I)V")
	private void method4080() {
		if (this.aClass49_3 == null) {
			return;
		}
		try {
			this.aClass1_Sub13_8.anInt2018 = 0;
			this.aClass1_Sub13_8.method1822(6);
			this.aClass1_Sub13_8.method1880(3);
			this.aClass49_3.method1302(this.aClass1_Sub13_8.aByteArray63, 4);
		} catch (@Pc(41) IOException local41) {
			try {
				this.aClass49_3.method1307();
			} catch (@Pc(47) Exception local47) {
			}
			this.anInt4892++;
			this.anInt4891 = -2;
			this.aClass49_3 = null;
		}
	}

	@OriginalMember(owner = "client!te", name = "h", descriptor = "(I)V")
	public void method4081() {
		if (this.aClass49_3 != null) {
			this.aClass49_3.method1307();
		}
	}

	@OriginalMember(owner = "client!te", name = "i", descriptor = "(I)Z")
	public boolean method4082() {
		return this.method4079() >= 20;
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(B)I")
	private int method4085() {
		return this.aClass189_9.method4605() + this.aClass189_10.method4605();
	}
}
