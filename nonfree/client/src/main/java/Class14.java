import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!is")
public class Class14 {

	@OriginalMember(owner = "client!is", name = "f", descriptor = "Lclient!nf;")
	private Class5_Sub17 aClass5_Sub17_8;

	@OriginalMember(owner = "client!is", name = "s", descriptor = "[I")
	public int[] anIntArray530;

	@OriginalMember(owner = "client!is", name = "C", descriptor = "I")
	public int anInt6173;

	@OriginalMember(owner = "client!is", name = "J", descriptor = "I")
	public int anInt6174;

	@OriginalMember(owner = "client!is", name = "K", descriptor = "I")
	private int anInt6175;

	@OriginalMember(owner = "client!is", name = "l", descriptor = "Z")
	private boolean aBoolean463 = false;

	@OriginalMember(owner = "client!is", name = "o", descriptor = "I")
	private final int anInt6164 = 32;

	@OriginalMember(owner = "client!is", name = "p", descriptor = "J")
	private long aLong204 = Static284.method4783();

	@OriginalMember(owner = "client!is", name = "B", descriptor = "[Lclient!nf;")
	private final Class5_Sub17[] aClass5_Sub17Array5 = new Class5_Sub17[8];

	@OriginalMember(owner = "client!is", name = "E", descriptor = "[Lclient!nf;")
	private final Class5_Sub17[] aClass5_Sub17Array6 = new Class5_Sub17[8];

	@OriginalMember(owner = "client!is", name = "z", descriptor = "I")
	private int anInt6171 = 0;

	@OriginalMember(owner = "client!is", name = "O", descriptor = "I")
	private int anInt6177 = 0;

	@OriginalMember(owner = "client!is", name = "A", descriptor = "I")
	private int anInt6172 = 0;

	@OriginalMember(owner = "client!is", name = "H", descriptor = "J")
	private long aLong206 = 0L;

	@OriginalMember(owner = "client!is", name = "N", descriptor = "I")
	private int anInt6176 = 0;

	@OriginalMember(owner = "client!is", name = "G", descriptor = "J")
	private long aLong205 = 0L;

	@OriginalMember(owner = "client!is", name = "I", descriptor = "Z")
	private boolean aBoolean464 = true;

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(I)V")
	public final synchronized void method5472() {
		if (this.aBoolean463) {
			return;
		}
		@Pc(12) long local12 = Static284.method4783();
		try {
			if (this.aLong204 + 500000L < local12) {
				this.aLong204 = local12 - 500000L;
			}
			while (local12 > this.aLong204 + 5000L) {
				this.method5478();
				this.aLong204 += 256000 / Static344.anInt1063;
			}
		} catch (@Pc(52) Exception local52) {
			this.aLong204 = local12;
		}
		if (this.anIntArray530 == null) {
			return;
		}
		try {
			if (this.aLong205 != 0L) {
				if (this.aLong205 > local12) {
					return;
				}
				this.method5484(this.anInt6174);
				this.aLong205 = 0L;
				this.aBoolean464 = true;
			}
			@Pc(85) int local85 = this.method5476();
			if (this.anInt6177 - local85 > this.anInt6172) {
				this.anInt6172 = this.anInt6177 - local85;
			}
			@Pc(116) int local116 = this.anInt6173 + this.anInt6175;
			if (local116 + 256 > 16384) {
				local116 = 16128;
			}
			if (local116 + 256 > this.anInt6174) {
				this.anInt6174 += 1024;
				if (this.anInt6174 > 16384) {
					this.anInt6174 = 16384;
				}
				this.method5485();
				this.method5484(this.anInt6174);
				local85 = 0;
				this.aBoolean464 = true;
				if (local116 + 256 > this.anInt6174) {
					local116 = this.anInt6174 - 256;
					this.anInt6175 = local116 - this.anInt6173;
				}
			}
			while (local116 > local85) {
				this.method5473(this.anIntArray530);
				this.method5487();
				local85 += 256;
			}
			if (local12 > this.aLong206) {
				if (this.aBoolean464) {
					this.aBoolean464 = false;
				} else if (this.anInt6172 == 0 && this.anInt6171 == 0) {
					this.method5485();
					this.aLong205 = local12 + 2000L;
					return;
				} else {
					this.anInt6175 = Math.min(this.anInt6171, this.anInt6172);
					this.anInt6171 = this.anInt6172;
				}
				this.aLong206 = local12 + 2000L;
				this.anInt6172 = 0;
			}
			this.anInt6177 = local85;
		} catch (@Pc(248) Exception local248) {
			this.method5485();
			this.aLong205 = local12 + 2000L;
		}
	}

