import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fe")
public class Class77 {

	@OriginalMember(owner = "client!fe", name = "j", descriptor = "Lclient!hf;")
	private Class1_Sub9 aClass1_Sub9_7;

	@OriginalMember(owner = "client!fe", name = "k", descriptor = "[I")
	public int[] anIntArray329;

	@OriginalMember(owner = "client!fe", name = "w", descriptor = "I")
	private int anInt5477;

	@OriginalMember(owner = "client!fe", name = "x", descriptor = "I")
	public int anInt5478;

	@OriginalMember(owner = "client!fe", name = "F", descriptor = "I")
	public int anInt5482;

	@OriginalMember(owner = "client!fe", name = "i", descriptor = "I")
	private final int anInt5469 = 32;

	@OriginalMember(owner = "client!fe", name = "o", descriptor = "Z")
	private boolean aBoolean443 = false;

	@OriginalMember(owner = "client!fe", name = "s", descriptor = "J")
	private long aLong166 = Static232.method3058();

	@OriginalMember(owner = "client!fe", name = "B", descriptor = "I")
	private int anInt5479 = 0;

	@OriginalMember(owner = "client!fe", name = "v", descriptor = "Z")
	private boolean aBoolean444 = true;

	@OriginalMember(owner = "client!fe", name = "E", descriptor = "I")
	private int anInt5481 = 0;

	@OriginalMember(owner = "client!fe", name = "D", descriptor = "I")
	private int anInt5480 = 0;

	@OriginalMember(owner = "client!fe", name = "H", descriptor = "J")
	private long aLong168 = 0L;

	@OriginalMember(owner = "client!fe", name = "G", descriptor = "I")
	private int anInt5483 = 0;

	@OriginalMember(owner = "client!fe", name = "y", descriptor = "J")
	private long aLong167 = 0L;

	@OriginalMember(owner = "client!fe", name = "I", descriptor = "[Lclient!hf;")
	private final Class1_Sub9[] aClass1_Sub9Array5 = new Class1_Sub9[8];

