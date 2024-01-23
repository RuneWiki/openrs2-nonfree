import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cb")
public class Class15 {

	@OriginalMember(owner = "client!cb", name = "r", descriptor = "Lclient!li;")
	private Class1_Sub7 aClass1_Sub7_5;

	@OriginalMember(owner = "client!cb", name = "A", descriptor = "[I")
	public int[] anIntArray335;

	@OriginalMember(owner = "client!cb", name = "C", descriptor = "I")
	private int anInt2655;

	@OriginalMember(owner = "client!cb", name = "E", descriptor = "I")
	public int anInt2657;

	@OriginalMember(owner = "client!cb", name = "J", descriptor = "I")
	public int anInt2660;

	@OriginalMember(owner = "client!cb", name = "t", descriptor = "I")
	private int anInt2648 = 32;

	@OriginalMember(owner = "client!cb", name = "p", descriptor = "J")
	private long aLong82 = Static3.method57();

	@OriginalMember(owner = "client!cb", name = "B", descriptor = "Z")
	private boolean aBoolean145 = true;

	@OriginalMember(owner = "client!cb", name = "D", descriptor = "I")
	private int anInt2656 = 0;

	@OriginalMember(owner = "client!cb", name = "I", descriptor = "I")
	private int anInt2659 = 0;

	@OriginalMember(owner = "client!cb", name = "H", descriptor = "I")
	private int anInt2658 = 0;

	@OriginalMember(owner = "client!cb", name = "N", descriptor = "[Lclient!li;")
	private Class1_Sub7[] aClass1_Sub7Array6 = new Class1_Sub7[8];

	@OriginalMember(owner = "client!cb", name = "M", descriptor = "I")
	private int anInt2661 = 0;

	@OriginalMember(owner = "client!cb", name = "G", descriptor = "[Lclient!li;")
	private Class1_Sub7[] aClass1_Sub7Array5 = new Class1_Sub7[8];

	@OriginalMember(owner = "client!cb", name = "K", descriptor = "J")
	private long aLong83 = 0L;