	@OriginalMember(owner = "client!is", name = "a", descriptor = "([II)V")
	private void method5473(@OriginalArg(0) int[] arg0) {
		@Pc(1) short local1 = 256;
		if (Static250.aBoolean374) {
			local1 = 512;
		}
		Static359.method757(arg0, 0, local1);
		this.anInt6176 -= 256;
		if (this.aClass5_Sub17_8 != null && this.anInt6176 <= 0) {
			this.anInt6176 += Static344.anInt1063 >> 4;
			Static137.method2182(this.aClass5_Sub17_8);
			this.method5481(this.aClass5_Sub17_8, this.aClass5_Sub17_8.method4462());
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
						@Pc(88) Class5_Sub17 local88 = null;
						@Pc(93) Class5_Sub17 local93 = this.aClass5_Sub17Array6[local56];
						label97: while (true) {
							while (true) {
								if (local93 == null) {
									break label97;
								}
								@Pc(97) Class5_Sub15 local97 = local93.aClass5_Sub15_5;
								if (local97 == null || local97.anInt2149 <= local61) {
									local93.aBoolean383 = true;
									@Pc(121) int local121 = local93.method4459();
									local45 += local121;
									if (local97 != null) {
										local97.anInt2149 += local121;
									}
									if (local45 >= this.anInt6164) {
										break label103;
									}
									@Pc(140) Class5_Sub17 local140 = local93.method4463();
									if (local140 != null) {
										@Pc(145) int local145 = local93.anInt5000;
										while (local140 != null) {
											this.method5481(local140, local145 * local140.method4462() >> 8);
											local140 = local93.method4461();
										}
									}
									@Pc(164) Class5_Sub17 local164 = local93.aClass5_Sub17_7;
									local93.aClass5_Sub17_7 = null;
									if (local88 == null) {
										this.aClass5_Sub17Array6[local56] = local164;
									} else {
										local88.aClass5_Sub17_7 = local164;
									}
									if (local164 == null) {
										this.aClass5_Sub17Array5[local56] = local88;
									}
									local93 = local164;
								} else {
									local47 |= 0x1 << local56;
									local88 = local93;
									local93 = local93.aClass5_Sub17_7;
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
				@Pc(207) Class5_Sub17 local207 = this.aClass5_Sub17Array6[local56];
				this.aClass5_Sub17Array6[local56] = this.aClass5_Sub17Array5[local56] = null;
				while (local207 != null) {
					@Pc(221) Class5_Sub17 local221 = local207.aClass5_Sub17_7;
					local207.aClass5_Sub17_7 = null;
					local207 = local221;
				}
			}
		}
		if (this.anInt6176 < 0) {
			this.anInt6176 = 0;
		}
		if (this.aClass5_Sub17_8 != null) {
			this.aClass5_Sub17_8.method4464(arg0, 0, 256);
		}
		this.aLong204 = Static284.method4783();
	}

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(B)V")
	public final void method5474() {
		this.aBoolean464 = true;
	}

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(Ljava/awt/Component;)V")
	public void method5475(@OriginalArg(0) Component arg0) throws Exception {
	}

	@OriginalMember(owner = "client!is", name = "a", descriptor = "()I")
	protected int method5476() throws Exception {
		return this.anInt6174;
	}

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(IB)V")
	private void method5478() {
		this.anInt6176 -= 256;
		if (this.anInt6176 < 0) {
			this.anInt6176 = 0;
		}
		if (this.aClass5_Sub17_8 != null) {
			this.aClass5_Sub17_8.method4465(256);
		}
	}

	@OriginalMember(owner = "client!is", name = "b", descriptor = "(I)V")
	public final synchronized void method5479() {
		this.aBoolean464 = true;
		try {
			this.method5486();
		} catch (@Pc(14) Exception local14) {
			this.method5485();
			this.aLong205 = Static284.method4783() + 2000L;
		}
	}

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(Lclient!nf;I)V")
	public final synchronized void method5480(@OriginalArg(0) Class5_Sub17 arg0) {
		this.aClass5_Sub17_8 = arg0;
	}

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(Lclient!nf;IB)V")
	private void method5481(@OriginalArg(0) Class5_Sub17 arg0, @OriginalArg(1) int arg1) {
		@Pc(15) int local15 = arg1 >> 5;
		@Pc(20) Class5_Sub17 local20 = this.aClass5_Sub17Array5[local15];
		if (local20 == null) {
			this.aClass5_Sub17Array6[local15] = arg0;
		} else {
			local20.aClass5_Sub17_7 = arg0;
		}
		this.aClass5_Sub17Array5[local15] = arg0;
		arg0.anInt5000 = arg1;
	}

	@OriginalMember(owner = "client!is", name = "c", descriptor = "(I)V")
	public final synchronized void method5483() {
		if (Static104.aClass192_1 != null) {
			@Pc(14) boolean local14 = true;
			for (@Pc(16) int local16 = 0; local16 < 2; local16++) {
				if (Static104.aClass192_1.aClass14Array1[local16] == this) {
					Static104.aClass192_1.aClass14Array1[local16] = null;
				}
				if (Static104.aClass192_1.aClass14Array1[local16] != null) {
					local14 = false;
				}
			}
			if (local14) {
				Static104.aClass192_1.aBoolean442 = true;
				while (Static104.aClass192_1.aBoolean443) {
					Static105.method2138(50L);
				}
				Static104.aClass192_1 = null;
			}
		}
		this.method5485();
		this.anIntArray530 = null;
		this.aBoolean463 = true;
	}

	@OriginalMember(owner = "client!is", name = "d", descriptor = "(I)V")
	public void method5484(@OriginalArg(0) int arg0) throws Exception {
	}

	@OriginalMember(owner = "client!is", name = "b", descriptor = "()V")
	protected void method5485() {
	}

	@OriginalMember(owner = "client!is", name = "c", descriptor = "()V")
	protected void method5486() throws Exception {
	}

	@OriginalMember(owner = "client!is", name = "d", descriptor = "()V")
	protected void method5487() throws Exception {
	}
}
