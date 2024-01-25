import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ah")
public class Class14 {

	@OriginalMember(owner = "client!ah", name = "i", descriptor = "Lclient!pn;")
	private Class2_Sub10 aClass2_Sub10_8;

	@OriginalMember(owner = "client!ah", name = "k", descriptor = "[I")
	public int[] anIntArray454;

	@OriginalMember(owner = "client!ah", name = "u", descriptor = "I")
	private int anInt6592;

	@OriginalMember(owner = "client!ah", name = "A", descriptor = "I")
	public int anInt6595;

	@OriginalMember(owner = "client!ah", name = "B", descriptor = "I")
	public int anInt6596;

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "I")
	private final int anInt6577 = 32;

	@OriginalMember(owner = "client!ah", name = "m", descriptor = "Z")
	private boolean aBoolean514 = false;

	@OriginalMember(owner = "client!ah", name = "q", descriptor = "J")
	private long aLong179 = Static548.method7437();

	@OriginalMember(owner = "client!ah", name = "r", descriptor = "I")
	private int anInt6589 = 0;

	@OriginalMember(owner = "client!ah", name = "x", descriptor = "J")
	private long aLong180 = 0L;

	@OriginalMember(owner = "client!ah", name = "t", descriptor = "I")
	private int anInt6591 = 0;

	@OriginalMember(owner = "client!ah", name = "v", descriptor = "I")
	private int anInt6593 = 0;

	@OriginalMember(owner = "client!ah", name = "w", descriptor = "Z")
	private boolean aBoolean515 = true;

	@OriginalMember(owner = "client!ah", name = "y", descriptor = "J")
	private long aLong181 = 0L;

	@OriginalMember(owner = "client!ah", name = "z", descriptor = "I")
	private int anInt6594 = 0;

	@OriginalMember(owner = "client!ah", name = "E", descriptor = "[Lclient!pn;")
	private final Class2_Sub10[] aClass2_Sub10Array6 = new Class2_Sub10[8];

	@OriginalMember(owner = "client!ah", name = "D", descriptor = "[Lclient!pn;")
	private final Class2_Sub10[] aClass2_Sub10Array5 = new Class2_Sub10[8];

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(ZI)V")
	private void method5515() {
		this.anInt6594 -= 256;
		if (this.anInt6594 < 0) {
			this.anInt6594 = 0;
		}
		if (this.aClass2_Sub10_8 != null) {
			this.aClass2_Sub10_8.method3361(256);
		}
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(ILclient!pn;B)V")
	private void method5516(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub10 arg1) {
		@Pc(7) int local7 = arg0 >> 5;
		@Pc(12) Class2_Sub10 local12 = this.aClass2_Sub10Array5[local7];
		if (local12 == null) {
			this.aClass2_Sub10Array6[local7] = arg1;
		} else {
			local12.aClass2_Sub10_7 = arg1;
		}
		this.aClass2_Sub10Array5[local7] = arg1;
		arg1.anInt4050 = arg0;
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "()V")
	protected void method5517() {
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(I)V")
	public final synchronized void method5518() {
		if (this.aBoolean514) {
			return;
		}
		@Pc(12) long local12 = Static548.method7437();
		try {
			if (this.aLong179 + 500000L < local12) {
				this.aLong179 = local12 - 500000L;
			}
			while (local12 > this.aLong179 + 5000L) {
				this.method5515();
				this.aLong179 += 256000 / Static162.anInt3474;
			}
		} catch (@Pc(58) Exception local58) {
			this.aLong179 = local12;
		}
		if (this.anIntArray454 == null) {
			return;
		}
		try {
			if (this.aLong180 != 0L) {
				if (local12 < this.aLong180) {
					return;
				}
				this.method5528(this.anInt6596);
				this.aLong180 = 0L;
				this.aBoolean515 = true;
			}
			@Pc(95) int local95 = this.method5526();
			if (this.anInt6589 < this.anInt6593 - local95) {
				this.anInt6589 = this.anInt6593 - local95;
			}
			@Pc(116) int local116 = this.anInt6592 + this.anInt6595;
			if (local116 + 256 > 16384) {
				local116 = 16128;
			}
			if (local116 + 256 > this.anInt6596) {
				this.anInt6596 += 1024;
				if (this.anInt6596 > 16384) {
					this.anInt6596 = 16384;
				}
				this.method5517();
				this.method5528(this.anInt6596);
				local95 = 0;
				this.aBoolean515 = true;
				if (local116 + 256 > this.anInt6596) {
					local116 = this.anInt6596 - 256;
					this.anInt6592 = local116 - this.anInt6595;
				}
			}
			while (local95 < local116) {
				this.method5522(this.anIntArray454);
				local95 += 256;
				this.method5529();
			}
			if (this.aLong181 < local12) {
				if (this.aBoolean515) {
					this.aBoolean515 = false;
				} else if (this.anInt6589 == 0 && this.anInt6591 == 0) {
					this.method5517();
					this.aLong180 = local12 + 2000L;
					return;
				} else {
					this.anInt6592 = Math.min(this.anInt6591, this.anInt6589);
					this.anInt6591 = this.anInt6589;
				}
				this.anInt6589 = 0;
				this.aLong181 = local12 + 2000L;
			}
			this.anInt6593 = local95;
		} catch (@Pc(246) Exception local246) {
			this.method5517();
			this.aLong180 = local12 + 2000L;
		}
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(Ljava/awt/Component;)V")
	public void method5519(@OriginalArg(0) Component arg0) throws Exception {
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(Lclient!pn;B)V")
	public final synchronized void method5520(@OriginalArg(0) Class2_Sub10 arg0) {
		this.aClass2_Sub10_8 = arg0;
	}

	@OriginalMember(owner = "client!ah", name = "b", descriptor = "(I)V")
	public final synchronized void method5521() {
		if (Static22.aClass47_1 != null) {
			@Pc(5) boolean local5 = true;
			for (@Pc(7) int local7 = 0; local7 < 2; local7++) {
				if (Static22.aClass47_1.aClass14Array1[local7] == this) {
					Static22.aClass47_1.aClass14Array1[local7] = null;
				}
				if (Static22.aClass47_1.aClass14Array1[local7] != null) {
					local5 = false;
				}
			}
			if (local5) {
				Static22.aClass47_1.aBoolean90 = true;
				while (Static22.aClass47_1.aBoolean91) {
					Static459.method6498(50L);
				}
				Static22.aClass47_1 = null;
			}
		}
		this.method5517();
		this.anIntArray454 = null;
		this.aBoolean514 = true;
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "([II)V")
	private void method5522(@OriginalArg(0) int[] arg0) {
		@Pc(1) short local1 = 256;
		if (Static591.aBoolean732) {
			local1 = 512;
		}
		Static598.method1135(arg0, 0, local1);
		this.anInt6594 -= 256;
		if (this.aClass2_Sub10_8 != null && this.anInt6594 <= 0) {
			this.anInt6594 += Static162.anInt3474 >> 4;
			Static324.method5010(this.aClass2_Sub10_8);
			this.method5516(this.aClass2_Sub10_8.method3365(), this.aClass2_Sub10_8);
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
						@Pc(88) Class2_Sub10 local88 = null;
						@Pc(93) Class2_Sub10 local93 = this.aClass2_Sub10Array6[local56];
						label97: while (true) {
							while (true) {
								if (local93 == null) {
									break label97;
								}
								@Pc(97) Class2_Sub7 local97 = local93.aClass2_Sub7_5;
								if (local97 == null || local97.anInt6606 <= local61) {
									local93.aBoolean329 = true;
									@Pc(121) int local121 = local93.method3366();
									local45 += local121;
									if (local97 != null) {
										local97.anInt6606 += local121;
									}
									if (local45 >= this.anInt6577) {
										break label103;
									}
									@Pc(140) Class2_Sub10 local140 = local93.method3360();
									if (local140 != null) {
										@Pc(145) int local145 = local93.anInt4050;
										while (local140 != null) {
											this.method5516(local145 * local140.method3365() >> 8, local140);
											local140 = local93.method3364();
										}
									}
									@Pc(164) Class2_Sub10 local164 = local93.aClass2_Sub10_7;
									local93.aClass2_Sub10_7 = null;
									if (local88 == null) {
										this.aClass2_Sub10Array6[local56] = local164;
									} else {
										local88.aClass2_Sub10_7 = local164;
									}
									if (local164 == null) {
										this.aClass2_Sub10Array5[local56] = local88;
									}
									local93 = local164;
								} else {
									local47 |= 0x1 << local56;
									local88 = local93;
									local93 = local93.aClass2_Sub10_7;
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
				@Pc(207) Class2_Sub10 local207 = this.aClass2_Sub10Array6[local56];
				this.aClass2_Sub10Array6[local56] = this.aClass2_Sub10Array5[local56] = null;
				while (local207 != null) {
					@Pc(221) Class2_Sub10 local221 = local207.aClass2_Sub10_7;
					local207.aClass2_Sub10_7 = null;
					local207 = local221;
				}
			}
		}
		if (this.anInt6594 < 0) {
			this.anInt6594 = 0;
		}
		if (this.aClass2_Sub10_8 != null) {
			this.aClass2_Sub10_8.method3363(arg0, 0, 256);
		}
		this.aLong179 = Static548.method7437();
	}

	@OriginalMember(owner = "client!ah", name = "c", descriptor = "(I)V")
	public final synchronized void method5523() {
		this.aBoolean515 = true;
		try {
			this.method5527();
		} catch (@Pc(14) Exception local14) {
			this.method5517();
			this.aLong180 = Static548.method7437() + 2000L;
		}
	}

	@OriginalMember(owner = "client!ah", name = "b", descriptor = "()I")
	protected int method5526() throws Exception {
		return this.anInt6596;
	}

	@OriginalMember(owner = "client!ah", name = "c", descriptor = "()V")
	protected void method5527() throws Exception {
	}

	@OriginalMember(owner = "client!ah", name = "d", descriptor = "(I)V")
	public void method5528(@OriginalArg(0) int arg0) throws Exception {
	}

	@OriginalMember(owner = "client!ah", name = "d", descriptor = "()V")
	protected void method5529() throws Exception {
	}
}
