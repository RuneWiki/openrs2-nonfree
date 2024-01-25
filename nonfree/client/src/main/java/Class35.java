import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hh")
public class Class35 {

	@OriginalMember(owner = "client!hh", name = "d", descriptor = "Lclient!ua;")
	private Class2_Sub13 aClass2_Sub13_5;

	@OriginalMember(owner = "client!hh", name = "g", descriptor = "[I")
	public int[] anIntArray215;

	@OriginalMember(owner = "client!hh", name = "y", descriptor = "I")
	public int anInt3251;

	@OriginalMember(owner = "client!hh", name = "A", descriptor = "I")
	public int anInt3252;

	@OriginalMember(owner = "client!hh", name = "G", descriptor = "I")
	private int anInt3256;

	@OriginalMember(owner = "client!hh", name = "c", descriptor = "I")
	private final int anInt3236 = 32;

	@OriginalMember(owner = "client!hh", name = "j", descriptor = "Z")
	private boolean aBoolean237 = false;

	@OriginalMember(owner = "client!hh", name = "k", descriptor = "J")
	private long aLong97 = Static476.method6413();

	@OriginalMember(owner = "client!hh", name = "E", descriptor = "I")
	private int anInt3254 = 0;

	@OriginalMember(owner = "client!hh", name = "C", descriptor = "[Lclient!ua;")
	private final Class2_Sub13[] aClass2_Sub13Array6 = new Class2_Sub13[8];

	@OriginalMember(owner = "client!hh", name = "F", descriptor = "I")
	private int anInt3255 = 0;

	@OriginalMember(owner = "client!hh", name = "z", descriptor = "[Lclient!ua;")
	private final Class2_Sub13[] aClass2_Sub13Array5 = new Class2_Sub13[8];

	@OriginalMember(owner = "client!hh", name = "B", descriptor = "I")
	private int anInt3253 = 0;

	@OriginalMember(owner = "client!hh", name = "x", descriptor = "Z")
	private boolean aBoolean238 = true;

	@OriginalMember(owner = "client!hh", name = "w", descriptor = "J")
	private long aLong98 = 0L;

	@OriginalMember(owner = "client!hh", name = "I", descriptor = "I")
	private int anInt3257 = 0;

