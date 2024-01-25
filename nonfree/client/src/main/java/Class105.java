import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wl")
public class Class105 {

	@OriginalMember(owner = "client!wl", name = "j", descriptor = "[I")
	public int[] anIntArray542;

	@OriginalMember(owner = "client!wl", name = "s", descriptor = "Lclient!wg;")
	private Class6_Sub5 aClass6_Sub5_7;

	@OriginalMember(owner = "client!wl", name = "z", descriptor = "I")
	public int anInt6191;

	@OriginalMember(owner = "client!wl", name = "A", descriptor = "I")
	public int anInt6192;

	@OriginalMember(owner = "client!wl", name = "C", descriptor = "I")
	private int anInt6194;

	@OriginalMember(owner = "client!wl", name = "k", descriptor = "Z")
	private boolean aBoolean412 = false;

	@OriginalMember(owner = "client!wl", name = "e", descriptor = "I")
	private final int anInt6177 = 32;

	@OriginalMember(owner = "client!wl", name = "d", descriptor = "J")
	private long aLong182 = Static154.method2527();

	@OriginalMember(owner = "client!wl", name = "v", descriptor = "[Lclient!wg;")
	private final Class6_Sub5[] aClass6_Sub5Array5 = new Class6_Sub5[8];

	@OriginalMember(owner = "client!wl", name = "x", descriptor = "I")
	private int anInt6190 = 0;

	@OriginalMember(owner = "client!wl", name = "u", descriptor = "I")
	private int anInt6188 = 0;

	@OriginalMember(owner = "client!wl", name = "y", descriptor = "J")
	private long aLong183 = 0L;

	@OriginalMember(owner = "client!wl", name = "G", descriptor = "Z")
	private boolean aBoolean413 = true;

	@OriginalMember(owner = "client!wl", name = "E", descriptor = "I")
	private int anInt6196 = 0;

	@OriginalMember(owner = "client!wl", name = "w", descriptor = "I")
	private int anInt6189 = 0;

	@OriginalMember(owner = "client!wl", name = "F", descriptor = "[Lclient!wg;")
	private final Class6_Sub5[] aClass6_Sub5Array6 = new Class6_Sub5[8];

