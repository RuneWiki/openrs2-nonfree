import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fe")
public class Class75 {

	@OriginalMember(owner = "client!fe", name = "i", descriptor = "Lclient!ho;")
	private Class4_Sub18 aClass4_Sub18_6;

	@OriginalMember(owner = "client!fe", name = "o", descriptor = "[I")
	public int[] anIntArray615;

	@OriginalMember(owner = "client!fe", name = "A", descriptor = "I")
	public int anInt6943;

	@OriginalMember(owner = "client!fe", name = "B", descriptor = "I")
	private int anInt6944;

	@OriginalMember(owner = "client!fe", name = "D", descriptor = "I")
	public int anInt6946;

	@OriginalMember(owner = "client!fe", name = "l", descriptor = "I")
	private final int anInt6932 = 32;

	@OriginalMember(owner = "client!fe", name = "v", descriptor = "Z")
	private boolean aBoolean465 = false;

	@OriginalMember(owner = "client!fe", name = "b", descriptor = "J")
	private long aLong202 = Static199.method2845();

	@OriginalMember(owner = "client!fe", name = "y", descriptor = "[Lclient!ho;")
	private final Class4_Sub18[] aClass4_Sub18Array5 = new Class4_Sub18[8];

	@OriginalMember(owner = "client!fe", name = "E", descriptor = "J")
	private long aLong203 = 0L;

	@OriginalMember(owner = "client!fe", name = "C", descriptor = "I")
	private int anInt6945 = 0;

	@OriginalMember(owner = "client!fe", name = "G", descriptor = "Z")
	private boolean aBoolean466 = true;

	@OriginalMember(owner = "client!fe", name = "I", descriptor = "J")
	private long aLong204 = 0L;

	@OriginalMember(owner = "client!fe", name = "J", descriptor = "I")
	private int anInt6948 = 0;

	@OriginalMember(owner = "client!fe", name = "H", descriptor = "I")
	private int anInt6947 = 0;

	@OriginalMember(owner = "client!fe", name = "z", descriptor = "I")
	private int anInt6942 = 0;

	@OriginalMember(owner = "client!fe", name = "F", descriptor = "[Lclient!ho;")
	private final Class4_Sub18[] aClass4_Sub18Array6 = new Class4_Sub18[8];

