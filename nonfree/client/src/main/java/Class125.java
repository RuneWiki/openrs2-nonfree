import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!po")
public class Class125 {

	@OriginalMember(owner = "client!po", name = "l", descriptor = "Lclient!pl;")
	private Class1_Sub31 aClass1_Sub31_7;

	@OriginalMember(owner = "client!po", name = "n", descriptor = "[I")
	public int[] anIntArray588;

	@OriginalMember(owner = "client!po", name = "w", descriptor = "I")
	private int anInt6137;

	@OriginalMember(owner = "client!po", name = "A", descriptor = "I")
	public int anInt6140;

	@OriginalMember(owner = "client!po", name = "F", descriptor = "I")
	public int anInt6144;

	@OriginalMember(owner = "client!po", name = "f", descriptor = "Z")
	private boolean aBoolean507 = false;

	@OriginalMember(owner = "client!po", name = "o", descriptor = "I")
	private final int anInt6129 = 32;

	@OriginalMember(owner = "client!po", name = "m", descriptor = "J")
	private long aLong198 = Static292.method5114();

	@OriginalMember(owner = "client!po", name = "y", descriptor = "I")
	private int anInt6139 = 0;

	@OriginalMember(owner = "client!po", name = "x", descriptor = "I")
	private int anInt6138 = 0;

	@OriginalMember(owner = "client!po", name = "z", descriptor = "J")
	private long aLong199 = 0L;

	@OriginalMember(owner = "client!po", name = "B", descriptor = "I")
	private int anInt6141 = 0;

	@OriginalMember(owner = "client!po", name = "H", descriptor = "J")
	private long aLong200 = 0L;

	@OriginalMember(owner = "client!po", name = "D", descriptor = "I")
	private int anInt6143 = 0;

	@OriginalMember(owner = "client!po", name = "I", descriptor = "Z")
	private boolean aBoolean508 = true;

	@OriginalMember(owner = "client!po", name = "G", descriptor = "[Lclient!pl;")
	private final Class1_Sub31[] aClass1_Sub31Array6 = new Class1_Sub31[8];

	@OriginalMember(owner = "client!po", name = "E", descriptor = "[Lclient!pl;")
	private final Class1_Sub31[] aClass1_Sub31Array5 = new Class1_Sub31[8];

