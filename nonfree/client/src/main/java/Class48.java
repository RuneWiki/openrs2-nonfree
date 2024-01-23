import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!id")
public class Class48 {

	@OriginalMember(owner = "client!id", name = "u", descriptor = "Lclient!ge;")
	private Class1_Sub12 aClass1_Sub12_8;

	@OriginalMember(owner = "client!id", name = "w", descriptor = "[I")
	public int[] anIntArray464;

	@OriginalMember(owner = "client!id", name = "A", descriptor = "I")
	private int anInt4088;

	@OriginalMember(owner = "client!id", name = "J", descriptor = "I")
	public int anInt4093;

	@OriginalMember(owner = "client!id", name = "K", descriptor = "I")
	public int anInt4094;

	@OriginalMember(owner = "client!id", name = "g", descriptor = "I")
	private int anInt4073 = 32;

	@OriginalMember(owner = "client!id", name = "m", descriptor = "J")
	private long aLong154 = Static179.method2941();

	@OriginalMember(owner = "client!id", name = "G", descriptor = "Z")
	private boolean aBoolean193 = true;

	@OriginalMember(owner = "client!id", name = "C", descriptor = "[Lclient!ge;")
	private Class1_Sub12[] aClass1_Sub12Array5 = new Class1_Sub12[8];

	@OriginalMember(owner = "client!id", name = "H", descriptor = "I")
	private int anInt4091 = 0;

	@OriginalMember(owner = "client!id", name = "F", descriptor = "J")
	private long aLong155 = 0L;

	@OriginalMember(owner = "client!id", name = "I", descriptor = "I")
	private int anInt4092 = 0;

	@OriginalMember(owner = "client!id", name = "O", descriptor = "I")
	private int anInt4096 = 0;

	@OriginalMember(owner = "client!id", name = "P", descriptor = "[Lclient!ge;")
	private Class1_Sub12[] aClass1_Sub12Array6 = new Class1_Sub12[8];

	@OriginalMember(owner = "client!id", name = "N", descriptor = "J")
	private long aLong156 = 0L;

	@OriginalMember(owner = "client!id", name = "B", descriptor = "I")
	private int anInt4089 = 0;

