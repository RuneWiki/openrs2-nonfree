import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ud")
public class Class19 {

	@OriginalMember(owner = "client!ud", name = "f", descriptor = "Lclient!ig;")
	private Class2_Sub9 aClass2_Sub9_3;

	@OriginalMember(owner = "client!ud", name = "l", descriptor = "[I")
	public int[] anIntArray207;

	@OriginalMember(owner = "client!ud", name = "q", descriptor = "I")
	private int anInt1259;

	@OriginalMember(owner = "client!ud", name = "v", descriptor = "I")
	public int anInt1264;

	@OriginalMember(owner = "client!ud", name = "y", descriptor = "I")
	public int anInt1265;

	@OriginalMember(owner = "client!ud", name = "m", descriptor = "I")
	private final int anInt1256 = 32;

	@OriginalMember(owner = "client!ud", name = "g", descriptor = "J")
	private long aLong43 = Static101.method1795();

	@OriginalMember(owner = "client!ud", name = "r", descriptor = "I")
	private int anInt1260 = 0;

	@OriginalMember(owner = "client!ud", name = "s", descriptor = "I")
	private int anInt1261 = 0;

	@OriginalMember(owner = "client!ud", name = "w", descriptor = "[Lclient!ig;")
	private final Class2_Sub9[] aClass2_Sub9Array5 = new Class2_Sub9[8];

	@OriginalMember(owner = "client!ud", name = "p", descriptor = "Z")
	private boolean aBoolean65 = true;

	@OriginalMember(owner = "client!ud", name = "C", descriptor = "I")
	private int anInt1268 = 0;

	@OriginalMember(owner = "client!ud", name = "F", descriptor = "J")
	private long aLong45 = 0L;

	@OriginalMember(owner = "client!ud", name = "G", descriptor = "[Lclient!ig;")
	private final Class2_Sub9[] aClass2_Sub9Array6 = new Class2_Sub9[8];

	@OriginalMember(owner = "client!ud", name = "z", descriptor = "J")
	private long aLong44 = 0L;

