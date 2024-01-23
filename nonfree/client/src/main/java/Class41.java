import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ea")
public final class Class41 {

	@OriginalMember(owner = "client!ea", name = "v", descriptor = "Lclient!ln;")
	private Class104 aClass104_2;

	@OriginalMember(owner = "client!ea", name = "x", descriptor = "I")
	private int anInt1235;

	@OriginalMember(owner = "client!ea", name = "y", descriptor = "J")
	private long aLong53;

	@OriginalMember(owner = "client!ea", name = "D", descriptor = "Lclient!ol;")
	private Class1_Sub3_Sub4_Sub2 aClass1_Sub3_Sub4_Sub2_1;

	@OriginalMember(owner = "client!ea", name = "m", descriptor = "Lclient!mg;")
	private Class108 aClass108_3 = new Class108();

	@OriginalMember(owner = "client!ea", name = "q", descriptor = "Lclient!mg;")
	private Class108 aClass108_4 = new Class108();

	@OriginalMember(owner = "client!ea", name = "r", descriptor = "Lclient!mg;")
	private Class108 aClass108_5 = new Class108();

	@OriginalMember(owner = "client!ea", name = "t", descriptor = "Lclient!mg;")
	private Class108 aClass108_6 = new Class108();

	@OriginalMember(owner = "client!ea", name = "w", descriptor = "Lclient!qm;")
	private Class1_Sub14 aClass1_Sub14_4 = new Class1_Sub14(4);

	@OriginalMember(owner = "client!ea", name = "A", descriptor = "I")
	public volatile int anInt1236 = 0;

	@OriginalMember(owner = "client!ea", name = "C", descriptor = "I")
	public volatile int anInt1237 = 0;

	@OriginalMember(owner = "client!ea", name = "B", descriptor = "B")
	private byte aByte8 = 0;

	@OriginalMember(owner = "client!ea", name = "z", descriptor = "Lclient!qm;")
	private Class1_Sub14 aClass1_Sub14_5 = new Class1_Sub14(8);

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(I)V")
	public void method1023() {
		if (this.aClass104_2 != null) {
			this.aClass104_2.method2575();
		}
	}

