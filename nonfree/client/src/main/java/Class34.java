import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!w")
public class Class34 {

	@OriginalMember(owner = "client!w", name = "f", descriptor = "[I")
	public int[] anIntArray284;

	@OriginalMember(owner = "client!w", name = "o", descriptor = "Lclient!mc;")
	private Class3_Sub2 aClass3_Sub2_7;

	@OriginalMember(owner = "client!w", name = "M", descriptor = "I")
	private int anInt2666;

	@OriginalMember(owner = "client!w", name = "O", descriptor = "I")
	public int anInt2667;

	@OriginalMember(owner = "client!w", name = "Q", descriptor = "I")
	public int anInt2668;

	@OriginalMember(owner = "client!w", name = "n", descriptor = "I")
	private final int anInt2653 = 32;

	@OriginalMember(owner = "client!w", name = "w", descriptor = "J")
	private long aLong90 = Static102.method1996();

	@OriginalMember(owner = "client!w", name = "A", descriptor = "[Lclient!mc;")
	private final Class3_Sub2[] aClass3_Sub2Array5 = new Class3_Sub2[8];

	@OriginalMember(owner = "client!w", name = "y", descriptor = "I")
	private int anInt2661 = 0;

	@OriginalMember(owner = "client!w", name = "C", descriptor = "J")
	private long aLong91 = 0L;

	@OriginalMember(owner = "client!w", name = "B", descriptor = "I")
	private int anInt2662 = 0;

	@OriginalMember(owner = "client!w", name = "K", descriptor = "[Lclient!mc;")
	private final Class3_Sub2[] aClass3_Sub2Array6 = new Class3_Sub2[8];

	@OriginalMember(owner = "client!w", name = "z", descriptor = "Z")
	private boolean aBoolean98 = true;

	@OriginalMember(owner = "client!w", name = "D", descriptor = "I")
	private int anInt2663 = 0;

	@OriginalMember(owner = "client!w", name = "J", descriptor = "I")
	private int anInt2665 = 0;

	@OriginalMember(owner = "client!w", name = "R", descriptor = "J")
	private long aLong92 = 0L;

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(Ljava/awt/Component;)V")
	public void method1713(@OriginalArg(0) Component arg0) throws Exception {
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "()I")
	protected int method1714() throws Exception {
		return this.anInt2668;
	}

