import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bh")
public class Class37 {

	@OriginalMember(owner = "client!bh", name = "D", descriptor = "[I")
	public int[] anIntArray247;

	@OriginalMember(owner = "client!bh", name = "w", descriptor = "Lclient!ec;")
	private Class14_Sub1 aClass14_Sub1_7;

	@OriginalMember(owner = "client!bh", name = "g", descriptor = "I")
	public int anInt4903;

	@OriginalMember(owner = "client!bh", name = "l", descriptor = "I")
	public int anInt4907;

	@OriginalMember(owner = "client!bh", name = "B", descriptor = "I")
	private int anInt4908;

	@OriginalMember(owner = "client!bh", name = "i", descriptor = "I")
	private final int anInt4892 = 32;

	@OriginalMember(owner = "client!bh", name = "m", descriptor = "Z")
	private boolean aBoolean365 = false;

	@OriginalMember(owner = "client!bh", name = "b", descriptor = "J")
	private long aLong140 = Static26.method382();

	@OriginalMember(owner = "client!bh", name = "v", descriptor = "I")
	private int anInt4904 = 0;

	@OriginalMember(owner = "client!bh", name = "p", descriptor = "I")
	private int anInt4905 = 0;

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "I")
	private int anInt4906 = 0;

	@OriginalMember(owner = "client!bh", name = "r", descriptor = "[Lclient!ec;")
	private final Class14_Sub1[] aClass14_Sub1Array5 = new Class14_Sub1[8];

	@OriginalMember(owner = "client!bh", name = "o", descriptor = "Z")
	private boolean aBoolean366 = true;

	@OriginalMember(owner = "client!bh", name = "t", descriptor = "[Lclient!ec;")
	private final Class14_Sub1[] aClass14_Sub1Array6 = new Class14_Sub1[8];

	@OriginalMember(owner = "client!bh", name = "j", descriptor = "I")
	private int anInt4909 = 0;

	@OriginalMember(owner = "client!bh", name = "k", descriptor = "J")
	private long aLong141 = 0L;

	@OriginalMember(owner = "client!bh", name = "E", descriptor = "J")
	private long aLong142 = 0L;

	@OriginalMember(owner = "client!bh", name = "c", descriptor = "(I)V")
	public final synchronized void method4369() {
		this.aBoolean366 = true;
		try {
			this.method4378();
		} catch (@Pc(19) Exception local19) {
			this.method4383();
			this.aLong142 = Static26.method382() + 2000L;
		}
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(I)V")
	public final synchronized void method4370() {
		if (this.aBoolean365) {
			return;
		}
		@Pc(11) long local11 = Static26.method382();
		try {
			if (local11 > this.aLong140 + 6000L) {
				this.aLong140 = local11 - 6000L;
			}
			while (local11 > this.aLong140 + 5000L) {
				this.method4377();
				this.aLong140 += (long) (256000 / Static157.anInt2396);
				local11 = Static26.method382();
			}
		} catch (@Pc(62) Exception local62) {
			this.aLong140 = local11;
		}
		if (this.anIntArray247 == null) {
			return;
		}
		try {
			if (this.aLong142 != 0L) {
				if (this.aLong142 > local11) {
					return;
				}
				this.method4372(this.anInt4903);
				this.aLong142 = 0L;
				this.aBoolean366 = true;
			}
			@Pc(101) int local101 = this.method4375();
			if (this.anInt4904 < this.anInt4909 - local101) {
				this.anInt4904 = this.anInt4909 - local101;
			}
			@Pc(124) int local124 = this.anInt4907 + this.anInt4908;
			if (local124 + 256 > 16384) {
				local124 = 16128;
			}
			if (this.anInt4903 < local124 + 256) {
				this.anInt4903 += 1024;
				if (this.anInt4903 > 16384) {
					this.anInt4903 = 16384;
				}
				this.method4383();
				local101 = 0;
				this.method4372(this.anInt4903);
				if (this.anInt4903 < local124 + 256) {
					local124 = this.anInt4903 - 256;
					this.anInt4908 = local124 - this.anInt4907;
				}
				this.aBoolean366 = true;
			}
			while (local124 > local101) {
				this.method4379(this.anIntArray247);
				local101 += 256;
				this.method4374();
			}
			if (local11 > this.aLong141) {
				if (this.aBoolean366) {
					this.aBoolean366 = false;
				} else if (this.anInt4904 == 0 && this.anInt4906 == 0) {
					this.method4383();
					this.aLong142 = local11 + 2000L;
					return;
				} else {
					this.anInt4908 = Math.min(this.anInt4906, this.anInt4904);
					this.anInt4906 = this.anInt4904;
				}
				this.anInt4904 = 0;
				this.aLong141 = local11 + 2000L;
			}
			this.anInt4909 = local101;
		} catch (@Pc(269) Exception local269) {
			this.method4383();
			this.aLong142 = local11 + 2000L;
		}
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(B)V")
	public final synchronized void method4371() {
		if (Static333.aClass177_6 != null) {
			@Pc(3) boolean local3 = true;
			for (@Pc(5) int local5 = 0; local5 < 2; local5++) {
				if (Static333.aClass177_6.aClass37Array1[local5] == this) {
					Static333.aClass177_6.aClass37Array1[local5] = null;
				}
				if (Static333.aClass177_6.aClass37Array1[local5] != null) {
					local3 = false;
				}
			}
			if (local3) {
				Static333.aClass177_6.aBoolean364 = true;
				while (Static333.aClass177_6.aBoolean363) {
					Static548.method7968(50L);
				}
				Static333.aClass177_6 = null;
			}
		}
		this.method4383();
		this.aBoolean365 = true;
		this.anIntArray247 = null;
	}

	@OriginalMember(owner = "client!bh", name = "b", descriptor = "(I)V")
	public void method4372(@OriginalArg(0) int arg0) throws Exception {
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(Ljava/awt/Component;)V")
	public void method4373(@OriginalArg(0) Component arg0) throws Exception {
	}

	@OriginalMember(owner = "client!bh", name = "c", descriptor = "()V")
	protected void method4374() throws Exception {
	}

	@OriginalMember(owner = "client!bh", name = "d", descriptor = "()I")
	protected int method4375() throws Exception {
		return this.anInt4903;
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(IB)V")
	private void method4377() {
		this.anInt4905 -= 256;
		if (this.anInt4905 < 0) {
			this.anInt4905 = 0;
		}
		if (this.aClass14_Sub1_7 != null) {
			this.aClass14_Sub1_7.method9318(256);
		}
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "()V")
	protected void method4378() throws Exception {
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "([II)V")
	private void method4379(@OriginalArg(0) int[] arg0) {
		@Pc(1) short local1 = 256;
		if (Static583.aBoolean664) {
			local1 = 512;
		}
		Static691.method83(arg0, 0, local1);
		this.anInt4905 -= 256;
		if (this.aClass14_Sub1_7 != null && this.anInt4905 <= 0) {
			this.anInt4905 += Static157.anInt2396 >> 4;
			Static106.method1763(this.aClass14_Sub1_7);
			this.method4382(this.aClass14_Sub1_7, this.aClass14_Sub1_7.method9315());
			@Pc(47) int local47 = 0;
			@Pc(49) int local49 = 255;
			@Pc(51) int local51 = 7;
			@Pc(58) int local58;
			label103: while (local49 != 0) {
				@Pc(63) int local63;
				if (local51 < 0) {
					local58 = local51 & 0x3;
					local63 = -(local51 >> 2);
				} else {
					local58 = local51;
					local63 = 0;
				}
				for (@Pc(74) int local74 = local49 >>> local58 & 0x11111111; local74 != 0; local74 >>>= 0x4) {
					if ((local74 & 0x1) != 0) {
						local49 &= ~(0x1 << local58);
						@Pc(92) Class14_Sub1 local92 = null;
						@Pc(97) Class14_Sub1 local97 = this.aClass14_Sub1Array5[local58];
						label97: while (true) {
							while (true) {
								if (local97 == null) {
									break label97;
								}
								@Pc(101) Class14_Sub19 local101 = local97.aClass14_Sub19_6;
								if (local101 == null || local101.anInt7679 <= local63) {
									local97.aBoolean766 = true;
									@Pc(127) int local127 = local97.method9321();
									local47 += local127;
									if (local101 != null) {
										local101.anInt7679 += local127;
									}
									if (local47 >= this.anInt4892) {
										break label103;
									}
									@Pc(148) Class14_Sub1 local148 = local97.method9316();
									if (local148 != null) {
										@Pc(153) int local153 = local97.anInt10973;
										while (local148 != null) {
											this.method4382(local148, local153 * local148.method9315() >> 8);
											local148 = local97.method9320();
										}
									}
									@Pc(172) Class14_Sub1 local172 = local97.aClass14_Sub1_9;
									local97.aClass14_Sub1_9 = null;
									if (local92 == null) {
										this.aClass14_Sub1Array5[local58] = local172;
									} else {
										local92.aClass14_Sub1_9 = local172;
									}
									if (local172 == null) {
										this.aClass14_Sub1Array6[local58] = local92;
									}
									local97 = local172;
								} else {
									local49 |= 0x1 << local58;
									local92 = local97;
									local97 = local97.aClass14_Sub1_9;
								}
							}
						}
					}
					local58 += 4;
					local63++;
				}
				local51--;
			}
			for (local58 = 0; local58 < 8; local58++) {
				@Pc(218) Class14_Sub1 local218 = this.aClass14_Sub1Array5[local58];
				this.aClass14_Sub1Array5[local58] = this.aClass14_Sub1Array6[local58] = null;
				while (local218 != null) {
					@Pc(232) Class14_Sub1 local232 = local218.aClass14_Sub1_9;
					local218.aClass14_Sub1_9 = null;
					local218 = local232;
				}
			}
		}
		if (this.anInt4905 < 0) {
			this.anInt4905 = 0;
		}
		if (this.aClass14_Sub1_7 != null) {
			this.aClass14_Sub1_7.method9317(arg0, 0, 256);
		}
		this.aLong140 = Static26.method382();
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(Lclient!ec;Z)V")
	public final synchronized void method4380(@OriginalArg(0) Class14_Sub1 arg0) {
		this.aClass14_Sub1_7 = arg0;
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(Lclient!ec;II)V")
	private void method4382(@OriginalArg(0) Class14_Sub1 arg0, @OriginalArg(1) int arg1) {
		@Pc(7) int local7 = arg1 >> 5;
		@Pc(12) Class14_Sub1 local12 = this.aClass14_Sub1Array6[local7];
		if (local12 == null) {
			this.aClass14_Sub1Array5[local7] = arg0;
		} else {
			local12.aClass14_Sub1_9 = arg0;
		}
		this.aClass14_Sub1Array6[local7] = arg0;
		arg0.anInt10973 = arg1;
	}

	@OriginalMember(owner = "client!bh", name = "b", descriptor = "()V")
	protected void method4383() {
	}
}
