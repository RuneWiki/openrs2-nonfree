import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dc")
public class Class45 {

	@OriginalMember(owner = "client!dc", name = "B", descriptor = "Lclient!gh;")
	private Class2_Sub2 aClass2_Sub2_6;

	@OriginalMember(owner = "client!dc", name = "C", descriptor = "[I")
	public int[] anIntArray443;

	@OriginalMember(owner = "client!dc", name = "F", descriptor = "I")
	public int anInt3706;

	@OriginalMember(owner = "client!dc", name = "N", descriptor = "I")
	public int anInt3711;

	@OriginalMember(owner = "client!dc", name = "R", descriptor = "I")
	private int anInt3713;

	@OriginalMember(owner = "client!dc", name = "m", descriptor = "I")
	private final int anInt3692 = 32;

	@OriginalMember(owner = "client!dc", name = "r", descriptor = "Z")
	private boolean aBoolean274 = false;

	@OriginalMember(owner = "client!dc", name = "l", descriptor = "J")
	private long aLong118 = Static51.method979();

	@OriginalMember(owner = "client!dc", name = "E", descriptor = "[Lclient!gh;")
	private final Class2_Sub2[] aClass2_Sub2Array5 = new Class2_Sub2[8];

	@OriginalMember(owner = "client!dc", name = "H", descriptor = "Z")
	private boolean aBoolean275 = true;

	@OriginalMember(owner = "client!dc", name = "L", descriptor = "[Lclient!gh;")
	private final Class2_Sub2[] aClass2_Sub2Array6 = new Class2_Sub2[8];

	@OriginalMember(owner = "client!dc", name = "I", descriptor = "I")
	private int anInt3708 = 0;

	@OriginalMember(owner = "client!dc", name = "M", descriptor = "I")
	private int anInt3710 = 0;

	@OriginalMember(owner = "client!dc", name = "G", descriptor = "I")
	private int anInt3707 = 0;

	@OriginalMember(owner = "client!dc", name = "P", descriptor = "J")
	private long aLong120 = 0L;

	@OriginalMember(owner = "client!dc", name = "K", descriptor = "J")
	private long aLong119 = 0L;