	@OriginalMember(owner = "client!cb", name = "L", descriptor = "J")
	private long aLong84 = 0L;

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(ZLclient!li;)V")
	public final synchronized void method1983(@OriginalArg(1) Class1_Sub7 arg0) {
		this.aClass1_Sub7_5 = arg0;
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "()V")
	protected void method1984() throws Exception {
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(B)V")
	public final synchronized void method1986() {
		if (Static166.aClass98_1 != null) {
			@Pc(9) boolean local9 = true;
			for (@Pc(11) int local11 = 0; local11 < 2; local11++) {
				if (Static166.aClass98_1.aClass15Array1[local11] == this) {
					Static166.aClass98_1.aClass15Array1[local11] = null;
				}
				if (Static166.aClass98_1.aClass15Array1[local11] != null) {
					local9 = false;
				}
			}
			if (local9) {
				Static166.aClass98_1.aBoolean229 = true;
				while (Static166.aClass98_1.aBoolean230) {
					Static146.method2494(50L);
				}
				Static166.aClass98_1 = null;
			}
		}
		this.method1987();
		this.anIntArray335 = null;
	}

	@OriginalMember(owner = "client!cb", name = "b", descriptor = "()V")
	protected void method1987() {
	}

	@OriginalMember(owner = "client!cb", name = "b", descriptor = "(B)V")
	public final void method1988() {
		this.aBoolean145 = true;
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(II)V")
	private void method1989() {
		this.anInt2656 -= 256;
		if (this.anInt2656 < 0) {
			this.anInt2656 = 0;
		}
		if (this.aClass1_Sub7_5 != null) {
			this.aClass1_Sub7_5.method3450(256);
		}
	}

	@OriginalMember(owner = "client!cb", name = "c", descriptor = "(B)V")
	public final synchronized void method1990() {
		if (this.anIntArray335 == null) {
			return;
		}
		@Pc(20) long local20 = Static3.method57();
		try {
			if (this.aLong84 != 0L) {
				if (local20 < this.aLong84) {
					return;
				}
				this.method1999(this.anInt2657);
				this.aLong84 = 0L;
				this.aBoolean145 = true;
			}
			@Pc(46) int local46 = this.method1992();
			if (this.anInt2659 - local46 > this.anInt2658) {
				this.anInt2658 = this.anInt2659 - local46;
			}
			@Pc(70) int local70 = this.anInt2660 + this.anInt2655;
			if (local70 + 256 > 16384) {
				local70 = 16128;
			}
			if (local70 + 256 > this.anInt2657) {
				this.anInt2657 += 1024;
				local46 = 0;
				if (this.anInt2657 > 16384) {
					this.anInt2657 = 16384;
				}
				this.method1987();
				this.method1999(this.anInt2657);
				if (local70 + 256 > this.anInt2657) {
					local70 = this.anInt2657 - 256;
					this.anInt2655 = local70 - this.anInt2660;
				}
				this.aBoolean145 = true;
			}
			while (local46 < local70) {
				local46 += 256;
				this.method1998(this.anIntArray335);
				this.method1984();
			}
			if (this.aLong83 < local20) {
				if (this.aBoolean145) {
					this.aBoolean145 = false;
				} else if (this.anInt2658 == 0 && this.anInt2661 == 0) {
					this.method1987();
					this.aLong84 = local20 + 2000L;
					return;
				} else {
					this.anInt2655 = Math.min(this.anInt2661, this.anInt2658);
					this.anInt2661 = this.anInt2658;
				}
				this.aLong83 = local20 + 2000L;
				this.anInt2658 = 0;
			}
			this.anInt2659 = local46;
		} catch (@Pc(207) Exception local207) {
			this.method1987();
			this.aLong84 = local20 + 2000L;
		}
		try {
			if (this.aLong82 + 500000L < local20) {
				local20 = this.aLong82;
			}
			while (this.aLong82 + 5000L < local20) {
				this.method1989();
				this.aLong82 += 256000 / Static191.anInt4086;
			}
		} catch (@Pc(252) Exception local252) {
			this.aLong82 = local20;
		}
	}

	@OriginalMember(owner = "client!cb", name = "c", descriptor = "()I")
	protected int method1992() throws Exception {
		return this.anInt2657;
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(Ljava/awt/Component;)V")
	public void method1994(@OriginalArg(0) Component arg0) throws Exception {
	}

	@OriginalMember(owner = "client!cb", name = "d", descriptor = "()V")
	protected void method1995() throws Exception {
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(Lclient!li;II)V")
	private void method1996(@OriginalArg(0) Class1_Sub7 arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = arg1 >> 5;
		@Pc(13) Class1_Sub7 local13 = this.aClass1_Sub7Array5[local3];
		if (local13 == null) {
			this.aClass1_Sub7Array6[local3] = arg0;
		} else {
			local13.aClass1_Sub7_8 = arg0;
		}
		this.aClass1_Sub7Array5[local3] = arg0;
		arg0.anInt4677 = arg1;
	}

	@OriginalMember(owner = "client!cb", name = "b", descriptor = "(I)V")
	public final synchronized void method1997() {
		this.aBoolean145 = true;
		try {
			this.method1995();
		} catch (@Pc(12) Exception local12) {
			this.method1987();
			this.aLong84 = Static3.method57() + 2000L;
		}
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "([II)V")
	private void method1998(@OriginalArg(0) int[] arg0) {
		@Pc(1) short local1 = 256;
		if (Static59.aBoolean76) {
			local1 = 512;
		}
		Static221.method33(arg0, 0, local1);
		this.anInt2656 -= 256;
		if (this.aClass1_Sub7_5 != null && this.anInt2656 <= 0) {
			this.anInt2656 += Static191.anInt4086 >> 4;
			Static139.method2380(this.aClass1_Sub7_5);
			this.method1996(this.aClass1_Sub7_5, this.aClass1_Sub7_5.method3451());
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
						@Pc(88) Class1_Sub7 local88 = null;
						@Pc(93) Class1_Sub7 local93 = this.aClass1_Sub7Array6[local56];
						label97: while (true) {
							while (true) {
								if (local93 == null) {
									break label97;
								}
								@Pc(97) Class1_Sub19 local97 = local93.aClass1_Sub19_5;
								if (local97 == null || local97.anInt3295 <= local61) {
									local93.aBoolean263 = true;
									@Pc(121) int local121 = local93.method3453();
									local45 += local121;
									if (local97 != null) {
										local97.anInt3295 += local121;
									}
									if (local45 >= this.anInt2648) {
										break label103;
									}
									@Pc(140) Class1_Sub7 local140 = local93.method3454();
									if (local140 != null) {
										@Pc(145) int local145 = local93.anInt4677;
										while (local140 != null) {
											this.method1996(local140, local145 * local140.method3451() >> 8);
											local140 = local93.method3452();
										}
									}
									@Pc(164) Class1_Sub7 local164 = local93.aClass1_Sub7_8;
									local93.aClass1_Sub7_8 = null;
									if (local88 == null) {
										this.aClass1_Sub7Array6[local56] = local164;
									} else {
										local88.aClass1_Sub7_8 = local164;
									}
									if (local164 == null) {
										this.aClass1_Sub7Array5[local56] = local88;
									}
									local93 = local164;
								} else {
									local47 |= 0x1 << local56;
									local88 = local93;
									local93 = local93.aClass1_Sub7_8;
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
				@Pc(207) Class1_Sub7 local207 = this.aClass1_Sub7Array6[local56];
				this.aClass1_Sub7Array6[local56] = this.aClass1_Sub7Array5[local56] = null;
				while (local207 != null) {
					@Pc(221) Class1_Sub7 local221 = local207.aClass1_Sub7_8;
					local207.aClass1_Sub7_8 = null;
					local207 = local221;
				}
			}
		}
		if (this.anInt2656 < 0) {
			this.anInt2656 = 0;
		}
		if (this.aClass1_Sub7_5 != null) {
			this.aClass1_Sub7_5.method3448(arg0, 0, 256);
		}
		this.aLong82 = Static3.method57();
	}

	@OriginalMember(owner = "client!cb", name = "c", descriptor = "(I)V")
	public void method1999(@OriginalArg(0) int arg0) throws Exception {
	}
}
