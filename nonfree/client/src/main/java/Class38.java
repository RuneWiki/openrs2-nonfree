import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hi")
public class Class38 {

	@OriginalMember(owner = "client!hi", name = "i", descriptor = "[I")
	public int[] anIntArray492;

	@OriginalMember(owner = "client!hi", name = "u", descriptor = "Lclient!pg;")
	private Class3_Sub4 aClass3_Sub4_8;

	@OriginalMember(owner = "client!hi", name = "D", descriptor = "I")
	public int anInt4122;

	@OriginalMember(owner = "client!hi", name = "E", descriptor = "I")
	private int anInt4123;

	@OriginalMember(owner = "client!hi", name = "L", descriptor = "I")
	public int anInt4127;

	@OriginalMember(owner = "client!hi", name = "w", descriptor = "I")
	private final int anInt4118 = 32;

	@OriginalMember(owner = "client!hi", name = "f", descriptor = "J")
	private long aLong140 = Static86.method1251();

	@OriginalMember(owner = "client!hi", name = "F", descriptor = "J")
	private long aLong142 = 0L;

	@OriginalMember(owner = "client!hi", name = "z", descriptor = "I")
	private int anInt4120 = 0;

	@OriginalMember(owner = "client!hi", name = "x", descriptor = "J")
	private long aLong141 = 0L;

	@OriginalMember(owner = "client!hi", name = "G", descriptor = "I")
	private int anInt4124 = 0;

	@OriginalMember(owner = "client!hi", name = "H", descriptor = "[Lclient!pg;")
	private final Class3_Sub4[] aClass3_Sub4Array6 = new Class3_Sub4[8];

	@OriginalMember(owner = "client!hi", name = "I", descriptor = "I")
	private int anInt4125 = 0;

	@OriginalMember(owner = "client!hi", name = "A", descriptor = "I")
	private int anInt4121 = 0;

	@OriginalMember(owner = "client!hi", name = "B", descriptor = "[Lclient!pg;")
	private final Class3_Sub4[] aClass3_Sub4Array5 = new Class3_Sub4[8];

