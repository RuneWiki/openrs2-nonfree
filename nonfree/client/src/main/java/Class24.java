import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cg")
public class Class24 {

	@OriginalMember(owner = "client!cg", name = "w", descriptor = "[I")
	public int[] anIntArray365;

	@OriginalMember(owner = "client!cg", name = "C", descriptor = "Lclient!sm;")
	private Class1_Sub8 aClass1_Sub8_7;

	@OriginalMember(owner = "client!cg", name = "I", descriptor = "I")
	public int anInt2955;

	@OriginalMember(owner = "client!cg", name = "K", descriptor = "I")
	private int anInt2956;

	@OriginalMember(owner = "client!cg", name = "O", descriptor = "I")
	public int anInt2958;

	@OriginalMember(owner = "client!cg", name = "z", descriptor = "I")
	private int anInt2949 = 32;

	@OriginalMember(owner = "client!cg", name = "d", descriptor = "Z")
	private boolean aBoolean218 = false;

	@OriginalMember(owner = "client!cg", name = "j", descriptor = "J")
	private long aLong99 = Static252.method3964();

	@OriginalMember(owner = "client!cg", name = "F", descriptor = "I")
	private int anInt2953 = 0;

	@OriginalMember(owner = "client!cg", name = "G", descriptor = "J")
	private long aLong100 = 0L;

	@OriginalMember(owner = "client!cg", name = "L", descriptor = "[Lclient!sm;")
	private Class1_Sub8[] aClass1_Sub8Array5 = new Class1_Sub8[8];

	@OriginalMember(owner = "client!cg", name = "N", descriptor = "[Lclient!sm;")
	private Class1_Sub8[] aClass1_Sub8Array6 = new Class1_Sub8[8];

	@OriginalMember(owner = "client!cg", name = "H", descriptor = "I")
	private int anInt2954 = 0;

	@OriginalMember(owner = "client!cg", name = "M", descriptor = "I")
	private int anInt2957 = 0;

	@OriginalMember(owner = "client!cg", name = "J", descriptor = "Z")
	private boolean aBoolean220 = true;

	@OriginalMember(owner = "client!cg", name = "P", descriptor = "I")
	private int anInt2959 = 0;

