import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oba")
public class Class15 {

	@OriginalMember(owner = "client!oba", name = "f", descriptor = "[I")
	public int[] anIntArray297;

	@OriginalMember(owner = "client!oba", name = "o", descriptor = "Lclient!vv;")
	private Class1_Sub4 aClass1_Sub4_6;

	@OriginalMember(owner = "client!oba", name = "z", descriptor = "I")
	private int anInt3849;

	@OriginalMember(owner = "client!oba", name = "B", descriptor = "I")
	public int anInt3850;

	@OriginalMember(owner = "client!oba", name = "H", descriptor = "I")
	public int anInt3855;

	@OriginalMember(owner = "client!oba", name = "q", descriptor = "I")
	private final int anInt3844 = 32;

	@OriginalMember(owner = "client!oba", name = "r", descriptor = "Z")
	private boolean aBoolean313 = false;

	@OriginalMember(owner = "client!oba", name = "t", descriptor = "J")
	private long aLong88 = Static110.method2222();

	@OriginalMember(owner = "client!oba", name = "A", descriptor = "[Lclient!vv;")
	private final Class1_Sub4[] aClass1_Sub4Array5 = new Class1_Sub4[8];

	@OriginalMember(owner = "client!oba", name = "x", descriptor = "Z")
	private boolean aBoolean314 = true;

	@OriginalMember(owner = "client!oba", name = "D", descriptor = "[Lclient!vv;")
	private final Class1_Sub4[] aClass1_Sub4Array6 = new Class1_Sub4[8];

	@OriginalMember(owner = "client!oba", name = "E", descriptor = "I")
	private int anInt3852 = 0;

	@OriginalMember(owner = "client!oba", name = "y", descriptor = "J")
	private long aLong89 = 0L;

	@OriginalMember(owner = "client!oba", name = "w", descriptor = "I")
	private int anInt3848 = 0;

	@OriginalMember(owner = "client!oba", name = "F", descriptor = "I")
	private int anInt3853 = 0;

	@OriginalMember(owner = "client!oba", name = "I", descriptor = "J")
	private long aLong90 = 0L;

	@OriginalMember(owner = "client!oba", name = "G", descriptor = "I")
	private int anInt3854 = 0;

	@OriginalMember(owner = "client!oba", name = "a", descriptor = "()V")
	protected void method3553() {
	}

	@OriginalMember(owner = "client!oba", name = "a", descriptor = "(B)V")
	public final synchronized void method3554() {
		this.aBoolean314 = true;
		try {
			this.method3567();
		} catch (@Pc(18) Exception local18) {
			this.method3553();
			this.aLong90 = Static110.method2222() + 2000L;
		}
	}

