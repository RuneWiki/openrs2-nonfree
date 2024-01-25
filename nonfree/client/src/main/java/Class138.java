import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gb")
public final class Class138 {

	@OriginalMember(owner = "client!gb", name = "f", descriptor = "I")
	private int anInt3069 = -1;

	@OriginalMember(owner = "client!gb", name = "i", descriptor = "Z")
	public boolean aBoolean253 = true;

	@OriginalMember(owner = "client!gb", name = "l", descriptor = "Lclient!waa;")
	private final Class377 aClass377_1;

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "I")
	private final int anInt3074;

	@OriginalMember(owner = "client!gb", name = "m", descriptor = "I")
	private final int anInt3068;

	@OriginalMember(owner = "client!gb", name = "e", descriptor = "Lclient!kd;")
	private final Class57_Sub3 aClass57_Sub3_6;

	@OriginalMember(owner = "client!gb", name = "n", descriptor = "I")
	private int anInt3072;

	@OriginalMember(owner = "client!gb", name = "c", descriptor = "I")
	private int anInt3070;

	@OriginalMember(owner = "client!gb", name = "p", descriptor = "Lclient!je;")
	private Interface9 anInterface9_1;

	@OriginalMember(owner = "client!gb", name = "h", descriptor = "I")
	public final int anInt3075;

	@OriginalMember(owner = "client!gb", name = "k", descriptor = "Lclient!wp;")
	private Interface26 anInterface26_1;

	@OriginalMember(owner = "client!gb", name = "<init>", descriptor = "(Lclient!kd;Lclient!waa;Lclient!im;IIIII)V")
	public Class138(@OriginalArg(0) Class57_Sub3 arg0, @OriginalArg(1) Class377 arg1, @OriginalArg(2) Class22_Sub2 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.aClass377_1 = arg1;
		this.anInt3074 = arg6;
		this.anInt3068 = arg7;
		this.aClass57_Sub3_6 = arg0;
		@Pc(25) int local25 = 0x1 << arg5;
		@Pc(27) int local27 = 0;
		@Pc(31) int local31 = arg3 << arg5;
		@Pc(35) int local35 = arg4 << arg5;
		@Pc(51) int local51;
		for (@Pc(37) int local37 = 0; local37 < local25; local37++) {
			local51 = (local35 + local37) * arg2.anInt9376 + local31;
			for (@Pc(53) int local53 = 0; local53 < local25; local53++) {
				@Pc(61) short[] local61 = arg2.aShortArrayArray5[local51++];
				if (local61 != null) {
					local27 += local61.length;
				}
			}
		}
		if (local27 <= 0) {
			this.anInterface26_1 = null;
			this.anInt3075 = 0;
		} else {
			this.anInt3072 = Integer.MIN_VALUE;
			this.anInt3070 = Integer.MAX_VALUE;
			this.anInterface9_1 = this.aClass57_Sub3_6.method7762(false);
			this.anInterface9_1.method2925(local27);
			for (local51 = 0; local51 < 4; local51++) {
				@Pc(125) Buffer local125 = this.anInterface9_1.method2926();
				if (local125 != null) {
					@Pc(133) Stream local133 = this.aClass57_Sub3_6.method7826(local125);
					@Pc(137) int local137;
					@Pc(150) int local150;
					@Pc(152) int local152;
					@Pc(160) short[] local160;
					@Pc(164) int local164;
					@Pc(172) int local172;
					if (Stream.b()) {
						for (local137 = 0; local137 < local25; local137++) {
							local150 = arg2.anInt9376 * (local137 + local35) + local31;
							for (local152 = 0; local152 < local25; local152++) {
								local160 = arg2.aShortArrayArray5[local150++];
								if (local160 != null) {
									for (local164 = 0; local164 < local160.length; local164++) {
										local172 = local160[local164] & 0xFFFF;
										if (local172 > this.anInt3072) {
											this.anInt3072 = local172;
										}
										if (local172 < this.anInt3070) {
											this.anInt3070 = local172;
										}
										local133.d(local172);
									}
								}
							}
						}
					} else {
						for (local137 = 0; local137 < local25; local137++) {
							local150 = (local35 + local137) * arg2.anInt9376 + local31;
							for (local152 = 0; local152 < local25; local152++) {
								local160 = arg2.aShortArrayArray5[local150++];
								if (local160 != null) {
									for (local164 = 0; local164 < local160.length; local164++) {
										local172 = local160[local164] & 0xFFFF;
										if (this.anInt3072 < local172) {
											this.anInt3072 = local172;
										}
										if (this.anInt3070 > local172) {
											this.anInt3070 = local172;
										}
										local133.c(local172);
									}
								}
							}
						}
					}
					local133.c();
					if (this.anInterface9_1.method2927()) {
						break;
					}
				}
			}
			this.anInt3075 = local27 / 3;
		}
	}

	@OriginalMember(owner = "client!gb", name = "b", descriptor = "(I)V")
	public void method2694() {
		this.method2696(this.anInt3075, this.anInterface9_1);
	}

	@OriginalMember(owner = "client!gb", name = "c", descriptor = "(I)V")
	private void method2695() {
		if (!this.aBoolean253) {
			return;
		}
		this.aBoolean253 = false;
		@Pc(25) byte[] local25 = this.aClass377_1.aByteArray106;
		@Pc(27) int local27 = 0;
		@Pc(31) int local31 = this.aClass377_1.anInt10535;
		@Pc(42) int local42 = this.anInt3074 + this.aClass377_1.anInt10535 * this.anInt3068;
		@Pc(55) int local55;
		for (@Pc(44) int local44 = -128; local44 < 0; local44++) {
			local27 = (local27 << 8) - local27;
			for (local55 = -128; local55 < 0; local55++) {
				if (local25[local42++] != 0) {
					local27++;
				}
			}
			local42 += local31 - 128;
		}
		if (this.anInterface26_1 != null && local27 == this.anInt3069) {
			this.aBoolean253 = false;
			return;
		}
		this.anInt3069 = local27;
		local42 = this.anInt3074 + this.anInt3068 * local31;
		local55 = 0;
		@Pc(139) int local139;
		@Pc(143) int local143;
		@Pc(153) int local153;
		if (!this.aClass57_Sub3_6.method7844(Static453.aClass278_13, Static78.aClass114_19)) {
			if (Static626.anIntArray568 == null) {
				Static626.anIntArray568 = new int[16384];
			}
			@Pc(277) int[] local277 = Static626.anIntArray568;
			for (local139 = -128; local139 < 0; local139++) {
				for (local143 = -128; local143 < 0; local143++) {
					if (local25[local42] == 0) {
						local153 = 0;
						if (local25[local42 - 1] != 0) {
							local153++;
						}
						if (local25[local42 + 1] != 0) {
							local153++;
						}
						if (local25[local42 - local31] != 0) {
							local153++;
						}
						if (local25[local42 + local31] != 0) {
							local153++;
						}
						local277[local55++] = local153 * 17 << 24;
					} else {
						local277[local55++] = 1140850688;
					}
					local42++;
				}
				local42 += this.aClass377_1.anInt10535 - 128;
			}
			if (this.anInterface26_1 == null) {
				this.anInterface26_1 = this.aClass57_Sub3_6.method7787(Static626.anIntArray568, 128, 128, false);
				this.anInterface26_1.method4348(false, false);
			} else {
				this.anInterface26_1.method4351(Static626.anIntArray568, 128, 0, 0, 128, 128);
			}
			return;
		}
		if (Static588.aByteArray99 == null) {
			Static588.aByteArray99 = new byte[16384];
		}
		@Pc(137) byte[] local137 = Static588.aByteArray99;
		for (local139 = -128; local139 < 0; local139++) {
			for (local143 = -128; local143 < 0; local143++) {
				if (local25[local42] == 0) {
					local153 = 0;
					if (local25[local42 - 1] != 0) {
						local153++;
					}
					if (local25[local42 + 1] != 0) {
						local153++;
					}
					if (local25[local42 - local31] != 0) {
						local153++;
					}
					if (local25[local42 + local31] != 0) {
						local153++;
					}
					local137[local55++] = (byte) (local153 * 17);
				} else {
					local137[local55++] = 68;
				}
				local42++;
			}
			local42 += this.aClass377_1.anInt10535 - 128;
		}
		if (this.anInterface26_1 == null) {
			this.anInterface26_1 = this.aClass57_Sub3_6.method7788(false, Static78.aClass114_19, 128, Static588.aByteArray99, 128);
			this.anInterface26_1.method4348(false, false);
		} else {
			this.anInterface26_1.method4354(128, Static588.aByteArray99, 128, 128, Static78.aClass114_19);
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IBLclient!je;)V")
	public void method2696(@OriginalArg(0) int arg0, @OriginalArg(2) Interface9 arg1) {
		if (arg0 > 0) {
			this.method2695();
			this.aClass57_Sub3_6.method7813(this.anInterface26_1);
			this.aClass57_Sub3_6.method7814(this.anInt3072 + 1 - this.anInt3070, arg1, this.anInt3070, 0, Static175.aClass85_1, arg0);
		}
	}
}
