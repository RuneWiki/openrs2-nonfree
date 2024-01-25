import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ph")
public final class Class183 {

	@OriginalMember(owner = "client!ph", name = "v", descriptor = "J")
	private long aLong162;

	@OriginalMember(owner = "client!ph", name = "x", descriptor = "I")
	private int anInt5588;

	@OriginalMember(owner = "client!ph", name = "y", descriptor = "Lclient!br;")
	private Class27 aClass27_3;

	@OriginalMember(owner = "client!ph", name = "D", descriptor = "Lclient!bc;")
	private Class3_Sub3_Sub3_Sub1 aClass3_Sub3_Sub3_Sub1_2;

	@OriginalMember(owner = "client!ph", name = "l", descriptor = "Lclient!vi;")
	private final Class248 aClass248_4 = new Class248();

	@OriginalMember(owner = "client!ph", name = "q", descriptor = "Lclient!vi;")
	private final Class248 aClass248_5 = new Class248();

	@OriginalMember(owner = "client!ph", name = "s", descriptor = "Lclient!vi;")
	private final Class248 aClass248_6 = new Class248();

	@OriginalMember(owner = "client!ph", name = "u", descriptor = "Lclient!vi;")
	private final Class248 aClass248_7 = new Class248();

	@OriginalMember(owner = "client!ph", name = "w", descriptor = "Lclient!bt;")
	private final Class3_Sub2 aClass3_Sub2_10 = new Class3_Sub2(4);

	@OriginalMember(owner = "client!ph", name = "A", descriptor = "B")
	private byte aByte72 = 0;

	@OriginalMember(owner = "client!ph", name = "z", descriptor = "I")
	public volatile int anInt5589 = 0;

	@OriginalMember(owner = "client!ph", name = "B", descriptor = "I")
	public volatile int anInt5590 = 0;

