import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!we")
public class Class174 {

	@OriginalMember(owner = "client!we", name = "f", descriptor = "Lclient!pn;")
	private Class1_Sub6 aClass1_Sub6_8;

	@OriginalMember(owner = "client!we", name = "u", descriptor = "[I")
	public int[] anIntArray785;

	@OriginalMember(owner = "client!we", name = "A", descriptor = "I")
	public int anInt6315;

	@OriginalMember(owner = "client!we", name = "F", descriptor = "I")
	private int anInt6317;

	@OriginalMember(owner = "client!we", name = "I", descriptor = "I")
	public int anInt6319;

	@OriginalMember(owner = "client!we", name = "e", descriptor = "Z")
	private boolean aBoolean554 = false;

	@OriginalMember(owner = "client!we", name = "z", descriptor = "I")
	private final int anInt6314 = 32;

	@OriginalMember(owner = "client!we", name = "b", descriptor = "J")
	private long aLong202 = Static349.method5647();

	@OriginalMember(owner = "client!we", name = "D", descriptor = "I")
	private int anInt6316 = 0;

	@OriginalMember(owner = "client!we", name = "C", descriptor = "Z")
	private boolean aBoolean556 = true;

	@OriginalMember(owner = "client!we", name = "B", descriptor = "[Lclient!pn;")
	private final Class1_Sub6[] aClass1_Sub6Array5 = new Class1_Sub6[8];

	@OriginalMember(owner = "client!we", name = "E", descriptor = "[Lclient!pn;")
	private final Class1_Sub6[] aClass1_Sub6Array6 = new Class1_Sub6[8];

	@OriginalMember(owner = "client!we", name = "J", descriptor = "I")
	private int anInt6320 = 0;

	@OriginalMember(owner = "client!we", name = "G", descriptor = "I")
	private int anInt6318 = 0;

	@OriginalMember(owner = "client!we", name = "H", descriptor = "J")
	private long aLong203 = 0L;

	@OriginalMember(owner = "client!we", name = "K", descriptor = "J")
	private long aLong204 = 0L;

