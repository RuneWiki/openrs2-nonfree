import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tha")
public final class Class329 {

	@OriginalMember(owner = "client!tha", name = "w", descriptor = "J")
	private long aLong243;

	@OriginalMember(owner = "client!tha", name = "y", descriptor = "Lclient!re;")
	private Class291 aClass291_2;

	@OriginalMember(owner = "client!tha", name = "z", descriptor = "I")
	private int anInt9760;

	@OriginalMember(owner = "client!tha", name = "E", descriptor = "Lclient!mba;")
	private Class2_Sub6_Sub8_Sub1 aClass2_Sub6_Sub8_Sub1_2;

	@OriginalMember(owner = "client!tha", name = "m", descriptor = "Lclient!mn;")
	private final Class211 aClass211_8 = new Class211();

	@OriginalMember(owner = "client!tha", name = "t", descriptor = "Lclient!mn;")
	private final Class211 aClass211_9 = new Class211();

	@OriginalMember(owner = "client!tha", name = "u", descriptor = "Lclient!mn;")
	private final Class211 aClass211_10 = new Class211();

	@OriginalMember(owner = "client!tha", name = "v", descriptor = "Lclient!mn;")
	private final Class211 aClass211_11 = new Class211();

	@OriginalMember(owner = "client!tha", name = "x", descriptor = "Lclient!cea;")
	private final Class2_Sub11 aClass2_Sub11_8 = new Class2_Sub11(4);

	@OriginalMember(owner = "client!tha", name = "B", descriptor = "B")
	private byte aByte126 = 0;

	@OriginalMember(owner = "client!tha", name = "C", descriptor = "I")
	public volatile int anInt9761 = 0;

	@OriginalMember(owner = "client!tha", name = "D", descriptor = "I")
	public volatile int anInt9762 = 0;

	@OriginalMember(owner = "client!tha", name = "A", descriptor = "Lclient!cea;")
	private final Class2_Sub11 aClass2_Sub11_9 = new Class2_Sub11(8);

	@OriginalMember(owner = "client!tha", name = "a", descriptor = "(IZ)V")
	public void method8117(@OriginalArg(1) boolean arg0) {
		if (this.aClass291_2 == null) {
			return;
		}
		try {
			this.aClass2_Sub11_8.anInt10066 = 0;
			this.aClass2_Sub11_8.method8374(arg0 ? 2 : 3);
			this.aClass2_Sub11_8.method8336(0);
			this.aClass291_2.method7520(this.aClass2_Sub11_8.aByteArray128, 4);
		} catch (@Pc(40) IOException local40) {
			try {
				this.aClass291_2.method7526();
			} catch (@Pc(46) Exception local46) {
			}
			this.anInt9761++;
			this.aClass291_2 = null;
			this.anInt9762 = -2;
		}
	}

