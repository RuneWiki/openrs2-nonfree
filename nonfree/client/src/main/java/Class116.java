import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wd")
public class Class116 {

	@OriginalMember(owner = "client!wd", name = "m", descriptor = "[I")
	public int[] anIntArray610;

	@OriginalMember(owner = "client!wd", name = "o", descriptor = "Lclient!bs;")
	private Class7_Sub8 aClass7_Sub8_8;

	@OriginalMember(owner = "client!wd", name = "y", descriptor = "I")
	public int anInt7255;

	@OriginalMember(owner = "client!wd", name = "C", descriptor = "I")
	public int anInt7257;

	@OriginalMember(owner = "client!wd", name = "I", descriptor = "I")
	private int anInt7260;

	@OriginalMember(owner = "client!wd", name = "s", descriptor = "Z")
	private boolean aBoolean487 = false;

	@OriginalMember(owner = "client!wd", name = "l", descriptor = "I")
	private final int anInt7247 = 32;

	@OriginalMember(owner = "client!wd", name = "u", descriptor = "J")
	private long aLong218 = Static158.method2342();

	@OriginalMember(owner = "client!wd", name = "x", descriptor = "I")
	private int anInt7254 = 0;

	@OriginalMember(owner = "client!wd", name = "w", descriptor = "I")
	private int anInt7253 = 0;

	@OriginalMember(owner = "client!wd", name = "z", descriptor = "[Lclient!bs;")
	private final Class7_Sub8[] aClass7_Sub8Array5 = new Class7_Sub8[8];

	@OriginalMember(owner = "client!wd", name = "B", descriptor = "Z")
	private boolean aBoolean488 = true;

	@OriginalMember(owner = "client!wd", name = "A", descriptor = "I")
	private int anInt7256 = 0;

	@OriginalMember(owner = "client!wd", name = "H", descriptor = "J")
	private long aLong220 = 0L;

	@OriginalMember(owner = "client!wd", name = "E", descriptor = "[Lclient!bs;")
	private final Class7_Sub8[] aClass7_Sub8Array6 = new Class7_Sub8[8];

	@OriginalMember(owner = "client!wd", name = "F", descriptor = "J")
	private long aLong219 = 0L;

	@OriginalMember(owner = "client!wd", name = "G", descriptor = "I")
	private int anInt7259 = 0;

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(I)V")
	public void method5572(@OriginalArg(0) int arg0) throws Exception {
	}

