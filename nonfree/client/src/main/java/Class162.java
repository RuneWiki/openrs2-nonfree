import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pn")
public final class Class162 {

	@OriginalMember(owner = "client!pn", name = "z", descriptor = "Lclient!cr;")
	private Class41 aClass41_32;

	@OriginalMember(owner = "client!pn", name = "A", descriptor = "I")
	private int anInt4987;

	@OriginalMember(owner = "client!pn", name = "B", descriptor = "J")
	private long aLong168;

	@OriginalMember(owner = "client!pn", name = "G", descriptor = "Lclient!n;")
	private Class5_Sub1_Sub4_Sub1 aClass5_Sub1_Sub4_Sub1_2;

	@OriginalMember(owner = "client!pn", name = "c", descriptor = "Lclient!we;")
	private final Class212 aClass212_7 = new Class212();

	@OriginalMember(owner = "client!pn", name = "k", descriptor = "Lclient!we;")
	private final Class212 aClass212_8 = new Class212();

	@OriginalMember(owner = "client!pn", name = "v", descriptor = "Lclient!we;")
	private final Class212 aClass212_9 = new Class212();

	@OriginalMember(owner = "client!pn", name = "x", descriptor = "Lclient!we;")
	private final Class212 aClass212_10 = new Class212();

	@OriginalMember(owner = "client!pn", name = "y", descriptor = "Lclient!rg;")
	private final Class5_Sub12 aClass5_Sub12_5 = new Class5_Sub12(4);

	@OriginalMember(owner = "client!pn", name = "C", descriptor = "B")
	private byte aByte41 = 0;

	@OriginalMember(owner = "client!pn", name = "D", descriptor = "I")
	public volatile int anInt4988 = 0;

	@OriginalMember(owner = "client!pn", name = "E", descriptor = "I")
	public volatile int anInt4989 = 0;

