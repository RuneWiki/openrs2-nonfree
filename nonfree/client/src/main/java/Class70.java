import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ho")
public final class Class70 {

	@OriginalMember(owner = "client!ho", name = "z", descriptor = "J")
	private long aLong85;

	@OriginalMember(owner = "client!ho", name = "B", descriptor = "I")
	private int anInt2164;

	@OriginalMember(owner = "client!ho", name = "C", descriptor = "Lclient!kh;")
	private Class91 aClass91_2;

	@OriginalMember(owner = "client!ho", name = "H", descriptor = "Lclient!vg;")
	private Class4_Sub2_Sub1_Sub2 aClass4_Sub2_Sub1_Sub2_2;

	@OriginalMember(owner = "client!ho", name = "o", descriptor = "Lclient!jo;")
	private Class86 aClass86_3 = new Class86();

	@OriginalMember(owner = "client!ho", name = "u", descriptor = "Lclient!jo;")
	private Class86 aClass86_4 = new Class86();

	@OriginalMember(owner = "client!ho", name = "v", descriptor = "Lclient!jo;")
	private Class86 aClass86_5 = new Class86();

	@OriginalMember(owner = "client!ho", name = "x", descriptor = "Lclient!jo;")
	private Class86 aClass86_6 = new Class86();

	@OriginalMember(owner = "client!ho", name = "y", descriptor = "Lclient!pi;")
	private Class4_Sub24 aClass4_Sub24_18 = new Class4_Sub24(4);

	@OriginalMember(owner = "client!ho", name = "D", descriptor = "B")
	private byte aByte3 = 0;

	@OriginalMember(owner = "client!ho", name = "E", descriptor = "I")
	public volatile int anInt2165 = 0;

	@OriginalMember(owner = "client!ho", name = "F", descriptor = "I")
	public volatile int anInt2166 = 0;