	@OriginalMember(owner = "client!cg", name = "Q", descriptor = "J")
	private long aLong101 = 0L;

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(Lclient!sm;Z)V")
	public final synchronized void method2453(@OriginalArg(0) Class1_Sub8 arg0) {
		this.aClass1_Sub8_7 = arg0;
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "()V")
	protected void method2454() throws Exception {
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(I)V")
	public final synchronized void method2455() {
		if (this.aBoolean218) {
			return;
		}
		@Pc(12) long local12 = Static252.method3964();
		try {
			if (this.aLong99 + 500000L < local12) {
				this.aLong99 = local12 - 500000L;
			}
			while (this.aLong99 + 5000L < local12) {
				this.method2465();
				this.aLong99 += 256000 / Static234.anInt4892;
			}
		} catch (@Pc(49) Exception local49) {
			this.aLong99 = local12;
		}
		if (this.anIntArray365 == null) {
			return;
		}
		try {
			if (this.aLong100 != 0L) {
				if (local12 < this.aLong100) {
					return;
				}
				this.method2457(this.anInt2955);
				this.aBoolean220 = true;
				this.aLong100 = 0L;
			}
			@Pc(84) int local84 = this.method2456();
			if (this.anInt2959 - local84 > this.anInt2953) {
				this.anInt2953 = this.anInt2959 - local84;
			}
			@Pc(109) int local109 = this.anInt2956 + this.anInt2958;
			if (local109 + 256 > 16384) {
				local109 = 16128;
			}
			if (local109 + 256 > this.anInt2955) {
				local84 = 0;
				this.anInt2955 += 1024;
				if (this.anInt2955 > 16384) {
					this.anInt2955 = 16384;
				}
				this.method2461();
				this.method2457(this.anInt2955);
				this.aBoolean220 = true;
				if (local109 + 256 > this.anInt2955) {
					local109 = this.anInt2955 - 256;
					this.anInt2956 = local109 - this.anInt2958;
				}
			}
			while (local84 < local109) {
				this.method2471(this.anIntArray365);
				this.method2454();
				local84 += 256;
			}
			if (local12 > this.aLong101) {
				if (this.aBoolean220) {
					this.aBoolean220 = false;
				} else if (this.anInt2953 == 0 && this.anInt2957 == 0) {
					this.method2461();
					this.aLong100 = local12 + 2000L;
					return;
				} else {
					this.anInt2956 = Math.min(this.anInt2957, this.anInt2953);
					this.anInt2957 = this.anInt2953;
				}
				this.aLong101 = local12 + 2000L;
				this.anInt2953 = 0;
			}
			this.anInt2959 = local84;
		} catch (@Pc(253) Exception local253) {
			this.method2461();
			this.aLong100 = local12 + 2000L;
		}
	}

	@OriginalMember(owner = "client!cg", name = "b", descriptor = "()I")
	protected int method2456() throws Exception {
		return this.anInt2955;
	}

	@OriginalMember(owner = "client!cg", name = "b", descriptor = "(I)V")
	public void method2457(@OriginalArg(0) int arg0) throws Exception {
	}

	@OriginalMember(owner = "client!cg", name = "c", descriptor = "(I)V")
	public final void method2458() {
		this.aBoolean220 = true;
	}

	@OriginalMember(owner = "client!cg", name = "c", descriptor = "()V")
	protected void method2459() throws Exception {
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(IILclient!sm;)V")
	private void method2460(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub8 arg1) {
		@Pc(7) int local7 = arg0 >> 5;
		@Pc(12) Class1_Sub8 local12 = this.aClass1_Sub8Array6[local7];
		if (local12 == null) {
			this.aClass1_Sub8Array5[local7] = arg1;
		} else {
			local12.aClass1_Sub8_8 = arg1;
		}
		this.aClass1_Sub8Array6[local7] = arg1;
		arg1.anInt5484 = arg0;
	}

	@OriginalMember(owner = "client!cg", name = "d", descriptor = "()V")
	protected void method2461() {
	}

	@OriginalMember(owner = "client!cg", name = "d", descriptor = "(I)V")
	public final synchronized void method2462() {
		if (Static211.aClass178_2 != null) {
			@Pc(7) boolean local7 = true;
			for (@Pc(9) int local9 = 0; local9 < 2; local9++) {
				if (Static211.aClass178_2.aClass24Array1[local9] == this) {
					Static211.aClass178_2.aClass24Array1[local9] = null;
				}
				if (Static211.aClass178_2.aClass24Array1[local9] != null) {
					local7 = false;
				}
			}
			if (local7) {
				Static211.aClass178_2.aBoolean441 = true;
				while (Static211.aClass178_2.aBoolean442) {
					Static275.method4233(50L);
				}
				Static211.aClass178_2 = null;
			}
		}
		this.method2461();
		this.aBoolean218 = true;
		this.anIntArray365 = null;
	}

	@OriginalMember(owner = "client!cg", name = "e", descriptor = "(I)V")
	public final synchronized void method2463() {
		this.aBoolean220 = true;
		try {
			this.method2459();
		} catch (@Pc(6) Exception local6) {
			this.method2461();
			this.aLong100 = Static252.method3964() + 2000L;
		}
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(II)V")
	private void method2465() {
		this.anInt2954 -= 256;
		if (this.anInt2954 < 0) {
			this.anInt2954 = 0;
		}
		if (this.aClass1_Sub8_7 != null) {
			this.aClass1_Sub8_7.method4209(256);
		}
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(Ljava/awt/Component;)V")
	public void method2467(@OriginalArg(0) Component arg0) throws Exception {
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "([II)V")
	private void method2471(@OriginalArg(0) int[] arg0) {
		@Pc(1) short local1 = 256;
		if (Static129.aBoolean297) {
			local1 = 512;
		}
		Static300.method490(arg0, 0, local1);
		this.anInt2954 -= 256;
		if (this.aClass1_Sub8_7 != null && this.anInt2954 <= 0) {
			this.anInt2954 += Static234.anInt4892 >> 4;
			Static291.method4471(this.aClass1_Sub8_7);
			this.method2460(this.aClass1_Sub8_7.method4203(), this.aClass1_Sub8_7);
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
						@Pc(91) Class1_Sub8 local91 = null;
						@Pc(96) Class1_Sub8 local96 = this.aClass1_Sub8Array5[local57];
						label100: while (true) {
							while (true) {
								if (local96 == null) {
									break label100;
								}
								@Pc(101) Class1_Sub22 local101 = local96.aClass1_Sub22_5;
								if (local101 == null || local101.anInt3752 <= local62) {
									local96.aBoolean419 = true;
									@Pc(125) int local125 = local96.method4207();
									local45 += local125;
									if (local101 != null) {
										local101.anInt3752 += local125;
									}
									if (local45 >= this.anInt2949) {
										break label106;
									}
									@Pc(145) Class1_Sub8 local145 = local96.method4208();
									if (local145 != null) {
										@Pc(150) int local150 = local96.anInt5484;
										while (local145 != null) {
											this.method2460(local150 * local145.method4203() >> 8, local145);
											local145 = local96.method4206();
										}
									}
									@Pc(169) Class1_Sub8 local169 = local96.aClass1_Sub8_8;
									local96.aClass1_Sub8_8 = null;
									if (local91 == null) {
										this.aClass1_Sub8Array5[local57] = local169;
									} else {
										local91.aClass1_Sub8_8 = local169;
									}
									if (local169 == null) {
										this.aClass1_Sub8Array6[local57] = local91;
									}
									local96 = local169;
								} else {
									local47 |= 0x1 << local57;
									local91 = local96;
									local96 = local96.aClass1_Sub8_8;
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
				@Pc(212) Class1_Sub8 local212 = this.aClass1_Sub8Array5[local49];
				this.aClass1_Sub8Array5[local49] = this.aClass1_Sub8Array6[local49] = null;
				while (local212 != null) {
					@Pc(227) Class1_Sub8 local227 = local212.aClass1_Sub8_8;
					local212.aClass1_Sub8_8 = null;
					local212 = local227;
				}
			}
		}
		if (this.anInt2954 < 0) {
			this.anInt2954 = 0;
		}
		if (this.aClass1_Sub8_7 != null) {
			this.aClass1_Sub8_7.method4204(arg0, 0, 256);
		}
		this.aLong99 = Static252.method3964();
	}
}
