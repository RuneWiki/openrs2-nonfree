import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!np")
public final class Class228 {

	@OriginalMember(owner = "client!np", name = "x", descriptor = "J")
	private long aLong153;

	@OriginalMember(owner = "client!np", name = "y", descriptor = "Lclient!ua;")
	private Class310 aClass310_2;

	@OriginalMember(owner = "client!np", name = "A", descriptor = "I")
	private int anInt6788;

	@OriginalMember(owner = "client!np", name = "G", descriptor = "Lclient!lba;")
	private Class6_Sub4_Sub9_Sub1 aClass6_Sub4_Sub9_Sub1_2;

	@OriginalMember(owner = "client!np", name = "r", descriptor = "Lclient!hv;")
	private final Class143 aClass143_5 = new Class143();

	@OriginalMember(owner = "client!np", name = "t", descriptor = "Lclient!hv;")
	private final Class143 aClass143_6 = new Class143();

	@OriginalMember(owner = "client!np", name = "u", descriptor = "Lclient!hv;")
	private final Class143 aClass143_7 = new Class143();

	@OriginalMember(owner = "client!np", name = "w", descriptor = "Lclient!hv;")
	private final Class143 aClass143_8 = new Class143();

	@OriginalMember(owner = "client!np", name = "z", descriptor = "Lclient!iaa;")
	private final Class6_Sub26 aClass6_Sub26_4 = new Class6_Sub26(4);

	@OriginalMember(owner = "client!np", name = "B", descriptor = "I")
	public volatile int anInt6789 = 0;

	@OriginalMember(owner = "client!np", name = "D", descriptor = "I")
	public volatile int anInt6790 = 0;

	@OriginalMember(owner = "client!np", name = "C", descriptor = "B")
	private byte aByte73 = 0;

	@OriginalMember(owner = "client!np", name = "E", descriptor = "Lclient!iaa;")
	private final Class6_Sub26 aClass6_Sub26_5 = new Class6_Sub26(8);

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(B)V")
	public void method5707() {
		try {
			this.aClass310_2.method7513();
		} catch (@Pc(9) Exception local9) {
		}
		this.anInt6790 = -1;
		this.aByte73 = (byte) (Math.random() * 255.0D + 1.0D);
		this.aClass310_2 = null;
		this.anInt6789++;
	}