	@OriginalMember(owner = "client!ho", name = "G", descriptor = "Lclient!pi;")
	private Class4_Sub24 aClass4_Sub24_19 = new Class4_Sub24(8);

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(I)V")
	public void method1830() {
		if (this.aClass91_2 != null) {
			this.aClass91_2.method2302();
		}
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(ZZ)V")
	public void method1831(@OriginalArg(1) boolean arg0) {
		if (this.aClass91_2 == null) {
			return;
		}
		try {
			this.aClass4_Sub24_18.anInt3822 = 0;
			this.aClass4_Sub24_18.method3116(arg0 ? 2 : 3);
			this.aClass4_Sub24_18.method3065(0);
			this.aClass91_2.method2303(4, this.aClass4_Sub24_18.aByteArray47);
		} catch (@Pc(38) IOException local38) {
			try {
				this.aClass91_2.method2302();
			} catch (@Pc(44) Exception local44) {
			}
			this.anInt2165++;
			this.anInt2166 = -2;
			this.aClass91_2 = null;
		}
	}

	@OriginalMember(owner = "client!ho", name = "b", descriptor = "(I)I")
	private int method1832() {
		return this.aClass86_5.method2181() + this.aClass86_6.method2181();
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(IZBII)Lclient!vg;")
	public Class4_Sub2_Sub1_Sub2 method1833(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) int arg3) {
		@Pc(10) long local10 = (long) ((arg0 << 16) + arg3);
		@Pc(14) Class4_Sub2_Sub1_Sub2 local14 = new Class4_Sub2_Sub1_Sub2();
		local14.aLong212 = local10;
		local14.aByte22 = arg2;
		local14.aBoolean389 = arg1;
		if (arg1) {
			if (this.method1846() >= 20) {
				throw new RuntimeException();
			}
			this.aClass86_3.method2185(local14);
		} else if (this.method1832() < 20) {
			this.aClass86_5.method2185(local14);
		} else {
			throw new RuntimeException();
		}
		return local14;
	}

	@OriginalMember(owner = "client!ho", name = "c", descriptor = "(I)V")
	public void method1835() {
		try {
			this.aClass91_2.method2302();
		} catch (@Pc(5) Exception local5) {
		}
		this.anInt2165++;
		this.anInt2166 = -1;
		this.aByte3 = (byte) (Math.random() * 255.0D + 1.0D);
		this.aClass91_2 = null;
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(Z)Z")
	public boolean method1838() {
		return this.method1846() >= 20;
	}

	@OriginalMember(owner = "client!ho", name = "b", descriptor = "(B)Z")
	public boolean method1839() {
		if (this.aClass91_2 != null) {
			@Pc(8) long local8 = Static61.method1150();
			@Pc(15) int local15 = (int) (local8 - this.aLong85);
			this.aLong85 = local8;
			if (local15 > 200) {
				local15 = 200;
			}
			this.anInt2164 += local15;
			if (this.anInt2164 > 30000) {
				try {
					this.aClass91_2.method2302();
				} catch (@Pc(44) Exception local44) {
				}
				this.aClass91_2 = null;
			}
		}
		if (this.aClass91_2 == null) {
			return this.method1846() == 0 && this.method1832() == 0;
		}
		try {
			this.aClass91_2.method2295();
			@Pc(78) Class4_Sub2_Sub1_Sub2 local78;
			for (local78 = (Class4_Sub2_Sub1_Sub2) this.aClass86_3.method2183(); local78 != null; local78 = (Class4_Sub2_Sub1_Sub2) this.aClass86_3.method2184()) {
				this.aClass4_Sub24_18.anInt3822 = 0;
				this.aClass4_Sub24_18.method3116(1);
				this.aClass4_Sub24_18.method3065((int) local78.aLong212);
				this.aClass91_2.method2303(4, this.aClass4_Sub24_18.aByteArray47);
				this.aClass86_4.method2185(local78);
			}
			for (local78 = (Class4_Sub2_Sub1_Sub2) this.aClass86_5.method2183(); local78 != null; local78 = (Class4_Sub2_Sub1_Sub2) this.aClass86_5.method2184()) {
				this.aClass4_Sub24_18.anInt3822 = 0;
				this.aClass4_Sub24_18.method3116(0);
				this.aClass4_Sub24_18.method3065((int) local78.aLong212);
				this.aClass91_2.method2303(4, this.aClass4_Sub24_18.aByteArray47);
				this.aClass86_6.method2185(local78);
			}
			for (@Pc(174) int local174 = 0; local174 < 100; local174++) {
				@Pc(184) int local184 = this.aClass91_2.method2300();
				if (local184 < 0) {
					throw new IOException();
				}
				if (local184 == 0) {
					break;
				}
				@Pc(199) byte local199 = 0;
				if (this.aClass4_Sub2_Sub1_Sub2_2 == null) {
					local199 = 8;
				} else if (this.aClass4_Sub2_Sub1_Sub2_2.anInt5626 == 0) {
					local199 = 1;
				}
				this.anInt2164 = 0;
				@Pc(231) int local231;
				@Pc(238) int local238;
				@Pc(289) int local289;
				if (local199 <= 0) {
					local231 = this.aClass4_Sub2_Sub1_Sub2_2.aClass4_Sub24_49.aByteArray47.length - this.aClass4_Sub2_Sub1_Sub2_2.aByte22;
					local238 = 512 - this.aClass4_Sub2_Sub1_Sub2_2.anInt5626;
					if (local238 > local231 - this.aClass4_Sub2_Sub1_Sub2_2.aClass4_Sub24_49.anInt3822) {
						local238 = local231 - this.aClass4_Sub2_Sub1_Sub2_2.aClass4_Sub24_49.anInt3822;
					}
					if (local184 < local238) {
						local238 = local184;
					}
					this.aClass91_2.method2304(this.aClass4_Sub2_Sub1_Sub2_2.aClass4_Sub24_49.aByteArray47, this.aClass4_Sub2_Sub1_Sub2_2.aClass4_Sub24_49.anInt3822, local238);
					if (this.aByte3 != 0) {
						for (local289 = 0; local289 < local238; local289++) {
							this.aClass4_Sub2_Sub1_Sub2_2.aClass4_Sub24_49.aByteArray47[this.aClass4_Sub2_Sub1_Sub2_2.aClass4_Sub24_49.anInt3822 + local289] = (byte) (this.aClass4_Sub2_Sub1_Sub2_2.aClass4_Sub24_49.aByteArray47[this.aClass4_Sub2_Sub1_Sub2_2.aClass4_Sub24_49.anInt3822 + local289] ^ this.aByte3);
						}
					}
					this.aClass4_Sub2_Sub1_Sub2_2.anInt5626 += local238;
					this.aClass4_Sub2_Sub1_Sub2_2.aClass4_Sub24_49.anInt3822 += local238;
					if (local231 == this.aClass4_Sub2_Sub1_Sub2_2.aClass4_Sub24_49.anInt3822) {
						this.aClass4_Sub2_Sub1_Sub2_2.method4697();
						this.aClass4_Sub2_Sub1_Sub2_2.aBoolean388 = false;
						this.aClass4_Sub2_Sub1_Sub2_2 = null;
					} else if (this.aClass4_Sub2_Sub1_Sub2_2.anInt5626 == 512) {
						this.aClass4_Sub2_Sub1_Sub2_2.anInt5626 = 0;
					}
				} else {
					local231 = local199 - this.aClass4_Sub24_19.anInt3822;
					if (local184 < local231) {
						local231 = local184;
					}
					this.aClass91_2.method2304(this.aClass4_Sub24_19.aByteArray47, this.aClass4_Sub24_19.anInt3822, local231);
					if (this.aByte3 != 0) {
						for (local238 = 0; local238 < local231; local238++) {
							this.aClass4_Sub24_19.aByteArray47[local238 + this.aClass4_Sub24_19.anInt3822] ^= this.aByte3;
						}
					}
					this.aClass4_Sub24_19.anInt3822 += local231;
					if (this.aClass4_Sub24_19.anInt3822 >= local199) {
						if (this.aClass4_Sub2_Sub1_Sub2_2 == null) {
							this.aClass4_Sub24_19.anInt3822 = 0;
							local238 = this.aClass4_Sub24_19.method3110();
							local289 = this.aClass4_Sub24_19.method3085();
							@Pc(470) int local470 = this.aClass4_Sub24_19.method3110();
							@Pc(481) boolean local481 = (local470 & 0x80) != 0;
							@Pc(486) int local486 = this.aClass4_Sub24_19.method3084();
							@Pc(494) long local494 = (long) ((local238 << 16) + local289);
							@Pc(498) int local498 = local470 & 0x7F;
							@Pc(508) Class4_Sub2_Sub1_Sub2 local508;
							if (local481) {
								for (local508 = (Class4_Sub2_Sub1_Sub2) this.aClass86_6.method2183(); local508 != null && local508.aLong212 != local494; local508 = (Class4_Sub2_Sub1_Sub2) this.aClass86_6.method2184()) {
								}
							} else {
								for (local508 = (Class4_Sub2_Sub1_Sub2) this.aClass86_4.method2183(); local508 != null && local494 != local508.aLong212; local508 = (Class4_Sub2_Sub1_Sub2) this.aClass86_4.method2184()) {
								}
							}
							if (local508 == null) {
								throw new IOException();
							}
							this.aClass4_Sub2_Sub1_Sub2_2 = local508;
							@Pc(565) int local565 = local498 == 0 ? 5 : 9;
							this.aClass4_Sub2_Sub1_Sub2_2.aClass4_Sub24_49 = new Class4_Sub24(this.aClass4_Sub2_Sub1_Sub2_2.aByte22 + local565 + local486);
							this.aClass4_Sub2_Sub1_Sub2_2.aClass4_Sub24_49.method3116(local498);
							this.aClass4_Sub2_Sub1_Sub2_2.aClass4_Sub24_49.method3066(local486);
							this.aClass4_Sub24_19.anInt3822 = 0;
							this.aClass4_Sub2_Sub1_Sub2_2.anInt5626 = 8;
						} else if (this.aClass4_Sub2_Sub1_Sub2_2.anInt5626 != 0) {
							throw new IOException();
						} else if (this.aClass4_Sub24_19.aByteArray47[0] == -1) {
							this.aClass4_Sub2_Sub1_Sub2_2.anInt5626 = 1;
							this.aClass4_Sub24_19.anInt3822 = 0;
						} else {
							this.aClass4_Sub2_Sub1_Sub2_2 = null;
						}
					}
				}
			}
			return true;
		} catch (@Pc(636) IOException local636) {
			try {
				this.aClass91_2.method2302();
			} catch (@Pc(642) Exception local642) {
			}
			this.aClass91_2 = null;
			this.anInt2166 = -2;
			this.anInt2165++;
			return this.method1846() == 0 && this.method1832() == 0;
		}
	}

	@OriginalMember(owner = "client!ho", name = "d", descriptor = "(I)V")
	public void method1840() {
		if (this.aClass91_2 == null) {
			return;
		}
		try {
			this.aClass4_Sub24_18.anInt3822 = 0;
			this.aClass4_Sub24_18.method3116(7);
			this.aClass4_Sub24_18.method3065(0);
			this.aClass91_2.method2303(4, this.aClass4_Sub24_18.aByteArray47);
		} catch (@Pc(42) IOException local42) {
			try {
				this.aClass91_2.method2302();
			} catch (@Pc(48) Exception local48) {
			}
			this.anInt2166 = -2;
			this.anInt2165++;
			this.aClass91_2 = null;
		}
	}

	@OriginalMember(owner = "client!ho", name = "e", descriptor = "(I)Z")
	public boolean method1842() {
		return this.method1832() >= 20;
	}

	@OriginalMember(owner = "client!ho", name = "c", descriptor = "(B)V")
	public void method1843() {
		if (this.aClass91_2 != null) {
			this.aClass91_2.method2301();
		}
	}

	@OriginalMember(owner = "client!ho", name = "f", descriptor = "(I)V")
	private void method1844() {
		if (this.aClass91_2 == null) {
			return;
		}
		try {
			this.aClass4_Sub24_18.anInt3822 = 0;
			this.aClass4_Sub24_18.method3116(6);
			this.aClass4_Sub24_18.method3065(3);
			this.aClass91_2.method2303(4, this.aClass4_Sub24_18.aByteArray47);
		} catch (@Pc(40) IOException local40) {
			try {
				this.aClass91_2.method2302();
			} catch (@Pc(46) Exception local46) {
			}
			this.aClass91_2 = null;
			this.anInt2165++;
			this.anInt2166 = -2;
		}
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(ILclient!kh;Z)V")
	public void method1845(@OriginalArg(1) Class91 arg0, @OriginalArg(2) boolean arg1) {
		if (this.aClass91_2 != null) {
			try {
				this.aClass91_2.method2302();
			} catch (@Pc(16) Exception local16) {
			}
			this.aClass91_2 = null;
		}
		this.aClass91_2 = arg0;
		this.method1844();
		this.method1831(arg1);
		this.aClass4_Sub24_19.anInt3822 = 0;
		this.aClass4_Sub2_Sub1_Sub2_2 = null;
		while (true) {
			@Pc(52) Class4_Sub2_Sub1_Sub2 local52 = (Class4_Sub2_Sub1_Sub2) this.aClass86_4.method2186();
			if (local52 == null) {
				while (true) {
					local52 = (Class4_Sub2_Sub1_Sub2) this.aClass86_6.method2186();
					if (local52 == null) {
						if (this.aByte3 != 0) {
							try {
								this.aClass4_Sub24_18.anInt3822 = 0;
								this.aClass4_Sub24_18.method3116(4);
								this.aClass4_Sub24_18.method3116(this.aByte3);
								this.aClass4_Sub24_18.method3105(0);
								this.aClass91_2.method2303(4, this.aClass4_Sub24_18.aByteArray47);
							} catch (@Pc(116) IOException local116) {
								try {
									this.aClass91_2.method2302();
								} catch (@Pc(122) Exception local122) {
								}
								this.aClass91_2 = null;
								this.anInt2165++;
								this.anInt2166 = -2;
							}
						}
						this.anInt2164 = 0;
						this.aLong85 = Static61.method1150();
						return;
					}
					this.aClass86_5.method2185(local52);
				}
			}
			this.aClass86_3.method2185(local52);
		}
	}

	@OriginalMember(owner = "client!ho", name = "g", descriptor = "(I)I")
	public int method1846() {
		return this.aClass86_3.method2181() + this.aClass86_4.method2181();
	}
}
