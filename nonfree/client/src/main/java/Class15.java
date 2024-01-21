import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qc")
public class Class15 {

	@OriginalMember(owner = "client!qc", name = "m", descriptor = "[I")
	public int[] anIntArray197;

	@OriginalMember(owner = "client!qc", name = "v", descriptor = "Lclient!fd;")
	private Class4_Sub4 aClass4_Sub4_6;

	@OriginalMember(owner = "client!qc", name = "I", descriptor = "I")
	private int anInt1944;

	@OriginalMember(owner = "client!qc", name = "K", descriptor = "I")
	public int anInt1945;

	@OriginalMember(owner = "client!qc", name = "L", descriptor = "I")
	public int anInt1946;

	@OriginalMember(owner = "client!qc", name = "w", descriptor = "I")
	private final int anInt1939 = 32;

	@OriginalMember(owner = "client!qc", name = "y", descriptor = "J")
	private long aLong58 = Static44.method861();

	@OriginalMember(owner = "client!qc", name = "F", descriptor = "J")
	private long aLong59 = 0L;

	@OriginalMember(owner = "client!qc", name = "E", descriptor = "Z")
	private boolean aBoolean165 = true;

	@OriginalMember(owner = "client!qc", name = "H", descriptor = "[Lclient!fd;")
	private final Class4_Sub4[] aClass4_Sub4Array5 = new Class4_Sub4[8];

	@OriginalMember(owner = "client!qc", name = "G", descriptor = "I")
	private int anInt1943 = 0;

	@OriginalMember(owner = "client!qc", name = "M", descriptor = "I")
	private int anInt1947 = 0;

	@OriginalMember(owner = "client!qc", name = "J", descriptor = "J")
	private long aLong60 = 0L;

	@OriginalMember(owner = "client!qc", name = "P", descriptor = "I")
	private int anInt1949 = 0;

	@OriginalMember(owner = "client!qc", name = "O", descriptor = "I")
	private int anInt1948 = 0;

