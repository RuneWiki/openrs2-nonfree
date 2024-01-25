import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eb")
public class Class18 {

	@OriginalMember(owner = "client!eb", name = "h", descriptor = "Lclient!ad;")
	private Class2_Sub3 aClass2_Sub3_8;

	@OriginalMember(owner = "client!eb", name = "s", descriptor = "[I")
	public int[] anIntArray601;

	@OriginalMember(owner = "client!eb", name = "C", descriptor = "I")
	public int anInt7143;

	@OriginalMember(owner = "client!eb", name = "D", descriptor = "I")
	private int anInt7144;

	@OriginalMember(owner = "client!eb", name = "F", descriptor = "I")
	public int anInt7145;

	@OriginalMember(owner = "client!eb", name = "e", descriptor = "Z")
	private boolean aBoolean473 = false;

	@OriginalMember(owner = "client!eb", name = "m", descriptor = "I")
	private final int anInt7134 = 32;

	@OriginalMember(owner = "client!eb", name = "k", descriptor = "J")
	private long aLong214 = Static21.method458();

	@OriginalMember(owner = "client!eb", name = "z", descriptor = "J")
	private long aLong215 = 0L;

	@OriginalMember(owner = "client!eb", name = "y", descriptor = "Z")
	private boolean aBoolean474 = true;

	@OriginalMember(owner = "client!eb", name = "E", descriptor = "J")
	private long aLong217 = 0L;

	@OriginalMember(owner = "client!eb", name = "G", descriptor = "[Lclient!ad;")
	private final Class2_Sub3[] aClass2_Sub3Array5 = new Class2_Sub3[8];

	@OriginalMember(owner = "client!eb", name = "B", descriptor = "I")
	private int anInt7142 = 0;

	@OriginalMember(owner = "client!eb", name = "J", descriptor = "I")
	private int anInt7147 = 0;

	@OriginalMember(owner = "client!eb", name = "K", descriptor = "[Lclient!ad;")
	private final Class2_Sub3[] aClass2_Sub3Array6 = new Class2_Sub3[8];

	@OriginalMember(owner = "client!eb", name = "L", descriptor = "I")
	private int anInt7148 = 0;

