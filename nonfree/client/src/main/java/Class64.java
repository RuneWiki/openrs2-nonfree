import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nj")
public class Class64 {

	@OriginalMember(owner = "client!nj", name = "d", descriptor = "Lclient!oia;")
	private Class4_Sub3 aClass4_Sub3_5;

	@OriginalMember(owner = "client!nj", name = "i", descriptor = "[I")
	public int[] anIntArray157;

	@OriginalMember(owner = "client!nj", name = "x", descriptor = "I")
	public int anInt2328;

	@OriginalMember(owner = "client!nj", name = "B", descriptor = "I")
	private int anInt2330;

	@OriginalMember(owner = "client!nj", name = "I", descriptor = "I")
	public int anInt2334;

	@OriginalMember(owner = "client!nj", name = "b", descriptor = "I")
	private final int anInt2311 = 32;

	@OriginalMember(owner = "client!nj", name = "j", descriptor = "Z")
	private boolean aBoolean158 = false;

	@OriginalMember(owner = "client!nj", name = "v", descriptor = "J")
	private long aLong79 = Static429.method5935();

	@OriginalMember(owner = "client!nj", name = "C", descriptor = "I")
	private int anInt2331 = 0;

	@OriginalMember(owner = "client!nj", name = "F", descriptor = "J")
	private long aLong81 = 0L;

	@OriginalMember(owner = "client!nj", name = "A", descriptor = "[Lclient!oia;")
	private final Class4_Sub3[] aClass4_Sub3Array5 = new Class4_Sub3[8];

	@OriginalMember(owner = "client!nj", name = "D", descriptor = "I")
	private int anInt2332 = 0;

	@OriginalMember(owner = "client!nj", name = "G", descriptor = "[Lclient!oia;")
	private final Class4_Sub3[] aClass4_Sub3Array6 = new Class4_Sub3[8];

	@OriginalMember(owner = "client!nj", name = "z", descriptor = "J")
	private long aLong80 = 0L;

	@OriginalMember(owner = "client!nj", name = "E", descriptor = "I")
	private int anInt2333 = 0;

	@OriginalMember(owner = "client!nj", name = "y", descriptor = "I")
	private int anInt2329 = 0;

