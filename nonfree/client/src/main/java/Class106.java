import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ii")
public final class Class106 {

	@OriginalMember(owner = "client!ii", name = "B", descriptor = "I")
	private int anInt2887;

	@OriginalMember(owner = "client!ii", name = "C", descriptor = "Lclient!tc;")
	private Class221 aClass221_3;

	@OriginalMember(owner = "client!ii", name = "F", descriptor = "J")
	private long aLong100;

	@OriginalMember(owner = "client!ii", name = "K", descriptor = "Lclient!gq;")
	private Class2_Sub10_Sub9_Sub1 aClass2_Sub10_Sub9_Sub1_1;

	@OriginalMember(owner = "client!ii", name = "l", descriptor = "Lclient!go;")
	private final Class87 aClass87_5 = new Class87();

	@OriginalMember(owner = "client!ii", name = "x", descriptor = "Lclient!go;")
	private final Class87 aClass87_6 = new Class87();

	@OriginalMember(owner = "client!ii", name = "y", descriptor = "Lclient!go;")
	private final Class87 aClass87_7 = new Class87();

	@OriginalMember(owner = "client!ii", name = "z", descriptor = "Lclient!go;")
	private final Class87 aClass87_8 = new Class87();

	@OriginalMember(owner = "client!ii", name = "D", descriptor = "Lclient!kk;")
	private final Class2_Sub16 aClass2_Sub16_5 = new Class2_Sub16(4);

	@OriginalMember(owner = "client!ii", name = "I", descriptor = "I")
	public volatile int anInt2889 = 0;

	@OriginalMember(owner = "client!ii", name = "J", descriptor = "B")
	private byte aByte28 = 0;

	@OriginalMember(owner = "client!ii", name = "H", descriptor = "I")
	public volatile int anInt2888 = 0;

	@OriginalMember(owner = "client!ii", name = "G", descriptor = "Lclient!kk;")
	private final Class2_Sub16 aClass2_Sub16_6 = new Class2_Sub16(8);

	@OriginalMember(owner = "client!ii", name = "b", descriptor = "(I)V")
	public void method2687() {
		try {
			this.aClass221_3.method4801();
		} catch (@Pc(9) Exception local9) {
		}
		this.anInt2888 = -1;
		this.aByte28 = (byte) (Math.random() * 255.0D + 1.0D);
		this.aClass221_3 = null;
		this.anInt2889++;
	}

	@OriginalMember(owner = "client!ii", name = "c", descriptor = "(I)V")
	public void method2689() {
		if (this.aClass221_3 != null) {
			this.aClass221_3.method4801();
		}
	}

	@OriginalMember(owner = "client!ii", name = "d", descriptor = "(I)Z")
	public boolean method2690() {
		return this.method2692() >= 20;
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(IZIIB)Lclient!gq;")
	public Class2_Sub10_Sub9_Sub1 method2691(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) byte arg3) {
		@Pc(10) long local10 = (long) ((arg1 << 16) + arg2);
		@Pc(14) Class2_Sub10_Sub9_Sub1 local14 = new Class2_Sub10_Sub9_Sub1();
		local14.aBoolean365 = arg0;
		local14.aByte24 = arg3;
		local14.aLong206 = local10;
		if (arg0) {
			if (this.method2692() >= 20) {
				throw new RuntimeException();
			}
			this.aClass87_5.method2360(local14);
		} else if (this.method2694() < 20) {
			this.aClass87_7.method2360(local14);
		} else {
			throw new RuntimeException();
		}
		return local14;
	}