	@OriginalMember(owner = "client!eb", name = "H", descriptor = "I")
	private int anInt7146 = 0;

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "()I")
	protected int method5629() throws Exception {
		return this.anInt7145;
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(IILclient!ad;)V")
	private void method5630(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub3 arg1) {
		@Pc(12) int local12 = arg0 >> 5;
		@Pc(17) Class2_Sub3 local17 = this.aClass2_Sub3Array5[local12];
		if (local17 == null) {
			this.aClass2_Sub3Array6[local12] = arg1;
		} else {
			local17.aClass2_Sub3_7 = arg1;
		}
		this.aClass2_Sub3Array5[local12] = arg1;
		arg1.anInt5724 = arg0;
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(Ljava/awt/Component;)V")
	public void method5632(@OriginalArg(0) Component arg0) throws Exception {
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(BLclient!ad;)V")
	public final synchronized void method5633(@OriginalArg(1) Class2_Sub3 arg0) {
		this.aClass2_Sub3_8 = arg0;
	}

	@OriginalMember(owner = "client!eb", name = "b", descriptor = "(I)V")
	public final void method5634() {
		this.aBoolean474 = true;
	}

	@OriginalMember(owner = "client!eb", name = "b", descriptor = "()V")
	protected void method5635() throws Exception {
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "([II)V")
	private void method5636(@OriginalArg(0) int[] arg0) {
		@Pc(1) short local1 = 256;
		if (Static314.aBoolean392) {
			local1 = 512;
		}
		Static457.method687(arg0, 0, local1);
		this.anInt7142 -= 256;
		if (this.aClass2_Sub3_8 != null && this.anInt7142 <= 0) {
			this.anInt7142 += Static410.anInt6842 >> 4;
			Static189.method5076(this.aClass2_Sub3_8);
			this.method5630(this.aClass2_Sub3_8.method4614(), this.aClass2_Sub3_8);
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
						@Pc(88) Class2_Sub3 local88 = null;
						@Pc(93) Class2_Sub3 local93 = this.aClass2_Sub3Array6[local56];
						label97: while (true) {
							while (true) {
								if (local93 == null) {
									break label97;
								}
								@Pc(97) Class2_Sub10 local97 = local93.aClass2_Sub10_5;
								if (local97 == null || local97.anInt847 <= local61) {
									local93.aBoolean404 = true;
									@Pc(121) int local121 = local93.method4613();
									local45 += local121;
									if (local97 != null) {
										local97.anInt847 += local121;
									}
									if (local45 >= this.anInt7134) {
										break label103;
									}
									@Pc(140) Class2_Sub3 local140 = local93.method4615();
									if (local140 != null) {
										@Pc(145) int local145 = local93.anInt5724;
										while (local140 != null) {
											this.method5630(local145 * local140.method4614() >> 8, local140);
											local140 = local93.method4618();
										}
									}
									@Pc(164) Class2_Sub3 local164 = local93.aClass2_Sub3_7;
									local93.aClass2_Sub3_7 = null;
									if (local88 == null) {
										this.aClass2_Sub3Array6[local56] = local164;
									} else {
										local88.aClass2_Sub3_7 = local164;
									}
									if (local164 == null) {
										this.aClass2_Sub3Array5[local56] = local88;
									}
									local93 = local164;
								} else {
									local47 |= 0x1 << local56;
									local88 = local93;
									local93 = local93.aClass2_Sub3_7;
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
				@Pc(207) Class2_Sub3 local207 = this.aClass2_Sub3Array6[local56];
				this.aClass2_Sub3Array6[local56] = this.aClass2_Sub3Array5[local56] = null;
				while (local207 != null) {
					@Pc(221) Class2_Sub3 local221 = local207.aClass2_Sub3_7;
					local207.aClass2_Sub3_7 = null;
					local207 = local221;
				}
			}
		}
		if (this.anInt7142 < 0) {
			this.anInt7142 = 0;
		}
		if (this.aClass2_Sub3_8 != null) {
			this.aClass2_Sub3_8.method4619(arg0, 0, 256);
		}
		this.aLong214 = Static21.method458();
	}

	@OriginalMember(owner = "client!eb", name = "c", descriptor = "(I)V")
	public final synchronized void method5637() {
		if (this.aBoolean473) {
			return;
		}
		@Pc(12) long local12 = Static21.method458();
		try {
			if (this.aLong214 + 500000L < local12) {
				this.aLong214 = local12 - 500000L;
			}
			while (local12 > this.aLong214 + 5000L) {
				this.method5646();
				this.aLong214 += 256000 / Static410.anInt6842;
			}
		} catch (@Pc(52) Exception local52) {
			this.aLong214 = local12;
		}
		if (this.anIntArray601 == null) {
			return;
		}
		try {
			if (this.aLong217 != 0L) {
				if (this.aLong217 > local12) {
					return;
				}
				this.method5643(this.anInt7145);
				this.aBoolean474 = true;
				this.aLong217 = 0L;
			}
			@Pc(87) int local87 = this.method5629();
			if (this.anInt7146 < this.anInt7148 - local87) {
				this.anInt7146 = this.anInt7148 - local87;
			}
			@Pc(112) int local112 = this.anInt7143 + this.anInt7144;
			if (local112 + 256 > 16384) {
				local112 = 16128;
			}
			if (this.anInt7145 < local112 + 256) {
				this.anInt7145 += 1024;
				if (this.anInt7145 > 16384) {
					this.anInt7145 = 16384;
				}
				this.method5641();
				local87 = 0;
				this.method5643(this.anInt7145);
				this.aBoolean474 = true;
				if (this.anInt7145 < local112 + 256) {
					local112 = this.anInt7145 - 256;
					this.anInt7144 = local112 - this.anInt7143;
				}
			}
			while (local112 > local87) {
				this.method5636(this.anIntArray601);
				this.method5635();
				local87 += 256;
			}
			if (local12 > this.aLong215) {
				if (this.aBoolean474) {
					this.aBoolean474 = false;
				} else if (this.anInt7146 == 0 && this.anInt7147 == 0) {
					this.method5641();
					this.aLong217 = local12 + 2000L;
					return;
				} else {
					this.anInt7144 = Math.min(this.anInt7147, this.anInt7146);
					this.anInt7147 = this.anInt7146;
				}
				this.anInt7146 = 0;
				this.aLong215 = local12 + 2000L;
			}
			this.anInt7148 = local87;
		} catch (@Pc(259) Exception local259) {
			this.method5641();
			this.aLong217 = local12 + 2000L;
		}
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(B)V")
	public final synchronized void method5639() {
		if (Static120.aClass53_1 != null) {
			@Pc(5) boolean local5 = true;
			for (@Pc(7) int local7 = 0; local7 < 2; local7++) {
				if (Static120.aClass53_1.aClass18Array1[local7] == this) {
					Static120.aClass53_1.aClass18Array1[local7] = null;
				}
				if (Static120.aClass53_1.aClass18Array1[local7] != null) {
					local5 = false;
				}
			}
			if (local5) {
				Static120.aClass53_1.aBoolean81 = true;
				while (Static120.aClass53_1.aBoolean82) {
					Static81.method1477(50L);
				}
				Static120.aClass53_1 = null;
			}
		}
		this.method5641();
		this.aBoolean473 = true;
		this.anIntArray601 = null;
	}

	@OriginalMember(owner = "client!eb", name = "c", descriptor = "()V")
	protected void method5640() throws Exception {
	}

	@OriginalMember(owner = "client!eb", name = "d", descriptor = "()V")
	protected void method5641() {
	}

	@OriginalMember(owner = "client!eb", name = "d", descriptor = "(I)V")
	public void method5643(@OriginalArg(0) int arg0) throws Exception {
	}

	@OriginalMember(owner = "client!eb", name = "f", descriptor = "(I)V")
	public final synchronized void method5645() {
		this.aBoolean474 = true;
		try {
			this.method5640();
		} catch (@Pc(10) Exception local10) {
			this.method5641();
			this.aLong217 = Static21.method458() + 2000L;
		}
	}

	@OriginalMember(owner = "client!eb", name = "b", descriptor = "(II)V")
	private void method5646() {
		this.anInt7142 -= 256;
		if (this.anInt7142 < 0) {
			this.anInt7142 = 0;
		}
		if (this.aClass2_Sub3_8 != null) {
			this.aClass2_Sub3_8.method4616(256);
		}
	}
}
