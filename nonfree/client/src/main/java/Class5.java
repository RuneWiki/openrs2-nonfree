import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ah")
public class Class5 {

	@OriginalMember(owner = "client!ah", name = "o", descriptor = "Lclient!kc;")
	private Class2_Sub14 aClass2_Sub14_6;

	@OriginalMember(owner = "client!ah", name = "q", descriptor = "[I")
	public int[] anIntArray210;

	@OriginalMember(owner = "client!ah", name = "G", descriptor = "I")
	public int anInt2226;

	@OriginalMember(owner = "client!ah", name = "H", descriptor = "I")
	private int anInt2227;

	@OriginalMember(owner = "client!ah", name = "J", descriptor = "I")
	public int anInt2229;

	@OriginalMember(owner = "client!ah", name = "y", descriptor = "I")
	private final int anInt2222 = 32;

	@OriginalMember(owner = "client!ah", name = "r", descriptor = "J")
	private long aLong99 = Static108.method1828();

	@OriginalMember(owner = "client!ah", name = "B", descriptor = "[Lclient!kc;")
	private final Class2_Sub14[] aClass2_Sub14Array5 = new Class2_Sub14[8];

	@OriginalMember(owner = "client!ah", name = "F", descriptor = "Z")
	private boolean aBoolean92 = true;

	@OriginalMember(owner = "client!ah", name = "A", descriptor = "I")
	private int anInt2224 = 0;

	@OriginalMember(owner = "client!ah", name = "E", descriptor = "J")
	private long aLong100 = 0L;

	@OriginalMember(owner = "client!ah", name = "C", descriptor = "I")
	private int anInt2225 = 0;

	@OriginalMember(owner = "client!ah", name = "K", descriptor = "I")
	private int anInt2230 = 0;

	@OriginalMember(owner = "client!ah", name = "L", descriptor = "[Lclient!kc;")
	private final Class2_Sub14[] aClass2_Sub14Array6 = new Class2_Sub14[8];

	@OriginalMember(owner = "client!ah", name = "I", descriptor = "I")
	private int anInt2228 = 0;

	@OriginalMember(owner = "client!ah", name = "M", descriptor = "J")
	private long aLong101 = 0L;

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(I)V")
	public final void method1786() {
		this.aBoolean92 = true;
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "()I")
	protected int method1787() throws Exception {
		return this.anInt2229;
	}

