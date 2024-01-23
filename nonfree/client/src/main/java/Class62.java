import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jh")
public class Class62 {

	@OriginalMember(owner = "client!jh", name = "k", descriptor = "Lclient!pf;")
	private Class1_Sub6 aClass1_Sub6_8;

	@OriginalMember(owner = "client!jh", name = "m", descriptor = "[I")
	public int[] anIntArray274;

	@OriginalMember(owner = "client!jh", name = "G", descriptor = "I")
	private int anInt3193;

	@OriginalMember(owner = "client!jh", name = "L", descriptor = "I")
	public int anInt3196;

	@OriginalMember(owner = "client!jh", name = "R", descriptor = "I")
	public int anInt3199;

	@OriginalMember(owner = "client!jh", name = "v", descriptor = "I")
	private int anInt3190 = 32;

	@OriginalMember(owner = "client!jh", name = "e", descriptor = "J")
	private long aLong119 = Static209.method3309();

	@OriginalMember(owner = "client!jh", name = "J", descriptor = "I")
	private int anInt3195 = 0;

	@OriginalMember(owner = "client!jh", name = "H", descriptor = "I")
	private int anInt3194 = 0;

	@OriginalMember(owner = "client!jh", name = "O", descriptor = "I")
	private int anInt3197 = 0;

	@OriginalMember(owner = "client!jh", name = "I", descriptor = "[Lclient!pf;")
	private Class1_Sub6[] aClass1_Sub6Array5 = new Class1_Sub6[8];

	@OriginalMember(owner = "client!jh", name = "M", descriptor = "J")
	private long aLong121 = 0L;

	@OriginalMember(owner = "client!jh", name = "Q", descriptor = "I")
	private int anInt3198 = 0;

	@OriginalMember(owner = "client!jh", name = "P", descriptor = "Z")
	private boolean aBoolean270 = true;

	@OriginalMember(owner = "client!jh", name = "K", descriptor = "[Lclient!pf;")
	private Class1_Sub6[] aClass1_Sub6Array6 = new Class1_Sub6[8];

