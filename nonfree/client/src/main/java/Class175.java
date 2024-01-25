import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jq")
public class Class175 {

	@OriginalMember(owner = "client!jq", name = "z", descriptor = "[I")
	public int[] anIntArray305;

	@OriginalMember(owner = "client!jq", name = "g", descriptor = "Lclient!fq;")
	private Class5_Sub16 aClass5_Sub16_6;

	@OriginalMember(owner = "client!jq", name = "m", descriptor = "I")
	private int anInt5481;

	@OriginalMember(owner = "client!jq", name = "s", descriptor = "I")
	public int anInt5482;

	@OriginalMember(owner = "client!jq", name = "l", descriptor = "I")
	public int anInt5484;

	@OriginalMember(owner = "client!jq", name = "h", descriptor = "I")
	private final int anInt5463 = 32;

	@OriginalMember(owner = "client!jq", name = "A", descriptor = "Z")
	private boolean aBoolean421 = false;

	@OriginalMember(owner = "client!jq", name = "t", descriptor = "J")
	private long aLong166 = Static515.method7499(71);

	@OriginalMember(owner = "client!jq", name = "v", descriptor = "I")
	private int anInt5479 = 0;

	@OriginalMember(owner = "client!jq", name = "p", descriptor = "J")
	private long aLong167 = 0L;

	@OriginalMember(owner = "client!jq", name = "q", descriptor = "I")
	private int anInt5483 = 0;

	@OriginalMember(owner = "client!jq", name = "E", descriptor = "I")
	private int anInt5480 = 0;

	@OriginalMember(owner = "client!jq", name = "d", descriptor = "I")
	private int anInt5478 = 0;

	@OriginalMember(owner = "client!jq", name = "w", descriptor = "[Lclient!fq;")
	private final Class5_Sub16[] aClass5_Sub16Array5 = new Class5_Sub16[8];

	@OriginalMember(owner = "client!jq", name = "e", descriptor = "J")
	private long aLong168 = 0L;

	@OriginalMember(owner = "client!jq", name = "G", descriptor = "Z")
	private boolean aBoolean422 = true;

	@OriginalMember(owner = "client!jq", name = "u", descriptor = "[Lclient!fq;")
	private final Class5_Sub16[] aClass5_Sub16Array6 = new Class5_Sub16[8];

