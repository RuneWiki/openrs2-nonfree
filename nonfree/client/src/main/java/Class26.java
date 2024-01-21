import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ib")
public class Class26 {

	@OriginalMember(owner = "client!ib", name = "f", descriptor = "Lclient!md;")
	private Class4_Sub1 aClass4_Sub1_8;

	@OriginalMember(owner = "client!ib", name = "l", descriptor = "[I")
	public int[] anIntArray278;

	@OriginalMember(owner = "client!ib", name = "y", descriptor = "I")
	private int anInt2472;

	@OriginalMember(owner = "client!ib", name = "K", descriptor = "I")
	public int anInt2480;

	@OriginalMember(owner = "client!ib", name = "L", descriptor = "I")
	public int anInt2481;

	@OriginalMember(owner = "client!ib", name = "k", descriptor = "I")
	private final int anInt2463 = 32;

	@OriginalMember(owner = "client!ib", name = "p", descriptor = "J")
	private long aLong120 = Static23.method431();

	@OriginalMember(owner = "client!ib", name = "s", descriptor = "J")
	private long aLong121 = 0L;

	@OriginalMember(owner = "client!ib", name = "x", descriptor = "Z")
	private boolean aBoolean120 = true;

	@OriginalMember(owner = "client!ib", name = "A", descriptor = "[Lclient!md;")
	private final Class4_Sub1[] aClass4_Sub1Array5 = new Class4_Sub1[8];

	@OriginalMember(owner = "client!ib", name = "C", descriptor = "[Lclient!md;")
	private final Class4_Sub1[] aClass4_Sub1Array6 = new Class4_Sub1[8];

	@OriginalMember(owner = "client!ib", name = "D", descriptor = "J")
	private long aLong122 = 0L;

	@OriginalMember(owner = "client!ib", name = "G", descriptor = "I")
	private int anInt2477 = 0;

	@OriginalMember(owner = "client!ib", name = "H", descriptor = "I")
	private int anInt2478 = 0;

	@OriginalMember(owner = "client!ib", name = "F", descriptor = "I")
	private int anInt2476 = 0;

