import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fr")
public class Class33 {

	@OriginalMember(owner = "client!fr", name = "k", descriptor = "Lclient!ar;")
	private Class3_Sub5 aClass3_Sub5_4;

	@OriginalMember(owner = "client!fr", name = "m", descriptor = "[I")
	public int[] anIntArray282;

	@OriginalMember(owner = "client!fr", name = "w", descriptor = "I")
	private int anInt3672;

	@OriginalMember(owner = "client!fr", name = "z", descriptor = "I")
	public int anInt3673;

	@OriginalMember(owner = "client!fr", name = "D", descriptor = "I")
	public int anInt3676;

	@OriginalMember(owner = "client!fr", name = "o", descriptor = "I")
	private final int anInt3667 = 32;

	@OriginalMember(owner = "client!fr", name = "q", descriptor = "Z")
	private boolean aBoolean284 = false;

	@OriginalMember(owner = "client!fr", name = "b", descriptor = "J")
	private long aLong111 = Static150.method2672();

	@OriginalMember(owner = "client!fr", name = "t", descriptor = "J")
	private long aLong112 = 0L;

	@OriginalMember(owner = "client!fr", name = "u", descriptor = "I")
	private int anInt3671 = 0;

	@OriginalMember(owner = "client!fr", name = "y", descriptor = "Z")
	private boolean aBoolean285 = true;

	@OriginalMember(owner = "client!fr", name = "x", descriptor = "[Lclient!ar;")
	private final Class3_Sub5[] aClass3_Sub5Array6 = new Class3_Sub5[8];

	@OriginalMember(owner = "client!fr", name = "v", descriptor = "[Lclient!ar;")
	private final Class3_Sub5[] aClass3_Sub5Array5 = new Class3_Sub5[8];

	@OriginalMember(owner = "client!fr", name = "B", descriptor = "I")
	private int anInt3674 = 0;

	@OriginalMember(owner = "client!fr", name = "A", descriptor = "J")
	private long aLong113 = 0L;

	@OriginalMember(owner = "client!fr", name = "C", descriptor = "I")
	private int anInt3675 = 0;

