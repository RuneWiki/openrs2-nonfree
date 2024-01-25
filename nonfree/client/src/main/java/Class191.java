import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pq")
public final class Class191 {

	@OriginalMember(owner = "client!pq", name = "x", descriptor = "I")
	private int anInt5449;

	@OriginalMember(owner = "client!pq", name = "y", descriptor = "J")
	private long aLong179;

	@OriginalMember(owner = "client!pq", name = "z", descriptor = "Lclient!ov;")
	private Class180 aClass180_2;

	@OriginalMember(owner = "client!pq", name = "F", descriptor = "Lclient!hk;")
	private Class3_Sub3_Sub11_Sub1 aClass3_Sub3_Sub11_Sub1_2;

	@OriginalMember(owner = "client!pq", name = "o", descriptor = "Lclient!et;")
	private final Class65 aClass65_3 = new Class65();

	@OriginalMember(owner = "client!pq", name = "s", descriptor = "Lclient!et;")
	private final Class65 aClass65_4 = new Class65();

	@OriginalMember(owner = "client!pq", name = "v", descriptor = "Lclient!et;")
	private final Class65 aClass65_5 = new Class65();

	@OriginalMember(owner = "client!pq", name = "w", descriptor = "Lclient!et;")
	private final Class65 aClass65_6 = new Class65();

	@OriginalMember(owner = "client!pq", name = "A", descriptor = "Lclient!nj;")
	private final Class3_Sub25 aClass3_Sub25_5 = new Class3_Sub25(4);

	@OriginalMember(owner = "client!pq", name = "B", descriptor = "B")
	private byte aByte73 = 0;

	@OriginalMember(owner = "client!pq", name = "C", descriptor = "I")
	public volatile int anInt5450 = 0;

	@OriginalMember(owner = "client!pq", name = "D", descriptor = "I")
	public volatile int anInt5451 = 0;

