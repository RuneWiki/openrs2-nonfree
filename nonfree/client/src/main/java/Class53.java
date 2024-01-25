import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vl")
public class Class53 {

	@OriginalMember(owner = "client!vl", name = "b", descriptor = "Lclient!hu;")
	private Class4_Sub14 aClass4_Sub14_8;

	@OriginalMember(owner = "client!vl", name = "d", descriptor = "[I")
	public int[] anIntArray528;

	@OriginalMember(owner = "client!vl", name = "C", descriptor = "I")
	private int anInt7012;

	@OriginalMember(owner = "client!vl", name = "I", descriptor = "I")
	public int anInt7013;

	@OriginalMember(owner = "client!vl", name = "L", descriptor = "I")
	public int anInt7016;

	@OriginalMember(owner = "client!vl", name = "i", descriptor = "I")
	private final int anInt6997 = 32;

	@OriginalMember(owner = "client!vl", name = "l", descriptor = "Z")
	private boolean aBoolean495 = false;

	@OriginalMember(owner = "client!vl", name = "k", descriptor = "J")
	private long aLong209 = Static266.method3498();

	@OriginalMember(owner = "client!vl", name = "D", descriptor = "[Lclient!hu;")
	private final Class4_Sub14[] aClass4_Sub14Array5 = new Class4_Sub14[8];

	@OriginalMember(owner = "client!vl", name = "B", descriptor = "I")
	private int anInt7011 = 0;

	@OriginalMember(owner = "client!vl", name = "E", descriptor = "J")
	private long aLong211 = 0L;

	@OriginalMember(owner = "client!vl", name = "F", descriptor = "Z")
	private boolean aBoolean496 = true;

	@OriginalMember(owner = "client!vl", name = "z", descriptor = "I")
	private int anInt7010 = 0;

	@OriginalMember(owner = "client!vl", name = "A", descriptor = "J")
	private long aLong210 = 0L;

	@OriginalMember(owner = "client!vl", name = "K", descriptor = "I")
	private int anInt7015 = 0;

	@OriginalMember(owner = "client!vl", name = "J", descriptor = "I")
	private int anInt7014 = 0;

	@OriginalMember(owner = "client!vl", name = "H", descriptor = "[Lclient!hu;")
	private final Class4_Sub14[] aClass4_Sub14Array6 = new Class4_Sub14[8];

