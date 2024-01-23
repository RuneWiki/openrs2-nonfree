import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tl")
public class Class101 {

	@OriginalMember(owner = "client!tl", name = "n", descriptor = "[I")
	public int[] anIntArray278;

	@OriginalMember(owner = "client!tl", name = "v", descriptor = "Lclient!vc;")
	private Class1_Sub4 aClass1_Sub4_7;

	@OriginalMember(owner = "client!tl", name = "B", descriptor = "I")
	private int anInt3483;

	@OriginalMember(owner = "client!tl", name = "C", descriptor = "I")
	public int anInt3484;

	@OriginalMember(owner = "client!tl", name = "I", descriptor = "I")
	public int anInt3488;

	@OriginalMember(owner = "client!tl", name = "k", descriptor = "I")
	private int anInt3472 = 32;

	@OriginalMember(owner = "client!tl", name = "e", descriptor = "Z")
	private boolean aBoolean241 = false;

	@OriginalMember(owner = "client!tl", name = "f", descriptor = "J")
	private long aLong128 = Static135.method2186();

	@OriginalMember(owner = "client!tl", name = "z", descriptor = "J")
	private long aLong129 = 0L;

	@OriginalMember(owner = "client!tl", name = "E", descriptor = "Z")
	private boolean aBoolean242 = true;

	@OriginalMember(owner = "client!tl", name = "F", descriptor = "J")
	private long aLong130 = 0L;

	@OriginalMember(owner = "client!tl", name = "D", descriptor = "I")
	private int anInt3485 = 0;

	@OriginalMember(owner = "client!tl", name = "H", descriptor = "I")
	private int anInt3487 = 0;

	@OriginalMember(owner = "client!tl", name = "A", descriptor = "[Lclient!vc;")
	private Class1_Sub4[] aClass1_Sub4Array5 = new Class1_Sub4[8];

	@OriginalMember(owner = "client!tl", name = "G", descriptor = "I")
	private int anInt3486 = 0;

	@OriginalMember(owner = "client!tl", name = "L", descriptor = "I")
	private int anInt3490 = 0;

