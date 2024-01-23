import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ff")
public class Class42 {

	@OriginalMember(owner = "client!ff", name = "c", descriptor = "[I")
	public int[] anIntArray228;

	@OriginalMember(owner = "client!ff", name = "v", descriptor = "Lclient!r;")
	private Class1_Sub4 aClass1_Sub4_8;

	@OriginalMember(owner = "client!ff", name = "w", descriptor = "I")
	public int anInt3503;

	@OriginalMember(owner = "client!ff", name = "z", descriptor = "I")
	public int anInt3505;

	@OriginalMember(owner = "client!ff", name = "E", descriptor = "I")
	private int anInt3509;

	@OriginalMember(owner = "client!ff", name = "p", descriptor = "I")
	private int anInt3499 = 32;

	@OriginalMember(owner = "client!ff", name = "s", descriptor = "J")
	private long aLong121 = Static144.method2489();

	@OriginalMember(owner = "client!ff", name = "y", descriptor = "J")
	private long aLong122 = 0L;

	@OriginalMember(owner = "client!ff", name = "D", descriptor = "[Lclient!r;")
	private Class1_Sub4[] aClass1_Sub4Array5 = new Class1_Sub4[8];

	@OriginalMember(owner = "client!ff", name = "B", descriptor = "I")
	private int anInt3507 = 0;

	@OriginalMember(owner = "client!ff", name = "C", descriptor = "I")
	private int anInt3508 = 0;

	@OriginalMember(owner = "client!ff", name = "G", descriptor = "Z")
	private boolean aBoolean166 = true;

	@OriginalMember(owner = "client!ff", name = "F", descriptor = "[Lclient!r;")
	private Class1_Sub4[] aClass1_Sub4Array6 = new Class1_Sub4[8];

	@OriginalMember(owner = "client!ff", name = "A", descriptor = "I")
	private int anInt3506 = 0;

	@OriginalMember(owner = "client!ff", name = "x", descriptor = "I")
	private int anInt3504 = 0;

