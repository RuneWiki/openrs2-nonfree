import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ou")
public class Class141 {

	@OriginalMember(owner = "client!ou", name = "l", descriptor = "Lclient!gm;")
	private Class2_Sub18 aClass2_Sub18_8;

	@OriginalMember(owner = "client!ou", name = "r", descriptor = "[I")
	public int[] anIntArray440;

	@OriginalMember(owner = "client!ou", name = "B", descriptor = "I")
	public int anInt6626;

	@OriginalMember(owner = "client!ou", name = "D", descriptor = "I")
	public int anInt6628;

	@OriginalMember(owner = "client!ou", name = "G", descriptor = "I")
	private int anInt6629;

	@OriginalMember(owner = "client!ou", name = "m", descriptor = "I")
	private final int anInt6617 = 32;

	@OriginalMember(owner = "client!ou", name = "u", descriptor = "Z")
	private boolean aBoolean568 = false;

	@OriginalMember(owner = "client!ou", name = "g", descriptor = "J")
	private long aLong188 = Static208.method3182();

	@OriginalMember(owner = "client!ou", name = "v", descriptor = "[Lclient!gm;")
	private final Class2_Sub18[] aClass2_Sub18Array5 = new Class2_Sub18[8];

	@OriginalMember(owner = "client!ou", name = "x", descriptor = "J")
	private long aLong190 = 0L;

	@OriginalMember(owner = "client!ou", name = "z", descriptor = "I")
	private int anInt6624 = 0;

	@OriginalMember(owner = "client!ou", name = "y", descriptor = "I")
	private int anInt6623 = 0;

	@OriginalMember(owner = "client!ou", name = "C", descriptor = "I")
	private int anInt6627 = 0;

	@OriginalMember(owner = "client!ou", name = "w", descriptor = "Z")
	private boolean aBoolean569 = true;

	@OriginalMember(owner = "client!ou", name = "A", descriptor = "I")
	private int anInt6625 = 0;

	@OriginalMember(owner = "client!ou", name = "E", descriptor = "J")
	private long aLong191 = 0L;

	@OriginalMember(owner = "client!ou", name = "F", descriptor = "[Lclient!gm;")
	private final Class2_Sub18[] aClass2_Sub18Array6 = new Class2_Sub18[8];

