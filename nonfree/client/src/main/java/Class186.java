import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sa")
public final class Class186 {

	@OriginalMember(owner = "client!sa", name = "x", descriptor = "J")
	private long aLong164;

	@OriginalMember(owner = "client!sa", name = "z", descriptor = "I")
	private int anInt5719;

	@OriginalMember(owner = "client!sa", name = "A", descriptor = "Lclient!od;")
	private Class148 aClass148_3;

	@OriginalMember(owner = "client!sa", name = "F", descriptor = "Lclient!rb;")
	private Class1_Sub4_Sub5_Sub2 aClass1_Sub4_Sub5_Sub2_2;

	@OriginalMember(owner = "client!sa", name = "m", descriptor = "Lclient!p;")
	private final Class159 aClass159_7 = new Class159();

	@OriginalMember(owner = "client!sa", name = "u", descriptor = "Lclient!p;")
	private final Class159 aClass159_8 = new Class159();

	@OriginalMember(owner = "client!sa", name = "v", descriptor = "Lclient!p;")
	private final Class159 aClass159_9 = new Class159();

	@OriginalMember(owner = "client!sa", name = "w", descriptor = "Lclient!p;")
	private final Class159 aClass159_10 = new Class159();

	@OriginalMember(owner = "client!sa", name = "y", descriptor = "Lclient!bg;")
	private final Class1_Sub8 aClass1_Sub8_8 = new Class1_Sub8(4);

	@OriginalMember(owner = "client!sa", name = "B", descriptor = "B")
	private byte aByte63 = 0;

	@OriginalMember(owner = "client!sa", name = "C", descriptor = "I")
	public volatile int anInt5720 = 0;

	@OriginalMember(owner = "client!sa", name = "D", descriptor = "I")
	public volatile int anInt5721 = 0;

	@OriginalMember(owner = "client!sa", name = "E", descriptor = "Lclient!bg;")
	private final Class1_Sub8 aClass1_Sub8_9 = new Class1_Sub8(8);

	@OriginalMember(owner = "client!sa", name = "b", descriptor = "(I)I")
	private int method4884() {
		return this.aClass159_9.method4256() + this.aClass159_10.method4256();
	}

