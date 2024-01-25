import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cq")
public final class Class35 {

	@OriginalMember(owner = "client!cq", name = "B", descriptor = "Lclient!ol;")
	private Class159 aClass159_1;

	@OriginalMember(owner = "client!cq", name = "C", descriptor = "J")
	private long aLong38;

	@OriginalMember(owner = "client!cq", name = "D", descriptor = "I")
	private int anInt1199;

	@OriginalMember(owner = "client!cq", name = "K", descriptor = "Lclient!ur;")
	private Class14_Sub2_Sub16_Sub2 aClass14_Sub2_Sub16_Sub2_1;

	@OriginalMember(owner = "client!cq", name = "m", descriptor = "Lclient!er;")
	private final Class56 aClass56_3 = new Class56();

	@OriginalMember(owner = "client!cq", name = "s", descriptor = "Lclient!er;")
	private final Class56 aClass56_4 = new Class56();

	@OriginalMember(owner = "client!cq", name = "u", descriptor = "Lclient!er;")
	private final Class56 aClass56_5 = new Class56();

	@OriginalMember(owner = "client!cq", name = "x", descriptor = "Lclient!er;")
	private final Class56 aClass56_6 = new Class56();

	@OriginalMember(owner = "client!cq", name = "F", descriptor = "Lclient!jg;")
	private final Class14_Sub4 aClass14_Sub4_1 = new Class14_Sub4(4);

	@OriginalMember(owner = "client!cq", name = "I", descriptor = "I")
	public volatile int anInt1201 = 0;

	@OriginalMember(owner = "client!cq", name = "H", descriptor = "I")
	public volatile int anInt1200 = 0;

	@OriginalMember(owner = "client!cq", name = "J", descriptor = "B")
	private byte aByte11 = 0;

	@OriginalMember(owner = "client!cq", name = "G", descriptor = "Lclient!jg;")
	private final Class14_Sub4 aClass14_Sub4_2 = new Class14_Sub4(8);

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(B)V")
	public void method1140() {
		if (this.aClass159_1 != null) {
			this.aClass159_1.method4079();
		}
	}