	@OriginalMember(owner = "client!ea", name = "b", descriptor = "(I)Z")
	public boolean method1024() {
		@Pc(20) int local20;
		if (this.aClass104_2 != null) {
			@Pc(13) long local13 = Static258.method3967();
			local20 = (int) (local13 - this.aLong53);
			if (local20 > 200) {
				local20 = 200;
			}
			this.anInt1235 += local20;
			this.aLong53 = local13;
			if (this.anInt1235 > 30000) {
				try {
					this.aClass104_2.method2571();
				} catch (@Pc(48) Exception local48) {
				}
				this.aClass104_2 = null;
			}
		}
		if (this.aClass104_2 == null) {
			return this.method1036() == 0 && this.method1034() == 0;
		}
		try {
			this.aClass104_2.method2572();
			@Pc(90) Class1_Sub3_Sub4_Sub2 local90;
			for (local90 = (Class1_Sub3_Sub4_Sub2) this.aClass108_3.method2754(); local90 != null; local90 = (Class1_Sub3_Sub4_Sub2) this.aClass108_3.method2751()) {
				this.aClass1_Sub14_4.anInt3000 = 0;
				this.aClass1_Sub14_4.method2191(1);
				this.aClass1_Sub14_4.method2206((int) local90.aLong237);
				this.aClass104_2.method2579(this.aClass1_Sub14_4.aByteArray55, 4);
				this.aClass108_4.method2753(local90);
			}
			for (local90 = (Class1_Sub3_Sub4_Sub2) this.aClass108_5.method2754(); local90 != null; local90 = (Class1_Sub3_Sub4_Sub2) this.aClass108_5.method2751()) {
				this.aClass1_Sub14_4.anInt3000 = 0;
				this.aClass1_Sub14_4.method2191(0);
				this.aClass1_Sub14_4.method2206((int) local90.aLong237);
				this.aClass104_2.method2579(this.aClass1_Sub14_4.aByteArray55, 4);
				this.aClass108_6.method2753(local90);
			}
			for (@Pc(180) int local180 = 0; local180 < 100; local180++) {
				local20 = this.aClass104_2.method2581();
				if (local20 < 0) {
					throw new IOException();
				}
				if (local20 == 0) {
					break;
				}
				this.anInt1235 = 0;
				@Pc(204) byte local204 = 0;
				if (this.aClass1_Sub3_Sub4_Sub2_1 == null) {
					local204 = 8;
				} else if (this.aClass1_Sub3_Sub4_Sub2_1.anInt4404 == 0) {
					local204 = 1;
				}
				@Pc(232) int local232;
				@Pc(239) int local239;
				@Pc(282) int local282;
				if (local204 <= 0) {
					local232 = this.aClass1_Sub3_Sub4_Sub2_1.aClass1_Sub14_7.aByteArray55.length - this.aClass1_Sub3_Sub4_Sub2_1.aByte16;
					local239 = 512 - this.aClass1_Sub3_Sub4_Sub2_1.anInt4404;
					if (local232 - this.aClass1_Sub3_Sub4_Sub2_1.aClass1_Sub14_7.anInt3000 < local239) {
						local239 = local232 - this.aClass1_Sub3_Sub4_Sub2_1.aClass1_Sub14_7.anInt3000;
					}
					if (local20 < local239) {
						local239 = local20;
					}
					this.aClass104_2.method2574(this.aClass1_Sub3_Sub4_Sub2_1.aClass1_Sub14_7.aByteArray55, this.aClass1_Sub3_Sub4_Sub2_1.aClass1_Sub14_7.anInt3000, local239);
					if (this.aByte8 != 0) {
						for (local282 = 0; local282 < local239; local282++) {
							this.aClass1_Sub3_Sub4_Sub2_1.aClass1_Sub14_7.aByteArray55[this.aClass1_Sub3_Sub4_Sub2_1.aClass1_Sub14_7.anInt3000 + local282] ^= this.aByte8;
						}
					}
					this.aClass1_Sub3_Sub4_Sub2_1.anInt4404 += local239;
					this.aClass1_Sub3_Sub4_Sub2_1.aClass1_Sub14_7.anInt3000 += local239;
					if (local232 == this.aClass1_Sub3_Sub4_Sub2_1.aClass1_Sub14_7.anInt3000) {
						this.aClass1_Sub3_Sub4_Sub2_1.method4652();
						this.aClass1_Sub3_Sub4_Sub2_1.aBoolean275 = false;
						this.aClass1_Sub3_Sub4_Sub2_1 = null;
					} else if (this.aClass1_Sub3_Sub4_Sub2_1.anInt4404 == 512) {
						this.aClass1_Sub3_Sub4_Sub2_1.anInt4404 = 0;
					}
				} else {
					local232 = local204 - this.aClass1_Sub14_5.anInt3000;
					if (local20 < local232) {
						local232 = local20;
					}
					this.aClass104_2.method2574(this.aClass1_Sub14_5.aByteArray55, this.aClass1_Sub14_5.anInt3000, local232);
					if (this.aByte8 != 0) {
						for (local239 = 0; local239 < local232; local239++) {
							this.aClass1_Sub14_5.aByteArray55[local239 + this.aClass1_Sub14_5.anInt3000] ^= this.aByte8;
						}
					}
					this.aClass1_Sub14_5.anInt3000 += local232;
					if (local204 <= this.aClass1_Sub14_5.anInt3000) {
						if (this.aClass1_Sub3_Sub4_Sub2_1 == null) {
							this.aClass1_Sub14_5.anInt3000 = 0;
							local239 = this.aClass1_Sub14_5.method2199();
							local282 = this.aClass1_Sub14_5.method2244();
							@Pc(459) int local459 = this.aClass1_Sub14_5.method2199();
							@Pc(463) int local463 = local459 & 0x7F;
							@Pc(472) boolean local472 = (local459 & 0x80) != 0;
							@Pc(477) int local477 = this.aClass1_Sub14_5.method2194();
							@Pc(484) long local484 = (long) (local282 + (local239 << 16));
							@Pc(494) Class1_Sub3_Sub4_Sub2 local494;
							if (local472) {
								for (local494 = (Class1_Sub3_Sub4_Sub2) this.aClass108_6.method2754(); local494 != null && local494.aLong237 != local484; local494 = (Class1_Sub3_Sub4_Sub2) this.aClass108_6.method2751()) {
								}
							} else {
								for (local494 = (Class1_Sub3_Sub4_Sub2) this.aClass108_4.method2754(); local494 != null && local484 != local494.aLong237; local494 = (Class1_Sub3_Sub4_Sub2) this.aClass108_4.method2751()) {
								}
							}
							if (local494 == null) {
								throw new IOException();
							}
							@Pc(551) int local551 = local463 == 0 ? 5 : 9;
							this.aClass1_Sub3_Sub4_Sub2_1 = local494;
							this.aClass1_Sub3_Sub4_Sub2_1.aClass1_Sub14_7 = new Class1_Sub14(local551 + local477 + this.aClass1_Sub3_Sub4_Sub2_1.aByte16);
							this.aClass1_Sub3_Sub4_Sub2_1.aClass1_Sub14_7.method2191(local463);
							this.aClass1_Sub3_Sub4_Sub2_1.aClass1_Sub14_7.method2236(local477);
							this.aClass1_Sub3_Sub4_Sub2_1.anInt4404 = 8;
							this.aClass1_Sub14_5.anInt3000 = 0;
						} else if (this.aClass1_Sub3_Sub4_Sub2_1.anInt4404 != 0) {
							throw new IOException();
						} else if (this.aClass1_Sub14_5.aByteArray55[0] == -1) {
							this.aClass1_Sub14_5.anInt3000 = 0;
							this.aClass1_Sub3_Sub4_Sub2_1.anInt4404 = 1;
						} else {
							this.aClass1_Sub3_Sub4_Sub2_1 = null;
						}
					}
				}
			}
			return true;
		} catch (@Pc(627) IOException local627) {
			try {
				this.aClass104_2.method2571();
			} catch (@Pc(633) Exception local633) {
			}
			this.anInt1236++;
			this.aClass104_2 = null;
			this.anInt1237 = -2;
			return this.method1036() == 0 && this.method1034() == 0;
		}
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(ZB)V")
	public void method1025(@OriginalArg(0) boolean arg0) {
		if (this.aClass104_2 == null) {
			return;
		}
		try {
			this.aClass1_Sub14_4.anInt3000 = 0;
			this.aClass1_Sub14_4.method2191(arg0 ? 2 : 3);
			this.aClass1_Sub14_4.method2206(0);
			this.aClass104_2.method2579(this.aClass1_Sub14_4.aByteArray55, 4);
		} catch (@Pc(41) IOException local41) {
			try {
				this.aClass104_2.method2571();
			} catch (@Pc(47) Exception local47) {
			}
			this.anInt1237 = -2;
			this.aClass104_2 = null;
			this.anInt1236++;
		}
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(Lclient!ln;IZ)V")
	public void method1026(@OriginalArg(0) Class104 arg0, @OriginalArg(2) boolean arg1) {
		if (this.aClass104_2 != null) {
			try {
				this.aClass104_2.method2571();
			} catch (@Pc(14) Exception local14) {
			}
			this.aClass104_2 = null;
		}
		this.aClass104_2 = arg0;
		this.method1027();
		this.method1025(arg1);
		this.aClass1_Sub3_Sub4_Sub2_1 = null;
		this.aClass1_Sub14_5.anInt3000 = 0;
		while (true) {
			@Pc(48) Class1_Sub3_Sub4_Sub2 local48 = (Class1_Sub3_Sub4_Sub2) this.aClass108_4.method2756();
			if (local48 == null) {
				while (true) {
					local48 = (Class1_Sub3_Sub4_Sub2) this.aClass108_6.method2756();
					if (local48 == null) {
						if (this.aByte8 != 0) {
							try {
								this.aClass1_Sub14_4.anInt3000 = 0;
								this.aClass1_Sub14_4.method2191(4);
								this.aClass1_Sub14_4.method2191(this.aByte8);
								this.aClass1_Sub14_4.method2208(0);
								this.aClass104_2.method2579(this.aClass1_Sub14_4.aByteArray55, 4);
							} catch (@Pc(114) IOException local114) {
								try {
									this.aClass104_2.method2571();
								} catch (@Pc(120) Exception local120) {
								}
								this.anInt1236++;
								this.aClass104_2 = null;
								this.anInt1237 = -2;
							}
						}
						this.anInt1235 = 0;
						this.aLong53 = Static258.method3967();
						return;
					}
					this.aClass108_5.method2753(local48);
				}
			}
			this.aClass108_3.method2753(local48);
		}
	}

	@OriginalMember(owner = "client!ea", name = "c", descriptor = "(I)V")
	private void method1027() {
		if (this.aClass104_2 == null) {
			return;
		}
		try {
			this.aClass1_Sub14_4.anInt3000 = 0;
			this.aClass1_Sub14_4.method2191(6);
			this.aClass1_Sub14_4.method2206(3);
			this.aClass104_2.method2579(this.aClass1_Sub14_4.aByteArray55, 4);
		} catch (@Pc(33) IOException local33) {
			try {
				this.aClass104_2.method2571();
			} catch (@Pc(39) Exception local39) {
			}
			this.anInt1236++;
			this.aClass104_2 = null;
			this.anInt1237 = -2;
		}
	}

	@OriginalMember(owner = "client!ea", name = "d", descriptor = "(I)Z")
	public boolean method1028() {
		return this.method1034() >= 20;
	}

	@OriginalMember(owner = "client!ea", name = "g", descriptor = "(I)V")
	public void method1031() {
		if (this.aClass104_2 == null) {
			return;
		}
		try {
			this.aClass1_Sub14_4.anInt3000 = 0;
			this.aClass1_Sub14_4.method2191(7);
			this.aClass1_Sub14_4.method2206(0);
			this.aClass104_2.method2579(this.aClass1_Sub14_4.aByteArray55, 4);
		} catch (@Pc(44) IOException local44) {
			try {
				this.aClass104_2.method2571();
			} catch (@Pc(50) Exception local50) {
			}
			this.anInt1236++;
			this.anInt1237 = -2;
			this.aClass104_2 = null;
		}
	}

	@OriginalMember(owner = "client!ea", name = "h", descriptor = "(I)Z")
	public boolean method1032() {
		return this.method1036() >= 20;
	}

	@OriginalMember(owner = "client!ea", name = "i", descriptor = "(I)I")
	private int method1034() {
		return this.aClass108_5.method2752() + this.aClass108_6.method2752();
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(ZBIIB)Lclient!ol;")
	public Class1_Sub3_Sub4_Sub2 method1035(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) byte arg3) {
		@Pc(17) long local17 = (long) ((arg1 << 16) + arg2);
		@Pc(21) Class1_Sub3_Sub4_Sub2 local21 = new Class1_Sub3_Sub4_Sub2();
		local21.aLong237 = local17;
		local21.aByte16 = arg3;
		local21.aBoolean272 = arg0;
		if (arg0) {
			if (this.method1036() >= 20) {
				throw new RuntimeException();
			}
			this.aClass108_3.method2753(local21);
		} else if (this.method1034() < 20) {
			this.aClass108_5.method2753(local21);
		} else {
			throw new RuntimeException();
		}
		return local21;
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(B)I")
	public int method1036() {
		return this.aClass108_3.method2752() + this.aClass108_4.method2752();
	}

	@OriginalMember(owner = "client!ea", name = "b", descriptor = "(B)V")
	public void method1037() {
		if (this.aClass104_2 != null) {
			this.aClass104_2.method2571();
		}
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(Z)V")
	public void method1038() {
		try {
			this.aClass104_2.method2571();
		} catch (@Pc(5) Exception local5) {
		}
		this.aClass104_2 = null;
		this.anInt1236++;
		this.anInt1237 = -1;
		this.aByte8 = (byte) (Math.random() * 255.0D + 1.0D);
	}
}
