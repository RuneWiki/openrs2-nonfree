import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ed")
public class Class55 {

	@OriginalMember(owner = "client!ed", name = "h", descriptor = "[I")
	public int[] anIntArray577;

	@OriginalMember(owner = "client!ed", name = "i", descriptor = "Lclient!po;")
	private Class4_Sub7 aClass4_Sub7_8;

	@OriginalMember(owner = "client!ed", name = "t", descriptor = "I")
	public int anInt7118;

	@OriginalMember(owner = "client!ed", name = "y", descriptor = "I")
	public int anInt7122;

	@OriginalMember(owner = "client!ed", name = "z", descriptor = "I")
	private int anInt7123;

	@OriginalMember(owner = "client!ed", name = "j", descriptor = "Z")
	private boolean aBoolean527 = false;

	@OriginalMember(owner = "client!ed", name = "q", descriptor = "I")
	private final int anInt7116 = 32;

	@OriginalMember(owner = "client!ed", name = "n", descriptor = "J")
	private long aLong202 = Static167.method2929();

	@OriginalMember(owner = "client!ed", name = "v", descriptor = "I")
	private int anInt7120 = 0;

	@OriginalMember(owner = "client!ed", name = "u", descriptor = "I")
	private int anInt7119 = 0;

	@OriginalMember(owner = "client!ed", name = "s", descriptor = "[Lclient!po;")
	private final Class4_Sub7[] aClass4_Sub7Array5 = new Class4_Sub7[8];

	@OriginalMember(owner = "client!ed", name = "A", descriptor = "J")
	private long aLong203 = 0L;

	@OriginalMember(owner = "client!ed", name = "C", descriptor = "I")
	private int anInt7124 = 0;

	@OriginalMember(owner = "client!ed", name = "w", descriptor = "Z")
	private boolean aBoolean528 = true;

	@OriginalMember(owner = "client!ed", name = "B", descriptor = "J")
	private long aLong204 = 0L;

	@OriginalMember(owner = "client!ed", name = "x", descriptor = "I")
	private int anInt7121 = 0;

