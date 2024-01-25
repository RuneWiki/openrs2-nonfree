import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cv")
public class Class8 {

	@OriginalMember(owner = "client!cv", name = "j", descriptor = "[I")
	public int[] anIntArray393;

	@OriginalMember(owner = "client!cv", name = "k", descriptor = "Lclient!nj;")
	private Class3_Sub4 aClass3_Sub4_6;

	@OriginalMember(owner = "client!cv", name = "z", descriptor = "I")
	private int anInt6467;

	@OriginalMember(owner = "client!cv", name = "C", descriptor = "I")
	public int anInt6469;

	@OriginalMember(owner = "client!cv", name = "E", descriptor = "I")
	public int anInt6471;

	@OriginalMember(owner = "client!cv", name = "m", descriptor = "I")
	private final int anInt6459 = 32;

	@OriginalMember(owner = "client!cv", name = "d", descriptor = "Z")
	private boolean aBoolean479 = false;

	@OriginalMember(owner = "client!cv", name = "g", descriptor = "J")
	private long aLong176 = Static158.method2936();

	@OriginalMember(owner = "client!cv", name = "u", descriptor = "J")
	private long aLong177 = 0L;

	@OriginalMember(owner = "client!cv", name = "v", descriptor = "I")
	private int anInt6465 = 0;

	@OriginalMember(owner = "client!cv", name = "t", descriptor = "[Lclient!nj;")
	private final Class3_Sub4[] aClass3_Sub4Array5 = new Class3_Sub4[8];

	@OriginalMember(owner = "client!cv", name = "w", descriptor = "J")
	private long aLong178 = 0L;

	@OriginalMember(owner = "client!cv", name = "B", descriptor = "I")
	private int anInt6468 = 0;

	@OriginalMember(owner = "client!cv", name = "A", descriptor = "Z")
	private boolean aBoolean480 = true;

	@OriginalMember(owner = "client!cv", name = "y", descriptor = "[Lclient!nj;")
	private final Class3_Sub4[] aClass3_Sub4Array6 = new Class3_Sub4[8];

	@OriginalMember(owner = "client!cv", name = "F", descriptor = "I")
	private int anInt6472 = 0;