	@OriginalMember(owner = "client!ud", name = "D", descriptor = "I")
	private int anInt1269 = 0;

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "()V")
	protected void method882() {
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(Lclient!ig;II)V")
	private void method883(@OriginalArg(0) Class2_Sub9 arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = arg1 >> 5;
		@Pc(15) Class2_Sub9 local15 = this.aClass2_Sub9Array5[local3];
		if (local15 == null) {
			this.aClass2_Sub9Array6[local3] = arg0;
		} else {
			local15.aClass2_Sub9_8 = arg0;
		}
		this.aClass2_Sub9Array5[local3] = arg0;
		arg0.anInt4441 = arg1;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(I)V")
	public void method885(@OriginalArg(0) int arg0) throws Exception {
	}

	@OriginalMember(owner = "client!ud", name = "b", descriptor = "(I)V")
	public final synchronized void method886() {
		if (this.anIntArray207 == null) {
			return;
		}
		@Pc(10) long local10 = Static101.method1795();
		try {
			if (this.aLong45 != 0L) {
				if (local10 < this.aLong45) {
					return;
				}
				this.method885(this.anInt1265);
				this.aBoolean65 = true;
				this.aLong45 = 0L;
			}
			@Pc(38) int local38 = this.method889();
			if (this.anInt1261 < this.anInt1269 - local38) {
				this.anInt1261 = this.anInt1269 - local38;
			}
			@Pc(57) int local57 = this.anInt1259 + this.anInt1264;
			if (local57 + 256 > 16384) {
				local57 = 16128;
			}
			if (this.anInt1265 < local57 + 256) {
				local38 = 0;
				this.anInt1265 += 1024;
				if (this.anInt1265 > 16384) {
					this.anInt1265 = 16384;
				}
				this.method882();
				this.method885(this.anInt1265);
				this.aBoolean65 = true;
				if (this.anInt1265 < local57 + 256) {
					local57 = this.anInt1265 - 256;
					this.anInt1259 = local57 - this.anInt1264;
				}
			}
			while (local38 < local57) {
				this.method894(this.anIntArray207);
				this.method896();
				local38 += 256;
			}
			if (this.aLong44 < local10) {
				if (this.aBoolean65) {
					this.aBoolean65 = false;
				} else if (this.anInt1261 == 0 && this.anInt1260 == 0) {
					this.method882();
					this.aLong45 = local10 + 2000L;
					return;
				} else {
					this.anInt1259 = Math.min(this.anInt1260, this.anInt1261);
					this.anInt1260 = this.anInt1261;
				}
				this.aLong44 = local10 + 2000L;
				this.anInt1261 = 0;
			}
			this.anInt1269 = local38;
		} catch (@Pc(191) Exception local191) {
			this.method882();
			this.aLong45 = local10 + 2000L;
		}
		try {
			if (local10 > this.aLong43 + 500000L) {
				local10 = this.aLong43;
			}
			while (this.aLong43 + 5000L < local10) {
				this.method887();
				this.aLong43 += 256000 / Static63.anInt1680;
			}
		} catch (@Pc(238) Exception local238) {
			this.aLong43 = local10;
		}
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(IB)V")
	private void method887() {
		this.anInt1268 -= 256;
		if (this.anInt1268 < 0) {
			this.anInt1268 = 0;
		}
		if (this.aClass2_Sub9_3 != null) {
			this.aClass2_Sub9_3.method2930(256);
		}
	}

	@OriginalMember(owner = "client!ud", name = "c", descriptor = "(I)V")
	public final synchronized void method888() {
		if (Static174.aClass12_1 != null) {
			@Pc(5) boolean local5 = true;
			for (@Pc(7) int local7 = 0; local7 < 2; local7++) {
				if (Static174.aClass12_1.aClass19Array1[local7] == this) {
					Static174.aClass12_1.aClass19Array1[local7] = null;
				}
				if (Static174.aClass12_1.aClass19Array1[local7] != null) {
					local5 = false;
				}
			}
			if (local5) {
				Static174.aClass12_1.aBoolean39 = true;
				while (Static174.aClass12_1.aBoolean38) {
					Static27.method564(50L);
				}
				Static174.aClass12_1 = null;
			}
		}
		this.method882();
		this.anIntArray207 = null;
	}

	@OriginalMember(owner = "client!ud", name = "b", descriptor = "()I")
	protected int method889() throws Exception {
		return this.anInt1265;
	}

	@OriginalMember(owner = "client!ud", name = "c", descriptor = "()V")
	protected void method890() throws Exception {
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(B)V")
	public final synchronized void method891() {
		this.aBoolean65 = true;
		try {
			this.method890();
		} catch (@Pc(14) Exception local14) {
			this.method882();
			this.aLong45 = Static101.method1795() + 2000L;
		}
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(Ljava/awt/Component;)V")
	public void method893(@OriginalArg(0) Component arg0) throws Exception {
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "([II)V")
	private void method894(@OriginalArg(0) int[] arg0) {
		@Pc(1) short local1 = 256;
		if (Static46.aBoolean62) {
			local1 = 512;
		}
		Static186.method1563(arg0, 0, local1);
		this.anInt1268 -= 256;
		if (this.aClass2_Sub9_3 != null && this.anInt1268 <= 0) {
			this.anInt1268 += Static63.anInt1680 >> 4;
			Static68.method1345(this.aClass2_Sub9_3);
			this.method883(this.aClass2_Sub9_3, this.aClass2_Sub9_3.method2928());
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
						@Pc(88) Class2_Sub9 local88 = null;
						@Pc(93) Class2_Sub9 local93 = this.aClass2_Sub9Array6[local56];
						label97: while (true) {
							while (true) {
								if (local93 == null) {
									break label97;
								}
								@Pc(97) Class2_Sub5 local97 = local93.aClass2_Sub5_5;
								if (local97 == null || local97.anInt1942 <= local61) {
									local93.aBoolean182 = true;
									@Pc(121) int local121 = local93.method2931();
									local45 += local121;
									if (local97 != null) {
										local97.anInt1942 += local121;
									}
									if (local45 >= this.anInt1256) {
										break label103;
									}
									@Pc(140) Class2_Sub9 local140 = local93.method2925();
									if (local140 != null) {
										@Pc(145) int local145 = local93.anInt4441;
										while (local140 != null) {
											this.method883(local140, local145 * local140.method2928() >> 8);
											local140 = local93.method2926();
										}
									}
									@Pc(164) Class2_Sub9 local164 = local93.aClass2_Sub9_8;
									local93.aClass2_Sub9_8 = null;
									if (local88 == null) {
										this.aClass2_Sub9Array6[local56] = local164;
									} else {
										local88.aClass2_Sub9_8 = local164;
									}
									if (local164 == null) {
										this.aClass2_Sub9Array5[local56] = local88;
									}
									local93 = local164;
								} else {
									local47 |= 0x1 << local56;
									local88 = local93;
									local93 = local93.aClass2_Sub9_8;
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
				@Pc(207) Class2_Sub9 local207 = this.aClass2_Sub9Array6[local56];
				this.aClass2_Sub9Array6[local56] = this.aClass2_Sub9Array5[local56] = null;
				while (local207 != null) {
					@Pc(221) Class2_Sub9 local221 = local207.aClass2_Sub9_8;
					local207.aClass2_Sub9_8 = null;
					local207 = local221;
				}
			}
		}
		if (this.anInt1268 < 0) {
			this.anInt1268 = 0;
		}
		if (this.aClass2_Sub9_3 != null) {
			this.aClass2_Sub9_3.method2927(arg0, 0, 256);
		}
		this.aLong43 = Static101.method1795();
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(Lclient!ig;I)V")
	public final synchronized void method895(@OriginalArg(0) Class2_Sub9 arg0) {
		this.aClass2_Sub9_3 = arg0;
	}

	@OriginalMember(owner = "client!ud", name = "d", descriptor = "()V")
	protected void method896() throws Exception {
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(Z)V")
	public final void method897() {
		this.aBoolean65 = true;
	}
}
