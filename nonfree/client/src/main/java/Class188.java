import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mda")
public class Class188 {

	@OriginalMember(owner = "client!mda", name = "c", descriptor = "[I")
	public int[] anIntArray571;

	@OriginalMember(owner = "client!mda", name = "l", descriptor = "Lclient!os;")
	private Class3_Sub7 aClass3_Sub7_8;

	@OriginalMember(owner = "client!mda", name = "w", descriptor = "I")
	public int anInt9043;

	@OriginalMember(owner = "client!mda", name = "H", descriptor = "I")
	public int anInt9049;

	@OriginalMember(owner = "client!mda", name = "I", descriptor = "I")
	private int anInt9050;

	@OriginalMember(owner = "client!mda", name = "h", descriptor = "Z")
	private boolean aBoolean644 = false;

	@OriginalMember(owner = "client!mda", name = "n", descriptor = "I")
	private final int anInt9035 = 32;

	@OriginalMember(owner = "client!mda", name = "o", descriptor = "J")
	private long aLong236 = Static374.method6036();

	@OriginalMember(owner = "client!mda", name = "z", descriptor = "I")
	private int anInt9044 = 0;

	@OriginalMember(owner = "client!mda", name = "C", descriptor = "Z")
	private boolean aBoolean645 = true;

	@OriginalMember(owner = "client!mda", name = "x", descriptor = "[Lclient!os;")
	private final Class3_Sub7[] aClass3_Sub7Array5 = new Class3_Sub7[8];

	@OriginalMember(owner = "client!mda", name = "E", descriptor = "[Lclient!os;")
	private final Class3_Sub7[] aClass3_Sub7Array6 = new Class3_Sub7[8];

	@OriginalMember(owner = "client!mda", name = "A", descriptor = "I")
	private int anInt9045 = 0;

	@OriginalMember(owner = "client!mda", name = "F", descriptor = "J")
	private long aLong238 = 0L;

	@OriginalMember(owner = "client!mda", name = "y", descriptor = "J")
	private long aLong237 = 0L;

	@OriginalMember(owner = "client!mda", name = "G", descriptor = "I")
	private int anInt9048 = 0;

	@OriginalMember(owner = "client!mda", name = "D", descriptor = "I")
	private int anInt9047 = 0;

	@OriginalMember(owner = "client!mda", name = "a", descriptor = "(I)V")
	public final synchronized void method7758() {
		if (this.aBoolean644) {
			return;
		}
		@Pc(12) long local12 = Static374.method6036();
		try {
			if (local12 > this.aLong236 + 6000L) {
				this.aLong236 = local12 - 6000L;
			}
			while (local12 > this.aLong236 + 5000L) {
				this.method7764();
				this.aLong236 += 256000 / Static276.anInt4980;
				local12 = Static374.method6036();
			}
		} catch (@Pc(61) Exception local61) {
			this.aLong236 = local12;
		}
		if (this.anIntArray571 == null) {
			return;
		}
		try {
			if (this.aLong237 != 0L) {
				if (this.aLong237 > local12) {
					return;
				}
				this.method7759(this.anInt9043);
				this.aLong237 = 0L;
				this.aBoolean645 = true;
			}
			@Pc(94) int local94 = this.method7770();
			if (this.anInt9047 < this.anInt9045 - local94) {
				this.anInt9047 = this.anInt9045 - local94;
			}
			@Pc(115) int local115 = this.anInt9049 + this.anInt9050;
			if (local115 + 256 > 16384) {
				local115 = 16128;
			}
			if (this.anInt9043 < local115 + 256) {
				this.anInt9043 += 1024;
				if (this.anInt9043 > 16384) {
					this.anInt9043 = 16384;
				}
				this.method7760();
				local94 = 0;
				this.method7759(this.anInt9043);
				this.aBoolean645 = true;
				if (local115 + 256 > this.anInt9043) {
					local115 = this.anInt9043 - 256;
					this.anInt9050 = local115 - this.anInt9049;
				}
			}
			while (local94 < local115) {
				this.method7762(this.anIntArray571);
				this.method7773();
				local94 += 256;
			}
			if (this.aLong238 < local12) {
				if (this.aBoolean645) {
					this.aBoolean645 = false;
				} else if (this.anInt9047 == 0 && this.anInt9048 == 0) {
					this.method7760();
					this.aLong237 = local12 + 2000L;
					return;
				} else {
					this.anInt9050 = Math.min(this.anInt9048, this.anInt9047);
					this.anInt9048 = this.anInt9047;
				}
				this.aLong238 = local12 + 2000L;
				this.anInt9047 = 0;
			}
			this.anInt9045 = local94;
		} catch (@Pc(248) Exception local248) {
			this.method7760();
			this.aLong237 = local12 + 2000L;
		}
	}

	@OriginalMember(owner = "client!mda", name = "b", descriptor = "(I)V")
	public void method7759(@OriginalArg(0) int arg0) throws Exception {
	}

	@OriginalMember(owner = "client!mda", name = "a", descriptor = "()V")
	protected void method7760() {
	}

