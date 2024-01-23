import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ej")
public class Class31 {

	@OriginalMember(owner = "client!ej", name = "l", descriptor = "[I")
	public int[] anIntArray207;

	@OriginalMember(owner = "client!ej", name = "w", descriptor = "Lclient!ef;")
	private Class2_Sub6 aClass2_Sub6_4;

	@OriginalMember(owner = "client!ej", name = "y", descriptor = "I")
	public int anInt2132;

	@OriginalMember(owner = "client!ej", name = "D", descriptor = "I")
	public int anInt2136;

	@OriginalMember(owner = "client!ej", name = "M", descriptor = "I")
	private int anInt2142;

	@OriginalMember(owner = "client!ej", name = "h", descriptor = "I")
	private int anInt2122 = 32;

	@OriginalMember(owner = "client!ej", name = "v", descriptor = "J")
	private long aLong60 = Static182.method2903();

	@OriginalMember(owner = "client!ej", name = "z", descriptor = "Z")
	private boolean aBoolean112 = true;

	@OriginalMember(owner = "client!ej", name = "x", descriptor = "[Lclient!ef;")
	private Class2_Sub6[] aClass2_Sub6Array5 = new Class2_Sub6[8];

	@OriginalMember(owner = "client!ej", name = "F", descriptor = "J")
	private long aLong62 = 0L;

	@OriginalMember(owner = "client!ej", name = "G", descriptor = "I")
	private int anInt2137 = 0;

	@OriginalMember(owner = "client!ej", name = "C", descriptor = "I")
	private int anInt2135 = 0;

	@OriginalMember(owner = "client!ej", name = "I", descriptor = "I")
	private int anInt2139 = 0;

	@OriginalMember(owner = "client!ej", name = "E", descriptor = "J")
	private long aLong61 = 0L;

	@OriginalMember(owner = "client!ej", name = "J", descriptor = "I")
	private int anInt2140 = 0;

