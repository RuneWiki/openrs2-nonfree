import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ue")
public class Class85 {

	@OriginalMember(owner = "client!ue", name = "d", descriptor = "Lclient!oe;")
	private Class2_Sub2 aClass2_Sub2_7;

	@OriginalMember(owner = "client!ue", name = "g", descriptor = "[I")
	public int[] anIntArray923;

	@OriginalMember(owner = "client!ue", name = "A", descriptor = "I")
	private int anInt4792;

	@OriginalMember(owner = "client!ue", name = "B", descriptor = "I")
	public int anInt4793;

	@OriginalMember(owner = "client!ue", name = "I", descriptor = "I")
	public int anInt4796;

	@OriginalMember(owner = "client!ue", name = "b", descriptor = "Z")
	private boolean aBoolean358 = false;

	@OriginalMember(owner = "client!ue", name = "n", descriptor = "I")
	private final int anInt4783 = 32;

	@OriginalMember(owner = "client!ue", name = "u", descriptor = "J")
	private long aLong156 = Static39.method699();

	@OriginalMember(owner = "client!ue", name = "C", descriptor = "J")
	private long aLong157 = 0L;

	@OriginalMember(owner = "client!ue", name = "E", descriptor = "I")
	private int anInt4795 = 0;

	@OriginalMember(owner = "client!ue", name = "D", descriptor = "I")
	private int anInt4794 = 0;

	@OriginalMember(owner = "client!ue", name = "F", descriptor = "J")
	private long aLong158 = 0L;

	@OriginalMember(owner = "client!ue", name = "H", descriptor = "[Lclient!oe;")
	private final Class2_Sub2[] aClass2_Sub2Array6 = new Class2_Sub2[8];

	@OriginalMember(owner = "client!ue", name = "G", descriptor = "[Lclient!oe;")
	private final Class2_Sub2[] aClass2_Sub2Array5 = new Class2_Sub2[8];

	@OriginalMember(owner = "client!ue", name = "K", descriptor = "I")
	private int anInt4797 = 0;

	@OriginalMember(owner = "client!ue", name = "L", descriptor = "I")
	private int anInt4798 = 0;