	@OriginalMember(owner = "client!tl", name = "K", descriptor = "[Lclient!vc;")
	private Class1_Sub4[] aClass1_Sub4Array6 = new Class1_Sub4[8];

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(Ljava/awt/Component;)V")
	public void method2796(@OriginalArg(0) Component arg0) throws Exception {
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(II)V")
	private void method2797() {
		this.anInt3487 -= 256;
		if (this.anInt3487 < 0) {
			this.anInt3487 = 0;
		}
		if (this.aClass1_Sub4_7 != null) {
			this.aClass1_Sub4_7.method4192(256);
		}
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "([II)V")
	private void method2798(@OriginalArg(0) int[] arg0) {
		@Pc(1) short local1 = 256;
		if (Static64.aBoolean221) {
			local1 = 512;
		}
		Static319.method509(arg0, 0, local1);
		this.anInt3487 -= 256;
		if (this.aClass1_Sub4_7 != null && this.anInt3487 <= 0) {
			this.anInt3487 += Static152.anInt3130 >> 4;
			Static114.method1825(this.aClass1_Sub4_7);
			this.method2812(this.aClass1_Sub4_7, this.aClass1_Sub4_7.method4191());
			@Pc(45) int local45 = 0;
			@Pc(47) int local47 = 255;
			@Pc(49) int local49 = 7;
			label106: while (local47 != 0) {
				@Pc(57) int local57;
				@Pc(62) int local62;
				if (local49 < 0) {
					local57 = local49 & 0x3;
					local62 = -(local49 >> 2);
				} else {
					local57 = local49;
					local62 = 0;
				}
				for (@Pc(73) int local73 = local47 >>> local57 & 0x11111111; local73 != 0; local73 >>>= 0x4) {
					if ((local73 & 0x1) != 0) {
						local47 &= ~(0x1 << local57);
						@Pc(91) Class1_Sub4 local91 = null;
						@Pc(96) Class1_Sub4 local96 = this.aClass1_Sub4Array5[local57];
						label100: while (true) {
							while (true) {
								if (local96 == null) {
									break label100;
								}
								@Pc(101) Class1_Sub7 local101 = local96.aClass1_Sub7_5;
								if (local101 == null || local101.anInt807 <= local62) {
									local96.aBoolean385 = true;
									@Pc(125) int local125 = local96.method4188();
									local45 += local125;
									if (local101 != null) {
										local101.anInt807 += local125;
									}
									if (local45 >= this.anInt3472) {
										break label106;
									}
									@Pc(145) Class1_Sub4 local145 = local96.method4189();
									if (local145 != null) {
										@Pc(150) int local150 = local96.anInt5372;
										while (local145 != null) {
											this.method2812(local145, local150 * local145.method4191() >> 8);
											local145 = local96.method4186();
										}
									}
									@Pc(169) Class1_Sub4 local169 = local96.aClass1_Sub4_8;
									local96.aClass1_Sub4_8 = null;
									if (local91 == null) {
										this.aClass1_Sub4Array5[local57] = local169;
									} else {
										local91.aClass1_Sub4_8 = local169;
									}
									if (local169 == null) {
										this.aClass1_Sub4Array6[local57] = local91;
									}
									local96 = local169;
								} else {
									local47 |= 0x1 << local57;
									local91 = local96;
									local96 = local96.aClass1_Sub4_8;
								}
							}
						}
					}
					local57 += 4;
					local62++;
				}
				local49--;
			}
			for (local49 = 0; local49 < 8; local49++) {
				@Pc(212) Class1_Sub4 local212 = this.aClass1_Sub4Array5[local49];
				this.aClass1_Sub4Array5[local49] = this.aClass1_Sub4Array6[local49] = null;
				while (local212 != null) {
					@Pc(227) Class1_Sub4 local227 = local212.aClass1_Sub4_8;
					local212.aClass1_Sub4_8 = null;
					local212 = local227;
				}
			}
		}
		if (this.anInt3487 < 0) {
			this.anInt3487 = 0;
		}
		if (this.aClass1_Sub4_7 != null) {
			this.aClass1_Sub4_7.method4190(arg0, 0, 256);
		}
		this.aLong128 = Static135.method2186();
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(B)V")
	public final synchronized void method2799() {
		if (this.aBoolean241) {
			return;
		}
		@Pc(13) long local13 = Static135.method2186();
		try {
			if (this.aLong128 + 500000L < local13) {
				this.aLong128 = local13 - 500000L;
			}
			while (this.aLong128 + 5000L < local13) {
				this.method2797();
				this.aLong128 += 256000 / Static152.anInt3130;
			}
		} catch (@Pc(60) Exception local60) {
			this.aLong128 = local13;
		}
		if (this.anIntArray278 == null) {
			return;
		}
		try {
			if (this.aLong130 != 0L) {
				if (this.aLong130 > local13) {
					return;
				}
				this.method2804(this.anInt3488);
				this.aLong130 = 0L;
				this.aBoolean242 = true;
			}
			@Pc(92) int local92 = this.method2808();
			if (this.anInt3485 - local92 > this.anInt3490) {
				this.anInt3490 = this.anInt3485 - local92;
			}
			@Pc(117) int local117 = this.anInt3484 + this.anInt3483;
			if (local117 + 256 > 16384) {
				local117 = 16128;
			}
			if (local117 + 256 > this.anInt3488) {
				this.anInt3488 += 1024;
				if (this.anInt3488 > 16384) {
					this.anInt3488 = 16384;
				}
				this.method2805();
				local92 = 0;
				this.method2804(this.anInt3488);
				this.aBoolean242 = true;
				if (local117 + 256 > this.anInt3488) {
					local117 = this.anInt3488 - 256;
					this.anInt3483 = local117 - this.anInt3484;
				}
			}
			while (local92 < local117) {
				this.method2798(this.anIntArray278);
				local92 += 256;
				this.method2802();
			}
			if (this.aLong129 < local13) {
				if (this.aBoolean242) {
					this.aBoolean242 = false;
				} else if (this.anInt3490 == 0 && this.anInt3486 == 0) {
					this.method2805();
					this.aLong130 = local13 + 2000L;
					return;
				} else {
					this.anInt3483 = Math.min(this.anInt3486, this.anInt3490);
					this.anInt3486 = this.anInt3490;
				}
				this.anInt3490 = 0;
				this.aLong129 = local13 + 2000L;
			}
			this.anInt3485 = local92;
		} catch (@Pc(256) Exception local256) {
			this.method2805();
			this.aLong130 = local13 + 2000L;
		}
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "()V")
	protected void method2800() throws Exception {
	}

	@OriginalMember(owner = "client!tl", name = "b", descriptor = "()V")
	protected void method2802() throws Exception {
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(I)V")
	public final synchronized void method2803() {
		this.aBoolean242 = true;
		try {
			this.method2800();
		} catch (@Pc(14) Exception local14) {
			this.method2805();
			this.aLong130 = Static135.method2186() + 2000L;
		}
	}

	@OriginalMember(owner = "client!tl", name = "b", descriptor = "(I)V")
	public void method2804(@OriginalArg(0) int arg0) throws Exception {
	}

	@OriginalMember(owner = "client!tl", name = "c", descriptor = "()V")
	protected void method2805() {
	}

	@OriginalMember(owner = "client!tl", name = "d", descriptor = "()I")
	protected int method2808() throws Exception {
		return this.anInt3488;
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(Lclient!vc;I)V")
	public final synchronized void method2809(@OriginalArg(0) Class1_Sub4 arg0) {
		this.aClass1_Sub4_7 = arg0;
	}

	@OriginalMember(owner = "client!tl", name = "d", descriptor = "(B)V")
	public final void method2811() {
		this.aBoolean242 = true;
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(Lclient!vc;BI)V")
	private void method2812(@OriginalArg(0) Class1_Sub4 arg0, @OriginalArg(2) int arg1) {
		@Pc(13) int local13 = arg1 >> 5;
		@Pc(18) Class1_Sub4 local18 = this.aClass1_Sub4Array6[local13];
		if (local18 == null) {
			this.aClass1_Sub4Array5[local13] = arg0;
		} else {
			local18.aClass1_Sub4_8 = arg0;
		}
		this.aClass1_Sub4Array6[local13] = arg0;
		arg0.anInt5372 = arg1;
	}

	@OriginalMember(owner = "client!tl", name = "b", descriptor = "(Z)V")
	public final synchronized void method2814() {
		if (Static33.aClass51_1 != null) {
			@Pc(6) boolean local6 = true;
			for (@Pc(8) int local8 = 0; local8 < 2; local8++) {
				if (Static33.aClass51_1.aClass101Array1[local8] == this) {
					Static33.aClass51_1.aClass101Array1[local8] = null;
				}
				if (Static33.aClass51_1.aClass101Array1[local8] != null) {
					local6 = false;
				}
			}
			if (local6) {
				Static33.aClass51_1.aBoolean113 = true;
				while (Static33.aClass51_1.aBoolean112) {
					Static202.method3246(50L);
				}
				Static33.aClass51_1 = null;
			}
		}
		this.method2805();
		this.anIntArray278 = null;
		this.aBoolean241 = true;
	}
}
