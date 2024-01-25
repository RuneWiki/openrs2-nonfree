import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jp")
public class Class177 {

	@OriginalMember(owner = "client!jp", name = "k", descriptor = "[I")
	public int[] anIntArray691;

	@OriginalMember(owner = "client!jp", name = "t", descriptor = "Lclient!pda;")
	private Class1_Sub7 aClass1_Sub7_8;

	@OriginalMember(owner = "client!jp", name = "v", descriptor = "I")
	private int anInt9168;

	@OriginalMember(owner = "client!jp", name = "x", descriptor = "I")
	public int anInt9169;

	@OriginalMember(owner = "client!jp", name = "z", descriptor = "I")
	public int anInt9170;

	@OriginalMember(owner = "client!jp", name = "m", descriptor = "I")
	private final int anInt9163 = 32;

	@OriginalMember(owner = "client!jp", name = "s", descriptor = "Z")
	private boolean aBoolean705 = false;

	@OriginalMember(owner = "client!jp", name = "q", descriptor = "J")
	private long aLong280 = Static413.method5668();

	@OriginalMember(owner = "client!jp", name = "y", descriptor = "J")
	private long aLong281 = 0L;

	@OriginalMember(owner = "client!jp", name = "A", descriptor = "[Lclient!pda;")
	private final Class1_Sub7[] aClass1_Sub7Array5 = new Class1_Sub7[8];

	@OriginalMember(owner = "client!jp", name = "w", descriptor = "Z")
	private boolean aBoolean706 = true;

	@OriginalMember(owner = "client!jp", name = "D", descriptor = "I")
	private int anInt9172 = 0;

	@OriginalMember(owner = "client!jp", name = "C", descriptor = "I")
	private int anInt9171 = 0;

	@OriginalMember(owner = "client!jp", name = "B", descriptor = "[Lclient!pda;")
	private final Class1_Sub7[] aClass1_Sub7Array6 = new Class1_Sub7[8];

	@OriginalMember(owner = "client!jp", name = "F", descriptor = "J")
	private long aLong282 = 0L;

	@OriginalMember(owner = "client!jp", name = "G", descriptor = "I")
	private int anInt9174 = 0;

