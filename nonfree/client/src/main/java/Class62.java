import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!in")
public class Class62 {

	@OriginalMember(owner = "client!in", name = "g", descriptor = "[I")
	public int[] anIntArray254;

	@OriginalMember(owner = "client!in", name = "l", descriptor = "Lclient!nu;")
	private Class2_Sub8 aClass2_Sub8_5;

	@OriginalMember(owner = "client!in", name = "G", descriptor = "I")
	public int anInt2958;

	@OriginalMember(owner = "client!in", name = "H", descriptor = "I")
	private int anInt2959;

	@OriginalMember(owner = "client!in", name = "K", descriptor = "I")
	public int anInt2961;

	@OriginalMember(owner = "client!in", name = "r", descriptor = "I")
	private final int anInt2949 = 32;

	@OriginalMember(owner = "client!in", name = "t", descriptor = "Z")
	private boolean aBoolean191 = false;

	@OriginalMember(owner = "client!in", name = "b", descriptor = "J")
	private long aLong130 = Static432.method5870();

	@OriginalMember(owner = "client!in", name = "B", descriptor = "J")
	private long aLong131 = 0L;

	@OriginalMember(owner = "client!in", name = "F", descriptor = "I")
	private int anInt2957 = 0;

	@OriginalMember(owner = "client!in", name = "D", descriptor = "I")
	private int anInt2956 = 0;

	@OriginalMember(owner = "client!in", name = "I", descriptor = "[Lclient!nu;")
	private final Class2_Sub8[] aClass2_Sub8Array5 = new Class2_Sub8[8];

	@OriginalMember(owner = "client!in", name = "E", descriptor = "J")
	private long aLong132 = 0L;

	@OriginalMember(owner = "client!in", name = "J", descriptor = "I")
	private int anInt2960 = 0;

	@OriginalMember(owner = "client!in", name = "C", descriptor = "I")
	private int anInt2955 = 0;

	@OriginalMember(owner = "client!in", name = "L", descriptor = "[Lclient!nu;")
	private final Class2_Sub8[] aClass2_Sub8Array6 = new Class2_Sub8[8];

	@OriginalMember(owner = "client!in", name = "M", descriptor = "Z")
	private boolean aBoolean192 = true;

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(I)V")
	public final synchronized void method2404() {
		if (Static196.aClass232_1 != null) {
			@Pc(9) boolean local9 = true;
			for (@Pc(11) int local11 = 0; local11 < 2; local11++) {
				if (Static196.aClass232_1.aClass62Array1[local11] == this) {
					Static196.aClass232_1.aClass62Array1[local11] = null;
				}
				if (Static196.aClass232_1.aClass62Array1[local11] != null) {
					local9 = false;
				}
			}
			if (local9) {
				Static196.aClass232_1.aBoolean447 = true;
				while (Static196.aClass232_1.aBoolean448) {
					Static167.method6157(50L);
				}
				Static196.aClass232_1 = null;
			}
		}
		this.method2406();
		this.anIntArray254 = null;
		this.aBoolean191 = true;
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "()V")
	protected void method2406() {
	}

	@OriginalMember(owner = "client!in", name = "c", descriptor = "(I)V")
	public final synchronized void method2407() {
		this.aBoolean192 = true;
		try {
			this.method2408();
		} catch (@Pc(10) Exception local10) {
			this.method2406();
			this.aLong131 = Static432.method5870() + 2000L;
		}
	}

