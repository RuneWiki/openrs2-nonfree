import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pg")
public class Class4 {

	@OriginalMember(owner = "client!pg", name = "p", descriptor = "Lclient!d;")
	private Class1_Sub6 aClass1_Sub6_8;

	@OriginalMember(owner = "client!pg", name = "q", descriptor = "[I")
	public int[] anIntArray429;

	@OriginalMember(owner = "client!pg", name = "u", descriptor = "I")
	public int anInt3661;

	@OriginalMember(owner = "client!pg", name = "x", descriptor = "I")
	private int anInt3664;

	@OriginalMember(owner = "client!pg", name = "J", descriptor = "I")
	public int anInt3670;

	@OriginalMember(owner = "client!pg", name = "f", descriptor = "I")
	private final int anInt3650 = 32;

	@OriginalMember(owner = "client!pg", name = "k", descriptor = "J")
	private long aLong122 = Static190.method3141();

	@OriginalMember(owner = "client!pg", name = "z", descriptor = "I")
	private int anInt3665 = 0;

	@OriginalMember(owner = "client!pg", name = "y", descriptor = "Z")
	private boolean aBoolean146 = true;

	@OriginalMember(owner = "client!pg", name = "A", descriptor = "J")
	private long aLong123 = 0L;

	@OriginalMember(owner = "client!pg", name = "t", descriptor = "I")
	private int anInt3660 = 0;

	@OriginalMember(owner = "client!pg", name = "H", descriptor = "J")
	private long aLong124 = 0L;

	@OriginalMember(owner = "client!pg", name = "I", descriptor = "[Lclient!d;")
	private final Class1_Sub6[] aClass1_Sub6Array6 = new Class1_Sub6[8];

	@OriginalMember(owner = "client!pg", name = "B", descriptor = "[Lclient!d;")
	private final Class1_Sub6[] aClass1_Sub6Array5 = new Class1_Sub6[8];

	@OriginalMember(owner = "client!pg", name = "C", descriptor = "I")
	private int anInt3666 = 0;

