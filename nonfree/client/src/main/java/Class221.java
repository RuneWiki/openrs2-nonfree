import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tg")
public class Class221 {

	@OriginalMember(owner = "client!tg", name = "m", descriptor = "Lclient!hu;")
	public static final Class98 aClass98_65 = new Class98(20);

	@OriginalMember(owner = "client!tg", name = "I", descriptor = "Lclient!s;")
	public static final Class210 aClass210_16 = new Class210(10, 6);

	@OriginalMember(owner = "client!tg", name = "g", descriptor = "[I")
	public int[] anIntArray485;

	@OriginalMember(owner = "client!tg", name = "t", descriptor = "Lclient!ll;")
	private Class2_Sub12 aClass2_Sub12_8;

	@OriginalMember(owner = "client!tg", name = "v", descriptor = "I")
	public int anInt7083;

	@OriginalMember(owner = "client!tg", name = "y", descriptor = "I")
	private int anInt7085;

	@OriginalMember(owner = "client!tg", name = "B", descriptor = "I")
	public int anInt7086;

	@OriginalMember(owner = "client!tg", name = "b", descriptor = "I")
	private final int anInt7068 = 32;

	@OriginalMember(owner = "client!tg", name = "s", descriptor = "Z")
	private boolean aBoolean480 = false;

	@OriginalMember(owner = "client!tg", name = "j", descriptor = "J")
	private long aLong224 = Static190.method3686();

	@OriginalMember(owner = "client!tg", name = "A", descriptor = "Z")
	private boolean aBoolean481 = true;

	@OriginalMember(owner = "client!tg", name = "z", descriptor = "J")
	private long aLong225 = 0L;

	@OriginalMember(owner = "client!tg", name = "C", descriptor = "J")
	private long aLong226 = 0L;

	@OriginalMember(owner = "client!tg", name = "w", descriptor = "I")
	private int anInt7084 = 0;

	@OriginalMember(owner = "client!tg", name = "D", descriptor = "I")
	private int anInt7087 = 0;

	@OriginalMember(owner = "client!tg", name = "E", descriptor = "[Lclient!ll;")
	private final Class2_Sub12[] aClass2_Sub12Array6 = new Class2_Sub12[8];

	@OriginalMember(owner = "client!tg", name = "x", descriptor = "[Lclient!ll;")
	private final Class2_Sub12[] aClass2_Sub12Array5 = new Class2_Sub12[8];

	@OriginalMember(owner = "client!tg", name = "H", descriptor = "I")
	private int anInt7089 = 0;

	@OriginalMember(owner = "client!tg", name = "G", descriptor = "I")
	private int anInt7088 = 0;

