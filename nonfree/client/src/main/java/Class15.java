import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pda")
public class Class15 {

	@OriginalMember(owner = "client!pda", name = "l", descriptor = "Lclient!nr;")
	private Class4_Sub21 aClass4_Sub21_6;

	@OriginalMember(owner = "client!pda", name = "q", descriptor = "[I")
	public int[] anIntArray387;

	@OriginalMember(owner = "client!pda", name = "x", descriptor = "I")
	public int anInt6848;

	@OriginalMember(owner = "client!pda", name = "y", descriptor = "I")
	private int anInt6849;

	@OriginalMember(owner = "client!pda", name = "B", descriptor = "I")
	public int anInt6852;

	@OriginalMember(owner = "client!pda", name = "j", descriptor = "Z")
	private boolean aBoolean472 = false;

	@OriginalMember(owner = "client!pda", name = "k", descriptor = "I")
	private final int anInt6842 = 32;

	@OriginalMember(owner = "client!pda", name = "p", descriptor = "J")
	private long aLong181 = Static112.method2047();

	@OriginalMember(owner = "client!pda", name = "r", descriptor = "I")
	private int anInt6846 = 0;

	@OriginalMember(owner = "client!pda", name = "t", descriptor = "[Lclient!nr;")
	private final Class4_Sub21[] aClass4_Sub21Array5 = new Class4_Sub21[8];

	@OriginalMember(owner = "client!pda", name = "s", descriptor = "J")
	private long aLong182 = 0L;

	@OriginalMember(owner = "client!pda", name = "w", descriptor = "Z")
	private boolean aBoolean473 = true;

	@OriginalMember(owner = "client!pda", name = "u", descriptor = "J")
	private long aLong183 = 0L;

	@OriginalMember(owner = "client!pda", name = "v", descriptor = "I")
	private int anInt6847 = 0;

	@OriginalMember(owner = "client!pda", name = "C", descriptor = "[Lclient!nr;")
	private final Class4_Sub21[] aClass4_Sub21Array6 = new Class4_Sub21[8];

	@OriginalMember(owner = "client!pda", name = "D", descriptor = "I")
	private int anInt6853 = 0;

	@OriginalMember(owner = "client!pda", name = "z", descriptor = "I")
	private int anInt6850 = 0;

	@OriginalMember(owner = "client!pda", name = "a", descriptor = "(BI)V")
	private void method5341() {
		this.anInt6850 -= 256;
		if (this.anInt6850 < 0) {
			this.anInt6850 = 0;
		}
		if (this.aClass4_Sub21_6 != null) {
			this.aClass4_Sub21_6.method6156(256);
		}
	}

	@OriginalMember(owner = "client!pda", name = "a", descriptor = "()V")
	protected void method5342() throws Exception {
	}

	@OriginalMember(owner = "client!pda", name = "a", descriptor = "(I)V")
	public void method5343(@OriginalArg(0) int arg0) throws Exception {
	}

	@OriginalMember(owner = "client!pda", name = "b", descriptor = "()V")
	protected void method5344() {
	}

	@OriginalMember(owner = "client!pda", name = "a", descriptor = "(ILclient!nr;)V")
	public final synchronized void method5346(@OriginalArg(1) Class4_Sub21 arg0) {
		this.aClass4_Sub21_6 = arg0;
	}

	@OriginalMember(owner = "client!pda", name = "c", descriptor = "()I")
	protected int method5347() throws Exception {
		return this.anInt6852;
	}

	@OriginalMember(owner = "client!pda", name = "a", descriptor = "(Lclient!nr;II)V")
	private void method5348(@OriginalArg(0) Class4_Sub21 arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = arg1 >> 5;
		@Pc(12) Class4_Sub21 local12 = this.aClass4_Sub21Array5[local7];
		if (local12 == null) {
			this.aClass4_Sub21Array6[local7] = arg0;
		} else {
			local12.aClass4_Sub21_8 = arg0;
		}
		this.aClass4_Sub21Array5[local7] = arg0;
		arg0.anInt7877 = arg1;
	}

	@OriginalMember(owner = "client!pda", name = "b", descriptor = "(I)V")
	public final synchronized void method5349() {
		if (Static514.aClass179_2 != null) {
			@Pc(5) boolean local5 = true;
			for (@Pc(7) int local7 = 0; local7 < 2; local7++) {
				if (Static514.aClass179_2.aClass15Array1[local7] == this) {
					Static514.aClass179_2.aClass15Array1[local7] = null;
				}
				if (Static514.aClass179_2.aClass15Array1[local7] != null) {
					local5 = false;
				}
			}
			if (local5) {
				Static514.aClass179_2.aBoolean410 = true;
				while (Static514.aClass179_2.aBoolean411) {
					Static214.method3478(50L);
				}
				Static514.aClass179_2 = null;
			}
		}
		this.method5344();
		this.anIntArray387 = null;
		this.aBoolean472 = true;
	}

	@OriginalMember(owner = "client!pda", name = "a", descriptor = "(Ljava/awt/Component;)V")
	public void method5350(@OriginalArg(0) Component arg0) throws Exception {
	}

