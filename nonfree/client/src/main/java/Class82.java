import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vf")
public class Class82 {

	@OriginalMember(owner = "client!vf", name = "u", descriptor = "[I")
	public int[] anIntArray403;

	@OriginalMember(owner = "client!vf", name = "y", descriptor = "Lclient!nb;")
	private Class2_Sub5 aClass2_Sub5_7;

	@OriginalMember(owner = "client!vf", name = "B", descriptor = "I")
	public int anInt3714;

	@OriginalMember(owner = "client!vf", name = "D", descriptor = "I")
	public int anInt3715;

	@OriginalMember(owner = "client!vf", name = "I", descriptor = "I")
	private int anInt3719;

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "I")
	private final int anInt3694 = 32;

	@OriginalMember(owner = "client!vf", name = "h", descriptor = "J")
	private long aLong133 = Static29.method615();

	@OriginalMember(owner = "client!vf", name = "E", descriptor = "I")
	private int anInt3716 = 0;

	@OriginalMember(owner = "client!vf", name = "F", descriptor = "I")
	private int anInt3717 = 0;

	@OriginalMember(owner = "client!vf", name = "C", descriptor = "J")
	private long aLong134 = 0L;

	@OriginalMember(owner = "client!vf", name = "A", descriptor = "[Lclient!nb;")
	private final Class2_Sub5[] aClass2_Sub5Array5 = new Class2_Sub5[8];

	@OriginalMember(owner = "client!vf", name = "G", descriptor = "I")
	private int anInt3718 = 0;

	@OriginalMember(owner = "client!vf", name = "J", descriptor = "I")
	private int anInt3720 = 0;

	@OriginalMember(owner = "client!vf", name = "K", descriptor = "J")
	private long aLong135 = 0L;

	@OriginalMember(owner = "client!vf", name = "L", descriptor = "[Lclient!nb;")
	private final Class2_Sub5[] aClass2_Sub5Array6 = new Class2_Sub5[8];

	@OriginalMember(owner = "client!vf", name = "H", descriptor = "Z")
	private boolean aBoolean164 = true;

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "()I")
	protected int method2629() throws Exception {
		return this.anInt3714;
	}

	@OriginalMember(owner = "client!vf", name = "b", descriptor = "()V")
	protected void method2630() throws Exception {
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(Ljava/awt/Component;)V")
	public void method2631(@OriginalArg(0) Component arg0) throws Exception {
	}

	@OriginalMember(owner = "client!vf", name = "c", descriptor = "()V")
	protected void method2632() throws Exception {
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(Z)V")
	public final synchronized void method2633() {
		if (this.anIntArray403 == null) {
			return;
		}
		@Pc(18) long local18 = Static29.method615();
		try {
			if (this.aLong135 != 0L) {
				if (local18 < this.aLong135) {
					return;
				}
				this.method2640(this.anInt3714);
				this.aLong135 = 0L;
				this.aBoolean164 = true;
			}
			@Pc(44) int local44 = this.method2629();
			if (this.anInt3720 - local44 > this.anInt3717) {
				this.anInt3717 = this.anInt3720 - local44;
			}
			@Pc(68) int local68 = this.anInt3719 + this.anInt3715;
			if (local68 + 256 > 16384) {
				local68 = 16128;
			}
			if (this.anInt3714 < local68 + 256) {
				local44 = 0;
				this.anInt3714 += 1024;
				if (this.anInt3714 > 16384) {
					this.anInt3714 = 16384;
				}
				this.method2643();
				this.method2640(this.anInt3714);
				if (this.anInt3714 < local68 + 256) {
					local68 = this.anInt3714 - 256;
					this.anInt3719 = local68 - this.anInt3715;
				}
				this.aBoolean164 = true;
			}
			while (local44 < local68) {
				this.method2639(this.anIntArray403);
				local44 += 256;
				this.method2630();
			}
			if (this.aLong134 < local18) {
				if (this.aBoolean164) {
					this.aBoolean164 = false;
				} else if (this.anInt3717 == 0 && this.anInt3716 == 0) {
					this.method2643();
					this.aLong135 = local18 + 2000L;
					return;
				} else {
					this.anInt3719 = Math.min(this.anInt3716, this.anInt3717);
					this.anInt3716 = this.anInt3717;
				}
				this.aLong134 = local18 + 2000L;
				this.anInt3717 = 0;
			}
			this.anInt3720 = local44;
		} catch (@Pc(197) Exception local197) {
			this.method2643();
			this.aLong135 = local18 + 2000L;
		}
		try {
			if (local18 > this.aLong133 + 500000L) {
				local18 = this.aLong133;
			}
			while (local18 > this.aLong133 + 5000L) {
				this.method2642();
				this.aLong133 += 256000 / Static45.anInt1131;
			}
		} catch (@Pc(242) Exception local242) {
			this.aLong133 = local18;
		}
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(B)V")
	public final synchronized void method2636() {
		this.aBoolean164 = true;
		try {
			this.method2632();
		} catch (@Pc(12) Exception local12) {
			this.method2643();
			this.aLong135 = Static29.method615() + 2000L;
		}
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(Lclient!nb;IB)V")
	private void method2637(@OriginalArg(0) Class2_Sub5 arg0, @OriginalArg(1) int arg1) {
		@Pc(7) int local7 = arg1 >> 5;
		@Pc(12) Class2_Sub5 local12 = this.aClass2_Sub5Array6[local7];
		if (local12 == null) {
			this.aClass2_Sub5Array5[local7] = arg0;
		} else {
			local12.aClass2_Sub5_8 = arg0;
		}
		this.aClass2_Sub5Array6[local7] = arg0;
		arg0.anInt3727 = arg1;
	}

	@OriginalMember(owner = "client!vf", name = "b", descriptor = "(Z)V")
	public final void method2638() {
		this.aBoolean164 = true;
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "([II)V")
	private void method2639(@OriginalArg(0) int[] arg0) {
		@Pc(1) short local1 = 256;
		if (Static128.aBoolean130) {
			local1 = 512;
		}
		Static182.method1346(arg0, 0, local1);
		this.anInt3718 -= 256;
		if (this.aClass2_Sub5_7 != null && this.anInt3718 <= 0) {
			this.anInt3718 += Static45.anInt1131 >> 4;
			Static1.method5(this.aClass2_Sub5_7);
			this.method2637(this.aClass2_Sub5_7, this.aClass2_Sub5_7.method2656());
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
						@Pc(88) Class2_Sub5 local88 = null;
						@Pc(93) Class2_Sub5 local93 = this.aClass2_Sub5Array5[local56];
						label97: while (true) {
							while (true) {
								if (local93 == null) {
									break label97;
								}
								@Pc(97) Class2_Sub10 local97 = local93.aClass2_Sub10_5;
								if (local97 == null || local97.anInt1796 <= local61) {
									local93.aBoolean165 = true;
									@Pc(121) int local121 = local93.method2657();
									local45 += local121;
									if (local97 != null) {
										local97.anInt1796 += local121;
									}
									if (local45 >= this.anInt3694) {
										break label103;
									}
									@Pc(140) Class2_Sub5 local140 = local93.method2652();
									if (local140 != null) {
										@Pc(145) int local145 = local93.anInt3727;
										while (local140 != null) {
											this.method2637(local140, local145 * local140.method2656() >> 8);
											local140 = local93.method2655();
										}
									}
									@Pc(164) Class2_Sub5 local164 = local93.aClass2_Sub5_8;
									local93.aClass2_Sub5_8 = null;
									if (local88 == null) {
										this.aClass2_Sub5Array5[local56] = local164;
									} else {
										local88.aClass2_Sub5_8 = local164;
									}
									if (local164 == null) {
										this.aClass2_Sub5Array6[local56] = local88;
									}
									local93 = local164;
								} else {
									local47 |= 0x1 << local56;
									local88 = local93;
									local93 = local93.aClass2_Sub5_8;
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
				@Pc(207) Class2_Sub5 local207 = this.aClass2_Sub5Array5[local56];
				this.aClass2_Sub5Array5[local56] = this.aClass2_Sub5Array6[local56] = null;
				while (local207 != null) {
					@Pc(221) Class2_Sub5 local221 = local207.aClass2_Sub5_8;
					local207.aClass2_Sub5_8 = null;
					local207 = local221;
				}
			}
		}
		if (this.anInt3718 < 0) {
			this.anInt3718 = 0;
		}
		if (this.aClass2_Sub5_7 != null) {
			this.aClass2_Sub5_7.method2651(arg0, 0, 256);
		}
		this.aLong133 = Static29.method615();
	}

	@OriginalMember(owner = "client!vf", name = "b", descriptor = "(I)V")
	public void method2640(@OriginalArg(0) int arg0) throws Exception {
	}

	@OriginalMember(owner = "client!vf", name = "b", descriptor = "(B)V")
	public final synchronized void method2641() {
		if (Static160.aClass9_1 != null) {
			@Pc(10) boolean local10 = true;
			for (@Pc(12) int local12 = 0; local12 < 2; local12++) {
				if (Static160.aClass9_1.aClass82Array1[local12] == this) {
					Static160.aClass9_1.aClass82Array1[local12] = null;
				}
				if (Static160.aClass9_1.aClass82Array1[local12] != null) {
					local10 = false;
				}
			}
			if (local10) {
				Static160.aClass9_1.aBoolean20 = true;
				while (Static160.aClass9_1.aBoolean19) {
					Static50.method927(50L);
				}
				Static160.aClass9_1 = null;
			}
		}
		this.method2643();
		this.anIntArray403 = null;
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(II)V")
	private void method2642() {
		this.anInt3718 -= 256;
		if (this.anInt3718 < 0) {
			this.anInt3718 = 0;
		}
		if (this.aClass2_Sub5_7 != null) {
			this.aClass2_Sub5_7.method2653(256);
		}
	}

	@OriginalMember(owner = "client!vf", name = "d", descriptor = "()V")
	protected void method2643() {
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(BLclient!nb;)V")
	public final synchronized void method2644(@OriginalArg(1) Class2_Sub5 arg0) {
		this.aClass2_Sub5_7 = arg0;
	}
}
