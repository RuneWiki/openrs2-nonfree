import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ef")
public final class Class86 {

	@OriginalMember(owner = "client!ef", name = "w", descriptor = "I")
	private int anInt2606;

	@OriginalMember(owner = "client!ef", name = "x", descriptor = "J")
	private long aLong63;

	@OriginalMember(owner = "client!ef", name = "y", descriptor = "Lclient!eo;")
	private Class92 aClass92_1;

	@OriginalMember(owner = "client!ef", name = "D", descriptor = "Lclient!uca;")
	private Class12_Sub4_Sub9_Sub2 aClass12_Sub4_Sub9_Sub2_1;

	@OriginalMember(owner = "client!ef", name = "p", descriptor = "Lclient!st;")
	private final Class280 aClass280_2 = new Class280();

	@OriginalMember(owner = "client!ef", name = "s", descriptor = "Lclient!st;")
	private final Class280 aClass280_3 = new Class280();

	@OriginalMember(owner = "client!ef", name = "t", descriptor = "Lclient!st;")
	private final Class280 aClass280_4 = new Class280();

	@OriginalMember(owner = "client!ef", name = "u", descriptor = "Lclient!st;")
	private final Class280 aClass280_5 = new Class280();

	@OriginalMember(owner = "client!ef", name = "v", descriptor = "Lclient!daa;")
	private final Class12_Sub8 aClass12_Sub8_1 = new Class12_Sub8(4);

	@OriginalMember(owner = "client!ef", name = "A", descriptor = "I")
	public volatile int anInt2607 = 0;

	@OriginalMember(owner = "client!ef", name = "B", descriptor = "I")
	public volatile int anInt2608 = 0;

	@OriginalMember(owner = "client!ef", name = "C", descriptor = "B")
	private byte aByte37 = 0;

