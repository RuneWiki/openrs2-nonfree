import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tj")
public class Class103 {

	@OriginalMember(owner = "client!tj", name = "b", descriptor = "Lclient!tf;")
	private Class4_Sub6 aClass4_Sub6_7;

	@OriginalMember(owner = "client!tj", name = "o", descriptor = "[I")
	public int[] anIntArray393;

	@OriginalMember(owner = "client!tj", name = "C", descriptor = "I")
	public int anInt3595;

	@OriginalMember(owner = "client!tj", name = "E", descriptor = "I")
	public int anInt3596;

	@OriginalMember(owner = "client!tj", name = "G", descriptor = "I")
	private int anInt3597;

	@OriginalMember(owner = "client!tj", name = "g", descriptor = "I")
	private int anInt3577 = 32;

	@OriginalMember(owner = "client!tj", name = "r", descriptor = "Z")
	private boolean aBoolean259 = false;

	@OriginalMember(owner = "client!tj", name = "e", descriptor = "J")
	private long aLong130 = Static101.method1677();

	@OriginalMember(owner = "client!tj", name = "B", descriptor = "I")
	private int anInt3594 = 0;

	@OriginalMember(owner = "client!tj", name = "z", descriptor = "I")
	private int anInt3592 = 0;

	@OriginalMember(owner = "client!tj", name = "A", descriptor = "I")
	private int anInt3593 = 0;

	@OriginalMember(owner = "client!tj", name = "F", descriptor = "[Lclient!tf;")
	private Class4_Sub6[] aClass4_Sub6Array6 = new Class4_Sub6[8];

	@OriginalMember(owner = "client!tj", name = "H", descriptor = "I")
	private int anInt3598 = 0;

	@OriginalMember(owner = "client!tj", name = "D", descriptor = "[Lclient!tf;")
	private Class4_Sub6[] aClass4_Sub6Array5 = new Class4_Sub6[8];

	@OriginalMember(owner = "client!tj", name = "K", descriptor = "J")
	private long aLong133 = 0L;

	@OriginalMember(owner = "client!tj", name = "L", descriptor = "Z")
	private boolean aBoolean260 = true;

