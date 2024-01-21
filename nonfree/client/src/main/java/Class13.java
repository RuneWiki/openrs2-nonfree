import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!db")
public class Class13 {

	@OriginalMember(owner = "client!db", name = "j", descriptor = "Lclient!rf;")
	private Class8_Sub11 aClass8_Sub11_6;

	@OriginalMember(owner = "client!db", name = "p", descriptor = "[I")
	public int[] anIntArray343;

	@OriginalMember(owner = "client!db", name = "H", descriptor = "I")
	private int anInt2559;

	@OriginalMember(owner = "client!db", name = "K", descriptor = "I")
	public int anInt2561;

	@OriginalMember(owner = "client!db", name = "M", descriptor = "I")
	public int anInt2563;

	@OriginalMember(owner = "client!db", name = "E", descriptor = "I")
	private final int anInt2557 = 32;

	@OriginalMember(owner = "client!db", name = "l", descriptor = "J")
	private long aLong85 = Static27.method497();

	@OriginalMember(owner = "client!db", name = "I", descriptor = "I")
	private int anInt2560 = 0;

	@OriginalMember(owner = "client!db", name = "F", descriptor = "J")
	private long aLong87 = 0L;

	@OriginalMember(owner = "client!db", name = "L", descriptor = "I")
	private int anInt2562 = 0;

	@OriginalMember(owner = "client!db", name = "J", descriptor = "[Lclient!rf;")
	private final Class8_Sub11[] aClass8_Sub11Array5 = new Class8_Sub11[8];

	@OriginalMember(owner = "client!db", name = "P", descriptor = "I")
	private int anInt2565 = 0;

	@OriginalMember(owner = "client!db", name = "O", descriptor = "Z")
	private boolean aBoolean101 = true;

	@OriginalMember(owner = "client!db", name = "N", descriptor = "I")
	private int anInt2564 = 0;

	@OriginalMember(owner = "client!db", name = "Q", descriptor = "J")
	private long aLong88 = 0L;

	@OriginalMember(owner = "client!db", name = "R", descriptor = "[Lclient!rf;")
	private final Class8_Sub11[] aClass8_Sub11Array6 = new Class8_Sub11[8];

	@OriginalMember(owner = "client!db", name = "a", descriptor = "()V")
	protected void method1594() {
	}

