import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wm")
public class Class150 {

	@OriginalMember(owner = "client!wm", name = "l", descriptor = "[I")
	public int[] anIntArray360;

	@OriginalMember(owner = "client!wm", name = "E", descriptor = "Lclient!jn;")
	private Class6_Sub17 aClass6_Sub17_7;

	@OriginalMember(owner = "client!wm", name = "v", descriptor = "I")
	public int anInt6111;

	@OriginalMember(owner = "client!wm", name = "c", descriptor = "I")
	public int anInt6112;

	@OriginalMember(owner = "client!wm", name = "t", descriptor = "I")
	private int anInt6114;

	@OriginalMember(owner = "client!wm", name = "h", descriptor = "I")
	private final int anInt6103 = 32;

	@OriginalMember(owner = "client!wm", name = "y", descriptor = "Z")
	private boolean aBoolean449 = false;

	@OriginalMember(owner = "client!wm", name = "p", descriptor = "J")
	private long aLong207 = Static549.method7758();

	@OriginalMember(owner = "client!wm", name = "H", descriptor = "J")
	private long aLong209 = 0L;

	@OriginalMember(owner = "client!wm", name = "j", descriptor = "J")
	private long aLong208 = 0L;

	@OriginalMember(owner = "client!wm", name = "s", descriptor = "I")
	private int anInt6108 = 0;

	@OriginalMember(owner = "client!wm", name = "i", descriptor = "Z")
	private boolean aBoolean451 = true;

	@OriginalMember(owner = "client!wm", name = "x", descriptor = "[Lclient!jn;")
	private final Class6_Sub17[] aClass6_Sub17Array5 = new Class6_Sub17[8];

	@OriginalMember(owner = "client!wm", name = "I", descriptor = "I")
	private int anInt6109 = 0;

	@OriginalMember(owner = "client!wm", name = "F", descriptor = "[Lclient!jn;")
	private final Class6_Sub17[] aClass6_Sub17Array6 = new Class6_Sub17[8];

	@OriginalMember(owner = "client!wm", name = "n", descriptor = "I")
	private int anInt6115 = 0;

	@OriginalMember(owner = "client!wm", name = "C", descriptor = "I")
	private int anInt6113 = 0;

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(IBLclient!jn;)V")
	private void method5486(@OriginalArg(0) int arg0, @OriginalArg(2) Class6_Sub17 arg1) {
		@Pc(7) int local7 = arg0 >> 5;
		@Pc(12) Class6_Sub17 local12 = this.aClass6_Sub17Array5[local7];
		if (local12 == null) {
			this.aClass6_Sub17Array6[local7] = arg1;
		} else {
			local12.aClass6_Sub17_9 = arg1;
		}
		this.aClass6_Sub17Array5[local7] = arg1;
		arg1.anInt9308 = arg0;
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "()V")
	protected void method5488() throws Exception {
	}

	@OriginalMember(owner = "client!wm", name = "d", descriptor = "()V")
	protected void method5489() throws Exception {
	}

	@OriginalMember(owner = "client!wm", name = "b", descriptor = "(I)V")
	public final synchronized void method5490(@OriginalArg(0) int arg0) {
		if (this.aBoolean449) {
			return;
		}
		@Pc(13) long local13 = Static549.method7758();
		try {
			if (local13 > this.aLong207 + 6000L) {
				this.aLong207 = local13 - 6000L;
			}
			while (local13 > this.aLong207 + 5000L) {
				this.method5492();
				this.aLong207 += (long) (256000 / Static90.anInt9479);
				local13 = Static549.method7758();
			}
			if (arg0 < 53) {
				this.anInt6109 = -59;
			}
		} catch (@Pc(74) Exception local74) {
			this.aLong207 = local13;
		}
		if (this.anIntArray360 == null) {
			return;
		}
		try {
			if (this.aLong209 != 0L) {
				if (local13 < this.aLong209) {
					return;
				}
				this.method5496(this.anInt6112);
				this.aBoolean451 = true;
				this.aLong209 = 0L;
			}
			@Pc(109) int local109 = this.method5491();
			if (this.anInt6113 < this.anInt6115 - local109) {
				this.anInt6113 = this.anInt6115 - local109;
			}
			@Pc(135) int local135 = this.anInt6111 + this.anInt6114;
			if (local135 + 256 > 16384) {
				local135 = 16128;
			}
			if (local135 + 256 > this.anInt6112) {
				this.anInt6112 += 1024;
				if (this.anInt6112 > 16384) {
					this.anInt6112 = 16384;
				}
				this.method5497();
				local109 = 0;
				this.method5496(this.anInt6112);
				if (this.anInt6112 < local135 + 256) {
					local135 = this.anInt6112 - 256;
					this.anInt6114 = local135 - this.anInt6111;
				}
				this.aBoolean451 = true;
			}
			while (local135 > local109) {
				this.method5495(this.anIntArray360);
				local109 += 256;
				this.method5488();
			}
			if (this.aLong208 < local13) {
				if (this.aBoolean451) {
					this.aBoolean451 = false;
				} else if (this.anInt6113 == 0 && this.anInt6108 == 0) {
					this.method5497();
					this.aLong209 = local13 + 2000L;
					return;
				} else {
					this.anInt6114 = Math.min(this.anInt6108, this.anInt6113);
					this.anInt6108 = this.anInt6113;
				}
				this.aLong208 = local13 + 2000L;
				this.anInt6113 = 0;
			}
			this.anInt6115 = local109;
		} catch (@Pc(288) Exception local288) {
			this.method5497();
			this.aLong209 = local13 + 2000L;
		}
	}

