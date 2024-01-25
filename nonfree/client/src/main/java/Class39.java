import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bl")
public class Class39 {

	@OriginalMember(owner = "client!bl", name = "l", descriptor = "Lclient!lea;")
	private Class2_Sub11 aClass2_Sub11_8;

	@OriginalMember(owner = "client!bl", name = "s", descriptor = "[I")
	public int[] anIntArray351;

	@OriginalMember(owner = "client!bl", name = "u", descriptor = "I")
	public int anInt5635;

	@OriginalMember(owner = "client!bl", name = "F", descriptor = "I")
	private int anInt5640;

	@OriginalMember(owner = "client!bl", name = "I", descriptor = "I")
	public int anInt5641;

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "I")
	private final int anInt5621 = 32;

	@OriginalMember(owner = "client!bl", name = "n", descriptor = "Z")
	private boolean aBoolean411 = false;

	@OriginalMember(owner = "client!bl", name = "g", descriptor = "J")
	private long aLong144 = Static48.method1203();

	@OriginalMember(owner = "client!bl", name = "v", descriptor = "I")
	private int anInt5636 = 0;

	@OriginalMember(owner = "client!bl", name = "y", descriptor = "[Lclient!lea;")
	private final Class2_Sub11[] aClass2_Sub11Array5 = new Class2_Sub11[8];

	@OriginalMember(owner = "client!bl", name = "w", descriptor = "I")
	private int anInt5637 = 0;

	@OriginalMember(owner = "client!bl", name = "B", descriptor = "J")
	private long aLong146 = 0L;

	@OriginalMember(owner = "client!bl", name = "x", descriptor = "J")
	private long aLong145 = 0L;

	@OriginalMember(owner = "client!bl", name = "D", descriptor = "I")
	private int anInt5639 = 0;

	@OriginalMember(owner = "client!bl", name = "z", descriptor = "[Lclient!lea;")
	private final Class2_Sub11[] aClass2_Sub11Array6 = new Class2_Sub11[8];

	@OriginalMember(owner = "client!bl", name = "A", descriptor = "I")
	private int anInt5638 = 0;

	@OriginalMember(owner = "client!bl", name = "J", descriptor = "Z")
	private boolean aBoolean412 = true;

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "()V")
	protected void method4889() throws Exception {
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(B)V")
	public final synchronized void method4890() {
		if (Static153.aClass45_1 != null) {
			@Pc(7) boolean local7 = true;
			for (@Pc(9) int local9 = 0; local9 < 2; local9++) {
				if (Static153.aClass45_1.aClass39Array1[local9] == this) {
					Static153.aClass45_1.aClass39Array1[local9] = null;
				}
				if (Static153.aClass45_1.aClass39Array1[local9] != null) {
					local7 = false;
				}
			}
			if (local7) {
				Static153.aClass45_1.aBoolean126 = true;
				while (Static153.aClass45_1.aBoolean125) {
					Static440.method6322(50L);
				}
				Static153.aClass45_1 = null;
			}
		}
		this.method4897();
		this.aBoolean411 = true;
		this.anIntArray351 = null;
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(Z)V")
	public final synchronized void method4891() {
		if (this.aBoolean411) {
			return;
		}
		@Pc(10) long local10 = Static48.method1203();
		try {
			if (this.aLong144 + 6000L < local10) {
				this.aLong144 = local10 - 6000L;
			}
			while (local10 > this.aLong144 + 5000L) {
				this.method4902();
				this.aLong144 += (long) (256000 / Static489.anInt8544);
				local10 = Static48.method1203();
			}
		} catch (@Pc(56) Exception local56) {
			this.aLong144 = local10;
		}
		if (this.anIntArray351 == null) {
			return;
		}
		try {
			if (this.aLong145 != 0L) {
				if (local10 < this.aLong145) {
					return;
				}
				this.method4893(this.anInt5635);
				this.aLong145 = 0L;
				this.aBoolean412 = true;
			}
			@Pc(87) int local87 = this.method4903();
			if (this.anInt5637 < this.anInt5636 - local87) {
				this.anInt5637 = this.anInt5636 - local87;
			}
			@Pc(108) int local108 = this.anInt5641 + this.anInt5640;
			if (local108 + 256 > 16384) {
				local108 = 16128;
			}
			if (this.anInt5635 < local108 + 256) {
				this.anInt5635 += 1024;
				if (this.anInt5635 > 16384) {
					this.anInt5635 = 16384;
				}
				this.method4897();
				local87 = 0;
				this.method4893(this.anInt5635);
				this.aBoolean412 = true;
				if (this.anInt5635 < local108 + 256) {
					local108 = this.anInt5635 - 256;
					this.anInt5640 = local108 - this.anInt5641;
				}
			}
			while (local108 > local87) {
				this.method4898(this.anIntArray351);
				local87 += 256;
				this.method4899();
			}
			if (local10 > this.aLong146) {
				if (this.aBoolean412) {
					this.aBoolean412 = false;
				} else if (this.anInt5637 == 0 && this.anInt5639 == 0) {
					this.method4897();
					this.aLong145 = local10 + 2000L;
					return;
				} else {
					this.anInt5640 = Math.min(this.anInt5639, this.anInt5637);
					this.anInt5639 = this.anInt5637;
				}
				this.anInt5637 = 0;
				this.aLong146 = local10 + 2000L;
			}
			this.anInt5636 = local87;
		} catch (@Pc(239) Exception local239) {
			this.method4897();
			this.aLong145 = local10 + 2000L;
		}
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(I)V")
	public void method4893(@OriginalArg(0) int arg0) throws Exception {
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(ILclient!lea;I)V")
	private void method4894(@OriginalArg(1) Class2_Sub11 arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = arg1 >> 5;
		@Pc(12) Class2_Sub11 local12 = this.aClass2_Sub11Array5[local7];
		if (local12 == null) {
			this.aClass2_Sub11Array6[local7] = arg0;
		} else {
			local12.aClass2_Sub11_9 = arg0;
		}
		this.aClass2_Sub11Array5[local7] = arg0;
		arg0.anInt7037 = arg1;
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(BLclient!lea;)V")
	public final synchronized void method4895(@OriginalArg(1) Class2_Sub11 arg0) {
		this.aClass2_Sub11_8 = arg0;
	}

	@OriginalMember(owner = "client!bl", name = "b", descriptor = "()V")
	protected void method4897() {
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "([II)V")
	private void method4898(@OriginalArg(0) int[] arg0) {
		@Pc(1) short local1 = 256;
		if (Static40.aBoolean75) {
			local1 = 512;
		}
		Static650.method2269(arg0, 0, local1);
		this.anInt5638 -= 256;
		if (this.aClass2_Sub11_8 != null && this.anInt5638 <= 0) {
			this.anInt5638 += Static489.anInt8544 >> 4;
			Static429.method8914(this.aClass2_Sub11_8);
			this.method4894(this.aClass2_Sub11_8, this.aClass2_Sub11_8.method6160());
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
						@Pc(88) Class2_Sub11 local88 = null;
						@Pc(93) Class2_Sub11 local93 = this.aClass2_Sub11Array6[local56];
						label97: while (true) {
							while (true) {
								if (local93 == null) {
									break label97;
								}
								@Pc(97) Class2_Sub14 local97 = local93.aClass2_Sub14_6;
								if (local97 == null || local97.anInt2195 <= local61) {
									local93.aBoolean501 = true;
									@Pc(121) int local121 = local93.method6161();
									local45 += local121;
									if (local97 != null) {
										local97.anInt2195 += local121;
									}
									if (local45 >= this.anInt5621) {
										break label103;
									}
									@Pc(140) Class2_Sub11 local140 = local93.method6156();
									if (local140 != null) {
										@Pc(145) int local145 = local93.anInt7037;
										while (local140 != null) {
											this.method4894(local140, local145 * local140.method6160() >> 8);
											local140 = local93.method6157();
										}
									}
									@Pc(164) Class2_Sub11 local164 = local93.aClass2_Sub11_9;
									local93.aClass2_Sub11_9 = null;
									if (local88 == null) {
										this.aClass2_Sub11Array6[local56] = local164;
									} else {
										local88.aClass2_Sub11_9 = local164;
									}
									if (local164 == null) {
										this.aClass2_Sub11Array5[local56] = local88;
									}
									local93 = local164;
								} else {
									local47 |= 0x1 << local56;
									local88 = local93;
									local93 = local93.aClass2_Sub11_9;
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
				@Pc(207) Class2_Sub11 local207 = this.aClass2_Sub11Array6[local56];
				this.aClass2_Sub11Array6[local56] = this.aClass2_Sub11Array5[local56] = null;
				while (local207 != null) {
					@Pc(221) Class2_Sub11 local221 = local207.aClass2_Sub11_9;
					local207.aClass2_Sub11_9 = null;
					local207 = local221;
				}
			}
		}
		if (this.anInt5638 < 0) {
			this.anInt5638 = 0;
		}
		if (this.aClass2_Sub11_8 != null) {
			this.aClass2_Sub11_8.method6155(arg0, 0, 256);
		}
		this.aLong144 = Static48.method1203();
	}

	@OriginalMember(owner = "client!bl", name = "c", descriptor = "()V")
	protected void method4899() throws Exception {
	}

	@OriginalMember(owner = "client!bl", name = "c", descriptor = "(Z)V")
	public final synchronized void method4900() {
		this.aBoolean412 = true;
		try {
			this.method4889();
		} catch (@Pc(14) Exception local14) {
			this.method4897();
			this.aLong145 = Static48.method1203() + 2000L;
		}
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(Ljava/awt/Component;)V")
	public void method4901(@OriginalArg(0) Component arg0) throws Exception {
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(II)V")
	private void method4902() {
		this.anInt5638 -= 256;
		if (this.anInt5638 < 0) {
			this.anInt5638 = 0;
		}
		if (this.aClass2_Sub11_8 != null) {
			this.aClass2_Sub11_8.method6159(256);
		}
	}

	@OriginalMember(owner = "client!bl", name = "d", descriptor = "()I")
	protected int method4903() throws Exception {
		return this.anInt5635;
	}
}