	@OriginalMember(owner = "client!jh", name = "N", descriptor = "J")
	private long aLong122 = 0L;

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(Ljava/awt/Component;)V")
	public void method2405(@OriginalArg(0) Component arg0) throws Exception {
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(B)V")
	public final synchronized void method2407() {
		if (this.anIntArray274 == null) {
			return;
		}
		@Pc(12) long local12 = Static209.method3309();
		try {
			if (this.aLong122 != 0L) {
				if (this.aLong122 > local12) {
					return;
				}
				this.method2408(this.anInt3199);
				this.aBoolean270 = true;
				this.aLong122 = 0L;
			}
			@Pc(38) int local38 = this.method2418();
			@Pc(45) int local45 = this.anInt3196 + this.anInt3193;
			if (this.anInt3195 - local38 > this.anInt3194) {
				this.anInt3194 = this.anInt3195 - local38;
			}
			if (local45 + 256 > 16384) {
				local45 = 16128;
			}
			if (this.anInt3199 < local45 + 256) {
				this.anInt3199 += 1024;
				local38 = 0;
				if (this.anInt3199 > 16384) {
					this.anInt3199 = 16384;
				}
				this.method2409();
				this.method2408(this.anInt3199);
				if (local45 + 256 > this.anInt3199) {
					local45 = this.anInt3199 - 256;
					this.anInt3193 = local45 - this.anInt3196;
				}
				this.aBoolean270 = true;
			}
			while (local38 < local45) {
				local38 += 256;
				this.method2415(this.anIntArray274);
				this.method2410();
			}
			if (local12 > this.aLong121) {
				if (this.aBoolean270) {
					this.aBoolean270 = false;
				} else if (this.anInt3194 == 0 && this.anInt3197 == 0) {
					this.method2409();
					this.aLong122 = local12 + 2000L;
					return;
				} else {
					this.anInt3193 = Math.min(this.anInt3197, this.anInt3194);
					this.anInt3197 = this.anInt3194;
				}
				this.aLong121 = local12 + 2000L;
				this.anInt3194 = 0;
			}
			this.anInt3195 = local38;
		} catch (@Pc(188) Exception local188) {
			this.method2409();
			this.aLong122 = local12 + 2000L;
		}
		try {
			if (this.aLong119 + 500000L < local12) {
				local12 = this.aLong119;
			}
			while (local12 > this.aLong119 + 5000L) {
				this.method2420();
				this.aLong119 += 256000 / Static14.anInt334;
			}
		} catch (@Pc(233) Exception local233) {
			this.aLong119 = local12;
		}
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(I)V")
	public void method2408(@OriginalArg(0) int arg0) throws Exception {
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "()V")
	protected void method2409() {
	}

	@OriginalMember(owner = "client!jh", name = "b", descriptor = "()V")
	protected void method2410() throws Exception {
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(Lclient!pf;I)V")
	public final synchronized void method2411(@OriginalArg(0) Class1_Sub6 arg0) {
		this.aClass1_Sub6_8 = arg0;
	}

	@OriginalMember(owner = "client!jh", name = "b", descriptor = "(I)V")
	public final void method2412() {
		this.aBoolean270 = true;
	}

	@OriginalMember(owner = "client!jh", name = "b", descriptor = "(B)V")
	public final synchronized void method2414() {
		this.aBoolean270 = true;
		try {
			this.method2421();
		} catch (@Pc(18) Exception local18) {
			this.method2409();
			this.aLong122 = Static209.method3309() + 2000L;
		}
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "([II)V")
	private void method2415(@OriginalArg(0) int[] arg0) {
		@Pc(1) short local1 = 256;
		if (Static97.aBoolean189) {
			local1 = 512;
		}
		Static236.method298(arg0, 0, local1);
		this.anInt3198 -= 256;
		if (this.aClass1_Sub6_8 != null && this.anInt3198 <= 0) {
			this.anInt3198 += Static14.anInt334 >> 4;
			Static71.method1284(this.aClass1_Sub6_8);
			this.method2419(this.aClass1_Sub6_8.method2181(), this.aClass1_Sub6_8);
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
						@Pc(88) Class1_Sub6 local88 = null;
						@Pc(93) Class1_Sub6 local93 = this.aClass1_Sub6Array5[local56];
						label97: while (true) {
							while (true) {
								if (local93 == null) {
									break label97;
								}
								@Pc(97) Class1_Sub7 local97 = local93.aClass1_Sub7_5;
								if (local97 == null || local97.anInt1311 <= local61) {
									local93.aBoolean241 = true;
									@Pc(121) int local121 = local93.method2184();
									local45 += local121;
									if (local97 != null) {
										local97.anInt1311 += local121;
									}
									if (local45 >= this.anInt3190) {
										break label103;
									}
									@Pc(140) Class1_Sub6 local140 = local93.method2185();
									if (local140 != null) {
										@Pc(145) int local145 = local93.anInt2848;
										while (local140 != null) {
											this.method2419(local145 * local140.method2181() >> 8, local140);
											local140 = local93.method2182();
										}
									}
									@Pc(164) Class1_Sub6 local164 = local93.aClass1_Sub6_7;
									local93.aClass1_Sub6_7 = null;
									if (local88 == null) {
										this.aClass1_Sub6Array5[local56] = local164;
									} else {
										local88.aClass1_Sub6_7 = local164;
									}
									if (local164 == null) {
										this.aClass1_Sub6Array6[local56] = local88;
									}
									local93 = local164;
								} else {
									local47 |= 0x1 << local56;
									local88 = local93;
									local93 = local93.aClass1_Sub6_7;
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
				@Pc(207) Class1_Sub6 local207 = this.aClass1_Sub6Array5[local56];
				this.aClass1_Sub6Array5[local56] = this.aClass1_Sub6Array6[local56] = null;
				while (local207 != null) {
					@Pc(221) Class1_Sub6 local221 = local207.aClass1_Sub6_7;
					local207.aClass1_Sub6_7 = null;
					local207 = local221;
				}
			}
		}
		if (this.anInt3198 < 0) {
			this.anInt3198 = 0;
		}
		if (this.aClass1_Sub6_8 != null) {
			this.aClass1_Sub6_8.method2183(arg0, 0, 256);
		}
		this.aLong119 = Static209.method3309();
	}

	@OriginalMember(owner = "client!jh", name = "c", descriptor = "()I")
	protected int method2418() throws Exception {
		return this.anInt3199;
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(ILclient!pf;I)V")
	private void method2419(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub6 arg1) {
		@Pc(7) int local7 = arg0 >> 5;
		@Pc(12) Class1_Sub6 local12 = this.aClass1_Sub6Array6[local7];
		if (local12 == null) {
			this.aClass1_Sub6Array5[local7] = arg1;
		} else {
			local12.aClass1_Sub6_7 = arg1;
		}
		this.aClass1_Sub6Array6[local7] = arg1;
		arg1.anInt2848 = arg0;
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(IB)V")
	private void method2420() {
		this.anInt3198 -= 256;
		if (this.anInt3198 < 0) {
			this.anInt3198 = 0;
		}
		if (this.aClass1_Sub6_8 != null) {
			this.aClass1_Sub6_8.method2187(256);
		}
	}

	@OriginalMember(owner = "client!jh", name = "d", descriptor = "()V")
	protected void method2421() throws Exception {
	}

	@OriginalMember(owner = "client!jh", name = "d", descriptor = "(I)V")
	public final synchronized void method2422() {
		if (Static21.aClass38_1 != null) {
			@Pc(17) boolean local17 = true;
			for (@Pc(19) int local19 = 0; local19 < 2; local19++) {
				if (Static21.aClass38_1.aClass62Array1[local19] == this) {
					Static21.aClass38_1.aClass62Array1[local19] = null;
				}
				if (Static21.aClass38_1.aClass62Array1[local19] != null) {
					local17 = false;
				}
			}
			if (local17) {
				Static21.aClass38_1.aBoolean136 = true;
				while (Static21.aClass38_1.aBoolean135) {
					Static148.method2431(50L);
				}
				Static21.aClass38_1 = null;
			}
		}
		this.method2409();
		this.anIntArray274 = null;
	}
}
