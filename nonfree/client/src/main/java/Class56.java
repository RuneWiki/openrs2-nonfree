import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lc")
public class Class56 {

	@OriginalMember(owner = "client!lc", name = "j", descriptor = "Lclient!pb;")
	private Class3_Sub19 aClass3_Sub19_5;

	@OriginalMember(owner = "client!lc", name = "k", descriptor = "[I")
	public int[] anIntArray251;

	@OriginalMember(owner = "client!lc", name = "z", descriptor = "I")
	private int anInt3350;

	@OriginalMember(owner = "client!lc", name = "D", descriptor = "I")
	public int anInt3352;

	@OriginalMember(owner = "client!lc", name = "L", descriptor = "I")
	public int anInt3357;

	@OriginalMember(owner = "client!lc", name = "t", descriptor = "I")
	private final int anInt3344 = 32;

	@OriginalMember(owner = "client!lc", name = "m", descriptor = "J")
	private long aLong108 = Static210.method3307();

	@OriginalMember(owner = "client!lc", name = "y", descriptor = "I")
	private int anInt3349 = 0;

	@OriginalMember(owner = "client!lc", name = "A", descriptor = "[Lclient!pb;")
	private final Class3_Sub19[] aClass3_Sub19Array5 = new Class3_Sub19[8];

	@OriginalMember(owner = "client!lc", name = "G", descriptor = "I")
	private int anInt3354 = 0;

	@OriginalMember(owner = "client!lc", name = "E", descriptor = "[Lclient!pb;")
	private final Class3_Sub19[] aClass3_Sub19Array6 = new Class3_Sub19[8];

	@OriginalMember(owner = "client!lc", name = "H", descriptor = "I")
	private int anInt3355 = 0;

	@OriginalMember(owner = "client!lc", name = "K", descriptor = "J")
	private long aLong109 = 0L;

	@OriginalMember(owner = "client!lc", name = "I", descriptor = "I")
	private int anInt3356 = 0;

	@OriginalMember(owner = "client!lc", name = "N", descriptor = "J")
	private long aLong110 = 0L;

	@OriginalMember(owner = "client!lc", name = "O", descriptor = "Z")
	private boolean aBoolean150 = true;

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(I)V")
	public final synchronized void method2445() {
		this.aBoolean150 = true;
		try {
			this.method2455();
		} catch (@Pc(17) Exception local17) {
			this.method2458();
			this.aLong109 = Static210.method3307() + 2000L;
		}
	}