	@OriginalMember(owner = "client!fr", name = "E", descriptor = "I")
	private int anInt3677 = 0;

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "()V")
	protected void method3047() {
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(B)V")
	public final synchronized void method3048() {
		if (Static36.aClass152_1 != null) {
			@Pc(7) boolean local7 = true;
			for (@Pc(9) int local9 = 0; local9 < 2; local9++) {
				if (Static36.aClass152_1.aClass33Array1[local9] == this) {
					Static36.aClass152_1.aClass33Array1[local9] = null;
				}
				if (Static36.aClass152_1.aClass33Array1[local9] != null) {
					local7 = false;
				}
			}
			if (local7) {
				Static36.aClass152_1.aBoolean352 = true;
				while (Static36.aClass152_1.aBoolean353) {
					Static135.method2458(50L);
				}
				Static36.aClass152_1 = null;
			}
		}
		this.method3047();
		this.anIntArray282 = null;
		this.aBoolean284 = true;
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(Lclient!ar;II)V")
	private void method3049(@OriginalArg(0) Class3_Sub5 arg0, @OriginalArg(1) int arg1) {
		@Pc(7) int local7 = arg1 >> 5;
		@Pc(17) Class3_Sub5 local17 = this.aClass3_Sub5Array6[local7];
		if (local17 == null) {
			this.aClass3_Sub5Array5[local7] = arg0;
		} else {
			local17.aClass3_Sub5_8 = arg0;
		}
		this.aClass3_Sub5Array6[local7] = arg0;
		arg0.anInt6619 = arg1;
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(I)V")
	public final synchronized void method3050() {
		if (this.aBoolean284) {
			return;
		}
		@Pc(12) long local12 = Static150.method2672();
		try {
			if (local12 > this.aLong111 + 500000L) {
				this.aLong111 = local12 - 500000L;
			}
			while (local12 > this.aLong111 + 5000L) {
				this.method3061();
				this.aLong111 += 256000 / Static94.anInt2028;
			}
		} catch (@Pc(52) Exception local52) {
			this.aLong111 = local12;
		}
		if (this.anIntArray282 == null) {
			return;
		}
		try {
			if (this.aLong112 != 0L) {
				if (this.aLong112 > local12) {
					return;
				}
				this.method3060(this.anInt3676);
				this.aBoolean285 = true;
				this.aLong112 = 0L;
			}
			@Pc(91) int local91 = this.method3056();
			if (this.anInt3674 < this.anInt3671 - local91) {
				this.anInt3674 = this.anInt3671 - local91;
			}
			@Pc(116) int local116 = this.anInt3673 + this.anInt3672;
			if (local116 + 256 > 16384) {
				local116 = 16128;
			}
			if (local116 + 256 > this.anInt3676) {
				this.anInt3676 += 1024;
				if (this.anInt3676 > 16384) {
					this.anInt3676 = 16384;
				}
				this.method3047();
				local91 = 0;
				this.method3060(this.anInt3676);
				if (this.anInt3676 < local116 + 256) {
					local116 = this.anInt3676 - 256;
					this.anInt3672 = local116 - this.anInt3673;
				}
				this.aBoolean285 = true;
			}
			while (local91 < local116) {
				this.method3052(this.anIntArray282);
				local91 += 256;
				this.method3053();
			}
			if (this.aLong113 < local12) {
				if (this.aBoolean285) {
					this.aBoolean285 = false;
				} else if (this.anInt3674 == 0 && this.anInt3677 == 0) {
					this.method3047();
					this.aLong112 = local12 + 2000L;
					return;
				} else {
					this.anInt3672 = Math.min(this.anInt3677, this.anInt3674);
					this.anInt3677 = this.anInt3674;
				}
				this.anInt3674 = 0;
				this.aLong113 = local12 + 2000L;
			}
			this.anInt3671 = local91;
		} catch (@Pc(237) Exception local237) {
			this.method3047();
			this.aLong112 = local12 + 2000L;
		}
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(Ljava/awt/Component;)V")
	public void method3051(@OriginalArg(0) Component arg0) throws Exception {
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "([II)V")
	private void method3052(@OriginalArg(0) int[] arg0) {
		@Pc(1) short local1 = 256;
		if (Static29.aBoolean45) {
			local1 = 512;
		}
		Static464.method5796(arg0, 0, local1);
		this.anInt3675 -= 256;
		if (this.aClass3_Sub5_4 != null && this.anInt3675 <= 0) {
			this.anInt3675 += Static94.anInt2028 >> 4;
			Static223.method4970(this.aClass3_Sub5_4);
			this.method3049(this.aClass3_Sub5_4, this.aClass3_Sub5_4.method5186());
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
						@Pc(88) Class3_Sub5 local88 = null;
						@Pc(93) Class3_Sub5 local93 = this.aClass3_Sub5Array5[local56];
						label97: while (true) {
							while (true) {
								if (local93 == null) {
									break label97;
								}
								@Pc(97) Class3_Sub13 local97 = local93.aClass3_Sub13_5;
								if (local97 == null || local97.anInt1848 <= local61) {
									local93.aBoolean457 = true;
									@Pc(121) int local121 = local93.method5185();
									local45 += local121;
									if (local97 != null) {
										local97.anInt1848 += local121;
									}
									if (local45 >= this.anInt3667) {
										break label103;
									}
									@Pc(140) Class3_Sub5 local140 = local93.method5187();
									if (local140 != null) {
										@Pc(145) int local145 = local93.anInt6619;
										while (local140 != null) {
											this.method3049(local140, local145 * local140.method5186() >> 8);
											local140 = local93.method5188();
										}
									}
									@Pc(164) Class3_Sub5 local164 = local93.aClass3_Sub5_8;
									local93.aClass3_Sub5_8 = null;
									if (local88 == null) {
										this.aClass3_Sub5Array5[local56] = local164;
									} else {
										local88.aClass3_Sub5_8 = local164;
									}
									if (local164 == null) {
										this.aClass3_Sub5Array6[local56] = local88;
									}
									local93 = local164;
								} else {
									local47 |= 0x1 << local56;
									local88 = local93;
									local93 = local93.aClass3_Sub5_8;
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
				@Pc(207) Class3_Sub5 local207 = this.aClass3_Sub5Array5[local56];
				this.aClass3_Sub5Array5[local56] = this.aClass3_Sub5Array6[local56] = null;
				while (local207 != null) {
					@Pc(221) Class3_Sub5 local221 = local207.aClass3_Sub5_8;
					local207.aClass3_Sub5_8 = null;
					local207 = local221;
				}
			}
		}
		if (this.anInt3675 < 0) {
			this.anInt3675 = 0;
		}
		if (this.aClass3_Sub5_4 != null) {
			this.aClass3_Sub5_4.method5189(arg0, 0, 256);
		}
		this.aLong111 = Static150.method2672();
	}

	@OriginalMember(owner = "client!fr", name = "b", descriptor = "()V")
	protected void method3053() throws Exception {
	}

	@OriginalMember(owner = "client!fr", name = "b", descriptor = "(B)V")
	public final void method3055() {
		this.aBoolean285 = true;
	}

	@OriginalMember(owner = "client!fr", name = "c", descriptor = "()I")
	protected int method3056() throws Exception {
		return this.anInt3676;
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(Lclient!ar;I)V")
	public final synchronized void method3057(@OriginalArg(0) Class3_Sub5 arg0) {
		this.aClass3_Sub5_4 = arg0;
	}

	@OriginalMember(owner = "client!fr", name = "d", descriptor = "()V")
	protected void method3058() throws Exception {
	}

	@OriginalMember(owner = "client!fr", name = "c", descriptor = "(I)V")
	public final synchronized void method3059() {
		this.aBoolean285 = true;
		try {
			this.method3058();
		} catch (@Pc(15) Exception local15) {
			this.method3047();
			this.aLong112 = Static150.method2672() + 2000L;
		}
	}

	@OriginalMember(owner = "client!fr", name = "d", descriptor = "(I)V")
	public void method3060(@OriginalArg(0) int arg0) throws Exception {
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(II)V")
	private void method3061() {
		this.anInt3675 -= 256;
		if (this.anInt3675 < 0) {
			this.anInt3675 = 0;
		}
		if (this.aClass3_Sub5_4 != null) {
			this.aClass3_Sub5_4.method5190(256);
		}
	}
}
