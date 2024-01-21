import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gh")
public class Class25 {

	@OriginalMember(owner = "client!gh", name = "k", descriptor = "[I")
	public int[] anIntArray197;

	@OriginalMember(owner = "client!gh", name = "v", descriptor = "Lclient!bc;")
	private Class1_Sub5 aClass1_Sub5_8;

	@OriginalMember(owner = "client!gh", name = "B", descriptor = "I")
	public int anInt2227;

	@OriginalMember(owner = "client!gh", name = "C", descriptor = "I")
	public int anInt2228;

	@OriginalMember(owner = "client!gh", name = "J", descriptor = "I")
	private int anInt2232;

	@OriginalMember(owner = "client!gh", name = "h", descriptor = "I")
	private final int anInt2214 = 32;

	@OriginalMember(owner = "client!gh", name = "r", descriptor = "J")
	private long aLong65 = Static146.method2771();

	@OriginalMember(owner = "client!gh", name = "F", descriptor = "I")
	private int anInt2230 = 0;

	@OriginalMember(owner = "client!gh", name = "E", descriptor = "J")
	private long aLong66 = 0L;

	@OriginalMember(owner = "client!gh", name = "G", descriptor = "I")
	private int anInt2231 = 0;

	@OriginalMember(owner = "client!gh", name = "H", descriptor = "J")
	private long aLong67 = 0L;

	@OriginalMember(owner = "client!gh", name = "I", descriptor = "[Lclient!bc;")
	private final Class1_Sub5[] aClass1_Sub5Array5 = new Class1_Sub5[8];

	@OriginalMember(owner = "client!gh", name = "D", descriptor = "I")
	private int anInt2229 = 0;

	@OriginalMember(owner = "client!gh", name = "K", descriptor = "I")
	private int anInt2233 = 0;

	@OriginalMember(owner = "client!gh", name = "L", descriptor = "Z")
	private boolean aBoolean88 = true;