	@OriginalMember(owner = "client!lc", name = "b", descriptor = "(I)V")
	public void method2446(@OriginalArg(0) int arg0) throws Exception {
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(IILclient!pb;)V")
	private void method2448(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub19 arg1) {
		@Pc(7) int local7 = arg0 >> 5;
		@Pc(12) Class3_Sub19 local12 = this.aClass3_Sub19Array6[local7];
		if (local12 == null) {
			this.aClass3_Sub19Array5[local7] = arg1;
		} else {
			local12.aClass3_Sub19_8 = arg1;
		}
		this.aClass3_Sub19Array6[local7] = arg1;
		arg1.anInt4183 = arg0;
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(II)V")
	private void method2449() {
		this.anInt3349 -= 256;
		if (this.anInt3349 < 0) {
			this.anInt3349 = 0;
		}
		if (this.aClass3_Sub19_5 != null) {
			this.aClass3_Sub19_5.method3248(256);
		}
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(Ljava/awt/Component;)V")
	public void method2450(@OriginalArg(0) Component arg0) throws Exception {
	}

	@OriginalMember(owner = "client!lc", name = "b", descriptor = "(B)V")
	public final void method2451() {
		this.aBoolean150 = true;
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "()V")
	protected void method2452() throws Exception {
	}

	@OriginalMember(owner = "client!lc", name = "b", descriptor = "()I")
	protected int method2453() throws Exception {
		return this.anInt3357;
	}

	@OriginalMember(owner = "client!lc", name = "c", descriptor = "(I)V")
	public final synchronized void method2454() {
		if (Static69.aClass37_1 != null) {
			@Pc(9) boolean local9 = true;
			for (@Pc(11) int local11 = 0; local11 < 2; local11++) {
				if (Static69.aClass37_1.aClass56Array1[local11] == this) {
					Static69.aClass37_1.aClass56Array1[local11] = null;
				}
				if (Static69.aClass37_1.aClass56Array1[local11] != null) {
					local9 = false;
				}
			}
			if (local9) {
				Static69.aClass37_1.aBoolean82 = true;
				while (Static69.aClass37_1.aBoolean83) {
					Static119.method1720(50L);
				}
				Static69.aClass37_1 = null;
			}
		}
		this.method2458();
		this.anIntArray251 = null;
	}

	@OriginalMember(owner = "client!lc", name = "c", descriptor = "()V")
	protected void method2455() throws Exception {
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(ILclient!pb;)V")
	public final synchronized void method2456(@OriginalArg(1) Class3_Sub19 arg0) {
		this.aClass3_Sub19_5 = arg0;
	}

	@OriginalMember(owner = "client!lc", name = "d", descriptor = "(I)V")
	public final synchronized void method2457() {
		if (this.anIntArray251 == null) {
			return;
		}
		@Pc(10) long local10 = Static210.method3307();
		try {
			if (this.aLong109 != 0L) {
				if (local10 < this.aLong109) {
					return;
				}
				this.method2446(this.anInt3357);
				this.aLong109 = 0L;
				this.aBoolean150 = true;
			}
			@Pc(38) int local38 = this.method2453();
			if (this.anInt3355 < this.anInt3354 - local38) {
				this.anInt3355 = this.anInt3354 - local38;
			}
			@Pc(64) int local64 = this.anInt3352 + this.anInt3350;
			if (local64 + 256 > 16384) {
				local64 = 16128;
			}
			if (this.anInt3357 < local64 + 256) {
				this.anInt3357 += 1024;
				if (this.anInt3357 > 16384) {
					this.anInt3357 = 16384;
				}
				local38 = 0;
				this.method2458();
				this.method2446(this.anInt3357);
				if (local64 + 256 > this.anInt3357) {
					local64 = this.anInt3357 - 256;
					this.anInt3350 = local64 - this.anInt3352;
				}
				this.aBoolean150 = true;
			}
			while (local64 > local38) {
				this.method2459(this.anIntArray251);
				local38 += 256;
				this.method2452();
			}
			if (local10 > this.aLong110) {
				if (this.aBoolean150) {
					this.aBoolean150 = false;
				} else if (this.anInt3355 == 0 && this.anInt3356 == 0) {
					this.method2458();
					this.aLong109 = local10 + 2000L;
					return;
				} else {
					this.anInt3350 = Math.min(this.anInt3356, this.anInt3355);
					this.anInt3356 = this.anInt3355;
				}
				this.anInt3355 = 0;
				this.aLong110 = local10 + 2000L;
			}
			this.anInt3354 = local38;
		} catch (@Pc(210) Exception local210) {
			this.method2458();
			this.aLong109 = local10 + 2000L;
		}
		try {
			if (local10 > this.aLong108 + 500000L) {
				local10 = this.aLong108;
			}
			while (local10 > this.aLong108 + 5000L) {
				this.method2449();
				this.aLong108 += 256000 / Static91.anInt1796;
			}
		} catch (@Pc(250) Exception local250) {
			this.aLong108 = local10;
		}
	}

	@OriginalMember(owner = "client!lc", name = "d", descriptor = "()V")
	protected void method2458() {
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "([II)V")
	private void method2459(@OriginalArg(0) int[] arg0) {
		@Pc(1) short local1 = 256;
		if (Static150.aBoolean144) {
			local1 = 512;
		}
		Static218.method2014(arg0, 0, local1);
		this.anInt3349 -= 256;
		if (this.aClass3_Sub19_5 != null && this.anInt3349 <= 0) {
			this.anInt3349 += Static91.anInt1796 >> 4;
			Static98.method1409(this.aClass3_Sub19_5);
			this.method2448(this.aClass3_Sub19_5.method3250(), this.aClass3_Sub19_5);
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
						@Pc(88) Class3_Sub19 local88 = null;
						@Pc(93) Class3_Sub19 local93 = this.aClass3_Sub19Array5[local56];
						label97: while (true) {
							while (true) {
								if (local93 == null) {
									break label97;
								}
								@Pc(97) Class3_Sub24 local97 = local93.aClass3_Sub24_5;
								if (local97 == null || local97.anInt3684 <= local61) {
									local93.aBoolean187 = true;
									@Pc(121) int local121 = local93.method3244();
									local45 += local121;
									if (local97 != null) {
										local97.anInt3684 += local121;
									}
									if (local45 >= this.anInt3344) {
										break label103;
									}
									@Pc(140) Class3_Sub19 local140 = local93.method3247();
									if (local140 != null) {
										@Pc(145) int local145 = local93.anInt4183;
										while (local140 != null) {
											this.method2448(local145 * local140.method3250() >> 8, local140);
											local140 = local93.method3246();
										}
									}
									@Pc(164) Class3_Sub19 local164 = local93.aClass3_Sub19_8;
									local93.aClass3_Sub19_8 = null;
									if (local88 == null) {
										this.aClass3_Sub19Array5[local56] = local164;
									} else {
										local88.aClass3_Sub19_8 = local164;
									}
									if (local164 == null) {
										this.aClass3_Sub19Array6[local56] = local88;
									}
									local93 = local164;
								} else {
									local47 |= 0x1 << local56;
									local88 = local93;
									local93 = local93.aClass3_Sub19_8;
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
				@Pc(207) Class3_Sub19 local207 = this.aClass3_Sub19Array5[local56];
				this.aClass3_Sub19Array5[local56] = this.aClass3_Sub19Array6[local56] = null;
				while (local207 != null) {
					@Pc(221) Class3_Sub19 local221 = local207.aClass3_Sub19_8;
					local207.aClass3_Sub19_8 = null;
					local207 = local221;
				}
			}
		}
		if (this.anInt3349 < 0) {
			this.anInt3349 = 0;
		}
		if (this.aClass3_Sub19_5 != null) {
			this.aClass3_Sub19_5.method3249(arg0, 0, 256);
		}
		this.aLong108 = Static210.method3307();
	}
}
