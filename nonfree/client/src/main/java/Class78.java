import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ig")
public final class Class78 {

	@OriginalMember(owner = "client!ig", name = "d", descriptor = "[I")
	public static int[] anIntArray161 = new int[99];

	@OriginalMember(owner = "client!ig", name = "E", descriptor = "J")
	private long aLong115;

	@OriginalMember(owner = "client!ig", name = "F", descriptor = "Lclient!e;")
	private Class45 aClass45_2;

	@OriginalMember(owner = "client!ig", name = "G", descriptor = "I")
	private int anInt2281;

	@OriginalMember(owner = "client!ig", name = "L", descriptor = "Lclient!lb;")
	private Class2_Sub3_Sub14_Sub1 aClass2_Sub3_Sub14_Sub1_1;

	@OriginalMember(owner = "client!ig", name = "p", descriptor = "Lclient!qi;")
	private Class144 aClass144_6 = new Class144();

	@OriginalMember(owner = "client!ig", name = "y", descriptor = "Lclient!qi;")
	private Class144 aClass144_7 = new Class144();

	@OriginalMember(owner = "client!ig", name = "B", descriptor = "Lclient!qi;")
	private Class144 aClass144_8 = new Class144();

	@OriginalMember(owner = "client!ig", name = "C", descriptor = "Lclient!qi;")
	private Class144 aClass144_9 = new Class144();

	@OriginalMember(owner = "client!ig", name = "D", descriptor = "Lclient!wm;")
	private Class2_Sub26 aClass2_Sub26_5 = new Class2_Sub26(4);

	@OriginalMember(owner = "client!ig", name = "I", descriptor = "I")
	public volatile int anInt2282 = 0;

	@OriginalMember(owner = "client!ig", name = "J", descriptor = "I")
	public volatile int anInt2283 = 0;

	@OriginalMember(owner = "client!ig", name = "K", descriptor = "B")
	private byte aByte13 = 0;

	@OriginalMember(owner = "client!ig", name = "H", descriptor = "Lclient!wm;")
	private Class2_Sub26 aClass2_Sub26_6 = new Class2_Sub26(8);

