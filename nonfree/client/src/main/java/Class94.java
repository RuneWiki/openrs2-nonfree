import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fs")
public final class Class94 {

	@OriginalMember(owner = "client!fs", name = "x", descriptor = "J")
	private long aLong75;

	@OriginalMember(owner = "client!fs", name = "z", descriptor = "Lclient!caa;")
	private Class31 aClass31_4;

	@OriginalMember(owner = "client!fs", name = "A", descriptor = "I")
	private int anInt2644;

	@OriginalMember(owner = "client!fs", name = "F", descriptor = "Lclient!paa;")
	private Class2_Sub13_Sub2_Sub2 aClass2_Sub13_Sub2_Sub2_1;

	@OriginalMember(owner = "client!fs", name = "k", descriptor = "Lclient!mc;")
	private final Class185 aClass185_3 = new Class185();

	@OriginalMember(owner = "client!fs", name = "q", descriptor = "Lclient!mc;")
	private final Class185 aClass185_4 = new Class185();

	@OriginalMember(owner = "client!fs", name = "v", descriptor = "Lclient!mc;")
	private final Class185 aClass185_5 = new Class185();

	@OriginalMember(owner = "client!fs", name = "w", descriptor = "Lclient!mc;")
	private final Class185 aClass185_6 = new Class185();

	@OriginalMember(owner = "client!fs", name = "y", descriptor = "Lclient!ps;")
	private final Class2_Sub29 aClass2_Sub29_3 = new Class2_Sub29(4);

	@OriginalMember(owner = "client!fs", name = "B", descriptor = "B")
	private byte aByte39 = 0;

	@OriginalMember(owner = "client!fs", name = "E", descriptor = "I")
	public volatile int anInt2646 = 0;

	@OriginalMember(owner = "client!fs", name = "D", descriptor = "I")
	public volatile int anInt2645 = 0;

	@OriginalMember(owner = "client!fs", name = "C", descriptor = "Lclient!ps;")
	private final Class2_Sub29 aClass2_Sub29_4 = new Class2_Sub29(8);

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(I)V")
	public void method2487() {
		if (this.aClass31_4 != null) {
			this.aClass31_4.method959();
		}
	}

	@OriginalMember(owner = "client!fs", name = "b", descriptor = "(I)I")
	public int method2489() {
		return this.aClass185_3.method4620() + this.aClass185_4.method4620();
	}

