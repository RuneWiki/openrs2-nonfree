import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gaa")
public class Class39 {

	@OriginalMember(owner = "client!gaa", name = "i", descriptor = "Lclient!kca;")
	private Class1_Sub12 aClass1_Sub12_6;

	@OriginalMember(owner = "client!gaa", name = "k", descriptor = "[I")
	public int[] anIntArray415;

	@OriginalMember(owner = "client!gaa", name = "v", descriptor = "I")
	private int anInt5861;

	@OriginalMember(owner = "client!gaa", name = "y", descriptor = "I")
	public int anInt5862;

	@OriginalMember(owner = "client!gaa", name = "F", descriptor = "I")
	public int anInt5867;

	@OriginalMember(owner = "client!gaa", name = "m", descriptor = "I")
	private final int anInt5855 = 32;

	@OriginalMember(owner = "client!gaa", name = "b", descriptor = "Z")
	private boolean aBoolean399 = false;

	@OriginalMember(owner = "client!gaa", name = "r", descriptor = "J")
	private long aLong152 = Static93.method2172();

	@OriginalMember(owner = "client!gaa", name = "t", descriptor = "J")
	private long aLong153 = 0L;

	@OriginalMember(owner = "client!gaa", name = "x", descriptor = "Z")
	private boolean aBoolean400 = true;

	@OriginalMember(owner = "client!gaa", name = "u", descriptor = "I")
	private int anInt5860 = 0;

	@OriginalMember(owner = "client!gaa", name = "B", descriptor = "I")
	private int anInt5865 = 0;

	@OriginalMember(owner = "client!gaa", name = "A", descriptor = "I")
	private int anInt5864 = 0;

	@OriginalMember(owner = "client!gaa", name = "E", descriptor = "[Lclient!kca;")
	private final Class1_Sub12[] aClass1_Sub12Array6 = new Class1_Sub12[8];

	@OriginalMember(owner = "client!gaa", name = "D", descriptor = "I")
	private int anInt5866 = 0;

	@OriginalMember(owner = "client!gaa", name = "C", descriptor = "J")
	private long aLong154 = 0L;

	@OriginalMember(owner = "client!gaa", name = "w", descriptor = "[Lclient!kca;")
	private final Class1_Sub12[] aClass1_Sub12Array5 = new Class1_Sub12[8];

	@OriginalMember(owner = "client!gaa", name = "a", descriptor = "(I)V")
	public final synchronized void method5057() {
		if (Static229.aClass261_1 != null) {
			@Pc(7) boolean local7 = true;
			for (@Pc(9) int local9 = 0; local9 < 2; local9++) {
				if (Static229.aClass261_1.aClass39Array1[local9] == this) {
					Static229.aClass261_1.aClass39Array1[local9] = null;
				}
				if (Static229.aClass261_1.aClass39Array1[local9] != null) {
					local7 = false;
				}
			}
			if (local7) {
				Static229.aClass261_1.aBoolean493 = true;
				while (Static229.aClass261_1.aBoolean492) {
					Static505.method7295(50L);
				}
				Static229.aClass261_1 = null;
			}
		}
		this.method5069();
		this.anIntArray415 = null;
		this.aBoolean399 = true;
	}

	@OriginalMember(owner = "client!gaa", name = "a", descriptor = "()V")
	protected void method5058() throws Exception {
	}

	@OriginalMember(owner = "client!gaa", name = "a", descriptor = "(II)V")
	private void method5059() {
		this.anInt5860 -= 256;
		if (this.anInt5860 < 0) {
			this.anInt5860 = 0;
		}
		if (this.aClass1_Sub12_6 != null) {
			this.aClass1_Sub12_6.method6516(256);
		}
	}

	@OriginalMember(owner = "client!gaa", name = "b", descriptor = "(I)V")
	public final synchronized void method5060() {
		this.aBoolean400 = true;
		try {
			this.method5067();
		} catch (@Pc(16) Exception local16) {
			this.method5069();
			this.aLong154 = Static93.method2172() + 2000L;
		}
	}

	@OriginalMember(owner = "client!gaa", name = "a", descriptor = "(Lclient!kca;B)V")
	public final synchronized void method5061(@OriginalArg(0) Class1_Sub12 arg0) {
		this.aClass1_Sub12_6 = arg0;
	}

	@OriginalMember(owner = "client!gaa", name = "a", descriptor = "(Lclient!kca;II)V")
	private void method5062(@OriginalArg(0) Class1_Sub12 arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = arg1 >> 5;
		@Pc(12) Class1_Sub12 local12 = this.aClass1_Sub12Array6[local7];
		if (local12 == null) {
			this.aClass1_Sub12Array5[local7] = arg0;
		} else {
			local12.aClass1_Sub12_8 = arg0;
		}
		this.aClass1_Sub12Array6[local7] = arg0;
		arg0.anInt7604 = arg1;
	}

	@OriginalMember(owner = "client!gaa", name = "a", descriptor = "(Ljava/awt/Component;)V")
	public void method5064(@OriginalArg(0) Component arg0) throws Exception {
	}

	@OriginalMember(owner = "client!gaa", name = "c", descriptor = "(I)V")
	public void method5065(@OriginalArg(0) int arg0) throws Exception {
	}

