import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gb")
public final class Class113 {

	@OriginalMember(owner = "client!gb", name = "x", descriptor = "J")
	private long aLong139;

	@OriginalMember(owner = "client!gb", name = "y", descriptor = "Lclient!th;")
	private Class312 aClass312_2;

	@OriginalMember(owner = "client!gb", name = "z", descriptor = "I")
	private int anInt2961;

	@OriginalMember(owner = "client!gb", name = "F", descriptor = "Lclient!wd;")
	private Class1_Sub3_Sub11_Sub2 aClass1_Sub3_Sub11_Sub2_1;

	@OriginalMember(owner = "client!gb", name = "e", descriptor = "Lclient!gfa;")
	private final Class117 aClass117_3 = new Class117();

	@OriginalMember(owner = "client!gb", name = "q", descriptor = "Lclient!gfa;")
	private final Class117 aClass117_4 = new Class117();

	@OriginalMember(owner = "client!gb", name = "v", descriptor = "Lclient!gfa;")
	private final Class117 aClass117_5 = new Class117();

	@OriginalMember(owner = "client!gb", name = "w", descriptor = "Lclient!gfa;")
	private final Class117 aClass117_6 = new Class117();

	@OriginalMember(owner = "client!gb", name = "A", descriptor = "Lclient!io;")
	private final Class1_Sub20 aClass1_Sub20_1 = new Class1_Sub20(4);

	@OriginalMember(owner = "client!gb", name = "D", descriptor = "I")
	public volatile int anInt2963 = 0;

	@OriginalMember(owner = "client!gb", name = "B", descriptor = "I")
	public volatile int anInt2962 = 0;

	@OriginalMember(owner = "client!gb", name = "E", descriptor = "B")
	private byte aByte42 = 0;