	@OriginalMember(owner = "client!wm", name = "c", descriptor = "()I")
	protected int method5491() throws Exception {
		return this.anInt6112;
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(II)V")
	private void method5492() {
		this.anInt6109 -= 256;
		if (this.anInt6109 < 0) {
			this.anInt6109 = 0;
		}
		if (this.aClass6_Sub17_7 != null) {
			this.aClass6_Sub17_7.method8144(256);
		}
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(Lclient!jn;I)V")
	public final synchronized void method5493(@OriginalArg(0) Class6_Sub17 arg0) {
		this.aClass6_Sub17_7 = arg0;
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(Ljava/awt/Component;)V")
	public void method5494(@OriginalArg(0) Component arg0) throws Exception {
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "([II)V")
	private void method5495(@OriginalArg(0) int[] arg0) {
		@Pc(1) short local1 = 256;
		if (Static30.aBoolean32) {
			local1 = 512;
		}
		Static695.method5643(arg0, 0, local1);
		this.anInt6109 -= 256;
		if (this.aClass6_Sub17_7 != null && this.anInt6109 <= 0) {
			this.anInt6109 += Static90.anInt9479 >> 4;
			Static582.method8109(this.aClass6_Sub17_7);
			this.method5486(this.aClass6_Sub17_7.method8142(), this.aClass6_Sub17_7);
			@Pc(47) int local47 = 0;
			@Pc(49) int local49 = 255;
			@Pc(51) int local51 = 7;
			@Pc(58) int local58;
			label103: while (local49 != 0) {
				@Pc(63) int local63;
				if (local51 < 0) {
					local58 = local51 & 0x3;
					local63 = -(local51 >> 2);
				} else {
					local58 = local51;
					local63 = 0;
				}
				for (@Pc(74) int local74 = local49 >>> local58 & 0x11111111; local74 != 0; local74 >>>= 0x4) {
					if ((local74 & 0x1) != 0) {
						local49 &= ~(0x1 << local58);
						@Pc(92) Class6_Sub17 local92 = null;
						@Pc(97) Class6_Sub17 local97 = this.aClass6_Sub17Array6[local58];
						label97: while (true) {
							while (true) {
								if (local97 == null) {
									break label97;
								}
								@Pc(101) Class6_Sub54 local101 = local97.aClass6_Sub54_6;
								if (local101 == null || local101.anInt9978 <= local63) {
									local97.aBoolean693 = true;
									@Pc(127) int local127 = local97.method8141();
									local47 += local127;
									if (local101 != null) {
										local101.anInt9978 += local127;
									}
									if (local47 >= this.anInt6103) {
										break label103;
									}
									@Pc(148) Class6_Sub17 local148 = local97.method8140();
									if (local148 != null) {
										@Pc(153) int local153 = local97.anInt9308;
										while (local148 != null) {
											this.method5486(local153 * local148.method8142() >> 8, local148);
											local148 = local97.method8143();
										}
									}
									@Pc(172) Class6_Sub17 local172 = local97.aClass6_Sub17_9;
									local97.aClass6_Sub17_9 = null;
									if (local92 == null) {
										this.aClass6_Sub17Array6[local58] = local172;
									} else {
										local92.aClass6_Sub17_9 = local172;
									}
									if (local172 == null) {
										this.aClass6_Sub17Array5[local58] = local92;
									}
									local97 = local172;
								} else {
									local49 |= 0x1 << local58;
									local92 = local97;
									local97 = local97.aClass6_Sub17_9;
								}
							}
						}
					}
					local58 += 4;
					local63++;
				}
				local51--;
			}
			for (local58 = 0; local58 < 8; local58++) {
				@Pc(218) Class6_Sub17 local218 = this.aClass6_Sub17Array6[local58];
				this.aClass6_Sub17Array6[local58] = this.aClass6_Sub17Array5[local58] = null;
				while (local218 != null) {
					@Pc(232) Class6_Sub17 local232 = local218.aClass6_Sub17_9;
					local218.aClass6_Sub17_9 = null;
					local218 = local232;
				}
			}
		}
		if (this.anInt6109 < 0) {
			this.anInt6109 = 0;
		}
		if (this.aClass6_Sub17_7 != null) {
			this.aClass6_Sub17_7.method8139(arg0, 0, 256);
		}
		this.aLong207 = Static549.method7758();
	}

	@OriginalMember(owner = "client!wm", name = "c", descriptor = "(I)V")
	public void method5496(@OriginalArg(0) int arg0) throws Exception {
	}

	@OriginalMember(owner = "client!wm", name = "b", descriptor = "()V")
	protected void method5497() {
	}

	@OriginalMember(owner = "client!wm", name = "b", descriptor = "(B)V")
	public final synchronized void method5500() {
		if (Static446.aClass218_1 != null) {
			@Pc(5) boolean local5 = true;
			for (@Pc(7) int local7 = 0; local7 < 2; local7++) {
				if (Static446.aClass218_1.aClass150Array1[local7] == this) {
					Static446.aClass218_1.aClass150Array1[local7] = null;
				}
				if (Static446.aClass218_1.aClass150Array1[local7] != null) {
					local5 = false;
				}
			}
			if (local5) {
				Static446.aClass218_1.aBoolean423 = true;
				while (Static446.aClass218_1.aBoolean424) {
					Static255.method4444(50L);
				}
				Static446.aClass218_1 = null;
			}
		}
		this.method5497();
		this.anIntArray360 = null;
		this.aBoolean449 = true;
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(I)V")
	public final synchronized void method5501() {
		this.aBoolean451 = true;
		try {
			this.method5489();
		} catch (@Pc(15) Exception local15) {
			this.method5497();
			this.aLong209 = Static549.method7758() + 2000L;
		}
	}
}
