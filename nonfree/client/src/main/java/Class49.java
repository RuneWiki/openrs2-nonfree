import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ln")
public class Class49 {

	@OriginalMember(owner = "client!ln", name = "c", descriptor = "Lclient!ti;")
	private Class4_Sub15 aClass4_Sub15_5;

	@OriginalMember(owner = "client!ln", name = "q", descriptor = "[I")
	public int[] anIntArray162;

	@OriginalMember(owner = "client!ln", name = "x", descriptor = "I")
	private int anInt2443;

	@OriginalMember(owner = "client!ln", name = "z", descriptor = "I")
	public int anInt2445;

	@OriginalMember(owner = "client!ln", name = "B", descriptor = "I")
	public int anInt2446;

	@OriginalMember(owner = "client!ln", name = "d", descriptor = "I")
	private final int anInt2429 = 32;

	@OriginalMember(owner = "client!ln", name = "e", descriptor = "Z")
	private boolean aBoolean226 = false;

	@OriginalMember(owner = "client!ln", name = "h", descriptor = "J")
	private long aLong78 = Static282.method3962();

	@OriginalMember(owner = "client!ln", name = "w", descriptor = "I")
	private int anInt2442 = 0;

	@OriginalMember(owner = "client!ln", name = "A", descriptor = "[Lclient!ti;")
	private final Class4_Sub15[] aClass4_Sub15Array5 = new Class4_Sub15[8];

	@OriginalMember(owner = "client!ln", name = "C", descriptor = "J")
	private long aLong79 = 0L;

	@OriginalMember(owner = "client!ln", name = "D", descriptor = "Z")
	private boolean aBoolean227 = true;

	@OriginalMember(owner = "client!ln", name = "y", descriptor = "I")
	private int anInt2444 = 0;

	@OriginalMember(owner = "client!ln", name = "E", descriptor = "I")
	private int anInt2447 = 0;

	@OriginalMember(owner = "client!ln", name = "G", descriptor = "[Lclient!ti;")
	private final Class4_Sub15[] aClass4_Sub15Array6 = new Class4_Sub15[8];

	@OriginalMember(owner = "client!ln", name = "F", descriptor = "J")
	private long aLong80 = 0L;