	@OriginalMember(owner = "client!gb", name = "C", descriptor = "Lclient!io;")
	private final Class1_Sub20 aClass1_Sub20_2 = new Class1_Sub20(8);

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(I)Z")
	public boolean method2481() {
		return this.method2489() >= 20;
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(Z)Z")
	public boolean method2482() {
		@Pc(18) int local18;
		if (this.aClass312_2 != null) {
			@Pc(11) long local11 = Static255.method4035();
			local18 = (int) (local11 - this.aLong139);
			this.aLong139 = local11;
			if (local18 > 200) {
				local18 = 200;
			}
			this.anInt2961 += local18;
			if (this.anInt2961 > 30000) {
				try {
					this.aClass312_2.method7013();
				} catch (@Pc(46) Exception local46) {
				}
				this.aClass312_2 = null;
			}
		}
		if (this.aClass312_2 == null) {
			return this.method2494() == 0 && this.method2489() == 0;
		}
		try {
			this.aClass312_2.method7018();
			for (@Pc(80) Class1_Sub3_Sub11_Sub2 local80 = (Class1_Sub3_Sub11_Sub2) this.aClass117_3.method2549(); local80 != null; local80 = (Class1_Sub3_Sub11_Sub2) this.aClass117_3.method2551()) {
				this.aClass1_Sub20_1.anInt5238 = 0;
				this.aClass1_Sub20_1.method4378(1);
				this.aClass1_Sub20_1.method4414((int) local80.aLong420);
				this.aClass312_2.method7021(4, this.aClass1_Sub20_1.aByteArray52);
				this.aClass117_4.method2550(local80);
			}
			for (@Pc(126) Class1_Sub3_Sub11_Sub2 local126 = (Class1_Sub3_Sub11_Sub2) this.aClass117_5.method2549(); local126 != null; local126 = (Class1_Sub3_Sub11_Sub2) this.aClass117_5.method2551()) {
				this.aClass1_Sub20_1.anInt5238 = 0;
				this.aClass1_Sub20_1.method4378(0);
				this.aClass1_Sub20_1.method4414((int) local126.aLong420);
				this.aClass312_2.method7021(4, this.aClass1_Sub20_1.aByteArray52);
				this.aClass117_6.method2550(local126);
			}
			for (local18 = 0; local18 < 100; local18++) {
				@Pc(175) int local175 = this.aClass312_2.method7017();
				if (local175 < 0) {
					throw new IOException();
				}
				if (local175 == 0) {
					break;
				}
				this.anInt2961 = 0;
				@Pc(191) byte local191 = 0;
				if (this.aClass1_Sub3_Sub11_Sub2_1 == null) {
					local191 = 8;
				} else if (this.aClass1_Sub3_Sub11_Sub2_1.anInt9370 == 0) {
					local191 = 1;
				}
				@Pc(219) int local219;
				@Pc(225) int local225;
				@Pc(273) int local273;
				if (local191 <= 0) {
					local219 = this.aClass1_Sub3_Sub11_Sub2_1.aClass1_Sub20_6.aByteArray52.length - this.aClass1_Sub3_Sub11_Sub2_1.aByte121;
					local225 = 512 - this.aClass1_Sub3_Sub11_Sub2_1.anInt9370;
					if (local225 > local219 - this.aClass1_Sub3_Sub11_Sub2_1.aClass1_Sub20_6.anInt5238) {
						local225 = local219 - this.aClass1_Sub3_Sub11_Sub2_1.aClass1_Sub20_6.anInt5238;
					}
					if (local225 > local175) {
						local225 = local175;
					}
					this.aClass312_2.method7022(this.aClass1_Sub3_Sub11_Sub2_1.aClass1_Sub20_6.anInt5238, this.aClass1_Sub3_Sub11_Sub2_1.aClass1_Sub20_6.aByteArray52, local225);
					if (this.aByte42 != 0) {
						for (local273 = 0; local273 < local225; local273++) {
							this.aClass1_Sub3_Sub11_Sub2_1.aClass1_Sub20_6.aByteArray52[local273 + this.aClass1_Sub3_Sub11_Sub2_1.aClass1_Sub20_6.anInt5238] ^= this.aByte42;
						}
					}
					this.aClass1_Sub3_Sub11_Sub2_1.anInt9370 += local225;
					this.aClass1_Sub3_Sub11_Sub2_1.aClass1_Sub20_6.anInt5238 += local225;
					if (this.aClass1_Sub3_Sub11_Sub2_1.aClass1_Sub20_6.anInt5238 == local219) {
						this.aClass1_Sub3_Sub11_Sub2_1.method7811();
						this.aClass1_Sub3_Sub11_Sub2_1.aBoolean684 = false;
						this.aClass1_Sub3_Sub11_Sub2_1 = null;
					} else if (this.aClass1_Sub3_Sub11_Sub2_1.anInt9370 == 512) {
						this.aClass1_Sub3_Sub11_Sub2_1.anInt9370 = 0;
					}
				} else {
					local219 = local191 - this.aClass1_Sub20_2.anInt5238;
					if (local219 > local175) {
						local219 = local175;
					}
					this.aClass312_2.method7022(this.aClass1_Sub20_2.anInt5238, this.aClass1_Sub20_2.aByteArray52, local219);
					if (this.aByte42 != 0) {
						for (local225 = 0; local225 < local219; local225++) {
							this.aClass1_Sub20_2.aByteArray52[local225 + this.aClass1_Sub20_2.anInt5238] ^= this.aByte42;
						}
					}
					this.aClass1_Sub20_2.anInt5238 += local219;
					if (local191 <= this.aClass1_Sub20_2.anInt5238) {
						if (this.aClass1_Sub3_Sub11_Sub2_1 == null) {
							this.aClass1_Sub20_2.anInt5238 = 0;
							local225 = this.aClass1_Sub20_2.method4393();
							local273 = this.aClass1_Sub20_2.method4426();
							@Pc(451) int local451 = this.aClass1_Sub20_2.method4393();
							@Pc(456) int local456 = this.aClass1_Sub20_2.method4371();
							@Pc(460) int local460 = local451 & 0x7F;
							@Pc(468) boolean local468 = (local451 & 0x80) != 0;
							@Pc(475) long local475 = (long) (local273 + (local225 << 16));
							@Pc(485) Class1_Sub3_Sub11_Sub2 local485;
							if (local468) {
								for (local485 = (Class1_Sub3_Sub11_Sub2) this.aClass117_6.method2549(); local485 != null && local475 != local485.aLong420; local485 = (Class1_Sub3_Sub11_Sub2) this.aClass117_6.method2551()) {
								}
							} else {
								for (local485 = (Class1_Sub3_Sub11_Sub2) this.aClass117_4.method2549(); local485 != null && local485.aLong420 != local475; local485 = (Class1_Sub3_Sub11_Sub2) this.aClass117_4.method2551()) {
								}
							}
							if (local485 == null) {
								throw new IOException();
							}
							this.aClass1_Sub3_Sub11_Sub2_1 = local485;
							@Pc(545) int local545 = local460 == 0 ? 5 : 9;
							this.aClass1_Sub3_Sub11_Sub2_1.aClass1_Sub20_6 = new Class1_Sub20(local545 + local456 + this.aClass1_Sub3_Sub11_Sub2_1.aByte121);
							this.aClass1_Sub3_Sub11_Sub2_1.aClass1_Sub20_6.method4378(local460);
							this.aClass1_Sub3_Sub11_Sub2_1.aClass1_Sub20_6.method4421(local456);
							this.aClass1_Sub20_2.anInt5238 = 0;
							this.aClass1_Sub3_Sub11_Sub2_1.anInt9370 = 8;
						} else if (this.aClass1_Sub3_Sub11_Sub2_1.anInt9370 != 0) {
							throw new IOException();
						} else if (this.aClass1_Sub20_2.aByteArray52[0] == -1) {
							this.aClass1_Sub20_2.anInt5238 = 0;
							this.aClass1_Sub3_Sub11_Sub2_1.anInt9370 = 1;
						} else {
							this.aClass1_Sub3_Sub11_Sub2_1 = null;
						}
					}
				}
			}
			return true;
		} catch (@Pc(621) IOException local621) {
			try {
				this.aClass312_2.method7013();
			} catch (@Pc(627) Exception local627) {
			}
			this.anInt2963++;
			this.aClass312_2 = null;
			this.anInt2962 = -2;
			return this.method2494() == 0 && this.method2489() == 0;
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IZ)V")
	public void method2484(@OriginalArg(1) boolean arg0) {
		if (this.aClass312_2 == null) {
			return;
		}
		try {
			this.aClass1_Sub20_1.anInt5238 = 0;
			this.aClass1_Sub20_1.method4378(arg0 ? 2 : 3);
			this.aClass1_Sub20_1.method4414(0);
			this.aClass312_2.method7021(4, this.aClass1_Sub20_1.aByteArray52);
		} catch (@Pc(38) IOException local38) {
			try {
				this.aClass312_2.method7013();
			} catch (@Pc(44) Exception local44) {
			}
			this.anInt2962 = -2;
			this.anInt2963++;
			this.aClass312_2 = null;
		}
	}

	@OriginalMember(owner = "client!gb", name = "b", descriptor = "(I)Z")
	public boolean method2485() {
		return this.method2494() >= 20;
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IBIBZ)Lclient!wd;")
	public Class1_Sub3_Sub11_Sub2 method2486(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte arg2, @OriginalArg(4) boolean arg3) {
		@Pc(16) long local16 = (long) (arg0 + (arg1 << 16));
		@Pc(20) Class1_Sub3_Sub11_Sub2 local20 = new Class1_Sub3_Sub11_Sub2();
		local20.aBoolean686 = arg3;
		local20.aLong420 = local16;
		local20.aByte121 = arg2;
		if (arg3) {
			if (this.method2494() >= 20) {
				throw new RuntimeException();
			}
			this.aClass117_3.method2550(local20);
		} else if (this.method2489() < 20) {
			this.aClass117_5.method2550(local20);
		} else {
			throw new RuntimeException();
		}
		return local20;
	}

	@OriginalMember(owner = "client!gb", name = "c", descriptor = "(I)V")
	public void method2487() {
		try {
			this.aClass312_2.method7013();
		} catch (@Pc(9) Exception local9) {
		}
		this.anInt2963++;
		this.aByte42 = (byte) (Math.random() * 255.0D + 1.0D);
		this.anInt2962 = -1;
		this.aClass312_2 = null;
	}

	@OriginalMember(owner = "client!gb", name = "d", descriptor = "(I)V")
	public void method2488() {
		if (this.aClass312_2 != null) {
			this.aClass312_2.method7013();
		}
	}

	@OriginalMember(owner = "client!gb", name = "e", descriptor = "(I)I")
	private int method2489() {
		return this.aClass117_5.method2557() + this.aClass117_6.method2557();
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(ZLclient!th;Z)V")
	public void method2490(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class312 arg1) {
		if (this.aClass312_2 != null) {
			try {
				this.aClass312_2.method7013();
			} catch (@Pc(14) Exception local14) {
			}
			this.aClass312_2 = null;
		}
		this.aClass312_2 = arg1;
		this.method2496();
		this.method2484(arg0);
		this.aClass1_Sub3_Sub11_Sub2_1 = null;
		this.aClass1_Sub20_2.anInt5238 = 0;
		while (true) {
			@Pc(40) Class1_Sub3_Sub11_Sub2 local40 = (Class1_Sub3_Sub11_Sub2) this.aClass117_4.method2556();
			if (local40 == null) {
				while (true) {
					local40 = (Class1_Sub3_Sub11_Sub2) this.aClass117_6.method2556();
					if (local40 == null) {
						if (this.aByte42 != 0) {
							try {
								this.aClass1_Sub20_1.anInt5238 = 0;
								this.aClass1_Sub20_1.method4378(4);
								this.aClass1_Sub20_1.method4378(this.aByte42);
								this.aClass1_Sub20_1.method4381(0);
								this.aClass312_2.method7021(4, this.aClass1_Sub20_1.aByteArray52);
							} catch (@Pc(98) IOException local98) {
								try {
									this.aClass312_2.method7013();
								} catch (@Pc(104) Exception local104) {
								}
								this.aClass312_2 = null;
								this.anInt2963++;
								this.anInt2962 = -2;
							}
						}
						this.anInt2961 = 0;
						this.aLong139 = Static255.method4035();
						return;
					}
					this.aClass117_5.method2550(local40);
				}
			}
			this.aClass117_3.method2550(local40);
		}
	}

	@OriginalMember(owner = "client!gb", name = "f", descriptor = "(I)V")
	public void method2492() {
		if (this.aClass312_2 != null) {
			this.aClass312_2.method7016();
		}
	}

	@OriginalMember(owner = "client!gb", name = "g", descriptor = "(I)I")
	public int method2494() {
		return this.aClass117_3.method2557() + this.aClass117_4.method2557();
	}

	@OriginalMember(owner = "client!gb", name = "b", descriptor = "(B)V")
	public void method2495() {
		if (this.aClass312_2 == null) {
			return;
		}
		try {
			this.aClass1_Sub20_1.anInt5238 = 0;
			this.aClass1_Sub20_1.method4378(7);
			this.aClass1_Sub20_1.method4414(0);
			this.aClass312_2.method7021(4, this.aClass1_Sub20_1.aByteArray52);
		} catch (@Pc(40) IOException local40) {
			try {
				this.aClass312_2.method7013();
			} catch (@Pc(46) Exception local46) {
			}
			this.anInt2963++;
			this.aClass312_2 = null;
			this.anInt2962 = -2;
		}
	}

	@OriginalMember(owner = "client!gb", name = "h", descriptor = "(I)V")
	private void method2496() {
		if (this.aClass312_2 == null) {
			return;
		}
		try {
			this.aClass1_Sub20_1.anInt5238 = 0;
			this.aClass1_Sub20_1.method4378(6);
			this.aClass1_Sub20_1.method4414(3);
			this.aClass312_2.method7021(4, this.aClass1_Sub20_1.aByteArray52);
		} catch (@Pc(32) IOException local32) {
			try {
				this.aClass312_2.method7013();
			} catch (@Pc(38) Exception local38) {
			}
			this.aClass312_2 = null;
			this.anInt2963++;
			this.anInt2962 = -2;
		}
	}
}
