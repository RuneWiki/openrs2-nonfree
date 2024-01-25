import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hp")
public class Class112 {

	@OriginalMember(owner = "client!hp", name = "c", descriptor = "[I")
	public int[] anIntArray471;

	@OriginalMember(owner = "client!hp", name = "e", descriptor = "Lclient!sd;")
	private Class14_Sub5 aClass14_Sub5_6;

	@OriginalMember(owner = "client!hp", name = "D", descriptor = "I")
	private int anInt6565;

	@OriginalMember(owner = "client!hp", name = "E", descriptor = "I")
	public int anInt6566;

	@OriginalMember(owner = "client!hp", name = "G", descriptor = "I")
	public int anInt6567;

	@OriginalMember(owner = "client!hp", name = "d", descriptor = "I")
	private final int anInt6548 = 32;

	@OriginalMember(owner = "client!hp", name = "t", descriptor = "Z")
	private boolean aBoolean461 = false;

	@OriginalMember(owner = "client!hp", name = "o", descriptor = "J")
	private long aLong179 = Static521.method7499();

	@OriginalMember(owner = "client!hp", name = "w", descriptor = "I")
	private int anInt6562 = 0;

	@OriginalMember(owner = "client!hp", name = "A", descriptor = "I")
	private int anInt6563 = 0;

	@OriginalMember(owner = "client!hp", name = "x", descriptor = "Z")
	private boolean aBoolean462 = true;

	@OriginalMember(owner = "client!hp", name = "y", descriptor = "[Lclient!sd;")
	private final Class14_Sub5[] aClass14_Sub5Array5 = new Class14_Sub5[8];

	@OriginalMember(owner = "client!hp", name = "B", descriptor = "J")
	private long aLong181 = 0L;

	@OriginalMember(owner = "client!hp", name = "z", descriptor = "J")
	private long aLong180 = 0L;

	@OriginalMember(owner = "client!hp", name = "C", descriptor = "I")
	private int anInt6564 = 0;

	@OriginalMember(owner = "client!hp", name = "F", descriptor = "[Lclient!sd;")
	private final Class14_Sub5[] aClass14_Sub5Array6 = new Class14_Sub5[8];