	@OriginalMember(owner = "client!fs", name = "c", descriptor = "(I)Z")
	public boolean method2490() {
		return this.method2494() >= 20;
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(IZLclient!caa;)V")
	public void method2491(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class31 arg1) {
		if (this.aClass31_4 != null) {
			try {
				this.aClass31_4.method959();
			} catch (@Pc(10) Exception local10) {
			}
			this.aClass31_4 = null;
		}
		this.aClass31_4 = arg1;
		this.method2497();
		this.method2498(arg0);
		this.aClass2_Sub29_4.anInt6132 = 0;
		this.aClass2_Sub13_Sub2_Sub2_1 = null;
		while (true) {
			@Pc(40) Class2_Sub13_Sub2_Sub2 local40 = (Class2_Sub13_Sub2_Sub2) this.aClass185_4.method4622();
			if (local40 == null) {
				while (true) {
					local40 = (Class2_Sub13_Sub2_Sub2) this.aClass185_6.method4622();
					if (local40 == null) {
						if (this.aByte39 != 0) {
							try {
								this.aClass2_Sub29_3.anInt6132 = 0;
								this.aClass2_Sub29_3.method5172(4);
								this.aClass2_Sub29_3.method5172(this.aByte39);
								this.aClass2_Sub29_3.method5217(0);
								this.aClass31_4.method950(4, this.aClass2_Sub29_3.aByteArray96);
							} catch (@Pc(103) IOException local103) {
								try {
									this.aClass31_4.method959();
								} catch (@Pc(109) Exception local109) {
								}
								this.anInt2646++;
								this.aClass31_4 = null;
								this.anInt2645 = -2;
							}
						}
						this.anInt2644 = 0;
						this.aLong75 = Static143.method2502();
						return;
					}
					this.aClass185_5.method4621(local40);
				}
			}
			this.aClass185_3.method4621(local40);
		}
	}

	@OriginalMember(owner = "client!fs", name = "d", descriptor = "(I)V")
	public void method2492() {
		if (this.aClass31_4 != null) {
			this.aClass31_4.method949();
		}
	}

	@OriginalMember(owner = "client!fs", name = "b", descriptor = "(Z)V")
	public void method2493() {
		if (this.aClass31_4 == null) {
			return;
		}
		try {
			this.aClass2_Sub29_3.anInt6132 = 0;
			this.aClass2_Sub29_3.method5172(7);
			this.aClass2_Sub29_3.method5178(0);
			this.aClass31_4.method950(4, this.aClass2_Sub29_3.aByteArray96);
		} catch (@Pc(32) IOException local32) {
			try {
				this.aClass31_4.method959();
			} catch (@Pc(38) Exception local38) {
			}
			this.anInt2645 = -2;
			this.aClass31_4 = null;
			this.anInt2646++;
		}
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(B)I")
	private int method2494() {
		return this.aClass185_5.method4620() + this.aClass185_6.method4620();
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(IBZIB)Lclient!paa;")
	public Class2_Sub13_Sub2_Sub2 method2495(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3) {
		@Pc(18) long local18 = (long) ((arg3 << 16) + arg0);
		@Pc(22) Class2_Sub13_Sub2_Sub2 local22 = new Class2_Sub13_Sub2_Sub2();
		local22.aLong230 = local18;
		local22.aBoolean515 = arg2;
		local22.aByte88 = arg1;
		if (arg2) {
			if (this.method2489() >= 20) {
				throw new RuntimeException();
			}
			this.aClass185_3.method4621(local22);
		} else if (this.method2494() < 20) {
			this.aClass185_5.method4621(local22);
		} else {
			throw new RuntimeException();
		}
		return local22;
	}

	@OriginalMember(owner = "client!fs", name = "c", descriptor = "(B)V")
	private void method2497() {
		if (this.aClass31_4 == null) {
			return;
		}
		try {
			this.aClass2_Sub29_3.anInt6132 = 0;
			this.aClass2_Sub29_3.method5172(6);
			this.aClass2_Sub29_3.method5178(3);
			this.aClass31_4.method950(4, this.aClass2_Sub29_3.aByteArray96);
		} catch (@Pc(41) IOException local41) {
			try {
				this.aClass31_4.method959();
			} catch (@Pc(47) Exception local47) {
			}
			this.anInt2646++;
			this.anInt2645 = -2;
			this.aClass31_4 = null;
		}
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(IZ)V")
	public void method2498(@OriginalArg(1) boolean arg0) {
		if (this.aClass31_4 == null) {
			return;
		}
		try {
			this.aClass2_Sub29_3.anInt6132 = 0;
			this.aClass2_Sub29_3.method5172(arg0 ? 2 : 3);
			this.aClass2_Sub29_3.method5178(0);
			this.aClass31_4.method950(4, this.aClass2_Sub29_3.aByteArray96);
		} catch (@Pc(38) IOException local38) {
			try {
				this.aClass31_4.method959();
			} catch (@Pc(44) Exception local44) {
			}
			this.anInt2645 = -2;
			this.anInt2646++;
			this.aClass31_4 = null;
		}
	}

	@OriginalMember(owner = "client!fs", name = "c", descriptor = "(Z)Z")
	public boolean method2499() {
		@Pc(18) int local18;
		if (this.aClass31_4 != null) {
			@Pc(11) long local11 = Static143.method2502();
			local18 = (int) (local11 - this.aLong75);
			this.aLong75 = local11;
			if (local18 > 200) {
				local18 = 200;
			}
			this.anInt2644 += local18;
			if (this.anInt2644 > 30000) {
				try {
					this.aClass31_4.method959();
				} catch (@Pc(42) Exception local42) {
				}
				this.aClass31_4 = null;
			}
		}
		if (this.aClass31_4 == null) {
			return this.method2489() == 0 && this.method2494() == 0;
		}
		try {
			this.aClass31_4.method958();
			for (@Pc(78) Class2_Sub13_Sub2_Sub2 local78 = (Class2_Sub13_Sub2_Sub2) this.aClass185_3.method4623(); local78 != null; local78 = (Class2_Sub13_Sub2_Sub2) this.aClass185_3.method4617()) {
				this.aClass2_Sub29_3.anInt6132 = 0;
				this.aClass2_Sub29_3.method5172(1);
				this.aClass2_Sub29_3.method5178((int) local78.aLong230);
				this.aClass31_4.method950(4, this.aClass2_Sub29_3.aByteArray96);
				this.aClass185_4.method4621(local78);
			}
			for (@Pc(128) Class2_Sub13_Sub2_Sub2 local128 = (Class2_Sub13_Sub2_Sub2) this.aClass185_5.method4623(); local128 != null; local128 = (Class2_Sub13_Sub2_Sub2) this.aClass185_5.method4617()) {
				this.aClass2_Sub29_3.anInt6132 = 0;
				this.aClass2_Sub29_3.method5172(0);
				this.aClass2_Sub29_3.method5178((int) local128.aLong230);
				this.aClass31_4.method950(4, this.aClass2_Sub29_3.aByteArray96);
				this.aClass185_6.method4621(local128);
			}
			for (local18 = 0; local18 < 100; local18++) {
				@Pc(177) int local177 = this.aClass31_4.method952();
				if (local177 < 0) {
					throw new IOException();
				}
				if (local177 == 0) {
					break;
				}
				this.anInt2644 = 0;
				@Pc(193) byte local193 = 0;
				if (this.aClass2_Sub13_Sub2_Sub2_1 == null) {
					local193 = 8;
				} else if (this.aClass2_Sub13_Sub2_Sub2_1.anInt6823 == 0) {
					local193 = 1;
				}
				@Pc(217) int local217;
				@Pc(245) int local245;
				@Pc(306) int local306;
				if (local193 > 0) {
					local217 = local193 - this.aClass2_Sub29_4.anInt6132;
					if (local217 > local177) {
						local217 = local177;
					}
					this.aClass31_4.method954(this.aClass2_Sub29_4.aByteArray96, this.aClass2_Sub29_4.anInt6132, local217);
					if (this.aByte39 != 0) {
						for (local245 = 0; local245 < local217; local245++) {
							this.aClass2_Sub29_4.aByteArray96[local245 + this.aClass2_Sub29_4.anInt6132] ^= this.aByte39;
						}
					}
					this.aClass2_Sub29_4.anInt6132 += local217;
					if (local193 <= this.aClass2_Sub29_4.anInt6132) {
						if (this.aClass2_Sub13_Sub2_Sub2_1 == null) {
							this.aClass2_Sub29_4.anInt6132 = 0;
							local245 = this.aClass2_Sub29_4.method5170();
							local306 = this.aClass2_Sub29_4.method5229();
							@Pc(311) int local311 = this.aClass2_Sub29_4.method5170();
							@Pc(316) int local316 = this.aClass2_Sub29_4.method5198();
							@Pc(320) int local320 = local311 & 0x7F;
							@Pc(331) boolean local331 = (local311 & 0x80) != 0;
							@Pc(338) long local338 = (long) (local306 + (local245 << 16));
							@Pc(348) Class2_Sub13_Sub2_Sub2 local348;
							if (local331) {
								for (local348 = (Class2_Sub13_Sub2_Sub2) this.aClass185_6.method4623(); local348 != null && local338 != local348.aLong230; local348 = (Class2_Sub13_Sub2_Sub2) this.aClass185_6.method4617()) {
								}
							} else {
								for (local348 = (Class2_Sub13_Sub2_Sub2) this.aClass185_4.method4623(); local348 != null && local338 != local348.aLong230; local348 = (Class2_Sub13_Sub2_Sub2) this.aClass185_4.method4617()) {
								}
							}
							if (local348 == null) {
								throw new IOException();
							}
							@Pc(405) int local405 = local320 == 0 ? 5 : 9;
							this.aClass2_Sub13_Sub2_Sub2_1 = local348;
							this.aClass2_Sub13_Sub2_Sub2_1.aClass2_Sub29_7 = new Class2_Sub29(this.aClass2_Sub13_Sub2_Sub2_1.aByte88 + local405 + local316);
							this.aClass2_Sub13_Sub2_Sub2_1.aClass2_Sub29_7.method5172(local320);
							this.aClass2_Sub13_Sub2_Sub2_1.aClass2_Sub29_7.method5185(local316);
							this.aClass2_Sub29_4.anInt6132 = 0;
							this.aClass2_Sub13_Sub2_Sub2_1.anInt6823 = 8;
						} else if (this.aClass2_Sub13_Sub2_Sub2_1.anInt6823 != 0) {
							throw new IOException();
						} else if (this.aClass2_Sub29_4.aByteArray96[0] == -1) {
							this.aClass2_Sub29_4.anInt6132 = 0;
							this.aClass2_Sub13_Sub2_Sub2_1.anInt6823 = 1;
						} else {
							this.aClass2_Sub13_Sub2_Sub2_1 = null;
						}
					}
				} else {
					local217 = this.aClass2_Sub13_Sub2_Sub2_1.aClass2_Sub29_7.aByteArray96.length - this.aClass2_Sub13_Sub2_Sub2_1.aByte88;
					local245 = 512 - this.aClass2_Sub13_Sub2_Sub2_1.anInt6823;
					if (local217 - this.aClass2_Sub13_Sub2_Sub2_1.aClass2_Sub29_7.anInt6132 < local245) {
						local245 = local217 - this.aClass2_Sub13_Sub2_Sub2_1.aClass2_Sub29_7.anInt6132;
					}
					if (local245 > local177) {
						local245 = local177;
					}
					this.aClass31_4.method954(this.aClass2_Sub13_Sub2_Sub2_1.aClass2_Sub29_7.aByteArray96, this.aClass2_Sub13_Sub2_Sub2_1.aClass2_Sub29_7.anInt6132, local245);
					if (this.aByte39 != 0) {
						for (local306 = 0; local306 < local245; local306++) {
							this.aClass2_Sub13_Sub2_Sub2_1.aClass2_Sub29_7.aByteArray96[local306 + this.aClass2_Sub13_Sub2_Sub2_1.aClass2_Sub29_7.anInt6132] ^= this.aByte39;
						}
					}
					this.aClass2_Sub13_Sub2_Sub2_1.aClass2_Sub29_7.anInt6132 += local245;
					this.aClass2_Sub13_Sub2_Sub2_1.anInt6823 += local245;
					if (local217 == this.aClass2_Sub13_Sub2_Sub2_1.aClass2_Sub29_7.anInt6132) {
						this.aClass2_Sub13_Sub2_Sub2_1.method7527();
						this.aClass2_Sub13_Sub2_Sub2_1.aBoolean514 = false;
						this.aClass2_Sub13_Sub2_Sub2_1 = null;
					} else if (this.aClass2_Sub13_Sub2_Sub2_1.anInt6823 == 512) {
						this.aClass2_Sub13_Sub2_Sub2_1.anInt6823 = 0;
					}
				}
			}
			return true;
		} catch (@Pc(626) IOException local626) {
			try {
				this.aClass31_4.method959();
			} catch (@Pc(632) Exception local632) {
			}
			this.aClass31_4 = null;
			this.anInt2645 = -2;
			this.anInt2646++;
			return this.method2489() == 0 && this.method2494() == 0;
		}
	}

	@OriginalMember(owner = "client!fs", name = "d", descriptor = "(Z)V")
	public void method2500() {
		try {
			this.aClass31_4.method959();
		} catch (@Pc(11) Exception local11) {
		}
		this.aByte39 = (byte) (Math.random() * 255.0D + 1.0D);
		this.aClass31_4 = null;
		this.anInt2645 = -1;
		this.anInt2646++;
	}

	@OriginalMember(owner = "client!fs", name = "e", descriptor = "(Z)Z")
	public boolean method2501() {
		return this.method2489() >= 20;
	}
}
