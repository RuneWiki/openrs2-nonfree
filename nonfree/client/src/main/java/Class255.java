import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nr")
public class Class255 {

	@OriginalMember(owner = "client!nr", name = "j", descriptor = "[I")
	public int[] anIntArray493;

	@OriginalMember(owner = "client!nr", name = "o", descriptor = "Lclient!km;")
	private Class5_Sub17 aClass5_Sub17_9;

	@OriginalMember(owner = "client!nr", name = "w", descriptor = "I")
	public int anInt8769;

	@OriginalMember(owner = "client!nr", name = "D", descriptor = "I")
	public int anInt8773;

	@OriginalMember(owner = "client!nr", name = "F", descriptor = "I")
	private int anInt8774;

	@OriginalMember(owner = "client!nr", name = "r", descriptor = "I")
	private final int anInt8766 = 32;

	@OriginalMember(owner = "client!nr", name = "u", descriptor = "Z")
	private boolean aBoolean744 = false;

	@OriginalMember(owner = "client!nr", name = "e", descriptor = "J")
	private long aLong246 = Static547.method7619();

	@OriginalMember(owner = "client!nr", name = "v", descriptor = "Z")
	private boolean aBoolean745 = true;

	@OriginalMember(owner = "client!nr", name = "z", descriptor = "I")
	private int anInt8771 = 0;

	@OriginalMember(owner = "client!nr", name = "y", descriptor = "J")
	private long aLong247 = 0L;

	@OriginalMember(owner = "client!nr", name = "A", descriptor = "[Lclient!km;")
	private final Class5_Sub17[] aClass5_Sub17Array5 = new Class5_Sub17[8];

	@OriginalMember(owner = "client!nr", name = "B", descriptor = "[Lclient!km;")
	private final Class5_Sub17[] aClass5_Sub17Array6 = new Class5_Sub17[8];

	@OriginalMember(owner = "client!nr", name = "x", descriptor = "I")
	private int anInt8770 = 0;

	@OriginalMember(owner = "client!nr", name = "C", descriptor = "I")
	private int anInt8772 = 0;

	@OriginalMember(owner = "client!nr", name = "E", descriptor = "J")
	private long aLong248 = 0L;