	@OriginalMember(owner = "client!we", name = "L", descriptor = "I")
	private int anInt6321 = 0;

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(Lclient!pn;II)V")
	private void method5508(@OriginalArg(0) Class1_Sub6 arg0, @OriginalArg(1) int arg1) {
		@Pc(13) int local13 = arg1 >> 5;
		@Pc(18) Class1_Sub6 local18 = this.aClass1_Sub6Array5[local13];
		if (local18 == null) {
			this.aClass1_Sub6Array6[local13] = arg0;
		} else {
			local18.aClass1_Sub6_5 = arg0;
		}
		this.aClass1_Sub6Array5[local13] = arg0;
		arg0.anInt1712 = arg1;
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(I)V")
	public void method5509(@OriginalArg(0) int arg0) throws Exception {
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(Ljava/awt/Component;)V")
	public void method5512(@OriginalArg(0) Component arg0) throws Exception {
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "([II)V")
	private void method5513(@OriginalArg(0) int[] arg0) {
		@Pc(1) short local1 = 256;
		if (Static111.aBoolean191) {
			local1 = 512;
		}
		Static367.method5378(arg0, 0, local1);
		this.anInt6316 -= 256;
		if (this.aClass1_Sub6_8 != null && this.anInt6316 <= 0) {
			this.anInt6316 += Static184.anInt3834 >> 4;
			Static295.method5064(this.aClass1_Sub6_8);
			this.method5508(this.aClass1_Sub6_8, this.aClass1_Sub6_8.method1662());
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
						@Pc(88) Class1_Sub6 local88 = null;
						@Pc(93) Class1_Sub6 local93 = this.aClass1_Sub6Array6[local56];
						label97: while (true) {
							while (true) {
								if (local93 == null) {
									break label97;
								}
								@Pc(97) Class1_Sub12 local97 = local93.aClass1_Sub12_5;
								if (local97 == null || local97.anInt1550 <= local61) {
									local93.aBoolean150 = true;
									@Pc(121) int local121 = local93.method1659();
									local45 += local121;
									if (local97 != null) {
										local97.anInt1550 += local121;
									}
									if (local45 >= this.anInt6314) {
										break label103;
									}
									@Pc(140) Class1_Sub6 local140 = local93.method1664();
									if (local140 != null) {
										@Pc(145) int local145 = local93.anInt1712;
										while (local140 != null) {
											this.method5508(local140, local145 * local140.method1662() >> 8);
											local140 = local93.method1660();
										}
									}
									@Pc(164) Class1_Sub6 local164 = local93.aClass1_Sub6_5;
									local93.aClass1_Sub6_5 = null;
									if (local88 == null) {
										this.aClass1_Sub6Array6[local56] = local164;
									} else {
										local88.aClass1_Sub6_5 = local164;
									}
									if (local164 == null) {
										this.aClass1_Sub6Array5[local56] = local88;
									}
									local93 = local164;
								} else {
									local47 |= 0x1 << local56;
									local88 = local93;
									local93 = local93.aClass1_Sub6_5;
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
				@Pc(207) Class1_Sub6 local207 = this.aClass1_Sub6Array6[local56];
				this.aClass1_Sub6Array6[local56] = this.aClass1_Sub6Array5[local56] = null;
				while (local207 != null) {
					@Pc(221) Class1_Sub6 local221 = local207.aClass1_Sub6_5;
					local207.aClass1_Sub6_5 = null;
					local207 = local221;
				}
			}
		}
		if (this.anInt6316 < 0) {
			this.anInt6316 = 0;
		}
		if (this.aClass1_Sub6_8 != null) {
			this.aClass1_Sub6_8.method1658(arg0, 0, 256);
		}
		this.aLong202 = Static349.method5647();
	}

	@OriginalMember(owner = "client!we", name = "c", descriptor = "(I)V")
	public final synchronized void method5515() {
		if (Static120.aClass105_1 != null) {
			@Pc(9) boolean local9 = true;
			for (@Pc(11) int local11 = 0; local11 < 2; local11++) {
				if (Static120.aClass105_1.aClass174Array1[local11] == this) {
					Static120.aClass105_1.aClass174Array1[local11] = null;
				}
				if (Static120.aClass105_1.aClass174Array1[local11] != null) {
					local9 = false;
				}
			}
			if (local9) {
				Static120.aClass105_1.aBoolean268 = true;
				while (Static120.aClass105_1.aBoolean269) {
					Static134.method2598(50L);
				}
				Static120.aClass105_1 = null;
			}
		}
		this.method5516();
		this.anIntArray785 = null;
		this.aBoolean554 = true;
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "()V")
	protected void method5516() {
	}

	@OriginalMember(owner = "client!we", name = "b", descriptor = "()V")
	protected void method5517() throws Exception {
	}

	@OriginalMember(owner = "client!we", name = "c", descriptor = "(B)V")
	public final synchronized void method5518() {
		this.aBoolean556 = true;
		try {
			this.method5517();
		} catch (@Pc(15) Exception local15) {
			this.method5516();
			this.aLong204 = Static349.method5647() + 2000L;
		}
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(IB)V")
	private void method5519() {
		this.anInt6316 -= 256;
		if (this.anInt6316 < 0) {
			this.anInt6316 = 0;
		}
		if (this.aClass1_Sub6_8 != null) {
			this.aClass1_Sub6_8.method1661(256);
		}
	}

	@OriginalMember(owner = "client!we", name = "d", descriptor = "(I)V")
	public final void method5520() {
		this.aBoolean556 = true;
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(BLclient!pn;)V")
	public final synchronized void method5521(@OriginalArg(1) Class1_Sub6 arg0) {
		this.aClass1_Sub6_8 = arg0;
	}

	@OriginalMember(owner = "client!we", name = "c", descriptor = "()I")
	protected int method5522() throws Exception {
		return this.anInt6315;
	}

	@OriginalMember(owner = "client!we", name = "d", descriptor = "()V")
	protected void method5524() throws Exception {
	}

	@OriginalMember(owner = "client!we", name = "f", descriptor = "(I)V")
	public final synchronized void method5525() {
		if (this.aBoolean554) {
			return;
		}
		@Pc(17) long local17 = Static349.method5647();
		try {
			if (this.aLong202 + 500000L < local17) {
				this.aLong202 = local17 - 500000L;
			}
			while (this.aLong202 + 5000L < local17) {
				this.method5519();
				this.aLong202 += 256000 / Static184.anInt3834;
			}
		} catch (@Pc(53) Exception local53) {
			this.aLong202 = local17;
		}
		if (this.anIntArray785 == null) {
			return;
		}
		try {
			if (this.aLong204 != 0L) {
				if (local17 < this.aLong204) {
					return;
				}
				this.method5509(this.anInt6315);
				this.aLong204 = 0L;
				this.aBoolean556 = true;
			}
			@Pc(90) int local90 = this.method5522();
			if (this.anInt6320 - local90 > this.anInt6321) {
				this.anInt6321 = this.anInt6320 - local90;
			}
			@Pc(115) int local115 = this.anInt6319 + this.anInt6317;
			if (local115 + 256 > 16384) {
				local115 = 16128;
			}
			if (local115 + 256 > this.anInt6315) {
				this.anInt6315 += 1024;
				if (this.anInt6315 > 16384) {
					this.anInt6315 = 16384;
				}
				this.method5516();
				local90 = 0;
				this.method5509(this.anInt6315);
				this.aBoolean556 = true;
				if (local115 + 256 > this.anInt6315) {
					local115 = this.anInt6315 - 256;
					this.anInt6317 = local115 - this.anInt6319;
				}
			}
			while (local90 < local115) {
				this.method5513(this.anIntArray785);
				local90 += 256;
				this.method5524();
			}
			if (this.aLong203 < local17) {
				if (this.aBoolean556) {
					this.aBoolean556 = false;
				} else if (this.anInt6321 == 0 && this.anInt6318 == 0) {
					this.method5516();
					this.aLong204 = local17 + 2000L;
					return;
				} else {
					this.anInt6317 = Math.min(this.anInt6318, this.anInt6321);
					this.anInt6318 = this.anInt6321;
				}
				this.aLong203 = local17 + 2000L;
				this.anInt6321 = 0;
			}
			this.anInt6320 = local90;
		} catch (@Pc(242) Exception local242) {
			this.method5516();
			this.aLong204 = local17 + 2000L;
		}
	}
}
