import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pg")
public class Class42 {

	@OriginalMember(owner = "client!pg", name = "p", descriptor = "[I")
	public int[] anIntArray256;

	@OriginalMember(owner = "client!pg", name = "A", descriptor = "Lclient!rd;")
	private Class1_Sub3 aClass1_Sub3_7;

	@OriginalMember(owner = "client!pg", name = "B", descriptor = "I")
	public int anInt3128;

	@OriginalMember(owner = "client!pg", name = "D", descriptor = "I")
	public int anInt3130;

	@OriginalMember(owner = "client!pg", name = "F", descriptor = "I")
	private int anInt3132;

	@OriginalMember(owner = "client!pg", name = "u", descriptor = "I")
	private final int anInt3122 = 32;

	@OriginalMember(owner = "client!pg", name = "s", descriptor = "J")
	private long aLong99 = Static24.method503();

	@OriginalMember(owner = "client!pg", name = "C", descriptor = "I")
	private int anInt3129 = 0;

	@OriginalMember(owner = "client!pg", name = "G", descriptor = "I")
	private int anInt3133 = 0;

	@OriginalMember(owner = "client!pg", name = "I", descriptor = "Z")
	private boolean aBoolean147 = true;

	@OriginalMember(owner = "client!pg", name = "H", descriptor = "J")
	private long aLong100 = 0L;

	@OriginalMember(owner = "client!pg", name = "K", descriptor = "[Lclient!rd;")
	private final Class1_Sub3[] aClass1_Sub3Array5 = new Class1_Sub3[8];

	@OriginalMember(owner = "client!pg", name = "J", descriptor = "J")
	private long aLong101 = 0L;

	@OriginalMember(owner = "client!pg", name = "M", descriptor = "I")
	private int anInt3135 = 0;

	@OriginalMember(owner = "client!pg", name = "N", descriptor = "[Lclient!rd;")
	private final Class1_Sub3[] aClass1_Sub3Array6 = new Class1_Sub3[8];

	@OriginalMember(owner = "client!pg", name = "L", descriptor = "I")
	private int anInt3134 = 0;

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(I)V")
	public final synchronized void method2413() {
		if (this.anIntArray256 == null) {
			return;
		}
		@Pc(12) long local12 = Static24.method503();
		try {
			if (this.aLong100 != 0L) {
				if (this.aLong100 > local12) {
					return;
				}
				this.method2417(this.anInt3130);
				this.aLong100 = 0L;
				this.aBoolean147 = true;
			}
			@Pc(36) int local36 = this.method2423();
			@Pc(50) int local50 = this.anInt3132 + this.anInt3128;
			if (this.anInt3135 - local36 > this.anInt3134) {
				this.anInt3134 = this.anInt3135 - local36;
			}
			if (local50 + 256 > 16384) {
				local50 = 16128;
			}
			if (local50 + 256 > this.anInt3130) {
				this.anInt3130 += 1024;
				local36 = 0;
				if (this.anInt3130 > 16384) {
					this.anInt3130 = 16384;
				}
				this.method2421();
				this.method2417(this.anInt3130);
				this.aBoolean147 = true;
				if (this.anInt3130 < local50 + 256) {
					local50 = this.anInt3130 - 256;
					this.anInt3132 = local50 - this.anInt3128;
				}
			}
			while (local50 > local36) {
				this.method2430(this.anIntArray256);
				this.method2420();
				local36 += 256;
			}
			if (local12 > this.aLong101) {
				if (this.aBoolean147) {
					this.aBoolean147 = false;
				} else if (this.anInt3134 == 0 && this.anInt3133 == 0) {
					this.method2421();
					this.aLong100 = local12 + 2000L;
					return;
				} else {
					this.anInt3132 = Math.min(this.anInt3133, this.anInt3134);
					this.anInt3133 = this.anInt3134;
				}
				this.aLong101 = local12 + 2000L;
				this.anInt3134 = 0;
			}
			this.anInt3135 = local36;
		} catch (@Pc(195) Exception local195) {
			this.method2421();
			this.aLong100 = local12 + 2000L;
		}
		try {
			if (local12 > this.aLong99 + 500000L) {
				local12 = this.aLong99;
			}
			while (local12 > this.aLong99 + 5000L) {
				this.method2427();
				this.aLong99 += 256000 / Static148.anInt3288;
			}
		} catch (@Pc(236) Exception local236) {
			this.aLong99 = local12;
		}
	}

