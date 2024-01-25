import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fl")
public class Class45 {

	@OriginalMember(owner = "client!fl", name = "o", descriptor = "[Lclient!pn;")
	public static final Class249[] aClass249Array3 = new Class249[5];

	@OriginalMember(owner = "client!fl", name = "b", descriptor = "[I")
	public int[] anIntArray621;

	@OriginalMember(owner = "client!fl", name = "u", descriptor = "Lclient!wi;")
	private Class6_Sub19 aClass6_Sub19_7;

	@OriginalMember(owner = "client!fl", name = "w", descriptor = "I")
	public int anInt7850;

	@OriginalMember(owner = "client!fl", name = "B", descriptor = "I")
	private int anInt7852;

	@OriginalMember(owner = "client!fl", name = "C", descriptor = "I")
	public int anInt7853;

	@OriginalMember(owner = "client!fl", name = "f", descriptor = "I")
	private final int anInt7838 = 32;

	@OriginalMember(owner = "client!fl", name = "s", descriptor = "Z")
	private boolean aBoolean535 = false;

	@OriginalMember(owner = "client!fl", name = "n", descriptor = "J")
	private long aLong200 = Static137.method2058();

	@OriginalMember(owner = "client!fl", name = "A", descriptor = "J")
	private long aLong202 = 0L;

	@OriginalMember(owner = "client!fl", name = "y", descriptor = "Z")
	private boolean aBoolean536 = true;

	@OriginalMember(owner = "client!fl", name = "z", descriptor = "I")
	private int anInt7851 = 0;

	@OriginalMember(owner = "client!fl", name = "E", descriptor = "I")
	private int anInt7854 = 0;

	@OriginalMember(owner = "client!fl", name = "D", descriptor = "[Lclient!wi;")
	private final Class6_Sub19[] aClass6_Sub19Array5 = new Class6_Sub19[8];

	@OriginalMember(owner = "client!fl", name = "x", descriptor = "J")
	private long aLong201 = 0L;

	@OriginalMember(owner = "client!fl", name = "F", descriptor = "I")
	private int anInt7855 = 0;

	@OriginalMember(owner = "client!fl", name = "G", descriptor = "I")
	private int anInt7856 = 0;

	@OriginalMember(owner = "client!fl", name = "H", descriptor = "[Lclient!wi;")
	private final Class6_Sub19[] aClass6_Sub19Array6 = new Class6_Sub19[8];