	@OriginalMember(owner = "client!cq", name = "b", descriptor = "(B)V")
	public void method1141() {
		if (this.aClass159_1 != null) {
			this.aClass159_1.method4077();
		}
	}

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(I)Z")
	public boolean method1142() {
		@Pc(18) int local18;
		if (this.aClass159_1 != null) {
			@Pc(11) long local11 = Static168.method3300();
			local18 = (int) (local11 - this.aLong38);
			this.aLong38 = local11;
			if (local18 > 200) {
				local18 = 200;
			}
			this.anInt1199 += local18;
			if (this.anInt1199 > 30000) {
				try {
					this.aClass159_1.method4079();
				} catch (@Pc(44) Exception local44) {
				}
				this.aClass159_1 = null;
			}
		}
		if (this.aClass159_1 == null) {
			return this.method1157() == 0 && this.method1145() == 0;
		}
		try {
			this.aClass159_1.method4085();
			for (@Pc(75) Class14_Sub2_Sub16_Sub2 local75 = (Class14_Sub2_Sub16_Sub2) this.aClass56_3.method1923(); local75 != null; local75 = (Class14_Sub2_Sub16_Sub2) this.aClass56_3.method1920()) {
				this.aClass14_Sub4_1.anInt2637 = 0;
				this.aClass14_Sub4_1.method2538(1);
				this.aClass14_Sub4_1.method2526((int) local75.aLong208);
				this.aClass159_1.method4082(this.aClass14_Sub4_1.aByteArray74, 4);
				this.aClass56_4.method1922(local75);
			}
			for (@Pc(121) Class14_Sub2_Sub16_Sub2 local121 = (Class14_Sub2_Sub16_Sub2) this.aClass56_5.method1923(); local121 != null; local121 = (Class14_Sub2_Sub16_Sub2) this.aClass56_5.method1920()) {
				this.aClass14_Sub4_1.anInt2637 = 0;
				this.aClass14_Sub4_1.method2538(0);
				this.aClass14_Sub4_1.method2526((int) local121.aLong208);
				this.aClass159_1.method4082(this.aClass14_Sub4_1.aByteArray74, 4);
				this.aClass56_6.method1922(local121);
			}
			for (local18 = 0; local18 < 100; local18++) {
				@Pc(174) int local174 = this.aClass159_1.method4083();
				if (local174 < 0) {
					throw new IOException();
				}
				if (local174 == 0) {
					break;
				}
				this.anInt1199 = 0;
				@Pc(187) byte local187 = 0;
				if (this.aClass14_Sub2_Sub16_Sub2_1 == null) {
					local187 = 8;
				} else if (this.aClass14_Sub2_Sub16_Sub2_1.anInt6277 == 0) {
					local187 = 1;
				}
				@Pc(211) int local211;
				@Pc(241) int local241;
				@Pc(306) int local306;
				if (local187 > 0) {
					local211 = local187 - this.aClass14_Sub4_2.anInt2637;
					if (local211 > local174) {
						local211 = local174;
					}
					this.aClass159_1.method4084(this.aClass14_Sub4_2.aByteArray74, local211, this.aClass14_Sub4_2.anInt2637);
					if (this.aByte11 != 0) {
						for (local241 = 0; local241 < local211; local241++) {
							this.aClass14_Sub4_2.aByteArray74[local241 + this.aClass14_Sub4_2.anInt2637] ^= this.aByte11;
						}
					}
					this.aClass14_Sub4_2.anInt2637 += local211;
					if (this.aClass14_Sub4_2.anInt2637 >= local187) {
						if (this.aClass14_Sub2_Sub16_Sub2_1 == null) {
							this.aClass14_Sub4_2.anInt2637 = 0;
							local241 = this.aClass14_Sub4_2.method2548();
							local306 = this.aClass14_Sub4_2.method2498();
							@Pc(311) int local311 = this.aClass14_Sub4_2.method2548();
							@Pc(316) int local316 = this.aClass14_Sub4_2.method2510();
							@Pc(320) int local320 = local311 & 0x7F;
							@Pc(331) boolean local331 = (local311 & 0x80) != 0;
							@Pc(338) long local338 = (long) (local306 + (local241 << 16));
							@Pc(348) Class14_Sub2_Sub16_Sub2 local348;
							if (local331) {
								for (local348 = (Class14_Sub2_Sub16_Sub2) this.aClass56_6.method1923(); local348 != null && local348.aLong208 != local338; local348 = (Class14_Sub2_Sub16_Sub2) this.aClass56_6.method1920()) {
								}
							} else {
								for (local348 = (Class14_Sub2_Sub16_Sub2) this.aClass56_4.method1923(); local348 != null && local338 != local348.aLong208; local348 = (Class14_Sub2_Sub16_Sub2) this.aClass56_4.method1920()) {
								}
							}
							if (local348 == null) {
								throw new IOException();
							}
							@Pc(411) int local411 = local320 == 0 ? 5 : 9;
							this.aClass14_Sub2_Sub16_Sub2_1 = local348;
							this.aClass14_Sub2_Sub16_Sub2_1.aClass14_Sub4_8 = new Class14_Sub4(local316 + local411 + this.aClass14_Sub2_Sub16_Sub2_1.aByte67);
							this.aClass14_Sub2_Sub16_Sub2_1.aClass14_Sub4_8.method2538(local320);
							this.aClass14_Sub2_Sub16_Sub2_1.aClass14_Sub4_8.method2541(local316);
							this.aClass14_Sub2_Sub16_Sub2_1.anInt6277 = 8;
							this.aClass14_Sub4_2.anInt2637 = 0;
						} else if (this.aClass14_Sub2_Sub16_Sub2_1.anInt6277 != 0) {
							throw new IOException();
						} else if (this.aClass14_Sub4_2.aByteArray74[0] == -1) {
							this.aClass14_Sub4_2.anInt2637 = 0;
							this.aClass14_Sub2_Sub16_Sub2_1.anInt6277 = 1;
						} else {
							this.aClass14_Sub2_Sub16_Sub2_1 = null;
						}
					}
				} else {
					local211 = this.aClass14_Sub2_Sub16_Sub2_1.aClass14_Sub4_8.aByteArray74.length - this.aClass14_Sub2_Sub16_Sub2_1.aByte67;
					local241 = 512 - this.aClass14_Sub2_Sub16_Sub2_1.anInt6277;
					if (local241 > local211 - this.aClass14_Sub2_Sub16_Sub2_1.aClass14_Sub4_8.anInt2637) {
						local241 = local211 - this.aClass14_Sub2_Sub16_Sub2_1.aClass14_Sub4_8.anInt2637;
					}
					if (local174 < local241) {
						local241 = local174;
					}
					this.aClass159_1.method4084(this.aClass14_Sub2_Sub16_Sub2_1.aClass14_Sub4_8.aByteArray74, local241, this.aClass14_Sub2_Sub16_Sub2_1.aClass14_Sub4_8.anInt2637);
					if (this.aByte11 != 0) {
						for (local306 = 0; local306 < local241; local306++) {
							this.aClass14_Sub2_Sub16_Sub2_1.aClass14_Sub4_8.aByteArray74[local306 + this.aClass14_Sub2_Sub16_Sub2_1.aClass14_Sub4_8.anInt2637] ^= this.aByte11;
						}
					}
					this.aClass14_Sub2_Sub16_Sub2_1.aClass14_Sub4_8.anInt2637 += local241;
					this.aClass14_Sub2_Sub16_Sub2_1.anInt6277 += local241;
					if (this.aClass14_Sub2_Sub16_Sub2_1.aClass14_Sub4_8.anInt2637 == local211) {
						this.aClass14_Sub2_Sub16_Sub2_1.method5760();
						this.aClass14_Sub2_Sub16_Sub2_1.aBoolean428 = false;
						this.aClass14_Sub2_Sub16_Sub2_1 = null;
					} else if (this.aClass14_Sub2_Sub16_Sub2_1.anInt6277 == 512) {
						this.aClass14_Sub2_Sub16_Sub2_1.anInt6277 = 0;
					}
				}
			}
			return true;
		} catch (@Pc(643) IOException local643) {
			try {
				this.aClass159_1.method4079();
			} catch (@Pc(649) Exception local649) {
			}
			this.anInt1200 = -2;
			this.aClass159_1 = null;
			this.anInt1201++;
			return this.method1157() == 0 && this.method1145() == 0;
		}
	}

