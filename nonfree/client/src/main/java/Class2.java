import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ta")
public class Class2 {

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "[I")
	public int[] anIntArray253;

	@OriginalMember(owner = "client!ta", name = "k", descriptor = "Lclient!qh;")
	private Class1_Sub8 aClass1_Sub8_5;

	@OriginalMember(owner = "client!ta", name = "C", descriptor = "I")
	public int anInt2679;

	@OriginalMember(owner = "client!ta", name = "I", descriptor = "I")
	public int anInt2683;

	@OriginalMember(owner = "client!ta", name = "J", descriptor = "I")
	private int anInt2684;

	@OriginalMember(owner = "client!ta", name = "r", descriptor = "I")
	private final int anInt2672 = 32;

	@OriginalMember(owner = "client!ta", name = "d", descriptor = "J")
	private long aLong81 = Static143.method2807();

	@OriginalMember(owner = "client!ta", name = "y", descriptor = "Z")
	private boolean aBoolean106 = true;

	@OriginalMember(owner = "client!ta", name = "A", descriptor = "I")
	private int anInt2678 = 0;

	@OriginalMember(owner = "client!ta", name = "B", descriptor = "J")
	private long aLong83 = 0L;

	@OriginalMember(owner = "client!ta", name = "F", descriptor = "[Lclient!qh;")
	private final Class1_Sub8[] aClass1_Sub8Array5 = new Class1_Sub8[8];

	@OriginalMember(owner = "client!ta", name = "E", descriptor = "I")
	private int anInt2681 = 0;

	@OriginalMember(owner = "client!ta", name = "z", descriptor = "J")
	private long aLong82 = 0L;

	@OriginalMember(owner = "client!ta", name = "G", descriptor = "I")
	private int anInt2682 = 0;

	@OriginalMember(owner = "client!ta", name = "H", descriptor = "[Lclient!qh;")
	private final Class1_Sub8[] aClass1_Sub8Array6 = new Class1_Sub8[8];

	@OriginalMember(owner = "client!ta", name = "D", descriptor = "I")
	private int anInt2680 = 0;

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(I)V")
	public final synchronized void method1972() {
		if (Static67.aClass15_1 != null) {
			@Pc(5) boolean local5 = true;
			for (@Pc(7) int local7 = 0; local7 < 2; local7++) {
				if (Static67.aClass15_1.aClass2Array1[local7] == this) {
					Static67.aClass15_1.aClass2Array1[local7] = null;
				}
				if (Static67.aClass15_1.aClass2Array1[local7] != null) {
					local5 = false;
				}
			}
			if (local5) {
				Static67.aClass15_1.aBoolean44 = true;
				while (Static67.aClass15_1.aBoolean45) {
					Static24.method517(50L);
				}
				Static67.aClass15_1 = null;
			}
		}
		this.method1978();
		this.anIntArray253 = null;
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "()V")
	protected void method1973() throws Exception {
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(II)V")
	private void method1974() {
		this.anInt2682 -= 256;
		if (this.anInt2682 < 0) {
			this.anInt2682 = 0;
		}
		if (this.aClass1_Sub8_5 != null) {
			this.aClass1_Sub8_5.method2943(256);
		}
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(ILclient!qh;I)V")
	private void method1976(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub8 arg1) {
		@Pc(3) int local3 = arg0 >> 5;
		@Pc(8) Class1_Sub8 local8 = this.aClass1_Sub8Array6[local3];
		if (local8 == null) {
			this.aClass1_Sub8Array5[local3] = arg1;
		} else {
			local8.aClass1_Sub8_8 = arg1;
		}
		this.aClass1_Sub8Array6[local3] = arg1;
		arg1.anInt3931 = arg0;
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(Z)V")
	public final void method1977() {
		this.aBoolean106 = true;
	}

	@OriginalMember(owner = "client!ta", name = "b", descriptor = "()V")
	protected void method1978() {
	}

	@OriginalMember(owner = "client!ta", name = "c", descriptor = "(I)V")
	public final synchronized void method1979() {
		this.aBoolean106 = true;
		try {
			this.method1973();
		} catch (@Pc(14) Exception local14) {
			this.method1978();
			this.aLong82 = Static143.method2807() + 2000L;
		}
	}

	@OriginalMember(owner = "client!ta", name = "b", descriptor = "(Z)V")
	public final synchronized void method1980() {
		if (this.anIntArray253 == null) {
			return;
		}
		@Pc(12) long local12 = Static143.method2807();
		try {
			if (this.aLong82 != 0L) {
				if (local12 < this.aLong82) {
					return;
				}
				this.method1983(this.anInt2679);
				this.aLong82 = 0L;
				this.aBoolean106 = true;
			}
			@Pc(42) int local42 = this.method1982();
			if (this.anInt2681 - local42 > this.anInt2680) {
				this.anInt2680 = this.anInt2681 - local42;
			}
			@Pc(62) int local62 = this.anInt2684 + this.anInt2683;
			if (local62 + 256 > 16384) {
				local62 = 16128;
			}
			if (local62 + 256 > this.anInt2679) {
				this.anInt2679 += 1024;
				if (this.anInt2679 > 16384) {
					this.anInt2679 = 16384;
				}
				this.method1978();
				local42 = 0;
				this.method1983(this.anInt2679);
				this.aBoolean106 = true;
				if (this.anInt2679 < local62 + 256) {
					local62 = this.anInt2679 - 256;
					this.anInt2684 = local62 - this.anInt2683;
				}
			}
			while (local62 > local42) {
				local42 += 256;
				this.method1986(this.anIntArray253);
				this.method1987();
			}
			if (this.aLong83 < local12) {
				if (this.aBoolean106) {
					this.aBoolean106 = false;
				} else if (this.anInt2680 == 0 && this.anInt2678 == 0) {
					this.method1978();
					this.aLong82 = local12 + 2000L;
					return;
				} else {
					this.anInt2684 = Math.min(this.anInt2678, this.anInt2680);
					this.anInt2678 = this.anInt2680;
				}
				this.anInt2680 = 0;
				this.aLong83 = local12 + 2000L;
			}
			this.anInt2681 = local42;
		} catch (@Pc(193) Exception local193) {
			this.method1978();
			this.aLong82 = local12 + 2000L;
		}
		try {
			if (this.aLong81 + 500000L < local12) {
				local12 = this.aLong81;
			}
			while (local12 > this.aLong81 + 5000L) {
				this.method1974();
				this.aLong81 += 256000 / Static166.anInt4307;
			}
		} catch (@Pc(234) Exception local234) {
			this.aLong81 = local12;
		}
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(Lclient!qh;I)V")
	public final synchronized void method1981(@OriginalArg(0) Class1_Sub8 arg0) {
		this.aClass1_Sub8_5 = arg0;
	}

	@OriginalMember(owner = "client!ta", name = "c", descriptor = "()I")
	protected int method1982() throws Exception {
		return this.anInt2679;
	}

	@OriginalMember(owner = "client!ta", name = "d", descriptor = "(I)V")
	public void method1983(@OriginalArg(0) int arg0) throws Exception {
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(Ljava/awt/Component;)V")
	public void method1985(@OriginalArg(0) Component arg0) throws Exception {
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "([II)V")
	private void method1986(@OriginalArg(0) int[] arg0) {
		@Pc(1) short local1 = 256;
		if (Static9.aBoolean13) {
			local1 = 512;
		}
		Static188.method2303(arg0, 0, local1);
		this.anInt2682 -= 256;
		if (this.aClass1_Sub8_5 != null && this.anInt2682 <= 0) {
			this.anInt2682 += Static166.anInt4307 >> 4;
			Static104.method2190(this.aClass1_Sub8_5);
			this.method1976(this.aClass1_Sub8_5.method2940(), this.aClass1_Sub8_5);
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
						@Pc(88) Class1_Sub8 local88 = null;
						@Pc(93) Class1_Sub8 local93 = this.aClass1_Sub8Array5[local56];
						label97: while (true) {
							while (true) {
								if (local93 == null) {
									break label97;
								}
								@Pc(97) Class1_Sub20 local97 = local93.aClass1_Sub20_5;
								if (local97 == null || local97.anInt3735 <= local61) {
									local93.aBoolean147 = true;
									@Pc(121) int local121 = local93.method2938();
									local45 += local121;
									if (local97 != null) {
										local97.anInt3735 += local121;
									}
									if (local45 >= this.anInt2672) {
										break label103;
									}
									@Pc(140) Class1_Sub8 local140 = local93.method2942();
									if (local140 != null) {
										@Pc(145) int local145 = local93.anInt3931;
										while (local140 != null) {
											this.method1976(local145 * local140.method2940() >> 8, local140);
											local140 = local93.method2937();
										}
									}
									@Pc(164) Class1_Sub8 local164 = local93.aClass1_Sub8_8;
									local93.aClass1_Sub8_8 = null;
									if (local88 == null) {
										this.aClass1_Sub8Array5[local56] = local164;
									} else {
										local88.aClass1_Sub8_8 = local164;
									}
									if (local164 == null) {
										this.aClass1_Sub8Array6[local56] = local88;
									}
									local93 = local164;
								} else {
									local47 |= 0x1 << local56;
									local88 = local93;
									local93 = local93.aClass1_Sub8_8;
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
				@Pc(207) Class1_Sub8 local207 = this.aClass1_Sub8Array5[local56];
				this.aClass1_Sub8Array5[local56] = this.aClass1_Sub8Array6[local56] = null;
				while (local207 != null) {
					@Pc(221) Class1_Sub8 local221 = local207.aClass1_Sub8_8;
					local207.aClass1_Sub8_8 = null;
					local207 = local221;
				}
			}
		}
		if (this.anInt2682 < 0) {
			this.anInt2682 = 0;
		}
		if (this.aClass1_Sub8_5 != null) {
			this.aClass1_Sub8_5.method2941(arg0, 0, 256);
		}
		this.aLong81 = Static143.method2807();
	}

	@OriginalMember(owner = "client!ta", name = "d", descriptor = "()V")
	protected void method1987() throws Exception {
	}
}