	@OriginalMember(owner = "client!np", name = "b", descriptor = "(B)V")
	public void method5708() {
		if (this.aClass310_2 != null) {
			this.aClass310_2.method7518();
		}
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(Z)I")
	public int method5709() {
		return this.aClass143_5.method3838() + this.aClass143_6.method3838();
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(I)I")
	private int method5710() {
		return this.aClass143_7.method3838() + this.aClass143_8.method3838();
	}

	@OriginalMember(owner = "client!np", name = "b", descriptor = "(Z)Z")
	public boolean method5711() {
		return this.method5710() >= 20;
	}

	@OriginalMember(owner = "client!np", name = "c", descriptor = "(Z)Z")
	public boolean method5712() {
		return this.method5709() >= 20;
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(ZZ)V")
	public void method5713(@OriginalArg(0) boolean arg0) {
		if (this.aClass310_2 == null) {
			return;
		}
		try {
			this.aClass6_Sub26_4.anInt5769 = 0;
			this.aClass6_Sub26_4.method4950(arg0 ? 2 : 3, -81849);
			this.aClass6_Sub26_4.method4937(0);
			this.aClass310_2.method7519(this.aClass6_Sub26_4.aByteArray65, 4);
		} catch (@Pc(40) IOException local40) {
			try {
				this.aClass310_2.method7513();
			} catch (@Pc(46) Exception local46) {
			}
			this.aClass310_2 = null;
			this.anInt6789++;
			this.anInt6790 = -2;
		}
	}

	@OriginalMember(owner = "client!np", name = "b", descriptor = "(I)V")
	private void method5714() {
		if (this.aClass310_2 == null) {
			return;
		}
		try {
			this.aClass6_Sub26_4.anInt5769 = 0;
			this.aClass6_Sub26_4.method4950(6, -81849);
			this.aClass6_Sub26_4.method4937(3);
			this.aClass310_2.method7519(this.aClass6_Sub26_4.aByteArray65, 4);
		} catch (@Pc(37) IOException local37) {
			try {
				this.aClass310_2.method7513();
			} catch (@Pc(43) Exception local43) {
			}
			this.anInt6790 = -2;
			this.anInt6789++;
			this.aClass310_2 = null;
		}
	}

	@OriginalMember(owner = "client!np", name = "d", descriptor = "(B)Z")
	public boolean method5716() {
		@Pc(18) int local18;
		if (this.aClass310_2 != null) {
			@Pc(11) long local11 = Static174.method3502();
			local18 = (int) (local11 - this.aLong153);
			this.aLong153 = local11;
			if (local18 > 200) {
				local18 = 200;
			}
			this.anInt6788 += local18;
			if (this.anInt6788 > 30000) {
				try {
					this.aClass310_2.method7513();
				} catch (@Pc(44) Exception local44) {
				}
				this.aClass310_2 = null;
			}
		}
		if (this.aClass310_2 == null) {
			return this.method5709() == 0 && this.method5710() == 0;
		}
		try {
			this.aClass310_2.method7511();
			for (@Pc(75) Class6_Sub4_Sub9_Sub1 local75 = (Class6_Sub4_Sub9_Sub1) this.aClass143_5.method3839(); local75 != null; local75 = (Class6_Sub4_Sub9_Sub1) this.aClass143_5.method3833()) {
				this.aClass6_Sub26_4.anInt5769 = 0;
				this.aClass6_Sub26_4.method4950(1, -81849);
				this.aClass6_Sub26_4.method4937((int) local75.aLong247);
				this.aClass310_2.method7519(this.aClass6_Sub26_4.aByteArray65, 4);
				this.aClass143_6.method3835(local75);
			}
			for (@Pc(127) Class6_Sub4_Sub9_Sub1 local127 = (Class6_Sub4_Sub9_Sub1) this.aClass143_7.method3839(); local127 != null; local127 = (Class6_Sub4_Sub9_Sub1) this.aClass143_7.method3833()) {
				this.aClass6_Sub26_4.anInt5769 = 0;
				this.aClass6_Sub26_4.method4950(0, -81849);
				this.aClass6_Sub26_4.method4937((int) local127.aLong247);
				this.aClass310_2.method7519(this.aClass6_Sub26_4.aByteArray65, 4);
				this.aClass143_8.method3835(local127);
			}
			for (local18 = 0; local18 < 100; local18++) {
				@Pc(176) int local176 = this.aClass310_2.method7517();
				if (local176 < 0) {
					throw new IOException();
				}
				if (local176 == 0) {
					break;
				}
				this.anInt6788 = 0;
				@Pc(195) byte local195 = 0;
				if (this.aClass6_Sub4_Sub9_Sub1_2 == null) {
					local195 = 8;
				} else if (this.aClass6_Sub4_Sub9_Sub1_2.anInt5546 == 0) {
					local195 = 1;
				}
				@Pc(220) int local220;
				@Pc(245) int local245;
				@Pc(306) int local306;
				if (local195 > 0) {
					local220 = local195 - this.aClass6_Sub26_5.anInt5769;
					if (local176 < local220) {
						local220 = local176;
					}
					this.aClass310_2.method7512(local220, this.aClass6_Sub26_5.aByteArray65, this.aClass6_Sub26_5.anInt5769);
					if (this.aByte73 != 0) {
						for (local245 = 0; local245 < local220; local245++) {
							this.aClass6_Sub26_5.aByteArray65[local245 + this.aClass6_Sub26_5.anInt5769] ^= this.aByte73;
						}
					}
					this.aClass6_Sub26_5.anInt5769 += local220;
					if (this.aClass6_Sub26_5.anInt5769 >= local195) {
						if (this.aClass6_Sub4_Sub9_Sub1_2 == null) {
							this.aClass6_Sub26_5.anInt5769 = 0;
							local245 = this.aClass6_Sub26_5.method4966();
							local306 = this.aClass6_Sub26_5.method4999();
							@Pc(311) int local311 = this.aClass6_Sub26_5.method4966();
							@Pc(316) int local316 = this.aClass6_Sub26_5.method5000();
							@Pc(320) int local320 = local311 & 0x7F;
							@Pc(328) boolean local328 = (local311 & 0x80) != 0;
							@Pc(335) long local335 = (long) (local306 + (local245 << 16));
							@Pc(345) Class6_Sub4_Sub9_Sub1 local345;
							if (local328) {
								for (local345 = (Class6_Sub4_Sub9_Sub1) this.aClass143_8.method3839(); local345 != null && local345.aLong247 != local335; local345 = (Class6_Sub4_Sub9_Sub1) this.aClass143_8.method3833()) {
								}
							} else {
								for (local345 = (Class6_Sub4_Sub9_Sub1) this.aClass143_6.method3839(); local345 != null && local345.aLong247 != local335; local345 = (Class6_Sub4_Sub9_Sub1) this.aClass143_6.method3833()) {
								}
							}
							if (local345 == null) {
								throw new IOException();
							}
							this.aClass6_Sub4_Sub9_Sub1_2 = local345;
							@Pc(412) int local412 = local320 == 0 ? 5 : 9;
							this.aClass6_Sub4_Sub9_Sub1_2.aClass6_Sub26_2 = new Class6_Sub26(this.aClass6_Sub4_Sub9_Sub1_2.aByte51 + local316 + local412);
							this.aClass6_Sub4_Sub9_Sub1_2.aClass6_Sub26_2.method4950(local320, -81849);
							this.aClass6_Sub4_Sub9_Sub1_2.aClass6_Sub26_2.method4979(local316);
							this.aClass6_Sub4_Sub9_Sub1_2.anInt5546 = 8;
							this.aClass6_Sub26_5.anInt5769 = 0;
						} else if (this.aClass6_Sub4_Sub9_Sub1_2.anInt5546 != 0) {
							throw new IOException();
						} else if (this.aClass6_Sub26_5.aByteArray65[0] == -1) {
							this.aClass6_Sub4_Sub9_Sub1_2.anInt5546 = 1;
							this.aClass6_Sub26_5.anInt5769 = 0;
						} else {
							this.aClass6_Sub4_Sub9_Sub1_2 = null;
						}
					}
				} else {
					local220 = this.aClass6_Sub4_Sub9_Sub1_2.aClass6_Sub26_2.aByteArray65.length - this.aClass6_Sub4_Sub9_Sub1_2.aByte51;
					local245 = 512 - this.aClass6_Sub4_Sub9_Sub1_2.anInt5546;
					if (local245 > local220 - this.aClass6_Sub4_Sub9_Sub1_2.aClass6_Sub26_2.anInt5769) {
						local245 = local220 - this.aClass6_Sub4_Sub9_Sub1_2.aClass6_Sub26_2.anInt5769;
					}
					if (local176 < local245) {
						local245 = local176;
					}
					this.aClass310_2.method7512(local245, this.aClass6_Sub4_Sub9_Sub1_2.aClass6_Sub26_2.aByteArray65, this.aClass6_Sub4_Sub9_Sub1_2.aClass6_Sub26_2.anInt5769);
					if (this.aByte73 != 0) {
						for (local306 = 0; local306 < local245; local306++) {
							this.aClass6_Sub4_Sub9_Sub1_2.aClass6_Sub26_2.aByteArray65[this.aClass6_Sub4_Sub9_Sub1_2.aClass6_Sub26_2.anInt5769 + local306] ^= this.aByte73;
						}
					}
					this.aClass6_Sub4_Sub9_Sub1_2.aClass6_Sub26_2.anInt5769 += local245;
					this.aClass6_Sub4_Sub9_Sub1_2.anInt5546 += local245;
					if (local220 == this.aClass6_Sub4_Sub9_Sub1_2.aClass6_Sub26_2.anInt5769) {
						this.aClass6_Sub4_Sub9_Sub1_2.method8035();
						this.aClass6_Sub4_Sub9_Sub1_2.aBoolean715 = false;
						this.aClass6_Sub4_Sub9_Sub1_2 = null;
					} else if (this.aClass6_Sub4_Sub9_Sub1_2.anInt5546 == 512) {
						this.aClass6_Sub4_Sub9_Sub1_2.anInt5546 = 0;
					}
				}
			}
			return true;
		} catch (@Pc(626) IOException local626) {
			try {
				this.aClass310_2.method7513();
			} catch (@Pc(632) Exception local632) {
			}
			this.aClass310_2 = null;
			this.anInt6789++;
			this.anInt6790 = -2;
			return this.method5709() == 0 && this.method5710() == 0;
		}
	}

	@OriginalMember(owner = "client!np", name = "e", descriptor = "(Z)V")
	public void method5718() {
		if (this.aClass310_2 != null) {
			this.aClass310_2.method7513();
		}
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(BZIIB)Lclient!lba;")
	public Class6_Sub4_Sub9_Sub1 method5719(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) byte arg3) {
		@Pc(10) long local10 = (long) ((arg2 << 16) + arg1);
		@Pc(14) Class6_Sub4_Sub9_Sub1 local14 = new Class6_Sub4_Sub9_Sub1();
		local14.aLong247 = local10;
		local14.aBoolean714 = arg0;
		local14.aByte51 = arg3;
		if (arg0) {
			if (this.method5709() >= 20) {
				throw new RuntimeException();
			}
			this.aClass143_5.method3835(local14);
		} else if (this.method5710() < 20) {
			this.aClass143_7.method3835(local14);
		} else {
			throw new RuntimeException();
		}
		return local14;
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(Lclient!ua;ZB)V")
	public void method5721(@OriginalArg(0) Class310 arg0, @OriginalArg(1) boolean arg1) {
		if (this.aClass310_2 != null) {
			try {
				this.aClass310_2.method7513();
			} catch (@Pc(10) Exception local10) {
			}
			this.aClass310_2 = null;
		}
		this.aClass310_2 = arg0;
		this.method5714();
		this.method5713(arg1);
		this.aClass6_Sub4_Sub9_Sub1_2 = null;
		this.aClass6_Sub26_5.anInt5769 = 0;
		while (true) {
			@Pc(48) Class6_Sub4_Sub9_Sub1 local48 = (Class6_Sub4_Sub9_Sub1) this.aClass143_6.method3836();
			if (local48 == null) {
				while (true) {
					local48 = (Class6_Sub4_Sub9_Sub1) this.aClass143_8.method3836();
					if (local48 == null) {
						if (this.aByte73 != 0) {
							try {
								this.aClass6_Sub26_4.anInt5769 = 0;
								this.aClass6_Sub26_4.method4950(4, -81849);
								this.aClass6_Sub26_4.method4950(this.aByte73, -81849);
								this.aClass6_Sub26_4.method4962(0);
								this.aClass310_2.method7519(this.aClass6_Sub26_4.aByteArray65, 4);
							} catch (@Pc(109) IOException local109) {
								try {
									this.aClass310_2.method7513();
								} catch (@Pc(115) Exception local115) {
								}
								this.anInt6789++;
								this.aClass310_2 = null;
								this.anInt6790 = -2;
							}
						}
						this.anInt6788 = 0;
						this.aLong153 = Static174.method3502();
						return;
					}
					this.aClass143_7.method3835(local48);
				}
			}
			this.aClass143_5.method3835(local48);
		}
	}

	@OriginalMember(owner = "client!np", name = "c", descriptor = "(I)V")
	public void method5722() {
		if (this.aClass310_2 == null) {
			return;
		}
		try {
			this.aClass6_Sub26_4.anInt5769 = 0;
			this.aClass6_Sub26_4.method4950(7, -81849);
			this.aClass6_Sub26_4.method4937(0);
			this.aClass310_2.method7519(this.aClass6_Sub26_4.aByteArray65, 4);
		} catch (@Pc(36) IOException local36) {
			try {
				this.aClass310_2.method7513();
			} catch (@Pc(42) Exception local42) {
			}
			this.aClass310_2 = null;
			this.anInt6789++;
			this.anInt6790 = -2;
		}
	}
}
