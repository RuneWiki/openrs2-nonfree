import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ab")
public class Class3 {

	@OriginalMember(owner = "client!ab", name = "l", descriptor = "Lclient!ld;")
	private Class4_Sub12 aClass4_Sub12_7;

	@OriginalMember(owner = "client!ab", name = "q", descriptor = "[I")
	public int[] anIntArray309;

	@OriginalMember(owner = "client!ab", name = "y", descriptor = "I")
	public int anInt2196;

	@OriginalMember(owner = "client!ab", name = "F", descriptor = "I")
	private int anInt2201;

	@OriginalMember(owner = "client!ab", name = "I", descriptor = "I")
	public int anInt2203;

	@OriginalMember(owner = "client!ab", name = "r", descriptor = "I")
	private final int anInt2192 = 32;

	@OriginalMember(owner = "client!ab", name = "b", descriptor = "J")
	private long aLong72 = Static42.method793();

	@OriginalMember(owner = "client!ab", name = "B", descriptor = "I")
	private int anInt2198 = 0;

	@OriginalMember(owner = "client!ab", name = "C", descriptor = "[Lclient!ld;")
	private final Class4_Sub12[] aClass4_Sub12Array6 = new Class4_Sub12[8];

	@OriginalMember(owner = "client!ab", name = "A", descriptor = "I")
	private int anInt2197 = 0;

	@OriginalMember(owner = "client!ab", name = "z", descriptor = "[Lclient!ld;")
	private final Class4_Sub12[] aClass4_Sub12Array5 = new Class4_Sub12[8];

	@OriginalMember(owner = "client!ab", name = "H", descriptor = "J")
	private long aLong73 = 0L;

	@OriginalMember(owner = "client!ab", name = "D", descriptor = "I")
	private int anInt2199 = 0;

	@OriginalMember(owner = "client!ab", name = "E", descriptor = "I")
	private int anInt2200 = 0;

	@OriginalMember(owner = "client!ab", name = "O", descriptor = "Z")
	private boolean aBoolean132 = true;