	@OriginalMember(owner = "client!pg", name = "s", descriptor = "I")
	private int anInt3659 = 0;

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "()I")
	protected int method2766() throws Exception {
		return this.anInt3670;
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(I)V")
	public final synchronized void method2767() {
		if (this.anIntArray429 == null) {
			return;
		}
		@Pc(14) long local14 = Static190.method3141();
		try {
			if (this.aLong124 != 0L) {
				if (local14 < this.aLong124) {
					return;
				}
				this.method2783(this.anInt3670);
				this.aLong124 = 0L;
				this.aBoolean146 = true;
			}
			@Pc(44) int local44 = this.method2766();
			if (this.anInt3660 - local44 > this.anInt3665) {
				this.anInt3665 = this.anInt3660 - local44;
			}
			@Pc(65) int local65 = this.anInt3664 + this.anInt3661;
			if (local65 + 256 > 16384) {
				local65 = 16128;
			}
			if (this.anInt3670 < local65 + 256) {
				this.anInt3670 += 1024;
				local44 = 0;
				if (this.anInt3670 > 16384) {
					this.anInt3670 = 16384;
				}
				this.method2770();
				this.method2783(this.anInt3670);
				this.aBoolean146 = true;
				if (local65 + 256 > this.anInt3670) {
					local65 = this.anInt3670 - 256;
					this.anInt3664 = local65 - this.anInt3661;
				}
			}
			while (local65 > local44) {
				local44 += 256;
				this.method2784(this.anIntArray429);
				this.method2768();
			}
			if (local14 > this.aLong123) {
				if (this.aBoolean146) {
					this.aBoolean146 = false;
				} else if (this.anInt3665 == 0 && this.anInt3666 == 0) {
					this.method2770();
					this.aLong124 = local14 + 2000L;
					return;
				} else {
					this.anInt3664 = Math.min(this.anInt3666, this.anInt3665);
					this.anInt3666 = this.anInt3665;
				}
				this.anInt3665 = 0;
				this.aLong123 = local14 + 2000L;
			}
			this.anInt3660 = local44;
		} catch (@Pc(194) Exception local194) {
			this.method2770();
			this.aLong124 = local14 + 2000L;
		}
		try {
			if (this.aLong122 + 500000L < local14) {
				local14 = this.aLong122;
			}
			while (this.aLong122 + 5000L < local14) {
				this.method2773();
				this.aLong122 += 256000 / Static178.anInt4019;
			}
		} catch (@Pc(240) Exception local240) {
			this.aLong122 = local14;
		}
	}

	@OriginalMember(owner = "client!pg", name = "b", descriptor = "()V")
	protected void method2768() throws Exception {
	}

	@OriginalMember(owner = "client!pg", name = "c", descriptor = "()V")
	protected void method2769() throws Exception {
	}

	@OriginalMember(owner = "client!pg", name = "d", descriptor = "()V")
	protected void method2770() {
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(Z)V")
	public final synchronized void method2772() {
		this.aBoolean146 = true;
		try {
			this.method2769();
		} catch (@Pc(6) Exception local6) {
			this.method2770();
			this.aLong124 = Static190.method3141() + 2000L;
		}
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(II)V")
	private void method2773() {
		this.anInt3659 -= 256;
		if (this.anInt3659 < 0) {
			this.anInt3659 = 0;
		}
		if (this.aClass1_Sub6_8 != null) {
			this.aClass1_Sub6_8.method2373(256);
		}
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(Ljava/awt/Component;)V")
	public void method2774(@OriginalArg(0) Component arg0) throws Exception {
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(Lclient!d;II)V")
	private void method2775(@OriginalArg(0) Class1_Sub6 arg0, @OriginalArg(1) int arg1) {
		@Pc(7) int local7 = arg1 >> 5;
		@Pc(12) Class1_Sub6 local12 = this.aClass1_Sub6Array5[local7];
		if (local12 == null) {
			this.aClass1_Sub6Array6[local7] = arg0;
		} else {
			local12.aClass1_Sub6_7 = arg0;
		}
		this.aClass1_Sub6Array5[local7] = arg0;
		arg0.anInt3090 = arg1;
	}

	@OriginalMember(owner = "client!pg", name = "b", descriptor = "(I)V")
	public final void method2776() {
		this.aBoolean146 = true;
	}

	@OriginalMember(owner = "client!pg", name = "c", descriptor = "(I)V")
	public final synchronized void method2780() {
		if (Static27.aClass28_1 != null) {
			@Pc(5) boolean local5 = true;
			for (@Pc(7) int local7 = 0; local7 < 2; local7++) {
				if (Static27.aClass28_1.aClass4Array1[local7] == this) {
					Static27.aClass28_1.aClass4Array1[local7] = null;
				}
				if (Static27.aClass28_1.aClass4Array1[local7] != null) {
					local5 = false;
				}
			}
			if (local5) {
				Static27.aClass28_1.aBoolean64 = true;
				while (Static27.aClass28_1.aBoolean63) {
					Static135.method2569(50L);
				}
				Static27.aClass28_1 = null;
			}
		}
		this.method2770();
		this.anIntArray429 = null;
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(ILclient!d;)V")
	public final synchronized void method2781(@OriginalArg(1) Class1_Sub6 arg0) {
		this.aClass1_Sub6_8 = arg0;
	}

	@OriginalMember(owner = "client!pg", name = "d", descriptor = "(I)V")
	public void method2783(@OriginalArg(0) int arg0) throws Exception {
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "([II)V")
	private void method2784(@OriginalArg(0) int[] arg0) {
		@Pc(1) short local1 = 256;
		if (Static128.aBoolean131) {
			local1 = 512;
		}
		Static217.method2359(arg0, 0, local1);
		this.anInt3659 -= 256;
		if (this.aClass1_Sub6_8 != null && this.anInt3659 <= 0) {
			this.anInt3659 += Static178.anInt4019 >> 4;
			Static29.method567(this.aClass1_Sub6_8);
			this.method2775(this.aClass1_Sub6_8, this.aClass1_Sub6_8.method2372());
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
						@Pc(93) Class1_Sub6 local93 = this.aClass1_Sub6Array6[local56];
						label97: while (true) {
							while (true) {
								if (local93 == null) {
									break label97;
								}
								@Pc(97) Class1_Sub19 local97 = local93.aClass1_Sub19_5;
								if (local97 == null || local97.anInt2890 <= local61) {
									local93.aBoolean127 = true;
									@Pc(121) int local121 = local93.method2374();
									local45 += local121;
									if (local97 != null) {
										local97.anInt2890 += local121;
									}
									if (local45 >= this.anInt3650) {
										break label103;
									}
									@Pc(140) Class1_Sub6 local140 = local93.method2368();
									if (local140 != null) {
										@Pc(145) int local145 = local93.anInt3090;
										while (local140 != null) {
											this.method2775(local140, local145 * local140.method2372() >> 8);
											local140 = local93.method2369();
										}
									}
									@Pc(164) Class1_Sub6 local164 = local93.aClass1_Sub6_7;
									local93.aClass1_Sub6_7 = null;
									if (local88 == null) {
										this.aClass1_Sub6Array6[local56] = local164;
									} else {
										local88.aClass1_Sub6_7 = local164;
									}
									if (local164 == null) {
										this.aClass1_Sub6Array5[local56] = local88;
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
				@Pc(207) Class1_Sub6 local207 = this.aClass1_Sub6Array6[local56];
				this.aClass1_Sub6Array6[local56] = this.aClass1_Sub6Array5[local56] = null;
				while (local207 != null) {
					@Pc(221) Class1_Sub6 local221 = local207.aClass1_Sub6_7;
					local207.aClass1_Sub6_7 = null;
					local207 = local221;
				}
			}
		}
		if (this.anInt3659 < 0) {
			this.anInt3659 = 0;
		}
		if (this.aClass1_Sub6_8 != null) {
			this.aClass1_Sub6_8.method2371(arg0, 0, 256);
		}
		this.aLong122 = Static190.method3141();
	}
}