	static {
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < 99; local17++) {
			@Pc(26) int local26 = local17 + 1;
			@Pc(39) int local39 = (int) (Math.pow(2.0D, (double) local26 / 7.0D) * 300.0D + (double) local26);
			local15 += local39;
			anIntArray161[local17] = local15 / 4;
		}
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(ZB)V")
	public void method1950(@OriginalArg(0) boolean arg0) {
		if (this.aClass45_2 == null) {
			return;
		}
		try {
			this.aClass2_Sub26_5.anInt5328 = 0;
			this.aClass2_Sub26_5.method4239(arg0 ? 2 : 3);
			this.aClass2_Sub26_5.method4258(0);
			this.aClass45_2.method1043(4, this.aClass2_Sub26_5.aByteArray72);
		} catch (@Pc(43) IOException local43) {
			try {
				this.aClass45_2.method1045();
			} catch (@Pc(49) Exception local49) {
			}
			this.anInt2283 = -2;
			this.aClass45_2 = null;
			this.anInt2282++;
		}
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(B)V")
	private void method1951() {
		if (this.aClass45_2 == null) {
			return;
		}
		try {
			this.aClass2_Sub26_5.anInt5328 = 0;
			this.aClass2_Sub26_5.method4239(6);
			this.aClass2_Sub26_5.method4258(3);
			this.aClass45_2.method1043(4, this.aClass2_Sub26_5.aByteArray72);
		} catch (@Pc(41) IOException local41) {
			try {
				this.aClass45_2.method1045();
			} catch (@Pc(47) Exception local47) {
			}
			this.anInt2283 = -2;
			this.aClass45_2 = null;
			this.anInt2282++;
		}
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(IBZII)Lclient!lb;")
	public Class2_Sub3_Sub14_Sub1 method1952(@OriginalArg(1) byte arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(10) long local10 = (long) ((arg3 << 16) + arg2);
		@Pc(14) Class2_Sub3_Sub14_Sub1 local14 = new Class2_Sub3_Sub14_Sub1();
		local14.aBoolean322 = arg1;
		local14.aLong295 = local10;
		local14.aByte14 = arg0;
		if (arg1) {
			if (this.method1962() >= 20) {
				throw new RuntimeException();
			}
			this.aClass144_6.method3662(local14);
		} else if (this.method1961() < 20) {
			this.aClass144_8.method3662(local14);
		} else {
			throw new RuntimeException();
		}
		return local14;
	}

	@OriginalMember(owner = "client!ig", name = "c", descriptor = "(I)Z")
	public boolean method1953() {
		if (this.aClass45_2 != null) {
			@Pc(12) long local12 = Static6.method126();
			@Pc(18) int local18 = (int) (local12 - this.aLong115);
			this.aLong115 = local12;
			if (local18 > 200) {
				local18 = 200;
			}
			this.anInt2281 += local18;
			if (this.anInt2281 > 30000) {
				try {
					this.aClass45_2.method1045();
				} catch (@Pc(45) Exception local45) {
				}
				this.aClass45_2 = null;
			}
		}
		if (this.aClass45_2 == null) {
			return this.method1962() == 0 && this.method1961() == 0;
		}
		try {
			this.aClass45_2.method1041();
			@Pc(77) Class2_Sub3_Sub14_Sub1 local77;
			for (local77 = (Class2_Sub3_Sub14_Sub1) this.aClass144_6.method3663(); local77 != null; local77 = (Class2_Sub3_Sub14_Sub1) this.aClass144_6.method3659()) {
				this.aClass2_Sub26_5.anInt5328 = 0;
				this.aClass2_Sub26_5.method4239(1);
				this.aClass2_Sub26_5.method4258((int) local77.aLong295);
				this.aClass45_2.method1043(4, this.aClass2_Sub26_5.aByteArray72);
				this.aClass144_7.method3662(local77);
			}
			for (local77 = (Class2_Sub3_Sub14_Sub1) this.aClass144_8.method3663(); local77 != null; local77 = (Class2_Sub3_Sub14_Sub1) this.aClass144_8.method3659()) {
				this.aClass2_Sub26_5.anInt5328 = 0;
				this.aClass2_Sub26_5.method4239(0);
				this.aClass2_Sub26_5.method4258((int) local77.aLong295);
				this.aClass45_2.method1043(4, this.aClass2_Sub26_5.aByteArray72);
				this.aClass144_9.method3662(local77);
			}
			for (@Pc(170) int local170 = 0; local170 < 100; local170++) {
				@Pc(178) int local178 = this.aClass45_2.method1040();
				if (local178 < 0) {
					throw new IOException();
				}
				if (local178 == 0) {
					break;
				}
				this.anInt2281 = 0;
				@Pc(198) byte local198 = 0;
				if (this.aClass2_Sub3_Sub14_Sub1_1 == null) {
					local198 = 8;
				} else if (this.aClass2_Sub3_Sub14_Sub1_1.anInt3083 == 0) {
					local198 = 1;
				}
				@Pc(223) int local223;
				@Pc(252) int local252;
				@Pc(315) int local315;
				if (local198 > 0) {
					local223 = local198 - this.aClass2_Sub26_6.anInt5328;
					if (local178 < local223) {
						local223 = local178;
					}
					this.aClass45_2.method1048(local223, this.aClass2_Sub26_6.anInt5328, this.aClass2_Sub26_6.aByteArray72);
					if (this.aByte13 != 0) {
						for (local252 = 0; local252 < local223; local252++) {
							this.aClass2_Sub26_6.aByteArray72[this.aClass2_Sub26_6.anInt5328 + local252] = (byte) (this.aClass2_Sub26_6.aByteArray72[this.aClass2_Sub26_6.anInt5328 + local252] ^ this.aByte13);
						}
					}
					this.aClass2_Sub26_6.anInt5328 += local223;
					if (local198 <= this.aClass2_Sub26_6.anInt5328) {
						if (this.aClass2_Sub3_Sub14_Sub1_1 == null) {
							this.aClass2_Sub26_6.anInt5328 = 0;
							local252 = this.aClass2_Sub26_6.method4261();
							local315 = this.aClass2_Sub26_6.method4242();
							@Pc(320) int local320 = this.aClass2_Sub26_6.method4261();
							@Pc(325) int local325 = this.aClass2_Sub26_6.method4228();
							@Pc(329) int local329 = local320 & 0x7F;
							@Pc(340) boolean local340 = (local320 & 0x80) != 0;
							@Pc(347) long local347 = (long) (local315 + (local252 << 16));
							@Pc(357) Class2_Sub3_Sub14_Sub1 local357;
							if (local340) {
								for (local357 = (Class2_Sub3_Sub14_Sub1) this.aClass144_9.method3663(); local357 != null && local347 != local357.aLong295; local357 = (Class2_Sub3_Sub14_Sub1) this.aClass144_9.method3659()) {
								}
							} else {
								for (local357 = (Class2_Sub3_Sub14_Sub1) this.aClass144_7.method3663(); local357 != null && local357.aLong295 != local347; local357 = (Class2_Sub3_Sub14_Sub1) this.aClass144_7.method3659()) {
								}
							}
							if (local357 == null) {
								throw new IOException();
							}
							this.aClass2_Sub3_Sub14_Sub1_1 = local357;
							@Pc(416) int local416 = local329 == 0 ? 5 : 9;
							this.aClass2_Sub3_Sub14_Sub1_1.aClass2_Sub26_8 = new Class2_Sub26(local416 + local325 + this.aClass2_Sub3_Sub14_Sub1_1.aByte14);
							this.aClass2_Sub3_Sub14_Sub1_1.aClass2_Sub26_8.method4239(local329);
							this.aClass2_Sub3_Sub14_Sub1_1.aClass2_Sub26_8.method4260(local325);
							this.aClass2_Sub3_Sub14_Sub1_1.anInt3083 = 8;
							this.aClass2_Sub26_6.anInt5328 = 0;
						} else if (this.aClass2_Sub3_Sub14_Sub1_1.anInt3083 != 0) {
							throw new IOException();
						} else if (this.aClass2_Sub26_6.aByteArray72[0] == -1) {
							this.aClass2_Sub3_Sub14_Sub1_1.anInt3083 = 1;
							this.aClass2_Sub26_6.anInt5328 = 0;
						} else {
							this.aClass2_Sub3_Sub14_Sub1_1 = null;
						}
					}
				} else {
					local223 = this.aClass2_Sub3_Sub14_Sub1_1.aClass2_Sub26_8.aByteArray72.length - this.aClass2_Sub3_Sub14_Sub1_1.aByte14;
					local252 = 512 - this.aClass2_Sub3_Sub14_Sub1_1.anInt3083;
					if (local223 - this.aClass2_Sub3_Sub14_Sub1_1.aClass2_Sub26_8.anInt5328 < local252) {
						local252 = local223 - this.aClass2_Sub3_Sub14_Sub1_1.aClass2_Sub26_8.anInt5328;
					}
					if (local252 > local178) {
						local252 = local178;
					}
					this.aClass45_2.method1048(local252, this.aClass2_Sub3_Sub14_Sub1_1.aClass2_Sub26_8.anInt5328, this.aClass2_Sub3_Sub14_Sub1_1.aClass2_Sub26_8.aByteArray72);
					if (this.aByte13 != 0) {
						for (local315 = 0; local315 < local252; local315++) {
							this.aClass2_Sub3_Sub14_Sub1_1.aClass2_Sub26_8.aByteArray72[this.aClass2_Sub3_Sub14_Sub1_1.aClass2_Sub26_8.anInt5328 + local315] ^= this.aByte13;
						}
					}
					this.aClass2_Sub3_Sub14_Sub1_1.aClass2_Sub26_8.anInt5328 += local252;
					this.aClass2_Sub3_Sub14_Sub1_1.anInt3083 += local252;
					if (this.aClass2_Sub3_Sub14_Sub1_1.aClass2_Sub26_8.anInt5328 == local223) {
						this.aClass2_Sub3_Sub14_Sub1_1.method4613();
						this.aClass2_Sub3_Sub14_Sub1_1.aBoolean320 = false;
						this.aClass2_Sub3_Sub14_Sub1_1 = null;
					} else if (this.aClass2_Sub3_Sub14_Sub1_1.anInt3083 == 512) {
						this.aClass2_Sub3_Sub14_Sub1_1.anInt3083 = 0;
					}
				}
			}
			return true;
		} catch (@Pc(625) IOException local625) {
			try {
				this.aClass45_2.method1045();
			} catch (@Pc(631) Exception local631) {
			}
			this.anInt2282++;
			this.anInt2283 = -2;
			this.aClass45_2 = null;
			return this.method1962() == 0 && this.method1961() == 0;
		}
	}

	@OriginalMember(owner = "client!ig", name = "d", descriptor = "(I)V")
	public void method1954() {
		try {
			this.aClass45_2.method1045();
		} catch (@Pc(5) Exception local5) {
		}
		this.aByte13 = (byte) (Math.random() * 255.0D + 1.0D);
		this.aClass45_2 = null;
		this.anInt2282++;
		this.anInt2283 = -1;
	}

	@OriginalMember(owner = "client!ig", name = "e", descriptor = "(I)Z")
	public boolean method1955() {
		return this.method1961() >= 20;
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(Z)Z")
	public boolean method1957() {
		return this.method1962() >= 20;
	}

	@OriginalMember(owner = "client!ig", name = "f", descriptor = "(I)V")
	public void method1958() {
		if (this.aClass45_2 == null) {
			return;
		}
		try {
			this.aClass2_Sub26_5.anInt5328 = 0;
			this.aClass2_Sub26_5.method4239(7);
			this.aClass2_Sub26_5.method4258(0);
			this.aClass45_2.method1043(4, this.aClass2_Sub26_5.aByteArray72);
		} catch (@Pc(40) IOException local40) {
			try {
				this.aClass45_2.method1045();
			} catch (@Pc(48) Exception local48) {
			}
			this.anInt2282++;
			this.aClass45_2 = null;
			this.anInt2283 = -2;
		}
	}

	@OriginalMember(owner = "client!ig", name = "b", descriptor = "(B)V")
	public void method1959() {
		if (this.aClass45_2 != null) {
			this.aClass45_2.method1045();
		}
	}

	@OriginalMember(owner = "client!ig", name = "c", descriptor = "(B)V")
	public void method1960() {
		if (this.aClass45_2 != null) {
			this.aClass45_2.method1042();
		}
	}

	@OriginalMember(owner = "client!ig", name = "g", descriptor = "(I)I")
	private int method1961() {
		return this.aClass144_8.method3660() + this.aClass144_9.method3660();
	}

	@OriginalMember(owner = "client!ig", name = "b", descriptor = "(Z)I")
	public int method1962() {
		return this.aClass144_6.method3660() + this.aClass144_7.method3660();
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(Lclient!e;ZB)V")
	public void method1963(@OriginalArg(0) Class45 arg0, @OriginalArg(1) boolean arg1) {
		if (this.aClass45_2 != null) {
			try {
				this.aClass45_2.method1045();
			} catch (@Pc(16) Exception local16) {
			}
			this.aClass45_2 = null;
		}
		this.aClass45_2 = arg0;
		this.method1951();
		this.method1950(arg1);
		this.aClass2_Sub26_6.anInt5328 = 0;
		this.aClass2_Sub3_Sub14_Sub1_1 = null;
		while (true) {
			@Pc(46) Class2_Sub3_Sub14_Sub1 local46 = (Class2_Sub3_Sub14_Sub1) this.aClass144_7.method3665();
			if (local46 == null) {
				while (true) {
					local46 = (Class2_Sub3_Sub14_Sub1) this.aClass144_9.method3665();
					if (local46 == null) {
						if (this.aByte13 != 0) {
							try {
								this.aClass2_Sub26_5.anInt5328 = 0;
								this.aClass2_Sub26_5.method4239(4);
								this.aClass2_Sub26_5.method4239(this.aByte13);
								this.aClass2_Sub26_5.method4231(0);
								this.aClass45_2.method1043(4, this.aClass2_Sub26_5.aByteArray72);
							} catch (@Pc(110) IOException local110) {
								try {
									this.aClass45_2.method1045();
								} catch (@Pc(118) Exception local118) {
								}
								this.anInt2283 = -2;
								this.aClass45_2 = null;
								this.anInt2282++;
							}
						}
						this.anInt2281 = 0;
						this.aLong115 = Static6.method126();
						return;
					}
					this.aClass144_8.method3662(local46);
				}
			}
			this.aClass144_6.method3662(local46);
		}
	}
}