	@OriginalMember(owner = "client!pg", name = "c", descriptor = "(I)V")
	public void method2417(@OriginalArg(0) int arg0) throws Exception {
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(B)V")
	public final synchronized void method2418() {
		this.aBoolean147 = true;
		try {
			this.method2428();
		} catch (@Pc(16) Exception local16) {
			this.method2421();
			this.aLong100 = Static24.method503() + 2000L;
		}
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(Ljava/awt/Component;)V")
	public void method2419(@OriginalArg(0) Component arg0) throws Exception {
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "()V")
	protected void method2420() throws Exception {
	}

	@OriginalMember(owner = "client!pg", name = "b", descriptor = "()V")
	protected void method2421() {
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(Z)V")
	public final void method2422() {
		this.aBoolean147 = true;
	}

	@OriginalMember(owner = "client!pg", name = "c", descriptor = "()I")
	protected int method2423() throws Exception {
		return this.anInt3130;
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(Lclient!rd;II)V")
	private void method2425(@OriginalArg(0) Class1_Sub3 arg0, @OriginalArg(1) int arg1) {
		@Pc(7) int local7 = arg1 >> 5;
		@Pc(18) Class1_Sub3 local18 = this.aClass1_Sub3Array6[local7];
		if (local18 == null) {
			this.aClass1_Sub3Array5[local7] = arg0;
		} else {
			local18.aClass1_Sub3_8 = arg0;
		}
		this.aClass1_Sub3Array6[local7] = arg0;
		arg0.anInt3715 = arg1;
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(ILclient!rd;)V")
	public final synchronized void method2426(@OriginalArg(1) Class1_Sub3 arg0) {
		this.aClass1_Sub3_7 = arg0;
	}

	@OriginalMember(owner = "client!pg", name = "b", descriptor = "(II)V")
	private void method2427() {
		this.anInt3129 -= 256;
		if (this.anInt3129 < 0) {
			this.anInt3129 = 0;
		}
		if (this.aClass1_Sub3_7 != null) {
			this.aClass1_Sub3_7.method2858(256);
		}
	}

	@OriginalMember(owner = "client!pg", name = "d", descriptor = "()V")
	protected void method2428() throws Exception {
	}

	@OriginalMember(owner = "client!pg", name = "d", descriptor = "(I)V")
	public final synchronized void method2429() {
		if (Static24.aClass68_1 != null) {
			@Pc(5) boolean local5 = true;
			for (@Pc(7) int local7 = 0; local7 < 2; local7++) {
				if (Static24.aClass68_1.aClass42Array1[local7] == this) {
					Static24.aClass68_1.aClass42Array1[local7] = null;
				}
				if (Static24.aClass68_1.aClass42Array1[local7] != null) {
					local5 = false;
				}
			}
			if (local5) {
				Static24.aClass68_1.aBoolean128 = true;
				while (Static24.aClass68_1.aBoolean129) {
					Static75.method3577(50L);
				}
				Static24.aClass68_1 = null;
			}
		}
		this.method2421();
		this.anIntArray256 = null;
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "([II)V")
	private void method2430(@OriginalArg(0) int[] arg0) {
		@Pc(1) short local1 = 256;
		if (Static138.aBoolean145) {
			local1 = 512;
		}
		Static214.method347(arg0, 0, local1);
		this.anInt3129 -= 256;
		if (this.aClass1_Sub3_7 != null && this.anInt3129 <= 0) {
			this.anInt3129 += Static148.anInt3288 >> 4;
			Static54.method2987(this.aClass1_Sub3_7);
			this.method2425(this.aClass1_Sub3_7, this.aClass1_Sub3_7.method2859());
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
						@Pc(88) Class1_Sub3 local88 = null;
						@Pc(93) Class1_Sub3 local93 = this.aClass1_Sub3Array5[local56];
						label97: while (true) {
							while (true) {
								if (local93 == null) {
									break label97;
								}
								@Pc(97) Class1_Sub9 local97 = local93.aClass1_Sub9_5;
								if (local97 == null || local97.anInt4137 <= local61) {
									local93.aBoolean170 = true;
									@Pc(121) int local121 = local93.method2856();
									local45 += local121;
									if (local97 != null) {
										local97.anInt4137 += local121;
									}
									if (local45 >= this.anInt3122) {
										break label103;
									}
									@Pc(140) Class1_Sub3 local140 = local93.method2854();
									if (local140 != null) {
										@Pc(145) int local145 = local93.anInt3715;
										while (local140 != null) {
											this.method2425(local140, local145 * local140.method2859() >> 8);
											local140 = local93.method2860();
										}
									}
									@Pc(164) Class1_Sub3 local164 = local93.aClass1_Sub3_8;
									local93.aClass1_Sub3_8 = null;
									if (local88 == null) {
										this.aClass1_Sub3Array5[local56] = local164;
									} else {
										local88.aClass1_Sub3_8 = local164;
									}
									if (local164 == null) {
										this.aClass1_Sub3Array6[local56] = local88;
									}
									local93 = local164;
								} else {
									local47 |= 0x1 << local56;
									local88 = local93;
									local93 = local93.aClass1_Sub3_8;
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
				@Pc(207) Class1_Sub3 local207 = this.aClass1_Sub3Array5[local56];
				this.aClass1_Sub3Array5[local56] = this.aClass1_Sub3Array6[local56] = null;
				while (local207 != null) {
					@Pc(221) Class1_Sub3 local221 = local207.aClass1_Sub3_8;
					local207.aClass1_Sub3_8 = null;
					local207 = local221;
				}
			}
		}
		if (this.anInt3129 < 0) {
			this.anInt3129 = 0;
		}
		if (this.aClass1_Sub3_7 != null) {
			this.aClass1_Sub3_7.method2855(arg0, 0, 256);
		}
		this.aLong99 = Static24.method503();
	}
}
