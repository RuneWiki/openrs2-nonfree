import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ng")
public class Class35 {

	@OriginalMember(owner = "client!ng", name = "k", descriptor = "[I")
	public int[] anIntArray255;

	@OriginalMember(owner = "client!ng", name = "G", descriptor = "Lclient!kb;")
	private Class4_Sub1 aClass4_Sub1_6;

	@OriginalMember(owner = "client!ng", name = "J", descriptor = "I")
	private int anInt2923;

	@OriginalMember(owner = "client!ng", name = "K", descriptor = "I")
	public int anInt2924;

	@OriginalMember(owner = "client!ng", name = "U", descriptor = "I")
	public int anInt2929;

	@OriginalMember(owner = "client!ng", name = "u", descriptor = "I")
	private final int anInt2913 = 32;

	@OriginalMember(owner = "client!ng", name = "c", descriptor = "Z")
	private boolean aBoolean208 = false;

	@OriginalMember(owner = "client!ng", name = "D", descriptor = "J")
	private long aLong85 = Static208.method3879();

	@OriginalMember(owner = "client!ng", name = "M", descriptor = "J")
	private long aLong86 = 0L;

	@OriginalMember(owner = "client!ng", name = "O", descriptor = "I")
	private int anInt2926 = 0;

	@OriginalMember(owner = "client!ng", name = "P", descriptor = "J")
	private long aLong87 = 0L;

	@OriginalMember(owner = "client!ng", name = "Q", descriptor = "[Lclient!kb;")
	private final Class4_Sub1[] aClass4_Sub1Array6 = new Class4_Sub1[8];

	@OriginalMember(owner = "client!ng", name = "N", descriptor = "[Lclient!kb;")
	private final Class4_Sub1[] aClass4_Sub1Array5 = new Class4_Sub1[8];

	@OriginalMember(owner = "client!ng", name = "R", descriptor = "I")
	private int anInt2927 = 0;

	@OriginalMember(owner = "client!ng", name = "T", descriptor = "I")
	private int anInt2928 = 0;

	@OriginalMember(owner = "client!ng", name = "V", descriptor = "Z")
	private boolean aBoolean209 = true;

