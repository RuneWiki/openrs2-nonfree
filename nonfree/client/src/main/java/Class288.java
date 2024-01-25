import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ri")
public class Class288 {

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "[I")
	public int[] anIntArray617;

	@OriginalMember(owner = "client!ri", name = "p", descriptor = "Lclient!oea;")
	private Class3_Sub6 aClass3_Sub6_8;

	@OriginalMember(owner = "client!ri", name = "u", descriptor = "I")
	public int anInt8058;

	@OriginalMember(owner = "client!ri", name = "w", descriptor = "I")
	public int anInt8059;

	@OriginalMember(owner = "client!ri", name = "D", descriptor = "I")
	private int anInt8062;

	@OriginalMember(owner = "client!ri", name = "t", descriptor = "Z")
	private boolean aBoolean627 = false;

	@OriginalMember(owner = "client!ri", name = "r", descriptor = "I")
	private final int anInt8057 = 32;

	@OriginalMember(owner = "client!ri", name = "s", descriptor = "J")
	private long aLong233 = Static587.method7753();

	@OriginalMember(owner = "client!ri", name = "y", descriptor = "J")
	private long aLong235 = 0L;

	@OriginalMember(owner = "client!ri", name = "x", descriptor = "I")
	private int anInt8060 = 0;

	@OriginalMember(owner = "client!ri", name = "z", descriptor = "[Lclient!oea;")
	private final Class3_Sub6[] aClass3_Sub6Array5 = new Class3_Sub6[8];

	@OriginalMember(owner = "client!ri", name = "B", descriptor = "Z")
	private boolean aBoolean628 = true;

	@OriginalMember(owner = "client!ri", name = "v", descriptor = "J")
	private long aLong234 = 0L;

	@OriginalMember(owner = "client!ri", name = "C", descriptor = "[Lclient!oea;")
	private final Class3_Sub6[] aClass3_Sub6Array6 = new Class3_Sub6[8];

	@OriginalMember(owner = "client!ri", name = "A", descriptor = "I")
	private int anInt8061 = 0;

	@OriginalMember(owner = "client!ri", name = "E", descriptor = "I")
	private int anInt8063 = 0;

	@OriginalMember(owner = "client!ri", name = "F", descriptor = "I")
	private int anInt8064 = 0;

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(II)V")
	private void method6794() {
		this.anInt8060 -= 256;
		if (this.anInt8060 < 0) {
			this.anInt8060 = 0;
		}
		if (this.aClass3_Sub6_8 != null) {
			this.aClass3_Sub6_8.method3732(256);
		}
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "()V")
	protected void method6795() throws Exception {
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(B)V")
	public final synchronized void method6796() {
		if (Static561.aClass275_2 != null) {
			@Pc(9) boolean local9 = true;
			for (@Pc(11) int local11 = 0; local11 < 2; local11++) {
				if (Static561.aClass275_2.aClass288Array1[local11] == this) {
					Static561.aClass275_2.aClass288Array1[local11] = null;
				}
				if (Static561.aClass275_2.aClass288Array1[local11] != null) {
					local9 = false;
				}
			}
			if (local9) {
				Static561.aClass275_2.aBoolean565 = true;
				while (Static561.aClass275_2.aBoolean564) {
					Static374.method5521(50L);
				}
				Static561.aClass275_2 = null;
			}
		}
		this.method6808();
		this.anIntArray617 = null;
		this.aBoolean627 = true;
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(Lclient!oea;Z)V")
	public final synchronized void method6798(@OriginalArg(0) Class3_Sub6 arg0) {
		this.aClass3_Sub6_8 = arg0;
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(I)V")
	public final synchronized void method6799() {
		if (this.aBoolean627) {
			return;
		}
		@Pc(19) long local19 = Static587.method7753();
		try {
			if (local19 > this.aLong233 + 500000L) {
				this.aLong233 = local19 - 500000L;
			}
			while (this.aLong233 + 5000L < local19) {
				this.method6794();
				this.aLong233 += 256000 / Static124.anInt3635;
			}
		} catch (@Pc(61) Exception local61) {
			this.aLong233 = local19;
		}
		if (this.anIntArray617 == null) {
			return;
		}
		try {
			if (this.aLong235 != 0L) {
				if (local19 < this.aLong235) {
					return;
				}
				this.method6801(this.anInt8058);
				this.aLong235 = 0L;
				this.aBoolean628 = true;
			}
			@Pc(96) int local96 = this.method6807();
			if (this.anInt8061 - local96 > this.anInt8063) {
				this.anInt8063 = this.anInt8061 - local96;
			}
			@Pc(120) int local120 = this.anInt8062 + this.anInt8059;
			if (local120 + 256 > 16384) {
				local120 = 16128;
			}
			if (local120 + 256 > this.anInt8058) {
				this.anInt8058 += 1024;
				if (this.anInt8058 > 16384) {
					this.anInt8058 = 16384;
				}
				this.method6808();
				local96 = 0;
				this.method6801(this.anInt8058);
				this.aBoolean628 = true;
				if (this.anInt8058 < local120 + 256) {
					local120 = this.anInt8058 - 256;
					this.anInt8062 = local120 - this.anInt8059;
				}
			}
			while (local96 < local120) {
				this.method6805(this.anIntArray617);
				this.method6803();
				local96 += 256;
			}
			if (this.aLong234 < local19) {
				if (this.aBoolean628) {
					this.aBoolean628 = false;
				} else if (this.anInt8063 == 0 && this.anInt8064 == 0) {
					this.method6808();
					this.aLong235 = local19 + 2000L;
					return;
				} else {
					this.anInt8062 = Math.min(this.anInt8064, this.anInt8063);
					this.anInt8064 = this.anInt8063;
				}
				this.anInt8063 = 0;
				this.aLong234 = local19 + 2000L;
			}
			this.anInt8061 = local96;
		} catch (@Pc(248) Exception local248) {
			this.method6808();
			this.aLong235 = local19 + 2000L;
		}
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(Ljava/awt/Component;)V")
	public void method6800(@OriginalArg(0) Component arg0) throws Exception {
	}

	@OriginalMember(owner = "client!ri", name = "b", descriptor = "(I)V")
	public void method6801(@OriginalArg(0) int arg0) throws Exception {
	}

	@OriginalMember(owner = "client!ri", name = "b", descriptor = "()V")
	protected void method6803() throws Exception {
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(IILclient!oea;)V")
	private void method6804(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub6 arg1) {
		@Pc(7) int local7 = arg0 >> 5;
		@Pc(18) Class3_Sub6 local18 = this.aClass3_Sub6Array6[local7];
		if (local18 == null) {
			this.aClass3_Sub6Array5[local7] = arg1;
		} else {
			local18.aClass3_Sub6_5 = arg1;
		}
		this.aClass3_Sub6Array6[local7] = arg1;
		arg1.anInt4212 = arg0;
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "([II)V")
	private void method6805(@OriginalArg(0) int[] arg0) {
		@Pc(1) short local1 = 256;
		if (Static134.aBoolean244) {
			local1 = 512;
		}
		Static604.method5909(arg0, 0, local1);
		this.anInt8060 -= 256;
		if (this.aClass3_Sub6_8 != null && this.anInt8060 <= 0) {
			this.anInt8060 += Static124.anInt3635 >> 4;
			Static549.method7338(this.aClass3_Sub6_8);
			this.method6804(this.aClass3_Sub6_8.method3729(), this.aClass3_Sub6_8);
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
						@Pc(88) Class3_Sub6 local88 = null;
						@Pc(93) Class3_Sub6 local93 = this.aClass3_Sub6Array5[local56];
						label97: while (true) {
							while (true) {
								if (local93 == null) {
									break label97;
								}
								@Pc(97) Class3_Sub20 local97 = local93.aClass3_Sub20_5;
								if (local97 == null || local97.anInt2619 <= local61) {
									local93.aBoolean323 = true;
									@Pc(121) int local121 = local93.method3727();
									local45 += local121;
									if (local97 != null) {
										local97.anInt2619 += local121;
									}
									if (local45 >= this.anInt8057) {
										break label103;
									}
									@Pc(140) Class3_Sub6 local140 = local93.method3731();
									if (local140 != null) {
										@Pc(145) int local145 = local93.anInt4212;
										while (local140 != null) {
											this.method6804(local145 * local140.method3729() >> 8, local140);
											local140 = local93.method3730();
										}
									}
									@Pc(164) Class3_Sub6 local164 = local93.aClass3_Sub6_5;
									local93.aClass3_Sub6_5 = null;
									if (local88 == null) {
										this.aClass3_Sub6Array5[local56] = local164;
									} else {
										local88.aClass3_Sub6_5 = local164;
									}
									if (local164 == null) {
										this.aClass3_Sub6Array6[local56] = local88;
									}
									local93 = local164;
								} else {
									local47 |= 0x1 << local56;
									local88 = local93;
									local93 = local93.aClass3_Sub6_5;
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
				@Pc(207) Class3_Sub6 local207 = this.aClass3_Sub6Array5[local56];
				this.aClass3_Sub6Array5[local56] = this.aClass3_Sub6Array6[local56] = null;
				while (local207 != null) {
					@Pc(221) Class3_Sub6 local221 = local207.aClass3_Sub6_5;
					local207.aClass3_Sub6_5 = null;
					local207 = local221;
				}
			}
		}
		if (this.anInt8060 < 0) {
			this.anInt8060 = 0;
		}
		if (this.aClass3_Sub6_8 != null) {
			this.aClass3_Sub6_8.method3728(arg0, 0, 256);
		}
		this.aLong233 = Static587.method7753();
	}

	@OriginalMember(owner = "client!ri", name = "c", descriptor = "(I)V")
	public final synchronized void method6806() {
		this.aBoolean628 = true;
		try {
			this.method6795();
		} catch (@Pc(16) Exception local16) {
			this.method6808();
			this.aLong235 = Static587.method7753() + 2000L;
		}
	}

	@OriginalMember(owner = "client!ri", name = "c", descriptor = "()I")
	protected int method6807() throws Exception {
		return this.anInt8058;
	}

	@OriginalMember(owner = "client!ri", name = "d", descriptor = "()V")
	protected void method6808() {
	}
}