	@OriginalMember(owner = "client!ib", name = "w", descriptor = "I")
	private int anInt2471 = 0;

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "()I")
	protected int method1795() throws Exception {
		return this.anInt2481;
	}

	@OriginalMember(owner = "client!ib", name = "b", descriptor = "()V")
	protected void method1796() throws Exception {
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(I)V")
	public void method1797(@OriginalArg(0) int arg0) throws Exception {
	}

	@OriginalMember(owner = "client!ib", name = "b", descriptor = "(I)V")
	public final synchronized void method1798() {
		if (Static8.aClass31_1 != null) {
			@Pc(5) boolean local5 = true;
			for (@Pc(7) int local7 = 0; local7 < 2; local7++) {
				if (Static8.aClass31_1.aClass26Array1[local7] == this) {
					Static8.aClass31_1.aClass26Array1[local7] = null;
				}
				if (Static8.aClass31_1.aClass26Array1[local7] != null) {
					local5 = false;
				}
			}
			if (local5) {
				Static8.aClass31_1.aBoolean46 = true;
				while (Static8.aClass31_1.aBoolean45) {
					Static125.method2177(50L);
				}
				Static8.aClass31_1 = null;
			}
		}
		this.method1804();
		this.anIntArray278 = null;
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(B)V")
	public final void method1799() {
		this.aBoolean120 = true;
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "([II)V")
	private void method1800(@OriginalArg(0) int[] arg0) {
		@Pc(1) short local1 = 256;
		if (Static7.aBoolean9) {
			local1 = 512;
		}
		Static134.method1169(arg0, 0, local1);
		this.anInt2476 -= 256;
		if (this.aClass4_Sub1_8 != null && this.anInt2476 <= 0) {
			this.anInt2476 += Static123.anInt3048 >> 4;
			Static101.method1815(this.aClass4_Sub1_8);
			this.method1801(this.aClass4_Sub1_8.method1537(), this.aClass4_Sub1_8);
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
						@Pc(88) Class4_Sub1 local88 = null;
						@Pc(93) Class4_Sub1 local93 = this.aClass4_Sub1Array5[local56];
						label97: while (true) {
							while (true) {
								if (local93 == null) {
									break label97;
								}
								@Pc(97) Class4_Sub6 local97 = local93.aClass4_Sub6_5;
								if (local97 == null || local97.anInt1654 <= local61) {
									local93.aBoolean107 = true;
									@Pc(121) int local121 = local93.method1535();
									local45 += local121;
									if (local97 != null) {
										local97.anInt1654 += local121;
									}
									if (local45 >= this.anInt2463) {
										break label103;
									}
									@Pc(140) Class4_Sub1 local140 = local93.method1532();
									if (local140 != null) {
										@Pc(145) int local145 = local93.anInt2138;
										while (local140 != null) {
											this.method1801(local145 * local140.method1537() >> 8, local140);
											local140 = local93.method1536();
										}
									}
									@Pc(164) Class4_Sub1 local164 = local93.aClass4_Sub1_7;
									local93.aClass4_Sub1_7 = null;
									if (local88 == null) {
										this.aClass4_Sub1Array5[local56] = local164;
									} else {
										local88.aClass4_Sub1_7 = local164;
									}
									if (local164 == null) {
										this.aClass4_Sub1Array6[local56] = local88;
									}
									local93 = local164;
								} else {
									local47 |= 0x1 << local56;
									local88 = local93;
									local93 = local93.aClass4_Sub1_7;
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
				@Pc(207) Class4_Sub1 local207 = this.aClass4_Sub1Array5[local56];
				this.aClass4_Sub1Array5[local56] = this.aClass4_Sub1Array6[local56] = null;
				while (local207 != null) {
					@Pc(221) Class4_Sub1 local221 = local207.aClass4_Sub1_7;
					local207.aClass4_Sub1_7 = null;
					local207 = local221;
				}
			}
		}
		if (this.anInt2476 < 0) {
			this.anInt2476 = 0;
		}
		if (this.aClass4_Sub1_8 != null) {
			this.aClass4_Sub1_8.method1533(arg0, 0, 256);
		}
		this.aLong120 = Static23.method431();
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(BILclient!md;)V")
	private void method1801(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub1 arg1) {
		@Pc(3) int local3 = arg0 >> 5;
		@Pc(12) Class4_Sub1 local12 = this.aClass4_Sub1Array6[local3];
		if (local12 == null) {
			this.aClass4_Sub1Array5[local3] = arg1;
		} else {
			local12.aClass4_Sub1_7 = arg1;
		}
		this.aClass4_Sub1Array6[local3] = arg1;
		arg1.anInt2138 = arg0;
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(II)V")
	private void method1802() {
		this.anInt2476 -= 256;
		if (this.anInt2476 < 0) {
			this.anInt2476 = 0;
		}
		if (this.aClass4_Sub1_8 != null) {
			this.aClass4_Sub1_8.method1534(256);
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(Lclient!md;I)V")
	public final synchronized void method1803(@OriginalArg(0) Class4_Sub1 arg0) {
		this.aClass4_Sub1_8 = arg0;
	}

	@OriginalMember(owner = "client!ib", name = "c", descriptor = "()V")
	protected void method1804() {
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(Z)V")
	public final synchronized void method1805() {
		if (this.anIntArray278 == null) {
			return;
		}
		@Pc(12) long local12 = Static23.method431();
		try {
			if (this.aLong121 != 0L) {
				if (this.aLong121 > local12) {
					return;
				}
				this.method1797(this.anInt2481);
				this.aBoolean120 = true;
				this.aLong121 = 0L;
			}
			@Pc(42) int local42 = this.method1795();
			if (this.anInt2477 < this.anInt2478 - local42) {
				this.anInt2477 = this.anInt2478 - local42;
			}
			@Pc(66) int local66 = this.anInt2472 + this.anInt2480;
			if (local66 + 256 > 16384) {
				local66 = 16128;
			}
			if (local66 + 256 > this.anInt2481) {
				this.anInt2481 += 1024;
				local42 = 0;
				if (this.anInt2481 > 16384) {
					this.anInt2481 = 16384;
				}
				this.method1804();
				this.method1797(this.anInt2481);
				this.aBoolean120 = true;
				if (this.anInt2481 < local66 + 256) {
					local66 = this.anInt2481 - 256;
					this.anInt2472 = local66 - this.anInt2480;
				}
			}
			while (local42 < local66) {
				this.method1800(this.anIntArray278);
				this.method1806();
				local42 += 256;
			}
			if (local12 > this.aLong122) {
				if (this.aBoolean120) {
					this.aBoolean120 = false;
				} else if (this.anInt2477 == 0 && this.anInt2471 == 0) {
					this.method1804();
					this.aLong121 = local12 + 2000L;
					return;
				} else {
					this.anInt2472 = Math.min(this.anInt2471, this.anInt2477);
					this.anInt2471 = this.anInt2477;
				}
				this.anInt2477 = 0;
				this.aLong122 = local12 + 2000L;
			}
			this.anInt2478 = local42;
		} catch (@Pc(196) Exception local196) {
			this.method1804();
			this.aLong121 = local12 + 2000L;
		}
		try {
			if (local12 > this.aLong120 + 500000L) {
				local12 = this.aLong120;
			}
			while (this.aLong120 + 5000L < local12) {
				this.method1802();
				this.aLong120 += 256000 / Static123.anInt3048;
			}
		} catch (@Pc(241) Exception local241) {
			this.aLong120 = local12;
		}
	}

	@OriginalMember(owner = "client!ib", name = "d", descriptor = "()V")
	protected void method1806() throws Exception {
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(Ljava/awt/Component;)V")
	public void method1808(@OriginalArg(0) Component arg0) throws Exception {
	}

	@OriginalMember(owner = "client!ib", name = "d", descriptor = "(I)V")
	public final synchronized void method1809() {
		this.aBoolean120 = true;
		try {
			this.method1796();
		} catch (@Pc(6) Exception local6) {
			this.method1804();
			this.aLong121 = Static23.method431() + 2000L;
		}
	}
}
