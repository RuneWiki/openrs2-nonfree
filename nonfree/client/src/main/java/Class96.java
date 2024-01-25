import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kl")
public class Class96 {

	@OriginalMember(owner = "client!kl", name = "u", descriptor = "[I")
	public int[] anIntArray269;

	@OriginalMember(owner = "client!kl", name = "v", descriptor = "Lclient!wq;")
	private Class3_Sub1 aClass3_Sub1_5;

	@OriginalMember(owner = "client!kl", name = "x", descriptor = "I")
	public int anInt4098;

	@OriginalMember(owner = "client!kl", name = "B", descriptor = "I")
	public int anInt4100;

	@OriginalMember(owner = "client!kl", name = "E", descriptor = "I")
	private int anInt4102;

	@OriginalMember(owner = "client!kl", name = "m", descriptor = "I")
	private final int anInt4091 = 32;

	@OriginalMember(owner = "client!kl", name = "j", descriptor = "Z")
	private boolean aBoolean297 = false;

	@OriginalMember(owner = "client!kl", name = "f", descriptor = "J")
	private long aLong142 = Static354.method4966();

	@OriginalMember(owner = "client!kl", name = "z", descriptor = "Z")
	private boolean aBoolean298 = true;

	@OriginalMember(owner = "client!kl", name = "y", descriptor = "[Lclient!wq;")
	private final Class3_Sub1[] aClass3_Sub1Array5 = new Class3_Sub1[8];

	@OriginalMember(owner = "client!kl", name = "C", descriptor = "I")
	private int anInt4101 = 0;

	@OriginalMember(owner = "client!kl", name = "D", descriptor = "[Lclient!wq;")
	private final Class3_Sub1[] aClass3_Sub1Array6 = new Class3_Sub1[8];

	@OriginalMember(owner = "client!kl", name = "A", descriptor = "I")
	private int anInt4099 = 0;

	@OriginalMember(owner = "client!kl", name = "G", descriptor = "I")
	private int anInt4103 = 0;

	@OriginalMember(owner = "client!kl", name = "H", descriptor = "I")
	private int anInt4104 = 0;

	@OriginalMember(owner = "client!kl", name = "F", descriptor = "J")
	private long aLong143 = 0L;

	@OriginalMember(owner = "client!kl", name = "I", descriptor = "J")
	private long aLong144 = 0L;

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(Ljava/awt/Component;)V")
	public void method3461(@OriginalArg(0) Component arg0) throws Exception {
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "()V")
	protected void method3462() throws Exception {
	}

	@OriginalMember(owner = "client!kl", name = "b", descriptor = "()V")
	protected void method3463() {
	}

