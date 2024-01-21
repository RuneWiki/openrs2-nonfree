import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wb")
public class Class22 {

	@OriginalMember(owner = "client!wb", name = "m", descriptor = "[I")
	public int[] anIntArray156;

	@OriginalMember(owner = "client!wb", name = "E", descriptor = "Lclient!kb;")
	private Class1_Sub4 aClass1_Sub4_6;

	@OriginalMember(owner = "client!wb", name = "J", descriptor = "I")
	private int anInt1505;

	@OriginalMember(owner = "client!wb", name = "N", descriptor = "I")
	public int anInt1506;

	@OriginalMember(owner = "client!wb", name = "V", descriptor = "I")
	public int anInt1510;

	@OriginalMember(owner = "client!wb", name = "D", descriptor = "I")
	private final int anInt1501 = 32;

	@OriginalMember(owner = "client!wb", name = "s", descriptor = "J")
	private long aLong81 = Static35.method634();

	@OriginalMember(owner = "client!wb", name = "I", descriptor = "I")
	private int anInt1504 = 0;

	@OriginalMember(owner = "client!wb", name = "G", descriptor = "I")
	private int anInt1503 = 0;

	@OriginalMember(owner = "client!wb", name = "M", descriptor = "J")
	private long aLong82 = 0L;

	@OriginalMember(owner = "client!wb", name = "H", descriptor = "Z")
	private boolean aBoolean84 = true;

	@OriginalMember(owner = "client!wb", name = "L", descriptor = "[Lclient!kb;")
	private final Class1_Sub4[] aClass1_Sub4Array6 = new Class1_Sub4[8];

	@OriginalMember(owner = "client!wb", name = "Q", descriptor = "I")
	private int anInt1507 = 0;

	@OriginalMember(owner = "client!wb", name = "K", descriptor = "[Lclient!kb;")
	private final Class1_Sub4[] aClass1_Sub4Array5 = new Class1_Sub4[8];

	@OriginalMember(owner = "client!wb", name = "R", descriptor = "I")
	private int anInt1508 = 0;