	@OriginalMember(owner = "client!sa", name = "c", descriptor = "(I)V")
	public void method4886() {
		if (this.aClass148_3 != null) {
			this.aClass148_3.method4123();
		}
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(Lclient!od;ZB)V")
	public void method4887(@OriginalArg(0) Class148 arg0, @OriginalArg(1) boolean arg1) {
		if (this.aClass148_3 != null) {
			try {
				this.aClass148_3.method4123();
			} catch (@Pc(10) Exception local10) {
			}
			this.aClass148_3 = null;
		}
		this.aClass148_3 = arg0;
		this.method4894();
		this.method4898(arg1);
		this.aClass1_Sub4_Sub5_Sub2_2 = null;
		this.aClass1_Sub8_9.anInt5182 = 0;
		while (true) {
			@Pc(46) Class1_Sub4_Sub5_Sub2 local46 = (Class1_Sub4_Sub5_Sub2) this.aClass159_8.method4258();
			if (local46 == null) {
				while (true) {
					local46 = (Class1_Sub4_Sub5_Sub2) this.aClass159_10.method4258();
					if (local46 == null) {
						if (this.aByte63 != 0) {
							try {
								this.aClass1_Sub8_8.anInt5182 = 0;
								this.aClass1_Sub8_8.method4562(4);
								this.aClass1_Sub8_8.method4562(this.aByte63);
								this.aClass1_Sub8_8.method4542(0);
								this.aClass148_3.method4122(4, this.aClass1_Sub8_8.aByteArray81);
							} catch (@Pc(111) IOException local111) {
								try {
									this.aClass148_3.method4123();
								} catch (@Pc(117) Exception local117) {
								}
								this.anInt5721 = -2;
								this.aClass148_3 = null;
								this.anInt5720++;
							}
						}
						this.anInt5719 = 0;
						this.aLong164 = Static162.method3252();
						return;
					}
					this.aClass159_9.method4262(local46);
				}
			}
			this.aClass159_7.method4262(local46);
		}
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(B)V")
	public void method4890() {
		if (this.aClass148_3 == null) {
			return;
		}
		try {
			this.aClass1_Sub8_8.anInt5182 = 0;
			this.aClass1_Sub8_8.method4562(7);
			this.aClass1_Sub8_8.method4549(0);
			this.aClass148_3.method4122(4, this.aClass1_Sub8_8.aByteArray81);
		} catch (@Pc(38) IOException local38) {
			try {
				this.aClass148_3.method4123();
			} catch (@Pc(44) Exception local44) {
			}
			this.anInt5720++;
			this.anInt5721 = -2;
			this.aClass148_3 = null;
		}
	}

	@OriginalMember(owner = "client!sa", name = "b", descriptor = "(B)V")
	public void method4891() {
		if (this.aClass148_3 != null) {
			this.aClass148_3.method4119();
		}
	}

	@OriginalMember(owner = "client!sa", name = "c", descriptor = "(B)Z")
	public boolean method4892() {
		return this.method4884() >= 20;
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(IZBIZ)Lclient!rb;")
	public Class1_Sub4_Sub5_Sub2 method4893(@OriginalArg(0) int arg0, @OriginalArg(2) byte arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		@Pc(10) long local10 = (long) ((arg2 << 16) + arg0);
		@Pc(14) Class1_Sub4_Sub5_Sub2 local14 = new Class1_Sub4_Sub5_Sub2();
		local14.aBoolean518 = arg3;
		local14.aByte55 = arg1;
		local14.aLong214 = local10;
		if (arg3) {
			if (this.method4897() >= 20) {
				throw new RuntimeException();
			}
			this.aClass159_7.method4262(local14);
		} else if (this.method4884() < 20) {
			this.aClass159_9.method4262(local14);
		} else {
			throw new RuntimeException();
		}
		return local14;
	}

	@OriginalMember(owner = "client!sa", name = "d", descriptor = "(I)V")
	private void method4894() {
		if (this.aClass148_3 == null) {
			return;
		}
		try {
			this.aClass1_Sub8_8.anInt5182 = 0;
			this.aClass1_Sub8_8.method4562(6);
			this.aClass1_Sub8_8.method4549(3);
			this.aClass148_3.method4122(4, this.aClass1_Sub8_8.aByteArray81);
		} catch (@Pc(32) IOException local32) {
			try {
				this.aClass148_3.method4123();
			} catch (@Pc(38) Exception local38) {
			}
			this.anInt5720++;
			this.anInt5721 = -2;
			this.aClass148_3 = null;
		}
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(Z)Z")
	public boolean method4895() {
		@Pc(14) int local14;
		if (this.aClass148_3 != null) {
			@Pc(7) long local7 = Static162.method3252();
			local14 = (int) (local7 - this.aLong164);
			this.aLong164 = local7;
			if (local14 > 200) {
				local14 = 200;
			}
			this.anInt5719 += local14;
			if (this.anInt5719 > 30000) {
				try {
					this.aClass148_3.method4123();
				} catch (@Pc(40) Exception local40) {
				}
				this.aClass148_3 = null;
			}
		}
		if (this.aClass148_3 == null) {
			return this.method4897() == 0 && this.method4884() == 0;
		}
		try {
			this.aClass148_3.method4120();
			for (@Pc(75) Class1_Sub4_Sub5_Sub2 local75 = (Class1_Sub4_Sub5_Sub2) this.aClass159_7.method4261(); local75 != null; local75 = (Class1_Sub4_Sub5_Sub2) this.aClass159_7.method4257()) {
				this.aClass1_Sub8_8.anInt5182 = 0;
				this.aClass1_Sub8_8.method4562(1);
				this.aClass1_Sub8_8.method4549((int) local75.aLong214);
				this.aClass148_3.method4122(4, this.aClass1_Sub8_8.aByteArray81);
				this.aClass159_8.method4262(local75);
			}
			for (@Pc(121) Class1_Sub4_Sub5_Sub2 local121 = (Class1_Sub4_Sub5_Sub2) this.aClass159_9.method4261(); local121 != null; local121 = (Class1_Sub4_Sub5_Sub2) this.aClass159_9.method4257()) {
				this.aClass1_Sub8_8.anInt5182 = 0;
				this.aClass1_Sub8_8.method4562(0);
				this.aClass1_Sub8_8.method4549((int) local121.aLong214);
				this.aClass148_3.method4122(4, this.aClass1_Sub8_8.aByteArray81);
				this.aClass159_10.method4262(local121);
			}
			for (local14 = 0; local14 < 100; local14++) {
				@Pc(176) int local176 = this.aClass148_3.method4125();
				if (local176 < 0) {
					throw new IOException();
				}
				if (local176 == 0) {
					break;
				}
				this.anInt5719 = 0;
				@Pc(192) byte local192 = 0;
				if (this.aClass1_Sub4_Sub5_Sub2_2 == null) {
					local192 = 8;
				} else if (this.aClass1_Sub4_Sub5_Sub2_2.anInt5398 == 0) {
					local192 = 1;
				}
				@Pc(217) int local217;
				@Pc(241) int local241;
				@Pc(307) int local307;
				if (local192 > 0) {
					local217 = local192 - this.aClass1_Sub8_9.anInt5182;
					if (local217 > local176) {
						local217 = local176;
					}
					this.aClass148_3.method4124(this.aClass1_Sub8_9.anInt5182, local217, this.aClass1_Sub8_9.aByteArray81);
					if (this.aByte63 != 0) {
						for (local241 = 0; local241 < local217; local241++) {
							this.aClass1_Sub8_9.aByteArray81[this.aClass1_Sub8_9.anInt5182 + local241] = (byte) (this.aClass1_Sub8_9.aByteArray81[this.aClass1_Sub8_9.anInt5182 + local241] ^ this.aByte63);
						}
					}
					this.aClass1_Sub8_9.anInt5182 += local217;
					if (this.aClass1_Sub8_9.anInt5182 >= local192) {
						if (this.aClass1_Sub4_Sub5_Sub2_2 == null) {
							this.aClass1_Sub8_9.anInt5182 = 0;
							local241 = this.aClass1_Sub8_9.method4532();
							local307 = this.aClass1_Sub8_9.method4556();
							@Pc(312) int local312 = this.aClass1_Sub8_9.method4532();
							@Pc(317) int local317 = this.aClass1_Sub8_9.method4545();
							@Pc(321) int local321 = local312 & 0x7F;
							@Pc(329) boolean local329 = (local312 & 0x80) != 0;
							@Pc(336) long local336 = (long) (local307 + (local241 << 16));
							@Pc(346) Class1_Sub4_Sub5_Sub2 local346;
							if (local329) {
								for (local346 = (Class1_Sub4_Sub5_Sub2) this.aClass159_10.method4261(); local346 != null && local346.aLong214 != local336; local346 = (Class1_Sub4_Sub5_Sub2) this.aClass159_10.method4257()) {
								}
							} else {
								for (local346 = (Class1_Sub4_Sub5_Sub2) this.aClass159_8.method4261(); local346 != null && local346.aLong214 != local336; local346 = (Class1_Sub4_Sub5_Sub2) this.aClass159_8.method4257()) {
								}
							}
							if (local346 == null) {
								throw new IOException();
							}
							this.aClass1_Sub4_Sub5_Sub2_2 = local346;
							@Pc(406) int local406 = local321 == 0 ? 5 : 9;
							this.aClass1_Sub4_Sub5_Sub2_2.aClass1_Sub8_7 = new Class1_Sub8(local317 + local406 + this.aClass1_Sub4_Sub5_Sub2_2.aByte55);
							this.aClass1_Sub4_Sub5_Sub2_2.aClass1_Sub8_7.method4562(local321);
							this.aClass1_Sub4_Sub5_Sub2_2.aClass1_Sub8_7.method4529(local317);
							this.aClass1_Sub8_9.anInt5182 = 0;
							this.aClass1_Sub4_Sub5_Sub2_2.anInt5398 = 8;
						} else if (this.aClass1_Sub4_Sub5_Sub2_2.anInt5398 != 0) {
							throw new IOException();
						} else if (this.aClass1_Sub8_9.aByteArray81[0] == -1) {
							this.aClass1_Sub8_9.anInt5182 = 0;
							this.aClass1_Sub4_Sub5_Sub2_2.anInt5398 = 1;
						} else {
							this.aClass1_Sub4_Sub5_Sub2_2 = null;
						}
					}
				} else {
					local217 = this.aClass1_Sub4_Sub5_Sub2_2.aClass1_Sub8_7.aByteArray81.length - this.aClass1_Sub4_Sub5_Sub2_2.aByte55;
					local241 = 512 - this.aClass1_Sub4_Sub5_Sub2_2.anInt5398;
					if (local241 > local217 - this.aClass1_Sub4_Sub5_Sub2_2.aClass1_Sub8_7.anInt5182) {
						local241 = local217 - this.aClass1_Sub4_Sub5_Sub2_2.aClass1_Sub8_7.anInt5182;
					}
					if (local176 < local241) {
						local241 = local176;
					}
					this.aClass148_3.method4124(this.aClass1_Sub4_Sub5_Sub2_2.aClass1_Sub8_7.anInt5182, local241, this.aClass1_Sub4_Sub5_Sub2_2.aClass1_Sub8_7.aByteArray81);
					if (this.aByte63 != 0) {
						for (local307 = 0; local307 < local241; local307++) {
							this.aClass1_Sub4_Sub5_Sub2_2.aClass1_Sub8_7.aByteArray81[this.aClass1_Sub4_Sub5_Sub2_2.aClass1_Sub8_7.anInt5182 + local307] ^= this.aByte63;
						}
					}
					this.aClass1_Sub4_Sub5_Sub2_2.anInt5398 += local241;
					this.aClass1_Sub4_Sub5_Sub2_2.aClass1_Sub8_7.anInt5182 += local241;
					if (local217 == this.aClass1_Sub4_Sub5_Sub2_2.aClass1_Sub8_7.anInt5182) {
						this.aClass1_Sub4_Sub5_Sub2_2.method5632();
						this.aClass1_Sub4_Sub5_Sub2_2.aBoolean519 = false;
						this.aClass1_Sub4_Sub5_Sub2_2 = null;
					} else if (this.aClass1_Sub4_Sub5_Sub2_2.anInt5398 == 512) {
						this.aClass1_Sub4_Sub5_Sub2_2.anInt5398 = 0;
					}
				}
			}
			return true;
		} catch (@Pc(622) IOException local622) {
			try {
				this.aClass148_3.method4123();
			} catch (@Pc(628) Exception local628) {
			}
			this.aClass148_3 = null;
			this.anInt5721 = -2;
			this.anInt5720++;
			return this.method4897() == 0 && this.method4884() == 0;
		}
	}

	@OriginalMember(owner = "client!sa", name = "e", descriptor = "(I)V")
	public void method4896() {
		try {
			this.aClass148_3.method4123();
		} catch (@Pc(5) Exception local5) {
		}
		this.aByte63 = (byte) ((double) 255 * Math.random() + 1.0D);
		this.anInt5721 = -1;
		this.aClass148_3 = null;
		this.anInt5720++;
	}

	@OriginalMember(owner = "client!sa", name = "d", descriptor = "(B)I")
	public int method4897() {
		return this.aClass159_7.method4256() + this.aClass159_8.method4256();
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(ZI)V")
	public void method4898(@OriginalArg(0) boolean arg0) {
		if (this.aClass148_3 == null) {
			return;
		}
		try {
			this.aClass1_Sub8_8.anInt5182 = 0;
			this.aClass1_Sub8_8.method4562(arg0 ? 2 : 3);
			this.aClass1_Sub8_8.method4549(0);
			this.aClass148_3.method4122(4, this.aClass1_Sub8_8.aByteArray81);
		} catch (@Pc(40) IOException local40) {
			try {
				this.aClass148_3.method4123();
			} catch (@Pc(46) Exception local46) {
			}
			this.anInt5720++;
			this.anInt5721 = -2;
			this.aClass148_3 = null;
		}
	}

	@OriginalMember(owner = "client!sa", name = "e", descriptor = "(B)Z")
	public boolean method4899() {
		return this.method4897() >= 20;
	}
}
