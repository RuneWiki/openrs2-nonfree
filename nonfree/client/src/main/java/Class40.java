import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hh")
public class Class40 {

	@OriginalMember(owner = "client!hh", name = "d", descriptor = "[I")
	public int[] anIntArray483;

	@OriginalMember(owner = "client!hh", name = "u", descriptor = "Lclient!og;")
	private Class1_Sub11 aClass1_Sub11_6;

	@OriginalMember(owner = "client!hh", name = "w", descriptor = "I")
	private int anInt3665;

	@OriginalMember(owner = "client!hh", name = "x", descriptor = "I")
	public int anInt3666;

	@OriginalMember(owner = "client!hh", name = "I", descriptor = "I")
	public int anInt3671;

	@OriginalMember(owner = "client!hh", name = "n", descriptor = "I")
	private final int anInt3658 = 32;

	@OriginalMember(owner = "client!hh", name = "h", descriptor = "J")
	private long aLong111 = Static47.method763();

	@OriginalMember(owner = "client!hh", name = "v", descriptor = "I")
	private int anInt3664 = 0;

	@OriginalMember(owner = "client!hh", name = "A", descriptor = "Z")
	private boolean aBoolean188 = true;

	@OriginalMember(owner = "client!hh", name = "B", descriptor = "J")
	private long aLong112 = 0L;

	@OriginalMember(owner = "client!hh", name = "F", descriptor = "I")
	private int anInt3670 = 0;

	@OriginalMember(owner = "client!hh", name = "E", descriptor = "[Lclient!og;")
	private final Class1_Sub11[] aClass1_Sub11Array5 = new Class1_Sub11[8];

	@OriginalMember(owner = "client!hh", name = "H", descriptor = "[Lclient!og;")
	private final Class1_Sub11[] aClass1_Sub11Array6 = new Class1_Sub11[8];

	@OriginalMember(owner = "client!hh", name = "C", descriptor = "I")
	private int anInt3669 = 0;

	@OriginalMember(owner = "client!hh", name = "J", descriptor = "I")
	private int anInt3672 = 0;

