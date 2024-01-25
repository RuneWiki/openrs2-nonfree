import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ir")
public class Class78 {

	@OriginalMember(owner = "client!ir", name = "B", descriptor = "[B")
	public static final byte[] aByteArray96;

	@OriginalMember(owner = "client!ir", name = "e", descriptor = "[I")
	public int[] anIntArray535;

	@OriginalMember(owner = "client!ir", name = "n", descriptor = "Lclient!er;")
	private Class11_Sub10 aClass11_Sub10_8;

	@OriginalMember(owner = "client!ir", name = "x", descriptor = "I")
	public int anInt6470;

	@OriginalMember(owner = "client!ir", name = "H", descriptor = "I")
	private int anInt6474;

	@OriginalMember(owner = "client!ir", name = "I", descriptor = "I")
	public int anInt6475;

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "Z")
	private boolean aBoolean417 = false;

	@OriginalMember(owner = "client!ir", name = "t", descriptor = "I")
	private final int anInt6467 = 32;

	@OriginalMember(owner = "client!ir", name = "f", descriptor = "J")
	private long aLong202 = Static268.method4627();

	@OriginalMember(owner = "client!ir", name = "z", descriptor = "I")
	private int anInt6472 = 0;

	@OriginalMember(owner = "client!ir", name = "A", descriptor = "J")
	private long aLong203 = 0L;

	@OriginalMember(owner = "client!ir", name = "G", descriptor = "[Lclient!er;")
	private final Class11_Sub10[] aClass11_Sub10Array6 = new Class11_Sub10[8];

	@OriginalMember(owner = "client!ir", name = "E", descriptor = "Z")
	private boolean aBoolean418 = true;

	@OriginalMember(owner = "client!ir", name = "F", descriptor = "[Lclient!er;")
	private final Class11_Sub10[] aClass11_Sub10Array5 = new Class11_Sub10[8];

	@OriginalMember(owner = "client!ir", name = "y", descriptor = "I")
	private int anInt6471 = 0;

	@OriginalMember(owner = "client!ir", name = "D", descriptor = "J")
	private long aLong204 = 0L;

	@OriginalMember(owner = "client!ir", name = "L", descriptor = "I")
	private int anInt6478 = 0;

	@OriginalMember(owner = "client!ir", name = "K", descriptor = "I")
	private int anInt6477 = 0;

	static {
		new Class117("Please close the interface you have open before using 'Report Abuse'.", "Bitte schließ die momentan geöffnete Benutzeroberfläche,", "Fermez l'interface que vous avez ouverte avant d'utiliser le bouton « Signaler un abus ».", "Feche a interface aberta antes de usar o recurso \"Denunciar abuso\".");
		@Pc(14) int local14 = 0;
		aByteArray96 = new byte[32896];
		for (@Pc(19) int local19 = 0; local19 < 256; local19++) {
			for (@Pc(22) int local22 = 0; local22 <= local19; local22++) {
				aByteArray96[local14++] = (byte) (255.0D / Math.sqrt((double) ((float) (local19 * local19 + local22 * local22 + 65535) / 65535.0F)));
			}
		}
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "()V")
	protected void method5503() throws Exception {
	}

	@OriginalMember(owner = "client!ir", name = "b", descriptor = "()V")
	protected void method5504() throws Exception {
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(B)V")
	public final synchronized void method5505() {
		if (Static20.aClass107_1 != null) {
			@Pc(5) boolean local5 = true;
			for (@Pc(7) int local7 = 0; local7 < 2; local7++) {
				if (Static20.aClass107_1.aClass78Array1[local7] == this) {
					Static20.aClass107_1.aClass78Array1[local7] = null;
				}
				if (Static20.aClass107_1.aClass78Array1[local7] != null) {
					local5 = false;
				}
			}
			if (local5) {
				Static20.aClass107_1.aBoolean176 = true;
				while (Static20.aClass107_1.aBoolean177) {
					Static244.method4311(50L);
				}
				Static20.aClass107_1 = null;
			}
		}
		this.method5515();
		this.aBoolean417 = true;
		this.anIntArray535 = null;
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(BLclient!er;)V")
	public final synchronized void method5507(@OriginalArg(1) Class11_Sub10 arg0) {
		this.aClass11_Sub10_8 = arg0;
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(Ljava/awt/Component;)V")
	public void method5508(@OriginalArg(0) Component arg0) throws Exception {
	}

	@OriginalMember(owner = "client!ir", name = "b", descriptor = "(I)V")
	public final synchronized void method5509() {
		this.aBoolean418 = true;
		try {
			this.method5503();
		} catch (@Pc(15) Exception local15) {
			this.method5515();
			this.aLong204 = Static268.method4627() + 2000L;
		}
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(Lclient!er;IB)V")
	private void method5510(@OriginalArg(0) Class11_Sub10 arg0, @OriginalArg(1) int arg1) {
		@Pc(15) int local15 = arg1 >> 5;
		@Pc(20) Class11_Sub10 local20 = this.aClass11_Sub10Array6[local15];
		if (local20 == null) {
			this.aClass11_Sub10Array5[local15] = arg0;
		} else {
			local20.aClass11_Sub10_7 = arg0;
		}
		this.aClass11_Sub10Array6[local15] = arg0;
		arg0.anInt4590 = arg1;
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(II)V")
	private void method5511() {
		this.anInt6477 -= 256;
		if (this.anInt6477 < 0) {
			this.anInt6477 = 0;
		}
		if (this.aClass11_Sub10_8 != null) {
			this.aClass11_Sub10_8.method4060(256);
		}
	}

	@OriginalMember(owner = "client!ir", name = "c", descriptor = "()I")
	protected int method5512() throws Exception {
		return this.anInt6470;
	}

	@OriginalMember(owner = "client!ir", name = "b", descriptor = "(B)V")
	public final synchronized void method5513() {
		if (this.aBoolean417) {
			return;
		}
		@Pc(20) long local20 = Static268.method4627();
		try {
			if (this.aLong202 + 500000L < local20) {
				this.aLong202 = local20 - 500000L;
			}
			while (local20 > this.aLong202 + 5000L) {
				this.method5511();
				this.aLong202 += 256000 / Static352.anInt6698;
			}
		} catch (@Pc(60) Exception local60) {
			this.aLong202 = local20;
		}
		if (this.anIntArray535 == null) {
			return;
		}
		try {
			if (this.aLong204 != 0L) {
				if (this.aLong204 > local20) {
					return;
				}
				this.method5517(this.anInt6470);
				this.aLong204 = 0L;
				this.aBoolean418 = true;
			}
			@Pc(97) int local97 = this.method5512();
			if (this.anInt6471 - local97 > this.anInt6472) {
				this.anInt6472 = this.anInt6471 - local97;
			}
			@Pc(116) int local116 = this.anInt6475 + this.anInt6474;
			if (local116 + 256 > 16384) {
				local116 = 16128;
			}
			if (local116 + 256 > this.anInt6470) {
				this.anInt6470 += 1024;
				if (this.anInt6470 > 16384) {
					this.anInt6470 = 16384;
				}
				this.method5515();
				local97 = 0;
				this.method5517(this.anInt6470);
				if (this.anInt6470 < local116 + 256) {
					local116 = this.anInt6470 - 256;
					this.anInt6474 = local116 - this.anInt6475;
				}
				this.aBoolean418 = true;
			}
			while (local116 > local97) {
				this.method5518(this.anIntArray535);
				this.method5504();
				local97 += 256;
			}
			if (this.aLong203 < local20) {
				if (this.aBoolean418) {
					this.aBoolean418 = false;
				} else if (this.anInt6472 == 0 && this.anInt6478 == 0) {
					this.method5515();
					this.aLong204 = local20 + 2000L;
					return;
				} else {
					this.anInt6474 = Math.min(this.anInt6478, this.anInt6472);
					this.anInt6478 = this.anInt6472;
				}
				this.aLong203 = local20 + 2000L;
				this.anInt6472 = 0;
			}
			this.anInt6471 = local97;
		} catch (@Pc(248) Exception local248) {
			this.method5515();
			this.aLong204 = local20 + 2000L;
		}
	}

	@OriginalMember(owner = "client!ir", name = "d", descriptor = "()V")
	protected void method5515() {
	}

	@OriginalMember(owner = "client!ir", name = "c", descriptor = "(I)V")
	public void method5517(@OriginalArg(0) int arg0) throws Exception {
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "([II)V")
	private void method5518(@OriginalArg(0) int[] arg0) {
		@Pc(1) short local1 = 256;
		if (Static178.aBoolean224) {
			local1 = 512;
		}
		Static363.method1673(arg0, 0, local1);
		this.anInt6477 -= 256;
		if (this.aClass11_Sub10_8 != null && this.anInt6477 <= 0) {
			this.anInt6477 += Static352.anInt6698 >> 4;
			Static48.method704(this.aClass11_Sub10_8);
			this.method5510(this.aClass11_Sub10_8, this.aClass11_Sub10_8.method4054());
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
						@Pc(88) Class11_Sub10 local88 = null;
						@Pc(93) Class11_Sub10 local93 = this.aClass11_Sub10Array5[local56];
						label97: while (true) {
							while (true) {
								if (local93 == null) {
									break label97;
								}
								@Pc(97) Class11_Sub15 local97 = local93.aClass11_Sub15_5;
								if (local97 == null || local97.anInt6416 <= local61) {
									local93.aBoolean308 = true;
									@Pc(121) int local121 = local93.method4056();
									local45 += local121;
									if (local97 != null) {
										local97.anInt6416 += local121;
									}
									if (local45 >= this.anInt6467) {
										break label103;
									}
									@Pc(140) Class11_Sub10 local140 = local93.method4059();
									if (local140 != null) {
										@Pc(145) int local145 = local93.anInt4590;
										while (local140 != null) {
											this.method5510(local140, local145 * local140.method4054() >> 8);
											local140 = local93.method4058();
										}
									}
									@Pc(164) Class11_Sub10 local164 = local93.aClass11_Sub10_7;
									local93.aClass11_Sub10_7 = null;
									if (local88 == null) {
										this.aClass11_Sub10Array5[local56] = local164;
									} else {
										local88.aClass11_Sub10_7 = local164;
									}
									if (local164 == null) {
										this.aClass11_Sub10Array6[local56] = local88;
									}
									local93 = local164;
								} else {
									local47 |= 0x1 << local56;
									local88 = local93;
									local93 = local93.aClass11_Sub10_7;
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
				@Pc(207) Class11_Sub10 local207 = this.aClass11_Sub10Array5[local56];
				this.aClass11_Sub10Array5[local56] = this.aClass11_Sub10Array6[local56] = null;
				while (local207 != null) {
					@Pc(221) Class11_Sub10 local221 = local207.aClass11_Sub10_7;
					local207.aClass11_Sub10_7 = null;
					local207 = local221;
				}
			}
		}
		if (this.anInt6477 < 0) {
			this.anInt6477 = 0;
		}
		if (this.aClass11_Sub10_8 != null) {
			this.aClass11_Sub10_8.method4057(arg0, 0, 256);
		}
		this.aLong202 = Static268.method4627();
	}

	@OriginalMember(owner = "client!ir", name = "d", descriptor = "(I)V")
	public final void method5519() {
		this.aBoolean418 = true;
	}
}
