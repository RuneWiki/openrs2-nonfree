import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ul")
public final class Class205 {

	@OriginalMember(owner = "client!ul", name = "w", descriptor = "Lclient!pr;")
	private Class158 aClass158_4;

	@OriginalMember(owner = "client!ul", name = "x", descriptor = "J")
	private long aLong193;

	@OriginalMember(owner = "client!ul", name = "z", descriptor = "I")
	private int anInt6109;

	@OriginalMember(owner = "client!ul", name = "E", descriptor = "Lclient!fc;")
	private Class1_Sub1_Sub1_Sub2 aClass1_Sub1_Sub1_Sub2_2;

	@OriginalMember(owner = "client!ul", name = "o", descriptor = "Lclient!ad;")
	private final Class4 aClass4_9 = new Class4();

	@OriginalMember(owner = "client!ul", name = "r", descriptor = "Lclient!ad;")
	private final Class4 aClass4_10 = new Class4();

	@OriginalMember(owner = "client!ul", name = "s", descriptor = "Lclient!ad;")
	private final Class4 aClass4_11 = new Class4();

	@OriginalMember(owner = "client!ul", name = "v", descriptor = "Lclient!ad;")
	private final Class4 aClass4_12 = new Class4();

	@OriginalMember(owner = "client!ul", name = "y", descriptor = "Lclient!eb;")
	private final Class1_Sub7 aClass1_Sub7_10 = new Class1_Sub7(4);

	@OriginalMember(owner = "client!ul", name = "B", descriptor = "I")
	public volatile int anInt6111 = 0;

	@OriginalMember(owner = "client!ul", name = "D", descriptor = "B")
	private byte aByte66 = 0;

	@OriginalMember(owner = "client!ul", name = "A", descriptor = "I")
	public volatile int anInt6110 = 0;

