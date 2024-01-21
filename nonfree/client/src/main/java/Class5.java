import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sg")
public class Class5 {

	@OriginalMember(owner = "client!sg", name = "u", descriptor = "Lclient!tb;")
	private Class3_Sub9 aClass3_Sub9_8;

	@OriginalMember(owner = "client!sg", name = "z", descriptor = "[I")
	public int[] anIntArray381;

	@OriginalMember(owner = "client!sg", name = "I", descriptor = "I")
	public int anInt3596;

	@OriginalMember(owner = "client!sg", name = "M", descriptor = "I")
	private int anInt3598;

	@OriginalMember(owner = "client!sg", name = "P", descriptor = "I")
	public int anInt3600;

	@OriginalMember(owner = "client!sg", name = "m", descriptor = "I")
	private final int anInt3581 = 32;

	@OriginalMember(owner = "client!sg", name = "j", descriptor = "J")
	private long aLong167 = Static88.method1536();

	@OriginalMember(owner = "client!sg", name = "G", descriptor = "I")
	private int anInt3594 = 0;

	@OriginalMember(owner = "client!sg", name = "J", descriptor = "[Lclient!tb;")
	private final Class3_Sub9[] aClass3_Sub9Array5 = new Class3_Sub9[8];

	@OriginalMember(owner = "client!sg", name = "F", descriptor = "Z")
	private boolean aBoolean242 = true;

	@OriginalMember(owner = "client!sg", name = "K", descriptor = "J")
	private long aLong168 = 0L;

	@OriginalMember(owner = "client!sg", name = "H", descriptor = "I")
	private int anInt3595 = 0;

	@OriginalMember(owner = "client!sg", name = "R", descriptor = "[Lclient!tb;")
	private final Class3_Sub9[] aClass3_Sub9Array6 = new Class3_Sub9[8];

	@OriginalMember(owner = "client!sg", name = "T", descriptor = "I")
	private int anInt3602 = 0;

	@OriginalMember(owner = "client!sg", name = "S", descriptor = "J")
	private long aLong169 = 0L;

