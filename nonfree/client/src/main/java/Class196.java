import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wf")
public class Class196 {

	@OriginalMember(owner = "client!wf", name = "s", descriptor = "[I")
	public int[] anIntArray541;

	@OriginalMember(owner = "client!wf", name = "t", descriptor = "Lclient!cd;")
	private Class6_Sub10 aClass6_Sub10_8;

	@OriginalMember(owner = "client!wf", name = "B", descriptor = "I")
	public int anInt7686;

	@OriginalMember(owner = "client!wf", name = "C", descriptor = "I")
	public int anInt7687;

	@OriginalMember(owner = "client!wf", name = "J", descriptor = "I")
	private int anInt7690;

	@OriginalMember(owner = "client!wf", name = "d", descriptor = "I")
	private final int anInt7669 = 32;

	@OriginalMember(owner = "client!wf", name = "l", descriptor = "Z")
	private boolean aBoolean565 = false;

	@OriginalMember(owner = "client!wf", name = "b", descriptor = "J")
	private long aLong174 = Static174.method3502();

	@OriginalMember(owner = "client!wf", name = "y", descriptor = "I")
	private int anInt7684 = 0;

	@OriginalMember(owner = "client!wf", name = "w", descriptor = "[Lclient!cd;")
	private final Class6_Sub10[] aClass6_Sub10Array5 = new Class6_Sub10[8];

	@OriginalMember(owner = "client!wf", name = "A", descriptor = "J")
	private long aLong176 = 0L;

	@OriginalMember(owner = "client!wf", name = "F", descriptor = "[Lclient!cd;")
	private final Class6_Sub10[] aClass6_Sub10Array6 = new Class6_Sub10[8];

	@OriginalMember(owner = "client!wf", name = "G", descriptor = "I")
	private int anInt7689 = 0;

	@OriginalMember(owner = "client!wf", name = "E", descriptor = "I")
	private int anInt7688 = 0;

	@OriginalMember(owner = "client!wf", name = "z", descriptor = "I")
	private int anInt7685 = 0;

	@OriginalMember(owner = "client!wf", name = "H", descriptor = "Z")
	private boolean aBoolean566 = true;