	@OriginalMember(owner = "client!cv", name = "D", descriptor = "I")
	private int anInt6470 = 0;

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "(IB)V")
	private void method5514() {
		this.anInt6465 -= 256;
		if (this.anInt6465 < 0) {
			this.anInt6465 = 0;
		}
		if (this.aClass3_Sub4_6 != null) {
			this.aClass3_Sub4_6.method6658(256);
		}
	}

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "(BLclient!nj;)V")
	public final synchronized void method5515(@OriginalArg(1) Class3_Sub4 arg0) {
		this.aClass3_Sub4_6 = arg0;
	}

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "(BILclient!nj;)V")
	private void method5517(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub4 arg1) {
		@Pc(7) int local7 = arg0 >> 5;
		@Pc(17) Class3_Sub4 local17 = this.aClass3_Sub4Array5[local7];
		if (local17 == null) {
			this.aClass3_Sub4Array6[local7] = arg1;
		} else {
			local17.aClass3_Sub4_8 = arg1;
		}
		this.aClass3_Sub4Array5[local7] = arg1;
		arg1.anInt8016 = arg0;
	}

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "(Ljava/awt/Component;)V")
	public void method5518(@OriginalArg(0) Component arg0) throws Exception {
	}

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "([II)V")
	private void method5519(@OriginalArg(0) int[] arg0) {
		@Pc(1) short local1 = 256;
		if (Static305.aBoolean394) {
			local1 = 512;
		}
		Static601.method2821(arg0, 0, local1);
		this.anInt6465 -= 256;
		if (this.aClass3_Sub4_6 != null && this.anInt6465 <= 0) {
			this.anInt6465 += Static404.anInt6999 >> 4;
			Static122.method2503(this.aClass3_Sub4_6);
			this.method5517(this.aClass3_Sub4_6.method6657(), this.aClass3_Sub4_6);
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
						@Pc(88) Class3_Sub4 local88 = null;
						@Pc(93) Class3_Sub4 local93 = this.aClass3_Sub4Array6[local56];
						label97: while (true) {
							while (true) {
								if (local93 == null) {
									break label97;
								}
								@Pc(97) Class3_Sub48 local97 = local93.aClass3_Sub48_5;
								if (local97 == null || local97.anInt8528 <= local61) {
									local93.aBoolean621 = true;
									@Pc(121) int local121 = local93.method6655();
									local45 += local121;
									if (local97 != null) {
										local97.anInt8528 += local121;
									}
									if (local45 >= this.anInt6459) {
										break label103;
									}
									@Pc(140) Class3_Sub4 local140 = local93.method6656();
									if (local140 != null) {
										@Pc(145) int local145 = local93.anInt8016;
										while (local140 != null) {
											this.method5517(local145 * local140.method6657() >> 8, local140);
											local140 = local93.method6660();
										}
									}
									@Pc(164) Class3_Sub4 local164 = local93.aClass3_Sub4_8;
									local93.aClass3_Sub4_8 = null;
									if (local88 == null) {
										this.aClass3_Sub4Array6[local56] = local164;
									} else {
										local88.aClass3_Sub4_8 = local164;
									}
									if (local164 == null) {
										this.aClass3_Sub4Array5[local56] = local88;
									}
									local93 = local164;
								} else {
									local47 |= 0x1 << local56;
									local88 = local93;
									local93 = local93.aClass3_Sub4_8;
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
				@Pc(207) Class3_Sub4 local207 = this.aClass3_Sub4Array6[local56];
				this.aClass3_Sub4Array6[local56] = this.aClass3_Sub4Array5[local56] = null;
				while (local207 != null) {
					@Pc(221) Class3_Sub4 local221 = local207.aClass3_Sub4_8;
					local207.aClass3_Sub4_8 = null;
					local207 = local221;
				}
			}
		}
		if (this.anInt6465 < 0) {
			this.anInt6465 = 0;
		}
		if (this.aClass3_Sub4_6 != null) {
			this.aClass3_Sub4_6.method6654(arg0, 0, 256);
		}
		this.aLong176 = Static158.method2936();
	}

	@OriginalMember(owner = "client!cv", name = "b", descriptor = "()V")
	protected void method5520() throws Exception {
	}

	@OriginalMember(owner = "client!cv", name = "c", descriptor = "()I")
	protected int method5521() throws Exception {
		return this.anInt6469;
	}

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "(I)V")
	public void method5522(@OriginalArg(0) int arg0) throws Exception {
	}

	@OriginalMember(owner = "client!cv", name = "d", descriptor = "()V")
	protected void method5523() {
	}

	@OriginalMember(owner = "client!cv", name = "b", descriptor = "(I)V")
	public final synchronized void method5524() {
		if (Static62.aClass250_1 != null) {
			@Pc(13) boolean local13 = true;
			for (@Pc(15) int local15 = 0; local15 < 2; local15++) {
				if (Static62.aClass250_1.aClass8Array1[local15] == this) {
					Static62.aClass250_1.aClass8Array1[local15] = null;
				}
				if (Static62.aClass250_1.aClass8Array1[local15] != null) {
					local13 = false;
				}
			}
			if (local13) {
				Static62.aClass250_1.aBoolean519 = true;
				while (Static62.aClass250_1.aBoolean520) {
					Static589.method7892(50L);
				}
				Static62.aClass250_1 = null;
			}
		}
		this.method5523();
		this.aBoolean479 = true;
		this.anIntArray393 = null;
	}

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "(B)V")
	public final synchronized void method5525() {
		if (this.aBoolean479) {
			return;
		}
		@Pc(20) long local20 = Static158.method2936();
		try {
			if (local20 > this.aLong176 + 500000L) {
				this.aLong176 = local20 - 500000L;
			}
			while (local20 > this.aLong176 + 5000L) {
				this.method5514();
				this.aLong176 += 256000 / Static404.anInt6999;
			}
		} catch (@Pc(64) Exception local64) {
			this.aLong176 = local20;
		}
		if (this.anIntArray393 == null) {
			return;
		}
		try {
			if (this.aLong177 != 0L) {
				if (this.aLong177 > local20) {
					return;
				}
				this.method5522(this.anInt6469);
				this.aBoolean480 = true;
				this.aLong177 = 0L;
			}
			@Pc(97) int local97 = this.method5521();
			if (this.anInt6470 - local97 > this.anInt6468) {
				this.anInt6468 = this.anInt6470 - local97;
			}
			@Pc(123) int local123 = this.anInt6471 + this.anInt6467;
			if (local123 + 256 > 16384) {
				local123 = 16128;
			}
			if (local123 + 256 > this.anInt6469) {
				this.anInt6469 += 1024;
				if (this.anInt6469 > 16384) {
					this.anInt6469 = 16384;
				}
				this.method5523();
				this.method5522(this.anInt6469);
				local97 = 0;
				if (local123 + 256 > this.anInt6469) {
					local123 = this.anInt6469 - 256;
					this.anInt6467 = local123 - this.anInt6471;
				}
				this.aBoolean480 = true;
			}
			while (local97 < local123) {
				this.method5519(this.anIntArray393);
				this.method5527();
				local97 += 256;
			}
			if (local20 > this.aLong178) {
				if (this.aBoolean480) {
					this.aBoolean480 = false;
				} else if (this.anInt6468 == 0 && this.anInt6472 == 0) {
					this.method5523();
					this.aLong177 = local20 + 2000L;
					return;
				} else {
					this.anInt6467 = Math.min(this.anInt6472, this.anInt6468);
					this.anInt6472 = this.anInt6468;
				}
				this.anInt6468 = 0;
				this.aLong178 = local20 + 2000L;
			}
			this.anInt6470 = local97;
		} catch (@Pc(250) Exception local250) {
			this.method5523();
			this.aLong177 = local20 + 2000L;
		}
	}

	@OriginalMember(owner = "client!cv", name = "e", descriptor = "()V")
	protected void method5527() throws Exception {
	}

	@OriginalMember(owner = "client!cv", name = "d", descriptor = "(I)V")
	public final synchronized void method5528() {
		this.aBoolean480 = true;
		try {
			this.method5520();
		} catch (@Pc(16) Exception local16) {
			this.method5523();
			this.aLong177 = Static158.method2936() + 2000L;
		}
	}
}
