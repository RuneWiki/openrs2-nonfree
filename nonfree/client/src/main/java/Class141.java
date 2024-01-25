import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hq")
public class Class141 {

	@OriginalMember(owner = "client!hq", name = "e", descriptor = "[I")
	public int[] anIntArray450;

	@OriginalMember(owner = "client!hq", name = "n", descriptor = "Lclient!eg;")
	private Class1_Sub8 aClass1_Sub8_7;

	@OriginalMember(owner = "client!hq", name = "w", descriptor = "I")
	public int anInt6753;

	@OriginalMember(owner = "client!hq", name = "D", descriptor = "I")
	private int anInt6757;

	@OriginalMember(owner = "client!hq", name = "E", descriptor = "I")
	public int anInt6758;

	@OriginalMember(owner = "client!hq", name = "c", descriptor = "I")
	private final int anInt6738 = 32;

	@OriginalMember(owner = "client!hq", name = "t", descriptor = "Z")
	private boolean aBoolean485 = false;

	@OriginalMember(owner = "client!hq", name = "p", descriptor = "J")
	private long aLong289 = Static255.method4035();

	@OriginalMember(owner = "client!hq", name = "x", descriptor = "I")
	private int anInt6754 = 0;

	@OriginalMember(owner = "client!hq", name = "y", descriptor = "I")
	private int anInt6755 = 0;

	@OriginalMember(owner = "client!hq", name = "z", descriptor = "[Lclient!eg;")
	private final Class1_Sub8[] aClass1_Sub8Array5 = new Class1_Sub8[8];

	@OriginalMember(owner = "client!hq", name = "B", descriptor = "J")
	private long aLong290 = 0L;

	@OriginalMember(owner = "client!hq", name = "C", descriptor = "J")
	private long aLong291 = 0L;

	@OriginalMember(owner = "client!hq", name = "A", descriptor = "I")
	private int anInt6756 = 0;

	@OriginalMember(owner = "client!hq", name = "H", descriptor = "I")
	private int anInt6759 = 0;

	@OriginalMember(owner = "client!hq", name = "F", descriptor = "Z")
	private boolean aBoolean486 = true;