	@OriginalMember(owner = "client!cq", name = "b", descriptor = "(I)V")
	public void method1143() {
		try {
			this.aClass159_1.method4079();
		} catch (@Pc(9) Exception local9) {
		}
		this.anInt1201++;
		this.aClass159_1 = null;
		this.aByte11 = (byte) (Math.random() * 255.0D + 1.0D);
		this.anInt1200 = -1;
	}

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(IZ)V")
	public void method1144(@OriginalArg(1) boolean arg0) {
		if (this.aClass159_1 == null) {
			return;
		}
		try {
			this.aClass14_Sub4_1.anInt2637 = 0;
			this.aClass14_Sub4_1.method2538(arg0 ? 2 : 3);
			this.aClass14_Sub4_1.method2526(0);
			this.aClass159_1.method4082(this.aClass14_Sub4_1.aByteArray74, 4);
		} catch (@Pc(44) IOException local44) {
			try {
				this.aClass159_1.method4079();
			} catch (@Pc(50) Exception local50) {
			}
			this.anInt1200 = -2;
			this.aClass159_1 = null;
			this.anInt1201++;
		}
	}

	@OriginalMember(owner = "client!cq", name = "c", descriptor = "(B)I")
	private int method1145() {
		return this.aClass56_5.method1915() + this.aClass56_6.method1915();
	}

	@OriginalMember(owner = "client!cq", name = "c", descriptor = "(I)Z")
	public boolean method1146() {
		return this.method1145() >= 20;
	}