	@OriginalMember(owner = "client!ff", name = "H", descriptor = "J")
	private long aLong123 = 0L;

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(I)V")
	public void method2727(@OriginalArg(0) int arg0) throws Exception {
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(ZLclient!r;)V")
	public final synchronized void method2728(@OriginalArg(1) Class1_Sub4 arg0) {
		this.aClass1_Sub4_8 = arg0;
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "()V")
	protected void method2729() {
	}

	@OriginalMember(owner = "client!ff", name = "b", descriptor = "(I)V")
	public final synchronized void method2730() {
		if (Static207.aClass2_1 != null) {
			@Pc(9) boolean local9 = true;
			for (@Pc(11) int local11 = 0; local11 < 2; local11++) {
				if (Static207.aClass2_1.aClass42Array1[local11] == this) {
					Static207.aClass2_1.aClass42Array1[local11] = null;
				}
				if (Static207.aClass2_1.aClass42Array1[local11] != null) {
					local9 = false;
				}
			}
			if (local9) {
				Static207.aClass2_1.aBoolean4 = true;
				while (Static207.aClass2_1.aBoolean3) {
					Static186.method3115(50L);
				}
				Static207.aClass2_1 = null;
			}
		}
		this.method2729();
		this.anIntArray228 = null;
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(Ljava/awt/Component;)V")
	public void method2731(@OriginalArg(0) Component arg0) throws Exception {
	}

	@OriginalMember(owner = "client!ff", name = "b", descriptor = "()V")
	protected void method2733() throws Exception {
	}

	@OriginalMember(owner = "client!ff", name = "d", descriptor = "(I)V")
	public final void method2734() {
		this.aBoolean166 = true;
	}

	@OriginalMember(owner = "client!ff", name = "c", descriptor = "()V")
	protected void method2735() throws Exception {
	}

	@OriginalMember(owner = "client!ff", name = "e", descriptor = "(I)V")
	public final synchronized void method2737() {
		this.aBoolean166 = true;
		try {
			this.method2735();
		} catch (@Pc(14) Exception local14) {
			this.method2729();
			this.aLong123 = Static144.method2489() + 2000L;
		}
	}

	@OriginalMember(owner = "client!ff", name = "d", descriptor = "()I")
	protected int method2738() throws Exception {
		return this.anInt3505;
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "([II)V")
	private void method2739(@OriginalArg(0) int[] arg0) {
		@Pc(1) short local1 = 256;
		if (Static15.aBoolean12) {
			local1 = 512;
		}
		Static233.method870(arg0, 0, local1);
		this.anInt3506 -= 256;
		if (this.aClass1_Sub4_8 != null && this.anInt3506 <= 0) {
			this.anInt3506 += Static31.anInt702 >> 4;
			Static184.method3100(this.aClass1_Sub4_8);
			this.method2742(this.aClass1_Sub4_8, this.aClass1_Sub4_8.method2358());
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
						@Pc(93) Class1_Sub4 local93 = this.aClass1_Sub4Array5[local56];
						label97: while (true) {
							while (true) {
								if (local93 == null) {
									break label97;
								}
								@Pc(97) Class1_Sub6 local97 = local93.aClass1_Sub6_5;
								if (local97 == null || local97.anInt3208 <= local61) {
									local93.aBoolean132 = true;
									@Pc(121) int local121 = local93.method2356();
									local45 += local121;
									if (local97 != null) {
										local97.anInt3208 += local121;
									}
									if (local45 >= this.anInt3499) {
										break label103;
									}
									@Pc(140) Class1_Sub4 local140 = local93.method2353();
									if (local140 != null) {
										@Pc(145) int local145 = local93.anInt2999;
										while (local140 != null) {
											this.method2742(local140, local145 * local140.method2358() >> 8);
											local140 = local93.method2354();
										}
									}
									@Pc(164) Class1_Sub4 local164 = local93.aClass1_Sub4_7;
									local93.aClass1_Sub4_7 = null;
									if (local88 == null) {
										this.aClass1_Sub4Array5[local56] = local164;
									} else {
										local88.aClass1_Sub4_7 = local164;
									}
									if (local164 == null) {
										this.aClass1_Sub4Array6[local56] = local88;
									}
									local93 = local164;
								} else {
									local47 |= 0x1 << local56;
									local88 = local93;
									local93 = local93.aClass1_Sub4_7;
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
				@Pc(207) Class1_Sub4 local207 = this.aClass1_Sub4Array5[local56];
				this.aClass1_Sub4Array5[local56] = this.aClass1_Sub4Array6[local56] = null;
				while (local207 != null) {
					@Pc(221) Class1_Sub4 local221 = local207.aClass1_Sub4_7;
					local207.aClass1_Sub4_7 = null;
					local207 = local221;
				}
			}
		}
		if (this.anInt3506 < 0) {
			this.anInt3506 = 0;
		}
		if (this.aClass1_Sub4_8 != null) {
			this.aClass1_Sub4_8.method2355(arg0, 0, 256);
		}
		this.aLong121 = Static144.method2489();
	}

	@OriginalMember(owner = "client!ff", name = "f", descriptor = "(I)V")
	public final synchronized void method2740() {
		if (this.anIntArray228 == null) {
			return;
		}
		@Pc(12) long local12 = Static144.method2489();
		try {
			if (this.aLong123 != 0L) {
				if (local12 < this.aLong123) {
					return;
				}
				this.method2727(this.anInt3505);
				this.aBoolean166 = true;
				this.aLong123 = 0L;
			}
			@Pc(42) int local42 = this.method2738();
			@Pc(49) int local49 = this.anInt3503 + this.anInt3509;
			if (this.anInt3508 - local42 > this.anInt3507) {
				this.anInt3507 = this.anInt3508 - local42;
			}
			if (local49 + 256 > 16384) {
				local49 = 16128;
			}
			if (this.anInt3505 < local49 + 256) {
				this.anInt3505 += 1024;
				local42 = 0;
				if (this.anInt3505 > 16384) {
					this.anInt3505 = 16384;
				}
				this.method2729();
				this.method2727(this.anInt3505);
				this.aBoolean166 = true;
				if (local49 + 256 > this.anInt3505) {
					local49 = this.anInt3505 - 256;
					this.anInt3509 = local49 - this.anInt3503;
				}
			}
			while (local42 < local49) {
				local42 += 256;
				this.method2739(this.anIntArray228);
				this.method2733();
			}
			if (local12 > this.aLong122) {
				if (this.aBoolean166) {
					this.aBoolean166 = false;
				} else if (this.anInt3507 == 0 && this.anInt3504 == 0) {
					this.method2729();
					this.aLong123 = local12 + 2000L;
					return;
				} else {
					this.anInt3509 = Math.min(this.anInt3504, this.anInt3507);
					this.anInt3504 = this.anInt3507;
				}
				this.anInt3507 = 0;
				this.aLong122 = local12 + 2000L;
			}
			this.anInt3508 = local42;
		} catch (@Pc(201) Exception local201) {
			this.method2729();
			this.aLong123 = local12 + 2000L;
		}
		try {
			if (this.aLong121 + 500000L < local12) {
				local12 = this.aLong121;
			}
			while (this.aLong121 + 5000L < local12) {
				this.method2741();
				this.aLong121 += 256000 / Static31.anInt702;
			}
		} catch (@Pc(246) Exception local246) {
			this.aLong121 = local12;
		}
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(BI)V")
	private void method2741() {
		this.anInt3506 -= 256;
		if (this.anInt3506 < 0) {
			this.anInt3506 = 0;
		}
		if (this.aClass1_Sub4_8 != null) {
			this.aClass1_Sub4_8.method2357(256);
		}
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(Lclient!r;IB)V")
	private void method2742(@OriginalArg(0) Class1_Sub4 arg0, @OriginalArg(1) int arg1) {
		@Pc(7) int local7 = arg1 >> 5;
		@Pc(12) Class1_Sub4 local12 = this.aClass1_Sub4Array6[local7];
		if (local12 == null) {
			this.aClass1_Sub4Array5[local7] = arg0;
		} else {
			local12.aClass1_Sub4_7 = arg0;
		}
		this.aClass1_Sub4Array6[local7] = arg0;
		arg0.anInt2999 = arg1;
	}
}
