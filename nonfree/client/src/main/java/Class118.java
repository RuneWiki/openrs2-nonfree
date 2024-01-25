import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ig")
public class Class118 {

	@OriginalMember(owner = "client!ig", name = "g", descriptor = "Lclient!ei;")
	private Class1_Sub5 aClass1_Sub5_7;

	@OriginalMember(owner = "client!ig", name = "s", descriptor = "[I")
	public int[] anIntArray372;

	@OriginalMember(owner = "client!ig", name = "x", descriptor = "I")
	public int anInt4803;

	@OriginalMember(owner = "client!ig", name = "y", descriptor = "I")
	private int anInt4804;

	@OriginalMember(owner = "client!ig", name = "J", descriptor = "I")
	public int anInt4811;

	@OriginalMember(owner = "client!ig", name = "f", descriptor = "I")
	private final int anInt4790 = 32;

	@OriginalMember(owner = "client!ig", name = "i", descriptor = "Z")
	private boolean aBoolean381 = false;

	@OriginalMember(owner = "client!ig", name = "d", descriptor = "J")
	private long aLong140 = Static107.method1707();

	@OriginalMember(owner = "client!ig", name = "v", descriptor = "[Lclient!ei;")
	private final Class1_Sub5[] aClass1_Sub5Array5 = new Class1_Sub5[8];

	@OriginalMember(owner = "client!ig", name = "w", descriptor = "I")
	private int anInt4802 = 0;

	@OriginalMember(owner = "client!ig", name = "u", descriptor = "Z")
	private boolean aBoolean382 = true;

	@OriginalMember(owner = "client!ig", name = "A", descriptor = "[Lclient!ei;")
	private final Class1_Sub5[] aClass1_Sub5Array6 = new Class1_Sub5[8];

	@OriginalMember(owner = "client!ig", name = "B", descriptor = "I")
	private int anInt4805 = 0;

	@OriginalMember(owner = "client!ig", name = "F", descriptor = "J")
	private long aLong141 = 0L;

	@OriginalMember(owner = "client!ig", name = "C", descriptor = "I")
	private int anInt4806 = 0;

	@OriginalMember(owner = "client!ig", name = "H", descriptor = "J")
	private long aLong142 = 0L;