	static {
		new Class242("You cannot send a quick chat message to a player on this world at this time.", "Einem Spieler auf dieser Welt können derzeit keine Direktchat-Nachrichten", "Impossible d'envoyer un message rapide à un joueur de ce serveur à l'heure actuelle.", "Você não pode enviar uma mensagem de papo rápido para um jogador neste mundo neste momento.");
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "()V")
	protected void method5347() throws Exception {
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(I)V")
	public final void method5348() {
		this.aBoolean466 = true;
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(ZI)V")
	private void method5349() {
		this.anInt6945 -= 256;
		if (this.anInt6945 < 0) {
			this.anInt6945 = 0;
		}
		if (this.aClass4_Sub18_6 != null) {
			this.aClass4_Sub18_6.method5749(256);
		}
	}

	@OriginalMember(owner = "client!fe", name = "b", descriptor = "()V")
	protected void method5351() throws Exception {
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(Ljava/awt/Component;)V")
	public void method5352(@OriginalArg(0) Component arg0) throws Exception {
	}

	@OriginalMember(owner = "client!fe", name = "b", descriptor = "(I)V")
	public void method5353(@OriginalArg(0) int arg0) throws Exception {
	}

	@OriginalMember(owner = "client!fe", name = "c", descriptor = "(I)V")
	public final synchronized void method5354() {
		if (this.aBoolean465) {
			return;
		}
		@Pc(12) long local12 = Static199.method2845();
		try {
			if (this.aLong202 + 500000L < local12) {
				this.aLong202 = local12 - 500000L;
			}
			while (local12 > this.aLong202 + 5000L) {
				this.method5349();
				this.aLong202 += 256000 / Static410.anInt6810;
			}
		} catch (@Pc(48) Exception local48) {
			this.aLong202 = local12;
		}
		if (this.anIntArray615 == null) {
			return;
		}
		try {
			if (this.aLong204 != 0L) {
				if (this.aLong204 > local12) {
					return;
				}
				this.method5353(this.anInt6943);
				this.aBoolean466 = true;
				this.aLong204 = 0L;
			}
			@Pc(93) int local93 = this.method5361();
			if (this.anInt6947 - local93 > this.anInt6942) {
				this.anInt6942 = this.anInt6947 - local93;
			}
			@Pc(118) int local118 = this.anInt6946 + this.anInt6944;
			if (local118 + 256 > 16384) {
				local118 = 16128;
			}
			if (local118 + 256 > this.anInt6943) {
				this.anInt6943 += 1024;
				if (this.anInt6943 > 16384) {
					this.anInt6943 = 16384;
				}
				this.method5364();
				this.method5353(this.anInt6943);
				local93 = 0;
				this.aBoolean466 = true;
				if (this.anInt6943 < local118 + 256) {
					local118 = this.anInt6943 - 256;
					this.anInt6944 = local118 - this.anInt6946;
				}
			}
			while (local93 < local118) {
				this.method5355(this.anIntArray615);
				local93 += 256;
				this.method5351();
			}
			if (this.aLong203 < local12) {
				if (this.aBoolean466) {
					this.aBoolean466 = false;
				} else if (this.anInt6942 == 0 && this.anInt6948 == 0) {
					this.method5364();
					this.aLong204 = local12 + 2000L;
					return;
				} else {
					this.anInt6944 = Math.min(this.anInt6948, this.anInt6942);
					this.anInt6948 = this.anInt6942;
				}
				this.aLong203 = local12 + 2000L;
				this.anInt6942 = 0;
			}
			this.anInt6947 = local93;
		} catch (@Pc(255) Exception local255) {
			this.method5364();
			this.aLong204 = local12 + 2000L;
		}
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "([II)V")
	private void method5355(@OriginalArg(0) int[] arg0) {
		@Pc(1) short local1 = 256;
		if (Static394.aBoolean454) {
			local1 = 512;
		}
		Static457.method1213(arg0, 0, local1);
		this.anInt6945 -= 256;
		if (this.aClass4_Sub18_6 != null && this.anInt6945 <= 0) {
			this.anInt6945 += Static410.anInt6810 >> 4;
			Static306.method4227(this.aClass4_Sub18_6);
			this.method5358(this.aClass4_Sub18_6.method5753(), this.aClass4_Sub18_6);
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
						@Pc(88) Class4_Sub18 local88 = null;
						@Pc(93) Class4_Sub18 local93 = this.aClass4_Sub18Array6[local56];
						label97: while (true) {
							while (true) {
								if (local93 == null) {
									break label97;
								}
								@Pc(97) Class4_Sub35 local97 = local93.aClass4_Sub35_5;
								if (local97 == null || local97.anInt6959 <= local61) {
									local93.aBoolean496 = true;
									@Pc(121) int local121 = local93.method5754();
									local45 += local121;
									if (local97 != null) {
										local97.anInt6959 += local121;
									}
									if (local45 >= this.anInt6932) {
										break label103;
									}
									@Pc(140) Class4_Sub18 local140 = local93.method5751();
									if (local140 != null) {
										@Pc(145) int local145 = local93.anInt7466;
										while (local140 != null) {
											this.method5358(local145 * local140.method5753() >> 8, local140);
											local140 = local93.method5752();
										}
									}
									@Pc(164) Class4_Sub18 local164 = local93.aClass4_Sub18_8;
									local93.aClass4_Sub18_8 = null;
									if (local88 == null) {
										this.aClass4_Sub18Array6[local56] = local164;
									} else {
										local88.aClass4_Sub18_8 = local164;
									}
									if (local164 == null) {
										this.aClass4_Sub18Array5[local56] = local88;
									}
									local93 = local164;
								} else {
									local47 |= 0x1 << local56;
									local88 = local93;
									local93 = local93.aClass4_Sub18_8;
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
				@Pc(207) Class4_Sub18 local207 = this.aClass4_Sub18Array6[local56];
				this.aClass4_Sub18Array6[local56] = this.aClass4_Sub18Array5[local56] = null;
				while (local207 != null) {
					@Pc(221) Class4_Sub18 local221 = local207.aClass4_Sub18_8;
					local207.aClass4_Sub18_8 = null;
					local207 = local221;
				}
			}
		}
		if (this.anInt6945 < 0) {
			this.anInt6945 = 0;
		}
		if (this.aClass4_Sub18_6 != null) {
			this.aClass4_Sub18_6.method5755(arg0, 0, 256);
		}
		this.aLong202 = Static199.method2845();
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(Z)V")
	public final synchronized void method5357() {
		if (Static362.aClass230_1 != null) {
			@Pc(9) boolean local9 = true;
			for (@Pc(11) int local11 = 0; local11 < 2; local11++) {
				if (Static362.aClass230_1.aClass75Array1[local11] == this) {
					Static362.aClass230_1.aClass75Array1[local11] = null;
				}
				if (Static362.aClass230_1.aClass75Array1[local11] != null) {
					local9 = false;
				}
			}
			if (local9) {
				Static362.aClass230_1.aBoolean446 = true;
				while (Static362.aClass230_1.aBoolean445) {
					Static20.method1515(50L);
				}
				Static362.aClass230_1 = null;
			}
		}
		this.method5364();
		this.anIntArray615 = null;
		this.aBoolean465 = true;
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(IILclient!ho;)V")
	private void method5358(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub18 arg1) {
		@Pc(15) int local15 = arg0 >> 5;
		@Pc(20) Class4_Sub18 local20 = this.aClass4_Sub18Array5[local15];
		if (local20 == null) {
			this.aClass4_Sub18Array6[local15] = arg1;
		} else {
			local20.aClass4_Sub18_8 = arg1;
		}
		this.aClass4_Sub18Array5[local15] = arg1;
		arg1.anInt7466 = arg0;
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(B)V")
	public final synchronized void method5359() {
		this.aBoolean466 = true;
		try {
			this.method5347();
		} catch (@Pc(17) Exception local17) {
			this.method5364();
			this.aLong204 = Static199.method2845() + 2000L;
		}
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(ILclient!ho;)V")
	public final synchronized void method5360(@OriginalArg(1) Class4_Sub18 arg0) {
		this.aClass4_Sub18_6 = arg0;
	}

	@OriginalMember(owner = "client!fe", name = "c", descriptor = "()I")
	protected int method5361() throws Exception {
		return this.anInt6943;
	}

	@OriginalMember(owner = "client!fe", name = "d", descriptor = "()V")
	protected void method5364() {
	}
}
