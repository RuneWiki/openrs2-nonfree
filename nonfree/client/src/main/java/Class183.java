import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lj")
public class Class183 {

	@OriginalMember(owner = "client!lj", name = "p", descriptor = "[I")
	public int[] anIntArray835;

	@OriginalMember(owner = "client!lj", name = "q", descriptor = "Lclient!gv;")
	private Class1_Sub16 aClass1_Sub16_8;

	@OriginalMember(owner = "client!lj", name = "w", descriptor = "I")
	private int anInt9031;

	@OriginalMember(owner = "client!lj", name = "x", descriptor = "I")
	public int anInt9032;

	@OriginalMember(owner = "client!lj", name = "C", descriptor = "I")
	public int anInt9036;

	@OriginalMember(owner = "client!lj", name = "i", descriptor = "I")
	private final int anInt9022 = 32;

	@OriginalMember(owner = "client!lj", name = "t", descriptor = "Z")
	private boolean aBoolean630 = false;

	@OriginalMember(owner = "client!lj", name = "b", descriptor = "J")
	private long aLong382 = Static60.method1119();

	@OriginalMember(owner = "client!lj", name = "A", descriptor = "J")
	private long aLong383 = 0L;

	@OriginalMember(owner = "client!lj", name = "y", descriptor = "I")
	private int anInt9033 = 0;

	@OriginalMember(owner = "client!lj", name = "B", descriptor = "I")
	private int anInt9035 = 0;

	@OriginalMember(owner = "client!lj", name = "z", descriptor = "I")
	private int anInt9034 = 0;

	@OriginalMember(owner = "client!lj", name = "G", descriptor = "I")
	private int anInt9038 = 0;

	@OriginalMember(owner = "client!lj", name = "E", descriptor = "[Lclient!gv;")
	private final Class1_Sub16[] aClass1_Sub16Array5 = new Class1_Sub16[8];

	@OriginalMember(owner = "client!lj", name = "F", descriptor = "J")
	private long aLong384 = 0L;

	@OriginalMember(owner = "client!lj", name = "H", descriptor = "Z")
	private boolean aBoolean631 = true;