	@OriginalMember(owner = "client!nj", name = "H", descriptor = "Z")
	private boolean aBoolean159 = true;

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(ZLclient!oia;)V")
	public final synchronized void method2207(@OriginalArg(1) Class4_Sub3 arg0) {
		this.aClass4_Sub3_5 = arg0;
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(I)V")
	public final synchronized void method2209() {
		if (this.aBoolean158) {
			return;
		}
		@Pc(12) long local12 = Static429.method5935();
		try {
			if (this.aLong79 + 6000L < local12) {
				this.aLong79 = local12 - 6000L;
			}
			while (this.aLong79 + 5000L < local12) {
				this.method2224();
				this.aLong79 += (long) (256000 / Static434.anInt6851);
				local12 = Static429.method5935();
			}
		} catch (@Pc(55) Exception local55) {
			this.aLong79 = local12;
		}
		if (this.anIntArray157 == null) {
			return;
		}
		try {
			if (this.aLong80 != 0L) {
				if (this.aLong80 > local12) {
					return;
				}
				this.method2215(this.anInt2334);
				this.aBoolean159 = true;
				this.aLong80 = 0L;
			}
			@Pc(96) int local96 = this.method2210();
			if (this.anInt2332 - local96 > this.anInt2331) {
				this.anInt2331 = this.anInt2332 - local96;
			}
			@Pc(118) int local118 = this.anInt2328 + this.anInt2330;
			if (local118 + 256 > 16384) {
				local118 = 16128;
			}
			if (this.anInt2334 < local118 + 256) {
				this.anInt2334 += 1024;
				if (this.anInt2334 > 16384) {
					this.anInt2334 = 16384;
				}
				this.method2211();
				this.method2215(this.anInt2334);
				local96 = 0;
				if (this.anInt2334 < local118 + 256) {
					local118 = this.anInt2334 - 256;
					this.anInt2330 = local118 - this.anInt2328;
				}
				this.aBoolean159 = true;
			}
			while (local118 > local96) {
				this.method2219(this.anIntArray157);
				this.method2217();
				local96 += 256;
			}
			if (local12 > this.aLong81) {
				if (this.aBoolean159) {
					this.aBoolean159 = false;
				} else if (this.anInt2331 == 0 && this.anInt2333 == 0) {
					this.method2211();
					this.aLong80 = local12 + 2000L;
					return;
				} else {
					this.anInt2330 = Math.min(this.anInt2333, this.anInt2331);
					this.anInt2333 = this.anInt2331;
				}
				this.anInt2331 = 0;
				this.aLong81 = local12 + 2000L;
			}
			this.anInt2332 = local96;
		} catch (@Pc(244) Exception local244) {
			this.method2211();
			this.aLong80 = local12 + 2000L;
		}
	}

	@OriginalMember(owner = "client!nj", name = "b", descriptor = "()I")
	protected int method2210() throws Exception {
		return this.anInt2334;
	}

	@OriginalMember(owner = "client!nj", name = "c", descriptor = "()V")
	protected void method2211() {
	}

	@OriginalMember(owner = "client!nj", name = "b", descriptor = "(I)V")
	public final synchronized void method2212() {
		this.aBoolean159 = true;
		try {
			this.method2218();
		} catch (@Pc(18) Exception local18) {
			this.method2211();
			this.aLong80 = Static429.method5935() + 2000L;
		}
	}

	@OriginalMember(owner = "client!nj", name = "c", descriptor = "(I)V")
	public final synchronized void method2213() {
		if (Static115.aClass58_1 != null) {
			@Pc(13) boolean local13 = true;
			for (@Pc(15) int local15 = 0; local15 < 2; local15++) {
				if (Static115.aClass58_1.aClass64Array1[local15] == this) {
					Static115.aClass58_1.aClass64Array1[local15] = null;
				}
				if (Static115.aClass58_1.aClass64Array1[local15] != null) {
					local13 = false;
				}
			}
			if (local13) {
				Static115.aClass58_1.aBoolean119 = true;
				while (Static115.aClass58_1.aBoolean120) {
					Static491.method6679(50L);
				}
				Static115.aClass58_1 = null;
			}
		}
		this.method2211();
		this.anIntArray157 = null;
		this.aBoolean158 = true;
	}

	@OriginalMember(owner = "client!nj", name = "d", descriptor = "(I)V")
	public void method2215(@OriginalArg(0) int arg0) throws Exception {
	}

	@OriginalMember(owner = "client!nj", name = "d", descriptor = "()V")
	protected void method2217() throws Exception {
	}

	@OriginalMember(owner = "client!nj", name = "e", descriptor = "()V")
	protected void method2218() throws Exception {
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "([II)V")
	private void method2219(@OriginalArg(0) int[] arg0) {
		@Pc(1) short local1 = 256;
		if (Static157.aBoolean213) {
			local1 = 512;
		}
		Static685.method6462(arg0, 0, local1);
		this.anInt2329 -= 256;
		if (this.aClass4_Sub3_5 != null && this.anInt2329 <= 0) {
			this.anInt2329 += Static434.anInt6851 >> 4;
			Static105.method2066(this.aClass4_Sub3_5);
			this.method2222(this.aClass4_Sub3_5, this.aClass4_Sub3_5.method7717());
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
						@Pc(88) Class4_Sub3 local88 = null;
						@Pc(93) Class4_Sub3 local93 = this.aClass4_Sub3Array5[local56];
						label97: while (true) {
							while (true) {
								if (local93 == null) {
									break label97;
								}
								@Pc(97) Class4_Sub4 local97 = local93.aClass4_Sub4_6;
								if (local97 == null || local97.anInt191 <= local61) {
									local93.aBoolean714 = true;
									@Pc(121) int local121 = local93.method7714();
									local45 += local121;
									if (local97 != null) {
										local97.anInt191 += local121;
									}
									if (local45 >= this.anInt2311) {
										break label103;
									}
									@Pc(140) Class4_Sub3 local140 = local93.method7719();
									if (local140 != null) {
										@Pc(145) int local145 = local93.anInt9036;
										while (local140 != null) {
											this.method2222(local140, local145 * local140.method7717() >> 8);
											local140 = local93.method7720();
										}
									}
									@Pc(164) Class4_Sub3 local164 = local93.aClass4_Sub3_9;
									local93.aClass4_Sub3_9 = null;
									if (local88 == null) {
										this.aClass4_Sub3Array5[local56] = local164;
									} else {
										local88.aClass4_Sub3_9 = local164;
									}
									if (local164 == null) {
										this.aClass4_Sub3Array6[local56] = local88;
									}
									local93 = local164;
								} else {
									local47 |= 0x1 << local56;
									local88 = local93;
									local93 = local93.aClass4_Sub3_9;
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
				@Pc(207) Class4_Sub3 local207 = this.aClass4_Sub3Array5[local56];
				this.aClass4_Sub3Array5[local56] = this.aClass4_Sub3Array6[local56] = null;
				while (local207 != null) {
					@Pc(221) Class4_Sub3 local221 = local207.aClass4_Sub3_9;
					local207.aClass4_Sub3_9 = null;
					local207 = local221;
				}
			}
		}
		if (this.anInt2329 < 0) {
			this.anInt2329 = 0;
		}
		if (this.aClass4_Sub3_5 != null) {
			this.aClass4_Sub3_5.method7718(arg0, 0, 256);
		}
		this.aLong79 = Static429.method5935();
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(Ljava/awt/Component;)V")
	public void method2221(@OriginalArg(0) Component arg0) throws Exception {
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(Lclient!oia;II)V")
	private void method2222(@OriginalArg(0) Class4_Sub3 arg0, @OriginalArg(1) int arg1) {
		@Pc(13) int local13 = arg1 >> 5;
		@Pc(18) Class4_Sub3 local18 = this.aClass4_Sub3Array6[local13];
		if (local18 == null) {
			this.aClass4_Sub3Array5[local13] = arg0;
		} else {
			local18.aClass4_Sub3_9 = arg0;
		}
		this.aClass4_Sub3Array6[local13] = arg0;
		arg0.anInt9036 = arg1;
	}

	@OriginalMember(owner = "client!nj", name = "b", descriptor = "(II)V")
	private void method2224() {
		this.anInt2329 -= 256;
		if (this.anInt2329 < 0) {
			this.anInt2329 = 0;
		}
		if (this.aClass4_Sub3_5 != null) {
			this.aClass4_Sub3_5.method7715(256);
		}
	}
}
