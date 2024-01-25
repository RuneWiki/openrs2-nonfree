import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!efa")
public class Class89 {

	@OriginalMember(owner = "client!efa", name = "g", descriptor = "Lclient!co;")
	private Class3_Sub3 aClass3_Sub3_8;

	@OriginalMember(owner = "client!efa", name = "i", descriptor = "[I")
	public int[] anIntArray272;

	@OriginalMember(owner = "client!efa", name = "w", descriptor = "I")
	public int anInt4947;

	@OriginalMember(owner = "client!efa", name = "C", descriptor = "I")
	private int anInt4951;

	@OriginalMember(owner = "client!efa", name = "F", descriptor = "I")
	public int anInt4952;

	@OriginalMember(owner = "client!efa", name = "b", descriptor = "Z")
	private boolean aBoolean360 = false;

	@OriginalMember(owner = "client!efa", name = "q", descriptor = "I")
	private final int anInt4944 = 32;

	@OriginalMember(owner = "client!efa", name = "s", descriptor = "J")
	private long aLong129 = Static191.method3071();

	@OriginalMember(owner = "client!efa", name = "v", descriptor = "J")
	private long aLong130 = 0L;

	@OriginalMember(owner = "client!efa", name = "t", descriptor = "I")
	private int anInt4945 = 0;

	@OriginalMember(owner = "client!efa", name = "x", descriptor = "I")
	private int anInt4948 = 0;

	@OriginalMember(owner = "client!efa", name = "A", descriptor = "[Lclient!co;")
	private final Class3_Sub3[] aClass3_Sub3Array5 = new Class3_Sub3[8];

	@OriginalMember(owner = "client!efa", name = "B", descriptor = "[Lclient!co;")
	private final Class3_Sub3[] aClass3_Sub3Array6 = new Class3_Sub3[8];

	@OriginalMember(owner = "client!efa", name = "D", descriptor = "J")
	private long aLong131 = 0L;

	@OriginalMember(owner = "client!efa", name = "E", descriptor = "Z")
	private boolean aBoolean361 = true;

	@OriginalMember(owner = "client!efa", name = "z", descriptor = "I")
	private int anInt4950 = 0;

	@OriginalMember(owner = "client!efa", name = "y", descriptor = "I")
	private int anInt4949 = 0;

	@OriginalMember(owner = "client!efa", name = "a", descriptor = "(B)V")
	public final synchronized void method4206() {
		if (this.aBoolean360) {
			return;
		}
		@Pc(12) long local12 = Static191.method3071();
		try {
			if (this.aLong129 + 6000L < local12) {
				this.aLong129 = local12 - 6000L;
			}
			while (this.aLong129 + 5000L < local12) {
				this.method4207();
				this.aLong129 += (long) (256000 / Static168.anInt3272);
				local12 = Static191.method3071();
			}
		} catch (@Pc(55) Exception local55) {
			this.aLong129 = local12;
		}
		if (this.anIntArray272 == null) {
			return;
		}
		try {
			if (this.aLong131 != 0L) {
				if (local12 < this.aLong131) {
					return;
				}
				this.method4211(this.anInt4952);
				this.aBoolean361 = true;
				this.aLong131 = 0L;
			}
			@Pc(92) int local92 = this.method4219();
			if (this.anInt4950 < this.anInt4949 - local92) {
				this.anInt4950 = this.anInt4949 - local92;
			}
			@Pc(117) int local117 = this.anInt4947 + this.anInt4951;
			if (local117 + 256 > 16384) {
				local117 = 16128;
			}
			if (this.anInt4952 < local117 + 256) {
				this.anInt4952 += 1024;
				if (this.anInt4952 > 16384) {
					this.anInt4952 = 16384;
				}
				this.method4212();
				local92 = 0;
				this.method4211(this.anInt4952);
				if (local117 + 256 > this.anInt4952) {
					local117 = this.anInt4952 - 256;
					this.anInt4951 = local117 - this.anInt4947;
				}
				this.aBoolean361 = true;
			}
			while (local92 < local117) {
				this.method4214(this.anIntArray272);
				this.method4210();
				local92 += 256;
			}
			if (local12 > this.aLong130) {
				if (this.aBoolean361) {
					this.aBoolean361 = false;
				} else if (this.anInt4950 == 0 && this.anInt4948 == 0) {
					this.method4212();
					this.aLong131 = local12 + 2000L;
					return;
				} else {
					this.anInt4951 = Math.min(this.anInt4948, this.anInt4950);
					this.anInt4948 = this.anInt4950;
				}
				this.anInt4950 = 0;
				this.aLong130 = local12 + 2000L;
			}
			this.anInt4949 = local92;
		} catch (@Pc(249) Exception local249) {
			this.method4212();
			this.aLong131 = local12 + 2000L;
		}
	}

	@OriginalMember(owner = "client!efa", name = "a", descriptor = "(IB)V")
	private void method4207() {
		this.anInt4945 -= 256;
		if (this.anInt4945 < 0) {
			this.anInt4945 = 0;
		}
		if (this.aClass3_Sub3_8 != null) {
			this.aClass3_Sub3_8.method4678(256);
		}
	}

	@OriginalMember(owner = "client!efa", name = "a", descriptor = "(ILclient!co;I)V")
	private void method4208(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub3 arg1) {
		@Pc(7) int local7 = arg0 >> 5;
		@Pc(12) Class3_Sub3 local12 = this.aClass3_Sub3Array6[local7];
		if (local12 == null) {
			this.aClass3_Sub3Array5[local7] = arg1;
		} else {
			local12.aClass3_Sub3_9 = arg1;
		}
		this.aClass3_Sub3Array6[local7] = arg1;
		arg1.anInt5509 = arg0;
	}

