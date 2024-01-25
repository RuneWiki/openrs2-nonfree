import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cv")
public class Class7 {

	@OriginalMember(owner = "client!cv", name = "g", descriptor = "Lclient!ac;")
	private Class2_Sub3 aClass2_Sub3_7;

	@OriginalMember(owner = "client!cv", name = "q", descriptor = "[I")
	public int[] anIntArray525;

	@OriginalMember(owner = "client!cv", name = "x", descriptor = "I")
	private int anInt7830;

	@OriginalMember(owner = "client!cv", name = "z", descriptor = "I")
	public int anInt7832;

	@OriginalMember(owner = "client!cv", name = "C", descriptor = "I")
	public int anInt7833;

	@OriginalMember(owner = "client!cv", name = "o", descriptor = "Z")
	private boolean aBoolean663 = false;

	@OriginalMember(owner = "client!cv", name = "t", descriptor = "I")
	private final int anInt7827 = 32;

	@OriginalMember(owner = "client!cv", name = "l", descriptor = "J")
	private long aLong223 = Static362.method5133();

	@OriginalMember(owner = "client!cv", name = "A", descriptor = "Z")
	private boolean aBoolean664 = true;

	@OriginalMember(owner = "client!cv", name = "B", descriptor = "[Lclient!ac;")
	private final Class2_Sub3[] aClass2_Sub3Array5 = new Class2_Sub3[8];

	@OriginalMember(owner = "client!cv", name = "v", descriptor = "J")
	private long aLong224 = 0L;

	@OriginalMember(owner = "client!cv", name = "w", descriptor = "I")
	private int anInt7829 = 0;

	@OriginalMember(owner = "client!cv", name = "H", descriptor = "J")
	private long aLong225 = 0L;

	@OriginalMember(owner = "client!cv", name = "y", descriptor = "I")
	private int anInt7831 = 0;

	@OriginalMember(owner = "client!cv", name = "G", descriptor = "[Lclient!ac;")
	private final Class2_Sub3[] aClass2_Sub3Array6 = new Class2_Sub3[8];

	@OriginalMember(owner = "client!cv", name = "D", descriptor = "I")
	private int anInt7834 = 0;

