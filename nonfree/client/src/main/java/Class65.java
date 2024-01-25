import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dm")
public final class Class65 {

	@OriginalMember(owner = "client!dm", name = "w", descriptor = "J")
	private long aLong54;

	@OriginalMember(owner = "client!dm", name = "x", descriptor = "I")
	private int anInt2590;

	@OriginalMember(owner = "client!dm", name = "z", descriptor = "Lclient!se;")
	private Class303 aClass303_1;

	@OriginalMember(owner = "client!dm", name = "E", descriptor = "Lclient!me;")
	private Class3_Sub1_Sub3_Sub1 aClass3_Sub1_Sub3_Sub1_1;

	@OriginalMember(owner = "client!dm", name = "p", descriptor = "Lclient!bj;")
	private final Class30 aClass30_1 = new Class30();

	@OriginalMember(owner = "client!dm", name = "t", descriptor = "Lclient!bj;")
	private final Class30 aClass30_2 = new Class30();

	@OriginalMember(owner = "client!dm", name = "u", descriptor = "Lclient!bj;")
	private final Class30 aClass30_3 = new Class30();

	@OriginalMember(owner = "client!dm", name = "v", descriptor = "Lclient!bj;")
	private final Class30 aClass30_4 = new Class30();

	@OriginalMember(owner = "client!dm", name = "y", descriptor = "Lclient!tn;")
	private final Class3_Sub15 aClass3_Sub15_1 = new Class3_Sub15(4);

	@OriginalMember(owner = "client!dm", name = "A", descriptor = "I")
	public volatile int anInt2591 = 0;

	@OriginalMember(owner = "client!dm", name = "C", descriptor = "I")
	public volatile int anInt2592 = 0;

	@OriginalMember(owner = "client!dm", name = "D", descriptor = "B")
	private byte aByte18 = 0;

