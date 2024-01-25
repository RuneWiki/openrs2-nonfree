import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cba")
public class Class33 {

	@OriginalMember(owner = "client!cba", name = "j", descriptor = "[I")
	public int[] anIntArray557;

	@OriginalMember(owner = "client!cba", name = "k", descriptor = "Lclient!jba;")
	private Class2_Sub8 aClass2_Sub8_7;

	@OriginalMember(owner = "client!cba", name = "t", descriptor = "I")
	public int anInt8543;

	@OriginalMember(owner = "client!cba", name = "w", descriptor = "I")
	private int anInt8545;

	@OriginalMember(owner = "client!cba", name = "A", descriptor = "I")
	public int anInt8547;

	@OriginalMember(owner = "client!cba", name = "h", descriptor = "I")
	private final int anInt8535 = 32;

	@OriginalMember(owner = "client!cba", name = "q", descriptor = "Z")
	private boolean aBoolean608 = false;

	@OriginalMember(owner = "client!cba", name = "i", descriptor = "J")
	private long aLong209 = Static277.method5091();

	@OriginalMember(owner = "client!cba", name = "u", descriptor = "J")
	private long aLong210 = 0L;

	@OriginalMember(owner = "client!cba", name = "y", descriptor = "J")
	private long aLong211 = 0L;

	@OriginalMember(owner = "client!cba", name = "v", descriptor = "I")
	private int anInt8544 = 0;

	@OriginalMember(owner = "client!cba", name = "x", descriptor = "I")
	private int anInt8546 = 0;

	@OriginalMember(owner = "client!cba", name = "B", descriptor = "[Lclient!jba;")
	private final Class2_Sub8[] aClass2_Sub8Array6 = new Class2_Sub8[8];

	@OriginalMember(owner = "client!cba", name = "D", descriptor = "Z")
	private boolean aBoolean609 = true;

	@OriginalMember(owner = "client!cba", name = "C", descriptor = "I")
	private int anInt8548 = 0;

	@OriginalMember(owner = "client!cba", name = "z", descriptor = "[Lclient!jba;")
	private final Class2_Sub8[] aClass2_Sub8Array5 = new Class2_Sub8[8];

	@OriginalMember(owner = "client!cba", name = "E", descriptor = "I")
	private int anInt8549 = 0;

	@OriginalMember(owner = "client!cba", name = "a", descriptor = "()I")
	protected int method7211() throws Exception {
		return this.anInt8543;
	}

	@OriginalMember(owner = "client!cba", name = "a", descriptor = "(I)V")
	public void method7212(@OriginalArg(0) int arg0) throws Exception {
	}

	@OriginalMember(owner = "client!cba", name = "b", descriptor = "()V")
	protected void method7213() throws Exception {
	}

