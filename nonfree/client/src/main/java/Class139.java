import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!r")
public final class Class139 {

	@OriginalMember(owner = "client!r", name = "x", descriptor = "I")
	private int anInt4542;

	@OriginalMember(owner = "client!r", name = "y", descriptor = "J")
	private long aLong160;

	@OriginalMember(owner = "client!r", name = "z", descriptor = "Lclient!kc;")
	private Class92 aClass92_7;

	@OriginalMember(owner = "client!r", name = "F", descriptor = "Lclient!dk;")
	private Class8_Sub1_Sub4_Sub1 aClass8_Sub1_Sub4_Sub1_1;

	@OriginalMember(owner = "client!r", name = "j", descriptor = "Lclient!uc;")
	private Class164 aClass164_7 = new Class164();

	@OriginalMember(owner = "client!r", name = "t", descriptor = "Lclient!uc;")
	private Class164 aClass164_8 = new Class164();

	@OriginalMember(owner = "client!r", name = "u", descriptor = "Lclient!uc;")
	private Class164 aClass164_9 = new Class164();

	@OriginalMember(owner = "client!r", name = "w", descriptor = "Lclient!uc;")
	private Class164 aClass164_10 = new Class164();

	@OriginalMember(owner = "client!r", name = "A", descriptor = "Lclient!aj;")
	private Class8_Sub2 aClass8_Sub2_4 = new Class8_Sub2(4);

	@OriginalMember(owner = "client!r", name = "B", descriptor = "I")
	public volatile int anInt4543 = 0;

	@OriginalMember(owner = "client!r", name = "C", descriptor = "I")
	public volatile int anInt4544 = 0;

	@OriginalMember(owner = "client!r", name = "E", descriptor = "B")
	private byte aByte14 = 0;

