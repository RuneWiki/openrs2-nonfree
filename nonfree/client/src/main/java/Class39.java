import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ck")
public class Class39 {

	@OriginalMember(owner = "client!ck", name = "n", descriptor = "[I")
	public int[] anIntArray460;

	@OriginalMember(owner = "client!ck", name = "r", descriptor = "Lclient!le;")
	private Class4_Sub13 aClass4_Sub13_6;

	@OriginalMember(owner = "client!ck", name = "y", descriptor = "I")
	private int anInt5673;

	@OriginalMember(owner = "client!ck", name = "B", descriptor = "I")
	public int anInt5676;

	@OriginalMember(owner = "client!ck", name = "E", descriptor = "I")
	public int anInt5677;

	@OriginalMember(owner = "client!ck", name = "f", descriptor = "I")
	private final int anInt5659 = 32;

	@OriginalMember(owner = "client!ck", name = "g", descriptor = "Z")
	private boolean aBoolean497 = false;

	@OriginalMember(owner = "client!ck", name = "j", descriptor = "J")
	private long aLong209 = Static274.method4763();

	@OriginalMember(owner = "client!ck", name = "A", descriptor = "I")
	private int anInt5675 = 0;

	@OriginalMember(owner = "client!ck", name = "C", descriptor = "J")
	private long aLong210 = 0L;

	@OriginalMember(owner = "client!ck", name = "z", descriptor = "I")
	private int anInt5674 = 0;

	@OriginalMember(owner = "client!ck", name = "D", descriptor = "[Lclient!le;")
	private final Class4_Sub13[] aClass4_Sub13Array5 = new Class4_Sub13[8];

	@OriginalMember(owner = "client!ck", name = "F", descriptor = "I")
	private int anInt5678 = 0;

	@OriginalMember(owner = "client!ck", name = "x", descriptor = "I")
	private int anInt5672 = 0;

	@OriginalMember(owner = "client!ck", name = "G", descriptor = "Z")
	private boolean aBoolean498 = true;

	@OriginalMember(owner = "client!ck", name = "H", descriptor = "J")
	private long aLong211 = 0L;

