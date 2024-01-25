import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lv")
public class Class232 {

	@OriginalMember(owner = "client!lv", name = "f", descriptor = "Lclient!ri;")
	private Class3_Sub9 aClass3_Sub9_9;

	@OriginalMember(owner = "client!lv", name = "j", descriptor = "[I")
	public int[] anIntArray642;

	@OriginalMember(owner = "client!lv", name = "q", descriptor = "I")
	public int anInt10005;

	@OriginalMember(owner = "client!lv", name = "x", descriptor = "I")
	private int anInt10010;

	@OriginalMember(owner = "client!lv", name = "z", descriptor = "I")
	public int anInt10011;

	@OriginalMember(owner = "client!lv", name = "g", descriptor = "I")
	private final int anInt9999 = 32;

	@OriginalMember(owner = "client!lv", name = "n", descriptor = "Z")
	private boolean aBoolean736 = false;

	@OriginalMember(owner = "client!lv", name = "i", descriptor = "J")
	private long aLong298 = Static131.method2268();

	@OriginalMember(owner = "client!lv", name = "p", descriptor = "J")
	private long aLong299 = 0L;

	@OriginalMember(owner = "client!lv", name = "v", descriptor = "[Lclient!ri;")
	private final Class3_Sub9[] aClass3_Sub9Array5 = new Class3_Sub9[8];

	@OriginalMember(owner = "client!lv", name = "r", descriptor = "I")
	private int anInt10006 = 0;

	@OriginalMember(owner = "client!lv", name = "w", descriptor = "J")
	private long aLong300 = 0L;

	@OriginalMember(owner = "client!lv", name = "y", descriptor = "Z")
	private boolean aBoolean737 = true;

	@OriginalMember(owner = "client!lv", name = "D", descriptor = "[Lclient!ri;")
	private final Class3_Sub9[] aClass3_Sub9Array6 = new Class3_Sub9[8];

	@OriginalMember(owner = "client!lv", name = "C", descriptor = "I")
	private int anInt10014 = 0;

	@OriginalMember(owner = "client!lv", name = "t", descriptor = "I")
	private int anInt10008 = 0;

	@OriginalMember(owner = "client!lv", name = "E", descriptor = "I")
	private int anInt10015 = 0;

	@OriginalMember(owner = "client!lv", name = "a", descriptor = "()V")
	protected void method8508() throws Exception {
	}

	@OriginalMember(owner = "client!lv", name = "b", descriptor = "()I")
	protected int method8509() throws Exception {
		return this.anInt10005;
	}

	@OriginalMember(owner = "client!lv", name = "a", descriptor = "(BI)V")
	private void method8510() {
		this.anInt10008 -= 256;
		if (this.anInt10008 < 0) {
			this.anInt10008 = 0;
		}
		if (this.aClass3_Sub9_9 != null) {
			this.aClass3_Sub9_9.method6701(256);
		}
	}

	@OriginalMember(owner = "client!lv", name = "a", descriptor = "(I)V")
	public final synchronized void method8511() {
		this.aBoolean737 = true;
		try {
			this.method8508();
		} catch (@Pc(13) Exception local13) {
			this.method8522();
			this.aLong299 = Static131.method2268() + 2000L;
		}
	}

	@OriginalMember(owner = "client!lv", name = "a", descriptor = "(Lclient!ri;II)V")
	private void method8512(@OriginalArg(0) Class3_Sub9 arg0, @OriginalArg(1) int arg1) {
		@Pc(7) int local7 = arg1 >> 5;
		@Pc(20) Class3_Sub9 local20 = this.aClass3_Sub9Array5[local7];
		if (local20 == null) {
			this.aClass3_Sub9Array6[local7] = arg0;
		} else {
			local20.aClass3_Sub9_8 = arg0;
		}
		this.aClass3_Sub9Array5[local7] = arg0;
		arg0.anInt7981 = arg1;
	}

	@OriginalMember(owner = "client!lv", name = "a", descriptor = "(Ljava/awt/Component;)V")
	public void method8513(@OriginalArg(0) Component arg0) throws Exception {
	}

	@OriginalMember(owner = "client!lv", name = "a", descriptor = "(ILclient!ri;)V")
	public final synchronized void method8514(@OriginalArg(1) Class3_Sub9 arg0) {
		this.aClass3_Sub9_9 = arg0;
	}

