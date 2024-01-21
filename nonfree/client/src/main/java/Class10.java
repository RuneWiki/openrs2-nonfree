import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bb")
public class Class10 {

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "Lclient!dh;")
	private Class2_Sub9 aClass2_Sub9_7;

	@OriginalMember(owner = "client!bb", name = "i", descriptor = "[I")
	public int[] anIntArray234;

	@OriginalMember(owner = "client!bb", name = "x", descriptor = "I")
	public int anInt2370;

	@OriginalMember(owner = "client!bb", name = "C", descriptor = "I")
	private int anInt2373;

	@OriginalMember(owner = "client!bb", name = "M", descriptor = "I")
	public int anInt2378;

	@OriginalMember(owner = "client!bb", name = "s", descriptor = "I")
	private final int anInt2366 = 32;

	@OriginalMember(owner = "client!bb", name = "q", descriptor = "J")
	private long aLong74 = Static68.method1276();

	@OriginalMember(owner = "client!bb", name = "B", descriptor = "[Lclient!dh;")
	private final Class2_Sub9[] aClass2_Sub9Array5 = new Class2_Sub9[8];

	@OriginalMember(owner = "client!bb", name = "D", descriptor = "[Lclient!dh;")
	private final Class2_Sub9[] aClass2_Sub9Array6 = new Class2_Sub9[8];

	@OriginalMember(owner = "client!bb", name = "A", descriptor = "I")
	private int anInt2372 = 0;

	@OriginalMember(owner = "client!bb", name = "E", descriptor = "J")
	private long aLong75 = 0L;

	@OriginalMember(owner = "client!bb", name = "F", descriptor = "J")
	private long aLong76 = 0L;

	@OriginalMember(owner = "client!bb", name = "I", descriptor = "Z")
	private boolean aBoolean115 = true;

	@OriginalMember(owner = "client!bb", name = "K", descriptor = "I")
	private int anInt2376 = 0;

	@OriginalMember(owner = "client!bb", name = "L", descriptor = "I")
	private int anInt2377 = 0;

	@OriginalMember(owner = "client!bb", name = "G", descriptor = "I")
	private int anInt2374 = 0;

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(Lclient!dh;IZ)V")
	private void method1771(@OriginalArg(0) Class2_Sub9 arg0, @OriginalArg(1) int arg1) {
		@Pc(7) int local7 = arg1 >> 5;
		@Pc(19) Class2_Sub9 local19 = this.aClass2_Sub9Array5[local7];
		if (local19 == null) {
			this.aClass2_Sub9Array6[local7] = arg0;
		} else {
			local19.aClass2_Sub9_8 = arg0;
		}
		this.aClass2_Sub9Array5[local7] = arg0;
		arg0.anInt3239 = arg1;
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(B)V")
	public final synchronized void method1772() {
		this.aBoolean115 = true;
		try {
			this.method1774();
		} catch (@Pc(15) Exception local15) {
			this.method1779();
			this.aLong76 = Static68.method1276() + 2000L;
		}
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "()V")
	protected void method1773() throws Exception {
	}

	@OriginalMember(owner = "client!bb", name = "b", descriptor = "()V")
	protected void method1774() throws Exception {
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(Ljava/awt/Component;)V")
	public void method1775(@OriginalArg(0) Component arg0) throws Exception {
	}

	@OriginalMember(owner = "client!bb", name = "b", descriptor = "(B)V")
	public final void method1776() {
		this.aBoolean115 = true;
	}

	@OriginalMember(owner = "client!bb", name = "c", descriptor = "()V")
	protected void method1779() {
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "([II)V")
	private void method1781(@OriginalArg(0) int[] arg0) {
		@Pc(1) short local1 = 256;
		if (Static105.aBoolean119) {
			local1 = 512;
		}
		Static222.method2222(arg0, 0, local1);
		this.anInt2377 -= 256;
		if (this.aClass2_Sub9_7 != null && this.anInt2377 <= 0) {
			this.anInt2377 += Static68.anInt1622 >> 4;
			Static38.method766(this.aClass2_Sub9_7);
			this.method1771(this.aClass2_Sub9_7, this.aClass2_Sub9_7.method2469());
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
								@Pc(97) Class2_Sub6 local97 = local93.aClass2_Sub6_5;
								if (local97 == null || local97.anInt607 <= local61) {
									local93.aBoolean153 = true;
									@Pc(121) int local121 = local93.method2472();
									local45 += local121;
									if (local97 != null) {
										local97.anInt607 += local121;
									}
									if (local45 >= this.anInt2366) {
										break label103;
									}
									@Pc(140) Class2_Sub9 local140 = local93.method2468();
									if (local140 != null) {
										@Pc(145) int local145 = local93.anInt3239;
										while (local140 != null) {
											this.method1771(local140, local145 * local140.method2469() >> 8);
											local140 = local93.method2470();
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
		if (this.anInt2377 < 0) {
			this.anInt2377 = 0;
		}
		if (this.aClass2_Sub9_7 != null) {
			this.aClass2_Sub9_7.method2471(arg0, 0, 256);
		}
		this.aLong74 = Static68.method1276();
	}

	@OriginalMember(owner = "client!bb", name = "b", descriptor = "(I)V")
	public final synchronized void method1782() {
		if (Static66.aClass33_1 != null) {
			@Pc(14) boolean local14 = true;
			for (@Pc(16) int local16 = 0; local16 < 2; local16++) {
				if (Static66.aClass33_1.aClass10Array1[local16] == this) {
					Static66.aClass33_1.aClass10Array1[local16] = null;
				}
				if (Static66.aClass33_1.aClass10Array1[local16] != null) {
					local14 = false;
				}
			}
			if (local14) {
				Static66.aClass33_1.aBoolean78 = true;
				while (Static66.aClass33_1.aBoolean77) {
					Static119.method2069(50L);
				}
				Static66.aClass33_1 = null;
			}
		}
		this.method1779();
		this.anIntArray234 = null;
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(ZI)V")
	private void method1783() {
		this.anInt2377 -= 256;
		if (this.anInt2377 < 0) {
			this.anInt2377 = 0;
		}
		if (this.aClass2_Sub9_7 != null) {
			this.aClass2_Sub9_7.method2473(256);
		}
	}

	@OriginalMember(owner = "client!bb", name = "d", descriptor = "()I")
	protected int method1784() throws Exception {
		return this.anInt2370;
	}

	@OriginalMember(owner = "client!bb", name = "c", descriptor = "(I)V")
	public void method1785(@OriginalArg(0) int arg0) throws Exception {
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(ILclient!dh;)V")
	public final synchronized void method1786(@OriginalArg(1) Class2_Sub9 arg0) {
		this.aClass2_Sub9_7 = arg0;
	}

	@OriginalMember(owner = "client!bb", name = "d", descriptor = "(I)V")
	public final synchronized void method1787() {
		if (this.anIntArray234 == null) {
			return;
		}
		@Pc(12) long local12 = Static68.method1276();
		try {
			if (this.aLong76 != 0L) {
				if (local12 < this.aLong76) {
					return;
				}
				this.method1785(this.anInt2370);
				this.aBoolean115 = true;
				this.aLong76 = 0L;
			}
			@Pc(40) int local40 = this.method1784();
			@Pc(46) int local46 = this.anInt2373 + this.anInt2378;
			if (local46 + 256 > 16384) {
				local46 = 16128;
			}
			if (this.anInt2372 < this.anInt2376 - local40) {
				this.anInt2372 = this.anInt2376 - local40;
			}
			if (local46 + 256 > this.anInt2370) {
				local40 = 0;
				this.anInt2370 += 1024;
				if (this.anInt2370 > 16384) {
					this.anInt2370 = 16384;
				}
				this.method1779();
				this.method1785(this.anInt2370);
				this.aBoolean115 = true;
				if (this.anInt2370 < local46 + 256) {
					local46 = this.anInt2370 - 256;
					this.anInt2373 = local46 - this.anInt2378;
				}
			}
			while (local46 > local40) {
				this.method1781(this.anIntArray234);
				local40 += 256;
				this.method1773();
			}
			if (local12 > this.aLong75) {
				if (this.aBoolean115) {
					this.aBoolean115 = false;
				} else if (this.anInt2372 == 0 && this.anInt2374 == 0) {
					this.method1779();
					this.aLong76 = local12 + 2000L;
					return;
				} else {
					this.anInt2373 = Math.min(this.anInt2374, this.anInt2372);
					this.anInt2374 = this.anInt2372;
				}
				this.anInt2372 = 0;
				this.aLong75 = local12 + 2000L;
			}
			this.anInt2376 = local40;
		} catch (@Pc(192) Exception local192) {
			this.method1779();
			this.aLong76 = local12 + 2000L;
		}
		try {
			if (this.aLong74 + 500000L < local12) {
				local12 = this.aLong74;
			}
			while (this.aLong74 + 5000L < local12) {
				this.method1783();
				this.aLong74 += 256000 / Static68.anInt1622;
			}
		} catch (@Pc(233) Exception local233) {
			this.aLong74 = local12;
		}
	}
}
