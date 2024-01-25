import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bd")
public final class Class19 {

	@OriginalMember(owner = "client!bd", name = "l", descriptor = "[I")
	public static final int[] anIntArray24 = new int[32];

	@OriginalMember(owner = "client!bd", name = "A", descriptor = "Lclient!ac;")
	private Class3 aClass3_1;

	@OriginalMember(owner = "client!bd", name = "B", descriptor = "J")
	private long aLong22;

	@OriginalMember(owner = "client!bd", name = "D", descriptor = "I")
	private int anInt471;

	@OriginalMember(owner = "client!bd", name = "L", descriptor = "Lclient!tf;")
	private Class1_Sub3_Sub2_Sub2 aClass1_Sub3_Sub2_Sub2_1;

	@OriginalMember(owner = "client!bd", name = "r", descriptor = "Lclient!wf;")
	private final Class260 aClass260_2 = new Class260();

	@OriginalMember(owner = "client!bd", name = "v", descriptor = "Lclient!wf;")
	private final Class260 aClass260_3 = new Class260();

	@OriginalMember(owner = "client!bd", name = "w", descriptor = "Lclient!wf;")
	private final Class260 aClass260_4 = new Class260();

	@OriginalMember(owner = "client!bd", name = "x", descriptor = "Lclient!wf;")
	private final Class260 aClass260_5 = new Class260();

	@OriginalMember(owner = "client!bd", name = "z", descriptor = "Lclient!dh;")
	private final Class1_Sub11 aClass1_Sub11_1 = new Class1_Sub11(4);

	@OriginalMember(owner = "client!bd", name = "E", descriptor = "B")
	private byte aByte3 = 0;

	@OriginalMember(owner = "client!bd", name = "H", descriptor = "I")
	public volatile int anInt473 = 0;

	@OriginalMember(owner = "client!bd", name = "G", descriptor = "I")
	public volatile int anInt472 = 0;

	@OriginalMember(owner = "client!bd", name = "F", descriptor = "Lclient!dh;")
	private final Class1_Sub11 aClass1_Sub11_2 = new Class1_Sub11(8);

	static {
		@Pc(4) int local4 = 2;
		for (@Pc(6) int local6 = 0; local6 < 32; local6++) {
			anIntArray24[local6] = local4 - 1;
			local4 += local4;
		}
	}

