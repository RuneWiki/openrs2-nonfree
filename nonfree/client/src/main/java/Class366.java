import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!us")
public final class Class366 {

	@OriginalMember(owner = "client!us", name = "w", descriptor = "I")
	private int anInt9590;

	@OriginalMember(owner = "client!us", name = "x", descriptor = "Lclient!go;")
	private Class147 aClass147_2;

	@OriginalMember(owner = "client!us", name = "y", descriptor = "J")
	private long aLong284;

	@OriginalMember(owner = "client!us", name = "E", descriptor = "Lclient!bj;")
	private Class3_Sub6_Sub2_Sub1 aClass3_Sub6_Sub2_Sub1_2;

	@OriginalMember(owner = "client!us", name = "g", descriptor = "Lclient!oaa;")
	private final Class258 aClass258_9 = new Class258();

	@OriginalMember(owner = "client!us", name = "m", descriptor = "Lclient!oaa;")
	private final Class258 aClass258_10 = new Class258();

	@OriginalMember(owner = "client!us", name = "u", descriptor = "Lclient!oaa;")
	private final Class258 aClass258_11 = new Class258();

	@OriginalMember(owner = "client!us", name = "v", descriptor = "Lclient!oaa;")
	private final Class258 aClass258_12 = new Class258();

	@OriginalMember(owner = "client!us", name = "z", descriptor = "Lclient!fca;")
	private final Class3_Sub17 aClass3_Sub17_9 = new Class3_Sub17(4);

	@OriginalMember(owner = "client!us", name = "B", descriptor = "I")
	public volatile int anInt9591 = 0;

	@OriginalMember(owner = "client!us", name = "C", descriptor = "B")
	private byte aByte135 = 0;

	@OriginalMember(owner = "client!us", name = "D", descriptor = "I")
	public volatile int anInt9592 = 0;