	@OriginalMember(owner = "client!id", name = "a", descriptor = "()V")
	protected void method3215() throws Exception {
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(B)V")
	public final synchronized void method3216() {
		if (Static148.aClass28_1 != null) {
			@Pc(5) boolean local5 = true;
			for (@Pc(7) int local7 = 0; local7 < 2; local7++) {
				if (Static148.aClass28_1.aClass48Array1[local7] == this) {
					Static148.aClass28_1.aClass48Array1[local7] = null;
				}
				if (Static148.aClass28_1.aClass48Array1[local7] != null) {
					local5 = false;
				}
			}
			if (local5) {
				Static148.aClass28_1.aBoolean54 = true;
				while (Static148.aClass28_1.aBoolean55) {
					Static204.method3250(50L);
				}
				Static148.aClass28_1 = null;
			}
		}
		this.method3232();
		this.anIntArray464 = null;
	}

	@OriginalMember(owner = "client!id", name = "b", descriptor = "()V")
	protected void method3217() throws Exception {
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(I)V")
	public void method3218(@OriginalArg(0) int arg0) throws Exception {
	}

	@OriginalMember(owner = "client!id", name = "b", descriptor = "(I)V")
	public final void method3221() {
		this.aBoolean193 = true;
	}

	@OriginalMember(owner = "client!id", name = "c", descriptor = "(I)V")
	public final synchronized void method3223() {
		if (this.anIntArray464 == null) {
			return;
		}
		@Pc(19) long local19 = Static179.method2941();
		try {
			if (this.aLong156 != 0L) {
				if (this.aLong156 > local19) {
					return;
				}
				this.method3218(this.anInt4093);
				this.aBoolean193 = true;
				this.aLong156 = 0L;
			}
			@Pc(43) int local43 = this.method3235();
			@Pc(50) int local50 = this.anInt4094 + this.anInt4088;
			if (this.anInt4089 - local43 > this.anInt4091) {
				this.anInt4091 = this.anInt4089 - local43;
			}
			if (local50 + 256 > 16384) {
				local50 = 16128;
			}
			if (this.anInt4093 < local50 + 256) {
				local43 = 0;
				this.anInt4093 += 1024;
				if (this.anInt4093 > 16384) {
					this.anInt4093 = 16384;
				}
				this.method3232();
				this.method3218(this.anInt4093);
				if (this.anInt4093 < local50 + 256) {
					local50 = this.anInt4093 - 256;
					this.anInt4088 = local50 - this.anInt4094;
				}
				this.aBoolean193 = true;
			}
			while (local43 < local50) {
				this.method3225(this.anIntArray464);
				this.method3215();
				local43 += 256;
			}
			if (this.aLong155 < local19) {
				if (this.aBoolean193) {
					this.aBoolean193 = false;
				} else if (this.anInt4091 == 0 && this.anInt4096 == 0) {
					this.method3232();
					this.aLong156 = local19 + 2000L;
					return;
				} else {
					this.anInt4088 = Math.min(this.anInt4096, this.anInt4091);
					this.anInt4096 = this.anInt4091;
				}
				this.aLong155 = local19 + 2000L;
				this.anInt4091 = 0;
			}
			this.anInt4089 = local43;
		} catch (@Pc(195) Exception local195) {
			this.method3232();
			this.aLong156 = local19 + 2000L;
		}
		try {
			if (this.aLong154 + 500000L < local19) {
				local19 = this.aLong154;
			}
			while (local19 > this.aLong154 + 5000L) {
				this.method3230();
				this.aLong154 += 256000 / Static50.anInt1044;
			}
		} catch (@Pc(236) Exception local236) {
			this.aLong154 = local19;
		}
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "([II)V")
	private void method3225(@OriginalArg(0) int[] arg0) {
		@Pc(1) short local1 = 256;
		if (Static130.aBoolean114) {
			local1 = 512;
		}
		Static235.method867(arg0, 0, local1);
		this.anInt4092 -= 256;
		if (this.aClass1_Sub12_8 != null && this.anInt4092 <= 0) {
			this.anInt4092 += Static50.anInt1044 >> 4;
			Static142.method2345(this.aClass1_Sub12_8);
			this.method3228(this.aClass1_Sub12_8.method3034(), this.aClass1_Sub12_8);
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
						@Pc(93) Class1_Sub12 local93 = this.aClass1_Sub12Array6[local56];
						label97: while (true) {
							while (true) {
								if (local93 == null) {
									break label97;
								}
								@Pc(97) Class1_Sub15 local97 = local93.aClass1_Sub15_5;
								if (local97 == null || local97.anInt3457 <= local61) {
									local93.aBoolean173 = true;
									@Pc(121) int local121 = local93.method3033();
									local45 += local121;
									if (local97 != null) {
										local97.anInt3457 += local121;
									}
									if (local45 >= this.anInt4073) {
										break label103;
									}
									@Pc(140) Class1_Sub12 local140 = local93.method3038();
									if (local140 != null) {
										@Pc(145) int local145 = local93.anInt3825;
										while (local140 != null) {
											this.method3228(local145 * local140.method3034() >> 8, local140);
											local140 = local93.method3035();
										}
									}
									@Pc(164) Class1_Sub12 local164 = local93.aClass1_Sub12_7;
									local93.aClass1_Sub12_7 = null;
									if (local88 == null) {
										this.aClass1_Sub12Array6[local56] = local164;
									} else {
										local88.aClass1_Sub12_7 = local164;
									}
									if (local164 == null) {
										this.aClass1_Sub12Array5[local56] = local88;
									}
									local93 = local164;
								} else {
									local47 |= 0x1 << local56;
									local88 = local93;
									local93 = local93.aClass1_Sub12_7;
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
				@Pc(207) Class1_Sub12 local207 = this.aClass1_Sub12Array6[local56];
				this.aClass1_Sub12Array6[local56] = this.aClass1_Sub12Array5[local56] = null;
				while (local207 != null) {
					@Pc(221) Class1_Sub12 local221 = local207.aClass1_Sub12_7;
					local207.aClass1_Sub12_7 = null;
					local207 = local221;
				}
			}
		}
		if (this.anInt4092 < 0) {
			this.anInt4092 = 0;
		}
		if (this.aClass1_Sub12_8 != null) {
			this.aClass1_Sub12_8.method3036(arg0, 0, 256);
		}
		this.aLong154 = Static179.method2941();
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(Lclient!ge;I)V")
	public final synchronized void method3227(@OriginalArg(0) Class1_Sub12 arg0) {
		this.aClass1_Sub12_8 = arg0;
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(ILclient!ge;Z)V")
	private void method3228(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub12 arg1) {
		@Pc(7) int local7 = arg0 >> 5;
		@Pc(12) Class1_Sub12 local12 = this.aClass1_Sub12Array5[local7];
		if (local12 == null) {
			this.aClass1_Sub12Array6[local7] = arg1;
		} else {
			local12.aClass1_Sub12_7 = arg1;
		}
		this.aClass1_Sub12Array5[local7] = arg1;
		arg1.anInt3825 = arg0;
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(Ljava/awt/Component;)V")
	public void method3229(@OriginalArg(0) Component arg0) throws Exception {
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(BI)V")
	private void method3230() {
		this.anInt4092 -= 256;
		if (this.anInt4092 < 0) {
			this.anInt4092 = 0;
		}
		if (this.aClass1_Sub12_8 != null) {
			this.aClass1_Sub12_8.method3037(256);
		}
	}

	@OriginalMember(owner = "client!id", name = "c", descriptor = "()V")
	protected void method3232() {
	}

	@OriginalMember(owner = "client!id", name = "c", descriptor = "(B)V")
	public final synchronized void method3234() {
		this.aBoolean193 = true;
		try {
			this.method3217();
		} catch (@Pc(6) Exception local6) {
			this.method3232();
			this.aLong156 = Static179.method2941() + 2000L;
		}
	}

	@OriginalMember(owner = "client!id", name = "d", descriptor = "()I")
	protected int method3235() throws Exception {
		return this.anInt4093;
	}
}