	static {
		for (@Pc(4) int local4 = 0; local4 < aClass249Array3.length; local4++) {
			aClass249Array3[local4] = new Class249();
		}
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(I)V")
	public void method6489(@OriginalArg(0) int arg0) throws Exception {
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "()V")
	protected void method6490() {
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(B)V")
	public final synchronized void method6491() {
		if (this.aBoolean535) {
			return;
		}
		@Pc(12) long local12 = Static137.method2058();
		try {
			if (this.aLong200 + 500000L < local12) {
				this.aLong200 = local12 - 500000L;
			}
			while (this.aLong200 + 5000L < local12) {
				this.method6498();
				this.aLong200 += 256000 / Static508.anInt8600;
			}
		} catch (@Pc(50) Exception local50) {
			this.aLong200 = local12;
		}
		if (this.anIntArray621 == null) {
			return;
		}
		try {
			if (this.aLong202 != 0L) {
				if (local12 < this.aLong202) {
					return;
				}
				this.method6489(this.anInt7853);
				this.aBoolean536 = true;
				this.aLong202 = 0L;
			}
			@Pc(85) int local85 = this.method6497();
			if (this.anInt7855 - local85 > this.anInt7854) {
				this.anInt7854 = this.anInt7855 - local85;
			}
			@Pc(109) int local109 = this.anInt7852 + this.anInt7850;
			if (local109 + 256 > 16384) {
				local109 = 16128;
			}
			if (local109 + 256 > this.anInt7853) {
				this.anInt7853 += 1024;
				if (this.anInt7853 > 16384) {
					this.anInt7853 = 16384;
				}
				this.method6490();
				this.method6489(this.anInt7853);
				local85 = 0;
				if (this.anInt7853 < local109 + 256) {
					local109 = this.anInt7853 - 256;
					this.anInt7852 = local109 - this.anInt7850;
				}
				this.aBoolean536 = true;
			}
			while (local109 > local85) {
				this.method6502(this.anIntArray621);
				local85 += 256;
				this.method6494();
			}
			if (this.aLong201 < local12) {
				if (this.aBoolean536) {
					this.aBoolean536 = false;
				} else if (this.anInt7854 == 0 && this.anInt7851 == 0) {
					this.method6490();
					this.aLong202 = local12 + 2000L;
					return;
				} else {
					this.anInt7852 = Math.min(this.anInt7851, this.anInt7854);
					this.anInt7851 = this.anInt7854;
				}
				this.anInt7854 = 0;
				this.aLong201 = local12 + 2000L;
			}
			this.anInt7855 = local85;
		} catch (@Pc(242) Exception local242) {
			this.method6490();
			this.aLong202 = local12 + 2000L;
		}
	}

	@OriginalMember(owner = "client!fl", name = "b", descriptor = "(I)V")
	public final synchronized void method6492() {
		if (Static175.aClass67_1 != null) {
			@Pc(5) boolean local5 = true;
			for (@Pc(7) int local7 = 0; local7 < 2; local7++) {
				if (Static175.aClass67_1.aClass45Array1[local7] == this) {
					Static175.aClass67_1.aClass45Array1[local7] = null;
				}
				if (Static175.aClass67_1.aClass45Array1[local7] != null) {
					local5 = false;
				}
			}
			if (local5) {
				Static175.aClass67_1.aBoolean100 = true;
				while (Static175.aClass67_1.aBoolean99) {
					Static149.method2211(50L);
				}
				Static175.aClass67_1 = null;
			}
		}
		this.method6490();
		this.aBoolean535 = true;
		this.anIntArray621 = null;
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(BLclient!wi;I)V")
	private void method6493(@OriginalArg(1) Class6_Sub19 arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = arg1 >> 5;
		@Pc(18) Class6_Sub19 local18 = this.aClass6_Sub19Array5[local7];
		if (local18 == null) {
			this.aClass6_Sub19Array6[local7] = arg0;
		} else {
			local18.aClass6_Sub19_8 = arg0;
		}
		this.aClass6_Sub19Array5[local7] = arg0;
		arg0.anInt9409 = arg1;
	}

	@OriginalMember(owner = "client!fl", name = "b", descriptor = "()V")
	protected void method6494() throws Exception {
	}

	@OriginalMember(owner = "client!fl", name = "c", descriptor = "()I")
	protected int method6497() throws Exception {
		return this.anInt7853;
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(II)V")
	private void method6498() {
		this.anInt7856 -= 256;
		if (this.anInt7856 < 0) {
			this.anInt7856 = 0;
		}
		if (this.aClass6_Sub19_7 != null) {
			this.aClass6_Sub19_7.method7697(256);
		}
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(Ljava/awt/Component;)V")
	public void method6499(@OriginalArg(0) Component arg0) throws Exception {
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(BLclient!wi;)V")
	public final synchronized void method6501(@OriginalArg(1) Class6_Sub19 arg0) {
		this.aClass6_Sub19_7 = arg0;
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "([II)V")
	private void method6502(@OriginalArg(0) int[] arg0) {
		@Pc(1) short local1 = 256;
		if (Static570.aBoolean666) {
			local1 = 512;
		}
		Static585.method3079(arg0, 0, local1);
		this.anInt7856 -= 256;
		if (this.aClass6_Sub19_7 != null && this.anInt7856 <= 0) {
			this.anInt7856 += Static508.anInt8600 >> 4;
			Static508.method7014(this.aClass6_Sub19_7);
			this.method6493(this.aClass6_Sub19_7, this.aClass6_Sub19_7.method7699());
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
						@Pc(88) Class6_Sub19 local88 = null;
						@Pc(93) Class6_Sub19 local93 = this.aClass6_Sub19Array6[local56];
						label97: while (true) {
							while (true) {
								if (local93 == null) {
									break label97;
								}
								@Pc(97) Class6_Sub12 local97 = local93.aClass6_Sub12_5;
								if (local97 == null || local97.anInt5509 <= local61) {
									local93.aBoolean660 = true;
									@Pc(121) int local121 = local93.method7695();
									local45 += local121;
									if (local97 != null) {
										local97.anInt5509 += local121;
									}
									if (local45 >= this.anInt7838) {
										break label103;
									}
									@Pc(140) Class6_Sub19 local140 = local93.method7700();
									if (local140 != null) {
										@Pc(145) int local145 = local93.anInt9409;
										while (local140 != null) {
											this.method6493(local140, local145 * local140.method7699() >> 8);
											local140 = local93.method7694();
										}
									}
									@Pc(164) Class6_Sub19 local164 = local93.aClass6_Sub19_8;
									local93.aClass6_Sub19_8 = null;
									if (local88 == null) {
										this.aClass6_Sub19Array6[local56] = local164;
									} else {
										local88.aClass6_Sub19_8 = local164;
									}
									if (local164 == null) {
										this.aClass6_Sub19Array5[local56] = local88;
									}
									local93 = local164;
								} else {
									local47 |= 0x1 << local56;
									local88 = local93;
									local93 = local93.aClass6_Sub19_8;
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
				@Pc(207) Class6_Sub19 local207 = this.aClass6_Sub19Array6[local56];
				this.aClass6_Sub19Array6[local56] = this.aClass6_Sub19Array5[local56] = null;
				while (local207 != null) {
					@Pc(221) Class6_Sub19 local221 = local207.aClass6_Sub19_8;
					local207.aClass6_Sub19_8 = null;
					local207 = local221;
				}
			}
		}
		if (this.anInt7856 < 0) {
			this.anInt7856 = 0;
		}
		if (this.aClass6_Sub19_7 != null) {
			this.aClass6_Sub19_7.method7698(arg0, 0, 256);
		}
		this.aLong200 = Static137.method2058();
	}

	@OriginalMember(owner = "client!fl", name = "d", descriptor = "()V")
	protected void method6503() throws Exception {
	}

	@OriginalMember(owner = "client!fl", name = "c", descriptor = "(I)V")
	public final synchronized void method6504() {
		this.aBoolean536 = true;
		try {
			this.method6503();
		} catch (@Pc(16) Exception local16) {
			this.method6490();
			this.aLong202 = Static137.method2058() + 2000L;
		}
	}
}