	@OriginalMember(owner = "client!nr", name = "G", descriptor = "I")
	private int anInt8775 = 0;

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "()V")
	protected void method7445() {
	}

	@OriginalMember(owner = "client!nr", name = "b", descriptor = "()V")
	protected void method7448() throws Exception {
	}

	@OriginalMember(owner = "client!nr", name = "c", descriptor = "()I")
	protected int method7450() throws Exception {
		return this.anInt8769;
	}

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(B)V")
	public final synchronized void method7451() {
		if (Static610.aClass283_1 != null) {
			@Pc(7) boolean local7 = true;
			for (@Pc(9) int local9 = 0; local9 < 2; local9++) {
				if (Static610.aClass283_1.aClass255Array1[local9] == this) {
					Static610.aClass283_1.aClass255Array1[local9] = null;
				}
				if (Static610.aClass283_1.aClass255Array1[local9] != null) {
					local7 = false;
				}
			}
			if (local7) {
				Static610.aClass283_1.aBoolean672 = true;
				while (Static610.aClass283_1.aBoolean671) {
					Static579.method8004(50L);
				}
				Static610.aClass283_1 = null;
			}
		}
		this.method7445();
		this.aBoolean744 = true;
		this.anIntArray493 = null;
	}

	@OriginalMember(owner = "client!nr", name = "b", descriptor = "(I)V")
	public final synchronized void method7452() {
		if (this.aBoolean744) {
			return;
		}
		@Pc(18) long local18 = Static547.method7619();
		try {
			if (local18 > this.aLong246 + 6000L) {
				this.aLong246 = local18 - 6000L;
			}
			while (this.aLong246 + 5000L < local18) {
				this.method7458();
				this.aLong246 += (long) (256000 / Static302.anInt5797);
				local18 = Static547.method7619();
			}
		} catch (@Pc(60) Exception local60) {
			this.aLong246 = local18;
		}
		if (this.anIntArray493 == null) {
			return;
		}
		try {
			if (this.aLong247 != 0L) {
				if (this.aLong247 > local18) {
					return;
				}
				this.method7459(this.anInt8769);
				this.aLong247 = 0L;
				this.aBoolean745 = true;
			}
			@Pc(91) int local91 = this.method7450();
			if (this.anInt8771 - local91 > this.anInt8775) {
				this.anInt8775 = this.anInt8771 - local91;
			}
			@Pc(112) int local112 = this.anInt8773 + this.anInt8774;
			if (local112 + 256 > 16384) {
				local112 = 16128;
			}
			if (local112 + 256 > this.anInt8769) {
				this.anInt8769 += 1024;
				if (this.anInt8769 > 16384) {
					this.anInt8769 = 16384;
				}
				this.method7445();
				local91 = 0;
				this.method7459(this.anInt8769);
				this.aBoolean745 = true;
				if (this.anInt8769 < local112 + 256) {
					local112 = this.anInt8769 - 256;
					this.anInt8774 = local112 - this.anInt8773;
				}
			}
			while (local112 > local91) {
				this.method7460(this.anIntArray493);
				local91 += 256;
				this.method7448();
			}
			if (this.aLong248 < local18) {
				if (this.aBoolean745) {
					this.aBoolean745 = false;
				} else if (this.anInt8775 == 0 && this.anInt8770 == 0) {
					this.method7445();
					this.aLong247 = local18 + 2000L;
					return;
				} else {
					this.anInt8774 = Math.min(this.anInt8770, this.anInt8775);
					this.anInt8770 = this.anInt8775;
				}
				this.aLong248 = local18 + 2000L;
				this.anInt8775 = 0;
			}
			this.anInt8771 = local91;
		} catch (@Pc(245) Exception local245) {
			this.method7445();
			this.aLong247 = local18 + 2000L;
		}
	}

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(Lclient!km;II)V")
	private void method7453(@OriginalArg(0) Class5_Sub17 arg0, @OriginalArg(1) int arg1) {
		@Pc(7) int local7 = arg1 >> 5;
		@Pc(12) Class5_Sub17 local12 = this.aClass5_Sub17Array5[local7];
		if (local12 == null) {
			this.aClass5_Sub17Array6[local7] = arg0;
		} else {
			local12.aClass5_Sub17_7 = arg0;
		}
		this.aClass5_Sub17Array5[local7] = arg0;
		arg0.anInt7858 = arg1;
	}

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(Lclient!km;I)V")
	public final synchronized void method7454(@OriginalArg(0) Class5_Sub17 arg0) {
		this.aClass5_Sub17_9 = arg0;
	}

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(Ljava/awt/Component;)V")
	public void method7455(@OriginalArg(0) Component arg0) throws Exception {
	}

	@OriginalMember(owner = "client!nr", name = "b", descriptor = "(B)V")
	public final synchronized void method7456() {
		this.aBoolean745 = true;
		try {
			this.method7461();
		} catch (@Pc(10) Exception local10) {
			this.method7445();
			this.aLong247 = Static547.method7619() + 2000L;
		}
	}

	@OriginalMember(owner = "client!nr", name = "b", descriptor = "(II)V")
	private void method7458() {
		this.anInt8772 -= 256;
		if (this.anInt8772 < 0) {
			this.anInt8772 = 0;
		}
		if (this.aClass5_Sub17_9 != null) {
			this.aClass5_Sub17_9.method6650(256);
		}
	}

	@OriginalMember(owner = "client!nr", name = "c", descriptor = "(I)V")
	public void method7459(@OriginalArg(0) int arg0) throws Exception {
	}

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "([II)V")
	private void method7460(@OriginalArg(0) int[] arg0) {
		@Pc(1) short local1 = 256;
		if (Static143.aBoolean243) {
			local1 = 512;
		}
		Static686.method4969(arg0, 0, local1);
		this.anInt8772 -= 256;
		if (this.aClass5_Sub17_9 != null && this.anInt8772 <= 0) {
			this.anInt8772 += Static302.anInt5797 >> 4;
			Static222.method3493(this.aClass5_Sub17_9);
			this.method7453(this.aClass5_Sub17_9, this.aClass5_Sub17_9.method6651());
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
						@Pc(88) Class5_Sub17 local88 = null;
						@Pc(93) Class5_Sub17 local93 = this.aClass5_Sub17Array6[local56];
						label97: while (true) {
							while (true) {
								if (local93 == null) {
									break label97;
								}
								@Pc(97) Class5_Sub42 local97 = local93.aClass5_Sub42_6;
								if (local97 == null || local97.anInt7020 <= local61) {
									local93.aBoolean675 = true;
									@Pc(121) int local121 = local93.method6646();
									local45 += local121;
									if (local97 != null) {
										local97.anInt7020 += local121;
									}
									if (local45 >= this.anInt8766) {
										break label103;
									}
									@Pc(140) Class5_Sub17 local140 = local93.method6649();
									if (local140 != null) {
										@Pc(145) int local145 = local93.anInt7858;
										while (local140 != null) {
											this.method7453(local140, local145 * local140.method6651() >> 8);
											local140 = local93.method6652();
										}
									}
									@Pc(164) Class5_Sub17 local164 = local93.aClass5_Sub17_7;
									local93.aClass5_Sub17_7 = null;
									if (local88 == null) {
										this.aClass5_Sub17Array6[local56] = local164;
									} else {
										local88.aClass5_Sub17_7 = local164;
									}
									if (local164 == null) {
										this.aClass5_Sub17Array5[local56] = local88;
									}
									local93 = local164;
								} else {
									local47 |= 0x1 << local56;
									local88 = local93;
									local93 = local93.aClass5_Sub17_7;
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
				@Pc(207) Class5_Sub17 local207 = this.aClass5_Sub17Array6[local56];
				this.aClass5_Sub17Array6[local56] = this.aClass5_Sub17Array5[local56] = null;
				while (local207 != null) {
					@Pc(221) Class5_Sub17 local221 = local207.aClass5_Sub17_7;
					local207.aClass5_Sub17_7 = null;
					local207 = local221;
				}
			}
		}
		if (this.anInt8772 < 0) {
			this.anInt8772 = 0;
		}
		if (this.aClass5_Sub17_9 != null) {
			this.aClass5_Sub17_9.method6647(arg0, 0, 256);
		}
		this.aLong246 = Static547.method7619();
	}

	@OriginalMember(owner = "client!nr", name = "d", descriptor = "()V")
	protected void method7461() throws Exception {
	}
}
