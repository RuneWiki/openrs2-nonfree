import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iv")
public final class Class120 {

	@OriginalMember(owner = "client!iv", name = "x", descriptor = "Lclient!um;")
	private Class247 aClass247_1;

	@OriginalMember(owner = "client!iv", name = "A", descriptor = "J")
	private long aLong113;

	@OriginalMember(owner = "client!iv", name = "B", descriptor = "I")
	private int anInt3282;

	@OriginalMember(owner = "client!iv", name = "G", descriptor = "Lclient!rp;")
	private Class7_Sub4_Sub8_Sub2 aClass7_Sub4_Sub8_Sub2_2;

	@OriginalMember(owner = "client!iv", name = "o", descriptor = "Lclient!bg;")
	private final Class24 aClass24_4 = new Class24();

	@OriginalMember(owner = "client!iv", name = "p", descriptor = "Lclient!bg;")
	private final Class24 aClass24_5 = new Class24();

	@OriginalMember(owner = "client!iv", name = "s", descriptor = "Lclient!bg;")
	private final Class24 aClass24_6 = new Class24();

	@OriginalMember(owner = "client!iv", name = "u", descriptor = "Lclient!bg;")
	private final Class24 aClass24_7 = new Class24();

	@OriginalMember(owner = "client!iv", name = "w", descriptor = "Lclient!gk;")
	private final Class7_Sub14 aClass7_Sub14_3 = new Class7_Sub14(4);

	@OriginalMember(owner = "client!iv", name = "C", descriptor = "B")
	private byte aByte30 = 0;

	@OriginalMember(owner = "client!iv", name = "E", descriptor = "I")
	public volatile int anInt3283 = 0;

	@OriginalMember(owner = "client!iv", name = "F", descriptor = "I")
	public volatile int anInt3284 = 0;

