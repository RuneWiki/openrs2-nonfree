import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mf")
public class Class30 {

	@OriginalMember(owner = "client!mf", name = "c", descriptor = "Lclient!ch;")
	private Class3_Sub3 aClass3_Sub3_7;

	@OriginalMember(owner = "client!mf", name = "x", descriptor = "[I")
	public int[] anIntArray596;

	@OriginalMember(owner = "client!mf", name = "B", descriptor = "I")
	private int anInt3501;

	@OriginalMember(owner = "client!mf", name = "C", descriptor = "I")
	public int anInt3502;

	@OriginalMember(owner = "client!mf", name = "D", descriptor = "I")
	public int anInt3503;

	@OriginalMember(owner = "client!mf", name = "b", descriptor = "I")
	private final int anInt3484 = 32;

	@OriginalMember(owner = "client!mf", name = "l", descriptor = "J")
	private long aLong115 = Static176.method3161();

	@OriginalMember(owner = "client!mf", name = "A", descriptor = "Z")
	private boolean aBoolean169 = true;

	@OriginalMember(owner = "client!mf", name = "H", descriptor = "I")
	private int anInt3506 = 0;

	@OriginalMember(owner = "client!mf", name = "J", descriptor = "I")
	private int anInt3507 = 0;

	@OriginalMember(owner = "client!mf", name = "F", descriptor = "J")
	private long aLong116 = 0L;

	@OriginalMember(owner = "client!mf", name = "L", descriptor = "I")
	private int anInt3508 = 0;

	@OriginalMember(owner = "client!mf", name = "K", descriptor = "[Lclient!ch;")
	private final Class3_Sub3[] aClass3_Sub3Array5 = new Class3_Sub3[8];

	@OriginalMember(owner = "client!mf", name = "E", descriptor = "I")
	private int anInt3504 = 0;

	@OriginalMember(owner = "client!mf", name = "I", descriptor = "J")
	private long aLong117 = 0L;

	@OriginalMember(owner = "client!mf", name = "M", descriptor = "[Lclient!ch;")
	private final Class3_Sub3[] aClass3_Sub3Array6 = new Class3_Sub3[8];

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(I)V")
	public final synchronized void method2670() {
		this.aBoolean169 = true;
		try {
			this.method2678();
		} catch (@Pc(16) Exception local16) {
			this.method2679();
			this.aLong116 = Static176.method3161() + 2000L;
		}
	}

	@OriginalMember(owner = "client!mf", name = "b", descriptor = "(I)V")
	public void method2672(@OriginalArg(0) int arg0) throws Exception {
	}