	@OriginalMember(owner = "client!hp", name = "H", descriptor = "I")
	private int anInt6568 = 0;

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(ILclient!sd;)V")
	public final synchronized void method5376(@OriginalArg(1) Class14_Sub5 arg0) {
		this.aClass14_Sub5_6 = arg0;
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(I)V")
	public final synchronized void method5377() {
		if (this.aBoolean461) {
			return;
		}
		@Pc(12) long local12 = Static521.method7499();
		try {
			if (local12 > this.aLong179 + 6000L) {
				this.aLong179 = local12 - 6000L;
			}
			while (this.aLong179 + 5000L < local12) {
				this.method5387();
				this.aLong179 += (long) (256000 / Static515.anInt9036);
				local12 = Static521.method7499();
			}
		} catch (@Pc(55) Exception local55) {
			this.aLong179 = local12;
		}
		if (this.anIntArray471 == null) {
			return;
		}
		try {
			if (this.aLong181 != 0L) {
				if (this.aLong181 > local12) {
					return;
				}
				this.method5386(this.anInt6567);
				this.aLong181 = 0L;
				this.aBoolean462 = true;
			}
			@Pc(97) int local97 = this.method5378();
			if (this.anInt6564 - local97 > this.anInt6562) {
				this.anInt6562 = this.anInt6564 - local97;
			}
			@Pc(122) int local122 = this.anInt6565 + this.anInt6566;
			if (local122 + 256 > 16384) {
				local122 = 16128;
			}
			if (local122 + 256 > this.anInt6567) {
				this.anInt6567 += 1024;
				if (this.anInt6567 > 16384) {
					this.anInt6567 = 16384;
				}
				this.method5382();
				local97 = 0;
				this.method5386(this.anInt6567);
				this.aBoolean462 = true;
				if (this.anInt6567 < local122 + 256) {
					local122 = this.anInt6567 - 256;
					this.anInt6565 = local122 - this.anInt6566;
				}
			}
			while (local122 > local97) {
				this.method5380(this.anIntArray471);
				this.method5379();
				local97 += 256;
			}
			if (local12 > this.aLong180) {
				if (this.aBoolean462) {
					this.aBoolean462 = false;
				} else if (this.anInt6562 == 0 && this.anInt6568 == 0) {
					this.method5382();
					this.aLong181 = local12 + 2000L;
					return;
				} else {
					this.anInt6565 = Math.min(this.anInt6568, this.anInt6562);
					this.anInt6568 = this.anInt6562;
				}
				this.aLong180 = local12 + 2000L;
				this.anInt6562 = 0;
			}
			this.anInt6564 = local97;
		} catch (@Pc(258) Exception local258) {
			this.method5382();
			this.aLong181 = local12 + 2000L;
		}
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "()I")
	protected int method5378() throws Exception {
		return this.anInt6567;
	}

	@OriginalMember(owner = "client!hp", name = "b", descriptor = "()V")
	protected void method5379() throws Exception {
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "([II)V")
	private void method5380(@OriginalArg(0) int[] arg0) {
		@Pc(1) short local1 = 256;
		if (Static40.aBoolean129) {
			local1 = 512;
		}
		Static681.method2480(arg0, 0, local1);
		this.anInt6563 -= 256;
		if (this.aClass14_Sub5_6 != null && this.anInt6563 <= 0) {
			this.anInt6563 += Static515.anInt9036 >> 4;
			Static452.method6559(this.aClass14_Sub5_6);
			this.method5388(this.aClass14_Sub5_6.method8689(), this.aClass14_Sub5_6);
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
						@Pc(88) Class14_Sub5 local88 = null;
						@Pc(93) Class14_Sub5 local93 = this.aClass14_Sub5Array6[local56];
						label97: while (true) {
							while (true) {
								if (local93 == null) {
									break label97;
								}
								@Pc(97) Class14_Sub14 local97 = local93.aClass14_Sub14_6;
								if (local97 == null || local97.anInt2148 <= local61) {
									local93.aBoolean727 = true;
									@Pc(121) int local121 = local93.method8687();
									local45 += local121;
									if (local97 != null) {
										local97.anInt2148 += local121;
									}
									if (local45 >= this.anInt6548) {
										break label103;
									}
									@Pc(140) Class14_Sub5 local140 = local93.method8691();
									if (local140 != null) {
										@Pc(145) int local145 = local93.anInt10416;
										while (local140 != null) {
											this.method5388(local145 * local140.method8689() >> 8, local140);
											local140 = local93.method8692();
										}
									}
									@Pc(164) Class14_Sub5 local164 = local93.aClass14_Sub5_9;
									local93.aClass14_Sub5_9 = null;
									if (local88 == null) {
										this.aClass14_Sub5Array6[local56] = local164;
									} else {
										local88.aClass14_Sub5_9 = local164;
									}
									if (local164 == null) {
										this.aClass14_Sub5Array5[local56] = local88;
									}
									local93 = local164;
								} else {
									local47 |= 0x1 << local56;
									local88 = local93;
									local93 = local93.aClass14_Sub5_9;
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
				@Pc(207) Class14_Sub5 local207 = this.aClass14_Sub5Array6[local56];
				this.aClass14_Sub5Array6[local56] = this.aClass14_Sub5Array5[local56] = null;
				while (local207 != null) {
					@Pc(221) Class14_Sub5 local221 = local207.aClass14_Sub5_9;
					local207.aClass14_Sub5_9 = null;
					local207 = local221;
				}
			}
		}
		if (this.anInt6563 < 0) {
			this.anInt6563 = 0;
		}
		if (this.aClass14_Sub5_6 != null) {
			this.aClass14_Sub5_6.method8693(arg0, 0, 256);
		}
		this.aLong179 = Static521.method7499();
	}

	@OriginalMember(owner = "client!hp", name = "c", descriptor = "()V")
	protected void method5382() {
	}

	@OriginalMember(owner = "client!hp", name = "d", descriptor = "()V")
	protected void method5383() throws Exception {
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(Ljava/awt/Component;)V")
	public void method5384(@OriginalArg(0) Component arg0) throws Exception {
	}

	@OriginalMember(owner = "client!hp", name = "b", descriptor = "(I)V")
	public void method5386(@OriginalArg(0) int arg0) throws Exception {
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(IB)V")
	private void method5387() {
		this.anInt6563 -= 256;
		if (this.anInt6563 < 0) {
			this.anInt6563 = 0;
		}
		if (this.aClass14_Sub5_6 != null) {
			this.aClass14_Sub5_6.method8688(256);
		}
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(ILclient!sd;I)V")
	private void method5388(@OriginalArg(0) int arg0, @OriginalArg(1) Class14_Sub5 arg1) {
		@Pc(10) int local10 = arg0 >> 5;
		@Pc(15) Class14_Sub5 local15 = this.aClass14_Sub5Array5[local10];
		if (local15 == null) {
			this.aClass14_Sub5Array6[local10] = arg1;
		} else {
			local15.aClass14_Sub5_9 = arg1;
		}
		this.aClass14_Sub5Array5[local10] = arg1;
		arg1.anInt10416 = arg0;
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(Z)V")
	public final synchronized void method5389() {
		this.aBoolean462 = true;
		try {
			this.method5383();
		} catch (@Pc(17) Exception local17) {
			this.method5382();
			this.aLong181 = Static521.method7499() + 2000L;
		}
	}

	@OriginalMember(owner = "client!hp", name = "d", descriptor = "(I)V")
	public final synchronized void method5391() {
		if (Static302.aClass56_7 != null) {
			@Pc(9) boolean local9 = true;
			for (@Pc(11) int local11 = 0; local11 < 2; local11++) {
				if (Static302.aClass56_7.aClass112Array1[local11] == this) {
					Static302.aClass56_7.aClass112Array1[local11] = null;
				}
				if (Static302.aClass56_7.aClass112Array1[local11] != null) {
					local9 = false;
				}
			}
			if (local9) {
				Static302.aClass56_7.aBoolean125 = true;
				while (Static302.aClass56_7.aBoolean124) {
					Static20.method9254(50L);
				}
				Static302.aClass56_7 = null;
			}
		}
		this.method5382();
		this.anIntArray471 = null;
		this.aBoolean461 = true;
	}
}
