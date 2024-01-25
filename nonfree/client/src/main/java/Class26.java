import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bp")
public class Class26 {

	@OriginalMember(owner = "client!bp", name = "n", descriptor = "[I")
	public int[] anIntArray425;

	@OriginalMember(owner = "client!bp", name = "s", descriptor = "Lclient!kp;")
	private Class14_Sub19 aClass14_Sub19_5;

	@OriginalMember(owner = "client!bp", name = "A", descriptor = "I")
	public int anInt4712;

	@OriginalMember(owner = "client!bp", name = "B", descriptor = "I")
	public int anInt4713;

	@OriginalMember(owner = "client!bp", name = "K", descriptor = "I")
	private int anInt4718;

	@OriginalMember(owner = "client!bp", name = "r", descriptor = "I")
	private final int anInt4706 = 32;

	@OriginalMember(owner = "client!bp", name = "h", descriptor = "Z")
	private boolean aBoolean311 = false;

	@OriginalMember(owner = "client!bp", name = "o", descriptor = "J")
	private long aLong145 = Static168.method3300();

	@OriginalMember(owner = "client!bp", name = "G", descriptor = "[Lclient!kp;")
	private final Class14_Sub19[] aClass14_Sub19Array6 = new Class14_Sub19[8];

	@OriginalMember(owner = "client!bp", name = "E", descriptor = "[Lclient!kp;")
	private final Class14_Sub19[] aClass14_Sub19Array5 = new Class14_Sub19[8];

	@OriginalMember(owner = "client!bp", name = "y", descriptor = "Z")
	private boolean aBoolean313 = true;

	@OriginalMember(owner = "client!bp", name = "F", descriptor = "I")
	private int anInt4715 = 0;

	@OriginalMember(owner = "client!bp", name = "H", descriptor = "I")
	private int anInt4716 = 0;

	@OriginalMember(owner = "client!bp", name = "C", descriptor = "J")
	private long aLong146 = 0L;

	@OriginalMember(owner = "client!bp", name = "I", descriptor = "I")
	private int anInt4717 = 0;

	@OriginalMember(owner = "client!bp", name = "M", descriptor = "I")
	private int anInt4719 = 0;