	@OriginalMember(owner = "client!bd", name = "b", descriptor = "(I)I")
	private int method398() {
		return this.aClass260_4.method5554() + this.aClass260_5.method5554();
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(B)V")
	public void method399() {
		try {
			this.aClass3_1.method63();
		} catch (@Pc(5) Exception local5) {
		}
		this.anInt473++;
		this.anInt472 = -1;
		this.aByte3 = (byte) (Math.random() * 255.0D + 1.0D);
		this.aClass3_1 = null;
	}

	@OriginalMember(owner = "client!bd", name = "c", descriptor = "(I)Z")
	public boolean method401() {
		return this.method403() >= 20;
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(BZ)V")
	public void method402(@OriginalArg(1) boolean arg0) {
		if (this.aClass3_1 == null) {
			return;
		}
		try {
			this.aClass1_Sub11_1.anInt5766 = 0;
			this.aClass1_Sub11_1.method4445(arg0 ? 2 : 3);
			this.aClass1_Sub11_1.method4496(0);
			this.aClass3_1.method62(4, this.aClass1_Sub11_1.aByteArray64);
		} catch (@Pc(41) IOException local41) {
			try {
				this.aClass3_1.method63();
			} catch (@Pc(47) Exception local47) {
			}
			this.anInt472 = -2;
			this.aClass3_1 = null;
			this.anInt473++;
		}
	}

	@OriginalMember(owner = "client!bd", name = "b", descriptor = "(B)I")
	public int method403() {
		return this.aClass260_2.method5554() + this.aClass260_3.method5554();
	}

	@OriginalMember(owner = "client!bd", name = "d", descriptor = "(I)V")
	public void method404() {
		if (this.aClass3_1 != null) {
			this.aClass3_1.method58();
		}
	}

	@OriginalMember(owner = "client!bd", name = "e", descriptor = "(I)Z")
	public boolean method405() {
		@Pc(17) int local17;
		if (this.aClass3_1 != null) {
			@Pc(11) long local11 = Static232.method3058();
			local17 = (int) (local11 - this.aLong22);
			if (local17 > 200) {
				local17 = 200;
			}
			this.aLong22 = local11;
			this.anInt471 += local17;
			if (this.anInt471 > 30000) {
				try {
					this.aClass3_1.method63();
				} catch (@Pc(43) Exception local43) {
				}
				this.aClass3_1 = null;
			}
		}
		if (this.aClass3_1 == null) {
			return this.method403() == 0 && this.method398() == 0;
		}
		try {
			this.aClass3_1.method60();
			for (@Pc(71) Class1_Sub3_Sub2_Sub2 local71 = (Class1_Sub3_Sub2_Sub2) this.aClass260_2.method5553(); local71 != null; local71 = (Class1_Sub3_Sub2_Sub2) this.aClass260_2.method5556()) {
				this.aClass1_Sub11_1.anInt5766 = 0;
				this.aClass1_Sub11_1.method4445(1);
				this.aClass1_Sub11_1.method4496((int) local71.aLong216);
				this.aClass3_1.method62(4, this.aClass1_Sub11_1.aByteArray64);
				this.aClass260_3.method5557(local71);
			}
			for (@Pc(122) Class1_Sub3_Sub2_Sub2 local122 = (Class1_Sub3_Sub2_Sub2) this.aClass260_4.method5553(); local122 != null; local122 = (Class1_Sub3_Sub2_Sub2) this.aClass260_4.method5556()) {
				this.aClass1_Sub11_1.anInt5766 = 0;
				this.aClass1_Sub11_1.method4445(0);
				this.aClass1_Sub11_1.method4496((int) local122.aLong216);
				this.aClass3_1.method62(4, this.aClass1_Sub11_1.aByteArray64);
				this.aClass260_5.method5557(local122);
			}
			for (local17 = 0; local17 < 100; local17++) {
				@Pc(173) int local173 = this.aClass3_1.method61();
				if (local173 < 0) {
					throw new IOException();
				}
				if (local173 == 0) {
					break;
				}
				this.anInt471 = 0;
				@Pc(189) byte local189 = 0;
				if (this.aClass1_Sub3_Sub2_Sub2_1 == null) {
					local189 = 8;
				} else if (this.aClass1_Sub3_Sub2_Sub2_1.anInt6382 == 0) {
					local189 = 1;
				}
				@Pc(218) int local218;
				@Pc(224) int local224;
				@Pc(264) int local264;
				if (local189 <= 0) {
					local218 = this.aClass1_Sub3_Sub2_Sub2_1.aClass1_Sub11_8.aByteArray64.length - this.aClass1_Sub3_Sub2_Sub2_1.aByte84;
					local224 = 512 - this.aClass1_Sub3_Sub2_Sub2_1.anInt6382;
					if (local224 > local218 - this.aClass1_Sub3_Sub2_Sub2_1.aClass1_Sub11_8.anInt5766) {
						local224 = local218 - this.aClass1_Sub3_Sub2_Sub2_1.aClass1_Sub11_8.anInt5766;
					}
					if (local224 > local173) {
						local224 = local173;
					}
					this.aClass3_1.method59(this.aClass1_Sub3_Sub2_Sub2_1.aClass1_Sub11_8.aByteArray64, this.aClass1_Sub3_Sub2_Sub2_1.aClass1_Sub11_8.anInt5766, local224);
					if (this.aByte3 != 0) {
						for (local264 = 0; local264 < local224; local264++) {
							this.aClass1_Sub3_Sub2_Sub2_1.aClass1_Sub11_8.aByteArray64[this.aClass1_Sub3_Sub2_Sub2_1.aClass1_Sub11_8.anInt5766 + local264] ^= this.aByte3;
						}
					}
					this.aClass1_Sub3_Sub2_Sub2_1.anInt6382 += local224;
					this.aClass1_Sub3_Sub2_Sub2_1.aClass1_Sub11_8.anInt5766 += local224;
					if (local218 == this.aClass1_Sub3_Sub2_Sub2_1.aClass1_Sub11_8.anInt5766) {
						this.aClass1_Sub3_Sub2_Sub2_1.method5312();
						this.aClass1_Sub3_Sub2_Sub2_1.aBoolean524 = false;
						this.aClass1_Sub3_Sub2_Sub2_1 = null;
					} else if (this.aClass1_Sub3_Sub2_Sub2_1.anInt6382 == 512) {
						this.aClass1_Sub3_Sub2_Sub2_1.anInt6382 = 0;
					}
				} else {
					local218 = local189 - this.aClass1_Sub11_2.anInt5766;
					if (local218 > local173) {
						local218 = local173;
					}
					this.aClass3_1.method59(this.aClass1_Sub11_2.aByteArray64, this.aClass1_Sub11_2.anInt5766, local218);
					if (this.aByte3 != 0) {
						for (local224 = 0; local224 < local218; local224++) {
							this.aClass1_Sub11_2.aByteArray64[this.aClass1_Sub11_2.anInt5766 + local224] ^= this.aByte3;
						}
					}
					this.aClass1_Sub11_2.anInt5766 += local218;
					if (this.aClass1_Sub11_2.anInt5766 >= local189) {
						if (this.aClass1_Sub3_Sub2_Sub2_1 == null) {
							this.aClass1_Sub11_2.anInt5766 = 0;
							local224 = this.aClass1_Sub11_2.method4463();
							local264 = this.aClass1_Sub11_2.method4485();
							@Pc(434) int local434 = this.aClass1_Sub11_2.method4463();
							@Pc(439) int local439 = this.aClass1_Sub11_2.method4487();
							@Pc(443) int local443 = local434 & 0x7F;
							@Pc(451) boolean local451 = (local434 & 0x80) != 0;
							@Pc(458) long local458 = (long) ((local224 << 16) + local264);
							@Pc(468) Class1_Sub3_Sub2_Sub2 local468;
							if (local451) {
								for (local468 = (Class1_Sub3_Sub2_Sub2) this.aClass260_5.method5553(); local468 != null && local468.aLong216 != local458; local468 = (Class1_Sub3_Sub2_Sub2) this.aClass260_5.method5556()) {
								}
							} else {
								for (local468 = (Class1_Sub3_Sub2_Sub2) this.aClass260_3.method5553(); local468 != null && local468.aLong216 != local458; local468 = (Class1_Sub3_Sub2_Sub2) this.aClass260_3.method5556()) {
								}
							}
							if (local468 == null) {
								throw new IOException();
							}
							@Pc(528) int local528 = local443 == 0 ? 5 : 9;
							this.aClass1_Sub3_Sub2_Sub2_1 = local468;
							this.aClass1_Sub3_Sub2_Sub2_1.aClass1_Sub11_8 = new Class1_Sub11(local439 + local528 + this.aClass1_Sub3_Sub2_Sub2_1.aByte84);
							this.aClass1_Sub3_Sub2_Sub2_1.aClass1_Sub11_8.method4445(local443);
							this.aClass1_Sub3_Sub2_Sub2_1.aClass1_Sub11_8.method4450(local439);
							this.aClass1_Sub3_Sub2_Sub2_1.anInt6382 = 8;
							this.aClass1_Sub11_2.anInt5766 = 0;
						} else if (this.aClass1_Sub3_Sub2_Sub2_1.anInt6382 != 0) {
							throw new IOException();
						} else if (this.aClass1_Sub11_2.aByteArray64[0] == -1) {
							this.aClass1_Sub3_Sub2_Sub2_1.anInt6382 = 1;
							this.aClass1_Sub11_2.anInt5766 = 0;
						} else {
							this.aClass1_Sub3_Sub2_Sub2_1 = null;
						}
					}
				}
			}
			return true;
		} catch (@Pc(607) IOException local607) {
			try {
				this.aClass3_1.method63();
			} catch (@Pc(613) Exception local613) {
			}
			this.anInt473++;
			this.anInt472 = -2;
			this.aClass3_1 = null;
			return this.method403() == 0 && this.method398() == 0;
		}
	}

	@OriginalMember(owner = "client!bd", name = "c", descriptor = "(B)V")
	private void method407() {
		if (this.aClass3_1 == null) {
			return;
		}
		try {
			this.aClass1_Sub11_1.anInt5766 = 0;
			this.aClass1_Sub11_1.method4445(6);
			this.aClass1_Sub11_1.method4496(3);
			this.aClass3_1.method62(4, this.aClass1_Sub11_1.aByteArray64);
		} catch (@Pc(42) IOException local42) {
			try {
				this.aClass3_1.method63();
			} catch (@Pc(48) Exception local48) {
			}
			this.aClass3_1 = null;
			this.anInt473++;
			this.anInt472 = -2;
		}
	}

	@OriginalMember(owner = "client!bd", name = "d", descriptor = "(B)V")
	public void method408() {
		if (this.aClass3_1 != null) {
			this.aClass3_1.method63();
		}
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(BZIII)Lclient!tf;")
	public Class1_Sub3_Sub2_Sub2 method409(@OriginalArg(0) byte arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(10) long local10 = (long) (arg3 + (arg2 << 16));
		@Pc(14) Class1_Sub3_Sub2_Sub2 local14 = new Class1_Sub3_Sub2_Sub2();
		local14.aByte84 = arg0;
		local14.aLong216 = local10;
		local14.aBoolean525 = arg1;
		if (arg1) {
			if (this.method403() >= 20) {
				throw new RuntimeException();
			}
			this.aClass260_2.method5557(local14);
		} else if (this.method398() < 20) {
			this.aClass260_4.method5557(local14);
		} else {
			throw new RuntimeException();
		}
		return local14;
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(BLclient!ac;Z)V")
	public void method410(@OriginalArg(1) Class3 arg0, @OriginalArg(2) boolean arg1) {
		if (this.aClass3_1 != null) {
			try {
				this.aClass3_1.method63();
			} catch (@Pc(10) Exception local10) {
			}
			this.aClass3_1 = null;
		}
		this.aClass3_1 = arg0;
		this.method407();
		this.method402(arg1);
		this.aClass1_Sub11_2.anInt5766 = 0;
		this.aClass1_Sub3_Sub2_Sub2_1 = null;
		while (true) {
			@Pc(46) Class1_Sub3_Sub2_Sub2 local46 = (Class1_Sub3_Sub2_Sub2) this.aClass260_3.method5550();
			if (local46 == null) {
				while (true) {
					local46 = (Class1_Sub3_Sub2_Sub2) this.aClass260_5.method5550();
					if (local46 == null) {
						if (this.aByte3 != 0) {
							try {
								this.aClass1_Sub11_1.anInt5766 = 0;
								this.aClass1_Sub11_1.method4445(4);
								this.aClass1_Sub11_1.method4445(this.aByte3);
								this.aClass1_Sub11_1.method4448(0);
								this.aClass3_1.method62(4, this.aClass1_Sub11_1.aByteArray64);
							} catch (@Pc(106) IOException local106) {
								try {
									this.aClass3_1.method63();
								} catch (@Pc(112) Exception local112) {
								}
								this.anInt472 = -2;
								this.anInt473++;
								this.aClass3_1 = null;
							}
						}
						this.anInt471 = 0;
						this.aLong22 = Static232.method3058();
						return;
					}
					this.aClass260_4.method5557(local46);
				}
			}
			this.aClass260_2.method5557(local46);
		}
	}

	@OriginalMember(owner = "client!bd", name = "f", descriptor = "(I)V")
	public void method411() {
		if (this.aClass3_1 == null) {
			return;
		}
		try {
			this.aClass1_Sub11_1.anInt5766 = 0;
			this.aClass1_Sub11_1.method4445(7);
			this.aClass1_Sub11_1.method4496(0);
			this.aClass3_1.method62(4, this.aClass1_Sub11_1.aByteArray64);
		} catch (@Pc(32) IOException local32) {
			try {
				this.aClass3_1.method63();
			} catch (@Pc(38) Exception local38) {
			}
			this.aClass3_1 = null;
			this.anInt473++;
			this.anInt472 = -2;
		}
	}

	@OriginalMember(owner = "client!bd", name = "e", descriptor = "(B)Z")
	public boolean method412() {
		return this.method398() >= 20;
	}
}
