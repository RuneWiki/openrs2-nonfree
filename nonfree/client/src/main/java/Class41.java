import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mg")
public class Class41 {

	@OriginalMember(owner = "client!mg", name = "k", descriptor = "[I")
	public int[] anIntArray252;

	@OriginalMember(owner = "client!mg", name = "p", descriptor = "Lclient!ag;")
	private Class4_Sub2 aClass4_Sub2_7;

	@OriginalMember(owner = "client!mg", name = "B", descriptor = "I")
	private int anInt2706;

	@OriginalMember(owner = "client!mg", name = "C", descriptor = "I")
	public int anInt2707;

	@OriginalMember(owner = "client!mg", name = "D", descriptor = "I")
	public int anInt2708;

	@OriginalMember(owner = "client!mg", name = "l", descriptor = "I")
	private final int anInt2699 = 32;

	@OriginalMember(owner = "client!mg", name = "w", descriptor = "J")
	private long aLong98 = Static149.method2559();

	@OriginalMember(owner = "client!mg", name = "x", descriptor = "[Lclient!ag;")
	private final Class4_Sub2[] aClass4_Sub2Array5 = new Class4_Sub2[8];

	@OriginalMember(owner = "client!mg", name = "A", descriptor = "Z")
	private boolean aBoolean117 = true;

	@OriginalMember(owner = "client!mg", name = "G", descriptor = "I")
	private int anInt2711 = 0;

	@OriginalMember(owner = "client!mg", name = "z", descriptor = "I")
	private int anInt2705 = 0;

	@OriginalMember(owner = "client!mg", name = "H", descriptor = "J")
	private long aLong99 = 0L;

	@OriginalMember(owner = "client!mg", name = "K", descriptor = "I")
	private int anInt2712 = 0;

	@OriginalMember(owner = "client!mg", name = "I", descriptor = "J")
	private long aLong100 = 0L;

	@OriginalMember(owner = "client!mg", name = "N", descriptor = "[Lclient!ag;")
	private final Class4_Sub2[] aClass4_Sub2Array6 = new Class4_Sub2[8];

