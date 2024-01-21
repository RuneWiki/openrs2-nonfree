import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wg")
public class Class41 {

	@OriginalMember(owner = "client!wg", name = "n", descriptor = "[I")
	public int[] anIntArray174;

	@OriginalMember(owner = "client!wg", name = "o", descriptor = "Lclient!tf;")
	private Class2_Sub10 aClass2_Sub10_5;

	@OriginalMember(owner = "client!wg", name = "v", descriptor = "I")
	private int anInt2306;

	@OriginalMember(owner = "client!wg", name = "x", descriptor = "I")
	public int anInt2307;

	@OriginalMember(owner = "client!wg", name = "L", descriptor = "I")
	public int anInt2316;

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "I")
	private final int anInt2293 = 32;

	@OriginalMember(owner = "client!wg", name = "b", descriptor = "J")
	private long aLong129 = Static70.method1106();

	@OriginalMember(owner = "client!wg", name = "w", descriptor = "J")
	private long aLong130 = 0L;

	@OriginalMember(owner = "client!wg", name = "A", descriptor = "J")
	private long aLong131 = 0L;

	@OriginalMember(owner = "client!wg", name = "E", descriptor = "I")
	private int anInt2311 = 0;

	@OriginalMember(owner = "client!wg", name = "C", descriptor = "I")
	private int anInt2309 = 0;

	@OriginalMember(owner = "client!wg", name = "t", descriptor = "I")
	private int anInt2304 = 0;

	@OriginalMember(owner = "client!wg", name = "B", descriptor = "[Lclient!tf;")
	private final Class2_Sub10[] aClass2_Sub10Array5 = new Class2_Sub10[8];

	@OriginalMember(owner = "client!wg", name = "I", descriptor = "Z")
	private boolean aBoolean90 = true;

	@OriginalMember(owner = "client!wg", name = "K", descriptor = "[Lclient!tf;")
	private final Class2_Sub10[] aClass2_Sub10Array6 = new Class2_Sub10[8];

	@OriginalMember(owner = "client!wg", name = "H", descriptor = "I")
	private int anInt2314 = 0;

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "()V")
	protected void method1506() {
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(I)V")
	public final synchronized void method1507() {
		if (Static17.aClass14_2 != null) {
			@Pc(9) boolean local9 = true;
			for (@Pc(11) int local11 = 0; local11 < 2; local11++) {
				if (Static17.aClass14_2.aClass41Array1[local11] == this) {
					Static17.aClass14_2.aClass41Array1[local11] = null;
				}
				if (Static17.aClass14_2.aClass41Array1[local11] != null) {
					local9 = false;
				}
			}
			if (local9) {
				Static17.aClass14_2.aBoolean19 = true;
				while (Static17.aClass14_2.aBoolean18) {
					Static155.method2675(50L);
				}
				Static17.aClass14_2 = null;
			}
		}
		this.method1506();
		this.anIntArray174 = null;
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(Lclient!tf;I)V")
	public final synchronized void method1508(@OriginalArg(0) Class2_Sub10 arg0) {
		this.aClass2_Sub10_5 = arg0;
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(B)V")
	public final void method1509() {
		this.aBoolean90 = true;
	}

	@OriginalMember(owner = "client!wg", name = "c", descriptor = "(I)V")
	public final synchronized void method1512() {
		if (this.anIntArray174 == null) {
			return;
		}
		@Pc(12) long local12 = Static70.method1106();
		try {
			if (this.aLong130 != 0L) {
				if (local12 < this.aLong130) {
					return;
				}
				this.method1517(this.anInt2307);
				this.aBoolean90 = true;
				this.aLong130 = 0L;
			}
			@Pc(47) int local47 = this.method1520();
			if (this.anInt2314 - local47 > this.anInt2309) {
				this.anInt2309 = this.anInt2314 - local47;
			}
			@Pc(68) int local68 = this.anInt2316 + this.anInt2306;
			if (local68 + 256 > 16384) {
				local68 = 16128;
			}
			if (local68 + 256 > this.anInt2307) {
				this.anInt2307 += 1024;
				if (this.anInt2307 > 16384) {
					this.anInt2307 = 16384;
				}
				local47 = 0;
				this.method1506();
				this.method1517(this.anInt2307);
				if (this.anInt2307 < local68 + 256) {
					local68 = this.anInt2307 - 256;
					this.anInt2306 = local68 - this.anInt2316;
				}
				this.aBoolean90 = true;
			}
			while (local47 < local68) {
				this.method1513(this.anIntArray174);
				this.method1518();
				local47 += 256;
			}
			if (local12 > this.aLong131) {
				if (this.aBoolean90) {
					this.aBoolean90 = false;
				} else if (this.anInt2309 == 0 && this.anInt2304 == 0) {
					this.method1506();
					this.aLong130 = local12 + 2000L;
					return;
				} else {
					this.anInt2306 = Math.min(this.anInt2304, this.anInt2309);
					this.anInt2304 = this.anInt2309;
				}
				this.aLong131 = local12 + 2000L;
				this.anInt2309 = 0;
			}
			this.anInt2314 = local47;
		} catch (@Pc(197) Exception local197) {
			this.method1506();
			this.aLong130 = local12 + 2000L;
		}
		try {
			if (this.aLong129 + 500000L < local12) {
				local12 = this.aLong129;
			}
			while (this.aLong129 + 5000L < local12) {
				this.method1521();
				this.aLong129 += 256000 / Static50.anInt1375;
			}
		} catch (@Pc(238) Exception local238) {
			this.aLong129 = local12;
		}
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "([II)V")
	private void method1513(@OriginalArg(0) int[] arg0) {
		@Pc(1) short local1 = 256;
		if (Static23.aBoolean20) {
			local1 = 512;
		}
		Static184.method164(arg0, 0, local1);
		this.anInt2311 -= 256;
		if (this.aClass2_Sub10_5 != null && this.anInt2311 <= 0) {
			this.anInt2311 += Static50.anInt1375 >> 4;
			Static116.method1861(this.aClass2_Sub10_5);
			this.method1515(this.aClass2_Sub10_5.method2739(), this.aClass2_Sub10_5);
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
						@Pc(88) Class2_Sub10 local88 = null;
						@Pc(93) Class2_Sub10 local93 = this.aClass2_Sub10Array6[local56];
						label97: while (true) {
							while (true) {
								if (local93 == null) {
									break label97;
								}
								@Pc(97) Class2_Sub19 local97 = local93.aClass2_Sub19_5;
								if (local97 == null || local97.anInt3159 <= local61) {
									local93.aBoolean162 = true;
									@Pc(121) int local121 = local93.method2743();
									local45 += local121;
									if (local97 != null) {
										local97.anInt3159 += local121;
									}
									if (local45 >= this.anInt2293) {
										break label103;
									}
									@Pc(140) Class2_Sub10 local140 = local93.method2737();
									if (local140 != null) {
										@Pc(145) int local145 = local93.anInt4053;
										while (local140 != null) {
											this.method1515(local145 * local140.method2739() >> 8, local140);
											local140 = local93.method2738();
										}
									}
									@Pc(164) Class2_Sub10 local164 = local93.aClass2_Sub10_8;
									local93.aClass2_Sub10_8 = null;
									if (local88 == null) {
										this.aClass2_Sub10Array6[local56] = local164;
									} else {
										local88.aClass2_Sub10_8 = local164;
									}
									if (local164 == null) {
										this.aClass2_Sub10Array5[local56] = local88;
									}
									local93 = local164;
								} else {
									local47 |= 0x1 << local56;
									local88 = local93;
									local93 = local93.aClass2_Sub10_8;
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
				@Pc(207) Class2_Sub10 local207 = this.aClass2_Sub10Array6[local56];
				this.aClass2_Sub10Array6[local56] = this.aClass2_Sub10Array5[local56] = null;
				while (local207 != null) {
					@Pc(221) Class2_Sub10 local221 = local207.aClass2_Sub10_8;
					local207.aClass2_Sub10_8 = null;
					local207 = local221;
				}
			}
		}
		if (this.anInt2311 < 0) {
			this.anInt2311 = 0;
		}
		if (this.aClass2_Sub10_5 != null) {
			this.aClass2_Sub10_5.method2742(arg0, 0, 256);
		}
		this.aLong129 = Static70.method1106();
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(Ljava/awt/Component;)V")
	public void method1514(@OriginalArg(0) Component arg0) throws Exception {
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(IILclient!tf;)V")
	private void method1515(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub10 arg1) {
		@Pc(7) int local7 = arg0 >> 5;
		@Pc(12) Class2_Sub10 local12 = this.aClass2_Sub10Array5[local7];
		if (local12 == null) {
			this.aClass2_Sub10Array6[local7] = arg1;
		} else {
			local12.aClass2_Sub10_8 = arg1;
		}
		this.aClass2_Sub10Array5[local7] = arg1;
		arg1.anInt4053 = arg0;
	}

	@OriginalMember(owner = "client!wg", name = "d", descriptor = "(I)V")
	public void method1517(@OriginalArg(0) int arg0) throws Exception {
	}

	@OriginalMember(owner = "client!wg", name = "b", descriptor = "()V")
	protected void method1518() throws Exception {
	}

	@OriginalMember(owner = "client!wg", name = "c", descriptor = "()I")
	protected int method1520() throws Exception {
		return this.anInt2307;
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(II)V")
	private void method1521() {
		this.anInt2311 -= 256;
		if (this.anInt2311 < 0) {
			this.anInt2311 = 0;
		}
		if (this.aClass2_Sub10_5 != null) {
			this.aClass2_Sub10_5.method2741(256);
		}
	}

	@OriginalMember(owner = "client!wg", name = "e", descriptor = "(I)V")
	public final synchronized void method1522() {
		this.aBoolean90 = true;
		try {
			this.method1523();
		} catch (@Pc(15) Exception local15) {
			this.method1506();
			this.aLong130 = Static70.method1106() + 2000L;
		}
	}

	@OriginalMember(owner = "client!wg", name = "d", descriptor = "()V")
	protected void method1523() throws Exception {
	}
}
