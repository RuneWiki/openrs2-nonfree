import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vf")
public final class Class257 {

	@OriginalMember(owner = "client!vf", name = "w", descriptor = "I")
	private int anInt6909;

	@OriginalMember(owner = "client!vf", name = "x", descriptor = "Lclient!uu;")
	private Class251 aClass251_4;

	@OriginalMember(owner = "client!vf", name = "y", descriptor = "J")
	private long aLong211;

	@OriginalMember(owner = "client!vf", name = "E", descriptor = "Lclient!rp;")
	private Class3_Sub4_Sub1_Sub2 aClass3_Sub4_Sub1_Sub2_2;

	@OriginalMember(owner = "client!vf", name = "j", descriptor = "Lclient!uj;")
	private final Class244 aClass244_8 = new Class244();

	@OriginalMember(owner = "client!vf", name = "s", descriptor = "Lclient!uj;")
	private final Class244 aClass244_9 = new Class244();

	@OriginalMember(owner = "client!vf", name = "t", descriptor = "Lclient!uj;")
	private final Class244 aClass244_10 = new Class244();

	@OriginalMember(owner = "client!vf", name = "u", descriptor = "Lclient!uj;")
	private final Class244 aClass244_11 = new Class244();

	@OriginalMember(owner = "client!vf", name = "v", descriptor = "Lclient!cu;")
	private final Class3_Sub7 aClass3_Sub7_6 = new Class3_Sub7(4);

	@OriginalMember(owner = "client!vf", name = "z", descriptor = "I")
	public volatile int anInt6910 = 0;

	@OriginalMember(owner = "client!vf", name = "B", descriptor = "I")
	public volatile int anInt6911 = 0;

	@OriginalMember(owner = "client!vf", name = "A", descriptor = "B")
	private byte aByte102 = 0;

