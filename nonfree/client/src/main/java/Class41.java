import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!br")
public class Class41 {

	@OriginalMember(owner = "client!br", name = "e", descriptor = "[I")
	public int[] anIntArray510;

	@OriginalMember(owner = "client!br", name = "s", descriptor = "Lclient!pp;")
	private Class3_Sub12 aClass3_Sub12_7;

	@OriginalMember(owner = "client!br", name = "x", descriptor = "I")
	public int anInt9438;

	@OriginalMember(owner = "client!br", name = "A", descriptor = "I")
	private int anInt9440;

	@OriginalMember(owner = "client!br", name = "J", descriptor = "I")
	public int anInt9444;

	@OriginalMember(owner = "client!br", name = "w", descriptor = "Z")
	private boolean aBoolean655 = false;

	@OriginalMember(owner = "client!br", name = "u", descriptor = "I")
	private final int anInt9436 = 32;

	@OriginalMember(owner = "client!br", name = "j", descriptor = "J")
	private long aLong265 = Static15.method380();

	@OriginalMember(owner = "client!br", name = "y", descriptor = "I")
	private int anInt9439 = 0;

	@OriginalMember(owner = "client!br", name = "z", descriptor = "Z")
	private boolean aBoolean656 = true;

	@OriginalMember(owner = "client!br", name = "B", descriptor = "J")
	private long aLong266 = 0L;

	@OriginalMember(owner = "client!br", name = "G", descriptor = "[Lclient!pp;")
	private final Class3_Sub12[] aClass3_Sub12Array6 = new Class3_Sub12[8];

	@OriginalMember(owner = "client!br", name = "D", descriptor = "J")
	private long aLong267 = 0L;

	@OriginalMember(owner = "client!br", name = "F", descriptor = "[Lclient!pp;")
	private final Class3_Sub12[] aClass3_Sub12Array5 = new Class3_Sub12[8];

	@OriginalMember(owner = "client!br", name = "H", descriptor = "I")
	private int anInt9442 = 0;

	@OriginalMember(owner = "client!br", name = "E", descriptor = "I")
	private int anInt9441 = 0;