	@OriginalMember(owner = "client!oba", name = "a", descriptor = "([II)V")
	private void method3555(@OriginalArg(0) int[] arg0) {
		@Pc(1) short local1 = 256;
		if (Static121.aBoolean214) {
			local1 = 512;
		}
		Static556.method7039(arg0, 0, local1);
		this.anInt3852 -= 256;
		if (this.aClass1_Sub4_6 != null && this.anInt3852 <= 0) {
			this.anInt3852 += Static411.anInt9206 >> 4;
			Static86.method1835(this.aClass1_Sub4_6);
			this.method3557(this.aClass1_Sub4_6, this.aClass1_Sub4_6.method7985());
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
						@Pc(88) Class1_Sub4 local88 = null;
						@Pc(93) Class1_Sub4 local93 = this.aClass1_Sub4Array6[local56];
						label97: while (true) {
							while (true) {
								if (local93 == null) {
									break label97;
								}
								@Pc(97) Class1_Sub30 local97 = local93.aClass1_Sub30_5;
								if (local97 == null || local97.anInt5919 <= local61) {
									local93.aBoolean691 = true;
									@Pc(121) int local121 = local93.method7987();
									local45 += local121;
									if (local97 != null) {
										local97.anInt5919 += local121;
									}
									if (local45 >= this.anInt3844) {
										break label103;
									}
									@Pc(140) Class1_Sub4 local140 = local93.method7983();
									if (local140 != null) {
										@Pc(145) int local145 = local93.anInt9235;
										while (local140 != null) {
											this.method3557(local140, local145 * local140.method7985() >> 8);
											local140 = local93.method7984();
										}
									}
									@Pc(164) Class1_Sub4 local164 = local93.aClass1_Sub4_8;
									local93.aClass1_Sub4_8 = null;
									if (local88 == null) {
										this.aClass1_Sub4Array6[local56] = local164;
									} else {
										local88.aClass1_Sub4_8 = local164;
									}
									if (local164 == null) {
										this.aClass1_Sub4Array5[local56] = local88;
									}
									local93 = local164;
								} else {
									local47 |= 0x1 << local56;
									local88 = local93;
									local93 = local93.aClass1_Sub4_8;
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
				@Pc(207) Class1_Sub4 local207 = this.aClass1_Sub4Array6[local56];
				this.aClass1_Sub4Array6[local56] = this.aClass1_Sub4Array5[local56] = null;
				while (local207 != null) {
					@Pc(221) Class1_Sub4 local221 = local207.aClass1_Sub4_8;
					local207.aClass1_Sub4_8 = null;
					local207 = local221;
				}
			}
		}
		if (this.anInt3852 < 0) {
			this.anInt3852 = 0;
		}
		if (this.aClass1_Sub4_6 != null) {
			this.aClass1_Sub4_6.method7986(arg0, 0, 256);
		}
		this.aLong88 = Static110.method2222();
	}

	@OriginalMember(owner = "client!oba", name = "a", descriptor = "(Ljava/awt/Component;)V")
	public void method3556(@OriginalArg(0) Component arg0) throws Exception {
	}

	@OriginalMember(owner = "client!oba", name = "a", descriptor = "(Lclient!vv;II)V")
	private void method3557(@OriginalArg(0) Class1_Sub4 arg0, @OriginalArg(1) int arg1) {
		@Pc(7) int local7 = arg1 >> 5;
		@Pc(16) Class1_Sub4 local16 = this.aClass1_Sub4Array5[local7];
		if (local16 == null) {
			this.aClass1_Sub4Array6[local7] = arg0;
		} else {
			local16.aClass1_Sub4_8 = arg0;
		}
		this.aClass1_Sub4Array5[local7] = arg0;
		arg0.anInt9235 = arg1;
	}

	@OriginalMember(owner = "client!oba", name = "b", descriptor = "()I")
	protected int method3558() throws Exception {
		return this.anInt3850;
	}

	@OriginalMember(owner = "client!oba", name = "a", descriptor = "(I)V")
	public final synchronized void method3559() {
		if (Static252.aClass3_1 != null) {
			@Pc(9) boolean local9 = true;
			for (@Pc(11) int local11 = 0; local11 < 2; local11++) {
				if (Static252.aClass3_1.aClass15Array1[local11] == this) {
					Static252.aClass3_1.aClass15Array1[local11] = null;
				}
				if (Static252.aClass3_1.aClass15Array1[local11] != null) {
					local9 = false;
				}
			}
			if (local9) {
				Static252.aClass3_1.aBoolean4 = true;
				while (Static252.aClass3_1.aBoolean3) {
					Static265.method3147(50L);
				}
				Static252.aClass3_1 = null;
			}
		}
		this.method3553();
		this.anIntArray297 = null;
		this.aBoolean313 = true;
	}

	@OriginalMember(owner = "client!oba", name = "b", descriptor = "(I)V")
	public final synchronized void method3560() {
		if (this.aBoolean313) {
			return;
		}
		@Pc(12) long local12 = Static110.method2222();
		try {
			if (this.aLong88 + 500000L < local12) {
				this.aLong88 = local12 - 500000L;
			}
			while (local12 > this.aLong88 + 5000L) {
				this.method3569();
				this.aLong88 += 256000 / Static411.anInt9206;
			}
		} catch (@Pc(56) Exception local56) {
			this.aLong88 = local12;
		}
		if (this.anIntArray297 == null) {
			return;
		}
		try {
			if (this.aLong90 != 0L) {
				if (local12 < this.aLong90) {
					return;
				}
				this.method3562(this.anInt3850);
				this.aLong90 = 0L;
				this.aBoolean314 = true;
			}
			@Pc(101) int local101 = this.method3558();
			if (this.anInt3854 < this.anInt3848 - local101) {
				this.anInt3854 = this.anInt3848 - local101;
			}
			@Pc(122) int local122 = this.anInt3849 + this.anInt3855;
			if (local122 + 256 > 16384) {
				local122 = 16128;
			}
			if (this.anInt3850 < local122 + 256) {
				this.anInt3850 += 1024;
				if (this.anInt3850 > 16384) {
					this.anInt3850 = 16384;
				}
				this.method3553();
				local101 = 0;
				this.method3562(this.anInt3850);
				this.aBoolean314 = true;
				if (local122 + 256 > this.anInt3850) {
					local122 = this.anInt3850 - 256;
					this.anInt3849 = local122 - this.anInt3855;
				}
			}
			while (local122 > local101) {
				this.method3555(this.anIntArray297);
				local101 += 256;
				this.method3564();
			}
			if (local12 > this.aLong89) {
				if (this.aBoolean314) {
					this.aBoolean314 = false;
				} else if (this.anInt3854 == 0 && this.anInt3853 == 0) {
					this.method3553();
					this.aLong90 = local12 + 2000L;
					return;
				} else {
					this.anInt3849 = Math.min(this.anInt3853, this.anInt3854);
					this.anInt3853 = this.anInt3854;
				}
				this.anInt3854 = 0;
				this.aLong89 = local12 + 2000L;
			}
			this.anInt3848 = local101;
		} catch (@Pc(255) Exception local255) {
			this.method3553();
			this.aLong90 = local12 + 2000L;
		}
	}

	@OriginalMember(owner = "client!oba", name = "c", descriptor = "(I)V")
	public void method3562(@OriginalArg(0) int arg0) throws Exception {
	}

	@OriginalMember(owner = "client!oba", name = "a", descriptor = "(ZLclient!vv;)V")
	public final synchronized void method3563(@OriginalArg(1) Class1_Sub4 arg0) {
		this.aClass1_Sub4_6 = arg0;
	}

	@OriginalMember(owner = "client!oba", name = "c", descriptor = "()V")
	protected void method3564() throws Exception {
	}

	@OriginalMember(owner = "client!oba", name = "d", descriptor = "()V")
	protected void method3567() throws Exception {
	}

	@OriginalMember(owner = "client!oba", name = "b", descriptor = "(IB)V")
	private void method3569() {
		this.anInt3852 -= 256;
		if (this.anInt3852 < 0) {
			this.anInt3852 = 0;
		}
		if (this.aClass1_Sub4_6 != null) {
			this.aClass1_Sub4_6.method7981(256);
		}
	}
}
