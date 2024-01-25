import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sl")
public class Class191 {

	@OriginalMember(owner = "client!sl", name = "b", descriptor = "Lclient!ms;")
	private Class5_Sub22 aClass5_Sub22_7;

	@OriginalMember(owner = "client!sl", name = "s", descriptor = "[I")
	public int[] anIntArray445;

	@OriginalMember(owner = "client!sl", name = "x", descriptor = "I")
	private int anInt6337;

	@OriginalMember(owner = "client!sl", name = "B", descriptor = "I")
	public int anInt6339;

	@OriginalMember(owner = "client!sl", name = "F", descriptor = "I")
	public int anInt6341;

	@OriginalMember(owner = "client!sl", name = "d", descriptor = "I")
	private final int anInt6320 = 32;

	@OriginalMember(owner = "client!sl", name = "t", descriptor = "Z")
	private boolean aBoolean417 = false;

	@OriginalMember(owner = "client!sl", name = "g", descriptor = "J")
	private long aLong192 = Static446.method5903();

	@OriginalMember(owner = "client!sl", name = "z", descriptor = "[Lclient!ms;")
	private final Class5_Sub22[] aClass5_Sub22Array5 = new Class5_Sub22[8];

	@OriginalMember(owner = "client!sl", name = "C", descriptor = "J")
	private long aLong193 = 0L;

	@OriginalMember(owner = "client!sl", name = "y", descriptor = "I")
	private int anInt6338 = 0;

	@OriginalMember(owner = "client!sl", name = "E", descriptor = "I")
	private int anInt6340 = 0;

	@OriginalMember(owner = "client!sl", name = "A", descriptor = "[Lclient!ms;")
	private final Class5_Sub22[] aClass5_Sub22Array6 = new Class5_Sub22[8];

	@OriginalMember(owner = "client!sl", name = "w", descriptor = "I")
	private int anInt6336 = 0;

	@OriginalMember(owner = "client!sl", name = "v", descriptor = "I")
	private int anInt6335 = 0;

	@OriginalMember(owner = "client!sl", name = "D", descriptor = "Z")
	private boolean aBoolean418 = true;