	@OriginalMember(owner = "client!gaa", name = "a", descriptor = "([II)V")
	private void method5066(@OriginalArg(0) int[] arg0) {
		@Pc(1) short local1 = 256;
		if (Static267.aBoolean348) {
			local1 = 512;
		}
		Static555.method5093(arg0, 0, local1);
		this.anInt5860 -= 256;
		if (this.aClass1_Sub12_6 != null && this.anInt5860 <= 0) {
			this.anInt5860 += Static77.anInt2079 >> 4;
			Static452.method6481(this.aClass1_Sub12_6);
			this.method5062(this.aClass1_Sub12_6, this.aClass1_Sub12_6.method6518());
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
						@Pc(88) Class1_Sub12 local88 = null;
						@Pc(93) Class1_Sub12 local93 = this.aClass1_Sub12Array5[local56];
						label97: while (true) {
							while (true) {
								if (local93 == null) {
									break label97;
								}
								@Pc(97) Class1_Sub32 local97 = local93.aClass1_Sub32_5;
								if (local97 == null || local97.anInt6857 <= local61) {
									local93.aBoolean503 = true;
									@Pc(121) int local121 = local93.method6521();
									local45 += local121;
									if (local97 != null) {
										local97.anInt6857 += local121;
									}
									if (local45 >= this.anInt5855) {
										break label103;
									}
									@Pc(140) Class1_Sub12 local140 = local93.method6515();
									if (local140 != null) {
										@Pc(145) int local145 = local93.anInt7604;
										while (local140 != null) {
											this.method5062(local140, local145 * local140.method6518() >> 8);
											local140 = local93.method6517();
										}
									}
									@Pc(164) Class1_Sub12 local164 = local93.aClass1_Sub12_8;
									local93.aClass1_Sub12_8 = null;
									if (local88 == null) {
										this.aClass1_Sub12Array5[local56] = local164;
									} else {
										local88.aClass1_Sub12_8 = local164;
									}
									if (local164 == null) {
										this.aClass1_Sub12Array6[local56] = local88;
									}
									local93 = local164;
								} else {
									local47 |= 0x1 << local56;
									local88 = local93;
									local93 = local93.aClass1_Sub12_8;
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
				@Pc(207) Class1_Sub12 local207 = this.aClass1_Sub12Array5[local56];
				this.aClass1_Sub12Array5[local56] = this.aClass1_Sub12Array6[local56] = null;
				while (local207 != null) {
					@Pc(221) Class1_Sub12 local221 = local207.aClass1_Sub12_8;
					local207.aClass1_Sub12_8 = null;
					local207 = local221;
				}
			}
		}
		if (this.anInt5860 < 0) {
			this.anInt5860 = 0;
		}
		if (this.aClass1_Sub12_6 != null) {
			this.aClass1_Sub12_6.method6519(arg0, 0, 256);
		}
		this.aLong152 = Static93.method2172();
	}

	@OriginalMember(owner = "client!gaa", name = "b", descriptor = "()V")
	protected void method5067() throws Exception {
	}

	@OriginalMember(owner = "client!gaa", name = "c", descriptor = "()V")
	protected void method5069() {
	}

	@OriginalMember(owner = "client!gaa", name = "d", descriptor = "()I")
	protected int method5070() throws Exception {
		return this.anInt5862;
	}

	@OriginalMember(owner = "client!gaa", name = "a", descriptor = "(B)V")
	public final synchronized void method5071() {
		if (this.aBoolean399) {
			return;
		}
		@Pc(10) long local10 = Static93.method2172();
		try {
			if (this.aLong152 + 500000L < local10) {
				this.aLong152 = local10 - 500000L;
			}
			while (this.aLong152 + 5000L < local10) {
				this.method5059();
				this.aLong152 += 256000 / Static77.anInt2079;
			}
		} catch (@Pc(47) Exception local47) {
			this.aLong152 = local10;
		}
		if (this.anIntArray415 == null) {
			return;
		}
		try {
			if (this.aLong154 != 0L) {
				if (this.aLong154 > local10) {
					return;
				}
				this.method5065(this.anInt5862);
				this.aLong154 = 0L;
				this.aBoolean400 = true;
			}
			@Pc(78) int local78 = this.method5070();
			if (this.anInt5865 - local78 > this.anInt5864) {
				this.anInt5864 = this.anInt5865 - local78;
			}
			@Pc(105) int local105 = this.anInt5861 + this.anInt5867;
			if (local105 + 256 > 16384) {
				local105 = 16128;
			}
			if (this.anInt5862 < local105 + 256) {
				this.anInt5862 += 1024;
				if (this.anInt5862 > 16384) {
					this.anInt5862 = 16384;
				}
				this.method5069();
				local78 = 0;
				this.method5065(this.anInt5862);
				if (local105 + 256 > this.anInt5862) {
					local105 = this.anInt5862 - 256;
					this.anInt5861 = local105 - this.anInt5867;
				}
				this.aBoolean400 = true;
			}
			while (local105 > local78) {
				this.method5066(this.anIntArray415);
				this.method5058();
				local78 += 256;
			}
			if (local10 > this.aLong153) {
				if (this.aBoolean400) {
					this.aBoolean400 = false;
				} else if (this.anInt5864 == 0 && this.anInt5866 == 0) {
					this.method5069();
					this.aLong154 = local10 + 2000L;
					return;
				} else {
					this.anInt5861 = Math.min(this.anInt5866, this.anInt5864);
					this.anInt5866 = this.anInt5864;
				}
				this.anInt5864 = 0;
				this.aLong153 = local10 + 2000L;
			}
			this.anInt5865 = local78;
		} catch (@Pc(235) Exception local235) {
			this.method5069();
			this.aLong154 = local10 + 2000L;
		}
	}
}
