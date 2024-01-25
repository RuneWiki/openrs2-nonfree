import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hca")
public final class Class115 {

	@OriginalMember(owner = "client!hca", name = "u", descriptor = "I")
	private int anInt3775;

	@OriginalMember(owner = "client!hca", name = "w", descriptor = "Lclient!de;")
	private Class57 aClass57_3;

	@OriginalMember(owner = "client!hca", name = "x", descriptor = "J")
	private long aLong98;

	@OriginalMember(owner = "client!hca", name = "C", descriptor = "Lclient!ud;")
	private Class1_Sub1_Sub11_Sub2 aClass1_Sub1_Sub11_Sub2_1;

	@OriginalMember(owner = "client!hca", name = "l", descriptor = "Lclient!vm;")
	private final Class307 aClass307_2 = new Class307();

	@OriginalMember(owner = "client!hca", name = "q", descriptor = "Lclient!vm;")
	private final Class307 aClass307_3 = new Class307();

	@OriginalMember(owner = "client!hca", name = "s", descriptor = "Lclient!vm;")
	private final Class307 aClass307_4 = new Class307();

	@OriginalMember(owner = "client!hca", name = "t", descriptor = "Lclient!vm;")
	private final Class307 aClass307_5 = new Class307();

	@OriginalMember(owner = "client!hca", name = "v", descriptor = "Lclient!gw;")
	private final Class1_Sub13 aClass1_Sub13_2 = new Class1_Sub13(4);

	@OriginalMember(owner = "client!hca", name = "z", descriptor = "B")
	private byte aByte30 = 0;

	@OriginalMember(owner = "client!hca", name = "y", descriptor = "I")
	public volatile int anInt3776 = 0;

	@OriginalMember(owner = "client!hca", name = "B", descriptor = "I")
	public volatile int anInt3777 = 0;

	@OriginalMember(owner = "client!hca", name = "A", descriptor = "Lclient!gw;")
	private final Class1_Sub13 aClass1_Sub13_3 = new Class1_Sub13(8);

	@OriginalMember(owner = "client!hca", name = "a", descriptor = "(I)Z")
	public boolean method3353() {
		return this.method3357() >= 20;
	}

	@OriginalMember(owner = "client!hca", name = "a", descriptor = "(Z)Z")
	public boolean method3354() {
		return this.method3358() >= 20;
	}

