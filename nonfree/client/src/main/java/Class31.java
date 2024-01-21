import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wf")
public class Class31 {

	@OriginalMember(owner = "client!wf", name = "r", descriptor = "Lclient!vh;")
	private Class1_Sub10 aClass1_Sub10_8;

	@OriginalMember(owner = "client!wf", name = "z", descriptor = "[I")
	public int[] anIntArray417;

	@OriginalMember(owner = "client!wf", name = "F", descriptor = "I")
	public int anInt3933;

	@OriginalMember(owner = "client!wf", name = "G", descriptor = "I")
	public int anInt3934;

	@OriginalMember(owner = "client!wf", name = "L", descriptor = "I")
	private int anInt3936;

	@OriginalMember(owner = "client!wf", name = "p", descriptor = "I")
	private final int anInt3924 = 32;

	@OriginalMember(owner = "client!wf", name = "q", descriptor = "J")
	private long aLong139 = Static23.method507();

	@OriginalMember(owner = "client!wf", name = "C", descriptor = "[Lclient!vh;")
	private final Class1_Sub10[] aClass1_Sub10Array5 = new Class1_Sub10[8];

	@OriginalMember(owner = "client!wf", name = "A", descriptor = "I")
	private int anInt3930 = 0;

	@OriginalMember(owner = "client!wf", name = "B", descriptor = "Z")
	private boolean aBoolean163 = true;

	@OriginalMember(owner = "client!wf", name = "D", descriptor = "I")
	private int anInt3931 = 0;

	@OriginalMember(owner = "client!wf", name = "E", descriptor = "I")
	private int anInt3932 = 0;

	@OriginalMember(owner = "client!wf", name = "I", descriptor = "I")
	private int anInt3935 = 0;

	@OriginalMember(owner = "client!wf", name = "J", descriptor = "[Lclient!vh;")
	private final Class1_Sub10[] aClass1_Sub10Array6 = new Class1_Sub10[8];

	@OriginalMember(owner = "client!wf", name = "H", descriptor = "J")
	private long aLong140 = 0L;