	@OriginalMember(owner = "client!tha", name = "a", descriptor = "(B)Z")
	public boolean method8118() {
		@Pc(14) int local14;
		if (this.aClass291_2 != null) {
			@Pc(7) long local7 = Static277.method5091();
			local14 = (int) (local7 - this.aLong243);
			if (local14 > 200) {
				local14 = 200;
			}
			this.aLong243 = local7;
			this.anInt9760 += local14;
			if (this.anInt9760 > 30000) {
				try {
					this.aClass291_2.method7526();
				} catch (@Pc(40) Exception local40) {
				}
				this.aClass291_2 = null;
			}
		}
		if (this.aClass291_2 == null) {
			return this.method8127() == 0 && this.method8119() == 0;
		}
		try {
			this.aClass291_2.method7522();
			for (@Pc(78) Class2_Sub6_Sub8_Sub1 local78 = (Class2_Sub6_Sub8_Sub1) this.aClass211_8.method6008(); local78 != null; local78 = (Class2_Sub6_Sub8_Sub1) this.aClass211_8.method6000()) {
				this.aClass2_Sub11_8.anInt10066 = 0;
				this.aClass2_Sub11_8.method8374(1);
				this.aClass2_Sub11_8.method8336((int) local78.aLong267);
				this.aClass291_2.method7520(this.aClass2_Sub11_8.aByteArray128, 4);
				this.aClass211_9.method6002(local78);
			}
			for (@Pc(124) Class2_Sub6_Sub8_Sub1 local124 = (Class2_Sub6_Sub8_Sub1) this.aClass211_10.method6008(); local124 != null; local124 = (Class2_Sub6_Sub8_Sub1) this.aClass211_10.method6000()) {
				this.aClass2_Sub11_8.anInt10066 = 0;
				this.aClass2_Sub11_8.method8374(0);
				this.aClass2_Sub11_8.method8336((int) local124.aLong267);
				this.aClass291_2.method7520(this.aClass2_Sub11_8.aByteArray128, 4);
				this.aClass211_11.method6002(local124);
			}
			for (local14 = 0; local14 < 100; local14++) {
				@Pc(176) int local176 = this.aClass291_2.method7517();
				if (local176 < 0) {
					throw new IOException();
				}
				if (local176 == 0) {
					break;
				}
				this.anInt9760 = 0;
				@Pc(192) byte local192 = 0;
				if (this.aClass2_Sub6_Sub8_Sub1_2 == null) {
					local192 = 8;
				} else if (this.aClass2_Sub6_Sub8_Sub1_2.anInt6836 == 0) {
					local192 = 1;
				}
				@Pc(224) int local224;
				@Pc(231) int local231;
				@Pc(274) int local274;
				if (local192 <= 0) {
					local224 = this.aClass2_Sub6_Sub8_Sub1_2.aClass2_Sub11_2.aByteArray128.length - this.aClass2_Sub6_Sub8_Sub1_2.aByte105;
					local231 = 512 - this.aClass2_Sub6_Sub8_Sub1_2.anInt6836;
					if (local224 - this.aClass2_Sub6_Sub8_Sub1_2.aClass2_Sub11_2.anInt10066 < local231) {
						local231 = local224 - this.aClass2_Sub6_Sub8_Sub1_2.aClass2_Sub11_2.anInt10066;
					}
					if (local176 < local231) {
						local231 = local176;
					}
					this.aClass291_2.method7524(this.aClass2_Sub6_Sub8_Sub1_2.aClass2_Sub11_2.aByteArray128, this.aClass2_Sub6_Sub8_Sub1_2.aClass2_Sub11_2.anInt10066, local231);
					if (this.aByte126 != 0) {
						for (local274 = 0; local274 < local231; local274++) {
							this.aClass2_Sub6_Sub8_Sub1_2.aClass2_Sub11_2.aByteArray128[local274 + this.aClass2_Sub6_Sub8_Sub1_2.aClass2_Sub11_2.anInt10066] ^= this.aByte126;
						}
					}
					this.aClass2_Sub6_Sub8_Sub1_2.anInt6836 += local231;
					this.aClass2_Sub6_Sub8_Sub1_2.aClass2_Sub11_2.anInt10066 += local231;
					if (this.aClass2_Sub6_Sub8_Sub1_2.aClass2_Sub11_2.anInt10066 == local224) {
						this.aClass2_Sub6_Sub8_Sub1_2.method8933();
						this.aClass2_Sub6_Sub8_Sub1_2.aBoolean601 = false;
						this.aClass2_Sub6_Sub8_Sub1_2 = null;
					} else if (this.aClass2_Sub6_Sub8_Sub1_2.anInt6836 == 512) {
						this.aClass2_Sub6_Sub8_Sub1_2.anInt6836 = 0;
					}
				} else {
					local224 = local192 - this.aClass2_Sub11_9.anInt10066;
					if (local176 < local224) {
						local224 = local176;
					}
					this.aClass291_2.method7524(this.aClass2_Sub11_9.aByteArray128, this.aClass2_Sub11_9.anInt10066, local224);
					if (this.aByte126 != 0) {
						for (local231 = 0; local231 < local224; local231++) {
							this.aClass2_Sub11_9.aByteArray128[local231 + this.aClass2_Sub11_9.anInt10066] ^= this.aByte126;
						}
					}
					this.aClass2_Sub11_9.anInt10066 += local224;
					if (this.aClass2_Sub11_9.anInt10066 >= local192) {
						if (this.aClass2_Sub6_Sub8_Sub1_2 == null) {
							this.aClass2_Sub11_9.anInt10066 = 0;
							local231 = this.aClass2_Sub11_9.method8383();
							local274 = this.aClass2_Sub11_9.method8326();
							@Pc(452) int local452 = this.aClass2_Sub11_9.method8383();
							@Pc(457) int local457 = this.aClass2_Sub11_9.method8381();
							@Pc(461) int local461 = local452 & 0x7F;
							@Pc(472) boolean local472 = (local452 & 0x80) != 0;
							@Pc(479) long local479 = (long) ((local231 << 16) + local274);
							@Pc(489) Class2_Sub6_Sub8_Sub1 local489;
							if (local472) {
								for (local489 = (Class2_Sub6_Sub8_Sub1) this.aClass211_11.method6008(); local489 != null && local479 != local489.aLong267; local489 = (Class2_Sub6_Sub8_Sub1) this.aClass211_11.method6000()) {
								}
							} else {
								for (local489 = (Class2_Sub6_Sub8_Sub1) this.aClass211_9.method6008(); local489 != null && local489.aLong267 != local479; local489 = (Class2_Sub6_Sub8_Sub1) this.aClass211_9.method6000()) {
								}
							}
							if (local489 == null) {
								throw new IOException();
							}
							@Pc(549) int local549 = local461 == 0 ? 5 : 9;
							this.aClass2_Sub6_Sub8_Sub1_2 = local489;
							this.aClass2_Sub6_Sub8_Sub1_2.aClass2_Sub11_2 = new Class2_Sub11(this.aClass2_Sub6_Sub8_Sub1_2.aByte105 + local549 + local457);
							this.aClass2_Sub6_Sub8_Sub1_2.aClass2_Sub11_2.method8374(local461);
							this.aClass2_Sub6_Sub8_Sub1_2.aClass2_Sub11_2.method8387(local457);
							this.aClass2_Sub11_9.anInt10066 = 0;
							this.aClass2_Sub6_Sub8_Sub1_2.anInt6836 = 8;
						} else if (this.aClass2_Sub6_Sub8_Sub1_2.anInt6836 != 0) {
							throw new IOException();
						} else if (this.aClass2_Sub11_9.aByteArray128[0] == -1) {
							this.aClass2_Sub6_Sub8_Sub1_2.anInt6836 = 1;
							this.aClass2_Sub11_9.anInt10066 = 0;
						} else {
							this.aClass2_Sub6_Sub8_Sub1_2 = null;
						}
					}
				}
			}
			return true;
		} catch (@Pc(629) IOException local629) {
			try {
				this.aClass291_2.method7526();
			} catch (@Pc(635) Exception local635) {
			}
			this.anInt9762 = -2;
			this.anInt9761++;
			this.aClass291_2 = null;
			return this.method8127() == 0 && this.method8119() == 0;
		}
	}