	@OriginalMember(owner = "client!ab", name = "T", descriptor = "J")
	private long aLong74 = 0L;

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(B)V")
	public final void method1515() {
		this.aBoolean132 = true;
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "([II)V")
	private void method1516(@OriginalArg(0) int[] arg0) {
		@Pc(1) short local1 = 256;
		if (Static72.aBoolean117) {
			local1 = 512;
		}
		Static135.method110(arg0, 0, local1);
		this.anInt2199 -= 256;
		if (this.aClass4_Sub12_7 != null && this.anInt2199 <= 0) {
			this.anInt2199 += Static106.anInt2355 >> 4;
			Static21.method325(this.aClass4_Sub12_7);
			this.method1523(this.aClass4_Sub12_7, this.aClass4_Sub12_7.method1695());
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
						@Pc(88) Class4_Sub12 local88 = null;
						@Pc(93) Class4_Sub12 local93 = this.aClass4_Sub12Array6[local56];
						label97: while (true) {
							while (true) {
								if (local93 == null) {
									break label97;
								}
								@Pc(97) Class4_Sub6 local97 = local93.aClass4_Sub6_5;
								if (local97 == null || local97.anInt2131 <= local61) {
									local93.aBoolean142 = true;
									@Pc(121) int local121 = local93.method1691();
									local45 += local121;
									if (local97 != null) {
										local97.anInt2131 += local121;
									}
									if (local45 >= this.anInt2192) {
										break label103;
									}
									@Pc(140) Class4_Sub12 local140 = local93.method1696();
									if (local140 != null) {
										@Pc(145) int local145 = local93.anInt2425;
										while (local140 != null) {
											this.method1523(local140, local145 * local140.method1695() >> 8);
											local140 = local93.method1694();
										}
									}
									@Pc(164) Class4_Sub12 local164 = local93.aClass4_Sub12_8;
									local93.aClass4_Sub12_8 = null;
									if (local88 == null) {
										this.aClass4_Sub12Array6[local56] = local164;
									} else {
										local88.aClass4_Sub12_8 = local164;
									}
									if (local164 == null) {
										this.aClass4_Sub12Array5[local56] = local88;
									}
									local93 = local164;
								} else {
									local47 |= 0x1 << local56;
									local88 = local93;
									local93 = local93.aClass4_Sub12_8;
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
				@Pc(207) Class4_Sub12 local207 = this.aClass4_Sub12Array6[local56];
				this.aClass4_Sub12Array6[local56] = this.aClass4_Sub12Array5[local56] = null;
				while (local207 != null) {
					@Pc(221) Class4_Sub12 local221 = local207.aClass4_Sub12_8;
					local207.aClass4_Sub12_8 = null;
					local207 = local221;
				}
			}
		}
		if (this.anInt2199 < 0) {
			this.anInt2199 = 0;
		}
		if (this.aClass4_Sub12_7 != null) {
			this.aClass4_Sub12_7.method1697(arg0, 0, 256);
		}
		this.aLong72 = Static42.method793();
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "()V")
	protected void method1517() throws Exception {
	}

	@OriginalMember(owner = "client!ab", name = "b", descriptor = "(I)V")
	public final synchronized void method1522() {
		this.aBoolean132 = true;
		try {
			this.method1517();
		} catch (@Pc(15) Exception local15) {
			this.method1529();
			this.aLong74 = Static42.method793() + 2000L;
		}
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(Lclient!ld;IB)V")
	private void method1523(@OriginalArg(0) Class4_Sub12 arg0, @OriginalArg(1) int arg1) {
		@Pc(13) int local13 = arg1 >> 5;
		@Pc(18) Class4_Sub12 local18 = this.aClass4_Sub12Array5[local13];
		if (local18 == null) {
			this.aClass4_Sub12Array6[local13] = arg0;
		} else {
			local18.aClass4_Sub12_8 = arg0;
		}
		this.aClass4_Sub12Array5[local13] = arg0;
		arg0.anInt2425 = arg1;
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(II)V")
	private void method1524() {
		this.anInt2199 -= 256;
		if (this.anInt2199 < 0) {
			this.anInt2199 = 0;
		}
		if (this.aClass4_Sub12_7 != null) {
			this.aClass4_Sub12_7.method1693(256);
		}
	}

	@OriginalMember(owner = "client!ab", name = "b", descriptor = "()I")
	protected int method1525() throws Exception {
		return this.anInt2196;
	}

	@OriginalMember(owner = "client!ab", name = "c", descriptor = "(I)V")
	public void method1527(@OriginalArg(0) int arg0) throws Exception {
	}

	@OriginalMember(owner = "client!ab", name = "c", descriptor = "()V")
	protected void method1528() throws Exception {
	}

	@OriginalMember(owner = "client!ab", name = "d", descriptor = "()V")
	protected void method1529() {
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(Lclient!ld;Z)V")
	public final synchronized void method1530(@OriginalArg(0) Class4_Sub12 arg0) {
		this.aClass4_Sub12_7 = arg0;
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(Ljava/awt/Component;)V")
	public void method1531(@OriginalArg(0) Component arg0) throws Exception {
	}

	@OriginalMember(owner = "client!ab", name = "b", descriptor = "(B)V")
	public final synchronized void method1532() {
		if (this.anIntArray309 == null) {
			return;
		}
		@Pc(12) long local12 = Static42.method793();
		try {
			if (this.aLong74 != 0L) {
				if (local12 < this.aLong74) {
					return;
				}
				this.method1527(this.anInt2196);
				this.aLong74 = 0L;
				this.aBoolean132 = true;
			}
			@Pc(42) int local42 = this.method1525();
			@Pc(49) int local49 = this.anInt2203 + this.anInt2201;
			if (local49 + 256 > 16384) {
				local49 = 16128;
			}
			if (this.anInt2197 < this.anInt2198 - local42) {
				this.anInt2197 = this.anInt2198 - local42;
			}
			if (this.anInt2196 < local49 + 256) {
				local42 = 0;
				this.anInt2196 += 1024;
				if (this.anInt2196 > 16384) {
					this.anInt2196 = 16384;
				}
				this.method1529();
				this.method1527(this.anInt2196);
				this.aBoolean132 = true;
				if (local49 + 256 > this.anInt2196) {
					local49 = this.anInt2196 - 256;
					this.anInt2201 = local49 - this.anInt2203;
				}
			}
			while (local42 < local49) {
				this.method1516(this.anIntArray309);
				this.method1528();
				local42 += 256;
			}
			if (this.aLong73 < local12) {
				if (this.aBoolean132) {
					this.aBoolean132 = false;
				} else if (this.anInt2197 == 0 && this.anInt2200 == 0) {
					this.method1529();
					this.aLong74 = local12 + 2000L;
					return;
				} else {
					this.anInt2201 = Math.min(this.anInt2200, this.anInt2197);
					this.anInt2200 = this.anInt2197;
				}
				this.aLong73 = local12 + 2000L;
				this.anInt2197 = 0;
			}
			this.anInt2198 = local42;
		} catch (@Pc(204) Exception local204) {
			this.method1529();
			this.aLong74 = local12 + 2000L;
		}
		try {
			if (local12 > this.aLong72 + 500000L) {
				local12 = this.aLong72;
			}
			while (local12 > this.aLong72 + 5000L) {
				this.method1524();
				this.aLong72 += 256000 / Static106.anInt2355;
			}
		} catch (@Pc(245) Exception local245) {
			this.aLong72 = local12;
		}
	}

	@OriginalMember(owner = "client!ab", name = "d", descriptor = "(I)V")
	public final synchronized void method1533() {
		if (Static10.aClass37_1 != null) {
			@Pc(5) boolean local5 = true;
			for (@Pc(7) int local7 = 0; local7 < 2; local7++) {
				if (Static10.aClass37_1.aClass3Array1[local7] == this) {
					Static10.aClass37_1.aClass3Array1[local7] = null;
				}
				if (Static10.aClass37_1.aClass3Array1[local7] != null) {
					local5 = false;
				}
			}
			if (local5) {
				Static10.aClass37_1.aBoolean85 = true;
				while (Static10.aClass37_1.aBoolean86) {
					Static6.method84(50L);
				}
				Static10.aClass37_1 = null;
			}
		}
		this.method1529();
		this.anIntArray309 = null;
	}
}