	@OriginalMember(owner = "client!pq", name = "E", descriptor = "Lclient!nj;")
	private final Class3_Sub25 aClass3_Sub25_6 = new Class3_Sub25(8);

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(B)V")
	public void method4498() {
		try {
			this.aClass180_2.method4357();
		} catch (@Pc(9) Exception local9) {
		}
		this.anInt5451 = -1;
		this.anInt5450++;
		this.aByte73 = (byte) (Math.random() * 255.0D + 1.0D);
		this.aClass180_2 = null;
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(ZLclient!ov;B)V")
	public void method4499(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class180 arg1) {
		if (this.aClass180_2 != null) {
			try {
				this.aClass180_2.method4357();
			} catch (@Pc(10) Exception local10) {
			}
			this.aClass180_2 = null;
		}
		this.aClass180_2 = arg1;
		this.method4508();
		this.method4512(arg0);
		this.aClass3_Sub25_6.anInt4974 = 0;
		this.aClass3_Sub3_Sub11_Sub1_2 = null;
		while (true) {
			@Pc(47) Class3_Sub3_Sub11_Sub1 local47 = (Class3_Sub3_Sub11_Sub1) this.aClass65_4.method1685();
			if (local47 == null) {
				while (true) {
					local47 = (Class3_Sub3_Sub11_Sub1) this.aClass65_6.method1685();
					if (local47 == null) {
						if (this.aByte73 != 0) {
							try {
								this.aClass3_Sub25_5.anInt4974 = 0;
								this.aClass3_Sub25_5.method4081(4);
								this.aClass3_Sub25_5.method4081(this.aByte73);
								this.aClass3_Sub25_5.method4123(0);
								this.aClass180_2.method4358(4, this.aClass3_Sub25_5.aByteArray88);
							} catch (@Pc(108) IOException local108) {
								try {
									this.aClass180_2.method4357();
								} catch (@Pc(114) Exception local114) {
								}
								this.aClass180_2 = null;
								this.anInt5450++;
								this.anInt5451 = -2;
							}
						}
						this.anInt5449 = 0;
						this.aLong179 = Static354.method4966();
						return;
					}
					this.aClass65_5.method1686(local47);
				}
			}
			this.aClass65_3.method1686(local47);
		}
	}

	@OriginalMember(owner = "client!pq", name = "b", descriptor = "(B)Z")
	public boolean method4500() {
		return this.method4502() >= 20;
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(I)Z")
	public boolean method4501() {
		@Pc(18) int local18;
		if (this.aClass180_2 != null) {
			@Pc(11) long local11 = Static354.method4966();
			local18 = (int) (local11 - this.aLong179);
			this.aLong179 = local11;
			if (local18 > 200) {
				local18 = 200;
			}
			this.anInt5449 += local18;
			if (this.anInt5449 > 30000) {
				try {
					this.aClass180_2.method4357();
				} catch (@Pc(44) Exception local44) {
				}
				this.aClass180_2 = null;
			}
		}
		if (this.aClass180_2 == null) {
			return this.method4502() == 0 && this.method4514() == 0;
		}
		try {
			this.aClass180_2.method4356();
			for (@Pc(78) Class3_Sub3_Sub11_Sub1 local78 = (Class3_Sub3_Sub11_Sub1) this.aClass65_3.method1684(); local78 != null; local78 = (Class3_Sub3_Sub11_Sub1) this.aClass65_3.method1688()) {
				this.aClass3_Sub25_5.anInt4974 = 0;
				this.aClass3_Sub25_5.method4081(1);
				this.aClass3_Sub25_5.method4124((int) local78.aLong243);
				this.aClass180_2.method4358(4, this.aClass3_Sub25_5.aByteArray88);
				this.aClass65_4.method1686(local78);
			}
			for (@Pc(127) Class3_Sub3_Sub11_Sub1 local127 = (Class3_Sub3_Sub11_Sub1) this.aClass65_5.method1684(); local127 != null; local127 = (Class3_Sub3_Sub11_Sub1) this.aClass65_5.method1688()) {
				this.aClass3_Sub25_5.anInt4974 = 0;
				this.aClass3_Sub25_5.method4081(0);
				this.aClass3_Sub25_5.method4124((int) local127.aLong243);
				this.aClass180_2.method4358(4, this.aClass3_Sub25_5.aByteArray88);
				this.aClass65_6.method1686(local127);
			}
			for (local18 = 0; local18 < 100; local18++) {
				@Pc(176) int local176 = this.aClass180_2.method4355();
				if (local176 < 0) {
					throw new IOException();
				}
				if (local176 == 0) {
					break;
				}
				this.anInt5449 = 0;
				@Pc(195) byte local195 = 0;
				if (this.aClass3_Sub3_Sub11_Sub1_2 == null) {
					local195 = 8;
				} else if (this.aClass3_Sub3_Sub11_Sub1_2.anInt2799 == 0) {
					local195 = 1;
				}
				@Pc(221) int local221;
				@Pc(228) int local228;
				@Pc(278) int local278;
				if (local195 <= 0) {
					local221 = this.aClass3_Sub3_Sub11_Sub1_2.aClass3_Sub25_3.aByteArray88.length - this.aClass3_Sub3_Sub11_Sub1_2.aByte33;
					local228 = 512 - this.aClass3_Sub3_Sub11_Sub1_2.anInt2799;
					if (local228 > local221 - this.aClass3_Sub3_Sub11_Sub1_2.aClass3_Sub25_3.anInt4974) {
						local228 = local221 - this.aClass3_Sub3_Sub11_Sub1_2.aClass3_Sub25_3.anInt4974;
					}
					if (local176 < local228) {
						local228 = local176;
					}
					this.aClass180_2.method4362(local228, this.aClass3_Sub3_Sub11_Sub1_2.aClass3_Sub25_3.anInt4974, this.aClass3_Sub3_Sub11_Sub1_2.aClass3_Sub25_3.aByteArray88);
					if (this.aByte73 != 0) {
						for (local278 = 0; local278 < local228; local278++) {
							this.aClass3_Sub3_Sub11_Sub1_2.aClass3_Sub25_3.aByteArray88[local278 + this.aClass3_Sub3_Sub11_Sub1_2.aClass3_Sub25_3.anInt4974] ^= this.aByte73;
						}
					}
					this.aClass3_Sub3_Sub11_Sub1_2.anInt2799 += local228;
					this.aClass3_Sub3_Sub11_Sub1_2.aClass3_Sub25_3.anInt4974 += local228;
					if (local221 == this.aClass3_Sub3_Sub11_Sub1_2.aClass3_Sub25_3.anInt4974) {
						this.aClass3_Sub3_Sub11_Sub1_2.method6102();
						this.aClass3_Sub3_Sub11_Sub1_2.aBoolean437 = false;
						this.aClass3_Sub3_Sub11_Sub1_2 = null;
					} else if (this.aClass3_Sub3_Sub11_Sub1_2.anInt2799 == 512) {
						this.aClass3_Sub3_Sub11_Sub1_2.anInt2799 = 0;
					}
				} else {
					local221 = local195 - this.aClass3_Sub25_6.anInt4974;
					if (local221 > local176) {
						local221 = local176;
					}
					this.aClass180_2.method4362(local221, this.aClass3_Sub25_6.anInt4974, this.aClass3_Sub25_6.aByteArray88);
					if (this.aByte73 != 0) {
						for (local228 = 0; local228 < local221; local228++) {
							this.aClass3_Sub25_6.aByteArray88[local228 + this.aClass3_Sub25_6.anInt4974] ^= this.aByte73;
						}
					}
					this.aClass3_Sub25_6.anInt4974 += local221;
					if (local195 <= this.aClass3_Sub25_6.anInt4974) {
						if (this.aClass3_Sub3_Sub11_Sub1_2 == null) {
							this.aClass3_Sub25_6.anInt4974 = 0;
							local228 = this.aClass3_Sub25_6.method4096();
							local278 = this.aClass3_Sub25_6.method4083();
							@Pc(450) int local450 = this.aClass3_Sub25_6.method4096();
							@Pc(455) int local455 = this.aClass3_Sub25_6.method4108();
							@Pc(459) int local459 = local450 & 0x7F;
							@Pc(470) boolean local470 = (local450 & 0x80) != 0;
							@Pc(477) long local477 = (long) ((local228 << 16) + local278);
							@Pc(487) Class3_Sub3_Sub11_Sub1 local487;
							if (local470) {
								for (local487 = (Class3_Sub3_Sub11_Sub1) this.aClass65_6.method1684(); local487 != null && local477 != local487.aLong243; local487 = (Class3_Sub3_Sub11_Sub1) this.aClass65_6.method1688()) {
								}
							} else {
								for (local487 = (Class3_Sub3_Sub11_Sub1) this.aClass65_4.method1684(); local487 != null && local477 != local487.aLong243; local487 = (Class3_Sub3_Sub11_Sub1) this.aClass65_4.method1688()) {
								}
							}
							if (local487 == null) {
								throw new IOException();
							}
							this.aClass3_Sub3_Sub11_Sub1_2 = local487;
							@Pc(551) int local551 = local459 == 0 ? 5 : 9;
							this.aClass3_Sub3_Sub11_Sub1_2.aClass3_Sub25_3 = new Class3_Sub25(this.aClass3_Sub3_Sub11_Sub1_2.aByte33 + local455 + local551);
							this.aClass3_Sub3_Sub11_Sub1_2.aClass3_Sub25_3.method4081(local459);
							this.aClass3_Sub3_Sub11_Sub1_2.aClass3_Sub25_3.method4082(local455);
							this.aClass3_Sub3_Sub11_Sub1_2.anInt2799 = 8;
							this.aClass3_Sub25_6.anInt4974 = 0;
						} else if (this.aClass3_Sub3_Sub11_Sub1_2.anInt2799 != 0) {
							throw new IOException();
						} else if (this.aClass3_Sub25_6.aByteArray88[0] == -1) {
							this.aClass3_Sub3_Sub11_Sub1_2.anInt2799 = 1;
							this.aClass3_Sub25_6.anInt4974 = 0;
						} else {
							this.aClass3_Sub3_Sub11_Sub1_2 = null;
						}
					}
				}
			}
			return true;
		} catch (@Pc(627) IOException local627) {
			try {
				this.aClass180_2.method4357();
			} catch (@Pc(633) Exception local633) {
			}
			this.anInt5450++;
			this.aClass180_2 = null;
			this.anInt5451 = -2;
			return this.method4502() == 0 && this.method4514() == 0;
		}
	}

	@OriginalMember(owner = "client!pq", name = "c", descriptor = "(B)I")
	public int method4502() {
		return this.aClass65_3.method1689() + this.aClass65_4.method1689();
	}

	@OriginalMember(owner = "client!pq", name = "d", descriptor = "(B)Z")
	public boolean method4503() {
		return this.method4514() >= 20;
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(ZIBII)Lclient!hk;")
	public Class3_Sub3_Sub11_Sub1 method4504(@OriginalArg(0) boolean arg0, @OriginalArg(2) byte arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(10) long local10 = (long) ((arg3 << 16) + arg2);
		@Pc(14) Class3_Sub3_Sub11_Sub1 local14 = new Class3_Sub3_Sub11_Sub1();
		local14.aBoolean438 = arg0;
		local14.aByte33 = arg1;
		local14.aLong243 = local10;
		if (arg0) {
			if (this.method4502() >= 20) {
				throw new RuntimeException();
			}
			this.aClass65_3.method1686(local14);
		} else if (this.method4514() < 20) {
			this.aClass65_5.method1686(local14);
		} else {
			throw new RuntimeException();
		}
		return local14;
	}

	@OriginalMember(owner = "client!pq", name = "b", descriptor = "(I)V")
	private void method4508() {
		if (this.aClass180_2 == null) {
			return;
		}
		try {
			this.aClass3_Sub25_5.anInt4974 = 0;
			this.aClass3_Sub25_5.method4081(6);
			this.aClass3_Sub25_5.method4124(3);
			this.aClass180_2.method4358(4, this.aClass3_Sub25_5.aByteArray88);
		} catch (@Pc(32) IOException local32) {
			try {
				this.aClass180_2.method4357();
			} catch (@Pc(38) Exception local38) {
			}
			this.anInt5451 = -2;
			this.aClass180_2 = null;
			this.anInt5450++;
		}
	}

	@OriginalMember(owner = "client!pq", name = "e", descriptor = "(B)V")
	public void method4509() {
		if (this.aClass180_2 != null) {
			this.aClass180_2.method4359();
		}
	}

	@OriginalMember(owner = "client!pq", name = "f", descriptor = "(B)V")
	public void method4510() {
		if (this.aClass180_2 == null) {
			return;
		}
		try {
			this.aClass3_Sub25_5.anInt4974 = 0;
			this.aClass3_Sub25_5.method4081(7);
			this.aClass3_Sub25_5.method4124(0);
			this.aClass180_2.method4358(4, this.aClass3_Sub25_5.aByteArray88);
		} catch (@Pc(37) IOException local37) {
			try {
				this.aClass180_2.method4357();
			} catch (@Pc(43) Exception local43) {
			}
			this.anInt5451 = -2;
			this.anInt5450++;
			this.aClass180_2 = null;
		}
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(IZ)V")
	public void method4512(@OriginalArg(1) boolean arg0) {
		if (this.aClass180_2 == null) {
			return;
		}
		try {
			this.aClass3_Sub25_5.anInt4974 = 0;
			this.aClass3_Sub25_5.method4081(arg0 ? 2 : 3);
			this.aClass3_Sub25_5.method4124(0);
			this.aClass180_2.method4358(4, this.aClass3_Sub25_5.aByteArray88);
		} catch (@Pc(36) IOException local36) {
			try {
				this.aClass180_2.method4357();
			} catch (@Pc(42) Exception local42) {
			}
			this.anInt5450++;
			this.anInt5451 = -2;
			this.aClass180_2 = null;
		}
	}

	@OriginalMember(owner = "client!pq", name = "c", descriptor = "(I)V")
	public void method4513() {
		if (this.aClass180_2 != null) {
			this.aClass180_2.method4357();
		}
	}

	@OriginalMember(owner = "client!pq", name = "d", descriptor = "(I)I")
	private int method4514() {
		return this.aClass65_5.method1689() + this.aClass65_6.method1689();
	}
}
