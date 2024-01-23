import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hk")
public class Class55 {

	@OriginalMember(owner = "client!hk", name = "i", descriptor = "[I")
	public int[] anIntArray320;

	@OriginalMember(owner = "client!hk", name = "q", descriptor = "Lclient!ta;")
	private Class1_Sub4 aClass1_Sub4_8;

	@OriginalMember(owner = "client!hk", name = "H", descriptor = "I")
	private int anInt4260;

	@OriginalMember(owner = "client!hk", name = "J", descriptor = "I")
	public int anInt4261;

	@OriginalMember(owner = "client!hk", name = "M", descriptor = "I")
	public int anInt4263;

	@OriginalMember(owner = "client!hk", name = "d", descriptor = "I")
	private int anInt4238 = 32;

	@OriginalMember(owner = "client!hk", name = "k", descriptor = "Z")
	private boolean aBoolean206 = false;

	@OriginalMember(owner = "client!hk", name = "h", descriptor = "J")
	private long aLong135 = Static31.method591();

	@OriginalMember(owner = "client!hk", name = "B", descriptor = "[Lclient!ta;")
	private Class1_Sub4[] aClass1_Sub4Array5 = new Class1_Sub4[8];

	@OriginalMember(owner = "client!hk", name = "E", descriptor = "J")
	private long aLong136 = 0L;

	@OriginalMember(owner = "client!hk", name = "I", descriptor = "Z")
	private boolean aBoolean207 = true;

	@OriginalMember(owner = "client!hk", name = "A", descriptor = "I")
	private int anInt4256 = 0;

	@OriginalMember(owner = "client!hk", name = "D", descriptor = "I")
	private int anInt4258 = 0;

	@OriginalMember(owner = "client!hk", name = "G", descriptor = "J")
	private long aLong137 = 0L;

	@OriginalMember(owner = "client!hk", name = "L", descriptor = "[Lclient!ta;")
	private Class1_Sub4[] aClass1_Sub4Array6 = new Class1_Sub4[8];

	@OriginalMember(owner = "client!hk", name = "N", descriptor = "I")
	private int anInt4264 = 0;

	@OriginalMember(owner = "client!hk", name = "K", descriptor = "I")
	private int anInt4262 = 0;

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(I)V")
	public final synchronized void method3203() {
		this.aBoolean207 = true;
		try {
			this.method3221();
		} catch (@Pc(16) Exception local16) {
			this.method3209();
			this.aLong136 = Static31.method591() + 2000L;
		}
	}

	@OriginalMember(owner = "client!hk", name = "b", descriptor = "(I)V")
	public final synchronized void method3205() {
		if (this.aBoolean206) {
			return;
		}
		@Pc(12) long local12 = Static31.method591();
		try {
			if (local12 > this.aLong135 + 500000L) {
				this.aLong135 = local12 - 500000L;
			}
			while (this.aLong135 + 5000L < local12) {
				this.method3212();
				this.aLong135 += 256000 / Static107.anInt2862;
			}
		} catch (@Pc(52) Exception local52) {
			this.aLong135 = local12;
		}
		if (this.anIntArray320 == null) {
			return;
		}
		try {
			if (this.aLong136 != 0L) {
				if (this.aLong136 > local12) {
					return;
				}
				this.method3206(this.anInt4261);
				this.aLong136 = 0L;
				this.aBoolean207 = true;
			}
			@Pc(89) int local89 = this.method3214();
			@Pc(95) int local95 = this.anInt4260 + this.anInt4263;
			if (this.anInt4264 < this.anInt4262 - local89) {
				this.anInt4264 = this.anInt4262 - local89;
			}
			if (local95 + 256 > 16384) {
				local95 = 16128;
			}
			if (local95 + 256 > this.anInt4261) {
				this.anInt4261 += 1024;
				if (this.anInt4261 > 16384) {
					this.anInt4261 = 16384;
				}
				local89 = 0;
				this.method3209();
				this.method3206(this.anInt4261);
				this.aBoolean207 = true;
				if (local95 + 256 > this.anInt4261) {
					local95 = this.anInt4261 - 256;
					this.anInt4260 = local95 - this.anInt4263;
				}
			}
			while (local95 > local89) {
				local89 += 256;
				this.method3222(this.anIntArray320);
				this.method3211();
			}
			if (this.aLong137 < local12) {
				if (this.aBoolean207) {
					this.aBoolean207 = false;
				} else if (this.anInt4264 == 0 && this.anInt4256 == 0) {
					this.method3209();
					this.aLong136 = local12 + 2000L;
					return;
				} else {
					this.anInt4260 = Math.min(this.anInt4256, this.anInt4264);
					this.anInt4256 = this.anInt4264;
				}
				this.anInt4264 = 0;
				this.aLong137 = local12 + 2000L;
			}
			this.anInt4262 = local89;
		} catch (@Pc(244) Exception local244) {
			this.method3209();
			this.aLong136 = local12 + 2000L;
		}
	}

	@OriginalMember(owner = "client!hk", name = "c", descriptor = "(I)V")
	public void method3206(@OriginalArg(0) int arg0) throws Exception {
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "()V")
	protected void method3209() {
	}

	@OriginalMember(owner = "client!hk", name = "b", descriptor = "()V")
	protected void method3211() throws Exception {
	}