	@OriginalMember(owner = "client!tj", name = "I", descriptor = "J")
	private long aLong132 = 0L;

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(ILclient!tf;B)V")
	private void method3007(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub6 arg1) {
		@Pc(3) int local3 = arg0 >> 5;
		@Pc(8) Class4_Sub6 local8 = this.aClass4_Sub6Array5[local3];
		if (local8 == null) {
			this.aClass4_Sub6Array6[local3] = arg1;
		} else {
			local8.aClass4_Sub6_8 = arg1;
		}
		this.aClass4_Sub6Array5[local3] = arg1;
		arg1.anInt4094 = arg0;
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(BI)V")
	private void method3008() {
		this.anInt3593 -= 256;
		if (this.anInt3593 < 0) {
			this.anInt3593 = 0;
		}
		if (this.aClass4_Sub6_7 != null) {
			this.aClass4_Sub6_7.method3358(256);
		}
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(I)V")
	public final void method3009() {
		this.aBoolean260 = true;
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(B)V")
	public final synchronized void method3011() {
		if (this.aBoolean259) {
			return;
		}
		@Pc(18) long local18 = Static101.method1677();
		try {
			if (this.aLong130 + 500000L < local18) {
				this.aLong130 = local18 - 500000L;
			}
			while (this.aLong130 + 5000L < local18) {
				this.method3008();
				this.aLong130 += 256000 / Static288.anInt5395;
			}
		} catch (@Pc(58) Exception local58) {
			this.aLong130 = local18;
		}
		if (this.anIntArray393 == null) {
			return;
		}
		try {
			if (this.aLong133 != 0L) {
				if (local18 < this.aLong133) {
					return;
				}
				this.method3012(this.anInt3596);
				this.aBoolean260 = true;
				this.aLong133 = 0L;
			}
			@Pc(96) int local96 = this.method3015();
			if (this.anInt3598 < this.anInt3594 - local96) {
				this.anInt3598 = this.anInt3594 - local96;
			}
			@Pc(117) int local117 = this.anInt3597 + this.anInt3595;
			if (local117 + 256 > 16384) {
				local117 = 16128;
			}
			if (local117 + 256 > this.anInt3596) {
				this.anInt3596 += 1024;
				local96 = 0;
				if (this.anInt3596 > 16384) {
					this.anInt3596 = 16384;
				}
				this.method3017();
				this.method3012(this.anInt3596);
				if (this.anInt3596 < local117 + 256) {
					local117 = this.anInt3596 - 256;
					this.anInt3597 = local117 - this.anInt3595;
				}
				this.aBoolean260 = true;
			}
			while (local117 > local96) {
				local96 += 256;
				this.method3025(this.anIntArray393);
				this.method3018();
			}
			if (local18 > this.aLong132) {
				if (this.aBoolean260) {
					this.aBoolean260 = false;
				} else if (this.anInt3598 == 0 && this.anInt3592 == 0) {
					this.method3017();
					this.aLong133 = local18 + 2000L;
					return;
				} else {
					this.anInt3597 = Math.min(this.anInt3592, this.anInt3598);
					this.anInt3592 = this.anInt3598;
				}
				this.anInt3598 = 0;
				this.aLong132 = local18 + 2000L;
			}
			this.anInt3594 = local96;
		} catch (@Pc(262) Exception local262) {
			this.method3017();
			this.aLong133 = local18 + 2000L;
		}
	}

	@OriginalMember(owner = "client!tj", name = "b", descriptor = "(I)V")
	public void method3012(@OriginalArg(0) int arg0) throws Exception {
	}

	@OriginalMember(owner = "client!tj", name = "d", descriptor = "(I)V")
	public final synchronized void method3014() {
		if (Static138.aClass92_1 != null) {
			@Pc(17) boolean local17 = true;
			for (@Pc(19) int local19 = 0; local19 < 2; local19++) {
				if (Static138.aClass92_1.aClass103Array1[local19] == this) {
					Static138.aClass92_1.aClass103Array1[local19] = null;
				}
				if (Static138.aClass92_1.aClass103Array1[local19] != null) {
					local17 = false;
				}
			}
			if (local17) {
				Static138.aClass92_1.aBoolean170 = true;
				while (Static138.aClass92_1.aBoolean171) {
					Static303.method4677(50L);
				}
				Static138.aClass92_1 = null;
			}
		}
		this.method3017();
		this.aBoolean259 = true;
		this.anIntArray393 = null;
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "()I")
	protected int method3015() throws Exception {
		return this.anInt3596;
	}

	@OriginalMember(owner = "client!tj", name = "b", descriptor = "()V")
	protected void method3017() {
	}

	@OriginalMember(owner = "client!tj", name = "c", descriptor = "()V")
	protected void method3018() throws Exception {
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(Ljava/awt/Component;)V")
	public void method3019(@OriginalArg(0) Component arg0) throws Exception {
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(Lclient!tf;I)V")
	public final synchronized void method3021(@OriginalArg(0) Class4_Sub6 arg0) {
		this.aClass4_Sub6_7 = arg0;
	}

	@OriginalMember(owner = "client!tj", name = "b", descriptor = "(B)V")
	public final synchronized void method3022() {
		this.aBoolean260 = true;
		try {
			this.method3024();
		} catch (@Pc(18) Exception local18) {
			this.method3017();
			this.aLong133 = Static101.method1677() + 2000L;
		}
	}

	@OriginalMember(owner = "client!tj", name = "d", descriptor = "()V")
	protected void method3024() throws Exception {
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "([II)V")
	private void method3025(@OriginalArg(0) int[] arg0) {
		@Pc(1) short local1 = 256;
		if (Static138.aBoolean183) {
			local1 = 512;
		}
		Static316.method76(arg0, 0, local1);
		this.anInt3593 -= 256;
		if (this.aClass4_Sub6_7 != null && this.anInt3593 <= 0) {
			this.anInt3593 += Static288.anInt5395 >> 4;
			Static77.method1324(this.aClass4_Sub6_7);
			this.method3007(this.aClass4_Sub6_7.method3360(), this.aClass4_Sub6_7);
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
						@Pc(91) Class4_Sub6 local91 = null;
						@Pc(96) Class4_Sub6 local96 = this.aClass4_Sub6Array6[local57];
						label100: while (true) {
							while (true) {
								if (local96 == null) {
									break label100;
								}
								@Pc(101) Class4_Sub8 local101 = local96.aClass4_Sub8_5;
								if (local101 == null || local101.anInt4083 <= local62) {
									local96.aBoolean289 = true;
									@Pc(125) int local125 = local96.method3359();
									local45 += local125;
									if (local101 != null) {
										local101.anInt4083 += local125;
									}
									if (local45 >= this.anInt3577) {
										break label106;
									}
									@Pc(145) Class4_Sub6 local145 = local96.method3363();
									if (local145 != null) {
										@Pc(150) int local150 = local96.anInt4094;
										while (local145 != null) {
											this.method3007(local150 * local145.method3360() >> 8, local145);
											local145 = local96.method3362();
										}
									}
									@Pc(169) Class4_Sub6 local169 = local96.aClass4_Sub6_8;
									local96.aClass4_Sub6_8 = null;
									if (local91 == null) {
										this.aClass4_Sub6Array6[local57] = local169;
									} else {
										local91.aClass4_Sub6_8 = local169;
									}
									if (local169 == null) {
										this.aClass4_Sub6Array5[local57] = local91;
									}
									local96 = local169;
								} else {
									local47 |= 0x1 << local57;
									local91 = local96;
									local96 = local96.aClass4_Sub6_8;
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
				@Pc(212) Class4_Sub6 local212 = this.aClass4_Sub6Array6[local49];
				this.aClass4_Sub6Array6[local49] = this.aClass4_Sub6Array5[local49] = null;
				while (local212 != null) {
					@Pc(227) Class4_Sub6 local227 = local212.aClass4_Sub6_8;
					local212.aClass4_Sub6_8 = null;
					local212 = local227;
				}
			}
		}
		if (this.anInt3593 < 0) {
			this.anInt3593 = 0;
		}
		if (this.aClass4_Sub6_7 != null) {
			this.aClass4_Sub6_7.method3361(arg0, 0, 256);
		}
		this.aLong130 = Static101.method1677();
	}
}
