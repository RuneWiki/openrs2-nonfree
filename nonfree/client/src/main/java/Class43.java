import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mca")
public class Class43 {

	@OriginalMember(owner = "client!mca", name = "k", descriptor = "Lclient!bk;")
	private Class3_Sub9 aClass3_Sub9_8;

	@OriginalMember(owner = "client!mca", name = "l", descriptor = "[I")
	public int[] anIntArray727;

	@OriginalMember(owner = "client!mca", name = "v", descriptor = "I")
	private int anInt8488;

	@OriginalMember(owner = "client!mca", name = "z", descriptor = "I")
	public int anInt8490;

	@OriginalMember(owner = "client!mca", name = "A", descriptor = "I")
	public int anInt8491;

	@OriginalMember(owner = "client!mca", name = "f", descriptor = "I")
	private final int anInt8476 = 32;

	@OriginalMember(owner = "client!mca", name = "a", descriptor = "Z")
	private boolean aBoolean620 = false;

	@OriginalMember(owner = "client!mca", name = "m", descriptor = "J")
	private long aLong261 = Static12.method647();

	@OriginalMember(owner = "client!mca", name = "u", descriptor = "[Lclient!bk;")
	private final Class3_Sub9[] aClass3_Sub9Array5 = new Class3_Sub9[8];

	@OriginalMember(owner = "client!mca", name = "w", descriptor = "I")
	private int anInt8489 = 0;

	@OriginalMember(owner = "client!mca", name = "x", descriptor = "[Lclient!bk;")
	private final Class3_Sub9[] aClass3_Sub9Array6 = new Class3_Sub9[8];

	@OriginalMember(owner = "client!mca", name = "y", descriptor = "J")
	private long aLong262 = 0L;

	@OriginalMember(owner = "client!mca", name = "C", descriptor = "J")
	private long aLong263 = 0L;

	@OriginalMember(owner = "client!mca", name = "B", descriptor = "I")
	private int anInt8492 = 0;

	@OriginalMember(owner = "client!mca", name = "E", descriptor = "I")
	private int anInt8493 = 0;

	@OriginalMember(owner = "client!mca", name = "D", descriptor = "Z")
	private boolean aBoolean621 = true;

	@OriginalMember(owner = "client!mca", name = "t", descriptor = "I")
	private int anInt8487 = 0;

	static {
		new Class67("You are temporarily blocked from joining channels - please try again later!", "Du darfst derzeit keine Chaträume betreten - bitte versuch es später.", "Vous êtes temporairement exclu des canaux - veuillez réessayer ultérieurement.", "Você está temporariamente impedido de entrar em canais. Tente de novo depois!");
	}

	@OriginalMember(owner = "client!mca", name = "a", descriptor = "(I)V")
	public final synchronized void method7014() {
		if (this.aBoolean620) {
			return;
		}
		@Pc(12) long local12 = Static12.method647();
		try {
			if (local12 > this.aLong261 + 500000L) {
				this.aLong261 = local12 - 500000L;
			}
			while (local12 > this.aLong261 + 5000L) {
				this.method7025();
				this.aLong261 += 256000 / Static361.anInt6755;
			}
		} catch (@Pc(60) Exception local60) {
			this.aLong261 = local12;
		}
		if (this.anIntArray727 == null) {
			return;
		}
		try {
			if (this.aLong262 != 0L) {
				if (local12 < this.aLong262) {
					return;
				}
				this.method7024(this.anInt8491);
				this.aLong262 = 0L;
				this.aBoolean621 = true;
			}
			@Pc(93) int local93 = this.method7018();
			if (this.anInt8489 - local93 > this.anInt8493) {
				this.anInt8493 = this.anInt8489 - local93;
			}
			@Pc(117) int local117 = this.anInt8488 + this.anInt8490;
			if (local117 + 256 > 16384) {
				local117 = 16128;
			}
			if (this.anInt8491 < local117 + 256) {
				this.anInt8491 += 1024;
				if (this.anInt8491 > 16384) {
					this.anInt8491 = 16384;
				}
				this.method7026();
				this.method7024(this.anInt8491);
				local93 = 0;
				if (this.anInt8491 < local117 + 256) {
					local117 = this.anInt8491 - 256;
					this.anInt8488 = local117 - this.anInt8490;
				}
				this.aBoolean621 = true;
			}
			while (local117 > local93) {
				this.method7016(this.anIntArray727);
				this.method7023();
				local93 += 256;
			}
			if (this.aLong263 < local12) {
				if (this.aBoolean621) {
					this.aBoolean621 = false;
				} else if (this.anInt8493 == 0 && this.anInt8492 == 0) {
					this.method7026();
					this.aLong262 = local12 + 2000L;
					return;
				} else {
					this.anInt8488 = Math.min(this.anInt8492, this.anInt8493);
					this.anInt8492 = this.anInt8493;
				}
				this.anInt8493 = 0;
				this.aLong263 = local12 + 2000L;
			}
			this.anInt8489 = local93;
		} catch (@Pc(249) Exception local249) {
			this.method7026();
			this.aLong262 = local12 + 2000L;
		}
	}

	@OriginalMember(owner = "client!mca", name = "b", descriptor = "(I)V")
	public final synchronized void method7015() {
		this.aBoolean621 = true;
		try {
			this.method7020();
		} catch (@Pc(10) Exception local10) {
			this.method7026();
			this.aLong262 = Static12.method647() + 2000L;
		}
	}