	@OriginalMember(owner = "client!lv", name = "a", descriptor = "([II)V")
	private void method8516(@OriginalArg(0) int[] arg0) {
		@Pc(1) short local1 = 256;
		if (Static293.aBoolean421) {
			local1 = 512;
		}
		Static689.method8058(arg0, 0, local1);
		this.anInt10008 -= 256;
		if (this.aClass3_Sub9_9 != null && this.anInt10008 <= 0) {
			this.anInt10008 += Static656.anInt1392 >> 4;
			Static626.method8269(this.aClass3_Sub9_9);
			this.method8512(this.aClass3_Sub9_9, this.aClass3_Sub9_9.method6698());
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
						@Pc(88) Class3_Sub9 local88 = null;
						@Pc(93) Class3_Sub9 local93 = this.aClass3_Sub9Array6[local56];
						label97: while (true) {
							while (true) {
								if (local93 == null) {
									break label97;
								}
								@Pc(97) Class3_Sub12 local97 = local93.aClass3_Sub12_6;
								if (local97 == null || local97.anInt8563 <= local61) {
									local93.aBoolean604 = true;
									@Pc(121) int local121 = local93.method6699();
									local45 += local121;
									if (local97 != null) {
										local97.anInt8563 += local121;
									}
									if (local45 >= this.anInt9999) {
										break label103;
									}
									@Pc(140) Class3_Sub9 local140 = local93.method6700();
									if (local140 != null) {
										@Pc(145) int local145 = local93.anInt7981;
										while (local140 != null) {
											this.method8512(local140, local145 * local140.method6698() >> 8);
											local140 = local93.method6696();
										}
									}
									@Pc(164) Class3_Sub9 local164 = local93.aClass3_Sub9_8;
									local93.aClass3_Sub9_8 = null;
									if (local88 == null) {
										this.aClass3_Sub9Array6[local56] = local164;
									} else {
										local88.aClass3_Sub9_8 = local164;
									}
									if (local164 == null) {
										this.aClass3_Sub9Array5[local56] = local88;
									}
									local93 = local164;
								} else {
									local47 |= 0x1 << local56;
									local88 = local93;
									local93 = local93.aClass3_Sub9_8;
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
				@Pc(207) Class3_Sub9 local207 = this.aClass3_Sub9Array6[local56];
				this.aClass3_Sub9Array6[local56] = this.aClass3_Sub9Array5[local56] = null;
				while (local207 != null) {
					@Pc(221) Class3_Sub9 local221 = local207.aClass3_Sub9_8;
					local207.aClass3_Sub9_8 = null;
					local207 = local221;
				}
			}
		}
		if (this.anInt10008 < 0) {
			this.anInt10008 = 0;
		}
		if (this.aClass3_Sub9_9 != null) {
			this.aClass3_Sub9_9.method6702(arg0, 0, 256);
		}
		this.aLong298 = Static131.method2268();
	}

	@OriginalMember(owner = "client!lv", name = "c", descriptor = "()V")
	protected void method8518() throws Exception {
	}

	@OriginalMember(owner = "client!lv", name = "b", descriptor = "(B)V")
	public final synchronized void method8519() {
		if (Static229.aClass310_3 != null) {
			@Pc(13) boolean local13 = true;
			for (@Pc(15) int local15 = 0; local15 < 2; local15++) {
				if (Static229.aClass310_3.aClass232Array1[local15] == this) {
					Static229.aClass310_3.aClass232Array1[local15] = null;
				}
				if (Static229.aClass310_3.aClass232Array1[local15] != null) {
					local13 = false;
				}
			}
			if (local13) {
				Static229.aClass310_3.aBoolean654 = true;
				while (Static229.aClass310_3.aBoolean655) {
					Static365.method3472(50L);
				}
				Static229.aClass310_3 = null;
			}
		}
		this.method8522();
		this.aBoolean736 = true;
		this.anIntArray642 = null;
	}

	@OriginalMember(owner = "client!lv", name = "c", descriptor = "(B)V")
	public final synchronized void method8520() {
		if (this.aBoolean736) {
			return;
		}
		@Pc(12) long local12 = Static131.method2268();
		try {
			if (this.aLong298 + 6000L < local12) {
				this.aLong298 = local12 - 6000L;
			}
			while (local12 > this.aLong298 + 5000L) {
				this.method8510();
				this.aLong298 += (long) (256000 / Static656.anInt1392);
				local12 = Static131.method2268();
			}
		} catch (@Pc(51) Exception local51) {
			this.aLong298 = local12;
		}
		if (this.anIntArray642 == null) {
			return;
		}
		try {
			if (this.aLong299 != 0L) {
				if (local12 < this.aLong299) {
					return;
				}
				this.method8521(this.anInt10005);
				this.aLong299 = 0L;
				this.aBoolean737 = true;
			}
			@Pc(89) int local89 = this.method8509();
			if (this.anInt10015 - local89 > this.anInt10006) {
				this.anInt10006 = this.anInt10015 - local89;
			}
			@Pc(110) int local110 = this.anInt10010 + this.anInt10011;
			if (local110 + 256 > 16384) {
				local110 = 16128;
			}
			if (this.anInt10005 < local110 + 256) {
				this.anInt10005 += 1024;
				if (this.anInt10005 > 16384) {
					this.anInt10005 = 16384;
				}
				this.method8522();
				local89 = 0;
				this.method8521(this.anInt10005);
				this.aBoolean737 = true;
				if (local110 + 256 > this.anInt10005) {
					local110 = this.anInt10005 - 256;
					this.anInt10010 = local110 - this.anInt10011;
				}
			}
			while (local110 > local89) {
				this.method8516(this.anIntArray642);
				this.method8518();
				local89 += 256;
			}
			if (this.aLong300 < local12) {
				if (this.aBoolean737) {
					this.aBoolean737 = false;
				} else if (this.anInt10006 == 0 && this.anInt10014 == 0) {
					this.method8522();
					this.aLong299 = local12 + 2000L;
					return;
				} else {
					this.anInt10010 = Math.min(this.anInt10014, this.anInt10006);
					this.anInt10014 = this.anInt10006;
				}
				this.aLong300 = local12 + 2000L;
				this.anInt10006 = 0;
			}
			this.anInt10015 = local89;
		} catch (@Pc(247) Exception local247) {
			this.method8522();
			this.aLong299 = local12 + 2000L;
		}
	}

	@OriginalMember(owner = "client!lv", name = "b", descriptor = "(I)V")
	public void method8521(@OriginalArg(0) int arg0) throws Exception {
	}

	@OriginalMember(owner = "client!lv", name = "d", descriptor = "()V")
	protected void method8522() {
	}
}