	@OriginalMember(owner = "client!hq", name = "I", descriptor = "[Lclient!eg;")
	private final Class1_Sub8[] aClass1_Sub8Array6 = new Class1_Sub8[8];

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(Lclient!eg;II)V")
	private void method5526(@OriginalArg(0) Class1_Sub8 arg0, @OriginalArg(1) int arg1) {
		@Pc(11) int local11 = arg1 >> 5;
		@Pc(16) Class1_Sub8 local16 = this.aClass1_Sub8Array6[local11];
		if (local16 == null) {
			this.aClass1_Sub8Array5[local11] = arg0;
		} else {
			local16.aClass1_Sub8_8 = arg0;
		}
		this.aClass1_Sub8Array6[local11] = arg0;
		arg0.anInt7290 = arg1;
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(Lclient!eg;I)V")
	public final synchronized void method5527(@OriginalArg(0) Class1_Sub8 arg0) {
		this.aClass1_Sub8_7 = arg0;
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "()V")
	protected void method5528() throws Exception {
	}

	@OriginalMember(owner = "client!hq", name = "b", descriptor = "(I)V")
	public final synchronized void method5529() {
		if (Static161.aClass333_1 != null) {
			@Pc(9) boolean local9 = true;
			for (@Pc(11) int local11 = 0; local11 < 2; local11++) {
				if (Static161.aClass333_1.aClass141Array1[local11] == this) {
					Static161.aClass333_1.aClass141Array1[local11] = null;
				}
				if (Static161.aClass333_1.aClass141Array1[local11] != null) {
					local9 = false;
				}
			}
			if (local9) {
				Static161.aClass333_1.aBoolean657 = true;
				while (Static161.aClass333_1.aBoolean656) {
					Static423.method5918(50L);
				}
				Static161.aClass333_1 = null;
			}
		}
		this.method5538();
		this.aBoolean485 = true;
		this.anIntArray450 = null;
	}

	@OriginalMember(owner = "client!hq", name = "b", descriptor = "(B)V")
	public final synchronized void method5530() {
		if (this.aBoolean485) {
			return;
		}
		@Pc(12) long local12 = Static255.method4035();
		try {
			if (this.aLong289 + 500000L < local12) {
				this.aLong289 = local12 - 500000L;
			}
			while (this.aLong289 + 5000L < local12) {
				this.method5535();
				this.aLong289 += 256000 / Static426.anInt7216;
			}
		} catch (@Pc(52) Exception local52) {
			this.aLong289 = local12;
		}
		if (this.anIntArray450 == null) {
			return;
		}
		try {
			if (this.aLong290 != 0L) {
				if (local12 < this.aLong290) {
					return;
				}
				this.method5533(this.anInt6758);
				this.aLong290 = 0L;
				this.aBoolean486 = true;
			}
			@Pc(87) int local87 = this.method5532();
			if (this.anInt6756 < this.anInt6759 - local87) {
				this.anInt6756 = this.anInt6759 - local87;
			}
			@Pc(108) int local108 = this.anInt6753 + this.anInt6757;
			if (local108 + 256 > 16384) {
				local108 = 16128;
			}
			if (local108 + 256 > this.anInt6758) {
				this.anInt6758 += 1024;
				if (this.anInt6758 > 16384) {
					this.anInt6758 = 16384;
				}
				this.method5538();
				this.method5533(this.anInt6758);
				local87 = 0;
				this.aBoolean486 = true;
				if (local108 + 256 > this.anInt6758) {
					local108 = this.anInt6758 - 256;
					this.anInt6757 = local108 - this.anInt6753;
				}
			}
			while (local108 > local87) {
				this.method5531(this.anIntArray450);
				local87 += 256;
				this.method5528();
			}
			if (this.aLong291 < local12) {
				if (this.aBoolean486) {
					this.aBoolean486 = false;
				} else if (this.anInt6756 == 0 && this.anInt6755 == 0) {
					this.method5538();
					this.aLong290 = local12 + 2000L;
					return;
				} else {
					this.anInt6757 = Math.min(this.anInt6755, this.anInt6756);
					this.anInt6755 = this.anInt6756;
				}
				this.anInt6756 = 0;
				this.aLong291 = local12 + 2000L;
			}
			this.anInt6759 = local87;
		} catch (@Pc(235) Exception local235) {
			this.method5538();
			this.aLong290 = local12 + 2000L;
		}
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "([II)V")
	private void method5531(@OriginalArg(0) int[] arg0) {
		@Pc(1) short local1 = 256;
		if (Static582.aBoolean692) {
			local1 = 512;
		}
		Static600.method3764(arg0, 0, local1);
		this.anInt6754 -= 256;
		if (this.aClass1_Sub8_7 != null && this.anInt6754 <= 0) {
			this.anInt6754 += Static426.anInt7216 >> 4;
			Static464.method6582(this.aClass1_Sub8_7);
			this.method5526(this.aClass1_Sub8_7, this.aClass1_Sub8_7.method6025());
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
						@Pc(88) Class1_Sub8 local88 = null;
						@Pc(93) Class1_Sub8 local93 = this.aClass1_Sub8Array5[local56];
						label97: while (true) {
							while (true) {
								if (local93 == null) {
									break label97;
								}
								@Pc(97) Class1_Sub40 local97 = local93.aClass1_Sub40_5;
								if (local97 == null || local97.anInt7665 <= local61) {
									local93.aBoolean522 = true;
									@Pc(121) int local121 = local93.method6021();
									local45 += local121;
									if (local97 != null) {
										local97.anInt7665 += local121;
									}
									if (local45 >= this.anInt6738) {
										break label103;
									}
									@Pc(140) Class1_Sub8 local140 = local93.method6026();
									if (local140 != null) {
										@Pc(145) int local145 = local93.anInt7290;
										while (local140 != null) {
											this.method5526(local140, local145 * local140.method6025() >> 8);
											local140 = local93.method6023();
										}
									}
									@Pc(164) Class1_Sub8 local164 = local93.aClass1_Sub8_8;
									local93.aClass1_Sub8_8 = null;
									if (local88 == null) {
										this.aClass1_Sub8Array5[local56] = local164;
									} else {
										local88.aClass1_Sub8_8 = local164;
									}
									if (local164 == null) {
										this.aClass1_Sub8Array6[local56] = local88;
									}
									local93 = local164;
								} else {
									local47 |= 0x1 << local56;
									local88 = local93;
									local93 = local93.aClass1_Sub8_8;
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
				@Pc(207) Class1_Sub8 local207 = this.aClass1_Sub8Array5[local56];
				this.aClass1_Sub8Array5[local56] = this.aClass1_Sub8Array6[local56] = null;
				while (local207 != null) {
					@Pc(221) Class1_Sub8 local221 = local207.aClass1_Sub8_8;
					local207.aClass1_Sub8_8 = null;
					local207 = local221;
				}
			}
		}
		if (this.anInt6754 < 0) {
			this.anInt6754 = 0;
		}
		if (this.aClass1_Sub8_7 != null) {
			this.aClass1_Sub8_7.method6022(arg0, 0, 256);
		}
		this.aLong289 = Static255.method4035();
	}

	@OriginalMember(owner = "client!hq", name = "b", descriptor = "()I")
	protected int method5532() throws Exception {
		return this.anInt6758;
	}

	@OriginalMember(owner = "client!hq", name = "c", descriptor = "(I)V")
	public void method5533(@OriginalArg(0) int arg0) throws Exception {
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(Ljava/awt/Component;)V")
	public void method5534(@OriginalArg(0) Component arg0) throws Exception {
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(II)V")
	private void method5535() {
		this.anInt6754 -= 256;
		if (this.anInt6754 < 0) {
			this.anInt6754 = 0;
		}
		if (this.aClass1_Sub8_7 != null) {
			this.aClass1_Sub8_7.method6024(256);
		}
	}

	@OriginalMember(owner = "client!hq", name = "c", descriptor = "()V")
	protected void method5536() throws Exception {
	}

	@OriginalMember(owner = "client!hq", name = "d", descriptor = "()V")
	protected void method5538() {
	}

	@OriginalMember(owner = "client!hq", name = "d", descriptor = "(I)V")
	public final synchronized void method5539() {
		this.aBoolean486 = true;
		try {
			this.method5536();
		} catch (@Pc(10) Exception local10) {
			this.method5538();
			this.aLong290 = Static255.method4035() + 2000L;
		}
	}
}
