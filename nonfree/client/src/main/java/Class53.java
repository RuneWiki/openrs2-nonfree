import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sd")
public class Class53 {

	@OriginalMember(owner = "client!sd", name = "e", descriptor = "[I")
	public int[] anIntArray456;

	@OriginalMember(owner = "client!sd", name = "j", descriptor = "Lclient!ve;")
	private Class1_Sub12 aClass1_Sub12_8;

	@OriginalMember(owner = "client!sd", name = "z", descriptor = "I")
	private int anInt4151;

	@OriginalMember(owner = "client!sd", name = "I", descriptor = "I")
	public int anInt4154;

	@OriginalMember(owner = "client!sd", name = "J", descriptor = "I")
	public int anInt4155;

	@OriginalMember(owner = "client!sd", name = "m", descriptor = "I")
	private final int anInt4140 = 32;

	@OriginalMember(owner = "client!sd", name = "h", descriptor = "J")
	private long aLong155 = Static169.method2888();

	@OriginalMember(owner = "client!sd", name = "y", descriptor = "J")
	private long aLong156 = 0L;

	@OriginalMember(owner = "client!sd", name = "A", descriptor = "[Lclient!ve;")
	private final Class1_Sub12[] aClass1_Sub12Array5 = new Class1_Sub12[8];

	@OriginalMember(owner = "client!sd", name = "x", descriptor = "I")
	private int anInt4150 = 0;

	@OriginalMember(owner = "client!sd", name = "F", descriptor = "J")
	private long aLong157 = 0L;

	@OriginalMember(owner = "client!sd", name = "E", descriptor = "Z")
	private boolean aBoolean322 = true;

	@OriginalMember(owner = "client!sd", name = "B", descriptor = "I")
	private int anInt4152 = 0;

	@OriginalMember(owner = "client!sd", name = "M", descriptor = "I")
	private int anInt4158 = 0;

	@OriginalMember(owner = "client!sd", name = "O", descriptor = "[Lclient!ve;")
	private final Class1_Sub12[] aClass1_Sub12Array6 = new Class1_Sub12[8];

