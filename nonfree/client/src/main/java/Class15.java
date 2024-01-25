import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aq")
public class Class15 {

	@OriginalMember(owner = "client!aq", name = "g", descriptor = "Lclient!mi;")
	private Class7_Sub8 aClass7_Sub8_7;

	@OriginalMember(owner = "client!aq", name = "v", descriptor = "[I")
	public int[] anIntArray674;

	@OriginalMember(owner = "client!aq", name = "w", descriptor = "I")
	public int anInt5248;

	@OriginalMember(owner = "client!aq", name = "x", descriptor = "I")
	public int anInt5249;

	@OriginalMember(owner = "client!aq", name = "A", descriptor = "I")
	private int anInt5251;

	@OriginalMember(owner = "client!aq", name = "e", descriptor = "Z")
	private boolean aBoolean389 = false;

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "I")
	private final int anInt5231 = 32;

	@OriginalMember(owner = "client!aq", name = "t", descriptor = "J")
	private long aLong170 = Static335.method5308();

	@OriginalMember(owner = "client!aq", name = "y", descriptor = "[Lclient!mi;")
	private final Class7_Sub8[] aClass7_Sub8Array5 = new Class7_Sub8[8];

	@OriginalMember(owner = "client!aq", name = "D", descriptor = "[Lclient!mi;")
	private final Class7_Sub8[] aClass7_Sub8Array6 = new Class7_Sub8[8];

	@OriginalMember(owner = "client!aq", name = "z", descriptor = "I")
	private int anInt5250 = 0;

	@OriginalMember(owner = "client!aq", name = "H", descriptor = "J")
	private long aLong171 = 0L;

	@OriginalMember(owner = "client!aq", name = "B", descriptor = "I")
	private int anInt5252 = 0;

	@OriginalMember(owner = "client!aq", name = "E", descriptor = "I")
	private int anInt5254 = 0;

	@OriginalMember(owner = "client!aq", name = "F", descriptor = "I")
	private int anInt5255 = 0;

	@OriginalMember(owner = "client!aq", name = "I", descriptor = "J")
	private long aLong172 = 0L;

	@OriginalMember(owner = "client!aq", name = "K", descriptor = "Z")
	private boolean aBoolean390 = true;

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(I)V")
	public final synchronized void method4455() {
		if (this.aBoolean389) {
			return;
		}
		@Pc(14) long local14 = Static335.method5308();
		try {
			if (this.aLong170 + 500000L < local14) {
				this.aLong170 = local14 - 500000L;
			}
			while (local14 > this.aLong170 + 5000L) {
				this.method4468();
				this.aLong170 += 256000 / Static172.anInt2667;
			}
		} catch (@Pc(57) Exception local57) {
			this.aLong170 = local14;
		}
		if (this.anIntArray674 == null) {
			return;
		}
		try {
			if (this.aLong172 != 0L) {
				if (this.aLong172 > local14) {
					return;
				}
				this.method4470(this.anInt5249);
				this.aBoolean390 = true;
				this.aLong172 = 0L;
			}
			@Pc(88) int local88 = this.method4460();
			if (this.anInt5252 < this.anInt5255 - local88) {
				this.anInt5252 = this.anInt5255 - local88;
			}
			@Pc(113) int local113 = this.anInt5248 + this.anInt5251;
			if (local113 + 256 > 16384) {
				local113 = 16128;
			}
			if (local113 + 256 > this.anInt5249) {
				this.anInt5249 += 1024;
				if (this.anInt5249 > 16384) {
					this.anInt5249 = 16384;
				}
				this.method4457();
				this.method4470(this.anInt5249);
				local88 = 0;
				this.aBoolean390 = true;
				if (this.anInt5249 < local113 + 256) {
					local113 = this.anInt5249 - 256;
					this.anInt5251 = local113 - this.anInt5248;
				}
			}
			while (local88 < local113) {
				this.method4471(this.anIntArray674);
				local88 += 256;
				this.method4458();
			}
			if (local14 > this.aLong171) {
				if (this.aBoolean390) {
					this.aBoolean390 = false;
				} else if (this.anInt5252 == 0 && this.anInt5254 == 0) {
					this.method4457();
					this.aLong172 = local14 + 2000L;
					return;
				} else {
					this.anInt5251 = Math.min(this.anInt5254, this.anInt5252);
					this.anInt5254 = this.anInt5252;
				}
				this.aLong171 = local14 + 2000L;
				this.anInt5252 = 0;
			}
			this.anInt5255 = local88;
		} catch (@Pc(250) Exception local250) {
			this.method4457();
			this.aLong172 = local14 + 2000L;
		}
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "()V")
	protected void method4457() {
	}

	@OriginalMember(owner = "client!aq", name = "b", descriptor = "()V")
	protected void method4458() throws Exception {
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(IILclient!mi;)V")
	private void method4459(@OriginalArg(1) int arg0, @OriginalArg(2) Class7_Sub8 arg1) {
		@Pc(7) int local7 = arg0 >> 5;
		@Pc(12) Class7_Sub8 local12 = this.aClass7_Sub8Array5[local7];
		if (local12 == null) {
			this.aClass7_Sub8Array6[local7] = arg1;
		} else {
			local12.aClass7_Sub8_8 = arg1;
		}
		this.aClass7_Sub8Array5[local7] = arg1;
		arg1.anInt5850 = arg0;
	}

	@OriginalMember(owner = "client!aq", name = "c", descriptor = "()I")
	protected int method4460() throws Exception {
		return this.anInt5249;
	}

	@OriginalMember(owner = "client!aq", name = "b", descriptor = "(I)V")
	public final synchronized void method4461() {
		if (Static202.aClass133_1 != null) {
			@Pc(10) boolean local10 = true;
			for (@Pc(12) int local12 = 0; local12 < 2; local12++) {
				if (Static202.aClass133_1.aClass15Array1[local12] == this) {
					Static202.aClass133_1.aClass15Array1[local12] = null;
				}
				if (Static202.aClass133_1.aClass15Array1[local12] != null) {
					local10 = false;
				}
			}
			if (local10) {
				Static202.aClass133_1.aBoolean295 = true;
				while (Static202.aClass133_1.aBoolean296) {
					Static129.method2634(50L);
				}
				Static202.aClass133_1 = null;
			}
		}
		this.method4457();
		this.aBoolean389 = true;
		this.anIntArray674 = null;
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(Z)V")
	public final synchronized void method4462() {
		this.aBoolean390 = true;
		try {
			this.method4467();
		} catch (@Pc(10) Exception local10) {
			this.method4457();
			this.aLong172 = Static335.method5308() + 2000L;
		}
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(Lclient!mi;I)V")
	public final synchronized void method4465(@OriginalArg(0) Class7_Sub8 arg0) {
		this.aClass7_Sub8_7 = arg0;
	}

	@OriginalMember(owner = "client!aq", name = "c", descriptor = "(I)V")
	public final void method4466() {
		this.aBoolean390 = true;
	}

	@OriginalMember(owner = "client!aq", name = "d", descriptor = "()V")
	protected void method4467() throws Exception {
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(II)V")
	private void method4468() {
		this.anInt5250 -= 256;
		if (this.anInt5250 < 0) {
			this.anInt5250 = 0;
		}
		if (this.aClass7_Sub8_7 != null) {
			this.aClass7_Sub8_7.method4936(256);
		}
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(Ljava/awt/Component;)V")
	public void method4469(@OriginalArg(0) Component arg0) throws Exception {
	}

	@OriginalMember(owner = "client!aq", name = "d", descriptor = "(I)V")
	public void method4470(@OriginalArg(0) int arg0) throws Exception {
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "([II)V")
	private void method4471(@OriginalArg(0) int[] arg0) {
		@Pc(1) short local1 = 256;
		if (Static103.aBoolean170) {
			local1 = 512;
		}
		Static366.method4205(arg0, 0, local1);
		this.anInt5250 -= 256;
		if (this.aClass7_Sub8_7 != null && this.anInt5250 <= 0) {
			this.anInt5250 += Static172.anInt2667 >> 4;
			Static313.method5070(this.aClass7_Sub8_7);
			this.method4459(this.aClass7_Sub8_7.method4931(), this.aClass7_Sub8_7);
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
						@Pc(88) Class7_Sub8 local88 = null;
						@Pc(93) Class7_Sub8 local93 = this.aClass7_Sub8Array6[local56];
						label97: while (true) {
							while (true) {
								if (local93 == null) {
									break label97;
								}
								@Pc(97) Class7_Sub20 local97 = local93.aClass7_Sub20_5;
								if (local97 == null || local97.anInt3464 <= local61) {
									local93.aBoolean427 = true;
									@Pc(121) int local121 = local93.method4935();
									local45 += local121;
									if (local97 != null) {
										local97.anInt3464 += local121;
									}
									if (local45 >= this.anInt5231) {
										break label103;
									}
									@Pc(140) Class7_Sub8 local140 = local93.method4932();
									if (local140 != null) {
										@Pc(145) int local145 = local93.anInt5850;
										while (local140 != null) {
											this.method4459(local145 * local140.method4931() >> 8, local140);
											local140 = local93.method4930();
										}
									}
									@Pc(164) Class7_Sub8 local164 = local93.aClass7_Sub8_8;
									local93.aClass7_Sub8_8 = null;
									if (local88 == null) {
										this.aClass7_Sub8Array6[local56] = local164;
									} else {
										local88.aClass7_Sub8_8 = local164;
									}
									if (local164 == null) {
										this.aClass7_Sub8Array5[local56] = local88;
									}
									local93 = local164;
								} else {
									local47 |= 0x1 << local56;
									local88 = local93;
									local93 = local93.aClass7_Sub8_8;
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
				@Pc(207) Class7_Sub8 local207 = this.aClass7_Sub8Array6[local56];
				this.aClass7_Sub8Array6[local56] = this.aClass7_Sub8Array5[local56] = null;
				while (local207 != null) {
					@Pc(221) Class7_Sub8 local221 = local207.aClass7_Sub8_8;
					local207.aClass7_Sub8_8 = null;
					local207 = local221;
				}
			}
		}
		if (this.anInt5250 < 0) {
			this.anInt5250 = 0;
		}
		if (this.aClass7_Sub8_7 != null) {
			this.aClass7_Sub8_7.method4934(arg0, 0, 256);
		}
		this.aLong170 = Static335.method5308();
	}
}