	@OriginalMember(owner = "client!wf", name = "x", descriptor = "J")
	private long aLong175 = 0L;

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "([II)V")
	private void method6402(@OriginalArg(0) int[] arg0) {
		@Pc(1) short local1 = 256;
		if (Static83.aBoolean193) {
			local1 = 512;
		}
		Static589.method5384(arg0, 0, local1);
		this.anInt7689 -= 256;
		if (this.aClass6_Sub10_8 != null && this.anInt7689 <= 0) {
			this.anInt7689 += Static77.anInt1912 >> 4;
			Static179.method3540(this.aClass6_Sub10_8);
			this.method6408(this.aClass6_Sub10_8.method5654(), this.aClass6_Sub10_8);
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
						@Pc(88) Class6_Sub10 local88 = null;
						@Pc(93) Class6_Sub10 local93 = this.aClass6_Sub10Array5[local56];
						label97: while (true) {
							while (true) {
								if (local93 == null) {
									break label97;
								}
								@Pc(97) Class6_Sub12 local97 = local93.aClass6_Sub12_5;
								if (local97 == null || local97.anInt9541 <= local61) {
									local93.aBoolean505 = true;
									@Pc(121) int local121 = local93.method5652();
									local45 += local121;
									if (local97 != null) {
										local97.anInt9541 += local121;
									}
									if (local45 >= this.anInt7669) {
										break label103;
									}
									@Pc(140) Class6_Sub10 local140 = local93.method5656();
									if (local140 != null) {
										@Pc(145) int local145 = local93.anInt6706;
										while (local140 != null) {
											this.method6408(local145 * local140.method5654() >> 8, local140);
											local140 = local93.method5655();
										}
									}
									@Pc(164) Class6_Sub10 local164 = local93.aClass6_Sub10_7;
									local93.aClass6_Sub10_7 = null;
									if (local88 == null) {
										this.aClass6_Sub10Array5[local56] = local164;
									} else {
										local88.aClass6_Sub10_7 = local164;
									}
									if (local164 == null) {
										this.aClass6_Sub10Array6[local56] = local88;
									}
									local93 = local164;
								} else {
									local47 |= 0x1 << local56;
									local88 = local93;
									local93 = local93.aClass6_Sub10_7;
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
				@Pc(207) Class6_Sub10 local207 = this.aClass6_Sub10Array5[local56];
				this.aClass6_Sub10Array5[local56] = this.aClass6_Sub10Array6[local56] = null;
				while (local207 != null) {
					@Pc(221) Class6_Sub10 local221 = local207.aClass6_Sub10_7;
					local207.aClass6_Sub10_7 = null;
					local207 = local221;
				}
			}
		}
		if (this.anInt7689 < 0) {
			this.anInt7689 = 0;
		}
		if (this.aClass6_Sub10_8 != null) {
			this.aClass6_Sub10_8.method5657(arg0, 0, 256);
		}
		this.aLong174 = Static174.method3502();
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(I)V")
	public final synchronized void method6403() {
		if (this.aBoolean565) {
			return;
		}
		@Pc(12) long local12 = Static174.method3502();
		try {
			if (local12 > this.aLong174 + 500000L) {
				this.aLong174 = local12 - 500000L;
			}
			while (local12 > this.aLong174 + 5000L) {
				this.method6413();
				this.aLong174 += 256000 / Static77.anInt1912;
			}
		} catch (@Pc(48) Exception local48) {
			this.aLong174 = local12;
		}
		if (this.anIntArray541 == null) {
			return;
		}
		try {
			if (this.aLong175 != 0L) {
				if (this.aLong175 > local12) {
					return;
				}
				this.method6410(this.anInt7687);
				this.aLong175 = 0L;
				this.aBoolean566 = true;
			}
			@Pc(84) int local84 = this.method6405();
			if (this.anInt7685 < this.anInt7684 - local84) {
				this.anInt7685 = this.anInt7684 - local84;
			}
			@Pc(109) int local109 = this.anInt7690 + this.anInt7686;
			if (local109 + 256 > 16384) {
				local109 = 16128;
			}
			if (this.anInt7687 < local109 + 256) {
				this.anInt7687 += 1024;
				if (this.anInt7687 > 16384) {
					this.anInt7687 = 16384;
				}
				this.method6411();
				this.method6410(this.anInt7687);
				local84 = 0;
				if (local109 + 256 > this.anInt7687) {
					local109 = this.anInt7687 - 256;
					this.anInt7690 = local109 - this.anInt7686;
				}
				this.aBoolean566 = true;
			}
			while (local109 > local84) {
				this.method6402(this.anIntArray541);
				this.method6409();
				local84 += 256;
			}
			if (local12 > this.aLong176) {
				if (this.aBoolean566) {
					this.aBoolean566 = false;
				} else if (this.anInt7685 == 0 && this.anInt7688 == 0) {
					this.method6411();
					this.aLong175 = local12 + 2000L;
					return;
				} else {
					this.anInt7690 = Math.min(this.anInt7688, this.anInt7685);
					this.anInt7688 = this.anInt7685;
				}
				this.aLong176 = local12 + 2000L;
				this.anInt7685 = 0;
			}
			this.anInt7684 = local84;
		} catch (@Pc(247) Exception local247) {
			this.method6411();
			this.aLong175 = local12 + 2000L;
		}
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "()I")
	protected int method6405() throws Exception {
		return this.anInt7687;
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(Ljava/awt/Component;)V")
	public void method6406(@OriginalArg(0) Component arg0) throws Exception {
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(Lclient!cd;I)V")
	public final synchronized void method6407(@OriginalArg(0) Class6_Sub10 arg0) {
		this.aClass6_Sub10_8 = arg0;
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(IILclient!cd;)V")
	private void method6408(@OriginalArg(1) int arg0, @OriginalArg(2) Class6_Sub10 arg1) {
		@Pc(7) int local7 = arg0 >> 5;
		@Pc(18) Class6_Sub10 local18 = this.aClass6_Sub10Array6[local7];
		if (local18 == null) {
			this.aClass6_Sub10Array5[local7] = arg1;
		} else {
			local18.aClass6_Sub10_7 = arg1;
		}
		this.aClass6_Sub10Array6[local7] = arg1;
		arg1.anInt6706 = arg0;
	}

	@OriginalMember(owner = "client!wf", name = "b", descriptor = "()V")
	protected void method6409() throws Exception {
	}

	@OriginalMember(owner = "client!wf", name = "b", descriptor = "(I)V")
	public void method6410(@OriginalArg(0) int arg0) throws Exception {
	}

	@OriginalMember(owner = "client!wf", name = "c", descriptor = "()V")
	protected void method6411() {
	}

	@OriginalMember(owner = "client!wf", name = "c", descriptor = "(I)V")
	public final synchronized void method6412() {
		this.aBoolean566 = true;
		try {
			this.method6414();
		} catch (@Pc(15) Exception local15) {
			this.method6411();
			this.aLong175 = Static174.method3502() + 2000L;
		}
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(II)V")
	private void method6413() {
		this.anInt7689 -= 256;
		if (this.anInt7689 < 0) {
			this.anInt7689 = 0;
		}
		if (this.aClass6_Sub10_8 != null) {
			this.aClass6_Sub10_8.method5651(256);
		}
	}

	@OriginalMember(owner = "client!wf", name = "d", descriptor = "()V")
	protected void method6414() throws Exception {
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(Z)V")
	public final synchronized void method6415() {
		if (Static206.aClass327_1 != null) {
			@Pc(5) boolean local5 = true;
			for (@Pc(7) int local7 = 0; local7 < 2; local7++) {
				if (Static206.aClass327_1.aClass196Array1[local7] == this) {
					Static206.aClass327_1.aClass196Array1[local7] = null;
				}
				if (Static206.aClass327_1.aClass196Array1[local7] != null) {
					local5 = false;
				}
			}
			if (local5) {
				Static206.aClass327_1.aBoolean693 = true;
				while (Static206.aClass327_1.aBoolean694) {
					Static566.method8004(50L);
				}
				Static206.aClass327_1 = null;
			}
		}
		this.method6411();
		this.aBoolean565 = true;
		this.anIntArray541 = null;
	}
}