	@OriginalMember(owner = "client!db", name = "b", descriptor = "()V")
	protected void method1596() throws Exception {
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(Z)V")
	public final synchronized void method1597() {
		if (Static30.aClass53_1 != null) {
			@Pc(9) boolean local9 = true;
			for (@Pc(11) int local11 = 0; local11 < 2; local11++) {
				if (Static30.aClass53_1.aClass13Array1[local11] == this) {
					Static30.aClass53_1.aClass13Array1[local11] = null;
				}
				if (Static30.aClass53_1.aClass13Array1[local11] != null) {
					local9 = false;
				}
			}
			if (local9) {
				Static30.aClass53_1.aBoolean83 = true;
				while (Static30.aClass53_1.aBoolean84) {
					Static107.method1511(50L);
				}
				Static30.aClass53_1 = null;
			}
		}
		this.method1594();
		this.anIntArray343 = null;
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "([II)V")
	private void method1600(@OriginalArg(0) int[] arg0) {
		@Pc(1) short local1 = 256;
		if (Static23.aBoolean34) {
			local1 = 512;
		}
		Static140.method1344(arg0, 0, local1);
		this.anInt2560 -= 256;
		if (this.aClass8_Sub11_6 != null && this.anInt2560 <= 0) {
			this.anInt2560 += Static23.anInt713 >> 4;
			Static91.method1324(this.aClass8_Sub11_6);
			this.method1604(this.aClass8_Sub11_6, this.aClass8_Sub11_6.method1915());
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
						@Pc(88) Class8_Sub11 local88 = null;
						@Pc(93) Class8_Sub11 local93 = this.aClass8_Sub11Array5[local56];
						label97: while (true) {
							while (true) {
								if (local93 == null) {
									break label97;
								}
								@Pc(97) Class8_Sub9 local97 = local93.aClass8_Sub9_5;
								if (local97 == null || local97.anInt2234 <= local61) {
									local93.aBoolean105 = true;
									@Pc(121) int local121 = local93.method1919();
									local45 += local121;
									if (local97 != null) {
										local97.anInt2234 += local121;
									}
									if (local45 >= this.anInt2557) {
										break label103;
									}
									@Pc(140) Class8_Sub11 local140 = local93.method1920();
									if (local140 != null) {
										@Pc(145) int local145 = local93.anInt2904;
										while (local140 != null) {
											this.method1604(local140, local145 * local140.method1915() >> 8);
											local140 = local93.method1918();
										}
									}
									@Pc(164) Class8_Sub11 local164 = local93.aClass8_Sub11_8;
									local93.aClass8_Sub11_8 = null;
									if (local88 == null) {
										this.aClass8_Sub11Array5[local56] = local164;
									} else {
										local88.aClass8_Sub11_8 = local164;
									}
									if (local164 == null) {
										this.aClass8_Sub11Array6[local56] = local88;
									}
									local93 = local164;
								} else {
									local47 |= 0x1 << local56;
									local88 = local93;
									local93 = local93.aClass8_Sub11_8;
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
				@Pc(207) Class8_Sub11 local207 = this.aClass8_Sub11Array5[local56];
				this.aClass8_Sub11Array5[local56] = this.aClass8_Sub11Array6[local56] = null;
				while (local207 != null) {
					@Pc(221) Class8_Sub11 local221 = local207.aClass8_Sub11_8;
					local207.aClass8_Sub11_8 = null;
					local207 = local221;
				}
			}
		}
		if (this.anInt2560 < 0) {
			this.anInt2560 = 0;
		}
		if (this.aClass8_Sub11_6 != null) {
			this.aClass8_Sub11_6.method1921(arg0, 0, 256);
		}
		this.aLong85 = Static27.method497();
	}

	@OriginalMember(owner = "client!db", name = "b", descriptor = "(I)V")
	public final synchronized void method1601() {
		if (this.anIntArray343 == null) {
			return;
		}
		@Pc(12) long local12 = Static27.method497();
		try {
			if (this.aLong87 != 0L) {
				if (local12 < this.aLong87) {
					return;
				}
				this.method1608(this.anInt2563);
				this.aBoolean101 = true;
				this.aLong87 = 0L;
			}
			@Pc(38) int local38 = this.method1605();
			if (this.anInt2565 < this.anInt2562 - local38) {
				this.anInt2565 = this.anInt2562 - local38;
			}
			@Pc(67) int local67 = this.anInt2559 + this.anInt2561;
			if (local67 + 256 > 16384) {
				local67 = 16128;
			}
			if (local67 + 256 > this.anInt2563) {
				local38 = 0;
				this.anInt2563 += 1024;
				if (this.anInt2563 > 16384) {
					this.anInt2563 = 16384;
				}
				this.method1594();
				this.method1608(this.anInt2563);
				this.aBoolean101 = true;
				if (local67 + 256 > this.anInt2563) {
					local67 = this.anInt2563 - 256;
					this.anInt2559 = local67 - this.anInt2561;
				}
			}
			while (local67 > local38) {
				local38 += 256;
				this.method1600(this.anIntArray343);
				this.method1609();
			}
			if (local12 > this.aLong88) {
				if (this.aBoolean101) {
					this.aBoolean101 = false;
				} else if (this.anInt2565 == 0 && this.anInt2564 == 0) {
					this.method1594();
					this.aLong87 = local12 + 2000L;
					return;
				} else {
					this.anInt2559 = Math.min(this.anInt2564, this.anInt2565);
					this.anInt2564 = this.anInt2565;
				}
				this.aLong88 = local12 + 2000L;
				this.anInt2565 = 0;
			}
			this.anInt2562 = local38;
		} catch (@Pc(204) Exception local204) {
			this.method1594();
			this.aLong87 = local12 + 2000L;
		}
		try {
			if (this.aLong85 + 500000L < local12) {
				local12 = this.aLong85;
			}
			while (local12 > this.aLong85 + 5000L) {
				this.method1603();
				this.aLong85 += 256000 / Static23.anInt713;
			}
		} catch (@Pc(245) Exception local245) {
			this.aLong85 = local12;
		}
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(IZ)V")
	private void method1603() {
		this.anInt2560 -= 256;
		if (this.anInt2560 < 0) {
			this.anInt2560 = 0;
		}
		if (this.aClass8_Sub11_6 != null) {
			this.aClass8_Sub11_6.method1917(256);
		}
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(Lclient!rf;IB)V")
	private void method1604(@OriginalArg(0) Class8_Sub11 arg0, @OriginalArg(1) int arg1) {
		@Pc(7) int local7 = arg1 >> 5;
		@Pc(12) Class8_Sub11 local12 = this.aClass8_Sub11Array6[local7];
		if (local12 == null) {
			this.aClass8_Sub11Array5[local7] = arg0;
		} else {
			local12.aClass8_Sub11_8 = arg0;
		}
		this.aClass8_Sub11Array6[local7] = arg0;
		arg0.anInt2904 = arg1;
	}

	@OriginalMember(owner = "client!db", name = "c", descriptor = "()I")
	protected int method1605() throws Exception {
		return this.anInt2563;
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(Lclient!rf;B)V")
	public final synchronized void method1606(@OriginalArg(0) Class8_Sub11 arg0) {
		this.aClass8_Sub11_6 = arg0;
	}

	@OriginalMember(owner = "client!db", name = "c", descriptor = "(I)V")
	public final void method1607() {
		this.aBoolean101 = true;
	}

	@OriginalMember(owner = "client!db", name = "d", descriptor = "(I)V")
	public void method1608(@OriginalArg(0) int arg0) throws Exception {
	}

	@OriginalMember(owner = "client!db", name = "d", descriptor = "()V")
	protected void method1609() throws Exception {
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(Ljava/awt/Component;)V")
	public void method1610(@OriginalArg(0) Component arg0) throws Exception {
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(B)V")
	public final synchronized void method1611() {
		this.aBoolean101 = true;
		try {
			this.method1596();
		} catch (@Pc(16) Exception local16) {
			this.method1594();
			this.aLong87 = Static27.method497() + 2000L;
		}
	}
}