	@OriginalMember(owner = "client!hi", name = "C", descriptor = "Z")
	private boolean aBoolean165 = true;

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(Ljava/awt/Component;)V")
	public void method2939(@OriginalArg(0) Component arg0) throws Exception {
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(ILclient!pg;B)V")
	private void method2940(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub4 arg1) {
		@Pc(3) int local3 = arg0 >> 5;
		@Pc(8) Class3_Sub4 local8 = this.aClass3_Sub4Array6[local3];
		if (local8 == null) {
			this.aClass3_Sub4Array5[local3] = arg1;
		} else {
			local8.aClass3_Sub4_6 = arg1;
		}
		this.aClass3_Sub4Array6[local3] = arg1;
		arg1.anInt2815 = arg0;
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(B)V")
	public final synchronized void method2941() {
		if (Static173.aClass90_1 != null) {
			@Pc(5) boolean local5 = true;
			for (@Pc(7) int local7 = 0; local7 < 2; local7++) {
				if (Static173.aClass90_1.aClass38Array1[local7] == this) {
					Static173.aClass90_1.aClass38Array1[local7] = null;
				}
				if (Static173.aClass90_1.aClass38Array1[local7] != null) {
					local5 = false;
				}
			}
			if (local5) {
				Static173.aClass90_1.aBoolean163 = true;
				while (Static173.aClass90_1.aBoolean162) {
					Static135.method2059(50L);
				}
				Static173.aClass90_1 = null;
			}
		}
		this.method2948();
		this.anIntArray492 = null;
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "()V")
	protected void method2942() throws Exception {
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(ILclient!pg;)V")
	public final synchronized void method2943(@OriginalArg(1) Class3_Sub4 arg0) {
		this.aClass3_Sub4_8 = arg0;
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(II)V")
	private void method2944() {
		this.anInt4121 -= 256;
		if (this.anInt4121 < 0) {
			this.anInt4121 = 0;
		}
		if (this.aClass3_Sub4_8 != null) {
			this.aClass3_Sub4_8.method1975(256);
		}
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(Z)V")
	public final synchronized void method2945() {
		if (this.anIntArray492 == null) {
			return;
		}
		@Pc(12) long local12 = Static86.method1251();
		try {
			if (this.aLong142 != 0L) {
				if (local12 < this.aLong142) {
					return;
				}
				this.method2953(this.anInt4127);
				this.aLong142 = 0L;
				this.aBoolean165 = true;
			}
			@Pc(50) int local50 = this.method2950();
			if (this.anInt4120 - local50 > this.anInt4124) {
				this.anInt4124 = this.anInt4120 - local50;
			}
			@Pc(75) int local75 = this.anInt4122 + this.anInt4123;
			if (local75 + 256 > 16384) {
				local75 = 16128;
			}
			if (local75 + 256 > this.anInt4127) {
				local50 = 0;
				this.anInt4127 += 1024;
				if (this.anInt4127 > 16384) {
					this.anInt4127 = 16384;
				}
				this.method2948();
				this.method2953(this.anInt4127);
				if (this.anInt4127 < local75 + 256) {
					local75 = this.anInt4127 - 256;
					this.anInt4123 = local75 - this.anInt4122;
				}
				this.aBoolean165 = true;
			}
			while (local75 > local50) {
				local50 += 256;
				this.method2951(this.anIntArray492);
				this.method2942();
			}
			if (local12 > this.aLong141) {
				if (this.aBoolean165) {
					this.aBoolean165 = false;
				} else if (this.anInt4124 == 0 && this.anInt4125 == 0) {
					this.method2948();
					this.aLong142 = local12 + 2000L;
					return;
				} else {
					this.anInt4123 = Math.min(this.anInt4125, this.anInt4124);
					this.anInt4125 = this.anInt4124;
				}
				this.aLong141 = local12 + 2000L;
				this.anInt4124 = 0;
			}
			this.anInt4120 = local50;
		} catch (@Pc(211) Exception local211) {
			this.method2948();
			this.aLong142 = local12 + 2000L;
		}
		try {
			if (this.aLong140 + 500000L < local12) {
				local12 = this.aLong140;
			}
			while (local12 > this.aLong140 + 5000L) {
				this.method2944();
				this.aLong140 += 256000 / Static47.anInt1073;
			}
		} catch (@Pc(256) Exception local256) {
			this.aLong140 = local12;
		}
	}

	@OriginalMember(owner = "client!hi", name = "b", descriptor = "()V")
	protected void method2948() {
	}

	@OriginalMember(owner = "client!hi", name = "c", descriptor = "(B)V")
	public final void method2949() {
		this.aBoolean165 = true;
	}

	@OriginalMember(owner = "client!hi", name = "c", descriptor = "()I")
	protected int method2950() throws Exception {
		return this.anInt4127;
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "([II)V")
	private void method2951(@OriginalArg(0) int[] arg0) {
		@Pc(1) short local1 = 256;
		if (Static112.aBoolean97) {
			local1 = 512;
		}
		Static200.method1182(arg0, 0, local1);
		this.anInt4121 -= 256;
		if (this.aClass3_Sub4_8 != null && this.anInt4121 <= 0) {
			this.anInt4121 += Static47.anInt1073 >> 4;
			Static182.method2908(this.aClass3_Sub4_8);
			this.method2940(this.aClass3_Sub4_8.method1974(), this.aClass3_Sub4_8);
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
						@Pc(88) Class3_Sub4 local88 = null;
						@Pc(93) Class3_Sub4 local93 = this.aClass3_Sub4Array5[local56];
						label97: while (true) {
							while (true) {
								if (local93 == null) {
									break label97;
								}
								@Pc(97) Class3_Sub19 local97 = local93.aClass3_Sub19_5;
								if (local97 == null || local97.anInt2748 <= local61) {
									local93.aBoolean112 = true;
									@Pc(121) int local121 = local93.method1970();
									local45 += local121;
									if (local97 != null) {
										local97.anInt2748 += local121;
									}
									if (local45 >= this.anInt4118) {
										break label103;
									}
									@Pc(140) Class3_Sub4 local140 = local93.method1976();
									if (local140 != null) {
										@Pc(145) int local145 = local93.anInt2815;
										while (local140 != null) {
											this.method2940(local145 * local140.method1974() >> 8, local140);
											local140 = local93.method1973();
										}
									}
									@Pc(164) Class3_Sub4 local164 = local93.aClass3_Sub4_6;
									local93.aClass3_Sub4_6 = null;
									if (local88 == null) {
										this.aClass3_Sub4Array5[local56] = local164;
									} else {
										local88.aClass3_Sub4_6 = local164;
									}
									if (local164 == null) {
										this.aClass3_Sub4Array6[local56] = local88;
									}
									local93 = local164;
								} else {
									local47 |= 0x1 << local56;
									local88 = local93;
									local93 = local93.aClass3_Sub4_6;
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
				@Pc(207) Class3_Sub4 local207 = this.aClass3_Sub4Array5[local56];
				this.aClass3_Sub4Array5[local56] = this.aClass3_Sub4Array6[local56] = null;
				while (local207 != null) {
					@Pc(221) Class3_Sub4 local221 = local207.aClass3_Sub4_6;
					local207.aClass3_Sub4_6 = null;
					local207 = local221;
				}
			}
		}
		if (this.anInt4121 < 0) {
			this.anInt4121 = 0;
		}
		if (this.aClass3_Sub4_8 != null) {
			this.aClass3_Sub4_8.method1971(arg0, 0, 256);
		}
		this.aLong140 = Static86.method1251();
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(I)V")
	public void method2953(@OriginalArg(0) int arg0) throws Exception {
	}

	@OriginalMember(owner = "client!hi", name = "b", descriptor = "(I)V")
	public final synchronized void method2954() {
		this.aBoolean165 = true;
		try {
			this.method2956();
		} catch (@Pc(6) Exception local6) {
			this.method2948();
			this.aLong142 = Static86.method1251() + 2000L;
		}
	}

	@OriginalMember(owner = "client!hi", name = "d", descriptor = "()V")
	protected void method2956() throws Exception {
	}
}
