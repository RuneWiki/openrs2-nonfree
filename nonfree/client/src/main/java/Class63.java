import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uu")
public class Class63 {

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "[I")
	public int[] anIntArray320;

	@OriginalMember(owner = "client!uu", name = "d", descriptor = "Lclient!gu;")
	private Class5_Sub16 aClass5_Sub16_6;

	@OriginalMember(owner = "client!uu", name = "s", descriptor = "I")
	public int anInt3864;

	@OriginalMember(owner = "client!uu", name = "w", descriptor = "I")
	private int anInt3867;

	@OriginalMember(owner = "client!uu", name = "D", descriptor = "I")
	public int anInt3870;

	@OriginalMember(owner = "client!uu", name = "j", descriptor = "I")
	private final int anInt3856 = 32;

	@OriginalMember(owner = "client!uu", name = "i", descriptor = "Z")
	private boolean aBoolean311 = false;

	@OriginalMember(owner = "client!uu", name = "f", descriptor = "J")
	private long aLong115 = Static205.method3179();

	@OriginalMember(owner = "client!uu", name = "z", descriptor = "[Lclient!gu;")
	private final Class5_Sub16[] aClass5_Sub16Array6 = new Class5_Sub16[8];

	@OriginalMember(owner = "client!uu", name = "x", descriptor = "[Lclient!gu;")
	private final Class5_Sub16[] aClass5_Sub16Array5 = new Class5_Sub16[8];

	@OriginalMember(owner = "client!uu", name = "t", descriptor = "J")
	private long aLong116 = 0L;

	@OriginalMember(owner = "client!uu", name = "B", descriptor = "J")
	private long aLong117 = 0L;

	@OriginalMember(owner = "client!uu", name = "A", descriptor = "Z")
	private boolean aBoolean313 = true;

	@OriginalMember(owner = "client!uu", name = "r", descriptor = "I")
	private int anInt3863 = 0;

	@OriginalMember(owner = "client!uu", name = "C", descriptor = "I")
	private int anInt3869 = 0;

	@OriginalMember(owner = "client!uu", name = "E", descriptor = "I")
	private int anInt3871 = 0;

	@OriginalMember(owner = "client!uu", name = "u", descriptor = "I")
	private int anInt3865 = 0;

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(IB)V")
	private void method3489() {
		this.anInt3863 -= 256;
		if (this.anInt3863 < 0) {
			this.anInt3863 = 0;
		}
		if (this.aClass5_Sub16_6 != null) {
			this.aClass5_Sub16_6.method8286(256);
		}
	}

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "()V")
	protected void method3490() throws Exception {
	}

	@OriginalMember(owner = "client!uu", name = "b", descriptor = "()I")
	protected int method3491() throws Exception {
		return this.anInt3864;
	}

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(I)V")
	public final synchronized void method3492() {
		this.aBoolean313 = true;
		try {
			this.method3490();
		} catch (@Pc(14) Exception local14) {
			this.method3499();
			this.aLong116 = Static205.method3179() + 2000L;
		}
	}

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "([II)V")
	private void method3493(@OriginalArg(0) int[] arg0) {
		@Pc(1) short local1 = 256;
		if (Static568.aBoolean763) {
			local1 = 512;
		}
		Static655.method4108(arg0, 0, local1);
		this.anInt3863 -= 256;
		if (this.aClass5_Sub16_6 != null && this.anInt3863 <= 0) {
			this.anInt3863 += Static92.anInt9993 >> 4;
			Static526.method7536(this.aClass5_Sub16_6);
			this.method3502(this.aClass5_Sub16_6, this.aClass5_Sub16_6.method8284());
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
						@Pc(88) Class5_Sub16 local88 = null;
						@Pc(93) Class5_Sub16 local93 = this.aClass5_Sub16Array5[local56];
						label97: while (true) {
							while (true) {
								if (local93 == null) {
									break label97;
								}
								@Pc(97) Class5_Sub11 local97 = local93.aClass5_Sub11_6;
								if (local97 == null || local97.anInt1317 <= local61) {
									local93.aBoolean774 = true;
									@Pc(121) int local121 = local93.method8287();
									local45 += local121;
									if (local97 != null) {
										local97.anInt1317 += local121;
									}
									if (local45 >= this.anInt3856) {
										break label103;
									}
									@Pc(140) Class5_Sub16 local140 = local93.method8283();
									if (local140 != null) {
										@Pc(145) int local145 = local93.anInt9645;
										while (local140 != null) {
											this.method3502(local140, local145 * local140.method8284() >> 8);
											local140 = local93.method8281();
										}
									}
									@Pc(164) Class5_Sub16 local164 = local93.aClass5_Sub16_9;
									local93.aClass5_Sub16_9 = null;
									if (local88 == null) {
										this.aClass5_Sub16Array5[local56] = local164;
									} else {
										local88.aClass5_Sub16_9 = local164;
									}
									if (local164 == null) {
										this.aClass5_Sub16Array6[local56] = local88;
									}
									local93 = local164;
								} else {
									local47 |= 0x1 << local56;
									local88 = local93;
									local93 = local93.aClass5_Sub16_9;
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
				@Pc(207) Class5_Sub16 local207 = this.aClass5_Sub16Array5[local56];
				this.aClass5_Sub16Array5[local56] = this.aClass5_Sub16Array6[local56] = null;
				while (local207 != null) {
					@Pc(221) Class5_Sub16 local221 = local207.aClass5_Sub16_9;
					local207.aClass5_Sub16_9 = null;
					local207 = local221;
				}
			}
		}
		if (this.anInt3863 < 0) {
			this.anInt3863 = 0;
		}
		if (this.aClass5_Sub16_6 != null) {
			this.aClass5_Sub16_6.method8282(arg0, 0, 256);
		}
		this.aLong115 = Static205.method3179();
	}

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(Ljava/awt/Component;)V")
	public void method3494(@OriginalArg(0) Component arg0) throws Exception {
	}

	@OriginalMember(owner = "client!uu", name = "b", descriptor = "(I)V")
	public final synchronized void method3495() {
		if (Static460.aClass274_1 != null) {
			@Pc(5) boolean local5 = true;
			for (@Pc(7) int local7 = 0; local7 < 2; local7++) {
				if (Static460.aClass274_1.aClass63Array1[local7] == this) {
					Static460.aClass274_1.aClass63Array1[local7] = null;
				}
				if (Static460.aClass274_1.aClass63Array1[local7] != null) {
					local5 = false;
				}
			}
			if (local5) {
				Static460.aClass274_1.aBoolean620 = true;
				while (Static460.aClass274_1.aBoolean619) {
					Static452.method7478(50L);
				}
				Static460.aClass274_1 = null;
			}
		}
		this.method3499();
		this.aBoolean311 = true;
		this.anIntArray320 = null;
	}

	@OriginalMember(owner = "client!uu", name = "c", descriptor = "(I)V")
	public void method3496(@OriginalArg(0) int arg0) throws Exception {
	}

	@OriginalMember(owner = "client!uu", name = "d", descriptor = "(I)V")
	public final synchronized void method3497() {
		if (this.aBoolean311) {
			return;
		}
		@Pc(14) long local14 = Static205.method3179();
		try {
			if (local14 > this.aLong115 + 6000L) {
				this.aLong115 = local14 - 6000L;
			}
			while (this.aLong115 + 5000L < local14) {
				this.method3489();
				this.aLong115 += (long) (256000 / Static92.anInt9993);
				local14 = Static205.method3179();
			}
		} catch (@Pc(57) Exception local57) {
			this.aLong115 = local14;
		}
		if (this.anIntArray320 == null) {
			return;
		}
		try {
			if (this.aLong116 != (long) 0) {
				if (local14 < this.aLong116) {
					return;
				}
				this.method3496(this.anInt3864);
				this.aBoolean313 = true;
				this.aLong116 = 0L;
			}
			@Pc(89) int local89 = this.method3491();
			if (this.anInt3871 - local89 > this.anInt3869) {
				this.anInt3869 = this.anInt3871 - local89;
			}
			@Pc(113) int local113 = this.anInt3867 + this.anInt3870;
			if (local113 + 256 > 16384) {
				local113 = 16128;
			}
			if (local113 + 256 > this.anInt3864) {
				this.anInt3864 += 1024;
				if (this.anInt3864 > 16384) {
					this.anInt3864 = 16384;
				}
				this.method3499();
				local89 = 0;
				this.method3496(this.anInt3864);
				this.aBoolean313 = true;
				if (local113 + 256 > this.anInt3864) {
					local113 = this.anInt3864 - 256;
					this.anInt3867 = local113 - this.anInt3870;
				}
			}
			while (local89 < local113) {
				this.method3493(this.anIntArray320);
				local89 += 256;
				this.method3501();
			}
			if (this.aLong117 < local14) {
				if (this.aBoolean313) {
					this.aBoolean313 = false;
				} else if (this.anInt3869 == 0 && this.anInt3865 == 0) {
					this.method3499();
					this.aLong116 = local14 + 2000L;
					return;
				} else {
					this.anInt3867 = Math.min(this.anInt3865, this.anInt3869);
					this.anInt3865 = this.anInt3869;
				}
				this.aLong117 = local14 + 2000L;
				this.anInt3869 = 0;
			}
			this.anInt3871 = local89;
		} catch (@Pc(238) Exception local238) {
			this.method3499();
			this.aLong116 = local14 + 2000L;
		}
	}

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(Lclient!gu;I)V")
	public final synchronized void method3498(@OriginalArg(0) Class5_Sub16 arg0) {
		this.aClass5_Sub16_6 = arg0;
	}

	@OriginalMember(owner = "client!uu", name = "c", descriptor = "()V")
	protected void method3499() {
	}

	@OriginalMember(owner = "client!uu", name = "d", descriptor = "()V")
	protected void method3501() throws Exception {
	}

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(Lclient!gu;BI)V")
	private void method3502(@OriginalArg(0) Class5_Sub16 arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = arg1 >> 5;
		@Pc(12) Class5_Sub16 local12 = this.aClass5_Sub16Array6[local7];
		if (local12 == null) {
			this.aClass5_Sub16Array5[local7] = arg0;
		} else {
			local12.aClass5_Sub16_9 = arg0;
		}
		this.aClass5_Sub16Array6[local7] = arg0;
		arg0.anInt9645 = arg1;
	}
}