	@OriginalMember(owner = "client!wl", name = "H", descriptor = "J")
	private long aLong184 = 0L;

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(II)V")
	private void method5159() {
		this.anInt6189 -= 256;
		if (this.anInt6189 < 0) {
			this.anInt6189 = 0;
		}
		if (this.aClass6_Sub5_7 != null) {
			this.aClass6_Sub5_7.method5730(256);
		}
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "()I")
	protected int method5160() throws Exception {
		return this.anInt6191;
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(Z)V")
	public final void method5161() {
		this.aBoolean413 = true;
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(B)V")
	public final synchronized void method5162() {
		if (Static19.aClass252_1 != null) {
			@Pc(5) boolean local5 = true;
			for (@Pc(7) int local7 = 0; local7 < 2; local7++) {
				if (Static19.aClass252_1.aClass105Array1[local7] == this) {
					Static19.aClass252_1.aClass105Array1[local7] = null;
				}
				if (Static19.aClass252_1.aClass105Array1[local7] != null) {
					local5 = false;
				}
			}
			if (local5) {
				Static19.aClass252_1.aBoolean476 = true;
				while (Static19.aClass252_1.aBoolean475) {
					Static170.method1617(50L);
				}
				Static19.aClass252_1 = null;
			}
		}
		this.method5168();
		this.anIntArray542 = null;
		this.aBoolean412 = true;
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(Lclient!wg;I)V")
	public final synchronized void method5163(@OriginalArg(0) Class6_Sub5 arg0) {
		this.aClass6_Sub5_7 = arg0;
	}

	@OriginalMember(owner = "client!wl", name = "b", descriptor = "()V")
	protected void method5164() throws Exception {
	}

	@OriginalMember(owner = "client!wl", name = "b", descriptor = "(I)V")
	public final synchronized void method5166() {
		if (this.aBoolean412) {
			return;
		}
		@Pc(12) long local12 = Static154.method2527();
		try {
			if (local12 > this.aLong182 + 500000L) {
				this.aLong182 = local12 - 500000L;
			}
			while (local12 > this.aLong182 + 5000L) {
				this.method5159();
				this.aLong182 += 256000 / Static203.anInt3580;
			}
		} catch (@Pc(56) Exception local56) {
			this.aLong182 = local12;
		}
		if (this.anIntArray542 == null) {
			return;
		}
		try {
			if (this.aLong183 != 0L) {
				if (this.aLong183 > local12) {
					return;
				}
				this.method5169(this.anInt6191);
				this.aLong183 = 0L;
				this.aBoolean413 = true;
			}
			@Pc(91) int local91 = this.method5160();
			if (this.anInt6196 - local91 > this.anInt6188) {
				this.anInt6188 = this.anInt6196 - local91;
			}
			@Pc(116) int local116 = this.anInt6194 + this.anInt6192;
			if (local116 + 256 > 16384) {
				local116 = 16128;
			}
			if (this.anInt6191 < local116 + 256) {
				this.anInt6191 += 1024;
				if (this.anInt6191 > 16384) {
					this.anInt6191 = 16384;
				}
				this.method5168();
				local91 = 0;
				this.method5169(this.anInt6191);
				if (this.anInt6191 < local116 + 256) {
					local116 = this.anInt6191 - 256;
					this.anInt6194 = local116 - this.anInt6192;
				}
				this.aBoolean413 = true;
			}
			while (local116 > local91) {
				this.method5167(this.anIntArray542);
				this.method5164();
				local91 += 256;
			}
			if (this.aLong184 < local12) {
				if (this.aBoolean413) {
					this.aBoolean413 = false;
				} else if (this.anInt6188 == 0 && this.anInt6190 == 0) {
					this.method5168();
					this.aLong183 = local12 + 2000L;
					return;
				} else {
					this.anInt6194 = Math.min(this.anInt6190, this.anInt6188);
					this.anInt6190 = this.anInt6188;
				}
				this.anInt6188 = 0;
				this.aLong184 = local12 + 2000L;
			}
			this.anInt6196 = local91;
		} catch (@Pc(267) Exception local267) {
			this.method5168();
			this.aLong183 = local12 + 2000L;
		}
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "([II)V")
	private void method5167(@OriginalArg(0) int[] arg0) {
		@Pc(1) short local1 = 256;
		if (Static24.aBoolean29) {
			local1 = 512;
		}
		Static459.method5350(arg0, 0, local1);
		this.anInt6189 -= 256;
		if (this.aClass6_Sub5_7 != null && this.anInt6189 <= 0) {
			this.anInt6189 += Static203.anInt3580 >> 4;
			Static255.method3942(this.aClass6_Sub5_7);
			this.method5173(this.aClass6_Sub5_7, this.aClass6_Sub5_7.method5731());
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
						@Pc(88) Class6_Sub5 local88 = null;
						@Pc(93) Class6_Sub5 local93 = this.aClass6_Sub5Array5[local56];
						label97: while (true) {
							while (true) {
								if (local93 == null) {
									break label97;
								}
								@Pc(97) Class6_Sub4 local97 = local93.aClass6_Sub4_5;
								if (local97 == null || local97.anInt2441 <= local61) {
									local93.aBoolean478 = true;
									@Pc(121) int local121 = local93.method5728();
									local45 += local121;
									if (local97 != null) {
										local97.anInt2441 += local121;
									}
									if (local45 >= this.anInt6177) {
										break label103;
									}
									@Pc(140) Class6_Sub5 local140 = local93.method5729();
									if (local140 != null) {
										@Pc(145) int local145 = local93.anInt7047;
										while (local140 != null) {
											this.method5173(local140, local145 * local140.method5731() >> 8);
											local140 = local93.method5732();
										}
									}
									@Pc(164) Class6_Sub5 local164 = local93.aClass6_Sub5_8;
									local93.aClass6_Sub5_8 = null;
									if (local88 == null) {
										this.aClass6_Sub5Array5[local56] = local164;
									} else {
										local88.aClass6_Sub5_8 = local164;
									}
									if (local164 == null) {
										this.aClass6_Sub5Array6[local56] = local88;
									}
									local93 = local164;
								} else {
									local47 |= 0x1 << local56;
									local88 = local93;
									local93 = local93.aClass6_Sub5_8;
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
				@Pc(207) Class6_Sub5 local207 = this.aClass6_Sub5Array5[local56];
				this.aClass6_Sub5Array5[local56] = this.aClass6_Sub5Array6[local56] = null;
				while (local207 != null) {
					@Pc(221) Class6_Sub5 local221 = local207.aClass6_Sub5_8;
					local207.aClass6_Sub5_8 = null;
					local207 = local221;
				}
			}
		}
		if (this.anInt6189 < 0) {
			this.anInt6189 = 0;
		}
		if (this.aClass6_Sub5_7 != null) {
			this.aClass6_Sub5_7.method5734(arg0, 0, 256);
		}
		this.aLong182 = Static154.method2527();
	}

	@OriginalMember(owner = "client!wl", name = "c", descriptor = "()V")
	protected void method5168() {
	}

	@OriginalMember(owner = "client!wl", name = "c", descriptor = "(I)V")
	public void method5169(@OriginalArg(0) int arg0) throws Exception {
	}

	@OriginalMember(owner = "client!wl", name = "d", descriptor = "()V")
	protected void method5170() throws Exception {
	}

	@OriginalMember(owner = "client!wl", name = "d", descriptor = "(I)V")
	public final synchronized void method5171() {
		this.aBoolean413 = true;
		try {
			this.method5170();
		} catch (@Pc(16) Exception local16) {
			this.method5168();
			this.aLong183 = Static154.method2527() + 2000L;
		}
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(Ljava/awt/Component;)V")
	public void method5172(@OriginalArg(0) Component arg0) throws Exception {
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(Lclient!wg;II)V")
	private void method5173(@OriginalArg(0) Class6_Sub5 arg0, @OriginalArg(1) int arg1) {
		@Pc(11) int local11 = arg1 >> 5;
		@Pc(16) Class6_Sub5 local16 = this.aClass6_Sub5Array6[local11];
		if (local16 == null) {
			this.aClass6_Sub5Array5[local11] = arg0;
		} else {
			local16.aClass6_Sub5_8 = arg0;
		}
		this.aClass6_Sub5Array6[local11] = arg0;
		arg0.anInt7047 = arg1;
	}
}
