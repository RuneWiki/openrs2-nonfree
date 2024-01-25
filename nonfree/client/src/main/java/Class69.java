import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pr")
public class Class69 {

	@OriginalMember(owner = "client!pr", name = "f", descriptor = "[I")
	public int[] anIntArray615;

	@OriginalMember(owner = "client!pr", name = "h", descriptor = "Lclient!ff;")
	private Class12_Sub13 aClass12_Sub13_7;

	@OriginalMember(owner = "client!pr", name = "A", descriptor = "I")
	public int anInt8252;

	@OriginalMember(owner = "client!pr", name = "B", descriptor = "I")
	public int anInt8253;

	@OriginalMember(owner = "client!pr", name = "D", descriptor = "I")
	private int anInt8254;

	@OriginalMember(owner = "client!pr", name = "b", descriptor = "Z")
	private boolean aBoolean561 = false;

	@OriginalMember(owner = "client!pr", name = "r", descriptor = "I")
	private final int anInt8247 = 32;

	@OriginalMember(owner = "client!pr", name = "o", descriptor = "J")
	private long aLong215 = Static76.method1679();

	@OriginalMember(owner = "client!pr", name = "y", descriptor = "I")
	private int anInt8251 = 0;

	@OriginalMember(owner = "client!pr", name = "w", descriptor = "[Lclient!ff;")
	private final Class12_Sub13[] aClass12_Sub13Array5 = new Class12_Sub13[8];

	@OriginalMember(owner = "client!pr", name = "E", descriptor = "I")
	private int anInt8255 = 0;

	@OriginalMember(owner = "client!pr", name = "G", descriptor = "I")
	private int anInt8256 = 0;

	@OriginalMember(owner = "client!pr", name = "F", descriptor = "[Lclient!ff;")
	private final Class12_Sub13[] aClass12_Sub13Array6 = new Class12_Sub13[8];

	@OriginalMember(owner = "client!pr", name = "H", descriptor = "I")
	private int anInt8257 = 0;

	@OriginalMember(owner = "client!pr", name = "z", descriptor = "J")
	private long aLong216 = 0L;

	@OriginalMember(owner = "client!pr", name = "x", descriptor = "Z")
	private boolean aBoolean563 = true;