	@OriginalMember(owner = "client!cq", name = "d", descriptor = "(I)V")
	public void method1151() {
		if (this.aClass159_1 == null) {
			return;
		}
		try {
			this.aClass14_Sub4_1.anInt2637 = 0;
			this.aClass14_Sub4_1.method2538(7);
			this.aClass14_Sub4_1.method2526(0);
			this.aClass159_1.method4082(this.aClass14_Sub4_1.aByteArray74, 4);
		} catch (@Pc(38) IOException local38) {
			try {
				this.aClass159_1.method4079();
			} catch (@Pc(44) Exception local44) {
			}
			this.aClass159_1 = null;
			this.anInt1200 = -2;
			this.anInt1201++;
		}
	}

	@OriginalMember(owner = "client!cq", name = "e", descriptor = "(I)V")
	private void method1152() {
		if (this.aClass159_1 == null) {
			return;
		}
		try {
			this.aClass14_Sub4_1.anInt2637 = 0;
			this.aClass14_Sub4_1.method2538(6);
			this.aClass14_Sub4_1.method2526(3);
			this.aClass159_1.method4082(this.aClass14_Sub4_1.aByteArray74, 4);
		} catch (@Pc(40) IOException local40) {
			try {
				this.aClass159_1.method4079();
			} catch (@Pc(46) Exception local46) {
			}
			this.anInt1200 = -2;
			this.anInt1201++;
			this.aClass159_1 = null;
		}
	}

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(Z)Z")
	public boolean method1153() {
		return this.method1157() >= 20;
	}

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(BIZII)Lclient!ur;")
	public Class14_Sub2_Sub16_Sub2 method1154(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3) {
		@Pc(17) long local17 = (long) (arg1 + (arg3 << 16));
		@Pc(21) Class14_Sub2_Sub16_Sub2 local21 = new Class14_Sub2_Sub16_Sub2();
		local21.aByte67 = arg0;
		local21.aLong208 = local17;
		local21.aBoolean427 = arg2;
		if (arg2) {
			if (this.method1157() >= 20) {
				throw new RuntimeException();
			}
			this.aClass56_3.method1922(local21);
		} else if (this.method1145() < 20) {
			this.aClass56_5.method1922(local21);
		} else {
			throw new RuntimeException();
		}
		return local21;
	}

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(BZLclient!ol;)V")
	public void method1155(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class159 arg1) {
		if (this.aClass159_1 != null) {
			try {
				this.aClass159_1.method4079();
			} catch (@Pc(14) Exception local14) {
			}
			this.aClass159_1 = null;
		}
		this.aClass159_1 = arg1;
		this.method1152();
		this.method1144(arg0);
		this.aClass14_Sub4_2.anInt2637 = 0;
		this.aClass14_Sub2_Sub16_Sub2_1 = null;
		while (true) {
			@Pc(46) Class14_Sub2_Sub16_Sub2 local46 = (Class14_Sub2_Sub16_Sub2) this.aClass56_4.method1917();
			if (local46 == null) {
				while (true) {
					local46 = (Class14_Sub2_Sub16_Sub2) this.aClass56_6.method1917();
					if (local46 == null) {
						if (this.aByte11 != 0) {
							try {
								this.aClass14_Sub4_1.anInt2637 = 0;
								this.aClass14_Sub4_1.method2538(4);
								this.aClass14_Sub4_1.method2538(this.aByte11);
								this.aClass14_Sub4_1.method2509(0);
								this.aClass159_1.method4082(this.aClass14_Sub4_1.aByteArray74, 4);
							} catch (@Pc(113) IOException local113) {
								try {
									this.aClass159_1.method4079();
								} catch (@Pc(119) Exception local119) {
								}
								this.aClass159_1 = null;
								this.anInt1200 = -2;
								this.anInt1201++;
							}
						}
						this.anInt1199 = 0;
						this.aLong38 = Static168.method3300();
						return;
					}
					this.aClass56_5.method1922(local46);
				}
			}
			this.aClass56_3.method1922(local46);
		}
	}

	@OriginalMember(owner = "client!cq", name = "g", descriptor = "(I)I")
	public int method1157() {
		return this.aClass56_3.method1915() + this.aClass56_4.method1915();
	}
}