	@OriginalMember(owner = "client!r", name = "D", descriptor = "Lclient!aj;")
	private Class8_Sub2 aClass8_Sub2_5 = new Class8_Sub2(8);

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(I)V")
	public void method3438() {
		if (this.aClass92_7 != null) {
			this.aClass92_7.method2183();
		}
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Z)V")
	private void method3439() {
		if (this.aClass92_7 == null) {
			return;
		}
		try {
			this.aClass8_Sub2_4.anInt2955 = 0;
			this.aClass8_Sub2_4.method2340(6);
			this.aClass8_Sub2_4.method2336(3);
			this.aClass92_7.method2178(this.aClass8_Sub2_4.aByteArray24, 4);
		} catch (@Pc(37) IOException local37) {
			try {
				this.aClass92_7.method2176();
			} catch (@Pc(43) Exception local43) {
			}
			this.anInt4544 = -2;
			this.aClass92_7 = null;
			this.anInt4543++;
		}
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(B)I")
	private int method3440() {
		return this.aClass164_9.method3990() + this.aClass164_10.method3990();
	}

	@OriginalMember(owner = "client!r", name = "b", descriptor = "(B)Z")
	public boolean method3441() {
		return this.method3440() >= 20;
	}

	@OriginalMember(owner = "client!r", name = "b", descriptor = "(Z)Z")
	public boolean method3442() {
		if (this.aClass92_7 != null) {
			@Pc(12) long local12 = Static71.method1143();
			@Pc(19) int local19 = (int) (local12 - this.aLong160);
			this.aLong160 = local12;
			if (local19 > 200) {
				local19 = 200;
			}
			this.anInt4542 += local19;
			if (this.anInt4542 > 30000) {
				try {
					this.aClass92_7.method2176();
				} catch (@Pc(45) Exception local45) {
				}
				this.aClass92_7 = null;
			}
		}
		if (this.aClass92_7 == null) {
			return this.method3449() == 0 && this.method3440() == 0;
		}
		try {
			this.aClass92_7.method2179();
			@Pc(78) Class8_Sub1_Sub4_Sub1 local78;
			for (local78 = (Class8_Sub1_Sub4_Sub1) this.aClass164_7.method3989(); local78 != null; local78 = (Class8_Sub1_Sub4_Sub1) this.aClass164_7.method3988()) {
				this.aClass8_Sub2_4.anInt2955 = 0;
				this.aClass8_Sub2_4.method2340(1);
				this.aClass8_Sub2_4.method2336((int) local78.aLong204);
				this.aClass92_7.method2178(this.aClass8_Sub2_4.aByteArray24, 4);
				this.aClass164_8.method3993(local78);
			}
			for (local78 = (Class8_Sub1_Sub4_Sub1) this.aClass164_9.method3989(); local78 != null; local78 = (Class8_Sub1_Sub4_Sub1) this.aClass164_9.method3988()) {
				this.aClass8_Sub2_4.anInt2955 = 0;
				this.aClass8_Sub2_4.method2340(0);
				this.aClass8_Sub2_4.method2336((int) local78.aLong204);
				this.aClass92_7.method2178(this.aClass8_Sub2_4.aByteArray24, 4);
				this.aClass164_10.method3993(local78);
			}
			for (@Pc(172) int local172 = 0; local172 < 100; local172++) {
				@Pc(180) int local180 = this.aClass92_7.method2175();
				if (local180 < 0) {
					throw new IOException();
				}
				if (local180 == 0) {
					break;
				}
				this.anInt4542 = 0;
				@Pc(200) byte local200 = 0;
				if (this.aClass8_Sub1_Sub4_Sub1_1 == null) {
					local200 = 8;
				} else if (this.aClass8_Sub1_Sub4_Sub1_1.anInt1225 == 0) {
					local200 = 1;
				}
				@Pc(228) int local228;
				@Pc(234) int local234;
				@Pc(280) int local280;
				if (local200 <= 0) {
					local228 = this.aClass8_Sub1_Sub4_Sub1_1.aClass8_Sub2_1.aByteArray24.length - this.aClass8_Sub1_Sub4_Sub1_1.aByte5;
					local234 = 512 - this.aClass8_Sub1_Sub4_Sub1_1.anInt1225;
					if (local228 - this.aClass8_Sub1_Sub4_Sub1_1.aClass8_Sub2_1.anInt2955 < local234) {
						local234 = local228 - this.aClass8_Sub1_Sub4_Sub1_1.aClass8_Sub2_1.anInt2955;
					}
					if (local234 > local180) {
						local234 = local180;
					}
					this.aClass92_7.method2182(this.aClass8_Sub1_Sub4_Sub1_1.aClass8_Sub2_1.anInt2955, local234, this.aClass8_Sub1_Sub4_Sub1_1.aClass8_Sub2_1.aByteArray24);
					if (this.aByte14 != 0) {
						for (local280 = 0; local280 < local234; local280++) {
							this.aClass8_Sub1_Sub4_Sub1_1.aClass8_Sub2_1.aByteArray24[this.aClass8_Sub1_Sub4_Sub1_1.aClass8_Sub2_1.anInt2955 + local280] = (byte) (this.aClass8_Sub1_Sub4_Sub1_1.aClass8_Sub2_1.aByteArray24[this.aClass8_Sub1_Sub4_Sub1_1.aClass8_Sub2_1.anInt2955 + local280] ^ this.aByte14);
						}
					}
					this.aClass8_Sub1_Sub4_Sub1_1.anInt1225 += local234;
					this.aClass8_Sub1_Sub4_Sub1_1.aClass8_Sub2_1.anInt2955 += local234;
					if (local228 == this.aClass8_Sub1_Sub4_Sub1_1.aClass8_Sub2_1.anInt2955) {
						this.aClass8_Sub1_Sub4_Sub1_1.method4277();
						this.aClass8_Sub1_Sub4_Sub1_1.aBoolean313 = false;
						this.aClass8_Sub1_Sub4_Sub1_1 = null;
					} else if (this.aClass8_Sub1_Sub4_Sub1_1.anInt1225 == 512) {
						this.aClass8_Sub1_Sub4_Sub1_1.anInt1225 = 0;
					}
				} else {
					local228 = local200 - this.aClass8_Sub2_5.anInt2955;
					if (local228 > local180) {
						local228 = local180;
					}
					this.aClass92_7.method2182(this.aClass8_Sub2_5.anInt2955, local228, this.aClass8_Sub2_5.aByteArray24);
					if (this.aByte14 != 0) {
						for (local234 = 0; local234 < local228; local234++) {
							this.aClass8_Sub2_5.aByteArray24[local234 + this.aClass8_Sub2_5.anInt2955] ^= this.aByte14;
						}
					}
					this.aClass8_Sub2_5.anInt2955 += local228;
					if (local200 <= this.aClass8_Sub2_5.anInt2955) {
						if (this.aClass8_Sub1_Sub4_Sub1_1 == null) {
							this.aClass8_Sub2_5.anInt2955 = 0;
							local234 = this.aClass8_Sub2_5.method2334();
							local280 = this.aClass8_Sub2_5.method2375();
							@Pc(467) int local467 = this.aClass8_Sub2_5.method2334();
							@Pc(471) int local471 = local467 & 0x7F;
							@Pc(478) int local478 = this.aClass8_Sub2_5.method2352();
							@Pc(486) boolean local486 = (local467 & 0x80) != 0;
							@Pc(494) long local494 = (long) ((local234 << 16) + local280);
							@Pc(502) Class8_Sub1_Sub4_Sub1 local502;
							if (local486) {
								for (local502 = (Class8_Sub1_Sub4_Sub1) this.aClass164_10.method3989(); local502 != null && local502.aLong204 != local494; local502 = (Class8_Sub1_Sub4_Sub1) this.aClass164_10.method3988()) {
								}
							} else {
								for (local502 = (Class8_Sub1_Sub4_Sub1) this.aClass164_8.method3989(); local502 != null && local494 != local502.aLong204; local502 = (Class8_Sub1_Sub4_Sub1) this.aClass164_8.method3988()) {
								}
							}
							if (local502 == null) {
								throw new IOException();
							}
							this.aClass8_Sub1_Sub4_Sub1_1 = local502;
							@Pc(562) int local562 = local471 == 0 ? 5 : 9;
							this.aClass8_Sub1_Sub4_Sub1_1.aClass8_Sub2_1 = new Class8_Sub2(local478 + local562 + this.aClass8_Sub1_Sub4_Sub1_1.aByte5);
							this.aClass8_Sub1_Sub4_Sub1_1.aClass8_Sub2_1.method2340(local471);
							this.aClass8_Sub1_Sub4_Sub1_1.aClass8_Sub2_1.method2330(local478);
							this.aClass8_Sub1_Sub4_Sub1_1.anInt1225 = 8;
							this.aClass8_Sub2_5.anInt2955 = 0;
						} else if (this.aClass8_Sub1_Sub4_Sub1_1.anInt1225 != 0) {
							throw new IOException();
						} else if (this.aClass8_Sub2_5.aByteArray24[0] == -1) {
							this.aClass8_Sub2_5.anInt2955 = 0;
							this.aClass8_Sub1_Sub4_Sub1_1.anInt1225 = 1;
						} else {
							this.aClass8_Sub1_Sub4_Sub1_1 = null;
						}
					}
				}
			}
			return true;
		} catch (@Pc(637) IOException local637) {
			try {
				this.aClass92_7.method2176();
			} catch (@Pc(643) Exception local643) {
			}
			this.aClass92_7 = null;
			this.anInt4543++;
			this.anInt4544 = -2;
			return this.method3449() == 0 && this.method3440() == 0;
		}
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IZIZB)Lclient!dk;")
	public Class8_Sub1_Sub4_Sub1 method3443(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) byte arg3) {
		@Pc(11) long local11 = (long) (arg1 + (arg0 << 16));
		@Pc(15) Class8_Sub1_Sub4_Sub1 local15 = new Class8_Sub1_Sub4_Sub1();
		local15.aLong204 = local11;
		local15.aByte5 = arg3;
		local15.aBoolean315 = arg2;
		if (arg2) {
			if (this.method3449() >= 20) {
				throw new RuntimeException();
			}
			this.aClass164_7.method3993(local15);
		} else if (this.method3440() < 20) {
			this.aClass164_9.method3993(local15);
		} else {
			throw new RuntimeException();
		}
		return local15;
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Lclient!kc;ZB)V")
	public void method3446(@OriginalArg(0) Class92 arg0, @OriginalArg(1) boolean arg1) {
		if (this.aClass92_7 != null) {
			try {
				this.aClass92_7.method2176();
			} catch (@Pc(15) Exception local15) {
			}
			this.aClass92_7 = null;
		}
		this.aClass92_7 = arg0;
		this.method3439();
		this.method3451(arg1);
		this.aClass8_Sub2_5.anInt2955 = 0;
		this.aClass8_Sub1_Sub4_Sub1_1 = null;
		while (true) {
			@Pc(41) Class8_Sub1_Sub4_Sub1 local41 = (Class8_Sub1_Sub4_Sub1) this.aClass164_8.method3992();
			if (local41 == null) {
				while (true) {
					local41 = (Class8_Sub1_Sub4_Sub1) this.aClass164_10.method3992();
					if (local41 == null) {
						if (this.aByte14 != 0) {
							try {
								this.aClass8_Sub2_4.anInt2955 = 0;
								this.aClass8_Sub2_4.method2340(4);
								this.aClass8_Sub2_4.method2340(this.aByte14);
								this.aClass8_Sub2_4.method2333(0);
								this.aClass92_7.method2178(this.aClass8_Sub2_4.aByteArray24, 4);
							} catch (@Pc(105) IOException local105) {
								try {
									this.aClass92_7.method2176();
								} catch (@Pc(111) Exception local111) {
								}
								this.anInt4543++;
								this.aClass92_7 = null;
								this.anInt4544 = -2;
							}
						}
						this.anInt4542 = 0;
						this.aLong160 = Static71.method1143();
						return;
					}
					this.aClass164_9.method3993(local41);
				}
			}
			this.aClass164_7.method3993(local41);
		}
	}

