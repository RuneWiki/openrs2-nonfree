import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jca")
public class Class76 {

	@OriginalMember(owner = "client!jca", name = "f", descriptor = "[I")
	public int[] anIntArray129;

	@OriginalMember(owner = "client!jca", name = "i", descriptor = "Lclient!jc;")
	private Class1_Sub6 aClass1_Sub6_5;

	@OriginalMember(owner = "client!jca", name = "t", descriptor = "I")
	public int anInt2880;

	@OriginalMember(owner = "client!jca", name = "v", descriptor = "I")
	private int anInt2881;

	@OriginalMember(owner = "client!jca", name = "D", descriptor = "I")
	public int anInt2886;

	@OriginalMember(owner = "client!jca", name = "o", descriptor = "I")
	private final int anInt2876 = 32;

	@OriginalMember(owner = "client!jca", name = "s", descriptor = "Z")
	private boolean aBoolean217 = false;

	@OriginalMember(owner = "client!jca", name = "d", descriptor = "J")
	private long aLong72 = Static480.method6650();

	@OriginalMember(owner = "client!jca", name = "u", descriptor = "J")
	private long aLong73 = 0L;

	@OriginalMember(owner = "client!jca", name = "w", descriptor = "Z")
	private boolean aBoolean218 = true;

	@OriginalMember(owner = "client!jca", name = "y", descriptor = "I")
	private int anInt2882 = 0;

	@OriginalMember(owner = "client!jca", name = "B", descriptor = "I")
	private int anInt2885 = 0;

	@OriginalMember(owner = "client!jca", name = "A", descriptor = "I")
	private int anInt2884 = 0;

	@OriginalMember(owner = "client!jca", name = "z", descriptor = "I")
	private int anInt2883 = 0;

	@OriginalMember(owner = "client!jca", name = "C", descriptor = "[Lclient!jc;")
	private final Class1_Sub6[] aClass1_Sub6Array6 = new Class1_Sub6[8];

	@OriginalMember(owner = "client!jca", name = "E", descriptor = "J")
	private long aLong74 = 0L;