	@OriginalMember(owner = "client!us", name = "A", descriptor = "Lclient!fca;")
	private final Class3_Sub17 aClass3_Sub17_10 = new Class3_Sub17(8);

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(ZBIIB)Lclient!bj;")
	public Class3_Sub6_Sub2_Sub1 method8098(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) byte arg3) {
		@Pc(10) long local10 = (long) (arg1 + (arg2 << 16));
		@Pc(14) Class3_Sub6_Sub2_Sub1 local14 = new Class3_Sub6_Sub2_Sub1();
		local14.aBoolean678 = arg0;
		local14.aLong290 = local10;
		local14.aByte22 = arg3;
		if (arg0) {
			if (this.method8103() >= 20) {
				throw new RuntimeException();
			}
			this.aClass258_9.method5936(local14);
		} else if (this.method8101() < 20) {
			this.aClass258_11.method5936(local14);
		} else {
			throw new RuntimeException();
		}
		return local14;
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(BLclient!go;Z)V")
	public void method8100(@OriginalArg(1) Class147 arg0, @OriginalArg(2) boolean arg1) {
		if (this.aClass147_2 != null) {
			try {
				this.aClass147_2.method3216();
			} catch (@Pc(10) Exception local10) {
			}
			this.aClass147_2 = null;
		}
		this.aClass147_2 = arg0;
		this.method8111();
		this.method8112(arg1);
		this.aClass3_Sub17_10.lb = 0;
		this.aClass3_Sub6_Sub2_Sub1_2 = null;
		while (true) {
			@Pc(44) Class3_Sub6_Sub2_Sub1 local44 = (Class3_Sub6_Sub2_Sub1) this.aClass258_10.method5931();
			if (local44 == null) {
				while (true) {
					local44 = (Class3_Sub6_Sub2_Sub1) this.aClass258_12.method5931();
					if (local44 == null) {
						if (this.aByte135 != 0) {
							try {
								this.aClass3_Sub17_9.lb = 0;
								this.aClass3_Sub17_9.method4849(4);
								this.aClass3_Sub17_9.method4849(this.aByte135);
								this.aClass3_Sub17_9.method4876(0);
								this.aClass147_2.method3212(this.aClass3_Sub17_9.aByteArray59, 4);
							} catch (@Pc(105) IOException local105) {
								try {
									this.aClass147_2.method3216();
								} catch (@Pc(111) Exception local111) {
								}
								this.anInt9591++;
								this.anInt9592 = -2;
								this.aClass147_2 = null;
							}
						}
						this.anInt9590 = 0;
						this.aLong284 = Static131.method2268();
						return;
					}
					this.aClass258_11.method5936(local44);
				}
			}
			this.aClass258_9.method5936(local44);
		}
	}

	@OriginalMember(owner = "client!us", name = "b", descriptor = "(I)I")
	private int method8101() {
		return this.aClass258_11.method5932() + this.aClass258_12.method5932();
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(B)V")
	public void method8102() {
		if (this.aClass147_2 == null) {
			return;
		}
		try {
			this.aClass3_Sub17_9.lb = 0;
			this.aClass3_Sub17_9.method4849(7);
			this.aClass3_Sub17_9.method4848(0);
			this.aClass147_2.method3212(this.aClass3_Sub17_9.aByteArray59, 4);
		} catch (@Pc(34) IOException local34) {
			try {
				this.aClass147_2.method3216();
			} catch (@Pc(40) Exception local40) {
			}
			this.aClass147_2 = null;
			this.anInt9591++;
			this.anInt9592 = -2;
		}
	}

	@OriginalMember(owner = "client!us", name = "b", descriptor = "(B)I")
	public int method8103() {
		return this.aClass258_9.method5932() + this.aClass258_10.method5932();
	}

	@OriginalMember(owner = "client!us", name = "c", descriptor = "(I)V")
	public void method8104() {
		if (this.aClass147_2 != null) {
			this.aClass147_2.method3216();
		}
	}

	@OriginalMember(owner = "client!us", name = "d", descriptor = "(I)Z")
	public boolean method8105() {
		return this.method8103() >= 20;
	}

	@OriginalMember(owner = "client!us", name = "e", descriptor = "(I)V")
	public void method8106() {
		if (this.aClass147_2 != null) {
			this.aClass147_2.method3210();
		}
	}

	@OriginalMember(owner = "client!us", name = "f", descriptor = "(I)V")
	public void method8108() {
		try {
			this.aClass147_2.method3216();
		} catch (@Pc(5) Exception local5) {
		}
		this.aByte135 = (byte) (int) (Math.random() * 255.0D + 1.0D);
		this.anInt9592 = -1;
		this.aClass147_2 = null;
		this.anInt9591++;
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(Z)Z")
	public boolean method8109() {
		return this.method8101() >= 20;
	}

	@OriginalMember(owner = "client!us", name = "b", descriptor = "(Z)Z")
	public boolean method8110() {
		@Pc(14) int local14;
		if (this.aClass147_2 != null) {
			@Pc(7) long local7 = Static131.method2268();
			local14 = (int) (local7 - this.aLong284);
			this.aLong284 = local7;
			if (local14 > 200) {
				local14 = 200;
			}
			this.anInt9590 += local14;
			if (this.anInt9590 > 30000) {
				try {
					this.aClass147_2.method3216();
				} catch (@Pc(38) Exception local38) {
				}
				this.aClass147_2 = null;
			}
		}
		if (this.aClass147_2 == null) {
			return this.method8103() == 0 && this.method8101() == 0;
		}
		try {
			this.aClass147_2.method3211();
			for (@Pc(75) Class3_Sub6_Sub2_Sub1 local75 = (Class3_Sub6_Sub2_Sub1) this.aClass258_9.method5934(); local75 != null; local75 = (Class3_Sub6_Sub2_Sub1) this.aClass258_9.method5929()) {
				this.aClass3_Sub17_9.lb = 0;
				this.aClass3_Sub17_9.method4849(1);
				this.aClass3_Sub17_9.method4848((int) local75.aLong290);
				this.aClass147_2.method3212(this.aClass3_Sub17_9.aByteArray59, 4);
				this.aClass258_10.method5936(local75);
			}
			for (@Pc(121) Class3_Sub6_Sub2_Sub1 local121 = (Class3_Sub6_Sub2_Sub1) this.aClass258_11.method5934(); local121 != null; local121 = (Class3_Sub6_Sub2_Sub1) this.aClass258_11.method5929()) {
				this.aClass3_Sub17_9.lb = 0;
				this.aClass3_Sub17_9.method4849(0);
				this.aClass3_Sub17_9.method4848((int) local121.aLong290);
				this.aClass147_2.method3212(this.aClass3_Sub17_9.aByteArray59, 4);
				this.aClass258_12.method5936(local121);
			}
			for (local14 = 0; local14 < 100; local14++) {
				@Pc(170) int local170 = this.aClass147_2.method3213();
				if (local170 < 0) {
					throw new IOException();
				}
				if (local170 == 0) {
					break;
				}
				this.anInt9590 = 0;
				@Pc(186) byte local186 = 0;
				if (this.aClass3_Sub6_Sub2_Sub1_2 == null) {
					local186 = 8;
				} else if (this.aClass3_Sub6_Sub2_Sub1_2.anInt1272 == 0) {
					local186 = 1;
				}
				@Pc(214) int local214;
				@Pc(221) int local221;
				@Pc(265) int local265;
				if (local186 <= 0) {
					local214 = this.aClass3_Sub6_Sub2_Sub1_2.aClass3_Sub17_1.aByteArray59.length - this.aClass3_Sub6_Sub2_Sub1_2.aByte22;
					local221 = 512 - this.aClass3_Sub6_Sub2_Sub1_2.anInt1272;
					if (local214 - this.aClass3_Sub6_Sub2_Sub1_2.aClass3_Sub17_1.lb < local221) {
						local221 = local214 - this.aClass3_Sub6_Sub2_Sub1_2.aClass3_Sub17_1.lb;
					}
					if (local221 > local170) {
						local221 = local170;
					}
					this.aClass147_2.method3215(local221, this.aClass3_Sub6_Sub2_Sub1_2.aClass3_Sub17_1.aByteArray59, this.aClass3_Sub6_Sub2_Sub1_2.aClass3_Sub17_1.lb);
					if (this.aByte135 != 0) {
						for (local265 = 0; local265 < local221; local265++) {
							this.aClass3_Sub6_Sub2_Sub1_2.aClass3_Sub17_1.aByteArray59[this.aClass3_Sub6_Sub2_Sub1_2.aClass3_Sub17_1.lb + local265] ^= this.aByte135;
						}
					}
					this.aClass3_Sub6_Sub2_Sub1_2.aClass3_Sub17_1.lb += local221;
					this.aClass3_Sub6_Sub2_Sub1_2.anInt1272 += local221;
					if (this.aClass3_Sub6_Sub2_Sub1_2.aClass3_Sub17_1.lb == local214) {
						this.aClass3_Sub6_Sub2_Sub1_2.method8342();
						this.aClass3_Sub6_Sub2_Sub1_2.aBoolean677 = false;
						this.aClass3_Sub6_Sub2_Sub1_2 = null;
					} else if (this.aClass3_Sub6_Sub2_Sub1_2.anInt1272 == 512) {
						this.aClass3_Sub6_Sub2_Sub1_2.anInt1272 = 0;
					}
				} else {
					local214 = local186 - this.aClass3_Sub17_10.lb;
					if (local170 < local214) {
						local214 = local170;
					}
					this.aClass147_2.method3215(local214, this.aClass3_Sub17_10.aByteArray59, this.aClass3_Sub17_10.lb);
					if (this.aByte135 != 0) {
						for (local221 = 0; local221 < local214; local221++) {
							this.aClass3_Sub17_10.aByteArray59[this.aClass3_Sub17_10.lb + local221] = (byte) (this.aClass3_Sub17_10.aByteArray59[this.aClass3_Sub17_10.lb + local221] ^ this.aByte135);
						}
					}
					this.aClass3_Sub17_10.lb += local214;
					if (this.aClass3_Sub17_10.lb >= local186) {
						if (this.aClass3_Sub6_Sub2_Sub1_2 == null) {
							this.aClass3_Sub17_10.lb = 0;
							local221 = this.aClass3_Sub17_10.method4888();
							local265 = this.aClass3_Sub17_10.method4858();
							@Pc(447) int local447 = this.aClass3_Sub17_10.method4888();
							@Pc(452) int local452 = this.aClass3_Sub17_10.method4868();
							@Pc(456) int local456 = local447 & 0x7F;
							@Pc(467) boolean local467 = (local447 & 0x80) != 0;
							@Pc(474) long local474 = (long) (local265 + (local221 << 16));
							@Pc(484) Class3_Sub6_Sub2_Sub1 local484;
							if (local467) {
								for (local484 = (Class3_Sub6_Sub2_Sub1) this.aClass258_12.method5934(); local484 != null && local474 != local484.aLong290; local484 = (Class3_Sub6_Sub2_Sub1) this.aClass258_12.method5929()) {
								}
							} else {
								for (local484 = (Class3_Sub6_Sub2_Sub1) this.aClass258_10.method5934(); local484 != null && local484.aLong290 != local474; local484 = (Class3_Sub6_Sub2_Sub1) this.aClass258_10.method5929()) {
								}
							}
							if (local484 == null) {
								throw new IOException();
							}
							this.aClass3_Sub6_Sub2_Sub1_2 = local484;
							@Pc(547) int local547 = local456 == 0 ? 5 : 9;
							this.aClass3_Sub6_Sub2_Sub1_2.aClass3_Sub17_1 = new Class3_Sub17(this.aClass3_Sub6_Sub2_Sub1_2.aByte22 + local547 + local452);
							this.aClass3_Sub6_Sub2_Sub1_2.aClass3_Sub17_1.method4849(local456);
							this.aClass3_Sub6_Sub2_Sub1_2.aClass3_Sub17_1.method4854(local452);
							this.aClass3_Sub17_10.lb = 0;
							this.aClass3_Sub6_Sub2_Sub1_2.anInt1272 = 8;
						} else if (this.aClass3_Sub6_Sub2_Sub1_2.anInt1272 != 0) {
							throw new IOException();
						} else if (this.aClass3_Sub17_10.aByteArray59[0] == -1) {
							this.aClass3_Sub6_Sub2_Sub1_2.anInt1272 = 1;
							this.aClass3_Sub17_10.lb = 0;
						} else {
							this.aClass3_Sub6_Sub2_Sub1_2 = null;
						}
					}
				}
			}
			return true;
		} catch (@Pc(621) IOException local621) {
			try {
				this.aClass147_2.method3216();
			} catch (@Pc(627) Exception local627) {
			}
			this.anInt9592 = -2;
			this.anInt9591++;
			this.aClass147_2 = null;
			return this.method8103() == 0 && this.method8101() == 0;
		}
	}

	@OriginalMember(owner = "client!us", name = "g", descriptor = "(I)V")
	private void method8111() {
		if (this.aClass147_2 == null) {
			return;
		}
		try {
			this.aClass3_Sub17_9.lb = 0;
			this.aClass3_Sub17_9.method4849(6);
			this.aClass3_Sub17_9.method4848(3);
			this.aClass147_2.method3212(this.aClass3_Sub17_9.aByteArray59, 4);
		} catch (@Pc(40) IOException local40) {
			try {
				this.aClass147_2.method3216();
			} catch (@Pc(46) Exception local46) {
			}
			this.aClass147_2 = null;
			this.anInt9591++;
			this.anInt9592 = -2;
		}
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(IZ)V")
	public void method8112(@OriginalArg(1) boolean arg0) {
		if (this.aClass147_2 == null) {
			return;
		}
		try {
			this.aClass3_Sub17_9.lb = 0;
			this.aClass3_Sub17_9.method4849(arg0 ? 2 : 3);
			this.aClass3_Sub17_9.method4848(0);
			this.aClass147_2.method3212(this.aClass3_Sub17_9.aByteArray59, 4);
		} catch (@Pc(42) IOException local42) {
			try {
				this.aClass147_2.method3216();
			} catch (@Pc(48) Exception local48) {
			}
			this.aClass147_2 = null;
			this.anInt9591++;
			this.anInt9592 = -2;
		}
	}
}