	@OriginalMember(owner = "client!br", name = "I", descriptor = "I")
	private int anInt9443 = 0;

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(I)V")
	public void method7693(@OriginalArg(0) int arg0) throws Exception {
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "()I")
	protected int method7694() throws Exception {
		return this.anInt9444;
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "([II)V")
	private void method7695(@OriginalArg(0) int[] arg0) {
		@Pc(1) short local1 = 256;
		if (Static608.aBoolean713) {
			local1 = 512;
		}
		Static681.method4030(arg0, 0, local1);
		this.anInt9439 -= 256;
		if (this.aClass3_Sub12_7 != null && this.anInt9439 <= 0) {
			this.anInt9439 += Static16.anInt10139 >> 4;
			Static28.method627(this.aClass3_Sub12_7);
			this.method7702(this.aClass3_Sub12_7, this.aClass3_Sub12_7.method8943());
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
						@Pc(88) Class3_Sub12 local88 = null;
						@Pc(93) Class3_Sub12 local93 = this.aClass3_Sub12Array6[local56];
						label97: while (true) {
							while (true) {
								if (local93 == null) {
									break label97;
								}
								@Pc(97) Class3_Sub39 local97 = local93.aClass3_Sub39_6;
								if (local97 == null || local97.anInt7566 <= local61) {
									local93.aBoolean751 = true;
									@Pc(121) int local121 = local93.method8947();
									local45 += local121;
									if (local97 != null) {
										local97.anInt7566 += local121;
									}
									if (local45 >= this.anInt9436) {
										break label103;
									}
									@Pc(140) Class3_Sub12 local140 = local93.method8946();
									if (local140 != null) {
										@Pc(145) int local145 = local93.anInt10849;
										while (local140 != null) {
											this.method7702(local140, local145 * local140.method8943() >> 8);
											local140 = local93.method8945();
										}
									}
									@Pc(164) Class3_Sub12 local164 = local93.aClass3_Sub12_9;
									local93.aClass3_Sub12_9 = null;
									if (local88 == null) {
										this.aClass3_Sub12Array6[local56] = local164;
									} else {
										local88.aClass3_Sub12_9 = local164;
									}
									if (local164 == null) {
										this.aClass3_Sub12Array5[local56] = local88;
									}
									local93 = local164;
								} else {
									local47 |= 0x1 << local56;
									local88 = local93;
									local93 = local93.aClass3_Sub12_9;
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
				@Pc(207) Class3_Sub12 local207 = this.aClass3_Sub12Array6[local56];
				this.aClass3_Sub12Array6[local56] = this.aClass3_Sub12Array5[local56] = null;
				while (local207 != null) {
					@Pc(221) Class3_Sub12 local221 = local207.aClass3_Sub12_9;
					local207.aClass3_Sub12_9 = null;
					local207 = local221;
				}
			}
		}
		if (this.anInt9439 < 0) {
			this.anInt9439 = 0;
		}
		if (this.aClass3_Sub12_7 != null) {
			this.aClass3_Sub12_7.method8948(arg0, 0, 256);
		}
		this.aLong265 = Static15.method380();
	}

	@OriginalMember(owner = "client!br", name = "b", descriptor = "()V")
	protected void method7697() throws Exception {
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(B)V")
	public final synchronized void method7698() {
		if (this.aBoolean655) {
			return;
		}
		@Pc(12) long local12 = Static15.method380();
		try {
			if (local12 > this.aLong265 + 6000L) {
				this.aLong265 = local12 - 6000L;
			}
			while (local12 > this.aLong265 + 5000L) {
				this.method7701();
				this.aLong265 += (long) (256000 / Static16.anInt10139);
				local12 = Static15.method380();
			}
		} catch (@Pc(59) Exception local59) {
			this.aLong265 = local12;
		}
		if (this.anIntArray510 == null) {
			return;
		}
		try {
			if (this.aLong267 != 0L) {
				if (this.aLong267 > local12) {
					return;
				}
				this.method7693(this.anInt9444);
				this.aLong267 = 0L;
				this.aBoolean656 = true;
			}
			@Pc(92) int local92 = this.method7694();
			if (this.anInt9441 - local92 > this.anInt9443) {
				this.anInt9443 = this.anInt9441 - local92;
			}
			@Pc(113) int local113 = this.anInt9438 + this.anInt9440;
			if (local113 + 256 > 16384) {
				local113 = 16128;
			}
			if (local113 + 256 > this.anInt9444) {
				this.anInt9444 += 1024;
				if (this.anInt9444 > 16384) {
					this.anInt9444 = 16384;
				}
				this.method7710();
				local92 = 0;
				this.method7693(this.anInt9444);
				if (this.anInt9444 < local113 + 256) {
					local113 = this.anInt9444 - 256;
					this.anInt9440 = local113 - this.anInt9438;
				}
				this.aBoolean656 = true;
			}
			while (local113 > local92) {
				this.method7695(this.anIntArray510);
				this.method7697();
				local92 += 256;
			}
			if (this.aLong266 < local12) {
				if (this.aBoolean656) {
					this.aBoolean656 = false;
				} else if (this.anInt9443 == 0 && this.anInt9442 == 0) {
					this.method7710();
					this.aLong267 = local12 + 2000L;
					return;
				} else {
					this.anInt9440 = Math.min(this.anInt9442, this.anInt9443);
					this.anInt9442 = this.anInt9443;
				}
				this.aLong266 = local12 + 2000L;
				this.anInt9443 = 0;
			}
			this.anInt9441 = local92;
		} catch (@Pc(247) Exception local247) {
			this.method7710();
			this.aLong267 = local12 + 2000L;
		}
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(Ljava/awt/Component;)V")
	public void method7699(@OriginalArg(0) Component arg0) throws Exception {
	}

	@OriginalMember(owner = "client!br", name = "b", descriptor = "(B)V")
	public final synchronized void method7700() {
		this.aBoolean656 = true;
		try {
			this.method7705();
		} catch (@Pc(14) Exception local14) {
			this.method7710();
			this.aLong267 = Static15.method380() + 2000L;
		}
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(IZ)V")
	private void method7701() {
		this.anInt9439 -= 256;
		if (this.anInt9439 < 0) {
			this.anInt9439 = 0;
		}
		if (this.aClass3_Sub12_7 != null) {
			this.aClass3_Sub12_7.method8942(256);
		}
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(Lclient!pp;ZI)V")
	private void method7702(@OriginalArg(0) Class3_Sub12 arg0, @OriginalArg(2) int arg1) {
		@Pc(11) int local11 = arg1 >> 5;
		@Pc(16) Class3_Sub12 local16 = this.aClass3_Sub12Array5[local11];
		if (local16 == null) {
			this.aClass3_Sub12Array6[local11] = arg0;
		} else {
			local16.aClass3_Sub12_9 = arg0;
		}
		this.aClass3_Sub12Array5[local11] = arg0;
		arg0.anInt10849 = arg1;
	}

	@OriginalMember(owner = "client!br", name = "d", descriptor = "()V")
	protected void method7705() throws Exception {
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(ILclient!pp;)V")
	public final synchronized void method7708(@OriginalArg(1) Class3_Sub12 arg0) {
		this.aClass3_Sub12_7 = arg0;
	}

	@OriginalMember(owner = "client!br", name = "b", descriptor = "(I)V")
	public final synchronized void method7709() {
		if (Static443.aClass274_1 != null) {
			@Pc(9) boolean local9 = true;
			for (@Pc(11) int local11 = 0; local11 < 2; local11++) {
				if (Static443.aClass274_1.aClass41Array1[local11] == this) {
					Static443.aClass274_1.aClass41Array1[local11] = null;
				}
				if (Static443.aClass274_1.aClass41Array1[local11] != null) {
					local9 = false;
				}
			}
			if (local9) {
				Static443.aClass274_1.aBoolean511 = true;
				while (Static443.aClass274_1.aBoolean512) {
					Static26.method592(50L);
				}
				Static443.aClass274_1 = null;
			}
		}
		this.method7710();
		this.anIntArray510 = null;
		this.aBoolean655 = true;
	}

	@OriginalMember(owner = "client!br", name = "e", descriptor = "()V")
	protected void method7710() {
	}
}