	@OriginalMember(owner = "client!ln", name = "H", descriptor = "I")
	private int anInt2448 = 0;

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(II)V")
	private void method2062() {
		this.anInt2444 -= 256;
		if (this.anInt2444 < 0) {
			this.anInt2444 = 0;
		}
		if (this.aClass4_Sub15_5 != null) {
			this.aClass4_Sub15_5.method4861(256);
		}
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(I)V")
	public final synchronized void method2064() {
		this.aBoolean227 = true;
		try {
			this.method2072();
		} catch (@Pc(10) Exception local10) {
			this.method2071();
			this.aLong80 = Static282.method3962() + 2000L;
		}
	}

	@OriginalMember(owner = "client!ln", name = "b", descriptor = "(I)V")
	public void method2065(@OriginalArg(0) int arg0) throws Exception {
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(Ljava/awt/Component;)V")
	public void method2066(@OriginalArg(0) Component arg0) throws Exception {
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "()I")
	protected int method2067() throws Exception {
		return this.anInt2445;
	}

	@OriginalMember(owner = "client!ln", name = "c", descriptor = "(I)V")
	public final synchronized void method2069() {
		if (this.aBoolean226) {
			return;
		}
		@Pc(14) long local14 = Static282.method3962();
		try {
			if (local14 > this.aLong78 + 500000L) {
				this.aLong78 = local14 - 500000L;
			}
			while (this.aLong78 + 5000L < local14) {
				this.method2062();
				this.aLong78 += 256000 / Static261.anInt4928;
			}
		} catch (@Pc(58) Exception local58) {
			this.aLong78 = local14;
		}
		if (this.anIntArray162 == null) {
			return;
		}
		try {
			if ((long) 0 != this.aLong80) {
				if (local14 < this.aLong80) {
					return;
				}
				this.method2065(this.anInt2445);
				this.aLong80 = 0L;
				this.aBoolean227 = true;
			}
			@Pc(94) int local94 = this.method2067();
			if (this.anInt2442 < this.anInt2447 - local94) {
				this.anInt2442 = this.anInt2447 - local94;
			}
			@Pc(115) int local115 = this.anInt2446 + this.anInt2443;
			if (local115 + 256 > 16384) {
				local115 = 16128;
			}
			if (this.anInt2445 < local115 + 256) {
				this.anInt2445 += 1024;
				if (this.anInt2445 > 16384) {
					this.anInt2445 = 16384;
				}
				this.method2071();
				this.method2065(this.anInt2445);
				local94 = 0;
				this.aBoolean227 = true;
				if (this.anInt2445 < local115 + 256) {
					local115 = this.anInt2445 - 256;
					this.anInt2443 = local115 - this.anInt2446;
				}
			}
			while (local94 < local115) {
				this.method2076(this.anIntArray162);
				this.method2073();
				local94 += 256;
			}
			if (this.aLong79 < local14) {
				if (this.aBoolean227) {
					this.aBoolean227 = false;
				} else if (this.anInt2442 == 0 && this.anInt2448 == 0) {
					this.method2071();
					this.aLong80 = local14 + 2000L;
					return;
				} else {
					this.anInt2443 = Math.min(this.anInt2448, this.anInt2442);
					this.anInt2448 = this.anInt2442;
				}
				this.aLong79 = local14 + 2000L;
				this.anInt2442 = 0;
			}
			this.anInt2447 = local94;
		} catch (@Pc(245) Exception local245) {
			this.method2071();
			this.aLong80 = local14 + 2000L;
		}
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(Lclient!ti;B)V")
	public final synchronized void method2070(@OriginalArg(0) Class4_Sub15 arg0) {
		this.aClass4_Sub15_5 = arg0;
	}

	@OriginalMember(owner = "client!ln", name = "b", descriptor = "()V")
	protected void method2071() {
	}

	@OriginalMember(owner = "client!ln", name = "c", descriptor = "()V")
	protected void method2072() throws Exception {
	}

	@OriginalMember(owner = "client!ln", name = "d", descriptor = "()V")
	protected void method2073() throws Exception {
	}

	@OriginalMember(owner = "client!ln", name = "d", descriptor = "(I)V")
	public final synchronized void method2074() {
		if (Static62.aClass227_1 != null) {
			@Pc(15) boolean local15 = true;
			for (@Pc(17) int local17 = 0; local17 < 2; local17++) {
				if (Static62.aClass227_1.aClass49Array1[local17] == this) {
					Static62.aClass227_1.aClass49Array1[local17] = null;
				}
				if (Static62.aClass227_1.aClass49Array1[local17] != null) {
					local15 = false;
				}
			}
			if (local15) {
				Static62.aClass227_1.aBoolean589 = true;
				while (Static62.aClass227_1.aBoolean590) {
					Static435.method5503(50L);
				}
				Static62.aClass227_1 = null;
			}
		}
		this.method2071();
		this.anIntArray162 = null;
		this.aBoolean226 = true;
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(IILclient!ti;)V")
	private void method2075(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub15 arg1) {
		@Pc(7) int local7 = arg0 >> 5;
		@Pc(12) Class4_Sub15 local12 = this.aClass4_Sub15Array5[local7];
		if (local12 == null) {
			this.aClass4_Sub15Array6[local7] = arg1;
		} else {
			local12.aClass4_Sub15_8 = arg1;
		}
		this.aClass4_Sub15Array5[local7] = arg1;
		arg1.anInt6248 = arg0;
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "([II)V")
	private void method2076(@OriginalArg(0) int[] arg0) {
		@Pc(1) short local1 = 256;
		if (Static422.aBoolean649) {
			local1 = 512;
		}
		Static459.method3326(arg0, 0, local1);
		this.anInt2444 -= 256;
		if (this.aClass4_Sub15_5 != null && this.anInt2444 <= 0) {
			this.anInt2444 += Static261.anInt4928 >> 4;
			Static239.method3547(this.aClass4_Sub15_5);
			this.method2075(this.aClass4_Sub15_5.method4856(), this.aClass4_Sub15_5);
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
						@Pc(88) Class4_Sub15 local88 = null;
						@Pc(93) Class4_Sub15 local93 = this.aClass4_Sub15Array6[local56];
						label97: while (true) {
							while (true) {
								if (local93 == null) {
									break label97;
								}
								@Pc(97) Class4_Sub4 local97 = local93.aClass4_Sub4_5;
								if (local97 == null || local97.anInt3724 <= local61) {
									local93.aBoolean569 = true;
									@Pc(121) int local121 = local93.method4859();
									local45 += local121;
									if (local97 != null) {
										local97.anInt3724 += local121;
									}
									if (local45 >= this.anInt2429) {
										break label103;
									}
									@Pc(140) Class4_Sub15 local140 = local93.method4860();
									if (local140 != null) {
										@Pc(145) int local145 = local93.anInt6248;
										while (local140 != null) {
											this.method2075(local145 * local140.method4856() >> 8, local140);
											local140 = local93.method4857();
										}
									}
									@Pc(164) Class4_Sub15 local164 = local93.aClass4_Sub15_8;
									local93.aClass4_Sub15_8 = null;
									if (local88 == null) {
										this.aClass4_Sub15Array6[local56] = local164;
									} else {
										local88.aClass4_Sub15_8 = local164;
									}
									if (local164 == null) {
										this.aClass4_Sub15Array5[local56] = local88;
									}
									local93 = local164;
								} else {
									local47 |= 0x1 << local56;
									local88 = local93;
									local93 = local93.aClass4_Sub15_8;
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
				@Pc(207) Class4_Sub15 local207 = this.aClass4_Sub15Array6[local56];
				this.aClass4_Sub15Array6[local56] = this.aClass4_Sub15Array5[local56] = null;
				while (local207 != null) {
					@Pc(221) Class4_Sub15 local221 = local207.aClass4_Sub15_8;
					local207.aClass4_Sub15_8 = null;
					local207 = local221;
				}
			}
		}
		if (this.anInt2444 < 0) {
			this.anInt2444 = 0;
		}
		if (this.aClass4_Sub15_5 != null) {
			this.aClass4_Sub15_5.method4855(arg0, 0, 256);
		}
		this.aLong78 = Static282.method3962();
	}

	@OriginalMember(owner = "client!ln", name = "c", descriptor = "(B)V")
	public final void method2077() {
		this.aBoolean227 = true;
	}
}