	@OriginalMember(owner = "client!ul", name = "C", descriptor = "Lclient!eb;")
	private final Class1_Sub7 aClass1_Sub7_11 = new Class1_Sub7(8);

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(I)V")
	public void method5338() {
		try {
			this.aClass158_4.method4339();
		} catch (@Pc(9) Exception local9) {
		}
		this.aByte66 = (byte) (Math.random() * 255.0D + 1.0D);
		this.anInt6111++;
		this.aClass158_4 = null;
		this.anInt6110 = -1;
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(B)V")
	public void method5339() {
		if (this.aClass158_4 != null) {
			this.aClass158_4.method4336();
		}
	}

	@OriginalMember(owner = "client!ul", name = "b", descriptor = "(I)Z")
	public boolean method5340() {
		return this.method5347() >= 20;
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(ZLclient!pr;B)V")
	public void method5342(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class158 arg1) {
		if (this.aClass158_4 != null) {
			try {
				this.aClass158_4.method4339();
			} catch (@Pc(14) Exception local14) {
			}
			this.aClass158_4 = null;
		}
		this.aClass158_4 = arg1;
		this.method5344();
		this.method5351(arg0);
		this.aClass1_Sub7_11.anInt3368 = 0;
		this.aClass1_Sub1_Sub1_Sub2_2 = null;
		while (true) {
			@Pc(40) Class1_Sub1_Sub1_Sub2 local40 = (Class1_Sub1_Sub1_Sub2) this.aClass4_10.method183();
			if (local40 == null) {
				while (true) {
					local40 = (Class1_Sub1_Sub1_Sub2) this.aClass4_12.method183();
					if (local40 == null) {
						if (this.aByte66 != 0) {
							try {
								this.aClass1_Sub7_10.anInt3368 = 0;
								this.aClass1_Sub7_10.method3108(4);
								this.aClass1_Sub7_10.method3108(this.aByte66);
								this.aClass1_Sub7_10.method3128(0);
								this.aClass158_4.method4325(this.aClass1_Sub7_10.aByteArray58, 4);
							} catch (@Pc(98) IOException local98) {
								try {
									this.aClass158_4.method4339();
								} catch (@Pc(104) Exception local104) {
								}
								this.anInt6110 = -2;
								this.anInt6111++;
								this.aClass158_4 = null;
							}
						}
						this.anInt6109 = 0;
						this.aLong193 = Static349.method5647();
						return;
					}
					this.aClass4_11.method180(local40);
				}
			}
			this.aClass4_9.method180(local40);
		}
	}

	@OriginalMember(owner = "client!ul", name = "b", descriptor = "(B)Z")
	public boolean method5343() {
		@Pc(18) int local18;
		if (this.aClass158_4 != null) {
			@Pc(11) long local11 = Static349.method5647();
			local18 = (int) (local11 - this.aLong193);
			this.aLong193 = local11;
			if (local18 > 200) {
				local18 = 200;
			}
			this.anInt6109 += local18;
			if (this.anInt6109 > 30000) {
				try {
					this.aClass158_4.method4339();
				} catch (@Pc(44) Exception local44) {
				}
				this.aClass158_4 = null;
			}
		}
		if (this.aClass158_4 == null) {
			return this.method5347() == 0 && this.method5349() == 0;
		}
		try {
			this.aClass158_4.method4334();
			for (@Pc(75) Class1_Sub1_Sub1_Sub2 local75 = (Class1_Sub1_Sub1_Sub2) this.aClass4_9.method177(); local75 != null; local75 = (Class1_Sub1_Sub1_Sub2) this.aClass4_9.method182()) {
				this.aClass1_Sub7_10.anInt3368 = 0;
				this.aClass1_Sub7_10.method3108(1);
				this.aClass1_Sub7_10.method3117((int) local75.aLong208);
				this.aClass158_4.method4325(this.aClass1_Sub7_10.aByteArray58, 4);
				this.aClass4_10.method180(local75);
			}
			for (@Pc(123) Class1_Sub1_Sub1_Sub2 local123 = (Class1_Sub1_Sub1_Sub2) this.aClass4_11.method177(); local123 != null; local123 = (Class1_Sub1_Sub1_Sub2) this.aClass4_11.method182()) {
				this.aClass1_Sub7_10.anInt3368 = 0;
				this.aClass1_Sub7_10.method3108(0);
				this.aClass1_Sub7_10.method3117((int) local123.aLong208);
				this.aClass158_4.method4325(this.aClass1_Sub7_10.aByteArray58, 4);
				this.aClass4_12.method180(local123);
			}
			for (local18 = 0; local18 < 100; local18++) {
				@Pc(180) int local180 = this.aClass158_4.method4326();
				if (local180 < 0) {
					throw new IOException();
				}
				if (local180 == 0) {
					break;
				}
				this.anInt6109 = 0;
				@Pc(199) byte local199 = 0;
				if (this.aClass1_Sub1_Sub1_Sub2_2 == null) {
					local199 = 8;
				} else if (this.aClass1_Sub1_Sub1_Sub2_2.anInt1737 == 0) {
					local199 = 1;
				}
				@Pc(230) int local230;
				@Pc(237) int local237;
				@Pc(276) int local276;
				if (local199 <= 0) {
					local230 = this.aClass1_Sub1_Sub1_Sub2_2.aClass1_Sub7_4.aByteArray58.length - this.aClass1_Sub1_Sub1_Sub2_2.aByte12;
					local237 = 512 - this.aClass1_Sub1_Sub1_Sub2_2.anInt1737;
					if (local237 > local230 - this.aClass1_Sub1_Sub1_Sub2_2.aClass1_Sub7_4.anInt3368) {
						local237 = local230 - this.aClass1_Sub1_Sub1_Sub2_2.aClass1_Sub7_4.anInt3368;
					}
					if (local180 < local237) {
						local237 = local180;
					}
					this.aClass158_4.method4330(local237, this.aClass1_Sub1_Sub1_Sub2_2.aClass1_Sub7_4.aByteArray58, this.aClass1_Sub1_Sub1_Sub2_2.aClass1_Sub7_4.anInt3368);
					if (this.aByte66 != 0) {
						for (local276 = 0; local276 < local237; local276++) {
							this.aClass1_Sub1_Sub1_Sub2_2.aClass1_Sub7_4.aByteArray58[this.aClass1_Sub1_Sub1_Sub2_2.aClass1_Sub7_4.anInt3368 + local276] = (byte) (this.aClass1_Sub1_Sub1_Sub2_2.aClass1_Sub7_4.aByteArray58[this.aClass1_Sub1_Sub1_Sub2_2.aClass1_Sub7_4.anInt3368 + local276] ^ this.aByte66);
						}
					}
					this.aClass1_Sub1_Sub1_Sub2_2.aClass1_Sub7_4.anInt3368 += local237;
					this.aClass1_Sub1_Sub1_Sub2_2.anInt1737 += local237;
					if (local230 == this.aClass1_Sub1_Sub1_Sub2_2.aClass1_Sub7_4.anInt3368) {
						this.aClass1_Sub1_Sub1_Sub2_2.method5564();
						this.aClass1_Sub1_Sub1_Sub2_2.aBoolean154 = false;
						this.aClass1_Sub1_Sub1_Sub2_2 = null;
					} else if (this.aClass1_Sub1_Sub1_Sub2_2.anInt1737 == 512) {
						this.aClass1_Sub1_Sub1_Sub2_2.anInt1737 = 0;
					}
				} else {
					local230 = local199 - this.aClass1_Sub7_11.anInt3368;
					if (local230 > local180) {
						local230 = local180;
					}
					this.aClass158_4.method4330(local230, this.aClass1_Sub7_11.aByteArray58, this.aClass1_Sub7_11.anInt3368);
					if (this.aByte66 != 0) {
						for (local237 = 0; local237 < local230; local237++) {
							this.aClass1_Sub7_11.aByteArray58[local237 + this.aClass1_Sub7_11.anInt3368] ^= this.aByte66;
						}
					}
					this.aClass1_Sub7_11.anInt3368 += local230;
					if (this.aClass1_Sub7_11.anInt3368 >= local199) {
						if (this.aClass1_Sub1_Sub1_Sub2_2 == null) {
							this.aClass1_Sub7_11.anInt3368 = 0;
							local237 = this.aClass1_Sub7_11.method3141();
							local276 = this.aClass1_Sub7_11.method3115();
							@Pc(456) int local456 = this.aClass1_Sub7_11.method3141();
							@Pc(461) int local461 = this.aClass1_Sub7_11.method3125();
							@Pc(465) int local465 = local456 & 0x7F;
							@Pc(476) boolean local476 = (local456 & 0x80) != 0;
							@Pc(484) long local484 = (long) ((local237 << 16) + local276);
							@Pc(494) Class1_Sub1_Sub1_Sub2 local494;
							if (local476) {
								for (local494 = (Class1_Sub1_Sub1_Sub2) this.aClass4_12.method177(); local494 != null && local494.aLong208 != local484; local494 = (Class1_Sub1_Sub1_Sub2) this.aClass4_12.method182()) {
								}
							} else {
								for (local494 = (Class1_Sub1_Sub1_Sub2) this.aClass4_10.method177(); local494 != null && local484 != local494.aLong208; local494 = (Class1_Sub1_Sub1_Sub2) this.aClass4_10.method182()) {
								}
							}
							if (local494 == null) {
								throw new IOException();
							}
							@Pc(550) int local550 = local465 == 0 ? 5 : 9;
							this.aClass1_Sub1_Sub1_Sub2_2 = local494;
							this.aClass1_Sub1_Sub1_Sub2_2.aClass1_Sub7_4 = new Class1_Sub7(local550 + local461 + this.aClass1_Sub1_Sub1_Sub2_2.aByte12);
							this.aClass1_Sub1_Sub1_Sub2_2.aClass1_Sub7_4.method3108(local465);
							this.aClass1_Sub1_Sub1_Sub2_2.aClass1_Sub7_4.method3098(local461);
							this.aClass1_Sub1_Sub1_Sub2_2.anInt1737 = 8;
							this.aClass1_Sub7_11.anInt3368 = 0;
						} else if (this.aClass1_Sub1_Sub1_Sub2_2.anInt1737 != 0) {
							throw new IOException();
						} else if (this.aClass1_Sub7_11.aByteArray58[0] == -1) {
							this.aClass1_Sub1_Sub1_Sub2_2.anInt1737 = 1;
							this.aClass1_Sub7_11.anInt3368 = 0;
						} else {
							this.aClass1_Sub1_Sub1_Sub2_2 = null;
						}
					}
				}
			}
			return true;
		} catch (@Pc(631) IOException local631) {
			try {
				this.aClass158_4.method4339();
			} catch (@Pc(637) Exception local637) {
			}
			this.anInt6110 = -2;
			this.aClass158_4 = null;
			this.anInt6111++;
			return this.method5347() == 0 && this.method5349() == 0;
		}
	}

	@OriginalMember(owner = "client!ul", name = "c", descriptor = "(B)V")
	private void method5344() {
		if (this.aClass158_4 == null) {
			return;
		}
		try {
			this.aClass1_Sub7_10.anInt3368 = 0;
			this.aClass1_Sub7_10.method3108(6);
			this.aClass1_Sub7_10.method3117(3);
			this.aClass158_4.method4325(this.aClass1_Sub7_10.aByteArray58, 4);
		} catch (@Pc(40) IOException local40) {
			try {
				this.aClass158_4.method4339();
			} catch (@Pc(46) Exception local46) {
			}
			this.anInt6111++;
			this.aClass158_4 = null;
			this.anInt6110 = -2;
		}
	}

	@OriginalMember(owner = "client!ul", name = "d", descriptor = "(B)V")
	public void method5345() {
		if (this.aClass158_4 != null) {
			this.aClass158_4.method4339();
		}
	}

	@OriginalMember(owner = "client!ul", name = "e", descriptor = "(B)I")
	public int method5347() {
		return this.aClass4_9.method178() + this.aClass4_10.method178();
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(Z)V")
	public void method5348() {
		if (this.aClass158_4 == null) {
			return;
		}
		try {
			this.aClass1_Sub7_10.anInt3368 = 0;
			this.aClass1_Sub7_10.method3108(7);
			this.aClass1_Sub7_10.method3117(0);
			this.aClass158_4.method4325(this.aClass1_Sub7_10.aByteArray58, 4);
		} catch (@Pc(39) IOException local39) {
			try {
				this.aClass158_4.method4339();
			} catch (@Pc(45) Exception local45) {
			}
			this.anInt6111++;
			this.anInt6110 = -2;
			this.aClass158_4 = null;
		}
	}

	@OriginalMember(owner = "client!ul", name = "d", descriptor = "(I)I")
	private int method5349() {
		return this.aClass4_11.method178() + this.aClass4_12.method178();
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(IZIIB)Lclient!fc;")
	public Class1_Sub1_Sub1_Sub2 method5350(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(4) byte arg3) {
		@Pc(11) long local11 = (long) ((arg0 << 16) + arg2);
		@Pc(15) Class1_Sub1_Sub1_Sub2 local15 = new Class1_Sub1_Sub1_Sub2();
		local15.aByte12 = arg3;
		local15.aBoolean155 = arg1;
		local15.aLong208 = local11;
		if (arg1) {
			if (this.method5347() >= 20) {
				throw new RuntimeException();
			}
			this.aClass4_9.method180(local15);
		} else if (this.method5349() < 20) {
			this.aClass4_11.method180(local15);
		} else {
			throw new RuntimeException();
		}
		return local15;
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(ZI)V")
	public void method5351(@OriginalArg(0) boolean arg0) {
		if (this.aClass158_4 == null) {
			return;
		}
		try {
			this.aClass1_Sub7_10.anInt3368 = 0;
			this.aClass1_Sub7_10.method3108(arg0 ? 2 : 3);
			this.aClass1_Sub7_10.method3117(0);
			this.aClass158_4.method4325(this.aClass1_Sub7_10.aByteArray58, 4);
		} catch (@Pc(40) IOException local40) {
			try {
				this.aClass158_4.method4339();
			} catch (@Pc(46) Exception local46) {
			}
			this.anInt6111++;
			this.anInt6110 = -2;
			this.aClass158_4 = null;
		}
	}

	@OriginalMember(owner = "client!ul", name = "f", descriptor = "(B)Z")
	public boolean method5352() {
		return this.method5349() >= 20;
	}
}