	@OriginalMember(owner = "client!pda", name = "c", descriptor = "(I)V")
	public final synchronized void method5351() {
		if (this.aBoolean472) {
			return;
		}
		@Pc(12) long local12 = Static112.method2047();
		try {
			if (local12 > this.aLong181 + 500000L) {
				this.aLong181 = local12 - 500000L;
			}
			while (this.aLong181 + 5000L < local12) {
				this.method5341();
				this.aLong181 += 256000 / Static544.anInt9957;
			}
		} catch (@Pc(60) Exception local60) {
			this.aLong181 = local12;
		}
		if (this.anIntArray387 == null) {
			return;
		}
		try {
			if (this.aLong182 != 0L) {
				if (local12 < this.aLong182) {
					return;
				}
				this.method5343(this.anInt6852);
				this.aLong182 = 0L;
				this.aBoolean473 = true;
			}
			@Pc(97) int local97 = this.method5347();
			if (this.anInt6853 - local97 > this.anInt6847) {
				this.anInt6847 = this.anInt6853 - local97;
			}
			@Pc(121) int local121 = this.anInt6848 + this.anInt6849;
			if (local121 + 256 > 16384) {
				local121 = 16128;
			}
			if (this.anInt6852 < local121 + 256) {
				this.anInt6852 += 1024;
				if (this.anInt6852 > 16384) {
					this.anInt6852 = 16384;
				}
				this.method5344();
				this.method5343(this.anInt6852);
				local97 = 0;
				this.aBoolean473 = true;
				if (local121 + 256 > this.anInt6852) {
					local121 = this.anInt6852 - 256;
					this.anInt6849 = local121 - this.anInt6848;
				}
			}
			while (local121 > local97) {
				this.method5353(this.anIntArray387);
				this.method5342();
				local97 += 256;
			}
			if (local12 > this.aLong183) {
				if (this.aBoolean473) {
					this.aBoolean473 = false;
				} else if (this.anInt6847 == 0 && this.anInt6846 == 0) {
					this.method5344();
					this.aLong182 = local12 + 2000L;
					return;
				} else {
					this.anInt6849 = Math.min(this.anInt6846, this.anInt6847);
					this.anInt6846 = this.anInt6847;
				}
				this.anInt6847 = 0;
				this.aLong183 = local12 + 2000L;
			}
			this.anInt6853 = local97;
		} catch (@Pc(255) Exception local255) {
			this.method5344();
			this.aLong182 = local12 + 2000L;
		}
	}

	@OriginalMember(owner = "client!pda", name = "d", descriptor = "()V")
	protected void method5352() throws Exception {
	}

	@OriginalMember(owner = "client!pda", name = "a", descriptor = "([II)V")
	private void method5353(@OriginalArg(0) int[] arg0) {
		@Pc(1) short local1 = 256;
		if (Static455.aBoolean611) {
			local1 = 512;
		}
		Static599.method3057(arg0, 0, local1);
		this.anInt6850 -= 256;
		if (this.aClass4_Sub21_6 != null && this.anInt6850 <= 0) {
			this.anInt6850 += Static544.anInt9957 >> 4;
			Static154.method2624(this.aClass4_Sub21_6);
			this.method5348(this.aClass4_Sub21_6, this.aClass4_Sub21_6.method6161());
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
						@Pc(88) Class4_Sub21 local88 = null;
						@Pc(93) Class4_Sub21 local93 = this.aClass4_Sub21Array6[local56];
						label97: while (true) {
							while (true) {
								if (local93 == null) {
									break label97;
								}
								@Pc(97) Class4_Sub42 local97 = local93.aClass4_Sub42_5;
								if (local97 == null || local97.anInt9490 <= local61) {
									local93.aBoolean567 = true;
									@Pc(121) int local121 = local93.method6160();
									local45 += local121;
									if (local97 != null) {
										local97.anInt9490 += local121;
									}
									if (local45 >= this.anInt6842) {
										break label103;
									}
									@Pc(140) Class4_Sub21 local140 = local93.method6157();
									if (local140 != null) {
										@Pc(145) int local145 = local93.anInt7877;
										while (local140 != null) {
											this.method5348(local140, local145 * local140.method6161() >> 8);
											local140 = local93.method6162();
										}
									}
									@Pc(164) Class4_Sub21 local164 = local93.aClass4_Sub21_8;
									local93.aClass4_Sub21_8 = null;
									if (local88 == null) {
										this.aClass4_Sub21Array6[local56] = local164;
									} else {
										local88.aClass4_Sub21_8 = local164;
									}
									if (local164 == null) {
										this.aClass4_Sub21Array5[local56] = local88;
									}
									local93 = local164;
								} else {
									local47 |= 0x1 << local56;
									local88 = local93;
									local93 = local93.aClass4_Sub21_8;
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
				@Pc(207) Class4_Sub21 local207 = this.aClass4_Sub21Array6[local56];
				this.aClass4_Sub21Array6[local56] = this.aClass4_Sub21Array5[local56] = null;
				while (local207 != null) {
					@Pc(221) Class4_Sub21 local221 = local207.aClass4_Sub21_8;
					local207.aClass4_Sub21_8 = null;
					local207 = local221;
				}
			}
		}
		if (this.anInt6850 < 0) {
			this.anInt6850 = 0;
		}
		if (this.aClass4_Sub21_6 != null) {
			this.aClass4_Sub21_6.method6158(arg0, 0, 256);
		}
		this.aLong181 = Static112.method2047();
	}

	@OriginalMember(owner = "client!pda", name = "a", descriptor = "(B)V")
	public final synchronized void method5354() {
		this.aBoolean473 = true;
		try {
			this.method5352();
		} catch (@Pc(18) Exception local18) {
			this.method5344();
			this.aLong182 = Static112.method2047() + 2000L;
		}
	}
}
