import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ck")
public class Class34 {

	@OriginalMember(owner = "client!ck", name = "l", descriptor = "Lclient!wm;")
	private Class6_Sub12 aClass6_Sub12_8;

	@OriginalMember(owner = "client!ck", name = "p", descriptor = "[I")
	public int[] anIntArray722;

	@OriginalMember(owner = "client!ck", name = "C", descriptor = "I")
	public int anInt6401;

	@OriginalMember(owner = "client!ck", name = "F", descriptor = "I")
	public int anInt6402;

	@OriginalMember(owner = "client!ck", name = "H", descriptor = "I")
	private int anInt6403;

	@OriginalMember(owner = "client!ck", name = "o", descriptor = "I")
	private final int anInt6391 = 32;

	@OriginalMember(owner = "client!ck", name = "r", descriptor = "Z")
	private boolean aBoolean430 = false;

	@OriginalMember(owner = "client!ck", name = "t", descriptor = "J")
	private long aLong220 = Static245.method4300();

	@OriginalMember(owner = "client!ck", name = "D", descriptor = "Z")
	private boolean aBoolean431 = true;

	@OriginalMember(owner = "client!ck", name = "G", descriptor = "[Lclient!wm;")
	private final Class6_Sub12[] aClass6_Sub12Array6 = new Class6_Sub12[8];

	@OriginalMember(owner = "client!ck", name = "E", descriptor = "[Lclient!wm;")
	private final Class6_Sub12[] aClass6_Sub12Array5 = new Class6_Sub12[8];

	@OriginalMember(owner = "client!ck", name = "J", descriptor = "I")
	private int anInt6405 = 0;

	@OriginalMember(owner = "client!ck", name = "I", descriptor = "I")
	private int anInt6404 = 0;

	@OriginalMember(owner = "client!ck", name = "K", descriptor = "J")
	private long aLong221 = 0L;

	@OriginalMember(owner = "client!ck", name = "L", descriptor = "J")
	private long aLong222 = 0L;

	@OriginalMember(owner = "client!ck", name = "M", descriptor = "I")
	private int anInt6406 = 0;