	@OriginalMember(owner = "client!ed", name = "D", descriptor = "[Lclient!po;")
	private final Class4_Sub7[] aClass4_Sub7Array6 = new Class4_Sub7[8];

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "([II)V")
	private void method5664(@OriginalArg(0) int[] arg0) {
		@Pc(1) short local1 = 256;
		if (Static3.aBoolean91) {
			local1 = 512;
		}
		Static474.method3332(arg0, 0, local1);
		this.anInt7121 -= 256;
		if (this.aClass4_Sub7_8 != null && this.anInt7121 <= 0) {
			this.anInt7121 += Static88.anInt6642 >> 4;
			Static306.method4714(this.aClass4_Sub7_8);
			this.method5676(this.aClass4_Sub7_8, this.aClass4_Sub7_8.method5469());
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
						@Pc(88) Class4_Sub7 local88 = null;
						@Pc(93) Class4_Sub7 local93 = this.aClass4_Sub7Array6[local56];
						label97: while (true) {
							while (true) {
								if (local93 == null) {
									break label97;
								}
								@Pc(97) Class4_Sub9 local97 = local93.aClass4_Sub9_5;
								if (local97 == null || local97.anInt1417 <= local61) {
									local93.aBoolean490 = true;
									@Pc(121) int local121 = local93.method5464();
									local45 += local121;
									if (local97 != null) {
										local97.anInt1417 += local121;
									}
									if (local45 >= this.anInt7116) {
										break label103;
									}
									@Pc(140) Class4_Sub7 local140 = local93.method5466();
									if (local140 != null) {
										@Pc(145) int local145 = local93.anInt6774;
										while (local140 != null) {
											this.method5676(local140, local145 * local140.method5469() >> 8);
											local140 = local93.method5468();
										}
									}
									@Pc(164) Class4_Sub7 local164 = local93.aClass4_Sub7_7;
									local93.aClass4_Sub7_7 = null;
									if (local88 == null) {
										this.aClass4_Sub7Array6[local56] = local164;
									} else {
										local88.aClass4_Sub7_7 = local164;
									}
									if (local164 == null) {
										this.aClass4_Sub7Array5[local56] = local88;
									}
									local93 = local164;
								} else {
									local47 |= 0x1 << local56;
									local88 = local93;
									local93 = local93.aClass4_Sub7_7;
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
				@Pc(207) Class4_Sub7 local207 = this.aClass4_Sub7Array6[local56];
				this.aClass4_Sub7Array6[local56] = this.aClass4_Sub7Array5[local56] = null;
				while (local207 != null) {
					@Pc(221) Class4_Sub7 local221 = local207.aClass4_Sub7_7;
					local207.aClass4_Sub7_7 = null;
					local207 = local221;
				}
			}
		}
		if (this.anInt7121 < 0) {
			this.anInt7121 = 0;
		}
		if (this.aClass4_Sub7_8 != null) {
			this.aClass4_Sub7_8.method5463(arg0, 0, 256);
		}
		this.aLong202 = Static167.method2929();
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(I)V")
	public final synchronized void method5667() {
		if (this.aBoolean527) {
			return;
		}
		@Pc(12) long local12 = Static167.method2929();
		try {
			if (local12 > this.aLong202 + 500000L) {
				this.aLong202 = local12 - 500000L;
			}
			while (local12 > this.aLong202 + 5000L) {
				this.method5674();
				this.aLong202 += 256000 / Static88.anInt6642;
			}
		} catch (@Pc(52) Exception local52) {
			this.aLong202 = local12;
		}
		if (this.anIntArray577 == null) {
			return;
		}
		try {
			if (this.aLong204 != 0L) {
				if (this.aLong204 > local12) {
					return;
				}
				this.method5673(this.anInt7122);
				this.aBoolean528 = true;
				this.aLong204 = 0L;
			}
			@Pc(87) int local87 = this.method5669();
			if (this.anInt7120 < this.anInt7119 - local87) {
				this.anInt7120 = this.anInt7119 - local87;
			}
			@Pc(113) int local113 = this.anInt7118 + this.anInt7123;
			if (local113 + 256 > 16384) {
				local113 = 16128;
			}
			if (local113 + 256 > this.anInt7122) {
				this.anInt7122 += 1024;
				if (this.anInt7122 > 16384) {
					this.anInt7122 = 16384;
				}
				this.method5671();
				local87 = 0;
				this.method5673(this.anInt7122);
				if (this.anInt7122 < local113 + 256) {
					local113 = this.anInt7122 - 256;
					this.anInt7123 = local113 - this.anInt7118;
				}
				this.aBoolean528 = true;
			}
			while (local87 < local113) {
				this.method5664(this.anIntArray577);
				this.method5677();
				local87 += 256;
			}
			if (this.aLong203 < local12) {
				if (this.aBoolean528) {
					this.aBoolean528 = false;
				} else if (this.anInt7120 == 0 && this.anInt7124 == 0) {
					this.method5671();
					this.aLong204 = local12 + 2000L;
					return;
				} else {
					this.anInt7123 = Math.min(this.anInt7124, this.anInt7120);
					this.anInt7124 = this.anInt7120;
				}
				this.anInt7120 = 0;
				this.aLong203 = local12 + 2000L;
			}
			this.anInt7119 = local87;
		} catch (@Pc(251) Exception local251) {
			this.method5671();
			this.aLong204 = local12 + 2000L;
		}
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(Lclient!po;I)V")
	public final synchronized void method5668(@OriginalArg(0) Class4_Sub7 arg0) {
		this.aClass4_Sub7_8 = arg0;
	}

	@OriginalMember(owner = "client!ed", name = "b", descriptor = "()I")
	protected int method5669() throws Exception {
		return this.anInt7122;
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(Ljava/awt/Component;)V")
	public void method5670(@OriginalArg(0) Component arg0) throws Exception {
	}

	@OriginalMember(owner = "client!ed", name = "c", descriptor = "()V")
	protected void method5671() {
	}

	@OriginalMember(owner = "client!ed", name = "b", descriptor = "(I)V")
	public final synchronized void method5672() {
		this.aBoolean528 = true;
		try {
			this.method5675();
		} catch (@Pc(16) Exception local16) {
			this.method5671();
			this.aLong204 = Static167.method2929() + 2000L;
		}
	}

	@OriginalMember(owner = "client!ed", name = "c", descriptor = "(I)V")
	public void method5673(@OriginalArg(0) int arg0) throws Exception {
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(IB)V")
	private void method5674() {
		this.anInt7121 -= 256;
		if (this.anInt7121 < 0) {
			this.anInt7121 = 0;
		}
		if (this.aClass4_Sub7_8 != null) {
			this.aClass4_Sub7_8.method5465(256);
		}
	}

	@OriginalMember(owner = "client!ed", name = "d", descriptor = "()V")
	protected void method5675() throws Exception {
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(Lclient!po;IB)V")
	private void method5676(@OriginalArg(0) Class4_Sub7 arg0, @OriginalArg(1) int arg1) {
		@Pc(7) int local7 = arg1 >> 5;
		@Pc(12) Class4_Sub7 local12 = this.aClass4_Sub7Array5[local7];
		if (local12 == null) {
			this.aClass4_Sub7Array6[local7] = arg0;
		} else {
			local12.aClass4_Sub7_7 = arg0;
		}
		this.aClass4_Sub7Array5[local7] = arg0;
		arg0.anInt6774 = arg1;
	}

	@OriginalMember(owner = "client!ed", name = "e", descriptor = "()V")
	protected void method5677() throws Exception {
	}

	@OriginalMember(owner = "client!ed", name = "d", descriptor = "(I)V")
	public final synchronized void method5678() {
		if (Static29.aClass175_4 != null) {
			@Pc(5) boolean local5 = true;
			for (@Pc(7) int local7 = 0; local7 < 2; local7++) {
				if (Static29.aClass175_4.aClass55Array1[local7] == this) {
					Static29.aClass175_4.aClass55Array1[local7] = null;
				}
				if (Static29.aClass175_4.aClass55Array1[local7] != null) {
					local5 = false;
				}
			}
			if (local5) {
				Static29.aClass175_4.aBoolean351 = true;
				while (Static29.aClass175_4.aBoolean350) {
					Static77.method1653(50L);
				}
				Static29.aClass175_4 = null;
			}
		}
		this.method5671();
		this.aBoolean527 = true;
		this.anIntArray577 = null;
	}
}
