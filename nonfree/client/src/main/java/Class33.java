import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bm")
public class Class33 {

	@OriginalMember(owner = "client!bm", name = "s", descriptor = "Lclient!fga;")
	private Class3_Sub22 aClass3_Sub22_7;

	@OriginalMember(owner = "client!bm", name = "c", descriptor = "[I")
	public int[] anIntArray542;

	@OriginalMember(owner = "client!bm", name = "u", descriptor = "I")
	public int anInt9755;

	@OriginalMember(owner = "client!bm", name = "k", descriptor = "I")
	private int anInt9756;

	@OriginalMember(owner = "client!bm", name = "g", descriptor = "I")
	public int anInt9760;

	@OriginalMember(owner = "client!bm", name = "i", descriptor = "Z")
	private boolean aBoolean703 = false;

	@OriginalMember(owner = "client!bm", name = "v", descriptor = "I")
	private final int anInt9743 = 32;

	@OriginalMember(owner = "client!bm", name = "w", descriptor = "J")
	private long aLong335 = Static626.method8479();

	@OriginalMember(owner = "client!bm", name = "f", descriptor = "I")
	private int anInt9757 = 0;

	@OriginalMember(owner = "client!bm", name = "m", descriptor = "J")
	private long aLong336 = 0L;

	@OriginalMember(owner = "client!bm", name = "D", descriptor = "I")
	private int anInt9758 = 0;

	@OriginalMember(owner = "client!bm", name = "d", descriptor = "[Lclient!fga;")
	private final Class3_Sub22[] aClass3_Sub22Array5 = new Class3_Sub22[8];

	@OriginalMember(owner = "client!bm", name = "h", descriptor = "J")
	private long aLong337 = 0L;

	@OriginalMember(owner = "client!bm", name = "j", descriptor = "Z")
	private boolean aBoolean704 = true;

	@OriginalMember(owner = "client!bm", name = "F", descriptor = "[Lclient!fga;")
	private final Class3_Sub22[] aClass3_Sub22Array6 = new Class3_Sub22[8];

	@OriginalMember(owner = "client!bm", name = "E", descriptor = "I")
	private int anInt9761 = 0;