	@OriginalMember(owner = "client!hca", name = "a", descriptor = "(IIZBI)Lclient!ud;")
	public Class1_Sub1_Sub11_Sub2 method3355(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) byte arg3) {
		@Pc(10) long local10 = (long) (arg0 + (arg1 << 16));
		@Pc(14) Class1_Sub1_Sub11_Sub2 local14 = new Class1_Sub1_Sub11_Sub2();
		local14.aBoolean563 = arg2;
		local14.aLong234 = local10;
		local14.aByte98 = arg3;
		if (arg2) {
			if (this.method3357() >= 20) {
				throw new RuntimeException();
			}
			this.aClass307_2.method7354(local14);
		} else if (this.method3358() < 20) {
			this.aClass307_4.method7354(local14);
		} else {
			throw new RuntimeException();
		}
		return local14;
	}

	@OriginalMember(owner = "client!hca", name = "b", descriptor = "(I)V")
	public void method3356() {
		if (this.aClass57_3 != null) {
			this.aClass57_3.method2057();
		}
	}

	@OriginalMember(owner = "client!hca", name = "c", descriptor = "(I)I")
	public int method3357() {
		return this.aClass307_2.method7353() + this.aClass307_3.method7353();
	}

	@OriginalMember(owner = "client!hca", name = "b", descriptor = "(Z)I")
	private int method3358() {
		return this.aClass307_4.method7353() + this.aClass307_5.method7353();
	}

	@OriginalMember(owner = "client!hca", name = "c", descriptor = "(Z)V")
	public void method3360() {
		try {
			this.aClass57_3.method2051();
		} catch (@Pc(15) Exception local15) {
		}
		this.anInt3776++;
		this.aByte30 = (byte) (Math.random() * 255.0D + 1.0D);
		this.aClass57_3 = null;
		this.anInt3777 = -1;
	}

	@OriginalMember(owner = "client!hca", name = "a", descriptor = "(ILclient!de;Z)V")
	public void method3361(@OriginalArg(1) Class57 arg0, @OriginalArg(2) boolean arg1) {
		if (this.aClass57_3 != null) {
			try {
				this.aClass57_3.method2051();
			} catch (@Pc(8) Exception local8) {
			}
			this.aClass57_3 = null;
		}
		this.aClass57_3 = arg0;
		this.method3365();
		this.method3362(arg1);
		this.aClass1_Sub1_Sub11_Sub2_1 = null;
		this.aClass1_Sub13_3.anInt3400 = 0;
		while (true) {
			@Pc(38) Class1_Sub1_Sub11_Sub2 local38 = (Class1_Sub1_Sub11_Sub2) this.aClass307_3.method7360();
			if (local38 == null) {
				while (true) {
					local38 = (Class1_Sub1_Sub11_Sub2) this.aClass307_5.method7360();
					if (local38 == null) {
						if (this.aByte30 != 0) {
							try {
								this.aClass1_Sub13_2.anInt3400 = 0;
								this.aClass1_Sub13_2.method3060(4);
								this.aClass1_Sub13_2.method3060(this.aByte30);
								this.aClass1_Sub13_2.method3038(0);
								this.aClass57_3.method2055(4, this.aClass1_Sub13_2.aByteArray45);
							} catch (@Pc(96) IOException local96) {
								try {
									this.aClass57_3.method2051();
								} catch (@Pc(102) Exception local102) {
								}
								this.aClass57_3 = null;
								this.anInt3777 = -2;
								this.anInt3776++;
							}
						}
						this.anInt3775 = 0;
						this.aLong98 = Static93.method2172();
						return;
					}
					this.aClass307_4.method7354(local38);
				}
			}
			this.aClass307_2.method7354(local38);
		}
	}

	@OriginalMember(owner = "client!hca", name = "a", descriptor = "(BZ)V")
	public void method3362(@OriginalArg(1) boolean arg0) {
		if (this.aClass57_3 == null) {
			return;
		}
		try {
			this.aClass1_Sub13_2.anInt3400 = 0;
			this.aClass1_Sub13_2.method3060(arg0 ? 2 : 3);
			this.aClass1_Sub13_2.method3067(0);
			this.aClass57_3.method2055(4, this.aClass1_Sub13_2.aByteArray45);
		} catch (@Pc(42) IOException local42) {
			try {
				this.aClass57_3.method2051();
			} catch (@Pc(48) Exception local48) {
			}
			this.anInt3777 = -2;
			this.anInt3776++;
			this.aClass57_3 = null;
		}
	}

	@OriginalMember(owner = "client!hca", name = "a", descriptor = "(B)Z")
	public boolean method3363() {
		@Pc(12) int local12;
		if (this.aClass57_3 != null) {
			@Pc(5) long local5 = Static93.method2172();
			local12 = (int) (local5 - this.aLong98);
			if (local12 > 200) {
				local12 = 200;
			}
			this.aLong98 = local5;
			this.anInt3775 += local12;
			if (this.anInt3775 > 30000) {
				try {
					this.aClass57_3.method2051();
				} catch (@Pc(38) Exception local38) {
				}
				this.aClass57_3 = null;
			}
		}
		if (this.aClass57_3 == null) {
			return this.method3357() == 0 && this.method3358() == 0;
		}
		try {
			this.aClass57_3.method2054();
			for (@Pc(76) Class1_Sub1_Sub11_Sub2 local76 = (Class1_Sub1_Sub11_Sub2) this.aClass307_2.method7359(); local76 != null; local76 = (Class1_Sub1_Sub11_Sub2) this.aClass307_2.method7355()) {
				this.aClass1_Sub13_2.anInt3400 = 0;
				this.aClass1_Sub13_2.method3060(1);
				this.aClass1_Sub13_2.method3067((int) local76.aLong234);
				this.aClass57_3.method2055(4, this.aClass1_Sub13_2.aByteArray45);
				this.aClass307_3.method7354(local76);
			}
			for (@Pc(121) Class1_Sub1_Sub11_Sub2 local121 = (Class1_Sub1_Sub11_Sub2) this.aClass307_4.method7359(); local121 != null; local121 = (Class1_Sub1_Sub11_Sub2) this.aClass307_4.method7355()) {
				this.aClass1_Sub13_2.anInt3400 = 0;
				this.aClass1_Sub13_2.method3060(0);
				this.aClass1_Sub13_2.method3067((int) local121.aLong234);
				this.aClass57_3.method2055(4, this.aClass1_Sub13_2.aByteArray45);
				this.aClass307_5.method7354(local121);
			}
			for (local12 = 0; local12 < 100; local12++) {
				@Pc(168) int local168 = this.aClass57_3.method2052();
				if (local168 < 0) {
					throw new IOException();
				}
				if (local168 == 0) {
					break;
				}
				this.anInt3775 = 0;
				@Pc(187) byte local187 = 0;
				if (this.aClass1_Sub1_Sub11_Sub2_1 == null) {
					local187 = 8;
				} else if (this.aClass1_Sub1_Sub11_Sub2_1.anInt8234 == 0) {
					local187 = 1;
				}
				@Pc(212) int local212;
				@Pc(219) int local219;
				@Pc(267) int local267;
				if (local187 <= 0) {
					local212 = this.aClass1_Sub1_Sub11_Sub2_1.aClass1_Sub13_8.aByteArray45.length - this.aClass1_Sub1_Sub11_Sub2_1.aByte98;
					local219 = 512 - this.aClass1_Sub1_Sub11_Sub2_1.anInt8234;
					if (local219 > local212 - this.aClass1_Sub1_Sub11_Sub2_1.aClass1_Sub13_8.anInt3400) {
						local219 = local212 - this.aClass1_Sub1_Sub11_Sub2_1.aClass1_Sub13_8.anInt3400;
					}
					if (local219 > local168) {
						local219 = local168;
					}
					this.aClass57_3.method2059(this.aClass1_Sub1_Sub11_Sub2_1.aClass1_Sub13_8.anInt3400, this.aClass1_Sub1_Sub11_Sub2_1.aClass1_Sub13_8.aByteArray45, local219);
					if (this.aByte30 != 0) {
						for (local267 = 0; local267 < local219; local267++) {
							this.aClass1_Sub1_Sub11_Sub2_1.aClass1_Sub13_8.aByteArray45[local267 + this.aClass1_Sub1_Sub11_Sub2_1.aClass1_Sub13_8.anInt3400] ^= this.aByte30;
						}
					}
					this.aClass1_Sub1_Sub11_Sub2_1.anInt8234 += local219;
					this.aClass1_Sub1_Sub11_Sub2_1.aClass1_Sub13_8.anInt3400 += local219;
					if (this.aClass1_Sub1_Sub11_Sub2_1.aClass1_Sub13_8.anInt3400 == local212) {
						this.aClass1_Sub1_Sub11_Sub2_1.method7493();
						this.aClass1_Sub1_Sub11_Sub2_1.aBoolean562 = false;
						this.aClass1_Sub1_Sub11_Sub2_1 = null;
					} else if (this.aClass1_Sub1_Sub11_Sub2_1.anInt8234 == 512) {
						this.aClass1_Sub1_Sub11_Sub2_1.anInt8234 = 0;
					}
				} else {
					local212 = local187 - this.aClass1_Sub13_3.anInt3400;
					if (local168 < local212) {
						local212 = local168;
					}
					this.aClass57_3.method2059(this.aClass1_Sub13_3.anInt3400, this.aClass1_Sub13_3.aByteArray45, local212);
					if (this.aByte30 != 0) {
						for (local219 = 0; local219 < local212; local219++) {
							this.aClass1_Sub13_3.aByteArray45[local219 + this.aClass1_Sub13_3.anInt3400] ^= this.aByte30;
						}
					}
					this.aClass1_Sub13_3.anInt3400 += local212;
					if (this.aClass1_Sub13_3.anInt3400 >= local187) {
						if (this.aClass1_Sub1_Sub11_Sub2_1 == null) {
							this.aClass1_Sub13_3.anInt3400 = 0;
							local219 = this.aClass1_Sub13_3.method3043();
							local267 = this.aClass1_Sub13_3.method3056();
							@Pc(443) int local443 = this.aClass1_Sub13_3.method3043();
							@Pc(448) int local448 = this.aClass1_Sub13_3.method3037();
							@Pc(452) int local452 = local443 & 0x7F;
							@Pc(460) boolean local460 = (local443 & 0x80) != 0;
							@Pc(467) long local467 = (long) (local267 + (local219 << 16));
							@Pc(477) Class1_Sub1_Sub11_Sub2 local477;
							if (local460) {
								for (local477 = (Class1_Sub1_Sub11_Sub2) this.aClass307_5.method7359(); local477 != null && local477.aLong234 != local467; local477 = (Class1_Sub1_Sub11_Sub2) this.aClass307_5.method7355()) {
								}
							} else {
								for (local477 = (Class1_Sub1_Sub11_Sub2) this.aClass307_3.method7359(); local477 != null && local467 != local477.aLong234; local477 = (Class1_Sub1_Sub11_Sub2) this.aClass307_3.method7355()) {
								}
							}
							if (local477 == null) {
								throw new IOException();
							}
							this.aClass1_Sub1_Sub11_Sub2_1 = local477;
							@Pc(537) int local537 = local452 == 0 ? 5 : 9;
							this.aClass1_Sub1_Sub11_Sub2_1.aClass1_Sub13_8 = new Class1_Sub13(this.aClass1_Sub1_Sub11_Sub2_1.aByte98 + local448 + local537);
							this.aClass1_Sub1_Sub11_Sub2_1.aClass1_Sub13_8.method3060(local452);
							this.aClass1_Sub1_Sub11_Sub2_1.aClass1_Sub13_8.method3069(local448);
							this.aClass1_Sub1_Sub11_Sub2_1.anInt8234 = 8;
							this.aClass1_Sub13_3.anInt3400 = 0;
						} else if (this.aClass1_Sub1_Sub11_Sub2_1.anInt8234 != 0) {
							throw new IOException();
						} else if (this.aClass1_Sub13_3.aByteArray45[0] == -1) {
							this.aClass1_Sub13_3.anInt3400 = 0;
							this.aClass1_Sub1_Sub11_Sub2_1.anInt8234 = 1;
						} else {
							this.aClass1_Sub1_Sub11_Sub2_1 = null;
						}
					}
				}
			}
			return true;
		} catch (@Pc(610) IOException local610) {
			try {
				this.aClass57_3.method2051();
			} catch (@Pc(616) Exception local616) {
			}
			this.aClass57_3 = null;
			this.anInt3777 = -2;
			this.anInt3776++;
			return this.method3357() == 0 && this.method3358() == 0;
		}
	}

	@OriginalMember(owner = "client!hca", name = "b", descriptor = "(B)V")
	public void method3364() {
		if (this.aClass57_3 != null) {
			this.aClass57_3.method2051();
		}
	}

	@OriginalMember(owner = "client!hca", name = "e", descriptor = "(I)V")
	private void method3365() {
		if (this.aClass57_3 == null) {
			return;
		}
		try {
			this.aClass1_Sub13_2.anInt3400 = 0;
			this.aClass1_Sub13_2.method3060(6);
			this.aClass1_Sub13_2.method3067(3);
			this.aClass57_3.method2055(4, this.aClass1_Sub13_2.aByteArray45);
		} catch (@Pc(32) IOException local32) {
			try {
				this.aClass57_3.method2051();
			} catch (@Pc(38) Exception local38) {
			}
			this.anInt3776++;
			this.anInt3777 = -2;
			this.aClass57_3 = null;
		}
	}

	@OriginalMember(owner = "client!hca", name = "c", descriptor = "(B)V")
	public void method3366() {
		if (this.aClass57_3 == null) {
			return;
		}
		try {
			this.aClass1_Sub13_2.anInt3400 = 0;
			this.aClass1_Sub13_2.method3060(7);
			this.aClass1_Sub13_2.method3067(0);
			this.aClass57_3.method2055(4, this.aClass1_Sub13_2.aByteArray45);
		} catch (@Pc(39) IOException local39) {
			try {
				this.aClass57_3.method2051();
			} catch (@Pc(45) Exception local45) {
			}
			this.aClass57_3 = null;
			this.anInt3776++;
			this.anInt3777 = -2;
		}
	}
}
