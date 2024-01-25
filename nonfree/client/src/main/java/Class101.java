import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vn")
public class Class101 {

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "[I")
	public int[] anIntArray454;

	@OriginalMember(owner = "client!vn", name = "s", descriptor = "Lclient!cv;")
	private Class1_Sub9 aClass1_Sub9_7;

	@OriginalMember(owner = "client!vn", name = "u", descriptor = "I")
	public int anInt6038;

	@OriginalMember(owner = "client!vn", name = "w", descriptor = "I")
	private int anInt6040;

	@OriginalMember(owner = "client!vn", name = "C", descriptor = "I")
	public int anInt6043;

	@OriginalMember(owner = "client!vn", name = "d", descriptor = "Z")
	private boolean aBoolean532 = false;

	@OriginalMember(owner = "client!vn", name = "b", descriptor = "I")
	private final int anInt6024 = 32;

	@OriginalMember(owner = "client!vn", name = "f", descriptor = "J")
	private long aLong198 = Static183.method2674();

	@OriginalMember(owner = "client!vn", name = "z", descriptor = "I")
	private int anInt6041 = 0;

	@OriginalMember(owner = "client!vn", name = "v", descriptor = "I")
	private int anInt6039 = 0;

	@OriginalMember(owner = "client!vn", name = "B", descriptor = "[Lclient!cv;")
	private final Class1_Sub9[] aClass1_Sub9Array5 = new Class1_Sub9[8];

	@OriginalMember(owner = "client!vn", name = "D", descriptor = "J")
	private long aLong200 = 0L;

	@OriginalMember(owner = "client!vn", name = "x", descriptor = "J")
	private long aLong199 = 0L;

	@OriginalMember(owner = "client!vn", name = "y", descriptor = "Z")
	private boolean aBoolean534 = true;

	@OriginalMember(owner = "client!vn", name = "E", descriptor = "I")
	private int anInt6044 = 0;

	@OriginalMember(owner = "client!vn", name = "G", descriptor = "I")
	private int anInt6045 = 0;

	@OriginalMember(owner = "client!vn", name = "F", descriptor = "[Lclient!cv;")
	private final Class1_Sub9[] aClass1_Sub9Array6 = new Class1_Sub9[8];

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "()I")
	protected int method4845() throws Exception {
		return this.anInt6043;
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(ILclient!cv;)V")
	public final synchronized void method4846(@OriginalArg(1) Class1_Sub9 arg0) {
		this.aClass1_Sub9_7 = arg0;
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "([II)V")
	private void method4847(@OriginalArg(0) int[] arg0) {
		@Pc(1) short local1 = 256;
		if (Static167.aBoolean276) {
			local1 = 512;
		}
		Static471.method3063(arg0, 0, local1);
		this.anInt6039 -= 256;
		if (this.aClass1_Sub9_7 != null && this.anInt6039 <= 0) {
			this.anInt6039 += Static234.anInt4244 >> 4;
			Static150.method3719(this.aClass1_Sub9_7);
			this.method4856(this.aClass1_Sub9_7, this.aClass1_Sub9_7.method5010());
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
						@Pc(88) Class1_Sub9 local88 = null;
						@Pc(93) Class1_Sub9 local93 = this.aClass1_Sub9Array6[local56];
						label97: while (true) {
							while (true) {
								if (local93 == null) {
									break label97;
								}
								@Pc(97) Class1_Sub8 local97 = local93.aClass1_Sub8_5;
								if (local97 == null || local97.anInt752 <= local61) {
									local93.aBoolean550 = true;
									@Pc(121) int local121 = local93.method5011();
									local45 += local121;
									if (local97 != null) {
										local97.anInt752 += local121;
									}
									if (local45 >= this.anInt6024) {
										break label103;
									}
									@Pc(140) Class1_Sub9 local140 = local93.method5013();
									if (local140 != null) {
										@Pc(145) int local145 = local93.anInt6256;
										while (local140 != null) {
											this.method4856(local140, local145 * local140.method5010() >> 8);
											local140 = local93.method5014();
										}
									}
									@Pc(164) Class1_Sub9 local164 = local93.aClass1_Sub9_8;
									local93.aClass1_Sub9_8 = null;
									if (local88 == null) {
										this.aClass1_Sub9Array6[local56] = local164;
									} else {
										local88.aClass1_Sub9_8 = local164;
									}
									if (local164 == null) {
										this.aClass1_Sub9Array5[local56] = local88;
									}
									local93 = local164;
								} else {
									local47 |= 0x1 << local56;
									local88 = local93;
									local93 = local93.aClass1_Sub9_8;
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
				@Pc(207) Class1_Sub9 local207 = this.aClass1_Sub9Array6[local56];
				this.aClass1_Sub9Array6[local56] = this.aClass1_Sub9Array5[local56] = null;
				while (local207 != null) {
					@Pc(221) Class1_Sub9 local221 = local207.aClass1_Sub9_8;
					local207.aClass1_Sub9_8 = null;
					local207 = local221;
				}
			}
		}
		if (this.anInt6039 < 0) {
			this.anInt6039 = 0;
		}
		if (this.aClass1_Sub9_7 != null) {
			this.aClass1_Sub9_7.method5012(arg0, 0, 256);
		}
		this.aLong198 = Static183.method2674();
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(Ljava/awt/Component;)V")
	public void method4848(@OriginalArg(0) Component arg0) throws Exception {
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(I)V")
	public final synchronized void method4849() {
		if (Static355.aClass175_1 != null) {
			@Pc(5) boolean local5 = true;
			for (@Pc(7) int local7 = 0; local7 < 2; local7++) {
				if (Static355.aClass175_1.aClass101Array1[local7] == this) {
					Static355.aClass175_1.aClass101Array1[local7] = null;
				}
				if (Static355.aClass175_1.aClass101Array1[local7] != null) {
					local5 = false;
				}
			}
			if (local5) {
				Static355.aClass175_1.aBoolean435 = true;
				while (Static355.aClass175_1.aBoolean434) {
					Static331.method4343(50L);
				}
				Static355.aClass175_1 = null;
			}
		}
		this.method4858();
		this.aBoolean532 = true;
		this.anIntArray454 = null;
	}

	@OriginalMember(owner = "client!vn", name = "b", descriptor = "()V")
	protected void method4850() throws Exception {
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(IB)V")
	private void method4851() {
		this.anInt6039 -= 256;
		if (this.anInt6039 < 0) {
			this.anInt6039 = 0;
		}
		if (this.aClass1_Sub9_7 != null) {
			this.aClass1_Sub9_7.method5016(256);
		}
	}

	@OriginalMember(owner = "client!vn", name = "b", descriptor = "(I)V")
	public final synchronized void method4852() {
		this.aBoolean534 = true;
		try {
			this.method4850();
		} catch (@Pc(16) Exception local16) {
			this.method4858();
			this.aLong200 = Static183.method2674() + 2000L;
		}
	}

	@OriginalMember(owner = "client!vn", name = "c", descriptor = "()V")
	protected void method4853() throws Exception {
	}

	@OriginalMember(owner = "client!vn", name = "c", descriptor = "(I)V")
	public void method4854(@OriginalArg(0) int arg0) throws Exception {
	}

	@OriginalMember(owner = "client!vn", name = "d", descriptor = "(I)V")
	public final synchronized void method4855() {
		if (this.aBoolean532) {
			return;
		}
		@Pc(12) long local12 = Static183.method2674();
		try {
			if (this.aLong198 + 500000L < local12) {
				this.aLong198 = local12 - 500000L;
			}
			while (this.aLong198 + 5000L < local12) {
				this.method4851();
				this.aLong198 += 256000 / Static234.anInt4244;
			}
		} catch (@Pc(52) Exception local52) {
			this.aLong198 = local12;
		}
		if (this.anIntArray454 == null) {
			return;
		}
		try {
			if (this.aLong200 != 0L) {
				if (this.aLong200 > local12) {
					return;
				}
				this.method4854(this.anInt6043);
				this.aBoolean534 = true;
				this.aLong200 = 0L;
			}
			@Pc(89) int local89 = this.method4845();
			if (this.anInt6044 < this.anInt6045 - local89) {
				this.anInt6044 = this.anInt6045 - local89;
			}
			@Pc(121) int local121 = this.anInt6040 + this.anInt6038;
			if (local121 + 256 > 16384) {
				local121 = 16128;
			}
			if (this.anInt6043 < local121 + 256) {
				this.anInt6043 += 1024;
				if (this.anInt6043 > 16384) {
					this.anInt6043 = 16384;
				}
				this.method4858();
				this.method4854(this.anInt6043);
				local89 = 0;
				this.aBoolean534 = true;
				if (this.anInt6043 < local121 + 256) {
					local121 = this.anInt6043 - 256;
					this.anInt6040 = local121 - this.anInt6038;
				}
			}
			while (local89 < local121) {
				this.method4847(this.anIntArray454);
				this.method4853();
				local89 += 256;
			}
			if (this.aLong199 < local12) {
				if (this.aBoolean534) {
					this.aBoolean534 = false;
				} else if (this.anInt6044 == 0 && this.anInt6041 == 0) {
					this.method4858();
					this.aLong200 = local12 + 2000L;
					return;
				} else {
					this.anInt6040 = Math.min(this.anInt6041, this.anInt6044);
					this.anInt6041 = this.anInt6044;
				}
				this.anInt6044 = 0;
				this.aLong199 = local12 + 2000L;
			}
			this.anInt6045 = local89;
		} catch (@Pc(253) Exception local253) {
			this.method4858();
			this.aLong200 = local12 + 2000L;
		}
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(Lclient!cv;ZI)V")
	private void method4856(@OriginalArg(0) Class1_Sub9 arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = arg1 >> 5;
		@Pc(12) Class1_Sub9 local12 = this.aClass1_Sub9Array5[local7];
		if (local12 == null) {
			this.aClass1_Sub9Array6[local7] = arg0;
		} else {
			local12.aClass1_Sub9_8 = arg0;
		}
		this.aClass1_Sub9Array5[local7] = arg0;
		arg0.anInt6256 = arg1;
	}

	@OriginalMember(owner = "client!vn", name = "d", descriptor = "()V")
	protected void method4858() {
	}
}