	@OriginalMember(owner = "client!pr", name = "I", descriptor = "J")
	private long aLong217 = 0L;

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(I)V")
	public final synchronized void method6836() {
		if (Static12.aClass318_1 != null) {
			@Pc(5) boolean local5 = true;
			for (@Pc(7) int local7 = 0; local7 < 2; local7++) {
				if (Static12.aClass318_1.aClass69Array1[local7] == this) {
					Static12.aClass318_1.aClass69Array1[local7] = null;
				}
				if (Static12.aClass318_1.aClass69Array1[local7] != null) {
					local5 = false;
				}
			}
			if (local5) {
				Static12.aClass318_1.aBoolean681 = true;
				while (Static12.aClass318_1.aBoolean682) {
					Static17.method388(50L);
				}
				Static12.aClass318_1 = null;
			}
		}
		this.method6843();
		this.aBoolean561 = true;
		this.anIntArray615 = null;
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "()V")
	protected void method6837() throws Exception {
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "([II)V")
	private void method6838(@OriginalArg(0) int[] arg0) {
		@Pc(1) short local1 = 256;
		if (Static140.aBoolean250) {
			local1 = 512;
		}
		Static554.method3499(arg0, 0, local1);
		this.anInt8255 -= 256;
		if (this.aClass12_Sub13_7 != null && this.anInt8255 <= 0) {
			this.anInt8255 += Static426.anInt6103 >> 4;
			Static353.method5525(this.aClass12_Sub13_7);
			this.method6839(this.aClass12_Sub13_7, this.aClass12_Sub13_7.method7671());
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
						@Pc(88) Class12_Sub13 local88 = null;
						@Pc(93) Class12_Sub13 local93 = this.aClass12_Sub13Array5[local56];
						label97: while (true) {
							while (true) {
								if (local93 == null) {
									break label97;
								}
								@Pc(97) Class12_Sub29 local97 = local93.aClass12_Sub29_5;
								if (local97 == null || local97.anInt5184 <= local61) {
									local93.aBoolean658 = true;
									@Pc(121) int local121 = local93.method7672();
									local45 += local121;
									if (local97 != null) {
										local97.anInt5184 += local121;
									}
									if (local45 >= this.anInt8247) {
										break label103;
									}
									@Pc(140) Class12_Sub13 local140 = local93.method7674();
									if (local140 != null) {
										@Pc(145) int local145 = local93.anInt9310;
										while (local140 != null) {
											this.method6839(local140, local145 * local140.method7671() >> 8);
											local140 = local93.method7673();
										}
									}
									@Pc(164) Class12_Sub13 local164 = local93.aClass12_Sub13_8;
									local93.aClass12_Sub13_8 = null;
									if (local88 == null) {
										this.aClass12_Sub13Array5[local56] = local164;
									} else {
										local88.aClass12_Sub13_8 = local164;
									}
									if (local164 == null) {
										this.aClass12_Sub13Array6[local56] = local88;
									}
									local93 = local164;
								} else {
									local47 |= 0x1 << local56;
									local88 = local93;
									local93 = local93.aClass12_Sub13_8;
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
				@Pc(207) Class12_Sub13 local207 = this.aClass12_Sub13Array5[local56];
				this.aClass12_Sub13Array5[local56] = this.aClass12_Sub13Array6[local56] = null;
				while (local207 != null) {
					@Pc(221) Class12_Sub13 local221 = local207.aClass12_Sub13_8;
					local207.aClass12_Sub13_8 = null;
					local207 = local221;
				}
			}
		}
		if (this.anInt8255 < 0) {
			this.anInt8255 = 0;
		}
		if (this.aClass12_Sub13_7 != null) {
			this.aClass12_Sub13_7.method7676(arg0, 0, 256);
		}
		this.aLong215 = Static76.method1679();
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(Lclient!ff;IB)V")
	private void method6839(@OriginalArg(0) Class12_Sub13 arg0, @OriginalArg(1) int arg1) {
		@Pc(13) int local13 = arg1 >> 5;
		@Pc(18) Class12_Sub13 local18 = this.aClass12_Sub13Array6[local13];
		if (local18 == null) {
			this.aClass12_Sub13Array5[local13] = arg0;
		} else {
			local18.aClass12_Sub13_8 = arg0;
		}
		this.aClass12_Sub13Array6[local13] = arg0;
		arg0.anInt9310 = arg1;
	}

	@OriginalMember(owner = "client!pr", name = "b", descriptor = "(I)V")
	public final synchronized void method6840() {
		if (this.aBoolean561) {
			return;
		}
		@Pc(12) long local12 = Static76.method1679();
		try {
			if (this.aLong215 + 500000L < local12) {
				this.aLong215 = local12 - 500000L;
			}
			while (this.aLong215 + 5000L < local12) {
				this.method6851();
				this.aLong215 += 256000 / Static426.anInt6103;
			}
		} catch (@Pc(52) Exception local52) {
			this.aLong215 = local12;
		}
		if (this.anIntArray615 == null) {
			return;
		}
		try {
			if (this.aLong217 != 0L) {
				if (this.aLong217 > local12) {
					return;
				}
				this.method6846(this.anInt8252);
				this.aBoolean563 = true;
				this.aLong217 = 0L;
			}
			@Pc(91) int local91 = this.method6847();
			if (this.anInt8251 - local91 > this.anInt8257) {
				this.anInt8257 = this.anInt8251 - local91;
			}
			@Pc(117) int local117 = this.anInt8253 + this.anInt8254;
			if (local117 + 256 > 16384) {
				local117 = 16128;
			}
			if (this.anInt8252 < local117 + 256) {
				this.anInt8252 += 1024;
				if (this.anInt8252 > 16384) {
					this.anInt8252 = 16384;
				}
				this.method6843();
				local91 = 0;
				this.method6846(this.anInt8252);
				if (this.anInt8252 < local117 + 256) {
					local117 = this.anInt8252 - 256;
					this.anInt8254 = local117 - this.anInt8253;
				}
				this.aBoolean563 = true;
			}
			while (local91 < local117) {
				this.method6838(this.anIntArray615);
				local91 += 256;
				this.method6844();
			}
			if (local12 > this.aLong216) {
				if (this.aBoolean563) {
					this.aBoolean563 = false;
				} else if (this.anInt8257 == 0 && this.anInt8256 == 0) {
					this.method6843();
					this.aLong217 = local12 + 2000L;
					return;
				} else {
					this.anInt8254 = Math.min(this.anInt8256, this.anInt8257);
					this.anInt8256 = this.anInt8257;
				}
				this.anInt8257 = 0;
				this.aLong216 = local12 + 2000L;
			}
			this.anInt8251 = local91;
		} catch (@Pc(249) Exception local249) {
			this.method6843();
			this.aLong217 = local12 + 2000L;
		}
	}

	@OriginalMember(owner = "client!pr", name = "b", descriptor = "()V")
	protected void method6843() {
	}

	@OriginalMember(owner = "client!pr", name = "c", descriptor = "()V")
	protected void method6844() throws Exception {
	}

	@OriginalMember(owner = "client!pr", name = "c", descriptor = "(I)V")
	public final synchronized void method6845() {
		this.aBoolean563 = true;
		try {
			this.method6837();
		} catch (@Pc(14) Exception local14) {
			this.method6843();
			this.aLong217 = Static76.method1679() + 2000L;
		}
	}

	@OriginalMember(owner = "client!pr", name = "d", descriptor = "(I)V")
	public void method6846(@OriginalArg(0) int arg0) throws Exception {
	}

	@OriginalMember(owner = "client!pr", name = "d", descriptor = "()I")
	protected int method6847() throws Exception {
		return this.anInt8252;
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(BLclient!ff;)V")
	public final synchronized void method6848(@OriginalArg(1) Class12_Sub13 arg0) {
		this.aClass12_Sub13_7 = arg0;
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(Ljava/awt/Component;)V")
	public void method6849(@OriginalArg(0) Component arg0) throws Exception {
	}

	@OriginalMember(owner = "client!pr", name = "b", descriptor = "(II)V")
	private void method6851() {
		this.anInt8255 -= 256;
		if (this.anInt8255 < 0) {
			this.anInt8255 = 0;
		}
		if (this.aClass12_Sub13_7 != null) {
			this.aClass12_Sub13_7.method7675(256);
		}
	}
}