	@OriginalMember(owner = "client!mf", name = "b", descriptor = "(Z)V")
	public final synchronized void method2673() {
		if (Static9.aClass15_1 != null) {
			@Pc(5) boolean local5 = true;
			for (@Pc(7) int local7 = 0; local7 < 2; local7++) {
				if (Static9.aClass15_1.aClass30Array1[local7] == this) {
					Static9.aClass15_1.aClass30Array1[local7] = null;
				}
				if (Static9.aClass15_1.aClass30Array1[local7] != null) {
					local5 = false;
				}
			}
			if (local5) {
				Static9.aClass15_1.aBoolean36 = true;
				while (Static9.aClass15_1.aBoolean35) {
					Static65.method1574(50L);
				}
				Static9.aClass15_1 = null;
			}
		}
		this.method2679();
		this.anIntArray596 = null;
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(ILclient!ch;Z)V")
	private void method2675(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub3 arg1) {
		@Pc(7) int local7 = arg0 >> 5;
		@Pc(12) Class3_Sub3 local12 = this.aClass3_Sub3Array5[local7];
		if (local12 == null) {
			this.aClass3_Sub3Array6[local7] = arg1;
		} else {
			local12.aClass3_Sub3_8 = arg1;
		}
		this.aClass3_Sub3Array5[local7] = arg1;
		arg1.anInt3726 = arg0;
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(Lclient!ch;I)V")
	public final synchronized void method2676(@OriginalArg(0) Class3_Sub3 arg0) {
		this.aClass3_Sub3_7 = arg0;
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "()V")
	protected void method2678() throws Exception {
	}

	@OriginalMember(owner = "client!mf", name = "b", descriptor = "()V")
	protected void method2679() {
	}

	@OriginalMember(owner = "client!mf", name = "c", descriptor = "()V")
	protected void method2680() throws Exception {
	}

	@OriginalMember(owner = "client!mf", name = "c", descriptor = "(I)V")
	public final void method2681() {
		this.aBoolean169 = true;
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(Ljava/awt/Component;)V")
	public void method2682(@OriginalArg(0) Component arg0) throws Exception {
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "([II)V")
	private void method2684(@OriginalArg(0) int[] arg0) {
		@Pc(1) short local1 = 256;
		if (Static31.aBoolean51) {
			local1 = 512;
		}
		Static188.method2239(arg0, 0, local1);
		this.anInt3507 -= 256;
		if (this.aClass3_Sub3_7 != null && this.anInt3507 <= 0) {
			this.anInt3507 += Static96.anInt4194 >> 4;
			Static65.method1573(this.aClass3_Sub3_7);
			this.method2675(this.aClass3_Sub3_7.method2842(), this.aClass3_Sub3_7);
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
						@Pc(88) Class3_Sub3 local88 = null;
						@Pc(93) Class3_Sub3 local93 = this.aClass3_Sub3Array6[local56];
						label97: while (true) {
							while (true) {
								if (local93 == null) {
									break label97;
								}
								@Pc(97) Class3_Sub13 local97 = local93.aClass3_Sub13_5;
								if (local97 == null || local97.anInt2594 <= local61) {
									local93.aBoolean175 = true;
									@Pc(121) int local121 = local93.method2841();
									local45 += local121;
									if (local97 != null) {
										local97.anInt2594 += local121;
									}
									if (local45 >= this.anInt3484) {
										break label103;
									}
									@Pc(140) Class3_Sub3 local140 = local93.method2844();
									if (local140 != null) {
										@Pc(145) int local145 = local93.anInt3726;
										while (local140 != null) {
											this.method2675(local145 * local140.method2842() >> 8, local140);
											local140 = local93.method2843();
										}
									}
									@Pc(164) Class3_Sub3 local164 = local93.aClass3_Sub3_8;
									local93.aClass3_Sub3_8 = null;
									if (local88 == null) {
										this.aClass3_Sub3Array6[local56] = local164;
									} else {
										local88.aClass3_Sub3_8 = local164;
									}
									if (local164 == null) {
										this.aClass3_Sub3Array5[local56] = local88;
									}
									local93 = local164;
								} else {
									local47 |= 0x1 << local56;
									local88 = local93;
									local93 = local93.aClass3_Sub3_8;
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
				@Pc(207) Class3_Sub3 local207 = this.aClass3_Sub3Array6[local56];
				this.aClass3_Sub3Array6[local56] = this.aClass3_Sub3Array5[local56] = null;
				while (local207 != null) {
					@Pc(221) Class3_Sub3 local221 = local207.aClass3_Sub3_8;
					local207.aClass3_Sub3_8 = null;
					local207 = local221;
				}
			}
		}
		if (this.anInt3507 < 0) {
			this.anInt3507 = 0;
		}
		if (this.aClass3_Sub3_7 != null) {
			this.aClass3_Sub3_7.method2838(arg0, 0, 256);
		}
		this.aLong115 = Static176.method3161();
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(B)V")
	public final synchronized void method2685() {
		if (this.anIntArray596 == null) {
			return;
		}
		@Pc(10) long local10 = Static176.method3161();
		try {
			if (this.aLong116 != 0L) {
				if (this.aLong116 > local10) {
					return;
				}
				this.method2672(this.anInt3502);
				this.aBoolean169 = true;
				this.aLong116 = 0L;
			}
			@Pc(40) int local40 = this.method2686();
			if (this.anInt3508 - local40 > this.anInt3504) {
				this.anInt3504 = this.anInt3508 - local40;
			}
			@Pc(61) int local61 = this.anInt3503 + this.anInt3501;
			if (local61 + 256 > 16384) {
				local61 = 16128;
			}
			if (local61 + 256 > this.anInt3502) {
				this.anInt3502 += 1024;
				if (this.anInt3502 > 16384) {
					this.anInt3502 = 16384;
				}
				local40 = 0;
				this.method2679();
				this.method2672(this.anInt3502);
				this.aBoolean169 = true;
				if (local61 + 256 > this.anInt3502) {
					local61 = this.anInt3502 - 256;
					this.anInt3501 = local61 - this.anInt3503;
				}
			}
			while (local40 < local61) {
				this.method2684(this.anIntArray596);
				this.method2680();
				local40 += 256;
			}
			if (local10 > this.aLong117) {
				if (this.aBoolean169) {
					this.aBoolean169 = false;
				} else if (this.anInt3504 == 0 && this.anInt3506 == 0) {
					this.method2679();
					this.aLong116 = local10 + 2000L;
					return;
				} else {
					this.anInt3501 = Math.min(this.anInt3506, this.anInt3504);
					this.anInt3506 = this.anInt3504;
				}
				this.aLong117 = local10 + 2000L;
				this.anInt3504 = 0;
			}
			this.anInt3508 = local40;
		} catch (@Pc(196) Exception local196) {
			this.method2679();
			this.aLong116 = local10 + 2000L;
		}
		try {
			if (this.aLong115 + 500000L < local10) {
				local10 = this.aLong115;
			}
			while (local10 > this.aLong115 + 5000L) {
				this.method2687();
				this.aLong115 += 256000 / Static96.anInt4194;
			}
		} catch (@Pc(244) Exception local244) {
			this.aLong115 = local10;
		}
	}

	@OriginalMember(owner = "client!mf", name = "d", descriptor = "()I")
	protected int method2686() throws Exception {
		return this.anInt3502;
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(IZ)V")
	private void method2687() {
		this.anInt3507 -= 256;
		if (this.anInt3507 < 0) {
			this.anInt3507 = 0;
		}
		if (this.aClass3_Sub3_7 != null) {
			this.aClass3_Sub3_7.method2839(256);
		}
	}
}