	@OriginalMember(owner = "client!wf", name = "K", descriptor = "J")
	private long aLong141 = 0L;

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(IILclient!vh;)V")
	private void method2987(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub10 arg1) {
		@Pc(7) int local7 = arg0 >> 5;
		@Pc(16) Class1_Sub10 local16 = this.aClass1_Sub10Array6[local7];
		if (local16 == null) {
			this.aClass1_Sub10Array5[local7] = arg1;
		} else {
			local16.aClass1_Sub10_7 = arg1;
		}
		this.aClass1_Sub10Array6[local7] = arg1;
		arg1.anInt3172 = arg0;
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(Z)V")
	public final synchronized void method2988() {
		this.aBoolean163 = true;
		try {
			this.method2995();
		} catch (@Pc(14) Exception local14) {
			this.method2994();
			this.aLong140 = Static23.method507() + 2000L;
		}
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "()V")
	protected void method2989() throws Exception {
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(BLclient!vh;)V")
	public final synchronized void method2992(@OriginalArg(1) Class1_Sub10 arg0) {
		this.aClass1_Sub10_8 = arg0;
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(I)V")
	public void method2993(@OriginalArg(0) int arg0) throws Exception {
	}

	@OriginalMember(owner = "client!wf", name = "b", descriptor = "()V")
	protected void method2994() {
	}

	@OriginalMember(owner = "client!wf", name = "c", descriptor = "()V")
	protected void method2995() throws Exception {
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(IZ)V")
	private void method2996() {
		this.anInt3935 -= 256;
		if (this.anInt3935 < 0) {
			this.anInt3935 = 0;
		}
		if (this.aClass1_Sub10_8 != null) {
			this.aClass1_Sub10_8.method2438(256);
		}
	}

	@OriginalMember(owner = "client!wf", name = "d", descriptor = "()I")
	protected int method2998() throws Exception {
		return this.anInt3933;
	}

	@OriginalMember(owner = "client!wf", name = "b", descriptor = "(Z)V")
	public final void method2999() {
		this.aBoolean163 = true;
	}

	@OriginalMember(owner = "client!wf", name = "c", descriptor = "(I)V")
	public final synchronized void method3000() {
		if (this.anIntArray417 == null) {
			return;
		}
		@Pc(20) long local20 = Static23.method507();
		try {
			if (this.aLong140 != 0L) {
				if (this.aLong140 > local20) {
					return;
				}
				this.method2993(this.anInt3933);
				this.aLong140 = 0L;
				this.aBoolean163 = true;
			}
			@Pc(50) int local50 = this.method2998();
			@Pc(57) int local57 = this.anInt3934 + this.anInt3936;
			if (local57 + 256 > 16384) {
				local57 = 16128;
			}
			if (this.anInt3932 - local50 > this.anInt3931) {
				this.anInt3931 = this.anInt3932 - local50;
			}
			if (local57 + 256 > this.anInt3933) {
				this.anInt3933 += 1024;
				if (this.anInt3933 > 16384) {
					this.anInt3933 = 16384;
				}
				this.method2994();
				local50 = 0;
				this.method2993(this.anInt3933);
				if (local57 + 256 > this.anInt3933) {
					local57 = this.anInt3933 - 256;
					this.anInt3936 = local57 - this.anInt3934;
				}
				this.aBoolean163 = true;
			}
			while (local57 > local50) {
				this.method3003(this.anIntArray417);
				this.method2989();
				local50 += 256;
			}
			if (this.aLong141 < local20) {
				if (this.aBoolean163) {
					this.aBoolean163 = false;
				} else if (this.anInt3931 == 0 && this.anInt3930 == 0) {
					this.method2994();
					this.aLong140 = local20 + 2000L;
					return;
				} else {
					this.anInt3936 = Math.min(this.anInt3930, this.anInt3931);
					this.anInt3930 = this.anInt3931;
				}
				this.anInt3931 = 0;
				this.aLong141 = local20 + 2000L;
			}
			this.anInt3932 = local50;
		} catch (@Pc(200) Exception local200) {
			this.method2994();
			this.aLong140 = local20 + 2000L;
		}
		try {
			if (this.aLong139 + 500000L < local20) {
				local20 = this.aLong139;
			}
			while (this.aLong139 + 5000L < local20) {
				this.method2996();
				this.aLong139 += 256000 / Static185.anInt3915;
			}
		} catch (@Pc(245) Exception local245) {
			this.aLong139 = local20;
		}
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(B)V")
	public final synchronized void method3001() {
		if (Static152.aClass78_1 != null) {
			@Pc(5) boolean local5 = true;
			for (@Pc(7) int local7 = 0; local7 < 2; local7++) {
				if (Static152.aClass78_1.aClass31Array1[local7] == this) {
					Static152.aClass78_1.aClass31Array1[local7] = null;
				}
				if (Static152.aClass78_1.aClass31Array1[local7] != null) {
					local5 = false;
				}
			}
			if (local5) {
				Static152.aClass78_1.aBoolean141 = true;
				while (Static152.aClass78_1.aBoolean140) {
					Static133.method2259(50L);
				}
				Static152.aClass78_1 = null;
			}
		}
		this.method2994();
		this.anIntArray417 = null;
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(Ljava/awt/Component;)V")
	public void method3002(@OriginalArg(0) Component arg0) throws Exception {
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "([II)V")
	private void method3003(@OriginalArg(0) int[] arg0) {
		@Pc(1) short local1 = 256;
		if (Static107.aBoolean100) {
			local1 = 512;
		}
		Static190.method1387(arg0, 0, local1);
		this.anInt3935 -= 256;
		if (this.aClass1_Sub10_8 != null && this.anInt3935 <= 0) {
			this.anInt3935 += Static185.anInt3915 >> 4;
			Static16.method236(this.aClass1_Sub10_8);
			this.method2987(this.aClass1_Sub10_8.method2441(), this.aClass1_Sub10_8);
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
						@Pc(88) Class1_Sub10 local88 = null;
						@Pc(93) Class1_Sub10 local93 = this.aClass1_Sub10Array5[local56];
						label97: while (true) {
							while (true) {
								if (local93 == null) {
									break label97;
								}
								@Pc(97) Class1_Sub11 local97 = local93.aClass1_Sub11_5;
								if (local97 == null || local97.anInt804 <= local61) {
									local93.aBoolean126 = true;
									@Pc(121) int local121 = local93.method2436();
									local45 += local121;
									if (local97 != null) {
										local97.anInt804 += local121;
									}
									if (local45 >= this.anInt3924) {
										break label103;
									}
									@Pc(140) Class1_Sub10 local140 = local93.method2440();
									if (local140 != null) {
										@Pc(145) int local145 = local93.anInt3172;
										while (local140 != null) {
											this.method2987(local145 * local140.method2441() >> 8, local140);
											local140 = local93.method2439();
										}
									}
									@Pc(164) Class1_Sub10 local164 = local93.aClass1_Sub10_7;
									local93.aClass1_Sub10_7 = null;
									if (local88 == null) {
										this.aClass1_Sub10Array5[local56] = local164;
									} else {
										local88.aClass1_Sub10_7 = local164;
									}
									if (local164 == null) {
										this.aClass1_Sub10Array6[local56] = local88;
									}
									local93 = local164;
								} else {
									local47 |= 0x1 << local56;
									local88 = local93;
									local93 = local93.aClass1_Sub10_7;
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
				@Pc(207) Class1_Sub10 local207 = this.aClass1_Sub10Array5[local56];
				this.aClass1_Sub10Array5[local56] = this.aClass1_Sub10Array6[local56] = null;
				while (local207 != null) {
					@Pc(221) Class1_Sub10 local221 = local207.aClass1_Sub10_7;
					local207.aClass1_Sub10_7 = null;
					local207 = local221;
				}
			}
		}
		if (this.anInt3935 < 0) {
			this.anInt3935 = 0;
		}
		if (this.aClass1_Sub10_8 != null) {
			this.aClass1_Sub10_8.method2442(arg0, 0, 256);
		}
		this.aLong139 = Static23.method507();
	}
}