	@OriginalMember(owner = "client!lj", name = "I", descriptor = "[Lclient!gv;")
	private final Class1_Sub16[] aClass1_Sub16Array6 = new Class1_Sub16[8];

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(Ljava/awt/Component;)V")
	public void method7414(@OriginalArg(0) Component arg0) throws Exception {
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "()V")
	protected void method7415() {
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(II)V")
	private void method7416() {
		this.anInt9033 -= 256;
		if (this.anInt9033 < 0) {
			this.anInt9033 = 0;
		}
		if (this.aClass1_Sub16_8 != null) {
			this.aClass1_Sub16_8.method5754(256);
		}
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(I)V")
	public void method7417(@OriginalArg(0) int arg0) throws Exception {
	}

	@OriginalMember(owner = "client!lj", name = "b", descriptor = "()I")
	protected int method7418() throws Exception {
		return this.anInt9032;
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(BLclient!gv;)V")
	public final synchronized void method7419(@OriginalArg(1) Class1_Sub16 arg0) {
		this.aClass1_Sub16_8 = arg0;
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(BLclient!gv;I)V")
	private void method7420(@OriginalArg(1) Class1_Sub16 arg0, @OriginalArg(2) int arg1) {
		@Pc(16) int local16 = arg1 >> 5;
		@Pc(21) Class1_Sub16 local21 = this.aClass1_Sub16Array5[local16];
		if (local21 == null) {
			this.aClass1_Sub16Array6[local16] = arg0;
		} else {
			local21.aClass1_Sub16_6 = arg0;
		}
		this.aClass1_Sub16Array5[local16] = arg0;
		arg0.anInt6864 = arg1;
	}

	@OriginalMember(owner = "client!lj", name = "b", descriptor = "(I)V")
	public final synchronized void method7422() {
		if (Static197.aClass297_2 != null) {
			@Pc(5) boolean local5 = true;
			for (@Pc(7) int local7 = 0; local7 < 2; local7++) {
				if (Static197.aClass297_2.aClass183Array1[local7] == this) {
					Static197.aClass297_2.aClass183Array1[local7] = null;
				}
				if (Static197.aClass297_2.aClass183Array1[local7] != null) {
					local5 = false;
				}
			}
			if (local5) {
				Static197.aClass297_2.aBoolean605 = true;
				while (Static197.aClass297_2.aBoolean606) {
					Static209.method3565(50L);
				}
				Static197.aClass297_2 = null;
			}
		}
		this.method7415();
		this.aBoolean630 = true;
		this.anIntArray835 = null;
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "([II)V")
	private void method7425(@OriginalArg(0) int[] arg0) {
		@Pc(1) short local1 = 256;
		if (Static187.aBoolean231) {
			local1 = 512;
		}
		Static551.method3489(arg0, 0, local1);
		this.anInt9033 -= 256;
		if (this.aClass1_Sub16_8 != null && this.anInt9033 <= 0) {
			this.anInt9033 += Static477.anInt7971 >> 4;
			Static308.method4862(this.aClass1_Sub16_8);
			this.method7420(this.aClass1_Sub16_8, this.aClass1_Sub16_8.method5751());
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
						@Pc(88) Class1_Sub16 local88 = null;
						@Pc(93) Class1_Sub16 local93 = this.aClass1_Sub16Array6[local56];
						label97: while (true) {
							while (true) {
								if (local93 == null) {
									break label97;
								}
								@Pc(97) Class1_Sub37 local97 = local93.aClass1_Sub37_5;
								if (local97 == null || local97.anInt7859 <= local61) {
									local93.aBoolean498 = true;
									@Pc(121) int local121 = local93.method5749();
									local45 += local121;
									if (local97 != null) {
										local97.anInt7859 += local121;
									}
									if (local45 >= this.anInt9022) {
										break label103;
									}
									@Pc(140) Class1_Sub16 local140 = local93.method5748();
									if (local140 != null) {
										@Pc(145) int local145 = local93.anInt6864;
										while (local140 != null) {
											this.method7420(local140, local145 * local140.method5751() >> 8);
											local140 = local93.method5752();
										}
									}
									@Pc(164) Class1_Sub16 local164 = local93.aClass1_Sub16_6;
									local93.aClass1_Sub16_6 = null;
									if (local88 == null) {
										this.aClass1_Sub16Array6[local56] = local164;
									} else {
										local88.aClass1_Sub16_6 = local164;
									}
									if (local164 == null) {
										this.aClass1_Sub16Array5[local56] = local88;
									}
									local93 = local164;
								} else {
									local47 |= 0x1 << local56;
									local88 = local93;
									local93 = local93.aClass1_Sub16_6;
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
				@Pc(207) Class1_Sub16 local207 = this.aClass1_Sub16Array6[local56];
				this.aClass1_Sub16Array6[local56] = this.aClass1_Sub16Array5[local56] = null;
				while (local207 != null) {
					@Pc(221) Class1_Sub16 local221 = local207.aClass1_Sub16_6;
					local207.aClass1_Sub16_6 = null;
					local207 = local221;
				}
			}
		}
		if (this.anInt9033 < 0) {
			this.anInt9033 = 0;
		}
		if (this.aClass1_Sub16_8 != null) {
			this.aClass1_Sub16_8.method5753(arg0, 0, 256);
		}
		this.aLong382 = Static60.method1119();
	}

	@OriginalMember(owner = "client!lj", name = "d", descriptor = "(I)V")
	public final synchronized void method7426() {
		if (this.aBoolean630) {
			return;
		}
		@Pc(12) long local12 = Static60.method1119();
		try {
			if (this.aLong382 + 500000L < local12) {
				this.aLong382 = local12 - 500000L;
			}
			while (this.aLong382 + 5000L < local12) {
				this.method7416();
				this.aLong382 += 256000 / Static477.anInt7971;
			}
		} catch (@Pc(52) Exception local52) {
			this.aLong382 = local12;
		}
		if (this.anIntArray835 == null) {
			return;
		}
		try {
			if (this.aLong383 != 0L) {
				if (local12 < this.aLong383) {
					return;
				}
				this.method7417(this.anInt9032);
				this.aLong383 = 0L;
				this.aBoolean631 = true;
			}
			@Pc(89) int local89 = this.method7418();
			if (this.anInt9035 < this.anInt9034 - local89) {
				this.anInt9035 = this.anInt9034 - local89;
			}
			@Pc(114) int local114 = this.anInt9036 + this.anInt9031;
			if (local114 + 256 > 16384) {
				local114 = 16128;
			}
			if (local114 + 256 > this.anInt9032) {
				this.anInt9032 += 1024;
				if (this.anInt9032 > 16384) {
					this.anInt9032 = 16384;
				}
				this.method7415();
				this.method7417(this.anInt9032);
				local89 = 0;
				this.aBoolean631 = true;
				if (this.anInt9032 < local114 + 256) {
					local114 = this.anInt9032 - 256;
					this.anInt9031 = local114 - this.anInt9036;
				}
			}
			while (local89 < local114) {
				this.method7425(this.anIntArray835);
				local89 += 256;
				this.method7429();
			}
			if (this.aLong384 < local12) {
				if (this.aBoolean631) {
					this.aBoolean631 = false;
				} else if (this.anInt9035 == 0 && this.anInt9038 == 0) {
					this.method7415();
					this.aLong383 = local12 + 2000L;
					return;
				} else {
					this.anInt9031 = Math.min(this.anInt9038, this.anInt9035);
					this.anInt9038 = this.anInt9035;
				}
				this.anInt9035 = 0;
				this.aLong384 = local12 + 2000L;
			}
			this.anInt9034 = local89;
		} catch (@Pc(243) Exception local243) {
			this.method7415();
			this.aLong383 = local12 + 2000L;
		}
	}

	@OriginalMember(owner = "client!lj", name = "c", descriptor = "()V")
	protected void method7428() throws Exception {
	}

	@OriginalMember(owner = "client!lj", name = "d", descriptor = "()V")
	protected void method7429() throws Exception {
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(B)V")
	public final synchronized void method7430() {
		this.aBoolean631 = true;
		try {
			this.method7428();
		} catch (@Pc(22) Exception local22) {
			this.method7415();
			this.aLong383 = Static60.method1119() + 2000L;
		}
	}
}