	@OriginalMember(owner = "client!w", name = "b", descriptor = "()V")
	protected void method1715() throws Exception {
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(I)V")
	public final void method1716() {
		this.aBoolean98 = true;
	}

	@OriginalMember(owner = "client!w", name = "b", descriptor = "(I)V")
	public final synchronized void method1717() {
		this.aBoolean98 = true;
		try {
			this.method1715();
		} catch (@Pc(12) Exception local12) {
			this.method1721();
			this.aLong91 = Static102.method1996() + 2000L;
		}
	}

	@OriginalMember(owner = "client!w", name = "c", descriptor = "(I)V")
	public void method1719(@OriginalArg(0) int arg0) throws Exception {
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(BI)V")
	private void method1720() {
		this.anInt2661 -= 256;
		if (this.anInt2661 < 0) {
			this.anInt2661 = 0;
		}
		if (this.aClass3_Sub2_7 != null) {
			this.aClass3_Sub2_7.method2169(256);
		}
	}

	@OriginalMember(owner = "client!w", name = "c", descriptor = "()V")
	protected void method1721() {
	}

	@OriginalMember(owner = "client!w", name = "d", descriptor = "()V")
	protected void method1723() throws Exception {
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(Lclient!mc;Z)V")
	public final synchronized void method1724(@OriginalArg(0) Class3_Sub2 arg0) {
		this.aClass3_Sub2_7 = arg0;
	}

	@OriginalMember(owner = "client!w", name = "b", descriptor = "(B)V")
	public final synchronized void method1725() {
		if (Static13.aClass38_1 != null) {
			@Pc(9) boolean local9 = true;
			for (@Pc(11) int local11 = 0; local11 < 2; local11++) {
				if (Static13.aClass38_1.aClass34Array1[local11] == this) {
					Static13.aClass38_1.aClass34Array1[local11] = null;
				}
				if (Static13.aClass38_1.aClass34Array1[local11] != null) {
					local9 = false;
				}
			}
			if (local9) {
				Static13.aClass38_1.aBoolean59 = true;
				while (Static13.aClass38_1.aBoolean60) {
					Static126.method2277(50L);
				}
				Static13.aClass38_1 = null;
			}
		}
		this.method1721();
		this.anIntArray284 = null;
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(BILclient!mc;)V")
	private void method1726(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub2 arg1) {
		@Pc(15) int local15 = arg0 >> 5;
		@Pc(20) Class3_Sub2 local20 = this.aClass3_Sub2Array5[local15];
		if (local20 == null) {
			this.aClass3_Sub2Array6[local15] = arg1;
		} else {
			local20.aClass3_Sub2_8 = arg1;
		}
		this.aClass3_Sub2Array5[local15] = arg1;
		arg1.anInt3260 = arg0;
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(Z)V")
	public final synchronized void method1727() {
		if (this.anIntArray284 == null) {
			return;
		}
		@Pc(12) long local12 = Static102.method1996();
		try {
			if (this.aLong91 != 0L) {
				if (this.aLong91 > local12) {
					return;
				}
				this.method1719(this.anInt2668);
				this.aLong91 = 0L;
				this.aBoolean98 = true;
			}
			@Pc(42) int local42 = this.method1714();
			if (this.anInt2665 < this.anInt2662 - local42) {
				this.anInt2665 = this.anInt2662 - local42;
			}
			@Pc(67) int local67 = this.anInt2667 + this.anInt2666;
			if (local67 + 256 > 16384) {
				local67 = 16128;
			}
			if (local67 + 256 > this.anInt2668) {
				this.anInt2668 += 1024;
				if (this.anInt2668 > 16384) {
					this.anInt2668 = 16384;
				}
				this.method1721();
				this.method1719(this.anInt2668);
				local42 = 0;
				this.aBoolean98 = true;
				if (local67 + 256 > this.anInt2668) {
					local67 = this.anInt2668 - 256;
					this.anInt2666 = local67 - this.anInt2667;
				}
			}
			while (local67 > local42) {
				local42 += 256;
				this.method1728(this.anIntArray284);
				this.method1723();
			}
			if (this.aLong92 < local12) {
				if (this.aBoolean98) {
					this.aBoolean98 = false;
				} else if (this.anInt2665 == 0 && this.anInt2663 == 0) {
					this.method1721();
					this.aLong91 = local12 + 2000L;
					return;
				} else {
					this.anInt2666 = Math.min(this.anInt2663, this.anInt2665);
					this.anInt2663 = this.anInt2665;
				}
				this.anInt2665 = 0;
				this.aLong92 = local12 + 2000L;
			}
			this.anInt2662 = local42;
		} catch (@Pc(206) Exception local206) {
			this.method1721();
			this.aLong91 = local12 + 2000L;
		}
		try {
			if (this.aLong90 + 500000L < local12) {
				local12 = this.aLong90;
			}
			while (this.aLong90 + 5000L < local12) {
				this.method1720();
				this.aLong90 += 256000 / Static68.anInt2134;
			}
		} catch (@Pc(251) Exception local251) {
			this.aLong90 = local12;
		}
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "([II)V")
	private void method1728(@OriginalArg(0) int[] arg0) {
		@Pc(1) short local1 = 256;
		if (Static68.aBoolean70) {
			local1 = 512;
		}
		Static135.method1706(arg0, 0, local1);
		this.anInt2661 -= 256;
		if (this.aClass3_Sub2_7 != null && this.anInt2661 <= 0) {
			this.anInt2661 += Static68.anInt2134 >> 4;
			Static60.method1212(this.aClass3_Sub2_7);
			this.method1726(this.aClass3_Sub2_7.method2165(), this.aClass3_Sub2_7);
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
						@Pc(88) Class3_Sub2 local88 = null;
						@Pc(93) Class3_Sub2 local93 = this.aClass3_Sub2Array6[local56];
						label97: while (true) {
							while (true) {
								if (local93 == null) {
									break label97;
								}
								@Pc(97) Class3_Sub9 local97 = local93.aClass3_Sub9_5;
								if (local97 == null || local97.anInt1101 <= local61) {
									local93.aBoolean119 = true;
									@Pc(121) int local121 = local93.method2170();
									local45 += local121;
									if (local97 != null) {
										local97.anInt1101 += local121;
									}
									if (local45 >= this.anInt2653) {
										break label103;
									}
									@Pc(140) Class3_Sub2 local140 = local93.method2166();
									if (local140 != null) {
										@Pc(145) int local145 = local93.anInt3260;
										while (local140 != null) {
											this.method1726(local145 * local140.method2165() >> 8, local140);
											local140 = local93.method2167();
										}
									}
									@Pc(164) Class3_Sub2 local164 = local93.aClass3_Sub2_8;
									local93.aClass3_Sub2_8 = null;
									if (local88 == null) {
										this.aClass3_Sub2Array6[local56] = local164;
									} else {
										local88.aClass3_Sub2_8 = local164;
									}
									if (local164 == null) {
										this.aClass3_Sub2Array5[local56] = local88;
									}
									local93 = local164;
								} else {
									local47 |= 0x1 << local56;
									local88 = local93;
									local93 = local93.aClass3_Sub2_8;
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
				@Pc(207) Class3_Sub2 local207 = this.aClass3_Sub2Array6[local56];
				this.aClass3_Sub2Array6[local56] = this.aClass3_Sub2Array5[local56] = null;
				while (local207 != null) {
					@Pc(221) Class3_Sub2 local221 = local207.aClass3_Sub2_8;
					local207.aClass3_Sub2_8 = null;
					local207 = local221;
				}
			}
		}
		if (this.anInt2661 < 0) {
			this.anInt2661 = 0;
		}
		if (this.aClass3_Sub2_7 != null) {
			this.aClass3_Sub2_7.method2164(arg0, 0, 256);
		}
		this.aLong90 = Static102.method1996();
	}
}