	@OriginalMember(owner = "client!jp", name = "E", descriptor = "I")
	private int anInt9173 = 0;

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "()V")
	protected void method7503() throws Exception {
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(ILclient!pda;B)V")
	private void method7504(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub7 arg1) {
		@Pc(7) int local7 = arg0 >> 5;
		@Pc(12) Class1_Sub7 local12 = this.aClass1_Sub7Array6[local7];
		if (local12 == null) {
			this.aClass1_Sub7Array5[local7] = arg1;
		} else {
			local12.aClass1_Sub7_7 = arg1;
		}
		this.aClass1_Sub7Array6[local7] = arg1;
		arg1.anInt7700 = arg0;
	}

	@OriginalMember(owner = "client!jp", name = "b", descriptor = "()I")
	protected int method7505() throws Exception {
		return this.anInt9170;
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(B)V")
	public final synchronized void method7507() {
		if (Static541.aClass151_1 != null) {
			@Pc(5) boolean local5 = true;
			for (@Pc(7) int local7 = 0; local7 < 2; local7++) {
				if (Static541.aClass151_1.aClass177Array1[local7] == this) {
					Static541.aClass151_1.aClass177Array1[local7] = null;
				}
				if (Static541.aClass151_1.aClass177Array1[local7] != null) {
					local5 = false;
				}
			}
			if (local5) {
				Static541.aClass151_1.aBoolean317 = true;
				while (Static541.aClass151_1.aBoolean316) {
					Static391.method5400(50L);
				}
				Static541.aClass151_1 = null;
			}
		}
		this.method7512();
		this.aBoolean705 = true;
		this.anIntArray691 = null;
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(I)V")
	public final synchronized void method7508() {
		this.aBoolean706 = true;
		try {
			this.method7503();
		} catch (@Pc(18) Exception local18) {
			this.method7512();
			this.aLong282 = Static413.method5668() + 2000L;
		}
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(ILclient!pda;)V")
	public final synchronized void method7509(@OriginalArg(1) Class1_Sub7 arg0) {
		this.aClass1_Sub7_8 = arg0;
	}

	@OriginalMember(owner = "client!jp", name = "c", descriptor = "()V")
	protected void method7510() throws Exception {
	}

	@OriginalMember(owner = "client!jp", name = "d", descriptor = "()V")
	protected void method7512() {
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(Ljava/awt/Component;)V")
	public void method7513(@OriginalArg(0) Component arg0) throws Exception {
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(IB)V")
	private void method7514() {
		this.anInt9172 -= 256;
		if (this.anInt9172 < 0) {
			this.anInt9172 = 0;
		}
		if (this.aClass1_Sub7_8 != null) {
			this.aClass1_Sub7_8.method6138(256);
		}
	}

	@OriginalMember(owner = "client!jp", name = "c", descriptor = "(I)V")
	public void method7517(@OriginalArg(0) int arg0) throws Exception {
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "([II)V")
	private void method7518(@OriginalArg(0) int[] arg0) {
		@Pc(1) short local1 = 256;
		if (Static19.aBoolean22) {
			local1 = 512;
		}
		Static598.method1170(arg0, 0, local1);
		this.anInt9172 -= 256;
		if (this.aClass1_Sub7_8 != null && this.anInt9172 <= 0) {
			this.anInt9172 += Class1_Sub30_Sub1.lb >> 4;
			Static584.method7806(this.aClass1_Sub7_8);
			this.method7504(this.aClass1_Sub7_8.method6137(), this.aClass1_Sub7_8);
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
						@Pc(88) Class1_Sub7 local88 = null;
						@Pc(93) Class1_Sub7 local93 = this.aClass1_Sub7Array5[local56];
						label97: while (true) {
							while (true) {
								if (local93 == null) {
									break label97;
								}
								@Pc(97) Class1_Sub17 local97 = local93.aClass1_Sub17_5;
								if (local97 == null || local97.anInt5537 <= local61) {
									local93.aBoolean593 = true;
									@Pc(121) int local121 = local93.method6135();
									local45 += local121;
									if (local97 != null) {
										local97.anInt5537 += local121;
									}
									if (local45 >= this.anInt9163) {
										break label103;
									}
									@Pc(140) Class1_Sub7 local140 = local93.method6134();
									if (local140 != null) {
										@Pc(145) int local145 = local93.anInt7700;
										while (local140 != null) {
											this.method7504(local145 * local140.method6137() >> 8, local140);
											local140 = local93.method6136();
										}
									}
									@Pc(164) Class1_Sub7 local164 = local93.aClass1_Sub7_7;
									local93.aClass1_Sub7_7 = null;
									if (local88 == null) {
										this.aClass1_Sub7Array5[local56] = local164;
									} else {
										local88.aClass1_Sub7_7 = local164;
									}
									if (local164 == null) {
										this.aClass1_Sub7Array6[local56] = local88;
									}
									local93 = local164;
								} else {
									local47 |= 0x1 << local56;
									local88 = local93;
									local93 = local93.aClass1_Sub7_7;
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
				@Pc(207) Class1_Sub7 local207 = this.aClass1_Sub7Array5[local56];
				this.aClass1_Sub7Array5[local56] = this.aClass1_Sub7Array6[local56] = null;
				while (local207 != null) {
					@Pc(221) Class1_Sub7 local221 = local207.aClass1_Sub7_7;
					local207.aClass1_Sub7_7 = null;
					local207 = local221;
				}
			}
		}
		if (this.anInt9172 < 0) {
			this.anInt9172 = 0;
		}
		if (this.aClass1_Sub7_8 != null) {
			this.aClass1_Sub7_8.method6132(arg0, 0, 256);
		}
		this.aLong280 = Static413.method5668();
	}

	@OriginalMember(owner = "client!jp", name = "b", descriptor = "(B)V")
	public final synchronized void method7519() {
		if (this.aBoolean705) {
			return;
		}
		@Pc(12) long local12 = Static413.method5668();
		try {
			if (this.aLong280 + 500000L < local12) {
				this.aLong280 = local12 - 500000L;
			}
			while (this.aLong280 + 5000L < local12) {
				this.method7514();
				this.aLong280 += 256000 / Class1_Sub30_Sub1.lb;
			}
		} catch (@Pc(52) Exception local52) {
			this.aLong280 = local12;
		}
		if (this.anIntArray691 == null) {
			return;
		}
		try {
			if (this.aLong282 != 0L) {
				if (this.aLong282 > local12) {
					return;
				}
				this.method7517(this.anInt9170);
				this.aLong282 = 0L;
				this.aBoolean706 = true;
			}
			@Pc(87) int local87 = this.method7505();
			if (this.anInt9174 - local87 > this.anInt9173) {
				this.anInt9173 = this.anInt9174 - local87;
			}
			@Pc(116) int local116 = this.anInt9169 + this.anInt9168;
			if (local116 + 256 > 16384) {
				local116 = 16128;
			}
			if (this.anInt9170 < local116 + 256) {
				this.anInt9170 += 1024;
				if (this.anInt9170 > 16384) {
					this.anInt9170 = 16384;
				}
				this.method7512();
				local87 = 0;
				this.method7517(this.anInt9170);
				if (local116 + 256 > this.anInt9170) {
					local116 = this.anInt9170 - 256;
					this.anInt9168 = local116 - this.anInt9169;
				}
				this.aBoolean706 = true;
			}
			while (local116 > local87) {
				this.method7518(this.anIntArray691);
				local87 += 256;
				this.method7510();
			}
			if (this.aLong281 < local12) {
				if (this.aBoolean706) {
					this.aBoolean706 = false;
				} else if (this.anInt9173 == 0 && this.anInt9171 == 0) {
					this.method7512();
					this.aLong282 = local12 + 2000L;
					return;
				} else {
					this.anInt9168 = Math.min(this.anInt9171, this.anInt9173);
					this.anInt9171 = this.anInt9173;
				}
				this.anInt9173 = 0;
				this.aLong281 = local12 + 2000L;
			}
			this.anInt9174 = local87;
		} catch (@Pc(251) Exception local251) {
			this.method7512();
			this.aLong282 = local12 + 2000L;
		}
	}
}