	@OriginalMember(owner = "client!dm", name = "B", descriptor = "Lclient!tn;")
	private final Class3_Sub15 aClass3_Sub15_2 = new Class3_Sub15(8);

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(I)V")
	public void method2516() {
		try {
			this.aClass303_1.method7406();
		} catch (@Pc(9) Exception local9) {
		}
		this.anInt2591++;
		this.aClass303_1 = null;
		this.aByte18 = (byte) (Math.random() * 255.0D + 1.0D);
		this.anInt2592 = -1;
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(Z)Z")
	public boolean method2517() {
		@Pc(14) int local14;
		if (this.aClass303_1 != null) {
			@Pc(7) long local7 = Static444.method6719();
			local14 = (int) (local7 - this.aLong54);
			if (local14 > 200) {
				local14 = 200;
			}
			this.aLong54 = local7;
			this.anInt2590 += local14;
			if (this.anInt2590 > 30000) {
				try {
					this.aClass303_1.method7406();
				} catch (@Pc(44) Exception local44) {
				}
				this.aClass303_1 = null;
			}
		}
		if (this.aClass303_1 == null) {
			return this.method2519() == 0 && this.method2520() == 0;
		}
		try {
			this.aClass303_1.method7396();
			for (@Pc(79) Class3_Sub1_Sub3_Sub1 local79 = (Class3_Sub1_Sub3_Sub1) this.aClass30_1.method780(); local79 != null; local79 = (Class3_Sub1_Sub3_Sub1) this.aClass30_1.method783()) {
				this.aClass3_Sub15_1.anInt10282 = 0;
				this.aClass3_Sub15_1.method8448(1);
				this.aClass3_Sub15_1.method8436((int) local79.aLong275);
				this.aClass303_1.method7404(this.aClass3_Sub15_1.aByteArray106, 4);
				this.aClass30_2.method779(local79);
			}
			for (@Pc(125) Class3_Sub1_Sub3_Sub1 local125 = (Class3_Sub1_Sub3_Sub1) this.aClass30_3.method780(); local125 != null; local125 = (Class3_Sub1_Sub3_Sub1) this.aClass30_3.method783()) {
				this.aClass3_Sub15_1.anInt10282 = 0;
				this.aClass3_Sub15_1.method8448(0);
				this.aClass3_Sub15_1.method8436((int) local125.aLong275);
				this.aClass303_1.method7404(this.aClass3_Sub15_1.aByteArray106, 4);
				this.aClass30_4.method779(local125);
			}
			for (local14 = 0; local14 < 100; local14++) {
				@Pc(179) int local179 = this.aClass303_1.method7400();
				if (local179 < 0) {
					throw new IOException();
				}
				if (local179 == 0) {
					break;
				}
				this.anInt2590 = 0;
				@Pc(195) byte local195 = 0;
				if (this.aClass3_Sub1_Sub3_Sub1_1 == null) {
					local195 = 8;
				} else if (this.aClass3_Sub1_Sub3_Sub1_1.anInt6711 == 0) {
					local195 = 1;
				}
				@Pc(220) int local220;
				@Pc(248) int local248;
				@Pc(309) int local309;
				if (local195 > 0) {
					local220 = local195 - this.aClass3_Sub15_2.anInt10282;
					if (local220 > local179) {
						local220 = local179;
					}
					this.aClass303_1.method7399(local220, this.aClass3_Sub15_2.anInt10282, this.aClass3_Sub15_2.aByteArray106);
					if (this.aByte18 != 0) {
						for (local248 = 0; local248 < local220; local248++) {
							this.aClass3_Sub15_2.aByteArray106[this.aClass3_Sub15_2.anInt10282 + local248] ^= this.aByte18;
						}
					}
					this.aClass3_Sub15_2.anInt10282 += local220;
					if (this.aClass3_Sub15_2.anInt10282 >= local195) {
						if (this.aClass3_Sub1_Sub3_Sub1_1 == null) {
							this.aClass3_Sub15_2.anInt10282 = 0;
							local248 = this.aClass3_Sub15_2.method8401();
							local309 = this.aClass3_Sub15_2.method8414();
							@Pc(314) int local314 = this.aClass3_Sub15_2.method8401();
							@Pc(319) int local319 = this.aClass3_Sub15_2.method8402();
							@Pc(323) int local323 = local314 & 0x7F;
							@Pc(334) boolean local334 = (local314 & 0x80) != 0;
							@Pc(341) long local341 = (long) (local309 + (local248 << 16));
							@Pc(351) Class3_Sub1_Sub3_Sub1 local351;
							if (local334) {
								for (local351 = (Class3_Sub1_Sub3_Sub1) this.aClass30_4.method780(); local351 != null && local351.aLong275 != local341; local351 = (Class3_Sub1_Sub3_Sub1) this.aClass30_4.method783()) {
								}
							} else {
								for (local351 = (Class3_Sub1_Sub3_Sub1) this.aClass30_2.method780(); local351 != null && local341 != local351.aLong275; local351 = (Class3_Sub1_Sub3_Sub1) this.aClass30_2.method783()) {
								}
							}
							if (local351 == null) {
								throw new IOException();
							}
							@Pc(407) int local407 = local323 == 0 ? 5 : 9;
							this.aClass3_Sub1_Sub3_Sub1_1 = local351;
							this.aClass3_Sub1_Sub3_Sub1_1.aClass3_Sub15_6 = new Class3_Sub15(this.aClass3_Sub1_Sub3_Sub1_1.aByte89 + local407 + local319);
							this.aClass3_Sub1_Sub3_Sub1_1.aClass3_Sub15_6.method8448(local323);
							this.aClass3_Sub1_Sub3_Sub1_1.aClass3_Sub15_6.method8419(local319);
							this.aClass3_Sub1_Sub3_Sub1_1.anInt6711 = 8;
							this.aClass3_Sub15_2.anInt10282 = 0;
						} else if (this.aClass3_Sub1_Sub3_Sub1_1.anInt6711 != 0) {
							throw new IOException();
						} else if (this.aClass3_Sub15_2.aByteArray106[0] == -1) {
							this.aClass3_Sub1_Sub3_Sub1_1.anInt6711 = 1;
							this.aClass3_Sub15_2.anInt10282 = 0;
						} else {
							this.aClass3_Sub1_Sub3_Sub1_1 = null;
						}
					}
				} else {
					local220 = this.aClass3_Sub1_Sub3_Sub1_1.aClass3_Sub15_6.aByteArray106.length - this.aClass3_Sub1_Sub3_Sub1_1.aByte89;
					local248 = 512 - this.aClass3_Sub1_Sub3_Sub1_1.anInt6711;
					if (local220 - this.aClass3_Sub1_Sub3_Sub1_1.aClass3_Sub15_6.anInt10282 < local248) {
						local248 = local220 - this.aClass3_Sub1_Sub3_Sub1_1.aClass3_Sub15_6.anInt10282;
					}
					if (local179 < local248) {
						local248 = local179;
					}
					this.aClass303_1.method7399(local248, this.aClass3_Sub1_Sub3_Sub1_1.aClass3_Sub15_6.anInt10282, this.aClass3_Sub1_Sub3_Sub1_1.aClass3_Sub15_6.aByteArray106);
					if (this.aByte18 != 0) {
						for (local309 = 0; local309 < local248; local309++) {
							this.aClass3_Sub1_Sub3_Sub1_1.aClass3_Sub15_6.aByteArray106[local309 + this.aClass3_Sub1_Sub3_Sub1_1.aClass3_Sub15_6.anInt10282] ^= this.aByte18;
						}
					}
					this.aClass3_Sub1_Sub3_Sub1_1.anInt6711 += local248;
					this.aClass3_Sub1_Sub3_Sub1_1.aClass3_Sub15_6.anInt10282 += local248;
					if (this.aClass3_Sub1_Sub3_Sub1_1.aClass3_Sub15_6.anInt10282 == local220) {
						this.aClass3_Sub1_Sub3_Sub1_1.method8621();
						this.aClass3_Sub1_Sub3_Sub1_1.aBoolean830 = false;
						this.aClass3_Sub1_Sub3_Sub1_1 = null;
					} else if (this.aClass3_Sub1_Sub3_Sub1_1.anInt6711 == 512) {
						this.aClass3_Sub1_Sub3_Sub1_1.anInt6711 = 0;
					}
				}
			}
			return true;
		} catch (@Pc(628) IOException local628) {
			try {
				this.aClass303_1.method7406();
			} catch (@Pc(634) Exception local634) {
			}
			this.anInt2592 = -2;
			this.aClass303_1 = null;
			this.anInt2591++;
			return this.method2519() == 0 && this.method2520() == 0;
		}
	}

	@OriginalMember(owner = "client!dm", name = "b", descriptor = "(I)Z")
	public boolean method2518() {
		return this.method2520() >= 20;
	}

	@OriginalMember(owner = "client!dm", name = "c", descriptor = "(I)I")
	public int method2519() {
		return this.aClass30_1.method784() + this.aClass30_2.method784();
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(B)I")
	private int method2520() {
		return this.aClass30_3.method784() + this.aClass30_4.method784();
	}

	@OriginalMember(owner = "client!dm", name = "d", descriptor = "(I)V")
	public void method2521() {
		if (this.aClass303_1 != null) {
			this.aClass303_1.method7401();
		}
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(ZB)V")
	public void method2522(@OriginalArg(0) boolean arg0) {
		if (this.aClass303_1 == null) {
			return;
		}
		try {
			this.aClass3_Sub15_1.anInt10282 = 0;
			this.aClass3_Sub15_1.method8448(arg0 ? 2 : 3);
			this.aClass3_Sub15_1.method8436(0);
			this.aClass303_1.method7404(this.aClass3_Sub15_1.aByteArray106, 4);
		} catch (@Pc(44) IOException local44) {
			try {
				this.aClass303_1.method7406();
			} catch (@Pc(50) Exception local50) {
			}
			this.aClass303_1 = null;
			this.anInt2592 = -2;
			this.anInt2591++;
		}
	}

	@OriginalMember(owner = "client!dm", name = "e", descriptor = "(I)Z")
	public boolean method2523() {
		return this.method2519() >= 20;
	}

	@OriginalMember(owner = "client!dm", name = "f", descriptor = "(I)V")
	public void method2524() {
		if (this.aClass303_1 != null) {
			this.aClass303_1.method7406();
		}
	}

	@OriginalMember(owner = "client!dm", name = "g", descriptor = "(I)V")
	private void method2525() {
		if (this.aClass303_1 == null) {
			return;
		}
		try {
			this.aClass3_Sub15_1.anInt10282 = 0;
			this.aClass3_Sub15_1.method8448(6);
			this.aClass3_Sub15_1.method8436(3);
			this.aClass303_1.method7404(this.aClass3_Sub15_1.aByteArray106, 4);
		} catch (@Pc(32) IOException local32) {
			try {
				this.aClass303_1.method7406();
			} catch (@Pc(38) Exception local38) {
			}
			this.anInt2591++;
			this.anInt2592 = -2;
			this.aClass303_1 = null;
		}
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(ZLclient!se;I)V")
	public void method2527(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class303 arg1) {
		if (this.aClass303_1 != null) {
			try {
				this.aClass303_1.method7406();
			} catch (@Pc(20) Exception local20) {
			}
			this.aClass303_1 = null;
		}
		this.aClass303_1 = arg1;
		this.method2525();
		this.method2522(arg0);
		this.aClass3_Sub15_2.anInt10282 = 0;
		this.aClass3_Sub1_Sub3_Sub1_1 = null;
		while (true) {
			@Pc(48) Class3_Sub1_Sub3_Sub1 local48 = (Class3_Sub1_Sub3_Sub1) this.aClass30_2.method781();
			if (local48 == null) {
				while (true) {
					local48 = (Class3_Sub1_Sub3_Sub1) this.aClass30_4.method781();
					if (local48 == null) {
						if (this.aByte18 != 0) {
							try {
								this.aClass3_Sub15_1.anInt10282 = 0;
								this.aClass3_Sub15_1.method8448(4);
								this.aClass3_Sub15_1.method8448(this.aByte18);
								this.aClass3_Sub15_1.method8464(0);
								this.aClass303_1.method7404(this.aClass3_Sub15_1.aByteArray106, 4);
							} catch (@Pc(111) IOException local111) {
								try {
									this.aClass303_1.method7406();
								} catch (@Pc(117) Exception local117) {
								}
								this.aClass303_1 = null;
								this.anInt2592 = -2;
								this.anInt2591++;
							}
						}
						this.anInt2590 = 0;
						this.aLong54 = Static444.method6719();
						return;
					}
					this.aClass30_3.method779(local48);
				}
			}
			this.aClass30_1.method779(local48);
		}
	}

	@OriginalMember(owner = "client!dm", name = "h", descriptor = "(I)V")
	public void method2528() {
		if (this.aClass303_1 == null) {
			return;
		}
		try {
			this.aClass3_Sub15_1.anInt10282 = 0;
			this.aClass3_Sub15_1.method8448(7);
			this.aClass3_Sub15_1.method8436(0);
			this.aClass303_1.method7404(this.aClass3_Sub15_1.aByteArray106, 4);
		} catch (@Pc(40) IOException local40) {
			try {
				this.aClass303_1.method7406();
			} catch (@Pc(46) Exception local46) {
			}
			this.anInt2592 = -2;
			this.aClass303_1 = null;
			this.anInt2591++;
		}
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(IBZII)Lclient!me;")
	public Class3_Sub1_Sub3_Sub1 method2529(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3) {
		@Pc(11) long local11 = (long) ((arg3 << 16) + arg0);
		@Pc(23) Class3_Sub1_Sub3_Sub1 local23 = new Class3_Sub1_Sub3_Sub1();
		local23.aBoolean829 = arg2;
		local23.aLong275 = local11;
		local23.aByte89 = arg1;
		if (arg2) {
			if (this.method2519() >= 20) {
				throw new RuntimeException();
			}
			this.aClass30_1.method779(local23);
		} else if (this.method2520() < 20) {
			this.aClass30_3.method779(local23);
		} else {
			throw new RuntimeException();
		}
		return local23;
	}
}