	@OriginalMember(owner = "client!cv", name = "F", descriptor = "I")
	private int anInt7836 = 0;

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "(B)V")
	public final synchronized void method6311() {
		if (this.aBoolean663) {
			return;
		}
		@Pc(12) long local12 = Static362.method5133();
		try {
			if (local12 > this.aLong223 + 500000L) {
				this.aLong223 = local12 - 500000L;
			}
			while (this.aLong223 + 5000L < local12) {
				this.method6322();
				this.aLong223 += 256000 / Static591.anInt9580;
			}
		} catch (@Pc(56) Exception local56) {
			this.aLong223 = local12;
		}
		if (this.anIntArray525 == null) {
			return;
		}
		try {
			if (this.aLong225 != 0L) {
				if (local12 < this.aLong225) {
					return;
				}
				this.method6317(this.anInt7833);
				this.aLong225 = 0L;
				this.aBoolean664 = true;
			}
			@Pc(87) int local87 = this.method6316();
			if (this.anInt7831 - local87 > this.anInt7834) {
				this.anInt7834 = this.anInt7831 - local87;
			}
			@Pc(111) int local111 = this.anInt7830 + this.anInt7832;
			if (local111 + 256 > 16384) {
				local111 = 16128;
			}
			if (local111 + 256 > this.anInt7833) {
				this.anInt7833 += 1024;
				if (this.anInt7833 > 16384) {
					this.anInt7833 = 16384;
				}
				this.method6314();
				this.method6317(this.anInt7833);
				local87 = 0;
				if (local111 + 256 > this.anInt7833) {
					local111 = this.anInt7833 - 256;
					this.anInt7830 = local111 - this.anInt7832;
				}
				this.aBoolean664 = true;
			}
			while (local111 > local87) {
				this.method6323(this.anIntArray525);
				local87 += 256;
				this.method6313();
			}
			if (this.aLong224 < local12) {
				if (this.aBoolean664) {
					this.aBoolean664 = false;
				} else if (this.anInt7834 == 0 && this.anInt7829 == 0) {
					this.method6314();
					this.aLong225 = local12 + 2000L;
					return;
				} else {
					this.anInt7830 = Math.min(this.anInt7829, this.anInt7834);
					this.anInt7829 = this.anInt7834;
				}
				this.anInt7834 = 0;
				this.aLong224 = local12 + 2000L;
			}
			this.anInt7831 = local87;
		} catch (@Pc(248) Exception local248) {
			this.method6314();
			this.aLong225 = local12 + 2000L;
		}
	}

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "()V")
	protected void method6313() throws Exception {
	}

	@OriginalMember(owner = "client!cv", name = "b", descriptor = "()V")
	protected void method6314() {
	}

	@OriginalMember(owner = "client!cv", name = "c", descriptor = "()V")
	protected void method6315() throws Exception {
	}

	@OriginalMember(owner = "client!cv", name = "d", descriptor = "()I")
	protected int method6316() throws Exception {
		return this.anInt7833;
	}

	@OriginalMember(owner = "client!cv", name = "b", descriptor = "(I)V")
	public void method6317(@OriginalArg(0) int arg0) throws Exception {
	}

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "(Ljava/awt/Component;)V")
	public void method6318(@OriginalArg(0) Component arg0) throws Exception {
	}

	@OriginalMember(owner = "client!cv", name = "c", descriptor = "(I)V")
	public final synchronized void method6319() {
		this.aBoolean664 = true;
		try {
			this.method6315();
		} catch (@Pc(14) Exception local14) {
			this.method6314();
			this.aLong225 = Static362.method5133() + 2000L;
		}
	}

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "(Lclient!ac;II)V")
	private void method6320(@OriginalArg(0) Class2_Sub3 arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = arg1 >> 5;
		@Pc(17) Class2_Sub3 local17 = this.aClass2_Sub3Array6[local12];
		if (local17 == null) {
			this.aClass2_Sub3Array5[local12] = arg0;
		} else {
			local17.aClass2_Sub3_8 = arg0;
		}
		this.aClass2_Sub3Array6[local12] = arg0;
		arg0.anInt8294 = arg1;
	}

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "(BLclient!ac;)V")
	public final synchronized void method6321(@OriginalArg(1) Class2_Sub3 arg0) {
		this.aClass2_Sub3_7 = arg0;
	}

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "(II)V")
	private void method6322() {
		this.anInt7836 -= 256;
		if (this.anInt7836 < 0) {
			this.anInt7836 = 0;
		}
		if (this.aClass2_Sub3_7 != null) {
			this.aClass2_Sub3_7.method6700(256);
		}
	}

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "([II)V")
	private void method6323(@OriginalArg(0) int[] arg0) {
		@Pc(1) short local1 = 256;
		if (Static517.aBoolean697) {
			local1 = 512;
		}
		Static598.method4265(arg0, 0, local1);
		this.anInt7836 -= 256;
		if (this.aClass2_Sub3_7 != null && this.anInt7836 <= 0) {
			this.anInt7836 += Static591.anInt9580 >> 4;
			Static128.method1759(this.aClass2_Sub3_7);
			this.method6320(this.aClass2_Sub3_7, this.aClass2_Sub3_7.method6698());
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
						@Pc(93) Class2_Sub3 local93 = this.aClass2_Sub3Array5[local56];
						label97: while (true) {
							while (true) {
								if (local93 == null) {
									break label97;
								}
								@Pc(97) Class2_Sub13 local97 = local93.aClass2_Sub13_5;
								if (local97 == null || local97.anInt9543 <= local61) {
									local93.aBoolean699 = true;
									@Pc(121) int local121 = local93.method6699();
									local45 += local121;
									if (local97 != null) {
										local97.anInt9543 += local121;
									}
									if (local45 >= this.anInt7827) {
										break label103;
									}
									@Pc(140) Class2_Sub3 local140 = local93.method6701();
									if (local140 != null) {
										@Pc(145) int local145 = local93.anInt8294;
										while (local140 != null) {
											this.method6320(local140, local145 * local140.method6698() >> 8);
											local140 = local93.method6703();
										}
									}
									@Pc(164) Class2_Sub3 local164 = local93.aClass2_Sub3_8;
									local93.aClass2_Sub3_8 = null;
									if (local88 == null) {
										this.aClass2_Sub3Array5[local56] = local164;
									} else {
										local88.aClass2_Sub3_8 = local164;
									}
									if (local164 == null) {
										this.aClass2_Sub3Array6[local56] = local88;
									}
									local93 = local164;
								} else {
									local47 |= 0x1 << local56;
									local88 = local93;
									local93 = local93.aClass2_Sub3_8;
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
				@Pc(207) Class2_Sub3 local207 = this.aClass2_Sub3Array5[local56];
				this.aClass2_Sub3Array5[local56] = this.aClass2_Sub3Array6[local56] = null;
				while (local207 != null) {
					@Pc(221) Class2_Sub3 local221 = local207.aClass2_Sub3_8;
					local207.aClass2_Sub3_8 = null;
					local207 = local221;
				}
			}
		}
		if (this.anInt7836 < 0) {
			this.anInt7836 = 0;
		}
		if (this.aClass2_Sub3_7 != null) {
			this.aClass2_Sub3_7.method6697(arg0, 0, 256);
		}
		this.aLong223 = Static362.method5133();
	}

	@OriginalMember(owner = "client!cv", name = "d", descriptor = "(I)V")
	public final synchronized void method6324() {
		if (Static60.aClass117_1 != null) {
			@Pc(5) boolean local5 = true;
			for (@Pc(7) int local7 = 0; local7 < 2; local7++) {
				if (Static60.aClass117_1.aClass7Array1[local7] == this) {
					Static60.aClass117_1.aClass7Array1[local7] = null;
				}
				if (Static60.aClass117_1.aClass7Array1[local7] != null) {
					local5 = false;
				}
			}
			if (local5) {
				Static60.aClass117_1.aBoolean175 = true;
				while (Static60.aClass117_1.aBoolean176) {
					Static263.method3671(50L);
				}
				Static60.aClass117_1 = null;
			}
		}
		this.method6314();
		this.aBoolean663 = true;
		this.anIntArray525 = null;
	}
}