	@OriginalMember(owner = "client!ii", name = "e", descriptor = "(I)I")
	public int method2692() {
		return this.aClass87_5.method2356() + this.aClass87_6.method2356();
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(ZI)V")
	public void method2693(@OriginalArg(0) boolean arg0) {
		if (this.aClass221_3 == null) {
			return;
		}
		try {
			this.aClass2_Sub16_5.anInt6145 = 0;
			this.aClass2_Sub16_5.method5358(arg0 ? 2 : 3);
			this.aClass2_Sub16_5.method5320(0);
			this.aClass221_3.method4796(this.aClass2_Sub16_5.aByteArray112, 4);
		} catch (@Pc(36) IOException local36) {
			try {
				this.aClass221_3.method4801();
			} catch (@Pc(42) Exception local42) {
			}
			this.anInt2889++;
			this.anInt2888 = -2;
			this.aClass221_3 = null;
		}
	}

	@OriginalMember(owner = "client!ii", name = "f", descriptor = "(I)I")
	private int method2694() {
		return this.aClass87_7.method2356() + this.aClass87_8.method2356();
	}

	@OriginalMember(owner = "client!ii", name = "g", descriptor = "(I)V")
	public void method2695() {
		if (this.aClass221_3 != null) {
			this.aClass221_3.method4797();
		}
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(Z)V")
	private void method2696() {
		if (this.aClass221_3 == null) {
			return;
		}
		try {
			this.aClass2_Sub16_5.anInt6145 = 0;
			this.aClass2_Sub16_5.method5358(6);
			this.aClass2_Sub16_5.method5320(3);
			this.aClass221_3.method4796(this.aClass2_Sub16_5.aByteArray112, 4);
		} catch (@Pc(38) IOException local38) {
			try {
				this.aClass221_3.method4801();
			} catch (@Pc(44) Exception local44) {
			}
			this.aClass221_3 = null;
			this.anInt2888 = -2;
			this.anInt2889++;
		}
	}

	@OriginalMember(owner = "client!ii", name = "h", descriptor = "(I)V")
	public void method2697() {
		if (this.aClass221_3 == null) {
			return;
		}
		try {
			this.aClass2_Sub16_5.anInt6145 = 0;
			this.aClass2_Sub16_5.method5358(7);
			this.aClass2_Sub16_5.method5320(0);
			this.aClass221_3.method4796(this.aClass2_Sub16_5.aByteArray112, 4);
		} catch (@Pc(32) IOException local32) {
			try {
				this.aClass221_3.method4801();
			} catch (@Pc(38) Exception local38) {
			}
			this.aClass221_3 = null;
			this.anInt2889++;
			this.anInt2888 = -2;
		}
	}

	@OriginalMember(owner = "client!ii", name = "b", descriptor = "(Z)Z")
	public boolean method2698() {
		@Pc(18) int local18;
		if (this.aClass221_3 != null) {
			@Pc(11) long local11 = Static39.method699();
			local18 = (int) (local11 - this.aLong100);
			if (local18 > 200) {
				local18 = 200;
			}
			this.aLong100 = local11;
			this.anInt2887 += local18;
			if (this.anInt2887 > 30000) {
				try {
					this.aClass221_3.method4801();
				} catch (@Pc(46) Exception local46) {
				}
				this.aClass221_3 = null;
			}
		}
		if (this.aClass221_3 == null) {
			return this.method2692() == 0 && this.method2694() == 0;
		}
		try {
			this.aClass221_3.method4791();
			for (@Pc(77) Class2_Sub10_Sub9_Sub1 local77 = (Class2_Sub10_Sub9_Sub1) this.aClass87_5.method2353(); local77 != null; local77 = (Class2_Sub10_Sub9_Sub1) this.aClass87_5.method2352()) {
				this.aClass2_Sub16_5.anInt6145 = 0;
				this.aClass2_Sub16_5.method5358(1);
				this.aClass2_Sub16_5.method5320((int) local77.aLong206);
				this.aClass221_3.method4796(this.aClass2_Sub16_5.aByteArray112, 4);
				this.aClass87_6.method2360(local77);
			}
			for (@Pc(126) Class2_Sub10_Sub9_Sub1 local126 = (Class2_Sub10_Sub9_Sub1) this.aClass87_7.method2353(); local126 != null; local126 = (Class2_Sub10_Sub9_Sub1) this.aClass87_7.method2352()) {
				this.aClass2_Sub16_5.anInt6145 = 0;
				this.aClass2_Sub16_5.method5358(0);
				this.aClass2_Sub16_5.method5320((int) local126.aLong206);
				this.aClass221_3.method4796(this.aClass2_Sub16_5.aByteArray112, 4);
				this.aClass87_8.method2360(local126);
			}
			for (local18 = 0; local18 < 100; local18++) {
				@Pc(175) int local175 = this.aClass221_3.method4795();
				if (local175 < 0) {
					throw new IOException();
				}
				if (local175 == 0) {
					break;
				}
				this.anInt2887 = 0;
				@Pc(191) byte local191 = 0;
				if (this.aClass2_Sub10_Sub9_Sub1_1 == null) {
					local191 = 8;
				} else if (this.aClass2_Sub10_Sub9_Sub1_1.anInt2494 == 0) {
					local191 = 1;
				}
				@Pc(216) int local216;
				@Pc(244) int local244;
				@Pc(305) int local305;
				if (local191 > 0) {
					local216 = local191 - this.aClass2_Sub16_6.anInt6145;
					if (local175 < local216) {
						local216 = local175;
					}
					this.aClass221_3.method4800(this.aClass2_Sub16_6.anInt6145, local216, this.aClass2_Sub16_6.aByteArray112);
					if (this.aByte28 != 0) {
						for (local244 = 0; local244 < local216; local244++) {
							this.aClass2_Sub16_6.aByteArray112[local244 + this.aClass2_Sub16_6.anInt6145] ^= this.aByte28;
						}
					}
					this.aClass2_Sub16_6.anInt6145 += local216;
					if (local191 <= this.aClass2_Sub16_6.anInt6145) {
						if (this.aClass2_Sub10_Sub9_Sub1_1 == null) {
							this.aClass2_Sub16_6.anInt6145 = 0;
							local244 = this.aClass2_Sub16_6.method5350();
							local305 = this.aClass2_Sub16_6.method5312();
							@Pc(310) int local310 = this.aClass2_Sub16_6.method5350();
							@Pc(315) int local315 = this.aClass2_Sub16_6.method5346();
							@Pc(319) int local319 = local310 & 0x7F;
							@Pc(327) boolean local327 = (local310 & 0x80) != 0;
							@Pc(334) long local334 = (long) ((local244 << 16) + local305);
							@Pc(344) Class2_Sub10_Sub9_Sub1 local344;
							if (local327) {
								for (local344 = (Class2_Sub10_Sub9_Sub1) this.aClass87_8.method2353(); local344 != null && local344.aLong206 != local334; local344 = (Class2_Sub10_Sub9_Sub1) this.aClass87_8.method2352()) {
								}
							} else {
								for (local344 = (Class2_Sub10_Sub9_Sub1) this.aClass87_6.method2353(); local344 != null && local344.aLong206 != local334; local344 = (Class2_Sub10_Sub9_Sub1) this.aClass87_6.method2352()) {
								}
							}
							if (local344 == null) {
								throw new IOException();
							}
							@Pc(405) int local405 = local319 == 0 ? 5 : 9;
							this.aClass2_Sub10_Sub9_Sub1_1 = local344;
							this.aClass2_Sub10_Sub9_Sub1_1.aClass2_Sub16_4 = new Class2_Sub16(local405 + local315 + this.aClass2_Sub10_Sub9_Sub1_1.aByte24);
							this.aClass2_Sub10_Sub9_Sub1_1.aClass2_Sub16_4.method5358(local319);
							this.aClass2_Sub10_Sub9_Sub1_1.aClass2_Sub16_4.method5355(local315);
							this.aClass2_Sub10_Sub9_Sub1_1.anInt2494 = 8;
							this.aClass2_Sub16_6.anInt6145 = 0;
						} else if (this.aClass2_Sub10_Sub9_Sub1_1.anInt2494 != 0) {
							throw new IOException();
						} else if (this.aClass2_Sub16_6.aByteArray112[0] == -1) {
							this.aClass2_Sub10_Sub9_Sub1_1.anInt2494 = 1;
							this.aClass2_Sub16_6.anInt6145 = 0;
						} else {
							this.aClass2_Sub10_Sub9_Sub1_1 = null;
						}
					}
				} else {
					local216 = this.aClass2_Sub10_Sub9_Sub1_1.aClass2_Sub16_4.aByteArray112.length - this.aClass2_Sub10_Sub9_Sub1_1.aByte24;
					local244 = 512 - this.aClass2_Sub10_Sub9_Sub1_1.anInt2494;
					if (local216 - this.aClass2_Sub10_Sub9_Sub1_1.aClass2_Sub16_4.anInt6145 < local244) {
						local244 = local216 - this.aClass2_Sub10_Sub9_Sub1_1.aClass2_Sub16_4.anInt6145;
					}
					if (local244 > local175) {
						local244 = local175;
					}
					this.aClass221_3.method4800(this.aClass2_Sub10_Sub9_Sub1_1.aClass2_Sub16_4.anInt6145, local244, this.aClass2_Sub10_Sub9_Sub1_1.aClass2_Sub16_4.aByteArray112);
					if (this.aByte28 != 0) {
						for (local305 = 0; local305 < local244; local305++) {
							this.aClass2_Sub10_Sub9_Sub1_1.aClass2_Sub16_4.aByteArray112[local305 + this.aClass2_Sub10_Sub9_Sub1_1.aClass2_Sub16_4.anInt6145] ^= this.aByte28;
						}
					}
					this.aClass2_Sub10_Sub9_Sub1_1.anInt2494 += local244;
					this.aClass2_Sub10_Sub9_Sub1_1.aClass2_Sub16_4.anInt6145 += local244;
					if (local216 == this.aClass2_Sub10_Sub9_Sub1_1.aClass2_Sub16_4.anInt6145) {
						this.aClass2_Sub10_Sub9_Sub1_1.method5572();
						this.aClass2_Sub10_Sub9_Sub1_1.aBoolean362 = false;
						this.aClass2_Sub10_Sub9_Sub1_1 = null;
					} else if (this.aClass2_Sub10_Sub9_Sub1_1.anInt2494 == 512) {
						this.aClass2_Sub10_Sub9_Sub1_1.anInt2494 = 0;
					}
				}
			}
			return true;
		} catch (@Pc(627) IOException local627) {
			try {
				this.aClass221_3.method4801();
			} catch (@Pc(637) Exception local637) {
			}
			this.aClass221_3 = null;
			this.anInt2889++;
			this.anInt2888 = -2;
			return this.method2692() == 0 && this.method2694() == 0;
		}
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(Lclient!tc;ZI)V")
	public void method2699(@OriginalArg(0) Class221 arg0, @OriginalArg(1) boolean arg1) {
		if (this.aClass221_3 != null) {
			try {
				this.aClass221_3.method4801();
			} catch (@Pc(14) Exception local14) {
			}
			this.aClass221_3 = null;
		}
		this.aClass221_3 = arg0;
		this.method2696();
		this.method2693(arg1);
		this.aClass2_Sub16_6.anInt6145 = 0;
		this.aClass2_Sub10_Sub9_Sub1_1 = null;
		while (true) {
			@Pc(48) Class2_Sub10_Sub9_Sub1 local48 = (Class2_Sub10_Sub9_Sub1) this.aClass87_6.method2359();
			if (local48 == null) {
				while (true) {
					local48 = (Class2_Sub10_Sub9_Sub1) this.aClass87_8.method2359();
					if (local48 == null) {
						if (this.aByte28 != 0) {
							try {
								this.aClass2_Sub16_5.anInt6145 = 0;
								this.aClass2_Sub16_5.method5358(4);
								this.aClass2_Sub16_5.method5358(this.aByte28);
								this.aClass2_Sub16_5.method5351(0);
								this.aClass221_3.method4796(this.aClass2_Sub16_5.aByteArray112, 4);
							} catch (@Pc(106) IOException local106) {
								try {
									this.aClass221_3.method4801();
								} catch (@Pc(112) Exception local112) {
								}
								this.aClass221_3 = null;
								this.anInt2889++;
								this.anInt2888 = -2;
							}
						}
						this.anInt2887 = 0;
						this.aLong100 = Static39.method699();
						return;
					}
					this.aClass87_7.method2360(local48);
				}
			}
			this.aClass87_5.method2360(local48);
		}
	}

	@OriginalMember(owner = "client!ii", name = "i", descriptor = "(I)Z")
	public boolean method2701() {
		return this.method2694() >= 20;
	}
}