	@OriginalMember(owner = "client!cba", name = "b", descriptor = "(I)V")
	public final synchronized void method7214() {
		if (this.aBoolean608) {
			return;
		}
		@Pc(12) long local12 = Static277.method5091();
		try {
			if (this.aLong209 + 6000L < local12) {
				this.aLong209 = local12 - 6000L;
			}
			while (this.aLong209 + 5000L < local12) {
				this.method7219();
				this.aLong209 += 256000 / Static215.anInt4848;
				local12 = Static277.method5091();
			}
		} catch (@Pc(61) Exception local61) {
			this.aLong209 = local12;
		}
		if (this.anIntArray557 == null) {
			return;
		}
		try {
			if (this.aLong210 != 0L) {
				if (local12 < this.aLong210) {
					return;
				}
				this.method7212(this.anInt8543);
				this.aBoolean609 = true;
				this.aLong210 = 0L;
			}
			@Pc(98) int local98 = this.method7211();
			if (this.anInt8548 - local98 > this.anInt8549) {
				this.anInt8549 = this.anInt8548 - local98;
			}
			@Pc(120) int local120 = this.anInt8547 + this.anInt8545;
			if (local120 + 256 > 16384) {
				local120 = 16128;
			}
			if (local120 + 256 > this.anInt8543) {
				this.anInt8543 += 1024;
				if (this.anInt8543 > 16384) {
					this.anInt8543 = 16384;
				}
				this.method7221();
				this.method7212(this.anInt8543);
				local98 = 0;
				this.aBoolean609 = true;
				if (local120 + 256 > this.anInt8543) {
					local120 = this.anInt8543 - 256;
					this.anInt8545 = local120 - this.anInt8547;
				}
			}
			while (local120 > local98) {
				this.method7216(this.anIntArray557);
				this.method7224();
				local98 += 256;
			}
			if (local12 > this.aLong211) {
				if (this.aBoolean609) {
					this.aBoolean609 = false;
				} else if (this.anInt8549 == 0 && this.anInt8546 == 0) {
					this.method7221();
					this.aLong210 = local12 + 2000L;
					return;
				} else {
					this.anInt8545 = Math.min(this.anInt8546, this.anInt8549);
					this.anInt8546 = this.anInt8549;
				}
				this.aLong211 = local12 + 2000L;
				this.anInt8549 = 0;
			}
			this.anInt8548 = local98;
		} catch (@Pc(248) Exception local248) {
			this.method7221();
			this.aLong210 = local12 + 2000L;
		}
	}

	@OriginalMember(owner = "client!cba", name = "a", descriptor = "(ILclient!jba;I)V")
	private void method7215(@OriginalArg(1) Class2_Sub8 arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = arg1 >> 5;
		@Pc(19) Class2_Sub8 local19 = this.aClass2_Sub8Array6[local7];
		if (local19 == null) {
			this.aClass2_Sub8Array5[local7] = arg0;
		} else {
			local19.aClass2_Sub8_9 = arg0;
		}
		this.aClass2_Sub8Array6[local7] = arg0;
		arg0.anInt10583 = arg1;
	}

	@OriginalMember(owner = "client!cba", name = "a", descriptor = "([II)V")
	private void method7216(@OriginalArg(0) int[] arg0) {
		@Pc(1) short local1 = 256;
		if (Static600.aBoolean722) {
			local1 = 512;
		}
		Static653.method7719(arg0, 0, local1);
		this.anInt8544 -= 256;
		if (this.aClass2_Sub8_7 != null && this.anInt8544 <= 0) {
			this.anInt8544 += Static215.anInt4848 >> 4;
			Static245.method4532(this.aClass2_Sub8_7);
			this.method7215(this.aClass2_Sub8_7, this.aClass2_Sub8_7.method8819());
			@Pc(45) int local45 = 0;
			@Pc(47) int local47 = 255;
			@Pc(49) int local49 = 7;
			@Pc(56) int local56;
			label103: while (local47 != 0) {
				@Pc(61) int local61;
				if (local49 < 0) {
					local56 = local49 & 0x3;
					local61 = -(local49 >> 2);
				} else {
					local56 = local49;
					local61 = 0;
				}
				for (@Pc(72) int local72 = local47 >>> local56 & 0x11111111; local72 != 0; local72 >>>= 0x4) {
					if ((local72 & 0x1) != 0) {
						local47 &= ~(0x1 << local56);
						@Pc(88) Class2_Sub8 local88 = null;
						@Pc(93) Class2_Sub8 local93 = this.aClass2_Sub8Array5[local56];
						label97: while (true) {
							while (true) {
								if (local93 == null) {
									break label97;
								}
								@Pc(97) Class2_Sub29 local97 = local93.aClass2_Sub29_6;
								if (local97 == null || local97.anInt7487 <= local61) {
									local93.aBoolean723 = true;
									@Pc(121) int local121 = local93.method8820();
									local45 += local121;
									if (local97 != null) {
										local97.anInt7487 += local121;
									}
									if (local45 >= this.anInt8535) {
										break label103;
									}
									@Pc(140) Class2_Sub8 local140 = local93.method8815();
									if (local140 != null) {
										@Pc(145) int local145 = local93.anInt10583;
										while (local140 != null) {
											this.method7215(local140, local145 * local140.method8819() >> 8);
											local140 = local93.method8817();
										}
									}
									@Pc(164) Class2_Sub8 local164 = local93.aClass2_Sub8_9;
									local93.aClass2_Sub8_9 = null;
									if (local88 == null) {
										this.aClass2_Sub8Array5[local56] = local164;
									} else {
										local88.aClass2_Sub8_9 = local164;
									}
									if (local164 == null) {
										this.aClass2_Sub8Array6[local56] = local88;
									}
									local93 = local164;
								} else {
									local47 |= 0x1 << local56;
									local88 = local93;
									local93 = local93.aClass2_Sub8_9;
								}
							}
						}
					}
					local56 += 4;
					local61++;
				}
				local49--;
			}
			for (local56 = 0; local56 < 8; local56++) {
				@Pc(207) Class2_Sub8 local207 = this.aClass2_Sub8Array5[local56];
				this.aClass2_Sub8Array5[local56] = this.aClass2_Sub8Array6[local56] = null;
				while (local207 != null) {
					@Pc(221) Class2_Sub8 local221 = local207.aClass2_Sub8_9;
					local207.aClass2_Sub8_9 = null;
					local207 = local221;
				}
			}
		}
		if (this.anInt8544 < 0) {
			this.anInt8544 = 0;
		}
		if (this.aClass2_Sub8_7 != null) {
			this.aClass2_Sub8_7.method8816(arg0, 0, 256);
		}
		this.aLong209 = Static277.method5091();
	}