	@OriginalMember(owner = "client!qc", name = "N", descriptor = "[Lclient!fd;")
	private final Class4_Sub4[] aClass4_Sub4Array6 = new Class4_Sub4[8];

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(B)V")
	public final synchronized void method1189() {
		if (Static110.aClass18_1 != null) {
			@Pc(17) boolean local17 = true;
			for (@Pc(19) int local19 = 0; local19 < 2; local19++) {
				if (Static110.aClass18_1.aClass15Array1[local19] == this) {
					Static110.aClass18_1.aClass15Array1[local19] = null;
				}
				if (Static110.aClass18_1.aClass15Array1[local19] != null) {
					local17 = false;
				}
			}
			if (local17) {
				Static110.aClass18_1.aBoolean58 = true;
				while (Static110.aClass18_1.aBoolean56) {
					Static46.method889(50L);
				}
				Static110.aClass18_1 = null;
			}
		}
		this.method1201();
		this.anIntArray197 = null;
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "([II)V")
	private void method1190(@OriginalArg(0) int[] arg0) {
		@Pc(1) short local1 = 256;
		if (Static48.aBoolean123) {
			local1 = 512;
		}
		Static139.method953(arg0, 0, local1);
		this.anInt1948 -= 256;
		if (this.aClass4_Sub4_6 != null && this.anInt1948 <= 0) {
			this.anInt1948 += Static116.anInt2873 >> 4;
			Static82.method1453(this.aClass4_Sub4_6);
			this.method1204(this.aClass4_Sub4_6, this.aClass4_Sub4_6.method1641());
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
						@Pc(88) Class4_Sub4 local88 = null;
						@Pc(93) Class4_Sub4 local93 = this.aClass4_Sub4Array5[local56];
						label97: while (true) {
							while (true) {
								if (local93 == null) {
									break label97;
								}
								@Pc(97) Class4_Sub13 local97 = local93.aClass4_Sub13_5;
								if (local97 == null || local97.anInt1364 <= local61) {
									local93.aBoolean227 = true;
									@Pc(121) int local121 = local93.method1635();
									local45 += local121;
									if (local97 != null) {
										local97.anInt1364 += local121;
									}
									if (local45 >= this.anInt1939) {
										break label103;
									}
									@Pc(140) Class4_Sub4 local140 = local93.method1640();
									if (local140 != null) {
										@Pc(145) int local145 = local93.anInt2546;
										while (local140 != null) {
											this.method1204(local140, local145 * local140.method1641() >> 8);
											local140 = local93.method1638();
										}
									}
									@Pc(164) Class4_Sub4 local164 = local93.aClass4_Sub4_8;
									local93.aClass4_Sub4_8 = null;
									if (local88 == null) {
										this.aClass4_Sub4Array5[local56] = local164;
									} else {
										local88.aClass4_Sub4_8 = local164;
									}
									if (local164 == null) {
										this.aClass4_Sub4Array6[local56] = local88;
									}
									local93 = local164;
								} else {
									local47 |= 0x1 << local56;
									local88 = local93;
									local93 = local93.aClass4_Sub4_8;
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
				@Pc(207) Class4_Sub4 local207 = this.aClass4_Sub4Array5[local56];
				this.aClass4_Sub4Array5[local56] = this.aClass4_Sub4Array6[local56] = null;
				while (local207 != null) {
					@Pc(221) Class4_Sub4 local221 = local207.aClass4_Sub4_8;
					local207.aClass4_Sub4_8 = null;
					local207 = local221;
				}
			}
		}
		if (this.anInt1948 < 0) {
			this.anInt1948 = 0;
		}
		if (this.aClass4_Sub4_6 != null) {
			this.aClass4_Sub4_6.method1637(arg0, 0, 256);
		}
		this.aLong58 = Static44.method861();
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(Lclient!fd;I)V")
	public final synchronized void method1191(@OriginalArg(0) Class4_Sub4 arg0) {
		this.aClass4_Sub4_6 = arg0;
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(Z)V")
	public final void method1193() {
		this.aBoolean165 = true;
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(Ljava/awt/Component;)V")
	public void method1194(@OriginalArg(0) Component arg0) throws Exception {
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(I)V")
	public void method1195(@OriginalArg(0) int arg0) throws Exception {
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "()V")
	protected void method1196() throws Exception {
	}

	@OriginalMember(owner = "client!qc", name = "b", descriptor = "(I)V")
	public final synchronized void method1197() {
		if (this.anIntArray197 == null) {
			return;
		}
		@Pc(16) long local16 = Static44.method861();
		try {
			if (this.aLong60 != 0L) {
				if (local16 < this.aLong60) {
					return;
				}
				this.method1195(this.anInt1946);
				this.aBoolean165 = true;
				this.aLong60 = 0L;
			}
			@Pc(46) int local46 = this.method1199();
			if (this.anInt1947 - local46 > this.anInt1949) {
				this.anInt1949 = this.anInt1947 - local46;
			}
			@Pc(72) int local72 = this.anInt1945 + this.anInt1944;
			if (local72 + 256 > 16384) {
				local72 = 16128;
			}
			if (this.anInt1946 < local72 + 256) {
				this.anInt1946 += 1024;
				if (this.anInt1946 > 16384) {
					this.anInt1946 = 16384;
				}
				local46 = 0;
				this.method1201();
				this.method1195(this.anInt1946);
				if (local72 + 256 > this.anInt1946) {
					local72 = this.anInt1946 - 256;
					this.anInt1944 = local72 - this.anInt1945;
				}
				this.aBoolean165 = true;
			}
			while (local72 > local46) {
				local46 += 256;
				this.method1190(this.anIntArray197);
				this.method1196();
			}
			if (local16 > this.aLong59) {
				if (this.aBoolean165) {
					this.aBoolean165 = false;
				} else if (this.anInt1949 == 0 && this.anInt1943 == 0) {
					this.method1201();
					this.aLong60 = local16 + 2000L;
					return;
				} else {
					this.anInt1944 = Math.min(this.anInt1943, this.anInt1949);
					this.anInt1943 = this.anInt1949;
				}
				this.aLong59 = local16 + 2000L;
				this.anInt1949 = 0;
			}
			this.anInt1947 = local46;
		} catch (@Pc(196) Exception local196) {
			this.method1201();
			this.aLong60 = local16 + 2000L;
		}
		try {
			if (this.aLong58 + 500000L < local16) {
				local16 = this.aLong58;
			}
			while (this.aLong58 + 5000L < local16) {
				this.method1203();
				this.aLong58 += 256000 / Static116.anInt2873;
			}
		} catch (@Pc(241) Exception local241) {
			this.aLong58 = local16;
		}
	}

	@OriginalMember(owner = "client!qc", name = "b", descriptor = "(Z)V")
	public final synchronized void method1198() {
		this.aBoolean165 = true;
		try {
			this.method1202();
		} catch (@Pc(6) Exception local6) {
			this.method1201();
			this.aLong60 = Static44.method861() + 2000L;
		}
	}

	@OriginalMember(owner = "client!qc", name = "b", descriptor = "()I")
	protected int method1199() throws Exception {
		return this.anInt1946;
	}

	@OriginalMember(owner = "client!qc", name = "c", descriptor = "()V")
	protected void method1201() {
	}

	@OriginalMember(owner = "client!qc", name = "d", descriptor = "()V")
	protected void method1202() throws Exception {
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(II)V")
	private void method1203() {
		this.anInt1948 -= 256;
		if (this.anInt1948 < 0) {
			this.anInt1948 = 0;
		}
		if (this.aClass4_Sub4_6 != null) {
			this.aClass4_Sub4_6.method1639(256);
		}
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(ILclient!fd;I)V")
	private void method1204(@OriginalArg(1) Class4_Sub4 arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = arg1 >> 5;
		@Pc(17) Class4_Sub4 local17 = this.aClass4_Sub4Array6[local12];
		if (local17 == null) {
			this.aClass4_Sub4Array5[local12] = arg0;
		} else {
			local17.aClass4_Sub4_8 = arg0;
		}
		this.aClass4_Sub4Array6[local12] = arg0;
		arg0.anInt2546 = arg1;
	}
}