	@OriginalMember(owner = "client!hh", name = "D", descriptor = "J")
	private long aLong113 = 0L;

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(I)V")
	public final synchronized void method2510() {
		this.aBoolean188 = true;
		try {
			this.method2514();
		} catch (@Pc(15) Exception local15) {
			this.method2521();
			this.aLong113 = Static47.method763() + 2000L;
		}
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(BI)V")
	private void method2511() {
		this.anInt3669 -= 256;
		if (this.anInt3669 < 0) {
			this.anInt3669 = 0;
		}
		if (this.aClass1_Sub11_6 != null) {
			this.aClass1_Sub11_6.method2935(256);
		}
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "([II)V")
	private void method2512(@OriginalArg(0) int[] arg0) {
		@Pc(1) short local1 = 256;
		if (Static80.aBoolean110) {
			local1 = 512;
		}
		Static184.method626(arg0, 0, local1);
		this.anInt3669 -= 256;
		if (this.aClass1_Sub11_6 != null && this.anInt3669 <= 0) {
			this.anInt3669 += Static35.anInt974 >> 4;
			Static74.method1341(this.aClass1_Sub11_6);
			this.method2513(this.aClass1_Sub11_6, this.aClass1_Sub11_6.method2931());
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
						@Pc(88) Class1_Sub11 local88 = null;
						@Pc(93) Class1_Sub11 local93 = this.aClass1_Sub11Array5[local56];
						label97: while (true) {
							while (true) {
								if (local93 == null) {
									break label97;
								}
								@Pc(97) Class1_Sub9 local97 = local93.aClass1_Sub9_5;
								if (local97 == null || local97.anInt1573 <= local61) {
									local93.aBoolean206 = true;
									@Pc(121) int local121 = local93.method2930();
									local45 += local121;
									if (local97 != null) {
										local97.anInt1573 += local121;
									}
									if (local45 >= this.anInt3658) {
										break label103;
									}
									@Pc(140) Class1_Sub11 local140 = local93.method2932();
									if (local140 != null) {
										@Pc(145) int local145 = local93.anInt4164;
										while (local140 != null) {
											this.method2513(local140, local145 * local140.method2931() >> 8);
											local140 = local93.method2936();
										}
									}
									@Pc(164) Class1_Sub11 local164 = local93.aClass1_Sub11_8;
									local93.aClass1_Sub11_8 = null;
									if (local88 == null) {
										this.aClass1_Sub11Array5[local56] = local164;
									} else {
										local88.aClass1_Sub11_8 = local164;
									}
									if (local164 == null) {
										this.aClass1_Sub11Array6[local56] = local88;
									}
									local93 = local164;
								} else {
									local47 |= 0x1 << local56;
									local88 = local93;
									local93 = local93.aClass1_Sub11_8;
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
				@Pc(207) Class1_Sub11 local207 = this.aClass1_Sub11Array5[local56];
				this.aClass1_Sub11Array5[local56] = this.aClass1_Sub11Array6[local56] = null;
				while (local207 != null) {
					@Pc(221) Class1_Sub11 local221 = local207.aClass1_Sub11_8;
					local207.aClass1_Sub11_8 = null;
					local207 = local221;
				}
			}
		}
		if (this.anInt3669 < 0) {
			this.anInt3669 = 0;
		}
		if (this.aClass1_Sub11_6 != null) {
			this.aClass1_Sub11_6.method2933(arg0, 0, 256);
		}
		this.aLong111 = Static47.method763();
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(Lclient!og;IB)V")
	private void method2513(@OriginalArg(0) Class1_Sub11 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg1 >> 5;
		@Pc(17) Class1_Sub11 local17 = this.aClass1_Sub11Array6[local12];
		if (local17 == null) {
			this.aClass1_Sub11Array5[local12] = arg0;
		} else {
			local17.aClass1_Sub11_8 = arg0;
		}
		this.aClass1_Sub11Array6[local12] = arg0;
		arg0.anInt4164 = arg1;
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "()V")
	protected void method2514() throws Exception {
	}

	@OriginalMember(owner = "client!hh", name = "b", descriptor = "(I)V")
	public final synchronized void method2516() {
		if (this.anIntArray483 == null) {
			return;
		}
		@Pc(12) long local12 = Static47.method763();
		try {
			if (this.aLong113 != 0L) {
				if (local12 < this.aLong113) {
					return;
				}
				this.method2524(this.anInt3666);
				this.aBoolean188 = true;
				this.aLong113 = 0L;
			}
			@Pc(44) int local44 = this.method2518();
			if (this.anInt3664 < this.anInt3672 - local44) {
				this.anInt3664 = this.anInt3672 - local44;
			}
			@Pc(65) int local65 = this.anInt3665 + this.anInt3671;
			if (local65 + 256 > 16384) {
				local65 = 16128;
			}
			if (local65 + 256 > this.anInt3666) {
				local44 = 0;
				this.anInt3666 += 1024;
				if (this.anInt3666 > 16384) {
					this.anInt3666 = 16384;
				}
				this.method2521();
				this.method2524(this.anInt3666);
				this.aBoolean188 = true;
				if (local65 + 256 > this.anInt3666) {
					local65 = this.anInt3666 - 256;
					this.anInt3665 = local65 - this.anInt3671;
				}
			}
			while (local65 > local44) {
				this.method2512(this.anIntArray483);
				local44 += 256;
				this.method2520();
			}
			if (this.aLong112 < local12) {
				if (this.aBoolean188) {
					this.aBoolean188 = false;
				} else if (this.anInt3664 == 0 && this.anInt3670 == 0) {
					this.method2521();
					this.aLong113 = local12 + 2000L;
					return;
				} else {
					this.anInt3665 = Math.min(this.anInt3670, this.anInt3664);
					this.anInt3670 = this.anInt3664;
				}
				this.aLong112 = local12 + 2000L;
				this.anInt3664 = 0;
			}
			this.anInt3672 = local44;
		} catch (@Pc(191) Exception local191) {
			this.method2521();
			this.aLong113 = local12 + 2000L;
		}
		try {
			if (this.aLong111 + 500000L < local12) {
				local12 = this.aLong111;
			}
			while (this.aLong111 + 5000L < local12) {
				this.method2511();
				this.aLong111 += 256000 / Static35.anInt974;
			}
		} catch (@Pc(240) Exception local240) {
			this.aLong111 = local12;
		}
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(ILclient!og;)V")
	public final synchronized void method2517(@OriginalArg(1) Class1_Sub11 arg0) {
		this.aClass1_Sub11_6 = arg0;
	}

	@OriginalMember(owner = "client!hh", name = "b", descriptor = "()I")
	protected int method2518() throws Exception {
		return this.anInt3666;
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(Ljava/awt/Component;)V")
	public void method2519(@OriginalArg(0) Component arg0) throws Exception {
	}

	@OriginalMember(owner = "client!hh", name = "c", descriptor = "()V")
	protected void method2520() throws Exception {
	}

	@OriginalMember(owner = "client!hh", name = "d", descriptor = "()V")
	protected void method2521() {
	}

	@OriginalMember(owner = "client!hh", name = "c", descriptor = "(I)V")
	public final void method2522() {
		this.aBoolean188 = true;
	}

	@OriginalMember(owner = "client!hh", name = "d", descriptor = "(I)V")
	public final synchronized void method2523() {
		if (Static115.aClass48_1 != null) {
			@Pc(9) boolean local9 = true;
			for (@Pc(11) int local11 = 0; local11 < 2; local11++) {
				if (Static115.aClass48_1.aClass40Array1[local11] == this) {
					Static115.aClass48_1.aClass40Array1[local11] = null;
				}
				if (Static115.aClass48_1.aClass40Array1[local11] != null) {
					local9 = false;
				}
			}
			if (local9) {
				Static115.aClass48_1.aBoolean124 = true;
				while (Static115.aClass48_1.aBoolean125) {
					Static35.method583(50L);
				}
				Static115.aClass48_1 = null;
			}
		}
		this.method2521();
		this.anIntArray483 = null;
	}

	@OriginalMember(owner = "client!hh", name = "e", descriptor = "(I)V")
	public void method2524(@OriginalArg(0) int arg0) throws Exception {
	}
}