	@OriginalMember(owner = "client!hh", name = "H", descriptor = "J")
	private long aLong99 = 0L;

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "()V")
	protected void method2733() throws Exception {
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(B)V")
	public final synchronized void method2734() {
		if (this.aBoolean237) {
			return;
		}
		@Pc(12) long local12 = Static476.method6413();
		try {
			if (local12 > this.aLong97 + 6000L) {
				this.aLong97 = local12 - 6000L;
			}
			while (local12 > this.aLong97 + 5000L) {
				this.method2742();
				this.aLong97 += 256000 / Static283.anInt7446;
				local12 = Static476.method6413();
			}
		} catch (@Pc(59) Exception local59) {
			this.aLong97 = local12;
		}
		if (this.anIntArray215 == null) {
			return;
		}
		try {
			if (this.aLong98 != 0L) {
				if (local12 < this.aLong98) {
					return;
				}
				this.method2748(this.anInt3251);
				this.aBoolean238 = true;
				this.aLong98 = 0L;
			}
			@Pc(95) int local95 = this.method2744();
			if (this.anInt3255 - local95 > this.anInt3254) {
				this.anInt3254 = this.anInt3255 - local95;
			}
			@Pc(116) int local116 = this.anInt3256 + this.anInt3252;
			if (local116 + 256 > 16384) {
				local116 = 16128;
			}
			if (local116 + 256 > this.anInt3251) {
				this.anInt3251 += 1024;
				if (this.anInt3251 > 16384) {
					this.anInt3251 = 16384;
				}
				this.method2743();
				this.method2748(this.anInt3251);
				local95 = 0;
				this.aBoolean238 = true;
				if (this.anInt3251 < local116 + 256) {
					local116 = this.anInt3251 - 256;
					this.anInt3256 = local116 - this.anInt3252;
				}
			}
			while (local116 > local95) {
				this.method2739(this.anIntArray215);
				this.method2733();
				local95 += 256;
			}
			if (this.aLong99 < local12) {
				if (this.aBoolean238) {
					this.aBoolean238 = false;
				} else if (this.anInt3254 == 0 && this.anInt3253 == 0) {
					this.method2743();
					this.aLong98 = local12 + 2000L;
					return;
				} else {
					this.anInt3256 = Math.min(this.anInt3253, this.anInt3254);
					this.anInt3253 = this.anInt3254;
				}
				this.anInt3254 = 0;
				this.aLong99 = local12 + 2000L;
			}
			this.anInt3255 = local95;
		} catch (@Pc(255) Exception local255) {
			this.method2743();
			this.aLong98 = local12 + 2000L;
		}
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(ILclient!ua;B)V")
	private void method2735(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub13 arg1) {
		@Pc(7) int local7 = arg0 >> 5;
		@Pc(18) Class2_Sub13 local18 = this.aClass2_Sub13Array5[local7];
		if (local18 == null) {
			this.aClass2_Sub13Array6[local7] = arg1;
		} else {
			local18.aClass2_Sub13_9 = arg1;
		}
		this.aClass2_Sub13Array5[local7] = arg1;
		arg1.anInt9776 = arg0;
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(BLclient!ua;)V")
	public final synchronized void method2738(@OriginalArg(1) Class2_Sub13 arg0) {
		this.aClass2_Sub13_5 = arg0;
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "([II)V")
	private void method2739(@OriginalArg(0) int[] arg0) {
		@Pc(1) short local1 = 256;
		if (Static452.aBoolean540) {
			local1 = 512;
		}
		Static653.method5392(arg0, 0, local1);
		this.anInt3257 -= 256;
		if (this.aClass2_Sub13_5 != null && this.anInt3257 <= 0) {
			this.anInt3257 += Static283.anInt7446 >> 4;
			Static438.method6016(this.aClass2_Sub13_5);
			this.method2735(this.aClass2_Sub13_5.method8177(), this.aClass2_Sub13_5);
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
						@Pc(88) Class2_Sub13 local88 = null;
						@Pc(93) Class2_Sub13 local93 = this.aClass2_Sub13Array6[local56];
						label97: while (true) {
							while (true) {
								if (local93 == null) {
									break label97;
								}
								@Pc(97) Class2_Sub1 local97 = local93.aClass2_Sub1_6;
								if (local97 == null || local97.anInt13 <= local61) {
									local93.aBoolean719 = true;
									@Pc(121) int local121 = local93.method8175();
									local45 += local121;
									if (local97 != null) {
										local97.anInt13 += local121;
									}
									if (local45 >= this.anInt3236) {
										break label103;
									}
									@Pc(140) Class2_Sub13 local140 = local93.method8178();
									if (local140 != null) {
										@Pc(145) int local145 = local93.anInt9776;
										while (local140 != null) {
											this.method2735(local145 * local140.method8177() >> 8, local140);
											local140 = local93.method8174();
										}
									}
									@Pc(164) Class2_Sub13 local164 = local93.aClass2_Sub13_9;
									local93.aClass2_Sub13_9 = null;
									if (local88 == null) {
										this.aClass2_Sub13Array6[local56] = local164;
									} else {
										local88.aClass2_Sub13_9 = local164;
									}
									if (local164 == null) {
										this.aClass2_Sub13Array5[local56] = local88;
									}
									local93 = local164;
								} else {
									local47 |= 0x1 << local56;
									local88 = local93;
									local93 = local93.aClass2_Sub13_9;
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
				@Pc(207) Class2_Sub13 local207 = this.aClass2_Sub13Array6[local56];
				this.aClass2_Sub13Array6[local56] = this.aClass2_Sub13Array5[local56] = null;
				while (local207 != null) {
					@Pc(221) Class2_Sub13 local221 = local207.aClass2_Sub13_9;
					local207.aClass2_Sub13_9 = null;
					local207 = local221;
				}
			}
		}
		if (this.anInt3257 < 0) {
			this.anInt3257 = 0;
		}
		if (this.aClass2_Sub13_5 != null) {
			this.aClass2_Sub13_5.method8180(arg0, 0, 256);
		}
		this.aLong97 = Static476.method6413();
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(I)V")
	public final synchronized void method2740() {
		if (Static341.aClass90_1 != null) {
			@Pc(15) boolean local15 = true;
			for (@Pc(17) int local17 = 0; local17 < 2; local17++) {
				if (Static341.aClass90_1.aClass35Array1[local17] == this) {
					Static341.aClass90_1.aClass35Array1[local17] = null;
				}
				if (Static341.aClass90_1.aClass35Array1[local17] != null) {
					local15 = false;
				}
			}
			if (local15) {
				Static341.aClass90_1.aBoolean165 = true;
				while (Static341.aClass90_1.aBoolean166) {
					Static444.method6061(50L);
				}
				Static341.aClass90_1 = null;
			}
		}
		this.method2743();
		this.aBoolean237 = true;
		this.anIntArray215 = null;
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(Ljava/awt/Component;)V")
	public void method2741(@OriginalArg(0) Component arg0) throws Exception {
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(ZI)V")
	private void method2742() {
		this.anInt3257 -= 256;
		if (this.anInt3257 < 0) {
			this.anInt3257 = 0;
		}
		if (this.aClass2_Sub13_5 != null) {
			this.aClass2_Sub13_5.method8176(256);
		}
	}

	@OriginalMember(owner = "client!hh", name = "b", descriptor = "()V")
	protected void method2743() {
	}

	@OriginalMember(owner = "client!hh", name = "c", descriptor = "()I")
	protected int method2744() throws Exception {
		return this.anInt3251;
	}

	@OriginalMember(owner = "client!hh", name = "d", descriptor = "()V")
	protected void method2747() throws Exception {
	}

	@OriginalMember(owner = "client!hh", name = "b", descriptor = "(I)V")
	public void method2748(@OriginalArg(0) int arg0) throws Exception {
	}

	@OriginalMember(owner = "client!hh", name = "b", descriptor = "(B)V")
	public final synchronized void method2749() {
		this.aBoolean238 = true;
		try {
			this.method2747();
		} catch (@Pc(16) Exception local16) {
			this.method2743();
			this.aLong98 = Static476.method6413() + 2000L;
		}
	}
}