	@OriginalMember(owner = "client!wd", name = "b", descriptor = "(I)V")
	public final void method5573() {
		this.aBoolean488 = true;
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(ILclient!bs;I)V")
	private void method5574(@OriginalArg(0) int arg0, @OriginalArg(1) Class7_Sub8 arg1) {
		@Pc(13) int local13 = arg0 >> 5;
		@Pc(18) Class7_Sub8 local18 = this.aClass7_Sub8Array5[local13];
		if (local18 == null) {
			this.aClass7_Sub8Array6[local13] = arg1;
		} else {
			local18.aClass7_Sub8_7 = arg1;
		}
		this.aClass7_Sub8Array5[local13] = arg1;
		arg1.anInt6140 = arg0;
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(B)V")
	public final synchronized void method5575() {
		if (Static194.aClass43_1 != null) {
			@Pc(5) boolean local5 = true;
			for (@Pc(7) int local7 = 0; local7 < 2; local7++) {
				if (Static194.aClass43_1.aClass116Array1[local7] == this) {
					Static194.aClass43_1.aClass116Array1[local7] = null;
				}
				if (Static194.aClass43_1.aClass116Array1[local7] != null) {
					local5 = false;
				}
			}
			if (local5) {
				Static194.aClass43_1.aBoolean59 = true;
				while (Static194.aClass43_1.aBoolean58) {
					Static214.method2089(50L);
				}
				Static194.aClass43_1 = null;
			}
		}
		this.method5579();
		this.anIntArray610 = null;
		this.aBoolean487 = true;
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "([II)V")
	private void method5576(@OriginalArg(0) int[] arg0) {
		@Pc(1) short local1 = 256;
		if (Static213.aBoolean232) {
			local1 = 512;
		}
		Static464.method3638(arg0, 0, local1);
		this.anInt7253 -= 256;
		if (this.aClass7_Sub8_8 != null && this.anInt7253 <= 0) {
			this.anInt7253 += Static208.anInt3680 >> 4;
			Static153.method4538(this.aClass7_Sub8_8);
			this.method5574(this.aClass7_Sub8_8.method4867(), this.aClass7_Sub8_8);
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
						@Pc(88) Class7_Sub8 local88 = null;
						@Pc(93) Class7_Sub8 local93 = this.aClass7_Sub8Array6[local56];
						label97: while (true) {
							while (true) {
								if (local93 == null) {
									break label97;
								}
								@Pc(97) Class7_Sub31 local97 = local93.aClass7_Sub31_5;
								if (local97 == null || local97.anInt4156 <= local61) {
									local93.aBoolean403 = true;
									@Pc(121) int local121 = local93.method4869();
									local45 += local121;
									if (local97 != null) {
										local97.anInt4156 += local121;
									}
									if (local45 >= this.anInt7247) {
										break label103;
									}
									@Pc(140) Class7_Sub8 local140 = local93.method4866();
									if (local140 != null) {
										@Pc(145) int local145 = local93.anInt6140;
										while (local140 != null) {
											this.method5574(local145 * local140.method4867() >> 8, local140);
											local140 = local93.method4872();
										}
									}
									@Pc(164) Class7_Sub8 local164 = local93.aClass7_Sub8_7;
									local93.aClass7_Sub8_7 = null;
									if (local88 == null) {
										this.aClass7_Sub8Array6[local56] = local164;
									} else {
										local88.aClass7_Sub8_7 = local164;
									}
									if (local164 == null) {
										this.aClass7_Sub8Array5[local56] = local88;
									}
									local93 = local164;
								} else {
									local47 |= 0x1 << local56;
									local88 = local93;
									local93 = local93.aClass7_Sub8_7;
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
				@Pc(207) Class7_Sub8 local207 = this.aClass7_Sub8Array6[local56];
				this.aClass7_Sub8Array6[local56] = this.aClass7_Sub8Array5[local56] = null;
				while (local207 != null) {
					@Pc(221) Class7_Sub8 local221 = local207.aClass7_Sub8_7;
					local207.aClass7_Sub8_7 = null;
					local207 = local221;
				}
			}
		}
		if (this.anInt7253 < 0) {
			this.anInt7253 = 0;
		}
		if (this.aClass7_Sub8_8 != null) {
			this.aClass7_Sub8_8.method4871(arg0, 0, 256);
		}
		this.aLong218 = Static158.method2342();
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(Lclient!bs;I)V")
	public final synchronized void method5577(@OriginalArg(0) Class7_Sub8 arg0) {
		this.aClass7_Sub8_8 = arg0;
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "()V")
	protected void method5578() throws Exception {
	}

	@OriginalMember(owner = "client!wd", name = "b", descriptor = "()V")
	protected void method5579() {
	}

	@OriginalMember(owner = "client!wd", name = "b", descriptor = "(B)V")
	public final synchronized void method5580() {
		if (this.aBoolean487) {
			return;
		}
		@Pc(12) long local12 = Static158.method2342();
		try {
			if (local12 > this.aLong218 + 500000L) {
				this.aLong218 = local12 - 500000L;
			}
			while (this.aLong218 + 5000L < local12) {
				this.method5581();
				this.aLong218 += 256000 / Static208.anInt3680;
			}
		} catch (@Pc(54) Exception local54) {
			this.aLong218 = local12;
		}
		if (this.anIntArray610 == null) {
			return;
		}
		try {
			if (this.aLong219 != 0L) {
				if (local12 < this.aLong219) {
					return;
				}
				this.method5572(this.anInt7257);
				this.aLong219 = 0L;
				this.aBoolean488 = true;
			}
			@Pc(85) int local85 = this.method5584();
			if (this.anInt7256 < this.anInt7254 - local85) {
				this.anInt7256 = this.anInt7254 - local85;
			}
			@Pc(109) int local109 = this.anInt7255 + this.anInt7260;
			if (local109 + 256 > 16384) {
				local109 = 16128;
			}
			if (local109 + 256 > this.anInt7257) {
				this.anInt7257 += 1024;
				if (this.anInt7257 > 16384) {
					this.anInt7257 = 16384;
				}
				this.method5579();
				this.method5572(this.anInt7257);
				local85 = 0;
				this.aBoolean488 = true;
				if (this.anInt7257 < local109 + 256) {
					local109 = this.anInt7257 - 256;
					this.anInt7260 = local109 - this.anInt7255;
				}
			}
			while (local85 < local109) {
				this.method5576(this.anIntArray610);
				this.method5578();
				local85 += 256;
			}
			if (this.aLong220 < local12) {
				if (this.aBoolean488) {
					this.aBoolean488 = false;
				} else if (this.anInt7256 == 0 && this.anInt7259 == 0) {
					this.method5579();
					this.aLong219 = local12 + 2000L;
					return;
				} else {
					this.anInt7260 = Math.min(this.anInt7259, this.anInt7256);
					this.anInt7259 = this.anInt7256;
				}
				this.anInt7256 = 0;
				this.aLong220 = local12 + 2000L;
			}
			this.anInt7254 = local85;
		} catch (@Pc(243) Exception local243) {
			this.method5579();
			this.aLong219 = local12 + 2000L;
		}
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(IZ)V")
	private void method5581() {
		this.anInt7253 -= 256;
		if (this.anInt7253 < 0) {
			this.anInt7253 = 0;
		}
		if (this.aClass7_Sub8_8 != null) {
			this.aClass7_Sub8_8.method4870(256);
		}
	}

	@OriginalMember(owner = "client!wd", name = "d", descriptor = "(I)V")
	public final synchronized void method5583() {
		this.aBoolean488 = true;
		try {
			this.method5586();
		} catch (@Pc(10) Exception local10) {
			this.method5579();
			this.aLong219 = Static158.method2342() + 2000L;
		}
	}

	@OriginalMember(owner = "client!wd", name = "c", descriptor = "()I")
	protected int method5584() throws Exception {
		return this.anInt7257;
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(Ljava/awt/Component;)V")
	public void method5585(@OriginalArg(0) Component arg0) throws Exception {
	}

	@OriginalMember(owner = "client!wd", name = "d", descriptor = "()V")
	protected void method5586() throws Exception {
	}
}
