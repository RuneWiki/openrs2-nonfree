import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bh")
public class Class15 {

	@OriginalMember(owner = "client!bh", name = "h", descriptor = "Lclient!jc;")
	private Class1_Sub12 aClass1_Sub12_7;

	@OriginalMember(owner = "client!bh", name = "x", descriptor = "[I")
	public int[] anIntArray305;

	@OriginalMember(owner = "client!bh", name = "J", descriptor = "I")
	public int anInt3490;

	@OriginalMember(owner = "client!bh", name = "K", descriptor = "I")
	private int anInt3491;

	@OriginalMember(owner = "client!bh", name = "N", descriptor = "I")
	public int anInt3492;

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "I")
	private final int anInt3466 = 32;

	@OriginalMember(owner = "client!bh", name = "u", descriptor = "J")
	private long aLong188 = Static124.method1828();

	@OriginalMember(owner = "client!bh", name = "A", descriptor = "I")
	private int anInt3485 = 0;

	@OriginalMember(owner = "client!bh", name = "z", descriptor = "Z")
	private boolean aBoolean193 = true;

	@OriginalMember(owner = "client!bh", name = "H", descriptor = "I")
	private int anInt3488 = 0;

	@OriginalMember(owner = "client!bh", name = "C", descriptor = "J")
	private long aLong189 = 0L;

	@OriginalMember(owner = "client!bh", name = "G", descriptor = "J")
	private long aLong190 = 0L;

	@OriginalMember(owner = "client!bh", name = "M", descriptor = "[Lclient!jc;")
	private final Class1_Sub12[] aClass1_Sub12Array6 = new Class1_Sub12[8];

	@OriginalMember(owner = "client!bh", name = "D", descriptor = "I")
	private int anInt3486 = 0;

	@OriginalMember(owner = "client!bh", name = "F", descriptor = "I")
	private int anInt3487 = 0;

	@OriginalMember(owner = "client!bh", name = "L", descriptor = "[Lclient!jc;")
	private final Class1_Sub12[] aClass1_Sub12Array5 = new Class1_Sub12[8];

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(Z)V")
	public final synchronized void method2609() {
		this.aBoolean193 = true;
		try {
			this.method2623();
		} catch (@Pc(10) Exception local10) {
			this.method2624();
			this.aLong189 = Static124.method1828() + 2000L;
		}
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(Lclient!jc;IB)V")
	private void method2612(@OriginalArg(0) Class1_Sub12 arg0, @OriginalArg(1) int arg1) {
		@Pc(7) int local7 = arg1 >> 5;
		@Pc(16) Class1_Sub12 local16 = this.aClass1_Sub12Array6[local7];
		if (local16 == null) {
			this.aClass1_Sub12Array5[local7] = arg0;
		} else {
			local16.aClass1_Sub12_8 = arg0;
		}
		this.aClass1_Sub12Array6[local7] = arg0;
		arg0.anInt3708 = arg1;
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(B)V")
	public final void method2613() {
		this.aBoolean193 = true;
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(IZ)V")
	private void method2614() {
		this.anInt3488 -= 256;
		if (this.anInt3488 < 0) {
			this.anInt3488 = 0;
		}
		if (this.aClass1_Sub12_7 != null) {
			this.aClass1_Sub12_7.method2757(256);
		}
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "()V")
	protected void method2616() throws Exception {
	}

	@OriginalMember(owner = "client!bh", name = "b", descriptor = "(Z)V")
	public final synchronized void method2617() {
		if (Static21.aClass56_1 != null) {
			@Pc(5) boolean local5 = true;
			for (@Pc(7) int local7 = 0; local7 < 2; local7++) {
				if (Static21.aClass56_1.aClass15Array1[local7] == this) {
					Static21.aClass56_1.aClass15Array1[local7] = null;
				}
				if (Static21.aClass56_1.aClass15Array1[local7] != null) {
					local5 = false;
				}
			}
			if (local5) {
				Static21.aClass56_1.aBoolean136 = true;
				while (Static21.aClass56_1.aBoolean135) {
					Static199.method3292(50L);
				}
				Static21.aClass56_1 = null;
			}
		}
		this.method2624();
		this.anIntArray305 = null;
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "([II)V")
	private void method2619(@OriginalArg(0) int[] arg0) {
		@Pc(1) short local1 = 256;
		if (Static151.aBoolean177) {
			local1 = 512;
		}
		Static216.method2199(arg0, 0, local1);
		this.anInt3488 -= 256;
		if (this.aClass1_Sub12_7 != null && this.anInt3488 <= 0) {
			this.anInt3488 += Static96.anInt2009 >> 4;
			Static79.method1209(this.aClass1_Sub12_7);
			this.method2612(this.aClass1_Sub12_7, this.aClass1_Sub12_7.method2758());
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
						@Pc(88) Class1_Sub12 local88 = null;
						@Pc(93) Class1_Sub12 local93 = this.aClass1_Sub12Array5[local56];
						label97: while (true) {
							while (true) {
								if (local93 == null) {
									break label97;
								}
								@Pc(97) Class1_Sub22 local97 = local93.aClass1_Sub22_5;
								if (local97 == null || local97.anInt3125 <= local61) {
									local93.aBoolean206 = true;
									@Pc(121) int local121 = local93.method2756();
									local45 += local121;
									if (local97 != null) {
										local97.anInt3125 += local121;
									}
									if (local45 >= this.anInt3466) {
										break label103;
									}
									@Pc(140) Class1_Sub12 local140 = local93.method2754();
									if (local140 != null) {
										@Pc(145) int local145 = local93.anInt3708;
										while (local140 != null) {
											this.method2612(local140, local145 * local140.method2758() >> 8);
											local140 = local93.method2755();
										}
									}
									@Pc(164) Class1_Sub12 local164 = local93.aClass1_Sub12_8;
									local93.aClass1_Sub12_8 = null;
									if (local88 == null) {
										this.aClass1_Sub12Array5[local56] = local164;
									} else {
										local88.aClass1_Sub12_8 = local164;
									}
									if (local164 == null) {
										this.aClass1_Sub12Array6[local56] = local88;
									}
									local93 = local164;
								} else {
									local47 |= 0x1 << local56;
									local88 = local93;
									local93 = local93.aClass1_Sub12_8;
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
				@Pc(207) Class1_Sub12 local207 = this.aClass1_Sub12Array5[local56];
				this.aClass1_Sub12Array5[local56] = this.aClass1_Sub12Array6[local56] = null;
				while (local207 != null) {
					@Pc(221) Class1_Sub12 local221 = local207.aClass1_Sub12_8;
					local207.aClass1_Sub12_8 = null;
					local207 = local221;
				}
			}
		}
		if (this.anInt3488 < 0) {
			this.anInt3488 = 0;
		}
		if (this.aClass1_Sub12_7 != null) {
			this.aClass1_Sub12_7.method2753(arg0, 0, 256);
		}
		this.aLong188 = Static124.method1828();
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(Ljava/awt/Component;)V")
	public void method2620(@OriginalArg(0) Component arg0) throws Exception {
	}

	@OriginalMember(owner = "client!bh", name = "b", descriptor = "(I)V")
	public void method2621(@OriginalArg(0) int arg0) throws Exception {
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(Lclient!jc;Z)V")
	public final synchronized void method2622(@OriginalArg(0) Class1_Sub12 arg0) {
		this.aClass1_Sub12_7 = arg0;
	}

	@OriginalMember(owner = "client!bh", name = "b", descriptor = "()V")
	protected void method2623() throws Exception {
	}

	@OriginalMember(owner = "client!bh", name = "c", descriptor = "()V")
	protected void method2624() {
	}

	@OriginalMember(owner = "client!bh", name = "d", descriptor = "()I")
	protected int method2626() throws Exception {
		return this.anInt3490;
	}

	@OriginalMember(owner = "client!bh", name = "d", descriptor = "(I)V")
	public final synchronized void method2627() {
		if (this.anIntArray305 == null) {
			return;
		}
		@Pc(12) long local12 = Static124.method1828();
		try {
			if (this.aLong189 != 0L) {
				if (local12 < this.aLong189) {
					return;
				}
				this.method2621(this.anInt3490);
				this.aBoolean193 = true;
				this.aLong189 = 0L;
			}
			@Pc(46) int local46 = this.method2626();
			@Pc(52) int local52 = this.anInt3492 + this.anInt3491;
			if (local52 + 256 > 16384) {
				local52 = 16128;
			}
			if (this.anInt3487 - local46 > this.anInt3485) {
				this.anInt3485 = this.anInt3487 - local46;
			}
			if (this.anInt3490 < local52 + 256) {
				this.anInt3490 += 1024;
				local46 = 0;
				if (this.anInt3490 > 16384) {
					this.anInt3490 = 16384;
				}
				this.method2624();
				this.method2621(this.anInt3490);
				if (local52 + 256 > this.anInt3490) {
					local52 = this.anInt3490 - 256;
					this.anInt3491 = local52 - this.anInt3492;
				}
				this.aBoolean193 = true;
			}
			while (local52 > local46) {
				local46 += 256;
				this.method2619(this.anIntArray305);
				this.method2616();
			}
			if (local12 > this.aLong190) {
				if (this.aBoolean193) {
					this.aBoolean193 = false;
				} else if (this.anInt3485 == 0 && this.anInt3486 == 0) {
					this.method2624();
					this.aLong189 = local12 + 2000L;
					return;
				} else {
					this.anInt3491 = Math.min(this.anInt3486, this.anInt3485);
					this.anInt3486 = this.anInt3485;
				}
				this.aLong190 = local12 + 2000L;
				this.anInt3485 = 0;
			}
			this.anInt3487 = local46;
		} catch (@Pc(184) Exception local184) {
			this.method2624();
			this.aLong189 = local12 + 2000L;
		}
		try {
			if (this.aLong188 + 500000L < local12) {
				local12 = this.aLong188;
			}
			while (local12 > this.aLong188 + 5000L) {
				this.method2614();
				this.aLong188 += 256000 / Static96.anInt2009;
			}
		} catch (@Pc(229) Exception local229) {
			this.aLong188 = local12;
		}
	}
}