	@OriginalMember(owner = "client!efa", name = "b", descriptor = "(B)V")
	public final synchronized void method4209() {
		if (Static63.aClass110_1 != null) {
			@Pc(5) boolean local5 = true;
			for (@Pc(7) int local7 = 0; local7 < 2; local7++) {
				if (Static63.aClass110_1.aClass89Array1[local7] == this) {
					Static63.aClass110_1.aClass89Array1[local7] = null;
				}
				if (Static63.aClass110_1.aClass89Array1[local7] != null) {
					local5 = false;
				}
			}
			if (local5) {
				Static63.aClass110_1.aBoolean240 = true;
				while (Static63.aClass110_1.aBoolean241) {
					Static143.method2414(50L);
				}
				Static63.aClass110_1 = null;
			}
		}
		this.method4212();
		this.aBoolean360 = true;
		this.anIntArray272 = null;
	}

	@OriginalMember(owner = "client!efa", name = "a", descriptor = "()V")
	protected void method4210() throws Exception {
	}

	@OriginalMember(owner = "client!efa", name = "a", descriptor = "(I)V")
	public void method4211(@OriginalArg(0) int arg0) throws Exception {
	}

	@OriginalMember(owner = "client!efa", name = "b", descriptor = "()V")
	protected void method4212() {
	}

	@OriginalMember(owner = "client!efa", name = "a", descriptor = "([II)V")
	private void method4214(@OriginalArg(0) int[] arg0) {
		@Pc(1) short local1 = 256;
		if (Static411.aBoolean570) {
			local1 = 512;
		}
		Static651.method753(arg0, 0, local1);
		this.anInt4945 -= 256;
		if (this.aClass3_Sub3_8 != null && this.anInt4945 <= 0) {
			this.anInt4945 += Static168.anInt3272 >> 4;
			Static26.method366(this.aClass3_Sub3_8);
			this.method4208(this.aClass3_Sub3_8.method4683(), this.aClass3_Sub3_8);
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
						@Pc(88) Class3_Sub3 local88 = null;
						@Pc(93) Class3_Sub3 local93 = this.aClass3_Sub3Array5[local56];
						label97: while (true) {
							while (true) {
								if (local93 == null) {
									break label97;
								}
								@Pc(97) Class3_Sub18 local97 = local93.aClass3_Sub18_6;
								if (local97 == null || local97.anInt10131 <= local61) {
									local93.aBoolean399 = true;
									@Pc(121) int local121 = local93.method4681();
									local45 += local121;
									if (local97 != null) {
										local97.anInt10131 += local121;
									}
									if (local45 >= this.anInt4944) {
										break label103;
									}
									@Pc(140) Class3_Sub3 local140 = local93.method4680();
									if (local140 != null) {
										@Pc(145) int local145 = local93.anInt5509;
										while (local140 != null) {
											this.method4208(local145 * local140.method4683() >> 8, local140);
											local140 = local93.method4679();
										}
									}
									@Pc(164) Class3_Sub3 local164 = local93.aClass3_Sub3_9;
									local93.aClass3_Sub3_9 = null;
									if (local88 == null) {
										this.aClass3_Sub3Array5[local56] = local164;
									} else {
										local88.aClass3_Sub3_9 = local164;
									}
									if (local164 == null) {
										this.aClass3_Sub3Array6[local56] = local88;
									}
									local93 = local164;
								} else {
									local47 |= 0x1 << local56;
									local88 = local93;
									local93 = local93.aClass3_Sub3_9;
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
				@Pc(207) Class3_Sub3 local207 = this.aClass3_Sub3Array5[local56];
				this.aClass3_Sub3Array5[local56] = this.aClass3_Sub3Array6[local56] = null;
				while (local207 != null) {
					@Pc(221) Class3_Sub3 local221 = local207.aClass3_Sub3_9;
					local207.aClass3_Sub3_9 = null;
					local207 = local221;
				}
			}
		}
		if (this.anInt4945 < 0) {
			this.anInt4945 = 0;
		}
		if (this.aClass3_Sub3_8 != null) {
			this.aClass3_Sub3_8.method4677(arg0, 0, 256);
		}
		this.aLong129 = Static191.method3071();
	}

	@OriginalMember(owner = "client!efa", name = "c", descriptor = "()V")
	protected void method4215() throws Exception {
	}

	@OriginalMember(owner = "client!efa", name = "c", descriptor = "(I)V")
	public final synchronized void method4216() {
		this.aBoolean361 = true;
		try {
			this.method4215();
		} catch (@Pc(15) Exception local15) {
			this.method4212();
			this.aLong131 = Static191.method3071() + 2000L;
		}
	}

	@OriginalMember(owner = "client!efa", name = "a", descriptor = "(Ljava/awt/Component;)V")
	public void method4217(@OriginalArg(0) Component arg0) throws Exception {
	}

	@OriginalMember(owner = "client!efa", name = "a", descriptor = "(Lclient!co;I)V")
	public final synchronized void method4218(@OriginalArg(0) Class3_Sub3 arg0) {
		this.aClass3_Sub3_8 = arg0;
	}

	@OriginalMember(owner = "client!efa", name = "d", descriptor = "()I")
	protected int method4219() throws Exception {
		return this.anInt4952;
	}
}