	@OriginalMember(owner = "client!ng", name = "L", descriptor = "I")
	private int anInt2925 = 0;

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(Lclient!kb;B)V")
	public final synchronized void method2549(@OriginalArg(0) Class4_Sub1 arg0) {
		this.aClass4_Sub1_6 = arg0;
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(BI)V")
	private void method2551() {
		this.anInt2926 -= 256;
		if (this.anInt2926 < 0) {
			this.anInt2926 = 0;
		}
		if (this.aClass4_Sub1_6 != null) {
			this.aClass4_Sub1_6.method3783(256);
		}
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(I)V")
	public void method2552(@OriginalArg(0) int arg0) throws Exception {
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "()V")
	protected void method2553() {
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(Ljava/awt/Component;)V")
	public void method2555(@OriginalArg(0) Component arg0) throws Exception {
	}

	@OriginalMember(owner = "client!ng", name = "b", descriptor = "(I)V")
	public final void method2556() {
		this.aBoolean209 = true;
	}

	@OriginalMember(owner = "client!ng", name = "b", descriptor = "()I")
	protected int method2557() throws Exception {
		return this.anInt2924;
	}

	@OriginalMember(owner = "client!ng", name = "c", descriptor = "()V")
	protected void method2558() throws Exception {
	}

	@OriginalMember(owner = "client!ng", name = "b", descriptor = "(B)V")
	public final synchronized void method2559() {
		if (this.aBoolean208) {
			return;
		}
		@Pc(12) long local12 = Static208.method3879();
		try {
			if (local12 > this.aLong85 + 500000L) {
				this.aLong85 = local12 - 500000L;
			}
			while (local12 > this.aLong85 + 5000L) {
				this.method2551();
				this.aLong85 += 256000 / Static251.anInt5134;
			}
		} catch (@Pc(52) Exception local52) {
			this.aLong85 = local12;
		}
		if (this.anIntArray255 == null) {
			return;
		}
		try {
			if (this.aLong86 != 0L) {
				if (local12 < this.aLong86) {
					return;
				}
				this.method2552(this.anInt2924);
				this.aLong86 = 0L;
				this.aBoolean209 = true;
			}
			@Pc(85) int local85 = this.method2557();
			if (this.anInt2927 < this.anInt2928 - local85) {
				this.anInt2927 = this.anInt2928 - local85;
			}
			@Pc(105) int local105 = this.anInt2923 + this.anInt2929;
			if (local105 + 256 > 16384) {
				local105 = 16128;
			}
			if (this.anInt2924 < local105 + 256) {
				this.anInt2924 += 1024;
				if (this.anInt2924 > 16384) {
					this.anInt2924 = 16384;
				}
				this.method2553();
				local85 = 0;
				this.method2552(this.anInt2924);
				if (this.anInt2924 < local105 + 256) {
					local105 = this.anInt2924 - 256;
					this.anInt2923 = local105 - this.anInt2929;
				}
				this.aBoolean209 = true;
			}
			while (local85 < local105) {
				this.method2563(this.anIntArray255);
				local85 += 256;
				this.method2565();
			}
			if (local12 > this.aLong87) {
				if (this.aBoolean209) {
					this.aBoolean209 = false;
				} else if (this.anInt2927 == 0 && this.anInt2925 == 0) {
					this.method2553();
					this.aLong86 = local12 + 2000L;
					return;
				} else {
					this.anInt2923 = Math.min(this.anInt2925, this.anInt2927);
					this.anInt2925 = this.anInt2927;
				}
				this.aLong87 = local12 + 2000L;
				this.anInt2927 = 0;
			}
			this.anInt2928 = local85;
		} catch (@Pc(249) Exception local249) {
			this.method2553();
			this.aLong86 = local12 + 2000L;
		}
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "([II)V")
	private void method2563(@OriginalArg(0) int[] arg0) {
		@Pc(1) short local1 = 256;
		if (Static314.aBoolean451) {
			local1 = 512;
		}
		Static359.method766(arg0, 0, local1);
		this.anInt2926 -= 256;
		if (this.aClass4_Sub1_6 != null && this.anInt2926 <= 0) {
			this.anInt2926 += Static251.anInt5134 >> 4;
			Static189.method3604(this.aClass4_Sub1_6);
			this.method2566(this.aClass4_Sub1_6.method3782(), this.aClass4_Sub1_6);
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
						@Pc(88) Class4_Sub1 local88 = null;
						@Pc(93) Class4_Sub1 local93 = this.aClass4_Sub1Array5[local56];
						label97: while (true) {
							while (true) {
								if (local93 == null) {
									break label97;
								}
								@Pc(97) Class4_Sub7 local97 = local93.aClass4_Sub7_5;
								if (local97 == null || local97.anInt480 <= local61) {
									local93.aBoolean322 = true;
									@Pc(121) int local121 = local93.method3786();
									local45 += local121;
									if (local97 != null) {
										local97.anInt480 += local121;
									}
									if (local45 >= this.anInt2913) {
										break label103;
									}
									@Pc(140) Class4_Sub1 local140 = local93.method3784();
									if (local140 != null) {
										@Pc(145) int local145 = local93.anInt4157;
										while (local140 != null) {
											this.method2566(local145 * local140.method3782() >> 8, local140);
											local140 = local93.method3787();
										}
									}
									@Pc(164) Class4_Sub1 local164 = local93.aClass4_Sub1_8;
									local93.aClass4_Sub1_8 = null;
									if (local88 == null) {
										this.aClass4_Sub1Array5[local56] = local164;
									} else {
										local88.aClass4_Sub1_8 = local164;
									}
									if (local164 == null) {
										this.aClass4_Sub1Array6[local56] = local88;
									}
									local93 = local164;
								} else {
									local47 |= 0x1 << local56;
									local88 = local93;
									local93 = local93.aClass4_Sub1_8;
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
				@Pc(207) Class4_Sub1 local207 = this.aClass4_Sub1Array5[local56];
				this.aClass4_Sub1Array5[local56] = this.aClass4_Sub1Array6[local56] = null;
				while (local207 != null) {
					@Pc(221) Class4_Sub1 local221 = local207.aClass4_Sub1_8;
					local207.aClass4_Sub1_8 = null;
					local207 = local221;
				}
			}
		}
		if (this.anInt2926 < 0) {
			this.anInt2926 = 0;
		}
		if (this.aClass4_Sub1_6 != null) {
			this.aClass4_Sub1_6.method3781(arg0, 0, 256);
		}
		this.aLong85 = Static208.method3879();
	}

	@OriginalMember(owner = "client!ng", name = "d", descriptor = "()V")
	protected void method2565() throws Exception {
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(IILclient!kb;)V")
	private void method2566(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub1 arg1) {
		@Pc(7) int local7 = arg0 >> 5;
		@Pc(12) Class4_Sub1 local12 = this.aClass4_Sub1Array6[local7];
		if (local12 == null) {
			this.aClass4_Sub1Array5[local7] = arg1;
		} else {
			local12.aClass4_Sub1_8 = arg1;
		}
		this.aClass4_Sub1Array6[local7] = arg1;
		arg1.anInt4157 = arg0;
	}

	@OriginalMember(owner = "client!ng", name = "b", descriptor = "(Z)V")
	public final synchronized void method2567() {
		this.aBoolean209 = true;
		try {
			this.method2558();
		} catch (@Pc(10) Exception local10) {
			this.method2553();
			this.aLong86 = Static208.method3879() + 2000L;
		}
	}

	@OriginalMember(owner = "client!ng", name = "c", descriptor = "(B)V")
	public final synchronized void method2568() {
		if (Static7.aClass135_1 != null) {
			@Pc(13) boolean local13 = true;
			for (@Pc(15) int local15 = 0; local15 < 2; local15++) {
				if (Static7.aClass135_1.aClass35Array1[local15] == this) {
					Static7.aClass135_1.aClass35Array1[local15] = null;
				}
				if (Static7.aClass135_1.aClass35Array1[local15] != null) {
					local13 = false;
				}
			}
			if (local13) {
				Static7.aClass135_1.aBoolean320 = true;
				while (Static7.aClass135_1.aBoolean321) {
					Static249.method4396(50L);
				}
				Static7.aClass135_1 = null;
			}
		}
		this.method2553();
		this.anIntArray255 = null;
		this.aBoolean208 = true;
	}
}
