import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cc")
public class Class11 {

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "[I")
	public int[] anIntArray333;

	@OriginalMember(owner = "client!cc", name = "w", descriptor = "Lclient!ac;")
	private Class4_Sub1 aClass4_Sub1_8;

	@OriginalMember(owner = "client!cc", name = "B", descriptor = "I")
	public int anInt2665;

	@OriginalMember(owner = "client!cc", name = "G", descriptor = "I")
	public int anInt2668;

	@OriginalMember(owner = "client!cc", name = "J", descriptor = "I")
	private int anInt2669;

	@OriginalMember(owner = "client!cc", name = "s", descriptor = "I")
	private final int anInt2661 = 32;

	@OriginalMember(owner = "client!cc", name = "m", descriptor = "J")
	private long aLong88 = Static8.method75();

	@OriginalMember(owner = "client!cc", name = "F", descriptor = "J")
	private long aLong89 = 0L;

	@OriginalMember(owner = "client!cc", name = "D", descriptor = "I")
	private int anInt2666 = 0;

	@OriginalMember(owner = "client!cc", name = "C", descriptor = "[Lclient!ac;")
	private final Class4_Sub1[] aClass4_Sub1Array5 = new Class4_Sub1[8];

	@OriginalMember(owner = "client!cc", name = "H", descriptor = "[Lclient!ac;")
	private final Class4_Sub1[] aClass4_Sub1Array6 = new Class4_Sub1[8];

	@OriginalMember(owner = "client!cc", name = "K", descriptor = "I")
	private int anInt2670 = 0;

	@OriginalMember(owner = "client!cc", name = "I", descriptor = "Z")
	private boolean aBoolean115 = true;

	@OriginalMember(owner = "client!cc", name = "E", descriptor = "I")
	private int anInt2667 = 0;

	@OriginalMember(owner = "client!cc", name = "L", descriptor = "I")
	private int anInt2671 = 0;

	@OriginalMember(owner = "client!cc", name = "M", descriptor = "J")
	private long aLong90 = 0L;

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(I)V")
	public final synchronized void method1835() {
		if (Static62.aClass61_1 != null) {
			@Pc(9) boolean local9 = true;
			for (@Pc(11) int local11 = 0; local11 < 2; local11++) {
				if (Static62.aClass61_1.aClass11Array1[local11] == this) {
					Static62.aClass61_1.aClass11Array1[local11] = null;
				}
				if (Static62.aClass61_1.aClass11Array1[local11] != null) {
					local9 = false;
				}
			}
			if (local9) {
				Static62.aClass61_1.aBoolean68 = true;
				while (Static62.aClass61_1.aBoolean69) {
					Static103.method1711(50L);
				}
				Static62.aClass61_1 = null;
			}
		}
		this.method1849();
		this.anIntArray333 = null;
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "([II)V")
	private void method1836(@OriginalArg(0) int[] arg0) {
		@Pc(1) short local1 = 256;
		if (Static6.aBoolean2) {
			local1 = 512;
		}
		Static136.method699(arg0, 0, local1);
		this.anInt2670 -= 256;
		if (this.aClass4_Sub1_8 != null && this.anInt2670 <= 0) {
			this.anInt2670 += Static115.anInt2690 >> 4;
			Static98.method1578(this.aClass4_Sub1_8);
			this.method1848(this.aClass4_Sub1_8.method1812(), this.aClass4_Sub1_8);
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
						@Pc(88) Class4_Sub1 local88 = null;
						@Pc(93) Class4_Sub1 local93 = this.aClass4_Sub1Array5[local56];
						label97: while (true) {
							while (true) {
								if (local93 == null) {
									break label97;
								}
								@Pc(97) Class4_Sub6 local97 = local93.aClass4_Sub6_5;
								if (local97 == null || local97.anInt2324 <= local61) {
									local93.aBoolean114 = true;
									@Pc(121) int local121 = local93.method1816();
									local45 += local121;
									if (local97 != null) {
										local97.anInt2324 += local121;
									}
									if (local45 >= this.anInt2661) {
										break label103;
									}
									@Pc(140) Class4_Sub1 local140 = local93.method1814();
									if (local140 != null) {
										@Pc(145) int local145 = local93.anInt2601;
										while (local140 != null) {
											this.method1848(local145 * local140.method1812() >> 8, local140);
											local140 = local93.method1811();
										}
									}
									@Pc(164) Class4_Sub1 local164 = local93.aClass4_Sub1_7;
									local93.aClass4_Sub1_7 = null;
									if (local88 == null) {
										this.aClass4_Sub1Array5[local56] = local164;
									} else {
										local88.aClass4_Sub1_7 = local164;
									}
									if (local164 == null) {
										this.aClass4_Sub1Array6[local56] = local88;
									}
									local93 = local164;
								} else {
									local47 |= 0x1 << local56;
									local88 = local93;
									local93 = local93.aClass4_Sub1_7;
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
				@Pc(207) Class4_Sub1 local207 = this.aClass4_Sub1Array5[local56];
				this.aClass4_Sub1Array5[local56] = this.aClass4_Sub1Array6[local56] = null;
				while (local207 != null) {
					@Pc(221) Class4_Sub1 local221 = local207.aClass4_Sub1_7;
					local207.aClass4_Sub1_7 = null;
					local207 = local221;
				}
			}
		}
		if (this.anInt2670 < 0) {
			this.anInt2670 = 0;
		}
		if (this.aClass4_Sub1_8 != null) {
			this.aClass4_Sub1_8.method1813(arg0, 0, 256);
		}
		this.aLong88 = Static8.method75();
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(BLclient!ac;)V")
	public final synchronized void method1837(@OriginalArg(1) Class4_Sub1 arg0) {
		this.aClass4_Sub1_8 = arg0;
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(Ljava/awt/Component;)V")
	public void method1838(@OriginalArg(0) Component arg0) throws Exception {
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "()I")
	protected int method1839() throws Exception {
		return this.anInt2665;
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(II)V")
	private void method1840() {
		this.anInt2670 -= 256;
		if (this.anInt2670 < 0) {
			this.anInt2670 = 0;
		}
		if (this.aClass4_Sub1_8 != null) {
			this.aClass4_Sub1_8.method1817(256);
		}
	}

	@OriginalMember(owner = "client!cc", name = "b", descriptor = "()V")
	protected void method1841() throws Exception {
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(B)V")
	public final void method1842() {
		this.aBoolean115 = true;
	}

	@OriginalMember(owner = "client!cc", name = "b", descriptor = "(I)V")
	public void method1843(@OriginalArg(0) int arg0) throws Exception {
	}

	@OriginalMember(owner = "client!cc", name = "c", descriptor = "()V")
	protected void method1844() throws Exception {
	}

	@OriginalMember(owner = "client!cc", name = "b", descriptor = "(B)V")
	public final synchronized void method1846() {
		if (this.anIntArray333 == null) {
			return;
		}
		@Pc(14) long local14 = Static8.method75();
		try {
			if (this.aLong89 != 0L) {
				if (this.aLong89 > local14) {
					return;
				}
				this.method1843(this.anInt2665);
				this.aLong89 = 0L;
				this.aBoolean115 = true;
			}
			@Pc(40) int local40 = this.method1839();
			@Pc(46) int local46 = this.anInt2669 + this.anInt2668;
			if (local46 + 256 > 16384) {
				local46 = 16128;
			}
			if (this.anInt2667 - local40 > this.anInt2666) {
				this.anInt2666 = this.anInt2667 - local40;
			}
			if (local46 + 256 > this.anInt2665) {
				this.anInt2665 += 1024;
				local40 = 0;
				if (this.anInt2665 > 16384) {
					this.anInt2665 = 16384;
				}
				this.method1849();
				this.method1843(this.anInt2665);
				this.aBoolean115 = true;
				if (local46 + 256 > this.anInt2665) {
					local46 = this.anInt2665 - 256;
					this.anInt2669 = local46 - this.anInt2668;
				}
			}
			while (local46 > local40) {
				local40 += 256;
				this.method1836(this.anIntArray333);
				this.method1844();
			}
			if (this.aLong90 < local14) {
				if (this.aBoolean115) {
					this.aBoolean115 = false;
				} else if (this.anInt2666 == 0 && this.anInt2671 == 0) {
					this.method1849();
					this.aLong89 = local14 + 2000L;
					return;
				} else {
					this.anInt2669 = Math.min(this.anInt2671, this.anInt2666);
					this.anInt2671 = this.anInt2666;
				}
				this.anInt2666 = 0;
				this.aLong90 = local14 + 2000L;
			}
			this.anInt2667 = local40;
		} catch (@Pc(201) Exception local201) {
			this.method1849();
			this.aLong89 = local14 + 2000L;
		}
		try {
			if (local14 > this.aLong88 + 500000L) {
				local14 = this.aLong88;
			}
			while (local14 > this.aLong88 + 5000L) {
				this.method1840();
				this.aLong88 += 256000 / Static115.anInt2690;
			}
		} catch (@Pc(248) Exception local248) {
			this.aLong88 = local14;
		}
	}

	@OriginalMember(owner = "client!cc", name = "c", descriptor = "(I)V")
	public final synchronized void method1847() {
		this.aBoolean115 = true;
		try {
			this.method1841();
		} catch (@Pc(15) Exception local15) {
			this.method1849();
			this.aLong89 = Static8.method75() + 2000L;
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(BILclient!ac;)V")
	private void method1848(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub1 arg1) {
		@Pc(7) int local7 = arg0 >> 5;
		@Pc(17) Class4_Sub1 local17 = this.aClass4_Sub1Array6[local7];
		if (local17 == null) {
			this.aClass4_Sub1Array5[local7] = arg1;
		} else {
			local17.aClass4_Sub1_7 = arg1;
		}
		this.aClass4_Sub1Array6[local7] = arg1;
		arg1.anInt2601 = arg0;
	}

	@OriginalMember(owner = "client!cc", name = "d", descriptor = "()V")
	protected void method1849() {
	}
}