	@OriginalMember(owner = "client!ph", name = "C", descriptor = "Lclient!bt;")
	private final Class3_Sub2 aClass3_Sub2_11 = new Class3_Sub2(8);

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(I)V")
	public void method4495() {
		if (this.aClass27_3 != null) {
			this.aClass27_3.method897();
		}
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(ZI)V")
	public void method4496(@OriginalArg(0) boolean arg0) {
		if (this.aClass27_3 == null) {
			return;
		}
		try {
			this.aClass3_Sub2_10.anInt7620 = 0;
			this.aClass3_Sub2_10.method6001(arg0 ? 2 : 3);
			this.aClass3_Sub2_10.method6054(0);
			this.aClass27_3.method891(this.aClass3_Sub2_10.aByteArray95, 4);
		} catch (@Pc(36) IOException local36) {
			try {
				this.aClass27_3.method893();
			} catch (@Pc(42) Exception local42) {
			}
			this.aClass27_3 = null;
			this.anInt5590 = -2;
			this.anInt5589++;
		}
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(ZBLclient!br;)V")
	public void method4497(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class27 arg1) {
		if (this.aClass27_3 != null) {
			try {
				this.aClass27_3.method893();
			} catch (@Pc(10) Exception local10) {
			}
			this.aClass27_3 = null;
		}
		this.aClass27_3 = arg1;
		this.method4507();
		this.method4496(arg0);
		this.aClass3_Sub2_11.anInt7620 = 0;
		this.aClass3_Sub3_Sub3_Sub1_2 = null;
		while (true) {
			@Pc(48) Class3_Sub3_Sub3_Sub1 local48 = (Class3_Sub3_Sub3_Sub1) this.aClass248_5.method5662();
			if (local48 == null) {
				while (true) {
					local48 = (Class3_Sub3_Sub3_Sub1) this.aClass248_7.method5662();
					if (local48 == null) {
						if (this.aByte72 != 0) {
							try {
								this.aClass3_Sub2_10.anInt7620 = 0;
								this.aClass3_Sub2_10.method6001(4);
								this.aClass3_Sub2_10.method6001(this.aByte72);
								this.aClass3_Sub2_10.method6045(0);
								this.aClass27_3.method891(this.aClass3_Sub2_10.aByteArray95, 4);
							} catch (@Pc(109) IOException local109) {
								try {
									this.aClass27_3.method893();
								} catch (@Pc(115) Exception local115) {
								}
								this.aClass27_3 = null;
								this.anInt5590 = -2;
								this.anInt5589++;
							}
						}
						this.anInt5588 = 0;
						this.aLong162 = Static150.method2672();
						return;
					}
					this.aClass248_6.method5659(local48);
				}
			}
			this.aClass248_4.method5659(local48);
		}
	}

	@OriginalMember(owner = "client!ph", name = "b", descriptor = "(I)I")
	public int method4498() {
		return this.aClass248_4.method5664() + this.aClass248_5.method5664();
	}

	@OriginalMember(owner = "client!ph", name = "c", descriptor = "(I)V")
	public void method4499() {
		if (this.aClass27_3 == null) {
			return;
		}
		try {
			this.aClass3_Sub2_10.anInt7620 = 0;
			this.aClass3_Sub2_10.method6001(7);
			this.aClass3_Sub2_10.method6054(0);
			this.aClass27_3.method891(this.aClass3_Sub2_10.aByteArray95, 4);
		} catch (@Pc(32) IOException local32) {
			try {
				this.aClass27_3.method893();
			} catch (@Pc(38) Exception local38) {
			}
			this.anInt5589++;
			this.aClass27_3 = null;
			this.anInt5590 = -2;
		}
	}

	@OriginalMember(owner = "client!ph", name = "d", descriptor = "(I)V")
	public void method4500() {
		if (this.aClass27_3 != null) {
			this.aClass27_3.method893();
		}
	}

	@OriginalMember(owner = "client!ph", name = "e", descriptor = "(I)Z")
	public boolean method4501() {
		@Pc(14) int local14;
		if (this.aClass27_3 != null) {
			@Pc(7) long local7 = Static150.method2672();
			local14 = (int) (local7 - this.aLong162);
			if (local14 > 200) {
				local14 = 200;
			}
			this.aLong162 = local7;
			this.anInt5588 += local14;
			if (this.anInt5588 > 30000) {
				try {
					this.aClass27_3.method893();
				} catch (@Pc(40) Exception local40) {
				}
				this.aClass27_3 = null;
			}
		}
		if (this.aClass27_3 == null) {
			return this.method4498() == 0 && this.method4502() == 0;
		}
		try {
			this.aClass27_3.method892();
			for (@Pc(78) Class3_Sub3_Sub3_Sub1 local78 = (Class3_Sub3_Sub3_Sub1) this.aClass248_4.method5661(); local78 != null; local78 = (Class3_Sub3_Sub3_Sub1) this.aClass248_4.method5657()) {
				this.aClass3_Sub2_10.anInt7620 = 0;
				this.aClass3_Sub2_10.method6001(1);
				this.aClass3_Sub2_10.method6054((int) local78.aLong175);
				this.aClass27_3.method891(this.aClass3_Sub2_10.aByteArray95, 4);
				this.aClass248_5.method5659(local78);
			}
			for (@Pc(124) Class3_Sub3_Sub3_Sub1 local124 = (Class3_Sub3_Sub3_Sub1) this.aClass248_6.method5661(); local124 != null; local124 = (Class3_Sub3_Sub3_Sub1) this.aClass248_6.method5657()) {
				this.aClass3_Sub2_10.anInt7620 = 0;
				this.aClass3_Sub2_10.method6001(0);
				this.aClass3_Sub2_10.method6054((int) local124.aLong175);
				this.aClass27_3.method891(this.aClass3_Sub2_10.aByteArray95, 4);
				this.aClass248_7.method5659(local124);
			}
			for (local14 = 0; local14 < 100; local14++) {
				@Pc(176) int local176 = this.aClass27_3.method894();
				if (local176 < 0) {
					throw new IOException();
				}
				if (local176 == 0) {
					break;
				}
				this.anInt5588 = 0;
				@Pc(189) byte local189 = 0;
				if (this.aClass3_Sub3_Sub3_Sub1_2 == null) {
					local189 = 8;
				} else if (this.aClass3_Sub3_Sub3_Sub1_2.anInt731 == 0) {
					local189 = 1;
				}
				@Pc(221) int local221;
				@Pc(227) int local227;
				@Pc(274) int local274;
				if (local189 <= 0) {
					local221 = this.aClass3_Sub3_Sub3_Sub1_2.aClass3_Sub2_1.aByteArray95.length - this.aClass3_Sub3_Sub3_Sub1_2.aByte8;
					local227 = 512 - this.aClass3_Sub3_Sub3_Sub1_2.anInt731;
					if (local221 - this.aClass3_Sub3_Sub3_Sub1_2.aClass3_Sub2_1.anInt7620 < local227) {
						local227 = local221 - this.aClass3_Sub3_Sub3_Sub1_2.aClass3_Sub2_1.anInt7620;
					}
					if (local176 < local227) {
						local227 = local176;
					}
					this.aClass27_3.method896(this.aClass3_Sub3_Sub3_Sub1_2.aClass3_Sub2_1.aByteArray95, local227, this.aClass3_Sub3_Sub3_Sub1_2.aClass3_Sub2_1.anInt7620);
					if (this.aByte72 != 0) {
						for (local274 = 0; local274 < local227; local274++) {
							this.aClass3_Sub3_Sub3_Sub1_2.aClass3_Sub2_1.aByteArray95[local274 + this.aClass3_Sub3_Sub3_Sub1_2.aClass3_Sub2_1.anInt7620] ^= this.aByte72;
						}
					}
					this.aClass3_Sub3_Sub3_Sub1_2.aClass3_Sub2_1.anInt7620 += local227;
					this.aClass3_Sub3_Sub3_Sub1_2.anInt731 += local227;
					if (local221 == this.aClass3_Sub3_Sub3_Sub1_2.aClass3_Sub2_1.anInt7620) {
						this.aClass3_Sub3_Sub3_Sub1_2.method4647();
						this.aClass3_Sub3_Sub3_Sub1_2.aBoolean272 = false;
						this.aClass3_Sub3_Sub3_Sub1_2 = null;
					} else if (this.aClass3_Sub3_Sub3_Sub1_2.anInt731 == 512) {
						this.aClass3_Sub3_Sub3_Sub1_2.anInt731 = 0;
					}
				} else {
					local221 = local189 - this.aClass3_Sub2_11.anInt7620;
					if (local176 < local221) {
						local221 = local176;
					}
					this.aClass27_3.method896(this.aClass3_Sub2_11.aByteArray95, local221, this.aClass3_Sub2_11.anInt7620);
					if (this.aByte72 != 0) {
						for (local227 = 0; local227 < local221; local227++) {
							this.aClass3_Sub2_11.aByteArray95[this.aClass3_Sub2_11.anInt7620 + local227] ^= this.aByte72;
						}
					}
					this.aClass3_Sub2_11.anInt7620 += local221;
					if (local189 <= this.aClass3_Sub2_11.anInt7620) {
						if (this.aClass3_Sub3_Sub3_Sub1_2 == null) {
							this.aClass3_Sub2_11.anInt7620 = 0;
							local227 = this.aClass3_Sub2_11.method6053();
							local274 = this.aClass3_Sub2_11.method6004();
							@Pc(448) int local448 = this.aClass3_Sub2_11.method6053();
							@Pc(453) int local453 = this.aClass3_Sub2_11.method6014();
							@Pc(457) int local457 = local448 & 0x7F;
							@Pc(465) boolean local465 = (local448 & 0x80) != 0;
							@Pc(473) long local473 = (long) ((local227 << 16) + local274);
							@Pc(483) Class3_Sub3_Sub3_Sub1 local483;
							if (local465) {
								for (local483 = (Class3_Sub3_Sub3_Sub1) this.aClass248_7.method5661(); local483 != null && local483.aLong175 != local473; local483 = (Class3_Sub3_Sub3_Sub1) this.aClass248_7.method5657()) {
								}
							} else {
								for (local483 = (Class3_Sub3_Sub3_Sub1) this.aClass248_5.method5661(); local483 != null && local483.aLong175 != local473; local483 = (Class3_Sub3_Sub3_Sub1) this.aClass248_5.method5657()) {
								}
							}
							if (local483 == null) {
								throw new IOException();
							}
							this.aClass3_Sub3_Sub3_Sub1_2 = local483;
							@Pc(543) int local543 = local457 == 0 ? 5 : 9;
							this.aClass3_Sub3_Sub3_Sub1_2.aClass3_Sub2_1 = new Class3_Sub2(local453 + local543 + this.aClass3_Sub3_Sub3_Sub1_2.aByte8);
							this.aClass3_Sub3_Sub3_Sub1_2.aClass3_Sub2_1.method6001(local457);
							this.aClass3_Sub3_Sub3_Sub1_2.aClass3_Sub2_1.method6008(local453);
							this.aClass3_Sub2_11.anInt7620 = 0;
							this.aClass3_Sub3_Sub3_Sub1_2.anInt731 = 8;
						} else if (this.aClass3_Sub3_Sub3_Sub1_2.anInt731 != 0) {
							throw new IOException();
						} else if (this.aClass3_Sub2_11.aByteArray95[0] == -1) {
							this.aClass3_Sub2_11.anInt7620 = 0;
							this.aClass3_Sub3_Sub3_Sub1_2.anInt731 = 1;
						} else {
							this.aClass3_Sub3_Sub3_Sub1_2 = null;
						}
					}
				}
			}
			return true;
		} catch (@Pc(616) IOException local616) {
			try {
				this.aClass27_3.method893();
			} catch (@Pc(622) Exception local622) {
			}
			this.aClass27_3 = null;
			this.anInt5590 = -2;
			this.anInt5589++;
			return this.method4498() == 0 && this.method4502() == 0;
		}
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(B)I")
	private int method4502() {
		return this.aClass248_6.method5664() + this.aClass248_7.method5664();
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(IIBIZ)Lclient!bc;")
	public Class3_Sub3_Sub3_Sub1 method4503(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2, @OriginalArg(4) boolean arg3) {
		@Pc(21) long local21 = (long) (arg1 + (arg0 << 16));
		@Pc(25) Class3_Sub3_Sub3_Sub1 local25 = new Class3_Sub3_Sub3_Sub1();
		local25.aBoolean273 = arg3;
		local25.aByte8 = arg2;
		local25.aLong175 = local21;
		if (arg3) {
			if (this.method4498() >= 20) {
				throw new RuntimeException();
			}
			this.aClass248_4.method5659(local25);
		} else if (this.method4502() < 20) {
			this.aClass248_6.method5659(local25);
		} else {
			throw new RuntimeException();
		}
		return local25;
	}

	@OriginalMember(owner = "client!ph", name = "b", descriptor = "(B)Z")
	public boolean method4506() {
		return this.method4502() >= 20;
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(Z)V")
	private void method4507() {
		if (this.aClass27_3 == null) {
			return;
		}
		try {
			this.aClass3_Sub2_10.anInt7620 = 0;
			this.aClass3_Sub2_10.method6001(6);
			this.aClass3_Sub2_10.method6054(3);
			this.aClass27_3.method891(this.aClass3_Sub2_10.aByteArray95, 4);
		} catch (@Pc(36) IOException local36) {
			try {
				this.aClass27_3.method893();
			} catch (@Pc(42) Exception local42) {
			}
			this.aClass27_3 = null;
			this.anInt5590 = -2;
			this.anInt5589++;
		}
	}

	@OriginalMember(owner = "client!ph", name = "f", descriptor = "(I)Z")
	public boolean method4508() {
		return this.method4498() >= 20;
	}

	@OriginalMember(owner = "client!ph", name = "b", descriptor = "(Z)V")
	public void method4509() {
		try {
			this.aClass27_3.method893();
		} catch (@Pc(9) Exception local9) {
		}
		this.anInt5590 = -1;
		this.aByte72 = (byte) (Math.random() * 255.0D + 1.0D);
		this.aClass27_3 = null;
		this.anInt5589++;
	}
}