	@OriginalMember(owner = "client!r", name = "c", descriptor = "(Z)Z")
	public boolean method3447() {
		return this.method3449() >= 20;
	}

	@OriginalMember(owner = "client!r", name = "c", descriptor = "(I)V")
	public void method3448() {
		if (this.aClass92_7 != null) {
			this.aClass92_7.method2176();
		}
	}

	@OriginalMember(owner = "client!r", name = "d", descriptor = "(I)I")
	public int method3449() {
		return this.aClass164_7.method3990() + this.aClass164_8.method3990();
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IZ)V")
	public void method3451(@OriginalArg(1) boolean arg0) {
		if (this.aClass92_7 == null) {
			return;
		}
		try {
			this.aClass8_Sub2_4.anInt2955 = 0;
			this.aClass8_Sub2_4.method2340(arg0 ? 2 : 3);
			this.aClass8_Sub2_4.method2336(0);
			this.aClass92_7.method2178(this.aClass8_Sub2_4.aByteArray24, 4);
		} catch (@Pc(45) IOException local45) {
			try {
				this.aClass92_7.method2176();
			} catch (@Pc(51) Exception local51) {
			}
			this.anInt4543++;
			this.aClass92_7 = null;
			this.anInt4544 = -2;
		}
	}

	@OriginalMember(owner = "client!r", name = "c", descriptor = "(B)V")
	public void method3452() {
		if (this.aClass92_7 == null) {
			return;
		}
		try {
			this.aClass8_Sub2_4.anInt2955 = 0;
			this.aClass8_Sub2_4.method2340(7);
			this.aClass8_Sub2_4.method2336(0);
			this.aClass92_7.method2178(this.aClass8_Sub2_4.aByteArray24, 4);
		} catch (@Pc(40) IOException local40) {
			try {
				this.aClass92_7.method2176();
			} catch (@Pc(46) Exception local46) {
			}
			this.anInt4543++;
			this.aClass92_7 = null;
			this.anInt4544 = -2;
		}
	}

	@OriginalMember(owner = "client!r", name = "e", descriptor = "(I)V")
	public void method3453() {
		try {
			this.aClass92_7.method2176();
		} catch (@Pc(17) Exception local17) {
		}
		this.aByte14 = (byte) (Math.random() * 255.0D + 1.0D);
		this.aClass92_7 = null;
		this.anInt4543++;
		this.anInt4544 = -1;
	}
}