	@OriginalMember(owner = "client!cba", name = "c", descriptor = "(I)V")
	public final synchronized void method7217() {
		this.aBoolean609 = true;
		try {
			this.method7213();
		} catch (@Pc(16) Exception local16) {
			this.method7221();
			this.aLong210 = Static277.method5091() + 2000L;
		}
	}

	@OriginalMember(owner = "client!cba", name = "a", descriptor = "(ZLclient!jba;)V")
	public final synchronized void method7218(@OriginalArg(1) Class2_Sub8 arg0) {
		this.aClass2_Sub8_7 = arg0;
	}

	@OriginalMember(owner = "client!cba", name = "a", descriptor = "(IB)V")
	private void method7219() {
		this.anInt8544 -= 256;
		if (this.anInt8544 < 0) {
			this.anInt8544 = 0;
		}
		if (this.aClass2_Sub8_7 != null) {
			this.aClass2_Sub8_7.method8818(256);
		}
	}

	@OriginalMember(owner = "client!cba", name = "c", descriptor = "()V")
	protected void method7221() {
	}

	@OriginalMember(owner = "client!cba", name = "a", descriptor = "(Z)V")
	public final synchronized void method7223() {
		if (Static452.aClass331_1 != null) {
			@Pc(9) boolean local9 = true;
			for (@Pc(11) int local11 = 0; local11 < 2; local11++) {
				if (Static452.aClass331_1.aClass33Array1[local11] == this) {
					Static452.aClass331_1.aClass33Array1[local11] = null;
				}
				if (Static452.aClass331_1.aClass33Array1[local11] != null) {
					local9 = false;
				}
			}
			if (local9) {
				Static452.aClass331_1.aBoolean682 = true;
				while (Static452.aClass331_1.aBoolean683) {
					Static190.method3914(50L);
				}
				Static452.aClass331_1 = null;
			}
		}
		this.method7221();
		this.anIntArray557 = null;
		this.aBoolean608 = true;
	}

	@OriginalMember(owner = "client!cba", name = "d", descriptor = "()V")
	protected void method7224() throws Exception {
	}

	@OriginalMember(owner = "client!cba", name = "a", descriptor = "(Ljava/awt/Component;)V")
	public void method7225(@OriginalArg(0) Component arg0) throws Exception {
	}
}