	@OriginalMember(owner = "client!in", name = "b", descriptor = "()V")
	protected void method2408() throws Exception {
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(II)V")
	private void method2409() {
		this.anInt2957 -= 256;
		if (this.anInt2957 < 0) {
			this.anInt2957 = 0;
		}
		if (this.aClass2_Sub8_5 != null) {
			this.aClass2_Sub8_5.method5284(256);
		}
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "([II)V")
	private void method2411(@OriginalArg(0) int[] arg0) {
		@Pc(1) short local1 = 256;
		if (Static240.aBoolean266) {
			local1 = 512;
		}
		Static472.method5027(arg0, 0, local1);
		this.anInt2957 -= 256;
		if (this.aClass2_Sub8_5 != null && this.anInt2957 <= 0) {
			this.anInt2957 += Static150.anInt7358 >> 4;
			Static39.method610(this.aClass2_Sub8_5);
			this.method2424(this.aClass2_Sub8_5, this.aClass2_Sub8_5.method5283());
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
						@Pc(88) Class2_Sub8 local88 = null;
						@Pc(93) Class2_Sub8 local93 = this.aClass2_Sub8Array6[local56];
						label97: while (true) {
							while (true) {
								if (local93 == null) {
									break label97;
								}
								@Pc(97) Class2_Sub14 local97 = local93.aClass2_Sub14_5;
								if (local97 == null || local97.anInt3842 <= local61) {
									local93.aBoolean449 = true;
									@Pc(121) int local121 = local93.method5286();
									local45 += local121;
									if (local97 != null) {
										local97.anInt3842 += local121;
									}
									if (local45 >= this.anInt2949) {
										break label103;
									}
									@Pc(140) Class2_Sub8 local140 = local93.method5285();
									if (local140 != null) {
										@Pc(145) int local145 = local93.anInt6638;
										while (local140 != null) {
											this.method2424(local140, local145 * local140.method5283() >> 8);
											local140 = local93.method5287();
										}
									}
									@Pc(164) Class2_Sub8 local164 = local93.aClass2_Sub8_8;
									local93.aClass2_Sub8_8 = null;
									if (local88 == null) {
										this.aClass2_Sub8Array6[local56] = local164;
									} else {
										local88.aClass2_Sub8_8 = local164;
									}
									if (local164 == null) {
										this.aClass2_Sub8Array5[local56] = local88;
									}
									local93 = local164;
								} else {
									local47 |= 0x1 << local56;
									local88 = local93;
									local93 = local93.aClass2_Sub8_8;
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
				@Pc(207) Class2_Sub8 local207 = this.aClass2_Sub8Array6[local56];
				this.aClass2_Sub8Array6[local56] = this.aClass2_Sub8Array5[local56] = null;
				while (local207 != null) {
					@Pc(221) Class2_Sub8 local221 = local207.aClass2_Sub8_8;
					local207.aClass2_Sub8_8 = null;
					local207 = local221;
				}
			}
		}
		if (this.anInt2957 < 0) {
			this.anInt2957 = 0;
		}
		if (this.aClass2_Sub8_5 != null) {
			this.aClass2_Sub8_5.method5281(arg0, 0, 256);
		}
		this.aLong130 = Static432.method5870();
	}

	@OriginalMember(owner = "client!in", name = "d", descriptor = "(I)V")
	public void method2413(@OriginalArg(0) int arg0) throws Exception {
	}

	@OriginalMember(owner = "client!in", name = "c", descriptor = "()V")
	protected void method2414() throws Exception {
	}

	@OriginalMember(owner = "client!in", name = "d", descriptor = "()I")
	protected int method2415() throws Exception {
		return this.anInt2958;
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(Ljava/awt/Component;)V")
	public void method2419(@OriginalArg(0) Component arg0) throws Exception {
	}

	@OriginalMember(owner = "client!in", name = "b", descriptor = "(B)V")
	public final synchronized void method2422() {
		if (this.aBoolean191) {
			return;
		}
		@Pc(12) long local12 = Static432.method5870();
		try {
			if (local12 > this.aLong130 + 500000L) {
				this.aLong130 = local12 - 500000L;
			}
			while (this.aLong130 + 5000L < local12) {
				this.method2409();
				this.aLong130 += 256000 / Static150.anInt7358;
			}
		} catch (@Pc(61) Exception local61) {
			this.aLong130 = local12;
		}
		if (this.anIntArray254 == null) {
			return;
		}
		try {
			if (this.aLong131 != 0L) {
				if (local12 < this.aLong131) {
					return;
				}
				this.method2413(this.anInt2958);
				this.aBoolean192 = true;
				this.aLong131 = 0L;
			}
			@Pc(92) int local92 = this.method2415();
			if (this.anInt2955 < this.anInt2960 - local92) {
				this.anInt2955 = this.anInt2960 - local92;
			}
			@Pc(117) int local117 = this.anInt2959 + this.anInt2961;
			if (local117 + 256 > 16384) {
				local117 = 16128;
			}
			if (local117 + 256 > this.anInt2958) {
				this.anInt2958 += 1024;
				if (this.anInt2958 > 16384) {
					this.anInt2958 = 16384;
				}
				this.method2406();
				this.method2413(this.anInt2958);
				local92 = 0;
				if (local117 + 256 > this.anInt2958) {
					local117 = this.anInt2958 - 256;
					this.anInt2959 = local117 - this.anInt2961;
				}
				this.aBoolean192 = true;
			}
			while (local117 > local92) {
				this.method2411(this.anIntArray254);
				local92 += 256;
				this.method2414();
			}
			if (local12 > this.aLong132) {
				if (this.aBoolean192) {
					this.aBoolean192 = false;
				} else if (this.anInt2955 == 0 && this.anInt2956 == 0) {
					this.method2406();
					this.aLong131 = local12 + 2000L;
					return;
				} else {
					this.anInt2959 = Math.min(this.anInt2956, this.anInt2955);
					this.anInt2956 = this.anInt2955;
				}
				this.aLong132 = local12 + 2000L;
				this.anInt2955 = 0;
			}
			this.anInt2960 = local92;
		} catch (@Pc(245) Exception local245) {
			this.method2406();
			this.aLong131 = local12 + 2000L;
		}
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(Lclient!nu;I)V")
	public final synchronized void method2423(@OriginalArg(0) Class2_Sub8 arg0) {
		this.aClass2_Sub8_5 = arg0;
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(Lclient!nu;IB)V")
	private void method2424(@OriginalArg(0) Class2_Sub8 arg0, @OriginalArg(1) int arg1) {
		@Pc(13) int local13 = arg1 >> 5;
		@Pc(18) Class2_Sub8 local18 = this.aClass2_Sub8Array5[local13];
		if (local18 == null) {
			this.aClass2_Sub8Array6[local13] = arg0;
		} else {
			local18.aClass2_Sub8_8 = arg0;
		}
		this.aClass2_Sub8Array5[local13] = arg0;
		arg0.anInt6638 = arg1;
	}
}