	@OriginalMember(owner = "client!ig", name = "I", descriptor = "I")
	private int anInt4810 = 0;

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "()V")
	protected void method3926() {
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(I)V")
	public final void method3927() {
		this.aBoolean382 = true;
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(ZLclient!ei;)V")
	public final synchronized void method3928(@OriginalArg(1) Class1_Sub5 arg0) {
		this.aClass1_Sub5_7 = arg0;
	}

	@OriginalMember(owner = "client!ig", name = "b", descriptor = "()V")
	protected void method3929() throws Exception {
	}

	@OriginalMember(owner = "client!ig", name = "c", descriptor = "()I")
	protected int method3930() throws Exception {
		return this.anInt4803;
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(Z)V")
	public final synchronized void method3931() {
		if (this.aBoolean381) {
			return;
		}
		@Pc(16) long local16 = Static107.method1707();
		try {
			if (this.aLong140 + 500000L < local16) {
				this.aLong140 = local16 - 500000L;
			}
			while (local16 > this.aLong140 + 5000L) {
				this.method3935();
				this.aLong140 += 256000 / Static3.anInt61;
			}
		} catch (@Pc(64) Exception local64) {
			this.aLong140 = local16;
		}
		if (this.anIntArray372 == null) {
			return;
		}
		try {
			if (this.aLong141 != 0L) {
				if (this.aLong141 > local16) {
					return;
				}
				this.method3939(this.anInt4803);
				this.aBoolean382 = true;
				this.aLong141 = 0L;
			}
			@Pc(101) int local101 = this.method3930();
			if (this.anInt4802 < this.anInt4810 - local101) {
				this.anInt4802 = this.anInt4810 - local101;
			}
			@Pc(122) int local122 = this.anInt4811 + this.anInt4804;
			if (local122 + 256 > 16384) {
				local122 = 16128;
			}
			if (local122 + 256 > this.anInt4803) {
				this.anInt4803 += 1024;
				if (this.anInt4803 > 16384) {
					this.anInt4803 = 16384;
				}
				this.method3926();
				this.method3939(this.anInt4803);
				local101 = 0;
				this.aBoolean382 = true;
				if (this.anInt4803 < local122 + 256) {
					local122 = this.anInt4803 - 256;
					this.anInt4804 = local122 - this.anInt4811;
				}
			}
			while (local101 < local122) {
				this.method3933(this.anIntArray372);
				this.method3929();
				local101 += 256;
			}
			if (local16 > this.aLong142) {
				if (this.aBoolean382) {
					this.aBoolean382 = false;
				} else if (this.anInt4802 == 0 && this.anInt4806 == 0) {
					this.method3926();
					this.aLong141 = local16 + 2000L;
					return;
				} else {
					this.anInt4804 = Math.min(this.anInt4806, this.anInt4802);
					this.anInt4806 = this.anInt4802;
				}
				this.aLong142 = local16 + 2000L;
				this.anInt4802 = 0;
			}
			this.anInt4810 = local101;
		} catch (@Pc(259) Exception local259) {
			this.method3926();
			this.aLong141 = local16 + 2000L;
		}
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "([II)V")
	private void method3933(@OriginalArg(0) int[] arg0) {
		@Pc(1) short local1 = 256;
		if (Static183.aBoolean268) {
			local1 = 512;
		}
		Static459.method1553(arg0, 0, local1);
		this.anInt4805 -= 256;
		if (this.aClass1_Sub5_7 != null && this.anInt4805 <= 0) {
			this.anInt4805 += Static3.anInt61 >> 4;
			Static328.method4747(this.aClass1_Sub5_7);
			this.method3942(this.aClass1_Sub5_7.method4444(), this.aClass1_Sub5_7);
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
						@Pc(93) Class1_Sub5 local93 = this.aClass1_Sub5Array6[local56];
						label97: while (true) {
							while (true) {
								if (local93 == null) {
									break label97;
								}
								@Pc(97) Class1_Sub6 local97 = local93.aClass1_Sub6_5;
								if (local97 == null || local97.anInt642 <= local61) {
									local93.aBoolean451 = true;
									@Pc(121) int local121 = local93.method4441();
									local45 += local121;
									if (local97 != null) {
										local97.anInt642 += local121;
									}
									if (local45 >= this.anInt4790) {
										break label103;
									}
									@Pc(140) Class1_Sub5 local140 = local93.method4442();
									if (local140 != null) {
										@Pc(145) int local145 = local93.anInt5599;
										while (local140 != null) {
											this.method3942(local145 * local140.method4444() >> 8, local140);
											local140 = local93.method4447();
										}
									}
									@Pc(164) Class1_Sub5 local164 = local93.aClass1_Sub5_8;
									local93.aClass1_Sub5_8 = null;
									if (local88 == null) {
										this.aClass1_Sub5Array6[local56] = local164;
									} else {
										local88.aClass1_Sub5_8 = local164;
									}
									if (local164 == null) {
										this.aClass1_Sub5Array5[local56] = local88;
									}
									local93 = local164;
								} else {
									local47 |= 0x1 << local56;
									local88 = local93;
									local93 = local93.aClass1_Sub5_8;
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
				@Pc(207) Class1_Sub5 local207 = this.aClass1_Sub5Array6[local56];
				this.aClass1_Sub5Array6[local56] = this.aClass1_Sub5Array5[local56] = null;
				while (local207 != null) {
					@Pc(221) Class1_Sub5 local221 = local207.aClass1_Sub5_8;
					local207.aClass1_Sub5_8 = null;
					local207 = local221;
				}
			}
		}
		if (this.anInt4805 < 0) {
			this.anInt4805 = 0;
		}
		if (this.aClass1_Sub5_7 != null) {
			this.aClass1_Sub5_7.method4446(arg0, 0, 256);
		}
		this.aLong140 = Static107.method1707();
	}

	@OriginalMember(owner = "client!ig", name = "b", descriptor = "(I)V")
	public final synchronized void method3934() {
		this.aBoolean382 = true;
		try {
			this.method3936();
		} catch (@Pc(10) Exception local10) {
			this.method3926();
			this.aLong141 = Static107.method1707() + 2000L;
		}
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(ZI)V")
	private void method3935() {
		this.anInt4805 -= 256;
		if (this.anInt4805 < 0) {
			this.anInt4805 = 0;
		}
		if (this.aClass1_Sub5_7 != null) {
			this.aClass1_Sub5_7.method4445(256);
		}
	}

	@OriginalMember(owner = "client!ig", name = "d", descriptor = "()V")
	protected void method3936() throws Exception {
	}

	@OriginalMember(owner = "client!ig", name = "c", descriptor = "(I)V")
	public final synchronized void method3938() {
		if (Static394.aClass204_1 != null) {
			@Pc(9) boolean local9 = true;
			for (@Pc(11) int local11 = 0; local11 < 2; local11++) {
				if (Static394.aClass204_1.aClass118Array1[local11] == this) {
					Static394.aClass204_1.aClass118Array1[local11] = null;
				}
				if (Static394.aClass204_1.aClass118Array1[local11] != null) {
					local9 = false;
				}
			}
			if (local9) {
				Static394.aClass204_1.aBoolean495 = true;
				while (Static394.aClass204_1.aBoolean494) {
					Static366.method5214(50L);
				}
				Static394.aClass204_1 = null;
			}
		}
		this.method3926();
		this.anIntArray372 = null;
		this.aBoolean381 = true;
	}

	@OriginalMember(owner = "client!ig", name = "d", descriptor = "(I)V")
	public void method3939(@OriginalArg(0) int arg0) throws Exception {
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(Ljava/awt/Component;)V")
	public void method3941(@OriginalArg(0) Component arg0) throws Exception {
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(IILclient!ei;)V")
	private void method3942(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub5 arg1) {
		@Pc(11) int local11 = arg0 >> 5;
		@Pc(16) Class1_Sub5 local16 = this.aClass1_Sub5Array5[local11];
		if (local16 == null) {
			this.aClass1_Sub5Array6[local11] = arg1;
		} else {
			local16.aClass1_Sub5_8 = arg1;
		}
		this.aClass1_Sub5Array5[local11] = arg1;
		arg1.anInt5599 = arg0;
	}
}
