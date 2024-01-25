import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lba")
public class Class107 {

	@OriginalMember(owner = "client!lba", name = "e", descriptor = "[I")
	public int[] anIntArray471;

	@OriginalMember(owner = "client!lba", name = "a", descriptor = "Lclient!oga;")
	private Class3_Sub33 aClass3_Sub33_5;

	@OriginalMember(owner = "client!lba", name = "A", descriptor = "I")
	public int anInt6188;

	@OriginalMember(owner = "client!lba", name = "y", descriptor = "I")
	public int anInt6189;

	@OriginalMember(owner = "client!lba", name = "C", descriptor = "I")
	private int anInt6192;

	@OriginalMember(owner = "client!lba", name = "z", descriptor = "Z")
	private boolean aBoolean406 = false;

	@OriginalMember(owner = "client!lba", name = "b", descriptor = "I")
	private final int anInt6179 = 32;

	@OriginalMember(owner = "client!lba", name = "l", descriptor = "J")
	private long aLong210 = Static517.method6965();

	@OriginalMember(owner = "client!lba", name = "s", descriptor = "J")
	private long aLong211 = 0L;

	@OriginalMember(owner = "client!lba", name = "x", descriptor = "I")
	private int anInt6187 = 0;

	@OriginalMember(owner = "client!lba", name = "w", descriptor = "Z")
	private boolean aBoolean407 = true;

	@OriginalMember(owner = "client!lba", name = "n", descriptor = "[Lclient!oga;")
	private final Class3_Sub33[] aClass3_Sub33Array6 = new Class3_Sub33[8];

	@OriginalMember(owner = "client!lba", name = "D", descriptor = "[Lclient!oga;")
	private final Class3_Sub33[] aClass3_Sub33Array5 = new Class3_Sub33[8];

	@OriginalMember(owner = "client!lba", name = "k", descriptor = "I")
	private int anInt6186 = 0;

	@OriginalMember(owner = "client!lba", name = "o", descriptor = "J")
	private long aLong212 = 0L;

	@OriginalMember(owner = "client!lba", name = "B", descriptor = "I")
	private int anInt6190 = 0;

	@OriginalMember(owner = "client!lba", name = "u", descriptor = "I")
	private int anInt6185 = 0;

	@OriginalMember(owner = "client!lba", name = "a", descriptor = "(Ljava/awt/Component;)V")
	public void method5369(@OriginalArg(0) Component arg0) throws Exception {
	}

	@OriginalMember(owner = "client!lba", name = "a", descriptor = "(Z)V")
	public final synchronized void method5370() {
		if (this.aBoolean406) {
			return;
		}
		@Pc(13) long local13 = Static517.method6965();
		try {
			if (local13 > this.aLong210 + 6000L) {
				this.aLong210 = local13 - 6000L;
			}
			while (this.aLong210 + 5000L < local13) {
				this.method5382();
				this.aLong210 += (long) (256000 / Static330.anInt9773);
				local13 = Static517.method6965();
			}
		} catch (@Pc(62) Exception local62) {
			this.aLong210 = local13;
		}
		if (this.anIntArray471 == null) {
			return;
		}
		try {
			if (this.aLong212 != 0L) {
				if (this.aLong212 > local13) {
					return;
				}
				this.method5373(this.anInt6188);
				this.aLong212 = 0L;
				this.aBoolean407 = true;
			}
			@Pc(101) int local101 = this.method5376();
			if (this.anInt6186 < this.anInt6187 - local101) {
				this.anInt6186 = this.anInt6187 - local101;
			}
			@Pc(133) int local133 = this.anInt6189 + this.anInt6192;
			if (local133 + 256 > 16384) {
				local133 = 16128;
			}
			if (local133 + 256 > this.anInt6188) {
				this.anInt6188 += 1024;
				if (this.anInt6188 > 16384) {
					this.anInt6188 = 16384;
				}
				this.method5378();
				this.method5373(this.anInt6188);
				local101 = 0;
				if (local133 + 256 > this.anInt6188) {
					local133 = this.anInt6188 - 256;
					this.anInt6192 = local133 - this.anInt6189;
				}
				this.aBoolean407 = true;
			}
			while (local133 > local101) {
				this.method5372(this.anIntArray471);
				this.method5375();
				local101 += 256;
			}
			if (this.aLong211 < local13) {
				if (this.aBoolean407) {
					this.aBoolean407 = false;
				} else if (this.anInt6186 == 0 && this.anInt6185 == 0) {
					this.method5378();
					this.aLong212 = local13 + 2000L;
					return;
				} else {
					this.anInt6192 = Math.min(this.anInt6185, this.anInt6186);
					this.anInt6185 = this.anInt6186;
				}
				this.anInt6186 = 0;
				this.aLong211 = local13 + 2000L;
			}
			this.anInt6187 = local101;
		} catch (@Pc(277) Exception local277) {
			this.method5378();
			this.aLong212 = local13 + 2000L;
		}
	}

	@OriginalMember(owner = "client!lba", name = "a", descriptor = "(I)V")
	public final synchronized void method5371() {
		if (Static353.aClass274_1 != null) {
			@Pc(14) boolean local14 = true;
			for (@Pc(16) int local16 = 0; local16 < 2; local16++) {
				if (Static353.aClass274_1.aClass107Array1[local16] == this) {
					Static353.aClass274_1.aClass107Array1[local16] = null;
				}
				if (Static353.aClass274_1.aClass107Array1[local16] != null) {
					local14 = false;
				}
			}
			if (local14) {
				Static353.aClass274_1.aBoolean489 = true;
				while (Static353.aClass274_1.aBoolean488) {
					Static550.method7219(50L);
				}
				Static353.aClass274_1 = null;
			}
		}
		this.method5378();
		this.anIntArray471 = null;
		this.aBoolean406 = true;
	}

