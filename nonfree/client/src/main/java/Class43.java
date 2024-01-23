import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!em")
public class Class43 {

	@OriginalMember(owner = "client!em", name = "k", descriptor = "[I")
	public int[] anIntArray304;

	@OriginalMember(owner = "client!em", name = "u", descriptor = "Lclient!mh;")
	private Class2_Sub3 aClass2_Sub3_7;

	@OriginalMember(owner = "client!em", name = "y", descriptor = "I")
	public int anInt3050;

	@OriginalMember(owner = "client!em", name = "G", descriptor = "I")
	public int anInt3055;

	@OriginalMember(owner = "client!em", name = "H", descriptor = "I")
	private int anInt3056;

	@OriginalMember(owner = "client!em", name = "j", descriptor = "Z")
	private boolean aBoolean212 = false;

	@OriginalMember(owner = "client!em", name = "a", descriptor = "I")
	private int anInt3033 = 32;

	@OriginalMember(owner = "client!em", name = "g", descriptor = "J")
	private long aLong99 = Static221.method3670();

	@OriginalMember(owner = "client!em", name = "w", descriptor = "J")
	private long aLong100 = 0L;

	@OriginalMember(owner = "client!em", name = "x", descriptor = "[Lclient!mh;")
	private Class2_Sub3[] aClass2_Sub3Array5 = new Class2_Sub3[8];

	@OriginalMember(owner = "client!em", name = "z", descriptor = "I")
	private int anInt3051 = 0;

	@OriginalMember(owner = "client!em", name = "E", descriptor = "I")
	private int anInt3054 = 0;

	@OriginalMember(owner = "client!em", name = "C", descriptor = "I")
	private int anInt3052 = 0;

	@OriginalMember(owner = "client!em", name = "F", descriptor = "J")
	private long aLong101 = 0L;

	@OriginalMember(owner = "client!em", name = "D", descriptor = "I")
	private int anInt3053 = 0;

	@OriginalMember(owner = "client!em", name = "B", descriptor = "Z")
	private boolean aBoolean213 = true;

	@OriginalMember(owner = "client!em", name = "A", descriptor = "[Lclient!mh;")
	private Class2_Sub3[] aClass2_Sub3Array6 = new Class2_Sub3[8];

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(B)V")
	public final synchronized void method2439() {
		if (Static294.aClass163_1 != null) {
			@Pc(10) boolean local10 = true;
			for (@Pc(12) int local12 = 0; local12 < 2; local12++) {
				if (Static294.aClass163_1.aClass43Array1[local12] == this) {
					Static294.aClass163_1.aClass43Array1[local12] = null;
				}
				if (Static294.aClass163_1.aClass43Array1[local12] != null) {
					local10 = false;
				}
			}
			if (local10) {
				Static294.aClass163_1.aBoolean346 = true;
				while (Static294.aClass163_1.aBoolean345) {
					Static138.method2475(50L);
				}
				Static294.aClass163_1 = null;
			}
		}
		this.method2450();
		this.aBoolean212 = true;
		this.anIntArray304 = null;
	}

	@OriginalMember(owner = "client!em", name = "b", descriptor = "(I)V")
	public void method2441(@OriginalArg(0) int arg0) throws Exception {
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "()I")
	protected int method2442() throws Exception {
		return this.anInt3055;
	}