	@OriginalMember(owner = "client!tha", name = "a", descriptor = "(I)I")
	private int method8119() {
		return this.aClass211_10.method5999() + this.aClass211_11.method5999();
	}

	@OriginalMember(owner = "client!tha", name = "b", descriptor = "(I)V")
	private void method8121() {
		if (this.aClass291_2 == null) {
			return;
		}
		try {
			this.aClass2_Sub11_8.anInt10066 = 0;
			this.aClass2_Sub11_8.method8374(6);
			this.aClass2_Sub11_8.method8336(3);
			this.aClass291_2.method7520(this.aClass2_Sub11_8.aByteArray128, 4);
		} catch (@Pc(36) IOException local36) {
			try {
				this.aClass291_2.method7526();
			} catch (@Pc(42) Exception local42) {
			}
			this.anInt9762 = -2;
			this.aClass291_2 = null;
			this.anInt9761++;
		}
	}

	@OriginalMember(owner = "client!tha", name = "a", descriptor = "(Z)V")
	public void method8123() {
		if (this.aClass291_2 != null) {
			this.aClass291_2.method7518();
		}
	}

	@OriginalMember(owner = "client!tha", name = "c", descriptor = "(I)Z")
	public boolean method8124() {
		return this.method8119() >= 20;
	}

	@OriginalMember(owner = "client!tha", name = "d", descriptor = "(I)Z")
	public boolean method8125() {
		return this.method8127() >= 20;
	}