	@OriginalMember(owner = "client!sl", name = "G", descriptor = "J")
	private long aLong194 = 0L;

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(II)V")
	private void method5000() {
		this.anInt6340 -= 256;
		if (this.anInt6340 < 0) {
			this.anInt6340 = 0;
		}
		if (this.aClass5_Sub22_7 != null) {
			this.aClass5_Sub22_7.method5930(256);
		}
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(Lclient!ms;B)V")
	public final synchronized void method5001(@OriginalArg(0) Class5_Sub22 arg0) {
		this.aClass5_Sub22_7 = arg0;
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "()V")
	protected void method5002() throws Exception {
	}

	@OriginalMember(owner = "client!sl", name = "b", descriptor = "()V")
	protected void method5003() throws Exception {
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(B)V")
	public final synchronized void method5004() {
		if (this.aBoolean417) {
			return;
		}
		@Pc(12) long local12 = Static446.method5903();
		try {
			if (this.aLong192 + 500000L < local12) {
				this.aLong192 = local12 - 500000L;
			}
			while (local12 > this.aLong192 + 5000L) {
				this.method5000();
				this.aLong192 += 256000 / Static193.anInt3215;
			}
		} catch (@Pc(52) Exception local52) {
			this.aLong192 = local12;
		}
		if (this.anIntArray445 == null) {
			return;
		}
		try {
			if (this.aLong193 != 0L) {
				if (local12 < this.aLong193) {
					return;
				}
				this.method5008(this.anInt6341);
				this.aBoolean418 = true;
				this.aLong193 = 0L;
			}
			@Pc(87) int local87 = this.method5011();
			if (this.anInt6336 < this.anInt6338 - local87) {
				this.anInt6336 = this.anInt6338 - local87;
			}
			@Pc(113) int local113 = this.anInt6339 + this.anInt6337;
			if (local113 + 256 > 16384) {
				local113 = 16128;
			}
			if (local113 + 256 > this.anInt6341) {
				this.anInt6341 += 1024;
				if (this.anInt6341 > 16384) {
					this.anInt6341 = 16384;
				}
				this.method5006();
				this.method5008(this.anInt6341);
				local87 = 0;
				this.aBoolean418 = true;
				if (local113 + 256 > this.anInt6341) {
					local113 = this.anInt6341 - 256;
					this.anInt6337 = local113 - this.anInt6339;
				}
			}
			while (local87 < local113) {
				this.method5014(this.anIntArray445);
				local87 += 256;
				this.method5003();
			}
			if (this.aLong194 < local12) {
				if (this.aBoolean418) {
					this.aBoolean418 = false;
				} else if (this.anInt6336 == 0 && this.anInt6335 == 0) {
					this.method5006();
					this.aLong193 = local12 + 2000L;
					return;
				} else {
					this.anInt6337 = Math.min(this.anInt6335, this.anInt6336);
					this.anInt6335 = this.anInt6336;
				}
				this.anInt6336 = 0;
				this.aLong194 = local12 + 2000L;
			}
			this.anInt6338 = local87;
		} catch (@Pc(252) Exception local252) {
			this.method5006();
			this.aLong193 = local12 + 2000L;
		}
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(I)V")
	public final synchronized void method5005() {
		if (Static450.aClass174_1 != null) {
			@Pc(5) boolean local5 = true;
			for (@Pc(7) int local7 = 0; local7 < 2; local7++) {
				if (Static450.aClass174_1.aClass191Array1[local7] == this) {
					Static450.aClass174_1.aClass191Array1[local7] = null;
				}
				if (Static450.aClass174_1.aClass191Array1[local7] != null) {
					local5 = false;
				}
			}
			if (local5) {
				Static450.aClass174_1.aBoolean289 = true;
				while (Static450.aClass174_1.aBoolean290) {
					Static140.method2004(50L);
				}
				Static450.aClass174_1 = null;
			}
		}
		this.method5006();
		this.anIntArray445 = null;
		this.aBoolean417 = true;
	}

	@OriginalMember(owner = "client!sl", name = "c", descriptor = "()V")
	protected void method5006() {
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(BLclient!ms;I)V")
	private void method5007(@OriginalArg(1) Class5_Sub22 arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = arg1 >> 5;
		@Pc(12) Class5_Sub22 local12 = this.aClass5_Sub22Array6[local7];
		if (local12 == null) {
			this.aClass5_Sub22Array5[local7] = arg0;
		} else {
			local12.aClass5_Sub22_8 = arg0;
		}
		this.aClass5_Sub22Array6[local7] = arg0;
		arg0.anInt7393 = arg1;
	}

	@OriginalMember(owner = "client!sl", name = "b", descriptor = "(I)V")
	public void method5008(@OriginalArg(0) int arg0) throws Exception {
	}

	@OriginalMember(owner = "client!sl", name = "c", descriptor = "(I)V")
	public final synchronized void method5010() {
		this.aBoolean418 = true;
		try {
			this.method5002();
		} catch (@Pc(14) Exception local14) {
			this.method5006();
			this.aLong193 = Static446.method5903() + 2000L;
		}
	}

	@OriginalMember(owner = "client!sl", name = "d", descriptor = "()I")
	protected int method5011() throws Exception {
		return this.anInt6341;
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(Ljava/awt/Component;)V")
	public void method5012(@OriginalArg(0) Component arg0) throws Exception {
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "([II)V")
	private void method5014(@OriginalArg(0) int[] arg0) {
		@Pc(1) short local1 = 256;
		if (Static335.aBoolean372) {
			local1 = 512;
		}
		Static468.method3862(arg0, 0, local1);
		this.anInt6340 -= 256;
		if (this.aClass5_Sub22_7 != null && this.anInt6340 <= 0) {
			this.anInt6340 += Static193.anInt3215 >> 4;
			Static225.method2957(this.aClass5_Sub22_7);
			this.method5007(this.aClass5_Sub22_7, this.aClass5_Sub22_7.method5933());
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
						@Pc(88) Class5_Sub22 local88 = null;
						@Pc(93) Class5_Sub22 local93 = this.aClass5_Sub22Array5[local56];
						label97: while (true) {
							while (true) {
								if (local93 == null) {
									break label97;
								}
								@Pc(97) Class5_Sub5 local97 = local93.aClass5_Sub5_5;
								if (local97 == null || local97.anInt5861 <= local61) {
									local93.aBoolean497 = true;
									@Pc(121) int local121 = local93.method5931();
									local45 += local121;
									if (local97 != null) {
										local97.anInt5861 += local121;
									}
									if (local45 >= this.anInt6320) {
										break label103;
									}
									@Pc(140) Class5_Sub22 local140 = local93.method5929();
									if (local140 != null) {
										@Pc(145) int local145 = local93.anInt7393;
										while (local140 != null) {
											this.method5007(local140, local145 * local140.method5933() >> 8);
											local140 = local93.method5928();
										}
									}
									@Pc(164) Class5_Sub22 local164 = local93.aClass5_Sub22_8;
									local93.aClass5_Sub22_8 = null;
									if (local88 == null) {
										this.aClass5_Sub22Array5[local56] = local164;
									} else {
										local88.aClass5_Sub22_8 = local164;
									}
									if (local164 == null) {
										this.aClass5_Sub22Array6[local56] = local88;
									}
									local93 = local164;
								} else {
									local47 |= 0x1 << local56;
									local88 = local93;
									local93 = local93.aClass5_Sub22_8;
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
				@Pc(207) Class5_Sub22 local207 = this.aClass5_Sub22Array5[local56];
				this.aClass5_Sub22Array5[local56] = this.aClass5_Sub22Array6[local56] = null;
				while (local207 != null) {
					@Pc(221) Class5_Sub22 local221 = local207.aClass5_Sub22_8;
					local207.aClass5_Sub22_8 = null;
					local207 = local221;
				}
			}
		}
		if (this.anInt6340 < 0) {
			this.anInt6340 = 0;
		}
		if (this.aClass5_Sub22_7 != null) {
			this.aClass5_Sub22_7.method5934(arg0, 0, 256);
		}
		this.aLong192 = Static446.method5903();
	}
}