	@OriginalMember(owner = "client!jca", name = "x", descriptor = "[Lclient!jc;")
	private final Class1_Sub6[] aClass1_Sub6Array5 = new Class1_Sub6[8];

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "(Lclient!jc;I)V")
	public final synchronized void method2506(@OriginalArg(0) Class1_Sub6 arg0) {
		this.aClass1_Sub6_5 = arg0;
	}

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "(I)V")
	public final synchronized void method2507() {
		this.aBoolean218 = true;
		try {
			this.method2510();
		} catch (@Pc(16) Exception local16) {
			this.method2512();
			this.aLong73 = Static480.method6650() + 2000L;
		}
	}

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "()V")
	protected void method2508() throws Exception {
	}

	@OriginalMember(owner = "client!jca", name = "b", descriptor = "(I)V")
	public final synchronized void method2509() {
		if (Static153.aClass107_1 != null) {
			@Pc(9) boolean local9 = true;
			for (@Pc(11) int local11 = 0; local11 < 2; local11++) {
				if (Static153.aClass107_1.aClass76Array1[local11] == this) {
					Static153.aClass107_1.aClass76Array1[local11] = null;
				}
				if (Static153.aClass107_1.aClass76Array1[local11] != null) {
					local9 = false;
				}
			}
			if (local9) {
				Static153.aClass107_1.aBoolean215 = true;
				while (Static153.aClass107_1.aBoolean214) {
					Static408.method5841(50L);
				}
				Static153.aClass107_1 = null;
			}
		}
		this.method2512();
		this.aBoolean217 = true;
		this.anIntArray129 = null;
	}

	@OriginalMember(owner = "client!jca", name = "b", descriptor = "()V")
	protected void method2510() throws Exception {
	}

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "(B)V")
	public final synchronized void method2511() {
		if (this.aBoolean217) {
			return;
		}
		@Pc(18) long local18 = Static480.method6650();
		try {
			if (local18 > this.aLong72 + 500000L) {
				this.aLong72 = local18 - 500000L;
			}
			while (this.aLong72 + 5000L < local18) {
				this.method2513();
				this.aLong72 += 256000 / Static304.anInt5650;
			}
		} catch (@Pc(58) Exception local58) {
			this.aLong72 = local18;
		}
		if (this.anIntArray129 == null) {
			return;
		}
		try {
			if (this.aLong73 != 0L) {
				if (this.aLong73 > local18) {
					return;
				}
				this.method2520(this.anInt2880);
				this.aBoolean218 = true;
				this.aLong73 = 0L;
			}
			@Pc(93) int local93 = this.method2518();
			if (this.anInt2885 < this.anInt2883 - local93) {
				this.anInt2885 = this.anInt2883 - local93;
			}
			@Pc(118) int local118 = this.anInt2881 + this.anInt2886;
			if (local118 + 256 > 16384) {
				local118 = 16128;
			}
			if (local118 + 256 > this.anInt2880) {
				this.anInt2880 += 1024;
				if (this.anInt2880 > 16384) {
					this.anInt2880 = 16384;
				}
				this.method2512();
				this.method2520(this.anInt2880);
				local93 = 0;
				if (local118 + 256 > this.anInt2880) {
					local118 = this.anInt2880 - 256;
					this.anInt2881 = local118 - this.anInt2886;
				}
				this.aBoolean218 = true;
			}
			while (local93 < local118) {
				this.method2516(this.anIntArray129);
				this.method2508();
				local93 += 256;
			}
			if (this.aLong74 < local18) {
				if (this.aBoolean218) {
					this.aBoolean218 = false;
				} else if (this.anInt2885 == 0 && this.anInt2882 == 0) {
					this.method2512();
					this.aLong73 = local18 + 2000L;
					return;
				} else {
					this.anInt2881 = Math.min(this.anInt2882, this.anInt2885);
					this.anInt2882 = this.anInt2885;
				}
				this.anInt2885 = 0;
				this.aLong74 = local18 + 2000L;
			}
			this.anInt2883 = local93;
		} catch (@Pc(258) Exception local258) {
			this.method2512();
			this.aLong73 = local18 + 2000L;
		}
	}

	@OriginalMember(owner = "client!jca", name = "c", descriptor = "()V")
	protected void method2512() {
	}

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "(II)V")
	private void method2513() {
		this.anInt2884 -= 256;
		if (this.anInt2884 < 0) {
			this.anInt2884 = 0;
		}
		if (this.aClass1_Sub6_5 != null) {
			this.aClass1_Sub6_5.method6579(256);
		}
	}

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "(IZLclient!jc;)V")
	private void method2514(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub6 arg1) {
		@Pc(14) int local14 = arg0 >> 5;
		@Pc(19) Class1_Sub6 local19 = this.aClass1_Sub6Array5[local14];
		if (local19 == null) {
			this.aClass1_Sub6Array6[local14] = arg1;
		} else {
			local19.aClass1_Sub6_8 = arg1;
		}
		this.aClass1_Sub6Array5[local14] = arg1;
		arg1.anInt8173 = arg0;
	}

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "(Ljava/awt/Component;)V")
	public void method2515(@OriginalArg(0) Component arg0) throws Exception {
	}

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "([II)V")
	private void method2516(@OriginalArg(0) int[] arg0) {
		@Pc(1) short local1 = 256;
		if (Static269.aBoolean372) {
			local1 = 512;
		}
		Static598.method777(arg0, 0, local1);
		this.anInt2884 -= 256;
		if (this.aClass1_Sub6_5 != null && this.anInt2884 <= 0) {
			this.anInt2884 += Static304.anInt5650 >> 4;
			Static124.method2213(this.aClass1_Sub6_5);
			this.method2514(this.aClass1_Sub6_5.method6575(), this.aClass1_Sub6_5);
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
						@Pc(88) Class1_Sub6 local88 = null;
						@Pc(93) Class1_Sub6 local93 = this.aClass1_Sub6Array6[local56];
						label97: while (true) {
							while (true) {
								if (local93 == null) {
									break label97;
								}
								@Pc(97) Class1_Sub13 local97 = local93.aClass1_Sub13_5;
								if (local97 == null || local97.anInt912 <= local61) {
									local93.aBoolean613 = true;
									@Pc(121) int local121 = local93.method6580();
									local45 += local121;
									if (local97 != null) {
										local97.anInt912 += local121;
									}
									if (local45 >= this.anInt2876) {
										break label103;
									}
									@Pc(140) Class1_Sub6 local140 = local93.method6577();
									if (local140 != null) {
										@Pc(145) int local145 = local93.anInt8173;
										while (local140 != null) {
											this.method2514(local145 * local140.method6575() >> 8, local140);
											local140 = local93.method6578();
										}
									}
									@Pc(164) Class1_Sub6 local164 = local93.aClass1_Sub6_8;
									local93.aClass1_Sub6_8 = null;
									if (local88 == null) {
										this.aClass1_Sub6Array6[local56] = local164;
									} else {
										local88.aClass1_Sub6_8 = local164;
									}
									if (local164 == null) {
										this.aClass1_Sub6Array5[local56] = local88;
									}
									local93 = local164;
								} else {
									local47 |= 0x1 << local56;
									local88 = local93;
									local93 = local93.aClass1_Sub6_8;
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
				@Pc(207) Class1_Sub6 local207 = this.aClass1_Sub6Array6[local56];
				this.aClass1_Sub6Array6[local56] = this.aClass1_Sub6Array5[local56] = null;
				while (local207 != null) {
					@Pc(221) Class1_Sub6 local221 = local207.aClass1_Sub6_8;
					local207.aClass1_Sub6_8 = null;
					local207 = local221;
				}
			}
		}
		if (this.anInt2884 < 0) {
			this.anInt2884 = 0;
		}
		if (this.aClass1_Sub6_5 != null) {
			this.aClass1_Sub6_5.method6576(arg0, 0, 256);
		}
		this.aLong72 = Static480.method6650();
	}

	@OriginalMember(owner = "client!jca", name = "d", descriptor = "()I")
	protected int method2518() throws Exception {
		return this.anInt2880;
	}

	@OriginalMember(owner = "client!jca", name = "d", descriptor = "(I)V")
	public void method2520(@OriginalArg(0) int arg0) throws Exception {
	}
}