	@OriginalMember(owner = "client!fe", name = "J", descriptor = "[Lclient!hf;")
	private final Class1_Sub9[] aClass1_Sub9Array6 = new Class1_Sub9[8];

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(II)V")
	private void method4261() {
		this.anInt5479 -= 256;
		if (this.anInt5479 < 0) {
			this.anInt5479 = 0;
		}
		if (this.aClass1_Sub9_7 != null) {
			this.aClass1_Sub9_7.method4597(256);
		}
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "()V")
	protected void method4263() throws Exception {
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(I)V")
	public final synchronized void method4264() {
		if (this.aBoolean443) {
			return;
		}
		@Pc(12) long local12 = Static232.method3058();
		try {
			if (this.aLong166 + 500000L < local12) {
				this.aLong166 = local12 - 500000L;
			}
			while (this.aLong166 + 5000L < local12) {
				this.method4261();
				this.aLong166 += 256000 / Static155.anInt2607;
			}
		} catch (@Pc(58) Exception local58) {
			this.aLong166 = local12;
		}
		if (this.anIntArray329 == null) {
			return;
		}
		try {
			if (this.aLong167 != 0L) {
				if (local12 < this.aLong167) {
					return;
				}
				this.method4268(this.anInt5478);
				this.aBoolean444 = true;
				this.aLong167 = 0L;
			}
			@Pc(91) int local91 = this.method4275();
			if (this.anInt5480 < this.anInt5483 - local91) {
				this.anInt5480 = this.anInt5483 - local91;
			}
			@Pc(113) int local113 = this.anInt5482 + this.anInt5477;
			if (local113 + 256 > 16384) {
				local113 = 16128;
			}
			if (local113 + 256 > this.anInt5478) {
				this.anInt5478 += 1024;
				if (this.anInt5478 > 16384) {
					this.anInt5478 = 16384;
				}
				this.method4277();
				local91 = 0;
				this.method4268(this.anInt5478);
				if (this.anInt5478 < local113 + 256) {
					local113 = this.anInt5478 - 256;
					this.anInt5477 = local113 - this.anInt5482;
				}
				this.aBoolean444 = true;
			}
			while (local91 < local113) {
				this.method4270(this.anIntArray329);
				this.method4263();
				local91 += 256;
			}
			if (local12 > this.aLong168) {
				if (this.aBoolean444) {
					this.aBoolean444 = false;
				} else if (this.anInt5480 == 0 && this.anInt5481 == 0) {
					this.method4277();
					this.aLong167 = local12 + 2000L;
					return;
				} else {
					this.anInt5477 = Math.min(this.anInt5481, this.anInt5480);
					this.anInt5481 = this.anInt5480;
				}
				this.anInt5480 = 0;
				this.aLong168 = local12 + 2000L;
			}
			this.anInt5483 = local91;
		} catch (@Pc(246) Exception local246) {
			this.method4277();
			this.aLong167 = local12 + 2000L;
		}
	}

	@OriginalMember(owner = "client!fe", name = "b", descriptor = "(B)V")
	public final synchronized void method4265() {
		this.aBoolean444 = true;
		try {
			this.method4273();
		} catch (@Pc(10) Exception local10) {
			this.method4277();
			this.aLong167 = Static232.method3058() + 2000L;
		}
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(Z)V")
	public final void method4267() {
		this.aBoolean444 = true;
	}

	@OriginalMember(owner = "client!fe", name = "c", descriptor = "(I)V")
	public void method4268(@OriginalArg(0) int arg0) throws Exception {
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(Ljava/awt/Component;)V")
	public void method4269(@OriginalArg(0) Component arg0) throws Exception {
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "([II)V")
	private void method4270(@OriginalArg(0) int[] arg0) {
		@Pc(1) short local1 = 256;
		if (Static25.aBoolean39) {
			local1 = 512;
		}
		Static459.method2111(arg0, 0, local1);
		this.anInt5479 -= 256;
		if (this.aClass1_Sub9_7 != null && this.anInt5479 <= 0) {
			this.anInt5479 += Static155.anInt2607 >> 4;
			Static129.method1777(this.aClass1_Sub9_7);
			this.method4271(this.aClass1_Sub9_7.method4594(), this.aClass1_Sub9_7);
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
						@Pc(88) Class1_Sub9 local88 = null;
						@Pc(93) Class1_Sub9 local93 = this.aClass1_Sub9Array5[local56];
						label97: while (true) {
							while (true) {
								if (local93 == null) {
									break label97;
								}
								@Pc(97) Class1_Sub28 local97 = local93.aClass1_Sub28_5;
								if (local97 == null || local97.anInt4312 <= local61) {
									local93.aBoolean492 = true;
									@Pc(121) int local121 = local93.method4596();
									local45 += local121;
									if (local97 != null) {
										local97.anInt4312 += local121;
									}
									if (local45 >= this.anInt5469) {
										break label103;
									}
									@Pc(140) Class1_Sub9 local140 = local93.method4595();
									if (local140 != null) {
										@Pc(145) int local145 = local93.anInt5897;
										while (local140 != null) {
											this.method4271(local145 * local140.method4594() >> 8, local140);
											local140 = local93.method4591();
										}
									}
									@Pc(164) Class1_Sub9 local164 = local93.aClass1_Sub9_8;
									local93.aClass1_Sub9_8 = null;
									if (local88 == null) {
										this.aClass1_Sub9Array5[local56] = local164;
									} else {
										local88.aClass1_Sub9_8 = local164;
									}
									if (local164 == null) {
										this.aClass1_Sub9Array6[local56] = local88;
									}
									local93 = local164;
								} else {
									local47 |= 0x1 << local56;
									local88 = local93;
									local93 = local93.aClass1_Sub9_8;
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
				@Pc(207) Class1_Sub9 local207 = this.aClass1_Sub9Array5[local56];
				this.aClass1_Sub9Array5[local56] = this.aClass1_Sub9Array6[local56] = null;
				while (local207 != null) {
					@Pc(221) Class1_Sub9 local221 = local207.aClass1_Sub9_8;
					local207.aClass1_Sub9_8 = null;
					local207 = local221;
				}
			}
		}
		if (this.anInt5479 < 0) {
			this.anInt5479 = 0;
		}
		if (this.aClass1_Sub9_7 != null) {
			this.aClass1_Sub9_7.method4592(arg0, 0, 256);
		}
		this.aLong166 = Static232.method3058();
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(BILclient!hf;)V")
	private void method4271(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub9 arg1) {
		@Pc(15) int local15 = arg0 >> 5;
		@Pc(20) Class1_Sub9 local20 = this.aClass1_Sub9Array6[local15];
		if (local20 == null) {
			this.aClass1_Sub9Array5[local15] = arg1;
		} else {
			local20.aClass1_Sub9_8 = arg1;
		}
		this.aClass1_Sub9Array6[local15] = arg1;
		arg1.anInt5897 = arg0;
	}

	@OriginalMember(owner = "client!fe", name = "d", descriptor = "(I)V")
	public final synchronized void method4272() {
		if (Static413.aClass218_1 != null) {
			@Pc(9) boolean local9 = true;
			for (@Pc(11) int local11 = 0; local11 < 2; local11++) {
				if (Static413.aClass218_1.aClass77Array1[local11] == this) {
					Static413.aClass218_1.aClass77Array1[local11] = null;
				}
				if (Static413.aClass218_1.aClass77Array1[local11] != null) {
					local9 = false;
				}
			}
			if (local9) {
				Static413.aClass218_1.aBoolean490 = true;
				while (Static413.aClass218_1.aBoolean489) {
					Static252.method2874(50L);
				}
				Static413.aClass218_1 = null;
			}
		}
		this.method4277();
		this.anIntArray329 = null;
		this.aBoolean443 = true;
	}

	@OriginalMember(owner = "client!fe", name = "b", descriptor = "()V")
	protected void method4273() throws Exception {
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(ILclient!hf;)V")
	public final synchronized void method4274(@OriginalArg(1) Class1_Sub9 arg0) {
		this.aClass1_Sub9_7 = arg0;
	}

	@OriginalMember(owner = "client!fe", name = "c", descriptor = "()I")
	protected int method4275() throws Exception {
		return this.anInt5478;
	}

	@OriginalMember(owner = "client!fe", name = "d", descriptor = "()V")
	protected void method4277() {
	}
}