	@OriginalMember(owner = "client!ck", name = "N", descriptor = "I")
	private int anInt6407 = 0;

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(I)V")
	public void method5818(@OriginalArg(0) int arg0) throws Exception {
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "([II)V")
	private void method5819(@OriginalArg(0) int[] arg0) {
		@Pc(1) short local1 = 256;
		if (Static16.aBoolean25) {
			local1 = 512;
		}
		Static358.method956(arg0, 0, local1);
		this.anInt6406 -= 256;
		if (this.aClass6_Sub12_8 != null && this.anInt6406 <= 0) {
			this.anInt6406 += Static22.anInt358 >> 4;
			Static69.method417(this.aClass6_Sub12_8);
			this.method5834(this.aClass6_Sub12_8, this.aClass6_Sub12_8.method5658());
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
						@Pc(88) Class6_Sub12 local88 = null;
						@Pc(93) Class6_Sub12 local93 = this.aClass6_Sub12Array5[local56];
						label97: while (true) {
							while (true) {
								if (local93 == null) {
									break label97;
								}
								@Pc(97) Class6_Sub11 local97 = local93.aClass6_Sub11_5;
								if (local97 == null || local97.anInt2219 <= local61) {
									local93.aBoolean416 = true;
									@Pc(121) int local121 = local93.method5656();
									local45 += local121;
									if (local97 != null) {
										local97.anInt2219 += local121;
									}
									if (local45 >= this.anInt6391) {
										break label103;
									}
									@Pc(140) Class6_Sub12 local140 = local93.method5652();
									if (local140 != null) {
										@Pc(145) int local145 = local93.anInt6244;
										while (local140 != null) {
											this.method5834(local140, local145 * local140.method5658() >> 8);
											local140 = local93.method5655();
										}
									}
									@Pc(164) Class6_Sub12 local164 = local93.aClass6_Sub12_7;
									local93.aClass6_Sub12_7 = null;
									if (local88 == null) {
										this.aClass6_Sub12Array5[local56] = local164;
									} else {
										local88.aClass6_Sub12_7 = local164;
									}
									if (local164 == null) {
										this.aClass6_Sub12Array6[local56] = local88;
									}
									local93 = local164;
								} else {
									local47 |= 0x1 << local56;
									local88 = local93;
									local93 = local93.aClass6_Sub12_7;
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
				@Pc(207) Class6_Sub12 local207 = this.aClass6_Sub12Array5[local56];
				this.aClass6_Sub12Array5[local56] = this.aClass6_Sub12Array6[local56] = null;
				while (local207 != null) {
					@Pc(221) Class6_Sub12 local221 = local207.aClass6_Sub12_7;
					local207.aClass6_Sub12_7 = null;
					local207 = local221;
				}
			}
		}
		if (this.anInt6406 < 0) {
			this.anInt6406 = 0;
		}
		if (this.aClass6_Sub12_8 != null) {
			this.aClass6_Sub12_8.method5657(arg0, 0, 256);
		}
		this.aLong220 = Static245.method4300();
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(II)V")
	private void method5820() {
		this.anInt6406 -= 256;
		if (this.anInt6406 < 0) {
			this.anInt6406 = 0;
		}
		if (this.aClass6_Sub12_8 != null) {
			this.aClass6_Sub12_8.method5654(256);
		}
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(Lclient!wm;B)V")
	public final synchronized void method5823(@OriginalArg(0) Class6_Sub12 arg0) {
		this.aClass6_Sub12_8 = arg0;
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(Ljava/awt/Component;)V")
	public void method5824(@OriginalArg(0) Component arg0) throws Exception {
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "()V")
	protected void method5826() throws Exception {
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(Z)V")
	public final synchronized void method5827() {
		if (Static225.aClass33_1 != null) {
			@Pc(5) boolean local5 = true;
			for (@Pc(7) int local7 = 0; local7 < 2; local7++) {
				if (Static225.aClass33_1.aClass34Array1[local7] == this) {
					Static225.aClass33_1.aClass34Array1[local7] = null;
				}
				if (Static225.aClass33_1.aClass34Array1[local7] != null) {
					local5 = false;
				}
			}
			if (local5) {
				Static225.aClass33_1.aBoolean55 = true;
				while (Static225.aClass33_1.aBoolean53) {
					Static278.method5283(50L);
				}
				Static225.aClass33_1 = null;
			}
		}
		this.method5828();
		this.aBoolean430 = true;
		this.anIntArray722 = null;
	}

	@OriginalMember(owner = "client!ck", name = "b", descriptor = "()V")
	protected void method5828() {
	}

	@OriginalMember(owner = "client!ck", name = "b", descriptor = "(Z)V")
	public final synchronized void method5829() {
		this.aBoolean431 = true;
		try {
			this.method5833();
		} catch (@Pc(10) Exception local10) {
			this.method5828();
			this.aLong221 = Static245.method4300() + 2000L;
		}
	}

	@OriginalMember(owner = "client!ck", name = "c", descriptor = "()I")
	protected int method5830() throws Exception {
		return this.anInt6402;
	}

	@OriginalMember(owner = "client!ck", name = "c", descriptor = "(I)V")
	public final void method5831() {
		this.aBoolean431 = true;
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(B)V")
	public final synchronized void method5832() {
		if (this.aBoolean430) {
			return;
		}
		@Pc(12) long local12 = Static245.method4300();
		try {
			if (local12 > this.aLong220 + 500000L) {
				this.aLong220 = local12 - 500000L;
			}
			while (local12 > this.aLong220 + 5000L) {
				this.method5820();
				this.aLong220 += 256000 / Static22.anInt358;
			}
		} catch (@Pc(48) Exception local48) {
			this.aLong220 = local12;
		}
		if (this.anIntArray722 == null) {
			return;
		}
		try {
			if (this.aLong221 != 0L) {
				if (local12 < this.aLong221) {
					return;
				}
				this.method5818(this.anInt6402);
				this.aLong221 = 0L;
				this.aBoolean431 = true;
			}
			@Pc(85) int local85 = this.method5830();
			if (this.anInt6404 < this.anInt6405 - local85) {
				this.anInt6404 = this.anInt6405 - local85;
			}
			@Pc(106) int local106 = this.anInt6403 + this.anInt6401;
			if (local106 + 256 > 16384) {
				local106 = 16128;
			}
			if (this.anInt6402 < local106 + 256) {
				this.anInt6402 += 1024;
				if (this.anInt6402 > 16384) {
					this.anInt6402 = 16384;
				}
				this.method5828();
				local85 = 0;
				this.method5818(this.anInt6402);
				if (local106 + 256 > this.anInt6402) {
					local106 = this.anInt6402 - 256;
					this.anInt6403 = local106 - this.anInt6401;
				}
				this.aBoolean431 = true;
			}
			while (local106 > local85) {
				this.method5819(this.anIntArray722);
				local85 += 256;
				this.method5826();
			}
			if (this.aLong222 < local12) {
				if (this.aBoolean431) {
					this.aBoolean431 = false;
				} else if (this.anInt6404 == 0 && this.anInt6407 == 0) {
					this.method5828();
					this.aLong221 = local12 + 2000L;
					return;
				} else {
					this.anInt6403 = Math.min(this.anInt6407, this.anInt6404);
					this.anInt6407 = this.anInt6404;
				}
				this.anInt6404 = 0;
				this.aLong222 = local12 + 2000L;
			}
			this.anInt6405 = local85;
		} catch (@Pc(246) Exception local246) {
			this.method5828();
			this.aLong221 = local12 + 2000L;
		}
	}

	@OriginalMember(owner = "client!ck", name = "d", descriptor = "()V")
	protected void method5833() throws Exception {
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(BLclient!wm;I)V")
	private void method5834(@OriginalArg(1) Class6_Sub12 arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = arg1 >> 5;
		@Pc(12) Class6_Sub12 local12 = this.aClass6_Sub12Array6[local7];
		if (local12 == null) {
			this.aClass6_Sub12Array5[local7] = arg0;
		} else {
			local12.aClass6_Sub12_7 = arg0;
		}
		this.aClass6_Sub12Array6[local7] = arg0;
		arg0.anInt6244 = arg1;
	}
}