	@OriginalMember(owner = "client!bp", name = "L", descriptor = "J")
	private long aLong147 = 0L;

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "([II)V")
	private void method4214(@OriginalArg(0) int[] arg0) {
		@Pc(1) short local1 = 256;
		if (Static111.aBoolean172) {
			local1 = 512;
		}
		Static358.method766(arg0, 0, local1);
		this.anInt4715 -= 256;
		if (this.aClass14_Sub19_5 != null && this.anInt4715 <= 0) {
			this.anInt4715 += Static223.anInt5818 >> 4;
			Static284.method4796(this.aClass14_Sub19_5);
			this.method4218(this.aClass14_Sub19_5, this.aClass14_Sub19_5.method5510());
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
						@Pc(88) Class14_Sub19 local88 = null;
						@Pc(93) Class14_Sub19 local93 = this.aClass14_Sub19Array6[local56];
						label97: while (true) {
							while (true) {
								if (local93 == null) {
									break label97;
								}
								@Pc(97) Class14_Sub11 local97 = local93.aClass14_Sub11_5;
								if (local97 == null || local97.anInt3558 <= local61) {
									local93.aBoolean424 = true;
									@Pc(121) int local121 = local93.method5509();
									local45 += local121;
									if (local97 != null) {
										local97.anInt3558 += local121;
									}
									if (local45 >= this.anInt4706) {
										break label103;
									}
									@Pc(140) Class14_Sub19 local140 = local93.method5506();
									if (local140 != null) {
										@Pc(145) int local145 = local93.anInt6160;
										while (local140 != null) {
											this.method4218(local140, local145 * local140.method5510() >> 8);
											local140 = local93.method5508();
										}
									}
									@Pc(164) Class14_Sub19 local164 = local93.aClass14_Sub19_8;
									local93.aClass14_Sub19_8 = null;
									if (local88 == null) {
										this.aClass14_Sub19Array6[local56] = local164;
									} else {
										local88.aClass14_Sub19_8 = local164;
									}
									if (local164 == null) {
										this.aClass14_Sub19Array5[local56] = local88;
									}
									local93 = local164;
								} else {
									local47 |= 0x1 << local56;
									local88 = local93;
									local93 = local93.aClass14_Sub19_8;
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
				@Pc(207) Class14_Sub19 local207 = this.aClass14_Sub19Array6[local56];
				this.aClass14_Sub19Array6[local56] = this.aClass14_Sub19Array5[local56] = null;
				while (local207 != null) {
					@Pc(221) Class14_Sub19 local221 = local207.aClass14_Sub19_8;
					local207.aClass14_Sub19_8 = null;
					local207 = local221;
				}
			}
		}
		if (this.anInt4715 < 0) {
			this.anInt4715 = 0;
		}
		if (this.aClass14_Sub19_5 != null) {
			this.aClass14_Sub19_5.method5504(arg0, 0, 256);
		}
		this.aLong145 = Static168.method3300();
	}

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(BLclient!kp;)V")
	public final synchronized void method4215(@OriginalArg(1) Class14_Sub19 arg0) {
		this.aClass14_Sub19_5 = arg0;
	}

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "()V")
	protected void method4216() {
	}

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(I)V")
	public final synchronized void method4217() {
		if (this.aBoolean311) {
			return;
		}
		@Pc(12) long local12 = Static168.method3300();
		try {
			if (this.aLong145 + 500000L < local12) {
				this.aLong145 = local12 - 500000L;
			}
			while (local12 > this.aLong145 + 5000L) {
				this.method4228();
				this.aLong145 += 256000 / Static223.anInt5818;
			}
		} catch (@Pc(52) Exception local52) {
			this.aLong145 = local12;
		}
		if (this.anIntArray425 == null) {
			return;
		}
		try {
			if (this.aLong146 != 0L) {
				if (local12 < this.aLong146) {
					return;
				}
				this.method4226(this.anInt4712);
				this.aLong146 = 0L;
				this.aBoolean313 = true;
			}
			@Pc(89) int local89 = this.method4221();
			if (this.anInt4716 - local89 > this.anInt4719) {
				this.anInt4719 = this.anInt4716 - local89;
			}
			@Pc(114) int local114 = this.anInt4718 + this.anInt4713;
			if (local114 + 256 > 16384) {
				local114 = 16128;
			}
			if (local114 + 256 > this.anInt4712) {
				this.anInt4712 += 1024;
				if (this.anInt4712 > 16384) {
					this.anInt4712 = 16384;
				}
				this.method4216();
				local89 = 0;
				this.method4226(this.anInt4712);
				if (local114 + 256 > this.anInt4712) {
					local114 = this.anInt4712 - 256;
					this.anInt4718 = local114 - this.anInt4713;
				}
				this.aBoolean313 = true;
			}
			while (local114 > local89) {
				this.method4214(this.anIntArray425);
				this.method4229();
				local89 += 256;
			}
			if (local12 > this.aLong147) {
				if (this.aBoolean313) {
					this.aBoolean313 = false;
				} else if (this.anInt4719 == 0 && this.anInt4717 == 0) {
					this.method4216();
					this.aLong146 = local12 + 2000L;
					return;
				} else {
					this.anInt4718 = Math.min(this.anInt4717, this.anInt4719);
					this.anInt4717 = this.anInt4719;
				}
				this.aLong147 = local12 + 2000L;
				this.anInt4719 = 0;
			}
			this.anInt4716 = local89;
		} catch (@Pc(248) Exception local248) {
			this.method4216();
			this.aLong146 = local12 + 2000L;
		}
	}

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(BLclient!kp;I)V")
	private void method4218(@OriginalArg(1) Class14_Sub19 arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = arg1 >> 5;
		@Pc(12) Class14_Sub19 local12 = this.aClass14_Sub19Array5[local7];
		if (local12 == null) {
			this.aClass14_Sub19Array6[local7] = arg0;
		} else {
			local12.aClass14_Sub19_8 = arg0;
		}
		this.aClass14_Sub19Array5[local7] = arg0;
		arg0.anInt6160 = arg1;
	}

	@OriginalMember(owner = "client!bp", name = "b", descriptor = "(I)V")
	public final void method4220() {
		this.aBoolean313 = true;
	}

	@OriginalMember(owner = "client!bp", name = "b", descriptor = "()I")
	protected int method4221() throws Exception {
		return this.anInt4712;
	}

	@OriginalMember(owner = "client!bp", name = "c", descriptor = "()V")
	protected void method4222() throws Exception {
	}

	@OriginalMember(owner = "client!bp", name = "c", descriptor = "(I)V")
	public final synchronized void method4225() {
		if (Static142.aClass145_1 != null) {
			@Pc(17) boolean local17 = true;
			for (@Pc(19) int local19 = 0; local19 < 2; local19++) {
				if (Static142.aClass145_1.aClass26Array1[local19] == this) {
					Static142.aClass145_1.aClass26Array1[local19] = null;
				}
				if (Static142.aClass145_1.aClass26Array1[local19] != null) {
					local17 = false;
				}
			}
			if (local17) {
				Static142.aClass145_1.aBoolean257 = true;
				while (Static142.aClass145_1.aBoolean256) {
					Static15.method5425(50L);
				}
				Static142.aClass145_1 = null;
			}
		}
		this.method4216();
		this.aBoolean311 = true;
		this.anIntArray425 = null;
	}

	@OriginalMember(owner = "client!bp", name = "d", descriptor = "(I)V")
	public void method4226(@OriginalArg(0) int arg0) throws Exception {
	}

	@OriginalMember(owner = "client!bp", name = "e", descriptor = "(I)V")
	public final synchronized void method4227() {
		this.aBoolean313 = true;
		try {
			this.method4222();
		} catch (@Pc(17) Exception local17) {
			this.method4216();
			this.aLong146 = Static168.method3300() + 2000L;
		}
	}

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(ZI)V")
	private void method4228() {
		this.anInt4715 -= 256;
		if (this.anInt4715 < 0) {
			this.anInt4715 = 0;
		}
		if (this.aClass14_Sub19_5 != null) {
			this.aClass14_Sub19_5.method5507(256);
		}
	}

	@OriginalMember(owner = "client!bp", name = "d", descriptor = "()V")
	protected void method4229() throws Exception {
	}

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(Ljava/awt/Component;)V")
	public void method4230(@OriginalArg(0) Component arg0) throws Exception {
	}
}