	static {
		new Class15("To go here you must login to a members' server.", "Du musst auf einer Mitglieder-Welt sein, um dort hinzukommen.", "Vous devez vous connecter à un serveur d'abonnés pour aller à cet endroit.", "Para entrar aqui, acesse um servidor para membros.");
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(B)V")
	public final synchronized void method5620() {
		if (this.aBoolean495) {
			return;
		}
		@Pc(12) long local12 = Static266.method3498();
		try {
			if (local12 > this.aLong209 + 500000L) {
				this.aLong209 = local12 - 500000L;
			}
			while (local12 > this.aLong209 + 5000L) {
				this.method5623();
				this.aLong209 += 256000 / Static145.anInt2577;
			}
		} catch (@Pc(56) Exception local56) {
			this.aLong209 = local12;
		}
		if (this.anIntArray528 == null) {
			return;
		}
		try {
			if (this.aLong210 != 0L) {
				if (local12 < this.aLong210) {
					return;
				}
				this.method5624(this.anInt7013);
				this.aBoolean496 = true;
				this.aLong210 = 0L;
			}
			@Pc(87) int local87 = this.method5629();
			if (this.anInt7015 - local87 > this.anInt7011) {
				this.anInt7011 = this.anInt7015 - local87;
			}
			@Pc(110) int local110 = this.anInt7012 + this.anInt7016;
			if (local110 + 256 > 16384) {
				local110 = 16128;
			}
			if (local110 + 256 > this.anInt7013) {
				this.anInt7013 += 1024;
				if (this.anInt7013 > 16384) {
					this.anInt7013 = 16384;
				}
				this.method5627();
				local87 = 0;
				this.method5624(this.anInt7013);
				if (this.anInt7013 < local110 + 256) {
					local110 = this.anInt7013 - 256;
					this.anInt7012 = local110 - this.anInt7016;
				}
				this.aBoolean496 = true;
			}
			while (local110 > local87) {
				this.method5633(this.anIntArray528);
				local87 += 256;
				this.method5631();
			}
			if (this.aLong211 < local12) {
				if (this.aBoolean496) {
					this.aBoolean496 = false;
				} else if (this.anInt7011 == 0 && this.anInt7010 == 0) {
					this.method5627();
					this.aLong210 = local12 + 2000L;
					return;
				} else {
					this.anInt7012 = Math.min(this.anInt7010, this.anInt7011);
					this.anInt7010 = this.anInt7011;
				}
				this.anInt7011 = 0;
				this.aLong211 = local12 + 2000L;
			}
			this.anInt7015 = local87;
		} catch (@Pc(241) Exception local241) {
			this.method5627();
			this.aLong210 = local12 + 2000L;
		}
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(Lclient!hu;I)V")
	public final synchronized void method5621(@OriginalArg(0) Class4_Sub14 arg0) {
		this.aClass4_Sub14_8 = arg0;
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(II)V")
	private void method5623() {
		this.anInt7014 -= 256;
		if (this.anInt7014 < 0) {
			this.anInt7014 = 0;
		}
		if (this.aClass4_Sub14_8 != null) {
			this.aClass4_Sub14_8.method4783(256);
		}
	}

	@OriginalMember(owner = "client!vl", name = "b", descriptor = "(I)V")
	public void method5624(@OriginalArg(0) int arg0) throws Exception {
	}

	@OriginalMember(owner = "client!vl", name = "c", descriptor = "(I)V")
	public final void method5625() {
		this.aBoolean496 = true;
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "()V")
	protected void method5626() throws Exception {
	}

	@OriginalMember(owner = "client!vl", name = "b", descriptor = "()V")
	protected void method5627() {
	}

	@OriginalMember(owner = "client!vl", name = "d", descriptor = "(I)V")
	public final synchronized void method5628() {
		if (Static142.aClass249_1 != null) {
			@Pc(13) boolean local13 = true;
			for (@Pc(15) int local15 = 0; local15 < 2; local15++) {
				if (Static142.aClass249_1.aClass53Array1[local15] == this) {
					Static142.aClass249_1.aClass53Array1[local15] = null;
				}
				if (Static142.aClass249_1.aClass53Array1[local15] != null) {
					local13 = false;
				}
			}
			if (local13) {
				Static142.aClass249_1.aBoolean494 = true;
				while (Static142.aClass249_1.aBoolean493) {
					Static435.method5777(50L);
				}
				Static142.aClass249_1 = null;
			}
		}
		this.method5627();
		this.aBoolean495 = true;
		this.anIntArray528 = null;
	}

	@OriginalMember(owner = "client!vl", name = "c", descriptor = "()I")
	protected int method5629() throws Exception {
		return this.anInt7013;
	}

	@OriginalMember(owner = "client!vl", name = "d", descriptor = "()V")
	protected void method5631() throws Exception {
	}

	@OriginalMember(owner = "client!vl", name = "e", descriptor = "(I)V")
	public final synchronized void method5632() {
		this.aBoolean496 = true;
		try {
			this.method5626();
		} catch (@Pc(15) Exception local15) {
			this.method5627();
			this.aLong210 = Static266.method3498() + 2000L;
		}
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "([II)V")
	private void method5633(@OriginalArg(0) int[] arg0) {
		@Pc(1) short local1 = 256;
		if (Static391.aBoolean443) {
			local1 = 512;
		}
		Static461.method1983(arg0, 0, local1);
		this.anInt7014 -= 256;
		if (this.aClass4_Sub14_8 != null && this.anInt7014 <= 0) {
			this.anInt7014 += Static145.anInt2577 >> 4;
			Static118.method1695(this.aClass4_Sub14_8);
			this.method5634(this.aClass4_Sub14_8, this.aClass4_Sub14_8.method4785());
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
						@Pc(88) Class4_Sub14 local88 = null;
						@Pc(93) Class4_Sub14 local93 = this.aClass4_Sub14Array6[local56];
						label97: while (true) {
							while (true) {
								if (local93 == null) {
									break label97;
								}
								@Pc(97) Class4_Sub15 local97 = local93.aClass4_Sub15_5;
								if (local97 == null || local97.anInt3295 <= local61) {
									local93.aBoolean422 = true;
									@Pc(121) int local121 = local93.method4786();
									local45 += local121;
									if (local97 != null) {
										local97.anInt3295 += local121;
									}
									if (local45 >= this.anInt6997) {
										break label103;
									}
									@Pc(140) Class4_Sub14 local140 = local93.method4784();
									if (local140 != null) {
										@Pc(145) int local145 = local93.anInt5995;
										while (local140 != null) {
											this.method5634(local140, local145 * local140.method4785() >> 8);
											local140 = local93.method4787();
										}
									}
									@Pc(164) Class4_Sub14 local164 = local93.aClass4_Sub14_7;
									local93.aClass4_Sub14_7 = null;
									if (local88 == null) {
										this.aClass4_Sub14Array6[local56] = local164;
									} else {
										local88.aClass4_Sub14_7 = local164;
									}
									if (local164 == null) {
										this.aClass4_Sub14Array5[local56] = local88;
									}
									local93 = local164;
								} else {
									local47 |= 0x1 << local56;
									local88 = local93;
									local93 = local93.aClass4_Sub14_7;
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
				@Pc(207) Class4_Sub14 local207 = this.aClass4_Sub14Array6[local56];
				this.aClass4_Sub14Array6[local56] = this.aClass4_Sub14Array5[local56] = null;
				while (local207 != null) {
					@Pc(221) Class4_Sub14 local221 = local207.aClass4_Sub14_7;
					local207.aClass4_Sub14_7 = null;
					local207 = local221;
				}
			}
		}
		if (this.anInt7014 < 0) {
			this.anInt7014 = 0;
		}
		if (this.aClass4_Sub14_8 != null) {
			this.aClass4_Sub14_8.method4788(arg0, 0, 256);
		}
		this.aLong209 = Static266.method3498();
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(Lclient!hu;II)V")
	private void method5634(@OriginalArg(0) Class4_Sub14 arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = arg1 >> 5;
		@Pc(12) Class4_Sub14 local12 = this.aClass4_Sub14Array5[local7];
		if (local12 == null) {
			this.aClass4_Sub14Array6[local7] = arg0;
		} else {
			local12.aClass4_Sub14_7 = arg0;
		}
		this.aClass4_Sub14Array5[local7] = arg0;
		arg0.anInt5995 = arg1;
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(Ljava/awt/Component;)V")
	public void method5635(@OriginalArg(0) Component arg0) throws Exception {
	}
}