	@OriginalMember(owner = "client!em", name = "c", descriptor = "(I)V")
	public final void method2443() {
		this.aBoolean213 = true;
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(ILclient!mh;B)V")
	private void method2444(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub3 arg1) {
		@Pc(7) int local7 = arg0 >> 5;
		@Pc(17) Class2_Sub3 local17 = this.aClass2_Sub3Array6[local7];
		if (local17 == null) {
			this.aClass2_Sub3Array5[local7] = arg1;
		} else {
			local17.aClass2_Sub3_8 = arg1;
		}
		this.aClass2_Sub3Array6[local7] = arg1;
		arg1.anInt5944 = arg0;
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(Lclient!mh;Z)V")
	public final synchronized void method2445(@OriginalArg(0) Class2_Sub3 arg0) {
		this.aClass2_Sub3_7 = arg0;
	}

	@OriginalMember(owner = "client!em", name = "b", descriptor = "()V")
	protected void method2446() throws Exception {
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(Ljava/awt/Component;)V")
	public void method2447(@OriginalArg(0) Component arg0) throws Exception {
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(IB)V")
	private void method2448() {
		this.anInt3052 -= 256;
		if (this.anInt3052 < 0) {
			this.anInt3052 = 0;
		}
		if (this.aClass2_Sub3_7 != null) {
			this.aClass2_Sub3_7.method4650(256);
		}
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "([II)V")
	private void method2449(@OriginalArg(0) int[] arg0) {
		@Pc(1) short local1 = 256;
		if (Static49.aBoolean84) {
			local1 = 512;
		}
		Static323.method3549(arg0, 0, local1);
		this.anInt3052 -= 256;
		if (this.aClass2_Sub3_7 != null && this.anInt3052 <= 0) {
			this.anInt3052 += Static107.anInt2456 >> 4;
			Static199.method3560(this.aClass2_Sub3_7);
			this.method2444(this.aClass2_Sub3_7.method4655(), this.aClass2_Sub3_7);
			@Pc(45) int local45 = 0;
			@Pc(47) int local47 = 255;
			@Pc(49) int local49 = 7;
			label106: while (local47 != 0) {
				@Pc(57) int local57;
				@Pc(62) int local62;
				if (local49 < 0) {
					local57 = local49 & 0x3;
					local62 = -(local49 >> 2);
				} else {
					local57 = local49;
					local62 = 0;
				}
				for (@Pc(73) int local73 = local47 >>> local57 & 0x11111111; local73 != 0; local73 >>>= 0x4) {
					if ((local73 & 0x1) != 0) {
						local47 &= ~(0x1 << local57);
						@Pc(91) Class2_Sub3 local91 = null;
						@Pc(96) Class2_Sub3 local96 = this.aClass2_Sub3Array5[local57];
						label100: while (true) {
							while (true) {
								if (local96 == null) {
									break label100;
								}
								@Pc(101) Class2_Sub19 local101 = local96.aClass2_Sub19_5;
								if (local101 == null || local101.anInt3517 <= local62) {
									local96.aBoolean395 = true;
									@Pc(125) int local125 = local96.method4651();
									local45 += local125;
									if (local101 != null) {
										local101.anInt3517 += local125;
									}
									if (local45 >= this.anInt3033) {
										break label106;
									}
									@Pc(145) Class2_Sub3 local145 = local96.method4649();
									if (local145 != null) {
										@Pc(150) int local150 = local96.anInt5944;
										while (local145 != null) {
											this.method2444(local150 * local145.method4655() >> 8, local145);
											local145 = local96.method4654();
										}
									}
									@Pc(169) Class2_Sub3 local169 = local96.aClass2_Sub3_8;
									local96.aClass2_Sub3_8 = null;
									if (local91 == null) {
										this.aClass2_Sub3Array5[local57] = local169;
									} else {
										local91.aClass2_Sub3_8 = local169;
									}
									if (local169 == null) {
										this.aClass2_Sub3Array6[local57] = local91;
									}
									local96 = local169;
								} else {
									local47 |= 0x1 << local57;
									local91 = local96;
									local96 = local96.aClass2_Sub3_8;
								}
							}
						}
					}
					local57 += 4;
					local62++;
				}
				local49--;
			}
			for (local49 = 0; local49 < 8; local49++) {
				@Pc(212) Class2_Sub3 local212 = this.aClass2_Sub3Array5[local49];
				this.aClass2_Sub3Array5[local49] = this.aClass2_Sub3Array6[local49] = null;
				while (local212 != null) {
					@Pc(227) Class2_Sub3 local227 = local212.aClass2_Sub3_8;
					local212.aClass2_Sub3_8 = null;
					local212 = local227;
				}
			}
		}
		if (this.anInt3052 < 0) {
			this.anInt3052 = 0;
		}
		if (this.aClass2_Sub3_7 != null) {
			this.aClass2_Sub3_7.method4653(arg0, 0, 256);
		}
		this.aLong99 = Static221.method3670();
	}

	@OriginalMember(owner = "client!em", name = "c", descriptor = "()V")
	protected void method2450() {
	}

	@OriginalMember(owner = "client!em", name = "d", descriptor = "()V")
	protected void method2452() throws Exception {
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(Z)V")
	public final synchronized void method2453() {
		this.aBoolean213 = true;
		try {
			this.method2446();
		} catch (@Pc(6) Exception local6) {
			this.method2450();
			this.aLong100 = Static221.method3670() + 2000L;
		}
	}

	@OriginalMember(owner = "client!em", name = "b", descriptor = "(Z)V")
	public final synchronized void method2454() {
		if (this.aBoolean212) {
			return;
		}
		@Pc(12) long local12 = Static221.method3670();
		try {
			if (local12 > this.aLong99 + 500000L) {
				this.aLong99 = local12 - 500000L;
			}
			while (local12 > this.aLong99 + 5000L) {
				this.method2448();
				this.aLong99 += 256000 / Static107.anInt2456;
			}
		} catch (@Pc(53) Exception local53) {
			this.aLong99 = local12;
		}
		if (this.anIntArray304 == null) {
			return;
		}
		try {
			if (this.aLong100 != 0L) {
				if (local12 < this.aLong100) {
					return;
				}
				this.method2441(this.anInt3055);
				this.aBoolean213 = true;
				this.aLong100 = 0L;
			}
			@Pc(89) int local89 = this.method2442();
			@Pc(95) int local95 = this.anInt3050 + this.anInt3056;
			if (this.anInt3053 - local89 > this.anInt3054) {
				this.anInt3054 = this.anInt3053 - local89;
			}
			if (local95 + 256 > 16384) {
				local95 = 16128;
			}
			if (this.anInt3055 < local95 + 256) {
				this.anInt3055 += 1024;
				if (this.anInt3055 > 16384) {
					this.anInt3055 = 16384;
				}
				this.method2450();
				local89 = 0;
				this.method2441(this.anInt3055);
				this.aBoolean213 = true;
				if (local95 + 256 > this.anInt3055) {
					local95 = this.anInt3055 - 256;
					this.anInt3056 = local95 - this.anInt3050;
				}
			}
			while (local89 < local95) {
				this.method2449(this.anIntArray304);
				this.method2452();
				local89 += 256;
			}
			if (this.aLong101 < local12) {
				if (this.aBoolean213) {
					this.aBoolean213 = false;
				} else if (this.anInt3054 == 0 && this.anInt3051 == 0) {
					this.method2450();
					this.aLong100 = local12 + 2000L;
					return;
				} else {
					this.anInt3056 = Math.min(this.anInt3051, this.anInt3054);
					this.anInt3051 = this.anInt3054;
				}
				this.anInt3054 = 0;
				this.aLong101 = local12 + 2000L;
			}
			this.anInt3053 = local89;
		} catch (@Pc(250) Exception local250) {
			this.method2450();
			this.aLong100 = local12 + 2000L;
		}
	}
}