	@OriginalMember(owner = "client!bm", name = "q", descriptor = "I")
	private int anInt9759 = 0;

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(B)V")
	public final synchronized void method8228() {
		this.aBoolean704 = true;
		try {
			this.method8231();
		} catch (@Pc(14) Exception local14) {
			this.method8233();
			this.aLong336 = Static626.method8479() + 2000L;
		}
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(I)V")
	public final synchronized void method8229() {
		if (this.aBoolean703) {
			return;
		}
		@Pc(13) long local13 = Static626.method8479();
		try {
			if (local13 > this.aLong335 + 6000L) {
				this.aLong335 = local13 - 6000L;
			}
			while (local13 > this.aLong335 + 5000L) {
				this.method8234();
				this.aLong335 += (long) (256000 / Static103.anInt1658);
				local13 = Static626.method8479();
			}
		} catch (@Pc(62) Exception local62) {
			this.aLong335 = local13;
		}
		if (this.anIntArray542 == null) {
			return;
		}
		try {
			if (this.aLong336 != 0L) {
				if (local13 < this.aLong336) {
					return;
				}
				this.method8237(this.anInt9755);
				this.aBoolean704 = true;
				this.aLong336 = 0L;
			}
			@Pc(103) int local103 = this.method8235();
			if (this.anInt9759 < this.anInt9758 - local103) {
				this.anInt9759 = this.anInt9758 - local103;
			}
			@Pc(138) int local138 = this.anInt9760 + this.anInt9756;
			if (local138 + 256 > 16384) {
				local138 = 16128;
			}
			if (this.anInt9755 < local138 + 256) {
				this.anInt9755 += 1024;
				if (this.anInt9755 > 16384) {
					this.anInt9755 = 16384;
				}
				this.method8233();
				this.method8237(this.anInt9755);
				local103 = 0;
				this.aBoolean704 = true;
				if (this.anInt9755 < local138 + 256) {
					local138 = this.anInt9755 - 256;
					this.anInt9756 = local138 - this.anInt9760;
				}
			}
			while (local103 < local138) {
				this.method8241(this.anIntArray542);
				local103 += 256;
				this.method8240();
			}
			if (this.aLong337 < local13) {
				if (this.aBoolean704) {
					this.aBoolean704 = false;
				} else if (this.anInt9759 == 0 && this.anInt9757 == 0) {
					this.method8233();
					this.aLong336 = local13 + 2000L;
					return;
				} else {
					this.anInt9756 = Math.min(this.anInt9757, this.anInt9759);
					this.anInt9757 = this.anInt9759;
				}
				this.aLong337 = local13 + 2000L;
				this.anInt9759 = 0;
			}
			this.anInt9758 = local103;
		} catch (@Pc(284) Exception local284) {
			this.method8233();
			this.aLong336 = local13 + 2000L;
		}
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(IILclient!fga;)V")
	private void method8230(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub22 arg1) {
		@Pc(7) int local7 = arg0 >> 5;
		@Pc(12) Class3_Sub22 local12 = this.aClass3_Sub22Array6[local7];
		if (local12 == null) {
			this.aClass3_Sub22Array5[local7] = arg1;
		} else {
			local12.aClass3_Sub22_9 = arg1;
		}
		this.aClass3_Sub22Array6[local7] = arg1;
		arg1.anInt11137 = arg0;
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "()V")
	protected void method8231() throws Exception {
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(Lclient!fga;I)V")
	public final synchronized void method8232(@OriginalArg(0) Class3_Sub22 arg0) {
		this.aClass3_Sub22_7 = arg0;
	}

	@OriginalMember(owner = "client!bm", name = "d", descriptor = "()V")
	protected void method8233() {
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(IB)V")
	private void method8234() {
		this.anInt9761 -= 256;
		if (this.anInt9761 < 0) {
			this.anInt9761 = 0;
		}
		if (this.aClass3_Sub22_7 != null) {
			this.aClass3_Sub22_7.method9304(256);
		}
	}

	@OriginalMember(owner = "client!bm", name = "c", descriptor = "()I")
	protected int method8235() throws Exception {
		return this.anInt9755;
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(Z)V")
	public final synchronized void method8236() {
		if (Static565.aClass71_1 != null) {
			@Pc(9) boolean local9 = true;
			for (@Pc(11) int local11 = 0; local11 < 2; local11++) {
				if (Static565.aClass71_1.aClass33Array1[local11] == this) {
					Static565.aClass71_1.aClass33Array1[local11] = null;
				}
				if (Static565.aClass71_1.aClass33Array1[local11] != null) {
					local9 = false;
				}
			}
			if (local9) {
				Static565.aClass71_1.aBoolean188 = true;
				while (Static565.aClass71_1.aBoolean187) {
					Static564.method7845(50L);
				}
				Static565.aClass71_1 = null;
			}
		}
		this.method8233();
		this.anIntArray542 = null;
		this.aBoolean703 = true;
	}

	@OriginalMember(owner = "client!bm", name = "b", descriptor = "(I)V")
	public void method8237(@OriginalArg(0) int arg0) throws Exception {
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(Ljava/awt/Component;)V")
	public void method8238(@OriginalArg(0) Component arg0) throws Exception {
	}

	@OriginalMember(owner = "client!bm", name = "b", descriptor = "()V")
	protected void method8240() throws Exception {
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "([II)V")
	private void method8241(@OriginalArg(0) int[] arg0) {
		@Pc(1) short local1 = 256;
		if (Static510.aBoolean777) {
			local1 = 512;
		}
		Static735.method9188(arg0, 0, local1);
		this.anInt9761 -= 256;
		if (this.aClass3_Sub22_7 != null && this.anInt9761 <= 0) {
			this.anInt9761 += Static103.anInt1658 >> 4;
			Static549.method7770(this.aClass3_Sub22_7);
			this.method8230(this.aClass3_Sub22_7.method9306(), this.aClass3_Sub22_7);
			@Pc(47) int local47 = 0;
			@Pc(49) int local49 = 255;
			@Pc(51) int local51 = 7;
			@Pc(58) int local58;
			label103: while (local49 != 0) {
				@Pc(63) int local63;
				if (local51 < 0) {
					local58 = local51 & 0x3;
					local63 = -(local51 >> 2);
				} else {
					local58 = local51;
					local63 = 0;
				}
				for (@Pc(74) int local74 = local49 >>> local58 & 0x11111111; local74 != 0; local74 >>>= 0x4) {
					if ((local74 & 0x1) != 0) {
						local49 &= ~(0x1 << local58);
						@Pc(92) Class3_Sub22 local92 = null;
						@Pc(97) Class3_Sub22 local97 = this.aClass3_Sub22Array5[local58];
						label97: while (true) {
							while (true) {
								if (local97 == null) {
									break label97;
								}
								@Pc(101) Class3_Sub33 local101 = local97.aClass3_Sub33_6;
								if (local101 == null || local101.anInt6919 <= local63) {
									local97.aBoolean804 = true;
									@Pc(127) int local127 = local97.method9307();
									local47 += local127;
									if (local101 != null) {
										local101.anInt6919 += local127;
									}
									if (local47 >= this.anInt9743) {
										break label103;
									}
									@Pc(148) Class3_Sub22 local148 = local97.method9305();
									if (local148 != null) {
										@Pc(153) int local153 = local97.anInt11137;
										while (local148 != null) {
											this.method8230(local153 * local148.method9306() >> 8, local148);
											local148 = local97.method9303();
										}
									}
									@Pc(172) Class3_Sub22 local172 = local97.aClass3_Sub22_9;
									local97.aClass3_Sub22_9 = null;
									if (local92 == null) {
										this.aClass3_Sub22Array5[local58] = local172;
									} else {
										local92.aClass3_Sub22_9 = local172;
									}
									if (local172 == null) {
										this.aClass3_Sub22Array6[local58] = local92;
									}
									local97 = local172;
								} else {
									local49 |= 0x1 << local58;
									local92 = local97;
									local97 = local97.aClass3_Sub22_9;
								}
							}
						}
					}
					local58 += 4;
					local63++;
				}
				local51--;
			}
			for (local58 = 0; local58 < 8; local58++) {
				@Pc(218) Class3_Sub22 local218 = this.aClass3_Sub22Array5[local58];
				this.aClass3_Sub22Array5[local58] = this.aClass3_Sub22Array6[local58] = null;
				while (local218 != null) {
					@Pc(232) Class3_Sub22 local232 = local218.aClass3_Sub22_9;
					local218.aClass3_Sub22_9 = null;
					local218 = local232;
				}
			}
		}
		if (this.anInt9761 < 0) {
			this.anInt9761 = 0;
		}
		if (this.aClass3_Sub22_7 != null) {
			this.aClass3_Sub22_7.method9302(arg0, 0, 256);
		}
		this.aLong335 = Static626.method8479();
	}
}