	static {
		new Class256(null, "Mitglieder können 200 Freunde hinzufügen, freie Spieler nur 100.", null, null);
	}

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(B)V")
	public final synchronized void method5187() {
		this.aBoolean569 = true;
		try {
			this.method5193();
		} catch (@Pc(16) Exception local16) {
			this.method5194();
			this.aLong190 = Static208.method3182() + 2000L;
		}
	}

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "([II)V")
	private void method5188(@OriginalArg(0) int[] arg0) {
		@Pc(1) short local1 = 256;
		if (Static451.aBoolean125) {
			local1 = 512;
		}
		Static459.method3350(arg0, 0, local1);
		this.anInt6624 -= 256;
		if (this.aClass2_Sub18_8 != null && this.anInt6624 <= 0) {
			this.anInt6624 += Static369.anInt6566 >> 4;
			Static403.method5485(this.aClass2_Sub18_8);
			this.method5201(this.aClass2_Sub18_8.method4449(), this.aClass2_Sub18_8);
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
						@Pc(88) Class2_Sub18 local88 = null;
						@Pc(93) Class2_Sub18 local93 = this.aClass2_Sub18Array5[local56];
						label97: while (true) {
							while (true) {
								if (local93 == null) {
									break label97;
								}
								@Pc(97) Class2_Sub41 local97 = local93.aClass2_Sub41_5;
								if (local97 == null || local97.anInt7098 <= local61) {
									local93.aBoolean475 = true;
									@Pc(121) int local121 = local93.method4445();
									local45 += local121;
									if (local97 != null) {
										local97.anInt7098 += local121;
									}
									if (local45 >= this.anInt6617) {
										break label103;
									}
									@Pc(140) Class2_Sub18 local140 = local93.method4448();
									if (local140 != null) {
										@Pc(145) int local145 = local93.anInt5485;
										while (local140 != null) {
											this.method5201(local145 * local140.method4449() >> 8, local140);
											local140 = local93.method4451();
										}
									}
									@Pc(164) Class2_Sub18 local164 = local93.aClass2_Sub18_7;
									local93.aClass2_Sub18_7 = null;
									if (local88 == null) {
										this.aClass2_Sub18Array5[local56] = local164;
									} else {
										local88.aClass2_Sub18_7 = local164;
									}
									if (local164 == null) {
										this.aClass2_Sub18Array6[local56] = local88;
									}
									local93 = local164;
								} else {
									local47 |= 0x1 << local56;
									local88 = local93;
									local93 = local93.aClass2_Sub18_7;
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
				@Pc(207) Class2_Sub18 local207 = this.aClass2_Sub18Array5[local56];
				this.aClass2_Sub18Array5[local56] = this.aClass2_Sub18Array6[local56] = null;
				while (local207 != null) {
					@Pc(221) Class2_Sub18 local221 = local207.aClass2_Sub18_7;
					local207.aClass2_Sub18_7 = null;
					local207 = local221;
				}
			}
		}
		if (this.anInt6624 < 0) {
			this.anInt6624 = 0;
		}
		if (this.aClass2_Sub18_8 != null) {
			this.aClass2_Sub18_8.method4446(arg0, 0, 256);
		}
		this.aLong188 = Static208.method3182();
	}

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(Ljava/awt/Component;)V")
	public void method5189(@OriginalArg(0) Component arg0) throws Exception {
	}

	@OriginalMember(owner = "client!ou", name = "b", descriptor = "(I)V")
	public void method5191(@OriginalArg(0) int arg0) throws Exception {
	}

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "()V")
	protected void method5192() throws Exception {
	}

	@OriginalMember(owner = "client!ou", name = "b", descriptor = "()V")
	protected void method5193() throws Exception {
	}

	@OriginalMember(owner = "client!ou", name = "c", descriptor = "()V")
	protected void method5194() {
	}

	@OriginalMember(owner = "client!ou", name = "d", descriptor = "()I")
	protected int method5195() throws Exception {
		return this.anInt6628;
	}

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(ZLclient!gm;)V")
	public final synchronized void method5196(@OriginalArg(1) Class2_Sub18 arg0) {
		this.aClass2_Sub18_8 = arg0;
	}

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(BI)V")
	private void method5197() {
		this.anInt6624 -= 256;
		if (this.anInt6624 < 0) {
			this.anInt6624 = 0;
		}
		if (this.aClass2_Sub18_8 != null) {
			this.aClass2_Sub18_8.method4450(256);
		}
	}

	@OriginalMember(owner = "client!ou", name = "c", descriptor = "(I)V")
	public final synchronized void method5198() {
		if (Static4.aClass48_1 != null) {
			@Pc(9) boolean local9 = true;
			for (@Pc(11) int local11 = 0; local11 < 2; local11++) {
				if (Static4.aClass48_1.aClass141Array1[local11] == this) {
					Static4.aClass48_1.aClass141Array1[local11] = null;
				}
				if (Static4.aClass48_1.aClass141Array1[local11] != null) {
					local9 = false;
				}
			}
			if (local9) {
				Static4.aClass48_1.aBoolean156 = true;
				while (Static4.aClass48_1.aBoolean155) {
					Static443.method5991(50L);
				}
				Static4.aClass48_1 = null;
			}
		}
		this.method5194();
		this.anIntArray440 = null;
		this.aBoolean568 = true;
	}

	@OriginalMember(owner = "client!ou", name = "d", descriptor = "(I)V")
	public final synchronized void method5200() {
		if (this.aBoolean568) {
			return;
		}
		@Pc(12) long local12 = Static208.method3182();
		try {
			if (this.aLong188 + 500000L < local12) {
				this.aLong188 = local12 - 500000L;
			}
			while (local12 > this.aLong188 + 5000L) {
				this.method5197();
				this.aLong188 += 256000 / Static369.anInt6566;
			}
		} catch (@Pc(56) Exception local56) {
			this.aLong188 = local12;
		}
		if (this.anIntArray440 == null) {
			return;
		}
		try {
			if (this.aLong190 != (long) 0) {
				if (this.aLong190 > local12) {
					return;
				}
				this.method5191(this.anInt6628);
				this.aLong190 = 0L;
				this.aBoolean569 = true;
			}
			@Pc(92) int local92 = this.method5195();
			if (this.anInt6625 - local92 > this.anInt6623) {
				this.anInt6623 = this.anInt6625 - local92;
			}
			@Pc(116) int local116 = this.anInt6629 + this.anInt6626;
			if (local116 + 256 > 16384) {
				local116 = 16128;
			}
			if (this.anInt6628 < local116 + 256) {
				this.anInt6628 += 1024;
				if (this.anInt6628 > 16384) {
					this.anInt6628 = 16384;
				}
				this.method5194();
				local92 = 0;
				this.method5191(this.anInt6628);
				this.aBoolean569 = true;
				if (this.anInt6628 < local116 + 256) {
					local116 = this.anInt6628 - 256;
					this.anInt6629 = local116 - this.anInt6626;
				}
			}
			while (local92 < local116) {
				this.method5188(this.anIntArray440);
				local92 += 256;
				this.method5192();
			}
			if (this.aLong191 < local12) {
				if (this.aBoolean569) {
					this.aBoolean569 = false;
				} else if (this.anInt6623 == 0 && this.anInt6627 == 0) {
					this.method5194();
					this.aLong190 = local12 + 2000L;
					return;
				} else {
					this.anInt6629 = Math.min(this.anInt6627, this.anInt6623);
					this.anInt6627 = this.anInt6623;
				}
				this.aLong191 = local12 + 2000L;
				this.anInt6623 = 0;
			}
			this.anInt6625 = local92;
		} catch (@Pc(257) Exception local257) {
			this.method5194();
			this.aLong190 = local12 + 2000L;
		}
	}

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(IBLclient!gm;)V")
	private void method5201(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub18 arg1) {
		@Pc(7) int local7 = arg0 >> 5;
		@Pc(12) Class2_Sub18 local12 = this.aClass2_Sub18Array6[local7];
		if (local12 == null) {
			this.aClass2_Sub18Array5[local7] = arg1;
		} else {
			local12.aClass2_Sub18_7 = arg1;
		}
		this.aClass2_Sub18Array6[local7] = arg1;
		arg1.anInt5485 = arg0;
	}

	@OriginalMember(owner = "client!ou", name = "e", descriptor = "(I)V")
	public final void method5202() {
		this.aBoolean569 = true;
	}
}