	@OriginalMember(owner = "client!hk", name = "b", descriptor = "(II)V")
	private void method3212() {
		this.anInt4258 -= 256;
		if (this.anInt4258 < 0) {
			this.anInt4258 = 0;
		}
		if (this.aClass1_Sub4_8 != null) {
			this.aClass1_Sub4_8.method3074(256);
		}
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(Ljava/awt/Component;)V")
	public void method3213(@OriginalArg(0) Component arg0) throws Exception {
	}

	@OriginalMember(owner = "client!hk", name = "c", descriptor = "()I")
	protected int method3214() throws Exception {
		return this.anInt4261;
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(BLclient!ta;)V")
	public final synchronized void method3216(@OriginalArg(1) Class1_Sub4 arg0) {
		this.aClass1_Sub4_8 = arg0;
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(B)V")
	public final void method3217() {
		this.aBoolean207 = true;
	}

	@OriginalMember(owner = "client!hk", name = "g", descriptor = "(I)V")
	public final synchronized void method3219() {
		if (Static164.aClass42_1 != null) {
			@Pc(5) boolean local5 = true;
			for (@Pc(7) int local7 = 0; local7 < 2; local7++) {
				if (Static164.aClass42_1.aClass55Array1[local7] == this) {
					Static164.aClass42_1.aClass55Array1[local7] = null;
				}
				if (Static164.aClass42_1.aClass55Array1[local7] != null) {
					local5 = false;
				}
			}
			if (local5) {
				Static164.aClass42_1.aBoolean105 = true;
				while (Static164.aClass42_1.aBoolean104) {
					Static30.method587(50L);
				}
				Static164.aClass42_1 = null;
			}
		}
		this.method3209();
		this.anIntArray320 = null;
		this.aBoolean206 = true;
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(Lclient!ta;IB)V")
	private void method3220(@OriginalArg(0) Class1_Sub4 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg1 >> 5;
		@Pc(17) Class1_Sub4 local17 = this.aClass1_Sub4Array6[local12];
		if (local17 == null) {
			this.aClass1_Sub4Array5[local12] = arg0;
		} else {
			local17.aClass1_Sub4_7 = arg0;
		}
		this.aClass1_Sub4Array6[local12] = arg0;
		arg0.anInt4102 = arg1;
	}

	@OriginalMember(owner = "client!hk", name = "d", descriptor = "()V")
	protected void method3221() throws Exception {
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "([II)V")
	private void method3222(@OriginalArg(0) int[] arg0) {
		@Pc(1) short local1 = 256;
		if (Static121.aBoolean167) {
			local1 = 512;
		}
		Static274.method2687(arg0, 0, local1);
		this.anInt4258 -= 256;
		if (this.aClass1_Sub4_8 != null && this.anInt4258 <= 0) {
			this.anInt4258 += Static107.anInt2862 >> 4;
			Static248.method4051(this.aClass1_Sub4_8);
			this.method3220(this.aClass1_Sub4_8, this.aClass1_Sub4_8.method3071());
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
						@Pc(88) Class1_Sub4 local88 = null;
						@Pc(93) Class1_Sub4 local93 = this.aClass1_Sub4Array5[local56];
						label97: while (true) {
							while (true) {
								if (local93 == null) {
									break label97;
								}
								@Pc(97) Class1_Sub7 local97 = local93.aClass1_Sub7_5;
								if (local97 == null || local97.anInt1532 <= local61) {
									local93.aBoolean201 = true;
									@Pc(121) int local121 = local93.method3076();
									local45 += local121;
									if (local97 != null) {
										local97.anInt1532 += local121;
									}
									if (local45 >= this.anInt4238) {
										break label103;
									}
									@Pc(140) Class1_Sub4 local140 = local93.method3073();
									if (local140 != null) {
										@Pc(145) int local145 = local93.anInt4102;
										while (local140 != null) {
											this.method3220(local140, local145 * local140.method3071() >> 8);
											local140 = local93.method3075();
										}
									}
									@Pc(164) Class1_Sub4 local164 = local93.aClass1_Sub4_7;
									local93.aClass1_Sub4_7 = null;
									if (local88 == null) {
										this.aClass1_Sub4Array5[local56] = local164;
									} else {
										local88.aClass1_Sub4_7 = local164;
									}
									if (local164 == null) {
										this.aClass1_Sub4Array6[local56] = local88;
									}
									local93 = local164;
								} else {
									local47 |= 0x1 << local56;
									local88 = local93;
									local93 = local93.aClass1_Sub4_7;
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
				@Pc(207) Class1_Sub4 local207 = this.aClass1_Sub4Array5[local56];
				this.aClass1_Sub4Array5[local56] = this.aClass1_Sub4Array6[local56] = null;
				while (local207 != null) {
					@Pc(221) Class1_Sub4 local221 = local207.aClass1_Sub4_7;
					local207.aClass1_Sub4_7 = null;
					local207 = local221;
				}
			}
		}
		if (this.anInt4258 < 0) {
			this.anInt4258 = 0;
		}
		if (this.aClass1_Sub4_8 != null) {
			this.aClass1_Sub4_8.method3072(arg0, 0, 256);
		}
		this.aLong135 = Static31.method591();
	}
}