	@OriginalMember(owner = "client!iv", name = "D", descriptor = "Lclient!gk;")
	private final Class7_Sub14 aClass7_Sub14_4 = new Class7_Sub14(8);

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "(I)V")
	public void method2647() {
		if (this.aClass247_1 != null) {
			this.aClass247_1.method5162();
		}
	}

	@OriginalMember(owner = "client!iv", name = "b", descriptor = "(I)I")
	private int method2648() {
		return this.aClass24_6.method302() + this.aClass24_7.method302();
	}

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "(ZI)V")
	public void method2649(@OriginalArg(0) boolean arg0) {
		if (this.aClass247_1 == null) {
			return;
		}
		try {
			this.aClass7_Sub14_3.anInt4989 = 0;
			this.aClass7_Sub14_3.method3970(arg0 ? 2 : 3);
			this.aClass7_Sub14_3.method3971(0);
			this.aClass247_1.method5151(4, this.aClass7_Sub14_3.aByteArray75);
		} catch (@Pc(36) IOException local36) {
			try {
				this.aClass247_1.method5162();
			} catch (@Pc(42) Exception local42) {
			}
			this.anInt3284 = -2;
			this.anInt3283++;
			this.aClass247_1 = null;
		}
	}

	@OriginalMember(owner = "client!iv", name = "c", descriptor = "(I)V")
	public void method2650() {
		if (this.aClass247_1 != null) {
			this.aClass247_1.method5154();
		}
	}

	@OriginalMember(owner = "client!iv", name = "b", descriptor = "(B)Z")
	public boolean method2651() {
		return this.method2648() >= 20;
	}

	@OriginalMember(owner = "client!iv", name = "c", descriptor = "(B)Z")
	public boolean method2652() {
		@Pc(17) int local17;
		if (this.aClass247_1 != null) {
			@Pc(11) long local11 = Static158.method2342();
			local17 = (int) (local11 - this.aLong113);
			this.aLong113 = local11;
			if (local17 > 200) {
				local17 = 200;
			}
			this.anInt3282 += local17;
			if (this.anInt3282 > 30000) {
				try {
					this.aClass247_1.method5162();
				} catch (@Pc(43) Exception local43) {
				}
				this.aClass247_1 = null;
			}
		}
		if (this.aClass247_1 == null) {
			return this.method2660() == 0 && this.method2648() == 0;
		}
		try {
			this.aClass247_1.method5156();
			for (@Pc(83) Class7_Sub4_Sub8_Sub2 local83 = (Class7_Sub4_Sub8_Sub2) this.aClass24_4.method303(); local83 != null; local83 = (Class7_Sub4_Sub8_Sub2) this.aClass24_4.method301()) {
				this.aClass7_Sub14_3.anInt4989 = 0;
				this.aClass7_Sub14_3.method3970(1);
				this.aClass7_Sub14_3.method3971((int) local83.aLong225);
				this.aClass247_1.method5151(4, this.aClass7_Sub14_3.aByteArray75);
				this.aClass24_5.method298(local83);
			}
			for (@Pc(129) Class7_Sub4_Sub8_Sub2 local129 = (Class7_Sub4_Sub8_Sub2) this.aClass24_6.method303(); local129 != null; local129 = (Class7_Sub4_Sub8_Sub2) this.aClass24_6.method301()) {
				this.aClass7_Sub14_3.anInt4989 = 0;
				this.aClass7_Sub14_3.method3970(0);
				this.aClass7_Sub14_3.method3971((int) local129.aLong225);
				this.aClass247_1.method5151(4, this.aClass7_Sub14_3.aByteArray75);
				this.aClass24_7.method298(local129);
			}
			for (local17 = 0; local17 < 100; local17++) {
				@Pc(178) int local178 = this.aClass247_1.method5161();
				if (local178 < 0) {
					throw new IOException();
				}
				if (local178 == 0) {
					break;
				}
				this.anInt3282 = 0;
				@Pc(194) byte local194 = 0;
				if (this.aClass7_Sub4_Sub8_Sub2_2 == null) {
					local194 = 8;
				} else if (this.aClass7_Sub4_Sub8_Sub2_2.anInt5636 == 0) {
					local194 = 1;
				}
				@Pc(226) int local226;
				@Pc(233) int local233;
				@Pc(276) int local276;
				if (local194 <= 0) {
					local226 = this.aClass7_Sub4_Sub8_Sub2_2.aClass7_Sub14_7.aByteArray75.length - this.aClass7_Sub4_Sub8_Sub2_2.aByte63;
					local233 = 512 - this.aClass7_Sub4_Sub8_Sub2_2.anInt5636;
					if (local226 - this.aClass7_Sub4_Sub8_Sub2_2.aClass7_Sub14_7.anInt4989 < local233) {
						local233 = local226 - this.aClass7_Sub4_Sub8_Sub2_2.aClass7_Sub14_7.anInt4989;
					}
					if (local233 > local178) {
						local233 = local178;
					}
					this.aClass247_1.method5157(this.aClass7_Sub4_Sub8_Sub2_2.aClass7_Sub14_7.aByteArray75, this.aClass7_Sub4_Sub8_Sub2_2.aClass7_Sub14_7.anInt4989, local233);
					if (this.aByte30 != 0) {
						for (local276 = 0; local276 < local233; local276++) {
							this.aClass7_Sub4_Sub8_Sub2_2.aClass7_Sub14_7.aByteArray75[this.aClass7_Sub4_Sub8_Sub2_2.aClass7_Sub14_7.anInt4989 + local276] ^= this.aByte30;
						}
					}
					this.aClass7_Sub4_Sub8_Sub2_2.anInt5636 += local233;
					this.aClass7_Sub4_Sub8_Sub2_2.aClass7_Sub14_7.anInt4989 += local233;
					if (local226 == this.aClass7_Sub4_Sub8_Sub2_2.aClass7_Sub14_7.anInt4989) {
						this.aClass7_Sub4_Sub8_Sub2_2.method5661();
						this.aClass7_Sub4_Sub8_Sub2_2.aBoolean380 = false;
						this.aClass7_Sub4_Sub8_Sub2_2 = null;
					} else if (this.aClass7_Sub4_Sub8_Sub2_2.anInt5636 == 512) {
						this.aClass7_Sub4_Sub8_Sub2_2.anInt5636 = 0;
					}
				} else {
					local226 = local194 - this.aClass7_Sub14_4.anInt4989;
					if (local178 < local226) {
						local226 = local178;
					}
					this.aClass247_1.method5157(this.aClass7_Sub14_4.aByteArray75, this.aClass7_Sub14_4.anInt4989, local226);
					if (this.aByte30 != 0) {
						for (local233 = 0; local233 < local226; local233++) {
							this.aClass7_Sub14_4.aByteArray75[local233 + this.aClass7_Sub14_4.anInt4989] ^= this.aByte30;
						}
					}
					this.aClass7_Sub14_4.anInt4989 += local226;
					if (local194 <= this.aClass7_Sub14_4.anInt4989) {
						if (this.aClass7_Sub4_Sub8_Sub2_2 == null) {
							this.aClass7_Sub14_4.anInt4989 = 0;
							local233 = this.aClass7_Sub14_4.method3981();
							local276 = this.aClass7_Sub14_4.method3943();
							@Pc(454) int local454 = this.aClass7_Sub14_4.method3981();
							@Pc(459) int local459 = this.aClass7_Sub14_4.method3938();
							@Pc(463) int local463 = local454 & 0x7F;
							@Pc(471) boolean local471 = (local454 & 0x80) != 0;
							@Pc(478) long local478 = (long) (local276 + (local233 << 16));
							@Pc(488) Class7_Sub4_Sub8_Sub2 local488;
							if (local471) {
								for (local488 = (Class7_Sub4_Sub8_Sub2) this.aClass24_7.method303(); local488 != null && local488.aLong225 != local478; local488 = (Class7_Sub4_Sub8_Sub2) this.aClass24_7.method301()) {
								}
							} else {
								for (local488 = (Class7_Sub4_Sub8_Sub2) this.aClass24_5.method303(); local488 != null && local478 != local488.aLong225; local488 = (Class7_Sub4_Sub8_Sub2) this.aClass24_5.method301()) {
								}
							}
							if (local488 == null) {
								throw new IOException();
							}
							@Pc(541) int local541 = local463 == 0 ? 5 : 9;
							this.aClass7_Sub4_Sub8_Sub2_2 = local488;
							this.aClass7_Sub4_Sub8_Sub2_2.aClass7_Sub14_7 = new Class7_Sub14(local459 + local541 + this.aClass7_Sub4_Sub8_Sub2_2.aByte63);
							this.aClass7_Sub4_Sub8_Sub2_2.aClass7_Sub14_7.method3970(local463);
							this.aClass7_Sub4_Sub8_Sub2_2.aClass7_Sub14_7.method3933(local459);
							this.aClass7_Sub14_4.anInt4989 = 0;
							this.aClass7_Sub4_Sub8_Sub2_2.anInt5636 = 8;
						} else if (this.aClass7_Sub4_Sub8_Sub2_2.anInt5636 != 0) {
							throw new IOException();
						} else if (this.aClass7_Sub14_4.aByteArray75[0] == -1) {
							this.aClass7_Sub4_Sub8_Sub2_2.anInt5636 = 1;
							this.aClass7_Sub14_4.anInt4989 = 0;
						} else {
							this.aClass7_Sub4_Sub8_Sub2_2 = null;
						}
					}
				}
			}
			return true;
		} catch (@Pc(623) IOException local623) {
			try {
				this.aClass247_1.method5162();
			} catch (@Pc(629) Exception local629) {
			}
			this.anInt3284 = -2;
			this.anInt3283++;
			this.aClass247_1 = null;
			return this.method2660() == 0 && this.method2648() == 0;
		}
	}

	@OriginalMember(owner = "client!iv", name = "d", descriptor = "(I)V")
	private void method2653() {
		if (this.aClass247_1 == null) {
			return;
		}
		try {
			this.aClass7_Sub14_3.anInt4989 = 0;
			this.aClass7_Sub14_3.method3970(6);
			this.aClass7_Sub14_3.method3971(3);
			this.aClass247_1.method5151(4, this.aClass7_Sub14_3.aByteArray75);
		} catch (@Pc(40) IOException local40) {
			try {
				this.aClass247_1.method5162();
			} catch (@Pc(46) Exception local46) {
			}
			this.anInt3283++;
			this.aClass247_1 = null;
			this.anInt3284 = -2;
		}
	}

	@OriginalMember(owner = "client!iv", name = "e", descriptor = "(I)V")
	public void method2654() {
		if (this.aClass247_1 == null) {
			return;
		}
		try {
			this.aClass7_Sub14_3.anInt4989 = 0;
			this.aClass7_Sub14_3.method3970(7);
			this.aClass7_Sub14_3.method3971(0);
			this.aClass247_1.method5151(4, this.aClass7_Sub14_3.aByteArray75);
		} catch (@Pc(32) IOException local32) {
			try {
				this.aClass247_1.method5162();
			} catch (@Pc(38) Exception local38) {
			}
			this.aClass247_1 = null;
			this.anInt3284 = -2;
			this.anInt3283++;
		}
	}

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "(ZILclient!um;)V")
	public void method2655(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class247 arg1) {
		if (this.aClass247_1 != null) {
			try {
				this.aClass247_1.method5162();
			} catch (@Pc(10) Exception local10) {
			}
			this.aClass247_1 = null;
		}
		this.aClass247_1 = arg1;
		this.method2653();
		this.method2649(arg0);
		this.aClass7_Sub14_4.anInt4989 = 0;
		this.aClass7_Sub4_Sub8_Sub2_2 = null;
		while (true) {
			@Pc(47) Class7_Sub4_Sub8_Sub2 local47 = (Class7_Sub4_Sub8_Sub2) this.aClass24_5.method308();
			if (local47 == null) {
				while (true) {
					local47 = (Class7_Sub4_Sub8_Sub2) this.aClass24_7.method308();
					if (local47 == null) {
						if (this.aByte30 != 0) {
							try {
								this.aClass7_Sub14_3.anInt4989 = 0;
								this.aClass7_Sub14_3.method3970(4);
								this.aClass7_Sub14_3.method3970(this.aByte30);
								this.aClass7_Sub14_3.method3993(0);
								this.aClass247_1.method5151(4, this.aClass7_Sub14_3.aByteArray75);
							} catch (@Pc(108) IOException local108) {
								try {
									this.aClass247_1.method5162();
								} catch (@Pc(114) Exception local114) {
								}
								this.aClass247_1 = null;
								this.anInt3283++;
								this.anInt3284 = -2;
							}
						}
						this.anInt3282 = 0;
						this.aLong113 = Static158.method2342();
						return;
					}
					this.aClass24_6.method298(local47);
				}
			}
			this.aClass24_4.method298(local47);
		}
	}

	@OriginalMember(owner = "client!iv", name = "d", descriptor = "(B)Z")
	public boolean method2656() {
		return this.method2660() >= 20;
	}

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "(IIIZB)Lclient!rp;")
	public Class7_Sub4_Sub8_Sub2 method2658(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) byte arg3) {
		@Pc(15) long local15 = (long) ((arg0 << 16) + arg1);
		@Pc(19) Class7_Sub4_Sub8_Sub2 local19 = new Class7_Sub4_Sub8_Sub2();
		local19.aByte63 = arg3;
		local19.aLong225 = local15;
		local19.aBoolean379 = arg2;
		if (arg2) {
			if (this.method2660() >= 20) {
				throw new RuntimeException();
			}
			this.aClass24_4.method298(local19);
		} else if (this.method2648() < 20) {
			this.aClass24_6.method298(local19);
		} else {
			throw new RuntimeException();
		}
		return local19;
	}

	@OriginalMember(owner = "client!iv", name = "f", descriptor = "(I)V")
	public void method2659() {
		try {
			this.aClass247_1.method5162();
		} catch (@Pc(13) Exception local13) {
		}
		this.aClass247_1 = null;
		this.aByte30 = (byte) (Math.random() * 255.0D + 1.0D);
		this.anInt3283++;
		this.anInt3284 = -1;
	}

	@OriginalMember(owner = "client!iv", name = "g", descriptor = "(I)I")
	public int method2660() {
		return this.aClass24_4.method302() + this.aClass24_5.method302();
	}
}
