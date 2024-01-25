import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wg")
public class Class2 {

	@OriginalMember(owner = "client!wg", name = "c", descriptor = "[I")
	public int[] anIntArray18;

	@OriginalMember(owner = "client!wg", name = "l", descriptor = "Lclient!cb;")
	private Class6_Sub4 aClass6_Sub4_3;

	@OriginalMember(owner = "client!wg", name = "u", descriptor = "I")
	public int anInt414;

	@OriginalMember(owner = "client!wg", name = "B", descriptor = "I")
	public int anInt421;

	@OriginalMember(owner = "client!wg", name = "D", descriptor = "I")
	private int anInt422;

	@OriginalMember(owner = "client!wg", name = "b", descriptor = "I")
	private final int anInt403 = 32;

	@OriginalMember(owner = "client!wg", name = "g", descriptor = "Z")
	private boolean aBoolean15 = false;

	@OriginalMember(owner = "client!wg", name = "f", descriptor = "J")
	private long aLong22 = Static449.method6552();

	@OriginalMember(owner = "client!wg", name = "s", descriptor = "J")
	private long aLong23 = 0L;

	@OriginalMember(owner = "client!wg", name = "v", descriptor = "I")
	private int anInt415 = 0;

	@OriginalMember(owner = "client!wg", name = "t", descriptor = "[Lclient!cb;")
	private final Class6_Sub4[] aClass6_Sub4Array5 = new Class6_Sub4[8];

	@OriginalMember(owner = "client!wg", name = "q", descriptor = "Z")
	private boolean aBoolean16 = true;

	@OriginalMember(owner = "client!wg", name = "E", descriptor = "J")
	private long aLong24 = 0L;

	@OriginalMember(owner = "client!wg", name = "z", descriptor = "I")
	private int anInt419 = 0;

	@OriginalMember(owner = "client!wg", name = "C", descriptor = "[Lclient!cb;")
	private final Class6_Sub4[] aClass6_Sub4Array6 = new Class6_Sub4[8];

	@OriginalMember(owner = "client!wg", name = "A", descriptor = "I")
	private int anInt420 = 0;

	@OriginalMember(owner = "client!wg", name = "G", descriptor = "I")
	private int anInt424 = 0;

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(I)V")
	public void method349(@OriginalArg(0) int arg0) throws Exception {
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "()V")
	protected void method350() throws Exception {
	}

	@OriginalMember(owner = "client!wg", name = "b", descriptor = "()I")
	protected int method351() throws Exception {
		return this.anInt414;
	}

