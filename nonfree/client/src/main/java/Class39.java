import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vo")
public class Class39 {

	@OriginalMember(owner = "client!vo", name = "m", descriptor = "Lclient!ep;")
	private Class2_Sub2 aClass2_Sub2_6;

	@OriginalMember(owner = "client!vo", name = "q", descriptor = "[I")
	public int[] anIntArray247;

	@OriginalMember(owner = "client!vo", name = "y", descriptor = "I")
	private int anInt3511;

	@OriginalMember(owner = "client!vo", name = "A", descriptor = "I")
	public int anInt3512;

	@OriginalMember(owner = "client!vo", name = "E", descriptor = "I")
	public int anInt3514;

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "I")
	private final int anInt3494 = 32;

	@OriginalMember(owner = "client!vo", name = "r", descriptor = "Z")
	private boolean aBoolean300 = false;

	@OriginalMember(owner = "client!vo", name = "v", descriptor = "J")
	private long aLong95 = Static438.method6517();

	@OriginalMember(owner = "client!vo", name = "x", descriptor = "J")
	private long aLong96 = 0L;

	@OriginalMember(owner = "client!vo", name = "D", descriptor = "J")
	private long aLong97 = 0L;

	@OriginalMember(owner = "client!vo", name = "z", descriptor = "[Lclient!ep;")
	private final Class2_Sub2[] aClass2_Sub2Array5 = new Class2_Sub2[8];

	@OriginalMember(owner = "client!vo", name = "F", descriptor = "I")
	private int anInt3515 = 0;

	@OriginalMember(owner = "client!vo", name = "B", descriptor = "I")
	private int anInt3513 = 0;

	@OriginalMember(owner = "client!vo", name = "C", descriptor = "[Lclient!ep;")
	private final Class2_Sub2[] aClass2_Sub2Array6 = new Class2_Sub2[8];

	@OriginalMember(owner = "client!vo", name = "H", descriptor = "Z")
	private boolean aBoolean301 = true;

	@OriginalMember(owner = "client!vo", name = "I", descriptor = "I")
	private int anInt3516 = 0;

	@OriginalMember(owner = "client!vo", name = "J", descriptor = "I")
	private int anInt3517 = 0;

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "()V")
	protected void method2873() {
	}

	@OriginalMember(owner = "client!vo", name = "b", descriptor = "()I")
	protected int method2875() throws Exception {
		return this.anInt3514;
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(Ljava/awt/Component;)V")
	public void method2876(@OriginalArg(0) Component arg0) throws Exception {
	}

	@OriginalMember(owner = "client!vo", name = "c", descriptor = "()V")
	protected void method2879() throws Exception {
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(II)V")
	private void method2880() {
		this.anInt3517 -= 256;
		if (this.anInt3517 < 0) {
			this.anInt3517 = 0;
		}
		if (this.aClass2_Sub2_6 != null) {
			this.aClass2_Sub2_6.method7544(256);
		}
	}

	@OriginalMember(owner = "client!vo", name = "c", descriptor = "(I)V")
	public void method2881(@OriginalArg(0) int arg0) throws Exception {
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(B)V")
	public final synchronized void method2882() {
		if (Static414.aClass51_1 != null) {
			@Pc(12) boolean local12 = true;
			for (@Pc(14) int local14 = 0; local14 < 2; local14++) {
				if (Static414.aClass51_1.aClass39Array1[local14] == this) {
					Static414.aClass51_1.aClass39Array1[local14] = null;
				}
				if (Static414.aClass51_1.aClass39Array1[local14] != null) {
					local12 = false;
				}
			}
			if (local12) {
				Static414.aClass51_1.aBoolean89 = true;
				while (Static414.aClass51_1.aBoolean88) {
					Static57.method1062(50L);
				}
				Static414.aClass51_1 = null;
			}
		}
		this.method2873();
		this.aBoolean300 = true;
		this.anIntArray247 = null;
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(ILclient!ep;B)V")
	private void method2883(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub2 arg1) {
		@Pc(13) int local13 = arg0 >> 5;
		@Pc(18) Class2_Sub2 local18 = this.aClass2_Sub2Array5[local13];
		if (local18 == null) {
			this.aClass2_Sub2Array6[local13] = arg1;
		} else {
			local18.aClass2_Sub2_9 = arg1;
		}
		this.aClass2_Sub2Array5[local13] = arg1;
		arg1.anInt8999 = arg0;
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(ZLclient!ep;)V")
	public final synchronized void method2884(@OriginalArg(1) Class2_Sub2 arg0) {
		this.aClass2_Sub2_6 = arg0;
	}

	@OriginalMember(owner = "client!vo", name = "b", descriptor = "(B)V")
	public final synchronized void method2885() {
		if (this.aBoolean300) {
			return;
		}
		@Pc(10) long local10 = Static438.method6517();
		try {
			if (this.aLong95 + 6000L < local10) {
				this.aLong95 = local10 - 6000L;
			}
			while (this.aLong95 + 5000L < local10) {
				this.method2880();
				this.aLong95 += 256000 / Static66.anInt1396;
				local10 = Static438.method6517();
			}
		} catch (@Pc(56) Exception local56) {
			this.aLong95 = local10;
		}
		if (this.anIntArray247 == null) {
			return;
		}
		try {
			if (this.aLong97 != 0L) {
				if (this.aLong97 > local10) {
					return;
				}
				this.method2881(this.anInt3514);
				this.aBoolean301 = true;
				this.aLong97 = 0L;
			}
			@Pc(93) int local93 = this.method2875();
			if (this.anInt3516 - local93 > this.anInt3513) {
				this.anInt3513 = this.anInt3516 - local93;
			}
			@Pc(114) int local114 = this.anInt3512 + this.anInt3511;
			if (local114 + 256 > 16384) {
				local114 = 16128;
			}
			if (local114 + 256 > this.anInt3514) {
				this.anInt3514 += 1024;
				if (this.anInt3514 > 16384) {
					this.anInt3514 = 16384;
				}
				this.method2873();
				local93 = 0;
				this.method2881(this.anInt3514);
				this.aBoolean301 = true;
				if (this.anInt3514 < local114 + 256) {
					local114 = this.anInt3514 - 256;
					this.anInt3511 = local114 - this.anInt3512;
				}
			}
			while (local114 > local93) {
				this.method2886(this.anIntArray247);
				local93 += 256;
				this.method2879();
			}
			if (local10 > this.aLong96) {
				if (this.aBoolean301) {
					this.aBoolean301 = false;
				} else if (this.anInt3513 == 0 && this.anInt3515 == 0) {
					this.method2873();
					this.aLong97 = local10 + 2000L;
					return;
				} else {
					this.anInt3511 = Math.min(this.anInt3515, this.anInt3513);
					this.anInt3515 = this.anInt3513;
				}
				this.aLong96 = local10 + 2000L;
				this.anInt3513 = 0;
			}
			this.anInt3516 = local93;
		} catch (@Pc(252) Exception local252) {
			this.method2873();
			this.aLong97 = local10 + 2000L;
		}
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "([II)V")
	private void method2886(@OriginalArg(0) int[] arg0) {
		@Pc(1) short local1 = 256;
		if (Static440.aBoolean586) {
			local1 = 512;
		}
		Static649.method4864(arg0, 0, local1);
		this.anInt3517 -= 256;
		if (this.aClass2_Sub2_6 != null && this.anInt3517 <= 0) {
			this.anInt3517 += Static66.anInt1396 >> 4;
			Static534.method7471(this.aClass2_Sub2_6);
			this.method2883(this.aClass2_Sub2_6.method7543(), this.aClass2_Sub2_6);
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
								@Pc(97) Class2_Sub12 local97 = local93.aClass2_Sub12_6;
								if (local97 == null || local97.anInt1413 <= local61) {
									local93.aBoolean659 = true;
									@Pc(121) int local121 = local93.method7541();
									local45 += local121;
									if (local97 != null) {
										local97.anInt1413 += local121;
									}
									if (local45 >= this.anInt3494) {
										break label103;
									}
									@Pc(140) Class2_Sub2 local140 = local93.method7539();
									if (local140 != null) {
										@Pc(145) int local145 = local93.anInt8999;
										while (local140 != null) {
											this.method2883(local145 * local140.method7543() >> 8, local140);
											local140 = local93.method7542();
										}
									}
									@Pc(164) Class2_Sub2 local164 = local93.aClass2_Sub2_9;
									local93.aClass2_Sub2_9 = null;
									if (local88 == null) {
										this.aClass2_Sub2Array6[local56] = local164;
									} else {
										local88.aClass2_Sub2_9 = local164;
									}
									if (local164 == null) {
										this.aClass2_Sub2Array5[local56] = local88;
									}
									local93 = local164;
								} else {
									local47 |= 0x1 << local56;
									local88 = local93;
									local93 = local93.aClass2_Sub2_9;
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
					@Pc(221) Class2_Sub2 local221 = local207.aClass2_Sub2_9;
					local207.aClass2_Sub2_9 = null;
					local207 = local221;
				}
			}
		}
		if (this.anInt3517 < 0) {
			this.anInt3517 = 0;
		}
		if (this.aClass2_Sub2_6 != null) {
			this.aClass2_Sub2_6.method7538(arg0, 0, 256);
		}
		this.aLong95 = Static438.method6517();
	}

	@OriginalMember(owner = "client!vo", name = "d", descriptor = "(I)V")
	public final synchronized void method2887() {
		this.aBoolean301 = true;
		try {
			this.method2889();
		} catch (@Pc(16) Exception local16) {
			this.method2873();
			this.aLong97 = Static438.method6517() + 2000L;
		}
	}

	@OriginalMember(owner = "client!vo", name = "d", descriptor = "()V")
	protected void method2889() throws Exception {
	}
}