	@OriginalMember(owner = "client!tha", name = "e", descriptor = "(I)V")
	public void method8126() {
		if (this.aClass291_2 != null) {
			this.aClass291_2.method7526();
		}
	}

	@OriginalMember(owner = "client!tha", name = "f", descriptor = "(I)I")
	public int method8127() {
		return this.aClass211_8.method5999() + this.aClass211_9.method5999();
	}

	@OriginalMember(owner = "client!tha", name = "a", descriptor = "(ZZLclient!re;)V")
	public void method8128(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class291 arg1) {
		if (this.aClass291_2 != null) {
			try {
				this.aClass291_2.method7526();
			} catch (@Pc(10) Exception local10) {
			}
			this.aClass291_2 = null;
		}
		this.aClass291_2 = arg1;
		this.method8121();
		this.method8117(arg0);
		this.aClass2_Sub11_9.anInt10066 = 0;
		this.aClass2_Sub6_Sub8_Sub1_2 = null;
		while (true) {
			@Pc(46) Class2_Sub6_Sub8_Sub1 local46 = (Class2_Sub6_Sub8_Sub1) this.aClass211_9.method6005();
			if (local46 == null) {
				while (true) {
					local46 = (Class2_Sub6_Sub8_Sub1) this.aClass211_11.method6005();
					if (local46 == null) {
						if (this.aByte126 != 0) {
							try {
								this.aClass2_Sub11_8.anInt10066 = 0;
								this.aClass2_Sub11_8.method8374(4);
								this.aClass2_Sub11_8.method8374(this.aByte126);
								this.aClass2_Sub11_8.method8333(0);
								this.aClass291_2.method7520(this.aClass2_Sub11_8.aByteArray128, 4);
							} catch (@Pc(108) IOException local108) {
								try {
									this.aClass291_2.method7526();
								} catch (@Pc(114) Exception local114) {
								}
								this.anInt9762 = -2;
								this.anInt9761++;
								this.aClass291_2 = null;
							}
						}
						this.anInt9760 = 0;
						this.aLong243 = Static277.method5091();
						return;
					}
					this.aClass211_10.method6002(local46);
				}
			}
			this.aClass211_8.method6002(local46);
		}
	}

	@OriginalMember(owner = "client!tha", name = "g", descriptor = "(I)V")
	public void method8129() {
		try {
			this.aClass291_2.method7526();
		} catch (@Pc(5) Exception local5) {
		}
		this.aClass291_2 = null;
		this.anInt9761++;
		this.aByte126 = (byte) (Math.random() * 255.0D + 1.0D);
		this.anInt9762 = -1;
	}

	@OriginalMember(owner = "client!tha", name = "h", descriptor = "(I)V")
	public void method8130() {
		if (this.aClass291_2 == null) {
			return;
		}
		try {
			this.aClass2_Sub11_8.anInt10066 = 0;
			this.aClass2_Sub11_8.method8374(7);
			this.aClass2_Sub11_8.method8336(0);
			this.aClass291_2.method7520(this.aClass2_Sub11_8.aByteArray128, 4);
		} catch (@Pc(34) IOException local34) {
			try {
				this.aClass291_2.method7526();
			} catch (@Pc(40) Exception local40) {
			}
			this.anInt9762 = -2;
			this.anInt9761++;
			this.aClass291_2 = null;
		}
	}

	@OriginalMember(owner = "client!tha", name = "a", descriptor = "(BBZII)Lclient!mba;")
	public Class2_Sub6_Sub8_Sub1 method8131(@OriginalArg(1) byte arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(19) long local19 = (long) ((arg3 << 16) + arg2);
		@Pc(23) Class2_Sub6_Sub8_Sub1 local23 = new Class2_Sub6_Sub8_Sub1();
		local23.aBoolean600 = arg1;
		local23.aLong267 = local19;
		local23.aByte105 = arg0;
		if (arg1) {
			if (this.method8127() >= 20) {
				throw new RuntimeException();
			}
			this.aClass211_8.method6002(local23);
		} else if (this.method8119() < 20) {
			this.aClass211_10.method6002(local23);
		} else {
			throw new RuntimeException();
		}
		return local23;
	}
}