	@OriginalMember(owner = "client!sg", name = "W", descriptor = "I")
	private int anInt3603 = 0;

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "()I")
	protected int method2585() throws Exception {
		return this.anInt3600;
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(Z)V")
	public final synchronized void method2587() {
		if (this.anIntArray381 == null) {
			return;
		}
		@Pc(12) long local12 = Static88.method1536();
		try {
			if (this.aLong169 != 0L) {
				if (local12 < this.aLong169) {
					return;
				}
				this.method2602(this.anInt3600);
				this.aLong169 = 0L;
				this.aBoolean242 = true;
			}
			@Pc(50) int local50 = this.method2585();
			@Pc(56) int local56 = this.anInt3596 + this.anInt3598;
			if (this.anInt3602 - local50 > this.anInt3603) {
				this.anInt3603 = this.anInt3602 - local50;
			}
			if (local56 + 256 > 16384) {
				local56 = 16128;
			}
			if (this.anInt3600 < local56 + 256) {
				this.anInt3600 += 1024;
				if (this.anInt3600 > 16384) {
					this.anInt3600 = 16384;
				}
				local50 = 0;
				this.method2593();
				this.method2602(this.anInt3600);
				this.aBoolean242 = true;
				if (this.anInt3600 < local56 + 256) {
					local56 = this.anInt3600 - 256;
					this.anInt3598 = local56 - this.anInt3596;
				}
			}
			while (local50 < local56) {
				this.method2594(this.anIntArray381);
				this.method2599();
				local50 += 256;
			}
			if (local12 > this.aLong168) {
				if (this.aBoolean242) {
					this.aBoolean242 = false;
				} else if (this.anInt3603 == 0 && this.anInt3595 == 0) {
					this.method2593();
					this.aLong169 = local12 + 2000L;
					return;
				} else {
					this.anInt3598 = Math.min(this.anInt3595, this.anInt3603);
					this.anInt3595 = this.anInt3603;
				}
				this.anInt3603 = 0;
				this.aLong168 = local12 + 2000L;
			}
			this.anInt3602 = local50;
		} catch (@Pc(201) Exception local201) {
			this.method2593();
			this.aLong169 = local12 + 2000L;
		}
		try {
			if (this.aLong167 + 500000L < local12) {
				local12 = this.aLong167;
			}
			while (local12 > this.aLong167 + 5000L) {
				this.method2595();
				this.aLong167 += 256000 / Static143.anInt3288;
			}
		} catch (@Pc(246) Exception local246) {
			this.aLong167 = local12;
		}
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(I)V")
	public final synchronized void method2588() {
		if (Static166.aClass76_1 != null) {
			@Pc(5) boolean local5 = true;
			for (@Pc(7) int local7 = 0; local7 < 2; local7++) {
				if (Static166.aClass76_1.aClass5Array1[local7] == this) {
					Static166.aClass76_1.aClass5Array1[local7] = null;
				}
				if (Static166.aClass76_1.aClass5Array1[local7] != null) {
					local5 = false;
				}
			}
			if (local5) {
				Static166.aClass76_1.aBoolean227 = true;
				while (Static166.aClass76_1.aBoolean228) {
					Static166.method2609(50L);
				}
				Static166.aClass76_1 = null;
			}
		}
		this.method2593();
		this.anIntArray381 = null;
	}

	@OriginalMember(owner = "client!sg", name = "b", descriptor = "(I)V")
	public final synchronized void method2589() {
		this.aBoolean242 = true;
		try {
			this.method2590();
		} catch (@Pc(15) Exception local15) {
			this.method2593();
			this.aLong169 = Static88.method1536() + 2000L;
		}
	}

	@OriginalMember(owner = "client!sg", name = "b", descriptor = "()V")
	protected void method2590() throws Exception {
	}

	@OriginalMember(owner = "client!sg", name = "c", descriptor = "()V")
	protected void method2593() {
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "([II)V")
	private void method2594(@OriginalArg(0) int[] arg0) {
		@Pc(1) short local1 = 256;
		if (Static126.aBoolean195) {
			local1 = 512;
		}
		Static184.method1121(arg0, 0, local1);
		this.anInt3594 -= 256;
		if (this.aClass3_Sub9_8 != null && this.anInt3594 <= 0) {
			this.anInt3594 += Static143.anInt3288 >> 4;
			Static176.method2724(this.aClass3_Sub9_8);
			this.method2604(this.aClass3_Sub9_8.method2217(), this.aClass3_Sub9_8);
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
						@Pc(88) Class3_Sub9 local88 = null;
						@Pc(93) Class3_Sub9 local93 = this.aClass3_Sub9Array5[local56];
						label97: while (true) {
							while (true) {
								if (local93 == null) {
									break label97;
								}
								@Pc(97) Class3_Sub4 local97 = local93.aClass3_Sub4_5;
								if (local97 == null || local97.anInt306 <= local61) {
									local93.aBoolean208 = true;
									@Pc(121) int local121 = local93.method2214();
									local45 += local121;
									if (local97 != null) {
										local97.anInt306 += local121;
									}
									if (local45 >= this.anInt3581) {
										break label103;
									}
									@Pc(140) Class3_Sub9 local140 = local93.method2219();
									if (local140 != null) {
										@Pc(145) int local145 = local93.anInt3072;
										while (local140 != null) {
											this.method2604(local145 * local140.method2217() >> 8, local140);
											local140 = local93.method2218();
										}
									}
									@Pc(164) Class3_Sub9 local164 = local93.aClass3_Sub9_7;
									local93.aClass3_Sub9_7 = null;
									if (local88 == null) {
										this.aClass3_Sub9Array5[local56] = local164;
									} else {
										local88.aClass3_Sub9_7 = local164;
									}
									if (local164 == null) {
										this.aClass3_Sub9Array6[local56] = local88;
									}
									local93 = local164;
								} else {
									local47 |= 0x1 << local56;
									local88 = local93;
									local93 = local93.aClass3_Sub9_7;
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
				@Pc(207) Class3_Sub9 local207 = this.aClass3_Sub9Array5[local56];
				this.aClass3_Sub9Array5[local56] = this.aClass3_Sub9Array6[local56] = null;
				while (local207 != null) {
					@Pc(221) Class3_Sub9 local221 = local207.aClass3_Sub9_7;
					local207.aClass3_Sub9_7 = null;
					local207 = local221;
				}
			}
		}
		if (this.anInt3594 < 0) {
			this.anInt3594 = 0;
		}
		if (this.aClass3_Sub9_8 != null) {
			this.aClass3_Sub9_8.method2220(arg0, 0, 256);
		}
		this.aLong167 = Static88.method1536();
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(IB)V")
	private void method2595() {
		this.anInt3594 -= 256;
		if (this.anInt3594 < 0) {
			this.anInt3594 = 0;
		}
		if (this.aClass3_Sub9_8 != null) {
			this.aClass3_Sub9_8.method2215(256);
		}
	}

	@OriginalMember(owner = "client!sg", name = "c", descriptor = "(B)V")
	public final void method2598() {
		this.aBoolean242 = true;
	}

	@OriginalMember(owner = "client!sg", name = "d", descriptor = "()V")
	protected void method2599() throws Exception {
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(Ljava/awt/Component;)V")
	public void method2600(@OriginalArg(0) Component arg0) throws Exception {
	}

	@OriginalMember(owner = "client!sg", name = "d", descriptor = "(I)V")
	public void method2602(@OriginalArg(0) int arg0) throws Exception {
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(ZILclient!tb;)V")
	private void method2604(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub9 arg1) {
		@Pc(7) int local7 = arg0 >> 5;
		@Pc(12) Class3_Sub9 local12 = this.aClass3_Sub9Array6[local7];
		if (local12 == null) {
			this.aClass3_Sub9Array5[local7] = arg1;
		} else {
			local12.aClass3_Sub9_7 = arg1;
		}
		this.aClass3_Sub9Array6[local7] = arg1;
		arg1.anInt3072 = arg0;
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(ILclient!tb;)V")
	public final synchronized void method2605(@OriginalArg(1) Class3_Sub9 arg0) {
		this.aClass3_Sub9_8 = arg0;
	}
}