	@OriginalMember(owner = "client!ah", name = "b", descriptor = "(I)V")
	public void method1788(@OriginalArg(0) int arg0) throws Exception {
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(B)V")
	public final synchronized void method1790() {
		this.aBoolean92 = true;
		try {
			this.method1799();
		} catch (@Pc(6) Exception local6) {
			this.method1792();
			this.aLong101 = Static108.method1828() + 2000L;
		}
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(BLclient!kc;I)V")
	private void method1791(@OriginalArg(1) Class2_Sub14 arg0, @OriginalArg(2) int arg1) {
		@Pc(11) int local11 = arg1 >> 5;
		@Pc(16) Class2_Sub14 local16 = this.aClass2_Sub14Array6[local11];
		if (local16 == null) {
			this.aClass2_Sub14Array5[local11] = arg0;
		} else {
			local16.aClass2_Sub14_8 = arg0;
		}
		this.aClass2_Sub14Array6[local11] = arg0;
		arg0.anInt3345 = arg1;
	}

	@OriginalMember(owner = "client!ah", name = "b", descriptor = "()V")
	protected void method1792() {
	}

	@OriginalMember(owner = "client!ah", name = "c", descriptor = "(I)V")
	public final synchronized void method1793() {
		if (this.anIntArray210 == null) {
			return;
		}
		@Pc(16) long local16 = Static108.method1828();
		try {
			if (this.aLong101 != 0L) {
				if (this.aLong101 > local16) {
					return;
				}
				this.method1788(this.anInt2229);
				this.aBoolean92 = true;
				this.aLong101 = 0L;
			}
			@Pc(42) int local42 = this.method1787();
			if (this.anInt2228 - local42 > this.anInt2225) {
				this.anInt2225 = this.anInt2228 - local42;
			}
			@Pc(67) int local67 = this.anInt2226 + this.anInt2227;
			if (local67 + 256 > 16384) {
				local67 = 16128;
			}
			if (local67 + 256 > this.anInt2229) {
				this.anInt2229 += 1024;
				local42 = 0;
				if (this.anInt2229 > 16384) {
					this.anInt2229 = 16384;
				}
				this.method1792();
				this.method1788(this.anInt2229);
				if (local67 + 256 > this.anInt2229) {
					local67 = this.anInt2229 - 256;
					this.anInt2227 = local67 - this.anInt2226;
				}
				this.aBoolean92 = true;
			}
			while (local42 < local67) {
				this.method1801(this.anIntArray210);
				this.method1797();
				local42 += 256;
			}
			if (this.aLong100 < local16) {
				if (this.aBoolean92) {
					this.aBoolean92 = false;
				} else if (this.anInt2225 == 0 && this.anInt2230 == 0) {
					this.method1792();
					this.aLong101 = local16 + 2000L;
					return;
				} else {
					this.anInt2227 = Math.min(this.anInt2230, this.anInt2225);
					this.anInt2230 = this.anInt2225;
				}
				this.aLong100 = local16 + 2000L;
				this.anInt2225 = 0;
			}
			this.anInt2228 = local42;
		} catch (@Pc(210) Exception local210) {
			this.method1792();
			this.aLong101 = local16 + 2000L;
		}
		try {
			if (this.aLong99 + 500000L < local16) {
				local16 = this.aLong99;
			}
			while (local16 > this.aLong99 + 5000L) {
				this.method1798();
				this.aLong99 += 256000 / Static22.anInt472;
			}
		} catch (@Pc(259) Exception local259) {
			this.aLong99 = local16;
		}
	}

	@OriginalMember(owner = "client!ah", name = "e", descriptor = "(I)V")
	public final synchronized void method1796() {
		if (Static176.aClass36_1 != null) {
			@Pc(9) boolean local9 = true;
			for (@Pc(11) int local11 = 0; local11 < 2; local11++) {
				if (Static176.aClass36_1.aClass5Array1[local11] == this) {
					Static176.aClass36_1.aClass5Array1[local11] = null;
				}
				if (Static176.aClass36_1.aClass5Array1[local11] != null) {
					local9 = false;
				}
			}
			if (local9) {
				Static176.aClass36_1.aBoolean58 = true;
				while (Static176.aClass36_1.aBoolean57) {
					Static50.method901(50L);
				}
				Static176.aClass36_1 = null;
			}
		}
		this.method1792();
		this.anIntArray210 = null;
	}

	@OriginalMember(owner = "client!ah", name = "c", descriptor = "()V")
	protected void method1797() throws Exception {
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(IB)V")
	private void method1798() {
		this.anInt2224 -= 256;
		if (this.anInt2224 < 0) {
			this.anInt2224 = 0;
		}
		if (this.aClass2_Sub14_6 != null) {
			this.aClass2_Sub14_6.method2587(256);
		}
	}

	@OriginalMember(owner = "client!ah", name = "d", descriptor = "()V")
	protected void method1799() throws Exception {
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(Ljava/awt/Component;)V")
	public void method1800(@OriginalArg(0) Component arg0) throws Exception {
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "([II)V")
	private void method1801(@OriginalArg(0) int[] arg0) {
		@Pc(1) short local1 = 256;
		if (Static149.aBoolean131) {
			local1 = 512;
		}
		Static191.method1824(arg0, 0, local1);
		this.anInt2224 -= 256;
		if (this.aClass2_Sub14_6 != null && this.anInt2224 <= 0) {
			this.anInt2224 += Static22.anInt472 >> 4;
			Static82.method1419(this.aClass2_Sub14_6);
			this.method1791(this.aClass2_Sub14_6, this.aClass2_Sub14_6.method2583());
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
						@Pc(88) Class2_Sub14 local88 = null;
						@Pc(93) Class2_Sub14 local93 = this.aClass2_Sub14Array5[local56];
						label97: while (true) {
							while (true) {
								if (local93 == null) {
									break label97;
								}
								@Pc(97) Class2_Sub5 local97 = local93.aClass2_Sub5_5;
								if (local97 == null || local97.anInt1819 <= local61) {
									local93.aBoolean143 = true;
									@Pc(121) int local121 = local93.method2589();
									local45 += local121;
									if (local97 != null) {
										local97.anInt1819 += local121;
									}
									if (local45 >= this.anInt2222) {
										break label103;
									}
									@Pc(140) Class2_Sub14 local140 = local93.method2586();
									if (local140 != null) {
										@Pc(145) int local145 = local93.anInt3345;
										while (local140 != null) {
											this.method1791(local140, local145 * local140.method2583() >> 8);
											local140 = local93.method2588();
										}
									}
									@Pc(164) Class2_Sub14 local164 = local93.aClass2_Sub14_8;
									local93.aClass2_Sub14_8 = null;
									if (local88 == null) {
										this.aClass2_Sub14Array5[local56] = local164;
									} else {
										local88.aClass2_Sub14_8 = local164;
									}
									if (local164 == null) {
										this.aClass2_Sub14Array6[local56] = local88;
									}
									local93 = local164;
								} else {
									local47 |= 0x1 << local56;
									local88 = local93;
									local93 = local93.aClass2_Sub14_8;
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
				@Pc(207) Class2_Sub14 local207 = this.aClass2_Sub14Array5[local56];
				this.aClass2_Sub14Array5[local56] = this.aClass2_Sub14Array6[local56] = null;
				while (local207 != null) {
					@Pc(221) Class2_Sub14 local221 = local207.aClass2_Sub14_8;
					local207.aClass2_Sub14_8 = null;
					local207 = local221;
				}
			}
		}
		if (this.anInt2224 < 0) {
			this.anInt2224 = 0;
		}
		if (this.aClass2_Sub14_6 != null) {
			this.aClass2_Sub14_6.method2584(arg0, 0, 256);
		}
		this.aLong99 = Static108.method1828();
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(ILclient!kc;)V")
	public final synchronized void method1802(@OriginalArg(1) Class2_Sub14 arg0) {
		this.aClass2_Sub14_6 = arg0;
	}
}