	@OriginalMember(owner = "client!mca", name = "a", descriptor = "([II)V")
	private void method7016(@OriginalArg(0) int[] arg0) {
		@Pc(1) short local1 = 256;
		if (Static8.aBoolean56) {
			local1 = 512;
		}
		Static559.method5953(arg0, 0, local1);
		this.anInt8487 -= 256;
		if (this.aClass3_Sub9_8 != null && this.anInt8487 <= 0) {
			this.anInt8487 += Static361.anInt6755 >> 4;
			Static180.method3435(this.aClass3_Sub9_8);
			this.method7019(this.aClass3_Sub9_8, this.aClass3_Sub9_8.method6932());
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
						@Pc(93) Class3_Sub9 local93 = this.aClass3_Sub9Array6[local56];
						label97: while (true) {
							while (true) {
								if (local93 == null) {
									break label97;
								}
								@Pc(97) Class3_Sub42 local97 = local93.aClass3_Sub42_5;
								if (local97 == null || local97.anInt8316 <= local61) {
									local93.aBoolean591 = true;
									@Pc(121) int local121 = local93.method6926();
									local45 += local121;
									if (local97 != null) {
										local97.anInt8316 += local121;
									}
									if (local45 >= this.anInt8476) {
										break label103;
									}
									@Pc(140) Class3_Sub9 local140 = local93.method6929();
									if (local140 != null) {
										@Pc(145) int local145 = local93.anInt8342;
										while (local140 != null) {
											this.method7019(local140, local145 * local140.method6932() >> 8);
											local140 = local93.method6928();
										}
									}
									@Pc(164) Class3_Sub9 local164 = local93.aClass3_Sub9_7;
									local93.aClass3_Sub9_7 = null;
									if (local88 == null) {
										this.aClass3_Sub9Array6[local56] = local164;
									} else {
										local88.aClass3_Sub9_7 = local164;
									}
									if (local164 == null) {
										this.aClass3_Sub9Array5[local56] = local88;
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
				@Pc(207) Class3_Sub9 local207 = this.aClass3_Sub9Array6[local56];
				this.aClass3_Sub9Array6[local56] = this.aClass3_Sub9Array5[local56] = null;
				while (local207 != null) {
					@Pc(221) Class3_Sub9 local221 = local207.aClass3_Sub9_7;
					local207.aClass3_Sub9_7 = null;
					local207 = local221;
				}
			}
		}
		if (this.anInt8487 < 0) {
			this.anInt8487 = 0;
		}
		if (this.aClass3_Sub9_8 != null) {
			this.aClass3_Sub9_8.method6930(arg0, 0, 256);
		}
		this.aLong261 = Static12.method647();
	}

	@OriginalMember(owner = "client!mca", name = "a", descriptor = "()I")
	protected int method7018() throws Exception {
		return this.anInt8491;
	}

	@OriginalMember(owner = "client!mca", name = "a", descriptor = "(Lclient!bk;II)V")
	private void method7019(@OriginalArg(0) Class3_Sub9 arg0, @OriginalArg(1) int arg1) {
		@Pc(14) int local14 = arg1 >> 5;
		@Pc(19) Class3_Sub9 local19 = this.aClass3_Sub9Array5[local14];
		if (local19 == null) {
			this.aClass3_Sub9Array6[local14] = arg0;
		} else {
			local19.aClass3_Sub9_7 = arg0;
		}
		this.aClass3_Sub9Array5[local14] = arg0;
		arg0.anInt8342 = arg1;
	}

	@OriginalMember(owner = "client!mca", name = "b", descriptor = "()V")
	protected void method7020() throws Exception {
	}

	@OriginalMember(owner = "client!mca", name = "a", descriptor = "(Ljava/awt/Component;)V")
	public void method7021(@OriginalArg(0) Component arg0) throws Exception {
	}

	@OriginalMember(owner = "client!mca", name = "c", descriptor = "(I)V")
	public final synchronized void method7022() {
		if (Static463.aClass288_1 != null) {
			@Pc(13) boolean local13 = true;
			for (@Pc(15) int local15 = 0; local15 < 2; local15++) {
				if (Static463.aClass288_1.aClass43Array1[local15] == this) {
					Static463.aClass288_1.aClass43Array1[local15] = null;
				}
				if (Static463.aClass288_1.aClass43Array1[local15] != null) {
					local13 = false;
				}
			}
			if (local13) {
				Static463.aClass288_1.aBoolean636 = true;
				while (Static463.aClass288_1.aBoolean635) {
					Static327.method5231(50L);
				}
				Static463.aClass288_1 = null;
			}
		}
		this.method7026();
		this.aBoolean620 = true;
		this.anIntArray727 = null;
	}

	@OriginalMember(owner = "client!mca", name = "c", descriptor = "()V")
	protected void method7023() throws Exception {
	}

	@OriginalMember(owner = "client!mca", name = "d", descriptor = "(I)V")
	public void method7024(@OriginalArg(0) int arg0) throws Exception {
	}

	@OriginalMember(owner = "client!mca", name = "a", descriptor = "(II)V")
	private void method7025() {
		this.anInt8487 -= 256;
		if (this.anInt8487 < 0) {
			this.anInt8487 = 0;
		}
		if (this.aClass3_Sub9_8 != null) {
			this.aClass3_Sub9_8.method6931(256);
		}
	}

	@OriginalMember(owner = "client!mca", name = "d", descriptor = "()V")
	protected void method7026() {
	}

	@OriginalMember(owner = "client!mca", name = "a", descriptor = "(Lclient!bk;I)V")
	public final synchronized void method7027(@OriginalArg(0) Class3_Sub9 arg0) {
		this.aClass3_Sub9_8 = arg0;
	}
}