	static {
		new Class79("You do not have permission to kick users in this channel.", "Du darfst keine Benutzer aus diesem Chatraum rauswerfen.", "Vous n'êtes pas autorisé à expulser des utilisateurs de ce canal.", "Você não tem permissão para expulsar usuários neste canal.");
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(I)V", line = 3)
	public final synchronized void method6317() {
		if (this.aBoolean480) {
			return;
		}
		@Pc(12) long local12 = Static190.method3686();
		try {
			if (local12 > this.aLong224 + 500000L) {
				this.aLong224 = local12 - 500000L;
			}
			while (this.aLong224 + 5000L < local12) {
				this.method6329();
				this.aLong224 += 256000 / Static331.anInt6630;
			}
		} catch (@Pc(52) Exception local52) {
			this.aLong224 = local12;
		}
		if (this.anIntArray485 == null) {
			return;
		}
		try {
			if (this.aLong225 != 0L) {
				if (local12 < this.aLong225) {
					return;
				}
				this.method6333(this.anInt7086);
				this.aLong225 = 0L;
				this.aBoolean481 = true;
			}
			@Pc(83) int local83 = this.method6322();
			if (this.anInt7089 - local83 > this.anInt7084) {
				this.anInt7084 = this.anInt7089 - local83;
			}
			@Pc(103) int local103 = this.anInt7085 + this.anInt7083;
			if (local103 + 256 > 16384) {
				local103 = 16128;
			}
			if (this.anInt7086 < local103 + 256) {
				this.anInt7086 += 1024;
				if (this.anInt7086 > 16384) {
					this.anInt7086 = 16384;
				}
				this.method6325();
				local83 = 0;
				this.method6333(this.anInt7086);
				if (this.anInt7086 < local103 + 256) {
					local103 = this.anInt7086 - 256;
					this.anInt7085 = local103 - this.anInt7083;
				}
				this.aBoolean481 = true;
			}
			while (local103 > local83) {
				this.method6324(this.anIntArray485);
				this.method6330();
				local83 += 256;
			}
			if (local12 > this.aLong226) {
				if (this.aBoolean481) {
					this.aBoolean481 = false;
				} else if (this.anInt7084 == 0 && this.anInt7087 == 0) {
					this.method6325();
					this.aLong225 = local12 + 2000L;
					return;
				} else {
					this.anInt7085 = Math.min(this.anInt7087, this.anInt7084);
					this.anInt7087 = this.anInt7084;
				}
				this.anInt7084 = 0;
				this.aLong226 = local12 + 2000L;
			}
			this.anInt7089 = local83;
		} catch (@Pc(227) Exception local227) {
			this.method6325();
			this.aLong225 = local12 + 2000L;
		}
	}

	@OriginalMember(owner = "client!tg", name = "b", descriptor = "(I)V", line = 122)
	public final synchronized void method6318() {
		this.aBoolean481 = true;
		try {
			this.method6323();
		} catch (@Pc(16) Exception local16) {
			this.method6325();
			this.aLong225 = Static190.method3686() + 2000L;
		}
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(Lclient!ll;BI)V", line = 166)
	private void method6321(@OriginalArg(0) Class2_Sub12 arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = arg1 >> 5;
		@Pc(12) Class2_Sub12 local12 = this.aClass2_Sub12Array5[local7];
		if (local12 == null) {
			this.aClass2_Sub12Array6[local7] = arg0;
		} else {
			local12.aClass2_Sub12_5 = arg0;
		}
		this.aClass2_Sub12Array5[local7] = arg0;
		arg0.anInt5464 = arg1;
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "()I", line = 189)
	protected int method6322() throws Exception {
		return this.anInt7086;
	}

	@OriginalMember(owner = "client!tg", name = "b", descriptor = "()V", line = 197)
	protected void method6323() throws Exception {
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "([II)V", line = 206)
	private void method6324(@OriginalArg(0) int[] arg0) {
		@Pc(1) short local1 = 256;
		if (Static329.aBoolean93) {
			local1 = 512;
		}
		Static390.method4609(arg0, 0, local1);
		this.anInt7088 -= 256;
		if (this.aClass2_Sub12_8 != null && this.anInt7088 <= 0) {
			this.anInt7088 += Static331.anInt6630 >> 4;
			Static52.method1615(this.aClass2_Sub12_8);
			this.method6321(this.aClass2_Sub12_8, this.aClass2_Sub12_8.method4977());
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
						@Pc(88) Class2_Sub12 local88 = null;
						@Pc(93) Class2_Sub12 local93 = this.aClass2_Sub12Array6[local56];
						label97: while (true) {
							while (true) {
								if (local93 == null) {
									break label97;
								}
								@Pc(97) Class2_Sub21 local97 = local93.aClass2_Sub21_5;
								if (local97 == null || local97.anInt3171 <= local61) {
									local93.aBoolean389 = true;
									@Pc(121) int local121 = local93.method4978();
									local45 += local121;
									if (local97 != null) {
										local97.anInt3171 += local121;
									}
									if (local45 >= this.anInt7068) {
										break label103;
									}
									@Pc(140) Class2_Sub12 local140 = local93.method4979();
									if (local140 != null) {
										@Pc(145) int local145 = local93.anInt5464;
										while (local140 != null) {
											this.method6321(local140, local145 * local140.method4977() >> 8);
											local140 = local93.method4973();
										}
									}
									@Pc(164) Class2_Sub12 local164 = local93.aClass2_Sub12_5;
									local93.aClass2_Sub12_5 = null;
									if (local88 == null) {
										this.aClass2_Sub12Array6[local56] = local164;
									} else {
										local88.aClass2_Sub12_5 = local164;
									}
									if (local164 == null) {
										this.aClass2_Sub12Array5[local56] = local88;
									}
									local93 = local164;
								} else {
									local47 |= 0x1 << local56;
									local88 = local93;
									local93 = local93.aClass2_Sub12_5;
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
				@Pc(207) Class2_Sub12 local207 = this.aClass2_Sub12Array6[local56];
				this.aClass2_Sub12Array6[local56] = this.aClass2_Sub12Array5[local56] = null;
				while (local207 != null) {
					@Pc(221) Class2_Sub12 local221 = local207.aClass2_Sub12_5;
					local207.aClass2_Sub12_5 = null;
					local207 = local221;
				}
			}
		}
		if (this.anInt7088 < 0) {
			this.anInt7088 = 0;
		}
		if (this.aClass2_Sub12_8 != null) {
			this.aClass2_Sub12_8.method4974(arg0, 0, 256);
		}
		this.aLong224 = Static190.method3686();
	}

	@OriginalMember(owner = "client!tg", name = "c", descriptor = "()V", line = 366)
	protected void method6325() {
	}

	@OriginalMember(owner = "client!tg", name = "d", descriptor = "(I)V", line = 373)
	public final void method6326() {
		this.aBoolean481 = true;
	}

	@OriginalMember(owner = "client!tg", name = "e", descriptor = "(I)V", line = 390)
	public final synchronized void method6327() {
		if (Static63.aClass129_1 != null) {
			@Pc(9) boolean local9 = true;
			for (@Pc(11) int local11 = 0; local11 < 2; local11++) {
				if (Static63.aClass129_1.aClass221Array1[local11] == this) {
					Static63.aClass129_1.aClass221Array1[local11] = null;
				}
				if (Static63.aClass129_1.aClass221Array1[local11] != null) {
					local9 = false;
				}
			}
			if (local9) {
				Static63.aClass129_1.aBoolean227 = true;
				while (Static63.aClass129_1.aBoolean226) {
					Static214.method4024(50L);
				}
				Static63.aClass129_1 = null;
			}
		}
		this.method6325();
		this.aBoolean480 = true;
		this.anIntArray485 = null;
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 434)
	public void method6328(@OriginalArg(0) Component arg0) throws Exception {
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(BI)V", line = 447)
	private void method6329() {
		this.anInt7088 -= 256;
		if (this.anInt7088 < 0) {
			this.anInt7088 = 0;
		}
		if (this.aClass2_Sub12_8 != null) {
			this.aClass2_Sub12_8.method4975(256);
		}
	}

	@OriginalMember(owner = "client!tg", name = "d", descriptor = "()V", line = 465)
	protected void method6330() throws Exception {
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(ILclient!ll;)V", line = 473)
	public final synchronized void method6331(@OriginalArg(1) Class2_Sub12 arg0) {
		this.aClass2_Sub12_8 = arg0;
	}

	@OriginalMember(owner = "client!tg", name = "g", descriptor = "(I)V", line = 512)
	public void method6333(@OriginalArg(0) int arg0) throws Exception {
	}
}