	@OriginalMember(owner = "client!jq", name = "c", descriptor = "()V")
	protected void method4693() throws Exception {
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(ILclient!fq;B)V")
	private void method4694(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub16 arg1) {
		@Pc(7) int local7 = arg0 >> 5;
		@Pc(12) Class5_Sub16 local12 = this.aClass5_Sub16Array6[local7];
		if (local12 == null) {
			this.aClass5_Sub16Array5[local7] = arg1;
		} else {
			local12.aClass5_Sub16_9 = arg1;
		}
		this.aClass5_Sub16Array6[local7] = arg1;
		arg1.anInt10155 = arg0;
	}

	@OriginalMember(owner = "client!jq", name = "b", descriptor = "(B)V")
	public final synchronized void method4695() {
		this.aBoolean422 = true;
		try {
			this.method4693();
		} catch (@Pc(17) Exception local17) {
			this.method4696();
			this.aLong167 = Static515.method7499(80) + 2000L;
		}
	}

	@OriginalMember(owner = "client!jq", name = "d", descriptor = "()V")
	protected void method4696() {
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(Ljava/awt/Component;)V")
	public void method4697(@OriginalArg(0) Component arg0) throws Exception {
	}

	@OriginalMember(owner = "client!jq", name = "b", descriptor = "(I)V")
	public void method4699(@OriginalArg(0) int arg0) throws Exception {
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "([II)V")
	private void method4700(@OriginalArg(0) int[] arg0) {
		@Pc(1) short local1 = 256;
		if (Static128.aBoolean541) {
			local1 = 512;
		}
		Static682.method800(arg0, 0, local1);
		this.anInt5478 -= 256;
		if (this.aClass5_Sub16_6 != null && this.anInt5478 <= 0) {
			this.anInt5478 += Static608.anInt10099 >> 4;
			Static65.method1082(this.aClass5_Sub16_6);
			this.method4694(this.aClass5_Sub16_6.method8734(), this.aClass5_Sub16_6);
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
						@Pc(92) Class5_Sub16 local92 = null;
						@Pc(97) Class5_Sub16 local97 = this.aClass5_Sub16Array5[local58];
						label97: while (true) {
							while (true) {
								if (local97 == null) {
									break label97;
								}
								@Pc(101) Class5_Sub24 local101 = local97.aClass5_Sub24_6;
								if (local101 == null || local101.anInt7868 <= local63) {
									local97.aBoolean758 = true;
									@Pc(127) int local127 = local97.method8739();
									local47 += local127;
									if (local101 != null) {
										local101.anInt7868 += local127;
									}
									if (local47 >= this.anInt5463) {
										break label103;
									}
									@Pc(148) Class5_Sub16 local148 = local97.method8737();
									if (local148 != null) {
										@Pc(153) int local153 = local97.anInt10155;
										while (local148 != null) {
											this.method4694(local153 * local148.method8734() >> 8, local148);
											local148 = local97.method8735();
										}
									}
									@Pc(172) Class5_Sub16 local172 = local97.aClass5_Sub16_9;
									local97.aClass5_Sub16_9 = null;
									if (local92 == null) {
										this.aClass5_Sub16Array5[local58] = local172;
									} else {
										local92.aClass5_Sub16_9 = local172;
									}
									if (local172 == null) {
										this.aClass5_Sub16Array6[local58] = local92;
									}
									local97 = local172;
								} else {
									local49 |= 0x1 << local58;
									local92 = local97;
									local97 = local97.aClass5_Sub16_9;
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
				@Pc(218) Class5_Sub16 local218 = this.aClass5_Sub16Array5[local58];
				this.aClass5_Sub16Array5[local58] = this.aClass5_Sub16Array6[local58] = null;
				while (local218 != null) {
					@Pc(232) Class5_Sub16 local232 = local218.aClass5_Sub16_9;
					local218.aClass5_Sub16_9 = null;
					local218 = local232;
				}
			}
		}
		if (this.anInt5478 < 0) {
			this.anInt5478 = 0;
		}
		if (this.aClass5_Sub16_6 != null) {
			this.aClass5_Sub16_6.method8738(arg0, 0, 256);
		}
		this.aLong166 = Static515.method7499(100);
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(B)V")
	public final synchronized void method4703() {
		if (Static426.aClass271_1 != null) {
			@Pc(9) boolean local9 = true;
			for (@Pc(11) int local11 = 0; local11 < 2; local11++) {
				if (Static426.aClass271_1.aClass175Array1[local11] == this) {
					Static426.aClass271_1.aClass175Array1[local11] = null;
				}
				if (Static426.aClass271_1.aClass175Array1[local11] != null) {
					local9 = false;
				}
			}
			if (local9) {
				Static426.aClass271_1.aBoolean574 = true;
				while (Static426.aClass271_1.aBoolean572) {
					Static351.method5279(50L);
				}
				Static426.aClass271_1 = null;
			}
		}
		this.method4696();
		this.anIntArray305 = null;
		this.aBoolean421 = true;
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(BLclient!fq;)V")
	public final synchronized void method4704(@OriginalArg(1) Class5_Sub16 arg0) {
		this.aClass5_Sub16_6 = arg0;
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(I)V")
	public final synchronized void method4705() {
		if (this.aBoolean421) {
			return;
		}
		@Pc(13) long local13 = Static515.method7499(85);
		try {
			if (local13 > this.aLong166 + 6000L) {
				this.aLong166 = local13 - 6000L;
			}
			while (local13 > this.aLong166 + 5000L) {
				this.method4708();
				this.aLong166 += (long) (256000 / Static608.anInt10099);
				local13 = Static515.method7499(90);
			}
		} catch (@Pc(62) Exception local62) {
			this.aLong166 = local13;
		}
		if (this.anIntArray305 == null) {
			return;
		}
		try {
			if (this.aLong167 != 0L) {
				if (local13 < this.aLong167) {
					return;
				}
				this.method4699(this.anInt5482);
				this.aLong167 = 0L;
				this.aBoolean422 = true;
			}
			@Pc(103) int local103 = this.method4707();
			if (this.anInt5483 - local103 > this.anInt5480) {
				this.anInt5480 = this.anInt5483 - local103;
			}
			@Pc(127) int local127 = this.anInt5484 + this.anInt5481;
			if (local127 + 256 > 16384) {
				local127 = 16128;
			}
			if (local127 + 256 > this.anInt5482) {
				this.anInt5482 += 1024;
				if (this.anInt5482 > 16384) {
					this.anInt5482 = 16384;
				}
				this.method4696();
				local103 = 0;
				this.method4699(this.anInt5482);
				if (this.anInt5482 < local127 + 256) {
					local127 = this.anInt5482 - 256;
					this.anInt5481 = local127 - this.anInt5484;
				}
				this.aBoolean422 = true;
			}
			while (local103 < local127) {
				this.method4700(this.anIntArray305);
				local103 += 256;
				this.method4706();
			}
			if (local13 > this.aLong168) {
				if (this.aBoolean422) {
					this.aBoolean422 = false;
				} else if (this.anInt5480 == 0 && this.anInt5479 == 0) {
					this.method4696();
					this.aLong167 = local13 + 2000L;
					return;
				} else {
					this.anInt5481 = Math.min(this.anInt5479, this.anInt5480);
					this.anInt5479 = this.anInt5480;
				}
				this.aLong168 = local13 + 2000L;
				this.anInt5480 = 0;
			}
			this.anInt5483 = local103;
		} catch (@Pc(281) Exception local281) {
			this.method4696();
			this.aLong167 = local13 + 2000L;
		}
	}

	@OriginalMember(owner = "client!jq", name = "b", descriptor = "()V")
	protected void method4706() throws Exception {
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "()I")
	protected int method4707() throws Exception {
		return this.anInt5482;
	}

	@OriginalMember(owner = "client!jq", name = "b", descriptor = "(II)V")
	private void method4708() {
		this.anInt5478 -= 256;
		if (this.anInt5478 < 0) {
			this.anInt5478 = 0;
		}
		if (this.aClass5_Sub16_6 != null) {
			this.aClass5_Sub16_6.method8740(256);
		}
	}
}