	@OriginalMember(owner = "client!mda", name = "a", descriptor = "([II)V")
	private void method7762(@OriginalArg(0) int[] arg0) {
		@Pc(1) short local1 = 256;
		if (Static447.aBoolean556) {
			local1 = 512;
		}
		Static653.method6856(arg0, 0, local1);
		this.anInt9044 -= 256;
		if (this.aClass3_Sub7_8 != null && this.anInt9044 <= 0) {
			this.anInt9044 += Static276.anInt4980 >> 4;
			Static547.method1366(this.aClass3_Sub7_8);
			this.method7766(this.aClass3_Sub7_8, this.aClass3_Sub7_8.method8762());
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
						@Pc(88) Class3_Sub7 local88 = null;
						@Pc(93) Class3_Sub7 local93 = this.aClass3_Sub7Array5[local56];
						label97: while (true) {
							while (true) {
								if (local93 == null) {
									break label97;
								}
								@Pc(97) Class3_Sub30 local97 = local93.aClass3_Sub30_6;
								if (local97 == null || local97.anInt4760 <= local61) {
									local93.aBoolean732 = true;
									@Pc(121) int local121 = local93.method8763();
									local45 += local121;
									if (local97 != null) {
										local97.anInt4760 += local121;
									}
									if (local45 >= this.anInt9035) {
										break label103;
									}
									@Pc(140) Class3_Sub7 local140 = local93.method8761();
									if (local140 != null) {
										@Pc(145) int local145 = local93.anInt10216;
										while (local140 != null) {
											this.method7766(local140, local145 * local140.method8762() >> 8);
											local140 = local93.method8760();
										}
									}
									@Pc(164) Class3_Sub7 local164 = local93.aClass3_Sub7_9;
									local93.aClass3_Sub7_9 = null;
									if (local88 == null) {
										this.aClass3_Sub7Array5[local56] = local164;
									} else {
										local88.aClass3_Sub7_9 = local164;
									}
									if (local164 == null) {
										this.aClass3_Sub7Array6[local56] = local88;
									}
									local93 = local164;
								} else {
									local47 |= 0x1 << local56;
									local88 = local93;
									local93 = local93.aClass3_Sub7_9;
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
				@Pc(207) Class3_Sub7 local207 = this.aClass3_Sub7Array5[local56];
				this.aClass3_Sub7Array5[local56] = this.aClass3_Sub7Array6[local56] = null;
				while (local207 != null) {
					@Pc(221) Class3_Sub7 local221 = local207.aClass3_Sub7_9;
					local207.aClass3_Sub7_9 = null;
					local207 = local221;
				}
			}
		}
		if (this.anInt9044 < 0) {
			this.anInt9044 = 0;
		}
		if (this.aClass3_Sub7_8 != null) {
			this.aClass3_Sub7_8.method8757(arg0, 0, 256);
		}
		this.aLong236 = Static374.method6036();
	}

	@OriginalMember(owner = "client!mda", name = "a", descriptor = "(II)V")
	private void method7764() {
		this.anInt9044 -= 256;
		if (this.anInt9044 < 0) {
			this.anInt9044 = 0;
		}
		if (this.aClass3_Sub7_8 != null) {
			this.aClass3_Sub7_8.method8758(256);
		}
	}

	@OriginalMember(owner = "client!mda", name = "a", descriptor = "(ILclient!os;I)V")
	private void method7766(@OriginalArg(1) Class3_Sub7 arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = arg1 >> 5;
		@Pc(12) Class3_Sub7 local12 = this.aClass3_Sub7Array6[local7];
		if (local12 == null) {
			this.aClass3_Sub7Array5[local7] = arg0;
		} else {
			local12.aClass3_Sub7_9 = arg0;
		}
		this.aClass3_Sub7Array6[local7] = arg0;
		arg0.anInt10216 = arg1;
	}

	@OriginalMember(owner = "client!mda", name = "a", descriptor = "(B)V")
	public final synchronized void method7767() {
		this.aBoolean645 = true;
		try {
			this.method7771();
		} catch (@Pc(18) Exception local18) {
			this.method7760();
			this.aLong237 = Static374.method6036() + 2000L;
		}
	}

	@OriginalMember(owner = "client!mda", name = "a", descriptor = "(BLclient!os;)V")
	public final synchronized void method7768(@OriginalArg(1) Class3_Sub7 arg0) {
		this.aClass3_Sub7_8 = arg0;
	}

	@OriginalMember(owner = "client!mda", name = "a", descriptor = "(Ljava/awt/Component;)V")
	public void method7769(@OriginalArg(0) Component arg0) throws Exception {
	}

	@OriginalMember(owner = "client!mda", name = "b", descriptor = "()I")
	protected int method7770() throws Exception {
		return this.anInt9043;
	}

	@OriginalMember(owner = "client!mda", name = "c", descriptor = "()V")
	protected void method7771() throws Exception {
	}

	@OriginalMember(owner = "client!mda", name = "d", descriptor = "(I)V")
	public final synchronized void method7772() {
		if (Static284.aClass273_1 != null) {
			@Pc(5) boolean local5 = true;
			for (@Pc(7) int local7 = 0; local7 < 2; local7++) {
				if (Static284.aClass273_1.aClass188Array1[local7] == this) {
					Static284.aClass273_1.aClass188Array1[local7] = null;
				}
				if (Static284.aClass273_1.aClass188Array1[local7] != null) {
					local5 = false;
				}
			}
			if (local5) {
				Static284.aClass273_1.aBoolean560 = true;
				while (Static284.aClass273_1.aBoolean559) {
					Static258.method4293(50L);
				}
				Static284.aClass273_1 = null;
			}
		}
		this.method7760();
		this.aBoolean644 = true;
		this.anIntArray571 = null;
	}

	@OriginalMember(owner = "client!mda", name = "d", descriptor = "()V")
	protected void method7773() throws Exception {
	}
}
