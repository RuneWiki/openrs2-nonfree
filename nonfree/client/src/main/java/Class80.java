import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kv")
public class Class80 {

	@OriginalMember(owner = "client!kv", name = "p", descriptor = "Lclient!mi;")
	private Class4_Sub7 aClass4_Sub7_7;

	@OriginalMember(owner = "client!kv", name = "t", descriptor = "[I")
	public int[] anIntArray347;

	@OriginalMember(owner = "client!kv", name = "D", descriptor = "I")
	public int anInt6712;

	@OriginalMember(owner = "client!kv", name = "E", descriptor = "I")
	public int anInt6713;

	@OriginalMember(owner = "client!kv", name = "F", descriptor = "I")
	private int anInt6714;

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "Z")
	private boolean aBoolean488 = false;

	@OriginalMember(owner = "client!kv", name = "s", descriptor = "I")
	private final int anInt6706 = 32;

	@OriginalMember(owner = "client!kv", name = "i", descriptor = "J")
	private long aLong169 = Static574.method8210();

	@OriginalMember(owner = "client!kv", name = "u", descriptor = "Z")
	private boolean aBoolean489 = true;

	@OriginalMember(owner = "client!kv", name = "B", descriptor = "J")
	private long aLong170 = 0L;

	@OriginalMember(owner = "client!kv", name = "C", descriptor = "I")
	private int anInt6711 = 0;

	@OriginalMember(owner = "client!kv", name = "x", descriptor = "[Lclient!mi;")
	private final Class4_Sub7[] aClass4_Sub7Array6 = new Class4_Sub7[8];

	@OriginalMember(owner = "client!kv", name = "z", descriptor = "I")
	private int anInt6709 = 0;

	@OriginalMember(owner = "client!kv", name = "A", descriptor = "I")
	private int anInt6710 = 0;

	@OriginalMember(owner = "client!kv", name = "w", descriptor = "[Lclient!mi;")
	private final Class4_Sub7[] aClass4_Sub7Array5 = new Class4_Sub7[8];

	@OriginalMember(owner = "client!kv", name = "y", descriptor = "I")
	private int anInt6708 = 0;

	@OriginalMember(owner = "client!kv", name = "G", descriptor = "J")
	private long aLong171 = 0L;

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(B)V")
	public final synchronized void method5598() {
		this.aBoolean489 = true;
		try {
			this.method5600();
		} catch (@Pc(18) Exception local18) {
			this.method5610();
			this.aLong170 = Static574.method8210() + 2000L;
		}
	}

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(I)V")
	public void method5599(@OriginalArg(0) int arg0) throws Exception {
	}

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "()V")
	protected void method5600() throws Exception {
	}

	@OriginalMember(owner = "client!kv", name = "b", descriptor = "(I)V")
	public final synchronized void method5601() {
		if (this.aBoolean488) {
			return;
		}
		@Pc(17) long local17 = Static574.method8210();
		try {
			if (local17 > this.aLong169 + 500000L) {
				this.aLong169 = local17 - 500000L;
			}
			while (this.aLong169 + 5000L < local17) {
				this.method5606();
				this.aLong169 += 256000 / Static262.anInt5047;
			}
		} catch (@Pc(53) Exception local53) {
			this.aLong169 = local17;
		}
		if (this.anIntArray347 == null) {
			return;
		}
		try {
			if (this.aLong170 != 0L) {
				if (this.aLong170 > local17) {
					return;
				}
				this.method5599(this.anInt6713);
				this.aBoolean489 = true;
				this.aLong170 = 0L;
			}
			@Pc(86) int local86 = this.method5608();
			if (this.anInt6709 < this.anInt6711 - local86) {
				this.anInt6709 = this.anInt6711 - local86;
			}
			@Pc(111) int local111 = this.anInt6712 + this.anInt6714;
			if (local111 + 256 > 16384) {
				local111 = 16128;
			}
			if (local111 + 256 > this.anInt6713) {
				this.anInt6713 += 1024;
				if (this.anInt6713 > 16384) {
					this.anInt6713 = 16384;
				}
				this.method5610();
				this.method5599(this.anInt6713);
				local86 = 0;
				this.aBoolean489 = true;
				if (local111 + 256 > this.anInt6713) {
					local111 = this.anInt6713 - 256;
					this.anInt6714 = local111 - this.anInt6712;
				}
			}
			while (local111 > local86) {
				this.method5609(this.anIntArray347);
				local86 += 256;
				this.method5602();
			}
			if (local17 > this.aLong171) {
				if (this.aBoolean489) {
					this.aBoolean489 = false;
				} else if (this.anInt6709 == 0 && this.anInt6710 == 0) {
					this.method5610();
					this.aLong170 = local17 + 2000L;
					return;
				} else {
					this.anInt6714 = Math.min(this.anInt6710, this.anInt6709);
					this.anInt6710 = this.anInt6709;
				}
				this.anInt6709 = 0;
				this.aLong171 = local17 + 2000L;
			}
			this.anInt6711 = local86;
		} catch (@Pc(242) Exception local242) {
			this.method5610();
			this.aLong170 = local17 + 2000L;
		}
	}

	@OriginalMember(owner = "client!kv", name = "b", descriptor = "()V")
	protected void method5602() throws Exception {
	}

	@OriginalMember(owner = "client!kv", name = "c", descriptor = "(I)V")
	public final synchronized void method5603() {
		if (Static30.aClass156_1 != null) {
			@Pc(5) boolean local5 = true;
			for (@Pc(7) int local7 = 0; local7 < 2; local7++) {
				if (Static30.aClass156_1.aClass80Array1[local7] == this) {
					Static30.aClass156_1.aClass80Array1[local7] = null;
				}
				if (Static30.aClass156_1.aClass80Array1[local7] != null) {
					local5 = false;
				}
			}
			if (local5) {
				Static30.aClass156_1.aBoolean305 = true;
				while (Static30.aClass156_1.aBoolean304) {
					Static63.method1019(50L);
				}
				Static30.aClass156_1 = null;
			}
		}
		this.method5610();
		this.anIntArray347 = null;
		this.aBoolean488 = true;
	}

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(BI)V")
	private void method5606() {
		this.anInt6708 -= 256;
		if (this.anInt6708 < 0) {
			this.anInt6708 = 0;
		}
		if (this.aClass4_Sub7_7 != null) {
			this.aClass4_Sub7_7.method6402(256);
		}
	}

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(Lclient!mi;I)V")
	public final synchronized void method5607(@OriginalArg(0) Class4_Sub7 arg0) {
		this.aClass4_Sub7_7 = arg0;
	}

	@OriginalMember(owner = "client!kv", name = "c", descriptor = "()I")
	protected int method5608() throws Exception {
		return this.anInt6713;
	}

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "([II)V")
	private void method5609(@OriginalArg(0) int[] arg0) {
		@Pc(1) short local1 = 256;
		if (Static161.aBoolean31) {
			local1 = 512;
		}
		Static597.method3727(arg0, 0, local1);
		this.anInt6708 -= 256;
		if (this.aClass4_Sub7_7 != null && this.anInt6708 <= 0) {
			this.anInt6708 += Static262.anInt5047 >> 4;
			Static185.method3284(this.aClass4_Sub7_7);
			this.method5614(this.aClass4_Sub7_7.method6399(), this.aClass4_Sub7_7);
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
						@Pc(88) Class4_Sub7 local88 = null;
						@Pc(93) Class4_Sub7 local93 = this.aClass4_Sub7Array6[local56];
						label97: while (true) {
							while (true) {
								if (local93 == null) {
									break label97;
								}
								@Pc(97) Class4_Sub16 local97 = local93.aClass4_Sub16_5;
								if (local97 == null || local97.anInt2743 <= local61) {
									local93.aBoolean532 = true;
									@Pc(121) int local121 = local93.method6405();
									local45 += local121;
									if (local97 != null) {
										local97.anInt2743 += local121;
									}
									if (local45 >= this.anInt6706) {
										break label103;
									}
									@Pc(140) Class4_Sub7 local140 = local93.method6401();
									if (local140 != null) {
										@Pc(145) int local145 = local93.anInt7720;
										while (local140 != null) {
											this.method5614(local145 * local140.method6399() >> 8, local140);
											local140 = local93.method6404();
										}
									}
									@Pc(164) Class4_Sub7 local164 = local93.aClass4_Sub7_8;
									local93.aClass4_Sub7_8 = null;
									if (local88 == null) {
										this.aClass4_Sub7Array6[local56] = local164;
									} else {
										local88.aClass4_Sub7_8 = local164;
									}
									if (local164 == null) {
										this.aClass4_Sub7Array5[local56] = local88;
									}
									local93 = local164;
								} else {
									local47 |= 0x1 << local56;
									local88 = local93;
									local93 = local93.aClass4_Sub7_8;
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
				@Pc(207) Class4_Sub7 local207 = this.aClass4_Sub7Array6[local56];
				this.aClass4_Sub7Array6[local56] = this.aClass4_Sub7Array5[local56] = null;
				while (local207 != null) {
					@Pc(221) Class4_Sub7 local221 = local207.aClass4_Sub7_8;
					local207.aClass4_Sub7_8 = null;
					local207 = local221;
				}
			}
		}
		if (this.anInt6708 < 0) {
			this.anInt6708 = 0;
		}
		if (this.aClass4_Sub7_7 != null) {
			this.aClass4_Sub7_7.method6400(arg0, 0, 256);
		}
		this.aLong169 = Static574.method8210();
	}

	@OriginalMember(owner = "client!kv", name = "d", descriptor = "()V")
	protected void method5610() {
	}

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(Ljava/awt/Component;)V")
	public void method5613(@OriginalArg(0) Component arg0) throws Exception {
	}

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(IZLclient!mi;)V")
	private void method5614(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub7 arg1) {
		@Pc(7) int local7 = arg0 >> 5;
		@Pc(12) Class4_Sub7 local12 = this.aClass4_Sub7Array5[local7];
		if (local12 == null) {
			this.aClass4_Sub7Array6[local7] = arg1;
		} else {
			local12.aClass4_Sub7_8 = arg1;
		}
		this.aClass4_Sub7Array5[local7] = arg1;
		arg1.anInt7720 = arg0;
	}
}