	@OriginalMember(owner = "client!sd", name = "L", descriptor = "I")
	private int anInt4157 = 0;

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "([II)V")
	private void method3039(@OriginalArg(0) int[] arg0) {
		@Pc(1) short local1 = 256;
		if (Static97.aBoolean323) {
			local1 = 512;
		}
		Static193.method2481(arg0, 0, local1);
		this.anInt4158 -= 256;
		if (this.aClass1_Sub12_8 != null && this.anInt4158 <= 0) {
			this.anInt4158 += Static135.anInt3382 >> 4;
			Static161.method2970(this.aClass1_Sub12_8);
			this.method3049(this.aClass1_Sub12_8.method2631(), this.aClass1_Sub12_8);
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
						@Pc(93) Class1_Sub12 local93 = this.aClass1_Sub12Array6[local56];
						label97: while (true) {
							while (true) {
								if (local93 == null) {
									break label97;
								}
								@Pc(97) Class1_Sub4 local97 = local93.aClass1_Sub4_5;
								if (local97 == null || local97.anInt309 <= local61) {
									local93.aBoolean281 = true;
									@Pc(121) int local121 = local93.method2628();
									local45 += local121;
									if (local97 != null) {
										local97.anInt309 += local121;
									}
									if (local45 >= this.anInt4140) {
										break label103;
									}
									@Pc(140) Class1_Sub12 local140 = local93.method2630();
									if (local140 != null) {
										@Pc(145) int local145 = local93.anInt3637;
										while (local140 != null) {
											this.method3049(local145 * local140.method2631() >> 8, local140);
											local140 = local93.method2629();
										}
									}
									@Pc(164) Class1_Sub12 local164 = local93.aClass1_Sub12_7;
									local93.aClass1_Sub12_7 = null;
									if (local88 == null) {
										this.aClass1_Sub12Array6[local56] = local164;
									} else {
										local88.aClass1_Sub12_7 = local164;
									}
									if (local164 == null) {
										this.aClass1_Sub12Array5[local56] = local88;
									}
									local93 = local164;
								} else {
									local47 |= 0x1 << local56;
									local88 = local93;
									local93 = local93.aClass1_Sub12_7;
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
				@Pc(207) Class1_Sub12 local207 = this.aClass1_Sub12Array6[local56];
				this.aClass1_Sub12Array6[local56] = this.aClass1_Sub12Array5[local56] = null;
				while (local207 != null) {
					@Pc(221) Class1_Sub12 local221 = local207.aClass1_Sub12_7;
					local207.aClass1_Sub12_7 = null;
					local207 = local221;
				}
			}
		}
		if (this.anInt4158 < 0) {
			this.anInt4158 = 0;
		}
		if (this.aClass1_Sub12_8 != null) {
			this.aClass1_Sub12_8.method2632(arg0, 0, 256);
		}
		this.aLong155 = Static169.method2888();
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(ILclient!ve;)V")
	public final synchronized void method3040(@OriginalArg(1) Class1_Sub12 arg0) {
		this.aClass1_Sub12_8 = arg0;
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "()V")
	protected void method3041() throws Exception {
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(II)V")
	private void method3042() {
		this.anInt4158 -= 256;
		if (this.anInt4158 < 0) {
			this.anInt4158 = 0;
		}
		if (this.aClass1_Sub12_8 != null) {
			this.aClass1_Sub12_8.method2633(256);
		}
	}

	@OriginalMember(owner = "client!sd", name = "b", descriptor = "()V")
	protected void method3043() throws Exception {
	}

	@OriginalMember(owner = "client!sd", name = "c", descriptor = "()V")
	protected void method3045() {
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(Ljava/awt/Component;)V")
	public void method3046(@OriginalArg(0) Component arg0) throws Exception {
	}

	@OriginalMember(owner = "client!sd", name = "b", descriptor = "(I)V")
	public void method3047(@OriginalArg(0) int arg0) throws Exception {
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(B)V")
	public final synchronized void method3048() {
		if (Static159.aClass5_1 != null) {
			@Pc(9) boolean local9 = true;
			for (@Pc(11) int local11 = 0; local11 < 2; local11++) {
				if (Static159.aClass5_1.aClass53Array1[local11] == this) {
					Static159.aClass5_1.aClass53Array1[local11] = null;
				}
				if (Static159.aClass5_1.aClass53Array1[local11] != null) {
					local9 = false;
				}
			}
			if (local9) {
				Static159.aClass5_1.aBoolean23 = true;
				while (Static159.aClass5_1.aBoolean24) {
					Static181.method2982(50L);
				}
				Static159.aClass5_1 = null;
			}
		}
		this.method3045();
		this.anIntArray456 = null;
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(IBLclient!ve;)V")
	private void method3049(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub12 arg1) {
		@Pc(7) int local7 = arg0 >> 5;
		@Pc(12) Class1_Sub12 local12 = this.aClass1_Sub12Array5[local7];
		if (local12 == null) {
			this.aClass1_Sub12Array6[local7] = arg1;
		} else {
			local12.aClass1_Sub12_7 = arg1;
		}
		this.aClass1_Sub12Array5[local7] = arg1;
		arg1.anInt3637 = arg0;
	}

	@OriginalMember(owner = "client!sd", name = "b", descriptor = "(B)V")
	public final synchronized void method3052() {
		this.aBoolean322 = true;
		try {
			this.method3041();
		} catch (@Pc(10) Exception local10) {
			this.method3045();
			this.aLong156 = Static169.method2888() + 2000L;
		}
	}

	@OriginalMember(owner = "client!sd", name = "d", descriptor = "(I)V")
	public final synchronized void method3053() {
		if (this.anIntArray456 == null) {
			return;
		}
		@Pc(12) long local12 = Static169.method2888();
		try {
			if (this.aLong156 != 0L) {
				if (this.aLong156 > local12) {
					return;
				}
				this.method3047(this.anInt4155);
				this.aBoolean322 = true;
				this.aLong156 = 0L;
			}
			@Pc(38) int local38 = this.method3054();
			if (this.anInt4150 - local38 > this.anInt4152) {
				this.anInt4152 = this.anInt4150 - local38;
			}
			@Pc(58) int local58 = this.anInt4151 + this.anInt4154;
			if (local58 + 256 > 16384) {
				local58 = 16128;
			}
			if (this.anInt4155 < local58 + 256) {
				local38 = 0;
				this.anInt4155 += 1024;
				if (this.anInt4155 > 16384) {
					this.anInt4155 = 16384;
				}
				this.method3045();
				this.method3047(this.anInt4155);
				this.aBoolean322 = true;
				if (local58 + 256 > this.anInt4155) {
					local58 = this.anInt4155 - 256;
					this.anInt4151 = local58 - this.anInt4154;
				}
			}
			while (local38 < local58) {
				local38 += 256;
				this.method3039(this.anIntArray456);
				this.method3043();
			}
			if (local12 > this.aLong157) {
				if (this.aBoolean322) {
					this.aBoolean322 = false;
				} else if (this.anInt4152 == 0 && this.anInt4157 == 0) {
					this.method3045();
					this.aLong156 = local12 + 2000L;
					return;
				} else {
					this.anInt4151 = Math.min(this.anInt4157, this.anInt4152);
					this.anInt4157 = this.anInt4152;
				}
				this.anInt4152 = 0;
				this.aLong157 = local12 + 2000L;
			}
			this.anInt4150 = local38;
		} catch (@Pc(194) Exception local194) {
			this.method3045();
			this.aLong156 = local12 + 2000L;
		}
		try {
			if (local12 > this.aLong155 + 500000L) {
				local12 = this.aLong155;
			}
			while (local12 > this.aLong155 + 5000L) {
				this.method3042();
				this.aLong155 += 256000 / Static135.anInt3382;
			}
		} catch (@Pc(239) Exception local239) {
			this.aLong155 = local12;
		}
	}

	@OriginalMember(owner = "client!sd", name = "d", descriptor = "()I")
	protected int method3054() throws Exception {
		return this.anInt4155;
	}

	@OriginalMember(owner = "client!sd", name = "e", descriptor = "(I)V")
	public final void method3055() {
		this.aBoolean322 = true;
	}
}