	@OriginalMember(owner = "client!ef", name = "z", descriptor = "Lclient!daa;")
	private final Class12_Sub8 aClass12_Sub8_2 = new Class12_Sub8(8);

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(I)Z")
	public boolean method2307() {
		return this.method2319() >= 20;
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(BZ)V")
	public void method2308(@OriginalArg(1) boolean arg0) {
		if (this.aClass92_1 == null) {
			return;
		}
		try {
			this.aClass12_Sub8_1.anInt6217 = 0;
			this.aClass12_Sub8_1.method5214(arg0 ? 2 : 3);
			this.aClass12_Sub8_1.method5194(0);
			this.aClass92_1.method2468(4, this.aClass12_Sub8_1.aByteArray82);
		} catch (@Pc(42) IOException local42) {
			try {
				this.aClass92_1.method2475();
			} catch (@Pc(48) Exception local48) {
			}
			this.anInt2607++;
			this.aClass92_1 = null;
			this.anInt2608 = -2;
		}
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(B)V")
	public void method2309() {
		if (this.aClass92_1 != null) {
			this.aClass92_1.method2475();
		}
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(ZIIBI)Lclient!uca;")
	public Class12_Sub4_Sub9_Sub2 method2310(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte arg2, @OriginalArg(4) int arg3) {
		@Pc(11) long local11 = (long) ((arg1 << 16) + arg3);
		@Pc(15) Class12_Sub4_Sub9_Sub2 local15 = new Class12_Sub4_Sub9_Sub2();
		local15.aBoolean622 = arg0;
		local15.aLong247 = local11;
		local15.aByte96 = arg2;
		if (arg0) {
			if (this.method2315() >= 20) {
				throw new RuntimeException();
			}
			this.aClass280_2.method6894(local15);
		} else if (this.method2319() < 20) {
			this.aClass280_4.method6894(local15);
		} else {
			throw new RuntimeException();
		}
		return local15;
	}

	@OriginalMember(owner = "client!ef", name = "c", descriptor = "(I)V")
	private void method2312() {
		if (this.aClass92_1 == null) {
			return;
		}
		try {
			this.aClass12_Sub8_1.anInt6217 = 0;
			this.aClass12_Sub8_1.method5214(6);
			this.aClass12_Sub8_1.method5194(3);
			this.aClass92_1.method2468(4, this.aClass12_Sub8_1.aByteArray82);
		} catch (@Pc(32) IOException local32) {
			try {
				this.aClass92_1.method2475();
			} catch (@Pc(38) Exception local38) {
			}
			this.aClass92_1 = null;
			this.anInt2608 = -2;
			this.anInt2607++;
		}
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(Z)V")
	public void method2313() {
		try {
			this.aClass92_1.method2475();
		} catch (@Pc(5) Exception local5) {
		}
		this.anInt2607++;
		this.anInt2608 = -1;
		this.aClass92_1 = null;
		this.aByte37 = (byte) (Math.random() * 255.0D + 1.0D);
	}

	@OriginalMember(owner = "client!ef", name = "d", descriptor = "(I)V")
	public void method2314() {
		if (this.aClass92_1 == null) {
			return;
		}
		try {
			this.aClass12_Sub8_1.anInt6217 = 0;
			this.aClass12_Sub8_1.method5214(7);
			this.aClass12_Sub8_1.method5194(0);
			this.aClass92_1.method2468(4, this.aClass12_Sub8_1.aByteArray82);
		} catch (@Pc(40) IOException local40) {
			try {
				this.aClass92_1.method2475();
			} catch (@Pc(46) Exception local46) {
			}
			this.aClass92_1 = null;
			this.anInt2607++;
			this.anInt2608 = -2;
		}
	}

	@OriginalMember(owner = "client!ef", name = "b", descriptor = "(B)I")
	public int method2315() {
		return this.aClass280_2.method6890() + this.aClass280_3.method6890();
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(IZLclient!eo;)V")
	public void method2316(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class92 arg1) {
		if (this.aClass92_1 != null) {
			try {
				this.aClass92_1.method2475();
			} catch (@Pc(14) Exception local14) {
			}
			this.aClass92_1 = null;
		}
		this.aClass92_1 = arg1;
		this.method2312();
		this.method2308(arg0);
		this.aClass12_Sub8_2.anInt6217 = 0;
		this.aClass12_Sub4_Sub9_Sub2_1 = null;
		while (true) {
			@Pc(40) Class12_Sub4_Sub9_Sub2 local40 = (Class12_Sub4_Sub9_Sub2) this.aClass280_3.method6888();
			if (local40 == null) {
				while (true) {
					local40 = (Class12_Sub4_Sub9_Sub2) this.aClass280_5.method6888();
					if (local40 == null) {
						if (this.aByte37 != 0) {
							try {
								this.aClass12_Sub8_1.anInt6217 = 0;
								this.aClass12_Sub8_1.method5214(4);
								this.aClass12_Sub8_1.method5214(this.aByte37);
								this.aClass12_Sub8_1.method5190(0);
								this.aClass92_1.method2468(4, this.aClass12_Sub8_1.aByteArray82);
							} catch (@Pc(98) IOException local98) {
								try {
									this.aClass92_1.method2475();
								} catch (@Pc(104) Exception local104) {
								}
								this.aClass92_1 = null;
								this.anInt2607++;
								this.anInt2608 = -2;
							}
						}
						this.anInt2606 = 0;
						this.aLong63 = Static76.method1679();
						return;
					}
					this.aClass280_4.method6894(local40);
				}
			}
			this.aClass280_2.method6894(local40);
		}
	}

	@OriginalMember(owner = "client!ef", name = "e", descriptor = "(I)Z")
	public boolean method2317() {
		@Pc(26) int local26;
		if (this.aClass92_1 != null) {
			@Pc(19) long local19 = Static76.method1679();
			local26 = (int) (local19 - this.aLong63);
			this.aLong63 = local19;
			if (local26 > 200) {
				local26 = 200;
			}
			this.anInt2606 += local26;
			if (this.anInt2606 > 30000) {
				try {
					this.aClass92_1.method2475();
				} catch (@Pc(50) Exception local50) {
				}
				this.aClass92_1 = null;
			}
		}
		if (this.aClass92_1 == null) {
			return this.method2315() == 0 && this.method2319() == 0;
		}
		try {
			this.aClass92_1.method2469();
			for (@Pc(78) Class12_Sub4_Sub9_Sub2 local78 = (Class12_Sub4_Sub9_Sub2) this.aClass280_2.method6892(); local78 != null; local78 = (Class12_Sub4_Sub9_Sub2) this.aClass280_2.method6895()) {
				this.aClass12_Sub8_1.anInt6217 = 0;
				this.aClass12_Sub8_1.method5214(1);
				this.aClass12_Sub8_1.method5194((int) local78.aLong247);
				this.aClass92_1.method2468(4, this.aClass12_Sub8_1.aByteArray82);
				this.aClass280_3.method6894(local78);
			}
			for (@Pc(124) Class12_Sub4_Sub9_Sub2 local124 = (Class12_Sub4_Sub9_Sub2) this.aClass280_4.method6892(); local124 != null; local124 = (Class12_Sub4_Sub9_Sub2) this.aClass280_4.method6895()) {
				this.aClass12_Sub8_1.anInt6217 = 0;
				this.aClass12_Sub8_1.method5214(0);
				this.aClass12_Sub8_1.method5194((int) local124.aLong247);
				this.aClass92_1.method2468(4, this.aClass12_Sub8_1.aByteArray82);
				this.aClass280_5.method6894(local124);
			}
			for (local26 = 0; local26 < 100; local26++) {
				@Pc(173) int local173 = this.aClass92_1.method2474();
				if (local173 < 0) {
					throw new IOException();
				}
				if (local173 == 0) {
					break;
				}
				this.anInt2606 = 0;
				@Pc(189) byte local189 = 0;
				if (this.aClass12_Sub4_Sub9_Sub2_1 == null) {
					local189 = 8;
				} else if (this.aClass12_Sub4_Sub9_Sub2_1.anInt8860 == 0) {
					local189 = 1;
				}
				@Pc(217) int local217;
				@Pc(224) int local224;
				@Pc(273) int local273;
				if (local189 <= 0) {
					local217 = this.aClass12_Sub4_Sub9_Sub2_1.aClass12_Sub8_7.aByteArray82.length - this.aClass12_Sub4_Sub9_Sub2_1.aByte96;
					local224 = 512 - this.aClass12_Sub4_Sub9_Sub2_1.anInt8860;
					if (local224 > local217 - this.aClass12_Sub4_Sub9_Sub2_1.aClass12_Sub8_7.anInt6217) {
						local224 = local217 - this.aClass12_Sub4_Sub9_Sub2_1.aClass12_Sub8_7.anInt6217;
					}
					if (local224 > local173) {
						local224 = local173;
					}
					this.aClass92_1.method2470(this.aClass12_Sub4_Sub9_Sub2_1.aClass12_Sub8_7.aByteArray82, local224, this.aClass12_Sub4_Sub9_Sub2_1.aClass12_Sub8_7.anInt6217);
					if (this.aByte37 != 0) {
						for (local273 = 0; local273 < local224; local273++) {
							this.aClass12_Sub4_Sub9_Sub2_1.aClass12_Sub8_7.aByteArray82[local273 + this.aClass12_Sub4_Sub9_Sub2_1.aClass12_Sub8_7.anInt6217] ^= this.aByte37;
						}
					}
					this.aClass12_Sub4_Sub9_Sub2_1.aClass12_Sub8_7.anInt6217 += local224;
					this.aClass12_Sub4_Sub9_Sub2_1.anInt8860 += local224;
					if (local217 == this.aClass12_Sub4_Sub9_Sub2_1.aClass12_Sub8_7.anInt6217) {
						this.aClass12_Sub4_Sub9_Sub2_1.method7959();
						this.aClass12_Sub4_Sub9_Sub2_1.aBoolean623 = false;
						this.aClass12_Sub4_Sub9_Sub2_1 = null;
					} else if (this.aClass12_Sub4_Sub9_Sub2_1.anInt8860 == 512) {
						this.aClass12_Sub4_Sub9_Sub2_1.anInt8860 = 0;
					}
				} else {
					local217 = local189 - this.aClass12_Sub8_2.anInt6217;
					if (local217 > local173) {
						local217 = local173;
					}
					this.aClass92_1.method2470(this.aClass12_Sub8_2.aByteArray82, local217, this.aClass12_Sub8_2.anInt6217);
					if (this.aByte37 != 0) {
						for (local224 = 0; local224 < local217; local224++) {
							this.aClass12_Sub8_2.aByteArray82[this.aClass12_Sub8_2.anInt6217 + local224] = (byte) (this.aClass12_Sub8_2.aByteArray82[this.aClass12_Sub8_2.anInt6217 + local224] ^ this.aByte37);
						}
					}
					this.aClass12_Sub8_2.anInt6217 += local217;
					if (local189 <= this.aClass12_Sub8_2.anInt6217) {
						if (this.aClass12_Sub4_Sub9_Sub2_1 == null) {
							this.aClass12_Sub8_2.anInt6217 = 0;
							local224 = this.aClass12_Sub8_2.method5216();
							local273 = this.aClass12_Sub8_2.method5199();
							@Pc(449) int local449 = this.aClass12_Sub8_2.method5216();
							@Pc(454) int local454 = this.aClass12_Sub8_2.method5225();
							@Pc(458) int local458 = local449 & 0x7F;
							@Pc(466) boolean local466 = (local449 & 0x80) != 0;
							@Pc(473) long local473 = (long) (local273 + (local224 << 16));
							@Pc(483) Class12_Sub4_Sub9_Sub2 local483;
							if (local466) {
								for (local483 = (Class12_Sub4_Sub9_Sub2) this.aClass280_5.method6892(); local483 != null && local473 != local483.aLong247; local483 = (Class12_Sub4_Sub9_Sub2) this.aClass280_5.method6895()) {
								}
							} else {
								for (local483 = (Class12_Sub4_Sub9_Sub2) this.aClass280_3.method6892(); local483 != null && local473 != local483.aLong247; local483 = (Class12_Sub4_Sub9_Sub2) this.aClass280_3.method6895()) {
								}
							}
							if (local483 == null) {
								throw new IOException();
							}
							@Pc(540) int local540 = local458 == 0 ? 5 : 9;
							this.aClass12_Sub4_Sub9_Sub2_1 = local483;
							this.aClass12_Sub4_Sub9_Sub2_1.aClass12_Sub8_7 = new Class12_Sub8(this.aClass12_Sub4_Sub9_Sub2_1.aByte96 + local540 + local454);
							this.aClass12_Sub4_Sub9_Sub2_1.aClass12_Sub8_7.method5214(local458);
							this.aClass12_Sub4_Sub9_Sub2_1.aClass12_Sub8_7.method5223(local454);
							this.aClass12_Sub8_2.anInt6217 = 0;
							this.aClass12_Sub4_Sub9_Sub2_1.anInt8860 = 8;
						} else if (this.aClass12_Sub4_Sub9_Sub2_1.anInt8860 != 0) {
							throw new IOException();
						} else if (this.aClass12_Sub8_2.aByteArray82[0] == -1) {
							this.aClass12_Sub8_2.anInt6217 = 0;
							this.aClass12_Sub4_Sub9_Sub2_1.anInt8860 = 1;
						} else {
							this.aClass12_Sub4_Sub9_Sub2_1 = null;
						}
					}
				}
			}
			return true;
		} catch (@Pc(621) IOException local621) {
			try {
				this.aClass92_1.method2475();
			} catch (@Pc(627) Exception local627) {
			}
			this.aClass92_1 = null;
			this.anInt2607++;
			this.anInt2608 = -2;
			return this.method2315() == 0 && this.method2319() == 0;
		}
	}

	@OriginalMember(owner = "client!ef", name = "f", descriptor = "(I)V")
	public void method2318() {
		if (this.aClass92_1 != null) {
			this.aClass92_1.method2471();
		}
	}

	@OriginalMember(owner = "client!ef", name = "g", descriptor = "(I)I")
	private int method2319() {
		return this.aClass280_4.method6890() + this.aClass280_5.method6890();
	}

	@OriginalMember(owner = "client!ef", name = "b", descriptor = "(Z)Z")
	public boolean method2321() {
		return this.method2315() >= 20;
	}
}
