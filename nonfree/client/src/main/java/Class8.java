import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lg")
public class Class8 {

	@OriginalMember(owner = "client!lg", name = "q", descriptor = "[I")
	public int[] anIntArray410;

	@OriginalMember(owner = "client!lg", name = "y", descriptor = "Lclient!sg;")
	private Class2_Sub7 aClass2_Sub7_6;

	@OriginalMember(owner = "client!lg", name = "G", descriptor = "I")
	public int anInt3630;

	@OriginalMember(owner = "client!lg", name = "J", descriptor = "I")
	private int anInt3633;

	@OriginalMember(owner = "client!lg", name = "K", descriptor = "I")
	public int anInt3634;

	@OriginalMember(owner = "client!lg", name = "s", descriptor = "I")
	private final int anInt3624 = 32;

	@OriginalMember(owner = "client!lg", name = "u", descriptor = "J")
	private long aLong118 = Static1.method2();

	@OriginalMember(owner = "client!lg", name = "z", descriptor = "[Lclient!sg;")
	private final Class2_Sub7[] aClass2_Sub7Array5 = new Class2_Sub7[8];

	@OriginalMember(owner = "client!lg", name = "A", descriptor = "J")
	private long aLong119 = 0L;

	@OriginalMember(owner = "client!lg", name = "C", descriptor = "Z")
	private boolean aBoolean137 = true;

	@OriginalMember(owner = "client!lg", name = "D", descriptor = "I")
	private int anInt3629 = 0;

	@OriginalMember(owner = "client!lg", name = "B", descriptor = "I")
	private int anInt3628 = 0;

	@OriginalMember(owner = "client!lg", name = "E", descriptor = "[Lclient!sg;")
	private final Class2_Sub7[] aClass2_Sub7Array6 = new Class2_Sub7[8];

	@OriginalMember(owner = "client!lg", name = "F", descriptor = "J")
	private long aLong120 = 0L;

	@OriginalMember(owner = "client!lg", name = "I", descriptor = "I")
	private int anInt3632 = 0;