	@OriginalMember(owner = "client!pn", name = "F", descriptor = "Lclient!rg;")
	private final Class5_Sub12 aClass5_Sub12_6 = new Class5_Sub12(8);

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(B)Z")
	public boolean method4439() {
		return this.method4450() >= 20;
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(I)I")
	public int method4440() {
		return this.aClass212_7.method5940() + this.aClass212_8.method5940();
	}

	@OriginalMember(owner = "client!pn", name = "b", descriptor = "(I)V")
	private void method4441() {
		if (this.aClass41_32 == null) {
			return;
		}
		try {
			this.aClass5_Sub12_5.anInt5731 = 0;
			this.aClass5_Sub12_5.method5089(6);
			this.aClass5_Sub12_5.method5085(3);
			this.aClass41_32.method829(this.aClass5_Sub12_5.aByteArray90, 4);
		} catch (@Pc(38) IOException local38) {
			try {
				this.aClass41_32.method825();
			} catch (@Pc(44) Exception local44) {
			}
			this.anInt4988++;
			this.anInt4989 = -2;
			this.aClass41_32 = null;
		}
	}

	@OriginalMember(owner = "client!pn", name = "c", descriptor = "(I)V")
	public void method4442() {
		try {
			this.aClass41_32.method825();
		} catch (@Pc(16) Exception local16) {
		}
		this.aClass41_32 = null;
		this.anInt4988++;
		this.aByte41 = (byte) (Math.random() * 255.0D + 1.0D);
		this.anInt4989 = -1;
	}

	@OriginalMember(owner = "client!pn", name = "d", descriptor = "(I)V")
	public void method4443() {
		if (this.aClass41_32 != null) {
			this.aClass41_32.method824();
		}
	}

	@OriginalMember(owner = "client!pn", name = "b", descriptor = "(B)V")
	public void method4444() {
		if (this.aClass41_32 != null) {
			this.aClass41_32.method825();
		}
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(Z)Z")
	public boolean method4445() {
		return this.method4440() >= 20;
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(ZLclient!cr;B)V")
	public void method4446(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class41 arg1) {
		if (this.aClass41_32 != null) {
			try {
				this.aClass41_32.method825();
			} catch (@Pc(10) Exception local10) {
			}
			this.aClass41_32 = null;
		}
		this.aClass41_32 = arg1;
		this.method4441();
		this.method4454(arg0);
		this.aClass5_Sub12_6.anInt5731 = 0;
		this.aClass5_Sub1_Sub4_Sub1_2 = null;
		while (true) {
			@Pc(46) Class5_Sub1_Sub4_Sub1 local46 = (Class5_Sub1_Sub4_Sub1) this.aClass212_8.method5937();
			if (local46 == null) {
				while (true) {
					local46 = (Class5_Sub1_Sub4_Sub1) this.aClass212_10.method5937();
					if (local46 == null) {
						if (this.aByte41 != 0) {
							try {
								this.aClass5_Sub12_5.anInt5731 = 0;
								this.aClass5_Sub12_5.method5089(4);
								this.aClass5_Sub12_5.method5089(this.aByte41);
								this.aClass5_Sub12_5.method5084(0);
								this.aClass41_32.method829(this.aClass5_Sub12_5.aByteArray90, 4);
							} catch (@Pc(104) IOException local104) {
								try {
									this.aClass41_32.method825();
								} catch (@Pc(110) Exception local110) {
								}
								this.anInt4988++;
								this.anInt4989 = -2;
								this.aClass41_32 = null;
							}
						}
						this.anInt4987 = 0;
						this.aLong168 = Static340.method5863();
						return;
					}
					this.aClass212_9.method5936(local46);
				}
			}
			this.aClass212_7.method5936(local46);
		}
	}

	@OriginalMember(owner = "client!pn", name = "c", descriptor = "(B)Z")
	public boolean method4448() {
		@Pc(14) int local14;
		if (this.aClass41_32 != null) {
			@Pc(7) long local7 = Static340.method5863();
			local14 = (int) (local7 - this.aLong168);
			if (local14 > 200) {
				local14 = 200;
			}
			this.aLong168 = local7;
			this.anInt4987 += local14;
			if (this.anInt4987 > 30000) {
				try {
					this.aClass41_32.method825();
				} catch (@Pc(38) Exception local38) {
				}
				this.aClass41_32 = null;
			}
		}
		if (this.aClass41_32 == null) {
			return this.method4440() == 0 && this.method4450() == 0;
		}
		try {
			this.aClass41_32.method823();
			for (@Pc(75) Class5_Sub1_Sub4_Sub1 local75 = (Class5_Sub1_Sub4_Sub1) this.aClass212_7.method5943(); local75 != null; local75 = (Class5_Sub1_Sub4_Sub1) this.aClass212_7.method5939()) {
				this.aClass5_Sub12_5.anInt5731 = 0;
				this.aClass5_Sub12_5.method5089(1);
				this.aClass5_Sub12_5.method5085((int) local75.aLong234);
				this.aClass41_32.method829(this.aClass5_Sub12_5.aByteArray90, 4);
				this.aClass212_8.method5936(local75);
			}
			for (@Pc(129) Class5_Sub1_Sub4_Sub1 local129 = (Class5_Sub1_Sub4_Sub1) this.aClass212_9.method5943(); local129 != null; local129 = (Class5_Sub1_Sub4_Sub1) this.aClass212_9.method5939()) {
				this.aClass5_Sub12_5.anInt5731 = 0;
				this.aClass5_Sub12_5.method5089(0);
				this.aClass5_Sub12_5.method5085((int) local129.aLong234);
				this.aClass41_32.method829(this.aClass5_Sub12_5.aByteArray90, 4);
				this.aClass212_10.method5936(local129);
			}
			for (local14 = 0; local14 < 100; local14++) {
				@Pc(182) int local182 = this.aClass41_32.method826();
				if (local182 < 0) {
					throw new IOException();
				}
				if (local182 == 0) {
					break;
				}
				this.anInt4987 = 0;
				@Pc(195) byte local195 = 0;
				if (this.aClass5_Sub1_Sub4_Sub1_2 == null) {
					local195 = 8;
				} else if (this.aClass5_Sub1_Sub4_Sub1_2.anInt4108 == 0) {
					local195 = 1;
				}
				@Pc(220) int local220;
				@Pc(227) int local227;
				@Pc(274) int local274;
				if (local195 <= 0) {
					local220 = this.aClass5_Sub1_Sub4_Sub1_2.aClass5_Sub12_3.aByteArray90.length - this.aClass5_Sub1_Sub4_Sub1_2.aByte26;
					local227 = 512 - this.aClass5_Sub1_Sub4_Sub1_2.anInt4108;
					if (local220 - this.aClass5_Sub1_Sub4_Sub1_2.aClass5_Sub12_3.anInt5731 < local227) {
						local227 = local220 - this.aClass5_Sub1_Sub4_Sub1_2.aClass5_Sub12_3.anInt5731;
					}
					if (local182 < local227) {
						local227 = local182;
					}
					this.aClass41_32.method827(this.aClass5_Sub1_Sub4_Sub1_2.aClass5_Sub12_3.aByteArray90, local227, this.aClass5_Sub1_Sub4_Sub1_2.aClass5_Sub12_3.anInt5731);
					if (this.aByte41 != 0) {
						for (local274 = 0; local274 < local227; local274++) {
							this.aClass5_Sub1_Sub4_Sub1_2.aClass5_Sub12_3.aByteArray90[this.aClass5_Sub1_Sub4_Sub1_2.aClass5_Sub12_3.anInt5731 + local274] ^= this.aByte41;
						}
					}
					this.aClass5_Sub1_Sub4_Sub1_2.anInt4108 += local227;
					this.aClass5_Sub1_Sub4_Sub1_2.aClass5_Sub12_3.anInt5731 += local227;
					if (this.aClass5_Sub1_Sub4_Sub1_2.aClass5_Sub12_3.anInt5731 == local220) {
						this.aClass5_Sub1_Sub4_Sub1_2.method5970();
						this.aClass5_Sub1_Sub4_Sub1_2.aBoolean467 = false;
						this.aClass5_Sub1_Sub4_Sub1_2 = null;
					} else if (this.aClass5_Sub1_Sub4_Sub1_2.anInt4108 == 512) {
						this.aClass5_Sub1_Sub4_Sub1_2.anInt4108 = 0;
					}
				} else {
					local220 = local195 - this.aClass5_Sub12_6.anInt5731;
					if (local220 > local182) {
						local220 = local182;
					}
					this.aClass41_32.method827(this.aClass5_Sub12_6.aByteArray90, local220, this.aClass5_Sub12_6.anInt5731);
					if (this.aByte41 != 0) {
						for (local227 = 0; local227 < local220; local227++) {
							this.aClass5_Sub12_6.aByteArray90[this.aClass5_Sub12_6.anInt5731 + local227] ^= this.aByte41;
						}
					}
					this.aClass5_Sub12_6.anInt5731 += local220;
					if (local195 <= this.aClass5_Sub12_6.anInt5731) {
						if (this.aClass5_Sub1_Sub4_Sub1_2 == null) {
							this.aClass5_Sub12_6.anInt5731 = 0;
							local227 = this.aClass5_Sub12_6.method5115();
							local274 = this.aClass5_Sub12_6.method5106();
							@Pc(449) int local449 = this.aClass5_Sub12_6.method5115();
							@Pc(456) int local456 = this.aClass5_Sub12_6.method5067();
							@Pc(460) int local460 = local449 & 0x7F;
							@Pc(468) boolean local468 = (local449 & 0x80) != 0;
							@Pc(475) long local475 = (long) (local274 + (local227 << 16));
							@Pc(485) Class5_Sub1_Sub4_Sub1 local485;
							if (local468) {
								for (local485 = (Class5_Sub1_Sub4_Sub1) this.aClass212_10.method5943(); local485 != null && local475 != local485.aLong234; local485 = (Class5_Sub1_Sub4_Sub1) this.aClass212_10.method5939()) {
								}
							} else {
								for (local485 = (Class5_Sub1_Sub4_Sub1) this.aClass212_8.method5943(); local485 != null && local475 != local485.aLong234; local485 = (Class5_Sub1_Sub4_Sub1) this.aClass212_8.method5939()) {
								}
							}
							if (local485 == null) {
								throw new IOException();
							}
							this.aClass5_Sub1_Sub4_Sub1_2 = local485;
							@Pc(548) int local548 = local460 == 0 ? 5 : 9;
							this.aClass5_Sub1_Sub4_Sub1_2.aClass5_Sub12_3 = new Class5_Sub12(local456 + local548 + this.aClass5_Sub1_Sub4_Sub1_2.aByte26);
							this.aClass5_Sub1_Sub4_Sub1_2.aClass5_Sub12_3.method5089(local460);
							this.aClass5_Sub1_Sub4_Sub1_2.aClass5_Sub12_3.method5070(local456);
							this.aClass5_Sub1_Sub4_Sub1_2.anInt4108 = 8;
							this.aClass5_Sub12_6.anInt5731 = 0;
						} else if (this.aClass5_Sub1_Sub4_Sub1_2.anInt4108 != 0) {
							throw new IOException();
						} else if (this.aClass5_Sub12_6.aByteArray90[0] == -1) {
							this.aClass5_Sub1_Sub4_Sub1_2.anInt4108 = 1;
							this.aClass5_Sub12_6.anInt5731 = 0;
						} else {
							this.aClass5_Sub1_Sub4_Sub1_2 = null;
						}
					}
				}
			}
			return true;
		} catch (@Pc(625) IOException local625) {
			try {
				this.aClass41_32.method825();
			} catch (@Pc(631) Exception local631) {
			}
			this.aClass41_32 = null;
			this.anInt4989 = -2;
			this.anInt4988++;
			return this.method4440() == 0 && this.method4450() == 0;
		}
	}

	@OriginalMember(owner = "client!pn", name = "e", descriptor = "(B)I")
	private int method4450() {
		return this.aClass212_9.method5940() + this.aClass212_10.method5940();
	}

	@OriginalMember(owner = "client!pn", name = "f", descriptor = "(I)V")
	public void method4452() {
		if (this.aClass41_32 == null) {
			return;
		}
		try {
			this.aClass5_Sub12_5.anInt5731 = 0;
			this.aClass5_Sub12_5.method5089(7);
			this.aClass5_Sub12_5.method5085(0);
			this.aClass41_32.method829(this.aClass5_Sub12_5.aByteArray90, 4);
		} catch (@Pc(34) IOException local34) {
			try {
				this.aClass41_32.method825();
			} catch (@Pc(42) Exception local42) {
			}
			this.aClass41_32 = null;
			this.anInt4989 = -2;
			this.anInt4988++;
		}
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(BZIII)Lclient!n;")
	public Class5_Sub1_Sub4_Sub1 method4453(@OriginalArg(0) byte arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(10) long local10 = (long) (arg2 + (arg3 << 16));
		@Pc(22) Class5_Sub1_Sub4_Sub1 local22 = new Class5_Sub1_Sub4_Sub1();
		local22.aByte26 = arg0;
		local22.aBoolean468 = arg1;
		local22.aLong234 = local10;
		if (arg1) {
			if (this.method4440() >= 20) {
				throw new RuntimeException();
			}
			this.aClass212_7.method5936(local22);
		} else if (this.method4450() < 20) {
			this.aClass212_9.method5936(local22);
		} else {
			throw new RuntimeException();
		}
		return local22;
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(ZI)V")
	public void method4454(@OriginalArg(0) boolean arg0) {
		if (this.aClass41_32 == null) {
			return;
		}
		try {
			this.aClass5_Sub12_5.anInt5731 = 0;
			this.aClass5_Sub12_5.method5089(arg0 ? 2 : 3);
			this.aClass5_Sub12_5.method5085(0);
			this.aClass41_32.method829(this.aClass5_Sub12_5.aByteArray90, 4);
		} catch (@Pc(40) IOException local40) {
			try {
				this.aClass41_32.method825();
			} catch (@Pc(46) Exception local46) {
			}
			this.aClass41_32 = null;
			this.anInt4988++;
			this.anInt4989 = -2;
		}
	}
}