	@OriginalMember(owner = "client!wg", name = "b", descriptor = "(I)V")
	public final synchronized void method352() {
		if (Static295.aClass65_2 != null) {
			@Pc(5) boolean local5 = true;
			for (@Pc(7) int local7 = 0; local7 < 2; local7++) {
				if (Static295.aClass65_2.aClass2Array1[local7] == this) {
					Static295.aClass65_2.aClass2Array1[local7] = null;
				}
				if (Static295.aClass65_2.aClass2Array1[local7] != null) {
					local5 = false;
				}
			}
			if (local5) {
				Static295.aClass65_2.aBoolean146 = true;
				while (Static295.aClass65_2.aBoolean145) {
					Static88.method4161(50L);
				}
				Static295.aClass65_2 = null;
			}
		}
		this.method364();
		this.aBoolean15 = true;
		this.anIntArray18 = null;
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "([II)V")
	private void method353(@OriginalArg(0) int[] arg0) {
		@Pc(1) short local1 = 256;
		if (Static314.aBoolean348) {
			local1 = 512;
		}
		Static459.method6340(arg0, 0, local1);
		this.anInt419 -= 256;
		if (this.aClass6_Sub4_3 != null && this.anInt419 <= 0) {
			this.anInt419 += Static275.anInt4927 >> 4;
			Static60.method1326(this.aClass6_Sub4_3);
			this.method359(this.aClass6_Sub4_3.method5902(), this.aClass6_Sub4_3);
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
						@Pc(88) Class6_Sub4 local88 = null;
						@Pc(93) Class6_Sub4 local93 = this.aClass6_Sub4Array5[local56];
						label97: while (true) {
							while (true) {
								if (local93 == null) {
									break label97;
								}
								@Pc(97) Class6_Sub17 local97 = local93.aClass6_Sub17_5;
								if (local97 == null || local97.anInt3085 <= local61) {
									local93.aBoolean457 = true;
									@Pc(121) int local121 = local93.method5900();
									local45 += local121;
									if (local97 != null) {
										local97.anInt3085 += local121;
									}
									if (local45 >= this.anInt403) {
										break label103;
									}
									@Pc(140) Class6_Sub4 local140 = local93.method5904();
									if (local140 != null) {
										@Pc(145) int local145 = local93.anInt7166;
										while (local140 != null) {
											this.method359(local145 * local140.method5902() >> 8, local140);
											local140 = local93.method5901();
										}
									}
									@Pc(164) Class6_Sub4 local164 = local93.aClass6_Sub4_8;
									local93.aClass6_Sub4_8 = null;
									if (local88 == null) {
										this.aClass6_Sub4Array5[local56] = local164;
									} else {
										local88.aClass6_Sub4_8 = local164;
									}
									if (local164 == null) {
										this.aClass6_Sub4Array6[local56] = local88;
									}
									local93 = local164;
								} else {
									local47 |= 0x1 << local56;
									local88 = local93;
									local93 = local93.aClass6_Sub4_8;
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
				@Pc(207) Class6_Sub4 local207 = this.aClass6_Sub4Array5[local56];
				this.aClass6_Sub4Array5[local56] = this.aClass6_Sub4Array6[local56] = null;
				while (local207 != null) {
					@Pc(221) Class6_Sub4 local221 = local207.aClass6_Sub4_8;
					local207.aClass6_Sub4_8 = null;
					local207 = local221;
				}
			}
		}
		if (this.anInt419 < 0) {
			this.anInt419 = 0;
		}
		if (this.aClass6_Sub4_3 != null) {
			this.aClass6_Sub4_3.method5898(arg0, 0, 256);
		}
		this.aLong22 = Static449.method6552();
	}

	@OriginalMember(owner = "client!wg", name = "c", descriptor = "()V")
	protected void method354() throws Exception {
	}

	@OriginalMember(owner = "client!wg", name = "c", descriptor = "(I)V")
	public final void method355() {
		this.aBoolean16 = true;
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(Ljava/awt/Component;)V")
	public void method357(@OriginalArg(0) Component arg0) throws Exception {
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(BI)V")
	private void method358() {
		this.anInt419 -= 256;
		if (this.anInt419 < 0) {
			this.anInt419 = 0;
		}
		if (this.aClass6_Sub4_3 != null) {
			this.aClass6_Sub4_3.method5899(256);
		}
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(BILclient!cb;)V")
	private void method359(@OriginalArg(1) int arg0, @OriginalArg(2) Class6_Sub4 arg1) {
		@Pc(7) int local7 = arg0 >> 5;
		@Pc(12) Class6_Sub4 local12 = this.aClass6_Sub4Array6[local7];
		if (local12 == null) {
			this.aClass6_Sub4Array5[local7] = arg1;
		} else {
			local12.aClass6_Sub4_8 = arg1;
		}
		this.aClass6_Sub4Array6[local7] = arg1;
		arg1.anInt7166 = arg0;
	}

	@OriginalMember(owner = "client!wg", name = "d", descriptor = "(I)V")
	public final synchronized void method360() {
		if (this.aBoolean15) {
			return;
		}
		@Pc(12) long local12 = Static449.method6552();
		try {
			if (this.aLong22 + 500000L < local12) {
				this.aLong22 = local12 - 500000L;
			}
			while (this.aLong22 + 5000L < local12) {
				this.method358();
				this.aLong22 += 256000 / Static275.anInt4927;
			}
		} catch (@Pc(52) Exception local52) {
			this.aLong22 = local12;
		}
		if (this.anIntArray18 == null) {
			return;
		}
		try {
			if (this.aLong24 != 0L) {
				if (local12 < this.aLong24) {
					return;
				}
				this.method349(this.anInt414);
				this.aLong24 = 0L;
				this.aBoolean16 = true;
			}
			@Pc(87) int local87 = this.method351();
			if (this.anInt420 - local87 > this.anInt415) {
				this.anInt415 = this.anInt420 - local87;
			}
			@Pc(107) int local107 = this.anInt421 + this.anInt422;
			if (local107 + 256 > 16384) {
				local107 = 16128;
			}
			if (this.anInt414 < local107 + 256) {
				this.anInt414 += 1024;
				if (this.anInt414 > 16384) {
					this.anInt414 = 16384;
				}
				this.method364();
				this.method349(this.anInt414);
				local87 = 0;
				if (this.anInt414 < local107 + 256) {
					local107 = this.anInt414 - 256;
					this.anInt422 = local107 - this.anInt421;
				}
				this.aBoolean16 = true;
			}
			while (local107 > local87) {
				this.method353(this.anIntArray18);
				local87 += 256;
				this.method354();
			}
			if (local12 > this.aLong23) {
				if (this.aBoolean16) {
					this.aBoolean16 = false;
				} else if (this.anInt415 == 0 && this.anInt424 == 0) {
					this.method364();
					this.aLong24 = local12 + 2000L;
					return;
				} else {
					this.anInt422 = Math.min(this.anInt424, this.anInt415);
					this.anInt424 = this.anInt415;
				}
				this.aLong23 = local12 + 2000L;
				this.anInt415 = 0;
			}
			this.anInt420 = local87;
		} catch (@Pc(241) Exception local241) {
			this.method364();
			this.aLong24 = local12 + 2000L;
		}
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(Z)V")
	public final synchronized void method361() {
		this.aBoolean16 = true;
		try {
			this.method350();
		} catch (@Pc(10) Exception local10) {
			this.method364();
			this.aLong24 = Static449.method6552() + 2000L;
		}
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(Lclient!cb;I)V")
	public final synchronized void method362(@OriginalArg(0) Class6_Sub4 arg0) {
		this.aClass6_Sub4_3 = arg0;
	}

	@OriginalMember(owner = "client!wg", name = "d", descriptor = "()V")
	protected void method364() {
	}
}