	@OriginalMember(owner = "client!lg", name = "H", descriptor = "I")
	private int anInt3631 = 0;

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "()I")
	protected int method2789() throws Exception {
		return this.anInt3634;
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "([II)V")
	private void method2790(@OriginalArg(0) int[] arg0) {
		@Pc(1) short local1 = 256;
		if (Static16.aBoolean15) {
			local1 = 512;
		}
		Static203.method2769(arg0, 0, local1);
		this.anInt3631 -= 256;
		if (this.aClass2_Sub7_6 != null && this.anInt3631 <= 0) {
			this.anInt3631 += Static98.anInt2858 >> 4;
			Static150.method2967(this.aClass2_Sub7_6);
			this.method2794(this.aClass2_Sub7_6.method3310(), this.aClass2_Sub7_6);
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
						@Pc(88) Class2_Sub7 local88 = null;
						@Pc(93) Class2_Sub7 local93 = this.aClass2_Sub7Array6[local56];
						label97: while (true) {
							while (true) {
								if (local93 == null) {
									break label97;
								}
								@Pc(97) Class2_Sub16 local97 = local93.aClass2_Sub16_5;
								if (local97 == null || local97.anInt3444 <= local61) {
									local93.aBoolean171 = true;
									@Pc(121) int local121 = local93.method3311();
									local45 += local121;
									if (local97 != null) {
										local97.anInt3444 += local121;
									}
									if (local45 >= this.anInt3624) {
										break label103;
									}
									@Pc(140) Class2_Sub7 local140 = local93.method3313();
									if (local140 != null) {
										@Pc(145) int local145 = local93.anInt4311;
										while (local140 != null) {
											this.method2794(local145 * local140.method3310() >> 8, local140);
											local140 = local93.method3314();
										}
									}
									@Pc(164) Class2_Sub7 local164 = local93.aClass2_Sub7_8;
									local93.aClass2_Sub7_8 = null;
									if (local88 == null) {
										this.aClass2_Sub7Array6[local56] = local164;
									} else {
										local88.aClass2_Sub7_8 = local164;
									}
									if (local164 == null) {
										this.aClass2_Sub7Array5[local56] = local88;
									}
									local93 = local164;
								} else {
									local47 |= 0x1 << local56;
									local88 = local93;
									local93 = local93.aClass2_Sub7_8;
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
				@Pc(207) Class2_Sub7 local207 = this.aClass2_Sub7Array6[local56];
				this.aClass2_Sub7Array6[local56] = this.aClass2_Sub7Array5[local56] = null;
				while (local207 != null) {
					@Pc(221) Class2_Sub7 local221 = local207.aClass2_Sub7_8;
					local207.aClass2_Sub7_8 = null;
					local207 = local221;
				}
			}
		}
		if (this.anInt3631 < 0) {
			this.anInt3631 = 0;
		}
		if (this.aClass2_Sub7_6 != null) {
			this.aClass2_Sub7_6.method3312(arg0, 0, 256);
		}
		this.aLong118 = Static1.method2();
	}

	@OriginalMember(owner = "client!lg", name = "b", descriptor = "()V")
	protected void method2792() throws Exception {
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(Lclient!sg;I)V")
	public final synchronized void method2793(@OriginalArg(0) Class2_Sub7 arg0) {
		this.aClass2_Sub7_6 = arg0;
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(IILclient!sg;)V")
	private void method2794(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub7 arg1) {
		@Pc(7) int local7 = arg0 >> 5;
		@Pc(12) Class2_Sub7 local12 = this.aClass2_Sub7Array5[local7];
		if (local12 == null) {
			this.aClass2_Sub7Array6[local7] = arg1;
		} else {
			local12.aClass2_Sub7_8 = arg1;
		}
		this.aClass2_Sub7Array5[local7] = arg1;
		arg1.anInt4311 = arg0;
	}

	@OriginalMember(owner = "client!lg", name = "b", descriptor = "(I)V")
	public final void method2795() {
		this.aBoolean137 = true;
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(B)V")
	public final synchronized void method2796() {
		this.aBoolean137 = true;
		try {
			this.method2802();
		} catch (@Pc(14) Exception local14) {
			this.method2798();
			this.aLong120 = Static1.method2() + 2000L;
		}
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(BI)V")
	private void method2797() {
		this.anInt3631 -= 256;
		if (this.anInt3631 < 0) {
			this.anInt3631 = 0;
		}
		if (this.aClass2_Sub7_6 != null) {
			this.aClass2_Sub7_6.method3309(256);
		}
	}

	@OriginalMember(owner = "client!lg", name = "c", descriptor = "()V")
	protected void method2798() {
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(Ljava/awt/Component;)V")
	public void method2799(@OriginalArg(0) Component arg0) throws Exception {
	}

	@OriginalMember(owner = "client!lg", name = "c", descriptor = "(I)V")
	public void method2800(@OriginalArg(0) int arg0) throws Exception {
	}

	@OriginalMember(owner = "client!lg", name = "d", descriptor = "(I)V")
	public final synchronized void method2801() {
		if (this.anIntArray410 == null) {
			return;
		}
		@Pc(12) long local12 = Static1.method2();
		try {
			if (this.aLong120 != 0L) {
				if (this.aLong120 > local12) {
					return;
				}
				this.method2800(this.anInt3634);
				this.aBoolean137 = true;
				this.aLong120 = 0L;
			}
			@Pc(36) int local36 = this.method2789();
			if (this.anInt3629 < this.anInt3632 - local36) {
				this.anInt3629 = this.anInt3632 - local36;
			}
			@Pc(65) int local65 = this.anInt3630 + this.anInt3633;
			if (local65 + 256 > 16384) {
				local65 = 16128;
			}
			if (local65 + 256 > this.anInt3634) {
				this.anInt3634 += 1024;
				if (this.anInt3634 > 16384) {
					this.anInt3634 = 16384;
				}
				this.method2798();
				this.method2800(this.anInt3634);
				if (local65 + 256 > this.anInt3634) {
					local65 = this.anInt3634 - 256;
					this.anInt3633 = local65 - this.anInt3630;
				}
				this.aBoolean137 = true;
				local36 = 0;
			}
			while (local65 > local36) {
				local36 += 256;
				this.method2790(this.anIntArray410);
				this.method2792();
			}
			if (this.aLong119 < local12) {
				if (this.aBoolean137) {
					this.aBoolean137 = false;
				} else if (this.anInt3629 == 0 && this.anInt3628 == 0) {
					this.method2798();
					this.aLong120 = local12 + 2000L;
					return;
				} else {
					this.anInt3633 = Math.min(this.anInt3628, this.anInt3629);
					this.anInt3628 = this.anInt3629;
				}
				this.anInt3629 = 0;
				this.aLong119 = local12 + 2000L;
			}
			this.anInt3632 = local36;
		} catch (@Pc(193) Exception local193) {
			this.method2798();
			this.aLong120 = local12 + 2000L;
		}
		try {
			if (this.aLong118 + 500000L < local12) {
				local12 = this.aLong118;
			}
			while (this.aLong118 + 5000L < local12) {
				this.method2797();
				this.aLong118 += 256000 / Static98.anInt2858;
			}
		} catch (@Pc(238) Exception local238) {
			this.aLong118 = local12;
		}
	}

	@OriginalMember(owner = "client!lg", name = "d", descriptor = "()V")
	protected void method2802() throws Exception {
	}

	@OriginalMember(owner = "client!lg", name = "b", descriptor = "(B)V")
	public final synchronized void method2803() {
		if (Static99.aClass61_1 != null) {
			@Pc(13) boolean local13 = true;
			for (@Pc(15) int local15 = 0; local15 < 2; local15++) {
				if (Static99.aClass61_1.aClass8Array1[local15] == this) {
					Static99.aClass61_1.aClass8Array1[local15] = null;
				}
				if (Static99.aClass61_1.aClass8Array1[local15] != null) {
					local13 = false;
				}
			}
			if (local13) {
				Static99.aClass61_1.aBoolean130 = true;
				while (Static99.aClass61_1.aBoolean131) {
					Static85.method1993(50L);
				}
				Static99.aClass61_1 = null;
			}
		}
		this.method2798();
		this.anIntArray410 = null;
	}
}