	@OriginalMember(owner = "client!ue", name = "J", descriptor = "Z")
	private boolean aBoolean360 = true;

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(Z)V")
	public final synchronized void method4213() {
		this.aBoolean360 = true;
		try {
			this.method4217();
		} catch (@Pc(16) Exception local16) {
			this.method4214();
			this.aLong157 = Static39.method699() + 2000L;
		}
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "()V")
	protected void method4214() {
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(I)V")
	public final synchronized void method4215() {
		if (Static307.aClass57_1 != null) {
			@Pc(5) boolean local5 = true;
			for (@Pc(7) int local7 = 0; local7 < 2; local7++) {
				if (Static307.aClass57_1.aClass85Array1[local7] == this) {
					Static307.aClass57_1.aClass85Array1[local7] = null;
				}
				if (Static307.aClass57_1.aClass85Array1[local7] != null) {
					local5 = false;
				}
			}
			if (local5) {
				Static307.aClass57_1.aBoolean106 = true;
				while (Static307.aClass57_1.aBoolean107) {
					Static358.method2028(50L);
				}
				Static307.aClass57_1 = null;
			}
		}
		this.method4214();
		this.aBoolean358 = true;
		this.anIntArray923 = null;
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(B)V")
	public final synchronized void method4216() {
		if (this.aBoolean358) {
			return;
		}
		@Pc(18) long local18 = Static39.method699();
		try {
			if (this.aLong156 + 500000L < local18) {
				this.aLong156 = local18 - 500000L;
			}
			while (this.aLong156 + 5000L < local18) {
				this.method4227();
				this.aLong156 += 256000 / Static42.anInt4820;
			}
		} catch (@Pc(58) Exception local58) {
			this.aLong156 = local18;
		}
		if (this.anIntArray923 == null) {
			return;
		}
		try {
			if (this.aLong157 != 0L) {
				if (local18 < this.aLong157) {
					return;
				}
				this.method4225(this.anInt4793);
				this.aBoolean360 = true;
				this.aLong157 = 0L;
			}
			@Pc(95) int local95 = this.method4220();
			if (this.anInt4795 < this.anInt4798 - local95) {
				this.anInt4795 = this.anInt4798 - local95;
			}
			@Pc(120) int local120 = this.anInt4792 + this.anInt4796;
			if (local120 + 256 > 16384) {
				local120 = 16128;
			}
			if (local120 + 256 > this.anInt4793) {
				this.anInt4793 += 1024;
				if (this.anInt4793 > 16384) {
					this.anInt4793 = 16384;
				}
				this.method4214();
				local95 = 0;
				this.method4225(this.anInt4793);
				if (local120 + 256 > this.anInt4793) {
					local120 = this.anInt4793 - 256;
					this.anInt4792 = local120 - this.anInt4796;
				}
				this.aBoolean360 = true;
			}
			while (local95 < local120) {
				this.method4228(this.anIntArray923);
				this.method4218();
				local95 += 256;
			}
			if (local18 > this.aLong158) {
				if (this.aBoolean360) {
					this.aBoolean360 = false;
				} else if (this.anInt4795 == 0 && this.anInt4797 == 0) {
					this.method4214();
					this.aLong157 = local18 + 2000L;
					return;
				} else {
					this.anInt4792 = Math.min(this.anInt4797, this.anInt4795);
					this.anInt4797 = this.anInt4795;
				}
				this.anInt4795 = 0;
				this.aLong158 = local18 + 2000L;
			}
			this.anInt4798 = local95;
		} catch (@Pc(253) Exception local253) {
			this.method4214();
			this.aLong157 = local18 + 2000L;
		}
	}

	@OriginalMember(owner = "client!ue", name = "b", descriptor = "()V")
	protected void method4217() throws Exception {
	}

	@OriginalMember(owner = "client!ue", name = "c", descriptor = "()V")
	protected void method4218() throws Exception {
	}

	@OriginalMember(owner = "client!ue", name = "d", descriptor = "()I")
	protected int method4220() throws Exception {
		return this.anInt4793;
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(Ljava/awt/Component;)V")
	public void method4221(@OriginalArg(0) Component arg0) throws Exception {
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(Lclient!oe;IB)V")
	private void method4222(@OriginalArg(0) Class2_Sub2 arg0, @OriginalArg(1) int arg1) {
		@Pc(15) int local15 = arg1 >> 5;
		@Pc(20) Class2_Sub2 local20 = this.aClass2_Sub2Array5[local15];
		if (local20 == null) {
			this.aClass2_Sub2Array6[local15] = arg0;
		} else {
			local20.aClass2_Sub2_8 = arg0;
		}
		this.aClass2_Sub2Array5[local15] = arg0;
		arg0.anInt6057 = arg1;
	}

	@OriginalMember(owner = "client!ue", name = "c", descriptor = "(B)V")
	public final void method4224() {
		this.aBoolean360 = true;
	}

	@OriginalMember(owner = "client!ue", name = "c", descriptor = "(I)V")
	public void method4225(@OriginalArg(0) int arg0) throws Exception {
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(Lclient!oe;B)V")
	public final synchronized void method4226(@OriginalArg(0) Class2_Sub2 arg0) {
		this.aClass2_Sub2_7 = arg0;
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(II)V")
	private void method4227() {
		this.anInt4794 -= 256;
		if (this.anInt4794 < 0) {
			this.anInt4794 = 0;
		}
		if (this.aClass2_Sub2_7 != null) {
			this.aClass2_Sub2_7.method5271(256);
		}
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "([II)V")
	private void method4228(@OriginalArg(0) int[] arg0) {
		@Pc(1) short local1 = 256;
		if (Static44.aBoolean66) {
			local1 = 512;
		}
		Static399.method2488(arg0, 0, local1);
		this.anInt4794 -= 256;
		if (this.aClass2_Sub2_7 != null && this.anInt4794 <= 0) {
			this.anInt4794 += Static42.anInt4820 >> 4;
			Static74.method1194(this.aClass2_Sub2_7);
			this.method4222(this.aClass2_Sub2_7, this.aClass2_Sub2_7.method5265());
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
						@Pc(88) Class2_Sub2 local88 = null;
						@Pc(93) Class2_Sub2 local93 = this.aClass2_Sub2Array6[local56];
						label97: while (true) {
							while (true) {
								if (local93 == null) {
									break label97;
								}
								@Pc(97) Class2_Sub15 local97 = local93.aClass2_Sub15_5;
								if (local97 == null || local97.anInt4952 <= local61) {
									local93.aBoolean436 = true;
									@Pc(121) int local121 = local93.method5267();
									local45 += local121;
									if (local97 != null) {
										local97.anInt4952 += local121;
									}
									if (local45 >= this.anInt4783) {
										break label103;
									}
									@Pc(140) Class2_Sub2 local140 = local93.method5266();
									if (local140 != null) {
										@Pc(145) int local145 = local93.anInt6057;
										while (local140 != null) {
											this.method4222(local140, local145 * local140.method5265() >> 8);
											local140 = local93.method5268();
										}
									}
									@Pc(164) Class2_Sub2 local164 = local93.aClass2_Sub2_8;
									local93.aClass2_Sub2_8 = null;
									if (local88 == null) {
										this.aClass2_Sub2Array6[local56] = local164;
									} else {
										local88.aClass2_Sub2_8 = local164;
									}
									if (local164 == null) {
										this.aClass2_Sub2Array5[local56] = local88;
									}
									local93 = local164;
								} else {
									local47 |= 0x1 << local56;
									local88 = local93;
									local93 = local93.aClass2_Sub2_8;
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
				@Pc(207) Class2_Sub2 local207 = this.aClass2_Sub2Array6[local56];
				this.aClass2_Sub2Array6[local56] = this.aClass2_Sub2Array5[local56] = null;
				while (local207 != null) {
					@Pc(221) Class2_Sub2 local221 = local207.aClass2_Sub2_8;
					local207.aClass2_Sub2_8 = null;
					local207 = local221;
				}
			}
		}
		if (this.anInt4794 < 0) {
			this.anInt4794 = 0;
		}
		if (this.aClass2_Sub2_7 != null) {
			this.aClass2_Sub2_7.method5269(arg0, 0, 256);
		}
		this.aLong156 = Static39.method699();
	}
}