	@OriginalMember(owner = "client!dc", name = "J", descriptor = "I")
	private int anInt3709 = 0;

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "()V")
	protected void method3353() throws Exception {
	}

	@OriginalMember(owner = "client!dc", name = "b", descriptor = "()V")
	protected void method3354() throws Exception {
	}

	@OriginalMember(owner = "client!dc", name = "c", descriptor = "()I")
	protected int method3355() throws Exception {
		return this.anInt3711;
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(Ljava/awt/Component;)V")
	public void method3358(@OriginalArg(0) Component arg0) throws Exception {
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(ILclient!gh;I)V")
	private void method3360(@OriginalArg(1) Class2_Sub2 arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = arg1 >> 5;
		@Pc(12) Class2_Sub2 local12 = this.aClass2_Sub2Array5[local7];
		if (local12 == null) {
			this.aClass2_Sub2Array6[local7] = arg0;
		} else {
			local12.aClass2_Sub2_8 = arg0;
		}
		this.aClass2_Sub2Array5[local7] = arg0;
		arg0.anInt5511 = arg1;
	}

	@OriginalMember(owner = "client!dc", name = "b", descriptor = "(I)V")
	public void method3362(@OriginalArg(0) int arg0) throws Exception {
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(Lclient!gh;I)V")
	public final synchronized void method3363(@OriginalArg(0) Class2_Sub2 arg0) {
		this.aClass2_Sub2_6 = arg0;
	}

	@OriginalMember(owner = "client!dc", name = "d", descriptor = "()V")
	protected void method3364() {
	}

	@OriginalMember(owner = "client!dc", name = "c", descriptor = "(I)V")
	public final synchronized void method3366() {
		this.aBoolean275 = true;
		try {
			this.method3354();
		} catch (@Pc(14) Exception local14) {
			this.method3364();
			this.aLong120 = Static51.method979() + 2000L;
		}
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(B)V")
	public final synchronized void method3368() {
		if (Static249.aClass39_1 != null) {
			@Pc(5) boolean local5 = true;
			for (@Pc(7) int local7 = 0; local7 < 2; local7++) {
				if (Static249.aClass39_1.aClass45Array1[local7] == this) {
					Static249.aClass39_1.aClass45Array1[local7] = null;
				}
				if (Static249.aClass39_1.aClass45Array1[local7] != null) {
					local5 = false;
				}
			}
			if (local5) {
				Static249.aClass39_1.aBoolean83 = true;
				while (Static249.aClass39_1.aBoolean84) {
					Static185.method3004(50L);
				}
				Static249.aClass39_1 = null;
			}
		}
		this.method3364();
		this.aBoolean274 = true;
		this.anIntArray443 = null;
	}

	@OriginalMember(owner = "client!dc", name = "e", descriptor = "(I)V")
	public final synchronized void method3370() {
		if (this.aBoolean274) {
			return;
		}
		@Pc(14) long local14 = Static51.method979();
		try {
			if (local14 > this.aLong118 + 500000L) {
				this.aLong118 = local14 - 500000L;
			}
			while (local14 > this.aLong118 + 5000L) {
				this.method3373();
				this.aLong118 += 256000 / Static221.anInt4100;
			}
		} catch (@Pc(50) Exception local50) {
			this.aLong118 = local14;
		}
		if (this.anIntArray443 == null) {
			return;
		}
		try {
			if (this.aLong120 != 0L) {
				if (this.aLong120 > local14) {
					return;
				}
				this.method3362(this.anInt3711);
				this.aLong120 = 0L;
				this.aBoolean275 = true;
			}
			@Pc(87) int local87 = this.method3355();
			if (this.anInt3709 < this.anInt3707 - local87) {
				this.anInt3709 = this.anInt3707 - local87;
			}
			@Pc(107) int local107 = this.anInt3706 + this.anInt3713;
			if (local107 + 256 > 16384) {
				local107 = 16128;
			}
			if (local107 + 256 > this.anInt3711) {
				this.anInt3711 += 1024;
				if (this.anInt3711 > 16384) {
					this.anInt3711 = 16384;
				}
				this.method3364();
				this.method3362(this.anInt3711);
				local87 = 0;
				this.aBoolean275 = true;
				if (local107 + 256 > this.anInt3711) {
					local107 = this.anInt3711 - 256;
					this.anInt3713 = local107 - this.anInt3706;
				}
			}
			while (local107 > local87) {
				this.method3372(this.anIntArray443);
				this.method3353();
				local87 += 256;
			}
			if (local14 > this.aLong119) {
				if (this.aBoolean275) {
					this.aBoolean275 = false;
				} else if (this.anInt3709 == 0 && this.anInt3708 == 0) {
					this.method3364();
					this.aLong120 = local14 + 2000L;
					return;
				} else {
					this.anInt3713 = Math.min(this.anInt3708, this.anInt3709);
					this.anInt3708 = this.anInt3709;
				}
				this.anInt3709 = 0;
				this.aLong119 = local14 + 2000L;
			}
			this.anInt3707 = local87;
		} catch (@Pc(244) Exception local244) {
			this.method3364();
			this.aLong120 = local14 + 2000L;
		}
	}

	@OriginalMember(owner = "client!dc", name = "b", descriptor = "(B)V")
	public final void method3371() {
		this.aBoolean275 = true;
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "([II)V")
	private void method3372(@OriginalArg(0) int[] arg0) {
		@Pc(1) short local1 = 256;
		if (Static148.aBoolean202) {
			local1 = 512;
		}
		Static406.method5653(arg0, 0, local1);
		this.anInt3710 -= 256;
		if (this.aClass2_Sub2_6 != null && this.anInt3710 <= 0) {
			this.anInt3710 += Static221.anInt4100 >> 4;
			Static312.method4837(this.aClass2_Sub2_6);
			this.method3360(this.aClass2_Sub2_6, this.aClass2_Sub2_6.method4829());
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
						@Pc(88) Class2_Sub2 local88 = null;
						@Pc(93) Class2_Sub2 local93 = this.aClass2_Sub2Array6[local56];
						label97: while (true) {
							while (true) {
								if (local93 == null) {
									break label97;
								}
								@Pc(97) Class2_Sub4 local97 = local93.aClass2_Sub4_5;
								if (local97 == null || local97.anInt953 <= local61) {
									local93.aBoolean431 = true;
									@Pc(121) int local121 = local93.method4834();
									local45 += local121;
									if (local97 != null) {
										local97.anInt953 += local121;
									}
									if (local45 >= this.anInt3692) {
										break label103;
									}
									@Pc(140) Class2_Sub2 local140 = local93.method4832();
									if (local140 != null) {
										@Pc(145) int local145 = local93.anInt5511;
										while (local140 != null) {
											this.method3360(local140, local145 * local140.method4829() >> 8);
											local140 = local93.method4830();
										}
									}
									@Pc(164) Class2_Sub2 local164 = local93.aClass2_Sub2_8;
									local93.aClass2_Sub2_8 = null;
									if (local88 == null) {
										this.aClass2_Sub2Array6[local56] = local164;
									} else {
										local88.aClass2_Sub2_8 = local164;
									}
									if (local164 == null) {
										this.aClass2_Sub2Array5[local56] = local88;
									}
									local93 = local164;
								} else {
									local47 |= 0x1 << local56;
									local88 = local93;
									local93 = local93.aClass2_Sub2_8;
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
				@Pc(207) Class2_Sub2 local207 = this.aClass2_Sub2Array6[local56];
				this.aClass2_Sub2Array6[local56] = this.aClass2_Sub2Array5[local56] = null;
				while (local207 != null) {
					@Pc(221) Class2_Sub2 local221 = local207.aClass2_Sub2_8;
					local207.aClass2_Sub2_8 = null;
					local207 = local221;
				}
			}
		}
		if (this.anInt3710 < 0) {
			this.anInt3710 = 0;
		}
		if (this.aClass2_Sub2_6 != null) {
			this.aClass2_Sub2_6.method4828(arg0, 0, 256);
		}
		this.aLong118 = Static51.method979();
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(II)V")
	private void method3373() {
		this.anInt3710 -= 256;
		if (this.anInt3710 < 0) {
			this.anInt3710 = 0;
		}
		if (this.aClass2_Sub2_6 != null) {
			this.aClass2_Sub2_6.method4833(256);
		}
	}
}