	@OriginalMember(owner = "client!po", name = "a", descriptor = "()I")
	protected int method5302() throws Exception {
		return this.anInt6140;
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(Ljava/awt/Component;)V")
	public void method5304(@OriginalArg(0) Component arg0) throws Exception {
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(I)V")
	public final synchronized void method5305() {
		this.aBoolean508 = true;
		try {
			this.method5315();
		} catch (@Pc(16) Exception local16) {
			this.method5313();
			this.aLong199 = Static292.method5114() + 2000L;
		}
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(BLclient!pl;)V")
	public final synchronized void method5307(@OriginalArg(1) Class1_Sub31 arg0) {
		this.aClass1_Sub31_7 = arg0;
	}

	@OriginalMember(owner = "client!po", name = "b", descriptor = "()V")
	protected void method5308() throws Exception {
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(Lclient!pl;IZ)V")
	private void method5309(@OriginalArg(0) Class1_Sub31 arg0, @OriginalArg(1) int arg1) {
		@Pc(11) int local11 = arg1 >> 5;
		@Pc(16) Class1_Sub31 local16 = this.aClass1_Sub31Array5[local11];
		if (local16 == null) {
			this.aClass1_Sub31Array6[local11] = arg0;
		} else {
			local16.aClass1_Sub31_8 = arg0;
		}
		this.aClass1_Sub31Array5[local11] = arg0;
		arg0.anInt6416 = arg1;
	}

	@OriginalMember(owner = "client!po", name = "c", descriptor = "(I)V")
	public final synchronized void method5311() {
		if (this.aBoolean507) {
			return;
		}
		@Pc(12) long local12 = Static292.method5114();
		try {
			if (local12 > this.aLong198 + 500000L) {
				this.aLong198 = local12 - 500000L;
			}
			while (this.aLong198 + 5000L < local12) {
				this.method5317();
				this.aLong198 += 256000 / Static348.anInt6162;
			}
		} catch (@Pc(52) Exception local52) {
			this.aLong198 = local12;
		}
		if (this.anIntArray588 == null) {
			return;
		}
		try {
			if (this.aLong199 != 0L) {
				if (this.aLong199 > local12) {
					return;
				}
				this.method5312(this.anInt6140);
				this.aBoolean508 = true;
				this.aLong199 = 0L;
			}
			@Pc(83) int local83 = this.method5302();
			if (this.anInt6139 - local83 > this.anInt6141) {
				this.anInt6141 = this.anInt6139 - local83;
			}
			@Pc(107) int local107 = this.anInt6137 + this.anInt6144;
			if (local107 + 256 > 16384) {
				local107 = 16128;
			}
			if (this.anInt6140 < local107 + 256) {
				this.anInt6140 += 1024;
				if (this.anInt6140 > 16384) {
					this.anInt6140 = 16384;
				}
				this.method5313();
				local83 = 0;
				this.method5312(this.anInt6140);
				this.aBoolean508 = true;
				if (local107 + 256 > this.anInt6140) {
					local107 = this.anInt6140 - 256;
					this.anInt6137 = local107 - this.anInt6144;
				}
			}
			while (local107 > local83) {
				this.method5314(this.anIntArray588);
				local83 += 256;
				this.method5308();
			}
			if (this.aLong200 < local12) {
				if (this.aBoolean508) {
					this.aBoolean508 = false;
				} else if (this.anInt6141 == 0 && this.anInt6138 == 0) {
					this.method5313();
					this.aLong199 = local12 + 2000L;
					return;
				} else {
					this.anInt6137 = Math.min(this.anInt6138, this.anInt6141);
					this.anInt6138 = this.anInt6141;
				}
				this.aLong200 = local12 + 2000L;
				this.anInt6141 = 0;
			}
			this.anInt6139 = local83;
		} catch (@Pc(246) Exception local246) {
			this.method5313();
			this.aLong199 = local12 + 2000L;
		}
	}

	@OriginalMember(owner = "client!po", name = "d", descriptor = "(I)V")
	public void method5312(@OriginalArg(0) int arg0) throws Exception {
	}

	@OriginalMember(owner = "client!po", name = "c", descriptor = "()V")
	protected void method5313() {
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "([II)V")
	private void method5314(@OriginalArg(0) int[] arg0) {
		@Pc(1) short local1 = 256;
		if (Static340.aBoolean542) {
			local1 = 512;
		}
		Static361.method1855(arg0, 0, local1);
		this.anInt6143 -= 256;
		if (this.aClass1_Sub31_7 != null && this.anInt6143 <= 0) {
			this.anInt6143 += Static348.anInt6162 >> 4;
			Static260.method4682(this.aClass1_Sub31_7);
			this.method5309(this.aClass1_Sub31_7, this.aClass1_Sub31_7.method5512());
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
						@Pc(88) Class1_Sub31 local88 = null;
						@Pc(93) Class1_Sub31 local93 = this.aClass1_Sub31Array6[local56];
						label97: while (true) {
							while (true) {
								if (local93 == null) {
									break label97;
								}
								@Pc(97) Class1_Sub20 local97 = local93.aClass1_Sub20_5;
								if (local97 == null || local97.anInt2540 <= local61) {
									local93.aBoolean530 = true;
									@Pc(121) int local121 = local93.method5518();
									local45 += local121;
									if (local97 != null) {
										local97.anInt2540 += local121;
									}
									if (local45 >= this.anInt6129) {
										break label103;
									}
									@Pc(140) Class1_Sub31 local140 = local93.method5517();
									if (local140 != null) {
										@Pc(145) int local145 = local93.anInt6416;
										while (local140 != null) {
											this.method5309(local140, local145 * local140.method5512() >> 8);
											local140 = local93.method5513();
										}
									}
									@Pc(164) Class1_Sub31 local164 = local93.aClass1_Sub31_8;
									local93.aClass1_Sub31_8 = null;
									if (local88 == null) {
										this.aClass1_Sub31Array6[local56] = local164;
									} else {
										local88.aClass1_Sub31_8 = local164;
									}
									if (local164 == null) {
										this.aClass1_Sub31Array5[local56] = local88;
									}
									local93 = local164;
								} else {
									local47 |= 0x1 << local56;
									local88 = local93;
									local93 = local93.aClass1_Sub31_8;
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
				@Pc(207) Class1_Sub31 local207 = this.aClass1_Sub31Array6[local56];
				this.aClass1_Sub31Array6[local56] = this.aClass1_Sub31Array5[local56] = null;
				while (local207 != null) {
					@Pc(221) Class1_Sub31 local221 = local207.aClass1_Sub31_8;
					local207.aClass1_Sub31_8 = null;
					local207 = local221;
				}
			}
		}
		if (this.anInt6143 < 0) {
			this.anInt6143 = 0;
		}
		if (this.aClass1_Sub31_7 != null) {
			this.aClass1_Sub31_7.method5516(arg0, 0, 256);
		}
		this.aLong198 = Static292.method5114();
	}

	@OriginalMember(owner = "client!po", name = "d", descriptor = "()V")
	protected void method5315() throws Exception {
	}

	@OriginalMember(owner = "client!po", name = "e", descriptor = "(I)V")
	public final void method5316() {
		this.aBoolean508 = true;
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(BI)V")
	private void method5317() {
		this.anInt6143 -= 256;
		if (this.anInt6143 < 0) {
			this.anInt6143 = 0;
		}
		if (this.aClass1_Sub31_7 != null) {
			this.aClass1_Sub31_7.method5514(256);
		}
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(B)V")
	public final synchronized void method5318() {
		if (Static250.aClass5_1 != null) {
			@Pc(5) boolean local5 = true;
			for (@Pc(7) int local7 = 0; local7 < 2; local7++) {
				if (Static250.aClass5_1.aClass125Array1[local7] == this) {
					Static250.aClass5_1.aClass125Array1[local7] = null;
				}
				if (Static250.aClass5_1.aClass125Array1[local7] != null) {
					local5 = false;
				}
			}
			if (local5) {
				Static250.aClass5_1.aBoolean6 = true;
				while (Static250.aClass5_1.aBoolean7) {
					Static163.method2863(50L);
				}
				Static250.aClass5_1 = null;
			}
		}
		this.method5313();
		this.aBoolean507 = true;
		this.anIntArray588 = null;
	}
}