	@OriginalMember(owner = "client!ej", name = "L", descriptor = "[Lclient!ef;")
	private Class2_Sub6[] aClass2_Sub6Array6 = new Class2_Sub6[8];

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "()I")
	protected int method1497() throws Exception {
		return this.anInt2132;
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(II)V")
	private void method1498() {
		this.anInt2137 -= 256;
		if (this.anInt2137 < 0) {
			this.anInt2137 = 0;
		}
		if (this.aClass2_Sub6_4 != null) {
			this.aClass2_Sub6_4.method3090(256);
		}
	}

	@OriginalMember(owner = "client!ej", name = "b", descriptor = "()V")
	protected void method1499() throws Exception {
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(I)V")
	public final synchronized void method1500() {
		this.aBoolean112 = true;
		try {
			this.method1512();
		} catch (@Pc(6) Exception local6) {
			this.method1507();
			this.aLong62 = Static182.method2903() + 2000L;
		}
	}

	@OriginalMember(owner = "client!ej", name = "b", descriptor = "(I)V")
	public final synchronized void method1501() {
		if (Static131.aClass74_1 != null) {
			@Pc(5) boolean local5 = true;
			for (@Pc(7) int local7 = 0; local7 < 2; local7++) {
				if (Static131.aClass74_1.aClass31Array1[local7] == this) {
					Static131.aClass74_1.aClass31Array1[local7] = null;
				}
				if (Static131.aClass74_1.aClass31Array1[local7] != null) {
					local5 = false;
				}
			}
			if (local5) {
				Static131.aClass74_1.aBoolean189 = true;
				while (Static131.aClass74_1.aBoolean190) {
					Static19.method344(50L);
				}
				Static131.aClass74_1 = null;
			}
		}
		this.method1507();
		this.anIntArray207 = null;
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(Z)V")
	public final void method1502() {
		this.aBoolean112 = true;
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(IILclient!ef;)V")
	private void method1503(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub6 arg1) {
		@Pc(7) int local7 = arg0 >> 5;
		@Pc(16) Class2_Sub6 local16 = this.aClass2_Sub6Array5[local7];
		if (local16 == null) {
			this.aClass2_Sub6Array6[local7] = arg1;
		} else {
			local16.aClass2_Sub6_8 = arg1;
		}
		this.aClass2_Sub6Array5[local7] = arg1;
		arg1.anInt4462 = arg0;
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "([II)V")
	private void method1504(@OriginalArg(0) int[] arg0) {
		@Pc(1) short local1 = 256;
		if (Static6.aBoolean13) {
			local1 = 512;
		}
		Static225.method1838(arg0, 0, local1);
		this.anInt2137 -= 256;
		if (this.aClass2_Sub6_4 != null && this.anInt2137 <= 0) {
			this.anInt2137 += Static10.anInt374 >> 4;
			Static19.method345(this.aClass2_Sub6_4);
			this.method1503(this.aClass2_Sub6_4.method3088(), this.aClass2_Sub6_4);
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
						@Pc(88) Class2_Sub6 local88 = null;
						@Pc(93) Class2_Sub6 local93 = this.aClass2_Sub6Array6[local56];
						label97: while (true) {
							while (true) {
								if (local93 == null) {
									break label97;
								}
								@Pc(97) Class2_Sub9 local97 = local93.aClass2_Sub9_5;
								if (local97 == null || local97.anInt4356 <= local61) {
									local93.aBoolean276 = true;
									@Pc(121) int local121 = local93.method3089();
									local45 += local121;
									if (local97 != null) {
										local97.anInt4356 += local121;
									}
									if (local45 >= this.anInt2122) {
										break label103;
									}
									@Pc(140) Class2_Sub6 local140 = local93.method3091();
									if (local140 != null) {
										@Pc(145) int local145 = local93.anInt4462;
										while (local140 != null) {
											this.method1503(local145 * local140.method3088() >> 8, local140);
											local140 = local93.method3086();
										}
									}
									@Pc(164) Class2_Sub6 local164 = local93.aClass2_Sub6_8;
									local93.aClass2_Sub6_8 = null;
									if (local88 == null) {
										this.aClass2_Sub6Array6[local56] = local164;
									} else {
										local88.aClass2_Sub6_8 = local164;
									}
									if (local164 == null) {
										this.aClass2_Sub6Array5[local56] = local88;
									}
									local93 = local164;
								} else {
									local47 |= 0x1 << local56;
									local88 = local93;
									local93 = local93.aClass2_Sub6_8;
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
				@Pc(207) Class2_Sub6 local207 = this.aClass2_Sub6Array6[local56];
				this.aClass2_Sub6Array6[local56] = this.aClass2_Sub6Array5[local56] = null;
				while (local207 != null) {
					@Pc(221) Class2_Sub6 local221 = local207.aClass2_Sub6_8;
					local207.aClass2_Sub6_8 = null;
					local207 = local221;
				}
			}
		}
		if (this.anInt2137 < 0) {
			this.anInt2137 = 0;
		}
		if (this.aClass2_Sub6_4 != null) {
			this.aClass2_Sub6_4.method3085(arg0, 0, 256);
		}
		this.aLong60 = Static182.method2903();
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(B)V")
	public final synchronized void method1505() {
		if (this.anIntArray207 == null) {
			return;
		}
		@Pc(12) long local12 = Static182.method2903();
		try {
			if (this.aLong62 != 0L) {
				if (local12 < this.aLong62) {
					return;
				}
				this.method1508(this.anInt2132);
				this.aLong62 = 0L;
				this.aBoolean112 = true;
			}
			@Pc(44) int local44 = this.method1497();
			@Pc(50) int local50 = this.anInt2142 + this.anInt2136;
			if (this.anInt2140 - local44 > this.anInt2135) {
				this.anInt2135 = this.anInt2140 - local44;
			}
			if (local50 + 256 > 16384) {
				local50 = 16128;
			}
			if (this.anInt2132 < local50 + 256) {
				local44 = 0;
				this.anInt2132 += 1024;
				if (this.anInt2132 > 16384) {
					this.anInt2132 = 16384;
				}
				this.method1507();
				this.method1508(this.anInt2132);
				this.aBoolean112 = true;
				if (local50 + 256 > this.anInt2132) {
					local50 = this.anInt2132 - 256;
					this.anInt2142 = local50 - this.anInt2136;
				}
			}
			while (local44 < local50) {
				this.method1504(this.anIntArray207);
				this.method1499();
				local44 += 256;
			}
			if (local12 > this.aLong61) {
				if (this.aBoolean112) {
					this.aBoolean112 = false;
				} else if (this.anInt2135 == 0 && this.anInt2139 == 0) {
					this.method1507();
					this.aLong62 = local12 + 2000L;
					return;
				} else {
					this.anInt2142 = Math.min(this.anInt2139, this.anInt2135);
					this.anInt2139 = this.anInt2135;
				}
				this.anInt2135 = 0;
				this.aLong61 = local12 + 2000L;
			}
			this.anInt2140 = local44;
		} catch (@Pc(200) Exception local200) {
			this.method1507();
			this.aLong62 = local12 + 2000L;
		}
		try {
			if (local12 > this.aLong60 + 500000L) {
				local12 = this.aLong60;
			}
			while (local12 > this.aLong60 + 5000L) {
				this.method1498();
				this.aLong60 += 256000 / Static10.anInt374;
			}
		} catch (@Pc(251) Exception local251) {
			this.aLong60 = local12;
		}
	}

	@OriginalMember(owner = "client!ej", name = "c", descriptor = "()V")
	protected void method1507() {
	}

	@OriginalMember(owner = "client!ej", name = "c", descriptor = "(I)V")
	public void method1508(@OriginalArg(0) int arg0) throws Exception {
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(Lclient!ef;I)V")
	public final synchronized void method1509(@OriginalArg(0) Class2_Sub6 arg0) {
		this.aClass2_Sub6_4 = arg0;
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(Ljava/awt/Component;)V")
	public void method1511(@OriginalArg(0) Component arg0) throws Exception {
	}

	@OriginalMember(owner = "client!ej", name = "d", descriptor = "()V")
	protected void method1512() throws Exception {
	}
}