	@OriginalMember(owner = "client!ck", name = "I", descriptor = "[Lclient!le;")
	private final Class4_Sub13[] aClass4_Sub13Array6 = new Class4_Sub13[8];

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(BLclient!le;I)V")
	private void method4792(@OriginalArg(1) Class4_Sub13 arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = arg1 >> 5;
		@Pc(12) Class4_Sub13 local12 = this.aClass4_Sub13Array5[local7];
		if (local12 == null) {
			this.aClass4_Sub13Array6[local7] = arg0;
		} else {
			local12.aClass4_Sub13_8 = arg0;
		}
		this.aClass4_Sub13Array5[local7] = arg0;
		arg0.anInt6336 = arg1;
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(Lclient!le;I)V")
	public final synchronized void method4793(@OriginalArg(0) Class4_Sub13 arg0) {
		this.aClass4_Sub13_6 = arg0;
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(I)V")
	public void method4794(@OriginalArg(0) int arg0) throws Exception {
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(IB)V")
	private void method4795() {
		this.anInt5672 -= 256;
		if (this.anInt5672 < 0) {
			this.anInt5672 = 0;
		}
		if (this.aClass4_Sub13_6 != null) {
			this.aClass4_Sub13_6.method5300(256);
		}
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "()V")
	protected void method4796() throws Exception {
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(B)V")
	public final synchronized void method4797() {
		this.aBoolean498 = true;
		try {
			this.method4796();
		} catch (@Pc(16) Exception local16) {
			this.method4799();
			this.aLong211 = Static274.method4763() + 2000L;
		}
	}

	@OriginalMember(owner = "client!ck", name = "b", descriptor = "(B)V")
	public final synchronized void method4798() {
		if (Static288.aClass90_1 != null) {
			@Pc(5) boolean local5 = true;
			for (@Pc(7) int local7 = 0; local7 < 2; local7++) {
				if (Static288.aClass90_1.aClass39Array1[local7] == this) {
					Static288.aClass90_1.aClass39Array1[local7] = null;
				}
				if (Static288.aClass90_1.aClass39Array1[local7] != null) {
					local5 = false;
				}
			}
			if (local5) {
				Static288.aClass90_1.aBoolean212 = true;
				while (Static288.aClass90_1.aBoolean211) {
					Static270.method5481(50L);
				}
				Static288.aClass90_1 = null;
			}
		}
		this.method4799();
		this.anIntArray460 = null;
		this.aBoolean497 = true;
	}

	@OriginalMember(owner = "client!ck", name = "b", descriptor = "()V")
	protected void method4799() {
	}

	@OriginalMember(owner = "client!ck", name = "b", descriptor = "(I)V")
	public final void method4801() {
		this.aBoolean498 = true;
	}

	@OriginalMember(owner = "client!ck", name = "c", descriptor = "()I")
	protected int method4802() throws Exception {
		return this.anInt5676;
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(Ljava/awt/Component;)V")
	public void method4803(@OriginalArg(0) Component arg0) throws Exception {
	}

	@OriginalMember(owner = "client!ck", name = "d", descriptor = "()V")
	protected void method4805() throws Exception {
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "([II)V")
	private void method4806(@OriginalArg(0) int[] arg0) {
		@Pc(1) short local1 = 256;
		if (Static288.aBoolean515) {
			local1 = 512;
		}
		Static363.method4757(arg0, 0, local1);
		this.anInt5672 -= 256;
		if (this.aClass4_Sub13_6 != null && this.anInt5672 <= 0) {
			this.anInt5672 += Static57.anInt1232 >> 4;
			Static320.method5293(this.aClass4_Sub13_6);
			this.method4792(this.aClass4_Sub13_6, this.aClass4_Sub13_6.method5302());
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
						@Pc(88) Class4_Sub13 local88 = null;
						@Pc(93) Class4_Sub13 local93 = this.aClass4_Sub13Array6[local56];
						label97: while (true) {
							while (true) {
								if (local93 == null) {
									break label97;
								}
								@Pc(97) Class4_Sub5 local97 = local93.aClass4_Sub5_5;
								if (local97 == null || local97.anInt6830 <= local61) {
									local93.aBoolean556 = true;
									@Pc(121) int local121 = local93.method5305();
									local45 += local121;
									if (local97 != null) {
										local97.anInt6830 += local121;
									}
									if (local45 >= this.anInt5659) {
										break label103;
									}
									@Pc(140) Class4_Sub13 local140 = local93.method5303();
									if (local140 != null) {
										@Pc(145) int local145 = local93.anInt6336;
										while (local140 != null) {
											this.method4792(local140, local145 * local140.method5302() >> 8);
											local140 = local93.method5301();
										}
									}
									@Pc(164) Class4_Sub13 local164 = local93.aClass4_Sub13_8;
									local93.aClass4_Sub13_8 = null;
									if (local88 == null) {
										this.aClass4_Sub13Array6[local56] = local164;
									} else {
										local88.aClass4_Sub13_8 = local164;
									}
									if (local164 == null) {
										this.aClass4_Sub13Array5[local56] = local88;
									}
									local93 = local164;
								} else {
									local47 |= 0x1 << local56;
									local88 = local93;
									local93 = local93.aClass4_Sub13_8;
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
				@Pc(207) Class4_Sub13 local207 = this.aClass4_Sub13Array6[local56];
				this.aClass4_Sub13Array6[local56] = this.aClass4_Sub13Array5[local56] = null;
				while (local207 != null) {
					@Pc(221) Class4_Sub13 local221 = local207.aClass4_Sub13_8;
					local207.aClass4_Sub13_8 = null;
					local207 = local221;
				}
			}
		}
		if (this.anInt5672 < 0) {
			this.anInt5672 = 0;
		}
		if (this.aClass4_Sub13_6 != null) {
			this.aClass4_Sub13_6.method5299(arg0, 0, 256);
		}
		this.aLong209 = Static274.method4763();
	}

	@OriginalMember(owner = "client!ck", name = "c", descriptor = "(I)V")
	public final synchronized void method4807() {
		if (this.aBoolean497) {
			return;
		}
		@Pc(12) long local12 = Static274.method4763();
		try {
			if (local12 > this.aLong209 + 500000L) {
				this.aLong209 = local12 - 500000L;
			}
			while (this.aLong209 + 5000L < local12) {
				this.method4795();
				this.aLong209 += 256000 / Static57.anInt1232;
			}
		} catch (@Pc(56) Exception local56) {
			this.aLong209 = local12;
		}
		if (this.anIntArray460 == null) {
			return;
		}
		try {
			if (this.aLong211 != 0L) {
				if (local12 < this.aLong211) {
					return;
				}
				this.method4794(this.anInt5676);
				this.aLong211 = 0L;
				this.aBoolean498 = true;
			}
			@Pc(91) int local91 = this.method4802();
			if (this.anInt5678 < this.anInt5675 - local91) {
				this.anInt5678 = this.anInt5675 - local91;
			}
			@Pc(112) int local112 = this.anInt5677 + this.anInt5673;
			if (local112 + 256 > 16384) {
				local112 = 16128;
			}
			if (this.anInt5676 < local112 + 256) {
				this.anInt5676 += 1024;
				if (this.anInt5676 > 16384) {
					this.anInt5676 = 16384;
				}
				this.method4799();
				this.method4794(this.anInt5676);
				local91 = 0;
				if (this.anInt5676 < local112 + 256) {
					local112 = this.anInt5676 - 256;
					this.anInt5673 = local112 - this.anInt5677;
				}
				this.aBoolean498 = true;
			}
			while (local112 > local91) {
				this.method4806(this.anIntArray460);
				local91 += 256;
				this.method4805();
			}
			if (this.aLong210 < local12) {
				if (this.aBoolean498) {
					this.aBoolean498 = false;
				} else if (this.anInt5678 == 0 && this.anInt5674 == 0) {
					this.method4799();
					this.aLong211 = local12 + 2000L;
					return;
				} else {
					this.anInt5673 = Math.min(this.anInt5674, this.anInt5678);
					this.anInt5674 = this.anInt5678;
				}
				this.aLong210 = local12 + 2000L;
				this.anInt5678 = 0;
			}
			this.anInt5675 = local91;
		} catch (@Pc(252) Exception local252) {
			this.method4799();
			this.aLong211 = local12 + 2000L;
		}
	}
}
