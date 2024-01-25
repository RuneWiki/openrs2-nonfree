import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ue")
public final class Class331 {

	@OriginalMember(owner = "client!ue", name = "y", descriptor = "J")
	private long aLong242;

	@OriginalMember(owner = "client!ue", name = "z", descriptor = "I")
	private int anInt8368;

	@OriginalMember(owner = "client!ue", name = "A", descriptor = "Lclient!qt;")
	private Class277 aClass277_3;

	@OriginalMember(owner = "client!ue", name = "G", descriptor = "Lclient!ft;")
	private Class3_Sub3_Sub2_Sub1 aClass3_Sub3_Sub2_Sub1_2;

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "Lclient!cba;")
	private final Class38 aClass38_7 = new Class38();

	@OriginalMember(owner = "client!ue", name = "t", descriptor = "Lclient!cba;")
	private final Class38 aClass38_8 = new Class38();

	@OriginalMember(owner = "client!ue", name = "w", descriptor = "Lclient!cba;")
	private final Class38 aClass38_9 = new Class38();

	@OriginalMember(owner = "client!ue", name = "x", descriptor = "Lclient!cba;")
	private final Class38 aClass38_10 = new Class38();

	@OriginalMember(owner = "client!ue", name = "B", descriptor = "Lclient!qh;")
	private final Class3_Sub11 aClass3_Sub11_6 = new Class3_Sub11(4);

	@OriginalMember(owner = "client!ue", name = "D", descriptor = "B")
	private byte aByte119 = 0;

	@OriginalMember(owner = "client!ue", name = "E", descriptor = "I")
	public volatile int anInt8370 = 0;

	@OriginalMember(owner = "client!ue", name = "C", descriptor = "I")
	public volatile int anInt8369 = 0;

	@OriginalMember(owner = "client!ue", name = "F", descriptor = "Lclient!qh;")
	private final Class3_Sub11 aClass3_Sub11_7 = new Class3_Sub11(8);

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(B)Z")
	public boolean method6999() {
		@Pc(17) int local17;
		if (this.aClass277_3 != null) {
			@Pc(11) long local11 = Static587.method7753();
			local17 = (int) (local11 - this.aLong242);
			this.aLong242 = local11;
			if (local17 > 200) {
				local17 = 200;
			}
			this.anInt8368 += local17;
			if (this.anInt8368 > 30000) {
				try {
					this.aClass277_3.method6187();
				} catch (@Pc(45) Exception local45) {
				}
				this.aClass277_3 = null;
			}
		}
		if (this.aClass277_3 == null) {
			return this.method7004() == 0 && this.method7007() == 0;
		}
		try {
			this.aClass277_3.method6184();
			for (@Pc(84) Class3_Sub3_Sub2_Sub1 local84 = (Class3_Sub3_Sub2_Sub1) this.aClass38_7.method1070(); local84 != null; local84 = (Class3_Sub3_Sub2_Sub1) this.aClass38_7.method1072()) {
				this.aClass3_Sub11_6.anInt3520 = 0;
				this.aClass3_Sub11_6.method3079(1);
				this.aClass3_Sub11_6.method3077((int) local84.aLong265);
				this.aClass277_3.method6185(4, this.aClass3_Sub11_6.aByteArray36);
				this.aClass38_8.method1069(local84);
			}
			for (@Pc(132) Class3_Sub3_Sub2_Sub1 local132 = (Class3_Sub3_Sub2_Sub1) this.aClass38_9.method1070(); local132 != null; local132 = (Class3_Sub3_Sub2_Sub1) this.aClass38_9.method1072()) {
				this.aClass3_Sub11_6.anInt3520 = 0;
				this.aClass3_Sub11_6.method3079(0);
				this.aClass3_Sub11_6.method3077((int) local132.aLong265);
				this.aClass277_3.method6185(4, this.aClass3_Sub11_6.aByteArray36);
				this.aClass38_10.method1069(local132);
			}
			for (local17 = 0; local17 < 100; local17++) {
				@Pc(190) int local190 = this.aClass277_3.method6183();
				if (local190 < 0) {
					throw new IOException();
				}
				if (local190 == 0) {
					break;
				}
				this.anInt8368 = 0;
				@Pc(206) byte local206 = 0;
				if (this.aClass3_Sub3_Sub2_Sub1_2 == null) {
					local206 = 8;
				} else if (this.aClass3_Sub3_Sub2_Sub1_2.anInt3161 == 0) {
					local206 = 1;
				}
				@Pc(238) int local238;
				@Pc(244) int local244;
				@Pc(293) int local293;
				if (local206 <= 0) {
					local238 = this.aClass3_Sub3_Sub2_Sub1_2.aClass3_Sub11_1.aByteArray36.length - this.aClass3_Sub3_Sub2_Sub1_2.aByte45;
					local244 = 512 - this.aClass3_Sub3_Sub2_Sub1_2.anInt3161;
					if (local244 > local238 - this.aClass3_Sub3_Sub2_Sub1_2.aClass3_Sub11_1.anInt3520) {
						local244 = local238 - this.aClass3_Sub3_Sub2_Sub1_2.aClass3_Sub11_1.anInt3520;
					}
					if (local190 < local244) {
						local244 = local190;
					}
					this.aClass277_3.method6182(this.aClass3_Sub3_Sub2_Sub1_2.aClass3_Sub11_1.aByteArray36, local244, this.aClass3_Sub3_Sub2_Sub1_2.aClass3_Sub11_1.anInt3520);
					if (this.aByte119 != 0) {
						for (local293 = 0; local293 < local244; local293++) {
							this.aClass3_Sub3_Sub2_Sub1_2.aClass3_Sub11_1.aByteArray36[this.aClass3_Sub3_Sub2_Sub1_2.aClass3_Sub11_1.anInt3520 + local293] ^= this.aByte119;
						}
					}
					this.aClass3_Sub3_Sub2_Sub1_2.anInt3161 += local244;
					this.aClass3_Sub3_Sub2_Sub1_2.aClass3_Sub11_1.anInt3520 += local244;
					if (local238 == this.aClass3_Sub3_Sub2_Sub1_2.aClass3_Sub11_1.anInt3520) {
						this.aClass3_Sub3_Sub2_Sub1_2.method7720();
						this.aClass3_Sub3_Sub2_Sub1_2.aBoolean507 = false;
						this.aClass3_Sub3_Sub2_Sub1_2 = null;
					} else if (this.aClass3_Sub3_Sub2_Sub1_2.anInt3161 == 512) {
						this.aClass3_Sub3_Sub2_Sub1_2.anInt3161 = 0;
					}
				} else {
					local238 = local206 - this.aClass3_Sub11_7.anInt3520;
					if (local238 > local190) {
						local238 = local190;
					}
					this.aClass277_3.method6182(this.aClass3_Sub11_7.aByteArray36, local238, this.aClass3_Sub11_7.anInt3520);
					if (this.aByte119 != 0) {
						for (local244 = 0; local244 < local238; local244++) {
							this.aClass3_Sub11_7.aByteArray36[this.aClass3_Sub11_7.anInt3520 + local244] ^= this.aByte119;
						}
					}
					this.aClass3_Sub11_7.anInt3520 += local238;
					if (this.aClass3_Sub11_7.anInt3520 >= local206) {
						if (this.aClass3_Sub3_Sub2_Sub1_2 == null) {
							this.aClass3_Sub11_7.anInt3520 = 0;
							local244 = this.aClass3_Sub11_7.method3118();
							local293 = this.aClass3_Sub11_7.method3109();
							@Pc(472) int local472 = this.aClass3_Sub11_7.method3118();
							@Pc(477) int local477 = this.aClass3_Sub11_7.method3116();
							@Pc(481) int local481 = local472 & 0x7F;
							@Pc(492) boolean local492 = (local472 & 0x80) != 0;
							@Pc(499) long local499 = (long) ((local244 << 16) + local293);
							@Pc(509) Class3_Sub3_Sub2_Sub1 local509;
							if (local492) {
								for (local509 = (Class3_Sub3_Sub2_Sub1) this.aClass38_10.method1070(); local509 != null && local509.aLong265 != local499; local509 = (Class3_Sub3_Sub2_Sub1) this.aClass38_10.method1072()) {
								}
							} else {
								for (local509 = (Class3_Sub3_Sub2_Sub1) this.aClass38_8.method1070(); local509 != null && local509.aLong265 != local499; local509 = (Class3_Sub3_Sub2_Sub1) this.aClass38_8.method1072()) {
								}
							}
							if (local509 == null) {
								throw new IOException();
							}
							this.aClass3_Sub3_Sub2_Sub1_2 = local509;
							@Pc(571) int local571 = local481 == 0 ? 5 : 9;
							this.aClass3_Sub3_Sub2_Sub1_2.aClass3_Sub11_1 = new Class3_Sub11(local571 + local477 + this.aClass3_Sub3_Sub2_Sub1_2.aByte45);
							this.aClass3_Sub3_Sub2_Sub1_2.aClass3_Sub11_1.method3079(local481);
							this.aClass3_Sub3_Sub2_Sub1_2.aClass3_Sub11_1.method3101(local477);
							this.aClass3_Sub11_7.anInt3520 = 0;
							this.aClass3_Sub3_Sub2_Sub1_2.anInt3161 = 8;
						} else if (this.aClass3_Sub3_Sub2_Sub1_2.anInt3161 != 0) {
							throw new IOException();
						} else if (this.aClass3_Sub11_7.aByteArray36[0] == -1) {
							this.aClass3_Sub11_7.anInt3520 = 0;
							this.aClass3_Sub3_Sub2_Sub1_2.anInt3161 = 1;
						} else {
							this.aClass3_Sub3_Sub2_Sub1_2 = null;
						}
					}
				}
			}
			return true;
		} catch (@Pc(646) IOException local646) {
			try {
				this.aClass277_3.method6187();
			} catch (@Pc(652) Exception local652) {
			}
			this.anInt8370++;
			this.aClass277_3 = null;
			this.anInt8369 = -2;
			return this.method7004() == 0 && this.method7007() == 0;
		}
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(BBIZI)Lclient!ft;")
	public Class3_Sub3_Sub2_Sub1 method7000(@OriginalArg(0) byte arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3) {
		@Pc(10) long local10 = (long) ((arg3 << 16) + arg1);
		@Pc(14) Class3_Sub3_Sub2_Sub1 local14 = new Class3_Sub3_Sub2_Sub1();
		local14.aByte45 = arg0;
		local14.aBoolean508 = arg2;
		local14.aLong265 = local10;
		if (arg2) {
			if (this.method7004() >= 20) {
				throw new RuntimeException();
			}
			this.aClass38_7.method1069(local14);
		} else if (this.method7007() < 20) {
			this.aClass38_9.method1069(local14);
		} else {
			throw new RuntimeException();
		}
		return local14;
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(Z)V")
	public void method7001() {
		if (this.aClass277_3 != null) {
			this.aClass277_3.method6186();
		}
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(I)V")
	public void method7002() {
		if (this.aClass277_3 != null) {
			this.aClass277_3.method6187();
		}
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(ZILclient!qt;)V")
	public void method7003(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class277 arg1) {
		if (this.aClass277_3 != null) {
			try {
				this.aClass277_3.method6187();
			} catch (@Pc(14) Exception local14) {
			}
			this.aClass277_3 = null;
		}
		this.aClass277_3 = arg1;
		this.method7012();
		this.method7013(arg0);
		this.aClass3_Sub3_Sub2_Sub1_2 = null;
		this.aClass3_Sub11_7.anInt3520 = 0;
		while (true) {
			@Pc(44) Class3_Sub3_Sub2_Sub1 local44 = (Class3_Sub3_Sub2_Sub1) this.aClass38_8.method1073();
			if (local44 == null) {
				while (true) {
					local44 = (Class3_Sub3_Sub2_Sub1) this.aClass38_10.method1073();
					if (local44 == null) {
						if (this.aByte119 != 0) {
							try {
								this.aClass3_Sub11_6.anInt3520 = 0;
								this.aClass3_Sub11_6.method3079(4);
								this.aClass3_Sub11_6.method3079(this.aByte119);
								this.aClass3_Sub11_6.method3131(0);
								this.aClass277_3.method6185(4, this.aClass3_Sub11_6.aByteArray36);
							} catch (@Pc(102) IOException local102) {
								try {
									this.aClass277_3.method6187();
								} catch (@Pc(108) Exception local108) {
								}
								this.anInt8369 = -2;
								this.aClass277_3 = null;
								this.anInt8370++;
							}
						}
						this.anInt8368 = 0;
						this.aLong242 = Static587.method7753();
						return;
					}
					this.aClass38_9.method1069(local44);
				}
			}
			this.aClass38_7.method1069(local44);
		}
	}

	@OriginalMember(owner = "client!ue", name = "b", descriptor = "(I)I")
	public int method7004() {
		return this.aClass38_7.method1071() + this.aClass38_8.method1071();
	}

	@OriginalMember(owner = "client!ue", name = "c", descriptor = "(I)Z")
	public boolean method7005() {
		return this.method7004() >= 20;
	}

	@OriginalMember(owner = "client!ue", name = "d", descriptor = "(I)Z")
	public boolean method7006() {
		return this.method7007() >= 20;
	}

	@OriginalMember(owner = "client!ue", name = "e", descriptor = "(I)I")
	private int method7007() {
		return this.aClass38_9.method1071() + this.aClass38_10.method1071();
	}

	@OriginalMember(owner = "client!ue", name = "b", descriptor = "(B)V")
	public void method7009() {
		if (this.aClass277_3 == null) {
			return;
		}
		try {
			this.aClass3_Sub11_6.anInt3520 = 0;
			this.aClass3_Sub11_6.method3079(7);
			this.aClass3_Sub11_6.method3077(0);
			this.aClass277_3.method6185(4, this.aClass3_Sub11_6.aByteArray36);
		} catch (@Pc(39) IOException local39) {
			try {
				this.aClass277_3.method6187();
			} catch (@Pc(45) Exception local45) {
			}
			this.anInt8370++;
			this.aClass277_3 = null;
			this.anInt8369 = -2;
		}
	}

	@OriginalMember(owner = "client!ue", name = "c", descriptor = "(B)V")
	private void method7012() {
		if (this.aClass277_3 == null) {
			return;
		}
		try {
			this.aClass3_Sub11_6.anInt3520 = 0;
			this.aClass3_Sub11_6.method3079(6);
			this.aClass3_Sub11_6.method3077(3);
			this.aClass277_3.method6185(4, this.aClass3_Sub11_6.aByteArray36);
		} catch (@Pc(36) IOException local36) {
			try {
				this.aClass277_3.method6187();
			} catch (@Pc(42) Exception local42) {
			}
			this.anInt8370++;
			this.aClass277_3 = null;
			this.anInt8369 = -2;
		}
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(BZ)V")
	public void method7013(@OriginalArg(1) boolean arg0) {
		if (this.aClass277_3 == null) {
			return;
		}
		try {
			this.aClass3_Sub11_6.anInt3520 = 0;
			this.aClass3_Sub11_6.method3079(arg0 ? 2 : 3);
			this.aClass3_Sub11_6.method3077(0);
			this.aClass277_3.method6185(4, this.aClass3_Sub11_6.aByteArray36);
		} catch (@Pc(40) IOException local40) {
			try {
				this.aClass277_3.method6187();
			} catch (@Pc(46) Exception local46) {
			}
			this.anInt8369 = -2;
			this.aClass277_3 = null;
			this.anInt8370++;
		}
	}

	@OriginalMember(owner = "client!ue", name = "d", descriptor = "(B)V")
	public void method7014() {
		try {
			this.aClass277_3.method6187();
		} catch (@Pc(5) Exception local5) {
		}
		this.anInt8369 = -1;
		this.aByte119 = (byte) (Math.random() * 255.0D + 1.0D);
		this.anInt8370++;
		this.aClass277_3 = null;
	}
}