	@OriginalMember(owner = "client!kl", name = "c", descriptor = "()V")
	protected void method3464() throws Exception {
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(Z)V")
	public final synchronized void method3465() {
		this.aBoolean298 = true;
		try {
			this.method3464();
		} catch (@Pc(16) Exception local16) {
			this.method3463();
			this.aLong144 = Static354.method4966() + 2000L;
		}
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(B)V")
	public final synchronized void method3466() {
		if (Static362.aClass117_1 != null) {
			@Pc(9) boolean local9 = true;
			for (@Pc(11) int local11 = 0; local11 < 2; local11++) {
				if (Static362.aClass117_1.aClass96Array1[local11] == this) {
					Static362.aClass117_1.aClass96Array1[local11] = null;
				}
				if (Static362.aClass117_1.aClass96Array1[local11] != null) {
					local9 = false;
				}
			}
			if (local9) {
				Static362.aClass117_1.aBoolean260 = true;
				while (Static362.aClass117_1.aBoolean259) {
					Static83.method1499(50L);
				}
				Static362.aClass117_1 = null;
			}
		}
		this.method3463();
		this.aBoolean297 = true;
		this.anIntArray269 = null;
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(ILclient!wq;)V")
	public final synchronized void method3468(@OriginalArg(1) Class3_Sub1 arg0) {
		this.aClass3_Sub1_5 = arg0;
	}

	@OriginalMember(owner = "client!kl", name = "b", descriptor = "(I)V")
	public void method3469(@OriginalArg(0) int arg0) throws Exception {
	}

	@OriginalMember(owner = "client!kl", name = "b", descriptor = "(B)V")
	public final synchronized void method3471() {
		if (this.aBoolean297) {
			return;
		}
		@Pc(12) long local12 = Static354.method4966();
		try {
			if (this.aLong142 + 500000L < local12) {
				this.aLong142 = local12 - 500000L;
			}
			while (local12 > this.aLong142 + 5000L) {
				this.method3476();
				this.aLong142 += 256000 / Static203.anInt3626;
			}
		} catch (@Pc(48) Exception local48) {
			this.aLong142 = local12;
		}
		if (this.anIntArray269 == null) {
			return;
		}
		try {
			if (this.aLong144 != 0L) {
				if (local12 < this.aLong144) {
					return;
				}
				this.method3469(this.anInt4098);
				this.aLong144 = 0L;
				this.aBoolean298 = true;
			}
			@Pc(79) int local79 = this.method3475();
			if (this.anInt4099 - local79 > this.anInt4103) {
				this.anInt4103 = this.anInt4099 - local79;
			}
			@Pc(108) int local108 = this.anInt4100 + this.anInt4102;
			if (local108 + 256 > 16384) {
				local108 = 16128;
			}
			if (this.anInt4098 < local108 + 256) {
				this.anInt4098 += 1024;
				if (this.anInt4098 > 16384) {
					this.anInt4098 = 16384;
				}
				this.method3463();
				local79 = 0;
				this.method3469(this.anInt4098);
				this.aBoolean298 = true;
				if (local108 + 256 > this.anInt4098) {
					local108 = this.anInt4098 - 256;
					this.anInt4102 = local108 - this.anInt4100;
				}
			}
			while (local108 > local79) {
				this.method3473(this.anIntArray269);
				local79 += 256;
				this.method3462();
			}
			if (local12 > this.aLong143) {
				if (this.aBoolean298) {
					this.aBoolean298 = false;
				} else if (this.anInt4103 == 0 && this.anInt4104 == 0) {
					this.method3463();
					this.aLong144 = local12 + 2000L;
					return;
				} else {
					this.anInt4102 = Math.min(this.anInt4104, this.anInt4103);
					this.anInt4104 = this.anInt4103;
				}
				this.anInt4103 = 0;
				this.aLong143 = local12 + 2000L;
			}
			this.anInt4099 = local79;
		} catch (@Pc(235) Exception local235) {
			this.method3463();
			this.aLong144 = local12 + 2000L;
		}
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "([II)V")
	private void method3473(@OriginalArg(0) int[] arg0) {
		@Pc(1) short local1 = 256;
		if (Static158.aBoolean222) {
			local1 = 512;
		}
		Static466.method207(arg0, 0, local1);
		this.anInt4101 -= 256;
		if (this.aClass3_Sub1_5 != null && this.anInt4101 <= 0) {
			this.anInt4101 += Static203.anInt3626 >> 4;
			Static14.method265(this.aClass3_Sub1_5);
			this.method3474(this.aClass3_Sub1_5, this.aClass3_Sub1_5.method6293());
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
						@Pc(88) Class3_Sub1 local88 = null;
						@Pc(93) Class3_Sub1 local93 = this.aClass3_Sub1Array5[local56];
						label97: while (true) {
							while (true) {
								if (local93 == null) {
									break label97;
								}
								@Pc(97) Class3_Sub28 local97 = local93.aClass3_Sub28_5;
								if (local97 == null || local97.anInt3567 <= local61) {
									local93.aBoolean518 = true;
									@Pc(121) int local121 = local93.method6291();
									local45 += local121;
									if (local97 != null) {
										local97.anInt3567 += local121;
									}
									if (local45 >= this.anInt4091) {
										break label103;
									}
									@Pc(140) Class3_Sub1 local140 = local93.method6296();
									if (local140 != null) {
										@Pc(145) int local145 = local93.anInt7780;
										while (local140 != null) {
											this.method3474(local140, local145 * local140.method6293() >> 8);
											local140 = local93.method6292();
										}
									}
									@Pc(164) Class3_Sub1 local164 = local93.aClass3_Sub1_8;
									local93.aClass3_Sub1_8 = null;
									if (local88 == null) {
										this.aClass3_Sub1Array5[local56] = local164;
									} else {
										local88.aClass3_Sub1_8 = local164;
									}
									if (local164 == null) {
										this.aClass3_Sub1Array6[local56] = local88;
									}
									local93 = local164;
								} else {
									local47 |= 0x1 << local56;
									local88 = local93;
									local93 = local93.aClass3_Sub1_8;
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
				@Pc(207) Class3_Sub1 local207 = this.aClass3_Sub1Array5[local56];
				this.aClass3_Sub1Array5[local56] = this.aClass3_Sub1Array6[local56] = null;
				while (local207 != null) {
					@Pc(221) Class3_Sub1 local221 = local207.aClass3_Sub1_8;
					local207.aClass3_Sub1_8 = null;
					local207 = local221;
				}
			}
		}
		if (this.anInt4101 < 0) {
			this.anInt4101 = 0;
		}
		if (this.aClass3_Sub1_5 != null) {
			this.aClass3_Sub1_5.method6290(arg0, 0, 256);
		}
		this.aLong142 = Static354.method4966();
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(BLclient!wq;I)V")
	private void method3474(@OriginalArg(1) Class3_Sub1 arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = arg1 >> 5;
		@Pc(19) Class3_Sub1 local19 = this.aClass3_Sub1Array6[local7];
		if (local19 == null) {
			this.aClass3_Sub1Array5[local7] = arg0;
		} else {
			local19.aClass3_Sub1_8 = arg0;
		}
		this.aClass3_Sub1Array6[local7] = arg0;
		arg0.anInt7780 = arg1;
	}

	@OriginalMember(owner = "client!kl", name = "d", descriptor = "()I")
	protected int method3475() throws Exception {
		return this.anInt4098;
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(BI)V")
	private void method3476() {
		this.anInt4101 -= 256;
		if (this.anInt4101 < 0) {
			this.anInt4101 = 0;
		}
		if (this.aClass3_Sub1_5 != null) {
			this.aClass3_Sub1_5.method6294(256);
		}
	}
}