	@OriginalMember(owner = "client!lba", name = "a", descriptor = "([II)V")
	private void method5372(@OriginalArg(0) int[] arg0) {
		@Pc(1) short local1 = 256;
		if (Static330.aBoolean659) {
			local1 = 512;
		}
		Static732.method6318(arg0, 0, local1);
		this.anInt6190 -= 256;
		if (this.aClass3_Sub33_5 != null && this.anInt6190 <= 0) {
			this.anInt6190 += Static330.anInt9773 >> 4;
			Static220.method3262(this.aClass3_Sub33_5);
			this.method5374(this.aClass3_Sub33_5.method8707(), this.aClass3_Sub33_5);
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
						@Pc(92) Class3_Sub33 local92 = null;
						@Pc(97) Class3_Sub33 local97 = this.aClass3_Sub33Array6[local58];
						label97: while (true) {
							while (true) {
								if (local97 == null) {
									break label97;
								}
								@Pc(101) Class3_Sub34 local101 = local97.aClass3_Sub34_6;
								if (local101 == null || local101.anInt11124 <= local63) {
									local97.aBoolean681 = true;
									@Pc(127) int local127 = local97.method8705();
									local47 += local127;
									if (local101 != null) {
										local101.anInt11124 += local127;
									}
									if (local47 >= this.anInt6179) {
										break label103;
									}
									@Pc(148) Class3_Sub33 local148 = local97.method8706();
									if (local148 != null) {
										@Pc(153) int local153 = local97.anInt10231;
										while (local148 != null) {
											this.method5374(local153 * local148.method8707() >> 8, local148);
											local148 = local97.method8708();
										}
									}
									@Pc(172) Class3_Sub33 local172 = local97.aClass3_Sub33_9;
									local97.aClass3_Sub33_9 = null;
									if (local92 == null) {
										this.aClass3_Sub33Array6[local58] = local172;
									} else {
										local92.aClass3_Sub33_9 = local172;
									}
									if (local172 == null) {
										this.aClass3_Sub33Array5[local58] = local92;
									}
									local97 = local172;
								} else {
									local49 |= 0x1 << local58;
									local92 = local97;
									local97 = local97.aClass3_Sub33_9;
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
				@Pc(218) Class3_Sub33 local218 = this.aClass3_Sub33Array6[local58];
				this.aClass3_Sub33Array6[local58] = this.aClass3_Sub33Array5[local58] = null;
				while (local218 != null) {
					@Pc(232) Class3_Sub33 local232 = local218.aClass3_Sub33_9;
					local218.aClass3_Sub33_9 = null;
					local218 = local232;
				}
			}
		}
		if (this.anInt6190 < 0) {
			this.anInt6190 = 0;
		}
		if (this.aClass3_Sub33_5 != null) {
			this.aClass3_Sub33_5.method8709(arg0, 0, 256);
		}
		this.aLong210 = Static517.method6965();
	}

	@OriginalMember(owner = "client!lba", name = "c", descriptor = "(I)V")
	public void method5373(@OriginalArg(0) int arg0) throws Exception {
	}

	@OriginalMember(owner = "client!lba", name = "a", descriptor = "(IILclient!oga;)V")
	private void method5374(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub33 arg1) {
		@Pc(7) int local7 = arg0 >> 5;
		@Pc(12) Class3_Sub33 local12 = this.aClass3_Sub33Array5[local7];
		if (local12 == null) {
			this.aClass3_Sub33Array6[local7] = arg1;
		} else {
			local12.aClass3_Sub33_9 = arg1;
		}
		this.aClass3_Sub33Array5[local7] = arg1;
		arg1.anInt10231 = arg0;
	}

	@OriginalMember(owner = "client!lba", name = "d", descriptor = "()V")
	protected void method5375() throws Exception {
	}

	@OriginalMember(owner = "client!lba", name = "a", descriptor = "()I")
	protected int method5376() throws Exception {
		return this.anInt6188;
	}

	@OriginalMember(owner = "client!lba", name = "a", descriptor = "(BLclient!oga;)V")
	public final synchronized void method5377(@OriginalArg(1) Class3_Sub33 arg0) {
		this.aClass3_Sub33_5 = arg0;
	}

	@OriginalMember(owner = "client!lba", name = "c", descriptor = "()V")
	protected void method5378() {
	}

	@OriginalMember(owner = "client!lba", name = "b", descriptor = "()V")
	protected void method5379() throws Exception {
	}

	@OriginalMember(owner = "client!lba", name = "b", descriptor = "(I)V")
	public final synchronized void method5380() {
		this.aBoolean407 = true;
		try {
			this.method5379();
		} catch (@Pc(15) Exception local15) {
			this.method5378();
			this.aLong212 = Static517.method6965() + 2000L;
		}
	}

	@OriginalMember(owner = "client!lba", name = "a", descriptor = "(IB)V")
	private void method5382() {
		this.anInt6190 -= 256;
		if (this.anInt6190 < 0) {
			this.anInt6190 = 0;
		}
		if (this.aClass3_Sub33_5 != null) {
			this.aClass3_Sub33_5.method8710(256);
		}
	}
}
