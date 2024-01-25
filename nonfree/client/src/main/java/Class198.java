import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lq")
public final class Class198 {

	@OriginalMember(owner = "client!lq", name = "d", descriptor = "Z")
	public boolean aBoolean448 = true;

	@OriginalMember(owner = "client!lq", name = "i", descriptor = "I")
	private int anInt6438 = -1;

	@OriginalMember(owner = "client!lq", name = "l", descriptor = "Lclient!ln;")
	private final Class16_Sub1 aClass16_Sub1_13;

	@OriginalMember(owner = "client!lq", name = "e", descriptor = "I")
	private final int anInt6435;

	@OriginalMember(owner = "client!lq", name = "c", descriptor = "I")
	private final int anInt6434;

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "Lclient!nw;")
	private final Class231 aClass231_1;

	@OriginalMember(owner = "client!lq", name = "h", descriptor = "I")
	private int anInt6437;

	@OriginalMember(owner = "client!lq", name = "b", descriptor = "I")
	private int anInt6433;

	@OriginalMember(owner = "client!lq", name = "g", descriptor = "Lclient!kga;")
	private Interface13 anInterface13_6;

	@OriginalMember(owner = "client!lq", name = "f", descriptor = "I")
	public final int anInt6436;

	@OriginalMember(owner = "client!lq", name = "p", descriptor = "Lclient!oq;")
	private Interface20 anInterface20_3;

	@OriginalMember(owner = "client!lq", name = "<init>", descriptor = "(Lclient!ln;Lclient!nw;Lclient!um;IIIII)V")
	public Class198(@OriginalArg(0) Class16_Sub1 arg0, @OriginalArg(1) Class231 arg1, @OriginalArg(2) Class86_Sub3 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.aClass16_Sub1_13 = arg0;
		this.anInt6435 = arg7;
		this.anInt6434 = arg6;
		this.aClass231_1 = arg1;
		@Pc(25) int local25 = 0x1 << arg5;
		@Pc(27) int local27 = 0;
		@Pc(31) int local31 = arg3 << arg5;
		@Pc(35) int local35 = arg4 << arg5;
		@Pc(48) int local48;
		for (@Pc(37) int local37 = 0; local37 < local25; local37++) {
			local48 = arg2.anInt9955 * (local37 + local35) + local31;
			for (@Pc(50) int local50 = 0; local50 < local25; local50++) {
				@Pc(58) short[] local58 = arg2.aShortArrayArray12[local48++];
				if (local58 != null) {
					local27 += local58.length;
				}
			}
		}
		if (local27 <= 0) {
			this.anInterface20_3 = null;
			this.anInt6436 = 0;
		} else {
			this.anInt6437 = Integer.MAX_VALUE;
			this.anInt6433 = Integer.MIN_VALUE;
			this.anInterface13_6 = this.aClass16_Sub1_13.method3917(false);
			this.anInterface13_6.method6500(local27);
			for (local48 = 0; local48 < 4; local48++) {
				@Pc(106) Buffer local106 = this.anInterface13_6.method4654();
				if (local106 != null) {
					@Pc(114) Stream local114 = this.aClass16_Sub1_13.method3981(local106);
					@Pc(118) int local118;
					@Pc(129) int local129;
					@Pc(131) int local131;
					@Pc(139) short[] local139;
					@Pc(143) int local143;
					@Pc(151) int local151;
					if (Stream.c()) {
						for (local118 = 0; local118 < local25; local118++) {
							local129 = local31 + (local35 + local118) * arg2.anInt9955;
							for (local131 = 0; local131 < local25; local131++) {
								local139 = arg2.aShortArrayArray12[local129++];
								if (local139 != null) {
									for (local143 = 0; local143 < local139.length; local143++) {
										local151 = local139[local143] & 0xFFFF;
										if (local151 > this.anInt6433) {
											this.anInt6433 = local151;
										}
										if (this.anInt6437 > local151) {
											this.anInt6437 = local151;
										}
										local114.f(local151);
									}
								}
							}
						}
					} else {
						for (local118 = 0; local118 < local25; local118++) {
							local129 = arg2.anInt9955 * (local118 + local35) + local31;
							for (local131 = 0; local131 < local25; local131++) {
								local139 = arg2.aShortArrayArray12[local129++];
								if (local139 != null) {
									for (local143 = 0; local143 < local139.length; local143++) {
										local151 = local139[local143] & 0xFFFF;
										if (local151 < this.anInt6437) {
											this.anInt6437 = local151;
										}
										if (this.anInt6433 < local151) {
											this.anInt6433 = local151;
										}
										local114.c(local151);
									}
								}
							}
						}
					}
					local114.b();
					if (this.anInterface13_6.method4655()) {
						break;
					}
				}
			}
			this.anInt6436 = local27 / 3;
		}
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(IILclient!kga;)V")
	public void method5224(@OriginalArg(1) int arg0, @OriginalArg(2) Interface13 arg1) {
		if (arg0 > 0) {
			this.method5227();
			this.aClass16_Sub1_13.method3889(this.anInterface20_3);
			this.aClass16_Sub1_13.method3977(Static525.aClass342_3, arg1, this.anInt6437, arg0, 0, this.anInt6433 + 1 - this.anInt6437);
		}
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(I)V")
	public void method5226() {
		this.method5224(this.anInt6436, this.anInterface13_6);
	}

	@OriginalMember(owner = "client!lq", name = "b", descriptor = "(B)V")
	private void method5227() {
		if (!this.aBoolean448) {
			return;
		}
		this.aBoolean448 = false;
		@Pc(16) byte[] local16 = this.aClass231_1.aByteArray55;
		@Pc(18) int local18 = 0;
		@Pc(22) int local22 = this.aClass231_1.anInt7395;
		@Pc(33) int local33 = this.anInt6434 + this.aClass231_1.anInt7395 * this.anInt6435;
		@Pc(54) int local54;
		for (@Pc(35) int local35 = -128; local35 < 0; local35++) {
			local18 = (local18 << 8) - local18;
			for (local54 = -128; local54 < 0; local54++) {
				if (local16[local33++] != 0) {
					local18++;
				}
			}
			local33 += local22 - 128;
		}
		if (this.anInterface20_3 != null && this.anInt6438 == local18) {
			this.aBoolean448 = false;
			return;
		}
		this.anInt6438 = local18;
		local54 = 0;
		local33 = local22 * this.anInt6435 + this.anInt6434;
		@Pc(117) int local117;
		@Pc(121) int local121;
		@Pc(132) int local132;
		if (!this.aClass16_Sub1_13.method3874(Static526.aClass366_11, Static258.aClass160_9)) {
			if (Static321.anIntArray366 == null) {
				Static321.anIntArray366 = new int[16384];
			}
			@Pc(115) int[] local115 = Static321.anIntArray366;
			for (local117 = -128; local117 < 0; local117++) {
				for (local121 = -128; local121 < 0; local121++) {
					if (local16[local33] == 0) {
						local132 = 0;
						if (local16[local33 - 1] != 0) {
							local132++;
						}
						if (local16[local33 + 1] != 0) {
							local132++;
						}
						if (local16[local33 - local22] != 0) {
							local132++;
						}
						if (local16[local33 + local22] != 0) {
							local132++;
						}
						local115[local54++] = local132 * 17 << 24;
					} else {
						local115[local54++] = 1140850688;
					}
					local33++;
				}
				local33 += this.aClass231_1.anInt7395 - 128;
			}
			if (this.anInterface20_3 == null) {
				this.anInterface20_3 = this.aClass16_Sub1_13.method3948(Static321.anIntArray366, 128, 128, false);
				this.anInterface20_3.method6623(false, false);
			} else {
				this.anInterface20_3.method6629(128, 128, 0, Static321.anIntArray366, 0, 128);
			}
			return;
		}
		if (Static464.aByteArray78 == null) {
			Static464.aByteArray78 = new byte[16384];
		}
		@Pc(238) byte[] local238 = Static464.aByteArray78;
		for (local117 = -128; local117 < 0; local117++) {
			for (local121 = -128; local121 < 0; local121++) {
				if (local16[local33] == 0) {
					local132 = 0;
					if (local16[local33 - 1] != 0) {
						local132++;
					}
					if (local16[local33 + 1] != 0) {
						local132++;
					}
					if (local16[local33 - local22] != 0) {
						local132++;
					}
					if (local16[local33 + local22] != 0) {
						local132++;
					}
					local238[local54++] = (byte) (local132 * 17);
				} else {
					local238[local54++] = 68;
				}
				local33++;
			}
			local33 += this.aClass231_1.anInt7395 - 128;
		}
		if (this.anInterface20_3 == null) {
			this.anInterface20_3 = this.aClass16_Sub1_13.method4005(Static464.aByteArray78, Static526.aClass366_11, 128, 128, false);
			this.anInterface20_3.method6623(false, false);
		} else {
			this.anInterface20_3.method6631(128, 128, Static464.aByteArray78, 128, Static526.aClass366_11);
		}
	}
}