	@OriginalMember(owner = "client!gh", name = "M", descriptor = "[Lclient!bc;")
	private final Class1_Sub5[] aClass1_Sub5Array6 = new Class1_Sub5[8];

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(I)V")
	public final synchronized void method1553() {
		if (Static5.aClass48_1 != null) {
			@Pc(5) boolean local5 = true;
			for (@Pc(7) int local7 = 0; local7 < 2; local7++) {
				if (Static5.aClass48_1.aClass25Array1[local7] == this) {
					Static5.aClass48_1.aClass25Array1[local7] = null;
				}
				if (Static5.aClass48_1.aClass25Array1[local7] != null) {
					local5 = false;
				}
			}
			if (local5) {
				Static5.aClass48_1.aBoolean124 = true;
				while (Static5.aClass48_1.aBoolean123) {
					Static114.method2304(50L);
				}
				Static5.aClass48_1 = null;
			}
		}
		this.method1558();
		this.anIntArray197 = null;
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "()V")
	protected void method1554() throws Exception {
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(Ljava/awt/Component;)V")
	public void method1555(@OriginalArg(0) Component arg0) throws Exception {
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(IZ)V")
	private void method1556() {
		this.anInt2229 -= 256;
		if (this.anInt2229 < 0) {
			this.anInt2229 = 0;
		}
		if (this.aClass1_Sub5_8 != null) {
			this.aClass1_Sub5_8.method1316(256);
		}
	}

	@OriginalMember(owner = "client!gh", name = "b", descriptor = "()V")
	protected void method1557() throws Exception {
	}

	@OriginalMember(owner = "client!gh", name = "c", descriptor = "()V")
	protected void method1558() {
	}

	@OriginalMember(owner = "client!gh", name = "d", descriptor = "()I")
	protected int method1559() throws Exception {
		return this.anInt2227;
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(B)V")
	public final synchronized void method1560() {
		this.aBoolean88 = true;
		try {
			this.method1554();
		} catch (@Pc(16) Exception local16) {
			this.method1558();
			this.aLong67 = Static146.method2771() + 2000L;
		}
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(Z)V")
	public final void method1561() {
		this.aBoolean88 = true;
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(ILclient!bc;Z)V")
	private void method1562(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub5 arg1) {
		@Pc(7) int local7 = arg0 >> 5;
		@Pc(20) Class1_Sub5 local20 = this.aClass1_Sub5Array6[local7];
		if (local20 == null) {
			this.aClass1_Sub5Array5[local7] = arg1;
		} else {
			local20.aClass1_Sub5_7 = arg1;
		}
		this.aClass1_Sub5Array6[local7] = arg1;
		arg1.anInt2001 = arg0;
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(ILclient!bc;)V")
	public final synchronized void method1563(@OriginalArg(1) Class1_Sub5 arg0) {
		this.aClass1_Sub5_8 = arg0;
	}

	@OriginalMember(owner = "client!gh", name = "b", descriptor = "(I)V")
	public void method1564(@OriginalArg(0) int arg0) throws Exception {
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "([II)V")
	private void method1565(@OriginalArg(0) int[] arg0) {
		@Pc(1) short local1 = 256;
		if (Static71.aBoolean84) {
			local1 = 512;
		}
		Static185.method2280(arg0, 0, local1);
		this.anInt2229 -= 256;
		if (this.aClass1_Sub5_8 != null && this.anInt2229 <= 0) {
			this.anInt2229 += Static74.anInt2248 >> 4;
			Static19.method347(this.aClass1_Sub5_8);
			this.method1562(this.aClass1_Sub5_8.method1317(), this.aClass1_Sub5_8);
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
						@Pc(88) Class1_Sub5 local88 = null;
						@Pc(93) Class1_Sub5 local93 = this.aClass1_Sub5Array5[local56];
						label97: while (true) {
							while (true) {
								if (local93 == null) {
									break label97;
								}
								@Pc(97) Class1_Sub13 local97 = local93.aClass1_Sub13_5;
								if (local97 == null || local97.anInt2077 <= local61) {
									local93.aBoolean79 = true;
									@Pc(121) int local121 = local93.method1312();
									local45 += local121;
									if (local97 != null) {
										local97.anInt2077 += local121;
									}
									if (local45 >= this.anInt2214) {
										break label103;
									}
									@Pc(140) Class1_Sub5 local140 = local93.method1318();
									if (local140 != null) {
										@Pc(145) int local145 = local93.anInt2001;
										while (local140 != null) {
											this.method1562(local145 * local140.method1317() >> 8, local140);
											local140 = local93.method1314();
										}
									}
									@Pc(164) Class1_Sub5 local164 = local93.aClass1_Sub5_7;
									local93.aClass1_Sub5_7 = null;
									if (local88 == null) {
										this.aClass1_Sub5Array5[local56] = local164;
									} else {
										local88.aClass1_Sub5_7 = local164;
									}
									if (local164 == null) {
										this.aClass1_Sub5Array6[local56] = local88;
									}
									local93 = local164;
								} else {
									local47 |= 0x1 << local56;
									local88 = local93;
									local93 = local93.aClass1_Sub5_7;
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
				@Pc(207) Class1_Sub5 local207 = this.aClass1_Sub5Array5[local56];
				this.aClass1_Sub5Array5[local56] = this.aClass1_Sub5Array6[local56] = null;
				while (local207 != null) {
					@Pc(221) Class1_Sub5 local221 = local207.aClass1_Sub5_7;
					local207.aClass1_Sub5_7 = null;
					local207 = local221;
				}
			}
		}
		if (this.anInt2229 < 0) {
			this.anInt2229 = 0;
		}
		if (this.aClass1_Sub5_8 != null) {
			this.aClass1_Sub5_8.method1313(arg0, 0, 256);
		}
		this.aLong65 = Static146.method2771();
	}

	@OriginalMember(owner = "client!gh", name = "c", descriptor = "(I)V")
	public final synchronized void method1566() {
		if (this.anIntArray197 == null) {
			return;
		}
		@Pc(12) long local12 = Static146.method2771();
		try {
			if (this.aLong67 != 0L) {
				if (local12 < this.aLong67) {
					return;
				}
				this.method1564(this.anInt2227);
				this.aLong67 = 0L;
				this.aBoolean88 = true;
			}
			@Pc(40) int local40 = this.method1559();
			if (this.anInt2230 - local40 > this.anInt2233) {
				this.anInt2233 = this.anInt2230 - local40;
			}
			@Pc(65) int local65 = this.anInt2232 + this.anInt2228;
			if (local65 + 256 > 16384) {
				local65 = 16128;
			}
			if (local65 + 256 > this.anInt2227) {
				local40 = 0;
				this.anInt2227 += 1024;
				if (this.anInt2227 > 16384) {
					this.anInt2227 = 16384;
				}
				this.method1558();
				this.method1564(this.anInt2227);
				this.aBoolean88 = true;
				if (local65 + 256 > this.anInt2227) {
					local65 = this.anInt2227 - 256;
					this.anInt2232 = local65 - this.anInt2228;
				}
			}
			while (local65 > local40) {
				this.method1565(this.anIntArray197);
				this.method1557();
				local40 += 256;
			}
			if (this.aLong66 < local12) {
				if (this.aBoolean88) {
					this.aBoolean88 = false;
				} else if (this.anInt2233 == 0 && this.anInt2231 == 0) {
					this.method1558();
					this.aLong67 = local12 + 2000L;
					return;
				} else {
					this.anInt2232 = Math.min(this.anInt2231, this.anInt2233);
					this.anInt2231 = this.anInt2233;
				}
				this.aLong66 = local12 + 2000L;
				this.anInt2233 = 0;
			}
			this.anInt2230 = local40;
		} catch (@Pc(211) Exception local211) {
			this.method1558();
			this.aLong67 = local12 + 2000L;
		}
		try {
			if (this.aLong65 + 500000L < local12) {
				local12 = this.aLong65;
			}
			while (this.aLong65 + 5000L < local12) {
				this.method1556();
				this.aLong65 += 256000 / Static74.anInt2248;
			}
		} catch (@Pc(252) Exception local252) {
			this.aLong65 = local12;
		}
	}
}