	@OriginalMember(owner = "client!wb", name = "P", descriptor = "J")
	private long aLong83 = 0L;

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(I)V")
	public final synchronized void method922() {
		if (Static41.aClass30_1 != null) {
			@Pc(9) boolean local9 = true;
			for (@Pc(11) int local11 = 0; local11 < 2; local11++) {
				if (Static41.aClass30_1.aClass22Array1[local11] == this) {
					Static41.aClass30_1.aClass22Array1[local11] = null;
				}
				if (Static41.aClass30_1.aClass22Array1[local11] != null) {
					local9 = false;
				}
			}
			if (local9) {
				Static41.aClass30_1.aBoolean82 = true;
				while (Static41.aClass30_1.aBoolean83) {
					Static109.method2037(50L);
				}
				Static41.aClass30_1 = null;
			}
		}
		this.method926();
		this.anIntArray156 = null;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "([II)V")
	private void method923(@OriginalArg(0) int[] arg0) {
		@Pc(1) short local1 = 256;
		if (Static121.aBoolean163) {
			local1 = 512;
		}
		Static140.method1969(arg0, 0, local1);
		this.anInt1507 -= 256;
		if (this.aClass1_Sub4_6 != null && this.anInt1507 <= 0) {
			this.anInt1507 += Static12.anInt553 >> 4;
			Static118.method1879(this.aClass1_Sub4_6);
			this.method935(this.aClass1_Sub4_6, this.aClass1_Sub4_6.method1899());
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
								@Pc(97) Class1_Sub17 local97 = local93.aClass1_Sub17_5;
								if (local97 == null || local97.anInt1965 <= local61) {
									local93.aBoolean162 = true;
									@Pc(121) int local121 = local93.method1898();
									local45 += local121;
									if (local97 != null) {
										local97.anInt1965 += local121;
									}
									if (local45 >= this.anInt1501) {
										break label103;
									}
									@Pc(140) Class1_Sub4 local140 = local93.method1896();
									if (local140 != null) {
										@Pc(145) int local145 = local93.anInt2851;
										while (local140 != null) {
											this.method935(local140, local145 * local140.method1899() >> 8);
											local140 = local93.method1894();
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
		if (this.anInt1507 < 0) {
			this.anInt1507 = 0;
		}
		if (this.aClass1_Sub4_6 != null) {
			this.aClass1_Sub4_6.method1897(arg0, 0, 256);
		}
		this.aLong81 = Static35.method634();
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(BI)V")
	private void method924() {
		this.anInt1507 -= 256;
		if (this.anInt1507 < 0) {
			this.anInt1507 = 0;
		}
		if (this.aClass1_Sub4_6 != null) {
			this.aClass1_Sub4_6.method1895(256);
		}
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "()V")
	protected void method926() {
	}

	@OriginalMember(owner = "client!wb", name = "b", descriptor = "()V")
	protected void method927() throws Exception {
	}

	@OriginalMember(owner = "client!wb", name = "b", descriptor = "(I)V")
	public void method929(@OriginalArg(0) int arg0) throws Exception {
	}

	@OriginalMember(owner = "client!wb", name = "c", descriptor = "()V")
	protected void method930() throws Exception {
	}

	@OriginalMember(owner = "client!wb", name = "c", descriptor = "(I)V")
	public final synchronized void method931() {
		if (this.anIntArray156 == null) {
			return;
		}
		@Pc(14) long local14 = Static35.method634();
		try {
			if (this.aLong83 != 0L) {
				if (this.aLong83 > local14) {
					return;
				}
				this.method929(this.anInt1510);
				this.aBoolean84 = true;
				this.aLong83 = 0L;
			}
			@Pc(46) int local46 = this.method939();
			if (this.anInt1503 - local46 > this.anInt1508) {
				this.anInt1508 = this.anInt1503 - local46;
			}
			@Pc(67) int local67 = this.anInt1505 + this.anInt1506;
			if (local67 + 256 > 16384) {
				local67 = 16128;
			}
			if (this.anInt1510 < local67 + 256) {
				this.anInt1510 += 1024;
				local46 = 0;
				if (this.anInt1510 > 16384) {
					this.anInt1510 = 16384;
				}
				this.method926();
				this.method929(this.anInt1510);
				this.aBoolean84 = true;
				if (this.anInt1510 < local67 + 256) {
					local67 = this.anInt1510 - 256;
					this.anInt1505 = local67 - this.anInt1506;
				}
			}
			while (local46 < local67) {
				local46 += 256;
				this.method923(this.anIntArray156);
				this.method927();
			}
			if (this.aLong82 < local14) {
				if (this.aBoolean84) {
					this.aBoolean84 = false;
				} else if (this.anInt1508 == 0 && this.anInt1504 == 0) {
					this.method926();
					this.aLong83 = local14 + 2000L;
					return;
				} else {
					this.anInt1505 = Math.min(this.anInt1504, this.anInt1508);
					this.anInt1504 = this.anInt1508;
				}
				this.aLong82 = local14 + 2000L;
				this.anInt1508 = 0;
			}
			this.anInt1503 = local46;
		} catch (@Pc(193) Exception local193) {
			this.method926();
			this.aLong83 = local14 + 2000L;
		}
		try {
			if (local14 > this.aLong81 + 500000L) {
				local14 = this.aLong81;
			}
			while (this.aLong81 + 5000L < local14) {
				this.method924();
				this.aLong81 += 256000 / Static12.anInt553;
			}
		} catch (@Pc(238) Exception local238) {
			this.aLong81 = local14;
		}
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(B)V")
	public final synchronized void method932() {
		this.aBoolean84 = true;
		try {
			this.method930();
		} catch (@Pc(14) Exception local14) {
			this.method926();
			this.aLong83 = Static35.method634() + 2000L;
		}
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(Ljava/awt/Component;)V")
	public void method933(@OriginalArg(0) Component arg0) throws Exception {
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(BLclient!kb;I)V")
	private void method935(@OriginalArg(1) Class1_Sub4 arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = arg1 >> 5;
		@Pc(17) Class1_Sub4 local17 = this.aClass1_Sub4Array5[local12];
		if (local17 == null) {
			this.aClass1_Sub4Array6[local12] = arg0;
		} else {
			local17.aClass1_Sub4_8 = arg0;
		}
		this.aClass1_Sub4Array5[local12] = arg0;
		arg0.anInt2851 = arg1;
	}

	@OriginalMember(owner = "client!wb", name = "d", descriptor = "(I)V")
	public final void method936() {
		this.aBoolean84 = true;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(BLclient!kb;)V")
	public final synchronized void method938(@OriginalArg(1) Class1_Sub4 arg0) {
		this.aClass1_Sub4_6 = arg0;
	}

	@OriginalMember(owner = "client!wb", name = "d", descriptor = "()I")
	protected int method939() throws Exception {
		return this.anInt1510;
	}
}