	@OriginalMember(owner = "client!vf", name = "C", descriptor = "Lclient!cu;")
	private final Class3_Sub7 aClass3_Sub7_7 = new Class3_Sub7(8);

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(I)V")
	private void method5392() {
		if (this.aClass251_4 == null) {
			return;
		}
		try {
			this.aClass3_Sub7_6.anInt3235 = 0;
			this.aClass3_Sub7_6.method2628(6);
			this.aClass3_Sub7_6.method2602(3);
			this.aClass251_4.method5344(this.aClass3_Sub7_6.aByteArray46, 4);
		} catch (@Pc(38) IOException local38) {
			try {
				this.aClass251_4.method5345();
			} catch (@Pc(44) Exception local44) {
			}
			this.aClass251_4 = null;
			this.anInt6910++;
			this.anInt6911 = -2;
		}
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(B)Z")
	public boolean method5393() {
		@Pc(18) int local18;
		if (this.aClass251_4 != null) {
			@Pc(11) long local11 = Static118.method1934();
			local18 = (int) (local11 - this.aLong211);
			this.aLong211 = local11;
			if (local18 > 200) {
				local18 = 200;
			}
			this.anInt6909 += local18;
			if (this.anInt6909 > 30000) {
				try {
					this.aClass251_4.method5345();
				} catch (@Pc(46) Exception local46) {
				}
				this.aClass251_4 = null;
			}
		}
		if (this.aClass251_4 == null) {
			return this.method5396() == 0 && this.method5405() == 0;
		}
		try {
			this.aClass251_4.method5342();
			for (@Pc(81) Class3_Sub4_Sub1_Sub2 local81 = (Class3_Sub4_Sub1_Sub2) this.aClass244_8.method5240(); local81 != null; local81 = (Class3_Sub4_Sub1_Sub2) this.aClass244_8.method5232()) {
				this.aClass3_Sub7_6.anInt3235 = 0;
				this.aClass3_Sub7_6.method2628(1);
				this.aClass3_Sub7_6.method2602((int) local81.aLong233);
				this.aClass251_4.method5344(this.aClass3_Sub7_6.aByteArray46, 4);
				this.aClass244_9.method5234(local81);
			}
			for (@Pc(130) Class3_Sub4_Sub1_Sub2 local130 = (Class3_Sub4_Sub1_Sub2) this.aClass244_10.method5240(); local130 != null; local130 = (Class3_Sub4_Sub1_Sub2) this.aClass244_10.method5232()) {
				this.aClass3_Sub7_6.anInt3235 = 0;
				this.aClass3_Sub7_6.method2628(0);
				this.aClass3_Sub7_6.method2602((int) local130.aLong233);
				this.aClass251_4.method5344(this.aClass3_Sub7_6.aByteArray46, 4);
				this.aClass244_11.method5234(local130);
			}
			for (local18 = 0; local18 < 100; local18++) {
				@Pc(179) int local179 = this.aClass251_4.method5348();
				if (local179 < 0) {
					throw new IOException();
				}
				if (local179 == 0) {
					break;
				}
				this.anInt6909 = 0;
				@Pc(195) byte local195 = 0;
				if (this.aClass3_Sub4_Sub1_Sub2_2 == null) {
					local195 = 8;
				} else if (this.aClass3_Sub4_Sub1_Sub2_2.anInt6029 == 0) {
					local195 = 1;
				}
				@Pc(224) int local224;
				@Pc(231) int local231;
				@Pc(272) int local272;
				if (local195 <= 0) {
					local224 = this.aClass3_Sub4_Sub1_Sub2_2.aClass3_Sub7_4.aByteArray46.length - this.aClass3_Sub4_Sub1_Sub2_2.aByte96;
					local231 = 512 - this.aClass3_Sub4_Sub1_Sub2_2.anInt6029;
					if (local231 > local224 - this.aClass3_Sub4_Sub1_Sub2_2.aClass3_Sub7_4.anInt3235) {
						local231 = local224 - this.aClass3_Sub4_Sub1_Sub2_2.aClass3_Sub7_4.anInt3235;
					}
					if (local231 > local179) {
						local231 = local179;
					}
					this.aClass251_4.method5346(this.aClass3_Sub4_Sub1_Sub2_2.aClass3_Sub7_4.anInt3235, this.aClass3_Sub4_Sub1_Sub2_2.aClass3_Sub7_4.aByteArray46, local231);
					if (this.aByte102 != 0) {
						for (local272 = 0; local272 < local231; local272++) {
							this.aClass3_Sub4_Sub1_Sub2_2.aClass3_Sub7_4.aByteArray46[local272 + this.aClass3_Sub4_Sub1_Sub2_2.aClass3_Sub7_4.anInt3235] ^= this.aByte102;
						}
					}
					this.aClass3_Sub4_Sub1_Sub2_2.aClass3_Sub7_4.anInt3235 += local231;
					this.aClass3_Sub4_Sub1_Sub2_2.anInt6029 += local231;
					if (local224 == this.aClass3_Sub4_Sub1_Sub2_2.aClass3_Sub7_4.anInt3235) {
						this.aClass3_Sub4_Sub1_Sub2_2.method5949();
						this.aClass3_Sub4_Sub1_Sub2_2.aBoolean527 = false;
						this.aClass3_Sub4_Sub1_Sub2_2 = null;
					} else if (this.aClass3_Sub4_Sub1_Sub2_2.anInt6029 == 512) {
						this.aClass3_Sub4_Sub1_Sub2_2.anInt6029 = 0;
					}
				} else {
					local224 = local195 - this.aClass3_Sub7_7.anInt3235;
					if (local179 < local224) {
						local224 = local179;
					}
					this.aClass251_4.method5346(this.aClass3_Sub7_7.anInt3235, this.aClass3_Sub7_7.aByteArray46, local224);
					if (this.aByte102 != 0) {
						for (local231 = 0; local231 < local224; local231++) {
							this.aClass3_Sub7_7.aByteArray46[local231 + this.aClass3_Sub7_7.anInt3235] ^= this.aByte102;
						}
					}
					this.aClass3_Sub7_7.anInt3235 += local224;
					if (this.aClass3_Sub7_7.anInt3235 >= local195) {
						if (this.aClass3_Sub4_Sub1_Sub2_2 == null) {
							this.aClass3_Sub7_7.anInt3235 = 0;
							local231 = this.aClass3_Sub7_7.method2582();
							local272 = this.aClass3_Sub7_7.method2588();
							@Pc(446) int local446 = this.aClass3_Sub7_7.method2582();
							@Pc(451) int local451 = this.aClass3_Sub7_7.method2589();
							@Pc(455) int local455 = local446 & 0x7F;
							@Pc(463) boolean local463 = (local446 & 0x80) != 0;
							@Pc(470) long local470 = (long) (local272 + (local231 << 16));
							@Pc(480) Class3_Sub4_Sub1_Sub2 local480;
							if (local463) {
								for (local480 = (Class3_Sub4_Sub1_Sub2) this.aClass244_11.method5240(); local480 != null && local470 != local480.aLong233; local480 = (Class3_Sub4_Sub1_Sub2) this.aClass244_11.method5232()) {
								}
							} else {
								for (local480 = (Class3_Sub4_Sub1_Sub2) this.aClass244_9.method5240(); local480 != null && local480.aLong233 != local470; local480 = (Class3_Sub4_Sub1_Sub2) this.aClass244_9.method5232()) {
								}
							}
							if (local480 == null) {
								throw new IOException();
							}
							@Pc(544) int local544 = local455 == 0 ? 5 : 9;
							this.aClass3_Sub4_Sub1_Sub2_2 = local480;
							this.aClass3_Sub4_Sub1_Sub2_2.aClass3_Sub7_4 = new Class3_Sub7(this.aClass3_Sub4_Sub1_Sub2_2.aByte96 + local451 + local544);
							this.aClass3_Sub4_Sub1_Sub2_2.aClass3_Sub7_4.method2628(local455);
							this.aClass3_Sub4_Sub1_Sub2_2.aClass3_Sub7_4.method2636(local451);
							this.aClass3_Sub7_7.anInt3235 = 0;
							this.aClass3_Sub4_Sub1_Sub2_2.anInt6029 = 8;
						} else if (this.aClass3_Sub4_Sub1_Sub2_2.anInt6029 != 0) {
							throw new IOException();
						} else if (this.aClass3_Sub7_7.aByteArray46[0] == -1) {
							this.aClass3_Sub7_7.anInt3235 = 0;
							this.aClass3_Sub4_Sub1_Sub2_2.anInt6029 = 1;
						} else {
							this.aClass3_Sub4_Sub1_Sub2_2 = null;
						}
					}
				}
			}
			return true;
		} catch (@Pc(624) IOException local624) {
			try {
				this.aClass251_4.method5345();
			} catch (@Pc(630) Exception local630) {
			}
			this.anInt6910++;
			this.anInt6911 = -2;
			this.aClass251_4 = null;
			return this.method5396() == 0 && this.method5405() == 0;
		}
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(IZ)V")
	public void method5394(@OriginalArg(1) boolean arg0) {
		if (this.aClass251_4 == null) {
			return;
		}
		try {
			this.aClass3_Sub7_6.anInt3235 = 0;
			this.aClass3_Sub7_6.method2628(arg0 ? 2 : 3);
			this.aClass3_Sub7_6.method2602(0);
			this.aClass251_4.method5344(this.aClass3_Sub7_6.aByteArray46, 4);
		} catch (@Pc(42) IOException local42) {
			try {
				this.aClass251_4.method5345();
			} catch (@Pc(48) Exception local48) {
			}
			this.anInt6910++;
			this.aClass251_4 = null;
			this.anInt6911 = -2;
		}
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(ZLclient!uu;Z)V")
	public void method5395(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class251 arg1) {
		if (this.aClass251_4 != null) {
			try {
				this.aClass251_4.method5345();
			} catch (@Pc(12) Exception local12) {
			}
			this.aClass251_4 = null;
		}
		this.aClass251_4 = arg1;
		this.method5392();
		this.method5394(arg0);
		this.aClass3_Sub4_Sub1_Sub2_2 = null;
		this.aClass3_Sub7_7.anInt3235 = 0;
		while (true) {
			@Pc(42) Class3_Sub4_Sub1_Sub2 local42 = (Class3_Sub4_Sub1_Sub2) this.aClass244_9.method5235();
			if (local42 == null) {
				while (true) {
					local42 = (Class3_Sub4_Sub1_Sub2) this.aClass244_11.method5235();
					if (local42 == null) {
						if (this.aByte102 != 0) {
							try {
								this.aClass3_Sub7_6.anInt3235 = 0;
								this.aClass3_Sub7_6.method2628(4);
								this.aClass3_Sub7_6.method2628(this.aByte102);
								this.aClass3_Sub7_6.method2613(0);
								this.aClass251_4.method5344(this.aClass3_Sub7_6.aByteArray46, 4);
							} catch (@Pc(105) IOException local105) {
								try {
									this.aClass251_4.method5345();
								} catch (@Pc(111) Exception local111) {
								}
								this.anInt6911 = -2;
								this.aClass251_4 = null;
								this.anInt6910++;
							}
						}
						this.anInt6909 = 0;
						this.aLong211 = Static118.method1934();
						return;
					}
					this.aClass244_10.method5234(local42);
				}
			}
			this.aClass244_8.method5234(local42);
		}
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(Z)I")
	public int method5396() {
		return this.aClass244_8.method5239() + this.aClass244_9.method5239();
	}

	@OriginalMember(owner = "client!vf", name = "b", descriptor = "(I)Z")
	public boolean method5397() {
		return this.method5396() >= 20;
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(IBIZI)Lclient!rp;")
	public Class3_Sub4_Sub1_Sub2 method5398(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3) {
		@Pc(10) long local10 = (long) ((arg0 << 16) + arg3);
		@Pc(14) Class3_Sub4_Sub1_Sub2 local14 = new Class3_Sub4_Sub1_Sub2();
		local14.aByte96 = arg1;
		local14.aBoolean528 = arg2;
		local14.aLong233 = local10;
		if (arg2) {
			if (this.method5396() >= 20) {
				throw new RuntimeException();
			}
			this.aClass244_8.method5234(local14);
		} else if (this.method5405() < 20) {
			this.aClass244_10.method5234(local14);
		} else {
			throw new RuntimeException();
		}
		return local14;
	}

	@OriginalMember(owner = "client!vf", name = "b", descriptor = "(B)V")
	public void method5401() {
		if (this.aClass251_4 != null) {
			this.aClass251_4.method5345();
		}
	}

	@OriginalMember(owner = "client!vf", name = "c", descriptor = "(I)V")
	public void method5402() {
		if (this.aClass251_4 == null) {
			return;
		}
		try {
			this.aClass3_Sub7_6.anInt3235 = 0;
			this.aClass3_Sub7_6.method2628(7);
			this.aClass3_Sub7_6.method2602(0);
			this.aClass251_4.method5344(this.aClass3_Sub7_6.aByteArray46, 4);
		} catch (@Pc(42) IOException local42) {
			try {
				this.aClass251_4.method5345();
			} catch (@Pc(48) Exception local48) {
			}
			this.anInt6911 = -2;
			this.aClass251_4 = null;
			this.anInt6910++;
		}
	}

	@OriginalMember(owner = "client!vf", name = "c", descriptor = "(Z)V")
	public void method5404() {
		if (this.aClass251_4 != null) {
			this.aClass251_4.method5341();
		}
	}

	@OriginalMember(owner = "client!vf", name = "c", descriptor = "(B)I")
	private int method5405() {
		return this.aClass244_10.method5239() + this.aClass244_11.method5239();
	}

	@OriginalMember(owner = "client!vf", name = "d", descriptor = "(B)Z")
	public boolean method5406() {
		return this.method5405() >= 20;
	}

	@OriginalMember(owner = "client!vf", name = "e", descriptor = "(B)V")
	public void method5407() {
		try {
			this.aClass251_4.method5345();
		} catch (@Pc(5) Exception local5) {
		}
		this.anInt6910++;
		this.aByte102 = (byte) (Math.random() * 255.0D + 1.0D);
		this.aClass251_4 = null;
		this.anInt6911 = -1;
	}
}