	@OriginalMember(owner = "client!mg", name = "M", descriptor = "I")
	private int anInt2714 = 0;

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "()V")
	protected void method2035() {
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "([II)V")
	private void method2036(@OriginalArg(0) int[] arg0) {
		@Pc(1) short local1 = 256;
		if (Static68.aBoolean82) {
			local1 = 512;
		}
		Static189.method186(arg0, 0, local1);
		this.anInt2714 -= 256;
		if (this.aClass4_Sub2_7 != null && this.anInt2714 <= 0) {
			this.anInt2714 += Static154.anInt4087 >> 4;
			Static183.method1445(this.aClass4_Sub2_7);
			this.method2039(this.aClass4_Sub2_7, this.aClass4_Sub2_7.method2770());
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
						@Pc(88) Class4_Sub2 local88 = null;
						@Pc(93) Class4_Sub2 local93 = this.aClass4_Sub2Array5[local56];
						label97: while (true) {
							while (true) {
								if (local93 == null) {
									break label97;
								}
								@Pc(97) Class4_Sub12 local97 = local93.aClass4_Sub12_5;
								if (local97 == null || local97.anInt3981 <= local61) {
									local93.aBoolean144 = true;
									@Pc(121) int local121 = local93.method2771();
									local45 += local121;
									if (local97 != null) {
										local97.anInt3981 += local121;
									}
									if (local45 >= this.anInt2699) {
										break label103;
									}
									@Pc(140) Class4_Sub2 local140 = local93.method2774();
									if (local140 != null) {
										@Pc(145) int local145 = local93.anInt3661;
										while (local140 != null) {
											this.method2039(local140, local145 * local140.method2770() >> 8);
											local140 = local93.method2768();
										}
									}
									@Pc(164) Class4_Sub2 local164 = local93.aClass4_Sub2_8;
									local93.aClass4_Sub2_8 = null;
									if (local88 == null) {
										this.aClass4_Sub2Array5[local56] = local164;
									} else {
										local88.aClass4_Sub2_8 = local164;
									}
									if (local164 == null) {
										this.aClass4_Sub2Array6[local56] = local88;
									}
									local93 = local164;
								} else {
									local47 |= 0x1 << local56;
									local88 = local93;
									local93 = local93.aClass4_Sub2_8;
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
				@Pc(207) Class4_Sub2 local207 = this.aClass4_Sub2Array5[local56];
				this.aClass4_Sub2Array5[local56] = this.aClass4_Sub2Array6[local56] = null;
				while (local207 != null) {
					@Pc(221) Class4_Sub2 local221 = local207.aClass4_Sub2_8;
					local207.aClass4_Sub2_8 = null;
					local207 = local221;
				}
			}
		}
		if (this.anInt2714 < 0) {
			this.anInt2714 = 0;
		}
		if (this.aClass4_Sub2_7 != null) {
			this.aClass4_Sub2_7.method2769(arg0, 0, 256);
		}
		this.aLong98 = Static149.method2559();
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(ILclient!ag;)V")
	public final synchronized void method2037(@OriginalArg(1) Class4_Sub2 arg0) {
		this.aClass4_Sub2_7 = arg0;
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(I)V")
	public final synchronized void method2038() {
		this.aBoolean117 = true;
		try {
			this.method2045();
		} catch (@Pc(12) Exception local12) {
			this.method2035();
			this.aLong100 = Static149.method2559() + 2000L;
		}
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(Lclient!ag;BI)V")
	private void method2039(@OriginalArg(0) Class4_Sub2 arg0, @OriginalArg(2) int arg1) {
		@Pc(11) int local11 = arg1 >> 5;
		@Pc(16) Class4_Sub2 local16 = this.aClass4_Sub2Array6[local11];
		if (local16 == null) {
			this.aClass4_Sub2Array5[local11] = arg0;
		} else {
			local16.aClass4_Sub2_8 = arg0;
		}
		this.aClass4_Sub2Array6[local11] = arg0;
		arg0.anInt3661 = arg1;
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(Z)V")
	public final synchronized void method2040() {
		if (Static154.aClass45_3 != null) {
			@Pc(5) boolean local5 = true;
			for (@Pc(7) int local7 = 0; local7 < 2; local7++) {
				if (Static154.aClass45_3.aClass41Array1[local7] == this) {
					Static154.aClass45_3.aClass41Array1[local7] = null;
				}
				if (Static154.aClass45_3.aClass41Array1[local7] != null) {
					local5 = false;
				}
			}
			if (local5) {
				Static154.aClass45_3.aBoolean92 = true;
				while (Static154.aClass45_3.aBoolean91) {
					Static52.method1025(50L);
				}
				Static154.aClass45_3 = null;
			}
		}
		this.method2035();
		this.anIntArray252 = null;
	}

	@OriginalMember(owner = "client!mg", name = "b", descriptor = "(I)V")
	public void method2041(@OriginalArg(0) int arg0) throws Exception {
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(Ljava/awt/Component;)V")
	public void method2043(@OriginalArg(0) Component arg0) throws Exception {
	}

	@OriginalMember(owner = "client!mg", name = "b", descriptor = "()V")
	protected void method2044() throws Exception {
	}

	@OriginalMember(owner = "client!mg", name = "c", descriptor = "()V")
	protected void method2045() throws Exception {
	}

	@OriginalMember(owner = "client!mg", name = "c", descriptor = "(I)V")
	public final synchronized void method2047() {
		if (this.anIntArray252 == null) {
			return;
		}
		@Pc(12) long local12 = Static149.method2559();
		try {
			if (this.aLong100 != 0L) {
				if (local12 < this.aLong100) {
					return;
				}
				this.method2041(this.anInt2707);
				this.aLong100 = 0L;
				this.aBoolean117 = true;
			}
			@Pc(36) int local36 = this.method2050();
			@Pc(42) int local42 = this.anInt2708 + this.anInt2706;
			if (this.anInt2711 - local36 > this.anInt2712) {
				this.anInt2712 = this.anInt2711 - local36;
			}
			if (local42 + 256 > 16384) {
				local42 = 16128;
			}
			if (this.anInt2707 < local42 + 256) {
				local36 = 0;
				this.anInt2707 += 1024;
				if (this.anInt2707 > 16384) {
					this.anInt2707 = 16384;
				}
				this.method2035();
				this.method2041(this.anInt2707);
				this.aBoolean117 = true;
				if (local42 + 256 > this.anInt2707) {
					local42 = this.anInt2707 - 256;
					this.anInt2706 = local42 - this.anInt2708;
				}
			}
			while (local42 > local36) {
				this.method2036(this.anIntArray252);
				this.method2044();
				local36 += 256;
			}
			if (local12 > this.aLong99) {
				if (this.aBoolean117) {
					this.aBoolean117 = false;
				} else if (this.anInt2712 == 0 && this.anInt2705 == 0) {
					this.method2035();
					this.aLong100 = local12 + 2000L;
					return;
				} else {
					this.anInt2706 = Math.min(this.anInt2705, this.anInt2712);
					this.anInt2705 = this.anInt2712;
				}
				this.aLong99 = local12 + 2000L;
				this.anInt2712 = 0;
			}
			this.anInt2711 = local36;
		} catch (@Pc(192) Exception local192) {
			this.method2035();
			this.aLong100 = local12 + 2000L;
		}
		try {
			if (local12 > this.aLong98 + 500000L) {
				local12 = this.aLong98;
			}
			while (local12 > this.aLong98 + 5000L) {
				this.method2051();
				this.aLong98 += 256000 / Static154.anInt4087;
			}
		} catch (@Pc(245) Exception local245) {
			this.aLong98 = local12;
		}
	}

	@OriginalMember(owner = "client!mg", name = "d", descriptor = "(I)V")
	public final void method2048() {
		this.aBoolean117 = true;
	}

	@OriginalMember(owner = "client!mg", name = "d", descriptor = "()I")
	protected int method2050() throws Exception {
		return this.anInt2707;
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(II)V")
	private void method2051() {
		this.anInt2714 -= 256;
		if (this.anInt2714 < 0) {
			this.anInt2714 = 0;
		}
		if (this.aClass4_Sub2_7 != null) {
			this.aClass4_Sub2_7.method2773(256);
		}
	}
}
